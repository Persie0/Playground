package com.google.android.gms.clearcut;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.clearcut.zzr;
import com.google.android.gms.phenotype.ExperimentTokens;
import java.util.Arrays;
import p000.AbstractC3393o1;
import p000.l70;
import p000.mec;
import p000.qmb;
import p000.x74;

/* JADX INFO: loaded from: classes2.dex */
public final class zze extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zze> CREATOR = new qmb(9);

    /* JADX INFO: renamed from: a */
    public final zzr f11624a;

    /* JADX INFO: renamed from: b */
    public byte[] f11625b;

    /* JADX INFO: renamed from: c */
    public final int[] f11626c;

    /* JADX INFO: renamed from: d */
    public final String[] f11627d;

    /* JADX INFO: renamed from: e */
    public final int[] f11628e;

    /* JADX INFO: renamed from: f */
    public final byte[][] f11629f;

    /* JADX INFO: renamed from: g */
    public final ExperimentTokens[] f11630g;

    /* JADX INFO: renamed from: h */
    public final boolean f11631h;

    /* JADX INFO: renamed from: i */
    public final mec f11632i;

    public zze(zzr zzrVar, byte[] bArr, int[] iArr, String[] strArr, int[] iArr2, byte[][] bArr2, boolean z, ExperimentTokens[] experimentTokensArr) {
        this.f11624a = zzrVar;
        this.f11625b = bArr;
        this.f11626c = iArr;
        this.f11627d = strArr;
        this.f11632i = null;
        this.f11628e = iArr2;
        this.f11629f = bArr2;
        this.f11630g = experimentTokensArr;
        this.f11631h = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zze) {
            zze zzeVar = (zze) obj;
            if (x74.m24360q(this.f11624a, zzeVar.f11624a) && Arrays.equals(this.f11625b, zzeVar.f11625b) && Arrays.equals(this.f11626c, zzeVar.f11626c) && Arrays.equals(this.f11627d, zzeVar.f11627d) && x74.m24360q(this.f11632i, zzeVar.f11632i) && x74.m24360q(null, null) && x74.m24360q(null, null) && Arrays.equals(this.f11628e, zzeVar.f11628e) && Arrays.deepEquals(this.f11629f, zzeVar.f11629f) && Arrays.equals(this.f11630g, zzeVar.f11630g) && this.f11631h == zzeVar.f11631h) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11624a, this.f11625b, this.f11626c, this.f11627d, this.f11632i, null, null, this.f11628e, this.f11629f, this.f11630g, Boolean.valueOf(this.f11631h)});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LogEventParcelable[");
        sb.append(this.f11624a);
        sb.append(", LogEventBytes: ");
        byte[] bArr = this.f11625b;
        sb.append(bArr == null ? null : new String(bArr));
        sb.append(", TestCodes: ");
        sb.append(Arrays.toString(this.f11626c));
        sb.append(", MendelPackages: ");
        sb.append(Arrays.toString(this.f11627d));
        sb.append(", LogEvent: ");
        sb.append(this.f11632i);
        sb.append(", ExtensionProducer: null, VeProducer: null, ExperimentIDs: ");
        sb.append(Arrays.toString(this.f11628e));
        sb.append(", ExperimentTokens: ");
        sb.append(Arrays.toString(this.f11629f));
        sb.append(", ExperimentTokensParcelables: ");
        sb.append(Arrays.toString(this.f11630g));
        sb.append(", AddPhenotypeExperimentTokens: ");
        return AbstractC3393o1.m17740o(sb, this.f11631h, "]");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM15937a0 = l70.m15937a0(parcel, 20293);
        l70.m15929T(parcel, 2, this.f11624a, i);
        l70.m15925P(parcel, 3, this.f11625b);
        l70.m15928S(parcel, 4, this.f11626c);
        l70.m15931V(parcel, 5, this.f11627d);
        l70.m15928S(parcel, 6, this.f11628e);
        l70.m15926Q(parcel, 7, this.f11629f);
        l70.m15935Z(parcel, 8, 4);
        parcel.writeInt(this.f11631h ? 1 : 0);
        l70.m15933X(parcel, 9, this.f11630g, i);
        l70.m15939b0(parcel, iM15937a0);
    }

    public zze(zzr zzrVar, mec mecVar) {
        this.f11624a = zzrVar;
        this.f11632i = mecVar;
        this.f11626c = null;
        this.f11627d = null;
        this.f11628e = null;
        this.f11629f = null;
        this.f11630g = null;
        this.f11631h = true;
    }
}
