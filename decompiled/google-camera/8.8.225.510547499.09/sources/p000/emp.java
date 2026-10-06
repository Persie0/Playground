package p000;

import android.app.job.JobScheduler;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class emp implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f14725a;

    public emp(oju ojuVar) {
        this.f14725a = ojuVar;
    }

    @Override // p000.oju
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final JobScheduler get() {
        JobScheduler jobScheduler = (JobScheduler) ((emj) this.f14725a.get()).mo7509a(emj.f14719l);
        jobScheduler.getClass();
        return jobScheduler;
    }
}
