package p000;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.TimeZone;
import java.util.logging.Level;
import java.util.logging.Logger;
import okhttp3.internal.http2.ErrorCode;
import okio.ByteString;

/* JADX INFO: loaded from: classes.dex */
public final class pw3 implements Closeable {

    /* JADX INFO: renamed from: d */
    public static final Logger f56897d;

    /* JADX INFO: renamed from: a */
    public final hj0 f56898a;

    /* JADX INFO: renamed from: b */
    public final ow3 f56899b;

    /* JADX INFO: renamed from: c */
    public final vv3 f56900c;

    static {
        Logger logger = Logger.getLogger(gw3.class.getName());
        logger.getClass();
        f56897d = logger;
    }

    public pw3(e18 e18Var) {
        e18Var.getClass();
        this.f56898a = e18Var;
        ow3 ow3Var = new ow3(e18Var);
        this.f56899b = ow3Var;
        this.f56900c = new vv3(ow3Var);
    }

    /* JADX WARN: Code duplicated, block: B:185:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:193:0x02e6  */
    /* JADX WARN: Code duplicated, block: B:196:0x02ed A[Catch: all -> 0x02f3, TRY_LEAVE, TryCatch #0 {, blocks: (B:194:0x02e7, B:196:0x02ed), top: B:226:0x02e7 }] */
    /* JADX WARN: Code duplicated, block: B:205:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:226:0x02e7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:236:0x0118 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x0102  */
    /* JADX WARN: Code duplicated, block: B:68:0x0106  */
    /* JADX WARN: Code duplicated, block: B:75:0x012c  */
    /* JADX WARN: Code duplicated, block: B:95:0x015f  */
    /* JADX INFO: renamed from: a */
    public final boolean m19539a(boolean z, m92 m92Var) throws Exception {
        mw3 mw3Var;
        tw3 tw3VarM17067c;
        ByteString byteStringMo497s;
        mw3 mw3Var2;
        try {
            this.f56898a.mo475b0(9L);
            int iM13778n = icb.m13778n(this.f56898a);
            if (iM13778n > 16384) {
                v63.m23133k(ux5.m22988k(iM13778n, "FRAME_SIZE_ERROR: "));
                return false;
            }
            int i = this.f56898a.readByte() & 255;
            byte b = this.f56898a.readByte();
            int i2 = b & 255;
            int i3 = this.f56898a.readInt();
            int i4 = Integer.MAX_VALUE & i3;
            if (i != 8) {
                Logger logger = f56897d;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(gw3.m12931b(true, i4, iM13778n, i, i2));
                }
            }
            if (z && i != 4) {
                v63.m23132j(gw3.m12930a(i), "Expected a SETTINGS frame but was ");
                return false;
            }
            ErrorCode errorCode = null;
            int i5 = 2;
            switch (i) {
                case 0:
                    m19540b(m92Var, iM13778n, i2, i4);
                    return true;
                case 1:
                    m19542e(m92Var, iM13778n, i2, i4);
                    return true;
                case 2:
                    if (iM13778n != 5) {
                        v63.m23133k(ux5.m22989l("TYPE_PRIORITY length: ", iM13778n, " != 5"));
                        return false;
                    }
                    if (i4 == 0) {
                        v63.m23133k("TYPE_PRIORITY streamId == 0");
                        return false;
                    }
                    hj0 hj0Var = this.f56898a;
                    hj0Var.readInt();
                    hj0Var.readByte();
                    return true;
                case 3:
                    if (iM13778n != 4) {
                        v63.m23133k(ux5.m22989l("TYPE_RST_STREAM length: ", iM13778n, " != 4"));
                        return false;
                    }
                    if (i4 == 0) {
                        v63.m23133k("TYPE_RST_STREAM streamId == 0");
                        return false;
                    }
                    int i6 = this.f56898a.readInt();
                    ErrorCode.Companion.getClass();
                    for (ErrorCode errorCode2 : ErrorCode.values()) {
                        if (errorCode2.getHttpCode() == i6) {
                            errorCode = errorCode2;
                            if (errorCode != null) {
                                v63.m23133k(ux5.m22988k(i6, "TYPE_RST_STREAM unexpected error code: "));
                                return false;
                            }
                            mw3Var = (mw3) m92Var.f50810c;
                            if (i4 == 0 && (i3 & 1) == 0) {
                                zr9.m25750b(mw3Var.f51934i, mw3Var.f51928c + '[' + i4 + "] onReset", new yl3(mw3Var, i4, errorCode));
                                return true;
                            }
                            tw3VarM17067c = mw3Var.m17067c(i4);
                            if (tw3VarM17067c != null) {
                                synchronized (tw3VarM17067c) {
                                    if (tw3VarM17067c.m22322g() == null) {
                                        tw3VarM17067c.f63005l = errorCode;
                                        tw3VarM17067c.notifyAll();
                                    }
                                    break;
                                }
                                return true;
                            }
                            return true;
                        }
                    }
                    if (errorCode != null) {
                        v63.m23133k(ux5.m22988k(i6, "TYPE_RST_STREAM unexpected error code: "));
                        return false;
                    }
                    mw3Var = (mw3) m92Var.f50810c;
                    if (i4 == 0) {
                    }
                    tw3VarM17067c = mw3Var.m17067c(i4);
                    if (tw3VarM17067c != null) {
                        synchronized (tw3VarM17067c) {
                            if (tw3VarM17067c.m22322g() == null) {
                                tw3VarM17067c.f63005l = errorCode;
                                tw3VarM17067c.notifyAll();
                                break;
                            }
                            return true;
                        }
                    }
                    return true;
                case 4:
                    hj0 hj0Var2 = this.f56898a;
                    if (i4 != 0) {
                        v63.m23133k("TYPE_SETTINGS streamId != 0");
                        return false;
                    }
                    if ((b & 1) != 0) {
                        if (iM13778n != 0) {
                            v63.m23133k("FRAME_SIZE_ERROR ack frame should be empty!");
                            return false;
                        }
                        return true;
                    }
                    if (iM13778n % 6 != 0) {
                        v63.m23133k(ux5.m22988k(iM13778n, "TYPE_SETTINGS length % 6 != 0: "));
                        return false;
                    }
                    h09 h09Var = new h09();
                    g84 g84VarM15914E = l70.m15914E(6, l70.m15922M(0, iM13778n));
                    int i7 = g84VarM15914E.f40379a;
                    int i8 = g84VarM15914E.f40380b;
                    int i9 = g84VarM15914E.f40381c;
                    if ((i9 > 0 && i7 <= i8) || (i9 < 0 && i8 <= i7)) {
                        while (true) {
                            short s = hj0Var2.readShort();
                            byte[] bArr = icb.f43946a;
                            int i10 = s & 65535;
                            int i11 = hj0Var2.readInt();
                            if (i10 != 2) {
                                if (i10 != 4) {
                                    if (i10 == 5 && (i11 < 16384 || i11 > 16777215)) {
                                        v63.m23133k(ux5.m22988k(i11, "PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: "));
                                        return false;
                                    }
                                } else if (i11 < 0) {
                                    v63.m23133k("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1");
                                    return false;
                                }
                            } else if (i11 != 0 && i11 != 1) {
                                v63.m23133k("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1");
                                return false;
                            }
                            h09Var.m12994b(i10, i11);
                            if (i7 != i8) {
                                i7 += i9;
                            }
                        }
                    }
                    mw3 mw3Var3 = (mw3) m92Var.f50810c;
                    zr9.m25750b(mw3Var3.f51933h, AbstractC3393o1.m17738m(new StringBuilder(), mw3Var3.f51928c, " applyAndAckSettings"), new C3006fm(11, m92Var, h09Var));
                    return true;
                case 5:
                    m19543n(m92Var, iM13778n, i2, i4);
                    return true;
                case 6:
                    if (iM13778n != 8) {
                        v63.m23133k(ux5.m22988k(iM13778n, "TYPE_PING length != 8: "));
                        return false;
                    }
                    if (i4 != 0) {
                        v63.m23133k("TYPE_PING streamId != 0");
                        return false;
                    }
                    int i12 = this.f56898a.readInt();
                    int i13 = this.f56898a.readInt();
                    i = (b & 1) != 0 ? 1 : 0;
                    mw3 mw3Var4 = (mw3) m92Var.f50810c;
                    if (i == 0) {
                        zr9.m25750b(mw3Var4.f51933h, AbstractC3393o1.m17738m(new StringBuilder(), ((mw3) m92Var.f50810c).f51928c, " ping"), new cz9((mw3) m92Var.f50810c, i12, i13, i5));
                        return true;
                    }
                    synchronized (mw3Var4) {
                        try {
                            if (i12 == 1) {
                                mw3Var4.f51937l++;
                            } else if (i12 == 2) {
                                mw3Var4.f51914I++;
                            } else if (i12 == 3) {
                                mw3Var4.notifyAll();
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return true;
                case 7:
                    if (iM13778n < 8) {
                        v63.m23133k(ux5.m22988k(iM13778n, "TYPE_GOAWAY length < 8: "));
                        return false;
                    }
                    if (i4 != 0) {
                        v63.m23133k("TYPE_GOAWAY streamId != 0");
                        return false;
                    }
                    int i14 = this.f56898a.readInt();
                    int i15 = this.f56898a.readInt();
                    int i16 = iM13778n - 8;
                    ErrorCode.Companion.getClass();
                    for (ErrorCode errorCode3 : ErrorCode.values()) {
                        if (errorCode3.getHttpCode() == i15) {
                            errorCode = errorCode3;
                            if (errorCode != null) {
                                v63.m23133k(ux5.m22988k(i15, "TYPE_GOAWAY unexpected error code: "));
                                return false;
                            }
                            byteStringMo497s = ByteString.f54513d;
                            if (i16 > 0) {
                                byteStringMo497s = this.f56898a.mo497s(i16);
                            }
                            byteStringMo497s.getClass();
                            byteStringMo497s.mo18078d();
                            mw3Var2 = (mw3) m92Var.f50810c;
                            synchronized (mw3Var2) {
                                Object[] array = mw3Var2.f51927b.values().toArray(new tw3[0]);
                                mw3Var2.f51931f = true;
                            }
                            for (tw3 tw3Var : (tw3[]) array) {
                                if (tw3Var.f62994a <= i14 && tw3Var.m22323h()) {
                                    ErrorCode errorCode4 = ErrorCode.REFUSED_STREAM;
                                    errorCode4.getClass();
                                    synchronized (tw3Var) {
                                        if (tw3Var.m22322g() == null) {
                                            tw3Var.f63005l = errorCode4;
                                            tw3Var.notifyAll();
                                        }
                                        break;
                                    }
                                    ((mw3) m92Var.f50810c).m17067c(tw3Var.f62994a);
                                }
                            }
                            return true;
                        }
                    }
                    if (errorCode != null) {
                        v63.m23133k(ux5.m22988k(i15, "TYPE_GOAWAY unexpected error code: "));
                        return false;
                    }
                    byteStringMo497s = ByteString.f54513d;
                    if (i16 > 0) {
                        byteStringMo497s = this.f56898a.mo497s(i16);
                    }
                    byteStringMo497s.getClass();
                    byteStringMo497s.mo18078d();
                    mw3Var2 = (mw3) m92Var.f50810c;
                    synchronized (mw3Var2) {
                        Object[] array2 = mw3Var2.f51927b.values().toArray(new tw3[0]);
                        mw3Var2.f51931f = true;
                        while (i < r13) {
                            if (tw3Var.f62994a <= i14) {
                            }
                        }
                        return true;
                    }
                case 8:
                    try {
                        if (iM13778n != 4) {
                            throw new IOException("TYPE_WINDOW_UPDATE length !=4: " + iM13778n);
                        }
                        long j = ((long) this.f56898a.readInt()) & 2147483647L;
                        if (j == 0) {
                            throw new IOException("windowSizeIncrement was 0");
                        }
                        Logger logger2 = f56897d;
                        if (logger2.isLoggable(Level.FINE)) {
                            logger2.fine(gw3.m12932c(i4, iM13778n, j, true));
                        }
                        mw3 mw3Var5 = (mw3) m92Var.f50810c;
                        if (i4 == 0) {
                            synchronized (mw3Var5) {
                                mw3Var5.f51921P += j;
                                mw3Var5.notifyAll();
                            }
                            return true;
                        }
                        tw3 tw3VarM17066b = mw3Var5.m17066b(i4);
                        if (tw3VarM17066b != null) {
                            synchronized (tw3VarM17066b) {
                                tw3VarM17066b.f62998e += j;
                                if (j > 0) {
                                    tw3VarM17066b.notifyAll();
                                }
                                break;
                            }
                            return true;
                        }
                        return true;
                    } catch (Exception e) {
                        f56897d.fine(gw3.m12931b(true, i4, iM13778n, 8, i2));
                        throw e;
                    }
                default:
                    this.f56898a.skip(iM13778n);
                    return true;
            }
        } catch (EOFException unused) {
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m19540b(m92 m92Var, int i, int i2, int i3) throws IOException {
        int i4;
        boolean z;
        boolean z2;
        if (i3 == 0) {
            v63.m23133k("PROTOCOL_ERROR: TYPE_DATA streamId == 0");
            return;
        }
        boolean z3 = true;
        if ((i2 & 1) == 0) {
            z3 = false;
        }
        if ((i2 & 32) != 0) {
            v63.m23133k("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA");
            return;
        }
        if ((i2 & 8) != 0) {
            byte b = this.f56898a.readByte();
            byte[] bArr = icb.f43946a;
            i4 = b & 255;
        } else {
            i4 = 0;
        }
        int iM17090I = AbstractC3352my.m17090I(i, i2, i4);
        hj0 hj0Var = this.f56898a;
        hj0Var.getClass();
        mw3 mw3Var = (mw3) m92Var.f50810c;
        if (i3 != 0 && (i3 & 1) == 0) {
            aj0 aj0Var = new aj0();
            long j = iM17090I;
            hj0Var.mo475b0(j);
            hj0Var.mo459F(aj0Var, j);
            zr9.m25750b(mw3Var.f51934i, mw3Var.f51928c + '[' + i3 + "] onData", new iw3(mw3Var, i3, aj0Var, iM17090I, z3));
        } else {
            tw3 tw3VarM17066b = mw3Var.m17066b(i3);
            if (tw3VarM17066b == null) {
                ((mw3) m92Var.f50810c).m17071q(i3, ErrorCode.PROTOCOL_ERROR);
                long j2 = iM17090I;
                ((mw3) m92Var.f50810c).m17069n(j2);
                hj0Var.skip(j2);
            } else {
                TimeZone timeZone = kcb.f47051a;
                rw3 rw3Var = tw3VarM17066b.f63001h;
                long j3 = iM17090I;
                rw3Var.getClass();
                long j4 = j3;
                while (true) {
                    tw3 tw3Var = rw3Var.f59960f;
                    if (j4 <= 0) {
                        TimeZone timeZone2 = kcb.f47051a;
                        tw3Var.f62995b.m17069n(j3);
                        rw3Var.f59960f.f62995b.f51916K.getClass();
                        break;
                    }
                    synchronized (tw3Var) {
                        z = rw3Var.f59956b;
                        z2 = rw3Var.f59958d.f723b + j4 > rw3Var.f59955a;
                    }
                    if (z2) {
                        hj0Var.skip(j4);
                        rw3Var.f59960f.m22321f(ErrorCode.FLOW_CONTROL_ERROR);
                        break;
                    }
                    if (z) {
                        hj0Var.skip(j4);
                        break;
                    }
                    long jMo459F = hj0Var.mo459F(rw3Var.f59957c, j4);
                    if (jMo459F == -1) {
                        throw new EOFException();
                    }
                    j4 -= jMo459F;
                    tw3 tw3Var2 = rw3Var.f59960f;
                    synchronized (tw3Var2) {
                        try {
                            if (rw3Var.f59959e) {
                                rw3Var.f59957c.m473a();
                            } else {
                                aj0 aj0Var2 = rw3Var.f59958d;
                                boolean z4 = aj0Var2.f723b == 0;
                                aj0Var2.mo456B(rw3Var.f59957c);
                                if (z4) {
                                    tw3Var2.notifyAll();
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                if (z3) {
                    tw3VarM17066b.m22325j(qr3.f58109b, true);
                }
            }
        }
        this.f56898a.skip(i4);
    }

    /* JADX INFO: renamed from: c */
    public final List m19541c(int i, int i2, int i3, int i4) throws IOException {
        ow3 ow3Var = this.f56899b;
        ow3Var.f55067e = i;
        ow3Var.f55064b = i;
        ow3Var.f55068f = i2;
        ow3Var.f55065c = i3;
        ow3Var.f55066d = i4;
        vv3 vv3Var = this.f56900c;
        e18 e18Var = vv3Var.f65976c;
        ArrayList arrayList = vv3Var.f65975b;
        while (!e18Var.m10787a()) {
            byte b = e18Var.readByte();
            byte[] bArr = icb.f43946a;
            int i5 = b & 255;
            if (i5 == 128) {
                v63.m23133k("index == 0");
                return null;
            }
            if ((b & 128) == 128) {
                int iM23558e = vv3Var.m23558e(i5, 127);
                int i6 = iM23558e - 1;
                if (i6 >= 0) {
                    jr3[] jr3VarArr = xv3.f68841a;
                    if (i6 <= jr3VarArr.length - 1) {
                        arrayList.add(jr3VarArr[i6]);
                    }
                }
                int length = vv3Var.f65978e + 1 + (i6 - xv3.f68841a.length);
                if (length >= 0) {
                    jr3[] jr3VarArr2 = vv3Var.f65977d;
                    if (length < jr3VarArr2.length) {
                        jr3 jr3Var = jr3VarArr2[length];
                        jr3Var.getClass();
                        arrayList.add(jr3Var);
                    }
                }
                v63.m23133k(ux5.m22988k(iM23558e, "Header index too large "));
                return null;
            }
            if (i5 == 64) {
                jr3[] jr3VarArr3 = xv3.f68841a;
                ByteString byteStringM23557d = vv3Var.m23557d();
                xv3.m24708a(byteStringM23557d);
                vv3Var.m23556c(new jr3(byteStringM23557d, vv3Var.m23557d()));
            } else if ((b & 64) == 64) {
                vv3Var.m23556c(new jr3(vv3Var.m23555b(vv3Var.m23558e(i5, 63) - 1), vv3Var.m23557d()));
            } else if ((b & 32) == 32) {
                int iM23558e2 = vv3Var.m23558e(i5, 31);
                vv3Var.f65974a = iM23558e2;
                if (iM23558e2 < 0 || iM23558e2 > 4096) {
                    throw new IOException("Invalid dynamic table size update " + vv3Var.f65974a);
                }
                int i7 = vv3Var.f65980g;
                if (iM23558e2 < i7) {
                    if (iM23558e2 == 0) {
                        jr3[] jr3VarArr4 = vv3Var.f65977d;
                        AbstractC3550rv.m20833a0(0, jr3VarArr4.length, null, jr3VarArr4);
                        vv3Var.f65978e = vv3Var.f65977d.length - 1;
                        vv3Var.f65979f = 0;
                        vv3Var.f65980g = 0;
                    } else {
                        vv3Var.m23554a(i7 - iM23558e2);
                    }
                }
            } else if (i5 == 16 || i5 == 0) {
                jr3[] jr3VarArr5 = xv3.f68841a;
                ByteString byteStringM23557d2 = vv3Var.m23557d();
                xv3.m24708a(byteStringM23557d2);
                arrayList.add(new jr3(byteStringM23557d2, vv3Var.m23557d()));
            } else {
                arrayList.add(new jr3(vv3Var.m23555b(vv3Var.m23558e(i5, 15) - 1), vv3Var.m23557d()));
            }
        }
        List listM22622n1 = u91.m22622n1(arrayList);
        arrayList.clear();
        return listM22622n1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f56898a.close();
    }

    /* JADX INFO: renamed from: e */
    public final void m19542e(m92 m92Var, int i, int i2, int i3) throws IOException {
        int i4;
        if (i3 == 0) {
            v63.m23133k("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
            return;
        }
        boolean z = false;
        boolean z2 = (i2 & 1) != 0;
        if ((i2 & 8) != 0) {
            byte b = this.f56898a.readByte();
            byte[] bArr = icb.f43946a;
            i4 = b & 255;
        } else {
            i4 = 0;
        }
        if ((i2 & 32) != 0) {
            hj0 hj0Var = this.f56898a;
            hj0Var.readInt();
            hj0Var.readByte();
            byte[] bArr2 = icb.f43946a;
            i -= 5;
        }
        List listM19541c = m19541c(AbstractC3352my.m17090I(i, i2, i4), i4, i2, i3);
        mw3 mw3Var = (mw3) m92Var.f50810c;
        if (i3 != 0 && (i3 & 1) == 0) {
            z = true;
        }
        if (z) {
            zr9.m25750b(mw3Var.f51934i, mw3Var.f51928c + '[' + i3 + "] onHeaders", new jw3(mw3Var, i3, listM19541c, z2));
            return;
        }
        synchronized (mw3Var) {
            tw3 tw3VarM17066b = mw3Var.m17066b(i3);
            if (tw3VarM17066b != null) {
                tw3VarM17066b.m22325j(kcb.m15117h(listM19541c), z2);
                return;
            }
            if (mw3Var.f51931f) {
                return;
            }
            if (i3 <= mw3Var.f51929d) {
                return;
            }
            if (i3 % 2 == mw3Var.f51930e % 2) {
                return;
            }
            tw3 tw3Var = new tw3(i3, mw3Var, false, z2, kcb.m15117h(listM19541c));
            mw3Var.f51929d = i3;
            mw3Var.f51927b.put(Integer.valueOf(i3), tw3Var);
            zr9.m25750b(mw3Var.f51932g.m3023d(), mw3Var.f51928c + '[' + i3 + "] onStream", new C3006fm(10, mw3Var, tw3Var));
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m19543n(m92 m92Var, int i, int i2, int i3) throws IOException {
        int i4;
        if (i3 == 0) {
            v63.m23133k("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
            return;
        }
        if ((i2 & 8) != 0) {
            byte b = this.f56898a.readByte();
            byte[] bArr = icb.f43946a;
            i4 = b & 255;
        } else {
            i4 = 0;
        }
        int i5 = this.f56898a.readInt() & Integer.MAX_VALUE;
        List listM19541c = m19541c(AbstractC3352my.m17090I(i - 4, i2, i4), i4, i2, i3);
        mw3 mw3Var = (mw3) m92Var.f50810c;
        synchronized (mw3Var) {
            if (mw3Var.f51925T.contains(Integer.valueOf(i5))) {
                mw3Var.m17071q(i5, ErrorCode.PROTOCOL_ERROR);
                return;
            }
            mw3Var.f51925T.add(Integer.valueOf(i5));
            zr9.m25750b(mw3Var.f51934i, mw3Var.f51928c + '[' + i5 + "] onRequest", new jw3(mw3Var, i5, listM19541c));
        }
    }
}
