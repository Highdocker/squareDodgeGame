package com.example.squaregame

data class GameState(

    val playerSquareLocation: Int = 0,
    // Position in the list where the player's square should be:
    // [0] [1] [2] [3] [4]
    // [5] [6] [7] [8] [9]
    // [10][11][12][13][14]
    // [15][16][17][18][19]
    // [20][21][22][23][24]

    val wavesPassed: Int = 0,
    // Amount of enemy waves survived.

    val bonusSquaresCollected: Int = 0,
    // Amount of green squares collected at the end of each wave
    // (Adds one when player location is the same as green square)

    val enemySquareAmount: Int = 5,
    // Configurable amount of red squares to appear per wave of them.

    val enemySquareWarningDelay: Int = 1000,
    // Configurable amount of time (ms) to wait before every enemy
    // square changes warning stages.

    val enemyWaveDelay: Int = 2000,
    // Configurable amount of time (ms) to wait before a new wave
    // of enemy squares begin to appear after clearing.


)
