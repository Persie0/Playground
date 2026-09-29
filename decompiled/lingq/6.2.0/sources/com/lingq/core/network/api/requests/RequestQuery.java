package com.lingq.core.network.api.requests;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.AbstractC3192a;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptySet;
import p000.cs4;
import p000.ey8;
import p000.fa4;
import p000.hn1;
import p000.m78;
import p000.ux5;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class RequestQuery {
    public static final C1599s0 Companion = new C1599s0();

    /* JADX INFO: renamed from: m */
    public static final cs4[] f20427m;

    /* JADX INFO: renamed from: a */
    public final int f20428a;

    /* JADX INFO: renamed from: b */
    public final String f20429b;

    /* JADX INFO: renamed from: c */
    public final Set f20430c;

    /* JADX INFO: renamed from: d */
    public final Set f20431d;

    /* JADX INFO: renamed from: e */
    public final Set f20432e;

    /* JADX INFO: renamed from: f */
    public final Boolean f20433f;

    /* JADX INFO: renamed from: g */
    public final Boolean f20434g;

    /* JADX INFO: renamed from: h */
    public final Integer f20435h;

    /* JADX INFO: renamed from: i */
    public final List f20436i;

    /* JADX INFO: renamed from: j */
    public final List f20437j;

    /* JADX INFO: renamed from: k */
    public final Integer f20438k;

    /* JADX INFO: renamed from: l */
    public final Boolean f20439l;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        f20427m = new cs4[]{null, null, AbstractC3192a.m15357b(lazyThreadSafetyMode, new m78(0)), AbstractC3192a.m15357b(lazyThreadSafetyMode, new m78(1)), AbstractC3192a.m15357b(lazyThreadSafetyMode, new m78(2)), null, null, null, AbstractC3192a.m15357b(lazyThreadSafetyMode, new m78(3)), AbstractC3192a.m15357b(lazyThreadSafetyMode, new m78(4)), null, null};
    }

    public /* synthetic */ RequestQuery(int i, int i2, String str, Set set, Set set2, Set set3, Boolean bool, Boolean bool2, Integer num, List list, List list2, Integer num2, Boolean bool3) {
        this.f20428a = (i & 1) == 0 ? 0 : i2;
        if ((i & 2) == 0) {
            this.f20429b = "";
        } else {
            this.f20429b = str;
        }
        int i3 = i & 4;
        EmptySet emptySet = EmptySet.f47640a;
        if (i3 == 0) {
            this.f20430c = emptySet;
        } else {
            this.f20430c = set;
        }
        if ((i & 8) == 0) {
            this.f20431d = emptySet;
        } else {
            this.f20431d = set2;
        }
        if ((i & 16) == 0) {
            this.f20432e = emptySet;
        } else {
            this.f20432e = set3;
        }
        if ((i & 32) == 0) {
            this.f20433f = null;
        } else {
            this.f20433f = bool;
        }
        if ((i & 64) == 0) {
            this.f20434g = null;
        } else {
            this.f20434g = bool2;
        }
        if ((i & 128) == 0) {
            this.f20435h = null;
        } else {
            this.f20435h = num;
        }
        if ((i & 256) == 0) {
            this.f20436i = new ArrayList();
        } else {
            this.f20436i = list;
        }
        if ((i & 512) == 0) {
            this.f20437j = new ArrayList();
        } else {
            this.f20437j = list2;
        }
        if ((i & 1024) == 0) {
            this.f20438k = null;
        } else {
            this.f20438k = num2;
        }
        if ((i & 2048) == 0) {
            this.f20439l = Boolean.FALSE;
        } else {
            this.f20439l = bool3;
        }
    }

    /* JADX INFO: renamed from: a */
    public final List m8263a() {
        return this.f20437j;
    }

    /* JADX INFO: renamed from: b */
    public final Set m8264b() {
        return this.f20432e;
    }

    /* JADX INFO: renamed from: c */
    public final Integer m8265c() {
        return this.f20435h;
    }

    /* JADX INFO: renamed from: d */
    public final Set m8266d() {
        return this.f20431d;
    }

    /* JADX INFO: renamed from: e */
    public final Integer m8267e() {
        return this.f20438k;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RequestQuery)) {
            return false;
        }
        RequestQuery requestQuery = (RequestQuery) obj;
        return this.f20428a == requestQuery.f20428a && fa4.m11650l(this.f20429b, requestQuery.f20429b) && fa4.m11650l(this.f20430c, requestQuery.f20430c) && fa4.m11650l(this.f20431d, requestQuery.f20431d) && fa4.m11650l(this.f20432e, requestQuery.f20432e) && fa4.m11650l(this.f20433f, requestQuery.f20433f) && fa4.m11650l(this.f20434g, requestQuery.f20434g) && fa4.m11650l(this.f20435h, requestQuery.f20435h) && fa4.m11650l(this.f20436i, requestQuery.f20436i) && fa4.m11650l(this.f20437j, requestQuery.f20437j) && fa4.m11650l(this.f20438k, requestQuery.f20438k) && fa4.m11650l(this.f20439l, requestQuery.f20439l);
    }

    /* JADX INFO: renamed from: f */
    public final String m8268f() {
        return this.f20429b;
    }

    /* JADX INFO: renamed from: g */
    public final List m8269g() {
        return this.f20436i;
    }

    /* JADX INFO: renamed from: h */
    public final Boolean m8270h() {
        return this.f20433f;
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f20428a) * 31;
        String str = this.f20429b;
        int iHashCode2 = (this.f20432e.hashCode() + ((this.f20431d.hashCode() + ((this.f20430c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31)) * 31;
        Boolean bool = this.f20433f;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f20434g;
        int iHashCode4 = (iHashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Integer num = this.f20435h;
        int iM22979b = ux5.m22979b(ux5.m22979b((iHashCode4 + (num == null ? 0 : num.hashCode())) * 31, 31, this.f20436i), 31, this.f20437j);
        Integer num2 = this.f20438k;
        int iHashCode5 = (iM22979b + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool3 = this.f20439l;
        return iHashCode5 + (bool3 != null ? bool3.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i */
    public final Boolean m8271i() {
        return this.f20439l;
    }

    /* JADX INFO: renamed from: j */
    public final Boolean m8272j() {
        return this.f20434g;
    }

    public final String toString() {
        StringBuilder sbM22995r = ux5.m22995r(this.f20428a, "RequestQuery(pageSize=", ", sortBy=", this.f20429b, ", sections=");
        sbM22995r.append(this.f20430c);
        sbM22995r.append(", resources=");
        sbM22995r.append(this.f20431d);
        sbM22995r.append(", level=");
        sbM22995r.append(this.f20432e);
        sbM22995r.append(", isExternal=");
        sbM22995r.append(this.f20433f);
        sbM22995r.append(", isPersonal=");
        sbM22995r.append(this.f20434g);
        sbM22995r.append(", provider=");
        sbM22995r.append(this.f20435h);
        sbM22995r.append(", tags=");
        hn1.m13372v(sbM22995r, this.f20436i, ", accents=", this.f20437j, ", sharedBy=");
        sbM22995r.append(this.f20438k);
        sbM22995r.append(", isPending=");
        sbM22995r.append(this.f20439l);
        sbM22995r.append(")");
        return sbM22995r.toString();
    }

    public RequestQuery(int i, String str, LinkedHashSet linkedHashSet, LinkedHashSet linkedHashSet2, Boolean bool, Boolean bool2, Integer num, List list, List list2, Integer num2, Boolean bool3) {
        list.getClass();
        this.f20428a = i;
        this.f20429b = str;
        this.f20430c = EmptySet.f47640a;
        this.f20431d = linkedHashSet;
        this.f20432e = linkedHashSet2;
        this.f20433f = bool;
        this.f20434g = bool2;
        this.f20435h = num;
        this.f20436i = list;
        this.f20437j = list2;
        this.f20438k = num2;
        this.f20439l = bool3;
    }
}
