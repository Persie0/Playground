package com.google.android.apps.camera.p014ui.elapsedtimeui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.camera.bottombar.C0100R;
import p000.huh;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class LongPressElapsedTimeView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public Animation f7016a;

    /* JADX INFO: renamed from: b */
    public Animation f7017b;

    /* JADX INFO: renamed from: c */
    public ImageView f7018c;

    /* JADX INFO: renamed from: d */
    public final Runnable f7019d;

    public LongPressElapsedTimeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7019d = new huh(this, 8);
    }

    /* JADX INFO: renamed from: a */
    public final TextView m4366a() {
        return (TextView) findViewById(C0100R.id.long_shot_output_timer);
    }

    /* JADX INFO: renamed from: b */
    public final TextView m4367b() {
        return (TextView) findViewById(C0100R.id.long_shot_recording_timer);
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        ((LayoutInflater) getContext().getSystemService("layout_inflater")).inflate(C0100R.layout.longshot_elapsed_time_layout, this);
        setBackground(getResources().getDrawable(C0100R.drawable.top_shot_background, null));
        this.f7016a = AnimationUtils.loadAnimation(getContext(), C0100R.anim.blink_animation);
        this.f7017b = AnimationUtils.loadAnimation(getContext(), C0100R.anim.blink_animation_2s);
        this.f7018c = (ImageView) findViewById(C0100R.id.indicator_icon);
    }
}
