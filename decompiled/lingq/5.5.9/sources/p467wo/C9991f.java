package p467wo;

import dm.C5207g;
import java.lang.ref.Reference;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import okhttp3.internal.connection.C8077a;
import p034bp.C1640h;
import p442vo.AbstractC9765a;
import p442vo.C9767c;
import p442vo.C9768d;
import sl.C9072e;
import so.C9082a;
import so.C9083a0;
import to.C9347b;

/* JADX INFO: renamed from: wo.f */
/* JADX INFO: loaded from: classes2.dex */
public final class C9991f {

    /* JADX INFO: renamed from: a */
    public final int f50791a;

    /* JADX INFO: renamed from: b */
    public final long f50792b;

    /* JADX INFO: renamed from: c */
    public final C9767c f50793c;

    /* JADX INFO: renamed from: d */
    public final a f50794d;

    /* JADX INFO: renamed from: e */
    public final ConcurrentLinkedQueue<C8077a> f50795e;

    /* JADX INFO: renamed from: wo.f$a */
    public static final class a extends AbstractC9765a {
        public a(String str) {
            super(str, true);
        }

        /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
        @Override // p442vo.AbstractC9765a
        /* JADX INFO: renamed from: a */
        public final long mo18071a() {
            C9991f c9991f = C9991f.this;
            long jNanoTime = System.nanoTime();
            int i10 = 0;
            long j10 = Long.MIN_VALUE;
            C8077a c8077a = null;
            int i11 = 0;
            for (C8077a c8077a2 : c9991f.f50795e) {
                C5207g.m11110e(c8077a2, "connection");
                synchronized (c8077a2) {
                    try {
                        if (c9991f.m18579b(c8077a2, jNanoTime) > 0) {
                            i11++;
                        } else {
                            i10++;
                            long j11 = jNanoTime - c8077a2.f43883q;
                            if (j11 > j10) {
                                c8077a = c8077a2;
                                j10 = j11;
                            }
                            C9072e c9072e = C9072e.f47360a;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            long j12 = c9991f.f50792b;
            if (j10 < j12 && i10 <= c9991f.f50791a) {
                if (i10 > 0) {
                    return j12 - j10;
                }
                if (i11 > 0) {
                    return j12;
                }
                return -1L;
            }
            C5207g.m11108c(c8077a);
            synchronized (c8077a) {
                if (!(!c8077a.f43882p.isEmpty())) {
                    if (c8077a.f43883q + j10 == jNanoTime) {
                        c8077a.f43876j = true;
                        c9991f.f50795e.remove(c8077a);
                        Socket socket = c8077a.f43870d;
                        C5207g.m11108c(socket);
                        C9347b.m17698e(socket);
                        if (c9991f.f50795e.isEmpty()) {
                            c9991f.f50793c.m18256a();
                        }
                    }
                }
            }
            return 0L;
        }
    }

    public C9991f(C9768d c9768d, int i10, long j10, TimeUnit timeUnit) {
        C5207g.m11111f(c9768d, "taskRunner");
        C5207g.m11111f(timeUnit, "timeUnit");
        this.f50791a = i10;
        this.f50792b = timeUnit.toNanos(j10);
        this.f50793c = c9768d.m18266f();
        this.f50794d = new a(C5207g.m11116k(" ConnectionPool", C9347b.f48088g));
        this.f50795e = new ConcurrentLinkedQueue<>();
        if (!(j10 > 0)) {
            throw new IllegalArgumentException(C5207g.m11116k(Long.valueOf(j10), "keepAliveDuration <= 0: ").toString());
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x003a A[Catch: all -> 0x004c, TryCatch #0 {all -> 0x004c, blocks: (B:10:0x002f, B:18:0x0040, B:16:0x003a, B:22:0x0046), top: B:32:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:35:0x0045 A[SYNTHETIC] */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: a */
    public final boolean m18578a(C9082a c9082a, C9990e c9990e, List<C9083a0> list, boolean z10) {
        C5207g.m11111f(c9082a, "address");
        C5207g.m11111f(c9990e, "call");
        Iterator<C8077a> it = this.f50795e.iterator();
        while (true) {
            if (!it.hasNext()) {
                return false;
            }
            C8077a next = it.next();
            C5207g.m11110e(next, "connection");
            synchronized (next) {
                if (z10) {
                    try {
                        if (next.f43873g != null) {
                            if (next.m15976h(c9082a, list)) {
                                c9990e.m18570c(next);
                                return true;
                            }
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                } else if (next.m15976h(c9082a, list)) {
                    c9990e.m18570c(next);
                    return true;
                }
                C9072e c9072e = C9072e.f47360a;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final int m18579b(C8077a c8077a, long j10) {
        byte[] bArr = C9347b.f48082a;
        ArrayList arrayList = c8077a.f43882p;
        int i10 = 0;
        do {
            while (i10 < arrayList.size()) {
                Reference reference = (Reference) arrayList.get(i10);
                if (reference.get() != null) {
                    i10++;
                } else {
                    String str = "A connection to " + c8077a.f43868b.f47381a.f47378i + " was leaked. Did you forget to close a response body?";
                    C1640h c1640h = C1640h.f9199a;
                    C1640h.f9199a.mo5324k(((C9990e.b) reference).f50789a, str);
                    arrayList.remove(i10);
                    c8077a.f43876j = true;
                }
            }
            return arrayList.size();
        } while (!arrayList.isEmpty());
        c8077a.f43883q = j10 - this.f50792b;
        return 0;
    }
}
