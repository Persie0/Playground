package p000;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bvs implements bqf {

    /* JADX INFO: renamed from: a */
    private final btg f4556a;

    public bvs(btg btgVar) {
        this.f4556a = btgVar;
    }

    @Override // p000.bqf
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo2915a(Object obj, File file, bqr bqrVar) throws Throwable {
        InputStream inputStream = (InputStream) obj;
        byte[] bArr = (byte[]) this.f4556a.mo3034a(65536, byte[].class);
        FileOutputStream fileOutputStream = null;
        try {
            FileOutputStream fileOutputStream2 = new FileOutputStream(file);
            while (true) {
                try {
                    int i = inputStream.read(bArr);
                    if (i == -1) {
                        break;
                    }
                    fileOutputStream2.write(bArr, 0, i);
                } catch (IOException e) {
                    fileOutputStream = fileOutputStream2;
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException e2) {
                        }
                    }
                    this.f4556a.mo3036c(bArr);
                    return false;
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream = fileOutputStream2;
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException e3) {
                        }
                    }
                    this.f4556a.mo3036c(bArr);
                    throw th;
                }
            }
            fileOutputStream2.close();
            try {
                fileOutputStream2.close();
            } catch (IOException e4) {
            }
            this.f4556a.mo3036c(bArr);
            return true;
        } catch (IOException e5) {
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
