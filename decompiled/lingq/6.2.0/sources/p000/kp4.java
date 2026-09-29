package p000;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class kp4 {

    /* JADX INFO: renamed from: a */
    public final String f48281a;

    /* JADX INFO: renamed from: b */
    public final List f48282b;

    public kp4(String str, List list) {
        str.getClass();
        this.f48281a = str;
        this.f48282b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kp4)) {
            return false;
        }
        kp4 kp4Var = (kp4) obj;
        return fa4.m11650l(this.f48281a, kp4Var.f48281a) && this.f48282b.equals(kp4Var.f48282b);
    }

    public final int hashCode() {
        return this.f48282b.hashCode() + (this.f48281a.hashCode() * 31);
    }

    public final String toString() {
        return "LanguageTags(code=" + this.f48281a + ", tags=" + this.f48282b + ")";
    }
}
