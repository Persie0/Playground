package p265mj;

import dm.C5207g;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;
import p003a2.C0009a;

/* JADX INFO: renamed from: mj.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C7568b {

    /* JADX INFO: renamed from: a */
    public final C7570d f41710a;

    /* JADX INFO: renamed from: b */
    public final int f41711b;

    /* JADX INFO: renamed from: c */
    public Map<String, C7570d> f41712c;

    /* JADX INFO: renamed from: d */
    public List<C7570d> f41713d;

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public C7568b() {
        throw null;
    }

    public C7568b(C7570d c7570d, int i10) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        EmptyList emptyList = EmptyList.f38032a;
        C5207g.m11111f(emptyList, "orderedTokens");
        this.f41710a = c7570d;
        this.f41711b = i10;
        this.f41712c = linkedHashMap;
        this.f41713d = emptyList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7568b)) {
            return false;
        }
        C7568b c7568b = (C7568b) obj;
        return C5207g.m11106a(this.f41710a, c7568b.f41710a) && this.f41711b == c7568b.f41711b && C5207g.m11106a(this.f41712c, c7568b.f41712c) && C5207g.m11106a(this.f41713d, c7568b.f41713d);
    }

    public final int hashCode() {
        return this.f41713d.hashCode() + ((this.f41712c.hashCode() + C0009a.m16d(this.f41711b, this.f41710a.hashCode() * 31, 31)) * 31);
    }

    public final String toString() {
        return "LessonPhrase(token=" + this.f41710a + ", index=" + this.f41711b + ", childrenTokens=" + this.f41712c + ", orderedTokens=" + this.f41713d + ")";
    }
}
