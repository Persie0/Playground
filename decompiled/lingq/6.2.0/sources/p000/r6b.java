package p000;

import android.graphics.Rect;

/* JADX INFO: loaded from: classes.dex */
public final class r6b {

    /* JADX INFO: renamed from: a */
    public final hh0 f58809a;

    /* JADX INFO: renamed from: b */
    public final float f58810b;

    public r6b(Rect rect, float f) {
        this.f58809a = new hh0(rect);
        this.f58810b = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!r6b.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        r6b r6bVar = (r6b) obj;
        return fa4.m11650l(this.f58809a, r6bVar.f58809a) && this.f58810b == r6bVar.f58810b;
    }

    public final int hashCode() {
        return Float.hashCode(this.f58810b) + (this.f58809a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WindowMetrics(_bounds=");
        sb.append(this.f58809a);
        sb.append(", density=");
        return AbstractC3393o1.m17737l(sb, this.f58810b, ')');
    }

    public r6b(hh0 hh0Var, float f) {
        this.f58809a = hh0Var;
        this.f58810b = f;
    }
}
