package p000;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class le2 {

    /* JADX INFO: renamed from: a */
    public final List f49540a;

    /* JADX INFO: renamed from: b */
    public final boolean f49541b;

    /* JADX INFO: renamed from: c */
    public final boolean f49542c;

    public le2(List list, boolean z, boolean z2) {
        list.getClass();
        this.f49540a = list;
        this.f49541b = z;
        this.f49542c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof le2)) {
            return false;
        }
        le2 le2Var = (le2) obj;
        return fa4.m11650l(this.f49540a, le2Var.f49540a) && this.f49541b == le2Var.f49541b && this.f49542c == le2Var.f49542c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f49542c) + g9a.m12428e(this.f49540a.hashCode() * 31, 31, this.f49541b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DictionariesLocaleUiState(locales=");
        sb.append(this.f49540a);
        sb.append(", isLoading=");
        sb.append(this.f49541b);
        sb.append(", dismiss=");
        return AbstractC3393o1.m17740o(sb, this.f49542c, ")");
    }
}
