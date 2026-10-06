package p000;

import com.google.android.apps.camera.bottombar.C0100R;
import java.util.Map;
import java.util.function.BiConsumer;
import p021j$.util.function.BiConsumer$CC;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class dan implements BiConsumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f10285a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f10286b;

    public /* synthetic */ dan(dhv dhvVar, int i) {
        this.f10286b = i;
        this.f10285a = dhvVar;
    }

    public /* synthetic */ dan(hrw hrwVar, int i) {
        this.f10286b = i;
        this.f10285a = hrwVar;
    }

    public /* synthetic */ dan(Map map, int i) {
        this.f10286b = i;
        this.f10285a = map;
    }

    public /* synthetic */ dan(jww jwwVar, int i) {
        this.f10286b = i;
        this.f10285a = jwwVar;
    }

    public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        switch (this.f10286b) {
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
        }
        return BiConsumer$CC.$default$andThen(this, biConsumer);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, jww] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, jww] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, jww] */
    /* JADX WARN: Type inference failed for: r0v6, types: [dhv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, java.util.Map] */
    @Override // java.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        switch (this.f10286b) {
            case 0:
                ((gfa) obj).mo9135v(((Boolean) obj2).booleanValue() && gfc.VIDEO_FLASH_ON.equals(this.f10285a.mo3831be()), C0100R.drawable.quantum_gm_ic_flash_on_white_24, C0100R.string.flash_on_desc, "VideoFlash");
                break;
            case 1:
                ((gfa) obj).mo9135v(((Boolean) obj2).booleanValue() && gfc.VIDEO_FLASH_ON.equals(this.f10285a.mo3831be()), C0100R.drawable.quantum_gm_ic_flash_on_white_24, C0100R.string.flash_on_desc, "VideoFlash");
                break;
            case 2:
                ?? r0 = this.f10285a;
                gfa gfaVar = (gfa) obj;
                nbh nbhVar = gfy.f24631a;
                ikw ikwVarMo9115b = gfaVar.mo9115b();
                ikw ikwVar = ikw.UNINITIALIZED;
                switch (ikwVarMo9115b.ordinal()) {
                    case 2:
                    case 5:
                    case 8:
                    case 13:
                    case 19:
                        jxp jxpVar = (jxp) r0.mo3831be();
                        if (jxpVar == jxp.RES_720P || jxpVar == jxp.RES_720P_3X4) {
                            gfaVar.mo9135v(true, C0100R.drawable.gs_hd_vd_theme_24, C0100R.string.video_res_hd_desc, "VideoResolution");
                            gfaVar.mo9135v(false, C0100R.drawable.ic_fhd_24px, C0100R.string.video_res_fhd_desc, "VideoResolution");
                            gfaVar.mo9135v(false, C0100R.drawable.ic_4k_24px, C0100R.string.video_res_4k_desc, "VideoResolution");
                        } else if (((jxp) r0.mo3831be()).m13662c()) {
                            gfaVar.mo9135v(false, C0100R.drawable.gs_hd_vd_theme_24, C0100R.string.video_res_hd_desc, "VideoResolution");
                            gfaVar.mo9135v(true, C0100R.drawable.ic_fhd_24px, C0100R.string.video_res_fhd_desc, "VideoResolution");
                            gfaVar.mo9135v(false, C0100R.drawable.ic_4k_24px, C0100R.string.video_res_4k_desc, "VideoResolution");
                        } else if (!((jxp) r0.mo3831be()).m13663d()) {
                            gfaVar.mo9135v(false, C0100R.drawable.gs_hd_vd_theme_24, C0100R.string.video_res_hd_desc, "VideoResolution");
                            gfaVar.mo9135v(false, C0100R.drawable.ic_fhd_24px, C0100R.string.video_res_fhd_desc, "VideoResolution");
                            gfaVar.mo9135v(false, C0100R.drawable.ic_4k_24px, C0100R.string.video_res_4k_desc, "VideoResolution");
                        } else {
                            gfaVar.mo9135v(false, C0100R.drawable.gs_hd_vd_theme_24, C0100R.string.video_res_hd_desc, "VideoResolution");
                            gfaVar.mo9135v(false, C0100R.drawable.ic_fhd_24px, C0100R.string.video_res_fhd_desc, "VideoResolution");
                            gfaVar.mo9135v(true, C0100R.drawable.ic_4k_24px, C0100R.string.video_res_4k_desc, "VideoResolution");
                        }
                        break;
                    default:
                        gfaVar.mo9135v(false, C0100R.drawable.gs_hd_vd_theme_24, C0100R.string.video_res_hd_desc, "VideoResolution");
                        gfaVar.mo9135v(false, C0100R.drawable.ic_fhd_24px, C0100R.string.video_res_fhd_desc, "VideoResolution");
                        gfaVar.mo9135v(false, C0100R.drawable.ic_4k_24px, C0100R.string.video_res_4k_desc, "VideoResolution");
                        break;
                }
                break;
            case 3:
                ?? r1 = this.f10285a;
                nbh nbhVar2 = gfy.f24631a;
                dhx dhxVar = dib.f11240a;
                r1.mo6177e();
                ((gfa) obj).mo9134u(false, gfx.RAW_CAPTURE_ENABLED);
                break;
            case 4:
                this.f10285a.put((gnf) obj, (kgi) ((oju) obj2).get());
                break;
            case 5:
                this.f10285a.put((gnf) obj, (kgi) ((oju) obj2).get());
                break;
            default:
                Object obj3 = this.f10285a;
                hrv hrvVar = (hrv) obj2;
                if (((hrw) obj) != obj3) {
                    hrvVar.mo3449c((hrw) obj3);
                }
                break;
        }
    }
}
