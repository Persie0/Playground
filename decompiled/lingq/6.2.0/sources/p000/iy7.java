package p000;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;

/* JADX INFO: loaded from: classes3.dex */
public final class iy7 {

    /* JADX INFO: renamed from: a */
    public final xz7 f44779a;

    /* JADX INFO: renamed from: b */
    public final int f44780b;

    /* JADX INFO: renamed from: c */
    public Map f44781c;

    /* JADX INFO: renamed from: d */
    public List f44782d;

    public iy7(xz7 xz7Var, int i) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f44779a = xz7Var;
        this.f44780b = i;
        this.f44781c = linkedHashMap;
        this.f44782d = EmptyList.f47638a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iy7)) {
            return false;
        }
        iy7 iy7Var = (iy7) obj;
        return fa4.m11650l(this.f44779a, iy7Var.f44779a) && this.f44780b == iy7Var.f44780b && fa4.m11650l(this.f44781c, iy7Var.f44781c) && fa4.m11650l(this.f44782d, iy7Var.f44782d);
    }

    public final int hashCode() {
        return this.f44782d.hashCode() + e65.m10869a(wq1.m24106b(this.f44780b, this.f44779a.hashCode() * 31, 31), 31, this.f44781c);
    }

    public final String toString() {
        return "ReaderPhrase(token=" + this.f44779a + ", index=" + this.f44780b + ", childrenTokens=" + this.f44781c + ", orderedTokens=" + this.f44782d + ")";
    }
}
