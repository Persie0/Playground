package p021b0;

import android.support.v4.media.C0141b;
import androidx.activity.result.C0204c;

/* JADX INFO: renamed from: b0.c */
/* JADX INFO: loaded from: classes.dex */
public final class C1278c {

    /* JADX INFO: renamed from: a */
    public final float f7957a;

    /* JADX INFO: renamed from: b */
    public final float f7958b;

    /* JADX INFO: renamed from: c */
    public final float f7959c;

    /* JADX INFO: renamed from: d */
    public final float f7960d;

    public C1278c(float f3, float f10, float f11, float f12) {
        this.f7957a = f3;
        this.f7958b = f10;
        this.f7959c = f11;
        this.f7960d = f12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1278c)) {
            return false;
        }
        C1278c c1278c = (C1278c) obj;
        if (!(this.f7957a == c1278c.f7957a)) {
            return false;
        }
        if (!(this.f7958b == c1278c.f7958b)) {
            return false;
        }
        if (this.f7959c == c1278c.f7959c) {
            return (this.f7960d > c1278c.f7960d ? 1 : (this.f7960d == c1278c.f7960d ? 0 : -1)) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f7960d) + C0204c.m846e(this.f7959c, C0204c.m846e(this.f7958b, Float.hashCode(this.f7957a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RippleAlpha(draggedAlpha=");
        sb2.append(this.f7957a);
        sb2.append(", focusedAlpha=");
        sb2.append(this.f7958b);
        sb2.append(", hoveredAlpha=");
        sb2.append(this.f7959c);
        sb2.append(", pressedAlpha=");
        return C0141b.m612h(sb2, this.f7960d, ')');
    }
}
