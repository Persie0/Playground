package com.google.android.exoplayer2.upstream;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.support.v4.media.session.C0166e;
import android.text.TextUtils;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import p003a2.C0009a;
import p454wa.AbstractC9879d;
import p454wa.C9884i;
import p479xa.C10134c0;

/* JADX INFO: loaded from: classes.dex */
public final class RawResourceDataSource extends AbstractC9879d {

    /* JADX INFO: renamed from: e */
    public final Resources f13713e;

    /* JADX INFO: renamed from: f */
    public final String f13714f;

    /* JADX INFO: renamed from: g */
    public Uri f13715g;

    /* JADX INFO: renamed from: h */
    public AssetFileDescriptor f13716h;

    /* JADX INFO: renamed from: i */
    public FileInputStream f13717i;

    /* JADX INFO: renamed from: j */
    public long f13718j;

    /* JADX INFO: renamed from: k */
    public boolean f13719k;

    public static class RawResourceDataSourceException extends DataSourceException {
        public RawResourceDataSourceException(int i10, String str, Exception exc) {
            super(i10, str, exc);
        }
    }

    public RawResourceDataSource(Context context) {
        super(false);
        this.f13713e = context.getResources();
        this.f13714f = context.getPackageName();
    }

    public static Uri buildRawResourceUri(int i10) {
        return Uri.parse("rawresource:///" + i10);
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0039 */
    /* JADX WARN: Bottom block not found for handler: all -> 0x0054 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // p454wa.InterfaceC9882g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void close() throws RawResourceDataSourceException {
        this.f13715g = null;
        try {
            FileInputStream fileInputStream = this.f13717i;
            if (fileInputStream != null) {
                fileInputStream.close();
            }
            this.f13717i = null;
            try {
                AssetFileDescriptor assetFileDescriptor = this.f13716h;
                if (assetFileDescriptor != null) {
                    assetFileDescriptor.close();
                }
                this.f13716h = null;
                if (this.f13719k) {
                    this.f13719k = false;
                    m18377o();
                }
            } catch (IOException e10) {
                throw new RawResourceDataSourceException(2000, null, e10);
            }
        } catch (IOException e11) {
            throw new RawResourceDataSourceException(2000, null, e11);
        }
    }

    /* JADX WARN: Code duplicated, block: B:84:0x009a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // p454wa.InterfaceC9882g
    /* JADX INFO: renamed from: e */
    public final long mo7273e(C9884i c9884i) throws RawResourceDataSourceException {
        int identifier;
        Uri uri = c9884i.f50436a;
        this.f13715g = uri;
        boolean zEquals = TextUtils.equals("rawresource", uri.getScheme());
        Resources resources = this.f13713e;
        if (zEquals) {
            try {
                String lastPathSegment = uri.getLastPathSegment();
                lastPathSegment.getClass();
                identifier = Integer.parseInt(lastPathSegment);
            } catch (NumberFormatException unused) {
                throw new RawResourceDataSourceException(1004, "Resource identifier must be an integer.", null);
            }
        } else {
            if (TextUtils.equals("android.resource", uri.getScheme()) && uri.getPathSegments().size() == 1) {
                String lastPathSegment2 = uri.getLastPathSegment();
                lastPathSegment2.getClass();
                if (lastPathSegment2.matches("\\d+")) {
                    String lastPathSegment3 = uri.getLastPathSegment();
                    lastPathSegment3.getClass();
                    identifier = Integer.parseInt(lastPathSegment3);
                }
            }
            if (!TextUtils.equals("android.resource", uri.getScheme())) {
                throw new RawResourceDataSourceException(1004, "URI must either use scheme rawresource or android.resource", null);
            }
            String path = uri.getPath();
            path.getClass();
            if (path.startsWith("/")) {
                path = path.substring(1);
            }
            String host = uri.getHost();
            identifier = resources.getIdentifier(C0009a.m23l(new StringBuilder(), TextUtils.isEmpty(host) ? "" : C0166e.m765k(host, ":"), path), "raw", this.f13714f);
            if (identifier == 0) {
                throw new RawResourceDataSourceException(2005, "Resource not found.", null);
            }
        }
        m18378p(c9884i);
        try {
            AssetFileDescriptor assetFileDescriptorOpenRawResourceFd = resources.openRawResourceFd(identifier);
            this.f13716h = assetFileDescriptorOpenRawResourceFd;
            if (assetFileDescriptorOpenRawResourceFd == null) {
                throw new RawResourceDataSourceException(2000, "Resource is compressed: " + uri, null);
            }
            long length = assetFileDescriptorOpenRawResourceFd.getLength();
            FileInputStream fileInputStream = new FileInputStream(assetFileDescriptorOpenRawResourceFd.getFileDescriptor());
            this.f13717i = fileInputStream;
            long j10 = c9884i.f50441f;
            try {
                if (length != -1 && j10 > length) {
                    throw new RawResourceDataSourceException(2008, null, null);
                }
                long startOffset = assetFileDescriptorOpenRawResourceFd.getStartOffset();
                long jSkip = fileInputStream.skip(startOffset + j10) - startOffset;
                if (jSkip != j10) {
                    throw new RawResourceDataSourceException(2008, null, null);
                }
                if (length == -1) {
                    FileChannel channel = fileInputStream.getChannel();
                    if (channel.size() == 0) {
                        this.f13718j = -1L;
                    } else {
                        long size = channel.size() - channel.position();
                        this.f13718j = size;
                        if (size < 0) {
                            throw new RawResourceDataSourceException(2008, null, null);
                        }
                    }
                } else {
                    long j11 = length - jSkip;
                    this.f13718j = j11;
                    if (j11 < 0) {
                        throw new DataSourceException(2008);
                    }
                }
                long j12 = c9884i.f50442g;
                if (j12 != -1) {
                    long j13 = this.f13718j;
                    this.f13718j = j13 == -1 ? j12 : Math.min(j13, j12);
                }
                this.f13719k = true;
                m18379q(c9884i);
                return j12 != -1 ? j12 : this.f13718j;
            } catch (RawResourceDataSourceException e10) {
                throw e10;
            } catch (IOException e11) {
                throw new RawResourceDataSourceException(2000, null, e11);
            }
        } catch (Resources.NotFoundException e12) {
            throw new RawResourceDataSourceException(2005, null, e12);
        }
    }

    @Override // p454wa.InterfaceC9882g
    /* JADX INFO: renamed from: k */
    public final Uri mo7276k() {
        return this.f13715g;
    }

    @Override // p454wa.InterfaceC9880e
    public final int read(byte[] bArr, int i10, int i11) throws RawResourceDataSourceException {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f13718j;
        if (j10 == 0) {
            return -1;
        }
        if (j10 != -1) {
            try {
                i11 = (int) Math.min(j10, i11);
            } catch (IOException e10) {
                throw new RawResourceDataSourceException(2000, null, e10);
            }
        }
        FileInputStream fileInputStream = this.f13717i;
        int i12 = C10134c0.f51354a;
        int i13 = fileInputStream.read(bArr, i10, i11);
        if (i13 == -1) {
            if (this.f13718j == -1) {
                return -1;
            }
            throw new RawResourceDataSourceException(2000, "End of stream reached having not read sufficient data.", new EOFException());
        }
        long j11 = this.f13718j;
        if (j11 != -1) {
            this.f13718j = j11 - ((long) i13);
        }
        m18376n(i13);
        return i13;
    }
}
