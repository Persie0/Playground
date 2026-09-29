package p000;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class gza {

    /* JADX INFO: renamed from: a */
    public final List f41577a;

    /* JADX INFO: renamed from: b */
    public final boolean f41578b;

    /* JADX INFO: renamed from: c */
    public final boolean f41579c;

    public gza(List list, boolean z, boolean z2) {
        list.getClass();
        this.f41577a = list;
        this.f41578b = z;
        this.f41579c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gza)) {
            return false;
        }
        gza gzaVar = (gza) obj;
        return fa4.m11650l(this.f41577a, gzaVar.f41577a) && this.f41578b == gzaVar.f41578b && this.f41579c == gzaVar.f41579c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f41579c) + g9a.m12428e(this.f41577a.hashCode() * 31, 31, this.f41578b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VocabularyFilterSelectionState(selectionItems=");
        sb.append(this.f41577a);
        sb.append(", showClear=");
        sb.append(this.f41578b);
        sb.append(", isLoading=");
        return AbstractC3393o1.m17740o(sb, this.f41579c, ")");
    }
}
