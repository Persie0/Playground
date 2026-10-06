package p000;

import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class oyi extends Thread {

    /* JADX INFO: renamed from: a */
    public final opl f46821a;

    /* JADX INFO: renamed from: b */
    public boolean f46822b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ oyj f46823c;

    /* JADX INFO: renamed from: d */
    public int f46824d;

    /* JADX INFO: renamed from: e */
    public final drj f46825e;

    /* JADX INFO: renamed from: f */
    private long f46826f;

    /* JADX INFO: renamed from: g */
    private long f46827g;

    /* JADX INFO: renamed from: h */
    private int f46828h;
    public volatile int indexInArray;
    public volatile Object nextParkedWorker;

    public oyi(oyj oyjVar, int i) {
        this.f46823c = oyjVar;
        setDaemon(true);
        this.f46825e = new drj((byte[]) null);
        this.f46824d = 4;
        this.f46821a = ook.m18794h(0);
        this.nextParkedWorker = oyj.f46829a;
        oop oopVar = ooq.f46355a;
        this.f46828h = ooq.f46356b.mo18813a();
        m19180c(i);
    }

    /* JADX INFO: renamed from: e */
    private final oyn m19175e() {
        if (m19178a(2) == 0) {
            oyn oynVar = (oyn) this.f46823c.f46837i.m15483f();
            return oynVar != null ? oynVar : (oyn) this.f46823c.f46838j.m15483f();
        }
        oyn oynVar2 = (oyn) this.f46823c.f46838j.m15483f();
        return oynVar2 != null ? oynVar2 : (oyn) this.f46823c.f46837i.m15483f();
    }

    /* JADX INFO: renamed from: f */
    private final oyn m19176f(boolean z) {
        int i;
        long jM6640t;
        long jM6640t2;
        boolean z2 = oqu.f46432a;
        int i2 = (int) (this.f46823c.f46836h.f46394b & 2097151);
        if (i2 < 2) {
            return null;
        }
        int iM19178a = m19178a(i2);
        oyj oyjVar = this.f46823c;
        int i3 = 0;
        long jMin = Long.MAX_VALUE;
        while (i3 < i2) {
            int i4 = iM19178a + 1;
            if (i4 > i2) {
                i4 = 1;
            }
            oyi oyiVar = (oyi) oyjVar.f46835g.m19152a(i4);
            if (oyiVar == null || oyiVar == this) {
                i = i4;
            } else {
                if (z) {
                    drj drjVar = this.f46825e;
                    drj drjVar2 = oyiVar.f46825e;
                    drjVar2.getClass();
                    int i5 = ((opl) drjVar2.f12396b).f46391b;
                    int i6 = ((opl) drjVar2.f12399e).f46391b;
                    Object obj = drjVar2.f12397c;
                    while (true) {
                        if (i5 != i6) {
                            int i7 = i5 & 127;
                            if (((opl) drjVar2.f12398d).f46391b != 0) {
                                AtomicReferenceArray atomicReferenceArray = (AtomicReferenceArray) obj;
                                oyn oynVar = (oyn) atomicReferenceArray.get(i7);
                                if (oynVar != null) {
                                    i = i4;
                                    if (oynVar.f46845h.f46847a == 1) {
                                        do {
                                            if (atomicReferenceArray.compareAndSet(i7, oynVar, null)) {
                                                ((opl) drjVar2.f12398d).m18848d();
                                                drjVar.m6632l(oynVar);
                                                jM6640t2 = -1;
                                                break;
                                            }
                                        } while (atomicReferenceArray.get(i7) == oynVar);
                                    } else {
                                        continue;
                                    }
                                } else {
                                    i = i4;
                                }
                                i5++;
                                i4 = i;
                            }
                        }
                        i = i4;
                        jM6640t2 = drjVar.m6640t(drjVar2, true);
                        break;
                    }
                    jM6640t = jM6640t2;
                } else {
                    i = i4;
                    drj drjVar3 = this.f46825e;
                    drj drjVar4 = oyiVar.f46825e;
                    drjVar4.getClass();
                    oyn oynVarM6631k = drjVar4.m6631k();
                    if (oynVarM6631k != null) {
                        drjVar3.m6632l(oynVarM6631k);
                        jM6640t = -1;
                    } else {
                        jM6640t = drjVar3.m6640t(drjVar4, false);
                    }
                }
                if (jM6640t == -1) {
                    return this.f46825e.m6630j();
                }
                if (jM6640t > 0) {
                    jMin = Math.min(jMin, jM6640t);
                }
            }
            i3++;
            iM19178a = i;
        }
        if (jMin == Long.MAX_VALUE) {
            jMin = 0;
        }
        this.f46827g = jMin;
        return null;
    }

    /* JADX INFO: renamed from: g */
    private final boolean m19177g() {
        return this.nextParkedWorker != oyj.f46829a;
    }

    /* JADX INFO: renamed from: a */
    public final int m19178a(int i) {
        int i2 = this.f46828h;
        int i3 = i2 ^ (i2 << 13);
        int i4 = i3 ^ (i3 >> 17);
        int i5 = i4 ^ (i4 << 5);
        this.f46828h = i5;
        int i6 = i - 1;
        return (i6 & i) == 0 ? i5 & i6 : (i5 & Integer.MAX_VALUE) % i;
    }

    /* JADX INFO: renamed from: c */
    public final void m19180c(int i) {
        setName(this.f46823c.f46833e + "-worker-" + (i == 0 ? "TERMINATED" : String.valueOf(i)));
        this.indexInArray = i;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m19181d(int i) {
        int i2 = this.f46824d;
        boolean z = i2 == 1;
        if (z) {
            this.f46823c.f46836h.m18849a(4398046511104L);
        }
        if (i2 != i) {
            this.f46824d = i;
        }
        return z;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        long j;
        int i;
        boolean z = false;
        boolean z2 = false;
        while (true) {
            int i2 = 5;
            if (this.f46823c.m19191c() || this.f46824d == 5) {
                break;
            }
            oyn oynVarM19179b = m19179b(this.f46822b);
            if (oynVarM19179b != null) {
                this.f46827g = 0L;
                int i3 = oynVarM19179b.f46845h.f46847a;
                this.f46826f = 0L;
                if (this.f46824d == 3) {
                    boolean z3 = oqu.f46432a;
                    this.f46824d = 2;
                }
                if (i3 != 0 && m19181d(2)) {
                    this.f46823c.m19190b();
                }
                oyj.m19183f(oynVarM19179b);
                if (i3 == 0) {
                    z2 = false;
                } else {
                    this.f46823c.f46836h.m18849a(-2097152L);
                    if (this.f46824d != 5) {
                        boolean z4 = oqu.f46432a;
                        this.f46824d = 4;
                    }
                    z2 = false;
                }
            } else {
                this.f46822b = z;
                if (this.f46827g == 0) {
                    if (m19177g()) {
                        boolean z5 = oqu.f46432a;
                        int i4 = -1;
                        this.f46821a.f46391b = -1;
                        while (m19177g() && this.f46821a.f46391b == i4 && !this.f46823c.m19191c() && this.f46824d != i2) {
                            m19181d(3);
                            Thread.interrupted();
                            if (this.f46826f == 0) {
                                this.f46826f = System.nanoTime() + this.f46823c.f46832d;
                            }
                            LockSupport.parkNanos(this.f46823c.f46832d);
                            if (System.nanoTime() - this.f46826f >= 0) {
                                this.f46826f = 0L;
                                oyj oyjVar = this.f46823c;
                                synchronized (oyjVar.f46835g) {
                                    if (oyjVar.m19191c()) {
                                        i2 = 5;
                                    } else {
                                        if (((int) (oyjVar.f46836h.f46394b & 2097151)) <= oyjVar.f46830b) {
                                            i2 = 5;
                                        } else if (this.f46821a.m18847c(i4, 1)) {
                                            int i5 = this.indexInArray;
                                            m19180c(0);
                                            oyjVar.m19189a(this, i5, 0);
                                            int andDecrement = (int) (opm.f46393a.getAndDecrement(oyjVar.f46836h) & 2097151);
                                            if (andDecrement != i5) {
                                                Object objM19152a = oyjVar.f46835g.m19152a(andDecrement);
                                                objM19152a.getClass();
                                                oyi oyiVar = (oyi) objM19152a;
                                                oyjVar.f46835g.m19153b(i5, oyiVar);
                                                oyiVar.m19180c(i5);
                                                oyjVar.m19189a(oyiVar, andDecrement, i5);
                                            }
                                            oyjVar.f46835g.m19153b(andDecrement, null);
                                            this.f46824d = 5;
                                            i2 = 5;
                                            i4 = -1;
                                        } else {
                                            i2 = 5;
                                        }
                                    }
                                }
                            } else {
                                i2 = 5;
                                i4 = -1;
                            }
                        }
                    } else {
                        oyj oyjVar2 = this.f46823c;
                        if (this.nextParkedWorker == oyj.f46829a) {
                            opm opmVar = oyjVar2.f46834f;
                            do {
                                j = opmVar.f46394b;
                                i = this.indexInArray;
                                boolean z6 = oqu.f46432a;
                                this.nextParkedWorker = oyjVar2.f46835g.m19152a((int) (j & 2097151));
                            } while (!oyjVar2.f46834f.m18852d(j, ((2097152 + j) & (-2097152)) | ((long) i)));
                        }
                    }
                    z = false;
                } else if (z2) {
                    m19181d(3);
                    Thread.interrupted();
                    LockSupport.parkNanos(this.f46827g);
                    this.f46827g = 0L;
                    z2 = false;
                } else {
                    z2 = true;
                }
            }
        }
        m19181d(5);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0076, code lost:
    
        if (r9 != null) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x007d, code lost:
    
        if (r9 != null) goto L38;
     */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final oyn m19179b(boolean z) {
        oyn oynVarM19175e;
        long j;
        oyn oynVarM6630j;
        if (this.f46824d != 1) {
            oyj oyjVar = this.f46823c;
            opm opmVar = oyjVar.f46836h;
            do {
                j = opmVar.f46394b;
                if (((int) ((9223367638808264704L & j) >> 42)) == 0) {
                    if (!z || (oynVarM6630j = this.f46825e.m6630j()) == null) {
                        oynVarM6630j = (oyn) this.f46823c.f46838j.m15483f();
                    }
                    return oynVarM6630j == null ? m19176f(true) : oynVarM6630j;
                }
            } while (!oyjVar.f46836h.m18852d(j, (-4398046511104L) + j));
            this.f46824d = 1;
        }
        if (z) {
            int i = this.f46823c.f46830b;
            boolean z2 = m19178a(i + i) == 0;
            if (z2) {
                oynVarM19175e = m19175e();
                if (oynVarM19175e == null) {
                }
                return oynVarM19175e;
            }
            oynVarM19175e = this.f46825e.m6630j();
            if (oynVarM19175e == null) {
                if (!z2) {
                    oynVarM19175e = m19175e();
                }
                return m19176f(false);
            }
            return oynVarM19175e;
        }
        oynVarM19175e = m19175e();
    }
}
