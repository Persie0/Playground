package p000;

import com.google.common.collect.ImmutableList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class a9a {

    /* JADX INFO: renamed from: b */
    public static final a9a f388b = new a9a(ImmutableList.m6289v());

    /* JADX INFO: renamed from: a */
    public final ImmutableList f389a;

    static {
        uma.m22828w(0);
    }

    public a9a(List list) {
        this.f389a = ImmutableList.m6287r(list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public final boolean m190a(int i) {
        int i2 = 0;
        while (true) {
            ImmutableList immutableList = this.f389a;
            if (i2 >= immutableList.size()) {
                return false;
            }
            z8a z8aVar = (z8a) immutableList.get(i2);
            if (z8aVar.m25495e() && z8aVar.m25494d() == i) {
                return true;
            }
            i2++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a9a.class != obj.getClass()) {
            return false;
        }
        return this.f389a.equals(((a9a) obj).f389a);
    }

    public final int hashCode() {
        return this.f389a.hashCode();
    }
}
