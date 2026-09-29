package p442vo;

import dm.C5207g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import sl.C9072e;
import to.C9347b;
import to.ThreadFactoryC9346a;

/* JADX INFO: renamed from: vo.d */
/* JADX INFO: loaded from: classes2.dex */
public final class C9768d {

    /* JADX INFO: renamed from: h */
    public static final b f49840h = new b();

    /* JADX INFO: renamed from: i */
    public static final C9768d f49841i;

    /* JADX INFO: renamed from: j */
    public static final Logger f49842j;

    /* JADX INFO: renamed from: a */
    public final a f49843a;

    /* JADX INFO: renamed from: c */
    public boolean f49845c;

    /* JADX INFO: renamed from: d */
    public long f49846d;

    /* JADX INFO: renamed from: b */
    public int f49844b = 10000;

    /* JADX INFO: renamed from: e */
    public final ArrayList f49847e = new ArrayList();

    /* JADX INFO: renamed from: f */
    public final ArrayList f49848f = new ArrayList();

    /* JADX INFO: renamed from: g */
    public final RunnableC9769e f49849g = new RunnableC9769e(this);

    /* JADX INFO: renamed from: vo.d$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo18267a(C9768d c9768d, long j10);

        /* JADX INFO: renamed from: b */
        void mo18268b(C9768d c9768d);

        /* JADX INFO: renamed from: c */
        long mo18269c();

        void execute(Runnable runnable);
    }

    /* JADX INFO: renamed from: vo.d$b */
    public static final class b {
    }

    /* JADX INFO: renamed from: vo.d$c */
    public static final class c implements a {

        /* JADX INFO: renamed from: a */
        public final ThreadPoolExecutor f49850a;

        public c(ThreadFactoryC9346a threadFactoryC9346a) {
            this.f49850a = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), threadFactoryC9346a);
        }

        @Override // p442vo.C9768d.a
        /* JADX INFO: renamed from: a */
        public final void mo18267a(C9768d c9768d, long j10) throws InterruptedException {
            C5207g.m11111f(c9768d, "taskRunner");
            long j11 = j10 / 1000000;
            long j12 = j10 - (1000000 * j11);
            if (j11 > 0 || j10 > 0) {
                c9768d.wait(j11, (int) j12);
            }
        }

        @Override // p442vo.C9768d.a
        /* JADX INFO: renamed from: b */
        public final void mo18268b(C9768d c9768d) {
            C5207g.m11111f(c9768d, "taskRunner");
            c9768d.notify();
        }

        @Override // p442vo.C9768d.a
        /* JADX INFO: renamed from: c */
        public final long mo18269c() {
            return System.nanoTime();
        }

        @Override // p442vo.C9768d.a
        public final void execute(Runnable runnable) {
            C5207g.m11111f(runnable, "runnable");
            this.f49850a.execute(runnable);
        }
    }

    static {
        String strM11116k = C5207g.m11116k(" TaskRunner", C9347b.f48088g);
        C5207g.m11111f(strM11116k, "name");
        f49841i = new C9768d(new c(new ThreadFactoryC9346a(strM11116k, true)));
        Logger logger = Logger.getLogger(C9768d.class.getName());
        C5207g.m11110e(logger, "getLogger(TaskRunner::class.java.name)");
        f49842j = logger;
    }

    public C9768d(c cVar) {
        this.f49843a = cVar;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: a */
    public static final void m18261a(C9768d c9768d, AbstractC9765a abstractC9765a) {
        c9768d.getClass();
        byte[] bArr = C9347b.f48082a;
        Thread threadCurrentThread = Thread.currentThread();
        String name = threadCurrentThread.getName();
        threadCurrentThread.setName(abstractC9765a.f49829a);
        try {
            long jMo18071a = abstractC9765a.mo18071a();
            synchronized (c9768d) {
                c9768d.m18262b(abstractC9765a, jMo18071a);
                C9072e c9072e = C9072e.f47360a;
            }
            threadCurrentThread.setName(name);
        } catch (Throwable th2) {
            synchronized (c9768d) {
                try {
                    c9768d.m18262b(abstractC9765a, -1L);
                    C9072e c9072e2 = C9072e.f47360a;
                    threadCurrentThread.setName(name);
                    throw th2;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: b */
    public final void m18262b(AbstractC9765a abstractC9765a, long j10) {
        byte[] bArr = C9347b.f48082a;
        C9767c c9767c = abstractC9765a.f49831c;
        C5207g.m11108c(c9767c);
        if (!(c9767c.f49837d == abstractC9765a)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        boolean z10 = c9767c.f49839f;
        c9767c.f49839f = false;
        c9767c.f49837d = null;
        this.f49847e.remove(c9767c);
        if (j10 != -1 && !z10 && !c9767c.f49836c) {
            c9767c.m18259e(abstractC9765a, j10, true);
        }
        if (!c9767c.f49838e.isEmpty()) {
            this.f49848f.add(c9767c);
        }
    }

    /* JADX INFO: renamed from: c */
    public final AbstractC9765a m18263c() {
        long j10;
        boolean z10;
        byte[] bArr = C9347b.f48082a;
        while (true) {
            ArrayList arrayList = this.f49848f;
            if (arrayList.isEmpty()) {
                return null;
            }
            a aVar = this.f49843a;
            long jMo18269c = aVar.mo18269c();
            Iterator it = arrayList.iterator();
            long jMin = Long.MAX_VALUE;
            AbstractC9765a abstractC9765a = null;
            while (true) {
                if (!it.hasNext()) {
                    j10 = jMo18269c;
                    z10 = false;
                    break;
                }
                AbstractC9765a abstractC9765a2 = (AbstractC9765a) ((C9767c) it.next()).f49838e.get(0);
                j10 = jMo18269c;
                long jMax = Math.max(0L, abstractC9765a2.f49832d - jMo18269c);
                if (jMax > 0) {
                    jMin = Math.min(jMax, jMin);
                } else {
                    if (abstractC9765a != null) {
                        z10 = true;
                        break;
                    }
                    abstractC9765a = abstractC9765a2;
                }
                jMo18269c = j10;
            }
            if (abstractC9765a != null) {
                byte[] bArr2 = C9347b.f48082a;
                abstractC9765a.f49832d = -1L;
                C9767c c9767c = abstractC9765a.f49831c;
                C5207g.m11108c(c9767c);
                c9767c.f49838e.remove(abstractC9765a);
                arrayList.remove(c9767c);
                c9767c.f49837d = abstractC9765a;
                this.f49847e.add(c9767c);
                if (z10 || (!this.f49845c && (!arrayList.isEmpty()))) {
                    aVar.execute(this.f49849g);
                }
                return abstractC9765a;
            }
            if (this.f49845c) {
                if (jMin >= this.f49846d - j10) {
                    return null;
                }
                aVar.mo18268b(this);
                return null;
            }
            this.f49845c = true;
            this.f49846d = j10 + jMin;
            try {
                try {
                    aVar.mo18267a(this, jMin);
                } catch (InterruptedException unused) {
                    m18264d();
                }
                this.f49845c = false;
            } catch (Throwable th2) {
                this.f49845c = false;
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m18264d() {
        ArrayList arrayList = this.f49847e;
        int size = arrayList.size() - 1;
        if (size >= 0) {
            while (true) {
                int i10 = size - 1;
                ((C9767c) arrayList.get(size)).m18257b();
                if (i10 < 0) {
                    break;
                } else {
                    size = i10;
                }
            }
        }
        ArrayList arrayList2 = this.f49848f;
        int size2 = arrayList2.size() - 1;
        if (size2 < 0) {
            return;
        }
        while (true) {
            int i11 = size2 - 1;
            C9767c c9767c = (C9767c) arrayList2.get(size2);
            c9767c.m18257b();
            if (c9767c.f49838e.isEmpty()) {
                arrayList2.remove(size2);
            }
            if (i11 < 0) {
                return;
            } else {
                size2 = i11;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m18265e(C9767c c9767c) {
        C5207g.m11111f(c9767c, "taskQueue");
        byte[] bArr = C9347b.f48082a;
        if (c9767c.f49837d == null) {
            boolean z10 = !c9767c.f49838e.isEmpty();
            ArrayList arrayList = this.f49848f;
            if (z10) {
                C5207g.m11111f(arrayList, "<this>");
                if (!arrayList.contains(c9767c)) {
                    arrayList.add(c9767c);
                }
            } else {
                arrayList.remove(c9767c);
            }
        }
        boolean z11 = this.f49845c;
        a aVar = this.f49843a;
        if (z11) {
            aVar.mo18268b(this);
        } else {
            aVar.execute(this.f49849g);
        }
    }

    /* JADX INFO: renamed from: f */
    public final C9767c m18266f() {
        int i10;
        synchronized (this) {
            i10 = this.f49844b;
            this.f49844b = i10 + 1;
        }
        return new C9767c(this, C5207g.m11116k(Integer.valueOf(i10), "Q"));
    }
}
