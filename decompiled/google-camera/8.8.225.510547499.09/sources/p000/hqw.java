package p000;

import android.graphics.Rect;
import android.util.SizeF;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hqw {

    /* JADX INFO: renamed from: a */
    public final long f29203a;

    /* JADX INFO: renamed from: b */
    public final long f29204b;

    /* JADX INFO: renamed from: c */
    public final long f29205c;

    /* JADX INFO: renamed from: d */
    public final long f29206d;

    /* JADX INFO: renamed from: e */
    public final float f29207e;

    /* JADX INFO: renamed from: f */
    public final float f29208f;

    /* JADX INFO: renamed from: g */
    public final Rect f29209g;

    /* JADX INFO: renamed from: h */
    public final Rect f29210h;

    /* JADX INFO: renamed from: i */
    private final SizeF f29211i;

    public hqw() {
    }

    public hqw(long j, long j2, long j3, long j4, float f, Rect rect, Rect rect2, SizeF sizeF) {
        this.f29203a = j;
        this.f29204b = j2;
        this.f29205c = j3;
        this.f29206d = j4;
        this.f29207e = 1.0f;
        this.f29208f = f;
        this.f29209g = rect;
        this.f29210h = rect2;
        this.f29211i = sizeF;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof hqw) {
            hqw hqwVar = (hqw) obj;
            if (this.f29203a == hqwVar.f29203a && this.f29204b == hqwVar.f29204b && this.f29205c == hqwVar.f29205c && this.f29206d == hqwVar.f29206d && Float.floatToIntBits(this.f29207e) == Float.floatToIntBits(hqwVar.f29207e) && Float.floatToIntBits(this.f29208f) == Float.floatToIntBits(hqwVar.f29208f) && this.f29209g.equals(hqwVar.f29209g) && this.f29210h.equals(hqwVar.f29210h) && this.f29211i.equals(hqwVar.f29211i)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f29203a;
        long j2 = this.f29204b;
        long j3 = this.f29205c;
        long j4 = this.f29206d;
        return ((((((((((((((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ ((int) (j4 ^ (j4 >>> 32)))) * 1000003) ^ Float.floatToIntBits(this.f29207e)) * 1000003) ^ Float.floatToIntBits(this.f29208f)) * 1000003) ^ this.f29209g.hashCode()) * 1000003) ^ this.f29210h.hashCode()) * 1000003) ^ this.f29211i.hashCode();
    }

    public final String toString() {
        return "frameTimestampNs=" + this.f29203a + ", exposureTimeNs=" + this.f29204b + ", oisTimestampNs=" + this.f29205c + ", rollingShutterTimeNs=" + this.f29206d + ", digitalZoomRatio=" + this.f29207e + ", fieldOfView=" + this.f29208f + ", fullImageSize=" + this.f29209g + ", sensorSize=" + this.f29211i;
    }
}
