package com.google.android.apps.camera.p014ui.compositevideoview;

import android.content.Context;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.VideoView;
import com.google.android.apps.camera.bottombar.C0100R;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import p000.cln;
import p000.flr;
import p000.htp;
import p000.htq;
import p000.htr;
import p000.iov;
import p000.iow;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class CompositeVideoView extends FrameLayout implements htr {

    /* JADX INFO: renamed from: a */
    public VideoView f6997a;

    /* JADX INFO: renamed from: b */
    public htq f6998b;

    /* JADX INFO: renamed from: c */
    private ImageView f6999c;

    /* JADX INFO: renamed from: d */
    private CircularProgressIndicator f7000d;

    public CompositeVideoView(Context context) {
        super(context);
    }

    @Override // p000.htr
    /* JADX INFO: renamed from: a */
    public final void mo4317a() {
        this.f6999c.setVisibility(8);
    }

    /* JADX INFO: renamed from: b */
    public final void m4318b() {
        this.f7000d.setVisibility(8);
    }

    @Override // p000.htr
    /* JADX INFO: renamed from: c */
    public final void mo4319c() {
        this.f6997a.pause();
    }

    @Override // p000.htr
    /* JADX INFO: renamed from: d */
    public final void mo4320d(int i) {
        this.f6997a.seekTo(i);
        this.f6997a.setBackground(null);
    }

    @Override // p000.htr
    /* JADX INFO: renamed from: e */
    public final void mo4321e(htq htqVar) {
        this.f6998b = htqVar;
    }

    @Override // p000.htr
    /* JADX INFO: renamed from: f */
    public final void mo4322f(float f) {
        this.f7000d.setIndeterminate(false);
        CircularProgressIndicator circularProgressIndicator = this.f7000d;
        circularProgressIndicator.setProgress((int) (circularProgressIndicator.getMax() * f));
    }

    /* JADX INFO: renamed from: g */
    public final void m4323g() {
        setBackgroundResource(C0100R.drawable.cvv_root_background_left_rounded);
    }

    /* JADX INFO: renamed from: h */
    public final void m4324h() {
        setBackgroundResource(C0100R.drawable.cvv_root_background_right_rounded);
    }

    @Override // p000.htr
    /* JADX INFO: renamed from: i */
    public final void mo4325i(String str) {
        this.f6997a.setVideoURI(Uri.parse(str));
    }

    @Override // p000.htr
    /* JADX INFO: renamed from: j */
    public final void mo4326j() {
        this.f7000d.setVisibility(8);
        this.f6999c.setImageResource(C0100R.drawable.quantum_gm_ic_get_app_white_24);
        ImageView imageView = this.f6999c;
        imageView.setContentDescription(imageView.getResources().getString(C0100R.string.cvv_download_desc));
        this.f6999c.setOnClickListener(new flr(this, 13));
        this.f6999c.setVisibility(0);
    }

    @Override // p000.htr
    /* JADX INFO: renamed from: k */
    public final void mo4327k() {
        this.f7000d.setVisibility(8);
        this.f6999c.setImageResource(C0100R.drawable.gm_filled_play_arrow_white_24);
        ImageView imageView = this.f6999c;
        imageView.setContentDescription(imageView.getResources().getString(C0100R.string.cvv_play_desc));
        this.f6999c.setOnClickListener(new flr(this, 14));
        this.f6999c.setVisibility(0);
    }

    @Override // p000.htr
    /* JADX INFO: renamed from: l */
    public final void mo4328l() {
        this.f6999c.setImageResource(C0100R.drawable.quantum_gm_ic_get_app_white_24);
        ImageView imageView = this.f6999c;
        imageView.setContentDescription(imageView.getResources().getString(C0100R.string.cvv_download_desc));
        this.f6999c.setOnClickListener(null);
        this.f6999c.setVisibility(0);
        this.f7000d.setVisibility(0);
    }

    @Override // p000.htr
    /* JADX INFO: renamed from: m */
    public final void mo4329m() {
        this.f6997a.start();
        this.f6997a.setBackground(null);
    }

    @Override // p000.htr
    /* JADX INFO: renamed from: n */
    public final void mo4330n() {
        this.f6997a.stopPlayback();
    }

    @Override // p000.htr
    /* JADX INFO: renamed from: o */
    public final boolean mo4331o() {
        return this.f6997a.isPlaying();
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        setBackgroundResource(C0100R.drawable.cvv_root_background);
        setOutlineProvider(ViewOutlineProvider.BACKGROUND);
        setClipToOutline(true);
        LayoutInflater.from(getContext()).inflate(C0100R.layout.cvv_root, this);
        this.f6997a = (VideoView) findViewById(C0100R.id.cvv_videoview);
        this.f6999c = (ImageView) findViewById(C0100R.id.cvv_control);
        this.f7000d = (CircularProgressIndicator) findViewById(C0100R.id.cvv_progressbar);
        this.f6997a.setOnTouchListener(new cln(new GestureDetector(getContext(), new htp(this)), 16));
        this.f6997a.setOnClickListener(new flr(this, 15));
        this.f6997a.setOnCompletionListener(new iov(this, 1));
        this.f6997a.setOnPreparedListener(new iow(this, 1));
        mo4326j();
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        if (View.MeasureSpec.getMode(i) == 1073741824) {
            i2 = View.MeasureSpec.makeMeasureSpec(Math.round((View.MeasureSpec.getSize(i) * 16.0f) / 9.0f), 1073741824);
        }
        super.onMeasure(i, i2);
    }

    public CompositeVideoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CompositeVideoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
