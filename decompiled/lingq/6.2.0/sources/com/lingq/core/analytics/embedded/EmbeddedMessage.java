package com.lingq.core.analytics.embedded;

import p000.ey8;
import p000.fa4;
import p000.n3c;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class EmbeddedMessage {
    public static final C1251a Companion = new C1251a();

    /* JADX INFO: renamed from: a */
    public final EmbeddedMessageMetadata f14317a;

    /* JADX INFO: renamed from: b */
    public final EmbeddedMessageElements f14318b;

    public /* synthetic */ EmbeddedMessage(int i, EmbeddedMessageMetadata embeddedMessageMetadata, EmbeddedMessageElements embeddedMessageElements) {
        if (3 != (i & 3)) {
            n3c.m17204b(i, 3, EmbeddedMessage$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f14317a = embeddedMessageMetadata;
        this.f14318b = embeddedMessageElements;
    }

    /* JADX INFO: renamed from: a */
    public final EmbeddedMessageElements m7034a() {
        return this.f14318b;
    }

    /* JADX INFO: renamed from: b */
    public final EmbeddedMessageMetadata m7035b() {
        return this.f14317a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EmbeddedMessage)) {
            return false;
        }
        EmbeddedMessage embeddedMessage = (EmbeddedMessage) obj;
        return fa4.m11650l(this.f14317a, embeddedMessage.f14317a) && fa4.m11650l(this.f14318b, embeddedMessage.f14318b);
    }

    public final int hashCode() {
        return this.f14318b.hashCode() + (this.f14317a.hashCode() * 31);
    }

    public final String toString() {
        return "EmbeddedMessage(metadata=" + this.f14317a + ", elements=" + this.f14318b + ")";
    }

    public EmbeddedMessage(EmbeddedMessageMetadata embeddedMessageMetadata, EmbeddedMessageElements embeddedMessageElements) {
        this.f14317a = embeddedMessageMetadata;
        this.f14318b = embeddedMessageElements;
    }
}
