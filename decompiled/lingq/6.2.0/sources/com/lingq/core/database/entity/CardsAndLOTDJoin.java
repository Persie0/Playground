package com.lingq.core.database.entity;

import p000.ey8;
import p000.fa4;
import p000.n3c;
import p000.ux5;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class CardsAndLOTDJoin {
    public static final C1326b Companion = new C1326b();

    /* JADX INFO: renamed from: a */
    public final String f17080a;

    /* JADX INFO: renamed from: b */
    public final String f17081b;

    public /* synthetic */ CardsAndLOTDJoin(String str, int i, String str2) {
        if (3 != (i & 3)) {
            n3c.m17204b(i, 3, CardsAndLOTDJoin$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f17080a = str;
        this.f17081b = str2;
    }

    /* JADX INFO: renamed from: a */
    public final String m7546a() {
        return this.f17081b;
    }

    /* JADX INFO: renamed from: b */
    public final String m7547b() {
        return this.f17080a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CardsAndLOTDJoin)) {
            return false;
        }
        CardsAndLOTDJoin cardsAndLOTDJoin = (CardsAndLOTDJoin) obj;
        return fa4.m11650l(this.f17080a, cardsAndLOTDJoin.f17080a) && fa4.m11650l(this.f17081b, cardsAndLOTDJoin.f17081b);
    }

    public final int hashCode() {
        return this.f17081b.hashCode() + (this.f17080a.hashCode() * 31);
    }

    public final String toString() {
        return ux5.m22991n("CardsAndLOTDJoin(termWithLanguage=", this.f17080a, ", lotd=", this.f17081b, ")");
    }

    public CardsAndLOTDJoin(String str, String str2) {
        str2.getClass();
        this.f17080a = str;
        this.f17081b = str2;
    }
}
