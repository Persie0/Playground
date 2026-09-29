package p152hb;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import p136gc.C5752h;

/* JADX INFO: renamed from: hb.i1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5979i1<T> extends AbstractC6029z0 {

    /* JADX INFO: renamed from: b */
    public final C5752h<T> f35519b;

    public AbstractC5979i1(C5752h c5752h) {
        super(4);
        this.f35519b = c5752h;
    }

    @Override // p152hb.AbstractC5997o1
    /* JADX INFO: renamed from: a */
    public final void mo12434a(Status status) {
        this.f35519b.m12115c(new ApiException(status));
    }

    @Override // p152hb.AbstractC5997o1
    /* JADX INFO: renamed from: b */
    public final void mo12435b(RuntimeException runtimeException) {
        this.f35519b.m12115c(runtimeException);
    }

    @Override // p152hb.AbstractC5997o1
    /* JADX INFO: renamed from: c */
    public final void mo12436c(C6008s0<?> c6008s0) throws DeadObjectException {
        try {
            mo12437h(c6008s0);
        } catch (DeadObjectException e10) {
            mo12434a(AbstractC5997o1.m12448e(e10));
            throw e10;
        } catch (RemoteException e11) {
            mo12434a(AbstractC5997o1.m12448e(e11));
        } catch (RuntimeException e12) {
            this.f35519b.m12115c(e12);
        }
    }

    /* JADX INFO: renamed from: h */
    public abstract void mo12437h(C6008s0<?> c6008s0) throws RemoteException;
}
