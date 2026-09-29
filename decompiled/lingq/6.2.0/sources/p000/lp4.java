package p000;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class lp4 {

    /* JADX INFO: renamed from: a */
    public final List f49976a;

    /* JADX INFO: renamed from: b */
    public final String f49977b;

    public lp4(List list, String str) {
        list.getClass();
        str.getClass();
        this.f49976a = list;
        this.f49977b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lp4)) {
            return false;
        }
        lp4 lp4Var = (lp4) obj;
        return fa4.m11650l(this.f49976a, lp4Var.f49976a) && fa4.m11650l(this.f49977b, lp4Var.f49977b);
    }

    public final int hashCode() {
        return this.f49977b.hashCode() + (this.f49976a.hashCode() * 31);
    }

    public final String toString() {
        return "LanguagesListUiState(items=" + this.f49976a + ", selected=" + this.f49977b + ")";
    }
}
