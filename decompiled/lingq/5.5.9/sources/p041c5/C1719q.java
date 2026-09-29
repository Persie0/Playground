package p041c5;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.work.C1243a;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.foreground.C1258a;
import androidx.work.impl.foreground.SystemForegroundService;
import androidx.work.impl.utils.futures.AbstractFuture;
import androidx.work.impl.utils.futures.C1268a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import p026b5.AbstractC1314g;
import p026b5.C1310c;
import p191j5.InterfaceC6408a;
import p214k5.C6610l;
import p214k5.C6617s;
import p214k5.InterfaceC6621w;
import p235l5.C7274u;
import p254m2.C7472a;
import p257m5.C7480b;
import p257m5.InterfaceC7479a;
import p260m8.C7499b;
import p532zd.InterfaceFutureC10478a;

/* JADX INFO: renamed from: c5.q */
/* JADX INFO: loaded from: classes.dex */
public final class C1719q implements InterfaceC1704d, InterfaceC6408a {

    /* JADX INFO: renamed from: H */
    public static final String f9536H = AbstractC1314g.m4868f("Processor");

    /* JADX INFO: renamed from: b */
    public final Context f9538b;

    /* JADX INFO: renamed from: c */
    public final C1243a f9539c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC7479a f9540d;

    /* JADX INFO: renamed from: e */
    public final WorkDatabase f9541e;

    /* JADX INFO: renamed from: i */
    public final List<InterfaceC1720r> f9545i;

    /* JADX INFO: renamed from: g */
    public final HashMap f9543g = new HashMap();

    /* JADX INFO: renamed from: f */
    public final HashMap f9542f = new HashMap();

    /* JADX INFO: renamed from: j */
    public final HashSet f9546j = new HashSet();

    /* JADX INFO: renamed from: k */
    public final ArrayList f9547k = new ArrayList();

    /* JADX INFO: renamed from: a */
    public PowerManager.WakeLock f9537a = null;

    /* JADX INFO: renamed from: l */
    public final Object f9548l = new Object();

    /* JADX INFO: renamed from: h */
    public final HashMap f9544h = new HashMap();

    /* JADX INFO: renamed from: c5.q$a */
    public static class a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final InterfaceC1704d f9549a;

        /* JADX INFO: renamed from: b */
        public final C6610l f9550b;

        /* JADX INFO: renamed from: c */
        public final InterfaceFutureC10478a<Boolean> f9551c;

        public a(InterfaceC1704d interfaceC1704d, C6610l c6610l, C1268a c1268a) {
            this.f9549a = interfaceC1704d;
            this.f9550b = c6610l;
            this.f9551c = c1268a;
        }

        @Override // java.lang.Runnable
        public final void run() {
            boolean zBooleanValue;
            try {
                zBooleanValue = this.f9551c.get().booleanValue();
            } catch (InterruptedException | ExecutionException unused) {
                zBooleanValue = true;
            }
            this.f9549a.mo4730e(this.f9550b, zBooleanValue);
        }
    }

    public C1719q(Context context, C1243a c1243a, C7480b c7480b, WorkDatabase workDatabase, List list) {
        this.f9538b = context;
        this.f9539c = c1243a;
        this.f9540d = c7480b;
        this.f9541e = workDatabase;
        this.f9545i = list;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m5453b(RunnableC1707e0 runnableC1707e0, String str) {
        if (runnableC1707e0 == null) {
            AbstractC1314g.m4867d().mo4869a(f9536H, "WorkerWrapper could not be found for " + str);
            return false;
        }
        runnableC1707e0.f9498L = true;
        runnableC1707e0.m5451h();
        runnableC1707e0.f9497K.cancel(true);
        if (runnableC1707e0.f9503e == null || !(runnableC1707e0.f9497K.f7924a instanceof AbstractFuture.C1262b)) {
            AbstractC1314g.m4867d().mo4869a(RunnableC1707e0.f9493M, "WorkSpec " + runnableC1707e0.f9502d + " is already done. Not interrupting.");
        } else {
            runnableC1707e0.f9503e.m4711e();
        }
        AbstractC1314g.m4867d().mo4869a(f9536H, "WorkerWrapper interrupted for " + str);
        return true;
    }

    /* JADX INFO: renamed from: a */
    public final void m5454a(InterfaceC1704d interfaceC1704d) {
        synchronized (this.f9548l) {
            this.f9547k.add(interfaceC1704d);
        }
    }

    /* JADX INFO: renamed from: c */
    public final boolean m5455c(String str) {
        boolean z10;
        synchronized (this.f9548l) {
            z10 = this.f9543g.containsKey(str) || this.f9542f.containsKey(str);
        }
        return z10;
    }

    /* JADX INFO: renamed from: d */
    public final void m5456d(final C6610l c6610l) {
        ((C7480b) this.f9540d).f41354c.execute(new Runnable() { // from class: c5.p

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ boolean f9535c = false;

            @Override // java.lang.Runnable
            public final void run() {
                this.f9533a.mo4730e(c6610l, this.f9535c);
            }
        });
    }

    @Override // p041c5.InterfaceC1704d
    /* JADX INFO: renamed from: e */
    public final void mo4730e(C6610l c6610l, boolean z10) {
        synchronized (this.f9548l) {
            RunnableC1707e0 runnableC1707e0 = (RunnableC1707e0) this.f9543g.get(c6610l.f37514a);
            if (runnableC1707e0 != null && c6610l.equals(C7499b.m14892A(runnableC1707e0.f9502d))) {
                this.f9543g.remove(c6610l.f37514a);
            }
            AbstractC1314g.m4867d().mo4869a(f9536H, C1719q.class.getSimpleName() + " " + c6610l.f37514a + " executed; reschedule = " + z10);
            Iterator it = this.f9547k.iterator();
            while (it.hasNext()) {
                ((InterfaceC1704d) it.next()).mo4730e(c6610l, z10);
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m5457f(String str, C1310c c1310c) {
        synchronized (this.f9548l) {
            AbstractC1314g.m4867d().mo4872e(f9536H, "Moving WorkSpec (" + str + ") to the foreground");
            RunnableC1707e0 runnableC1707e0 = (RunnableC1707e0) this.f9543g.remove(str);
            if (runnableC1707e0 != null) {
                if (this.f9537a == null) {
                    PowerManager.WakeLock wakeLockM14661a = C7274u.m14661a(this.f9538b, "ProcessorForegroundLck");
                    this.f9537a = wakeLockM14661a;
                    wakeLockM14661a.acquire();
                }
                this.f9542f.put(str, runnableC1707e0);
                Intent intentM4749b = C1258a.m4749b(this.f9538b, C7499b.m14892A(runnableC1707e0.f9502d), c1310c);
                Context context = this.f9538b;
                Object obj = C7472a.f41322a;
                C7472a.f.m14858b(context, intentM4749b);
            }
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: g */
    public final boolean m5458g(C1722t c1722t, WorkerParameters.C1242a c1242a) {
        C6610l c6610l = c1722t.f9553a;
        final String str = c6610l.f37514a;
        final ArrayList arrayList = new ArrayList();
        C6617s c6617s = (C6617s) this.f9541e.m4567r(new Callable() { // from class: c5.o
            @Override // java.util.concurrent.Callable
            public final Object call() {
                WorkDatabase workDatabase = this.f9530a.f9541e;
                InterfaceC6621w interfaceC6621wMo4712A = workDatabase.mo4712A();
                String str2 = str;
                arrayList.addAll(interfaceC6621wMo4712A.mo13244a(str2));
                return workDatabase.mo4718z().mo13237o(str2);
            }
        });
        if (c6617s == null) {
            AbstractC1314g.m4867d().mo4873g(f9536H, "Didn't find WorkSpec for id " + c6610l);
            m5456d(c6610l);
            return false;
        }
        synchronized (this.f9548l) {
            try {
                if (m5455c(str)) {
                    Set set = (Set) this.f9544h.get(str);
                    if (((C1722t) set.iterator().next()).f9553a.f37515b == c6610l.f37515b) {
                        set.add(c1722t);
                        AbstractC1314g.m4867d().mo4869a(f9536H, "Work " + c6610l + " is already enqueued for processing");
                    } else {
                        m5456d(c6610l);
                    }
                    return false;
                }
                if (c6617s.f37543t != c6610l.f37515b) {
                    m5456d(c6610l);
                    return false;
                }
                RunnableC1707e0.a aVar = new RunnableC1707e0.a(this.f9538b, this.f9539c, this.f9540d, this, this.f9541e, c6617s, arrayList);
                aVar.f9517g = this.f9545i;
                if (c1242a != null) {
                    aVar.f9519i = c1242a;
                }
                RunnableC1707e0 runnableC1707e0 = new RunnableC1707e0(aVar);
                C1268a<Boolean> c1268a = runnableC1707e0.f9496J;
                c1268a.mo2629f(new a(this, c1722t.f9553a, c1268a), ((C7480b) this.f9540d).f41354c);
                this.f9543g.put(str, runnableC1707e0);
                HashSet hashSet = new HashSet();
                hashSet.add(c1722t);
                this.f9544h.put(str, hashSet);
                ((C7480b) this.f9540d).f41352a.execute(runnableC1707e0);
                AbstractC1314g.m4867d().mo4869a(f9536H, C1719q.class.getSimpleName() + ": processing " + c6610l);
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m5459h() {
        synchronized (this.f9548l) {
            if (!(!this.f9542f.isEmpty())) {
                Context context = this.f9538b;
                String str = C1258a.f7899j;
                Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
                intent.setAction("ACTION_STOP_FOREGROUND");
                try {
                    this.f9538b.startService(intent);
                } catch (Throwable th2) {
                    AbstractC1314g.m4867d().mo4871c(f9536H, "Unable to stop foreground service", th2);
                }
                PowerManager.WakeLock wakeLock = this.f9537a;
                if (wakeLock != null) {
                    wakeLock.release();
                    this.f9537a = null;
                }
            }
            throw th;
        }
    }
}
