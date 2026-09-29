package p392t5;

import android.os.Bundle;
import android.util.Log;
import androidx.datastore.preferences.PreferencesProto$Value;
import com.bumptech.glide.manager.InterfaceC2159o;
import dm.C5212l;
import ga.InterfaceC5720c;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReference;
import je.InterfaceC6465a;
import p027b6.C1322b;
import p087e6.C5374c;
import p110f6.InterfaceC5471b;
import p234l4.InterfaceC7251a;
import p258m6.C7481a;
import p356r5.C8735e;
import p356r5.InterfaceC8731a;
import p543do.InterfaceC5240k0;
import pf.C8241d;
import pf.InterfaceC8240c;
import sd.C8990a;
import td.InterfaceC9271s;

/* JADX INFO: renamed from: t5.i */
/* JADX INFO: loaded from: classes.dex */
public final class C9203i implements InterfaceC8731a, InterfaceC5471b, InterfaceC2159o, InterfaceC5720c, InterfaceC9271s, InterfaceC6465a, InterfaceC8240c, InterfaceC7251a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f47760a;

    public /* synthetic */ C9203i(int i10) {
        this.f47760a = i10;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m17541a(int i10) {
        Object[] objArr = new Object[3];
        switch (i10) {
            case 1:
            case 4:
                objArr[0] = "b";
                break;
            case 2:
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                objArr[0] = "typeCheckingProcedure";
                break;
            case 3:
            default:
                objArr[0] = "a";
                break;
            case 5:
            case 10:
                objArr[0] = "subtype";
                break;
            case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
            case 11:
                objArr[0] = "supertype";
                break;
            case 8:
                objArr[0] = "type";
                break;
            case 9:
                objArr[0] = "typeProjection";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/types/checker/TypeCheckerProcedureCallbacksImpl";
        switch (i10) {
            case 3:
            case 4:
                objArr[2] = "assertEqualTypeConstructors";
                break;
            case 5:
            case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                objArr[2] = "assertSubtype";
                break;
            case 8:
            case 9:
                objArr[2] = "capture";
                break;
            case 10:
            case 11:
                objArr[2] = "noCorrespondingSupertype";
                break;
            default:
                objArr[2] = "assertEqualTypes";
                break;
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: c */
    public static boolean m17542c(InterfaceC5240k0 interfaceC5240k0, InterfaceC5240k0 interfaceC5240k1) {
        if (interfaceC5240k0 == null) {
            m17541a(3);
            throw null;
        }
        if (interfaceC5240k1 != null) {
            return interfaceC5240k0.equals(interfaceC5240k1);
        }
        m17541a(4);
        throw null;
    }

    /* JADX INFO: renamed from: d */
    public static String m17543d(StringBuilder sb2) {
        int length = sb2.length() - 0;
        if (length == 0) {
            throw new IllegalStateException("StringBuilder must not be empty");
        }
        int iCharAt = (sb2.charAt(0) << 18) + ((length >= 2 ? sb2.charAt(1) : (char) 0) << '\f') + ((length >= 3 ? sb2.charAt(2) : (char) 0) << 6) + (length >= 4 ? sb2.charAt(3) : (char) 0);
        char c10 = (char) ((iCharAt >> 16) & 255);
        char c11 = (char) ((iCharAt >> 8) & 255);
        char c12 = (char) (iCharAt & 255);
        StringBuilder sb3 = new StringBuilder(3);
        sb3.append(c10);
        if (length >= 2) {
            sb3.append(c11);
        }
        if (length >= 3) {
            sb3.append(c12);
        }
        return sb3.toString();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0058  */
    @Override // p110f6.InterfaceC5471b
    /* JADX INFO: renamed from: b */
    public final InterfaceC9207m mo65b(InterfaceC9207m interfaceC9207m, C8735e c8735e) {
        byte[] bArrArray;
        ByteBuffer byteBufferAsReadOnlyBuffer = ((C5374c) interfaceC9207m.get()).f33757a.f33767a.f33769a.mo16581a().asReadOnlyBuffer();
        AtomicReference<byte[]> atomicReference = C7481a.f41356a;
        C7481a.b bVar = (byteBufferAsReadOnlyBuffer.isReadOnly() || !byteBufferAsReadOnlyBuffer.hasArray()) ? null : new C7481a.b(byteBufferAsReadOnlyBuffer.array(), byteBufferAsReadOnlyBuffer.arrayOffset(), byteBufferAsReadOnlyBuffer.limit());
        if (bVar == null || bVar.f41359a != 0) {
            ByteBuffer byteBufferAsReadOnlyBuffer2 = byteBufferAsReadOnlyBuffer.asReadOnlyBuffer();
            byte[] bArr = new byte[byteBufferAsReadOnlyBuffer2.limit()];
            byteBufferAsReadOnlyBuffer2.get(bArr);
            bArrArray = bArr;
        } else {
            if (bVar.f41360b == bVar.f41361c.length) {
                bArrArray = byteBufferAsReadOnlyBuffer.array();
            } else {
                ByteBuffer byteBufferAsReadOnlyBuffer3 = byteBufferAsReadOnlyBuffer.asReadOnlyBuffer();
                byte[] bArr2 = new byte[byteBufferAsReadOnlyBuffer3.limit()];
                byteBufferAsReadOnlyBuffer3.get(bArr2);
                bArrArray = bArr2;
            }
        }
        return new C1322b(bArrArray);
    }

    @Override // p356r5.InterfaceC8731a
    /* JADX INFO: renamed from: e */
    public final boolean mo70e(Object obj, File file, C8735e c8735e) throws Throwable {
        try {
            C7481a.m14867d((ByteBuffer) obj, file);
            return true;
        } catch (IOException e10) {
            if (Log.isLoggable("ByteBufferEncoder", 3)) {
                Log.d("ByteBufferEncoder", "Failed to write data", e10);
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: f */
    public final int m17544f() {
        switch (this.f47760a) {
            case 10:
                return 5;
            default:
                return 4;
        }
    }

    /* JADX WARN: Code duplicated, block: B:109:0x00ab A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:13:0x0057  */
    /* JADX WARN: Code duplicated, block: B:14:0x005a  */
    /* JADX WARN: Code duplicated, block: B:19:0x0065  */
    /* JADX WARN: Code duplicated, block: B:21:0x006b  */
    /* JADX WARN: Code duplicated, block: B:22:0x0072  */
    /* JADX WARN: Code duplicated, block: B:24:0x0078  */
    /* JADX WARN: Code duplicated, block: B:28:0x008f  */
    /* JADX WARN: Code duplicated, block: B:31:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:35:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:72:0x0189  */
    /* JADX WARN: Code duplicated, block: B:74:0x018c A[Catch: all -> 0x01e8, TryCatch #0 {all -> 0x01e8, blocks: (B:59:0x0138, B:64:0x014a, B:66:0x016c, B:74:0x018c, B:81:0x01a1, B:83:0x01b9, B:85:0x01cb, B:86:0x01d6, B:90:0x01de, B:91:0x01e7), top: B:95:0x0138 }] */
    /* JADX WARN: Code duplicated, block: B:79:0x019e  */
    /* JADX WARN: Code duplicated, block: B:81:0x01a1 A[Catch: all -> 0x01e8, TryCatch #0 {all -> 0x01e8, blocks: (B:59:0x0138, B:64:0x014a, B:66:0x016c, B:74:0x018c, B:81:0x01a1, B:83:0x01b9, B:85:0x01cb, B:86:0x01d6, B:90:0x01de, B:91:0x01e7), top: B:95:0x0138 }] */
    /* JADX WARN: Code duplicated, block: B:83:0x01b9 A[Catch: all -> 0x01e8, TryCatch #0 {all -> 0x01e8, blocks: (B:59:0x0138, B:64:0x014a, B:66:0x016c, B:74:0x018c, B:81:0x01a1, B:83:0x01b9, B:85:0x01cb, B:86:0x01d6, B:90:0x01de, B:91:0x01e7), top: B:95:0x0138 }] */
    /* JADX WARN: Code duplicated, block: B:85:0x01cb A[Catch: all -> 0x01e8, TryCatch #0 {all -> 0x01e8, blocks: (B:59:0x0138, B:64:0x014a, B:66:0x016c, B:74:0x018c, B:81:0x01a1, B:83:0x01b9, B:85:0x01cb, B:86:0x01d6, B:90:0x01de, B:91:0x01e7), top: B:95:0x0138 }] */
    /* JADX WARN: Code duplicated, block: B:86:0x01d6 A[Catch: all -> 0x01e8, TRY_LEAVE, TryCatch #0 {all -> 0x01e8, blocks: (B:59:0x0138, B:64:0x014a, B:66:0x016c, B:74:0x018c, B:81:0x01a1, B:83:0x01b9, B:85:0x01cb, B:86:0x01d6, B:90:0x01de, B:91:0x01e7), top: B:95:0x0138 }] */
    /* JADX WARN: Code duplicated, block: B:89:0x01dd  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // pf.InterfaceC8240c
    /* JADX INFO: renamed from: h */
    public final void mo15557h(C8241d c8241d) {
        int length;
        int iM16384a;
        boolean z10;
        int length2;
        int iM16384a2;
        StringBuilder sb2;
        int i10;
        String strM17543d;
        String str = c8241d.f44510a;
        boolean z11 = true;
        switch (this.f47760a) {
            case 10:
                StringBuilder sb3 = new StringBuilder();
                sb3.append((char) 0);
                while (c8241d.m16386c()) {
                    sb3.append(c8241d.m16385b());
                    int i11 = c8241d.f44515f + 1;
                    c8241d.f44515f = i11;
                    if (C5212l.m11154a0(str, i11, m17544f()) != m17544f()) {
                        c8241d.f44516g = 0;
                        length = sb3.length() - 1;
                        iM16384a = c8241d.m16384a() + length + 1;
                        c8241d.m16387d(iM16384a);
                        if (c8241d.f44517h.f44525b - iM16384a > 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (c8241d.m16386c() || z10) {
                            if (length <= 249) {
                                sb3.setCharAt(0, (char) length);
                            } else {
                                if (length > 1555) {
                                    throw new IllegalStateException("Message length not in valid ranges: ".concat(String.valueOf(length)));
                                }
                                sb3.setCharAt(0, (char) ((length / 250) + 249));
                                sb3.insert(1, (char) (length % 250));
                            }
                        }
                        length2 = sb3.length();
                        for (int i12 = 0; i12 < length2; i12++) {
                            iM16384a2 = (((c8241d.m16384a() + 1) * 149) % 255) + 1 + sb3.charAt(i12);
                            if (iM16384a2 <= 255) {
                                iM16384a2 -= 256;
                            }
                            c8241d.m16388e((char) iM16384a2);
                        }
                        return;
                    }
                }
                length = sb3.length() - 1;
                iM16384a = c8241d.m16384a() + length + 1;
                c8241d.m16387d(iM16384a);
                if (c8241d.f44517h.f44525b - iM16384a > 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c8241d.m16386c()) {
                    if (length <= 249) {
                        sb3.setCharAt(0, (char) length);
                    } else {
                        if (length > 1555) {
                            throw new IllegalStateException("Message length not in valid ranges: ".concat(String.valueOf(length)));
                        }
                        sb3.setCharAt(0, (char) ((length / 250) + 249));
                        sb3.insert(1, (char) (length % 250));
                    }
                } else if (length <= 249) {
                    sb3.setCharAt(0, (char) length);
                } else {
                    if (length > 1555) {
                        throw new IllegalStateException("Message length not in valid ranges: ".concat(String.valueOf(length)));
                    }
                    sb3.setCharAt(0, (char) ((length / 250) + 249));
                    sb3.insert(1, (char) (length % 250));
                }
                length2 = sb3.length();
                while (i12 < length2) {
                    iM16384a2 = (((c8241d.m16384a() + 1) * 149) % 255) + 1 + sb3.charAt(i12);
                    if (iM16384a2 <= 255) {
                        iM16384a2 -= 256;
                    }
                    c8241d.m16388e((char) iM16384a2);
                }
                return;
            default:
                StringBuilder sb4 = new StringBuilder();
                while (true) {
                    boolean zM16386c = c8241d.m16386c();
                    sb2 = c8241d.f44514e;
                    if (zM16386c) {
                        char cM16385b = c8241d.m16385b();
                        if (cM16385b >= ' ' && cM16385b <= '?') {
                            sb4.append(cM16385b);
                        } else {
                            if (cM16385b < '@' || cM16385b > '^') {
                                C5212l.m11148U(cM16385b);
                                throw null;
                            }
                            sb4.append((char) (cM16385b - '@'));
                        }
                        c8241d.f44515f++;
                        if (sb4.length() >= 4) {
                            sb2.append(m17543d(sb4));
                            sb4.delete(0, 4);
                            if (C5212l.m11154a0(str, c8241d.f44515f, m17544f()) != m17544f()) {
                                c8241d.f44516g = 0;
                            }
                        }
                    }
                }
                sb4.append((char) 31);
                try {
                    int length3 = sb4.length();
                    if (length3 == 0) {
                        c8241d.f44516g = 0;
                        return;
                    }
                    if (length3 == 1) {
                        c8241d.m16387d(c8241d.m16384a());
                        int iM16384a3 = c8241d.f44517h.f44525b - c8241d.m16384a();
                        int length4 = (str.length() - c8241d.f44518i) - c8241d.f44515f;
                        if (length4 > iM16384a3) {
                            c8241d.m16387d(c8241d.m16384a() + 1);
                            iM16384a3 = c8241d.f44517h.f44525b - c8241d.m16384a();
                        }
                        if (length4 > iM16384a3 || iM16384a3 > 2) {
                            if (length3 <= 4) {
                                throw new IllegalStateException("Count must not exceed 4");
                            }
                            i10 = length3 - 1;
                            strM17543d = m17543d(sb4);
                            if ((!c8241d.m16386c()) || i10 > 2) {
                                z11 = false;
                            }
                            if (i10 <= 2) {
                                c8241d.m16387d(c8241d.m16384a() + i10);
                                if (c8241d.f44517h.f44525b - c8241d.m16384a() >= 3) {
                                    c8241d.m16387d(c8241d.m16384a() + strM17543d.length());
                                    z11 = false;
                                }
                            }
                            if (z11) {
                                c8241d.f44517h = null;
                                c8241d.f44515f -= i10;
                            } else {
                                sb2.append(strM17543d);
                            }
                        }
                    } else {
                        if (length3 <= 4) {
                            throw new IllegalStateException("Count must not exceed 4");
                        }
                        i10 = length3 - 1;
                        strM17543d = m17543d(sb4);
                        if (!c8241d.m16386c()) {
                            z11 = false;
                        } else {
                            z11 = false;
                        }
                        if (i10 <= 2) {
                            c8241d.m16387d(c8241d.m16384a() + i10);
                            if (c8241d.f44517h.f44525b - c8241d.m16384a() >= 3) {
                                c8241d.m16387d(c8241d.m16384a() + strM17543d.length());
                                z11 = false;
                            }
                        }
                        if (z11) {
                            c8241d.f44517h = null;
                            c8241d.f44515f -= i10;
                        } else {
                            sb2.append(strM17543d);
                        }
                    }
                    c8241d.f44516g = 0;
                    return;
                } catch (Throwable th2) {
                    c8241d.f44516g = 0;
                    throw th2;
                }
        }
    }

    @Override // je.InterfaceC6465a
    /* JADX INFO: renamed from: p */
    public final void mo13074p(Bundle bundle) {
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Skipping logging Crashlytics event to Firebase, no Firebase Analytics", null);
        }
    }

    @Override // td.InterfaceC9271s
    public final /* synthetic */ Object zza() {
        return new C8990a();
    }
}
