package p000;

import android.graphics.PointF;
import android.graphics.RectF;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fun {

    /* JADX INFO: renamed from: a */
    public final PointF f23592a;

    /* JADX INFO: renamed from: b */
    public final RectF f23593b;

    /* JADX INFO: renamed from: c */
    public final int f23594c;

    public fun() {
    }

    public fun(PointF pointF, RectF rectF, int i) {
        this.f23592a = pointF;
        this.f23593b = rectF;
        this.f23594c = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof fun)) {
            return false;
        }
        fun funVar = (fun) obj;
        if (this.f23592a.equals(funVar.f23592a) && this.f23593b.equals(funVar.f23593b)) {
            int i = this.f23594c;
            int i2 = funVar.f23594c;
            if (i == 0) {
                throw null;
            }
            if (i == i2) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((this.f23592a.hashCode() ^ 1000003) * 1000003) ^ this.f23593b.hashCode();
        int i = this.f23594c;
        bzq.m3273m(i);
        return (iHashCode * 1000003) ^ i;
    }

    public final String toString() {
        return "AfRoi{normalizedCenterPoint=" + String.valueOf(this.f23592a) + ", normalizedRoi=" + String.valueOf(this.f23593b) + ", afRoiType=" + bzq.m3272l(this.f23594c) + "}";
    }
}
