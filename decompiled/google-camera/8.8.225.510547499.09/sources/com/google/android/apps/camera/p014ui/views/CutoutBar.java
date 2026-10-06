package com.google.android.apps.camera.p014ui.views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Trace;
import android.util.AttributeSet;
import android.view.View;
import p000.cdp;
import p000.dhl;
import p000.dhm;
import p000.dhv;
import p000.ilk;
import p000.jvh;
import p000.nbh;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class CutoutBar extends View {

    /* JADX INFO: renamed from: a */
    public static final nbh f7218a = nbh.m17259h("com/google/android/apps/camera/ui/views/CutoutBar");

    /* JADX INFO: renamed from: b */
    public final dhl f7219b;

    /* JADX INFO: renamed from: c */
    public final int f7220c;

    /* JADX INFO: renamed from: d */
    public float f7221d;

    /* JADX INFO: renamed from: e */
    public float f7222e;

    /* JADX INFO: renamed from: f */
    public float f7223f;

    /* JADX INFO: renamed from: g */
    public ilk f7224g;

    /* JADX WARN: Multi-variable type inference failed */
    public CutoutBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7221d = 0.0f;
        this.f7222e = 0.0f;
        this.f7223f = 0.0f;
        this.f7224g = ilk.PORTRAIT;
        dhv dhvVarMo3499a = ((cdp) context).mo3499a();
        int iIntValue = ((Integer) dhvVarMo3499a.mo6173a(dhm.f11136a).get()).intValue();
        this.f7220c = iIntValue;
        this.f7219b = dhm.m6166a(dhvVarMo3499a, iIntValue);
    }

    /* JADX INFO: renamed from: a */
    public final void m4449a() {
        Trace.beginSection("FrontLensIndicator:applyOrientation");
        jvh.m13577y(this, this.f7224g);
        Trace.endSection();
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        float f = this.f7221d;
        float f2 = this.f7222e;
        float f3 = this.f7223f;
        Paint paint = new Paint();
        paint.setColor(-16777216);
        paint.setAntiAlias(true);
        canvas.drawCircle(f, f2, f3, paint);
    }

    @Override // android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            m4449a();
        }
    }
}
