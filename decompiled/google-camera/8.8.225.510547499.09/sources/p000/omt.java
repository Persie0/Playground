package p000;

import java.io.File;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class omt extends omv {

    /* JADX INFO: renamed from: b */
    private boolean f46321b;

    /* JADX INFO: renamed from: c */
    private File[] f46322c;

    /* JADX INFO: renamed from: d */
    private int f46323d;

    /* JADX INFO: renamed from: e */
    private boolean f46324e;

    public omt(File file) {
        super(file);
    }

    @Override // p000.omv
    /* JADX INFO: renamed from: a */
    public final File mo18724a() {
        int i;
        if (!this.f46324e && this.f46322c == null) {
            File[] fileArrListFiles = this.f46326a.listFiles();
            this.f46322c = fileArrListFiles;
            if (fileArrListFiles == null) {
                this.f46324e = true;
            }
        }
        File[] fileArr = this.f46322c;
        if (fileArr != null && (i = this.f46323d) < fileArr.length) {
            this.f46323d = i + 1;
            return fileArr[i];
        }
        if (this.f46321b) {
            return null;
        }
        this.f46321b = true;
        return this.f46326a;
    }
}
