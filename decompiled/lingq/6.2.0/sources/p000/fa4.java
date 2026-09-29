package p000;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.os.Bundle;
import androidx.compose.foundation.C0077c;
import androidx.compose.foundation.gestures.C0100h;
import androidx.compose.foundation.lazy.AbstractC0126a;
import androidx.compose.foundation.lazy.C0127b;
import androidx.compose.foundation.text.contextmenu.modifier.C0174c;
import androidx.compose.foundation.text.input.internal.C0187a;
import androidx.compose.foundation.text.selection.C0205f;
import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.node.AbstractC0362l;
import androidx.compose.p002ui.node.C0352b;
import androidx.compose.p002ui.node.C0357g;
import androidx.compose.p002ui.platform.AbstractC0394f;
import androidx.compose.runtime.AbstractC0278f;
import androidx.compose.runtime.internal.C0282a;
import com.facebook.appevents.OperationalDataEnum;
import com.facebook.appevents.ParameterClassification;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;
import kotlin.Pair;
import kotlin.UninitializedPropertyAccessException;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonEncodingException;

/* JADX INFO: loaded from: classes.dex */
public abstract class fa4 implements zr2 {

    /* JADX INFO: renamed from: H */
    public static final /* synthetic */ int f38703H = 0;

    /* JADX INFO: renamed from: I */
    public static final /* synthetic */ int f38704I = 0;

    /* JADX INFO: renamed from: J */
    public static final /* synthetic */ int f38705J = 0;

    /* JADX INFO: renamed from: a */
    public static final C0842cc f38706a;

    /* JADX INFO: renamed from: b */
    public static final C0842cc f38707b;

    /* JADX INFO: renamed from: c */
    public static final C0842cc f38708c;

    /* JADX INFO: renamed from: d */
    public static final lf4 f38709d = new lf4(2);

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ int f38710e = 0;

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ int f38711f = 0;

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ int f38712g = 0;

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ int f38713h = 0;

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ int f38714i = 0;

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ int f38715j = 0;

    /* JADX INFO: renamed from: k */
    public static final /* synthetic */ int f38716k = 0;

    /* JADX INFO: renamed from: l */
    public static final /* synthetic */ int f38717l = 0;

    static {
        int i = 5;
        f38706a = new C0842cc("RESUME_TOKEN", i);
        f38707b = new C0842cc("REMOVED_TASK", i);
        f38708c = new C0842cc("CLOSED_EMPTY", i);
    }

    /* JADX INFO: renamed from: A */
    public static final CharSequence m11627A(CharSequence charSequence, int i) {
        charSequence.getClass();
        if (charSequence.length() >= 200) {
            if (i != -1) {
                int i2 = i - 30;
                int i3 = i + 30;
                String str = i2 <= 0 ? "" : ".....";
                String str2 = i3 >= charSequence.length() ? "" : ".....";
                StringBuilder sbM22997t = ux5.m22997t(str);
                if (i2 < 0) {
                    i2 = 0;
                }
                int length = charSequence.length();
                if (i3 > length) {
                    i3 = length;
                }
                sbM22997t.append(charSequence.subSequence(i2, i3).toString());
                sbM22997t.append(str2);
                return sbM22997t.toString();
            }
            int length2 = charSequence.length() - 60;
            if (length2 > 0) {
                return "....." + charSequence.subSequence(length2, charSequence.length()).toString();
            }
        }
        return charSequence;
    }

    /* JADX INFO: renamed from: B */
    public static final String m11628B(Number number, String str) {
        StringBuilder sb = new StringBuilder("Unexpected special floating-point value ");
        sb.append(number);
        return AbstractC3393o1.m17738m(sb, str != null ? wq1.m24118n(" with key ", str, ". ") : ". ", "By default, non-finite floating point values are prohibited because they do not conform JSON specification.");
    }

    /* JADX INFO: renamed from: C */
    public static byte[] m11629C(InputStream inputStream, int i) throws IOException {
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int i3 = inputStream.read(bArr, i2, i - i2);
            if (i3 < 0) {
                C3386nv.m17633t(ux5.m22988k(i, "Not enough bytes to read: "));
                return null;
            }
            i2 += i3;
        }
        return bArr;
    }

    /* JADX INFO: renamed from: D */
    public static byte[] m11630D(FileInputStream fileInputStream, int i, int i2) {
        Inflater inflater = new Inflater();
        try {
            byte[] bArr = new byte[i2];
            byte[] bArr2 = new byte[2048];
            int i3 = 0;
            int iInflate = 0;
            while (!inflater.finished() && !inflater.needsDictionary() && i3 < i) {
                int i4 = fileInputStream.read(bArr2);
                if (i4 < 0) {
                    throw new IllegalStateException("Invalid zip data. Stream ended after $totalBytesRead bytes. Expected " + i + " bytes");
                }
                inflater.setInput(bArr2, 0, i4);
                try {
                    iInflate += inflater.inflate(bArr, iInflate, i2 - iInflate);
                    i3 += i4;
                } catch (DataFormatException e) {
                    throw new IllegalStateException(e.getMessage());
                }
            }
            if (i3 == i) {
                if (!inflater.finished()) {
                    throw new IllegalStateException("Inflater did not finish");
                }
                inflater.end();
                return bArr;
            }
            throw new IllegalStateException("Didn't read enough bytes during decompression. expected=" + i + " actual=" + i3);
        } catch (Throwable th) {
            inflater.end();
            throw th;
        }
    }

    /* JADX INFO: renamed from: E */
    public static long m11631E(InputStream inputStream, int i) throws IOException {
        byte[] bArrM11629C = m11629C(inputStream, i);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j += ((long) (bArrM11629C[i2] & 255)) << (i2 * 8);
        }
        return j;
    }

    /* JADX INFO: renamed from: F */
    public static final boolean m11632F(n66 n66Var, Object obj, Object obj2) {
        Object objM17255g = n66Var.m17255g(obj);
        if (objM17255g == null) {
            return false;
        }
        if (!(objM17255g instanceof o66)) {
            if (!objM17255g.equals(obj2)) {
                return false;
            }
            n66Var.m17259k(obj);
            return true;
        }
        o66 o66Var = (o66) objM17255g;
        boolean zM17819l = o66Var.m17819l(obj2);
        if (zM17819l && o66Var.m724b()) {
            n66Var.m17259k(obj);
        }
        return zM17819l;
    }

    /* JADX INFO: renamed from: G */
    public static final void m11633G(n66 n66Var, Object obj) {
        boolean zM724b;
        long[] jArr = n66Var.f52399a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        Object obj2 = n66Var.f52400b[i4];
                        Object obj3 = n66Var.f52401c[i4];
                        if (obj3 instanceof o66) {
                            o66 o66Var = (o66) obj3;
                            o66Var.m17819l(obj);
                            zM724b = o66Var.m724b();
                        } else {
                            zM724b = obj3 == obj;
                        }
                        if (zM724b) {
                            n66Var.m17260l(i4);
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    /* JADX INFO: renamed from: H */
    public static void m11634H(RuntimeException runtimeException, String str) {
        StackTraceElement[] stackTrace = runtimeException.getStackTrace();
        int length = stackTrace.length;
        int i = -1;
        for (int i2 = 0; i2 < length; i2++) {
            if (str.equals(stackTrace[i2].getClassName())) {
                i = i2;
            }
        }
        runtimeException.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i + 1, length));
    }

    /* JADX INFO: renamed from: I */
    public static final e16 m11635I(e16 e16Var, C0174c c0174c, vi3 vi3Var, vi3 vi3Var2, vm1 vm1Var) {
        return e16Var.mo3161g(new pt9(c0174c, vi3Var, vi3Var2, vm1Var));
    }

    /* JADX INFO: renamed from: J */
    public static void m11636J(String str) {
        UninitializedPropertyAccessException uninitializedPropertyAccessException = new UninitializedPropertyAccessException(wq1.m24118n("lateinit property ", str, " has not been initialized"));
        m11634H(uninitializedPropertyAccessException, fa4.class.getName());
        throw uninitializedPropertyAccessException;
    }

    /* JADX INFO: renamed from: K */
    public static final Object m11637K(vi3 vi3Var, ContinuationImpl continuationImpl) {
        if (continuationImpl.getContext().get(g9c.f40429c) == null) {
            return b34.m3250q(continuationImpl.getContext()).mo1250e(vi3Var, continuationImpl);
        }
        ho2.m13383c();
        return null;
    }

    /* JADX INFO: renamed from: L */
    public static void m11638L(ByteArrayOutputStream byteArrayOutputStream, long j, int i) throws IOException {
        byte[] bArr = new byte[i];
        for (int i2 = 0; i2 < i; i2++) {
            bArr[i2] = (byte) ((j >> (i2 * 8)) & 255);
        }
        byteArrayOutputStream.write(bArr);
    }

    /* JADX INFO: renamed from: M */
    public static void m11639M(ByteArrayOutputStream byteArrayOutputStream, int i) throws IOException {
        m11638L(byteArrayOutputStream, i, 2);
    }

    /* JADX INFO: renamed from: a */
    public static final void m11640a(C0205f c0205f, C0282a c0282a, ye1 ye1Var, int i) {
        int i2;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(1533506138);
        if ((i & 6) == 0) {
            i2 = (tj3Var.m22124i(c0205f) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= tj3Var.m22124i(c0282a) ? 32 : 16;
        }
        int i3 = 0;
        if (tj3Var.m22099R(i2 & 1, (i2 & 19) != 18)) {
            tj3Var.m22111b0(-885604480);
            l70.m15940c(c0205f.m1108i(), c0282a, tj3Var, i2 & 112);
            tj3Var.m22139q(false);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new kb1(c0205f, c0282a, i, i3);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final JsonEncodingException m11641b(SerialDescriptor serialDescriptor) {
        String str = "Value of type '" + serialDescriptor.mo3694a() + "' can't be used in JSON as a key in the map. It should have either primitive or enum kind, but its kind is '" + serialDescriptor.getKind() + '\'';
        serialDescriptor.mo3694a();
        return new JsonEncodingException(str, "Use 'allowStructuredMapKeys = true' in 'Json {}' builder to convert such maps to [key1, value1, key2, value2,...] arrays.");
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0129 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:102:0x012b  */
    /* JADX WARN: Code duplicated, block: B:103:0x012e  */
    /* JADX WARN: Code duplicated, block: B:106:0x0134  */
    /* JADX WARN: Code duplicated, block: B:108:0x013e  */
    /* JADX WARN: Code duplicated, block: B:111:0x0149  */
    /* JADX WARN: Code duplicated, block: B:113:0x0150  */
    /* JADX WARN: Code duplicated, block: B:116:0x0161  */
    /* JADX WARN: Code duplicated, block: B:118:0x0165  */
    /* JADX WARN: Code duplicated, block: B:121:0x0172  */
    /* JADX WARN: Code duplicated, block: B:124:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:127:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:129:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x0068  */
    /* JADX WARN: Code duplicated, block: B:39:0x006c  */
    /* JADX WARN: Code duplicated, block: B:41:0x0074  */
    /* JADX WARN: Code duplicated, block: B:42:0x0077  */
    /* JADX WARN: Code duplicated, block: B:45:0x007d  */
    /* JADX WARN: Code duplicated, block: B:48:0x0085  */
    /* JADX WARN: Code duplicated, block: B:50:0x0089  */
    /* JADX WARN: Code duplicated, block: B:52:0x008c  */
    /* JADX WARN: Code duplicated, block: B:54:0x0094  */
    /* JADX WARN: Code duplicated, block: B:55:0x0097  */
    /* JADX WARN: Code duplicated, block: B:59:0x009f  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:66:0x00af  */
    /* JADX WARN: Code duplicated, block: B:68:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:69:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:76:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:78:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:79:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:81:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:84:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:85:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:88:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:90:0x0102  */
    /* JADX INFO: renamed from: c */
    public static final void m11642c(e16 e16Var, C0127b c0127b, t17 t17Var, InterfaceC3735wu interfaceC3735wu, InterfaceC3457pe interfaceC3457pe, x63 x63Var, boolean z, C0077c c0077c, vi3 vi3Var, ye1 ye1Var, int i, int i2) {
        int i3;
        C0127b c0127bM17056a;
        t17 x17Var;
        int i4;
        InterfaceC3735wu interfaceC3735wu2;
        int i5;
        InterfaceC3457pe interfaceC3457pe2;
        int i6;
        int i7;
        boolean z2;
        int i8;
        boolean z3;
        tj3 tj3Var;
        e16 e16Var2;
        C0077c c0077c2;
        C0127b c0127b2;
        t17 t17Var2;
        InterfaceC3735wu interfaceC3735wu3;
        InterfaceC3457pe interfaceC3457pe3;
        boolean z4;
        x63 x63Var2;
        x18 x18VarM22143u;
        e16 e16Var3;
        f32 f32VarM21341a;
        boolean zM22120g;
        Object objM22097O;
        e16 e16Var4;
        x63 x63Var3;
        int i9;
        C0077c c0077cM24823b;
        int i10;
        tj3 tj3Var2 = (tj3) ye1Var;
        tj3Var2.m22115d0(53695811);
        int i11 = i2 & 1;
        if (i11 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (tj3Var2.m22120g(e16Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                c0127bM17056a = c0127b;
                int i12 = tj3Var2.m22120g(c0127bM17056a) ? 32 : 16;
                i3 |= i12;
            } else {
                c0127bM17056a = c0127b;
            }
            i3 |= i12;
        } else {
            c0127bM17056a = c0127b;
        }
        int i13 = i2 & 4;
        if (i13 == 0) {
            if ((i & 384) == 0) {
                x17Var = t17Var;
                i3 |= tj3Var2.m22120g(x17Var) ? 256 : 128;
            }
            i4 = i3 | 3072;
            if ((i & 24576) == 0) {
                if ((i2 & 16) == 0) {
                    interfaceC3735wu2 = interfaceC3735wu;
                    int i14 = tj3Var2.m22120g(interfaceC3735wu2) ? 16384 : 8192;
                    i4 |= i14;
                } else {
                    interfaceC3735wu2 = interfaceC3735wu;
                }
                i4 |= i14;
            } else {
                interfaceC3735wu2 = interfaceC3735wu;
            }
            i5 = i2 & 32;
            if (i5 != 0) {
                if ((196608 & i) == 0) {
                    interfaceC3457pe2 = interfaceC3457pe;
                    if (tj3Var2.m22120g(interfaceC3457pe2)) {
                        i6 = 131072;
                    } else {
                        i6 = 65536;
                    }
                    i4 |= i6;
                }
                if ((1572864 & i) == 0) {
                    i4 |= 524288;
                }
                i7 = i2 & 128;
                if (i7 != 0) {
                    if ((12582912 & i) == 0) {
                        z2 = z;
                        if (tj3Var2.m22122h(z2)) {
                            i8 = 8388608;
                        } else {
                            i8 = 4194304;
                        }
                        i4 |= i8;
                    }
                    if ((100663296 & i) == 0) {
                        i4 |= 33554432;
                    }
                    if ((805306368 & i) != 0) {
                        if (tj3Var2.m22124i(vi3Var)) {
                            i10 = 536870912;
                        } else {
                            i10 = 268435456;
                        }
                        i4 |= i10;
                    }
                    if ((306783379 & i4) != 306783378) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (tj3Var2.m22099R(i4 & 1, z3)) {
                        tj3Var2.m22104W();
                        if ((i & 1) != 0 || tj3Var2.m22084B()) {
                            if (i11 != 0) {
                                e16Var3 = b16.f7762a;
                            } else {
                                e16Var3 = e16Var;
                            }
                            if ((i2 & 2) != 0) {
                                i4 &= -113;
                                c0127bM17056a = mv4.m17056a(0, tj3Var2, 3);
                            }
                            if (i13 != 0) {
                                x17Var = new x17(0.0f, 0.0f, 0.0f, 0.0f);
                            }
                            if ((i2 & 16) != 0) {
                                i4 &= -57345;
                                interfaceC3735wu2 = eh0.f37238d;
                            }
                            if (i5 != 0) {
                                interfaceC3457pe2 = nj0.f52791J;
                            }
                            f32VarM21341a = sf9.m21341a(tj3Var2);
                            zM22120g = tj3Var2.m22120g(f32VarM21341a);
                            objM22097O = tj3Var2.m22097O();
                            if (zM22120g || objM22097O == we1.f66679a) {
                                objM22097O = new C0100h(f32VarM21341a);
                                tj3Var2.m22131l0(objM22097O);
                            }
                            C0100h c0100h = (C0100h) objM22097O;
                            if (i7 != 0) {
                                z2 = true;
                            }
                            e16Var4 = e16Var3;
                            x63Var3 = c0100h;
                            i9 = i4 & (-238551041);
                            c0077cM24823b = y07.m24823b(tj3Var2);
                        } else {
                            tj3Var2.m22102U();
                            if ((i2 & 2) != 0) {
                                i4 &= -113;
                            }
                            if ((i2 & 16) != 0) {
                                i4 &= -57345;
                            }
                            i9 = i4 & (-238551041);
                            e16Var4 = e16Var;
                            x63Var3 = x63Var;
                            c0077cM24823b = c0077c;
                        }
                        t17 t17Var3 = x17Var;
                        InterfaceC3735wu interfaceC3735wu4 = interfaceC3735wu2;
                        InterfaceC3457pe interfaceC3457pe4 = interfaceC3457pe2;
                        boolean z5 = z2;
                        C0127b c0127b3 = c0127bM17056a;
                        tj3Var2.m22140r();
                        tj3Var = tj3Var2;
                        AbstractC0126a.m972a(e16Var4, c0127b3, t17Var3, true, x63Var3, z5, c0077cM24823b, interfaceC3457pe4, interfaceC3735wu4, null, null, vi3Var, tj3Var, (i9 & 14) | 24576 | (i9 & 112) | (i9 & 896) | (i9 & 7168) | ((i9 >> 3) & 3670016) | ((i9 << 12) & 1879048192), ((i9 >> 12) & 14) | ((i9 >> 18) & 7168), 6400);
                        e16Var2 = e16Var4;
                        c0127b2 = c0127b3;
                        t17Var2 = t17Var3;
                        x63Var2 = x63Var3;
                        z4 = z5;
                        c0077c2 = c0077cM24823b;
                        interfaceC3457pe3 = interfaceC3457pe4;
                        interfaceC3735wu3 = interfaceC3735wu4;
                    } else {
                        tj3Var = tj3Var2;
                        tj3Var.m22102U();
                        e16Var2 = e16Var;
                        c0077c2 = c0077c;
                        c0127b2 = c0127bM17056a;
                        t17Var2 = x17Var;
                        interfaceC3735wu3 = interfaceC3735wu2;
                        interfaceC3457pe3 = interfaceC3457pe2;
                        z4 = z2;
                        x63Var2 = x63Var;
                    }
                    x18VarM22143u = tj3Var.m22143u();
                    if (x18VarM22143u != null) {
                        x18VarM22143u.f67642d = new yj0(e16Var2, c0127b2, t17Var2, interfaceC3735wu3, interfaceC3457pe3, x63Var2, z4, c0077c2, vi3Var, i, i2, 1);
                    }
                }
                i4 |= 12582912;
                z2 = z;
                if ((100663296 & i) == 0) {
                    i4 |= 33554432;
                }
                if ((805306368 & i) != 0) {
                    if (tj3Var2.m22124i(vi3Var)) {
                        i10 = 536870912;
                    } else {
                        i10 = 268435456;
                    }
                    i4 |= i10;
                }
                if ((306783379 & i4) != 306783378) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (tj3Var2.m22099R(i4 & 1, z3)) {
                    tj3Var2.m22104W();
                    if ((i & 1) != 0) {
                        if (i11 != 0) {
                            e16Var3 = b16.f7762a;
                        } else {
                            e16Var3 = e16Var;
                        }
                        if ((i2 & 2) != 0) {
                            i4 &= -113;
                            c0127bM17056a = mv4.m17056a(0, tj3Var2, 3);
                        }
                        if (i13 != 0) {
                            x17Var = new x17(0.0f, 0.0f, 0.0f, 0.0f);
                        }
                        if ((i2 & 16) != 0) {
                            i4 &= -57345;
                            interfaceC3735wu2 = eh0.f37238d;
                        }
                        if (i5 != 0) {
                            interfaceC3457pe2 = nj0.f52791J;
                        }
                        f32VarM21341a = sf9.m21341a(tj3Var2);
                        zM22120g = tj3Var2.m22120g(f32VarM21341a);
                        objM22097O = tj3Var2.m22097O();
                        if (zM22120g) {
                            objM22097O = new C0100h(f32VarM21341a);
                            tj3Var2.m22131l0(objM22097O);
                        } else {
                            objM22097O = new C0100h(f32VarM21341a);
                            tj3Var2.m22131l0(objM22097O);
                        }
                        C0100h c0100h2 = (C0100h) objM22097O;
                        if (i7 != 0) {
                            z2 = true;
                        }
                        e16Var4 = e16Var3;
                        x63Var3 = c0100h2;
                        i9 = i4 & (-238551041);
                        c0077cM24823b = y07.m24823b(tj3Var2);
                    } else {
                        if (i11 != 0) {
                            e16Var3 = b16.f7762a;
                        } else {
                            e16Var3 = e16Var;
                        }
                        if ((i2 & 2) != 0) {
                            i4 &= -113;
                            c0127bM17056a = mv4.m17056a(0, tj3Var2, 3);
                        }
                        if (i13 != 0) {
                            x17Var = new x17(0.0f, 0.0f, 0.0f, 0.0f);
                        }
                        if ((i2 & 16) != 0) {
                            i4 &= -57345;
                            interfaceC3735wu2 = eh0.f37238d;
                        }
                        if (i5 != 0) {
                            interfaceC3457pe2 = nj0.f52791J;
                        }
                        f32VarM21341a = sf9.m21341a(tj3Var2);
                        zM22120g = tj3Var2.m22120g(f32VarM21341a);
                        objM22097O = tj3Var2.m22097O();
                        if (zM22120g) {
                            objM22097O = new C0100h(f32VarM21341a);
                            tj3Var2.m22131l0(objM22097O);
                        } else {
                            objM22097O = new C0100h(f32VarM21341a);
                            tj3Var2.m22131l0(objM22097O);
                        }
                        C0100h c0100h3 = (C0100h) objM22097O;
                        if (i7 != 0) {
                            z2 = true;
                        }
                        e16Var4 = e16Var3;
                        x63Var3 = c0100h3;
                        i9 = i4 & (-238551041);
                        c0077cM24823b = y07.m24823b(tj3Var2);
                    }
                    t17 t17Var4 = x17Var;
                    InterfaceC3735wu interfaceC3735wu5 = interfaceC3735wu2;
                    InterfaceC3457pe interfaceC3457pe5 = interfaceC3457pe2;
                    boolean z6 = z2;
                    C0127b c0127b4 = c0127bM17056a;
                    tj3Var2.m22140r();
                    tj3Var = tj3Var2;
                    AbstractC0126a.m972a(e16Var4, c0127b4, t17Var4, true, x63Var3, z6, c0077cM24823b, interfaceC3457pe5, interfaceC3735wu5, null, null, vi3Var, tj3Var, (i9 & 14) | 24576 | (i9 & 112) | (i9 & 896) | (i9 & 7168) | ((i9 >> 3) & 3670016) | ((i9 << 12) & 1879048192), ((i9 >> 12) & 14) | ((i9 >> 18) & 7168), 6400);
                    e16Var2 = e16Var4;
                    c0127b2 = c0127b4;
                    t17Var2 = t17Var4;
                    x63Var2 = x63Var3;
                    z4 = z6;
                    c0077c2 = c0077cM24823b;
                    interfaceC3457pe3 = interfaceC3457pe5;
                    interfaceC3735wu3 = interfaceC3735wu5;
                } else {
                    tj3Var = tj3Var2;
                    tj3Var.m22102U();
                    e16Var2 = e16Var;
                    c0077c2 = c0077c;
                    c0127b2 = c0127bM17056a;
                    t17Var2 = x17Var;
                    interfaceC3735wu3 = interfaceC3735wu2;
                    interfaceC3457pe3 = interfaceC3457pe2;
                    z4 = z2;
                    x63Var2 = x63Var;
                }
                x18VarM22143u = tj3Var.m22143u();
                if (x18VarM22143u != null) {
                    x18VarM22143u.f67642d = new yj0(e16Var2, c0127b2, t17Var2, interfaceC3735wu3, interfaceC3457pe3, x63Var2, z4, c0077c2, vi3Var, i, i2, 1);
                }
            }
            i4 |= 196608;
            interfaceC3457pe2 = interfaceC3457pe;
            if ((1572864 & i) == 0) {
                i4 |= 524288;
            }
            i7 = i2 & 128;
            if (i7 != 0) {
                if ((12582912 & i) == 0) {
                    z2 = z;
                    if (tj3Var2.m22122h(z2)) {
                        i8 = 8388608;
                    } else {
                        i8 = 4194304;
                    }
                    i4 |= i8;
                }
                if ((100663296 & i) == 0) {
                    i4 |= 33554432;
                }
                if ((805306368 & i) != 0) {
                    if (tj3Var2.m22124i(vi3Var)) {
                        i10 = 536870912;
                    } else {
                        i10 = 268435456;
                    }
                    i4 |= i10;
                }
                if ((306783379 & i4) != 306783378) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (tj3Var2.m22099R(i4 & 1, z3)) {
                    tj3Var2.m22104W();
                    if ((i & 1) != 0) {
                        if (i11 != 0) {
                            e16Var3 = b16.f7762a;
                        } else {
                            e16Var3 = e16Var;
                        }
                        if ((i2 & 2) != 0) {
                            i4 &= -113;
                            c0127bM17056a = mv4.m17056a(0, tj3Var2, 3);
                        }
                        if (i13 != 0) {
                            x17Var = new x17(0.0f, 0.0f, 0.0f, 0.0f);
                        }
                        if ((i2 & 16) != 0) {
                            i4 &= -57345;
                            interfaceC3735wu2 = eh0.f37238d;
                        }
                        if (i5 != 0) {
                            interfaceC3457pe2 = nj0.f52791J;
                        }
                        f32VarM21341a = sf9.m21341a(tj3Var2);
                        zM22120g = tj3Var2.m22120g(f32VarM21341a);
                        objM22097O = tj3Var2.m22097O();
                        if (zM22120g) {
                            objM22097O = new C0100h(f32VarM21341a);
                            tj3Var2.m22131l0(objM22097O);
                        } else {
                            objM22097O = new C0100h(f32VarM21341a);
                            tj3Var2.m22131l0(objM22097O);
                        }
                        C0100h c0100h4 = (C0100h) objM22097O;
                        if (i7 != 0) {
                            z2 = true;
                        }
                        e16Var4 = e16Var3;
                        x63Var3 = c0100h4;
                        i9 = i4 & (-238551041);
                        c0077cM24823b = y07.m24823b(tj3Var2);
                    } else {
                        if (i11 != 0) {
                            e16Var3 = b16.f7762a;
                        } else {
                            e16Var3 = e16Var;
                        }
                        if ((i2 & 2) != 0) {
                            i4 &= -113;
                            c0127bM17056a = mv4.m17056a(0, tj3Var2, 3);
                        }
                        if (i13 != 0) {
                            x17Var = new x17(0.0f, 0.0f, 0.0f, 0.0f);
                        }
                        if ((i2 & 16) != 0) {
                            i4 &= -57345;
                            interfaceC3735wu2 = eh0.f37238d;
                        }
                        if (i5 != 0) {
                            interfaceC3457pe2 = nj0.f52791J;
                        }
                        f32VarM21341a = sf9.m21341a(tj3Var2);
                        zM22120g = tj3Var2.m22120g(f32VarM21341a);
                        objM22097O = tj3Var2.m22097O();
                        if (zM22120g) {
                            objM22097O = new C0100h(f32VarM21341a);
                            tj3Var2.m22131l0(objM22097O);
                        } else {
                            objM22097O = new C0100h(f32VarM21341a);
                            tj3Var2.m22131l0(objM22097O);
                        }
                        C0100h c0100h5 = (C0100h) objM22097O;
                        if (i7 != 0) {
                            z2 = true;
                        }
                        e16Var4 = e16Var3;
                        x63Var3 = c0100h5;
                        i9 = i4 & (-238551041);
                        c0077cM24823b = y07.m24823b(tj3Var2);
                    }
                    t17 t17Var5 = x17Var;
                    InterfaceC3735wu interfaceC3735wu6 = interfaceC3735wu2;
                    InterfaceC3457pe interfaceC3457pe6 = interfaceC3457pe2;
                    boolean z7 = z2;
                    C0127b c0127b5 = c0127bM17056a;
                    tj3Var2.m22140r();
                    tj3Var = tj3Var2;
                    AbstractC0126a.m972a(e16Var4, c0127b5, t17Var5, true, x63Var3, z7, c0077cM24823b, interfaceC3457pe6, interfaceC3735wu6, null, null, vi3Var, tj3Var, (i9 & 14) | 24576 | (i9 & 112) | (i9 & 896) | (i9 & 7168) | ((i9 >> 3) & 3670016) | ((i9 << 12) & 1879048192), ((i9 >> 12) & 14) | ((i9 >> 18) & 7168), 6400);
                    e16Var2 = e16Var4;
                    c0127b2 = c0127b5;
                    t17Var2 = t17Var5;
                    x63Var2 = x63Var3;
                    z4 = z7;
                    c0077c2 = c0077cM24823b;
                    interfaceC3457pe3 = interfaceC3457pe6;
                    interfaceC3735wu3 = interfaceC3735wu6;
                } else {
                    tj3Var = tj3Var2;
                    tj3Var.m22102U();
                    e16Var2 = e16Var;
                    c0077c2 = c0077c;
                    c0127b2 = c0127bM17056a;
                    t17Var2 = x17Var;
                    interfaceC3735wu3 = interfaceC3735wu2;
                    interfaceC3457pe3 = interfaceC3457pe2;
                    z4 = z2;
                    x63Var2 = x63Var;
                }
                x18VarM22143u = tj3Var.m22143u();
                if (x18VarM22143u != null) {
                    x18VarM22143u.f67642d = new yj0(e16Var2, c0127b2, t17Var2, interfaceC3735wu3, interfaceC3457pe3, x63Var2, z4, c0077c2, vi3Var, i, i2, 1);
                }
            }
            i4 |= 12582912;
            z2 = z;
            if ((100663296 & i) == 0) {
                i4 |= 33554432;
            }
            if ((805306368 & i) != 0) {
                if (tj3Var2.m22124i(vi3Var)) {
                    i10 = 536870912;
                } else {
                    i10 = 268435456;
                }
                i4 |= i10;
            }
            if ((306783379 & i4) != 306783378) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (tj3Var2.m22099R(i4 & 1, z3)) {
                tj3Var2.m22104W();
                if ((i & 1) != 0) {
                    if (i11 != 0) {
                        e16Var3 = b16.f7762a;
                    } else {
                        e16Var3 = e16Var;
                    }
                    if ((i2 & 2) != 0) {
                        i4 &= -113;
                        c0127bM17056a = mv4.m17056a(0, tj3Var2, 3);
                    }
                    if (i13 != 0) {
                        x17Var = new x17(0.0f, 0.0f, 0.0f, 0.0f);
                    }
                    if ((i2 & 16) != 0) {
                        i4 &= -57345;
                        interfaceC3735wu2 = eh0.f37238d;
                    }
                    if (i5 != 0) {
                        interfaceC3457pe2 = nj0.f52791J;
                    }
                    f32VarM21341a = sf9.m21341a(tj3Var2);
                    zM22120g = tj3Var2.m22120g(f32VarM21341a);
                    objM22097O = tj3Var2.m22097O();
                    if (zM22120g) {
                        objM22097O = new C0100h(f32VarM21341a);
                        tj3Var2.m22131l0(objM22097O);
                    } else {
                        objM22097O = new C0100h(f32VarM21341a);
                        tj3Var2.m22131l0(objM22097O);
                    }
                    C0100h c0100h6 = (C0100h) objM22097O;
                    if (i7 != 0) {
                        z2 = true;
                    }
                    e16Var4 = e16Var3;
                    x63Var3 = c0100h6;
                    i9 = i4 & (-238551041);
                    c0077cM24823b = y07.m24823b(tj3Var2);
                } else {
                    if (i11 != 0) {
                        e16Var3 = b16.f7762a;
                    } else {
                        e16Var3 = e16Var;
                    }
                    if ((i2 & 2) != 0) {
                        i4 &= -113;
                        c0127bM17056a = mv4.m17056a(0, tj3Var2, 3);
                    }
                    if (i13 != 0) {
                        x17Var = new x17(0.0f, 0.0f, 0.0f, 0.0f);
                    }
                    if ((i2 & 16) != 0) {
                        i4 &= -57345;
                        interfaceC3735wu2 = eh0.f37238d;
                    }
                    if (i5 != 0) {
                        interfaceC3457pe2 = nj0.f52791J;
                    }
                    f32VarM21341a = sf9.m21341a(tj3Var2);
                    zM22120g = tj3Var2.m22120g(f32VarM21341a);
                    objM22097O = tj3Var2.m22097O();
                    if (zM22120g) {
                        objM22097O = new C0100h(f32VarM21341a);
                        tj3Var2.m22131l0(objM22097O);
                    } else {
                        objM22097O = new C0100h(f32VarM21341a);
                        tj3Var2.m22131l0(objM22097O);
                    }
                    C0100h c0100h7 = (C0100h) objM22097O;
                    if (i7 != 0) {
                        z2 = true;
                    }
                    e16Var4 = e16Var3;
                    x63Var3 = c0100h7;
                    i9 = i4 & (-238551041);
                    c0077cM24823b = y07.m24823b(tj3Var2);
                }
                t17 t17Var6 = x17Var;
                InterfaceC3735wu interfaceC3735wu7 = interfaceC3735wu2;
                InterfaceC3457pe interfaceC3457pe7 = interfaceC3457pe2;
                boolean z8 = z2;
                C0127b c0127b6 = c0127bM17056a;
                tj3Var2.m22140r();
                tj3Var = tj3Var2;
                AbstractC0126a.m972a(e16Var4, c0127b6, t17Var6, true, x63Var3, z8, c0077cM24823b, interfaceC3457pe7, interfaceC3735wu7, null, null, vi3Var, tj3Var, (i9 & 14) | 24576 | (i9 & 112) | (i9 & 896) | (i9 & 7168) | ((i9 >> 3) & 3670016) | ((i9 << 12) & 1879048192), ((i9 >> 12) & 14) | ((i9 >> 18) & 7168), 6400);
                e16Var2 = e16Var4;
                c0127b2 = c0127b6;
                t17Var2 = t17Var6;
                x63Var2 = x63Var3;
                z4 = z8;
                c0077c2 = c0077cM24823b;
                interfaceC3457pe3 = interfaceC3457pe7;
                interfaceC3735wu3 = interfaceC3735wu7;
            } else {
                tj3Var = tj3Var2;
                tj3Var.m22102U();
                e16Var2 = e16Var;
                c0077c2 = c0077c;
                c0127b2 = c0127bM17056a;
                t17Var2 = x17Var;
                interfaceC3735wu3 = interfaceC3735wu2;
                interfaceC3457pe3 = interfaceC3457pe2;
                z4 = z2;
                x63Var2 = x63Var;
            }
            x18VarM22143u = tj3Var.m22143u();
            if (x18VarM22143u != null) {
                x18VarM22143u.f67642d = new yj0(e16Var2, c0127b2, t17Var2, interfaceC3735wu3, interfaceC3457pe3, x63Var2, z4, c0077c2, vi3Var, i, i2, 1);
            }
        }
        i3 |= 384;
        x17Var = t17Var;
        i4 = i3 | 3072;
        if ((i & 24576) == 0) {
            if ((i2 & 16) == 0) {
                interfaceC3735wu2 = interfaceC3735wu;
                if (tj3Var2.m22120g(interfaceC3735wu2)) {
                }
                i4 |= i14;
            } else {
                interfaceC3735wu2 = interfaceC3735wu;
            }
            i4 |= i14;
        } else {
            interfaceC3735wu2 = interfaceC3735wu;
        }
        i5 = i2 & 32;
        if (i5 != 0) {
            if ((196608 & i) == 0) {
                interfaceC3457pe2 = interfaceC3457pe;
                if (tj3Var2.m22120g(interfaceC3457pe2)) {
                    i6 = 131072;
                } else {
                    i6 = 65536;
                }
                i4 |= i6;
            }
            if ((1572864 & i) == 0) {
                i4 |= 524288;
            }
            i7 = i2 & 128;
            if (i7 != 0) {
                if ((12582912 & i) == 0) {
                    z2 = z;
                    if (tj3Var2.m22122h(z2)) {
                        i8 = 8388608;
                    } else {
                        i8 = 4194304;
                    }
                    i4 |= i8;
                }
                if ((100663296 & i) == 0) {
                    i4 |= 33554432;
                }
                if ((805306368 & i) != 0) {
                    if (tj3Var2.m22124i(vi3Var)) {
                        i10 = 536870912;
                    } else {
                        i10 = 268435456;
                    }
                    i4 |= i10;
                }
                if ((306783379 & i4) != 306783378) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (tj3Var2.m22099R(i4 & 1, z3)) {
                    tj3Var2.m22104W();
                    if ((i & 1) != 0) {
                        if (i11 != 0) {
                            e16Var3 = b16.f7762a;
                        } else {
                            e16Var3 = e16Var;
                        }
                        if ((i2 & 2) != 0) {
                            i4 &= -113;
                            c0127bM17056a = mv4.m17056a(0, tj3Var2, 3);
                        }
                        if (i13 != 0) {
                            x17Var = new x17(0.0f, 0.0f, 0.0f, 0.0f);
                        }
                        if ((i2 & 16) != 0) {
                            i4 &= -57345;
                            interfaceC3735wu2 = eh0.f37238d;
                        }
                        if (i5 != 0) {
                            interfaceC3457pe2 = nj0.f52791J;
                        }
                        f32VarM21341a = sf9.m21341a(tj3Var2);
                        zM22120g = tj3Var2.m22120g(f32VarM21341a);
                        objM22097O = tj3Var2.m22097O();
                        if (zM22120g) {
                            objM22097O = new C0100h(f32VarM21341a);
                            tj3Var2.m22131l0(objM22097O);
                        } else {
                            objM22097O = new C0100h(f32VarM21341a);
                            tj3Var2.m22131l0(objM22097O);
                        }
                        C0100h c0100h8 = (C0100h) objM22097O;
                        if (i7 != 0) {
                            z2 = true;
                        }
                        e16Var4 = e16Var3;
                        x63Var3 = c0100h8;
                        i9 = i4 & (-238551041);
                        c0077cM24823b = y07.m24823b(tj3Var2);
                    } else {
                        if (i11 != 0) {
                            e16Var3 = b16.f7762a;
                        } else {
                            e16Var3 = e16Var;
                        }
                        if ((i2 & 2) != 0) {
                            i4 &= -113;
                            c0127bM17056a = mv4.m17056a(0, tj3Var2, 3);
                        }
                        if (i13 != 0) {
                            x17Var = new x17(0.0f, 0.0f, 0.0f, 0.0f);
                        }
                        if ((i2 & 16) != 0) {
                            i4 &= -57345;
                            interfaceC3735wu2 = eh0.f37238d;
                        }
                        if (i5 != 0) {
                            interfaceC3457pe2 = nj0.f52791J;
                        }
                        f32VarM21341a = sf9.m21341a(tj3Var2);
                        zM22120g = tj3Var2.m22120g(f32VarM21341a);
                        objM22097O = tj3Var2.m22097O();
                        if (zM22120g) {
                            objM22097O = new C0100h(f32VarM21341a);
                            tj3Var2.m22131l0(objM22097O);
                        } else {
                            objM22097O = new C0100h(f32VarM21341a);
                            tj3Var2.m22131l0(objM22097O);
                        }
                        C0100h c0100h9 = (C0100h) objM22097O;
                        if (i7 != 0) {
                            z2 = true;
                        }
                        e16Var4 = e16Var3;
                        x63Var3 = c0100h9;
                        i9 = i4 & (-238551041);
                        c0077cM24823b = y07.m24823b(tj3Var2);
                    }
                    t17 t17Var7 = x17Var;
                    InterfaceC3735wu interfaceC3735wu8 = interfaceC3735wu2;
                    InterfaceC3457pe interfaceC3457pe8 = interfaceC3457pe2;
                    boolean z9 = z2;
                    C0127b c0127b7 = c0127bM17056a;
                    tj3Var2.m22140r();
                    tj3Var = tj3Var2;
                    AbstractC0126a.m972a(e16Var4, c0127b7, t17Var7, true, x63Var3, z9, c0077cM24823b, interfaceC3457pe8, interfaceC3735wu8, null, null, vi3Var, tj3Var, (i9 & 14) | 24576 | (i9 & 112) | (i9 & 896) | (i9 & 7168) | ((i9 >> 3) & 3670016) | ((i9 << 12) & 1879048192), ((i9 >> 12) & 14) | ((i9 >> 18) & 7168), 6400);
                    e16Var2 = e16Var4;
                    c0127b2 = c0127b7;
                    t17Var2 = t17Var7;
                    x63Var2 = x63Var3;
                    z4 = z9;
                    c0077c2 = c0077cM24823b;
                    interfaceC3457pe3 = interfaceC3457pe8;
                    interfaceC3735wu3 = interfaceC3735wu8;
                } else {
                    tj3Var = tj3Var2;
                    tj3Var.m22102U();
                    e16Var2 = e16Var;
                    c0077c2 = c0077c;
                    c0127b2 = c0127bM17056a;
                    t17Var2 = x17Var;
                    interfaceC3735wu3 = interfaceC3735wu2;
                    interfaceC3457pe3 = interfaceC3457pe2;
                    z4 = z2;
                    x63Var2 = x63Var;
                }
                x18VarM22143u = tj3Var.m22143u();
                if (x18VarM22143u != null) {
                    x18VarM22143u.f67642d = new yj0(e16Var2, c0127b2, t17Var2, interfaceC3735wu3, interfaceC3457pe3, x63Var2, z4, c0077c2, vi3Var, i, i2, 1);
                }
            }
            i4 |= 12582912;
            z2 = z;
            if ((100663296 & i) == 0) {
                i4 |= 33554432;
            }
            if ((805306368 & i) != 0) {
                if (tj3Var2.m22124i(vi3Var)) {
                    i10 = 536870912;
                } else {
                    i10 = 268435456;
                }
                i4 |= i10;
            }
            if ((306783379 & i4) != 306783378) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (tj3Var2.m22099R(i4 & 1, z3)) {
                tj3Var2.m22104W();
                if ((i & 1) != 0) {
                    if (i11 != 0) {
                        e16Var3 = b16.f7762a;
                    } else {
                        e16Var3 = e16Var;
                    }
                    if ((i2 & 2) != 0) {
                        i4 &= -113;
                        c0127bM17056a = mv4.m17056a(0, tj3Var2, 3);
                    }
                    if (i13 != 0) {
                        x17Var = new x17(0.0f, 0.0f, 0.0f, 0.0f);
                    }
                    if ((i2 & 16) != 0) {
                        i4 &= -57345;
                        interfaceC3735wu2 = eh0.f37238d;
                    }
                    if (i5 != 0) {
                        interfaceC3457pe2 = nj0.f52791J;
                    }
                    f32VarM21341a = sf9.m21341a(tj3Var2);
                    zM22120g = tj3Var2.m22120g(f32VarM21341a);
                    objM22097O = tj3Var2.m22097O();
                    if (zM22120g) {
                        objM22097O = new C0100h(f32VarM21341a);
                        tj3Var2.m22131l0(objM22097O);
                    } else {
                        objM22097O = new C0100h(f32VarM21341a);
                        tj3Var2.m22131l0(objM22097O);
                    }
                    C0100h c0100h10 = (C0100h) objM22097O;
                    if (i7 != 0) {
                        z2 = true;
                    }
                    e16Var4 = e16Var3;
                    x63Var3 = c0100h10;
                    i9 = i4 & (-238551041);
                    c0077cM24823b = y07.m24823b(tj3Var2);
                } else {
                    if (i11 != 0) {
                        e16Var3 = b16.f7762a;
                    } else {
                        e16Var3 = e16Var;
                    }
                    if ((i2 & 2) != 0) {
                        i4 &= -113;
                        c0127bM17056a = mv4.m17056a(0, tj3Var2, 3);
                    }
                    if (i13 != 0) {
                        x17Var = new x17(0.0f, 0.0f, 0.0f, 0.0f);
                    }
                    if ((i2 & 16) != 0) {
                        i4 &= -57345;
                        interfaceC3735wu2 = eh0.f37238d;
                    }
                    if (i5 != 0) {
                        interfaceC3457pe2 = nj0.f52791J;
                    }
                    f32VarM21341a = sf9.m21341a(tj3Var2);
                    zM22120g = tj3Var2.m22120g(f32VarM21341a);
                    objM22097O = tj3Var2.m22097O();
                    if (zM22120g) {
                        objM22097O = new C0100h(f32VarM21341a);
                        tj3Var2.m22131l0(objM22097O);
                    } else {
                        objM22097O = new C0100h(f32VarM21341a);
                        tj3Var2.m22131l0(objM22097O);
                    }
                    C0100h c0100h11 = (C0100h) objM22097O;
                    if (i7 != 0) {
                        z2 = true;
                    }
                    e16Var4 = e16Var3;
                    x63Var3 = c0100h11;
                    i9 = i4 & (-238551041);
                    c0077cM24823b = y07.m24823b(tj3Var2);
                }
                t17 t17Var8 = x17Var;
                InterfaceC3735wu interfaceC3735wu9 = interfaceC3735wu2;
                InterfaceC3457pe interfaceC3457pe9 = interfaceC3457pe2;
                boolean z10 = z2;
                C0127b c0127b8 = c0127bM17056a;
                tj3Var2.m22140r();
                tj3Var = tj3Var2;
                AbstractC0126a.m972a(e16Var4, c0127b8, t17Var8, true, x63Var3, z10, c0077cM24823b, interfaceC3457pe9, interfaceC3735wu9, null, null, vi3Var, tj3Var, (i9 & 14) | 24576 | (i9 & 112) | (i9 & 896) | (i9 & 7168) | ((i9 >> 3) & 3670016) | ((i9 << 12) & 1879048192), ((i9 >> 12) & 14) | ((i9 >> 18) & 7168), 6400);
                e16Var2 = e16Var4;
                c0127b2 = c0127b8;
                t17Var2 = t17Var8;
                x63Var2 = x63Var3;
                z4 = z10;
                c0077c2 = c0077cM24823b;
                interfaceC3457pe3 = interfaceC3457pe9;
                interfaceC3735wu3 = interfaceC3735wu9;
            } else {
                tj3Var = tj3Var2;
                tj3Var.m22102U();
                e16Var2 = e16Var;
                c0077c2 = c0077c;
                c0127b2 = c0127bM17056a;
                t17Var2 = x17Var;
                interfaceC3735wu3 = interfaceC3735wu2;
                interfaceC3457pe3 = interfaceC3457pe2;
                z4 = z2;
                x63Var2 = x63Var;
            }
            x18VarM22143u = tj3Var.m22143u();
            if (x18VarM22143u != null) {
                x18VarM22143u.f67642d = new yj0(e16Var2, c0127b2, t17Var2, interfaceC3735wu3, interfaceC3457pe3, x63Var2, z4, c0077c2, vi3Var, i, i2, 1);
            }
        }
        i4 |= 196608;
        interfaceC3457pe2 = interfaceC3457pe;
        if ((1572864 & i) == 0) {
            i4 |= 524288;
        }
        i7 = i2 & 128;
        if (i7 != 0) {
            if ((12582912 & i) == 0) {
                z2 = z;
                if (tj3Var2.m22122h(z2)) {
                    i8 = 8388608;
                } else {
                    i8 = 4194304;
                }
                i4 |= i8;
            }
            if ((100663296 & i) == 0) {
                i4 |= 33554432;
            }
            if ((805306368 & i) != 0) {
                if (tj3Var2.m22124i(vi3Var)) {
                    i10 = 536870912;
                } else {
                    i10 = 268435456;
                }
                i4 |= i10;
            }
            if ((306783379 & i4) != 306783378) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (tj3Var2.m22099R(i4 & 1, z3)) {
                tj3Var2.m22104W();
                if ((i & 1) != 0) {
                    if (i11 != 0) {
                        e16Var3 = b16.f7762a;
                    } else {
                        e16Var3 = e16Var;
                    }
                    if ((i2 & 2) != 0) {
                        i4 &= -113;
                        c0127bM17056a = mv4.m17056a(0, tj3Var2, 3);
                    }
                    if (i13 != 0) {
                        x17Var = new x17(0.0f, 0.0f, 0.0f, 0.0f);
                    }
                    if ((i2 & 16) != 0) {
                        i4 &= -57345;
                        interfaceC3735wu2 = eh0.f37238d;
                    }
                    if (i5 != 0) {
                        interfaceC3457pe2 = nj0.f52791J;
                    }
                    f32VarM21341a = sf9.m21341a(tj3Var2);
                    zM22120g = tj3Var2.m22120g(f32VarM21341a);
                    objM22097O = tj3Var2.m22097O();
                    if (zM22120g) {
                        objM22097O = new C0100h(f32VarM21341a);
                        tj3Var2.m22131l0(objM22097O);
                    } else {
                        objM22097O = new C0100h(f32VarM21341a);
                        tj3Var2.m22131l0(objM22097O);
                    }
                    C0100h c0100h12 = (C0100h) objM22097O;
                    if (i7 != 0) {
                        z2 = true;
                    }
                    e16Var4 = e16Var3;
                    x63Var3 = c0100h12;
                    i9 = i4 & (-238551041);
                    c0077cM24823b = y07.m24823b(tj3Var2);
                } else {
                    if (i11 != 0) {
                        e16Var3 = b16.f7762a;
                    } else {
                        e16Var3 = e16Var;
                    }
                    if ((i2 & 2) != 0) {
                        i4 &= -113;
                        c0127bM17056a = mv4.m17056a(0, tj3Var2, 3);
                    }
                    if (i13 != 0) {
                        x17Var = new x17(0.0f, 0.0f, 0.0f, 0.0f);
                    }
                    if ((i2 & 16) != 0) {
                        i4 &= -57345;
                        interfaceC3735wu2 = eh0.f37238d;
                    }
                    if (i5 != 0) {
                        interfaceC3457pe2 = nj0.f52791J;
                    }
                    f32VarM21341a = sf9.m21341a(tj3Var2);
                    zM22120g = tj3Var2.m22120g(f32VarM21341a);
                    objM22097O = tj3Var2.m22097O();
                    if (zM22120g) {
                        objM22097O = new C0100h(f32VarM21341a);
                        tj3Var2.m22131l0(objM22097O);
                    } else {
                        objM22097O = new C0100h(f32VarM21341a);
                        tj3Var2.m22131l0(objM22097O);
                    }
                    C0100h c0100h13 = (C0100h) objM22097O;
                    if (i7 != 0) {
                        z2 = true;
                    }
                    e16Var4 = e16Var3;
                    x63Var3 = c0100h13;
                    i9 = i4 & (-238551041);
                    c0077cM24823b = y07.m24823b(tj3Var2);
                }
                t17 t17Var9 = x17Var;
                InterfaceC3735wu interfaceC3735wu10 = interfaceC3735wu2;
                InterfaceC3457pe interfaceC3457pe10 = interfaceC3457pe2;
                boolean z11 = z2;
                C0127b c0127b9 = c0127bM17056a;
                tj3Var2.m22140r();
                tj3Var = tj3Var2;
                AbstractC0126a.m972a(e16Var4, c0127b9, t17Var9, true, x63Var3, z11, c0077cM24823b, interfaceC3457pe10, interfaceC3735wu10, null, null, vi3Var, tj3Var, (i9 & 14) | 24576 | (i9 & 112) | (i9 & 896) | (i9 & 7168) | ((i9 >> 3) & 3670016) | ((i9 << 12) & 1879048192), ((i9 >> 12) & 14) | ((i9 >> 18) & 7168), 6400);
                e16Var2 = e16Var4;
                c0127b2 = c0127b9;
                t17Var2 = t17Var9;
                x63Var2 = x63Var3;
                z4 = z11;
                c0077c2 = c0077cM24823b;
                interfaceC3457pe3 = interfaceC3457pe10;
                interfaceC3735wu3 = interfaceC3735wu10;
            } else {
                tj3Var = tj3Var2;
                tj3Var.m22102U();
                e16Var2 = e16Var;
                c0077c2 = c0077c;
                c0127b2 = c0127bM17056a;
                t17Var2 = x17Var;
                interfaceC3735wu3 = interfaceC3735wu2;
                interfaceC3457pe3 = interfaceC3457pe2;
                z4 = z2;
                x63Var2 = x63Var;
            }
            x18VarM22143u = tj3Var.m22143u();
            if (x18VarM22143u != null) {
                x18VarM22143u.f67642d = new yj0(e16Var2, c0127b2, t17Var2, interfaceC3735wu3, interfaceC3457pe3, x63Var2, z4, c0077c2, vi3Var, i, i2, 1);
            }
        }
        i4 |= 12582912;
        z2 = z;
        if ((100663296 & i) == 0) {
            i4 |= 33554432;
        }
        if ((805306368 & i) != 0) {
            if (tj3Var2.m22124i(vi3Var)) {
                i10 = 536870912;
            } else {
                i10 = 268435456;
            }
            i4 |= i10;
        }
        if ((306783379 & i4) != 306783378) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (tj3Var2.m22099R(i4 & 1, z3)) {
            tj3Var2.m22104W();
            if ((i & 1) != 0) {
                if (i11 != 0) {
                    e16Var3 = b16.f7762a;
                } else {
                    e16Var3 = e16Var;
                }
                if ((i2 & 2) != 0) {
                    i4 &= -113;
                    c0127bM17056a = mv4.m17056a(0, tj3Var2, 3);
                }
                if (i13 != 0) {
                    x17Var = new x17(0.0f, 0.0f, 0.0f, 0.0f);
                }
                if ((i2 & 16) != 0) {
                    i4 &= -57345;
                    interfaceC3735wu2 = eh0.f37238d;
                }
                if (i5 != 0) {
                    interfaceC3457pe2 = nj0.f52791J;
                }
                f32VarM21341a = sf9.m21341a(tj3Var2);
                zM22120g = tj3Var2.m22120g(f32VarM21341a);
                objM22097O = tj3Var2.m22097O();
                if (zM22120g) {
                    objM22097O = new C0100h(f32VarM21341a);
                    tj3Var2.m22131l0(objM22097O);
                } else {
                    objM22097O = new C0100h(f32VarM21341a);
                    tj3Var2.m22131l0(objM22097O);
                }
                C0100h c0100h14 = (C0100h) objM22097O;
                if (i7 != 0) {
                    z2 = true;
                }
                e16Var4 = e16Var3;
                x63Var3 = c0100h14;
                i9 = i4 & (-238551041);
                c0077cM24823b = y07.m24823b(tj3Var2);
            } else {
                if (i11 != 0) {
                    e16Var3 = b16.f7762a;
                } else {
                    e16Var3 = e16Var;
                }
                if ((i2 & 2) != 0) {
                    i4 &= -113;
                    c0127bM17056a = mv4.m17056a(0, tj3Var2, 3);
                }
                if (i13 != 0) {
                    x17Var = new x17(0.0f, 0.0f, 0.0f, 0.0f);
                }
                if ((i2 & 16) != 0) {
                    i4 &= -57345;
                    interfaceC3735wu2 = eh0.f37238d;
                }
                if (i5 != 0) {
                    interfaceC3457pe2 = nj0.f52791J;
                }
                f32VarM21341a = sf9.m21341a(tj3Var2);
                zM22120g = tj3Var2.m22120g(f32VarM21341a);
                objM22097O = tj3Var2.m22097O();
                if (zM22120g) {
                    objM22097O = new C0100h(f32VarM21341a);
                    tj3Var2.m22131l0(objM22097O);
                } else {
                    objM22097O = new C0100h(f32VarM21341a);
                    tj3Var2.m22131l0(objM22097O);
                }
                C0100h c0100h15 = (C0100h) objM22097O;
                if (i7 != 0) {
                    z2 = true;
                }
                e16Var4 = e16Var3;
                x63Var3 = c0100h15;
                i9 = i4 & (-238551041);
                c0077cM24823b = y07.m24823b(tj3Var2);
            }
            t17 t17Var10 = x17Var;
            InterfaceC3735wu interfaceC3735wu11 = interfaceC3735wu2;
            InterfaceC3457pe interfaceC3457pe11 = interfaceC3457pe2;
            boolean z12 = z2;
            C0127b c0127b10 = c0127bM17056a;
            tj3Var2.m22140r();
            tj3Var = tj3Var2;
            AbstractC0126a.m972a(e16Var4, c0127b10, t17Var10, true, x63Var3, z12, c0077cM24823b, interfaceC3457pe11, interfaceC3735wu11, null, null, vi3Var, tj3Var, (i9 & 14) | 24576 | (i9 & 112) | (i9 & 896) | (i9 & 7168) | ((i9 >> 3) & 3670016) | ((i9 << 12) & 1879048192), ((i9 >> 12) & 14) | ((i9 >> 18) & 7168), 6400);
            e16Var2 = e16Var4;
            c0127b2 = c0127b10;
            t17Var2 = t17Var10;
            x63Var2 = x63Var3;
            z4 = z12;
            c0077c2 = c0077cM24823b;
            interfaceC3457pe3 = interfaceC3457pe11;
            interfaceC3735wu3 = interfaceC3735wu11;
        } else {
            tj3Var = tj3Var2;
            tj3Var.m22102U();
            e16Var2 = e16Var;
            c0077c2 = c0077c;
            c0127b2 = c0127bM17056a;
            t17Var2 = x17Var;
            interfaceC3735wu3 = interfaceC3735wu2;
            interfaceC3457pe3 = interfaceC3457pe2;
            z4 = z2;
            x63Var2 = x63Var;
        }
        x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new yj0(e16Var2, c0127b2, t17Var2, interfaceC3735wu3, interfaceC3457pe3, x63Var2, z4, c0077c2, vi3Var, i, i2, 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0042  */
    /* JADX WARN: Code duplicated, block: B:23:0x0047  */
    /* JADX WARN: Code duplicated, block: B:25:0x004f  */
    /* JADX WARN: Code duplicated, block: B:26:0x0052  */
    /* JADX WARN: Code duplicated, block: B:30:0x005b  */
    /* JADX WARN: Code duplicated, block: B:32:0x0063  */
    /* JADX WARN: Code duplicated, block: B:33:0x0066  */
    /* JADX WARN: Code duplicated, block: B:37:0x0071  */
    /* JADX WARN: Code duplicated, block: B:39:0x0075  */
    /* JADX WARN: Code duplicated, block: B:41:0x0079  */
    /* JADX WARN: Code duplicated, block: B:43:0x0081  */
    /* JADX WARN: Code duplicated, block: B:44:0x0084  */
    /* JADX WARN: Code duplicated, block: B:48:0x0092  */
    /* JADX WARN: Code duplicated, block: B:50:0x0098  */
    /* JADX WARN: Code duplicated, block: B:51:0x009b  */
    /* JADX WARN: Code duplicated, block: B:55:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:56:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:59:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:61:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:72:0x00e6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:73:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:74:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:77:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:78:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:80:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:83:0x0106  */
    /* JADX WARN: Code duplicated, block: B:85:0x010c  */
    /* JADX WARN: Code duplicated, block: B:88:0x011d  */
    /* JADX WARN: Code duplicated, block: B:90:0x0121  */
    /* JADX WARN: Code duplicated, block: B:93:0x0170  */
    /* JADX WARN: Code duplicated, block: B:96:0x0187  */
    /* JADX WARN: Code duplicated, block: B:98:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: d */
    public static final void m11643d(e16 e16Var, C0127b c0127b, t17 t17Var, InterfaceC3624tu interfaceC3624tu, fc0 fc0Var, x63 x63Var, boolean z, C0077c c0077c, vi3 vi3Var, ye1 ye1Var, int i, int i2) {
        e16 e16Var2;
        int i3;
        C0127b c0127b2;
        int i4;
        int i5;
        t17 x17Var;
        int i6;
        int i7;
        InterfaceC3624tu interfaceC3624tu2;
        int i8;
        int i9;
        fc0 fc0Var2;
        int i10;
        int i11;
        boolean z2;
        x63 x63Var2;
        boolean z3;
        C0077c c0077c2;
        e16 e16Var3;
        C0127b c0127b3;
        t17 t17Var2;
        InterfaceC3624tu interfaceC3624tu3;
        fc0 fc0Var3;
        x18 x18VarM22143u;
        e16 e16Var4;
        C0127b c0127bM17056a;
        f32 f32VarM21341a;
        boolean zM22120g;
        Object objM22097O;
        InterfaceC3624tu interfaceC3624tu4;
        C0077c c0077cM24823b;
        x63 x63Var3;
        int i12;
        t17 t17Var3;
        boolean z4;
        int i13;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-1884325601);
        int i14 = i2 & 1;
        if (i14 != 0) {
            i3 = i | 6;
            e16Var2 = e16Var;
        } else if ((i & 6) == 0) {
            e16Var2 = e16Var;
            i3 = i | (tj3Var.m22120g(e16Var2) ? 4 : 2);
        } else {
            e16Var2 = e16Var;
            i3 = i;
        }
        if ((i2 & 2) == 0) {
            c0127b2 = c0127b;
            int i15 = tj3Var.m22120g(c0127b2) ? 32 : 16;
            i4 = i3 | i15;
            i5 = i2 & 4;
            if (i5 != 0) {
                i7 = i4 | 384;
                x17Var = t17Var;
            } else {
                x17Var = t17Var;
                if (tj3Var.m22120g(x17Var)) {
                    i6 = 256;
                } else {
                    i6 = 128;
                }
                i7 = i4 | i6;
            }
            int i16 = i7 | 3072;
            if ((i2 & 16) == 0) {
                interfaceC3624tu2 = interfaceC3624tu;
                int i17 = tj3Var.m22120g(interfaceC3624tu2) ? 16384 : 8192;
                i8 = i16 | i17;
                i9 = i2 & 32;
                if (i9 != 0) {
                    if ((i & 196608) == 0) {
                        fc0Var2 = fc0Var;
                        if (tj3Var.m22120g(fc0Var2)) {
                            i10 = 131072;
                        } else {
                            i10 = 65536;
                        }
                        i8 |= i10;
                    }
                    i11 = i8 | 46661632;
                    if ((i & 805306368) == 0) {
                        if (tj3Var.m22124i(vi3Var)) {
                            i13 = 536870912;
                        } else {
                            i13 = 268435456;
                        }
                        i11 |= i13;
                    }
                    if ((306783379 & i11) != 306783378) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (tj3Var.m22099R(i11 & 1, z2)) {
                        tj3Var.m22104W();
                        if ((i & 1) != 0 || tj3Var.m22084B()) {
                            if (i14 != 0) {
                                e16Var4 = b16.f7762a;
                            } else {
                                e16Var4 = e16Var2;
                            }
                            if ((i2 & 2) != 0) {
                                c0127bM17056a = mv4.m17056a(0, tj3Var, 3);
                                i11 &= -113;
                            } else {
                                c0127bM17056a = c0127b2;
                            }
                            if (i5 != 0) {
                                x17Var = new x17(0.0f, 0.0f, 0.0f, 0.0f);
                            }
                            if ((i2 & 16) != 0) {
                                i11 &= -57345;
                                interfaceC3624tu2 = eh0.f37236b;
                            }
                            if (i9 != 0) {
                                fc0Var2 = nj0.f52817l;
                            }
                            f32VarM21341a = sf9.m21341a(tj3Var);
                            zM22120g = tj3Var.m22120g(f32VarM21341a);
                            objM22097O = tj3Var.m22097O();
                            if (zM22120g || objM22097O == we1.f66679a) {
                                objM22097O = new C0100h(f32VarM21341a);
                                tj3Var.m22131l0(objM22097O);
                            }
                            interfaceC3624tu4 = interfaceC3624tu2;
                            c0077cM24823b = y07.m24823b(tj3Var);
                            x63Var3 = (C0100h) objM22097O;
                            i12 = i11 & (-238551041);
                            t17Var3 = x17Var;
                            z4 = true;
                        } else {
                            tj3Var.m22102U();
                            if ((i2 & 2) != 0) {
                                i11 &= -113;
                            }
                            if ((i2 & 16) != 0) {
                                i11 &= -57345;
                            }
                            int i18 = i11 & (-238551041);
                            C0127b c0127b4 = c0127b2;
                            i12 = i18;
                            e16Var4 = e16Var2;
                            c0127bM17056a = c0127b4;
                            x63Var3 = x63Var;
                            t17Var3 = x17Var;
                            interfaceC3624tu4 = interfaceC3624tu2;
                            z4 = z;
                            c0077cM24823b = c0077c;
                        }
                        fc0 fc0Var4 = fc0Var2;
                        tj3Var.m22140r();
                        AbstractC0126a.m972a(e16Var4, c0127bM17056a, t17Var3, false, x63Var3, z4, c0077cM24823b, null, null, fc0Var4, interfaceC3624tu4, vi3Var, tj3Var, (i12 & 14) | 24576 | (i12 & 112) | (i12 & 896) | 1575936, ((i12 >> 12) & 112) | ((i12 >> 6) & 896) | ((i12 >> 18) & 7168), 1792);
                        e16Var3 = e16Var4;
                        c0127b3 = c0127bM17056a;
                        t17Var2 = t17Var3;
                        x63Var2 = x63Var3;
                        z3 = z4;
                        c0077c2 = c0077cM24823b;
                        fc0Var3 = fc0Var4;
                        interfaceC3624tu3 = interfaceC3624tu4;
                    } else {
                        tj3Var.m22102U();
                        x63Var2 = x63Var;
                        z3 = z;
                        c0077c2 = c0077c;
                        e16Var3 = e16Var2;
                        c0127b3 = c0127b2;
                        t17Var2 = x17Var;
                        interfaceC3624tu3 = interfaceC3624tu2;
                        fc0Var3 = fc0Var2;
                    }
                    x18VarM22143u = tj3Var.m22143u();
                    if (x18VarM22143u != null) {
                        x18VarM22143u.f67642d = new yj0(e16Var3, c0127b3, t17Var2, interfaceC3624tu3, fc0Var3, x63Var2, z3, c0077c2, vi3Var, i, i2, 2);
                    }
                }
                i8 |= 196608;
                fc0Var2 = fc0Var;
                i11 = i8 | 46661632;
                if ((i & 805306368) == 0) {
                    if (tj3Var.m22124i(vi3Var)) {
                        i13 = 536870912;
                    } else {
                        i13 = 268435456;
                    }
                    i11 |= i13;
                }
                if ((306783379 & i11) != 306783378) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (tj3Var.m22099R(i11 & 1, z2)) {
                    tj3Var.m22104W();
                    if ((i & 1) != 0) {
                        if (i14 != 0) {
                            e16Var4 = b16.f7762a;
                        } else {
                            e16Var4 = e16Var2;
                        }
                        if ((i2 & 2) != 0) {
                            c0127bM17056a = mv4.m17056a(0, tj3Var, 3);
                            i11 &= -113;
                        } else {
                            c0127bM17056a = c0127b2;
                        }
                        if (i5 != 0) {
                            x17Var = new x17(0.0f, 0.0f, 0.0f, 0.0f);
                        }
                        if ((i2 & 16) != 0) {
                            i11 &= -57345;
                            interfaceC3624tu2 = eh0.f37236b;
                        }
                        if (i9 != 0) {
                            fc0Var2 = nj0.f52817l;
                        }
                        f32VarM21341a = sf9.m21341a(tj3Var);
                        zM22120g = tj3Var.m22120g(f32VarM21341a);
                        objM22097O = tj3Var.m22097O();
                        if (zM22120g) {
                            objM22097O = new C0100h(f32VarM21341a);
                            tj3Var.m22131l0(objM22097O);
                        } else {
                            objM22097O = new C0100h(f32VarM21341a);
                            tj3Var.m22131l0(objM22097O);
                        }
                        interfaceC3624tu4 = interfaceC3624tu2;
                        c0077cM24823b = y07.m24823b(tj3Var);
                        x63Var3 = (C0100h) objM22097O;
                        i12 = i11 & (-238551041);
                        t17Var3 = x17Var;
                        z4 = true;
                    } else {
                        if (i14 != 0) {
                            e16Var4 = b16.f7762a;
                        } else {
                            e16Var4 = e16Var2;
                        }
                        if ((i2 & 2) != 0) {
                            c0127bM17056a = mv4.m17056a(0, tj3Var, 3);
                            i11 &= -113;
                        } else {
                            c0127bM17056a = c0127b2;
                        }
                        if (i5 != 0) {
                            x17Var = new x17(0.0f, 0.0f, 0.0f, 0.0f);
                        }
                        if ((i2 & 16) != 0) {
                            i11 &= -57345;
                            interfaceC3624tu2 = eh0.f37236b;
                        }
                        if (i9 != 0) {
                            fc0Var2 = nj0.f52817l;
                        }
                        f32VarM21341a = sf9.m21341a(tj3Var);
                        zM22120g = tj3Var.m22120g(f32VarM21341a);
                        objM22097O = tj3Var.m22097O();
                        if (zM22120g) {
                            objM22097O = new C0100h(f32VarM21341a);
                            tj3Var.m22131l0(objM22097O);
                        } else {
                            objM22097O = new C0100h(f32VarM21341a);
                            tj3Var.m22131l0(objM22097O);
                        }
                        interfaceC3624tu4 = interfaceC3624tu2;
                        c0077cM24823b = y07.m24823b(tj3Var);
                        x63Var3 = (C0100h) objM22097O;
                        i12 = i11 & (-238551041);
                        t17Var3 = x17Var;
                        z4 = true;
                    }
                    fc0 fc0Var5 = fc0Var2;
                    tj3Var.m22140r();
                    AbstractC0126a.m972a(e16Var4, c0127bM17056a, t17Var3, false, x63Var3, z4, c0077cM24823b, null, null, fc0Var5, interfaceC3624tu4, vi3Var, tj3Var, (i12 & 14) | 24576 | (i12 & 112) | (i12 & 896) | 1575936, ((i12 >> 12) & 112) | ((i12 >> 6) & 896) | ((i12 >> 18) & 7168), 1792);
                    e16Var3 = e16Var4;
                    c0127b3 = c0127bM17056a;
                    t17Var2 = t17Var3;
                    x63Var2 = x63Var3;
                    z3 = z4;
                    c0077c2 = c0077cM24823b;
                    fc0Var3 = fc0Var5;
                    interfaceC3624tu3 = interfaceC3624tu4;
                } else {
                    tj3Var.m22102U();
                    x63Var2 = x63Var;
                    z3 = z;
                    c0077c2 = c0077c;
                    e16Var3 = e16Var2;
                    c0127b3 = c0127b2;
                    t17Var2 = x17Var;
                    interfaceC3624tu3 = interfaceC3624tu2;
                    fc0Var3 = fc0Var2;
                }
                x18VarM22143u = tj3Var.m22143u();
                if (x18VarM22143u != null) {
                    x18VarM22143u.f67642d = new yj0(e16Var3, c0127b3, t17Var2, interfaceC3624tu3, fc0Var3, x63Var2, z3, c0077c2, vi3Var, i, i2, 2);
                }
            }
            interfaceC3624tu2 = interfaceC3624tu;
            i8 = i16 | i17;
            i9 = i2 & 32;
            if (i9 != 0) {
                if ((i & 196608) == 0) {
                    fc0Var2 = fc0Var;
                    if (tj3Var.m22120g(fc0Var2)) {
                        i10 = 131072;
                    } else {
                        i10 = 65536;
                    }
                    i8 |= i10;
                }
                i11 = i8 | 46661632;
                if ((i & 805306368) == 0) {
                    if (tj3Var.m22124i(vi3Var)) {
                        i13 = 536870912;
                    } else {
                        i13 = 268435456;
                    }
                    i11 |= i13;
                }
                if ((306783379 & i11) != 306783378) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (tj3Var.m22099R(i11 & 1, z2)) {
                    tj3Var.m22104W();
                    if ((i & 1) != 0) {
                        if (i14 != 0) {
                            e16Var4 = b16.f7762a;
                        } else {
                            e16Var4 = e16Var2;
                        }
                        if ((i2 & 2) != 0) {
                            c0127bM17056a = mv4.m17056a(0, tj3Var, 3);
                            i11 &= -113;
                        } else {
                            c0127bM17056a = c0127b2;
                        }
                        if (i5 != 0) {
                            x17Var = new x17(0.0f, 0.0f, 0.0f, 0.0f);
                        }
                        if ((i2 & 16) != 0) {
                            i11 &= -57345;
                            interfaceC3624tu2 = eh0.f37236b;
                        }
                        if (i9 != 0) {
                            fc0Var2 = nj0.f52817l;
                        }
                        f32VarM21341a = sf9.m21341a(tj3Var);
                        zM22120g = tj3Var.m22120g(f32VarM21341a);
                        objM22097O = tj3Var.m22097O();
                        if (zM22120g) {
                            objM22097O = new C0100h(f32VarM21341a);
                            tj3Var.m22131l0(objM22097O);
                        } else {
                            objM22097O = new C0100h(f32VarM21341a);
                            tj3Var.m22131l0(objM22097O);
                        }
                        interfaceC3624tu4 = interfaceC3624tu2;
                        c0077cM24823b = y07.m24823b(tj3Var);
                        x63Var3 = (C0100h) objM22097O;
                        i12 = i11 & (-238551041);
                        t17Var3 = x17Var;
                        z4 = true;
                    } else {
                        if (i14 != 0) {
                            e16Var4 = b16.f7762a;
                        } else {
                            e16Var4 = e16Var2;
                        }
                        if ((i2 & 2) != 0) {
                            c0127bM17056a = mv4.m17056a(0, tj3Var, 3);
                            i11 &= -113;
                        } else {
                            c0127bM17056a = c0127b2;
                        }
                        if (i5 != 0) {
                            x17Var = new x17(0.0f, 0.0f, 0.0f, 0.0f);
                        }
                        if ((i2 & 16) != 0) {
                            i11 &= -57345;
                            interfaceC3624tu2 = eh0.f37236b;
                        }
                        if (i9 != 0) {
                            fc0Var2 = nj0.f52817l;
                        }
                        f32VarM21341a = sf9.m21341a(tj3Var);
                        zM22120g = tj3Var.m22120g(f32VarM21341a);
                        objM22097O = tj3Var.m22097O();
                        if (zM22120g) {
                            objM22097O = new C0100h(f32VarM21341a);
                            tj3Var.m22131l0(objM22097O);
                        } else {
                            objM22097O = new C0100h(f32VarM21341a);
                            tj3Var.m22131l0(objM22097O);
                        }
                        interfaceC3624tu4 = interfaceC3624tu2;
                        c0077cM24823b = y07.m24823b(tj3Var);
                        x63Var3 = (C0100h) objM22097O;
                        i12 = i11 & (-238551041);
                        t17Var3 = x17Var;
                        z4 = true;
                    }
                    fc0 fc0Var6 = fc0Var2;
                    tj3Var.m22140r();
                    AbstractC0126a.m972a(e16Var4, c0127bM17056a, t17Var3, false, x63Var3, z4, c0077cM24823b, null, null, fc0Var6, interfaceC3624tu4, vi3Var, tj3Var, (i12 & 14) | 24576 | (i12 & 112) | (i12 & 896) | 1575936, ((i12 >> 12) & 112) | ((i12 >> 6) & 896) | ((i12 >> 18) & 7168), 1792);
                    e16Var3 = e16Var4;
                    c0127b3 = c0127bM17056a;
                    t17Var2 = t17Var3;
                    x63Var2 = x63Var3;
                    z3 = z4;
                    c0077c2 = c0077cM24823b;
                    fc0Var3 = fc0Var6;
                    interfaceC3624tu3 = interfaceC3624tu4;
                } else {
                    tj3Var.m22102U();
                    x63Var2 = x63Var;
                    z3 = z;
                    c0077c2 = c0077c;
                    e16Var3 = e16Var2;
                    c0127b3 = c0127b2;
                    t17Var2 = x17Var;
                    interfaceC3624tu3 = interfaceC3624tu2;
                    fc0Var3 = fc0Var2;
                }
                x18VarM22143u = tj3Var.m22143u();
                if (x18VarM22143u != null) {
                    x18VarM22143u.f67642d = new yj0(e16Var3, c0127b3, t17Var2, interfaceC3624tu3, fc0Var3, x63Var2, z3, c0077c2, vi3Var, i, i2, 2);
                }
            }
            i8 |= 196608;
            fc0Var2 = fc0Var;
            i11 = i8 | 46661632;
            if ((i & 805306368) == 0) {
                if (tj3Var.m22124i(vi3Var)) {
                    i13 = 536870912;
                } else {
                    i13 = 268435456;
                }
                i11 |= i13;
            }
            if ((306783379 & i11) != 306783378) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (tj3Var.m22099R(i11 & 1, z2)) {
                tj3Var.m22104W();
                if ((i & 1) != 0) {
                    if (i14 != 0) {
                        e16Var4 = b16.f7762a;
                    } else {
                        e16Var4 = e16Var2;
                    }
                    if ((i2 & 2) != 0) {
                        c0127bM17056a = mv4.m17056a(0, tj3Var, 3);
                        i11 &= -113;
                    } else {
                        c0127bM17056a = c0127b2;
                    }
                    if (i5 != 0) {
                        x17Var = new x17(0.0f, 0.0f, 0.0f, 0.0f);
                    }
                    if ((i2 & 16) != 0) {
                        i11 &= -57345;
                        interfaceC3624tu2 = eh0.f37236b;
                    }
                    if (i9 != 0) {
                        fc0Var2 = nj0.f52817l;
                    }
                    f32VarM21341a = sf9.m21341a(tj3Var);
                    zM22120g = tj3Var.m22120g(f32VarM21341a);
                    objM22097O = tj3Var.m22097O();
                    if (zM22120g) {
                        objM22097O = new C0100h(f32VarM21341a);
                        tj3Var.m22131l0(objM22097O);
                    } else {
                        objM22097O = new C0100h(f32VarM21341a);
                        tj3Var.m22131l0(objM22097O);
                    }
                    interfaceC3624tu4 = interfaceC3624tu2;
                    c0077cM24823b = y07.m24823b(tj3Var);
                    x63Var3 = (C0100h) objM22097O;
                    i12 = i11 & (-238551041);
                    t17Var3 = x17Var;
                    z4 = true;
                } else {
                    if (i14 != 0) {
                        e16Var4 = b16.f7762a;
                    } else {
                        e16Var4 = e16Var2;
                    }
                    if ((i2 & 2) != 0) {
                        c0127bM17056a = mv4.m17056a(0, tj3Var, 3);
                        i11 &= -113;
                    } else {
                        c0127bM17056a = c0127b2;
                    }
                    if (i5 != 0) {
                        x17Var = new x17(0.0f, 0.0f, 0.0f, 0.0f);
                    }
                    if ((i2 & 16) != 0) {
                        i11 &= -57345;
                        interfaceC3624tu2 = eh0.f37236b;
                    }
                    if (i9 != 0) {
                        fc0Var2 = nj0.f52817l;
                    }
                    f32VarM21341a = sf9.m21341a(tj3Var);
                    zM22120g = tj3Var.m22120g(f32VarM21341a);
                    objM22097O = tj3Var.m22097O();
                    if (zM22120g) {
                        objM22097O = new C0100h(f32VarM21341a);
                        tj3Var.m22131l0(objM22097O);
                    } else {
                        objM22097O = new C0100h(f32VarM21341a);
                        tj3Var.m22131l0(objM22097O);
                    }
                    interfaceC3624tu4 = interfaceC3624tu2;
                    c0077cM24823b = y07.m24823b(tj3Var);
                    x63Var3 = (C0100h) objM22097O;
                    i12 = i11 & (-238551041);
                    t17Var3 = x17Var;
                    z4 = true;
                }
                fc0 fc0Var7 = fc0Var2;
                tj3Var.m22140r();
                AbstractC0126a.m972a(e16Var4, c0127bM17056a, t17Var3, false, x63Var3, z4, c0077cM24823b, null, null, fc0Var7, interfaceC3624tu4, vi3Var, tj3Var, (i12 & 14) | 24576 | (i12 & 112) | (i12 & 896) | 1575936, ((i12 >> 12) & 112) | ((i12 >> 6) & 896) | ((i12 >> 18) & 7168), 1792);
                e16Var3 = e16Var4;
                c0127b3 = c0127bM17056a;
                t17Var2 = t17Var3;
                x63Var2 = x63Var3;
                z3 = z4;
                c0077c2 = c0077cM24823b;
                fc0Var3 = fc0Var7;
                interfaceC3624tu3 = interfaceC3624tu4;
            } else {
                tj3Var.m22102U();
                x63Var2 = x63Var;
                z3 = z;
                c0077c2 = c0077c;
                e16Var3 = e16Var2;
                c0127b3 = c0127b2;
                t17Var2 = x17Var;
                interfaceC3624tu3 = interfaceC3624tu2;
                fc0Var3 = fc0Var2;
            }
            x18VarM22143u = tj3Var.m22143u();
            if (x18VarM22143u != null) {
                x18VarM22143u.f67642d = new yj0(e16Var3, c0127b3, t17Var2, interfaceC3624tu3, fc0Var3, x63Var2, z3, c0077c2, vi3Var, i, i2, 2);
            }
        }
        c0127b2 = c0127b;
        i4 = i3 | i15;
        i5 = i2 & 4;
        if (i5 != 0) {
            i7 = i4 | 384;
            x17Var = t17Var;
        } else {
            x17Var = t17Var;
            if (tj3Var.m22120g(x17Var)) {
                i6 = 256;
            } else {
                i6 = 128;
            }
            i7 = i4 | i6;
        }
        int i19 = i7 | 3072;
        if ((i2 & 16) == 0) {
            interfaceC3624tu2 = interfaceC3624tu;
            if (tj3Var.m22120g(interfaceC3624tu2)) {
            }
            i8 = i19 | i17;
            i9 = i2 & 32;
            if (i9 != 0) {
                if ((i & 196608) == 0) {
                    fc0Var2 = fc0Var;
                    if (tj3Var.m22120g(fc0Var2)) {
                        i10 = 131072;
                    } else {
                        i10 = 65536;
                    }
                    i8 |= i10;
                }
                i11 = i8 | 46661632;
                if ((i & 805306368) == 0) {
                    if (tj3Var.m22124i(vi3Var)) {
                        i13 = 536870912;
                    } else {
                        i13 = 268435456;
                    }
                    i11 |= i13;
                }
                if ((306783379 & i11) != 306783378) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (tj3Var.m22099R(i11 & 1, z2)) {
                    tj3Var.m22104W();
                    if ((i & 1) != 0) {
                        if (i14 != 0) {
                            e16Var4 = b16.f7762a;
                        } else {
                            e16Var4 = e16Var2;
                        }
                        if ((i2 & 2) != 0) {
                            c0127bM17056a = mv4.m17056a(0, tj3Var, 3);
                            i11 &= -113;
                        } else {
                            c0127bM17056a = c0127b2;
                        }
                        if (i5 != 0) {
                            x17Var = new x17(0.0f, 0.0f, 0.0f, 0.0f);
                        }
                        if ((i2 & 16) != 0) {
                            i11 &= -57345;
                            interfaceC3624tu2 = eh0.f37236b;
                        }
                        if (i9 != 0) {
                            fc0Var2 = nj0.f52817l;
                        }
                        f32VarM21341a = sf9.m21341a(tj3Var);
                        zM22120g = tj3Var.m22120g(f32VarM21341a);
                        objM22097O = tj3Var.m22097O();
                        if (zM22120g) {
                            objM22097O = new C0100h(f32VarM21341a);
                            tj3Var.m22131l0(objM22097O);
                        } else {
                            objM22097O = new C0100h(f32VarM21341a);
                            tj3Var.m22131l0(objM22097O);
                        }
                        interfaceC3624tu4 = interfaceC3624tu2;
                        c0077cM24823b = y07.m24823b(tj3Var);
                        x63Var3 = (C0100h) objM22097O;
                        i12 = i11 & (-238551041);
                        t17Var3 = x17Var;
                        z4 = true;
                    } else {
                        if (i14 != 0) {
                            e16Var4 = b16.f7762a;
                        } else {
                            e16Var4 = e16Var2;
                        }
                        if ((i2 & 2) != 0) {
                            c0127bM17056a = mv4.m17056a(0, tj3Var, 3);
                            i11 &= -113;
                        } else {
                            c0127bM17056a = c0127b2;
                        }
                        if (i5 != 0) {
                            x17Var = new x17(0.0f, 0.0f, 0.0f, 0.0f);
                        }
                        if ((i2 & 16) != 0) {
                            i11 &= -57345;
                            interfaceC3624tu2 = eh0.f37236b;
                        }
                        if (i9 != 0) {
                            fc0Var2 = nj0.f52817l;
                        }
                        f32VarM21341a = sf9.m21341a(tj3Var);
                        zM22120g = tj3Var.m22120g(f32VarM21341a);
                        objM22097O = tj3Var.m22097O();
                        if (zM22120g) {
                            objM22097O = new C0100h(f32VarM21341a);
                            tj3Var.m22131l0(objM22097O);
                        } else {
                            objM22097O = new C0100h(f32VarM21341a);
                            tj3Var.m22131l0(objM22097O);
                        }
                        interfaceC3624tu4 = interfaceC3624tu2;
                        c0077cM24823b = y07.m24823b(tj3Var);
                        x63Var3 = (C0100h) objM22097O;
                        i12 = i11 & (-238551041);
                        t17Var3 = x17Var;
                        z4 = true;
                    }
                    fc0 fc0Var8 = fc0Var2;
                    tj3Var.m22140r();
                    AbstractC0126a.m972a(e16Var4, c0127bM17056a, t17Var3, false, x63Var3, z4, c0077cM24823b, null, null, fc0Var8, interfaceC3624tu4, vi3Var, tj3Var, (i12 & 14) | 24576 | (i12 & 112) | (i12 & 896) | 1575936, ((i12 >> 12) & 112) | ((i12 >> 6) & 896) | ((i12 >> 18) & 7168), 1792);
                    e16Var3 = e16Var4;
                    c0127b3 = c0127bM17056a;
                    t17Var2 = t17Var3;
                    x63Var2 = x63Var3;
                    z3 = z4;
                    c0077c2 = c0077cM24823b;
                    fc0Var3 = fc0Var8;
                    interfaceC3624tu3 = interfaceC3624tu4;
                } else {
                    tj3Var.m22102U();
                    x63Var2 = x63Var;
                    z3 = z;
                    c0077c2 = c0077c;
                    e16Var3 = e16Var2;
                    c0127b3 = c0127b2;
                    t17Var2 = x17Var;
                    interfaceC3624tu3 = interfaceC3624tu2;
                    fc0Var3 = fc0Var2;
                }
                x18VarM22143u = tj3Var.m22143u();
                if (x18VarM22143u != null) {
                    x18VarM22143u.f67642d = new yj0(e16Var3, c0127b3, t17Var2, interfaceC3624tu3, fc0Var3, x63Var2, z3, c0077c2, vi3Var, i, i2, 2);
                }
            }
            i8 |= 196608;
            fc0Var2 = fc0Var;
            i11 = i8 | 46661632;
            if ((i & 805306368) == 0) {
                if (tj3Var.m22124i(vi3Var)) {
                    i13 = 536870912;
                } else {
                    i13 = 268435456;
                }
                i11 |= i13;
            }
            if ((306783379 & i11) != 306783378) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (tj3Var.m22099R(i11 & 1, z2)) {
                tj3Var.m22104W();
                if ((i & 1) != 0) {
                    if (i14 != 0) {
                        e16Var4 = b16.f7762a;
                    } else {
                        e16Var4 = e16Var2;
                    }
                    if ((i2 & 2) != 0) {
                        c0127bM17056a = mv4.m17056a(0, tj3Var, 3);
                        i11 &= -113;
                    } else {
                        c0127bM17056a = c0127b2;
                    }
                    if (i5 != 0) {
                        x17Var = new x17(0.0f, 0.0f, 0.0f, 0.0f);
                    }
                    if ((i2 & 16) != 0) {
                        i11 &= -57345;
                        interfaceC3624tu2 = eh0.f37236b;
                    }
                    if (i9 != 0) {
                        fc0Var2 = nj0.f52817l;
                    }
                    f32VarM21341a = sf9.m21341a(tj3Var);
                    zM22120g = tj3Var.m22120g(f32VarM21341a);
                    objM22097O = tj3Var.m22097O();
                    if (zM22120g) {
                        objM22097O = new C0100h(f32VarM21341a);
                        tj3Var.m22131l0(objM22097O);
                    } else {
                        objM22097O = new C0100h(f32VarM21341a);
                        tj3Var.m22131l0(objM22097O);
                    }
                    interfaceC3624tu4 = interfaceC3624tu2;
                    c0077cM24823b = y07.m24823b(tj3Var);
                    x63Var3 = (C0100h) objM22097O;
                    i12 = i11 & (-238551041);
                    t17Var3 = x17Var;
                    z4 = true;
                } else {
                    if (i14 != 0) {
                        e16Var4 = b16.f7762a;
                    } else {
                        e16Var4 = e16Var2;
                    }
                    if ((i2 & 2) != 0) {
                        c0127bM17056a = mv4.m17056a(0, tj3Var, 3);
                        i11 &= -113;
                    } else {
                        c0127bM17056a = c0127b2;
                    }
                    if (i5 != 0) {
                        x17Var = new x17(0.0f, 0.0f, 0.0f, 0.0f);
                    }
                    if ((i2 & 16) != 0) {
                        i11 &= -57345;
                        interfaceC3624tu2 = eh0.f37236b;
                    }
                    if (i9 != 0) {
                        fc0Var2 = nj0.f52817l;
                    }
                    f32VarM21341a = sf9.m21341a(tj3Var);
                    zM22120g = tj3Var.m22120g(f32VarM21341a);
                    objM22097O = tj3Var.m22097O();
                    if (zM22120g) {
                        objM22097O = new C0100h(f32VarM21341a);
                        tj3Var.m22131l0(objM22097O);
                    } else {
                        objM22097O = new C0100h(f32VarM21341a);
                        tj3Var.m22131l0(objM22097O);
                    }
                    interfaceC3624tu4 = interfaceC3624tu2;
                    c0077cM24823b = y07.m24823b(tj3Var);
                    x63Var3 = (C0100h) objM22097O;
                    i12 = i11 & (-238551041);
                    t17Var3 = x17Var;
                    z4 = true;
                }
                fc0 fc0Var9 = fc0Var2;
                tj3Var.m22140r();
                AbstractC0126a.m972a(e16Var4, c0127bM17056a, t17Var3, false, x63Var3, z4, c0077cM24823b, null, null, fc0Var9, interfaceC3624tu4, vi3Var, tj3Var, (i12 & 14) | 24576 | (i12 & 112) | (i12 & 896) | 1575936, ((i12 >> 12) & 112) | ((i12 >> 6) & 896) | ((i12 >> 18) & 7168), 1792);
                e16Var3 = e16Var4;
                c0127b3 = c0127bM17056a;
                t17Var2 = t17Var3;
                x63Var2 = x63Var3;
                z3 = z4;
                c0077c2 = c0077cM24823b;
                fc0Var3 = fc0Var9;
                interfaceC3624tu3 = interfaceC3624tu4;
            } else {
                tj3Var.m22102U();
                x63Var2 = x63Var;
                z3 = z;
                c0077c2 = c0077c;
                e16Var3 = e16Var2;
                c0127b3 = c0127b2;
                t17Var2 = x17Var;
                interfaceC3624tu3 = interfaceC3624tu2;
                fc0Var3 = fc0Var2;
            }
            x18VarM22143u = tj3Var.m22143u();
            if (x18VarM22143u != null) {
                x18VarM22143u.f67642d = new yj0(e16Var3, c0127b3, t17Var2, interfaceC3624tu3, fc0Var3, x63Var2, z3, c0077c2, vi3Var, i, i2, 2);
            }
        }
        interfaceC3624tu2 = interfaceC3624tu;
        i8 = i19 | i17;
        i9 = i2 & 32;
        if (i9 != 0) {
            if ((i & 196608) == 0) {
                fc0Var2 = fc0Var;
                if (tj3Var.m22120g(fc0Var2)) {
                    i10 = 131072;
                } else {
                    i10 = 65536;
                }
                i8 |= i10;
            }
            i11 = i8 | 46661632;
            if ((i & 805306368) == 0) {
                if (tj3Var.m22124i(vi3Var)) {
                    i13 = 536870912;
                } else {
                    i13 = 268435456;
                }
                i11 |= i13;
            }
            if ((306783379 & i11) != 306783378) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (tj3Var.m22099R(i11 & 1, z2)) {
                tj3Var.m22104W();
                if ((i & 1) != 0) {
                    if (i14 != 0) {
                        e16Var4 = b16.f7762a;
                    } else {
                        e16Var4 = e16Var2;
                    }
                    if ((i2 & 2) != 0) {
                        c0127bM17056a = mv4.m17056a(0, tj3Var, 3);
                        i11 &= -113;
                    } else {
                        c0127bM17056a = c0127b2;
                    }
                    if (i5 != 0) {
                        x17Var = new x17(0.0f, 0.0f, 0.0f, 0.0f);
                    }
                    if ((i2 & 16) != 0) {
                        i11 &= -57345;
                        interfaceC3624tu2 = eh0.f37236b;
                    }
                    if (i9 != 0) {
                        fc0Var2 = nj0.f52817l;
                    }
                    f32VarM21341a = sf9.m21341a(tj3Var);
                    zM22120g = tj3Var.m22120g(f32VarM21341a);
                    objM22097O = tj3Var.m22097O();
                    if (zM22120g) {
                        objM22097O = new C0100h(f32VarM21341a);
                        tj3Var.m22131l0(objM22097O);
                    } else {
                        objM22097O = new C0100h(f32VarM21341a);
                        tj3Var.m22131l0(objM22097O);
                    }
                    interfaceC3624tu4 = interfaceC3624tu2;
                    c0077cM24823b = y07.m24823b(tj3Var);
                    x63Var3 = (C0100h) objM22097O;
                    i12 = i11 & (-238551041);
                    t17Var3 = x17Var;
                    z4 = true;
                } else {
                    if (i14 != 0) {
                        e16Var4 = b16.f7762a;
                    } else {
                        e16Var4 = e16Var2;
                    }
                    if ((i2 & 2) != 0) {
                        c0127bM17056a = mv4.m17056a(0, tj3Var, 3);
                        i11 &= -113;
                    } else {
                        c0127bM17056a = c0127b2;
                    }
                    if (i5 != 0) {
                        x17Var = new x17(0.0f, 0.0f, 0.0f, 0.0f);
                    }
                    if ((i2 & 16) != 0) {
                        i11 &= -57345;
                        interfaceC3624tu2 = eh0.f37236b;
                    }
                    if (i9 != 0) {
                        fc0Var2 = nj0.f52817l;
                    }
                    f32VarM21341a = sf9.m21341a(tj3Var);
                    zM22120g = tj3Var.m22120g(f32VarM21341a);
                    objM22097O = tj3Var.m22097O();
                    if (zM22120g) {
                        objM22097O = new C0100h(f32VarM21341a);
                        tj3Var.m22131l0(objM22097O);
                    } else {
                        objM22097O = new C0100h(f32VarM21341a);
                        tj3Var.m22131l0(objM22097O);
                    }
                    interfaceC3624tu4 = interfaceC3624tu2;
                    c0077cM24823b = y07.m24823b(tj3Var);
                    x63Var3 = (C0100h) objM22097O;
                    i12 = i11 & (-238551041);
                    t17Var3 = x17Var;
                    z4 = true;
                }
                fc0 fc0Var10 = fc0Var2;
                tj3Var.m22140r();
                AbstractC0126a.m972a(e16Var4, c0127bM17056a, t17Var3, false, x63Var3, z4, c0077cM24823b, null, null, fc0Var10, interfaceC3624tu4, vi3Var, tj3Var, (i12 & 14) | 24576 | (i12 & 112) | (i12 & 896) | 1575936, ((i12 >> 12) & 112) | ((i12 >> 6) & 896) | ((i12 >> 18) & 7168), 1792);
                e16Var3 = e16Var4;
                c0127b3 = c0127bM17056a;
                t17Var2 = t17Var3;
                x63Var2 = x63Var3;
                z3 = z4;
                c0077c2 = c0077cM24823b;
                fc0Var3 = fc0Var10;
                interfaceC3624tu3 = interfaceC3624tu4;
            } else {
                tj3Var.m22102U();
                x63Var2 = x63Var;
                z3 = z;
                c0077c2 = c0077c;
                e16Var3 = e16Var2;
                c0127b3 = c0127b2;
                t17Var2 = x17Var;
                interfaceC3624tu3 = interfaceC3624tu2;
                fc0Var3 = fc0Var2;
            }
            x18VarM22143u = tj3Var.m22143u();
            if (x18VarM22143u != null) {
                x18VarM22143u.f67642d = new yj0(e16Var3, c0127b3, t17Var2, interfaceC3624tu3, fc0Var3, x63Var2, z3, c0077c2, vi3Var, i, i2, 2);
            }
        }
        i8 |= 196608;
        fc0Var2 = fc0Var;
        i11 = i8 | 46661632;
        if ((i & 805306368) == 0) {
            if (tj3Var.m22124i(vi3Var)) {
                i13 = 536870912;
            } else {
                i13 = 268435456;
            }
            i11 |= i13;
        }
        if ((306783379 & i11) != 306783378) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (tj3Var.m22099R(i11 & 1, z2)) {
            tj3Var.m22104W();
            if ((i & 1) != 0) {
                if (i14 != 0) {
                    e16Var4 = b16.f7762a;
                } else {
                    e16Var4 = e16Var2;
                }
                if ((i2 & 2) != 0) {
                    c0127bM17056a = mv4.m17056a(0, tj3Var, 3);
                    i11 &= -113;
                } else {
                    c0127bM17056a = c0127b2;
                }
                if (i5 != 0) {
                    x17Var = new x17(0.0f, 0.0f, 0.0f, 0.0f);
                }
                if ((i2 & 16) != 0) {
                    i11 &= -57345;
                    interfaceC3624tu2 = eh0.f37236b;
                }
                if (i9 != 0) {
                    fc0Var2 = nj0.f52817l;
                }
                f32VarM21341a = sf9.m21341a(tj3Var);
                zM22120g = tj3Var.m22120g(f32VarM21341a);
                objM22097O = tj3Var.m22097O();
                if (zM22120g) {
                    objM22097O = new C0100h(f32VarM21341a);
                    tj3Var.m22131l0(objM22097O);
                } else {
                    objM22097O = new C0100h(f32VarM21341a);
                    tj3Var.m22131l0(objM22097O);
                }
                interfaceC3624tu4 = interfaceC3624tu2;
                c0077cM24823b = y07.m24823b(tj3Var);
                x63Var3 = (C0100h) objM22097O;
                i12 = i11 & (-238551041);
                t17Var3 = x17Var;
                z4 = true;
            } else {
                if (i14 != 0) {
                    e16Var4 = b16.f7762a;
                } else {
                    e16Var4 = e16Var2;
                }
                if ((i2 & 2) != 0) {
                    c0127bM17056a = mv4.m17056a(0, tj3Var, 3);
                    i11 &= -113;
                } else {
                    c0127bM17056a = c0127b2;
                }
                if (i5 != 0) {
                    x17Var = new x17(0.0f, 0.0f, 0.0f, 0.0f);
                }
                if ((i2 & 16) != 0) {
                    i11 &= -57345;
                    interfaceC3624tu2 = eh0.f37236b;
                }
                if (i9 != 0) {
                    fc0Var2 = nj0.f52817l;
                }
                f32VarM21341a = sf9.m21341a(tj3Var);
                zM22120g = tj3Var.m22120g(f32VarM21341a);
                objM22097O = tj3Var.m22097O();
                if (zM22120g) {
                    objM22097O = new C0100h(f32VarM21341a);
                    tj3Var.m22131l0(objM22097O);
                } else {
                    objM22097O = new C0100h(f32VarM21341a);
                    tj3Var.m22131l0(objM22097O);
                }
                interfaceC3624tu4 = interfaceC3624tu2;
                c0077cM24823b = y07.m24823b(tj3Var);
                x63Var3 = (C0100h) objM22097O;
                i12 = i11 & (-238551041);
                t17Var3 = x17Var;
                z4 = true;
            }
            fc0 fc0Var11 = fc0Var2;
            tj3Var.m22140r();
            AbstractC0126a.m972a(e16Var4, c0127bM17056a, t17Var3, false, x63Var3, z4, c0077cM24823b, null, null, fc0Var11, interfaceC3624tu4, vi3Var, tj3Var, (i12 & 14) | 24576 | (i12 & 112) | (i12 & 896) | 1575936, ((i12 >> 12) & 112) | ((i12 >> 6) & 896) | ((i12 >> 18) & 7168), 1792);
            e16Var3 = e16Var4;
            c0127b3 = c0127bM17056a;
            t17Var2 = t17Var3;
            x63Var2 = x63Var3;
            z3 = z4;
            c0077c2 = c0077cM24823b;
            fc0Var3 = fc0Var11;
            interfaceC3624tu3 = interfaceC3624tu4;
        } else {
            tj3Var.m22102U();
            x63Var2 = x63Var;
            z3 = z;
            c0077c2 = c0077c;
            e16Var3 = e16Var2;
            c0127b3 = c0127b2;
            t17Var2 = x17Var;
            interfaceC3624tu3 = interfaceC3624tu2;
            fc0Var3 = fc0Var2;
        }
        x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new yj0(e16Var3, c0127b3, t17Var2, interfaceC3624tu3, fc0Var3, x63Var2, z3, c0077c2, vi3Var, i, i2, 2);
        }
    }

    /* JADX INFO: renamed from: f */
    public static final void m11644f(e16 e16Var, C0282a c0282a, ye1 ye1Var, int i) {
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-1854833411);
        int i2 = (tj3Var.m22120g(e16Var) ? 4 : 2) | i;
        if (tj3Var.m22099R(i2 & 1, (i2 & 19) != 18)) {
            Object objM22097O = tj3Var.m22097O();
            if (objM22097O == we1.f66679a) {
                objM22097O = C3580sn.f61041h;
                tj3Var.m22131l0(objM22097O);
            }
            ht5 ht5Var = (ht5) objM22097O;
            int iHashCode = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m = tj3Var.m22132m();
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16Var);
            se1.f60731q.getClass();
            ui3 ui3Var = C0352b.f4299b;
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, C0352b.f4303f, ht5Var);
            oha.m18001g(tj3Var, C0352b.f4302e, l77VarM22132m);
            oha.m18001g(tj3Var, C0352b.f4304g, Integer.valueOf(iHashCode));
            oha.m18000f(tj3Var, C0352b.f4305h);
            oha.m18001g(tj3Var, C0352b.f4301d, e16VarM1322c);
            wq1.m24128x(6, c0282a, tj3Var, true);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new C3794yf(e16Var, i, 20, c0282a);
        }
    }

    /* JADX INFO: renamed from: g */
    public static final void m11645g(n66 n66Var, Object obj, Object obj2) {
        int iM17254f = n66Var.m17254f(obj);
        boolean z = iM17254f < 0;
        Object obj3 = z ? null : n66Var.f52401c[iM17254f];
        if (obj3 != null) {
            if (obj3 instanceof o66) {
                ((o66) obj3).m17811d(obj2);
            } else if (obj3 != obj2) {
                o66 o66Var = new o66();
                o66Var.m17811d(obj3);
                o66Var.m17811d(obj2);
                obj2 = o66Var;
            }
            obj2 = obj3;
        }
        if (!z) {
            n66Var.f52401c[iM17254f] = obj2;
            return;
        }
        int i = ~iM17254f;
        n66Var.f52400b[i] = obj;
        n66Var.f52401c[i] = obj2;
    }

    /* JADX INFO: renamed from: h */
    public static void m11646h(OperationalDataEnum operationalDataEnum, String str, String str2, Bundle bundle, jz6 jz6Var) {
        operationalDataEnum.getClass();
        str.getClass();
        str2.getClass();
        int i = iz6.f44807a[m11659u(operationalDataEnum, str).ordinal()];
        if (i == 1) {
            bundle.putCharSequence(str, str2);
            return;
        }
        if (i == 2) {
            jz6Var.m14754a(operationalDataEnum, str, str2);
        } else {
            if (i != 3) {
                return;
            }
            jz6Var.m14754a(operationalDataEnum, str, str2);
            bundle.putCharSequence(str, str2);
        }
    }

    /* JADX INFO: renamed from: i */
    public static Pair m11647i(OperationalDataEnum operationalDataEnum, String str, String str2, Bundle bundle, jz6 jz6Var) {
        operationalDataEnum.getClass();
        int i = iz6.f44807a[m11659u(operationalDataEnum, str).ordinal()];
        if (i == 1) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putCharSequence(str, str2);
        } else if (i == 2) {
            if (jz6Var == null) {
                jz6Var = new jz6();
            }
            jz6Var.m14754a(operationalDataEnum, str, str2);
        } else if (i == 3) {
            if (jz6Var == null) {
                jz6Var = new jz6();
            }
            if (bundle == null) {
                bundle = new Bundle();
            }
            jz6Var.m14754a(operationalDataEnum, str, str2);
            bundle.putCharSequence(str, str2);
        }
        return new Pair(bundle, jz6Var);
    }

    /* JADX INFO: renamed from: j */
    public static boolean m11648j(float f, Float f2) {
        return f2 != null && f == f2.floatValue();
    }

    /* JADX INFO: renamed from: k */
    public static boolean m11649k(Float f, float f2) {
        return f != null && f.floatValue() == f2;
    }

    /* JADX INFO: renamed from: l */
    public static boolean m11650l(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    /* JADX INFO: renamed from: m */
    public static int m11651m(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i == i2 ? 0 : 1;
    }

    /* JADX INFO: renamed from: n */
    public static int m11652n(long j, long j2) {
        if (j < j2) {
            return -1;
        }
        return j == j2 ? 0 : 1;
    }

    /* JADX INFO: renamed from: o */
    public static byte[] m11653o(byte[] bArr) {
        Deflater deflater = new Deflater(1);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            try {
                deflaterOutputStream.write(bArr);
                deflaterOutputStream.close();
                deflater.end();
                return byteArrayOutputStream.toByteArray();
            } catch (Throwable th) {
                try {
                    deflaterOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            deflater.end();
            throw th3;
        }
    }

    /* JADX INFO: renamed from: p */
    public static n66 m11654p() {
        long[] jArr = om8.f54590a;
        return new n66();
    }

    /* JADX INFO: renamed from: q */
    public static t66 m11655q() {
        return AbstractC0278f.m1259i(xfa.f68157a, s46.f60289d);
    }

    /* JADX INFO: renamed from: r */
    public static final String m11656r(int i, String str, String str2, String str3, String str4) {
        StringBuilder sb = new StringBuilder();
        if (i >= 0) {
            sb.append("Unexpected JSON token at offset " + i + ": ");
        }
        sb.append(str);
        if (str2 != null && !vk9.m23391n0(str2)) {
            sb.append(" at path: ");
            sb.append(str2);
        }
        if (str3 != null && !vk9.m23391n0(str3)) {
            sb.append("\n".concat(str3));
        }
        if (str4 != null) {
            sb.append("\nJSON input: ");
            sb.append(str4);
        }
        return sb.toString();
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0027  */
    /* JADX INFO: renamed from: s */
    public static byte[] m11657s(Context context, String str) {
        MessageDigest messageDigest;
        PackageInfo packageInfoM23949b = m9b.m16702a(context).m23949b(64, str);
        Signature[] signatureArr = packageInfoM23949b.signatures;
        if (signatureArr != null && signatureArr.length == 1) {
            for (int i = 0; i < 2; i++) {
                try {
                    messageDigest = MessageDigest.getInstance("SHA1");
                    if (messageDigest != null) {
                        if (messageDigest != null) {
                            return messageDigest.digest(packageInfoM23949b.signatures[0].toByteArray());
                        }
                    }
                } catch (NoSuchAlgorithmException unused) {
                }
            }
            messageDigest = null;
            if (messageDigest != null) {
                return messageDigest.digest(packageInfoM23949b.signatures[0].toByteArray());
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001f  */
    /* JADX INFO: renamed from: t */
    public static Object m11658t(OperationalDataEnum operationalDataEnum, String str, Bundle bundle, jz6 jz6Var) {
        Object obj;
        Map map;
        operationalDataEnum.getClass();
        str.getClass();
        if (jz6Var != null) {
            LinkedHashMap linkedHashMap = jz6Var.f46433a;
            if (linkedHashMap.containsKey(operationalDataEnum) && (map = (Map) linkedHashMap.get(operationalDataEnum)) != null) {
                obj = map.get(str);
            } else {
                obj = null;
            }
        } else {
            obj = null;
        }
        return obj == null ? bundle != null ? bundle.getCharSequence(str) : null : obj;
    }

    /* JADX INFO: renamed from: u */
    public static ParameterClassification m11659u(OperationalDataEnum operationalDataEnum, String str) {
        operationalDataEnum.getClass();
        str.getClass();
        Map map = jz6.f46432b;
        Pair pair = (Pair) map.get(operationalDataEnum);
        Set set = pair != null ? (Set) pair.f47623a : null;
        Pair pair2 = (Pair) map.get(operationalDataEnum);
        Set set2 = pair2 != null ? (Set) pair2.f47624b : null;
        if (set == null || !set.contains(str)) {
            return (set2 == null || !set2.contains(str)) ? ParameterClassification.CustomData : ParameterClassification.CustomAndOperationalData;
        }
        return ParameterClassification.OperationalData;
    }

    /* JADX INFO: renamed from: v */
    public static final yk5 m11660v(yk5 yk5Var) {
        C0357g c0357g = yk5Var.f69928J.f4432J;
        while (true) {
            C0357g c0357gM1610w = c0357g.m1610w();
            C0357g c0357g2 = null;
            if ((c0357gM1610w != null ? c0357gM1610w.f4348h : null) == null) {
                yk5 yk5VarMo1542d1 = ((AbstractC0362l) c0357g.f4335a0.f46677e).mo1542d1();
                yk5VarMo1542d1.getClass();
                return yk5VarMo1542d1;
            }
            C0357g c0357gM1610w2 = c0357g.m1610w();
            if (c0357gM1610w2 != null) {
                c0357g2 = c0357gM1610w2.f4348h;
            }
            c0357g2.getClass();
            C0357g c0357gM1610w3 = c0357g.m1610w();
            c0357gM1610w3.getClass();
            c0357g = c0357gM1610w3.f4348h;
            c0357g.getClass();
        }
    }

    /* JADX INFO: renamed from: w */
    public static final String m11661w(ye1 ye1Var, int i) {
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22128k(AbstractC0394f.f4760a);
        return ((Resources) tj3Var.m22128k(AbstractC0394f.f4762c)).getString(i);
    }

    /* JADX INFO: renamed from: x */
    public static final void m11662x(C3488q8 c3488q8, String str) {
        c3488q8.m19750r("Trailing comma before the end of JSON ".concat(str), c3488q8.f57368b - 1, "Trailing commas are non-complaint JSON and not allowed by default. Use 'allowTrailingComma = true' in 'Json {}' builder to support them.");
        throw null;
    }

    /* JADX INFO: renamed from: y */
    public static final void m11663y(t66 t66Var) {
        t66Var.setValue(xfa.f68157a);
    }

    /* JADX INFO: renamed from: z */
    public static final e16 m11664z(e16 e16Var, C0187a c0187a, yw4 yw4Var, C0205f c0205f) {
        return e16Var.mo3161g(new sw4(c0187a, yw4Var, c0205f));
    }
}
