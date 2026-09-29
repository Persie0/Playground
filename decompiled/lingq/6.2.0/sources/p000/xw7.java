package p000;

import android.os.Bundle;
import com.lingq.feature.reader.R$id;

/* JADX INFO: loaded from: classes3.dex */
public final class xw7 implements t86 {

    /* JADX INFO: renamed from: a */
    public final int f68903a;

    /* JADX INFO: renamed from: b */
    public final int f68904b = R$id.actionToLessonVocabulary;

    public xw7(int i) {
        this.f68903a = i;
    }

    @Override // p000.t86
    /* JADX INFO: renamed from: a */
    public final Bundle mo233a() {
        Bundle bundle = new Bundle();
        bundle.putInt("lessonId", this.f68903a);
        bundle.putBoolean("isDocked", false);
        return bundle;
    }

    @Override // p000.t86
    /* JADX INFO: renamed from: b */
    public final int mo234b() {
        return this.f68904b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xw7) && this.f68903a == ((xw7) obj).f68903a;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (Integer.hashCode(this.f68903a) * 31);
    }

    public final String toString() {
        return ux5.m22989l("ActionToLessonVocabulary(lessonId=", this.f68903a, ", isDocked=false)");
    }
}
