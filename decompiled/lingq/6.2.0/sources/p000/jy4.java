package p000;

import android.os.Bundle;
import com.lingq.feature.reader.R$id;

/* JADX INFO: loaded from: classes3.dex */
public final class jy4 implements t86 {

    /* JADX INFO: renamed from: a */
    public final int f46389a;

    /* JADX INFO: renamed from: b */
    public final int f46390b = R$id.actionToLessonComplete;

    public jy4(int i) {
        this.f46389a = i;
    }

    @Override // p000.t86
    /* JADX INFO: renamed from: a */
    public final Bundle mo233a() {
        Bundle bundle = new Bundle();
        bundle.putInt("lessonId", this.f46389a);
        bundle.putBoolean("isCompleting", true);
        return bundle;
    }

    @Override // p000.t86
    /* JADX INFO: renamed from: b */
    public final int mo234b() {
        return this.f46390b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jy4) && this.f46389a == ((jy4) obj).f46389a;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (Integer.hashCode(this.f46389a) * 31);
    }

    public final String toString() {
        return ux5.m22989l("ActionToLessonComplete(lessonId=", this.f46389a, ", isCompleting=true)");
    }
}
