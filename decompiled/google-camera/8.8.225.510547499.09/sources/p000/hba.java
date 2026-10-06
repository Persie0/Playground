package p000;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.apps.camera.bottombar.C0100R;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class hba extends hbh {

    /* JADX INFO: renamed from: b */
    private static final nbh f27116b = nbh.m17259h("com/google/android/apps/camera/settings/app/upgrader/AppUpgrader");

    /* JADX INFO: renamed from: c */
    private final Context f27117c;

    /* JADX INFO: renamed from: d */
    private final fve f27118d;

    /* JADX INFO: renamed from: e */
    private final dhv f27119e;

    /* JADX INFO: renamed from: f */
    private final har f27120f;

    /* JADX INFO: renamed from: g */
    private final kms f27121g;

    public hba(Context context, fve fveVar, kms kmsVar, har harVar, dhv dhvVar) {
        super("pref_upgrade_version", 24);
        this.f27117c = context;
        this.f27118d = fveVar;
        this.f27121g = kmsVar;
        this.f27119e = dhvVar;
        this.f27120f = harVar;
    }

    /* JADX INFO: renamed from: e */
    private final void m10054e(kmq kmqVar, had hadVar) {
        String strM10088b = hbk.m10088b(kmqVar);
        if (strM10088b == null) {
            ((nbe) ((nbe) f27116b.m17252c()).mo17276G((char) 3402)).mo17290o("Ignoring attempt to upgrade size of unhandled camera facing direction");
            return;
        }
        kbc kbcVarM13913b = kbd.m13913b(hadVar.mo10038e(strM10088b));
        kmg kmgVarMo13858e = this.f27121g.mo13858e(kmqVar);
        if (kbcVarM13913b == null || kmgVarMo13858e == null || !kan.m13873j(kbcVarM13913b).m13883m(kan.f35486a)) {
            return;
        }
        fvu fvuVarM9446h = gls.m9446h(kmgVarMo13858e, this.f27121g, this.f27118d, this.f27119e);
        kbc kbcVarM10087a = hbk.m10087a(null, fvuVarM9446h.mo14571x(256), fvuVarM9446h.mo14558k());
        if (kbcVarM10087a != null) {
            hadVar.mo10044k(strM10088b, kbd.m13915d(kbcVarM10087a));
        }
    }

    /* JADX INFO: renamed from: f */
    private final void m10055f(had hadVar, String str) {
        if (hadVar.mo10047n(str)) {
            hadVar.mo10044k(str, this.f27117c.getString(C0100R.string.pref_camera_video_flashmode_off));
        }
    }

    /* JADX INFO: renamed from: g */
    private final void m10056g(had hadVar, kmq kmqVar) {
        hadVar.getClass();
        kmqVar.getClass();
        String strM10088b = hbk.m10088b(kmqVar);
        if (strM10088b == null) {
            ((nbe) ((nbe) f27116b.m17252c()).mo17276G((char) 3405)).mo17290o("Ignoring attempt to upgrade size of unhandled camera facing direction");
            return;
        }
        kmg kmgVarMo13858e = this.f27121g.mo13858e(kmqVar);
        if (kmgVarMo13858e == null) {
            ((nbe) ((nbe) f27116b.m17252c()).mo17276G((char) 3404)).mo17293r("Failed to retrieve a camera id for facing: %s", kmqVar);
            hadVar.mo10040g(strM10088b);
            return;
        }
        fvu fvuVarM9446h = gls.m9446h(kmgVarMo13858e, this.f27121g, this.f27118d, this.f27119e);
        kbc kbcVarM10087a = hbk.m10087a(hadVar.mo10038e(strM10088b), fvuVarM9446h.mo14571x(256), fvuVarM9446h.mo14558k());
        if (kbcVarM10087a != null) {
            hadVar.mo10044k(strM10088b, kbd.m13915d(kbcVarM10087a));
        }
    }

    @Override // p000.hbh
    /* JADX INFO: renamed from: a */
    public final void mo8605a(had hadVar, int i) {
        String strMo10038e;
        Boolean bool;
        boolean z;
        Context context = this.f27117c;
        if (i < 5) {
            SharedPreferences sharedPreferencesMo10037d = hadVar.mo10037d();
            SharedPreferences sharedPreferencesMo10049p = hadVar.mo10049p();
            if (sharedPreferencesMo10037d.contains(gzy.f27043b.f26977a)) {
                String str = gzy.f27043b.f26977a;
                Map<String, ?> all = sharedPreferencesMo10037d.getAll();
                if (all.containsKey(str) && !(all.get(str) instanceof String)) {
                    String str2 = gzy.f27043b.f26977a;
                    try {
                        z = sharedPreferencesMo10037d.getBoolean(str2, false);
                    } catch (ClassCastException e) {
                        ((nbe) ((nbe) ((nbe) hbh.f27138a.m17251b()).mo17283h(e)).mo17276G((char) 3414)).mo17290o("error reading old value, removing and returning default");
                        z = false;
                    }
                    sharedPreferencesMo10037d.edit().remove(str2).apply();
                    hadVar.mo10045l(gzy.f27043b.f26977a, z);
                }
            }
            if (sharedPreferencesMo10049p.contains("pref_camera_hdr_plus_key") && "on".equals(m10085c(sharedPreferencesMo10049p, "pref_camera_hdr_plus_key"))) {
                hadVar.mo10045l("pref_camera_hdr_plus_key", true);
            }
        }
        if (i < 2) {
            SharedPreferences sharedPreferencesMo10049p2 = hadVar.mo10049p();
            if (hadVar.mo10047n(gzy.f27043b.f26977a)) {
                if (!hadVar.mo10046m(gzy.f27043b.f26977a)) {
                    hadVar.mo10040g(gzy.f27043b.f26977a);
                }
            } else if (sharedPreferencesMo10049p2.contains(gzy.f27043b.f26977a) && "on".equals(m10085c(sharedPreferencesMo10049p2, gzy.f27043b.f26977a))) {
                hadVar.mo10045l(gzy.f27043b.f26977a, true);
            }
        }
        if (i < 3) {
            m10056g(hadVar, kmq.f36557a);
            m10056g(hadVar, kmq.BACK);
        }
        if (i < 8 && hadVar.mo10047n("pref_camera_hdr_plus_key")) {
            String strMo10038e2 = hadVar.mo10038e("pref_camera_hdr_plus_key");
            if ("1".equals(strMo10038e2)) {
                bool = Boolean.TRUE;
            } else {
                bool = "0".equals(strMo10038e2) ? Boolean.FALSE : null;
            }
            if (bool != null) {
                hadVar.mo10044k("pref_camera_hdr_plus_key", true != bool.booleanValue() ? "off" : "on");
            }
        }
        if (i < 9 && hadVar.mo10047n("pref_camera_hdr_plus_key") && (strMo10038e = hadVar.mo10038e("pref_camera_hdr_plus_key")) != null && !strMo10038e.equals("on") && !strMo10038e.equals("off") && !strMo10038e.equals("auto")) {
            hadVar.mo10040g("pref_camera_hdr_plus_key");
        }
        if (i < 12) {
            m10054e(kmq.f36557a, hadVar);
            m10054e(kmq.BACK, hadVar);
        }
        if (i < 13 && hadVar.mo10047n("pref_camera_flashmode_key")) {
            String strMo10038e3 = hadVar.mo10038e("pref_camera_flashmode_key");
            hadVar.mo10044k(gzy.f27060s.f26977a, strMo10038e3);
            hadVar.mo10044k(gzy.f27061t.f26977a, strMo10038e3);
            hadVar.mo10040g("pref_camera_flashmode_key");
        }
        if (i < 14) {
            if (hadVar.mo10047n("pref_camera_video_flashmode_key")) {
                String strMo10038e4 = hadVar.mo10038e("pref_camera_video_flashmode_key");
                hadVar.mo10044k(gzy.f27063v.f26977a, strMo10038e4);
                hadVar.mo10044k(gzy.f27064w.f26977a, strMo10038e4);
                hadVar.mo10040g("pref_camera_video_flashmode_key");
            }
            String str3 = gzy.f27066y.f26977a;
            if (hadVar.mo10047n("pref_camera_video_flashmode_thermally_disabled_key")) {
                hadVar.mo10044k(str3, hadVar.mo10038e("pref_camera_video_flashmode_thermally_disabled_key"));
                hadVar.mo10040g("pref_camera_video_flashmode_thermally_disabled_key");
            }
        }
        if (i < 16 && this.f27119e.mo6184l(dib.f11268ab)) {
            String str4 = gzy.f27060s.f26977a;
            if (hadVar.mo10047n(str4)) {
                hadVar.mo10044k(str4, this.f27117c.getString(C0100R.string.pref_camera_video_flashmode_off));
            }
        }
        if (i < 17) {
            m10055f(hadVar, gzy.f27061t.f26977a);
            m10055f(hadVar, gzy.f27060s.f26977a);
        }
        if (i < 18 && !this.f27119e.mo6183k(dim.f11640c) && gcy.AUTO.f24251d.equals(hadVar.mo10038e(gzy.f27061t.f26977a))) {
            m10055f(hadVar, gzy.f27061t.f26977a);
        }
        if (i < 19 && hadVar.mo10047n("pref_camera_dynamic_depth_enabled_key")) {
            hadVar.mo10045l("pref_camera_dynamic_depth_enabled_key", false);
        }
        if (i < 20) {
            String str5 = gzy.f26992D.f26977a;
            String strMo10038e5 = hadVar.mo10038e("pref_video_quality_back_key");
            if (strMo10038e5 != null && strMo10038e5.contentEquals(context.getString(C0100R.string.pref_video_quality_large)) && !hadVar.mo10047n(str5)) {
                hadVar.mo10045l(str5, true);
            }
        }
        if (i < 21) {
            String str6 = gzy.f26992D.f26977a;
            boolean zMo10046m = hadVar.mo10046m(str6);
            hadVar.mo10040g(str6);
            if (zMo10046m) {
                this.f27120f.mo3415bf(gzr.RES_2160P);
            }
        }
        if (i < 22 && this.f27119e.mo6184l(did.f11424ac)) {
            hadVar.mo10044k(gzy.f27061t.f26977a, "ns");
            hadVar.mo10044k(gzy.f27060s.f26977a, "ns");
        }
        if (i < 23 && !this.f27119e.mo6184l(dib.f11238Y)) {
            hadVar.mo10044k("pref_video_fps_p2018_key", gzm.FPS_30.name());
            hadVar.mo10044k("pref_video_resolution", gzr.RES_1080P.name());
        }
        if (i >= 24 || this.f27119e.mo6184l(dib.f11303bJ)) {
            return;
        }
        hadVar.mo10044k(gzy.f27049h.f26977a, "zoom");
    }

    @Override // p000.hbh
    /* JADX INFO: renamed from: b */
    protected final int mo10057b(had hadVar) {
        SharedPreferences sharedPreferencesMo10037d = hadVar.mo10037d();
        if (sharedPreferencesMo10037d.contains("pref_strict_upgrade_version")) {
            Object obj = sharedPreferencesMo10037d.getAll().get("pref_strict_upgrade_version");
            sharedPreferencesMo10037d.edit().remove("pref_strict_upgrade_version").apply();
            if (obj instanceof Integer) {
                return ((Integer) obj).intValue();
            }
            if (obj instanceof String) {
                return Integer.parseInt((String) obj);
            }
        }
        return super.mo10057b(hadVar);
    }
}
