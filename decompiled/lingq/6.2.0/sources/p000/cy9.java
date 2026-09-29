package p000;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class cy9 {

    /* JADX INFO: renamed from: a */
    public final String f34712a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f34713b;

    public cy9(String str, ArrayList arrayList) {
        this.f34712a = str;
        this.f34713b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cy9)) {
            return false;
        }
        cy9 cy9Var = (cy9) obj;
        return this.f34712a.equals(cy9Var.f34712a) && this.f34713b.equals(cy9Var.f34713b);
    }

    public final int hashCode() {
        return this.f34713b.hashCode() + (this.f34712a.hashCode() * 31);
    }

    public final String toString() {
        return "TextWithTokens(text=" + this.f34712a + ", tokens=" + this.f34713b + ")";
    }
}
