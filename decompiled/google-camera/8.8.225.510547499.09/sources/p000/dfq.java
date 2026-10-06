package p000;

import android.content.Context;
import android.os.SystemClock;
import android.util.Pair;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import com.google.android.apps.camera.bottombar.C0100R;
import com.google.android.apps.camera.coach.CameraCoachHudView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class dfq implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f10804a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f10805b;

    public /* synthetic */ dfq(CameraCoachHudView cameraCoachHudView, int i) {
        this.f10805b = i;
        this.f10804a = cameraCoachHudView;
    }

    public /* synthetic */ dfq(dgb dgbVar, int i) {
        this.f10805b = i;
        this.f10804a = dgbVar;
    }

    public /* synthetic */ dfq(dgi dgiVar, int i) {
        this.f10805b = i;
        this.f10804a = dgiVar;
    }

    public /* synthetic */ dfq(dgo dgoVar, int i) {
        this.f10805b = i;
        this.f10804a = dgoVar;
    }

    public /* synthetic */ dfq(dgp dgpVar, int i) {
        this.f10805b = i;
        this.f10804a = dgpVar;
    }

    public /* synthetic */ dfq(dgs dgsVar, int i) {
        this.f10805b = i;
        this.f10804a = dgsVar;
    }

    public /* synthetic */ dfq(dgu dguVar, int i) {
        this.f10805b = i;
        this.f10804a = dguVar;
    }

    public /* synthetic */ dfq(hew hewVar, int i) {
        this.f10805b = i;
        this.f10804a = hewVar;
    }

    /* JADX WARN: Type inference failed for: r0v62, types: [hew, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        int i = 0;
        int i2 = 1;
        switch (this.f10805b) {
            case 0:
                ((dgm) ((CameraCoachHudView) this.f10804a).f6591b.mo16809c()).m6108a();
                break;
            case 1:
                ((dgy) ((CameraCoachHudView) this.f10804a).f6592c.mo16809c()).m6132b();
                break;
            case 2:
                ((dgm) ((CameraCoachHudView) this.f10804a).f6591b.mo16809c()).m6108a();
                break;
            case 3:
                ((dgy) ((CameraCoachHudView) this.f10804a).f6592c.mo16809c()).m6132b();
                break;
            case 4:
                ((dgd) ((CameraCoachHudView) this.f10804a).f6593d.mo16809c()).m6097a();
                break;
            case 5:
                ((dgd) ((CameraCoachHudView) this.f10804a).f6593d.mo16809c()).m6097a();
                break;
            case 6:
                dgb dgbVar = (dgb) this.f10804a;
                dgbVar.f10857r.m7398a();
                dgbVar.m6090c();
                break;
            case 7:
                ((dgb) this.f10804a).m6094g();
                break;
            case 8:
                ((dgb) this.f10804a).m6095i();
                break;
            case 9:
                ((dgi) this.f10804a).m6102e();
                break;
            case 10:
                dgi dgiVar = (dgi) this.f10804a;
                if (((dtk) ((mrq) dgiVar.f10890c).f41482a).mo6738e()) {
                    ((nbe) ((nbe) dgi.f10888a.m17252c()).mo17276G((char) 867)).mo17290o("Can not update pitch roll indicator because camera orientation feature is empty.");
                    break;
                } else {
                    fkg fkgVarM8506a = fkg.m8506a(((dtk) ((mrq) dgiVar.f10890c).f41482a).mo6737d());
                    float radians = (float) Math.toRadians(fkgVarM8506a.f22371b);
                    float radians2 = (float) Math.toRadians(fkgVarM8506a.f22372c);
                    dgiVar.f10899l = mrm.m16829i(fkgVarM8506a);
                    if (!dgiVar.f10901n) {
                        ((nbe) ((nbe) dgi.f10888a.m17252c()).mo17276G(871)).mo17271B("Can not update PitchRollIndicator: cameraCoachHudController = %s, inAppNotificationController = %s, isHintEnabled = %s", true, true, Boolean.valueOf(dgiVar.f10901n));
                        break;
                    } else {
                        long jUptimeMillis = SystemClock.uptimeMillis();
                        if (jUptimeMillis >= dgiVar.f10900m) {
                            dgiVar.f10900m = jUptimeMillis + dgi.f10889b;
                            dgiVar.f10891d.mo6138f();
                            dgiVar.f10892e.m6106a(radians, radians2, SystemClock.uptimeMillis());
                            if (!dgiVar.f10892e.f10911b.m6149c()) {
                                dgiVar.f10891d.mo6139g();
                                dgiVar.m6101c();
                            } else {
                                dfo dfoVar = (dfo) ((mrq) dgiVar.f10894g).f41482a;
                                if (dfoVar.f10796c && dfoVar.f10797d && dfoVar.f10798e.mo16813g()) {
                                    CameraCoachHudView cameraCoachHudView = (CameraCoachHudView) dfoVar.f10798e.mo16809c();
                                    cameraCoachHudView.post(new dfp(cameraCoachHudView, radians2, radians, i2));
                                }
                                boolean z = Math.toDegrees((double) Math.abs(radians2)) < 1.0d || Math.toDegrees((double) Math.abs(radians)) < 1.0d;
                                dgiVar.f10898k = z;
                                if (z && dgiVar.f10896i) {
                                    if (!dgiVar.f10897j) {
                                        dgiVar.f10891d.mo6136d();
                                    }
                                    dgiVar.f10897j = true;
                                } else {
                                    dgiVar.f10897j = false;
                                }
                                if (!dgiVar.f10896i) {
                                    ((dfo) ((mrq) dgiVar.f10894g).f41482a).m6080d();
                                    ((elx) ((mrq) dgiVar.f10895h).f41482a).mo7487i(ely.SECOND_RUN_TOAST);
                                    dgiVar.f10896i = true;
                                    dgiVar.f10891d.mo6137e(dgiVar.f10899l);
                                }
                            }
                            break;
                        }
                    }
                }
                break;
            case 11:
                dgi dgiVar2 = (dgi) this.f10804a;
                dgiVar2.m6104g();
                dgiVar2.m6101c();
                break;
            case 12:
                dgi dgiVar3 = (dgi) this.f10804a;
                dgiVar3.f10891d.mo6139g();
                dgiVar3.f10892e.m6107b();
                dgiVar3.m6101c();
                dgiVar3.f10900m = SystemClock.uptimeMillis() + 1000;
                break;
            case 13:
                ((dgp) this.f10804a).m6113a();
                break;
            case 14:
                dgo dgoVar = (dgo) this.f10804a;
                dgoVar.f10940d.m6115c();
                dgoVar.f10939c.mo8196p();
                break;
            case 15:
                dgo dgoVar2 = (dgo) this.f10804a;
                if (dgoVar2.f10944h.mo16813g() && dgoVar2.f10941e) {
                    dsx dsxVar = (dsx) dgoVar2.f10944h.mo16809c();
                    View.OnClickListener onClickListener = dgoVar2.f10943g;
                    View.OnClickListener onClickListener2 = dgoVar2.f10942f;
                    FrameLayout frameLayout = new FrameLayout((Context) dsxVar.f12521a);
                    View.inflate((Context) dsxVar.f12521a, C0100R.layout.selfie_angle_bottom_sheet, frameLayout);
                    Button button = (Button) frameLayout.findViewById(C0100R.id.selfie_angle_bottom_sheet_setting_button);
                    Button button2 = (Button) frameLayout.findViewById(C0100R.id.selfie_angle_bottom_sheet_turn_off_button);
                    button.setOnClickListener(onClickListener2);
                    button2.setOnClickListener(onClickListener);
                    ((hst) dsxVar.f12522b).m10713l(4, C0100R.string.selfie_angle_bottom_sheet_title, frameLayout);
                    break;
                }
                break;
            case 16:
                ((dgp) this.f10804a).m6114b();
                break;
            case 17:
                this.f10804a.mo10130a();
                break;
            case 18:
                dgs dgsVar = (dgs) this.f10804a;
                if (SystemClock.elapsedRealtime() - dgsVar.f10961b >= 5000) {
                    dgsVar.m6121d();
                    dgsVar.f10960a = 0;
                }
                break;
            case 19:
                dgu dguVar = (dgu) this.f10804a;
                if (!((dtk) ((mrq) dguVar.f10975a).f41482a).mo6738e()) {
                    Pair pairM6058c = dfm.m6058c(new fki(((dtk) ((mrq) dguVar.f10975a).f41482a).mo6737d().f12554a));
                    float fFloatValue = ((Float) pairM6058c.first).floatValue();
                    float fFloatValue2 = ((Float) pairM6058c.second).floatValue();
                    if (dguVar.f10979e.mo16813g() && dguVar.f10980f.mo16813g() && dguVar.f10984j) {
                        dguVar.f10977c.m6128a(fFloatValue, fFloatValue2, SystemClock.uptimeMillis());
                        dguVar.f10978d.mo6138f();
                        dgw dgwVar = dguVar.f10977c;
                        if (dgwVar.f10997f.mo16813g() && ((dhe) dgwVar.f10997f.mo16809c()).m6149c()) {
                            dfo dfoVar2 = (dfo) dguVar.f10980f.mo16809c();
                            if (dfoVar2.f10796c && dfoVar2.f10797d && dfoVar2.f10798e.mo16813g()) {
                                CameraCoachHudView cameraCoachHudView2 = (CameraCoachHudView) dfoVar2.f10798e.mo16809c();
                                cameraCoachHudView2.post(new dfp(cameraCoachHudView2, fFloatValue, fFloatValue2, i));
                            }
                            if (!dguVar.f10981g) {
                                ((dfo) dguVar.f10980f.mo16809c()).m6080d();
                                ((elx) dguVar.f10979e.mo16809c()).mo7487i(ely.SECOND_RUN_TOAST);
                                dguVar.f10981g = true;
                                dguVar.f10978d.mo6137e(mqu.f41450a);
                            }
                        } else {
                            dguVar.m6124c();
                        }
                        if (dguVar.f10981g) {
                            if (!dgu.m6123i(fFloatValue, fFloatValue2)) {
                                dguVar.f10983i = false;
                            } else if (!dguVar.f10983i) {
                                dguVar.f10978d.mo6136d();
                                dguVar.f10983i = true;
                            }
                        }
                    }
                    dguVar.f10982h = dgu.m6123i(((Float) pairM6058c.first).floatValue(), ((Float) pairM6058c.second).floatValue());
                    break;
                }
                break;
            default:
                dgu dguVar2 = (dgu) this.f10804a;
                dguVar2.f10977c.m6129b();
                dguVar2.m6124c();
                break;
        }
    }
}
