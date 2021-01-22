package com.example.tubes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_result.*
import kotlinx.android.synthetic.main.activity_result.view.*

class Result : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        var txt_tampil: TextView = findViewById(R.id.textView2)
        var klasifikasi: TextView = findViewById(R.id.textView3)
        val tampil = intent.extras?.getFloat("KEY_RESULT")
        var judul_tips:String = ""
        var tips:String = ""

        if (tampil != null) {
            txt_tampil.text = "%.2f".format(tampil)
            if (tampil < 18.5){
                klasifikasi.text = "Kategori Underweight"
                judul_tips = "Tips Menaikan Berat Badan"
                tips = "1. Mengkonsumsi makanan lebih sering\n" +
                        "Misalnya, dengan meningkatkan frekuensi makan hingga 5 atau 6 kali sehari, tapi dalam porsi yang lebih sedikit.\n" +
                        "2. Memilih makanan dengan lebih cermat\n" +
                        "Konsumsi makanan yang yang dapat mendukung peningkatan berat badan, misalnya protein, lemak, karbohidrat kompleks, serta berbagai vitamin dan mineral.\n" +
                        "3. Mengonsumsi makanan berlemak baik\n" +
                        "Salah satu asupan nutrisi yang perlu dipenuhi untuk menggemukkan badan adalah lemak sehat atau lemak tak jenuh, seperti omega-3 dan omega-6.\n" +
                        "4. Memperbanyak minum susu\n" +
                        "Susu dan produk olahannya, misalnya keju dan yoghurt, merupakan sumber lemak, kalori, dan protein yang baik. \n" +
                        "5. Berolahraga secara rutin\n" +
                        "Berolahraga secara rutin, terutama latihan kekuatan, berat badan akan meningkat. \n" +
                        "6. Beristirahat yang cukup\n" +
                        "Waktu tidur ideal bagi orang dewasa adalah 7–9 jam setiap malam.\n"

            } else if (tampil >= 18.5 && tampil <= 24.9){
                klasifikasi.text = "Kategori Normal"
                judul_tips = "Tips Menjaga Berat Badan"
                tips = "1. Banyak Berolahraga\n" +
                        "Minimal setiap satu jam sekali, bangkitlah dari tempat duduk lalu jalan di ruang kerja. Lakukan stretching dengan menggerakkan tubuh ke kiri dan kanan. \n" +
                        "2. Pola Makan Sehat\n" +
                        "Cara menjaga berat badan yang ideal berikutnya adalah memiliki pola makan yang sehat. Anda bisa mencoba mengadopsi pola makan sehat seperti food combining, raw food, dan sejenisnya. \n" +
                        "3. Perbanyak Minum Air\n" +
                        "Anjuran untuk minum delapan gelas air putih sehari.\n" +
                        "4. Makan Tepat Waktu\n" +
                        "Karena telat makan akan membuat lebih lapar saat makan sehingga sulit menahan diri dan akhirnya makan dalam porsi yang lebih banyak.\n" +
                        "5. Jangan Lupakan Sarapan\n" +
                        "Karena jika melupakan sarapan akan cenderung merasa lapar pada siang hari dan saat menahan lapar, hormon leptin akan dikeluarkan sehingga membuat Anda memakan apa saja tanpa terkendali\n"

            } else if (tampil >= 25 && tampil <= 29){
                klasifikasi.text = "Kategori Overweight"
                judul_tips = "Tips Untuk Menurunkan Berat Badan"
                tips = "1. Perbanyak minum air putih\n" +
                        "Minumlah sekitar 2 gelas atau 500 ml air putih, 30 menit sebelum makan. Kebiasaan ini dapat membuat perut terasa kenyang, sehingga mencegah Anda makan berlebihan.\n" +
                        "2. Perbanyak konsumsi makanan yang mengandung serat \n" +
                        "Seperti buah, sayuran, dan biji-bijian utuh (whole grain), seperti roti gandum dan oatmeal.\n" +
                        "3. Lengkapi kebutuhan protein\n" +
                        "Dengan mengkonsumsi asupan berprotein tinggi, seperti ikan, telur, dan daging tanpa lemak.\n" +
                        "4. Batasi makanan yang mengandung banyak gula dan garam\n" +
                        "5. Pilih cemilan sehat \n" +
                        "Seperti susu atau produk olahan susu (keju dan yoghurt) yang rendah lemak dan kacang-kacangan yang direbus.\n" +
                        "6. Gunakan minyak sehat untuk memasak \n" +
                        "Seperti minyak zaitun, minyak kelapa, atau minyak canola.\n" +
                        "7. Jangan lewatkan sarapan\n" +
                        "Pilihlah menu sarapan sehat yang mengandung biji-bijian utuh, protein, serat, atau susu rendah lemak.\n" +
                        "8. Rutin berolahraga\n" +
                        "Berenang, bersepeda, dan berjalan kaki merupakan jenis-jenis olahraga yang efektif untuk membakar kalori. \n" +
                        "9. Tidur yang cukup dan teratur \n" +
                        "yaitu selama 7-9  jam setiap harinya.\n"

            } else if (tampil >= 30 && tampil <= 40){
                klasifikasi.text = "Kategori Obese"
                judul_tips = "Tips Untuk Menurunkan Berat Badan"
                tips = "1. Perbanyak minum air putih\n" +
                        "Minumlah sekitar 2 gelas atau 500 ml air putih, 30 menit sebelum makan. Kebiasaan ini dapat membuat perut terasa kenyang, sehingga mencegah Anda makan berlebihan.\n" +
                        "2. Perbanyak konsumsi makanan yang mengandung serat \n" +
                        "Seperti buah, sayuran, dan biji-bijian utuh (whole grain), seperti roti gandum dan oatmeal.\n" +
                        "3. Lengkapi kebutuhan protein\n" +
                        "Dengan mengkonsumsi asupan berprotein tinggi, seperti ikan, telur, dan daging tanpa lemak.\n" +
                        "4. Batasi makanan yang mengandung banyak gula dan garam\n" +
                        "5. Pilih cemilan sehat \n" +
                        "Seperti susu atau produk olahan susu (keju dan yoghurt) yang rendah lemak dan kacang-kacangan yang direbus.\n" +
                        "6. Gunakan minyak sehat untuk memasak \n" +
                        "Seperti minyak zaitun, minyak kelapa, atau minyak canola.\n" +
                        "7. Jangan lewatkan sarapan\n" +
                        "Pilihlah menu sarapan sehat yang mengandung biji-bijian utuh, protein, serat, atau susu rendah lemak.\n" +
                        "8. Rutin berolahraga\n" +
                        "Berenang, bersepeda, dan berjalan kaki merupakan jenis-jenis olahraga yang efektif untuk membakar kalori. \n" +
                        "9. Tidur yang cukup dan teratur \n" +
                        "yaitu selama 7-9  jam setiap harinya.\n"
            } else{
                klasifikasi.text = "Kategori Extreme Obese"
                judul_tips = "Tips Untuk Menurunkan Berat Badan"
                tips = "1. Perbanyak minum air putih\n" +
                        "Minumlah sekitar 2 gelas atau 500 ml air putih, 30 menit sebelum makan. Kebiasaan ini dapat membuat perut terasa kenyang, sehingga mencegah Anda makan berlebihan.\n" +
                        "2. Perbanyak konsumsi makanan yang mengandung serat \n" +
                        "Seperti buah, sayuran, dan biji-bijian utuh (whole grain), seperti roti gandum dan oatmeal.\n" +
                        "3. Lengkapi kebutuhan protein\n" +
                        "Dengan mengkonsumsi asupan berprotein tinggi, seperti ikan, telur, dan daging tanpa lemak.\n" +
                        "4. Batasi makanan yang mengandung banyak gula dan garam\n" +
                        "5. Pilih cemilan sehat \n" +
                        "Seperti susu atau produk olahan susu (keju dan yoghurt) yang rendah lemak dan kacang-kacangan yang direbus.\n" +
                        "6. Gunakan minyak sehat untuk memasak \n" +
                        "Seperti minyak zaitun, minyak kelapa, atau minyak canola.\n" +
                        "7. Jangan lewatkan sarapan\n" +
                        "Pilihlah menu sarapan sehat yang mengandung biji-bijian utuh, protein, serat, atau susu rendah lemak.\n" +
                        "8. Rutin berolahraga\n" +
                        "Berenang, bersepeda, dan berjalan kaki merupakan jenis-jenis olahraga yang efektif untuk membakar kalori. \n" +
                        "9. Tidur yang cukup dan teratur \n" +
                        "yaitu selama 7-9  jam setiap harinya.\n"
            }

        }
        tipsBtn.setOnClickListener {
            val intent=Intent(this, Tips::class.java)
            intent.putExtra("TIPS",tips)
            intent.putExtra("JUDUL_TIPS",judul_tips)
            startActivity(intent)
        }
    }
}