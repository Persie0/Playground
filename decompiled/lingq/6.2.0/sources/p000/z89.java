package p000;

import androidx.compose.animation.core.C0059a;

/* JADX INFO: loaded from: classes.dex */
public final class z89 {

    /* JADX INFO: renamed from: a */
    public final C0059a f71094a;

    /* JADX INFO: renamed from: b */
    public long f71095b;

    public z89(C0059a c0059a, long j) {
        this.f71094a = c0059a;
        this.f71095b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof z89) {
            z89 z89Var = (z89) obj;
            if (this.f71094a == z89Var.f71094a && n84.m17279a(this.f71095b, z89Var.f71095b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f71095b) + (this.f71094a.hashCode() * 31);
    }

    public final String toString() {
        return "AnimData(anim=" + this.f71094a + ", startSize=" + ((Object) n84.m17280b(this.f71095b)) + ')';
    }
}
