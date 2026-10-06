package p000;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fyj implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f23906a;

    /* JADX INFO: renamed from: b */
    private final oju f23907b;

    public fyj(oju ojuVar, oju ojuVar2) {
        this.f23906a = ojuVar;
        this.f23907b = ojuVar2;
    }

    /* JADX INFO: renamed from: b */
    public static fyj m8951b(oju ojuVar, oju ojuVar2) {
        return new fyj(ojuVar, ojuVar2);
    }

    @Override // p000.oju
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final fyi get() {
        return new fyi((Executor) this.f23906a.get(), (dhv) this.f23907b.get());
    }
}
