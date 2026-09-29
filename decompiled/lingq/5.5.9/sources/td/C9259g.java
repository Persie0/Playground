package td;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import dm.C5212l;
import java.util.Iterator;

/* JADX INFO: renamed from: td.g */
/* JADX INFO: loaded from: classes.dex */
public final class C9259g extends AbstractRunnableC9250a {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ IBinder f47947b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ServiceConnectionC9261i f47948c;

    public C9259g(ServiceConnectionC9261i serviceConnectionC9261i, IBinder iBinder) {
        this.f47948c = serviceConnectionC9261i;
        this.f47947b = iBinder;
    }

    @Override // td.AbstractRunnableC9250a
    /* JADX INFO: renamed from: a */
    public final void mo16640a() {
        InterfaceC9277y c9275w;
        ServiceConnectionC9261i serviceConnectionC9261i = this.f47948c;
        C9262j c9262j = serviceConnectionC9261i.f47950a;
        ((C5212l) c9262j.f47960i).getClass();
        int i10 = AbstractBinderC9276x.f47977a;
        IBinder iBinder = this.f47947b;
        if (iBinder == null) {
            c9275w = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.assetpacks.protocol.IAssetModuleService");
            c9275w = iInterfaceQueryLocalInterface instanceof InterfaceC9277y ? (InterfaceC9277y) iInterfaceQueryLocalInterface : new C9275w(iBinder);
        }
        c9262j.f47965n = c9275w;
        C9262j c9262j2 = serviceConnectionC9261i.f47950a;
        c9262j2.f47953b.m15814o("linkToDeath", new Object[0]);
        try {
            c9262j2.f47965n.asBinder().linkToDeath(c9262j2.f47962k, 0);
        } catch (RemoteException e10) {
            c9262j2.f47953b.m15813n(e10, "linkToDeath failed", new Object[0]);
        }
        c9262j2.f47958g = false;
        Iterator it = c9262j2.f47955d.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        c9262j2.f47955d.clear();
    }
}
