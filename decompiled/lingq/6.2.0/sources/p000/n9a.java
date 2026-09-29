package p000;

/* JADX INFO: loaded from: classes.dex */
public final class n9a {

    /* JADX INFO: renamed from: a */
    public final C3419on f52522a;

    /* JADX INFO: renamed from: b */
    public final mq6 f52523b;

    public n9a(C3419on c3419on, mq6 mq6Var) {
        this.f52522a = c3419on;
        this.f52523b = mq6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n9a)) {
            return false;
        }
        n9a n9aVar = (n9a) obj;
        return fa4.m11650l(this.f52522a, n9aVar.f52522a) && this.f52523b.equals(n9aVar.f52523b);
    }

    public final int hashCode() {
        return this.f52523b.hashCode() + (this.f52522a.hashCode() * 31);
    }

    public final String toString() {
        return "TransformedText(text=" + ((Object) this.f52522a) + ", offsetMapping=" + this.f52523b + ')';
    }
}
