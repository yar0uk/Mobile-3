package com.lab3.data

import com.lab3.R

object ItemsData {
    val itemsList = listOf(
        Item(
            1,
            "Бранденбурзькі ворота",
            "Історичний символ єдності Німеччини, побудований у стилі класицизму в 18 столітті.",
            "Розташовані на Паризькій площі, ворота вважаються одним із найвідоміших символів Берліна.",
            image= R.drawable.vorota
        ),
        Item(
            2,
            "Рейхстаг",
            "Будівля німецького парламенту з відомим скляним куполом, звідки відкривається панорамний вид на місто.",
            "Це місце поєднує історичну значущість із сучасною архітектурою.",
            R.drawable.reightag
        ),
        Item(
            3,
            "Меморіал жертвам Голокосту",
            "Комплекс із 2711 бетонних блоків, розташований поблизу Бранденбурзьких воріт, створений як символ пам'яті про єврейських жертв нацизму.",
            "Незвична структура меморіалу викликає різні емоції, створюючи простір для індивідуальних роздумів.",
            R.drawable.memorial
        ),
        Item(
            4,
            "Острів музеїв",
            "Комплекс із п'яти всесвітньо відомих музеїв, зокрема Пергамський музей із його античними колекціями.",
            "Кожен музей пропонує унікальний досвід, охоплюючи тисячоліття мистецтва, історії та культури.",
             R.drawable.museum
        ),
        Item(
            5,
            "Берлінська телевежа",
            "Висока телевежа на Александерплац, одна з найвпізнаваніших будівель Берліна.",
            "Вона є популярним місцем зустрічей та символом об’єднання міста після Холодної війни.",
             R.drawable.berliner
        )
    )
}

class Item(val id: Int, val name: String, val title: String, val description: String, val image: Int)
