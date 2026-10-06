package com.google.android.apps.camera.focusindicator;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.apps.camera.bottombar.C0100R;
import p000.ilk;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class EyesFocusIndicatorRectView extends View {

    /* JADX INFO: renamed from: a */
    public final RectF f6676a;

    /* JADX INFO: renamed from: b */
    public final Drawable f6677b;

    /* JADX INFO: renamed from: c */
    public final Drawable f6678c;

    /* JADX INFO: renamed from: d */
    public ilk f6679d;

    public EyesFocusIndicatorRectView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6676a = new RectF();
        this.f6679d = ilk.PORTRAIT;
        this.f6677b = context.getResources().getDrawable(C0100R.drawable.ic_eyes_focus_rect_top_left_corner, null);
        this.f6678c = context.getResources().getDrawable(C0100R.drawable.ic_eyes_focus_rect_bottom_right_corner, null);
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f6677b.draw(canvas);
        this.f6678c.draw(canvas);
    }
}
