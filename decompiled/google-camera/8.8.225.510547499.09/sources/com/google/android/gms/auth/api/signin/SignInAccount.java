package com.google.android.gms.auth.api.signin;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import p000.C0870ob;
import p000.jib;
import p000.jij;
import p000.jiy;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class SignInAccount extends jij implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new C0870ob(20);

    /* JADX INFO: renamed from: a */
    @Deprecated
    final String f7587a;

    /* JADX INFO: renamed from: b */
    public final GoogleSignInAccount f7588b;

    /* JADX INFO: renamed from: c */
    @Deprecated
    final String f7589c;

    public SignInAccount(String str, GoogleSignInAccount googleSignInAccount, String str2) {
        this.f7588b = googleSignInAccount;
        jib.m13204i(str, "8.3 and 8.4 SDKs require non-null email");
        this.f7587a = str;
        jib.m13204i(str2, "8.3 and 8.4 SDKs require non-null userId");
        this.f7589c = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM13281h = jiy.m13281h(parcel);
        jiy.m13296w(parcel, 4, this.f7587a);
        jiy.m13295v(parcel, 7, this.f7588b, i);
        jiy.m13296w(parcel, 8, this.f7589c);
        jiy.m13283j(parcel, iM13281h);
    }
}
