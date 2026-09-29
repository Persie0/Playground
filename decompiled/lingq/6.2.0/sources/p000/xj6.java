package p000;

import com.lingq.core.domain.model.repo.NetworkErrorType;

/* JADX INFO: loaded from: classes.dex */
public final class xj6 implements ak6 {

    /* JADX INFO: renamed from: a */
    public final int f68289a;

    /* JADX INFO: renamed from: b */
    public final NetworkErrorType f68290b;

    /* JADX INFO: renamed from: c */
    public final String f68291c;

    public xj6(int i, NetworkErrorType networkErrorType, String str) {
        networkErrorType.getClass();
        this.f68289a = i;
        this.f68290b = networkErrorType;
        this.f68291c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xj6)) {
            return false;
        }
        xj6 xj6Var = (xj6) obj;
        return this.f68289a == xj6Var.f68289a && this.f68290b == xj6Var.f68290b && fa4.m11650l(this.f68291c, xj6Var.f68291c);
    }

    public final int hashCode() {
        int iHashCode = (this.f68290b.hashCode() + (Integer.hashCode(this.f68289a) * 31)) * 31;
        String str = this.f68291c;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Http(code=");
        sb.append(this.f68289a);
        sb.append(", type=");
        sb.append(this.f68290b);
        sb.append(", body=");
        return AbstractC3393o1.m17738m(sb, this.f68291c, ")");
    }
}
