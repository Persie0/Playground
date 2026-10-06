package p000;

import android.content.Context;
import android.content.IntentFilter;
import androidx.wear.ambient.AmbientModeSupport;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mng {

    /* JADX INFO: renamed from: a */
    protected final Set f41102a;

    /* JADX INFO: renamed from: b */
    private final IntentFilter f41103b;

    /* JADX INFO: renamed from: c */
    private final Context f41104c;

    /* JADX INFO: renamed from: d */
    private mnf f41105d;

    /* JADX INFO: renamed from: e */
    private volatile boolean f41106e;

    public mng(Context context) {
        new mav("AppUpdateListenerRegistry");
        IntentFilter intentFilter = new IntentFilter("com.google.android.play.core.install.ACTION_INSTALL_STATUS");
        this.f41102a = new HashSet();
        this.f41105d = null;
        this.f41106e = false;
        this.f41103b = intentFilter;
        this.f41104c = lkm.m15583j(context);
    }

    /* JADX INFO: renamed from: d */
    private final void m16653d() {
        mnf mnfVar;
        if (!this.f41102a.isEmpty() && this.f41105d == null) {
            mnf mnfVar2 = new mnf(this);
            this.f41105d = mnfVar2;
            this.f41104c.registerReceiver(mnfVar2, this.f41103b, 2);
        }
        if (!this.f41102a.isEmpty() || (mnfVar = this.f41105d) == null) {
            return;
        }
        this.f41104c.unregisterReceiver(mnfVar);
        this.f41105d = null;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m16654a(Object obj) {
        for (AmbientModeSupport.AmbientController ambientController : new HashSet(this.f41102a)) {
            int i = ((mnc) obj).f41094a;
            if (i == 2) {
                long j = ((mnc) obj).f41096c;
                int i2 = 0;
                int i3 = j != 0 ? (int) ((((mnc) obj).f41095b * 100) / j) : 0;
                if (i3 < 0) {
                    ((nbe) ((nbe) imn.f31531a.m17252c()).mo17276G(4319)).mo17296u("Progress (%d) is less than 0! state=%s", i3, obj);
                } else {
                    i2 = 100;
                    if (i3 > 100) {
                        ((nbe) ((nbe) imn.f31531a.m17252c()).mo17276G(4318)).mo17296u("Progress (%d) is greater than 100! state=%s", i3, obj);
                    } else {
                        i2 = i3;
                    }
                }
                ((imn) ambientController.f1702a).f31533c.mo11467u(i2);
            } else if (i == 11) {
                ((imn) ambientController.f1702a).f31532b.mo16639e(ambientController);
                ((imn) ambientController.f1702a).f31533c.mo11466t();
            } else if (i == 6 || i == 5) {
                ((nbe) ((nbe) imn.f31531a.m17252c()).mo17276G(4317)).mo17291p("Update failed. Error code: %s", ((mnc) obj).f41097d);
                ((imn) ambientController.f1702a).f31532b.mo16639e(ambientController);
                ((imn) ambientController.f1702a).f31533c.mo11459A(4, ((mnc) obj).f41097d);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m16655b(AmbientModeSupport.AmbientController ambientController) {
        this.f41102a.add(ambientController);
        m16653d();
    }

    /* JADX INFO: renamed from: c */
    public final synchronized void m16656c(AmbientModeSupport.AmbientController ambientController) {
        this.f41102a.remove(ambientController);
        m16653d();
    }
}
