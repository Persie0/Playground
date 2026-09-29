package p000;

import android.net.Uri;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.text.TextUtils;
import androidx.media3.datasource.FileDataSource$FileDataSourceException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* JADX INFO: loaded from: classes2.dex */
public final class h33 extends v80 {

    /* JADX INFO: renamed from: e */
    public RandomAccessFile f41745e;

    /* JADX INFO: renamed from: f */
    public Uri f41746f;

    /* JADX INFO: renamed from: g */
    public long f41747g;

    /* JADX INFO: renamed from: h */
    public boolean f41748h;

    public h33() {
        super(false);
    }

    @Override // p000.j02
    /* JADX INFO: renamed from: b */
    public final long mo10000b(k02 k02Var) {
        Uri uri = k02Var.f46462a;
        long j = k02Var.f46466e;
        this.f41746f = uri;
        m23166n();
        try {
            String path = uri.getPath();
            path.getClass();
            RandomAccessFile randomAccessFile = new RandomAccessFile(path, "r");
            this.f41745e = randomAccessFile;
            try {
                randomAccessFile.seek(j);
                long length = k02Var.f46467f;
                if (length == -1) {
                    length = this.f41745e.length() - j;
                }
                this.f41747g = length;
                if (length < 0) {
                    throw new FileDataSource$FileDataSourceException(null, null, 2008);
                }
                this.f41748h = true;
                m23167q(k02Var);
                return this.f41747g;
            } catch (IOException e) {
                throw new FileDataSource$FileDataSourceException(e, 2000);
            }
        } catch (FileNotFoundException e2) {
            if (TextUtils.isEmpty(uri.getQuery()) && TextUtils.isEmpty(uri.getFragment())) {
                throw new FileDataSource$FileDataSourceException(e2, ((e2.getCause() instanceof ErrnoException) && ((ErrnoException) e2.getCause()).errno == OsConstants.EACCES) ? 2006 : 2005);
            }
            String path2 = uri.getPath();
            String query = uri.getQuery();
            String fragment = uri.getFragment();
            StringBuilder sbM23000w = ux5.m23000w("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=", path2, ",query=", query, ",fragment=");
            sbM23000w.append(fragment);
            throw new FileDataSource$FileDataSourceException(sbM23000w.toString(), e2, 1004);
        } catch (SecurityException e3) {
            throw new FileDataSource$FileDataSourceException(e3, 2006);
        } catch (RuntimeException e4) {
            throw new FileDataSource$FileDataSourceException(e4, 2000);
        }
    }

    @Override // p000.j02
    public final void close() {
        this.f41746f = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.f41745e;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
                this.f41745e = null;
                if (this.f41748h) {
                    this.f41748h = false;
                    m23165m();
                }
            } catch (IOException e) {
                throw new FileDataSource$FileDataSourceException(e, 2000);
            }
        } catch (Throwable th) {
            this.f41745e = null;
            if (this.f41748h) {
                this.f41748h = false;
                m23165m();
            }
            throw th;
        }
    }

    @Override // p000.j02
    public final Uri getUri() {
        return this.f41746f;
    }

    @Override // p000.h02
    public final int read(byte[] bArr, int i, int i2) throws FileDataSource$FileDataSourceException {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f41747g;
        if (j == 0) {
            return -1;
        }
        try {
            RandomAccessFile randomAccessFile = this.f41745e;
            String str = uma.f64080a;
            int i3 = randomAccessFile.read(bArr, i, (int) Math.min(j, i2));
            if (i3 > 0) {
                this.f41747g -= (long) i3;
                m23164j(i3);
            }
            return i3;
        } catch (IOException e) {
            throw new FileDataSource$FileDataSourceException(e, 2000);
        }
    }
}
