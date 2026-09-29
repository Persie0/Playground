package p000;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class al4 {

    /* JADX INFO: renamed from: a */
    public final String f801a;

    /* JADX INFO: renamed from: b */
    public final String f802b;

    static {
        uma.m22828w(0);
        uma.m22828w(1);
    }

    public al4(String str, String str2) {
        this.f801a = uma.m22798C(str);
        this.f802b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && al4.class == obj.getClass()) {
            al4 al4Var = (al4) obj;
            if (Objects.equals(this.f801a, al4Var.f801a) && Objects.equals(this.f802b, al4Var.f802b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f802b.hashCode() * 31;
        String str = this.f801a;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }
}
