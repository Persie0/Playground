package p000;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class coq implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f8486a;

    /* JADX INFO: renamed from: b */
    private final oju f8487b;

    /* JADX INFO: renamed from: c */
    private final oju f8488c;

    /* JADX INFO: renamed from: d */
    private final oju f8489d;

    /* JADX INFO: renamed from: e */
    private final oju f8490e;

    /* JADX INFO: renamed from: f */
    private final oju f8491f;

    public coq(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6) {
        this.f8486a = ojuVar;
        this.f8487b = ojuVar2;
        this.f8488c = ojuVar3;
        this.f8489d = ojuVar4;
        this.f8490e = ojuVar5;
        this.f8491f = ojuVar6;
    }

    @Override // p000.oju
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final cop get() {
        return new cop(((dws) this.f8486a).m6830a(), (Executor) this.f8487b.get(), (jvd) this.f8488c.get(), ((erq) this.f8489d).get(), ((djn) this.f8490e).m6251a(), (cof) this.f8491f.get());
    }
}
