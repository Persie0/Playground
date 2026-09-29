package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class d50 extends ml7 {

    /* JADX INFO: renamed from: a */
    public final Integer f35001a;

    public d50(Integer num) {
        this.f35001a = num;
    }

    @Override // p000.ml7
    /* JADX INFO: renamed from: a */
    public final Integer mo10097a() {
        return this.f35001a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ml7)) {
            return false;
        }
        return this.f35001a.equals(((d50) ((ml7) obj)).f35001a);
    }

    public final int hashCode() {
        return this.f35001a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "ProductData{productId=" + this.f35001a + "}";
    }
}
