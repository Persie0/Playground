package p000;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.measurement.internal.zzaf;
import com.google.android.gms.measurement.internal.zzah;
import com.google.android.gms.measurement.internal.zzao;
import com.google.android.gms.measurement.internal.zzbh;
import com.google.android.gms.measurement.internal.zzoo;
import com.google.android.gms.measurement.internal.zzpl;
import com.google.android.gms.measurement.internal.zzr;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class f9c extends mcb implements q9c {
    public f9c(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IMeasurementService", 6);
    }

    @Override // p000.q9c
    /* JADX INFO: renamed from: A */
    public final void mo11283A(zzbh zzbhVar, zzr zzrVar) {
        Parcel parcelM16773J = m16773J();
        bqb.m4106c(parcelM16773J, zzbhVar);
        bqb.m4106c(parcelM16773J, zzrVar);
        m16776M(parcelM16773J, 1);
    }

    @Override // p000.q9c
    /* JADX INFO: renamed from: B */
    public final String mo11284B(zzr zzrVar) {
        Parcel parcelM16773J = m16773J();
        bqb.m4106c(parcelM16773J, zzrVar);
        Parcel parcelM16772I = m16772I(parcelM16773J, 11);
        String string = parcelM16772I.readString();
        parcelM16772I.recycle();
        return string;
    }

    @Override // p000.q9c
    /* JADX INFO: renamed from: C */
    public final List mo11285C(String str, String str2, zzr zzrVar) {
        Parcel parcelM16773J = m16773J();
        parcelM16773J.writeString(str);
        parcelM16773J.writeString(str2);
        bqb.m4106c(parcelM16773J, zzrVar);
        Parcel parcelM16772I = m16772I(parcelM16773J, 16);
        ArrayList arrayListCreateTypedArrayList = parcelM16772I.createTypedArrayList(zzah.CREATOR);
        parcelM16772I.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // p000.q9c
    /* JADX INFO: renamed from: D */
    public final void mo11286D(zzr zzrVar) {
        Parcel parcelM16773J = m16773J();
        bqb.m4106c(parcelM16773J, zzrVar);
        m16776M(parcelM16773J, 20);
    }

    @Override // p000.q9c
    /* JADX INFO: renamed from: a */
    public final List mo11291a(String str, String str2, String str3, boolean z) {
        Parcel parcelM16773J = m16773J();
        parcelM16773J.writeString(null);
        parcelM16773J.writeString(str2);
        parcelM16773J.writeString(str3);
        ClassLoader classLoader = bqb.f8878a;
        parcelM16773J.writeInt(z ? 1 : 0);
        Parcel parcelM16772I = m16772I(parcelM16773J, 15);
        ArrayList arrayListCreateTypedArrayList = parcelM16772I.createTypedArrayList(zzpl.CREATOR);
        parcelM16772I.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // p000.q9c
    /* JADX INFO: renamed from: c */
    public final void mo11292c(zzah zzahVar, zzr zzrVar) {
        Parcel parcelM16773J = m16773J();
        bqb.m4106c(parcelM16773J, zzahVar);
        bqb.m4106c(parcelM16773J, zzrVar);
        m16776M(parcelM16773J, 12);
    }

    @Override // p000.q9c
    /* JADX INFO: renamed from: g */
    public final void mo11293g(long j, String str, String str2, String str3) {
        Parcel parcelM16773J = m16773J();
        parcelM16773J.writeLong(j);
        parcelM16773J.writeString(str);
        parcelM16773J.writeString(str2);
        parcelM16773J.writeString(str3);
        m16776M(parcelM16773J, 10);
    }

    @Override // p000.q9c
    /* JADX INFO: renamed from: i */
    public final void mo11294i(zzr zzrVar) {
        Parcel parcelM16773J = m16773J();
        bqb.m4106c(parcelM16773J, zzrVar);
        m16776M(parcelM16773J, 18);
    }

    @Override // p000.q9c
    /* JADX INFO: renamed from: j */
    public final void mo11295j(zzr zzrVar, Bundle bundle, cac cacVar) {
        Parcel parcelM16773J = m16773J();
        bqb.m4106c(parcelM16773J, zzrVar);
        bqb.m4106c(parcelM16773J, bundle);
        bqb.m4107d(parcelM16773J, cacVar);
        m16776M(parcelM16773J, 31);
    }

    @Override // p000.q9c
    /* JADX INFO: renamed from: k */
    public final List mo11296k(String str, String str2, String str3) {
        Parcel parcelM16773J = m16773J();
        parcelM16773J.writeString(null);
        parcelM16773J.writeString(str2);
        parcelM16773J.writeString(str3);
        Parcel parcelM16772I = m16772I(parcelM16773J, 17);
        ArrayList arrayListCreateTypedArrayList = parcelM16772I.createTypedArrayList(zzah.CREATOR);
        parcelM16772I.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // p000.q9c
    /* JADX INFO: renamed from: l */
    public final void mo11297l(zzr zzrVar, zzoo zzooVar, oac oacVar) {
        Parcel parcelM16773J = m16773J();
        bqb.m4106c(parcelM16773J, zzrVar);
        bqb.m4106c(parcelM16773J, zzooVar);
        bqb.m4107d(parcelM16773J, oacVar);
        m16776M(parcelM16773J, 29);
    }

    @Override // p000.q9c
    /* JADX INFO: renamed from: m */
    public final byte[] mo11298m(zzbh zzbhVar, String str) {
        Parcel parcelM16773J = m16773J();
        bqb.m4106c(parcelM16773J, zzbhVar);
        parcelM16773J.writeString(str);
        Parcel parcelM16772I = m16772I(parcelM16773J, 9);
        byte[] bArrCreateByteArray = parcelM16772I.createByteArray();
        parcelM16772I.recycle();
        return bArrCreateByteArray;
    }

    @Override // p000.q9c
    /* JADX INFO: renamed from: n */
    public final void mo11299n(zzr zzrVar) {
        Parcel parcelM16773J = m16773J();
        bqb.m4106c(parcelM16773J, zzrVar);
        m16776M(parcelM16773J, 25);
    }

    @Override // p000.q9c
    /* JADX INFO: renamed from: o */
    public final void mo11300o(zzr zzrVar) {
        Parcel parcelM16773J = m16773J();
        bqb.m4106c(parcelM16773J, zzrVar);
        m16776M(parcelM16773J, 6);
    }

    @Override // p000.q9c
    /* JADX INFO: renamed from: p */
    public final void mo11301p(zzr zzrVar) {
        Parcel parcelM16773J = m16773J();
        bqb.m4106c(parcelM16773J, zzrVar);
        m16776M(parcelM16773J, 26);
    }

    @Override // p000.q9c
    /* JADX INFO: renamed from: q */
    public final void mo11302q(zzr zzrVar, zzaf zzafVar) {
        Parcel parcelM16773J = m16773J();
        bqb.m4106c(parcelM16773J, zzrVar);
        bqb.m4106c(parcelM16773J, zzafVar);
        m16776M(parcelM16773J, 30);
    }

    @Override // p000.q9c
    /* JADX INFO: renamed from: r */
    public final void mo11303r(zzpl zzplVar, zzr zzrVar) {
        Parcel parcelM16773J = m16773J();
        bqb.m4106c(parcelM16773J, zzplVar);
        bqb.m4106c(parcelM16773J, zzrVar);
        m16776M(parcelM16773J, 2);
    }

    @Override // p000.q9c
    /* JADX INFO: renamed from: s */
    public final zzao mo11304s(zzr zzrVar) {
        Parcel parcelM16773J = m16773J();
        bqb.m4106c(parcelM16773J, zzrVar);
        Parcel parcelM16772I = m16772I(parcelM16773J, 21);
        zzao zzaoVar = (zzao) bqb.m4105b(parcelM16772I, zzao.CREATOR);
        parcelM16772I.recycle();
        return zzaoVar;
    }

    @Override // p000.q9c
    /* JADX INFO: renamed from: t */
    public final void mo11305t(Bundle bundle, zzr zzrVar) {
        Parcel parcelM16773J = m16773J();
        bqb.m4106c(parcelM16773J, bundle);
        bqb.m4106c(parcelM16773J, zzrVar);
        m16776M(parcelM16773J, 19);
    }

    @Override // p000.q9c
    /* JADX INFO: renamed from: v */
    public final void mo11306v(zzr zzrVar) {
        Parcel parcelM16773J = m16773J();
        bqb.m4106c(parcelM16773J, zzrVar);
        m16776M(parcelM16773J, 4);
    }

    @Override // p000.q9c
    /* JADX INFO: renamed from: x */
    public final void mo11307x(zzr zzrVar) {
        Parcel parcelM16773J = m16773J();
        bqb.m4106c(parcelM16773J, zzrVar);
        m16776M(parcelM16773J, 27);
    }

    @Override // p000.q9c
    /* JADX INFO: renamed from: z */
    public final List mo11308z(String str, String str2, boolean z, zzr zzrVar) {
        Parcel parcelM16773J = m16773J();
        parcelM16773J.writeString(str);
        parcelM16773J.writeString(str2);
        ClassLoader classLoader = bqb.f8878a;
        parcelM16773J.writeInt(z ? 1 : 0);
        bqb.m4106c(parcelM16773J, zzrVar);
        Parcel parcelM16772I = m16772I(parcelM16773J, 14);
        ArrayList arrayListCreateTypedArrayList = parcelM16772I.createTypedArrayList(zzpl.CREATOR);
        parcelM16772I.recycle();
        return arrayListCreateTypedArrayList;
    }
}
