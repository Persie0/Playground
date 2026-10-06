package p000;

import androidx.wear.ambient.AmbientDelegate;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class cdf implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f5289a;

    /* JADX INFO: renamed from: b */
    private final oju f5290b;

    public cdf(oju ojuVar, oju ojuVar2) {
        this.f5289a = ojuVar;
        this.f5290b = ojuVar2;
    }

    @Override // p000.oju
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final AmbientDelegate get() {
        return new AmbientDelegate((dox) this.f5289a.get(), this.f5290b);
    }
}
