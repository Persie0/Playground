package p000;

import android.content.Context;
import com.google.android.libraries.lens.lenslite.api.arLu.YmzeHXaMYOLk;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fci implements fcq {

    /* JADX INFO: renamed from: a */
    private static final nbh f21253a = nbh.m17259h("com/google/android/apps/camera/logging/LocalCameraEventLogger");

    /* JADX INFO: renamed from: b */
    private FileOutputStream f21254b;

    /* JADX INFO: renamed from: c */
    private final File f21255c;

    public fci(Context context) {
        FileOutputStream fileOutputStream;
        File file = new File(new File(context.getFilesDir(), YmzeHXaMYOLk.hDpIFfwzrl), "session.pb");
        this.f21255c = file;
        file.getPath();
        try {
            nea.m17393g(file);
            fileOutputStream = new FileOutputStream(file, true);
        } catch (IOException e) {
            ((nbe) ((nbe) ((nbe) f21253a.m17251b()).mo17283h(e)).mo17276G((char) 2113)).mo17290o("Failed to create logging file!");
            fileOutputStream = null;
        }
        this.f21254b = fileOutputStream;
    }

    @Override // p000.fcq
    /* JADX INFO: renamed from: a */
    public final void mo4205a(nho nhoVar) {
        int iM18135M;
        try {
            synchronized (this) {
                FileOutputStream fileOutputStream = this.f21254b;
                if (fileOutputStream != null) {
                    nxl nxlVar = (nxl) nhoVar.m18143ad(5);
                    nxlVar.m18108s(nhoVar);
                    nxl nxlVarM18137O = nik.f42718c.m18137O();
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (!nxlVarM18137O.f44974b.m18142ac()) {
                        nxlVarM18137O.mo18106p();
                    }
                    nik nikVar = (nik) nxlVarM18137O.f44974b;
                    nikVar.f42720a |= 1;
                    nikVar.f42721b = jCurrentTimeMillis;
                    if (!nxlVar.f44974b.m18142ac()) {
                        nxlVar.mo18106p();
                    }
                    nho nhoVar2 = (nho) nxlVar.f44974b;
                    nik nikVar2 = (nik) nxlVarM18137O.mo18103l();
                    nho nhoVar3 = nho.f42417av;
                    nikVar2.getClass();
                    nhoVar2.f42441W = nikVar2;
                    nhoVar2.f42468b |= 134217728;
                    nho nhoVar4 = (nho) nxlVar.mo18103l();
                    if (nhoVar4.m18142ac()) {
                        iM18135M = nhoVar4.m18135M(null);
                        if (iM18135M < 0) {
                            throw new IllegalStateException("serialized size must be non-negative, was " + iM18135M);
                        }
                    } else {
                        iM18135M = nhoVar4.f44980aI & Integer.MAX_VALUE;
                        if (iM18135M == Integer.MAX_VALUE) {
                            iM18135M = nhoVar4.m18135M(null);
                            if (iM18135M < 0) {
                                throw new IllegalStateException("serialized size must be non-negative, was " + iM18135M);
                            }
                            nhoVar4.f44980aI = (nhoVar4.f44980aI & Integer.MIN_VALUE) | iM18135M;
                        }
                    }
                    nxb nxbVarM17989ah = nxb.m17989ah(fileOutputStream, nxb.m17974S(nxb.m17983ab(iM18135M) + iM18135M));
                    nxbVarM17989ah.mo17931C(iM18135M);
                    nhoVar4.mo17764cy(nxbVarM17989ah);
                    nxbVarM17989ah.mo17942i();
                    FileOutputStream fileOutputStream2 = this.f21254b;
                    if (fileOutputStream2 != null) {
                        try {
                            fileOutputStream2.flush();
                            fileOutputStream2.close();
                            this.f21254b = null;
                            this.f21254b = new FileOutputStream(this.f21255c, true);
                        } catch (IOException e) {
                            ((nbe) ((nbe) ((nbe) f21253a.m17251b()).mo17283h(e)).mo17276G((char) 2116)).mo17290o("Failed to re-open logging file!");
                        }
                    }
                }
            }
        } catch (IOException e2) {
            ((nbe) ((nbe) ((nbe) f21253a.m17251b()).mo17283h(e2)).mo17276G((char) 2117)).mo17290o("Failed to log an event!");
        }
    }
}
