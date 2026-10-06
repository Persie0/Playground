package p000;

import android.app.Activity;
import android.app.KeyguardManager;
import android.content.Intent;
import com.google.android.libraries.performance.primes.transmitter.clearcut.Hbk.BcwGDRhrTsnlj;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class emz {

    /* JADX INFO: renamed from: a */
    private static final nbh f14736a = nbh.m17259h("com/google/android/apps/camera/intentlaunch/IntentRouter");

    /* JADX INFO: renamed from: a */
    public static final void m7536a(Intent intent, boolean z, Activity activity, hai haiVar) {
        if (activity.isVoiceInteractionRoot()) {
            if (z) {
                intent.putExtra("launch_unknown_mode", true);
            }
            intent.putExtra("assistant_voice_interaction", true);
        }
        if (cds.m3512k(intent)) {
            return;
        }
        haiVar.mo10033e(gzy.f27057p, true);
    }

    /* JADX INFO: renamed from: b */
    public static final mrm m7537b(Intent intent, Activity activity, msi msiVar, khy khyVar) {
        boolean zMo14534C;
        mrm mrmVarM16829i = mrm.m16829i(cds.m3505d(intent));
        if (!intent.hasExtra("com.google.assistant.extra.CAMERA_MODE") && !intent.hasExtra("android.intent.extra.STILL_IMAGE_MODE")) {
            return mrmVarM16829i;
        }
        if ((!intent.hasExtra("com.google.assistant.extra.CAMERA_MODE") || !cdt.f5328a.containsKey(intent.getStringExtra("com.google.assistant.extra.CAMERA_MODE"))) && (!intent.hasExtra("android.intent.extra.STILL_IMAGE_MODE") || !cdt.f5329b.containsKey(intent.getStringExtra("android.intent.extra.STILL_IMAGE_MODE")))) {
            return mqu.f41450a;
        }
        ikw ikwVar = (ikw) ((mrq) mrmVarM16829i).f41482a;
        if (((mwx) msiVar.mo6051a()).containsKey(ikwVar)) {
            Boolean bool = (Boolean) ((mwx) msiVar.mo6051a()).get(ikwVar);
            lku.m15662p(bool);
            zMo14534C = bool.booleanValue();
        } else if (cds.m3516o(activity.getIntent())) {
            kmg kmgVarMo13858e = khyVar.f36117a.mo13858e(kmq.f36557a);
            kmgVarMo13858e.getClass();
            zMo14534C = khyVar.f36117a.mo13854a(kmgVarMo13858e).mo14534C();
        } else {
            zMo14534C = true;
        }
        return zMo14534C ? mrmVarM16829i : mqu.f41450a;
    }

    /* JADX INFO: renamed from: c */
    public static final mrm m7538c(mrm mrmVar, Intent intent, iad iadVar, oju ojuVar, jfs jfsVar, Activity activity, fcp fcpVar, cwd cwdVar, msi msiVar, hai haiVar, khy khyVar) {
        m7540e(intent);
        if (!mrmVar.mo16813g()) {
            ((nbe) ((nbe) f14736a.m17252c()).mo17276G((char) 1597)).mo17290o("the mode is unknown or unsupported");
            return mqu.f41450a;
        }
        ((nbe) ((nbe) f14736a.m17252c()).mo17276G((char) 1596)).mo17293r("launch mode: %s", ((ikw) mrmVar.mo16809c()).name());
        if (activity.isVoiceInteractionRoot()) {
            if (activity.getIntent().hasExtra("com.google.assistant.extra.CAMERA_MODE")) {
                String stringExtra = activity.getIntent().getStringExtra("com.google.assistant.extra.CAMERA_MODE");
                stringExtra.getClass();
                cds.m3508g(intent, "com.google.assistant.extra.CAMERA_MODE", stringExtra);
            }
        } else if (activity.getIntent().hasExtra("android.intent.extra.STILL_IMAGE_MODE")) {
            String stringExtra2 = activity.getIntent().getStringExtra("android.intent.extra.STILL_IMAGE_MODE");
            stringExtra2.getClass();
            cds.m3508g(intent, "android.intent.extra.STILL_IMAGE_MODE", stringExtra2);
        }
        if (activity.isVoiceInteractionRoot()) {
            m7541f(intent, activity.getIntent().getBooleanExtra("com.google.assistant.extra.CAMERA_OPEN_ONLY", false));
        } else {
            m7541f(intent, true);
        }
        switch (((ikw) mrmVar.mo16809c()).ordinal()) {
            case 1:
                if (cds.m3516o(activity.getIntent())) {
                    m7544i(intent, true, activity);
                } else {
                    m7544i(intent, cds.m3511j(activity.getIntent()), activity);
                }
                m7543h(intent, activity);
                m7542g(intent, activity);
                break;
            case 2:
                m7544i(intent, cds.m3511j(activity.getIntent()), activity);
                break;
            case 3:
                m7543h(intent, activity);
                break;
            case 6:
                m7544i(intent, cds.m3511j(activity.getIntent()), activity);
                m7543h(intent, activity);
                m7542g(intent, activity);
                break;
            case 12:
                m7544i(intent, cds.m3511j(activity.getIntent()), activity);
                m7543h(intent, activity);
                break;
        }
        if (!intent.hasExtra("launch_unknown_mode")) {
            return mrmVar;
        }
        m7540e(intent);
        return mqu.f41450a;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:32:0x008e  */
    /* JADX INFO: renamed from: d */
    public static final boolean m7539d(ikw ikwVar, iad iadVar, oju ojuVar, jfs jfsVar, Activity activity, fcp fcpVar, cwd cwdVar) {
        boolean z;
        int i;
        if (ikwVar.equals(ikw.LENS)) {
            iadVar.m10976b();
            z = true;
        } else if (ikwVar.equals(ikw.TIARA) && jfs.m13059I(activity.getBaseContext())) {
            ((ido) ojuVar).get().m16305c();
            z = true;
        } else if (ikwVar.equals(ikw.ORNAMENT) && jfsVar.m13074G(activity.getBaseContext())) {
            ((ido) ojuVar).get().m16303a();
            z = true;
        } else {
            ((nbe) ((nbe) f14736a.m17252c()).mo17276G((char) 1600)).mo17290o("Attempted to launch unsupported external activity!");
            z = false;
        }
        if (z) {
            String action = activity.getIntent().getAction();
            if (action != null) {
                switch (action) {
                    case "android.media.action.STILL_IMAGE_CAMERA":
                        i = 8;
                        break;
                    case "android.media.action.STILL_IMAGE_CAMERA_SECURE":
                        i = 10;
                        break;
                    case "android.media.action.VIDEO_CAMERA":
                        i = 9;
                        break;
                    default:
                        i = 1;
                        break;
                }
            } else {
                i = 1;
            }
            int i2 = true != activity.isVoiceInteractionRoot() ? 7 : 9;
            KeyguardManager keyguardManagerM5647E = cwdVar.m5647E();
            fcpVar.mo8175at(i, i2, iku.m11411e(ikwVar), keyguardManagerM5647E.isKeyguardLocked(), keyguardManagerM5647E.isKeyguardSecure(), true);
        }
        return z;
    }

    /* JADX INFO: renamed from: e */
    private static final void m7540e(Intent intent) {
        intent.removeExtra("com.google.assistant.extra.CAMERA_MODE");
        intent.removeExtra("com.google.assistant.extra.USE_FRONT_CAMERA");
        intent.removeExtra("com.google.assistant.extra.TIMER_DURATION_SECONDS");
        intent.removeExtra("com.google.assistant.extra.CAMERA_OPEN_ONLY");
        intent.removeExtra("com.google.assistant.extra.CAMERA_FLASH_MODE");
        intent.removeExtra("android.intent.extra.STILL_IMAGE_MODE");
        intent.removeExtra("android.intent.extra.FRONT_CAMERA");
        intent.removeExtra("android.intent.extra.USE_FRONT_CAMERA");
        intent.removeExtra("android.intent.extra.TIMER_DURATION_SECONDS");
    }

    /* JADX INFO: renamed from: f */
    private static final void m7541f(Intent intent, boolean z) {
        String str = BcwGDRhrTsnlj.fphyGf;
        if (intent.hasExtra(str)) {
            return;
        }
        cds.m3508g(intent, str, Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: g */
    private static final void m7542g(Intent intent, Activity activity) {
        if (activity.isVoiceInteractionRoot() && activity.getIntent().hasExtra("com.google.assistant.extra.CAMERA_FLASH_MODE")) {
            String stringExtra = activity.getIntent().getStringExtra("com.google.assistant.extra.CAMERA_FLASH_MODE");
            Intent intent2 = activity.getIntent();
            int i = cds.f5326a;
            if (intent2 == null || !intent2.hasExtra("com.google.assistant.extra.CAMERA_FLASH_MODE") || !cdt.f5330c.containsKey(intent2.getStringExtra("com.google.assistant.extra.CAMERA_FLASH_MODE"))) {
                cds.m3508g(intent, "launch_unknown_mode", true);
            } else {
                stringExtra.getClass();
                cds.m3508g(intent, "com.google.assistant.extra.CAMERA_FLASH_MODE", stringExtra);
            }
        }
    }

    /* JADX INFO: renamed from: h */
    private static final void m7543h(Intent intent, Activity activity) {
        if (activity.isVoiceInteractionRoot()) {
            cds.m3508g(intent, "com.google.assistant.extra.TIMER_DURATION_SECONDS", Integer.valueOf(cds.m3503b(activity.getIntent())));
        }
    }

    /* JADX INFO: renamed from: i */
    private static final void m7544i(Intent intent, boolean z, Activity activity) {
        if (activity.isVoiceInteractionRoot()) {
            cds.m3508g(intent, "com.google.assistant.extra.USE_FRONT_CAMERA", Boolean.valueOf(z));
            return;
        }
        Boolean boolValueOf = Boolean.valueOf(z);
        cds.m3508g(intent, "android.intent.extra.FRONT_CAMERA", boolValueOf);
        cds.m3508g(intent, "android.intent.extra.USE_FRONT_CAMERA", boolValueOf);
    }
}
