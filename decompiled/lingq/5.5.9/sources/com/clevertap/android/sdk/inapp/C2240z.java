package com.clevertap.android.sdk.inapp;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.util.TypedValue;
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
import com.clevertap.android.sdk.gif.GifImageView;
import com.google.android.exoplayer2.C2413j;
import com.google.android.exoplayer2.C2466p;
import com.google.android.exoplayer2.ExoPlayer;
import com.google.android.exoplayer2.p051ui.StyledPlayerView;
import com.google.android.exoplayer2.source.hls.HlsMediaSource;
import com.linguist.R;
import java.util.ArrayList;
import p150h9.C5909e;
import p254m2.C7472a;
import p286o2.C7906f;
import p454wa.C9887l;
import p454wa.C9888m;
import p454wa.C9889n;
import p479xa.C10129a;
import p479xa.C10134c0;
import ua.C9492a;
import ua.C9496e;

/* JADX INFO: renamed from: com.clevertap.android.sdk.inapp.z */
/* JADX INFO: loaded from: classes.dex */
public class C2240z extends AbstractC2219g {

    /* JADX INFO: renamed from: O0 */
    public static long f11240O0;

    /* JADX INFO: renamed from: P0 */
    public static final /* synthetic */ int f11241P0 = 0;

    /* JADX INFO: renamed from: D0 */
    public boolean f11242D0 = false;

    /* JADX INFO: renamed from: E0 */
    public DialogC2208a0 f11243E0;

    /* JADX INFO: renamed from: F0 */
    public ImageView f11244F0;

    /* JADX INFO: renamed from: G0 */
    public GifImageView f11245G0;

    /* JADX INFO: renamed from: H0 */
    public C2413j f11246H0;

    /* JADX INFO: renamed from: I0 */
    public StyledPlayerView f11247I0;

    /* JADX INFO: renamed from: J0 */
    public RelativeLayout f11248J0;

    /* JADX INFO: renamed from: K0 */
    public FrameLayout f11249K0;

    /* JADX INFO: renamed from: L0 */
    public ViewGroup.LayoutParams f11250L0;

    /* JADX INFO: renamed from: M0 */
    public ViewGroup.LayoutParams f11251M0;

    /* JADX INFO: renamed from: N0 */
    public ViewGroup.LayoutParams f11252N0;

    /* JADX INFO: renamed from: com.clevertap.android.sdk.inapp.z$a */
    public class a implements ViewTreeObserver.OnGlobalLayoutListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ FrameLayout f11253a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ CloseImageView f11254b;

        public a(FrameLayout frameLayout, CloseImageView closeImageView) {
            this.f11253a = frameLayout;
            this.f11254b = closeImageView;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            FrameLayout frameLayout = this.f11253a;
            RelativeLayout relativeLayout = (RelativeLayout) frameLayout.findViewById(R.id.interstitial_relative_layout);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) relativeLayout.getLayoutParams();
            C2240z c2240z = C2240z.this;
            boolean z10 = c2240z.f11186z0.f11086P;
            CloseImageView closeImageView = this.f11254b;
            if (z10 && c2240z.m6520t0()) {
                c2240z.m6523x0(c2240z.f11248J0, layoutParams, frameLayout, closeImageView);
            } else if (c2240z.m6520t0()) {
                c2240z.m6522w0(c2240z.f11248J0, layoutParams, frameLayout, closeImageView);
            } else {
                layoutParams.height = (int) (relativeLayout.getMeasuredWidth() * 1.78f);
                relativeLayout.setLayoutParams(layoutParams);
                AbstractC2213d.m6518s0(relativeLayout, closeImageView);
            }
            c2240z.f11248J0.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }

    /* JADX INFO: renamed from: com.clevertap.android.sdk.inapp.z$b */
    public class b implements ViewTreeObserver.OnGlobalLayoutListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ FrameLayout f11256a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ CloseImageView f11257b;

        public b(FrameLayout frameLayout, CloseImageView closeImageView) {
            this.f11256a = frameLayout;
            this.f11257b = closeImageView;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            C2240z c2240z = C2240z.this;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) c2240z.f11248J0.getLayoutParams();
            boolean z10 = c2240z.f11186z0.f11086P;
            FrameLayout frameLayout = this.f11256a;
            CloseImageView closeImageView = this.f11257b;
            if (z10 && c2240z.m6520t0()) {
                c2240z.m6525z0(c2240z.f11248J0, layoutParams, frameLayout, closeImageView);
            } else if (c2240z.m6520t0()) {
                c2240z.m6524y0(c2240z.f11248J0, layoutParams, frameLayout, closeImageView);
            } else {
                RelativeLayout relativeLayout = c2240z.f11248J0;
                layoutParams.width = (int) (relativeLayout.getMeasuredHeight() * 1.78f);
                layoutParams.gravity = 1;
                relativeLayout.setLayoutParams(layoutParams);
                AbstractC2213d.m6518s0(relativeLayout, closeImageView);
            }
            c2240z.f11248J0.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }

    /* JADX INFO: renamed from: B0 */
    public final void m6536B0() {
        ((ViewGroup) this.f11247I0.getParent()).removeView(this.f11247I0);
        this.f11247I0.setLayoutParams(this.f11251M0);
        ((FrameLayout) this.f11249K0.findViewById(R.id.video_frame)).addView(this.f11247I0);
        this.f11244F0.setLayoutParams(this.f11252N0);
        ((FrameLayout) this.f11249K0.findViewById(R.id.video_frame)).addView(this.f11244F0);
        this.f11249K0.setLayoutParams(this.f11250L0);
        ((RelativeLayout) this.f11248J0.findViewById(R.id.interstitial_relative_layout)).addView(this.f11249K0);
        this.f11242D0 = false;
        this.f11243E0.dismiss();
        ImageView imageView = this.f11244F0;
        Context context = this.f11184x0;
        Object obj = C7472a.f41322a;
        imageView.setImageDrawable(C7472a.c.m14849b(context, R.drawable.ct_ic_fullscreen_expand));
    }

    /* JADX INFO: renamed from: C0 */
    public final void m6537C0() {
        this.f11247I0.requestFocus();
        this.f11247I0.setVisibility(0);
        this.f11247I0.setPlayer(this.f11246H0);
        this.f11246H0.setPlayWhenReady(true);
    }

    /* JADX INFO: renamed from: D0 */
    public final void m6538D0() {
        FrameLayout frameLayout = (FrameLayout) this.f11248J0.findViewById(R.id.video_frame);
        this.f11249K0 = frameLayout;
        frameLayout.setVisibility(0);
        this.f11247I0 = new StyledPlayerView(this.f11184x0);
        ImageView imageView = new ImageView(this.f11184x0);
        this.f11244F0 = imageView;
        Resources resources = this.f11184x0.getResources();
        ThreadLocal<TypedValue> threadLocal = C7906f.f43056a;
        Uri uri = null;
        imageView.setImageDrawable(C7906f.a.m15676a(resources, R.drawable.ct_ic_fullscreen_expand, null));
        this.f11244F0.setOnClickListener(new ViewOnClickListenerC2239y(0, this));
        if (this.f11186z0.f11086P && m6520t0()) {
            this.f11247I0.setLayoutParams(new FrameLayout.LayoutParams((int) TypedValue.applyDimension(1, 408.0f, m3599s().getDisplayMetrics()), (int) TypedValue.applyDimension(1, 229.0f, m3599s().getDisplayMetrics())));
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) TypedValue.applyDimension(1, 30.0f, m3599s().getDisplayMetrics()), (int) TypedValue.applyDimension(1, 30.0f, m3599s().getDisplayMetrics()));
            layoutParams.gravity = 8388613;
            layoutParams.setMargins(0, (int) TypedValue.applyDimension(1, 4.0f, m3599s().getDisplayMetrics()), (int) TypedValue.applyDimension(1, 2.0f, m3599s().getDisplayMetrics()), 0);
            this.f11244F0.setLayoutParams(layoutParams);
        } else {
            this.f11247I0.setLayoutParams(new FrameLayout.LayoutParams((int) TypedValue.applyDimension(1, 240.0f, m3599s().getDisplayMetrics()), (int) TypedValue.applyDimension(1, 134.0f, m3599s().getDisplayMetrics())));
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams((int) TypedValue.applyDimension(1, 20.0f, m3599s().getDisplayMetrics()), (int) TypedValue.applyDimension(1, 20.0f, m3599s().getDisplayMetrics()));
            layoutParams2.gravity = 8388613;
            layoutParams2.setMargins(0, (int) TypedValue.applyDimension(1, 4.0f, m3599s().getDisplayMetrics()), (int) TypedValue.applyDimension(1, 2.0f, m3599s().getDisplayMetrics()), 0);
            this.f11244F0.setLayoutParams(layoutParams2);
        }
        this.f11247I0.setShowBuffering(1);
        this.f11247I0.setUseArtwork(true);
        this.f11247I0.setControllerAutoShow(false);
        this.f11249K0.addView(this.f11247I0);
        this.f11249K0.addView(this.f11244F0);
        this.f11247I0.setDefaultArtwork(C7906f.a.m15676a(this.f11184x0.getResources(), R.drawable.ct_audio, null));
        C9887l c9887lM18389a = new C9887l.a(this.f11184x0).m18389a();
        C9496e c9496e = new C9496e(this.f11184x0, new C9492a.b());
        ExoPlayer.C2348c c2348c = new ExoPlayer.C2348c(this.f11184x0);
        C10129a.m18992d(!c2348c.f11816t);
        c2348c.f11801e = new C5909e(0, c9496e);
        this.f11246H0 = c2348c.m6769a();
        Context context = this.f11184x0;
        String strM19017B = C10134c0.m19017B(context, context.getPackageName());
        String str = this.f11186z0.f11091U.get(0).f11137d;
        C9889n.a aVar = new C9889n.a();
        aVar.f50507c = strM19017B;
        aVar.f50506b = c9887lM18389a;
        C9888m.a aVar2 = new C9888m.a(context, aVar);
        C2466p.a aVar3 = new C2466p.a();
        if (str != null) {
            uri = Uri.parse(str);
        }
        aVar3.f12778b = uri;
        this.f11246H0.setMediaSource(new HlsMediaSource.Factory(aVar2).mo7269a(aVar3.m7213a()));
        this.f11246H0.prepare();
        this.f11246H0.setRepeatMode(1);
        this.f11246H0.m6922b(5, f11240O0);
    }

    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: I */
    public final View mo3561I(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        View viewInflate = (this.f11186z0.f11086P && m6520t0()) ? layoutInflater.inflate(R.layout.tab_inapp_interstitial, viewGroup, false) : layoutInflater.inflate(R.layout.inapp_interstitial, viewGroup, false);
        FrameLayout frameLayout = (FrameLayout) viewInflate.findViewById(R.id.inapp_interstitial_frame_layout);
        CloseImageView closeImageView = (CloseImageView) frameLayout.findViewById(199272);
        RelativeLayout relativeLayout = (RelativeLayout) frameLayout.findViewById(R.id.interstitial_relative_layout);
        this.f11248J0 = relativeLayout;
        relativeLayout.setBackgroundColor(Color.parseColor(this.f11186z0.f11103d));
        int i11 = this.f11185y0;
        if (i11 == 1) {
            this.f11248J0.getViewTreeObserver().addOnGlobalLayoutListener(new a(frameLayout, closeImageView));
        } else if (i11 == 2) {
            this.f11248J0.getViewTreeObserver().addOnGlobalLayoutListener(new b(frameLayout, closeImageView));
        }
        if (!this.f11186z0.f11091U.isEmpty()) {
            if (this.f11186z0.f11091U.get(0).m6500d()) {
                if (CTInAppNotification.m6488c(this.f11186z0.f11091U.get(0)) != null) {
                    ImageView imageView = (ImageView) this.f11248J0.findViewById(R.id.backgroundImage);
                    imageView.setVisibility(0);
                    imageView.setImageBitmap(CTInAppNotification.m6488c(this.f11186z0.f11091U.get(0)));
                }
            } else if (this.f11186z0.f11091U.get(0).m6499c()) {
                if (CTInAppNotification.C2197d.m6495b(this.f11186z0.f11091U.get(0).f11135b) != null) {
                    GifImageView gifImageView = (GifImageView) this.f11248J0.findViewById(R.id.gifImage);
                    this.f11245G0 = gifImageView;
                    gifImageView.setVisibility(0);
                    this.f11245G0.setBytes(CTInAppNotification.C2197d.m6495b(this.f11186z0.f11091U.get(0).f11135b));
                    GifImageView gifImageView2 = this.f11245G0;
                    gifImageView2.f11067d = true;
                    gifImageView2.m6486d();
                }
            } else if (this.f11186z0.f11091U.get(0).m6501e()) {
                this.f11243E0 = new DialogC2208a0(this, this.f11184x0);
                m6538D0();
                m6537C0();
            } else if (this.f11186z0.f11091U.get(0).m6498b()) {
                m6538D0();
                m6537C0();
                this.f11244F0.setVisibility(8);
            }
        }
        LinearLayout linearLayout = (LinearLayout) this.f11248J0.findViewById(R.id.interstitial_linear_layout);
        Button button = (Button) linearLayout.findViewById(R.id.interstitial_button1);
        arrayList.add(button);
        Button button2 = (Button) linearLayout.findViewById(R.id.interstitial_button2);
        arrayList.add(button2);
        TextView textView = (TextView) this.f11248J0.findViewById(R.id.interstitial_title);
        textView.setText(this.f11186z0.f11098a0);
        textView.setTextColor(Color.parseColor(this.f11186z0.f11100b0));
        TextView textView2 = (TextView) this.f11248J0.findViewById(R.id.interstitial_message);
        textView2.setText(this.f11186z0.f11092V);
        textView2.setTextColor(Color.parseColor(this.f11186z0.f11093W));
        ArrayList<CTInAppNotificationButton> arrayList2 = this.f11186z0.f11107f;
        if (arrayList2.size() == 1) {
            int i12 = this.f11185y0;
            if (i12 == 2) {
                button.setVisibility(8);
            } else if (i12 == 1) {
                button.setVisibility(4);
            }
            m6529A0(button2, arrayList2.get(0), 0);
        } else if (!arrayList2.isEmpty()) {
            for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                if (i13 < 2) {
                    m6529A0((Button) arrayList.get(i13), arrayList2.get(i13), i13);
                }
            }
        }
        frameLayout.setBackground(new ColorDrawable(-1157627904));
        closeImageView.setOnClickListener(new ViewOnClickListenerC2238x(i10, this));
        if (this.f11186z0.f11080J) {
            closeImageView.setVisibility(0);
        } else {
            closeImageView.setVisibility(8);
        }
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: O */
    public final void mo3566O() {
        this.f6090a0 = true;
        GifImageView gifImageView = this.f11245G0;
        if (gifImageView != null) {
            gifImageView.m6485c();
        }
        if (this.f11242D0) {
            m6536B0();
        }
        C2413j c2413j = this.f11246H0;
        if (c2413j != null) {
            f11240O0 = c2413j.getCurrentPosition();
            this.f11246H0.stop();
            this.f11246H0.release();
            this.f11246H0 = null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: Q */
    public final void mo3568Q() {
        this.f6090a0 = true;
        if (this.f11186z0.f11091U.isEmpty() || this.f11246H0 != null) {
            return;
        }
        if (!this.f11186z0.f11091U.get(0).m6501e() && !this.f11186z0.f11091U.get(0).m6498b()) {
            return;
        }
        m6538D0();
        m6537C0();
    }

    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: R */
    public final void mo3569R(Bundle bundle) {
    }

    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: S */
    public final void mo3570S() {
        this.f6090a0 = true;
        GifImageView gifImageView = this.f11245G0;
        if (gifImageView != null) {
            gifImageView.setBytes(CTInAppNotification.C2197d.m6495b(this.f11186z0.f11091U.get(0).f11135b));
            GifImageView gifImageView2 = this.f11245G0;
            gifImageView2.f11067d = true;
            gifImageView2.m6486d();
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: T */
    public final void mo3571T() {
        this.f6090a0 = true;
        GifImageView gifImageView = this.f11245G0;
        if (gifImageView != null) {
            gifImageView.m6485c();
        }
        C2413j c2413j = this.f11246H0;
        if (c2413j != null) {
            c2413j.stop();
            this.f11246H0.release();
        }
    }

    @Override // com.clevertap.android.sdk.inapp.AbstractC2213d, com.clevertap.android.sdk.inapp.AbstractC2211c
    /* JADX INFO: renamed from: m0 */
    public final void mo6512m0() {
        GifImageView gifImageView = this.f11245G0;
        if (gifImageView != null) {
            gifImageView.m6485c();
        }
        C2413j c2413j = this.f11246H0;
        if (c2413j != null) {
            c2413j.stop();
            this.f11246H0.release();
            this.f11246H0 = null;
        }
    }
}
