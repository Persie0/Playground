package p000;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import com.google.android.apps.camera.bottombar.C0100R;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class iku {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f31384a = 0;

    /* JADX INFO: renamed from: b */
    private static final Map f31385b;

    /* JADX INFO: renamed from: c */
    private final int f31386c;

    /* JADX INFO: renamed from: d */
    private final int f31387d;

    /* JADX INFO: renamed from: e */
    private final int f31388e;

    static {
        mwt mwtVarM17115i = mwx.m17115i();
        mwtVarM17115i.mo17110e(ikw.UNINITIALIZED, new iku(0, 0, 0));
        mwtVarM17115i.mo17110e(ikw.PHOTO, new iku(C0100R.string.mode_camera, C0100R.string.mode_camera_desc, C0100R.drawable.quantum_gm_ic_camera_alt_vd_theme_24));
        mwtVarM17115i.mo17110e(ikw.VIDEO, new iku(C0100R.string.mode_video, C0100R.string.mode_video_desc, C0100R.drawable.quantum_gm_ic_videocam_vd_theme_24));
        mwtVarM17115i.mo17110e(ikw.AMBER, new iku(C0100R.string.mode_amber, C0100R.string.mode_amber_desc, C0100R.drawable.ic_film_24));
        mwtVarM17115i.mo17110e(ikw.IMAX, new iku(C0100R.string.mode_panorama, C0100R.string.mode_panorama_desc, C0100R.drawable.quantum_gm_ic_vrpano_vd_theme_24));
        mwtVarM17115i.mo17110e(ikw.PHOTO_SPHERE, new iku(C0100R.string.mode_photosphere, C0100R.string.mode_photosphere_desc, C0100R.drawable.quantum_ic_photosphere_vd_theme_24));
        mwtVarM17115i.mo17110e(ikw.SLOW_MOTION, new iku(C0100R.string.mode_video_slomo, C0100R.string.mode_video_slomo_desc, C0100R.drawable.quantum_gm_ic_slow_motion_video_vd_theme_24));
        mwtVarM17115i.mo17110e(ikw.MOTION_BLUR, new iku(C0100R.string.mode_motion_blur, C0100R.string.mode_motion_blur_desc, C0100R.drawable.ic_motion_mode_white));
        mwtVarM17115i.mo17110e(ikw.PORTRAIT, new iku(C0100R.string.mode_portrait, C0100R.string.mode_portrait_desc, C0100R.drawable.quantum_gm_ic_portrait_vd_theme_24));
        mwtVarM17115i.mo17110e(ikw.IMAGE_INTENT, new iku(C0100R.string.mode_camera, C0100R.string.mode_camera_desc, C0100R.drawable.quantum_gm_ic_camera_alt_vd_theme_24));
        mwtVarM17115i.mo17110e(ikw.VIDEO_INTENT, new iku(C0100R.string.mode_video, C0100R.string.mode_video_desc, C0100R.drawable.quantum_gm_ic_videocam_vd_theme_24));
        mwtVarM17115i.mo17110e(ikw.ORNAMENT, new iku(C0100R.string.mode_ornament, C0100R.string.mode_ornament_desc, C0100R.drawable.ic_playground_dark_24));
        mwtVarM17115i.mo17110e(ikw.MEASURE, new iku(C0100R.string.mode_measure, C0100R.string.mode_measure_desc, C0100R.drawable.ic_measure_dark_24));
        mwtVarM17115i.mo17110e(ikw.LENS, new iku(C0100R.string.mode_lens, C0100R.string.mode_lens_desc, C0100R.drawable.quantum_ic_google_lens_new_vd_theme_24));
        mwtVarM17115i.mo17110e(ikw.TIARA, new iku(C0100R.string.mode_photobooth, C0100R.string.mode_photobooth_desc, C0100R.drawable.ic_photobooth_mode));
        mwtVarM17115i.mo17110e(ikw.LONG_EXPOSURE, new iku(C0100R.string.mode_cuttlefish, C0100R.string.mode_cuttlefish_desc, C0100R.drawable.ic_cuttlefish));
        mwtVarM17115i.mo17110e(ikw.TIME_LAPSE, new iku(C0100R.string.mode_timelapse, C0100R.string.mode_cheetah_desc, C0100R.drawable.quantum_gm_ic_fast_forward_vd_theme_24));
        mwtVarM17115i.mo17110e(ikw.SETTINGS, new iku(C0100R.string.mode_settings, C0100R.string.settings_open_desc, C0100R.drawable.quantum_gm_ic_settings_vd_theme_24));
        mwtVarM17115i.mo17110e(ikw.MORE_MODES, new iku(C0100R.string.modes, C0100R.string.more_modes_desc, C0100R.drawable.navigation_empty_icon));
        mwtVarM17115i.mo17110e(ikw.REWIND, new iku(C0100R.string.mode_rewind, C0100R.string.mode_rewind_desc, C0100R.drawable.quantum_ic_fast_rewind_vd_theme_24));
        f31385b = mwtVarM17115i.mo17059b();
    }

    public iku(int i, int i2, int i3) {
        this.f31386c = i;
        this.f31387d = i2;
        this.f31388e = i3;
    }

    /* JADX INFO: renamed from: b */
    public static iku m11410b(ikw ikwVar) {
        iku ikuVar = (iku) f31385b.get(ikwVar);
        ikuVar.getClass();
        return ikuVar;
    }

    /* JADX INFO: renamed from: e */
    public static int m11411e(ikw ikwVar) {
        ikw ikwVar2 = ikw.UNINITIALIZED;
        switch (ikwVar.ordinal()) {
            case 1:
                return 2;
            case 2:
                return 9;
            case 3:
                return 23;
            case 4:
                return 6;
            case 5:
                return 24;
            case 6:
                return 22;
            case 7:
                return 20;
            case 8:
                return 21;
            case 9:
                return 25;
            case 10:
                return 26;
            case 11:
                return 36;
            case 12:
                return 29;
            case 13:
                return 11;
            case 14:
                return 13;
            case 15:
                return 28;
            case 16:
                return 31;
            case 17:
            default:
                return 1;
            case 18:
                return 27;
            case 19:
                return 37;
        }
    }

    /* JADX INFO: renamed from: a */
    public final Drawable m11412a(Resources resources) {
        return resources.getDrawable(this.f31388e, null);
    }

    /* JADX INFO: renamed from: c */
    public final String m11413c(Resources resources) {
        return resources.getString(this.f31387d);
    }

    /* JADX INFO: renamed from: d */
    public final String m11414d(Resources resources) {
        return resources.getString(this.f31386c);
    }
}
