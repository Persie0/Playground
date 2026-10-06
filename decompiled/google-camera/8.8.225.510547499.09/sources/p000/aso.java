package p000;

import android.content.Context;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class aso {
    /* JADX INFO: renamed from: a */
    static boolean m1966a(View view) {
        return view.isAttachedToWindow();
    }

    /* JADX INFO: renamed from: b */
    public static Interpolator m1967b(Context context, int i) {
        Interpolator interpolatorLoadInterpolator = AnimationUtils.loadInterpolator(context, i);
        abe.m87b(interpolatorLoadInterpolator, "Failed to parse interpolator, no start tag found");
        return interpolatorLoadInterpolator;
    }
}
