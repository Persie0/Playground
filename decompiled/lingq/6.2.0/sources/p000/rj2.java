package p000;

import com.lingq.core.domain.model.theme.ReaderFont;

/* JADX INFO: loaded from: classes2.dex */
public final class rj2 extends vj2 {

    /* JADX INFO: renamed from: a */
    public final Object f59401a;

    /* JADX INFO: renamed from: b */
    public final String f59402b;

    public rj2(ReaderFont readerFont) {
        readerFont.getClass();
        this.f59401a = readerFont;
        this.f59402b = "";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rj2)) {
            return false;
        }
        rj2 rj2Var = (rj2) obj;
        return fa4.m11650l(this.f59401a, rj2Var.f59401a) && this.f59402b.equals(rj2Var.f59402b);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + g9a.m12428e(ux5.m22980c(this.f59401a.hashCode() * 31, this.f59402b, 31), 31, false);
    }

    public final String toString() {
        return "Completed(item=" + this.f59401a + ", fileName=" + this.f59402b + ", autoPlay=false, selectTrack=true)";
    }
}
