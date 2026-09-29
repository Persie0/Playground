package p241le;

import java.io.File;
import ne.AbstractC7743b0;
import ne.C7742b;

/* JADX INFO: renamed from: le.b */
/* JADX INFO: loaded from: classes.dex */
public final class C7324b extends AbstractC7355z {

    /* JADX INFO: renamed from: a */
    public final AbstractC7743b0 f41027a;

    /* JADX INFO: renamed from: b */
    public final String f41028b;

    /* JADX INFO: renamed from: c */
    public final File f41029c;

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public C7324b(C7742b c7742b, String str, File file) {
        this.f41027a = c7742b;
        if (str == null) {
            throw new NullPointerException("Null sessionId");
        }
        this.f41028b = str;
        this.f41029c = file;
    }

    @Override // p241le.AbstractC7355z
    /* JADX INFO: renamed from: a */
    public final AbstractC7743b0 mo14739a() {
        return this.f41027a;
    }

    @Override // p241le.AbstractC7355z
    /* JADX INFO: renamed from: b */
    public final File mo14740b() {
        return this.f41029c;
    }

    @Override // p241le.AbstractC7355z
    /* JADX INFO: renamed from: c */
    public final String mo14741c() {
        return this.f41028b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC7355z)) {
            return false;
        }
        AbstractC7355z abstractC7355z = (AbstractC7355z) obj;
        return this.f41027a.equals(abstractC7355z.mo14739a()) && this.f41028b.equals(abstractC7355z.mo14741c()) && this.f41029c.equals(abstractC7355z.mo14740b());
    }

    public final int hashCode() {
        return ((((this.f41027a.hashCode() ^ 1000003) * 1000003) ^ this.f41028b.hashCode()) * 1000003) ^ this.f41029c.hashCode();
    }

    public final String toString() {
        return "CrashlyticsReportWithSessionId{report=" + this.f41027a + ", sessionId=" + this.f41028b + ", reportFile=" + this.f41029c + "}";
    }
}
