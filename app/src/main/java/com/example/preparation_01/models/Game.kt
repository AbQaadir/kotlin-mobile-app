package com.example.preparation_01.models

data class Game(
    val name: String,
    val releaseDate: String,
    val imageUrl: String) {
}

val gameList = listOf<Game>(
    Game("The Legend of Zelda: Breath of the Wild", "March 3, 2017", "https://upload.wikimedia.org/wikipedia/en/6/62/The_Legend_of_Zelda_Breath_of_the_Wild.jpg"),
    Game("Super Mario Odyssey", "October 27, 2017", "https://upload.wikimedia.org/wikipedia/en/1/15/Super_Mario_Odyssey.jpg"),
    Game("Animal Crossing: New Horizons", "March 20, 2020", "https://upload.wikimedia.org/wikipedia/en/4/4e/Animal_Crossing_New_Horizons.jpg"),
    Game("Splatoon 2", "July 21, 2017", "https://upload.wikimedia.org/wikipedia/en/3/3f/Splatoon_2.jpg"),
    Game("Mario Kart 8 Deluxe", "April 28, 2017", "https://upload.wikimedia.org/wikipedia/en/9/95/Mario_Kart_8.jpg"),
    Game("Super Smash Bros. Ultimate", "December 7, 2018", "https://upload.wikimedia.org/wikipedia/en/5/50/Super_Smash_Bros._Ultimate.jpg"),
    Game("The Legend of Zelda: Link's Awakening", "September 20, 2019", "https://upload.wikimedia.org/wikipedia/en/4/4d/The_Legend_of_Zelda_Link%27s_Awakening.jpg"),
    Game("Fire Emblem: Three Houses", "July 26, 2019", "https://upload.wikimedia.org/wikipedia/en/4/4e/Fire_Emblem_Three_Houses.jpg"),
    Game("Xenoblade Chronicles 2", "December 1, 2017", "https://upload.wikimedia.org/wikipedia/en/1/1f/Xenoblade_Chronicles_2.jpg"),
    Game("Luigi's Mansion 3", "October 31, 2019", "https://upload.wikimedia.org/wikipedia/en/7/7d/Luigi%27s_Mansion_3.jpg"),
    Game("Ring Fit Adventure", "October 18, 2019", "https://upload.wikimedia.org/wikipedia/en/4/4b/Ring_Fit_Adventure.jpg")
)