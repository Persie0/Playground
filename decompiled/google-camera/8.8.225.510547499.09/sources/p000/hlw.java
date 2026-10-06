package p000;

import java.io.File;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hlw {

    /* JADX INFO: renamed from: a */
    private final File f28287a;

    public hlw(File file) {
        this.f28287a = file;
    }

    /* JADX INFO: renamed from: a */
    public final File m10452a() {
        boolean z = true;
        if (!this.f28287a.mkdirs() && !this.f28287a.isDirectory()) {
            z = false;
        }
        lku.m15614I(z, "Folder doesn't exist and cannot be created: ".concat(this.f28287a.toString()));
        return this.f28287a;
    }

    /* JADX INFO: renamed from: b */
    public final String m10453b() {
        return this.f28287a.getAbsolutePath();
    }

    public final String toString() {
        return this.f28287a.toString();
    }
}
