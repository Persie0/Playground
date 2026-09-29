package p000;

import android.os.Handler;
import android.util.Pair;
import com.kochava.core.job.job.internal.JobAction;
import com.kochava.core.job.job.internal.JobState;
import com.kochava.core.job.job.internal.JobType;
import com.kochava.core.task.internal.TaskQueue;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes.dex */
public abstract class bd4 implements vd4 {

    /* JADX INFO: renamed from: p */
    public static final Object f8367p = new Object();

    /* JADX INFO: renamed from: a */
    public final String f8368a;

    /* JADX INFO: renamed from: b */
    public final String f8369b;

    /* JADX INFO: renamed from: c */
    public final List f8370c;

    /* JADX INFO: renamed from: d */
    public final JobType f8371d;

    /* JADX INFO: renamed from: e */
    public final TaskQueue f8372e;

    /* JADX INFO: renamed from: f */
    public final sq5 f8373f;

    /* JADX INFO: renamed from: g */
    public final long f8374g;

    /* JADX INFO: renamed from: h */
    public boolean f8375h;

    /* JADX INFO: renamed from: i */
    public C3309ls f8376i;

    /* JADX INFO: renamed from: j */
    public long f8377j;

    /* JADX INFO: renamed from: k */
    public JobState f8378k;

    /* JADX INFO: renamed from: l */
    public tr9 f8379l;

    /* JADX INFO: renamed from: m */
    public tr9 f8380m;

    /* JADX INFO: renamed from: n */
    public tr9 f8381n;

    /* JADX INFO: renamed from: o */
    public Pair f8382o;

    public bd4(String str, String str2, List list, JobType jobType, TaskQueue taskQueue, sq5 sq5Var) {
        this.f8374g = System.currentTimeMillis();
        this.f8375h = false;
        this.f8377j = 0L;
        this.f8378k = JobState.Pending;
        this.f8379l = null;
        this.f8380m = null;
        this.f8381n = null;
        this.f8382o = null;
        this.f8368a = str;
        this.f8369b = str2;
        this.f8370c = list;
        this.f8371d = jobType;
        this.f8372e = taskQueue;
        this.f8373f = sq5Var;
    }

    @Override // p000.vd4
    /* JADX INFO: renamed from: b */
    public final void mo3636b(boolean z) {
        if (m3644o() || this.f8371d == JobType.OneShot) {
            return;
        }
        boolean z2 = z && mo300n((ce4) m3641j().f50065c);
        if (mo3639e() != z2) {
            if (z) {
                StringBuilder sb = new StringBuilder("Updated to ");
                sb.append(z2 ? "complete" : "pending");
                sb.append(" at ");
                sb.append(m3642k());
                sb.append(" seconds since SDK start and ");
                sb.append(ci8.m4710W(this.f8374g));
                sb.append(" seconds since created");
                this.f8373f.m21555D(sb.toString());
            }
            this.f8378k = z2 ? JobState.Complete : JobState.Pending;
        }
    }

    @Override // p000.vd4
    /* JADX INFO: renamed from: c */
    public final List mo3637c() {
        return this.f8370c;
    }

    /* JADX INFO: renamed from: d */
    public final void m3638d(C3309ls c3309ls, ie4 ie4Var, boolean z) {
        boolean zM25081e;
        boolean z2;
        String str;
        Object obj = f8367p;
        synchronized (obj) {
            try {
                if (m3644o() || !z) {
                    tr9 tr9Var = this.f8380m;
                    if (tr9Var != null) {
                        tr9Var.m22276a();
                    }
                    this.f8380m = null;
                    tr9 tr9Var2 = this.f8381n;
                    if (tr9Var2 != null) {
                        tr9Var2.m22276a();
                    }
                    this.f8381n = null;
                    tr9 tr9Var3 = this.f8379l;
                    if (tr9Var3 != null) {
                        tr9Var3.m22276a();
                    }
                    this.f8379l = null;
                    if (ie4Var.f44015a == JobAction.GoAsync) {
                        z2 = ie4Var.f44017c >= 0;
                        sq5 sq5Var = this.f8373f;
                        if (z2) {
                            str = " or a timeout of " + (ie4Var.f44017c / 1000.0d) + " seconds has elapsed";
                        } else {
                            str = "";
                        }
                        sq5Var.m21555D("Waiting until async resume is called".concat(str));
                        synchronized (obj) {
                            try {
                                this.f8378k = JobState.RunningAsync;
                                if (z2) {
                                    long j = ie4Var.f44017c;
                                    tr9 tr9VarM17697l = ((ny8) c3309ls.f50064b).m17697l(TaskQueue.Primary, new sq5(new C3487q7(this, 13)));
                                    tr9VarM17697l.m22280e(j);
                                    this.f8380m = tr9VarM17697l;
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        return;
                    }
                    JobAction jobAction = ie4Var.f44015a;
                    if (jobAction == JobAction.GoDelay) {
                        this.f8373f.m21555D("Waiting until delay of " + (ie4Var.f44017c / 1000.0d) + " seconds has elapsed");
                        synchronized (obj) {
                            this.f8378k = JobState.RunningDelay;
                            long j2 = ie4Var.f44017c;
                            tr9 tr9VarM17697l2 = ((ny8) c3309ls.f50064b).m17697l(TaskQueue.Primary, new sq5(new C3440oy(this, 19)));
                            tr9VarM17697l2.m22280e(j2);
                            this.f8381n = tr9VarM17697l2;
                        }
                        return;
                    }
                    JobAction jobAction2 = JobAction.GoWaitForDependencies;
                    if (jobAction == jobAction2) {
                        this.f8373f.m21555D("Waiting until dependencies are met");
                        synchronized (obj) {
                            this.f8378k = JobState.RunningWaitForDependencies;
                        }
                        ((yd4) c3309ls.f50066d).m25092m();
                        return;
                    }
                    JobAction jobAction3 = JobAction.ResumeAsync;
                    if (jobAction != jobAction3 && jobAction != JobAction.ResumeAsyncTimeOut && jobAction != JobAction.ResumeDelay && jobAction != JobAction.ResumeWaitForDependencies) {
                        z2 = jobAction == JobAction.TimedOut;
                        if (jobAction == JobAction.Complete || z2) {
                            mo297h((ce4) c3309ls.f50065c, ie4Var.f44016b, z);
                            synchronized (obj) {
                                this.f8378k = JobState.Complete;
                            }
                            this.f8373f.m21555D("Completed with a duration of " + ci8.m4710W(this.f8377j) + " seconds at " + m3642k() + " seconds since SDK start and " + ci8.m4710W(this.f8374g) + " seconds since created");
                            yd4 yd4Var = (yd4) c3309ls.f50066d;
                            synchronized (yd4Var.f69685e) {
                                try {
                                    if (yd4Var.f69686f) {
                                        if (this.f8371d == JobType.OneShot) {
                                            yd4Var.f69683c.remove(this);
                                        }
                                        yd4Var.m25089j();
                                        yd4Var.m25088i();
                                        return;
                                    }
                                    return;
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                            }
                        }
                        return;
                    }
                    synchronized (obj) {
                        try {
                            yd4 yd4Var2 = (yd4) c3309ls.f50066d;
                            synchronized (yd4Var2.f69685e) {
                                List list = this.f8370c;
                                HashMap mapM25082b = yd4Var2.m25082b();
                                HashMap mapM25087h = yd4Var2.m25087h();
                                HashMap map = new HashMap();
                                Iterator it = yd4Var2.f69682b.iterator();
                                if (it.hasNext()) {
                                    it.next().getClass();
                                    throw new ClassCastException();
                                }
                                zM25081e = yd4.m25081e(list, mapM25082b, mapM25087h, map);
                            }
                            if (zM25081e) {
                                String str2 = "unknown";
                                if (ie4Var.f44015a == JobAction.ResumeWaitForDependencies) {
                                    str2 = "dependencies are met";
                                } else if (ie4Var.f44015a == jobAction3) {
                                    str2 = "async resume was called";
                                } else if (ie4Var.f44015a == JobAction.ResumeAsyncTimeOut) {
                                    str2 = "async has timed out";
                                } else if (ie4Var.f44015a == JobAction.ResumeDelay) {
                                    str2 = "delay has elapsed";
                                }
                                this.f8373f.m21555D("Resuming now that ".concat(str2));
                                sq5 sq5Var2 = new sq5(new ar1(this, c3309ls, ie4Var.f44015a, 3));
                                ny8 ny8Var = (ny8) c3309ls.f50064b;
                                TaskQueue taskQueue = this.f8372e;
                                ar1 ar1Var = new ar1(this, sq5Var2, c3309ls, 4);
                                b64 b64Var = (b64) ny8Var.f53415c;
                                Handler handler = (Handler) b64Var.f8007b;
                                Handler handler2 = (Handler) b64Var.f8006a;
                                ExecutorService executorService = b64.f8005f;
                                if (executorService == null) {
                                    throw new RuntimeException("Failed to start threadpool");
                                }
                                tr9 tr9Var4 = new tr9(handler, handler2, executorService, taskQueue, ny8Var, sq5Var2, ar1Var);
                                tr9Var4.m22280e(0L);
                                this.f8379l = tr9Var4;
                            } else {
                                m3638d(c3309ls, new ie4(jobAction2, null, -1L), z);
                            }
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    @Override // p000.vd4
    /* JADX INFO: renamed from: e */
    public final boolean mo3639e() {
        boolean z;
        synchronized (f8367p) {
            z = this.f8378k == JobState.Complete;
        }
        return z;
    }

    /* JADX INFO: renamed from: f */
    public final void m3640f(ie4 ie4Var, JobState jobState) {
        C3309ls c3309lsM3641j = m3641j();
        ((ny8) c3309lsM3641j.f50064b).m17684L(new u72(this, ie4Var, jobState, c3309lsM3641j, 1));
    }

    /* JADX INFO: renamed from: g */
    public abstract ie4 mo296g(ce4 ce4Var, JobAction jobAction);

    @Override // p000.vd4
    public final String getId() {
        return this.f8368a;
    }

    /* JADX INFO: renamed from: h */
    public abstract void mo297h(ce4 ce4Var, Object obj, boolean z);

    /* JADX INFO: renamed from: i */
    public abstract void mo298i(ce4 ce4Var);

    /* JADX INFO: renamed from: j */
    public final C3309ls m3641j() {
        C3309ls c3309ls = this.f8376i;
        if (c3309ls != null) {
            return c3309ls;
        }
        ho2.m13385e("Job was not initialized");
        return null;
    }

    /* JADX INFO: renamed from: k */
    public final double m3642k() {
        return ci8.m4710W(((ce4) m3641j().f50065c).f9966a);
    }

    /* JADX INFO: renamed from: l */
    public abstract jj5 mo299l(ce4 ce4Var);

    /* JADX INFO: renamed from: m */
    public final void m3643m(C3309ls c3309ls) {
        synchronized (f8367p) {
            try {
                if (this.f8375h) {
                    return;
                }
                this.f8376i = c3309ls;
                this.f8375h = true;
                mo299l((ce4) c3309ls.f50065c);
                this.f8373f.m21555D("Initialized at " + m3642k() + " seconds since SDK start and " + ci8.m4710W(this.f8374g) + " seconds since created");
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public abstract boolean mo300n(ce4 ce4Var);

    /* JADX INFO: renamed from: o */
    public final boolean m3644o() {
        boolean z;
        synchronized (f8367p) {
            try {
                JobState jobState = this.f8378k;
                z = jobState == JobState.Running || jobState == JobState.RunningDelay || jobState == JobState.RunningAsync || jobState == JobState.RunningWaitForDependencies;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: p */
    public final void m3645p() {
        ((yd4) m3641j().f50066d).m25092m();
    }

    public bd4(String str, List list, JobType jobType, TaskQueue taskQueue, sq5 sq5Var) {
        this(str, "", list, jobType, taskQueue, sq5Var);
    }
}
