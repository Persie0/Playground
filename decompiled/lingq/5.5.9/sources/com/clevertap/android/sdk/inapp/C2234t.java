package com.clevertap.android.sdk.inapp;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.linguist.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.clevertap.android.sdk.inapp.t */
/* JADX INFO: loaded from: classes.dex */
public class C2234t extends AbstractViewOnTouchListenerC2226l {

    /* JADX INFO: renamed from: com.clevertap.android.sdk.inapp.t$a */
    public class a implements View.OnTouchListener {
        public a() {
        }

        @Override // android.view.View.OnTouchListener
        @SuppressLint({"ClickableViewAccessibility"})
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            C2234t.this.f11209D0.onTouchEvent(motionEvent);
            return true;
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: I */
    public final View mo3561I(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bitmap bitmapM6488c;
        ArrayList arrayList = new ArrayList();
        View viewInflate = layoutInflater.inflate(R.layout.inapp_footer, viewGroup, false);
        this.f11210E0 = viewInflate;
        FrameLayout frameLayout = (FrameLayout) viewInflate.findViewById(R.id.footer_frame_layout);
        new FrameLayout.LayoutParams(-1, -1);
        RelativeLayout relativeLayout = (RelativeLayout) frameLayout.findViewById(R.id.footer_relative_layout);
        relativeLayout.setBackgroundColor(Color.parseColor(this.f11186z0.f11103d));
        LinearLayout linearLayout = (LinearLayout) relativeLayout.findViewById(R.id.footer_linear_layout_1);
        LinearLayout linearLayout2 = (LinearLayout) relativeLayout.findViewById(R.id.footer_linear_layout_2);
        LinearLayout linearLayout3 = (LinearLayout) relativeLayout.findViewById(R.id.footer_linear_layout_3);
        Button button = (Button) linearLayout3.findViewById(R.id.footer_button_1);
        arrayList.add(button);
        Button button2 = (Button) linearLayout3.findViewById(R.id.footer_button_2);
        arrayList.add(button2);
        ImageView imageView = (ImageView) linearLayout.findViewById(R.id.footer_icon);
        if (this.f11186z0.f11091U.isEmpty() || (bitmapM6488c = CTInAppNotification.m6488c(this.f11186z0.f11091U.get(0))) == null) {
            imageView.setVisibility(8);
        } else {
            imageView.setImageBitmap(bitmapM6488c);
        }
        TextView textView = (TextView) linearLayout2.findViewById(R.id.footer_title);
        textView.setText(this.f11186z0.f11098a0);
        textView.setTextColor(Color.parseColor(this.f11186z0.f11100b0));
        TextView textView2 = (TextView) linearLayout2.findViewById(R.id.footer_message);
        textView2.setText(this.f11186z0.f11092V);
        textView2.setTextColor(Color.parseColor(this.f11186z0.f11093W));
        ArrayList<CTInAppNotificationButton> arrayList2 = this.f11186z0.f11107f;
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                if (i10 < 2) {
                    m6534s0((Button) arrayList.get(i10), arrayList2.get(i10), i10);
                }
            }
        }
        if (this.f11186z0.f11105e == 1) {
            button2.setVisibility(8);
            button.setLayoutParams(new LinearLayout.LayoutParams(0, -1, 2.0f));
            button2.setLayoutParams(new LinearLayout.LayoutParams(0, -1, 0.0f));
        }
        this.f11210E0.setOnTouchListener(new a());
        return this.f11210E0;
    }
}
