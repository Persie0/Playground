package p000;

import com.google.android.apps.camera.stats.ViewfinderJankSession;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gbz implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f24152a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f24153b;

    public gbz(oju ojuVar, int i) {
        this.f24153b = i;
        this.f24152a = ojuVar;
    }

    /* JADX INFO: renamed from: a */
    public static gbz m9028a(oju ojuVar) {
        return new gbz(ojuVar, 2);
    }

    /* JADX INFO: renamed from: b */
    public static gbz m9029b(oju ojuVar) {
        return new gbz(ojuVar, 3);
    }

    /* JADX INFO: renamed from: c */
    public static gbz m9030c(oju ojuVar) {
        return new gbz(ojuVar, 4);
    }

    /* JADX INFO: renamed from: d */
    public static gbz m9031d(oju ojuVar) {
        return new gbz(ojuVar, 5);
    }

    /* JADX INFO: renamed from: e */
    public static gbz m9032e(oju ojuVar) {
        return new gbz(ojuVar, 6);
    }

    /* JADX INFO: renamed from: f */
    public static gbz m9033f(oju ojuVar) {
        return new gbz(ojuVar, 7);
    }

    /* JADX INFO: renamed from: g */
    public static gbz m9034g(oju ojuVar) {
        return new gbz(ojuVar, 8);
    }

    /* JADX INFO: renamed from: h */
    public static gbz m9035h(oju ojuVar) {
        return new gbz(ojuVar, 12);
    }

    /* JADX INFO: renamed from: i */
    public static gbz m9036i(oju ojuVar) {
        return new gbz(ojuVar, 13);
    }

    /* JADX INFO: renamed from: j */
    public static gbz m9037j(oju ojuVar) {
        return new gbz(ojuVar, 14);
    }

    /* JADX INFO: renamed from: k */
    public static gbz m9038k(oju ojuVar) {
        return new gbz(ojuVar, 15);
    }

    /* JADX INFO: renamed from: l */
    public static gbz m9039l(oju ojuVar) {
        return new gbz(ojuVar, 16);
    }

    /* JADX INFO: renamed from: m */
    public static gbz m9040m(oju ojuVar) {
        return new gbz(ojuVar, 17);
    }

    /* JADX INFO: renamed from: n */
    public static gbz m9041n(oju ojuVar) {
        return new gbz(ojuVar, 18);
    }

    /* JADX INFO: renamed from: o */
    public static gbz m9042o(oju ojuVar) {
        return new gbz(ojuVar, 19);
    }

    /* JADX INFO: renamed from: p */
    public static gbz m9043p(oju ojuVar) {
        return new gbz(ojuVar, 20);
    }

    @Override // p000.oju
    public final /* synthetic */ Object get() {
        Object objM17136H;
        long j = 0;
        switch (this.f24153b) {
            case 0:
                mrm mrmVar = (mrm) this.f24152a.get();
                Object objM17136H2 = mrmVar.mo16813g() ? mxk.m17136H((ech) mrmVar.mo16809c()) : mzx.f41874a;
                objM17136H2.getClass();
                return objM17136H2;
            case 1:
                return mrm.m16829i((gnm) this.f24152a.get());
            case 2:
                mrm mrmVar2 = (mrm) this.f24152a.get();
                lku.m15669w(mrmVar2.mo16813g());
                return (kgg) mrmVar2.mo16809c();
            case 3:
                return mrm.m16828h((kgg) ((Map) this.f24152a.get()).get(gnf.DEPTH));
            case 4:
                return mrm.m16828h((kgg) ((Map) this.f24152a.get()).get(gnf.PD));
            case 5:
                Map map = (Map) this.f24152a.get();
                EnumMap enumMap = new EnumMap(gnf.class);
                naz nazVarListIterator = gnf.f25715q.listIterator();
                while (nazVarListIterator.hasNext()) {
                    gnf gnfVar = (gnf) nazVarListIterator.next();
                    kgg kggVar = (kgg) map.get(gnfVar);
                    if (kggVar != null) {
                        enumMap.put(gnfVar, kggVar);
                    }
                }
                return enumMap;
            case 6:
                return mrm.m16828h((kgg) ((Map) this.f24152a.get()).get(gnf.RAW_HDRPLUS));
            case 7:
                return mrm.m16828h((kgg) ((Map) this.f24152a.get()).get(gnf.YUV_ANALYSIS));
            case 8:
                return mrm.m16828h((kgg) ((Map) this.f24152a.get()).get(gnf.YUV_LARGE));
            case 9:
                return mrm.m16828h((kgg) ((Map) this.f24152a.get()).get(gnf.YUV_TELE_ZOOM));
            case 10:
                return mrm.m16828h((kgg) ((Map) this.f24152a.get()).get(gnf.YUV_TELE_ZOOM_RM));
            case 11:
                return mrm.m16829i(((gjx) this.f24152a).get());
            case 12:
                return new gdp(((ohm) this.f24152a).get());
            case 13:
                return new gdr((ViewfinderJankSession) this.f24152a.get());
            case 14:
                return new gds((ViewfinderJankSession) this.f24152a.get());
            case 15:
                dhv dhvVar = (dhv) this.f24152a.get();
                if (dhvVar.mo6184l(dib.f11286at)) {
                    dhvVar.mo6184l(dij.f11602z);
                }
                dhvVar.mo6184l(dij.f11571U);
                dhvVar.mo6177e();
                return 0L;
            case 16:
                dhv dhvVar2 = (dhv) this.f24152a.get();
                if (dhvVar2.mo6184l(dib.f11286at)) {
                    j = (true == dhvVar2.mo6184l(dii.f11545u) ? 65536L : 0L) | 259;
                }
                return Long.valueOf(j);
            case 17:
                return new kgb(1, new ArrayList((Set) this.f24152a.get()));
            case 18:
                mrm mrmVarM5442a = ((crv) this.f24152a).m5442a();
                Object objM17136H3 = mrmVarM5442a.mo16813g() ? mxk.m17136H((fxi) mrmVarM5442a.mo16809c()) : mzx.f41874a;
                objM17136H3.getClass();
                return objM17136H3;
            case 19:
                kmd kmdVar = ((fxk) this.f24152a).get();
                if (ivw.f32423i == null || !kmdVar.mo14558k().equals(kmq.f36557a)) {
                    objM17136H = mzx.f41874a;
                } else {
                    ArrayList arrayList = new ArrayList();
                    Float fValueOf = Float.valueOf(-1.0f);
                    arrayList.add(fValueOf);
                    arrayList.add(fValueOf);
                    arrayList.add(fValueOf);
                    arrayList.add(Float.valueOf(12.0f));
                    arrayList.add(Float.valueOf(25.0f));
                    arrayList.add(fValueOf);
                    objM17136H = mxk.m17136H(fxo.m8927a(kgq.m14215e(ivw.f32423i, kxk.m14990ah(arrayList))));
                }
                objM17136H.getClass();
                return objM17136H;
            default:
                Object objM17136H4 = ((cde) this.f24152a).m3490a().booleanValue() ? mxk.m17136H(fxo.m8927a(kgq.m14215e(ivv.f32400i, true))) : mzx.f41874a;
                objM17136H4.getClass();
                return objM17136H4;
        }
    }
}
