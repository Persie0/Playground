package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class jl9 implements kl9 {

    /* JADX INFO: renamed from: a */
    public final ud7 f45679a;

    public jl9(ud7 ud7Var) {
        this.f45679a = ud7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jl9) && this.f45679a.equals(((jl9) obj).f45679a);
    }

    public final int hashCode() {
        return this.f45679a.hashCode();
    }

    public final String toString() {
        return "LessonItem(lesson=" + this.f45679a + ")";
    }
}
