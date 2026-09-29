package com.lingq.core.domain.model.token;

import p000.ey8;
import p000.fa4;
import p000.n3c;
import p000.ux5;

/* JADX INFO: loaded from: classes.dex */
@ey8
public final class TextToSpeechAppVoice {
    public static final C1486b Companion = new C1486b();

    /* JADX INFO: renamed from: a */
    public final String f19563a;

    /* JADX INFO: renamed from: b */
    public final String f19564b;

    public /* synthetic */ TextToSpeechAppVoice(String str, int i, String str2) {
        if (3 != (i & 3)) {
            n3c.m17204b(i, 3, TextToSpeechAppVoice$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f19563a = str;
        this.f19564b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextToSpeechAppVoice)) {
            return false;
        }
        TextToSpeechAppVoice textToSpeechAppVoice = (TextToSpeechAppVoice) obj;
        return fa4.m11650l(this.f19563a, textToSpeechAppVoice.f19563a) && fa4.m11650l(this.f19564b, textToSpeechAppVoice.f19564b);
    }

    public final int hashCode() {
        return this.f19564b.hashCode() + (this.f19563a.hashCode() * 31);
    }

    public final String toString() {
        return ux5.m22991n("TextToSpeechAppVoice(name=", this.f19563a, ", appName=", this.f19564b, ")");
    }
}
