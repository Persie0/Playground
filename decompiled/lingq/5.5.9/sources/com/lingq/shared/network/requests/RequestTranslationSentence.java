package com.lingq.shared.network.requests;

import android.support.v4.media.session.C0166e;
import androidx.activity.result.C0204c;
import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import tk.InterfaceC9307k;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC9307k(generateAdapter = true)
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m13365d2 = {"Lcom/lingq/shared/network/requests/RequestTranslationSentence;", "", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final /* data */ class RequestTranslationSentence {

    /* JADX INFO: renamed from: a */
    public final int f18209a;

    /* JADX INFO: renamed from: b */
    public final List<Double> f18210b;

    /* JADX INFO: renamed from: c */
    public final String f18211c;

    /* JADX INFO: renamed from: d */
    public final List<RequestTranslation> f18212d;

    /* JADX INFO: renamed from: e */
    public final boolean f18213e;

    /* JADX INFO: renamed from: f */
    public final String f18214f;

    public RequestTranslationSentence(int i10, String str, String str2, List list, List list2, boolean z10) {
        C5207g.m11111f(list, "timestamp");
        C5207g.m11111f(str, "text");
        C5207g.m11111f(str2, "action");
        this.f18209a = i10;
        this.f18210b = list;
        this.f18211c = str;
        this.f18212d = list2;
        this.f18213e = z10;
        this.f18214f = str2;
    }

    public /* synthetic */ RequestTranslationSentence(int i10, List list, String str, List list2, boolean z10, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, (i11 & 4) != 0 ? "" : str, (i11 & 32) != 0 ? "update" : str2, list, (i11 & 8) != 0 ? null : list2, (i11 & 16) != 0 ? true : z10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RequestTranslationSentence)) {
            return false;
        }
        RequestTranslationSentence requestTranslationSentence = (RequestTranslationSentence) obj;
        return this.f18209a == requestTranslationSentence.f18209a && C5207g.m11106a(this.f18210b, requestTranslationSentence.f18210b) && C5207g.m11106a(this.f18211c, requestTranslationSentence.f18211c) && C5207g.m11106a(this.f18212d, requestTranslationSentence.f18212d) && this.f18213e == requestTranslationSentence.f18213e && C5207g.m11106a(this.f18214f, requestTranslationSentence.f18214f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [int] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v6, types: [int] */
    public final int hashCode() {
        int iM758d = C0166e.m758d(this.f18211c, C0204c.m848g(this.f18210b, Integer.hashCode(this.f18209a) * 31, 31), 31);
        List<RequestTranslation> list = this.f18212d;
        int iHashCode = (iM758d + (list == null ? 0 : list.hashCode())) * 31;
        boolean z10 = this.f18213e;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        return this.f18214f.hashCode() + ((iHashCode + r10) * 31);
    }

    public final String toString() {
        return "RequestTranslationSentence(index=" + this.f18209a + ", timestamp=" + this.f18210b + ", text=" + this.f18211c + ", translations=" + this.f18212d + ", lone=" + this.f18213e + ", action=" + this.f18214f + ")";
    }
}
