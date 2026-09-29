package p000;

/* JADX INFO: loaded from: classes.dex */
public final class kz3 {

    /* JADX INFO: renamed from: a */
    public final Object f48794a;

    public /* synthetic */ kz3(String str) {
        this.f48794a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof kz3) {
            return fa4.m11650l(this.f48794a, ((kz3) obj).f48794a);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f48794a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "Pending(value=" + this.f48794a + ')';
    }
}
