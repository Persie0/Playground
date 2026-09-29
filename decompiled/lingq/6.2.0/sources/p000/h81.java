package p000;

import com.lingq.core.domain.model.library.LibraryItem;
import com.lingq.core.domain.model.library.LibraryItemCounter;
import com.lingq.core.domain.model.library.LibraryItemDownload;
import com.lingq.core.domain.model.library.LibraryLessonAudioDownload;

/* JADX INFO: loaded from: classes2.dex */
public final class h81 {

    /* JADX INFO: renamed from: a */
    public final LibraryItem f41930a;

    /* JADX INFO: renamed from: b */
    public final LibraryItemCounter f41931b;

    /* JADX INFO: renamed from: c */
    public final LibraryItemDownload f41932c;

    /* JADX INFO: renamed from: d */
    public final LibraryLessonAudioDownload f41933d;

    /* JADX INFO: renamed from: e */
    public final String f41934e;

    /* JADX INFO: renamed from: f */
    public final String f41935f;

    public h81(LibraryItem libraryItem, LibraryItemCounter libraryItemCounter, LibraryItemDownload libraryItemDownload, LibraryLessonAudioDownload libraryLessonAudioDownload, String str, String str2) {
        str2.getClass();
        this.f41930a = libraryItem;
        this.f41931b = libraryItemCounter;
        this.f41932c = libraryItemDownload;
        this.f41933d = libraryLessonAudioDownload;
        this.f41934e = str;
        this.f41935f = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h81)) {
            return false;
        }
        h81 h81Var = (h81) obj;
        return fa4.m11650l(this.f41930a, h81Var.f41930a) && fa4.m11650l(this.f41931b, h81Var.f41931b) && fa4.m11650l(this.f41932c, h81Var.f41932c) && fa4.m11650l(this.f41933d, h81Var.f41933d) && fa4.m11650l(this.f41934e, h81Var.f41934e) && fa4.m11650l(this.f41935f, h81Var.f41935f);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f41930a.f19426a) * 31;
        LibraryItemCounter libraryItemCounter = this.f41931b;
        int iHashCode2 = (iHashCode + (libraryItemCounter == null ? 0 : libraryItemCounter.hashCode())) * 31;
        LibraryItemDownload libraryItemDownload = this.f41932c;
        int iHashCode3 = (iHashCode2 + (libraryItemDownload == null ? 0 : libraryItemDownload.hashCode())) * 31;
        LibraryLessonAudioDownload libraryLessonAudioDownload = this.f41933d;
        return this.f41935f.hashCode() + ux5.m22980c((iHashCode3 + (libraryLessonAudioDownload != null ? libraryLessonAudioDownload.hashCode() : 0)) * 31, this.f41934e, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CollectionLessonState(lesson=");
        sb.append(this.f41930a);
        sb.append(", counter=");
        sb.append(this.f41931b);
        sb.append(", lessonDownload=");
        sb.append(this.f41932c);
        sb.append(", lessonDataDownload=");
        sb.append(this.f41933d);
        sb.append(", shelfName=");
        return wq1.m24125u(sb, this.f41934e, ", shelfCode=", this.f41935f, ")");
    }
}
