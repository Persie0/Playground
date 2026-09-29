package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Objects;
import p000.C3670v2;
import p000.l70;

/* JADX INFO: loaded from: classes.dex */
public final class zzdd extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzdd> CREATOR = new C3670v2(21);

    /* JADX INFO: renamed from: a */
    public final int f11879a;

    /* JADX INFO: renamed from: b */
    public final String f11880b;

    /* JADX INFO: renamed from: c */
    public final Intent f11881c;

    public zzdd(int i, String str, Intent intent) {
        this.f11879a = i;
        this.f11880b = str;
        this.f11881c = intent;
    }

    /* JADX INFO: renamed from: r */
    public static zzdd m5439r(Activity activity) {
        return new zzdd(activity.hashCode(), activity.getClass().getCanonicalName(), activity.getIntent());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzdd)) {
            return false;
        }
        zzdd zzddVar = (zzdd) obj;
        return this.f11879a == zzddVar.f11879a && Objects.equals(this.f11880b, zzddVar.f11880b) && Objects.equals(this.f11881c, zzddVar.f11881c);
    }

    public final int hashCode() {
        return this.f11879a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM15937a0 = l70.m15937a0(parcel, 20293);
        l70.m15935Z(parcel, 1, 4);
        parcel.writeInt(this.f11879a);
        l70.m15930U(parcel, 2, this.f11880b);
        l70.m15929T(parcel, 3, this.f11881c, i);
        l70.m15939b0(parcel, iM15937a0);
    }
}
