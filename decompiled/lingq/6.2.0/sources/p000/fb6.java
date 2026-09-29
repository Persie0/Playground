package p000;

import android.os.Bundle;
import com.lingq.feature.edit.R$id;

/* JADX INFO: loaded from: classes2.dex */
public final class fb6 implements t86 {

    /* JADX INFO: renamed from: a */
    public final int f38792a;

    /* JADX INFO: renamed from: b */
    public final boolean f38793b;

    /* JADX INFO: renamed from: c */
    public final int f38794c;

    /* JADX INFO: renamed from: d */
    public final int f38795d = R$id.actionToLessonEditParent;

    public fb6(int i, int i2, boolean z) {
        this.f38792a = i;
        this.f38793b = z;
        this.f38794c = i2;
    }

    @Override // p000.t86
    /* JADX INFO: renamed from: a */
    public final Bundle mo233a() {
        Bundle bundle = new Bundle();
        bundle.putInt("lessonId", this.f38792a);
        bundle.putInt("sentenceIndex", this.f38794c);
        bundle.putBoolean("hasAudio", this.f38793b);
        return bundle;
    }

    @Override // p000.t86
    /* JADX INFO: renamed from: b */
    public final int mo234b() {
        return this.f38795d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fb6)) {
            return false;
        }
        fb6 fb6Var = (fb6) obj;
        return this.f38792a == fb6Var.f38792a && this.f38793b == fb6Var.f38793b && this.f38794c == fb6Var.f38794c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f38794c) + g9a.m12428e(Integer.hashCode(this.f38792a) * 31, 31, this.f38793b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActionToLessonEditParent(lessonId=");
        sb.append(this.f38792a);
        sb.append(", hasAudio=");
        sb.append(this.f38793b);
        sb.append(", sentenceIndex=");
        return wq1.m24123s(sb, this.f38794c, ")");
    }
}
