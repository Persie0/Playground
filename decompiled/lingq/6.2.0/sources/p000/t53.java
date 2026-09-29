package p000;

import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes.dex */
public final class t53 {

    /* JADX INFO: renamed from: a */
    public final CountDownLatch f61874a;

    /* JADX INFO: renamed from: b */
    public np1 f61875b = null;

    public t53(CountDownLatch countDownLatch) {
        this.f61874a = countDownLatch;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t53)) {
            return false;
        }
        t53 t53Var = (t53) obj;
        return this.f61874a.equals(t53Var.f61874a) && fa4.m11650l(this.f61875b, t53Var.f61875b);
    }

    public final int hashCode() {
        int iHashCode = this.f61874a.hashCode() * 31;
        np1 np1Var = this.f61875b;
        return iHashCode + (np1Var == null ? 0 : np1Var.hashCode());
    }

    public final String toString() {
        return "Dependency(latch=" + this.f61874a + ", subscriber=" + this.f61875b + ')';
    }
}
