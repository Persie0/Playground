package p000;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class iqv implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f31835a;

    /* JADX INFO: renamed from: b */
    private final oju f31836b;

    /* JADX INFO: renamed from: c */
    private final oju f31837c;

    /* JADX INFO: renamed from: d */
    private final oju f31838d;

    /* JADX INFO: renamed from: e */
    private final oju f31839e;

    public iqv(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5) {
        this.f31835a = ojuVar;
        this.f31836b = ojuVar2;
        this.f31837c = ojuVar3;
        this.f31838d = ojuVar4;
        this.f31839e = ojuVar5;
    }

    @Override // p000.oju
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final iqu get() {
        return new iqu((Executor) this.f31835a.get(), ((kbm) this.f31836b).get(), ((iqx) this.f31837c).get(), ((iqw) this.f31838d).get(), ((iqy) this.f31839e).get());
    }
}
