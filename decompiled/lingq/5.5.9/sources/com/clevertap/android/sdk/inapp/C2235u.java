package com.clevertap.android.sdk.inapp;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.clevertap.android.sdk.customviews.CloseImageView;
import com.linguist.R;
import java.util.ArrayList;
import p290o6.C7951d0;

/* JADX INFO: renamed from: com.clevertap.android.sdk.inapp.u */
/* JADX INFO: loaded from: classes.dex */
public class C2235u extends AbstractC2219g {

    /* JADX INFO: renamed from: D0 */
    public RelativeLayout f11215D0;

    /* JADX INFO: renamed from: com.clevertap.android.sdk.inapp.u$a */
    public class a implements ViewTreeObserver.OnGlobalLayoutListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ LayoutInflater f11216a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ CloseImageView f11217b;

        public a(LayoutInflater layoutInflater, CloseImageView closeImageView) {
            this.f11216a = layoutInflater;
            this.f11217b = closeImageView;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            C2235u c2235u = C2235u.this;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) c2235u.f11215D0.getLayoutParams();
            boolean z10 = c2235u.f11186z0.f11086P;
            CloseImageView closeImageView = this.f11217b;
            if (z10 && c2235u.m6520t0()) {
                AbstractC2213d.m6519u0(c2235u.f11215D0, layoutParams, closeImageView);
            } else {
                if (c2235u.f11186z0.f11114i0) {
                    if (C7951d0.m15757k(this.f11216a.getContext()) == 2) {
                        AbstractC2213d.m6519u0(c2235u.f11215D0, layoutParams, closeImageView);
                    }
                }
                if (c2235u.m6520t0()) {
                    c2235u.m6521v0(c2235u.f11215D0, layoutParams, closeImageView);
                } else {
                    AbstractC2213d.m6519u0(c2235u.f11215D0, layoutParams, closeImageView);
                }
            }
            c2235u.f11215D0.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }

    /* JADX INFO: renamed from: com.clevertap.android.sdk.inapp.u$b */
    public class b implements ViewTreeObserver.OnGlobalLayoutListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ FrameLayout f11219a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ CloseImageView f11220b;

        /* JADX INFO: renamed from: com.clevertap.android.sdk.inapp.u$b$a */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                b bVar = b.this;
                int measuredWidth = bVar.f11220b.getMeasuredWidth() / 2;
                bVar.f11220b.setX(C2235u.this.f11215D0.getRight() - measuredWidth);
                bVar.f11220b.setY(C2235u.this.f11215D0.getTop() - measuredWidth);
            }
        }

        /* JADX INFO: renamed from: com.clevertap.android.sdk.inapp.u$b$b, reason: collision with other inner class name */
        public class RunnableC10598b implements Runnable {
            public RunnableC10598b() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                b bVar = b.this;
                int measuredWidth = bVar.f11220b.getMeasuredWidth() / 2;
                bVar.f11220b.setX(C2235u.this.f11215D0.getRight() - measuredWidth);
                bVar.f11220b.setY(C2235u.this.f11215D0.getTop() - measuredWidth);
            }
        }

        /* JADX INFO: renamed from: com.clevertap.android.sdk.inapp.u$b$c */
        public class c implements Runnable {
            public c() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                b bVar = b.this;
                int measuredWidth = bVar.f11220b.getMeasuredWidth() / 2;
                bVar.f11220b.setX(C2235u.this.f11215D0.getRight() - measuredWidth);
                bVar.f11220b.setY(C2235u.this.f11215D0.getTop() - measuredWidth);
            }
        }

        public b(FrameLayout frameLayout, CloseImageView closeImageView) {
            this.f11219a = frameLayout;
            this.f11220b = closeImageView;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            RelativeLayout relativeLayout = (RelativeLayout) this.f11219a.findViewById(R.id.half_interstitial_relative_layout);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) relativeLayout.getLayoutParams();
            C2235u c2235u = C2235u.this;
            if (c2235u.f11186z0.f11086P && c2235u.m6520t0()) {
                layoutParams.width = (int) (relativeLayout.getMeasuredHeight() * 1.3f);
                layoutParams.gravity = 17;
                relativeLayout.setLayoutParams(layoutParams);
                new Handler().post(new c());
            } else if (c2235u.m6520t0()) {
                layoutParams.setMargins(c2235u.m6517r0(140), c2235u.m6517r0(100), c2235u.m6517r0(140), c2235u.m6517r0(100));
                int measuredHeight = relativeLayout.getMeasuredHeight() - c2235u.m6517r0(130);
                layoutParams.height = measuredHeight;
                layoutParams.width = (int) (measuredHeight * 1.3f);
                layoutParams.gravity = 17;
                relativeLayout.setLayoutParams(layoutParams);
                new Handler().post(new a());
            } else {
                layoutParams.width = (int) (relativeLayout.getMeasuredHeight() * 1.3f);
                layoutParams.gravity = 1;
                relativeLayout.setLayoutParams(layoutParams);
                new Handler().post(new RunnableC10598b());
            }
            c2235u.f11215D0.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }

    /* JADX INFO: renamed from: com.clevertap.android.sdk.inapp.u$c */
    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            C2235u c2235u = C2235u.this;
            c2235u.m6513n0(null);
            c2235u.m3582e().finish();
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0037  */
    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: I */
    public final View mo3561I(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate;
        ArrayList arrayList = new ArrayList();
        if (this.f11186z0.f11086P && m6520t0()) {
            viewInflate = layoutInflater.inflate(R.layout.tab_inapp_half_interstitial, viewGroup, false);
        } else {
            if (this.f11186z0.f11114i0) {
                if (C7951d0.m15757k(layoutInflater.getContext()) == 2) {
                    viewInflate = layoutInflater.inflate(R.layout.tab_inapp_half_interstitial, viewGroup, false);
                }
            }
            viewInflate = layoutInflater.inflate(R.layout.inapp_half_interstitial, viewGroup, false);
        }
        FrameLayout frameLayout = (FrameLayout) viewInflate.findViewById(R.id.inapp_half_interstitial_frame_layout);
        CloseImageView closeImageView = (CloseImageView) frameLayout.findViewById(199272);
        RelativeLayout relativeLayout = (RelativeLayout) frameLayout.findViewById(R.id.half_interstitial_relative_layout);
        this.f11215D0 = relativeLayout;
        relativeLayout.setBackgroundColor(Color.parseColor(this.f11186z0.f11103d));
        int i10 = this.f11185y0;
        if (i10 == 1) {
            this.f11215D0.getViewTreeObserver().addOnGlobalLayoutListener(new a(layoutInflater, closeImageView));
        } else if (i10 == 2) {
            this.f11215D0.getViewTreeObserver().addOnGlobalLayoutListener(new b(frameLayout, closeImageView));
        }
        if (this.f11186z0.m6491d(this.f11185y0) != null && CTInAppNotification.m6488c(this.f11186z0.m6491d(this.f11185y0)) != null) {
            ((ImageView) this.f11215D0.findViewById(R.id.backgroundImage)).setImageBitmap(CTInAppNotification.m6488c(this.f11186z0.m6491d(this.f11185y0)));
        }
        LinearLayout linearLayout = (LinearLayout) this.f11215D0.findViewById(R.id.half_interstitial_linear_layout);
        Button button = (Button) linearLayout.findViewById(R.id.half_interstitial_button1);
        arrayList.add(button);
        Button button2 = (Button) linearLayout.findViewById(R.id.half_interstitial_button2);
        arrayList.add(button2);
        TextView textView = (TextView) this.f11215D0.findViewById(R.id.half_interstitial_title);
        textView.setText(this.f11186z0.f11098a0);
        textView.setTextColor(Color.parseColor(this.f11186z0.f11100b0));
        TextView textView2 = (TextView) this.f11215D0.findViewById(R.id.half_interstitial_message);
        textView2.setText(this.f11186z0.f11092V);
        textView2.setTextColor(Color.parseColor(this.f11186z0.f11093W));
        ArrayList<CTInAppNotificationButton> arrayList2 = this.f11186z0.f11107f;
        if (arrayList2.size() == 1) {
            int i11 = this.f11185y0;
            if (i11 == 2) {
                button.setVisibility(8);
            } else if (i11 == 1) {
                button.setVisibility(4);
            }
            m6529A0(button2, arrayList2.get(0), 0);
        } else if (!arrayList2.isEmpty()) {
            for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                if (i12 < 2) {
                    m6529A0((Button) arrayList.get(i12), arrayList2.get(i12), i12);
                }
            }
        }
        frameLayout.setBackground(new ColorDrawable(-1157627904));
        closeImageView.setOnClickListener(new c());
        if (this.f11186z0.f11080J) {
            closeImageView.setVisibility(0);
        } else {
            closeImageView.setVisibility(8);
        }
        return viewInflate;
    }
}
