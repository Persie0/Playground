package p212k3;

import dm.C5207g;
import java.util.Map;

/* JADX INFO: renamed from: k3.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6579a {

    /* JADX INFO: renamed from: k3.a$a */
    public static final class a<T> {

        /* JADX INFO: renamed from: a */
        public final String f37403a;

        public a(String str) {
            C5207g.m11111f(str, "name");
            this.f37403a = str;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            return C5207g.m11106a(this.f37403a, ((a) obj).f37403a);
        }

        public final int hashCode() {
            return this.f37403a.hashCode();
        }

        public final String toString() {
            return this.f37403a;
        }
    }

    /* JADX INFO: renamed from: k3.a$b */
    public static final class b<T> {
    }

    /* JADX INFO: renamed from: a */
    public abstract Map<a<?>, Object> mo3049a();

    /* JADX INFO: renamed from: b */
    public abstract <T> T mo3050b(a<T> aVar);
}
