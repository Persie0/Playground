package p000;

import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class dey implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f10757a;

    public dey(oju ojuVar) {
        this.f10757a = ojuVar;
    }

    @Override // p000.oju
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final dex get() {
        return new dex((ScheduledExecutorService) this.f10757a.get());
    }
}
