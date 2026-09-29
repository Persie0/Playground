package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.text.TextUtils;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import p454wa.AbstractC9879d;
import p454wa.C9884i;
import p479xa.C10134c0;

/* JADX INFO: loaded from: classes.dex */
public final class FileDataSource extends AbstractC9879d {

    /* JADX INFO: renamed from: e */
    public RandomAccessFile f13687e;

    /* JADX INFO: renamed from: f */
    public Uri f13688f;

    /* JADX INFO: renamed from: g */
    public long f13689g;

    /* JADX INFO: renamed from: h */
    public boolean f13690h;

    public static class FileDataSourceException extends DataSourceException {
        public FileDataSourceException(int i10, String str, FileNotFoundException fileNotFoundException) {
            super(i10, str, fileNotFoundException);
        }

        public FileDataSourceException(Exception exc, int i10) {
            super(exc, i10);
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.upstream.FileDataSource$a */
    public static final class C2520a {
        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: b */
        public static boolean m7464b(Throwable th2) {
            return (th2 instanceof ErrnoException) && ((ErrnoException) th2).errno == OsConstants.EACCES;
        }
    }

    public FileDataSource() {
        super(false);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p454wa.InterfaceC9882g
    public final void close() throws FileDataSourceException {
        this.f13688f = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.f13687e;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
                this.f13687e = null;
                if (this.f13690h) {
                    this.f13690h = false;
                    m18377o();
                }
            } catch (IOException e10) {
                throw new FileDataSourceException(e10, 2000);
            }
        } catch (Throwable th2) {
            this.f13687e = null;
            if (this.f13690h) {
                this.f13690h = false;
                m18377o();
            }
            throw th2;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 3, instructions: 3 */
    @Override // p454wa.InterfaceC9882g
    /* JADX INFO: renamed from: e */
    public final long mo7273e(C9884i c9884i) throws FileDataSourceException {
        Uri uri = c9884i.f50436a;
        long j10 = c9884i.f50441f;
        this.f13688f = uri;
        m18378p(c9884i);
        int i10 = 2006;
        try {
            String path = uri.getPath();
            path.getClass();
            RandomAccessFile randomAccessFile = new RandomAccessFile(path, "r");
            this.f13687e = randomAccessFile;
            try {
                randomAccessFile.seek(j10);
                long length = c9884i.f50442g;
                if (length == -1) {
                    length = this.f13687e.length() - j10;
                }
                this.f13689g = length;
                if (length < 0) {
                    throw new FileDataSourceException(2008, null, null);
                }
                this.f13690h = true;
                m18379q(c9884i);
                return this.f13689g;
            } catch (IOException e10) {
                throw new FileDataSourceException(e10, 2000);
            }
        } catch (FileNotFoundException e11) {
            if (!TextUtils.isEmpty(uri.getQuery()) || !TextUtils.isEmpty(uri.getFragment())) {
                throw new FileDataSourceException(1004, String.format("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=%s,query=%s,fragment=%s", uri.getPath(), uri.getQuery(), uri.getFragment()), e11);
            }
            if (C10134c0.f51354a < 21 || !C2520a.m7464b(e11.getCause())) {
                i10 = 2005;
            }
            throw new FileDataSourceException(e11, i10);
        } catch (SecurityException e12) {
            throw new FileDataSourceException(e12, 2006);
        } catch (RuntimeException e13) {
            throw new FileDataSourceException(e13, 2000);
        }
    }

    @Override // p454wa.InterfaceC9882g
    /* JADX INFO: renamed from: k */
    public final Uri mo7276k() {
        return this.f13688f;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p454wa.InterfaceC9880e
    public final int read(byte[] bArr, int i10, int i11) throws FileDataSourceException {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f13689g;
        if (j10 == 0) {
            return -1;
        }
        try {
            RandomAccessFile randomAccessFile = this.f13687e;
            int i12 = C10134c0.f51354a;
            int i13 = randomAccessFile.read(bArr, i10, (int) Math.min(j10, i11));
            if (i13 > 0) {
                this.f13689g -= (long) i13;
                m18376n(i13);
            }
            return i13;
        } catch (IOException e10) {
            throw new FileDataSourceException(e10, 2000);
        }
    }
}
