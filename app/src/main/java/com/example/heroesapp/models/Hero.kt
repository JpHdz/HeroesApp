package com.example.heroesapp.models

data class Hero(val id: Int, val name: String, val description: String, val image: String, val publisherId: Int){
    companion object {
        val heroes = mutableListOf<Hero>(
            Hero(
                1,
                "Superman",
                "Aka Starman. \n" + "El 'yo cree esta compañia'. \n" + "James Gunn en ti confio. \n" + "Perdonalos Cavil. Snyder no te merecia \nSuperman es un superhéroe ficticio creado en 1938 por Jerry Siegel y Joe Shuster. Es un extraterrestre del planeta Krypton, cuyo nombre original es Kal-El. Después de ser enviado a la Tierra cuando su planeta fue destruido, fue adoptado por una familia humana y criado como Clark Kent. Con poderes extraordinarios como fuerza sobrehumana, vuelo, visión de rayos X, y velocidad increíble, Superman usa sus habilidades para proteger a la humanidad como símbolo de justicia, verdad y esperanza, mientras mantiene una identidad secreta como periodista.",
                "https://cdn.mos.cms.futurecdn.net/996cuh5rzdKuFEH2X8r2VW.jpg",
                2
            ),
            Hero(
                2,
                "Batman",
                "EL UNICO Y VERDADERO GOAT \n. BATMAN DARK KNIGHT >>>> todo \nBatman es un superhéroe ficticio creado por Bob Kane y Bill Finger en 1939. Su identidad secreta es Bruce Wayne, un multimillonario de Gotham City que, tras presenciar el asesinato de sus padres cuando era niño, juró combatir el crimen. A diferencia de otros héroes, Batman no posee superpoderes, sino que se apoya en su intelecto, habilidades de combate, tecnología avanzada y su astucia para enfrentar a los criminales. Conocido como \"El Caballero Oscuro\", protege Gotham usando su identidad enmascarada, siendo símbolo de venganza y justicia.",
                "https://i0.wp.com/codigoespagueti.com/wp-content/uploads/2021/02/batman-dc-comics.jpg",
                2
            ),
            Hero(
                3,
                "Wonder Woman",
                "Solita se solea a tu superheroe fav. \nTequieromucho Gal Gadot \n Wonder Woman es una superheroína creada por William Moulton Marston en 1941. Su verdadero nombre es Diana, princesa de las Amazonas, una raza de mujeres guerreras de la mitología griega. Nacida en la isla de Themyscira y bendecida por los dioses, Wonder Woman posee habilidades sobrehumanas como fuerza, velocidad, vuelo, y resistencia. También es experta en combate y utiliza armas icónicas como el Lazo de la Verdad y los brazaletes indestructibles. Diana lucha por la paz, la justicia y la igualdad, representando un símbolo de poder y compasión en el universo DC.",
                "https://storage.googleapis.com/pod_public/1300/116152.jpg",
                2
            ),
            Hero(
                4,
                "Flash",
                "El segundo GOAT \n Nerfeado por el bien de la trama \n CW ya we \n Gustin Grant regresa por favor. \n La peli de flash nunca paso \n Flash es un superhéroe del universo DC, creado por Gardner Fox y Harry Lampert en 1940. Su identidad más conocida es Barry Allen, un científico forense que obtiene su supervelocidad tras un accidente en su laboratorio cuando es alcanzado por un rayo y bañado en productos químicos. Flash puede moverse a velocidades extremas, manipular el tiempo, y acceder a la Fuerza de la Velocidad, una fuente de energía mística. Es conocido como \"El Hombre más Rápido del Mundo\" y utiliza sus habilidades para combatir el crimen y proteger a Central City.",
                "https://www.watchmojo.com/uploads/thumbs720/Fi-M-Top10-Flash-Comics-You-Should-Read-720p30.jpg",
                2
            ),
            Hero(
                5,
                "Green Lantern",
                "La neta no estuvo tan mala \n Que buen lore Green Lantern es un superhéroe del universo DC creado por Bill Finger y Martin Nodell en 1940. Varios personajes han llevado el título de Green Lantern, siendo Hal Jordan el más conocido. Los Green Lanterns son miembros de una fuerza policial intergaláctica llamada Green Lantern Corps, que protege el universo usando anillos de poder que pueden crear construcciones de energía pura basadas en la fuerza de voluntad. Hal Jordan, un piloto de pruebas, fue elegido por el anillo debido a su valentía y determinación, y usa su poder para defender la Tierra y el cosmos de amenazas intergalácticas.",
                "https://static1.srcdn.com/wordpress/wp-content/uploads/2020/04/Green-Lantern-Sinestro-Corps-War-Art.jpg",
                2
            ),
            Hero(
                6,
                "Aquaman",
                "Lit si te este es tu favorito eres mi compa el de los gustos raros \n El the deep original \n Jason Momoa que grande \n Aquaman es un superhéroe de DC Comics creado por Paul Norris y Mort Weisinger en 1941. Su identidad más conocida es Arthur Curry, el hijo de un farero humano y Atlanna, la reina de Atlantis. Como gobernante de Atlantis, Aquaman posee una conexión única con el océano, pudiendo comunicarse telepáticamente con la vida marina. Tiene fuerza sobrehumana, la capacidad de respirar bajo el agua, y puede nadar a velocidades increíbles. Como protector tanto de la superficie como del reino submarino, Aquaman lucha por mantener el equilibrio entre ambos mundos.",
                "https://img.rtve.es/imagenes/aquaman-75-anos-nadando-contra-mal/1482841807149.jpg",
                2
            ),
            Hero(
                7,
                "Green Arrow",
                "Green Arrow >>>>>>>> Hawkeye \n Es un papucho \n Solito contra darkside papa \n Green Arrow es un superhéroe de DC Comics creado por Mort Weisinger y George Papp en 1941. Su identidad secreta es Oliver Queen, un millonario y empresario que, tras naufragar en una isla desierta, se convirtió en un experto arquero. Inspirado por Robin Hood, usa su arco y flechas especiales, así como su aguda inteligencia y habilidades de combate, para luchar contra el crimen en Star City. Aunque no tiene superpoderes, Green Arrow es conocido por su destreza con el arco y su fuerte sentido de justicia social, a menudo aliándose con otros héroes como parte de la Liga de la Justicia.",
                "https://i.ytimg.com/vi/xSBAO-kChGk/maxresdefault.jpg",
                2
            ),
            Hero(
                8,
                "Zatanna",
                "Simplemente. AY WEY \n Zatanna es una superheroína de DC Comics, creada por Gardner Fox y Murphy Anderson en 1964. Es una poderosa hechicera y la hija del famoso mago Giovanni \"John\" Zatara. Zatanna posee habilidades mágicas que le permiten realizar hechizos al recitar palabras al revés. Es conocida tanto por su destreza en las artes místicas como por su carrera como ilusionista profesional. A lo largo de los años, ha sido miembro clave de equipos como la Liga de la Justicia y la Liga de la Justicia Oscura, usando su magia para combatir amenazas sobrenaturales y proteger el mundo de lo oculto.",
                "https://static1.cbrimages.com/wordpress/wp-content/uploads/2024/03/zatanna-bring-down-the-house-banner.jpg",
                2
            ),
            Hero(
                9,
                "Damian Wayne",
                "Asi como lo ves se papeo a batman \n El mero robin \n Damian Wayne es un personaje de DC Comics, creado por Grant Morrison y Andy Kubert en 2006. Es el hijo biológico de Bruce Wayne (Batman) y Talia al Ghul, lo que lo convierte en el nieto de Ra's al Ghul. Criado por la Liga de Asesinos, Damian fue entrenado desde niño en artes marciales y habilidades letales, lo que le da una ventaja única en combate. A pesar de su crianza violenta, Damian finalmente se une a su padre y asume el papel de Robin, luchando junto a Batman. Aunque es arrogante y obstinado, Damian lucha por controlar su lado oscuro y seguir el camino heroico de su padre.",
                "https://images.squarespace-cdn.com/content/v1/5fbc4a62c2150e62cfcb09aa/1676201599561-WNTLRPT9075Y070VFMR9/damian-wayne-7d-1280x720.jpg",
                2
            ),
            Hero(
                10,
                "Supergirl",
                "Aguas con su version hardcore\nSin pex se solea a tus 5 heroes fav.\nMilly Alcock en ti confio \n Supergirl es una superheroína del universo DC, creada por Otto Binder y Al Plastino en 1959. Su nombre verdadero es Kara Zor-El, y es la prima de Superman (Kal-El). Al igual que Superman, Kara es originaria del planeta Krypton y posee habilidades similares, como super fuerza, velocidad, vuelo, y visión de rayos X. Después de la destrucción de Krypton, Kara fue enviada a la Tierra para proteger a su primo, pero su nave quedó atrapada en el espacio, y ella llegó a la Tierra más tarde, cuando ya se había establecido Superman. Aunque a menudo enfrenta desafíos por ser una heroína joven en la sombra de su primo, Supergirl es conocida por su valentía, determinación y fuerte sentido de justicia.",
                "https://www.latercera.com/resizer/ub0Vhe6vrEYcQ3pe_dGrzDg2uLE=/arc-anglerfish-arc2-prod-copesa/public/5SUQ2RZJFJC73GVIATBCYQDPME.jpg",
                2
            ),
            Hero(
                11,
                "Capitan America",
                "Mi compa el 'si wey es natural por?' \n Este wey es la primera razon por la que tus tias te acompañaban al cine \n Si Roger, todos entendemos porque te quedaste alla \n \n" +
                        "Capitán América es un superhéroe de Marvel Comics creado por Joe Simon y Jack Kirby en 1941. Su identidad secreta es Steve Rogers, un joven que, durante la Segunda Guerra Mundial, recibe un suero del súper soldado que lo transforma en un hombre de fuerza y agilidad sobrehumanas. Equipado con un escudo indestructible, Capitán América se convierte en el líder del grupo de héroes conocido como los Vengadores. Es conocido por su valentía, liderazgo y firme sentido de justicia, así como por su emblemático traje con los colores de la bandera de Estados Unidos. Aunque originalmente combatió en la Segunda Guerra Mundial, es descongelado en tiempos modernos y sigue luchando por la libertad y la justicia.",
                "https://img.asmedia.epimg.net/resizer/v2/OBJTVLMDMJBODL2QUAPXTCJVXI.jpg?auth=b6060831d1fc09f4a13503effda96e7aff9864594aab80153acb157924d03898&width=1472&height=828&smart=true",
                1
            ),
            Hero(
                12,
                "Iron Man",
                "Este wey se cargo un universo entero y le hizo mas millones a disney que cualquier otra franquicia \n RDJ te quiero mucho \n End Game simplemente cine \n Iron Man es un superhéroe de Marvel Comics creado por Stan Lee, Larry Lieber, Don Heck y Jack Kirby en 1963. Su identidad secreta es Tony Stark, un millonario y genio inventor que dirige Stark Industries. Después de ser gravemente herido en un ataque, Tony utiliza su intelecto para construir una armadura de alta tecnología que le permite sobrevivir y, a la vez, convertirse en el superhéroe Iron Man. La armadura le otorga una fuerza sobrehumana, vuelo, y una variedad de armas y gadgets avanzados. Iron Man es conocido por su ingenio, habilidades tecnológicas y su papel como uno de los fundadores de los Vengadores, a menudo enfrentando amenazas tanto globales como intergalácticas.",
                "https://weirdsciencemarvelcomics.com/wp-content/uploads/2023/07/invincible-iron-man-8-featured.jpg",
                1
            ),
            Hero(
                13,
                "Thor",
                "Otro wey nerfeado por la trama \n La segunda razon por la que tus tias te acpompañaban al cine \n Ya duerman a taika waititi \n Thor es un superhéroe de Marvel Comics creado por Stan Lee, Larry Lieber y Jack Kirby en 1962. Basado en el dios nórdico del trueno, Thor es el hijo de Odín, el rey de Asgard. Su identidad secreta en la Tierra es Donald Blake, un médico que, al golpear un bastón en el suelo, se transforma en Thor. Equipado con el martillo mágico Mjolnir, que le otorga fuerza sobrehumana, control sobre el trueno y la capacidad de volar, Thor protege tanto Asgard como la Tierra de amenazas cósmicas y mitológicas. Es conocido por su valentía, nobleza y su papel como miembro destacado de los Vengadores.",
                "https://imgix.ranker.com/list_img_v2/7409/2647409/original/best-thor-comics-storylines-u2?fit=crop&fm=pjpg&q=80&dpr=2&w=1200&h=720",
                1
            ),
            Hero(
                14,
                "Wolverine",
                "Un verdadero hombre nunca habla mal de wolverine \n Hugh Jackman GOAT \n Logan fokin cinema \n Estas tan hermoso como el dia en que te fuiste \n Wolverine es un superhéroe de Marvel Comics creado por Roy Thomas, Len Wein y John Romita Sr. en 1974. Su nombre real es James Howlett, pero es más conocido como Logan. Wolverine es un mutante con un factor de curación acelerado que le permite recuperarse de heridas y enfermedades, así como una longevidad excepcional. Sus características más distintivas son sus garras retractiles de adamantium, un metal indestructible que también recubre su esqueleto. Su naturaleza brutal y su habilidad para el combate lo convierten en un formidable luchador. Wolverine ha sido miembro de varios equipos de héroes, incluyendo los X-Men y los Vengadores, y es conocido por su compleja historia personal, su lucha interna con su lado salvaje y su búsqueda de redención.",
                "https://lh3.googleusercontent.com/proxy/3Q2Udu5rWFBABqxQLC8CvQLB8RwTjnBtWrgA0xcedEHI_nXyHqsjW4YOkcEc2b5PHE0vvcczrZ07s8_GPuP_oqGqQRfWngWe0wzS16sm9fdtDMyHLekFlwGr5SUhNI_cUNuCPOqFFosZA_6WBRSTgbbyJWQSK4CDlrffHtXZrSNd-Z1PCyhcsSV0Q5JOEt8ejZERHTwTJWuT6R7IpvANcfHcp5rB_w",
                1
            ),
            Hero(
                15,
                "Reed Richards",
                "Jhon KrasinskiXReedRichards === Perfeccion \nEste wey no le pregunta a chat, chat le pregunta a este wey \n Queria a Krasinski pero tambien confio en ti mi mando \nReed Richards, conocido también como Mr. Fantástico, es un superhéroe de Marvel Comics creado por Stan Lee y Jack Kirby en 1961. Es el líder de los Cuatro Fantásticos, un equipo de héroes que adquirieron sus poderes después de una exposición a radiación cósmica. Reed Richards es un brillante científico e inventor cuya habilidad principal es su capacidad para estirar su cuerpo a longitudes y formas extraordinarias, lo que le permite adoptar diversas formas y tamaños. Además de su habilidad elástica, es conocido por su genio intelectual y su habilidad para resolver problemas científicos complejos. Como líder de los Cuatro Fantásticos, Reed lucha contra amenazas globales y cósmicas, y es una figura clave en el universo Marvel por sus contribuciones a la ciencia y la tecnología.",
                "https://static1.srcdn.com/wordpress/wp-content/uploads/2022/12/reed-richards-fantastic-four-galaxy-comic.jpg",
                1
            ),
            Hero(
                16,
                "Hulk",
                "Mi jefe cuando pierde el leon \n Santa madriza le puso a mi loki \n Thor vs Hulk fokin cinema \n Hulk es un superhéroe de Marvel Comics creado por Stan Lee y Jack Kirby en 1962. Su identidad secreta es Bruce Banner, un físico que, tras una explosión de rayos gamma en un experimento fallido, se transforma en Hulk cuando experimenta estrés o ira extrema. Hulk es conocido por su increíble fuerza, resistencia y capacidad de regeneración. A diferencia de su forma humana, que es tranquila y reflexiva, Hulk es una fuerza de destrucción y un poder casi imparable. La dualidad entre Bruce Banner y Hulk, así como el conflicto entre su intelecto y su furia, es un tema central en su historia, a menudo explorando temas de control y aceptación.",
                "https://cdn.hobbyconsolas.com/sites/navi.axelspringer.es/public/media/image/2017/03/hulk-11-superheroes-que-vencieron_9.jpg?tf=3840x",
                1
            ),
            Hero(
                17,
                "SpiderMan",
                "El otro GOAT de todos \n Andrew > Tobey > Tom \n SATS && SITS faaaak. Metro gracias por tanto perdon por tan poco \n Spider-Man es un superhéroe de Marvel Comics creado por Stan Lee y Steve Ditko en 1962. Su identidad secreta es Peter Parker, un joven estudiante de secundaria que gana habilidades arácnidas después de ser mordido por una araña radiactiva. Estas habilidades incluyen agilidad sobrehumana, fuerza, la capacidad de trepar paredes y un \"sentido arácnido\" que le advierte del peligro. Peter también crea su propio equipo de web-slinging, que le permite moverse por la ciudad. Motivado por la trágica muerte de su tío Ben, Peter adopta el lema \"Con gran poder, viene una gran responsabilidad\" y usa sus poderes para luchar contra el crimen en Nueva York, enfrentando a villanos icónicos como el Duende Verde y el Doctor Octopus, mientras equilibra su vida como adolescente y héroe.",
                "https://madmonster.com/wp-content/uploads/2020/04/Kravens-Last-Hunt-645x370-1.jpg",
                1
            ),
            Hero(
                18,
                "Cyclops",
                "La definicion de BADASS \n Quiero ser ese \n Best X-Men \n Cíclope es un superhéroe de Marvel Comics creado por Stan Lee y Jack Kirby en 1963. Su nombre real es Scott Summers y es uno de los miembros fundadores de los X-Men. Cíclope posee la habilidad de emitir potentes rayos de energía óptica desde sus ojos, los cuales pueden causar destrucción a gran escala. Debido a esta habilidad, debe usar unas gafas especiales o un visor para controlar y dirigir sus poderes. Scott es conocido por su liderazgo entre los X-Men, su fuerte sentido de responsabilidad y su relación compleja con Jean Grey. Su carácter serio y su enfoque en la estrategia y el deber lo convierten en una figura clave dentro del equipo de mutantes.",
                "https://i0.wp.com/codigoespagueti.com/wp-content/uploads/2021/03/Cosplay-Femenino-de-Cyclops.jpg",
                1
            ),
            Hero(
                19,
                "Scarlet Witch",
                "La verdadera razon por la que vamos al cine\nA ella si le dedico Dueño de ti \n Elizabeth Olsen teamo \n Scarlet Witch, cuyo nombre real es Wanda Maximoff, es una superhéroe de Marvel Comics creada por Stan Lee y Jack Kirby en 1964. Wanda es una mutante con la capacidad de manipular la realidad a través de sus poderes de magia del caos. Inicialmente, sus habilidades eran limitadas a la manipulación de la probabilidad, pero con el tiempo, sus poderes se expandieron para incluir la alteración directa de la realidad y la magia. Scarlet Witch es conocida por su papel en el equipo de los Vengadores y su compleja historia personal, que incluye relaciones significativas con personajes como Vision y su papel en eventos cósmicos y transformaciones importantes en el universo Marvel, como \"House of M\". Su historia explora temas de poder, pérdida y redención.",
                "https://i0.wp.com/comicbookdispatch.com/wp-content/uploads/2022/12/scwitch2023001_preview_page_1.jpg?resize=1375%2C768&ssl=1",
                1
            ),
            Hero(
                20,
                "Rocket Raccoon",
                "Este mapache cgi hizo a la mitad de tu cine llorar \n Sin pex se carreo una saga completa \n Run fast for your mother fast for your father... \n Gracias por tanto James Gunn \n La trilogia de Guardianes de la galaxia >>> cualquier otra trilogia de marvel",
                "https://static.wikia.nocookie.net/marveldatabase/images/9/96/Rocket_Raccoon_%28Earth-616%29_from_Guardians_of_the_Galaxy_Vol_6_14_cover_001.jpg/revision/latest?cb=20210729022735",
                1
            )
        )
    }
}
