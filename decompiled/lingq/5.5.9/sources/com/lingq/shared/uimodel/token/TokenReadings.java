package com.lingq.shared.uimodel.token;

import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import tk.InterfaceC9307k;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC9307k(generateAdapter = true)
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m13365d2 = {"Lcom/lingq/shared/uimodel/token/TokenReadings;", "", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final /* data */ class TokenReadings {

    /* JADX INFO: renamed from: a */
    public final List<String> f22101a;

    /* JADX INFO: renamed from: b */
    public final List<String> f22102b;

    /* JADX INFO: renamed from: c */
    public final List<String> f22103c;

    /* JADX INFO: renamed from: d */
    public final List<String> f22104d;

    /* JADX INFO: renamed from: e */
    public final List<String> f22105e;

    /* JADX INFO: renamed from: f */
    public final List<String> f22106f;

    public TokenReadings() {
        this(null, null, null, null, null, null, 63, null);
    }

    public TokenReadings(List<String> list, List<String> list2, List<String> list3, List<String> list4, List<String> list5, List<String> list6) {
        this.f22101a = list;
        this.f22102b = list2;
        this.f22103c = list3;
        this.f22104d = list4;
        this.f22105e = list5;
        this.f22106f = list6;
    }

    public TokenReadings(List list, List list2, List list3, List list4, List list5, List list6, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? EmptyList.f38032a : list, (i10 & 2) != 0 ? EmptyList.f38032a : list2, (i10 & 4) != 0 ? EmptyList.f38032a : list3, (i10 & 8) != 0 ? EmptyList.f38032a : list4, (i10 & 16) != 0 ? EmptyList.f38032a : list5, (i10 & 32) != 0 ? EmptyList.f38032a : list6);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TokenReadings)) {
            return false;
        }
        TokenReadings tokenReadings = (TokenReadings) obj;
        return C5207g.m11106a(this.f22101a, tokenReadings.f22101a) && C5207g.m11106a(this.f22102b, tokenReadings.f22102b) && C5207g.m11106a(this.f22103c, tokenReadings.f22103c) && C5207g.m11106a(this.f22104d, tokenReadings.f22104d) && C5207g.m11106a(this.f22105e, tokenReadings.f22105e) && C5207g.m11106a(this.f22106f, tokenReadings.f22106f);
    }

    public final int hashCode() {
        int iHashCode = 0;
        List<String> list = this.f22101a;
        int iHashCode2 = (list == null ? 0 : list.hashCode()) * 31;
        List<String> list2 = this.f22102b;
        int iHashCode3 = (iHashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<String> list3 = this.f22103c;
        int iHashCode4 = (iHashCode3 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<String> list4 = this.f22104d;
        int iHashCode5 = (iHashCode4 + (list4 == null ? 0 : list4.hashCode())) * 31;
        List<String> list5 = this.f22105e;
        int iHashCode6 = (iHashCode5 + (list5 == null ? 0 : list5.hashCode())) * 31;
        List<String> list6 = this.f22106f;
        if (list6 != null) {
            iHashCode = list6.hashCode();
        }
        return iHashCode6 + iHashCode;
    }

    public final String toString() {
        return "TokenReadings(romaji=" + this.f22101a + ", hiragana=" + this.f22102b + ", pinyin=" + this.f22103c + ", hant=" + this.f22104d + ", hans=" + this.f22105e + ", jyutping=" + this.f22106f + ")";
    }
}
