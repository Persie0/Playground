package p070db;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* JADX INFO: renamed from: db.j */
/* JADX INFO: loaded from: classes.dex */
public final class BinderC5130j extends BinderC5123c {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C5131k f33115a;

    public BinderC5130j(C5131k c5131k) {
        this.f33115a = c5131k;
    }

    @Override // p070db.BinderC5123c, p070db.InterfaceC5137q
    /* JADX INFO: renamed from: i0 */
    public final void mo10908i0(Status status) throws RemoteException {
        this.f33115a.m7567f(status);
    }
}
