package com.lingq.shared.network.result;

import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import kotlin.Metadata;
import p003a2.C0009a;
import tk.InterfaceC9303g;
import tk.InterfaceC9307k;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC9307k(generateAdapter = true)
@Metadata(m13364d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\u0005\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¨\u0006\b"}, m13365d2 = {"Lcom/lingq/shared/network/result/ResultCardReview;", "", "", "srsDueDate", "statusChangedDate", "copy", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final /* data */ class ResultCardReview {

    /* JADX INFO: renamed from: a */
    public final String f18307a;

    /* JADX INFO: renamed from: b */
    public final String f18308b;

    public ResultCardReview(@InterfaceC9303g(name = "srs_due_date") String str, @InterfaceC9303g(name = "status_changed_date") String str2) {
        this.f18307a = str;
        this.f18308b = str2;
    }

    public final ResultCardReview copy(@InterfaceC9303g(name = "srs_due_date") String srsDueDate, @InterfaceC9303g(name = "status_changed_date") String statusChangedDate) {
        return new ResultCardReview(srsDueDate, statusChangedDate);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResultCardReview)) {
            return false;
        }
        ResultCardReview resultCardReview = (ResultCardReview) obj;
        return C5207g.m11106a(this.f18307a, resultCardReview.f18307a) && C5207g.m11106a(this.f18308b, resultCardReview.f18308b);
    }

    public final int hashCode() {
        int iHashCode = 0;
        String str = this.f18307a;
        int iHashCode2 = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f18308b;
        if (str2 != null) {
            iHashCode = str2.hashCode();
        }
        return iHashCode2 + iHashCode;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ResultCardReview(srsDueDate=");
        sb2.append(this.f18307a);
        sb2.append(", statusChangedDate=");
        return C0009a.m23l(sb2, this.f18308b, ")");
    }
}
