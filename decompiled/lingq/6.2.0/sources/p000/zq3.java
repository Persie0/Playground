package p000;

import android.os.Looper;
import com.google.android.gms.measurement.internal.C1043b;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class zq3 implements Executor {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f71966a = 0;

    /* JADX INFO: renamed from: b */
    public final Object f71967b;

    public zq3(Looper looper) {
        this.f71967b = new wdb(looper, 4);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        int i = this.f71966a;
        Object obj = this.f71967b;
        switch (i) {
            case 0:
                ((wdb) obj).post(runnable);
                break;
            default:
                tic ticVar = ((kjc) ((C1043b) obj).f60774a).f47439g;
                kjc.m15280l(ticVar);
                ticVar.m22076M(runnable);
                break;
        }
    }

    public zq3(C1043b c1043b) {
        this.f71967b = c1043b;
    }
}
