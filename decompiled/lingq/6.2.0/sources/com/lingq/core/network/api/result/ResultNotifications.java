package com.lingq.core.network.api.result;

import java.util.List;
import kotlin.AbstractC3192a;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;
import p000.cs4;
import p000.ey8;
import p000.fa4;
import p000.hn1;
import p000.ux5;
import p000.x88;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class ResultNotifications {
    public static final C1786y2 Companion = new C1786y2();

    /* JADX INFO: renamed from: f */
    public static final cs4[] f21352f = {null, null, null, null, AbstractC3192a.m15357b(LazyThreadSafetyMode.PUBLICATION, new x88(24))};

    /* JADX INFO: renamed from: a */
    public final int f21353a;

    /* JADX INFO: renamed from: b */
    public final String f21354b;

    /* JADX INFO: renamed from: c */
    public final String f21355c;

    /* JADX INFO: renamed from: d */
    public final Integer f21356d;

    /* JADX INFO: renamed from: e */
    public final List f21357e;

    public /* synthetic */ ResultNotifications(int i, int i2, String str, String str2, Integer num, List list) {
        this.f21353a = (i & 1) == 0 ? 0 : i2;
        if ((i & 2) == 0) {
            this.f21354b = null;
        } else {
            this.f21354b = str;
        }
        if ((i & 4) == 0) {
            this.f21355c = null;
        } else {
            this.f21355c = str2;
        }
        if ((i & 8) == 0) {
            this.f21356d = null;
        } else {
            this.f21356d = num;
        }
        if ((i & 16) == 0) {
            this.f21357e = EmptyList.f47638a;
        } else {
            this.f21357e = list;
        }
    }

    /* JADX INFO: renamed from: a */
    public final int m8377a() {
        return this.f21353a;
    }

    /* JADX INFO: renamed from: b */
    public final List m8378b() {
        return this.f21357e;
    }

    /* JADX INFO: renamed from: c */
    public final Integer m8379c() {
        return this.f21356d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResultNotifications)) {
            return false;
        }
        ResultNotifications resultNotifications = (ResultNotifications) obj;
        return this.f21353a == resultNotifications.f21353a && fa4.m11650l(this.f21354b, resultNotifications.f21354b) && fa4.m11650l(this.f21355c, resultNotifications.f21355c) && fa4.m11650l(this.f21356d, resultNotifications.f21356d) && fa4.m11650l(this.f21357e, resultNotifications.f21357e);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f21353a) * 31;
        String str = this.f21354b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f21355c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.f21356d;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        List list = this.f21357e;
        return iHashCode4 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbM22995r = ux5.m22995r(this.f21353a, "ResultNotifications(count=", ", next=", this.f21354b, ", previous=");
        hn1.m13371u(sbM22995r, this.f21355c, ", unreadNotifications=", this.f21356d, ", results=");
        return hn1.m13356f(sbM22995r, this.f21357e, ")");
    }
}
