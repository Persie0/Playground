package p000;

import android.content.SharedPreferences;
import android.hardware.display.DisplayManager;
import android.opengl.GLSurfaceView;
import android.preference.PreferenceManager;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.google.android.apps.camera.bottombar.C0100R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ehd implements ohi {

    /* JADX INFO: renamed from: a */
    private final /* synthetic */ int f14031a;

    /* JADX INFO: renamed from: b */
    private final Object f14032b;

    public ehd(cwd cwdVar, int i, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.f14031a = i;
        this.f14032b = cwdVar;
    }

    public ehd(oju ojuVar, int i) {
        this.f14031a = i;
        this.f14032b = ojuVar;
    }

    /* JADX INFO: renamed from: a */
    public static ehd m7320a(oju ojuVar) {
        return new ehd(ojuVar, 0);
    }

    /* JADX INFO: renamed from: b */
    public static ehd m7321b(oju ojuVar) {
        return new ehd(ojuVar, 2);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r0v34, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r0v37, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r0v50, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r0v54, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r0v72, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r0v77, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r0v83, types: [java.lang.Object, oju] */
    @Override // p000.oju
    public final /* synthetic */ Object get() {
        switch (this.f14031a) {
            case 0:
                return ((mrm) this.f14032b.get()).mo16808b(ddu.f10595l);
            case 1:
                return ((cwd) this.f14032b).f9866a;
            case 2:
                Object objM17136H = ((dhv) this.f14032b.get()).mo6184l(did.f11414Y) ? mxk.m17136H(kgq.m14215e(ivr.f32309a, 1)) : mzx.f41874a;
                objM17136H.getClass();
                return objM17136H;
            case 3:
                return mrm.m16829i(((ehs) this.f14032b).get());
            case 4:
                return new eig((GLSurfaceView) this.f14032b.get());
            case 5:
                mrm mrmVarM7866a = ((etl) this.f14032b).m7866a();
                gfj gfjVarM9181o = gfk.m9181o();
                gfjVarM9181o.m9178r(gev.IMAX_AUDIO);
                gfjVarM9181o.m9168h(C0100R.string.imax_audio_recording_desc);
                gfjVarM9181o.m9163c(C0100R.string.imax_audio_recording_desc);
                gfjVarM9181o.m9174n(gfc.IMAX_AUDIO_OFF, gfc.IMAX_AUDIO_ON);
                gfjVarM9181o.m9170j(Integer.valueOf(C0100R.string.imax_disable_audio_recording), Integer.valueOf(C0100R.string.imax_enable_audio_recording));
                gfjVarM9181o.m9165e(Integer.valueOf(C0100R.string.imax_disable_audio_recording_desc), Integer.valueOf(C0100R.string.imax_enable_audio_recording_desc));
                gfjVarM9181o.m9167g(Integer.valueOf(C0100R.drawable.quantum_gm_ic_mic_off_white_24), Integer.valueOf(C0100R.drawable.quantum_gm_ic_mic_white_24));
                jww jwwVar = (jww) ((mrq) mrmVarM7866a).f41482a;
                ddu dduVar = ddu.f10596m;
                gfc gfcVar = gfc.IMAX_AUDIO_ON;
                gfcVar.getClass();
                gfjVarM9181o.f24545a = jwv.m13645b(jwwVar, dduVar, new ceg(gfcVar, 17));
                gfjVarM9181o.m9180t(ikw.IMAX);
                return mxk.m17136H(gfjVarM9181o.m9161a());
            case 6:
                ekt ektVar = (ekt) this.f14032b.get();
                eks eksVar = new eks();
                eksVar.f14496e = ektVar;
                eksVar.m7417f();
                return eksVar;
            case 7:
                eio eioVar = (eio) this.f14032b.get();
                eioVar.getClass();
                return eioVar;
            case 8:
                return new eio(((dws) this.f14032b).m6830a());
            case 9:
                return ((eif) this.f14032b).get();
            case 10:
                return ((haj) this.f14032b).get().m11349q("pref_imax_audio_enabled_key", false);
            case 11:
                ibk ibkVar = (ibk) ((elx) this.f14032b.get());
                ibkVar.getClass();
                return ibkVar;
            case 12:
                iuh iuhVar = (iuh) ((elx) this.f14032b.get());
                iuhVar.getClass();
                return iuhVar;
            case 13:
                WindowManager windowManager = ((emc) this.f14032b).get();
                DisplayMetrics displayMetrics = new DisplayMetrics();
                windowManager.getDefaultDisplay().getMetrics(displayMetrics);
                return displayMetrics;
            case 14:
                return new cwd(((dws) this.f14032b).m6830a());
            case 15:
                return new cwd(((dws) this.f14032b).m6830a());
            case 16:
                SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(((dws) this.f14032b).m6830a());
                defaultSharedPreferences.getClass();
                return defaultSharedPreferences;
            case 17:
                DisplayManager displayManager = (DisplayManager) ((emj) this.f14032b.get()).mo7509a(emj.f14713f);
                displayManager.getClass();
                return displayManager;
            case 18:
                return new ent((kbz) this.f14032b.get());
            case 19:
                return new eps(((dws) this.f14032b).m6830a());
            default:
                return new eqc((kbz) this.f14032b.get(), gtf.m9754c());
        }
    }
}
