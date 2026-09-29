package com.lingq.core.domain.model.library;

import p000.ey8;
import p000.g9a;
import p000.n3c;
import p000.wq1;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class LibraryItemDownload {
    public static final C1467i Companion = new C1467i();

    /* JADX INFO: renamed from: a */
    public final int f19472a;

    /* JADX INFO: renamed from: b */
    public final boolean f19473b;

    /* JADX INFO: renamed from: c */
    public final int f19474c;

    public /* synthetic */ LibraryItemDownload(int i, int i2, int i3, boolean z) {
        if (7 != (i & 7)) {
            n3c.m17204b(i, 7, LibraryItemDownload$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f19472a = i2;
        this.f19473b = z;
        this.f19474c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LibraryItemDownload)) {
            return false;
        }
        LibraryItemDownload libraryItemDownload = (LibraryItemDownload) obj;
        return this.f19472a == libraryItemDownload.f19472a && this.f19473b == libraryItemDownload.f19473b && this.f19474c == libraryItemDownload.f19474c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f19474c) + g9a.m12428e(Integer.hashCode(this.f19472a) * 31, 31, this.f19473b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LibraryItemDownload(id=");
        sb.append(this.f19472a);
        sb.append(", isDownloaded=");
        sb.append(this.f19473b);
        sb.append(", downloadProgress=");
        return wq1.m24123s(sb, this.f19474c, ")");
    }

    public LibraryItemDownload(int i, int i2, boolean z) {
        this.f19472a = i;
        this.f19473b = z;
        this.f19474c = i2;
    }
}
