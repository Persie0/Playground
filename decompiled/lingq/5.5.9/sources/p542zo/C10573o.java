package p542zo;

import ae.C0062b;
import android.support.v4.media.session.C0166e;
import androidx.activity.result.C0204c;
import androidx.datastore.preferences.PreferencesProto$Value;
import com.android.installreferrer.api.InstallReferrerClient;
import com.kochava.tracker.BuildConfig;
import dm.C5207g;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import jm.C6524g;
import kotlin.collections.C6752c;
import okhttp3.internal.http2.ErrorCode;
import okio.ByteString;
import p124fp.C5608e;
import p124fp.C5622s;
import p124fp.C5628y;
import p124fp.InterfaceC5610g;
import p124fp.InterfaceC5627x;
import tl.C9322j;
import to.C9347b;

/* JADX INFO: renamed from: zo.o */
/* JADX INFO: loaded from: classes2.dex */
public final class C10573o implements Closeable {

    /* JADX INFO: renamed from: e */
    public static final Logger f52742e;

    /* JADX INFO: renamed from: a */
    public final InterfaceC5610g f52743a;

    /* JADX INFO: renamed from: b */
    public final boolean f52744b;

    /* JADX INFO: renamed from: c */
    public final b f52745c;

    /* JADX INFO: renamed from: d */
    public final C10560b.a f52746d;

    /* JADX INFO: renamed from: zo.o$a */
    public static final class a {
        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        /* JADX INFO: renamed from: a */
        public static int m19563a(int i10, int i11, int i12) throws IOException {
            if ((i11 & 8) != 0) {
                i10--;
            }
            if (i12 <= i10) {
                return i10 - i12;
            }
            throw new IOException(C0204c.m851j("PROTOCOL_ERROR padding ", i12, " > remaining length ", i10));
        }
    }

    /* JADX INFO: renamed from: zo.o$b */
    public static final class b implements InterfaceC5627x {

        /* JADX INFO: renamed from: a */
        public final InterfaceC5610g f52747a;

        /* JADX INFO: renamed from: b */
        public int f52748b;

        /* JADX INFO: renamed from: c */
        public int f52749c;

        /* JADX INFO: renamed from: d */
        public int f52750d;

        /* JADX INFO: renamed from: e */
        public int f52751e;

        /* JADX INFO: renamed from: f */
        public int f52752f;

        public b(InterfaceC5610g interfaceC5610g) {
            this.f52747a = interfaceC5610g;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
        }

        @Override // p124fp.InterfaceC5627x
        /* JADX INFO: renamed from: g */
        public final C5628y mo11923g() {
            return this.f52747a.mo11923g();
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // p124fp.InterfaceC5627x
        /* JADX INFO: renamed from: j0 */
        public final long mo11924j0(C5608e c5608e, long j10) throws IOException {
            int i10;
            int i11;
            C5207g.m11111f(c5608e, "sink");
            do {
                int i12 = this.f52751e;
                InterfaceC5610g interfaceC5610g = this.f52747a;
                if (i12 != 0) {
                    long jMo11924j0 = interfaceC5610g.mo11924j0(c5608e, Math.min(j10, i12));
                    if (jMo11924j0 == -1) {
                        return -1L;
                    }
                    this.f52751e -= (int) jMo11924j0;
                    return jMo11924j0;
                }
                interfaceC5610g.skip(this.f52752f);
                this.f52752f = 0;
                if ((this.f52749c & 4) != 0) {
                    return -1L;
                }
                i10 = this.f52750d;
                int iM17713t = C9347b.m17713t(interfaceC5610g);
                this.f52751e = iM17713t;
                this.f52748b = iM17713t;
                int i13 = interfaceC5610g.readByte() & 255;
                this.f52749c = interfaceC5610g.readByte() & 255;
                Logger logger = C10573o.f52742e;
                if (logger.isLoggable(Level.FINE)) {
                    C10561c c10561c = C10561c.f52657a;
                    int i14 = this.f52750d;
                    int i15 = this.f52748b;
                    int i16 = this.f52749c;
                    c10561c.getClass();
                    logger.fine(C10561c.m19539a(true, i14, i15, i13, i16));
                }
                i11 = interfaceC5610g.readInt() & Integer.MAX_VALUE;
                this.f52750d = i11;
                if (i13 != 9) {
                    throw new IOException(i13 + " != TYPE_CONTINUATION");
                }
            } while (i11 == i10);
            throw new IOException("TYPE_CONTINUATION streamId changed");
        }
    }

    /* JADX INFO: renamed from: zo.o$c */
    public interface c {
        /* JADX INFO: renamed from: a */
        void mo19549a(int i10, List list) throws IOException;

        /* JADX INFO: renamed from: b */
        void mo19550b();

        /* JADX INFO: renamed from: c */
        void mo19551c(C10578t c10578t);

        /* JADX INFO: renamed from: d */
        void mo19552d(int i10, long j10);

        /* JADX INFO: renamed from: e */
        void mo19553e(int i10, int i11, boolean z10);

        /* JADX INFO: renamed from: f */
        void mo19554f();

        /* JADX INFO: renamed from: g */
        void mo19555g(int i10, ErrorCode errorCode);

        /* JADX INFO: renamed from: i */
        void mo19556i(int i10, List list, boolean z10);

        /* JADX INFO: renamed from: j */
        void mo19557j(int i10, ErrorCode errorCode, ByteString byteString);

        /* JADX INFO: renamed from: k */
        void mo19558k(int i10, int i11, InterfaceC5610g interfaceC5610g, boolean z10) throws IOException;
    }

    static {
        Logger logger = Logger.getLogger(C10561c.class.getName());
        C5207g.m11110e(logger, "getLogger(Http2::class.java.name)");
        f52742e = logger;
    }

    public C10573o(InterfaceC5610g interfaceC5610g, boolean z10) {
        this.f52743a = interfaceC5610g;
        this.f52744b = z10;
        b bVar = new b(interfaceC5610g);
        this.f52745c = bVar;
        this.f52746d = new C10560b.a(bVar);
    }

    /* JADX WARN: Code duplicated, block: B:149:0x02b8  */
    /* JADX WARN: Code duplicated, block: B:150:0x02be  */
    /* JADX WARN: Code duplicated, block: B:45:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:47:0x0104  */
    /* JADX WARN: Code duplicated, block: B:49:0x0112  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Unreachable blocks removed: 12, instructions: 12 */
    /* JADX INFO: renamed from: a */
    public final boolean m19559a(boolean z10, c cVar) throws IOException {
        int i10;
        ByteString byteStringMo11968t;
        InterfaceC5610g interfaceC5610g = this.f52743a;
        C5207g.m11111f(cVar, "handler");
        try {
            interfaceC5610g.mo11960o1(9L);
            int iM17713t = C9347b.m17713t(interfaceC5610g);
            if (iM17713t > 16384) {
                throw new IOException(C5207g.m11116k(Integer.valueOf(iM17713t), "FRAME_SIZE_ERROR: "));
            }
            int i11 = interfaceC5610g.readByte() & 255;
            int i12 = interfaceC5610g.readByte() & 255;
            int i13 = interfaceC5610g.readInt() & Integer.MAX_VALUE;
            Level level = Level.FINE;
            Logger logger = f52742e;
            if (logger.isLoggable(level)) {
                C10561c.f52657a.getClass();
                logger.fine(C10561c.m19539a(true, i13, iM17713t, i11, i12));
            }
            if (z10 && i11 != 4) {
                C10561c.f52657a.getClass();
                String[] strArr = C10561c.f52659c;
                throw new IOException(C5207g.m11116k(i11 < strArr.length ? strArr[i11] : C9347b.m17702i("0x%02x", Integer.valueOf(i11)), "Expected a SETTINGS frame but was "));
            }
            ErrorCode errorCode = null;
            switch (i11) {
                case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                    if (i13 == 0) {
                        throw new IOException("PROTOCOL_ERROR: TYPE_DATA streamId == 0");
                    }
                    boolean z11 = (i12 & 1) != 0;
                    if (((i12 & 32) != 0) == true) {
                        throw new IOException("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA");
                    }
                    int i14 = (i12 & 8) != 0 ? interfaceC5610g.readByte() & 255 : 0;
                    cVar.mo19558k(i13, a.m19563a(iM17713t, i12, i14), interfaceC5610g, z11);
                    interfaceC5610g.skip(i14);
                    return true;
                case 1:
                    if (i13 == 0) {
                        throw new IOException("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
                    }
                    boolean z12 = (i12 & 1) != 0;
                    int i15 = (i12 & 8) != 0 ? interfaceC5610g.readByte() & 255 : 0;
                    if ((i12 & 32) != 0) {
                        m19562q(cVar, i13);
                        iM17713t -= 5;
                    }
                    cVar.mo19556i(i13, m19561l(a.m19563a(iM17713t, i12, i15), i15, i12, i13), z12);
                    return true;
                case 2:
                    if (iM17713t != 5) {
                        throw new IOException(C0166e.m762h("TYPE_PRIORITY length: ", iM17713t, " != 5"));
                    }
                    if (i13 == 0) {
                        throw new IOException("TYPE_PRIORITY streamId == 0");
                    }
                    m19562q(cVar, i13);
                    return true;
                case 3:
                    if (iM17713t != 4) {
                        throw new IOException(C0166e.m762h("TYPE_RST_STREAM length: ", iM17713t, " != 4"));
                    }
                    if (i13 == 0) {
                        throw new IOException("TYPE_RST_STREAM streamId == 0");
                    }
                    int i16 = interfaceC5610g.readInt();
                    ErrorCode.INSTANCE.getClass();
                    for (ErrorCode errorCode2 : ErrorCode.values()) {
                        if ((errorCode2.getHttpCode() == i16) == true) {
                            errorCode = errorCode2;
                            if (errorCode != null) {
                                throw new IOException(C5207g.m11116k(Integer.valueOf(i16), "TYPE_RST_STREAM unexpected error code: "));
                            }
                            cVar.mo19555g(i13, errorCode);
                            return true;
                        }
                    }
                    if (errorCode != null) {
                        throw new IOException(C5207g.m11116k(Integer.valueOf(i16), "TYPE_RST_STREAM unexpected error code: "));
                    }
                    cVar.mo19555g(i13, errorCode);
                    return true;
                case 4:
                    if (i13 != 0) {
                        throw new IOException("TYPE_SETTINGS streamId != 0");
                    }
                    if ((i12 & 1) != 0) {
                        if (iM17713t != 0) {
                            throw new IOException("FRAME_SIZE_ERROR ack frame should be empty!");
                        }
                        cVar.mo19550b();
                    } else {
                        if (iM17713t % 6 != 0) {
                            throw new IOException(C5207g.m11116k(Integer.valueOf(iM17713t), "TYPE_SETTINGS length % 6 != 0: "));
                        }
                        C10578t c10578t = new C10578t();
                        C6524g c6524gM356i2 = C0062b.m356i2(C0062b.m411w2(0, iM17713t), 6);
                        int i17 = c6524gM356i2.f37163a;
                        int i18 = c6524gM356i2.f37164b;
                        int i19 = c6524gM356i2.f37165c;
                        if ((i19 > 0 && i17 <= i18) || (i19 < 0 && i18 <= i17)) {
                            while (true) {
                                int i20 = i17 + i19;
                                short s10 = interfaceC5610g.readShort();
                                byte[] bArr = C9347b.f48082a;
                                int i21 = s10 & 65535;
                                i10 = interfaceC5610g.readInt();
                                if (i21 != 2) {
                                    if (i21 == 3) {
                                        i21 = 4;
                                    } else if (i21 == 4) {
                                        if (i10 < 0) {
                                            throw new IOException("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1");
                                        }
                                        i21 = 7;
                                    } else if (i21 == 5 && (i10 < 16384 || i10 > 16777215)) {
                                    }
                                } else if (i10 != 0 && i10 != 1) {
                                    throw new IOException("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1");
                                }
                                c10578t.m19588c(i21, i10);
                                if (i17 != i18) {
                                    i17 = i20;
                                }
                            }
                            throw new IOException(C5207g.m11116k(Integer.valueOf(i10), "PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: "));
                        }
                        cVar.mo19551c(c10578t);
                    }
                    return true;
                case 5:
                    if (i13 == 0) {
                        throw new IOException("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
                    }
                    int i22 = (i12 & 8) != 0 ? interfaceC5610g.readByte() & 255 : 0;
                    cVar.mo19549a(interfaceC5610g.readInt() & Integer.MAX_VALUE, m19561l(a.m19563a(iM17713t - 4, i12, i22), i22, i12, i13));
                    return true;
                case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                    if (iM17713t != 8) {
                        throw new IOException(C5207g.m11116k(Integer.valueOf(iM17713t), "TYPE_PING length != 8: "));
                    }
                    if (i13 != 0) {
                        throw new IOException("TYPE_PING streamId != 0");
                    }
                    cVar.mo19553e(interfaceC5610g.readInt(), interfaceC5610g.readInt(), (i12 & 1) != 0);
                    return true;
                case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                    if (iM17713t < 8) {
                        throw new IOException(C5207g.m11116k(Integer.valueOf(iM17713t), "TYPE_GOAWAY length < 8: "));
                    }
                    if (i13 != 0) {
                        throw new IOException("TYPE_GOAWAY streamId != 0");
                    }
                    int i23 = interfaceC5610g.readInt();
                    int i24 = interfaceC5610g.readInt();
                    int i25 = iM17713t - 8;
                    ErrorCode.INSTANCE.getClass();
                    for (ErrorCode errorCode3 : ErrorCode.values()) {
                        if ((errorCode3.getHttpCode() == i24) == true) {
                            errorCode = errorCode3;
                            if (errorCode != null) {
                                throw new IOException(C5207g.m11116k(Integer.valueOf(i24), "TYPE_GOAWAY unexpected error code: "));
                            }
                            byteStringMo11968t = ByteString.f43897d;
                            if (i25 > 0) {
                                byteStringMo11968t = interfaceC5610g.mo11968t(i25);
                            }
                            cVar.mo19557j(i23, errorCode, byteStringMo11968t);
                            return true;
                        }
                    }
                    if (errorCode != null) {
                        throw new IOException(C5207g.m11116k(Integer.valueOf(i24), "TYPE_GOAWAY unexpected error code: "));
                    }
                    byteStringMo11968t = ByteString.f43897d;
                    if (i25 > 0) {
                        byteStringMo11968t = interfaceC5610g.mo11968t(i25);
                    }
                    cVar.mo19557j(i23, errorCode, byteStringMo11968t);
                    return true;
                case 8:
                    if (iM17713t != 4) {
                        throw new IOException(C5207g.m11116k(Integer.valueOf(iM17713t), "TYPE_WINDOW_UPDATE length !=4: "));
                    }
                    long j10 = ((long) interfaceC5610g.readInt()) & 2147483647L;
                    if (j10 == 0) {
                        throw new IOException("windowSizeIncrement was 0");
                    }
                    cVar.mo19552d(i13, j10);
                    return true;
                default:
                    interfaceC5610g.skip(iM17713t);
                    return true;
            }
        } catch (EOFException unused) {
            return false;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: b */
    public final void m19560b(c cVar) throws IOException {
        C5207g.m11111f(cVar, "handler");
        if (this.f52744b) {
            if (!m19559a(true, cVar)) {
                throw new IOException("Required SETTINGS preface not received");
            }
            return;
        }
        ByteString byteString = C10561c.f52658b;
        ByteString byteStringMo11968t = this.f52743a.mo11968t(byteString.data.length);
        Level level = Level.FINE;
        Logger logger = f52742e;
        if (logger.isLoggable(level)) {
            logger.fine(C9347b.m17702i(C5207g.m11116k(byteStringMo11968t.mo15993s(), "<< CONNECTION "), new Object[0]));
        }
        if (!C5207g.m11106a(byteString, byteStringMo11968t)) {
            throw new IOException(C5207g.m11116k(byteStringMo11968t.m15988A(), "Expected a connection header but was "));
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f52743a.close();
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* JADX INFO: renamed from: l */
    public final List<C10559a> m19561l(int i10, int i11, int i12, int i13) throws IOException {
        b bVar = this.f52745c;
        bVar.f52751e = i10;
        bVar.f52748b = i10;
        bVar.f52752f = i11;
        bVar.f52749c = i12;
        bVar.f52750d = i13;
        while (true) {
            while (true) {
                C10560b.a aVar = this.f52746d;
                C5622s c5622s = aVar.f52643d;
                boolean zMo11936L = c5622s.mo11936L();
                ArrayList arrayList = aVar.f52642c;
                if (zMo11936L) {
                    List<C10559a> listM13453u0 = C6752c.m13453u0(arrayList);
                    arrayList.clear();
                    return listM13453u0;
                }
                byte b10 = c5622s.readByte();
                byte[] bArr = C9347b.f48082a;
                int i14 = b10 & 255;
                if (i14 == 128) {
                    throw new IOException("index == 0");
                }
                boolean z10 = false;
                if ((i14 & BuildConfig.SDK_TRUNCATE_LENGTH) == 128) {
                    int iM19533e = aVar.m19533e(i14, 127) - 1;
                    if (iM19533e >= 0 && iM19533e <= C10560b.f52638a.length - 1) {
                        z10 = true;
                    }
                    if (!z10) {
                        int length = aVar.f52645f + 1 + (iM19533e - C10560b.f52638a.length);
                        if (length >= 0) {
                            C10559a[] c10559aArr = aVar.f52644e;
                            if (length < c10559aArr.length) {
                                C10559a c10559a = c10559aArr[length];
                                C5207g.m11108c(c10559a);
                                arrayList.add(c10559a);
                            }
                        }
                        throw new IOException(C5207g.m11116k(Integer.valueOf(iM19533e + 1), "Header index too large "));
                    }
                    arrayList.add(C10560b.f52638a[iM19533e]);
                } else if (i14 == 64) {
                    C10559a[] c10559aArr2 = C10560b.f52638a;
                    ByteString byteStringM19532d = aVar.m19532d();
                    C10560b.m19528a(byteStringM19532d);
                    aVar.m19531c(new C10559a(byteStringM19532d, aVar.m19532d()));
                } else if ((i14 & 64) == 64) {
                    aVar.m19531c(new C10559a(aVar.m19530b(aVar.m19533e(i14, 63) - 1), aVar.m19532d()));
                } else if ((i14 & 32) == 32) {
                    int iM19533e2 = aVar.m19533e(i14, 31);
                    aVar.f52641b = iM19533e2;
                    if (iM19533e2 < 0 || iM19533e2 > aVar.f52640a) {
                        throw new IOException(C5207g.m11116k(Integer.valueOf(aVar.f52641b), "Invalid dynamic table size update "));
                    }
                    int i15 = aVar.f52647h;
                    if (iM19533e2 < i15) {
                        if (iM19533e2 == 0) {
                            C9322j.m17679g0(aVar.f52644e, null);
                            aVar.f52645f = aVar.f52644e.length - 1;
                            aVar.f52646g = 0;
                            aVar.f52647h = 0;
                        } else {
                            aVar.m19529a(i15 - iM19533e2);
                        }
                    }
                } else if (i14 == 16 || i14 == 0) {
                    C10559a[] c10559aArr3 = C10560b.f52638a;
                    ByteString byteStringM19532d2 = aVar.m19532d();
                    C10560b.m19528a(byteStringM19532d2);
                    arrayList.add(new C10559a(byteStringM19532d2, aVar.m19532d()));
                } else {
                    arrayList.add(new C10559a(aVar.m19530b(aVar.m19533e(i14, 15) - 1), aVar.m19532d()));
                }
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m19562q(c cVar, int i10) throws IOException {
        InterfaceC5610g interfaceC5610g = this.f52743a;
        interfaceC5610g.readInt();
        interfaceC5610g.readByte();
        byte[] bArr = C9347b.f48082a;
        cVar.mo19554f();
    }
}
