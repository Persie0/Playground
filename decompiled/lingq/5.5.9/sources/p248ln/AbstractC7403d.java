package p248ln;

import dm.C5207g;

/* JADX INFO: renamed from: ln.d */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC7403d {

    /* JADX INFO: renamed from: ln.d$a */
    public static final class a extends AbstractC7403d {

        /* JADX INFO: renamed from: a */
        public final String f41218a;

        /* JADX INFO: renamed from: b */
        public final String f41219b;

        public a(String str, String str2) {
            C5207g.m11111f(str, "name");
            C5207g.m11111f(str2, "desc");
            this.f41218a = str;
            this.f41219b = str2;
        }

        @Override // p248ln.AbstractC7403d
        /* JADX INFO: renamed from: a */
        public final String mo14803a() {
            return this.f41218a + ':' + this.f41219b;
        }

        @Override // p248ln.AbstractC7403d
        /* JADX INFO: renamed from: b */
        public final String mo14804b() {
            return this.f41219b;
        }

        @Override // p248ln.AbstractC7403d
        /* JADX INFO: renamed from: c */
        public final String mo14805c() {
            return this.f41218a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return C5207g.m11106a(this.f41218a, aVar.f41218a) && C5207g.m11106a(this.f41219b, aVar.f41219b);
        }

        public final int hashCode() {
            return this.f41219b.hashCode() + (this.f41218a.hashCode() * 31);
        }
    }

    /* JADX INFO: renamed from: ln.d$b */
    public static final class b extends AbstractC7403d {

        /* JADX INFO: renamed from: a */
        public final String f41220a;

        /* JADX INFO: renamed from: b */
        public final String f41221b;

        public b(String str, String str2) {
            C5207g.m11111f(str, "name");
            C5207g.m11111f(str2, "desc");
            this.f41220a = str;
            this.f41221b = str2;
        }

        @Override // p248ln.AbstractC7403d
        /* JADX INFO: renamed from: a */
        public final String mo14803a() {
            return this.f41220a + this.f41221b;
        }

        @Override // p248ln.AbstractC7403d
        /* JADX INFO: renamed from: b */
        public final String mo14804b() {
            return this.f41221b;
        }

        @Override // p248ln.AbstractC7403d
        /* JADX INFO: renamed from: c */
        public final String mo14805c() {
            return this.f41220a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return C5207g.m11106a(this.f41220a, bVar.f41220a) && C5207g.m11106a(this.f41221b, bVar.f41221b);
        }

        public final int hashCode() {
            return this.f41221b.hashCode() + (this.f41220a.hashCode() * 31);
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract String mo14803a();

    /* JADX INFO: renamed from: b */
    public abstract String mo14804b();

    /* JADX INFO: renamed from: c */
    public abstract String mo14805c();

    public final String toString() {
        return mo14803a();
    }
}
