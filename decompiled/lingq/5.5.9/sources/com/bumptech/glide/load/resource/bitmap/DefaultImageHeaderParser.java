package com.bumptech.glide.load.resource.bitmap;

import ae.C0062b;
import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import p003a2.C0009a;
import p407u5.InterfaceC9451b;

/* JADX INFO: loaded from: classes.dex */
public final class DefaultImageHeaderParser implements ImageHeaderParser {

    /* JADX INFO: renamed from: a */
    public static final byte[] f10797a = "Exif\u0000\u0000".getBytes(Charset.forName("UTF-8"));

    /* JADX INFO: renamed from: b */
    public static final int[] f10798b = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    public interface Reader {

        public static final class EndOfFileException extends IOException {
            public EndOfFileException() {
                super("Unexpectedly reached end of a file");
            }
        }

        /* JADX INFO: renamed from: a */
        int mo6336a() throws IOException;

        /* JADX INFO: renamed from: b */
        int mo6337b(byte[] bArr, int i10) throws IOException;

        /* JADX INFO: renamed from: c */
        short mo6338c() throws IOException;

        long skip(long j10) throws IOException;
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser$a */
    public static final class C2124a implements Reader {

        /* JADX INFO: renamed from: a */
        public final ByteBuffer f10799a;

        public C2124a(ByteBuffer byteBuffer) {
            this.f10799a = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        /* JADX INFO: renamed from: a */
        public final int mo6336a() throws Reader.EndOfFileException {
            return (mo6338c() << 8) | mo6338c();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        /* JADX INFO: renamed from: b */
        public final int mo6337b(byte[] bArr, int i10) {
            ByteBuffer byteBuffer = this.f10799a;
            int iMin = Math.min(i10, byteBuffer.remaining());
            if (iMin == 0) {
                return -1;
            }
            byteBuffer.get(bArr, 0, iMin);
            return iMin;
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        /* JADX INFO: renamed from: c */
        public final short mo6338c() throws Reader.EndOfFileException {
            ByteBuffer byteBuffer = this.f10799a;
            if (byteBuffer.remaining() >= 1) {
                return (short) (byteBuffer.get() & 255);
            }
            throw new Reader.EndOfFileException();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public final long skip(long j10) {
            ByteBuffer byteBuffer = this.f10799a;
            int iMin = (int) Math.min(byteBuffer.remaining(), j10);
            byteBuffer.position(byteBuffer.position() + iMin);
            return iMin;
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser$b */
    public static final class C2125b {

        /* JADX INFO: renamed from: a */
        public final ByteBuffer f10800a;

        public C2125b(byte[] bArr, int i10) {
            this.f10800a = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).limit(i10);
        }

        /* JADX INFO: renamed from: a */
        public final short m6339a(int i10) {
            ByteBuffer byteBuffer = this.f10800a;
            if (byteBuffer.remaining() - i10 >= 2) {
                return byteBuffer.getShort(i10);
            }
            return (short) -1;
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser$c */
    public static final class C2126c implements Reader {

        /* JADX INFO: renamed from: a */
        public final InputStream f10801a;

        public C2126c(InputStream inputStream) {
            this.f10801a = inputStream;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        /* JADX INFO: renamed from: a */
        public final int mo6336a() throws IOException {
            return (mo6338c() << 8) | mo6338c();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        /* JADX INFO: renamed from: b */
        public final int mo6337b(byte[] bArr, int i10) throws IOException {
            int i11 = 0;
            int i12 = 0;
            while (i11 < i10 && (i12 = this.f10801a.read(bArr, i11, i10 - i11)) != -1) {
                i11 += i12;
            }
            if (i11 == 0 && i12 == -1) {
                throw new Reader.EndOfFileException();
            }
            return i11;
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        /* JADX INFO: renamed from: c */
        public final short mo6338c() throws IOException {
            int i10 = this.f10801a.read();
            if (i10 != -1) {
                return (short) i10;
            }
            throw new Reader.EndOfFileException();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public final long skip(long j10) throws IOException {
            if (j10 < 0) {
                return 0L;
            }
            long j11 = j10;
            while (j11 > 0) {
                InputStream inputStream = this.f10801a;
                long jSkip = inputStream.skip(j11);
                if (jSkip > 0) {
                    j11 -= jSkip;
                } else {
                    if (inputStream.read() == -1) {
                        break;
                    }
                    j11--;
                }
            }
            return j10 - j11;
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x002a A[Catch: EndOfFileException -> 0x0073, TRY_ENTER, TryCatch #0 {EndOfFileException -> 0x0073, blocks: (B:3:0x0004, B:16:0x002a, B:18:0x0030, B:20:0x0042, B:22:0x0048, B:24:0x004f, B:26:0x0057, B:28:0x0068, B:31:0x006e, B:32:0x0072, B:27:0x0062), top: B:34:0x0004, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:18:0x0030 A[Catch: EndOfFileException -> 0x0073, TryCatch #0 {EndOfFileException -> 0x0073, blocks: (B:3:0x0004, B:16:0x002a, B:18:0x0030, B:20:0x0042, B:22:0x0048, B:24:0x004f, B:26:0x0057, B:28:0x0068, B:31:0x006e, B:32:0x0072, B:27:0x0062), top: B:34:0x0004, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:20:0x0042 A[Catch: EndOfFileException -> 0x0073, TryCatch #0 {EndOfFileException -> 0x0073, blocks: (B:3:0x0004, B:16:0x002a, B:18:0x0030, B:20:0x0042, B:22:0x0048, B:24:0x004f, B:26:0x0057, B:28:0x0068, B:31:0x006e, B:32:0x0072, B:27:0x0062), top: B:34:0x0004, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:22:0x0048 A[Catch: EndOfFileException -> 0x0073, TryCatch #0 {EndOfFileException -> 0x0073, blocks: (B:3:0x0004, B:16:0x002a, B:18:0x0030, B:20:0x0042, B:22:0x0048, B:24:0x004f, B:26:0x0057, B:28:0x0068, B:31:0x006e, B:32:0x0072, B:27:0x0062), top: B:34:0x0004, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:24:0x004f A[Catch: EndOfFileException -> 0x0073, TryCatch #0 {EndOfFileException -> 0x0073, blocks: (B:3:0x0004, B:16:0x002a, B:18:0x0030, B:20:0x0042, B:22:0x0048, B:24:0x004f, B:26:0x0057, B:28:0x0068, B:31:0x006e, B:32:0x0072, B:27:0x0062), top: B:34:0x0004, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:26:0x0057 A[Catch: EndOfFileException -> 0x0073, TRY_LEAVE, TryCatch #0 {EndOfFileException -> 0x0073, blocks: (B:3:0x0004, B:16:0x002a, B:18:0x0030, B:20:0x0042, B:22:0x0048, B:24:0x004f, B:26:0x0057, B:28:0x0068, B:31:0x006e, B:32:0x0072, B:27:0x0062), top: B:34:0x0004, inners: #1 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:18:0x0030, please report this as an issue */
    /* JADX INFO: renamed from: e */
    public static int m6332e(Reader reader, InterfaceC9451b interfaceC9451b) throws IOException {
        boolean z10;
        int iM6334g;
        byte[] bArr;
        try {
            int iMo6336a = reader.mo6336a();
            if ((iMo6336a & 65496) != 65496 && iMo6336a != 19789) {
                if (iMo6336a != 18761) {
                    z10 = false;
                }
                if (!z10) {
                    if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                        Log.d("DfltImageHeaderParser", "Parser doesn't handle magic number: " + iMo6336a);
                    }
                    return -1;
                }
                iM6334g = m6334g(reader);
                if (iM6334g == -1) {
                    if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                        Log.d("DfltImageHeaderParser", "Failed to parse exif segment length, or exif segment not found");
                    }
                    return -1;
                }
                bArr = (byte[]) interfaceC9451b.mo17852d(iM6334g, byte[].class);
                try {
                    int iM6335h = m6335h(reader, bArr, iM6334g);
                    interfaceC9451b.mo17851c(bArr);
                    return iM6335h;
                } catch (Throwable th2) {
                    interfaceC9451b.mo17851c(bArr);
                    throw th2;
                }
            }
            z10 = true;
            if (!z10) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Parser doesn't handle magic number: " + iMo6336a);
                }
                return -1;
            }
            iM6334g = m6334g(reader);
            if (iM6334g == -1) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Failed to parse exif segment length, or exif segment not found");
                }
                return -1;
            }
            bArr = (byte[]) interfaceC9451b.mo17852d(iM6334g, byte[].class);
            int iM6335h2 = m6335h(reader, bArr, iM6334g);
            interfaceC9451b.mo17851c(bArr);
            return iM6335h2;
        } catch (Reader.EndOfFileException unused) {
            return -1;
        }
    }

    /* JADX INFO: renamed from: f */
    public static ImageHeaderParser.ImageType m6333f(Reader reader) throws IOException {
        try {
            int iMo6336a = reader.mo6336a();
            if (iMo6336a == 65496) {
                return ImageHeaderParser.ImageType.JPEG;
            }
            int iMo6338c = (iMo6336a << 8) | reader.mo6338c();
            if (iMo6338c == 4671814) {
                return ImageHeaderParser.ImageType.GIF;
            }
            int iMo6338c2 = (iMo6338c << 8) | reader.mo6338c();
            if (iMo6338c2 == -1991225785) {
                reader.skip(21L);
                try {
                    return reader.mo6338c() >= 3 ? ImageHeaderParser.ImageType.PNG_A : ImageHeaderParser.ImageType.PNG;
                } catch (Reader.EndOfFileException unused) {
                    return ImageHeaderParser.ImageType.PNG;
                }
            }
            if (iMo6338c2 == 1380533830) {
                reader.skip(4L);
                if (((reader.mo6336a() << 16) | reader.mo6336a()) != 1464156752) {
                    return ImageHeaderParser.ImageType.UNKNOWN;
                }
                int iMo6336a2 = (reader.mo6336a() << 16) | reader.mo6336a();
                if ((iMo6336a2 & (-256)) != 1448097792) {
                    return ImageHeaderParser.ImageType.UNKNOWN;
                }
                int i10 = iMo6336a2 & 255;
                if (i10 != 88) {
                    if (i10 != 76) {
                        return ImageHeaderParser.ImageType.WEBP;
                    }
                    reader.skip(4L);
                    return (reader.mo6338c() & 8) != 0 ? ImageHeaderParser.ImageType.WEBP_A : ImageHeaderParser.ImageType.WEBP;
                }
                reader.skip(4L);
                short sMo6338c = reader.mo6338c();
                if ((sMo6338c & 2) != 0) {
                    return ImageHeaderParser.ImageType.ANIMATED_WEBP;
                }
                return (sMo6338c & 16) != 0 ? ImageHeaderParser.ImageType.WEBP_A : ImageHeaderParser.ImageType.WEBP;
            }
            if (((reader.mo6336a() << 16) | reader.mo6336a()) != 1718909296) {
                return ImageHeaderParser.ImageType.UNKNOWN;
            }
            int iMo6336a3 = (reader.mo6336a() << 16) | reader.mo6336a();
            if (iMo6336a3 == 1635150195) {
                return ImageHeaderParser.ImageType.ANIMATED_AVIF;
            }
            int i11 = 0;
            boolean z10 = iMo6336a3 == 1635150182;
            reader.skip(4L);
            int i12 = iMo6338c2 - 16;
            if (i12 % 4 == 0) {
                while (i11 < 5 && i12 > 0) {
                    int iMo6336a4 = (reader.mo6336a() << 16) | reader.mo6336a();
                    if (iMo6336a4 == 1635150195) {
                        return ImageHeaderParser.ImageType.ANIMATED_AVIF;
                    }
                    if (iMo6336a4 == 1635150182) {
                        z10 = true;
                    }
                    i11++;
                    i12 -= 4;
                }
            }
            return z10 ? ImageHeaderParser.ImageType.AVIF : ImageHeaderParser.ImageType.UNKNOWN;
        } catch (Reader.EndOfFileException unused2) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
    }

    /* JADX INFO: renamed from: g */
    public static int m6334g(Reader reader) throws IOException {
        short sMo6338c;
        int iMo6336a;
        long j10;
        long jSkip;
        do {
            short sMo6338c2 = reader.mo6338c();
            if (sMo6338c2 != 255) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Unknown segmentId=" + ((int) sMo6338c2));
                }
                return -1;
            }
            sMo6338c = reader.mo6338c();
            if (sMo6338c == 218) {
                return -1;
            }
            if (sMo6338c == 217) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Found MARKER_EOI in exif segment");
                }
                return -1;
            }
            iMo6336a = reader.mo6336a() - 2;
            if (sMo6338c == 225) {
                return iMo6336a;
            }
            j10 = iMo6336a;
            jSkip = reader.skip(j10);
        } while (jSkip == j10);
        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
            StringBuilder sbM25n = C0009a.m25n("Unable to skip enough data, type: ", sMo6338c, ", wanted to skip: ", iMo6336a, ", but actually skipped: ");
            sbM25n.append(jSkip);
            Log.d("DfltImageHeaderParser", sbM25n.toString());
        }
        return -1;
    }

    /* JADX INFO: renamed from: h */
    public static int m6335h(Reader reader, byte[] bArr, int i10) throws IOException {
        ByteOrder byteOrder;
        int iMo6337b = reader.mo6337b(bArr, i10);
        if (iMo6337b != i10) {
            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Unable to read exif segment data, length: " + i10 + ", actually read: " + iMo6337b);
            }
            return -1;
        }
        short s10 = 1;
        byte[] bArr2 = f10797a;
        boolean z10 = bArr != null && i10 > bArr2.length;
        if (z10) {
            for (int i11 = 0; i11 < bArr2.length; i11++) {
                if (bArr[i11] != bArr2[i11]) {
                    z10 = false;
                    break;
                }
            }
        }
        if (!z10) {
            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Missing jpeg exif preamble");
            }
            return -1;
        }
        C2125b c2125b = new C2125b(bArr, i10);
        short sM6339a = c2125b.m6339a(6);
        if (sM6339a != 18761) {
            if (sM6339a != 19789 && Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Unknown endianness = " + ((int) sM6339a));
            }
            byteOrder = ByteOrder.BIG_ENDIAN;
        } else {
            byteOrder = ByteOrder.LITTLE_ENDIAN;
        }
        ByteBuffer byteBuffer = c2125b.f10800a;
        byteBuffer.order(byteOrder);
        int i12 = (byteBuffer.remaining() - 10 >= 4 ? byteBuffer.getInt(10) : -1) + 6;
        short sM6339a2 = c2125b.m6339a(i12);
        int i13 = 0;
        while (i13 < sM6339a2) {
            int i14 = (i13 * 12) + i12 + 2;
            short sM6339a3 = c2125b.m6339a(i14);
            if (sM6339a3 == 274) {
                short sM6339a4 = c2125b.m6339a(i14 + 2);
                if (sM6339a4 >= s10 && sM6339a4 <= 12) {
                    int i15 = i14 + 4;
                    if (byteBuffer.remaining() - i15 < 4) {
                        s10 = 0;
                    }
                    int i16 = s10 != 0 ? byteBuffer.getInt(i15) : -1;
                    if (i16 >= 0) {
                        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                            StringBuilder sbM25n = C0009a.m25n("Got tagIndex=", i13, " tagType=", sM6339a3, " formatCode=");
                            sbM25n.append((int) sM6339a4);
                            sbM25n.append(" componentCount=");
                            sbM25n.append(i16);
                            Log.d("DfltImageHeaderParser", sbM25n.toString());
                        }
                        int i17 = i16 + f10798b[sM6339a4];
                        if (i17 <= 4) {
                            int i18 = i14 + 8;
                            if (i18 >= 0 && i18 <= byteBuffer.remaining()) {
                                if (i17 >= 0 && i17 + i18 <= byteBuffer.remaining()) {
                                    return c2125b.m6339a(i18);
                                }
                                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                    Log.d("DfltImageHeaderParser", "Illegal number of bytes for TI tag data tagType=" + ((int) sM6339a3));
                                }
                            } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                Log.d("DfltImageHeaderParser", "Illegal tagValueOffset=" + i18 + " tagType=" + ((int) sM6339a3));
                            }
                        } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                            Log.d("DfltImageHeaderParser", "Got byte count > 4, not orientation, continuing, formatCode=" + ((int) sM6339a4));
                        }
                    } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                        Log.d("DfltImageHeaderParser", "Negative tiff component count");
                    }
                } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Got invalid format code = " + ((int) sM6339a4));
                }
            }
            i13++;
            s10 = 1;
        }
        return -1;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    /* JADX INFO: renamed from: a */
    public final ImageHeaderParser.ImageType mo165a(ByteBuffer byteBuffer) throws IOException {
        C0062b.m345f0(byteBuffer);
        return m6333f(new C2124a(byteBuffer));
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    /* JADX INFO: renamed from: b */
    public final ImageHeaderParser.ImageType mo166b(InputStream inputStream) throws IOException {
        C0062b.m345f0(inputStream);
        return m6333f(new C2126c(inputStream));
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    /* JADX INFO: renamed from: c */
    public final int mo167c(InputStream inputStream, InterfaceC9451b interfaceC9451b) throws IOException {
        C0062b.m345f0(inputStream);
        C2126c c2126c = new C2126c(inputStream);
        C0062b.m345f0(interfaceC9451b);
        return m6332e(c2126c, interfaceC9451b);
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    /* JADX INFO: renamed from: d */
    public final int mo168d(ByteBuffer byteBuffer, InterfaceC9451b interfaceC9451b) throws IOException {
        C0062b.m345f0(byteBuffer);
        C2124a c2124a = new C2124a(byteBuffer);
        C0062b.m345f0(interfaceC9451b);
        return m6332e(c2124a, interfaceC9451b);
    }
}
