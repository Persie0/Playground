package p000;

import android.graphics.Rect;
import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public abstract class awa {

    /* JADX INFO: renamed from: a */
    public static final r90 f7627a = new r90(Float.class, "translationAlpha", 13);

    /* JADX INFO: renamed from: b */
    public static final r90 f7628b = new r90(Rect.class, "clipBounds", 14);

    /* JADX INFO: renamed from: a */
    public static float m3100a(View view) {
        return view.getTransitionAlpha();
    }

    /* JADX INFO: renamed from: b */
    public static void m3101b(View view, int i, int i2, int i3, int i4) {
        view.setLeftTopRightBottom(i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: c */
    public static void m3102c(View view, float f) {
        view.setTransitionAlpha(f);
    }

    /* JADX INFO: renamed from: d */
    public static void m3103d(View view, int i) {
        view.setTransitionVisibility(i);
    }
}
