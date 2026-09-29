package com.lingq.core.network.api.result;

import p000.ey8;
import p000.fa4;
import p000.ux5;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class ContentType {
    public static final C1648f Companion = new C1648f();

    /* JADX INFO: renamed from: a */
    public final String f20518a;

    /* JADX INFO: renamed from: b */
    public final String f20519b;

    /* JADX INFO: renamed from: c */
    public final Integer f20520c;

    public /* synthetic */ ContentType(int i, Integer num, String str, String str2) {
        if ((i & 1) == 0) {
            this.f20518a = null;
        } else {
            this.f20518a = str;
        }
        if ((i & 2) == 0) {
            this.f20519b = null;
        } else {
            this.f20519b = str2;
        }
        if ((i & 4) == 0) {
            this.f20520c = null;
        } else {
            this.f20520c = num;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContentType)) {
            return false;
        }
        ContentType contentType = (ContentType) obj;
        return fa4.m11650l(this.f20518a, contentType.f20518a) && fa4.m11650l(this.f20519b, contentType.f20519b) && fa4.m11650l(this.f20520c, contentType.f20520c);
    }

    public final int hashCode() {
        String str = this.f20518a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f20519b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.f20520c;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbM23000w = ux5.m23000w("ContentType(appLabel=", this.f20518a, ", model=", this.f20519b, ", pk=");
        sbM23000w.append(this.f20520c);
        sbM23000w.append(")");
        return sbM23000w.toString();
    }

    public ContentType() {
        this.f20518a = null;
        this.f20519b = null;
        this.f20520c = null;
    }
}
