package p000;

import android.media.Rating;

/* JADX INFO: loaded from: classes2.dex */
public abstract class uq7 {
    /* JADX INFO: renamed from: a */
    public static float m22858a(Rating rating) {
        return rating.getPercentRating();
    }

    /* JADX INFO: renamed from: b */
    public static int m22859b(Rating rating) {
        return rating.getRatingStyle();
    }

    /* JADX INFO: renamed from: c */
    public static float m22860c(Rating rating) {
        return rating.getStarRating();
    }

    /* JADX INFO: renamed from: d */
    public static boolean m22861d(Rating rating) {
        return rating.hasHeart();
    }

    /* JADX INFO: renamed from: e */
    public static boolean m22862e(Rating rating) {
        return rating.isRated();
    }

    /* JADX INFO: renamed from: f */
    public static boolean m22863f(Rating rating) {
        return rating.isThumbUp();
    }

    /* JADX INFO: renamed from: g */
    public static Rating m22864g(boolean z) {
        return Rating.newHeartRating(z);
    }

    /* JADX INFO: renamed from: h */
    public static Rating m22865h(float f) {
        return Rating.newPercentageRating(f);
    }

    /* JADX INFO: renamed from: i */
    public static Rating m22866i(int i, float f) {
        return Rating.newStarRating(i, f);
    }

    /* JADX INFO: renamed from: j */
    public static Rating m22867j(boolean z) {
        return Rating.newThumbRating(z);
    }

    /* JADX INFO: renamed from: k */
    public static Rating m22868k(int i) {
        return Rating.newUnratedRating(i);
    }
}
