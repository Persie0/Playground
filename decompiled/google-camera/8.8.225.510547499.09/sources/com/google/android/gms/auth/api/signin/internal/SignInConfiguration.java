package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import p000.jbt;
import p000.jib;
import p000.jij;
import p000.jiy;
import p000.luc;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class SignInConfiguration extends jij implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new jbt(0);

    /* JADX INFO: renamed from: a */
    public final String f7590a;

    /* JADX INFO: renamed from: b */
    public final GoogleSignInOptions f7591b;

    public SignInConfiguration(String str, GoogleSignInOptions googleSignInOptions) {
        jib.m13203h(str);
        this.f7590a = str;
        this.f7591b = googleSignInOptions;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SignInConfiguration)) {
            return false;
        }
        SignInConfiguration signInConfiguration = (SignInConfiguration) obj;
        if (this.f7590a.equals(signInConfiguration.f7590a)) {
            GoogleSignInOptions googleSignInOptions = this.f7591b;
            GoogleSignInOptions googleSignInOptions2 = signInConfiguration.f7591b;
            if (googleSignInOptions == null) {
                if (googleSignInOptions2 == null) {
                    return true;
                }
            } else if (googleSignInOptions.equals(googleSignInOptions2)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        luc lucVar = new luc((byte[]) null);
        lucVar.m15986b(this.f7590a);
        lucVar.m15986b(this.f7591b);
        return lucVar.f39211a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM13281h = jiy.m13281h(parcel);
        jiy.m13296w(parcel, 2, this.f7590a);
        jiy.m13295v(parcel, 5, this.f7591b, i);
        jiy.m13283j(parcel, iM13281h);
    }
}
