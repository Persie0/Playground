package p000;

import java.util.List;

/* JADX INFO: renamed from: u2 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3633u2 {

    /* JADX INFO: renamed from: a */
    public final List f63259a;

    /* JADX INFO: renamed from: b */
    public final String f63260b;

    public C3633u2(List list, String str) {
        list.getClass();
        this.f63259a = list;
        this.f63260b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3633u2)) {
            return false;
        }
        C3633u2 c3633u2 = (C3633u2) obj;
        return fa4.m11650l(this.f63259a, c3633u2.f63259a) && fa4.m11650l(this.f63260b, c3633u2.f63260b);
    }

    public final int hashCode() {
        int iHashCode = this.f63259a.hashCode() * 31;
        String str = this.f63260b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "AccentUiState(accents=" + this.f63259a + ", selectedAccent=" + this.f63260b + ")";
    }
}
