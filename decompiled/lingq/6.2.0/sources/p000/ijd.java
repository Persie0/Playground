package p000;

import com.lingq.core.domain.model.lesson.LessonProcessingStatus;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ijd {
    /* JADX INFO: renamed from: a */
    public static final boolean m13970a(LessonProcessingStatus lessonProcessingStatus) {
        lessonProcessingStatus.getClass();
        switch (v55.f64885a[lessonProcessingStatus.ordinal()]) {
            case 1:
                return true;
            default:
                gm5.m12750e();
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                return false;
        }
    }
}
