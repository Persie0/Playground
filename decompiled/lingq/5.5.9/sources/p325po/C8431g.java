package p325po;

import dm.C5207g;

/* JADX INFO: renamed from: po.g */
/* JADX INFO: loaded from: classes2.dex */
public final class C8431g<T> {

    /* JADX INFO: renamed from: b */
    public static final b f45566b = new b();

    /* JADX INFO: renamed from: a */
    public final Object f45567a;

    /* JADX INFO: renamed from: po.g$a */
    public static final class a extends b {

        /* JADX INFO: renamed from: a */
        public final Throwable f45568a;

        public a(Throwable th2) {
            this.f45568a = th2;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof a) {
                if (C5207g.m11106a(this.f45568a, ((a) obj).f45568a)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            Throwable th2 = this.f45568a;
            if (th2 != null) {
                return th2.hashCode();
            }
            return 0;
        }

        @Override // p325po.C8431g.b
        public final String toString() {
            return "Closed(" + this.f45568a + ')';
        }
    }

    /* JADX INFO: renamed from: po.g$b */
    public static class b {
        public String toString() {
            return "Failed";
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C8431g) {
            return C5207g.m11106a(this.f45567a, ((C8431g) obj).f45567a);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f45567a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.f45567a;
        if (obj instanceof a) {
            return ((a) obj).toString();
        }
        return "Value(" + obj + ')';
    }
}
