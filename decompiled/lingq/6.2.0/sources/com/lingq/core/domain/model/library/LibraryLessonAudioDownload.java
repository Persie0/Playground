package com.lingq.core.domain.model.library;

import p000.ey8;
import p000.g9a;
import p000.n3c;
import p000.wq1;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class LibraryLessonAudioDownload {
    public static final C1468j Companion = new C1468j();

    /* JADX INFO: renamed from: a */
    public final int f19475a;

    /* JADX INFO: renamed from: b */
    public final boolean f19476b;

    /* JADX INFO: renamed from: c */
    public final int f19477c;

    public /* synthetic */ LibraryLessonAudioDownload(int i, int i2, int i3, boolean z) {
        if (7 != (i & 7)) {
            n3c.m17204b(i, 7, LibraryLessonAudioDownload$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f19475a = i2;
        this.f19476b = z;
        this.f19477c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LibraryLessonAudioDownload)) {
            return false;
        }
        LibraryLessonAudioDownload libraryLessonAudioDownload = (LibraryLessonAudioDownload) obj;
        return this.f19475a == libraryLessonAudioDownload.f19475a && this.f19476b == libraryLessonAudioDownload.f19476b && this.f19477c == libraryLessonAudioDownload.f19477c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f19477c) + g9a.m12428e(Integer.hashCode(this.f19475a) * 31, 31, this.f19476b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LibraryLessonAudioDownload(id=");
        sb.append(this.f19475a);
        sb.append(", isDownloaded=");
        sb.append(this.f19476b);
        sb.append(", downloadProgress=");
        return wq1.m24123s(sb, this.f19477c, ")");
    }

    public LibraryLessonAudioDownload(int i, int i2, boolean z) {
        this.f19475a = i;
        this.f19476b = z;
        this.f19477c = i2;
    }
}
