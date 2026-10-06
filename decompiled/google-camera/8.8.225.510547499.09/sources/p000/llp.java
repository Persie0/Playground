package p000;

import java.util.concurrent.ScheduledFuture;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class llp {

    /* JADX INFO: renamed from: d */
    private static final llo f38590d = new llo() { // from class: llk
        @Override // p000.llo
        /* JADX INFO: renamed from: a */
        public final void mo15708a(int i, String str) {
        }
    };

    /* JADX INFO: renamed from: a */
    public volatile llo f38591a = f38590d;

    /* JADX INFO: renamed from: b */
    public ScheduledFuture f38592b;

    /* JADX INFO: renamed from: c */
    public ScheduledFuture f38593c;

    public llp(lhz lhzVar, npv npvVar) {
        lhzVar.m15360a(new llm(this, npvVar));
        lhzVar.m15360a(new lln(this, npvVar));
    }

    /* JADX INFO: renamed from: a */
    public final void m15709a() {
        ScheduledFuture scheduledFuture = this.f38592b;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
            this.f38592b = null;
        }
        ScheduledFuture scheduledFuture2 = this.f38593c;
        if (scheduledFuture2 != null) {
            scheduledFuture2.cancel(true);
            this.f38593c = null;
        }
    }
}
