package p000;

import java.util.List;
import kotlin.collections.EmptyList;

/* JADX INFO: loaded from: classes3.dex */
public final class in5 {

    /* JADX INFO: renamed from: a */
    public final String f44304a;

    /* JADX INFO: renamed from: b */
    public final List f44305b;

    /* JADX INFO: renamed from: c */
    public final List f44306c;

    /* JADX INFO: renamed from: d */
    public final kn5 f44307d;

    public in5(String str, List list, List list2, kn5 kn5Var) {
        this.f44304a = str;
        this.f44305b = list;
        this.f44306c = list2;
        this.f44307d = kn5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof in5)) {
            return false;
        }
        in5 in5Var = (in5) obj;
        return fa4.m11650l(this.f44304a, in5Var.f44304a) && fa4.m11650l(this.f44305b, in5Var.f44305b) && fa4.m11650l(this.f44306c, in5Var.f44306c) && fa4.m11650l(this.f44307d, in5Var.f44307d);
    }

    public final int hashCode() {
        int iM22979b = ux5.m22979b(ux5.m22979b(this.f44304a.hashCode() * 31, 31, this.f44305b), 31, this.f44306c);
        kn5 kn5Var = this.f44307d;
        return iM22979b + (kn5Var == null ? 0 : kn5Var.hashCode());
    }

    public final String toString() {
        return "LynxCoachHighlights(tokenizedText=" + this.f44304a + ", highlights=" + this.f44305b + ", phraseHighlights=" + this.f44306c + ", textStyle=" + this.f44307d + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ in5(kn5 kn5Var) {
        EmptyList emptyList = EmptyList.f47638a;
        this("", emptyList, emptyList, kn5Var);
    }
}
