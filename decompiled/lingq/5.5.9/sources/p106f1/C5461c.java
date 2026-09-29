package p106f1;

import androidx.activity.result.C0204c;

/* JADX INFO: renamed from: f1.c */
/* JADX INFO: loaded from: classes.dex */
public final class C5461c {

    /* JADX INFO: renamed from: a */
    public final float f34028a;

    /* JADX INFO: renamed from: b */
    public final float f34029b;

    /* JADX INFO: renamed from: c */
    public final long f34030c;

    public C5461c(float f3, float f10, long j10) {
        this.f34028a = f3;
        this.f34029b = f10;
        this.f34030c = j10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C5461c)) {
            return false;
        }
        C5461c c5461c = (C5461c) obj;
        if (c5461c.f34028a == this.f34028a) {
            return ((c5461c.f34029b > this.f34029b ? 1 : (c5461c.f34029b == this.f34029b ? 0 : -1)) == 0) && c5461c.f34030c == this.f34030c;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f34030c) + C0204c.m846e(this.f34029b, Float.hashCode(this.f34028a) * 31, 31);
    }

    public final String toString() {
        return "RotaryScrollEvent(verticalScrollPixels=" + this.f34028a + ",horizontalScrollPixels=" + this.f34029b + ",uptimeMillis=" + this.f34030c + ')';
    }
}
