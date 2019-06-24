package academy.learnprogramming.flickrbrowser;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class PhotoDetailActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_photo_detail);
        activateToolbar(true);

        Intent intent = getIntent();
        Photo photo = (Photo) intent.getSerializableExtra(PHOTO_TRANSFER);
        if(photo!= null){
            TextView photoTitle = (TextView) findViewById(R.id.photo_title);
            Resources resources = getResources();
            String Titletext=resources.getString(R.string.photo_title_text,photo.getTitle());
            photoTitle.setText(Titletext);
//            photoTitle.setText("Title: "+photo.getTitle());

            TextView photoTags = (TextView) findViewById(R.id.photo_tags);
            String Tagstext=resources.getString(R.string.photo_tags_text,photo.getTags());
            photoTags.setText(Tagstext);
//            photoTags.setText("Tags: "+photo.getTags());

            TextView photoAuthor = (TextView) findViewById(R.id.photo_author);
            photoAuthor.setText("Author: "+photo.getAuthor());

            ImageView photoImage = (ImageView) findViewById(R.id.photo_image);
            Picasso.with(this).load(photo.getLink())
                    .error(R.drawable.placeholder)
                    .placeholder(R.drawable.placeholder) //use the placeholder image when the data is downloaded.
                    .into(photoImage);
        }
    }

}
