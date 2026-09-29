package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.fragment.app.C0987y;
import cc.C1927r7;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.List;
import p176ib.C6272i;

/* JADX INFO: loaded from: classes.dex */
public final class zzq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzq> CREATOR = new C1927r7();

    /* JADX INFO: renamed from: H */
    public final long f14624H;

    /* JADX INFO: renamed from: I */
    public final int f14625I;

    /* JADX INFO: renamed from: J */
    public final boolean f14626J;

    /* JADX INFO: renamed from: K */
    public final boolean f14627K;

    /* JADX INFO: renamed from: L */
    public final String f14628L;

    /* JADX INFO: renamed from: M */
    public final Boolean f14629M;

    /* JADX INFO: renamed from: N */
    public final long f14630N;

    /* JADX INFO: renamed from: O */
    public final List f14631O;

    /* JADX INFO: renamed from: P */
    public final String f14632P;

    /* JADX INFO: renamed from: Q */
    public final String f14633Q;

    /* JADX INFO: renamed from: R */
    public final String f14634R;

    /* JADX INFO: renamed from: S */
    public final String f14635S;

    /* JADX INFO: renamed from: T */
    public final boolean f14636T;

    /* JADX INFO: renamed from: U */
    public final long f14637U;

    /* JADX INFO: renamed from: a */
    public final String f14638a;

    /* JADX INFO: renamed from: b */
    public final String f14639b;

    /* JADX INFO: renamed from: c */
    public final String f14640c;

    /* JADX INFO: renamed from: d */
    public final String f14641d;

    /* JADX INFO: renamed from: e */
    public final long f14642e;

    /* JADX INFO: renamed from: f */
    public final long f14643f;

    /* JADX INFO: renamed from: g */
    public final String f14644g;

    /* JADX INFO: renamed from: h */
    public final boolean f14645h;

    /* JADX INFO: renamed from: i */
    public final boolean f14646i;

    /* JADX INFO: renamed from: j */
    public final long f14647j;

    /* JADX INFO: renamed from: k */
    public final String f14648k;

    /* JADX INFO: renamed from: l */
    @Deprecated
    public final long f14649l;

    public zzq(String str, String str2, String str3, long j10, String str4, long j11, long j12, String str5, boolean z10, boolean z11, String str6, long j13, int i10, boolean z12, boolean z13, String str7, Boolean bool, long j14, List list, String str8, String str9, String str10, boolean z14, long j15) {
        C6272i.m12912f(str);
        this.f14638a = str;
        this.f14639b = true == TextUtils.isEmpty(str2) ? null : str2;
        this.f14640c = str3;
        this.f14647j = j10;
        this.f14641d = str4;
        this.f14642e = j11;
        this.f14643f = j12;
        this.f14644g = str5;
        this.f14645h = z10;
        this.f14646i = z11;
        this.f14648k = str6;
        this.f14649l = 0L;
        this.f14624H = j13;
        this.f14625I = i10;
        this.f14626J = z12;
        this.f14627K = z13;
        this.f14628L = str7;
        this.f14629M = bool;
        this.f14630N = j14;
        this.f14631O = list;
        this.f14632P = null;
        this.f14633Q = str8;
        this.f14634R = str9;
        this.f14635S = str10;
        this.f14636T = z14;
        this.f14637U = j15;
    }

    public zzq(String str, String str2, String str3, String str4, long j10, long j11, String str5, boolean z10, boolean z11, long j12, String str6, long j13, long j14, int i10, boolean z12, boolean z13, String str7, Boolean bool, long j15, ArrayList arrayList, String str8, String str9, String str10, String str11, boolean z14, long j16) {
        this.f14638a = str;
        this.f14639b = str2;
        this.f14640c = str3;
        this.f14647j = j12;
        this.f14641d = str4;
        this.f14642e = j10;
        this.f14643f = j11;
        this.f14644g = str5;
        this.f14645h = z10;
        this.f14646i = z11;
        this.f14648k = str6;
        this.f14649l = j13;
        this.f14624H = j14;
        this.f14625I = i10;
        this.f14626J = z12;
        this.f14627K = z13;
        this.f14628L = str7;
        this.f14629M = bool;
        this.f14630N = j15;
        this.f14631O = arrayList;
        this.f14632P = str8;
        this.f14633Q = str9;
        this.f14634R = str10;
        this.f14635S = str11;
        this.f14636T = z14;
        this.f14637U = j16;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM3836r = C0987y.m3836r(parcel, 20293);
        C0987y.m3832n(parcel, 2, this.f14638a);
        C0987y.m3832n(parcel, 3, this.f14639b);
        C0987y.m3832n(parcel, 4, this.f14640c);
        C0987y.m3832n(parcel, 5, this.f14641d);
        C0987y.m3830l(parcel, 6, this.f14642e);
        C0987y.m3830l(parcel, 7, this.f14643f);
        C0987y.m3832n(parcel, 8, this.f14644g);
        C0987y.m3826h(parcel, 9, this.f14645h);
        C0987y.m3826h(parcel, 10, this.f14646i);
        C0987y.m3830l(parcel, 11, this.f14647j);
        C0987y.m3832n(parcel, 12, this.f14648k);
        C0987y.m3830l(parcel, 13, this.f14649l);
        C0987y.m3830l(parcel, 14, this.f14624H);
        C0987y.m3829k(parcel, 15, this.f14625I);
        C0987y.m3826h(parcel, 16, this.f14626J);
        C0987y.m3826h(parcel, 18, this.f14627K);
        C0987y.m3832n(parcel, 19, this.f14628L);
        Boolean bool = this.f14629M;
        if (bool != null) {
            parcel.writeInt(262165);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        C0987y.m3830l(parcel, 22, this.f14630N);
        List<String> list = this.f14631O;
        if (list != null) {
            int iM3836r2 = C0987y.m3836r(parcel, 23);
            parcel.writeStringList(list);
            C0987y.m3839u(parcel, iM3836r2);
        }
        C0987y.m3832n(parcel, 24, this.f14632P);
        C0987y.m3832n(parcel, 25, this.f14633Q);
        C0987y.m3832n(parcel, 26, this.f14634R);
        C0987y.m3832n(parcel, 27, this.f14635S);
        C0987y.m3826h(parcel, 28, this.f14636T);
        C0987y.m3830l(parcel, 29, this.f14637U);
        C0987y.m3839u(parcel, iM3836r);
    }
}
