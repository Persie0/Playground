package p070db;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* JADX INFO: renamed from: db.h */
/* JADX INFO: loaded from: classes.dex */
public final class BinderC5128h extends BinderC5123c {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C5129i f33114a;

    public BinderC5128h(C5129i c5129i) {
        this.f33114a = c5129i;
    }

    @Override // p070db.BinderC5123c, p070db.InterfaceC5137q
    /* JADX INFO: renamed from: u0 */
    public final void mo10909u0(Status status) throws RemoteException {
        this.f33114a.m7567f(status);
    }
}
