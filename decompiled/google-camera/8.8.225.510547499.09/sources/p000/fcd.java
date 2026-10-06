package p000;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fcd implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f21235a;

    /* JADX INFO: renamed from: b */
    private final oju f21236b;

    /* JADX INFO: renamed from: c */
    private final oju f21237c;

    /* JADX INFO: renamed from: d */
    private final oju f21238d;

    /* JADX INFO: renamed from: e */
    private final oju f21239e;

    /* JADX INFO: renamed from: f */
    private final oju f21240f;

    /* JADX INFO: renamed from: g */
    private final oju f21241g;

    public fcd(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7) {
        this.f21235a = ojuVar;
        this.f21236b = ojuVar2;
        this.f21237c = ojuVar3;
        this.f21238d = ojuVar4;
        this.f21239e = ojuVar5;
        this.f21240f = ojuVar6;
        this.f21241g = ojuVar7;
    }

    @Override // p000.oju
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final fcc get() {
        return new fcc(((dws) this.f21235a).m6830a(), (hah) this.f21236b.get(), this.f21237c, (jvd) this.f21238d.get(), (kbz) this.f21239e.get(), (Executor) this.f21240f.get(), (Executor) this.f21241g.get());
    }
}
