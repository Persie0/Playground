package p000;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.play.core.review.BinderC1076c;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class b4c extends enc {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f7940b = 0;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f7941c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f7942d;

    public b4c(yub yubVar, IBinder iBinder) {
        this.f7941c = iBinder;
        this.f7942d = yubVar;
    }

    @Override // p000.enc
    /* JADX INFO: renamed from: a */
    public final void mo3295a() {
        HashMap map;
        c4c xvbVar = null;
        switch (this.f7940b) {
            case 0:
                try {
                    yic yicVar = (yic) this.f7942d;
                    c4c c4cVar = yicVar.f69886a.f747m;
                    String str = yicVar.f69887b;
                    Bundle bundle = new Bundle();
                    HashMap map2 = dnc.f35914a;
                    synchronized (dnc.class) {
                        map = dnc.f35914a;
                        map.put("java", 20002);
                    }
                    bundle.putInt("playcore_version_code", ((Integer) map.get("java")).intValue());
                    if (map.containsKey("native")) {
                        bundle.putInt("playcore_native_version", ((Integer) map.get("native")).intValue());
                    }
                    if (map.containsKey("unity")) {
                        bundle.putInt("playcore_unity_version", ((Integer) map.get("unity")).intValue());
                    }
                    yic yicVar2 = (yic) this.f7942d;
                    wr9 wr9Var = (wr9) this.f7941c;
                    String str2 = yicVar2.f69887b;
                    BinderC1076c binderC1076c = new BinderC1076c(yicVar2, wr9Var);
                    xvb xvbVar2 = (xvb) c4cVar;
                    xvbVar2.getClass();
                    Parcel parcelObtain = Parcel.obtain();
                    parcelObtain.writeInterfaceToken("com.google.android.play.core.inappreview.protocol.IInAppReviewService");
                    parcelObtain.writeString(str);
                    int i = trb.f62789a;
                    parcelObtain.writeInt(1);
                    bundle.writeToParcel(parcelObtain, 0);
                    parcelObtain.writeStrongBinder(binderC1076c);
                    try {
                        xvbVar2.f68859f.transact(2, parcelObtain, null, 1);
                        return;
                    } finally {
                        parcelObtain.recycle();
                    }
                } catch (RemoteException e) {
                    yic yicVar3 = (yic) this.f7942d;
                    gp0 gp0Var = yic.f69885c;
                    Object[] objArr = {yicVar3.f69887b};
                    gp0Var.getClass();
                    if (Log.isLoggable("PlayCore", 6)) {
                        Log.e("PlayCore", gp0.m12785d(gp0Var.f41124b, "error requesting in-app review for %s", objArr), e);
                    }
                    ((wr9) this.f7941c).m24139c(new RuntimeException(e));
                    return;
                }
            default:
                ajd ajdVar = (ajd) ((yub) this.f7942d).f70524b;
                IBinder iBinder = (IBinder) this.f7941c;
                int i2 = j0c.f44860g;
                if (iBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.inappreview.protocol.IInAppReviewService");
                    xvbVar = iInterfaceQueryLocalInterface instanceof c4c ? (c4c) iInterfaceQueryLocalInterface : new xvb(iBinder);
                }
                ajdVar.f747m = xvbVar;
                gp0 gp0Var2 = ajdVar.f736b;
                gp0Var2.m12786b("linkToDeath", new Object[0]);
                try {
                    ajdVar.f747m.asBinder().linkToDeath(ajdVar.f744j, 0);
                    break;
                } catch (RemoteException e2) {
                    Object[] objArr2 = new Object[0];
                    gp0Var2.getClass();
                    if (Log.isLoggable("PlayCore", 6)) {
                        Log.e("PlayCore", gp0.m12785d(gp0Var2.f41124b, "linkToDeath failed", objArr2), e2);
                    }
                }
                ajdVar.f741g = false;
                Iterator it = ajdVar.f738d.iterator();
                while (it.hasNext()) {
                    ((Runnable) it.next()).run();
                }
                ajdVar.f738d.clear();
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b4c(yic yicVar, wr9 wr9Var, wr9 wr9Var2) {
        super(wr9Var);
        this.f7941c = wr9Var2;
        this.f7942d = yicVar;
    }
}
