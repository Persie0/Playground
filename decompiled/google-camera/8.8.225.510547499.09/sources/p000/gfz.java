package p000;

import android.hardware.camera2.CaptureRequest;
import androidx.wear.ambient.AmbientDelegate;
import androidx.wear.widget.iZcI.hiCTUJiAxf;
import com.google.android.apps.camera.bottombar.C0100R;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gfz implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f24633a;

    /* JADX INFO: renamed from: b */
    private final oju f24634b;

    /* JADX INFO: renamed from: c */
    private final /* synthetic */ int f24635c;

    public gfz(oju ojuVar, oju ojuVar2, int i) {
        this.f24635c = i;
        this.f24633a = ojuVar;
        this.f24634b = ojuVar2;
    }

    public gfz(oju ojuVar, oju ojuVar2, int i, byte[] bArr) {
        this.f24635c = i;
        this.f24634b = ojuVar;
        this.f24633a = ojuVar2;
    }

    public gfz(oju ojuVar, oju ojuVar2, int i, char[] cArr) {
        this.f24635c = i;
        this.f24634b = ojuVar;
        this.f24633a = ojuVar2;
    }

    public gfz(oju ojuVar, oju ojuVar2, int i, float[] fArr) {
        this.f24635c = i;
        this.f24634b = ojuVar;
        this.f24633a = ojuVar2;
    }

    public gfz(oju ojuVar, oju ojuVar2, int i, int[] iArr) {
        this.f24635c = i;
        this.f24634b = ojuVar;
        this.f24633a = ojuVar2;
    }

    public gfz(oju ojuVar, oju ojuVar2, int i, short[] sArr) {
        this.f24635c = i;
        this.f24634b = ojuVar;
        this.f24633a = ojuVar2;
    }

    public gfz(oju ojuVar, oju ojuVar2, int i, boolean[] zArr) {
        this.f24635c = i;
        this.f24634b = ojuVar;
        this.f24633a = ojuVar2;
    }

    public gfz(oju ojuVar, oju ojuVar2, int i, byte[][] bArr) {
        this.f24635c = i;
        this.f24634b = ojuVar;
        this.f24633a = ojuVar2;
    }

    public gfz(oju ojuVar, oju ojuVar2, int i, char[][] cArr) {
        this.f24635c = i;
        this.f24634b = ojuVar;
        this.f24633a = ojuVar2;
    }

    /* JADX INFO: renamed from: a */
    public static gfz m9189a(oju ojuVar, oju ojuVar2) {
        return new gfz(ojuVar, ojuVar2, 5);
    }

    /* JADX INFO: renamed from: b */
    public static gfz m9190b(oju ojuVar, oju ojuVar2) {
        return new gfz(ojuVar, ojuVar2, 6);
    }

    /* JADX INFO: renamed from: c */
    public static gfz m9191c(oju ojuVar, oju ojuVar2) {
        return new gfz(ojuVar, ojuVar2, 7);
    }

    /* JADX INFO: renamed from: d */
    public static gfz m9192d(oju ojuVar, oju ojuVar2) {
        return new gfz(ojuVar, ojuVar2, 8, (char[]) null);
    }

    /* JADX INFO: renamed from: e */
    public static gfz m9193e(oju ojuVar, oju ojuVar2) {
        return new gfz(ojuVar, ojuVar2, 12, (int[]) null);
    }

    /* JADX INFO: renamed from: f */
    public static gfz m9194f(oju ojuVar, oju ojuVar2) {
        return new gfz(ojuVar, ojuVar2, 13);
    }

    /* JADX INFO: renamed from: g */
    public static gfz m9195g(oju ojuVar, oju ojuVar2) {
        return new gfz(ojuVar, ojuVar2, 14);
    }

    /* JADX INFO: renamed from: h */
    public static gfz m9196h(oju ojuVar, oju ojuVar2) {
        return new gfz(ojuVar, ojuVar2, 17);
    }

    /* JADX INFO: renamed from: i */
    public static gfz m9197i(oju ojuVar, oju ojuVar2) {
        return new gfz(ojuVar, ojuVar2, 18, (byte[][]) null);
    }

    /* JADX INFO: renamed from: j */
    public static gfz m9198j(oju ojuVar, oju ojuVar2) {
        return new gfz(ojuVar, ojuVar2, 19);
    }

    @Override // p000.oju
    public final /* synthetic */ Object get() {
        switch (this.f24635c) {
            case 0:
                geu geuVar = new geu(((hai) this.f24633a.get()).mo10030b(gzy.f27065x), (String) gzy.f27065x.m10026c((dhv) this.f24634b.get()), "torch", gfc.VIDEO_FLASH_ON, "off", gfc.VIDEO_FLASH_OFF);
                gfj gfjVarM9181o = gfk.m9181o();
                gfjVarM9181o.m9178r(gev.NIGHT_FRONT_PHOTO_FLASH);
                gfjVarM9181o.m9168h(C0100R.string.illumination_desc);
                gfjVarM9181o.m9163c(C0100R.string.illumination_options_desc);
                gfjVarM9181o.m9162b(gfc.VIDEO_FLASH_OFF, C0100R.drawable.ic_lightbulb_off, C0100R.string.illumination_off_option_desc, C0100R.string.illumination_off_desc);
                gfjVarM9181o.m9162b(gfc.VIDEO_FLASH_ON, C0100R.drawable.ic_lightbulb_on, C0100R.string.illumination_on_option_desc, C0100R.string.illumination_on_desc);
                gfjVarM9181o.f24545a = geuVar;
                gfjVarM9181o.m9179s(fjv.f22314h);
                return gfjVarM9181o.m9161a();
            case 1:
                return new geq((dhv) this.f24634b.get());
            case 2:
                dhv dhvVar = (dhv) this.f24634b.get();
                ikw ikwVarM11415a = ((ikv) this.f24633a).m11415a();
                nbh nbhVar = gfy.f24631a;
                return Boolean.valueOf(dhvVar.mo6184l(did.f11424ac) && !ikw.IMAGE_INTENT.equals(ikwVarM11415a));
            case 3:
                hai haiVar = (hai) this.f24633a.get();
                dhv dhvVar2 = (dhv) this.f24634b.get();
                gfj gfjVarM9181o2 = gfk.m9181o();
                gfjVarM9181o2.m9178r(gev.PHOTO_SPHERE);
                gfjVarM9181o2.m9168h(C0100R.string.photosphere_type);
                gfjVarM9181o2.m9163c(C0100R.string.photosphere_type_desc);
                gfjVarM9181o2.m9174n(gfc.PHOTO_SPHERE, gfc.HORIZONTAL_PHOTO_SPHERE, gfc.VERTICAL_PHOTO_SPHERE, gfc.WIDE_ANGLE_PHOTO_SPHERE, gfc.FISH_EYE_PHOTO_SPHERE);
                gfjVarM9181o2.m9170j(Integer.valueOf(C0100R.string.panorama), Integer.valueOf(C0100R.string.panorama_horizontal), Integer.valueOf(C0100R.string.panorama_vertical), Integer.valueOf(C0100R.string.panorama_wide), Integer.valueOf(C0100R.string.panorama_fish_eye));
                gfjVarM9181o2.m9165e(Integer.valueOf(C0100R.string.panorama_desc), Integer.valueOf(C0100R.string.panorama_horizontal_desc), Integer.valueOf(C0100R.string.panorama_vertical_desc), Integer.valueOf(C0100R.string.panorama_wide_desc), Integer.valueOf(C0100R.string.panorama_fish_eye_desc));
                gfjVarM9181o2.m9167g(Integer.valueOf(C0100R.drawable.quantum_ic_panorama_photosphere_white_24), Integer.valueOf(C0100R.drawable.quantum_gm_ic_panorama_horizontal_white_24), Integer.valueOf(C0100R.drawable.quantum_gm_ic_panorama_vertical_white_24), Integer.valueOf(C0100R.drawable.quantum_gm_ic_panorama_wide_angle_white_24), Integer.valueOf(C0100R.drawable.quantum_gm_ic_panorama_fish_eye_white_24));
                gfjVarM9181o2.f24545a = new geu(haiVar.mo10030b(gzy.f27035as), (String) gzy.f27035as.m10026c(dhvVar2), gfy.f24632b);
                gfjVarM9181o2.m9180t(ikw.PHOTO_SPHERE);
                return gfjVarM9181o2.m9161a();
            case 4:
                return new gga((jww) this.f24633a.get(), ((dqz) this.f24634b).m6611a());
            case 5:
                Set<kfy> set = (Set) this.f24633a.get();
                kmd kmdVar = ((fxk) this.f24634b).get();
                HashSet hashSet = new HashSet();
                Iterator it = kmdVar.mo14532A().iterator();
                while (it.hasNext()) {
                    hashSet.add(((CaptureRequest.Key) it.next()).getName());
                }
                mxi mxiVar = new mxi();
                if (!set.isEmpty()) {
                    for (kfy kfyVar : set) {
                        if (hashSet.contains(kfyVar.f35858a.getName())) {
                            mxiVar.mo17072d(kfyVar);
                        }
                    }
                }
                mxk mxkVarMo17127f = mxiVar.mo17127f();
                mxkVarMo17127f.getClass();
                return mxkVarMo17127f;
            case 6:
                kfk kfkVarMo14178a = ((kfz) this.f24633a.get()).mo14178a((kfn) this.f24634b.get());
                kfkVarMo14178a.getClass();
                return kfkVarMo14178a;
            case 7:
                dhv dhvVar3 = (dhv) this.f24633a.get();
                kpb kpbVar = (kpb) this.f24634b.get();
                mxi mxiVarM17132D = mxk.m17132D();
                if (dhvVar3.mo6183k(dib.f11244aD)) {
                    mxiVarM17132D.mo17072d(kga.ALWAYS_ALLOW_FLASH_MODE_TORCH);
                }
                if (kpbVar.m14669i()) {
                    mxiVarM17132D.mo17072d(kga.ABORT_FRAME_ON_FAILURE_BEFORE_START);
                }
                mxk mxkVarMo17127f2 = mxiVarM17132D.mo17127f();
                mxkVarMo17127f2.getClass();
                return mxkVarMo17127f2;
            case 8:
                Object objM17136H = ((cde) this.f24634b).m3490a().booleanValue() ? mxk.m17136H((ccz) this.f24633a.get()) : mzx.f41874a;
                objM17136H.getClass();
                return objM17136H;
            case 9:
                return dez.m6036f(new fro(((dqz) this.f24634b).m6611a(), (jwf) this.f24633a.get(), 13), hiCTUJiAxf.mlUU);
            case 10:
                jwn jwnVarM8932f = fxo.m8932f(CaptureRequest.LENS_FOCUS_DISTANCE, jwr.m13640j(((dqz) this.f24634b).m6611a(), new etx(((fxk) this.f24633a).get(), 14)));
                jwnVarM8932f.getClass();
                return jwnVarM8932f;
            case 11:
                kfk kfkVar = (kfk) this.f24634b.get();
                mrm mrmVar = (mrm) this.f24633a.get();
                return mrmVar.mo16813g() ? mrm.m16829i(kfkVar.mo14134u((kgg) mrmVar.mo16809c(), mzx.f41874a)) : mqu.f41450a;
            case 12:
                return gjl.m9339b((Map) this.f24634b.get(), (Map) this.f24633a.get());
            case 13:
                return new AmbientDelegate((jwn) this.f24633a.get(), (ebv) this.f24634b.get());
            case 14:
                return new gtd((imu) this.f24633a.get(), ((dqz) this.f24634b).m6611a());
            case 15:
                dhv dhvVar4 = (dhv) this.f24634b.get();
                Map map = (Map) this.f24633a.get();
                return Boolean.valueOf(dhvVar4.mo6184l(dio.f11683y) && map.containsKey(gnf.f25701c) && map.containsKey(gnf.RAW_TELE));
            case 16:
                Object objM17136H2 = ((Boolean) this.f24634b.get()).booleanValue() ? mxk.m17136H((ech) this.f24633a.get()) : mzx.f41874a;
                objM17136H2.getClass();
                return objM17136H2;
            case 17:
                return new gln((fcp) this.f24633a.get(), (Executor) this.f24634b.get());
            case 18:
                return ((mrm) this.f24633a.get()).mo16808b(new etx((kfk) this.f24634b.get(), 16));
            case 19:
                mrm mrmVar2 = (mrm) this.f24633a.get();
                if (!((dhv) this.f24634b.get()).mo6184l(did.f11424ac)) {
                    return mqu.f41450a;
                }
                lku.m15669w(mrmVar2.mo16813g());
                return mrm.m16829i((kgg) mrmVar2.mo16809c());
            default:
                kfk kfkVar2 = (kfk) this.f24634b.get();
                mrm mrmVar3 = (mrm) this.f24633a.get();
                lku.m15669w(mrmVar3.mo16813g());
                return mrm.m16829i(kfkVar2.mo14133t(mxk.m17136H((kgg) mrmVar3.mo16809c())));
        }
    }
}
