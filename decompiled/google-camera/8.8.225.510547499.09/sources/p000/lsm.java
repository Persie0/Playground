package p000;

import java.io.File;
import java.io.FileInputStream;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class lsm extends lso implements lsh {

    /* JADX INFO: renamed from: a */
    private final FileInputStream f39135a;

    /* JADX INFO: renamed from: b */
    private final File f39136b;

    public lsm(FileInputStream fileInputStream, File file) {
        super(fileInputStream);
        this.f39135a = fileInputStream;
        this.f39136b = file;
    }

    @Override // p000.lsh
    /* JADX INFO: renamed from: a */
    public final File mo15948a() {
        return this.f39136b;
    }
}
