package p000;

import com.lingq.core.domain.model.library.LibraryItem;
import com.lingq.core.domain.model.library.LibraryItemCounter;
import com.lingq.core.domain.model.library.LibraryLessonAudioDownload;

/* JADX INFO: loaded from: classes2.dex */
public final class g81 {

    /* JADX INFO: renamed from: a */
    public final LibraryItem f40371a;

    /* JADX INFO: renamed from: b */
    public final LibraryItemCounter f40372b;

    /* JADX INFO: renamed from: c */
    public final LibraryLessonAudioDownload f40373c;

    /* JADX INFO: renamed from: d */
    public final boolean f40374d;

    public g81(LibraryItem libraryItem, LibraryItemCounter libraryItemCounter, LibraryLessonAudioDownload libraryLessonAudioDownload, boolean z) {
        libraryItem.getClass();
        this.f40371a = libraryItem;
        this.f40372b = libraryItemCounter;
        this.f40373c = libraryLessonAudioDownload;
        this.f40374d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g81)) {
            return false;
        }
        g81 g81Var = (g81) obj;
        return fa4.m11650l(this.f40371a, g81Var.f40371a) && fa4.m11650l(this.f40372b, g81Var.f40372b) && fa4.m11650l(this.f40373c, g81Var.f40373c) && this.f40374d == g81Var.f40374d;
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f40371a.f19426a) * 31;
        LibraryItemCounter libraryItemCounter = this.f40372b;
        int iHashCode2 = (iHashCode + (libraryItemCounter == null ? 0 : libraryItemCounter.hashCode())) * 31;
        LibraryLessonAudioDownload libraryLessonAudioDownload = this.f40373c;
        return Boolean.hashCode(this.f40374d) + ((iHashCode2 + (libraryLessonAudioDownload != null ? libraryLessonAudioDownload.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "CollectionLessonItemState(lesson=" + this.f40371a + ", counter=" + this.f40372b + ", lessonDataDownload=" + this.f40373c + ", showCourseTitle=" + this.f40374d + ")";
    }
}
