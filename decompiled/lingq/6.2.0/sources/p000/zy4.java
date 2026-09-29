package p000;

import android.os.Bundle;
import com.lingq.feature.reader.R$id;

/* JADX INFO: loaded from: classes3.dex */
public final class zy4 implements t86 {

    /* JADX INFO: renamed from: a */
    public final int f72379a;

    /* JADX INFO: renamed from: b */
    public final int f72380b = R$id.actionToLessonCompleteVocabulary;

    public zy4(int i) {
        this.f72379a = i;
    }

    @Override // p000.t86
    /* JADX INFO: renamed from: a */
    public final Bundle mo233a() {
        Bundle bundle = new Bundle();
        bundle.putInt("lessonId", this.f72379a);
        return bundle;
    }

    @Override // p000.t86
    /* JADX INFO: renamed from: b */
    public final int mo234b() {
        return this.f72380b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zy4) && this.f72379a == ((zy4) obj).f72379a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f72379a);
    }

    public final String toString() {
        return ux5.m22989l("ActionToLessonCompleteVocabulary(lessonId=", this.f72379a, ")");
    }
}
