package p000;

import java.util.Arrays;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kgx {

    /* JADX INFO: renamed from: a */
    public final Set f35992a;

    /* JADX INFO: renamed from: b */
    public final Set f35993b;

    /* JADX INFO: renamed from: c */
    public final Set f35994c;

    /* JADX INFO: renamed from: d */
    private final int f35995d;

    public kgx(Set set, Set set2, Set set3) {
        int i;
        this.f35992a = set;
        this.f35993b = set2;
        this.f35994c = set3;
        synchronized (kiu.class) {
            i = kiu.f36222e;
            kiu.f36222e = i + 1;
        }
        this.f35995d = i;
    }

    /* JADX INFO: renamed from: a */
    public final Set m14227a() {
        return mxk.m17134F(this.f35994c);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof kgx)) {
            return false;
        }
        kgx kgxVar = (kgx) obj;
        return mpw.m16768g(this.f35992a, kgxVar.f35992a) && mpw.m16768g(this.f35994c, kgxVar.f35994c) && mpw.m16768g(this.f35993b, kgxVar.f35993b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f35992a, this.f35993b, this.f35994c});
    }

    public final String toString() {
        return "FrameRequest-" + this.f35995d;
    }
}
