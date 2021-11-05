package com.ajiprasetyo.persiapanuts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.persiapanuts.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var data: ArrayList<DataModel>? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Inisialisasi Array
        data = ArrayList()


        //Simpan data

        data?.add(
            DataModel(
                R.drawable.slametan,"Budaya Jawa Tengah","SELAMETAN","Tradisi Selamatan.\n Selamatan merupakan sebuah tradisi ritual yang hingga kini tetap dilestarikan oleh sebagian besar masyarakat Jawa. Salah satu upacara adat Jawa ini dilakukan sebagai bentuk rasa syukur atas anugerah dan karunia yang diberikan Tuhan. " +
                "Istilah Selamatan sendiri berasal dari bahasa arab yakni Salamah yang memiliki arti selamat atau bahagia. " +
                "Dalam prakteknya, selamatan atau syukuran dilakukan dengan mengundang beberapa kerabat atau tetangga. Secara tradisional acara syukuran dimulai dengan doa bersama, dengan duduk bersila di atas tikar, melingkari nasi tumpeng dengan lauk pauk dan kemuadian di lanjutkan dengan menikmati nasi tumpeng tersebut secara bersama – sama. ")
        )

        data?.add(
            DataModel(
                R.drawable.bahasa,"Budaya Jawa Tengah","BAHASA DAERAH", "Seperti halnya yang kita ketahui bersama bahwa bahasa daerah Kebudayaan Jawa Tengah adalah Jawa. Bahasa Jawa menjadi bahasa keseharian yang dilakukan oleh masyarakat Jawa Tengah, bahasa Jawa di Jawa Tengah merupakan bahasa yang unik. " +
                "Karena bahasa Jawa ini memiliki huruf Jawa yang kita kenal dengan sebutan HANACOROKO, hampir setiap daerah di Jawa Tengah memiliki perbedaan dialek atau aksen sendiri tiap daerahnya. " +
                "Bahasa Jawa juga terbagi menjadi dua klasifikasi, yang pertama adalah bahasa Jawa dialek daerah dan bahasa Jawa dialek setempat. Perbedaannya terdapat pada wilayah, karakter, budaya dan sosial yang berlaku di tiap daerahnya..")
        )

        data?.add(
            DataModel(
                R.drawable.rumah,"Budaya Jawa Tengah","RUMAH ADAT", "Disetiap provinsi di Indonesia memiliki rumah adat Kebudayaannya masing-masing hal itu juga terdapat pada rumah ada Kebudayaan Jawa Tengah. diketahui terdapat lima jenis rumah adat Kebudayaan Jawa Tengah ini. " +
                "Hal ini dibedakan dengan bentuk atapnya, seperti rumah limasan, rumah joglo atau dikenal juga dengan rumah tikelan, rumah kampung, rumah panggangpe, dan juga tajug atau masjid. Terdapat fungsi di setiap sudut ruangan pada rumah adat Kebudayaan Jawa Tengah ini. " +
                "Sama halnya dengan rumah-rumah pada umumnya, rumah adat Kebudayaan Jawa Tengah ini memiliki dapur, pintu gerbang, kamar tidur dan lain sebagainya. Hanya saja pada jenis-jenis rumah lainnya berbeda dengan rumah pada umumnya.")
        )

        data?.add(
            DataModel(
                R.drawable.pakaian,"Budaya Jawa Tengah","PAKAIAN ADAT", "Pakaian adat Kebudayaan Jawa Tengah juga tidak luput dari salah satu Kebudayaan yang dimiliki oleh provinsi ini. Salah satu pakaian adat yang menjadi simbol atau bisa dibilang sebagai identitas di Jawa Tengah ini adalah pakaian adat yang berasal dari Surakarta. " +
                "Terdapat dua jenis pakaian adat pada Kebudayaan Jawa Tengah, yang pertama adalah pakaian adat untuk kaum bangsawan (kerabat keraton) dan yang kedua adalah pakaian adat untuk rakyat biasa. " +
                "Untuk pesta pernikahan sendiri penganten memiliki pakaian adat tersendiri yang kita kenal dengan nama Jawi Jangkep untuk pengantin pria dan Kebaya untuk pengantin wanita. Dan pada acara adat atau pesta adat lainnya biasanya menggunakan batik khas Jawa Tengah.")
        )

        data?.add(
            DataModel(
                R.drawable.kesenian,"Budaya Jawa Tengah","KESENIAN", "a. Kesenian Tari \n" +
                "Seni tari Kebudayaan Jawa Tengah dikelompokan menjadi dua bagian, yang pertama tarian keraton dan tarian rakyat. Seni tarian keraton berasal dari lingkungan kekeratonan dan untuk acara kekeratonan. \n" +
                "Sedangkan tarian rakyat biasanya digelar atau diselenggarakan pada upacara-upacara adat atau bisa juga pada pesta rakyat yang mengambil tema Kebudayaan Jawa Tengah. Untuk tarian keraton ada yang namanya tarian Bedaya. \n" +
                "Sedangkan untuk tarian rakyat sendiri ada tarian Dolalak yang sudah dikenal di Jawa Tengah. terdapat banyak nama-nama tarian di Kebudayaan seni tari Jawa Tengah ini, berikut adalah ulasannya. \n" +
                "b. Kesenian Alat Musik \n" +
                "Kebudayaan Jawa Tengah memiliki kesenian alat musik, yang menjadi kesenian alat musik dari Jawa Tengah yang paling poluler adalah gamelan. Sebenarnya gamelan ini adalah kumpulan dari beberapa alat musik.\n" +
                "Pada gamelan terdapat kendang, bonang barung, bonang penerus, saron, slenthem, gender, gambang, kempul, kenong, kethug, sitter, suling, rebab, keprak dan kepyang, bedug, serta gong. Ada dua laras pada gamelan, yaitu pelog dan laras slendro.\n" +
                "Sebenarnya ada lagi kesenian alat musik Kebudayaan Jawa Tengah yang perlu kita ketahui seperti, tambur, rebana, terompet dan calung. Alat -alat ini biasanya digunakan untuk mengiringi kesenian khas daerah Jawa Tengah. "
                )
        )

        data?.add(
            DataModel(
                R.drawable.senjata,"Budaya Jawa Tengah","SENJATA TRADISIONAL", "Pada beberapa senjata yang menjadi Kebudayaan Jawa Tengah, diantaranya seperti pedang, gada, tombak, keris dan perisai. Bagi masyarakat Jawa Tengah sendiri keris dapat dijadikan sebagai tingkat sosial seseorang.\n" +
                "Selain itu keris juga memiliki hal spesial lainya seperti anggapan benda pusaka yang memiliki kesaktian dan dijadian benda keramat. Karena itulah ada keris keris yang memiliki nama tertentu, seperti halnya Kyai Setan Kober milik Arya Penangsang (Adipati Jipang).\n" +
                "Pada senjata adat Kebudayaan Jawa Tengah khusunya keris ini terdapat tiga bagain, yaitu wilahan, wrangka (rangka) dan juga ukiran atau bisa disebut juga hulu keris. Kegunaan keris sendiri berubah seiring waktu.\n" +
                "Dulunya keris dipakai sebagai senjata perang, lalu menjadi barang keramat yang dipuja, dan untuk saat ini keris dijadikan sebagai pelengkap atau bisa dikatakan aksesoris untuk pakaian adat Jawa Tengah itu sendiri.")
        )

        data?.add(
            DataModel(
                R.drawable.makanan,"Budaya Jawa Tengah","MAKANAN DAN MINUMAN", "Makanan dan minumam Kebudayaan Jawa Tengah tentunya tidak sedikit, karena hampir disetiap kabupaten atau kota memiliki makanan khas nya masing-masing. Secara umum makanan dan minuman Kebudayaan Jawa Tengah berasal dari potensi alam di Jawa Tengah.\n\n" +
                "Berikut ini adalah makanan dan minuman Kebudayaan Jawa Tengah, mari kita simak bersama-sama.\n" +
                "\n" +
                "• Semarang = Tahu pong, tahu petis, tahu gimbal, wingko, lumpia, dan bandeng presto.\n" +
                "• Solo = Timlo, tengkleng, dan sega liwet.\n" +
                "• Pekalongan = Lopis, soto kriyik, nasi gandul, dan soto taoco.\n" +
                "• Kudus = Jenang kudus, dodol, sate kerbau, dan nasi pindang.\n" +
                "• Jepara = es gempol dan blenyik ikan teri.\n" +
                "• Banyumas = Soto sokaraja, jenang jaket, dan cimplung.\n" +
                "• Tegal = Kacang asin, pilus, dan young tahu.")
        )


        data?.add(
            DataModel(
                R.drawable.wetonan,"Budaya Jawa Tengah","WETONAN", "Tradisi Jawa Tengah yang pertama adalah tradisi wetonan. Wetonan dalam bahasa Jawa memiliki arti keluar.\n" +
                "Namun, wetonan yang dimaksud di sini berhubungan dengan kelahiran orang.\n" +
                "Tradisi wetonan adalah upacara yang dilakukan guna menyambut bayi yang baru lahir.\n" +
                "Tradisi wetonan ini dilakukan supaya nantinya bayi tersebut akan terhindar dari bahaya serta bisa mendapatkan rezeki serta keberuntungan yang lebih.")
        )

        //Set data to Adapter
        recyclerview.adapter = DataAdapter(data, object : DataAdapter.OnClickListener {
            override fun detail(item: DataModel?) {
                val intent = Intent(this@MainActivity, DetailActivity::class.java)
                intent.putExtra("gambar", item?.gambar)
                intent.putExtra("nama", item?.nama)
                intent.putExtra("harga", item?.lokasi)
                intent.putExtra("keterangan", item?.keterangan)
                startActivity(intent)
            }

        })


    }
}