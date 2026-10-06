package p000;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bit {

    /* JADX INFO: renamed from: d */
    private static final Object f3444d = new Object();

    /* JADX INFO: renamed from: a */
    public final Context f3445a;

    /* JADX INFO: renamed from: b */
    public final String f3446b;

    /* JADX INFO: renamed from: c */
    public final Map f3447c;

    public bit(Drawable.Callback callback, String str, Map map) {
        if (TextUtils.isEmpty(str) || str.charAt(str.length() - 1) == '/') {
            this.f3446b = str;
        } else {
            this.f3446b = String.valueOf(str).concat("/");
        }
        if (callback instanceof View) {
            this.f3445a = ((View) callback).getContext();
            this.f3447c = map;
        } else {
            blx.m2680a("LottieDrawable must be inside of a view for images to work.");
            this.f3447c = new HashMap();
            this.f3445a = null;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m2512a(String str, Bitmap bitmap) {
        synchronized (f3444d) {
            ((bgw) this.f3447c.get(str)).f3225e = bitmap;
        }
    }
}
