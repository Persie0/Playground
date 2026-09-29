package p000;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class sc8 {

    /* JADX INFO: renamed from: a */
    public String f60683a;

    /* JADX INFO: renamed from: b */
    public List f60684b;

    /* JADX INFO: renamed from: c */
    public final List f60685c;

    /* JADX INFO: renamed from: d */
    public final boolean f60686d;

    public sc8(String str, List list, List list2) {
        this.f60683a = str;
        this.f60684b = list;
        this.f60685c = list2;
        this.f60686d = vk9.m23391n0(str) || list2.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sc8)) {
            return false;
        }
        sc8 sc8Var = (sc8) obj;
        return this.f60683a.equals(sc8Var.f60683a) && this.f60684b.equals(sc8Var.f60684b) && this.f60685c.equals(sc8Var.f60685c);
    }

    public final int hashCode() {
        return this.f60685c.hashCode() + ux5.m22979b(this.f60683a.hashCode() * 31, 31, this.f60684b);
    }

    public final String toString() {
        String str = this.f60683a;
        List list = this.f60684b;
        StringBuilder sb = new StringBuilder("ReviewClozeTest(text=");
        sb.append(str);
        sb.append(", fragments=");
        sb.append(list);
        sb.append(", incorrectAnswers=");
        return hn1.m13356f(sb, this.f60685c, ")");
    }
}
