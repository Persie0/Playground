package com.lingq.core.domain.model.audio;

import p000.AbstractC3393o1;
import p000.ey8;
import p000.fa4;
import p000.g9a;
import p000.hn1;
import p000.n3c;
import p000.ux5;
import p000.wq1;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class SentenceDownloadItem {
    public static final C1394b Companion = new C1394b();

    /* JADX INFO: renamed from: a */
    public final String f18845a;

    /* JADX INFO: renamed from: b */
    public final int f18846b;

    /* JADX INFO: renamed from: c */
    public final String f18847c;

    /* JADX INFO: renamed from: d */
    public final int f18848d;

    /* JADX INFO: renamed from: e */
    public final int f18849e;

    /* JADX INFO: renamed from: f */
    public final int f18850f;

    /* JADX INFO: renamed from: g */
    public final boolean f18851g;

    /* JADX INFO: renamed from: h */
    public final double f18852h;

    public /* synthetic */ SentenceDownloadItem(int i, String str, int i2, String str2, int i3, int i4, int i5, boolean z, double d) {
        if (127 != (i & 127)) {
            n3c.m17204b(i, 127, SentenceDownloadItem$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f18845a = str;
        this.f18846b = i2;
        this.f18847c = str2;
        this.f18848d = i3;
        this.f18849e = i4;
        this.f18850f = i5;
        this.f18851g = z;
        if ((i & 128) == 0) {
            this.f18852h = 0.0d;
        } else {
            this.f18852h = d;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SentenceDownloadItem)) {
            return false;
        }
        SentenceDownloadItem sentenceDownloadItem = (SentenceDownloadItem) obj;
        return fa4.m11650l(this.f18845a, sentenceDownloadItem.f18845a) && this.f18846b == sentenceDownloadItem.f18846b && fa4.m11650l(this.f18847c, sentenceDownloadItem.f18847c) && this.f18848d == sentenceDownloadItem.f18848d && this.f18849e == sentenceDownloadItem.f18849e && this.f18850f == sentenceDownloadItem.f18850f && this.f18851g == sentenceDownloadItem.f18851g && Double.compare(this.f18852h, sentenceDownloadItem.f18852h) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f18852h) + g9a.m12428e(wq1.m24106b(this.f18850f, wq1.m24106b(this.f18849e, wq1.m24106b(this.f18848d, ux5.m22980c(wq1.m24106b(this.f18846b, this.f18845a.hashCode() * 31, 31), this.f18847c, 31), 31), 31), 31), 31, this.f18851g);
    }

    public final String toString() {
        StringBuilder sbM17741p = AbstractC3393o1.m17741p(this.f18846b, "SentenceDownloadItem(language=", this.f18845a, ", lessonId=", ", audioUrl=");
        AbstractC3393o1.m17748w(this.f18848d, this.f18847c, ", sentenceIndex=", ", currentIndex=", sbM17741p);
        hn1.m13360j(this.f18849e, this.f18850f, ", lastIndex=", ", shouldAutoPlay=", sbM17741p);
        sbM17741p.append(this.f18851g);
        sbM17741p.append(", audioDuration=");
        sbM17741p.append(this.f18852h);
        sbM17741p.append(")");
        return sbM17741p.toString();
    }
}
