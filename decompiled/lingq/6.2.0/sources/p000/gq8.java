package p000;

import java.util.List;
import kotlin.collections.EmptyList;

/* JADX INFO: loaded from: classes3.dex */
public final class gq8 {

    /* JADX INFO: renamed from: a */
    public final List f41193a;

    /* JADX INFO: renamed from: b */
    public final boolean f41194b;

    public gq8(List list, boolean z) {
        this.f41193a = list;
        this.f41194b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gq8)) {
            return false;
        }
        gq8 gq8Var = (gq8) obj;
        return fa4.m11650l(this.f41193a, gq8Var.f41193a) && this.f41194b == gq8Var.f41194b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f41194b) + (this.f41193a.hashCode() * 31);
    }

    public final String toString() {
        return "SearchFilterSelectionState(selectionItems=" + this.f41193a + ", isLoading=" + this.f41194b + ")";
    }

    public /* synthetic */ gq8() {
        this(EmptyList.f47638a, false);
    }
}
