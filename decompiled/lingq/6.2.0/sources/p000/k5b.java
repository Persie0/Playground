package p000;

import android.view.WindowInsetsAnimation;

/* JADX INFO: loaded from: classes.dex */
public final class k5b extends l5b {

    /* JADX INFO: renamed from: e */
    public final WindowInsetsAnimation f46739e;

    public k5b(WindowInsetsAnimation windowInsetsAnimation) {
        super(0, null, 0L);
        this.f46739e = windowInsetsAnimation;
    }

    @Override // p000.l5b
    /* JADX INFO: renamed from: a */
    public final float mo14856a() {
        return this.f46739e.getAlpha();
    }

    @Override // p000.l5b
    /* JADX INFO: renamed from: b */
    public final long mo14857b() {
        return this.f46739e.getDurationMillis();
    }

    @Override // p000.l5b
    /* JADX INFO: renamed from: c */
    public final float mo14858c() {
        return this.f46739e.getInterpolatedFraction();
    }

    @Override // p000.l5b
    /* JADX INFO: renamed from: d */
    public final int mo14859d() {
        return this.f46739e.getTypeMask();
    }

    @Override // p000.l5b
    /* JADX INFO: renamed from: e */
    public final void mo14860e(float f) {
        this.f46739e.setFraction(f);
    }
}
