package p000;

import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public final class and extends bnd {

    /* JADX INFO: renamed from: b */
    public int f937b;

    @Override // p000.bnd
    /* JADX INFO: renamed from: a */
    public final String mo623a() {
        return "com/google/android/libraries/phenotype/client/Phlogger".replace('/', '.');
    }

    @Override // p000.bnd
    /* JADX INFO: renamed from: b */
    public final String mo624b() {
        return "logInternal";
    }

    @Override // p000.bnd
    /* JADX INFO: renamed from: c */
    public final int mo625c() {
        return 44;
    }

    @Override // p000.bnd
    /* JADX INFO: renamed from: d */
    public final String mo626d() {
        return "Phlogger.java".substring("Phlogger.java".lastIndexOf(File.separatorChar) + 1);
    }

    @Override // p000.bnd
    /* JADX INFO: renamed from: e */
    public final String mo627e() {
        return "Phlogger.java";
    }

    public final boolean equals(Object obj) {
        return obj instanceof and;
    }

    public final int hashCode() {
        int i = this.f937b;
        if (i != 0) {
            return i;
        }
        this.f937b = -1391114360;
        return -1391114360;
    }
}
