package com.lingq.shared.network.result;

import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p003a2.C0009a;
import tk.InterfaceC9307k;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC9307k(generateAdapter = true)
@Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002¨\u0006\u0003"}, m13365d2 = {"Lcom/lingq/shared/network/result/Results;", "ResultType", "", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final /* data */ class Results<ResultType> {

    /* JADX INFO: renamed from: a */
    public final int f19133a;

    /* JADX INFO: renamed from: b */
    public final String f19134b;

    /* JADX INFO: renamed from: c */
    public final String f19135c;

    /* JADX INFO: renamed from: d */
    public final List<? extends ResultType> f19136d;

    public Results(int i10, String str, String str2, List<? extends ResultType> list) {
        this.f19133a = i10;
        this.f19134b = str;
        this.f19135c = str2;
        this.f19136d = list;
    }

    public Results(int i10, String str, String str2, List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 0 : i10, str, str2, (i11 & 8) != 0 ? EmptyList.f38032a : list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Results)) {
            return false;
        }
        Results results = (Results) obj;
        return this.f19133a == results.f19133a && C5207g.m11106a(this.f19134b, results.f19134b) && C5207g.m11106a(this.f19135c, results.f19135c) && C5207g.m11106a(this.f19136d, results.f19136d);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f19133a) * 31;
        int iHashCode2 = 0;
        String str = this.f19134b;
        int iHashCode3 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f19135c;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<? extends ResultType> list = this.f19136d;
        if (list != null) {
            iHashCode2 = list.hashCode();
        }
        return iHashCode4 + iHashCode2;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Results(count=");
        sb2.append(this.f19133a);
        sb2.append(", next=");
        sb2.append(this.f19134b);
        sb2.append(", previous=");
        sb2.append(this.f19135c);
        sb2.append(", results=");
        return C0009a.m24m(sb2, this.f19136d, ")");
    }
}
