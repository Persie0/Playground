package p000;

/* JADX INFO: renamed from: re */
/* JADX INFO: loaded from: classes.dex */
public final class C3532re {

    /* JADX INFO: renamed from: c */
    public static final C3532re f59143c = new C3532re(0, 0);

    /* JADX INFO: renamed from: d */
    public static final C3532re f59144d = new C3532re(2, 0);

    /* JADX INFO: renamed from: e */
    public static final C3532re f59145e = new C3532re(0, 1);

    /* JADX INFO: renamed from: f */
    public static final C3532re f59146f = new C3532re(1, 1);

    /* JADX INFO: renamed from: g */
    public static final C3532re f59147g = new C3532re(2, 2);

    /* JADX INFO: renamed from: a */
    public final int f59148a;

    /* JADX INFO: renamed from: b */
    public final int f59149b;

    public C3532re(int i, int i2) {
        this.f59148a = i;
        this.f59149b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C3532re.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        C3532re c3532re = (C3532re) obj;
        return this.f59148a == c3532re.f59148a && this.f59149b == c3532re.f59149b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f59149b) + (Integer.hashCode(this.f59148a) * 31);
    }

    public final String toString() {
        return "Alignment(horizontal=" + ((Object) C3406oe.m17945b(this.f59148a)) + ", vertical=" + ((Object) C3494qe.m19887b(this.f59149b)) + ')';
    }
}
