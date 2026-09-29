package com.lingq.core.analytics.embedded;

import p000.AbstractC3393o1;
import p000.ey8;
import p000.fa4;
import p000.n3c;
import p000.ux5;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class EmbeddedMessageText {
    public static final C1257g Companion = new C1257g();

    /* JADX INFO: renamed from: a */
    public final String f14341a;

    /* JADX INFO: renamed from: b */
    public final String f14342b;

    /* JADX INFO: renamed from: c */
    public final String f14343c;

    public /* synthetic */ EmbeddedMessageText(String str, int i, String str2, String str3) {
        if (7 != (i & 7)) {
            n3c.m17204b(i, 7, EmbeddedMessageText$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f14341a = str;
        this.f14342b = str2;
        this.f14343c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EmbeddedMessageText)) {
            return false;
        }
        EmbeddedMessageText embeddedMessageText = (EmbeddedMessageText) obj;
        return fa4.m11650l(this.f14341a, embeddedMessageText.f14341a) && fa4.m11650l(this.f14342b, embeddedMessageText.f14342b) && fa4.m11650l(this.f14343c, embeddedMessageText.f14343c);
    }

    public final int hashCode() {
        return this.f14343c.hashCode() + ux5.m22980c(this.f14341a.hashCode() * 31, this.f14342b, 31);
    }

    public final String toString() {
        return AbstractC3393o1.m17738m(ux5.m23000w("EmbeddedMessageText(text=", this.f14341a, ", label=", this.f14342b, ", id="), this.f14343c, ")");
    }

    public EmbeddedMessageText(String str, String str2, String str3) {
        this.f14341a = str;
        this.f14342b = str2;
        this.f14343c = str3;
    }
}
