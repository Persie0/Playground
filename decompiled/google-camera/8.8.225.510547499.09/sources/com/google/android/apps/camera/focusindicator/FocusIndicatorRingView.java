package com.google.android.apps.camera.focusindicator;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.apps.camera.bottombar.C0100R;
import p000.dwl;
import p000.dwm;
import p000.dwn;
import p000.dwo;
import p000.ilk;
import p000.kay;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class FocusIndicatorRingView extends View {

    /* JADX INFO: renamed from: a */
    public final dwl f6683a;

    /* JADX INFO: renamed from: b */
    public final dwn f6684b;

    /* JADX INFO: renamed from: c */
    public final float f6685c;

    /* JADX INFO: renamed from: d */
    public PointF f6686d;

    /* JADX INFO: renamed from: e */
    public ilk f6687e;

    /* JADX INFO: renamed from: f */
    public boolean f6688f;

    /* JADX INFO: renamed from: g */
    public boolean f6689g;

    public FocusIndicatorRingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6687e = ilk.PORTRAIT;
        this.f6683a = new dwm();
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        Paint paint = shapeDrawable.getPaint();
        paint.setAntiAlias(true);
        paint.setColor(-1);
        paint.setStyle(Paint.Style.FILL);
        this.f6684b = new dwo(shapeDrawable);
        this.f6685c = context.getResources().getDimension(C0100R.dimen.focus_indicator_ring_size) / 2.0f;
    }

    /* JADX INFO: renamed from: a */
    static int m4132a(ilk ilkVar) {
        ilk ilkVar2 = ilk.PORTRAIT;
        kay kayVar = kay.CLOCKWISE_0;
        switch (ilkVar) {
            case PORTRAIT:
                return 0;
            case LANDSCAPE:
                return 90;
            case REVERSE_LANDSCAPE:
                return 270;
            case REVERSE_PORTRAIT:
                return 180;
            default:
                throw new IllegalArgumentException();
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m4133b(PointF pointF) {
        if (this.f6689g) {
            return;
        }
        this.f6686d = pointF;
        setX(pointF.x - (getWidth() / 2.0f));
        setY(pointF.y - (getHeight() / 2.0f));
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f6683a.mo6810b(canvas);
        this.f6684b.mo6824a(canvas);
    }

    @Override // android.view.View
    protected final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f6683a.mo6817i(i, i2);
        this.f6684b.mo6825b(i, i2);
    }

    FocusIndicatorRingView(Context context, dwl dwlVar, dwn dwnVar) {
        super(context);
        this.f6687e = ilk.PORTRAIT;
        this.f6683a = dwlVar;
        this.f6684b = dwnVar;
        this.f6685c = context.getResources().getDimension(C0100R.dimen.focus_indicator_ring_size) / 2.0f;
    }
}
