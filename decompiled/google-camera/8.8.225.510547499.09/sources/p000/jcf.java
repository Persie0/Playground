package p000;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p021j$.nio.charset.StandardCharsets;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jcf extends jij {
    public static final Parcelable.Creator CREATOR = new jbt(2);

    /* JADX INFO: renamed from: l */
    private static final String[] f33703l = new String[0];

    /* JADX INFO: renamed from: a */
    public final jcs f33704a;

    /* JADX INFO: renamed from: b */
    public final byte[] f33705b;

    /* JADX INFO: renamed from: c */
    public final int[] f33706c;

    /* JADX INFO: renamed from: d */
    public final String[] f33707d;

    /* JADX INFO: renamed from: e */
    public final int[] f33708e;

    /* JADX INFO: renamed from: f */
    public final byte[][] f33709f;

    /* JADX INFO: renamed from: g */
    public final jod[] f33710g;

    /* JADX INFO: renamed from: h */
    public final boolean f33711h;

    /* JADX INFO: renamed from: i */
    public jcr f33712i;

    /* JADX INFO: renamed from: j */
    public final int f33713j;

    /* JADX INFO: renamed from: k */
    public final ogy f33714k;

    /* JADX INFO: renamed from: m */
    private final String[] f33715m;

    public jcf(jcs jcsVar, ogy ogyVar, byte[] bArr, int[] iArr, String[] strArr, int[] iArr2, int i) {
        this.f33704a = jcsVar;
        this.f33714k = ogyVar;
        this.f33705b = bArr;
        this.f33706c = iArr;
        this.f33707d = strArr;
        this.f33708e = iArr2;
        this.f33709f = null;
        this.f33710g = null;
        this.f33711h = true;
        this.f33715m = null;
        this.f33713j = i;
    }

    public jcf(jcs jcsVar, byte[] bArr, int[] iArr, String[] strArr, int[] iArr2, byte[][] bArr2, boolean z, jod[] jodVarArr, jcr jcrVar, String[] strArr2, int i) {
        this.f33704a = jcsVar;
        this.f33705b = bArr;
        this.f33706c = iArr;
        this.f33707d = strArr;
        this.f33708e = iArr2;
        this.f33709f = bArr2;
        this.f33711h = z;
        this.f33710g = jodVarArr;
        this.f33712i = jcrVar;
        this.f33715m = strArr2;
        this.f33713j = i;
        this.f33714k = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof jcf) {
            jcf jcfVar = (jcf) obj;
            if (jib.m13209n(this.f33704a, jcfVar.f33704a) && Arrays.equals(this.f33705b, jcfVar.f33705b) && Arrays.equals(this.f33706c, jcfVar.f33706c) && Arrays.equals(this.f33707d, jcfVar.f33707d) && jib.m13209n(this.f33714k, jcfVar.f33714k) && Arrays.equals(this.f33708e, jcfVar.f33708e) && Arrays.deepEquals(this.f33709f, jcfVar.f33709f) && Arrays.equals(this.f33710g, jcfVar.f33710g) && Arrays.equals(this.f33715m, jcfVar.f33715m) && this.f33711h == jcfVar.f33711h && jib.m13209n(this.f33712i, jcfVar.f33712i) && this.f33713j == jcfVar.f33713j) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f33704a, this.f33705b, this.f33706c, this.f33707d, this.f33714k, this.f33708e, this.f33709f, this.f33710g, Boolean.valueOf(this.f33711h), this.f33715m, this.f33712i, Integer.valueOf(this.f33713j)});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LogEventParcelable[");
        sb.append(this.f33704a);
        sb.append(", LogEventBytes: ");
        byte[] bArr = this.f33705b;
        sb.append(bArr == null ? null : new String(bArr, StandardCharsets.UTF_8));
        sb.append(", TestCodes: ");
        sb.append(Arrays.toString(this.f33706c));
        sb.append(", MendelPackages: ");
        sb.append(Arrays.toString(this.f33707d));
        sb.append(", LogEvent: ");
        sb.append(this.f33714k);
        sb.append(", , ExperimentIDs: ");
        sb.append(Arrays.toString(this.f33708e));
        sb.append(", ExperimentTokens: ");
        sb.append(Arrays.deepToString(this.f33709f));
        sb.append(", ExperimentTokensParcelables: ");
        sb.append(Arrays.toString(this.f33710g));
        sb.append(", MendelPackagesToFilter: ");
        sb.append(Arrays.toString(this.f33715m));
        sb.append("AddPhenotypeExperimentTokens: ");
        sb.append(this.f33711h);
        sb.append(", LogVerifierResult: ");
        jcr jcrVar = this.f33712i;
        sb.append(jcrVar != null ? jcrVar.toString() : null);
        sb.append("EventCode: ");
        sb.append(this.f33713j);
        sb.append("]");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM13281h = jiy.m13281h(parcel);
        jiy.m13295v(parcel, 2, this.f33704a, i);
        jiy.m13290q(parcel, 3, this.f33705b);
        jiy.m13293t(parcel, 4, this.f33706c);
        jiy.m13297x(parcel, 5, this.f33707d);
        jiy.m13293t(parcel, 6, this.f33708e);
        jiy.m13291r(parcel, 7, this.f33709f);
        jiy.m13284k(parcel, 8, this.f33711h);
        jiy.m13299z(parcel, 9, this.f33710g, i);
        jiy.m13295v(parcel, 11, this.f33712i, i);
        String[] strArr = this.f33715m;
        if (strArr == null) {
            strArr = f33703l;
        }
        jiy.m13297x(parcel, 12, strArr);
        jiy.m13287n(parcel, 13, this.f33713j);
        jiy.m13283j(parcel, iM13281h);
    }
}
