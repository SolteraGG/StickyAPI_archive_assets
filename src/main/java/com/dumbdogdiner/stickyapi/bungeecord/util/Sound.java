/**
 * Copyright (c) 2020 DumbDogDiner <dumbdogdiner.com>. All rights reserved.
 * Licensed under the MIT license, see LICENSE for more information...
 */
package com.dumbdogdiner.stickyapi.bungeecord.util;

import lombok.Getter;

/**
 * An Enum of Sounds the server is able to send to players.
 * <p>
 * These values are subject to change on every new major Minecraft release
 */
public enum Sound {

    AMBIENT_BASALT_DELTAS_ADDITIONS(1),
    AMBIENT_BASALT_DELTAS_LOOP(2),
    AMBIENT_BASALT_DELTAS_MOOD(3),
    AMBIENT_CAVE(0),
    AMBIENT_CRIMSON_FOREST_ADDITIONS(4),
    AMBIENT_CRIMSON_FOREST_LOOP(5),
    AMBIENT_CRIMSON_FOREST_MOOD(6),
    AMBIENT_NETHER_WASTES_ADDITIONS(7),
    AMBIENT_NETHER_WASTES_LOOP(8),
    AMBIENT_NETHER_WASTES_MOOD(9),
    AMBIENT_SOUL_SAND_VALLEY_ADDITIONS(10),
    AMBIENT_SOUL_SAND_VALLEY_LOOP(11),
    AMBIENT_SOUL_SAND_VALLEY_MOOD(12),
    AMBIENT_UNDERWATER_ENTER(16),
    AMBIENT_UNDERWATER_EXIT(17),
    AMBIENT_UNDERWATER_LOOP(18),
    AMBIENT_UNDERWATER_LOOP_ADDITIONS(19),
    AMBIENT_UNDERWATER_LOOP_ADDITIONS_RARE(20),
    AMBIENT_UNDERWATER_LOOP_ADDITIONS_ULTRA_RARE(21),
    AMBIENT_WARPED_FOREST_ADDITIONS(13),
    AMBIENT_WARPED_FOREST_LOOP(14),
    AMBIENT_WARPED_FOREST_MOOD(15),
    BLOCK_ANCIENT_DEBRIS_BREAK(22),
    BLOCK_ANCIENT_DEBRIS_FALL(26),
    BLOCK_ANCIENT_DEBRIS_HIT(25),
    BLOCK_ANCIENT_DEBRIS_PLACE(24),
    BLOCK_ANCIENT_DEBRIS_STEP(23),
    BLOCK_ANVIL_BREAK(27),
    BLOCK_ANVIL_DESTROY(28),
    BLOCK_ANVIL_FALL(29),
    BLOCK_ANVIL_HIT(30),
    BLOCK_ANVIL_LAND(31),
    BLOCK_ANVIL_PLACE(32),
    BLOCK_ANVIL_STEP(33),
    BLOCK_ANVIL_USE(34),
    BLOCK_BAMBOO_BREAK(52),
    BLOCK_BAMBOO_FALL(53),
    BLOCK_BAMBOO_HIT(54),
    BLOCK_BAMBOO_PLACE(55),
    BLOCK_BAMBOO_STEP(56),
    BLOCK_BAMBOO_SAPLING_BREAK(57),
    BLOCK_BAMBOO_SAPLING_HIT(58),
    BLOCK_BAMBOO_SAPLING_PLACE(59),
    BLOCK_BARREL_CLOSE(60),
    BLOCK_BARREL_OPEN(61),
    BLOCK_BASALT_BREAK(62),
    BLOCK_BASALT_FALL(66),
    BLOCK_BASALT_HIT(65),
    BLOCK_BASALT_PLACE(64),
    BLOCK_BASALT_STEP(63),
    BLOCK_BEACON_ACTIVATE(72),
    BLOCK_BEACON_AMBIENT(73),
    BLOCK_BEACON_DEACTIVATE(74),
    BLOCK_BEACON_POWER_SELECT(75),
    BLOCK_BEEHIVE_DRIP(82),
    BLOCK_BEEHIVE_ENTER(83),
    BLOCK_BEEHIVE_EXIT(84),
    BLOCK_BEEHIVE_SHEAR(85),
    BLOCK_BEEHIVE_WORK(86),
    BLOCK_BELL_RESONATE(88),
    BLOCK_BELL_USE(87),
    BLOCK_BLASTFURNACE_FIRE_CRACKLE(103),
    BLOCK_BONE_BLOCK_BREAK(96),
    BLOCK_BONE_BLOCK_FALL(97),
    BLOCK_BONE_BLOCK_HIT(98),
    BLOCK_BONE_BLOCK_PLACE(99),
    BLOCK_BONE_BLOCK_STEP(100),
    BLOCK_BREWING_STAND_BREW(107),
    BLOCK_BUBBLE_COLUMN_BUBBLE_POP(108),
    BLOCK_BUBBLE_COLUMN_UPWARDS_AMBIENT(109),
    BLOCK_BUBBLE_COLUMN_UPWARDS_INSIDE(110),
    BLOCK_BUBBLE_COLUMN_WHIRLPOOL_AMBIENT(111),
    BLOCK_BUBBLE_COLUMN_WHIRLPOOL_INSIDE(112),
    BLOCK_CAMPFIRE_CRACKLE(119),
    BLOCK_CHAIN_BREAK(129),
    BLOCK_CHAIN_FALL(130),
    BLOCK_CHAIN_HIT(131),
    BLOCK_CHAIN_PLACE(132),
    BLOCK_CHAIN_STEP(133),
    BLOCK_CHEST_CLOSE(134),
    BLOCK_CHEST_LOCKED(135),
    BLOCK_CHEST_OPEN(136),
    BLOCK_CHORUS_FLOWER_DEATH(142),
    BLOCK_CHORUS_FLOWER_GROW(143),
    BLOCK_COMPARATOR_CLICK(149),
    BLOCK_COMPOSTER_EMPTY(150),
    BLOCK_COMPOSTER_FILL(151),
    BLOCK_COMPOSTER_FILL_SUCCESS(152),
    BLOCK_COMPOSTER_READY(153),
    BLOCK_CONDUIT_ACTIVATE(154),
    BLOCK_CONDUIT_AMBIENT(155),
    BLOCK_CONDUIT_AMBIENT_SHORT(156),
    BLOCK_CONDUIT_ATTACK_TARGET(157),
    BLOCK_CONDUIT_DEACTIVATE(158),
    BLOCK_CORAL_BLOCK_BREAK(159),
    BLOCK_CORAL_BLOCK_FALL(160),
    BLOCK_CORAL_BLOCK_HIT(161),
    BLOCK_CORAL_BLOCK_PLACE(162),
    BLOCK_CORAL_BLOCK_STEP(163),
    BLOCK_CROP_BREAK(172),
    BLOCK_DISPENSER_DISPENSE(182),
    BLOCK_DISPENSER_FAIL(183),
    BLOCK_DISPENSER_LAUNCH(184),
    BLOCK_ENCHANTMENT_TABLE_USE(220),
    BLOCK_END_GATEWAY_SPAWN(243),
    BLOCK_END_PORTAL_SPAWN(245),
    BLOCK_END_PORTAL_FRAME_FILL(244),
    BLOCK_ENDER_CHEST_CLOSE(221),
    BLOCK_ENDER_CHEST_OPEN(222),
    BLOCK_FENCE_GATE_CLOSE(257),
    BLOCK_FENCE_GATE_OPEN(258),
    BLOCK_FIRE_AMBIENT(268),
    BLOCK_FIRE_EXTINGUISH(269),
    BLOCK_FUNGUS_BREAK(510),
    BLOCK_FUNGUS_FALL(514),
    BLOCK_FUNGUS_HIT(513),
    BLOCK_FUNGUS_PLACE(512),
    BLOCK_FUNGUS_STEP(511),
    BLOCK_FURNACE_FIRE_CRACKLE(291),
    BLOCK_GILDED_BLACKSTONE_BREAK(309),
    BLOCK_GILDED_BLACKSTONE_FALL(310),
    BLOCK_GILDED_BLACKSTONE_HIT(311),
    BLOCK_GILDED_BLACKSTONE_PLACE(312),
    BLOCK_GILDED_BLACKSTONE_STEP(313),
    BLOCK_GLASS_BREAK(314),
    BLOCK_GLASS_FALL(315),
    BLOCK_GLASS_HIT(316),
    BLOCK_GLASS_PLACE(317),
    BLOCK_GLASS_STEP(318),
    BLOCK_GRASS_BREAK(319),
    BLOCK_GRASS_FALL(320),
    BLOCK_GRASS_HIT(321),
    BLOCK_GRASS_PLACE(322),
    BLOCK_GRASS_STEP(323),
    BLOCK_GRAVEL_BREAK(324),
    BLOCK_GRAVEL_FALL(325),
    BLOCK_GRAVEL_HIT(326),
    BLOCK_GRAVEL_PLACE(327),
    BLOCK_GRAVEL_STEP(328),
    BLOCK_GRINDSTONE_USE(329),
    BLOCK_HONEY_BLOCK_BREAK(347),
    BLOCK_HONEY_BLOCK_FALL(348),
    BLOCK_HONEY_BLOCK_HIT(349),
    BLOCK_HONEY_BLOCK_PLACE(350),
    BLOCK_HONEY_BLOCK_SLIDE(351),
    BLOCK_HONEY_BLOCK_STEP(352),
    BLOCK_IRON_DOOR_CLOSE(385),
    BLOCK_IRON_DOOR_OPEN(386),
    BLOCK_IRON_TRAPDOOR_CLOSE(393),
    BLOCK_IRON_TRAPDOOR_OPEN(394),
    BLOCK_LADDER_BREAK(402),
    BLOCK_LADDER_FALL(403),
    BLOCK_LADDER_HIT(404),
    BLOCK_LADDER_PLACE(405),
    BLOCK_LADDER_STEP(406),
    BLOCK_LANTERN_BREAK(407),
    BLOCK_LANTERN_FALL(408),
    BLOCK_LANTERN_HIT(409),
    BLOCK_LANTERN_PLACE(410),
    BLOCK_LANTERN_STEP(411),
    BLOCK_LAVA_AMBIENT(412),
    BLOCK_LAVA_EXTINGUISH(413),
    BLOCK_LAVA_POP(414),
    BLOCK_LEVER_CLICK(417),
    BLOCK_LILY_PAD_PLACE(894),
    BLOCK_LODESTONE_BREAK(431),
    BLOCK_LODESTONE_FALL(435),
    BLOCK_LODESTONE_HIT(434),
    BLOCK_LODESTONE_PLACE(433),
    BLOCK_LODESTONE_STEP(432),
    BLOCK_METAL_BREAK(443),
    BLOCK_METAL_FALL(444),
    BLOCK_METAL_HIT(445),
    BLOCK_METAL_PLACE(446),
    BLOCK_METAL_STEP(449),
    BLOCK_METAL_PRESSURE_PLATE_CLICK_OFF(447),
    BLOCK_METAL_PRESSURE_PLATE_CLICK_ON(448),
    BLOCK_NETHER_BRICKS_BREAK(488),
    BLOCK_NETHER_BRICKS_FALL(492),
    BLOCK_NETHER_BRICKS_HIT(491),
    BLOCK_NETHER_BRICKS_PLACE(490),
    BLOCK_NETHER_BRICKS_STEP(489),
    BLOCK_NETHER_GOLD_ORE_BREAK(681),
    BLOCK_NETHER_GOLD_ORE_FALL(682),
    BLOCK_NETHER_GOLD_ORE_HIT(683),
    BLOCK_NETHER_GOLD_ORE_PLACE(684),
    BLOCK_NETHER_GOLD_ORE_STEP(685),
    BLOCK_NETHER_ORE_BREAK(686),
    BLOCK_NETHER_ORE_FALL(687),
    BLOCK_NETHER_ORE_HIT(688),
    BLOCK_NETHER_ORE_PLACE(689),
    BLOCK_NETHER_ORE_STEP(690),
    BLOCK_NETHER_SPROUTS_BREAK(505),
    BLOCK_NETHER_SPROUTS_FALL(509),
    BLOCK_NETHER_SPROUTS_HIT(508),
    BLOCK_NETHER_SPROUTS_PLACE(507),
    BLOCK_NETHER_SPROUTS_STEP(506),
    BLOCK_NETHER_WART_BREAK(493),
    BLOCK_NETHERITE_BLOCK_BREAK(525),
    BLOCK_NETHERITE_BLOCK_FALL(529),
    BLOCK_NETHERITE_BLOCK_HIT(528),
    BLOCK_NETHERITE_BLOCK_PLACE(527),
    BLOCK_NETHERITE_BLOCK_STEP(526),
    BLOCK_NETHERRACK_BREAK(530),
    BLOCK_NETHERRACK_FALL(534),
    BLOCK_NETHERRACK_HIT(533),
    BLOCK_NETHERRACK_PLACE(532),
    BLOCK_NETHERRACK_STEP(531),
    BLOCK_NOTE_BLOCK_BANJO(550),
    BLOCK_NOTE_BLOCK_BASEDRUM(535),
    BLOCK_NOTE_BLOCK_BASS(536),
    BLOCK_NOTE_BLOCK_BELL(537),
    BLOCK_NOTE_BLOCK_BIT(549),
    BLOCK_NOTE_BLOCK_CHIME(538),
    BLOCK_NOTE_BLOCK_COW_BELL(547),
    BLOCK_NOTE_BLOCK_DIDGERIDOO(548),
    BLOCK_NOTE_BLOCK_FLUTE(539),
    BLOCK_NOTE_BLOCK_GUITAR(540),
    BLOCK_NOTE_BLOCK_HARP(541),
    BLOCK_NOTE_BLOCK_HAT(542),
    BLOCK_NOTE_BLOCK_IRON_XYLOPHONE(546),
    BLOCK_NOTE_BLOCK_PLING(543),
    BLOCK_NOTE_BLOCK_SNARE(544),
    BLOCK_NOTE_BLOCK_XYLOPHONE(545),
    BLOCK_NYLIUM_BREAK(500),
    BLOCK_NYLIUM_FALL(504),
    BLOCK_NYLIUM_HIT(503),
    BLOCK_NYLIUM_PLACE(502),
    BLOCK_NYLIUM_STEP(501),
    BLOCK_PISTON_CONTRACT(629),
    BLOCK_PISTON_EXTEND(630),
    BLOCK_PORTAL_AMBIENT(656),
    BLOCK_PORTAL_TRAVEL(657),
    BLOCK_PORTAL_TRIGGER(658),
    BLOCK_PUMPKIN_CARVE(666),
    BLOCK_REDSTONE_TORCH_BURNOUT(691),
    BLOCK_RESPAWN_ANCHOR_AMBIENT(692),
    BLOCK_RESPAWN_ANCHOR_CHARGE(693),
    BLOCK_RESPAWN_ANCHOR_DEPLETE(694),
    BLOCK_RESPAWN_ANCHOR_SET_SPAWN(695),
    BLOCK_ROOTS_BREAK(286),
    BLOCK_ROOTS_FALL(290),
    BLOCK_ROOTS_HIT(289),
    BLOCK_ROOTS_PLACE(288),
    BLOCK_ROOTS_STEP(287),
    BLOCK_SAND_BREAK(700),
    BLOCK_SAND_FALL(701),
    BLOCK_SAND_HIT(702),
    BLOCK_SAND_PLACE(703),
    BLOCK_SAND_STEP(704),
    BLOCK_SCAFFOLDING_BREAK(705),
    BLOCK_SCAFFOLDING_FALL(706),
    BLOCK_SCAFFOLDING_HIT(707),
    BLOCK_SCAFFOLDING_PLACE(708),
    BLOCK_SCAFFOLDING_STEP(709),
    BLOCK_SHROOMLIGHT_BREAK(717),
    BLOCK_SHROOMLIGHT_FALL(721),
    BLOCK_SHROOMLIGHT_HIT(720),
    BLOCK_SHROOMLIGHT_PLACE(719),
    BLOCK_SHROOMLIGHT_STEP(718),
    BLOCK_SHULKER_BOX_CLOSE(724),
    BLOCK_SHULKER_BOX_OPEN(725),
    BLOCK_SLIME_BLOCK_BREAK(757),
    BLOCK_SLIME_BLOCK_FALL(758),
    BLOCK_SLIME_BLOCK_HIT(759),
    BLOCK_SLIME_BLOCK_PLACE(760),
    BLOCK_SLIME_BLOCK_STEP(761),
    BLOCK_SMITHING_TABLE_USE(786),
    BLOCK_SMOKER_SMOKE(787),
    BLOCK_SNOW_BREAK(789),
    BLOCK_SNOW_FALL(790),
    BLOCK_SNOW_HIT(796),
    BLOCK_SNOW_PLACE(797),
    BLOCK_SNOW_STEP(798),
    BLOCK_SOUL_SAND_BREAK(762),
    BLOCK_SOUL_SAND_FALL(766),
    BLOCK_SOUL_SAND_HIT(765),
    BLOCK_SOUL_SAND_PLACE(764),
    BLOCK_SOUL_SAND_STEP(763),
    BLOCK_SOUL_SOIL_BREAK(767),
    BLOCK_SOUL_SOIL_FALL(771),
    BLOCK_SOUL_SOIL_HIT(770),
    BLOCK_SOUL_SOIL_PLACE(769),
    BLOCK_SOUL_SOIL_STEP(768),
    BLOCK_STEM_BREAK(495),
    BLOCK_STEM_FALL(499),
    BLOCK_STEM_HIT(498),
    BLOCK_STEM_PLACE(497),
    BLOCK_STEM_STEP(496),
    BLOCK_STONE_BREAK(809),
    BLOCK_STONE_FALL(812),
    BLOCK_STONE_HIT(813),
    BLOCK_STONE_PLACE(814),
    BLOCK_STONE_STEP(817),
    BLOCK_STONE_BUTTON_CLICK_OFF(810),
    BLOCK_STONE_BUTTON_CLICK_ON(811),
    BLOCK_STONE_PRESSURE_PLATE_CLICK_OFF(815),
    BLOCK_STONE_PRESSURE_PLATE_CLICK_ON(816),
    BLOCK_SWEET_BERRY_BUSH_BREAK(822),
    BLOCK_SWEET_BERRY_BUSH_PLACE(823),
    BLOCK_TRIPWIRE_ATTACH(836),
    BLOCK_TRIPWIRE_CLICK_OFF(837),
    BLOCK_TRIPWIRE_CLICK_ON(838),
    BLOCK_TRIPWIRE_DETACH(839),
    BLOCK_VINE_STEP(893),
    BLOCK_WART_BLOCK_BREAK(520),
    BLOCK_WART_BLOCK_FALL(524),
    BLOCK_WART_BLOCK_HIT(523),
    BLOCK_WART_BLOCK_PLACE(522),
    BLOCK_WART_BLOCK_STEP(521),
    BLOCK_WATER_AMBIENT(905),
    BLOCK_WEEPING_VINES_BREAK(515),
    BLOCK_WEEPING_VINES_FALL(519),
    BLOCK_WEEPING_VINES_HIT(518),
    BLOCK_WEEPING_VINES_PLACE(517),
    BLOCK_WEEPING_VINES_STEP(516),
    BLOCK_WET_GRASS_BREAK(908),
    BLOCK_WET_GRASS_FALL(909),
    BLOCK_WET_GRASS_HIT(910),
    BLOCK_WET_GRASS_PLACE(911),
    BLOCK_WET_GRASS_STEP(912),
    BLOCK_WOOD_BREAK(942),
    BLOCK_WOOD_FALL(945),
    BLOCK_WOOD_HIT(946),
    BLOCK_WOOD_PLACE(947),
    BLOCK_WOOD_STEP(950),
    BLOCK_WOODEN_BUTTON_CLICK_OFF(943),
    BLOCK_WOODEN_BUTTON_CLICK_ON(944),
    BLOCK_WOODEN_DOOR_CLOSE(938),
    BLOCK_WOODEN_DOOR_OPEN(939),
    BLOCK_WOODEN_PRESSURE_PLATE_CLICK_OFF(948),
    BLOCK_WOODEN_PRESSURE_PLATE_CLICK_ON(949),
    BLOCK_WOODEN_TRAPDOOR_CLOSE(940),
    BLOCK_WOODEN_TRAPDOOR_OPEN(941),
    BLOCK_WOOL_BREAK(951),
    BLOCK_WOOL_FALL(952),
    BLOCK_WOOL_HIT(953),
    BLOCK_WOOL_PLACE(954),
    BLOCK_WOOL_STEP(955),
    ENCHANT_THORNS_HIT(825),
    ENTITY_ARMOR_STAND_BREAK(44),
    ENTITY_ARMOR_STAND_FALL(45),
    ENTITY_ARMOR_STAND_HIT(46),
    ENTITY_ARMOR_STAND_PLACE(47),
    ENTITY_ARROW_HIT(48),
    ENTITY_ARROW_HIT_PLAYER(49),
    ENTITY_ARROW_SHOOT(50),
    ENTITY_BAT_AMBIENT(67),
    ENTITY_BAT_DEATH(68),
    ENTITY_BAT_HURT(69),
    ENTITY_BAT_LOOP(70),
    ENTITY_BAT_TAKEOFF(71),
    ENTITY_BEE_DEATH(76),
    ENTITY_BEE_HURT(77),
    ENTITY_BEE_LOOP(79),
    ENTITY_BEE_LOOP_AGGRESSIVE(78),
    ENTITY_BEE_POLLINATE(81),
    ENTITY_BEE_STING(80),
    ENTITY_BLAZE_AMBIENT(89),
    ENTITY_BLAZE_BURN(90),
    ENTITY_BLAZE_DEATH(91),
    ENTITY_BLAZE_HURT(92),
    ENTITY_BLAZE_SHOOT(93),
    ENTITY_BOAT_PADDLE_LAND(94),
    ENTITY_BOAT_PADDLE_WATER(95),
    ENTITY_CAT_AMBIENT(120),
    ENTITY_CAT_BEG_FOR_FOOD(125),
    ENTITY_CAT_DEATH(122),
    ENTITY_CAT_EAT(123),
    ENTITY_CAT_HISS(124),
    ENTITY_CAT_HURT(126),
    ENTITY_CAT_PURR(127),
    ENTITY_CAT_PURREOW(128),
    ENTITY_CAT_STRAY_AMBIENT(121),
    ENTITY_CHICKEN_AMBIENT(137),
    ENTITY_CHICKEN_DEATH(138),
    ENTITY_CHICKEN_EGG(139),
    ENTITY_CHICKEN_HURT(140),
    ENTITY_CHICKEN_STEP(141),
    ENTITY_COD_AMBIENT(145),
    ENTITY_COD_DEATH(146),
    ENTITY_COD_FLOP(147),
    ENTITY_COD_HURT(148),
    ENTITY_COW_AMBIENT(164),
    ENTITY_COW_DEATH(165),
    ENTITY_COW_HURT(166),
    ENTITY_COW_MILK(167),
    ENTITY_COW_STEP(168),
    ENTITY_CREEPER_DEATH(169),
    ENTITY_CREEPER_HURT(170),
    ENTITY_CREEPER_PRIMED(171),
    ENTITY_DOLPHIN_AMBIENT(185),
    ENTITY_DOLPHIN_AMBIENT_WATER(186),
    ENTITY_DOLPHIN_ATTACK(187),
    ENTITY_DOLPHIN_DEATH(188),
    ENTITY_DOLPHIN_EAT(189),
    ENTITY_DOLPHIN_HURT(190),
    ENTITY_DOLPHIN_JUMP(191),
    ENTITY_DOLPHIN_PLAY(192),
    ENTITY_DOLPHIN_SPLASH(193),
    ENTITY_DOLPHIN_SWIM(194),
    ENTITY_DONKEY_AMBIENT(195),
    ENTITY_DONKEY_ANGRY(196),
    ENTITY_DONKEY_CHEST(197),
    ENTITY_DONKEY_DEATH(198),
    ENTITY_DONKEY_EAT(199),
    ENTITY_DONKEY_HURT(200),
    ENTITY_DRAGON_FIREBALL_EXPLODE(225),
    ENTITY_DROWNED_AMBIENT(201),
    ENTITY_DROWNED_AMBIENT_WATER(202),
    ENTITY_DROWNED_DEATH(203),
    ENTITY_DROWNED_DEATH_WATER(204),
    ENTITY_DROWNED_HURT(205),
    ENTITY_DROWNED_HURT_WATER(206),
    ENTITY_DROWNED_SHOOT(207),
    ENTITY_DROWNED_STEP(208),
    ENTITY_DROWNED_SWIM(209),
    ENTITY_EGG_THROW(210),
    ENTITY_ELDER_GUARDIAN_AMBIENT(211),
    ENTITY_ELDER_GUARDIAN_AMBIENT_LAND(212),
    ENTITY_ELDER_GUARDIAN_CURSE(213),
    ENTITY_ELDER_GUARDIAN_DEATH(214),
    ENTITY_ELDER_GUARDIAN_DEATH_LAND(215),
    ENTITY_ELDER_GUARDIAN_FLOP(216),
    ENTITY_ELDER_GUARDIAN_HURT(217),
    ENTITY_ELDER_GUARDIAN_HURT_LAND(218),
    ENTITY_ENDER_DRAGON_AMBIENT(223),
    ENTITY_ENDER_DRAGON_DEATH(224),
    ENTITY_ENDER_DRAGON_FLAP(226),
    ENTITY_ENDER_DRAGON_GROWL(227),
    ENTITY_ENDER_DRAGON_HURT(228),
    ENTITY_ENDER_DRAGON_SHOOT(229),
    ENTITY_ENDER_EYE_DEATH(230),
    ENTITY_ENDER_EYE_LAUNCH(231),
    ENTITY_ENDER_PEARL_THROW(242),
    ENTITY_ENDERMAN_AMBIENT(232),
    ENTITY_ENDERMAN_DEATH(233),
    ENTITY_ENDERMAN_HURT(234),
    ENTITY_ENDERMAN_SCREAM(235),
    ENTITY_ENDERMAN_STARE(236),
    ENTITY_ENDERMAN_TELEPORT(237),
    ENTITY_ENDERMITE_AMBIENT(238),
    ENTITY_ENDERMITE_DEATH(239),
    ENTITY_ENDERMITE_HURT(240),
    ENTITY_ENDERMITE_STEP(241),
    ENTITY_EVOKER_AMBIENT(246),
    ENTITY_EVOKER_CAST_SPELL(247),
    ENTITY_EVOKER_CELEBRATE(248),
    ENTITY_EVOKER_DEATH(249),
    ENTITY_EVOKER_HURT(251),
    ENTITY_EVOKER_PREPARE_ATTACK(252),
    ENTITY_EVOKER_PREPARE_SUMMON(253),
    ENTITY_EVOKER_PREPARE_WOLOLO(254),
    ENTITY_EVOKER_FANGS_ATTACK(250),
    ENTITY_EXPERIENCE_BOTTLE_THROW(255),
    ENTITY_EXPERIENCE_ORB_PICKUP(256),
    ENTITY_FIREWORK_ROCKET_BLAST(260),
    ENTITY_FIREWORK_ROCKET_BLAST_FAR(261),
    ENTITY_FIREWORK_ROCKET_LARGE_BLAST(262),
    ENTITY_FIREWORK_ROCKET_LARGE_BLAST_FAR(263),
    ENTITY_FIREWORK_ROCKET_LAUNCH(264),
    ENTITY_FIREWORK_ROCKET_SHOOT(265),
    ENTITY_FIREWORK_ROCKET_TWINKLE(266),
    ENTITY_FIREWORK_ROCKET_TWINKLE_FAR(267),
    ENTITY_FISH_SWIM(270),
    ENTITY_FISHING_BOBBER_RETRIEVE(271),
    ENTITY_FISHING_BOBBER_SPLASH(272),
    ENTITY_FISHING_BOBBER_THROW(273),
    ENTITY_FOX_AGGRO(275),
    ENTITY_FOX_AMBIENT(276),
    ENTITY_FOX_BITE(277),
    ENTITY_FOX_DEATH(278),
    ENTITY_FOX_EAT(279),
    ENTITY_FOX_HURT(280),
    ENTITY_FOX_SCREECH(281),
    ENTITY_FOX_SLEEP(282),
    ENTITY_FOX_SNIFF(283),
    ENTITY_FOX_SPIT(284),
    ENTITY_FOX_TELEPORT(285),
    ENTITY_GENERIC_BIG_FALL(292),
    ENTITY_GENERIC_BURN(293),
    ENTITY_GENERIC_DEATH(294),
    ENTITY_GENERIC_DRINK(295),
    ENTITY_GENERIC_EAT(296),
    ENTITY_GENERIC_EXPLODE(297),
    ENTITY_GENERIC_EXTINGUISH_FIRE(298),
    ENTITY_GENERIC_HURT(299),
    ENTITY_GENERIC_SMALL_FALL(300),
    ENTITY_GENERIC_SPLASH(301),
    ENTITY_GENERIC_SWIM(302),
    ENTITY_GHAST_AMBIENT(303),
    ENTITY_GHAST_DEATH(304),
    ENTITY_GHAST_HURT(305),
    ENTITY_GHAST_SCREAM(306),
    ENTITY_GHAST_SHOOT(307),
    ENTITY_GHAST_WARN(308),
    ENTITY_GUARDIAN_AMBIENT(330),
    ENTITY_GUARDIAN_AMBIENT_LAND(331),
    ENTITY_GUARDIAN_ATTACK(332),
    ENTITY_GUARDIAN_DEATH(333),
    ENTITY_GUARDIAN_DEATH_LAND(334),
    ENTITY_GUARDIAN_FLOP(335),
    ENTITY_GUARDIAN_HURT(336),
    ENTITY_GUARDIAN_HURT_LAND(337),
    ENTITY_HOGLIN_AMBIENT(339),
    ENTITY_HOGLIN_ANGRY(340),
    ENTITY_HOGLIN_ATTACK(341),
    ENTITY_HOGLIN_CONVERTED_TO_ZOMBIFIED(342),
    ENTITY_HOGLIN_DEATH(343),
    ENTITY_HOGLIN_HURT(344),
    ENTITY_HOGLIN_RETREAT(345),
    ENTITY_HOGLIN_STEP(346),
    ENTITY_HORSE_AMBIENT(354),
    ENTITY_HORSE_ANGRY(355),
    ENTITY_HORSE_ARMOR(356),
    ENTITY_HORSE_BREATHE(357),
    ENTITY_HORSE_DEATH(358),
    ENTITY_HORSE_EAT(359),
    ENTITY_HORSE_GALLOP(360),
    ENTITY_HORSE_HURT(361),
    ENTITY_HORSE_JUMP(362),
    ENTITY_HORSE_LAND(363),
    ENTITY_HORSE_SADDLE(364),
    ENTITY_HORSE_STEP(365),
    ENTITY_HORSE_STEP_WOOD(366),
    ENTITY_HOSTILE_BIG_FALL(367),
    ENTITY_HOSTILE_DEATH(368),
    ENTITY_HOSTILE_HURT(369),
    ENTITY_HOSTILE_SMALL_FALL(370),
    ENTITY_HOSTILE_SPLASH(371),
    ENTITY_HOSTILE_SWIM(372),
    ENTITY_HUSK_AMBIENT(373),
    ENTITY_HUSK_CONVERTED_TO_ZOMBIE(374),
    ENTITY_HUSK_DEATH(375),
    ENTITY_HUSK_HURT(376),
    ENTITY_HUSK_STEP(377),
    ENTITY_ILLUSIONER_AMBIENT(378),
    ENTITY_ILLUSIONER_CAST_SPELL(379),
    ENTITY_ILLUSIONER_DEATH(380),
    ENTITY_ILLUSIONER_HURT(381),
    ENTITY_ILLUSIONER_MIRROR_MOVE(382),
    ENTITY_ILLUSIONER_PREPARE_BLINDNESS(383),
    ENTITY_ILLUSIONER_PREPARE_MIRROR(384),
    ENTITY_IRON_GOLEM_ATTACK(387),
    ENTITY_IRON_GOLEM_DAMAGE(388),
    ENTITY_IRON_GOLEM_DEATH(389),
    ENTITY_IRON_GOLEM_HURT(390),
    ENTITY_IRON_GOLEM_REPAIR(391),
    ENTITY_IRON_GOLEM_STEP(392),
    ENTITY_ITEM_BREAK(400),
    ENTITY_ITEM_PICKUP(401),
    ENTITY_ITEM_FRAME_ADD_ITEM(395),
    ENTITY_ITEM_FRAME_BREAK(396),
    ENTITY_ITEM_FRAME_PLACE(397),
    ENTITY_ITEM_FRAME_REMOVE_ITEM(398),
    ENTITY_ITEM_FRAME_ROTATE_ITEM(399),
    ENTITY_LEASH_KNOT_BREAK(415),
    ENTITY_LEASH_KNOT_PLACE(416),
    ENTITY_LIGHTNING_BOLT_IMPACT(418),
    ENTITY_LIGHTNING_BOLT_THUNDER(419),
    ENTITY_LINGERING_POTION_THROW(420),
    ENTITY_LLAMA_AMBIENT(421),
    ENTITY_LLAMA_ANGRY(422),
    ENTITY_LLAMA_CHEST(423),
    ENTITY_LLAMA_DEATH(424),
    ENTITY_LLAMA_EAT(425),
    ENTITY_LLAMA_HURT(426),
    ENTITY_LLAMA_SPIT(427),
    ENTITY_LLAMA_STEP(428),
    ENTITY_LLAMA_SWAG(429),
    ENTITY_MAGMA_CUBE_DEATH(437),
    ENTITY_MAGMA_CUBE_DEATH_SMALL(430),
    ENTITY_MAGMA_CUBE_HURT(438),
    ENTITY_MAGMA_CUBE_HURT_SMALL(439),
    ENTITY_MAGMA_CUBE_JUMP(440),
    ENTITY_MAGMA_CUBE_SQUISH(441),
    ENTITY_MAGMA_CUBE_SQUISH_SMALL(442),
    ENTITY_MINECART_INSIDE(450),
    ENTITY_MINECART_RIDING(451),
    ENTITY_MOOSHROOM_CONVERT(452),
    ENTITY_MOOSHROOM_EAT(453),
    ENTITY_MOOSHROOM_MILK(454),
    ENTITY_MOOSHROOM_SHEAR(456),
    ENTITY_MOOSHROOM_SUSPICIOUS_MILK(455),
    ENTITY_MULE_AMBIENT(457),
    ENTITY_MULE_ANGRY(458),
    ENTITY_MULE_CHEST(459),
    ENTITY_MULE_DEATH(460),
    ENTITY_MULE_EAT(461),
    ENTITY_MULE_HURT(462),
    ENTITY_OCELOT_AMBIENT(552),
    ENTITY_OCELOT_DEATH(553),
    ENTITY_OCELOT_HURT(551),
    ENTITY_PAINTING_BREAK(554),
    ENTITY_PAINTING_PLACE(555),
    ENTITY_PANDA_AGGRESSIVE_AMBIENT(563),
    ENTITY_PANDA_AMBIENT(558),
    ENTITY_PANDA_BITE(566),
    ENTITY_PANDA_CANT_BREED(562),
    ENTITY_PANDA_DEATH(559),
    ENTITY_PANDA_EAT(560),
    ENTITY_PANDA_HURT(565),
    ENTITY_PANDA_PRE_SNEEZE(556),
    ENTITY_PANDA_SNEEZE(557),
    ENTITY_PANDA_STEP(561),
    ENTITY_PANDA_WORRIED_AMBIENT(564),
    ENTITY_PARROT_AMBIENT(567),
    ENTITY_PARROT_DEATH(568),
    ENTITY_PARROT_EAT(569),
    ENTITY_PARROT_FLY(570),
    ENTITY_PARROT_HURT(571),
    ENTITY_PARROT_IMITATE_BLAZE(572),
    ENTITY_PARROT_IMITATE_CREEPER(573),
    ENTITY_PARROT_IMITATE_DROWNED(574),
    ENTITY_PARROT_IMITATE_ELDER_GUARDIAN(575),
    ENTITY_PARROT_IMITATE_ENDER_DRAGON(576),
    ENTITY_PARROT_IMITATE_ENDERMITE(577),
    ENTITY_PARROT_IMITATE_EVOKER(578),
    ENTITY_PARROT_IMITATE_GHAST(579),
    ENTITY_PARROT_IMITATE_GUARDIAN(580),
    ENTITY_PARROT_IMITATE_HOGLIN(581),
    ENTITY_PARROT_IMITATE_HUSK(582),
    ENTITY_PARROT_IMITATE_ILLUSIONER(583),
    ENTITY_PARROT_IMITATE_MAGMA_CUBE(584),
    ENTITY_PARROT_IMITATE_PHANTOM(585),
    ENTITY_PARROT_IMITATE_PIGLIN(586),
    ENTITY_PARROT_IMITATE_PILLAGER(587),
    ENTITY_PARROT_IMITATE_RAVAGER(588),
    ENTITY_PARROT_IMITATE_SHULKER(589),
    ENTITY_PARROT_IMITATE_SILVERFISH(590),
    ENTITY_PARROT_IMITATE_SKELETON(591),
    ENTITY_PARROT_IMITATE_SLIME(592),
    ENTITY_PARROT_IMITATE_SPIDER(593),
    ENTITY_PARROT_IMITATE_STRAY(594),
    ENTITY_PARROT_IMITATE_VEX(595),
    ENTITY_PARROT_IMITATE_VINDICATOR(596),
    ENTITY_PARROT_IMITATE_WITCH(597),
    ENTITY_PARROT_IMITATE_WITHER(598),
    ENTITY_PARROT_IMITATE_WITHER_SKELETON(599),
    ENTITY_PARROT_IMITATE_ZOGLIN(600),
    ENTITY_PARROT_IMITATE_ZOMBIE(601),
    ENTITY_PARROT_IMITATE_ZOMBIE_VILLAGER(602),
    ENTITY_PARROT_STEP(603),
    ENTITY_PHANTOM_AMBIENT(604),
    ENTITY_PHANTOM_BITE(605),
    ENTITY_PHANTOM_DEATH(606),
    ENTITY_PHANTOM_FLAP(607),
    ENTITY_PHANTOM_HURT(608),
    ENTITY_PHANTOM_SWOOP(609),
    ENTITY_PIG_AMBIENT(610),
    ENTITY_PIG_DEATH(611),
    ENTITY_PIG_HURT(612),
    ENTITY_PIG_SADDLE(613),
    ENTITY_PIG_STEP(614),
    ENTITY_PIGLIN_ADMIRING_ITEM(615),
    ENTITY_PIGLIN_AMBIENT(616),
    ENTITY_PIGLIN_ANGRY(617),
    ENTITY_PIGLIN_CELEBRATE(618),
    ENTITY_PIGLIN_CONVERTED_TO_ZOMBIFIED(624),
    ENTITY_PIGLIN_DEATH(619),
    ENTITY_PIGLIN_HURT(621),
    ENTITY_PIGLIN_JEALOUS(620),
    ENTITY_PIGLIN_RETREAT(622),
    ENTITY_PIGLIN_STEP(623),
    ENTITY_PILLAGER_AMBIENT(625),
    ENTITY_PILLAGER_CELEBRATE(626),
    ENTITY_PILLAGER_DEATH(627),
    ENTITY_PILLAGER_HURT(628),
    ENTITY_PLAYER_ATTACK_CRIT(631),
    ENTITY_PLAYER_ATTACK_KNOCKBACK(632),
    ENTITY_PLAYER_ATTACK_NODAMAGE(633),
    ENTITY_PLAYER_ATTACK_STRONG(634),
    ENTITY_PLAYER_ATTACK_SWEEP(635),
    ENTITY_PLAYER_ATTACK_WEAK(636),
    ENTITY_PLAYER_BIG_FALL(637),
    ENTITY_PLAYER_BREATH(638),
    ENTITY_PLAYER_BURP(639),
    ENTITY_PLAYER_DEATH(640),
    ENTITY_PLAYER_HURT(641),
    ENTITY_PLAYER_HURT_DROWN(642),
    ENTITY_PLAYER_HURT_ON_FIRE(643),
    ENTITY_PLAYER_HURT_SWEET_BERRY_BUSH(644),
    ENTITY_PLAYER_LEVELUP(645),
    ENTITY_PLAYER_SMALL_FALL(646),
    ENTITY_PLAYER_SPLASH(647),
    ENTITY_PLAYER_SPLASH_HIGH_SPEED(648),
    ENTITY_PLAYER_SWIM(649),
    ENTITY_POLAR_BEAR_AMBIENT(650),
    ENTITY_POLAR_BEAR_AMBIENT_BABY(651),
    ENTITY_POLAR_BEAR_DEATH(652),
    ENTITY_POLAR_BEAR_HURT(653),
    ENTITY_POLAR_BEAR_STEP(654),
    ENTITY_POLAR_BEAR_WARNING(655),
    ENTITY_PUFFER_FISH_AMBIENT(659),
    ENTITY_PUFFER_FISH_BLOW_OUT(660),
    ENTITY_PUFFER_FISH_BLOW_UP(661),
    ENTITY_PUFFER_FISH_DEATH(662),
    ENTITY_PUFFER_FISH_FLOP(663),
    ENTITY_PUFFER_FISH_HURT(664),
    ENTITY_PUFFER_FISH_STING(665),
    ENTITY_RABBIT_AMBIENT(667),
    ENTITY_RABBIT_ATTACK(668),
    ENTITY_RABBIT_DEATH(669),
    ENTITY_RABBIT_HURT(670),
    ENTITY_RABBIT_JUMP(671),
    ENTITY_RAVAGER_AMBIENT(673),
    ENTITY_RAVAGER_ATTACK(674),
    ENTITY_RAVAGER_CELEBRATE(675),
    ENTITY_RAVAGER_DEATH(676),
    ENTITY_RAVAGER_HURT(677),
    ENTITY_RAVAGER_ROAR(680),
    ENTITY_RAVAGER_STEP(678),
    ENTITY_RAVAGER_STUNNED(679),
    ENTITY_SALMON_AMBIENT(696),
    ENTITY_SALMON_DEATH(697),
    ENTITY_SALMON_FLOP(698),
    ENTITY_SALMON_HURT(699),
    ENTITY_SHEEP_AMBIENT(710),
    ENTITY_SHEEP_DEATH(711),
    ENTITY_SHEEP_HURT(712),
    ENTITY_SHEEP_SHEAR(713),
    ENTITY_SHEEP_STEP(714),
    ENTITY_SHULKER_AMBIENT(723),
    ENTITY_SHULKER_CLOSE(728),
    ENTITY_SHULKER_DEATH(729),
    ENTITY_SHULKER_HURT(730),
    ENTITY_SHULKER_HURT_CLOSED(731),
    ENTITY_SHULKER_OPEN(732),
    ENTITY_SHULKER_SHOOT(733),
    ENTITY_SHULKER_TELEPORT(734),
    ENTITY_SHULKER_BULLET_HIT(726),
    ENTITY_SHULKER_BULLET_HURT(727),
    ENTITY_SILVERFISH_AMBIENT(735),
    ENTITY_SILVERFISH_DEATH(736),
    ENTITY_SILVERFISH_HURT(737),
    ENTITY_SILVERFISH_STEP(738),
    ENTITY_SKELETON_AMBIENT(739),
    ENTITY_SKELETON_DEATH(740),
    ENTITY_SKELETON_HURT(749),
    ENTITY_SKELETON_SHOOT(750),
    ENTITY_SKELETON_STEP(751),
    ENTITY_SKELETON_HORSE_AMBIENT(741),
    ENTITY_SKELETON_HORSE_AMBIENT_WATER(745),
    ENTITY_SKELETON_HORSE_DEATH(742),
    ENTITY_SKELETON_HORSE_GALLOP_WATER(746),
    ENTITY_SKELETON_HORSE_HURT(743),
    ENTITY_SKELETON_HORSE_JUMP_WATER(747),
    ENTITY_SKELETON_HORSE_STEP_WATER(748),
    ENTITY_SKELETON_HORSE_SWIM(744),
    ENTITY_SLIME_ATTACK(752),
    ENTITY_SLIME_DEATH(753),
    ENTITY_SLIME_DEATH_SMALL(782),
    ENTITY_SLIME_HURT(754),
    ENTITY_SLIME_HURT_SMALL(783),
    ENTITY_SLIME_JUMP(755),
    ENTITY_SLIME_JUMP_SMALL(784),
    ENTITY_SLIME_SQUISH(756),
    ENTITY_SLIME_SQUISH_SMALL(785),
    ENTITY_SNOW_GOLEM_AMBIENT(791),
    ENTITY_SNOW_GOLEM_DEATH(792),
    ENTITY_SNOW_GOLEM_HURT(793),
    ENTITY_SNOW_GOLEM_SHEAR(795),
    ENTITY_SNOW_GOLEM_SHOOT(794),
    ENTITY_SNOWBALL_THROW(788),
    ENTITY_SPIDER_AMBIENT(799),
    ENTITY_SPIDER_DEATH(800),
    ENTITY_SPIDER_HURT(801),
    ENTITY_SPIDER_STEP(802),
    ENTITY_SPLASH_POTION_BREAK(803),
    ENTITY_SPLASH_POTION_THROW(804),
    ENTITY_SQUID_AMBIENT(805),
    ENTITY_SQUID_DEATH(806),
    ENTITY_SQUID_HURT(807),
    ENTITY_SQUID_SQUIRT(808),
    ENTITY_STRAY_AMBIENT(818),
    ENTITY_STRAY_DEATH(819),
    ENTITY_STRAY_HURT(820),
    ENTITY_STRAY_STEP(821),
    ENTITY_STRIDER_AMBIENT(773),
    ENTITY_STRIDER_DEATH(776),
    ENTITY_STRIDER_EAT(780),
    ENTITY_STRIDER_HAPPY(774),
    ENTITY_STRIDER_HURT(777),
    ENTITY_STRIDER_RETREAT(775),
    ENTITY_STRIDER_SADDLE(781),
    ENTITY_STRIDER_STEP(778),
    ENTITY_STRIDER_STEP_LAVA(779),
    ENTITY_TNT_PRIMED(826),
    ENTITY_TROPICAL_FISH_AMBIENT(840),
    ENTITY_TROPICAL_FISH_DEATH(841),
    ENTITY_TROPICAL_FISH_FLOP(842),
    ENTITY_TROPICAL_FISH_HURT(843),
    ENTITY_TURTLE_AMBIENT_LAND(844),
    ENTITY_TURTLE_DEATH(845),
    ENTITY_TURTLE_DEATH_BABY(846),
    ENTITY_TURTLE_EGG_BREAK(847),
    ENTITY_TURTLE_EGG_CRACK(848),
    ENTITY_TURTLE_EGG_HATCH(849),
    ENTITY_TURTLE_HURT(850),
    ENTITY_TURTLE_HURT_BABY(851),
    ENTITY_TURTLE_LAY_EGG(852),
    ENTITY_TURTLE_SHAMBLE(853),
    ENTITY_TURTLE_SHAMBLE_BABY(854),
    ENTITY_TURTLE_SWIM(855),
    ENTITY_VEX_AMBIENT(865),
    ENTITY_VEX_CHARGE(866),
    ENTITY_VEX_DEATH(867),
    ENTITY_VEX_HURT(868),
    ENTITY_VILLAGER_AMBIENT(869),
    ENTITY_VILLAGER_CELEBRATE(870),
    ENTITY_VILLAGER_DEATH(871),
    ENTITY_VILLAGER_HURT(872),
    ENTITY_VILLAGER_NO(873),
    ENTITY_VILLAGER_TRADE(874),
    ENTITY_VILLAGER_WORK_ARMORER(876),
    ENTITY_VILLAGER_WORK_BUTCHER(877),
    ENTITY_VILLAGER_WORK_CARTOGRAPHER(878),
    ENTITY_VILLAGER_WORK_CLERIC(879),
    ENTITY_VILLAGER_WORK_FARMER(880),
    ENTITY_VILLAGER_WORK_FISHERMAN(881),
    ENTITY_VILLAGER_WORK_FLETCHER(882),
    ENTITY_VILLAGER_WORK_LEATHERWORKER(883),
    ENTITY_VILLAGER_WORK_LIBRARIAN(884),
    ENTITY_VILLAGER_WORK_MASON(885),
    ENTITY_VILLAGER_WORK_SHEPHERD(886),
    ENTITY_VILLAGER_WORK_TOOLSMITH(887),
    ENTITY_VILLAGER_WORK_WEAPONSMITH(888),
    ENTITY_VILLAGER_YES(875),
    ENTITY_VINDICATOR_AMBIENT(889),
    ENTITY_VINDICATOR_CELEBRATE(890),
    ENTITY_VINDICATOR_DEATH(891),
    ENTITY_VINDICATOR_HURT(892),
    ENTITY_WANDERING_TRADER_AMBIENT(895),
    ENTITY_WANDERING_TRADER_DEATH(896),
    ENTITY_WANDERING_TRADER_DISAPPEARED(897),
    ENTITY_WANDERING_TRADER_DRINK_MILK(898),
    ENTITY_WANDERING_TRADER_DRINK_POTION(899),
    ENTITY_WANDERING_TRADER_HURT(900),
    ENTITY_WANDERING_TRADER_NO(901),
    ENTITY_WANDERING_TRADER_REAPPEARED(902),
    ENTITY_WANDERING_TRADER_TRADE(903),
    ENTITY_WANDERING_TRADER_YES(904),
    ENTITY_WITCH_AMBIENT(913),
    ENTITY_WITCH_CELEBRATE(914),
    ENTITY_WITCH_DEATH(915),
    ENTITY_WITCH_DRINK(916),
    ENTITY_WITCH_HURT(917),
    ENTITY_WITCH_THROW(918),
    ENTITY_WITHER_AMBIENT(919),
    ENTITY_WITHER_BREAK_BLOCK(920),
    ENTITY_WITHER_DEATH(921),
    ENTITY_WITHER_HURT(922),
    ENTITY_WITHER_SHOOT(923),
    ENTITY_WITHER_SPAWN(928),
    ENTITY_WITHER_SKELETON_AMBIENT(924),
    ENTITY_WITHER_SKELETON_DEATH(925),
    ENTITY_WITHER_SKELETON_HURT(926),
    ENTITY_WITHER_SKELETON_STEP(927),
    ENTITY_WOLF_AMBIENT(929),
    ENTITY_WOLF_DEATH(930),
    ENTITY_WOLF_GROWL(931),
    ENTITY_WOLF_HOWL(932),
    ENTITY_WOLF_HURT(933),
    ENTITY_WOLF_PANT(934),
    ENTITY_WOLF_SHAKE(935),
    ENTITY_WOLF_STEP(936),
    ENTITY_WOLF_WHINE(937),
    ENTITY_ZOGLIN_AMBIENT(956),
    ENTITY_ZOGLIN_ANGRY(957),
    ENTITY_ZOGLIN_ATTACK(958),
    ENTITY_ZOGLIN_DEATH(959),
    ENTITY_ZOGLIN_HURT(960),
    ENTITY_ZOGLIN_STEP(961),
    ENTITY_ZOMBIE_AMBIENT(962),
    ENTITY_ZOMBIE_ATTACK_IRON_DOOR(964),
    ENTITY_ZOMBIE_ATTACK_WOODEN_DOOR(963),
    ENTITY_ZOMBIE_BREAK_WOODEN_DOOR(965),
    ENTITY_ZOMBIE_CONVERTED_TO_DROWNED(966),
    ENTITY_ZOMBIE_DEATH(967),
    ENTITY_ZOMBIE_DESTROY_EGG(968),
    ENTITY_ZOMBIE_HURT(972),
    ENTITY_ZOMBIE_INFECT(973),
    ENTITY_ZOMBIE_STEP(978),
    ENTITY_ZOMBIE_HORSE_AMBIENT(969),
    ENTITY_ZOMBIE_HORSE_DEATH(970),
    ENTITY_ZOMBIE_HORSE_HURT(971),
    ENTITY_ZOMBIE_VILLAGER_AMBIENT(979),
    ENTITY_ZOMBIE_VILLAGER_CONVERTED(980),
    ENTITY_ZOMBIE_VILLAGER_CURE(981),
    ENTITY_ZOMBIE_VILLAGER_DEATH(982),
    ENTITY_ZOMBIE_VILLAGER_HURT(983),
    ENTITY_ZOMBIE_VILLAGER_STEP(984),
    ENTITY_ZOMBIFIED_PIGLIN_AMBIENT(974),
    ENTITY_ZOMBIFIED_PIGLIN_ANGRY(975),
    ENTITY_ZOMBIFIED_PIGLIN_DEATH(976),
    ENTITY_ZOMBIFIED_PIGLIN_HURT(977),
    EVENT_RAID_HORN(672),
    ITEM_ARMOR_EQUIP_CHAIN(35),
    ITEM_ARMOR_EQUIP_DIAMOND(36),
    ITEM_ARMOR_EQUIP_ELYTRA(37),
    ITEM_ARMOR_EQUIP_GENERIC(38),
    ITEM_ARMOR_EQUIP_GOLD(39),
    ITEM_ARMOR_EQUIP_IRON(40),
    ITEM_ARMOR_EQUIP_LEATHER(41),
    ITEM_ARMOR_EQUIP_NETHERITE(42),
    ITEM_ARMOR_EQUIP_TURTLE(43),
    ITEM_AXE_STRIP(51),
    ITEM_BOOK_PAGE_TURN(101),
    ITEM_BOOK_PUT(102),
    ITEM_BOTTLE_EMPTY(104),
    ITEM_BOTTLE_FILL(105),
    ITEM_BOTTLE_FILL_DRAGONBREATH(106),
    ITEM_BUCKET_EMPTY(113),
    ITEM_BUCKET_EMPTY_FISH(114),
    ITEM_BUCKET_EMPTY_LAVA(115),
    ITEM_BUCKET_FILL(116),
    ITEM_BUCKET_FILL_FISH(117),
    ITEM_BUCKET_FILL_LAVA(118),
    ITEM_CHORUS_FRUIT_TELEPORT(144),
    ITEM_CROP_PLANT(173),
    ITEM_CROSSBOW_HIT(174),
    ITEM_CROSSBOW_LOADING_END(175),
    ITEM_CROSSBOW_LOADING_MIDDLE(176),
    ITEM_CROSSBOW_LOADING_START(177),
    ITEM_CROSSBOW_QUICK_CHARGE_1(178),
    ITEM_CROSSBOW_QUICK_CHARGE_2(179),
    ITEM_CROSSBOW_QUICK_CHARGE_3(180),
    ITEM_CROSSBOW_SHOOT(181),
    ITEM_ELYTRA_FLYING(219),
    ITEM_FIRECHARGE_USE(259),
    ITEM_FLINTANDSTEEL_USE(274),
    ITEM_HOE_TILL(338),
    ITEM_HONEY_BOTTLE_DRINK(353),
    ITEM_LODESTONE_COMPASS_LOCK(436),
    ITEM_NETHER_WART_PLANT(494),
    ITEM_SHIELD_BLOCK(715),
    ITEM_SHIELD_BREAK(716),
    ITEM_SHOVEL_FLATTEN(722),
    ITEM_SWEET_BERRIES_PICK_FROM_BUSH(824),
    ITEM_TOTEM_USE(827),
    ITEM_TRIDENT_HIT(828),
    ITEM_TRIDENT_HIT_GROUND(829),
    ITEM_TRIDENT_RETURN(830),
    ITEM_TRIDENT_RIPTIDE_1(831),
    ITEM_TRIDENT_RIPTIDE_2(832),
    ITEM_TRIDENT_RIPTIDE_3(833),
    ITEM_TRIDENT_THROW(834),
    ITEM_TRIDENT_THUNDER(835),
    MUSIC_CREATIVE(463),
    MUSIC_CREDITS(464),
    MUSIC_DRAGON(478),
    MUSIC_END(479),
    MUSIC_GAME(480),
    MUSIC_MENU(481),
    MUSIC_NETHER_BASALT_DELTAS(482),
    MUSIC_NETHER_CRIMSON_FOREST(485),
    MUSIC_NETHER_NETHER_WASTES(483),
    MUSIC_NETHER_SOUL_SAND_VALLEY(484),
    MUSIC_NETHER_WARPED_FOREST(486),
    MUSIC_UNDER_WATER(487),
    MUSIC_DISC_11(465),
    MUSIC_DISC_13(466),
    MUSIC_DISC_BLOCKS(467),
    MUSIC_DISC_CAT(468),
    MUSIC_DISC_CHIRP(469),
    MUSIC_DISC_FAR(470),
    MUSIC_DISC_MALL(471),
    MUSIC_DISC_MELLOHI(472),
    MUSIC_DISC_PIGSTEP(473),
    MUSIC_DISC_STAL(474),
    MUSIC_DISC_STRAD(475),
    MUSIC_DISC_WAIT(476),
    MUSIC_DISC_WARD(477),
    PARTICLE_SOUL_ESCAPE(772),
    UI_BUTTON_CLICK(856),
    UI_CARTOGRAPHY_TABLE_TAKE_RESULT(859),
    UI_LOOM_SELECT_PATTERN(857),
    UI_LOOM_TAKE_RESULT(858),
    UI_STONECUTTER_SELECT_RECIPE(861),
    UI_STONECUTTER_TAKE_RESULT(860),
    UI_TOAST_CHALLENGE_COMPLETE(862),
    UI_TOAST_IN(863),
    UI_TOAST_OUT(864),
    WEATHER_RAIN(906),
    WEATHER_RAIN_ABOVE(907);
    
    @Getter
    private final Integer id;

    Sound(int id) {
        this.id = id;
    }
}
