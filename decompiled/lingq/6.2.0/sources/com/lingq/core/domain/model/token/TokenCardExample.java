package com.lingq.core.domain.model.token;

import p000.AbstractC3393o1;
import p000.ey8;
import p000.fa4;
import p000.wq1;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class TokenCardExample {
    public static final C1489e Companion = new C1489e();

    /* JADX INFO: renamed from: a */
    public final String f19580a;

    /* JADX INFO: renamed from: b */
    public final int f19581b;

    /* JADX INFO: renamed from: c */
    public final int f19582c;

    public /* synthetic */ TokenCardExample(int i, int i2, int i3, String str) {
        this.f19580a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.f19581b = 0;
        } else {
            this.f19581b = i2;
        }
        if ((i & 4) == 0) {
            this.f19582c = 0;
        } else {
            this.f19582c = i3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TokenCardExample)) {
            return false;
        }
        TokenCardExample tokenCardExample = (TokenCardExample) obj;
        return fa4.m11650l(this.f19580a, tokenCardExample.f19580a) && this.f19581b == tokenCardExample.f19581b && this.f19582c == tokenCardExample.f19582c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f19582c) + wq1.m24106b(this.f19581b, this.f19580a.hashCode() * 31, 31);
    }

    public final String toString() {
        return wq1.m24123s(AbstractC3393o1.m17741p(this.f19581b, "TokenCardExample(fragment=", this.f19580a, ", collectionId=", ", contentId="), this.f19582c, ")");
    }
}
