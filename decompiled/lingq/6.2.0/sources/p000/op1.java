package p000;

import android.util.Log;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.crashlytics.internal.common.C1148a;
import com.google.firebase.crashlytics.internal.settings.C1150a;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.Callable;
import kotlin.collections.AbstractC3194a;

/* JADX INFO: loaded from: classes2.dex */
public final class op1 implements Callable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ long f54667a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Throwable f54668b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Thread f54669c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C1150a f54670d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C1148a f54671e;

    public op1(C1148a c1148a, long j, Throwable th, Thread thread, C1150a c1150a) {
        this.f54671e = c1148a;
        this.f54667a = j;
        this.f54668b = th;
        this.f54669c = thread;
        this.f54670d = c1150a;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() throws Throwable {
        long j = this.f54667a;
        long j2 = j / 1000;
        C1148a c1148a = this.f54671e;
        String strM6675e = c1148a.m6675e();
        if (strM6675e == null) {
            Log.e("FirebaseCrashlytics", "Tried to write a fatal exception while no session was open.", null);
            return Tasks.m5975c(null);
        }
        c1148a.f13652c.m3353f();
        ed1 ed1Var = c1148a.f13662m;
        ed1Var.getClass();
        String strConcat = "Persisting fatal event for session ".concat(strM6675e);
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", strConcat, null);
        }
        ed1Var.m11054q(this.f54668b, this.f54669c, "crash", new fu2(strM6675e, j2, AbstractC3194a.m15360M()), true);
        try {
            t33 t33Var = c1148a.f13656g;
            String str = ".ae" + j;
            t33Var.getClass();
            if (!new File((File) t33Var.f61788c, str).createNewFile()) {
                throw new IOException("Create new file failed.");
            }
        } catch (IOException e) {
            Log.w("FirebaseCrashlytics", "Could not create app exception marker file.", e);
        }
        C1150a c1150a = this.f54670d;
        c1148a.m6672b(false, c1150a, false);
        c1148a.m6673c(new bl0().f8653a, Boolean.FALSE);
        return !c1148a.f13651b.m22354a() ? Tasks.m5975c(null) : ((wr9) c1150a.f13679i.get()).f67208a.mo5972n(c1148a.f13654e.f13668a, new vj6(this, strM6675e));
    }
}
