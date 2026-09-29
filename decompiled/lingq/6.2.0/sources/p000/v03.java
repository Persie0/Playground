package p000;

import com.lingq.core.domain.model.library.LibraryItem;

/* JADX INFO: loaded from: classes3.dex */
public final class v03 extends z03 {

    /* JADX INFO: renamed from: a */
    public final LibraryItem f64656a;

    /* JADX INFO: renamed from: b */
    public final boolean f64657b;

    public v03(LibraryItem libraryItem, boolean z) {
        this.f64656a = libraryItem;
        this.f64657b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v03)) {
            return false;
        }
        v03 v03Var = (v03) obj;
        return this.f64656a.equals(v03Var.f64656a) && this.f64657b == v03Var.f64657b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f64657b) + (Integer.hashCode(this.f64656a.f19426a) * 31);
    }

    public final String toString() {
        return "OnOpenLesson(lesson=" + this.f64656a + ", overrideOpen=" + this.f64657b + ")";
    }
}
