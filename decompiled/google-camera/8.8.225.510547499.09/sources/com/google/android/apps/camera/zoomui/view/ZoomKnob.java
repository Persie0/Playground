package com.google.android.apps.camera.zoomui.view;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.SeekBar;
import androidx.wear.widget.iZcI.hiCTUJiAxf;
import com.google.android.apps.camera.bottombar.C0100R;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p000.C0752js;
import p000.cdp;
import p000.dhv;
import p000.dhx;
import p000.dib;
import p000.iug;
import p000.nbe;
import p000.nbh;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class ZoomKnob extends C0752js {

    /* JADX INFO: renamed from: i */
    private static final nbh f7328i = nbh.m17259h("com/google/android/apps/camera/zoomui/view/ZoomKnob");

    /* JADX INFO: renamed from: a */
    public final AtomicBoolean f7329a;

    /* JADX INFO: renamed from: b */
    public final Resources f7330b;

    /* JADX INFO: renamed from: c */
    public final int f7331c;

    /* JADX INFO: renamed from: d */
    public final int f7332d;

    /* JADX INFO: renamed from: e */
    public final AtomicReference f7333e;

    /* JADX INFO: renamed from: f */
    public int f7334f;

    /* JADX INFO: renamed from: g */
    public float f7335g;

    /* JADX INFO: renamed from: h */
    public SeekBar f7336h;

    /* JADX INFO: renamed from: j */
    private final int f7337j;

    /* JADX INFO: renamed from: k */
    private boolean f7338k;

    /* JADX INFO: renamed from: l */
    private boolean f7339l;

    /* JADX INFO: renamed from: m */
    private float f7340m;

    /* JADX WARN: Multi-variable type inference failed */
    public ZoomKnob(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7329a = new AtomicBoolean(false);
        this.f7333e = new AtomicReference(iug.MAIN_ONLY);
        this.f7338k = false;
        this.f7339l = false;
        Resources resources = context.getResources();
        this.f7330b = resources;
        this.f7337j = resources.getDimensionPixelSize(C0100R.dimen.zoom_seekbar_width);
        int dimensionPixelSize = getResources().getDimensionPixelSize(C0100R.dimen.zoom_knob_size);
        this.f7332d = dimensionPixelSize;
        this.f7331c = (dimensionPixelSize - getResources().getDimensionPixelSize(C0100R.dimen.zoom_icon_size)) / 2;
        if (context instanceof cdp) {
            dhv dhvVarMo3499a = ((cdp) context).mo3499a();
            dhx dhxVar = dib.f11240a;
            dhvVarMo3499a.mo6179g();
            this.f7339l = dhvVarMo3499a.mo6184l(dib.f11277ak);
            this.f7340m = ((Float) dhvVarMo3499a.mo6180h(dib.f11278al).get()).floatValue();
            this.f7338k = dhvVarMo3499a.mo6184l(dib.f11274ah);
        }
    }

    /* JADX INFO: renamed from: a */
    public final float m4526a(float f, float f2) {
        iug iugVar = iug.OFF;
        switch ((iug) this.f7333e.get()) {
            case OFF:
                return 1.0f;
            case MAIN_ONLY:
                if (f < 1.0f) {
                    return 1.0f;
                }
                return f;
            case FRONT_PORTRAIT:
                return f2;
            case ALL:
                return f;
            default:
                throw new IllegalArgumentException("Not a supported normalization setting: ".concat(String.valueOf(String.valueOf(this.f7333e.get()))));
        }
    }

    /* JADX INFO: renamed from: b */
    public final String m4527b(float f, float f2, float f3) {
        float fM4526a = f / m4526a(f2, f3);
        if (Float.isNaN(fM4526a) || Float.isInfinite(fM4526a) || fM4526a <= 0.0f) {
            nbh nbhVar = f7328i;
            ((nbe) ((nbe) nbhVar.m17252c()).mo17276G((char) 4460)).mo17293r("Invalid zoom value: %g", Float.valueOf(fM4526a));
            ((nbe) ((nbe) nbhVar.m17252c()).mo17276G(4461)).mo17271B("Zoom ratio: %g, Min zoom: %g, BaseZoom: %g", Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3));
            fM4526a = f;
        }
        double dRound = Math.round(fM4526a * 100.0f);
        Double.isNaN(dRound);
        double dDoubleValue = new BigDecimal((float) (dRound / 100.0d)).setScale(2, RoundingMode.HALF_UP).doubleValue();
        DecimalFormat decimalFormat = new DecimalFormat(hiCTUJiAxf.iKbxWdRqQwjqotK);
        decimalFormat.setRoundingMode((!this.f7339l || f >= 1.0f) ? RoundingMode.HALF_UP : RoundingMode.FLOOR);
        String strValueOf = String.valueOf(decimalFormat.format(dDoubleValue));
        if (this.f7338k) {
            float fRound = Math.round(10.0d * dDoubleValue) / 10.0f;
            if (fRound >= this.f7340m || fRound == ((int) fRound)) {
                strValueOf = String.valueOf(new DecimalFormat("0").format(Math.round(dDoubleValue)));
            }
        }
        return strValueOf.concat("×");
    }

    /* JADX INFO: renamed from: c */
    public final void m4528c(boolean z) {
        this.f7329a.set(z);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getLayoutParams();
        int dimensionPixelSize = this.f7330b.getDimensionPixelSize(C0100R.dimen.zoom_knob_lift) + (this.f7330b.getDimensionPixelSize(C0100R.dimen.zoom_icon_size) / 2);
        int i = this.f7334f;
        int i2 = dimensionPixelSize + i;
        if (true == z) {
            i = i2;
        }
        layoutParams.bottomMargin = i;
        setLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: d */
    public final void m4529d(boolean z) {
        if (z) {
            this.f7336h.getThumb().mutate().setAlpha(255);
        } else {
            this.f7336h.getThumb().mutate().setAlpha(0);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m4530e(int i, float f, float f2, float f3) {
        float f4 = this.f7337j * this.f7335g;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getLayoutParams();
        layoutParams.leftMargin = (int) (((((int) f4) / 2) * (i - 50000)) / 50000.0f);
        layoutParams.rightMargin = 0;
        setLayoutParams(layoutParams);
        setText(m4527b(f, f2, f3));
    }
}
