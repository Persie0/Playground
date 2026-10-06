package p000;

import android.content.Context;
import android.os.AsyncTask;
import android.os.SystemClock;
import java.io.PrintWriter;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public abstract class amj extends amk {

    /* JADX INFO: renamed from: a */
    public volatile ami f696a;

    /* JADX INFO: renamed from: i */
    private Executor f697i;

    /* JADX INFO: renamed from: j */
    private volatile ami f698j;

    public amj(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public abstract Object mo948a();

    /* JADX INFO: renamed from: b */
    final void m949b() {
        if (this.f698j != null || this.f696a == null) {
            return;
        }
        boolean z = this.f696a.f694a;
        if (this.f697i == null) {
            this.f697i = AsyncTask.THREAD_POOL_EXECUTOR;
        }
        ami amiVar = this.f696a;
        Executor executor = this.f697i;
        if (amiVar.f711f == 1) {
            amiVar.f711f = 2;
            executor.execute(amiVar.f708c);
            return;
        }
        int i = amiVar.f711f;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        switch (i2) {
            case 1:
                throw new IllegalStateException("Cannot execute task: the task is already running.");
            case 2:
                throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
            default:
                throw new IllegalStateException("We should never reach this state");
        }
    }

    @Override // p000.amk
    /* JADX INFO: renamed from: c */
    protected final void mo950c() {
        mo953f();
        this.f696a = new ami(this);
        m949b();
    }

    /* JADX INFO: renamed from: d */
    final void m951d(ami amiVar) {
        if (this.f698j == amiVar) {
            SystemClock.uptimeMillis();
            this.f698j = null;
            m949b();
        }
    }

    @Override // p000.amk
    @Deprecated
    /* JADX INFO: renamed from: e */
    public final void mo952e(String str, PrintWriter printWriter) {
        printWriter.print(str);
        printWriter.print("mId=");
        printWriter.print(this.f699b);
        printWriter.print(" mListener=");
        printWriter.println(this.f705h);
        if (this.f701d || this.f704g) {
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.print(this.f701d);
            printWriter.print(" mContentChanged=");
            printWriter.print(this.f704g);
            printWriter.print(" mProcessingChange=");
            printWriter.println(false);
        }
        if (this.f702e || this.f703f) {
            printWriter.print(str);
            printWriter.print("mAbandoned=");
            printWriter.print(this.f702e);
            printWriter.print(" mReset=");
            printWriter.println(this.f703f);
        }
        if (this.f696a != null) {
            printWriter.print(str);
            printWriter.print("mTask=");
            printWriter.print(this.f696a);
            printWriter.print(" waiting=");
            boolean z = this.f696a.f694a;
            printWriter.println(false);
        }
        if (this.f698j != null) {
            printWriter.print(str);
            printWriter.print("mCancellingTask=");
            printWriter.print(this.f698j);
            printWriter.print(" waiting=");
            boolean z2 = this.f698j.f694a;
            printWriter.println(false);
        }
    }

    @Override // p000.amk
    /* JADX INFO: renamed from: f */
    public final void mo953f() {
        if (this.f696a != null) {
            if (!this.f701d) {
                this.f704g = true;
            }
            if (this.f698j != null) {
                boolean z = this.f696a.f694a;
                this.f696a = null;
                return;
            }
            boolean z2 = this.f696a.f694a;
            ami amiVar = this.f696a;
            amiVar.f709d.set(true);
            if (amiVar.f708c.cancel(false)) {
                this.f698j = this.f696a;
            }
            this.f696a = null;
        }
    }
}
