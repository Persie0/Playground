package p000;

import android.content.Context;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class goa implements god {

    /* JADX INFO: renamed from: a */
    public static final nbh f25836a = nbh.m17259h("com/google/android/apps/camera/pixelcamerakit/prealloc/ImageReaderPreallocator");

    /* JADX INFO: renamed from: b */
    public final gnz f25837b;

    /* JADX INFO: renamed from: c */
    public final kbz f25838c;

    /* JADX INFO: renamed from: d */
    public final File f25839d;

    /* JADX INFO: renamed from: h */
    public mqq f25843h;

    /* JADX INFO: renamed from: e */
    public int f25840e = 0;

    /* JADX INFO: renamed from: f */
    public int f25841f = 0;

    /* JADX INFO: renamed from: g */
    nlj f25842g = nlj.f43528d;

    /* JADX INFO: renamed from: i */
    public final Map f25844i = new HashMap();

    public goa(gnz gnzVar, Context context, Executor executor, kbz kbzVar) throws nyb {
        this.f25837b = gnzVar;
        kxk.m14956B(executor);
        this.f25838c = kbzVar;
        this.f25843h = mqq.f41446b;
        File file = new File(context.getCacheDir(), "prealloc_history.pb");
        this.f25839d = file;
        if (file.isFile()) {
            try {
                FileInputStream fileInputStream = new FileInputStream(file);
                try {
                    nxf nxfVar = nxf.f44904a;
                    mqq mqqVar = mqq.f41446b;
                    nww nwwVarM17876I = nww.m17876I(fileInputStream);
                    nxq nxqVarM18138P = mqqVar.m18138P();
                    try {
                        try {
                            nzm nzmVarM18260b = nzf.f45060a.m18260b(nxqVarM18138P);
                            nzmVarM18260b.mo18252h(nxqVarM18138P, nwx.m17885p(nwwVarM17876I), nxfVar);
                            nzmVarM18260b.mo18250f(nxqVarM18138P);
                            nxq.m18132ae(nxqVarM18138P);
                            mqq mqqVar2 = (mqq) nxqVarM18138P;
                            this.f25843h = mqqVar2;
                            mqqVar2.f41448a.size();
                            fileInputStream.close();
                        } catch (IOException e) {
                            if (!(e.getCause() instanceof nyb)) {
                                throw new nyb(e);
                            }
                            throw ((nyb) e.getCause());
                        } catch (RuntimeException e2) {
                            if (!(e2.getCause() instanceof nyb)) {
                                throw e2;
                            }
                            throw ((nyb) e2.getCause());
                        }
                    } catch (nyb e3) {
                        if (!e3.f44994a) {
                            throw e3;
                        }
                        throw new nyb(e3);
                    } catch (nzx e4) {
                        throw e4.m18328a();
                    }
                } catch (Throwable th) {
                    try {
                        fileInputStream.close();
                    } catch (Throwable th2) {
                        try {
                            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                        } catch (Exception e5) {
                        }
                    }
                    throw th;
                }
            } catch (IOException e6) {
                ((nbe) ((nbe) ((nbe) f25836a.m17252c()).mo17283h(e6)).mo17276G((char) 3117)).mo17290o("Failed to load persisted manifest.");
                this.f25839d.delete();
            }
        }
    }

    @Override // p000.god
    /* JADX INFO: renamed from: a */
    public final synchronized nlj mo9572a() {
        return this.f25842g;
    }
}
