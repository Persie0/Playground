package p000;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jod extends jij {
    public static final Parcelable.Creator CREATOR = new jny(5);

    /* JADX INFO: renamed from: a */
    public final String f34449a;

    /* JADX INFO: renamed from: b */
    public final byte[] f34450b;

    /* JADX INFO: renamed from: c */
    public final byte[][] f34451c;

    /* JADX INFO: renamed from: d */
    public final byte[][] f34452d;

    /* JADX INFO: renamed from: e */
    public final byte[][] f34453e;

    /* JADX INFO: renamed from: f */
    public final byte[][] f34454f;

    /* JADX INFO: renamed from: g */
    public final int[] f34455g;

    /* JADX INFO: renamed from: h */
    public final byte[][] f34456h;

    /* JADX INFO: renamed from: i */
    public final int[] f34457i;

    /* JADX INFO: renamed from: j */
    public final byte[][] f34458j;

    public jod(String str, byte[] bArr, byte[][] bArr2, byte[][] bArr3, byte[][] bArr4, byte[][] bArr5, int[] iArr, byte[][] bArr6, int[] iArr2, byte[][] bArr7) {
        this.f34449a = str;
        this.f34450b = bArr;
        this.f34451c = bArr2;
        this.f34452d = bArr3;
        this.f34453e = bArr4;
        this.f34454f = bArr5;
        this.f34455g = iArr;
        this.f34456h = bArr6;
        this.f34457i = iArr2;
        this.f34458j = bArr7;
    }

    /* JADX INFO: renamed from: a */
    private static List m13400a(int[] iArr) {
        if (iArr == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i : iArr) {
            arrayList.add(Integer.valueOf(i));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    /* JADX INFO: renamed from: b */
    private static List m13401b(byte[][] bArr) {
        if (bArr == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(bArr.length);
        for (byte[] bArr2 : bArr) {
            jib.m13205j(bArr2);
            arrayList.add(Base64.encodeToString(bArr2, 3));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    /* JADX INFO: renamed from: c */
    private static List m13402c(int[] iArr) {
        if (iArr == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(iArr.length >> 1);
        for (int i = 0; i < iArr.length; i += 2) {
            arrayList.add(new joi(iArr[i], iArr[i + 1]));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    /* JADX INFO: renamed from: d */
    private static void m13403d(StringBuilder sb, String str, byte[][] bArr) {
        sb.append(str);
        sb.append("=");
        if (bArr == null) {
            sb.append("null");
            return;
        }
        sb.append("(");
        boolean z = true;
        int i = 0;
        while (i < bArr.length) {
            byte[] bArr2 = bArr[i];
            if (!z) {
                sb.append(", ");
            }
            sb.append("'");
            jib.m13205j(bArr2);
            sb.append(Base64.encodeToString(bArr2, 3));
            sb.append("'");
            i++;
            z = false;
        }
        sb.append(")");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof jod) {
            jod jodVar = (jod) obj;
            if (jpd.m13422c(this.f34449a, jodVar.f34449a) && Arrays.equals(this.f34450b, jodVar.f34450b) && jpd.m13422c(m13401b(this.f34451c), m13401b(jodVar.f34451c)) && jpd.m13422c(m13401b(this.f34452d), m13401b(jodVar.f34452d)) && jpd.m13422c(m13401b(this.f34453e), m13401b(jodVar.f34453e)) && jpd.m13422c(m13401b(this.f34454f), m13401b(jodVar.f34454f)) && jpd.m13422c(m13400a(this.f34455g), m13400a(jodVar.f34455g)) && jpd.m13422c(m13401b(this.f34456h), m13401b(jodVar.f34456h)) && jpd.m13422c(m13402c(this.f34457i), m13402c(jodVar.f34457i)) && jpd.m13422c(m13401b(this.f34458j), m13401b(jodVar.f34458j))) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("ExperimentTokens");
        sb.append("(");
        String str2 = this.f34449a;
        if (str2 == null) {
            str = "null";
        } else {
            str = "'" + str2 + "'";
        }
        sb.append(str);
        byte[] bArr = this.f34450b;
        sb.append(", direct==");
        if (bArr == null) {
            sb.append("null");
        } else {
            sb.append("'");
            sb.append(Base64.encodeToString(bArr, 3));
            sb.append("'");
        }
        sb.append(", ");
        m13403d(sb, "GAIA=", this.f34451c);
        sb.append(", ");
        m13403d(sb, "PSEUDO=", this.f34452d);
        sb.append(", ");
        m13403d(sb, "ALWAYS=", this.f34453e);
        sb.append(", ");
        m13403d(sb, "OTHER=", this.f34454f);
        sb.append(", weak=");
        sb.append(Arrays.toString(this.f34455g));
        sb.append(", ");
        m13403d(sb, "directs=", this.f34456h);
        sb.append(", genDims=");
        sb.append(Arrays.toString(m13402c(this.f34457i).toArray()));
        sb.append(", ");
        m13403d(sb, "external=", this.f34458j);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM13281h = jiy.m13281h(parcel);
        jiy.m13296w(parcel, 2, this.f34449a);
        jiy.m13290q(parcel, 3, this.f34450b);
        jiy.m13291r(parcel, 4, this.f34451c);
        jiy.m13291r(parcel, 5, this.f34452d);
        jiy.m13291r(parcel, 6, this.f34453e);
        jiy.m13291r(parcel, 7, this.f34454f);
        jiy.m13293t(parcel, 8, this.f34455g);
        jiy.m13291r(parcel, 9, this.f34456h);
        jiy.m13293t(parcel, 10, this.f34457i);
        jiy.m13291r(parcel, 11, this.f34458j);
        jiy.m13283j(parcel, iM13281h);
    }
}
