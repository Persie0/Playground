package p000;

import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import com.google.googlex.gcam.BurstSpec;
import java.util.AbstractMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class gmz {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Map.Entry m9533a(Object obj, Object obj2) {
        obj.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    /* JADX INFO: renamed from: b */
    public static Set m9534b(fxi fxiVar) {
        return mxk.m17134F(fxiVar.f23797a);
    }

    /* JADX INFO: renamed from: c */
    public static void m9535c(kfk kfkVar, Set set) {
        mxi mxiVarM17132D = mxk.m17132D();
        kew kewVarMo14115b = kfkVar.mo14115b();
        Iterator it = set.iterator();
        boolean z = false;
        while (it.hasNext()) {
            kfy kfyVar = (kfy) it.next();
            CaptureRequest.Key key = kfyVar.f35858a;
            if (!key.equals(CaptureRequest.CONTROL_AF_REGIONS) && !key.equals(CaptureRequest.CONTROL_AE_REGIONS) && !key.equals(CaptureRequest.CONTROL_AWB_REGIONS) && !key.equals(CaptureRequest.CONTROL_AF_TRIGGER) && !key.equals(CaptureRequest.CONTROL_AE_LOCK) && !key.equals(CaptureRequest.CONTROL_AWB_LOCK)) {
                Object obj = kfyVar.f35859b;
                CaptureRequest.Key key2 = kfyVar.f35858a;
                if (key2.equals(CaptureRequest.CONTROL_AE_MODE)) {
                    ((kgo) kewVarMo14115b).f35934e = (Integer) obj;
                } else if (key2.equals(CaptureRequest.CONTROL_AF_MODE)) {
                    ((kgo) kewVarMo14115b).f35933d = (Integer) obj;
                } else if (key2.equals(CaptureRequest.CONTROL_AWB_MODE)) {
                    ((kgo) kewVarMo14115b).f35935f = (Integer) obj;
                } else if (key2.equals(CaptureRequest.CONTROL_MODE)) {
                    ((kgo) kewVarMo14115b).f35932c = (Integer) obj;
                } else if (key2.equals(CaptureRequest.FLASH_MODE)) {
                    ((kgo) kewVarMo14115b).f35936g = (Integer) obj;
                } else {
                    mxiVarM17132D.mo17072d(kfyVar);
                }
                z = true;
            }
        }
        if (z) {
            kfkVar.mo14128o(kewVarMo14115b.mo14090a());
        }
        mxk mxkVarMo17127f = mxiVarM17132D.mo17127f();
        if (mxkVarMo17127f.isEmpty()) {
            return;
        }
        kfkVar.mo14123j(mxkVarMo17127f);
    }

    /* JADX INFO: renamed from: d */
    public static mrm m9536d(kfk kfkVar, Set set, mrm mrmVar, mrm mrmVar2, mrm mrmVar3, Set set2) {
        if (set.isEmpty()) {
            return mqu.f41450a;
        }
        mxi mxiVar = new mxi();
        mxiVar.m17129h(set);
        if (mrmVar.mo16813g()) {
            mxiVar.mo17072d((kgg) mrmVar.mo16809c());
        }
        if (mrmVar3.mo16813g()) {
            mxiVar.mo17072d((kgg) mrmVar3.mo16809c());
        }
        mxi mxiVar2 = new mxi();
        mxiVar2.m17129h(set2);
        if (mrmVar2.mo16813g()) {
            mxiVar.mo17072d((kgg) mrmVar2.mo16809c());
            if (ivs.f32322b != null) {
                mxiVar2.mo17072d(kgq.m14215e(ivs.f32322b, (byte) 1));
            }
        }
        return mrm.m16829i(kfkVar.mo14135v(mxiVar.mo17127f(), mxiVar2.mo17127f()));
    }

    /* JADX INFO: renamed from: e */
    public static void m9537e(ikw ikwVar, dhv dhvVar) {
        if (ikwVar == ikw.PHOTO) {
            dhx dhxVar = diw.f11719a;
            dhvVar.mo6179g();
        }
    }

    /* JADX INFO: renamed from: f */
    public static final long m9538f(mrm mrmVar, int i, float f, boolean z) {
        if (!mrmVar.mo16813g() || i <= 0) {
            return 0L;
        }
        return Math.round(((BurstSpec) mrmVar.mo16809c()).m4910a(f, z));
    }

    /* JADX INFO: renamed from: g */
    public static final long m9539g(kmd kmdVar, BurstSpec burstSpec, mrm mrmVar, int i, int i2, boolean z, kpp kppVar) {
        float millis = TimeUnit.NANOSECONDS.toMillis(nta.m17663c(kmdVar));
        long jM9538f = m9538f(mrmVar, i2, millis, z);
        if (i > 0) {
            jM9538f += (long) Math.round(burstSpec.m4910a(millis, z));
        }
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        Long l = (Long) kppVar.mo9517d(CaptureResult.SENSOR_FRAME_DURATION);
        l.getClass();
        timeUnit.toMillis(l.longValue());
        return jM9538f;
    }

    /* JADX INFO: renamed from: h */
    public static int m9540h(int i) {
        return i - 1;
    }

    /* JADX INFO: renamed from: i */
    public static Object m9541i() {
        return new Object();
    }

    /* JADX INFO: renamed from: j */
    public static void m9542j(dhv dhvVar, kfj kfjVar) {
        if (ivt.f32353g == null || !((Boolean) dhvVar.mo6173a(did.f11416a).map(cqk.f8931r).orElse(false)).booleanValue()) {
            return;
        }
        kfjVar.mo14112d(ivt.f32353g, 2);
    }
}
