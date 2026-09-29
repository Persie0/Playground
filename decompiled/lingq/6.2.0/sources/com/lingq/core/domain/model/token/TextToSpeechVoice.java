package com.lingq.core.domain.model.token;

import java.util.List;
import kotlin.AbstractC3192a;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;
import p000.cs4;
import p000.ey8;
import p000.fa4;
import p000.g9a;
import p000.ks8;
import p000.n3c;
import p000.ux5;
import p000.wq1;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class TextToSpeechVoice {
    public static final C1488d Companion = new C1488d();

    /* JADX INFO: renamed from: k */
    public static final cs4[] f19569k;

    /* JADX INFO: renamed from: a */
    public final String f19570a;

    /* JADX INFO: renamed from: b */
    public final String f19571b;

    /* JADX INFO: renamed from: c */
    public final List f19572c;

    /* JADX INFO: renamed from: d */
    public final Boolean f19573d;

    /* JADX INFO: renamed from: e */
    public final List f19574e;

    /* JADX INFO: renamed from: f */
    public final boolean f19575f;

    /* JADX INFO: renamed from: g */
    public final boolean f19576g;

    /* JADX INFO: renamed from: h */
    public final boolean f19577h;

    /* JADX INFO: renamed from: i */
    public final List f19578i;

    /* JADX INFO: renamed from: j */
    public final String f19579j;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        f19569k = new cs4[]{null, null, AbstractC3192a.m15357b(lazyThreadSafetyMode, new ks8(18)), null, AbstractC3192a.m15357b(lazyThreadSafetyMode, new ks8(19)), null, null, null, AbstractC3192a.m15357b(lazyThreadSafetyMode, new ks8(20)), null};
    }

    public /* synthetic */ TextToSpeechVoice(int i, Boolean bool, String str, String str2, String str3, List list, List list2, List list3, boolean z, boolean z2, boolean z3) {
        if (23 != (i & 23)) {
            n3c.m17204b(i, 23, TextToSpeechVoice$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f19570a = str;
        this.f19571b = str2;
        this.f19572c = list;
        if ((i & 8) == 0) {
            this.f19573d = null;
        } else {
            this.f19573d = bool;
        }
        this.f19574e = list2;
        if ((i & 32) == 0) {
            this.f19575f = false;
        } else {
            this.f19575f = z;
        }
        if ((i & 64) == 0) {
            this.f19576g = false;
        } else {
            this.f19576g = z2;
        }
        if ((i & 128) == 0) {
            this.f19577h = false;
        } else {
            this.f19577h = z3;
        }
        if ((i & 256) == 0) {
            this.f19578i = EmptyList.f47638a;
        } else {
            this.f19578i = list3;
        }
        if ((i & 512) == 0) {
            this.f19579j = null;
        } else {
            this.f19579j = str3;
        }
    }

    /* JADX INFO: renamed from: a */
    public final String m8121a() {
        return this.f19570a;
    }

    /* JADX INFO: renamed from: b */
    public final List m8122b() {
        return this.f19574e;
    }

    /* JADX INFO: renamed from: c */
    public final List m8123c() {
        return this.f19578i;
    }

    /* JADX INFO: renamed from: d */
    public final List m8124d() {
        return this.f19572c;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m8125e() {
        List list = this.f19578i;
        return list.contains("ai") && list.contains("plus");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextToSpeechVoice)) {
            return false;
        }
        TextToSpeechVoice textToSpeechVoice = (TextToSpeechVoice) obj;
        return fa4.m11650l(this.f19570a, textToSpeechVoice.f19570a) && fa4.m11650l(this.f19571b, textToSpeechVoice.f19571b) && fa4.m11650l(this.f19572c, textToSpeechVoice.f19572c) && fa4.m11650l(this.f19573d, textToSpeechVoice.f19573d) && fa4.m11650l(this.f19574e, textToSpeechVoice.f19574e) && this.f19575f == textToSpeechVoice.f19575f && this.f19576g == textToSpeechVoice.f19576g && this.f19577h == textToSpeechVoice.f19577h && fa4.m11650l(this.f19578i, textToSpeechVoice.f19578i) && fa4.m11650l(this.f19579j, textToSpeechVoice.f19579j);
    }

    /* JADX INFO: renamed from: f */
    public final boolean m8126f() {
        return this.f19575f;
    }

    public final int hashCode() {
        int iM22979b = ux5.m22979b(ux5.m22980c(this.f19570a.hashCode() * 31, this.f19571b, 31), 31, this.f19572c);
        Boolean bool = this.f19573d;
        int iM22979b2 = ux5.m22979b(g9a.m12428e(g9a.m12428e(g9a.m12428e(ux5.m22979b((iM22979b + (bool == null ? 0 : bool.hashCode())) * 31, 31, this.f19574e), 31, this.f19575f), 31, this.f19576g), 31, this.f19577h), 31, this.f19578i);
        String str = this.f19579j;
        return iM22979b2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbM23000w = ux5.m23000w("TextToSpeechVoice(name=", this.f19570a, ", title=", this.f19571b, ", voicesByApp=");
        sbM23000w.append(this.f19572c);
        sbM23000w.append(", alternative=");
        sbM23000w.append(this.f19573d);
        sbM23000w.append(", priority=");
        sbM23000w.append(this.f19574e);
        sbM23000w.append(", isPremium=");
        sbM23000w.append(this.f19575f);
        sbM23000w.append(", freeTrial=");
        wq1.m24101A(sbM23000w, this.f19576g, ", isSelectable=", this.f19577h, ", tags=");
        sbM23000w.append(this.f19578i);
        sbM23000w.append(", accentCode=");
        sbM23000w.append(this.f19579j);
        sbM23000w.append(")");
        return sbM23000w.toString();
    }

    public TextToSpeechVoice(Boolean bool, String str, String str2, String str3, List list, List list2, List list3, boolean z, boolean z2, boolean z3) {
        str.getClass();
        str2.getClass();
        list.getClass();
        this.f19570a = str;
        this.f19571b = str2;
        this.f19572c = list;
        this.f19573d = bool;
        this.f19574e = list2;
        this.f19575f = z;
        this.f19576g = z2;
        this.f19577h = z3;
        this.f19578i = list3;
        this.f19579j = str3;
    }
}
