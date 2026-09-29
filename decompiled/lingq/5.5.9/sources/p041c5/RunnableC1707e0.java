package p041c5;

import android.content.Context;
import androidx.activity.result.C0204c;
import androidx.work.AbstractC1246d;
import androidx.work.C1243a;
import androidx.work.C1244b;
import androidx.work.WorkInfo$State;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import androidx.work.impl.utils.futures.C1268a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Executor;
import p026b5.AbstractC1312e;
import p026b5.AbstractC1314g;
import p026b5.AbstractC1320m;
import p026b5.C1313f;
import p080e.RunnableC5286r;
import p191j5.InterfaceC6408a;
import p214k5.C6617s;
import p214k5.InterfaceC6600b;
import p214k5.InterfaceC6618t;
import p235l5.C7267n;
import p235l5.C7278y;
import p235l5.ExecutorC7273t;
import p235l5.RunnableC7276w;
import p257m5.C7480b;
import p257m5.InterfaceC7479a;

/* JADX INFO: renamed from: c5.e0 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1707e0 implements Runnable {

    /* JADX INFO: renamed from: M */
    public static final String f9493M = AbstractC1314g.m4868f("WorkerWrapper");

    /* JADX INFO: renamed from: H */
    public final List<String> f9494H;

    /* JADX INFO: renamed from: I */
    public String f9495I;

    /* JADX INFO: renamed from: L */
    public volatile boolean f9498L;

    /* JADX INFO: renamed from: a */
    public final Context f9499a;

    /* JADX INFO: renamed from: b */
    public final String f9500b;

    /* JADX INFO: renamed from: c */
    public final List<InterfaceC1720r> f9501c;

    /* JADX INFO: renamed from: d */
    public final C6617s f9502d;

    /* JADX INFO: renamed from: e */
    public AbstractC1246d f9503e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC7479a f9504f;

    /* JADX INFO: renamed from: h */
    public final C1243a f9506h;

    /* JADX INFO: renamed from: i */
    public final InterfaceC6408a f9507i;

    /* JADX INFO: renamed from: j */
    public final WorkDatabase f9508j;

    /* JADX INFO: renamed from: k */
    public final InterfaceC6618t f9509k;

    /* JADX INFO: renamed from: l */
    public final InterfaceC6600b f9510l;

    /* JADX INFO: renamed from: g */
    public AbstractC1246d.a f9505g = new AbstractC1246d.a.C10594a();

    /* JADX INFO: renamed from: J */
    public final C1268a<Boolean> f9496J = new C1268a<>();

    /* JADX INFO: renamed from: K */
    public final C1268a<AbstractC1246d.a> f9497K = new C1268a<>();

    /* JADX INFO: renamed from: c5.e0$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public final Context f9511a;

        /* JADX INFO: renamed from: b */
        public final InterfaceC6408a f9512b;

        /* JADX INFO: renamed from: c */
        public final InterfaceC7479a f9513c;

        /* JADX INFO: renamed from: d */
        public final C1243a f9514d;

        /* JADX INFO: renamed from: e */
        public final WorkDatabase f9515e;

        /* JADX INFO: renamed from: f */
        public final C6617s f9516f;

        /* JADX INFO: renamed from: g */
        public List<InterfaceC1720r> f9517g;

        /* JADX INFO: renamed from: h */
        public final List<String> f9518h;

        /* JADX INFO: renamed from: i */
        public WorkerParameters.C1242a f9519i = new WorkerParameters.C1242a();

        public a(Context context, C1243a c1243a, InterfaceC7479a interfaceC7479a, InterfaceC6408a interfaceC6408a, WorkDatabase workDatabase, C6617s c6617s, ArrayList arrayList) {
            this.f9511a = context.getApplicationContext();
            this.f9513c = interfaceC7479a;
            this.f9512b = interfaceC6408a;
            this.f9514d = c1243a;
            this.f9515e = workDatabase;
            this.f9516f = c6617s;
            this.f9518h = arrayList;
        }
    }

    public RunnableC1707e0(a aVar) {
        this.f9499a = aVar.f9511a;
        this.f9504f = aVar.f9513c;
        this.f9507i = aVar.f9512b;
        C6617s c6617s = aVar.f9516f;
        this.f9502d = c6617s;
        this.f9500b = c6617s.f37524a;
        this.f9501c = aVar.f9517g;
        WorkerParameters.C1242a c1242a = aVar.f9519i;
        this.f9503e = null;
        this.f9506h = aVar.f9514d;
        WorkDatabase workDatabase = aVar.f9515e;
        this.f9508j = workDatabase;
        this.f9509k = workDatabase.mo4718z();
        this.f9510l = workDatabase.mo4713u();
        this.f9494H = aVar.f9518h;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: a */
    public final void m5444a(AbstractC1246d.a aVar) {
        boolean z10 = aVar instanceof AbstractC1246d.a.c;
        C6617s c6617s = this.f9502d;
        String str = f9493M;
        if (!z10) {
            if (aVar instanceof AbstractC1246d.a.b) {
                AbstractC1314g.m4867d().mo4872e(str, "Worker result RETRY for " + this.f9495I);
                m5446c();
                return;
            }
            AbstractC1314g.m4867d().mo4872e(str, "Worker result FAILURE for " + this.f9495I);
            if (c6617s.m13222c()) {
                m5447d();
                return;
            } else {
                m5450g();
                return;
            }
        }
        AbstractC1314g.m4867d().mo4872e(str, "Worker result SUCCESS for " + this.f9495I);
        if (c6617s.m13222c()) {
            m5447d();
            return;
        }
        InterfaceC6600b interfaceC6600b = this.f9510l;
        String str2 = this.f9500b;
        InterfaceC6618t interfaceC6618t = this.f9509k;
        WorkDatabase workDatabase = this.f9508j;
        workDatabase.m4552c();
        try {
            interfaceC6618t.mo13230h(WorkInfo$State.SUCCEEDED, str2);
            interfaceC6618t.mo13232j(str2, ((AbstractC1246d.a.c) this.f9505g).f7833a);
            long jCurrentTimeMillis = System.currentTimeMillis();
            while (true) {
                for (String str3 : interfaceC6600b.mo13203a(str2)) {
                    if (interfaceC6618t.mo13236n(str3) == WorkInfo$State.BLOCKED && interfaceC6600b.mo13204b(str3)) {
                        AbstractC1314g.m4867d().mo4872e(str, "Setting status to enqueued for " + str3);
                        interfaceC6618t.mo13230h(WorkInfo$State.ENQUEUED, str3);
                        interfaceC6618t.mo13239q(str3, jCurrentTimeMillis);
                    }
                }
                workDatabase.m4568s();
                workDatabase.m4563n();
                return;
            }
        } finally {
            workDatabase.m4563n();
            m5448e(false);
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: b */
    public final void m5445b() {
        boolean zM5451h = m5451h();
        String str = this.f9500b;
        WorkDatabase workDatabase = this.f9508j;
        if (!zM5451h) {
            workDatabase.m4552c();
            try {
                WorkInfo$State workInfo$StateMo13236n = this.f9509k.mo13236n(str);
                workDatabase.mo4717y().mo13218a(str);
                if (workInfo$StateMo13236n == null) {
                    m5448e(false);
                } else if (workInfo$StateMo13236n == WorkInfo$State.RUNNING) {
                    m5444a(this.f9505g);
                } else if (!workInfo$StateMo13236n.isFinished()) {
                    m5446c();
                }
                workDatabase.m4568s();
                workDatabase.m4563n();
            } catch (Throwable th2) {
                workDatabase.m4563n();
                throw th2;
            }
        }
        List<InterfaceC1720r> list = this.f9501c;
        if (list != null) {
            Iterator<InterfaceC1720r> it = list.iterator();
            while (it.hasNext()) {
                it.next().mo5462c(str);
            }
            C1721s.m5463a(this.f9506h, workDatabase, list);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m5446c() {
        String str = this.f9500b;
        InterfaceC6618t interfaceC6618t = this.f9509k;
        WorkDatabase workDatabase = this.f9508j;
        workDatabase.m4552c();
        try {
            interfaceC6618t.mo13230h(WorkInfo$State.ENQUEUED, str);
            interfaceC6618t.mo13239q(str, System.currentTimeMillis());
            interfaceC6618t.mo13226d(str, -1L);
            workDatabase.m4568s();
            workDatabase.m4563n();
            m5448e(true);
        } catch (Throwable th2) {
            workDatabase.m4563n();
            m5448e(true);
            throw th2;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: d */
    public final void m5447d() {
        String str = this.f9500b;
        InterfaceC6618t interfaceC6618t = this.f9509k;
        WorkDatabase workDatabase = this.f9508j;
        workDatabase.m4552c();
        try {
            interfaceC6618t.mo13239q(str, System.currentTimeMillis());
            interfaceC6618t.mo13230h(WorkInfo$State.ENQUEUED, str);
            interfaceC6618t.mo13238p(str);
            interfaceC6618t.mo13225c(str);
            interfaceC6618t.mo13226d(str, -1L);
            workDatabase.m4568s();
            workDatabase.m4563n();
            m5448e(false);
        } catch (Throwable th2) {
            workDatabase.m4563n();
            m5448e(false);
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0078  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: e */
    public final void m5448e(boolean z10) {
        boolean zContainsKey;
        this.f9508j.m4552c();
        try {
            if (!this.f9508j.mo4718z().mo13234l()) {
                C7267n.m14658a(this.f9499a, RescheduleReceiver.class, false);
            }
            if (z10) {
                this.f9509k.mo13230h(WorkInfo$State.ENQUEUED, this.f9500b);
                this.f9509k.mo13226d(this.f9500b, -1L);
            }
            if (this.f9502d != null && this.f9503e != null) {
                InterfaceC6408a interfaceC6408a = this.f9507i;
                String str = this.f9500b;
                C1719q c1719q = (C1719q) interfaceC6408a;
                synchronized (c1719q.f9548l) {
                    zContainsKey = c1719q.f9542f.containsKey(str);
                }
                if (zContainsKey) {
                    InterfaceC6408a interfaceC6408a2 = this.f9507i;
                    String str2 = this.f9500b;
                    C1719q c1719q2 = (C1719q) interfaceC6408a2;
                    synchronized (c1719q2.f9548l) {
                        try {
                            c1719q2.f9542f.remove(str2);
                            c1719q2.m5459h();
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
            }
            this.f9508j.m4568s();
            this.f9508j.m4563n();
            this.f9496J.m4766i(Boolean.valueOf(z10));
        } catch (Throwable th3) {
            this.f9508j.m4563n();
            throw th3;
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m5449f() {
        InterfaceC6618t interfaceC6618t = this.f9509k;
        String str = this.f9500b;
        WorkInfo$State workInfo$StateMo13236n = interfaceC6618t.mo13236n(str);
        WorkInfo$State workInfo$State = WorkInfo$State.RUNNING;
        String str2 = f9493M;
        if (workInfo$StateMo13236n == workInfo$State) {
            AbstractC1314g.m4867d().mo4869a(str2, "Status for " + str + " is RUNNING; not doing any work and rescheduling for later execution");
            m5448e(true);
            return;
        }
        AbstractC1314g.m4867d().mo4869a(str2, "Status for " + str + " is " + workInfo$StateMo13236n + " ; not doing any work");
        m5448e(false);
    }

    /* JADX INFO: renamed from: g */
    public final void m5450g() {
        String str = this.f9500b;
        WorkDatabase workDatabase = this.f9508j;
        workDatabase.m4552c();
        try {
            LinkedList linkedList = new LinkedList();
            linkedList.add(str);
            while (true) {
                boolean zIsEmpty = linkedList.isEmpty();
                InterfaceC6618t interfaceC6618t = this.f9509k;
                if (zIsEmpty) {
                    interfaceC6618t.mo13232j(str, ((AbstractC1246d.a.C10594a) this.f9505g).f7832a);
                    workDatabase.m4568s();
                    workDatabase.m4563n();
                    m5448e(false);
                    return;
                }
                String str2 = (String) linkedList.remove();
                if (interfaceC6618t.mo13236n(str2) != WorkInfo$State.CANCELLED) {
                    interfaceC6618t.mo13230h(WorkInfo$State.FAILED, str2);
                }
                linkedList.addAll(this.f9510l.mo13203a(str2));
            }
        } catch (Throwable th2) {
            workDatabase.m4563n();
            m5448e(false);
            throw th2;
        }
    }

    /* JADX INFO: renamed from: h */
    public final boolean m5451h() {
        if (!this.f9498L) {
            return false;
        }
        AbstractC1314g.m4867d().mo4869a(f9493M, "Work interrupted for " + this.f9495I);
        WorkInfo$State workInfo$StateMo13236n = this.f9509k.mo13236n(this.f9500b);
        if (workInfo$StateMo13236n == null) {
            m5448e(false);
        } else {
            m5448e(!workInfo$StateMo13236n.isFinished());
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x008b A[Catch: all -> 0x0216, TryCatch #1 {all -> 0x0216, blocks: (B:14:0x004f, B:17:0x0059, B:18:0x0078, B:20:0x007e, B:22:0x0082, B:31:0x00b3, B:27:0x008b, B:29:0x0097), top: B:75:0x004f }] */
    /* JADX WARN: Code duplicated, block: B:29:0x0097 A[Catch: all -> 0x0216, TRY_LEAVE, TryCatch #1 {all -> 0x0216, blocks: (B:14:0x004f, B:17:0x0059, B:18:0x0078, B:20:0x007e, B:22:0x0082, B:31:0x00b3, B:27:0x008b, B:29:0x0097), top: B:75:0x004f }] */
    @Override // java.lang.Runnable
    public final void run() {
        AbstractC1312e abstractC1312e;
        C1244b c1244bMo4694a;
        StringBuilder sb2 = new StringBuilder("Work [ id=");
        String str = this.f9500b;
        sb2.append(str);
        sb2.append(", tags={ ");
        boolean z10 = true;
        for (String str2 : this.f9494H) {
            if (z10) {
                z10 = false;
            } else {
                sb2.append(", ");
            }
            sb2.append(str2);
        }
        sb2.append(" } ]");
        this.f9495I = sb2.toString();
        C6617s c6617s = this.f9502d;
        if (m5451h()) {
            return;
        }
        WorkDatabase workDatabase = this.f9508j;
        workDatabase.m4552c();
        try {
            WorkInfo$State workInfo$State = c6617s.f37525b;
            WorkInfo$State workInfo$State2 = WorkInfo$State.ENQUEUED;
            String str3 = c6617s.f37526c;
            String str4 = f9493M;
            if (workInfo$State == workInfo$State2) {
                if (!c6617s.m13222c()) {
                    if (c6617s.f37525b == workInfo$State2 && c6617s.f37534k > 0) {
                        if (System.currentTimeMillis() < c6617s.m13220a()) {
                            AbstractC1314g.m4867d().mo4869a(str4, String.format("Delaying execution for %s because it is being executed before schedule.", str3));
                            m5448e(true);
                            workDatabase.m4568s();
                        }
                    }
                } else if (System.currentTimeMillis() < c6617s.m13220a()) {
                    AbstractC1314g.m4867d().mo4869a(str4, String.format("Delaying execution for %s because it is being executed before schedule.", str3));
                    m5448e(true);
                    workDatabase.m4568s();
                }
                workDatabase.m4568s();
                workDatabase.m4563n();
                boolean zM13222c = c6617s.m13222c();
                InterfaceC6618t interfaceC6618t = this.f9509k;
                C1243a c1243a = this.f9506h;
                if (zM13222c) {
                    c1244bMo4694a = c6617s.f37528e;
                } else {
                    C1313f c1313f = c1243a.f7813d;
                    String str5 = c6617s.f37527d;
                    c1313f.getClass();
                    String str6 = AbstractC1312e.f8059a;
                    try {
                        abstractC1312e = (AbstractC1312e) Class.forName(str5).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                    } catch (Exception e10) {
                        AbstractC1314g.m4867d().mo4871c(AbstractC1312e.f8059a, C0204c.m852k("Trouble instantiating + ", str5), e10);
                        abstractC1312e = null;
                    }
                    if (abstractC1312e == null) {
                        AbstractC1314g.m4867d().mo4870b(str4, "Could not create Input Merger " + c6617s.f37527d);
                        m5450g();
                        return;
                    }
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(c6617s.f37528e);
                    arrayList.addAll(interfaceC6618t.mo13240r(str));
                    c1244bMo4694a = abstractC1312e.mo4694a(arrayList);
                }
                C1244b c1244b = c1244bMo4694a;
                UUID uuidFromString = UUID.fromString(str);
                List<String> list = this.f9494H;
                int i10 = c6617s.f37534k;
                Executor executor = c1243a.f7810a;
                InterfaceC7479a interfaceC7479a = this.f9504f;
                AbstractC1320m abstractC1320m = c1243a.f7812c;
                InterfaceC6408a interfaceC6408a = this.f9507i;
                InterfaceC7479a interfaceC7479a2 = this.f9504f;
                WorkerParameters workerParameters = new WorkerParameters(uuidFromString, c1244b, list, i10, executor, interfaceC7479a, abstractC1320m, new C7278y(workDatabase, interfaceC6408a, interfaceC7479a2));
                if (this.f9503e == null) {
                    this.f9503e = c1243a.f7812c.m4882b(this.f9499a, str3, workerParameters);
                }
                AbstractC1246d abstractC1246d = this.f9503e;
                if (abstractC1246d == null) {
                    AbstractC1314g.m4867d().mo4870b(str4, "Could not create Worker " + str3);
                    m5450g();
                    return;
                }
                if (abstractC1246d.f7831d) {
                    AbstractC1314g.m4867d().mo4870b(str4, "Received an already-used Worker " + str3 + "; Worker Factory should return new instances");
                    m5450g();
                    return;
                }
                boolean z11 = true;
                abstractC1246d.f7831d = true;
                workDatabase.m4552c();
                try {
                    if (interfaceC6618t.mo13236n(str) == WorkInfo$State.ENQUEUED) {
                        interfaceC6618t.mo13230h(WorkInfo$State.RUNNING, str);
                        interfaceC6618t.mo13241s(str);
                    } else {
                        z11 = false;
                    }
                    workDatabase.m4568s();
                    workDatabase.m4563n();
                    if (!z11) {
                        m5449f();
                        return;
                    }
                    if (m5451h()) {
                        return;
                    }
                    RunnableC7276w runnableC7276w = new RunnableC7276w(this.f9499a, this.f9502d, this.f9503e, workerParameters.f7807g, this.f9504f);
                    C7480b c7480b = (C7480b) interfaceC7479a2;
                    c7480b.f41354c.execute(runnableC7276w);
                    C1268a<Void> c1268a = runnableC7276w.f40777a;
                    RunnableC5286r runnableC5286r = new RunnableC5286r(this, 5, c1268a);
                    ExecutorC7273t executorC7273t = new ExecutorC7273t();
                    C1268a<AbstractC1246d.a> c1268a2 = this.f9497K;
                    c1268a2.mo2629f(runnableC5286r, executorC7273t);
                    c1268a.mo2629f(new RunnableC1703c0(this, c1268a), c7480b.f41354c);
                    c1268a2.mo2629f(new RunnableC1705d0(this, this.f9495I), c7480b.f41352a);
                    return;
                } catch (Throwable th2) {
                    workDatabase.m4563n();
                    throw th2;
                }
            }
            m5449f();
            workDatabase.m4568s();
            AbstractC1314g.m4867d().mo4869a(str4, str3 + " is not in ENQUEUED state. Nothing more to do");
            workDatabase.m4563n();
        } catch (Throwable th3) {
            workDatabase.m4563n();
            throw th3;
        }
    }
}
