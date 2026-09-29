package com.lingq.core.analytics.embedded;

import p000.AbstractC3393o1;
import p000.ey8;
import p000.fa4;
import p000.n3c;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class EmbeddedMessageButton {
    public static final C1253c Companion = new C1253c();

    /* JADX INFO: renamed from: a */
    public final String f14321a;

    /* JADX INFO: renamed from: b */
    public final EmbeddedMessageAction f14322b;

    /* JADX INFO: renamed from: c */
    public final String f14323c;

    public /* synthetic */ EmbeddedMessageButton(int i, String str, EmbeddedMessageAction embeddedMessageAction, String str2) {
        if (7 != (i & 7)) {
            n3c.m17204b(i, 7, EmbeddedMessageButton$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f14321a = str;
        this.f14322b = embeddedMessageAction;
        this.f14323c = str2;
    }

    /* JADX INFO: renamed from: a */
    public final EmbeddedMessageAction m7038a() {
        return this.f14322b;
    }

    /* JADX INFO: renamed from: b */
    public final String m7039b() {
        return this.f14323c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EmbeddedMessageButton)) {
            return false;
        }
        EmbeddedMessageButton embeddedMessageButton = (EmbeddedMessageButton) obj;
        return fa4.m11650l(this.f14321a, embeddedMessageButton.f14321a) && fa4.m11650l(this.f14322b, embeddedMessageButton.f14322b) && fa4.m11650l(this.f14323c, embeddedMessageButton.f14323c);
    }

    public final int hashCode() {
        return this.f14323c.hashCode() + ((this.f14322b.hashCode() + (this.f14321a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EmbeddedMessageButton(title=");
        sb.append(this.f14321a);
        sb.append(", action=");
        sb.append(this.f14322b);
        sb.append(", id=");
        return AbstractC3393o1.m17738m(sb, this.f14323c, ")");
    }

    public EmbeddedMessageButton(String str, EmbeddedMessageAction embeddedMessageAction, String str2) {
        this.f14321a = str;
        this.f14322b = embeddedMessageAction;
        this.f14323c = str2;
    }
}
