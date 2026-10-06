package p000;

import android.content.Context;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class doa implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f12147a;

    /* JADX INFO: renamed from: b */
    private final oju f12148b;

    /* JADX INFO: renamed from: c */
    private final oju f12149c;

    /* JADX INFO: renamed from: d */
    private final oju f12150d;

    public doa(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4) {
        this.f12147a = ojuVar;
        this.f12148b = ojuVar2;
        this.f12149c = ojuVar3;
        this.f12150d = ojuVar4;
    }

    @Override // p000.oju
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final djm get() {
        Context contextM6830a = ((dws) this.f12147a).m6830a();
        dhv dhvVar = (dhv) this.f12148b.get();
        ((dna) this.f12149c).get();
        return new djm(contextM6830a, dhvVar, ((dki) this.f12150d).get());
    }
}
