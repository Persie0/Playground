package com.google.android.gms.phenotype;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p000.l70;
import p000.ped;
import p000.qmb;

/* JADX INFO: loaded from: classes2.dex */
public class ExperimentTokens extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ExperimentTokens> CREATOR = new qmb(11);

    /* JADX INFO: renamed from: a */
    public final String f12445a;

    /* JADX INFO: renamed from: b */
    public final byte[] f12446b;

    /* JADX INFO: renamed from: c */
    public final byte[][] f12447c;

    /* JADX INFO: renamed from: d */
    public final byte[][] f12448d;

    /* JADX INFO: renamed from: e */
    public final byte[][] f12449e;

    /* JADX INFO: renamed from: f */
    public final byte[][] f12450f;

    /* JADX INFO: renamed from: g */
    public final int[] f12451g;

    /* JADX INFO: renamed from: h */
    public final byte[][] f12452h;

    public ExperimentTokens(String str, byte[] bArr, byte[][] bArr2, byte[][] bArr3, byte[][] bArr4, byte[][] bArr5, int[] iArr, byte[][] bArr6) {
        this.f12445a = str;
        this.f12446b = bArr;
        this.f12447c = bArr2;
        this.f12448d = bArr3;
        this.f12449e = bArr4;
        this.f12450f = bArr5;
        this.f12451g = iArr;
        this.f12452h = bArr6;
    }

    /* JADX INFO: renamed from: J */
    public static List m5955J(byte[][] bArr) {
        if (bArr == null) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(bArr.length);
        for (byte[] bArr2 : bArr) {
            arrayList.add(Base64.encodeToString(bArr2, 3));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    /* JADX INFO: renamed from: Z */
    public static void m5956Z(StringBuilder sb, String str, byte[][] bArr) {
        String str2;
        sb.append(str);
        sb.append("=");
        if (bArr == null) {
            str2 = "null";
        } else {
            sb.append("(");
            int length = bArr.length;
            boolean z = true;
            int i = 0;
            while (i < length) {
                byte[] bArr2 = bArr[i];
                if (!z) {
                    sb.append(", ");
                }
                sb.append("'");
                sb.append(Base64.encodeToString(bArr2, 3));
                sb.append("'");
                i++;
                z = false;
            }
            str2 = ")";
        }
        sb.append(str2);
    }

    /* JADX INFO: renamed from: r */
    public static List m5957r(int[] iArr) {
        if (iArr == null) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i : iArr) {
            arrayList.add(Integer.valueOf(i));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ExperimentTokens) {
            ExperimentTokens experimentTokens = (ExperimentTokens) obj;
            if (ped.m19083a(this.f12445a, experimentTokens.f12445a) && Arrays.equals(this.f12446b, experimentTokens.f12446b) && ped.m19083a(m5955J(this.f12447c), m5955J(experimentTokens.f12447c)) && ped.m19083a(m5955J(this.f12448d), m5955J(experimentTokens.f12448d)) && ped.m19083a(m5955J(this.f12449e), m5955J(experimentTokens.f12449e)) && ped.m19083a(m5955J(this.f12450f), m5955J(experimentTokens.f12450f)) && ped.m19083a(m5957r(this.f12451g), m5957r(experimentTokens.f12451g)) && ped.m19083a(m5955J(this.f12452h), m5955J(experimentTokens.f12452h))) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        String string;
        StringBuilder sb = new StringBuilder("ExperimentTokens");
        sb.append("(");
        String str = this.f12445a;
        if (str == null) {
            string = "null";
        } else {
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 2);
            sb2.append("'");
            sb2.append(str);
            sb2.append("'");
            string = sb2.toString();
        }
        sb.append(string);
        sb.append(", direct=");
        byte[] bArr = this.f12446b;
        if (bArr == null) {
            sb.append("null");
        } else {
            sb.append("'");
            sb.append(Base64.encodeToString(bArr, 3));
            sb.append("'");
        }
        sb.append(", ");
        m5956Z(sb, "GAIA", this.f12447c);
        sb.append(", ");
        m5956Z(sb, "PSEUDO", this.f12448d);
        sb.append(", ");
        m5956Z(sb, "ALWAYS", this.f12449e);
        sb.append(", ");
        m5956Z(sb, "OTHER", this.f12450f);
        sb.append(", ");
        sb.append("weak");
        sb.append("=");
        int[] iArr = this.f12451g;
        if (iArr == null) {
            sb.append("null");
        } else {
            sb.append("(");
            int length = iArr.length;
            boolean z = true;
            int i = 0;
            while (i < length) {
                int i2 = iArr[i];
                if (!z) {
                    sb.append(", ");
                }
                sb.append(i2);
                i++;
                z = false;
            }
            sb.append(")");
        }
        sb.append(", ");
        m5956Z(sb, "directs", this.f12452h);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM15937a0 = l70.m15937a0(parcel, 20293);
        l70.m15930U(parcel, 2, this.f12445a);
        l70.m15925P(parcel, 3, this.f12446b);
        l70.m15926Q(parcel, 4, this.f12447c);
        l70.m15926Q(parcel, 5, this.f12448d);
        l70.m15926Q(parcel, 6, this.f12449e);
        l70.m15926Q(parcel, 7, this.f12450f);
        l70.m15928S(parcel, 8, this.f12451g);
        l70.m15926Q(parcel, 9, this.f12452h);
        l70.m15939b0(parcel, iM15937a0);
    }
}
