package com.clevertap.android.sdk.inapp;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.clevertap.android.sdk.customviews.CloseImageView;
import com.linguist.R;

/* JADX INFO: renamed from: com.clevertap.android.sdk.inapp.v */
/* JADX INFO: loaded from: classes.dex */
public class C2236v extends AbstractC2213d {

    /* JADX INFO: renamed from: D0 */
    public RelativeLayout f11226D0;

    /* JADX INFO: renamed from: com.clevertap.android.sdk.inapp.v$a */
    public class a implements ViewTreeObserver.OnGlobalLayoutListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ CloseImageView f11227a;

        public a(CloseImageView closeImageView) {
            this.f11227a = closeImageView;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            C2236v c2236v = C2236v.this;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) c2236v.f11226D0.getLayoutParams();
            boolean z10 = c2236v.f11186z0.f11086P;
            CloseImageView closeImageView = this.f11227a;
            if (!(z10 && c2236v.m6520t0()) && c2236v.m6520t0()) {
                c2236v.m6521v0(c2236v.f11226D0, layoutParams, closeImageView);
            } else {
                AbstractC2213d.m6519u0(c2236v.f11226D0, layoutParams, closeImageView);
            }
            c2236v.f11226D0.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }

    /* JADX INFO: renamed from: com.clevertap.android.sdk.inapp.v$b */
    public class b implements ViewTreeObserver.OnGlobalLayoutListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ CloseImageView f11229a;

        /* JADX INFO: renamed from: com.clevertap.android.sdk.inapp.v$b$a */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                b bVar = b.this;
                int measuredWidth = bVar.f11229a.getMeasuredWidth() / 2;
                bVar.f11229a.setX(C2236v.this.f11226D0.getRight() - measuredWidth);
                bVar.f11229a.setY(C2236v.this.f11226D0.getTop() - measuredWidth);
            }
        }

        /* JADX INFO: renamed from: com.clevertap.android.sdk.inapp.v$b$b, reason: collision with other inner class name */
        public class RunnableC10599b implements Runnable {
            public RunnableC10599b() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                b bVar = b.this;
                int measuredWidth = bVar.f11229a.getMeasuredWidth() / 2;
                bVar.f11229a.setX(C2236v.this.f11226D0.getRight() - measuredWidth);
                bVar.f11229a.setY(C2236v.this.f11226D0.getTop() - measuredWidth);
            }
        }

        /* JADX INFO: renamed from: com.clevertap.android.sdk.inapp.v$b$c */
        public class c implements Runnable {
            public c() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                b bVar = b.this;
                int measuredWidth = bVar.f11229a.getMeasuredWidth() / 2;
                bVar.f11229a.setX(C2236v.this.f11226D0.getRight() - measuredWidth);
                bVar.f11229a.setY(C2236v.this.f11226D0.getTop() - measuredWidth);
            }
        }

        public b(CloseImageView closeImageView) {
            this.f11229a = closeImageView;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            C2236v c2236v = C2236v.this;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) c2236v.f11226D0.getLayoutParams();
            if (c2236v.f11186z0.f11086P && c2236v.m6520t0()) {
                layoutParams.width = (int) (c2236v.f11226D0.getMeasuredHeight() * 1.3f);
                layoutParams.gravity = 17;
                c2236v.f11226D0.setLayoutParams(layoutParams);
                new Handler().post(new c());
            } else if (c2236v.m6520t0()) {
                layoutParams.setMargins(c2236v.m6517r0(140), c2236v.m6517r0(100), c2236v.m6517r0(140), c2236v.m6517r0(100));
                int measuredHeight = c2236v.f11226D0.getMeasuredHeight() - c2236v.m6517r0(130);
                layoutParams.height = measuredHeight;
                layoutParams.width = (int) (measuredHeight * 1.3f);
                layoutParams.gravity = 17;
                c2236v.f11226D0.setLayoutParams(layoutParams);
                new Handler().post(new a());
            } else {
                layoutParams.width = (int) (c2236v.f11226D0.getMeasuredHeight() * 1.3f);
                layoutParams.gravity = 1;
                c2236v.f11226D0.setLayoutParams(layoutParams);
                new Handler().post(new RunnableC10599b());
            }
            c2236v.f11226D0.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }

    /* JADX INFO: renamed from: com.clevertap.android.sdk.inapp.v$c */
    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            C2236v c2236v = C2236v.this;
            c2236v.m6513n0(null);
            c2236v.m3582e().finish();
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: I */
    public final View mo3561I(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = (this.f11186z0.f11086P && m6520t0()) ? layoutInflater.inflate(R.layout.tab_inapp_half_interstitial_image, viewGroup, false) : layoutInflater.inflate(R.layout.inapp_half_interstitial_image, viewGroup, false);
        FrameLayout frameLayout = (FrameLayout) viewInflate.findViewById(R.id.inapp_half_interstitial_image_frame_layout);
        CloseImageView closeImageView = (CloseImageView) frameLayout.findViewById(199272);
        frameLayout.setBackground(new ColorDrawable(-1157627904));
        RelativeLayout relativeLayout = (RelativeLayout) frameLayout.findViewById(R.id.half_interstitial_image_relative_layout);
        this.f11226D0 = relativeLayout;
        relativeLayout.setBackgroundColor(Color.parseColor(this.f11186z0.f11103d));
        ImageView imageView = (ImageView) this.f11226D0.findViewById(R.id.half_interstitial_image);
        int i10 = this.f11185y0;
        if (i10 == 1) {
            this.f11226D0.getViewTreeObserver().addOnGlobalLayoutListener(new a(closeImageView));
        } else if (i10 == 2) {
            this.f11226D0.getViewTreeObserver().addOnGlobalLayoutListener(new b(closeImageView));
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
