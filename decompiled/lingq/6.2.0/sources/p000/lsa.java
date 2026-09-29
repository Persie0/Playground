package p000;

/* JADX INFO: loaded from: classes.dex */
public final class lsa {

    /* JADX INFO: renamed from: d */
    public static final lsa f50084d = new lsa(0, 0);

    /* JADX INFO: renamed from: a */
    public final int f50085a;

    /* JADX INFO: renamed from: b */
    public final int f50086b;

    /* JADX INFO: renamed from: c */
    public final float f50087c;

    static {
        uma.m22828w(0);
        uma.m22828w(1);
        uma.m22828w(3);
    }

    public lsa(int i, float f, int i2) {
        this.f50085a = i;
        this.f50086b = i2;
        this.f50087c = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof lsa) {
            lsa lsaVar = (lsa) obj;
            if (this.f50085a == lsaVar.f50085a && this.f50086b == lsaVar.f50086b && this.f50087c == lsaVar.f50087c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f50087c) + ((((217 + this.f50085a) * 31) + this.f50086b) * 31);
    }

    public lsa(int i, int i2) {
        this(i, 1.0f, i2);
    }
}
