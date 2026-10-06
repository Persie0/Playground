package p000;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dqa implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f12277a;

    /* JADX INFO: renamed from: b */
    private final oju f12278b;

    /* JADX INFO: renamed from: c */
    private final oju f12279c;

    /* JADX INFO: renamed from: d */
    private final oju f12280d;

    public dqa(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4) {
        this.f12277a = ojuVar;
        this.f12278b = ojuVar2;
        this.f12279c = ojuVar3;
        this.f12280d = ojuVar4;
    }

    /* JADX INFO: renamed from: b */
    public static dqa m6572b(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4) {
        return new dqa(ojuVar, ojuVar2, ojuVar3, ojuVar4);
    }

    @Override // p000.oju
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final dpz get() {
        return new dpz((kpb) this.f12277a.get(), dnr.m6443b(), (Executor) this.f12278b.get(), ((Integer) this.f12279c.get()).intValue(), (dhv) this.f12280d.get());
    }
}
