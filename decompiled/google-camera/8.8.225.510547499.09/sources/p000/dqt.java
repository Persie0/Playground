package p000;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dqt implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f12358a;

    /* JADX INFO: renamed from: b */
    private final oju f12359b;

    /* JADX INFO: renamed from: c */
    private final oju f12360c;

    /* JADX INFO: renamed from: d */
    private final oju f12361d;

    public dqt(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4) {
        this.f12358a = ojuVar;
        this.f12359b = ojuVar2;
        this.f12360c = ojuVar3;
        this.f12361d = ojuVar4;
    }

    /* JADX INFO: renamed from: b */
    public static dqt m6604b(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4) {
        return new dqt(ojuVar, ojuVar2, ojuVar3, ojuVar4);
    }

    @Override // p000.oju
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final dqs get() {
        return new dqs(dnr.m6443b(), (Executor) this.f12358a.get(), (bko) this.f12359b.get(), (dhv) this.f12360c.get(), ((kbm) this.f12361d).get(), null, null, null);
    }
}
