package p442vo;

import ae.C0062b;
import dm.C5207g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import sl.C9072e;
import to.C9347b;

/* JADX INFO: renamed from: vo.c */
/* JADX INFO: loaded from: classes2.dex */
public final class C9767c {

    /* JADX INFO: renamed from: a */
    public final C9768d f49834a;

    /* JADX INFO: renamed from: b */
    public final String f49835b;

    /* JADX INFO: renamed from: c */
    public boolean f49836c;

    /* JADX INFO: renamed from: d */
    public AbstractC9765a f49837d;

    /* JADX INFO: renamed from: e */
    public final ArrayList f49838e;

    /* JADX INFO: renamed from: f */
    public boolean f49839f;

    public C9767c(C9768d c9768d, String str) {
        C5207g.m11111f(c9768d, "taskRunner");
        C5207g.m11111f(str, "name");
        this.f49834a = c9768d;
        this.f49835b = str;
        this.f49838e = new ArrayList();
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: a */
    public final void m18256a() {
        byte[] bArr = C9347b.f48082a;
        synchronized (this.f49834a) {
            try {
                if (m18257b()) {
                    this.f49834a.m18265e(this);
                }
                C9072e c9072e = C9072e.f47360a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final boolean m18257b() {
        AbstractC9765a abstractC9765a = this.f49837d;
        if (abstractC9765a != null && abstractC9765a.f49830b) {
            this.f49839f = true;
        }
        ArrayList arrayList = this.f49838e;
        int size = arrayList.size() - 1;
        boolean z10 = false;
        if (size >= 0) {
            while (true) {
                int i10 = size - 1;
                if (((AbstractC9765a) arrayList.get(size)).f49830b) {
                    AbstractC9765a abstractC9765a2 = (AbstractC9765a) arrayList.get(size);
                    C9768d.b bVar = C9768d.f49840h;
                    if (C9768d.f49842j.isLoggable(Level.FINE)) {
                        C0062b.m244A(abstractC9765a2, this, "canceled");
                    }
                    arrayList.remove(size);
                    z10 = true;
                }
                if (i10 < 0) {
                    break;
                }
                size = i10;
            }
        }
        return z10;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: c */
    public final void m18258c(AbstractC9765a abstractC9765a, long j10) {
        C5207g.m11111f(abstractC9765a, "task");
        synchronized (this.f49834a) {
            try {
                if (!this.f49836c) {
                    if (m18259e(abstractC9765a, j10, false)) {
                        this.f49834a.m18265e(this);
                    }
                    C9072e c9072e = C9072e.f47360a;
                } else if (abstractC9765a.f49830b) {
                    C9768d.f49840h.getClass();
                    if (C9768d.f49842j.isLoggable(Level.FINE)) {
                        C0062b.m244A(abstractC9765a, this, "schedule canceled (queue is shutdown)");
                    }
                } else {
                    C9768d.f49840h.getClass();
                    if (C9768d.f49842j.isLoggable(Level.FINE)) {
                        C0062b.m244A(abstractC9765a, this, "schedule failed (queue is shutdown)");
                    }
                    throw new RejectedExecutionException();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final boolean m18259e(AbstractC9765a abstractC9765a, long j10, boolean z10) {
        C5207g.m11111f(abstractC9765a, "task");
        C9767c c9767c = abstractC9765a.f49831c;
        if (c9767c != this) {
            if (!(c9767c == null)) {
                throw new IllegalStateException("task is in multiple queues".toString());
            }
            abstractC9765a.f49831c = this;
        }
        long jMo18269c = this.f49834a.f49843a.mo18269c();
        long j11 = jMo18269c + j10;
        ArrayList arrayList = this.f49838e;
        int iIndexOf = arrayList.indexOf(abstractC9765a);
        if (iIndexOf != -1) {
            if (abstractC9765a.f49832d <= j11) {
                C9768d.b bVar = C9768d.f49840h;
                if (C9768d.f49842j.isLoggable(Level.FINE)) {
                    C0062b.m244A(abstractC9765a, this, "already scheduled");
                }
                return false;
            }
            arrayList.remove(iIndexOf);
        }
        abstractC9765a.f49832d = j11;
        C9768d.b bVar2 = C9768d.f49840h;
        if (C9768d.f49842j.isLoggable(Level.FINE)) {
            C0062b.m244A(abstractC9765a, this, z10 ? C5207g.m11116k(C0062b.m310T0(j11 - jMo18269c), "run again after ") : C5207g.m11116k(C0062b.m310T0(j11 - jMo18269c), "scheduled after "));
        }
        Iterator it = arrayList.iterator();
        int size = 0;
        while (true) {
            if (!it.hasNext()) {
                size = -1;
                break;
            }
            if (((AbstractC9765a) it.next()).f49832d - jMo18269c > j10) {
                break;
            }
            size++;
        }
        if (size == -1) {
            size = arrayList.size();
        }
        arrayList.add(size, abstractC9765a);
        return size == 0;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: f */
    public final void m18260f() {
        byte[] bArr = C9347b.f48082a;
        synchronized (this.f49834a) {
            try {
                this.f49836c = true;
                if (m18257b()) {
                    this.f49834a.m18265e(this);
                }
                C9072e c9072e = C9072e.f47360a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final String toString() {
        return this.f49835b;
    }
}
