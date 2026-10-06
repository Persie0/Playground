package com.google.android.apps.camera.p014ui.captureframe;

import android.content.Context;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.apps.camera.bottombar.C0100R;
import java.util.List;
import p000.cwu;
import p000.hsz;
import p000.mws;
import p021j$.util.Collection$EL;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class CaptureFrameUi extends View {

    /* JADX INFO: renamed from: a */
    public final RectF f6993a;

    /* JADX INFO: renamed from: b */
    public final Paint f6994b;

    /* JADX INFO: renamed from: c */
    private final List f6995c;

    /* JADX INFO: renamed from: d */
    private final float f6996d;

    public CaptureFrameUi(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6993a = new RectF();
        float dimension = getResources().getDimension(C0100R.dimen.frame_corner_radius);
        this.f6996d = getResources().getDimension(C0100R.dimen.bound_margin);
        Paint paint = new Paint();
        this.f6994b = paint;
        paint.setStrokeWidth(getResources().getDimensionPixelSize(C0100R.dimen.frame_line_width));
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
        paint.setBlendMode(BlendMode.DST_ATOP);
        this.f6995c = mws.m17100o(new hsz(this, paint, 1, dimension), new hsz(this, paint, 2, dimension), new hsz(this, paint, 3, dimension), new hsz(this, paint, 4, dimension));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Collection$EL.stream(this.f6995c).forEach(new cwu(this, canvas, 6));
    }

    @Override // android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        RectF rectF = this.f6993a;
        float f = this.f6996d;
        rectF.set(i + f, i2 + f, i3 - f, i4 - f);
    }
}
