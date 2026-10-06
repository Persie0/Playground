package p000;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ehx implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f14110a;

    /* JADX INFO: renamed from: b */
    private final oju f14111b;

    /* JADX INFO: renamed from: c */
    private final oju f14112c;

    public ehx(oju ojuVar, oju ojuVar2, oju ojuVar3) {
        this.f14110a = ojuVar;
        this.f14111b = ojuVar2;
        this.f14112c = ojuVar3;
    }

    /* JADX INFO: renamed from: b */
    public static ehx m7336b(oju ojuVar, oju ojuVar2, oju ojuVar3) {
        return new ehx(ojuVar, ojuVar2, ojuVar3);
    }

    @Override // p000.oju
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ehw get() {
        return new ehw(((ehy) this.f14110a).get(), (gye) this.f14111b.get(), (Executor) this.f14112c.get(), null, null, null, null);
    }
}
