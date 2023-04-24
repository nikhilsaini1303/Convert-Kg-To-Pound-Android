# Convert-Kg-To-Pound-Android

To create a simple converter app that converts Kg to pounds in Android Studio, follow these steps:

1. Create a new project in Android Studio. In the "Create New Project" dialog, choose "Empty Activity" as the template.

2. Design the user interface for the converter app. Open the layout file for the main activity and add a TextView to display the result of the conversion, an EditText to enter the weight in kilograms, and a Button to trigger the conversion. You can arrange these UI elements as per your design preference.

3. Implement the conversion logic. In the MainActivity.java file, define the conversion formula to convert the weight in kilograms to pounds. You can use the following formula:
           
           pounds = kilograms * 2.20462;


4. Add an OnClickListener to the conversion button. In the onCreate() method of MainActivity.java, add an OnClickListener to the conversion button to trigger the conversion when the button is clicked. In the OnClickListener, retrieve the input value from the EditText and convert it to a Double. Then, apply the conversion formula to get the weight in pounds, and display the result in the TextView
    
    
    button.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        EditText editText = findViewById(R.id.edit_text);
        TextView textView = findViewById(R.id.text_view);
        double kilograms = Double.parseDouble(editText.getText().toString());
        double pounds = kilograms * 2.20462;
        textView.setText(String.format("%.2f pounds", pounds));
    }
   });
5. Test the app. Run the app on an emulator or a physical device and test the conversion by entering a weight in kilograms and clicking the conversion button. The app should display the equivalent weight in pounds in the TextView.

