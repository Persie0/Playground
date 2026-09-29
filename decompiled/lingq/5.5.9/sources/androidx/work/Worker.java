package androidx.work;

import android.content.Context;
import androidx.work.impl.utils.futures.C1268a;
import p026b5.C1310c;
import p532zd.InterfaceFutureC10478a;

/* JADX INFO: loaded from: classes.dex */
public abstract class Worker extends AbstractC1246d {

    /* JADX INFO: renamed from: e */
    public C1268a<AbstractC1246d.a> f7798e;

    /* JADX INFO: renamed from: androidx.work.Worker$a */
    public class RunnableC1241a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C1268a f7799a;

        public RunnableC1241a(C1268a c1268a) {
            this.f7799a = c1268a;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                Worker.this.getClass();
                throw new IllegalStateException("Expedited WorkRequests require a Worker to provide an implementation for \n `getForegroundInfo()`");
            } catch (Throwable th2) {
                this.f7799a.m4767j(th2);
            }
        }
    }

    public Worker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    @Override // androidx.work.AbstractC1246d
    /* JADX INFO: renamed from: a */
    public final InterfaceFutureC10478a<C1310c> mo4695a() {
        C1268a c1268a = new C1268a();
        this.f7829b.f7804d.execute(new RunnableC1241a(c1268a));
        return c1268a;
    }

    @Override // androidx.work.AbstractC1246d
    /* JADX INFO: renamed from: c */
    public final C1268a mo4697c() {
        this.f7798e = new C1268a<>();
        this.f7829b.f7804d.execute(new RunnableC1247e(this));
        return this.f7798e;
    }

    /* JADX INFO: renamed from: g */
    public abstract AbstractC1246d.a.c mo4699g();
}
