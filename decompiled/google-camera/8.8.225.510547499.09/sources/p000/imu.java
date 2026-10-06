package p000;

import android.hardware.camera2.CameraCharacteristics;
import android.util.Pair;
import android.util.SizeF;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class imu {

    /* JADX INFO: renamed from: b */
    private final kme f31550b;

    /* JADX INFO: renamed from: c */
    private final Set f31551c;

    /* JADX INFO: renamed from: d */
    private final kmd f31552d;

    /* JADX INFO: renamed from: e */
    private final boolean f31553e;

    /* JADX INFO: renamed from: f */
    private final Map f31554f = new EnumMap(imt.class);

    /* JADX INFO: renamed from: a */
    public int f31549a = 0;

    public imu(kme kmeVar, kmd kmdVar, dhv dhvVar) {
        boolean z = false;
        this.f31550b = kmeVar;
        this.f31552d = kmdVar;
        this.f31551c = kmdVar.mo14533B();
        if (dhvVar.mo6184l(dib.f11273ag) && kmdVar.mo14544M() && kmdVar.mo14535D()) {
            z = true;
        }
        this.f31553e = z;
    }

    /* JADX INFO: renamed from: l */
    private final synchronized kmd m11481l(imt imtVar) {
        kmd kmdVarM11482m = m11482m(imtVar);
        if (kmdVarM11482m != null && this.f31551c.size() != 1) {
            return kmdVarM11482m;
        }
        return this.f31552d;
    }

    /* JADX INFO: renamed from: m */
    private final synchronized kmd m11482m(imt imtVar) {
        m11483n();
        if (this.f31554f.get(imtVar) == null) {
            return null;
        }
        return this.f31550b.mo13854a((kmg) this.f31554f.get(imtVar));
    }

    /* JADX INFO: renamed from: n */
    private final synchronized void m11483n() {
        int length;
        if (this.f31554f.get(imt.NARROWEST) == null || this.f31554f.get(imt.WIDEST) == null) {
            Map map = new HashMap();
            Map map2 = new HashMap();
            Map map3 = new HashMap();
            Iterator it = this.f31551c.iterator();
            float f = Float.MAX_VALUE;
            float f2 = Float.MIN_VALUE;
            while (it.hasNext()) {
                kmg kmgVar = (kmg) it.next();
                kmd kmdVarMo13854a = this.f31550b.mo13854a(kmgVar);
                float[] fArr = (float[]) kmdVarMo13854a.mo14559l(CameraCharacteristics.LENS_INFO_AVAILABLE_FOCAL_LENGTHS);
                SizeF sizeF = (SizeF) kmdVarMo13854a.mo14559l(CameraCharacteristics.SENSOR_INFO_PHYSICAL_SIZE);
                if (sizeF == null || fArr == null || (length = fArr.length) <= 0) {
                    it = it;
                } else {
                    float f3 = f;
                    float f4 = f2;
                    int i = 0;
                    while (i < length) {
                        float f5 = fArr[i];
                        Pair pairCreate = Pair.create(Float.valueOf(f5), Float.valueOf(sizeF.getWidth() / f5));
                        Iterator it2 = it;
                        int i2 = i;
                        m11485p(kmgVar, pairCreate, map, map2, map3);
                        if (map2.containsValue(kmgVar)) {
                            if (f5 >= f4) {
                                this.f31554f.put(imt.NARROWEST, kmgVar);
                                f4 = f5;
                            }
                            if (f5 <= f3) {
                                this.f31554f.put(imt.WIDEST, kmgVar);
                                f3 = f5;
                            }
                        }
                        map.put(kmgVar, pairCreate);
                        i = i2 + 1;
                        it = it2;
                    }
                    f = f3;
                    f2 = f4;
                }
            }
            int size = map2.size();
            this.f31549a = size;
            float fFloatValue = 0.0f;
            if (size == 3) {
                for (Float f6 : map2.keySet()) {
                    if (f6.floatValue() > f && f6.floatValue() < f2) {
                        this.f31554f.put(imt.MIDDLE, (kmg) map2.get(f6));
                        fFloatValue = f6.floatValue();
                        break;
                    }
                }
            }
            m11484o(imt.NARROWEST, imt.f31545d, f2, map3);
            m11484o(imt.MIDDLE, imt.MIDDLE_RM, fFloatValue, map3);
            m11484o(imt.WIDEST, imt.WIDEST_RM, f, map3);
        }
    }

    /* JADX INFO: renamed from: o */
    private final synchronized void m11484o(imt imtVar, imt imtVar2, float f, Map map) {
        kmg kmgVar;
        if (((kmg) this.f31554f.get(imtVar)) != null && (kmgVar = (kmg) map.get(Float.valueOf(f))) != null) {
            this.f31554f.put(imtVar2, kmgVar);
        }
    }

    /* JADX INFO: renamed from: p */
    private final synchronized void m11485p(kmg kmgVar, Pair pair, Map map, Map map2, Map map3) {
        Pair pair2;
        float fFloatValue = ((Float) pair.first).floatValue();
        Float fValueOf = Float.valueOf(fFloatValue);
        kmg kmgVar2 = (kmg) map2.get(fValueOf);
        if (kmgVar2 == null || (pair2 = (Pair) map.get(kmgVar2)) == null || fFloatValue != ((Float) pair2.first).floatValue()) {
            map2.put(fValueOf, kmgVar);
        } else if (((Float) pair.second).floatValue() <= ((Float) pair2.second).floatValue()) {
            map3.put(fValueOf, kmgVar);
        } else {
            map2.put(fValueOf, kmgVar);
            map3.put(fValueOf, kmgVar2);
        }
    }

    /* JADX INFO: renamed from: b */
    public final synchronized kmd m11487b() {
        return m11482m(imt.MIDDLE);
    }

    /* JADX INFO: renamed from: c */
    public final synchronized kmd m11488c() {
        return m11482m(imt.MIDDLE_RM);
    }

    /* JADX INFO: renamed from: d */
    public final synchronized kmd m11489d() {
        return m11481l(imt.NARROWEST);
    }

    /* JADX INFO: renamed from: e */
    public final synchronized kmd m11490e() {
        return m11482m(imt.f31545d);
    }

    /* JADX INFO: renamed from: f */
    public final synchronized kmd m11491f() {
        if (!this.f31553e) {
            return m11493h();
        }
        kmd kmdVarM11487b = m11487b();
        if (kmdVarM11487b != null) {
            return kmdVarM11487b;
        }
        return m11489d();
    }

    /* JADX INFO: renamed from: g */
    public final synchronized kmd m11492g() {
        if (!this.f31553e) {
            return m11494i();
        }
        kmd kmdVarM11488c = m11488c();
        if (kmdVarM11488c != null) {
            return kmdVarM11488c;
        }
        return m11490e();
    }

    /* JADX INFO: renamed from: h */
    public final synchronized kmd m11493h() {
        return m11481l(imt.WIDEST);
    }

    /* JADX INFO: renamed from: i */
    public final synchronized kmd m11494i() {
        return m11482m(imt.WIDEST_RM);
    }

    /* JADX INFO: renamed from: j */
    public final synchronized List m11495j() {
        return mws.m17095j(this.f31551c);
    }

    /* JADX INFO: renamed from: k */
    public final synchronized boolean m11496k(String str) {
        m11483n();
        return this.f31554f.get(imt.WIDEST) != null && str.equals(((kmg) this.f31554f.get(imt.WIDEST)).f36540a);
    }

    /* JADX INFO: renamed from: a */
    public final kmd m11486a(String str) {
        kmg kmgVar = null;
        if (str != null) {
            for (kmg kmgVar2 : this.f31551c) {
                if (str.equals(kmgVar2.f36540a)) {
                    kmgVar = kmgVar2;
                    break;
                }
            }
        }
        return kmgVar == null ? this.f31552d : this.f31550b.mo13854a(kmgVar);
    }
}
