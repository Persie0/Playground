package p000;

import android.hardware.camera2.CameraCharacteristics;
import com.google.googlex.gcam.Gcam;
import com.google.googlex.gcam.GcamModuleJNI;
import com.google.googlex.gcam.Tuning;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class goy {
    /* JADX INFO: renamed from: a */
    public static final Executor m9588a() {
        return new jvi(jzn.m13824l("PortraitProc"));
    }

    /* JADX INFO: renamed from: b */
    public static final fxs m9589b() {
        return new fxs(1);
    }

    /* JADX INFO: renamed from: c */
    public static final void m9590c(dhv dhvVar) {
        dhx dhxVar = dib.f11240a;
        dhvVar.mo6177e();
        dhvVar.mo6177e();
    }

    /* JADX INFO: renamed from: d */
    public static kna m9591d(kmd kmdVar, int... iArr) {
        for (int i : iArr) {
            List listMo14571x = kmdVar.mo14571x(i);
            if (!listMo14571x.isEmpty()) {
                return new kna(i, kbd.m13914c(listMo14571x));
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public static void m9592e(Map map, oju ojuVar, oju ojuVar2, fvu fvuVar, dhv dhvVar) {
        boolean zMo6184l = dhvVar.mo6184l(dib.f11333bn);
        fvuVar.mo14544M();
        fvuVar.mo14535D();
        fvuVar.mo14560m(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES, new int[0]);
        if (((fvuVar.mo14558k() == kmq.BACK && zMo6184l) || (fvuVar.mo14558k() == kmq.f36557a && dhvVar.mo6184l(dib.f11358cl))) && fvuVar.mo14544M() && fvuVar.mo14535D()) {
            p021j$.util.Map.EL.forEach((Map) ojuVar2.get(), new dan(map, 5));
        } else {
            map.put(gnf.RAW_HDRPLUS, (kgi) ojuVar.get());
        }
    }

    /* JADX INFO: renamed from: g */
    public static float m9594g(kmg kmgVar, ecq ecqVar, Gcam gcam) {
        Tuning tuningM4973c = gcam.m4973c(ecqVar.mo7134a(kmgVar));
        return GcamModuleJNI.Tuning_sensitivity_get(tuningM4973c.f8376a, tuningM4973c);
    }

    /* JADX INFO: renamed from: h */
    public static Float m9595h(kmd kmdVar) {
        float[] fArrM17670r = nta.m17670r(kmdVar);
        float[] fArr = (float[]) kmdVar.mo14559l(CameraCharacteristics.LENS_INFO_AVAILABLE_APERTURES);
        if (fArrM17670r.length <= 0 || fArr == null || fArr.length <= 0) {
            return Float.valueOf(-1.0f);
        }
        float f = fArrM17670r[0];
        float f2 = fArr[0];
        return Float.valueOf(f / (f2 * f2));
    }

    /* JADX INFO: renamed from: i */
    public static final jay m9596i(enb enbVar, int i, int i2, float f, boolean z, String str) {
        return new jay(enbVar, i, i2, f, z, str);
    }

    /* JADX INFO: renamed from: j */
    public static kgi m9597j(djm djmVar, kmd kmdVar, fuf fufVar, ikw ikwVar, dhv dhvVar, mrm mrmVar, boolean z) {
        kna knaVar = (kmdVar.mo14558k() == kmq.BACK && ikwVar == ikw.PORTRAIT && dhvVar.mo6184l(dio.f11683y)) ? new kna(37, new kbc(((Integer) dhvVar.mo6173a(dio.f11660b).get()).intValue(), ((Integer) dhvVar.mo6173a(dio.f11661c).get()).intValue())) : m9591d(kmdVar, 37, 38, 32);
        knaVar.getClass();
        int i = fufVar.f23585b;
        gmy gmyVarM6226G = djmVar.m6226G();
        gmyVarM6226G.f25660a = kmdVar.mo14556i();
        gmyVarM6226G.f25661b = knaVar;
        gmyVarM6226G.f25662c = i;
        gmyVarM6226G.f25663d = true;
        gmyVarM6226G.f25665f = (Long) mrmVar.mo16812f();
        gmyVarM6226G.f25666g = z;
        return gmyVarM6226G.m9532a();
    }
}
