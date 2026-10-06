package p000;

import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.apps.camera.bottombar.C0100R;
import com.google.android.apps.camera.camcorder.p008ui.modeslider.recordspeed.RecordSpeedSlider;
import com.google.android.apps.camera.camerafatalerror.CameraFatalErrorTrackerDatabase;
import com.google.googlex.gcam.BuildPayloadBurstSpecOptions;
import com.google.googlex.gcam.GcamModuleJNI;
import com.google.googlex.gcam.ShotParams;
import java.util.function.Consumer;
import p021j$.util.function.Consumer$CC;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class dco implements Consumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f10512a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f10513b;

    public /* synthetic */ dco(Intent intent, int i) {
        this.f10513b = i;
        this.f10512a = intent;
    }

    public /* synthetic */ dco(Configuration configuration, int i) {
        this.f10513b = i;
        this.f10512a = configuration;
    }

    public /* synthetic */ dco(BuildPayloadBurstSpecOptions buildPayloadBurstSpecOptions, int i) {
        this.f10513b = i;
        this.f10512a = buildPayloadBurstSpecOptions;
    }

    public /* synthetic */ dco(ShotParams shotParams, int i) {
        this.f10513b = i;
        this.f10512a = shotParams;
    }

    public /* synthetic */ dco(dah dahVar, int i) {
        this.f10513b = i;
        this.f10512a = dahVar;
    }

    public /* synthetic */ dco(dbr dbrVar, int i) {
        this.f10513b = i;
        this.f10512a = dbrVar;
    }

    public /* synthetic */ dco(ddr ddrVar, int i) {
        this.f10513b = i;
        this.f10512a = ddrVar;
    }

    public /* synthetic */ dco(dea deaVar, int i) {
        this.f10513b = i;
        this.f10512a = deaVar;
    }

    public /* synthetic */ dco(djm djmVar, int i, byte[] bArr) {
        this.f10513b = i;
        this.f10512a = djmVar;
    }

    public /* synthetic */ dco(faz fazVar, int i) {
        this.f10513b = i;
        this.f10512a = fazVar;
    }

    public /* synthetic */ dco(fbp fbpVar, int i) {
        this.f10513b = i;
        this.f10512a = fbpVar;
    }

    public /* synthetic */ dco(fvh fvhVar, int i) {
        this.f10513b = i;
        this.f10512a = fvhVar;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.f10513b) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                break;
            case 14:
                break;
            case 15:
                break;
            case 16:
                break;
            case 17:
                break;
            case 18:
                break;
            case 19:
                break;
        }
        return Consumer$CC.$default$andThen(this, consumer);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v40, types: [faz, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v41, types: [fbp, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v42, types: [fbp, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v43, types: [faz, java.lang.Object] */
    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        igt igtVar;
        switch (this.f10513b) {
            case 0:
                ((dbr) this.f10512a).f10420c.add((dch) obj);
                return;
            case 1:
                String str = (String) obj;
                dah dahVar = (dah) this.f10512a;
                if (dahVar.f10264q.m13088X(str) == 0) {
                    int i = dahVar.f10261n;
                    int iM4071b = dahVar.f10257j.m4071b(i);
                    View childAt = dahVar.f10257j.getChildAt(i);
                    if (!((Boolean) dahVar.f10248a.get(iM4071b)).booleanValue() && childAt != null) {
                        RecordSpeedSlider recordSpeedSlider = dahVar.f10257j;
                        String str2 = (String) recordSpeedSlider.f6577c.mo16885b(Integer.valueOf(recordSpeedSlider.m4071b(i))).get(2);
                        childAt.requestLayout();
                        dahVar.f10258k.close();
                        ilk ilkVarM11426b = ilk.m11426b(dahVar.f10256i.getDefaultDisplay(), childAt.getContext());
                        int dimensionPixelSize = childAt.getResources().getDimensionPixelSize(C0100R.dimen.record_speed_slider_tooltip_padding);
                        switch (ilkVarM11426b) {
                            case PORTRAIT:
                                igtVar = new igt(str2);
                                igtVar.m11313q(childAt);
                                igtVar.mo11305i();
                                break;
                            case LANDSCAPE:
                                igtVar = new igt(str2);
                                igtVar.m11306j(childAt, dimensionPixelSize);
                                igtVar.mo11305i();
                                break;
                            case REVERSE_LANDSCAPE:
                                igtVar = new igt(str2);
                                igtVar.m11304h(childAt, dimensionPixelSize);
                                igtVar.mo11305i();
                                break;
                        }
                        igtVar.mo11307k();
                        igtVar.mo11308l();
                        igtVar.f30872g = true;
                        igtVar.f30869d = 300;
                        igtVar.f30870e = 3800;
                        igtVar.f30878m = 6;
                        igtVar.mo11302f(new bbt(dahVar, iM4071b, 9), dahVar.f10253f);
                        igtVar.f30871f = false;
                        igtVar.f30874i = dahVar.f10251d;
                        dahVar.f10258k = igtVar.mo11297a();
                        dahVar.f10262o.m3529i().m13537d(dahVar.f10258k);
                    }
                    dahVar.f10264q.m13090Z(str);
                    return;
                }
                return;
            case 2:
                ddp ddpVar = (ddp) obj;
                djm djmVar = (djm) this.f10512a;
                ddk ddkVarMo4085y = ((CameraFatalErrorTrackerDatabase) djmVar.f11787a).mo4085y();
                int iM5666n = ((cwd) djmVar.f11789c).m5666n();
                if (ddpVar == ddp.BACK_UNOPENABLE || ddpVar == ddp.f10573c || ddpVar == ddp.f10572b) {
                    iM5666n = ((cwd) djmVar.f11789c).m5668p();
                }
                ddo ddoVar = (ddo) ddkVarMo4085y;
                ddoVar.f10566a.m1824l();
                arf arfVarM1853e = ddoVar.f10567b.m1853e();
                dez dezVar = ddoVar.f10568c;
                arfVarM1853e.mo1845e(1, ddpVar.ordinal());
                arfVarM1853e.mo1845e(2, iM5666n);
                ddoVar.f10566a.m1825m();
                try {
                    arfVarM1853e.m1883a();
                    ((ddo) ddkVarMo4085y).f10566a.m1829q();
                    return;
                } finally {
                    ddoVar.f10566a.m1827o();
                    ddoVar.f10567b.m1855g(arfVarM1853e);
                }
            case 3:
                ((ddr) this.f10512a).f10578a.mo4085y().mo5940b(new ddj((ddp) obj));
                return;
            case 4:
                ((dea) this.f10512a).f10620c = (Drawable) obj;
                return;
            case 5:
                ((BuildPayloadBurstSpecOptions) this.f10512a).m4907b(((Float) obj).floatValue());
                return;
            case 6:
                ShotParams shotParams = (ShotParams) this.f10512a;
                GcamModuleJNI.ShotParams_pecan_override_set(shotParams.f8358a, shotParams, ((Integer) obj).intValue());
                return;
            case 7:
                ShotParams shotParams2 = (ShotParams) this.f10512a;
                GcamModuleJNI.ShotParams_shasta_factor_set(shotParams2.f8358a, shotParams2, ((Float) obj).floatValue());
                return;
            case 8:
                ShotParams shotParams3 = (ShotParams) this.f10512a;
                GcamModuleJNI.ShotParams_psaf_max_exposure_time_ms_set(shotParams3.f8358a, shotParams3, ((Float) obj).floatValue());
                return;
            case 9:
                ShotParams shotParams4 = (ShotParams) this.f10512a;
                GcamModuleJNI.ShotParams_psaf_log_scene_brightness_threshold_override_set(shotParams4.f8358a, shotParams4, ((Float) obj).floatValue());
                return;
            case 10:
                ShotParams shotParams5 = (ShotParams) this.f10512a;
                GcamModuleJNI.ShotParams_big_cpu_freq_option_set(shotParams5.f8358a, shotParams5, ((Float) obj).floatValue());
                return;
            case 11:
                ShotParams shotParams6 = (ShotParams) this.f10512a;
                GcamModuleJNI.ShotParams_mid_cpu_freq_option_set(shotParams6.f8358a, shotParams6, ((Float) obj).floatValue());
                return;
            case 12:
                ShotParams shotParams7 = (ShotParams) this.f10512a;
                GcamModuleJNI.ShotParams_little_cpu_freq_option_set(shotParams7.f8358a, shotParams7, ((Float) obj).floatValue());
                return;
            case 13:
                Object obj2 = this.f10512a;
                fbp fbpVar = (fbp) obj;
                int i2 = fan.f21134e;
                if (fbpVar instanceof ezx) {
                    ((ezx) fbpVar).mo6425bD((Intent) obj2);
                    return;
                }
                return;
            case 14:
                Object obj3 = this.f10512a;
                fbp fbpVar2 = (fbp) obj;
                int i3 = fan.f21134e;
                if (fbpVar2 instanceof ezt) {
                    ((ezt) fbpVar2).mo7784y((Configuration) obj3);
                    return;
                }
                return;
            case 15:
                this.f10512a.mo8080a((fbp) obj);
                return;
            case 16:
                ((faz) obj).mo8080a(this.f10512a);
                return;
            case 17:
                ?? r0 = this.f10512a;
                int i4 = fba.f21187l;
                ((faz) obj).mo8080a(r0);
                return;
            case 18:
                this.f10512a.mo8080a((fbp) obj);
                return;
            case 19:
                ((fvh) this.f10512a).m8829b((String) obj);
                return;
            default:
                ((fvh) this.f10512a).f23627a.put((String) obj, true);
                return;
        }
    }
}
