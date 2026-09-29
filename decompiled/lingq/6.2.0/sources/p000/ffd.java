package p000;

import android.graphics.Color;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ffd {
    /* JADX INFO: renamed from: a */
    public static String m11815a(int i) {
        Object[] objArr = {Integer.valueOf(Color.red(i)), Integer.valueOf(Color.green(i)), Integer.valueOf(Color.blue(i)), Double.valueOf(((double) Color.alpha(i)) / 255.0d)};
        String str = uma.f64080a;
        return String.format(Locale.US, "rgba(%d,%d,%d,%.3f)", objArr);
    }
}
