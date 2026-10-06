package p000;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.wearable.complications.rendering.p002EM.voNZjxiJou;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cds {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f5326a = 0;

    /* JADX INFO: renamed from: b */
    private static final ikw f5327b = ikw.PHOTO;

    /* JADX INFO: renamed from: a */
    public static float m3502a(Intent intent) {
        return intent.getFloatExtra("override_screen_brightness", -1.0f);
    }

    /* JADX INFO: renamed from: b */
    public static int m3503b(Intent intent) {
        int intExtra = intent.hasExtra("com.google.assistant.extra.TIMER_DURATION_SECONDS") ? intent.getIntExtra("com.google.assistant.extra.TIMER_DURATION_SECONDS", 0) : intent.getIntExtra("android.intent.extra.TIMER_DURATION_SECONDS", 0);
        if (intExtra < 3) {
            return 3;
        }
        if (intExtra > 30) {
            return 30;
        }
        return intExtra;
    }

    /* JADX INFO: renamed from: c */
    public static gcy m3504c(Intent intent) {
        gcy gcyVar = gcy.OFF;
        String str = voNZjxiJou.HKpRUraVduI;
        if (intent.hasExtra(str)) {
            String stringExtra = intent.getStringExtra(str);
            if (cdt.f5330c.containsKey(stringExtra)) {
                return (gcy) cdt.f5330c.get(stringExtra);
            }
        }
        return gcyVar;
    }

    /* JADX INFO: renamed from: d */
    public static ikw m3505d(Intent intent) {
        ikw ikwVar = f5327b;
        if (intent == null) {
            return ikwVar;
        }
        String action = intent.getAction();
        if ("android.media.action.VIDEO_CAMERA".equals(action) || m3515n(intent)) {
            return m3520s(ikw.VIDEO, intent);
        }
        if ("android.media.action.VIDEO_CAPTURE".equals(action)) {
            return ikw.VIDEO_INTENT;
        }
        return ("android.media.action.IMAGE_CAPTURE".equals(action) || "android.media.action.IMAGE_CAPTURE_SECURE".equals(action)) ? ikw.IMAGE_INTENT : m3520s(ikwVar, intent);
    }

    /* JADX INFO: renamed from: f */
    public static void m3507f(Intent intent) {
        intent.putExtra("com.google.assistant.extra.CAMERA_OPEN_ONLY", true);
    }

    /* JADX INFO: renamed from: g */
    public static void m3508g(Intent intent, String str, Object obj) {
        if (obj instanceof String) {
            intent.putExtra(str, (String) obj);
        } else if (obj instanceof Integer) {
            intent.putExtra(str, ((Integer) obj).intValue());
        } else {
            if (!(obj instanceof Boolean)) {
                throw new IllegalArgumentException("Not found corresponding type.");
            }
            intent.putExtra(str, ((Boolean) obj).booleanValue());
        }
    }

    /* JADX INFO: renamed from: h */
    public static boolean m3509h(Intent intent) {
        return intent.hasExtra("android.intent.extra.USE_FRONT_CAMERA") || intent.hasExtra("android.intent.extra.FRONT_CAMERA") || intent.hasExtra("com.google.assistant.extra.USE_FRONT_CAMERA");
    }

    /* JADX INFO: renamed from: i */
    public static boolean m3510i(Intent intent) {
        return "power_double_tap".equals(intent.getStringExtra("com.android.systemui.camera_launch_source")) || intent.getIntExtra("com.android.systemui.camera_launch_source", -1) == 1;
    }

    /* JADX INFO: renamed from: j */
    public static boolean m3511j(Intent intent) {
        return intent.getBooleanExtra("android.intent.extra.USE_FRONT_CAMERA", false) || intent.getBooleanExtra("android.intent.extra.FRONT_CAMERA", false) || intent.getBooleanExtra("com.google.assistant.extra.USE_FRONT_CAMERA", false);
    }

    /* JADX INFO: renamed from: k */
    public static boolean m3512k(Intent intent) {
        return intent.getBooleanExtra("com.google.assistant.extra.CAMERA_OPEN_ONLY", false);
    }

    /* JADX INFO: renamed from: l */
    public static boolean m3513l(Intent intent) {
        if (intent != null) {
            return intent.getBooleanExtra("launch_from_remote_control", false);
        }
        return false;
    }

    /* JADX INFO: renamed from: m */
    public static boolean m3514m(String str) {
        return "android.media.action.STILL_IMAGE_CAMERA".equals(str) || "android.media.action.STILL_IMAGE_CAMERA_SECURE".equals(str);
    }

    /* JADX INFO: renamed from: n */
    public static boolean m3515n(Intent intent) {
        return intent.getAction() != null && "android.media.action.STILL_IMAGE_CAMERA_SECURE".equals(intent.getAction()) && intent.hasExtra("com.google.assistant.extra.OPEN_IN_VIDEO_MODE");
    }

    /* JADX INFO: renamed from: o */
    public static boolean m3516o(Intent intent) {
        if (intent == null) {
            return false;
        }
        if (intent.hasExtra("com.google.assistant.extra.CAMERA_MODE")) {
            return "WIDE_ANGLE".equals(intent.getStringExtra("com.google.assistant.extra.CAMERA_MODE"));
        }
        if (intent.hasExtra("android.intent.extra.STILL_IMAGE_MODE")) {
            return "WIDE_ANGLE".equals(intent.getStringExtra("android.intent.extra.STILL_IMAGE_MODE"));
        }
        return false;
    }

    /* JADX INFO: renamed from: p */
    public static boolean m3517p(bko bkoVar) {
        Intent intentM2611e = bkoVar.m2611e();
        if (intentM2611e == null) {
            return false;
        }
        String action = intentM2611e.getAction();
        return "android.media.action.VIDEO_CAPTURE".equals(action) || "android.media.action.IMAGE_CAPTURE".equals(action) || "android.media.action.IMAGE_CAPTURE_SECURE".equals(action);
    }

    /* JADX INFO: renamed from: q */
    public static boolean m3518q(bko bkoVar) {
        Intent intentM2611e = bkoVar.m2611e();
        return intentM2611e != null && m3514m(intentM2611e.getAction()) && (intentM2611e.hasExtra("android.intent.extra.TIMER_DURATION_SECONDS") || intentM2611e.hasExtra("com.google.assistant.extra.TIMER_DURATION_SECONDS")) && !m3512k(intentM2611e);
    }

    /* JADX INFO: renamed from: r */
    public static boolean m3519r(bko bkoVar) {
        String action;
        Intent intentM2611e = bkoVar.m2611e();
        if (intentM2611e == null || (action = intentM2611e.getAction()) == null || m3512k(intentM2611e)) {
            return false;
        }
        return action.equals("android.media.action.VIDEO_CAMERA") || m3515n(intentM2611e);
    }

    /* JADX INFO: renamed from: s */
    private static ikw m3520s(ikw ikwVar, Intent intent) {
        if (intent.hasExtra("com.google.assistant.extra.CAMERA_MODE")) {
            String stringExtra = intent.getStringExtra("com.google.assistant.extra.CAMERA_MODE");
            return cdt.f5328a.containsKey(stringExtra) ? (ikw) cdt.f5328a.get(stringExtra) : ikwVar;
        }
        if (!intent.hasExtra("android.intent.extra.STILL_IMAGE_MODE")) {
            return ikwVar;
        }
        String stringExtra2 = intent.getStringExtra("android.intent.extra.STILL_IMAGE_MODE");
        return cdt.f5329b.containsKey(stringExtra2) ? (ikw) cdt.f5329b.get(stringExtra2) : ikwVar;
    }

    /* JADX INFO: renamed from: e */
    public static mrm m3506e(Intent intent) {
        Bundle extras = intent == null ? null : intent.getExtras();
        return extras == null ? mqu.f41450a : mrm.m16828h((Uri) extras.getParcelable("output"));
    }
}
