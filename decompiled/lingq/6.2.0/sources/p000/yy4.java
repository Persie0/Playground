package p000;

import android.os.Bundle;
import com.lingq.feature.reader.R$id;

/* JADX INFO: loaded from: classes3.dex */
public final class yy4 implements t86 {

    /* JADX INFO: renamed from: a */
    public final int f70643a;

    /* JADX INFO: renamed from: b */
    public final int f70644b = R$id.actionToLessonComplete;

    public yy4(int i) {
        this.f70643a = i;
    }

    @Override // p000.t86
    /* JADX INFO: renamed from: a */
    public final Bundle mo233a() {
        Bundle bundle = new Bundle();
        bundle.putInt("lessonId", this.f70643a);
        bundle.putBoolean("isCompleting", true);
        return bundle;
    }

    @Override // p000.t86
    /* JADX INFO: renamed from: b */
    public final int mo234b() {
        return this.f70644b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yy4) && this.f70643a == ((yy4) obj).f70643a;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (Integer.hashCode(this.f70643a) * 31);
    }

    public final String toString() {
        return ux5.m22989l("ActionToLessonComplete(lessonId=", this.f70643a, ", isCompleting=true)");
    }
}
