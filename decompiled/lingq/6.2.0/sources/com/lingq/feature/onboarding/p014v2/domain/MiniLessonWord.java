package com.lingq.feature.onboarding.p014v2.domain;

import java.util.Map;
import kotlin.AbstractC3192a;
import kotlin.LazyThreadSafetyMode;
import p000.AbstractC3393o1;
import p000.cs4;
import p000.ey8;
import p000.fa4;
import p000.n3c;
import p000.tx5;
import p000.wq1;

/* JADX INFO: loaded from: classes3.dex */
@ey8
public final class MiniLessonWord {
    public static final C2222c Companion = new C2222c();

    /* JADX INFO: renamed from: d */
    public static final cs4[] f27422d = {null, null, AbstractC3192a.m15357b(LazyThreadSafetyMode.PUBLICATION, new tx5(3))};

    /* JADX INFO: renamed from: a */
    public final String f27423a;

    /* JADX INFO: renamed from: b */
    public final int f27424b;

    /* JADX INFO: renamed from: c */
    public final Map f27425c;

    public /* synthetic */ MiniLessonWord(int i, String str, int i2, Map map) {
        if (7 != (i & 7)) {
            n3c.m17204b(i, 7, MiniLessonWord$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f27423a = str;
        this.f27424b = i2;
        this.f27425c = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MiniLessonWord)) {
            return false;
        }
        MiniLessonWord miniLessonWord = (MiniLessonWord) obj;
        return fa4.m11650l(this.f27423a, miniLessonWord.f27423a) && this.f27424b == miniLessonWord.f27424b && fa4.m11650l(this.f27425c, miniLessonWord.f27425c);
    }

    public final int hashCode() {
        return this.f27425c.hashCode() + wq1.m24106b(this.f27424b, this.f27423a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sbM17741p = AbstractC3393o1.m17741p(this.f27424b, "MiniLessonWord(word=", this.f27423a, ", position=", ", dictionaryTranslations=");
        sbM17741p.append(this.f27425c);
        sbM17741p.append(")");
        return sbM17741p.toString();
    }
}
