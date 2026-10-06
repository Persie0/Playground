package com.google.android.apps.camera.filmstrip.transition;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class FilmstripTransitionThumbnailView extends View {

    /* JADX INFO: renamed from: a */
    public final Object f6672a;

    /* JADX INFO: renamed from: b */
    public Bitmap f6673b;

    /* JADX INFO: renamed from: c */
    public Paint f6674c;

    /* JADX INFO: renamed from: d */
    private float f6675d;

    public FilmstripTransitionThumbnailView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6672a = new Object();
        this.f6675d = -1.0f;
        setWillNotDraw(false);
    }

    /* JADX INFO: renamed from: a */
    public final Bitmap m4124a() {
        Bitmap bitmap;
        synchronized (this.f6672a) {
            bitmap = this.f6673b;
        }
        return bitmap;
    }

    /* JADX INFO: renamed from: b */
    public final void m4125b(float f) {
        this.f6675d = f;
        invalidate();
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f6675d < 0.0f) {
            return;
        }
        synchronized (this.f6672a) {
            canvas.drawCircle(canvas.getWidth() / 2, canvas.getHeight() / 2, this.f6675d, this.f6674c);
        }
    }
}
