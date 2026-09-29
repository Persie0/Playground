package p000;

import android.graphics.Insets;
import android.view.WindowInsetsAnimation;
import android.view.animation.Interpolator;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class i5b {
    /* JADX INFO: renamed from: d */
    public static /* synthetic */ WindowInsetsAnimation.Bounds m13671d(Insets insets, Insets insets2) {
        return new WindowInsetsAnimation.Bounds(insets, insets2);
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ WindowInsetsAnimation m13672e(int i, Interpolator interpolator, long j) {
        return new WindowInsetsAnimation(i, interpolator, j);
    }

    /* JADX INFO: renamed from: f */
    public static /* bridge */ /* synthetic */ WindowInsetsAnimation m13673f(Object obj) {
        return (WindowInsetsAnimation) obj;
    }
}
