package p000;

import android.os.Bundle;
import com.lingq.feature.reader.R$id;

/* JADX INFO: loaded from: classes3.dex */
public final class ky4 implements t86 {

    /* JADX INFO: renamed from: a */
    public final int f48774a;

    /* JADX INFO: renamed from: b */
    public final int f48775b = R$id.actionToLessonCompleteVocabulary;

    public ky4(int i) {
        this.f48774a = i;
    }

    @Override // p000.t86
    /* JADX INFO: renamed from: a */
    public final Bundle mo233a() {
        Bundle bundle = new Bundle();
        bundle.putInt("lessonId", this.f48774a);
        return bundle;
    }

    @Override // p000.t86
    /* JADX INFO: renamed from: b */
    public final int mo234b() {
        return this.f48775b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ky4) && this.f48774a == ((ky4) obj).f48774a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f48774a);
    }

    public final String toString() {
        return ux5.m22989l("ActionToLessonCompleteVocabulary(lessonId=", this.f48774a, ")");
    }
}
