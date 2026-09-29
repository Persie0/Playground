package com.google.android.gms.cloudmessaging;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p000.l70;
import p000.y3a;

/* JADX INFO: loaded from: classes2.dex */
public final class CloudMessage extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CloudMessage> CREATOR = new y3a(22);

    /* JADX INFO: renamed from: a */
    public final Intent f11633a;

    public CloudMessage(Intent intent) {
        this.f11633a = intent;
    }

    /* JADX INFO: renamed from: J */
    public final Integer m5275J() {
        Intent intent = this.f11633a;
        if (intent.hasExtra("google.product_id")) {
            return Integer.valueOf(intent.getIntExtra("google.product_id", 0));
        }
        return null;
    }

    /* JADX INFO: renamed from: r */
    public final String m5276r() {
        Intent intent = this.f11633a;
        String stringExtra = intent.getStringExtra("google.message_id");
        return stringExtra == null ? intent.getStringExtra("message_id") : stringExtra;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM15937a0 = l70.m15937a0(parcel, 20293);
        l70.m15929T(parcel, 1, this.f11633a, i);
        l70.m15939b0(parcel, iM15937a0);
    }
}
