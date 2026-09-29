package p287o3;

import android.content.res.AssetManager;
import android.media.MediaDataSource;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.support.v4.media.C0141b;
import android.support.v4.media.session.C0166e;
import android.system.OsConstants;
import android.util.Log;
import androidx.datastore.preferences.PreferencesProto$Value;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.regex.Pattern;
import java.util.zip.CRC32;

/* JADX INFO: renamed from: o3.a */
/* JADX INFO: loaded from: classes.dex */
public final class C7913a {

    /* JADX INFO: renamed from: D */
    public static final String[] f43086D;

    /* JADX INFO: renamed from: E */
    public static final int[] f43087E;

    /* JADX INFO: renamed from: F */
    public static final byte[] f43088F;

    /* JADX INFO: renamed from: G */
    public static final d f43089G;

    /* JADX INFO: renamed from: H */
    public static final d[][] f43090H;

    /* JADX INFO: renamed from: I */
    public static final d[] f43091I;

    /* JADX INFO: renamed from: J */
    public static final HashMap<Integer, d>[] f43092J;

    /* JADX INFO: renamed from: K */
    public static final HashMap<String, d>[] f43093K;

    /* JADX INFO: renamed from: L */
    public static final HashSet<String> f43094L;

    /* JADX INFO: renamed from: M */
    public static final HashMap<Integer, Integer> f43095M;

    /* JADX INFO: renamed from: N */
    public static final Charset f43096N;

    /* JADX INFO: renamed from: O */
    public static final byte[] f43097O;

    /* JADX INFO: renamed from: P */
    public static final byte[] f43098P;

    /* JADX INFO: renamed from: a */
    public final FileDescriptor f43114a;

    /* JADX INFO: renamed from: b */
    public final AssetManager.AssetInputStream f43115b;

    /* JADX INFO: renamed from: c */
    public int f43116c;

    /* JADX INFO: renamed from: d */
    public final HashMap<String, c>[] f43117d;

    /* JADX INFO: renamed from: e */
    public final HashSet f43118e;

    /* JADX INFO: renamed from: f */
    public ByteOrder f43119f;

    /* JADX INFO: renamed from: g */
    public boolean f43120g;

    /* JADX INFO: renamed from: h */
    public int f43121h;

    /* JADX INFO: renamed from: i */
    public int f43122i;

    /* JADX INFO: renamed from: j */
    public int f43123j;

    /* JADX INFO: renamed from: k */
    public int f43124k;

    /* JADX INFO: renamed from: l */
    public static final boolean f43099l = Log.isLoggable("ExifInterface", 3);

    /* JADX INFO: renamed from: m */
    public static final List<Integer> f43100m = Arrays.asList(1, 6, 3, 8);

    /* JADX INFO: renamed from: n */
    public static final List<Integer> f43101n = Arrays.asList(2, 7, 4, 5);

    /* JADX INFO: renamed from: o */
    public static final int[] f43102o = {8, 8, 8};

    /* JADX INFO: renamed from: p */
    public static final int[] f43103p = {8};

    /* JADX INFO: renamed from: q */
    public static final byte[] f43104q = {-1, -40, -1};

    /* JADX INFO: renamed from: r */
    public static final byte[] f43105r = {102, 116, 121, 112};

    /* JADX INFO: renamed from: s */
    public static final byte[] f43106s = {109, 105, 102, 49};

    /* JADX INFO: renamed from: t */
    public static final byte[] f43107t = {104, 101, 105, 99};

    /* JADX INFO: renamed from: u */
    public static final byte[] f43108u = {79, 76, 89, 77, 80, 0};

    /* JADX INFO: renamed from: v */
    public static final byte[] f43109v = {79, 76, 89, 77, 80, 85, 83, 0, 73, 73};

    /* JADX INFO: renamed from: w */
    public static final byte[] f43110w = {-119, 80, 78, 71, 13, 10, 26, 10};

    /* JADX INFO: renamed from: x */
    public static final byte[] f43111x = {101, 88, 73, 102};

    /* JADX INFO: renamed from: y */
    public static final byte[] f43112y = {73, 72, 68, 82};

    /* JADX INFO: renamed from: z */
    public static final byte[] f43113z = {73, 69, 78, 68};

    /* JADX INFO: renamed from: A */
    public static final byte[] f43083A = {82, 73, 70, 70};

    /* JADX INFO: renamed from: B */
    public static final byte[] f43084B = {87, 69, 66, 80};

    /* JADX INFO: renamed from: C */
    public static final byte[] f43085C = {69, 88, 73, 70};

    /* JADX INFO: renamed from: o3.a$a */
    public class a extends MediaDataSource {

        /* JADX INFO: renamed from: a */
        public long f43125a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ f f43126b;

        public a(f fVar) {
            this.f43126b = fVar;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
        }

        @Override // android.media.MediaDataSource
        public final long getSize() throws IOException {
            return -1L;
        }

        @Override // android.media.MediaDataSource
        public final int readAt(long j10, byte[] bArr, int i10, int i11) throws IOException {
            if (i11 == 0) {
                return 0;
            }
            if (j10 < 0) {
                return -1;
            }
            try {
                long j11 = this.f43125a;
                f fVar = this.f43126b;
                if (j11 != j10) {
                    if (j11 >= 0 && j10 >= j11 + ((long) fVar.available())) {
                        return -1;
                    }
                    fVar.m15727b(j10);
                    this.f43125a = j10;
                }
                if (i11 > fVar.available()) {
                    i11 = fVar.available();
                }
                int i12 = fVar.read(bArr, i10, i11);
                if (i12 >= 0) {
                    this.f43125a += (long) i12;
                    return i12;
                }
            } catch (IOException unused) {
            }
            this.f43125a = -1L;
            return -1;
        }
    }

    /* JADX INFO: renamed from: o3.a$b */
    public static class b extends InputStream implements DataInput {

        /* JADX INFO: renamed from: e */
        public static final ByteOrder f43127e = ByteOrder.LITTLE_ENDIAN;

        /* JADX INFO: renamed from: f */
        public static final ByteOrder f43128f = ByteOrder.BIG_ENDIAN;

        /* JADX INFO: renamed from: a */
        public final DataInputStream f43129a;

        /* JADX INFO: renamed from: b */
        public ByteOrder f43130b;

        /* JADX INFO: renamed from: c */
        public int f43131c;

        /* JADX INFO: renamed from: d */
        public byte[] f43132d;

        public b(InputStream inputStream) throws IOException {
            this(inputStream, ByteOrder.BIG_ENDIAN);
        }

        public b(InputStream inputStream, ByteOrder byteOrder) throws IOException {
            this.f43130b = ByteOrder.BIG_ENDIAN;
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            this.f43129a = dataInputStream;
            dataInputStream.mark(0);
            this.f43131c = 0;
            this.f43130b = byteOrder;
        }

        public b(byte[] bArr) throws IOException {
            this(new ByteArrayInputStream(bArr), ByteOrder.BIG_ENDIAN);
        }

        /* JADX INFO: renamed from: a */
        public final void m15718a(int i10) throws IOException {
            int i11 = 0;
            while (i11 < i10) {
                DataInputStream dataInputStream = this.f43129a;
                int i12 = i10 - i11;
                int iSkip = (int) dataInputStream.skip(i12);
                if (iSkip <= 0) {
                    if (this.f43132d == null) {
                        this.f43132d = new byte[8192];
                    }
                    iSkip = dataInputStream.read(this.f43132d, 0, Math.min(8192, i12));
                    if (iSkip == -1) {
                        throw new EOFException(C0166e.m762h("Reached EOF while skipping ", i10, " bytes."));
                    }
                }
                i11 += iSkip;
            }
            this.f43131c += i11;
        }

        @Override // java.io.InputStream
        public final int available() throws IOException {
            return this.f43129a.available();
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // java.io.InputStream
        public final void mark(int i10) {
            throw new UnsupportedOperationException("Mark is currently unsupported");
        }

        @Override // java.io.InputStream
        public final int read() throws IOException {
            this.f43131c++;
            return this.f43129a.read();
        }

        @Override // java.io.InputStream
        public final int read(byte[] bArr, int i10, int i11) throws IOException {
            int i12 = this.f43129a.read(bArr, i10, i11);
            this.f43131c += i12;
            return i12;
        }

        @Override // java.io.DataInput
        public final boolean readBoolean() throws IOException {
            this.f43131c++;
            return this.f43129a.readBoolean();
        }

        @Override // java.io.DataInput
        public final byte readByte() throws IOException {
            this.f43131c++;
            int i10 = this.f43129a.read();
            if (i10 >= 0) {
                return (byte) i10;
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public final char readChar() throws IOException {
            this.f43131c += 2;
            return this.f43129a.readChar();
        }

        @Override // java.io.DataInput
        public final double readDouble() throws IOException {
            return Double.longBitsToDouble(readLong());
        }

        @Override // java.io.DataInput
        public final float readFloat() throws IOException {
            return Float.intBitsToFloat(readInt());
        }

        @Override // java.io.DataInput
        public final void readFully(byte[] bArr) throws IOException {
            this.f43131c += bArr.length;
            this.f43129a.readFully(bArr);
        }

        @Override // java.io.DataInput
        public final void readFully(byte[] bArr, int i10, int i11) throws IOException {
            this.f43131c += i11;
            this.f43129a.readFully(bArr, i10, i11);
        }

        @Override // java.io.DataInput
        public final int readInt() throws IOException {
            this.f43131c += 4;
            DataInputStream dataInputStream = this.f43129a;
            int i10 = dataInputStream.read();
            int i11 = dataInputStream.read();
            int i12 = dataInputStream.read();
            int i13 = dataInputStream.read();
            if ((i10 | i11 | i12 | i13) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f43130b;
            if (byteOrder == f43127e) {
                return (i13 << 24) + (i12 << 16) + (i11 << 8) + i10;
            }
            if (byteOrder == f43128f) {
                return (i10 << 24) + (i11 << 16) + (i12 << 8) + i13;
            }
            throw new IOException("Invalid byte order: " + this.f43130b);
        }

        @Override // java.io.DataInput
        public final String readLine() throws IOException {
            Log.d("ExifInterface", "Currently unsupported");
            return null;
        }

        @Override // java.io.DataInput
        public final long readLong() throws IOException {
            this.f43131c += 8;
            DataInputStream dataInputStream = this.f43129a;
            int i10 = dataInputStream.read();
            int i11 = dataInputStream.read();
            int i12 = dataInputStream.read();
            int i13 = dataInputStream.read();
            int i14 = dataInputStream.read();
            int i15 = dataInputStream.read();
            int i16 = dataInputStream.read();
            int i17 = dataInputStream.read();
            if ((i10 | i11 | i12 | i13 | i14 | i15 | i16 | i17) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f43130b;
            if (byteOrder == f43127e) {
                return (((long) i17) << 56) + (((long) i16) << 48) + (((long) i15) << 40) + (((long) i14) << 32) + (((long) i13) << 24) + (((long) i12) << 16) + (((long) i11) << 8) + ((long) i10);
            }
            if (byteOrder == f43128f) {
                return (((long) i10) << 56) + (((long) i11) << 48) + (((long) i12) << 40) + (((long) i13) << 32) + (((long) i14) << 24) + (((long) i15) << 16) + (((long) i16) << 8) + ((long) i17);
            }
            throw new IOException("Invalid byte order: " + this.f43130b);
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // java.io.DataInput
        public final short readShort() throws IOException {
            this.f43131c += 2;
            DataInputStream dataInputStream = this.f43129a;
            int i10 = dataInputStream.read();
            int i11 = dataInputStream.read();
            if ((i10 | i11) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f43130b;
            if (byteOrder == f43127e) {
                return (short) ((i11 << 8) + i10);
            }
            if (byteOrder == f43128f) {
                return (short) ((i10 << 8) + i11);
            }
            throw new IOException("Invalid byte order: " + this.f43130b);
        }

        @Override // java.io.DataInput
        public final String readUTF() throws IOException {
            this.f43131c += 2;
            return this.f43129a.readUTF();
        }

        @Override // java.io.DataInput
        public final int readUnsignedByte() throws IOException {
            this.f43131c++;
            return this.f43129a.readUnsignedByte();
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // java.io.DataInput
        public final int readUnsignedShort() throws IOException {
            this.f43131c += 2;
            DataInputStream dataInputStream = this.f43129a;
            int i10 = dataInputStream.read();
            int i11 = dataInputStream.read();
            if ((i10 | i11) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f43130b;
            if (byteOrder == f43127e) {
                return (i11 << 8) + i10;
            }
            if (byteOrder == f43128f) {
                return (i10 << 8) + i11;
            }
            throw new IOException("Invalid byte order: " + this.f43130b);
        }

        @Override // java.io.InputStream
        public final void reset() {
            throw new UnsupportedOperationException("Reset is currently unsupported");
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // java.io.DataInput
        public final int skipBytes(int i10) throws IOException {
            throw new UnsupportedOperationException("skipBytes is currently unsupported");
        }
    }

    /* JADX INFO: renamed from: o3.a$c */
    public static class c {

        /* JADX INFO: renamed from: a */
        public final int f43133a;

        /* JADX INFO: renamed from: b */
        public final int f43134b;

        /* JADX INFO: renamed from: c */
        public final long f43135c;

        /* JADX INFO: renamed from: d */
        public final byte[] f43136d;

        public c(long j10, byte[] bArr, int i10, int i11) {
            this.f43133a = i10;
            this.f43134b = i11;
            this.f43135c = j10;
            this.f43136d = bArr;
        }

        public c(byte[] bArr, int i10, int i11) {
            this(-1L, bArr, i10, i11);
        }

        /* JADX INFO: renamed from: a */
        public static c m15719a(String str) {
            byte[] bytes = str.concat("\u0000").getBytes(C7913a.f43096N);
            return new c(bytes, 2, bytes.length);
        }

        /* JADX INFO: renamed from: b */
        public static c m15720b(long j10, ByteOrder byteOrder) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[C7913a.f43087E[4] * 1]);
            byteBufferWrap.order(byteOrder);
            byteBufferWrap.putInt((int) new long[]{j10}[0]);
            return new c(byteBufferWrap.array(), 4, 1);
        }

        /* JADX INFO: renamed from: c */
        public static c m15721c(e eVar, ByteOrder byteOrder) {
            e[] eVarArr = {eVar};
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[C7913a.f43087E[5] * 1]);
            byteBufferWrap.order(byteOrder);
            e eVar2 = eVarArr[0];
            byteBufferWrap.putInt((int) eVar2.f43141a);
            byteBufferWrap.putInt((int) eVar2.f43142b);
            return new c(byteBufferWrap.array(), 5, 1);
        }

        /* JADX INFO: renamed from: d */
        public static c m15722d(int i10, ByteOrder byteOrder) {
            int[] iArr = {i10};
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[C7913a.f43087E[3] * 1]);
            byteBufferWrap.order(byteOrder);
            byteBufferWrap.putShort((short) iArr[0]);
            return new c(byteBufferWrap.array(), 3, 1);
        }

        /* JADX WARN: Unreachable blocks removed: 3, instructions: 3 */
        /* JADX INFO: renamed from: e */
        public final double m15723e(ByteOrder byteOrder) throws Throwable {
            Object objM15726h = m15726h(byteOrder);
            if (objM15726h == null) {
                throw new NumberFormatException("NULL can't be converted to a double value");
            }
            if (objM15726h instanceof String) {
                return Double.parseDouble((String) objM15726h);
            }
            if (objM15726h instanceof long[]) {
                long[] jArr = (long[]) objM15726h;
                if (jArr.length == 1) {
                    return jArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (objM15726h instanceof int[]) {
                int[] iArr = (int[]) objM15726h;
                if (iArr.length == 1) {
                    return iArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (objM15726h instanceof double[]) {
                double[] dArr = (double[]) objM15726h;
                if (dArr.length == 1) {
                    return dArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (!(objM15726h instanceof e[])) {
                throw new NumberFormatException("Couldn't find a double value");
            }
            e[] eVarArr = (e[]) objM15726h;
            if (eVarArr.length != 1) {
                throw new NumberFormatException("There are more than one component");
            }
            e eVar = eVarArr[0];
            return eVar.f43141a / eVar.f43142b;
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        /* JADX INFO: renamed from: f */
        public final int m15724f(ByteOrder byteOrder) throws Throwable {
            Object objM15726h = m15726h(byteOrder);
            if (objM15726h == null) {
                throw new NumberFormatException("NULL can't be converted to a integer value");
            }
            if (objM15726h instanceof String) {
                return Integer.parseInt((String) objM15726h);
            }
            if (objM15726h instanceof long[]) {
                long[] jArr = (long[]) objM15726h;
                if (jArr.length == 1) {
                    return (int) jArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (!(objM15726h instanceof int[])) {
                throw new NumberFormatException("Couldn't find a integer value");
            }
            int[] iArr = (int[]) objM15726h;
            if (iArr.length == 1) {
                return iArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }

        /* JADX INFO: renamed from: g */
        public final String m15725g(ByteOrder byteOrder) throws Throwable {
            Object objM15726h = m15726h(byteOrder);
            if (objM15726h == null) {
                return null;
            }
            if (objM15726h instanceof String) {
                return (String) objM15726h;
            }
            StringBuilder sb2 = new StringBuilder();
            int i10 = 0;
            if (objM15726h instanceof long[]) {
                long[] jArr = (long[]) objM15726h;
                while (true) {
                    while (i10 < jArr.length) {
                        sb2.append(jArr[i10]);
                        i10++;
                        if (i10 != jArr.length) {
                            sb2.append(",");
                        }
                    }
                    return sb2.toString();
                }
            }
            if (objM15726h instanceof int[]) {
                int[] iArr = (int[]) objM15726h;
                while (i10 < iArr.length) {
                    sb2.append(iArr[i10]);
                    i10++;
                    if (i10 != iArr.length) {
                        sb2.append(",");
                    }
                }
                return sb2.toString();
            }
            if (objM15726h instanceof double[]) {
                double[] dArr = (double[]) objM15726h;
                while (i10 < dArr.length) {
                    sb2.append(dArr[i10]);
                    i10++;
                    if (i10 != dArr.length) {
                        sb2.append(",");
                    }
                }
                return sb2.toString();
            }
            if (!(objM15726h instanceof e[])) {
                return null;
            }
            e[] eVarArr = (e[]) objM15726h;
            while (i10 < eVarArr.length) {
                sb2.append(eVarArr[i10].f43141a);
                sb2.append('/');
                sb2.append(eVarArr[i10].f43142b);
                i10++;
                if (i10 != eVarArr.length) {
                    sb2.append(",");
                }
            }
            return sb2.toString();
        }

        /* JADX WARN: Code duplicated, block: B:162:0x0185 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Not initialized variable reg: 4, insn: 0x016d: MOVE (r3 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]), block:B:132:0x016d */
        /* JADX WARN: Type inference failed for: r15v23, types: [int[], java.io.Serializable] */
        /* JADX WARN: Type inference failed for: r15v24, types: [java.io.Serializable, long[]] */
        /* JADX WARN: Type inference failed for: r15v25, types: [java.io.Serializable, o3.a$e[]] */
        /* JADX WARN: Type inference failed for: r15v26, types: [int[], java.io.Serializable] */
        /* JADX WARN: Type inference failed for: r15v27, types: [int[], java.io.Serializable] */
        /* JADX WARN: Type inference failed for: r15v28, types: [java.io.Serializable, o3.a$e[]] */
        /* JADX WARN: Type inference failed for: r15v29, types: [double[], java.io.Serializable] */
        /* JADX WARN: Type inference failed for: r15v30, types: [double[], java.io.Serializable] */
        /* JADX INFO: renamed from: h */
        public final Serializable m15726h(ByteOrder byteOrder) throws Throwable {
            b bVar;
            InputStream inputStream;
            byte b10;
            byte[] bArr;
            byte[] bArr2 = this.f43136d;
            InputStream inputStream2 = null;
            try {
                try {
                    bVar = new b(bArr2);
                    try {
                        bVar.f43130b = byteOrder;
                        int i10 = this.f43133a;
                        boolean z10 = true;
                        int length = 0;
                        int i11 = this.f43134b;
                        switch (i10) {
                            case 1:
                            case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                                if (bArr2.length != 1 || (b10 = bArr2[0]) < 0 || b10 > 1) {
                                    String str = new String(bArr2, C7913a.f43096N);
                                    try {
                                        bVar.close();
                                        break;
                                    } catch (IOException e10) {
                                        Log.e("ExifInterface", "IOException occurred while closing InputStream", e10);
                                    }
                                    return str;
                                }
                                String str2 = new String(new char[]{(char) (b10 + 48)});
                                try {
                                    bVar.close();
                                    break;
                                } catch (IOException e11) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e11);
                                }
                                return str2;
                            case 2:
                            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                                if (i11 >= C7913a.f43088F.length) {
                                    int i12 = 0;
                                    while (true) {
                                        bArr = C7913a.f43088F;
                                        if (i12 < bArr.length) {
                                            if (bArr2[i12] != bArr[i12]) {
                                                z10 = false;
                                            } else {
                                                i12++;
                                            }
                                        }
                                    }
                                    if (z10) {
                                        length = bArr.length;
                                    }
                                }
                                StringBuilder sb2 = new StringBuilder();
                                try {
                                    while (length < i11) {
                                        byte b11 = bArr2[length];
                                        if (b11 == 0) {
                                            String string = sb2.toString();
                                            bVar.close();
                                            return string;
                                        }
                                        if (b11 >= 32) {
                                            sb2.append((char) b11);
                                        } else {
                                            sb2.append('?');
                                        }
                                        length++;
                                    }
                                    bVar.close();
                                    break;
                                } catch (IOException e12) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e12);
                                }
                                String string2 = sb2.toString();
                                return string2;
                            case 3:
                                ?? r15 = new int[i11];
                                while (length < i11) {
                                    r15[length] = bVar.readUnsignedShort();
                                    length++;
                                }
                                try {
                                    bVar.close();
                                    break;
                                } catch (IOException e13) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e13);
                                }
                                return r15;
                            case 4:
                                ?? r16 = new long[i11];
                                while (length < i11) {
                                    r16[length] = ((long) bVar.readInt()) & 4294967295L;
                                    length++;
                                }
                                try {
                                    bVar.close();
                                    break;
                                } catch (IOException e14) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e14);
                                }
                                return r16;
                            case 5:
                                ?? r17 = new e[i11];
                                while (length < i11) {
                                    r17[length] = new e(((long) bVar.readInt()) & 4294967295L, ((long) bVar.readInt()) & 4294967295L);
                                    length++;
                                }
                                try {
                                    bVar.close();
                                    break;
                                } catch (IOException e15) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e15);
                                }
                                return r17;
                            case 8:
                                ?? r18 = new int[i11];
                                while (length < i11) {
                                    r18[length] = bVar.readShort();
                                    length++;
                                }
                                try {
                                    bVar.close();
                                    break;
                                } catch (IOException e16) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e16);
                                }
                                return r18;
                            case 9:
                                ?? r19 = new int[i11];
                                while (length < i11) {
                                    r19[length] = bVar.readInt();
                                    length++;
                                }
                                try {
                                    bVar.close();
                                    break;
                                } catch (IOException e17) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e17);
                                }
                                return r19;
                            case 10:
                                ?? r110 = new e[i11];
                                while (length < i11) {
                                    r110[length] = new e(bVar.readInt(), bVar.readInt());
                                    length++;
                                }
                                try {
                                    bVar.close();
                                    break;
                                } catch (IOException e18) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e18);
                                }
                                return r110;
                            case 11:
                                ?? r111 = new double[i11];
                                while (length < i11) {
                                    r111[length] = bVar.readFloat();
                                    length++;
                                }
                                try {
                                    bVar.close();
                                    break;
                                } catch (IOException e19) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e19);
                                }
                                return r111;
                            case 12:
                                ?? r112 = new double[i11];
                                while (length < i11) {
                                    r112[length] = bVar.readDouble();
                                    length++;
                                }
                                try {
                                    bVar.close();
                                    break;
                                } catch (IOException e20) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e20);
                                }
                                return r112;
                            default:
                                try {
                                    bVar.close();
                                    break;
                                } catch (IOException e21) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e21);
                                }
                                return null;
                        }
                    } catch (IOException e22) {
                        e = e22;
                        Log.w("ExifInterface", "IOException occurred during reading a value", e);
                        if (bVar != null) {
                            try {
                                bVar.close();
                            } catch (IOException e23) {
                                Log.e("ExifInterface", "IOException occurred while closing InputStream", e23);
                            }
                        }
                        return null;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    inputStream2 = inputStream;
                    if (inputStream2 != null) {
                        try {
                            inputStream2.close();
                        } catch (IOException e24) {
                            Log.e("ExifInterface", "IOException occurred while closing InputStream", e24);
                        }
                    }
                    throw th;
                }
            } catch (IOException e25) {
                e = e25;
                bVar = null;
            } catch (Throwable th3) {
                th = th3;
                if (inputStream2 != null) {
                    inputStream2.close();
                }
                throw th;
            }
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("(");
            sb2.append(C7913a.f43086D[this.f43133a]);
            sb2.append(", data length:");
            return C0166e.m768o(sb2, this.f43136d.length, ")");
        }
    }

    /* JADX INFO: renamed from: o3.a$d */
    public static class d {

        /* JADX INFO: renamed from: a */
        public final int f43137a;

        /* JADX INFO: renamed from: b */
        public final String f43138b;

        /* JADX INFO: renamed from: c */
        public final int f43139c;

        /* JADX INFO: renamed from: d */
        public final int f43140d;

        public d(String str, int i10, int i11) {
            this.f43138b = str;
            this.f43137a = i10;
            this.f43139c = i11;
            this.f43140d = -1;
        }

        public d(String str, int i10, int i11, int i12) {
            this.f43138b = str;
            this.f43137a = i10;
            this.f43139c = i11;
            this.f43140d = i12;
        }
    }

    /* JADX INFO: renamed from: o3.a$e */
    public static class e {

        /* JADX INFO: renamed from: a */
        public final long f43141a;

        /* JADX INFO: renamed from: b */
        public final long f43142b;

        public e(long j10, long j11) {
            if (j11 == 0) {
                this.f43141a = 0L;
                this.f43142b = 1L;
            } else {
                this.f43141a = j10;
                this.f43142b = j11;
            }
        }

        public final String toString() {
            return this.f43141a + "/" + this.f43142b;
        }
    }

    /* JADX INFO: renamed from: o3.a$f */
    public static class f extends b {
        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        public f(InputStream inputStream) throws IOException {
            super(inputStream);
            if (!inputStream.markSupported()) {
                throw new IllegalArgumentException("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
            }
            this.f43129a.mark(Integer.MAX_VALUE);
        }

        public f(byte[] bArr) throws IOException {
            super(bArr);
            this.f43129a.mark(Integer.MAX_VALUE);
        }

        /* JADX INFO: renamed from: b */
        public final void m15727b(long j10) throws IOException {
            int i10 = this.f43131c;
            if (i10 > j10) {
                this.f43131c = 0;
                this.f43129a.reset();
            } else {
                j10 -= (long) i10;
            }
            m15718a((int) j10);
        }
    }

    static {
        "VP8X".getBytes(Charset.defaultCharset());
        "VP8L".getBytes(Charset.defaultCharset());
        "VP8 ".getBytes(Charset.defaultCharset());
        "ANIM".getBytes(Charset.defaultCharset());
        "ANMF".getBytes(Charset.defaultCharset());
        f43086D = new String[]{"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
        f43087E = new int[]{0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
        f43088F = new byte[]{65, 83, 67, 73, 73, 0, 0, 0};
        d[] dVarArr = {new d("NewSubfileType", 254, 4), new d("SubfileType", 255, 4), new d("ImageWidth", 256, 3, 4), new d("ImageLength", 257, 3, 4), new d("BitsPerSample", 258, 3), new d("Compression", 259, 3), new d("PhotometricInterpretation", 262, 3), new d("ImageDescription", 270, 2), new d("Make", 271, 2), new d("Model", 272, 2), new d("StripOffsets", 273, 3, 4), new d("Orientation", 274, 3), new d("SamplesPerPixel", 277, 3), new d("RowsPerStrip", 278, 3, 4), new d("StripByteCounts", 279, 3, 4), new d("XResolution", 282, 5), new d("YResolution", 283, 5), new d("PlanarConfiguration", 284, 3), new d("ResolutionUnit", 296, 3), new d("TransferFunction", 301, 3), new d("Software", 305, 2), new d("DateTime", 306, 2), new d("Artist", 315, 2), new d("WhitePoint", 318, 5), new d("PrimaryChromaticities", 319, 5), new d("SubIFDPointer", 330, 4), new d("JPEGInterchangeFormat", 513, 4), new d("JPEGInterchangeFormatLength", 514, 4), new d("YCbCrCoefficients", 529, 5), new d("YCbCrSubSampling", 530, 3), new d("YCbCrPositioning", 531, 3), new d("ReferenceBlackWhite", 532, 5), new d("Copyright", 33432, 2), new d("ExifIFDPointer", 34665, 4), new d("GPSInfoIFDPointer", 34853, 4), new d("SensorTopBorder", 4, 4), new d("SensorLeftBorder", 5, 4), new d("SensorBottomBorder", 6, 4), new d("SensorRightBorder", 7, 4), new d("ISO", 23, 3), new d("JpgFromRaw", 46, 7), new d("Xmp", 700, 1)};
        d[] dVarArr2 = {new d("ExposureTime", 33434, 5), new d("FNumber", 33437, 5), new d("ExposureProgram", 34850, 3), new d("SpectralSensitivity", 34852, 2), new d("PhotographicSensitivity", 34855, 3), new d("OECF", 34856, 7), new d("SensitivityType", 34864, 3), new d("StandardOutputSensitivity", 34865, 4), new d("RecommendedExposureIndex", 34866, 4), new d("ISOSpeed", 34867, 4), new d("ISOSpeedLatitudeyyy", 34868, 4), new d("ISOSpeedLatitudezzz", 34869, 4), new d("ExifVersion", 36864, 2), new d("DateTimeOriginal", 36867, 2), new d("DateTimeDigitized", 36868, 2), new d("OffsetTime", 36880, 2), new d("OffsetTimeOriginal", 36881, 2), new d("OffsetTimeDigitized", 36882, 2), new d("ComponentsConfiguration", 37121, 7), new d("CompressedBitsPerPixel", 37122, 5), new d("ShutterSpeedValue", 37377, 10), new d("ApertureValue", 37378, 5), new d("BrightnessValue", 37379, 10), new d("ExposureBiasValue", 37380, 10), new d("MaxApertureValue", 37381, 5), new d("SubjectDistance", 37382, 5), new d("MeteringMode", 37383, 3), new d("LightSource", 37384, 3), new d("Flash", 37385, 3), new d("FocalLength", 37386, 5), new d("SubjectArea", 37396, 3), new d("MakerNote", 37500, 7), new d("UserComment", 37510, 7), new d("SubSecTime", 37520, 2), new d("SubSecTimeOriginal", 37521, 2), new d("SubSecTimeDigitized", 37522, 2), new d("FlashpixVersion", 40960, 7), new d("ColorSpace", 40961, 3), new d("PixelXDimension", 40962, 3, 4), new d("PixelYDimension", 40963, 3, 4), new d("RelatedSoundFile", 40964, 2), new d("InteroperabilityIFDPointer", 40965, 4), new d("FlashEnergy", 41483, 5), new d("SpatialFrequencyResponse", 41484, 7), new d("FocalPlaneXResolution", 41486, 5), new d("FocalPlaneYResolution", 41487, 5), new d("FocalPlaneResolutionUnit", 41488, 3), new d("SubjectLocation", 41492, 3), new d("ExposureIndex", 41493, 5), new d("SensingMethod", 41495, 3), new d("FileSource", 41728, 7), new d("SceneType", 41729, 7), new d("CFAPattern", 41730, 7), new d("CustomRendered", 41985, 3), new d("ExposureMode", 41986, 3), new d("WhiteBalance", 41987, 3), new d("DigitalZoomRatio", 41988, 5), new d("FocalLengthIn35mmFilm", 41989, 3), new d("SceneCaptureType", 41990, 3), new d("GainControl", 41991, 3), new d("Contrast", 41992, 3), new d("Saturation", 41993, 3), new d("Sharpness", 41994, 3), new d("DeviceSettingDescription", 41995, 7), new d("SubjectDistanceRange", 41996, 3), new d("ImageUniqueID", 42016, 2), new d("CameraOwnerName", 42032, 2), new d("BodySerialNumber", 42033, 2), new d("LensSpecification", 42034, 5), new d("LensMake", 42035, 2), new d("LensModel", 42036, 2), new d("Gamma", 42240, 5), new d("DNGVersion", 50706, 1), new d("DefaultCropSize", 50720, 3, 4)};
        d[] dVarArr3 = {new d("GPSVersionID", 0, 1), new d("GPSLatitudeRef", 1, 2), new d("GPSLatitude", 2, 5, 10), new d("GPSLongitudeRef", 3, 2), new d("GPSLongitude", 4, 5, 10), new d("GPSAltitudeRef", 5, 1), new d("GPSAltitude", 6, 5), new d("GPSTimeStamp", 7, 5), new d("GPSSatellites", 8, 2), new d("GPSStatus", 9, 2), new d("GPSMeasureMode", 10, 2), new d("GPSDOP", 11, 5), new d("GPSSpeedRef", 12, 2), new d("GPSSpeed", 13, 5), new d("GPSTrackRef", 14, 2), new d("GPSTrack", 15, 5), new d("GPSImgDirectionRef", 16, 2), new d("GPSImgDirection", 17, 5), new d("GPSMapDatum", 18, 2), new d("GPSDestLatitudeRef", 19, 2), new d("GPSDestLatitude", 20, 5), new d("GPSDestLongitudeRef", 21, 2), new d("GPSDestLongitude", 22, 5), new d("GPSDestBearingRef", 23, 2), new d("GPSDestBearing", 24, 5), new d("GPSDestDistanceRef", 25, 2), new d("GPSDestDistance", 26, 5), new d("GPSProcessingMethod", 27, 7), new d("GPSAreaInformation", 28, 7), new d("GPSDateStamp", 29, 2), new d("GPSDifferential", 30, 3), new d("GPSHPositioningError", 31, 5)};
        d[] dVarArr4 = {new d("InteroperabilityIndex", 1, 2)};
        d[] dVarArr5 = {new d("NewSubfileType", 254, 4), new d("SubfileType", 255, 4), new d("ThumbnailImageWidth", 256, 3, 4), new d("ThumbnailImageLength", 257, 3, 4), new d("BitsPerSample", 258, 3), new d("Compression", 259, 3), new d("PhotometricInterpretation", 262, 3), new d("ImageDescription", 270, 2), new d("Make", 271, 2), new d("Model", 272, 2), new d("StripOffsets", 273, 3, 4), new d("ThumbnailOrientation", 274, 3), new d("SamplesPerPixel", 277, 3), new d("RowsPerStrip", 278, 3, 4), new d("StripByteCounts", 279, 3, 4), new d("XResolution", 282, 5), new d("YResolution", 283, 5), new d("PlanarConfiguration", 284, 3), new d("ResolutionUnit", 296, 3), new d("TransferFunction", 301, 3), new d("Software", 305, 2), new d("DateTime", 306, 2), new d("Artist", 315, 2), new d("WhitePoint", 318, 5), new d("PrimaryChromaticities", 319, 5), new d("SubIFDPointer", 330, 4), new d("JPEGInterchangeFormat", 513, 4), new d("JPEGInterchangeFormatLength", 514, 4), new d("YCbCrCoefficients", 529, 5), new d("YCbCrSubSampling", 530, 3), new d("YCbCrPositioning", 531, 3), new d("ReferenceBlackWhite", 532, 5), new d("Xmp", 700, 1), new d("Copyright", 33432, 2), new d("ExifIFDPointer", 34665, 4), new d("GPSInfoIFDPointer", 34853, 4), new d("DNGVersion", 50706, 1), new d("DefaultCropSize", 50720, 3, 4)};
        f43089G = new d("StripOffsets", 273, 3);
        f43090H = new d[][]{dVarArr, dVarArr2, dVarArr3, dVarArr4, dVarArr5, dVarArr, new d[]{new d("ThumbnailImage", 256, 7), new d("CameraSettingsIFDPointer", 8224, 4), new d("ImageProcessingIFDPointer", 8256, 4)}, new d[]{new d("PreviewImageStart", 257, 4), new d("PreviewImageLength", 258, 4)}, new d[]{new d("AspectFrame", 4371, 3)}, new d[]{new d("ColorSpace", 55, 3)}};
        f43091I = new d[]{new d("SubIFDPointer", 330, 4), new d("ExifIFDPointer", 34665, 4), new d("GPSInfoIFDPointer", 34853, 4), new d("InteroperabilityIFDPointer", 40965, 4), new d("CameraSettingsIFDPointer", 8224, 1), new d("ImageProcessingIFDPointer", 8256, 1)};
        f43092J = new HashMap[10];
        f43093K = new HashMap[10];
        f43094L = new HashSet<>(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"));
        f43095M = new HashMap<>();
        Charset charsetForName = Charset.forName("US-ASCII");
        f43096N = charsetForName;
        f43097O = "Exif\u0000\u0000".getBytes(charsetForName);
        f43098P = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(charsetForName);
        Locale locale = Locale.US;
        new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale).setTimeZone(TimeZone.getTimeZone("UTC"));
        new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale).setTimeZone(TimeZone.getTimeZone("UTC"));
        int i10 = 0;
        while (true) {
            d[][] dVarArr6 = f43090H;
            if (i10 >= dVarArr6.length) {
                HashMap<Integer, Integer> map = f43095M;
                d[] dVarArr7 = f43091I;
                map.put(Integer.valueOf(dVarArr7[0].f43137a), 5);
                map.put(Integer.valueOf(dVarArr7[1].f43137a), 1);
                map.put(Integer.valueOf(dVarArr7[2].f43137a), 2);
                map.put(Integer.valueOf(dVarArr7[3].f43137a), 3);
                map.put(Integer.valueOf(dVarArr7[4].f43137a), 7);
                map.put(Integer.valueOf(dVarArr7[5].f43137a), 8);
                Pattern.compile(".*[1-9].*");
                Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
            f43092J[i10] = new HashMap<>();
            f43093K[i10] = new HashMap<>();
            for (d dVar : dVarArr6[i10]) {
                f43092J[i10].put(Integer.valueOf(dVar.f43137a), dVar);
                f43093K[i10].put(dVar.f43138b, dVar);
            }
            i10++;
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0066  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public C7913a(InputStream inputStream) throws IOException {
        boolean z10;
        d[][] dVarArr = f43090H;
        this.f43117d = new HashMap[dVarArr.length];
        this.f43118e = new HashSet(dVarArr.length);
        this.f43119f = ByteOrder.BIG_ENDIAN;
        if (inputStream == null) {
            throw new NullPointerException("inputStream cannot be null");
        }
        boolean z11 = inputStream instanceof AssetManager.AssetInputStream;
        boolean z12 = true;
        boolean z13 = f43099l;
        if (z11) {
            this.f43115b = (AssetManager.AssetInputStream) inputStream;
            this.f43114a = null;
        } else if (inputStream instanceof FileInputStream) {
            FileInputStream fileInputStream = (FileInputStream) inputStream;
            try {
                C7914b.a.m15732c(fileInputStream.getFD(), 0L, OsConstants.SEEK_CUR);
                z10 = true;
            } catch (Exception unused) {
                if (z13) {
                    Log.d("ExifInterface", "The file descriptor for the given input is not seekable");
                }
                z10 = false;
            }
            if (z10) {
                this.f43115b = null;
                this.f43114a = fileInputStream.getFD();
            } else {
                this.f43115b = null;
                this.f43114a = null;
            }
        } else {
            this.f43115b = null;
            this.f43114a = null;
        }
        for (int i10 = 0; i10 < dVarArr.length; i10++) {
            try {
                try {
                    this.f43117d[i10] = new HashMap<>();
                } catch (Throwable th2) {
                    m15695a();
                    if (z13) {
                        m15710p();
                    }
                    throw th2;
                }
            } catch (IOException | UnsupportedOperationException e10) {
                if (z13) {
                    Log.w("ExifInterface", "Invalid image: ExifInterface got an unsupported image format file(ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface.", e10);
                }
                m15695a();
                if (z13) {
                }
            }
        }
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, 5000);
        int iM15700f = m15700f(bufferedInputStream);
        this.f43116c = iM15700f;
        if ((iM15700f == 4 || iM15700f == 9 || iM15700f == 13 || iM15700f == 14) ? false : z12) {
            f fVar = new f(bufferedInputStream);
            int i11 = this.f43116c;
            if (i11 == 12) {
                m15698d(fVar);
            } else if (i11 == 7) {
                m15701g(fVar);
            } else if (i11 == 10) {
                m15705k(fVar);
            } else {
                m15704j(fVar);
            }
            fVar.m15727b(this.f43121h);
            m15714u(fVar);
        } else {
            b bVar = new b(bufferedInputStream);
            int i12 = this.f43116c;
            if (i12 == 4) {
                m15699e(bVar, 0, 0);
            } else if (i12 == 13) {
                m15702h(bVar);
            } else if (i12 == 9) {
                m15703i(bVar);
            } else if (i12 == 14) {
                m15706l(bVar);
            }
        }
        m15695a();
        if (z13) {
            m15710p();
        }
    }

    /* JADX INFO: renamed from: q */
    public static ByteOrder m15694q(b bVar) throws IOException {
        short s10 = bVar.readShort();
        boolean z10 = f43099l;
        if (s10 == 18761) {
            if (z10) {
                Log.d("ExifInterface", "readExifSegment: Byte Align II");
            }
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (s10 == 19789) {
            if (z10) {
                Log.d("ExifInterface", "readExifSegment: Byte Align MM");
            }
            return ByteOrder.BIG_ENDIAN;
        }
        throw new IOException("Invalid byte order: " + Integer.toHexString(s10));
    }

    /* JADX INFO: renamed from: a */
    public final void m15695a() {
        String strM15696b = m15696b("DateTimeOriginal");
        HashMap<String, c>[] mapArr = this.f43117d;
        if (strM15696b != null && m15696b("DateTime") == null) {
            mapArr[0].put("DateTime", c.m15719a(strM15696b));
        }
        if (m15696b("ImageWidth") == null) {
            mapArr[0].put("ImageWidth", c.m15720b(0L, this.f43119f));
        }
        if (m15696b("ImageLength") == null) {
            mapArr[0].put("ImageLength", c.m15720b(0L, this.f43119f));
        }
        if (m15696b("Orientation") == null) {
            mapArr[0].put("Orientation", c.m15720b(0L, this.f43119f));
        }
        if (m15696b("LightSource") == null) {
            mapArr[1].put("LightSource", c.m15720b(0L, this.f43119f));
        }
    }

    /* JADX INFO: renamed from: b */
    public final String m15696b(String str) {
        c cVarM15697c = m15697c(str);
        if (cVarM15697c != null) {
            if (!f43094L.contains(str)) {
                return cVarM15697c.m15725g(this.f43119f);
            }
            if (str.equals("GPSTimeStamp")) {
                int i10 = cVarM15697c.f43133a;
                if (i10 != 5 && i10 != 10) {
                    Log.w("ExifInterface", "GPS Timestamp format is not rational. format=" + i10);
                    return null;
                }
                e[] eVarArr = (e[]) cVarM15697c.m15726h(this.f43119f);
                if (eVarArr == null || eVarArr.length != 3) {
                    Log.w("ExifInterface", "Invalid GPS Timestamp array. array=" + Arrays.toString(eVarArr));
                    return null;
                }
                e eVar = eVarArr[0];
                e eVar2 = eVarArr[1];
                e eVar3 = eVarArr[2];
                return String.format("%02d:%02d:%02d", Integer.valueOf((int) (eVar.f43141a / eVar.f43142b)), Integer.valueOf((int) (eVar2.f43141a / eVar2.f43142b)), Integer.valueOf((int) (eVar3.f43141a / eVar3.f43142b)));
            }
            try {
                return Double.toString(cVarM15697c.m15723e(this.f43119f));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final c m15697c(String str) {
        if ("ISOSpeedRatings".equals(str)) {
            if (f43099l) {
                Log.d("ExifInterface", "getExifAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
            }
            str = "PhotographicSensitivity";
        }
        for (int i10 = 0; i10 < f43090H.length; i10++) {
            c cVar = this.f43117d[i10].get(str);
            if (cVar != null) {
                return cVar;
            }
        }
        return null;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* JADX INFO: renamed from: d */
    public final void m15698d(f fVar) throws IOException {
        String strExtractMetadata;
        String strExtractMetadata2;
        String strExtractMetadata3;
        int i10;
        if (Build.VERSION.SDK_INT < 28) {
            throw new UnsupportedOperationException("Reading EXIF from HEIF files is supported from SDK 28 and above");
        }
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                C7914b.b.m15733a(mediaMetadataRetriever, new a(fVar));
                String strExtractMetadata4 = mediaMetadataRetriever.extractMetadata(33);
                String strExtractMetadata5 = mediaMetadataRetriever.extractMetadata(34);
                String strExtractMetadata6 = mediaMetadataRetriever.extractMetadata(26);
                String strExtractMetadata7 = mediaMetadataRetriever.extractMetadata(17);
                if ("yes".equals(strExtractMetadata6)) {
                    strExtractMetadata = mediaMetadataRetriever.extractMetadata(29);
                    strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(30);
                    strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(31);
                } else if ("yes".equals(strExtractMetadata7)) {
                    strExtractMetadata = mediaMetadataRetriever.extractMetadata(18);
                    strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(19);
                    strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(24);
                } else {
                    strExtractMetadata = null;
                    strExtractMetadata2 = null;
                    strExtractMetadata3 = null;
                }
                HashMap<String, c>[] mapArr = this.f43117d;
                if (strExtractMetadata != null) {
                    mapArr[0].put("ImageWidth", c.m15722d(Integer.parseInt(strExtractMetadata), this.f43119f));
                }
                if (strExtractMetadata2 != null) {
                    mapArr[0].put("ImageLength", c.m15722d(Integer.parseInt(strExtractMetadata2), this.f43119f));
                }
                if (strExtractMetadata3 != null) {
                    int i11 = Integer.parseInt(strExtractMetadata3);
                    if (i11 == 90) {
                        i10 = 6;
                    } else if (i11 != 180) {
                        i10 = i11 != 270 ? 1 : 8;
                    } else {
                        i10 = 3;
                    }
                    mapArr[0].put("Orientation", c.m15722d(i10, this.f43119f));
                }
                if (strExtractMetadata4 != null && strExtractMetadata5 != null) {
                    int i12 = Integer.parseInt(strExtractMetadata4);
                    int i13 = Integer.parseInt(strExtractMetadata5);
                    if (i13 <= 6) {
                        throw new IOException("Invalid exif length");
                    }
                    fVar.m15727b(i12);
                    byte[] bArr = new byte[6];
                    if (fVar.read(bArr) != 6) {
                        throw new IOException("Can't read identifier");
                    }
                    int i14 = i12 + 6;
                    int i15 = i13 - 6;
                    if (!Arrays.equals(bArr, f43097O)) {
                        throw new IOException("Invalid identifier");
                    }
                    byte[] bArr2 = new byte[i15];
                    if (fVar.read(bArr2) != i15) {
                        throw new IOException("Can't read exif");
                    }
                    this.f43121h = i14;
                    m15711r(bArr2, 0);
                }
                if (f43099l) {
                    Log.d("ExifInterface", "Heif meta: " + strExtractMetadata + "x" + strExtractMetadata2 + ", rotation " + strExtractMetadata3);
                }
                mediaMetadataRetriever.release();
            } catch (RuntimeException unused) {
                throw new UnsupportedOperationException("Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported.");
            }
        } catch (Throwable th2) {
            mediaMetadataRetriever.release();
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:105:0x01a3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:0x00b6 A[FALL_THROUGH] */
    /* JADX WARN: Code duplicated, block: B:36:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:37:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:40:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:41:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:87:0x019b A[LOOP:0: B:10:0x0037->B:87:0x019b, LOOP_END] */
    /*  JADX ERROR: UnsupportedOperationException in pass: RegionMakerVisitor
        java.lang.UnsupportedOperationException
        	at java.base/java.util.Collections$UnmodifiableCollection.add(Collections.java:1092)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker$1.leaveRegion(SwitchRegionMaker.java:419)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:91)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:31)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaksForCase(SwitchRegionMaker.java:399)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaks(SwitchRegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.leaveRegion(PostProcessRegions.java:31)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:91)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.process(PostProcessRegions.java:21)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:31)
        */
    /* JADX INFO: renamed from: e */
    public final void m15699e(p287o3.C7913a.b r24, int r25, int r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 552
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p287o3.C7913a.m15699e(o3.a$b, int, int):void");
    }

    /* JADX WARN: Code duplicated, block: B:104:0x0132  */
    /* JADX WARN: Code duplicated, block: B:105:0x0135  */
    /* JADX WARN: Code duplicated, block: B:120:0x0151  */
    /* JADX WARN: Code duplicated, block: B:122:0x0156  */
    /* JADX WARN: Code duplicated, block: B:125:0x015c  */
    /* JADX WARN: Code duplicated, block: B:128:0x0164 A[LOOP:2: B:123:0x0157->B:128:0x0164, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:131:0x016a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:133:0x016d  */
    /* JADX WARN: Code duplicated, block: B:136:0x0173  */
    /* JADX WARN: Code duplicated, block: B:139:0x017a A[LOOP:3: B:134:0x016e->B:139:0x017a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:143:0x0183  */
    /* JADX WARN: Code duplicated, block: B:146:0x018e A[LOOP:4: B:141:0x017e->B:146:0x018e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:149:0x0194  */
    /* JADX WARN: Code duplicated, block: B:151:0x0199 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:156:0x019f  */
    /* JADX WARN: Code duplicated, block: B:161:0x00e1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:171:0x011b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:177:0x0167 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:178:0x0162 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:179:0x017d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:180:0x018c A[EDGE_INSN: B:180:0x018c->B:145:0x018c BREAK  A[LOOP:3: B:134:0x016e->B:139:0x017a], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:181:0x018c A[EDGE_INSN: B:181:0x018c->B:145:0x018c BREAK  A[LOOP:3: B:134:0x016e->B:139:0x017a], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:182:0x0191 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:80:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:84:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:98:0x0119 A[RETURN] */
    /* JADX INFO: renamed from: f */
    public final int m15700f(BufferedInputStream bufferedInputStream) throws Throwable {
        boolean z10;
        boolean z11;
        b bVar;
        b bVar2;
        boolean z12;
        b bVar3;
        b bVar4;
        boolean z13;
        b bVar5;
        b bVar6;
        boolean z14;
        int i10;
        byte[] bArr;
        boolean z15;
        int i11;
        byte[] bArr2;
        int i12;
        byte[] bArr3;
        boolean z16;
        b bVar7;
        short s10;
        long j10;
        bufferedInputStream.mark(5000);
        byte[] bArr4 = new byte[5000];
        bufferedInputStream.read(bArr4);
        bufferedInputStream.reset();
        int i13 = 0;
        while (true) {
            byte[] bArr5 = f43104q;
            if (i13 >= bArr5.length) {
                z10 = true;
                break;
            }
            if (bArr4[i13] != bArr5[i13]) {
                z10 = false;
                break;
            }
            i13++;
        }
        if (z10) {
            return 4;
        }
        byte[] bytes = "FUJIFILMCCD-RAW".getBytes(Charset.defaultCharset());
        int i14 = 0;
        while (true) {
            if (i14 >= bytes.length) {
                z11 = true;
                break;
            }
            if (bArr4[i14] != bytes[i14]) {
                z11 = false;
                break;
            }
            i14++;
        }
        if (z11) {
            return 9;
        }
        try {
            bVar2 = new b(bArr4);
            try {
                long j11 = bVar2.readInt();
                byte[] bArr6 = new byte[4];
                bVar2.read(bArr6);
                if (Arrays.equals(bArr6, f43105r)) {
                    if (j11 == 1) {
                        j11 = bVar2.readLong();
                        j10 = 16;
                        if (j11 < 16) {
                        }
                    } else {
                        j10 = 8;
                    }
                    long j12 = 5000;
                    if (j11 > j12) {
                        j11 = j12;
                    }
                    long j13 = j11 - j10;
                    if (j13 >= 8) {
                        byte[] bArr7 = new byte[4];
                        long j14 = 0;
                        boolean z17 = false;
                        boolean z18 = false;
                        while (true) {
                            if (j14 < j13 / 4 && bVar2.read(bArr7) == 4) {
                                if (j14 != 1) {
                                    if (Arrays.equals(bArr7, f43106s)) {
                                        z17 = true;
                                    } else if (Arrays.equals(bArr7, f43107t)) {
                                        z18 = true;
                                    }
                                    if (z17 && z18) {
                                        bVar2.close();
                                        z12 = true;
                                    }
                                }
                                j14++;
                            }
                            if (z12) {
                                return 12;
                            }
                            try {
                                bVar4 = new b(bArr4);
                                try {
                                    ByteOrder byteOrderM15694q = m15694q(bVar4);
                                    this.f43119f = byteOrderM15694q;
                                    bVar4.f43130b = byteOrderM15694q;
                                    s10 = bVar4.readShort();
                                    if (s10 != 20306 || s10 == 21330) {
                                        z13 = true;
                                    } else {
                                        z13 = false;
                                    }
                                    bVar4.close();
                                } catch (Exception unused) {
                                    if (bVar4 != null) {
                                        bVar4.close();
                                    }
                                    z13 = false;
                                } catch (Throwable th2) {
                                    th = th2;
                                    bVar3 = bVar4;
                                    if (bVar3 != null) {
                                        bVar3.close();
                                    }
                                    throw th;
                                }
                            } catch (Exception unused2) {
                                bVar4 = null;
                            } catch (Throwable th3) {
                                th = th3;
                                bVar3 = null;
                            }
                            if (z13) {
                                return 7;
                            }
                            try {
                                bVar7 = new b(bArr4);
                                try {
                                    ByteOrder byteOrderM15694q2 = m15694q(bVar7);
                                    this.f43119f = byteOrderM15694q2;
                                    bVar7.f43130b = byteOrderM15694q2;
                                    if (bVar7.readShort() == 85) {
                                        z14 = true;
                                    } else {
                                        z14 = false;
                                    }
                                    bVar7.close();
                                } catch (Exception unused3) {
                                    bVar6 = bVar7;
                                    if (bVar6 != null) {
                                        bVar6.close();
                                    }
                                    z14 = false;
                                } catch (Throwable th4) {
                                    th = th4;
                                    bVar5 = bVar7;
                                    if (bVar5 != null) {
                                        bVar5.close();
                                    }
                                    throw th;
                                }
                            } catch (Exception unused4) {
                                bVar6 = null;
                            } catch (Throwable th5) {
                                th = th5;
                                bVar5 = null;
                            }
                            if (z14) {
                                return 10;
                            }
                            i10 = 0;
                            while (true) {
                                bArr = f43110w;
                                if (i10 >= bArr.length) {
                                    z15 = true;
                                    break;
                                }
                                if (bArr4[i10] != bArr[i10]) {
                                    z15 = false;
                                    break;
                                }
                                i10++;
                            }
                            if (z15) {
                                return 13;
                            }
                            i11 = 0;
                            while (true) {
                                bArr2 = f43083A;
                                if (i11 >= bArr2.length) {
                                    i12 = 0;
                                    while (true) {
                                        bArr3 = f43084B;
                                        if (i12 >= bArr3.length) {
                                            z16 = true;
                                        } else {
                                            if (bArr4[bArr2.length + i12 + 4] != bArr3[i12]) {
                                                break;
                                            }
                                            i12++;
                                        }
                                        if (z16) {
                                            return 14;
                                        }
                                        return 0;
                                    }
                                }
                                if (bArr4[i11] != bArr2[i11]) {
                                    break;
                                }
                                i11++;
                            }
                            z16 = false;
                            if (z16) {
                                return 14;
                            }
                            return 0;
                        }
                    }
                }
            } catch (Exception e10) {
                e = e10;
                try {
                    if (f43099l) {
                        Log.d("ExifInterface", "Exception parsing HEIF file type box.", e);
                    }
                    if (bVar2 != null) {
                    }
                    z12 = false;
                    if (z12) {
                        return 12;
                    }
                    bVar4 = new b(bArr4);
                    ByteOrder byteOrderM15694q3 = m15694q(bVar4);
                    this.f43119f = byteOrderM15694q3;
                    bVar4.f43130b = byteOrderM15694q3;
                    s10 = bVar4.readShort();
                    if (s10 != 20306) {
                        z13 = true;
                    } else {
                        z13 = true;
                    }
                    bVar4.close();
                    if (z13) {
                        return 7;
                    }
                    bVar7 = new b(bArr4);
                    ByteOrder byteOrderM15694q4 = m15694q(bVar7);
                    this.f43119f = byteOrderM15694q4;
                    bVar7.f43130b = byteOrderM15694q4;
                    if (bVar7.readShort() == 85) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    bVar7.close();
                    if (z14) {
                        return 10;
                    }
                    i10 = 0;
                    while (true) {
                        bArr = f43110w;
                        if (i10 >= bArr.length) {
                            z15 = true;
                            break;
                        }
                        if (bArr4[i10] != bArr[i10]) {
                            z15 = false;
                            break;
                        }
                        i10++;
                    }
                    if (z15) {
                        return 13;
                    }
                    i11 = 0;
                    while (true) {
                        bArr2 = f43083A;
                        if (i11 >= bArr2.length) {
                            i12 = 0;
                            while (true) {
                                bArr3 = f43084B;
                                if (i12 >= bArr3.length) {
                                    z16 = true;
                                } else {
                                    if (bArr4[bArr2.length + i12 + 4] != bArr3[i12]) {
                                        break;
                                        break;
                                    }
                                    i12++;
                                }
                                if (z16) {
                                    return 14;
                                }
                                return 0;
                            }
                        }
                        if (bArr4[i11] != bArr2[i11]) {
                            break;
                            break;
                        }
                        i11++;
                    }
                    z16 = false;
                    if (z16) {
                        return 14;
                    }
                    return 0;
                } catch (Throwable th6) {
                    th = th6;
                    bVar = bVar2;
                    bVar2 = bVar;
                    if (bVar2 != null) {
                        bVar2.close();
                    }
                    throw th;
                }
            } catch (Throwable th7) {
                th = th7;
                if (bVar2 != null) {
                    bVar2.close();
                }
                throw th;
            }
        } catch (Exception e11) {
            e = e11;
            bVar2 = null;
        } catch (Throwable th8) {
            th = th8;
            bVar = null;
            bVar2 = bVar;
            if (bVar2 != null) {
                bVar2.close();
            }
            throw th;
        }
        bVar2.close();
        z12 = false;
        if (z12) {
            return 12;
        }
        bVar4 = new b(bArr4);
        ByteOrder byteOrderM15694q5 = m15694q(bVar4);
        this.f43119f = byteOrderM15694q5;
        bVar4.f43130b = byteOrderM15694q5;
        s10 = bVar4.readShort();
        if (s10 != 20306) {
            z13 = true;
        } else {
            z13 = true;
        }
        bVar4.close();
        if (z13) {
            return 7;
        }
        bVar7 = new b(bArr4);
        ByteOrder byteOrderM15694q6 = m15694q(bVar7);
        this.f43119f = byteOrderM15694q6;
        bVar7.f43130b = byteOrderM15694q6;
        if (bVar7.readShort() == 85) {
            z14 = true;
        } else {
            z14 = false;
        }
        bVar7.close();
        if (z14) {
            return 10;
        }
        i10 = 0;
        while (true) {
            bArr = f43110w;
            if (i10 >= bArr.length) {
                z15 = true;
                break;
            }
            if (bArr4[i10] != bArr[i10]) {
                z15 = false;
                break;
            }
            i10++;
        }
        if (z15) {
            return 13;
        }
        i11 = 0;
        while (true) {
            bArr2 = f43083A;
            if (i11 >= bArr2.length) {
                i12 = 0;
                while (true) {
                    bArr3 = f43084B;
                    if (i12 >= bArr3.length) {
                        z16 = true;
                    } else {
                        if (bArr4[bArr2.length + i12 + 4] != bArr3[i12]) {
                            break;
                            break;
                        }
                        i12++;
                    }
                    if (z16) {
                        return 14;
                    }
                    return 0;
                }
            }
            if (bArr4[i11] != bArr2[i11]) {
                break;
                break;
            }
            i11++;
        }
        z16 = false;
        if (z16) {
            return 14;
        }
        return 0;
    }

    /* JADX INFO: renamed from: g */
    public final void m15701g(f fVar) throws Throwable {
        int i10;
        int i11;
        m15704j(fVar);
        HashMap<String, c>[] mapArr = this.f43117d;
        c cVar = mapArr[1].get("MakerNote");
        if (cVar != null) {
            f fVar2 = new f(cVar.f43136d);
            fVar2.f43130b = this.f43119f;
            byte[] bArr = f43108u;
            byte[] bArr2 = new byte[bArr.length];
            fVar2.readFully(bArr2);
            fVar2.m15727b(0L);
            byte[] bArr3 = f43109v;
            byte[] bArr4 = new byte[bArr3.length];
            fVar2.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                fVar2.m15727b(8L);
            } else if (Arrays.equals(bArr4, bArr3)) {
                fVar2.m15727b(12L);
            }
            m15712s(fVar2, 6);
            c cVar2 = mapArr[7].get("PreviewImageStart");
            c cVar3 = mapArr[7].get("PreviewImageLength");
            if (cVar2 != null && cVar3 != null) {
                mapArr[5].put("JPEGInterchangeFormat", cVar2);
                mapArr[5].put("JPEGInterchangeFormatLength", cVar3);
            }
            c cVar4 = mapArr[8].get("AspectFrame");
            if (cVar4 != null) {
                int[] iArr = (int[]) cVar4.m15726h(this.f43119f);
                if (iArr == null || iArr.length != 4) {
                    Log.w("ExifInterface", "Invalid aspect frame values. frame=" + Arrays.toString(iArr));
                } else {
                    int i12 = iArr[2];
                    int i13 = iArr[0];
                    if (i12 > i13 && (i10 = iArr[3]) > (i11 = iArr[1])) {
                        int i14 = (i12 - i13) + 1;
                        int i15 = (i10 - i11) + 1;
                        if (i14 < i15) {
                            int i16 = i14 + i15;
                            i15 = i16 - i15;
                            i14 = i16 - i15;
                        }
                        c cVarM15722d = c.m15722d(i14, this.f43119f);
                        c cVarM15722d2 = c.m15722d(i15, this.f43119f);
                        mapArr[0].put("ImageWidth", cVarM15722d);
                        mapArr[0].put("ImageLength", cVarM15722d2);
                    }
                }
            }
        }
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* JADX INFO: renamed from: h */
    public final void m15702h(b bVar) throws Throwable {
        if (f43099l) {
            Log.d("ExifInterface", "getPngAttributes starting with: " + bVar);
        }
        bVar.f43130b = ByteOrder.BIG_ENDIAN;
        byte[] bArr = f43110w;
        bVar.m15718a(bArr.length);
        int length = bArr.length + 0;
        while (true) {
            try {
                int i10 = bVar.readInt();
                int i11 = length + 4;
                byte[] bArr2 = new byte[4];
                if (bVar.read(bArr2) != 4) {
                    throw new IOException("Encountered invalid length while parsing PNG chunktype");
                }
                int i12 = i11 + 4;
                if (i12 == 16 && !Arrays.equals(bArr2, f43112y)) {
                    throw new IOException("Encountered invalid PNG file--IHDR chunk should appearas the first chunk");
                }
                if (Arrays.equals(bArr2, f43113z)) {
                    return;
                }
                if (Arrays.equals(bArr2, f43111x)) {
                    byte[] bArr3 = new byte[i10];
                    if (bVar.read(bArr3) != i10) {
                        throw new IOException("Failed to read given length for given PNG chunk type: " + C7914b.m15728a(bArr2));
                    }
                    int i13 = bVar.readInt();
                    CRC32 crc32 = new CRC32();
                    crc32.update(bArr2);
                    crc32.update(bArr3);
                    if (((int) crc32.getValue()) == i13) {
                        this.f43121h = i12;
                        m15711r(bArr3, 0);
                        m15717x();
                        m15714u(new b(bArr3));
                        return;
                    }
                    throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + i13 + ", calculated CRC value: " + crc32.getValue());
                }
                int i14 = i10 + 4;
                bVar.m15718a(i14);
                length = i12 + i14;
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt PNG file.");
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m15703i(b bVar) throws Throwable {
        boolean z10 = f43099l;
        if (z10) {
            Log.d("ExifInterface", "getRafAttributes starting with: " + bVar);
        }
        bVar.m15718a(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[4];
        bVar.read(bArr);
        bVar.read(bArr2);
        bVar.read(bArr3);
        int i10 = ByteBuffer.wrap(bArr).getInt();
        int i11 = ByteBuffer.wrap(bArr2).getInt();
        int i12 = ByteBuffer.wrap(bArr3).getInt();
        byte[] bArr4 = new byte[i11];
        bVar.m15718a(i10 - bVar.f43131c);
        bVar.read(bArr4);
        m15699e(new b(bArr4), i10, 5);
        bVar.m15718a(i12 - bVar.f43131c);
        bVar.f43130b = ByteOrder.BIG_ENDIAN;
        int i13 = bVar.readInt();
        if (z10) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + i13);
        }
        for (int i14 = 0; i14 < i13; i14++) {
            int unsignedShort = bVar.readUnsignedShort();
            int unsignedShort2 = bVar.readUnsignedShort();
            if (unsignedShort == f43089G.f43137a) {
                short s10 = bVar.readShort();
                short s11 = bVar.readShort();
                c cVarM15722d = c.m15722d(s10, this.f43119f);
                c cVarM15722d2 = c.m15722d(s11, this.f43119f);
                HashMap<String, c>[] mapArr = this.f43117d;
                mapArr[0].put("ImageLength", cVarM15722d);
                mapArr[0].put("ImageWidth", cVarM15722d2);
                if (z10) {
                    Log.d("ExifInterface", "Updated to length: " + ((int) s10) + ", width: " + ((int) s11));
                    return;
                }
                return;
            }
            bVar.m15718a(unsignedShort2);
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m15704j(f fVar) throws Throwable {
        m15709o(fVar);
        m15712s(fVar, 0);
        m15716w(fVar, 0);
        m15716w(fVar, 5);
        m15716w(fVar, 4);
        m15717x();
        if (this.f43116c == 8) {
            HashMap<String, c>[] mapArr = this.f43117d;
            c cVar = mapArr[1].get("MakerNote");
            if (cVar != null) {
                f fVar2 = new f(cVar.f43136d);
                fVar2.f43130b = this.f43119f;
                fVar2.m15718a(6);
                m15712s(fVar2, 9);
                c cVar2 = mapArr[9].get("ColorSpace");
                if (cVar2 != null) {
                    mapArr[1].put("ColorSpace", cVar2);
                }
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m15705k(f fVar) throws Throwable {
        if (f43099l) {
            Log.d("ExifInterface", "getRw2Attributes starting with: " + fVar);
        }
        m15704j(fVar);
        HashMap<String, c>[] mapArr = this.f43117d;
        c cVar = mapArr[0].get("JpgFromRaw");
        if (cVar != null) {
            m15699e(new b(cVar.f43136d), (int) cVar.f43135c, 5);
        }
        c cVar2 = mapArr[0].get("ISO");
        c cVar3 = mapArr[1].get("PhotographicSensitivity");
        if (cVar2 != null && cVar3 == null) {
            mapArr[1].put("PhotographicSensitivity", cVar2);
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m15706l(b bVar) throws Throwable {
        if (f43099l) {
            Log.d("ExifInterface", "getWebpAttributes starting with: " + bVar);
        }
        bVar.f43130b = ByteOrder.LITTLE_ENDIAN;
        bVar.m15718a(f43083A.length);
        int i10 = bVar.readInt() + 8;
        byte[] bArr = f43084B;
        bVar.m15718a(bArr.length);
        int length = bArr.length + 8;
        while (true) {
            try {
                byte[] bArr2 = new byte[4];
                if (bVar.read(bArr2) != 4) {
                    throw new IOException("Encountered invalid length while parsing WebP chunktype");
                }
                int i11 = bVar.readInt();
                int i12 = length + 4 + 4;
                if (Arrays.equals(f43085C, bArr2)) {
                    byte[] bArr3 = new byte[i11];
                    if (bVar.read(bArr3) == i11) {
                        this.f43121h = i12;
                        m15711r(bArr3, 0);
                        m15714u(new b(bArr3));
                        return;
                    } else {
                        throw new IOException("Failed to read given length for given PNG chunk type: " + C7914b.m15728a(bArr2));
                    }
                }
                if (i11 % 2 == 1) {
                    i11++;
                }
                length = i12 + i11;
                if (length == i10) {
                    return;
                }
                if (length > i10) {
                    throw new IOException("Encountered WebP file with invalid chunk size");
                }
                bVar.m15718a(i11);
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt WebP file.");
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m15707m(b bVar, HashMap map) throws Throwable {
        c cVar = (c) map.get("JPEGInterchangeFormat");
        c cVar2 = (c) map.get("JPEGInterchangeFormatLength");
        if (cVar != null && cVar2 != null) {
            int iM15724f = cVar.m15724f(this.f43119f);
            int iM15724f2 = cVar2.m15724f(this.f43119f);
            if (this.f43116c == 7) {
                iM15724f += this.f43122i;
            }
            if (iM15724f > 0 && iM15724f2 > 0 && this.f43115b == null && this.f43114a == null) {
                bVar.skip(iM15724f);
                bVar.read(new byte[iM15724f2]);
            }
            if (f43099l) {
                Log.d("ExifInterface", "Setting thumbnail attributes with offset: " + iM15724f + ", length: " + iM15724f2);
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public final boolean m15708n(HashMap map) throws Throwable {
        c cVar = (c) map.get("ImageLength");
        c cVar2 = (c) map.get("ImageWidth");
        if (cVar != null && cVar2 != null) {
            int iM15724f = cVar.m15724f(this.f43119f);
            int iM15724f2 = cVar2.m15724f(this.f43119f);
            if (iM15724f <= 512 && iM15724f2 <= 512) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: o */
    public final void m15709o(b bVar) throws IOException {
        ByteOrder byteOrderM15694q = m15694q(bVar);
        this.f43119f = byteOrderM15694q;
        bVar.f43130b = byteOrderM15694q;
        int unsignedShort = bVar.readUnsignedShort();
        int i10 = this.f43116c;
        if (i10 != 7 && i10 != 10) {
            if (unsignedShort != 42) {
                throw new IOException("Invalid start code: " + Integer.toHexString(unsignedShort));
            }
        }
        int i11 = bVar.readInt();
        if (i11 < 8) {
            throw new IOException(C0166e.m761g("Invalid first Ifd offset: ", i11));
        }
        int i12 = i11 - 8;
        if (i12 > 0) {
            bVar.m15718a(i12);
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m15710p() {
        int i10 = 0;
        while (true) {
            HashMap<String, c>[] mapArr = this.f43117d;
            if (i10 >= mapArr.length) {
                return;
            }
            StringBuilder sbM614j = C0141b.m614j("The size of tag group[", i10, "]: ");
            sbM614j.append(mapArr[i10].size());
            Log.d("ExifInterface", sbM614j.toString());
            for (Map.Entry<String, c> entry : mapArr[i10].entrySet()) {
                c value = entry.getValue();
                Log.d("ExifInterface", "tagName: " + entry.getKey() + ", tagType: " + value.toString() + ", tagValue: '" + value.m15725g(this.f43119f) + "'");
            }
            i10++;
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m15711r(byte[] bArr, int i10) throws IOException {
        f fVar = new f(bArr);
        m15709o(fVar);
        m15712s(fVar, i10);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x022b  */
    /* JADX WARN: Code duplicated, block: B:103:0x022f  */
    /* JADX WARN: Code duplicated, block: B:105:0x0235  */
    /* JADX WARN: Code duplicated, block: B:107:0x023b  */
    /* JADX WARN: Code duplicated, block: B:111:0x0247  */
    /* JADX WARN: Code duplicated, block: B:112:0x024c  */
    /* JADX WARN: Code duplicated, block: B:113:0x0258  */
    /* JADX WARN: Code duplicated, block: B:116:0x025f  */
    /* JADX WARN: Code duplicated, block: B:119:0x0281  */
    /* JADX WARN: Code duplicated, block: B:121:0x028e  */
    /* JADX WARN: Code duplicated, block: B:122:0x0299 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:123:0x029b  */
    /* JADX WARN: Code duplicated, block: B:124:0x02ba  */
    /* JADX WARN: Code duplicated, block: B:126:0x02be  */
    /* JADX WARN: Code duplicated, block: B:128:0x02d9  */
    /* JADX WARN: Code duplicated, block: B:130:0x0310  */
    /* JADX WARN: Code duplicated, block: B:133:0x031b  */
    /* JADX WARN: Code duplicated, block: B:135:0x0323  */
    /* JADX WARN: Code duplicated, block: B:144:0x034f  */
    /* JADX WARN: Code duplicated, block: B:169:0x0352 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x00f4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:57:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:58:0x0116  */
    /* JADX WARN: Code duplicated, block: B:60:0x011b  */
    /* JADX WARN: Code duplicated, block: B:68:0x0135  */
    /* JADX WARN: Code duplicated, block: B:76:0x0166  */
    /* JADX WARN: Code duplicated, block: B:77:0x016f  */
    /* JADX WARN: Code duplicated, block: B:79:0x0175  */
    /* JADX WARN: Code duplicated, block: B:81:0x017d  */
    /* JADX WARN: Code duplicated, block: B:84:0x0193  */
    /* JADX WARN: Code duplicated, block: B:86:0x019d  */
    /* JADX WARN: Code duplicated, block: B:87:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:89:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:92:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:94:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:97:0x020a  */
    /* JADX WARN: Code duplicated, block: B:99:0x0225  */
    /* JADX WARN: Instruction removed from duplicated block: B:123:0x029b, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:126:0x02be, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:57:0x00f6, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:68:0x0135, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:81:0x017d, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:97:0x020a, please report this as an issue */
    /* JADX INFO: renamed from: s */
    public final void m15712s(f fVar, int i10) throws IOException {
        HashMap<String, c>[] mapArr;
        String str;
        short s10;
        short s11;
        HashSet hashSet;
        boolean z10;
        int i11;
        long j10;
        boolean z11;
        int i12;
        Integer num;
        HashSet hashSet2;
        String str2;
        boolean z12;
        String str3;
        int i13;
        int unsignedShort;
        long j11;
        int i14;
        Integer numValueOf = Integer.valueOf(fVar.f43131c);
        HashSet hashSet3 = this.f43118e;
        hashSet3.add(numValueOf);
        short s12 = fVar.readShort();
        String str4 = "ExifInterface";
        boolean z13 = f43099l;
        if (z13) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + ((int) s12));
        }
        if (s12 <= 0) {
            return;
        }
        short s13 = 0;
        while (true) {
            mapArr = this.f43117d;
            if (s13 >= s12) {
                break;
            }
            int unsignedShort2 = fVar.readUnsignedShort();
            int unsignedShort3 = fVar.readUnsignedShort();
            int i15 = fVar.readInt();
            long j12 = ((long) fVar.f43131c) + 4;
            d dVar = f43092J[i10].get(Integer.valueOf(unsignedShort2));
            if (z13) {
                Object[] objArr = new Object[5];
                objArr[0] = Integer.valueOf(i10);
                objArr[1] = Integer.valueOf(unsignedShort2);
                objArr[2] = dVar != null ? dVar.f43138b : null;
                objArr[3] = Integer.valueOf(unsignedShort3);
                objArr[4] = Integer.valueOf(i15);
                Log.d(str4, String.format("ifdType: %d, tagNumber: %d, tagName: %s, dataFormat: %d, numberOfComponents: %d", objArr));
            }
            if (dVar == null) {
                if (z13) {
                    Log.d(str4, "Skip the tag entry since tag number is not defined: " + unsignedShort2);
                }
                s10 = s12;
                s11 = s13;
            } else {
                if (unsignedShort3 > 0) {
                    int[] iArr = f43087E;
                    if (unsignedShort3 < iArr.length) {
                        int i16 = dVar.f43139c;
                        s10 = s12;
                        if (i16 == 7 || unsignedShort3 == 7 || i16 == unsignedShort3 || (i12 = dVar.f43140d) == unsignedShort3) {
                            s11 = s13;
                        } else {
                            s11 = s13;
                            if (((i16 != 4 && i12 != 4) || unsignedShort3 != 3) && (((i16 != 9 && i12 != 9) || unsignedShort3 != 8) && ((i16 != 12 && i12 != 12) || unsignedShort3 != 11))) {
                                z10 = false;
                            }
                            if (!z10) {
                                hashSet = hashSet3;
                                if (unsignedShort3 == 7) {
                                    unsignedShort3 = i16;
                                }
                                i11 = unsignedShort3;
                                j10 = ((long) i15) * ((long) iArr[unsignedShort3]);
                                if (j10 >= 0 || j10 > 2147483647L) {
                                    if (z13) {
                                        Log.d(str4, "Skip the tag entry since the number of components is invalid: " + i15);
                                    }
                                    unsignedShort3 = i11;
                                    z11 = false;
                                } else {
                                    unsignedShort3 = i11;
                                    z11 = true;
                                }
                            } else if (z13) {
                                Log.d(str4, "Skip the tag entry since data format (" + f43086D[unsignedShort3] + ") is unexpected for tag: " + dVar.f43138b);
                            }
                        }
                        z10 = true;
                        if (!z10) {
                            hashSet = hashSet3;
                            if (unsignedShort3 == 7) {
                                unsignedShort3 = i16;
                            }
                            i11 = unsignedShort3;
                            j10 = ((long) i15) * ((long) iArr[unsignedShort3]);
                            if (j10 >= 0) {
                            }
                            if (z13) {
                                Log.d(str4, "Skip the tag entry since the number of components is invalid: " + i15);
                            }
                            unsignedShort3 = i11;
                            z11 = false;
                        } else if (z13) {
                            Log.d(str4, "Skip the tag entry since data format (" + f43086D[unsignedShort3] + ") is unexpected for tag: " + dVar.f43138b);
                        }
                    }
                    if (z11) {
                        if (j10 > 4) {
                            i14 = fVar.readInt();
                            if (z13) {
                                Log.d(str4, "seek to data offset: " + i14);
                            }
                            if (this.f43116c == 7) {
                                if ("MakerNote".equals(dVar.f43138b)) {
                                    this.f43122i = i14;
                                } else if (i10 != 6 && "ThumbnailImage".equals(dVar.f43138b)) {
                                    this.f43123j = i14;
                                    this.f43124k = i15;
                                    c cVarM15722d = c.m15722d(6, this.f43119f);
                                    c cVarM15720b = c.m15720b(this.f43123j, this.f43119f);
                                    c cVarM15720b2 = c.m15720b(this.f43124k, this.f43119f);
                                    mapArr[4].put("Compression", cVarM15722d);
                                    mapArr[4].put("JPEGInterchangeFormat", cVarM15720b);
                                    mapArr[4].put("JPEGInterchangeFormatLength", cVarM15720b2);
                                }
                            }
                            fVar.m15727b(i14);
                        } else {
                            dVar = dVar;
                            hashSet = hashSet;
                            unsignedShort3 = unsignedShort3;
                            i15 = i15;
                        }
                        num = f43095M.get(Integer.valueOf(unsignedShort2));
                        if (z13) {
                            Log.d(str4, "nextIfdType: " + num + " byteCount: " + j10);
                        }
                        if (num != null) {
                            i13 = unsignedShort3;
                            if (i13 != 3) {
                                if (i13 == 4) {
                                    j11 = ((long) fVar.readInt()) & 4294967295L;
                                } else if (i13 == 8) {
                                    unsignedShort = fVar.readShort();
                                } else if (i13 != 9 || i13 == 13) {
                                    unsignedShort = fVar.readInt();
                                } else {
                                    j11 = -1;
                                }
                                if (z13) {
                                    Log.d(str4, String.format("Offset: %d, tagName: %s", Long.valueOf(j11), dVar.f43138b));
                                }
                                if (j11 > 0) {
                                    hashSet2 = hashSet;
                                    if (!hashSet2.contains(Integer.valueOf((int) j11))) {
                                        fVar.m15727b(j11);
                                        m15712s(fVar, num.intValue());
                                    } else if (z13) {
                                        Log.d(str4, "Skip jump into the IFD since it has already been read: IfdType " + num + " (at " + j11 + ")");
                                    }
                                } else {
                                    hashSet2 = hashSet;
                                    if (z13) {
                                        Log.d(str4, "Skip jump into the IFD since its offset is invalid: " + j11);
                                    }
                                }
                                fVar.m15727b(j12);
                                str2 = str4;
                                z12 = z13;
                            } else {
                                unsignedShort = fVar.readUnsignedShort();
                            }
                            j11 = unsignedShort;
                            if (z13) {
                                Log.d(str4, String.format("Offset: %d, tagName: %s", Long.valueOf(j11), dVar.f43138b));
                            }
                            if (j11 > 0) {
                                hashSet2 = hashSet;
                                if (!hashSet2.contains(Integer.valueOf((int) j11))) {
                                    fVar.m15727b(j11);
                                    m15712s(fVar, num.intValue());
                                } else if (z13) {
                                    Log.d(str4, "Skip jump into the IFD since it has already been read: IfdType " + num + " (at " + j11 + ")");
                                }
                            } else {
                                hashSet2 = hashSet;
                                if (z13) {
                                    Log.d(str4, "Skip jump into the IFD since its offset is invalid: " + j11);
                                }
                            }
                            fVar.m15727b(j12);
                            str2 = str4;
                            z12 = z13;
                        } else {
                            d dVar2 = dVar;
                            hashSet2 = hashSet;
                            int i17 = fVar.f43131c + this.f43121h;
                            byte[] bArr = new byte[(int) j10];
                            fVar.readFully(bArr);
                            str2 = str4;
                            z12 = z13;
                            c cVar = new c(i17, bArr, unsignedShort3, i15);
                            mapArr[i10].put(dVar2.f43138b, cVar);
                            str3 = dVar2.f43138b;
                            if ("DNGVersion".equals(str3)) {
                                this.f43116c = 3;
                            }
                            if (((!"Make".equals(str3) || "Model".equals(str3)) && cVar.m15725g(this.f43119f).contains("PENTAX")) || ("Compression".equals(str3) && cVar.m15724f(this.f43119f) == 65535)) {
                                this.f43116c = 8;
                            }
                            if (fVar.f43131c != j12) {
                                fVar.m15727b(j12);
                            }
                        }
                    } else {
                        fVar.m15727b(j12);
                        str2 = str4;
                        z12 = z13;
                        hashSet2 = hashSet;
                    }
                    s13 = (short) (s11 + 1);
                    hashSet3 = hashSet2;
                    str4 = str2;
                    z13 = z12;
                    s12 = s10;
                }
                s10 = s12;
                s11 = s13;
                hashSet = hashSet3;
                if (z13) {
                    Log.d(str4, "Skip the tag entry since data format is invalid: " + unsignedShort3);
                }
                j10 = 0;
                z11 = false;
                if (z11) {
                    fVar.m15727b(j12);
                    str2 = str4;
                    z12 = z13;
                    hashSet2 = hashSet;
                } else {
                    if (j10 > 4) {
                        i14 = fVar.readInt();
                        if (z13) {
                            Log.d(str4, "seek to data offset: " + i14);
                        }
                        if (this.f43116c == 7) {
                            if ("MakerNote".equals(dVar.f43138b)) {
                                this.f43122i = i14;
                            } else if (i10 != 6) {
                            }
                        }
                        fVar.m15727b(i14);
                    } else {
                        dVar = dVar;
                        hashSet = hashSet;
                        unsignedShort3 = unsignedShort3;
                        i15 = i15;
                    }
                    num = f43095M.get(Integer.valueOf(unsignedShort2));
                    if (z13) {
                        Log.d(str4, "nextIfdType: " + num + " byteCount: " + j10);
                    }
                    if (num != null) {
                        i13 = unsignedShort3;
                        if (i13 != 3) {
                            if (i13 == 4) {
                                j11 = ((long) fVar.readInt()) & 4294967295L;
                            } else if (i13 == 8) {
                                if (i13 != 9) {
                                }
                                unsignedShort = fVar.readInt();
                            } else {
                                unsignedShort = fVar.readShort();
                            }
                            if (z13) {
                                Log.d(str4, String.format("Offset: %d, tagName: %s", Long.valueOf(j11), dVar.f43138b));
                            }
                            if (j11 > 0) {
                                hashSet2 = hashSet;
                                if (!hashSet2.contains(Integer.valueOf((int) j11))) {
                                    fVar.m15727b(j11);
                                    m15712s(fVar, num.intValue());
                                } else if (z13) {
                                    Log.d(str4, "Skip jump into the IFD since it has already been read: IfdType " + num + " (at " + j11 + ")");
                                }
                            } else {
                                hashSet2 = hashSet;
                                if (z13) {
                                    Log.d(str4, "Skip jump into the IFD since its offset is invalid: " + j11);
                                }
                            }
                            fVar.m15727b(j12);
                            str2 = str4;
                            z12 = z13;
                        } else {
                            unsignedShort = fVar.readUnsignedShort();
                        }
                        j11 = unsignedShort;
                        if (z13) {
                            Log.d(str4, String.format("Offset: %d, tagName: %s", Long.valueOf(j11), dVar.f43138b));
                        }
                        if (j11 > 0) {
                            hashSet2 = hashSet;
                            if (!hashSet2.contains(Integer.valueOf((int) j11))) {
                                fVar.m15727b(j11);
                                m15712s(fVar, num.intValue());
                            } else if (z13) {
                                Log.d(str4, "Skip jump into the IFD since it has already been read: IfdType " + num + " (at " + j11 + ")");
                            }
                        } else {
                            hashSet2 = hashSet;
                            if (z13) {
                                Log.d(str4, "Skip jump into the IFD since its offset is invalid: " + j11);
                            }
                        }
                        fVar.m15727b(j12);
                        str2 = str4;
                        z12 = z13;
                    } else {
                        d dVar3 = dVar;
                        hashSet2 = hashSet;
                        int i18 = fVar.f43131c + this.f43121h;
                        byte[] bArr2 = new byte[(int) j10];
                        fVar.readFully(bArr2);
                        str2 = str4;
                        z12 = z13;
                        c cVar2 = new c(i18, bArr2, unsignedShort3, i15);
                        mapArr[i10].put(dVar3.f43138b, cVar2);
                        str3 = dVar3.f43138b;
                        if ("DNGVersion".equals(str3)) {
                            this.f43116c = 3;
                        }
                        if (!"Make".equals(str3)) {
                        }
                        this.f43116c = 8;
                        if (fVar.f43131c != j12) {
                            fVar.m15727b(j12);
                        }
                    }
                }
                s13 = (short) (s11 + 1);
                hashSet3 = hashSet2;
                str4 = str2;
                z13 = z12;
                s12 = s10;
            }
            hashSet = hashSet3;
            j10 = 0;
            z11 = false;
            if (z11) {
                fVar.m15727b(j12);
                str2 = str4;
                z12 = z13;
                hashSet2 = hashSet;
            } else {
                if (j10 > 4) {
                    i14 = fVar.readInt();
                    if (z13) {
                        Log.d(str4, "seek to data offset: " + i14);
                    }
                    if (this.f43116c == 7) {
                        if ("MakerNote".equals(dVar.f43138b)) {
                            this.f43122i = i14;
                        } else if (i10 != 6) {
                        }
                    }
                    fVar.m15727b(i14);
                } else {
                    dVar = dVar;
                    hashSet = hashSet;
                    unsignedShort3 = unsignedShort3;
                    i15 = i15;
                }
                num = f43095M.get(Integer.valueOf(unsignedShort2));
                if (z13) {
                    Log.d(str4, "nextIfdType: " + num + " byteCount: " + j10);
                }
                if (num != null) {
                    i13 = unsignedShort3;
                    if (i13 != 3) {
                        if (i13 == 4) {
                            j11 = ((long) fVar.readInt()) & 4294967295L;
                        } else if (i13 == 8) {
                            if (i13 != 9) {
                            }
                            unsignedShort = fVar.readInt();
                        } else {
                            unsignedShort = fVar.readShort();
                        }
                        if (z13) {
                            Log.d(str4, String.format("Offset: %d, tagName: %s", Long.valueOf(j11), dVar.f43138b));
                        }
                        if (j11 > 0) {
                            hashSet2 = hashSet;
                            if (!hashSet2.contains(Integer.valueOf((int) j11))) {
                                fVar.m15727b(j11);
                                m15712s(fVar, num.intValue());
                            } else if (z13) {
                                Log.d(str4, "Skip jump into the IFD since it has already been read: IfdType " + num + " (at " + j11 + ")");
                            }
                        } else {
                            hashSet2 = hashSet;
                            if (z13) {
                                Log.d(str4, "Skip jump into the IFD since its offset is invalid: " + j11);
                            }
                        }
                        fVar.m15727b(j12);
                        str2 = str4;
                        z12 = z13;
                    } else {
                        unsignedShort = fVar.readUnsignedShort();
                    }
                    j11 = unsignedShort;
                    if (z13) {
                        Log.d(str4, String.format("Offset: %d, tagName: %s", Long.valueOf(j11), dVar.f43138b));
                    }
                    if (j11 > 0) {
                        hashSet2 = hashSet;
                        if (!hashSet2.contains(Integer.valueOf((int) j11))) {
                            fVar.m15727b(j11);
                            m15712s(fVar, num.intValue());
                        } else if (z13) {
                            Log.d(str4, "Skip jump into the IFD since it has already been read: IfdType " + num + " (at " + j11 + ")");
                        }
                    } else {
                        hashSet2 = hashSet;
                        if (z13) {
                            Log.d(str4, "Skip jump into the IFD since its offset is invalid: " + j11);
                        }
                    }
                    fVar.m15727b(j12);
                    str2 = str4;
                    z12 = z13;
                } else {
                    d dVar4 = dVar;
                    hashSet2 = hashSet;
                    int i19 = fVar.f43131c + this.f43121h;
                    byte[] bArr3 = new byte[(int) j10];
                    fVar.readFully(bArr3);
                    str2 = str4;
                    z12 = z13;
                    c cVar3 = new c(i19, bArr3, unsignedShort3, i15);
                    mapArr[i10].put(dVar4.f43138b, cVar3);
                    str3 = dVar4.f43138b;
                    if ("DNGVersion".equals(str3)) {
                        this.f43116c = 3;
                    }
                    if (!"Make".equals(str3)) {
                    }
                    this.f43116c = 8;
                    if (fVar.f43131c != j12) {
                        fVar.m15727b(j12);
                    }
                }
            }
            s13 = (short) (s11 + 1);
            hashSet3 = hashSet2;
            str4 = str2;
            z13 = z12;
            s12 = s10;
        }
        HashSet hashSet4 = hashSet3;
        String str5 = str4;
        boolean z14 = z13;
        int i20 = fVar.readInt();
        if (z14) {
            str = str5;
            Log.d(str, String.format("nextIfdOffset: %d", Integer.valueOf(i20)));
        } else {
            str = str5;
        }
        long j13 = i20;
        if (j13 <= 0) {
            if (z14) {
                Log.d(str, "Stop reading file since a wrong offset may cause an infinite loop: " + i20);
                return;
            }
            return;
        }
        if (hashSet4.contains(Integer.valueOf(i20))) {
            if (z14) {
                Log.d(str, "Stop reading file since re-reading an IFD may cause an infinite loop: " + i20);
                return;
            }
            return;
        }
        fVar.m15727b(j13);
        if (mapArr[4].isEmpty()) {
            m15712s(fVar, 4);
        } else if (mapArr[5].isEmpty()) {
            m15712s(fVar, 5);
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m15713t(String str, int i10, String str2) {
        HashMap<String, c>[] mapArr = this.f43117d;
        if (mapArr[i10].isEmpty() || mapArr[i10].get(str) == null) {
            return;
        }
        HashMap<String, c> map = mapArr[i10];
        map.put(str2, map.get(str));
        mapArr[i10].remove(str);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0073  */
    /* JADX WARN: Code duplicated, block: B:30:0x0077  */
    /* JADX INFO: renamed from: u */
    public final void m15714u(b bVar) throws Throwable {
        boolean z10;
        c cVar;
        int iM15724f;
        HashMap<String, c> map = this.f43117d[4];
        c cVar2 = map.get("Compression");
        if (cVar2 == null) {
            m15707m(bVar, map);
            return;
        }
        int iM15724f2 = cVar2.m15724f(this.f43119f);
        if (iM15724f2 != 1) {
            if (iM15724f2 == 6) {
                m15707m(bVar, map);
                return;
            } else if (iM15724f2 != 7) {
                return;
            }
        }
        c cVar3 = map.get("BitsPerSample");
        if (cVar3 != null) {
            int[] iArr = (int[]) cVar3.m15726h(this.f43119f);
            int[] iArr2 = f43102o;
            if (Arrays.equals(iArr2, iArr) || (this.f43116c == 3 && (cVar = map.get("PhotometricInterpretation")) != null && (((iM15724f = cVar.m15724f(this.f43119f)) == 1 && Arrays.equals(iArr, f43103p)) || (iM15724f == 6 && Arrays.equals(iArr, iArr2))))) {
                z10 = true;
            } else {
                if (f43099l) {
                    Log.d("ExifInterface", "Unsupported data type value");
                }
                z10 = false;
            }
        } else {
            if (f43099l) {
                Log.d("ExifInterface", "Unsupported data type value");
            }
            z10 = false;
        }
        if (z10) {
            c cVar4 = map.get("StripOffsets");
            c cVar5 = map.get("StripByteCounts");
            if (cVar4 == null || cVar5 == null) {
                return;
            }
            long[] jArrM15729b = C7914b.m15729b(cVar4.m15726h(this.f43119f));
            long[] jArrM15729b2 = C7914b.m15729b(cVar5.m15726h(this.f43119f));
            if (jArrM15729b == null || jArrM15729b.length == 0) {
                Log.w("ExifInterface", "stripOffsets should not be null or have zero length.");
                return;
            }
            if (jArrM15729b2 == null || jArrM15729b2.length == 0) {
                Log.w("ExifInterface", "stripByteCounts should not be null or have zero length.");
                return;
            }
            if (jArrM15729b.length != jArrM15729b2.length) {
                Log.w("ExifInterface", "stripOffsets and stripByteCounts should have same length.");
                return;
            }
            long j10 = 0;
            for (long j11 : jArrM15729b2) {
                j10 += j11;
            }
            byte[] bArr = new byte[(int) j10];
            this.f43120g = true;
            int i10 = 0;
            int i11 = 0;
            for (int i12 = 0; i12 < jArrM15729b.length; i12++) {
                int i13 = (int) jArrM15729b[i12];
                int i14 = (int) jArrM15729b2[i12];
                if (i12 < jArrM15729b.length - 1 && i13 + i14 != jArrM15729b[i12 + 1]) {
                    this.f43120g = false;
                }
                int i15 = i13 - i10;
                if (i15 < 0) {
                    Log.d("ExifInterface", "Invalid strip offset value");
                    return;
                }
                long j12 = i15;
                if (bVar.skip(j12) != j12) {
                    Log.d("ExifInterface", "Failed to skip " + i15 + " bytes.");
                    return;
                }
                int i16 = i10 + i15;
                byte[] bArr2 = new byte[i14];
                if (bVar.read(bArr2) != i14) {
                    Log.d("ExifInterface", "Failed to read " + i14 + " bytes.");
                    return;
                }
                i10 = i16 + i14;
                System.arraycopy(bArr2, 0, bArr, i11, i14);
                i11 += i14;
            }
            if (this.f43120g) {
                long j13 = jArrM15729b[0];
            }
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m15715v(int i10, int i11) throws Throwable {
        HashMap<String, c>[] mapArr = this.f43117d;
        boolean zIsEmpty = mapArr[i10].isEmpty();
        boolean z10 = f43099l;
        if (!zIsEmpty && !mapArr[i11].isEmpty()) {
            c cVar = mapArr[i10].get("ImageLength");
            c cVar2 = mapArr[i10].get("ImageWidth");
            c cVar3 = mapArr[i11].get("ImageLength");
            c cVar4 = mapArr[i11].get("ImageWidth");
            if (cVar != null && cVar2 != null) {
                if (cVar3 != null && cVar4 != null) {
                    int iM15724f = cVar.m15724f(this.f43119f);
                    int iM15724f2 = cVar2.m15724f(this.f43119f);
                    int iM15724f3 = cVar3.m15724f(this.f43119f);
                    int iM15724f4 = cVar4.m15724f(this.f43119f);
                    if (iM15724f >= iM15724f3 || iM15724f2 >= iM15724f4) {
                        return;
                    }
                    HashMap<String, c> map = mapArr[i10];
                    mapArr[i10] = mapArr[i11];
                    mapArr[i11] = map;
                    return;
                }
                if (z10) {
                    Log.d("ExifInterface", "Second image does not contain valid size information");
                    return;
                }
                return;
            }
            if (z10) {
                Log.d("ExifInterface", "First image does not contain valid size information");
                return;
            }
            return;
        }
        if (z10) {
            Log.d("ExifInterface", "Cannot perform swap since only one image data exists");
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m15716w(f fVar, int i10) throws Throwable {
        c cVarM15722d;
        c cVarM15722d2;
        HashMap<String, c>[] mapArr = this.f43117d;
        c cVar = mapArr[i10].get("DefaultCropSize");
        c cVar2 = mapArr[i10].get("SensorTopBorder");
        c cVar3 = mapArr[i10].get("SensorLeftBorder");
        c cVar4 = mapArr[i10].get("SensorBottomBorder");
        c cVar5 = mapArr[i10].get("SensorRightBorder");
        if (cVar != null) {
            if (cVar.f43133a == 5) {
                e[] eVarArr = (e[]) cVar.m15726h(this.f43119f);
                if (eVarArr == null || eVarArr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(eVarArr));
                    return;
                }
                cVarM15722d = c.m15721c(eVarArr[0], this.f43119f);
                cVarM15722d2 = c.m15721c(eVarArr[1], this.f43119f);
            } else {
                int[] iArr = (int[]) cVar.m15726h(this.f43119f);
                if (iArr == null || iArr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(iArr));
                    return;
                }
                cVarM15722d = c.m15722d(iArr[0], this.f43119f);
                cVarM15722d2 = c.m15722d(iArr[1], this.f43119f);
            }
            mapArr[i10].put("ImageWidth", cVarM15722d);
            mapArr[i10].put("ImageLength", cVarM15722d2);
            return;
        }
        if (cVar2 != null && cVar3 != null && cVar4 != null && cVar5 != null) {
            int iM15724f = cVar2.m15724f(this.f43119f);
            int iM15724f2 = cVar4.m15724f(this.f43119f);
            int iM15724f3 = cVar5.m15724f(this.f43119f);
            int iM15724f4 = cVar3.m15724f(this.f43119f);
            if (iM15724f2 <= iM15724f || iM15724f3 <= iM15724f4) {
                return;
            }
            c cVarM15722d3 = c.m15722d(iM15724f2 - iM15724f, this.f43119f);
            c cVarM15722d4 = c.m15722d(iM15724f3 - iM15724f4, this.f43119f);
            mapArr[i10].put("ImageLength", cVarM15722d3);
            mapArr[i10].put("ImageWidth", cVarM15722d4);
            return;
        }
        c cVar6 = mapArr[i10].get("ImageLength");
        c cVar7 = mapArr[i10].get("ImageWidth");
        if (cVar6 == null || cVar7 == null) {
            c cVar8 = mapArr[i10].get("JPEGInterchangeFormat");
            c cVar9 = mapArr[i10].get("JPEGInterchangeFormatLength");
            if (cVar8 == null || cVar9 == null) {
                return;
            }
            int iM15724f5 = cVar8.m15724f(this.f43119f);
            int iM15724f6 = cVar8.m15724f(this.f43119f);
            fVar.m15727b(iM15724f5);
            byte[] bArr = new byte[iM15724f6];
            fVar.read(bArr);
            m15699e(new b(bArr), iM15724f5, i10);
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m15717x() throws Throwable {
        m15715v(0, 5);
        m15715v(0, 4);
        m15715v(5, 4);
        HashMap<String, c>[] mapArr = this.f43117d;
        c cVar = mapArr[1].get("PixelXDimension");
        c cVar2 = mapArr[1].get("PixelYDimension");
        if (cVar != null && cVar2 != null) {
            mapArr[0].put("ImageWidth", cVar);
            mapArr[0].put("ImageLength", cVar2);
        }
        if (mapArr[4].isEmpty() && m15708n(mapArr[5])) {
            mapArr[4] = mapArr[5];
            mapArr[5] = new HashMap<>();
        }
        if (!m15708n(mapArr[4])) {
            Log.d("ExifInterface", "No image meets the size requirements of a thumbnail image.");
        }
        m15713t("ThumbnailOrientation", 0, "Orientation");
        m15713t("ThumbnailImageLength", 0, "ImageLength");
        m15713t("ThumbnailImageWidth", 0, "ImageWidth");
        m15713t("ThumbnailOrientation", 5, "Orientation");
        m15713t("ThumbnailImageLength", 5, "ImageLength");
        m15713t("ThumbnailImageWidth", 5, "ImageWidth");
        m15713t("Orientation", 4, "ThumbnailOrientation");
        m15713t("ImageLength", 4, "ThumbnailImageLength");
        m15713t("ImageWidth", 4, "ThumbnailImageWidth");
    }
}
