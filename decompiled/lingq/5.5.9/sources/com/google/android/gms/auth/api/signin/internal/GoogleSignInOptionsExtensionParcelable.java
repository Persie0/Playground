package com.google.android.gms.auth.api.signin.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.C0987y;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p070db.C5122b;

/* JADX INFO: loaded from: classes.dex */
public class GoogleSignInOptionsExtensionParcelable extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GoogleSignInOptionsExtensionParcelable> CREATOR = new C5122b();

    /* JADX INFO: renamed from: a */
    public final int f13842a;

    /* JADX INFO: renamed from: b */
    public final int f13843b;

    /* JADX INFO: renamed from: c */
    public final Bundle f13844c;

    public GoogleSignInOptionsExtensionParcelable(int i10, int i11, Bundle bundle) {
        this.f13842a = i10;
        this.f13843b = i11;
        this.f13844c = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM3836r = C0987y.m3836r(parcel, 20293);
        C0987y.m3829k(parcel, 1, this.f13842a);
        C0987y.m3829k(parcel, 2, this.f13843b);
        C0987y.m3827i(parcel, 3, this.f13844c);
        C0987y.m3839u(parcel, iM3836r);
    }
}
