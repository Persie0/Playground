package p000;

import android.view.View;
import androidx.lifecycle.viewmodel.R$id;
import com.google.android.gms.internal.measurement.AbstractC0961e;
import com.google.android.gms.internal.measurement.zzacr;
import com.google.android.gms.internal.measurement.zzaeh;

/* JADX INFO: loaded from: classes.dex */
public abstract class eja {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f37366a = 0;

    /* JADX INFO: renamed from: a */
    public static final dua m11183a(View view) {
        view.getClass();
        while (view != null) {
            Object tag = view.getTag(R$id.view_tree_view_model_store_owner);
            dua duaVar = tag instanceof dua ? (dua) tag : null;
            if (duaVar != null) {
                return duaVar;
            }
            Object objM17996b = oha.m17996b(view);
            view = objM17996b instanceof View ? (View) objM17996b : null;
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static int m11184b(byte[] bArr, int i, ehb ehbVar) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return m11185c(b, bArr, i2, ehbVar);
        }
        ehbVar.f37267a = b;
        return i2;
    }

    /* JADX INFO: renamed from: c */
    public static int m11185c(int i, byte[] bArr, int i2, ehb ehbVar) {
        byte b = bArr[i2];
        int i3 = i2 + 1;
        int i4 = i & 127;
        if (b >= 0) {
            ehbVar.f37267a = i4 | (b << 7);
            return i3;
        }
        int i5 = i4 | ((b & 127) << 7);
        int i6 = i2 + 2;
        byte b2 = bArr[i3];
        if (b2 >= 0) {
            ehbVar.f37267a = i5 | (b2 << 14);
            return i6;
        }
        int i7 = i5 | ((b2 & 127) << 14);
        int i8 = i2 + 3;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            ehbVar.f37267a = i7 | (b3 << 21);
            return i8;
        }
        int i9 = i7 | ((b3 & 127) << 21);
        int i10 = i2 + 4;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            ehbVar.f37267a = i9 | (b4 << 28);
            return i10;
        }
        int i11 = i9 | ((b4 & 127) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                ehbVar.f37267a = i11;
                return i12;
            }
            i10 = i12;
        }
    }

    /* JADX INFO: renamed from: d */
    public static int m11186d(byte[] bArr, int i, ehb ehbVar) {
        long j = bArr[i];
        int i2 = i + 1;
        if (j >= 0) {
            ehbVar.f37268b = j;
            return i2;
        }
        int i3 = i + 2;
        byte b = bArr[i2];
        long j2 = (j & 127) | (((long) (b & 127)) << 7);
        int i4 = 7;
        while (b < 0) {
            int i5 = i3 + 1;
            byte b2 = bArr[i3];
            i4 += 7;
            j2 |= ((long) (b2 & 127)) << i4;
            b = b2;
            i3 = i5;
        }
        ehbVar.f37268b = j2;
        return i3;
    }

    /* JADX INFO: renamed from: e */
    public static int m11187e(int i, byte[] bArr) {
        int i2 = bArr[i] & 255;
        int i3 = bArr[i + 1] & 255;
        int i4 = bArr[i + 2] & 255;
        return ((bArr[i + 3] & 255) << 24) | (i3 << 8) | i2 | (i4 << 16);
    }

    /* JADX INFO: renamed from: f */
    public static long m11188f(int i, byte[] bArr) {
        return (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48) | ((((long) bArr[i + 7]) & 255) << 56);
    }

    /* JADX INFO: renamed from: g */
    public static int m11189g(byte[] bArr, int i, ehb ehbVar) throws zzaeh {
        int iM11184b = m11184b(bArr, i, ehbVar);
        int i2 = ehbVar.f37267a;
        if (i2 < 0) {
            uk9.m22782q("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return 0;
        }
        if (i2 == 0) {
            ehbVar.f37269c = "";
            return iM11184b;
        }
        ehbVar.f37269c = AbstractC0961e.m5407d(bArr, iM11184b, i2);
        return iM11184b + i2;
    }

    /* JADX INFO: renamed from: h */
    public static int m11190h(byte[] bArr, int i, ehb ehbVar) throws zzaeh {
        int iM11184b = m11184b(bArr, i, ehbVar);
        int i2 = ehbVar.f37267a;
        if (i2 < 0) {
            uk9.m22782q("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return 0;
        }
        if (i2 > bArr.length - iM11184b) {
            uk9.m22782q("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return 0;
        }
        if (i2 == 0) {
            ehbVar.f37269c = zzacr.f11869b;
            return iM11184b;
        }
        ehbVar.f37269c = zzacr.m5430l(bArr, iM11184b, i2);
        return iM11184b + i2;
    }

    /* JADX INFO: renamed from: i */
    public static int m11191i(Object obj, fjb fjbVar, byte[] bArr, int i, int i2, ehb ehbVar) throws zzaeh {
        int iM11185c = i + 1;
        int i3 = bArr[i];
        if (i3 < 0) {
            iM11185c = m11185c(i3, bArr, iM11185c, ehbVar);
            i3 = ehbVar.f37267a;
        }
        int i4 = iM11185c;
        if (i3 < 0 || i3 > i2 - i4) {
            uk9.m22782q("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return 0;
        }
        int i5 = ehbVar.f37270d + 1;
        ehbVar.f37270d = i5;
        if (i5 >= 100) {
            uk9.m22782q("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            return 0;
        }
        int i6 = i4 + i3;
        fjbVar.mo11898g(obj, bArr, i4, i6, ehbVar);
        ehbVar.f37270d--;
        ehbVar.f37269c = obj;
        return i6;
    }

    /* JADX INFO: renamed from: j */
    public static int m11192j(Object obj, fjb fjbVar, byte[] bArr, int i, int i2, int i3, ehb ehbVar) throws zzaeh {
        xib xibVar = (xib) fjbVar;
        int i4 = ehbVar.f37270d + 1;
        ehbVar.f37270d = i4;
        if (i4 >= 100) {
            uk9.m22782q("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            return 0;
        }
        int iM24554x = xibVar.m24554x(obj, bArr, i, i2, i3, ehbVar);
        ehbVar.f37270d--;
        ehbVar.f37269c = obj;
        return iM24554x;
    }

    /* JADX INFO: renamed from: k */
    public static int m11193k(int i, byte[] bArr, int i2, int i3, mib mibVar, ehb ehbVar) {
        xhb xhbVar = (xhb) mibVar;
        int iM11184b = m11184b(bArr, i2, ehbVar);
        xhbVar.m24523h(ehbVar.f37267a);
        while (iM11184b < i3) {
            int iM11184b2 = m11184b(bArr, iM11184b, ehbVar);
            if (i != ehbVar.f37267a) {
                break;
            }
            iM11184b = m11184b(bArr, iM11184b2, ehbVar);
            xhbVar.m24523h(ehbVar.f37267a);
        }
        return iM11184b;
    }

    /* JADX INFO: renamed from: l */
    public static int m11194l(byte[] bArr, int i, mib mibVar, ehb ehbVar) throws zzaeh {
        xhb xhbVar = (xhb) mibVar;
        int iM11184b = m11184b(bArr, i, ehbVar);
        int i2 = ehbVar.f37267a + iM11184b;
        while (iM11184b < i2) {
            iM11184b = m11184b(bArr, iM11184b, ehbVar);
            xhbVar.m24523h(ehbVar.f37267a);
        }
        if (iM11184b == i2) {
            return iM11184b;
        }
        uk9.m22782q("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        return 0;
    }

    /* JADX INFO: renamed from: m */
    public static int m11195m(fjb fjbVar, int i, byte[] bArr, int i2, int i3, mib mibVar, ehb ehbVar) throws zzaeh {
        whb whbVarZza = fjbVar.zza();
        fjb fjbVar2 = fjbVar;
        byte[] bArr2 = bArr;
        int i4 = i3;
        ehb ehbVar2 = ehbVar;
        int iM11191i = m11191i(whbVarZza, fjbVar2, bArr2, i2, i4, ehbVar2);
        fjbVar2.mo11892a(whbVarZza);
        ehbVar2.f37269c = whbVarZza;
        mibVar.add(whbVarZza);
        while (iM11191i < i4) {
            ehb ehbVar3 = ehbVar2;
            int i5 = i4;
            int iM11184b = m11184b(bArr2, iM11191i, ehbVar3);
            if (i != ehbVar3.f37267a) {
                break;
            }
            byte[] bArr3 = bArr2;
            fjb fjbVar3 = fjbVar2;
            whb whbVarZza2 = fjbVar3.zza();
            iM11191i = m11191i(whbVarZza2, fjbVar3, bArr3, iM11184b, i5, ehbVar3);
            fjbVar2 = fjbVar3;
            bArr2 = bArr3;
            i4 = i5;
            ehbVar2 = ehbVar3;
            fjbVar2.mo11892a(whbVarZza2);
            ehbVar2.f37269c = whbVarZza2;
            mibVar.add(whbVarZza2);
        }
        return iM11191i;
    }

    /* JADX INFO: renamed from: n */
    public static int m11196n(int i, byte[] bArr, int i2, int i3, ojb ojbVar, ehb ehbVar) throws zzaeh {
        if ((i >>> 3) == 0) {
            uk9.m22782q("Protocol message contained an invalid tag (zero).");
            return 0;
        }
        int i4 = i & 7;
        if (i4 == 0) {
            int iM11186d = m11186d(bArr, i2, ehbVar);
            ojbVar.m18051d(i, Long.valueOf(ehbVar.f37268b));
            return iM11186d;
        }
        if (i4 == 1) {
            ojbVar.m18051d(i, Long.valueOf(m11188f(i2, bArr)));
            return i2 + 8;
        }
        if (i4 == 2) {
            int iM11184b = m11184b(bArr, i2, ehbVar);
            int i5 = ehbVar.f37267a;
            if (i5 < 0) {
                uk9.m22782q("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                return 0;
            }
            if (i5 > bArr.length - iM11184b) {
                uk9.m22782q("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                return 0;
            }
            if (i5 == 0) {
                ojbVar.m18051d(i, zzacr.f11869b);
            } else {
                ojbVar.m18051d(i, zzacr.m5430l(bArr, iM11184b, i5));
            }
            return iM11184b + i5;
        }
        if (i4 != 3) {
            if (i4 == 5) {
                ojbVar.m18051d(i, Integer.valueOf(m11187e(i2, bArr)));
                return i2 + 4;
            }
            uk9.m22782q("Protocol message contained an invalid tag (zero).");
            return 0;
        }
        int i6 = (i & (-8)) | 4;
        ojb ojbVarM18048a = ojb.m18048a();
        int i7 = ehbVar.f37270d + 1;
        ehbVar.f37270d = i7;
        if (i7 >= 100) {
            uk9.m22782q("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            return 0;
        }
        int i8 = 0;
        while (i2 < i3) {
            int iM11184b2 = m11184b(bArr, i2, ehbVar);
            int i9 = ehbVar.f37267a;
            if (i9 == i6) {
                i8 = i9;
                i2 = iM11184b2;
                break;
            }
            i2 = m11196n(i9, bArr, iM11184b2, i3, ojbVarM18048a, ehbVar);
            i8 = i9;
        }
        ehbVar.f37270d--;
        if (i2 > i3 || i8 != i6) {
            uk9.m22782q("Failed to parse the message.");
            return 0;
        }
        ojbVar.m18051d(i, ojbVarM18048a);
        return i2;
    }

    /* JADX INFO: renamed from: o */
    public static int m11197o(int i, byte[] bArr, int i2, int i3, ehb ehbVar) throws zzaeh {
        if ((i >>> 3) == 0) {
            uk9.m22782q("Protocol message contained an invalid tag (zero).");
            return 0;
        }
        int i4 = i & 7;
        if (i4 == 0) {
            return m11186d(bArr, i2, ehbVar);
        }
        if (i4 == 1) {
            return i2 + 8;
        }
        if (i4 == 2) {
            return m11184b(bArr, i2, ehbVar) + ehbVar.f37267a;
        }
        if (i4 != 3) {
            if (i4 == 5) {
                return i2 + 4;
            }
            uk9.m22782q("Protocol message contained an invalid tag (zero).");
            return 0;
        }
        int i5 = (i & (-8)) | 4;
        int i6 = 0;
        while (i2 < i3) {
            i2 = m11184b(bArr, i2, ehbVar);
            i6 = ehbVar.f37267a;
            if (i6 == i5) {
                break;
            }
            i2 = m11197o(i6, bArr, i2, i3, ehbVar);
        }
        if (i2 <= i3 && i6 == i5) {
            return i2;
        }
        uk9.m22782q("Failed to parse the message.");
        return 0;
    }
}
