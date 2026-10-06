package p000;

import android.graphics.Bitmap;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hlu implements nom {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ Object f28279a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ hlv f28280b;

    public hlu(hlv hlvVar, Object obj) {
        this.f28280b = hlvVar;
        this.f28279a = obj;
    }

    @Override // p000.nom
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ nps mo3942a(Object obj) {
        try {
            bpt bptVarM2896e = ((bpv) obj).m2896e(this.f28280b.f28283c);
            if (bptVarM2896e != null) {
                try {
                    File fileM2879d = bptVarM2896e.m2879d();
                    Object obj2 = this.f28279a;
                    fileM2879d.getClass();
                    FileOutputStream fileOutputStream = new FileOutputStream(fileM2879d);
                    try {
                        int i = ((hlr) obj2).f28276b.f35503e;
                        fileOutputStream.write(i & 255);
                        fileOutputStream.write(i >> 8);
                        ((hlr) obj2).f28275a.compress(Bitmap.CompressFormat.JPEG, 80, fileOutputStream);
                        fileOutputStream.close();
                        bptVarM2896e.m2878c();
                        synchronized (this.f28280b.f28286f) {
                            this.f28280b.f28285e = null;
                        }
                        bptVarM2896e.m2877b();
                    } catch (Throwable th) {
                        try {
                            fileOutputStream.close();
                        } catch (Throwable th2) {
                            try {
                                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                            } catch (Exception e) {
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    bptVarM2896e.m2877b();
                    throw th3;
                }
            }
            return kxk.m14965K(null);
        } catch (IOException e2) {
            return kxk.m14964J(e2);
        }
    }
}
