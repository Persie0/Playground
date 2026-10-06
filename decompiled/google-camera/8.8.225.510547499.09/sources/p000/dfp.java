package p000;

import android.os.SystemClock;
import com.google.android.apps.camera.coach.CameraCoachHudView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class dfp implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ CameraCoachHudView f10800a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ float f10801b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ float f10802c;

    /* JADX INFO: renamed from: d */
    private final /* synthetic */ int f10803d;

    public /* synthetic */ dfp(CameraCoachHudView cameraCoachHudView, float f, float f2, int i) {
        this.f10803d = i;
        this.f10800a = cameraCoachHudView;
        this.f10801b = f;
        this.f10802c = f2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f10803d) {
            case 0:
                CameraCoachHudView cameraCoachHudView = this.f10800a;
                float f = this.f10801b;
                float f2 = this.f10802c;
                if (cameraCoachHudView.f6592c.mo16813g()) {
                    dgy dgyVar = (dgy) cameraCoachHudView.f6592c.mo16809c();
                    dgyVar.f11010h = true;
                    dgyVar.f11011i = f2;
                    dgyVar.f11012j = f;
                    if (dfm.m6056a(dgyVar.f11013k, f2) || dfm.m6056a(dgyVar.f11014l, f)) {
                        dgyVar.f11003a.invalidate();
                        dgyVar.f11014l = f;
                        dgyVar.f11013k = f2;
                    }
                }
                break;
            case 1:
                CameraCoachHudView cameraCoachHudView2 = this.f10800a;
                float f3 = this.f10801b;
                float f4 = this.f10802c;
                if (cameraCoachHudView2.f6591b.mo16813g()) {
                    dgm dgmVar = (dgm) cameraCoachHudView2.f6591b.mo16809c();
                    dgmVar.f10928h = true;
                    dgmVar.f10931k = new fhs(f3, f4, SystemClock.uptimeMillis());
                    fhs fhsVar = dgmVar.f10932l;
                    if (fhsVar == null) {
                        dgmVar.f10926f.invalidate();
                    } else if (dfm.m6056a(f3, fhsVar.f22044c) || dfm.m6056a(f4, fhsVar.f22043b)) {
                        dgmVar.f10926f.invalidate();
                    }
                }
                break;
            default:
                CameraCoachHudView cameraCoachHudView3 = this.f10800a;
                float f5 = this.f10801b;
                float f6 = this.f10802c;
                if (cameraCoachHudView3.f6593d.mo16813g()) {
                    dgd dgdVar = (dgd) cameraCoachHudView3.f6593d.mo16809c();
                    dgdVar.f10874i = true;
                    dgdVar.f10876k = f6;
                    dgdVar.f10877l = f5;
                    if (dfm.m6056a(dgdVar.f10878m, f6) || dfm.m6056a(dgdVar.f10879n, f5)) {
                        dgdVar.f10870e.invalidate();
                        dgdVar.f10879n = f5;
                        dgdVar.f10878m = f6;
                    }
                }
                break;
        }
    }
}
