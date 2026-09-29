package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.C0987y;
import cc.C1784c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p176ib.C6272i;

/* JADX INFO: loaded from: classes.dex */
public final class zzac extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzac> CREATOR = new C1784c();

    /* JADX INFO: renamed from: a */
    public String f14601a;

    /* JADX INFO: renamed from: b */
    public String f14602b;

    /* JADX INFO: renamed from: c */
    public zzli f14603c;

    /* JADX INFO: renamed from: d */
    public long f14604d;

    /* JADX INFO: renamed from: e */
    public boolean f14605e;

    /* JADX INFO: renamed from: f */
    public String f14606f;

    /* JADX INFO: renamed from: g */
    public final zzaw f14607g;

    /* JADX INFO: renamed from: h */
    public long f14608h;

    /* JADX INFO: renamed from: i */
    public zzaw f14609i;

    /* JADX INFO: renamed from: j */
    public final long f14610j;

    /* JADX INFO: renamed from: k */
    public final zzaw f14611k;

    public zzac(zzac zzacVar) {
        C6272i.m12915i(zzacVar);
        this.f14601a = zzacVar.f14601a;
        this.f14602b = zzacVar.f14602b;
        this.f14603c = zzacVar.f14603c;
        this.f14604d = zzacVar.f14604d;
        this.f14605e = zzacVar.f14605e;
        this.f14606f = zzacVar.f14606f;
        this.f14607g = zzacVar.f14607g;
        this.f14608h = zzacVar.f14608h;
        this.f14609i = zzacVar.f14609i;
        this.f14610j = zzacVar.f14610j;
        this.f14611k = zzacVar.f14611k;
    }

    public zzac(String str, String str2, zzli zzliVar, long j10, boolean z10, String str3, zzaw zzawVar, long j11, zzaw zzawVar2, long j12, zzaw zzawVar3) {
        this.f14601a = str;
        this.f14602b = str2;
        this.f14603c = zzliVar;
        this.f14604d = j10;
        this.f14605e = z10;
        this.f14606f = str3;
        this.f14607g = zzawVar;
        this.f14608h = j11;
        this.f14609i = zzawVar2;
        this.f14610j = j12;
        this.f14611k = zzawVar3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM3836r = C0987y.m3836r(parcel, 20293);
        C0987y.m3832n(parcel, 2, this.f14601a);
        C0987y.m3832n(parcel, 3, this.f14602b);
        C0987y.m3831m(parcel, 4, this.f14603c, i10);
        C0987y.m3830l(parcel, 5, this.f14604d);
        C0987y.m3826h(parcel, 6, this.f14605e);
        C0987y.m3832n(parcel, 7, this.f14606f);
        C0987y.m3831m(parcel, 8, this.f14607g, i10);
        C0987y.m3830l(parcel, 9, this.f14608h);
        C0987y.m3831m(parcel, 10, this.f14609i, i10);
        C0987y.m3830l(parcel, 11, this.f14610j);
        C0987y.m3831m(parcel, 12, this.f14611k, i10);
        C0987y.m3839u(parcel, iM3836r);
    }
}
