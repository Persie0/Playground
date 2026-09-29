package p000;

import com.lingq.core.domain.model.lesson.LessonProcessingStatus;

/* JADX INFO: loaded from: classes3.dex */
public final class h25 implements j25 {

    /* JADX INFO: renamed from: a */
    public final LessonProcessingStatus f41700a;

    public h25(LessonProcessingStatus lessonProcessingStatus) {
        lessonProcessingStatus.getClass();
        this.f41700a = lessonProcessingStatus;
    }

    /* JADX INFO: renamed from: a */
    public final LessonProcessingStatus m13002a() {
        return this.f41700a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h25) && this.f41700a == ((h25) obj).f41700a;
    }

    public final int hashCode() {
        return this.f41700a.hashCode();
    }

    public final String toString() {
        return "LessonProcessingStatusError(status=" + this.f41700a + ")";
    }
}
