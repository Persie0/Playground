package com.google.android.gms.cloudmessaging;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.C0987y;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p115fb.C5487c;

/* JADX INFO: loaded from: classes.dex */
public final class CloudMessage extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CloudMessage> CREATOR = new C5487c();

    /* JADX INFO: renamed from: a */
    public final Intent f13853a;

    public CloudMessage(Intent intent) {
        this.f13853a = intent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM3836r = C0987y.m3836r(parcel, 20293);
        C0987y.m3831m(parcel, 1, this.f13853a, i10);
        C0987y.m3839u(parcel, iM3836r);
    }
}
