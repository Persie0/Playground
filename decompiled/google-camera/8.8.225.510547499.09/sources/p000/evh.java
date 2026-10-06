package p000;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class evh implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f20394a;

    /* JADX INFO: renamed from: b */
    private final oju f20395b;

    /* JADX INFO: renamed from: c */
    private final oju f20396c;

    /* JADX INFO: renamed from: d */
    private final oju f20397d;

    /* JADX INFO: renamed from: e */
    private final oju f20398e;

    public evh(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5) {
        this.f20394a = ojuVar;
        this.f20395b = ojuVar2;
        this.f20396c = ojuVar3;
        this.f20397d = ojuVar4;
        this.f20398e = ojuVar5;
    }

    @Override // p000.oju
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final evg get() {
        return new evg(((emg) this.f20394a).get(), (jvd) this.f20395b.get(), ((ers) this.f20396c).get(), (chk) this.f20397d.get(), (Executor) this.f20398e.get(), null, null);
    }
}
