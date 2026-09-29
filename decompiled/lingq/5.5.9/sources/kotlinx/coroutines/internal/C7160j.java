package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: kotlinx.coroutines.internal.j */
/* JADX INFO: loaded from: classes2.dex */
public final class C7160j<E> {
    private volatile /* synthetic */ Object _next = null;
    private volatile /* synthetic */ long _state = 0;

    /* JADX INFO: renamed from: a */
    public final int f40433a;

    /* JADX INFO: renamed from: b */
    public final boolean f40434b;

    /* JADX INFO: renamed from: c */
    public final int f40435c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ AtomicReferenceArray f40436d;

    /* JADX INFO: renamed from: g */
    public static final C7168r f40432g = new C7168r("REMOVE_FROZEN");

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f40430e = AtomicReferenceFieldUpdater.newUpdater(C7160j.class, Object.class, "_next");

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ AtomicLongFieldUpdater f40431f = AtomicLongFieldUpdater.newUpdater(C7160j.class, "_state");

    /* JADX INFO: renamed from: kotlinx.coroutines.internal.j$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final int f40437a;

        public a(int i10) {
            this.f40437a = i10;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public C7160j(int i10, boolean z10) {
        this.f40433a = i10;
        this.f40434b = z10;
        int i11 = i10 - 1;
        this.f40435c = i11;
        this.f40436d = new AtomicReferenceArray(i10);
        boolean z11 = false;
        if (!(i11 <= 1073741823)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (!((i10 & i11) == 0 ? true : z11)) {
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    /* JADX INFO: renamed from: a */
    public final int m14452a(E e10) {
        while (true) {
            long j10 = this._state;
            if ((3458764513820540928L & j10) != 0) {
                return (j10 & 2305843009213693952L) != 0 ? 2 : 1;
            }
            int i10 = (int) ((1073741823 & j10) >> 0);
            int i11 = (int) ((1152921503533105152L & j10) >> 30);
            int i12 = this.f40435c;
            if (((i11 + 2) & i12) == (i10 & i12)) {
                return 1;
            }
            if (!this.f40434b && this.f40436d.get(i11 & i12) != null) {
                int i13 = this.f40433a;
                if (i13 < 1024 || ((i11 - i10) & 1073741823) > (i13 >> 1)) {
                    return 1;
                }
            } else if (f40431f.compareAndSet(this, j10, ((-1152921503533105153L) & j10) | (((long) ((i11 + 1) & 1073741823)) << 30))) {
                this.f40436d.set(i11 & i12, e10);
                C7160j<E> c7160jM14456e = this;
                while ((c7160jM14456e._state & 1152921504606846976L) != 0) {
                    c7160jM14456e = c7160jM14456e.m14456e();
                    AtomicReferenceArray atomicReferenceArray = c7160jM14456e.f40436d;
                    int i14 = c7160jM14456e.f40435c & i11;
                    Object obj = atomicReferenceArray.get(i14);
                    if ((obj instanceof a) && ((a) obj).f40437a == i11) {
                        atomicReferenceArray.set(i14, e10);
                    } else {
                        c7160jM14456e = null;
                    }
                    if (c7160jM14456e == null) {
                        break;
                    }
                }
                return 0;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final boolean m14453b() {
        long j10;
        do {
            j10 = this._state;
            if ((j10 & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j10) != 0) {
                return false;
            }
        } while (!f40431f.compareAndSet(this, j10, j10 | 2305843009213693952L));
        return true;
    }

    /* JADX INFO: renamed from: c */
    public final int m14454c() {
        long j10 = this._state;
        return (((int) ((j10 & 1152921503533105152L) >> 30)) - ((int) ((1073741823 & j10) >> 0))) & 1073741823;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m14455d() {
        long j10 = this._state;
        return ((int) ((1073741823 & j10) >> 0)) == ((int) ((j10 & 1152921503533105152L) >> 30));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e */
    public final C7160j<E> m14456e() {
        long j10;
        while (true) {
            j10 = this._state;
            if ((j10 & 1152921504606846976L) != 0) {
                break;
            }
            long j11 = j10 | 1152921504606846976L;
            if (f40431f.compareAndSet(this, j10, j11)) {
                j10 = j11;
                break;
            }
        }
        while (true) {
            C7160j<E> c7160j = (C7160j) this._next;
            if (c7160j != null) {
                return c7160j;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f40430e;
            C7160j c7160j2 = new C7160j(this.f40433a * 2, this.f40434b);
            int i10 = (int) ((1073741823 & j10) >> 0);
            int i11 = (int) ((1152921503533105152L & j10) >> 30);
            while (true) {
                int i12 = this.f40435c;
                int i13 = i10 & i12;
                if (i13 == (i12 & i11)) {
                    break;
                }
                Object aVar = this.f40436d.get(i13);
                if (aVar == null) {
                    aVar = new a(i10);
                }
                c7160j2.f40436d.set(c7160j2.f40435c & i10, aVar);
                i10++;
            }
            c7160j2._state = (-1152921504606846977L) & j10;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, c7160j2) && atomicReferenceFieldUpdater.get(this) == null) {
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final Object m14457f() {
        while (true) {
            long j10 = this._state;
            if ((j10 & 1152921504606846976L) != 0) {
                return f40432g;
            }
            int i10 = (int) ((j10 & 1073741823) >> 0);
            int i11 = this.f40435c;
            int i12 = ((int) ((1152921503533105152L & j10) >> 30)) & i11;
            int i13 = i11 & i10;
            if (i12 == i13) {
                return null;
            }
            Object obj = this.f40436d.get(i13);
            if (obj == null) {
                if (this.f40434b) {
                    return null;
                }
            } else {
                if (obj instanceof a) {
                    return null;
                }
                long j11 = ((long) ((i10 + 1) & 1073741823)) << 0;
                if (f40431f.compareAndSet(this, j10, (j10 & (-1073741824)) | j11)) {
                    this.f40436d.set(this.f40435c & i10, null);
                    return obj;
                }
                if (this.f40434b) {
                    C7160j<E> c7160jM14456e = this;
                    while (true) {
                        long j12 = c7160jM14456e._state;
                        int i14 = (int) ((j12 & 1073741823) >> 0);
                        if ((j12 & 1152921504606846976L) != 0) {
                            c7160jM14456e = c7160jM14456e.m14456e();
                        } else {
                            if (f40431f.compareAndSet(c7160jM14456e, j12, (j12 & (-1073741824)) | j11)) {
                                c7160jM14456e.f40436d.set(c7160jM14456e.f40435c & i14, null);
                                c7160jM14456e = null;
                            } else {
                                continue;
                            }
                        }
                        if (c7160jM14456e == null) {
                            return obj;
                        }
                    }
                }
            }
        }
    }
}
