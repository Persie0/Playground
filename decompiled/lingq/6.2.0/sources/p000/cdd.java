package p000;

import com.google.android.gms.internal.measurement.zzacr;
import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class cdd {

    /* JADX INFO: renamed from: a */
    public final boolean f9947a;

    /* JADX INFO: renamed from: b */
    public final List f9948b;

    /* JADX INFO: renamed from: c */
    public final zzacr f9949c;

    /* JADX INFO: renamed from: d */
    public final String f9950d;

    /* JADX INFO: renamed from: e */
    public final String f9951e;

    /* JADX INFO: renamed from: f */
    public final List f9952f;

    /* JADX INFO: renamed from: g */
    public final List f9953g;

    /* JADX INFO: renamed from: h */
    public final boolean f9954h;

    /* JADX INFO: renamed from: i */
    public final boolean f9955i;

    /* JADX INFO: renamed from: j */
    public final boolean f9956j;

    /* JADX INFO: renamed from: k */
    public final f4d f9957k;

    public cdd(boolean z, ImmutableList immutableList, zzacr zzacrVar, String str, String str2, ImmutableList immutableList2, ImmutableList immutableList3, boolean z2, boolean z3, boolean z4, f4d f4dVar) {
        immutableList.getClass();
        zzacrVar.getClass();
        str.getClass();
        str2.getClass();
        immutableList2.getClass();
        immutableList3.getClass();
        f4dVar.getClass();
        this.f9947a = z;
        this.f9948b = immutableList;
        this.f9949c = zzacrVar;
        this.f9950d = str;
        this.f9951e = str2;
        this.f9952f = immutableList2;
        this.f9953g = immutableList3;
        this.f9954h = z2;
        this.f9955i = z3;
        this.f9956j = z4;
        this.f9957k = f4dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cdd)) {
            return false;
        }
        cdd cddVar = (cdd) obj;
        return this.f9947a == cddVar.f9947a && fa4.m11650l(this.f9948b, cddVar.f9948b) && fa4.m11650l(this.f9949c, cddVar.f9949c) && fa4.m11650l(this.f9950d, cddVar.f9950d) && fa4.m11650l(this.f9951e, cddVar.f9951e) && fa4.m11650l(this.f9952f, cddVar.f9952f) && fa4.m11650l(this.f9953g, cddVar.f9953g) && this.f9954h == cddVar.f9954h && this.f9955i == cddVar.f9955i && this.f9956j == cddVar.f9956j && fa4.m11650l(this.f9957k, cddVar.f9957k);
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.f9947a), this.f9948b, this.f9949c, this.f9950d, this.f9951e, this.f9952f, this.f9953g, Boolean.valueOf(this.f9954h), Boolean.valueOf(this.f9955i), Boolean.valueOf(this.f9956j));
    }

    public final String toString() {
        boolean z = this.f9947a;
        int length = String.valueOf(z).length();
        List list = this.f9948b;
        int length2 = String.valueOf(list).length();
        zzacr zzacrVar = this.f9949c;
        int length3 = String.valueOf(zzacrVar).length();
        String str = this.f9950d;
        int length4 = String.valueOf(str).length();
        String str2 = this.f9951e;
        int length5 = String.valueOf(str2).length();
        List list2 = this.f9952f;
        int length6 = String.valueOf(list2).length();
        List list3 = this.f9953g;
        int length7 = String.valueOf(list3).length();
        boolean z2 = this.f9954h;
        int length8 = String.valueOf(z2).length();
        boolean z3 = this.f9955i;
        int length9 = String.valueOf(z3).length();
        boolean z4 = this.f9956j;
        int length10 = String.valueOf(z4).length();
        f4d f4dVar = this.f9957k;
        StringBuilder sb = new StringBuilder(length + 59 + length2 + 9 + length3 + 10 + length4 + 17 + length5 + 30 + length6 + 30 + length7 + 24 + length8 + 26 + length9 + 20 + length10 + 14 + String.valueOf(f4dVar).length() + 1);
        sb.append("SharedStorageInfo(shouldUseSharedStorage=");
        sb.append(z);
        sb.append(", enabledBackings=");
        sb.append(list);
        sb.append(", secret=");
        sb.append(zzacrVar);
        sb.append(", dirPath=");
        sb.append(str);
        sb.append(", gmsCoreDirPath=");
        sb.append(str2);
        sb.append(", includeStaticConfigPackages=");
        sb.append(list2);
        sb.append(", excludeStaticConfigPackages=");
        sb.append(list3);
        sb.append(", hasStorageInfoFromGms=");
        sb.append(z2);
        sb.append(", allowEmptySnapshotToken=");
        sb.append(z3);
        sb.append(", enableCommitV2Api=");
        sb.append(z4);
        sb.append(", clientFlags=");
        sb.append(f4dVar);
        sb.append(")");
        return sb.toString();
    }
}
