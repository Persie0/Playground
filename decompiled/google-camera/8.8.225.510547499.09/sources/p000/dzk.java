package p000;

import com.google.android.apps.camera.bottombar.C0100R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public enum dzk {
    NONE(ivq.BADGE, C0100R.string.photo_name, C0100R.string.photo_description, C0100R.drawable.quantum_gm_ic_camera_alt_white_24),
    PANORAMA(ivq.BADGE, C0100R.string.panorama_name, C0100R.string.panorama_description, C0100R.drawable.quantum_gm_ic_vrpano_white_24),
    PHOTOSPHERE(ivq.BADGE, C0100R.string.photosphere_name, C0100R.string.photosphere_description, C0100R.drawable.quantum_ic_photosphere_white_24),
    BURSTS(ivq.BADGE, C0100R.string.burst_name, C0100R.string.burst_description, C0100R.drawable.quantum_gm_ic_burst_mode_white_24),
    PORTRAIT(ivq.BADGE, C0100R.string.portrait_name, C0100R.string.portrait_description, C0100R.drawable.quantum_gm_ic_portrait_white_24),
    NIGHT(ivq.BADGE, C0100R.string.cuttlefish_name, C0100R.string.cuttlefish_description, C0100R.drawable.ic_cuttlefish),
    TIMELAPSE(ivq.BADGE, C0100R.string.mode_timelapse, C0100R.string.cheetah_description, C0100R.drawable.quantum_gm_ic_fast_forward_vd_theme_24),
    MOTION_BLUR(ivq.BADGE, C0100R.string.motion_blur, C0100R.string.motion_blur_description, C0100R.drawable.ic_motion_mode_white),
    CINEMATIC(ivq.BADGE, C0100R.string.cinematic_movements_name, C0100R.string.cinematic_movements_description, C0100R.drawable.quantum_gm_ic_stabilization_pan_vd_theme_24),
    DEBLUR_FUSION(ivq.BADGE, C0100R.string.deblur_fusion, C0100R.string.deblur_fusion_description, C0100R.drawable.ic_face_deblur_24dp),
    SWISS_DOGFOOD(ivq.BADGE, C0100R.string.dogfood_name, C0100R.string.dogfood_description, C0100R.drawable.quantum_gm_ic_dogfood_vd_theme_24),
    f12983l(ivq.BADGE, C0100R.string.amber_name, C0100R.string.amber_description, C0100R.drawable.ic_film_24),
    AMETHYST(ivq.BADGE, C0100R.string.amethyst_name, C0100R.string.amethyst_description, C0100R.drawable.ic_hdr),
    DOGFOOD_ONLY(ivq.BADGE, C0100R.string.dogfood_name, C0100R.string.dogfood_description, C0100R.drawable.quantum_gm_ic_dogfood_vd_theme_24);


    /* JADX INFO: renamed from: o */
    public final ivq f12987o;

    /* JADX INFO: renamed from: p */
    public final int f12988p;

    /* JADX INFO: renamed from: q */
    public final int f12989q;

    /* JADX INFO: renamed from: r */
    public final int f12990r;

    dzk(ivq ivqVar, int i, int i2, int i3) {
        this.f12987o = ivqVar;
        this.f12988p = i;
        this.f12989q = i2;
        this.f12990r = i3;
        m6968f(i2, "description");
        m6968f(i3, "icon");
        m6968f(i, "name");
        if (ivqVar.equals(ivq.BADGE)) {
            m6967e(true, "Action activity must be null");
            m6967e(true, "Action description must be null");
            m6967e(true, "Action promotion message must be null");
        } else {
            m6967e(false, "Action activity cannot be null");
            m6967e(false, "Action description cannot be null");
            m6967e(false, "Action promotion message cannot be null");
        }
    }

    /* JADX INFO: renamed from: b */
    public static mrm m6965b(String str) {
        if (mro.m16832b(str)) {
            return mqu.f41450a;
        }
        try {
            return mrm.m16828h(m6964a(str));
        } catch (IllegalArgumentException e) {
            String[] strArrSplit = str.split("-");
            if (strArrSplit.length != 2 || !strArrSplit[0].equals("com.google.android.apps.camera.gallery.specialtype.SpecialType")) {
                return mqu.f41450a;
            }
            try {
                return mrm.m16828h(m6964a(strArrSplit[1]));
            } catch (IllegalArgumentException | NullPointerException e2) {
                return mqu.f41450a;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static mrm m6966c(gyw gywVar) {
        dzk dzkVar;
        gyw gywVar2 = gyw.UNKNOWN;
        switch (gywVar.ordinal()) {
            case 4:
                dzkVar = BURSTS;
                break;
            case 5:
                dzkVar = PANORAMA;
                break;
            case 6:
                dzkVar = PHOTOSPHERE;
                break;
            case 7:
            case 8:
            case 9:
            case 11:
            case 14:
            case 15:
            case 18:
            default:
                dzkVar = null;
                break;
            case 10:
                dzkVar = PORTRAIT;
                break;
            case 12:
                dzkVar = NIGHT;
                break;
            case 13:
                dzkVar = TIMELAPSE;
                break;
            case 16:
                dzkVar = MOTION_BLUR;
                break;
            case 17:
                dzkVar = CINEMATIC;
                break;
            case 19:
                dzkVar = f12983l;
                break;
            case 20:
                dzkVar = AMETHYST;
                break;
        }
        return mrm.m16828h(dzkVar);
    }

    /* JADX INFO: renamed from: e */
    private static void m6967e(boolean z, String str) {
        if (!z) {
            throw new IllegalArgumentException(str);
        }
    }

    /* JADX INFO: renamed from: f */
    private static void m6968f(int i, String str) {
        m6967e(i != 0, str.concat(" must be a valid resource id"));
    }

    /* JADX INFO: renamed from: d */
    public final String m6969d() {
        return "com.google.android.apps.camera.gallery.specialtype.SpecialType-".concat(String.valueOf(name()));
    }
}
