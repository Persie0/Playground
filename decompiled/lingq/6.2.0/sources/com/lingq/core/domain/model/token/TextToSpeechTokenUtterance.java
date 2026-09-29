package com.lingq.core.domain.model.token;

import p000.AbstractC3393o1;
import p000.ey8;
import p000.fa4;
import p000.n3c;
import p000.ux5;
import p000.wq1;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class TextToSpeechTokenUtterance {
    public static final C1487c Companion = new C1487c();

    /* JADX INFO: renamed from: a */
    public final String f19565a;

    /* JADX INFO: renamed from: b */
    public final int f19566b;

    /* JADX INFO: renamed from: c */
    public final String f19567c;

    /* JADX INFO: renamed from: d */
    public final String f19568d;

    public /* synthetic */ TextToSpeechTokenUtterance(int i, int i2, String str, String str2, String str3) {
        if (15 != (i & 15)) {
            n3c.m17204b(i, 15, TextToSpeechTokenUtterance$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f19565a = str;
        this.f19566b = i2;
        this.f19567c = str2;
        this.f19568d = str3;
    }

    /* JADX INFO: renamed from: a */
    public final String m8120a() {
        return this.f19567c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextToSpeechTokenUtterance)) {
            return false;
        }
        TextToSpeechTokenUtterance textToSpeechTokenUtterance = (TextToSpeechTokenUtterance) obj;
        return fa4.m11650l(this.f19565a, textToSpeechTokenUtterance.f19565a) && this.f19566b == textToSpeechTokenUtterance.f19566b && fa4.m11650l(this.f19567c, textToSpeechTokenUtterance.f19567c) && fa4.m11650l(this.f19568d, textToSpeechTokenUtterance.f19568d);
    }

    public final int hashCode() {
        return this.f19568d.hashCode() + ux5.m22980c(wq1.m24106b(this.f19566b, this.f19565a.hashCode() * 31, 31), this.f19567c, 31);
    }

    public final String toString() {
        return wq1.m24125u(AbstractC3393o1.m17741p(this.f19566b, "TextToSpeechTokenUtterance(idWithLanguageAndData=", this.f19565a, ", utteranceId=", ", audio="), this.f19567c, ", text=", this.f19568d, ")");
    }

    public TextToSpeechTokenUtterance(String str, int i, String str2, String str3) {
        ux5.m22974A(str, str2, str3);
        this.f19565a = str;
        this.f19566b = i;
        this.f19567c = str2;
        this.f19568d = str3;
    }
}
