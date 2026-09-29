package p072dd;

import android.content.res.Configuration;
import android.graphics.Typeface;
import android.os.Build;
import p338qd.C8573r0;

/* JADX INFO: renamed from: dd.f */
/* JADX INFO: loaded from: classes.dex */
public final class C5153f {
    /* JADX INFO: renamed from: a */
    public static Typeface m10937a(Configuration configuration, Typeface typeface) {
        if (Build.VERSION.SDK_INT < 31 || configuration.fontWeightAdjustment == Integer.MAX_VALUE || configuration.fontWeightAdjustment == 0 || typeface == null) {
            return null;
        }
        return Typeface.create(typeface, C8573r0.m16699T(configuration.fontWeightAdjustment + typeface.getWeight(), 1, 1000), typeface.isItalic());
    }
}
