package p264mi;

import androidx.activity.result.C0204c;
import dm.C5207g;
import java.util.List;
import p003a2.C0009a;

/* JADX INFO: renamed from: mi.b */
/* JADX INFO: loaded from: classes.dex */
public final class C7562b {

    /* JADX INFO: renamed from: a */
    public String f41676a;

    /* JADX INFO: renamed from: b */
    public List<C7561a> f41677b;

    /* JADX INFO: renamed from: c */
    public final List<String> f41678c;

    public C7562b(String str, List<C7561a> list, List<String> list2) {
        C5207g.m11111f(list, "fragments");
        C5207g.m11111f(list2, "incorrectAnswers");
        this.f41676a = str;
        this.f41677b = list;
        this.f41678c = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7562b)) {
            return false;
        }
        C7562b c7562b = (C7562b) obj;
        return C5207g.m11106a(this.f41676a, c7562b.f41676a) && C5207g.m11106a(this.f41677b, c7562b.f41677b) && C5207g.m11106a(this.f41678c, c7562b.f41678c);
    }

    public final int hashCode() {
        return this.f41678c.hashCode() + C0204c.m848g(this.f41677b, this.f41676a.hashCode() * 31, 31);
    }

    public final String toString() {
        String str = this.f41676a;
        List<C7561a> list = this.f41677b;
        StringBuilder sb2 = new StringBuilder("ReviewClozeTest(text=");
        sb2.append(str);
        sb2.append(", fragments=");
        sb2.append(list);
        sb2.append(", incorrectAnswers=");
        return C0009a.m24m(sb2, this.f41678c, ")");
    }
}
