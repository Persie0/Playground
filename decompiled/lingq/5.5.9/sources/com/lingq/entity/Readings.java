package com.lingq.entity;

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
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m13365d2 = {"Lcom/lingq/entity/Readings;", "", "model_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final /* data */ class Readings {

    /* JADX INFO: renamed from: a */
    public final List<String> f17371a;

    /* JADX INFO: renamed from: b */
    public final List<String> f17372b;

    /* JADX INFO: renamed from: c */
    public final List<String> f17373c;

    /* JADX INFO: renamed from: d */
    public final List<String> f17374d;

    /* JADX INFO: renamed from: e */
    public final List<String> f17375e;

    public Readings() {
        this(null, null, null, null, null, 31, null);
    }

    public Readings(List<String> list, List<String> list2, List<String> list3, List<String> list4, List<String> list5) {
        this.f17371a = list;
        this.f17372b = list2;
        this.f17373c = list3;
        this.f17374d = list4;
        this.f17375e = list5;
    }

    public Readings(List list, List list2, List list3, List list4, List list5, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? EmptyList.f38032a : list, (i10 & 2) != 0 ? EmptyList.f38032a : list2, (i10 & 4) != 0 ? EmptyList.f38032a : list3, (i10 & 8) != 0 ? EmptyList.f38032a : list4, (i10 & 16) != 0 ? EmptyList.f38032a : list5);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Readings)) {
            return false;
        }
        Readings readings = (Readings) obj;
        return C5207g.m11106a(this.f17371a, readings.f17371a) && C5207g.m11106a(this.f17372b, readings.f17372b) && C5207g.m11106a(this.f17373c, readings.f17373c) && C5207g.m11106a(this.f17374d, readings.f17374d) && C5207g.m11106a(this.f17375e, readings.f17375e);
    }

    public final int hashCode() {
        int iHashCode = 0;
        List<String> list = this.f17371a;
        int iHashCode2 = (list == null ? 0 : list.hashCode()) * 31;
        List<String> list2 = this.f17372b;
        int iHashCode3 = (iHashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<String> list3 = this.f17373c;
        int iHashCode4 = (iHashCode3 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<String> list4 = this.f17374d;
        int iHashCode5 = (iHashCode4 + (list4 == null ? 0 : list4.hashCode())) * 31;
        List<String> list5 = this.f17375e;
        if (list5 != null) {
            iHashCode = list5.hashCode();
        }
        return iHashCode5 + iHashCode;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Readings(romaji=");
        sb2.append(this.f17371a);
        sb2.append(", hiragana=");
        sb2.append(this.f17372b);
        sb2.append(", pinyin=");
        sb2.append(this.f17373c);
        sb2.append(", hant=");
        sb2.append(this.f17374d);
        sb2.append(", hans=");
        return C0009a.m24m(sb2, this.f17375e, ")");
    }
}
