package winapi251.app.schoolmeal

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

/** 메인 액티비티 */
class MainActivity : AppCompatActivity()
{
	/** 메인 액티비티가 생성될 때 호출된다. */
	override fun onCreate(savedInstanceState: Bundle?)
	{
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_main)
	}
}
