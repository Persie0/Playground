package p000;

import android.graphics.PointF;
import android.graphics.RectF;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class ddy {

    /* JADX INFO: renamed from: a */
    private final RectF f10615a;

    /* JADX INFO: renamed from: b */
    private final PointF f10616b;

    public ddy() {
    }

    public ddy(RectF rectF, PointF pointF) {
        this.f10615a = rectF;
        this.f10616b = pointF;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ddy) {
            ddy ddyVar = (ddy) obj;
            if (this.f10615a.equals(ddyVar.f10615a) && this.f10616b.equals(ddyVar.f10616b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f10615a.hashCode() ^ 1000003) * 1000003) ^ this.f10616b.hashCode();
    }

    public final String toString() {
        return "BoundingBox{displayBoundingBox=" + String.valueOf(this.f10615a) + ", sensorCoordinate=" + String.valueOf(this.f10616b) + "}";
    }
}
