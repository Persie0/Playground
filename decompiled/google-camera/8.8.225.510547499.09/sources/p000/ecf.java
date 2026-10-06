package p000;

import android.content.pm.PackageInfo;
import com.google.googlex.gcam.FloatArray2;
import com.google.googlex.gcam.Gcam;
import com.google.googlex.gcam.GcamModuleJNI;
import com.google.googlex.gcam.InitParams;
import com.google.googlex.gcam.StaticMetadata;
import com.google.googlex.gcam.StaticMetadataVector;
import com.google.googlex.gcam.hdrplus.HalideRuntime;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ecf implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f13342a;

    /* JADX INFO: renamed from: b */
    private final oju f13343b;

    /* JADX INFO: renamed from: c */
    private final oju f13344c;

    /* JADX INFO: renamed from: d */
    private final oju f13345d;

    /* JADX INFO: renamed from: e */
    private final oju f13346e;

    /* JADX INFO: renamed from: f */
    private final oju f13347f;

    /* JADX INFO: renamed from: g */
    private final oju f13348g;

    public ecf(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7) {
        this.f13342a = ojuVar;
        this.f13343b = ojuVar2;
        this.f13344c = ojuVar3;
        this.f13345d = ojuVar4;
        this.f13346e = ojuVar5;
        this.f13347f = ojuVar6;
        this.f13348g = ojuVar7;
    }

    @Override // p000.oju
    public final /* synthetic */ Object get() {
        PackageInfo packageInfo = ((inb) this.f13342a).get();
        kme kmeVar = ((kak) this.f13343b).get();
        Object obj = this.f13344c.get();
        kbz kbzVar = (kbz) this.f13345d.get();
        djm djmVar = (djm) this.f13346e.get();
        dhv dhvVar = (dhv) this.f13347f.get();
        kpb kpbVar = (kpb) this.f13348g.get();
        bko bkoVar = (bko) obj;
        kbzVar.mo13961e("Gcam#provide");
        if (!HalideRuntime.checkGcamHalideRuntime()) {
            ((nbe) ((nbe) ecd.f13339a.m17251b()).mo17276G((char) 1273)).mo17290o("HalideRuntime.checkGcamHalideRuntime -> Failed");
        }
        StaticMetadataVector staticMetadataVector = new StaticMetadataVector();
        kmq[] kmqVarArr = {kmq.BACK, kmq.f36557a};
        int i = 0;
        for (int i2 = 2; i < i2; i2 = 2) {
            List<kmg> listMo13861h = kmeVar.mo13861h(kmqVarArr[i]);
            ArrayList arrayList = new ArrayList();
            for (kmg kmgVar : listMo13861h) {
                if (kmgVar != null && kmgVar.f36540a != null) {
                    kmd kmdVarMo13854a = kmeVar.mo13854a(kmgVar);
                    if (ecd.m7109c(kmdVarMo13854a)) {
                        StaticMetadata staticMetadataM17672t = nta.m17672t(kmdVarMo13854a);
                        ecd.m7110d(packageInfo, staticMetadataM17672t);
                        staticMetadataVector.m5125a(staticMetadataM17672t);
                    }
                    for (kmg kmgVar2 : ((kmc) kmdVarMo13854a).f36526b) {
                        if (!listMo13861h.contains(kmgVar2) && !arrayList.contains(kmgVar2)) {
                            arrayList.add(kmgVar2);
                        }
                    }
                }
            }
            int size = arrayList.size();
            int i3 = 0;
            while (i3 < size) {
                kmd kmdVarMo13854a2 = kmeVar.mo13854a((kmg) arrayList.get(i3));
                if (ecd.m7109c(kmdVarMo13854a2)) {
                    StaticMetadata staticMetadataM17672t2 = nta.m17672t(kmdVarMo13854a2);
                    ecd.m7110d(packageInfo, staticMetadataM17672t2);
                    staticMetadataVector.m5125a(staticMetadataM17672t2);
                    nse nseVarM5121d = staticMetadataM17672t2.m5121d();
                    if (nseVarM5121d != nse.f44366e && nseVarM5121d == nse.f44369h) {
                        if (kpbVar.m14668h() || kpbVar.m14669i() || kpbVar.m14662b() || kpbVar.m14670j() || kpbVar.f36781n || kpbVar.f36782o) {
                            StaticMetadata staticMetadata = new StaticMetadata(GcamModuleJNI.new_StaticMetadata__SWIG_1(StaticMetadata.m5118a(staticMetadataM17672t2), staticMetadataM17672t2), true);
                            GcamModuleJNI.ApplySensorBinning__SWIG_1(2, StaticMetadata.m5118a(staticMetadata), staticMetadata);
                            int iIntValue = ((Integer) dhvVar.mo6173a(dio.f11662d).get()).intValue();
                            int iIntValue2 = ((Integer) dhvVar.mo6173a(dio.f11661c).get()).intValue();
                            nse nseVar = nse.f44367f;
                            if (dhvVar.mo6184l(dib.f11273ag)) {
                                nseVar = nse.f44370i;
                            }
                            staticMetadata.m5120c().m5070h(iIntValue);
                            staticMetadata.m5123f(iIntValue2);
                            staticMetadata.m5124g(nseVar);
                            staticMetadataVector.m5125a(staticMetadata);
                        }
                    }
                }
                i3++;
                packageInfo = packageInfo;
                size = size;
                kmeVar = kmeVar;
            }
            i++;
        }
        Object obj2 = bkoVar.f3652a;
        FloatArray2 floatArray2 = new FloatArray2();
        floatArray2.m4940b(0, ecd.m7107a(staticMetadataVector, nrp.f44268b));
        floatArray2.m4940b(1, ecd.m7107a(staticMetadataVector, nrp.f44269c));
        InitParams initParams = (InitParams) obj2;
        GcamModuleJNI.InitParams_reference_focal_length_35mm_set(initParams.f8291a, initParams, floatArray2.f8253a, floatArray2);
        GcamModuleJNI.InitParams_portrait_brightening_enabled_set(initParams.f8291a, initParams, dhvVar.mo6184l(did.f11442au));
        if (initParams.m4995a() == nri.f44215c) {
            djmVar.m6231e();
        }
        if (dhvVar.mo6184l(did.f11443av)) {
            GcamModuleJNI.InitParams_finish_pecan_enabled_set(initParams.f8291a, initParams, true);
        }
        dhvVar.mo6177e();
        long jGcam_Create = GcamModuleJNI.Gcam_Create(initParams.f8291a, initParams, staticMetadataVector.f8366a, staticMetadataVector);
        Gcam gcam = jGcam_Create == 0 ? null : new Gcam(jGcam_Create);
        if (!kpbVar.f36776i) {
            lku.m15669w(gcam.m4977g());
        }
        kbzVar.mo13962f();
        gcam.getClass();
        return gcam;
    }
}
