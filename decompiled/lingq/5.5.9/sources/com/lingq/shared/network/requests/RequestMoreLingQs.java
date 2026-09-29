package com.lingq.shared.network.requests;

import androidx.activity.result.C0204c;
import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import kotlin.Metadata;
import tk.InterfaceC9307k;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC9307k(generateAdapter = true)
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m13365d2 = {"Lcom/lingq/shared/network/requests/RequestMoreLingQs;", "", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final /* data */ class RequestMoreLingQs {

    /* JADX INFO: renamed from: a */
    public final int f18127a;

    /* JADX INFO: renamed from: b */
    public final long f18128b;

    /* JADX INFO: renamed from: c */
    public final String f18129c;

    public RequestMoreLingQs(String str, int i10, long j10) {
        this.f18127a = i10;
        this.f18128b = j10;
        this.f18129c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RequestMoreLingQs)) {
            return false;
        }
        RequestMoreLingQs requestMoreLingQs = (RequestMoreLingQs) obj;
        return this.f18127a == requestMoreLingQs.f18127a && this.f18128b == requestMoreLingQs.f18128b && C5207g.m11106a(this.f18129c, requestMoreLingQs.f18129c);
    }

    public final int hashCode() {
        return this.f18129c.hashCode() + C0204c.m847f(this.f18128b, Integer.hashCode(this.f18127a) * 31, 31);
    }

    public final String toString() {
        return "RequestMoreLingQs(amount=" + this.f18127a + ", timestamp=" + this.f18128b + ", signature=" + this.f18129c + ")";
    }
}
