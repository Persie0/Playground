package p000;

import com.lingq.core.domain.model.library.Sort;
import com.lingq.core.domain.model.library.SortType;
import kotlin.Pair;

/* JADX INFO: loaded from: classes2.dex */
public final class sq8 extends yq8 {

    /* JADX INFO: renamed from: a */
    public final SortType f61265a;

    /* JADX INFO: renamed from: b */
    public final Sort f61266b;

    /* JADX INFO: renamed from: c */
    public final Pair f61267c;

    /* JADX INFO: renamed from: d */
    public final String f61268d;

    public sq8(SortType sortType, Sort sort, Pair pair, String str) {
        sortType.getClass();
        sort.getClass();
        pair.getClass();
        str.getClass();
        this.f61265a = sortType;
        this.f61266b = sort;
        this.f61267c = pair;
        this.f61268d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sq8)) {
            return false;
        }
        sq8 sq8Var = (sq8) obj;
        return this.f61265a == sq8Var.f61265a && this.f61266b == sq8Var.f61266b && fa4.m11650l(this.f61267c, sq8Var.f61267c) && fa4.m11650l(this.f61268d, sq8Var.f61268d);
    }

    public final int hashCode() {
        return this.f61268d.hashCode() + ((this.f61267c.hashCode() + ((this.f61266b.hashCode() + (this.f61265a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Filter(sortType=" + this.f61265a + ", sort=" + this.f61266b + ", levels=" + this.f61267c + ", libraryShelfType=" + this.f61268d + ")";
    }
}
