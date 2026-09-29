package p000;

import com.lingq.core.domain.model.library.LibraryItem;
import com.lingq.core.domain.model.library.LibraryItemCounter;
import com.lingq.core.domain.model.library.LibraryItemDownload;
import com.lingq.core.domain.model.library.LibraryLessonAudioDownload;

/* JADX INFO: loaded from: classes2.dex */
public final class uq8 extends yq8 {

    /* JADX INFO: renamed from: a */
    public final LibraryItem f64223a;

    /* JADX INFO: renamed from: b */
    public final LibraryItemCounter f64224b;

    /* JADX INFO: renamed from: c */
    public final LibraryItemDownload f64225c;

    /* JADX INFO: renamed from: d */
    public final LibraryLessonAudioDownload f64226d;

    /* JADX INFO: renamed from: e */
    public final String f64227e;

    /* JADX INFO: renamed from: f */
    public final String f64228f;

    public uq8(LibraryItem libraryItem, LibraryItemCounter libraryItemCounter, LibraryItemDownload libraryItemDownload, LibraryLessonAudioDownload libraryLessonAudioDownload, String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f64223a = libraryItem;
        this.f64224b = libraryItemCounter;
        this.f64225c = libraryItemDownload;
        this.f64226d = libraryLessonAudioDownload;
        this.f64227e = str;
        this.f64228f = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uq8)) {
            return false;
        }
        uq8 uq8Var = (uq8) obj;
        return this.f64223a.equals(uq8Var.f64223a) && fa4.m11650l(this.f64224b, uq8Var.f64224b) && fa4.m11650l(this.f64225c, uq8Var.f64225c) && fa4.m11650l(this.f64226d, uq8Var.f64226d) && fa4.m11650l(this.f64227e, uq8Var.f64227e) && fa4.m11650l(this.f64228f, uq8Var.f64228f);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f64223a.f19426a) * 31;
        LibraryItemCounter libraryItemCounter = this.f64224b;
        int iHashCode2 = (iHashCode + (libraryItemCounter == null ? 0 : libraryItemCounter.hashCode())) * 31;
        LibraryItemDownload libraryItemDownload = this.f64225c;
        int iHashCode3 = (iHashCode2 + (libraryItemDownload == null ? 0 : libraryItemDownload.hashCode())) * 31;
        LibraryLessonAudioDownload libraryLessonAudioDownload = this.f64226d;
        return this.f64228f.hashCode() + ux5.m22980c(g9a.m12428e((iHashCode3 + (libraryLessonAudioDownload != null ? libraryLessonAudioDownload.hashCode() : 0)) * 31, 31, true), this.f64227e, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Lesson(lesson=");
        sb.append(this.f64223a);
        sb.append(", counter=");
        sb.append(this.f64224b);
        sb.append(", lessonDownload=");
        sb.append(this.f64225c);
        sb.append(", lessonDataDownload=");
        sb.append(this.f64226d);
        sb.append(", shouldShowCourseTitle=true, shelfName=");
        return wq1.m24125u(sb, this.f64227e, ", shelfCode=", this.f64228f, ")");
    }
}
