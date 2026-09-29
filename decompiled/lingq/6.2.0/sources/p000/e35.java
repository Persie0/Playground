package p000;

import com.lingq.feature.lessoninfo.SharedByRole;

/* JADX INFO: loaded from: classes3.dex */
public final class e35 {

    /* JADX INFO: renamed from: a */
    public final int f36645a;

    /* JADX INFO: renamed from: b */
    public final String f36646b;

    /* JADX INFO: renamed from: c */
    public final SharedByRole f36647c;

    public e35(int i, String str, SharedByRole sharedByRole) {
        this.f36645a = i;
        this.f36646b = str;
        this.f36647c = sharedByRole;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e35)) {
            return false;
        }
        e35 e35Var = (e35) obj;
        return this.f36645a == e35Var.f36645a && this.f36646b.equals(e35Var.f36646b) && this.f36647c == e35Var.f36647c;
    }

    public final int hashCode() {
        int iM22980c = ux5.m22980c(Integer.hashCode(this.f36645a) * 31, this.f36646b, 31);
        SharedByRole sharedByRole = this.f36647c;
        return iM22980c + (sharedByRole == null ? 0 : sharedByRole.hashCode());
    }

    public final String toString() {
        StringBuilder sbM22995r = ux5.m22995r(this.f36645a, "LessonInfoCourse(id=", ", title=", this.f36646b, ", sharedByRole=");
        sbM22995r.append(this.f36647c);
        sbM22995r.append(")");
        return sbM22995r.toString();
    }
}
