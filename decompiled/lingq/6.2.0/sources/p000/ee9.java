package p000;

import coil.decode.DataSource;

/* JADX INFO: loaded from: classes.dex */
public final class ee9 extends q23 {

    /* JADX INFO: renamed from: a */
    public final g04 f37132a;

    /* JADX INFO: renamed from: b */
    public final String f37133b;

    /* JADX INFO: renamed from: c */
    public final DataSource f37134c;

    public ee9(g04 g04Var, String str, DataSource dataSource) {
        this.f37132a = g04Var;
        this.f37133b = str;
        this.f37134c = dataSource;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ee9)) {
            return false;
        }
        ee9 ee9Var = (ee9) obj;
        return this.f37132a.equals(ee9Var.f37132a) && fa4.m11650l(this.f37133b, ee9Var.f37133b) && this.f37134c == ee9Var.f37134c;
    }

    public final int hashCode() {
        int iHashCode = this.f37132a.hashCode() * 31;
        String str = this.f37133b;
        return this.f37134c.hashCode() + ((iHashCode + (str != null ? str.hashCode() : 0)) * 31);
    }
}
