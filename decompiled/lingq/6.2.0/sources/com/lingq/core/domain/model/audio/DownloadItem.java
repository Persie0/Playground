package com.lingq.core.domain.model.audio;

import p000.AbstractC3393o1;
import p000.ey8;
import p000.fa4;
import p000.n3c;
import p000.wq1;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class DownloadItem {
    public static final C1393a Companion = new C1393a();

    /* JADX INFO: renamed from: a */
    public final String f18842a;

    /* JADX INFO: renamed from: b */
    public final int f18843b;

    /* JADX INFO: renamed from: c */
    public final String f18844c;

    public /* synthetic */ DownloadItem(String str, int i, int i2, String str2) {
        if (7 != (i & 7)) {
            n3c.m17204b(i, 7, DownloadItem$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f18842a = str;
        this.f18843b = i2;
        this.f18844c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DownloadItem)) {
            return false;
        }
        DownloadItem downloadItem = (DownloadItem) obj;
        return fa4.m11650l(this.f18842a, downloadItem.f18842a) && this.f18843b == downloadItem.f18843b && fa4.m11650l(this.f18844c, downloadItem.f18844c);
    }

    public final int hashCode() {
        return this.f18844c.hashCode() + wq1.m24106b(this.f18843b, this.f18842a.hashCode() * 31, 31);
    }

    public final String toString() {
        return AbstractC3393o1.m17738m(AbstractC3393o1.m17741p(this.f18843b, "DownloadItem(language=", this.f18842a, ", lessonId=", ", audioUrl="), this.f18844c, ")");
    }

    public DownloadItem(String str, int i, String str2) {
        str.getClass();
        str2.getClass();
        this.f18842a = str;
        this.f18843b = i;
        this.f18844c = str2;
    }
}
