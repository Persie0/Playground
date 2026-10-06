package p000;

import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class csw implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f9397a;

    /* JADX INFO: renamed from: b */
    private final oju f9398b;

    /* JADX INFO: renamed from: c */
    private final oju f9399c;

    /* JADX INFO: renamed from: d */
    private final oju f9400d;

    public csw(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4) {
        this.f9397a = ojuVar;
        this.f9398b = ojuVar2;
        this.f9399c = ojuVar3;
        this.f9400d = ojuVar4;
    }

    @Override // p000.oju
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final csv get() {
        return new csv(((emh) this.f9397a).m7522a(), ((cst) this.f9398b).get(), (ScheduledExecutorService) this.f9399c.get(), gtd.m9735q(), ((emb) this.f9400d).get());
    }
}
