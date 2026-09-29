package p000;

import com.lingq.core.domain.model.theme.ReaderFont;

/* JADX INFO: loaded from: classes.dex */
public final class vz5 {

    /* JADX INFO: renamed from: a */
    public final ReaderFont f66137a;

    /* JADX INFO: renamed from: b */
    public final int f66138b;

    /* JADX INFO: renamed from: c */
    public final double f66139c;

    /* JADX INFO: renamed from: d */
    public final vs3 f66140d;

    public vz5(ReaderFont readerFont, int i, double d, vs3 vs3Var) {
        readerFont.getClass();
        vs3Var.getClass();
        this.f66137a = readerFont;
        this.f66138b = i;
        this.f66139c = d;
        this.f66140d = vs3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vz5)) {
            return false;
        }
        vz5 vz5Var = (vz5) obj;
        return this.f66137a == vz5Var.f66137a && this.f66138b == vz5Var.f66138b && Double.compare(this.f66139c, vz5Var.f66139c) == 0 && fa4.m11650l(this.f66140d, vz5Var.f66140d);
    }

    public final int hashCode() {
        return this.f66140d.hashCode() + g9a.m12424a(this.f66139c, wq1.m24106b(this.f66138b, this.f66137a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "MiniLessonReaderStyle(font=" + this.f66137a + ", fontSize=" + this.f66138b + ", lineHeight=" + this.f66139c + ", colorScheme=" + this.f66140d + ")";
    }
}
