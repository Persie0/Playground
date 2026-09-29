package com.clevertap.android.sdk.inapp;

import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.clevertap.android.sdk.customviews.CloseImageView;
import com.linguist.R;

/* JADX INFO: renamed from: com.clevertap.android.sdk.inapp.s */
/* JADX INFO: loaded from: classes.dex */
public class C2233s extends AbstractC2213d {

    /* JADX INFO: renamed from: com.clevertap.android.sdk.inapp.s$a */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            C2233s c2233s = C2233s.this;
            c2233s.m6513n0(null);
            c2233s.m3582e().finish();
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: I */
    public final View mo3561I(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.inapp_cover_image, viewGroup, false);
        FrameLayout frameLayout = (FrameLayout) viewInflate.findViewById(R.id.inapp_cover_image_frame_layout);
        frameLayout.setBackgroundColor(Color.parseColor(this.f11186z0.f11103d));
        ImageView imageView = (ImageView) ((RelativeLayout) frameLayout.findViewById(R.id.cover_image_relative_layout)).findViewById(R.id.cover_image);
        if (this.f11186z0.m6491d(this.f11185y0) != null && CTInAppNotification.m6488c(this.f11186z0.m6491d(this.f11185y0)) != null) {
            imageView.setImageBitmap(CTInAppNotification.m6488c(this.f11186z0.m6491d(this.f11185y0)));
            imageView.setTag(0);
            imageView.setOnClickListener(new AbstractC2211c.a());
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
