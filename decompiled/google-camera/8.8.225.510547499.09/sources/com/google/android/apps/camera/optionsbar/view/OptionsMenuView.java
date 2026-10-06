package com.google.android.apps.camera.optionsbar.view;

import android.content.Context;
import android.os.Trace;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.wear.ambient.AmbientModeSupport;
import com.google.android.apps.camera.bottombar.C0100R;
import java.util.ArrayList;
import p000.cln;
import p000.gev;
import p000.gfe;
import p000.gfw;
import p000.ggh;
import p000.ilk;
import p000.nbe;
import p000.nbh;
import p021j$.util.Collection$EL;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class OptionsMenuView extends ScrollView {

    /* JADX INFO: renamed from: i */
    private static final nbh f6840i = nbh.m17259h("com/google/android/apps/camera/optionsbar/view/OptionsMenuView");

    /* JADX INFO: renamed from: a */
    public final GestureDetector f6841a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f6842b;

    /* JADX INFO: renamed from: c */
    public boolean f6843c;

    /* JADX INFO: renamed from: d */
    public int f6844d;

    /* JADX INFO: renamed from: e */
    public ilk f6845e;

    /* JADX INFO: renamed from: f */
    public gfe f6846f;

    /* JADX INFO: renamed from: g */
    public LinearLayout f6847g;

    /* JADX INFO: renamed from: h */
    public AmbientModeSupport.AmbientController f6848h;

    public OptionsMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6842b = new ArrayList();
        this.f6843c = false;
        this.f6845e = ilk.PORTRAIT;
        this.f6841a = new GestureDetector(context, new ggh(this));
    }

    /* JADX INFO: renamed from: a */
    public final int m4247a() {
        int size;
        synchronized (this) {
            size = this.f6842b.size();
        }
        return size;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m4248b(gev gevVar) {
        boolean zAnyMatch;
        synchronized (this) {
            zAnyMatch = Collection$EL.stream(this.f6842b).anyMatch(new gfw(gevVar, 3));
        }
        return zAnyMatch;
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        Trace.beginSection("optionsMenu:inflate");
        super.onFinishInflate();
        ((LayoutInflater) getContext().getSystemService("layout_inflater")).inflate(C0100R.layout.options_menu_layout, this);
        this.f6847g = (LinearLayout) findViewById(C0100R.id.options_menu_internal_list);
        setOnTouchListener(new cln(this, 6));
        setScrollbarFadingEnabled(false);
        Trace.endSection();
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f6841a.onTouchEvent(motionEvent);
    }

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        if (this.f6843c) {
            int mode = View.MeasureSpec.getMode(i2);
            if (this.f6844d > 0 && mode != 1073741824 && (mode == 0 || View.MeasureSpec.getSize(i2) > this.f6844d)) {
                i2 = View.MeasureSpec.makeMeasureSpec(this.f6844d, Integer.MIN_VALUE);
            }
        } else {
            try {
                int size = View.MeasureSpec.getSize(i2);
                int dimensionPixelSize = (this.f6844d - getResources().getDimensionPixelSize(C0100R.dimen.options_menu_setting_height)) - getResources().getDimensionPixelSize(C0100R.dimen.options_menu_line_height);
                int dimensionPixelSize2 = dimensionPixelSize / getResources().getDimensionPixelSize(C0100R.dimen.options_row_height);
                if (size > dimensionPixelSize) {
                    double d = dimensionPixelSize2;
                    float dimensionPixelSize3 = getResources().getDimensionPixelSize(C0100R.dimen.options_row_height);
                    Double.isNaN(d);
                    double d2 = dimensionPixelSize3;
                    Double.isNaN(d2);
                    size = (int) ((d - 0.5d) * d2);
                }
                i2 = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
                try {
                    getLayoutParams().height = size;
                } catch (RuntimeException e) {
                    e = e;
                    ((nbe) ((nbe) ((nbe) f6840i.m17251b()).mo17283h(e)).mo17276G((char) 2632)).mo17290o("Error forcing height.");
                }
            } catch (RuntimeException e2) {
                e = e2;
            }
        }
        super.onMeasure(i, i2);
    }
}
