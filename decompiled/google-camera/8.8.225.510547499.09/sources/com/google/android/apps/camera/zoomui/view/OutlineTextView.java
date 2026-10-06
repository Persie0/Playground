package com.google.android.apps.camera.zoomui.view;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextPaint;
import android.util.AttributeSet;
import com.google.android.apps.camera.bottombar.C0100R;
import p000.C0752js;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class OutlineTextView extends C0752js {

    /* JADX INFO: renamed from: a */
    private final TextPaint f7325a;

    /* JADX INFO: renamed from: b */
    private float f7326b;

    /* JADX INFO: renamed from: c */
    private int f7327c;

    public OutlineTextView(Context context) {
        super(context);
        this.f7325a = new TextPaint();
        m4525a();
    }

    /* JADX INFO: renamed from: a */
    private final void m4525a() {
        Resources resources = getResources();
        this.f7326b = resources.getDimension(C0100R.dimen.zoom_slider_stroke_width);
        this.f7327c = resources.getColor(C0100R.color.zoom_slider_stroke_color, null);
    }

    @Override // android.widget.TextView, android.view.View
    protected final void onDraw(Canvas canvas) {
        TextPaint paint = getPaint();
        this.f7325a.set(paint);
        int currentTextColor = getCurrentTextColor();
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(this.f7326b);
        paint.setStrokeJoin(Paint.Join.ROUND);
        setTextColor(this.f7327c);
        super.onDraw(canvas);
        setTextColor(currentTextColor);
        paint.set(this.f7325a);
        super.onDraw(canvas);
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        m4525a();
    }

    public OutlineTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7325a = new TextPaint();
    }

    public OutlineTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f7325a = new TextPaint();
    }
}
