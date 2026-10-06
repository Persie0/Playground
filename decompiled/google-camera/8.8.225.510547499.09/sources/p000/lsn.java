package p000;

import java.io.File;
import java.io.FileOutputStream;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class lsn extends lsp implements lsh {

    /* JADX INFO: renamed from: a */
    public final FileOutputStream f39137a;

    /* JADX INFO: renamed from: b */
    private final File f39138b;

    public lsn(FileOutputStream fileOutputStream, File file) {
        super(fileOutputStream);
        this.f39137a = fileOutputStream;
        this.f39138b = file;
    }

    @Override // p000.lsh
    /* JADX INFO: renamed from: a */
    public final File mo15948a() {
        return this.f39138b;
    }
}
