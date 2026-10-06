package p000;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cvs implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f9827a;

    /* JADX INFO: renamed from: b */
    private final oju f9828b;

    /* JADX INFO: renamed from: c */
    private final oju f9829c;

    /* JADX INFO: renamed from: d */
    private final oju f9830d;

    /* JADX INFO: renamed from: e */
    private final oju f9831e;

    /* JADX INFO: renamed from: f */
    private final oju f9832f;

    public cvs(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6) {
        this.f9827a = ojuVar;
        this.f9828b = ojuVar2;
        this.f9829c = ojuVar3;
        this.f9830d = ojuVar4;
        this.f9831e = ojuVar5;
        this.f9832f = ojuVar6;
    }

    @Override // p000.oju
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final cvr get() {
        return new cvr((gye) this.f9827a.get(), (crh) this.f9828b.get(), ((cto) this.f9829c).get(), (Executor) this.f9830d.get(), (hah) this.f9831e.get(), (dlw) this.f9832f.get());
    }
}
