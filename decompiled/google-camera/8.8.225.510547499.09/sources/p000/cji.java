package p000;

import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cji implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f5926a;

    public cji(oju ojuVar) {
        this.f5926a = ojuVar;
    }

    @Override // p000.oju
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final npv get() {
        npv npvVarM14955A = kxk.m14955A((ScheduledExecutorService) this.f5926a.get());
        npvVarM14955A.getClass();
        return npvVarM14955A;
    }
}
