package p000;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ggo implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f24686a;

    /* JADX INFO: renamed from: b */
    private final oju f24687b;

    /* JADX INFO: renamed from: c */
    private final oju f24688c;

    /* JADX INFO: renamed from: d */
    private final oju f24689d;

    /* JADX INFO: renamed from: e */
    private final oju f24690e;

    /* JADX INFO: renamed from: f */
    private final oju f24691f;

    /* JADX INFO: renamed from: g */
    private final oju f24692g;

    public ggo(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7) {
        this.f24686a = ojuVar;
        this.f24687b = ojuVar2;
        this.f24688c = ojuVar3;
        this.f24689d = ojuVar4;
        this.f24690e = ojuVar5;
        this.f24691f = ojuVar6;
        this.f24692g = ojuVar7;
    }

    @Override // p000.oju
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ggn get() {
        return new ggn(((ema) this.f24686a).get(), (kov) this.f24687b.get(), ((emc) this.f24688c).get(), ((dki) this.f24689d).get(), ((err) this.f24690e).get(), (Executor) this.f24691f.get(), (kbz) this.f24692g.get());
    }
}
