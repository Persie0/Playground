package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p000.C3670v2;
import p000.l70;
import p000.lda;

/* JADX INFO: loaded from: classes.dex */
public final class Scope extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<Scope> CREATOR = new C3670v2(19);

    /* JADX INFO: renamed from: a */
    public final int f11655a;

    /* JADX INFO: renamed from: b */
    public final String f11656b;

    public Scope(int i, String str) {
        lda.m16128n(str, "scopeUri must not be null or empty");
        this.f11655a = i;
        this.f11656b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Scope)) {
            return false;
        }
        return this.f11656b.equals(((Scope) obj).f11656b);
    }

    public final int hashCode() {
        return this.f11656b.hashCode();
    }

    public final String toString() {
        return this.f11656b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM15937a0 = l70.m15937a0(parcel, 20293);
        l70.m15935Z(parcel, 1, 4);
        parcel.writeInt(this.f11655a);
        l70.m15930U(parcel, 2, this.f11656b);
        l70.m15939b0(parcel, iM15937a0);
    }
}
