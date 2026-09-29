package p000;

import java.util.List;
import kotlin.collections.EmptyList;

/* JADX INFO: loaded from: classes2.dex */
public final class ef2 {

    /* JADX INFO: renamed from: a */
    public final List f37163a;

    /* JADX INFO: renamed from: b */
    public final List f37164b;

    /* JADX INFO: renamed from: c */
    public final List f37165c;

    /* JADX INFO: renamed from: d */
    public final String f37166d;

    /* JADX INFO: renamed from: e */
    public final boolean f37167e;

    public ef2(List list, List list2, List list3, String str, boolean z, int i) {
        int i2 = i & 1;
        EmptyList emptyList = EmptyList.f47638a;
        list = i2 != 0 ? emptyList : list;
        list2 = (i & 2) != 0 ? emptyList : list2;
        list3 = (i & 4) != 0 ? emptyList : list3;
        str = (i & 8) != 0 ? null : str;
        list.getClass();
        list2.getClass();
        list3.getClass();
        this.f37163a = list;
        this.f37164b = list2;
        this.f37165c = list3;
        this.f37166d = str;
        this.f37167e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ef2)) {
            return false;
        }
        ef2 ef2Var = (ef2) obj;
        return this.f37163a.equals(ef2Var.f37163a) && this.f37164b.equals(ef2Var.f37164b) && this.f37165c.equals(ef2Var.f37165c) && fa4.m11650l(this.f37166d, ef2Var.f37166d) && this.f37167e == ef2Var.f37167e;
    }

    public final int hashCode() {
        int iM22979b = ux5.m22979b(ux5.m22979b(this.f37163a.hashCode() * 31, 31, this.f37164b), 31, this.f37165c);
        String str = this.f37166d;
        return g9a.m12428e((iM22979b + (str == null ? 0 : str.hashCode())) * 31, 31, this.f37167e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DictionariesManageUiState(activeDictionaries=");
        sb.append(this.f37163a);
        sb.append(", availableDictionaries=");
        sb.append(this.f37164b);
        sb.append(", locales=");
        wq1.m24130z(", selectedLocale=", this.f37166d, ", isLoading=", sb, this.f37165c);
        return AbstractC3393o1.m17740o(sb, this.f37167e, ", error=null)");
    }
}
