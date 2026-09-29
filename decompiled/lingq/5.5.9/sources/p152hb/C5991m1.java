package p152hb;

import ae.C0062b;
import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Status;
import java.util.Map;
import p136gc.C5752h;
import p289o5.C7940t;
import p338qd.C8573r0;

/* JADX INFO: renamed from: hb.m1 */
/* JADX INFO: loaded from: classes.dex */
public final class C5991m1<ResultT> extends AbstractC6029z0 {

    /* JADX INFO: renamed from: b */
    public final AbstractC5989m<Object, ResultT> f35544b;

    /* JADX INFO: renamed from: c */
    public final C5752h<ResultT> f35545c;

    /* JADX INFO: renamed from: d */
    public final C8573r0 f35546d;

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public C5991m1(C5976h1 c5976h1, C5752h c5752h, C8573r0 c8573r0) {
        super(2);
        this.f35545c = c5752h;
        this.f35544b = c5976h1;
        this.f35546d = c8573r0;
        if (c5976h1.f35528b) {
            throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }

    @Override // p152hb.AbstractC5997o1
    /* JADX INFO: renamed from: a */
    public final void mo12434a(Status status) {
        this.f35546d.getClass();
        this.f35545c.m12115c(C0062b.m316V0(status));
    }

    @Override // p152hb.AbstractC5997o1
    /* JADX INFO: renamed from: b */
    public final void mo12435b(RuntimeException runtimeException) {
        this.f35545c.m12115c(runtimeException);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p152hb.AbstractC5997o1
    /* JADX INFO: renamed from: c */
    public final void mo12436c(C6008s0<?> c6008s0) throws DeadObjectException {
        C5752h<ResultT> c5752h = this.f35545c;
        try {
            this.f35544b.mo12422a(c6008s0.f35582b, c5752h);
        } catch (DeadObjectException e10) {
            throw e10;
        } catch (RemoteException e11) {
            mo12434a(AbstractC5997o1.m12448e(e11));
        } catch (RuntimeException e12) {
            c5752h.m12115c(e12);
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // p152hb.AbstractC5997o1
    /* JADX INFO: renamed from: d */
    public final void mo12438d(C5998p c5998p, boolean z10) {
        Map<C5752h<?>, Boolean> map = c5998p.f35568b;
        Boolean boolValueOf = Boolean.valueOf(z10);
        C5752h<ResultT> c5752h = this.f35545c;
        map.put((C5752h<?>) c5752h, boolValueOf);
        c5752h.f34812a.mo12100b(new C7940t(c5998p, c5752h));
    }

    @Override // p152hb.AbstractC6029z0
    /* JADX INFO: renamed from: f */
    public final boolean mo12442f(C6008s0<?> c6008s0) {
        return this.f35544b.f35528b;
    }

    @Override // p152hb.AbstractC6029z0
    /* JADX INFO: renamed from: g */
    public final Feature[] mo12443g(C6008s0<?> c6008s0) {
        return this.f35544b.f35527a;
    }
}
