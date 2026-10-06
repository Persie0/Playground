package p000;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import com.google.android.apps.camera.jni.mallopt.Mallopt;
import com.google.android.apps.camera.stats.timing.CameraActivityTiming;
import com.google.android.apps.camera.util.p015ui.mfv.EArqVBjecl;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class cis implements kao {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f5889a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f5890b;

    public /* synthetic */ cis(cdd cddVar, int i) {
        this.f5890b = i;
        this.f5889a = cddVar;
    }

    public /* synthetic */ cis(cit citVar, int i) {
        this.f5890b = i;
        this.f5889a = citVar;
    }

    public /* synthetic */ cis(cmo cmoVar, int i, byte[] bArr) {
        this.f5890b = i;
        this.f5889a = cmoVar;
    }

    public /* synthetic */ cis(cpd cpdVar, int i) {
        this.f5890b = i;
        this.f5889a = cpdVar;
    }

    public /* synthetic */ cis(czv czvVar, int i) {
        this.f5890b = i;
        this.f5889a = czvVar;
    }

    public /* synthetic */ cis(ddw ddwVar, int i) {
        this.f5890b = i;
        this.f5889a = ddwVar;
    }

    public /* synthetic */ cis(ecn ecnVar, int i) {
        this.f5890b = i;
        this.f5889a = ecnVar;
    }

    public /* synthetic */ cis(eog eogVar, int i, byte[] bArr) {
        this.f5890b = i;
        this.f5889a = eogVar;
    }

    public /* synthetic */ cis(eog eogVar, int i, char[] cArr) {
        this.f5890b = i;
        this.f5889a = eogVar;
    }

    public /* synthetic */ cis(eog eogVar, int i, short[] sArr) {
        this.f5890b = i;
        this.f5889a = eogVar;
    }

    public /* synthetic */ cis(esl eslVar, int i) {
        this.f5890b = i;
        this.f5889a = eslVar;
    }

    public /* synthetic */ cis(euf eufVar, int i) {
        this.f5890b = i;
        this.f5889a = eufVar;
    }

    public /* synthetic */ cis(foc focVar, int i) {
        this.f5890b = i;
        this.f5889a = focVar;
    }

    public /* synthetic */ cis(foe foeVar, int i) {
        this.f5890b = i;
        this.f5889a = foeVar;
    }

    public /* synthetic */ cis(fvs fvsVar, int i) {
        this.f5890b = i;
        this.f5889a = fvsVar;
    }

    public /* synthetic */ cis(hee heeVar, int i, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f5890b = i;
        this.f5889a = heeVar;
    }

    public /* synthetic */ cis(Runnable runnable, int i) {
        this.f5890b = i;
        this.f5889a = runnable;
    }

    public /* synthetic */ cis(jwl jwlVar, int i, byte[] bArr, byte[] bArr2) {
        this.f5890b = i;
        this.f5889a = jwlVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v21, types: [bnm, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v42, types: [java.lang.Object, ohb] */
    /* JADX WARN: Type inference failed for: r0v46, types: [android.content.DialogInterface$OnClickListener, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v32, types: [dhv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v36, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r6v23, types: [java.lang.Object, java.lang.Runnable] */
    @Override // p000.kao
    /* JADX INFO: renamed from: a */
    public final void mo3483a(Object obj) {
        String stringExtra;
        int i = 3;
        switch (this.f5890b) {
            case 0:
                Object obj2 = this.f5889a;
                ServiceConnection serviceConnection = (ServiceConnection) obj;
                try {
                    ((cit) obj2).f5893c.mo13961e("unbindPhotosService");
                    Context context = ((cit) obj2).f5892b;
                    lku.m15662p(serviceConnection);
                    context.unbindService(serviceConnection);
                    return;
                } finally {
                    ((cit) obj2).f5893c.mo13962f();
                }
            case 1:
                Object obj3 = this.f5889a;
                jwn jwnVar = (jwn) obj;
                if (jwnVar == null) {
                    return;
                }
                cdd cddVar = (cdd) obj3;
                cddVar.f5270g = jwnVar.mo3830a(new cbx(cddVar, 6), jvh.m13554b());
                return;
            case 2:
                cpw cpwVar = (cpw) obj;
                cpd cpdVar = (cpd) this.f5889a;
                cpdVar.f8530h.mo3415bf(fnb.f22776b);
                cqm cqmVar = cpdVar.f8526d;
                cqmVar.m5372m(false);
                cqmVar.f8968w.mo3717g();
                if (cpwVar != null) {
                    cur curVar = cpwVar.f8697m;
                    curVar.m5539d();
                    hnw hnwVar = curVar.f9666a;
                    hnwVar.getClass();
                    curVar.f9677l = hnwVar.mo10519f(curVar);
                    return;
                }
                return;
            case 3:
                mrm mrmVar = (mrm) obj;
                czv czvVar = (czv) this.f5889a;
                ScheduledFuture scheduledFuture = czvVar.f10168g;
                if (scheduledFuture != null && !scheduledFuture.isDone()) {
                    czvVar.f10168g.cancel(false);
                }
                if (mrmVar == null || !mrmVar.mo16813g()) {
                    czvVar.f10169h.m11342g(czvVar.f10165d);
                    if (inr.m11534f(czvVar.f10162a) == 3) {
                        czvVar.f10169h.m11341f(czvVar.f10165d);
                        czvVar.f10163b.mo4328l();
                        return;
                    } else {
                        czvVar.f10163b.mo4317a();
                        czvVar.f10163b.mo4326j();
                        return;
                    }
                }
                inf infVar = (inf) mrmVar.mo16809c();
                int i2 = infVar.f31584a;
                if (i2 == 8) {
                    String str = infVar.f31586c;
                    if (str != null) {
                        czvVar.f10163b.mo4325i(str);
                        return;
                    }
                    return;
                }
                if (i2 != 16) {
                    czvVar.f10163b.mo4328l();
                    czvVar.f10168g = czvVar.f10166e.schedule(new cui(czvVar, 17), 150L, TimeUnit.MILLISECONDS);
                    return;
                }
                return;
            case 4:
                this.f5889a.run();
                return;
            case 5:
                ((ddw) this.f5889a).m5961d();
                return;
            case 6:
                Object obj4 = this.f5889a;
                Boolean bool = (Boolean) obj;
                synchronized (obj4) {
                    ((ddw) obj4).f10606a.mo14894e(Boolean.valueOf(Boolean.TRUE.equals(bool)));
                    break;
                }
                return;
            case 7:
                ecn ecnVar = (ecn) this.f5889a;
                ecnVar.f13386d.mo13961e("HdrPlusPrewarm");
                if (ecnVar.f13385c.mo6184l(dib.f11235V) && !Mallopt.setOptions(256, 33554432)) {
                    ((nbe) ((nbe) ecn.f13383a.m17252c()).mo17276G((char) 1291)).mo17290o("Failed to set mallopt options.");
                }
                ecnVar.f13386d.mo13961e("gcamdeps");
                enc.m7546b();
                ecnVar.f13386d.mo13962f();
                ecnVar.f13386d.mo13961e("gcam");
                ecnVar.f13384b.get();
                ecnVar.f13386d.mo13962f();
                mrm mrmVar2 = ecnVar.f13387e;
                if (mrmVar2.mo16813g()) {
                    if (((gtz) mrmVar2.mo16809c()).mo4264g()) {
                        ecnVar.f13386d.mo13961e(EArqVBjecl.plkRvTNVnFuys);
                        ((gpx) ((mrq) ecnVar.f13388f).f41482a).mo9618b();
                        ecnVar.f13386d.mo13962f();
                    }
                    ecnVar.f13386d.mo13961e("rectiface");
                    ((gtz) ecnVar.f13387e.mo16809c()).mo4262e();
                    ecnVar.f13386d.mo13962f();
                }
                ecnVar.f13386d.mo13962f();
                return;
            case 8:
                ?? r0 = this.f5889a;
                chg chgVar = (chg) obj;
                chgVar.getClass();
                lku.m15613H(chgVar.f5731c == null);
                chgVar.f5731c = r0;
                esl eslVar = (esl) r0;
                chgVar.f5734f.add(eslVar.f15326H);
                eslVar.f15339U.m3529i().m13537d(new eip(eslVar, chgVar, 7));
                return;
            case 9:
                esl eslVar2 = (esl) this.f5889a;
                if (eslVar2.f15323E) {
                    eslVar2.f15323E = false;
                    Handler handler = eslVar2.f15401e;
                    cht chtVar = (cht) eslVar2.f15414r.get();
                    chtVar.getClass();
                    handler.post(new esc(chtVar, i));
                    return;
                }
                return;
            case 10:
                ((euf) this.f5889a).f19915B.mo3693g().mo3724n();
                return;
            case 11:
                Object obj5 = this.f5889a;
                cet cetVar = (cet) obj;
                cetVar.getClass();
                cetVar.mo3577c();
                ((euf) obj5).f19979an.m3528h().m13537d(new eds(cetVar, 10));
                return;
            case 12:
                ((eus) ((eog) this.f5889a).f14852a).f20187e.mo3693g().mo3724n();
                return;
            case 13:
                ((eva) ((eog) this.f5889a).f14852a).f20310d.mo3693g().mo3724n();
                return;
            case 14:
                evf evfVar = ((evo) ((cmo) this.f5889a).f6236a).f20431p;
                jvd.m13538a();
                evfVar.f20382b.mo3724n();
                return;
            case 15:
                ((ewa) ((eog) this.f5889a).f14852a).f20547e.mo3693g().mo3724n();
                return;
            case 16:
                Object obj6 = this.f5889a;
                hmq hmqVar = (hmq) obj;
                synchronized (obj6) {
                    ?? r1 = ((jwl) obj6).f34957d;
                    dhx dhxVar = dib.f11240a;
                    r1.mo6175c();
                    hmqVar.getClass();
                    ((jwl) obj6).f34954a = hmqVar.m10467c();
                    break;
                }
                return;
            case 17:
                Object obj7 = this.f5889a;
                hmq hmqVar2 = (hmq) obj;
                lku.m15662p(hmqVar2);
                if (!hmqVar2.m10466b()) {
                    hee heeVar = (hee) obj7;
                    ((jfs) heeVar.f27443g).m13080O(heeVar.f27438b).show();
                    return;
                } else {
                    hee heeVar2 = (hee) obj7;
                    ((hmn) heeVar2.f27444h.get()).m10461e(hmqVar2);
                    ((ljf) heeVar2.f27437a.get()).m15530f(hmqVar2);
                    return;
                }
            case 18:
                Object obj8 = this.f5889a;
                if (((hmq) obj).m10466b()) {
                    return;
                }
                foc focVar = (foc) obj8;
                focVar.f22841T.m13080O(focVar.f22833L).show();
                return;
            case 19:
                foe foeVar = (foe) this.f5889a;
                foeVar.f22918c.mo3415bf(fnb.f22776b);
                Intent intentM2611e = foeVar.f22920e.m2611e();
                if (intentM2611e == null || (stringExtra = intentM2611e.getStringExtra("more_modes_route")) == null) {
                    return;
                }
                intentM2611e.putExtra("com.google.assistant.extra.CAMERA_MODE", stringExtra);
                intentM2611e.removeExtra("more_modes_route");
                foeVar.f22917b.mo11008g(cds.m3505d(intentM2611e));
                return;
            default:
                CameraActivityTiming cameraActivityTiming = ((fvs) this.f5889a).f23682h;
                cameraActivityTiming.m10438i(hkp.f28195l, CameraActivityTiming.f6961a);
                cameraActivityTiming.f6967g.mo13952a();
                cameraActivityTiming.f6967g = kcc.f35555b;
                return;
        }
    }
}
