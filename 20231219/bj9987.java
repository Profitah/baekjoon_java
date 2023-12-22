import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Map<Integer,String[]> poke = new HashMap<Integer, String[]>();
		poke.put(0, new String[] {"Bulbasaur","Grass Poison"});
		poke.put(1, new String[] {"Ivysaur","Grass Poison"});
		poke.put(2, new String[] {"Venusaur","Grass Poison"});
		poke.put(3, new String[] {"Charmander","Fire"});
		poke.put(4, new String[] {"Charmeleon","Fire"});
		poke.put(5, new String[] {"Charizard","Fire Flying"});
		poke.put(6, new String[] {"Squirtle","Water"});
		poke.put(7, new String[] {"Wartortle","Water"});
		poke.put(8, new String[] {"Blastoise","Water"});
		poke.put(9, new String[] {"Caterpie","Bug"});
		poke.put(10, new String[] {"Metapod","Bug"});
		poke.put(11, new String[] {"Butterfree","Bug Flying"});
		poke.put(12, new String[] {"Weedle","Bug Poison"});
		poke.put(13, new String[] {"Kakuna","Bug Poison"});
		poke.put(14, new String[] {"Beedrill","Bug Poison"});
		poke.put(15, new String[] {"Pidgey","Normal Flying"});
		poke.put(16, new String[] {"Pidgeotto","Normal Flying"});
		poke.put(17, new String[] {"Pidgeot","Normal Flying"});
		poke.put(18, new String[] {"Rattata","Normal"});
		poke.put(19, new String[] {"Raticate","Normal"});
		poke.put(20, new String[] {"Spearow","Normal Flying"});
		poke.put(21, new String[] {"Fearow","Normal Flying"});
		poke.put(22, new String[] {"Ekans","Poison"});
		poke.put(23, new String[] {"Arbok","Poison"});
		poke.put(24, new String[] {"Pikachu","Electric"});
		poke.put(25, new String[] {"Raichu","Electric"});
		poke.put(26, new String[] {"Sandshrew","Ground"});
		poke.put(27, new String[] {"Sandslash","Ground"});
		poke.put(28, new String[] {"Nidoran♀","Poison"});
		poke.put(29, new String[] {"Nidorina","Poison"});
		poke.put(30, new String[] {"Nidoqueen","Poison Ground"});
		poke.put(31, new String[] {"Nidoran♂","Poison"});
		poke.put(32, new String[] {"Nidorino","Poison"});
		poke.put(33, new String[] {"Nidoking","Poison Ground"});
		poke.put(34, new String[] {"Clefairy","Fairy"});
		poke.put(35, new String[] {"Clefable","Fairy"});
		poke.put(36, new String[] {"Vulpix","Fire"});
		poke.put(37, new String[] {"Ninetales","Fire"});
		poke.put(38, new String[] {"Jigglypuff","Normal Fairy"});
		poke.put(39, new String[] {"Wigglytuff","Normal Fairy"});
		poke.put(40, new String[] {"Zubat","Poison Flying "});
		poke.put(41, new String[] {"Golbat","Poison Flying"});
		poke.put(42, new String[] {"Oddish","Grass Poison"});
		poke.put(43, new String[] {"Gloom","Grass Poison"});
		poke.put(44, new String[] {"Vileplume","Grass Poison"});
		poke.put(45, new String[] {"Paras","Bug Grass"});
		poke.put(46, new String[] {"Parasect","Bug Grass"});
		poke.put(47, new String[] {"Venonat","Bug Poison"});
		poke.put(48, new String[] {"Venomoth","Bug Poison"});
		poke.put(49, new String[] {"Diglett","Ground"});
		poke.put(50, new String[] {"Dugtrio","Ground"});
		poke.put(51, new String[] {"Meowth","Normal"});
		poke.put(52, new String[] {"Persian","Normal"});
		poke.put(53, new String[] {"Psyduck","Water"});
		poke.put(54, new String[] {"Golduck","Water"});
		poke.put(55, new String[] {"Mankey","Fighting"});
		poke.put(56, new String[] {"Primeape","Fighting"});
		poke.put(57, new String[] {"Growlithe","Fire"});
		poke.put(58, new String[] {"Arcanine","Fire"});
		poke.put(59, new String[] {"Poliwag","Water"});
		poke.put(60, new String[] {"Poliwhirl","Water"});
		poke.put(61, new String[] {"Poliwrath","Water Fighting"});
		poke.put(62, new String[] {"Abra","Psychic"});
		poke.put(63, new String[] {"Kadabra","Psychic"});
		poke.put(64, new String[] {"Alakazam","Psychic"});
		poke.put(65, new String[] {"Machop","Fighting"});
		poke.put(66, new String[] {"Machoke","Fighting"});
		poke.put(67, new String[] {"Machamp","Fighting"});
		poke.put(68, new String[] {"Bellsprout","Grass Poison"});
		poke.put(69, new String[] {"Weepinbell","Grass Poison"});
		poke.put(70, new String[] {"Victreebel","Grass Poison"});
		poke.put(71, new String[] {"Tentacool","Water Poison"});
		poke.put(72, new String[] {"Tentacruel","Water Poison"});
		poke.put(73, new String[] {"Geodude","Rock Ground"});
		poke.put(74, new String[] {"Graveler","Rock Ground"});
		poke.put(75, new String[] {"Golem","Rock Ground"});
		poke.put(76, new String[] {"Ponyta","Fire"});
		poke.put(77, new String[] {"Rapidash","Fire"});
		poke.put(78, new String[] {"Slowpoke","Water Psychic"});
		poke.put(79, new String[] {"Slowbro","Water Psychic"});
		poke.put(80, new String[] {"Magnemite","Electric Steel"});
		poke.put(81, new String[] {"Magneton","Electric Steel"});
		poke.put(82, new String[] {"Farfetch'd","Normal Flying"});
		poke.put(83, new String[] {"Doduo","Normal Flying"});
		poke.put(84, new String[] {"Dodrio","Normal Flying"});
		poke.put(85, new String[] {"Seel","Water"});
		poke.put(86, new String[] {"Dewgong","Water Ice"});
		poke.put(87, new String[] {"Grimer","Poison"});
		poke.put(88, new String[] {"Muk","Poison"});
		poke.put(89, new String[] {"Shellder","Water"});
		poke.put(90, new String[] {"Cloyster","Water Ice"});
		poke.put(91, new String[] {"Gastly","Ghost Poison"});
		poke.put(92, new String[] {"Haunter","Ghost Poison"});
		poke.put(93, new String[] {"Gengar","Ghost Poison"});
		poke.put(94, new String[] {"Onix","Rock Ground"});
		poke.put(95, new String[] {"Drowzee","Psychic"});
		poke.put(96, new String[] {"Hypno","Psychic"});
		poke.put(97, new String[] {"Krabby","Water"});
		poke.put(98, new String[] {"Kingler","Water"});
		poke.put(99, new String[] {"Voltorb","Electric"});
		poke.put(100, new String[] {"Electrode","Electric"});
		poke.put(101, new String[] {"Exeggcute","Grass Psychic"});
		poke.put(102, new String[] {"Exeggutor","Grass Psychic"});
		poke.put(103, new String[] {"Cubone","Ground"});
		poke.put(104, new String[] {"Marowak","Ground"});
		poke.put(105, new String[] {"Hitmonlee","Fighting"});
		poke.put(106, new String[] {"Hitmonchan","Fighting"});
		poke.put(107, new String[] {"Lickitung","Normal"});
		poke.put(108, new String[] {"Koffing","Poison"});
		poke.put(109, new String[] {"Weezing","Poison"});
		poke.put(110, new String[] {"Rhyhorn","Ground Rock"});
		poke.put(111, new String[] {"Rhydon","Ground Rock"});
		poke.put(112, new String[] {"Chansey","Normal"});
		poke.put(113, new String[] {"Tangela","Grass"});
		poke.put(114, new String[] {"Kangaskhan","Normal"});
		poke.put(115, new String[] {"Horsea","Water"});
		poke.put(116, new String[] {"Seadra","Water"});
		poke.put(117, new String[] {"Goldeen","Water"});
		poke.put(118, new String[] {"Seaking","Water"});
		poke.put(119, new String[] {"Staryu","Water"});
		poke.put(120, new String[] {"Starmie","Water Psychic"});
		poke.put(121, new String[] {"Mr. Mime","Psychic Fairy"});
		poke.put(122, new String[] {"Scyther","Bug Flying"});
		poke.put(123, new String[] {"Jynx","Ice Psychic"});
		poke.put(124, new String[] {"Electabuzz","Electric"});
		poke.put(125, new String[] {"Magmar","Fire"});
		poke.put(126, new String[] {"Pinsir","Bug"});
		poke.put(127, new String[] {"Tauros","Normal"});
		poke.put(128, new String[] {"Magikarp","Water"});
		poke.put(129, new String[] {"Gyarados","Water Flying"});
		poke.put(130, new String[] {"Lapras","Water Ice"});
		poke.put(131, new String[] {"Ditto","Normal"});
		poke.put(132, new String[] {"Eevee","Normal"});
		poke.put(133, new String[] {"Vaporeon","Water"});
		poke.put(134, new String[] {"Jolteon","Electric"});
		poke.put(135, new String[] {"Flareon","Fire"});
		poke.put(136, new String[] {"Porygon","Normal"});
		poke.put(137, new String[] {"Omanyte","Rock Water"});
		poke.put(138, new String[] {"Omastar","Rock Water"});
		poke.put(139, new String[] {"Kabuto","Rock Water"});
		poke.put(140, new String[] {"Kabutops","Rock Water"});
		poke.put(141, new String[] {"Aerodactyl","Rock Flying"});
		poke.put(142, new String[] {"Snorlax","Normal"});
		poke.put(143, new String[] {"Articuno","Ice Flying"});
		poke.put(144, new String[] {"Zapdos","Electric Flying"});
		poke.put(145, new String[] {"Moltres","Fire Flying"});
		poke.put(146, new String[] {"Dratini","Dragon"});
		poke.put(147, new String[] {"Dragonair","Dragon"});
		poke.put(148, new String[] {"Dragonite","Dragon Flying"});
		poke.put(149, new String[] {"Mewtwo","Psychic"});
		poke.put(150, new String[] {"Mew","Psychic"});
		poke.put(151, new String[] {"Chikorita","Grass"});
		poke.put(152, new String[] {"Bayleef","Grass"});
		poke.put(153, new String[] {"Meganium","Grass"});
		poke.put(154, new String[] {"Cyndaquil","Fire"});
		poke.put(155, new String[] {"Quilava","Fire"});
		poke.put(156, new String[] {"Typhlosion","Fire"});
		poke.put(157, new String[] {"Totodile","Water"});
		poke.put(158, new String[] {"Croconaw","Water"});
		poke.put(159, new String[] {"Feraligatr","Water"});
		poke.put(160, new String[] {"Sentret","Normal"});
		poke.put(161, new String[] {"Furret","Normal"});
		poke.put(162, new String[] {"Hoothoot","Normal Flying"});
		poke.put(163, new String[] {"Noctowl","Normal Flying"});
		poke.put(164, new String[] {"Ledyba","Bug Flying"});
		poke.put(165, new String[] {"Ledian","Bug Flying"});
		poke.put(166, new String[] {"Spinarak","Bug Poison"});
		poke.put(167, new String[] {"Ariados","Bug Poison"});
		poke.put(168, new String[] {"Crobat","Poison Flying"});
		poke.put(169, new String[] {"Chinchou","Water Electric"});
		poke.put(170, new String[] {"Lanturn","Water Electric"});
		poke.put(171, new String[] {"Pichu","Electric"});
		poke.put(172, new String[] {"Cleffa","Fairy"});
		poke.put(173, new String[] {"Igglybuff","Normal Fairy"});
		poke.put(174, new String[] {"Togepi","Fairy"});
		poke.put(175, new String[] {"Togetic","Fairy Flying"});
		poke.put(176, new String[] {"Natu","Psychic Flying"});
		poke.put(177, new String[] {"Xatu","Psychic Flying"});
		poke.put(178, new String[] {"Mareep","Electric"});
		poke.put(179, new String[] {"Flaaffy","Electric"});
		poke.put(180, new String[] {"Ampharos","Electric"});
		poke.put(181, new String[] {"Bellossom","Grass"});
		poke.put(182, new String[] {"Marill","Water Fairy"});
		poke.put(183, new String[] {"Azumarill","Water Fairy"});
		poke.put(184, new String[] {"Sudowoodo","Rock"});
		poke.put(185, new String[] {"Politoed","Water"});
		poke.put(186, new String[] {"Hoppip","Grass Flying"});
		poke.put(187, new String[] {"Skiploom","Grass Flying"});
		poke.put(188, new String[] {"Jumpluff","Grass Flying"});
		poke.put(189, new String[] {"Aipom","Normal"});
		poke.put(190, new String[] {"Sunkern","Grass"});
		poke.put(191, new String[] {"Sunflora","Grass"});
		poke.put(192, new String[] {"Yanma","Bug Flying"});
		poke.put(193, new String[] {"Wooper","Water Ground"});
		poke.put(194, new String[] {"Quagsire","Water Ground"});
		poke.put(195, new String[] {"Espeon","Psychic"});
		poke.put(196, new String[] {"Umbreon","Dark"});
		poke.put(197, new String[] {"Murkrow","Dark Flying"});
		poke.put(198, new String[] {"Slowking","Water Psychic"});
		poke.put(199, new String[] {"Misdreavus","Ghost"});
		poke.put(200, new String[] {"Unown","Psychic"});
		poke.put(201, new String[] {"Wobbuffet","Psychic"});
		poke.put(202, new String[] {"Girafarig","Normal Psychic"});
		poke.put(203, new String[] {"Pineco","Bug"});
		poke.put(204, new String[] {"Forretress","Bug Steel"});
		poke.put(205, new String[] {"Dunsparce","Normal"});
		poke.put(206, new String[] {"Gligar","Ground Flying"});
		poke.put(207, new String[] {"Steelix","Steel Ground"});
		poke.put(208, new String[] {"Snubbull","Fairy"});
		poke.put(209, new String[] {"Granbull","Fairy"});
		poke.put(210, new String[] {"Qwilfish","Water Poison"});
		poke.put(211, new String[] {"Scizor","Bug Steel"});
		poke.put(212, new String[] {"Shuckle","Bug Rock"});
		poke.put(213, new String[] {"Heracross","Bug Fighting"});
		poke.put(214, new String[] {"Sneasel","Dark Ice"});
		poke.put(215, new String[] {"Teddiursa","Normal"});
		poke.put(216, new String[] {"Ursaring","Normal"});
		poke.put(217, new String[] {"Slugma","Fire"});
		poke.put(218, new String[] {"Magcargo","Fire Rock"});
		poke.put(219, new String[] {"Swinub","Ice Ground"});
		poke.put(220, new String[] {"Piloswine","Ice Ground"});
		poke.put(221, new String[] {"Corsola","Water Rock"});
		poke.put(222, new String[] {"Remoraid","Water"});
		poke.put(223, new String[] {"Octillery","Water"});
		poke.put(224, new String[] {"Delibird","Ice Flying"});
		poke.put(225, new String[] {"Mantine","Water Flying"});
		poke.put(226, new String[] {"Skarmory","Steel Flying"});
		poke.put(227, new String[] {"Houndour","Dark Fire"});
		poke.put(228, new String[] {"Houndoom","Dark Fire"});
		poke.put(229, new String[] {"Kingdra","Water Dragon"});
		poke.put(230, new String[] {"Phanpy","Ground"});
		poke.put(231, new String[] {"Donphan","Ground"});
		poke.put(232, new String[] {"Porygon2","Normal"});
		poke.put(233, new String[] {"Stantler","Normal"});
		poke.put(234, new String[] {"Smeargle","Normal"});
		poke.put(235, new String[] {"Tyrogue","Fighting"});
		poke.put(236, new String[] {"Hitmontop","Fighting"});
		poke.put(237, new String[] {"Smoochum","Ice Psychic"});
		poke.put(238, new String[] {"Elekid","Electric"});
		poke.put(239, new String[] {"Magby","Fire"});
		poke.put(240, new String[] {"Miltank","Normal"});
		poke.put(241, new String[] {"Blissey","Normal"});
		poke.put(242, new String[] {"Raikou","Electric"});
		poke.put(243, new String[] {"Entei","Fire"});
		poke.put(244, new String[] {"Suicune","Water"});
		poke.put(245, new String[] {"Larvitar","Rock Ground"});
		poke.put(246, new String[] {"Pupitar","Rock Ground"});
		poke.put(247, new String[] {"Tyranitar","Rock Dark"});
		poke.put(248, new String[] {"Lugia","Psychic Flying"});
		poke.put(249, new String[] {"Ho-oh","Fire Flying"});
		poke.put(250, new String[] {"Celebi","Psychic Grass"});
		poke.put(251, new String[] {"Treecko","Grass"});
		poke.put(252, new String[] {"Grovyle","Grass"});
		poke.put(253, new String[] {"Sceptile","Grass"});
		poke.put(254, new String[] {"Torchic","Fire"});
		poke.put(255, new String[] {"Combusken","Fire Fighting"});
		poke.put(256, new String[] {"Blaziken","Fire Fighting"});
		poke.put(257, new String[] {"Mudkip","Water"});
		poke.put(258, new String[] {"Marshtomp","Water Ground"});
		poke.put(259, new String[] {"Swampert","Water Ground"});
		poke.put(260, new String[] {"Poochyena","Dark"});
		poke.put(261, new String[] {"Mightyena","Dark"});
		poke.put(262, new String[] {"Zigzagoon","Normal"});
		poke.put(263, new String[] {"Linoone","Normal"});
		poke.put(264, new String[] {"Wurmple","Bug"});
		poke.put(265, new String[] {"Silcoon","Bug"});
		poke.put(266, new String[] {"Beautifly","Bug Flying"});
		poke.put(267, new String[] {"Cascoon","Bug"});
		poke.put(268, new String[] {"Dustox","Bug Poison"});
		poke.put(269, new String[] {"Lotad","Water Grass"});
		poke.put(270, new String[] {"Lombre","Water Grass"});
		poke.put(271, new String[] {"Ludicolo","Water Grass"});
		poke.put(272, new String[] {"Seedot","Grass"});
		poke.put(273, new String[] {"Nuzleaf","Grass Dark"});
		poke.put(274, new String[] {"Shiftry","Grass Dark"});
		poke.put(275, new String[] {"Taillow","Normal Flying"});
		poke.put(276, new String[] {"Swellow","Normal Flying"});
		poke.put(277, new String[] {"Wingull","Water Flying"});
		poke.put(278, new String[] {"Pelipper","Water Flying"});
		poke.put(279, new String[] {"Ralts","Psychic Fairy"});
		poke.put(280, new String[] {"Kirlia","Psychic Fairy"});
		poke.put(281, new String[] {"Gardevoir","Psychic Fairy"});
		poke.put(282, new String[] {"Surskit","Bug Water"});
		poke.put(283, new String[] {"Masquerain","Bug Flying"});
		poke.put(284, new String[] {"Shroomish","Grass"});
		poke.put(285, new String[] {"Breloom","Grass Fighting"});
		poke.put(286, new String[] {"Slakoth","Normal"});
		poke.put(287, new String[] {"Vigoroth","Normal"});
		poke.put(288, new String[] {"Slaking","Normal"});
		poke.put(289, new String[] {"Nincada","Bug Ground"});
		poke.put(290, new String[] {"Ninjask","Bug Flying"});
		poke.put(291, new String[] {"Shedinja","Bug Ghost"});
		poke.put(292, new String[] {"Whismur","Normal"});
		poke.put(293, new String[] {"Loudred","Normal"});
		poke.put(294, new String[] {"Exploud","Normal"});
		poke.put(295, new String[] {"Makuhita","Fighting"});
		poke.put(296, new String[] {"Hariyama","Fighting"});
		poke.put(297, new String[] {"Azurill","Normal Fairy"});
		poke.put(298, new String[] {"Nosepass","Rock"});
		poke.put(299, new String[] {"Skitty","Normal"});
		poke.put(300, new String[] {"Delcatty","Normal"});
		poke.put(301, new String[] {"Sableye","Dark Ghost"});
		poke.put(302, new String[] {"Mawile","Steel Fairy"});
		poke.put(303, new String[] {"Aron","Steel Rock"});
		poke.put(304, new String[] {"Lairon","Steel Rock"});
		poke.put(305, new String[] {"Aggron","Steel Rock"});
		poke.put(306, new String[] {"Meditite","Fighting Psychic"});
		poke.put(307, new String[] {"Medicham","Fighting Psychic"});
		poke.put(308, new String[] {"Electrike","Electric"});
		poke.put(309, new String[] {"Manectric","Electric"});
		poke.put(310, new String[] {"Plusle","Electric"});
		poke.put(311, new String[] {"Minun","Electric"});
		poke.put(312, new String[] {"Volbeat","Bug"});
		poke.put(313, new String[] {"Illumise","Bug"});
		poke.put(314, new String[] {"Roselia","Grass Poison"});
		poke.put(315, new String[] {"Gulpin","Poison"});
		poke.put(316, new String[] {"Swalot","Poison"});
		poke.put(317, new String[] {"Carvanha","Water Dark"});
		poke.put(318, new String[] {"Sharpedo","Water Dark"});
		poke.put(319, new String[] {"Wailmer","Water"});
		poke.put(320, new String[] {"Wailord","Water"});
		poke.put(321, new String[] {"Numel","Fire Ground"});
		poke.put(322, new String[] {"Camerupt","Fire Ground"});
		poke.put(323, new String[] {"Torkoal","Fire"});
		poke.put(324, new String[] {"Spoink","Psychic"});
		poke.put(325, new String[] {"Grumpig","Psychic"});
		poke.put(326, new String[] {"Spinda","Normal"});
		poke.put(327, new String[] {"Trapinch","Ground"});
		poke.put(328, new String[] {"Vibrava","Ground Dragon"});
		poke.put(329, new String[] {"Flygon","Ground Dragon"});
		poke.put(330, new String[] {"Cacnea","Grass"});
		poke.put(331, new String[] {"Cacturne","Grass Dark"});
		poke.put(332, new String[] {"Swablu","Normal Flying"});
		poke.put(333, new String[] {"Altaria","Dragon Flying"});
		poke.put(334, new String[] {"Zangoose","Normal"});
		poke.put(335, new String[] {"Seviper","Poison"});
		poke.put(336, new String[] {"Lunatone","Rock Psychic"});
		poke.put(337, new String[] {"Solrock","Rock Psychic"});
		poke.put(338, new String[] {"Barboach","Water Ground"});
		poke.put(339, new String[] {"Whiscash","Water Ground"});
		poke.put(340, new String[] {"Corphish","Water"});
		poke.put(341, new String[] {"Crawdaunt","Water Dark"});
		poke.put(342, new String[] {"Baltoy","Ground Psychic"});
		poke.put(343, new String[] {"Claydol","Ground Psychic"});
		poke.put(344, new String[] {"Lileep","Rock Grass"});
		poke.put(345, new String[] {"Cradily","Rock Grass"});
		poke.put(346, new String[] {"Anorith","Rock Bug"});
		poke.put(347, new String[] {"Armaldo","Rock Bug"});
		poke.put(348, new String[] {"Feebas","Water"});
		poke.put(349, new String[] {"Milotic","Water"});
		poke.put(350, new String[] {"Castform","Normal"});
		poke.put(351, new String[] {"Kecleon","Normal"});
		poke.put(352, new String[] {"Shuppet","Ghost"});
		poke.put(353, new String[] {"Banette","Ghost"});
		poke.put(354, new String[] {"Duskull","Ghost"});
		poke.put(355, new String[] {"Dusclops","Ghost"});
		poke.put(356, new String[] {"Tropius","Grass Flying"});
		poke.put(357, new String[] {"Chimecho","Psychic"});
		poke.put(358, new String[] {"Absol","Dark"});
		poke.put(359, new String[] {"Wynaut","Psychic"});
		poke.put(360, new String[] {"Snorunt","Ice"});
		poke.put(361, new String[] {"Glalie","Ice"});
		poke.put(362, new String[] {"Spheal","Ice Water"});
		poke.put(363, new String[] {"Sealeo","Ice Water"});
		poke.put(364, new String[] {"Walrein","Ice Water"});
		poke.put(365, new String[] {"Clamperl","Water"});
		poke.put(366, new String[] {"Huntail","Water"});
		poke.put(367, new String[] {"Gorebyss","Water"});
		poke.put(368, new String[] {"Relicanth","Water Rock"});
		poke.put(369, new String[] {"Luvdisc","Water"});
		poke.put(370, new String[] {"Bagon","Dragon"});
		poke.put(371, new String[] {"Shelgon","Dragon"});
		poke.put(372, new String[] {"Salamence","Dragon Flying"});
		poke.put(373, new String[] {"Beldum","Steel Psychic"});
		poke.put(374, new String[] {"Metang","Steel Psychic"});
		poke.put(375, new String[] {"Metagross","Steel Psychic"});
		poke.put(376, new String[] {"Regirock","Rock"});
		poke.put(377, new String[] {"Regice","Ice"});
		poke.put(378, new String[] {"Registeel","Steel"});
		poke.put(379, new String[] {"Latias","Dragon Psychic"});
		poke.put(380, new String[] {"Latios","Dragon Psychic"});
		poke.put(381, new String[] {"Kyogre","Water"});
		poke.put(382, new String[] {"Groudon","Ground"});
		poke.put(383, new String[] {"Rayquaza","Dragon Flying"});
		poke.put(384, new String[] {"Jirachi","Steel Psychic"});
		poke.put(385, new String[] {"Deoxys","Psychic"});
		poke.put(386, new String[] {"Turtwig","Grass"});
		poke.put(387, new String[] {"Grotle","Grass"});
		poke.put(388, new String[] {"Torterra","Grass Ground"});
		poke.put(389, new String[] {"Chimchar","Fire"});
		poke.put(390, new String[] {"Monferno","Fire Fighting"});
		poke.put(391, new String[] {"Infernape","Fire Fighting"});
		poke.put(392, new String[] {"Piplup","Water"});
		poke.put(393, new String[] {"Prinplup","Water"});
		poke.put(394, new String[] {"Empoleon","Water Steel"});
		poke.put(395, new String[] {"Starly","Normal Flying"});
		poke.put(396, new String[] {"Staravia","Normal Flying"});
		poke.put(397, new String[] {"Staraptor","Normal Flying"});
		poke.put(398, new String[] {"Bidoof","Normal"});
		poke.put(399, new String[] {"Bibarel","Normal Water"});
		poke.put(400, new String[] {"Kricketot","Bug"});
		poke.put(401, new String[] {"Kricketune","Bug"});
		poke.put(402, new String[] {"Shinx","Electric"});
		poke.put(403, new String[] {"Luxio","Electric"});
		poke.put(404, new String[] {"Luxray","Electric"});
		poke.put(405, new String[] {"Budew","Grass Poison"});
		poke.put(406, new String[] {"Roserade","Grass Poison"});
		poke.put(407, new String[] {"Cranidos","Rock"});
		poke.put(408, new String[] {"Rampardos","Rock"});
		poke.put(409, new String[] {"Shieldon","Rock Steel"});
		poke.put(410, new String[] {"Bastiodon","Rock Steel"});
		poke.put(411, new String[] {"Burmy","Bug"});
		poke.put(412, new String[] {"Wormadam","Bug Grass"});
		poke.put(413, new String[] {"Mothim","Bug Flying"});
		poke.put(414, new String[] {"Combee","Bug Flying"});
		poke.put(415, new String[] {"Vespiquen","Bug Flying"});
		poke.put(416, new String[] {"Pachirisu","Electric"});
		poke.put(417, new String[] {"Buizel","Water"});
		poke.put(418, new String[] {"Floatzel","Water"});
		poke.put(419, new String[] {"Cherubi","Grass"});
		poke.put(420, new String[] {"Cherrim","Grass"});
		poke.put(421, new String[] {"Shellos","Water"});
		poke.put(422, new String[] {"Gastrodon","Water Ground"});
		poke.put(423, new String[] {"Ambipom","Normal"});
		poke.put(424, new String[] {"Drifloon","Ghost Flying"});
		poke.put(425, new String[] {"Drifblim","Ghost Flying"});
		poke.put(426, new String[] {"Buneary","Normal"});
		poke.put(427, new String[] {"Lopunny","Normal"});
		poke.put(428, new String[] {"Mismagius","Ghost"});
		poke.put(429, new String[] {"Honchkrow","Dark Flying"});
		poke.put(430, new String[] {"Glameow","Normal"});
		poke.put(431, new String[] {"Purugly","Normal"});
		poke.put(432, new String[] {"Chingling","Psychic"});
		poke.put(433, new String[] {"Stunky","Poison Dark"});
		poke.put(434, new String[] {"Skuntank","Poison Dark"});
		poke.put(435, new String[] {"Bronzor","Steel Psychic"});
		poke.put(436, new String[] {"Bronzong","Steel Psychic"});
		poke.put(437, new String[] {"Bonsly","Rock"});
		poke.put(438, new String[] {"Mime Jr.","Psychic Fairy"});
		poke.put(439, new String[] {"Happiny","Normal"});
		poke.put(440, new String[] {"Chatot","Normal Flying"});
		poke.put(441, new String[] {"Spiritomb","Ghost Dark"});
		poke.put(442, new String[] {"Gible","Dragon Ground"});
		poke.put(443, new String[] {"Gabite","Dragon Ground"});
		poke.put(444, new String[] {"Garchomp","Dragon Ground"});
		poke.put(445, new String[] {"Munchlax","Normal"});
		poke.put(446, new String[] {"Riolu","Fighting"});
		poke.put(447, new String[] {"Lucario","Fighting Steel"});
		poke.put(448, new String[] {"Hippopotas","Ground"});
		poke.put(449, new String[] {"Hippowdon","Ground"});
		poke.put(450, new String[] {"Skorupi","Poison Bug"});
		poke.put(451, new String[] {"Drapion","Poison Dark"});
		poke.put(452, new String[] {"Croagunk","Poison Fighting"});
		poke.put(453, new String[] {"Toxicroak","Poison Fighting"});
		poke.put(454, new String[] {"Carnivine","Grass"});
		poke.put(455, new String[] {"Finneon","Water"});
		poke.put(456, new String[] {"Lumineon","Water"});
		poke.put(457, new String[] {"Mantyke","Water Flying"});
		poke.put(458, new String[] {"Snover","Grass Ice"});
		poke.put(459, new String[] {"Abomasnow","Grass Ice"});
		poke.put(460, new String[] {"Weavile","Dark Ice"});
		poke.put(461, new String[] {"Magnezone","Electric Steel"});
		poke.put(462, new String[] {"Lickilicky","Normal"});
		poke.put(463, new String[] {"Rhyperior","Ground Rock"});
		poke.put(464, new String[] {"Tangrowth","Grass"});
		poke.put(465, new String[] {"Electivire","Electric"});
		poke.put(466, new String[] {"Magmortar","Fire"});
		poke.put(467, new String[] {"Togekiss","Fairy Flying"});
		poke.put(468, new String[] {"Yanmega","Bug Flying"});
		poke.put(469, new String[] {"Leafeon","Grass"});
		poke.put(470, new String[] {"Glaceon","Ice"});
		poke.put(471, new String[] {"Gliscor","Ground Flying"});
		poke.put(472, new String[] {"Mamoswine","Ice Ground"});
		poke.put(473, new String[] {"Porygon-Z","Normal"});
		poke.put(474, new String[] {"Gallade","Psychic Fighting"});
		poke.put(475, new String[] {"Probopass","Rock Steel"});
		poke.put(476, new String[] {"Dusknoir","Ghost"});
		poke.put(477, new String[] {"Froslass","Ice Ghost"});
		poke.put(478, new String[] {"Rotom","Electric Ghost"});
		poke.put(479, new String[] {"Uxie","Psychic"});
		poke.put(480, new String[] {"Mesprit","Psychic"});
		poke.put(481, new String[] {"Azelf","Psychic"});
		poke.put(482, new String[] {"Dialga","Steel Dragon"});
		poke.put(483, new String[] {"Palkia","Water Dragon"});
		poke.put(484, new String[] {"Heatran","Fire Steel"});
		poke.put(485, new String[] {"Regigigas","Normal"});
		poke.put(486, new String[] {"Giratina","Ghost Dragon"});
		poke.put(487, new String[] {"Cresselia","Psychic"});
		poke.put(488, new String[] {"Phione","Water"});
		poke.put(489, new String[] {"Manaphy","Water"});
		poke.put(490, new String[] {"Darkrai","Dark"});
		poke.put(491, new String[] {"Shaymin","Grass"});
		poke.put(492, new String[] {"Arceus","Normal"});
		poke.put(493, new String[] {"Victini","Psychic Fire"});
		poke.put(494, new String[] {"Snivy","Grass"});
		poke.put(495, new String[] {"Servine","Grass"});
		poke.put(496, new String[] {"Serperior","Grass"});
		poke.put(497, new String[] {"Tepig","Fire"});
		poke.put(498, new String[] {"Pignite","Fire Fighting"});
		poke.put(499, new String[] {"Emboar","Fire Fighting"});
		poke.put(500, new String[] {"Oshawott","Water"});
		poke.put(501, new String[] {"Dewott","Water"});
		poke.put(502, new String[] {"Samurott","Water"});
		poke.put(503, new String[] {"Patrat","Normal"});
		poke.put(504, new String[] {"Watchog","Normal"});
		poke.put(505, new String[] {"Lillipup","Normal"});
		poke.put(506, new String[] {"Herdier","Normal"});
		poke.put(507, new String[] {"Stoutland","Normal"});
		poke.put(508, new String[] {"Purrloin","Dark"});
		poke.put(509, new String[] {"Liepard","Dark"});
		poke.put(510, new String[] {"Pansage","Grass"});
		poke.put(511, new String[] {"Simisage","Grass"});
		poke.put(512, new String[] {"Pansear","Fire"});
		poke.put(513, new String[] {"Simisear","Fire"});
		poke.put(514, new String[] {"Panpour","Water"});
		poke.put(515, new String[] {"Simipour","Water"});
		poke.put(516, new String[] {"Munna","Psychic"});
		poke.put(517, new String[] {"Musharna","Psychic"});
		poke.put(518, new String[] {"Pidove","Normal Flying"});
		poke.put(519, new String[] {"Tranquill","Normal Flying"});
		poke.put(520, new String[] {"Unfezant","Normal Flying"});
		poke.put(521, new String[] {"Blitzle","Electric"});
		poke.put(522, new String[] {"Zebstrika","Electric"});
		poke.put(523, new String[] {"Roggenrola","Rock"});
		poke.put(524, new String[] {"Boldore","Rock"});
		poke.put(525, new String[] {"Gigalith","Rock"});
		poke.put(526, new String[] {"Woobat","Psychic Flying"});
		poke.put(527, new String[] {"Swoobat","Psychic Flying"});
		poke.put(528, new String[] {"Drilbur","Ground"});
		poke.put(529, new String[] {"Excadrill","Ground Steel"});
		poke.put(530, new String[] {"Audino","Normal"});
		poke.put(531, new String[] {"Timburr","Fighting"});
		poke.put(532, new String[] {"Gurdurr","Fighting"});
		poke.put(533, new String[] {"Conkeldurr","Fighting"});
		poke.put(534, new String[] {"Tympole","Water"});
		poke.put(535, new String[] {"Palpitoad","Water Ground"});
		poke.put(536, new String[] {"Seismitoad","Water Ground"});
		poke.put(537, new String[] {"Throh","Fighting"});
		poke.put(538, new String[] {"Sawk","Fighting"});
		poke.put(539, new String[] {"Sewaddle","Bug Grass"});
		poke.put(540, new String[] {"Swadloon","Bug Grass"});
		poke.put(541, new String[] {"Leavanny","Bug Grass"});
		poke.put(542, new String[] {"Venipede","Bug Poison"});
		poke.put(543, new String[] {"Whirlipede","Bug Poison"});
		poke.put(544, new String[] {"Scolipede","Bug Poison"});
		poke.put(545, new String[] {"Cottonee","Grass Fairy"});
		poke.put(546, new String[] {"Whimsicott","Grass Fairy"});
		poke.put(547, new String[] {"Petilil","Grass"});
		poke.put(548, new String[] {"Lilligant","Grass"});
		poke.put(549, new String[] {"Basculin","Water"});
		poke.put(550, new String[] {"Sandile","Ground Dark"});
		poke.put(551, new String[] {"Krokorok","Ground Dark"});
		poke.put(552, new String[] {"Krookodile","Ground Dark"});
		poke.put(553, new String[] {"Darumaka","Fire"});
		poke.put(554, new String[] {"Darmanitan","Fire"});
		poke.put(555, new String[] {"Maractus","Grass"});
		poke.put(556, new String[] {"Dwebble","Bug Rock"});
		poke.put(557, new String[] {"Crustle","Bug Rock"});
		poke.put(558, new String[] {"Scraggy","Dark Fighting"});
		poke.put(559, new String[] {"Scrafty","Dark Fighting"});
		poke.put(560, new String[] {"Sigilyph","Psychic Flying"});
		poke.put(561, new String[] {"Yamask","Ghost"});
		poke.put(562, new String[] {"Cofagrigus","Ghost"});
		poke.put(563, new String[] {"Tirtouga","Water Rock"});
		poke.put(564, new String[] {"Carracosta","Water Rock"});
		poke.put(565, new String[] {"Archen","Rock Flying"});
		poke.put(566, new String[] {"Archeops","Rock Flying"});
		poke.put(567, new String[] {"Trubbish","Poison"});
		poke.put(568, new String[] {"Garbodor","Poison"});
		poke.put(569, new String[] {"Zorua","Dark"});
		poke.put(570, new String[] {"Zoroark","Dark"});
		poke.put(571, new String[] {"Minccino","Normal"});
		poke.put(572, new String[] {"Cinccino","Normal"});
		poke.put(573, new String[] {"Gothita","Psychic"});
		poke.put(574, new String[] {"Gothorita","Psychic"});
		poke.put(575, new String[] {"Gothitelle","Psychic"});
		poke.put(576, new String[] {"Solosis","Psychic"});
		poke.put(577, new String[] {"Duosion","Psychic"});
		poke.put(578, new String[] {"Reuniclus","Psychic"});
		poke.put(579, new String[] {"Ducklett","Water Flying"});
		poke.put(580, new String[] {"Swanna","Water Flying"});
		poke.put(581, new String[] {"Vanillite","Ice"});
		poke.put(582, new String[] {"Vanillish","Ice"});
		poke.put(583, new String[] {"Vanilluxe","Ice"});
		poke.put(584, new String[] {"Deerling","Normal Grass"});
		poke.put(585, new String[] {"Sawsbuck","Normal Grass"});
		poke.put(586, new String[] {"Emolga","Electric Flying"});
		poke.put(587, new String[] {"Karrablast","Bug"});
		poke.put(588, new String[] {"Escavalier","Bug Steel"});
		poke.put(589, new String[] {"Foongus","Grass Poison"});
		poke.put(590, new String[] {"Amoonguss","Grass Poison"});
		poke.put(591, new String[] {"Frillish","Water Ghost"});
		poke.put(592, new String[] {"Jellicent","Water Ghost"});
		poke.put(593, new String[] {"Alomomola","Water"});
		poke.put(594, new String[] {"Joltik","Bug Electric"});
		poke.put(595, new String[] {"Galvantula","Bug Electric"});
		poke.put(596, new String[] {"Ferroseed","Grass Steel"});
		poke.put(597, new String[] {"Ferrothorn","Grass Steel"});
		poke.put(598, new String[] {"Klink","Steel"});
		poke.put(599, new String[] {"Klang","Steel"});
		poke.put(600, new String[] {"Klinklang","Steel"});
		poke.put(601, new String[] {"Tynamo","Electric"});
		poke.put(602, new String[] {"Eelektrik","Electric"});
		poke.put(603, new String[] {"Eelektross","Electric"});
		poke.put(604, new String[] {"Elgyem","Psychic"});
		poke.put(605, new String[] {"Beheeyem","Psychic"});
		poke.put(606, new String[] {"Litwick","Ghost Fire"});
		poke.put(607, new String[] {"Lampent","Ghost Fire"});
		poke.put(608, new String[] {"Chandelure","Ghost Fire"});
		poke.put(609, new String[] {"Axew","Dragon"});
		poke.put(610, new String[] {"Fraxure","Dragon"});
		poke.put(611, new String[] {"Haxorus","Dragon"});
		poke.put(612, new String[] {"Cubchoo","Ice"});
		poke.put(613, new String[] {"Beartic","Ice"});
		poke.put(614, new String[] {"Cryogonal","Ice"});
		poke.put(615, new String[] {"Shelmet","Bug"});
		poke.put(616, new String[] {"Accelgor","Bug"});
		poke.put(617, new String[] {"Stunfisk","Electric Ground"});
		poke.put(618, new String[] {"Mienfoo","Fighting"});
		poke.put(619, new String[] {"Mienshao","Fighting"});
		poke.put(620, new String[] {"Druddigon","Dragon"});
		poke.put(621, new String[] {"Golett","Ground Ghost"});
		poke.put(622, new String[] {"Golurk","Ground Ghost"});
		poke.put(623, new String[] {"Pawniard","Dark Steel"});
		poke.put(624, new String[] {"Bisharp","Dark Steel"});
		poke.put(625, new String[] {"Bouffalant","Normal"});
		poke.put(626, new String[] {"Rufflet","Normal Flying"});
		poke.put(627, new String[] {"Braviary","Normal Flying"});
		poke.put(628, new String[] {"Vullaby","Dark Flying"});
		poke.put(629, new String[] {"Mandibuzz","Dark Flying"});
		poke.put(630, new String[] {"Heatmor","Fire"});
		poke.put(631, new String[] {"Durant","Bug Steel"});
		poke.put(632, new String[] {"Deino","Dark Dragon"});
		poke.put(633, new String[] {"Zweilous","Dark Dragon"});
		poke.put(634, new String[] {"Hydreigon","Dark Dragon"});
		poke.put(635, new String[] {"Larvesta","Bug Fire"});
		poke.put(636, new String[] {"Volcarona","Bug Fire"});
		poke.put(637, new String[] {"Cobalion","Steel Fighting"});
		poke.put(638, new String[] {"Terrakion","Rock Fighting"});
		poke.put(639, new String[] {"Virizion","Grass Fighting"});
		poke.put(640, new String[] {"Tornadus","Flying"});
		poke.put(641, new String[] {"Thundurus","Electric Flying"});
		poke.put(642, new String[] {"Reshiram","Dragon Fire"});
		poke.put(643, new String[] {"Zekrom","Dragon Electric"});
		poke.put(644, new String[] {"Landorus","Ground Flying"});
		poke.put(645, new String[] {"Kyurem","Dragon Ice"});
		poke.put(646, new String[] {"Keldeo","Water Fighting"});
		poke.put(647, new String[] {"Meloetta","Normal Psychic"});
		poke.put(648, new String[] {"Genesect","Bug Steel"});
		poke.put(649, new String[] {"Chespin","Grass"});
		poke.put(650, new String[] {"Quilladin","Grass"});
		poke.put(651, new String[] {"Chesnaught","Grass Fighting"});
		poke.put(652, new String[] {"Fennekin","Fire"});
		poke.put(653, new String[] {"Braixen","Fire"});
		poke.put(654, new String[] {"Delphox","Fire Psychic"});
		poke.put(655, new String[] {"Froakie","Water"});
		poke.put(656, new String[] {"Frogadier","Water"});
		poke.put(657, new String[] {"Greninja","Water Dark"});
		poke.put(658, new String[] {"Bunnelby","Normal"});
		poke.put(659, new String[] {"Diggersby","Normal Ground"});
		poke.put(660, new String[] {"Fletchling","Normal Flying"});
		poke.put(661, new String[] {"Fletchinder","Fire Flying"});
		poke.put(662, new String[] {"Talonflame","Fire Flying"});
		poke.put(663, new String[] {"Scatterbug","Bug"});
		poke.put(664, new String[] {"Spewpa","Bug"});
		poke.put(665, new String[] {"Vivillon","Bug Flying"});
		poke.put(666, new String[] {"Litleo","Fire Normal"});
		poke.put(667, new String[] {"Pyroar","Fire Normal"});
		poke.put(668, new String[] {"Flabébé","Fairy"});
		poke.put(669, new String[] {"Floette","Fairy"});
		poke.put(670, new String[] {"Florges","Fairy"});
		poke.put(671, new String[] {"Skiddo","Grass"});
		poke.put(672, new String[] {"Gogoat","Grass"});
		poke.put(673, new String[] {"Pancham","Fighting"});
		poke.put(674, new String[] {"Pangoro","Fighting Dark"});
		poke.put(675, new String[] {"Furfrou","Normal"});
		poke.put(676, new String[] {"Espurr","Psychic"});
		poke.put(677, new String[] {"Meowstic","Psychic"});
		poke.put(678, new String[] {"Honedge","Steel Ghost"});
		poke.put(679, new String[] {"Doublade","Steel Ghost"});
		poke.put(680, new String[] {"Aegislash","Steel Ghost"});
		poke.put(681, new String[] {"Spritzee","Fairy"});
		poke.put(682, new String[] {"Aromatisse","Fairy"});
		poke.put(683, new String[] {"Swirlix","Fairy"});
		poke.put(684, new String[] {"Slurpuff","Fairy"});
		poke.put(685, new String[] {"Inkay","Dark Psychic"});
		poke.put(686, new String[] {"Malamar","Dark Psychic"});
		poke.put(687, new String[] {"Binacle","Rock Water"});
		poke.put(688, new String[] {"Barbaracle","Rock Water"});
		poke.put(689, new String[] {"Skrelp","Poison Water"});
		poke.put(690, new String[] {"Dragalge","Poison Dragon"});
		poke.put(691, new String[] {"Clauncher","Water"});
		poke.put(692, new String[] {"Clawitzer","Water"});
		poke.put(693, new String[] {"Helioptile","Electric Normal"});
		poke.put(694, new String[] {"Heliolisk","Electric Normal"});
		poke.put(695, new String[] {"Tyrunt","Rock Dragon"});
		poke.put(696, new String[] {"Tyrantrum","Rock Dragon"});
		poke.put(697, new String[] {"Amaura","Rock Ice"});
		poke.put(698, new String[] {"Aurorus","Rock Ice"});
		poke.put(699, new String[] {"Sylveon","Fairy"});
		poke.put(700, new String[] {"Hawlucha","Fighting Flying"});
		poke.put(701, new String[] {"Dedenne","Electric Fairy"});
		poke.put(702, new String[] {"Carbink","Rock Fairy"});
		poke.put(703, new String[] {"Goomy","Dragon"});
		poke.put(704, new String[] {"Sliggoo","Dragon"});
		poke.put(705, new String[] {"Goodra","Dragon"});
		poke.put(706, new String[] {"Klefki","Steel Fairy"});
		poke.put(707, new String[] {"Phantump","Ghost Grass"});
		poke.put(708, new String[] {"Trevenant","Ghost Grass"});
		poke.put(709, new String[] {"Pumpkaboo","Ghost Grass"});
		poke.put(710, new String[] {"Gourgeist","Ghost Grass"});
		poke.put(711, new String[] {"Bergmite","Ice"});
		poke.put(712, new String[] {"Avalugg","Ice"});
		poke.put(713, new String[] {"Noibat","Flying Dragon"});
		poke.put(714, new String[] {"Noivern","Flying Dragon"});
		poke.put(715, new String[] {"Xerneas","Fairy"});
		poke.put(716, new String[] {"Yveltal","Dark Flying"});
		poke.put(717, new String[] {"Zygarde","Dragon Ground"});
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(br.readLine());
		System.out.println(poke.get(n-1)[0]);
		System.out.println(poke.get(n-1)[1]);
		
	}

}