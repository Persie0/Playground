package p000;

import com.lingq.core.p012ui.LessonInfoSource;

/* JADX INFO: loaded from: classes3.dex */
public final class b35 {

    /* JADX INFO: renamed from: a */
    public final LessonInfoSource f7864a;

    /* JADX INFO: renamed from: b */
    public final String f7865b;

    public b35(LessonInfoSource lessonInfoSource, String str) {
        lessonInfoSource.getClass();
        str.getClass();
        this.f7864a = lessonInfoSource;
        this.f7865b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b35)) {
            return false;
        }
        b35 b35Var = (b35) obj;
        return this.f7864a == b35Var.f7864a && fa4.m11650l(this.f7865b, b35Var.f7865b);
    }

    public final int hashCode() {
        return this.f7865b.hashCode() + (this.f7864a.hashCode() * 31);
    }

    public final String toString() {
        return "LessonInfoConfig(source=" + this.f7864a + ", shelfCode=" + this.f7865b + ")";
    }
}
