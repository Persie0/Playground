package p000;

import android.graphics.Rect;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class awy {

    /* JADX INFO: renamed from: a */
    public final avy f2622a;

    /* JADX INFO: renamed from: b */
    private final ago f2623b;

    public awy(Rect rect, ago agoVar) {
        this.f2622a = new avy(rect);
        this.f2623b = agoVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!ooc.m18737c(getClass(), obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        awy awyVar = (awy) obj;
        return ooc.m18737c(this.f2622a, awyVar.f2622a) && ooc.m18737c(this.f2623b, awyVar.f2623b);
    }

    public final int hashCode() {
        return (this.f2622a.hashCode() * 31) + this.f2623b.hashCode();
    }

    public final String toString() {
        return "WindowMetrics( bounds=" + this.f2622a + ", windowInsetsCompat=" + this.f2623b + ')';
    }
}
