package p471x2;

import android.graphics.Rect;
import android.view.DisplayCutout;
import androidx.compose.p017ui.platform.C0653p1;
import java.util.List;
import p007a6.C0024c;
import p446w2.C9804b;

/* JADX INFO: renamed from: x2.d */
/* JADX INFO: loaded from: classes.dex */
public final class C10032d {

    /* JADX INFO: renamed from: a */
    public final DisplayCutout f51026a;

    /* JADX INFO: renamed from: x2.d$a */
    public static class a {
        /* JADX INFO: renamed from: a */
        public static DisplayCutout m18787a(Rect rect, List<Rect> list) {
            C0024c.m75D();
            return C0653p1.m2438l(rect, list);
        }

        /* JADX INFO: renamed from: b */
        public static List<Rect> m18788b(DisplayCutout displayCutout) {
            return displayCutout.getBoundingRects();
        }

        /* JADX INFO: renamed from: c */
        public static int m18789c(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetBottom();
        }

        /* JADX INFO: renamed from: d */
        public static int m18790d(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetLeft();
        }

        /* JADX INFO: renamed from: e */
        public static int m18791e(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetRight();
        }

        /* JADX INFO: renamed from: f */
        public static int m18792f(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetTop();
        }
    }

    public C10032d(DisplayCutout displayCutout) {
        this.f51026a = displayCutout;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C10032d.class == obj.getClass()) {
            return C9804b.m18286a(this.f51026a, ((C10032d) obj).f51026a);
        }
        return false;
    }

    public final int hashCode() {
        DisplayCutout displayCutout = this.f51026a;
        if (displayCutout == null) {
            return 0;
        }
        return displayCutout.hashCode();
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.f51026a + "}";
    }
}
