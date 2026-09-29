package com.lingq.shared.network.result;

import android.support.v4.media.session.C0166e;
import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import kotlin.Metadata;
import p003a2.C0009a;
import tk.InterfaceC9307k;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC9307k(generateAdapter = true)
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m13365d2 = {"Lcom/lingq/shared/network/result/ResultNotice;", "", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final /* data */ class ResultNotice {

    /* JADX INFO: renamed from: a */
    public final int f18788a;

    /* JADX INFO: renamed from: b */
    public final String f18789b;

    /* JADX INFO: renamed from: c */
    public final String f18790c;

    /* JADX INFO: renamed from: d */
    public final String f18791d;

    /* JADX INFO: renamed from: e */
    public final String f18792e;

    public ResultNotice(int i10, String str, String str2, String str3, String str4) {
        this.f18788a = i10;
        this.f18789b = str;
        this.f18790c = str2;
        this.f18791d = str3;
        this.f18792e = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResultNotice)) {
            return false;
        }
        ResultNotice resultNotice = (ResultNotice) obj;
        if (this.f18788a == resultNotice.f18788a && C5207g.m11106a(this.f18789b, resultNotice.f18789b) && C5207g.m11106a(this.f18790c, resultNotice.f18790c) && C5207g.m11106a(this.f18791d, resultNotice.f18791d) && C5207g.m11106a(this.f18792e, resultNotice.f18792e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f18792e.hashCode() + C0166e.m758d(this.f18791d, C0166e.m758d(this.f18790c, C0166e.m758d(this.f18789b, Integer.hashCode(this.f18788a) * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ResultNotice(id=");
        sb2.append(this.f18788a);
        sb2.append(", title=");
        sb2.append(this.f18789b);
        sb2.append(", startDate=");
        sb2.append(this.f18790c);
        sb2.append(", endDate=");
        sb2.append(this.f18791d);
        sb2.append(", noticeType=");
        return C0009a.m23l(sb2, this.f18792e, ")");
    }
}
