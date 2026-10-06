package p000;

import android.content.Context;
import android.view.OrientationEventListener;
import androidx.wear.ambient.AmbientModeSupport;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class kou extends OrientationEventListener {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ kov f36713a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kou(kov kovVar, Context context) {
        super(context);
        this.f36713a = kovVar;
    }

    @Override // android.view.OrientationEventListener
    public final void onOrientationChanged(int i) {
        Object obj;
        kov kovVar = this.f36713a;
        if (i < 0) {
            return;
        }
        synchronized (kovVar.f36716c) {
            Iterator it = kovVar.f36715b.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                AmbientModeSupport.AmbientController ambientController = (AmbientModeSupport.AmbientController) it.next();
                synchronized (((dav) ambientController.f1702a).f10342w) {
                    Object obj2 = ambientController.f1702a;
                    if (((dav) obj2).f10332m != null && ((dav) obj2).f10336q.equals(dbh.LOCKED) && ((dav) ambientController.f1702a).f10328i.get()) {
                        Object obj3 = ambientController.f1702a;
                        int i2 = ((dav) obj3).f10341v;
                        if (i2 == -1) {
                            ((dav) obj3).f10341v = i;
                        } else {
                            int iAbs = Math.abs(i - i2);
                            if (iAbs <= 60 || iAbs >= 300) {
                                htb htbVar = ((dav) ambientController.f1702a).f10343x;
                                synchronized (htbVar.f29485a) {
                                    obj = htbVar.f29488d;
                                }
                                if (iAbs <= 20 || iAbs >= 340) {
                                    if (!((htd) obj).equals(htd.ACTIVE)) {
                                        ((dav) ambientController.f1702a).f10343x.m10723a(htd.ACTIVE);
                                        ((dav) ambientController.f1702a).mo5847b();
                                    }
                                } else {
                                    if (!((htd) obj).equals(htd.WARNING)) {
                                        ((dav) ambientController.f1702a).f10343x.m10723a(htd.WARNING);
                                        Object obj4 = ambientController.f1702a;
                                        ((dav) obj4).m5858m(((dav) obj4).f10334o);
                                    }
                                }
                            } else {
                                ((dav) ambientController.f1702a).m5852g();
                                AmbientModeSupport.AmbientController ambientController2 = ((dav) ambientController.f1702a).f10345z;
                                if (ambientController2 != null) {
                                    ambientController2.m1653c(dbh.STANDARD, false);
                                }
                                Object obj5 = ambientController.f1702a;
                                ((dav) obj5).m5858m(((dav) obj5).f10335p);
                            }
                        }
                    }
                }
            }
            lku.m15669w(i < 360);
            int iAbs2 = Math.abs(i - kovVar.f36720g.f35503e);
            kay kayVarM13889b = Math.min(iAbs2, 360 - iAbs2) >= 50 ? kay.m13889b((((i + 45) / 90) * 90) % 360) : kovVar.f36720g;
            if (kayVarM13889b == kovVar.f36720g) {
                return;
            }
            kovVar.f36720g = kayVarM13889b;
            Iterator it2 = kovVar.f36714a.iterator();
            while (it2.hasNext()) {
                kovVar.f36718e.execute(new kds((kos) it2.next(), kayVarM13889b, 10));
            }
        }
    }
}
