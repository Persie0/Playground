package p000;

import com.lingq.core.settings.ViewKeys;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class sz7 {

    /* JADX INFO: renamed from: a */
    public final List f61674a;

    /* JADX INFO: renamed from: b */
    public final ViewKeys f61675b;

    /* JADX INFO: renamed from: c */
    public final List f61676c;

    /* JADX INFO: renamed from: d */
    public final Integer f61677d;

    public sz7(List list, ViewKeys viewKeys, List list2, Integer num) {
        list.getClass();
        list2.getClass();
        this.f61674a = list;
        this.f61675b = viewKeys;
        this.f61676c = list2;
        this.f61677d = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sz7)) {
            return false;
        }
        sz7 sz7Var = (sz7) obj;
        return fa4.m11650l(this.f61674a, sz7Var.f61674a) && this.f61675b == sz7Var.f61675b && fa4.m11650l(this.f61676c, sz7Var.f61676c) && fa4.m11650l(this.f61677d, sz7Var.f61677d);
    }

    public final int hashCode() {
        int iHashCode = this.f61674a.hashCode() * 31;
        ViewKeys viewKeys = this.f61675b;
        int iM22979b = ux5.m22979b((iHashCode + (viewKeys == null ? 0 : viewKeys.hashCode())) * 31, 31, this.f61676c);
        Integer num = this.f61677d;
        return iM22979b + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        return "ReaderSettingsState(settings=" + this.f61674a + ", activeSelectionKey=" + this.f61675b + ", selectionItems=" + this.f61676c + ", selectionTitle=" + this.f61677d + ")";
    }
}
