package p000;

import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.RippleDrawable;

/* JADX INFO: loaded from: classes.dex */
public final class hga extends RippleDrawable {

    /* JADX INFO: renamed from: a */
    public final boolean f42337a;

    /* JADX INFO: renamed from: b */
    public aa1 f42338b;

    /* JADX INFO: renamed from: c */
    public boolean f42339c;

    public hga(boolean z) {
        super(ColorStateList.valueOf(-16777216), null, z ? new ColorDrawable(-1) : null);
        this.f42337a = z;
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.Drawable
    public final Rect getDirtyBounds() {
        if (!this.f42337a) {
            this.f42339c = true;
        }
        Rect dirtyBounds = super.getDirtyBounds();
        this.f42339c = false;
        return dirtyBounds;
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public final boolean isProjected() {
        return this.f42339c;
    }
}
