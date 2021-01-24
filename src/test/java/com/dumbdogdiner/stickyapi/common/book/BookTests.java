/*
 * Copyright (c) 2020-2021 DumbDogDiner <dumbdogdiner.com>. All rights reserved.
 * Licensed under the MIT license, see LICENSE for more information...
 */
package com.dumbdogdiner.stickyapi.common.book;

import com.dumbdogdiner.stickyapi.common.book.chat.JsonComponent;
import com.dumbdogdiner.stickyapi.common.book.commonmarkextensions.JsonComponentWriter;
import com.dumbdogdiner.stickyapi.common.book.commonmarkextensions.MCFormatExtension;
import com.dumbdogdiner.stickyapi.common.book.commonmarkextensions.MarkdownJsonRenderer;
import com.dumbdogdiner.stickyapi.common.util.BookUtil;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import lombok.SneakyThrows;
import org.commonmark.node.Document;
import org.commonmark.parser.Parser;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

public class BookTests {
    private static final String BOOK_FILENAME = "/rulebook.md";
    private static Reader bookReader;
    private static Gson G;
    @BeforeAll
    static void setUp(){
        bookReader = new InputStreamReader(BookTests.class.getResourceAsStream(BOOK_FILENAME));
        G = new GsonBuilder()/*.setPrettyPrinting()*/.create();
    }


    @AfterAll
    static void tearDown() throws IOException {
        bookReader.close();
        G = null;
        System.gc();
    }

    @SneakyThrows
    @Test
    public void testParser() {
        Parser.Builder parserBuilder = Parser.builder();
        MCFormatExtension.create().extend(parserBuilder);
        Parser cmParser = parserBuilder.build();
        List<Document> sections = BookUtil.splitDocumentByBreaks((Document)cmParser.parseReader(bookReader));
        JsonArray pages = new JsonArray();
        sections.stream()
                .map(section -> BookUtil.splitBookPages(renderDocument(section)))
                .flatMap(List::stream)
                .forEach(page -> pages.add(page.toJson()));

        System.out.println(G.toJson(pages));
    }


    private JsonComponent renderDocument(Document section) {
        JsonComponent component = new JsonComponent();
        JsonComponentWriter writer = new JsonComponentWriter(component);
        new MarkdownJsonRenderer(writer).render(section);
        return component;
    }

}