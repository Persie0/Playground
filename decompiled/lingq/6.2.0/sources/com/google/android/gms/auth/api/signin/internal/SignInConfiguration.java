package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p000.l70;
import p000.lda;
import p000.y3a;

/* JADX INFO: loaded from: classes2.dex */
public final class SignInConfiguration extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<SignInConfiguration> CREATOR = new y3a(21);

    /* JADX INFO: renamed from: a */
    public final String f11613a;

    /* JADX INFO: renamed from: b */
    public final GoogleSignInOptions f11614b;

    public SignInConfiguration(String str, GoogleSignInOptions googleSignInOptions) {
        lda.m16127m(str);
        this.f11613a = str;
        this.f11614b = googleSignInOptions;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SignInConfiguration)) {
            return false;
        }
        SignInConfiguration signInConfiguration = (SignInConfiguration) obj;
        if (this.f11613a.equals(signInConfiguration.f11613a)) {
            GoogleSignInOptions googleSignInOptions = signInConfiguration.f11614b;
            GoogleSignInOptions googleSignInOptions2 = this.f11614b;
            if (googleSignInOptions2 == null) {
                if (googleSignInOptions == null) {
                    return true;
                }
            } else if (googleSignInOptions2.equals(googleSignInOptions)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = 1 * 31;
        String str = this.f11613a;
        int iHashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        GoogleSignInOptions googleSignInOptions = this.f11614b;
        return iHashCode + (googleSignInOptions != null ? googleSignInOptions.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM15937a0 = l70.m15937a0(parcel, 20293);
        l70.m15930U(parcel, 2, this.f11613a);
        l70.m15929T(parcel, 5, this.f11614b, i);
        l70.m15939b0(parcel, iM15937a0);
    }
}
