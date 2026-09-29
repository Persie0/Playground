package p000;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.DispatchException;

/* JADX INFO: loaded from: classes2.dex */
public final class m60 extends be4 {

    /* JADX INFO: renamed from: k */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f50632k = AtomicReferenceFieldUpdater.newUpdater(m60.class, Object.class, "_disposer$volatile");

    /* JADX INFO: renamed from: l */
    public static final /* synthetic */ long f50633l = m7d.f50741a.objectFieldOffset(m60.class.getDeclaredField("_disposer$volatile"));
    private volatile /* synthetic */ Object _disposer$volatile;

    /* JADX INFO: renamed from: h */
    public final sm0 f50634h;

    /* JADX INFO: renamed from: i */
    public ci2 f50635i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ o60 f50636j;

    public m60(o60 o60Var, sm0 sm0Var) {
        this.f50636j = o60Var;
        this.f50634h = sm0Var;
    }

    @Override // p000.be4
    /* JADX INFO: renamed from: r */
    public final boolean mo3669r() {
        return false;
    }

    @Override // p000.be4
    /* JADX INFO: renamed from: s */
    public final void mo3670s(Throwable th) throws DispatchException {
        sm0 sm0Var = this.f50634h;
        if (th != null) {
            C0842cc c0842ccM21459H = sm0Var.m21459H(new dc1(th, false), null);
            if (c0842ccM21459H != null) {
                sm0Var.mo10142s(c0842ccM21459H);
                n60 n60VarM16653t = m16653t();
                if (n60VarM16653t != null) {
                    n60VarM16653t.m17246a();
                    return;
                }
                return;
            }
            return;
        }
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = o60.f53883b;
        o60 o60Var = this.f50636j;
        if (atomicIntegerFieldUpdater.decrementAndGet(o60Var) == 0) {
            x92[] x92VarArr = o60Var.f53884a;
            ArrayList arrayList = new ArrayList(x92VarArr.length);
            for (x92 x92Var : x92VarArr) {
                arrayList.add(x92Var.m24415c());
            }
            sm0Var.resumeWith(arrayList);
        }
    }

    /* JADX INFO: renamed from: t */
    public final n60 m16653t() {
        f50632k.getClass();
        return (n60) m7d.f50741a.getObjectVolatile(this, f50633l);
    }

    /* JADX INFO: renamed from: u */
    public final void m16654u(n60 n60Var) {
        f50632k.getClass();
        m7d.f50741a.putObjectVolatile(this, f50633l, n60Var);
    }
}
