package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.C0987y;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p070db.C5140t;
import p176ib.C6272i;

/* JADX INFO: loaded from: classes.dex */
public final class SignInConfiguration extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<SignInConfiguration> CREATOR = new C5140t();

    /* JADX INFO: renamed from: a */
    public final String f13845a;

    /* JADX INFO: renamed from: b */
    public final GoogleSignInOptions f13846b;

    public SignInConfiguration(String str, GoogleSignInOptions googleSignInOptions) {
        C6272i.m12912f(str);
        this.f13845a = str;
        this.f13846b = googleSignInOptions;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SignInConfiguration)) {
            return false;
        }
        SignInConfiguration signInConfiguration = (SignInConfiguration) obj;
        if (this.f13845a.equals(signInConfiguration.f13845a)) {
            GoogleSignInOptions googleSignInOptions = signInConfiguration.f13846b;
            GoogleSignInOptions googleSignInOptions2 = this.f13846b;
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
        int i10 = 1 * 31;
        int iHashCode = 0;
        String str = this.f13845a;
        int iHashCode2 = (i10 + (str == null ? 0 : str.hashCode())) * 31;
        GoogleSignInOptions googleSignInOptions = this.f13846b;
        if (googleSignInOptions != null) {
            iHashCode = googleSignInOptions.hashCode();
        }
        return iHashCode2 + iHashCode;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM3836r = C0987y.m3836r(parcel, 20293);
        C0987y.m3832n(parcel, 2, this.f13845a);
        C0987y.m3831m(parcel, 5, this.f13846b, i10);
        C0987y.m3839u(parcel, iM3836r);
    }
}
