package p000;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class tx4 {

    /* JADX INFO: renamed from: a */
    public final List f63052a;

    /* JADX INFO: renamed from: b */
    public final boolean f63053b;

    /* JADX INFO: renamed from: c */
    public final String f63054c;

    /* JADX INFO: renamed from: d */
    public final boolean f63055d;

    /* JADX INFO: renamed from: e */
    public final boolean f63056e;

    public tx4(List list, boolean z, String str, boolean z2, boolean z3) {
        list.getClass();
        str.getClass();
        this.f63052a = list;
        this.f63053b = z;
        this.f63054c = str;
        this.f63055d = z2;
        this.f63056e = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tx4)) {
            return false;
        }
        tx4 tx4Var = (tx4) obj;
        return fa4.m11650l(this.f63052a, tx4Var.f63052a) && this.f63053b == tx4Var.f63053b && fa4.m11650l(this.f63054c, tx4Var.f63054c) && this.f63055d == tx4Var.f63055d && this.f63056e == tx4Var.f63056e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f63056e) + g9a.m12428e(ux5.m22980c(g9a.m12428e(this.f63052a.hashCode() * 31, 31, this.f63053b), this.f63054c, 31), 31, this.f63055d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LessonBuildInputs(sentences=");
        sb.append(this.f63052a);
        sb.append(", isSentenceMode=");
        sb.append(this.f63053b);
        sb.append(", scriptPreference=");
        ux5.m22976C(this.f63054c, ", showSpaces=", ", showSentenceTranslation=", sb, this.f63055d);
        return AbstractC3393o1.m17740o(sb, this.f63056e, ")");
    }
}
