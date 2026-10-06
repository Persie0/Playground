package com.google.android.apps.camera.cameravisionkit;

import android.animation.PointFEvaluator;
import android.animation.RectEvaluator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import com.google.android.apps.camera.bottombar.C0100R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class QrGleamingView extends View {
    public QrGleamingView(Context context) {
        super(context);
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        new RectEvaluator(new Rect());
        new Rect();
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        TypedValue.applyDimension(1, 48.0f, getContext().getResources().getDisplayMetrics());
        TypedValue.applyDimension(1, 48.0f, getContext().getResources().getDisplayMetrics());
        TypedValue.applyDimension(1, 16.0f, getContext().getResources().getDisplayMetrics());
        TypedValue.applyDimension(1, 16.0f, getContext().getResources().getDisplayMetrics());
        getResources().getDrawable(C0100R.drawable.qr_gleam_bottom_left, null);
        getResources().getDrawable(C0100R.drawable.qr_gleam_bottom_right, null);
        getResources().getDrawable(C0100R.drawable.qr_gleam_top_left, null);
        getResources().getDrawable(C0100R.drawable.qr_gleam_top_right, null);
        new PointFEvaluator();
        new RectEvaluator();
    }

    public QrGleamingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        new RectEvaluator(new Rect());
        new Rect();
    }
}
