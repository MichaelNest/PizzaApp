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

    //7. Add toolbar into active_main - <include layout="@layout/toolbar_main"/>

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

    //17. Create folder-menu in res: New-Android Resourse Directory

    //18. Create menu resourse file: File-New-Android Resourse File - имя файла menu_main и папка Menu

    //19. Create id, title, icon, orderInCategory(порядок следования элементов), showAsAction(форма отображения елемента)

    //20. Create public boolean onCreateOptionMenu(Menu menu) to MainActivity.java - она создает объект Menu, который является Java-представлением файла ресурсов меню,
         //а все действия из файла ресурсов преобразуются в объекты MenuItem. Все они добавляются на панель приложения.

    //21. Create public boolean onOptionsitemSelected(MenuItem item) - определение действия при нажатии

    //22. Кнопка Вверх для возврвта. Прописываем в Манифест to OrderActivity, что активность MainActivity is parent for OrderActivity:
          // android:parentActivityName=".MainActivity"

    //23. Активизация кноппки возврата в родительскую активность для OrderActivity:
          // ActionBar actionBar = getSupportActionBar();
          // actionBar.setDisplayHomeAsUpEnabled(true);

    //24. Добавление провайдера передачи информации в файл menu_main.xml - добавление строкового ресурса action_share to string.xml
          // <string name="action_share">Share</string>

    //25. Действие передачи информации добавляется в файл ресурсов меню: id, title, orderInCategory, showAsAction, app actionProvaiderClass

    //26. Add to MainActivity private ShareActionProvider shareActionProvider;

    //27. Add to onCreateOptionsMenu() :  MenuItem menuItem = (MenuItem)findViewById(R.id.action_share);
                    // shareActionProvider = (ShareActionProvider)MenuItemCompat.getActionProvider(menuItem); - получить ссылку на провайдер действия
                                        // и присвоить ее приватной переменной
                                       // setShareActionIntent("Want to join me for pizza");

    //28. Create method; setShareActionIntent(String text){
    //        Intent intent = new Intent(Intent.ACTION_SEND);
    //        intent.setType("text/plain");
    //        intent.putExtra(Intent.EXTRA_TEXT, text);
    //        shareActionProvider.setShareIntent(intent);
    //    } создание интента и передача его провайдеру действия

    //29.







}
