package p000;

import android.app.Activity;
import android.content.Context;
import android.content.IntentSender;
import android.os.Handler;
import android.os.Looper;
import androidx.wear.ambient.AmbientModeSupport;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mms implements mmr {

    /* JADX INFO: renamed from: a */
    private final mmx f41062a;

    /* JADX INFO: renamed from: b */
    private final Context f41063b;

    /* JADX INFO: renamed from: c */
    private final mng f41064c;

    public mms(mmx mmxVar, mng mngVar, Context context) {
        new Handler(Looper.getMainLooper());
        this.f41062a = mmxVar;
        this.f41064c = mngVar;
        this.f41063b = context;
    }

    @Override // p000.mmr
    /* JADX INFO: renamed from: a */
    public final jpp mo16635a() {
        Object objM16645c;
        mmx mmxVar = this.f41062a;
        String packageName = this.f41063b.getPackageName();
        if (mmxVar.f41074a == null) {
            objM16645c = mmx.m16645c();
        } else {
            khb khbVar = new khb((byte[]) null, (byte[]) null);
            mmxVar.f41074a.m16663e(new mmt(mmxVar, khbVar, packageName, khbVar, null, null), khbVar);
            objM16645c = khbVar.f36008a;
        }
        return (jpp) objM16645c;
    }

    @Override // p000.mmr
    /* JADX INFO: renamed from: b */
    public final void mo16636b() {
        mmx mmxVar = this.f41062a;
        String packageName = this.f41063b.getPackageName();
        if (mmxVar.f41074a == null) {
            mmx.m16645c();
        } else {
            khb khbVar = new khb((byte[]) null, (byte[]) null);
            mmxVar.f41074a.m16663e(new mmu(mmxVar, khbVar, khbVar, packageName, null, null), khbVar);
        }
    }

    @Override // p000.mmr
    /* JADX INFO: renamed from: c */
    public final void mo16637c(mmq mmqVar, Activity activity) throws IntentSender.SendIntentException {
        if (mmqVar.m16634b() == null || mmqVar.f41060e) {
            return;
        }
        mmqVar.f41060e = true;
        activity.startIntentSenderForResult(mmqVar.m16634b().getIntentSender(), 57439, null, 0, 0, 0, null);
    }

    @Override // p000.mmr
    /* JADX INFO: renamed from: d */
    public final synchronized void mo16638d(AmbientModeSupport.AmbientController ambientController) {
        this.f41064c.m16655b(ambientController);
    }

    @Override // p000.mmr
    /* JADX INFO: renamed from: e */
    public final synchronized void mo16639e(AmbientModeSupport.AmbientController ambientController) {
        this.f41064c.m16656c(ambientController);
    }
}
