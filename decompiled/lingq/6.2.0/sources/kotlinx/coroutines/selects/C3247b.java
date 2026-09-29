package kotlinx.coroutines.selects;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.DispatchException;
import p000.AbstractC3393o1;
import p000.AbstractC3584sr;
import p000.C0842cc;
import p000.C3386nv;
import p000.aj3;
import p000.au8;
import p000.e65;
import p000.fa4;
import p000.fu8;
import p000.gm5;
import p000.gu8;
import p000.kn1;
import p000.m7d;
import p000.nm0;
import p000.qm0;
import p000.sm0;
import p000.thb;
import p000.u91;
import p000.vi3;
import p000.vz1;
import p000.xfa;
import p000.z1b;
import p000.zi3;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: kotlinx.coroutines.selects.b */
/* JADX INFO: loaded from: classes.dex */
public final class C3247b implements nm0, gu8, z1b {

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f48168f = AtomicReferenceFieldUpdater.newUpdater(C3247b.class, Object.class, "state$volatile");

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ long f48169g = m7d.f50741a.objectFieldOffset(C3247b.class.getDeclaredField("state$volatile"));

    /* JADX INFO: renamed from: a */
    public final kn1 f48170a;

    /* JADX INFO: renamed from: c */
    public Object f48172c;
    private volatile /* synthetic */ Object state$volatile = thb.f62317m;

    /* JADX INFO: renamed from: b */
    public ArrayList f48171b = new ArrayList(2);

    /* JADX INFO: renamed from: d */
    public int f48173d = -1;

    /* JADX INFO: renamed from: e */
    public Object f48174e = thb.f62320p;

    public C3247b(kn1 kn1Var) {
        this.f48170a = kn1Var;
    }

    @Override // p000.z1b
    /* JADX INFO: renamed from: a */
    public final void mo10138a(au8 au8Var, int i) {
        this.f48172c = au8Var;
        this.f48173d = i;
    }

    @Override // p000.nm0
    /* JADX INFO: renamed from: b */
    public final void mo15586b(Throwable th) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Object objectVolatile;
        do {
            atomicReferenceFieldUpdater = f48168f;
            atomicReferenceFieldUpdater.getClass();
            objectVolatile = m7d.f50741a.getObjectVolatile(this, f48169g);
            if (objectVolatile == thb.f62318n) {
                return;
            }
        } while (!e65.m10867C(atomicReferenceFieldUpdater, this, objectVolatile));
        ArrayList arrayList = this.f48171b;
        if (arrayList == null) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((fu8) it.next()).m12200a();
        }
        this.f48174e = thb.f62320p;
        this.f48171b = null;
    }

    /* JADX INFO: renamed from: c */
    public final void m15587c(fu8 fu8Var) {
        ArrayList<fu8> arrayList = this.f48171b;
        if (arrayList == null) {
            return;
        }
        for (fu8 fu8Var2 : arrayList) {
            if (fu8Var2 != fu8Var) {
                fu8Var2.m12200a();
            }
        }
        C0842cc c0842cc = thb.f62318n;
        f48168f.getClass();
        m7d.f50741a.putObjectVolatile(this, f48169g, c0842cc);
        this.f48174e = thb.f62320p;
        this.f48171b = null;
    }

    /* JADX INFO: renamed from: d */
    public final Object m15588d(ContinuationImpl continuationImpl) {
        f48168f.getClass();
        Object objectVolatile = m7d.f50741a.getObjectVolatile(this, f48169g);
        objectVolatile.getClass();
        fu8 fu8Var = (fu8) objectVolatile;
        Object obj = this.f48174e;
        m15587c(fu8Var);
        aj3 aj3Var = fu8Var.f39708c;
        Object obj2 = fu8Var.f39706a;
        Object obj3 = fu8Var.f39709d;
        Object objInvoke = aj3Var.invoke(obj2, obj3, obj);
        Continuation continuation = fu8Var.f39710e;
        return obj3 == thb.f62321q ? ((vi3) continuation).invoke(continuationImpl) : ((zi3) continuation).invoke(objInvoke, continuationImpl);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: e */
    public final Object m15589e(ContinuationImpl continuationImpl) throws Throwable {
        SelectImplementation$doSelectSuspend$1 selectImplementation$doSelectSuspend$1;
        if (continuationImpl instanceof SelectImplementation$doSelectSuspend$1) {
            selectImplementation$doSelectSuspend$1 = (SelectImplementation$doSelectSuspend$1) continuationImpl;
            int i = selectImplementation$doSelectSuspend$1.f48167c;
            if ((i & Integer.MIN_VALUE) != 0) {
                selectImplementation$doSelectSuspend$1.f48167c = i - Integer.MIN_VALUE;
            } else {
                selectImplementation$doSelectSuspend$1 = new SelectImplementation$doSelectSuspend$1(this, continuationImpl);
            }
        } else {
            selectImplementation$doSelectSuspend$1 = new SelectImplementation$doSelectSuspend$1(this, continuationImpl);
        }
        Object obj = selectImplementation$doSelectSuspend$1.f48165a;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = selectImplementation$doSelectSuspend$1.f48167c;
        if (i2 == 0) {
            AbstractC3193b.m15359b(obj);
            selectImplementation$doSelectSuspend$1.f48167c = 1;
            if (m15594j(selectImplementation$doSelectSuspend$1) != obj2) {
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                AbstractC3193b.m15359b(obj);
                return obj;
            }
            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC3193b.m15359b(obj);
        selectImplementation$doSelectSuspend$1.f48167c = 2;
        Object objM15588d = m15588d(selectImplementation$doSelectSuspend$1);
        return objM15588d == obj2 ? obj2 : objM15588d;
    }

    /* JADX INFO: renamed from: f */
    public final fu8 m15590f(Object obj) {
        ArrayList arrayList = this.f48171b;
        Object obj2 = null;
        if (arrayList == null) {
            return null;
        }
        for (Object obj3 : arrayList) {
            if (((fu8) obj3).f39706a == obj) {
                obj2 = obj3;
                break;
            }
        }
        fu8 fu8Var = (fu8) obj2;
        if (fu8Var != null) {
            return fu8Var;
        }
        throw new IllegalStateException(("Clause with object " + obj + " is not found").toString());
    }

    /* JADX INFO: renamed from: g */
    public final boolean m15591g() {
        f48168f.getClass();
        return m7d.f50741a.getObjectVolatile(this, f48169g) instanceof fu8;
    }

    /* JADX INFO: renamed from: h */
    public final void m15592h(fu8 fu8Var, boolean z) {
        Object obj = fu8Var.f39706a;
        f48168f.getClass();
        Unsafe unsafe = m7d.f50741a;
        long j = f48169g;
        if (unsafe.getObjectVolatile(this, j) instanceof fu8) {
            return;
        }
        if (!z) {
            ArrayList arrayList = this.f48171b;
            arrayList.getClass();
            if (!arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if (((fu8) it.next()).f39706a == obj) {
                        gm5.m12751g(AbstractC3393o1.m17733h(obj, "Cannot use select clauses on the same object: "));
                        return;
                    }
                }
            }
        }
        fu8Var.f39707b.invoke(obj, this, fu8Var.f39709d);
        if (this.f48174e != thb.f62320p) {
            m7d.f50741a.putObjectVolatile(this, j, fu8Var);
            return;
        }
        if (!z) {
            ArrayList arrayList2 = this.f48171b;
            arrayList2.getClass();
            arrayList2.add(fu8Var);
        }
        fu8Var.f39712g = this.f48172c;
        fu8Var.f39713h = this.f48173d;
        this.f48172c = null;
        this.f48173d = -1;
    }

    /* JADX INFO: renamed from: i */
    public final int m15593i(Object obj, Object obj2) {
        C3247b c3247b;
        Unsafe unsafe;
        Unsafe unsafe2;
        while (true) {
            f48168f.getClass();
            Unsafe unsafe3 = m7d.f50741a;
            long j = f48169g;
            Object objectVolatile = unsafe3.getObjectVolatile(this, j);
            if (objectVolatile instanceof qm0) {
                fu8 fu8VarM15590f = this.m15590f(obj);
                if (fu8VarM15590f != null) {
                    aj3 aj3Var = fu8VarM15590f.f39711f;
                    aj3 aj3Var2 = aj3Var != null ? (aj3) aj3Var.invoke(this, fu8VarM15590f.f39709d, obj2) : null;
                    while (true) {
                        Unsafe unsafe4 = m7d.f50741a;
                        c3247b = this;
                        if (unsafe4.compareAndSwapObject(c3247b, f48169g, objectVolatile, fu8VarM15590f)) {
                            qm0 qm0Var = (qm0) objectVolatile;
                            c3247b.f48174e = obj2;
                            C0842cc c0842ccMo10139d = qm0Var.mo10139d(xfa.f68157a, aj3Var2);
                            if (c0842ccMo10139d == null) {
                                c3247b.f48174e = thb.f62320p;
                                return 2;
                            }
                            qm0Var.mo10142s(c0842ccMo10139d);
                            return 0;
                        }
                        if (unsafe4.getObjectVolatile(c3247b, j) != objectVolatile) {
                            break;
                        }
                        this = c3247b;
                    }
                } else {
                    continue;
                }
            } else {
                c3247b = this;
                if (fa4.m11650l(objectVolatile, thb.f62318n) || (objectVolatile instanceof fu8)) {
                    return 3;
                }
                if (fa4.m11650l(objectVolatile, thb.f62319o)) {
                    return 2;
                }
                if (fa4.m11650l(objectVolatile, thb.f62317m)) {
                    List listM23604J = vz1.m23604J(obj);
                    do {
                        unsafe2 = m7d.f50741a;
                        if (unsafe2.compareAndSwapObject(c3247b, f48169g, objectVolatile, listM23604J)) {
                            return 1;
                        }
                    } while (unsafe2.getObjectVolatile(c3247b, j) == objectVolatile);
                } else {
                    if (!(objectVolatile instanceof List)) {
                        C3386nv.m17632s(objectVolatile, "Unexpected state: ");
                        return 0;
                    }
                    ArrayList arrayListM22604V0 = u91.m22604V0((Collection) objectVolatile, obj);
                    do {
                        unsafe = m7d.f50741a;
                        if (unsafe.compareAndSwapObject(c3247b, f48169g, objectVolatile, arrayListM22604V0)) {
                            return 1;
                        }
                    } while (unsafe.getObjectVolatile(c3247b, j) == objectVolatile);
                }
            }
            this = c3247b;
        }
    }

    /* JADX INFO: renamed from: j */
    public final Object m15594j(Continuation continuation) throws DispatchException {
        xfa xfaVar;
        sm0 sm0Var;
        Unsafe unsafe;
        sm0 sm0Var2 = new sm0(1, AbstractC3584sr.m21600K(continuation));
        sm0Var2.m21468u();
        loop0: while (true) {
            f48168f.getClass();
            Unsafe unsafe2 = m7d.f50741a;
            long j = f48169g;
            Object objectVolatile = unsafe2.getObjectVolatile(this, j);
            sm0 sm0Var3 = sm0Var2;
            C0842cc c0842cc = thb.f62317m;
            xfaVar = xfa.f68157a;
            if (objectVolatile == c0842cc) {
                sm0 sm0Var4 = sm0Var3;
                while (true) {
                    Unsafe unsafe3 = m7d.f50741a;
                    sm0Var = sm0Var4;
                    if (unsafe3.compareAndSwapObject(this, f48169g, objectVolatile, sm0Var4)) {
                        sm0Var.m21471x(this);
                        break loop0;
                    }
                    if (unsafe3.getObjectVolatile(this, j) != objectVolatile) {
                        break;
                    }
                    sm0Var4 = sm0Var;
                }
                sm0Var2 = sm0Var;
            } else {
                sm0Var = sm0Var3;
                if (!(objectVolatile instanceof List)) {
                    if (!(objectVolatile instanceof fu8)) {
                        C3386nv.m17632s(objectVolatile, "unexpected state: ");
                        return null;
                    }
                    fu8 fu8Var = (fu8) objectVolatile;
                    Object obj = this.f48174e;
                    aj3 aj3Var = fu8Var.f39711f;
                    sm0Var.mo10140j(xfaVar, aj3Var != null ? (aj3) aj3Var.invoke(this, fu8Var.f39709d, obj) : null);
                    break;
                }
                do {
                    unsafe = m7d.f50741a;
                    if (unsafe.compareAndSwapObject(this, f48169g, objectVolatile, c0842cc)) {
                        Iterator it = ((Iterable) objectVolatile).iterator();
                        while (it.hasNext()) {
                            fu8 fu8VarM15590f = m15590f(it.next());
                            fu8VarM15590f.getClass();
                            fu8VarM15590f.f39712g = null;
                            fu8VarM15590f.f39713h = -1;
                            m15592h(fu8VarM15590f, true);
                        }
                        break;
                    }
                } while (unsafe.getObjectVolatile(this, j) == objectVolatile);
                sm0Var2 = sm0Var;
            }
        }
        Object objM21466r = sm0Var.m21466r();
        return objM21466r == CoroutineSingletons.COROUTINE_SUSPENDED ? objM21466r : xfaVar;
    }
}
