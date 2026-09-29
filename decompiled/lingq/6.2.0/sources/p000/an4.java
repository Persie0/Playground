package p000;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class an4 {

    /* JADX INFO: renamed from: a */
    public final List f876a;

    /* JADX INFO: renamed from: b */
    public final qm4 f877b;

    public an4(List list, qm4 qm4Var) {
        list.getClass();
        qm4Var.getClass();
        this.f876a = list;
        this.f877b = qm4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof an4)) {
            return false;
        }
        an4 an4Var = (an4) obj;
        return fa4.m11650l(this.f876a, an4Var.f876a) && fa4.m11650l(this.f877b, an4Var.f877b);
    }

    public final int hashCode() {
        return this.f877b.hashCode() + (this.f876a.hashCode() * 31);
    }

    public final String toString() {
        return "LanguageSelectorScreenState(languageItems=" + this.f876a + ", loadingState=" + this.f877b + ")";
    }
}
