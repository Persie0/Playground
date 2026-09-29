package com.lingq.core.network.api.result;

import java.util.List;
import kotlin.AbstractC3192a;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;
import p000.cs4;
import p000.ey8;
import p000.fa4;
import p000.g98;
import p000.hn1;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class ResultTokenReadings {
    public static final C1665h4 Companion = new C1665h4();

    /* JADX INFO: renamed from: g */
    public static final cs4[] f21597g;

    /* JADX INFO: renamed from: a */
    public final List f21598a;

    /* JADX INFO: renamed from: b */
    public final List f21599b;

    /* JADX INFO: renamed from: c */
    public final List f21600c;

    /* JADX INFO: renamed from: d */
    public final List f21601d;

    /* JADX INFO: renamed from: e */
    public final List f21602e;

    /* JADX INFO: renamed from: f */
    public final List f21603f;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        f21597g = new cs4[]{AbstractC3192a.m15357b(lazyThreadSafetyMode, new g98(7)), AbstractC3192a.m15357b(lazyThreadSafetyMode, new g98(8)), AbstractC3192a.m15357b(lazyThreadSafetyMode, new g98(9)), AbstractC3192a.m15357b(lazyThreadSafetyMode, new g98(10)), AbstractC3192a.m15357b(lazyThreadSafetyMode, new g98(11)), AbstractC3192a.m15357b(lazyThreadSafetyMode, new g98(12))};
    }

    public /* synthetic */ ResultTokenReadings(int i, List list, List list2, List list3, List list4, List list5, List list6) {
        int i2 = i & 1;
        EmptyList emptyList = EmptyList.f47638a;
        if (i2 == 0) {
            this.f21598a = emptyList;
        } else {
            this.f21598a = list;
        }
        if ((i & 2) == 0) {
            this.f21599b = emptyList;
        } else {
            this.f21599b = list2;
        }
        if ((i & 4) == 0) {
            this.f21600c = emptyList;
        } else {
            this.f21600c = list3;
        }
        if ((i & 8) == 0) {
            this.f21601d = emptyList;
        } else {
            this.f21601d = list4;
        }
        if ((i & 16) == 0) {
            this.f21602e = emptyList;
        } else {
            this.f21602e = list5;
        }
        if ((i & 32) == 0) {
            this.f21603f = emptyList;
        } else {
            this.f21603f = list6;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResultTokenReadings)) {
            return false;
        }
        ResultTokenReadings resultTokenReadings = (ResultTokenReadings) obj;
        return fa4.m11650l(this.f21598a, resultTokenReadings.f21598a) && fa4.m11650l(this.f21599b, resultTokenReadings.f21599b) && fa4.m11650l(this.f21600c, resultTokenReadings.f21600c) && fa4.m11650l(this.f21601d, resultTokenReadings.f21601d) && fa4.m11650l(this.f21602e, resultTokenReadings.f21602e) && fa4.m11650l(this.f21603f, resultTokenReadings.f21603f);
    }

    public final int hashCode() {
        List list = this.f21598a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List list2 = this.f21599b;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List list3 = this.f21600c;
        int iHashCode3 = (iHashCode2 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List list4 = this.f21601d;
        int iHashCode4 = (iHashCode3 + (list4 == null ? 0 : list4.hashCode())) * 31;
        List list5 = this.f21602e;
        int iHashCode5 = (iHashCode4 + (list5 == null ? 0 : list5.hashCode())) * 31;
        List list6 = this.f21603f;
        return iHashCode5 + (list6 != null ? list6.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ResultTokenReadings(romaji=");
        sb.append(this.f21598a);
        sb.append(", hiragana=");
        sb.append(this.f21599b);
        sb.append(", pinyin=");
        hn1.m13372v(sb, this.f21600c, ", hant=", this.f21601d, ", hans=");
        sb.append(this.f21602e);
        sb.append(", jyutping=");
        sb.append(this.f21603f);
        sb.append(")");
        return sb.toString();
    }
}
