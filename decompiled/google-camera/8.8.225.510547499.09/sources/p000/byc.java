package p000;

import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class byc extends byb {
    private byc(Drawable drawable) {
        super(drawable);
    }

    /* JADX INFO: renamed from: g */
    static bsz m3182g(Drawable drawable) {
        if (drawable != null) {
            return new byc(drawable);
        }
        return null;
    }

    @Override // p000.bsz
    /* JADX INFO: renamed from: a */
    public final int mo3014a() {
        return Math.max(1, this.f4734a.getIntrinsicWidth() * this.f4734a.getIntrinsicHeight() * 4);
    }

    @Override // p000.bsz
    /* JADX INFO: renamed from: b */
    public final Class mo3015b() {
        return this.f4734a.getClass();
    }

    @Override // p000.bsz
    /* JADX INFO: renamed from: e */
    public final void mo3018e() {
    }
}
