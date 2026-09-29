package com.lingq.feature.onboarding.p014v2.domain;

import java.util.List;
import kotlin.AbstractC3192a;
import kotlin.LazyThreadSafetyMode;
import p000.cs4;
import p000.ey8;
import p000.fa4;
import p000.hn1;
import p000.n3c;
import p000.tx5;
import p000.ux5;
import p000.wq1;

/* JADX INFO: loaded from: classes.dex */
@ey8
public final class MiniLessonTemplate {
    public static final C2221b Companion = new C2221b();

    /* JADX INFO: renamed from: g */
    public static final cs4[] f27415g = {null, null, null, AbstractC3192a.m15357b(LazyThreadSafetyMode.PUBLICATION, new tx5(2)), null, null};

    /* JADX INFO: renamed from: a */
    public final String f27416a;

    /* JADX INFO: renamed from: b */
    public final String f27417b;

    /* JADX INFO: renamed from: c */
    public final String f27418c;

    /* JADX INFO: renamed from: d */
    public final List f27419d;

    /* JADX INFO: renamed from: e */
    public final String f27420e;

    /* JADX INFO: renamed from: f */
    public final String f27421f;

    public /* synthetic */ MiniLessonTemplate(int i, String str, String str2, String str3, List list, String str4, String str5) {
        if (15 != (i & 15)) {
            n3c.m17204b(i, 15, MiniLessonTemplate$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f27416a = str;
        this.f27417b = str2;
        this.f27418c = str3;
        this.f27419d = list;
        if ((i & 16) == 0) {
            this.f27420e = "";
        } else {
            this.f27420e = str4;
        }
        if ((i & 32) == 0) {
            this.f27421f = "";
        } else {
            this.f27421f = str5;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MiniLessonTemplate)) {
            return false;
        }
        MiniLessonTemplate miniLessonTemplate = (MiniLessonTemplate) obj;
        return fa4.m11650l(this.f27416a, miniLessonTemplate.f27416a) && fa4.m11650l(this.f27417b, miniLessonTemplate.f27417b) && fa4.m11650l(this.f27418c, miniLessonTemplate.f27418c) && fa4.m11650l(this.f27419d, miniLessonTemplate.f27419d) && fa4.m11650l(this.f27420e, miniLessonTemplate.f27420e) && fa4.m11650l(this.f27421f, miniLessonTemplate.f27421f);
    }

    public final int hashCode() {
        return this.f27421f.hashCode() + ux5.m22980c(ux5.m22979b(ux5.m22980c(ux5.m22980c(this.f27416a.hashCode() * 31, this.f27417b, 31), this.f27418c, 31), 31, this.f27419d), this.f27420e, 31);
    }

    public final String toString() {
        StringBuilder sbM23000w = ux5.m23000w("MiniLessonTemplate(languageCode=", this.f27416a, ", languageTitle=", this.f27417b, ", sentence=");
        hn1.m13366p(this.f27418c, ", words=", ", lynxUserMessage=", sbM23000w, this.f27419d);
        return wq1.m24125u(sbM23000w, this.f27420e, ", lynxBotMessage=", this.f27421f, ")");
    }
}
