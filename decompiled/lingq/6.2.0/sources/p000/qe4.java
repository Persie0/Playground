package p000;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public final class qe4 implements e34 {

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f57643b = AtomicIntegerFieldUpdater.newUpdater(qe4.class, "_isCompleting$volatile");

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f57644c = AtomicReferenceFieldUpdater.newUpdater(qe4.class, Object.class, "_rootCause$volatile");

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f57645d;

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ long f57646e;

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ long f57647f;
    private volatile /* synthetic */ Object _exceptionsHolder$volatile;
    private volatile /* synthetic */ int _isCompleting$volatile = 0;
    private volatile /* synthetic */ Object _rootCause$volatile;

    /* JADX INFO: renamed from: a */
    public final ul6 f57648a;

    static {
        Unsafe unsafe = m7d.f50741a;
        f57647f = unsafe.objectFieldOffset(qe4.class.getDeclaredField("_rootCause$volatile"));
        f57645d = AtomicReferenceFieldUpdater.newUpdater(qe4.class, Object.class, "_exceptionsHolder$volatile");
        f57646e = unsafe.objectFieldOffset(qe4.class.getDeclaredField("_exceptionsHolder$volatile"));
    }

    public qe4(ul6 ul6Var, Throwable th) {
        this.f57648a = ul6Var;
        this._rootCause$volatile = th;
    }

    /* JADX INFO: renamed from: a */
    public final void m19895a(Throwable th) {
        Throwable thM19897e = m19897e();
        if (thM19897e == null) {
            m19901i(th);
            return;
        }
        if (th == thM19897e) {
            return;
        }
        Object objM19896c = m19896c();
        if (objM19896c == null) {
            m19900h(th);
            return;
        }
        if (!(objM19896c instanceof Throwable)) {
            if (objM19896c instanceof ArrayList) {
                ((ArrayList) objM19896c).add(th);
                return;
            } else {
                C3386nv.m17632s(objM19896c, "State is ");
                return;
            }
        }
        if (th == objM19896c) {
            return;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(objM19896c);
        arrayList.add(th);
        m19900h(arrayList);
    }

    @Override // p000.e34
    /* JADX INFO: renamed from: b */
    public final boolean mo3666b() {
        return m19897e() == null;
    }

    /* JADX INFO: renamed from: c */
    public final Object m19896c() {
        f57645d.getClass();
        return m7d.f50741a.getObjectVolatile(this, f57646e);
    }

    @Override // p000.e34
    /* JADX INFO: renamed from: d */
    public final ul6 mo3667d() {
        return this.f57648a;
    }

    /* JADX INFO: renamed from: e */
    public final Throwable m19897e() {
        f57644c.getClass();
        return (Throwable) m7d.f50741a.getObjectVolatile(this, f57647f);
    }

    /* JADX INFO: renamed from: f */
    public final boolean m19898f() {
        return m19897e() != null;
    }

    /* JADX INFO: renamed from: g */
    public final ArrayList m19899g(Throwable th) {
        ArrayList arrayList;
        Object objM19896c = m19896c();
        if (objM19896c == null) {
            arrayList = new ArrayList(4);
        } else if (objM19896c instanceof Throwable) {
            ArrayList arrayList2 = new ArrayList(4);
            arrayList2.add(objM19896c);
            arrayList = arrayList2;
        } else {
            if (!(objM19896c instanceof ArrayList)) {
                C3386nv.m17632s(objM19896c, "State is ");
                return null;
            }
            arrayList = (ArrayList) objM19896c;
        }
        Throwable thM19897e = m19897e();
        if (thM19897e != null) {
            arrayList.add(0, thM19897e);
        }
        if (th != null && !th.equals(thM19897e)) {
            arrayList.add(th);
        }
        m19900h(AbstractC3584sr.f61282i);
        return arrayList;
    }

    /* JADX INFO: renamed from: h */
    public final void m19900h(Object obj) {
        f57645d.getClass();
        m7d.f50741a.putObjectVolatile(this, f57646e, obj);
    }

    /* JADX INFO: renamed from: i */
    public final void m19901i(Throwable th) {
        f57644c.getClass();
        m7d.f50741a.putObjectVolatile(this, f57647f, th);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Finishing[cancelling=");
        sb.append(m19898f());
        sb.append(", completing=");
        sb.append(f57643b.get(this) == 1);
        sb.append(", rootCause=");
        sb.append(m19897e());
        sb.append(", exceptions=");
        sb.append(m19896c());
        sb.append(", list=");
        sb.append(this.f57648a);
        sb.append(']');
        return sb.toString();
    }
}
