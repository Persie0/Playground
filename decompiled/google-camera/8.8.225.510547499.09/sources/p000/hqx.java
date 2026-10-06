package p000;

import android.graphics.Rect;
import android.util.SizeF;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hqx {

    /* JADX INFO: renamed from: a */
    public final kpl f29212a;

    /* JADX INFO: renamed from: b */
    public final Rect f29213b;

    /* JADX INFO: renamed from: c */
    public final SizeF f29214c;

    /* JADX INFO: renamed from: d */
    public final boolean f29215d;

    /* JADX INFO: renamed from: e */
    public final int f29216e;

    /* JADX INFO: renamed from: f */
    public final Rect f29217f;

    /* JADX INFO: renamed from: g */
    private final float f29218g;

    public hqx() {
    }

    public hqx(kpl kplVar, Rect rect, SizeF sizeF, boolean z, int i, float f, Rect rect2) {
        this.f29212a = kplVar;
        this.f29213b = rect;
        this.f29214c = sizeF;
        this.f29215d = z;
        this.f29216e = i;
        this.f29218g = f;
        this.f29217f = rect2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof hqx) {
            hqx hqxVar = (hqx) obj;
            if (this.f29212a.equals(hqxVar.f29212a) && this.f29213b.equals(hqxVar.f29213b) && this.f29214c.equals(hqxVar.f29214c) && this.f29215d == hqxVar.f29215d && this.f29216e == hqxVar.f29216e && Float.floatToIntBits(this.f29218g) == Float.floatToIntBits(hqxVar.f29218g) && this.f29217f.equals(hqxVar.f29217f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((this.f29212a.hashCode() ^ 1000003) * 1000003) ^ this.f29213b.hashCode()) * 1000003) ^ this.f29214c.hashCode()) * 1000003) ^ (true != this.f29215d ? 1237 : 1231)) * 1000003) ^ this.f29216e) * 1000003) ^ Float.floatToIntBits(this.f29218g)) * 1000003) ^ this.f29217f.hashCode();
    }

    public final String toString() {
        return "EisParams{metadata=" + String.valueOf(this.f29212a) + ", sensorInfoActiveArraySize=" + String.valueOf(this.f29213b) + ", sensorInfoPhysicalSize=" + String.valueOf(this.f29214c) + ", supportOis=" + this.f29215d + ", oisApiVersion=" + this.f29216e + ", digitalZoomRatio=" + this.f29218g + ", cropRegion=" + String.valueOf(this.f29217f) + "}";
    }
}
