package p000;

import android.graphics.Point;
import android.graphics.Rect;
import android.util.Size;
import java.io.Serializable;
import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kbc implements Serializable {

    /* JADX INFO: renamed from: a */
    public final int f35517a;

    /* JADX INFO: renamed from: b */
    public final int f35518b;

    /* JADX INFO: renamed from: c */
    private volatile kbc f35519c;

    public kbc(int i, int i2) {
        this.f35517a = i;
        this.f35518b = i2;
        this.f35519c = null;
    }

    private kbc(int i, int i2, kbc kbcVar) {
        this.f35517a = i;
        this.f35518b = i2;
        this.f35519c = kbcVar;
    }

    /* JADX INFO: renamed from: f */
    public static kbc m13901f(Point point) {
        return new kbc(point.x, point.y);
    }

    /* JADX INFO: renamed from: g */
    public static kbc m13902g(Rect rect) {
        return new kbc(rect.width(), rect.height());
    }

    /* JADX INFO: renamed from: h */
    public static kbc m13903h(int i, int i2) {
        return new kbc(i, i2);
    }

    /* JADX INFO: renamed from: a */
    public final float m13904a() {
        return this.f35517a / this.f35518b;
    }

    /* JADX INFO: renamed from: b */
    public final long m13905b() {
        return ((long) this.f35517a) * ((long) this.f35518b);
    }

    /* JADX INFO: renamed from: c */
    public final Size m13906c() {
        return new Size(this.f35517a, this.f35518b);
    }

    /* JADX INFO: renamed from: d */
    public final kbc m13907d() {
        return m13911k() ? this : m13910j();
    }

    /* JADX INFO: renamed from: e */
    public final kbc m13908e() {
        return this.f35518b >= this.f35517a ? this : m13910j();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            kbc kbcVar = (kbc) obj;
            if (this.f35517a == kbcVar.f35517a && this.f35518b == kbcVar.f35518b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f35517a), Integer.valueOf(this.f35518b)});
    }

    /* JADX INFO: renamed from: i */
    public final kbc m13909i(kay kayVar) {
        kay kayVar2 = kay.CLOCKWISE_0;
        switch (kayVar.ordinal()) {
            case 1:
            case 3:
                return m13910j();
            case 2:
            default:
                return this;
        }
    }

    /* JADX INFO: renamed from: j */
    public final kbc m13910j() {
        kbc kbcVar = this.f35519c;
        if (kbcVar != null) {
            return kbcVar;
        }
        kbc kbcVar2 = new kbc(this.f35518b, this.f35517a, this);
        this.f35519c = kbcVar2;
        return kbcVar2;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m13911k() {
        return this.f35517a >= this.f35518b;
    }

    public final String toString() {
        return this.f35517a + "x" + this.f35518b;
    }
}
