package p261m9;

import p003a2.C0009a;

/* JADX INFO: renamed from: m9.u */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC7520u {

    /* JADX INFO: renamed from: m9.u$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final C7521v f41517a;

        /* JADX INFO: renamed from: b */
        public final C7521v f41518b;

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        public a() {
            throw null;
        }

        public a(C7521v c7521v, C7521v c7521v2) {
            this.f41517a = c7521v;
            this.f41518b = c7521v2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && a.class == obj.getClass()) {
                a aVar = (a) obj;
                return this.f41517a.equals(aVar.f41517a) && this.f41518b.equals(aVar.f41518b);
            }
            return false;
        }

        public final int hashCode() {
            return this.f41518b.hashCode() + (this.f41517a.hashCode() * 31);
        }

        public final String toString() {
            String str;
            StringBuilder sb2 = new StringBuilder("[");
            C7521v c7521v = this.f41517a;
            sb2.append(c7521v);
            C7521v c7521v2 = this.f41518b;
            if (c7521v.equals(c7521v2)) {
                str = "";
            } else {
                str = ", " + c7521v2;
            }
            return C0009a.m23l(sb2, str, "]");
        }
    }

    /* JADX INFO: renamed from: m9.u$b */
    public static class b implements InterfaceC7520u {

        /* JADX INFO: renamed from: a */
        public final long f41519a;

        /* JADX INFO: renamed from: b */
        public final a f41520b;

        public b(long j10) {
            this(j10, 0L);
        }

        public b(long j10, long j11) {
            this.f41519a = j10;
            C7521v c7521v = j11 == 0 ? C7521v.f41521c : new C7521v(0L, j11);
            this.f41520b = new a(c7521v, c7521v);
        }

        @Override // p261m9.InterfaceC7520u
        /* JADX INFO: renamed from: b */
        public final boolean mo14982b() {
            return false;
        }

        @Override // p261m9.InterfaceC7520u
        /* JADX INFO: renamed from: h */
        public final a mo14983h(long j10) {
            return this.f41520b;
        }

        @Override // p261m9.InterfaceC7520u
        /* JADX INFO: renamed from: i */
        public final long mo14984i() {
            return this.f41519a;
        }
    }

    /* JADX INFO: renamed from: b */
    boolean mo14982b();

    /* JADX INFO: renamed from: h */
    a mo14983h(long j10);

    /* JADX INFO: renamed from: i */
    long mo14984i();
}
