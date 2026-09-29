package p000;

import com.lingq.core.domain.model.lesson.LessonProcessingStatus;

/* JADX INFO: loaded from: classes3.dex */
public final class hl7 {

    /* JADX INFO: renamed from: a */
    public final boolean f42580a;

    /* JADX INFO: renamed from: b */
    public final LessonProcessingStatus f42581b;

    /* JADX INFO: renamed from: c */
    public final boolean f42582c;

    public /* synthetic */ hl7(LessonProcessingStatus lessonProcessingStatus, int i) {
        this((i & 1) == 0, (i & 2) != 0 ? null : lessonProcessingStatus, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hl7)) {
            return false;
        }
        hl7 hl7Var = (hl7) obj;
        return this.f42580a == hl7Var.f42580a && this.f42581b == hl7Var.f42581b && this.f42582c == hl7Var.f42582c;
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f42580a) * 31;
        LessonProcessingStatus lessonProcessingStatus = this.f42581b;
        return Boolean.hashCode(this.f42582c) + ((iHashCode + (lessonProcessingStatus == null ? 0 : lessonProcessingStatus.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProcessingDialogState(show=");
        sb.append(this.f42580a);
        sb.append(", status=");
        sb.append(this.f42581b);
        sb.append(", navigateBack=");
        return AbstractC3393o1.m17740o(sb, this.f42582c, ")");
    }

    public hl7(boolean z, LessonProcessingStatus lessonProcessingStatus, boolean z2) {
        this.f42580a = z;
        this.f42581b = lessonProcessingStatus;
        this.f42582c = z2;
    }
}
