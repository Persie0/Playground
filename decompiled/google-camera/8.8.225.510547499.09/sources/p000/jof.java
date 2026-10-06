package p000;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jof extends jij implements Comparable {
    public static final Parcelable.Creator CREATOR = new jny(6);

    /* JADX INFO: renamed from: a */
    public final String f34466a;

    /* JADX INFO: renamed from: b */
    public final long f34467b;

    /* JADX INFO: renamed from: c */
    public final boolean f34468c;

    /* JADX INFO: renamed from: d */
    public final double f34469d;

    /* JADX INFO: renamed from: e */
    public final String f34470e;

    /* JADX INFO: renamed from: f */
    public final byte[] f34471f;

    /* JADX INFO: renamed from: g */
    public final int f34472g;

    /* JADX INFO: renamed from: h */
    public final int f34473h;

    public jof(String str, long j, boolean z, double d, String str2, byte[] bArr, int i, int i2) {
        this.f34466a = str;
        this.f34467b = j;
        this.f34468c = z;
        this.f34469d = d;
        this.f34470e = str2;
        this.f34471f = bArr;
        this.f34472g = i;
        this.f34473h = i2;
    }

    /* JADX INFO: renamed from: b */
    private static int m13404b(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i != i2 ? 1 : 0;
    }

    /* JADX INFO: renamed from: a */
    public final String m13405a(StringBuilder sb) {
        sb.append("Flag(");
        sb.append(this.f34466a);
        sb.append(", ");
        int i = this.f34472g;
        switch (i) {
            case 1:
                sb.append(this.f34467b);
                break;
            case 2:
                sb.append(this.f34468c);
                break;
            case 3:
                sb.append(this.f34469d);
                break;
            case 4:
                sb.append("'");
                String str = this.f34470e;
                jib.m13205j(str);
                sb.append(str);
                sb.append("'");
                break;
            case 5:
                sb.append("'");
                byte[] bArr = this.f34471f;
                jib.m13205j(bArr);
                sb.append(Base64.encodeToString(bArr, 3));
                sb.append("'");
                break;
            default:
                throw new AssertionError("Invalid type: " + this.f34466a + ", " + i);
        }
        sb.append(", ");
        sb.append(this.f34472g);
        sb.append(", ");
        sb.append(this.f34473h);
        sb.append(")");
        return sb.toString();
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        jof jofVar = (jof) obj;
        int iCompareTo = this.f34466a.compareTo(jofVar.f34466a);
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        int i = this.f34472g;
        int iM13404b = m13404b(i, jofVar.f34472g);
        if (iM13404b != 0) {
            return iM13404b;
        }
        switch (i) {
            case 1:
                long j = this.f34467b;
                long j2 = jofVar.f34467b;
                if (j < j2) {
                    return -1;
                }
                return j == j2 ? 0 : 1;
            case 2:
                boolean z = this.f34468c;
                if (z == jofVar.f34468c) {
                    return 0;
                }
                return z ? 1 : -1;
            case 3:
                return Double.compare(this.f34469d, jofVar.f34469d);
            case 4:
                String str = this.f34470e;
                String str2 = jofVar.f34470e;
                if (str == str2) {
                    return 0;
                }
                if (str == null) {
                    return -1;
                }
                if (str2 == null) {
                    return 1;
                }
                return str.compareTo(str2);
            case 5:
                byte[] bArr = this.f34471f;
                byte[] bArr2 = jofVar.f34471f;
                if (bArr == bArr2) {
                    return 0;
                }
                if (bArr == null) {
                    return -1;
                }
                if (bArr2 == null) {
                    return 1;
                }
                for (int i2 = 0; i2 < Math.min(this.f34471f.length, jofVar.f34471f.length); i2++) {
                    int i3 = this.f34471f[i2] - jofVar.f34471f[i2];
                    if (i3 != 0) {
                        return i3;
                    }
                }
                return m13404b(this.f34471f.length, jofVar.f34471f.length);
            default:
                throw new AssertionError("Invalid enum value: " + i);
        }
    }

    public final boolean equals(Object obj) {
        int i;
        if (!(obj instanceof jof)) {
            return false;
        }
        jof jofVar = (jof) obj;
        if (!jpd.m13422c(this.f34466a, jofVar.f34466a) || (i = this.f34472g) != jofVar.f34472g || this.f34473h != jofVar.f34473h) {
            return false;
        }
        switch (i) {
            case 1:
                return this.f34467b == jofVar.f34467b;
            case 2:
                return this.f34468c == jofVar.f34468c;
            case 3:
                return this.f34469d == jofVar.f34469d;
            case 4:
                return jpd.m13422c(this.f34470e, jofVar.f34470e);
            case 5:
                return Arrays.equals(this.f34471f, jofVar.f34471f);
            default:
                throw new AssertionError("Invalid enum value: " + i);
        }
    }

    public final String toString() {
        return m13405a(new StringBuilder());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM13281h = jiy.m13281h(parcel);
        String str = this.f34466a;
        if (!jny.m13397b(str)) {
            jiy.m13296w(parcel, 2, str);
        }
        long j = this.f34467b;
        if (j != 0) {
            jiy.m13288o(parcel, 3, j);
        }
        if (this.f34468c) {
            jiy.m13284k(parcel, 4, true);
        }
        double d = this.f34469d;
        if (d != 0.0d) {
            jiy.m13286m(parcel, 5, 8);
            parcel.writeDouble(d);
        }
        String str2 = this.f34470e;
        if (!jny.m13397b(str2)) {
            jiy.m13296w(parcel, 6, str2);
        }
        byte[] bArr = this.f34471f;
        if (!jny.m13397b(bArr)) {
            jiy.m13290q(parcel, 7, bArr);
        }
        int i2 = this.f34472g;
        if (!jny.m13396a(i2)) {
            jiy.m13287n(parcel, 8, i2);
        }
        int i3 = this.f34473h;
        if (!jny.m13396a(i3)) {
            jiy.m13287n(parcel, 9, i3);
        }
        jiy.m13283j(parcel, iM13281h);
    }
}
