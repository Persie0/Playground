package p152hb;

import android.os.DeadObjectException;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.C2542a;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.AbstractC2546a;
import com.google.android.gms.common.api.internal.BasePendingResult;
import gb.InterfaceC5740d;
import java.util.Map;
import p070db.AbstractC5132l;

/* JADX INFO: renamed from: hb.l1 */
/* JADX INFO: loaded from: classes.dex */
public final class C5988l1<A extends AbstractC2546a<? extends InterfaceC5740d, Object>> extends AbstractC5997o1 {

    /* JADX INFO: renamed from: b */
    public final A f35526b;

    public C5988l1(AbstractC5132l abstractC5132l) {
        super(1);
        this.f35526b = abstractC5132l;
    }

    @Override // p152hb.AbstractC5997o1
    /* JADX INFO: renamed from: a */
    public final void mo12434a(Status status) {
        try {
            this.f35526b.m7581l(status);
        } catch (IllegalStateException e10) {
            Log.w("ApiCallRunner", "Exception reporting failure", e10);
        }
    }

    @Override // p152hb.AbstractC5997o1
    /* JADX INFO: renamed from: b */
    public final void mo12435b(RuntimeException runtimeException) {
        String simpleName = runtimeException.getClass().getSimpleName();
        String localizedMessage = runtimeException.getLocalizedMessage();
        StringBuilder sb2 = new StringBuilder(simpleName.length() + 2 + String.valueOf(localizedMessage).length());
        sb2.append(simpleName);
        sb2.append(": ");
        sb2.append(localizedMessage);
        try {
            this.f35526b.m7581l(new Status(sb2.toString(), 10));
        } catch (IllegalStateException e10) {
            Log.w("ApiCallRunner", "Exception reporting failure", e10);
        }
    }

    @Override // p152hb.AbstractC5997o1
    /* JADX INFO: renamed from: c */
    public final void mo12436c(C6008s0<?> c6008s0) throws DeadObjectException {
        try {
            A a10 = this.f35526b;
            C2542a.e eVar = c6008s0.f35582b;
            a10.getClass();
            try {
                a10.mo7580k(eVar);
            } catch (DeadObjectException e10) {
                a10.m7581l(new Status(8, null, e10.getLocalizedMessage()));
                throw e10;
            } catch (RemoteException e11) {
                a10.m7581l(new Status(8, null, e11.getLocalizedMessage()));
            }
        } catch (RuntimeException e12) {
            mo12435b(e12);
        }
    }

    @Override // p152hb.AbstractC5997o1
    /* JADX INFO: renamed from: d */
    public final void mo12438d(C5998p c5998p, boolean z10) {
        Map<BasePendingResult<?>, Boolean> map = c5998p.f35567a;
        Boolean boolValueOf = Boolean.valueOf(z10);
        A a10 = this.f35526b;
        map.put(a10, boolValueOf);
        a10.m7562a(new C5995o(c5998p, a10));
    }
}
