package p000;

import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bji implements bjl {

    /* JADX INFO: renamed from: a */
    private final bjb f3473a;

    /* JADX INFO: renamed from: b */
    private final bjb f3474b;

    public bji(bjb bjbVar, bjb bjbVar2) {
        this.f3473a = bjbVar;
        this.f3474b = bjbVar2;
    }

    @Override // p000.bjl
    /* JADX INFO: renamed from: a */
    public final bie mo2524a() {
        return new bip(this.f3473a.mo2524a(), this.f3474b.mo2524a());
    }

    @Override // p000.bjl
    /* JADX INFO: renamed from: b */
    public final List mo2525b() {
        throw new UnsupportedOperationException("Cannot call getKeyframes on AnimatableSplitDimensionPathValue.");
    }

    @Override // p000.bjl
    /* JADX INFO: renamed from: c */
    public final boolean mo2526c() {
        return this.f3473a.mo2526c() && this.f3474b.mo2526c();
    }
}
