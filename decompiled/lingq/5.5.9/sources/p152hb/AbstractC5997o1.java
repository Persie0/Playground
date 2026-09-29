package p152hb;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* JADX INFO: renamed from: hb.o1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5997o1 {

    /* JADX INFO: renamed from: a */
    public final int f35566a;

    public AbstractC5997o1(int i10) {
        this.f35566a = i10;
    }

    /* JADX INFO: renamed from: e */
    public static /* bridge */ /* synthetic */ Status m12448e(RemoteException remoteException) {
        return new Status(remoteException.getClass().getSimpleName() + ": " + remoteException.getLocalizedMessage(), 19);
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo12434a(Status status);

    /* JADX INFO: renamed from: b */
    public abstract void mo12435b(RuntimeException runtimeException);

    /* JADX INFO: renamed from: c */
    public abstract void mo12436c(C6008s0<?> c6008s0) throws DeadObjectException;

    /* JADX INFO: renamed from: d */
    public abstract void mo12438d(C5998p c5998p, boolean z10);
}
