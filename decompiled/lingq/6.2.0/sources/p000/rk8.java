package p000;

import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class rk8 implements Executor {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f59446a;

    /* JADX INFO: renamed from: b */
    public final Object f59447b;

    public rk8() {
        this.f59446a = 2;
        wdb wdbVar = new wdb(Looper.getMainLooper());
        Looper.getMainLooper();
        this.f59447b = wdbVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        int i = this.f59446a;
        Object obj = this.f59447b;
        switch (i) {
            case 0:
                ((Executor) obj).execute(new qk8(runnable, 0));
                break;
            case 1:
                ((e8b) obj).f36849c.post(runnable);
                break;
            default:
                ((wdb) obj).post(runnable);
                break;
        }
    }

    public /* synthetic */ rk8(Object obj, int i) {
        this.f59446a = i;
        this.f59447b = obj;
    }
}
