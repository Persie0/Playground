package p000;

import android.os.Build;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public abstract class hj7 {

    /* JADX INFO: renamed from: a */
    public static final gj7 f42493a;

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    static {
        gj7 gj7Var;
        String str = Build.FINGERPRINT;
        if (str != null) {
            String lowerCase = str.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            if (lowerCase.equals("robolectric")) {
                gj7Var = new gj7();
            } else {
                gj7Var = null;
            }
        } else {
            gj7Var = null;
        }
        f42493a = gj7Var;
    }
}
