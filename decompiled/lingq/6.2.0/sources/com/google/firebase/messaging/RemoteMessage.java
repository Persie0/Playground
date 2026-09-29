package com.google.firebase.messaging;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.HashMap;
import p000.C3275kv;
import p000.hfb;
import p000.k58;
import p000.l70;
import p000.web;

/* JADX INFO: loaded from: classes2.dex */
public final class RemoteMessage extends AbstractSafeParcelable {
    public static final Parcelable.Creator<RemoteMessage> CREATOR = new hfb(28);

    /* JADX INFO: renamed from: a */
    public final Bundle f13737a;

    /* JADX INFO: renamed from: b */
    public C3275kv f13738b;

    /* JADX INFO: renamed from: c */
    public k58 f13739c;

    public RemoteMessage(Bundle bundle) {
        this.f13737a = bundle;
    }

    /* JADX INFO: renamed from: J */
    public final k58 m6717J() {
        if (this.f13739c == null) {
            Bundle bundle = this.f13737a;
            if (web.m23860H(bundle)) {
                this.f13739c = new k58(new web(bundle));
            }
        }
        return this.f13739c;
    }

    /* JADX INFO: renamed from: r */
    public final HashMap m6718r() {
        if (this.f13738b == null) {
            C3275kv c3275kv = new C3275kv(0);
            Bundle bundle = this.f13737a;
            for (String str : bundle.keySet()) {
                Object obj = bundle.get(str);
                if (obj instanceof String) {
                    String str2 = (String) obj;
                    if (!str.startsWith("google.") && !str.startsWith("gcm.") && !str.equals("from") && !str.equals("message_type") && !str.equals("collapse_key")) {
                        c3275kv.put(str, str2);
                    }
                }
            }
            this.f13738b = c3275kv;
        }
        return new HashMap(this.f13738b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM15937a0 = l70.m15937a0(parcel, 20293);
        l70.m15924O(parcel, 2, this.f13737a);
        l70.m15939b0(parcel, iM15937a0);
    }
}
