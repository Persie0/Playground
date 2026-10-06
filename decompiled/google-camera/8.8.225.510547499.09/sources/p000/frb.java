package p000;

import android.os.Handler;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class frb implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f23284a;

    /* JADX INFO: renamed from: b */
    private final oju f23285b;

    /* JADX INFO: renamed from: c */
    private final oju f23286c;

    public frb(oju ojuVar, oju ojuVar2, oju ojuVar3) {
        this.f23284a = ojuVar;
        this.f23285b = ojuVar2;
        this.f23286c = ojuVar3;
    }

    /* JADX INFO: renamed from: b */
    public static frb m8708b(oju ojuVar, oju ojuVar2, oju ojuVar3) {
        return new frb(ojuVar, ojuVar2, ojuVar3);
    }

    @Override // p000.oju
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final fqb get() {
        return new fqb((fqg) this.f23284a.get(), (Handler) this.f23285b.get(), (gva) this.f23286c.get(), null);
    }
}
