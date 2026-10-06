package com.google.android.apps.camera.p014ui.remotecontrol;

import android.content.Context;
import android.os.Trace;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.camera.bottombar.C0100R;
import p000.ilk;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class RemoteControlView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public TextView f7164a;

    /* JADX INFO: renamed from: b */
    public TextView f7165b;

    /* JADX INFO: renamed from: c */
    public TextView f7166c;

    /* JADX INFO: renamed from: d */
    public TextView f7167d;

    /* JADX INFO: renamed from: e */
    public View f7168e;

    /* JADX INFO: renamed from: f */
    public View f7169f;

    /* JADX INFO: renamed from: g */
    private LinearLayout f7170g;

    /* JADX INFO: renamed from: h */
    private int f7171h;

    public RemoteControlView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX INFO: renamed from: b */
    private final void m4427b(int i) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f7170g.getLayoutParams();
        layoutParams.topMargin = this.f7171h;
        layoutParams.bottomMargin = this.f7171h;
        layoutParams.gravity = i | 1;
        this.f7170g.setLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: a */
    public final void m4428a() {
        this.f7165b.setText("--");
        this.f7164a.setText("--");
        this.f7166c.setText("");
        this.f7168e.setVisibility(8);
        this.f7167d.setText("");
        this.f7169f.setVisibility(8);
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        Trace.beginSection("RemoteControlUi:inflate");
        super.onFinishInflate();
        ((LayoutInflater) getContext().getSystemService("layout_inflater")).inflate(C0100R.layout.remote_control_view_contents, this);
        this.f7164a = (TextView) findViewById(C0100R.id.device_battery);
        this.f7165b = (TextView) findViewById(C0100R.id.phone_battery);
        this.f7166c = (TextView) findViewById(C0100R.id.water_depth);
        this.f7167d = (TextView) findViewById(C0100R.id.water_temp);
        this.f7168e = findViewById(C0100R.id.water_depth_container);
        this.f7169f = findViewById(C0100R.id.water_temp_container);
        this.f7170g = (LinearLayout) findViewById(C0100R.id.remote_control_content);
        this.f7171h = getResources().getDimensionPixelSize(C0100R.dimen.remote_control_view_margin);
        m4428a();
        Trace.endSection();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        switch (ilk.m11426b(getDisplay(), getContext())) {
            case PORTRAIT:
            case REVERSE_PORTRAIT:
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f7170g.getLayoutParams();
                layoutParams.topMargin = this.f7171h;
                layoutParams.gravity = 49;
                this.f7170g.setLayoutParams(layoutParams);
                break;
            case LANDSCAPE:
                m4427b(80);
                break;
            case REVERSE_LANDSCAPE:
                m4427b(48);
                break;
        }
        super.onMeasure(i, i2);
    }
}
