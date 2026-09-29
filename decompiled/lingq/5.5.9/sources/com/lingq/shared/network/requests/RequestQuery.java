package com.lingq.shared.network.requests;

import androidx.activity.result.C0204c;
import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.DefaultConstructorMarker;
import tk.InterfaceC9307k;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC9307k(generateAdapter = true)
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m13365d2 = {"Lcom/lingq/shared/network/requests/RequestQuery;", "", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final /* data */ class RequestQuery {

    /* JADX INFO: renamed from: a */
    public final int f18164a;

    /* JADX INFO: renamed from: b */
    public final String f18165b;

    /* JADX INFO: renamed from: c */
    public final Set<String> f18166c;

    /* JADX INFO: renamed from: d */
    public final Set<String> f18167d;

    /* JADX INFO: renamed from: e */
    public final Set<Integer> f18168e;

    /* JADX INFO: renamed from: f */
    public final Boolean f18169f;

    /* JADX INFO: renamed from: g */
    public final Boolean f18170g;

    /* JADX INFO: renamed from: h */
    public final Integer f18171h;

    /* JADX INFO: renamed from: i */
    public final List<String> f18172i;

    /* JADX INFO: renamed from: j */
    public final List<String> f18173j;

    /* JADX INFO: renamed from: k */
    public final Integer f18174k;

    public RequestQuery(int i10, String str, Set<String> set, Set<String> set2, Set<Integer> set3, Boolean bool, Boolean bool2, Integer num, List<String> list, List<String> list2, Integer num2) {
        C5207g.m11111f(set, "sections");
        C5207g.m11111f(set2, "resources");
        C5207g.m11111f(set3, "level");
        C5207g.m11111f(list, "tags");
        C5207g.m11111f(list2, "accents");
        this.f18164a = i10;
        this.f18165b = str;
        this.f18166c = set;
        this.f18167d = set2;
        this.f18168e = set3;
        this.f18169f = bool;
        this.f18170g = bool2;
        this.f18171h = num;
        this.f18172i = list;
        this.f18173j = list2;
        this.f18174k = num2;
    }

    public RequestQuery(int i10, String str, Set set, Set set2, Set set3, Boolean bool, Boolean bool2, Integer num, List list, List list2, Integer num2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 0 : i10, (i11 & 2) != 0 ? "" : str, (i11 & 4) != 0 ? EmptySet.f38034a : set, (i11 & 8) != 0 ? EmptySet.f38034a : set2, (i11 & 16) != 0 ? EmptySet.f38034a : set3, bool, bool2, num, (i11 & 256) != 0 ? new ArrayList() : list, (i11 & 512) != 0 ? new ArrayList() : list2, num2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RequestQuery)) {
            return false;
        }
        RequestQuery requestQuery = (RequestQuery) obj;
        if (this.f18164a == requestQuery.f18164a && C5207g.m11106a(this.f18165b, requestQuery.f18165b) && C5207g.m11106a(this.f18166c, requestQuery.f18166c) && C5207g.m11106a(this.f18167d, requestQuery.f18167d) && C5207g.m11106a(this.f18168e, requestQuery.f18168e) && C5207g.m11106a(this.f18169f, requestQuery.f18169f) && C5207g.m11106a(this.f18170g, requestQuery.f18170g) && C5207g.m11106a(this.f18171h, requestQuery.f18171h) && C5207g.m11106a(this.f18172i, requestQuery.f18172i) && C5207g.m11106a(this.f18173j, requestQuery.f18173j) && C5207g.m11106a(this.f18174k, requestQuery.f18174k)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f18164a) * 31;
        int iHashCode2 = 0;
        String str = this.f18165b;
        int iHashCode3 = (this.f18168e.hashCode() + ((this.f18167d.hashCode() + ((this.f18166c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31)) * 31;
        Boolean bool = this.f18169f;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f18170g;
        int iHashCode5 = (iHashCode4 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Integer num = this.f18171h;
        int iM848g = C0204c.m848g(this.f18173j, C0204c.m848g(this.f18172i, (iHashCode5 + (num == null ? 0 : num.hashCode())) * 31, 31), 31);
        Integer num2 = this.f18174k;
        if (num2 != null) {
            iHashCode2 = num2.hashCode();
        }
        return iM848g + iHashCode2;
    }

    public final String toString() {
        return "RequestQuery(pageSize=" + this.f18164a + ", sortBy=" + this.f18165b + ", sections=" + this.f18166c + ", resources=" + this.f18167d + ", level=" + this.f18168e + ", isExternal=" + this.f18169f + ", isPersonal=" + this.f18170g + ", provider=" + this.f18171h + ", tags=" + this.f18172i + ", accents=" + this.f18173j + ", sharedBy=" + this.f18174k + ")";
    }
}
