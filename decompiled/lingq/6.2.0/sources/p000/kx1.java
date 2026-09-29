package p000;

import android.os.Bundle;
import android.text.Spanned;

/* JADX INFO: loaded from: classes2.dex */
public abstract class kx1 {

    /* JADX INFO: renamed from: a */
    public static final String f48535a;

    /* JADX INFO: renamed from: b */
    public static final String f48536b;

    /* JADX INFO: renamed from: c */
    public static final String f48537c;

    /* JADX INFO: renamed from: d */
    public static final String f48538d;

    /* JADX INFO: renamed from: e */
    public static final String f48539e;

    static {
        String str = uma.f64080a;
        f48535a = Integer.toString(0, 36);
        f48536b = Integer.toString(1, 36);
        f48537c = Integer.toString(2, 36);
        f48538d = Integer.toString(3, 36);
        f48539e = Integer.toString(4, 36);
    }

    /* JADX INFO: renamed from: a */
    public static Bundle m15710a(Spanned spanned, Object obj, int i, Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putInt(f48535a, spanned.getSpanStart(obj));
        bundle2.putInt(f48536b, spanned.getSpanEnd(obj));
        bundle2.putInt(f48537c, spanned.getSpanFlags(obj));
        bundle2.putInt(f48538d, i);
        if (bundle != null) {
            bundle2.putBundle(f48539e, bundle);
        }
        return bundle2;
    }
}
