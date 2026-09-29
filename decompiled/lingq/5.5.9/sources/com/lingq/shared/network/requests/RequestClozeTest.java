package com.lingq.shared.network.requests;

import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import tk.InterfaceC9303g;
import tk.InterfaceC9307k;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC9307k(generateAdapter = true)
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m13365d2 = {"Lcom/lingq/shared/network/requests/RequestClozeTest;", "", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final /* data */ class RequestClozeTest {

    /* JADX INFO: renamed from: a */
    public final String f18037a;

    /* JADX INFO: renamed from: b */
    public final List<SentenceFragment> f18038b;

    /* JADX INFO: renamed from: c */
    @InterfaceC9303g(name = "incorrect_answers")
    public final List<String> f18039c;

    /* JADX INFO: renamed from: d */
    @InterfaceC9303g(name = "found")
    public final boolean f18040d;

    public RequestClozeTest() {
        this(null, null, null, false, 15, null);
    }

    public RequestClozeTest(String str, List<SentenceFragment> list, List<String> list2, boolean z10) {
        this.f18037a = str;
        this.f18038b = list;
        this.f18039c = list2;
        this.f18040d = z10;
    }

    public /* synthetic */ RequestClozeTest(String str, List list, List list2, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : list, (i10 & 4) != 0 ? null : list2, (i10 & 8) != 0 ? false : z10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RequestClozeTest)) {
            return false;
        }
        RequestClozeTest requestClozeTest = (RequestClozeTest) obj;
        return C5207g.m11106a(this.f18037a, requestClozeTest.f18037a) && C5207g.m11106a(this.f18038b, requestClozeTest.f18038b) && C5207g.m11106a(this.f18039c, requestClozeTest.f18039c) && this.f18040d == requestClozeTest.f18040d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r1v8, types: [int] */
    public final int hashCode() {
        int iHashCode = 0;
        String str = this.f18037a;
        int iHashCode2 = (str == null ? 0 : str.hashCode()) * 31;
        List<SentenceFragment> list = this.f18038b;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.f18039c;
        if (list2 != null) {
            iHashCode = list2.hashCode();
        }
        int i10 = (iHashCode3 + iHashCode) * 31;
        boolean z10 = this.f18040d;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        return i10 + r10;
    }

    public final String toString() {
        return "RequestClozeTest(text=" + this.f18037a + ", fragments=" + this.f18038b + ", incorrectAnswers=" + this.f18039c + ", isFound=" + this.f18040d + ")";
    }
}
