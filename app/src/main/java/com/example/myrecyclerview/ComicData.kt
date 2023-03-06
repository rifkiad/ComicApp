package com.example.myrecyclerview

object ComicData {
    private val titleComic = arrayOf(
        "Black Clover",
        "Boruto",
        "Doraemon",
        "Haikyuu",
        "Jujutsu Kaisen",
        "Magic Emperor",
        "Naruto",
        "One Piece",
        "Solo Leveling",
        "Tsubasa")

    private val sinopsisComic = arrayOf(
        "Asta dan Yuno ditinggalkan bersama di gereja yang sama, dan tidak terpisahkan sejak saat itu. Sebagai anak-anak, mereka berjanji bahwa mereka akan bersaing satu sama lain untuk melihat siapa yang akan menjadi Kaisar Sihir berikutnya. Namun, saat mereka dewasa, beberapa perbedaan di antara mereka menjadi jelas. Yuno adalah seorang jenius dengan sihir, dengan kekuatan dan kontrol yang luar biasa, sedangkan Asta tidak dapat menggunakan sihir sama sekali, dan mencoba untuk menebus kekurangannya dengan melatih secara fisik. Ketika mereka menerima Grimoires pada usia 15 tahun, Yuno mendapatkan buku spektakuler dengan semanggi berdaun empat (kebanyakan orang menerima semanggi berdaun tiga), sementara Asta tidak menerima apa-apa. Namun, ketika Yuno diancam, kebenaran tentang kekuatan Asta terungkap, dia menerima Grimoire semanggi lima daun, “semanggi hitam”! Sekarang kedua sahabat itu sedang menuju dunia, keduanya mencari tujuan yang sama!",
        "Boruto adalah anak Naruto dan juga shinobi muda dengan bakat yang tidak dapat diperbaiki untuk kenakalan. Dia mencapai impiannya untuk menjadi ninja terbesar di desa dan wajahnya duduk di atas monumen Hokage. Tapi ini bukan ceritanya. Generasi baru ninja siap naik panggung, dipimpin oleh putra Naruto sendiri, Boruto.",
        "Di pinggiran kota Tokyo beberapa waktu lalu, hiduplah seorang bocah berusia sekitar10 tahun.bernama Sewashi, keturunan Nobita empat generasi kemudian dari abad ke-22, dan Doraemon, robot kucing abad ke-22 yang membantu orang-orang dengan gadget rahasianya.",
        "Dikisahkan ada seorang anak bernama Shouyou Hinata (Ayumu Murase) bertubuh kecil yang gemar bermain bola voli.",
        "Yuuji adalah seorang jenius di jalur dan lapangan. Tapi dia memiliki minat nol, dia senang sebagai clam di Klub Penelitian Ilmu Ghaib. Meskipun Dia di Klub hanya untuk Iseng, Hal-hal menjadi serius ketika semangat nyata muncul di sekolah! Hidup akan menjadi sangat aneh Di SMA Negeri Sugisawa #3. !",
        "Zhuo Yifan adalah seorang kaisar sihir atau bisa di panggil kaisar iblis, karena dia mempunyai buku kaisar kuno yang di sebut buku sembilan rahasia dia menjadi sasaran semua ahli beradiri bahkan dia di khianati dan di bunuh oleh muridnya. Kemudian jiwanya masuk dan hidup kembali dalam seorang anak pelayan keluarga bernama Zhuo Fan.Karena suatu sihir iblis mengekangnya, dia harus menyatukan ingatan anak itu dan tidak bisa mengabaikan keluarga dan nona yang dia layaninya. Bagaimana kehidupan nya membangun kembali keluarganya dan kembali menjadi yang terkuat didaratan benua.",
        "bercerita tentang Dua belas tahun yang lalu, Rubah Sembilan-Ekor Iblis yang kuat menyerang desa Ninja Konohagakure. Setan itu dengan cepat dikalahkan dan disegel ke dalam bayi Naruto Uzumaki, oleh Hokage Keempat yang mengorbankan hidupnya untuk melindungi desa. Sekarang Naruto adalah ninja buku knucklehead nomor satu yang bertekad untuk menjadi Hokage berikutnya dan mendapatkan pengakuan oleh semua orang yang pernah meragukannya! ",
        "One piece itu sendiri bercerita tentang seorang Monkey D. Luffy, alias Luffy, seorang bajak laut yang berobsesi untuk menemukan One Piece, salah satu harta karun paling berharga yang ada di dunianya Luffy waktu itu. Setelah Luffy kecil diselamatkan oleh seorang bajak laut bernama Sanks, Luffy akhirnya bertekat untuk menjadi ‘the real’ bajak laut dengan cara berpetualang ke seluruh penjuru dunia dan menemukan One Piece. Di perjalanannya itulah Luffy menemukan berbagai petualangan seru bersama kapal Going Merry nya. Monkey D. Luffy alias Luffy, adalah kapten dari Kelompok Bajak Laut Topi Jerami. Kepala Luffy 300 juta berry setelah peristiwa di Enies Lobby. Ketika Luffy masih muda, dia secara tidak sengaja memakan Buah Iblis (di versi anime, dia memakannya asal-asalan dengan marah karena merajuk pada Shanks) yaitu Buah Gomu Gomu yang ia anggap adalah makanan penutup. Buah Gomu Gomu (Gomu berarti karet) adalah buah iblis yang menyebabkan tubuh pengguna menjadi melar kayak karet dan bisa memanjangkan anggota tubuhnya Berbeda dengan stereotype kebanyakan dari seorang Tokoh Utama, Luffy muncul malah dengan sifatnya yang sedikit bodoh dan ceroboh. Sebagai seorang bajak laut Luffy bisa dikatakan sangat awam karena tidak mengetahui apapun tentang kompas dan ilmu kelautan. Selain itu dia tidak bisa berenang karena memakan Buah Gomu Gomu. Ciri ciri dari Luffy adalah topi jerami di kepalanya, ia diberikan topi jerami oleh Shanks, bajak laut idolanya semasa ia masih kecil, sehingga kelak ia harus mengembalikannya jika bertemu lagi dilaut.",
        "Menceritakan pemuda bernama Sung Jin Woo yang mendapat julukan sebagai hunter terlemah di dunia. Julukan tersebut diberikan karena dirinya selalu terluka walaupun dia masuk Gate rank E yang merupakan rank paling rendah.",
        "Seorang anak SD yang baru saja pindah dari kota lain ke Nankatsu. Dia ingin bermain sepak bola dan menjadi pemain terbaik. Ketika masuk ke sekolah barunya, dia langsung masuk ke klub sepak bola di sekolah itu",
    )

    private  val tanggalRilis = arrayOf (
        "16 Februari 2015",
        "9 Mei 2016",
        "13 November 1988",
        "10 Februari 2012",
        "4 Juli 2018",
        "24 April 2021",
        "21 September 1999",
        "4 Agustus 1997",
        "25 Juli 2016",
        "15 Maret 1986"
    )

    private val genreComic = arrayOf(
        "Action, Adventure, Comedy,Drama,Fantasy,Shounen,Supernatural,Manga",
        "Action, Advennture,Comedy,Drama,Fantasy,Sci-fi,Shounen,Manga",
        "Action, Adventure,Comedy,Drama,Fantasy,Slice Of Life",
        "Comedy, Drama,School Life,Shounen,Slice Of Life,Sports,Manga",
        "Action, Drama,Horror,School Life,Shounen,Supernatural,Manga",
        "Action, Adventure,fantasy,Shounen,Supernatural,Manhua",
        "Action, Adventure,Comedy,Drama,Fantasy,Shounen,Manga",
        "Action, Adventure,Comedy,Drama,Fantasy,Shounen,Supernatural,Manga",
        "Action, Adventure,Drama,Fantasy,Shounen,Super Power,Manhwa",
        "Sport, Shounen, Slice Of Life",
    )

    private val photosComic = intArrayOf(
        R.drawable.black_clover,
        R.drawable.boruto,
        R.drawable.doraemon,
        R.drawable.haikyuu,
        R.drawable.jujutsu_kaisen,
        R.drawable.magic_emperor,
        R.drawable.naruto,
        R.drawable.one_piece,
        R.drawable.solo_leveling,
        R.drawable.tsubasa
    )


    val listData: ArrayList<Comic>
        get() {
            val list = arrayListOf<Comic>()
            for (position in titleComic.indices) {
                val comic = Comic ()
                comic.title_comic = titleComic[position]
                comic.sinopsis_comic = sinopsisComic[position]
                comic.tanggal_rilis = tanggalRilis[position]
                comic.picture_comic = photosComic[position]
                comic.genre_comic = genreComic[position]
                list.add(comic)
            }
            return list
        }
}