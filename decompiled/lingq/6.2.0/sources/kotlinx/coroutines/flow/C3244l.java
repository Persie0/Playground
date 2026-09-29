package kotlinx.coroutines.flow;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.channels.BufferOverflow;
import p000.AbstractC3352my;
import p000.AbstractC3706w1;
import p000.AbstractC3743x1;
import p000.C0842cc;
import p000.c83;
import p000.fa4;
import p000.fh9;
import p000.jj3;
import p000.kn1;
import p000.m7d;
import p000.pb1;
import p000.sm0;
import p000.thb;
import p000.u66;
import p000.xfa;

/* JADX INFO: renamed from: kotlinx.coroutines.flow.l */
/* JADX INFO: loaded from: classes.dex */
public final class C3244l extends AbstractC3706w1 implements u66, c83, jj3 {

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f48154f = AtomicReferenceFieldUpdater.newUpdater(C3244l.class, Object.class, "_state$volatile");

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ long f48155g = m7d.f50741a.objectFieldOffset(C3244l.class.getDeclaredField("_state$volatile"));
    private volatile /* synthetic */ Object _state$volatile;

    /* JADX INFO: renamed from: e */
    public int f48156e;

    public C3244l(Object obj) {
        this._state$volatile = obj;
    }

    @Override // p000.jj3
    /* JADX INFO: renamed from: b */
    public final c83 mo38b(kn1 kn1Var, int i, BufferOverflow bufferOverflow) {
        return (((i < 0 || i >= 2) && i != -2) || bufferOverflow != BufferOverflow.DROP_OLDEST) ? pb1.m19051u(this, kn1Var, i, bufferOverflow) : this;
    }

    /* JADX WARN: Code duplicated, block: B:53:0x00d6 A[Catch: all -> 0x0036, TryCatch #0 {all -> 0x0036, blocks: (B:14:0x0032, B:28:0x006c, B:30:0x0074, B:33:0x007b, B:34:0x007f, B:36:0x0082, B:46:0x00a3, B:49:0x00b3, B:50:0x00cf, B:56:0x00df, B:53:0x00d6, B:55:0x00dc, B:38:0x0088, B:42:0x008f, B:21:0x0047, B:24:0x004f, B:27:0x005d), top: B:63:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:67:0x00dc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:? A[LOOP:0: B:50:0x00cf->B:68:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x00b2 -> B:28:0x006c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // p000.c83
    public final java.lang.Object collect(p000.e83 r14, kotlin.coroutines.Continuation r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 239
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.C3244l.collect(e83, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // p000.AbstractC3706w1
    /* JADX INFO: renamed from: d */
    public final AbstractC3743x1 mo15549d() {
        return new fh9();
    }

    @Override // p000.AbstractC3706w1
    /* JADX INFO: renamed from: e */
    public final AbstractC3743x1[] mo15550e() {
        return new fh9[2];
    }

    @Override // p000.e83
    public final Object emit(Object obj, Continuation continuation) {
        m15571i(obj);
        return xfa.f68157a;
    }

    @Override // p000.eh9
    public final Object getValue() {
        C0842cc c0842cc = thb.f62314j;
        f48154f.getClass();
        Object objectVolatile = m7d.f50741a.getObjectVolatile(this, f48155g);
        if (objectVolatile == c0842cc) {
            return null;
        }
        return objectVolatile;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m15570h(Object obj, Object obj2) {
        C0842cc c0842cc = thb.f62314j;
        if (obj == null) {
            obj = c0842cc;
        }
        if (obj2 == null) {
            obj2 = c0842cc;
        }
        return m15572j(obj, obj2);
    }

    /* JADX INFO: renamed from: i */
    public final void m15571i(Object obj) {
        if (obj == null) {
            obj = thb.f62314j;
        }
        m15572j(null, obj);
    }

    /* JADX INFO: renamed from: j */
    public final boolean m15572j(Object obj, Object obj2) {
        int i;
        AbstractC3743x1[] abstractC3743x1Arr;
        C0842cc c0842cc;
        synchronized (this) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f48154f;
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (obj != null && !fa4.m11650l(obj3, obj)) {
                return false;
            }
            if (fa4.m11650l(obj3, obj2)) {
                return true;
            }
            atomicReferenceFieldUpdater.set(this, obj2);
            int i2 = this.f48156e;
            if ((i2 & 1) != 0) {
                this.f48156e = i2 + 2;
                return true;
            }
            int i3 = i2 + 1;
            this.f48156e = i3;
            AbstractC3743x1[] abstractC3743x1Arr2 = this.f66194a;
            while (true) {
                fh9[] fh9VarArr = (fh9[]) abstractC3743x1Arr2;
                if (fh9VarArr != null) {
                    for (fh9 fh9Var : fh9VarArr) {
                        if (fh9Var != null) {
                            AtomicReference atomicReference = fh9Var.f39111a;
                            while (true) {
                                Object obj4 = atomicReference.get();
                                if (obj4 == null || obj4 == (c0842cc = AbstractC3352my.f52020g)) {
                                    break;
                                }
                                C0842cc c0842cc2 = AbstractC3352my.f52019f;
                                if (obj4 != c0842cc2) {
                                    do {
                                        if (atomicReference.compareAndSet(obj4, c0842cc2)) {
                                            ((sm0) obj4).resumeWith(xfa.f68157a);
                                            break;
                                        }
                                    } while (atomicReference.get() == obj4);
                                } else {
                                    do {
                                        if (atomicReference.compareAndSet(obj4, c0842cc)) {
                                            break;
                                        }
                                    } while (atomicReference.get() == obj4);
                                }
                            }
                        }
                    }
                }
                synchronized (this) {
                    i = this.f48156e;
                    if (i == i3) {
                        this.f48156e = i3 + 1;
                        return true;
                    }
                    abstractC3743x1Arr = this.f66194a;
                }
                abstractC3743x1Arr2 = abstractC3743x1Arr;
                i3 = i;
            }
        }
    }
}
