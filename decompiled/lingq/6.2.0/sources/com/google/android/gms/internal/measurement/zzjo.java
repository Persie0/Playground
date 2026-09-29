package com.google.android.gms.internal.measurement;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import p000.ked;
import p000.l70;
import p000.lda;
import p000.qmb;
import p000.wq1;

/* JADX INFO: loaded from: classes2.dex */
public final class zzjo extends AbstractSafeParcelable implements Comparable<zzjo> {
    public static final Parcelable.Creator<zzjo> CREATOR = new qmb(16);

    /* JADX INFO: renamed from: a */
    public final String f11904a;

    /* JADX INFO: renamed from: b */
    public final long f11905b;

    /* JADX INFO: renamed from: c */
    public final boolean f11906c;

    /* JADX INFO: renamed from: d */
    public final double f11907d;

    /* JADX INFO: renamed from: e */
    public final String f11908e;

    /* JADX INFO: renamed from: f */
    public final byte[] f11909f;

    /* JADX INFO: renamed from: g */
    public final int f11910g;

    /* JADX INFO: renamed from: h */
    public final int f11911h;

    /* JADX INFO: renamed from: i */
    public final int f11912i;

    public zzjo(String str, long j, boolean z, double d, String str2, byte[] bArr, int i, int i2, int i3) {
        this.f11904a = str;
        this.f11905b = j;
        this.f11906c = z;
        this.f11907d = d;
        this.f11908e = str2;
        this.f11909f = bArr;
        this.f11910g = i;
        this.f11911h = i2;
        this.f11912i = i3;
    }

    /* JADX WARN: Code duplicated, block: B:64:0x00a5 A[RETURN] */
    @Override // java.lang.Comparable
    public final int compareTo(zzjo zzjoVar) {
        int i;
        zzjo zzjoVar2 = zzjoVar;
        int iCompareTo = this.f11904a.compareTo(zzjoVar2.f11904a);
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        int i2 = zzjoVar2.f11910g;
        int i3 = this.f11910g;
        if (i3 < i2) {
            i = -1;
        } else {
            i = i3 != i2 ? 1 : 0;
        }
        if (i != 0) {
            return i;
        }
        if (i3 == 1) {
            long j = this.f11905b;
            long j2 = zzjoVar2.f11905b;
            if (j >= j2) {
                if (j == j2) {
                    return 0;
                }
                return 1;
            }
            return -1;
        }
        if (i3 == 2) {
            boolean z = zzjoVar2.f11906c;
            boolean z2 = this.f11906c;
            if (z2 != z) {
                if (z2) {
                    return 1;
                }
                return -1;
            }
            return 0;
        }
        if (i3 == 3) {
            return Double.compare(this.f11907d, zzjoVar2.f11907d);
        }
        if (i3 == 4) {
            String str = zzjoVar2.f11908e;
            String str2 = this.f11908e;
            if (str2 != str) {
                if (str2 != null) {
                    if (str != null) {
                        return str2.compareTo(str);
                    }
                    return 1;
                }
                return -1;
            }
            return 0;
        }
        if (i3 != 5) {
            throw new AssertionError(wq1.m24124t(new StringBuilder(String.valueOf(i3).length() + 20), "Invalid enum value: ", i3));
        }
        byte[] bArr = zzjoVar2.f11909f;
        byte[] bArr2 = this.f11909f;
        if (bArr2 != bArr) {
            if (bArr2 != null) {
                if (bArr != null) {
                    int i4 = 0;
                    while (true) {
                        int length = bArr.length;
                        int length2 = bArr2.length;
                        if (i4 >= Math.min(length2, length)) {
                            if (length2 < length) {
                                return -1;
                            }
                            return length2 != length ? 1 : 0;
                        }
                        int i5 = bArr2[i4] - bArr[i4];
                        if (i5 != 0) {
                            return i5;
                        }
                        i4++;
                    }
                }
                return 1;
            }
            return -1;
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzjo) {
            zzjo zzjoVar = (zzjo) obj;
            if (ked.m15166d(this.f11904a, zzjoVar.f11904a)) {
                int i = zzjoVar.f11910g;
                int i2 = this.f11910g;
                if (i2 == i && this.f11911h == zzjoVar.f11911h && this.f11912i == zzjoVar.f11912i) {
                    if (i2 == 1) {
                        return this.f11905b == zzjoVar.f11905b;
                    }
                    if (i2 == 2) {
                        return this.f11906c == zzjoVar.f11906c;
                    }
                    if (i2 == 3) {
                        return this.f11907d == zzjoVar.f11907d;
                    }
                    if (i2 == 4) {
                        return ked.m15166d(this.f11908e, zzjoVar.f11908e);
                    }
                    if (i2 == 5) {
                        return Arrays.equals(this.f11909f, zzjoVar.f11909f);
                    }
                    throw new AssertionError(wq1.m24124t(new StringBuilder(String.valueOf(i2).length() + 20), "Invalid enum value: ", i2));
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: r */
    public final void m5444r(StringBuilder sb) {
        sb.append("Flag(");
        String str = this.f11904a;
        sb.append(str);
        sb.append(", ");
        int i = this.f11910g;
        if (i == 1) {
            sb.append(this.f11905b);
        } else if (i == 2) {
            sb.append(this.f11906c);
        } else if (i == 3) {
            sb.append(this.f11907d);
        } else if (i == 4) {
            sb.append("'");
            String str2 = this.f11908e;
            lda.m16130p(str2);
            sb.append(str2);
            sb.append("'");
        } else {
            if (i != 5) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 16 + String.valueOf(i).length());
                sb2.append("Invalid type: ");
                sb2.append(str);
                sb2.append(", ");
                sb2.append(i);
                throw new AssertionError(sb2.toString());
            }
            sb.append("'");
            byte[] bArr = this.f11909f;
            lda.m16130p(bArr);
            sb.append(Base64.encodeToString(bArr, 3));
            sb.append("'");
        }
        sb.append(", ");
        sb.append(i);
        sb.append(", ");
        sb.append(this.f11911h);
        sb.append(", ");
        sb.append(this.f11912i);
        sb.append(")");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        m5444r(sb);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.f11904a;
        boolean z = str == null;
        int iM15937a0 = l70.m15937a0(parcel, 20293);
        if (!z) {
            l70.m15930U(parcel, 2, str);
        }
        long j = this.f11905b;
        if (j != 0) {
            l70.m15935Z(parcel, 3, 8);
            parcel.writeLong(j);
        }
        if (this.f11906c) {
            l70.m15935Z(parcel, 4, 4);
            parcel.writeInt(1);
        }
        double d = this.f11907d;
        if (d != 0.0d) {
            l70.m15935Z(parcel, 5, 8);
            parcel.writeDouble(d);
        }
        String str2 = this.f11908e;
        if (str2 != null) {
            l70.m15930U(parcel, 6, str2);
        }
        byte[] bArr = this.f11909f;
        if (bArr != null) {
            l70.m15925P(parcel, 7, bArr);
        }
        int i2 = this.f11910g;
        if (i2 != 0) {
            l70.m15935Z(parcel, 8, 4);
            parcel.writeInt(i2);
        }
        int i3 = this.f11911h;
        if (i3 != 0) {
            l70.m15935Z(parcel, 9, 4);
            parcel.writeInt(i3);
        }
        int i4 = this.f11912i;
        if (i4 != 0) {
            l70.m15935Z(parcel, 10, 4);
            parcel.writeInt(i4);
        }
        l70.m15939b0(parcel, iM15937a0);
    }
}
