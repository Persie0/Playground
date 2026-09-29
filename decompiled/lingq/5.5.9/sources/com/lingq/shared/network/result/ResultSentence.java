package com.lingq.shared.network.result;

import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.entity.TextToken;
import dm.C5207g;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p003a2.C0009a;
import tk.InterfaceC9307k;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC9307k(generateAdapter = true)
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m13365d2 = {"Lcom/lingq/shared/network/result/ResultSentence;", "", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final /* data */ class ResultSentence {

    /* JADX INFO: renamed from: a */
    public final List<TextToken> f18928a;

    /* JADX INFO: renamed from: b */
    public final String f18929b;

    /* JADX INFO: renamed from: c */
    public final String f18930c;

    /* JADX INFO: renamed from: d */
    public final Integer f18931d;

    /* JADX INFO: renamed from: e */
    public final List<Float> f18932e;

    public ResultSentence(List<TextToken> list, String str, String str2, Integer num, List<Float> list2) {
        C5207g.m11111f(list, "tokens");
        this.f18928a = list;
        this.f18929b = str;
        this.f18930c = str2;
        this.f18931d = num;
        this.f18932e = list2;
    }

    public ResultSentence(List list, String str, String str2, Integer num, List list2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? EmptyList.f38032a : list, str, str2, num, (i10 & 16) != 0 ? EmptyList.f38032a : list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResultSentence)) {
            return false;
        }
        ResultSentence resultSentence = (ResultSentence) obj;
        if (C5207g.m11106a(this.f18928a, resultSentence.f18928a) && C5207g.m11106a(this.f18929b, resultSentence.f18929b) && C5207g.m11106a(this.f18930c, resultSentence.f18930c) && C5207g.m11106a(this.f18931d, resultSentence.f18931d) && C5207g.m11106a(this.f18932e, resultSentence.f18932e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f18928a.hashCode() * 31;
        int iHashCode2 = 0;
        String str = this.f18929b;
        int iHashCode3 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f18930c;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.f18931d;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        List<Float> list = this.f18932e;
        if (list != null) {
            iHashCode2 = list.hashCode();
        }
        return iHashCode5 + iHashCode2;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ResultSentence(tokens=");
        sb2.append(this.f18928a);
        sb2.append(", text=");
        sb2.append(this.f18929b);
        sb2.append(", normalizedText=");
        sb2.append(this.f18930c);
        sb2.append(", index=");
        sb2.append(this.f18931d);
        sb2.append(", timestamp=");
        return C0009a.m24m(sb2, this.f18932e, ")");
    }
}
