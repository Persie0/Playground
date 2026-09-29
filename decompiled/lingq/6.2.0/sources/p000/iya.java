package p000;

import java.io.File;

/* JADX INFO: loaded from: classes2.dex */
public final class iya implements kya {

    /* JADX INFO: renamed from: a */
    public final File f44785a;

    public iya(File file) {
        this.f44785a = file;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof iya) && this.f44785a.equals(((iya) obj).f44785a);
    }

    public final int hashCode() {
        return this.f44785a.hashCode();
    }

    public final String toString() {
        return "ShareFile(file=" + this.f44785a + ")";
    }
}
