package com.example.pizza_appv20;

public class Algoritm {

    //1. Add panel prilozheniya - типа создать проект

    //2. Add v7.AddCompatLibrary (File - Project Structure - Dependens - app - "+" - appcompat-v7.28.0.0)

    //3. Add icon (File - New - Image Assest - setup foreground image, background image and shape icon)

    //4. Create colors

    //5. Create style <style name="AppThemeNew" parent="Theme.AppCompat.Light.NoActionBar">, add colors <item name="colorPrimary">@color/colorPrimary</item>
         //add this style to Manifest.xml to android:theme="@style/AppThemeNew".

    //6. Create layout - toolbar_layout.xml
    // <android.support.v7.widget.Toolbar
    // android:layout_height="?attr/actionBarSize" - высоте панели приложения по умолчанию из старой темы
    // android:background="?attr/colorPrimary" - цвет панели такой же как и на старой теме
    // android:theme="@style/ThemeOverlay.AppCompat.Dark.ActionBar"/> - Накладка (overlay) — специальная разновидность темы, которая изменяет текущую тему,
                                                  // переопределяя некоторые из ее атрибутов.
                                                  // Панель инструментов должна выглядеть так же, как при использовании темы
                                                  //Theme.AppCompat.Light.DarkActionBar, поэтому мы используем
                                                  //накладку темы ThemeOverlay.AppCompat.Dark.ActionBar.

    //7. Add tollbar into active_main - <include layout="@layout/toolbar_main"/>

    //8. Import to MainActivity - import android.support.v7.widget.Toolbar;

    //9. to onCreate() add Toolbar toolbar=(Toolbar)findId..... and setSupportActionBar(toolbar) - назначаем (активируем) панель инструментов

    //10. Create OrderActivity.java and activity_order.xml

    //11. Add to active_order.xml <include/> toolbar_main.xml

    //12. watch p.8-9

    //13. Create string-resourse Create Order

    //14. Add that string-resourse Create Order to Manifest -  <activity android:name=".OrderActivity"
    //            android:label="@string/create_order"></activity>

    //15. Add folders with images of signs (значки) drawable-hdpi...xxxhdpi to res.

    //16. Create string-resourse for заголовка действия - чтоб появлялась надпись если значек не влазит в основное поле и виносится в область overflow
          //<string name="create_order_title">Create Order</string>

    //17.




}
