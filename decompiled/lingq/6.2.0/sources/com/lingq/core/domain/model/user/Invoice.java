package com.lingq.core.domain.model.user;

import p000.ey8;
import p000.fa4;
import p000.n3c;
import p000.ux5;
import p000.wq1;

/* JADX INFO: loaded from: classes.dex */
@ey8
public final class Invoice {
    public static final C1504f Companion = new C1504f();

    /* JADX INFO: renamed from: a */
    public final String f19642a;

    /* JADX INFO: renamed from: b */
    public final String f19643b;

    /* JADX INFO: renamed from: c */
    public final String f19644c;

    /* JADX INFO: renamed from: d */
    public final String f19645d;

    public /* synthetic */ Invoice(int i, String str, String str2, String str3, String str4) {
        if (15 != (i & 15)) {
            n3c.m17204b(i, 15, Invoice$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f19642a = str;
        this.f19643b = str2;
        this.f19644c = str3;
        this.f19645d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Invoice)) {
            return false;
        }
        Invoice invoice = (Invoice) obj;
        return fa4.m11650l(this.f19642a, invoice.f19642a) && fa4.m11650l(this.f19643b, invoice.f19643b) && fa4.m11650l(this.f19644c, invoice.f19644c) && fa4.m11650l(this.f19645d, invoice.f19645d);
    }

    public final int hashCode() {
        return this.f19645d.hashCode() + ux5.m22980c(ux5.m22980c(this.f19642a.hashCode() * 31, this.f19643b, 31), this.f19644c, 31);
    }

    public final String toString() {
        return wq1.m24125u(ux5.m23000w("Invoice(amount=", this.f19642a, ", currency=", this.f19643b, ", reference="), this.f19644c, ", date=", this.f19645d, ")");
    }
}
