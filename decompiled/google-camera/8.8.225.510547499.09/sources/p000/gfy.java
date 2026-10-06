package p000;

import android.support.wearable.complications.rendering.p002EM.voNZjxiJou;
import com.google.android.apps.camera.bottombar.C0100R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gfy {

    /* JADX INFO: renamed from: a */
    public static final nbh f24631a = nbh.m17259h("com/google/android/apps/camera/optionsbar/menuitem/MenuItemModule");

    /* JADX INFO: renamed from: b */
    public static final mwh f24632b;

    static {
        gfc gfcVar = gfc.PHOTO_SPHERE;
        gfc gfcVar2 = gfc.HORIZONTAL_PHOTO_SPHERE;
        gfc gfcVar3 = gfc.VERTICAL_PHOTO_SPHERE;
        gfc gfcVar4 = gfc.WIDE_ANGLE_PHOTO_SPHERE;
        gfc gfcVar5 = gfc.FISH_EYE_PHOTO_SPHERE;
        lku.m15653g("pano_photosphere", gfcVar);
        lku.m15653g("pano_horizontal", gfcVar2);
        lku.m15653g("pano_vertical", gfcVar3);
        lku.m15653g("pano_wide", gfcVar4);
        String str = voNZjxiJou.coSFj;
        lku.m15653g(str, gfcVar5);
        f24632b = new mzq(new Object[]{"pano_photosphere", gfcVar, "pano_horizontal", gfcVar2, "pano_vertical", gfcVar3, "pano_wide", gfcVar4, str, gfcVar5}, 5);
    }

    /* JADX INFO: renamed from: a */
    public static gfj m9188a(boolean z) {
        int i = z ? C0100R.drawable.quantum_gm_ic_do_not_disturb_white_24 : C0100R.drawable.quantum_gm_ic_flash_off_white_24;
        int i2 = true != z ? C0100R.string.cam_flash_off : C0100R.string.cam_flash_off_alt;
        int i3 = true != z ? C0100R.string.cam_flash_on : C0100R.string.cam_flash_on_alt;
        int i4 = true != z ? C0100R.string.flash_desc : C0100R.string.more_light_desc;
        int i5 = true != z ? C0100R.string.flash_options_desc : C0100R.string.more_light_options_desc;
        int i6 = true != z ? C0100R.drawable.quantum_gm_ic_flash_auto_white_24 : C0100R.drawable.gs_night_sight_auto_vd_theme_24;
        int i7 = true != z ? C0100R.string.cam_flash_auto : C0100R.string.cam_flash_ns;
        int i8 = true != z ? C0100R.string.flash_auto_desc : C0100R.string.flash_ns_desc;
        gfc gfcVar = z ? gfc.PHOTO_FLASH_NS : gfc.PHOTO_FLASH_AUTO;
        gfj gfjVarM9181o = gfk.m9181o();
        gfjVarM9181o.m9168h(i4);
        gfjVarM9181o.m9163c(i5);
        gfjVarM9181o.m9162b(gfc.PHOTO_FLASH_OFF, i, i2, C0100R.string.flash_off_desc);
        gfjVarM9181o.m9162b(gfcVar, i6, i7, i8);
        gfjVarM9181o.m9162b(gfc.PHOTO_FLASH_ON, C0100R.drawable.quantum_gm_ic_flash_on_white_24, i3, C0100R.string.flash_on_desc);
        return gfjVarM9181o;
    }
}
