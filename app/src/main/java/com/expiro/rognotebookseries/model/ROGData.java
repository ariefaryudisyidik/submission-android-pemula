package com.expiro.rognotebookseries.model;

import com.expiro.rognotebookseries.R;

import java.util.ArrayList;

public class ROGData {
    private static String[] rogNames = {
            "ROG Mothership GZ700",
            "ROG Strix G",
            "ROG Strix Hero III",
            "ROG Strix Scar II",
            "ROG Strix Scar III",
            "ROG Zephyrus G GA502",
            "ROG Zephyrus M GU502",
            "ROG Zephyrus S GX502",
            "ROG Zephyrus S GX531",
            "ROG Zephyrus S GX701"
    };

    private static String[] rogDetails = {
            "Laptop memiliki sistem pendingin yang terbatas dan mengunci Anda di posisi tertentu yang tidak solid sebagai penggantian desktop, jadi kami telah menyusun ulang form factor untuk meningkatkan performa game Anda. ROG Mothership adalah perangkat bertenaga portabel Windows 10 dengan desain inovatif yang meningkatkan pendinginan untuk GPU GeForce RTX™ 2080 yang di-overclock dan CPU delapan-core Intel® Core™ i9 Generasi ke 9. Nikmati layar G-SYNC™ 4K yang detail dan keyboard yang dapat dilepas-pasang untuk beradaptasi dengan cara Anda bermain. Penyimpanan RAID SSD dan 2.5G Ethernet menghadirkan kinerja sangat cepat untuk setiap bagian dari mesin game revolusioner ini.",
            "ROG Strix G mewujudkan desain yang ramping, menawarkan pengalaman terbaik yang tangguh untuk permainan serius dan multitasking pada Windows 10. Menampilkan prosesor Intel Core 9th Gen terbaru dan grafis GeForce RTX™, menghadirkan kinerja gaming yang berdampak bagi khalayak luas. Intelligent Cooling melepaskan potensi penuh dari prosesor mutakhirnya, sementara RangeBoost menyediakan sinyal Wi-Fi terkuat untuk lingkungan Anda. Di mana pun Anda bermain, akan selalu menyinari lingkungan dengan Aura Sync pada bilah lampu tiga-tepi yang baru dan keyboard RGB 4-zona.",
            "Strix Hero III yang tipis dan kompak dirancang untuk esports dan menghadirkan kinerja gaming Windows 10 terbaik. Intelligent Cooling melepaskan performa terbaik prosesor Intel Core 9th Gen dan GPU GeForce GTX™, dan memanfaatkan sepenuhnya layar gaming super cepat. Masuk ke pertandingan multiplayer di mana saja dengan RangeBoost Wi-Fi yang lebih kuat, pamerkan kepribadian Anda dengan lightbar Aura Sync yang melingkar, dan dapatkan privasi untuk data pribadi dengan ROG Keystone baru.",
            "Dengan pilihan grafis hingga NVIDIA® GeForce RTX™ 2070 terbaru dan prosesor Intel® Core™ i7 Generasi ke-8, ROG Strix SCAR II menghadirkan performa dan gaya yang lebih besar lagi untuk gaming esport FPS. Tersedia dalam model 15 dan 17-inci, Strix SCAR II menawarkan tampilan bezel super-tipis 144Hz pertama di dunia dengan response time ultra cepat 3ms gray to gray (GTG) untuk kelancaran dan respons yang tak tertandingi. Untuk keunggulan tambahan dalam panasnya pertempuran, laptop gaming Windows 10 yang kuat ini menghadirkan sistem pendingin HyperCool Pro eksklusif yang memungkinkan Anda untuk sepenuhnya melepaskan potensi CPU dan GPU berkinerja tinggi, sementara teknologi ROG RangeBoost menggunakan multi-antena Wi-Fi untuk memberikan jangkauan hingga 30% lebih banyak, throughput lebih tinggi dan koneksi yang jarang terputus. Selain itu, utilitas Armory Crate yang semuanya baru menawarkan akses sekali klik ke pengaturan sistem dan efek pencahayaan Aura. Strix SCAR II menawarkan kombinasi tak terhentikan dari grafis berkinerja tinggi dan tampilan sangat cepat dalam desain yang ringkas!",
            "Jadilah yang terbaik di eSports dengan ROG Strix SCAR III, yang dirancang untuk berkompetisi di level tebaik dengan prosesor Intel Core Gen 9. Intelligent Cooling melepaskan performa terbaik dari grafis prosesor Intel Core™ Gen 9 dan GeForce RTX™ Gen 9, sementara layar laptop 240Hz/3ms tercepat di dunia memungkinkan Anda bermain dengan kecepatan gamer profesional;. Nikmati game multipalyer di mana saja dengan RangeBoost Wi-Fi yang lebih kuat, pamerkan kepribadian Anda dengan lightbar Aura Sync yang melingkar, dan dapatkan perlindungan privasi untuk data pribadi dengan ROG Keystone yang baru.",
            "ROG Zephyrus G yang serba baru ini dengan sempurna menyeimbangkan portabilitas yang luar biasa dengan kinerja yang kuat untuk menghadirkan laptop gaming Windows 10 yang sangat tipis ke pengguna yang lebih luas. Prosesor AMD® Ryzen™ 7 dan GeForce® GTX 1660 Ti mampu diandalkan untuk kerja dan bermain, sementara daya tahan baterai hingga 8,8 jam membuat Anda tetap dapat bekerja saat di jalan. Benamkan diri Anda ke dalam layar 120Hz berbezel super-tipis yang tersamarkan, dan naikkan volume dengan teknologi Smart Amp untuk suara yang lebih keras dengan distorsi yang lebih sedikit",
            "Dalam sasis logam yang ringan dan sangat ramping, ROG Zephyrus M yang baru menggabungkan kinerja yang sempurna dengan pengalaman bermain game di Windows 10 gaming yang menggembirakan. Prosesor Intel® Core™ i7 Gen 9 dan GPU NVIDIA® GeForce GTX™ 1660 Ti terbaru andal untuk digunakan bekerja dan bermain game yang serius, sementara dukungan penyimpanan SSD NVMe 512GB yang mendukung RAID menyediakan waktu loading sangat cepat untuk mengakses koleksi game dan aplikasi. Benamkan diri Anda di layar 144Hz/3ms IPS-level dengan bezel super-tipis,dan tenggelam lebih dalam dengan dukungan audio Sabre Hi-Res ESS.",
            "Dipersenjatai dengan performa tinggi dan keandalan untuk menangani game AAA dan pekerjaan profesional, ROG Zephyrus S GX502 berhasil mengubah standar gaming di perangakat Windows 10 super tipis. Desain pendinginan inovatifnya melepaskan potensi sesungguhnya dari prosesor Intel® Core™ i7 Generasi ke-9 terbaru dan GPU GeForce RTX™ 2070, memungkinkan mereka untuk mengambil keuntungan penuh dari tampilan PANTONE® 240Hz/3ms yang sangat responsif. Kemampuan beradaptasinya tinggi dengan mode G-SYNC™ dan Optimus, memberi Anda kebebasan untuk beralih antara gameplay yang sangat mulus dan masa pakai baterai yang lebih baik saat Anda bepergian.",
            "Setelah membuat standar baru notebook gaming ultra-slim dengan ROG Zephyrus, kini ROG membawa gaming hardcore ke dalam desain frame yang lebih tipis dengan Super-narrow bezel. ROG Zephyrus S mengusung rancangan inovatif untuk mendinginkan GeForce RTX™ 2080 and prosesor Intel® Core™ i7 generasi ke delapan. ",
            "ROG Zephyrus S membuat standar baru laptop gaming Windows 10 ultra-tipis. Kini Zephyrus S memiliki ukuran lebih besar dengan layar Super Narrow Bezel 17 inci dalam chasis yang hanya setipis 18,7mm. Zephyrus S GX701 dipersenjatai dengan GPU RTX™ 2080 dan CPU Intel® Core™ i7 8th Gen. Panel 144Hz/3ms dengan validasi warna Pantone® sangat mengesankan, dan gunakan ROG-exclusive switch untuk beralih antara mode G-SYNC™ untuk bermain game dan Optimus untuk daya tahan baterai yang lebih lama."
    };

    private static int[] rogPhoto = {
            R.drawable.mothership_gz700,
            R.drawable.strix_g,
            R.drawable.strix_hero_iii,
            R.drawable.strix_scar_ii,
            R.drawable.strix_hero_iii,
            R.drawable.zephyrus_g_ga502,
            R.drawable.zephyrus_m_gu502,
            R.drawable.zephyrus_s_gx502,
            R.drawable.zephyrus_s_gx531,
            R.drawable.zephyrus_s_gx701
    };

    private static String[] rogSpesifikasi = {
            "Windows 10 Home/Intel® Core™ i9-9980HK/RTX2080_V8G/64G/512G*3 PCIe/Per Key RGB",
            "Windows 10 Home/Intel® Core™ i7-9750H/RTX2070_v8G/16G/512G PCIe/4 Zone RGB",
            "Windows 10 Home/Intel® Core™ i7-9750H/GTX1660Ti_V6G/8G/512G PCIe/4 Zone RGB",
            "Intel® Core™ i7-8750H/16GB DDR4/1TB SSHD+256G PCIe/RTX2060/Windows 10 Home)",
            "Windows 10 Home/Intel® Core™ i7-9750H/RTX2060_V6G/16G/512GB PCIe/Per Key RGB/NUMPAD",
            "AMD Ryzen™ 7-3750H/GTX1660Ti_V6G/8G/512G PCIe/Windows 10 Home",
            "Windows 10 Home/Intel® Core™ i7-9750H/GTX1660Ti_V6G/8G/512GB PCIe/Per Key RGB",
            "Windows 10 Home/Intel® Core™ i7-9750H/RTX2070_v8G/16G/512G PCIe/Slim FHD IPS 240Hz",
            "Intel® Core™ i7-9750H/RTX2080_v8G/24G/1T PCIe/Windows 10 Home",
            "Intel® Core™ i7-8750H/RTX2070_v6G/24G/512G PCIe/Windows 10 Home"
    };

    private static String[] rogDisplay = {
            "17.3''",
            "15.6''",
            "15.6''",
            "15.6''",
            "17.3''",
            "15.6''",
            "15.6''",
            "15.6''",
            "15.6''",
            "17.3''"
    };

    private static String[] rogPrice = {
            "Rp.130.999.000,-",
            "Rp.38.999.000,-",
            "Rp.25.999.000,-",
            "Rp.28.999.000,-",
            "Rp.31.999.000,-",
            "Rp.20.299.000,-",
            "Rp.25.999.000,-",
            "Rp.44.999.000,-",
            "Rp.56.999.000,-",
            "Rp.41.999.000,-"
    };

    public static ArrayList<ROG> getListData() {
        ArrayList<ROG> list = new ArrayList<>();
        for (int position = 0; position < rogNames.length; position++) {
            ROG rog = new ROG();
            rog.setName(rogNames[position]);
            rog.setDetail(rogDetails[position]);
            rog.setSpesifikasi(rogSpesifikasi[position]);
            rog.setPhoto(rogPhoto[position]);
            rog.setDisplay(rogDisplay[position]);
            rog.setPrice(rogPrice[position]);
            list.add(rog);
        }
        return list;
    }
}


