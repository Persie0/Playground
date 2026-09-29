package p000;

import android.content.Context;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class tk6 {

    /* JADX INFO: renamed from: f */
    public static tk6 f62446f;

    /* JADX INFO: renamed from: a */
    public final Executor f62447a;

    /* JADX INFO: renamed from: b */
    public final CopyOnWriteArrayList f62448b;

    /* JADX INFO: renamed from: c */
    public final Object f62449c;

    /* JADX INFO: renamed from: d */
    public int f62450d;

    /* JADX INFO: renamed from: e */
    public boolean f62451e;

    public tk6(Context context) {
        Executor executorM15956s = l70.m15956s();
        this.f62447a = executorM15956s;
        this.f62448b = new CopyOnWriteArrayList();
        this.f62449c = new Object();
        this.f62450d = 0;
        executorM15956s.execute(new RunnableC3470pr(28, this, context));
    }

    /* JADX INFO: renamed from: a */
    public static synchronized tk6 m22184a(Context context) {
        try {
            if (f62446f == null) {
                f62446f = new tk6(context);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f62446f;
    }

    /* JADX INFO: renamed from: b */
    public final int m22185b() {
        int i;
        synchronized (this.f62449c) {
            i = this.f62450d;
        }
        return i;
    }

    /* JADX INFO: renamed from: c */
    public final void m22186c(int i) {
        CopyOnWriteArrayList<sk6> copyOnWriteArrayList = this.f62448b;
        for (sk6 sk6Var : copyOnWriteArrayList) {
            if (sk6Var.f60954a.get() == null) {
                copyOnWriteArrayList.remove(sk6Var);
            }
        }
        synchronized (this.f62449c) {
            try {
                if (this.f62451e && this.f62450d == i) {
                    return;
                }
                this.f62451e = true;
                this.f62450d = i;
                for (sk6 sk6Var2 : this.f62448b) {
                    sk6Var2.f60955b.execute(new RunnableC3781y2(sk6Var2, 29));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
