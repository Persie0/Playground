package p000;

import android.graphics.Rect;
import com.google.android.apps.camera.legacy.app.activity.main.kuX.PMZiHihxLGEy;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class cdl {

    /* JADX INFO: renamed from: a */
    public final int f5310a;

    /* JADX INFO: renamed from: b */
    public final Rect f5311b;

    /* JADX INFO: renamed from: c */
    public final int f5312c;

    public cdl(int i, Rect rect, int i2) {
        this.f5310a = i;
        if (rect == null) {
            throw new NullPointerException("Null bounds");
        }
        this.f5311b = rect;
        this.f5312c = i2;
    }

    /* JADX INFO: renamed from: a */
    public static cdl m3495a(int i, Rect rect, int i2) {
        return new cdl(i, rect, i2);
    }

    /* JADX INFO: renamed from: b */
    public static cdl m3496b(Rect rect) {
        return m3495a(-2, rect, 2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cdl) {
            cdl cdlVar = (cdl) obj;
            if (this.f5310a == cdlVar.f5310a && this.f5311b.equals(cdlVar.f5311b) && this.f5312c == cdlVar.f5312c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((this.f5310a ^ 1000003) * 1000003) ^ this.f5311b.hashCode();
        int i = this.f5312c;
        bzq.m3273m(i);
        return (iHashCode * 1000003) ^ i;
    }

    public final String toString() {
        return "SmartAfRegion{id=" + this.f5310a + PMZiHihxLGEy.ARZYhQkX + this.f5311b.toString() + ", afRoiType=" + bzq.m3272l(this.f5312c) + "}";
    }

    public cdl() {
    }
}
