package p000;

import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fgt implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f21946a;

    /* JADX INFO: renamed from: b */
    private final oju f21947b;

    /* JADX INFO: renamed from: c */
    private final oju f21948c;

    /* JADX INFO: renamed from: d */
    private final oju f21949d;

    /* JADX INFO: renamed from: e */
    private final oju f21950e;

    public fgt(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5) {
        this.f21946a = ojuVar;
        this.f21947b = ojuVar2;
        this.f21948c = ojuVar3;
        this.f21949d = ojuVar4;
        this.f21950e = ojuVar5;
    }

    @Override // p000.oju
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final fgs get() {
        return new fgs((jww) this.f21946a.get(), ((ity) this.f21947b).get(), (ScheduledExecutorService) this.f21948c.get(), ((hzr) this.f21949d).get(), ((emc) this.f21950e).get());
    }
}
