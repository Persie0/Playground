package com.lingq.shared.network.result;

import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import kotlin.Metadata;
import kotlin.collections.C6752c;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.C7076b;
import p003a2.C0009a;
import tk.InterfaceC9307k;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC9307k(generateAdapter = true)
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m13365d2 = {"Lcom/lingq/shared/network/result/ResultMilestone;", "", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final /* data */ class ResultMilestone {

    /* JADX INFO: renamed from: a */
    public final String f18767a;

    /* JADX INFO: renamed from: b */
    public final String f18768b;

    /* JADX INFO: renamed from: c */
    public final int f18769c;

    /* JADX INFO: renamed from: d */
    public final String f18770d;

    public ResultMilestone(String str, int i10, String str2, String str3) {
        C5207g.m11111f(str, "slug");
        this.f18767a = str;
        this.f18768b = str2;
        this.f18769c = i10;
        this.f18770d = str3;
    }

    public /* synthetic */ ResultMilestone(String str, String str2, int i10, String str3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i11 & 4) != 0 ? 0 : i10, str2, str3);
    }

    /* JADX INFO: renamed from: a */
    public final String m9451a() {
        if (C5207g.m11106a(this.f18770d, "daily_score")) {
            String str = this.f18767a;
            if (C7076b.m14299s3(str, new String[]{"."}, 0, 6).size() == 3) {
                return (String) C6752c.m13433a0(C7076b.m14299s3(str, new String[]{"."}, 0, 6));
            }
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResultMilestone)) {
            return false;
        }
        ResultMilestone resultMilestone = (ResultMilestone) obj;
        return C5207g.m11106a(this.f18767a, resultMilestone.f18767a) && C5207g.m11106a(this.f18768b, resultMilestone.f18768b) && this.f18769c == resultMilestone.f18769c && C5207g.m11106a(this.f18770d, resultMilestone.f18770d);
    }

    public final int hashCode() {
        int iHashCode = this.f18767a.hashCode() * 31;
        String str = this.f18768b;
        int iM16d = C0009a.m16d(this.f18769c, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
        String str2 = this.f18770d;
        return iM16d + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ResultMilestone(slug=");
        sb2.append(this.f18767a);
        sb2.append(", name=");
        sb2.append(this.f18768b);
        sb2.append(", goal=");
        sb2.append(this.f18769c);
        sb2.append(", stat=");
        return C0009a.m23l(sb2, this.f18770d, ")");
    }
}
