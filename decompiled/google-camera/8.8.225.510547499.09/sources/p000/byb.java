package p000;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class byb implements bsz, bsw {

    /* JADX INFO: renamed from: a */
    protected final Drawable f4734a;

    public byb(Drawable drawable) {
        bzq.m3278r(drawable);
        this.f4734a = drawable;
    }

    @Override // p000.bsw
    /* JADX INFO: renamed from: d */
    public void mo3026d() {
        Drawable drawable = this.f4734a;
        if (drawable instanceof BitmapDrawable) {
            ((BitmapDrawable) drawable).getBitmap().prepareToDraw();
        } else if (drawable instanceof byh) {
            ((byh) drawable).m3188a().prepareToDraw();
        }
    }

    @Override // p000.bsz
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final Drawable mo3016c() {
        Drawable.ConstantState constantState = this.f4734a.getConstantState();
        return constantState == null ? this.f4734a : constantState.newDrawable();
    }
}
