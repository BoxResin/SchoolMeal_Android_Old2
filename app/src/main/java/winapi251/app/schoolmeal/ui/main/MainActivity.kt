package winapi251.app.schoolmeal.ui.main

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import winapi251.app.schoolmeal.R
import winapi251.app.schoolmeal.ui.schoolsearch.SchoolSearchActivity

/** 메인 액티비티 */
class MainActivity : AppCompatActivity()
{
	/** 메인 액티비티가 생성될 때 호출된다. */
	override fun onCreate(savedInstanceState: Bundle?)
	{
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_main)

		setSupportActionBar(toolbar)
	}

	/** 메인 액티비티 메뉴를 생성해야 할 때 호출된다. */
	override fun onCreateOptionsMenu(menu: Menu): Boolean
	{
		menuInflater.inflate(R.menu.activity_main, menu)
		return true
	}

	/** 사용자가 메인 액티비티 메뉴를 누를 때 호출된다. */
	override fun onOptionsItemSelected(item: MenuItem): Boolean
	{
		when (item.itemId)
		{
			// 학교 검색
			R.id.action_search_school ->
			{
				// 학교 검색 액티비티 실행
				val intent = Intent(this, SchoolSearchActivity::class.java)
				startActivity(intent)
			}
		}
		return true
	}
}
