package p000;

import android.content.Context;
import com.google.android.apps.camera.bottombar.C0100R;
import java.util.function.Predicate;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fdh {
    /* JADX INFO: renamed from: a */
    public static gfj m8261a(jwn jwnVar, kme kmeVar, jww jwwVar, Predicate predicate, gev gevVar) {
        gfj gfjVarM9181o = gfk.m9181o();
        gfjVarM9181o.m9178r(gevVar);
        gfjVarM9181o.m9168h(C0100R.string.af_option_desc);
        gfjVarM9181o.m9163c(C0100R.string.af_desc);
        gfjVarM9181o.m9175o(new gek(jwnVar, kmeVar, 1));
        gfjVarM9181o.m9172l(new fdg(jwnVar, predicate, gevVar, 0));
        gfjVarM9181o.m9179s(predicate);
        gfjVarM9181o.f24545a = jwwVar;
        return gfjVarM9181o;
    }

    /* JADX INFO: renamed from: b */
    public static final fcu m8262b(gyw gywVar, nkm nkmVar, Float f) {
        return new fcu(gywVar, nkmVar, f);
    }

    /* JADX INFO: renamed from: c */
    public static synchronized void m8263c(dhv dhvVar) {
        lku.m15607B(((Integer) dhvVar.mo6173a(dib.f11371m).get()).intValue() >= 0, "Key %s must be set to a value >=0", dib.f11371m);
    }

    /* JADX INFO: renamed from: d */
    public static void m8264d(jvd jvdVar, fao faoVar, fbp fbpVar) {
        jvdVar.getClass();
        fbpVar.getClass();
        if (jvd.m13540d()) {
            faoVar.m8083g(fbpVar);
        } else {
            jvdVar.execute(new bek(faoVar, fbpVar, 2));
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m8265e(jvd jvdVar, fba fbaVar, fbp fbpVar) {
        jvdVar.getClass();
        fbaVar.getClass();
        fbpVar.getClass();
        if (jvd.m13540d()) {
            fbaVar.m8097e(fbpVar);
        } else {
            jvdVar.execute(new bek(fbaVar, fbpVar, 3));
        }
    }

    /* JADX INFO: renamed from: f */
    public static String m8266f(int i, Context context, boolean z) {
        int i2;
        switch (i - 1) {
            case 2:
                i2 = true == z ? C0100R.string.imax_stopped_too_much_horizontal_tilt : C0100R.string.imax_stopped_too_much_vertical_tilt;
                break;
            case 3:
                i2 = C0100R.string.imax_stopped_too_much_roll;
                break;
            case 4:
                i2 = C0100R.string.imax_stopped_backtracking;
                break;
            default:
                i2 = C0100R.string.imax_stopped_too_fast;
                break;
        }
        return context.getString(i2);
    }

    /* JADX INFO: renamed from: g */
    public static int m8267g(int i) {
        switch (i - 1) {
            case 1:
                return 7;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            default:
                return 2;
        }
    }

    /* JADX INFO: renamed from: h */
    public static boolean m8268h() {
        return (ivt.f32353g == null || ivt.f32354h == null || ivt.f32355i == null || ivt.f32356j == null) ? false : true;
    }
}
