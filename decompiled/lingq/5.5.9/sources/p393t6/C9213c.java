package p393t6;

import android.support.v4.media.session.C0166e;
import android.util.Log;
import com.clevertap.android.sdk.CleverTapAPI;
import com.kochava.tracker.BuildConfig;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.InterfaceC7116c;
import p332q5.C8496c;

/* JADX INFO: renamed from: t6.c */
/* JADX INFO: loaded from: classes.dex */
public final class C9213c {

    /* JADX INFO: renamed from: a */
    public int f47817a;

    /* JADX INFO: renamed from: b */
    public final Object f47818b;

    /* JADX INFO: renamed from: c */
    public Object f47819c;

    /* JADX INFO: renamed from: d */
    public Object f47820d;

    public C9213c() {
        this.f47818b = new byte[256];
        this.f47817a = 0;
    }

    public C9213c(int i10, CoroutineContext coroutineContext, BufferOverflow bufferOverflow, InterfaceC7116c interfaceC7116c) {
        this.f47818b = interfaceC7116c;
        this.f47817a = i10;
        this.f47819c = bufferOverflow;
        this.f47820d = coroutineContext;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m17555a() {
        return ((C8496c) this.f47819c).f45713j != 0;
    }

    /* JADX INFO: renamed from: b */
    public final C8496c m17556b() {
        Object obj;
        if (((ByteBuffer) this.f47820d) == null) {
            throw new IllegalStateException("You must call setData() before parseHeader()");
        }
        if (m17555a()) {
            return (C8496c) this.f47819c;
        }
        String string = "";
        for (int i10 = 0; i10 < 6; i10++) {
            StringBuilder sbM771r = C0166e.m771r(string);
            sbM771r.append((char) m17557c());
            string = sbM771r.toString();
        }
        if (string.startsWith("GIF")) {
            ((C8496c) this.f47819c).f45714k = m17560f();
            ((C8496c) this.f47819c).f45711h = m17560f();
            int iM17557c = m17557c();
            C8496c c8496c = (C8496c) this.f47819c;
            c8496c.f45709f = (iM17557c & BuildConfig.SDK_TRUNCATE_LENGTH) != 0;
            c8496c.f45710g = 2 << (iM17557c & 7);
            c8496c.f45705b = m17557c();
            C8496c c8496c2 = (C8496c) this.f47819c;
            m17557c();
            c8496c2.getClass();
            if (((C8496c) this.f47819c).f45709f && !m17555a()) {
                C8496c c8496c3 = (C8496c) this.f47819c;
                c8496c3.f45708e = m17559e(c8496c3.f45710g);
                C8496c c8496c4 = (C8496c) this.f47819c;
                c8496c4.f45704a = c8496c4.f45708e[c8496c4.f45705b];
            }
        } else {
            ((C8496c) this.f47819c).f45713j = 1;
        }
        if (!m17555a()) {
            boolean z10 = false;
            loop1: while (true) {
                while (true) {
                    if (z10 || m17555a() || ((C8496c) this.f47819c).f45706c > Integer.MAX_VALUE) {
                        break loop1;
                    }
                    int iM17557c2 = m17557c();
                    if (iM17557c2 == 33) {
                        int iM17557c3 = m17557c();
                        if (iM17557c3 == 1) {
                            m17562h();
                        } else if (iM17557c3 == 249) {
                            ((C8496c) this.f47819c).f45715l = new C9212b();
                            m17557c();
                            int iM17557c4 = m17557c();
                            C9212b c9212b = (C9212b) ((C8496c) this.f47819c).f45715l;
                            int i11 = (iM17557c4 & 28) >> 2;
                            c9212b.f47808c = i11;
                            if (i11 == 0) {
                                c9212b.f47808c = 1;
                            }
                            c9212b.f47816k = (iM17557c4 & 1) != 0;
                            int iM17560f = m17560f();
                            if (iM17560f < 2) {
                                iM17560f = 10;
                            }
                            C9212b c9212b2 = (C9212b) ((C8496c) this.f47819c).f45715l;
                            c9212b2.f47807b = iM17560f * 10;
                            c9212b2.f47815j = m17557c();
                            m17557c();
                        } else if (iM17557c3 == 254) {
                            m17562h();
                        } else if (iM17557c3 != 255) {
                            m17562h();
                        } else {
                            m17558d();
                            int i12 = 0;
                            String string2 = "";
                            while (true) {
                                obj = this.f47818b;
                                if (i12 >= 11) {
                                    break;
                                }
                                StringBuilder sbM771r2 = C0166e.m771r(string2);
                                sbM771r2.append((char) ((byte[]) obj)[i12]);
                                string2 = sbM771r2.toString();
                                i12++;
                            }
                            if (string2.equals("NETSCAPE2.0")) {
                                while (true) {
                                    m17558d();
                                    byte[] bArr = (byte[]) obj;
                                    if (bArr[0] == 1) {
                                        int i13 = bArr[1] & 255;
                                        int i14 = bArr[2] & 255;
                                        C8496c c8496c5 = (C8496c) this.f47819c;
                                        int i15 = (i14 << 8) | i13;
                                        c8496c5.f45712i = i15;
                                        if (i15 == 0) {
                                            c8496c5.f45712i = -1;
                                        }
                                    }
                                    if (this.f47817a > 0) {
                                        if (m17555a()) {
                                        }
                                    }
                                }
                            } else {
                                m17562h();
                            }
                        }
                    } else if (iM17557c2 == 44) {
                        C8496c c8496c6 = (C8496c) this.f47819c;
                        if (((C9212b) c8496c6.f45715l) == null) {
                            c8496c6.f45715l = new C9212b();
                        }
                        ((C9212b) ((C8496c) this.f47819c).f45715l).f47810e = m17560f();
                        ((C9212b) ((C8496c) this.f47819c).f45715l).f47811f = m17560f();
                        ((C9212b) ((C8496c) this.f47819c).f45715l).f47812g = m17560f();
                        ((C9212b) ((C8496c) this.f47819c).f45715l).f47813h = m17560f();
                        int iM17557c5 = m17557c();
                        boolean z11 = (iM17557c5 & BuildConfig.SDK_TRUNCATE_LENGTH) != 0;
                        int iPow = (int) Math.pow(2.0d, (iM17557c5 & 7) + 1);
                        C9212b c9212b3 = (C9212b) ((C8496c) this.f47819c).f45715l;
                        c9212b3.f47809d = (iM17557c5 & 64) != 0;
                        if (z11) {
                            c9212b3.f47814i = m17559e(iPow);
                        } else {
                            c9212b3.f47814i = null;
                        }
                        ((C9212b) ((C8496c) this.f47819c).f45715l).f47806a = ((ByteBuffer) this.f47820d).position();
                        m17557c();
                        m17562h();
                        if (!m17555a()) {
                            C8496c c8496c7 = (C8496c) this.f47819c;
                            c8496c7.f45706c++;
                            c8496c7.f45707d.add((C9212b) c8496c7.f45715l);
                        }
                    } else if (iM17557c2 != 59) {
                        ((C8496c) this.f47819c).f45713j = 1;
                    } else {
                        z10 = true;
                    }
                }
            }
            C8496c c8496c8 = (C8496c) this.f47819c;
            if (c8496c8.f45706c < 0) {
                c8496c8.f45713j = 1;
            }
        }
        return (C8496c) this.f47819c;
    }

    /* JADX INFO: renamed from: c */
    public final int m17557c() {
        try {
            return ((ByteBuffer) this.f47820d).get() & 255;
        } catch (Exception unused) {
            ((C8496c) this.f47819c).f45713j = 1;
            return 0;
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m17558d() {
        int iM17557c = m17557c();
        this.f47817a = iM17557c;
        if (iM17557c <= 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            try {
                int i11 = this.f47817a;
                if (i10 >= i11) {
                    return;
                }
                int i12 = i11 - i10;
                ((ByteBuffer) this.f47820d).get((byte[]) this.f47818b, i10, i12);
                i10 += i12;
            } catch (Exception unused) {
                ((C8496c) this.f47819c).f45713j = 1;
                return;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final int[] m17559e(int i10) {
        byte[] bArr = new byte[i10 * 3];
        int[] iArr = null;
        try {
            ((ByteBuffer) this.f47820d).get(bArr);
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
            if (CleverTapAPI.f10977c > CleverTapAPI.LogLevel.INFO.intValue()) {
                Log.d("CleverTap:".concat("GifHeaderParser"), "Format Error Reading Color Table", e10);
            }
            ((C8496c) this.f47819c).f45713j = 1;
        }
        return iArr;
    }

    /* JADX INFO: renamed from: f */
    public final int m17560f() {
        return ((ByteBuffer) this.f47820d).getShort();
    }

    /* JADX INFO: renamed from: g */
    public final void m17561g(byte[] bArr) {
        if (bArr == null) {
            this.f47820d = null;
            ((C8496c) this.f47819c).f45713j = 2;
            return;
        }
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        this.f47820d = null;
        Arrays.fill((byte[]) this.f47818b, (byte) 0);
        this.f47819c = new C8496c(1);
        this.f47817a = 0;
        ByteBuffer byteBufferAsReadOnlyBuffer = byteBufferWrap.asReadOnlyBuffer();
        this.f47820d = byteBufferAsReadOnlyBuffer;
        byteBufferAsReadOnlyBuffer.position(0);
        ((ByteBuffer) this.f47820d).order(ByteOrder.LITTLE_ENDIAN);
    }

    /* JADX INFO: renamed from: h */
    public final void m17562h() {
        int iM17557c;
        do {
            try {
                iM17557c = m17557c();
                Object obj = this.f47820d;
                ((ByteBuffer) obj).position(((ByteBuffer) obj).position() + iM17557c);
            } catch (IllegalArgumentException unused) {
                return;
            }
        } while (iM17557c > 0);
    }
}
