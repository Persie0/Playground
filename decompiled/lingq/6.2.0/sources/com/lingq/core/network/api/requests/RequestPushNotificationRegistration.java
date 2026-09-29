package com.lingq.core.network.api.requests;

import p000.ey8;
import p000.fa4;
import p000.ux5;

/* JADX INFO: loaded from: classes.dex */
@ey8
public final class RequestPushNotificationRegistration {
    public static final C1597r0 Companion = new C1597r0();

    /* JADX INFO: renamed from: a */
    public String f20423a;

    /* JADX INFO: renamed from: b */
    public String f20424b;

    /* JADX INFO: renamed from: c */
    public String f20425c;

    /* JADX INFO: renamed from: d */
    public boolean f20426d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RequestPushNotificationRegistration)) {
            return false;
        }
        RequestPushNotificationRegistration requestPushNotificationRegistration = (RequestPushNotificationRegistration) obj;
        return fa4.m11650l(this.f20423a, requestPushNotificationRegistration.f20423a) && fa4.m11650l(this.f20424b, requestPushNotificationRegistration.f20424b) && fa4.m11650l(this.f20425c, requestPushNotificationRegistration.f20425c) && this.f20426d == requestPushNotificationRegistration.f20426d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f20426d) + ux5.m22980c(ux5.m22980c(this.f20423a.hashCode() * 31, this.f20424b, 31), this.f20425c, 31);
    }

    public final String toString() {
        String str = this.f20423a;
        String str2 = this.f20424b;
        String str3 = this.f20425c;
        boolean z = this.f20426d;
        StringBuilder sbM23000w = ux5.m23000w("RequestPushNotificationRegistration(devId=", str, ", token=", str2, ", name=");
        sbM23000w.append(str3);
        sbM23000w.append(", isActive=");
        sbM23000w.append(z);
        sbM23000w.append(")");
        return sbM23000w.toString();
    }
}
