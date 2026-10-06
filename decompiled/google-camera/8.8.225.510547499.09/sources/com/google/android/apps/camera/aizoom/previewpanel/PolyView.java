package com.google.android.apps.camera.aizoom.previewpanel;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.view.View;
import p000.cha;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class PolyView extends View {

    /* JADX INFO: renamed from: a */
    public final Paint f6487a;

    /* JADX INFO: renamed from: b */
    private volatile PointF[] f6488b;

    public PolyView(Context context) {
        super(context);
        this.f6487a = new Paint(1);
        this.f6488b = new PointF[0];
    }

    /* JADX INFO: renamed from: a */
    public final void m4033a(PointF... pointFArr) {
        this.f6488b = pointFArr;
        invalidate();
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f6488b.length > 0) {
            Path path = new Path();
            path.reset();
            float width = canvas.getWidth();
            float height = canvas.getHeight();
            path.moveTo(this.f6488b[0].x * width, this.f6488b[0].y * height);
            for (int i = 1; i < this.f6488b.length; i++) {
                path.lineTo(this.f6488b[i].x * width, this.f6488b[i].y * height);
            }
            path.lineTo(this.f6488b[0].x * width, this.f6488b[0].y * height);
            canvas.drawPath(path, this.f6487a);
        }
    }

    public PolyView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Paint paint = new Paint(1);
        this.f6487a = paint;
        this.f6488b = new PointF[0];
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, cha.f5714a, 0, 0);
        Color colorValueOf = Color.valueOf(typedArrayObtainStyledAttributes.getColor(0, -1));
        boolean z = typedArrayObtainStyledAttributes.getBoolean(1, false);
        int i = typedArrayObtainStyledAttributes.getInt(2, 1);
        typedArrayObtainStyledAttributes.recycle();
        paint.setColor(colorValueOf.toArgb());
        paint.setStrokeWidth(i);
        paint.setStyle(z ? Paint.Style.FILL_AND_STROKE : Paint.Style.STROKE);
    }
}
