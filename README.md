# SearchableSpinner 
[![Android Arsenal](https://img.shields.io/badge/Android%20Arsenal-SearchableSpinner-green.svg?style=true)](https://android-arsenal.com/details/1/3272)

Spinner with searchable items.

Searchable Spinner is a dialog spinner with the search feature which allows to search the items loaded in the spinner.

![Alt text](https://github.com/miteshpithadiya/SearchableSpinner/blob/master/searchablespinnerlibrary/src/main/res/nobleltevzwLMY47XMeditab02192016201518.gif "Searchable Spinner")

![Alt text](https://github.com/anicetkeric/SearchableSpinner/blob/master/sample/src/main/res/drawable/Screenshot%5B2%5D.png "Searchable Spinner")


# Gradle
    dependencies {
        ...
        compile 'com.toptoche.searchablespinner:searchablespinnerlibrary:1.3.1'
    }

# Usage
    <com.toptoche.searchablespinnerlibrary.SearchableSpinner
            android:layout_width="wrap_content"
            android:layout_height="wrap_content" />
            
            
             <com.toptoche.searchablespinnerlibrary.SearchableSpinner
        android:id="@+id/spinner_pl"
        android:layout_below="@+id/spinner"
        android:layout_width="fill_parent"
        android:layout_height="wrap_content"
        style="@style/spinner_style"
        app:hintText="Select planets"/>

    searchableSpinner.setTitle("Select Item");
    searchableSpinner.setPositiveButton("OK");
    
    
    
    spPlanets = (Spinner) findViewById(R.id.spinner_pl);


        ArrayList<String> planets = new ArrayList<String>();
        planets.add("Mercury");
        planets.add("Venus");
        planets.add("Earth");
        planets.add("Mars");
        planets.add("Jupiter");
        planets.add("Saturn");
        planets.add("Uranus");
        planets.add("Neptune");
        planets.add("Pluto");


        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item, planets);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spPlanets.setAdapter(adapter);
    
    
# Changelog
 * <b>1.3.1</b>
    * Bug fixes.
 * <b>1.3.0</b>
    * Added hint feature.
    * Removed the transparent black view appearing while typing.
    * Added a new feature for text changed listener.
 * <b>1.2.0</b>
    * Prevented crashing when changing the orientation when the dialog is visible on screen (Issue #7).
    * Data now getting refreshed on setting the adapter again (Issue #6).
 * <b>1.1.0</b>
    * New Feature to set the text of the title.
    * New Feature to set the text of the positive button as well as set a click listener on that button.
 * <b>1.0.2</b>
    * Resolved the multidex issue.
 * <b>1.0.0</b>
    * Initial Release

# License

    Copyright 2015-2016 Mitesh Pithadiya

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

     http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
