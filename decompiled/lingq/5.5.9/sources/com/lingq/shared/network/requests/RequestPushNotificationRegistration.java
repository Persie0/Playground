package com.lingq.shared.network.requests;

import android.support.v4.media.session.C0166e;
import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import tk.InterfaceC9303g;
import tk.InterfaceC9307k;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC9307k(generateAdapter = true)
@Metadata(m13364d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ1\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¨\u0006\u000b"}, m13365d2 = {"Lcom/lingq/shared/network/requests/RequestPushNotificationRegistration;", "", "", "devId", "token", "name", "", "isActive", "copy", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final /* data */ class RequestPushNotificationRegistration {

    /* JADX INFO: renamed from: a */
    public final String f18156a;

    /* JADX INFO: renamed from: b */
    public final String f18157b;

    /* JADX INFO: renamed from: c */
    public final String f18158c;

    /* JADX INFO: renamed from: d */
    public final boolean f18159d;

    public RequestPushNotificationRegistration(@InterfaceC9303g(name = "dev_id") String str, @InterfaceC9303g(name = "reg_id") String str2, String str3, boolean z10) {
        C5207g.m11111f(str, "devId");
        C5207g.m11111f(str2, "token");
        C5207g.m11111f(str3, "name");
        this.f18156a = str;
        this.f18157b = str2;
        this.f18158c = str3;
        this.f18159d = z10;
    }

    public /* synthetic */ RequestPushNotificationRegistration(String str, String str2, String str3, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i10 & 8) != 0 ? false : z10);
    }

    public final RequestPushNotificationRegistration copy(@InterfaceC9303g(name = "dev_id") String devId, @InterfaceC9303g(name = "reg_id") String token, String name, boolean isActive) {
        C5207g.m11111f(devId, "devId");
        C5207g.m11111f(token, "token");
        C5207g.m11111f(name, "name");
        return new RequestPushNotificationRegistration(devId, token, name, isActive);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RequestPushNotificationRegistration)) {
            return false;
        }
        RequestPushNotificationRegistration requestPushNotificationRegistration = (RequestPushNotificationRegistration) obj;
        return C5207g.m11106a(this.f18156a, requestPushNotificationRegistration.f18156a) && C5207g.m11106a(this.f18157b, requestPushNotificationRegistration.f18157b) && C5207g.m11106a(this.f18158c, requestPushNotificationRegistration.f18158c) && this.f18159d == requestPushNotificationRegistration.f18159d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    public final int hashCode() {
        int iM758d = C0166e.m758d(this.f18158c, C0166e.m758d(this.f18157b, this.f18156a.hashCode() * 31, 31), 31);
        boolean z10 = this.f18159d;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        return iM758d + r10;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RequestPushNotificationRegistration(devId=");
        sb2.append(this.f18156a);
        sb2.append(", token=");
        sb2.append(this.f18157b);
        sb2.append(", name=");
        sb2.append(this.f18158c);
        sb2.append(", isActive=");
        return C0166e.m769p(sb2, this.f18159d, ")");
    }
}
