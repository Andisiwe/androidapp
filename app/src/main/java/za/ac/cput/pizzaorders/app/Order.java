package za.ac.cput.pizzaorders.app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

/**
 * Created by Andies on 2015-09-28.
 */
public class Order extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);

        String[] pizzaName = {"Chicken Pizza", "Lamb Pizza", "Magarita Pizza"};
        String[] pizzaSize = {"Large", "Medium", "Small"};
        String[] pizzaTopping = {"Garlic", "Mushrooms", "Pineapple"};

        Spinner name = (Spinner)findViewById(R.id.spinner);
        Spinner size = (Spinner)findViewById(R.id.spinner2);
        Spinner topping = (Spinner)findViewById(R.id.spinner3);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, pizzaName);
        name.setAdapter(adapter);

        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, pizzaSize);
        size.setAdapter(adapter2);

        ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, pizzaTopping);
        topping.setAdapter(adapter3);
    }

    public void confirmOrder(View view){
        Intent intent = new Intent(this, ConfirmOrder.class);
        this.startActivity(intent);

    }

}
