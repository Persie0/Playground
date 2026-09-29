package p000;

import com.lingq.core.domain.model.theme.ReaderFont;

/* JADX INFO: loaded from: classes2.dex */
public final class sj2 extends vj2 {

    /* JADX INFO: renamed from: a */
    public final Object f60923a;

    public sj2(ReaderFont readerFont) {
        readerFont.getClass();
        this.f60923a = readerFont;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sj2) && fa4.m11650l(this.f60923a, ((sj2) obj).f60923a);
    }

    public final int hashCode() {
        return this.f60923a.hashCode() * 31;
    }

    public final String toString() {
        return "Error(item=" + this.f60923a + ", errorType=null)";
    }
}
