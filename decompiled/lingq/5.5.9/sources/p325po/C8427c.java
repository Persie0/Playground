package p325po;

import android.support.v4.media.session.C0166e;
import androidx.activity.result.C0204c;
import cm.InterfaceC2052l;
import dm.C5207g;
import java.util.Arrays;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.channels.AbstractChannel;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.internal.C7168r;
import kotlinx.coroutines.internal.OnUndeliveredElementKt;
import kotlinx.coroutines.internal.UndeliveredElementException;
import kotlinx.coroutines.selects.C7192d;
import kotlinx.coroutines.selects.InterfaceC7191c;
import p260m8.C7499b;
import p338qd.C8573r0;
import sl.C9072e;
import tl.C9322j;

/* JADX INFO: renamed from: po.c */
/* JADX INFO: loaded from: classes2.dex */
public final class C8427c<E> extends AbstractChannel<E> {

    /* JADX INFO: renamed from: d */
    public final int f45556d;

    /* JADX INFO: renamed from: e */
    public final BufferOverflow f45557e;

    /* JADX INFO: renamed from: f */
    public final ReentrantLock f45558f;

    /* JADX INFO: renamed from: g */
    public Object[] f45559g;

    /* JADX INFO: renamed from: h */
    public int f45560h;
    private volatile /* synthetic */ int size;

    /* JADX INFO: renamed from: po.c$a */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f45561a;

        static {
            int[] iArr = new int[BufferOverflow.values().length];
            iArr[BufferOverflow.SUSPEND.ordinal()] = 1;
            iArr[BufferOverflow.DROP_LATEST.ordinal()] = 2;
            iArr[BufferOverflow.DROP_OLDEST.ordinal()] = 3;
            f45561a = iArr;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public C8427c(int i10, BufferOverflow bufferOverflow, InterfaceC2052l<? super E, C9072e> interfaceC2052l) {
        super(interfaceC2052l);
        this.f45556d = i10;
        this.f45557e = bufferOverflow;
        boolean z10 = true;
        if (i10 < 1) {
            z10 = false;
        }
        if (!z10) {
            throw new IllegalArgumentException(C0166e.m762h("ArrayChannel capacity must be at least 1, but ", i10, " was specified").toString());
        }
        this.f45558f = new ReentrantLock();
        Object[] objArr = new Object[Math.min(i10, 8)];
        C9322j.m17679g0(objArr, C8573r0.f45975l);
        this.f45559g = objArr;
        this.size = 0;
    }

    /* JADX INFO: renamed from: B */
    public final void m16489B(int i10, E e10) {
        int i11 = this.f45556d;
        if (i10 >= i11) {
            Object[] objArr = this.f45559g;
            int i12 = this.f45560h;
            objArr[i12 % objArr.length] = null;
            objArr[(i10 + i12) % objArr.length] = e10;
            this.f45560h = (i12 + 1) % objArr.length;
            return;
        }
        Object[] objArr2 = this.f45559g;
        if (i10 >= objArr2.length) {
            int iMin = Math.min(objArr2.length * 2, i11);
            Object[] objArr3 = new Object[iMin];
            for (int i13 = 0; i13 < i10; i13++) {
                Object[] objArr4 = this.f45559g;
                objArr3[i13] = objArr4[(this.f45560h + i13) % objArr4.length];
            }
            Arrays.fill(objArr3, i10, iMin, C8573r0.f45975l);
            this.f45559g = objArr3;
            this.f45560h = 0;
        }
        Object[] objArr5 = this.f45559g;
        objArr5[(this.f45560h + i10) % objArr5.length] = e10;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p325po.AbstractC8425a
    /* JADX INFO: renamed from: d */
    public final Object mo16475d(C8443s c8443s) {
        ReentrantLock reentrantLock = this.f45558f;
        reentrantLock.lock();
        try {
            return super.mo16475d(c8443s);
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // p325po.AbstractC8425a
    /* JADX INFO: renamed from: e */
    public final String mo16476e() {
        StringBuilder sb2 = new StringBuilder("(buffer:capacity=");
        sb2.append(this.f45556d);
        sb2.append(",size=");
        return C0204c.m853l(sb2, this.size, ')');
    }

    @Override // p325po.AbstractC8425a
    /* JADX INFO: renamed from: n */
    public final boolean mo16481n() {
        return false;
    }

    @Override // p325po.AbstractC8425a
    /* JADX INFO: renamed from: o */
    public final boolean mo16482o() {
        return this.size == this.f45556d && this.f45557e == BufferOverflow.SUSPEND;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0049  */
    /* JADX WARN: Code duplicated, block: B:27:0x004f  */
    /* JADX WARN: Code duplicated, block: B:29:0x0052 A[LOOP:0: B:29:0x0052->B:54:?, LOOP_START] */
    /* JADX WARN: Code duplicated, block: B:33:0x005d A[Catch: all -> 0x008c, TryCatch #0 {all -> 0x008c, blocks: (B:3:0x0006, B:7:0x0013, B:11:0x001c, B:30:0x0053, B:44:0x0084, B:33:0x005d, B:35:0x0063, B:38:0x006a, B:40:0x0070, B:12:0x0021, B:19:0x003a, B:20:0x0040, B:23:0x0044), top: B:50:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x006a A[Catch: all -> 0x008c, TRY_ENTER, TryCatch #0 {all -> 0x008c, blocks: (B:3:0x0006, B:7:0x0013, B:11:0x001c, B:30:0x0053, B:44:0x0084, B:33:0x005d, B:35:0x0063, B:38:0x006a, B:40:0x0070, B:12:0x0021, B:19:0x003a, B:20:0x0040, B:23:0x0044), top: B:50:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x0083  */
    /* JADX WARN: Code duplicated, block: B:51:0x0063 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:0x0070 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x005b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:? A[LOOP:0: B:29:0x0052->B:54:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p325po.AbstractC8425a
    /* JADX INFO: renamed from: p */
    public final Object mo16483p(E e10) {
        C7168r c7168r;
        InterfaceC8439o<E> interfaceC8439oMo14339q;
        ReentrantLock reentrantLock = this.f45558f;
        reentrantLock.lock();
        try {
            int i10 = this.size;
            C8432h<?> c8432hM16478i = m16478i();
            if (c8432hM16478i != null) {
                reentrantLock.unlock();
                return c8432hM16478i;
            }
            int i11 = this.f45556d;
            C7168r c7168r2 = C8573r0.f45956H;
            if (i10 >= i11) {
                int i12 = a.f45561a[this.f45557e.ordinal()];
                if (i12 == 1) {
                    c7168r = C8573r0.f45957I;
                } else if (i12 == 2) {
                    c7168r = c7168r2;
                } else if (i12 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                if (c7168r != null) {
                    reentrantLock.unlock();
                    return c7168r;
                }
                if (i10 == 0) {
                    while (true) {
                        interfaceC8439oMo14339q = mo14339q();
                        if (interfaceC8439oMo14339q == null) {
                            break;
                        }
                        if (interfaceC8439oMo14339q instanceof C8432h) {
                            this.size = i10;
                            reentrantLock.unlock();
                            return interfaceC8439oMo14339q;
                        }
                        if (interfaceC8439oMo14339q.mo14350c(e10) != null) {
                            this.size = i10;
                            C9072e c9072e = C9072e.f47360a;
                            reentrantLock.unlock();
                            interfaceC8439oMo14339q.mo14351p(e10);
                            return interfaceC8439oMo14339q.mo16491g();
                        }
                    }
                }
                m16489B(i10, e10);
                reentrantLock.unlock();
                return c7168r2;
            }
            this.size = i10 + 1;
            c7168r = null;
            if (c7168r != null) {
                reentrantLock.unlock();
                return c7168r;
            }
            if (i10 == 0) {
                while (true) {
                    interfaceC8439oMo14339q = mo14339q();
                    if (interfaceC8439oMo14339q == null) {
                        break;
                        break;
                    }
                    if (interfaceC8439oMo14339q instanceof C8432h) {
                        this.size = i10;
                        reentrantLock.unlock();
                        return interfaceC8439oMo14339q;
                    }
                    if (interfaceC8439oMo14339q.mo14350c(e10) != null) {
                        this.size = i10;
                        C9072e c9072e2 = C9072e.f47360a;
                        reentrantLock.unlock();
                        interfaceC8439oMo14339q.mo14351p(e10);
                        return interfaceC8439oMo14339q.mo16491g();
                    }
                }
            }
            m16489B(i10, e10);
            reentrantLock.unlock();
            return c7168r2;
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    @Override // kotlinx.coroutines.channels.AbstractChannel
    /* JADX INFO: renamed from: s */
    public final boolean mo14340s(AbstractC8437m<? super E> abstractC8437m) {
        ReentrantLock reentrantLock = this.f45558f;
        reentrantLock.lock();
        try {
            boolean zMo14340s = super.mo14340s(abstractC8437m);
            reentrantLock.unlock();
            return zMo14340s;
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    @Override // kotlinx.coroutines.channels.AbstractChannel
    /* JADX INFO: renamed from: t */
    public final boolean mo14341t() {
        return false;
    }

    @Override // kotlinx.coroutines.channels.AbstractChannel
    /* JADX INFO: renamed from: u */
    public final boolean mo14342u() {
        return this.size == 0;
    }

    @Override // kotlinx.coroutines.channels.AbstractChannel
    /* JADX INFO: renamed from: v */
    public final boolean mo14343v() {
        ReentrantLock reentrantLock = this.f45558f;
        reentrantLock.lock();
        try {
            boolean zMo14343v = super.mo14343v();
            reentrantLock.unlock();
            return zMo14343v;
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlinx.coroutines.channels.AbstractChannel
    /* JADX INFO: renamed from: w */
    public final void mo14344w(boolean z10) {
        InterfaceC2052l<E, C9072e> interfaceC2052l = this.f45552a;
        ReentrantLock reentrantLock = this.f45558f;
        reentrantLock.lock();
        try {
            int i10 = this.size;
            UndeliveredElementException undeliveredElementExceptionM14432b = null;
            for (int i11 = 0; i11 < i10; i11++) {
                Object obj = this.f45559g[this.f45560h];
                C7168r c7168r = C8573r0.f45975l;
                if (interfaceC2052l != null && obj != c7168r) {
                    undeliveredElementExceptionM14432b = OnUndeliveredElementKt.m14432b(interfaceC2052l, obj, undeliveredElementExceptionM14432b);
                }
                Object[] objArr = this.f45559g;
                int i12 = this.f45560h;
                objArr[i12] = c7168r;
                this.f45560h = (i12 + 1) % objArr.length;
            }
            this.size = 0;
            C9072e c9072e = C9072e.f47360a;
            reentrantLock.unlock();
            super.mo14344w(z10);
            if (undeliveredElementExceptionM14432b != null) {
                throw undeliveredElementExceptionM14432b;
            }
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0084  */
    @Override // kotlinx.coroutines.channels.AbstractChannel
    /* JADX INFO: renamed from: y */
    public final Object mo14346y() {
        Object objMo16486L;
        ReentrantLock reentrantLock = this.f45558f;
        reentrantLock.lock();
        try {
            int i10 = this.size;
            Object obj = C8573r0.f45958J;
            if (i10 == 0) {
                C8432h<?> c8432hM16478i = m16478i();
                if (c8432hM16478i != null) {
                    obj = c8432hM16478i;
                }
                reentrantLock.unlock();
                return obj;
            }
            Object[] objArr = this.f45559g;
            int i11 = this.f45560h;
            Object obj2 = objArr[i11];
            AbstractC8441q abstractC8441q = null;
            objArr[i11] = null;
            this.size = i10 - 1;
            boolean z10 = false;
            if (i10 == this.f45556d) {
                AbstractC8441q abstractC8441q2 = null;
                while (true) {
                    AbstractC8441q abstractC8441qM16484r = m16484r();
                    if (abstractC8441qM16484r == null) {
                        abstractC8441q = abstractC8441q2;
                    } else {
                        if (abstractC8441qM16484r.mo16488O(null) != null) {
                            objMo16486L = abstractC8441qM16484r.mo16486L();
                            z10 = true;
                            abstractC8441q = abstractC8441qM16484r;
                            break;
                        }
                        abstractC8441qM16484r.mo16492P();
                        abstractC8441q2 = abstractC8441qM16484r;
                    }
                }
                if (objMo16486L != obj && !(objMo16486L instanceof C8432h)) {
                    this.size = i10;
                    Object[] objArr2 = this.f45559g;
                    objArr2[(this.f45560h + i10) % objArr2.length] = objMo16486L;
                }
                this.f45560h = (this.f45560h + 1) % this.f45559g.length;
                C9072e c9072e = C9072e.f47360a;
                reentrantLock.unlock();
                if (z10) {
                    C5207g.m11108c(abstractC8441q);
                    abstractC8441q.mo16485K();
                }
                return obj2;
            }
            objMo16486L = obj;
            if (objMo16486L != obj) {
                this.size = i10;
                Object[] objArr3 = this.f45559g;
                objArr3[(this.f45560h + i10) % objArr3.length] = objMo16486L;
            }
            this.f45560h = (this.f45560h + 1) % this.f45559g.length;
            C9072e c9072e2 = C9072e.f47360a;
            reentrantLock.unlock();
            if (z10) {
                C5207g.m11108c(abstractC8441q);
                abstractC8441q.mo16485K();
            }
            return obj2;
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlinx.coroutines.channels.AbstractChannel
    /* JADX INFO: renamed from: z */
    public final Object mo14347z(InterfaceC7191c<?> interfaceC7191c) {
        boolean z10;
        Object objMo14505m;
        ReentrantLock reentrantLock = this.f45558f;
        reentrantLock.lock();
        try {
            int i10 = this.size;
            Object obj = C8573r0.f45958J;
            if (i10 == 0) {
                C8432h<?> c8432hM16478i = m16478i();
                if (c8432hM16478i != null) {
                    obj = c8432hM16478i;
                }
                reentrantLock.unlock();
                return obj;
            }
            Object[] objArr = this.f45559g;
            int i11 = this.f45560h;
            Object obj2 = objArr[i11];
            Object objM14430m = null;
            objArr[i11] = null;
            this.size = i10 - 1;
            if (i10 != this.f45556d) {
                z10 = false;
                objMo14505m = obj;
                break;
            }
            while (true) {
                AbstractChannel.C7089g c7089g = new AbstractChannel.C7089g(this.f45553b);
                objMo14505m = interfaceC7191c.mo14505m(c7089g);
                if (objMo14505m != null) {
                    if (objMo14505m == obj) {
                        z10 = false;
                        objMo14505m = obj;
                        break;
                    }
                    if (objMo14505m != C7499b.f41431f) {
                        if (objMo14505m == C7192d.f40506b) {
                            this.size = i10;
                            this.f45559g[this.f45560h] = obj2;
                            reentrantLock.unlock();
                            return objMo14505m;
                        }
                        if (objMo14505m instanceof C8432h) {
                            z10 = true;
                            objM14430m = objMo14505m;
                            break;
                        }
                        throw new IllegalStateException(("performAtomicTrySelect(describeTryOffer) returned " + objMo14505m).toString());
                    }
                } else {
                    objM14430m = c7089g.m14430m();
                    objMo14505m = ((AbstractC8441q) objM14430m).mo16486L();
                    z10 = true;
                    break;
                }
            }
            if (objMo14505m != obj && !(objMo14505m instanceof C8432h)) {
                this.size = i10;
                Object[] objArr2 = this.f45559g;
                objArr2[(this.f45560h + i10) % objArr2.length] = objMo14505m;
            } else if (!interfaceC7191c.mo14503i()) {
                this.size = i10;
                this.f45559g[this.f45560h] = obj2;
                C7168r c7168r = C7192d.f40506b;
                reentrantLock.unlock();
                return c7168r;
            }
            this.f45560h = (this.f45560h + 1) % this.f45559g.length;
            C9072e c9072e = C9072e.f47360a;
            reentrantLock.unlock();
            if (z10) {
                C5207g.m11108c(objM14430m);
                ((AbstractC8441q) objM14430m).mo16485K();
            }
            return obj2;
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }
}
