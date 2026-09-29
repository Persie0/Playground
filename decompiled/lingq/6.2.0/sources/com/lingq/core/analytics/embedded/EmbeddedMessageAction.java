package com.lingq.core.analytics.embedded;

import p000.ey8;
import p000.fa4;
import p000.n3c;
import p000.ux5;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class EmbeddedMessageAction {
    public static final C1252b Companion = new C1252b();

    /* JADX INFO: renamed from: a */
    public final String f14319a;

    /* JADX INFO: renamed from: b */
    public final String f14320b;

    public /* synthetic */ EmbeddedMessageAction(String str, int i, String str2) {
        if (3 != (i & 3)) {
            n3c.m17204b(i, 3, EmbeddedMessageAction$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f14319a = str;
        this.f14320b = str2;
    }

    /* JADX INFO: renamed from: a */
    public final String m7036a() {
        return this.f14320b;
    }

    /* JADX INFO: renamed from: b */
    public final String m7037b() {
        return this.f14319a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EmbeddedMessageAction)) {
            return false;
        }
        EmbeddedMessageAction embeddedMessageAction = (EmbeddedMessageAction) obj;
        return fa4.m11650l(this.f14319a, embeddedMessageAction.f14319a) && fa4.m11650l(this.f14320b, embeddedMessageAction.f14320b);
    }

    public final int hashCode() {
        return this.f14320b.hashCode() + (this.f14319a.hashCode() * 31);
    }

    public final String toString() {
        return ux5.m22991n("EmbeddedMessageAction(type=", this.f14319a, ", data=", this.f14320b, ")");
    }

    public EmbeddedMessageAction(String str, String str2) {
        this.f14319a = str;
        this.f14320b = str2;
    }
}
