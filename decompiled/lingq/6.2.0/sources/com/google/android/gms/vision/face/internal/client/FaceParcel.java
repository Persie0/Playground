package com.google.android.gms.vision.face.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p000.l70;
import p000.qmb;

/* JADX INFO: loaded from: classes2.dex */
public class FaceParcel extends AbstractSafeParcelable {
    public static final Parcelable.Creator<FaceParcel> CREATOR = new qmb(6);

    /* JADX INFO: renamed from: H */
    public final float f12463H;

    /* JADX INFO: renamed from: I */
    public final zza[] f12464I;

    /* JADX INFO: renamed from: J */
    public final float f12465J;

    /* JADX INFO: renamed from: a */
    public final int f12466a;

    /* JADX INFO: renamed from: b */
    public final int f12467b;

    /* JADX INFO: renamed from: c */
    public final float f12468c;

    /* JADX INFO: renamed from: d */
    public final float f12469d;

    /* JADX INFO: renamed from: e */
    public final float f12470e;

    /* JADX INFO: renamed from: f */
    public final float f12471f;

    /* JADX INFO: renamed from: g */
    public final float f12472g;

    /* JADX INFO: renamed from: h */
    public final float f12473h;

    /* JADX INFO: renamed from: i */
    public final float f12474i;

    /* JADX INFO: renamed from: j */
    public final LandmarkParcel[] f12475j;

    /* JADX INFO: renamed from: k */
    public final float f12476k;

    /* JADX INFO: renamed from: l */
    public final float f12477l;

    public FaceParcel(int i, int i2, float f, float f2, float f3, float f4, float f5, float f6, LandmarkParcel[] landmarkParcelArr, float f7, float f8, float f9) {
        this(i, i2, f, f2, f3, f4, f5, f6, 0.0f, landmarkParcelArr, f7, f8, f9, new zza[0], -1.0f);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM15937a0 = l70.m15937a0(parcel, 20293);
        l70.m15935Z(parcel, 1, 4);
        parcel.writeInt(this.f12466a);
        l70.m15935Z(parcel, 2, 4);
        parcel.writeInt(this.f12467b);
        l70.m15935Z(parcel, 3, 4);
        parcel.writeFloat(this.f12468c);
        l70.m15935Z(parcel, 4, 4);
        parcel.writeFloat(this.f12469d);
        l70.m15935Z(parcel, 5, 4);
        parcel.writeFloat(this.f12470e);
        l70.m15935Z(parcel, 6, 4);
        parcel.writeFloat(this.f12471f);
        l70.m15935Z(parcel, 7, 4);
        parcel.writeFloat(this.f12472g);
        l70.m15935Z(parcel, 8, 4);
        parcel.writeFloat(this.f12473h);
        l70.m15933X(parcel, 9, this.f12475j, i);
        l70.m15935Z(parcel, 10, 4);
        parcel.writeFloat(this.f12476k);
        l70.m15935Z(parcel, 11, 4);
        parcel.writeFloat(this.f12477l);
        l70.m15935Z(parcel, 12, 4);
        parcel.writeFloat(this.f12463H);
        l70.m15933X(parcel, 13, this.f12464I, i);
        l70.m15935Z(parcel, 14, 4);
        parcel.writeFloat(this.f12474i);
        l70.m15935Z(parcel, 15, 4);
        parcel.writeFloat(this.f12465J);
        l70.m15939b0(parcel, iM15937a0);
    }

    public FaceParcel(int i, int i2, float f, float f2, float f3, float f4, float f5, float f6, float f7, LandmarkParcel[] landmarkParcelArr, float f8, float f9, float f10, zza[] zzaVarArr, float f11) {
        this.f12466a = i;
        this.f12467b = i2;
        this.f12468c = f;
        this.f12469d = f2;
        this.f12470e = f3;
        this.f12471f = f4;
        this.f12472g = f5;
        this.f12473h = f6;
        this.f12474i = f7;
        this.f12475j = landmarkParcelArr;
        this.f12476k = f8;
        this.f12477l = f9;
        this.f12463H = f10;
        this.f12464I = zzaVarArr;
        this.f12465J = f11;
    }
}
