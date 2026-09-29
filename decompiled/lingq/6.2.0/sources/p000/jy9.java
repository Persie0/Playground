package p000;

import com.lingq.core.domain.model.theme.ReaderFont;

/* JADX INFO: loaded from: classes2.dex */
public final class jy9 extends xy9 {

    /* JADX INFO: renamed from: a */
    public final ReaderFont f46409a;

    /* JADX INFO: renamed from: b */
    public final boolean f46410b;

    public jy9(ReaderFont readerFont, boolean z) {
        readerFont.getClass();
        this.f46409a = readerFont;
        this.f46410b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jy9)) {
            return false;
        }
        jy9 jy9Var = (jy9) obj;
        return this.f46409a == jy9Var.f46409a && this.f46410b == jy9Var.f46410b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f46410b) + (this.f46409a.hashCode() * 31);
    }

    public final String toString() {
        return "UpdateFont(font=" + this.f46409a + ", canSelect=" + this.f46410b + ")";
    }
}
