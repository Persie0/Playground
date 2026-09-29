package androidx.appcompat.widget;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: androidx.appcompat.widget.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0298b extends Drawable {

    /* JADX INFO: renamed from: a */
    public final ActionBarContainer f1129a;

    public C0298b(ActionBarContainer actionBarContainer) {
        this.f1129a = actionBarContainer;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        ActionBarContainer actionBarContainer = this.f1129a;
        if (actionBarContainer.f794h) {
            Drawable drawable = actionBarContainer.f793g;
            if (drawable != null) {
                drawable.draw(canvas);
            }
        } else {
            Drawable drawable2 = actionBarContainer.f791e;
            if (drawable2 != null) {
                drawable2.draw(canvas);
            }
            Drawable drawable3 = actionBarContainer.f792f;
            if (drawable3 != null && actionBarContainer.f795i) {
                drawable3.draw(canvas);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        ActionBarContainer actionBarContainer = this.f1129a;
        if (!actionBarContainer.f794h) {
            Drawable drawable = actionBarContainer.f791e;
            if (drawable != null) {
                drawable.getOutline(outline);
            }
        } else if (actionBarContainer.f793g != null) {
            actionBarContainer.f791e.getOutline(outline);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
