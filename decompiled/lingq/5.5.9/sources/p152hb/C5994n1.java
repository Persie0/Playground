package p152hb;

import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import p136gc.C5752h;

/* JADX INFO: renamed from: hb.n1 */
/* JADX INFO: loaded from: classes.dex */
public final class C5994n1 extends AbstractC5979i1<Boolean> {

    /* JADX INFO: renamed from: c */
    public final C5971g.a<?> f35562c;

    public C5994n1(C5971g.a<?> aVar, C5752h<Boolean> c5752h) {
        super(c5752h);
        this.f35562c = aVar;
    }

    @Override // p152hb.AbstractC5997o1
    /* JADX INFO: renamed from: d */
    public final /* bridge */ /* synthetic */ void mo12438d(C5998p c5998p, boolean z10) {
    }

    @Override // p152hb.AbstractC6029z0
    /* JADX INFO: renamed from: f */
    public final boolean mo12442f(C6008s0<?> c6008s0) {
        if (((C5967e1) c6008s0.f35586f.get(this.f35562c)) == null) {
            return false;
        }
        throw null;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p152hb.AbstractC6029z0
    /* JADX INFO: renamed from: g */
    public final Feature[] mo12443g(C6008s0<?> c6008s0) {
        if (((C5967e1) c6008s0.f35586f.get(this.f35562c)) == null) {
            return null;
        }
        throw null;
    }

    @Override // p152hb.AbstractC5979i1
    /* JADX INFO: renamed from: h */
    public final void mo12437h(C6008s0<?> c6008s0) throws RemoteException {
        if (((C5967e1) c6008s0.f35586f.remove(this.f35562c)) != null) {
            throw null;
        }
        this.f35519b.m12116d(Boolean.FALSE);
    }
}
