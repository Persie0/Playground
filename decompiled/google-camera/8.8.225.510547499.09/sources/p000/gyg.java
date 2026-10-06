package p000;

import com.google.android.material.behavior.iWN.zuAgeeF;
import java.io.File;
import java.io.IOException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gyg {

    /* JADX INFO: renamed from: a */
    private static final nbh f26827a = nbh.m17259h("com/google/android/apps/camera/session/SessionStorageManagerImpl");

    /* JADX INFO: renamed from: b */
    private final mrm f26828b;

    /* JADX INFO: renamed from: c */
    private final mrm f26829c;

    /* JADX INFO: renamed from: d */
    private final hlk f26830d;

    public gyg(File file, File file2, hlk hlkVar) {
        this.f26828b = mrm.m16828h(file);
        this.f26829c = mrm.m16828h(file2);
        this.f26830d = hlkVar;
    }

    /* JADX INFO: renamed from: b */
    private final void m9974b(File file) {
        File[] fileArrListFiles = file.listFiles(new gyf());
        if (fileArrListFiles == null) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        for (File file2 : fileArrListFiles) {
            file2.getAbsolutePath();
            if (file2.lastModified() < (-86400000) + jCurrentTimeMillis) {
                try {
                    this.f26830d.m10446a(file2);
                } catch (IOException e) {
                    ((nbe) ((nbe) f26827a.m17252c()).mo17276G((char) 3385)).mo17293r("Could not clean up %s", file2.getAbsolutePath());
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final File m9975a(String str) throws IOException {
        boolean z;
        mrm mrmVar = this.f26828b;
        if (!mrmVar.mo16813g()) {
            throw new IOException("Could retrieve baseDirectory.");
        }
        File file = new File((File) mrmVar.mo16809c(), str);
        synchronized (hlk.f28264a) {
            z = true;
            if (!file.isDirectory() && !file.mkdirs()) {
                z = false;
            }
        }
        if (!z) {
            throw new IOException("Could not create session directory: ".concat(file.toString()));
        }
        if (!file.isDirectory()) {
            throw new IOException(zuAgeeF.XuaDdf.concat(file.toString()));
        }
        m9974b(file);
        m9974b(new File((File) this.f26829c.mo16809c(), str));
        return file;
    }
}
