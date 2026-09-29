package p332q5;

import android.util.Log;
import com.kochava.tracker.BuildConfig;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import p003a2.C0009a;

/* JADX INFO: renamed from: q5.d */
/* JADX INFO: loaded from: classes.dex */
public final class C8497d {

    /* JADX INFO: renamed from: b */
    public ByteBuffer f45717b;

    /* JADX INFO: renamed from: c */
    public C8496c f45718c;

    /* JADX INFO: renamed from: a */
    public final byte[] f45716a = new byte[256];

    /* JADX INFO: renamed from: d */
    public int f45719d = 0;

    /* JADX INFO: renamed from: a */
    public final boolean m16588a() {
        return this.f45718c.f45704a != 0;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: b */
    public final C8496c m16589b() {
        byte[] bArr;
        if (this.f45717b == null) {
            throw new IllegalStateException("You must call setData() before parseHeader()");
        }
        if (m16588a()) {
            return this.f45718c;
        }
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < 6; i10++) {
            sb2.append((char) m16590c());
        }
        if (sb2.toString().startsWith("GIF")) {
            this.f45718c.f45706c = m16593f();
            this.f45718c.f45710g = m16593f();
            int iM16590c = m16590c();
            C8496c c8496c = this.f45718c;
            c8496c.f45709f = (iM16590c & BuildConfig.SDK_TRUNCATE_LENGTH) != 0;
            c8496c.f45711h = (int) Math.pow(2.0d, (iM16590c & 7) + 1);
            this.f45718c.f45712i = m16590c();
            C8496c c8496c2 = this.f45718c;
            m16590c();
            c8496c2.getClass();
            if (this.f45718c.f45709f && !m16588a()) {
                C8496c c8496c3 = this.f45718c;
                c8496c3.f45708e = m16592e(c8496c3.f45711h);
                C8496c c8496c4 = this.f45718c;
                c8496c4.f45713j = c8496c4.f45708e[c8496c4.f45712i];
            }
        } else {
            this.f45718c.f45704a = 1;
        }
        if (!m16588a()) {
            boolean z10 = false;
            loop1: while (true) {
                while (true) {
                    if (z10 || m16588a() || this.f45718c.f45705b > Integer.MAX_VALUE) {
                        break loop1;
                    }
                    int iM16590c2 = m16590c();
                    if (iM16590c2 == 33) {
                        int iM16590c3 = m16590c();
                        if (iM16590c3 == 1) {
                            m16594g();
                        } else if (iM16590c3 == 249) {
                            this.f45718c.f45715l = new C8495b();
                            m16590c();
                            int iM16590c4 = m16590c();
                            C8495b c8495b = (C8495b) this.f45718c.f45715l;
                            int i11 = (iM16590c4 & 28) >> 2;
                            c8495b.f45699g = i11;
                            if (i11 == 0) {
                                c8495b.f45699g = 1;
                            }
                            c8495b.f45698f = (iM16590c4 & 1) != 0;
                            int iM16593f = m16593f();
                            if (iM16593f < 2) {
                                iM16593f = 10;
                            }
                            C8495b c8495b2 = (C8495b) this.f45718c.f45715l;
                            c8495b2.f45701i = iM16593f * 10;
                            c8495b2.f45700h = m16590c();
                            m16590c();
                        } else if (iM16590c3 == 254) {
                            m16594g();
                        } else if (iM16590c3 != 255) {
                            m16594g();
                        } else {
                            m16591d();
                            StringBuilder sb3 = new StringBuilder();
                            int i12 = 0;
                            while (true) {
                                bArr = this.f45716a;
                                if (i12 >= 11) {
                                    break;
                                }
                                sb3.append((char) bArr[i12]);
                                i12++;
                            }
                            if (sb3.toString().equals("NETSCAPE2.0")) {
                                while (true) {
                                    m16591d();
                                    if (bArr[0] == 1) {
                                        this.f45718c.f45714k = (bArr[1] & 255) | ((bArr[2] & 255) << 8);
                                    }
                                    if (this.f45719d > 0) {
                                        if (m16588a()) {
                                        }
                                    }
                                }
                            } else {
                                m16594g();
                            }
                        }
                    } else if (iM16590c2 == 44) {
                        C8496c c8496c5 = this.f45718c;
                        if (((C8495b) c8496c5.f45715l) == null) {
                            c8496c5.f45715l = new C8495b();
                        }
                        ((C8495b) this.f45718c.f45715l).f45693a = m16593f();
                        ((C8495b) this.f45718c.f45715l).f45694b = m16593f();
                        ((C8495b) this.f45718c.f45715l).f45695c = m16593f();
                        ((C8495b) this.f45718c.f45715l).f45696d = m16593f();
                        int iM16590c5 = m16590c();
                        boolean z11 = (iM16590c5 & BuildConfig.SDK_TRUNCATE_LENGTH) != 0;
                        int iPow = (int) Math.pow(2.0d, (iM16590c5 & 7) + 1);
                        C8495b c8495b3 = (C8495b) this.f45718c.f45715l;
                        c8495b3.f45697e = (iM16590c5 & 64) != 0;
                        if (z11) {
                            c8495b3.f45703k = m16592e(iPow);
                        } else {
                            c8495b3.f45703k = null;
                        }
                        ((C8495b) this.f45718c.f45715l).f45702j = this.f45717b.position();
                        m16590c();
                        m16594g();
                        if (!m16588a()) {
                            C8496c c8496c6 = this.f45718c;
                            c8496c6.f45705b++;
                            c8496c6.f45707d.add((C8495b) c8496c6.f45715l);
                        }
                    } else if (iM16590c2 != 59) {
                        this.f45718c.f45704a = 1;
                    } else {
                        z10 = true;
                    }
                }
            }
            C8496c c8496c7 = this.f45718c;
            if (c8496c7.f45705b < 0) {
                c8496c7.f45704a = 1;
            }
        }
        return this.f45718c;
    }

    /* JADX INFO: renamed from: c */
    public final int m16590c() {
        try {
            return this.f45717b.get() & 255;
        } catch (Exception unused) {
            this.f45718c.f45704a = 1;
            return 0;
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m16591d() {
        int iM16590c = m16590c();
        this.f45719d = iM16590c;
        if (iM16590c > 0) {
            int i10 = 0;
            int i11 = 0;
            while (true) {
                try {
                    int i12 = this.f45719d;
                    if (i10 >= i12) {
                        break;
                    }
                    i11 = i12 - i10;
                    this.f45717b.get(this.f45716a, i10, i11);
                    i10 += i11;
                } catch (Exception e10) {
                    if (Log.isLoggable("GifHeaderParser", 3)) {
                        StringBuilder sbM25n = C0009a.m25n("Error Reading Block n: ", i10, " count: ", i11, " blockSize: ");
                        sbM25n.append(this.f45719d);
                        Log.d("GifHeaderParser", sbM25n.toString(), e10);
                    }
                    this.f45718c.f45704a = 1;
                }
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final int[] m16592e(int i10) {
        byte[] bArr = new byte[i10 * 3];
        int[] iArr = null;
        try {
            this.f45717b.get(bArr);
            iArr = new int[256];
            int i11 = 0;
            int i12 = 0;
            while (i11 < i10) {
                int i13 = i12 + 1;
                int i14 = i13 + 1;
                int i15 = i14 + 1;
                int i16 = i11 + 1;
                iArr[i11] = ((bArr[i12] & 255) << 16) | (-16777216) | ((bArr[i13] & 255) << 8) | (bArr[i14] & 255);
                i12 = i15;
                i11 = i16;
            }
        } catch (BufferUnderflowException e10) {
            if (Log.isLoggable("GifHeaderParser", 3)) {
                Log.d("GifHeaderParser", "Format Error Reading Color Table", e10);
            }
            this.f45718c.f45704a = 1;
        }
        return iArr;
    }

    /* JADX INFO: renamed from: f */
    public final int m16593f() {
        return this.f45717b.getShort();
    }

    /* JADX INFO: renamed from: g */
    public final void m16594g() {
        int iM16590c;
        do {
            iM16590c = m16590c();
            this.f45717b.position(Math.min(this.f45717b.position() + iM16590c, this.f45717b.limit()));
        } while (iM16590c > 0);
    }
}
