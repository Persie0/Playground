package p000;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public final class dj5 {
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ long _state$volatile;

    /* JADX INFO: renamed from: a */
    public final int f35717a;

    /* JADX INFO: renamed from: b */
    public final boolean f35718b;

    /* JADX INFO: renamed from: c */
    public final int f35719c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ AtomicReferenceArray f35720d;

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f35713e = AtomicReferenceFieldUpdater.newUpdater(dj5.class, Object.class, "_next$volatile");

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ long f35716h = m7d.f50741a.objectFieldOffset(dj5.class.getDeclaredField("_next$volatile"));

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ AtomicLongFieldUpdater f35714f = AtomicLongFieldUpdater.newUpdater(dj5.class, "_state$volatile");

    /* JADX INFO: renamed from: g */
    public static final C0842cc f35715g = new C0842cc("REMOVE_FROZEN", 5);

    public dj5(int i, boolean z) {
        this.f35717a = i;
        this.f35718b = z;
        int i2 = i - 1;
        this.f35719c = i2;
        this.f35720d = new AtomicReferenceArray(i);
        if (i2 > 1073741823) {
            C3386nv.m17633t("Check failed.");
            throw null;
        }
        if ((i & i2) == 0) {
            return;
        }
        C3386nv.m17633t("Check failed.");
        throw null;
    }

    /* JADX INFO: renamed from: a */
    public final int m10409a(Object obj) {
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f35714f;
            long j = atomicLongFieldUpdater.get(this);
            if ((3458764513820540928L & j) != 0) {
                return (2305843009213693952L & j) != 0 ? 2 : 1;
            }
            int i = (int) (1073741823 & j);
            int i2 = (int) ((1152921503533105152L & j) >> 30);
            int i3 = this.f35719c;
            if (((i2 + 2) & i3) == (i & i3)) {
                return 1;
            }
            boolean z = this.f35718b;
            AtomicReferenceArray atomicReferenceArray = this.f35720d;
            if (z || atomicReferenceArray.get(i2 & i3) == null) {
                dj5 dj5Var = this;
                if (f35714f.compareAndSet(dj5Var, j, ((-1152921503533105153L) & j) | (((long) ((i2 + 1) & 1073741823)) << 30))) {
                    atomicReferenceArray.set(i2 & i3, obj);
                    dj5 dj5VarM10412d = dj5Var;
                    while ((atomicLongFieldUpdater.get(dj5VarM10412d) & 1152921504606846976L) != 0) {
                        dj5VarM10412d = dj5VarM10412d.m10412d();
                        AtomicReferenceArray atomicReferenceArray2 = dj5VarM10412d.f35720d;
                        int i4 = dj5VarM10412d.f35719c & i2;
                        Object obj2 = atomicReferenceArray2.get(i4);
                        if ((obj2 instanceof cj5) && ((cj5) obj2).f10169a == i2) {
                            atomicReferenceArray2.set(i4, obj);
                        } else {
                            dj5VarM10412d = null;
                        }
                        if (dj5VarM10412d == null) {
                            return 0;
                        }
                    }
                    return 0;
                }
                this = dj5Var;
            } else {
                int i5 = this.f35717a;
                if (i5 < 1024 || ((i2 - i) & 1073741823) > (i5 >> 1)) {
                    return 1;
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final dj5 m10410b(long j) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f35713e;
            atomicReferenceFieldUpdater.getClass();
            dj5 dj5Var = (dj5) m7d.f50741a.getObjectVolatile(this, f35716h);
            if (dj5Var != null) {
                return dj5Var;
            }
            dj5 dj5Var2 = new dj5(this.f35717a * 2, this.f35718b);
            int i = (int) (1073741823 & j);
            int i2 = (int) ((1152921503533105152L & j) >> 30);
            while (true) {
                int i3 = this.f35719c;
                int i4 = i & i3;
                if (i4 != (i3 & i2)) {
                    Object cj5Var = this.f35720d.get(i4);
                    if (cj5Var == null) {
                        cj5Var = new cj5(i);
                    }
                    dj5Var2.f35720d.set(dj5Var2.f35719c & i, cj5Var);
                    i++;
                }
            }
            f35714f.set(dj5Var2, (-1152921504606846977L) & j);
            e65.m10886r(atomicReferenceFieldUpdater, this, dj5Var2);
        }
    }

    /* JADX INFO: renamed from: c */
    public final boolean m10411c() {
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f35714f;
            long j = atomicLongFieldUpdater.get(this);
            if ((j & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j) != 0) {
                return false;
            }
            dj5 dj5Var = this;
            if (atomicLongFieldUpdater.compareAndSet(dj5Var, j, 2305843009213693952L | j)) {
                return true;
            }
            this = dj5Var;
        }
    }

    /* JADX INFO: renamed from: d */
    public final dj5 m10412d() {
        long j;
        dj5 dj5Var;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f35714f;
            j = atomicLongFieldUpdater.get(this);
            if ((j & 1152921504606846976L) != 0) {
                dj5Var = this;
                break;
            }
            long j2 = 1152921504606846976L | j;
            dj5Var = this;
            if (atomicLongFieldUpdater.compareAndSet(dj5Var, j, j2)) {
                j = j2;
                break;
            }
            this = dj5Var;
        }
        return dj5Var.m10410b(j);
    }

    /* JADX INFO: renamed from: e */
    public final Object m10413e() {
        dj5 dj5VarM10412d = this;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f35714f;
            long j = atomicLongFieldUpdater.get(dj5VarM10412d);
            if ((j & 1152921504606846976L) != 0) {
                return f35715g;
            }
            int i = (int) (j & 1073741823);
            int i2 = dj5VarM10412d.f35719c;
            int i3 = i & i2;
            if ((((int) ((1152921503533105152L & j) >> 30)) & i2) != i3) {
                AtomicReferenceArray atomicReferenceArray = dj5VarM10412d.f35720d;
                Object obj = atomicReferenceArray.get(i3);
                boolean z = dj5VarM10412d.f35718b;
                if (obj == null) {
                    if (z) {
                    }
                } else if (!(obj instanceof cj5)) {
                    long j2 = (i + 1) & 1073741823;
                    if (f35714f.compareAndSet(dj5VarM10412d, j, (j & (-1073741824)) | j2)) {
                        atomicReferenceArray.set(i3, null);
                        return obj;
                    }
                    dj5VarM10412d = this;
                    if (z) {
                        while (true) {
                            long j3 = atomicLongFieldUpdater.get(dj5VarM10412d);
                            int i4 = (int) (j3 & 1073741823);
                            if ((j3 & 1152921504606846976L) != 0) {
                                dj5VarM10412d = dj5VarM10412d.m10412d();
                            } else {
                                dj5 dj5Var = dj5VarM10412d;
                                if (f35714f.compareAndSet(dj5Var, j3, (j3 & (-1073741824)) | j2)) {
                                    dj5Var.f35720d.set(i4 & dj5Var.f35719c, null);
                                    dj5VarM10412d = null;
                                } else {
                                    dj5VarM10412d = dj5Var;
                                }
                            }
                            if (dj5VarM10412d == null) {
                                return obj;
                            }
                        }
                    }
                }
            }
            return null;
        }
    }
}
