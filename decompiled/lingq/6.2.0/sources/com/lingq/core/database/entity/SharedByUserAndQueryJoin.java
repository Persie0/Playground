package com.lingq.core.database.entity;

import p000.ey8;
import p000.fa4;
import p000.n3c;
import p000.ux5;
import p000.wq1;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class SharedByUserAndQueryJoin {
    public static final C1343j0 Companion = new C1343j0();

    /* JADX INFO: renamed from: a */
    public final String f17439a;

    /* JADX INFO: renamed from: b */
    public final String f17440b;

    /* JADX INFO: renamed from: c */
    public final int f17441c;

    public /* synthetic */ SharedByUserAndQueryJoin(String str, int i, int i2, String str2) {
        if (7 != (i & 7)) {
            n3c.m17204b(i, 7, SharedByUserAndQueryJoin$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f17439a = str;
        this.f17440b = str2;
        this.f17441c = i2;
    }

    /* JADX INFO: renamed from: a */
    public final String m7798a() {
        return this.f17439a;
    }

    /* JADX INFO: renamed from: b */
    public final String m7799b() {
        return this.f17440b;
    }

    /* JADX INFO: renamed from: c */
    public final int m7800c() {
        return this.f17441c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SharedByUserAndQueryJoin)) {
            return false;
        }
        SharedByUserAndQueryJoin sharedByUserAndQueryJoin = (SharedByUserAndQueryJoin) obj;
        return fa4.m11650l(this.f17439a, sharedByUserAndQueryJoin.f17439a) && fa4.m11650l(this.f17440b, sharedByUserAndQueryJoin.f17440b) && this.f17441c == sharedByUserAndQueryJoin.f17441c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f17441c) + ux5.m22980c(this.f17439a.hashCode() * 31, this.f17440b, 31);
    }

    public final String toString() {
        return wq1.m24123s(ux5.m23000w("SharedByUserAndQueryJoin(language=", this.f17439a, ", query=", this.f17440b, ", userId="), this.f17441c, ")");
    }

    public SharedByUserAndQueryJoin(String str, int i, String str2) {
        this.f17439a = str;
        this.f17440b = str2;
        this.f17441c = i;
    }
}
