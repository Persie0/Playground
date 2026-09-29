package p000;

import java.util.List;
import kotlin.collections.EmptyList;

/* JADX INFO: loaded from: classes2.dex */
public final class fx8 {

    /* JADX INFO: renamed from: a */
    public final List f39901a;

    /* JADX INFO: renamed from: b */
    public final boolean f39902b;

    public fx8(List list, boolean z) {
        this.f39901a = list;
        this.f39902b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fx8)) {
            return false;
        }
        fx8 fx8Var = (fx8) obj;
        return fa4.m11650l(this.f39901a, fx8Var.f39901a) && this.f39902b == fx8Var.f39902b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f39902b) + (this.f39901a.hashCode() * 31);
    }

    public final String toString() {
        return "SentenceListState(sentences=" + this.f39901a + ", isLoading=" + this.f39902b + ")";
    }

    public /* synthetic */ fx8(int i) {
        this(EmptyList.f47638a, true);
    }
}
