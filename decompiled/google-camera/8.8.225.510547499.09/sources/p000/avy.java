package p000;

import android.graphics.Rect;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class avy {

    /* JADX INFO: renamed from: a */
    public final int f2564a;

    /* JADX INFO: renamed from: b */
    public final int f2565b;

    /* JADX INFO: renamed from: c */
    private final int f2566c;

    /* JADX INFO: renamed from: d */
    private final int f2567d;

    public avy(Rect rect) {
        int i = rect.left;
        int i2 = rect.top;
        int i3 = rect.right;
        int i4 = rect.bottom;
        this.f2564a = i;
        this.f2565b = i2;
        this.f2566c = i3;
        this.f2567d = i4;
        if (i > i3) {
            throw new IllegalArgumentException("Left must be less than or equal to right, left: " + i + ", right: " + i3);
        }
        if (i2 <= i4) {
            return;
        }
        throw new IllegalArgumentException("top must be less than or equal to bottom, top: " + i2 + ", bottom: " + i4);
    }

    /* JADX INFO: renamed from: a */
    public final int m2065a() {
        return this.f2567d - this.f2565b;
    }

    /* JADX INFO: renamed from: b */
    public final int m2066b() {
        return this.f2566c - this.f2564a;
    }

    /* JADX INFO: renamed from: c */
    public final Rect m2067c() {
        return new Rect(this.f2564a, this.f2565b, this.f2566c, this.f2567d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!ooc.m18737c(getClass(), obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        avy avyVar = (avy) obj;
        return this.f2564a == avyVar.f2564a && this.f2565b == avyVar.f2565b && this.f2566c == avyVar.f2566c && this.f2567d == avyVar.f2567d;
    }

    public final int hashCode() {
        return (((((this.f2564a * 31) + this.f2565b) * 31) + this.f2566c) * 31) + this.f2567d;
    }

    public final String toString() {
        return avy.class.getSimpleName() + " { [" + this.f2564a + ',' + this.f2565b + ',' + this.f2566c + ',' + this.f2567d + "] }";
    }
}
