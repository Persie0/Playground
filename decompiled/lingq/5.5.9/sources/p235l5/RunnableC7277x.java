package p235l5;

import android.content.Context;
import androidx.work.impl.foreground.C1258a;
import androidx.work.impl.utils.futures.AbstractFuture;
import androidx.work.impl.utils.futures.C1268a;
import java.util.UUID;
import p026b5.C1310c;
import p041c5.C1719q;
import p214k5.C6617s;
import p260m8.C7499b;

/* JADX INFO: renamed from: l5.x */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC7277x implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C1268a f40785a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ UUID f40786b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C1310c f40787c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Context f40788d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C7278y f40789e;

    public RunnableC7277x(C7278y c7278y, C1268a c1268a, UUID uuid, C1310c c1310c, Context context) {
        this.f40789e = c7278y;
        this.f40785a = c1268a;
        this.f40786b = uuid;
        this.f40787c = c1310c;
        this.f40788d = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            if (!(this.f40785a.f7924a instanceof AbstractFuture.C1262b)) {
                String string = this.f40786b.toString();
                C6617s c6617sMo13237o = this.f40789e.f40792c.mo13237o(string);
                if (c6617sMo13237o == null || c6617sMo13237o.f37525b.isFinished()) {
                    throw new IllegalStateException("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                }
                ((C1719q) this.f40789e.f40791b).m5457f(string, this.f40787c);
                this.f40788d.startService(C1258a.m4748a(this.f40788d, C7499b.m14892A(c6617sMo13237o), this.f40787c));
            }
            this.f40785a.m4766i(null);
        } catch (Throwable th2) {
            this.f40785a.m4767j(th2);
        }
    }
}
