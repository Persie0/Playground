package p509yf;

import ag.C0076c;
import android.os.Handler;
import bh.C1387c;
import com.kochava.core.job.internal.JobState;
import com.kochava.core.task.action.internal.TaskFailedException;
import com.kochava.core.task.internal.TaskQueue;
import dm.C5206f;
import java.util.concurrent.ExecutorService;
import kg.C6670c;
import kg.InterfaceC6672e;
import p201jg.C6476a;
import p201jg.InterfaceC6477b;
import p243lg.C7360b;
import p243lg.C7363e;
import p243lg.InterfaceC7361c;
import p341qg.C8618d;
import p485xg.C10186b;
import p485xg.C10187c;
import p510yg.C10363d;
import p535zg.C10489a;
import pg.C8248c;
import sg.C9003b;
import sg.C9004c;

/* JADX INFO: renamed from: yf.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC10357a implements InterfaceC10358b, InterfaceC6477b, InterfaceC6672e {

    /* JADX INFO: renamed from: a */
    public final InterfaceC7361c f52069a;

    /* JADX INFO: renamed from: b */
    public final String f52070b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC10359c f52071c;

    /* JADX INFO: renamed from: e */
    public final C6670c f52073e;

    /* JADX INFO: renamed from: d */
    public final Object f52072d = new Object();

    /* JADX INFO: renamed from: f */
    public volatile JobState f52074f = JobState.Pending;

    /* JADX INFO: renamed from: g */
    public volatile long f52075g = 0;

    /* JADX INFO: renamed from: h */
    public volatile long f52076h = 0;

    /* JADX INFO: renamed from: i */
    public volatile int f52077i = 1;

    /* JADX INFO: renamed from: j */
    public volatile long f52078j = -1;

    /* JADX INFO: renamed from: k */
    public C6670c f52079k = null;

    /* JADX INFO: renamed from: l */
    public volatile boolean f52080l = false;

    /* JADX INFO: renamed from: yf.a$a */
    public class a implements InterfaceC6477b {

        /* JADX INFO: renamed from: yf.a$a$a, reason: collision with other inner class name */
        public class RunnableC10689a implements Runnable {
            public RunnableC10689a() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                AbstractC10357a abstractC10357a = AbstractC10357a.this;
                synchronized (abstractC10357a) {
                    if (abstractC10357a.m19381v() && abstractC10357a.f52080l) {
                        abstractC10357a.f52080l = false;
                        abstractC10357a.m19371i(0L);
                    }
                }
            }
        }

        public a() {
        }

        @Override // p201jg.InterfaceC6477b
        /* JADX INFO: renamed from: b */
        public final void mo11769b() {
            ((C7360b) AbstractC10357a.this.f52069a).m14769f(new RunnableC10689a());
        }
    }

    /* JADX INFO: renamed from: yf.a$b */
    public class b implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ boolean f52083a;

        public b(boolean z10) {
            this.f52083a = z10;
        }

        @Override // java.lang.Runnable
        public final void run() {
            AbstractC10357a abstractC10357a = AbstractC10357a.this;
            InterfaceC10359c interfaceC10359c = abstractC10357a.f52071c;
            boolean z10 = this.f52083a;
            C8618d c8618d = (C8618d) interfaceC10359c;
            synchronized (c8618d) {
                C0076c c0076c = C8618d.f46102y;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(abstractC10357a.f52070b);
                sb2.append(" ");
                sb2.append(z10 ? "succeeded" : "failed");
                sb2.append(" at ");
                sb2.append(C5206f.m11023t1(c8618d.f46126x.f46127a));
                sb2.append(" seconds with a duration of ");
                sb2.append(C5206f.m11011j1(abstractC10357a.m19379r()));
                sb2.append(" seconds");
                c0076c.m457a(sb2.toString());
                if (!z10) {
                    c0076c.m459c("Job failed, aborting");
                    return;
                }
                if (abstractC10357a == c8618d.f46109g) {
                    c8618d.m16839p();
                    c8618d.m16840q();
                    return;
                }
                if (abstractC10357a == c8618d.f46110h) {
                    c8618d.m16836m();
                    c8618d.m16839p();
                    c8618d.m16834k(c8618d.f46111i);
                    c8618d.m16834k(c8618d.f46112j);
                    c8618d.m16834k(c8618d.f46113k);
                    c8618d.m16834k(c8618d.f46114l);
                    return;
                }
                C10363d c10363d = c8618d.f46111i;
                if (abstractC10357a != c10363d && abstractC10357a != c8618d.f46112j && abstractC10357a != c8618d.f46113k && abstractC10357a != c8618d.f46114l) {
                    if (abstractC10357a == c8618d.f46115m) {
                        c8618d.m16833j(c8618d.f46119q);
                        c8618d.m16834k(c8618d.f46116n);
                        return;
                    }
                    if (abstractC10357a == c8618d.f46116n) {
                        c8618d.m16834k(c8618d.f46117o);
                    }
                    if (abstractC10357a == c8618d.f46117o) {
                        c8618d.m16835l(false);
                        return;
                    }
                    if ((abstractC10357a instanceof C9004c) || abstractC10357a.f52070b.equals("JobProcessStandardDeeplink")) {
                        c8618d.m16837n(c8618d.f46120r);
                        return;
                    }
                    if (!(abstractC10357a instanceof C9003b) && !abstractC10357a.f52070b.equals("JobProcessDeferredDeeplink")) {
                        if ((abstractC10357a instanceof C8248c) || abstractC10357a.f52070b.equals("JobRetrieveInstallAttribution")) {
                            c8618d.m16837n(c8618d.f46119q);
                            return;
                        }
                        if (!(abstractC10357a instanceof C1387c) && !abstractC10357a.f52070b.equals("JobEvent")) {
                            if (!(abstractC10357a instanceof C10187c) && !abstractC10357a.f52070b.equals("JobUpdateInstall")) {
                                if (!(abstractC10357a instanceof C10186b) && !abstractC10357a.f52070b.equals("JobUpdateIdentityLink")) {
                                    if (abstractC10357a.f52070b.equals("JobPush")) {
                                        c8618d.m16837n(c8618d.f46123u);
                                        return;
                                    }
                                    return;
                                }
                                c8618d.m16837n(c8618d.f46125w);
                                return;
                            }
                            c8618d.m16836m();
                            c8618d.m16837n(c8618d.f46124v);
                            return;
                        }
                        c8618d.m16837n(c8618d.f46122t);
                        return;
                    }
                    c8618d.m16837n(c8618d.f46121s);
                    return;
                }
                if (c10363d.mo19370g() && c8618d.f46112j.mo19370g() && c8618d.f46113k.mo19370g() && c8618d.f46114l.mo19370g()) {
                    c8618d.m16836m();
                    StringBuilder sb3 = new StringBuilder("The install ");
                    sb3.append(c8618d.f46106d.m12186l().m12199h() ? "has already" : "has not yet");
                    sb3.append(" been sent");
                    C10489a.m19475a(c0076c, sb3.toString());
                    c8618d.m16834k(c8618d.f46115m);
                }
            }
        }
    }

    public AbstractC10357a(String str, InterfaceC7361c interfaceC7361c, TaskQueue taskQueue, InterfaceC10359c interfaceC10359c) {
        this.f52070b = str;
        this.f52069a = interfaceC7361c;
        this.f52071c = interfaceC10359c;
        C6476a c6476a = new C6476a(this);
        C7360b c7360b = (C7360b) interfaceC7361c;
        C7363e c7363e = c7360b.f41121b;
        Handler handler = c7363e.f41128b;
        Handler handler2 = c7363e.f41127a;
        ExecutorService executorService = C7363e.f41126e;
        if (executorService == null) {
            throw new RuntimeException("Failed to start threadpool");
        }
        this.f52073e = new C6670c(handler, handler2, executorService, taskQueue, c7360b, c6476a, this);
    }

    @Override // p509yf.InterfaceC10358b
    /* JADX INFO: renamed from: a */
    public final synchronized boolean mo19369a() {
        try {
            if (m19381v()) {
                return false;
            }
            return mo464u();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // p201jg.InterfaceC6477b
    /* JADX INFO: renamed from: b */
    public final void mo11769b() throws TaskFailedException {
        synchronized (this.f52072d) {
            mo462o();
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kg.InterfaceC6672e
    /* JADX INFO: renamed from: c */
    public final synchronized void mo11770c(boolean z10) {
        this.f52073e.m13291c();
        if (this.f52080l) {
            return;
        }
        if (z10 || this.f52078j < 0) {
            m19372j(z10);
        } else {
            this.f52077i++;
            m19371i(this.f52078j);
        }
    }

    @Override // p509yf.InterfaceC10358b
    /* JADX INFO: renamed from: g */
    public final boolean mo19370g() {
        return this.f52074f == JobState.Completed;
    }

    /* JADX INFO: renamed from: i */
    public final void m19371i(long j10) {
        this.f52073e.m13291c();
        this.f52074f = JobState.Started;
        this.f52078j = -1L;
        if (!mo464u()) {
            m19372j(true);
        } else if (j10 <= 0) {
            this.f52073e.m13294f(0L);
        } else {
            this.f52073e.m13294f(j10);
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m19372j(boolean z10) {
        this.f52076h = System.currentTimeMillis();
        this.f52073e.m13291c();
        this.f52074f = JobState.Completed;
        ((C7360b) this.f52069a).m14769f(new b(z10));
    }

    /* JADX INFO: renamed from: k */
    public final synchronized void m19373k() throws TaskFailedException {
        if (!m19381v()) {
            this.f52078j = -1L;
            throw new TaskFailedException("Job aborted due to not started");
        }
    }

    /* JADX INFO: renamed from: l */
    public final synchronized void m19374l() {
        try {
            JobState jobState = this.f52074f;
            JobState jobState2 = JobState.Pending;
            if (jobState == jobState2) {
                return;
            }
            this.f52074f = jobState2;
            this.f52075g = 0L;
            this.f52076h = 0L;
            this.f52073e.m13291c();
            synchronized (this) {
                try {
                    this.f52077i = 1;
                    this.f52078j = -1L;
                    this.f52080l = false;
                    C6670c c6670c = this.f52079k;
                    if (c6670c != null) {
                        c6670c.m13291c();
                        this.f52079k = null;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    /* JADX INFO: renamed from: m */
    public final synchronized void m19375m(boolean z10) {
        try {
            if (m19381v() && this.f52080l) {
                m19372j(z10);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: renamed from: n */
    public final synchronized void m19376n(long j10) {
        this.f52080l = false;
        C6670c c6670c = this.f52079k;
        if (c6670c != null) {
            c6670c.m13291c();
            this.f52079k = null;
        }
        m19380t();
        C6670c c6670cM14765b = ((C7360b) this.f52069a).m14765b(TaskQueue.IO, new C6476a(new a()));
        this.f52079k = c6670cM14765b;
        c6670cM14765b.m13294f(j10);
    }

    /* JADX INFO: renamed from: o */
    public abstract void mo462o() throws TaskFailedException;

    /* JADX INFO: renamed from: p */
    public final synchronized void m19377p(long j10) throws TaskFailedException {
        try {
            this.f52078j = j10;
            throw new TaskFailedException("Job failed and will retry after " + j10 + " milliseconds");
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: renamed from: q */
    public final synchronized void m19378q(long j10) {
        if (m19381v() && this.f52080l) {
            if (j10 < 0) {
                m19375m(false);
            } else {
                this.f52080l = false;
                C6670c c6670c = this.f52079k;
                if (c6670c != null) {
                    c6670c.m13291c();
                    this.f52079k = null;
                }
                this.f52077i++;
                m19371i(j10);
            }
        }
    }

    /* JADX INFO: renamed from: r */
    public final long m19379r() {
        long jCurrentTimeMillis;
        long j10;
        if (this.f52075g == 0) {
            return 0L;
        }
        if (this.f52076h == 0) {
            jCurrentTimeMillis = System.currentTimeMillis();
            j10 = this.f52075g;
        } else {
            jCurrentTimeMillis = this.f52076h;
            j10 = this.f52075g;
        }
        return jCurrentTimeMillis - j10;
    }

    /* JADX INFO: renamed from: s */
    public abstract long mo463s();

    @Override // p509yf.InterfaceC10358b
    public final synchronized void start() {
        if ((this.f52074f == JobState.Pending) || mo19370g()) {
            this.f52075g = System.currentTimeMillis();
            if (!mo464u()) {
                m19372j(true);
                return;
            }
            if (mo19370g()) {
                m19374l();
            }
            m19371i(mo463s());
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: t */
    public final synchronized void m19380t() {
        try {
            if (m19381v()) {
                this.f52080l = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: renamed from: u */
    public abstract boolean mo464u();

    /* JADX INFO: renamed from: v */
    public final boolean m19381v() {
        return this.f52074f == JobState.Started;
    }
}
