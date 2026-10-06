package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.hardware.HardwareBuffer;
import android.os.Handler;
import android.view.Surface;
import androidx.wear.ambient.AmbientMode;
import androidx.work.impl.background.systemalarm.ConstraintProxy$BatteryChargingProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxy$BatteryNotLowProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxy$NetworkStateProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxy$StorageNotLowProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver;
import com.google.android.apps.camera.debug.shottracker.p009db.ShotDatabase;
import com.google.android.gms.common.annotation.HJo.JrxsYuVZZqnFC;
import com.google.android.libraries.lens.lenslite.api.arLu.YmzeHXaMYOLk;
import com.google.android.libraries.oliveoil.p018gl.EGLImage;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bmj implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f3780a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f3781b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ Object f3782c;

    /* JADX INFO: renamed from: d */
    private final /* synthetic */ int f3783d;

    public bmj(Intent intent, Context context, BroadcastReceiver.PendingResult pendingResult, int i) {
        this.f3783d = i;
        this.f3780a = intent;
        this.f3782c = context;
        this.f3781b = pendingResult;
    }

    public bmj(bmk bmkVar, bnk bnkVar, Handler handler, int i) {
        this.f3783d = i;
        this.f3782c = bmkVar;
        this.f3780a = bnkVar;
        this.f3781b = handler;
    }

    public bmj(bnb bnbVar, Handler handler, AmbientMode.AmbientController ambientController, int i, byte[] bArr) {
        this.f3783d = i;
        this.f3782c = bnbVar;
        this.f3781b = handler;
        this.f3780a = ambientController;
    }

    public bmj(bnb bnbVar, Camera.Parameters[] parametersArr, bnt bntVar, int i) {
        this.f3783d = i;
        this.f3781b = bnbVar;
        this.f3780a = parametersArr;
        this.f3782c = bntVar;
    }

    public bmj(bnq bnqVar, Handler handler, bnm bnmVar, int i) {
        this.f3783d = i;
        this.f3780a = bnqVar;
        this.f3781b = handler;
        this.f3782c = bnmVar;
    }

    public bmj(bnq bnqVar, Handler handler, bnr bnrVar, int i) {
        this.f3783d = i;
        this.f3782c = bnqVar;
        this.f3781b = handler;
        this.f3780a = bnrVar;
    }

    public /* synthetic */ bmj(cib cibVar, Thread thread, Throwable th, int i) {
        this.f3783d = i;
        this.f3781b = cibVar;
        this.f3782c = thread;
        this.f3780a = th;
    }

    public /* synthetic */ bmj(cwy cwyVar, kmq kmqVar, gyv gyvVar, int i) {
        this.f3783d = i;
        this.f3781b = cwyVar;
        this.f3780a = kmqVar;
        this.f3782c = gyvVar;
    }

    public /* synthetic */ bmj(czp czpVar, key keyVar, kgg kggVar, int i) {
        this.f3783d = i;
        this.f3781b = czpVar;
        this.f3782c = keyVar;
        this.f3780a = kggVar;
    }

    public /* synthetic */ bmj(dep depVar, Bitmap bitmap, deb debVar, int i) {
        this.f3783d = i;
        this.f3780a = depVar;
        this.f3781b = bitmap;
        this.f3782c = debVar;
    }

    public /* synthetic */ bmj(dge dgeVar, cvy cvyVar, jvb jvbVar, int i, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f3783d = i;
        this.f3782c = dgeVar;
        this.f3781b = cvyVar;
        this.f3780a = jvbVar;
    }

    public /* synthetic */ bmj(dlx dlxVar, kbo kboVar, oju ojuVar, int i) {
        this.f3783d = i;
        this.f3781b = dlxVar;
        this.f3782c = kboVar;
        this.f3780a = ojuVar;
    }

    public /* synthetic */ bmj(dyf dyfVar, kpp kppVar, kay kayVar, int i) {
        this.f3783d = i;
        this.f3781b = dyfVar;
        this.f3780a = kppVar;
        this.f3782c = kayVar;
    }

    public /* synthetic */ bmj(elv elvVar, elw elwVar, Runnable runnable, int i) {
        this.f3783d = i;
        this.f3781b = elvVar;
        this.f3782c = elwVar;
        this.f3780a = runnable;
    }

    public /* synthetic */ bmj(elv elvVar, ilk ilkVar, hzj hzjVar, int i) {
        this.f3783d = i;
        this.f3781b = elvVar;
        this.f3780a = ilkVar;
        this.f3782c = hzjVar;
    }

    public /* synthetic */ bmj(eod eodVar, EGLImage eGLImage, HardwareBuffer hardwareBuffer, int i) {
        this.f3783d = i;
        this.f3782c = eodVar;
        this.f3780a = eGLImage;
        this.f3781b = hardwareBuffer;
    }

    public /* synthetic */ bmj(eog eogVar, SurfaceTexture surfaceTexture, kgi kgiVar, int i, byte[] bArr) {
        this.f3783d = i;
        this.f3782c = eogVar;
        this.f3781b = surfaceTexture;
        this.f3780a = kgiVar;
    }

    public /* synthetic */ bmj(eud eudVar, String str, oju ojuVar, int i, byte[] bArr) {
        this.f3783d = i;
        this.f3781b = eudVar;
        this.f3782c = str;
        this.f3780a = ojuVar;
    }

    public /* synthetic */ bmj(jwn jwnVar, oju ojuVar, jvb jvbVar, int i) {
        this.f3783d = i;
        this.f3782c = jwnVar;
        this.f3780a = ojuVar;
        this.f3781b = jvbVar;
    }

    public /* synthetic */ bmj(oju ojuVar, oju ojuVar2, oju ojuVar3, int i) {
        this.f3783d = i;
        this.f3781b = ojuVar;
        this.f3782c = ojuVar2;
        this.f3780a = ojuVar3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v69, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r0v89, types: [java.lang.Object, jwn] */
    /* JADX WARN: Type inference failed for: r1v33, types: [java.lang.Object, key] */
    /* JADX WARN: Type inference failed for: r1v49, types: [java.lang.Object, kbo] */
    /* JADX WARN: Type inference failed for: r1v56, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r1v61, types: [java.lang.Object, kpp] */
    /* JADX WARN: Type inference failed for: r1v70, types: [elw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v74, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r2v19, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r2v28, types: [java.lang.Object, kgg] */
    /* JADX WARN: Type inference failed for: r2v38, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r2v39, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r2v53, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r3v8, types: [bnr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v2, types: [bnm, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        nvg nvgVar;
        Object exnVar = null;
        int i = 1;
        switch (this.f3783d) {
            case 0:
                exnVar = this.f3780a != null ? new exn(this, 1) : null;
                ((bmk) this.f3782c).f3786c.f3833c.m2804e(48);
                ((bmk) this.f3782c).f3786c.f3832b.obtainMessage(301, exnVar).sendToTarget();
                return;
            case 1:
                try {
                    boolean booleanExtra = ((Intent) this.f3780a).getBooleanExtra(JrxsYuVZZqnFC.srJ, false);
                    boolean booleanExtra2 = ((Intent) this.f3780a).getBooleanExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", false);
                    boolean booleanExtra3 = ((Intent) this.f3780a).getBooleanExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", false);
                    boolean booleanExtra4 = ((Intent) this.f3780a).getBooleanExtra("KEY_NETWORK_STATE_PROXY_ENABLED", false);
                    ayc.m2099a();
                    int i2 = ConstraintProxyUpdateReceiver.f1809a;
                    bdz.m2261a((Context) this.f3782c, ConstraintProxy$BatteryNotLowProxy.class, booleanExtra);
                    bdz.m2261a((Context) this.f3782c, ConstraintProxy$BatteryChargingProxy.class, booleanExtra2);
                    bdz.m2261a((Context) this.f3782c, ConstraintProxy$StorageNotLowProxy.class, booleanExtra3);
                    bdz.m2261a((Context) this.f3782c, ConstraintProxy$NetworkStateProxy.class, booleanExtra4);
                    return;
                } finally {
                    ((BroadcastReceiver.PendingResult) this.f3781b).finish();
                }
            case 2:
                ((bnb) this.f3781b).f3856a.f3879d.obtainMessage(202, this.f3780a).sendToTarget();
                ((bnb) this.f3781b).f3856a.f3879d.post(((bnt) this.f3782c).f3894a);
                return;
            case 3:
                ((bnb) this.f3782c).f3856a.f3879d.obtainMessage(107, bnf.m2766a((Handler) this.f3781b, (AmbientMode.AmbientController) this.f3780a)).sendToTarget();
                return;
            case 4:
                ((bnb) this.f3782c).f3856a.f3879d.obtainMessage(104, bnf.m2766a((Handler) this.f3781b, (AmbientMode.AmbientController) this.f3780a)).sendToTarget();
                return;
            case 5:
                bnq bnqVar = (bnq) this.f3780a;
                bnqVar.mo2718c().obtainMessage(3, bnqVar.mo2716a(), 0, bnn.m2773e((Handler) this.f3781b, this.f3782c)).sendToTarget();
                return;
            case 6:
                Handler handlerMo2718c = ((bnq) this.f3782c).mo2718c();
                Object obj = this.f3781b;
                ?? r3 = this.f3780a;
                if (obj != null && r3 != 0) {
                    exnVar = new bns((Handler) obj, r3);
                }
                handlerMo2718c.obtainMessage(102, exnVar).sendToTarget();
                return;
            case 7:
                ((cib) this.f3781b).m3796b((Thread) this.f3782c, (Throwable) this.f3780a);
                return;
            case 8:
                Object obj2 = this.f3781b;
                Object obj3 = this.f3782c;
                ?? r2 = this.f3780a;
                eud eudVar = (eud) obj2;
                String str = (String) obj3;
                ((civ) eudVar.f19907a).f5901b.mo13961e(str.concat(YmzeHXaMYOLk.NPzeoktbuuwv));
                Set set = (Set) r2.get();
                ((civ) eudVar.f19907a).f5901b.mo13963g(str.concat("#run-all"));
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    Runnable runnableMo13959c = ((civ) eudVar.f19907a).f5901b.mo13959c("#run", (hjk) it.next());
                    runnableMo13959c.getClass();
                    new dlr(runnableMo13959c, i).run();
                }
                ((civ) eudVar.f19907a).f5901b.mo13962f();
                return;
            case 9:
                Object obj4 = this.f3781b;
                Object obj5 = this.f3780a;
                Object obj6 = this.f3782c;
                cwy cwyVar = (cwy) obj4;
                cwyVar.f9917h = kxk.m14972R(cwyVar.f9911b.mo5681b((kay) ((jwf) cwyVar.f9910a.f9285o).f34942d), 1000L, TimeUnit.MILLISECONDS, cwyVar.f9913d);
                kxk.m14975U(cwyVar.f9917h, new cwx(cwyVar, (kmq) obj5, (gyv) obj6, 0), not.INSTANCE);
                return;
            case 10:
                ((czp) this.f3781b).m5741b(this.f3782c, this.f3780a);
                return;
            case 11:
                Object obj7 = this.f3780a;
                Object obj8 = this.f3781b;
                Object obj9 = this.f3782c;
                dep depVar = (dep) obj7;
                iad iadVar = depVar.f10698q;
                ofk ofkVarM17743c = nvn.m17743c();
                ofkVarM17743c.f45859g = obj8;
                deb debVar = (deb) obj9;
                ofkVarM17743c.f45856d = Integer.valueOf(debVar.f10642l == 3 ? 7 : 0);
                if (debVar.f10635e.mo16813g()) {
                    nxl nxlVarM18137O = nvg.f44740c.m18137O();
                    nxl nxlVarM18137O2 = nva.f44726c.m18137O();
                    nuy nuyVar = (nuy) debVar.f10635e.mo16809c();
                    if (!nxlVarM18137O2.f44974b.m18142ac()) {
                        nxlVarM18137O2.mo18106p();
                    }
                    nva nvaVar = (nva) nxlVarM18137O2.f44974b;
                    nvaVar.f44729b = nuyVar;
                    nvaVar.f44728a |= 1;
                    if (!nxlVarM18137O.f44974b.m18142ac()) {
                        nxlVarM18137O.mo18106p();
                    }
                    nvg nvgVar2 = (nvg) nxlVarM18137O.f44974b;
                    nva nvaVar2 = (nva) nxlVarM18137O2.mo18103l();
                    nvaVar2.getClass();
                    nvgVar2.f44743b = nvaVar2;
                    nvgVar2.f44742a = 1;
                    nvgVar = (nvg) nxlVarM18137O.mo18103l();
                } else {
                    nvgVar = nvg.f44740c;
                }
                ofkVarM17743c.f45854b = nvgVar;
                iadVar.f30130h = ofkVarM17743c.m18465b();
                if (depVar.f10697p.mo8564b(ikw.LENS)) {
                    return;
                }
                depVar.f10698q.m10980f();
                return;
            case 12:
                Object obj10 = this.f3782c;
                Object obj11 = this.f3781b;
                Object obj12 = this.f3780a;
                dge dgeVar = (dge) obj10;
                dgeVar.m6100c((cvy) obj11);
                obj10.getClass();
                ((jvb) obj12).m13537d(new dev(dgeVar, 4));
                return;
            case 13:
                Object obj13 = this.f3781b;
                ?? r1 = this.f3782c;
                ?? r4 = this.f3780a;
                r1.mo13944f(kfv.m14168E("Setup DB (with crashOnSqlErrors=%b)", false));
                dlx dlxVar = (dlx) obj13;
                dlxVar.f11998f = (ShotDatabase) r4.get();
                dlz dlzVarMo4093w = dlxVar.f11998f.mo4093w();
                dlzVarMo4093w.getClass();
                dlxVar.f11999g = dlzVarMo4093w;
                dmi dmiVarMo4094x = dlxVar.f11998f.mo4094x();
                dmiVarMo4094x.getClass();
                dlxVar.f12000h = dmiVarMo4094x;
                return;
            case 14:
                ?? r0 = this.f3781b;
                ?? r5 = this.f3782c;
                ?? r6 = this.f3780a;
                mxk mxkVar = dsw.f12520a;
                ((bko) ((cvy) r0.get()).f9845b).m2631y((dsx) r5.get());
                ((jvb) r6.get()).m13537d(new dev((oju) r0, 15));
                return;
            case 15:
                dyf dyfVar = (dyf) this.f3781b;
                gsr gsrVarM9709a = gsr.m9709a(this.f3780a, dyfVar.f12892b, ((kay) this.f3782c).f35503e);
                dxx dxxVar = dyfVar.f12891a;
                dxxVar.f12859a.m14861n(dyv.m6940c(gsrVarM9709a.f26243c), gsrVarM9709a);
                dxxVar.m6889e(gsrVarM9709a);
                return;
            case 16:
                Object obj14 = this.f3782c;
                Object obj15 = this.f3781b;
                Object obj16 = this.f3780a;
                eog eogVar = (eog) obj14;
                eim eimVar = (eim) eogVar.f14852a;
                kfk kfkVar = eimVar.f14157h;
                if (kfkVar == null || obj15 == null) {
                    return;
                }
                eimVar.f14158i = new Surface((SurfaceTexture) obj15);
                kgg kggVarMo14137b = kfkVar.mo14116c().mo14137b((kgi) obj16);
                eim eimVar2 = (eim) eogVar.f14852a;
                eimVar2.f14159j = kggVarMo14137b;
                kggVarMo14137b.mo14194d(eimVar2.f14158i);
                ((eim) eogVar.f14852a).f14160k = kfkVar.mo14131r(kfkVar.mo14132s(kggVarMo14137b), 1);
                eim eimVar3 = (eim) eogVar.f14852a;
                eimVar3.f14160k.mo9411k(eimVar3.f14162m);
                return;
            case 17:
                Object obj17 = this.f3781b;
                ?? r7 = this.f3782c;
                ?? r8 = this.f3780a;
                synchronized (elv.f14672a) {
                    if (((elv) obj17).f14675d.contains(r7)) {
                        r7.mo7497f(r8);
                    } else {
                        r8.run();
                    }
                    break;
                }
                return;
            case 18:
                Object obj18 = this.f3781b;
                Object obj19 = this.f3780a;
                Object obj20 = this.f3782c;
                synchronized (elv.f14672a) {
                    elw elwVar = ((elv) obj18).f14683l;
                    if (elwVar != null) {
                        elwVar.mo7508q(((elv) obj18).f14685n, ((elv) obj18).f14679h, ((elv) obj18).f14680i, (ilk) obj19, (hzj) obj20);
                    }
                    break;
                }
                return;
            case 19:
                Object obj21 = this.f3782c;
                Object obj22 = this.f3780a;
                Object obj23 = this.f3781b;
                lzd.m16234m(((eod) obj21).f14839c);
                ((EGLImage) obj22).close();
                ((HardwareBuffer) obj23).close();
                return;
            default:
                ?? r9 = this.f3782c;
                ?? r10 = this.f3780a;
                Object obj24 = this.f3781b;
                if (((Boolean) r9.mo3831be()).booleanValue()) {
                    ((epz) r10.get()).m7668a();
                    return;
                } else {
                    ((jvb) obj24).m13537d(r9.mo3830a(new ecr(new AtomicBoolean(false), (oju) r10, 6), not.INSTANCE));
                    return;
                }
        }
    }
}
