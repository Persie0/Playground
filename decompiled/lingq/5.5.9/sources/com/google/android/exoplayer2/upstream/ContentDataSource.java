package com.google.android.exoplayer2.upstream;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Bundle;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;
import p454wa.AbstractC9879d;
import p454wa.C9884i;
import p479xa.C10134c0;

/* JADX INFO: loaded from: classes.dex */
public final class ContentDataSource extends AbstractC9879d {

    /* JADX INFO: renamed from: e */
    public final ContentResolver f13679e;

    /* JADX INFO: renamed from: f */
    public Uri f13680f;

    /* JADX INFO: renamed from: g */
    public AssetFileDescriptor f13681g;

    /* JADX INFO: renamed from: h */
    public FileInputStream f13682h;

    /* JADX INFO: renamed from: i */
    public long f13683i;

    /* JADX INFO: renamed from: j */
    public boolean f13684j;

    public static class ContentDataSourceException extends DataSourceException {
        public ContentDataSourceException(IOException iOException, int i10) {
            super(iOException, i10);
        }
    }

    public ContentDataSource(Context context) {
        super(false);
        this.f13679e = context.getContentResolver();
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // p454wa.InterfaceC9882g
    public final void close() throws ContentDataSourceException {
        this.f13680f = null;
        try {
            try {
                FileInputStream fileInputStream = this.f13682h;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.f13682h = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.f13681g;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                        this.f13681g = null;
                        if (this.f13684j) {
                            this.f13684j = false;
                            m18377o();
                        }
                    } catch (IOException e10) {
                        throw new ContentDataSourceException(e10, 2000);
                    }
                } catch (Throwable th2) {
                    this.f13681g = null;
                    if (this.f13684j) {
                        this.f13684j = false;
                        m18377o();
                    }
                    throw th2;
                }
            } catch (IOException e11) {
                throw new ContentDataSourceException(e11, 2000);
            }
        } catch (Throwable th3) {
            this.f13682h = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.f13681g;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.f13681g = null;
                    if (this.f13684j) {
                        this.f13684j = false;
                        m18377o();
                    }
                    throw th3;
                } catch (IOException e12) {
                    throw new ContentDataSourceException(e12, 2000);
                }
            } catch (Throwable th4) {
                this.f13681g = null;
                if (this.f13684j) {
                    this.f13684j = false;
                    m18377o();
                }
                throw th4;
            }
        }
    }

    @Override // p454wa.InterfaceC9882g
    /* JADX INFO: renamed from: e */
    public final long mo7273e(C9884i c9884i) throws ContentDataSourceException {
        AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor;
        try {
            Uri uri = c9884i.f50436a;
            this.f13680f = uri;
            m18378p(c9884i);
            boolean zEquals = "content".equals(c9884i.f50436a.getScheme());
            ContentResolver contentResolver = this.f13679e;
            if (zEquals) {
                Bundle bundle = new Bundle();
                bundle.putBoolean("android.provider.extra.ACCEPT_ORIGINAL_MEDIA_FORMAT", true);
                assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openTypedAssetFileDescriptor(uri, "*/*", bundle);
            } else {
                assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
            }
            this.f13681g = assetFileDescriptorOpenAssetFileDescriptor;
            if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                throw new ContentDataSourceException(new IOException("Could not open file descriptor for: " + uri), 2000);
            }
            long length = assetFileDescriptorOpenAssetFileDescriptor.getLength();
            FileInputStream fileInputStream = new FileInputStream(assetFileDescriptorOpenAssetFileDescriptor.getFileDescriptor());
            this.f13682h = fileInputStream;
            long j10 = c9884i.f50441f;
            if (length != -1 && j10 > length) {
                throw new ContentDataSourceException(null, 2008);
            }
            long startOffset = assetFileDescriptorOpenAssetFileDescriptor.getStartOffset();
            long jSkip = fileInputStream.skip(startOffset + j10) - startOffset;
            if (jSkip != j10) {
                throw new ContentDataSourceException(null, 2008);
            }
            if (length == -1) {
                FileChannel channel = fileInputStream.getChannel();
                long size = channel.size();
                if (size == 0) {
                    this.f13683i = -1L;
                } else {
                    long jPosition = size - channel.position();
                    this.f13683i = jPosition;
                    if (jPosition < 0) {
                        throw new ContentDataSourceException(null, 2008);
                    }
                }
            } else {
                long j11 = length - jSkip;
                this.f13683i = j11;
                if (j11 < 0) {
                    throw new ContentDataSourceException(null, 2008);
                }
            }
            long j12 = c9884i.f50442g;
            if (j12 != -1) {
                long j13 = this.f13683i;
                this.f13683i = j13 == -1 ? j12 : Math.min(j13, j12);
            }
            this.f13684j = true;
            m18379q(c9884i);
            return j12 != -1 ? j12 : this.f13683i;
        } catch (ContentDataSourceException e10) {
            throw e10;
        } catch (IOException e11) {
            throw new ContentDataSourceException(e11, e11 instanceof FileNotFoundException ? 2005 : 2000);
        }
    }

    @Override // p454wa.InterfaceC9882g
    /* JADX INFO: renamed from: k */
    public final Uri mo7276k() {
        return this.f13680f;
    }

    @Override // p454wa.InterfaceC9880e
    public final int read(byte[] bArr, int i10, int i11) throws ContentDataSourceException {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f13683i;
        if (j10 == 0) {
            return -1;
        }
        if (j10 != -1) {
            try {
                i11 = (int) Math.min(j10, i11);
            } catch (IOException e10) {
                throw new ContentDataSourceException(e10, 2000);
            }
        }
        FileInputStream fileInputStream = this.f13682h;
        int i12 = C10134c0.f51354a;
        int i13 = fileInputStream.read(bArr, i10, i11);
        if (i13 == -1) {
            return -1;
        }
        long j11 = this.f13683i;
        if (j11 != -1) {
            this.f13683i = j11 - ((long) i13);
        }
        m18376n(i13);
        return i13;
    }
}
