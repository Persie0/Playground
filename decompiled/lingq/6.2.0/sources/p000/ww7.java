package p000;

import android.os.Bundle;
import com.lingq.feature.reader.R$id;

/* JADX INFO: loaded from: classes3.dex */
public final class ww7 implements t86 {

    /* JADX INFO: renamed from: a */
    public final int f67426a;

    /* JADX INFO: renamed from: b */
    public final boolean f67427b;

    /* JADX INFO: renamed from: c */
    public final int f67428c = R$id.actionToLessonComplete;

    public ww7(int i, boolean z) {
        this.f67426a = i;
        this.f67427b = z;
    }

    @Override // p000.t86
    /* JADX INFO: renamed from: a */
    public final Bundle mo233a() {
        Bundle bundle = new Bundle();
        bundle.putInt("lessonId", this.f67426a);
        bundle.putBoolean("isCompleting", this.f67427b);
        return bundle;
    }

    @Override // p000.t86
    /* JADX INFO: renamed from: b */
    public final int mo234b() {
        return this.f67428c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ww7)) {
            return false;
        }
        ww7 ww7Var = (ww7) obj;
        return this.f67426a == ww7Var.f67426a && this.f67427b == ww7Var.f67427b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f67427b) + (Integer.hashCode(this.f67426a) * 31);
    }

    public final String toString() {
        return "ActionToLessonComplete(lessonId=" + this.f67426a + ", isCompleting=" + this.f67427b + ")";
    }
}
