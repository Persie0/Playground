package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class biu {

    /* JADX INFO: renamed from: a */
    public final String f3448a;

    /* JADX INFO: renamed from: b */
    public final String f3449b;

    /* JADX INFO: renamed from: c */
    public final float f3450c;

    /* JADX INFO: renamed from: d */
    public final int f3451d;

    /* JADX INFO: renamed from: e */
    public final float f3452e;

    /* JADX INFO: renamed from: f */
    public final float f3453f;

    /* JADX INFO: renamed from: g */
    public final int f3454g;

    /* JADX INFO: renamed from: h */
    public final int f3455h;

    /* JADX INFO: renamed from: i */
    public final float f3456i;

    /* JADX INFO: renamed from: j */
    public final boolean f3457j;

    /* JADX INFO: renamed from: k */
    public final int f3458k;

    public biu(String str, String str2, float f, int i, int i2, float f2, float f3, int i3, int i4, float f4, boolean z) {
        this.f3448a = str;
        this.f3449b = str2;
        this.f3450c = f;
        this.f3458k = i;
        this.f3451d = i2;
        this.f3452e = f2;
        this.f3453f = f3;
        this.f3454g = i3;
        this.f3455h = i4;
        this.f3456i = f4;
        this.f3457j = z;
    }

    public final int hashCode() {
        float fHashCode = (((this.f3448a.hashCode() * 31) + this.f3449b.hashCode()) * 31) + this.f3450c;
        int i = this.f3458k;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        int i3 = (((((int) fHashCode) * 31) + i2) * 31) + this.f3451d;
        long jFloatToRawIntBits = Float.floatToRawIntBits(this.f3452e);
        return (((i3 * 31) + ((int) (jFloatToRawIntBits ^ (jFloatToRawIntBits >>> 32)))) * 31) + this.f3454g;
    }
}
