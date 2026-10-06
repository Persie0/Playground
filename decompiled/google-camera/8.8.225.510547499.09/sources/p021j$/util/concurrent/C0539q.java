package p021j$.util.concurrent;

import java.util.concurrent.locks.LockSupport;
import p021j$.sun.misc.C0414a;

/* JADX INFO: renamed from: j$.util.concurrent.q */
/* JADX INFO: loaded from: classes3.dex */
final class C0539q extends C0533k {

    /* JADX INFO: renamed from: h */
    private static final C0414a f33227h;

    /* JADX INFO: renamed from: i */
    private static final long f33228i;

    /* JADX INFO: renamed from: e */
    C0540r f33229e;

    /* JADX INFO: renamed from: f */
    volatile C0540r f33230f;

    /* JADX INFO: renamed from: g */
    volatile Thread f33231g;
    volatile int lockState;

    static {
        C0414a c0414aM12221h = C0414a.m12221h();
        f33227h = c0414aM12221h;
        f33228i = c0414aM12221h.m12230j(C0539q.class, "lockState");
    }

    C0539q(C0540r c0540r) {
        int iM12543d;
        int iM12572i;
        super(-2, null, null);
        this.f33230f = c0540r;
        C0540r c0540r2 = null;
        while (c0540r != null) {
            C0540r c0540r3 = (C0540r) c0540r.f33214d;
            c0540r.f33234g = null;
            c0540r.f33233f = null;
            if (c0540r2 == null) {
                c0540r.f33232e = null;
                c0540r.f33236i = false;
            } else {
                Object obj = c0540r.f33212b;
                int i = c0540r.f33211a;
                C0540r c0540r4 = c0540r2;
                Class clsM12542c = null;
                while (true) {
                    Object obj2 = c0540r4.f33212b;
                    int i2 = c0540r4.f33211a;
                    iM12572i = i2 > i ? -1 : i2 < i ? 1 : ((clsM12542c == null && (clsM12542c = ConcurrentHashMap.m12542c(obj)) == null) || (iM12543d = ConcurrentHashMap.m12543d(clsM12542c, obj, obj2)) == 0) ? m12572i(obj, obj2) : iM12543d;
                    C0540r c0540r5 = iM12572i <= 0 ? c0540r4.f33233f : c0540r4.f33234g;
                    if (c0540r5 == null) {
                        break;
                    } else {
                        c0540r4 = c0540r5;
                    }
                }
                c0540r.f33232e = c0540r4;
                if (iM12572i <= 0) {
                    c0540r4.f33233f = c0540r;
                } else {
                    c0540r4.f33234g = c0540r;
                }
                c0540r = m12568c(c0540r2, c0540r);
            }
            c0540r2 = c0540r;
            c0540r = c0540r3;
        }
        this.f33229e = c0540r2;
    }

    /* JADX INFO: renamed from: b */
    static C0540r m12567b(C0540r c0540r, C0540r c0540r2) {
        while (c0540r2 != null && c0540r2 != c0540r) {
            C0540r c0540r3 = c0540r2.f33232e;
            if (c0540r3 == null) {
                c0540r2.f33236i = false;
                return c0540r2;
            }
            if (c0540r2.f33236i) {
                c0540r2.f33236i = false;
                return c0540r;
            }
            C0540r c0540r4 = c0540r3.f33233f;
            if (c0540r4 == c0540r2) {
                c0540r4 = c0540r3.f33234g;
                if (c0540r4 != null && c0540r4.f33236i) {
                    c0540r4.f33236i = false;
                    c0540r3.f33236i = true;
                    c0540r = m12570g(c0540r, c0540r3);
                    c0540r3 = c0540r2.f33232e;
                    c0540r4 = c0540r3 == null ? null : c0540r3.f33234g;
                }
                if (c0540r4 != null) {
                    C0540r c0540r5 = c0540r4.f33233f;
                    C0540r c0540r6 = c0540r4.f33234g;
                    if ((c0540r6 == null || !c0540r6.f33236i) && (c0540r5 == null || !c0540r5.f33236i)) {
                        c0540r4.f33236i = true;
                    } else {
                        if (c0540r6 == null || !c0540r6.f33236i) {
                            if (c0540r5 != null) {
                                c0540r5.f33236i = false;
                            }
                            c0540r4.f33236i = true;
                            c0540r = m12571h(c0540r, c0540r4);
                            c0540r3 = c0540r2.f33232e;
                            c0540r4 = c0540r3 != null ? c0540r3.f33234g : null;
                        }
                        if (c0540r4 != null) {
                            c0540r4.f33236i = c0540r3 == null ? false : c0540r3.f33236i;
                            C0540r c0540r7 = c0540r4.f33234g;
                            if (c0540r7 != null) {
                                c0540r7.f33236i = false;
                            }
                        }
                        if (c0540r3 != null) {
                            c0540r3.f33236i = false;
                            c0540r = m12570g(c0540r, c0540r3);
                        }
                        c0540r2 = c0540r;
                        c0540r = c0540r2;
                    }
                }
                c0540r2 = c0540r3;
            } else {
                if (c0540r4 != null && c0540r4.f33236i) {
                    c0540r4.f33236i = false;
                    c0540r3.f33236i = true;
                    c0540r = m12571h(c0540r, c0540r3);
                    c0540r3 = c0540r2.f33232e;
                    c0540r4 = c0540r3 == null ? null : c0540r3.f33233f;
                }
                if (c0540r4 != null) {
                    C0540r c0540r8 = c0540r4.f33233f;
                    C0540r c0540r9 = c0540r4.f33234g;
                    if ((c0540r8 == null || !c0540r8.f33236i) && (c0540r9 == null || !c0540r9.f33236i)) {
                        c0540r4.f33236i = true;
                    } else {
                        if (c0540r8 == null || !c0540r8.f33236i) {
                            if (c0540r9 != null) {
                                c0540r9.f33236i = false;
                            }
                            c0540r4.f33236i = true;
                            c0540r = m12570g(c0540r, c0540r4);
                            c0540r3 = c0540r2.f33232e;
                            c0540r4 = c0540r3 != null ? c0540r3.f33233f : null;
                        }
                        if (c0540r4 != null) {
                            c0540r4.f33236i = c0540r3 == null ? false : c0540r3.f33236i;
                            C0540r c0540r10 = c0540r4.f33233f;
                            if (c0540r10 != null) {
                                c0540r10.f33236i = false;
                            }
                        }
                        if (c0540r3 != null) {
                            c0540r3.f33236i = false;
                            c0540r = m12571h(c0540r, c0540r3);
                        }
                        c0540r2 = c0540r;
                        c0540r = c0540r2;
                    }
                }
                c0540r2 = c0540r3;
            }
        }
        return c0540r;
    }

    /* JADX INFO: renamed from: c */
    static C0540r m12568c(C0540r c0540r, C0540r c0540r2) {
        C0540r c0540r3;
        c0540r2.f33236i = true;
        while (true) {
            C0540r c0540r4 = c0540r2.f33232e;
            if (c0540r4 == null) {
                c0540r2.f33236i = false;
                return c0540r2;
            }
            if (!c0540r4.f33236i || (c0540r3 = c0540r4.f33232e) == null) {
                return c0540r;
            }
            C0540r c0540r5 = c0540r3.f33233f;
            if (c0540r4 == c0540r5) {
                c0540r5 = c0540r3.f33234g;
                if (c0540r5 == null || !c0540r5.f33236i) {
                    if (c0540r2 == c0540r4.f33234g) {
                        c0540r = m12570g(c0540r, c0540r4);
                        C0540r c0540r6 = c0540r4.f33232e;
                        c0540r3 = c0540r6 == null ? null : c0540r6.f33232e;
                        c0540r4 = c0540r6;
                        c0540r2 = c0540r4;
                    }
                    if (c0540r4 != null) {
                        c0540r4.f33236i = false;
                        if (c0540r3 != null) {
                            c0540r3.f33236i = true;
                            c0540r = m12571h(c0540r, c0540r3);
                        }
                    }
                } else {
                    c0540r5.f33236i = false;
                    c0540r4.f33236i = false;
                    c0540r3.f33236i = true;
                    c0540r2 = c0540r3;
                }
            } else if (c0540r5 == null || !c0540r5.f33236i) {
                if (c0540r2 == c0540r4.f33233f) {
                    c0540r = m12571h(c0540r, c0540r4);
                    C0540r c0540r7 = c0540r4.f33232e;
                    c0540r3 = c0540r7 == null ? null : c0540r7.f33232e;
                    c0540r4 = c0540r7;
                    c0540r2 = c0540r4;
                }
                if (c0540r4 != null) {
                    c0540r4.f33236i = false;
                    if (c0540r3 != null) {
                        c0540r3.f33236i = true;
                        c0540r = m12570g(c0540r, c0540r3);
                    }
                }
            } else {
                c0540r5.f33236i = false;
                c0540r4.f33236i = false;
                c0540r3.f33236i = true;
                c0540r2 = c0540r3;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    private final void m12569d() {
        if (f33227h.m12225c(this, f33228i, 0, 1)) {
            return;
        }
        boolean z = false;
        while (true) {
            int i = this.lockState;
            if ((i & (-3)) == 0) {
                if (f33227h.m12225c(this, f33228i, i, 1)) {
                    break;
                }
            } else if ((i & 2) == 0) {
                if (f33227h.m12225c(this, f33228i, i, i | 2)) {
                    this.f33231g = Thread.currentThread();
                    z = true;
                }
            } else if (z) {
                LockSupport.park(this);
            }
        }
        if (z) {
            this.f33231g = null;
        }
    }

    /* JADX INFO: renamed from: g */
    static C0540r m12570g(C0540r c0540r, C0540r c0540r2) {
        C0540r c0540r3 = c0540r2.f33234g;
        if (c0540r3 != null) {
            C0540r c0540r4 = c0540r3.f33233f;
            c0540r2.f33234g = c0540r4;
            if (c0540r4 != null) {
                c0540r4.f33232e = c0540r2;
            }
            C0540r c0540r5 = c0540r2.f33232e;
            c0540r3.f33232e = c0540r5;
            if (c0540r5 == null) {
                c0540r3.f33236i = false;
                c0540r = c0540r3;
            } else if (c0540r5.f33233f == c0540r2) {
                c0540r5.f33233f = c0540r3;
            } else {
                c0540r5.f33234g = c0540r3;
            }
            c0540r3.f33233f = c0540r2;
            c0540r2.f33232e = c0540r3;
        }
        return c0540r;
    }

    /* JADX INFO: renamed from: h */
    static C0540r m12571h(C0540r c0540r, C0540r c0540r2) {
        C0540r c0540r3 = c0540r2.f33233f;
        if (c0540r3 != null) {
            C0540r c0540r4 = c0540r3.f33234g;
            c0540r2.f33233f = c0540r4;
            if (c0540r4 != null) {
                c0540r4.f33232e = c0540r2;
            }
            C0540r c0540r5 = c0540r2.f33232e;
            c0540r3.f33232e = c0540r5;
            if (c0540r5 == null) {
                c0540r3.f33236i = false;
                c0540r = c0540r3;
            } else if (c0540r5.f33234g == c0540r2) {
                c0540r5.f33234g = c0540r3;
            } else {
                c0540r5.f33233f = c0540r3;
            }
            c0540r3.f33234g = c0540r2;
            c0540r2.f33232e = c0540r3;
        }
        return c0540r;
    }

    /* JADX INFO: renamed from: i */
    static int m12572i(Object obj, Object obj2) {
        int iCompareTo;
        if (obj == null || obj2 == null || (iCompareTo = obj.getClass().getName().compareTo(obj2.getClass().getName())) == 0) {
            return System.identityHashCode(obj) <= System.identityHashCode(obj2) ? -1 : 1;
        }
        return iCompareTo;
    }

    @Override // p021j$.util.concurrent.C0533k
    /* JADX INFO: renamed from: a */
    final C0533k mo12563a(int i, Object obj) {
        Object obj2;
        Thread thread;
        C0540r c0540rM12575b = null;
        if (obj != null) {
            C0533k c0533k = this.f33230f;
            while (c0533k != null) {
                int i2 = this.lockState;
                if ((i2 & 3) != 0) {
                    if (c0533k.f33211a == i && ((obj2 = c0533k.f33212b) == obj || (obj2 != null && obj.equals(obj2)))) {
                        return c0533k;
                    }
                    c0533k = c0533k.f33214d;
                } else if (f33227h.m12225c(this, f33228i, i2, i2 + 4)) {
                    try {
                        C0540r c0540r = this.f33229e;
                        if (c0540r != null) {
                            c0540rM12575b = c0540r.m12575b(i, obj, null);
                        }
                        return c0540rM12575b;
                    } finally {
                        if (f33227h.m12228f(this, f33228i) == 6 && (thread = this.f33231g) != null) {
                            LockSupport.unpark(thread);
                        }
                    }
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    final C0540r m12573e(int i, Object obj, Object obj2) {
        int iM12543d;
        int iM12572i;
        C0540r c0540r;
        C0540r c0540rM12575b;
        C0540r c0540r2 = this.f33229e;
        Class clsM12542c = null;
        boolean z = false;
        while (c0540r2 != null) {
            int i2 = c0540r2.f33211a;
            if (i2 > i) {
                iM12572i = -1;
            } else if (i2 < i) {
                iM12572i = 1;
            } else {
                Object obj3 = c0540r2.f33212b;
                if (obj3 == obj || (obj3 != null && obj.equals(obj3))) {
                    return c0540r2;
                }
                if ((clsM12542c == null && (clsM12542c = ConcurrentHashMap.m12542c(obj)) == null) || (iM12543d = ConcurrentHashMap.m12543d(clsM12542c, obj, obj3)) == 0) {
                    if (!z) {
                        C0540r c0540r3 = c0540r2.f33233f;
                        if ((c0540r3 != null && (c0540rM12575b = c0540r3.m12575b(i, obj, clsM12542c)) != null) || ((c0540r = c0540r2.f33234g) != null && (c0540rM12575b = c0540r.m12575b(i, obj, clsM12542c)) != null)) {
                            return c0540rM12575b;
                        }
                        z = true;
                    }
                    iM12572i = m12572i(obj, obj3);
                } else {
                    iM12572i = iM12543d;
                }
            }
            C0540r c0540r4 = iM12572i <= 0 ? c0540r2.f33233f : c0540r2.f33234g;
            if (c0540r4 == null) {
                C0540r c0540r5 = this.f33230f;
                C0540r c0540r6 = new C0540r(i, obj, obj2, c0540r5, c0540r2);
                this.f33230f = c0540r6;
                if (c0540r5 != null) {
                    c0540r5.f33235h = c0540r6;
                }
                if (iM12572i <= 0) {
                    c0540r2.f33233f = c0540r6;
                } else {
                    c0540r2.f33234g = c0540r6;
                }
                if (c0540r2.f33236i) {
                    m12569d();
                    try {
                        this.f33229e = m12568c(this.f33229e, c0540r6);
                    } finally {
                        this.lockState = 0;
                    }
                } else {
                    c0540r6.f33236i = true;
                }
                return null;
            }
            c0540r2 = c0540r4;
        }
        C0540r c0540r7 = new C0540r(i, obj, obj2, null, null);
        this.f33229e = c0540r7;
        this.f33230f = c0540r7;
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:55:0x008b A[PHI: r0
      0x008b: PHI (r0v4 j$.util.concurrent.r) = (r0v3 j$.util.concurrent.r), (r0v12 j$.util.concurrent.r) binds: [B:53:0x0087, B:49:0x0080] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: f */
    final boolean m12574f(C0540r c0540r) {
        C0540r c0540r2;
        C0540r c0540r3;
        C0540r c0540r4 = (C0540r) c0540r.f33214d;
        C0540r c0540r5 = c0540r.f33235h;
        if (c0540r5 == null) {
            this.f33230f = c0540r4;
        } else {
            c0540r5.f33214d = c0540r4;
        }
        if (c0540r4 != null) {
            c0540r4.f33235h = c0540r5;
        }
        if (this.f33230f == null) {
            this.f33229e = null;
            return true;
        }
        C0540r c0540rM12567b = this.f33229e;
        if (c0540rM12567b == null || c0540rM12567b.f33234g == null || (c0540r2 = c0540rM12567b.f33233f) == null || c0540r2.f33233f == null) {
            return true;
        }
        m12569d();
        try {
            C0540r c0540r6 = c0540r.f33233f;
            C0540r c0540r7 = c0540r.f33234g;
            if (c0540r6 != null && c0540r7 != null) {
                C0540r c0540r8 = c0540r7;
                while (true) {
                    C0540r c0540r9 = c0540r8.f33233f;
                    if (c0540r9 == null) {
                        break;
                    }
                    c0540r8 = c0540r9;
                }
                boolean z = c0540r8.f33236i;
                c0540r8.f33236i = c0540r.f33236i;
                c0540r.f33236i = z;
                C0540r c0540r10 = c0540r8.f33234g;
                C0540r c0540r11 = c0540r.f33232e;
                if (c0540r8 == c0540r7) {
                    c0540r.f33232e = c0540r8;
                    c0540r8.f33234g = c0540r;
                } else {
                    C0540r c0540r12 = c0540r8.f33232e;
                    c0540r.f33232e = c0540r12;
                    if (c0540r12 != null) {
                        if (c0540r8 == c0540r12.f33233f) {
                            c0540r12.f33233f = c0540r;
                        } else {
                            c0540r12.f33234g = c0540r;
                        }
                    }
                    c0540r8.f33234g = c0540r7;
                    c0540r7.f33232e = c0540r8;
                }
                c0540r.f33233f = null;
                c0540r.f33234g = c0540r10;
                if (c0540r10 != null) {
                    c0540r10.f33232e = c0540r;
                }
                c0540r8.f33233f = c0540r6;
                c0540r6.f33232e = c0540r8;
                c0540r8.f33232e = c0540r11;
                if (c0540r11 == null) {
                    c0540rM12567b = c0540r8;
                } else if (c0540r == c0540r11.f33233f) {
                    c0540r11.f33233f = c0540r8;
                } else {
                    c0540r11.f33234g = c0540r8;
                }
                if (c0540r10 != null) {
                    c0540r6 = c0540r10;
                } else {
                    c0540r6 = c0540r;
                }
            } else if (c0540r6 == null) {
                if (c0540r7 != null) {
                    c0540r6 = c0540r7;
                } else {
                    c0540r6 = c0540r;
                }
            }
            if (c0540r6 != c0540r) {
                C0540r c0540r13 = c0540r.f33232e;
                c0540r6.f33232e = c0540r13;
                if (c0540r13 == null) {
                    c0540rM12567b = c0540r6;
                } else if (c0540r == c0540r13.f33233f) {
                    c0540r13.f33233f = c0540r6;
                } else {
                    c0540r13.f33234g = c0540r6;
                }
                c0540r.f33232e = null;
                c0540r.f33234g = null;
                c0540r.f33233f = null;
            }
            if (!c0540r.f33236i) {
                c0540rM12567b = m12567b(c0540rM12567b, c0540r6);
            }
            this.f33229e = c0540rM12567b;
            if (c0540r == c0540r6 && (c0540r3 = c0540r.f33232e) != null) {
                if (c0540r == c0540r3.f33233f) {
                    c0540r3.f33233f = null;
                } else if (c0540r == c0540r3.f33234g) {
                    c0540r3.f33234g = null;
                }
                c0540r.f33232e = null;
            }
            return false;
        } finally {
            this.lockState = 0;
        }
    }
}
