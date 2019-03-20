package rguerrero.examen

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.detalle_superhero.*

class DetalleSuperhero : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.detalle_superhero)

        val nombreHero:String = intent.getStringExtra("nombre")
        val telefonoHero:String = intent.getStringExtra("telefono")
        val ciudadHero:String = intent.getStringExtra("ciudad")
        val correo: String = intent.getStringExtra("correo")
        val imagen:Int = intent.getIntExtra("imagen", imagenSuperheroe.id)

        var bundle = intent.extras
        var nombre: String = bundle.getString("nombre   ")
    }
}
