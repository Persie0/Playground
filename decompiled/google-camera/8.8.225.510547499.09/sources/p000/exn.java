package p000;

import android.os.Handler;
import android.os.SystemClock;
import com.google.android.apps.lightcycle.panorama.LightCycleNative;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class exn implements bnk {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f20785a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f20786b;

    public exn(bmj bmjVar, int i) {
        this.f20786b = i;
        this.f20785a = bmjVar;
    }

    public exn(exp expVar, int i) {
        this.f20786b = i;
        this.f20785a = expVar;
    }

    @Override // p000.bnk
    /* JADX INFO: renamed from: a */
    public final void mo2767a(boolean z, bnq bnqVar) {
        switch (this.f20786b) {
            case 0:
                exw exwVar = ((exp) this.f20785a).f20844h;
                eyi eyiVar = exwVar.f20897b;
                if (eyiVar != null) {
                    eyiVar.m8042b();
                    exwVar.f20897b.m8045e();
                    exwVar.f20898c = SystemClock.elapsedRealtimeNanos();
                    float f = exwVar.f20897b.f20974k;
                    Object obj = exh.f20734a;
                    LightCycleNative.StartGyroCalibration(f);
                    exwVar.f20902g = true;
                    exwVar.f20903h = false;
                }
                ((exp) this.f20785a).f20858v = false;
                break;
            default:
                ((Handler) ((bmj) this.f20785a).f3781b).post(new cxm(this, z, bnqVar, 1, null));
                break;
        }
    }
}
