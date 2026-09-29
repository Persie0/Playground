package com.lingq.core.database.entity;

import p000.AbstractC3393o1;
import p000.ey8;
import p000.fa4;
import p000.n3c;
import p000.ux5;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class NotificationEntity {
    public static final C1335f0 Companion = new C1335f0();

    /* JADX INFO: renamed from: a */
    public final int f17412a;

    /* JADX INFO: renamed from: b */
    public final String f17413b;

    /* JADX INFO: renamed from: c */
    public final String f17414c;

    /* JADX INFO: renamed from: d */
    public final String f17415d;

    /* JADX INFO: renamed from: e */
    public final String f17416e;

    /* JADX INFO: renamed from: f */
    public final String f17417f;

    /* JADX INFO: renamed from: g */
    public final String f17418g;

    /* JADX INFO: renamed from: h */
    public final String f17419h;

    /* JADX INFO: renamed from: i */
    public final Boolean f17420i;

    /* JADX INFO: renamed from: j */
    public final String f17421j;

    public /* synthetic */ NotificationEntity(int i, int i2, String str, String str2, String str3, String str4, String str5, String str6, String str7, Boolean bool, String str8) {
        if (1022 != (i & 1022)) {
            n3c.m17204b(i, 1022, NotificationEntity$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        if ((i & 1) == 0) {
            this.f17412a = 0;
        } else {
            this.f17412a = i2;
        }
        this.f17413b = str;
        this.f17414c = str2;
        this.f17415d = str3;
        this.f17416e = str4;
        this.f17417f = str5;
        this.f17418g = str6;
        this.f17419h = str7;
        this.f17420i = bool;
        this.f17421j = str8;
    }

    /* JADX INFO: renamed from: a */
    public final String m7781a() {
        return this.f17419h;
    }

    /* JADX INFO: renamed from: b */
    public final String m7782b() {
        return this.f17414c;
    }

    /* JADX INFO: renamed from: c */
    public final String m7783c() {
        return this.f17418g;
    }

    /* JADX INFO: renamed from: d */
    public final String m7784d() {
        return this.f17415d;
    }

    /* JADX INFO: renamed from: e */
    public final int m7785e() {
        return this.f17412a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NotificationEntity)) {
            return false;
        }
        NotificationEntity notificationEntity = (NotificationEntity) obj;
        return this.f17412a == notificationEntity.f17412a && fa4.m11650l(this.f17413b, notificationEntity.f17413b) && fa4.m11650l(this.f17414c, notificationEntity.f17414c) && fa4.m11650l(this.f17415d, notificationEntity.f17415d) && fa4.m11650l(this.f17416e, notificationEntity.f17416e) && fa4.m11650l(this.f17417f, notificationEntity.f17417f) && fa4.m11650l(this.f17418g, notificationEntity.f17418g) && fa4.m11650l(this.f17419h, notificationEntity.f17419h) && fa4.m11650l(this.f17420i, notificationEntity.f17420i) && fa4.m11650l(this.f17421j, notificationEntity.f17421j);
    }

    /* JADX INFO: renamed from: f */
    public final String m7786f() {
        return this.f17421j;
    }

    /* JADX INFO: renamed from: g */
    public final String m7787g() {
        return this.f17417f;
    }

    /* JADX INFO: renamed from: h */
    public final String m7788h() {
        return this.f17416e;
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f17412a) * 31;
        String str = this.f17413b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f17414c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f17415d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f17416e;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f17417f;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f17418g;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f17419h;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Boolean bool = this.f17420i;
        int iHashCode9 = (iHashCode8 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str8 = this.f17421j;
        return iHashCode9 + (str8 != null ? str8.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i */
    public final String m7789i() {
        return this.f17413b;
    }

    /* JADX INFO: renamed from: j */
    public final Boolean m7790j() {
        return this.f17420i;
    }

    public final String toString() {
        StringBuilder sbM22995r = ux5.m22995r(this.f17412a, "NotificationEntity(pk=", ", url=", this.f17413b, ", language=");
        AbstractC3393o1.m17725C(sbM22995r, this.f17414c, ", notificationLanguage=", this.f17415d, ", type=");
        AbstractC3393o1.m17725C(sbM22995r, this.f17416e, ", title=", this.f17417f, ", message=");
        AbstractC3393o1.m17725C(sbM22995r, this.f17418g, ", image=", this.f17419h, ", isNew=");
        sbM22995r.append(this.f17420i);
        sbM22995r.append(", timestamp=");
        sbM22995r.append(this.f17421j);
        sbM22995r.append(")");
        return sbM22995r.toString();
    }

    public NotificationEntity(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, Boolean bool, String str8) {
        this.f17412a = i;
        this.f17413b = str;
        this.f17414c = str2;
        this.f17415d = str3;
        this.f17416e = str4;
        this.f17417f = str5;
        this.f17418g = str6;
        this.f17419h = str7;
        this.f17420i = bool;
        this.f17421j = str8;
    }
}
