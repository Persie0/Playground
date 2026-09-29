package com.clevertap.android.sdk.inapp;

import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.clevertap.android.sdk.customviews.CloseImageView;
import com.linguist.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.clevertap.android.sdk.inapp.r */
/* JADX INFO: loaded from: classes.dex */
public class C2232r extends AbstractC2219g {

    /* JADX INFO: renamed from: com.clevertap.android.sdk.inapp.r$a */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            C2232r c2232r = C2232r.this;
            c2232r.m6513n0(null);
            c2232r.m3582e().finish();
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: I */
    public final View mo3561I(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ArrayList arrayList = new ArrayList();
        View viewInflate = layoutInflater.inflate(R.layout.inapp_cover, viewGroup, false);
        FrameLayout frameLayout = (FrameLayout) viewInflate.findViewById(R.id.inapp_cover_frame_layout);
        RelativeLayout relativeLayout = (RelativeLayout) frameLayout.findViewById(R.id.cover_relative_layout);
        relativeLayout.setBackgroundColor(Color.parseColor(this.f11186z0.f11103d));
        LinearLayout linearLayout = (LinearLayout) relativeLayout.findViewById(R.id.cover_linear_layout);
        Button button = (Button) linearLayout.findViewById(R.id.cover_button1);
        arrayList.add(button);
        Button button2 = (Button) linearLayout.findViewById(R.id.cover_button2);
        arrayList.add(button2);
        ImageView imageView = (ImageView) relativeLayout.findViewById(R.id.backgroundImage);
        if (this.f11186z0.m6491d(this.f11185y0) != null && CTInAppNotification.m6488c(this.f11186z0.m6491d(this.f11185y0)) != null) {
            imageView.setImageBitmap(CTInAppNotification.m6488c(this.f11186z0.m6491d(this.f11185y0)));
            imageView.setTag(0);
            imageView.setOnClickListener(new AbstractC2211c.a());
        }
        TextView textView = (TextView) relativeLayout.findViewById(R.id.cover_title);
        textView.setText(this.f11186z0.f11098a0);
        textView.setTextColor(Color.parseColor(this.f11186z0.f11100b0));
        TextView textView2 = (TextView) relativeLayout.findViewById(R.id.cover_message);
        textView2.setText(this.f11186z0.f11092V);
        textView2.setTextColor(Color.parseColor(this.f11186z0.f11093W));
        ArrayList<CTInAppNotificationButton> arrayList2 = this.f11186z0.f11107f;
        if (arrayList2.size() == 1) {
            int i10 = this.f11185y0;
            if (i10 == 2) {
                button.setVisibility(8);
            } else if (i10 == 1) {
                button.setVisibility(4);
            }
            m6529A0(button2, arrayList2.get(0), 0);
        } else if (!arrayList2.isEmpty()) {
            for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                if (i11 < 2) {
                    m6529A0((Button) arrayList.get(i11), arrayList2.get(i11), i11);
                }
            }
        }
        CloseImageView closeImageView = (CloseImageView) frameLayout.findViewById(199272);
        closeImageView.setOnClickListener(new a());
        if (this.f11186z0.f11080J) {
            closeImageView.setVisibility(0);
        } else {
            closeImageView.setVisibility(8);
        }
        return viewInflate;
    }
}
