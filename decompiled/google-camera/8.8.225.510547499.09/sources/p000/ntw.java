package p000;

import android.util.Pair;
import com.google.android.clockwork.common.wearable.wearmaterial.time.HuCi.yTyWiTtGtnBhy;
import com.google.googlex.gcam.BufferUtils;
import com.google.googlex.gcam.GcamModuleJNI;
import com.google.googlex.gcam.HalAfMetadata;
import com.google.googlex.gcam.ShotMetadata;
import com.google.googlex.gcam.YuvImage;
import com.google.googlex.gcam.YuvReadView;
import com.google.googlex.gcam.YuvWriteView;
import com.google.googlex.gcam.lasagna.LasagnaCallbacks;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Map;
import java.util.concurrent.Future;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ntw {
    public static void $default$onFinalStatusNative(LasagnaCallbacks lasagnaCallbacks, int i, int i2, String str, byte[] bArr) {
        mrm mrmVarM16829i = mqu.f41450a;
        if (bArr != null) {
            try {
                nxq nxqVarM18123Q = nxq.m18123Q(nub.f44615r, bArr, 0, bArr.length, nxf.m18011a());
                nxq.m18132ae(nxqVarM18123Q);
                mrmVarM16829i = mrm.m16829i((nub) nxqVarM18123Q);
            } catch (nyb e) {
            }
        }
        lasagnaCallbacks.mo5159a(i, i2, str, mrmVarM16829i);
    }

    public static void $default$onImageNative(LasagnaCallbacks lasagnaCallbacks, int i, long j, int i2, String str, long j2) {
        int i3;
        switch (i2) {
            case 0:
                i3 = 1;
                break;
            case 1:
                i3 = 2;
                break;
            case 2:
                i3 = 3;
                break;
            case 3:
                i3 = 4;
                break;
            case 4:
                i3 = 5;
                break;
            default:
                i3 = 0;
                break;
        }
        lasagnaCallbacks.mo5160e(i, j, i3, str, new ShotMetadata(j2));
    }

    /* JADX INFO: renamed from: A */
    public static int m17692A(byte[] bArr, int i, nwh nwhVar) throws nyb {
        int iM17701J = m17701J(bArr, i, nwhVar);
        int i2 = nwhVar.f44826a;
        if (i2 < 0) {
            throw nyb.m18164f();
        }
        if (i2 > bArr.length - iM17701J) {
            throw nyb.m18167i();
        }
        if (i2 == 0) {
            nwhVar.f44828c = nwr.f44839b;
            return iM17701J;
        }
        nwhVar.f44828c = nwr.m17800v(bArr, iM17701J, i2);
        return iM17701J + i2;
    }

    /* JADX INFO: renamed from: B */
    public static int m17693B(byte[] bArr, int i) {
        int i2 = bArr[i] & 255;
        int i3 = bArr[i + 1] & 255;
        int i4 = bArr[i + 2] & 255;
        return ((bArr[i + 3] & 255) << 24) | (i3 << 8) | i2 | (i4 << 16);
    }

    /* JADX INFO: renamed from: C */
    public static int m17694C(nzm nzmVar, byte[] bArr, int i, int i2, int i3, nwh nwhVar) {
        Object objMo18249e = nzmVar.mo18249e();
        int iM17705N = m17705N(objMo18249e, nzmVar, bArr, i, i2, i3, nwhVar);
        nzmVar.mo18250f(objMo18249e);
        nwhVar.f44828c = objMo18249e;
        return iM17705N;
    }

    /* JADX INFO: renamed from: D */
    public static int m17695D(nzm nzmVar, byte[] bArr, int i, int i2, nwh nwhVar) throws nyb {
        Object objMo18249e = nzmVar.mo18249e();
        int iM17706O = m17706O(objMo18249e, nzmVar, bArr, i, i2, nwhVar);
        nzmVar.mo18250f(objMo18249e);
        nwhVar.f44828c = objMo18249e;
        return iM17706O;
    }

    /* JADX INFO: renamed from: E */
    public static int m17696E(nzm nzmVar, int i, byte[] bArr, int i2, int i3, nxy nxyVar, nwh nwhVar) throws nyb {
        int iM17695D = m17695D(nzmVar, bArr, i2, i3, nwhVar);
        nxyVar.add(nwhVar.f44828c);
        while (iM17695D < i3) {
            int iM17701J = m17701J(bArr, iM17695D, nwhVar);
            if (i != nwhVar.f44826a) {
                break;
            }
            iM17695D = m17695D(nzmVar, bArr, iM17701J, i3, nwhVar);
            nxyVar.add(nwhVar.f44828c);
        }
        return iM17695D;
    }

    /* JADX INFO: renamed from: F */
    public static int m17697F(byte[] bArr, int i, nxy nxyVar, nwh nwhVar) throws nyb {
        nxr nxrVar = (nxr) nxyVar;
        int iM17701J = m17701J(bArr, i, nwhVar);
        int i2 = nwhVar.f44826a + iM17701J;
        while (iM17701J < i2) {
            iM17701J = m17701J(bArr, iM17701J, nwhVar);
            nxrVar.mo18148g(nwhVar.f44826a);
        }
        if (iM17701J == i2) {
            return iM17701J;
        }
        throw nyb.m18167i();
    }

    /* JADX INFO: renamed from: G */
    public static int m17698G(byte[] bArr, int i, nwh nwhVar) throws nyb {
        int iM17701J = m17701J(bArr, i, nwhVar);
        int i2 = nwhVar.f44826a;
        if (i2 < 0) {
            throw nyb.m18164f();
        }
        if (i2 == 0) {
            nwhVar.f44828c = "";
            return iM17701J;
        }
        nwhVar.f44828c = new String(bArr, iM17701J, i2, nxz.f44985a);
        return iM17701J + i2;
    }

    /* JADX INFO: renamed from: H */
    public static int m17699H(byte[] bArr, int i, nwh nwhVar) throws nyb {
        int iM17701J = m17701J(bArr, i, nwhVar);
        int i2 = nwhVar.f44826a;
        if (i2 < 0) {
            throw nyb.m18164f();
        }
        if (i2 == 0) {
            nwhVar.f44828c = "";
            return iM17701J;
        }
        nwhVar.f44828c = lij.m15410S(bArr, iM17701J, i2);
        return iM17701J + i2;
    }

    /* JADX INFO: renamed from: I */
    public static int m17700I(int i, byte[] bArr, int i2, int i3, nzy nzyVar, nwh nwhVar) throws nyb {
        if (oal.m18386a(i) == 0) {
            throw nyb.m18161c();
        }
        switch (oal.m18387b(i)) {
            case 0:
                int iM17704M = m17704M(bArr, i2, nwhVar);
                nzyVar.m18334f(i, Long.valueOf(nwhVar.f44827b));
                return iM17704M;
            case 1:
                nzyVar.m18334f(i, Long.valueOf(m17708Q(bArr, i2)));
                return i2 + 8;
            case 2:
                int iM17701J = m17701J(bArr, i2, nwhVar);
                int i4 = nwhVar.f44826a;
                if (i4 < 0) {
                    throw nyb.m18164f();
                }
                if (i4 > bArr.length - iM17701J) {
                    throw nyb.m18167i();
                }
                if (i4 == 0) {
                    nzyVar.m18334f(i, nwr.f44839b);
                } else {
                    nzyVar.m18334f(i, nwr.m17800v(bArr, iM17701J, i4));
                }
                return iM17701J + i4;
            case 3:
                int i5 = (i & (-8)) | 4;
                nzy nzyVarM18329b = nzy.m18329b();
                int i6 = 0;
                while (i2 < i3) {
                    int iM17701J2 = m17701J(bArr, i2, nwhVar);
                    int i7 = nwhVar.f44826a;
                    if (i7 == i5) {
                        i6 = i7;
                        i2 = iM17701J2;
                        if (i2 <= i3 || i6 != i5) {
                            throw nyb.m18165g();
                        }
                        nzyVar.m18334f(i, nzyVarM18329b);
                        return i2;
                    }
                    i6 = i7;
                    i2 = m17700I(i7, bArr, iM17701J2, i3, nzyVarM18329b, nwhVar);
                }
                if (i2 <= i3) {
                }
                throw nyb.m18165g();
            case 4:
            default:
                throw nyb.m18161c();
            case 5:
                nzyVar.m18334f(i, Integer.valueOf(m17693B(bArr, i2)));
                return i2 + 4;
        }
    }

    /* JADX INFO: renamed from: J */
    public static int m17701J(byte[] bArr, int i, nwh nwhVar) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return m17702K(b, bArr, i2, nwhVar);
        }
        nwhVar.f44826a = b;
        return i2;
    }

    /* JADX INFO: renamed from: K */
    public static int m17702K(int i, byte[] bArr, int i2, nwh nwhVar) {
        byte b = bArr[i2];
        int i3 = i2 + 1;
        int i4 = i & 127;
        if (b >= 0) {
            nwhVar.f44826a = i4 | (b << 7);
            return i3;
        }
        int i5 = i4 | ((b & 127) << 7);
        int i6 = i3 + 1;
        byte b2 = bArr[i3];
        if (b2 >= 0) {
            nwhVar.f44826a = i5 | (b2 << 14);
            return i6;
        }
        int i7 = i5 | ((b2 & 127) << 14);
        int i8 = i6 + 1;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            nwhVar.f44826a = i7 | (b3 << 21);
            return i8;
        }
        int i9 = i7 | ((b3 & 127) << 21);
        int i10 = i8 + 1;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            nwhVar.f44826a = i9 | (b4 << 28);
            return i10;
        }
        int i11 = i9 | ((b4 & 127) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                nwhVar.f44826a = i11;
                return i12;
            }
            i10 = i12;
        }
    }

    /* JADX INFO: renamed from: L */
    public static int m17703L(int i, byte[] bArr, int i2, int i3, nxy nxyVar, nwh nwhVar) {
        nxr nxrVar = (nxr) nxyVar;
        int iM17701J = m17701J(bArr, i2, nwhVar);
        nxrVar.mo18148g(nwhVar.f44826a);
        while (iM17701J < i3) {
            int iM17701J2 = m17701J(bArr, iM17701J, nwhVar);
            if (i != nwhVar.f44826a) {
                break;
            }
            iM17701J = m17701J(bArr, iM17701J2, nwhVar);
            nxrVar.mo18148g(nwhVar.f44826a);
        }
        return iM17701J;
    }

    /* JADX INFO: renamed from: M */
    public static int m17704M(byte[] bArr, int i, nwh nwhVar) {
        long j = bArr[i];
        int i2 = i + 1;
        if (j >= 0) {
            nwhVar.f44827b = j;
            return i2;
        }
        int i3 = i2 + 1;
        byte b = bArr[i2];
        long j2 = (j & 127) | (((long) (b & 127)) << 7);
        int i4 = 7;
        while (b < 0) {
            int i5 = i3 + 1;
            byte b2 = bArr[i3];
            i4 += 7;
            j2 |= ((long) (b2 & 127)) << i4;
            i3 = i5;
            b = b2;
        }
        nwhVar.f44827b = j2;
        return i3;
    }

    /* JADX INFO: renamed from: N */
    public static int m17705N(Object obj, nzm nzmVar, byte[] bArr, int i, int i2, int i3, nwh nwhVar) {
        int iM18248c = ((nyz) nzmVar).m18248c(obj, bArr, i, i2, i3, nwhVar);
        nwhVar.f44828c = obj;
        return iM18248c;
    }

    /* JADX INFO: renamed from: O */
    public static int m17706O(Object obj, nzm nzmVar, byte[] bArr, int i, int i2, nwh nwhVar) throws nyb {
        int i3;
        int i4 = i + 1;
        int i5 = bArr[i];
        if (i5 < 0) {
            int iM17702K = m17702K(i5, bArr, i4, nwhVar);
            i5 = nwhVar.f44826a;
            i3 = iM17702K;
        } else {
            i3 = i4;
        }
        if (i5 < 0 || i5 > i2 - i3) {
            throw nyb.m18167i();
        }
        int i6 = i5 + i3;
        nzmVar.mo18253i(obj, bArr, i3, i6, nwhVar);
        nwhVar.f44828c = obj;
        return i6;
    }

    /* JADX INFO: renamed from: P */
    public static int m17707P(int i, byte[] bArr, int i2, int i3, nwh nwhVar) throws nyb {
        if (oal.m18386a(i) == 0) {
            throw nyb.m18161c();
        }
        switch (oal.m18387b(i)) {
            case 0:
                return m17704M(bArr, i2, nwhVar);
            case 1:
                return i2 + 8;
            case 2:
                return m17701J(bArr, i2, nwhVar) + nwhVar.f44826a;
            case 3:
                int i4 = (i & (-8)) | 4;
                int i5 = 0;
                while (i2 < i3) {
                    i2 = m17701J(bArr, i2, nwhVar);
                    i5 = nwhVar.f44826a;
                    if (i5 == i4) {
                        if (i2 <= i3 || i5 != i4) {
                            throw nyb.m18165g();
                        }
                        return i2;
                    }
                    i2 = m17707P(i5, bArr, i2, i3, nwhVar);
                }
                if (i2 <= i3) {
                }
                throw nyb.m18165g();
            case 4:
            default:
                throw nyb.m18161c();
            case 5:
                return i2 + 4;
        }
    }

    /* JADX INFO: renamed from: Q */
    public static long m17708Q(byte[] bArr, int i) {
        return (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48) | ((((long) bArr[i + 7]) & 255) << 56);
    }

    /* JADX INFO: renamed from: R */
    public static int m17709R(String str) {
        int iCharAt = 0;
        for (int i = 0; i < str.length(); i++) {
            iCharAt = (iCharAt * 31) + str.charAt(i);
        }
        return iCharAt;
    }

    /* JADX INFO: renamed from: S */
    public static int m17710S(int i) {
        switch (i) {
            case 0:
                return 2;
            case 1:
                return 3;
            case 2:
                return 4;
            default:
                return 0;
        }
    }

    /* JADX INFO: renamed from: T */
    public static int m17711T(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            default:
                return 0;
        }
    }

    /* JADX INFO: renamed from: U */
    public static int m17712U(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            default:
                return 0;
        }
    }

    /* JADX INFO: renamed from: V */
    public static final ktz m17713V(Object obj) {
        return (ktz) ((liv) obj).f38339a;
    }

    /* JADX INFO: renamed from: W */
    public static void m17714W(liv livVar, Map.Entry entry) {
        nxp nxpVar = (nxp) entry.getKey();
        oaj oajVar = oaj.DOUBLE;
        switch (nxpVar.f44978b.ordinal()) {
            case 0:
                livVar.m15489l(nxpVar.f44977a, ((Double) entry.getValue()).doubleValue());
                break;
            case 1:
                livVar.m15493p(nxpVar.f44977a, ((Float) entry.getValue()).floatValue());
                break;
            case 2:
                livVar.m15496s(nxpVar.f44977a, ((Long) entry.getValue()).longValue());
                break;
            case 3:
                livVar.m15477B(nxpVar.f44977a, ((Long) entry.getValue()).longValue());
                break;
            case 4:
                livVar.m15495r(nxpVar.f44977a, ((Integer) entry.getValue()).intValue());
                break;
            case 5:
                livVar.m15492o(nxpVar.f44977a, ((Long) entry.getValue()).longValue());
                break;
            case 6:
                livVar.m15491n(nxpVar.f44977a, ((Integer) entry.getValue()).intValue());
                break;
            case 7:
                livVar.m15487j(nxpVar.f44977a, ((Boolean) entry.getValue()).booleanValue());
                break;
            case 8:
                livVar.m15503z(nxpVar.f44977a, (String) entry.getValue());
                break;
            case 9:
                livVar.m15494q(nxpVar.f44977a, entry.getValue(), nzf.f45060a.m18259a(entry.getValue().getClass()));
                break;
            case 10:
                livVar.m15497t(nxpVar.f44977a, entry.getValue(), nzf.f45060a.m18259a(entry.getValue().getClass()));
                break;
            case 11:
                livVar.m15488k(nxpVar.f44977a, (nwr) entry.getValue());
                break;
            case 12:
                livVar.m15476A(nxpVar.f44977a, ((Integer) entry.getValue()).intValue());
                break;
            case 13:
                livVar.m15495r(nxpVar.f44977a, ((Integer) entry.getValue()).intValue());
                break;
            case 14:
                livVar.m15499v(nxpVar.f44977a, ((Integer) entry.getValue()).intValue());
                break;
            case 15:
                livVar.m15500w(nxpVar.f44977a, ((Long) entry.getValue()).longValue());
                break;
            case 16:
                livVar.m15501x(nxpVar.f44977a, ((Integer) entry.getValue()).intValue());
                break;
            case 17:
                livVar.m15502y(nxpVar.f44977a, ((Long) entry.getValue()).longValue());
                break;
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m17715a(int i) {
        switch (i) {
            case 1:
                return "PROCESSOR_OUTPUT_IMAGE_TYPE_UNDEFINED";
            case 2:
                return "HDR_PLUS";
            case 3:
                return "LONG_EXPOSURE";
            case 4:
                return "ACTION_PAN";
            default:
                return yTyWiTtGtnBhy.SqOxH;
        }
    }

    /* JADX INFO: renamed from: b */
    public static Pair m17716b(byte[] bArr) {
        ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(bArr.length).order(ByteOrder.nativeOrder());
        byteBufferOrder.put(bArr);
        return new Pair(byteBufferOrder, Long.valueOf(BufferUtils.m4902a(byteBufferOrder)));
    }

    /* JADX INFO: renamed from: c */
    public static void m17717c(byte[] bArr, HalAfMetadata halAfMetadata) {
        Pair pairM17716b = m17716b(bArr);
        GcamModuleJNI.HalAfMetadata_SetFaceDeblurInfoFromBytes(halAfMetadata.f8287a, halAfMetadata, nsd.m17642a(new nsd(((Long) pairM17716b.second).longValue())), ((ByteBuffer) pairM17716b.first).capacity());
    }

    /* JADX INFO: renamed from: d */
    public static YuvReadView m17718d(YuvImage yuvImage) {
        return new nsi(new YuvReadView(GcamModuleJNI.YuvImage_cref(yuvImage.f8389a, yuvImage)), yuvImage);
    }

    /* JADX INFO: renamed from: e */
    public static YuvReadView m17719e(YuvWriteView yuvWriteView) {
        return new nsi(new YuvReadView(GcamModuleJNI.YuvWriteView_cref(yuvWriteView.f8393b, yuvWriteView)), yuvWriteView);
    }

    /* JADX INFO: renamed from: f */
    public static YuvWriteView m17720f(YuvImage yuvImage) {
        return new nsj(new YuvWriteView(GcamModuleJNI.YuvImage_ref(yuvImage.f8389a, yuvImage)), yuvImage);
    }

    /* JADX INFO: renamed from: g */
    public static int m17721g(nrn nrnVar) {
        return GcamModuleJNI.ImageRotationToDegrees(nrnVar.f44260j);
    }

    /* JADX INFO: renamed from: h */
    public static nrn m17722h(int i) {
        return nrn.m17632a(GcamModuleJNI.DegreesToImageRotation(i));
    }

    /* JADX INFO: renamed from: i */
    public static void m17723i(ShotMetadata shotMetadata, nrl nrlVar) {
        GcamModuleJNI.SetThermalState(ShotMetadata.m5095a(shotMetadata), shotMetadata, nrlVar.f44242j);
    }

    /* JADX INFO: renamed from: j */
    public static boolean m17724j(nrx nrxVar) {
        return GcamModuleJNI.IsRgb8(nrxVar.f44321l);
    }

    /* JADX INFO: renamed from: k */
    public static void m17725k(ShotMetadata shotMetadata, int i) {
        GcamModuleJNI.RotateShotMetadata__SWIG_1(ShotMetadata.m5095a(shotMetadata), shotMetadata, i);
    }

    /* JADX INFO: renamed from: l */
    public static int m17726l(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            default:
                return 0;
        }
    }

    /* JADX INFO: renamed from: m */
    public static Object m17727m(Future future) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException e) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    /* JADX INFO: renamed from: n */
    public static void m17728n(Throwable th) {
        if (th instanceof InterruptedException) {
            Thread.currentThread().interrupt();
        }
    }

    /* JADX INFO: renamed from: o */
    public static final int m17729o(int i, Object obj, Object obj2) {
        nyr nyrVar = (nyr) obj;
        liv livVar = (liv) obj2;
        int iM17981Z = 0;
        if (!nyrVar.isEmpty()) {
            for (Map.Entry entry : nyrVar.entrySet()) {
                iM17981Z += nxb.m17981Z(i) + nxb.m17971P(liv.m15472C((ktz) livVar.f38339a, entry.getKey(), entry.getValue()));
            }
        }
        return iM17981Z;
    }

    /* JADX INFO: renamed from: p */
    public static final boolean m17730p(Object obj) {
        return !((nyr) obj).f45034b;
    }

    /* JADX INFO: renamed from: q */
    public static final Object m17731q(Object obj, Object obj2) {
        nyr nyrVarM18191a = (nyr) obj;
        nyr nyrVar = (nyr) obj2;
        if (!nyrVar.isEmpty()) {
            if (!nyrVarM18191a.f45034b) {
                nyrVarM18191a = nyrVarM18191a.m18191a();
            }
            nyrVarM18191a.m18192b();
            if (!nyrVar.isEmpty()) {
                nyrVarM18191a.putAll(nyrVar);
            }
        }
        return nyrVarM18191a;
    }

    /* JADX INFO: renamed from: r */
    public static final Object m17732r() {
        return nyr.f45033a.m18191a();
    }

    /* JADX INFO: renamed from: s */
    public static int m17733s(Map.Entry entry) {
        return ((nxp) entry.getKey()).f44977a;
    }

    /* JADX INFO: renamed from: t */
    public static nxh m17734t(Object obj) {
        return ((nxo) obj).f44976l;
    }

    /* JADX INFO: renamed from: u */
    public static nxh m17735u(Object obj) {
        return ((nxo) obj).m18120c();
    }

    /* JADX INFO: renamed from: v */
    public static void m17736v(nzi nziVar, Object obj, nxf nxfVar, nxh nxhVar) {
        ktz ktzVar = (ktz) obj;
        nxhVar.m18029l((nxp) ktzVar.f37201d, nziVar.mo17920t(ktzVar.f37200c.getClass(), nxfVar));
    }

    /* JADX INFO: renamed from: w */
    public static final void m17737w(Object obj) {
        m17734t(obj).m18024e();
    }

    /* JADX INFO: renamed from: x */
    public static final nwr m17738x(nxb nxbVar, byte[] bArr) {
        nxbVar.m17997ai();
        return new nwq(bArr);
    }

    /* JADX INFO: renamed from: y */
    public static double m17739y(byte[] bArr, int i) {
        return Double.longBitsToDouble(m17708Q(bArr, i));
    }

    /* JADX INFO: renamed from: z */
    public static float m17740z(byte[] bArr, int i) {
        return Float.intBitsToFloat(m17693B(bArr, i));
    }
}
