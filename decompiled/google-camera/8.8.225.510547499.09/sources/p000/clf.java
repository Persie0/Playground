package p000;

import android.hardware.camera2.CaptureResult;
import androidx.wear.ambient.AmbientMode;
import androidx.work.impl.diagnostics.p003tK.KMNlNMe;
import com.google.android.apps.camera.autotimer.analysis.jni.BaseCurator;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class clf implements kfu {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f6097a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f6098b;

    public /* synthetic */ clf(cgj cgjVar, int i) {
        this.f6098b = i;
        this.f6097a = cgjVar;
    }

    public /* synthetic */ clf(clh clhVar, int i) {
        this.f6098b = i;
        this.f6097a = clhVar;
    }

    public /* synthetic */ clf(goh gohVar, int i) {
        this.f6098b = i;
        this.f6097a = gohVar;
    }

    public /* synthetic */ clf(goj gojVar, int i) {
        this.f6098b = i;
        this.f6097a = gojVar;
    }

    @Override // p000.kfu
    /* JADX INFO: renamed from: a */
    public final void mo3915a(final key keyVar) {
        switch (this.f6098b) {
            case 0:
                final clh clhVar = (clh) this.f6097a;
                clhVar.f6106f.execute(new Runnable() { // from class: clg
                    /* JADX WARN: Type inference failed for: r0v28, types: [java.lang.Object, java.util.List] */
                    /* JADX WARN: Type inference failed for: r1v31, types: [java.lang.Object, java.util.List] */
                    @Override // java.lang.Runnable
                    public final void run() {
                        BaseCurator baseCurator;
                        mws mwsVarM17095j;
                        long j;
                        boolean z;
                        long j2;
                        float f;
                        clh clhVar2 = clhVar;
                        key keyVar2 = keyVar;
                        clhVar2.f6112l.mo13961e("AutoTimerAnalysis#processFrame");
                        if (clhVar2.f6102b.f34942d == clv.CAPTURING && (baseCurator = clhVar2.f6113m) != null) {
                            kpw kpwVarMo7043d = keyVar2.mo7043d(clhVar2.f6111k);
                            try {
                                kpp kppVarMo7042c = keyVar2.mo7042c();
                                kfd kfdVarMo7041b = keyVar2.mo7041b();
                                if (kpwVarMo7043d != null && kppVarMo7042c != null && kfdVarMo7041b != null) {
                                    msa msaVar = clhVar2.f6117q;
                                    kbc kbcVarMo14192b = clhVar2.f6111k.mo14192b();
                                    ArrayList arrayList = new ArrayList();
                                    mrm mrmVar = (mrm) clhVar2.f6110j.get();
                                    if (mrmVar.mo16813g()) {
                                        knh knhVar = (knh) mrmVar.mo16809c();
                                        Long l = (Long) kppVarMo7042c.mo9517d(CaptureResult.SENSOR_TIMESTAMP);
                                        l.getClass();
                                        long jLongValue = l.longValue();
                                        Long l2 = (Long) kppVarMo7042c.mo9517d(CaptureResult.SENSOR_EXPOSURE_TIME);
                                        l2.getClass();
                                        long jLongValue2 = jLongValue + l2.longValue() + clhVar2.f6109i.m17680d(kppVarMo7042c);
                                        long nanos = TimeUnit.SECONDS.toNanos(1L) / 200;
                                        knhVar.mo6999b(jLongValue - nanos, jLongValue2 + nanos, new eau(arrayList, 1));
                                        mwsVarM17095j = mws.m17095j(arrayList);
                                    } else {
                                        int i = mws.f41739d;
                                        mwsVarM17095j = mzr.f41857a;
                                    }
                                    gsr gsrVarM9709a = gsr.m9709a(kppVarMo7042c, (imu) msaVar.f41502b, ((cem) msaVar.f41503c).m3566d().f35503e);
                                    nxl nxlVarM18137O = odi.f45622b.m18137O();
                                    List listM16504L = mkv.m16504L(mwsVarM17095j, cgh.f5596l);
                                    if (!nxlVarM18137O.f44974b.m18142ac()) {
                                        nxlVarM18137O.mo18106p();
                                    }
                                    odi odiVar = (odi) nxlVarM18137O.f44974b;
                                    nxy nxyVar = odiVar.f45624a;
                                    if (!nxyVar.mo17770c()) {
                                        odiVar.f45624a = nxq.m18127U(nxyVar);
                                    }
                                    nwb.m17749e(listM16504L, odiVar.f45624a);
                                    odi odiVar2 = (odi) nxlVarM18137O.mo18103l();
                                    ocd ocdVarM6712b = dsy.m6712b(gsrVarM9709a, kbcVarMo14192b.f35517a / gsrVarM9709a.f26260t.width(), kbcVarMo14192b.f35518b / gsrVarM9709a.f26260t.height());
                                    nxl nxlVarM18137O2 = odb.f45576k.m18137O();
                                    int i2 = true != msaVar.f41501a ? 3 : 2;
                                    if (!nxlVarM18137O2.f44974b.m18142ac()) {
                                        nxlVarM18137O2.mo18106p();
                                    }
                                    nxq nxqVar = nxlVarM18137O2.f44974b;
                                    odb odbVar = (odb) nxqVar;
                                    odbVar.f45579b = i2 - 1;
                                    odbVar.f45578a |= 1;
                                    int i3 = gsrVarM9709a.f26259s;
                                    if (i3 == 90) {
                                        i3 = 270;
                                    } else if (i3 == 270) {
                                        i3 = 90;
                                    }
                                    if (!nxqVar.m18142ac()) {
                                        nxlVarM18137O2.mo18106p();
                                    }
                                    nxq nxqVar2 = nxlVarM18137O2.f44974b;
                                    odb odbVar2 = (odb) nxqVar2;
                                    odbVar2.f45578a |= 4;
                                    odbVar2.f45580c = i3;
                                    long j3 = gsrVarM9709a.f26244d;
                                    if (!nxqVar2.m18142ac()) {
                                        nxlVarM18137O2.mo18106p();
                                    }
                                    nxq nxqVar3 = nxlVarM18137O2.f44974b;
                                    odb odbVar3 = (odb) nxqVar3;
                                    odbVar3.f45578a |= 16;
                                    odbVar3.f45581d = j3;
                                    long j4 = gsrVarM9709a.f26245e;
                                    if (!nxqVar3.m18142ac()) {
                                        nxlVarM18137O2.mo18106p();
                                    }
                                    nxq nxqVar4 = nxlVarM18137O2.f44974b;
                                    odb odbVar4 = (odb) nxqVar4;
                                    odbVar4.f45578a |= 32;
                                    odbVar4.f45582e = j4;
                                    long j5 = gsrVarM9709a.f26251k;
                                    if (!nxqVar4.m18142ac()) {
                                        nxlVarM18137O2.mo18106p();
                                    }
                                    nxq nxqVar5 = nxlVarM18137O2.f44974b;
                                    odb odbVar5 = (odb) nxqVar5;
                                    odbVar5.f45578a |= 64;
                                    odbVar5.f45583f = j5;
                                    long j6 = gsrVarM9709a.f26252l;
                                    if (!nxqVar5.m18142ac()) {
                                        nxlVarM18137O2.mo18106p();
                                    }
                                    nxq nxqVar6 = nxlVarM18137O2.f44974b;
                                    odb odbVar6 = (odb) nxqVar6;
                                    odbVar6.f45578a |= 128;
                                    odbVar6.f45584g = j6;
                                    long j7 = gsrVarM9709a.f26250j;
                                    if (!nxqVar6.m18142ac()) {
                                        nxlVarM18137O2.mo18106p();
                                    }
                                    nxq nxqVar7 = nxlVarM18137O2.f44974b;
                                    odb odbVar7 = (odb) nxqVar7;
                                    odbVar7.f45578a |= 256;
                                    odbVar7.f45585h = j7;
                                    long j8 = gsrVarM9709a.f26253m;
                                    if (!nxqVar7.m18142ac()) {
                                        nxlVarM18137O2.mo18106p();
                                    }
                                    nxq nxqVar8 = nxlVarM18137O2.f44974b;
                                    odb odbVar8 = (odb) nxqVar8;
                                    odbVar8.f45578a |= 512;
                                    odbVar8.f45586i = j8;
                                    long j9 = gsrVarM9709a.f26246f;
                                    if (!nxqVar8.m18142ac()) {
                                        nxlVarM18137O2.mo18106p();
                                    }
                                    odb odbVar9 = (odb) nxlVarM18137O2.f44974b;
                                    odbVar9.f45578a |= 1024;
                                    odbVar9.f45587j = j9;
                                    odb odbVar10 = (odb) nxlVarM18137O2.mo18103l();
                                    nxl nxlVarM18137O3 = odg.f45596i.m18137O();
                                    float f2 = gsrVarM9709a.f26256p;
                                    if (!nxlVarM18137O3.f44974b.m18142ac()) {
                                        nxlVarM18137O3.mo18106p();
                                    }
                                    odg odgVar = (odg) nxlVarM18137O3.f44974b;
                                    odgVar.f45598a |= 4;
                                    odgVar.f45599b = f2;
                                    odg odgVar2 = (odg) nxlVarM18137O3.mo18103l();
                                    nxl nxlVarM18137O4 = odh.f45607m.m18137O();
                                    long j10 = kfdVarMo7041b.f35812c;
                                    if (!nxlVarM18137O4.f44974b.m18142ac()) {
                                        nxlVarM18137O4.mo18106p();
                                    }
                                    nxq nxqVar9 = nxlVarM18137O4.f44974b;
                                    odh odhVar = (odh) nxqVar9;
                                    odhVar.f45609a |= 1;
                                    odhVar.f45610b = j10;
                                    long j11 = kfdVarMo7041b.f35811b;
                                    if (!nxqVar9.m18142ac()) {
                                        nxlVarM18137O4.mo18106p();
                                    }
                                    nxq nxqVar10 = nxlVarM18137O4.f44974b;
                                    odh odhVar2 = (odh) nxqVar10;
                                    odhVar2.f45609a |= 2;
                                    odhVar2.f45611c = j11;
                                    if (!nxqVar10.m18142ac()) {
                                        nxlVarM18137O4.mo18106p();
                                    }
                                    nxq nxqVar11 = nxlVarM18137O4.f44974b;
                                    odh odhVar3 = (odh) nxqVar11;
                                    odbVar10.getClass();
                                    odhVar3.f45612d = odbVar10;
                                    odhVar3.f45609a |= 32;
                                    if (!nxqVar11.m18142ac()) {
                                        nxlVarM18137O4.mo18106p();
                                    }
                                    nxq nxqVar12 = nxlVarM18137O4.f44974b;
                                    odh odhVar4 = (odh) nxqVar12;
                                    ocdVarM6712b.getClass();
                                    odhVar4.f45613e = ocdVarM6712b;
                                    odhVar4.f45609a |= 64;
                                    boolean z2 = gsrVarM9709a.f26258r;
                                    if (!nxqVar12.m18142ac()) {
                                        nxlVarM18137O4.mo18106p();
                                    }
                                    nxq nxqVar13 = nxlVarM18137O4.f44974b;
                                    odh odhVar5 = (odh) nxqVar13;
                                    odhVar5.f45609a |= 512;
                                    odhVar5.f45614f = z2;
                                    if (!nxqVar13.m18142ac()) {
                                        nxlVarM18137O4.mo18106p();
                                    }
                                    nxq nxqVar14 = nxlVarM18137O4.f44974b;
                                    odh odhVar6 = (odh) nxqVar14;
                                    odiVar2.getClass();
                                    odhVar6.f45616h = odiVar2;
                                    odhVar6.f45609a |= 16384;
                                    if (!nxqVar14.m18142ac()) {
                                        nxlVarM18137O4.mo18106p();
                                    }
                                    odh odhVar7 = (odh) nxlVarM18137O4.f44974b;
                                    odgVar2.getClass();
                                    odhVar7.f45617i = odgVar2;
                                    odhVar7.f45609a |= 32768;
                                    try {
                                        oef oefVarMo4036a = baseCurator.mo4036a(kpwVarMo7043d, (odh) nxlVarM18137O4.mo18103l());
                                        clz clzVar = clhVar2.f6104d;
                                        long j12 = kfdVarMo7041b.f35812c;
                                        HashSet hashSet = new HashSet(clzVar.f6193c.keySet());
                                        clzVar.f6194d = j12;
                                        if (clzVar.f6195e == 0) {
                                            clzVar.f6195e = j12;
                                        }
                                        ocx ocxVar = oefVarMo4036a.f45722a;
                                        if (ocxVar == null) {
                                            ocxVar = ocx.f45560d;
                                        }
                                        if ((ocxVar.f45562a & 1) != 0) {
                                            ocz oczVar = ocxVar.f45563b;
                                            if (oczVar == null) {
                                                oczVar = ocz.f45569b;
                                            }
                                            Iterator it = oczVar.f45571a.iterator();
                                            while (it.hasNext()) {
                                                Long lValueOf = Long.valueOf(((Long) it.next()).longValue());
                                                hashSet.remove(lValueOf);
                                                float f3 = oefVarMo4036a.f45723b;
                                                cly clyVar = new cly();
                                                msd msdVar = new msd(clzVar.f6192b);
                                                msdVar.m16860e();
                                                clyVar.f6189a = msdVar;
                                                clyVar.f6190b = f3;
                                                clzVar.f6193c.put(lValueOf, clyVar);
                                            }
                                        }
                                        if ((ocxVar.f45562a & 2) != 0) {
                                            ocy ocyVar = ocxVar.f45564c;
                                            if (ocyVar == null) {
                                                ocyVar = ocy.f45565b;
                                            }
                                            j = ocyVar.f45567a;
                                            hashSet.remove(Long.valueOf(j));
                                        } else {
                                            j = 0;
                                        }
                                        Iterator it2 = hashSet.iterator();
                                        while (it2.hasNext()) {
                                            if (clzVar.f6193c.remove(Long.valueOf(((Long) it2.next()).longValue())) != null) {
                                                clzVar.f6196f++;
                                            }
                                        }
                                        if (j != 0) {
                                            odh odhVar8 = oefVarMo4036a.f45725d;
                                            if (odhVar8 == null) {
                                                odhVar8 = odh.f45607m;
                                            }
                                            odh odhVar9 = odhVar8;
                                            cly clyVar2 = (cly) clzVar.f6193c.remove(Long.valueOf(j));
                                            if (clyVar2 != null) {
                                                clyVar2.f6189a.m16861f();
                                                long jM16857a = clyVar2.f6189a.m16857a(TimeUnit.MILLISECONDS);
                                                f = clyVar2.f6190b;
                                                j2 = jM16857a;
                                            } else {
                                                j2 = 0;
                                                f = 0.0f;
                                            }
                                            msd msdVar2 = clzVar.f6191a;
                                            if (msdVar2.f41535a) {
                                                msdVar2.m16861f();
                                            }
                                            long jM16857a2 = clzVar.f6191a.m16857a(TimeUnit.MILLISECONDS);
                                            long j13 = clzVar.f6194d;
                                            long j14 = j13 - j;
                                            long j15 = j - clzVar.f6195e;
                                            clzVar.f6195e = j13;
                                            clzVar.f6191a.m16859d();
                                            clzVar.f6191a.m16860e();
                                            int i4 = clzVar.f6196f;
                                            clzVar.f6196f = 0;
                                            clx clxVar = new clx(jM16857a2, j2, i4, (int) j15, (int) j14, f, odhVar9);
                                            cwd cwdVar = clzVar.f6197g;
                                            synchronized (cwdVar.f9866a) {
                                                Iterator it3 = cwdVar.f9866a.iterator();
                                                while (it3.hasNext()) {
                                                    ((clk) it3.next()).mo3918a(j, clxVar);
                                                }
                                            }
                                        }
                                        oeg oegVar = oefVarMo4036a.f45724c;
                                        if (oegVar == null) {
                                            oegVar = oeg.f45729d;
                                        }
                                        if ((oegVar.f45731a & 1) != 0) {
                                            clhVar2.f6103c.mo3415bf(Float.valueOf(oegVar.f45732b));
                                            z = oegVar.f45733c;
                                        } else {
                                            ((nbe) ((nbe) clh.f6101a.m17252c()).mo17276G(239)).mo17290o(KMNlNMe.MKI);
                                            z = false;
                                        }
                                        kpwVarMo7043d.close();
                                        if (z) {
                                            cwd cwdVar2 = clhVar2.f6118r;
                                            synchronized (cwdVar2.f9866a) {
                                                Iterator it4 = cwdVar2.f9866a.iterator();
                                                while (it4.hasNext()) {
                                                    Object obj = ((AmbientMode.AmbientController) it4.next()).f1697a;
                                                    ((euf) obj).f19997d.execute(new esc((euf) obj, 15));
                                                }
                                            }
                                        }
                                    } catch (IOException e) {
                                        ((nbe) ((nbe) ((nbe) clh.f6101a.m17252c()).mo17283h(e)).mo17276G(241)).mo17290o("Could not parse curation result, ignoring frame.");
                                        kpwVarMo7043d.close();
                                    }
                                } else if (kpwVarMo7043d != null) {
                                    kpwVarMo7043d.close();
                                }
                            } catch (Throwable th) {
                                if (kpwVarMo7043d == null) {
                                    throw th;
                                }
                                try {
                                    kpwVarMo7043d.close();
                                    throw th;
                                } catch (Throwable th2) {
                                    try {
                                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                                        throw th;
                                    } catch (Exception e2) {
                                        throw th;
                                    }
                                }
                            }
                        }
                        clhVar2.f6112l.mo13962f();
                        keyVar2.close();
                    }
                });
                break;
            case 1:
                cgj cgjVar = (cgj) this.f6097a;
                cgjVar.f5610c.execute(new cgl(cgjVar, keyVar, 1));
                break;
            case 2:
                ((goj) this.f6097a).m9580b(keyVar);
                break;
            default:
                goh gohVar = (goh) this.f6097a;
                new jvw(gohVar.f25865e, new juz(new kba[]{keyVar}, 7), not.INSTANCE, 0).execute(new gqn(gohVar, keyVar, 1));
                break;
        }
    }
}
