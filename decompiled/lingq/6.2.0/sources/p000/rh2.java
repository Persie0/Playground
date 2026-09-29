package p000;

import android.os.Build;
import android.view.DisplayCutout;

/* JADX INFO: loaded from: classes.dex */
public final class rh2 {

    /* JADX INFO: renamed from: a */
    public final DisplayCutout f59262a;

    public rh2(DisplayCutout displayCutout) {
        this.f59262a = displayCutout;
    }

    /* JADX INFO: renamed from: a */
    public final l64 m20660a() {
        return Build.VERSION.SDK_INT >= 30 ? l64.m15831d(qh2.m19968b(this.f59262a)) : l64.f49115e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || rh2.class != obj.getClass()) {
            return false;
        }
        return this.f59262a.equals(((rh2) obj).f59262a);
    }

    public final int hashCode() {
        return this.f59262a.hashCode();
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.f59262a + "}";
    }
}
