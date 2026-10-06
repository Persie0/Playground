package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.wear.ambient.AmbientModeSupport;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class eoo extends BroadcastReceiver {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ eoq f14890a;

    public eoo(eoq eoqVar) {
        this.f14890a = eoqVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if (action == null || !action.equals("com.google.android.apps.camera.remotecontrol.remotekey")) {
            return;
        }
        int intExtra = intent.getIntExtra("key_value", 0);
        boolean booleanExtra = intent.getBooleanExtra("key_down", false);
        switch (intExtra) {
            case 1:
                if (action.equals("com.google.android.apps.camera.remotecontrol.remotekey")) {
                    this.f14890a.f14894d.mo8170ao(3);
                }
                synchronized (this.f14890a.f14895e) {
                    Iterator it = this.f14890a.f14892b.iterator();
                    while (it.hasNext()) {
                        ((eop) it.next()).mo5224d(booleanExtra);
                    }
                    break;
                }
                break;
            case 2:
                if (booleanExtra) {
                    eoq eoqVar = this.f14890a;
                    synchronized (eoqVar.f14895e) {
                        Iterator it2 = eoqVar.f14892b.iterator();
                        while (it2.hasNext()) {
                            ((eop) it2.next()).mo5223c();
                        }
                        break;
                    }
                }
                break;
            case 3:
                synchronized (this.f14890a.f14895e) {
                    Iterator it3 = this.f14890a.f14892b.iterator();
                    while (it3.hasNext()) {
                        ((eop) it3.next()).mo5222b(booleanExtra);
                    }
                    break;
                }
                break;
            case 4:
                synchronized (this.f14890a.f14895e) {
                    Iterator it4 = this.f14890a.f14892b.iterator();
                    while (it4.hasNext()) {
                        ((eop) it4.next()).mo5222b(booleanExtra);
                    }
                    break;
                }
                break;
            case 5:
                synchronized (this.f14890a.f14895e) {
                    Iterator it5 = this.f14890a.f14892b.iterator();
                    while (it5.hasNext()) {
                        ((eop) it5.next()).mo5225e(booleanExtra);
                    }
                    break;
                }
                break;
            case 6:
                synchronized (this.f14890a.f14895e) {
                    Iterator it6 = this.f14890a.f14892b.iterator();
                    while (it6.hasNext()) {
                        ((eop) it6.next()).mo5226f(booleanExtra);
                    }
                    break;
                }
                break;
            case 7:
                this.f14890a.m7601h(booleanExtra);
                break;
            default:
                ((nbe) ((nbe) eoq.f14891a.m17251b()).mo17276G((char) 1685)).mo17290o("Unknown Key event received. Ignoring it.");
                break;
        }
        eoq eoqVar2 = this.f14890a;
        synchronized (eoqVar2.f14895e) {
            Iterator it7 = eoqVar2.f14893c.iterator();
            while (it7.hasNext()) {
                ((ifa) ((AmbientModeSupport.AmbientController) it7.next()).f1702a).mo8077a();
            }
        }
    }
}
