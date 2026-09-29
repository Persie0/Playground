package androidx.constraintlayout.widget;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.view.View;

/* JADX INFO: renamed from: androidx.constraintlayout.widget.d */
/* JADX INFO: loaded from: classes.dex */
public final class C0764d extends View {

    /* JADX INFO: renamed from: a */
    public int f5520a;

    /* JADX INFO: renamed from: b */
    public View f5521b;

    /* JADX INFO: renamed from: c */
    public int f5522c;

    public View getContent() {
        return this.f5521b;
    }

    public int getEmptyVisibility() {
        return this.f5522c;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (isInEditMode()) {
            canvas.drawRGB(223, 223, 223);
            Paint paint = new Paint();
            paint.setARGB(255, 210, 210, 210);
            paint.setTextAlign(Paint.Align.CENTER);
            paint.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
            Rect rect = new Rect();
            canvas.getClipBounds(rect);
            paint.setTextSize(rect.height());
            int iHeight = rect.height();
            int iWidth = rect.width();
            paint.setTextAlign(Paint.Align.LEFT);
            paint.getTextBounds("?", 0, 1, rect);
            canvas.drawText("?", ((iWidth / 2.0f) - (rect.width() / 2.0f)) - rect.left, ((rect.height() / 2.0f) + (iHeight / 2.0f)) - rect.bottom, paint);
        }
    }

    public void setContentId(int i10) {
        View viewFindViewById;
        if (this.f5520a == i10) {
            return;
        }
        View view = this.f5521b;
        if (view != null) {
            view.setVisibility(0);
            ((ConstraintLayout.C0759b) this.f5521b.getLayoutParams()).f5324f0 = false;
            this.f5521b = null;
        }
        this.f5520a = i10;
        if (i10 != -1 && (viewFindViewById = ((View) getParent()).findViewById(i10)) != null) {
            viewFindViewById.setVisibility(8);
        }
    }

    public void setEmptyVisibility(int i10) {
        this.f5522c = i10;
    }
}
