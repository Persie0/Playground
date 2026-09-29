package com.google.android.gms.internal.measurement;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import p000.AbstractC3393o1;
import p000.ked;
import p000.l70;
import p000.lda;
import p000.qmb;
import p000.r2d;

/* JADX INFO: loaded from: classes2.dex */
public final class zzjl extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzjl> CREATOR = new qmb(15);

    /* JADX INFO: renamed from: a */
    public final String f11894a;

    /* JADX INFO: renamed from: b */
    public final byte[] f11895b;

    /* JADX INFO: renamed from: c */
    public final byte[][] f11896c;

    /* JADX INFO: renamed from: d */
    public final byte[][] f11897d;

    /* JADX INFO: renamed from: e */
    public final byte[][] f11898e;

    /* JADX INFO: renamed from: f */
    public final byte[][] f11899f;

    /* JADX INFO: renamed from: g */
    public final int[] f11900g;

    /* JADX INFO: renamed from: h */
    public final byte[][] f11901h;

    /* JADX INFO: renamed from: i */
    public final int[] f11902i;

    /* JADX INFO: renamed from: j */
    public final byte[][] f11903j;

    public zzjl(String str, byte[] bArr, byte[][] bArr2, byte[][] bArr3, byte[][] bArr4, byte[][] bArr5, int[] iArr, byte[][] bArr6, int[] iArr2, byte[][] bArr7) {
        this.f11894a = str;
        this.f11895b = bArr;
        this.f11896c = bArr2;
        this.f11897d = bArr3;
        this.f11898e = bArr4;
        this.f11899f = bArr5;
        this.f11900g = iArr;
        this.f11901h = bArr6;
        this.f11902i = iArr2;
        this.f11903j = bArr7;
    }

    /* JADX INFO: renamed from: Z */
    public static Set m5440Z(byte[][] bArr) {
        int length;
        if (bArr == null || (length = bArr.length) == 0) {
            return Collections.EMPTY_SET;
        }
        HashSet hashSetM20266f = r2d.m20266f(length);
        for (byte[] bArr2 : bArr) {
            lda.m16130p(bArr2);
            hashSetM20266f.add(Base64.encodeToString(bArr2, 3));
        }
        return hashSetM20266f;
    }

    /* JADX INFO: renamed from: g0 */
    public static List m5441g0(int[] iArr) {
        if (iArr == null) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(iArr.length >> 1);
        for (int i = 0; i < iArr.length; i += 2) {
            arrayList.add(new zzju(iArr[i], iArr[i + 1]));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    /* JADX INFO: renamed from: r */
    public static void m5442r(StringBuilder sb, String str, byte[][] bArr) {
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
            lda.m16130p(bArr2);
            sb.append(Base64.encodeToString(bArr2, 3));
            sb.append("'");
            i++;
            z = false;
        }
        sb.append(")");
    }

    /* JADX INFO: renamed from: J */
    public final Set m5443J() {
        ArrayList arrayList = new ArrayList();
        byte[][] bArr = this.f11901h;
        if (bArr != null) {
            Collections.addAll(arrayList, bArr);
        }
        byte[] bArr2 = this.f11895b;
        if (bArr2 != null) {
            arrayList.add(bArr2);
        }
        return m5440Z((byte[][]) arrayList.toArray(new byte[0][]));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.HashSet] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.HashSet] */
    public final boolean equals(Object obj) {
        Object objM20266f;
        Object objM20266f2;
        int length;
        int length2;
        if (obj instanceof zzjl) {
            zzjl zzjlVar = (zzjl) obj;
            if (ked.m15166d(this.f11894a, zzjlVar.f11894a) && ked.m15166d(m5443J(), zzjlVar.m5443J()) && ked.m15166d(m5440Z(this.f11896c), m5440Z(zzjlVar.f11896c)) && ked.m15166d(m5440Z(this.f11897d), m5440Z(zzjlVar.f11897d)) && ked.m15166d(m5440Z(this.f11898e), m5440Z(zzjlVar.f11898e)) && ked.m15166d(m5440Z(this.f11899f), m5440Z(zzjlVar.f11899f))) {
                int[] iArr = this.f11900g;
                if (iArr == null || (length2 = iArr.length) == 0) {
                    objM20266f = Collections.EMPTY_SET;
                } else {
                    objM20266f = r2d.m20266f(length2);
                    for (int i : iArr) {
                        objM20266f.add(Integer.valueOf(i));
                    }
                }
                int[] iArr2 = zzjlVar.f11900g;
                if (iArr2 == null || (length = iArr2.length) == 0) {
                    objM20266f2 = Collections.EMPTY_SET;
                } else {
                    objM20266f2 = r2d.m20266f(length);
                    for (int i2 : iArr2) {
                        objM20266f2.add(Integer.valueOf(i2));
                    }
                }
                if (ked.m15166d(objM20266f, objM20266f2) && ked.m15166d(m5441g0(this.f11902i), m5441g0(zzjlVar.f11902i)) && ked.m15166d(m5440Z(this.f11903j), m5440Z(zzjlVar.f11903j))) {
                    return true;
                }
            }
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ExperimentTokens");
        sb.append("(");
        String str = this.f11894a;
        sb.append(str == null ? "null" : AbstractC3393o1.m17739n(new StringBuilder(str.length() + 2), "'", str, "'"));
        sb.append(", direct==");
        byte[] bArr = this.f11895b;
        if (bArr == null) {
            sb.append("null");
        } else {
            sb.append("'");
            sb.append(Base64.encodeToString(bArr, 3));
            sb.append("'");
        }
        sb.append(", ");
        m5442r(sb, "GAIA=", this.f11896c);
        sb.append(", ");
        m5442r(sb, "PSEUDO=", this.f11897d);
        sb.append(", ");
        m5442r(sb, "ALWAYS=", this.f11898e);
        sb.append(", ");
        m5442r(sb, "OTHER=", this.f11899f);
        sb.append(", weak=");
        sb.append(Arrays.toString(this.f11900g));
        sb.append(", ");
        m5442r(sb, "directs=", this.f11901h);
        sb.append(", genDims=");
        sb.append(Arrays.toString(m5441g0(this.f11902i).toArray()));
        sb.append(", ");
        m5442r(sb, "external=", this.f11903j);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM15937a0 = l70.m15937a0(parcel, 20293);
        l70.m15930U(parcel, 2, this.f11894a);
        l70.m15925P(parcel, 3, this.f11895b);
        l70.m15926Q(parcel, 4, this.f11896c);
        l70.m15926Q(parcel, 5, this.f11897d);
        l70.m15926Q(parcel, 6, this.f11898e);
        l70.m15926Q(parcel, 7, this.f11899f);
        l70.m15928S(parcel, 8, this.f11900g);
        l70.m15926Q(parcel, 9, this.f11901h);
        l70.m15928S(parcel, 10, this.f11902i);
        l70.m15926Q(parcel, 11, this.f11903j);
        l70.m15939b0(parcel, iM15937a0);
    }
}
