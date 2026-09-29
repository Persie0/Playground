package p241le;

import android.util.Log;
import com.google.firebase.crashlytics.internal.common.C3213b;
import com.google.firebase.crashlytics.internal.common.C3214c;

/* JADX INFO: renamed from: le.q */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC7346q implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ long f41081a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Throwable f41082b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Thread f41083c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C3213b f41084d;

    public RunnableC7346q(C3213b c3213b, long j10, Exception exc, Thread thread) {
        this.f41084d = c3213b;
        this.f41081a = j10;
        this.f41082b = exc;
        this.f41083c = thread;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C3213b c3213b = this.f41084d;
        C3214c c3214c = c3213b.f16217m;
        if (c3214c != null && c3214c.f16225e.get()) {
            return;
        }
        long j10 = this.f41081a / 1000;
        String strM9166e = c3213b.m9166e();
        if (strM9166e == null) {
            Log.w("FirebaseCrashlytics", "Tried to write a non-fatal exception while no session was open.", null);
            return;
        }
        Throwable th2 = this.f41082b;
        Thread thread = this.f41083c;
        C7335g0 c7335g0 = c3213b.f16216l;
        c7335g0.getClass();
        String strConcat = "Persisting non-fatal event for session ".concat(strM9166e);
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", strConcat, null);
        }
        c7335g0.m14753d(th2, thread, strM9166e, "error", j10, false);
    }
}
