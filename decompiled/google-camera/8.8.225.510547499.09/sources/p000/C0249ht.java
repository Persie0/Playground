package p000;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.ActionBarContainer;

/* JADX INFO: renamed from: ht */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class C0249ht extends Drawable {

    /* JADX INFO: renamed from: a */
    final ActionBarContainer f29482a;

    public C0249ht(ActionBarContainer actionBarContainer) {
        this.f29482a = actionBarContainer;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        ActionBarContainer actionBarContainer = this.f29482a;
        if (actionBarContainer.f941d) {
            Drawable drawable = actionBarContainer.f940c;
            if (drawable != null) {
                drawable.draw(canvas);
                return;
            }
            return;
        }
        Drawable drawable2 = actionBarContainer.f938a;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        ActionBarContainer actionBarContainer2 = this.f29482a;
        if (actionBarContainer2.f939b != null) {
            boolean z = actionBarContainer2.f942e;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        ActionBarContainer actionBarContainer = this.f29482a;
        if (actionBarContainer.f941d) {
            if (actionBarContainer.f940c != null) {
                actionBarContainer.f938a.getOutline(outline);
            }
        } else {
            Drawable drawable = actionBarContainer.f938a;
            if (drawable != null) {
                drawable.getOutline(outline);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
