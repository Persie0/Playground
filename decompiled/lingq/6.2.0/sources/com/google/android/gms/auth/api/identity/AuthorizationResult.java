package com.google.android.gms.auth.api.identity;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p000.l70;
import p000.lda;
import p000.x74;
import p000.y3a;

/* JADX INFO: loaded from: classes2.dex */
public final class AuthorizationResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AuthorizationResult> CREATOR = new y3a(20);

    /* JADX INFO: renamed from: a */
    public final String f11562a;

    /* JADX INFO: renamed from: b */
    public final String f11563b;

    /* JADX INFO: renamed from: c */
    public final String f11564c;

    /* JADX INFO: renamed from: d */
    public final List f11565d;

    /* JADX INFO: renamed from: e */
    public final GoogleSignInAccount f11566e;

    /* JADX INFO: renamed from: f */
    public final PendingIntent f11567f;

    /* JADX INFO: renamed from: g */
    public final Bundle f11568g;

    public AuthorizationResult(String str, String str2, String str3, ArrayList arrayList, GoogleSignInAccount googleSignInAccount, PendingIntent pendingIntent, Bundle bundle) {
        this.f11562a = str;
        this.f11563b = str2;
        this.f11564c = str3;
        lda.m16130p(arrayList);
        this.f11565d = arrayList;
        this.f11566e = googleSignInAccount;
        this.f11567f = pendingIntent;
        this.f11568g = bundle;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AuthorizationResult)) {
            return false;
        }
        AuthorizationResult authorizationResult = (AuthorizationResult) obj;
        return x74.m24360q(this.f11562a, authorizationResult.f11562a) && x74.m24360q(this.f11563b, authorizationResult.f11563b) && x74.m24360q(this.f11564c, authorizationResult.f11564c) && x74.m24360q(this.f11565d, authorizationResult.f11565d) && x74.m24360q(this.f11567f, authorizationResult.f11567f) && x74.m24360q(this.f11566e, authorizationResult.f11566e) && x74.m24360q(this.f11568g, authorizationResult.f11568g);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11562a, this.f11563b, this.f11564c, this.f11565d, this.f11567f, this.f11566e, this.f11568g});
    }

    /* JADX INFO: renamed from: r */
    public final String m5268r() {
        return this.f11562a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM15937a0 = l70.m15937a0(parcel, 20293);
        l70.m15930U(parcel, 1, this.f11562a);
        l70.m15930U(parcel, 2, this.f11563b);
        l70.m15930U(parcel, 3, this.f11564c);
        l70.m15932W(parcel, 4, this.f11565d);
        l70.m15929T(parcel, 5, this.f11566e, i);
        l70.m15929T(parcel, 6, this.f11567f, i);
        l70.m15924O(parcel, 7, this.f11568g);
        l70.m15939b0(parcel, iM15937a0);
    }
}
