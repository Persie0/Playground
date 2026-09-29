package p000;

import java.util.Currency;

/* JADX INFO: loaded from: classes2.dex */
public final class j24 {

    /* JADX INFO: renamed from: a */
    public final String f44939a;

    /* JADX INFO: renamed from: b */
    public final double f44940b;

    /* JADX INFO: renamed from: c */
    public final Currency f44941c;

    public j24(String str, double d, Currency currency) {
        str.getClass();
        currency.getClass();
        this.f44939a = str;
        this.f44940b = d;
        this.f44941c = currency;
    }

    /* JADX INFO: renamed from: a */
    public final double m14272a() {
        return this.f44940b;
    }

    /* JADX INFO: renamed from: b */
    public final Currency m14273b() {
        return this.f44941c;
    }

    /* JADX INFO: renamed from: c */
    public final String m14274c() {
        return this.f44939a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j24)) {
            return false;
        }
        j24 j24Var = (j24) obj;
        return fa4.m11650l(this.f44939a, j24Var.f44939a) && Double.compare(this.f44940b, j24Var.f44940b) == 0 && fa4.m11650l(this.f44941c, j24Var.f44941c);
    }

    public final int hashCode() {
        return this.f44941c.hashCode() + g9a.m12424a(this.f44940b, this.f44939a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "InAppPurchase(eventName=" + this.f44939a + ", amount=" + this.f44940b + ", currency=" + this.f44941c + ')';
    }
}
