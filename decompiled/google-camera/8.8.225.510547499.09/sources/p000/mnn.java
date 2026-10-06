package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class mnn extends mnh {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ IBinder f41115a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ mnp f41116b;

    public mnn(mnp mnpVar, IBinder iBinder) {
        this.f41116b = mnpVar;
        this.f41115a = iBinder;
    }

    @Override // p000.mnh
    /* JADX INFO: renamed from: a */
    public final void mo16640a() {
        mmz mmzVar;
        Object obj = this.f41116b.f41118a;
        IBinder iBinder = this.f41115a;
        if (iBinder == null) {
            mmzVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.appupdate.protocol.IAppUpdateService");
            mmzVar = iInterfaceQueryLocalInterface instanceof mmz ? (mmz) iInterfaceQueryLocalInterface : new mmz(iBinder);
        }
        ((mnq) obj).f41131k = mmzVar;
        Object obj2 = this.f41116b.f41118a;
        try {
            ((cbq) ((mnq) obj2).f41131k).f4962a.linkToDeath(((mnq) obj2).f41128h, 0);
        } catch (RemoteException e) {
            ((mnq) obj2).f41132l.m16288e(e, "linkToDeath failed", new Object[0]);
        }
        ((mnq) this.f41116b.f41118a).f41125e = false;
        Iterator it = ((mnq) this.f41116b.f41118a).f41122b.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        ((mnq) this.f41116b.f41118a).f41122b.clear();
    }
}
