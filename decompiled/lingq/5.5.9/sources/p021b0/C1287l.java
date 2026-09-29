package p021b0;

import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.RippleDrawable;
import dm.C5207g;
import p387t0.C9169u;

/* JADX INFO: renamed from: b0.l */
/* JADX INFO: loaded from: classes.dex */
public final class C1287l extends RippleDrawable {

    /* JADX INFO: renamed from: a */
    public final boolean f7983a;

    /* JADX INFO: renamed from: b */
    public C9169u f7984b;

    /* JADX INFO: renamed from: c */
    public Integer f7985c;

    /* JADX INFO: renamed from: d */
    public boolean f7986d;

    /* JADX INFO: renamed from: b0.l$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public static final a f7987a = new a();

        /* JADX INFO: renamed from: a */
        public final void m4790a(RippleDrawable rippleDrawable, int i10) {
            C5207g.m11111f(rippleDrawable, "ripple");
            rippleDrawable.setRadius(i10);
        }
    }

    public C1287l(boolean z10) {
        super(ColorStateList.valueOf(-16777216), null, z10 ? new ColorDrawable(-1) : null);
        this.f7983a = z10;
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.Drawable
    public final Rect getDirtyBounds() {
        if (!this.f7983a) {
            this.f7986d = true;
        }
        Rect dirtyBounds = super.getDirtyBounds();
        C5207g.m11110e(dirtyBounds, "super.getDirtyBounds()");
        this.f7986d = false;
        return dirtyBounds;
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public final boolean isProjected() {
        return this.f7986d;
    }
}
