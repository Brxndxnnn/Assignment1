package sg.edu.np.mad.Assignment1;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;


public class EventPage extends AppCompatActivity {

    private final List<EventList> eventLists = new ArrayList<>();
    private EventAdapter eventAdapter;
    private RecyclerView eventRecyclerView;
    String img1 = "https://static.mothership.sg/1/2020/09/Cover-Photo-2.png";
    String img2 = "https://www.fairprice.com.sg/wp-content/uploads/2021/05/ewaste-3-970x526-1.jpg";
    String img3 = "https://www.citysquaremall.com.sg/wp-content/uploads/2019/09/E-Waste-ThumbNail-326x245.jpg";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_page);

        ActionBar actionBar = getSupportActionBar();

        actionBar.setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.MintCream)));

        actionBar.setTitle("Event");
        actionBar.setHomeAsUpIndicator(R.drawable.backbutton_icon);

        // showing the back button in action bar
        actionBar.setDisplayHomeAsUpEnabled(true);

        eventRecyclerView = findViewById(R.id.event_recycler);
        eventRecyclerView.setHasFixedSize(true);
        eventRecyclerView.setLayoutManager(new LinearLayoutManager(EventPage.this));

        eventAdapter = new EventAdapter(eventLists, EventPage.this);
        eventRecyclerView.setAdapter(eventAdapter);

        eventLists.clear();


        EventList eventList = new EventList(img1, "Hear talks from Recycling experts!", "TerraCycle and Loop founder and CEO Tom Szaky says the economics of the recycling business are broken in key ways, but consumer and corporate interest in building a circular economy continues to grow. ","All Day", "HeartBeat Bedok");
        EventList eventList2 = new EventList(img2, "Go Green Recycle Your E-Waste", "As an individual or as part of a household, you are encouraged to make use of e-waste recycling programmes voluntarily offered by industry stakeholders. Simply drop off your e-waste at the recycling points to properly recycle your e-waste. Trading or donation of used goods in working condition can be performed at these Collection Centres.","10am - 2pm"," Tampines Hub");
        EventList eventList3 = new EventList(img3, "Go Green Recycle Your E-Waste", "As an individual or as part of a household, you are encouraged to make use of e-waste recycling programmes voluntarily offered by industry stakeholders. Simply drop off your e-waste at the recycling points to properly recycle your e-waste. Trading or donation of used goods in working condition can be performed at these Collection Centres.","3PM - 6PM","Jurong East Mrt");

        eventLists.add(eventList);
        eventLists.add(eventList2);
        eventLists.add(eventList3);

        eventAdapter.updateData(eventLists);
    }




    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed(); // go back previous activity
        finish();
        return super.onSupportNavigateUp();
    }


}