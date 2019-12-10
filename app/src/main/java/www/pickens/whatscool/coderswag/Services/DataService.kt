package www.pickens.whatscool.coderswag.Services

import www.pickens.whatscool.coderswag.Model.Category
import www.pickens.whatscool.coderswag.Model.Product

object DataService {
    val Categories = listOf(
        Category("SHIRTS", "shirtimage"),
        Category("HOODIES", "hoodieimage"),
        Category("HATS", "hatimage"),
        Category("DIGTAL", "digitalgoodsimage"),
        Category("SHIRTS", "shirtimage"),
        Category("HOODIES", "hoodieimage"),
        Category("HATS", "hatimage"),
        Category("DIGTAL", "digitalgoodsimage")
    )
    val  hats = listOf(
        Product("DEVSLOPES GRAHPIC BEANIE","$18", "hat1"),
        Product("DEVSLOPES HAT BLACK","$20", "hat2"),
        Product("DEVSLOPES HAT WHITE","$19", "hat3"),
        Product("DEVSLOPES HAT SNAPBACK","$22", "hat4")
    )

    val  hoodies = listOf(
        Product("DEVSLOPES HOODIES GRAY","$15", "hoodie1"),
        Product("DEVSLOPES HOODIES RED","$21", "hoodie2"),
        Product("DEVSLOPES GRAY HOODIES","$10", "hoodie3"),
        Product("DEVSLOPES BLACK HOODIS","$24", "hoodie4")
    )

    val  shirts = listOf(
        Product("DEVSLOPES SHIRT BLACK","$18", "shirt1"),
        Product("DEVSLOPES  BAGE LIGHT GRAY","$20", "shirt2"),
        Product("DEVSLOPES SHIRT RED","$19", "shirt3"),
        Product("DEVSLOPES HUSTLE","$22", "shirt4"),
        Product("KICKFLIP STUDIOS","$22", "shirt5")

    )
}