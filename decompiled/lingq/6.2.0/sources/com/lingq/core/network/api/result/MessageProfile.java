package com.lingq.core.network.api.result;

import java.util.Map;
import kotlin.AbstractC3192a;
import kotlin.LazyThreadSafetyMode;
import p000.AbstractC3393o1;
import p000.cs4;
import p000.ey8;
import p000.fa4;
import p000.tx5;
import p000.ux5;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class MessageProfile {
    public static final C1684l Companion = new C1684l();

    /* JADX INFO: renamed from: g */
    public static final cs4[] f20557g = {null, null, null, null, null, AbstractC3192a.m15357b(LazyThreadSafetyMode.PUBLICATION, new tx5(0))};

    /* JADX INFO: renamed from: a */
    public final String f20558a;

    /* JADX INFO: renamed from: b */
    public final String f20559b;

    /* JADX INFO: renamed from: c */
    public final String f20560c;

    /* JADX INFO: renamed from: d */
    public final String f20561d;

    /* JADX INFO: renamed from: e */
    public final String f20562e;

    /* JADX INFO: renamed from: f */
    public final Map f20563f;

    public /* synthetic */ MessageProfile(int i, String str, String str2, String str3, String str4, String str5, Map map) {
        if ((i & 1) == 0) {
            this.f20558a = null;
        } else {
            this.f20558a = str;
        }
        if ((i & 2) == 0) {
            this.f20559b = null;
        } else {
            this.f20559b = str2;
        }
        if ((i & 4) == 0) {
            this.f20560c = null;
        } else {
            this.f20560c = str3;
        }
        if ((i & 8) == 0) {
            this.f20561d = null;
        } else {
            this.f20561d = str4;
        }
        if ((i & 16) == 0) {
            this.f20562e = null;
        } else {
            this.f20562e = str5;
        }
        if ((i & 32) == 0) {
            this.f20563f = null;
        } else {
            this.f20563f = map;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessageProfile)) {
            return false;
        }
        MessageProfile messageProfile = (MessageProfile) obj;
        return fa4.m11650l(this.f20558a, messageProfile.f20558a) && fa4.m11650l(this.f20559b, messageProfile.f20559b) && fa4.m11650l(this.f20560c, messageProfile.f20560c) && fa4.m11650l(this.f20561d, messageProfile.f20561d) && fa4.m11650l(this.f20562e, messageProfile.f20562e) && fa4.m11650l(this.f20563f, messageProfile.f20563f);
    }

    public final int hashCode() {
        String str = this.f20558a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f20559b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f20560c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f20561d;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f20562e;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Map map = this.f20563f;
        return iHashCode5 + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbM23000w = ux5.m23000w("MessageProfile(body=", this.f20558a, ", image=", this.f20559b, ", title=");
        AbstractC3393o1.m17725C(sbM23000w, this.f20560c, ", type=", this.f20561d, ", url=");
        sbM23000w.append(this.f20562e);
        sbM23000w.append(", extra=");
        sbM23000w.append(this.f20563f);
        sbM23000w.append(")");
        return sbM23000w.toString();
    }
}
