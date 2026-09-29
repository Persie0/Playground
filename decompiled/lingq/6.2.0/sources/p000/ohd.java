package p000;

import java.io.File;
import java.io.FileInputStream;

/* JADX INFO: loaded from: classes.dex */
public final class ohd extends uhd implements bhd {

    /* JADX INFO: renamed from: a */
    public final File f54361a;

    public ohd(FileInputStream fileInputStream, File file) {
        super(fileInputStream);
        this.f54361a = file;
    }

    @Override // p000.bhd
    public final File zza() {
        return this.f54361a;
    }
}
