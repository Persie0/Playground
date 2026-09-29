package com.lingq.core.network.api.result;

import p000.ey8;
import p000.fa4;
import p000.wq1;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class BookObject {
    public static final C1628c Companion = new C1628c();

    /* JADX INFO: renamed from: a */
    public final Integer f20503a;

    /* JADX INFO: renamed from: b */
    public final String f20504b;

    /* JADX INFO: renamed from: c */
    public final String f20505c;

    /* JADX INFO: renamed from: d */
    public final String f20506d;

    public /* synthetic */ BookObject(int i, Integer num, String str, String str2, String str3) {
        if ((i & 1) == 0) {
            this.f20503a = null;
        } else {
            this.f20503a = num;
        }
        if ((i & 2) == 0) {
            this.f20504b = null;
        } else {
            this.f20504b = str;
        }
        if ((i & 4) == 0) {
            this.f20505c = null;
        } else {
            this.f20505c = str2;
        }
        if ((i & 8) == 0) {
            this.f20506d = null;
        } else {
            this.f20506d = str3;
        }
    }

    /* JADX INFO: renamed from: a */
    public final Integer m8276a() {
        return this.f20503a;
    }

    /* JADX INFO: renamed from: b */
    public final String m8277b() {
        return this.f20504b;
    }

    /* JADX INFO: renamed from: c */
    public final String m8278c() {
        return this.f20505c;
    }

    /* JADX INFO: renamed from: d */
    public final String m8279d() {
        return this.f20506d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BookObject)) {
            return false;
        }
        BookObject bookObject = (BookObject) obj;
        return fa4.m11650l(this.f20503a, bookObject.f20503a) && fa4.m11650l(this.f20504b, bookObject.f20504b) && fa4.m11650l(this.f20505c, bookObject.f20505c) && fa4.m11650l(this.f20506d, bookObject.f20506d);
    }

    public final int hashCode() {
        Integer num = this.f20503a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.f20504b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f20505c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f20506d;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BookObject(id=");
        sb.append(this.f20503a);
        sb.append(", imageUrl=");
        sb.append(this.f20504b);
        sb.append(", language=");
        return wq1.m24125u(sb, this.f20505c, ", title=", this.f20506d, ")");
    }

    public BookObject() {
        this.f20503a = null;
        this.f20504b = null;
        this.f20505c = null;
        this.f20506d = null;
    }
}
