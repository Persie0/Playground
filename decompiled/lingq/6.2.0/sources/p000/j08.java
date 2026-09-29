package p000;

import android.os.Bundle;
import com.lingq.feature.reader.R$id;

/* JADX INFO: loaded from: classes3.dex */
public final class j08 implements t86 {

    /* JADX INFO: renamed from: a */
    public final int f44853a;

    /* JADX INFO: renamed from: b */
    public final int f44854b = R$id.actionToLessonComplete;

    public j08(int i) {
        this.f44853a = i;
    }

    @Override // p000.t86
    /* JADX INFO: renamed from: a */
    public final Bundle mo233a() {
        Bundle bundle = new Bundle();
        bundle.putInt("lessonId", this.f44853a);
        bundle.putBoolean("isCompleting", false);
        return bundle;
    }

    @Override // p000.t86
    /* JADX INFO: renamed from: b */
    public final int mo234b() {
        return this.f44854b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j08) && this.f44853a == ((j08) obj).f44853a;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (Integer.hashCode(this.f44853a) * 31);
    }

    public final String toString() {
        return ux5.m22989l("ActionToLessonComplete(lessonId=", this.f44853a, ", isCompleting=false)");
    }
}
