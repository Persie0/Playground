package com.lingq.core.domain.model.token;

import p000.ey8;
import p000.fa4;
import p000.n3c;
import p000.ux5;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class LocalTextToSpeechVoice {
    public static final C1485a Companion = new C1485a();

    /* JADX INFO: renamed from: a */
    public final String f19561a;

    /* JADX INFO: renamed from: b */
    public final String f19562b;

    public /* synthetic */ LocalTextToSpeechVoice(String str, int i, String str2) {
        if (3 != (i & 3)) {
            n3c.m17204b(i, 3, LocalTextToSpeechVoice$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f19561a = str;
        this.f19562b = str2;
    }

    /* JADX INFO: renamed from: a */
    public final String m8119a() {
        return this.f19561a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocalTextToSpeechVoice)) {
            return false;
        }
        LocalTextToSpeechVoice localTextToSpeechVoice = (LocalTextToSpeechVoice) obj;
        return fa4.m11650l(this.f19561a, localTextToSpeechVoice.f19561a) && fa4.m11650l(this.f19562b, localTextToSpeechVoice.f19562b);
    }

    public final int hashCode() {
        return this.f19562b.hashCode() + (this.f19561a.hashCode() * 31);
    }

    public final String toString() {
        return ux5.m22991n("LocalTextToSpeechVoice(name=", this.f19561a, ", title=", this.f19562b, ")");
    }

    public LocalTextToSpeechVoice(String str, String str2) {
        this.f19561a = str;
        this.f19562b = str2;
    }
}
