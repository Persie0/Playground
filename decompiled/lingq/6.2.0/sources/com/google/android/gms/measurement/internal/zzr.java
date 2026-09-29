package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.List;
import p000.C3670v2;
import p000.l70;
import p000.lda;

/* JADX INFO: loaded from: classes.dex */
public final class zzr extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzr> CREATOR = new C3670v2(24);

    /* JADX INFO: renamed from: H */
    public final int f12413H;

    /* JADX INFO: renamed from: I */
    public final boolean f12414I;

    /* JADX INFO: renamed from: J */
    public final boolean f12415J;

    /* JADX INFO: renamed from: K */
    public final Boolean f12416K;

    /* JADX INFO: renamed from: L */
    public final long f12417L;

    /* JADX INFO: renamed from: M */
    public final List f12418M;

    /* JADX INFO: renamed from: N */
    public final String f12419N;

    /* JADX INFO: renamed from: O */
    public final String f12420O;

    /* JADX INFO: renamed from: P */
    public final String f12421P;

    /* JADX INFO: renamed from: Q */
    public final boolean f12422Q;

    /* JADX INFO: renamed from: R */
    public final long f12423R;

    /* JADX INFO: renamed from: S */
    public final int f12424S;

    /* JADX INFO: renamed from: T */
    public final String f12425T;

    /* JADX INFO: renamed from: U */
    public final int f12426U;

    /* JADX INFO: renamed from: V */
    public final long f12427V;

    /* JADX INFO: renamed from: W */
    public final String f12428W;

    /* JADX INFO: renamed from: X */
    public final String f12429X;

    /* JADX INFO: renamed from: Y */
    public final long f12430Y;

    /* JADX INFO: renamed from: Z */
    public final int f12431Z;

    /* JADX INFO: renamed from: a */
    public final String f12432a;

    /* JADX INFO: renamed from: a0 */
    public final long f12433a0;

    /* JADX INFO: renamed from: b */
    public final String f12434b;

    /* JADX INFO: renamed from: c */
    public final String f12435c;

    /* JADX INFO: renamed from: d */
    public final String f12436d;

    /* JADX INFO: renamed from: e */
    public final long f12437e;

    /* JADX INFO: renamed from: f */
    public final long f12438f;

    /* JADX INFO: renamed from: g */
    public final String f12439g;

    /* JADX INFO: renamed from: h */
    public final boolean f12440h;

    /* JADX INFO: renamed from: i */
    public final boolean f12441i;

    /* JADX INFO: renamed from: j */
    public final long f12442j;

    /* JADX INFO: renamed from: k */
    public final String f12443k;

    /* JADX INFO: renamed from: l */
    public final long f12444l;

    public zzr(String str, String str2, String str3, long j, String str4, long j2, long j3, String str5, boolean z, boolean z2, String str6, long j4, int i, boolean z3, boolean z4, Boolean bool, long j5, List list, String str7, String str8, String str9, boolean z5, long j6, int i2, String str10, int i3, long j7, String str11, String str12, long j8, int i4, long j9) {
        lda.m16127m(str);
        this.f12432a = str;
        this.f12434b = true == TextUtils.isEmpty(str2) ? null : str2;
        this.f12435c = str3;
        this.f12442j = j;
        this.f12436d = str4;
        this.f12437e = j2;
        this.f12438f = j3;
        this.f12439g = str5;
        this.f12440h = z;
        this.f12441i = z2;
        this.f12443k = str6;
        this.f12444l = j4;
        this.f12413H = i;
        this.f12414I = z3;
        this.f12415J = z4;
        this.f12416K = bool;
        this.f12417L = j5;
        this.f12418M = list;
        this.f12419N = str7;
        this.f12420O = str8;
        this.f12421P = str9;
        this.f12422Q = z5;
        this.f12423R = j6;
        this.f12424S = i2;
        this.f12425T = str10;
        this.f12426U = i3;
        this.f12427V = j7;
        this.f12428W = str11;
        this.f12429X = str12;
        this.f12430Y = j8;
        this.f12431Z = i4;
        this.f12433a0 = j9;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM15937a0 = l70.m15937a0(parcel, 20293);
        l70.m15930U(parcel, 2, this.f12432a);
        l70.m15930U(parcel, 3, this.f12434b);
        l70.m15930U(parcel, 4, this.f12435c);
        l70.m15930U(parcel, 5, this.f12436d);
        l70.m15935Z(parcel, 6, 8);
        parcel.writeLong(this.f12437e);
        l70.m15935Z(parcel, 7, 8);
        parcel.writeLong(this.f12438f);
        l70.m15930U(parcel, 8, this.f12439g);
        l70.m15935Z(parcel, 9, 4);
        parcel.writeInt(this.f12440h ? 1 : 0);
        l70.m15935Z(parcel, 10, 4);
        parcel.writeInt(this.f12441i ? 1 : 0);
        l70.m15935Z(parcel, 11, 8);
        parcel.writeLong(this.f12442j);
        l70.m15930U(parcel, 12, this.f12443k);
        l70.m15935Z(parcel, 14, 8);
        parcel.writeLong(this.f12444l);
        l70.m15935Z(parcel, 15, 4);
        parcel.writeInt(this.f12413H);
        l70.m15935Z(parcel, 16, 4);
        parcel.writeInt(this.f12414I ? 1 : 0);
        l70.m15935Z(parcel, 18, 4);
        parcel.writeInt(this.f12415J ? 1 : 0);
        Boolean bool = this.f12416K;
        if (bool != null) {
            l70.m15935Z(parcel, 21, 4);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        l70.m15935Z(parcel, 22, 8);
        parcel.writeLong(this.f12417L);
        l70.m15932W(parcel, 23, this.f12418M);
        l70.m15930U(parcel, 25, this.f12419N);
        l70.m15930U(parcel, 26, this.f12420O);
        l70.m15930U(parcel, 27, this.f12421P);
        l70.m15935Z(parcel, 28, 4);
        parcel.writeInt(this.f12422Q ? 1 : 0);
        l70.m15935Z(parcel, 29, 8);
        parcel.writeLong(this.f12423R);
        l70.m15935Z(parcel, 30, 4);
        parcel.writeInt(this.f12424S);
        l70.m15930U(parcel, 31, this.f12425T);
        l70.m15935Z(parcel, 32, 4);
        parcel.writeInt(this.f12426U);
        l70.m15935Z(parcel, 34, 8);
        parcel.writeLong(this.f12427V);
        l70.m15930U(parcel, 35, this.f12428W);
        l70.m15930U(parcel, 36, this.f12429X);
        l70.m15935Z(parcel, 37, 8);
        parcel.writeLong(this.f12430Y);
        l70.m15935Z(parcel, 38, 4);
        parcel.writeInt(this.f12431Z);
        l70.m15935Z(parcel, 39, 8);
        parcel.writeLong(this.f12433a0);
        l70.m15939b0(parcel, iM15937a0);
    }

    public zzr(String str, String str2, String str3, String str4, long j, long j2, String str5, boolean z, boolean z2, long j3, String str6, long j4, int i, boolean z3, boolean z4, Boolean bool, long j5, ArrayList arrayList, String str7, String str8, String str9, boolean z5, long j6, int i2, String str10, int i3, long j7, String str11, String str12, long j8, int i4, long j9) {
        this.f12432a = str;
        this.f12434b = str2;
        this.f12435c = str3;
        this.f12442j = j3;
        this.f12436d = str4;
        this.f12437e = j;
        this.f12438f = j2;
        this.f12439g = str5;
        this.f12440h = z;
        this.f12441i = z2;
        this.f12443k = str6;
        this.f12444l = j4;
        this.f12413H = i;
        this.f12414I = z3;
        this.f12415J = z4;
        this.f12416K = bool;
        this.f12417L = j5;
        this.f12418M = arrayList;
        this.f12419N = str7;
        this.f12420O = str8;
        this.f12421P = str9;
        this.f12422Q = z5;
        this.f12423R = j6;
        this.f12424S = i2;
        this.f12425T = str10;
        this.f12426U = i3;
        this.f12427V = j7;
        this.f12428W = str11;
        this.f12429X = str12;
        this.f12430Y = j8;
        this.f12431Z = i4;
        this.f12433a0 = j9;
    }
}
