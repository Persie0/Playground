package p000;

import java.util.List;
import kotlin.collections.EmptyList;

/* JADX INFO: loaded from: classes2.dex */
public final class en4 {

    /* JADX INFO: renamed from: a */
    public final int f37560a;

    /* JADX INFO: renamed from: b */
    public final int f37561b;

    /* JADX INFO: renamed from: c */
    public final int f37562c;

    /* JADX INFO: renamed from: d */
    public final List f37563d;

    public /* synthetic */ en4(int i, int i2, int i3, List list, int i4) {
        this(i, (i4 & 2) != 0 ? -1 : i2, (i4 & 4) != 0 ? -1 : i3, (i4 & 8) != 0 ? EmptyList.f47638a : list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof en4)) {
            return false;
        }
        en4 en4Var = (en4) obj;
        return this.f37560a == en4Var.f37560a && this.f37561b == en4Var.f37561b && this.f37562c == en4Var.f37562c && fa4.m11650l(this.f37563d, en4Var.f37563d);
    }

    public final int hashCode() {
        return this.f37563d.hashCode() + wq1.m24106b(this.f37562c, wq1.m24106b(this.f37561b, Integer.hashCode(this.f37560a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sbM22994q = ux5.m22994q(this.f37560a, this.f37561b, "LanguageStatDetailInfo(title=", ", header=", ", description=");
        sbM22994q.append(this.f37562c);
        sbM22994q.append(", linksInText=");
        sbM22994q.append(this.f37563d);
        sbM22994q.append(")");
        return sbM22994q.toString();
    }

    public en4(int i, int i2, int i3, List list) {
        list.getClass();
        this.f37560a = i;
        this.f37561b = i2;
        this.f37562c = i3;
        this.f37563d = list;
    }
}
