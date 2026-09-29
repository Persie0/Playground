package p000;

import com.lingq.core.domain.model.challenge.BookChallengeBookStatus;

/* JADX INFO: loaded from: classes2.dex */
public final class de0 {

    /* JADX INFO: renamed from: a */
    public final int f35485a;

    /* JADX INFO: renamed from: b */
    public final String f35486b;

    /* JADX INFO: renamed from: c */
    public final String f35487c;

    /* JADX INFO: renamed from: d */
    public final String f35488d;

    /* JADX INFO: renamed from: e */
    public final double f35489e;

    /* JADX INFO: renamed from: f */
    public final BookChallengeBookStatus f35490f;

    public de0(int i, String str, String str2, String str3, double d, BookChallengeBookStatus bookChallengeBookStatus) {
        bookChallengeBookStatus.getClass();
        this.f35485a = i;
        this.f35486b = str;
        this.f35487c = str2;
        this.f35488d = str3;
        this.f35489e = d;
        this.f35490f = bookChallengeBookStatus;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m10306a() {
        BookChallengeBookStatus.Companion.getClass();
        return BookChallengeBookStatus.finished.contains(this.f35490f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof de0)) {
            return false;
        }
        de0 de0Var = (de0) obj;
        return this.f35485a == de0Var.f35485a && this.f35486b.equals(de0Var.f35486b) && this.f35487c.equals(de0Var.f35487c) && fa4.m11650l(this.f35488d, de0Var.f35488d) && Double.compare(this.f35489e, de0Var.f35489e) == 0 && this.f35490f == de0Var.f35490f;
    }

    public final int hashCode() {
        int iM22980c = ux5.m22980c(ux5.m22980c(Integer.hashCode(this.f35485a) * 31, this.f35486b, 31), this.f35487c, 31);
        String str = this.f35488d;
        return this.f35490f.hashCode() + g9a.m12424a(this.f35489e, (iM22980c + (str == null ? 0 : str.hashCode())) * 31, 31);
    }

    public final String toString() {
        StringBuilder sbM22995r = ux5.m22995r(this.f35485a, "BookChallengeBook(id=", ", title=", this.f35486b, ", imageUrl=");
        AbstractC3393o1.m17725C(sbM22995r, this.f35487c, ", language=", this.f35488d, ", progress=");
        sbM22995r.append(this.f35489e);
        sbM22995r.append(", status=");
        sbM22995r.append(this.f35490f);
        sbM22995r.append(")");
        return sbM22995r.toString();
    }
}
