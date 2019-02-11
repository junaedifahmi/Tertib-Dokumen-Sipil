package com.example.aplikasisatu

import android.view.View
import kotlinx.android.synthetic.main.fragment_akta_cerai.view.*
import kotlinx.android.synthetic.main.fragment_akta_lahir.view.*
import kotlinx.android.synthetic.main.fragment_akta_mati.view.*
import kotlinx.android.synthetic.main.fragment_kia.view.*
import kotlinx.android.synthetic.main.fragment_kk.view.*
import kotlinx.android.synthetic.main.fragment_ktp.view.*
import kotlinx.android.synthetic.main.fragment_pindah.view.*

fun listen_ktp(view: View){
    var jml_checked = 0.0
    view.ktp_syarat1.setOnClickListener {
        jml_checked += if (view.ktp_syarat1.isChecked) 1 else -1
        progress(view.ktp_progress, jml_checked/3*100)
    }

    view.ktp_syarat2.setOnClickListener {
        jml_checked += if (view.ktp_syarat2.isChecked) 1 else -1
        progress(view.ktp_progress,jml_checked/3*100)
    }

    view.ktp_syarat3.setOnClickListener {
        jml_checked += if (view.ktp_syarat3.isChecked) 1 else -1
        progress(view.ktp_progress,jml_checked/3*100)
    }

}

fun listen_kk(view: View){
    var jml_checked = 0.0
    view.kk_syarat1.setOnClickListener {
        jml_checked += if (view.kk_syarat1.isChecked) 1 else -1
        progress(view.kk_progress, jml_checked/3*100)
    }

    view.kk_syarat2.setOnClickListener {
        jml_checked += if (view.kk_syarat2.isChecked) 1 else -1
        progress(view.kk_progress,jml_checked/3*100)
    }

    view.kk_syarat3.setOnClickListener {
        jml_checked += if (view.kk_syarat3.isChecked) 1 else -1
        progress(view.kk_progress,jml_checked/3*100)
    }
}

fun listen_kia(view: View){
    var jml_checked = 0.0
    view.kia_syarat1.setOnClickListener {
        jml_checked += if (view.kia_syarat1.isChecked) 1 else -1
        progress(view.kia_progress, jml_checked/3*100)
    }

    view.kia_syarat2.setOnClickListener {
        jml_checked += if (view.kia_syarat2.isChecked) 1 else -1
        progress(view.kia_progress,jml_checked/3*100)
    }

    view.kia_syarat3.setOnClickListener {
        jml_checked += if (view.kia_syarat3.isChecked) 1 else -1
        progress(view.kia_progress,jml_checked/3*100)
    }
}

fun listen_akta_lahir(view: View){
    var jml_checked = 0.0
    view.akta_lahir_syarat1.setOnClickListener {
        jml_checked += if (view.akta_lahir_syarat1.isChecked) 1 else -1
        progress(view.akta_lahir_progress, jml_checked/3*100)
    }

    view.akta_lahir_syarat2.setOnClickListener {
        jml_checked += if (view.akta_lahir_syarat2.isChecked) 1 else -1
        progress(view.akta_lahir_progress,jml_checked/3*100)
    }

    view.akta_lahir_syarat3.setOnClickListener {
        jml_checked += if (view.akta_lahir_syarat3.isChecked) 1 else -1
        progress(view.akta_lahir_progress,jml_checked/3*100)
    }
}

fun listen_akta_mati(view: View){
    var jml_checked = 0.0
    view.akta_mati_syarat1.setOnClickListener {
        jml_checked += if (view.akta_mati_syarat1.isChecked) 1 else -1
        progress(view.akta_mati_progress, jml_checked/3*100)
    }

    view.akta_mati_syarat2.setOnClickListener {
        jml_checked += if (view.akta_mati_syarat2.isChecked) 1 else -1
        progress(view.akta_mati_progress,jml_checked/3*100)
    }

    view.akta_mati_syarat3.setOnClickListener {
        jml_checked += if (view.akta_mati_syarat3.isChecked) 1 else -1
        progress(view.akta_mati_progress,jml_checked/3*100)
    }
}

fun listen_akta_cerai(view: View){
    var jml_checked = 0.0
    view.akta_cerai_syarat1.setOnClickListener {
        jml_checked += if (view.akta_cerai_syarat1.isChecked) 1 else -1
        progress(view.akta_cerai_progress, jml_checked/3*100)
    }

    view.akta_cerai_syarat2.setOnClickListener {
        jml_checked += if (view.akta_cerai_syarat2.isChecked) 1 else -1
        progress(view.akta_cerai_progress,jml_checked/3*100)
    }

    view.akta_cerai_syarat3.setOnClickListener {
        jml_checked += if (view.akta_cerai_syarat3.isChecked) 1 else -1
        progress(view.akta_cerai_progress,jml_checked/3*100)
    }
}

fun listen_pindah(view: View){
    var jml_checked = 0.0
    view.pindah_syarat1.setOnClickListener {
        jml_checked += if (view.pindah_syarat1.isChecked) 1 else -1
        progress(view.pindah_progress, jml_checked/3*100)
    }

    view.pindah_syarat2.setOnClickListener {
        jml_checked += if (view.pindah_syarat2.isChecked) 1 else -1
        progress(view.pindah_progress,jml_checked/3*100)
    }

    view.pindah_syarat3.setOnClickListener {
        jml_checked += if (view.pindah_syarat3.isChecked) 1 else -1
        progress(view.pindah_progress,jml_checked/3*100)
    }
}

fun progress(progres :android.widget.ProgressBar, perc :Double){
    progres.progress = perc.toInt()
}