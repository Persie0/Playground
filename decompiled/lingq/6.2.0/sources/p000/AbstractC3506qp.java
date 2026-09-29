package p000;

import android.os.PowerManager;
import java.util.Locale;

/* JADX INFO: renamed from: qp */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3506qp {
    /* JADX INFO: renamed from: a */
    public static boolean m20094a(PowerManager powerManager) {
        return powerManager.isPowerSaveMode();
    }

    /* JADX INFO: renamed from: b */
    public static String m20095b(Locale locale) {
        return locale.toLanguageTag();
    }
}
