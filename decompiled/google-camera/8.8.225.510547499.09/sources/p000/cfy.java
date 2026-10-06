package p000;

import androidx.wear.ambient.AmbientDelegate;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cfy implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f5550a;

    /* JADX INFO: renamed from: b */
    private final oju f5551b;

    public cfy(oju ojuVar, oju ojuVar2) {
        this.f5550a = ojuVar;
        this.f5551b = ojuVar2;
    }

    @Override // p000.oju
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final AmbientDelegate get() {
        return new AmbientDelegate(((cfz) this.f5550a).get(), (dhv) this.f5551b.get(), (byte[]) null);
    }
}
