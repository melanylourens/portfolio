package melanyportfolio.melanyapps.com.melanyportfolio.view;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import melanyportfolio.melanyapps.com.melanyportfolio.R;

public class ContactFragment extends Fragment {

    public ContactFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View contactView = inflater.inflate(R.layout.fragment_contact, container, false);

        final Button contactNumberButton = contactView.findViewById(R.id.devContactNumber);
        Log.d("contactNumber", "onClick: " + contactNumberButton.getText());
        contactNumberButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("contactNumber", "onClick: ");
                String contactNumber = "tel:" + contactNumberButton.getText();
                Log.d("contactNumber", "onClick: " + contactNumber);
                startActivity(new Intent(Intent.ACTION_DIAL, Uri.parse(contactNumber)));
            }
        });

        return contactView;
    }

}
