package com.google.android.material.badge;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Locale;
import p000.hfb;

/* JADX INFO: loaded from: classes.dex */
public final class BadgeState$State implements Parcelable {
    public static final Parcelable.Creator<BadgeState$State> CREATOR = new hfb(5);

    /* JADX INFO: renamed from: I */
    public Locale f12614I;

    /* JADX INFO: renamed from: J */
    public CharSequence f12615J;

    /* JADX INFO: renamed from: K */
    public CharSequence f12616K;

    /* JADX INFO: renamed from: L */
    public int f12617L;

    /* JADX INFO: renamed from: M */
    public int f12618M;

    /* JADX INFO: renamed from: N */
    public Integer f12619N;

    /* JADX INFO: renamed from: P */
    public Integer f12621P;

    /* JADX INFO: renamed from: Q */
    public Integer f12622Q;

    /* JADX INFO: renamed from: R */
    public Integer f12623R;

    /* JADX INFO: renamed from: S */
    public Integer f12624S;

    /* JADX INFO: renamed from: T */
    public Integer f12625T;

    /* JADX INFO: renamed from: U */
    public Integer f12626U;

    /* JADX INFO: renamed from: V */
    public Integer f12627V;

    /* JADX INFO: renamed from: W */
    public Integer f12628W;

    /* JADX INFO: renamed from: X */
    public Integer f12629X;

    /* JADX INFO: renamed from: Y */
    public Boolean f12630Y;

    /* JADX INFO: renamed from: Z */
    public Integer f12631Z;

    /* JADX INFO: renamed from: a */
    public int f12632a;

    /* JADX INFO: renamed from: b */
    public Integer f12633b;

    /* JADX INFO: renamed from: c */
    public Integer f12634c;

    /* JADX INFO: renamed from: d */
    public Integer f12635d;

    /* JADX INFO: renamed from: e */
    public Integer f12636e;

    /* JADX INFO: renamed from: f */
    public Integer f12637f;

    /* JADX INFO: renamed from: g */
    public Integer f12638g;

    /* JADX INFO: renamed from: h */
    public Integer f12639h;

    /* JADX INFO: renamed from: j */
    public String f12641j;

    /* JADX INFO: renamed from: i */
    public int f12640i = 255;

    /* JADX INFO: renamed from: k */
    public int f12642k = -2;

    /* JADX INFO: renamed from: l */
    public int f12643l = -2;

    /* JADX INFO: renamed from: H */
    public int f12613H = -2;

    /* JADX INFO: renamed from: O */
    public Boolean f12620O = Boolean.TRUE;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f12632a);
        parcel.writeSerializable(this.f12633b);
        parcel.writeSerializable(this.f12634c);
        parcel.writeSerializable(this.f12635d);
        parcel.writeSerializable(this.f12636e);
        parcel.writeSerializable(this.f12637f);
        parcel.writeSerializable(this.f12638g);
        parcel.writeSerializable(this.f12639h);
        parcel.writeInt(this.f12640i);
        parcel.writeString(this.f12641j);
        parcel.writeInt(this.f12642k);
        parcel.writeInt(this.f12643l);
        parcel.writeInt(this.f12613H);
        CharSequence charSequence = this.f12615J;
        parcel.writeString(charSequence != null ? charSequence.toString() : null);
        CharSequence charSequence2 = this.f12616K;
        parcel.writeString(charSequence2 != null ? charSequence2.toString() : null);
        parcel.writeInt(this.f12617L);
        parcel.writeSerializable(this.f12619N);
        parcel.writeSerializable(this.f12621P);
        parcel.writeSerializable(this.f12622Q);
        parcel.writeSerializable(this.f12623R);
        parcel.writeSerializable(this.f12624S);
        parcel.writeSerializable(this.f12625T);
        parcel.writeSerializable(this.f12626U);
        parcel.writeSerializable(this.f12629X);
        parcel.writeSerializable(this.f12627V);
        parcel.writeSerializable(this.f12628W);
        parcel.writeSerializable(this.f12620O);
        parcel.writeSerializable(this.f12614I);
        parcel.writeSerializable(this.f12630Y);
        parcel.writeSerializable(this.f12631Z);
    }
}
