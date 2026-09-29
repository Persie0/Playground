package p000;

import java.util.List;
import kotlin.collections.EmptyList;

/* JADX INFO: loaded from: classes2.dex */
public final class xu8 {

    /* JADX INFO: renamed from: a */
    public final Integer f68805a;

    /* JADX INFO: renamed from: b */
    public final List f68806b;

    /* JADX INFO: renamed from: c */
    public final boolean f68807c;

    /* JADX INFO: renamed from: d */
    public final boolean f68808d;

    public xu8(Integer num, List list, boolean z, int i) {
        num = (i & 1) != 0 ? null : num;
        list = (i & 2) != 0 ? EmptyList.f47638a : list;
        boolean z2 = (i & 4) == 0;
        z = (i & 8) != 0 ? true : z;
        list.getClass();
        this.f68805a = num;
        this.f68806b = list;
        this.f68807c = z2;
        this.f68808d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xu8)) {
            return false;
        }
        xu8 xu8Var = (xu8) obj;
        return fa4.m11650l(this.f68805a, xu8Var.f68805a) && this.f68806b.equals(xu8Var.f68806b) && this.f68807c == xu8Var.f68807c && this.f68808d == xu8Var.f68808d;
    }

    public final int hashCode() {
        Integer num = this.f68805a;
        return Boolean.hashCode(this.f68808d) + g9a.m12428e(ux5.m22979b((num == null ? 0 : num.hashCode()) * 31, 31, this.f68806b), 31, this.f68807c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SelectionBottomSheetState(title=");
        sb.append(this.f68805a);
        sb.append(", items=");
        sb.append(this.f68806b);
        sb.append(", visible=");
        return e65.m10875g(sb, this.f68807c, ", enabled=", this.f68808d, ")");
    }
}
