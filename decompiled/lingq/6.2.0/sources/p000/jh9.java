package p000;

import android.content.Intent;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.view.ViewStructure;
import androidx.activity.result.ActivityResult;
import com.android.billingclient.api.ProxyBillingActivityV2;
import com.google.android.gms.internal.clearcut.zzft;
import com.google.android.gms.internal.play_billing.AbstractC0985a;
import com.google.common.util.concurrent.AbstractC1118h;
import com.google.common.util.concurrent.AbstractC1120j;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.RunnableFutureC1123m;
import com.google.zxing.BarcodeFormat;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ReadOnlyBufferException;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class jh9 implements p9b, InterfaceC2991f7, InterfaceC3016fw {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f45551a;

    /* JADX INFO: renamed from: b */
    public Object f45552b;

    public jh9(int i) {
        this.f45551a = i;
        switch (i) {
            case 2:
                this.f45552b = new co2(0);
                break;
            case 8:
                this.f45552b = new HashMap();
                break;
        }
    }

    /* JADX INFO: renamed from: k */
    public static jh9 m14461k(ViewStructure viewStructure) {
        return new jh9(viewStructure, 4);
    }

    /* JADX INFO: renamed from: l */
    public static int m14462l(CharSequence charSequence) {
        int length = charSequence.length();
        int i = 0;
        int i2 = 0;
        while (i2 < length && charSequence.charAt(i2) < 128) {
            i2++;
        }
        int i3 = length;
        while (i2 < length) {
            char cCharAt = charSequence.charAt(i2);
            if (cCharAt >= 2048) {
                int length2 = charSequence.length();
                while (i2 < length2) {
                    char cCharAt2 = charSequence.charAt(i2);
                    if (cCharAt2 < 2048) {
                        i += (127 - cCharAt2) >>> 31;
                    } else {
                        i += 2;
                        if (55296 <= cCharAt2 && cCharAt2 <= 57343) {
                            if (Character.codePointAt(charSequence, i2) < 65536) {
                                StringBuilder sb = new StringBuilder(39);
                                sb.append("Unpaired surrogate at index ");
                                sb.append(i2);
                                throw new IllegalArgumentException(sb.toString());
                            }
                            i2++;
                        }
                    }
                    i2++;
                }
                i3 += i;
                break;
            }
            i3 += (127 - cCharAt) >>> 31;
            i2++;
        }
        if (i3 >= length) {
            return i3;
        }
        StringBuilder sb2 = new StringBuilder(54);
        sb2.append("UTF-8 length does not fit in int: ");
        sb2.append(((long) i3) + 4294967296L);
        throw new IllegalArgumentException(sb2.toString());
    }

    /* JADX INFO: renamed from: r */
    public static int m14463r(int i, String str) {
        int iM14466w = m14466w(i);
        int iM14462l = m14462l(str);
        return m14467x(iM14462l) + iM14462l + iM14466w;
    }

    /* JADX INFO: renamed from: t */
    public static void m14464t(CharSequence charSequence, ByteBuffer byteBuffer) {
        int i;
        char cCharAt;
        int i2;
        if (byteBuffer.isReadOnly()) {
            throw new ReadOnlyBufferException();
        }
        char c = 57343;
        int i3 = 0;
        if (!byteBuffer.hasArray()) {
            int length = charSequence.length();
            while (i3 < length) {
                char cCharAt2 = charSequence.charAt(i3);
                if (cCharAt2 < 128) {
                    i2 = cCharAt2;
                    byteBuffer.put((byte) i2);
                } else if (cCharAt2 < 2048) {
                    byteBuffer.put((byte) ((cCharAt2 >>> 6) | 960));
                    i2 = (cCharAt2 & '?') | 128;
                    i2 = cCharAt2;
                    byteBuffer.put((byte) i2);
                } else {
                    if (cCharAt2 >= 55296 && 57343 >= cCharAt2) {
                        int i4 = i3 + 1;
                        if (i4 != charSequence.length()) {
                            char cCharAt3 = charSequence.charAt(i4);
                            if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                byteBuffer.put((byte) ((codePoint >>> 18) | 240));
                                byteBuffer.put((byte) (((codePoint >>> 12) & 63) | 128));
                                byteBuffer.put((byte) (((codePoint >>> 6) & 63) | 128));
                                byteBuffer.put((byte) ((codePoint & 63) | 128));
                                i3 = i4;
                            } else {
                                i3 = i4;
                            }
                        }
                        StringBuilder sb = new StringBuilder(39);
                        sb.append("Unpaired surrogate at index ");
                        sb.append(i3 - 1);
                        throw new IllegalArgumentException(sb.toString());
                    }
                    byteBuffer.put((byte) ((cCharAt2 >>> '\f') | 480));
                    byteBuffer.put((byte) (((cCharAt2 >>> 6) & 63) | 128));
                    byteBuffer.put((byte) ((cCharAt2 & '?') | 128));
                }
                i3++;
            }
            return;
        }
        try {
            byte[] bArrArray = byteBuffer.array();
            int iArrayOffset = byteBuffer.arrayOffset() + byteBuffer.position();
            int iRemaining = byteBuffer.remaining();
            int length2 = charSequence.length();
            int i5 = iRemaining + iArrayOffset;
            while (i3 < length2) {
                int i6 = i3 + iArrayOffset;
                if (i6 >= i5 || (cCharAt = charSequence.charAt(i3)) >= 128) {
                    break;
                }
                bArrArray[i6] = (byte) cCharAt;
                i3++;
            }
            if (i3 == length2) {
                i = iArrayOffset + length2;
            } else {
                i = iArrayOffset + i3;
                while (i3 < length2) {
                    char cCharAt4 = charSequence.charAt(i3);
                    if (cCharAt4 < 128 && i < i5) {
                        bArrArray[i] = (byte) cCharAt4;
                        i++;
                    } else if (cCharAt4 < 2048 && i <= i5 - 2) {
                        int i7 = i + 1;
                        bArrArray[i] = (byte) ((cCharAt4 >>> 6) | 960);
                        i += 2;
                        bArrArray[i7] = (byte) ((cCharAt4 & '?') | 128);
                    } else {
                        if ((cCharAt4 >= 55296 && c >= cCharAt4) || i > i5 - 3) {
                            if (i > i5 - 4) {
                                StringBuilder sb2 = new StringBuilder(37);
                                sb2.append("Failed writing ");
                                sb2.append(cCharAt4);
                                sb2.append(" at index ");
                                sb2.append(i);
                                throw new ArrayIndexOutOfBoundsException(sb2.toString());
                            }
                            int i8 = i3 + 1;
                            if (i8 != charSequence.length()) {
                                char cCharAt5 = charSequence.charAt(i8);
                                if (Character.isSurrogatePair(cCharAt4, cCharAt5)) {
                                    int codePoint2 = Character.toCodePoint(cCharAt4, cCharAt5);
                                    bArrArray[i] = (byte) ((codePoint2 >>> 18) | 240);
                                    bArrArray[i + 1] = (byte) (((codePoint2 >>> 12) & 63) | 128);
                                    int i9 = i + 3;
                                    bArrArray[i + 2] = (byte) (((codePoint2 >>> 6) & 63) | 128);
                                    i += 4;
                                    bArrArray[i9] = (byte) ((codePoint2 & 63) | 128);
                                    i3 = i8;
                                } else {
                                    i3 = i8;
                                }
                            }
                            StringBuilder sb3 = new StringBuilder(39);
                            sb3.append("Unpaired surrogate at index ");
                            sb3.append(i3 - 1);
                            throw new IllegalArgumentException(sb3.toString());
                        }
                        bArrArray[i] = (byte) ((cCharAt4 >>> '\f') | 480);
                        int i10 = i + 2;
                        bArrArray[i + 1] = (byte) (((cCharAt4 >>> 6) & 63) | 128);
                        i += 3;
                        bArrArray[i10] = (byte) ((cCharAt4 & '?') | 128);
                    }
                    i3++;
                    c = 57343;
                }
            }
            byteBuffer.position(i - byteBuffer.arrayOffset());
        } catch (ArrayIndexOutOfBoundsException e) {
            BufferOverflowException bufferOverflowException = new BufferOverflowException();
            bufferOverflowException.initCause(e);
            throw bufferOverflowException;
        }
    }

    /* JADX INFO: renamed from: v */
    public static int m14465v(long j) {
        if (((-128) & j) == 0) {
            return 1;
        }
        if (((-16384) & j) == 0) {
            return 2;
        }
        if (((-2097152) & j) == 0) {
            return 3;
        }
        if (((-268435456) & j) == 0) {
            return 4;
        }
        if (((-34359738368L) & j) == 0) {
            return 5;
        }
        if (((-4398046511104L) & j) == 0) {
            return 6;
        }
        if (((-562949953421312L) & j) == 0) {
            return 7;
        }
        if (((-72057594037927936L) & j) == 0) {
            return 8;
        }
        return (j & Long.MIN_VALUE) == 0 ? 9 : 10;
    }

    /* JADX INFO: renamed from: w */
    public static int m14466w(int i) {
        return m14467x(i << 3);
    }

    /* JADX INFO: renamed from: x */
    public static int m14467x(int i) {
        if ((i & (-128)) == 0) {
            return 1;
        }
        if ((i & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i) == 0) {
            return 3;
        }
        return (i & (-268435456)) == 0 ? 4 : 5;
    }

    /* JADX INFO: renamed from: a */
    public Bundle m14468a() {
        return ((ViewStructure) this.f45552b).getExtras();
    }

    /* JADX INFO: renamed from: b */
    public void m14469b(String str) {
        ((ViewStructure) this.f45552b).setClassName(str);
    }

    @Override // p000.InterfaceC2991f7
    /* JADX INFO: renamed from: c */
    public void mo2125c(Object obj) {
        ProxyBillingActivityV2 proxyBillingActivityV2 = (ProxyBillingActivityV2) this.f45552b;
        ActivityResult activityResult = (ActivityResult) obj;
        Intent intent = activityResult.f1008b;
        int i = AbstractC0985a.m5504e(intent, "ProxyBillingActivityV2").f57553a;
        ResultReceiver resultReceiver = proxyBillingActivityV2.f11291V;
        if (resultReceiver != null) {
            resultReceiver.send(i, intent == null ? null : intent.getExtras());
        }
        int i2 = activityResult.f1007a;
        if (i2 != -1 || i != 0) {
            AbstractC0985a.m5508i("ProxyBillingActivityV2", "External offer dialog finished with resultCode: " + i2 + " and billing's responseCode: " + i);
        }
        proxyBillingActivityV2.finish();
    }

    @Override // p000.InterfaceC3016fw
    public ListenableFuture call() {
        switch (this.f45551a) {
            case 9:
                Callable callable = (Callable) this.f45552b;
                Executor executorM6404a = AbstractC1120j.m6404a();
                RunnableFutureC1123m runnableFutureC1123m = new RunnableFutureC1123m(callable);
                executorM6404a.execute(runnableFutureC1123m);
                return runnableFutureC1123m;
            default:
                rkd rkdVar = (rkd) this.f45552b;
                int i = 3;
                nkd nkdVar = new nkd(rkdVar, i);
                int i2 = jmd.f45851a;
                return AbstractC1118h.m6400d(AbstractC1118h.m6403g(rkdVar.f59453b, new ubd(i, qld.m20020a(), nkdVar), rkdVar.f59455d));
        }
    }

    /* JADX INFO: renamed from: d */
    public void m14470d(String str) {
        ((ViewStructure) this.f45552b).setContentDescription(str);
    }

    /* JADX INFO: renamed from: e */
    public void m14471e(int i, int i2, int i3, int i4) {
        ((ViewStructure) this.f45552b).setDimens(i, i2, 0, 0, i3, i4);
    }

    @Override // p000.p9b
    /* JADX INFO: renamed from: f */
    public ad0 mo4915f(String str, BarcodeFormat barcodeFormat, EnumMap enumMap) {
        if (barcodeFormat == BarcodeFormat.UPC_A) {
            return ((co2) this.f45552b).mo4915f("0".concat(String.valueOf(str)), BarcodeFormat.EAN_13, enumMap);
        }
        C3386nv.m17626m("Can only encode UPC-A, but got ".concat(String.valueOf(barcodeFormat)));
        return null;
    }

    /* JADX INFO: renamed from: g */
    public void m14472g(int i, String str) {
        ((ViewStructure) this.f45552b).setId(i, null, null, str);
    }

    /* JADX INFO: renamed from: h */
    public void m14473h(CharSequence charSequence) {
        ((ViewStructure) this.f45552b).setText(charSequence);
    }

    /* JADX INFO: renamed from: i */
    public void m14474i(float f) {
        ((ViewStructure) this.f45552b).setTextStyle(f, 0, 0, 0);
    }

    /* JADX INFO: renamed from: j */
    public ViewStructure m14475j() {
        return (ViewStructure) this.f45552b;
    }

    /* JADX INFO: renamed from: m */
    public void m14476m(int i, String str) throws zzft {
        ByteBuffer byteBuffer = (ByteBuffer) this.f45552b;
        m14481s(i, 2);
        try {
            int iM14467x = m14467x(str.length());
            if (iM14467x != m14467x(str.length() * 3)) {
                m14480q(m14462l(str));
                m14464t(str, byteBuffer);
                return;
            }
            int iPosition = byteBuffer.position();
            if (byteBuffer.remaining() < iM14467x) {
                throw new zzft(iPosition + iM14467x, byteBuffer.limit());
            }
            byteBuffer.position(iPosition + iM14467x);
            m14464t(str, byteBuffer);
            int iPosition2 = byteBuffer.position();
            byteBuffer.position(iPosition);
            m14480q((iPosition2 - iPosition) - iM14467x);
            byteBuffer.position(iPosition2);
        } catch (BufferOverflowException e) {
            zzft zzftVar = new zzft(byteBuffer.position(), byteBuffer.limit());
            zzftVar.initCause(e);
            throw zzftVar;
        }
    }

    /* JADX INFO: renamed from: n */
    public void m14477n(int i, byte[] bArr) throws zzft {
        m14481s(i, 2);
        m14480q(bArr.length);
        int length = bArr.length;
        ByteBuffer byteBuffer = (ByteBuffer) this.f45552b;
        if (byteBuffer.remaining() < length) {
            throw new zzft(byteBuffer.position(), byteBuffer.limit());
        }
        byteBuffer.put(bArr, 0, length);
    }

    /* JADX INFO: renamed from: o */
    public void m14478o(String str, Callable callable) {
        ((HashMap) this.f45552b).put(str, callable);
    }

    /* JADX INFO: renamed from: p */
    public void m14479p(int i) throws zzft {
        byte b = (byte) i;
        ByteBuffer byteBuffer = (ByteBuffer) this.f45552b;
        if (!byteBuffer.hasRemaining()) {
            throw new zzft(byteBuffer.position(), byteBuffer.limit());
        }
        byteBuffer.put(b);
    }

    /* JADX INFO: renamed from: q */
    public void m14480q(int i) throws zzft {
        while ((i & (-128)) != 0) {
            m14479p((i & 127) | 128);
            i >>>= 7;
        }
        m14479p(i);
    }

    /* JADX INFO: renamed from: s */
    public void m14481s(int i, int i2) throws zzft {
        m14480q((i << 3) | i2);
    }

    /* JADX INFO: renamed from: u */
    public void m14482u(long j) throws zzft {
        while (((-128) & j) != 0) {
            m14479p((((int) j) & 127) | 128);
            j >>>= 7;
        }
        m14479p((int) j);
    }

    public /* synthetic */ jh9(Object obj, int i) {
        this.f45551a = i;
        this.f45552b = obj;
    }

    public jh9(int i, byte[] bArr) {
        this.f45551a = 7;
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr, 0, i);
        this.f45552b = byteBufferWrap;
        byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
    }

    public jh9(xo1 xo1Var) {
        this.f45551a = 3;
        xo1Var.getClass();
        this.f45552b = xo1Var;
    }
}
