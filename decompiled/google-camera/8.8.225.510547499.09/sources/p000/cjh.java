package p000;

import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cjh implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f5925a;

    public cjh(oju ojuVar) {
        this.f5925a = ojuVar;
    }

    @Override // p000.oju
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final npu get() {
        npv npvVar = ((cji) this.f5925a).get();
        ScheduledExecutorService scheduledExecutorService = cje.f5921a;
        return npvVar;
    }
}
