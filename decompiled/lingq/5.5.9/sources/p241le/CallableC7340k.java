package p241le;

import android.util.Log;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.crashlytics.internal.common.C3213b;
import com.google.firebase.crashlytics.internal.settings.C3215a;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import p136gc.AbstractC5751g;
import p339qe.C8597b;
import se.InterfaceC8996f;

/* JADX INFO: renamed from: le.k */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC7340k implements Callable<AbstractC5751g<Void>> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ long f41066a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Throwable f41067b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Thread f41068c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ InterfaceC8996f f41069d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ boolean f41070e = false;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C3213b f41071f;

    public CallableC7340k(C3213b c3213b, long j10, Throwable th2, Thread thread, InterfaceC8996f interfaceC8996f) {
        this.f41071f = c3213b;
        this.f41066a = j10;
        this.f41067b = th2;
        this.f41068c = thread;
        this.f41069d = interfaceC8996f;
    }

    @Override // java.util.concurrent.Callable
    public final AbstractC5751g<Void> call() throws Exception {
        long j10 = this.f41066a;
        long j11 = j10 / 1000;
        C3213b c3213b = this.f41071f;
        String strM9166e = c3213b.m9166e();
        if (strM9166e == null) {
            Log.e("FirebaseCrashlytics", "Tried to write a fatal exception while no session was open.", null);
            return Tasks.m8539c(null);
        }
        c3213b.f16207c.m1217e();
        Throwable th2 = this.f41067b;
        Thread thread = this.f41068c;
        C7335g0 c7335g0 = c3213b.f16216l;
        c7335g0.getClass();
        String strConcat = "Persisting fatal event for session ".concat(strM9166e);
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", strConcat, null);
        }
        c7335g0.m14753d(th2, thread, strM9166e, "crash", j11, true);
        try {
            C8597b c8597b = c3213b.f16211g;
            String str = ".ae" + j10;
            c8597b.getClass();
            if (!new File(c8597b.f46076b, str).createNewFile()) {
                throw new IOException("Create new file failed.");
            }
        } catch (IOException e10) {
            Log.w("FirebaseCrashlytics", "Could not create app exception marker file.", e10);
        }
        InterfaceC8996f interfaceC8996f = this.f41069d;
        c3213b.m9164c(false, interfaceC8996f);
        new C7330e(c3213b.f16210f);
        C3213b.m9162a(c3213b, C7330e.f41041b);
        if (!c3213b.f16206b.m14737a()) {
            return Tasks.m8539c(null);
        }
        Executor executor = c3213b.f16209e.f41050a;
        return ((C3215a) interfaceC8996f).f16234i.get().f34812a.mo12112n(executor, new C7339j(this, executor, strM9166e));
    }
}
