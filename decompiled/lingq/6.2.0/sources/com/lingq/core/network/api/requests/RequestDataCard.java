package com.lingq.core.network.api.requests;

import java.util.ArrayList;
import java.util.List;
import kotlin.AbstractC3192a;
import kotlin.LazyThreadSafetyMode;
import p000.AbstractC3393o1;
import p000.cs4;
import p000.ey8;
import p000.fa4;
import p000.hn1;
import p000.tx5;
import p000.ux5;
import p000.wq1;

/* JADX INFO: loaded from: classes.dex */
@ey8
public final class RequestDataCard {
    public static final C1590o Companion = new C1590o();

    /* JADX INFO: renamed from: j */
    public static final cs4[] f20344j;

    /* JADX INFO: renamed from: a */
    public final String f20345a;

    /* JADX INFO: renamed from: b */
    public final String f20346b;

    /* JADX INFO: renamed from: c */
    public final int f20347c;

    /* JADX INFO: renamed from: d */
    public final Integer f20348d;

    /* JADX INFO: renamed from: e */
    public final String f20349e;

    /* JADX INFO: renamed from: f */
    public final List f20350f;

    /* JADX INFO: renamed from: g */
    public final List f20351g;

    /* JADX INFO: renamed from: h */
    public final Integer f20352h;

    /* JADX INFO: renamed from: i */
    public final String f20353i;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        f20344j = new cs4[]{null, null, null, null, null, AbstractC3192a.m15357b(lazyThreadSafetyMode, new tx5(20)), AbstractC3192a.m15357b(lazyThreadSafetyMode, new tx5(21)), null, null};
    }

    public /* synthetic */ RequestDataCard(int i, String str, String str2, int i2, Integer num, String str3, List list, List list2, Integer num2, String str4) {
        if ((i & 1) == 0) {
            this.f20345a = null;
        } else {
            this.f20345a = str;
        }
        if ((i & 2) == 0) {
            this.f20346b = null;
        } else {
            this.f20346b = str2;
        }
        if ((i & 4) == 0) {
            this.f20347c = 0;
        } else {
            this.f20347c = i2;
        }
        if ((i & 8) == 0) {
            this.f20348d = null;
        } else {
            this.f20348d = num;
        }
        if ((i & 16) == 0) {
            this.f20349e = null;
        } else {
            this.f20349e = str3;
        }
        if ((i & 32) == 0) {
            this.f20350f = null;
        } else {
            this.f20350f = list;
        }
        if ((i & 64) == 0) {
            this.f20351g = null;
        } else {
            this.f20351g = list2;
        }
        if ((i & 128) == 0) {
            this.f20352h = null;
        } else {
            this.f20352h = num2;
        }
        if ((i & 256) == 0) {
            this.f20353i = null;
        } else {
            this.f20353i = str4;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RequestDataCard)) {
            return false;
        }
        RequestDataCard requestDataCard = (RequestDataCard) obj;
        return fa4.m11650l(this.f20345a, requestDataCard.f20345a) && fa4.m11650l(this.f20346b, requestDataCard.f20346b) && this.f20347c == requestDataCard.f20347c && fa4.m11650l(this.f20348d, requestDataCard.f20348d) && fa4.m11650l(this.f20349e, requestDataCard.f20349e) && fa4.m11650l(this.f20350f, requestDataCard.f20350f) && fa4.m11650l(this.f20351g, requestDataCard.f20351g) && fa4.m11650l(this.f20352h, requestDataCard.f20352h) && fa4.m11650l(this.f20353i, requestDataCard.f20353i);
    }

    public final int hashCode() {
        String str = this.f20345a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f20346b;
        int iM24106b = wq1.m24106b(this.f20347c, (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
        Integer num = this.f20348d;
        int iHashCode2 = (iM24106b + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.f20349e;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List list = this.f20350f;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.f20351g;
        int iHashCode5 = (iHashCode4 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Integer num2 = this.f20352h;
        int iHashCode6 = (iHashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str4 = this.f20353i;
        return iHashCode6 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbM23000w = ux5.m23000w("RequestDataCard(term=", this.f20345a, ", fragment=", this.f20346b, ", status=");
        sbM23000w.append(this.f20347c);
        sbM23000w.append(", extendedStatus=");
        sbM23000w.append(this.f20348d);
        sbM23000w.append(", notes=");
        hn1.m13366p(this.f20349e, ", hints=", ", tags=", sbM23000w, this.f20350f);
        sbM23000w.append(this.f20351g);
        sbM23000w.append(", content=");
        sbM23000w.append(this.f20352h);
        sbM23000w.append(", creationDate=");
        return AbstractC3393o1.m17738m(sbM23000w, this.f20353i, ")");
    }

    public RequestDataCard(String str, String str2, int i, Integer num, String str3, ArrayList arrayList, ArrayList arrayList2, Integer num2, String str4) {
        this.f20345a = str;
        this.f20346b = str2;
        this.f20347c = i;
        this.f20348d = num;
        this.f20349e = str3;
        this.f20350f = arrayList;
        this.f20351g = arrayList2;
        this.f20352h = num2;
        this.f20353i = str4;
    }
}
