package com.lingq.shared.network.requests;

import androidx.activity.result.C0204c;
import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p003a2.C0009a;
import tk.InterfaceC9307k;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC9307k(generateAdapter = true)
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m13365d2 = {"Lcom/lingq/shared/network/requests/RequestLanguageContextNotification;", "", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final /* data */ class RequestLanguageContextNotification {

    /* JADX INFO: renamed from: a */
    public String f18080a;

    /* JADX INFO: renamed from: b */
    public final String f18081b;

    /* JADX WARN: Multi-variable type inference failed */
    public RequestLanguageContextNotification() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public RequestLanguageContextNotification(String str, String str2) {
        this.f18080a = str;
        this.f18081b = str2;
    }

    public /* synthetic */ RequestLanguageContextNotification(String str, String str2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RequestLanguageContextNotification)) {
            return false;
        }
        RequestLanguageContextNotification requestLanguageContextNotification = (RequestLanguageContextNotification) obj;
        if (C5207g.m11106a(this.f18080a, requestLanguageContextNotification.f18080a) && C5207g.m11106a(this.f18081b, requestLanguageContextNotification.f18081b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f18080a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f18081b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return C0009a.m23l(C0204c.m854m("RequestLanguageContextNotification(lotd=", this.f18080a, ", weekly="), this.f18081b, ")");
    }
}
