package p000;

import com.kochava.core.job.job.internal.JobAction;

/* JADX INFO: loaded from: classes.dex */
public final class ie4 {

    /* JADX INFO: renamed from: a */
    public final JobAction f44015a;

    /* JADX INFO: renamed from: b */
    public final Object f44016b;

    /* JADX INFO: renamed from: c */
    public final long f44017c;

    public ie4(JobAction jobAction, Object obj, long j) {
        this.f44015a = jobAction;
        this.f44016b = obj;
        this.f44017c = j;
    }

    /* JADX INFO: renamed from: a */
    public static ie4 m13807a() {
        return new ie4(JobAction.Complete, null, -1L);
    }

    /* JADX INFO: renamed from: b */
    public static ie4 m13808b(Object obj) {
        return new ie4(JobAction.Complete, obj, -1L);
    }

    /* JADX INFO: renamed from: c */
    public static ie4 m13809c(long j) {
        return new ie4(JobAction.GoAsync, null, Math.max(0L, j));
    }

    /* JADX INFO: renamed from: d */
    public static ie4 m13810d(long j) {
        return new ie4(JobAction.GoDelay, null, Math.max(0L, j));
    }
}
