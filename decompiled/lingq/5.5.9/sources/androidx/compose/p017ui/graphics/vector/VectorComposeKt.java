package androidx.compose.p017ui.graphics.vector;

import android.graphics.Path;
import androidx.compose.runtime.C0480e;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.InterfaceC0476a;
import cm.InterfaceC2041a;
import cm.InterfaceC2056p;
import cm.InterfaceC2057q;
import com.kochava.tracker.BuildConfig;
import dm.C5207g;
import java.util.List;
import kotlin.collections.EmptyList;
import p081e0.C5332q0;
import p081e0.InterfaceC5299c;
import p081e0.InterfaceC5336s0;
import p338qd.C8573r0;
import p387t0.AbstractC9161o;
import p387t0.C9140d0;
import p387t0.C9151j;
import p387t0.C9158m0;
import p387t0.C9160n0;
import p469x0.AbstractC10003d;
import p469x0.C10001b;
import p469x0.C10006g;
import p469x0.C10009j;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
public final class VectorComposeKt {
    /* JADX WARN: Code duplicated, block: B:102:0x0131  */
    /* JADX WARN: Code duplicated, block: B:108:0x0156  */
    /* JADX WARN: Code duplicated, block: B:110:0x0160  */
    /* JADX WARN: Code duplicated, block: B:117:0x017a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:118:0x017c  */
    /* JADX WARN: Code duplicated, block: B:119:0x017f  */
    /* JADX WARN: Code duplicated, block: B:122:0x0185  */
    /* JADX WARN: Code duplicated, block: B:123:0x0187  */
    /* JADX WARN: Code duplicated, block: B:125:0x018b  */
    /* JADX WARN: Code duplicated, block: B:126:0x018d  */
    /* JADX WARN: Code duplicated, block: B:128:0x0191  */
    /* JADX WARN: Code duplicated, block: B:131:0x0196  */
    /* JADX WARN: Code duplicated, block: B:134:0x019a  */
    /* JADX WARN: Code duplicated, block: B:136:0x019e  */
    /* JADX WARN: Code duplicated, block: B:137:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:140:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:142:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:143:0x01ad A[PHI: r1 r3 r4 r6 r7 r9 r13 r14 r15
      0x01ad: PHI (r1v6 java.lang.String) = (r1v3 java.lang.String), (r1v7 java.lang.String) binds: [B:141:0x01a7, B:116:0x016d] A[DONT_GENERATE, DONT_INLINE]
      0x01ad: PHI (r3v33 int) = (r3v22 int), (r3v34 int) binds: [B:141:0x01a7, B:116:0x016d] A[DONT_GENERATE, DONT_INLINE]
      0x01ad: PHI (r4v6 float) = (r4v2 float), (r4v7 float) binds: [B:141:0x01a7, B:116:0x016d] A[DONT_GENERATE, DONT_INLINE]
      0x01ad: PHI (r6v11 float) = (r6v7 float), (r6v12 float) binds: [B:141:0x01a7, B:116:0x016d] A[DONT_GENERATE, DONT_INLINE]
      0x01ad: PHI (r7v16 float) = (r7v12 float), (r7v18 float) binds: [B:141:0x01a7, B:116:0x016d] A[DONT_GENERATE, DONT_INLINE]
      0x01ad: PHI (r9v11 float) = (r9v7 float), (r9v12 float) binds: [B:141:0x01a7, B:116:0x016d] A[DONT_GENERATE, DONT_INLINE]
      0x01ad: PHI (r13v6 float) = (r13v3 float), (r13v2 float) binds: [B:141:0x01a7, B:116:0x016d] A[DONT_GENERATE, DONT_INLINE]
      0x01ad: PHI (r14v9 float) = (r14v6 float), (r14v10 float) binds: [B:141:0x01a7, B:116:0x016d] A[DONT_GENERATE, DONT_INLINE]
      0x01ad: PHI (r15v7 float) = (r15v4 float), (r15v3 float) binds: [B:141:0x01a7, B:116:0x016d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:146:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:148:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:149:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:154:0x023d  */
    /* JADX WARN: Code duplicated, block: B:156:0x024c  */
    /* JADX WARN: Code duplicated, block: B:158:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0054  */
    /* JADX WARN: Code duplicated, block: B:27:0x0057  */
    /* JADX WARN: Code duplicated, block: B:29:0x005b  */
    /* JADX WARN: Code duplicated, block: B:31:0x0063  */
    /* JADX WARN: Code duplicated, block: B:32:0x0068  */
    /* JADX WARN: Code duplicated, block: B:37:0x0072  */
    /* JADX WARN: Code duplicated, block: B:38:0x0075  */
    /* JADX WARN: Code duplicated, block: B:40:0x0079  */
    /* JADX WARN: Code duplicated, block: B:42:0x0081  */
    /* JADX WARN: Code duplicated, block: B:43:0x0084  */
    /* JADX WARN: Code duplicated, block: B:48:0x008e  */
    /* JADX WARN: Code duplicated, block: B:49:0x0091  */
    /* JADX WARN: Code duplicated, block: B:51:0x0097  */
    /* JADX WARN: Code duplicated, block: B:53:0x009f  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:59:0x00af  */
    /* JADX WARN: Code duplicated, block: B:60:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:62:0x00be  */
    /* JADX WARN: Code duplicated, block: B:64:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:65:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:69:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:70:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:72:0x00de  */
    /* JADX WARN: Code duplicated, block: B:74:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:75:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:79:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:80:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:82:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:84:0x0104  */
    /* JADX WARN: Code duplicated, block: B:85:0x0107  */
    /* JADX WARN: Code duplicated, block: B:89:0x010f  */
    /* JADX WARN: Code duplicated, block: B:92:0x0117  */
    /* JADX WARN: Code duplicated, block: B:93:0x011a  */
    /* JADX WARN: Code duplicated, block: B:95:0x011f  */
    /* JADX WARN: Code duplicated, block: B:97:0x0125  */
    /* JADX WARN: Code duplicated, block: B:98:0x0128  */
    /* JADX INFO: renamed from: a */
    public static final void m2005a(String str, float f3, float f10, float f11, float f12, float f13, float f14, float f15, List<? extends AbstractC10003d> list, final InterfaceC2056p<? super InterfaceC0476a, ? super Integer, C9072e> interfaceC2056p, InterfaceC0476a interfaceC0476a, final int i10, final int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        float f16;
        int i16;
        int i17;
        float f17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        final String str2;
        float f18;
        float f19;
        float f20;
        float f21;
        float f22;
        List<? extends AbstractC10003d> list2;
        VectorComposeKt$Group$1 vectorComposeKt$Group$1;
        final float f23;
        final float f24;
        final float f25;
        final float f26;
        final float f27;
        final List<? extends AbstractC10003d> list3;
        final float f28;
        final float f29;
        C5332q0 c5332q0M1612T;
        C5207g.m11111f(interfaceC2056p, "content");
        ComposerImpl composerImplMo1636j = interfaceC0476a.mo1636j(-213417674);
        int i27 = i11 & 1;
        if (i27 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (composerImplMo1636j.mo1665y(str) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i28 = i11 & 2;
        if (i28 == 0) {
            if ((i10 & 112) == 0) {
                i12 |= composerImplMo1636j.m1592D(f3) ? 32 : 16;
            }
            i13 = i11 & 4;
            if (i13 != 0) {
                if ((i10 & 896) == 0) {
                    if (composerImplMo1636j.m1592D(f10)) {
                        i14 = 256;
                    } else {
                        i14 = BuildConfig.SDK_TRUNCATE_LENGTH;
                    }
                    i12 |= i14;
                }
                i15 = i11 & 8;
                if (i15 != 0) {
                    if ((i10 & 7168) == 0) {
                        f16 = f11;
                        if (composerImplMo1636j.m1592D(f16)) {
                            i16 = 2048;
                        } else {
                            i16 = 1024;
                        }
                        i12 |= i16;
                    }
                    i17 = i11 & 16;
                    if (i17 != 0) {
                        if ((57344 & i10) == 0) {
                            f17 = f12;
                            if (composerImplMo1636j.m1592D(f17)) {
                                i18 = 16384;
                            } else {
                                i18 = 8192;
                            }
                            i12 |= i18;
                        }
                        i19 = i11 & 32;
                        if (i19 != 0) {
                            i12 |= 196608;
                        } else if ((i10 & 458752) == 0) {
                            if (composerImplMo1636j.m1592D(f13)) {
                                i20 = 131072;
                            } else {
                                i20 = 65536;
                            }
                            i12 |= i20;
                        }
                        i21 = i11 & 64;
                        if (i21 != 0) {
                            i12 |= 1572864;
                        } else if ((i10 & 3670016) == 0) {
                            if (composerImplMo1636j.m1592D(f14)) {
                                i22 = 1048576;
                            } else {
                                i22 = 524288;
                            }
                            i12 |= i22;
                        }
                        i23 = i11 & BuildConfig.SDK_TRUNCATE_LENGTH;
                        if (i23 != 0) {
                            i12 |= 12582912;
                        } else if ((i10 & 29360128) == 0) {
                            if (composerImplMo1636j.m1592D(f15)) {
                                i24 = 8388608;
                            } else {
                                i24 = 4194304;
                            }
                            i12 |= i24;
                        }
                        i25 = i11 & 256;
                        if (i25 != 0) {
                            i12 |= 33554432;
                        }
                        if ((i11 & 512) != 0) {
                            if ((1879048192 & i10) == 0) {
                                if (composerImplMo1636j.m1600H(interfaceC2056p)) {
                                    i26 = 536870912;
                                } else {
                                    i26 = 268435456;
                                }
                            }
                            if (i25 != 256 && (1533916891 & i12) == 306783378 && composerImplMo1636j.mo1642m()) {
                                composerImplMo1636j.mo1650q();
                                str2 = str;
                                f28 = f3;
                                f23 = f10;
                                f25 = f13;
                                f26 = f14;
                                f24 = f15;
                                list3 = list;
                                f29 = f16;
                                f27 = f17;
                            } else {
                                composerImplMo1636j.m1654s0();
                                if ((i10 & 1) != 0 || composerImplMo1636j.m1616X()) {
                                    if (i27 != 0) {
                                        str2 = "";
                                    } else {
                                        str2 = str;
                                    }
                                    if (i28 != 0) {
                                        f18 = 0.0f;
                                    } else {
                                        f18 = f3;
                                    }
                                    if (i13 != 0) {
                                        f19 = 0.0f;
                                    } else {
                                        f19 = f10;
                                    }
                                    if (i15 != 0) {
                                        f16 = 0.0f;
                                    }
                                    if (i17 != 0) {
                                        f17 = 1.0f;
                                    }
                                    f20 = i19 == 0 ? f13 : 1.0f;
                                    if (i21 != 0) {
                                        f21 = 0.0f;
                                    } else {
                                        f21 = f14;
                                    }
                                    f22 = i23 == 0 ? f15 : 0.0f;
                                    if (i25 != 0) {
                                        list2 = C10009j.f50944a;
                                        i12 &= -234881025;
                                    }
                                    composerImplMo1636j.m1610R();
                                    InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q = ComposerKt.f3003a;
                                    vectorComposeKt$Group$1 = new InterfaceC2041a<C10001b>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$1
                                        @Override // cm.InterfaceC2041a
                                        /* JADX INFO: renamed from: E */
                                        public final C10001b mo807E() {
                                            return new C10001b();
                                        }
                                    };
                                    composerImplMo1636j.mo1622c(-548224868);
                                    if (composerImplMo1636j.f2910a instanceof C10006g) {
                                        C8573r0.m16771y0();
                                        throw null;
                                    }
                                    composerImplMo1636j.m1658u0();
                                    if (composerImplMo1636j.f2897L) {
                                        composerImplMo1636j.mo1634i(vectorComposeKt$Group$1);
                                    } else {
                                        composerImplMo1636j.mo1653s();
                                    }
                                    C8573r0.m16714a1(composerImplMo1636j, str2, new InterfaceC2056p<C10001b, String, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$1
                                        @Override // cm.InterfaceC2056p
                                        /* JADX INFO: renamed from: m0 */
                                        public final C9072e mo1337m0(C10001b c10001b, String str3) {
                                            C10001b c10001b2 = c10001b;
                                            String str4 = str3;
                                            C5207g.m11111f(c10001b2, "$this$set");
                                            C5207g.m11111f(str4, "it");
                                            c10001b2.f50825i = str4;
                                            c10001b2.m18593c();
                                            return C9072e.f47360a;
                                        }
                                    });
                                    C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f18), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$2
                                        @Override // cm.InterfaceC2056p
                                        /* JADX INFO: renamed from: m0 */
                                        public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                                            C10001b c10001b2 = c10001b;
                                            float fFloatValue = f30.floatValue();
                                            C5207g.m11111f(c10001b2, "$this$set");
                                            c10001b2.f50826j = fFloatValue;
                                            c10001b2.f50833q = true;
                                            c10001b2.m18593c();
                                            return C9072e.f47360a;
                                        }
                                    });
                                    C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f19), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$3
                                        @Override // cm.InterfaceC2056p
                                        /* JADX INFO: renamed from: m0 */
                                        public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                                            C10001b c10001b2 = c10001b;
                                            float fFloatValue = f30.floatValue();
                                            C5207g.m11111f(c10001b2, "$this$set");
                                            c10001b2.f50827k = fFloatValue;
                                            c10001b2.f50833q = true;
                                            c10001b2.m18593c();
                                            return C9072e.f47360a;
                                        }
                                    });
                                    C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f16), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$4
                                        @Override // cm.InterfaceC2056p
                                        /* JADX INFO: renamed from: m0 */
                                        public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                                            C10001b c10001b2 = c10001b;
                                            float fFloatValue = f30.floatValue();
                                            C5207g.m11111f(c10001b2, "$this$set");
                                            c10001b2.f50828l = fFloatValue;
                                            c10001b2.f50833q = true;
                                            c10001b2.m18593c();
                                            return C9072e.f47360a;
                                        }
                                    });
                                    C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f17), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$5
                                        @Override // cm.InterfaceC2056p
                                        /* JADX INFO: renamed from: m0 */
                                        public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                                            C10001b c10001b2 = c10001b;
                                            float fFloatValue = f30.floatValue();
                                            C5207g.m11111f(c10001b2, "$this$set");
                                            c10001b2.f50829m = fFloatValue;
                                            c10001b2.f50833q = true;
                                            c10001b2.m18593c();
                                            return C9072e.f47360a;
                                        }
                                    });
                                    C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f20), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$6
                                        @Override // cm.InterfaceC2056p
                                        /* JADX INFO: renamed from: m0 */
                                        public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                                            C10001b c10001b2 = c10001b;
                                            float fFloatValue = f30.floatValue();
                                            C5207g.m11111f(c10001b2, "$this$set");
                                            c10001b2.f50830n = fFloatValue;
                                            c10001b2.f50833q = true;
                                            c10001b2.m18593c();
                                            return C9072e.f47360a;
                                        }
                                    });
                                    C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f21), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$7
                                        @Override // cm.InterfaceC2056p
                                        /* JADX INFO: renamed from: m0 */
                                        public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                                            C10001b c10001b2 = c10001b;
                                            float fFloatValue = f30.floatValue();
                                            C5207g.m11111f(c10001b2, "$this$set");
                                            c10001b2.f50831o = fFloatValue;
                                            c10001b2.f50833q = true;
                                            c10001b2.m18593c();
                                            return C9072e.f47360a;
                                        }
                                    });
                                    C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f22), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$8
                                        @Override // cm.InterfaceC2056p
                                        /* JADX INFO: renamed from: m0 */
                                        public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                                            C10001b c10001b2 = c10001b;
                                            float fFloatValue = f30.floatValue();
                                            C5207g.m11111f(c10001b2, "$this$set");
                                            c10001b2.f50832p = fFloatValue;
                                            c10001b2.f50833q = true;
                                            c10001b2.m18593c();
                                            return C9072e.f47360a;
                                        }
                                    });
                                    C8573r0.m16714a1(composerImplMo1636j, list2, new InterfaceC2056p<C10001b, List<? extends AbstractC10003d>, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$9
                                        @Override // cm.InterfaceC2056p
                                        /* JADX INFO: renamed from: m0 */
                                        public final C9072e mo1337m0(C10001b c10001b, List<? extends AbstractC10003d> list4) {
                                            C10001b c10001b2 = c10001b;
                                            List<? extends AbstractC10003d> list5 = list4;
                                            C5207g.m11111f(c10001b2, "$this$set");
                                            C5207g.m11111f(list5, "it");
                                            c10001b2.f50820d = list5;
                                            c10001b2.f50821e = true;
                                            c10001b2.m18593c();
                                            return C9072e.f47360a;
                                        }
                                    });
                                    interfaceC2056p.mo1337m0(composerImplMo1636j, Integer.valueOf((i12 >> 27) & 14));
                                    composerImplMo1636j.m1609Q(true);
                                    composerImplMo1636j.m1609Q(false);
                                    f23 = f19;
                                    f24 = f22;
                                    f25 = f20;
                                    f26 = f21;
                                    f27 = f17;
                                    list3 = list2;
                                    f28 = f18;
                                    f29 = f16;
                                } else {
                                    composerImplMo1636j.mo1650q();
                                    if (i25 != 0) {
                                        i12 &= -234881025;
                                    }
                                    str2 = str;
                                    f18 = f3;
                                    f19 = f10;
                                    f20 = f13;
                                    f21 = f14;
                                    f22 = f15;
                                }
                                list2 = list;
                                composerImplMo1636j.m1610R();
                                InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q2 = ComposerKt.f3003a;
                                vectorComposeKt$Group$1 = new InterfaceC2041a<C10001b>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$1
                                    @Override // cm.InterfaceC2041a
                                    /* JADX INFO: renamed from: E */
                                    public final C10001b mo807E() {
                                        return new C10001b();
                                    }
                                };
                                composerImplMo1636j.mo1622c(-548224868);
                                if (composerImplMo1636j.f2910a instanceof C10006g) {
                                    C8573r0.m16771y0();
                                    throw null;
                                }
                                composerImplMo1636j.m1658u0();
                                if (composerImplMo1636j.f2897L) {
                                    composerImplMo1636j.mo1634i(vectorComposeKt$Group$1);
                                } else {
                                    composerImplMo1636j.mo1653s();
                                }
                                C8573r0.m16714a1(composerImplMo1636j, str2, new InterfaceC2056p<C10001b, String, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$1
                                    @Override // cm.InterfaceC2056p
                                    /* JADX INFO: renamed from: m0 */
                                    public final C9072e mo1337m0(C10001b c10001b, String str3) {
                                        C10001b c10001b2 = c10001b;
                                        String str4 = str3;
                                        C5207g.m11111f(c10001b2, "$this$set");
                                        C5207g.m11111f(str4, "it");
                                        c10001b2.f50825i = str4;
                                        c10001b2.m18593c();
                                        return C9072e.f47360a;
                                    }
                                });
                                C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f18), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$2
                                    @Override // cm.InterfaceC2056p
                                    /* JADX INFO: renamed from: m0 */
                                    public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                                        C10001b c10001b2 = c10001b;
                                        float fFloatValue = f30.floatValue();
                                        C5207g.m11111f(c10001b2, "$this$set");
                                        c10001b2.f50826j = fFloatValue;
                                        c10001b2.f50833q = true;
                                        c10001b2.m18593c();
                                        return C9072e.f47360a;
                                    }
                                });
                                C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f19), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$3
                                    @Override // cm.InterfaceC2056p
                                    /* JADX INFO: renamed from: m0 */
                                    public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                                        C10001b c10001b2 = c10001b;
                                        float fFloatValue = f30.floatValue();
                                        C5207g.m11111f(c10001b2, "$this$set");
                                        c10001b2.f50827k = fFloatValue;
                                        c10001b2.f50833q = true;
                                        c10001b2.m18593c();
                                        return C9072e.f47360a;
                                    }
                                });
                                C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f16), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$4
                                    @Override // cm.InterfaceC2056p
                                    /* JADX INFO: renamed from: m0 */
                                    public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                                        C10001b c10001b2 = c10001b;
                                        float fFloatValue = f30.floatValue();
                                        C5207g.m11111f(c10001b2, "$this$set");
                                        c10001b2.f50828l = fFloatValue;
                                        c10001b2.f50833q = true;
                                        c10001b2.m18593c();
                                        return C9072e.f47360a;
                                    }
                                });
                                C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f17), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$5
                                    @Override // cm.InterfaceC2056p
                                    /* JADX INFO: renamed from: m0 */
                                    public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                                        C10001b c10001b2 = c10001b;
                                        float fFloatValue = f30.floatValue();
                                        C5207g.m11111f(c10001b2, "$this$set");
                                        c10001b2.f50829m = fFloatValue;
                                        c10001b2.f50833q = true;
                                        c10001b2.m18593c();
                                        return C9072e.f47360a;
                                    }
                                });
                                C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f20), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$6
                                    @Override // cm.InterfaceC2056p
                                    /* JADX INFO: renamed from: m0 */
                                    public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                                        C10001b c10001b2 = c10001b;
                                        float fFloatValue = f30.floatValue();
                                        C5207g.m11111f(c10001b2, "$this$set");
                                        c10001b2.f50830n = fFloatValue;
                                        c10001b2.f50833q = true;
                                        c10001b2.m18593c();
                                        return C9072e.f47360a;
                                    }
                                });
                                C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f21), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$7
                                    @Override // cm.InterfaceC2056p
                                    /* JADX INFO: renamed from: m0 */
                                    public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                                        C10001b c10001b2 = c10001b;
                                        float fFloatValue = f30.floatValue();
                                        C5207g.m11111f(c10001b2, "$this$set");
                                        c10001b2.f50831o = fFloatValue;
                                        c10001b2.f50833q = true;
                                        c10001b2.m18593c();
                                        return C9072e.f47360a;
                                    }
                                });
                                C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f22), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$8
                                    @Override // cm.InterfaceC2056p
                                    /* JADX INFO: renamed from: m0 */
                                    public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                                        C10001b c10001b2 = c10001b;
                                        float fFloatValue = f30.floatValue();
                                        C5207g.m11111f(c10001b2, "$this$set");
                                        c10001b2.f50832p = fFloatValue;
                                        c10001b2.f50833q = true;
                                        c10001b2.m18593c();
                                        return C9072e.f47360a;
                                    }
                                });
                                C8573r0.m16714a1(composerImplMo1636j, list2, new InterfaceC2056p<C10001b, List<? extends AbstractC10003d>, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$9
                                    @Override // cm.InterfaceC2056p
                                    /* JADX INFO: renamed from: m0 */
                                    public final C9072e mo1337m0(C10001b c10001b, List<? extends AbstractC10003d> list4) {
                                        C10001b c10001b2 = c10001b;
                                        List<? extends AbstractC10003d> list5 = list4;
                                        C5207g.m11111f(c10001b2, "$this$set");
                                        C5207g.m11111f(list5, "it");
                                        c10001b2.f50820d = list5;
                                        c10001b2.f50821e = true;
                                        c10001b2.m18593c();
                                        return C9072e.f47360a;
                                    }
                                });
                                interfaceC2056p.mo1337m0(composerImplMo1636j, Integer.valueOf((i12 >> 27) & 14));
                                composerImplMo1636j.m1609Q(true);
                                composerImplMo1636j.m1609Q(false);
                                f23 = f19;
                                f24 = f22;
                                f25 = f20;
                                f26 = f21;
                                f27 = f17;
                                list3 = list2;
                                f28 = f18;
                                f29 = f16;
                            }
                            c5332q0M1612T = composerImplMo1636j.m1612T();
                            if (c5332q0M1612T == null) {
                                return;
                            }
                            c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$4
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // cm.InterfaceC2056p
                                /* JADX INFO: renamed from: m0 */
                                public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                                    num.intValue();
                                    VectorComposeKt.m2005a(str2, f28, f23, f29, f27, f25, f26, f24, list3, interfaceC2056p, interfaceC0476a2, C8573r0.m16737l1(i10 | 1), i11);
                                    return C9072e.f47360a;
                                }
                            };
                        }
                        i26 = 805306368;
                        i12 |= i26;
                        if (i25 != 256) {
                            composerImplMo1636j.m1654s0();
                            if ((i10 & 1) != 0) {
                                if (i27 != 0) {
                                    str2 = "";
                                } else {
                                    str2 = str;
                                }
                                if (i28 != 0) {
                                    f18 = 0.0f;
                                } else {
                                    f18 = f3;
                                }
                                if (i13 != 0) {
                                    f19 = 0.0f;
                                } else {
                                    f19 = f10;
                                }
                                if (i15 != 0) {
                                    f16 = 0.0f;
                                }
                                if (i17 != 0) {
                                    f17 = 1.0f;
                                }
                                if (i19 == 0) {
                                }
                                if (i21 != 0) {
                                    f21 = 0.0f;
                                } else {
                                    f21 = f14;
                                }
                                if (i23 == 0) {
                                }
                                if (i25 != 0) {
                                    list2 = C10009j.f50944a;
                                    i12 &= -234881025;
                                } else {
                                    list2 = list;
                                }
                            } else {
                                if (i27 != 0) {
                                    str2 = "";
                                } else {
                                    str2 = str;
                                }
                                if (i28 != 0) {
                                    f18 = 0.0f;
                                } else {
                                    f18 = f3;
                                }
                                if (i13 != 0) {
                                    f19 = 0.0f;
                                } else {
                                    f19 = f10;
                                }
                                if (i15 != 0) {
                                    f16 = 0.0f;
                                }
                                if (i17 != 0) {
                                    f17 = 1.0f;
                                }
                                if (i19 == 0) {
                                }
                                if (i21 != 0) {
                                    f21 = 0.0f;
                                } else {
                                    f21 = f14;
                                }
                                if (i23 == 0) {
                                }
                                if (i25 != 0) {
                                    list2 = C10009j.f50944a;
                                    i12 &= -234881025;
                                } else {
                                    list2 = list;
                                }
                            }
                            composerImplMo1636j.m1610R();
                            InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q3 = ComposerKt.f3003a;
                            vectorComposeKt$Group$1 = new InterfaceC2041a<C10001b>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$1
                                @Override // cm.InterfaceC2041a
                                /* JADX INFO: renamed from: E */
                                public final C10001b mo807E() {
                                    return new C10001b();
                                }
                            };
                            composerImplMo1636j.mo1622c(-548224868);
                            if (composerImplMo1636j.f2910a instanceof C10006g) {
                                C8573r0.m16771y0();
                                throw null;
                            }
                            composerImplMo1636j.m1658u0();
                            if (composerImplMo1636j.f2897L) {
                                composerImplMo1636j.mo1634i(vectorComposeKt$Group$1);
                            } else {
                                composerImplMo1636j.mo1653s();
                            }
                            C8573r0.m16714a1(composerImplMo1636j, str2, new InterfaceC2056p<C10001b, String, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$1
                                @Override // cm.InterfaceC2056p
                                /* JADX INFO: renamed from: m0 */
                                public final C9072e mo1337m0(C10001b c10001b, String str3) {
                                    C10001b c10001b2 = c10001b;
                                    String str4 = str3;
                                    C5207g.m11111f(c10001b2, "$this$set");
                                    C5207g.m11111f(str4, "it");
                                    c10001b2.f50825i = str4;
                                    c10001b2.m18593c();
                                    return C9072e.f47360a;
                                }
                            });
                            C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f18), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$2
                                @Override // cm.InterfaceC2056p
                                /* JADX INFO: renamed from: m0 */
                                public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                                    C10001b c10001b2 = c10001b;
                                    float fFloatValue = f30.floatValue();
                                    C5207g.m11111f(c10001b2, "$this$set");
                                    c10001b2.f50826j = fFloatValue;
                                    c10001b2.f50833q = true;
                                    c10001b2.m18593c();
                                    return C9072e.f47360a;
                                }
                            });
                            C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f19), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$3
                                @Override // cm.InterfaceC2056p
                                /* JADX INFO: renamed from: m0 */
                                public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                                    C10001b c10001b2 = c10001b;
                                    float fFloatValue = f30.floatValue();
                                    C5207g.m11111f(c10001b2, "$this$set");
                                    c10001b2.f50827k = fFloatValue;
                                    c10001b2.f50833q = true;
                                    c10001b2.m18593c();
                                    return C9072e.f47360a;
                                }
                            });
                            C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f16), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$4
                                @Override // cm.InterfaceC2056p
                                /* JADX INFO: renamed from: m0 */
                                public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                                    C10001b c10001b2 = c10001b;
                                    float fFloatValue = f30.floatValue();
                                    C5207g.m11111f(c10001b2, "$this$set");
                                    c10001b2.f50828l = fFloatValue;
                                    c10001b2.f50833q = true;
                                    c10001b2.m18593c();
                                    return C9072e.f47360a;
                                }
                            });
                            C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f17), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$5
                                @Override // cm.InterfaceC2056p
                                /* JADX INFO: renamed from: m0 */
                                public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                                    C10001b c10001b2 = c10001b;
                                    float fFloatValue = f30.floatValue();
                                    C5207g.m11111f(c10001b2, "$this$set");
                                    c10001b2.f50829m = fFloatValue;
                                    c10001b2.f50833q = true;
                                    c10001b2.m18593c();
                                    return C9072e.f47360a;
                                }
                            });
                            C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f20), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$6
                                @Override // cm.InterfaceC2056p
                                /* JADX INFO: renamed from: m0 */
                                public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                                    C10001b c10001b2 = c10001b;
                                    float fFloatValue = f30.floatValue();
                                    C5207g.m11111f(c10001b2, "$this$set");
                                    c10001b2.f50830n = fFloatValue;
                                    c10001b2.f50833q = true;
                                    c10001b2.m18593c();
                                    return C9072e.f47360a;
                                }
                            });
                            C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f21), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$7
                                @Override // cm.InterfaceC2056p
                                /* JADX INFO: renamed from: m0 */
                                public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                                    C10001b c10001b2 = c10001b;
                                    float fFloatValue = f30.floatValue();
                                    C5207g.m11111f(c10001b2, "$this$set");
                                    c10001b2.f50831o = fFloatValue;
                                    c10001b2.f50833q = true;
                                    c10001b2.m18593c();
                                    return C9072e.f47360a;
                                }
                            });
                            C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f22), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$8
                                @Override // cm.InterfaceC2056p
                                /* JADX INFO: renamed from: m0 */
                                public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                                    C10001b c10001b2 = c10001b;
                                    float fFloatValue = f30.floatValue();
                                    C5207g.m11111f(c10001b2, "$this$set");
                                    c10001b2.f50832p = fFloatValue;
                                    c10001b2.f50833q = true;
                                    c10001b2.m18593c();
                                    return C9072e.f47360a;
                                }
                            });
                            C8573r0.m16714a1(composerImplMo1636j, list2, new InterfaceC2056p<C10001b, List<? extends AbstractC10003d>, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$9
                                @Override // cm.InterfaceC2056p
                                /* JADX INFO: renamed from: m0 */
                                public final C9072e mo1337m0(C10001b c10001b, List<? extends AbstractC10003d> list4) {
                                    C10001b c10001b2 = c10001b;
                                    List<? extends AbstractC10003d> list5 = list4;
                                    C5207g.m11111f(c10001b2, "$this$set");
                                    C5207g.m11111f(list5, "it");
                                    c10001b2.f50820d = list5;
                                    c10001b2.f50821e = true;
                                    c10001b2.m18593c();
                                    return C9072e.f47360a;
                                }
                            });
                            interfaceC2056p.mo1337m0(composerImplMo1636j, Integer.valueOf((i12 >> 27) & 14));
                            composerImplMo1636j.m1609Q(true);
                            composerImplMo1636j.m1609Q(false);
                            f23 = f19;
                            f24 = f22;
                            f25 = f20;
                            f26 = f21;
                            f27 = f17;
                            list3 = list2;
                            f28 = f18;
                            f29 = f16;
                        } else {
                            composerImplMo1636j.m1654s0();
                            if ((i10 & 1) != 0) {
                                if (i27 != 0) {
                                    str2 = "";
                                } else {
                                    str2 = str;
                                }
                                if (i28 != 0) {
                                    f18 = 0.0f;
                                } else {
                                    f18 = f3;
                                }
                                if (i13 != 0) {
                                    f19 = 0.0f;
                                } else {
                                    f19 = f10;
                                }
                                if (i15 != 0) {
                                    f16 = 0.0f;
                                }
                                if (i17 != 0) {
                                    f17 = 1.0f;
                                }
                                if (i19 == 0) {
                                }
                                if (i21 != 0) {
                                    f21 = 0.0f;
                                } else {
                                    f21 = f14;
                                }
                                if (i23 == 0) {
                                }
                                if (i25 != 0) {
                                    list2 = C10009j.f50944a;
                                    i12 &= -234881025;
                                } else {
                                    list2 = list;
                                }
                            } else {
                                if (i27 != 0) {
                                    str2 = "";
                                } else {
                                    str2 = str;
                                }
                                if (i28 != 0) {
                                    f18 = 0.0f;
                                } else {
                                    f18 = f3;
                                }
                                if (i13 != 0) {
                                    f19 = 0.0f;
                                } else {
                                    f19 = f10;
                                }
                                if (i15 != 0) {
                                    f16 = 0.0f;
                                }
                                if (i17 != 0) {
                                    f17 = 1.0f;
                                }
                                if (i19 == 0) {
                                }
                                if (i21 != 0) {
                                    f21 = 0.0f;
                                } else {
                                    f21 = f14;
                                }
                                if (i23 == 0) {
                                }
                                if (i25 != 0) {
                                    list2 = C10009j.f50944a;
                                    i12 &= -234881025;
                                } else {
                                    list2 = list;
                                }
                            }
                            composerImplMo1636j.m1610R();
                            InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q4 = ComposerKt.f3003a;
                            vectorComposeKt$Group$1 = new InterfaceC2041a<C10001b>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$1
                                @Override // cm.InterfaceC2041a
                                /* JADX INFO: renamed from: E */
                                public final C10001b mo807E() {
                                    return new C10001b();
                                }
                            };
                            composerImplMo1636j.mo1622c(-548224868);
                            if (composerImplMo1636j.f2910a instanceof C10006g) {
                                C8573r0.m16771y0();
                                throw null;
                            }
                            composerImplMo1636j.m1658u0();
                            if (composerImplMo1636j.f2897L) {
                                composerImplMo1636j.mo1634i(vectorComposeKt$Group$1);
                            } else {
                                composerImplMo1636j.mo1653s();
                            }
                            C8573r0.m16714a1(composerImplMo1636j, str2, new InterfaceC2056p<C10001b, String, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$1
                                @Override // cm.InterfaceC2056p
                                /* JADX INFO: renamed from: m0 */
                                public final C9072e mo1337m0(C10001b c10001b, String str3) {
                                    C10001b c10001b2 = c10001b;
                                    String str4 = str3;
                                    C5207g.m11111f(c10001b2, "$this$set");
                                    C5207g.m11111f(str4, "it");
                                    c10001b2.f50825i = str4;
                                    c10001b2.m18593c();
                                    return C9072e.f47360a;
                                }
                            });
                            C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f18), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$2
                                @Override // cm.InterfaceC2056p
                                /* JADX INFO: renamed from: m0 */
                                public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                                    C10001b c10001b2 = c10001b;
                                    float fFloatValue = f30.floatValue();
                                    C5207g.m11111f(c10001b2, "$this$set");
                                    c10001b2.f50826j = fFloatValue;
                                    c10001b2.f50833q = true;
                                    c10001b2.m18593c();
                                    return C9072e.f47360a;
                                }
                            });
                            C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f19), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$3
                                @Override // cm.InterfaceC2056p
                                /* JADX INFO: renamed from: m0 */
                                public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                                    C10001b c10001b2 = c10001b;
                                    float fFloatValue = f30.floatValue();
                                    C5207g.m11111f(c10001b2, "$this$set");
                                    c10001b2.f50827k = fFloatValue;
                                    c10001b2.f50833q = true;
                                    c10001b2.m18593c();
                                    return C9072e.f47360a;
                                }
                            });
                            C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f16), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$4
                                @Override // cm.InterfaceC2056p
                                /* JADX INFO: renamed from: m0 */
                                public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                                    C10001b c10001b2 = c10001b;
                                    float fFloatValue = f30.floatValue();
                                    C5207g.m11111f(c10001b2, "$this$set");
                                    c10001b2.f50828l = fFloatValue;
                                    c10001b2.f50833q = true;
                                    c10001b2.m18593c();
                                    return C9072e.f47360a;
                                }
                            });
                            C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f17), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$5
                                @Override // cm.InterfaceC2056p
                                /* JADX INFO: renamed from: m0 */
                                public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                                    C10001b c10001b2 = c10001b;
                                    float fFloatValue = f30.floatValue();
                                    C5207g.m11111f(c10001b2, "$this$set");
                                    c10001b2.f50829m = fFloatValue;
                                    c10001b2.f50833q = true;
                                    c10001b2.m18593c();
                                    return C9072e.f47360a;
                                }
                            });
                            C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f20), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$6
                                @Override // cm.InterfaceC2056p
                                /* JADX INFO: renamed from: m0 */
                                public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                                    C10001b c10001b2 = c10001b;
                                    float fFloatValue = f30.floatValue();
                                    C5207g.m11111f(c10001b2, "$this$set");
                                    c10001b2.f50830n = fFloatValue;
                                    c10001b2.f50833q = true;
                                    c10001b2.m18593c();
                                    return C9072e.f47360a;
                                }
                            });
                            C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f21), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$7
                                @Override // cm.InterfaceC2056p
                                /* JADX INFO: renamed from: m0 */
                                public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                                    C10001b c10001b2 = c10001b;
                                    float fFloatValue = f30.floatValue();
                                    C5207g.m11111f(c10001b2, "$this$set");
                                    c10001b2.f50831o = fFloatValue;
                                    c10001b2.f50833q = true;
                                    c10001b2.m18593c();
                                    return C9072e.f47360a;
                                }
                            });
                            C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f22), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$8
                                @Override // cm.InterfaceC2056p
                                /* JADX INFO: renamed from: m0 */
                                public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                                    C10001b c10001b2 = c10001b;
                                    float fFloatValue = f30.floatValue();
                                    C5207g.m11111f(c10001b2, "$this$set");
                                    c10001b2.f50832p = fFloatValue;
                                    c10001b2.f50833q = true;
                                    c10001b2.m18593c();
                                    return C9072e.f47360a;
                                }
                            });
                            C8573r0.m16714a1(composerImplMo1636j, list2, new InterfaceC2056p<C10001b, List<? extends AbstractC10003d>, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$9
                                @Override // cm.InterfaceC2056p
                                /* JADX INFO: renamed from: m0 */
                                public final C9072e mo1337m0(C10001b c10001b, List<? extends AbstractC10003d> list4) {
                                    C10001b c10001b2 = c10001b;
                                    List<? extends AbstractC10003d> list5 = list4;
                                    C5207g.m11111f(c10001b2, "$this$set");
                                    C5207g.m11111f(list5, "it");
                                    c10001b2.f50820d = list5;
                                    c10001b2.f50821e = true;
                                    c10001b2.m18593c();
                                    return C9072e.f47360a;
                                }
                            });
                            interfaceC2056p.mo1337m0(composerImplMo1636j, Integer.valueOf((i12 >> 27) & 14));
                            composerImplMo1636j.m1609Q(true);
                            composerImplMo1636j.m1609Q(false);
                            f23 = f19;
                            f24 = f22;
                            f25 = f20;
                            f26 = f21;
                            f27 = f17;
                            list3 = list2;
                            f28 = f18;
                            f29 = f16;
                        }
                        c5332q0M1612T = composerImplMo1636j.m1612T();
                        if (c5332q0M1612T == null) {
                            return;
                        }
                        c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$4
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                                num.intValue();
                                VectorComposeKt.m2005a(str2, f28, f23, f29, f27, f25, f26, f24, list3, interfaceC2056p, interfaceC0476a2, C8573r0.m16737l1(i10 | 1), i11);
                                return C9072e.f47360a;
                            }
                        };
                    }
                    i12 |= 24576;
                    f17 = f12;
                    i19 = i11 & 32;
                    if (i19 != 0) {
                        i12 |= 196608;
                    } else if ((i10 & 458752) == 0) {
                        if (composerImplMo1636j.m1592D(f13)) {
                            i20 = 131072;
                        } else {
                            i20 = 65536;
                        }
                        i12 |= i20;
                    }
                    i21 = i11 & 64;
                    if (i21 != 0) {
                        i12 |= 1572864;
                    } else if ((i10 & 3670016) == 0) {
                        if (composerImplMo1636j.m1592D(f14)) {
                            i22 = 1048576;
                        } else {
                            i22 = 524288;
                        }
                        i12 |= i22;
                    }
                    i23 = i11 & BuildConfig.SDK_TRUNCATE_LENGTH;
                    if (i23 != 0) {
                        i12 |= 12582912;
                    } else if ((i10 & 29360128) == 0) {
                        if (composerImplMo1636j.m1592D(f15)) {
                            i24 = 8388608;
                        } else {
                            i24 = 4194304;
                        }
                        i12 |= i24;
                    }
                    i25 = i11 & 256;
                    if (i25 != 0) {
                        i12 |= 33554432;
                    }
                    if ((i11 & 512) != 0) {
                        if ((1879048192 & i10) == 0) {
                            if (composerImplMo1636j.m1600H(interfaceC2056p)) {
                                i26 = 536870912;
                            } else {
                                i26 = 268435456;
                            }
                        }
                        if (i25 != 256) {
                            composerImplMo1636j.m1654s0();
                            if ((i10 & 1) != 0) {
                                if (i27 != 0) {
                                    str2 = "";
                                } else {
                                    str2 = str;
                                }
                                if (i28 != 0) {
                                    f18 = 0.0f;
                                } else {
                                    f18 = f3;
                                }
                                if (i13 != 0) {
                                    f19 = 0.0f;
                                } else {
                                    f19 = f10;
                                }
                                if (i15 != 0) {
                                    f16 = 0.0f;
                                }
                                if (i17 != 0) {
                                    f17 = 1.0f;
                                }
                                if (i19 == 0) {
                                }
                                if (i21 != 0) {
                                    f21 = 0.0f;
                                } else {
                                    f21 = f14;
                                }
                                if (i23 == 0) {
                                }
                                if (i25 != 0) {
                                    list2 = C10009j.f50944a;
                                    i12 &= -234881025;
                                } else {
                                    list2 = list;
                                }
                            } else {
                                if (i27 != 0) {
                                    str2 = "";
                                } else {
                                    str2 = str;
                                }
                                if (i28 != 0) {
                                    f18 = 0.0f;
                                } else {
                                    f18 = f3;
                                }
                                if (i13 != 0) {
                                    f19 = 0.0f;
                                } else {
                                    f19 = f10;
                                }
                                if (i15 != 0) {
                                    f16 = 0.0f;
                                }
                                if (i17 != 0) {
                                    f17 = 1.0f;
                                }
                                if (i19 == 0) {
                                }
                                if (i21 != 0) {
                                    f21 = 0.0f;
                                } else {
                                    f21 = f14;
                                }
                                if (i23 == 0) {
                                }
                                if (i25 != 0) {
                                    list2 = C10009j.f50944a;
                                    i12 &= -234881025;
                                } else {
                                    list2 = list;
                                }
                            }
                            composerImplMo1636j.m1610R();
                            InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q5 = ComposerKt.f3003a;
                            vectorComposeKt$Group$1 = new InterfaceC2041a<C10001b>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$1
                                @Override // cm.InterfaceC2041a
                                /* JADX INFO: renamed from: E */
                                public final C10001b mo807E() {
                                    return new C10001b();
                                }
                            };
                            composerImplMo1636j.mo1622c(-548224868);
                            if (composerImplMo1636j.f2910a instanceof C10006g) {
                                C8573r0.m16771y0();
                                throw null;
                            }
                            composerImplMo1636j.m1658u0();
                            if (composerImplMo1636j.f2897L) {
                                composerImplMo1636j.mo1634i(vectorComposeKt$Group$1);
                            } else {
                                composerImplMo1636j.mo1653s();
                            }
                            C8573r0.m16714a1(composerImplMo1636j, str2, new InterfaceC2056p<C10001b, String, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$1
                                @Override // cm.InterfaceC2056p
                                /* JADX INFO: renamed from: m0 */
                                public final C9072e mo1337m0(C10001b c10001b, String str3) {
                                    C10001b c10001b2 = c10001b;
                                    String str4 = str3;
                                    C5207g.m11111f(c10001b2, "$this$set");
                                    C5207g.m11111f(str4, "it");
                                    c10001b2.f50825i = str4;
                                    c10001b2.m18593c();
                                    return C9072e.f47360a;
                                }
                            });
                            C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f18), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$2
                                @Override // cm.InterfaceC2056p
                                /* JADX INFO: renamed from: m0 */
                                public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                                    C10001b c10001b2 = c10001b;
                                    float fFloatValue = f30.floatValue();
                                    C5207g.m11111f(c10001b2, "$this$set");
                                    c10001b2.f50826j = fFloatValue;
                                    c10001b2.f50833q = true;
                                    c10001b2.m18593c();
                                    return C9072e.f47360a;
                                }
                            });
                            C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f19), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$3
                                @Override // cm.InterfaceC2056p
                                /* JADX INFO: renamed from: m0 */
                                public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                                    C10001b c10001b2 = c10001b;
                                    float fFloatValue = f30.floatValue();
                                    C5207g.m11111f(c10001b2, "$this$set");
                                    c10001b2.f50827k = fFloatValue;
                                    c10001b2.f50833q = true;
                                    c10001b2.m18593c();
                                    return C9072e.f47360a;
                                }
                            });
                            C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f16), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$4
                                @Override // cm.InterfaceC2056p
                                /* JADX INFO: renamed from: m0 */
                                public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                                    C10001b c10001b2 = c10001b;
                                    float fFloatValue = f30.floatValue();
                                    C5207g.m11111f(c10001b2, "$this$set");
                                    c10001b2.f50828l = fFloatValue;
                                    c10001b2.f50833q = true;
                                    c10001b2.m18593c();
                                    return C9072e.f47360a;
                                }
                            });
                            C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f17), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$5
                                @Override // cm.InterfaceC2056p
                                /* JADX INFO: renamed from: m0 */
                                public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                                    C10001b c10001b2 = c10001b;
                                    float fFloatValue = f30.floatValue();
                                    C5207g.m11111f(c10001b2, "$this$set");
                                    c10001b2.f50829m = fFloatValue;
                                    c10001b2.f50833q = true;
                                    c10001b2.m18593c();
                                    return C9072e.f47360a;
                                }
                            });
                            C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f20), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$6
                                @Override // cm.InterfaceC2056p
                                /* JADX INFO: renamed from: m0 */
                                public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                                    C10001b c10001b2 = c10001b;
                                    float fFloatValue = f30.floatValue();
                                    C5207g.m11111f(c10001b2, "$this$set");
                                    c10001b2.f50830n = fFloatValue;
                                    c10001b2.f50833q = true;
                                    c10001b2.m18593c();
                                    return C9072e.f47360a;
                                }
                            });
                            C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f21), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$7
                                @Override // cm.InterfaceC2056p
                                /* JADX INFO: renamed from: m0 */
                                public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                                    C10001b c10001b2 = c10001b;
                                    float fFloatValue = f30.floatValue();
                                    C5207g.m11111f(c10001b2, "$this$set");
                                    c10001b2.f50831o = fFloatValue;
                                    c10001b2.f50833q = true;
                                    c10001b2.m18593c();
                                    return C9072e.f47360a;
                                }
                            });
                            C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f22), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$8
                                @Override // cm.InterfaceC2056p
                                /* JADX INFO: renamed from: m0 */
                                public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                                    C10001b c10001b2 = c10001b;
                                    float fFloatValue = f30.floatValue();
                                    C5207g.m11111f(c10001b2, "$this$set");
                                    c10001b2.f50832p = fFloatValue;
                                    c10001b2.f50833q = true;
                                    c10001b2.m18593c();
                                    return C9072e.f47360a;
                                }
                            });
                            C8573r0.m16714a1(composerImplMo1636j, list2, new InterfaceC2056p<C10001b, List<? extends AbstractC10003d>, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$9
                                @Override // cm.InterfaceC2056p
                                /* JADX INFO: renamed from: m0 */
                                public final C9072e mo1337m0(C10001b c10001b, List<? extends AbstractC10003d> list4) {
                                    C10001b c10001b2 = c10001b;
                                    List<? extends AbstractC10003d> list5 = list4;
                                    C5207g.m11111f(c10001b2, "$this$set");
                                    C5207g.m11111f(list5, "it");
                                    c10001b2.f50820d = list5;
                                    c10001b2.f50821e = true;
                                    c10001b2.m18593c();
                                    return C9072e.f47360a;
                                }
                            });
                            interfaceC2056p.mo1337m0(composerImplMo1636j, Integer.valueOf((i12 >> 27) & 14));
                            composerImplMo1636j.m1609Q(true);
                            composerImplMo1636j.m1609Q(false);
                            f23 = f19;
                            f24 = f22;
                            f25 = f20;
                            f26 = f21;
                            f27 = f17;
                            list3 = list2;
                            f28 = f18;
                            f29 = f16;
                        } else {
                            composerImplMo1636j.m1654s0();
                            if ((i10 & 1) != 0) {
                                if (i27 != 0) {
                                    str2 = "";
                                } else {
                                    str2 = str;
                                }
                                if (i28 != 0) {
                                    f18 = 0.0f;
                                } else {
                                    f18 = f3;
                                }
                                if (i13 != 0) {
                                    f19 = 0.0f;
                                } else {
                                    f19 = f10;
                                }
                                if (i15 != 0) {
                                    f16 = 0.0f;
                                }
                                if (i17 != 0) {
                                    f17 = 1.0f;
                                }
                                if (i19 == 0) {
                                }
                                if (i21 != 0) {
                                    f21 = 0.0f;
                                } else {
                                    f21 = f14;
                                }
                                if (i23 == 0) {
                                }
                                if (i25 != 0) {
                                    list2 = C10009j.f50944a;
                                    i12 &= -234881025;
                                } else {
                                    list2 = list;
                                }
                            } else {
                                if (i27 != 0) {
                                    str2 = "";
                                } else {
                                    str2 = str;
                                }
                                if (i28 != 0) {
                                    f18 = 0.0f;
                                } else {
                                    f18 = f3;
                                }
                                if (i13 != 0) {
                                    f19 = 0.0f;
                                } else {
                                    f19 = f10;
                                }
                                if (i15 != 0) {
                                    f16 = 0.0f;
                                }
                                if (i17 != 0) {
                                    f17 = 1.0f;
                                }
                                if (i19 == 0) {
                                }
                                if (i21 != 0) {
                                    f21 = 0.0f;
                                } else {
                                    f21 = f14;
                                }
                                if (i23 == 0) {
                                }
                                if (i25 != 0) {
                                    list2 = C10009j.f50944a;
                                    i12 &= -234881025;
                                } else {
                                    list2 = list;
                                }
                            }
                            composerImplMo1636j.m1610R();
                            InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q6 = ComposerKt.f3003a;
                            vectorComposeKt$Group$1 = new InterfaceC2041a<C10001b>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$1
                                @Override // cm.InterfaceC2041a
                                /* JADX INFO: renamed from: E */
                                public final C10001b mo807E() {
                                    return new C10001b();
                                }
                            };
                            composerImplMo1636j.mo1622c(-548224868);
                            if (composerImplMo1636j.f2910a instanceof C10006g) {
                                C8573r0.m16771y0();
                                throw null;
                            }
                            composerImplMo1636j.m1658u0();
                            if (composerImplMo1636j.f2897L) {
                                composerImplMo1636j.mo1634i(vectorComposeKt$Group$1);
                            } else {
                                composerImplMo1636j.mo1653s();
                            }
                            C8573r0.m16714a1(composerImplMo1636j, str2, new InterfaceC2056p<C10001b, String, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$1
                                @Override // cm.InterfaceC2056p
                                /* JADX INFO: renamed from: m0 */
                                public final C9072e mo1337m0(C10001b c10001b, String str3) {
                                    C10001b c10001b2 = c10001b;
                                    String str4 = str3;
                                    C5207g.m11111f(c10001b2, "$this$set");
                                    C5207g.m11111f(str4, "it");
                                    c10001b2.f50825i = str4;
                                    c10001b2.m18593c();
                                    return C9072e.f47360a;
                                }
                            });
                            C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f18), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$2
                                @Override // cm.InterfaceC2056p
                                /* JADX INFO: renamed from: m0 */
                                public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                                    C10001b c10001b2 = c10001b;
                                    float fFloatValue = f30.floatValue();
                                    C5207g.m11111f(c10001b2, "$this$set");
                                    c10001b2.f50826j = fFloatValue;
                                    c10001b2.f50833q = true;
                                    c10001b2.m18593c();
                                    return C9072e.f47360a;
                                }
                            });
                            C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f19), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$3
                                @Override // cm.InterfaceC2056p
                                /* JADX INFO: renamed from: m0 */
                                public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                                    C10001b c10001b2 = c10001b;
                                    float fFloatValue = f30.floatValue();
                                    C5207g.m11111f(c10001b2, "$this$set");
                                    c10001b2.f50827k = fFloatValue;
                                    c10001b2.f50833q = true;
                                    c10001b2.m18593c();
                                    return C9072e.f47360a;
                                }
                            });
                            C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f16), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$4
                                @Override // cm.InterfaceC2056p
                                /* JADX INFO: renamed from: m0 */
                                public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                                    C10001b c10001b2 = c10001b;
                                    float fFloatValue = f30.floatValue();
                                    C5207g.m11111f(c10001b2, "$this$set");
                                    c10001b2.f50828l = fFloatValue;
                                    c10001b2.f50833q = true;
                                    c10001b2.m18593c();
                                    return C9072e.f47360a;
                                }
                            });
                            C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f17), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$5
                                @Override // cm.InterfaceC2056p
                                /* JADX INFO: renamed from: m0 */
                                public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                                    C10001b c10001b2 = c10001b;
                                    float fFloatValue = f30.floatValue();
                                    C5207g.m11111f(c10001b2, "$this$set");
                                    c10001b2.f50829m = fFloatValue;
                                    c10001b2.f50833q = true;
                                    c10001b2.m18593c();
                                    return C9072e.f47360a;
                                }
                            });
                            C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f20), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$6
                                @Override // cm.InterfaceC2056p
                                /* JADX INFO: renamed from: m0 */
                                public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                                    C10001b c10001b2 = c10001b;
                                    float fFloatValue = f30.floatValue();
                                    C5207g.m11111f(c10001b2, "$this$set");
                                    c10001b2.f50830n = fFloatValue;
                                    c10001b2.f50833q = true;
                                    c10001b2.m18593c();
                                    return C9072e.f47360a;
                                }
                            });
                            C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f21), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$7
                                @Override // cm.InterfaceC2056p
                                /* JADX INFO: renamed from: m0 */
                                public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                                    C10001b c10001b2 = c10001b;
                                    float fFloatValue = f30.floatValue();
                                    C5207g.m11111f(c10001b2, "$this$set");
                                    c10001b2.f50831o = fFloatValue;
                                    c10001b2.f50833q = true;
                                    c10001b2.m18593c();
                                    return C9072e.f47360a;
                                }
                            });
                            C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f22), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$8
                                @Override // cm.InterfaceC2056p
                                /* JADX INFO: renamed from: m0 */
                                public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                                    C10001b c10001b2 = c10001b;
                                    float fFloatValue = f30.floatValue();
                                    C5207g.m11111f(c10001b2, "$this$set");
                                    c10001b2.f50832p = fFloatValue;
                                    c10001b2.f50833q = true;
                                    c10001b2.m18593c();
                                    return C9072e.f47360a;
                                }
                            });
                            C8573r0.m16714a1(composerImplMo1636j, list2, new InterfaceC2056p<C10001b, List<? extends AbstractC10003d>, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$9
                                @Override // cm.InterfaceC2056p
                                /* JADX INFO: renamed from: m0 */
                                public final C9072e mo1337m0(C10001b c10001b, List<? extends AbstractC10003d> list4) {
                                    C10001b c10001b2 = c10001b;
                                    List<? extends AbstractC10003d> list5 = list4;
                                    C5207g.m11111f(c10001b2, "$this$set");
                                    C5207g.m11111f(list5, "it");
                                    c10001b2.f50820d = list5;
                                    c10001b2.f50821e = true;
                                    c10001b2.m18593c();
                                    return C9072e.f47360a;
                                }
                            });
                            interfaceC2056p.mo1337m0(composerImplMo1636j, Integer.valueOf((i12 >> 27) & 14));
                            composerImplMo1636j.m1609Q(true);
                            composerImplMo1636j.m1609Q(false);
                            f23 = f19;
                            f24 = f22;
                            f25 = f20;
                            f26 = f21;
                            f27 = f17;
                            list3 = list2;
                            f28 = f18;
                            f29 = f16;
                        }
                        c5332q0M1612T = composerImplMo1636j.m1612T();
                        if (c5332q0M1612T == null) {
                            return;
                        }
                        c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$4
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                                num.intValue();
                                VectorComposeKt.m2005a(str2, f28, f23, f29, f27, f25, f26, f24, list3, interfaceC2056p, interfaceC0476a2, C8573r0.m16737l1(i10 | 1), i11);
                                return C9072e.f47360a;
                            }
                        };
                    }
                    i26 = 805306368;
                    i12 |= i26;
                    if (i25 != 256) {
                        composerImplMo1636j.m1654s0();
                        if ((i10 & 1) != 0) {
                            if (i27 != 0) {
                                str2 = "";
                            } else {
                                str2 = str;
                            }
                            if (i28 != 0) {
                                f18 = 0.0f;
                            } else {
                                f18 = f3;
                            }
                            if (i13 != 0) {
                                f19 = 0.0f;
                            } else {
                                f19 = f10;
                            }
                            if (i15 != 0) {
                                f16 = 0.0f;
                            }
                            if (i17 != 0) {
                                f17 = 1.0f;
                            }
                            if (i19 == 0) {
                            }
                            if (i21 != 0) {
                                f21 = 0.0f;
                            } else {
                                f21 = f14;
                            }
                            if (i23 == 0) {
                            }
                            if (i25 != 0) {
                                list2 = C10009j.f50944a;
                                i12 &= -234881025;
                            } else {
                                list2 = list;
                            }
                        } else {
                            if (i27 != 0) {
                                str2 = "";
                            } else {
                                str2 = str;
                            }
                            if (i28 != 0) {
                                f18 = 0.0f;
                            } else {
                                f18 = f3;
                            }
                            if (i13 != 0) {
                                f19 = 0.0f;
                            } else {
                                f19 = f10;
                            }
                            if (i15 != 0) {
                                f16 = 0.0f;
                            }
                            if (i17 != 0) {
                                f17 = 1.0f;
                            }
                            if (i19 == 0) {
                            }
                            if (i21 != 0) {
                                f21 = 0.0f;
                            } else {
                                f21 = f14;
                            }
                            if (i23 == 0) {
                            }
                            if (i25 != 0) {
                                list2 = C10009j.f50944a;
                                i12 &= -234881025;
                            } else {
                                list2 = list;
                            }
                        }
                        composerImplMo1636j.m1610R();
                        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q7 = ComposerKt.f3003a;
                        vectorComposeKt$Group$1 = new InterfaceC2041a<C10001b>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$1
                            @Override // cm.InterfaceC2041a
                            /* JADX INFO: renamed from: E */
                            public final C10001b mo807E() {
                                return new C10001b();
                            }
                        };
                        composerImplMo1636j.mo1622c(-548224868);
                        if (composerImplMo1636j.f2910a instanceof C10006g) {
                            C8573r0.m16771y0();
                            throw null;
                        }
                        composerImplMo1636j.m1658u0();
                        if (composerImplMo1636j.f2897L) {
                            composerImplMo1636j.mo1634i(vectorComposeKt$Group$1);
                        } else {
                            composerImplMo1636j.mo1653s();
                        }
                        C8573r0.m16714a1(composerImplMo1636j, str2, new InterfaceC2056p<C10001b, String, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$1
                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(C10001b c10001b, String str3) {
                                C10001b c10001b2 = c10001b;
                                String str4 = str3;
                                C5207g.m11111f(c10001b2, "$this$set");
                                C5207g.m11111f(str4, "it");
                                c10001b2.f50825i = str4;
                                c10001b2.m18593c();
                                return C9072e.f47360a;
                            }
                        });
                        C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f18), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$2
                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                                C10001b c10001b2 = c10001b;
                                float fFloatValue = f30.floatValue();
                                C5207g.m11111f(c10001b2, "$this$set");
                                c10001b2.f50826j = fFloatValue;
                                c10001b2.f50833q = true;
                                c10001b2.m18593c();
                                return C9072e.f47360a;
                            }
                        });
                        C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f19), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$3
                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                                C10001b c10001b2 = c10001b;
                                float fFloatValue = f30.floatValue();
                                C5207g.m11111f(c10001b2, "$this$set");
                                c10001b2.f50827k = fFloatValue;
                                c10001b2.f50833q = true;
                                c10001b2.m18593c();
                                return C9072e.f47360a;
                            }
                        });
                        C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f16), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$4
                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                                C10001b c10001b2 = c10001b;
                                float fFloatValue = f30.floatValue();
                                C5207g.m11111f(c10001b2, "$this$set");
                                c10001b2.f50828l = fFloatValue;
                                c10001b2.f50833q = true;
                                c10001b2.m18593c();
                                return C9072e.f47360a;
                            }
                        });
                        C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f17), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$5
                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                                C10001b c10001b2 = c10001b;
                                float fFloatValue = f30.floatValue();
                                C5207g.m11111f(c10001b2, "$this$set");
                                c10001b2.f50829m = fFloatValue;
                                c10001b2.f50833q = true;
                                c10001b2.m18593c();
                                return C9072e.f47360a;
                            }
                        });
                        C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f20), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$6
                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                                C10001b c10001b2 = c10001b;
                                float fFloatValue = f30.floatValue();
                                C5207g.m11111f(c10001b2, "$this$set");
                                c10001b2.f50830n = fFloatValue;
                                c10001b2.f50833q = true;
                                c10001b2.m18593c();
                                return C9072e.f47360a;
                            }
                        });
                        C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f21), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$7
                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                                C10001b c10001b2 = c10001b;
                                float fFloatValue = f30.floatValue();
                                C5207g.m11111f(c10001b2, "$this$set");
                                c10001b2.f50831o = fFloatValue;
                                c10001b2.f50833q = true;
                                c10001b2.m18593c();
                                return C9072e.f47360a;
                            }
                        });
                        C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f22), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$8
                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                                C10001b c10001b2 = c10001b;
                                float fFloatValue = f30.floatValue();
                                C5207g.m11111f(c10001b2, "$this$set");
                                c10001b2.f50832p = fFloatValue;
                                c10001b2.f50833q = true;
                                c10001b2.m18593c();
                                return C9072e.f47360a;
                            }
                        });
                        C8573r0.m16714a1(composerImplMo1636j, list2, new InterfaceC2056p<C10001b, List<? extends AbstractC10003d>, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$9
                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(C10001b c10001b, List<? extends AbstractC10003d> list4) {
                                C10001b c10001b2 = c10001b;
                                List<? extends AbstractC10003d> list5 = list4;
                                C5207g.m11111f(c10001b2, "$this$set");
                                C5207g.m11111f(list5, "it");
                                c10001b2.f50820d = list5;
                                c10001b2.f50821e = true;
                                c10001b2.m18593c();
                                return C9072e.f47360a;
                            }
                        });
                        interfaceC2056p.mo1337m0(composerImplMo1636j, Integer.valueOf((i12 >> 27) & 14));
                        composerImplMo1636j.m1609Q(true);
                        composerImplMo1636j.m1609Q(false);
                        f23 = f19;
                        f24 = f22;
                        f25 = f20;
                        f26 = f21;
                        f27 = f17;
                        list3 = list2;
                        f28 = f18;
                        f29 = f16;
                    } else {
                        composerImplMo1636j.m1654s0();
                        if ((i10 & 1) != 0) {
                            if (i27 != 0) {
                                str2 = "";
                            } else {
                                str2 = str;
                            }
                            if (i28 != 0) {
                                f18 = 0.0f;
                            } else {
                                f18 = f3;
                            }
                            if (i13 != 0) {
                                f19 = 0.0f;
                            } else {
                                f19 = f10;
                            }
                            if (i15 != 0) {
                                f16 = 0.0f;
                            }
                            if (i17 != 0) {
                                f17 = 1.0f;
                            }
                            if (i19 == 0) {
                            }
                            if (i21 != 0) {
                                f21 = 0.0f;
                            } else {
                                f21 = f14;
                            }
                            if (i23 == 0) {
                            }
                            if (i25 != 0) {
                                list2 = C10009j.f50944a;
                                i12 &= -234881025;
                            } else {
                                list2 = list;
                            }
                        } else {
                            if (i27 != 0) {
                                str2 = "";
                            } else {
                                str2 = str;
                            }
                            if (i28 != 0) {
                                f18 = 0.0f;
                            } else {
                                f18 = f3;
                            }
                            if (i13 != 0) {
                                f19 = 0.0f;
                            } else {
                                f19 = f10;
                            }
                            if (i15 != 0) {
                                f16 = 0.0f;
                            }
                            if (i17 != 0) {
                                f17 = 1.0f;
                            }
                            if (i19 == 0) {
                            }
                            if (i21 != 0) {
                                f21 = 0.0f;
                            } else {
                                f21 = f14;
                            }
                            if (i23 == 0) {
                            }
                            if (i25 != 0) {
                                list2 = C10009j.f50944a;
                                i12 &= -234881025;
                            } else {
                                list2 = list;
                            }
                        }
                        composerImplMo1636j.m1610R();
                        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q8 = ComposerKt.f3003a;
                        vectorComposeKt$Group$1 = new InterfaceC2041a<C10001b>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$1
                            @Override // cm.InterfaceC2041a
                            /* JADX INFO: renamed from: E */
                            public final C10001b mo807E() {
                                return new C10001b();
                            }
                        };
                        composerImplMo1636j.mo1622c(-548224868);
                        if (composerImplMo1636j.f2910a instanceof C10006g) {
                            C8573r0.m16771y0();
                            throw null;
                        }
                        composerImplMo1636j.m1658u0();
                        if (composerImplMo1636j.f2897L) {
                            composerImplMo1636j.mo1634i(vectorComposeKt$Group$1);
                        } else {
                            composerImplMo1636j.mo1653s();
                        }
                        C8573r0.m16714a1(composerImplMo1636j, str2, new InterfaceC2056p<C10001b, String, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$1
                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(C10001b c10001b, String str3) {
                                C10001b c10001b2 = c10001b;
                                String str4 = str3;
                                C5207g.m11111f(c10001b2, "$this$set");
                                C5207g.m11111f(str4, "it");
                                c10001b2.f50825i = str4;
                                c10001b2.m18593c();
                                return C9072e.f47360a;
                            }
                        });
                        C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f18), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$2
                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                                C10001b c10001b2 = c10001b;
                                float fFloatValue = f30.floatValue();
                                C5207g.m11111f(c10001b2, "$this$set");
                                c10001b2.f50826j = fFloatValue;
                                c10001b2.f50833q = true;
                                c10001b2.m18593c();
                                return C9072e.f47360a;
                            }
                        });
                        C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f19), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$3
                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                                C10001b c10001b2 = c10001b;
                                float fFloatValue = f30.floatValue();
                                C5207g.m11111f(c10001b2, "$this$set");
                                c10001b2.f50827k = fFloatValue;
                                c10001b2.f50833q = true;
                                c10001b2.m18593c();
                                return C9072e.f47360a;
                            }
                        });
                        C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f16), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$4
                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                                C10001b c10001b2 = c10001b;
                                float fFloatValue = f30.floatValue();
                                C5207g.m11111f(c10001b2, "$this$set");
                                c10001b2.f50828l = fFloatValue;
                                c10001b2.f50833q = true;
                                c10001b2.m18593c();
                                return C9072e.f47360a;
                            }
                        });
                        C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f17), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$5
                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                                C10001b c10001b2 = c10001b;
                                float fFloatValue = f30.floatValue();
                                C5207g.m11111f(c10001b2, "$this$set");
                                c10001b2.f50829m = fFloatValue;
                                c10001b2.f50833q = true;
                                c10001b2.m18593c();
                                return C9072e.f47360a;
                            }
                        });
                        C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f20), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$6
                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                                C10001b c10001b2 = c10001b;
                                float fFloatValue = f30.floatValue();
                                C5207g.m11111f(c10001b2, "$this$set");
                                c10001b2.f50830n = fFloatValue;
                                c10001b2.f50833q = true;
                                c10001b2.m18593c();
                                return C9072e.f47360a;
                            }
                        });
                        C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f21), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$7
                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                                C10001b c10001b2 = c10001b;
                                float fFloatValue = f30.floatValue();
                                C5207g.m11111f(c10001b2, "$this$set");
                                c10001b2.f50831o = fFloatValue;
                                c10001b2.f50833q = true;
                                c10001b2.m18593c();
                                return C9072e.f47360a;
                            }
                        });
                        C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f22), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$8
                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                                C10001b c10001b2 = c10001b;
                                float fFloatValue = f30.floatValue();
                                C5207g.m11111f(c10001b2, "$this$set");
                                c10001b2.f50832p = fFloatValue;
                                c10001b2.f50833q = true;
                                c10001b2.m18593c();
                                return C9072e.f47360a;
                            }
                        });
                        C8573r0.m16714a1(composerImplMo1636j, list2, new InterfaceC2056p<C10001b, List<? extends AbstractC10003d>, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$9
                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(C10001b c10001b, List<? extends AbstractC10003d> list4) {
                                C10001b c10001b2 = c10001b;
                                List<? extends AbstractC10003d> list5 = list4;
                                C5207g.m11111f(c10001b2, "$this$set");
                                C5207g.m11111f(list5, "it");
                                c10001b2.f50820d = list5;
                                c10001b2.f50821e = true;
                                c10001b2.m18593c();
                                return C9072e.f47360a;
                            }
                        });
                        interfaceC2056p.mo1337m0(composerImplMo1636j, Integer.valueOf((i12 >> 27) & 14));
                        composerImplMo1636j.m1609Q(true);
                        composerImplMo1636j.m1609Q(false);
                        f23 = f19;
                        f24 = f22;
                        f25 = f20;
                        f26 = f21;
                        f27 = f17;
                        list3 = list2;
                        f28 = f18;
                        f29 = f16;
                    }
                    c5332q0M1612T = composerImplMo1636j.m1612T();
                    if (c5332q0M1612T == null) {
                        return;
                    }
                    c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$4
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                            num.intValue();
                            VectorComposeKt.m2005a(str2, f28, f23, f29, f27, f25, f26, f24, list3, interfaceC2056p, interfaceC0476a2, C8573r0.m16737l1(i10 | 1), i11);
                            return C9072e.f47360a;
                        }
                    };
                }
                i12 |= 3072;
                f16 = f11;
                i17 = i11 & 16;
                if (i17 != 0) {
                    if ((57344 & i10) == 0) {
                        f17 = f12;
                        if (composerImplMo1636j.m1592D(f17)) {
                            i18 = 16384;
                        } else {
                            i18 = 8192;
                        }
                        i12 |= i18;
                    }
                    i19 = i11 & 32;
                    if (i19 != 0) {
                        i12 |= 196608;
                    } else if ((i10 & 458752) == 0) {
                        if (composerImplMo1636j.m1592D(f13)) {
                            i20 = 131072;
                        } else {
                            i20 = 65536;
                        }
                        i12 |= i20;
                    }
                    i21 = i11 & 64;
                    if (i21 != 0) {
                        i12 |= 1572864;
                    } else if ((i10 & 3670016) == 0) {
                        if (composerImplMo1636j.m1592D(f14)) {
                            i22 = 1048576;
                        } else {
                            i22 = 524288;
                        }
                        i12 |= i22;
                    }
                    i23 = i11 & BuildConfig.SDK_TRUNCATE_LENGTH;
                    if (i23 != 0) {
                        i12 |= 12582912;
                    } else if ((i10 & 29360128) == 0) {
                        if (composerImplMo1636j.m1592D(f15)) {
                            i24 = 8388608;
                        } else {
                            i24 = 4194304;
                        }
                        i12 |= i24;
                    }
                    i25 = i11 & 256;
                    if (i25 != 0) {
                        i12 |= 33554432;
                    }
                    if ((i11 & 512) != 0) {
                        if ((1879048192 & i10) == 0) {
                            if (composerImplMo1636j.m1600H(interfaceC2056p)) {
                                i26 = 536870912;
                            } else {
                                i26 = 268435456;
                            }
                        }
                        if (i25 != 256) {
                            composerImplMo1636j.m1654s0();
                            if ((i10 & 1) != 0) {
                                if (i27 != 0) {
                                    str2 = "";
                                } else {
                                    str2 = str;
                                }
                                if (i28 != 0) {
                                    f18 = 0.0f;
                                } else {
                                    f18 = f3;
                                }
                                if (i13 != 0) {
                                    f19 = 0.0f;
                                } else {
                                    f19 = f10;
                                }
                                if (i15 != 0) {
                                    f16 = 0.0f;
                                }
                                if (i17 != 0) {
                                    f17 = 1.0f;
                                }
                                if (i19 == 0) {
                                }
                                if (i21 != 0) {
                                    f21 = 0.0f;
                                } else {
                                    f21 = f14;
                                }
                                if (i23 == 0) {
                                }
                                if (i25 != 0) {
                                    list2 = C10009j.f50944a;
                                    i12 &= -234881025;
                                } else {
                                    list2 = list;
                                }
                            } else {
                                if (i27 != 0) {
                                    str2 = "";
                                } else {
                                    str2 = str;
                                }
                                if (i28 != 0) {
                                    f18 = 0.0f;
                                } else {
                                    f18 = f3;
                                }
                                if (i13 != 0) {
                                    f19 = 0.0f;
                                } else {
                                    f19 = f10;
                                }
                                if (i15 != 0) {
                                    f16 = 0.0f;
                                }
                                if (i17 != 0) {
                                    f17 = 1.0f;
                                }
                                if (i19 == 0) {
                                }
                                if (i21 != 0) {
                                    f21 = 0.0f;
                                } else {
                                    f21 = f14;
                                }
                                if (i23 == 0) {
                                }
                                if (i25 != 0) {
                                    list2 = C10009j.f50944a;
                                    i12 &= -234881025;
                                } else {
                                    list2 = list;
                                }
                            }
                            composerImplMo1636j.m1610R();
                            InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q9 = ComposerKt.f3003a;
                            vectorComposeKt$Group$1 = new InterfaceC2041a<C10001b>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$1
                                @Override // cm.InterfaceC2041a
                                /* JADX INFO: renamed from: E */
                                public final C10001b mo807E() {
                                    return new C10001b();
                                }
                            };
                            composerImplMo1636j.mo1622c(-548224868);
                            if (composerImplMo1636j.f2910a instanceof C10006g) {
                                C8573r0.m16771y0();
                                throw null;
                            }
                            composerImplMo1636j.m1658u0();
                            if (composerImplMo1636j.f2897L) {
                                composerImplMo1636j.mo1634i(vectorComposeKt$Group$1);
                            } else {
                                composerImplMo1636j.mo1653s();
                            }
                            C8573r0.m16714a1(composerImplMo1636j, str2, new InterfaceC2056p<C10001b, String, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$1
                                @Override // cm.InterfaceC2056p
                                /* JADX INFO: renamed from: m0 */
                                public final C9072e mo1337m0(C10001b c10001b, String str3) {
                                    C10001b c10001b2 = c10001b;
                                    String str4 = str3;
                                    C5207g.m11111f(c10001b2, "$this$set");
                                    C5207g.m11111f(str4, "it");
                                    c10001b2.f50825i = str4;
                                    c10001b2.m18593c();
                                    return C9072e.f47360a;
                                }
                            });
                            C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f18), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$2
                                @Override // cm.InterfaceC2056p
                                /* JADX INFO: renamed from: m0 */
                                public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                                    C10001b c10001b2 = c10001b;
                                    float fFloatValue = f30.floatValue();
                                    C5207g.m11111f(c10001b2, "$this$set");
                                    c10001b2.f50826j = fFloatValue;
                                    c10001b2.f50833q = true;
                                    c10001b2.m18593c();
                                    return C9072e.f47360a;
                                }
                            });
                            C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f19), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$3
                                @Override // cm.InterfaceC2056p
                                /* JADX INFO: renamed from: m0 */
                                public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                                    C10001b c10001b2 = c10001b;
                                    float fFloatValue = f30.floatValue();
                                    C5207g.m11111f(c10001b2, "$this$set");
                                    c10001b2.f50827k = fFloatValue;
                                    c10001b2.f50833q = true;
                                    c10001b2.m18593c();
                                    return C9072e.f47360a;
                                }
                            });
                            C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f16), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$4
                                @Override // cm.InterfaceC2056p
                                /* JADX INFO: renamed from: m0 */
                                public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                                    C10001b c10001b2 = c10001b;
                                    float fFloatValue = f30.floatValue();
                                    C5207g.m11111f(c10001b2, "$this$set");
                                    c10001b2.f50828l = fFloatValue;
                                    c10001b2.f50833q = true;
                                    c10001b2.m18593c();
                                    return C9072e.f47360a;
                                }
                            });
                            C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f17), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$5
                                @Override // cm.InterfaceC2056p
                                /* JADX INFO: renamed from: m0 */
                                public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                                    C10001b c10001b2 = c10001b;
                                    float fFloatValue = f30.floatValue();
                                    C5207g.m11111f(c10001b2, "$this$set");
                                    c10001b2.f50829m = fFloatValue;
                                    c10001b2.f50833q = true;
                                    c10001b2.m18593c();
                                    return C9072e.f47360a;
                                }
                            });
                            C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f20), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$6
                                @Override // cm.InterfaceC2056p
                                /* JADX INFO: renamed from: m0 */
                                public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                                    C10001b c10001b2 = c10001b;
                                    float fFloatValue = f30.floatValue();
                                    C5207g.m11111f(c10001b2, "$this$set");
                                    c10001b2.f50830n = fFloatValue;
                                    c10001b2.f50833q = true;
                                    c10001b2.m18593c();
                                    return C9072e.f47360a;
                                }
                            });
                            C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f21), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$7
                                @Override // cm.InterfaceC2056p
                                /* JADX INFO: renamed from: m0 */
                                public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                                    C10001b c10001b2 = c10001b;
                                    float fFloatValue = f30.floatValue();
                                    C5207g.m11111f(c10001b2, "$this$set");
                                    c10001b2.f50831o = fFloatValue;
                                    c10001b2.f50833q = true;
                                    c10001b2.m18593c();
                                    return C9072e.f47360a;
                                }
                            });
                            C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f22), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$8
                                @Override // cm.InterfaceC2056p
                                /* JADX INFO: renamed from: m0 */
                                public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                                    C10001b c10001b2 = c10001b;
                                    float fFloatValue = f30.floatValue();
                                    C5207g.m11111f(c10001b2, "$this$set");
                                    c10001b2.f50832p = fFloatValue;
                                    c10001b2.f50833q = true;
                                    c10001b2.m18593c();
                                    return C9072e.f47360a;
                                }
                            });
                            C8573r0.m16714a1(composerImplMo1636j, list2, new InterfaceC2056p<C10001b, List<? extends AbstractC10003d>, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$9
                                @Override // cm.InterfaceC2056p
                                /* JADX INFO: renamed from: m0 */
                                public final C9072e mo1337m0(C10001b c10001b, List<? extends AbstractC10003d> list4) {
                                    C10001b c10001b2 = c10001b;
                                    List<? extends AbstractC10003d> list5 = list4;
                                    C5207g.m11111f(c10001b2, "$this$set");
                                    C5207g.m11111f(list5, "it");
                                    c10001b2.f50820d = list5;
                                    c10001b2.f50821e = true;
                                    c10001b2.m18593c();
                                    return C9072e.f47360a;
                                }
                            });
                            interfaceC2056p.mo1337m0(composerImplMo1636j, Integer.valueOf((i12 >> 27) & 14));
                            composerImplMo1636j.m1609Q(true);
                            composerImplMo1636j.m1609Q(false);
                            f23 = f19;
                            f24 = f22;
                            f25 = f20;
                            f26 = f21;
                            f27 = f17;
                            list3 = list2;
                            f28 = f18;
                            f29 = f16;
                        } else {
                            composerImplMo1636j.m1654s0();
                            if ((i10 & 1) != 0) {
                                if (i27 != 0) {
                                    str2 = "";
                                } else {
                                    str2 = str;
                                }
                                if (i28 != 0) {
                                    f18 = 0.0f;
                                } else {
                                    f18 = f3;
                                }
                                if (i13 != 0) {
                                    f19 = 0.0f;
                                } else {
                                    f19 = f10;
                                }
                                if (i15 != 0) {
                                    f16 = 0.0f;
                                }
                                if (i17 != 0) {
                                    f17 = 1.0f;
                                }
                                if (i19 == 0) {
                                }
                                if (i21 != 0) {
                                    f21 = 0.0f;
                                } else {
                                    f21 = f14;
                                }
                                if (i23 == 0) {
                                }
                                if (i25 != 0) {
                                    list2 = C10009j.f50944a;
                                    i12 &= -234881025;
                                } else {
                                    list2 = list;
                                }
                            } else {
                                if (i27 != 0) {
                                    str2 = "";
                                } else {
                                    str2 = str;
                                }
                                if (i28 != 0) {
                                    f18 = 0.0f;
                                } else {
                                    f18 = f3;
                                }
                                if (i13 != 0) {
                                    f19 = 0.0f;
                                } else {
                                    f19 = f10;
                                }
                                if (i15 != 0) {
                                    f16 = 0.0f;
                                }
                                if (i17 != 0) {
                                    f17 = 1.0f;
                                }
                                if (i19 == 0) {
                                }
                                if (i21 != 0) {
                                    f21 = 0.0f;
                                } else {
                                    f21 = f14;
                                }
                                if (i23 == 0) {
                                }
                                if (i25 != 0) {
                                    list2 = C10009j.f50944a;
                                    i12 &= -234881025;
                                } else {
                                    list2 = list;
                                }
                            }
                            composerImplMo1636j.m1610R();
                            InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q10 = ComposerKt.f3003a;
                            vectorComposeKt$Group$1 = new InterfaceC2041a<C10001b>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$1
                                @Override // cm.InterfaceC2041a
                                /* JADX INFO: renamed from: E */
                                public final C10001b mo807E() {
                                    return new C10001b();
                                }
                            };
                            composerImplMo1636j.mo1622c(-548224868);
                            if (composerImplMo1636j.f2910a instanceof C10006g) {
                                C8573r0.m16771y0();
                                throw null;
                            }
                            composerImplMo1636j.m1658u0();
                            if (composerImplMo1636j.f2897L) {
                                composerImplMo1636j.mo1634i(vectorComposeKt$Group$1);
                            } else {
                                composerImplMo1636j.mo1653s();
                            }
                            C8573r0.m16714a1(composerImplMo1636j, str2, new InterfaceC2056p<C10001b, String, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$1
                                @Override // cm.InterfaceC2056p
                                /* JADX INFO: renamed from: m0 */
                                public final C9072e mo1337m0(C10001b c10001b, String str3) {
                                    C10001b c10001b2 = c10001b;
                                    String str4 = str3;
                                    C5207g.m11111f(c10001b2, "$this$set");
                                    C5207g.m11111f(str4, "it");
                                    c10001b2.f50825i = str4;
                                    c10001b2.m18593c();
                                    return C9072e.f47360a;
                                }
                            });
                            C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f18), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$2
                                @Override // cm.InterfaceC2056p
                                /* JADX INFO: renamed from: m0 */
                                public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                                    C10001b c10001b2 = c10001b;
                                    float fFloatValue = f30.floatValue();
                                    C5207g.m11111f(c10001b2, "$this$set");
                                    c10001b2.f50826j = fFloatValue;
                                    c10001b2.f50833q = true;
                                    c10001b2.m18593c();
                                    return C9072e.f47360a;
                                }
                            });
                            C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f19), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$3
                                @Override // cm.InterfaceC2056p
                                /* JADX INFO: renamed from: m0 */
                                public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                                    C10001b c10001b2 = c10001b;
                                    float fFloatValue = f30.floatValue();
                                    C5207g.m11111f(c10001b2, "$this$set");
                                    c10001b2.f50827k = fFloatValue;
                                    c10001b2.f50833q = true;
                                    c10001b2.m18593c();
                                    return C9072e.f47360a;
                                }
                            });
                            C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f16), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$4
                                @Override // cm.InterfaceC2056p
                                /* JADX INFO: renamed from: m0 */
                                public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                                    C10001b c10001b2 = c10001b;
                                    float fFloatValue = f30.floatValue();
                                    C5207g.m11111f(c10001b2, "$this$set");
                                    c10001b2.f50828l = fFloatValue;
                                    c10001b2.f50833q = true;
                                    c10001b2.m18593c();
                                    return C9072e.f47360a;
                                }
                            });
                            C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f17), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$5
                                @Override // cm.InterfaceC2056p
                                /* JADX INFO: renamed from: m0 */
                                public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                                    C10001b c10001b2 = c10001b;
                                    float fFloatValue = f30.floatValue();
                                    C5207g.m11111f(c10001b2, "$this$set");
                                    c10001b2.f50829m = fFloatValue;
                                    c10001b2.f50833q = true;
                                    c10001b2.m18593c();
                                    return C9072e.f47360a;
                                }
                            });
                            C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f20), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$6
                                @Override // cm.InterfaceC2056p
                                /* JADX INFO: renamed from: m0 */
                                public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                                    C10001b c10001b2 = c10001b;
                                    float fFloatValue = f30.floatValue();
                                    C5207g.m11111f(c10001b2, "$this$set");
                                    c10001b2.f50830n = fFloatValue;
                                    c10001b2.f50833q = true;
                                    c10001b2.m18593c();
                                    return C9072e.f47360a;
                                }
                            });
                            C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f21), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$7
                                @Override // cm.InterfaceC2056p
                                /* JADX INFO: renamed from: m0 */
                                public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                                    C10001b c10001b2 = c10001b;
                                    float fFloatValue = f30.floatValue();
                                    C5207g.m11111f(c10001b2, "$this$set");
                                    c10001b2.f50831o = fFloatValue;
                                    c10001b2.f50833q = true;
                                    c10001b2.m18593c();
                                    return C9072e.f47360a;
                                }
                            });
                            C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f22), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$8
                                @Override // cm.InterfaceC2056p
                                /* JADX INFO: renamed from: m0 */
                                public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                                    C10001b c10001b2 = c10001b;
                                    float fFloatValue = f30.floatValue();
                                    C5207g.m11111f(c10001b2, "$this$set");
                                    c10001b2.f50832p = fFloatValue;
                                    c10001b2.f50833q = true;
                                    c10001b2.m18593c();
                                    return C9072e.f47360a;
                                }
                            });
                            C8573r0.m16714a1(composerImplMo1636j, list2, new InterfaceC2056p<C10001b, List<? extends AbstractC10003d>, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$9
                                @Override // cm.InterfaceC2056p
                                /* JADX INFO: renamed from: m0 */
                                public final C9072e mo1337m0(C10001b c10001b, List<? extends AbstractC10003d> list4) {
                                    C10001b c10001b2 = c10001b;
                                    List<? extends AbstractC10003d> list5 = list4;
                                    C5207g.m11111f(c10001b2, "$this$set");
                                    C5207g.m11111f(list5, "it");
                                    c10001b2.f50820d = list5;
                                    c10001b2.f50821e = true;
                                    c10001b2.m18593c();
                                    return C9072e.f47360a;
                                }
                            });
                            interfaceC2056p.mo1337m0(composerImplMo1636j, Integer.valueOf((i12 >> 27) & 14));
                            composerImplMo1636j.m1609Q(true);
                            composerImplMo1636j.m1609Q(false);
                            f23 = f19;
                            f24 = f22;
                            f25 = f20;
                            f26 = f21;
                            f27 = f17;
                            list3 = list2;
                            f28 = f18;
                            f29 = f16;
                        }
                        c5332q0M1612T = composerImplMo1636j.m1612T();
                        if (c5332q0M1612T == null) {
                            return;
                        }
                        c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$4
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                                num.intValue();
                                VectorComposeKt.m2005a(str2, f28, f23, f29, f27, f25, f26, f24, list3, interfaceC2056p, interfaceC0476a2, C8573r0.m16737l1(i10 | 1), i11);
                                return C9072e.f47360a;
                            }
                        };
                    }
                    i26 = 805306368;
                    i12 |= i26;
                    if (i25 != 256) {
                        composerImplMo1636j.m1654s0();
                        if ((i10 & 1) != 0) {
                            if (i27 != 0) {
                                str2 = "";
                            } else {
                                str2 = str;
                            }
                            if (i28 != 0) {
                                f18 = 0.0f;
                            } else {
                                f18 = f3;
                            }
                            if (i13 != 0) {
                                f19 = 0.0f;
                            } else {
                                f19 = f10;
                            }
                            if (i15 != 0) {
                                f16 = 0.0f;
                            }
                            if (i17 != 0) {
                                f17 = 1.0f;
                            }
                            if (i19 == 0) {
                            }
                            if (i21 != 0) {
                                f21 = 0.0f;
                            } else {
                                f21 = f14;
                            }
                            if (i23 == 0) {
                            }
                            if (i25 != 0) {
                                list2 = C10009j.f50944a;
                                i12 &= -234881025;
                            } else {
                                list2 = list;
                            }
                        } else {
                            if (i27 != 0) {
                                str2 = "";
                            } else {
                                str2 = str;
                            }
                            if (i28 != 0) {
                                f18 = 0.0f;
                            } else {
                                f18 = f3;
                            }
                            if (i13 != 0) {
                                f19 = 0.0f;
                            } else {
                                f19 = f10;
                            }
                            if (i15 != 0) {
                                f16 = 0.0f;
                            }
                            if (i17 != 0) {
                                f17 = 1.0f;
                            }
                            if (i19 == 0) {
                            }
                            if (i21 != 0) {
                                f21 = 0.0f;
                            } else {
                                f21 = f14;
                            }
                            if (i23 == 0) {
                            }
                            if (i25 != 0) {
                                list2 = C10009j.f50944a;
                                i12 &= -234881025;
                            } else {
                                list2 = list;
                            }
                        }
                        composerImplMo1636j.m1610R();
                        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q11 = ComposerKt.f3003a;
                        vectorComposeKt$Group$1 = new InterfaceC2041a<C10001b>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$1
                            @Override // cm.InterfaceC2041a
                            /* JADX INFO: renamed from: E */
                            public final C10001b mo807E() {
                                return new C10001b();
                            }
                        };
                        composerImplMo1636j.mo1622c(-548224868);
                        if (composerImplMo1636j.f2910a instanceof C10006g) {
                            C8573r0.m16771y0();
                            throw null;
                        }
                        composerImplMo1636j.m1658u0();
                        if (composerImplMo1636j.f2897L) {
                            composerImplMo1636j.mo1634i(vectorComposeKt$Group$1);
                        } else {
                            composerImplMo1636j.mo1653s();
                        }
                        C8573r0.m16714a1(composerImplMo1636j, str2, new InterfaceC2056p<C10001b, String, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$1
                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(C10001b c10001b, String str3) {
                                C10001b c10001b2 = c10001b;
                                String str4 = str3;
                                C5207g.m11111f(c10001b2, "$this$set");
                                C5207g.m11111f(str4, "it");
                                c10001b2.f50825i = str4;
                                c10001b2.m18593c();
                                return C9072e.f47360a;
                            }
                        });
                        C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f18), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$2
                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                                C10001b c10001b2 = c10001b;
                                float fFloatValue = f30.floatValue();
                                C5207g.m11111f(c10001b2, "$this$set");
                                c10001b2.f50826j = fFloatValue;
                                c10001b2.f50833q = true;
                                c10001b2.m18593c();
                                return C9072e.f47360a;
                            }
                        });
                        C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f19), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$3
                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                                C10001b c10001b2 = c10001b;
                                float fFloatValue = f30.floatValue();
                                C5207g.m11111f(c10001b2, "$this$set");
                                c10001b2.f50827k = fFloatValue;
                                c10001b2.f50833q = true;
                                c10001b2.m18593c();
                                return C9072e.f47360a;
                            }
                        });
                        C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f16), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$4
                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                                C10001b c10001b2 = c10001b;
                                float fFloatValue = f30.floatValue();
                                C5207g.m11111f(c10001b2, "$this$set");
                                c10001b2.f50828l = fFloatValue;
                                c10001b2.f50833q = true;
                                c10001b2.m18593c();
                                return C9072e.f47360a;
                            }
                        });
                        C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f17), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$5
                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                                C10001b c10001b2 = c10001b;
                                float fFloatValue = f30.floatValue();
                                C5207g.m11111f(c10001b2, "$this$set");
                                c10001b2.f50829m = fFloatValue;
                                c10001b2.f50833q = true;
                                c10001b2.m18593c();
                                return C9072e.f47360a;
                            }
                        });
                        C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f20), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$6
                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                                C10001b c10001b2 = c10001b;
                                float fFloatValue = f30.floatValue();
                                C5207g.m11111f(c10001b2, "$this$set");
                                c10001b2.f50830n = fFloatValue;
                                c10001b2.f50833q = true;
                                c10001b2.m18593c();
                                return C9072e.f47360a;
                            }
                        });
                        C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f21), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$7
                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                                C10001b c10001b2 = c10001b;
                                float fFloatValue = f30.floatValue();
                                C5207g.m11111f(c10001b2, "$this$set");
                                c10001b2.f50831o = fFloatValue;
                                c10001b2.f50833q = true;
                                c10001b2.m18593c();
                                return C9072e.f47360a;
                            }
                        });
                        C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f22), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$8
                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                                C10001b c10001b2 = c10001b;
                                float fFloatValue = f30.floatValue();
                                C5207g.m11111f(c10001b2, "$this$set");
                                c10001b2.f50832p = fFloatValue;
                                c10001b2.f50833q = true;
                                c10001b2.m18593c();
                                return C9072e.f47360a;
                            }
                        });
                        C8573r0.m16714a1(composerImplMo1636j, list2, new InterfaceC2056p<C10001b, List<? extends AbstractC10003d>, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$9
                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(C10001b c10001b, List<? extends AbstractC10003d> list4) {
                                C10001b c10001b2 = c10001b;
                                List<? extends AbstractC10003d> list5 = list4;
                                C5207g.m11111f(c10001b2, "$this$set");
                                C5207g.m11111f(list5, "it");
                                c10001b2.f50820d = list5;
                                c10001b2.f50821e = true;
                                c10001b2.m18593c();
                                return C9072e.f47360a;
                            }
                        });
                        interfaceC2056p.mo1337m0(composerImplMo1636j, Integer.valueOf((i12 >> 27) & 14));
                        composerImplMo1636j.m1609Q(true);
                        composerImplMo1636j.m1609Q(false);
                        f23 = f19;
                        f24 = f22;
                        f25 = f20;
                        f26 = f21;
                        f27 = f17;
                        list3 = list2;
                        f28 = f18;
                        f29 = f16;
                    } else {
                        composerImplMo1636j.m1654s0();
                        if ((i10 & 1) != 0) {
                            if (i27 != 0) {
                                str2 = "";
                            } else {
                                str2 = str;
                            }
                            if (i28 != 0) {
                                f18 = 0.0f;
                            } else {
                                f18 = f3;
                            }
                            if (i13 != 0) {
                                f19 = 0.0f;
                            } else {
                                f19 = f10;
                            }
                            if (i15 != 0) {
                                f16 = 0.0f;
                            }
                            if (i17 != 0) {
                                f17 = 1.0f;
                            }
                            if (i19 == 0) {
                            }
                            if (i21 != 0) {
                                f21 = 0.0f;
                            } else {
                                f21 = f14;
                            }
                            if (i23 == 0) {
                            }
                            if (i25 != 0) {
                                list2 = C10009j.f50944a;
                                i12 &= -234881025;
                            } else {
                                list2 = list;
                            }
                        } else {
                            if (i27 != 0) {
                                str2 = "";
                            } else {
                                str2 = str;
                            }
                            if (i28 != 0) {
                                f18 = 0.0f;
                            } else {
                                f18 = f3;
                            }
                            if (i13 != 0) {
                                f19 = 0.0f;
                            } else {
                                f19 = f10;
                            }
                            if (i15 != 0) {
                                f16 = 0.0f;
                            }
                            if (i17 != 0) {
                                f17 = 1.0f;
                            }
                            if (i19 == 0) {
                            }
                            if (i21 != 0) {
                                f21 = 0.0f;
                            } else {
                                f21 = f14;
                            }
                            if (i23 == 0) {
                            }
                            if (i25 != 0) {
                                list2 = C10009j.f50944a;
                                i12 &= -234881025;
                            } else {
                                list2 = list;
                            }
                        }
                        composerImplMo1636j.m1610R();
                        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q12 = ComposerKt.f3003a;
                        vectorComposeKt$Group$1 = new InterfaceC2041a<C10001b>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$1
                            @Override // cm.InterfaceC2041a
                            /* JADX INFO: renamed from: E */
                            public final C10001b mo807E() {
                                return new C10001b();
                            }
                        };
                        composerImplMo1636j.mo1622c(-548224868);
                        if (composerImplMo1636j.f2910a instanceof C10006g) {
                            C8573r0.m16771y0();
                            throw null;
                        }
                        composerImplMo1636j.m1658u0();
                        if (composerImplMo1636j.f2897L) {
                            composerImplMo1636j.mo1634i(vectorComposeKt$Group$1);
                        } else {
                            composerImplMo1636j.mo1653s();
                        }
                        C8573r0.m16714a1(composerImplMo1636j, str2, new InterfaceC2056p<C10001b, String, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$1
                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(C10001b c10001b, String str3) {
                                C10001b c10001b2 = c10001b;
                                String str4 = str3;
                                C5207g.m11111f(c10001b2, "$this$set");
                                C5207g.m11111f(str4, "it");
                                c10001b2.f50825i = str4;
                                c10001b2.m18593c();
                                return C9072e.f47360a;
                            }
                        });
                        C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f18), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$2
                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                                C10001b c10001b2 = c10001b;
                                float fFloatValue = f30.floatValue();
                                C5207g.m11111f(c10001b2, "$this$set");
                                c10001b2.f50826j = fFloatValue;
                                c10001b2.f50833q = true;
                                c10001b2.m18593c();
                                return C9072e.f47360a;
                            }
                        });
                        C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f19), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$3
                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                                C10001b c10001b2 = c10001b;
                                float fFloatValue = f30.floatValue();
                                C5207g.m11111f(c10001b2, "$this$set");
                                c10001b2.f50827k = fFloatValue;
                                c10001b2.f50833q = true;
                                c10001b2.m18593c();
                                return C9072e.f47360a;
                            }
                        });
                        C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f16), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$4
                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                                C10001b c10001b2 = c10001b;
                                float fFloatValue = f30.floatValue();
                                C5207g.m11111f(c10001b2, "$this$set");
                                c10001b2.f50828l = fFloatValue;
                                c10001b2.f50833q = true;
                                c10001b2.m18593c();
                                return C9072e.f47360a;
                            }
                        });
                        C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f17), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$5
                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                                C10001b c10001b2 = c10001b;
                                float fFloatValue = f30.floatValue();
                                C5207g.m11111f(c10001b2, "$this$set");
                                c10001b2.f50829m = fFloatValue;
                                c10001b2.f50833q = true;
                                c10001b2.m18593c();
                                return C9072e.f47360a;
                            }
                        });
                        C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f20), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$6
                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                                C10001b c10001b2 = c10001b;
                                float fFloatValue = f30.floatValue();
                                C5207g.m11111f(c10001b2, "$this$set");
                                c10001b2.f50830n = fFloatValue;
                                c10001b2.f50833q = true;
                                c10001b2.m18593c();
                                return C9072e.f47360a;
                            }
                        });
                        C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f21), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$7
                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                                C10001b c10001b2 = c10001b;
                                float fFloatValue = f30.floatValue();
                                C5207g.m11111f(c10001b2, "$this$set");
                                c10001b2.f50831o = fFloatValue;
                                c10001b2.f50833q = true;
                                c10001b2.m18593c();
                                return C9072e.f47360a;
                            }
                        });
                        C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f22), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$8
                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                                C10001b c10001b2 = c10001b;
                                float fFloatValue = f30.floatValue();
                                C5207g.m11111f(c10001b2, "$this$set");
                                c10001b2.f50832p = fFloatValue;
                                c10001b2.f50833q = true;
                                c10001b2.m18593c();
                                return C9072e.f47360a;
                            }
                        });
                        C8573r0.m16714a1(composerImplMo1636j, list2, new InterfaceC2056p<C10001b, List<? extends AbstractC10003d>, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$9
                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(C10001b c10001b, List<? extends AbstractC10003d> list4) {
                                C10001b c10001b2 = c10001b;
                                List<? extends AbstractC10003d> list5 = list4;
                                C5207g.m11111f(c10001b2, "$this$set");
                                C5207g.m11111f(list5, "it");
                                c10001b2.f50820d = list5;
                                c10001b2.f50821e = true;
                                c10001b2.m18593c();
                                return C9072e.f47360a;
                            }
                        });
                        interfaceC2056p.mo1337m0(composerImplMo1636j, Integer.valueOf((i12 >> 27) & 14));
                        composerImplMo1636j.m1609Q(true);
                        composerImplMo1636j.m1609Q(false);
                        f23 = f19;
                        f24 = f22;
                        f25 = f20;
                        f26 = f21;
                        f27 = f17;
                        list3 = list2;
                        f28 = f18;
                        f29 = f16;
                    }
                    c5332q0M1612T = composerImplMo1636j.m1612T();
                    if (c5332q0M1612T == null) {
                        return;
                    }
                    c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$4
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                            num.intValue();
                            VectorComposeKt.m2005a(str2, f28, f23, f29, f27, f25, f26, f24, list3, interfaceC2056p, interfaceC0476a2, C8573r0.m16737l1(i10 | 1), i11);
                            return C9072e.f47360a;
                        }
                    };
                }
                i12 |= 24576;
                f17 = f12;
                i19 = i11 & 32;
                if (i19 != 0) {
                    i12 |= 196608;
                } else if ((i10 & 458752) == 0) {
                    if (composerImplMo1636j.m1592D(f13)) {
                        i20 = 131072;
                    } else {
                        i20 = 65536;
                    }
                    i12 |= i20;
                }
                i21 = i11 & 64;
                if (i21 != 0) {
                    i12 |= 1572864;
                } else if ((i10 & 3670016) == 0) {
                    if (composerImplMo1636j.m1592D(f14)) {
                        i22 = 1048576;
                    } else {
                        i22 = 524288;
                    }
                    i12 |= i22;
                }
                i23 = i11 & BuildConfig.SDK_TRUNCATE_LENGTH;
                if (i23 != 0) {
                    i12 |= 12582912;
                } else if ((i10 & 29360128) == 0) {
                    if (composerImplMo1636j.m1592D(f15)) {
                        i24 = 8388608;
                    } else {
                        i24 = 4194304;
                    }
                    i12 |= i24;
                }
                i25 = i11 & 256;
                if (i25 != 0) {
                    i12 |= 33554432;
                }
                if ((i11 & 512) != 0) {
                    if ((1879048192 & i10) == 0) {
                        if (composerImplMo1636j.m1600H(interfaceC2056p)) {
                            i26 = 536870912;
                        } else {
                            i26 = 268435456;
                        }
                    }
                    if (i25 != 256) {
                        composerImplMo1636j.m1654s0();
                        if ((i10 & 1) != 0) {
                            if (i27 != 0) {
                                str2 = "";
                            } else {
                                str2 = str;
                            }
                            if (i28 != 0) {
                                f18 = 0.0f;
                            } else {
                                f18 = f3;
                            }
                            if (i13 != 0) {
                                f19 = 0.0f;
                            } else {
                                f19 = f10;
                            }
                            if (i15 != 0) {
                                f16 = 0.0f;
                            }
                            if (i17 != 0) {
                                f17 = 1.0f;
                            }
                            if (i19 == 0) {
                            }
                            if (i21 != 0) {
                                f21 = 0.0f;
                            } else {
                                f21 = f14;
                            }
                            if (i23 == 0) {
                            }
                            if (i25 != 0) {
                                list2 = C10009j.f50944a;
                                i12 &= -234881025;
                            } else {
                                list2 = list;
                            }
                        } else {
                            if (i27 != 0) {
                                str2 = "";
                            } else {
                                str2 = str;
                            }
                            if (i28 != 0) {
                                f18 = 0.0f;
                            } else {
                                f18 = f3;
                            }
                            if (i13 != 0) {
                                f19 = 0.0f;
                            } else {
                                f19 = f10;
                            }
                            if (i15 != 0) {
                                f16 = 0.0f;
                            }
                            if (i17 != 0) {
                                f17 = 1.0f;
                            }
                            if (i19 == 0) {
                            }
                            if (i21 != 0) {
                                f21 = 0.0f;
                            } else {
                                f21 = f14;
                            }
                            if (i23 == 0) {
                            }
                            if (i25 != 0) {
                                list2 = C10009j.f50944a;
                                i12 &= -234881025;
                            } else {
                                list2 = list;
                            }
                        }
                        composerImplMo1636j.m1610R();
                        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q13 = ComposerKt.f3003a;
                        vectorComposeKt$Group$1 = new InterfaceC2041a<C10001b>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$1
                            @Override // cm.InterfaceC2041a
                            /* JADX INFO: renamed from: E */
                            public final C10001b mo807E() {
                                return new C10001b();
                            }
                        };
                        composerImplMo1636j.mo1622c(-548224868);
                        if (composerImplMo1636j.f2910a instanceof C10006g) {
                            C8573r0.m16771y0();
                            throw null;
                        }
                        composerImplMo1636j.m1658u0();
                        if (composerImplMo1636j.f2897L) {
                            composerImplMo1636j.mo1634i(vectorComposeKt$Group$1);
                        } else {
                            composerImplMo1636j.mo1653s();
                        }
                        C8573r0.m16714a1(composerImplMo1636j, str2, new InterfaceC2056p<C10001b, String, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$1
                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(C10001b c10001b, String str3) {
                                C10001b c10001b2 = c10001b;
                                String str4 = str3;
                                C5207g.m11111f(c10001b2, "$this$set");
                                C5207g.m11111f(str4, "it");
                                c10001b2.f50825i = str4;
                                c10001b2.m18593c();
                                return C9072e.f47360a;
                            }
                        });
                        C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f18), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$2
                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                                C10001b c10001b2 = c10001b;
                                float fFloatValue = f30.floatValue();
                                C5207g.m11111f(c10001b2, "$this$set");
                                c10001b2.f50826j = fFloatValue;
                                c10001b2.f50833q = true;
                                c10001b2.m18593c();
                                return C9072e.f47360a;
                            }
                        });
                        C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f19), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$3
                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                                C10001b c10001b2 = c10001b;
                                float fFloatValue = f30.floatValue();
                                C5207g.m11111f(c10001b2, "$this$set");
                                c10001b2.f50827k = fFloatValue;
                                c10001b2.f50833q = true;
                                c10001b2.m18593c();
                                return C9072e.f47360a;
                            }
                        });
                        C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f16), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$4
                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                                C10001b c10001b2 = c10001b;
                                float fFloatValue = f30.floatValue();
                                C5207g.m11111f(c10001b2, "$this$set");
                                c10001b2.f50828l = fFloatValue;
                                c10001b2.f50833q = true;
                                c10001b2.m18593c();
                                return C9072e.f47360a;
                            }
                        });
                        C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f17), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$5
                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                                C10001b c10001b2 = c10001b;
                                float fFloatValue = f30.floatValue();
                                C5207g.m11111f(c10001b2, "$this$set");
                                c10001b2.f50829m = fFloatValue;
                                c10001b2.f50833q = true;
                                c10001b2.m18593c();
                                return C9072e.f47360a;
                            }
                        });
                        C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f20), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$6
                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                                C10001b c10001b2 = c10001b;
                                float fFloatValue = f30.floatValue();
                                C5207g.m11111f(c10001b2, "$this$set");
                                c10001b2.f50830n = fFloatValue;
                                c10001b2.f50833q = true;
                                c10001b2.m18593c();
                                return C9072e.f47360a;
                            }
                        });
                        C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f21), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$7
                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                                C10001b c10001b2 = c10001b;
                                float fFloatValue = f30.floatValue();
                                C5207g.m11111f(c10001b2, "$this$set");
                                c10001b2.f50831o = fFloatValue;
                                c10001b2.f50833q = true;
                                c10001b2.m18593c();
                                return C9072e.f47360a;
                            }
                        });
                        C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f22), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$8
                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                                C10001b c10001b2 = c10001b;
                                float fFloatValue = f30.floatValue();
                                C5207g.m11111f(c10001b2, "$this$set");
                                c10001b2.f50832p = fFloatValue;
                                c10001b2.f50833q = true;
                                c10001b2.m18593c();
                                return C9072e.f47360a;
                            }
                        });
                        C8573r0.m16714a1(composerImplMo1636j, list2, new InterfaceC2056p<C10001b, List<? extends AbstractC10003d>, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$9
                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(C10001b c10001b, List<? extends AbstractC10003d> list4) {
                                C10001b c10001b2 = c10001b;
                                List<? extends AbstractC10003d> list5 = list4;
                                C5207g.m11111f(c10001b2, "$this$set");
                                C5207g.m11111f(list5, "it");
                                c10001b2.f50820d = list5;
                                c10001b2.f50821e = true;
                                c10001b2.m18593c();
                                return C9072e.f47360a;
                            }
                        });
                        interfaceC2056p.mo1337m0(composerImplMo1636j, Integer.valueOf((i12 >> 27) & 14));
                        composerImplMo1636j.m1609Q(true);
                        composerImplMo1636j.m1609Q(false);
                        f23 = f19;
                        f24 = f22;
                        f25 = f20;
                        f26 = f21;
                        f27 = f17;
                        list3 = list2;
                        f28 = f18;
                        f29 = f16;
                    } else {
                        composerImplMo1636j.m1654s0();
                        if ((i10 & 1) != 0) {
                            if (i27 != 0) {
                                str2 = "";
                            } else {
                                str2 = str;
                            }
                            if (i28 != 0) {
                                f18 = 0.0f;
                            } else {
                                f18 = f3;
                            }
                            if (i13 != 0) {
                                f19 = 0.0f;
                            } else {
                                f19 = f10;
                            }
                            if (i15 != 0) {
                                f16 = 0.0f;
                            }
                            if (i17 != 0) {
                                f17 = 1.0f;
                            }
                            if (i19 == 0) {
                            }
                            if (i21 != 0) {
                                f21 = 0.0f;
                            } else {
                                f21 = f14;
                            }
                            if (i23 == 0) {
                            }
                            if (i25 != 0) {
                                list2 = C10009j.f50944a;
                                i12 &= -234881025;
                            } else {
                                list2 = list;
                            }
                        } else {
                            if (i27 != 0) {
                                str2 = "";
                            } else {
                                str2 = str;
                            }
                            if (i28 != 0) {
                                f18 = 0.0f;
                            } else {
                                f18 = f3;
                            }
                            if (i13 != 0) {
                                f19 = 0.0f;
                            } else {
                                f19 = f10;
                            }
                            if (i15 != 0) {
                                f16 = 0.0f;
                            }
                            if (i17 != 0) {
                                f17 = 1.0f;
                            }
                            if (i19 == 0) {
                            }
                            if (i21 != 0) {
                                f21 = 0.0f;
                            } else {
                                f21 = f14;
                            }
                            if (i23 == 0) {
                            }
                            if (i25 != 0) {
                                list2 = C10009j.f50944a;
                                i12 &= -234881025;
                            } else {
                                list2 = list;
                            }
                        }
                        composerImplMo1636j.m1610R();
                        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q14 = ComposerKt.f3003a;
                        vectorComposeKt$Group$1 = new InterfaceC2041a<C10001b>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$1
                            @Override // cm.InterfaceC2041a
                            /* JADX INFO: renamed from: E */
                            public final C10001b mo807E() {
                                return new C10001b();
                            }
                        };
                        composerImplMo1636j.mo1622c(-548224868);
                        if (composerImplMo1636j.f2910a instanceof C10006g) {
                            C8573r0.m16771y0();
                            throw null;
                        }
                        composerImplMo1636j.m1658u0();
                        if (composerImplMo1636j.f2897L) {
                            composerImplMo1636j.mo1634i(vectorComposeKt$Group$1);
                        } else {
                            composerImplMo1636j.mo1653s();
                        }
                        C8573r0.m16714a1(composerImplMo1636j, str2, new InterfaceC2056p<C10001b, String, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$1
                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(C10001b c10001b, String str3) {
                                C10001b c10001b2 = c10001b;
                                String str4 = str3;
                                C5207g.m11111f(c10001b2, "$this$set");
                                C5207g.m11111f(str4, "it");
                                c10001b2.f50825i = str4;
                                c10001b2.m18593c();
                                return C9072e.f47360a;
                            }
                        });
                        C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f18), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$2
                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                                C10001b c10001b2 = c10001b;
                                float fFloatValue = f30.floatValue();
                                C5207g.m11111f(c10001b2, "$this$set");
                                c10001b2.f50826j = fFloatValue;
                                c10001b2.f50833q = true;
                                c10001b2.m18593c();
                                return C9072e.f47360a;
                            }
                        });
                        C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f19), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$3
                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                                C10001b c10001b2 = c10001b;
                                float fFloatValue = f30.floatValue();
                                C5207g.m11111f(c10001b2, "$this$set");
                                c10001b2.f50827k = fFloatValue;
                                c10001b2.f50833q = true;
                                c10001b2.m18593c();
                                return C9072e.f47360a;
                            }
                        });
                        C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f16), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$4
                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                                C10001b c10001b2 = c10001b;
                                float fFloatValue = f30.floatValue();
                                C5207g.m11111f(c10001b2, "$this$set");
                                c10001b2.f50828l = fFloatValue;
                                c10001b2.f50833q = true;
                                c10001b2.m18593c();
                                return C9072e.f47360a;
                            }
                        });
                        C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f17), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$5
                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                                C10001b c10001b2 = c10001b;
                                float fFloatValue = f30.floatValue();
                                C5207g.m11111f(c10001b2, "$this$set");
                                c10001b2.f50829m = fFloatValue;
                                c10001b2.f50833q = true;
                                c10001b2.m18593c();
                                return C9072e.f47360a;
                            }
                        });
                        C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f20), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$6
                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                                C10001b c10001b2 = c10001b;
                                float fFloatValue = f30.floatValue();
                                C5207g.m11111f(c10001b2, "$this$set");
                                c10001b2.f50830n = fFloatValue;
                                c10001b2.f50833q = true;
                                c10001b2.m18593c();
                                return C9072e.f47360a;
                            }
                        });
                        C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f21), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$7
                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                                C10001b c10001b2 = c10001b;
                                float fFloatValue = f30.floatValue();
                                C5207g.m11111f(c10001b2, "$this$set");
                                c10001b2.f50831o = fFloatValue;
                                c10001b2.f50833q = true;
                                c10001b2.m18593c();
                                return C9072e.f47360a;
                            }
                        });
                        C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f22), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$8
                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                                C10001b c10001b2 = c10001b;
                                float fFloatValue = f30.floatValue();
                                C5207g.m11111f(c10001b2, "$this$set");
                                c10001b2.f50832p = fFloatValue;
                                c10001b2.f50833q = true;
                                c10001b2.m18593c();
                                return C9072e.f47360a;
                            }
                        });
                        C8573r0.m16714a1(composerImplMo1636j, list2, new InterfaceC2056p<C10001b, List<? extends AbstractC10003d>, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$9
                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(C10001b c10001b, List<? extends AbstractC10003d> list4) {
                                C10001b c10001b2 = c10001b;
                                List<? extends AbstractC10003d> list5 = list4;
                                C5207g.m11111f(c10001b2, "$this$set");
                                C5207g.m11111f(list5, "it");
                                c10001b2.f50820d = list5;
                                c10001b2.f50821e = true;
                                c10001b2.m18593c();
                                return C9072e.f47360a;
                            }
                        });
                        interfaceC2056p.mo1337m0(composerImplMo1636j, Integer.valueOf((i12 >> 27) & 14));
                        composerImplMo1636j.m1609Q(true);
                        composerImplMo1636j.m1609Q(false);
                        f23 = f19;
                        f24 = f22;
                        f25 = f20;
                        f26 = f21;
                        f27 = f17;
                        list3 = list2;
                        f28 = f18;
                        f29 = f16;
                    }
                    c5332q0M1612T = composerImplMo1636j.m1612T();
                    if (c5332q0M1612T == null) {
                        return;
                    }
                    c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$4
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                            num.intValue();
                            VectorComposeKt.m2005a(str2, f28, f23, f29, f27, f25, f26, f24, list3, interfaceC2056p, interfaceC0476a2, C8573r0.m16737l1(i10 | 1), i11);
                            return C9072e.f47360a;
                        }
                    };
                }
                i26 = 805306368;
                i12 |= i26;
                if (i25 != 256) {
                    composerImplMo1636j.m1654s0();
                    if ((i10 & 1) != 0) {
                        if (i27 != 0) {
                            str2 = "";
                        } else {
                            str2 = str;
                        }
                        if (i28 != 0) {
                            f18 = 0.0f;
                        } else {
                            f18 = f3;
                        }
                        if (i13 != 0) {
                            f19 = 0.0f;
                        } else {
                            f19 = f10;
                        }
                        if (i15 != 0) {
                            f16 = 0.0f;
                        }
                        if (i17 != 0) {
                            f17 = 1.0f;
                        }
                        if (i19 == 0) {
                        }
                        if (i21 != 0) {
                            f21 = 0.0f;
                        } else {
                            f21 = f14;
                        }
                        if (i23 == 0) {
                        }
                        if (i25 != 0) {
                            list2 = C10009j.f50944a;
                            i12 &= -234881025;
                        } else {
                            list2 = list;
                        }
                    } else {
                        if (i27 != 0) {
                            str2 = "";
                        } else {
                            str2 = str;
                        }
                        if (i28 != 0) {
                            f18 = 0.0f;
                        } else {
                            f18 = f3;
                        }
                        if (i13 != 0) {
                            f19 = 0.0f;
                        } else {
                            f19 = f10;
                        }
                        if (i15 != 0) {
                            f16 = 0.0f;
                        }
                        if (i17 != 0) {
                            f17 = 1.0f;
                        }
                        if (i19 == 0) {
                        }
                        if (i21 != 0) {
                            f21 = 0.0f;
                        } else {
                            f21 = f14;
                        }
                        if (i23 == 0) {
                        }
                        if (i25 != 0) {
                            list2 = C10009j.f50944a;
                            i12 &= -234881025;
                        } else {
                            list2 = list;
                        }
                    }
                    composerImplMo1636j.m1610R();
                    InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q15 = ComposerKt.f3003a;
                    vectorComposeKt$Group$1 = new InterfaceC2041a<C10001b>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$1
                        @Override // cm.InterfaceC2041a
                        /* JADX INFO: renamed from: E */
                        public final C10001b mo807E() {
                            return new C10001b();
                        }
                    };
                    composerImplMo1636j.mo1622c(-548224868);
                    if (composerImplMo1636j.f2910a instanceof C10006g) {
                        C8573r0.m16771y0();
                        throw null;
                    }
                    composerImplMo1636j.m1658u0();
                    if (composerImplMo1636j.f2897L) {
                        composerImplMo1636j.mo1634i(vectorComposeKt$Group$1);
                    } else {
                        composerImplMo1636j.mo1653s();
                    }
                    C8573r0.m16714a1(composerImplMo1636j, str2, new InterfaceC2056p<C10001b, String, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$1
                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(C10001b c10001b, String str3) {
                            C10001b c10001b2 = c10001b;
                            String str4 = str3;
                            C5207g.m11111f(c10001b2, "$this$set");
                            C5207g.m11111f(str4, "it");
                            c10001b2.f50825i = str4;
                            c10001b2.m18593c();
                            return C9072e.f47360a;
                        }
                    });
                    C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f18), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$2
                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                            C10001b c10001b2 = c10001b;
                            float fFloatValue = f30.floatValue();
                            C5207g.m11111f(c10001b2, "$this$set");
                            c10001b2.f50826j = fFloatValue;
                            c10001b2.f50833q = true;
                            c10001b2.m18593c();
                            return C9072e.f47360a;
                        }
                    });
                    C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f19), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$3
                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                            C10001b c10001b2 = c10001b;
                            float fFloatValue = f30.floatValue();
                            C5207g.m11111f(c10001b2, "$this$set");
                            c10001b2.f50827k = fFloatValue;
                            c10001b2.f50833q = true;
                            c10001b2.m18593c();
                            return C9072e.f47360a;
                        }
                    });
                    C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f16), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$4
                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                            C10001b c10001b2 = c10001b;
                            float fFloatValue = f30.floatValue();
                            C5207g.m11111f(c10001b2, "$this$set");
                            c10001b2.f50828l = fFloatValue;
                            c10001b2.f50833q = true;
                            c10001b2.m18593c();
                            return C9072e.f47360a;
                        }
                    });
                    C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f17), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$5
                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                            C10001b c10001b2 = c10001b;
                            float fFloatValue = f30.floatValue();
                            C5207g.m11111f(c10001b2, "$this$set");
                            c10001b2.f50829m = fFloatValue;
                            c10001b2.f50833q = true;
                            c10001b2.m18593c();
                            return C9072e.f47360a;
                        }
                    });
                    C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f20), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$6
                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                            C10001b c10001b2 = c10001b;
                            float fFloatValue = f30.floatValue();
                            C5207g.m11111f(c10001b2, "$this$set");
                            c10001b2.f50830n = fFloatValue;
                            c10001b2.f50833q = true;
                            c10001b2.m18593c();
                            return C9072e.f47360a;
                        }
                    });
                    C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f21), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$7
                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                            C10001b c10001b2 = c10001b;
                            float fFloatValue = f30.floatValue();
                            C5207g.m11111f(c10001b2, "$this$set");
                            c10001b2.f50831o = fFloatValue;
                            c10001b2.f50833q = true;
                            c10001b2.m18593c();
                            return C9072e.f47360a;
                        }
                    });
                    C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f22), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$8
                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                            C10001b c10001b2 = c10001b;
                            float fFloatValue = f30.floatValue();
                            C5207g.m11111f(c10001b2, "$this$set");
                            c10001b2.f50832p = fFloatValue;
                            c10001b2.f50833q = true;
                            c10001b2.m18593c();
                            return C9072e.f47360a;
                        }
                    });
                    C8573r0.m16714a1(composerImplMo1636j, list2, new InterfaceC2056p<C10001b, List<? extends AbstractC10003d>, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$9
                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(C10001b c10001b, List<? extends AbstractC10003d> list4) {
                            C10001b c10001b2 = c10001b;
                            List<? extends AbstractC10003d> list5 = list4;
                            C5207g.m11111f(c10001b2, "$this$set");
                            C5207g.m11111f(list5, "it");
                            c10001b2.f50820d = list5;
                            c10001b2.f50821e = true;
                            c10001b2.m18593c();
                            return C9072e.f47360a;
                        }
                    });
                    interfaceC2056p.mo1337m0(composerImplMo1636j, Integer.valueOf((i12 >> 27) & 14));
                    composerImplMo1636j.m1609Q(true);
                    composerImplMo1636j.m1609Q(false);
                    f23 = f19;
                    f24 = f22;
                    f25 = f20;
                    f26 = f21;
                    f27 = f17;
                    list3 = list2;
                    f28 = f18;
                    f29 = f16;
                } else {
                    composerImplMo1636j.m1654s0();
                    if ((i10 & 1) != 0) {
                        if (i27 != 0) {
                            str2 = "";
                        } else {
                            str2 = str;
                        }
                        if (i28 != 0) {
                            f18 = 0.0f;
                        } else {
                            f18 = f3;
                        }
                        if (i13 != 0) {
                            f19 = 0.0f;
                        } else {
                            f19 = f10;
                        }
                        if (i15 != 0) {
                            f16 = 0.0f;
                        }
                        if (i17 != 0) {
                            f17 = 1.0f;
                        }
                        if (i19 == 0) {
                        }
                        if (i21 != 0) {
                            f21 = 0.0f;
                        } else {
                            f21 = f14;
                        }
                        if (i23 == 0) {
                        }
                        if (i25 != 0) {
                            list2 = C10009j.f50944a;
                            i12 &= -234881025;
                        } else {
                            list2 = list;
                        }
                    } else {
                        if (i27 != 0) {
                            str2 = "";
                        } else {
                            str2 = str;
                        }
                        if (i28 != 0) {
                            f18 = 0.0f;
                        } else {
                            f18 = f3;
                        }
                        if (i13 != 0) {
                            f19 = 0.0f;
                        } else {
                            f19 = f10;
                        }
                        if (i15 != 0) {
                            f16 = 0.0f;
                        }
                        if (i17 != 0) {
                            f17 = 1.0f;
                        }
                        if (i19 == 0) {
                        }
                        if (i21 != 0) {
                            f21 = 0.0f;
                        } else {
                            f21 = f14;
                        }
                        if (i23 == 0) {
                        }
                        if (i25 != 0) {
                            list2 = C10009j.f50944a;
                            i12 &= -234881025;
                        } else {
                            list2 = list;
                        }
                    }
                    composerImplMo1636j.m1610R();
                    InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q16 = ComposerKt.f3003a;
                    vectorComposeKt$Group$1 = new InterfaceC2041a<C10001b>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$1
                        @Override // cm.InterfaceC2041a
                        /* JADX INFO: renamed from: E */
                        public final C10001b mo807E() {
                            return new C10001b();
                        }
                    };
                    composerImplMo1636j.mo1622c(-548224868);
                    if (composerImplMo1636j.f2910a instanceof C10006g) {
                        C8573r0.m16771y0();
                        throw null;
                    }
                    composerImplMo1636j.m1658u0();
                    if (composerImplMo1636j.f2897L) {
                        composerImplMo1636j.mo1634i(vectorComposeKt$Group$1);
                    } else {
                        composerImplMo1636j.mo1653s();
                    }
                    C8573r0.m16714a1(composerImplMo1636j, str2, new InterfaceC2056p<C10001b, String, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$1
                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(C10001b c10001b, String str3) {
                            C10001b c10001b2 = c10001b;
                            String str4 = str3;
                            C5207g.m11111f(c10001b2, "$this$set");
                            C5207g.m11111f(str4, "it");
                            c10001b2.f50825i = str4;
                            c10001b2.m18593c();
                            return C9072e.f47360a;
                        }
                    });
                    C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f18), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$2
                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                            C10001b c10001b2 = c10001b;
                            float fFloatValue = f30.floatValue();
                            C5207g.m11111f(c10001b2, "$this$set");
                            c10001b2.f50826j = fFloatValue;
                            c10001b2.f50833q = true;
                            c10001b2.m18593c();
                            return C9072e.f47360a;
                        }
                    });
                    C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f19), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$3
                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                            C10001b c10001b2 = c10001b;
                            float fFloatValue = f30.floatValue();
                            C5207g.m11111f(c10001b2, "$this$set");
                            c10001b2.f50827k = fFloatValue;
                            c10001b2.f50833q = true;
                            c10001b2.m18593c();
                            return C9072e.f47360a;
                        }
                    });
                    C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f16), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$4
                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                            C10001b c10001b2 = c10001b;
                            float fFloatValue = f30.floatValue();
                            C5207g.m11111f(c10001b2, "$this$set");
                            c10001b2.f50828l = fFloatValue;
                            c10001b2.f50833q = true;
                            c10001b2.m18593c();
                            return C9072e.f47360a;
                        }
                    });
                    C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f17), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$5
                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                            C10001b c10001b2 = c10001b;
                            float fFloatValue = f30.floatValue();
                            C5207g.m11111f(c10001b2, "$this$set");
                            c10001b2.f50829m = fFloatValue;
                            c10001b2.f50833q = true;
                            c10001b2.m18593c();
                            return C9072e.f47360a;
                        }
                    });
                    C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f20), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$6
                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                            C10001b c10001b2 = c10001b;
                            float fFloatValue = f30.floatValue();
                            C5207g.m11111f(c10001b2, "$this$set");
                            c10001b2.f50830n = fFloatValue;
                            c10001b2.f50833q = true;
                            c10001b2.m18593c();
                            return C9072e.f47360a;
                        }
                    });
                    C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f21), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$7
                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                            C10001b c10001b2 = c10001b;
                            float fFloatValue = f30.floatValue();
                            C5207g.m11111f(c10001b2, "$this$set");
                            c10001b2.f50831o = fFloatValue;
                            c10001b2.f50833q = true;
                            c10001b2.m18593c();
                            return C9072e.f47360a;
                        }
                    });
                    C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f22), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$8
                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                            C10001b c10001b2 = c10001b;
                            float fFloatValue = f30.floatValue();
                            C5207g.m11111f(c10001b2, "$this$set");
                            c10001b2.f50832p = fFloatValue;
                            c10001b2.f50833q = true;
                            c10001b2.m18593c();
                            return C9072e.f47360a;
                        }
                    });
                    C8573r0.m16714a1(composerImplMo1636j, list2, new InterfaceC2056p<C10001b, List<? extends AbstractC10003d>, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$9
                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(C10001b c10001b, List<? extends AbstractC10003d> list4) {
                            C10001b c10001b2 = c10001b;
                            List<? extends AbstractC10003d> list5 = list4;
                            C5207g.m11111f(c10001b2, "$this$set");
                            C5207g.m11111f(list5, "it");
                            c10001b2.f50820d = list5;
                            c10001b2.f50821e = true;
                            c10001b2.m18593c();
                            return C9072e.f47360a;
                        }
                    });
                    interfaceC2056p.mo1337m0(composerImplMo1636j, Integer.valueOf((i12 >> 27) & 14));
                    composerImplMo1636j.m1609Q(true);
                    composerImplMo1636j.m1609Q(false);
                    f23 = f19;
                    f24 = f22;
                    f25 = f20;
                    f26 = f21;
                    f27 = f17;
                    list3 = list2;
                    f28 = f18;
                    f29 = f16;
                }
                c5332q0M1612T = composerImplMo1636j.m1612T();
                if (c5332q0M1612T == null) {
                    return;
                }
                c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // cm.InterfaceC2056p
                    /* JADX INFO: renamed from: m0 */
                    public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                        num.intValue();
                        VectorComposeKt.m2005a(str2, f28, f23, f29, f27, f25, f26, f24, list3, interfaceC2056p, interfaceC0476a2, C8573r0.m16737l1(i10 | 1), i11);
                        return C9072e.f47360a;
                    }
                };
            }
            i12 |= 384;
            i15 = i11 & 8;
            if (i15 != 0) {
                if ((i10 & 7168) == 0) {
                    f16 = f11;
                    if (composerImplMo1636j.m1592D(f16)) {
                        i16 = 2048;
                    } else {
                        i16 = 1024;
                    }
                    i12 |= i16;
                }
                i17 = i11 & 16;
                if (i17 != 0) {
                    if ((57344 & i10) == 0) {
                        f17 = f12;
                        if (composerImplMo1636j.m1592D(f17)) {
                            i18 = 16384;
                        } else {
                            i18 = 8192;
                        }
                        i12 |= i18;
                    }
                    i19 = i11 & 32;
                    if (i19 != 0) {
                        i12 |= 196608;
                    } else if ((i10 & 458752) == 0) {
                        if (composerImplMo1636j.m1592D(f13)) {
                            i20 = 131072;
                        } else {
                            i20 = 65536;
                        }
                        i12 |= i20;
                    }
                    i21 = i11 & 64;
                    if (i21 != 0) {
                        i12 |= 1572864;
                    } else if ((i10 & 3670016) == 0) {
                        if (composerImplMo1636j.m1592D(f14)) {
                            i22 = 1048576;
                        } else {
                            i22 = 524288;
                        }
                        i12 |= i22;
                    }
                    i23 = i11 & BuildConfig.SDK_TRUNCATE_LENGTH;
                    if (i23 != 0) {
                        i12 |= 12582912;
                    } else if ((i10 & 29360128) == 0) {
                        if (composerImplMo1636j.m1592D(f15)) {
                            i24 = 8388608;
                        } else {
                            i24 = 4194304;
                        }
                        i12 |= i24;
                    }
                    i25 = i11 & 256;
                    if (i25 != 0) {
                        i12 |= 33554432;
                    }
                    if ((i11 & 512) != 0) {
                        if ((1879048192 & i10) == 0) {
                            if (composerImplMo1636j.m1600H(interfaceC2056p)) {
                                i26 = 536870912;
                            } else {
                                i26 = 268435456;
                            }
                        }
                        if (i25 != 256) {
                            composerImplMo1636j.m1654s0();
                            if ((i10 & 1) != 0) {
                                if (i27 != 0) {
                                    str2 = "";
                                } else {
                                    str2 = str;
                                }
                                if (i28 != 0) {
                                    f18 = 0.0f;
                                } else {
                                    f18 = f3;
                                }
                                if (i13 != 0) {
                                    f19 = 0.0f;
                                } else {
                                    f19 = f10;
                                }
                                if (i15 != 0) {
                                    f16 = 0.0f;
                                }
                                if (i17 != 0) {
                                    f17 = 1.0f;
                                }
                                if (i19 == 0) {
                                }
                                if (i21 != 0) {
                                    f21 = 0.0f;
                                } else {
                                    f21 = f14;
                                }
                                if (i23 == 0) {
                                }
                                if (i25 != 0) {
                                    list2 = C10009j.f50944a;
                                    i12 &= -234881025;
                                } else {
                                    list2 = list;
                                }
                            } else {
                                if (i27 != 0) {
                                    str2 = "";
                                } else {
                                    str2 = str;
                                }
                                if (i28 != 0) {
                                    f18 = 0.0f;
                                } else {
                                    f18 = f3;
                                }
                                if (i13 != 0) {
                                    f19 = 0.0f;
                                } else {
                                    f19 = f10;
                                }
                                if (i15 != 0) {
                                    f16 = 0.0f;
                                }
                                if (i17 != 0) {
                                    f17 = 1.0f;
                                }
                                if (i19 == 0) {
                                }
                                if (i21 != 0) {
                                    f21 = 0.0f;
                                } else {
                                    f21 = f14;
                                }
                                if (i23 == 0) {
                                }
                                if (i25 != 0) {
                                    list2 = C10009j.f50944a;
                                    i12 &= -234881025;
                                } else {
                                    list2 = list;
                                }
                            }
                            composerImplMo1636j.m1610R();
                            InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q17 = ComposerKt.f3003a;
                            vectorComposeKt$Group$1 = new InterfaceC2041a<C10001b>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$1
                                @Override // cm.InterfaceC2041a
                                /* JADX INFO: renamed from: E */
                                public final C10001b mo807E() {
                                    return new C10001b();
                                }
                            };
                            composerImplMo1636j.mo1622c(-548224868);
                            if (composerImplMo1636j.f2910a instanceof C10006g) {
                                C8573r0.m16771y0();
                                throw null;
                            }
                            composerImplMo1636j.m1658u0();
                            if (composerImplMo1636j.f2897L) {
                                composerImplMo1636j.mo1634i(vectorComposeKt$Group$1);
                            } else {
                                composerImplMo1636j.mo1653s();
                            }
                            C8573r0.m16714a1(composerImplMo1636j, str2, new InterfaceC2056p<C10001b, String, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$1
                                @Override // cm.InterfaceC2056p
                                /* JADX INFO: renamed from: m0 */
                                public final C9072e mo1337m0(C10001b c10001b, String str3) {
                                    C10001b c10001b2 = c10001b;
                                    String str4 = str3;
                                    C5207g.m11111f(c10001b2, "$this$set");
                                    C5207g.m11111f(str4, "it");
                                    c10001b2.f50825i = str4;
                                    c10001b2.m18593c();
                                    return C9072e.f47360a;
                                }
                            });
                            C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f18), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$2
                                @Override // cm.InterfaceC2056p
                                /* JADX INFO: renamed from: m0 */
                                public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                                    C10001b c10001b2 = c10001b;
                                    float fFloatValue = f30.floatValue();
                                    C5207g.m11111f(c10001b2, "$this$set");
                                    c10001b2.f50826j = fFloatValue;
                                    c10001b2.f50833q = true;
                                    c10001b2.m18593c();
                                    return C9072e.f47360a;
                                }
                            });
                            C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f19), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$3
                                @Override // cm.InterfaceC2056p
                                /* JADX INFO: renamed from: m0 */
                                public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                                    C10001b c10001b2 = c10001b;
                                    float fFloatValue = f30.floatValue();
                                    C5207g.m11111f(c10001b2, "$this$set");
                                    c10001b2.f50827k = fFloatValue;
                                    c10001b2.f50833q = true;
                                    c10001b2.m18593c();
                                    return C9072e.f47360a;
                                }
                            });
                            C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f16), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$4
                                @Override // cm.InterfaceC2056p
                                /* JADX INFO: renamed from: m0 */
                                public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                                    C10001b c10001b2 = c10001b;
                                    float fFloatValue = f30.floatValue();
                                    C5207g.m11111f(c10001b2, "$this$set");
                                    c10001b2.f50828l = fFloatValue;
                                    c10001b2.f50833q = true;
                                    c10001b2.m18593c();
                                    return C9072e.f47360a;
                                }
                            });
                            C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f17), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$5
                                @Override // cm.InterfaceC2056p
                                /* JADX INFO: renamed from: m0 */
                                public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                                    C10001b c10001b2 = c10001b;
                                    float fFloatValue = f30.floatValue();
                                    C5207g.m11111f(c10001b2, "$this$set");
                                    c10001b2.f50829m = fFloatValue;
                                    c10001b2.f50833q = true;
                                    c10001b2.m18593c();
                                    return C9072e.f47360a;
                                }
                            });
                            C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f20), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$6
                                @Override // cm.InterfaceC2056p
                                /* JADX INFO: renamed from: m0 */
                                public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                                    C10001b c10001b2 = c10001b;
                                    float fFloatValue = f30.floatValue();
                                    C5207g.m11111f(c10001b2, "$this$set");
                                    c10001b2.f50830n = fFloatValue;
                                    c10001b2.f50833q = true;
                                    c10001b2.m18593c();
                                    return C9072e.f47360a;
                                }
                            });
                            C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f21), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$7
                                @Override // cm.InterfaceC2056p
                                /* JADX INFO: renamed from: m0 */
                                public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                                    C10001b c10001b2 = c10001b;
                                    float fFloatValue = f30.floatValue();
                                    C5207g.m11111f(c10001b2, "$this$set");
                                    c10001b2.f50831o = fFloatValue;
                                    c10001b2.f50833q = true;
                                    c10001b2.m18593c();
                                    return C9072e.f47360a;
                                }
                            });
                            C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f22), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$8
                                @Override // cm.InterfaceC2056p
                                /* JADX INFO: renamed from: m0 */
                                public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                                    C10001b c10001b2 = c10001b;
                                    float fFloatValue = f30.floatValue();
                                    C5207g.m11111f(c10001b2, "$this$set");
                                    c10001b2.f50832p = fFloatValue;
                                    c10001b2.f50833q = true;
                                    c10001b2.m18593c();
                                    return C9072e.f47360a;
                                }
                            });
                            C8573r0.m16714a1(composerImplMo1636j, list2, new InterfaceC2056p<C10001b, List<? extends AbstractC10003d>, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$9
                                @Override // cm.InterfaceC2056p
                                /* JADX INFO: renamed from: m0 */
                                public final C9072e mo1337m0(C10001b c10001b, List<? extends AbstractC10003d> list4) {
                                    C10001b c10001b2 = c10001b;
                                    List<? extends AbstractC10003d> list5 = list4;
                                    C5207g.m11111f(c10001b2, "$this$set");
                                    C5207g.m11111f(list5, "it");
                                    c10001b2.f50820d = list5;
                                    c10001b2.f50821e = true;
                                    c10001b2.m18593c();
                                    return C9072e.f47360a;
                                }
                            });
                            interfaceC2056p.mo1337m0(composerImplMo1636j, Integer.valueOf((i12 >> 27) & 14));
                            composerImplMo1636j.m1609Q(true);
                            composerImplMo1636j.m1609Q(false);
                            f23 = f19;
                            f24 = f22;
                            f25 = f20;
                            f26 = f21;
                            f27 = f17;
                            list3 = list2;
                            f28 = f18;
                            f29 = f16;
                        } else {
                            composerImplMo1636j.m1654s0();
                            if ((i10 & 1) != 0) {
                                if (i27 != 0) {
                                    str2 = "";
                                } else {
                                    str2 = str;
                                }
                                if (i28 != 0) {
                                    f18 = 0.0f;
                                } else {
                                    f18 = f3;
                                }
                                if (i13 != 0) {
                                    f19 = 0.0f;
                                } else {
                                    f19 = f10;
                                }
                                if (i15 != 0) {
                                    f16 = 0.0f;
                                }
                                if (i17 != 0) {
                                    f17 = 1.0f;
                                }
                                if (i19 == 0) {
                                }
                                if (i21 != 0) {
                                    f21 = 0.0f;
                                } else {
                                    f21 = f14;
                                }
                                if (i23 == 0) {
                                }
                                if (i25 != 0) {
                                    list2 = C10009j.f50944a;
                                    i12 &= -234881025;
                                } else {
                                    list2 = list;
                                }
                            } else {
                                if (i27 != 0) {
                                    str2 = "";
                                } else {
                                    str2 = str;
                                }
                                if (i28 != 0) {
                                    f18 = 0.0f;
                                } else {
                                    f18 = f3;
                                }
                                if (i13 != 0) {
                                    f19 = 0.0f;
                                } else {
                                    f19 = f10;
                                }
                                if (i15 != 0) {
                                    f16 = 0.0f;
                                }
                                if (i17 != 0) {
                                    f17 = 1.0f;
                                }
                                if (i19 == 0) {
                                }
                                if (i21 != 0) {
                                    f21 = 0.0f;
                                } else {
                                    f21 = f14;
                                }
                                if (i23 == 0) {
                                }
                                if (i25 != 0) {
                                    list2 = C10009j.f50944a;
                                    i12 &= -234881025;
                                } else {
                                    list2 = list;
                                }
                            }
                            composerImplMo1636j.m1610R();
                            InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q18 = ComposerKt.f3003a;
                            vectorComposeKt$Group$1 = new InterfaceC2041a<C10001b>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$1
                                @Override // cm.InterfaceC2041a
                                /* JADX INFO: renamed from: E */
                                public final C10001b mo807E() {
                                    return new C10001b();
                                }
                            };
                            composerImplMo1636j.mo1622c(-548224868);
                            if (composerImplMo1636j.f2910a instanceof C10006g) {
                                C8573r0.m16771y0();
                                throw null;
                            }
                            composerImplMo1636j.m1658u0();
                            if (composerImplMo1636j.f2897L) {
                                composerImplMo1636j.mo1634i(vectorComposeKt$Group$1);
                            } else {
                                composerImplMo1636j.mo1653s();
                            }
                            C8573r0.m16714a1(composerImplMo1636j, str2, new InterfaceC2056p<C10001b, String, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$1
                                @Override // cm.InterfaceC2056p
                                /* JADX INFO: renamed from: m0 */
                                public final C9072e mo1337m0(C10001b c10001b, String str3) {
                                    C10001b c10001b2 = c10001b;
                                    String str4 = str3;
                                    C5207g.m11111f(c10001b2, "$this$set");
                                    C5207g.m11111f(str4, "it");
                                    c10001b2.f50825i = str4;
                                    c10001b2.m18593c();
                                    return C9072e.f47360a;
                                }
                            });
                            C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f18), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$2
                                @Override // cm.InterfaceC2056p
                                /* JADX INFO: renamed from: m0 */
                                public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                                    C10001b c10001b2 = c10001b;
                                    float fFloatValue = f30.floatValue();
                                    C5207g.m11111f(c10001b2, "$this$set");
                                    c10001b2.f50826j = fFloatValue;
                                    c10001b2.f50833q = true;
                                    c10001b2.m18593c();
                                    return C9072e.f47360a;
                                }
                            });
                            C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f19), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$3
                                @Override // cm.InterfaceC2056p
                                /* JADX INFO: renamed from: m0 */
                                public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                                    C10001b c10001b2 = c10001b;
                                    float fFloatValue = f30.floatValue();
                                    C5207g.m11111f(c10001b2, "$this$set");
                                    c10001b2.f50827k = fFloatValue;
                                    c10001b2.f50833q = true;
                                    c10001b2.m18593c();
                                    return C9072e.f47360a;
                                }
                            });
                            C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f16), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$4
                                @Override // cm.InterfaceC2056p
                                /* JADX INFO: renamed from: m0 */
                                public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                                    C10001b c10001b2 = c10001b;
                                    float fFloatValue = f30.floatValue();
                                    C5207g.m11111f(c10001b2, "$this$set");
                                    c10001b2.f50828l = fFloatValue;
                                    c10001b2.f50833q = true;
                                    c10001b2.m18593c();
                                    return C9072e.f47360a;
                                }
                            });
                            C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f17), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$5
                                @Override // cm.InterfaceC2056p
                                /* JADX INFO: renamed from: m0 */
                                public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                                    C10001b c10001b2 = c10001b;
                                    float fFloatValue = f30.floatValue();
                                    C5207g.m11111f(c10001b2, "$this$set");
                                    c10001b2.f50829m = fFloatValue;
                                    c10001b2.f50833q = true;
                                    c10001b2.m18593c();
                                    return C9072e.f47360a;
                                }
                            });
                            C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f20), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$6
                                @Override // cm.InterfaceC2056p
                                /* JADX INFO: renamed from: m0 */
                                public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                                    C10001b c10001b2 = c10001b;
                                    float fFloatValue = f30.floatValue();
                                    C5207g.m11111f(c10001b2, "$this$set");
                                    c10001b2.f50830n = fFloatValue;
                                    c10001b2.f50833q = true;
                                    c10001b2.m18593c();
                                    return C9072e.f47360a;
                                }
                            });
                            C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f21), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$7
                                @Override // cm.InterfaceC2056p
                                /* JADX INFO: renamed from: m0 */
                                public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                                    C10001b c10001b2 = c10001b;
                                    float fFloatValue = f30.floatValue();
                                    C5207g.m11111f(c10001b2, "$this$set");
                                    c10001b2.f50831o = fFloatValue;
                                    c10001b2.f50833q = true;
                                    c10001b2.m18593c();
                                    return C9072e.f47360a;
                                }
                            });
                            C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f22), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$8
                                @Override // cm.InterfaceC2056p
                                /* JADX INFO: renamed from: m0 */
                                public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                                    C10001b c10001b2 = c10001b;
                                    float fFloatValue = f30.floatValue();
                                    C5207g.m11111f(c10001b2, "$this$set");
                                    c10001b2.f50832p = fFloatValue;
                                    c10001b2.f50833q = true;
                                    c10001b2.m18593c();
                                    return C9072e.f47360a;
                                }
                            });
                            C8573r0.m16714a1(composerImplMo1636j, list2, new InterfaceC2056p<C10001b, List<? extends AbstractC10003d>, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$9
                                @Override // cm.InterfaceC2056p
                                /* JADX INFO: renamed from: m0 */
                                public final C9072e mo1337m0(C10001b c10001b, List<? extends AbstractC10003d> list4) {
                                    C10001b c10001b2 = c10001b;
                                    List<? extends AbstractC10003d> list5 = list4;
                                    C5207g.m11111f(c10001b2, "$this$set");
                                    C5207g.m11111f(list5, "it");
                                    c10001b2.f50820d = list5;
                                    c10001b2.f50821e = true;
                                    c10001b2.m18593c();
                                    return C9072e.f47360a;
                                }
                            });
                            interfaceC2056p.mo1337m0(composerImplMo1636j, Integer.valueOf((i12 >> 27) & 14));
                            composerImplMo1636j.m1609Q(true);
                            composerImplMo1636j.m1609Q(false);
                            f23 = f19;
                            f24 = f22;
                            f25 = f20;
                            f26 = f21;
                            f27 = f17;
                            list3 = list2;
                            f28 = f18;
                            f29 = f16;
                        }
                        c5332q0M1612T = composerImplMo1636j.m1612T();
                        if (c5332q0M1612T == null) {
                            return;
                        }
                        c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$4
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                                num.intValue();
                                VectorComposeKt.m2005a(str2, f28, f23, f29, f27, f25, f26, f24, list3, interfaceC2056p, interfaceC0476a2, C8573r0.m16737l1(i10 | 1), i11);
                                return C9072e.f47360a;
                            }
                        };
                    }
                    i26 = 805306368;
                    i12 |= i26;
                    if (i25 != 256) {
                        composerImplMo1636j.m1654s0();
                        if ((i10 & 1) != 0) {
                            if (i27 != 0) {
                                str2 = "";
                            } else {
                                str2 = str;
                            }
                            if (i28 != 0) {
                                f18 = 0.0f;
                            } else {
                                f18 = f3;
                            }
                            if (i13 != 0) {
                                f19 = 0.0f;
                            } else {
                                f19 = f10;
                            }
                            if (i15 != 0) {
                                f16 = 0.0f;
                            }
                            if (i17 != 0) {
                                f17 = 1.0f;
                            }
                            if (i19 == 0) {
                            }
                            if (i21 != 0) {
                                f21 = 0.0f;
                            } else {
                                f21 = f14;
                            }
                            if (i23 == 0) {
                            }
                            if (i25 != 0) {
                                list2 = C10009j.f50944a;
                                i12 &= -234881025;
                            } else {
                                list2 = list;
                            }
                        } else {
                            if (i27 != 0) {
                                str2 = "";
                            } else {
                                str2 = str;
                            }
                            if (i28 != 0) {
                                f18 = 0.0f;
                            } else {
                                f18 = f3;
                            }
                            if (i13 != 0) {
                                f19 = 0.0f;
                            } else {
                                f19 = f10;
                            }
                            if (i15 != 0) {
                                f16 = 0.0f;
                            }
                            if (i17 != 0) {
                                f17 = 1.0f;
                            }
                            if (i19 == 0) {
                            }
                            if (i21 != 0) {
                                f21 = 0.0f;
                            } else {
                                f21 = f14;
                            }
                            if (i23 == 0) {
                            }
                            if (i25 != 0) {
                                list2 = C10009j.f50944a;
                                i12 &= -234881025;
                            } else {
                                list2 = list;
                            }
                        }
                        composerImplMo1636j.m1610R();
                        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q19 = ComposerKt.f3003a;
                        vectorComposeKt$Group$1 = new InterfaceC2041a<C10001b>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$1
                            @Override // cm.InterfaceC2041a
                            /* JADX INFO: renamed from: E */
                            public final C10001b mo807E() {
                                return new C10001b();
                            }
                        };
                        composerImplMo1636j.mo1622c(-548224868);
                        if (composerImplMo1636j.f2910a instanceof C10006g) {
                            C8573r0.m16771y0();
                            throw null;
                        }
                        composerImplMo1636j.m1658u0();
                        if (composerImplMo1636j.f2897L) {
                            composerImplMo1636j.mo1634i(vectorComposeKt$Group$1);
                        } else {
                            composerImplMo1636j.mo1653s();
                        }
                        C8573r0.m16714a1(composerImplMo1636j, str2, new InterfaceC2056p<C10001b, String, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$1
                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(C10001b c10001b, String str3) {
                                C10001b c10001b2 = c10001b;
                                String str4 = str3;
                                C5207g.m11111f(c10001b2, "$this$set");
                                C5207g.m11111f(str4, "it");
                                c10001b2.f50825i = str4;
                                c10001b2.m18593c();
                                return C9072e.f47360a;
                            }
                        });
                        C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f18), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$2
                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                                C10001b c10001b2 = c10001b;
                                float fFloatValue = f30.floatValue();
                                C5207g.m11111f(c10001b2, "$this$set");
                                c10001b2.f50826j = fFloatValue;
                                c10001b2.f50833q = true;
                                c10001b2.m18593c();
                                return C9072e.f47360a;
                            }
                        });
                        C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f19), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$3
                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                                C10001b c10001b2 = c10001b;
                                float fFloatValue = f30.floatValue();
                                C5207g.m11111f(c10001b2, "$this$set");
                                c10001b2.f50827k = fFloatValue;
                                c10001b2.f50833q = true;
                                c10001b2.m18593c();
                                return C9072e.f47360a;
                            }
                        });
                        C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f16), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$4
                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                                C10001b c10001b2 = c10001b;
                                float fFloatValue = f30.floatValue();
                                C5207g.m11111f(c10001b2, "$this$set");
                                c10001b2.f50828l = fFloatValue;
                                c10001b2.f50833q = true;
                                c10001b2.m18593c();
                                return C9072e.f47360a;
                            }
                        });
                        C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f17), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$5
                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                                C10001b c10001b2 = c10001b;
                                float fFloatValue = f30.floatValue();
                                C5207g.m11111f(c10001b2, "$this$set");
                                c10001b2.f50829m = fFloatValue;
                                c10001b2.f50833q = true;
                                c10001b2.m18593c();
                                return C9072e.f47360a;
                            }
                        });
                        C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f20), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$6
                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                                C10001b c10001b2 = c10001b;
                                float fFloatValue = f30.floatValue();
                                C5207g.m11111f(c10001b2, "$this$set");
                                c10001b2.f50830n = fFloatValue;
                                c10001b2.f50833q = true;
                                c10001b2.m18593c();
                                return C9072e.f47360a;
                            }
                        });
                        C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f21), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$7
                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                                C10001b c10001b2 = c10001b;
                                float fFloatValue = f30.floatValue();
                                C5207g.m11111f(c10001b2, "$this$set");
                                c10001b2.f50831o = fFloatValue;
                                c10001b2.f50833q = true;
                                c10001b2.m18593c();
                                return C9072e.f47360a;
                            }
                        });
                        C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f22), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$8
                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                                C10001b c10001b2 = c10001b;
                                float fFloatValue = f30.floatValue();
                                C5207g.m11111f(c10001b2, "$this$set");
                                c10001b2.f50832p = fFloatValue;
                                c10001b2.f50833q = true;
                                c10001b2.m18593c();
                                return C9072e.f47360a;
                            }
                        });
                        C8573r0.m16714a1(composerImplMo1636j, list2, new InterfaceC2056p<C10001b, List<? extends AbstractC10003d>, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$9
                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(C10001b c10001b, List<? extends AbstractC10003d> list4) {
                                C10001b c10001b2 = c10001b;
                                List<? extends AbstractC10003d> list5 = list4;
                                C5207g.m11111f(c10001b2, "$this$set");
                                C5207g.m11111f(list5, "it");
                                c10001b2.f50820d = list5;
                                c10001b2.f50821e = true;
                                c10001b2.m18593c();
                                return C9072e.f47360a;
                            }
                        });
                        interfaceC2056p.mo1337m0(composerImplMo1636j, Integer.valueOf((i12 >> 27) & 14));
                        composerImplMo1636j.m1609Q(true);
                        composerImplMo1636j.m1609Q(false);
                        f23 = f19;
                        f24 = f22;
                        f25 = f20;
                        f26 = f21;
                        f27 = f17;
                        list3 = list2;
                        f28 = f18;
                        f29 = f16;
                    } else {
                        composerImplMo1636j.m1654s0();
                        if ((i10 & 1) != 0) {
                            if (i27 != 0) {
                                str2 = "";
                            } else {
                                str2 = str;
                            }
                            if (i28 != 0) {
                                f18 = 0.0f;
                            } else {
                                f18 = f3;
                            }
                            if (i13 != 0) {
                                f19 = 0.0f;
                            } else {
                                f19 = f10;
                            }
                            if (i15 != 0) {
                                f16 = 0.0f;
                            }
                            if (i17 != 0) {
                                f17 = 1.0f;
                            }
                            if (i19 == 0) {
                            }
                            if (i21 != 0) {
                                f21 = 0.0f;
                            } else {
                                f21 = f14;
                            }
                            if (i23 == 0) {
                            }
                            if (i25 != 0) {
                                list2 = C10009j.f50944a;
                                i12 &= -234881025;
                            } else {
                                list2 = list;
                            }
                        } else {
                            if (i27 != 0) {
                                str2 = "";
                            } else {
                                str2 = str;
                            }
                            if (i28 != 0) {
                                f18 = 0.0f;
                            } else {
                                f18 = f3;
                            }
                            if (i13 != 0) {
                                f19 = 0.0f;
                            } else {
                                f19 = f10;
                            }
                            if (i15 != 0) {
                                f16 = 0.0f;
                            }
                            if (i17 != 0) {
                                f17 = 1.0f;
                            }
                            if (i19 == 0) {
                            }
                            if (i21 != 0) {
                                f21 = 0.0f;
                            } else {
                                f21 = f14;
                            }
                            if (i23 == 0) {
                            }
                            if (i25 != 0) {
                                list2 = C10009j.f50944a;
                                i12 &= -234881025;
                            } else {
                                list2 = list;
                            }
                        }
                        composerImplMo1636j.m1610R();
                        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q110 = ComposerKt.f3003a;
                        vectorComposeKt$Group$1 = new InterfaceC2041a<C10001b>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$1
                            @Override // cm.InterfaceC2041a
                            /* JADX INFO: renamed from: E */
                            public final C10001b mo807E() {
                                return new C10001b();
                            }
                        };
                        composerImplMo1636j.mo1622c(-548224868);
                        if (composerImplMo1636j.f2910a instanceof C10006g) {
                            C8573r0.m16771y0();
                            throw null;
                        }
                        composerImplMo1636j.m1658u0();
                        if (composerImplMo1636j.f2897L) {
                            composerImplMo1636j.mo1634i(vectorComposeKt$Group$1);
                        } else {
                            composerImplMo1636j.mo1653s();
                        }
                        C8573r0.m16714a1(composerImplMo1636j, str2, new InterfaceC2056p<C10001b, String, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$1
                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(C10001b c10001b, String str3) {
                                C10001b c10001b2 = c10001b;
                                String str4 = str3;
                                C5207g.m11111f(c10001b2, "$this$set");
                                C5207g.m11111f(str4, "it");
                                c10001b2.f50825i = str4;
                                c10001b2.m18593c();
                                return C9072e.f47360a;
                            }
                        });
                        C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f18), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$2
                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                                C10001b c10001b2 = c10001b;
                                float fFloatValue = f30.floatValue();
                                C5207g.m11111f(c10001b2, "$this$set");
                                c10001b2.f50826j = fFloatValue;
                                c10001b2.f50833q = true;
                                c10001b2.m18593c();
                                return C9072e.f47360a;
                            }
                        });
                        C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f19), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$3
                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                                C10001b c10001b2 = c10001b;
                                float fFloatValue = f30.floatValue();
                                C5207g.m11111f(c10001b2, "$this$set");
                                c10001b2.f50827k = fFloatValue;
                                c10001b2.f50833q = true;
                                c10001b2.m18593c();
                                return C9072e.f47360a;
                            }
                        });
                        C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f16), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$4
                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                                C10001b c10001b2 = c10001b;
                                float fFloatValue = f30.floatValue();
                                C5207g.m11111f(c10001b2, "$this$set");
                                c10001b2.f50828l = fFloatValue;
                                c10001b2.f50833q = true;
                                c10001b2.m18593c();
                                return C9072e.f47360a;
                            }
                        });
                        C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f17), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$5
                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                                C10001b c10001b2 = c10001b;
                                float fFloatValue = f30.floatValue();
                                C5207g.m11111f(c10001b2, "$this$set");
                                c10001b2.f50829m = fFloatValue;
                                c10001b2.f50833q = true;
                                c10001b2.m18593c();
                                return C9072e.f47360a;
                            }
                        });
                        C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f20), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$6
                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                                C10001b c10001b2 = c10001b;
                                float fFloatValue = f30.floatValue();
                                C5207g.m11111f(c10001b2, "$this$set");
                                c10001b2.f50830n = fFloatValue;
                                c10001b2.f50833q = true;
                                c10001b2.m18593c();
                                return C9072e.f47360a;
                            }
                        });
                        C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f21), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$7
                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                                C10001b c10001b2 = c10001b;
                                float fFloatValue = f30.floatValue();
                                C5207g.m11111f(c10001b2, "$this$set");
                                c10001b2.f50831o = fFloatValue;
                                c10001b2.f50833q = true;
                                c10001b2.m18593c();
                                return C9072e.f47360a;
                            }
                        });
                        C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f22), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$8
                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                                C10001b c10001b2 = c10001b;
                                float fFloatValue = f30.floatValue();
                                C5207g.m11111f(c10001b2, "$this$set");
                                c10001b2.f50832p = fFloatValue;
                                c10001b2.f50833q = true;
                                c10001b2.m18593c();
                                return C9072e.f47360a;
                            }
                        });
                        C8573r0.m16714a1(composerImplMo1636j, list2, new InterfaceC2056p<C10001b, List<? extends AbstractC10003d>, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$9
                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(C10001b c10001b, List<? extends AbstractC10003d> list4) {
                                C10001b c10001b2 = c10001b;
                                List<? extends AbstractC10003d> list5 = list4;
                                C5207g.m11111f(c10001b2, "$this$set");
                                C5207g.m11111f(list5, "it");
                                c10001b2.f50820d = list5;
                                c10001b2.f50821e = true;
                                c10001b2.m18593c();
                                return C9072e.f47360a;
                            }
                        });
                        interfaceC2056p.mo1337m0(composerImplMo1636j, Integer.valueOf((i12 >> 27) & 14));
                        composerImplMo1636j.m1609Q(true);
                        composerImplMo1636j.m1609Q(false);
                        f23 = f19;
                        f24 = f22;
                        f25 = f20;
                        f26 = f21;
                        f27 = f17;
                        list3 = list2;
                        f28 = f18;
                        f29 = f16;
                    }
                    c5332q0M1612T = composerImplMo1636j.m1612T();
                    if (c5332q0M1612T == null) {
                        return;
                    }
                    c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$4
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                            num.intValue();
                            VectorComposeKt.m2005a(str2, f28, f23, f29, f27, f25, f26, f24, list3, interfaceC2056p, interfaceC0476a2, C8573r0.m16737l1(i10 | 1), i11);
                            return C9072e.f47360a;
                        }
                    };
                }
                i12 |= 24576;
                f17 = f12;
                i19 = i11 & 32;
                if (i19 != 0) {
                    i12 |= 196608;
                } else if ((i10 & 458752) == 0) {
                    if (composerImplMo1636j.m1592D(f13)) {
                        i20 = 131072;
                    } else {
                        i20 = 65536;
                    }
                    i12 |= i20;
                }
                i21 = i11 & 64;
                if (i21 != 0) {
                    i12 |= 1572864;
                } else if ((i10 & 3670016) == 0) {
                    if (composerImplMo1636j.m1592D(f14)) {
                        i22 = 1048576;
                    } else {
                        i22 = 524288;
                    }
                    i12 |= i22;
                }
                i23 = i11 & BuildConfig.SDK_TRUNCATE_LENGTH;
                if (i23 != 0) {
                    i12 |= 12582912;
                } else if ((i10 & 29360128) == 0) {
                    if (composerImplMo1636j.m1592D(f15)) {
                        i24 = 8388608;
                    } else {
                        i24 = 4194304;
                    }
                    i12 |= i24;
                }
                i25 = i11 & 256;
                if (i25 != 0) {
                    i12 |= 33554432;
                }
                if ((i11 & 512) != 0) {
                    if ((1879048192 & i10) == 0) {
                        if (composerImplMo1636j.m1600H(interfaceC2056p)) {
                            i26 = 536870912;
                        } else {
                            i26 = 268435456;
                        }
                    }
                    if (i25 != 256) {
                        composerImplMo1636j.m1654s0();
                        if ((i10 & 1) != 0) {
                            if (i27 != 0) {
                                str2 = "";
                            } else {
                                str2 = str;
                            }
                            if (i28 != 0) {
                                f18 = 0.0f;
                            } else {
                                f18 = f3;
                            }
                            if (i13 != 0) {
                                f19 = 0.0f;
                            } else {
                                f19 = f10;
                            }
                            if (i15 != 0) {
                                f16 = 0.0f;
                            }
                            if (i17 != 0) {
                                f17 = 1.0f;
                            }
                            if (i19 == 0) {
                            }
                            if (i21 != 0) {
                                f21 = 0.0f;
                            } else {
                                f21 = f14;
                            }
                            if (i23 == 0) {
                            }
                            if (i25 != 0) {
                                list2 = C10009j.f50944a;
                                i12 &= -234881025;
                            } else {
                                list2 = list;
                            }
                        } else {
                            if (i27 != 0) {
                                str2 = "";
                            } else {
                                str2 = str;
                            }
                            if (i28 != 0) {
                                f18 = 0.0f;
                            } else {
                                f18 = f3;
                            }
                            if (i13 != 0) {
                                f19 = 0.0f;
                            } else {
                                f19 = f10;
                            }
                            if (i15 != 0) {
                                f16 = 0.0f;
                            }
                            if (i17 != 0) {
                                f17 = 1.0f;
                            }
                            if (i19 == 0) {
                            }
                            if (i21 != 0) {
                                f21 = 0.0f;
                            } else {
                                f21 = f14;
                            }
                            if (i23 == 0) {
                            }
                            if (i25 != 0) {
                                list2 = C10009j.f50944a;
                                i12 &= -234881025;
                            } else {
                                list2 = list;
                            }
                        }
                        composerImplMo1636j.m1610R();
                        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q111 = ComposerKt.f3003a;
                        vectorComposeKt$Group$1 = new InterfaceC2041a<C10001b>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$1
                            @Override // cm.InterfaceC2041a
                            /* JADX INFO: renamed from: E */
                            public final C10001b mo807E() {
                                return new C10001b();
                            }
                        };
                        composerImplMo1636j.mo1622c(-548224868);
                        if (composerImplMo1636j.f2910a instanceof C10006g) {
                            C8573r0.m16771y0();
                            throw null;
                        }
                        composerImplMo1636j.m1658u0();
                        if (composerImplMo1636j.f2897L) {
                            composerImplMo1636j.mo1634i(vectorComposeKt$Group$1);
                        } else {
                            composerImplMo1636j.mo1653s();
                        }
                        C8573r0.m16714a1(composerImplMo1636j, str2, new InterfaceC2056p<C10001b, String, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$1
                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(C10001b c10001b, String str3) {
                                C10001b c10001b2 = c10001b;
                                String str4 = str3;
                                C5207g.m11111f(c10001b2, "$this$set");
                                C5207g.m11111f(str4, "it");
                                c10001b2.f50825i = str4;
                                c10001b2.m18593c();
                                return C9072e.f47360a;
                            }
                        });
                        C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f18), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$2
                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                                C10001b c10001b2 = c10001b;
                                float fFloatValue = f30.floatValue();
                                C5207g.m11111f(c10001b2, "$this$set");
                                c10001b2.f50826j = fFloatValue;
                                c10001b2.f50833q = true;
                                c10001b2.m18593c();
                                return C9072e.f47360a;
                            }
                        });
                        C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f19), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$3
                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                                C10001b c10001b2 = c10001b;
                                float fFloatValue = f30.floatValue();
                                C5207g.m11111f(c10001b2, "$this$set");
                                c10001b2.f50827k = fFloatValue;
                                c10001b2.f50833q = true;
                                c10001b2.m18593c();
                                return C9072e.f47360a;
                            }
                        });
                        C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f16), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$4
                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                                C10001b c10001b2 = c10001b;
                                float fFloatValue = f30.floatValue();
                                C5207g.m11111f(c10001b2, "$this$set");
                                c10001b2.f50828l = fFloatValue;
                                c10001b2.f50833q = true;
                                c10001b2.m18593c();
                                return C9072e.f47360a;
                            }
                        });
                        C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f17), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$5
                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                                C10001b c10001b2 = c10001b;
                                float fFloatValue = f30.floatValue();
                                C5207g.m11111f(c10001b2, "$this$set");
                                c10001b2.f50829m = fFloatValue;
                                c10001b2.f50833q = true;
                                c10001b2.m18593c();
                                return C9072e.f47360a;
                            }
                        });
                        C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f20), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$6
                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                                C10001b c10001b2 = c10001b;
                                float fFloatValue = f30.floatValue();
                                C5207g.m11111f(c10001b2, "$this$set");
                                c10001b2.f50830n = fFloatValue;
                                c10001b2.f50833q = true;
                                c10001b2.m18593c();
                                return C9072e.f47360a;
                            }
                        });
                        C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f21), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$7
                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                                C10001b c10001b2 = c10001b;
                                float fFloatValue = f30.floatValue();
                                C5207g.m11111f(c10001b2, "$this$set");
                                c10001b2.f50831o = fFloatValue;
                                c10001b2.f50833q = true;
                                c10001b2.m18593c();
                                return C9072e.f47360a;
                            }
                        });
                        C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f22), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$8
                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                                C10001b c10001b2 = c10001b;
                                float fFloatValue = f30.floatValue();
                                C5207g.m11111f(c10001b2, "$this$set");
                                c10001b2.f50832p = fFloatValue;
                                c10001b2.f50833q = true;
                                c10001b2.m18593c();
                                return C9072e.f47360a;
                            }
                        });
                        C8573r0.m16714a1(composerImplMo1636j, list2, new InterfaceC2056p<C10001b, List<? extends AbstractC10003d>, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$9
                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(C10001b c10001b, List<? extends AbstractC10003d> list4) {
                                C10001b c10001b2 = c10001b;
                                List<? extends AbstractC10003d> list5 = list4;
                                C5207g.m11111f(c10001b2, "$this$set");
                                C5207g.m11111f(list5, "it");
                                c10001b2.f50820d = list5;
                                c10001b2.f50821e = true;
                                c10001b2.m18593c();
                                return C9072e.f47360a;
                            }
                        });
                        interfaceC2056p.mo1337m0(composerImplMo1636j, Integer.valueOf((i12 >> 27) & 14));
                        composerImplMo1636j.m1609Q(true);
                        composerImplMo1636j.m1609Q(false);
                        f23 = f19;
                        f24 = f22;
                        f25 = f20;
                        f26 = f21;
                        f27 = f17;
                        list3 = list2;
                        f28 = f18;
                        f29 = f16;
                    } else {
                        composerImplMo1636j.m1654s0();
                        if ((i10 & 1) != 0) {
                            if (i27 != 0) {
                                str2 = "";
                            } else {
                                str2 = str;
                            }
                            if (i28 != 0) {
                                f18 = 0.0f;
                            } else {
                                f18 = f3;
                            }
                            if (i13 != 0) {
                                f19 = 0.0f;
                            } else {
                                f19 = f10;
                            }
                            if (i15 != 0) {
                                f16 = 0.0f;
                            }
                            if (i17 != 0) {
                                f17 = 1.0f;
                            }
                            if (i19 == 0) {
                            }
                            if (i21 != 0) {
                                f21 = 0.0f;
                            } else {
                                f21 = f14;
                            }
                            if (i23 == 0) {
                            }
                            if (i25 != 0) {
                                list2 = C10009j.f50944a;
                                i12 &= -234881025;
                            } else {
                                list2 = list;
                            }
                        } else {
                            if (i27 != 0) {
                                str2 = "";
                            } else {
                                str2 = str;
                            }
                            if (i28 != 0) {
                                f18 = 0.0f;
                            } else {
                                f18 = f3;
                            }
                            if (i13 != 0) {
                                f19 = 0.0f;
                            } else {
                                f19 = f10;
                            }
                            if (i15 != 0) {
                                f16 = 0.0f;
                            }
                            if (i17 != 0) {
                                f17 = 1.0f;
                            }
                            if (i19 == 0) {
                            }
                            if (i21 != 0) {
                                f21 = 0.0f;
                            } else {
                                f21 = f14;
                            }
                            if (i23 == 0) {
                            }
                            if (i25 != 0) {
                                list2 = C10009j.f50944a;
                                i12 &= -234881025;
                            } else {
                                list2 = list;
                            }
                        }
                        composerImplMo1636j.m1610R();
                        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q112 = ComposerKt.f3003a;
                        vectorComposeKt$Group$1 = new InterfaceC2041a<C10001b>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$1
                            @Override // cm.InterfaceC2041a
                            /* JADX INFO: renamed from: E */
                            public final C10001b mo807E() {
                                return new C10001b();
                            }
                        };
                        composerImplMo1636j.mo1622c(-548224868);
                        if (composerImplMo1636j.f2910a instanceof C10006g) {
                            C8573r0.m16771y0();
                            throw null;
                        }
                        composerImplMo1636j.m1658u0();
                        if (composerImplMo1636j.f2897L) {
                            composerImplMo1636j.mo1634i(vectorComposeKt$Group$1);
                        } else {
                            composerImplMo1636j.mo1653s();
                        }
                        C8573r0.m16714a1(composerImplMo1636j, str2, new InterfaceC2056p<C10001b, String, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$1
                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(C10001b c10001b, String str3) {
                                C10001b c10001b2 = c10001b;
                                String str4 = str3;
                                C5207g.m11111f(c10001b2, "$this$set");
                                C5207g.m11111f(str4, "it");
                                c10001b2.f50825i = str4;
                                c10001b2.m18593c();
                                return C9072e.f47360a;
                            }
                        });
                        C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f18), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$2
                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                                C10001b c10001b2 = c10001b;
                                float fFloatValue = f30.floatValue();
                                C5207g.m11111f(c10001b2, "$this$set");
                                c10001b2.f50826j = fFloatValue;
                                c10001b2.f50833q = true;
                                c10001b2.m18593c();
                                return C9072e.f47360a;
                            }
                        });
                        C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f19), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$3
                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                                C10001b c10001b2 = c10001b;
                                float fFloatValue = f30.floatValue();
                                C5207g.m11111f(c10001b2, "$this$set");
                                c10001b2.f50827k = fFloatValue;
                                c10001b2.f50833q = true;
                                c10001b2.m18593c();
                                return C9072e.f47360a;
                            }
                        });
                        C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f16), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$4
                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                                C10001b c10001b2 = c10001b;
                                float fFloatValue = f30.floatValue();
                                C5207g.m11111f(c10001b2, "$this$set");
                                c10001b2.f50828l = fFloatValue;
                                c10001b2.f50833q = true;
                                c10001b2.m18593c();
                                return C9072e.f47360a;
                            }
                        });
                        C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f17), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$5
                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                                C10001b c10001b2 = c10001b;
                                float fFloatValue = f30.floatValue();
                                C5207g.m11111f(c10001b2, "$this$set");
                                c10001b2.f50829m = fFloatValue;
                                c10001b2.f50833q = true;
                                c10001b2.m18593c();
                                return C9072e.f47360a;
                            }
                        });
                        C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f20), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$6
                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                                C10001b c10001b2 = c10001b;
                                float fFloatValue = f30.floatValue();
                                C5207g.m11111f(c10001b2, "$this$set");
                                c10001b2.f50830n = fFloatValue;
                                c10001b2.f50833q = true;
                                c10001b2.m18593c();
                                return C9072e.f47360a;
                            }
                        });
                        C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f21), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$7
                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                                C10001b c10001b2 = c10001b;
                                float fFloatValue = f30.floatValue();
                                C5207g.m11111f(c10001b2, "$this$set");
                                c10001b2.f50831o = fFloatValue;
                                c10001b2.f50833q = true;
                                c10001b2.m18593c();
                                return C9072e.f47360a;
                            }
                        });
                        C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f22), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$8
                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                                C10001b c10001b2 = c10001b;
                                float fFloatValue = f30.floatValue();
                                C5207g.m11111f(c10001b2, "$this$set");
                                c10001b2.f50832p = fFloatValue;
                                c10001b2.f50833q = true;
                                c10001b2.m18593c();
                                return C9072e.f47360a;
                            }
                        });
                        C8573r0.m16714a1(composerImplMo1636j, list2, new InterfaceC2056p<C10001b, List<? extends AbstractC10003d>, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$9
                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(C10001b c10001b, List<? extends AbstractC10003d> list4) {
                                C10001b c10001b2 = c10001b;
                                List<? extends AbstractC10003d> list5 = list4;
                                C5207g.m11111f(c10001b2, "$this$set");
                                C5207g.m11111f(list5, "it");
                                c10001b2.f50820d = list5;
                                c10001b2.f50821e = true;
                                c10001b2.m18593c();
                                return C9072e.f47360a;
                            }
                        });
                        interfaceC2056p.mo1337m0(composerImplMo1636j, Integer.valueOf((i12 >> 27) & 14));
                        composerImplMo1636j.m1609Q(true);
                        composerImplMo1636j.m1609Q(false);
                        f23 = f19;
                        f24 = f22;
                        f25 = f20;
                        f26 = f21;
                        f27 = f17;
                        list3 = list2;
                        f28 = f18;
                        f29 = f16;
                    }
                    c5332q0M1612T = composerImplMo1636j.m1612T();
                    if (c5332q0M1612T == null) {
                        return;
                    }
                    c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$4
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                            num.intValue();
                            VectorComposeKt.m2005a(str2, f28, f23, f29, f27, f25, f26, f24, list3, interfaceC2056p, interfaceC0476a2, C8573r0.m16737l1(i10 | 1), i11);
                            return C9072e.f47360a;
                        }
                    };
                }
                i26 = 805306368;
                i12 |= i26;
                if (i25 != 256) {
                    composerImplMo1636j.m1654s0();
                    if ((i10 & 1) != 0) {
                        if (i27 != 0) {
                            str2 = "";
                        } else {
                            str2 = str;
                        }
                        if (i28 != 0) {
                            f18 = 0.0f;
                        } else {
                            f18 = f3;
                        }
                        if (i13 != 0) {
                            f19 = 0.0f;
                        } else {
                            f19 = f10;
                        }
                        if (i15 != 0) {
                            f16 = 0.0f;
                        }
                        if (i17 != 0) {
                            f17 = 1.0f;
                        }
                        if (i19 == 0) {
                        }
                        if (i21 != 0) {
                            f21 = 0.0f;
                        } else {
                            f21 = f14;
                        }
                        if (i23 == 0) {
                        }
                        if (i25 != 0) {
                            list2 = C10009j.f50944a;
                            i12 &= -234881025;
                        } else {
                            list2 = list;
                        }
                    } else {
                        if (i27 != 0) {
                            str2 = "";
                        } else {
                            str2 = str;
                        }
                        if (i28 != 0) {
                            f18 = 0.0f;
                        } else {
                            f18 = f3;
                        }
                        if (i13 != 0) {
                            f19 = 0.0f;
                        } else {
                            f19 = f10;
                        }
                        if (i15 != 0) {
                            f16 = 0.0f;
                        }
                        if (i17 != 0) {
                            f17 = 1.0f;
                        }
                        if (i19 == 0) {
                        }
                        if (i21 != 0) {
                            f21 = 0.0f;
                        } else {
                            f21 = f14;
                        }
                        if (i23 == 0) {
                        }
                        if (i25 != 0) {
                            list2 = C10009j.f50944a;
                            i12 &= -234881025;
                        } else {
                            list2 = list;
                        }
                    }
                    composerImplMo1636j.m1610R();
                    InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q113 = ComposerKt.f3003a;
                    vectorComposeKt$Group$1 = new InterfaceC2041a<C10001b>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$1
                        @Override // cm.InterfaceC2041a
                        /* JADX INFO: renamed from: E */
                        public final C10001b mo807E() {
                            return new C10001b();
                        }
                    };
                    composerImplMo1636j.mo1622c(-548224868);
                    if (composerImplMo1636j.f2910a instanceof C10006g) {
                        C8573r0.m16771y0();
                        throw null;
                    }
                    composerImplMo1636j.m1658u0();
                    if (composerImplMo1636j.f2897L) {
                        composerImplMo1636j.mo1634i(vectorComposeKt$Group$1);
                    } else {
                        composerImplMo1636j.mo1653s();
                    }
                    C8573r0.m16714a1(composerImplMo1636j, str2, new InterfaceC2056p<C10001b, String, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$1
                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(C10001b c10001b, String str3) {
                            C10001b c10001b2 = c10001b;
                            String str4 = str3;
                            C5207g.m11111f(c10001b2, "$this$set");
                            C5207g.m11111f(str4, "it");
                            c10001b2.f50825i = str4;
                            c10001b2.m18593c();
                            return C9072e.f47360a;
                        }
                    });
                    C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f18), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$2
                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                            C10001b c10001b2 = c10001b;
                            float fFloatValue = f30.floatValue();
                            C5207g.m11111f(c10001b2, "$this$set");
                            c10001b2.f50826j = fFloatValue;
                            c10001b2.f50833q = true;
                            c10001b2.m18593c();
                            return C9072e.f47360a;
                        }
                    });
                    C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f19), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$3
                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                            C10001b c10001b2 = c10001b;
                            float fFloatValue = f30.floatValue();
                            C5207g.m11111f(c10001b2, "$this$set");
                            c10001b2.f50827k = fFloatValue;
                            c10001b2.f50833q = true;
                            c10001b2.m18593c();
                            return C9072e.f47360a;
                        }
                    });
                    C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f16), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$4
                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                            C10001b c10001b2 = c10001b;
                            float fFloatValue = f30.floatValue();
                            C5207g.m11111f(c10001b2, "$this$set");
                            c10001b2.f50828l = fFloatValue;
                            c10001b2.f50833q = true;
                            c10001b2.m18593c();
                            return C9072e.f47360a;
                        }
                    });
                    C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f17), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$5
                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                            C10001b c10001b2 = c10001b;
                            float fFloatValue = f30.floatValue();
                            C5207g.m11111f(c10001b2, "$this$set");
                            c10001b2.f50829m = fFloatValue;
                            c10001b2.f50833q = true;
                            c10001b2.m18593c();
                            return C9072e.f47360a;
                        }
                    });
                    C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f20), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$6
                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                            C10001b c10001b2 = c10001b;
                            float fFloatValue = f30.floatValue();
                            C5207g.m11111f(c10001b2, "$this$set");
                            c10001b2.f50830n = fFloatValue;
                            c10001b2.f50833q = true;
                            c10001b2.m18593c();
                            return C9072e.f47360a;
                        }
                    });
                    C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f21), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$7
                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                            C10001b c10001b2 = c10001b;
                            float fFloatValue = f30.floatValue();
                            C5207g.m11111f(c10001b2, "$this$set");
                            c10001b2.f50831o = fFloatValue;
                            c10001b2.f50833q = true;
                            c10001b2.m18593c();
                            return C9072e.f47360a;
                        }
                    });
                    C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f22), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$8
                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                            C10001b c10001b2 = c10001b;
                            float fFloatValue = f30.floatValue();
                            C5207g.m11111f(c10001b2, "$this$set");
                            c10001b2.f50832p = fFloatValue;
                            c10001b2.f50833q = true;
                            c10001b2.m18593c();
                            return C9072e.f47360a;
                        }
                    });
                    C8573r0.m16714a1(composerImplMo1636j, list2, new InterfaceC2056p<C10001b, List<? extends AbstractC10003d>, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$9
                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(C10001b c10001b, List<? extends AbstractC10003d> list4) {
                            C10001b c10001b2 = c10001b;
                            List<? extends AbstractC10003d> list5 = list4;
                            C5207g.m11111f(c10001b2, "$this$set");
                            C5207g.m11111f(list5, "it");
                            c10001b2.f50820d = list5;
                            c10001b2.f50821e = true;
                            c10001b2.m18593c();
                            return C9072e.f47360a;
                        }
                    });
                    interfaceC2056p.mo1337m0(composerImplMo1636j, Integer.valueOf((i12 >> 27) & 14));
                    composerImplMo1636j.m1609Q(true);
                    composerImplMo1636j.m1609Q(false);
                    f23 = f19;
                    f24 = f22;
                    f25 = f20;
                    f26 = f21;
                    f27 = f17;
                    list3 = list2;
                    f28 = f18;
                    f29 = f16;
                } else {
                    composerImplMo1636j.m1654s0();
                    if ((i10 & 1) != 0) {
                        if (i27 != 0) {
                            str2 = "";
                        } else {
                            str2 = str;
                        }
                        if (i28 != 0) {
                            f18 = 0.0f;
                        } else {
                            f18 = f3;
                        }
                        if (i13 != 0) {
                            f19 = 0.0f;
                        } else {
                            f19 = f10;
                        }
                        if (i15 != 0) {
                            f16 = 0.0f;
                        }
                        if (i17 != 0) {
                            f17 = 1.0f;
                        }
                        if (i19 == 0) {
                        }
                        if (i21 != 0) {
                            f21 = 0.0f;
                        } else {
                            f21 = f14;
                        }
                        if (i23 == 0) {
                        }
                        if (i25 != 0) {
                            list2 = C10009j.f50944a;
                            i12 &= -234881025;
                        } else {
                            list2 = list;
                        }
                    } else {
                        if (i27 != 0) {
                            str2 = "";
                        } else {
                            str2 = str;
                        }
                        if (i28 != 0) {
                            f18 = 0.0f;
                        } else {
                            f18 = f3;
                        }
                        if (i13 != 0) {
                            f19 = 0.0f;
                        } else {
                            f19 = f10;
                        }
                        if (i15 != 0) {
                            f16 = 0.0f;
                        }
                        if (i17 != 0) {
                            f17 = 1.0f;
                        }
                        if (i19 == 0) {
                        }
                        if (i21 != 0) {
                            f21 = 0.0f;
                        } else {
                            f21 = f14;
                        }
                        if (i23 == 0) {
                        }
                        if (i25 != 0) {
                            list2 = C10009j.f50944a;
                            i12 &= -234881025;
                        } else {
                            list2 = list;
                        }
                    }
                    composerImplMo1636j.m1610R();
                    InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q114 = ComposerKt.f3003a;
                    vectorComposeKt$Group$1 = new InterfaceC2041a<C10001b>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$1
                        @Override // cm.InterfaceC2041a
                        /* JADX INFO: renamed from: E */
                        public final C10001b mo807E() {
                            return new C10001b();
                        }
                    };
                    composerImplMo1636j.mo1622c(-548224868);
                    if (composerImplMo1636j.f2910a instanceof C10006g) {
                        C8573r0.m16771y0();
                        throw null;
                    }
                    composerImplMo1636j.m1658u0();
                    if (composerImplMo1636j.f2897L) {
                        composerImplMo1636j.mo1634i(vectorComposeKt$Group$1);
                    } else {
                        composerImplMo1636j.mo1653s();
                    }
                    C8573r0.m16714a1(composerImplMo1636j, str2, new InterfaceC2056p<C10001b, String, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$1
                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(C10001b c10001b, String str3) {
                            C10001b c10001b2 = c10001b;
                            String str4 = str3;
                            C5207g.m11111f(c10001b2, "$this$set");
                            C5207g.m11111f(str4, "it");
                            c10001b2.f50825i = str4;
                            c10001b2.m18593c();
                            return C9072e.f47360a;
                        }
                    });
                    C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f18), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$2
                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                            C10001b c10001b2 = c10001b;
                            float fFloatValue = f30.floatValue();
                            C5207g.m11111f(c10001b2, "$this$set");
                            c10001b2.f50826j = fFloatValue;
                            c10001b2.f50833q = true;
                            c10001b2.m18593c();
                            return C9072e.f47360a;
                        }
                    });
                    C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f19), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$3
                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                            C10001b c10001b2 = c10001b;
                            float fFloatValue = f30.floatValue();
                            C5207g.m11111f(c10001b2, "$this$set");
                            c10001b2.f50827k = fFloatValue;
                            c10001b2.f50833q = true;
                            c10001b2.m18593c();
                            return C9072e.f47360a;
                        }
                    });
                    C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f16), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$4
                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                            C10001b c10001b2 = c10001b;
                            float fFloatValue = f30.floatValue();
                            C5207g.m11111f(c10001b2, "$this$set");
                            c10001b2.f50828l = fFloatValue;
                            c10001b2.f50833q = true;
                            c10001b2.m18593c();
                            return C9072e.f47360a;
                        }
                    });
                    C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f17), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$5
                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                            C10001b c10001b2 = c10001b;
                            float fFloatValue = f30.floatValue();
                            C5207g.m11111f(c10001b2, "$this$set");
                            c10001b2.f50829m = fFloatValue;
                            c10001b2.f50833q = true;
                            c10001b2.m18593c();
                            return C9072e.f47360a;
                        }
                    });
                    C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f20), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$6
                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                            C10001b c10001b2 = c10001b;
                            float fFloatValue = f30.floatValue();
                            C5207g.m11111f(c10001b2, "$this$set");
                            c10001b2.f50830n = fFloatValue;
                            c10001b2.f50833q = true;
                            c10001b2.m18593c();
                            return C9072e.f47360a;
                        }
                    });
                    C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f21), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$7
                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                            C10001b c10001b2 = c10001b;
                            float fFloatValue = f30.floatValue();
                            C5207g.m11111f(c10001b2, "$this$set");
                            c10001b2.f50831o = fFloatValue;
                            c10001b2.f50833q = true;
                            c10001b2.m18593c();
                            return C9072e.f47360a;
                        }
                    });
                    C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f22), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$8
                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                            C10001b c10001b2 = c10001b;
                            float fFloatValue = f30.floatValue();
                            C5207g.m11111f(c10001b2, "$this$set");
                            c10001b2.f50832p = fFloatValue;
                            c10001b2.f50833q = true;
                            c10001b2.m18593c();
                            return C9072e.f47360a;
                        }
                    });
                    C8573r0.m16714a1(composerImplMo1636j, list2, new InterfaceC2056p<C10001b, List<? extends AbstractC10003d>, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$9
                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(C10001b c10001b, List<? extends AbstractC10003d> list4) {
                            C10001b c10001b2 = c10001b;
                            List<? extends AbstractC10003d> list5 = list4;
                            C5207g.m11111f(c10001b2, "$this$set");
                            C5207g.m11111f(list5, "it");
                            c10001b2.f50820d = list5;
                            c10001b2.f50821e = true;
                            c10001b2.m18593c();
                            return C9072e.f47360a;
                        }
                    });
                    interfaceC2056p.mo1337m0(composerImplMo1636j, Integer.valueOf((i12 >> 27) & 14));
                    composerImplMo1636j.m1609Q(true);
                    composerImplMo1636j.m1609Q(false);
                    f23 = f19;
                    f24 = f22;
                    f25 = f20;
                    f26 = f21;
                    f27 = f17;
                    list3 = list2;
                    f28 = f18;
                    f29 = f16;
                }
                c5332q0M1612T = composerImplMo1636j.m1612T();
                if (c5332q0M1612T == null) {
                    return;
                }
                c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // cm.InterfaceC2056p
                    /* JADX INFO: renamed from: m0 */
                    public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                        num.intValue();
                        VectorComposeKt.m2005a(str2, f28, f23, f29, f27, f25, f26, f24, list3, interfaceC2056p, interfaceC0476a2, C8573r0.m16737l1(i10 | 1), i11);
                        return C9072e.f47360a;
                    }
                };
            }
            i12 |= 3072;
            f16 = f11;
            i17 = i11 & 16;
            if (i17 != 0) {
                if ((57344 & i10) == 0) {
                    f17 = f12;
                    if (composerImplMo1636j.m1592D(f17)) {
                        i18 = 16384;
                    } else {
                        i18 = 8192;
                    }
                    i12 |= i18;
                }
                i19 = i11 & 32;
                if (i19 != 0) {
                    i12 |= 196608;
                } else if ((i10 & 458752) == 0) {
                    if (composerImplMo1636j.m1592D(f13)) {
                        i20 = 131072;
                    } else {
                        i20 = 65536;
                    }
                    i12 |= i20;
                }
                i21 = i11 & 64;
                if (i21 != 0) {
                    i12 |= 1572864;
                } else if ((i10 & 3670016) == 0) {
                    if (composerImplMo1636j.m1592D(f14)) {
                        i22 = 1048576;
                    } else {
                        i22 = 524288;
                    }
                    i12 |= i22;
                }
                i23 = i11 & BuildConfig.SDK_TRUNCATE_LENGTH;
                if (i23 != 0) {
                    i12 |= 12582912;
                } else if ((i10 & 29360128) == 0) {
                    if (composerImplMo1636j.m1592D(f15)) {
                        i24 = 8388608;
                    } else {
                        i24 = 4194304;
                    }
                    i12 |= i24;
                }
                i25 = i11 & 256;
                if (i25 != 0) {
                    i12 |= 33554432;
                }
                if ((i11 & 512) != 0) {
                    if ((1879048192 & i10) == 0) {
                        if (composerImplMo1636j.m1600H(interfaceC2056p)) {
                            i26 = 536870912;
                        } else {
                            i26 = 268435456;
                        }
                    }
                    if (i25 != 256) {
                        composerImplMo1636j.m1654s0();
                        if ((i10 & 1) != 0) {
                            if (i27 != 0) {
                                str2 = "";
                            } else {
                                str2 = str;
                            }
                            if (i28 != 0) {
                                f18 = 0.0f;
                            } else {
                                f18 = f3;
                            }
                            if (i13 != 0) {
                                f19 = 0.0f;
                            } else {
                                f19 = f10;
                            }
                            if (i15 != 0) {
                                f16 = 0.0f;
                            }
                            if (i17 != 0) {
                                f17 = 1.0f;
                            }
                            if (i19 == 0) {
                            }
                            if (i21 != 0) {
                                f21 = 0.0f;
                            } else {
                                f21 = f14;
                            }
                            if (i23 == 0) {
                            }
                            if (i25 != 0) {
                                list2 = C10009j.f50944a;
                                i12 &= -234881025;
                            } else {
                                list2 = list;
                            }
                        } else {
                            if (i27 != 0) {
                                str2 = "";
                            } else {
                                str2 = str;
                            }
                            if (i28 != 0) {
                                f18 = 0.0f;
                            } else {
                                f18 = f3;
                            }
                            if (i13 != 0) {
                                f19 = 0.0f;
                            } else {
                                f19 = f10;
                            }
                            if (i15 != 0) {
                                f16 = 0.0f;
                            }
                            if (i17 != 0) {
                                f17 = 1.0f;
                            }
                            if (i19 == 0) {
                            }
                            if (i21 != 0) {
                                f21 = 0.0f;
                            } else {
                                f21 = f14;
                            }
                            if (i23 == 0) {
                            }
                            if (i25 != 0) {
                                list2 = C10009j.f50944a;
                                i12 &= -234881025;
                            } else {
                                list2 = list;
                            }
                        }
                        composerImplMo1636j.m1610R();
                        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q115 = ComposerKt.f3003a;
                        vectorComposeKt$Group$1 = new InterfaceC2041a<C10001b>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$1
                            @Override // cm.InterfaceC2041a
                            /* JADX INFO: renamed from: E */
                            public final C10001b mo807E() {
                                return new C10001b();
                            }
                        };
                        composerImplMo1636j.mo1622c(-548224868);
                        if (composerImplMo1636j.f2910a instanceof C10006g) {
                            C8573r0.m16771y0();
                            throw null;
                        }
                        composerImplMo1636j.m1658u0();
                        if (composerImplMo1636j.f2897L) {
                            composerImplMo1636j.mo1634i(vectorComposeKt$Group$1);
                        } else {
                            composerImplMo1636j.mo1653s();
                        }
                        C8573r0.m16714a1(composerImplMo1636j, str2, new InterfaceC2056p<C10001b, String, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$1
                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(C10001b c10001b, String str3) {
                                C10001b c10001b2 = c10001b;
                                String str4 = str3;
                                C5207g.m11111f(c10001b2, "$this$set");
                                C5207g.m11111f(str4, "it");
                                c10001b2.f50825i = str4;
                                c10001b2.m18593c();
                                return C9072e.f47360a;
                            }
                        });
                        C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f18), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$2
                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                                C10001b c10001b2 = c10001b;
                                float fFloatValue = f30.floatValue();
                                C5207g.m11111f(c10001b2, "$this$set");
                                c10001b2.f50826j = fFloatValue;
                                c10001b2.f50833q = true;
                                c10001b2.m18593c();
                                return C9072e.f47360a;
                            }
                        });
                        C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f19), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$3
                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                                C10001b c10001b2 = c10001b;
                                float fFloatValue = f30.floatValue();
                                C5207g.m11111f(c10001b2, "$this$set");
                                c10001b2.f50827k = fFloatValue;
                                c10001b2.f50833q = true;
                                c10001b2.m18593c();
                                return C9072e.f47360a;
                            }
                        });
                        C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f16), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$4
                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                                C10001b c10001b2 = c10001b;
                                float fFloatValue = f30.floatValue();
                                C5207g.m11111f(c10001b2, "$this$set");
                                c10001b2.f50828l = fFloatValue;
                                c10001b2.f50833q = true;
                                c10001b2.m18593c();
                                return C9072e.f47360a;
                            }
                        });
                        C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f17), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$5
                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                                C10001b c10001b2 = c10001b;
                                float fFloatValue = f30.floatValue();
                                C5207g.m11111f(c10001b2, "$this$set");
                                c10001b2.f50829m = fFloatValue;
                                c10001b2.f50833q = true;
                                c10001b2.m18593c();
                                return C9072e.f47360a;
                            }
                        });
                        C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f20), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$6
                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                                C10001b c10001b2 = c10001b;
                                float fFloatValue = f30.floatValue();
                                C5207g.m11111f(c10001b2, "$this$set");
                                c10001b2.f50830n = fFloatValue;
                                c10001b2.f50833q = true;
                                c10001b2.m18593c();
                                return C9072e.f47360a;
                            }
                        });
                        C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f21), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$7
                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                                C10001b c10001b2 = c10001b;
                                float fFloatValue = f30.floatValue();
                                C5207g.m11111f(c10001b2, "$this$set");
                                c10001b2.f50831o = fFloatValue;
                                c10001b2.f50833q = true;
                                c10001b2.m18593c();
                                return C9072e.f47360a;
                            }
                        });
                        C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f22), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$8
                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                                C10001b c10001b2 = c10001b;
                                float fFloatValue = f30.floatValue();
                                C5207g.m11111f(c10001b2, "$this$set");
                                c10001b2.f50832p = fFloatValue;
                                c10001b2.f50833q = true;
                                c10001b2.m18593c();
                                return C9072e.f47360a;
                            }
                        });
                        C8573r0.m16714a1(composerImplMo1636j, list2, new InterfaceC2056p<C10001b, List<? extends AbstractC10003d>, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$9
                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(C10001b c10001b, List<? extends AbstractC10003d> list4) {
                                C10001b c10001b2 = c10001b;
                                List<? extends AbstractC10003d> list5 = list4;
                                C5207g.m11111f(c10001b2, "$this$set");
                                C5207g.m11111f(list5, "it");
                                c10001b2.f50820d = list5;
                                c10001b2.f50821e = true;
                                c10001b2.m18593c();
                                return C9072e.f47360a;
                            }
                        });
                        interfaceC2056p.mo1337m0(composerImplMo1636j, Integer.valueOf((i12 >> 27) & 14));
                        composerImplMo1636j.m1609Q(true);
                        composerImplMo1636j.m1609Q(false);
                        f23 = f19;
                        f24 = f22;
                        f25 = f20;
                        f26 = f21;
                        f27 = f17;
                        list3 = list2;
                        f28 = f18;
                        f29 = f16;
                    } else {
                        composerImplMo1636j.m1654s0();
                        if ((i10 & 1) != 0) {
                            if (i27 != 0) {
                                str2 = "";
                            } else {
                                str2 = str;
                            }
                            if (i28 != 0) {
                                f18 = 0.0f;
                            } else {
                                f18 = f3;
                            }
                            if (i13 != 0) {
                                f19 = 0.0f;
                            } else {
                                f19 = f10;
                            }
                            if (i15 != 0) {
                                f16 = 0.0f;
                            }
                            if (i17 != 0) {
                                f17 = 1.0f;
                            }
                            if (i19 == 0) {
                            }
                            if (i21 != 0) {
                                f21 = 0.0f;
                            } else {
                                f21 = f14;
                            }
                            if (i23 == 0) {
                            }
                            if (i25 != 0) {
                                list2 = C10009j.f50944a;
                                i12 &= -234881025;
                            } else {
                                list2 = list;
                            }
                        } else {
                            if (i27 != 0) {
                                str2 = "";
                            } else {
                                str2 = str;
                            }
                            if (i28 != 0) {
                                f18 = 0.0f;
                            } else {
                                f18 = f3;
                            }
                            if (i13 != 0) {
                                f19 = 0.0f;
                            } else {
                                f19 = f10;
                            }
                            if (i15 != 0) {
                                f16 = 0.0f;
                            }
                            if (i17 != 0) {
                                f17 = 1.0f;
                            }
                            if (i19 == 0) {
                            }
                            if (i21 != 0) {
                                f21 = 0.0f;
                            } else {
                                f21 = f14;
                            }
                            if (i23 == 0) {
                            }
                            if (i25 != 0) {
                                list2 = C10009j.f50944a;
                                i12 &= -234881025;
                            } else {
                                list2 = list;
                            }
                        }
                        composerImplMo1636j.m1610R();
                        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q116 = ComposerKt.f3003a;
                        vectorComposeKt$Group$1 = new InterfaceC2041a<C10001b>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$1
                            @Override // cm.InterfaceC2041a
                            /* JADX INFO: renamed from: E */
                            public final C10001b mo807E() {
                                return new C10001b();
                            }
                        };
                        composerImplMo1636j.mo1622c(-548224868);
                        if (composerImplMo1636j.f2910a instanceof C10006g) {
                            C8573r0.m16771y0();
                            throw null;
                        }
                        composerImplMo1636j.m1658u0();
                        if (composerImplMo1636j.f2897L) {
                            composerImplMo1636j.mo1634i(vectorComposeKt$Group$1);
                        } else {
                            composerImplMo1636j.mo1653s();
                        }
                        C8573r0.m16714a1(composerImplMo1636j, str2, new InterfaceC2056p<C10001b, String, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$1
                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(C10001b c10001b, String str3) {
                                C10001b c10001b2 = c10001b;
                                String str4 = str3;
                                C5207g.m11111f(c10001b2, "$this$set");
                                C5207g.m11111f(str4, "it");
                                c10001b2.f50825i = str4;
                                c10001b2.m18593c();
                                return C9072e.f47360a;
                            }
                        });
                        C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f18), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$2
                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                                C10001b c10001b2 = c10001b;
                                float fFloatValue = f30.floatValue();
                                C5207g.m11111f(c10001b2, "$this$set");
                                c10001b2.f50826j = fFloatValue;
                                c10001b2.f50833q = true;
                                c10001b2.m18593c();
                                return C9072e.f47360a;
                            }
                        });
                        C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f19), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$3
                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                                C10001b c10001b2 = c10001b;
                                float fFloatValue = f30.floatValue();
                                C5207g.m11111f(c10001b2, "$this$set");
                                c10001b2.f50827k = fFloatValue;
                                c10001b2.f50833q = true;
                                c10001b2.m18593c();
                                return C9072e.f47360a;
                            }
                        });
                        C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f16), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$4
                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                                C10001b c10001b2 = c10001b;
                                float fFloatValue = f30.floatValue();
                                C5207g.m11111f(c10001b2, "$this$set");
                                c10001b2.f50828l = fFloatValue;
                                c10001b2.f50833q = true;
                                c10001b2.m18593c();
                                return C9072e.f47360a;
                            }
                        });
                        C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f17), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$5
                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                                C10001b c10001b2 = c10001b;
                                float fFloatValue = f30.floatValue();
                                C5207g.m11111f(c10001b2, "$this$set");
                                c10001b2.f50829m = fFloatValue;
                                c10001b2.f50833q = true;
                                c10001b2.m18593c();
                                return C9072e.f47360a;
                            }
                        });
                        C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f20), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$6
                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                                C10001b c10001b2 = c10001b;
                                float fFloatValue = f30.floatValue();
                                C5207g.m11111f(c10001b2, "$this$set");
                                c10001b2.f50830n = fFloatValue;
                                c10001b2.f50833q = true;
                                c10001b2.m18593c();
                                return C9072e.f47360a;
                            }
                        });
                        C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f21), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$7
                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                                C10001b c10001b2 = c10001b;
                                float fFloatValue = f30.floatValue();
                                C5207g.m11111f(c10001b2, "$this$set");
                                c10001b2.f50831o = fFloatValue;
                                c10001b2.f50833q = true;
                                c10001b2.m18593c();
                                return C9072e.f47360a;
                            }
                        });
                        C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f22), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$8
                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                                C10001b c10001b2 = c10001b;
                                float fFloatValue = f30.floatValue();
                                C5207g.m11111f(c10001b2, "$this$set");
                                c10001b2.f50832p = fFloatValue;
                                c10001b2.f50833q = true;
                                c10001b2.m18593c();
                                return C9072e.f47360a;
                            }
                        });
                        C8573r0.m16714a1(composerImplMo1636j, list2, new InterfaceC2056p<C10001b, List<? extends AbstractC10003d>, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$9
                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(C10001b c10001b, List<? extends AbstractC10003d> list4) {
                                C10001b c10001b2 = c10001b;
                                List<? extends AbstractC10003d> list5 = list4;
                                C5207g.m11111f(c10001b2, "$this$set");
                                C5207g.m11111f(list5, "it");
                                c10001b2.f50820d = list5;
                                c10001b2.f50821e = true;
                                c10001b2.m18593c();
                                return C9072e.f47360a;
                            }
                        });
                        interfaceC2056p.mo1337m0(composerImplMo1636j, Integer.valueOf((i12 >> 27) & 14));
                        composerImplMo1636j.m1609Q(true);
                        composerImplMo1636j.m1609Q(false);
                        f23 = f19;
                        f24 = f22;
                        f25 = f20;
                        f26 = f21;
                        f27 = f17;
                        list3 = list2;
                        f28 = f18;
                        f29 = f16;
                    }
                    c5332q0M1612T = composerImplMo1636j.m1612T();
                    if (c5332q0M1612T == null) {
                        return;
                    }
                    c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$4
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                            num.intValue();
                            VectorComposeKt.m2005a(str2, f28, f23, f29, f27, f25, f26, f24, list3, interfaceC2056p, interfaceC0476a2, C8573r0.m16737l1(i10 | 1), i11);
                            return C9072e.f47360a;
                        }
                    };
                }
                i26 = 805306368;
                i12 |= i26;
                if (i25 != 256) {
                    composerImplMo1636j.m1654s0();
                    if ((i10 & 1) != 0) {
                        if (i27 != 0) {
                            str2 = "";
                        } else {
                            str2 = str;
                        }
                        if (i28 != 0) {
                            f18 = 0.0f;
                        } else {
                            f18 = f3;
                        }
                        if (i13 != 0) {
                            f19 = 0.0f;
                        } else {
                            f19 = f10;
                        }
                        if (i15 != 0) {
                            f16 = 0.0f;
                        }
                        if (i17 != 0) {
                            f17 = 1.0f;
                        }
                        if (i19 == 0) {
                        }
                        if (i21 != 0) {
                            f21 = 0.0f;
                        } else {
                            f21 = f14;
                        }
                        if (i23 == 0) {
                        }
                        if (i25 != 0) {
                            list2 = C10009j.f50944a;
                            i12 &= -234881025;
                        } else {
                            list2 = list;
                        }
                    } else {
                        if (i27 != 0) {
                            str2 = "";
                        } else {
                            str2 = str;
                        }
                        if (i28 != 0) {
                            f18 = 0.0f;
                        } else {
                            f18 = f3;
                        }
                        if (i13 != 0) {
                            f19 = 0.0f;
                        } else {
                            f19 = f10;
                        }
                        if (i15 != 0) {
                            f16 = 0.0f;
                        }
                        if (i17 != 0) {
                            f17 = 1.0f;
                        }
                        if (i19 == 0) {
                        }
                        if (i21 != 0) {
                            f21 = 0.0f;
                        } else {
                            f21 = f14;
                        }
                        if (i23 == 0) {
                        }
                        if (i25 != 0) {
                            list2 = C10009j.f50944a;
                            i12 &= -234881025;
                        } else {
                            list2 = list;
                        }
                    }
                    composerImplMo1636j.m1610R();
                    InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q117 = ComposerKt.f3003a;
                    vectorComposeKt$Group$1 = new InterfaceC2041a<C10001b>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$1
                        @Override // cm.InterfaceC2041a
                        /* JADX INFO: renamed from: E */
                        public final C10001b mo807E() {
                            return new C10001b();
                        }
                    };
                    composerImplMo1636j.mo1622c(-548224868);
                    if (composerImplMo1636j.f2910a instanceof C10006g) {
                        C8573r0.m16771y0();
                        throw null;
                    }
                    composerImplMo1636j.m1658u0();
                    if (composerImplMo1636j.f2897L) {
                        composerImplMo1636j.mo1634i(vectorComposeKt$Group$1);
                    } else {
                        composerImplMo1636j.mo1653s();
                    }
                    C8573r0.m16714a1(composerImplMo1636j, str2, new InterfaceC2056p<C10001b, String, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$1
                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(C10001b c10001b, String str3) {
                            C10001b c10001b2 = c10001b;
                            String str4 = str3;
                            C5207g.m11111f(c10001b2, "$this$set");
                            C5207g.m11111f(str4, "it");
                            c10001b2.f50825i = str4;
                            c10001b2.m18593c();
                            return C9072e.f47360a;
                        }
                    });
                    C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f18), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$2
                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                            C10001b c10001b2 = c10001b;
                            float fFloatValue = f30.floatValue();
                            C5207g.m11111f(c10001b2, "$this$set");
                            c10001b2.f50826j = fFloatValue;
                            c10001b2.f50833q = true;
                            c10001b2.m18593c();
                            return C9072e.f47360a;
                        }
                    });
                    C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f19), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$3
                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                            C10001b c10001b2 = c10001b;
                            float fFloatValue = f30.floatValue();
                            C5207g.m11111f(c10001b2, "$this$set");
                            c10001b2.f50827k = fFloatValue;
                            c10001b2.f50833q = true;
                            c10001b2.m18593c();
                            return C9072e.f47360a;
                        }
                    });
                    C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f16), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$4
                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                            C10001b c10001b2 = c10001b;
                            float fFloatValue = f30.floatValue();
                            C5207g.m11111f(c10001b2, "$this$set");
                            c10001b2.f50828l = fFloatValue;
                            c10001b2.f50833q = true;
                            c10001b2.m18593c();
                            return C9072e.f47360a;
                        }
                    });
                    C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f17), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$5
                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                            C10001b c10001b2 = c10001b;
                            float fFloatValue = f30.floatValue();
                            C5207g.m11111f(c10001b2, "$this$set");
                            c10001b2.f50829m = fFloatValue;
                            c10001b2.f50833q = true;
                            c10001b2.m18593c();
                            return C9072e.f47360a;
                        }
                    });
                    C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f20), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$6
                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                            C10001b c10001b2 = c10001b;
                            float fFloatValue = f30.floatValue();
                            C5207g.m11111f(c10001b2, "$this$set");
                            c10001b2.f50830n = fFloatValue;
                            c10001b2.f50833q = true;
                            c10001b2.m18593c();
                            return C9072e.f47360a;
                        }
                    });
                    C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f21), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$7
                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                            C10001b c10001b2 = c10001b;
                            float fFloatValue = f30.floatValue();
                            C5207g.m11111f(c10001b2, "$this$set");
                            c10001b2.f50831o = fFloatValue;
                            c10001b2.f50833q = true;
                            c10001b2.m18593c();
                            return C9072e.f47360a;
                        }
                    });
                    C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f22), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$8
                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                            C10001b c10001b2 = c10001b;
                            float fFloatValue = f30.floatValue();
                            C5207g.m11111f(c10001b2, "$this$set");
                            c10001b2.f50832p = fFloatValue;
                            c10001b2.f50833q = true;
                            c10001b2.m18593c();
                            return C9072e.f47360a;
                        }
                    });
                    C8573r0.m16714a1(composerImplMo1636j, list2, new InterfaceC2056p<C10001b, List<? extends AbstractC10003d>, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$9
                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(C10001b c10001b, List<? extends AbstractC10003d> list4) {
                            C10001b c10001b2 = c10001b;
                            List<? extends AbstractC10003d> list5 = list4;
                            C5207g.m11111f(c10001b2, "$this$set");
                            C5207g.m11111f(list5, "it");
                            c10001b2.f50820d = list5;
                            c10001b2.f50821e = true;
                            c10001b2.m18593c();
                            return C9072e.f47360a;
                        }
                    });
                    interfaceC2056p.mo1337m0(composerImplMo1636j, Integer.valueOf((i12 >> 27) & 14));
                    composerImplMo1636j.m1609Q(true);
                    composerImplMo1636j.m1609Q(false);
                    f23 = f19;
                    f24 = f22;
                    f25 = f20;
                    f26 = f21;
                    f27 = f17;
                    list3 = list2;
                    f28 = f18;
                    f29 = f16;
                } else {
                    composerImplMo1636j.m1654s0();
                    if ((i10 & 1) != 0) {
                        if (i27 != 0) {
                            str2 = "";
                        } else {
                            str2 = str;
                        }
                        if (i28 != 0) {
                            f18 = 0.0f;
                        } else {
                            f18 = f3;
                        }
                        if (i13 != 0) {
                            f19 = 0.0f;
                        } else {
                            f19 = f10;
                        }
                        if (i15 != 0) {
                            f16 = 0.0f;
                        }
                        if (i17 != 0) {
                            f17 = 1.0f;
                        }
                        if (i19 == 0) {
                        }
                        if (i21 != 0) {
                            f21 = 0.0f;
                        } else {
                            f21 = f14;
                        }
                        if (i23 == 0) {
                        }
                        if (i25 != 0) {
                            list2 = C10009j.f50944a;
                            i12 &= -234881025;
                        } else {
                            list2 = list;
                        }
                    } else {
                        if (i27 != 0) {
                            str2 = "";
                        } else {
                            str2 = str;
                        }
                        if (i28 != 0) {
                            f18 = 0.0f;
                        } else {
                            f18 = f3;
                        }
                        if (i13 != 0) {
                            f19 = 0.0f;
                        } else {
                            f19 = f10;
                        }
                        if (i15 != 0) {
                            f16 = 0.0f;
                        }
                        if (i17 != 0) {
                            f17 = 1.0f;
                        }
                        if (i19 == 0) {
                        }
                        if (i21 != 0) {
                            f21 = 0.0f;
                        } else {
                            f21 = f14;
                        }
                        if (i23 == 0) {
                        }
                        if (i25 != 0) {
                            list2 = C10009j.f50944a;
                            i12 &= -234881025;
                        } else {
                            list2 = list;
                        }
                    }
                    composerImplMo1636j.m1610R();
                    InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q118 = ComposerKt.f3003a;
                    vectorComposeKt$Group$1 = new InterfaceC2041a<C10001b>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$1
                        @Override // cm.InterfaceC2041a
                        /* JADX INFO: renamed from: E */
                        public final C10001b mo807E() {
                            return new C10001b();
                        }
                    };
                    composerImplMo1636j.mo1622c(-548224868);
                    if (composerImplMo1636j.f2910a instanceof C10006g) {
                        C8573r0.m16771y0();
                        throw null;
                    }
                    composerImplMo1636j.m1658u0();
                    if (composerImplMo1636j.f2897L) {
                        composerImplMo1636j.mo1634i(vectorComposeKt$Group$1);
                    } else {
                        composerImplMo1636j.mo1653s();
                    }
                    C8573r0.m16714a1(composerImplMo1636j, str2, new InterfaceC2056p<C10001b, String, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$1
                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(C10001b c10001b, String str3) {
                            C10001b c10001b2 = c10001b;
                            String str4 = str3;
                            C5207g.m11111f(c10001b2, "$this$set");
                            C5207g.m11111f(str4, "it");
                            c10001b2.f50825i = str4;
                            c10001b2.m18593c();
                            return C9072e.f47360a;
                        }
                    });
                    C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f18), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$2
                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                            C10001b c10001b2 = c10001b;
                            float fFloatValue = f30.floatValue();
                            C5207g.m11111f(c10001b2, "$this$set");
                            c10001b2.f50826j = fFloatValue;
                            c10001b2.f50833q = true;
                            c10001b2.m18593c();
                            return C9072e.f47360a;
                        }
                    });
                    C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f19), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$3
                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                            C10001b c10001b2 = c10001b;
                            float fFloatValue = f30.floatValue();
                            C5207g.m11111f(c10001b2, "$this$set");
                            c10001b2.f50827k = fFloatValue;
                            c10001b2.f50833q = true;
                            c10001b2.m18593c();
                            return C9072e.f47360a;
                        }
                    });
                    C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f16), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$4
                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                            C10001b c10001b2 = c10001b;
                            float fFloatValue = f30.floatValue();
                            C5207g.m11111f(c10001b2, "$this$set");
                            c10001b2.f50828l = fFloatValue;
                            c10001b2.f50833q = true;
                            c10001b2.m18593c();
                            return C9072e.f47360a;
                        }
                    });
                    C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f17), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$5
                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                            C10001b c10001b2 = c10001b;
                            float fFloatValue = f30.floatValue();
                            C5207g.m11111f(c10001b2, "$this$set");
                            c10001b2.f50829m = fFloatValue;
                            c10001b2.f50833q = true;
                            c10001b2.m18593c();
                            return C9072e.f47360a;
                        }
                    });
                    C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f20), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$6
                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                            C10001b c10001b2 = c10001b;
                            float fFloatValue = f30.floatValue();
                            C5207g.m11111f(c10001b2, "$this$set");
                            c10001b2.f50830n = fFloatValue;
                            c10001b2.f50833q = true;
                            c10001b2.m18593c();
                            return C9072e.f47360a;
                        }
                    });
                    C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f21), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$7
                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                            C10001b c10001b2 = c10001b;
                            float fFloatValue = f30.floatValue();
                            C5207g.m11111f(c10001b2, "$this$set");
                            c10001b2.f50831o = fFloatValue;
                            c10001b2.f50833q = true;
                            c10001b2.m18593c();
                            return C9072e.f47360a;
                        }
                    });
                    C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f22), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$8
                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                            C10001b c10001b2 = c10001b;
                            float fFloatValue = f30.floatValue();
                            C5207g.m11111f(c10001b2, "$this$set");
                            c10001b2.f50832p = fFloatValue;
                            c10001b2.f50833q = true;
                            c10001b2.m18593c();
                            return C9072e.f47360a;
                        }
                    });
                    C8573r0.m16714a1(composerImplMo1636j, list2, new InterfaceC2056p<C10001b, List<? extends AbstractC10003d>, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$9
                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(C10001b c10001b, List<? extends AbstractC10003d> list4) {
                            C10001b c10001b2 = c10001b;
                            List<? extends AbstractC10003d> list5 = list4;
                            C5207g.m11111f(c10001b2, "$this$set");
                            C5207g.m11111f(list5, "it");
                            c10001b2.f50820d = list5;
                            c10001b2.f50821e = true;
                            c10001b2.m18593c();
                            return C9072e.f47360a;
                        }
                    });
                    interfaceC2056p.mo1337m0(composerImplMo1636j, Integer.valueOf((i12 >> 27) & 14));
                    composerImplMo1636j.m1609Q(true);
                    composerImplMo1636j.m1609Q(false);
                    f23 = f19;
                    f24 = f22;
                    f25 = f20;
                    f26 = f21;
                    f27 = f17;
                    list3 = list2;
                    f28 = f18;
                    f29 = f16;
                }
                c5332q0M1612T = composerImplMo1636j.m1612T();
                if (c5332q0M1612T == null) {
                    return;
                }
                c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // cm.InterfaceC2056p
                    /* JADX INFO: renamed from: m0 */
                    public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                        num.intValue();
                        VectorComposeKt.m2005a(str2, f28, f23, f29, f27, f25, f26, f24, list3, interfaceC2056p, interfaceC0476a2, C8573r0.m16737l1(i10 | 1), i11);
                        return C9072e.f47360a;
                    }
                };
            }
            i12 |= 24576;
            f17 = f12;
            i19 = i11 & 32;
            if (i19 != 0) {
                i12 |= 196608;
            } else if ((i10 & 458752) == 0) {
                if (composerImplMo1636j.m1592D(f13)) {
                    i20 = 131072;
                } else {
                    i20 = 65536;
                }
                i12 |= i20;
            }
            i21 = i11 & 64;
            if (i21 != 0) {
                i12 |= 1572864;
            } else if ((i10 & 3670016) == 0) {
                if (composerImplMo1636j.m1592D(f14)) {
                    i22 = 1048576;
                } else {
                    i22 = 524288;
                }
                i12 |= i22;
            }
            i23 = i11 & BuildConfig.SDK_TRUNCATE_LENGTH;
            if (i23 != 0) {
                i12 |= 12582912;
            } else if ((i10 & 29360128) == 0) {
                if (composerImplMo1636j.m1592D(f15)) {
                    i24 = 8388608;
                } else {
                    i24 = 4194304;
                }
                i12 |= i24;
            }
            i25 = i11 & 256;
            if (i25 != 0) {
                i12 |= 33554432;
            }
            if ((i11 & 512) != 0) {
                if ((1879048192 & i10) == 0) {
                    if (composerImplMo1636j.m1600H(interfaceC2056p)) {
                        i26 = 536870912;
                    } else {
                        i26 = 268435456;
                    }
                }
                if (i25 != 256) {
                    composerImplMo1636j.m1654s0();
                    if ((i10 & 1) != 0) {
                        if (i27 != 0) {
                            str2 = "";
                        } else {
                            str2 = str;
                        }
                        if (i28 != 0) {
                            f18 = 0.0f;
                        } else {
                            f18 = f3;
                        }
                        if (i13 != 0) {
                            f19 = 0.0f;
                        } else {
                            f19 = f10;
                        }
                        if (i15 != 0) {
                            f16 = 0.0f;
                        }
                        if (i17 != 0) {
                            f17 = 1.0f;
                        }
                        if (i19 == 0) {
                        }
                        if (i21 != 0) {
                            f21 = 0.0f;
                        } else {
                            f21 = f14;
                        }
                        if (i23 == 0) {
                        }
                        if (i25 != 0) {
                            list2 = C10009j.f50944a;
                            i12 &= -234881025;
                        } else {
                            list2 = list;
                        }
                    } else {
                        if (i27 != 0) {
                            str2 = "";
                        } else {
                            str2 = str;
                        }
                        if (i28 != 0) {
                            f18 = 0.0f;
                        } else {
                            f18 = f3;
                        }
                        if (i13 != 0) {
                            f19 = 0.0f;
                        } else {
                            f19 = f10;
                        }
                        if (i15 != 0) {
                            f16 = 0.0f;
                        }
                        if (i17 != 0) {
                            f17 = 1.0f;
                        }
                        if (i19 == 0) {
                        }
                        if (i21 != 0) {
                            f21 = 0.0f;
                        } else {
                            f21 = f14;
                        }
                        if (i23 == 0) {
                        }
                        if (i25 != 0) {
                            list2 = C10009j.f50944a;
                            i12 &= -234881025;
                        } else {
                            list2 = list;
                        }
                    }
                    composerImplMo1636j.m1610R();
                    InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q119 = ComposerKt.f3003a;
                    vectorComposeKt$Group$1 = new InterfaceC2041a<C10001b>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$1
                        @Override // cm.InterfaceC2041a
                        /* JADX INFO: renamed from: E */
                        public final C10001b mo807E() {
                            return new C10001b();
                        }
                    };
                    composerImplMo1636j.mo1622c(-548224868);
                    if (composerImplMo1636j.f2910a instanceof C10006g) {
                        C8573r0.m16771y0();
                        throw null;
                    }
                    composerImplMo1636j.m1658u0();
                    if (composerImplMo1636j.f2897L) {
                        composerImplMo1636j.mo1634i(vectorComposeKt$Group$1);
                    } else {
                        composerImplMo1636j.mo1653s();
                    }
                    C8573r0.m16714a1(composerImplMo1636j, str2, new InterfaceC2056p<C10001b, String, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$1
                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(C10001b c10001b, String str3) {
                            C10001b c10001b2 = c10001b;
                            String str4 = str3;
                            C5207g.m11111f(c10001b2, "$this$set");
                            C5207g.m11111f(str4, "it");
                            c10001b2.f50825i = str4;
                            c10001b2.m18593c();
                            return C9072e.f47360a;
                        }
                    });
                    C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f18), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$2
                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                            C10001b c10001b2 = c10001b;
                            float fFloatValue = f30.floatValue();
                            C5207g.m11111f(c10001b2, "$this$set");
                            c10001b2.f50826j = fFloatValue;
                            c10001b2.f50833q = true;
                            c10001b2.m18593c();
                            return C9072e.f47360a;
                        }
                    });
                    C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f19), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$3
                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                            C10001b c10001b2 = c10001b;
                            float fFloatValue = f30.floatValue();
                            C5207g.m11111f(c10001b2, "$this$set");
                            c10001b2.f50827k = fFloatValue;
                            c10001b2.f50833q = true;
                            c10001b2.m18593c();
                            return C9072e.f47360a;
                        }
                    });
                    C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f16), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$4
                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                            C10001b c10001b2 = c10001b;
                            float fFloatValue = f30.floatValue();
                            C5207g.m11111f(c10001b2, "$this$set");
                            c10001b2.f50828l = fFloatValue;
                            c10001b2.f50833q = true;
                            c10001b2.m18593c();
                            return C9072e.f47360a;
                        }
                    });
                    C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f17), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$5
                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                            C10001b c10001b2 = c10001b;
                            float fFloatValue = f30.floatValue();
                            C5207g.m11111f(c10001b2, "$this$set");
                            c10001b2.f50829m = fFloatValue;
                            c10001b2.f50833q = true;
                            c10001b2.m18593c();
                            return C9072e.f47360a;
                        }
                    });
                    C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f20), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$6
                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                            C10001b c10001b2 = c10001b;
                            float fFloatValue = f30.floatValue();
                            C5207g.m11111f(c10001b2, "$this$set");
                            c10001b2.f50830n = fFloatValue;
                            c10001b2.f50833q = true;
                            c10001b2.m18593c();
                            return C9072e.f47360a;
                        }
                    });
                    C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f21), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$7
                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                            C10001b c10001b2 = c10001b;
                            float fFloatValue = f30.floatValue();
                            C5207g.m11111f(c10001b2, "$this$set");
                            c10001b2.f50831o = fFloatValue;
                            c10001b2.f50833q = true;
                            c10001b2.m18593c();
                            return C9072e.f47360a;
                        }
                    });
                    C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f22), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$8
                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                            C10001b c10001b2 = c10001b;
                            float fFloatValue = f30.floatValue();
                            C5207g.m11111f(c10001b2, "$this$set");
                            c10001b2.f50832p = fFloatValue;
                            c10001b2.f50833q = true;
                            c10001b2.m18593c();
                            return C9072e.f47360a;
                        }
                    });
                    C8573r0.m16714a1(composerImplMo1636j, list2, new InterfaceC2056p<C10001b, List<? extends AbstractC10003d>, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$9
                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(C10001b c10001b, List<? extends AbstractC10003d> list4) {
                            C10001b c10001b2 = c10001b;
                            List<? extends AbstractC10003d> list5 = list4;
                            C5207g.m11111f(c10001b2, "$this$set");
                            C5207g.m11111f(list5, "it");
                            c10001b2.f50820d = list5;
                            c10001b2.f50821e = true;
                            c10001b2.m18593c();
                            return C9072e.f47360a;
                        }
                    });
                    interfaceC2056p.mo1337m0(composerImplMo1636j, Integer.valueOf((i12 >> 27) & 14));
                    composerImplMo1636j.m1609Q(true);
                    composerImplMo1636j.m1609Q(false);
                    f23 = f19;
                    f24 = f22;
                    f25 = f20;
                    f26 = f21;
                    f27 = f17;
                    list3 = list2;
                    f28 = f18;
                    f29 = f16;
                } else {
                    composerImplMo1636j.m1654s0();
                    if ((i10 & 1) != 0) {
                        if (i27 != 0) {
                            str2 = "";
                        } else {
                            str2 = str;
                        }
                        if (i28 != 0) {
                            f18 = 0.0f;
                        } else {
                            f18 = f3;
                        }
                        if (i13 != 0) {
                            f19 = 0.0f;
                        } else {
                            f19 = f10;
                        }
                        if (i15 != 0) {
                            f16 = 0.0f;
                        }
                        if (i17 != 0) {
                            f17 = 1.0f;
                        }
                        if (i19 == 0) {
                        }
                        if (i21 != 0) {
                            f21 = 0.0f;
                        } else {
                            f21 = f14;
                        }
                        if (i23 == 0) {
                        }
                        if (i25 != 0) {
                            list2 = C10009j.f50944a;
                            i12 &= -234881025;
                        } else {
                            list2 = list;
                        }
                    } else {
                        if (i27 != 0) {
                            str2 = "";
                        } else {
                            str2 = str;
                        }
                        if (i28 != 0) {
                            f18 = 0.0f;
                        } else {
                            f18 = f3;
                        }
                        if (i13 != 0) {
                            f19 = 0.0f;
                        } else {
                            f19 = f10;
                        }
                        if (i15 != 0) {
                            f16 = 0.0f;
                        }
                        if (i17 != 0) {
                            f17 = 1.0f;
                        }
                        if (i19 == 0) {
                        }
                        if (i21 != 0) {
                            f21 = 0.0f;
                        } else {
                            f21 = f14;
                        }
                        if (i23 == 0) {
                        }
                        if (i25 != 0) {
                            list2 = C10009j.f50944a;
                            i12 &= -234881025;
                        } else {
                            list2 = list;
                        }
                    }
                    composerImplMo1636j.m1610R();
                    InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q1110 = ComposerKt.f3003a;
                    vectorComposeKt$Group$1 = new InterfaceC2041a<C10001b>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$1
                        @Override // cm.InterfaceC2041a
                        /* JADX INFO: renamed from: E */
                        public final C10001b mo807E() {
                            return new C10001b();
                        }
                    };
                    composerImplMo1636j.mo1622c(-548224868);
                    if (composerImplMo1636j.f2910a instanceof C10006g) {
                        C8573r0.m16771y0();
                        throw null;
                    }
                    composerImplMo1636j.m1658u0();
                    if (composerImplMo1636j.f2897L) {
                        composerImplMo1636j.mo1634i(vectorComposeKt$Group$1);
                    } else {
                        composerImplMo1636j.mo1653s();
                    }
                    C8573r0.m16714a1(composerImplMo1636j, str2, new InterfaceC2056p<C10001b, String, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$1
                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(C10001b c10001b, String str3) {
                            C10001b c10001b2 = c10001b;
                            String str4 = str3;
                            C5207g.m11111f(c10001b2, "$this$set");
                            C5207g.m11111f(str4, "it");
                            c10001b2.f50825i = str4;
                            c10001b2.m18593c();
                            return C9072e.f47360a;
                        }
                    });
                    C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f18), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$2
                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                            C10001b c10001b2 = c10001b;
                            float fFloatValue = f30.floatValue();
                            C5207g.m11111f(c10001b2, "$this$set");
                            c10001b2.f50826j = fFloatValue;
                            c10001b2.f50833q = true;
                            c10001b2.m18593c();
                            return C9072e.f47360a;
                        }
                    });
                    C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f19), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$3
                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                            C10001b c10001b2 = c10001b;
                            float fFloatValue = f30.floatValue();
                            C5207g.m11111f(c10001b2, "$this$set");
                            c10001b2.f50827k = fFloatValue;
                            c10001b2.f50833q = true;
                            c10001b2.m18593c();
                            return C9072e.f47360a;
                        }
                    });
                    C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f16), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$4
                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                            C10001b c10001b2 = c10001b;
                            float fFloatValue = f30.floatValue();
                            C5207g.m11111f(c10001b2, "$this$set");
                            c10001b2.f50828l = fFloatValue;
                            c10001b2.f50833q = true;
                            c10001b2.m18593c();
                            return C9072e.f47360a;
                        }
                    });
                    C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f17), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$5
                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                            C10001b c10001b2 = c10001b;
                            float fFloatValue = f30.floatValue();
                            C5207g.m11111f(c10001b2, "$this$set");
                            c10001b2.f50829m = fFloatValue;
                            c10001b2.f50833q = true;
                            c10001b2.m18593c();
                            return C9072e.f47360a;
                        }
                    });
                    C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f20), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$6
                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                            C10001b c10001b2 = c10001b;
                            float fFloatValue = f30.floatValue();
                            C5207g.m11111f(c10001b2, "$this$set");
                            c10001b2.f50830n = fFloatValue;
                            c10001b2.f50833q = true;
                            c10001b2.m18593c();
                            return C9072e.f47360a;
                        }
                    });
                    C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f21), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$7
                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                            C10001b c10001b2 = c10001b;
                            float fFloatValue = f30.floatValue();
                            C5207g.m11111f(c10001b2, "$this$set");
                            c10001b2.f50831o = fFloatValue;
                            c10001b2.f50833q = true;
                            c10001b2.m18593c();
                            return C9072e.f47360a;
                        }
                    });
                    C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f22), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$8
                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                            C10001b c10001b2 = c10001b;
                            float fFloatValue = f30.floatValue();
                            C5207g.m11111f(c10001b2, "$this$set");
                            c10001b2.f50832p = fFloatValue;
                            c10001b2.f50833q = true;
                            c10001b2.m18593c();
                            return C9072e.f47360a;
                        }
                    });
                    C8573r0.m16714a1(composerImplMo1636j, list2, new InterfaceC2056p<C10001b, List<? extends AbstractC10003d>, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$9
                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(C10001b c10001b, List<? extends AbstractC10003d> list4) {
                            C10001b c10001b2 = c10001b;
                            List<? extends AbstractC10003d> list5 = list4;
                            C5207g.m11111f(c10001b2, "$this$set");
                            C5207g.m11111f(list5, "it");
                            c10001b2.f50820d = list5;
                            c10001b2.f50821e = true;
                            c10001b2.m18593c();
                            return C9072e.f47360a;
                        }
                    });
                    interfaceC2056p.mo1337m0(composerImplMo1636j, Integer.valueOf((i12 >> 27) & 14));
                    composerImplMo1636j.m1609Q(true);
                    composerImplMo1636j.m1609Q(false);
                    f23 = f19;
                    f24 = f22;
                    f25 = f20;
                    f26 = f21;
                    f27 = f17;
                    list3 = list2;
                    f28 = f18;
                    f29 = f16;
                }
                c5332q0M1612T = composerImplMo1636j.m1612T();
                if (c5332q0M1612T == null) {
                    return;
                }
                c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // cm.InterfaceC2056p
                    /* JADX INFO: renamed from: m0 */
                    public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                        num.intValue();
                        VectorComposeKt.m2005a(str2, f28, f23, f29, f27, f25, f26, f24, list3, interfaceC2056p, interfaceC0476a2, C8573r0.m16737l1(i10 | 1), i11);
                        return C9072e.f47360a;
                    }
                };
            }
            i26 = 805306368;
            i12 |= i26;
            if (i25 != 256) {
                composerImplMo1636j.m1654s0();
                if ((i10 & 1) != 0) {
                    if (i27 != 0) {
                        str2 = "";
                    } else {
                        str2 = str;
                    }
                    if (i28 != 0) {
                        f18 = 0.0f;
                    } else {
                        f18 = f3;
                    }
                    if (i13 != 0) {
                        f19 = 0.0f;
                    } else {
                        f19 = f10;
                    }
                    if (i15 != 0) {
                        f16 = 0.0f;
                    }
                    if (i17 != 0) {
                        f17 = 1.0f;
                    }
                    if (i19 == 0) {
                    }
                    if (i21 != 0) {
                        f21 = 0.0f;
                    } else {
                        f21 = f14;
                    }
                    if (i23 == 0) {
                    }
                    if (i25 != 0) {
                        list2 = C10009j.f50944a;
                        i12 &= -234881025;
                    } else {
                        list2 = list;
                    }
                } else {
                    if (i27 != 0) {
                        str2 = "";
                    } else {
                        str2 = str;
                    }
                    if (i28 != 0) {
                        f18 = 0.0f;
                    } else {
                        f18 = f3;
                    }
                    if (i13 != 0) {
                        f19 = 0.0f;
                    } else {
                        f19 = f10;
                    }
                    if (i15 != 0) {
                        f16 = 0.0f;
                    }
                    if (i17 != 0) {
                        f17 = 1.0f;
                    }
                    if (i19 == 0) {
                    }
                    if (i21 != 0) {
                        f21 = 0.0f;
                    } else {
                        f21 = f14;
                    }
                    if (i23 == 0) {
                    }
                    if (i25 != 0) {
                        list2 = C10009j.f50944a;
                        i12 &= -234881025;
                    } else {
                        list2 = list;
                    }
                }
                composerImplMo1636j.m1610R();
                InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q1111 = ComposerKt.f3003a;
                vectorComposeKt$Group$1 = new InterfaceC2041a<C10001b>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$1
                    @Override // cm.InterfaceC2041a
                    /* JADX INFO: renamed from: E */
                    public final C10001b mo807E() {
                        return new C10001b();
                    }
                };
                composerImplMo1636j.mo1622c(-548224868);
                if (composerImplMo1636j.f2910a instanceof C10006g) {
                    C8573r0.m16771y0();
                    throw null;
                }
                composerImplMo1636j.m1658u0();
                if (composerImplMo1636j.f2897L) {
                    composerImplMo1636j.mo1634i(vectorComposeKt$Group$1);
                } else {
                    composerImplMo1636j.mo1653s();
                }
                C8573r0.m16714a1(composerImplMo1636j, str2, new InterfaceC2056p<C10001b, String, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$1
                    @Override // cm.InterfaceC2056p
                    /* JADX INFO: renamed from: m0 */
                    public final C9072e mo1337m0(C10001b c10001b, String str3) {
                        C10001b c10001b2 = c10001b;
                        String str4 = str3;
                        C5207g.m11111f(c10001b2, "$this$set");
                        C5207g.m11111f(str4, "it");
                        c10001b2.f50825i = str4;
                        c10001b2.m18593c();
                        return C9072e.f47360a;
                    }
                });
                C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f18), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$2
                    @Override // cm.InterfaceC2056p
                    /* JADX INFO: renamed from: m0 */
                    public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                        C10001b c10001b2 = c10001b;
                        float fFloatValue = f30.floatValue();
                        C5207g.m11111f(c10001b2, "$this$set");
                        c10001b2.f50826j = fFloatValue;
                        c10001b2.f50833q = true;
                        c10001b2.m18593c();
                        return C9072e.f47360a;
                    }
                });
                C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f19), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$3
                    @Override // cm.InterfaceC2056p
                    /* JADX INFO: renamed from: m0 */
                    public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                        C10001b c10001b2 = c10001b;
                        float fFloatValue = f30.floatValue();
                        C5207g.m11111f(c10001b2, "$this$set");
                        c10001b2.f50827k = fFloatValue;
                        c10001b2.f50833q = true;
                        c10001b2.m18593c();
                        return C9072e.f47360a;
                    }
                });
                C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f16), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$4
                    @Override // cm.InterfaceC2056p
                    /* JADX INFO: renamed from: m0 */
                    public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                        C10001b c10001b2 = c10001b;
                        float fFloatValue = f30.floatValue();
                        C5207g.m11111f(c10001b2, "$this$set");
                        c10001b2.f50828l = fFloatValue;
                        c10001b2.f50833q = true;
                        c10001b2.m18593c();
                        return C9072e.f47360a;
                    }
                });
                C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f17), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$5
                    @Override // cm.InterfaceC2056p
                    /* JADX INFO: renamed from: m0 */
                    public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                        C10001b c10001b2 = c10001b;
                        float fFloatValue = f30.floatValue();
                        C5207g.m11111f(c10001b2, "$this$set");
                        c10001b2.f50829m = fFloatValue;
                        c10001b2.f50833q = true;
                        c10001b2.m18593c();
                        return C9072e.f47360a;
                    }
                });
                C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f20), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$6
                    @Override // cm.InterfaceC2056p
                    /* JADX INFO: renamed from: m0 */
                    public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                        C10001b c10001b2 = c10001b;
                        float fFloatValue = f30.floatValue();
                        C5207g.m11111f(c10001b2, "$this$set");
                        c10001b2.f50830n = fFloatValue;
                        c10001b2.f50833q = true;
                        c10001b2.m18593c();
                        return C9072e.f47360a;
                    }
                });
                C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f21), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$7
                    @Override // cm.InterfaceC2056p
                    /* JADX INFO: renamed from: m0 */
                    public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                        C10001b c10001b2 = c10001b;
                        float fFloatValue = f30.floatValue();
                        C5207g.m11111f(c10001b2, "$this$set");
                        c10001b2.f50831o = fFloatValue;
                        c10001b2.f50833q = true;
                        c10001b2.m18593c();
                        return C9072e.f47360a;
                    }
                });
                C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f22), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$8
                    @Override // cm.InterfaceC2056p
                    /* JADX INFO: renamed from: m0 */
                    public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                        C10001b c10001b2 = c10001b;
                        float fFloatValue = f30.floatValue();
                        C5207g.m11111f(c10001b2, "$this$set");
                        c10001b2.f50832p = fFloatValue;
                        c10001b2.f50833q = true;
                        c10001b2.m18593c();
                        return C9072e.f47360a;
                    }
                });
                C8573r0.m16714a1(composerImplMo1636j, list2, new InterfaceC2056p<C10001b, List<? extends AbstractC10003d>, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$9
                    @Override // cm.InterfaceC2056p
                    /* JADX INFO: renamed from: m0 */
                    public final C9072e mo1337m0(C10001b c10001b, List<? extends AbstractC10003d> list4) {
                        C10001b c10001b2 = c10001b;
                        List<? extends AbstractC10003d> list5 = list4;
                        C5207g.m11111f(c10001b2, "$this$set");
                        C5207g.m11111f(list5, "it");
                        c10001b2.f50820d = list5;
                        c10001b2.f50821e = true;
                        c10001b2.m18593c();
                        return C9072e.f47360a;
                    }
                });
                interfaceC2056p.mo1337m0(composerImplMo1636j, Integer.valueOf((i12 >> 27) & 14));
                composerImplMo1636j.m1609Q(true);
                composerImplMo1636j.m1609Q(false);
                f23 = f19;
                f24 = f22;
                f25 = f20;
                f26 = f21;
                f27 = f17;
                list3 = list2;
                f28 = f18;
                f29 = f16;
            } else {
                composerImplMo1636j.m1654s0();
                if ((i10 & 1) != 0) {
                    if (i27 != 0) {
                        str2 = "";
                    } else {
                        str2 = str;
                    }
                    if (i28 != 0) {
                        f18 = 0.0f;
                    } else {
                        f18 = f3;
                    }
                    if (i13 != 0) {
                        f19 = 0.0f;
                    } else {
                        f19 = f10;
                    }
                    if (i15 != 0) {
                        f16 = 0.0f;
                    }
                    if (i17 != 0) {
                        f17 = 1.0f;
                    }
                    if (i19 == 0) {
                    }
                    if (i21 != 0) {
                        f21 = 0.0f;
                    } else {
                        f21 = f14;
                    }
                    if (i23 == 0) {
                    }
                    if (i25 != 0) {
                        list2 = C10009j.f50944a;
                        i12 &= -234881025;
                    } else {
                        list2 = list;
                    }
                } else {
                    if (i27 != 0) {
                        str2 = "";
                    } else {
                        str2 = str;
                    }
                    if (i28 != 0) {
                        f18 = 0.0f;
                    } else {
                        f18 = f3;
                    }
                    if (i13 != 0) {
                        f19 = 0.0f;
                    } else {
                        f19 = f10;
                    }
                    if (i15 != 0) {
                        f16 = 0.0f;
                    }
                    if (i17 != 0) {
                        f17 = 1.0f;
                    }
                    if (i19 == 0) {
                    }
                    if (i21 != 0) {
                        f21 = 0.0f;
                    } else {
                        f21 = f14;
                    }
                    if (i23 == 0) {
                    }
                    if (i25 != 0) {
                        list2 = C10009j.f50944a;
                        i12 &= -234881025;
                    } else {
                        list2 = list;
                    }
                }
                composerImplMo1636j.m1610R();
                InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q1112 = ComposerKt.f3003a;
                vectorComposeKt$Group$1 = new InterfaceC2041a<C10001b>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$1
                    @Override // cm.InterfaceC2041a
                    /* JADX INFO: renamed from: E */
                    public final C10001b mo807E() {
                        return new C10001b();
                    }
                };
                composerImplMo1636j.mo1622c(-548224868);
                if (composerImplMo1636j.f2910a instanceof C10006g) {
                    C8573r0.m16771y0();
                    throw null;
                }
                composerImplMo1636j.m1658u0();
                if (composerImplMo1636j.f2897L) {
                    composerImplMo1636j.mo1634i(vectorComposeKt$Group$1);
                } else {
                    composerImplMo1636j.mo1653s();
                }
                C8573r0.m16714a1(composerImplMo1636j, str2, new InterfaceC2056p<C10001b, String, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$1
                    @Override // cm.InterfaceC2056p
                    /* JADX INFO: renamed from: m0 */
                    public final C9072e mo1337m0(C10001b c10001b, String str3) {
                        C10001b c10001b2 = c10001b;
                        String str4 = str3;
                        C5207g.m11111f(c10001b2, "$this$set");
                        C5207g.m11111f(str4, "it");
                        c10001b2.f50825i = str4;
                        c10001b2.m18593c();
                        return C9072e.f47360a;
                    }
                });
                C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f18), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$2
                    @Override // cm.InterfaceC2056p
                    /* JADX INFO: renamed from: m0 */
                    public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                        C10001b c10001b2 = c10001b;
                        float fFloatValue = f30.floatValue();
                        C5207g.m11111f(c10001b2, "$this$set");
                        c10001b2.f50826j = fFloatValue;
                        c10001b2.f50833q = true;
                        c10001b2.m18593c();
                        return C9072e.f47360a;
                    }
                });
                C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f19), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$3
                    @Override // cm.InterfaceC2056p
                    /* JADX INFO: renamed from: m0 */
                    public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                        C10001b c10001b2 = c10001b;
                        float fFloatValue = f30.floatValue();
                        C5207g.m11111f(c10001b2, "$this$set");
                        c10001b2.f50827k = fFloatValue;
                        c10001b2.f50833q = true;
                        c10001b2.m18593c();
                        return C9072e.f47360a;
                    }
                });
                C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f16), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$4
                    @Override // cm.InterfaceC2056p
                    /* JADX INFO: renamed from: m0 */
                    public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                        C10001b c10001b2 = c10001b;
                        float fFloatValue = f30.floatValue();
                        C5207g.m11111f(c10001b2, "$this$set");
                        c10001b2.f50828l = fFloatValue;
                        c10001b2.f50833q = true;
                        c10001b2.m18593c();
                        return C9072e.f47360a;
                    }
                });
                C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f17), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$5
                    @Override // cm.InterfaceC2056p
                    /* JADX INFO: renamed from: m0 */
                    public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                        C10001b c10001b2 = c10001b;
                        float fFloatValue = f30.floatValue();
                        C5207g.m11111f(c10001b2, "$this$set");
                        c10001b2.f50829m = fFloatValue;
                        c10001b2.f50833q = true;
                        c10001b2.m18593c();
                        return C9072e.f47360a;
                    }
                });
                C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f20), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$6
                    @Override // cm.InterfaceC2056p
                    /* JADX INFO: renamed from: m0 */
                    public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                        C10001b c10001b2 = c10001b;
                        float fFloatValue = f30.floatValue();
                        C5207g.m11111f(c10001b2, "$this$set");
                        c10001b2.f50830n = fFloatValue;
                        c10001b2.f50833q = true;
                        c10001b2.m18593c();
                        return C9072e.f47360a;
                    }
                });
                C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f21), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$7
                    @Override // cm.InterfaceC2056p
                    /* JADX INFO: renamed from: m0 */
                    public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                        C10001b c10001b2 = c10001b;
                        float fFloatValue = f30.floatValue();
                        C5207g.m11111f(c10001b2, "$this$set");
                        c10001b2.f50831o = fFloatValue;
                        c10001b2.f50833q = true;
                        c10001b2.m18593c();
                        return C9072e.f47360a;
                    }
                });
                C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f22), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$8
                    @Override // cm.InterfaceC2056p
                    /* JADX INFO: renamed from: m0 */
                    public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                        C10001b c10001b2 = c10001b;
                        float fFloatValue = f30.floatValue();
                        C5207g.m11111f(c10001b2, "$this$set");
                        c10001b2.f50832p = fFloatValue;
                        c10001b2.f50833q = true;
                        c10001b2.m18593c();
                        return C9072e.f47360a;
                    }
                });
                C8573r0.m16714a1(composerImplMo1636j, list2, new InterfaceC2056p<C10001b, List<? extends AbstractC10003d>, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$9
                    @Override // cm.InterfaceC2056p
                    /* JADX INFO: renamed from: m0 */
                    public final C9072e mo1337m0(C10001b c10001b, List<? extends AbstractC10003d> list4) {
                        C10001b c10001b2 = c10001b;
                        List<? extends AbstractC10003d> list5 = list4;
                        C5207g.m11111f(c10001b2, "$this$set");
                        C5207g.m11111f(list5, "it");
                        c10001b2.f50820d = list5;
                        c10001b2.f50821e = true;
                        c10001b2.m18593c();
                        return C9072e.f47360a;
                    }
                });
                interfaceC2056p.mo1337m0(composerImplMo1636j, Integer.valueOf((i12 >> 27) & 14));
                composerImplMo1636j.m1609Q(true);
                composerImplMo1636j.m1609Q(false);
                f23 = f19;
                f24 = f22;
                f25 = f20;
                f26 = f21;
                f27 = f17;
                list3 = list2;
                f28 = f18;
                f29 = f16;
            }
            c5332q0M1612T = composerImplMo1636j.m1612T();
            if (c5332q0M1612T == null) {
                return;
            }
            c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // cm.InterfaceC2056p
                /* JADX INFO: renamed from: m0 */
                public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                    num.intValue();
                    VectorComposeKt.m2005a(str2, f28, f23, f29, f27, f25, f26, f24, list3, interfaceC2056p, interfaceC0476a2, C8573r0.m16737l1(i10 | 1), i11);
                    return C9072e.f47360a;
                }
            };
        }
        i12 |= 48;
        i13 = i11 & 4;
        if (i13 != 0) {
            if ((i10 & 896) == 0) {
                if (composerImplMo1636j.m1592D(f10)) {
                    i14 = 256;
                } else {
                    i14 = BuildConfig.SDK_TRUNCATE_LENGTH;
                }
                i12 |= i14;
            }
            i15 = i11 & 8;
            if (i15 != 0) {
                if ((i10 & 7168) == 0) {
                    f16 = f11;
                    if (composerImplMo1636j.m1592D(f16)) {
                        i16 = 2048;
                    } else {
                        i16 = 1024;
                    }
                    i12 |= i16;
                }
                i17 = i11 & 16;
                if (i17 != 0) {
                    if ((57344 & i10) == 0) {
                        f17 = f12;
                        if (composerImplMo1636j.m1592D(f17)) {
                            i18 = 16384;
                        } else {
                            i18 = 8192;
                        }
                        i12 |= i18;
                    }
                    i19 = i11 & 32;
                    if (i19 != 0) {
                        i12 |= 196608;
                    } else if ((i10 & 458752) == 0) {
                        if (composerImplMo1636j.m1592D(f13)) {
                            i20 = 131072;
                        } else {
                            i20 = 65536;
                        }
                        i12 |= i20;
                    }
                    i21 = i11 & 64;
                    if (i21 != 0) {
                        i12 |= 1572864;
                    } else if ((i10 & 3670016) == 0) {
                        if (composerImplMo1636j.m1592D(f14)) {
                            i22 = 1048576;
                        } else {
                            i22 = 524288;
                        }
                        i12 |= i22;
                    }
                    i23 = i11 & BuildConfig.SDK_TRUNCATE_LENGTH;
                    if (i23 != 0) {
                        i12 |= 12582912;
                    } else if ((i10 & 29360128) == 0) {
                        if (composerImplMo1636j.m1592D(f15)) {
                            i24 = 8388608;
                        } else {
                            i24 = 4194304;
                        }
                        i12 |= i24;
                    }
                    i25 = i11 & 256;
                    if (i25 != 0) {
                        i12 |= 33554432;
                    }
                    if ((i11 & 512) != 0) {
                        if ((1879048192 & i10) == 0) {
                            if (composerImplMo1636j.m1600H(interfaceC2056p)) {
                                i26 = 536870912;
                            } else {
                                i26 = 268435456;
                            }
                        }
                        if (i25 != 256) {
                            composerImplMo1636j.m1654s0();
                            if ((i10 & 1) != 0) {
                                if (i27 != 0) {
                                    str2 = "";
                                } else {
                                    str2 = str;
                                }
                                if (i28 != 0) {
                                    f18 = 0.0f;
                                } else {
                                    f18 = f3;
                                }
                                if (i13 != 0) {
                                    f19 = 0.0f;
                                } else {
                                    f19 = f10;
                                }
                                if (i15 != 0) {
                                    f16 = 0.0f;
                                }
                                if (i17 != 0) {
                                    f17 = 1.0f;
                                }
                                if (i19 == 0) {
                                }
                                if (i21 != 0) {
                                    f21 = 0.0f;
                                } else {
                                    f21 = f14;
                                }
                                if (i23 == 0) {
                                }
                                if (i25 != 0) {
                                    list2 = C10009j.f50944a;
                                    i12 &= -234881025;
                                } else {
                                    list2 = list;
                                }
                            } else {
                                if (i27 != 0) {
                                    str2 = "";
                                } else {
                                    str2 = str;
                                }
                                if (i28 != 0) {
                                    f18 = 0.0f;
                                } else {
                                    f18 = f3;
                                }
                                if (i13 != 0) {
                                    f19 = 0.0f;
                                } else {
                                    f19 = f10;
                                }
                                if (i15 != 0) {
                                    f16 = 0.0f;
                                }
                                if (i17 != 0) {
                                    f17 = 1.0f;
                                }
                                if (i19 == 0) {
                                }
                                if (i21 != 0) {
                                    f21 = 0.0f;
                                } else {
                                    f21 = f14;
                                }
                                if (i23 == 0) {
                                }
                                if (i25 != 0) {
                                    list2 = C10009j.f50944a;
                                    i12 &= -234881025;
                                } else {
                                    list2 = list;
                                }
                            }
                            composerImplMo1636j.m1610R();
                            InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q1113 = ComposerKt.f3003a;
                            vectorComposeKt$Group$1 = new InterfaceC2041a<C10001b>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$1
                                @Override // cm.InterfaceC2041a
                                /* JADX INFO: renamed from: E */
                                public final C10001b mo807E() {
                                    return new C10001b();
                                }
                            };
                            composerImplMo1636j.mo1622c(-548224868);
                            if (composerImplMo1636j.f2910a instanceof C10006g) {
                                C8573r0.m16771y0();
                                throw null;
                            }
                            composerImplMo1636j.m1658u0();
                            if (composerImplMo1636j.f2897L) {
                                composerImplMo1636j.mo1634i(vectorComposeKt$Group$1);
                            } else {
                                composerImplMo1636j.mo1653s();
                            }
                            C8573r0.m16714a1(composerImplMo1636j, str2, new InterfaceC2056p<C10001b, String, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$1
                                @Override // cm.InterfaceC2056p
                                /* JADX INFO: renamed from: m0 */
                                public final C9072e mo1337m0(C10001b c10001b, String str3) {
                                    C10001b c10001b2 = c10001b;
                                    String str4 = str3;
                                    C5207g.m11111f(c10001b2, "$this$set");
                                    C5207g.m11111f(str4, "it");
                                    c10001b2.f50825i = str4;
                                    c10001b2.m18593c();
                                    return C9072e.f47360a;
                                }
                            });
                            C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f18), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$2
                                @Override // cm.InterfaceC2056p
                                /* JADX INFO: renamed from: m0 */
                                public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                                    C10001b c10001b2 = c10001b;
                                    float fFloatValue = f30.floatValue();
                                    C5207g.m11111f(c10001b2, "$this$set");
                                    c10001b2.f50826j = fFloatValue;
                                    c10001b2.f50833q = true;
                                    c10001b2.m18593c();
                                    return C9072e.f47360a;
                                }
                            });
                            C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f19), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$3
                                @Override // cm.InterfaceC2056p
                                /* JADX INFO: renamed from: m0 */
                                public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                                    C10001b c10001b2 = c10001b;
                                    float fFloatValue = f30.floatValue();
                                    C5207g.m11111f(c10001b2, "$this$set");
                                    c10001b2.f50827k = fFloatValue;
                                    c10001b2.f50833q = true;
                                    c10001b2.m18593c();
                                    return C9072e.f47360a;
                                }
                            });
                            C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f16), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$4
                                @Override // cm.InterfaceC2056p
                                /* JADX INFO: renamed from: m0 */
                                public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                                    C10001b c10001b2 = c10001b;
                                    float fFloatValue = f30.floatValue();
                                    C5207g.m11111f(c10001b2, "$this$set");
                                    c10001b2.f50828l = fFloatValue;
                                    c10001b2.f50833q = true;
                                    c10001b2.m18593c();
                                    return C9072e.f47360a;
                                }
                            });
                            C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f17), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$5
                                @Override // cm.InterfaceC2056p
                                /* JADX INFO: renamed from: m0 */
                                public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                                    C10001b c10001b2 = c10001b;
                                    float fFloatValue = f30.floatValue();
                                    C5207g.m11111f(c10001b2, "$this$set");
                                    c10001b2.f50829m = fFloatValue;
                                    c10001b2.f50833q = true;
                                    c10001b2.m18593c();
                                    return C9072e.f47360a;
                                }
                            });
                            C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f20), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$6
                                @Override // cm.InterfaceC2056p
                                /* JADX INFO: renamed from: m0 */
                                public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                                    C10001b c10001b2 = c10001b;
                                    float fFloatValue = f30.floatValue();
                                    C5207g.m11111f(c10001b2, "$this$set");
                                    c10001b2.f50830n = fFloatValue;
                                    c10001b2.f50833q = true;
                                    c10001b2.m18593c();
                                    return C9072e.f47360a;
                                }
                            });
                            C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f21), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$7
                                @Override // cm.InterfaceC2056p
                                /* JADX INFO: renamed from: m0 */
                                public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                                    C10001b c10001b2 = c10001b;
                                    float fFloatValue = f30.floatValue();
                                    C5207g.m11111f(c10001b2, "$this$set");
                                    c10001b2.f50831o = fFloatValue;
                                    c10001b2.f50833q = true;
                                    c10001b2.m18593c();
                                    return C9072e.f47360a;
                                }
                            });
                            C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f22), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$8
                                @Override // cm.InterfaceC2056p
                                /* JADX INFO: renamed from: m0 */
                                public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                                    C10001b c10001b2 = c10001b;
                                    float fFloatValue = f30.floatValue();
                                    C5207g.m11111f(c10001b2, "$this$set");
                                    c10001b2.f50832p = fFloatValue;
                                    c10001b2.f50833q = true;
                                    c10001b2.m18593c();
                                    return C9072e.f47360a;
                                }
                            });
                            C8573r0.m16714a1(composerImplMo1636j, list2, new InterfaceC2056p<C10001b, List<? extends AbstractC10003d>, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$9
                                @Override // cm.InterfaceC2056p
                                /* JADX INFO: renamed from: m0 */
                                public final C9072e mo1337m0(C10001b c10001b, List<? extends AbstractC10003d> list4) {
                                    C10001b c10001b2 = c10001b;
                                    List<? extends AbstractC10003d> list5 = list4;
                                    C5207g.m11111f(c10001b2, "$this$set");
                                    C5207g.m11111f(list5, "it");
                                    c10001b2.f50820d = list5;
                                    c10001b2.f50821e = true;
                                    c10001b2.m18593c();
                                    return C9072e.f47360a;
                                }
                            });
                            interfaceC2056p.mo1337m0(composerImplMo1636j, Integer.valueOf((i12 >> 27) & 14));
                            composerImplMo1636j.m1609Q(true);
                            composerImplMo1636j.m1609Q(false);
                            f23 = f19;
                            f24 = f22;
                            f25 = f20;
                            f26 = f21;
                            f27 = f17;
                            list3 = list2;
                            f28 = f18;
                            f29 = f16;
                        } else {
                            composerImplMo1636j.m1654s0();
                            if ((i10 & 1) != 0) {
                                if (i27 != 0) {
                                    str2 = "";
                                } else {
                                    str2 = str;
                                }
                                if (i28 != 0) {
                                    f18 = 0.0f;
                                } else {
                                    f18 = f3;
                                }
                                if (i13 != 0) {
                                    f19 = 0.0f;
                                } else {
                                    f19 = f10;
                                }
                                if (i15 != 0) {
                                    f16 = 0.0f;
                                }
                                if (i17 != 0) {
                                    f17 = 1.0f;
                                }
                                if (i19 == 0) {
                                }
                                if (i21 != 0) {
                                    f21 = 0.0f;
                                } else {
                                    f21 = f14;
                                }
                                if (i23 == 0) {
                                }
                                if (i25 != 0) {
                                    list2 = C10009j.f50944a;
                                    i12 &= -234881025;
                                } else {
                                    list2 = list;
                                }
                            } else {
                                if (i27 != 0) {
                                    str2 = "";
                                } else {
                                    str2 = str;
                                }
                                if (i28 != 0) {
                                    f18 = 0.0f;
                                } else {
                                    f18 = f3;
                                }
                                if (i13 != 0) {
                                    f19 = 0.0f;
                                } else {
                                    f19 = f10;
                                }
                                if (i15 != 0) {
                                    f16 = 0.0f;
                                }
                                if (i17 != 0) {
                                    f17 = 1.0f;
                                }
                                if (i19 == 0) {
                                }
                                if (i21 != 0) {
                                    f21 = 0.0f;
                                } else {
                                    f21 = f14;
                                }
                                if (i23 == 0) {
                                }
                                if (i25 != 0) {
                                    list2 = C10009j.f50944a;
                                    i12 &= -234881025;
                                } else {
                                    list2 = list;
                                }
                            }
                            composerImplMo1636j.m1610R();
                            InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q1114 = ComposerKt.f3003a;
                            vectorComposeKt$Group$1 = new InterfaceC2041a<C10001b>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$1
                                @Override // cm.InterfaceC2041a
                                /* JADX INFO: renamed from: E */
                                public final C10001b mo807E() {
                                    return new C10001b();
                                }
                            };
                            composerImplMo1636j.mo1622c(-548224868);
                            if (composerImplMo1636j.f2910a instanceof C10006g) {
                                C8573r0.m16771y0();
                                throw null;
                            }
                            composerImplMo1636j.m1658u0();
                            if (composerImplMo1636j.f2897L) {
                                composerImplMo1636j.mo1634i(vectorComposeKt$Group$1);
                            } else {
                                composerImplMo1636j.mo1653s();
                            }
                            C8573r0.m16714a1(composerImplMo1636j, str2, new InterfaceC2056p<C10001b, String, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$1
                                @Override // cm.InterfaceC2056p
                                /* JADX INFO: renamed from: m0 */
                                public final C9072e mo1337m0(C10001b c10001b, String str3) {
                                    C10001b c10001b2 = c10001b;
                                    String str4 = str3;
                                    C5207g.m11111f(c10001b2, "$this$set");
                                    C5207g.m11111f(str4, "it");
                                    c10001b2.f50825i = str4;
                                    c10001b2.m18593c();
                                    return C9072e.f47360a;
                                }
                            });
                            C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f18), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$2
                                @Override // cm.InterfaceC2056p
                                /* JADX INFO: renamed from: m0 */
                                public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                                    C10001b c10001b2 = c10001b;
                                    float fFloatValue = f30.floatValue();
                                    C5207g.m11111f(c10001b2, "$this$set");
                                    c10001b2.f50826j = fFloatValue;
                                    c10001b2.f50833q = true;
                                    c10001b2.m18593c();
                                    return C9072e.f47360a;
                                }
                            });
                            C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f19), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$3
                                @Override // cm.InterfaceC2056p
                                /* JADX INFO: renamed from: m0 */
                                public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                                    C10001b c10001b2 = c10001b;
                                    float fFloatValue = f30.floatValue();
                                    C5207g.m11111f(c10001b2, "$this$set");
                                    c10001b2.f50827k = fFloatValue;
                                    c10001b2.f50833q = true;
                                    c10001b2.m18593c();
                                    return C9072e.f47360a;
                                }
                            });
                            C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f16), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$4
                                @Override // cm.InterfaceC2056p
                                /* JADX INFO: renamed from: m0 */
                                public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                                    C10001b c10001b2 = c10001b;
                                    float fFloatValue = f30.floatValue();
                                    C5207g.m11111f(c10001b2, "$this$set");
                                    c10001b2.f50828l = fFloatValue;
                                    c10001b2.f50833q = true;
                                    c10001b2.m18593c();
                                    return C9072e.f47360a;
                                }
                            });
                            C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f17), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$5
                                @Override // cm.InterfaceC2056p
                                /* JADX INFO: renamed from: m0 */
                                public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                                    C10001b c10001b2 = c10001b;
                                    float fFloatValue = f30.floatValue();
                                    C5207g.m11111f(c10001b2, "$this$set");
                                    c10001b2.f50829m = fFloatValue;
                                    c10001b2.f50833q = true;
                                    c10001b2.m18593c();
                                    return C9072e.f47360a;
                                }
                            });
                            C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f20), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$6
                                @Override // cm.InterfaceC2056p
                                /* JADX INFO: renamed from: m0 */
                                public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                                    C10001b c10001b2 = c10001b;
                                    float fFloatValue = f30.floatValue();
                                    C5207g.m11111f(c10001b2, "$this$set");
                                    c10001b2.f50830n = fFloatValue;
                                    c10001b2.f50833q = true;
                                    c10001b2.m18593c();
                                    return C9072e.f47360a;
                                }
                            });
                            C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f21), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$7
                                @Override // cm.InterfaceC2056p
                                /* JADX INFO: renamed from: m0 */
                                public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                                    C10001b c10001b2 = c10001b;
                                    float fFloatValue = f30.floatValue();
                                    C5207g.m11111f(c10001b2, "$this$set");
                                    c10001b2.f50831o = fFloatValue;
                                    c10001b2.f50833q = true;
                                    c10001b2.m18593c();
                                    return C9072e.f47360a;
                                }
                            });
                            C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f22), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$8
                                @Override // cm.InterfaceC2056p
                                /* JADX INFO: renamed from: m0 */
                                public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                                    C10001b c10001b2 = c10001b;
                                    float fFloatValue = f30.floatValue();
                                    C5207g.m11111f(c10001b2, "$this$set");
                                    c10001b2.f50832p = fFloatValue;
                                    c10001b2.f50833q = true;
                                    c10001b2.m18593c();
                                    return C9072e.f47360a;
                                }
                            });
                            C8573r0.m16714a1(composerImplMo1636j, list2, new InterfaceC2056p<C10001b, List<? extends AbstractC10003d>, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$9
                                @Override // cm.InterfaceC2056p
                                /* JADX INFO: renamed from: m0 */
                                public final C9072e mo1337m0(C10001b c10001b, List<? extends AbstractC10003d> list4) {
                                    C10001b c10001b2 = c10001b;
                                    List<? extends AbstractC10003d> list5 = list4;
                                    C5207g.m11111f(c10001b2, "$this$set");
                                    C5207g.m11111f(list5, "it");
                                    c10001b2.f50820d = list5;
                                    c10001b2.f50821e = true;
                                    c10001b2.m18593c();
                                    return C9072e.f47360a;
                                }
                            });
                            interfaceC2056p.mo1337m0(composerImplMo1636j, Integer.valueOf((i12 >> 27) & 14));
                            composerImplMo1636j.m1609Q(true);
                            composerImplMo1636j.m1609Q(false);
                            f23 = f19;
                            f24 = f22;
                            f25 = f20;
                            f26 = f21;
                            f27 = f17;
                            list3 = list2;
                            f28 = f18;
                            f29 = f16;
                        }
                        c5332q0M1612T = composerImplMo1636j.m1612T();
                        if (c5332q0M1612T == null) {
                            return;
                        }
                        c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$4
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                                num.intValue();
                                VectorComposeKt.m2005a(str2, f28, f23, f29, f27, f25, f26, f24, list3, interfaceC2056p, interfaceC0476a2, C8573r0.m16737l1(i10 | 1), i11);
                                return C9072e.f47360a;
                            }
                        };
                    }
                    i26 = 805306368;
                    i12 |= i26;
                    if (i25 != 256) {
                        composerImplMo1636j.m1654s0();
                        if ((i10 & 1) != 0) {
                            if (i27 != 0) {
                                str2 = "";
                            } else {
                                str2 = str;
                            }
                            if (i28 != 0) {
                                f18 = 0.0f;
                            } else {
                                f18 = f3;
                            }
                            if (i13 != 0) {
                                f19 = 0.0f;
                            } else {
                                f19 = f10;
                            }
                            if (i15 != 0) {
                                f16 = 0.0f;
                            }
                            if (i17 != 0) {
                                f17 = 1.0f;
                            }
                            if (i19 == 0) {
                            }
                            if (i21 != 0) {
                                f21 = 0.0f;
                            } else {
                                f21 = f14;
                            }
                            if (i23 == 0) {
                            }
                            if (i25 != 0) {
                                list2 = C10009j.f50944a;
                                i12 &= -234881025;
                            } else {
                                list2 = list;
                            }
                        } else {
                            if (i27 != 0) {
                                str2 = "";
                            } else {
                                str2 = str;
                            }
                            if (i28 != 0) {
                                f18 = 0.0f;
                            } else {
                                f18 = f3;
                            }
                            if (i13 != 0) {
                                f19 = 0.0f;
                            } else {
                                f19 = f10;
                            }
                            if (i15 != 0) {
                                f16 = 0.0f;
                            }
                            if (i17 != 0) {
                                f17 = 1.0f;
                            }
                            if (i19 == 0) {
                            }
                            if (i21 != 0) {
                                f21 = 0.0f;
                            } else {
                                f21 = f14;
                            }
                            if (i23 == 0) {
                            }
                            if (i25 != 0) {
                                list2 = C10009j.f50944a;
                                i12 &= -234881025;
                            } else {
                                list2 = list;
                            }
                        }
                        composerImplMo1636j.m1610R();
                        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q1115 = ComposerKt.f3003a;
                        vectorComposeKt$Group$1 = new InterfaceC2041a<C10001b>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$1
                            @Override // cm.InterfaceC2041a
                            /* JADX INFO: renamed from: E */
                            public final C10001b mo807E() {
                                return new C10001b();
                            }
                        };
                        composerImplMo1636j.mo1622c(-548224868);
                        if (composerImplMo1636j.f2910a instanceof C10006g) {
                            C8573r0.m16771y0();
                            throw null;
                        }
                        composerImplMo1636j.m1658u0();
                        if (composerImplMo1636j.f2897L) {
                            composerImplMo1636j.mo1634i(vectorComposeKt$Group$1);
                        } else {
                            composerImplMo1636j.mo1653s();
                        }
                        C8573r0.m16714a1(composerImplMo1636j, str2, new InterfaceC2056p<C10001b, String, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$1
                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(C10001b c10001b, String str3) {
                                C10001b c10001b2 = c10001b;
                                String str4 = str3;
                                C5207g.m11111f(c10001b2, "$this$set");
                                C5207g.m11111f(str4, "it");
                                c10001b2.f50825i = str4;
                                c10001b2.m18593c();
                                return C9072e.f47360a;
                            }
                        });
                        C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f18), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$2
                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                                C10001b c10001b2 = c10001b;
                                float fFloatValue = f30.floatValue();
                                C5207g.m11111f(c10001b2, "$this$set");
                                c10001b2.f50826j = fFloatValue;
                                c10001b2.f50833q = true;
                                c10001b2.m18593c();
                                return C9072e.f47360a;
                            }
                        });
                        C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f19), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$3
                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                                C10001b c10001b2 = c10001b;
                                float fFloatValue = f30.floatValue();
                                C5207g.m11111f(c10001b2, "$this$set");
                                c10001b2.f50827k = fFloatValue;
                                c10001b2.f50833q = true;
                                c10001b2.m18593c();
                                return C9072e.f47360a;
                            }
                        });
                        C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f16), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$4
                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                                C10001b c10001b2 = c10001b;
                                float fFloatValue = f30.floatValue();
                                C5207g.m11111f(c10001b2, "$this$set");
                                c10001b2.f50828l = fFloatValue;
                                c10001b2.f50833q = true;
                                c10001b2.m18593c();
                                return C9072e.f47360a;
                            }
                        });
                        C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f17), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$5
                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                                C10001b c10001b2 = c10001b;
                                float fFloatValue = f30.floatValue();
                                C5207g.m11111f(c10001b2, "$this$set");
                                c10001b2.f50829m = fFloatValue;
                                c10001b2.f50833q = true;
                                c10001b2.m18593c();
                                return C9072e.f47360a;
                            }
                        });
                        C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f20), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$6
                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                                C10001b c10001b2 = c10001b;
                                float fFloatValue = f30.floatValue();
                                C5207g.m11111f(c10001b2, "$this$set");
                                c10001b2.f50830n = fFloatValue;
                                c10001b2.f50833q = true;
                                c10001b2.m18593c();
                                return C9072e.f47360a;
                            }
                        });
                        C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f21), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$7
                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                                C10001b c10001b2 = c10001b;
                                float fFloatValue = f30.floatValue();
                                C5207g.m11111f(c10001b2, "$this$set");
                                c10001b2.f50831o = fFloatValue;
                                c10001b2.f50833q = true;
                                c10001b2.m18593c();
                                return C9072e.f47360a;
                            }
                        });
                        C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f22), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$8
                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                                C10001b c10001b2 = c10001b;
                                float fFloatValue = f30.floatValue();
                                C5207g.m11111f(c10001b2, "$this$set");
                                c10001b2.f50832p = fFloatValue;
                                c10001b2.f50833q = true;
                                c10001b2.m18593c();
                                return C9072e.f47360a;
                            }
                        });
                        C8573r0.m16714a1(composerImplMo1636j, list2, new InterfaceC2056p<C10001b, List<? extends AbstractC10003d>, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$9
                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(C10001b c10001b, List<? extends AbstractC10003d> list4) {
                                C10001b c10001b2 = c10001b;
                                List<? extends AbstractC10003d> list5 = list4;
                                C5207g.m11111f(c10001b2, "$this$set");
                                C5207g.m11111f(list5, "it");
                                c10001b2.f50820d = list5;
                                c10001b2.f50821e = true;
                                c10001b2.m18593c();
                                return C9072e.f47360a;
                            }
                        });
                        interfaceC2056p.mo1337m0(composerImplMo1636j, Integer.valueOf((i12 >> 27) & 14));
                        composerImplMo1636j.m1609Q(true);
                        composerImplMo1636j.m1609Q(false);
                        f23 = f19;
                        f24 = f22;
                        f25 = f20;
                        f26 = f21;
                        f27 = f17;
                        list3 = list2;
                        f28 = f18;
                        f29 = f16;
                    } else {
                        composerImplMo1636j.m1654s0();
                        if ((i10 & 1) != 0) {
                            if (i27 != 0) {
                                str2 = "";
                            } else {
                                str2 = str;
                            }
                            if (i28 != 0) {
                                f18 = 0.0f;
                            } else {
                                f18 = f3;
                            }
                            if (i13 != 0) {
                                f19 = 0.0f;
                            } else {
                                f19 = f10;
                            }
                            if (i15 != 0) {
                                f16 = 0.0f;
                            }
                            if (i17 != 0) {
                                f17 = 1.0f;
                            }
                            if (i19 == 0) {
                            }
                            if (i21 != 0) {
                                f21 = 0.0f;
                            } else {
                                f21 = f14;
                            }
                            if (i23 == 0) {
                            }
                            if (i25 != 0) {
                                list2 = C10009j.f50944a;
                                i12 &= -234881025;
                            } else {
                                list2 = list;
                            }
                        } else {
                            if (i27 != 0) {
                                str2 = "";
                            } else {
                                str2 = str;
                            }
                            if (i28 != 0) {
                                f18 = 0.0f;
                            } else {
                                f18 = f3;
                            }
                            if (i13 != 0) {
                                f19 = 0.0f;
                            } else {
                                f19 = f10;
                            }
                            if (i15 != 0) {
                                f16 = 0.0f;
                            }
                            if (i17 != 0) {
                                f17 = 1.0f;
                            }
                            if (i19 == 0) {
                            }
                            if (i21 != 0) {
                                f21 = 0.0f;
                            } else {
                                f21 = f14;
                            }
                            if (i23 == 0) {
                            }
                            if (i25 != 0) {
                                list2 = C10009j.f50944a;
                                i12 &= -234881025;
                            } else {
                                list2 = list;
                            }
                        }
                        composerImplMo1636j.m1610R();
                        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q1116 = ComposerKt.f3003a;
                        vectorComposeKt$Group$1 = new InterfaceC2041a<C10001b>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$1
                            @Override // cm.InterfaceC2041a
                            /* JADX INFO: renamed from: E */
                            public final C10001b mo807E() {
                                return new C10001b();
                            }
                        };
                        composerImplMo1636j.mo1622c(-548224868);
                        if (composerImplMo1636j.f2910a instanceof C10006g) {
                            C8573r0.m16771y0();
                            throw null;
                        }
                        composerImplMo1636j.m1658u0();
                        if (composerImplMo1636j.f2897L) {
                            composerImplMo1636j.mo1634i(vectorComposeKt$Group$1);
                        } else {
                            composerImplMo1636j.mo1653s();
                        }
                        C8573r0.m16714a1(composerImplMo1636j, str2, new InterfaceC2056p<C10001b, String, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$1
                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(C10001b c10001b, String str3) {
                                C10001b c10001b2 = c10001b;
                                String str4 = str3;
                                C5207g.m11111f(c10001b2, "$this$set");
                                C5207g.m11111f(str4, "it");
                                c10001b2.f50825i = str4;
                                c10001b2.m18593c();
                                return C9072e.f47360a;
                            }
                        });
                        C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f18), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$2
                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                                C10001b c10001b2 = c10001b;
                                float fFloatValue = f30.floatValue();
                                C5207g.m11111f(c10001b2, "$this$set");
                                c10001b2.f50826j = fFloatValue;
                                c10001b2.f50833q = true;
                                c10001b2.m18593c();
                                return C9072e.f47360a;
                            }
                        });
                        C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f19), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$3
                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                                C10001b c10001b2 = c10001b;
                                float fFloatValue = f30.floatValue();
                                C5207g.m11111f(c10001b2, "$this$set");
                                c10001b2.f50827k = fFloatValue;
                                c10001b2.f50833q = true;
                                c10001b2.m18593c();
                                return C9072e.f47360a;
                            }
                        });
                        C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f16), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$4
                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                                C10001b c10001b2 = c10001b;
                                float fFloatValue = f30.floatValue();
                                C5207g.m11111f(c10001b2, "$this$set");
                                c10001b2.f50828l = fFloatValue;
                                c10001b2.f50833q = true;
                                c10001b2.m18593c();
                                return C9072e.f47360a;
                            }
                        });
                        C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f17), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$5
                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                                C10001b c10001b2 = c10001b;
                                float fFloatValue = f30.floatValue();
                                C5207g.m11111f(c10001b2, "$this$set");
                                c10001b2.f50829m = fFloatValue;
                                c10001b2.f50833q = true;
                                c10001b2.m18593c();
                                return C9072e.f47360a;
                            }
                        });
                        C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f20), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$6
                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                                C10001b c10001b2 = c10001b;
                                float fFloatValue = f30.floatValue();
                                C5207g.m11111f(c10001b2, "$this$set");
                                c10001b2.f50830n = fFloatValue;
                                c10001b2.f50833q = true;
                                c10001b2.m18593c();
                                return C9072e.f47360a;
                            }
                        });
                        C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f21), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$7
                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                                C10001b c10001b2 = c10001b;
                                float fFloatValue = f30.floatValue();
                                C5207g.m11111f(c10001b2, "$this$set");
                                c10001b2.f50831o = fFloatValue;
                                c10001b2.f50833q = true;
                                c10001b2.m18593c();
                                return C9072e.f47360a;
                            }
                        });
                        C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f22), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$8
                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                                C10001b c10001b2 = c10001b;
                                float fFloatValue = f30.floatValue();
                                C5207g.m11111f(c10001b2, "$this$set");
                                c10001b2.f50832p = fFloatValue;
                                c10001b2.f50833q = true;
                                c10001b2.m18593c();
                                return C9072e.f47360a;
                            }
                        });
                        C8573r0.m16714a1(composerImplMo1636j, list2, new InterfaceC2056p<C10001b, List<? extends AbstractC10003d>, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$9
                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(C10001b c10001b, List<? extends AbstractC10003d> list4) {
                                C10001b c10001b2 = c10001b;
                                List<? extends AbstractC10003d> list5 = list4;
                                C5207g.m11111f(c10001b2, "$this$set");
                                C5207g.m11111f(list5, "it");
                                c10001b2.f50820d = list5;
                                c10001b2.f50821e = true;
                                c10001b2.m18593c();
                                return C9072e.f47360a;
                            }
                        });
                        interfaceC2056p.mo1337m0(composerImplMo1636j, Integer.valueOf((i12 >> 27) & 14));
                        composerImplMo1636j.m1609Q(true);
                        composerImplMo1636j.m1609Q(false);
                        f23 = f19;
                        f24 = f22;
                        f25 = f20;
                        f26 = f21;
                        f27 = f17;
                        list3 = list2;
                        f28 = f18;
                        f29 = f16;
                    }
                    c5332q0M1612T = composerImplMo1636j.m1612T();
                    if (c5332q0M1612T == null) {
                        return;
                    }
                    c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$4
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                            num.intValue();
                            VectorComposeKt.m2005a(str2, f28, f23, f29, f27, f25, f26, f24, list3, interfaceC2056p, interfaceC0476a2, C8573r0.m16737l1(i10 | 1), i11);
                            return C9072e.f47360a;
                        }
                    };
                }
                i12 |= 24576;
                f17 = f12;
                i19 = i11 & 32;
                if (i19 != 0) {
                    i12 |= 196608;
                } else if ((i10 & 458752) == 0) {
                    if (composerImplMo1636j.m1592D(f13)) {
                        i20 = 131072;
                    } else {
                        i20 = 65536;
                    }
                    i12 |= i20;
                }
                i21 = i11 & 64;
                if (i21 != 0) {
                    i12 |= 1572864;
                } else if ((i10 & 3670016) == 0) {
                    if (composerImplMo1636j.m1592D(f14)) {
                        i22 = 1048576;
                    } else {
                        i22 = 524288;
                    }
                    i12 |= i22;
                }
                i23 = i11 & BuildConfig.SDK_TRUNCATE_LENGTH;
                if (i23 != 0) {
                    i12 |= 12582912;
                } else if ((i10 & 29360128) == 0) {
                    if (composerImplMo1636j.m1592D(f15)) {
                        i24 = 8388608;
                    } else {
                        i24 = 4194304;
                    }
                    i12 |= i24;
                }
                i25 = i11 & 256;
                if (i25 != 0) {
                    i12 |= 33554432;
                }
                if ((i11 & 512) != 0) {
                    if ((1879048192 & i10) == 0) {
                        if (composerImplMo1636j.m1600H(interfaceC2056p)) {
                            i26 = 536870912;
                        } else {
                            i26 = 268435456;
                        }
                    }
                    if (i25 != 256) {
                        composerImplMo1636j.m1654s0();
                        if ((i10 & 1) != 0) {
                            if (i27 != 0) {
                                str2 = "";
                            } else {
                                str2 = str;
                            }
                            if (i28 != 0) {
                                f18 = 0.0f;
                            } else {
                                f18 = f3;
                            }
                            if (i13 != 0) {
                                f19 = 0.0f;
                            } else {
                                f19 = f10;
                            }
                            if (i15 != 0) {
                                f16 = 0.0f;
                            }
                            if (i17 != 0) {
                                f17 = 1.0f;
                            }
                            if (i19 == 0) {
                            }
                            if (i21 != 0) {
                                f21 = 0.0f;
                            } else {
                                f21 = f14;
                            }
                            if (i23 == 0) {
                            }
                            if (i25 != 0) {
                                list2 = C10009j.f50944a;
                                i12 &= -234881025;
                            } else {
                                list2 = list;
                            }
                        } else {
                            if (i27 != 0) {
                                str2 = "";
                            } else {
                                str2 = str;
                            }
                            if (i28 != 0) {
                                f18 = 0.0f;
                            } else {
                                f18 = f3;
                            }
                            if (i13 != 0) {
                                f19 = 0.0f;
                            } else {
                                f19 = f10;
                            }
                            if (i15 != 0) {
                                f16 = 0.0f;
                            }
                            if (i17 != 0) {
                                f17 = 1.0f;
                            }
                            if (i19 == 0) {
                            }
                            if (i21 != 0) {
                                f21 = 0.0f;
                            } else {
                                f21 = f14;
                            }
                            if (i23 == 0) {
                            }
                            if (i25 != 0) {
                                list2 = C10009j.f50944a;
                                i12 &= -234881025;
                            } else {
                                list2 = list;
                            }
                        }
                        composerImplMo1636j.m1610R();
                        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q1117 = ComposerKt.f3003a;
                        vectorComposeKt$Group$1 = new InterfaceC2041a<C10001b>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$1
                            @Override // cm.InterfaceC2041a
                            /* JADX INFO: renamed from: E */
                            public final C10001b mo807E() {
                                return new C10001b();
                            }
                        };
                        composerImplMo1636j.mo1622c(-548224868);
                        if (composerImplMo1636j.f2910a instanceof C10006g) {
                            C8573r0.m16771y0();
                            throw null;
                        }
                        composerImplMo1636j.m1658u0();
                        if (composerImplMo1636j.f2897L) {
                            composerImplMo1636j.mo1634i(vectorComposeKt$Group$1);
                        } else {
                            composerImplMo1636j.mo1653s();
                        }
                        C8573r0.m16714a1(composerImplMo1636j, str2, new InterfaceC2056p<C10001b, String, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$1
                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(C10001b c10001b, String str3) {
                                C10001b c10001b2 = c10001b;
                                String str4 = str3;
                                C5207g.m11111f(c10001b2, "$this$set");
                                C5207g.m11111f(str4, "it");
                                c10001b2.f50825i = str4;
                                c10001b2.m18593c();
                                return C9072e.f47360a;
                            }
                        });
                        C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f18), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$2
                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                                C10001b c10001b2 = c10001b;
                                float fFloatValue = f30.floatValue();
                                C5207g.m11111f(c10001b2, "$this$set");
                                c10001b2.f50826j = fFloatValue;
                                c10001b2.f50833q = true;
                                c10001b2.m18593c();
                                return C9072e.f47360a;
                            }
                        });
                        C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f19), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$3
                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                                C10001b c10001b2 = c10001b;
                                float fFloatValue = f30.floatValue();
                                C5207g.m11111f(c10001b2, "$this$set");
                                c10001b2.f50827k = fFloatValue;
                                c10001b2.f50833q = true;
                                c10001b2.m18593c();
                                return C9072e.f47360a;
                            }
                        });
                        C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f16), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$4
                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                                C10001b c10001b2 = c10001b;
                                float fFloatValue = f30.floatValue();
                                C5207g.m11111f(c10001b2, "$this$set");
                                c10001b2.f50828l = fFloatValue;
                                c10001b2.f50833q = true;
                                c10001b2.m18593c();
                                return C9072e.f47360a;
                            }
                        });
                        C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f17), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$5
                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                                C10001b c10001b2 = c10001b;
                                float fFloatValue = f30.floatValue();
                                C5207g.m11111f(c10001b2, "$this$set");
                                c10001b2.f50829m = fFloatValue;
                                c10001b2.f50833q = true;
                                c10001b2.m18593c();
                                return C9072e.f47360a;
                            }
                        });
                        C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f20), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$6
                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                                C10001b c10001b2 = c10001b;
                                float fFloatValue = f30.floatValue();
                                C5207g.m11111f(c10001b2, "$this$set");
                                c10001b2.f50830n = fFloatValue;
                                c10001b2.f50833q = true;
                                c10001b2.m18593c();
                                return C9072e.f47360a;
                            }
                        });
                        C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f21), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$7
                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                                C10001b c10001b2 = c10001b;
                                float fFloatValue = f30.floatValue();
                                C5207g.m11111f(c10001b2, "$this$set");
                                c10001b2.f50831o = fFloatValue;
                                c10001b2.f50833q = true;
                                c10001b2.m18593c();
                                return C9072e.f47360a;
                            }
                        });
                        C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f22), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$8
                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                                C10001b c10001b2 = c10001b;
                                float fFloatValue = f30.floatValue();
                                C5207g.m11111f(c10001b2, "$this$set");
                                c10001b2.f50832p = fFloatValue;
                                c10001b2.f50833q = true;
                                c10001b2.m18593c();
                                return C9072e.f47360a;
                            }
                        });
                        C8573r0.m16714a1(composerImplMo1636j, list2, new InterfaceC2056p<C10001b, List<? extends AbstractC10003d>, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$9
                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(C10001b c10001b, List<? extends AbstractC10003d> list4) {
                                C10001b c10001b2 = c10001b;
                                List<? extends AbstractC10003d> list5 = list4;
                                C5207g.m11111f(c10001b2, "$this$set");
                                C5207g.m11111f(list5, "it");
                                c10001b2.f50820d = list5;
                                c10001b2.f50821e = true;
                                c10001b2.m18593c();
                                return C9072e.f47360a;
                            }
                        });
                        interfaceC2056p.mo1337m0(composerImplMo1636j, Integer.valueOf((i12 >> 27) & 14));
                        composerImplMo1636j.m1609Q(true);
                        composerImplMo1636j.m1609Q(false);
                        f23 = f19;
                        f24 = f22;
                        f25 = f20;
                        f26 = f21;
                        f27 = f17;
                        list3 = list2;
                        f28 = f18;
                        f29 = f16;
                    } else {
                        composerImplMo1636j.m1654s0();
                        if ((i10 & 1) != 0) {
                            if (i27 != 0) {
                                str2 = "";
                            } else {
                                str2 = str;
                            }
                            if (i28 != 0) {
                                f18 = 0.0f;
                            } else {
                                f18 = f3;
                            }
                            if (i13 != 0) {
                                f19 = 0.0f;
                            } else {
                                f19 = f10;
                            }
                            if (i15 != 0) {
                                f16 = 0.0f;
                            }
                            if (i17 != 0) {
                                f17 = 1.0f;
                            }
                            if (i19 == 0) {
                            }
                            if (i21 != 0) {
                                f21 = 0.0f;
                            } else {
                                f21 = f14;
                            }
                            if (i23 == 0) {
                            }
                            if (i25 != 0) {
                                list2 = C10009j.f50944a;
                                i12 &= -234881025;
                            } else {
                                list2 = list;
                            }
                        } else {
                            if (i27 != 0) {
                                str2 = "";
                            } else {
                                str2 = str;
                            }
                            if (i28 != 0) {
                                f18 = 0.0f;
                            } else {
                                f18 = f3;
                            }
                            if (i13 != 0) {
                                f19 = 0.0f;
                            } else {
                                f19 = f10;
                            }
                            if (i15 != 0) {
                                f16 = 0.0f;
                            }
                            if (i17 != 0) {
                                f17 = 1.0f;
                            }
                            if (i19 == 0) {
                            }
                            if (i21 != 0) {
                                f21 = 0.0f;
                            } else {
                                f21 = f14;
                            }
                            if (i23 == 0) {
                            }
                            if (i25 != 0) {
                                list2 = C10009j.f50944a;
                                i12 &= -234881025;
                            } else {
                                list2 = list;
                            }
                        }
                        composerImplMo1636j.m1610R();
                        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q1118 = ComposerKt.f3003a;
                        vectorComposeKt$Group$1 = new InterfaceC2041a<C10001b>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$1
                            @Override // cm.InterfaceC2041a
                            /* JADX INFO: renamed from: E */
                            public final C10001b mo807E() {
                                return new C10001b();
                            }
                        };
                        composerImplMo1636j.mo1622c(-548224868);
                        if (composerImplMo1636j.f2910a instanceof C10006g) {
                            C8573r0.m16771y0();
                            throw null;
                        }
                        composerImplMo1636j.m1658u0();
                        if (composerImplMo1636j.f2897L) {
                            composerImplMo1636j.mo1634i(vectorComposeKt$Group$1);
                        } else {
                            composerImplMo1636j.mo1653s();
                        }
                        C8573r0.m16714a1(composerImplMo1636j, str2, new InterfaceC2056p<C10001b, String, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$1
                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(C10001b c10001b, String str3) {
                                C10001b c10001b2 = c10001b;
                                String str4 = str3;
                                C5207g.m11111f(c10001b2, "$this$set");
                                C5207g.m11111f(str4, "it");
                                c10001b2.f50825i = str4;
                                c10001b2.m18593c();
                                return C9072e.f47360a;
                            }
                        });
                        C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f18), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$2
                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                                C10001b c10001b2 = c10001b;
                                float fFloatValue = f30.floatValue();
                                C5207g.m11111f(c10001b2, "$this$set");
                                c10001b2.f50826j = fFloatValue;
                                c10001b2.f50833q = true;
                                c10001b2.m18593c();
                                return C9072e.f47360a;
                            }
                        });
                        C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f19), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$3
                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                                C10001b c10001b2 = c10001b;
                                float fFloatValue = f30.floatValue();
                                C5207g.m11111f(c10001b2, "$this$set");
                                c10001b2.f50827k = fFloatValue;
                                c10001b2.f50833q = true;
                                c10001b2.m18593c();
                                return C9072e.f47360a;
                            }
                        });
                        C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f16), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$4
                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                                C10001b c10001b2 = c10001b;
                                float fFloatValue = f30.floatValue();
                                C5207g.m11111f(c10001b2, "$this$set");
                                c10001b2.f50828l = fFloatValue;
                                c10001b2.f50833q = true;
                                c10001b2.m18593c();
                                return C9072e.f47360a;
                            }
                        });
                        C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f17), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$5
                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                                C10001b c10001b2 = c10001b;
                                float fFloatValue = f30.floatValue();
                                C5207g.m11111f(c10001b2, "$this$set");
                                c10001b2.f50829m = fFloatValue;
                                c10001b2.f50833q = true;
                                c10001b2.m18593c();
                                return C9072e.f47360a;
                            }
                        });
                        C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f20), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$6
                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                                C10001b c10001b2 = c10001b;
                                float fFloatValue = f30.floatValue();
                                C5207g.m11111f(c10001b2, "$this$set");
                                c10001b2.f50830n = fFloatValue;
                                c10001b2.f50833q = true;
                                c10001b2.m18593c();
                                return C9072e.f47360a;
                            }
                        });
                        C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f21), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$7
                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                                C10001b c10001b2 = c10001b;
                                float fFloatValue = f30.floatValue();
                                C5207g.m11111f(c10001b2, "$this$set");
                                c10001b2.f50831o = fFloatValue;
                                c10001b2.f50833q = true;
                                c10001b2.m18593c();
                                return C9072e.f47360a;
                            }
                        });
                        C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f22), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$8
                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                                C10001b c10001b2 = c10001b;
                                float fFloatValue = f30.floatValue();
                                C5207g.m11111f(c10001b2, "$this$set");
                                c10001b2.f50832p = fFloatValue;
                                c10001b2.f50833q = true;
                                c10001b2.m18593c();
                                return C9072e.f47360a;
                            }
                        });
                        C8573r0.m16714a1(composerImplMo1636j, list2, new InterfaceC2056p<C10001b, List<? extends AbstractC10003d>, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$9
                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(C10001b c10001b, List<? extends AbstractC10003d> list4) {
                                C10001b c10001b2 = c10001b;
                                List<? extends AbstractC10003d> list5 = list4;
                                C5207g.m11111f(c10001b2, "$this$set");
                                C5207g.m11111f(list5, "it");
                                c10001b2.f50820d = list5;
                                c10001b2.f50821e = true;
                                c10001b2.m18593c();
                                return C9072e.f47360a;
                            }
                        });
                        interfaceC2056p.mo1337m0(composerImplMo1636j, Integer.valueOf((i12 >> 27) & 14));
                        composerImplMo1636j.m1609Q(true);
                        composerImplMo1636j.m1609Q(false);
                        f23 = f19;
                        f24 = f22;
                        f25 = f20;
                        f26 = f21;
                        f27 = f17;
                        list3 = list2;
                        f28 = f18;
                        f29 = f16;
                    }
                    c5332q0M1612T = composerImplMo1636j.m1612T();
                    if (c5332q0M1612T == null) {
                        return;
                    }
                    c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$4
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                            num.intValue();
                            VectorComposeKt.m2005a(str2, f28, f23, f29, f27, f25, f26, f24, list3, interfaceC2056p, interfaceC0476a2, C8573r0.m16737l1(i10 | 1), i11);
                            return C9072e.f47360a;
                        }
                    };
                }
                i26 = 805306368;
                i12 |= i26;
                if (i25 != 256) {
                    composerImplMo1636j.m1654s0();
                    if ((i10 & 1) != 0) {
                        if (i27 != 0) {
                            str2 = "";
                        } else {
                            str2 = str;
                        }
                        if (i28 != 0) {
                            f18 = 0.0f;
                        } else {
                            f18 = f3;
                        }
                        if (i13 != 0) {
                            f19 = 0.0f;
                        } else {
                            f19 = f10;
                        }
                        if (i15 != 0) {
                            f16 = 0.0f;
                        }
                        if (i17 != 0) {
                            f17 = 1.0f;
                        }
                        if (i19 == 0) {
                        }
                        if (i21 != 0) {
                            f21 = 0.0f;
                        } else {
                            f21 = f14;
                        }
                        if (i23 == 0) {
                        }
                        if (i25 != 0) {
                            list2 = C10009j.f50944a;
                            i12 &= -234881025;
                        } else {
                            list2 = list;
                        }
                    } else {
                        if (i27 != 0) {
                            str2 = "";
                        } else {
                            str2 = str;
                        }
                        if (i28 != 0) {
                            f18 = 0.0f;
                        } else {
                            f18 = f3;
                        }
                        if (i13 != 0) {
                            f19 = 0.0f;
                        } else {
                            f19 = f10;
                        }
                        if (i15 != 0) {
                            f16 = 0.0f;
                        }
                        if (i17 != 0) {
                            f17 = 1.0f;
                        }
                        if (i19 == 0) {
                        }
                        if (i21 != 0) {
                            f21 = 0.0f;
                        } else {
                            f21 = f14;
                        }
                        if (i23 == 0) {
                        }
                        if (i25 != 0) {
                            list2 = C10009j.f50944a;
                            i12 &= -234881025;
                        } else {
                            list2 = list;
                        }
                    }
                    composerImplMo1636j.m1610R();
                    InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q1119 = ComposerKt.f3003a;
                    vectorComposeKt$Group$1 = new InterfaceC2041a<C10001b>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$1
                        @Override // cm.InterfaceC2041a
                        /* JADX INFO: renamed from: E */
                        public final C10001b mo807E() {
                            return new C10001b();
                        }
                    };
                    composerImplMo1636j.mo1622c(-548224868);
                    if (composerImplMo1636j.f2910a instanceof C10006g) {
                        C8573r0.m16771y0();
                        throw null;
                    }
                    composerImplMo1636j.m1658u0();
                    if (composerImplMo1636j.f2897L) {
                        composerImplMo1636j.mo1634i(vectorComposeKt$Group$1);
                    } else {
                        composerImplMo1636j.mo1653s();
                    }
                    C8573r0.m16714a1(composerImplMo1636j, str2, new InterfaceC2056p<C10001b, String, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$1
                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(C10001b c10001b, String str3) {
                            C10001b c10001b2 = c10001b;
                            String str4 = str3;
                            C5207g.m11111f(c10001b2, "$this$set");
                            C5207g.m11111f(str4, "it");
                            c10001b2.f50825i = str4;
                            c10001b2.m18593c();
                            return C9072e.f47360a;
                        }
                    });
                    C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f18), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$2
                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                            C10001b c10001b2 = c10001b;
                            float fFloatValue = f30.floatValue();
                            C5207g.m11111f(c10001b2, "$this$set");
                            c10001b2.f50826j = fFloatValue;
                            c10001b2.f50833q = true;
                            c10001b2.m18593c();
                            return C9072e.f47360a;
                        }
                    });
                    C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f19), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$3
                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                            C10001b c10001b2 = c10001b;
                            float fFloatValue = f30.floatValue();
                            C5207g.m11111f(c10001b2, "$this$set");
                            c10001b2.f50827k = fFloatValue;
                            c10001b2.f50833q = true;
                            c10001b2.m18593c();
                            return C9072e.f47360a;
                        }
                    });
                    C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f16), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$4
                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                            C10001b c10001b2 = c10001b;
                            float fFloatValue = f30.floatValue();
                            C5207g.m11111f(c10001b2, "$this$set");
                            c10001b2.f50828l = fFloatValue;
                            c10001b2.f50833q = true;
                            c10001b2.m18593c();
                            return C9072e.f47360a;
                        }
                    });
                    C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f17), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$5
                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                            C10001b c10001b2 = c10001b;
                            float fFloatValue = f30.floatValue();
                            C5207g.m11111f(c10001b2, "$this$set");
                            c10001b2.f50829m = fFloatValue;
                            c10001b2.f50833q = true;
                            c10001b2.m18593c();
                            return C9072e.f47360a;
                        }
                    });
                    C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f20), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$6
                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                            C10001b c10001b2 = c10001b;
                            float fFloatValue = f30.floatValue();
                            C5207g.m11111f(c10001b2, "$this$set");
                            c10001b2.f50830n = fFloatValue;
                            c10001b2.f50833q = true;
                            c10001b2.m18593c();
                            return C9072e.f47360a;
                        }
                    });
                    C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f21), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$7
                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                            C10001b c10001b2 = c10001b;
                            float fFloatValue = f30.floatValue();
                            C5207g.m11111f(c10001b2, "$this$set");
                            c10001b2.f50831o = fFloatValue;
                            c10001b2.f50833q = true;
                            c10001b2.m18593c();
                            return C9072e.f47360a;
                        }
                    });
                    C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f22), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$8
                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                            C10001b c10001b2 = c10001b;
                            float fFloatValue = f30.floatValue();
                            C5207g.m11111f(c10001b2, "$this$set");
                            c10001b2.f50832p = fFloatValue;
                            c10001b2.f50833q = true;
                            c10001b2.m18593c();
                            return C9072e.f47360a;
                        }
                    });
                    C8573r0.m16714a1(composerImplMo1636j, list2, new InterfaceC2056p<C10001b, List<? extends AbstractC10003d>, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$9
                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(C10001b c10001b, List<? extends AbstractC10003d> list4) {
                            C10001b c10001b2 = c10001b;
                            List<? extends AbstractC10003d> list5 = list4;
                            C5207g.m11111f(c10001b2, "$this$set");
                            C5207g.m11111f(list5, "it");
                            c10001b2.f50820d = list5;
                            c10001b2.f50821e = true;
                            c10001b2.m18593c();
                            return C9072e.f47360a;
                        }
                    });
                    interfaceC2056p.mo1337m0(composerImplMo1636j, Integer.valueOf((i12 >> 27) & 14));
                    composerImplMo1636j.m1609Q(true);
                    composerImplMo1636j.m1609Q(false);
                    f23 = f19;
                    f24 = f22;
                    f25 = f20;
                    f26 = f21;
                    f27 = f17;
                    list3 = list2;
                    f28 = f18;
                    f29 = f16;
                } else {
                    composerImplMo1636j.m1654s0();
                    if ((i10 & 1) != 0) {
                        if (i27 != 0) {
                            str2 = "";
                        } else {
                            str2 = str;
                        }
                        if (i28 != 0) {
                            f18 = 0.0f;
                        } else {
                            f18 = f3;
                        }
                        if (i13 != 0) {
                            f19 = 0.0f;
                        } else {
                            f19 = f10;
                        }
                        if (i15 != 0) {
                            f16 = 0.0f;
                        }
                        if (i17 != 0) {
                            f17 = 1.0f;
                        }
                        if (i19 == 0) {
                        }
                        if (i21 != 0) {
                            f21 = 0.0f;
                        } else {
                            f21 = f14;
                        }
                        if (i23 == 0) {
                        }
                        if (i25 != 0) {
                            list2 = C10009j.f50944a;
                            i12 &= -234881025;
                        } else {
                            list2 = list;
                        }
                    } else {
                        if (i27 != 0) {
                            str2 = "";
                        } else {
                            str2 = str;
                        }
                        if (i28 != 0) {
                            f18 = 0.0f;
                        } else {
                            f18 = f3;
                        }
                        if (i13 != 0) {
                            f19 = 0.0f;
                        } else {
                            f19 = f10;
                        }
                        if (i15 != 0) {
                            f16 = 0.0f;
                        }
                        if (i17 != 0) {
                            f17 = 1.0f;
                        }
                        if (i19 == 0) {
                        }
                        if (i21 != 0) {
                            f21 = 0.0f;
                        } else {
                            f21 = f14;
                        }
                        if (i23 == 0) {
                        }
                        if (i25 != 0) {
                            list2 = C10009j.f50944a;
                            i12 &= -234881025;
                        } else {
                            list2 = list;
                        }
                    }
                    composerImplMo1636j.m1610R();
                    InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q11110 = ComposerKt.f3003a;
                    vectorComposeKt$Group$1 = new InterfaceC2041a<C10001b>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$1
                        @Override // cm.InterfaceC2041a
                        /* JADX INFO: renamed from: E */
                        public final C10001b mo807E() {
                            return new C10001b();
                        }
                    };
                    composerImplMo1636j.mo1622c(-548224868);
                    if (composerImplMo1636j.f2910a instanceof C10006g) {
                        C8573r0.m16771y0();
                        throw null;
                    }
                    composerImplMo1636j.m1658u0();
                    if (composerImplMo1636j.f2897L) {
                        composerImplMo1636j.mo1634i(vectorComposeKt$Group$1);
                    } else {
                        composerImplMo1636j.mo1653s();
                    }
                    C8573r0.m16714a1(composerImplMo1636j, str2, new InterfaceC2056p<C10001b, String, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$1
                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(C10001b c10001b, String str3) {
                            C10001b c10001b2 = c10001b;
                            String str4 = str3;
                            C5207g.m11111f(c10001b2, "$this$set");
                            C5207g.m11111f(str4, "it");
                            c10001b2.f50825i = str4;
                            c10001b2.m18593c();
                            return C9072e.f47360a;
                        }
                    });
                    C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f18), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$2
                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                            C10001b c10001b2 = c10001b;
                            float fFloatValue = f30.floatValue();
                            C5207g.m11111f(c10001b2, "$this$set");
                            c10001b2.f50826j = fFloatValue;
                            c10001b2.f50833q = true;
                            c10001b2.m18593c();
                            return C9072e.f47360a;
                        }
                    });
                    C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f19), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$3
                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                            C10001b c10001b2 = c10001b;
                            float fFloatValue = f30.floatValue();
                            C5207g.m11111f(c10001b2, "$this$set");
                            c10001b2.f50827k = fFloatValue;
                            c10001b2.f50833q = true;
                            c10001b2.m18593c();
                            return C9072e.f47360a;
                        }
                    });
                    C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f16), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$4
                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                            C10001b c10001b2 = c10001b;
                            float fFloatValue = f30.floatValue();
                            C5207g.m11111f(c10001b2, "$this$set");
                            c10001b2.f50828l = fFloatValue;
                            c10001b2.f50833q = true;
                            c10001b2.m18593c();
                            return C9072e.f47360a;
                        }
                    });
                    C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f17), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$5
                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                            C10001b c10001b2 = c10001b;
                            float fFloatValue = f30.floatValue();
                            C5207g.m11111f(c10001b2, "$this$set");
                            c10001b2.f50829m = fFloatValue;
                            c10001b2.f50833q = true;
                            c10001b2.m18593c();
                            return C9072e.f47360a;
                        }
                    });
                    C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f20), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$6
                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                            C10001b c10001b2 = c10001b;
                            float fFloatValue = f30.floatValue();
                            C5207g.m11111f(c10001b2, "$this$set");
                            c10001b2.f50830n = fFloatValue;
                            c10001b2.f50833q = true;
                            c10001b2.m18593c();
                            return C9072e.f47360a;
                        }
                    });
                    C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f21), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$7
                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                            C10001b c10001b2 = c10001b;
                            float fFloatValue = f30.floatValue();
                            C5207g.m11111f(c10001b2, "$this$set");
                            c10001b2.f50831o = fFloatValue;
                            c10001b2.f50833q = true;
                            c10001b2.m18593c();
                            return C9072e.f47360a;
                        }
                    });
                    C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f22), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$8
                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                            C10001b c10001b2 = c10001b;
                            float fFloatValue = f30.floatValue();
                            C5207g.m11111f(c10001b2, "$this$set");
                            c10001b2.f50832p = fFloatValue;
                            c10001b2.f50833q = true;
                            c10001b2.m18593c();
                            return C9072e.f47360a;
                        }
                    });
                    C8573r0.m16714a1(composerImplMo1636j, list2, new InterfaceC2056p<C10001b, List<? extends AbstractC10003d>, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$9
                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(C10001b c10001b, List<? extends AbstractC10003d> list4) {
                            C10001b c10001b2 = c10001b;
                            List<? extends AbstractC10003d> list5 = list4;
                            C5207g.m11111f(c10001b2, "$this$set");
                            C5207g.m11111f(list5, "it");
                            c10001b2.f50820d = list5;
                            c10001b2.f50821e = true;
                            c10001b2.m18593c();
                            return C9072e.f47360a;
                        }
                    });
                    interfaceC2056p.mo1337m0(composerImplMo1636j, Integer.valueOf((i12 >> 27) & 14));
                    composerImplMo1636j.m1609Q(true);
                    composerImplMo1636j.m1609Q(false);
                    f23 = f19;
                    f24 = f22;
                    f25 = f20;
                    f26 = f21;
                    f27 = f17;
                    list3 = list2;
                    f28 = f18;
                    f29 = f16;
                }
                c5332q0M1612T = composerImplMo1636j.m1612T();
                if (c5332q0M1612T == null) {
                    return;
                }
                c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // cm.InterfaceC2056p
                    /* JADX INFO: renamed from: m0 */
                    public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                        num.intValue();
                        VectorComposeKt.m2005a(str2, f28, f23, f29, f27, f25, f26, f24, list3, interfaceC2056p, interfaceC0476a2, C8573r0.m16737l1(i10 | 1), i11);
                        return C9072e.f47360a;
                    }
                };
            }
            i12 |= 3072;
            f16 = f11;
            i17 = i11 & 16;
            if (i17 != 0) {
                if ((57344 & i10) == 0) {
                    f17 = f12;
                    if (composerImplMo1636j.m1592D(f17)) {
                        i18 = 16384;
                    } else {
                        i18 = 8192;
                    }
                    i12 |= i18;
                }
                i19 = i11 & 32;
                if (i19 != 0) {
                    i12 |= 196608;
                } else if ((i10 & 458752) == 0) {
                    if (composerImplMo1636j.m1592D(f13)) {
                        i20 = 131072;
                    } else {
                        i20 = 65536;
                    }
                    i12 |= i20;
                }
                i21 = i11 & 64;
                if (i21 != 0) {
                    i12 |= 1572864;
                } else if ((i10 & 3670016) == 0) {
                    if (composerImplMo1636j.m1592D(f14)) {
                        i22 = 1048576;
                    } else {
                        i22 = 524288;
                    }
                    i12 |= i22;
                }
                i23 = i11 & BuildConfig.SDK_TRUNCATE_LENGTH;
                if (i23 != 0) {
                    i12 |= 12582912;
                } else if ((i10 & 29360128) == 0) {
                    if (composerImplMo1636j.m1592D(f15)) {
                        i24 = 8388608;
                    } else {
                        i24 = 4194304;
                    }
                    i12 |= i24;
                }
                i25 = i11 & 256;
                if (i25 != 0) {
                    i12 |= 33554432;
                }
                if ((i11 & 512) != 0) {
                    if ((1879048192 & i10) == 0) {
                        if (composerImplMo1636j.m1600H(interfaceC2056p)) {
                            i26 = 536870912;
                        } else {
                            i26 = 268435456;
                        }
                    }
                    if (i25 != 256) {
                        composerImplMo1636j.m1654s0();
                        if ((i10 & 1) != 0) {
                            if (i27 != 0) {
                                str2 = "";
                            } else {
                                str2 = str;
                            }
                            if (i28 != 0) {
                                f18 = 0.0f;
                            } else {
                                f18 = f3;
                            }
                            if (i13 != 0) {
                                f19 = 0.0f;
                            } else {
                                f19 = f10;
                            }
                            if (i15 != 0) {
                                f16 = 0.0f;
                            }
                            if (i17 != 0) {
                                f17 = 1.0f;
                            }
                            if (i19 == 0) {
                            }
                            if (i21 != 0) {
                                f21 = 0.0f;
                            } else {
                                f21 = f14;
                            }
                            if (i23 == 0) {
                            }
                            if (i25 != 0) {
                                list2 = C10009j.f50944a;
                                i12 &= -234881025;
                            } else {
                                list2 = list;
                            }
                        } else {
                            if (i27 != 0) {
                                str2 = "";
                            } else {
                                str2 = str;
                            }
                            if (i28 != 0) {
                                f18 = 0.0f;
                            } else {
                                f18 = f3;
                            }
                            if (i13 != 0) {
                                f19 = 0.0f;
                            } else {
                                f19 = f10;
                            }
                            if (i15 != 0) {
                                f16 = 0.0f;
                            }
                            if (i17 != 0) {
                                f17 = 1.0f;
                            }
                            if (i19 == 0) {
                            }
                            if (i21 != 0) {
                                f21 = 0.0f;
                            } else {
                                f21 = f14;
                            }
                            if (i23 == 0) {
                            }
                            if (i25 != 0) {
                                list2 = C10009j.f50944a;
                                i12 &= -234881025;
                            } else {
                                list2 = list;
                            }
                        }
                        composerImplMo1636j.m1610R();
                        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q11111 = ComposerKt.f3003a;
                        vectorComposeKt$Group$1 = new InterfaceC2041a<C10001b>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$1
                            @Override // cm.InterfaceC2041a
                            /* JADX INFO: renamed from: E */
                            public final C10001b mo807E() {
                                return new C10001b();
                            }
                        };
                        composerImplMo1636j.mo1622c(-548224868);
                        if (composerImplMo1636j.f2910a instanceof C10006g) {
                            C8573r0.m16771y0();
                            throw null;
                        }
                        composerImplMo1636j.m1658u0();
                        if (composerImplMo1636j.f2897L) {
                            composerImplMo1636j.mo1634i(vectorComposeKt$Group$1);
                        } else {
                            composerImplMo1636j.mo1653s();
                        }
                        C8573r0.m16714a1(composerImplMo1636j, str2, new InterfaceC2056p<C10001b, String, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$1
                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(C10001b c10001b, String str3) {
                                C10001b c10001b2 = c10001b;
                                String str4 = str3;
                                C5207g.m11111f(c10001b2, "$this$set");
                                C5207g.m11111f(str4, "it");
                                c10001b2.f50825i = str4;
                                c10001b2.m18593c();
                                return C9072e.f47360a;
                            }
                        });
                        C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f18), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$2
                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                                C10001b c10001b2 = c10001b;
                                float fFloatValue = f30.floatValue();
                                C5207g.m11111f(c10001b2, "$this$set");
                                c10001b2.f50826j = fFloatValue;
                                c10001b2.f50833q = true;
                                c10001b2.m18593c();
                                return C9072e.f47360a;
                            }
                        });
                        C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f19), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$3
                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                                C10001b c10001b2 = c10001b;
                                float fFloatValue = f30.floatValue();
                                C5207g.m11111f(c10001b2, "$this$set");
                                c10001b2.f50827k = fFloatValue;
                                c10001b2.f50833q = true;
                                c10001b2.m18593c();
                                return C9072e.f47360a;
                            }
                        });
                        C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f16), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$4
                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                                C10001b c10001b2 = c10001b;
                                float fFloatValue = f30.floatValue();
                                C5207g.m11111f(c10001b2, "$this$set");
                                c10001b2.f50828l = fFloatValue;
                                c10001b2.f50833q = true;
                                c10001b2.m18593c();
                                return C9072e.f47360a;
                            }
                        });
                        C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f17), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$5
                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                                C10001b c10001b2 = c10001b;
                                float fFloatValue = f30.floatValue();
                                C5207g.m11111f(c10001b2, "$this$set");
                                c10001b2.f50829m = fFloatValue;
                                c10001b2.f50833q = true;
                                c10001b2.m18593c();
                                return C9072e.f47360a;
                            }
                        });
                        C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f20), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$6
                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                                C10001b c10001b2 = c10001b;
                                float fFloatValue = f30.floatValue();
                                C5207g.m11111f(c10001b2, "$this$set");
                                c10001b2.f50830n = fFloatValue;
                                c10001b2.f50833q = true;
                                c10001b2.m18593c();
                                return C9072e.f47360a;
                            }
                        });
                        C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f21), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$7
                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                                C10001b c10001b2 = c10001b;
                                float fFloatValue = f30.floatValue();
                                C5207g.m11111f(c10001b2, "$this$set");
                                c10001b2.f50831o = fFloatValue;
                                c10001b2.f50833q = true;
                                c10001b2.m18593c();
                                return C9072e.f47360a;
                            }
                        });
                        C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f22), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$8
                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                                C10001b c10001b2 = c10001b;
                                float fFloatValue = f30.floatValue();
                                C5207g.m11111f(c10001b2, "$this$set");
                                c10001b2.f50832p = fFloatValue;
                                c10001b2.f50833q = true;
                                c10001b2.m18593c();
                                return C9072e.f47360a;
                            }
                        });
                        C8573r0.m16714a1(composerImplMo1636j, list2, new InterfaceC2056p<C10001b, List<? extends AbstractC10003d>, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$9
                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(C10001b c10001b, List<? extends AbstractC10003d> list4) {
                                C10001b c10001b2 = c10001b;
                                List<? extends AbstractC10003d> list5 = list4;
                                C5207g.m11111f(c10001b2, "$this$set");
                                C5207g.m11111f(list5, "it");
                                c10001b2.f50820d = list5;
                                c10001b2.f50821e = true;
                                c10001b2.m18593c();
                                return C9072e.f47360a;
                            }
                        });
                        interfaceC2056p.mo1337m0(composerImplMo1636j, Integer.valueOf((i12 >> 27) & 14));
                        composerImplMo1636j.m1609Q(true);
                        composerImplMo1636j.m1609Q(false);
                        f23 = f19;
                        f24 = f22;
                        f25 = f20;
                        f26 = f21;
                        f27 = f17;
                        list3 = list2;
                        f28 = f18;
                        f29 = f16;
                    } else {
                        composerImplMo1636j.m1654s0();
                        if ((i10 & 1) != 0) {
                            if (i27 != 0) {
                                str2 = "";
                            } else {
                                str2 = str;
                            }
                            if (i28 != 0) {
                                f18 = 0.0f;
                            } else {
                                f18 = f3;
                            }
                            if (i13 != 0) {
                                f19 = 0.0f;
                            } else {
                                f19 = f10;
                            }
                            if (i15 != 0) {
                                f16 = 0.0f;
                            }
                            if (i17 != 0) {
                                f17 = 1.0f;
                            }
                            if (i19 == 0) {
                            }
                            if (i21 != 0) {
                                f21 = 0.0f;
                            } else {
                                f21 = f14;
                            }
                            if (i23 == 0) {
                            }
                            if (i25 != 0) {
                                list2 = C10009j.f50944a;
                                i12 &= -234881025;
                            } else {
                                list2 = list;
                            }
                        } else {
                            if (i27 != 0) {
                                str2 = "";
                            } else {
                                str2 = str;
                            }
                            if (i28 != 0) {
                                f18 = 0.0f;
                            } else {
                                f18 = f3;
                            }
                            if (i13 != 0) {
                                f19 = 0.0f;
                            } else {
                                f19 = f10;
                            }
                            if (i15 != 0) {
                                f16 = 0.0f;
                            }
                            if (i17 != 0) {
                                f17 = 1.0f;
                            }
                            if (i19 == 0) {
                            }
                            if (i21 != 0) {
                                f21 = 0.0f;
                            } else {
                                f21 = f14;
                            }
                            if (i23 == 0) {
                            }
                            if (i25 != 0) {
                                list2 = C10009j.f50944a;
                                i12 &= -234881025;
                            } else {
                                list2 = list;
                            }
                        }
                        composerImplMo1636j.m1610R();
                        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q11112 = ComposerKt.f3003a;
                        vectorComposeKt$Group$1 = new InterfaceC2041a<C10001b>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$1
                            @Override // cm.InterfaceC2041a
                            /* JADX INFO: renamed from: E */
                            public final C10001b mo807E() {
                                return new C10001b();
                            }
                        };
                        composerImplMo1636j.mo1622c(-548224868);
                        if (composerImplMo1636j.f2910a instanceof C10006g) {
                            C8573r0.m16771y0();
                            throw null;
                        }
                        composerImplMo1636j.m1658u0();
                        if (composerImplMo1636j.f2897L) {
                            composerImplMo1636j.mo1634i(vectorComposeKt$Group$1);
                        } else {
                            composerImplMo1636j.mo1653s();
                        }
                        C8573r0.m16714a1(composerImplMo1636j, str2, new InterfaceC2056p<C10001b, String, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$1
                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(C10001b c10001b, String str3) {
                                C10001b c10001b2 = c10001b;
                                String str4 = str3;
                                C5207g.m11111f(c10001b2, "$this$set");
                                C5207g.m11111f(str4, "it");
                                c10001b2.f50825i = str4;
                                c10001b2.m18593c();
                                return C9072e.f47360a;
                            }
                        });
                        C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f18), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$2
                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                                C10001b c10001b2 = c10001b;
                                float fFloatValue = f30.floatValue();
                                C5207g.m11111f(c10001b2, "$this$set");
                                c10001b2.f50826j = fFloatValue;
                                c10001b2.f50833q = true;
                                c10001b2.m18593c();
                                return C9072e.f47360a;
                            }
                        });
                        C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f19), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$3
                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                                C10001b c10001b2 = c10001b;
                                float fFloatValue = f30.floatValue();
                                C5207g.m11111f(c10001b2, "$this$set");
                                c10001b2.f50827k = fFloatValue;
                                c10001b2.f50833q = true;
                                c10001b2.m18593c();
                                return C9072e.f47360a;
                            }
                        });
                        C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f16), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$4
                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                                C10001b c10001b2 = c10001b;
                                float fFloatValue = f30.floatValue();
                                C5207g.m11111f(c10001b2, "$this$set");
                                c10001b2.f50828l = fFloatValue;
                                c10001b2.f50833q = true;
                                c10001b2.m18593c();
                                return C9072e.f47360a;
                            }
                        });
                        C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f17), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$5
                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                                C10001b c10001b2 = c10001b;
                                float fFloatValue = f30.floatValue();
                                C5207g.m11111f(c10001b2, "$this$set");
                                c10001b2.f50829m = fFloatValue;
                                c10001b2.f50833q = true;
                                c10001b2.m18593c();
                                return C9072e.f47360a;
                            }
                        });
                        C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f20), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$6
                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                                C10001b c10001b2 = c10001b;
                                float fFloatValue = f30.floatValue();
                                C5207g.m11111f(c10001b2, "$this$set");
                                c10001b2.f50830n = fFloatValue;
                                c10001b2.f50833q = true;
                                c10001b2.m18593c();
                                return C9072e.f47360a;
                            }
                        });
                        C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f21), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$7
                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                                C10001b c10001b2 = c10001b;
                                float fFloatValue = f30.floatValue();
                                C5207g.m11111f(c10001b2, "$this$set");
                                c10001b2.f50831o = fFloatValue;
                                c10001b2.f50833q = true;
                                c10001b2.m18593c();
                                return C9072e.f47360a;
                            }
                        });
                        C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f22), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$8
                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                                C10001b c10001b2 = c10001b;
                                float fFloatValue = f30.floatValue();
                                C5207g.m11111f(c10001b2, "$this$set");
                                c10001b2.f50832p = fFloatValue;
                                c10001b2.f50833q = true;
                                c10001b2.m18593c();
                                return C9072e.f47360a;
                            }
                        });
                        C8573r0.m16714a1(composerImplMo1636j, list2, new InterfaceC2056p<C10001b, List<? extends AbstractC10003d>, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$9
                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(C10001b c10001b, List<? extends AbstractC10003d> list4) {
                                C10001b c10001b2 = c10001b;
                                List<? extends AbstractC10003d> list5 = list4;
                                C5207g.m11111f(c10001b2, "$this$set");
                                C5207g.m11111f(list5, "it");
                                c10001b2.f50820d = list5;
                                c10001b2.f50821e = true;
                                c10001b2.m18593c();
                                return C9072e.f47360a;
                            }
                        });
                        interfaceC2056p.mo1337m0(composerImplMo1636j, Integer.valueOf((i12 >> 27) & 14));
                        composerImplMo1636j.m1609Q(true);
                        composerImplMo1636j.m1609Q(false);
                        f23 = f19;
                        f24 = f22;
                        f25 = f20;
                        f26 = f21;
                        f27 = f17;
                        list3 = list2;
                        f28 = f18;
                        f29 = f16;
                    }
                    c5332q0M1612T = composerImplMo1636j.m1612T();
                    if (c5332q0M1612T == null) {
                        return;
                    }
                    c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$4
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                            num.intValue();
                            VectorComposeKt.m2005a(str2, f28, f23, f29, f27, f25, f26, f24, list3, interfaceC2056p, interfaceC0476a2, C8573r0.m16737l1(i10 | 1), i11);
                            return C9072e.f47360a;
                        }
                    };
                }
                i26 = 805306368;
                i12 |= i26;
                if (i25 != 256) {
                    composerImplMo1636j.m1654s0();
                    if ((i10 & 1) != 0) {
                        if (i27 != 0) {
                            str2 = "";
                        } else {
                            str2 = str;
                        }
                        if (i28 != 0) {
                            f18 = 0.0f;
                        } else {
                            f18 = f3;
                        }
                        if (i13 != 0) {
                            f19 = 0.0f;
                        } else {
                            f19 = f10;
                        }
                        if (i15 != 0) {
                            f16 = 0.0f;
                        }
                        if (i17 != 0) {
                            f17 = 1.0f;
                        }
                        if (i19 == 0) {
                        }
                        if (i21 != 0) {
                            f21 = 0.0f;
                        } else {
                            f21 = f14;
                        }
                        if (i23 == 0) {
                        }
                        if (i25 != 0) {
                            list2 = C10009j.f50944a;
                            i12 &= -234881025;
                        } else {
                            list2 = list;
                        }
                    } else {
                        if (i27 != 0) {
                            str2 = "";
                        } else {
                            str2 = str;
                        }
                        if (i28 != 0) {
                            f18 = 0.0f;
                        } else {
                            f18 = f3;
                        }
                        if (i13 != 0) {
                            f19 = 0.0f;
                        } else {
                            f19 = f10;
                        }
                        if (i15 != 0) {
                            f16 = 0.0f;
                        }
                        if (i17 != 0) {
                            f17 = 1.0f;
                        }
                        if (i19 == 0) {
                        }
                        if (i21 != 0) {
                            f21 = 0.0f;
                        } else {
                            f21 = f14;
                        }
                        if (i23 == 0) {
                        }
                        if (i25 != 0) {
                            list2 = C10009j.f50944a;
                            i12 &= -234881025;
                        } else {
                            list2 = list;
                        }
                    }
                    composerImplMo1636j.m1610R();
                    InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q11113 = ComposerKt.f3003a;
                    vectorComposeKt$Group$1 = new InterfaceC2041a<C10001b>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$1
                        @Override // cm.InterfaceC2041a
                        /* JADX INFO: renamed from: E */
                        public final C10001b mo807E() {
                            return new C10001b();
                        }
                    };
                    composerImplMo1636j.mo1622c(-548224868);
                    if (composerImplMo1636j.f2910a instanceof C10006g) {
                        C8573r0.m16771y0();
                        throw null;
                    }
                    composerImplMo1636j.m1658u0();
                    if (composerImplMo1636j.f2897L) {
                        composerImplMo1636j.mo1634i(vectorComposeKt$Group$1);
                    } else {
                        composerImplMo1636j.mo1653s();
                    }
                    C8573r0.m16714a1(composerImplMo1636j, str2, new InterfaceC2056p<C10001b, String, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$1
                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(C10001b c10001b, String str3) {
                            C10001b c10001b2 = c10001b;
                            String str4 = str3;
                            C5207g.m11111f(c10001b2, "$this$set");
                            C5207g.m11111f(str4, "it");
                            c10001b2.f50825i = str4;
                            c10001b2.m18593c();
                            return C9072e.f47360a;
                        }
                    });
                    C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f18), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$2
                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                            C10001b c10001b2 = c10001b;
                            float fFloatValue = f30.floatValue();
                            C5207g.m11111f(c10001b2, "$this$set");
                            c10001b2.f50826j = fFloatValue;
                            c10001b2.f50833q = true;
                            c10001b2.m18593c();
                            return C9072e.f47360a;
                        }
                    });
                    C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f19), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$3
                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                            C10001b c10001b2 = c10001b;
                            float fFloatValue = f30.floatValue();
                            C5207g.m11111f(c10001b2, "$this$set");
                            c10001b2.f50827k = fFloatValue;
                            c10001b2.f50833q = true;
                            c10001b2.m18593c();
                            return C9072e.f47360a;
                        }
                    });
                    C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f16), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$4
                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                            C10001b c10001b2 = c10001b;
                            float fFloatValue = f30.floatValue();
                            C5207g.m11111f(c10001b2, "$this$set");
                            c10001b2.f50828l = fFloatValue;
                            c10001b2.f50833q = true;
                            c10001b2.m18593c();
                            return C9072e.f47360a;
                        }
                    });
                    C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f17), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$5
                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                            C10001b c10001b2 = c10001b;
                            float fFloatValue = f30.floatValue();
                            C5207g.m11111f(c10001b2, "$this$set");
                            c10001b2.f50829m = fFloatValue;
                            c10001b2.f50833q = true;
                            c10001b2.m18593c();
                            return C9072e.f47360a;
                        }
                    });
                    C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f20), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$6
                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                            C10001b c10001b2 = c10001b;
                            float fFloatValue = f30.floatValue();
                            C5207g.m11111f(c10001b2, "$this$set");
                            c10001b2.f50830n = fFloatValue;
                            c10001b2.f50833q = true;
                            c10001b2.m18593c();
                            return C9072e.f47360a;
                        }
                    });
                    C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f21), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$7
                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                            C10001b c10001b2 = c10001b;
                            float fFloatValue = f30.floatValue();
                            C5207g.m11111f(c10001b2, "$this$set");
                            c10001b2.f50831o = fFloatValue;
                            c10001b2.f50833q = true;
                            c10001b2.m18593c();
                            return C9072e.f47360a;
                        }
                    });
                    C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f22), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$8
                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                            C10001b c10001b2 = c10001b;
                            float fFloatValue = f30.floatValue();
                            C5207g.m11111f(c10001b2, "$this$set");
                            c10001b2.f50832p = fFloatValue;
                            c10001b2.f50833q = true;
                            c10001b2.m18593c();
                            return C9072e.f47360a;
                        }
                    });
                    C8573r0.m16714a1(composerImplMo1636j, list2, new InterfaceC2056p<C10001b, List<? extends AbstractC10003d>, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$9
                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(C10001b c10001b, List<? extends AbstractC10003d> list4) {
                            C10001b c10001b2 = c10001b;
                            List<? extends AbstractC10003d> list5 = list4;
                            C5207g.m11111f(c10001b2, "$this$set");
                            C5207g.m11111f(list5, "it");
                            c10001b2.f50820d = list5;
                            c10001b2.f50821e = true;
                            c10001b2.m18593c();
                            return C9072e.f47360a;
                        }
                    });
                    interfaceC2056p.mo1337m0(composerImplMo1636j, Integer.valueOf((i12 >> 27) & 14));
                    composerImplMo1636j.m1609Q(true);
                    composerImplMo1636j.m1609Q(false);
                    f23 = f19;
                    f24 = f22;
                    f25 = f20;
                    f26 = f21;
                    f27 = f17;
                    list3 = list2;
                    f28 = f18;
                    f29 = f16;
                } else {
                    composerImplMo1636j.m1654s0();
                    if ((i10 & 1) != 0) {
                        if (i27 != 0) {
                            str2 = "";
                        } else {
                            str2 = str;
                        }
                        if (i28 != 0) {
                            f18 = 0.0f;
                        } else {
                            f18 = f3;
                        }
                        if (i13 != 0) {
                            f19 = 0.0f;
                        } else {
                            f19 = f10;
                        }
                        if (i15 != 0) {
                            f16 = 0.0f;
                        }
                        if (i17 != 0) {
                            f17 = 1.0f;
                        }
                        if (i19 == 0) {
                        }
                        if (i21 != 0) {
                            f21 = 0.0f;
                        } else {
                            f21 = f14;
                        }
                        if (i23 == 0) {
                        }
                        if (i25 != 0) {
                            list2 = C10009j.f50944a;
                            i12 &= -234881025;
                        } else {
                            list2 = list;
                        }
                    } else {
                        if (i27 != 0) {
                            str2 = "";
                        } else {
                            str2 = str;
                        }
                        if (i28 != 0) {
                            f18 = 0.0f;
                        } else {
                            f18 = f3;
                        }
                        if (i13 != 0) {
                            f19 = 0.0f;
                        } else {
                            f19 = f10;
                        }
                        if (i15 != 0) {
                            f16 = 0.0f;
                        }
                        if (i17 != 0) {
                            f17 = 1.0f;
                        }
                        if (i19 == 0) {
                        }
                        if (i21 != 0) {
                            f21 = 0.0f;
                        } else {
                            f21 = f14;
                        }
                        if (i23 == 0) {
                        }
                        if (i25 != 0) {
                            list2 = C10009j.f50944a;
                            i12 &= -234881025;
                        } else {
                            list2 = list;
                        }
                    }
                    composerImplMo1636j.m1610R();
                    InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q11114 = ComposerKt.f3003a;
                    vectorComposeKt$Group$1 = new InterfaceC2041a<C10001b>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$1
                        @Override // cm.InterfaceC2041a
                        /* JADX INFO: renamed from: E */
                        public final C10001b mo807E() {
                            return new C10001b();
                        }
                    };
                    composerImplMo1636j.mo1622c(-548224868);
                    if (composerImplMo1636j.f2910a instanceof C10006g) {
                        C8573r0.m16771y0();
                        throw null;
                    }
                    composerImplMo1636j.m1658u0();
                    if (composerImplMo1636j.f2897L) {
                        composerImplMo1636j.mo1634i(vectorComposeKt$Group$1);
                    } else {
                        composerImplMo1636j.mo1653s();
                    }
                    C8573r0.m16714a1(composerImplMo1636j, str2, new InterfaceC2056p<C10001b, String, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$1
                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(C10001b c10001b, String str3) {
                            C10001b c10001b2 = c10001b;
                            String str4 = str3;
                            C5207g.m11111f(c10001b2, "$this$set");
                            C5207g.m11111f(str4, "it");
                            c10001b2.f50825i = str4;
                            c10001b2.m18593c();
                            return C9072e.f47360a;
                        }
                    });
                    C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f18), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$2
                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                            C10001b c10001b2 = c10001b;
                            float fFloatValue = f30.floatValue();
                            C5207g.m11111f(c10001b2, "$this$set");
                            c10001b2.f50826j = fFloatValue;
                            c10001b2.f50833q = true;
                            c10001b2.m18593c();
                            return C9072e.f47360a;
                        }
                    });
                    C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f19), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$3
                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                            C10001b c10001b2 = c10001b;
                            float fFloatValue = f30.floatValue();
                            C5207g.m11111f(c10001b2, "$this$set");
                            c10001b2.f50827k = fFloatValue;
                            c10001b2.f50833q = true;
                            c10001b2.m18593c();
                            return C9072e.f47360a;
                        }
                    });
                    C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f16), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$4
                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                            C10001b c10001b2 = c10001b;
                            float fFloatValue = f30.floatValue();
                            C5207g.m11111f(c10001b2, "$this$set");
                            c10001b2.f50828l = fFloatValue;
                            c10001b2.f50833q = true;
                            c10001b2.m18593c();
                            return C9072e.f47360a;
                        }
                    });
                    C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f17), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$5
                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                            C10001b c10001b2 = c10001b;
                            float fFloatValue = f30.floatValue();
                            C5207g.m11111f(c10001b2, "$this$set");
                            c10001b2.f50829m = fFloatValue;
                            c10001b2.f50833q = true;
                            c10001b2.m18593c();
                            return C9072e.f47360a;
                        }
                    });
                    C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f20), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$6
                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                            C10001b c10001b2 = c10001b;
                            float fFloatValue = f30.floatValue();
                            C5207g.m11111f(c10001b2, "$this$set");
                            c10001b2.f50830n = fFloatValue;
                            c10001b2.f50833q = true;
                            c10001b2.m18593c();
                            return C9072e.f47360a;
                        }
                    });
                    C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f21), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$7
                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                            C10001b c10001b2 = c10001b;
                            float fFloatValue = f30.floatValue();
                            C5207g.m11111f(c10001b2, "$this$set");
                            c10001b2.f50831o = fFloatValue;
                            c10001b2.f50833q = true;
                            c10001b2.m18593c();
                            return C9072e.f47360a;
                        }
                    });
                    C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f22), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$8
                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                            C10001b c10001b2 = c10001b;
                            float fFloatValue = f30.floatValue();
                            C5207g.m11111f(c10001b2, "$this$set");
                            c10001b2.f50832p = fFloatValue;
                            c10001b2.f50833q = true;
                            c10001b2.m18593c();
                            return C9072e.f47360a;
                        }
                    });
                    C8573r0.m16714a1(composerImplMo1636j, list2, new InterfaceC2056p<C10001b, List<? extends AbstractC10003d>, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$9
                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(C10001b c10001b, List<? extends AbstractC10003d> list4) {
                            C10001b c10001b2 = c10001b;
                            List<? extends AbstractC10003d> list5 = list4;
                            C5207g.m11111f(c10001b2, "$this$set");
                            C5207g.m11111f(list5, "it");
                            c10001b2.f50820d = list5;
                            c10001b2.f50821e = true;
                            c10001b2.m18593c();
                            return C9072e.f47360a;
                        }
                    });
                    interfaceC2056p.mo1337m0(composerImplMo1636j, Integer.valueOf((i12 >> 27) & 14));
                    composerImplMo1636j.m1609Q(true);
                    composerImplMo1636j.m1609Q(false);
                    f23 = f19;
                    f24 = f22;
                    f25 = f20;
                    f26 = f21;
                    f27 = f17;
                    list3 = list2;
                    f28 = f18;
                    f29 = f16;
                }
                c5332q0M1612T = composerImplMo1636j.m1612T();
                if (c5332q0M1612T == null) {
                    return;
                }
                c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // cm.InterfaceC2056p
                    /* JADX INFO: renamed from: m0 */
                    public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                        num.intValue();
                        VectorComposeKt.m2005a(str2, f28, f23, f29, f27, f25, f26, f24, list3, interfaceC2056p, interfaceC0476a2, C8573r0.m16737l1(i10 | 1), i11);
                        return C9072e.f47360a;
                    }
                };
            }
            i12 |= 24576;
            f17 = f12;
            i19 = i11 & 32;
            if (i19 != 0) {
                i12 |= 196608;
            } else if ((i10 & 458752) == 0) {
                if (composerImplMo1636j.m1592D(f13)) {
                    i20 = 131072;
                } else {
                    i20 = 65536;
                }
                i12 |= i20;
            }
            i21 = i11 & 64;
            if (i21 != 0) {
                i12 |= 1572864;
            } else if ((i10 & 3670016) == 0) {
                if (composerImplMo1636j.m1592D(f14)) {
                    i22 = 1048576;
                } else {
                    i22 = 524288;
                }
                i12 |= i22;
            }
            i23 = i11 & BuildConfig.SDK_TRUNCATE_LENGTH;
            if (i23 != 0) {
                i12 |= 12582912;
            } else if ((i10 & 29360128) == 0) {
                if (composerImplMo1636j.m1592D(f15)) {
                    i24 = 8388608;
                } else {
                    i24 = 4194304;
                }
                i12 |= i24;
            }
            i25 = i11 & 256;
            if (i25 != 0) {
                i12 |= 33554432;
            }
            if ((i11 & 512) != 0) {
                if ((1879048192 & i10) == 0) {
                    if (composerImplMo1636j.m1600H(interfaceC2056p)) {
                        i26 = 536870912;
                    } else {
                        i26 = 268435456;
                    }
                }
                if (i25 != 256) {
                    composerImplMo1636j.m1654s0();
                    if ((i10 & 1) != 0) {
                        if (i27 != 0) {
                            str2 = "";
                        } else {
                            str2 = str;
                        }
                        if (i28 != 0) {
                            f18 = 0.0f;
                        } else {
                            f18 = f3;
                        }
                        if (i13 != 0) {
                            f19 = 0.0f;
                        } else {
                            f19 = f10;
                        }
                        if (i15 != 0) {
                            f16 = 0.0f;
                        }
                        if (i17 != 0) {
                            f17 = 1.0f;
                        }
                        if (i19 == 0) {
                        }
                        if (i21 != 0) {
                            f21 = 0.0f;
                        } else {
                            f21 = f14;
                        }
                        if (i23 == 0) {
                        }
                        if (i25 != 0) {
                            list2 = C10009j.f50944a;
                            i12 &= -234881025;
                        } else {
                            list2 = list;
                        }
                    } else {
                        if (i27 != 0) {
                            str2 = "";
                        } else {
                            str2 = str;
                        }
                        if (i28 != 0) {
                            f18 = 0.0f;
                        } else {
                            f18 = f3;
                        }
                        if (i13 != 0) {
                            f19 = 0.0f;
                        } else {
                            f19 = f10;
                        }
                        if (i15 != 0) {
                            f16 = 0.0f;
                        }
                        if (i17 != 0) {
                            f17 = 1.0f;
                        }
                        if (i19 == 0) {
                        }
                        if (i21 != 0) {
                            f21 = 0.0f;
                        } else {
                            f21 = f14;
                        }
                        if (i23 == 0) {
                        }
                        if (i25 != 0) {
                            list2 = C10009j.f50944a;
                            i12 &= -234881025;
                        } else {
                            list2 = list;
                        }
                    }
                    composerImplMo1636j.m1610R();
                    InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q11115 = ComposerKt.f3003a;
                    vectorComposeKt$Group$1 = new InterfaceC2041a<C10001b>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$1
                        @Override // cm.InterfaceC2041a
                        /* JADX INFO: renamed from: E */
                        public final C10001b mo807E() {
                            return new C10001b();
                        }
                    };
                    composerImplMo1636j.mo1622c(-548224868);
                    if (composerImplMo1636j.f2910a instanceof C10006g) {
                        C8573r0.m16771y0();
                        throw null;
                    }
                    composerImplMo1636j.m1658u0();
                    if (composerImplMo1636j.f2897L) {
                        composerImplMo1636j.mo1634i(vectorComposeKt$Group$1);
                    } else {
                        composerImplMo1636j.mo1653s();
                    }
                    C8573r0.m16714a1(composerImplMo1636j, str2, new InterfaceC2056p<C10001b, String, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$1
                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(C10001b c10001b, String str3) {
                            C10001b c10001b2 = c10001b;
                            String str4 = str3;
                            C5207g.m11111f(c10001b2, "$this$set");
                            C5207g.m11111f(str4, "it");
                            c10001b2.f50825i = str4;
                            c10001b2.m18593c();
                            return C9072e.f47360a;
                        }
                    });
                    C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f18), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$2
                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                            C10001b c10001b2 = c10001b;
                            float fFloatValue = f30.floatValue();
                            C5207g.m11111f(c10001b2, "$this$set");
                            c10001b2.f50826j = fFloatValue;
                            c10001b2.f50833q = true;
                            c10001b2.m18593c();
                            return C9072e.f47360a;
                        }
                    });
                    C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f19), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$3
                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                            C10001b c10001b2 = c10001b;
                            float fFloatValue = f30.floatValue();
                            C5207g.m11111f(c10001b2, "$this$set");
                            c10001b2.f50827k = fFloatValue;
                            c10001b2.f50833q = true;
                            c10001b2.m18593c();
                            return C9072e.f47360a;
                        }
                    });
                    C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f16), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$4
                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                            C10001b c10001b2 = c10001b;
                            float fFloatValue = f30.floatValue();
                            C5207g.m11111f(c10001b2, "$this$set");
                            c10001b2.f50828l = fFloatValue;
                            c10001b2.f50833q = true;
                            c10001b2.m18593c();
                            return C9072e.f47360a;
                        }
                    });
                    C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f17), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$5
                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                            C10001b c10001b2 = c10001b;
                            float fFloatValue = f30.floatValue();
                            C5207g.m11111f(c10001b2, "$this$set");
                            c10001b2.f50829m = fFloatValue;
                            c10001b2.f50833q = true;
                            c10001b2.m18593c();
                            return C9072e.f47360a;
                        }
                    });
                    C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f20), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$6
                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                            C10001b c10001b2 = c10001b;
                            float fFloatValue = f30.floatValue();
                            C5207g.m11111f(c10001b2, "$this$set");
                            c10001b2.f50830n = fFloatValue;
                            c10001b2.f50833q = true;
                            c10001b2.m18593c();
                            return C9072e.f47360a;
                        }
                    });
                    C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f21), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$7
                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                            C10001b c10001b2 = c10001b;
                            float fFloatValue = f30.floatValue();
                            C5207g.m11111f(c10001b2, "$this$set");
                            c10001b2.f50831o = fFloatValue;
                            c10001b2.f50833q = true;
                            c10001b2.m18593c();
                            return C9072e.f47360a;
                        }
                    });
                    C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f22), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$8
                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                            C10001b c10001b2 = c10001b;
                            float fFloatValue = f30.floatValue();
                            C5207g.m11111f(c10001b2, "$this$set");
                            c10001b2.f50832p = fFloatValue;
                            c10001b2.f50833q = true;
                            c10001b2.m18593c();
                            return C9072e.f47360a;
                        }
                    });
                    C8573r0.m16714a1(composerImplMo1636j, list2, new InterfaceC2056p<C10001b, List<? extends AbstractC10003d>, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$9
                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(C10001b c10001b, List<? extends AbstractC10003d> list4) {
                            C10001b c10001b2 = c10001b;
                            List<? extends AbstractC10003d> list5 = list4;
                            C5207g.m11111f(c10001b2, "$this$set");
                            C5207g.m11111f(list5, "it");
                            c10001b2.f50820d = list5;
                            c10001b2.f50821e = true;
                            c10001b2.m18593c();
                            return C9072e.f47360a;
                        }
                    });
                    interfaceC2056p.mo1337m0(composerImplMo1636j, Integer.valueOf((i12 >> 27) & 14));
                    composerImplMo1636j.m1609Q(true);
                    composerImplMo1636j.m1609Q(false);
                    f23 = f19;
                    f24 = f22;
                    f25 = f20;
                    f26 = f21;
                    f27 = f17;
                    list3 = list2;
                    f28 = f18;
                    f29 = f16;
                } else {
                    composerImplMo1636j.m1654s0();
                    if ((i10 & 1) != 0) {
                        if (i27 != 0) {
                            str2 = "";
                        } else {
                            str2 = str;
                        }
                        if (i28 != 0) {
                            f18 = 0.0f;
                        } else {
                            f18 = f3;
                        }
                        if (i13 != 0) {
                            f19 = 0.0f;
                        } else {
                            f19 = f10;
                        }
                        if (i15 != 0) {
                            f16 = 0.0f;
                        }
                        if (i17 != 0) {
                            f17 = 1.0f;
                        }
                        if (i19 == 0) {
                        }
                        if (i21 != 0) {
                            f21 = 0.0f;
                        } else {
                            f21 = f14;
                        }
                        if (i23 == 0) {
                        }
                        if (i25 != 0) {
                            list2 = C10009j.f50944a;
                            i12 &= -234881025;
                        } else {
                            list2 = list;
                        }
                    } else {
                        if (i27 != 0) {
                            str2 = "";
                        } else {
                            str2 = str;
                        }
                        if (i28 != 0) {
                            f18 = 0.0f;
                        } else {
                            f18 = f3;
                        }
                        if (i13 != 0) {
                            f19 = 0.0f;
                        } else {
                            f19 = f10;
                        }
                        if (i15 != 0) {
                            f16 = 0.0f;
                        }
                        if (i17 != 0) {
                            f17 = 1.0f;
                        }
                        if (i19 == 0) {
                        }
                        if (i21 != 0) {
                            f21 = 0.0f;
                        } else {
                            f21 = f14;
                        }
                        if (i23 == 0) {
                        }
                        if (i25 != 0) {
                            list2 = C10009j.f50944a;
                            i12 &= -234881025;
                        } else {
                            list2 = list;
                        }
                    }
                    composerImplMo1636j.m1610R();
                    InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q11116 = ComposerKt.f3003a;
                    vectorComposeKt$Group$1 = new InterfaceC2041a<C10001b>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$1
                        @Override // cm.InterfaceC2041a
                        /* JADX INFO: renamed from: E */
                        public final C10001b mo807E() {
                            return new C10001b();
                        }
                    };
                    composerImplMo1636j.mo1622c(-548224868);
                    if (composerImplMo1636j.f2910a instanceof C10006g) {
                        C8573r0.m16771y0();
                        throw null;
                    }
                    composerImplMo1636j.m1658u0();
                    if (composerImplMo1636j.f2897L) {
                        composerImplMo1636j.mo1634i(vectorComposeKt$Group$1);
                    } else {
                        composerImplMo1636j.mo1653s();
                    }
                    C8573r0.m16714a1(composerImplMo1636j, str2, new InterfaceC2056p<C10001b, String, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$1
                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(C10001b c10001b, String str3) {
                            C10001b c10001b2 = c10001b;
                            String str4 = str3;
                            C5207g.m11111f(c10001b2, "$this$set");
                            C5207g.m11111f(str4, "it");
                            c10001b2.f50825i = str4;
                            c10001b2.m18593c();
                            return C9072e.f47360a;
                        }
                    });
                    C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f18), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$2
                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                            C10001b c10001b2 = c10001b;
                            float fFloatValue = f30.floatValue();
                            C5207g.m11111f(c10001b2, "$this$set");
                            c10001b2.f50826j = fFloatValue;
                            c10001b2.f50833q = true;
                            c10001b2.m18593c();
                            return C9072e.f47360a;
                        }
                    });
                    C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f19), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$3
                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                            C10001b c10001b2 = c10001b;
                            float fFloatValue = f30.floatValue();
                            C5207g.m11111f(c10001b2, "$this$set");
                            c10001b2.f50827k = fFloatValue;
                            c10001b2.f50833q = true;
                            c10001b2.m18593c();
                            return C9072e.f47360a;
                        }
                    });
                    C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f16), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$4
                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                            C10001b c10001b2 = c10001b;
                            float fFloatValue = f30.floatValue();
                            C5207g.m11111f(c10001b2, "$this$set");
                            c10001b2.f50828l = fFloatValue;
                            c10001b2.f50833q = true;
                            c10001b2.m18593c();
                            return C9072e.f47360a;
                        }
                    });
                    C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f17), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$5
                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                            C10001b c10001b2 = c10001b;
                            float fFloatValue = f30.floatValue();
                            C5207g.m11111f(c10001b2, "$this$set");
                            c10001b2.f50829m = fFloatValue;
                            c10001b2.f50833q = true;
                            c10001b2.m18593c();
                            return C9072e.f47360a;
                        }
                    });
                    C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f20), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$6
                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                            C10001b c10001b2 = c10001b;
                            float fFloatValue = f30.floatValue();
                            C5207g.m11111f(c10001b2, "$this$set");
                            c10001b2.f50830n = fFloatValue;
                            c10001b2.f50833q = true;
                            c10001b2.m18593c();
                            return C9072e.f47360a;
                        }
                    });
                    C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f21), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$7
                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                            C10001b c10001b2 = c10001b;
                            float fFloatValue = f30.floatValue();
                            C5207g.m11111f(c10001b2, "$this$set");
                            c10001b2.f50831o = fFloatValue;
                            c10001b2.f50833q = true;
                            c10001b2.m18593c();
                            return C9072e.f47360a;
                        }
                    });
                    C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f22), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$8
                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                            C10001b c10001b2 = c10001b;
                            float fFloatValue = f30.floatValue();
                            C5207g.m11111f(c10001b2, "$this$set");
                            c10001b2.f50832p = fFloatValue;
                            c10001b2.f50833q = true;
                            c10001b2.m18593c();
                            return C9072e.f47360a;
                        }
                    });
                    C8573r0.m16714a1(composerImplMo1636j, list2, new InterfaceC2056p<C10001b, List<? extends AbstractC10003d>, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$9
                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(C10001b c10001b, List<? extends AbstractC10003d> list4) {
                            C10001b c10001b2 = c10001b;
                            List<? extends AbstractC10003d> list5 = list4;
                            C5207g.m11111f(c10001b2, "$this$set");
                            C5207g.m11111f(list5, "it");
                            c10001b2.f50820d = list5;
                            c10001b2.f50821e = true;
                            c10001b2.m18593c();
                            return C9072e.f47360a;
                        }
                    });
                    interfaceC2056p.mo1337m0(composerImplMo1636j, Integer.valueOf((i12 >> 27) & 14));
                    composerImplMo1636j.m1609Q(true);
                    composerImplMo1636j.m1609Q(false);
                    f23 = f19;
                    f24 = f22;
                    f25 = f20;
                    f26 = f21;
                    f27 = f17;
                    list3 = list2;
                    f28 = f18;
                    f29 = f16;
                }
                c5332q0M1612T = composerImplMo1636j.m1612T();
                if (c5332q0M1612T == null) {
                    return;
                }
                c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // cm.InterfaceC2056p
                    /* JADX INFO: renamed from: m0 */
                    public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                        num.intValue();
                        VectorComposeKt.m2005a(str2, f28, f23, f29, f27, f25, f26, f24, list3, interfaceC2056p, interfaceC0476a2, C8573r0.m16737l1(i10 | 1), i11);
                        return C9072e.f47360a;
                    }
                };
            }
            i26 = 805306368;
            i12 |= i26;
            if (i25 != 256) {
                composerImplMo1636j.m1654s0();
                if ((i10 & 1) != 0) {
                    if (i27 != 0) {
                        str2 = "";
                    } else {
                        str2 = str;
                    }
                    if (i28 != 0) {
                        f18 = 0.0f;
                    } else {
                        f18 = f3;
                    }
                    if (i13 != 0) {
                        f19 = 0.0f;
                    } else {
                        f19 = f10;
                    }
                    if (i15 != 0) {
                        f16 = 0.0f;
                    }
                    if (i17 != 0) {
                        f17 = 1.0f;
                    }
                    if (i19 == 0) {
                    }
                    if (i21 != 0) {
                        f21 = 0.0f;
                    } else {
                        f21 = f14;
                    }
                    if (i23 == 0) {
                    }
                    if (i25 != 0) {
                        list2 = C10009j.f50944a;
                        i12 &= -234881025;
                    } else {
                        list2 = list;
                    }
                } else {
                    if (i27 != 0) {
                        str2 = "";
                    } else {
                        str2 = str;
                    }
                    if (i28 != 0) {
                        f18 = 0.0f;
                    } else {
                        f18 = f3;
                    }
                    if (i13 != 0) {
                        f19 = 0.0f;
                    } else {
                        f19 = f10;
                    }
                    if (i15 != 0) {
                        f16 = 0.0f;
                    }
                    if (i17 != 0) {
                        f17 = 1.0f;
                    }
                    if (i19 == 0) {
                    }
                    if (i21 != 0) {
                        f21 = 0.0f;
                    } else {
                        f21 = f14;
                    }
                    if (i23 == 0) {
                    }
                    if (i25 != 0) {
                        list2 = C10009j.f50944a;
                        i12 &= -234881025;
                    } else {
                        list2 = list;
                    }
                }
                composerImplMo1636j.m1610R();
                InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q11117 = ComposerKt.f3003a;
                vectorComposeKt$Group$1 = new InterfaceC2041a<C10001b>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$1
                    @Override // cm.InterfaceC2041a
                    /* JADX INFO: renamed from: E */
                    public final C10001b mo807E() {
                        return new C10001b();
                    }
                };
                composerImplMo1636j.mo1622c(-548224868);
                if (composerImplMo1636j.f2910a instanceof C10006g) {
                    C8573r0.m16771y0();
                    throw null;
                }
                composerImplMo1636j.m1658u0();
                if (composerImplMo1636j.f2897L) {
                    composerImplMo1636j.mo1634i(vectorComposeKt$Group$1);
                } else {
                    composerImplMo1636j.mo1653s();
                }
                C8573r0.m16714a1(composerImplMo1636j, str2, new InterfaceC2056p<C10001b, String, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$1
                    @Override // cm.InterfaceC2056p
                    /* JADX INFO: renamed from: m0 */
                    public final C9072e mo1337m0(C10001b c10001b, String str3) {
                        C10001b c10001b2 = c10001b;
                        String str4 = str3;
                        C5207g.m11111f(c10001b2, "$this$set");
                        C5207g.m11111f(str4, "it");
                        c10001b2.f50825i = str4;
                        c10001b2.m18593c();
                        return C9072e.f47360a;
                    }
                });
                C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f18), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$2
                    @Override // cm.InterfaceC2056p
                    /* JADX INFO: renamed from: m0 */
                    public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                        C10001b c10001b2 = c10001b;
                        float fFloatValue = f30.floatValue();
                        C5207g.m11111f(c10001b2, "$this$set");
                        c10001b2.f50826j = fFloatValue;
                        c10001b2.f50833q = true;
                        c10001b2.m18593c();
                        return C9072e.f47360a;
                    }
                });
                C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f19), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$3
                    @Override // cm.InterfaceC2056p
                    /* JADX INFO: renamed from: m0 */
                    public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                        C10001b c10001b2 = c10001b;
                        float fFloatValue = f30.floatValue();
                        C5207g.m11111f(c10001b2, "$this$set");
                        c10001b2.f50827k = fFloatValue;
                        c10001b2.f50833q = true;
                        c10001b2.m18593c();
                        return C9072e.f47360a;
                    }
                });
                C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f16), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$4
                    @Override // cm.InterfaceC2056p
                    /* JADX INFO: renamed from: m0 */
                    public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                        C10001b c10001b2 = c10001b;
                        float fFloatValue = f30.floatValue();
                        C5207g.m11111f(c10001b2, "$this$set");
                        c10001b2.f50828l = fFloatValue;
                        c10001b2.f50833q = true;
                        c10001b2.m18593c();
                        return C9072e.f47360a;
                    }
                });
                C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f17), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$5
                    @Override // cm.InterfaceC2056p
                    /* JADX INFO: renamed from: m0 */
                    public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                        C10001b c10001b2 = c10001b;
                        float fFloatValue = f30.floatValue();
                        C5207g.m11111f(c10001b2, "$this$set");
                        c10001b2.f50829m = fFloatValue;
                        c10001b2.f50833q = true;
                        c10001b2.m18593c();
                        return C9072e.f47360a;
                    }
                });
                C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f20), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$6
                    @Override // cm.InterfaceC2056p
                    /* JADX INFO: renamed from: m0 */
                    public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                        C10001b c10001b2 = c10001b;
                        float fFloatValue = f30.floatValue();
                        C5207g.m11111f(c10001b2, "$this$set");
                        c10001b2.f50830n = fFloatValue;
                        c10001b2.f50833q = true;
                        c10001b2.m18593c();
                        return C9072e.f47360a;
                    }
                });
                C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f21), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$7
                    @Override // cm.InterfaceC2056p
                    /* JADX INFO: renamed from: m0 */
                    public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                        C10001b c10001b2 = c10001b;
                        float fFloatValue = f30.floatValue();
                        C5207g.m11111f(c10001b2, "$this$set");
                        c10001b2.f50831o = fFloatValue;
                        c10001b2.f50833q = true;
                        c10001b2.m18593c();
                        return C9072e.f47360a;
                    }
                });
                C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f22), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$8
                    @Override // cm.InterfaceC2056p
                    /* JADX INFO: renamed from: m0 */
                    public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                        C10001b c10001b2 = c10001b;
                        float fFloatValue = f30.floatValue();
                        C5207g.m11111f(c10001b2, "$this$set");
                        c10001b2.f50832p = fFloatValue;
                        c10001b2.f50833q = true;
                        c10001b2.m18593c();
                        return C9072e.f47360a;
                    }
                });
                C8573r0.m16714a1(composerImplMo1636j, list2, new InterfaceC2056p<C10001b, List<? extends AbstractC10003d>, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$9
                    @Override // cm.InterfaceC2056p
                    /* JADX INFO: renamed from: m0 */
                    public final C9072e mo1337m0(C10001b c10001b, List<? extends AbstractC10003d> list4) {
                        C10001b c10001b2 = c10001b;
                        List<? extends AbstractC10003d> list5 = list4;
                        C5207g.m11111f(c10001b2, "$this$set");
                        C5207g.m11111f(list5, "it");
                        c10001b2.f50820d = list5;
                        c10001b2.f50821e = true;
                        c10001b2.m18593c();
                        return C9072e.f47360a;
                    }
                });
                interfaceC2056p.mo1337m0(composerImplMo1636j, Integer.valueOf((i12 >> 27) & 14));
                composerImplMo1636j.m1609Q(true);
                composerImplMo1636j.m1609Q(false);
                f23 = f19;
                f24 = f22;
                f25 = f20;
                f26 = f21;
                f27 = f17;
                list3 = list2;
                f28 = f18;
                f29 = f16;
            } else {
                composerImplMo1636j.m1654s0();
                if ((i10 & 1) != 0) {
                    if (i27 != 0) {
                        str2 = "";
                    } else {
                        str2 = str;
                    }
                    if (i28 != 0) {
                        f18 = 0.0f;
                    } else {
                        f18 = f3;
                    }
                    if (i13 != 0) {
                        f19 = 0.0f;
                    } else {
                        f19 = f10;
                    }
                    if (i15 != 0) {
                        f16 = 0.0f;
                    }
                    if (i17 != 0) {
                        f17 = 1.0f;
                    }
                    if (i19 == 0) {
                    }
                    if (i21 != 0) {
                        f21 = 0.0f;
                    } else {
                        f21 = f14;
                    }
                    if (i23 == 0) {
                    }
                    if (i25 != 0) {
                        list2 = C10009j.f50944a;
                        i12 &= -234881025;
                    } else {
                        list2 = list;
                    }
                } else {
                    if (i27 != 0) {
                        str2 = "";
                    } else {
                        str2 = str;
                    }
                    if (i28 != 0) {
                        f18 = 0.0f;
                    } else {
                        f18 = f3;
                    }
                    if (i13 != 0) {
                        f19 = 0.0f;
                    } else {
                        f19 = f10;
                    }
                    if (i15 != 0) {
                        f16 = 0.0f;
                    }
                    if (i17 != 0) {
                        f17 = 1.0f;
                    }
                    if (i19 == 0) {
                    }
                    if (i21 != 0) {
                        f21 = 0.0f;
                    } else {
                        f21 = f14;
                    }
                    if (i23 == 0) {
                    }
                    if (i25 != 0) {
                        list2 = C10009j.f50944a;
                        i12 &= -234881025;
                    } else {
                        list2 = list;
                    }
                }
                composerImplMo1636j.m1610R();
                InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q11118 = ComposerKt.f3003a;
                vectorComposeKt$Group$1 = new InterfaceC2041a<C10001b>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$1
                    @Override // cm.InterfaceC2041a
                    /* JADX INFO: renamed from: E */
                    public final C10001b mo807E() {
                        return new C10001b();
                    }
                };
                composerImplMo1636j.mo1622c(-548224868);
                if (composerImplMo1636j.f2910a instanceof C10006g) {
                    C8573r0.m16771y0();
                    throw null;
                }
                composerImplMo1636j.m1658u0();
                if (composerImplMo1636j.f2897L) {
                    composerImplMo1636j.mo1634i(vectorComposeKt$Group$1);
                } else {
                    composerImplMo1636j.mo1653s();
                }
                C8573r0.m16714a1(composerImplMo1636j, str2, new InterfaceC2056p<C10001b, String, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$1
                    @Override // cm.InterfaceC2056p
                    /* JADX INFO: renamed from: m0 */
                    public final C9072e mo1337m0(C10001b c10001b, String str3) {
                        C10001b c10001b2 = c10001b;
                        String str4 = str3;
                        C5207g.m11111f(c10001b2, "$this$set");
                        C5207g.m11111f(str4, "it");
                        c10001b2.f50825i = str4;
                        c10001b2.m18593c();
                        return C9072e.f47360a;
                    }
                });
                C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f18), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$2
                    @Override // cm.InterfaceC2056p
                    /* JADX INFO: renamed from: m0 */
                    public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                        C10001b c10001b2 = c10001b;
                        float fFloatValue = f30.floatValue();
                        C5207g.m11111f(c10001b2, "$this$set");
                        c10001b2.f50826j = fFloatValue;
                        c10001b2.f50833q = true;
                        c10001b2.m18593c();
                        return C9072e.f47360a;
                    }
                });
                C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f19), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$3
                    @Override // cm.InterfaceC2056p
                    /* JADX INFO: renamed from: m0 */
                    public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                        C10001b c10001b2 = c10001b;
                        float fFloatValue = f30.floatValue();
                        C5207g.m11111f(c10001b2, "$this$set");
                        c10001b2.f50827k = fFloatValue;
                        c10001b2.f50833q = true;
                        c10001b2.m18593c();
                        return C9072e.f47360a;
                    }
                });
                C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f16), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$4
                    @Override // cm.InterfaceC2056p
                    /* JADX INFO: renamed from: m0 */
                    public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                        C10001b c10001b2 = c10001b;
                        float fFloatValue = f30.floatValue();
                        C5207g.m11111f(c10001b2, "$this$set");
                        c10001b2.f50828l = fFloatValue;
                        c10001b2.f50833q = true;
                        c10001b2.m18593c();
                        return C9072e.f47360a;
                    }
                });
                C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f17), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$5
                    @Override // cm.InterfaceC2056p
                    /* JADX INFO: renamed from: m0 */
                    public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                        C10001b c10001b2 = c10001b;
                        float fFloatValue = f30.floatValue();
                        C5207g.m11111f(c10001b2, "$this$set");
                        c10001b2.f50829m = fFloatValue;
                        c10001b2.f50833q = true;
                        c10001b2.m18593c();
                        return C9072e.f47360a;
                    }
                });
                C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f20), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$6
                    @Override // cm.InterfaceC2056p
                    /* JADX INFO: renamed from: m0 */
                    public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                        C10001b c10001b2 = c10001b;
                        float fFloatValue = f30.floatValue();
                        C5207g.m11111f(c10001b2, "$this$set");
                        c10001b2.f50830n = fFloatValue;
                        c10001b2.f50833q = true;
                        c10001b2.m18593c();
                        return C9072e.f47360a;
                    }
                });
                C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f21), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$7
                    @Override // cm.InterfaceC2056p
                    /* JADX INFO: renamed from: m0 */
                    public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                        C10001b c10001b2 = c10001b;
                        float fFloatValue = f30.floatValue();
                        C5207g.m11111f(c10001b2, "$this$set");
                        c10001b2.f50831o = fFloatValue;
                        c10001b2.f50833q = true;
                        c10001b2.m18593c();
                        return C9072e.f47360a;
                    }
                });
                C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f22), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$8
                    @Override // cm.InterfaceC2056p
                    /* JADX INFO: renamed from: m0 */
                    public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                        C10001b c10001b2 = c10001b;
                        float fFloatValue = f30.floatValue();
                        C5207g.m11111f(c10001b2, "$this$set");
                        c10001b2.f50832p = fFloatValue;
                        c10001b2.f50833q = true;
                        c10001b2.m18593c();
                        return C9072e.f47360a;
                    }
                });
                C8573r0.m16714a1(composerImplMo1636j, list2, new InterfaceC2056p<C10001b, List<? extends AbstractC10003d>, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$9
                    @Override // cm.InterfaceC2056p
                    /* JADX INFO: renamed from: m0 */
                    public final C9072e mo1337m0(C10001b c10001b, List<? extends AbstractC10003d> list4) {
                        C10001b c10001b2 = c10001b;
                        List<? extends AbstractC10003d> list5 = list4;
                        C5207g.m11111f(c10001b2, "$this$set");
                        C5207g.m11111f(list5, "it");
                        c10001b2.f50820d = list5;
                        c10001b2.f50821e = true;
                        c10001b2.m18593c();
                        return C9072e.f47360a;
                    }
                });
                interfaceC2056p.mo1337m0(composerImplMo1636j, Integer.valueOf((i12 >> 27) & 14));
                composerImplMo1636j.m1609Q(true);
                composerImplMo1636j.m1609Q(false);
                f23 = f19;
                f24 = f22;
                f25 = f20;
                f26 = f21;
                f27 = f17;
                list3 = list2;
                f28 = f18;
                f29 = f16;
            }
            c5332q0M1612T = composerImplMo1636j.m1612T();
            if (c5332q0M1612T == null) {
                return;
            }
            c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // cm.InterfaceC2056p
                /* JADX INFO: renamed from: m0 */
                public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                    num.intValue();
                    VectorComposeKt.m2005a(str2, f28, f23, f29, f27, f25, f26, f24, list3, interfaceC2056p, interfaceC0476a2, C8573r0.m16737l1(i10 | 1), i11);
                    return C9072e.f47360a;
                }
            };
        }
        i12 |= 384;
        i15 = i11 & 8;
        if (i15 != 0) {
            if ((i10 & 7168) == 0) {
                f16 = f11;
                if (composerImplMo1636j.m1592D(f16)) {
                    i16 = 2048;
                } else {
                    i16 = 1024;
                }
                i12 |= i16;
            }
            i17 = i11 & 16;
            if (i17 != 0) {
                if ((57344 & i10) == 0) {
                    f17 = f12;
                    if (composerImplMo1636j.m1592D(f17)) {
                        i18 = 16384;
                    } else {
                        i18 = 8192;
                    }
                    i12 |= i18;
                }
                i19 = i11 & 32;
                if (i19 != 0) {
                    i12 |= 196608;
                } else if ((i10 & 458752) == 0) {
                    if (composerImplMo1636j.m1592D(f13)) {
                        i20 = 131072;
                    } else {
                        i20 = 65536;
                    }
                    i12 |= i20;
                }
                i21 = i11 & 64;
                if (i21 != 0) {
                    i12 |= 1572864;
                } else if ((i10 & 3670016) == 0) {
                    if (composerImplMo1636j.m1592D(f14)) {
                        i22 = 1048576;
                    } else {
                        i22 = 524288;
                    }
                    i12 |= i22;
                }
                i23 = i11 & BuildConfig.SDK_TRUNCATE_LENGTH;
                if (i23 != 0) {
                    i12 |= 12582912;
                } else if ((i10 & 29360128) == 0) {
                    if (composerImplMo1636j.m1592D(f15)) {
                        i24 = 8388608;
                    } else {
                        i24 = 4194304;
                    }
                    i12 |= i24;
                }
                i25 = i11 & 256;
                if (i25 != 0) {
                    i12 |= 33554432;
                }
                if ((i11 & 512) != 0) {
                    if ((1879048192 & i10) == 0) {
                        if (composerImplMo1636j.m1600H(interfaceC2056p)) {
                            i26 = 536870912;
                        } else {
                            i26 = 268435456;
                        }
                    }
                    if (i25 != 256) {
                        composerImplMo1636j.m1654s0();
                        if ((i10 & 1) != 0) {
                            if (i27 != 0) {
                                str2 = "";
                            } else {
                                str2 = str;
                            }
                            if (i28 != 0) {
                                f18 = 0.0f;
                            } else {
                                f18 = f3;
                            }
                            if (i13 != 0) {
                                f19 = 0.0f;
                            } else {
                                f19 = f10;
                            }
                            if (i15 != 0) {
                                f16 = 0.0f;
                            }
                            if (i17 != 0) {
                                f17 = 1.0f;
                            }
                            if (i19 == 0) {
                            }
                            if (i21 != 0) {
                                f21 = 0.0f;
                            } else {
                                f21 = f14;
                            }
                            if (i23 == 0) {
                            }
                            if (i25 != 0) {
                                list2 = C10009j.f50944a;
                                i12 &= -234881025;
                            } else {
                                list2 = list;
                            }
                        } else {
                            if (i27 != 0) {
                                str2 = "";
                            } else {
                                str2 = str;
                            }
                            if (i28 != 0) {
                                f18 = 0.0f;
                            } else {
                                f18 = f3;
                            }
                            if (i13 != 0) {
                                f19 = 0.0f;
                            } else {
                                f19 = f10;
                            }
                            if (i15 != 0) {
                                f16 = 0.0f;
                            }
                            if (i17 != 0) {
                                f17 = 1.0f;
                            }
                            if (i19 == 0) {
                            }
                            if (i21 != 0) {
                                f21 = 0.0f;
                            } else {
                                f21 = f14;
                            }
                            if (i23 == 0) {
                            }
                            if (i25 != 0) {
                                list2 = C10009j.f50944a;
                                i12 &= -234881025;
                            } else {
                                list2 = list;
                            }
                        }
                        composerImplMo1636j.m1610R();
                        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q11119 = ComposerKt.f3003a;
                        vectorComposeKt$Group$1 = new InterfaceC2041a<C10001b>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$1
                            @Override // cm.InterfaceC2041a
                            /* JADX INFO: renamed from: E */
                            public final C10001b mo807E() {
                                return new C10001b();
                            }
                        };
                        composerImplMo1636j.mo1622c(-548224868);
                        if (composerImplMo1636j.f2910a instanceof C10006g) {
                            C8573r0.m16771y0();
                            throw null;
                        }
                        composerImplMo1636j.m1658u0();
                        if (composerImplMo1636j.f2897L) {
                            composerImplMo1636j.mo1634i(vectorComposeKt$Group$1);
                        } else {
                            composerImplMo1636j.mo1653s();
                        }
                        C8573r0.m16714a1(composerImplMo1636j, str2, new InterfaceC2056p<C10001b, String, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$1
                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(C10001b c10001b, String str3) {
                                C10001b c10001b2 = c10001b;
                                String str4 = str3;
                                C5207g.m11111f(c10001b2, "$this$set");
                                C5207g.m11111f(str4, "it");
                                c10001b2.f50825i = str4;
                                c10001b2.m18593c();
                                return C9072e.f47360a;
                            }
                        });
                        C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f18), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$2
                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                                C10001b c10001b2 = c10001b;
                                float fFloatValue = f30.floatValue();
                                C5207g.m11111f(c10001b2, "$this$set");
                                c10001b2.f50826j = fFloatValue;
                                c10001b2.f50833q = true;
                                c10001b2.m18593c();
                                return C9072e.f47360a;
                            }
                        });
                        C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f19), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$3
                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                                C10001b c10001b2 = c10001b;
                                float fFloatValue = f30.floatValue();
                                C5207g.m11111f(c10001b2, "$this$set");
                                c10001b2.f50827k = fFloatValue;
                                c10001b2.f50833q = true;
                                c10001b2.m18593c();
                                return C9072e.f47360a;
                            }
                        });
                        C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f16), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$4
                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                                C10001b c10001b2 = c10001b;
                                float fFloatValue = f30.floatValue();
                                C5207g.m11111f(c10001b2, "$this$set");
                                c10001b2.f50828l = fFloatValue;
                                c10001b2.f50833q = true;
                                c10001b2.m18593c();
                                return C9072e.f47360a;
                            }
                        });
                        C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f17), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$5
                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                                C10001b c10001b2 = c10001b;
                                float fFloatValue = f30.floatValue();
                                C5207g.m11111f(c10001b2, "$this$set");
                                c10001b2.f50829m = fFloatValue;
                                c10001b2.f50833q = true;
                                c10001b2.m18593c();
                                return C9072e.f47360a;
                            }
                        });
                        C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f20), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$6
                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                                C10001b c10001b2 = c10001b;
                                float fFloatValue = f30.floatValue();
                                C5207g.m11111f(c10001b2, "$this$set");
                                c10001b2.f50830n = fFloatValue;
                                c10001b2.f50833q = true;
                                c10001b2.m18593c();
                                return C9072e.f47360a;
                            }
                        });
                        C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f21), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$7
                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                                C10001b c10001b2 = c10001b;
                                float fFloatValue = f30.floatValue();
                                C5207g.m11111f(c10001b2, "$this$set");
                                c10001b2.f50831o = fFloatValue;
                                c10001b2.f50833q = true;
                                c10001b2.m18593c();
                                return C9072e.f47360a;
                            }
                        });
                        C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f22), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$8
                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                                C10001b c10001b2 = c10001b;
                                float fFloatValue = f30.floatValue();
                                C5207g.m11111f(c10001b2, "$this$set");
                                c10001b2.f50832p = fFloatValue;
                                c10001b2.f50833q = true;
                                c10001b2.m18593c();
                                return C9072e.f47360a;
                            }
                        });
                        C8573r0.m16714a1(composerImplMo1636j, list2, new InterfaceC2056p<C10001b, List<? extends AbstractC10003d>, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$9
                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(C10001b c10001b, List<? extends AbstractC10003d> list4) {
                                C10001b c10001b2 = c10001b;
                                List<? extends AbstractC10003d> list5 = list4;
                                C5207g.m11111f(c10001b2, "$this$set");
                                C5207g.m11111f(list5, "it");
                                c10001b2.f50820d = list5;
                                c10001b2.f50821e = true;
                                c10001b2.m18593c();
                                return C9072e.f47360a;
                            }
                        });
                        interfaceC2056p.mo1337m0(composerImplMo1636j, Integer.valueOf((i12 >> 27) & 14));
                        composerImplMo1636j.m1609Q(true);
                        composerImplMo1636j.m1609Q(false);
                        f23 = f19;
                        f24 = f22;
                        f25 = f20;
                        f26 = f21;
                        f27 = f17;
                        list3 = list2;
                        f28 = f18;
                        f29 = f16;
                    } else {
                        composerImplMo1636j.m1654s0();
                        if ((i10 & 1) != 0) {
                            if (i27 != 0) {
                                str2 = "";
                            } else {
                                str2 = str;
                            }
                            if (i28 != 0) {
                                f18 = 0.0f;
                            } else {
                                f18 = f3;
                            }
                            if (i13 != 0) {
                                f19 = 0.0f;
                            } else {
                                f19 = f10;
                            }
                            if (i15 != 0) {
                                f16 = 0.0f;
                            }
                            if (i17 != 0) {
                                f17 = 1.0f;
                            }
                            if (i19 == 0) {
                            }
                            if (i21 != 0) {
                                f21 = 0.0f;
                            } else {
                                f21 = f14;
                            }
                            if (i23 == 0) {
                            }
                            if (i25 != 0) {
                                list2 = C10009j.f50944a;
                                i12 &= -234881025;
                            } else {
                                list2 = list;
                            }
                        } else {
                            if (i27 != 0) {
                                str2 = "";
                            } else {
                                str2 = str;
                            }
                            if (i28 != 0) {
                                f18 = 0.0f;
                            } else {
                                f18 = f3;
                            }
                            if (i13 != 0) {
                                f19 = 0.0f;
                            } else {
                                f19 = f10;
                            }
                            if (i15 != 0) {
                                f16 = 0.0f;
                            }
                            if (i17 != 0) {
                                f17 = 1.0f;
                            }
                            if (i19 == 0) {
                            }
                            if (i21 != 0) {
                                f21 = 0.0f;
                            } else {
                                f21 = f14;
                            }
                            if (i23 == 0) {
                            }
                            if (i25 != 0) {
                                list2 = C10009j.f50944a;
                                i12 &= -234881025;
                            } else {
                                list2 = list;
                            }
                        }
                        composerImplMo1636j.m1610R();
                        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q111110 = ComposerKt.f3003a;
                        vectorComposeKt$Group$1 = new InterfaceC2041a<C10001b>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$1
                            @Override // cm.InterfaceC2041a
                            /* JADX INFO: renamed from: E */
                            public final C10001b mo807E() {
                                return new C10001b();
                            }
                        };
                        composerImplMo1636j.mo1622c(-548224868);
                        if (composerImplMo1636j.f2910a instanceof C10006g) {
                            C8573r0.m16771y0();
                            throw null;
                        }
                        composerImplMo1636j.m1658u0();
                        if (composerImplMo1636j.f2897L) {
                            composerImplMo1636j.mo1634i(vectorComposeKt$Group$1);
                        } else {
                            composerImplMo1636j.mo1653s();
                        }
                        C8573r0.m16714a1(composerImplMo1636j, str2, new InterfaceC2056p<C10001b, String, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$1
                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(C10001b c10001b, String str3) {
                                C10001b c10001b2 = c10001b;
                                String str4 = str3;
                                C5207g.m11111f(c10001b2, "$this$set");
                                C5207g.m11111f(str4, "it");
                                c10001b2.f50825i = str4;
                                c10001b2.m18593c();
                                return C9072e.f47360a;
                            }
                        });
                        C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f18), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$2
                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                                C10001b c10001b2 = c10001b;
                                float fFloatValue = f30.floatValue();
                                C5207g.m11111f(c10001b2, "$this$set");
                                c10001b2.f50826j = fFloatValue;
                                c10001b2.f50833q = true;
                                c10001b2.m18593c();
                                return C9072e.f47360a;
                            }
                        });
                        C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f19), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$3
                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                                C10001b c10001b2 = c10001b;
                                float fFloatValue = f30.floatValue();
                                C5207g.m11111f(c10001b2, "$this$set");
                                c10001b2.f50827k = fFloatValue;
                                c10001b2.f50833q = true;
                                c10001b2.m18593c();
                                return C9072e.f47360a;
                            }
                        });
                        C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f16), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$4
                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                                C10001b c10001b2 = c10001b;
                                float fFloatValue = f30.floatValue();
                                C5207g.m11111f(c10001b2, "$this$set");
                                c10001b2.f50828l = fFloatValue;
                                c10001b2.f50833q = true;
                                c10001b2.m18593c();
                                return C9072e.f47360a;
                            }
                        });
                        C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f17), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$5
                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                                C10001b c10001b2 = c10001b;
                                float fFloatValue = f30.floatValue();
                                C5207g.m11111f(c10001b2, "$this$set");
                                c10001b2.f50829m = fFloatValue;
                                c10001b2.f50833q = true;
                                c10001b2.m18593c();
                                return C9072e.f47360a;
                            }
                        });
                        C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f20), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$6
                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                                C10001b c10001b2 = c10001b;
                                float fFloatValue = f30.floatValue();
                                C5207g.m11111f(c10001b2, "$this$set");
                                c10001b2.f50830n = fFloatValue;
                                c10001b2.f50833q = true;
                                c10001b2.m18593c();
                                return C9072e.f47360a;
                            }
                        });
                        C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f21), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$7
                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                                C10001b c10001b2 = c10001b;
                                float fFloatValue = f30.floatValue();
                                C5207g.m11111f(c10001b2, "$this$set");
                                c10001b2.f50831o = fFloatValue;
                                c10001b2.f50833q = true;
                                c10001b2.m18593c();
                                return C9072e.f47360a;
                            }
                        });
                        C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f22), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$8
                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                                C10001b c10001b2 = c10001b;
                                float fFloatValue = f30.floatValue();
                                C5207g.m11111f(c10001b2, "$this$set");
                                c10001b2.f50832p = fFloatValue;
                                c10001b2.f50833q = true;
                                c10001b2.m18593c();
                                return C9072e.f47360a;
                            }
                        });
                        C8573r0.m16714a1(composerImplMo1636j, list2, new InterfaceC2056p<C10001b, List<? extends AbstractC10003d>, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$9
                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(C10001b c10001b, List<? extends AbstractC10003d> list4) {
                                C10001b c10001b2 = c10001b;
                                List<? extends AbstractC10003d> list5 = list4;
                                C5207g.m11111f(c10001b2, "$this$set");
                                C5207g.m11111f(list5, "it");
                                c10001b2.f50820d = list5;
                                c10001b2.f50821e = true;
                                c10001b2.m18593c();
                                return C9072e.f47360a;
                            }
                        });
                        interfaceC2056p.mo1337m0(composerImplMo1636j, Integer.valueOf((i12 >> 27) & 14));
                        composerImplMo1636j.m1609Q(true);
                        composerImplMo1636j.m1609Q(false);
                        f23 = f19;
                        f24 = f22;
                        f25 = f20;
                        f26 = f21;
                        f27 = f17;
                        list3 = list2;
                        f28 = f18;
                        f29 = f16;
                    }
                    c5332q0M1612T = composerImplMo1636j.m1612T();
                    if (c5332q0M1612T == null) {
                        return;
                    }
                    c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$4
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                            num.intValue();
                            VectorComposeKt.m2005a(str2, f28, f23, f29, f27, f25, f26, f24, list3, interfaceC2056p, interfaceC0476a2, C8573r0.m16737l1(i10 | 1), i11);
                            return C9072e.f47360a;
                        }
                    };
                }
                i26 = 805306368;
                i12 |= i26;
                if (i25 != 256) {
                    composerImplMo1636j.m1654s0();
                    if ((i10 & 1) != 0) {
                        if (i27 != 0) {
                            str2 = "";
                        } else {
                            str2 = str;
                        }
                        if (i28 != 0) {
                            f18 = 0.0f;
                        } else {
                            f18 = f3;
                        }
                        if (i13 != 0) {
                            f19 = 0.0f;
                        } else {
                            f19 = f10;
                        }
                        if (i15 != 0) {
                            f16 = 0.0f;
                        }
                        if (i17 != 0) {
                            f17 = 1.0f;
                        }
                        if (i19 == 0) {
                        }
                        if (i21 != 0) {
                            f21 = 0.0f;
                        } else {
                            f21 = f14;
                        }
                        if (i23 == 0) {
                        }
                        if (i25 != 0) {
                            list2 = C10009j.f50944a;
                            i12 &= -234881025;
                        } else {
                            list2 = list;
                        }
                    } else {
                        if (i27 != 0) {
                            str2 = "";
                        } else {
                            str2 = str;
                        }
                        if (i28 != 0) {
                            f18 = 0.0f;
                        } else {
                            f18 = f3;
                        }
                        if (i13 != 0) {
                            f19 = 0.0f;
                        } else {
                            f19 = f10;
                        }
                        if (i15 != 0) {
                            f16 = 0.0f;
                        }
                        if (i17 != 0) {
                            f17 = 1.0f;
                        }
                        if (i19 == 0) {
                        }
                        if (i21 != 0) {
                            f21 = 0.0f;
                        } else {
                            f21 = f14;
                        }
                        if (i23 == 0) {
                        }
                        if (i25 != 0) {
                            list2 = C10009j.f50944a;
                            i12 &= -234881025;
                        } else {
                            list2 = list;
                        }
                    }
                    composerImplMo1636j.m1610R();
                    InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q111111 = ComposerKt.f3003a;
                    vectorComposeKt$Group$1 = new InterfaceC2041a<C10001b>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$1
                        @Override // cm.InterfaceC2041a
                        /* JADX INFO: renamed from: E */
                        public final C10001b mo807E() {
                            return new C10001b();
                        }
                    };
                    composerImplMo1636j.mo1622c(-548224868);
                    if (composerImplMo1636j.f2910a instanceof C10006g) {
                        C8573r0.m16771y0();
                        throw null;
                    }
                    composerImplMo1636j.m1658u0();
                    if (composerImplMo1636j.f2897L) {
                        composerImplMo1636j.mo1634i(vectorComposeKt$Group$1);
                    } else {
                        composerImplMo1636j.mo1653s();
                    }
                    C8573r0.m16714a1(composerImplMo1636j, str2, new InterfaceC2056p<C10001b, String, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$1
                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(C10001b c10001b, String str3) {
                            C10001b c10001b2 = c10001b;
                            String str4 = str3;
                            C5207g.m11111f(c10001b2, "$this$set");
                            C5207g.m11111f(str4, "it");
                            c10001b2.f50825i = str4;
                            c10001b2.m18593c();
                            return C9072e.f47360a;
                        }
                    });
                    C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f18), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$2
                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                            C10001b c10001b2 = c10001b;
                            float fFloatValue = f30.floatValue();
                            C5207g.m11111f(c10001b2, "$this$set");
                            c10001b2.f50826j = fFloatValue;
                            c10001b2.f50833q = true;
                            c10001b2.m18593c();
                            return C9072e.f47360a;
                        }
                    });
                    C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f19), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$3
                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                            C10001b c10001b2 = c10001b;
                            float fFloatValue = f30.floatValue();
                            C5207g.m11111f(c10001b2, "$this$set");
                            c10001b2.f50827k = fFloatValue;
                            c10001b2.f50833q = true;
                            c10001b2.m18593c();
                            return C9072e.f47360a;
                        }
                    });
                    C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f16), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$4
                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                            C10001b c10001b2 = c10001b;
                            float fFloatValue = f30.floatValue();
                            C5207g.m11111f(c10001b2, "$this$set");
                            c10001b2.f50828l = fFloatValue;
                            c10001b2.f50833q = true;
                            c10001b2.m18593c();
                            return C9072e.f47360a;
                        }
                    });
                    C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f17), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$5
                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                            C10001b c10001b2 = c10001b;
                            float fFloatValue = f30.floatValue();
                            C5207g.m11111f(c10001b2, "$this$set");
                            c10001b2.f50829m = fFloatValue;
                            c10001b2.f50833q = true;
                            c10001b2.m18593c();
                            return C9072e.f47360a;
                        }
                    });
                    C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f20), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$6
                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                            C10001b c10001b2 = c10001b;
                            float fFloatValue = f30.floatValue();
                            C5207g.m11111f(c10001b2, "$this$set");
                            c10001b2.f50830n = fFloatValue;
                            c10001b2.f50833q = true;
                            c10001b2.m18593c();
                            return C9072e.f47360a;
                        }
                    });
                    C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f21), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$7
                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                            C10001b c10001b2 = c10001b;
                            float fFloatValue = f30.floatValue();
                            C5207g.m11111f(c10001b2, "$this$set");
                            c10001b2.f50831o = fFloatValue;
                            c10001b2.f50833q = true;
                            c10001b2.m18593c();
                            return C9072e.f47360a;
                        }
                    });
                    C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f22), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$8
                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                            C10001b c10001b2 = c10001b;
                            float fFloatValue = f30.floatValue();
                            C5207g.m11111f(c10001b2, "$this$set");
                            c10001b2.f50832p = fFloatValue;
                            c10001b2.f50833q = true;
                            c10001b2.m18593c();
                            return C9072e.f47360a;
                        }
                    });
                    C8573r0.m16714a1(composerImplMo1636j, list2, new InterfaceC2056p<C10001b, List<? extends AbstractC10003d>, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$9
                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(C10001b c10001b, List<? extends AbstractC10003d> list4) {
                            C10001b c10001b2 = c10001b;
                            List<? extends AbstractC10003d> list5 = list4;
                            C5207g.m11111f(c10001b2, "$this$set");
                            C5207g.m11111f(list5, "it");
                            c10001b2.f50820d = list5;
                            c10001b2.f50821e = true;
                            c10001b2.m18593c();
                            return C9072e.f47360a;
                        }
                    });
                    interfaceC2056p.mo1337m0(composerImplMo1636j, Integer.valueOf((i12 >> 27) & 14));
                    composerImplMo1636j.m1609Q(true);
                    composerImplMo1636j.m1609Q(false);
                    f23 = f19;
                    f24 = f22;
                    f25 = f20;
                    f26 = f21;
                    f27 = f17;
                    list3 = list2;
                    f28 = f18;
                    f29 = f16;
                } else {
                    composerImplMo1636j.m1654s0();
                    if ((i10 & 1) != 0) {
                        if (i27 != 0) {
                            str2 = "";
                        } else {
                            str2 = str;
                        }
                        if (i28 != 0) {
                            f18 = 0.0f;
                        } else {
                            f18 = f3;
                        }
                        if (i13 != 0) {
                            f19 = 0.0f;
                        } else {
                            f19 = f10;
                        }
                        if (i15 != 0) {
                            f16 = 0.0f;
                        }
                        if (i17 != 0) {
                            f17 = 1.0f;
                        }
                        if (i19 == 0) {
                        }
                        if (i21 != 0) {
                            f21 = 0.0f;
                        } else {
                            f21 = f14;
                        }
                        if (i23 == 0) {
                        }
                        if (i25 != 0) {
                            list2 = C10009j.f50944a;
                            i12 &= -234881025;
                        } else {
                            list2 = list;
                        }
                    } else {
                        if (i27 != 0) {
                            str2 = "";
                        } else {
                            str2 = str;
                        }
                        if (i28 != 0) {
                            f18 = 0.0f;
                        } else {
                            f18 = f3;
                        }
                        if (i13 != 0) {
                            f19 = 0.0f;
                        } else {
                            f19 = f10;
                        }
                        if (i15 != 0) {
                            f16 = 0.0f;
                        }
                        if (i17 != 0) {
                            f17 = 1.0f;
                        }
                        if (i19 == 0) {
                        }
                        if (i21 != 0) {
                            f21 = 0.0f;
                        } else {
                            f21 = f14;
                        }
                        if (i23 == 0) {
                        }
                        if (i25 != 0) {
                            list2 = C10009j.f50944a;
                            i12 &= -234881025;
                        } else {
                            list2 = list;
                        }
                    }
                    composerImplMo1636j.m1610R();
                    InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q111112 = ComposerKt.f3003a;
                    vectorComposeKt$Group$1 = new InterfaceC2041a<C10001b>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$1
                        @Override // cm.InterfaceC2041a
                        /* JADX INFO: renamed from: E */
                        public final C10001b mo807E() {
                            return new C10001b();
                        }
                    };
                    composerImplMo1636j.mo1622c(-548224868);
                    if (composerImplMo1636j.f2910a instanceof C10006g) {
                        C8573r0.m16771y0();
                        throw null;
                    }
                    composerImplMo1636j.m1658u0();
                    if (composerImplMo1636j.f2897L) {
                        composerImplMo1636j.mo1634i(vectorComposeKt$Group$1);
                    } else {
                        composerImplMo1636j.mo1653s();
                    }
                    C8573r0.m16714a1(composerImplMo1636j, str2, new InterfaceC2056p<C10001b, String, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$1
                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(C10001b c10001b, String str3) {
                            C10001b c10001b2 = c10001b;
                            String str4 = str3;
                            C5207g.m11111f(c10001b2, "$this$set");
                            C5207g.m11111f(str4, "it");
                            c10001b2.f50825i = str4;
                            c10001b2.m18593c();
                            return C9072e.f47360a;
                        }
                    });
                    C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f18), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$2
                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                            C10001b c10001b2 = c10001b;
                            float fFloatValue = f30.floatValue();
                            C5207g.m11111f(c10001b2, "$this$set");
                            c10001b2.f50826j = fFloatValue;
                            c10001b2.f50833q = true;
                            c10001b2.m18593c();
                            return C9072e.f47360a;
                        }
                    });
                    C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f19), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$3
                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                            C10001b c10001b2 = c10001b;
                            float fFloatValue = f30.floatValue();
                            C5207g.m11111f(c10001b2, "$this$set");
                            c10001b2.f50827k = fFloatValue;
                            c10001b2.f50833q = true;
                            c10001b2.m18593c();
                            return C9072e.f47360a;
                        }
                    });
                    C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f16), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$4
                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                            C10001b c10001b2 = c10001b;
                            float fFloatValue = f30.floatValue();
                            C5207g.m11111f(c10001b2, "$this$set");
                            c10001b2.f50828l = fFloatValue;
                            c10001b2.f50833q = true;
                            c10001b2.m18593c();
                            return C9072e.f47360a;
                        }
                    });
                    C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f17), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$5
                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                            C10001b c10001b2 = c10001b;
                            float fFloatValue = f30.floatValue();
                            C5207g.m11111f(c10001b2, "$this$set");
                            c10001b2.f50829m = fFloatValue;
                            c10001b2.f50833q = true;
                            c10001b2.m18593c();
                            return C9072e.f47360a;
                        }
                    });
                    C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f20), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$6
                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                            C10001b c10001b2 = c10001b;
                            float fFloatValue = f30.floatValue();
                            C5207g.m11111f(c10001b2, "$this$set");
                            c10001b2.f50830n = fFloatValue;
                            c10001b2.f50833q = true;
                            c10001b2.m18593c();
                            return C9072e.f47360a;
                        }
                    });
                    C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f21), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$7
                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                            C10001b c10001b2 = c10001b;
                            float fFloatValue = f30.floatValue();
                            C5207g.m11111f(c10001b2, "$this$set");
                            c10001b2.f50831o = fFloatValue;
                            c10001b2.f50833q = true;
                            c10001b2.m18593c();
                            return C9072e.f47360a;
                        }
                    });
                    C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f22), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$8
                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                            C10001b c10001b2 = c10001b;
                            float fFloatValue = f30.floatValue();
                            C5207g.m11111f(c10001b2, "$this$set");
                            c10001b2.f50832p = fFloatValue;
                            c10001b2.f50833q = true;
                            c10001b2.m18593c();
                            return C9072e.f47360a;
                        }
                    });
                    C8573r0.m16714a1(composerImplMo1636j, list2, new InterfaceC2056p<C10001b, List<? extends AbstractC10003d>, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$9
                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(C10001b c10001b, List<? extends AbstractC10003d> list4) {
                            C10001b c10001b2 = c10001b;
                            List<? extends AbstractC10003d> list5 = list4;
                            C5207g.m11111f(c10001b2, "$this$set");
                            C5207g.m11111f(list5, "it");
                            c10001b2.f50820d = list5;
                            c10001b2.f50821e = true;
                            c10001b2.m18593c();
                            return C9072e.f47360a;
                        }
                    });
                    interfaceC2056p.mo1337m0(composerImplMo1636j, Integer.valueOf((i12 >> 27) & 14));
                    composerImplMo1636j.m1609Q(true);
                    composerImplMo1636j.m1609Q(false);
                    f23 = f19;
                    f24 = f22;
                    f25 = f20;
                    f26 = f21;
                    f27 = f17;
                    list3 = list2;
                    f28 = f18;
                    f29 = f16;
                }
                c5332q0M1612T = composerImplMo1636j.m1612T();
                if (c5332q0M1612T == null) {
                    return;
                }
                c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // cm.InterfaceC2056p
                    /* JADX INFO: renamed from: m0 */
                    public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                        num.intValue();
                        VectorComposeKt.m2005a(str2, f28, f23, f29, f27, f25, f26, f24, list3, interfaceC2056p, interfaceC0476a2, C8573r0.m16737l1(i10 | 1), i11);
                        return C9072e.f47360a;
                    }
                };
            }
            i12 |= 24576;
            f17 = f12;
            i19 = i11 & 32;
            if (i19 != 0) {
                i12 |= 196608;
            } else if ((i10 & 458752) == 0) {
                if (composerImplMo1636j.m1592D(f13)) {
                    i20 = 131072;
                } else {
                    i20 = 65536;
                }
                i12 |= i20;
            }
            i21 = i11 & 64;
            if (i21 != 0) {
                i12 |= 1572864;
            } else if ((i10 & 3670016) == 0) {
                if (composerImplMo1636j.m1592D(f14)) {
                    i22 = 1048576;
                } else {
                    i22 = 524288;
                }
                i12 |= i22;
            }
            i23 = i11 & BuildConfig.SDK_TRUNCATE_LENGTH;
            if (i23 != 0) {
                i12 |= 12582912;
            } else if ((i10 & 29360128) == 0) {
                if (composerImplMo1636j.m1592D(f15)) {
                    i24 = 8388608;
                } else {
                    i24 = 4194304;
                }
                i12 |= i24;
            }
            i25 = i11 & 256;
            if (i25 != 0) {
                i12 |= 33554432;
            }
            if ((i11 & 512) != 0) {
                if ((1879048192 & i10) == 0) {
                    if (composerImplMo1636j.m1600H(interfaceC2056p)) {
                        i26 = 536870912;
                    } else {
                        i26 = 268435456;
                    }
                }
                if (i25 != 256) {
                    composerImplMo1636j.m1654s0();
                    if ((i10 & 1) != 0) {
                        if (i27 != 0) {
                            str2 = "";
                        } else {
                            str2 = str;
                        }
                        if (i28 != 0) {
                            f18 = 0.0f;
                        } else {
                            f18 = f3;
                        }
                        if (i13 != 0) {
                            f19 = 0.0f;
                        } else {
                            f19 = f10;
                        }
                        if (i15 != 0) {
                            f16 = 0.0f;
                        }
                        if (i17 != 0) {
                            f17 = 1.0f;
                        }
                        if (i19 == 0) {
                        }
                        if (i21 != 0) {
                            f21 = 0.0f;
                        } else {
                            f21 = f14;
                        }
                        if (i23 == 0) {
                        }
                        if (i25 != 0) {
                            list2 = C10009j.f50944a;
                            i12 &= -234881025;
                        } else {
                            list2 = list;
                        }
                    } else {
                        if (i27 != 0) {
                            str2 = "";
                        } else {
                            str2 = str;
                        }
                        if (i28 != 0) {
                            f18 = 0.0f;
                        } else {
                            f18 = f3;
                        }
                        if (i13 != 0) {
                            f19 = 0.0f;
                        } else {
                            f19 = f10;
                        }
                        if (i15 != 0) {
                            f16 = 0.0f;
                        }
                        if (i17 != 0) {
                            f17 = 1.0f;
                        }
                        if (i19 == 0) {
                        }
                        if (i21 != 0) {
                            f21 = 0.0f;
                        } else {
                            f21 = f14;
                        }
                        if (i23 == 0) {
                        }
                        if (i25 != 0) {
                            list2 = C10009j.f50944a;
                            i12 &= -234881025;
                        } else {
                            list2 = list;
                        }
                    }
                    composerImplMo1636j.m1610R();
                    InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q111113 = ComposerKt.f3003a;
                    vectorComposeKt$Group$1 = new InterfaceC2041a<C10001b>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$1
                        @Override // cm.InterfaceC2041a
                        /* JADX INFO: renamed from: E */
                        public final C10001b mo807E() {
                            return new C10001b();
                        }
                    };
                    composerImplMo1636j.mo1622c(-548224868);
                    if (composerImplMo1636j.f2910a instanceof C10006g) {
                        C8573r0.m16771y0();
                        throw null;
                    }
                    composerImplMo1636j.m1658u0();
                    if (composerImplMo1636j.f2897L) {
                        composerImplMo1636j.mo1634i(vectorComposeKt$Group$1);
                    } else {
                        composerImplMo1636j.mo1653s();
                    }
                    C8573r0.m16714a1(composerImplMo1636j, str2, new InterfaceC2056p<C10001b, String, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$1
                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(C10001b c10001b, String str3) {
                            C10001b c10001b2 = c10001b;
                            String str4 = str3;
                            C5207g.m11111f(c10001b2, "$this$set");
                            C5207g.m11111f(str4, "it");
                            c10001b2.f50825i = str4;
                            c10001b2.m18593c();
                            return C9072e.f47360a;
                        }
                    });
                    C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f18), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$2
                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                            C10001b c10001b2 = c10001b;
                            float fFloatValue = f30.floatValue();
                            C5207g.m11111f(c10001b2, "$this$set");
                            c10001b2.f50826j = fFloatValue;
                            c10001b2.f50833q = true;
                            c10001b2.m18593c();
                            return C9072e.f47360a;
                        }
                    });
                    C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f19), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$3
                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                            C10001b c10001b2 = c10001b;
                            float fFloatValue = f30.floatValue();
                            C5207g.m11111f(c10001b2, "$this$set");
                            c10001b2.f50827k = fFloatValue;
                            c10001b2.f50833q = true;
                            c10001b2.m18593c();
                            return C9072e.f47360a;
                        }
                    });
                    C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f16), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$4
                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                            C10001b c10001b2 = c10001b;
                            float fFloatValue = f30.floatValue();
                            C5207g.m11111f(c10001b2, "$this$set");
                            c10001b2.f50828l = fFloatValue;
                            c10001b2.f50833q = true;
                            c10001b2.m18593c();
                            return C9072e.f47360a;
                        }
                    });
                    C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f17), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$5
                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                            C10001b c10001b2 = c10001b;
                            float fFloatValue = f30.floatValue();
                            C5207g.m11111f(c10001b2, "$this$set");
                            c10001b2.f50829m = fFloatValue;
                            c10001b2.f50833q = true;
                            c10001b2.m18593c();
                            return C9072e.f47360a;
                        }
                    });
                    C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f20), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$6
                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                            C10001b c10001b2 = c10001b;
                            float fFloatValue = f30.floatValue();
                            C5207g.m11111f(c10001b2, "$this$set");
                            c10001b2.f50830n = fFloatValue;
                            c10001b2.f50833q = true;
                            c10001b2.m18593c();
                            return C9072e.f47360a;
                        }
                    });
                    C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f21), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$7
                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                            C10001b c10001b2 = c10001b;
                            float fFloatValue = f30.floatValue();
                            C5207g.m11111f(c10001b2, "$this$set");
                            c10001b2.f50831o = fFloatValue;
                            c10001b2.f50833q = true;
                            c10001b2.m18593c();
                            return C9072e.f47360a;
                        }
                    });
                    C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f22), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$8
                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                            C10001b c10001b2 = c10001b;
                            float fFloatValue = f30.floatValue();
                            C5207g.m11111f(c10001b2, "$this$set");
                            c10001b2.f50832p = fFloatValue;
                            c10001b2.f50833q = true;
                            c10001b2.m18593c();
                            return C9072e.f47360a;
                        }
                    });
                    C8573r0.m16714a1(composerImplMo1636j, list2, new InterfaceC2056p<C10001b, List<? extends AbstractC10003d>, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$9
                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(C10001b c10001b, List<? extends AbstractC10003d> list4) {
                            C10001b c10001b2 = c10001b;
                            List<? extends AbstractC10003d> list5 = list4;
                            C5207g.m11111f(c10001b2, "$this$set");
                            C5207g.m11111f(list5, "it");
                            c10001b2.f50820d = list5;
                            c10001b2.f50821e = true;
                            c10001b2.m18593c();
                            return C9072e.f47360a;
                        }
                    });
                    interfaceC2056p.mo1337m0(composerImplMo1636j, Integer.valueOf((i12 >> 27) & 14));
                    composerImplMo1636j.m1609Q(true);
                    composerImplMo1636j.m1609Q(false);
                    f23 = f19;
                    f24 = f22;
                    f25 = f20;
                    f26 = f21;
                    f27 = f17;
                    list3 = list2;
                    f28 = f18;
                    f29 = f16;
                } else {
                    composerImplMo1636j.m1654s0();
                    if ((i10 & 1) != 0) {
                        if (i27 != 0) {
                            str2 = "";
                        } else {
                            str2 = str;
                        }
                        if (i28 != 0) {
                            f18 = 0.0f;
                        } else {
                            f18 = f3;
                        }
                        if (i13 != 0) {
                            f19 = 0.0f;
                        } else {
                            f19 = f10;
                        }
                        if (i15 != 0) {
                            f16 = 0.0f;
                        }
                        if (i17 != 0) {
                            f17 = 1.0f;
                        }
                        if (i19 == 0) {
                        }
                        if (i21 != 0) {
                            f21 = 0.0f;
                        } else {
                            f21 = f14;
                        }
                        if (i23 == 0) {
                        }
                        if (i25 != 0) {
                            list2 = C10009j.f50944a;
                            i12 &= -234881025;
                        } else {
                            list2 = list;
                        }
                    } else {
                        if (i27 != 0) {
                            str2 = "";
                        } else {
                            str2 = str;
                        }
                        if (i28 != 0) {
                            f18 = 0.0f;
                        } else {
                            f18 = f3;
                        }
                        if (i13 != 0) {
                            f19 = 0.0f;
                        } else {
                            f19 = f10;
                        }
                        if (i15 != 0) {
                            f16 = 0.0f;
                        }
                        if (i17 != 0) {
                            f17 = 1.0f;
                        }
                        if (i19 == 0) {
                        }
                        if (i21 != 0) {
                            f21 = 0.0f;
                        } else {
                            f21 = f14;
                        }
                        if (i23 == 0) {
                        }
                        if (i25 != 0) {
                            list2 = C10009j.f50944a;
                            i12 &= -234881025;
                        } else {
                            list2 = list;
                        }
                    }
                    composerImplMo1636j.m1610R();
                    InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q111114 = ComposerKt.f3003a;
                    vectorComposeKt$Group$1 = new InterfaceC2041a<C10001b>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$1
                        @Override // cm.InterfaceC2041a
                        /* JADX INFO: renamed from: E */
                        public final C10001b mo807E() {
                            return new C10001b();
                        }
                    };
                    composerImplMo1636j.mo1622c(-548224868);
                    if (composerImplMo1636j.f2910a instanceof C10006g) {
                        C8573r0.m16771y0();
                        throw null;
                    }
                    composerImplMo1636j.m1658u0();
                    if (composerImplMo1636j.f2897L) {
                        composerImplMo1636j.mo1634i(vectorComposeKt$Group$1);
                    } else {
                        composerImplMo1636j.mo1653s();
                    }
                    C8573r0.m16714a1(composerImplMo1636j, str2, new InterfaceC2056p<C10001b, String, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$1
                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(C10001b c10001b, String str3) {
                            C10001b c10001b2 = c10001b;
                            String str4 = str3;
                            C5207g.m11111f(c10001b2, "$this$set");
                            C5207g.m11111f(str4, "it");
                            c10001b2.f50825i = str4;
                            c10001b2.m18593c();
                            return C9072e.f47360a;
                        }
                    });
                    C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f18), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$2
                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                            C10001b c10001b2 = c10001b;
                            float fFloatValue = f30.floatValue();
                            C5207g.m11111f(c10001b2, "$this$set");
                            c10001b2.f50826j = fFloatValue;
                            c10001b2.f50833q = true;
                            c10001b2.m18593c();
                            return C9072e.f47360a;
                        }
                    });
                    C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f19), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$3
                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                            C10001b c10001b2 = c10001b;
                            float fFloatValue = f30.floatValue();
                            C5207g.m11111f(c10001b2, "$this$set");
                            c10001b2.f50827k = fFloatValue;
                            c10001b2.f50833q = true;
                            c10001b2.m18593c();
                            return C9072e.f47360a;
                        }
                    });
                    C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f16), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$4
                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                            C10001b c10001b2 = c10001b;
                            float fFloatValue = f30.floatValue();
                            C5207g.m11111f(c10001b2, "$this$set");
                            c10001b2.f50828l = fFloatValue;
                            c10001b2.f50833q = true;
                            c10001b2.m18593c();
                            return C9072e.f47360a;
                        }
                    });
                    C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f17), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$5
                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                            C10001b c10001b2 = c10001b;
                            float fFloatValue = f30.floatValue();
                            C5207g.m11111f(c10001b2, "$this$set");
                            c10001b2.f50829m = fFloatValue;
                            c10001b2.f50833q = true;
                            c10001b2.m18593c();
                            return C9072e.f47360a;
                        }
                    });
                    C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f20), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$6
                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                            C10001b c10001b2 = c10001b;
                            float fFloatValue = f30.floatValue();
                            C5207g.m11111f(c10001b2, "$this$set");
                            c10001b2.f50830n = fFloatValue;
                            c10001b2.f50833q = true;
                            c10001b2.m18593c();
                            return C9072e.f47360a;
                        }
                    });
                    C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f21), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$7
                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                            C10001b c10001b2 = c10001b;
                            float fFloatValue = f30.floatValue();
                            C5207g.m11111f(c10001b2, "$this$set");
                            c10001b2.f50831o = fFloatValue;
                            c10001b2.f50833q = true;
                            c10001b2.m18593c();
                            return C9072e.f47360a;
                        }
                    });
                    C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f22), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$8
                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                            C10001b c10001b2 = c10001b;
                            float fFloatValue = f30.floatValue();
                            C5207g.m11111f(c10001b2, "$this$set");
                            c10001b2.f50832p = fFloatValue;
                            c10001b2.f50833q = true;
                            c10001b2.m18593c();
                            return C9072e.f47360a;
                        }
                    });
                    C8573r0.m16714a1(composerImplMo1636j, list2, new InterfaceC2056p<C10001b, List<? extends AbstractC10003d>, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$9
                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(C10001b c10001b, List<? extends AbstractC10003d> list4) {
                            C10001b c10001b2 = c10001b;
                            List<? extends AbstractC10003d> list5 = list4;
                            C5207g.m11111f(c10001b2, "$this$set");
                            C5207g.m11111f(list5, "it");
                            c10001b2.f50820d = list5;
                            c10001b2.f50821e = true;
                            c10001b2.m18593c();
                            return C9072e.f47360a;
                        }
                    });
                    interfaceC2056p.mo1337m0(composerImplMo1636j, Integer.valueOf((i12 >> 27) & 14));
                    composerImplMo1636j.m1609Q(true);
                    composerImplMo1636j.m1609Q(false);
                    f23 = f19;
                    f24 = f22;
                    f25 = f20;
                    f26 = f21;
                    f27 = f17;
                    list3 = list2;
                    f28 = f18;
                    f29 = f16;
                }
                c5332q0M1612T = composerImplMo1636j.m1612T();
                if (c5332q0M1612T == null) {
                    return;
                }
                c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // cm.InterfaceC2056p
                    /* JADX INFO: renamed from: m0 */
                    public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                        num.intValue();
                        VectorComposeKt.m2005a(str2, f28, f23, f29, f27, f25, f26, f24, list3, interfaceC2056p, interfaceC0476a2, C8573r0.m16737l1(i10 | 1), i11);
                        return C9072e.f47360a;
                    }
                };
            }
            i26 = 805306368;
            i12 |= i26;
            if (i25 != 256) {
                composerImplMo1636j.m1654s0();
                if ((i10 & 1) != 0) {
                    if (i27 != 0) {
                        str2 = "";
                    } else {
                        str2 = str;
                    }
                    if (i28 != 0) {
                        f18 = 0.0f;
                    } else {
                        f18 = f3;
                    }
                    if (i13 != 0) {
                        f19 = 0.0f;
                    } else {
                        f19 = f10;
                    }
                    if (i15 != 0) {
                        f16 = 0.0f;
                    }
                    if (i17 != 0) {
                        f17 = 1.0f;
                    }
                    if (i19 == 0) {
                    }
                    if (i21 != 0) {
                        f21 = 0.0f;
                    } else {
                        f21 = f14;
                    }
                    if (i23 == 0) {
                    }
                    if (i25 != 0) {
                        list2 = C10009j.f50944a;
                        i12 &= -234881025;
                    } else {
                        list2 = list;
                    }
                } else {
                    if (i27 != 0) {
                        str2 = "";
                    } else {
                        str2 = str;
                    }
                    if (i28 != 0) {
                        f18 = 0.0f;
                    } else {
                        f18 = f3;
                    }
                    if (i13 != 0) {
                        f19 = 0.0f;
                    } else {
                        f19 = f10;
                    }
                    if (i15 != 0) {
                        f16 = 0.0f;
                    }
                    if (i17 != 0) {
                        f17 = 1.0f;
                    }
                    if (i19 == 0) {
                    }
                    if (i21 != 0) {
                        f21 = 0.0f;
                    } else {
                        f21 = f14;
                    }
                    if (i23 == 0) {
                    }
                    if (i25 != 0) {
                        list2 = C10009j.f50944a;
                        i12 &= -234881025;
                    } else {
                        list2 = list;
                    }
                }
                composerImplMo1636j.m1610R();
                InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q111115 = ComposerKt.f3003a;
                vectorComposeKt$Group$1 = new InterfaceC2041a<C10001b>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$1
                    @Override // cm.InterfaceC2041a
                    /* JADX INFO: renamed from: E */
                    public final C10001b mo807E() {
                        return new C10001b();
                    }
                };
                composerImplMo1636j.mo1622c(-548224868);
                if (composerImplMo1636j.f2910a instanceof C10006g) {
                    C8573r0.m16771y0();
                    throw null;
                }
                composerImplMo1636j.m1658u0();
                if (composerImplMo1636j.f2897L) {
                    composerImplMo1636j.mo1634i(vectorComposeKt$Group$1);
                } else {
                    composerImplMo1636j.mo1653s();
                }
                C8573r0.m16714a1(composerImplMo1636j, str2, new InterfaceC2056p<C10001b, String, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$1
                    @Override // cm.InterfaceC2056p
                    /* JADX INFO: renamed from: m0 */
                    public final C9072e mo1337m0(C10001b c10001b, String str3) {
                        C10001b c10001b2 = c10001b;
                        String str4 = str3;
                        C5207g.m11111f(c10001b2, "$this$set");
                        C5207g.m11111f(str4, "it");
                        c10001b2.f50825i = str4;
                        c10001b2.m18593c();
                        return C9072e.f47360a;
                    }
                });
                C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f18), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$2
                    @Override // cm.InterfaceC2056p
                    /* JADX INFO: renamed from: m0 */
                    public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                        C10001b c10001b2 = c10001b;
                        float fFloatValue = f30.floatValue();
                        C5207g.m11111f(c10001b2, "$this$set");
                        c10001b2.f50826j = fFloatValue;
                        c10001b2.f50833q = true;
                        c10001b2.m18593c();
                        return C9072e.f47360a;
                    }
                });
                C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f19), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$3
                    @Override // cm.InterfaceC2056p
                    /* JADX INFO: renamed from: m0 */
                    public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                        C10001b c10001b2 = c10001b;
                        float fFloatValue = f30.floatValue();
                        C5207g.m11111f(c10001b2, "$this$set");
                        c10001b2.f50827k = fFloatValue;
                        c10001b2.f50833q = true;
                        c10001b2.m18593c();
                        return C9072e.f47360a;
                    }
                });
                C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f16), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$4
                    @Override // cm.InterfaceC2056p
                    /* JADX INFO: renamed from: m0 */
                    public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                        C10001b c10001b2 = c10001b;
                        float fFloatValue = f30.floatValue();
                        C5207g.m11111f(c10001b2, "$this$set");
                        c10001b2.f50828l = fFloatValue;
                        c10001b2.f50833q = true;
                        c10001b2.m18593c();
                        return C9072e.f47360a;
                    }
                });
                C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f17), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$5
                    @Override // cm.InterfaceC2056p
                    /* JADX INFO: renamed from: m0 */
                    public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                        C10001b c10001b2 = c10001b;
                        float fFloatValue = f30.floatValue();
                        C5207g.m11111f(c10001b2, "$this$set");
                        c10001b2.f50829m = fFloatValue;
                        c10001b2.f50833q = true;
                        c10001b2.m18593c();
                        return C9072e.f47360a;
                    }
                });
                C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f20), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$6
                    @Override // cm.InterfaceC2056p
                    /* JADX INFO: renamed from: m0 */
                    public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                        C10001b c10001b2 = c10001b;
                        float fFloatValue = f30.floatValue();
                        C5207g.m11111f(c10001b2, "$this$set");
                        c10001b2.f50830n = fFloatValue;
                        c10001b2.f50833q = true;
                        c10001b2.m18593c();
                        return C9072e.f47360a;
                    }
                });
                C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f21), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$7
                    @Override // cm.InterfaceC2056p
                    /* JADX INFO: renamed from: m0 */
                    public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                        C10001b c10001b2 = c10001b;
                        float fFloatValue = f30.floatValue();
                        C5207g.m11111f(c10001b2, "$this$set");
                        c10001b2.f50831o = fFloatValue;
                        c10001b2.f50833q = true;
                        c10001b2.m18593c();
                        return C9072e.f47360a;
                    }
                });
                C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f22), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$8
                    @Override // cm.InterfaceC2056p
                    /* JADX INFO: renamed from: m0 */
                    public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                        C10001b c10001b2 = c10001b;
                        float fFloatValue = f30.floatValue();
                        C5207g.m11111f(c10001b2, "$this$set");
                        c10001b2.f50832p = fFloatValue;
                        c10001b2.f50833q = true;
                        c10001b2.m18593c();
                        return C9072e.f47360a;
                    }
                });
                C8573r0.m16714a1(composerImplMo1636j, list2, new InterfaceC2056p<C10001b, List<? extends AbstractC10003d>, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$9
                    @Override // cm.InterfaceC2056p
                    /* JADX INFO: renamed from: m0 */
                    public final C9072e mo1337m0(C10001b c10001b, List<? extends AbstractC10003d> list4) {
                        C10001b c10001b2 = c10001b;
                        List<? extends AbstractC10003d> list5 = list4;
                        C5207g.m11111f(c10001b2, "$this$set");
                        C5207g.m11111f(list5, "it");
                        c10001b2.f50820d = list5;
                        c10001b2.f50821e = true;
                        c10001b2.m18593c();
                        return C9072e.f47360a;
                    }
                });
                interfaceC2056p.mo1337m0(composerImplMo1636j, Integer.valueOf((i12 >> 27) & 14));
                composerImplMo1636j.m1609Q(true);
                composerImplMo1636j.m1609Q(false);
                f23 = f19;
                f24 = f22;
                f25 = f20;
                f26 = f21;
                f27 = f17;
                list3 = list2;
                f28 = f18;
                f29 = f16;
            } else {
                composerImplMo1636j.m1654s0();
                if ((i10 & 1) != 0) {
                    if (i27 != 0) {
                        str2 = "";
                    } else {
                        str2 = str;
                    }
                    if (i28 != 0) {
                        f18 = 0.0f;
                    } else {
                        f18 = f3;
                    }
                    if (i13 != 0) {
                        f19 = 0.0f;
                    } else {
                        f19 = f10;
                    }
                    if (i15 != 0) {
                        f16 = 0.0f;
                    }
                    if (i17 != 0) {
                        f17 = 1.0f;
                    }
                    if (i19 == 0) {
                    }
                    if (i21 != 0) {
                        f21 = 0.0f;
                    } else {
                        f21 = f14;
                    }
                    if (i23 == 0) {
                    }
                    if (i25 != 0) {
                        list2 = C10009j.f50944a;
                        i12 &= -234881025;
                    } else {
                        list2 = list;
                    }
                } else {
                    if (i27 != 0) {
                        str2 = "";
                    } else {
                        str2 = str;
                    }
                    if (i28 != 0) {
                        f18 = 0.0f;
                    } else {
                        f18 = f3;
                    }
                    if (i13 != 0) {
                        f19 = 0.0f;
                    } else {
                        f19 = f10;
                    }
                    if (i15 != 0) {
                        f16 = 0.0f;
                    }
                    if (i17 != 0) {
                        f17 = 1.0f;
                    }
                    if (i19 == 0) {
                    }
                    if (i21 != 0) {
                        f21 = 0.0f;
                    } else {
                        f21 = f14;
                    }
                    if (i23 == 0) {
                    }
                    if (i25 != 0) {
                        list2 = C10009j.f50944a;
                        i12 &= -234881025;
                    } else {
                        list2 = list;
                    }
                }
                composerImplMo1636j.m1610R();
                InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q111116 = ComposerKt.f3003a;
                vectorComposeKt$Group$1 = new InterfaceC2041a<C10001b>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$1
                    @Override // cm.InterfaceC2041a
                    /* JADX INFO: renamed from: E */
                    public final C10001b mo807E() {
                        return new C10001b();
                    }
                };
                composerImplMo1636j.mo1622c(-548224868);
                if (composerImplMo1636j.f2910a instanceof C10006g) {
                    C8573r0.m16771y0();
                    throw null;
                }
                composerImplMo1636j.m1658u0();
                if (composerImplMo1636j.f2897L) {
                    composerImplMo1636j.mo1634i(vectorComposeKt$Group$1);
                } else {
                    composerImplMo1636j.mo1653s();
                }
                C8573r0.m16714a1(composerImplMo1636j, str2, new InterfaceC2056p<C10001b, String, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$1
                    @Override // cm.InterfaceC2056p
                    /* JADX INFO: renamed from: m0 */
                    public final C9072e mo1337m0(C10001b c10001b, String str3) {
                        C10001b c10001b2 = c10001b;
                        String str4 = str3;
                        C5207g.m11111f(c10001b2, "$this$set");
                        C5207g.m11111f(str4, "it");
                        c10001b2.f50825i = str4;
                        c10001b2.m18593c();
                        return C9072e.f47360a;
                    }
                });
                C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f18), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$2
                    @Override // cm.InterfaceC2056p
                    /* JADX INFO: renamed from: m0 */
                    public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                        C10001b c10001b2 = c10001b;
                        float fFloatValue = f30.floatValue();
                        C5207g.m11111f(c10001b2, "$this$set");
                        c10001b2.f50826j = fFloatValue;
                        c10001b2.f50833q = true;
                        c10001b2.m18593c();
                        return C9072e.f47360a;
                    }
                });
                C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f19), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$3
                    @Override // cm.InterfaceC2056p
                    /* JADX INFO: renamed from: m0 */
                    public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                        C10001b c10001b2 = c10001b;
                        float fFloatValue = f30.floatValue();
                        C5207g.m11111f(c10001b2, "$this$set");
                        c10001b2.f50827k = fFloatValue;
                        c10001b2.f50833q = true;
                        c10001b2.m18593c();
                        return C9072e.f47360a;
                    }
                });
                C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f16), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$4
                    @Override // cm.InterfaceC2056p
                    /* JADX INFO: renamed from: m0 */
                    public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                        C10001b c10001b2 = c10001b;
                        float fFloatValue = f30.floatValue();
                        C5207g.m11111f(c10001b2, "$this$set");
                        c10001b2.f50828l = fFloatValue;
                        c10001b2.f50833q = true;
                        c10001b2.m18593c();
                        return C9072e.f47360a;
                    }
                });
                C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f17), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$5
                    @Override // cm.InterfaceC2056p
                    /* JADX INFO: renamed from: m0 */
                    public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                        C10001b c10001b2 = c10001b;
                        float fFloatValue = f30.floatValue();
                        C5207g.m11111f(c10001b2, "$this$set");
                        c10001b2.f50829m = fFloatValue;
                        c10001b2.f50833q = true;
                        c10001b2.m18593c();
                        return C9072e.f47360a;
                    }
                });
                C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f20), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$6
                    @Override // cm.InterfaceC2056p
                    /* JADX INFO: renamed from: m0 */
                    public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                        C10001b c10001b2 = c10001b;
                        float fFloatValue = f30.floatValue();
                        C5207g.m11111f(c10001b2, "$this$set");
                        c10001b2.f50830n = fFloatValue;
                        c10001b2.f50833q = true;
                        c10001b2.m18593c();
                        return C9072e.f47360a;
                    }
                });
                C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f21), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$7
                    @Override // cm.InterfaceC2056p
                    /* JADX INFO: renamed from: m0 */
                    public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                        C10001b c10001b2 = c10001b;
                        float fFloatValue = f30.floatValue();
                        C5207g.m11111f(c10001b2, "$this$set");
                        c10001b2.f50831o = fFloatValue;
                        c10001b2.f50833q = true;
                        c10001b2.m18593c();
                        return C9072e.f47360a;
                    }
                });
                C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f22), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$8
                    @Override // cm.InterfaceC2056p
                    /* JADX INFO: renamed from: m0 */
                    public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                        C10001b c10001b2 = c10001b;
                        float fFloatValue = f30.floatValue();
                        C5207g.m11111f(c10001b2, "$this$set");
                        c10001b2.f50832p = fFloatValue;
                        c10001b2.f50833q = true;
                        c10001b2.m18593c();
                        return C9072e.f47360a;
                    }
                });
                C8573r0.m16714a1(composerImplMo1636j, list2, new InterfaceC2056p<C10001b, List<? extends AbstractC10003d>, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$9
                    @Override // cm.InterfaceC2056p
                    /* JADX INFO: renamed from: m0 */
                    public final C9072e mo1337m0(C10001b c10001b, List<? extends AbstractC10003d> list4) {
                        C10001b c10001b2 = c10001b;
                        List<? extends AbstractC10003d> list5 = list4;
                        C5207g.m11111f(c10001b2, "$this$set");
                        C5207g.m11111f(list5, "it");
                        c10001b2.f50820d = list5;
                        c10001b2.f50821e = true;
                        c10001b2.m18593c();
                        return C9072e.f47360a;
                    }
                });
                interfaceC2056p.mo1337m0(composerImplMo1636j, Integer.valueOf((i12 >> 27) & 14));
                composerImplMo1636j.m1609Q(true);
                composerImplMo1636j.m1609Q(false);
                f23 = f19;
                f24 = f22;
                f25 = f20;
                f26 = f21;
                f27 = f17;
                list3 = list2;
                f28 = f18;
                f29 = f16;
            }
            c5332q0M1612T = composerImplMo1636j.m1612T();
            if (c5332q0M1612T == null) {
                return;
            }
            c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // cm.InterfaceC2056p
                /* JADX INFO: renamed from: m0 */
                public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                    num.intValue();
                    VectorComposeKt.m2005a(str2, f28, f23, f29, f27, f25, f26, f24, list3, interfaceC2056p, interfaceC0476a2, C8573r0.m16737l1(i10 | 1), i11);
                    return C9072e.f47360a;
                }
            };
        }
        i12 |= 3072;
        f16 = f11;
        i17 = i11 & 16;
        if (i17 != 0) {
            if ((57344 & i10) == 0) {
                f17 = f12;
                if (composerImplMo1636j.m1592D(f17)) {
                    i18 = 16384;
                } else {
                    i18 = 8192;
                }
                i12 |= i18;
            }
            i19 = i11 & 32;
            if (i19 != 0) {
                i12 |= 196608;
            } else if ((i10 & 458752) == 0) {
                if (composerImplMo1636j.m1592D(f13)) {
                    i20 = 131072;
                } else {
                    i20 = 65536;
                }
                i12 |= i20;
            }
            i21 = i11 & 64;
            if (i21 != 0) {
                i12 |= 1572864;
            } else if ((i10 & 3670016) == 0) {
                if (composerImplMo1636j.m1592D(f14)) {
                    i22 = 1048576;
                } else {
                    i22 = 524288;
                }
                i12 |= i22;
            }
            i23 = i11 & BuildConfig.SDK_TRUNCATE_LENGTH;
            if (i23 != 0) {
                i12 |= 12582912;
            } else if ((i10 & 29360128) == 0) {
                if (composerImplMo1636j.m1592D(f15)) {
                    i24 = 8388608;
                } else {
                    i24 = 4194304;
                }
                i12 |= i24;
            }
            i25 = i11 & 256;
            if (i25 != 0) {
                i12 |= 33554432;
            }
            if ((i11 & 512) != 0) {
                if ((1879048192 & i10) == 0) {
                    if (composerImplMo1636j.m1600H(interfaceC2056p)) {
                        i26 = 536870912;
                    } else {
                        i26 = 268435456;
                    }
                }
                if (i25 != 256) {
                    composerImplMo1636j.m1654s0();
                    if ((i10 & 1) != 0) {
                        if (i27 != 0) {
                            str2 = "";
                        } else {
                            str2 = str;
                        }
                        if (i28 != 0) {
                            f18 = 0.0f;
                        } else {
                            f18 = f3;
                        }
                        if (i13 != 0) {
                            f19 = 0.0f;
                        } else {
                            f19 = f10;
                        }
                        if (i15 != 0) {
                            f16 = 0.0f;
                        }
                        if (i17 != 0) {
                            f17 = 1.0f;
                        }
                        if (i19 == 0) {
                        }
                        if (i21 != 0) {
                            f21 = 0.0f;
                        } else {
                            f21 = f14;
                        }
                        if (i23 == 0) {
                        }
                        if (i25 != 0) {
                            list2 = C10009j.f50944a;
                            i12 &= -234881025;
                        } else {
                            list2 = list;
                        }
                    } else {
                        if (i27 != 0) {
                            str2 = "";
                        } else {
                            str2 = str;
                        }
                        if (i28 != 0) {
                            f18 = 0.0f;
                        } else {
                            f18 = f3;
                        }
                        if (i13 != 0) {
                            f19 = 0.0f;
                        } else {
                            f19 = f10;
                        }
                        if (i15 != 0) {
                            f16 = 0.0f;
                        }
                        if (i17 != 0) {
                            f17 = 1.0f;
                        }
                        if (i19 == 0) {
                        }
                        if (i21 != 0) {
                            f21 = 0.0f;
                        } else {
                            f21 = f14;
                        }
                        if (i23 == 0) {
                        }
                        if (i25 != 0) {
                            list2 = C10009j.f50944a;
                            i12 &= -234881025;
                        } else {
                            list2 = list;
                        }
                    }
                    composerImplMo1636j.m1610R();
                    InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q111117 = ComposerKt.f3003a;
                    vectorComposeKt$Group$1 = new InterfaceC2041a<C10001b>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$1
                        @Override // cm.InterfaceC2041a
                        /* JADX INFO: renamed from: E */
                        public final C10001b mo807E() {
                            return new C10001b();
                        }
                    };
                    composerImplMo1636j.mo1622c(-548224868);
                    if (composerImplMo1636j.f2910a instanceof C10006g) {
                        C8573r0.m16771y0();
                        throw null;
                    }
                    composerImplMo1636j.m1658u0();
                    if (composerImplMo1636j.f2897L) {
                        composerImplMo1636j.mo1634i(vectorComposeKt$Group$1);
                    } else {
                        composerImplMo1636j.mo1653s();
                    }
                    C8573r0.m16714a1(composerImplMo1636j, str2, new InterfaceC2056p<C10001b, String, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$1
                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(C10001b c10001b, String str3) {
                            C10001b c10001b2 = c10001b;
                            String str4 = str3;
                            C5207g.m11111f(c10001b2, "$this$set");
                            C5207g.m11111f(str4, "it");
                            c10001b2.f50825i = str4;
                            c10001b2.m18593c();
                            return C9072e.f47360a;
                        }
                    });
                    C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f18), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$2
                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                            C10001b c10001b2 = c10001b;
                            float fFloatValue = f30.floatValue();
                            C5207g.m11111f(c10001b2, "$this$set");
                            c10001b2.f50826j = fFloatValue;
                            c10001b2.f50833q = true;
                            c10001b2.m18593c();
                            return C9072e.f47360a;
                        }
                    });
                    C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f19), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$3
                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                            C10001b c10001b2 = c10001b;
                            float fFloatValue = f30.floatValue();
                            C5207g.m11111f(c10001b2, "$this$set");
                            c10001b2.f50827k = fFloatValue;
                            c10001b2.f50833q = true;
                            c10001b2.m18593c();
                            return C9072e.f47360a;
                        }
                    });
                    C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f16), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$4
                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                            C10001b c10001b2 = c10001b;
                            float fFloatValue = f30.floatValue();
                            C5207g.m11111f(c10001b2, "$this$set");
                            c10001b2.f50828l = fFloatValue;
                            c10001b2.f50833q = true;
                            c10001b2.m18593c();
                            return C9072e.f47360a;
                        }
                    });
                    C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f17), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$5
                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                            C10001b c10001b2 = c10001b;
                            float fFloatValue = f30.floatValue();
                            C5207g.m11111f(c10001b2, "$this$set");
                            c10001b2.f50829m = fFloatValue;
                            c10001b2.f50833q = true;
                            c10001b2.m18593c();
                            return C9072e.f47360a;
                        }
                    });
                    C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f20), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$6
                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                            C10001b c10001b2 = c10001b;
                            float fFloatValue = f30.floatValue();
                            C5207g.m11111f(c10001b2, "$this$set");
                            c10001b2.f50830n = fFloatValue;
                            c10001b2.f50833q = true;
                            c10001b2.m18593c();
                            return C9072e.f47360a;
                        }
                    });
                    C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f21), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$7
                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                            C10001b c10001b2 = c10001b;
                            float fFloatValue = f30.floatValue();
                            C5207g.m11111f(c10001b2, "$this$set");
                            c10001b2.f50831o = fFloatValue;
                            c10001b2.f50833q = true;
                            c10001b2.m18593c();
                            return C9072e.f47360a;
                        }
                    });
                    C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f22), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$8
                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                            C10001b c10001b2 = c10001b;
                            float fFloatValue = f30.floatValue();
                            C5207g.m11111f(c10001b2, "$this$set");
                            c10001b2.f50832p = fFloatValue;
                            c10001b2.f50833q = true;
                            c10001b2.m18593c();
                            return C9072e.f47360a;
                        }
                    });
                    C8573r0.m16714a1(composerImplMo1636j, list2, new InterfaceC2056p<C10001b, List<? extends AbstractC10003d>, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$9
                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(C10001b c10001b, List<? extends AbstractC10003d> list4) {
                            C10001b c10001b2 = c10001b;
                            List<? extends AbstractC10003d> list5 = list4;
                            C5207g.m11111f(c10001b2, "$this$set");
                            C5207g.m11111f(list5, "it");
                            c10001b2.f50820d = list5;
                            c10001b2.f50821e = true;
                            c10001b2.m18593c();
                            return C9072e.f47360a;
                        }
                    });
                    interfaceC2056p.mo1337m0(composerImplMo1636j, Integer.valueOf((i12 >> 27) & 14));
                    composerImplMo1636j.m1609Q(true);
                    composerImplMo1636j.m1609Q(false);
                    f23 = f19;
                    f24 = f22;
                    f25 = f20;
                    f26 = f21;
                    f27 = f17;
                    list3 = list2;
                    f28 = f18;
                    f29 = f16;
                } else {
                    composerImplMo1636j.m1654s0();
                    if ((i10 & 1) != 0) {
                        if (i27 != 0) {
                            str2 = "";
                        } else {
                            str2 = str;
                        }
                        if (i28 != 0) {
                            f18 = 0.0f;
                        } else {
                            f18 = f3;
                        }
                        if (i13 != 0) {
                            f19 = 0.0f;
                        } else {
                            f19 = f10;
                        }
                        if (i15 != 0) {
                            f16 = 0.0f;
                        }
                        if (i17 != 0) {
                            f17 = 1.0f;
                        }
                        if (i19 == 0) {
                        }
                        if (i21 != 0) {
                            f21 = 0.0f;
                        } else {
                            f21 = f14;
                        }
                        if (i23 == 0) {
                        }
                        if (i25 != 0) {
                            list2 = C10009j.f50944a;
                            i12 &= -234881025;
                        } else {
                            list2 = list;
                        }
                    } else {
                        if (i27 != 0) {
                            str2 = "";
                        } else {
                            str2 = str;
                        }
                        if (i28 != 0) {
                            f18 = 0.0f;
                        } else {
                            f18 = f3;
                        }
                        if (i13 != 0) {
                            f19 = 0.0f;
                        } else {
                            f19 = f10;
                        }
                        if (i15 != 0) {
                            f16 = 0.0f;
                        }
                        if (i17 != 0) {
                            f17 = 1.0f;
                        }
                        if (i19 == 0) {
                        }
                        if (i21 != 0) {
                            f21 = 0.0f;
                        } else {
                            f21 = f14;
                        }
                        if (i23 == 0) {
                        }
                        if (i25 != 0) {
                            list2 = C10009j.f50944a;
                            i12 &= -234881025;
                        } else {
                            list2 = list;
                        }
                    }
                    composerImplMo1636j.m1610R();
                    InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q111118 = ComposerKt.f3003a;
                    vectorComposeKt$Group$1 = new InterfaceC2041a<C10001b>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$1
                        @Override // cm.InterfaceC2041a
                        /* JADX INFO: renamed from: E */
                        public final C10001b mo807E() {
                            return new C10001b();
                        }
                    };
                    composerImplMo1636j.mo1622c(-548224868);
                    if (composerImplMo1636j.f2910a instanceof C10006g) {
                        C8573r0.m16771y0();
                        throw null;
                    }
                    composerImplMo1636j.m1658u0();
                    if (composerImplMo1636j.f2897L) {
                        composerImplMo1636j.mo1634i(vectorComposeKt$Group$1);
                    } else {
                        composerImplMo1636j.mo1653s();
                    }
                    C8573r0.m16714a1(composerImplMo1636j, str2, new InterfaceC2056p<C10001b, String, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$1
                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(C10001b c10001b, String str3) {
                            C10001b c10001b2 = c10001b;
                            String str4 = str3;
                            C5207g.m11111f(c10001b2, "$this$set");
                            C5207g.m11111f(str4, "it");
                            c10001b2.f50825i = str4;
                            c10001b2.m18593c();
                            return C9072e.f47360a;
                        }
                    });
                    C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f18), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$2
                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                            C10001b c10001b2 = c10001b;
                            float fFloatValue = f30.floatValue();
                            C5207g.m11111f(c10001b2, "$this$set");
                            c10001b2.f50826j = fFloatValue;
                            c10001b2.f50833q = true;
                            c10001b2.m18593c();
                            return C9072e.f47360a;
                        }
                    });
                    C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f19), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$3
                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                            C10001b c10001b2 = c10001b;
                            float fFloatValue = f30.floatValue();
                            C5207g.m11111f(c10001b2, "$this$set");
                            c10001b2.f50827k = fFloatValue;
                            c10001b2.f50833q = true;
                            c10001b2.m18593c();
                            return C9072e.f47360a;
                        }
                    });
                    C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f16), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$4
                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                            C10001b c10001b2 = c10001b;
                            float fFloatValue = f30.floatValue();
                            C5207g.m11111f(c10001b2, "$this$set");
                            c10001b2.f50828l = fFloatValue;
                            c10001b2.f50833q = true;
                            c10001b2.m18593c();
                            return C9072e.f47360a;
                        }
                    });
                    C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f17), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$5
                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                            C10001b c10001b2 = c10001b;
                            float fFloatValue = f30.floatValue();
                            C5207g.m11111f(c10001b2, "$this$set");
                            c10001b2.f50829m = fFloatValue;
                            c10001b2.f50833q = true;
                            c10001b2.m18593c();
                            return C9072e.f47360a;
                        }
                    });
                    C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f20), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$6
                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                            C10001b c10001b2 = c10001b;
                            float fFloatValue = f30.floatValue();
                            C5207g.m11111f(c10001b2, "$this$set");
                            c10001b2.f50830n = fFloatValue;
                            c10001b2.f50833q = true;
                            c10001b2.m18593c();
                            return C9072e.f47360a;
                        }
                    });
                    C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f21), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$7
                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                            C10001b c10001b2 = c10001b;
                            float fFloatValue = f30.floatValue();
                            C5207g.m11111f(c10001b2, "$this$set");
                            c10001b2.f50831o = fFloatValue;
                            c10001b2.f50833q = true;
                            c10001b2.m18593c();
                            return C9072e.f47360a;
                        }
                    });
                    C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f22), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$8
                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                            C10001b c10001b2 = c10001b;
                            float fFloatValue = f30.floatValue();
                            C5207g.m11111f(c10001b2, "$this$set");
                            c10001b2.f50832p = fFloatValue;
                            c10001b2.f50833q = true;
                            c10001b2.m18593c();
                            return C9072e.f47360a;
                        }
                    });
                    C8573r0.m16714a1(composerImplMo1636j, list2, new InterfaceC2056p<C10001b, List<? extends AbstractC10003d>, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$9
                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(C10001b c10001b, List<? extends AbstractC10003d> list4) {
                            C10001b c10001b2 = c10001b;
                            List<? extends AbstractC10003d> list5 = list4;
                            C5207g.m11111f(c10001b2, "$this$set");
                            C5207g.m11111f(list5, "it");
                            c10001b2.f50820d = list5;
                            c10001b2.f50821e = true;
                            c10001b2.m18593c();
                            return C9072e.f47360a;
                        }
                    });
                    interfaceC2056p.mo1337m0(composerImplMo1636j, Integer.valueOf((i12 >> 27) & 14));
                    composerImplMo1636j.m1609Q(true);
                    composerImplMo1636j.m1609Q(false);
                    f23 = f19;
                    f24 = f22;
                    f25 = f20;
                    f26 = f21;
                    f27 = f17;
                    list3 = list2;
                    f28 = f18;
                    f29 = f16;
                }
                c5332q0M1612T = composerImplMo1636j.m1612T();
                if (c5332q0M1612T == null) {
                    return;
                }
                c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // cm.InterfaceC2056p
                    /* JADX INFO: renamed from: m0 */
                    public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                        num.intValue();
                        VectorComposeKt.m2005a(str2, f28, f23, f29, f27, f25, f26, f24, list3, interfaceC2056p, interfaceC0476a2, C8573r0.m16737l1(i10 | 1), i11);
                        return C9072e.f47360a;
                    }
                };
            }
            i26 = 805306368;
            i12 |= i26;
            if (i25 != 256) {
                composerImplMo1636j.m1654s0();
                if ((i10 & 1) != 0) {
                    if (i27 != 0) {
                        str2 = "";
                    } else {
                        str2 = str;
                    }
                    if (i28 != 0) {
                        f18 = 0.0f;
                    } else {
                        f18 = f3;
                    }
                    if (i13 != 0) {
                        f19 = 0.0f;
                    } else {
                        f19 = f10;
                    }
                    if (i15 != 0) {
                        f16 = 0.0f;
                    }
                    if (i17 != 0) {
                        f17 = 1.0f;
                    }
                    if (i19 == 0) {
                    }
                    if (i21 != 0) {
                        f21 = 0.0f;
                    } else {
                        f21 = f14;
                    }
                    if (i23 == 0) {
                    }
                    if (i25 != 0) {
                        list2 = C10009j.f50944a;
                        i12 &= -234881025;
                    } else {
                        list2 = list;
                    }
                } else {
                    if (i27 != 0) {
                        str2 = "";
                    } else {
                        str2 = str;
                    }
                    if (i28 != 0) {
                        f18 = 0.0f;
                    } else {
                        f18 = f3;
                    }
                    if (i13 != 0) {
                        f19 = 0.0f;
                    } else {
                        f19 = f10;
                    }
                    if (i15 != 0) {
                        f16 = 0.0f;
                    }
                    if (i17 != 0) {
                        f17 = 1.0f;
                    }
                    if (i19 == 0) {
                    }
                    if (i21 != 0) {
                        f21 = 0.0f;
                    } else {
                        f21 = f14;
                    }
                    if (i23 == 0) {
                    }
                    if (i25 != 0) {
                        list2 = C10009j.f50944a;
                        i12 &= -234881025;
                    } else {
                        list2 = list;
                    }
                }
                composerImplMo1636j.m1610R();
                InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q111119 = ComposerKt.f3003a;
                vectorComposeKt$Group$1 = new InterfaceC2041a<C10001b>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$1
                    @Override // cm.InterfaceC2041a
                    /* JADX INFO: renamed from: E */
                    public final C10001b mo807E() {
                        return new C10001b();
                    }
                };
                composerImplMo1636j.mo1622c(-548224868);
                if (composerImplMo1636j.f2910a instanceof C10006g) {
                    C8573r0.m16771y0();
                    throw null;
                }
                composerImplMo1636j.m1658u0();
                if (composerImplMo1636j.f2897L) {
                    composerImplMo1636j.mo1634i(vectorComposeKt$Group$1);
                } else {
                    composerImplMo1636j.mo1653s();
                }
                C8573r0.m16714a1(composerImplMo1636j, str2, new InterfaceC2056p<C10001b, String, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$1
                    @Override // cm.InterfaceC2056p
                    /* JADX INFO: renamed from: m0 */
                    public final C9072e mo1337m0(C10001b c10001b, String str3) {
                        C10001b c10001b2 = c10001b;
                        String str4 = str3;
                        C5207g.m11111f(c10001b2, "$this$set");
                        C5207g.m11111f(str4, "it");
                        c10001b2.f50825i = str4;
                        c10001b2.m18593c();
                        return C9072e.f47360a;
                    }
                });
                C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f18), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$2
                    @Override // cm.InterfaceC2056p
                    /* JADX INFO: renamed from: m0 */
                    public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                        C10001b c10001b2 = c10001b;
                        float fFloatValue = f30.floatValue();
                        C5207g.m11111f(c10001b2, "$this$set");
                        c10001b2.f50826j = fFloatValue;
                        c10001b2.f50833q = true;
                        c10001b2.m18593c();
                        return C9072e.f47360a;
                    }
                });
                C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f19), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$3
                    @Override // cm.InterfaceC2056p
                    /* JADX INFO: renamed from: m0 */
                    public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                        C10001b c10001b2 = c10001b;
                        float fFloatValue = f30.floatValue();
                        C5207g.m11111f(c10001b2, "$this$set");
                        c10001b2.f50827k = fFloatValue;
                        c10001b2.f50833q = true;
                        c10001b2.m18593c();
                        return C9072e.f47360a;
                    }
                });
                C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f16), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$4
                    @Override // cm.InterfaceC2056p
                    /* JADX INFO: renamed from: m0 */
                    public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                        C10001b c10001b2 = c10001b;
                        float fFloatValue = f30.floatValue();
                        C5207g.m11111f(c10001b2, "$this$set");
                        c10001b2.f50828l = fFloatValue;
                        c10001b2.f50833q = true;
                        c10001b2.m18593c();
                        return C9072e.f47360a;
                    }
                });
                C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f17), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$5
                    @Override // cm.InterfaceC2056p
                    /* JADX INFO: renamed from: m0 */
                    public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                        C10001b c10001b2 = c10001b;
                        float fFloatValue = f30.floatValue();
                        C5207g.m11111f(c10001b2, "$this$set");
                        c10001b2.f50829m = fFloatValue;
                        c10001b2.f50833q = true;
                        c10001b2.m18593c();
                        return C9072e.f47360a;
                    }
                });
                C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f20), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$6
                    @Override // cm.InterfaceC2056p
                    /* JADX INFO: renamed from: m0 */
                    public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                        C10001b c10001b2 = c10001b;
                        float fFloatValue = f30.floatValue();
                        C5207g.m11111f(c10001b2, "$this$set");
                        c10001b2.f50830n = fFloatValue;
                        c10001b2.f50833q = true;
                        c10001b2.m18593c();
                        return C9072e.f47360a;
                    }
                });
                C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f21), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$7
                    @Override // cm.InterfaceC2056p
                    /* JADX INFO: renamed from: m0 */
                    public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                        C10001b c10001b2 = c10001b;
                        float fFloatValue = f30.floatValue();
                        C5207g.m11111f(c10001b2, "$this$set");
                        c10001b2.f50831o = fFloatValue;
                        c10001b2.f50833q = true;
                        c10001b2.m18593c();
                        return C9072e.f47360a;
                    }
                });
                C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f22), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$8
                    @Override // cm.InterfaceC2056p
                    /* JADX INFO: renamed from: m0 */
                    public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                        C10001b c10001b2 = c10001b;
                        float fFloatValue = f30.floatValue();
                        C5207g.m11111f(c10001b2, "$this$set");
                        c10001b2.f50832p = fFloatValue;
                        c10001b2.f50833q = true;
                        c10001b2.m18593c();
                        return C9072e.f47360a;
                    }
                });
                C8573r0.m16714a1(composerImplMo1636j, list2, new InterfaceC2056p<C10001b, List<? extends AbstractC10003d>, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$9
                    @Override // cm.InterfaceC2056p
                    /* JADX INFO: renamed from: m0 */
                    public final C9072e mo1337m0(C10001b c10001b, List<? extends AbstractC10003d> list4) {
                        C10001b c10001b2 = c10001b;
                        List<? extends AbstractC10003d> list5 = list4;
                        C5207g.m11111f(c10001b2, "$this$set");
                        C5207g.m11111f(list5, "it");
                        c10001b2.f50820d = list5;
                        c10001b2.f50821e = true;
                        c10001b2.m18593c();
                        return C9072e.f47360a;
                    }
                });
                interfaceC2056p.mo1337m0(composerImplMo1636j, Integer.valueOf((i12 >> 27) & 14));
                composerImplMo1636j.m1609Q(true);
                composerImplMo1636j.m1609Q(false);
                f23 = f19;
                f24 = f22;
                f25 = f20;
                f26 = f21;
                f27 = f17;
                list3 = list2;
                f28 = f18;
                f29 = f16;
            } else {
                composerImplMo1636j.m1654s0();
                if ((i10 & 1) != 0) {
                    if (i27 != 0) {
                        str2 = "";
                    } else {
                        str2 = str;
                    }
                    if (i28 != 0) {
                        f18 = 0.0f;
                    } else {
                        f18 = f3;
                    }
                    if (i13 != 0) {
                        f19 = 0.0f;
                    } else {
                        f19 = f10;
                    }
                    if (i15 != 0) {
                        f16 = 0.0f;
                    }
                    if (i17 != 0) {
                        f17 = 1.0f;
                    }
                    if (i19 == 0) {
                    }
                    if (i21 != 0) {
                        f21 = 0.0f;
                    } else {
                        f21 = f14;
                    }
                    if (i23 == 0) {
                    }
                    if (i25 != 0) {
                        list2 = C10009j.f50944a;
                        i12 &= -234881025;
                    } else {
                        list2 = list;
                    }
                } else {
                    if (i27 != 0) {
                        str2 = "";
                    } else {
                        str2 = str;
                    }
                    if (i28 != 0) {
                        f18 = 0.0f;
                    } else {
                        f18 = f3;
                    }
                    if (i13 != 0) {
                        f19 = 0.0f;
                    } else {
                        f19 = f10;
                    }
                    if (i15 != 0) {
                        f16 = 0.0f;
                    }
                    if (i17 != 0) {
                        f17 = 1.0f;
                    }
                    if (i19 == 0) {
                    }
                    if (i21 != 0) {
                        f21 = 0.0f;
                    } else {
                        f21 = f14;
                    }
                    if (i23 == 0) {
                    }
                    if (i25 != 0) {
                        list2 = C10009j.f50944a;
                        i12 &= -234881025;
                    } else {
                        list2 = list;
                    }
                }
                composerImplMo1636j.m1610R();
                InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q1111110 = ComposerKt.f3003a;
                vectorComposeKt$Group$1 = new InterfaceC2041a<C10001b>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$1
                    @Override // cm.InterfaceC2041a
                    /* JADX INFO: renamed from: E */
                    public final C10001b mo807E() {
                        return new C10001b();
                    }
                };
                composerImplMo1636j.mo1622c(-548224868);
                if (composerImplMo1636j.f2910a instanceof C10006g) {
                    C8573r0.m16771y0();
                    throw null;
                }
                composerImplMo1636j.m1658u0();
                if (composerImplMo1636j.f2897L) {
                    composerImplMo1636j.mo1634i(vectorComposeKt$Group$1);
                } else {
                    composerImplMo1636j.mo1653s();
                }
                C8573r0.m16714a1(composerImplMo1636j, str2, new InterfaceC2056p<C10001b, String, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$1
                    @Override // cm.InterfaceC2056p
                    /* JADX INFO: renamed from: m0 */
                    public final C9072e mo1337m0(C10001b c10001b, String str3) {
                        C10001b c10001b2 = c10001b;
                        String str4 = str3;
                        C5207g.m11111f(c10001b2, "$this$set");
                        C5207g.m11111f(str4, "it");
                        c10001b2.f50825i = str4;
                        c10001b2.m18593c();
                        return C9072e.f47360a;
                    }
                });
                C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f18), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$2
                    @Override // cm.InterfaceC2056p
                    /* JADX INFO: renamed from: m0 */
                    public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                        C10001b c10001b2 = c10001b;
                        float fFloatValue = f30.floatValue();
                        C5207g.m11111f(c10001b2, "$this$set");
                        c10001b2.f50826j = fFloatValue;
                        c10001b2.f50833q = true;
                        c10001b2.m18593c();
                        return C9072e.f47360a;
                    }
                });
                C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f19), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$3
                    @Override // cm.InterfaceC2056p
                    /* JADX INFO: renamed from: m0 */
                    public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                        C10001b c10001b2 = c10001b;
                        float fFloatValue = f30.floatValue();
                        C5207g.m11111f(c10001b2, "$this$set");
                        c10001b2.f50827k = fFloatValue;
                        c10001b2.f50833q = true;
                        c10001b2.m18593c();
                        return C9072e.f47360a;
                    }
                });
                C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f16), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$4
                    @Override // cm.InterfaceC2056p
                    /* JADX INFO: renamed from: m0 */
                    public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                        C10001b c10001b2 = c10001b;
                        float fFloatValue = f30.floatValue();
                        C5207g.m11111f(c10001b2, "$this$set");
                        c10001b2.f50828l = fFloatValue;
                        c10001b2.f50833q = true;
                        c10001b2.m18593c();
                        return C9072e.f47360a;
                    }
                });
                C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f17), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$5
                    @Override // cm.InterfaceC2056p
                    /* JADX INFO: renamed from: m0 */
                    public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                        C10001b c10001b2 = c10001b;
                        float fFloatValue = f30.floatValue();
                        C5207g.m11111f(c10001b2, "$this$set");
                        c10001b2.f50829m = fFloatValue;
                        c10001b2.f50833q = true;
                        c10001b2.m18593c();
                        return C9072e.f47360a;
                    }
                });
                C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f20), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$6
                    @Override // cm.InterfaceC2056p
                    /* JADX INFO: renamed from: m0 */
                    public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                        C10001b c10001b2 = c10001b;
                        float fFloatValue = f30.floatValue();
                        C5207g.m11111f(c10001b2, "$this$set");
                        c10001b2.f50830n = fFloatValue;
                        c10001b2.f50833q = true;
                        c10001b2.m18593c();
                        return C9072e.f47360a;
                    }
                });
                C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f21), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$7
                    @Override // cm.InterfaceC2056p
                    /* JADX INFO: renamed from: m0 */
                    public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                        C10001b c10001b2 = c10001b;
                        float fFloatValue = f30.floatValue();
                        C5207g.m11111f(c10001b2, "$this$set");
                        c10001b2.f50831o = fFloatValue;
                        c10001b2.f50833q = true;
                        c10001b2.m18593c();
                        return C9072e.f47360a;
                    }
                });
                C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f22), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$8
                    @Override // cm.InterfaceC2056p
                    /* JADX INFO: renamed from: m0 */
                    public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                        C10001b c10001b2 = c10001b;
                        float fFloatValue = f30.floatValue();
                        C5207g.m11111f(c10001b2, "$this$set");
                        c10001b2.f50832p = fFloatValue;
                        c10001b2.f50833q = true;
                        c10001b2.m18593c();
                        return C9072e.f47360a;
                    }
                });
                C8573r0.m16714a1(composerImplMo1636j, list2, new InterfaceC2056p<C10001b, List<? extends AbstractC10003d>, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$9
                    @Override // cm.InterfaceC2056p
                    /* JADX INFO: renamed from: m0 */
                    public final C9072e mo1337m0(C10001b c10001b, List<? extends AbstractC10003d> list4) {
                        C10001b c10001b2 = c10001b;
                        List<? extends AbstractC10003d> list5 = list4;
                        C5207g.m11111f(c10001b2, "$this$set");
                        C5207g.m11111f(list5, "it");
                        c10001b2.f50820d = list5;
                        c10001b2.f50821e = true;
                        c10001b2.m18593c();
                        return C9072e.f47360a;
                    }
                });
                interfaceC2056p.mo1337m0(composerImplMo1636j, Integer.valueOf((i12 >> 27) & 14));
                composerImplMo1636j.m1609Q(true);
                composerImplMo1636j.m1609Q(false);
                f23 = f19;
                f24 = f22;
                f25 = f20;
                f26 = f21;
                f27 = f17;
                list3 = list2;
                f28 = f18;
                f29 = f16;
            }
            c5332q0M1612T = composerImplMo1636j.m1612T();
            if (c5332q0M1612T == null) {
                return;
            }
            c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // cm.InterfaceC2056p
                /* JADX INFO: renamed from: m0 */
                public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                    num.intValue();
                    VectorComposeKt.m2005a(str2, f28, f23, f29, f27, f25, f26, f24, list3, interfaceC2056p, interfaceC0476a2, C8573r0.m16737l1(i10 | 1), i11);
                    return C9072e.f47360a;
                }
            };
        }
        i12 |= 24576;
        f17 = f12;
        i19 = i11 & 32;
        if (i19 != 0) {
            i12 |= 196608;
        } else if ((i10 & 458752) == 0) {
            if (composerImplMo1636j.m1592D(f13)) {
                i20 = 131072;
            } else {
                i20 = 65536;
            }
            i12 |= i20;
        }
        i21 = i11 & 64;
        if (i21 != 0) {
            i12 |= 1572864;
        } else if ((i10 & 3670016) == 0) {
            if (composerImplMo1636j.m1592D(f14)) {
                i22 = 1048576;
            } else {
                i22 = 524288;
            }
            i12 |= i22;
        }
        i23 = i11 & BuildConfig.SDK_TRUNCATE_LENGTH;
        if (i23 != 0) {
            i12 |= 12582912;
        } else if ((i10 & 29360128) == 0) {
            if (composerImplMo1636j.m1592D(f15)) {
                i24 = 8388608;
            } else {
                i24 = 4194304;
            }
            i12 |= i24;
        }
        i25 = i11 & 256;
        if (i25 != 0) {
            i12 |= 33554432;
        }
        if ((i11 & 512) != 0) {
            if ((1879048192 & i10) == 0) {
                if (composerImplMo1636j.m1600H(interfaceC2056p)) {
                    i26 = 536870912;
                } else {
                    i26 = 268435456;
                }
            }
            if (i25 != 256) {
                composerImplMo1636j.m1654s0();
                if ((i10 & 1) != 0) {
                    if (i27 != 0) {
                        str2 = "";
                    } else {
                        str2 = str;
                    }
                    if (i28 != 0) {
                        f18 = 0.0f;
                    } else {
                        f18 = f3;
                    }
                    if (i13 != 0) {
                        f19 = 0.0f;
                    } else {
                        f19 = f10;
                    }
                    if (i15 != 0) {
                        f16 = 0.0f;
                    }
                    if (i17 != 0) {
                        f17 = 1.0f;
                    }
                    if (i19 == 0) {
                    }
                    if (i21 != 0) {
                        f21 = 0.0f;
                    } else {
                        f21 = f14;
                    }
                    if (i23 == 0) {
                    }
                    if (i25 != 0) {
                        list2 = C10009j.f50944a;
                        i12 &= -234881025;
                    } else {
                        list2 = list;
                    }
                } else {
                    if (i27 != 0) {
                        str2 = "";
                    } else {
                        str2 = str;
                    }
                    if (i28 != 0) {
                        f18 = 0.0f;
                    } else {
                        f18 = f3;
                    }
                    if (i13 != 0) {
                        f19 = 0.0f;
                    } else {
                        f19 = f10;
                    }
                    if (i15 != 0) {
                        f16 = 0.0f;
                    }
                    if (i17 != 0) {
                        f17 = 1.0f;
                    }
                    if (i19 == 0) {
                    }
                    if (i21 != 0) {
                        f21 = 0.0f;
                    } else {
                        f21 = f14;
                    }
                    if (i23 == 0) {
                    }
                    if (i25 != 0) {
                        list2 = C10009j.f50944a;
                        i12 &= -234881025;
                    } else {
                        list2 = list;
                    }
                }
                composerImplMo1636j.m1610R();
                InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q1111111 = ComposerKt.f3003a;
                vectorComposeKt$Group$1 = new InterfaceC2041a<C10001b>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$1
                    @Override // cm.InterfaceC2041a
                    /* JADX INFO: renamed from: E */
                    public final C10001b mo807E() {
                        return new C10001b();
                    }
                };
                composerImplMo1636j.mo1622c(-548224868);
                if (composerImplMo1636j.f2910a instanceof C10006g) {
                    C8573r0.m16771y0();
                    throw null;
                }
                composerImplMo1636j.m1658u0();
                if (composerImplMo1636j.f2897L) {
                    composerImplMo1636j.mo1634i(vectorComposeKt$Group$1);
                } else {
                    composerImplMo1636j.mo1653s();
                }
                C8573r0.m16714a1(composerImplMo1636j, str2, new InterfaceC2056p<C10001b, String, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$1
                    @Override // cm.InterfaceC2056p
                    /* JADX INFO: renamed from: m0 */
                    public final C9072e mo1337m0(C10001b c10001b, String str3) {
                        C10001b c10001b2 = c10001b;
                        String str4 = str3;
                        C5207g.m11111f(c10001b2, "$this$set");
                        C5207g.m11111f(str4, "it");
                        c10001b2.f50825i = str4;
                        c10001b2.m18593c();
                        return C9072e.f47360a;
                    }
                });
                C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f18), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$2
                    @Override // cm.InterfaceC2056p
                    /* JADX INFO: renamed from: m0 */
                    public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                        C10001b c10001b2 = c10001b;
                        float fFloatValue = f30.floatValue();
                        C5207g.m11111f(c10001b2, "$this$set");
                        c10001b2.f50826j = fFloatValue;
                        c10001b2.f50833q = true;
                        c10001b2.m18593c();
                        return C9072e.f47360a;
                    }
                });
                C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f19), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$3
                    @Override // cm.InterfaceC2056p
                    /* JADX INFO: renamed from: m0 */
                    public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                        C10001b c10001b2 = c10001b;
                        float fFloatValue = f30.floatValue();
                        C5207g.m11111f(c10001b2, "$this$set");
                        c10001b2.f50827k = fFloatValue;
                        c10001b2.f50833q = true;
                        c10001b2.m18593c();
                        return C9072e.f47360a;
                    }
                });
                C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f16), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$4
                    @Override // cm.InterfaceC2056p
                    /* JADX INFO: renamed from: m0 */
                    public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                        C10001b c10001b2 = c10001b;
                        float fFloatValue = f30.floatValue();
                        C5207g.m11111f(c10001b2, "$this$set");
                        c10001b2.f50828l = fFloatValue;
                        c10001b2.f50833q = true;
                        c10001b2.m18593c();
                        return C9072e.f47360a;
                    }
                });
                C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f17), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$5
                    @Override // cm.InterfaceC2056p
                    /* JADX INFO: renamed from: m0 */
                    public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                        C10001b c10001b2 = c10001b;
                        float fFloatValue = f30.floatValue();
                        C5207g.m11111f(c10001b2, "$this$set");
                        c10001b2.f50829m = fFloatValue;
                        c10001b2.f50833q = true;
                        c10001b2.m18593c();
                        return C9072e.f47360a;
                    }
                });
                C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f20), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$6
                    @Override // cm.InterfaceC2056p
                    /* JADX INFO: renamed from: m0 */
                    public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                        C10001b c10001b2 = c10001b;
                        float fFloatValue = f30.floatValue();
                        C5207g.m11111f(c10001b2, "$this$set");
                        c10001b2.f50830n = fFloatValue;
                        c10001b2.f50833q = true;
                        c10001b2.m18593c();
                        return C9072e.f47360a;
                    }
                });
                C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f21), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$7
                    @Override // cm.InterfaceC2056p
                    /* JADX INFO: renamed from: m0 */
                    public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                        C10001b c10001b2 = c10001b;
                        float fFloatValue = f30.floatValue();
                        C5207g.m11111f(c10001b2, "$this$set");
                        c10001b2.f50831o = fFloatValue;
                        c10001b2.f50833q = true;
                        c10001b2.m18593c();
                        return C9072e.f47360a;
                    }
                });
                C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f22), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$8
                    @Override // cm.InterfaceC2056p
                    /* JADX INFO: renamed from: m0 */
                    public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                        C10001b c10001b2 = c10001b;
                        float fFloatValue = f30.floatValue();
                        C5207g.m11111f(c10001b2, "$this$set");
                        c10001b2.f50832p = fFloatValue;
                        c10001b2.f50833q = true;
                        c10001b2.m18593c();
                        return C9072e.f47360a;
                    }
                });
                C8573r0.m16714a1(composerImplMo1636j, list2, new InterfaceC2056p<C10001b, List<? extends AbstractC10003d>, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$9
                    @Override // cm.InterfaceC2056p
                    /* JADX INFO: renamed from: m0 */
                    public final C9072e mo1337m0(C10001b c10001b, List<? extends AbstractC10003d> list4) {
                        C10001b c10001b2 = c10001b;
                        List<? extends AbstractC10003d> list5 = list4;
                        C5207g.m11111f(c10001b2, "$this$set");
                        C5207g.m11111f(list5, "it");
                        c10001b2.f50820d = list5;
                        c10001b2.f50821e = true;
                        c10001b2.m18593c();
                        return C9072e.f47360a;
                    }
                });
                interfaceC2056p.mo1337m0(composerImplMo1636j, Integer.valueOf((i12 >> 27) & 14));
                composerImplMo1636j.m1609Q(true);
                composerImplMo1636j.m1609Q(false);
                f23 = f19;
                f24 = f22;
                f25 = f20;
                f26 = f21;
                f27 = f17;
                list3 = list2;
                f28 = f18;
                f29 = f16;
            } else {
                composerImplMo1636j.m1654s0();
                if ((i10 & 1) != 0) {
                    if (i27 != 0) {
                        str2 = "";
                    } else {
                        str2 = str;
                    }
                    if (i28 != 0) {
                        f18 = 0.0f;
                    } else {
                        f18 = f3;
                    }
                    if (i13 != 0) {
                        f19 = 0.0f;
                    } else {
                        f19 = f10;
                    }
                    if (i15 != 0) {
                        f16 = 0.0f;
                    }
                    if (i17 != 0) {
                        f17 = 1.0f;
                    }
                    if (i19 == 0) {
                    }
                    if (i21 != 0) {
                        f21 = 0.0f;
                    } else {
                        f21 = f14;
                    }
                    if (i23 == 0) {
                    }
                    if (i25 != 0) {
                        list2 = C10009j.f50944a;
                        i12 &= -234881025;
                    } else {
                        list2 = list;
                    }
                } else {
                    if (i27 != 0) {
                        str2 = "";
                    } else {
                        str2 = str;
                    }
                    if (i28 != 0) {
                        f18 = 0.0f;
                    } else {
                        f18 = f3;
                    }
                    if (i13 != 0) {
                        f19 = 0.0f;
                    } else {
                        f19 = f10;
                    }
                    if (i15 != 0) {
                        f16 = 0.0f;
                    }
                    if (i17 != 0) {
                        f17 = 1.0f;
                    }
                    if (i19 == 0) {
                    }
                    if (i21 != 0) {
                        f21 = 0.0f;
                    } else {
                        f21 = f14;
                    }
                    if (i23 == 0) {
                    }
                    if (i25 != 0) {
                        list2 = C10009j.f50944a;
                        i12 &= -234881025;
                    } else {
                        list2 = list;
                    }
                }
                composerImplMo1636j.m1610R();
                InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q1111112 = ComposerKt.f3003a;
                vectorComposeKt$Group$1 = new InterfaceC2041a<C10001b>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$1
                    @Override // cm.InterfaceC2041a
                    /* JADX INFO: renamed from: E */
                    public final C10001b mo807E() {
                        return new C10001b();
                    }
                };
                composerImplMo1636j.mo1622c(-548224868);
                if (composerImplMo1636j.f2910a instanceof C10006g) {
                    C8573r0.m16771y0();
                    throw null;
                }
                composerImplMo1636j.m1658u0();
                if (composerImplMo1636j.f2897L) {
                    composerImplMo1636j.mo1634i(vectorComposeKt$Group$1);
                } else {
                    composerImplMo1636j.mo1653s();
                }
                C8573r0.m16714a1(composerImplMo1636j, str2, new InterfaceC2056p<C10001b, String, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$1
                    @Override // cm.InterfaceC2056p
                    /* JADX INFO: renamed from: m0 */
                    public final C9072e mo1337m0(C10001b c10001b, String str3) {
                        C10001b c10001b2 = c10001b;
                        String str4 = str3;
                        C5207g.m11111f(c10001b2, "$this$set");
                        C5207g.m11111f(str4, "it");
                        c10001b2.f50825i = str4;
                        c10001b2.m18593c();
                        return C9072e.f47360a;
                    }
                });
                C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f18), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$2
                    @Override // cm.InterfaceC2056p
                    /* JADX INFO: renamed from: m0 */
                    public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                        C10001b c10001b2 = c10001b;
                        float fFloatValue = f30.floatValue();
                        C5207g.m11111f(c10001b2, "$this$set");
                        c10001b2.f50826j = fFloatValue;
                        c10001b2.f50833q = true;
                        c10001b2.m18593c();
                        return C9072e.f47360a;
                    }
                });
                C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f19), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$3
                    @Override // cm.InterfaceC2056p
                    /* JADX INFO: renamed from: m0 */
                    public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                        C10001b c10001b2 = c10001b;
                        float fFloatValue = f30.floatValue();
                        C5207g.m11111f(c10001b2, "$this$set");
                        c10001b2.f50827k = fFloatValue;
                        c10001b2.f50833q = true;
                        c10001b2.m18593c();
                        return C9072e.f47360a;
                    }
                });
                C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f16), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$4
                    @Override // cm.InterfaceC2056p
                    /* JADX INFO: renamed from: m0 */
                    public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                        C10001b c10001b2 = c10001b;
                        float fFloatValue = f30.floatValue();
                        C5207g.m11111f(c10001b2, "$this$set");
                        c10001b2.f50828l = fFloatValue;
                        c10001b2.f50833q = true;
                        c10001b2.m18593c();
                        return C9072e.f47360a;
                    }
                });
                C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f17), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$5
                    @Override // cm.InterfaceC2056p
                    /* JADX INFO: renamed from: m0 */
                    public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                        C10001b c10001b2 = c10001b;
                        float fFloatValue = f30.floatValue();
                        C5207g.m11111f(c10001b2, "$this$set");
                        c10001b2.f50829m = fFloatValue;
                        c10001b2.f50833q = true;
                        c10001b2.m18593c();
                        return C9072e.f47360a;
                    }
                });
                C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f20), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$6
                    @Override // cm.InterfaceC2056p
                    /* JADX INFO: renamed from: m0 */
                    public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                        C10001b c10001b2 = c10001b;
                        float fFloatValue = f30.floatValue();
                        C5207g.m11111f(c10001b2, "$this$set");
                        c10001b2.f50830n = fFloatValue;
                        c10001b2.f50833q = true;
                        c10001b2.m18593c();
                        return C9072e.f47360a;
                    }
                });
                C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f21), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$7
                    @Override // cm.InterfaceC2056p
                    /* JADX INFO: renamed from: m0 */
                    public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                        C10001b c10001b2 = c10001b;
                        float fFloatValue = f30.floatValue();
                        C5207g.m11111f(c10001b2, "$this$set");
                        c10001b2.f50831o = fFloatValue;
                        c10001b2.f50833q = true;
                        c10001b2.m18593c();
                        return C9072e.f47360a;
                    }
                });
                C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f22), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$8
                    @Override // cm.InterfaceC2056p
                    /* JADX INFO: renamed from: m0 */
                    public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                        C10001b c10001b2 = c10001b;
                        float fFloatValue = f30.floatValue();
                        C5207g.m11111f(c10001b2, "$this$set");
                        c10001b2.f50832p = fFloatValue;
                        c10001b2.f50833q = true;
                        c10001b2.m18593c();
                        return C9072e.f47360a;
                    }
                });
                C8573r0.m16714a1(composerImplMo1636j, list2, new InterfaceC2056p<C10001b, List<? extends AbstractC10003d>, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$9
                    @Override // cm.InterfaceC2056p
                    /* JADX INFO: renamed from: m0 */
                    public final C9072e mo1337m0(C10001b c10001b, List<? extends AbstractC10003d> list4) {
                        C10001b c10001b2 = c10001b;
                        List<? extends AbstractC10003d> list5 = list4;
                        C5207g.m11111f(c10001b2, "$this$set");
                        C5207g.m11111f(list5, "it");
                        c10001b2.f50820d = list5;
                        c10001b2.f50821e = true;
                        c10001b2.m18593c();
                        return C9072e.f47360a;
                    }
                });
                interfaceC2056p.mo1337m0(composerImplMo1636j, Integer.valueOf((i12 >> 27) & 14));
                composerImplMo1636j.m1609Q(true);
                composerImplMo1636j.m1609Q(false);
                f23 = f19;
                f24 = f22;
                f25 = f20;
                f26 = f21;
                f27 = f17;
                list3 = list2;
                f28 = f18;
                f29 = f16;
            }
            c5332q0M1612T = composerImplMo1636j.m1612T();
            if (c5332q0M1612T == null) {
                return;
            }
            c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // cm.InterfaceC2056p
                /* JADX INFO: renamed from: m0 */
                public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                    num.intValue();
                    VectorComposeKt.m2005a(str2, f28, f23, f29, f27, f25, f26, f24, list3, interfaceC2056p, interfaceC0476a2, C8573r0.m16737l1(i10 | 1), i11);
                    return C9072e.f47360a;
                }
            };
        }
        i26 = 805306368;
        i12 |= i26;
        if (i25 != 256) {
            composerImplMo1636j.m1654s0();
            if ((i10 & 1) != 0) {
                if (i27 != 0) {
                    str2 = "";
                } else {
                    str2 = str;
                }
                if (i28 != 0) {
                    f18 = 0.0f;
                } else {
                    f18 = f3;
                }
                if (i13 != 0) {
                    f19 = 0.0f;
                } else {
                    f19 = f10;
                }
                if (i15 != 0) {
                    f16 = 0.0f;
                }
                if (i17 != 0) {
                    f17 = 1.0f;
                }
                if (i19 == 0) {
                }
                if (i21 != 0) {
                    f21 = 0.0f;
                } else {
                    f21 = f14;
                }
                if (i23 == 0) {
                }
                if (i25 != 0) {
                    list2 = C10009j.f50944a;
                    i12 &= -234881025;
                } else {
                    list2 = list;
                }
            } else {
                if (i27 != 0) {
                    str2 = "";
                } else {
                    str2 = str;
                }
                if (i28 != 0) {
                    f18 = 0.0f;
                } else {
                    f18 = f3;
                }
                if (i13 != 0) {
                    f19 = 0.0f;
                } else {
                    f19 = f10;
                }
                if (i15 != 0) {
                    f16 = 0.0f;
                }
                if (i17 != 0) {
                    f17 = 1.0f;
                }
                if (i19 == 0) {
                }
                if (i21 != 0) {
                    f21 = 0.0f;
                } else {
                    f21 = f14;
                }
                if (i23 == 0) {
                }
                if (i25 != 0) {
                    list2 = C10009j.f50944a;
                    i12 &= -234881025;
                } else {
                    list2 = list;
                }
            }
            composerImplMo1636j.m1610R();
            InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q1111113 = ComposerKt.f3003a;
            vectorComposeKt$Group$1 = new InterfaceC2041a<C10001b>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$1
                @Override // cm.InterfaceC2041a
                /* JADX INFO: renamed from: E */
                public final C10001b mo807E() {
                    return new C10001b();
                }
            };
            composerImplMo1636j.mo1622c(-548224868);
            if (composerImplMo1636j.f2910a instanceof C10006g) {
                C8573r0.m16771y0();
                throw null;
            }
            composerImplMo1636j.m1658u0();
            if (composerImplMo1636j.f2897L) {
                composerImplMo1636j.mo1634i(vectorComposeKt$Group$1);
            } else {
                composerImplMo1636j.mo1653s();
            }
            C8573r0.m16714a1(composerImplMo1636j, str2, new InterfaceC2056p<C10001b, String, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$1
                @Override // cm.InterfaceC2056p
                /* JADX INFO: renamed from: m0 */
                public final C9072e mo1337m0(C10001b c10001b, String str3) {
                    C10001b c10001b2 = c10001b;
                    String str4 = str3;
                    C5207g.m11111f(c10001b2, "$this$set");
                    C5207g.m11111f(str4, "it");
                    c10001b2.f50825i = str4;
                    c10001b2.m18593c();
                    return C9072e.f47360a;
                }
            });
            C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f18), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$2
                @Override // cm.InterfaceC2056p
                /* JADX INFO: renamed from: m0 */
                public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                    C10001b c10001b2 = c10001b;
                    float fFloatValue = f30.floatValue();
                    C5207g.m11111f(c10001b2, "$this$set");
                    c10001b2.f50826j = fFloatValue;
                    c10001b2.f50833q = true;
                    c10001b2.m18593c();
                    return C9072e.f47360a;
                }
            });
            C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f19), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$3
                @Override // cm.InterfaceC2056p
                /* JADX INFO: renamed from: m0 */
                public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                    C10001b c10001b2 = c10001b;
                    float fFloatValue = f30.floatValue();
                    C5207g.m11111f(c10001b2, "$this$set");
                    c10001b2.f50827k = fFloatValue;
                    c10001b2.f50833q = true;
                    c10001b2.m18593c();
                    return C9072e.f47360a;
                }
            });
            C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f16), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$4
                @Override // cm.InterfaceC2056p
                /* JADX INFO: renamed from: m0 */
                public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                    C10001b c10001b2 = c10001b;
                    float fFloatValue = f30.floatValue();
                    C5207g.m11111f(c10001b2, "$this$set");
                    c10001b2.f50828l = fFloatValue;
                    c10001b2.f50833q = true;
                    c10001b2.m18593c();
                    return C9072e.f47360a;
                }
            });
            C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f17), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$5
                @Override // cm.InterfaceC2056p
                /* JADX INFO: renamed from: m0 */
                public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                    C10001b c10001b2 = c10001b;
                    float fFloatValue = f30.floatValue();
                    C5207g.m11111f(c10001b2, "$this$set");
                    c10001b2.f50829m = fFloatValue;
                    c10001b2.f50833q = true;
                    c10001b2.m18593c();
                    return C9072e.f47360a;
                }
            });
            C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f20), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$6
                @Override // cm.InterfaceC2056p
                /* JADX INFO: renamed from: m0 */
                public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                    C10001b c10001b2 = c10001b;
                    float fFloatValue = f30.floatValue();
                    C5207g.m11111f(c10001b2, "$this$set");
                    c10001b2.f50830n = fFloatValue;
                    c10001b2.f50833q = true;
                    c10001b2.m18593c();
                    return C9072e.f47360a;
                }
            });
            C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f21), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$7
                @Override // cm.InterfaceC2056p
                /* JADX INFO: renamed from: m0 */
                public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                    C10001b c10001b2 = c10001b;
                    float fFloatValue = f30.floatValue();
                    C5207g.m11111f(c10001b2, "$this$set");
                    c10001b2.f50831o = fFloatValue;
                    c10001b2.f50833q = true;
                    c10001b2.m18593c();
                    return C9072e.f47360a;
                }
            });
            C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f22), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$8
                @Override // cm.InterfaceC2056p
                /* JADX INFO: renamed from: m0 */
                public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                    C10001b c10001b2 = c10001b;
                    float fFloatValue = f30.floatValue();
                    C5207g.m11111f(c10001b2, "$this$set");
                    c10001b2.f50832p = fFloatValue;
                    c10001b2.f50833q = true;
                    c10001b2.m18593c();
                    return C9072e.f47360a;
                }
            });
            C8573r0.m16714a1(composerImplMo1636j, list2, new InterfaceC2056p<C10001b, List<? extends AbstractC10003d>, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$9
                @Override // cm.InterfaceC2056p
                /* JADX INFO: renamed from: m0 */
                public final C9072e mo1337m0(C10001b c10001b, List<? extends AbstractC10003d> list4) {
                    C10001b c10001b2 = c10001b;
                    List<? extends AbstractC10003d> list5 = list4;
                    C5207g.m11111f(c10001b2, "$this$set");
                    C5207g.m11111f(list5, "it");
                    c10001b2.f50820d = list5;
                    c10001b2.f50821e = true;
                    c10001b2.m18593c();
                    return C9072e.f47360a;
                }
            });
            interfaceC2056p.mo1337m0(composerImplMo1636j, Integer.valueOf((i12 >> 27) & 14));
            composerImplMo1636j.m1609Q(true);
            composerImplMo1636j.m1609Q(false);
            f23 = f19;
            f24 = f22;
            f25 = f20;
            f26 = f21;
            f27 = f17;
            list3 = list2;
            f28 = f18;
            f29 = f16;
        } else {
            composerImplMo1636j.m1654s0();
            if ((i10 & 1) != 0) {
                if (i27 != 0) {
                    str2 = "";
                } else {
                    str2 = str;
                }
                if (i28 != 0) {
                    f18 = 0.0f;
                } else {
                    f18 = f3;
                }
                if (i13 != 0) {
                    f19 = 0.0f;
                } else {
                    f19 = f10;
                }
                if (i15 != 0) {
                    f16 = 0.0f;
                }
                if (i17 != 0) {
                    f17 = 1.0f;
                }
                if (i19 == 0) {
                }
                if (i21 != 0) {
                    f21 = 0.0f;
                } else {
                    f21 = f14;
                }
                if (i23 == 0) {
                }
                if (i25 != 0) {
                    list2 = C10009j.f50944a;
                    i12 &= -234881025;
                } else {
                    list2 = list;
                }
            } else {
                if (i27 != 0) {
                    str2 = "";
                } else {
                    str2 = str;
                }
                if (i28 != 0) {
                    f18 = 0.0f;
                } else {
                    f18 = f3;
                }
                if (i13 != 0) {
                    f19 = 0.0f;
                } else {
                    f19 = f10;
                }
                if (i15 != 0) {
                    f16 = 0.0f;
                }
                if (i17 != 0) {
                    f17 = 1.0f;
                }
                if (i19 == 0) {
                }
                if (i21 != 0) {
                    f21 = 0.0f;
                } else {
                    f21 = f14;
                }
                if (i23 == 0) {
                }
                if (i25 != 0) {
                    list2 = C10009j.f50944a;
                    i12 &= -234881025;
                } else {
                    list2 = list;
                }
            }
            composerImplMo1636j.m1610R();
            InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q1111114 = ComposerKt.f3003a;
            vectorComposeKt$Group$1 = new InterfaceC2041a<C10001b>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$1
                @Override // cm.InterfaceC2041a
                /* JADX INFO: renamed from: E */
                public final C10001b mo807E() {
                    return new C10001b();
                }
            };
            composerImplMo1636j.mo1622c(-548224868);
            if (composerImplMo1636j.f2910a instanceof C10006g) {
                C8573r0.m16771y0();
                throw null;
            }
            composerImplMo1636j.m1658u0();
            if (composerImplMo1636j.f2897L) {
                composerImplMo1636j.mo1634i(vectorComposeKt$Group$1);
            } else {
                composerImplMo1636j.mo1653s();
            }
            C8573r0.m16714a1(composerImplMo1636j, str2, new InterfaceC2056p<C10001b, String, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$1
                @Override // cm.InterfaceC2056p
                /* JADX INFO: renamed from: m0 */
                public final C9072e mo1337m0(C10001b c10001b, String str3) {
                    C10001b c10001b2 = c10001b;
                    String str4 = str3;
                    C5207g.m11111f(c10001b2, "$this$set");
                    C5207g.m11111f(str4, "it");
                    c10001b2.f50825i = str4;
                    c10001b2.m18593c();
                    return C9072e.f47360a;
                }
            });
            C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f18), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$2
                @Override // cm.InterfaceC2056p
                /* JADX INFO: renamed from: m0 */
                public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                    C10001b c10001b2 = c10001b;
                    float fFloatValue = f30.floatValue();
                    C5207g.m11111f(c10001b2, "$this$set");
                    c10001b2.f50826j = fFloatValue;
                    c10001b2.f50833q = true;
                    c10001b2.m18593c();
                    return C9072e.f47360a;
                }
            });
            C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f19), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$3
                @Override // cm.InterfaceC2056p
                /* JADX INFO: renamed from: m0 */
                public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                    C10001b c10001b2 = c10001b;
                    float fFloatValue = f30.floatValue();
                    C5207g.m11111f(c10001b2, "$this$set");
                    c10001b2.f50827k = fFloatValue;
                    c10001b2.f50833q = true;
                    c10001b2.m18593c();
                    return C9072e.f47360a;
                }
            });
            C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f16), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$4
                @Override // cm.InterfaceC2056p
                /* JADX INFO: renamed from: m0 */
                public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                    C10001b c10001b2 = c10001b;
                    float fFloatValue = f30.floatValue();
                    C5207g.m11111f(c10001b2, "$this$set");
                    c10001b2.f50828l = fFloatValue;
                    c10001b2.f50833q = true;
                    c10001b2.m18593c();
                    return C9072e.f47360a;
                }
            });
            C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f17), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$5
                @Override // cm.InterfaceC2056p
                /* JADX INFO: renamed from: m0 */
                public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                    C10001b c10001b2 = c10001b;
                    float fFloatValue = f30.floatValue();
                    C5207g.m11111f(c10001b2, "$this$set");
                    c10001b2.f50829m = fFloatValue;
                    c10001b2.f50833q = true;
                    c10001b2.m18593c();
                    return C9072e.f47360a;
                }
            });
            C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f20), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$6
                @Override // cm.InterfaceC2056p
                /* JADX INFO: renamed from: m0 */
                public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                    C10001b c10001b2 = c10001b;
                    float fFloatValue = f30.floatValue();
                    C5207g.m11111f(c10001b2, "$this$set");
                    c10001b2.f50830n = fFloatValue;
                    c10001b2.f50833q = true;
                    c10001b2.m18593c();
                    return C9072e.f47360a;
                }
            });
            C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f21), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$7
                @Override // cm.InterfaceC2056p
                /* JADX INFO: renamed from: m0 */
                public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                    C10001b c10001b2 = c10001b;
                    float fFloatValue = f30.floatValue();
                    C5207g.m11111f(c10001b2, "$this$set");
                    c10001b2.f50831o = fFloatValue;
                    c10001b2.f50833q = true;
                    c10001b2.m18593c();
                    return C9072e.f47360a;
                }
            });
            C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f22), new InterfaceC2056p<C10001b, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$8
                @Override // cm.InterfaceC2056p
                /* JADX INFO: renamed from: m0 */
                public final C9072e mo1337m0(C10001b c10001b, Float f30) {
                    C10001b c10001b2 = c10001b;
                    float fFloatValue = f30.floatValue();
                    C5207g.m11111f(c10001b2, "$this$set");
                    c10001b2.f50832p = fFloatValue;
                    c10001b2.f50833q = true;
                    c10001b2.m18593c();
                    return C9072e.f47360a;
                }
            });
            C8573r0.m16714a1(composerImplMo1636j, list2, new InterfaceC2056p<C10001b, List<? extends AbstractC10003d>, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$9
                @Override // cm.InterfaceC2056p
                /* JADX INFO: renamed from: m0 */
                public final C9072e mo1337m0(C10001b c10001b, List<? extends AbstractC10003d> list4) {
                    C10001b c10001b2 = c10001b;
                    List<? extends AbstractC10003d> list5 = list4;
                    C5207g.m11111f(c10001b2, "$this$set");
                    C5207g.m11111f(list5, "it");
                    c10001b2.f50820d = list5;
                    c10001b2.f50821e = true;
                    c10001b2.m18593c();
                    return C9072e.f47360a;
                }
            });
            interfaceC2056p.mo1337m0(composerImplMo1636j, Integer.valueOf((i12 >> 27) & 14));
            composerImplMo1636j.m1609Q(true);
            composerImplMo1636j.m1609Q(false);
            f23 = f19;
            f24 = f22;
            f25 = f20;
            f26 = f21;
            f27 = f17;
            list3 = list2;
            f28 = f18;
            f29 = f16;
        }
        c5332q0M1612T = composerImplMo1636j.m1612T();
        if (c5332q0M1612T == null) {
            return;
        }
        c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // cm.InterfaceC2056p
            /* JADX INFO: renamed from: m0 */
            public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                num.intValue();
                VectorComposeKt.m2005a(str2, f28, f23, f29, f27, f25, f26, f24, list3, interfaceC2056p, interfaceC0476a2, C8573r0.m16737l1(i10 | 1), i11);
                return C9072e.f47360a;
            }
        };
    }

    /* JADX INFO: renamed from: b */
    public static final void m2006b(final List<? extends AbstractC10003d> list, int i10, String str, AbstractC9161o abstractC9161o, float f3, AbstractC9161o abstractC9161o2, float f10, float f11, int i11, int i12, float f12, float f13, float f14, float f15, InterfaceC0476a interfaceC0476a, final int i13, final int i14, final int i15) {
        final int i16;
        int i17;
        int i18;
        C5207g.m11111f(list, "pathData");
        ComposerImpl composerImplMo1636j = interfaceC0476a.mo1636j(-1478270750);
        if ((i15 & 2) != 0) {
            EmptyList emptyList = C10009j.f50944a;
            i16 = 0;
        } else {
            i16 = i10;
        }
        String str2 = (i15 & 4) != 0 ? "" : str;
        AbstractC9161o abstractC9161o3 = (i15 & 8) != 0 ? null : abstractC9161o;
        float f16 = (i15 & 16) != 0 ? 1.0f : f3;
        AbstractC9161o abstractC9161o4 = (i15 & 32) != 0 ? null : abstractC9161o2;
        float f17 = (i15 & 64) != 0 ? 1.0f : f10;
        float f18 = (i15 & BuildConfig.SDK_TRUNCATE_LENGTH) != 0 ? 0.0f : f11;
        if ((i15 & 256) != 0) {
            EmptyList emptyList2 = C10009j.f50944a;
            i17 = 0;
        } else {
            i17 = i11;
        }
        if ((i15 & 512) != 0) {
            EmptyList emptyList3 = C10009j.f50944a;
            i18 = 0;
        } else {
            i18 = i12;
        }
        float f19 = (i15 & 1024) != 0 ? 4.0f : f12;
        float f20 = (i15 & 2048) != 0 ? 0.0f : f13;
        float f21 = (i15 & 4096) != 0 ? 1.0f : f14;
        float f22 = (i15 & 8192) != 0 ? 0.0f : f15;
        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q = ComposerKt.f3003a;
        final VectorComposeKt$Path$1 vectorComposeKt$Path$1 = new InterfaceC2041a<PathComponent>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$1
            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final PathComponent mo807E() {
                return new PathComponent();
            }
        };
        composerImplMo1636j.mo1622c(1886828752);
        if (!(composerImplMo1636j.f2910a instanceof C10006g)) {
            C8573r0.m16771y0();
            throw null;
        }
        composerImplMo1636j.m1658u0();
        if (composerImplMo1636j.f2897L) {
            composerImplMo1636j.mo1634i(new InterfaceC2041a<PathComponent>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path-9cdaXJ4$$inlined$ComposeNode$1
                {
                    super(0);
                }

                /* JADX WARN: Type inference failed for: r3v1, types: [androidx.compose.ui.graphics.vector.PathComponent, java.lang.Object] */
                @Override // cm.InterfaceC2041a
                /* JADX INFO: renamed from: E */
                public final PathComponent mo807E() {
                    return vectorComposeKt$Path$1.mo807E();
                }
            });
        } else {
            composerImplMo1636j.mo1653s();
        }
        C8573r0.m16714a1(composerImplMo1636j, str2, new InterfaceC2056p<PathComponent, String, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$1
            @Override // cm.InterfaceC2056p
            /* JADX INFO: renamed from: m0 */
            public final C9072e mo1337m0(PathComponent pathComponent, String str3) {
                PathComponent pathComponent2 = pathComponent;
                C5207g.m11111f(pathComponent2, "$this$set");
                C5207g.m11111f(str3, "it");
                pathComponent2.m18593c();
                return C9072e.f47360a;
            }
        });
        C8573r0.m16714a1(composerImplMo1636j, list, new InterfaceC2056p<PathComponent, List<? extends AbstractC10003d>, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$2
            @Override // cm.InterfaceC2056p
            /* JADX INFO: renamed from: m0 */
            public final C9072e mo1337m0(PathComponent pathComponent, List<? extends AbstractC10003d> list2) {
                PathComponent pathComponent2 = pathComponent;
                List<? extends AbstractC10003d> list3 = list2;
                C5207g.m11111f(pathComponent2, "$this$set");
                C5207g.m11111f(list3, "it");
                pathComponent2.f3451d = list3;
                pathComponent2.f3461n = true;
                pathComponent2.m18593c();
                return C9072e.f47360a;
            }
        });
        C8573r0.m16714a1(composerImplMo1636j, new C9140d0(i16), new InterfaceC2056p<PathComponent, C9140d0, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$3
            @Override // cm.InterfaceC2056p
            /* JADX INFO: renamed from: m0 */
            public final C9072e mo1337m0(PathComponent pathComponent, C9140d0 c9140d0) {
                PathComponent pathComponent2 = pathComponent;
                int i19 = c9140d0.f47647a;
                C5207g.m11111f(pathComponent2, "$this$set");
                C9151j c9151j = pathComponent2.f3466s;
                c9151j.getClass();
                boolean z10 = true;
                if (i19 != 1) {
                    z10 = false;
                }
                c9151j.f47676a.setFillType(z10 ? Path.FillType.EVEN_ODD : Path.FillType.WINDING);
                pathComponent2.m18593c();
                return C9072e.f47360a;
            }
        });
        C8573r0.m16714a1(composerImplMo1636j, abstractC9161o3, new InterfaceC2056p<PathComponent, AbstractC9161o, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$4
            @Override // cm.InterfaceC2056p
            /* JADX INFO: renamed from: m0 */
            public final C9072e mo1337m0(PathComponent pathComponent, AbstractC9161o abstractC9161o5) {
                PathComponent pathComponent2 = pathComponent;
                C5207g.m11111f(pathComponent2, "$this$set");
                pathComponent2.f3449b = abstractC9161o5;
                pathComponent2.m18593c();
                return C9072e.f47360a;
            }
        });
        C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f16), new InterfaceC2056p<PathComponent, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$5
            @Override // cm.InterfaceC2056p
            /* JADX INFO: renamed from: m0 */
            public final C9072e mo1337m0(PathComponent pathComponent, Float f23) {
                PathComponent pathComponent2 = pathComponent;
                float fFloatValue = f23.floatValue();
                C5207g.m11111f(pathComponent2, "$this$set");
                pathComponent2.f3450c = fFloatValue;
                pathComponent2.m18593c();
                return C9072e.f47360a;
            }
        });
        C8573r0.m16714a1(composerImplMo1636j, abstractC9161o4, new InterfaceC2056p<PathComponent, AbstractC9161o, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$6
            @Override // cm.InterfaceC2056p
            /* JADX INFO: renamed from: m0 */
            public final C9072e mo1337m0(PathComponent pathComponent, AbstractC9161o abstractC9161o5) {
                PathComponent pathComponent2 = pathComponent;
                C5207g.m11111f(pathComponent2, "$this$set");
                pathComponent2.f3454g = abstractC9161o5;
                pathComponent2.m18593c();
                return C9072e.f47360a;
            }
        });
        C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f17), new InterfaceC2056p<PathComponent, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$7
            @Override // cm.InterfaceC2056p
            /* JADX INFO: renamed from: m0 */
            public final C9072e mo1337m0(PathComponent pathComponent, Float f23) {
                PathComponent pathComponent2 = pathComponent;
                float fFloatValue = f23.floatValue();
                C5207g.m11111f(pathComponent2, "$this$set");
                pathComponent2.f3452e = fFloatValue;
                pathComponent2.m18593c();
                return C9072e.f47360a;
            }
        });
        C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f18), new InterfaceC2056p<PathComponent, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$8
            @Override // cm.InterfaceC2056p
            /* JADX INFO: renamed from: m0 */
            public final C9072e mo1337m0(PathComponent pathComponent, Float f23) {
                PathComponent pathComponent2 = pathComponent;
                float fFloatValue = f23.floatValue();
                C5207g.m11111f(pathComponent2, "$this$set");
                pathComponent2.f3453f = fFloatValue;
                pathComponent2.m18593c();
                return C9072e.f47360a;
            }
        });
        C8573r0.m16714a1(composerImplMo1636j, new C9160n0(i18), new InterfaceC2056p<PathComponent, C9160n0, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$9
            @Override // cm.InterfaceC2056p
            /* JADX INFO: renamed from: m0 */
            public final C9072e mo1337m0(PathComponent pathComponent, C9160n0 c9160n0) {
                PathComponent pathComponent2 = pathComponent;
                int i19 = c9160n0.f47688a;
                C5207g.m11111f(pathComponent2, "$this$set");
                pathComponent2.f3456i = i19;
                pathComponent2.f3462o = true;
                pathComponent2.m18593c();
                return C9072e.f47360a;
            }
        });
        C8573r0.m16714a1(composerImplMo1636j, new C9158m0(i17), new InterfaceC2056p<PathComponent, C9158m0, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$10
            @Override // cm.InterfaceC2056p
            /* JADX INFO: renamed from: m0 */
            public final C9072e mo1337m0(PathComponent pathComponent, C9158m0 c9158m0) {
                PathComponent pathComponent2 = pathComponent;
                int i19 = c9158m0.f47686a;
                C5207g.m11111f(pathComponent2, "$this$set");
                pathComponent2.f3455h = i19;
                pathComponent2.f3462o = true;
                pathComponent2.m18593c();
                return C9072e.f47360a;
            }
        });
        C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f19), new InterfaceC2056p<PathComponent, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$11
            @Override // cm.InterfaceC2056p
            /* JADX INFO: renamed from: m0 */
            public final C9072e mo1337m0(PathComponent pathComponent, Float f23) {
                PathComponent pathComponent2 = pathComponent;
                float fFloatValue = f23.floatValue();
                C5207g.m11111f(pathComponent2, "$this$set");
                pathComponent2.f3457j = fFloatValue;
                pathComponent2.f3462o = true;
                pathComponent2.m18593c();
                return C9072e.f47360a;
            }
        });
        C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f20), new InterfaceC2056p<PathComponent, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$12
            @Override // cm.InterfaceC2056p
            /* JADX INFO: renamed from: m0 */
            public final C9072e mo1337m0(PathComponent pathComponent, Float f23) {
                PathComponent pathComponent2 = pathComponent;
                float fFloatValue = f23.floatValue();
                C5207g.m11111f(pathComponent2, "$this$set");
                if (!(pathComponent2.f3458k == fFloatValue)) {
                    pathComponent2.f3458k = fFloatValue;
                    pathComponent2.f3463p = true;
                    pathComponent2.m18593c();
                }
                return C9072e.f47360a;
            }
        });
        C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f21), new InterfaceC2056p<PathComponent, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$13
            @Override // cm.InterfaceC2056p
            /* JADX INFO: renamed from: m0 */
            public final C9072e mo1337m0(PathComponent pathComponent, Float f23) {
                PathComponent pathComponent2 = pathComponent;
                float fFloatValue = f23.floatValue();
                C5207g.m11111f(pathComponent2, "$this$set");
                if (!(pathComponent2.f3459l == fFloatValue)) {
                    pathComponent2.f3459l = fFloatValue;
                    pathComponent2.f3463p = true;
                    pathComponent2.m18593c();
                }
                return C9072e.f47360a;
            }
        });
        C8573r0.m16714a1(composerImplMo1636j, Float.valueOf(f22), new InterfaceC2056p<PathComponent, Float, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$14
            @Override // cm.InterfaceC2056p
            /* JADX INFO: renamed from: m0 */
            public final C9072e mo1337m0(PathComponent pathComponent, Float f23) {
                PathComponent pathComponent2 = pathComponent;
                float fFloatValue = f23.floatValue();
                C5207g.m11111f(pathComponent2, "$this$set");
                if (!(pathComponent2.f3460m == fFloatValue)) {
                    pathComponent2.f3460m = fFloatValue;
                    pathComponent2.f3463p = true;
                    pathComponent2.m18593c();
                }
                return C9072e.f47360a;
            }
        });
        composerImplMo1636j.m1609Q(true);
        composerImplMo1636j.m1609Q(false);
        C5332q0 c5332q0M1612T = composerImplMo1636j.m1612T();
        if (c5332q0M1612T == null) {
            return;
        }
        final String str3 = str2;
        final AbstractC9161o abstractC9161o5 = abstractC9161o3;
        final float f23 = f16;
        final AbstractC9161o abstractC9161o6 = abstractC9161o4;
        final float f24 = f17;
        final float f25 = f18;
        final int i19 = i17;
        final int i20 = i18;
        final float f26 = f19;
        final float f27 = f20;
        final float f28 = f21;
        final float f29 = f22;
        c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // cm.InterfaceC2056p
            /* JADX INFO: renamed from: m0 */
            public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                num.intValue();
                VectorComposeKt.m2006b(list, i16, str3, abstractC9161o5, f23, abstractC9161o6, f24, f25, i19, i20, f26, f27, f28, f29, interfaceC0476a2, C8573r0.m16737l1(i13 | 1), C8573r0.m16737l1(i14), i15);
                return C9072e.f47360a;
            }
        };
    }
}
