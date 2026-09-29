package com.clevertap.android.sdk.inapp;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.clevertap.android.sdk.customviews.CloseImageView;
import com.linguist.R;

/* JADX INFO: renamed from: com.clevertap.android.sdk.inapp.b0 */
/* JADX INFO: loaded from: classes.dex */
public class C2210b0 extends AbstractC2213d {

    /* JADX INFO: renamed from: D0 */
    public RelativeLayout f11171D0;

    /* JADX INFO: renamed from: com.clevertap.android.sdk.inapp.b0$a */
    public class a implements ViewTreeObserver.OnGlobalLayoutListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ FrameLayout f11172a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ CloseImageView f11173b;

        public a(FrameLayout frameLayout, CloseImageView closeImageView) {
            this.f11172a = frameLayout;
            this.f11173b = closeImageView;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            C2210b0 c2210b0 = C2210b0.this;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) c2210b0.f11171D0.getLayoutParams();
            boolean z10 = c2210b0.f11186z0.f11086P;
            FrameLayout frameLayout = this.f11172a;
            CloseImageView closeImageView = this.f11173b;
            if (z10 && c2210b0.m6520t0()) {
                c2210b0.m6523x0(c2210b0.f11171D0, layoutParams, frameLayout, closeImageView);
            } else if (c2210b0.m6520t0()) {
                c2210b0.m6522w0(c2210b0.f11171D0, layoutParams, frameLayout, closeImageView);
            } else {
                RelativeLayout relativeLayout = c2210b0.f11171D0;
                layoutParams.height = (int) (relativeLayout.getMeasuredWidth() * 1.78f);
                relativeLayout.setLayoutParams(layoutParams);
                AbstractC2213d.m6518s0(relativeLayout, closeImageView);
            }
            c2210b0.f11171D0.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }

    /* JADX INFO: renamed from: com.clevertap.android.sdk.inapp.b0$b */
    public class b implements ViewTreeObserver.OnGlobalLayoutListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ FrameLayout f11175a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ CloseImageView f11176b;

        public b(FrameLayout frameLayout, CloseImageView closeImageView) {
            this.f11175a = frameLayout;
            this.f11176b = closeImageView;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            C2210b0 c2210b0 = C2210b0.this;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) c2210b0.f11171D0.getLayoutParams();
            boolean z10 = c2210b0.f11186z0.f11086P;
            FrameLayout frameLayout = this.f11175a;
            CloseImageView closeImageView = this.f11176b;
            if (z10 && c2210b0.m6520t0()) {
                c2210b0.m6525z0(c2210b0.f11171D0, layoutParams, frameLayout, closeImageView);
            } else if (c2210b0.m6520t0()) {
                c2210b0.m6524y0(c2210b0.f11171D0, layoutParams, frameLayout, closeImageView);
            } else {
                RelativeLayout relativeLayout = c2210b0.f11171D0;
                layoutParams.width = (int) (relativeLayout.getMeasuredHeight() * 1.78f);
                layoutParams.gravity = 1;
                relativeLayout.setLayoutParams(layoutParams);
                AbstractC2213d.m6518s0(relativeLayout, closeImageView);
            }
            c2210b0.f11171D0.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }

    /* JADX INFO: renamed from: com.clevertap.android.sdk.inapp.b0$c */
    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            C2210b0 c2210b0 = C2210b0.this;
            c2210b0.m6513n0(null);
            c2210b0.m3582e().finish();
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: I */
    public final View mo3561I(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = (this.f11186z0.f11086P && m6520t0()) ? layoutInflater.inflate(R.layout.tab_inapp_interstitial_image, viewGroup, false) : layoutInflater.inflate(R.layout.inapp_interstitial_image, viewGroup, false);
        FrameLayout frameLayout = (FrameLayout) viewInflate.findViewById(R.id.inapp_interstitial_image_frame_layout);
        frameLayout.setBackground(new ColorDrawable(-1157627904));
        CloseImageView closeImageView = (CloseImageView) frameLayout.findViewById(199272);
        RelativeLayout relativeLayout = (RelativeLayout) frameLayout.findViewById(R.id.interstitial_image_relative_layout);
        this.f11171D0 = relativeLayout;
        relativeLayout.setBackgroundColor(Color.parseColor(this.f11186z0.f11103d));
        ImageView imageView = (ImageView) this.f11171D0.findViewById(R.id.interstitial_image);
        int i10 = this.f11185y0;
        if (i10 == 1) {
            this.f11171D0.getViewTreeObserver().addOnGlobalLayoutListener(new a(frameLayout, closeImageView));
        } else if (i10 == 2) {
            this.f11171D0.getViewTreeObserver().addOnGlobalLayoutListener(new b(frameLayout, closeImageView));
        }
        if (this.f11186z0.m6491d(this.f11185y0) != null && CTInAppNotification.m6488c(this.f11186z0.m6491d(this.f11185y0)) != null) {
            imageView.setImageBitmap(CTInAppNotification.m6488c(this.f11186z0.m6491d(this.f11185y0)));
            imageView.setTag(0);
            imageView.setOnClickListener(new AbstractC2211c.a());
        }
        closeImageView.setOnClickListener(new c());
        if (this.f11186z0.f11080J) {
            closeImageView.setVisibility(0);
        } else {
            closeImageView.setVisibility(8);
        }
        return viewInflate;
    }
}
