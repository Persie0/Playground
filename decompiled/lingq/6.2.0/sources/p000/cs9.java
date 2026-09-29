package p000;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class cs9 implements InterfaceC3691vn {

    /* JADX INFO: renamed from: b */
    public static final cs9 f34496b = new cs9(null);

    /* JADX INFO: renamed from: a */
    public final String f34497a;

    public /* synthetic */ cs9(String str) {
        this.f34497a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cs9) {
            return x74.m24360q(this.f34497a, ((cs9) obj).f34497a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f34497a});
    }
}
