package com.lingq.core.database.entity;

import p000.AbstractC3393o1;
import p000.ey8;
import p000.fa4;
import p000.n3c;
import p000.ux5;
import p000.wq1;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class TtsUtteranceEntity {
    public static final C1357q0 Companion = new C1357q0();

    /* JADX INFO: renamed from: a */
    public final String f17484a;

    /* JADX INFO: renamed from: b */
    public final int f17485b;

    /* JADX INFO: renamed from: c */
    public final String f17486c;

    /* JADX INFO: renamed from: d */
    public final String f17487d;

    public /* synthetic */ TtsUtteranceEntity(int i, int i2, String str, String str2, String str3) {
        if (15 != (i & 15)) {
            n3c.m17204b(i, 15, TtsUtteranceEntity$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f17484a = str;
        this.f17485b = i2;
        this.f17486c = str2;
        this.f17487d = str3;
    }

    /* JADX INFO: renamed from: a */
    public final String m7821a() {
        return this.f17486c;
    }

    /* JADX INFO: renamed from: b */
    public final String m7822b() {
        return this.f17484a;
    }

    /* JADX INFO: renamed from: c */
    public final String m7823c() {
        return this.f17487d;
    }

    /* JADX INFO: renamed from: d */
    public final int m7824d() {
        return this.f17485b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TtsUtteranceEntity)) {
            return false;
        }
        TtsUtteranceEntity ttsUtteranceEntity = (TtsUtteranceEntity) obj;
        return fa4.m11650l(this.f17484a, ttsUtteranceEntity.f17484a) && this.f17485b == ttsUtteranceEntity.f17485b && fa4.m11650l(this.f17486c, ttsUtteranceEntity.f17486c) && fa4.m11650l(this.f17487d, ttsUtteranceEntity.f17487d);
    }

    public final int hashCode() {
        return this.f17487d.hashCode() + ux5.m22980c(wq1.m24106b(this.f17485b, this.f17484a.hashCode() * 31, 31), this.f17486c, 31);
    }

    public final String toString() {
        return wq1.m24125u(AbstractC3393o1.m17741p(this.f17485b, "TtsUtteranceEntity(idWithLanguageAndData=", this.f17484a, ", utteranceId=", ", audio="), this.f17486c, ", text=", this.f17487d, ")");
    }

    public TtsUtteranceEntity(String str, int i, String str2, String str3) {
        str2.getClass();
        str3.getClass();
        this.f17484a = str;
        this.f17485b = i;
        this.f17486c = str2;
        this.f17487d = str3;
    }
}
