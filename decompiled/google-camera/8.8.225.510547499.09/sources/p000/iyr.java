package p000;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableWrapper;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class iyr extends DrawableWrapper {
    public iyr(Drawable drawable) {
        super(drawable);
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (getLayoutDirection() == 0) {
            super.draw(canvas);
            return;
        }
        int iSave = canvas.save();
        canvas.scale(-1.0f, 1.0f, getBounds().centerX(), 0.0f);
        super.draw(canvas);
        canvas.restoreToCount(iSave);
    }
}
