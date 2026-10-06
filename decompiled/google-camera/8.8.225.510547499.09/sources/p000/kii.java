package p000;

import androidx.wear.ambient.AmbientDelegate;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kii implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f36163a;

    public kii(oju ojuVar) {
        this.f36163a = ojuVar;
    }

    @Override // p000.oju
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final AmbientDelegate get() {
        return new AmbientDelegate((khf) this.f36163a.get());
    }
}
