package com.google.android.exoplayer2.upstream;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import p454wa.AbstractC9879d;
import p454wa.C9884i;
import p479xa.C10134c0;

/* JADX INFO: loaded from: classes.dex */
public final class AssetDataSource extends AbstractC9879d {

    /* JADX INFO: renamed from: e */
    public final AssetManager f13674e;

    /* JADX INFO: renamed from: f */
    public Uri f13675f;

    /* JADX INFO: renamed from: g */
    public InputStream f13676g;

    /* JADX INFO: renamed from: h */
    public long f13677h;

    /* JADX INFO: renamed from: i */
    public boolean f13678i;

    public static final class AssetDataSourceException extends DataSourceException {
        public AssetDataSourceException(IOException iOException, int i10) {
            super(iOException, i10);
        }
    }

    public AssetDataSource(Context context) {
        super(false);
        this.f13674e = context.getAssets();
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p454wa.InterfaceC9882g
    public final void close() throws AssetDataSourceException {
        this.f13675f = null;
        try {
            try {
                InputStream inputStream = this.f13676g;
                if (inputStream != null) {
                    inputStream.close();
                }
                this.f13676g = null;
                if (this.f13678i) {
                    this.f13678i = false;
                    m18377o();
                }
            } catch (IOException e10) {
                throw new AssetDataSourceException(e10, 2000);
            }
        } catch (Throwable th2) {
            this.f13676g = null;
            if (this.f13678i) {
                this.f13678i = false;
                m18377o();
            }
            throw th2;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // p454wa.InterfaceC9882g
    /* JADX INFO: renamed from: e */
    public final long mo7273e(C9884i c9884i) throws AssetDataSourceException {
        try {
            Uri uri = c9884i.f50436a;
            long j10 = c9884i.f50441f;
            this.f13675f = uri;
            String path = uri.getPath();
            path.getClass();
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith("/")) {
                path = path.substring(1);
            }
            m18378p(c9884i);
            InputStream inputStreamOpen = this.f13674e.open(path, 1);
            this.f13676g = inputStreamOpen;
            if (inputStreamOpen.skip(j10) < j10) {
                throw new AssetDataSourceException(null, 2008);
            }
            long j11 = c9884i.f50442g;
            if (j11 != -1) {
                this.f13677h = j11;
            } else {
                long jAvailable = this.f13676g.available();
                this.f13677h = jAvailable;
                if (jAvailable == 2147483647L) {
                    this.f13677h = -1L;
                }
            }
            this.f13678i = true;
            m18379q(c9884i);
            return this.f13677h;
        } catch (AssetDataSourceException e10) {
            throw e10;
        } catch (IOException e11) {
            throw new AssetDataSourceException(e11, e11 instanceof FileNotFoundException ? 2005 : 2000);
        }
    }

    @Override // p454wa.InterfaceC9882g
    /* JADX INFO: renamed from: k */
    public final Uri mo7276k() {
        return this.f13675f;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p454wa.InterfaceC9880e
    public final int read(byte[] bArr, int i10, int i11) throws AssetDataSourceException {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f13677h;
        if (j10 == 0) {
            return -1;
        }
        if (j10 != -1) {
            try {
                i11 = (int) Math.min(j10, i11);
            } catch (IOException e10) {
                throw new AssetDataSourceException(e10, 2000);
            }
        }
        InputStream inputStream = this.f13676g;
        int i12 = C10134c0.f51354a;
        int i13 = inputStream.read(bArr, i10, i11);
        if (i13 == -1) {
            return -1;
        }
        long j11 = this.f13677h;
        if (j11 != -1) {
            this.f13677h = j11 - ((long) i13);
        }
        m18376n(i13);
        return i13;
    }
}
