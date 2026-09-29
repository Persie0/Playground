package p000;

import java.io.File;
import java.io.FileOutputStream;

/* JADX INFO: loaded from: classes2.dex */
public final class rhd extends xhd implements bhd {

    /* JADX INFO: renamed from: a */
    public final FileOutputStream f59334a;

    /* JADX INFO: renamed from: b */
    public final File f59335b;

    public rhd(FileOutputStream fileOutputStream, File file) {
        super(fileOutputStream);
        this.f59334a = fileOutputStream;
        this.f59335b = file;
    }

    @Override // p000.bhd
    public final File zza() {
        return this.f59335b;
    }
}
