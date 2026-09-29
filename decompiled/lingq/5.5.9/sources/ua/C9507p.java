package ua;

import com.google.android.exoplayer2.InterfaceC2409f;
import com.google.common.collect.ImmutableList;
import ga.C5735r;
import java.util.Collections;
import java.util.List;
import p291o7.C8002l;
import p479xa.C10134c0;

/* JADX INFO: renamed from: ua.p */
/* JADX INFO: loaded from: classes.dex */
public final class C9507p implements InterfaceC2409f {

    /* JADX INFO: renamed from: c */
    public static final String f48925c = C10134c0.m19021F(0);

    /* JADX INFO: renamed from: d */
    public static final String f48926d = C10134c0.m19021F(1);

    /* JADX INFO: renamed from: e */
    public static final C8002l f48927e = new C8002l(17);

    /* JADX INFO: renamed from: a */
    public final C5735r f48928a;

    /* JADX INFO: renamed from: b */
    public final ImmutableList<Integer> f48929b;

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public C9507p(C5735r c5735r, List<Integer> list) {
        if (!list.isEmpty() && (((Integer) Collections.min(list)).intValue() < 0 || ((Integer) Collections.max(list)).intValue() >= c5735r.f34800a)) {
            throw new IndexOutOfBoundsException();
        }
        this.f48928a = c5735r;
        this.f48929b = ImmutableList.m9060Q(list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C9507p.class == obj.getClass()) {
            C9507p c9507p = (C9507p) obj;
            return this.f48928a.equals(c9507p.f48928a) && this.f48929b.equals(c9507p.f48929b);
        }
        return false;
    }

    public final int hashCode() {
        return (this.f48929b.hashCode() * 31) + this.f48928a.hashCode();
    }
}
