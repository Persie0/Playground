package p000;

import com.google.common.collect.ImmutableList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class p8a {

    /* JADX INFO: renamed from: a */
    public final j8a f55768a;

    /* JADX INFO: renamed from: b */
    public final ImmutableList f55769b;

    static {
        uma.m22828w(0);
        uma.m22828w(1);
    }

    public p8a(j8a j8aVar, List list) {
        if (!list.isEmpty() && (((Integer) Collections.min(list)).intValue() < 0 || ((Integer) Collections.max(list)).intValue() >= j8aVar.f45214a)) {
            v63.m23128b();
            throw null;
        }
        this.f55768a = j8aVar;
        this.f55769b = ImmutableList.m6287r(list);
    }

    /* JADX INFO: renamed from: a */
    public final int m18977a() {
        return this.f55768a.f45216c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && p8a.class == obj.getClass()) {
            p8a p8aVar = (p8a) obj;
            if (this.f55768a.equals(p8aVar.f55768a) && this.f55769b.equals(p8aVar.f55769b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f55769b.hashCode() * 31) + this.f55768a.hashCode();
    }
}
