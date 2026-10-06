package p000;

import android.os.Build;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class exd {

    /* JADX INFO: renamed from: a */
    public static final exc f20723a;

    /* JADX INFO: renamed from: b */
    private static final nbh f20724b = nbh.m17259h("com/google/android/apps/camera/legacy/lightcycle/panorama/DeviceManager");

    /* JADX INFO: renamed from: c */
    private static final Map f20725c;

    static {
        HashMap map = new HashMap();
        f20725c = map;
        m7979c("LGE", "hammerhead", new exc(-1.0f, true));
        m7979c("LGE", "g3", new exc(-1.0f, true));
        m7979c("LGE", "b1", new exc(-1.0f, true));
        m7979c("LGE", "b1w", new exc(-1.0f, true));
        m7979c("HTC", "m7", new exc(56.69f, false));
        m7979c("HTC", "m7cdtu", new exc(56.69f, false));
        m7979c("HTC", "m7cdug", new exc(56.69f, false));
        m7979c("HTC", "m7cdwg", new exc(56.69f, false));
        m7979c("HTC", "m7wls", new exc(56.69f, false));
        m7979c("HTC", "m7wlv", new exc(56.69f, false));
        m7979c("motorola", "ghost", new exc(53.0f, false));
        m7979c("Default", "", new exc(-1.0f, false));
        String str = ((("Brand : '" + Build.BRAND + "' ") + "Manufacturer : '" + Build.MANUFACTURER + "' ") + "Device : '" + Build.DEVICE + "' ") + "Model : '" + Build.MODEL + "' ";
        String str2 = Build.HARDWARE;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("Hardware : '");
        sb.append(str2);
        sb.append("' ");
        map.containsKey(m7978b());
        exc excVar = (exc) map.get(m7978b());
        if (excVar == null) {
            excVar = (exc) map.get("Default");
        }
        f20723a = excVar;
    }

    /* JADX INFO: renamed from: a */
    public static float m7977a(float f) {
        float f2 = f20723a.f20721a;
        if (f2 > 0.0f) {
            return f2;
        }
        if (f <= 160.0f) {
            return f;
        }
        ((nbe) ((nbe) f20724b.m17252c()).mo17276G((char) 2031)).mo17293r("Reported FOV is larger than the maximum allowed at : %g", Float.valueOf(f));
        return 55.0f;
    }

    /* JADX INFO: renamed from: b */
    private static String m7978b() {
        return String.valueOf(Build.MANUFACTURER).concat(String.valueOf(Build.DEVICE));
    }

    /* JADX INFO: renamed from: c */
    private static void m7979c(String str, String str2, exc excVar) {
        f20725c.put(str.concat(str2), excVar);
    }
}
