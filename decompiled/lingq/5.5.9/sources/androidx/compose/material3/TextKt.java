package androidx.compose.material3;

import androidx.compose.foundation.text.BasicTextKt;
import androidx.compose.p017ui.InterfaceC0500b;
import androidx.compose.p017ui.text.C0689a;
import androidx.compose.p017ui.text.font.AbstractC0696b;
import androidx.compose.runtime.C0480e;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.InterfaceC0476a;
import cm.InterfaceC2041a;
import cm.InterfaceC2052l;
import cm.InterfaceC2056p;
import cm.InterfaceC2057q;
import com.kochava.tracker.BuildConfig;
import dm.C5207g;
import java.util.Map;
import kotlin.collections.C6753d;
import p081e0.C5310f1;
import p081e0.C5328o0;
import p081e0.C5331q;
import p081e0.C5332q0;
import p081e0.InterfaceC5299c;
import p081e0.InterfaceC5336s0;
import p231l1.C7216j;
import p231l1.C7218l;
import p328q1.C8471h;
import p328q1.C8476m;
import p387t0.C9169u;
import p445w1.C9797g;
import p445w1.C9798h;
import p470x1.C10023k;
import p519z.C10422a;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
public final class TextKt {

    /* JADX INFO: renamed from: a */
    public static final C5331q f2808a;

    static {
        C5310f1 c5310f1 = C5310f1.f33583a;
        TextKt$LocalTextStyle$1 textKt$LocalTextStyle$1 = new InterfaceC2041a<C7218l>() { // from class: androidx.compose.material3.TextKt$LocalTextStyle$1
            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final C7218l mo807E() {
                return C7218l.f40599c;
            }
        };
        C5207g.m11111f(textKt$LocalTextStyle$1, "defaultFactory");
        f2808a = new C5331q(c5310f1, textKt$LocalTextStyle$1);
    }

    /* JADX INFO: renamed from: a */
    public static final void m1574a(final C7218l c7218l, final InterfaceC2056p<? super InterfaceC0476a, ? super Integer, C9072e> interfaceC2056p, InterfaceC0476a interfaceC0476a, final int i10) {
        int i11;
        C5207g.m11111f(c7218l, "value");
        C5207g.m11111f(interfaceC2056p, "content");
        ComposerImpl composerImplMo1636j = interfaceC0476a.mo1636j(-460300127);
        if ((i10 & 14) == 0) {
            i11 = (composerImplMo1636j.mo1665y(c7218l) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            i11 |= composerImplMo1636j.mo1665y(interfaceC2056p) ? 32 : 16;
        }
        if ((i11 & 91) == 18 && composerImplMo1636j.mo1642m()) {
            composerImplMo1636j.mo1650q();
        } else {
            InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q = ComposerKt.f3003a;
            C5331q c5331q = f2808a;
            CompositionLocalKt.m1691a(new C5328o0[]{c5331q.m11458b(((C7218l) composerImplMo1636j.mo1648p(c5331q)).m14544b(c7218l))}, interfaceC2056p, composerImplMo1636j, (i11 & 112) | 8);
        }
        C5332q0 c5332q0M1612T = composerImplMo1636j.m1612T();
        if (c5332q0M1612T == null) {
            return;
        }
        c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.material3.TextKt$ProvideTextStyle$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // cm.InterfaceC2056p
            /* JADX INFO: renamed from: m0 */
            public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                num.intValue();
                int i12 = i10 | 1;
                TextKt.m1574a(c7218l, interfaceC2056p, interfaceC0476a2, i12);
                return C9072e.f47360a;
            }
        };
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0147  */
    /* JADX WARN: Code duplicated, block: B:102:0x014a  */
    /* JADX WARN: Code duplicated, block: B:106:0x0152  */
    /* JADX WARN: Code duplicated, block: B:107:0x0157  */
    /* JADX WARN: Code duplicated, block: B:109:0x015d  */
    /* JADX WARN: Code duplicated, block: B:111:0x0163  */
    /* JADX WARN: Code duplicated, block: B:112:0x0168  */
    /* JADX WARN: Code duplicated, block: B:114:0x016f  */
    /* JADX WARN: Code duplicated, block: B:117:0x0175  */
    /* JADX WARN: Code duplicated, block: B:119:0x017a  */
    /* JADX WARN: Code duplicated, block: B:121:0x017e  */
    /* JADX WARN: Code duplicated, block: B:123:0x0186  */
    /* JADX WARN: Code duplicated, block: B:124:0x018b  */
    /* JADX WARN: Code duplicated, block: B:126:0x0192  */
    /* JADX WARN: Code duplicated, block: B:129:0x0199  */
    /* JADX WARN: Code duplicated, block: B:130:0x019c  */
    /* JADX WARN: Code duplicated, block: B:132:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:134:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:135:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:140:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:141:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:143:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:145:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:150:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:153:0x01db  */
    /* JADX WARN: Code duplicated, block: B:154:0x01de  */
    /* JADX WARN: Code duplicated, block: B:156:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:158:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:159:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:164:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:166:0x0202  */
    /* JADX WARN: Code duplicated, block: B:169:0x020b  */
    /* JADX WARN: Code duplicated, block: B:171:0x0210  */
    /* JADX WARN: Code duplicated, block: B:174:0x0216  */
    /* JADX WARN: Code duplicated, block: B:182:0x0254  */
    /* JADX WARN: Code duplicated, block: B:184:0x025b  */
    /* JADX WARN: Code duplicated, block: B:194:0x0291 A[PHI: r1 r3 r5 r6 r7 r8 r9 r10 r11 r12 r16 r17 r19 r22 r24 r31
      0x0291: PHI (r1v6 w1.h) = (r1v3 w1.h), (r1v8 w1.h) binds: [B:242:0x0305, B:193:0x0273] A[DONT_GENERATE, DONT_INLINE]
      0x0291: PHI (r3v10 long) = (r3v6 long), (r3v11 long) binds: [B:242:0x0305, B:193:0x0273] A[DONT_GENERATE, DONT_INLINE]
      0x0291: PHI (r5v6 androidx.compose.ui.b) = (r5v2 androidx.compose.ui.b), (r5v7 androidx.compose.ui.b) binds: [B:242:0x0305, B:193:0x0273] A[DONT_GENERATE, DONT_INLINE]
      0x0291: PHI (r6v7 int) = (r6v3 int), (r6v8 int) binds: [B:242:0x0305, B:193:0x0273] A[DONT_GENERATE, DONT_INLINE]
      0x0291: PHI (r7v8 boolean) = (r7v4 boolean), (r7v9 boolean) binds: [B:242:0x0305, B:193:0x0273] A[DONT_GENERATE, DONT_INLINE]
      0x0291: PHI (r8v23 int) = (r8v14 int), (r8v25 int) binds: [B:242:0x0305, B:193:0x0273] A[DONT_GENERATE, DONT_INLINE]
      0x0291: PHI (r9v11 w1.g) = (r9v7 w1.g), (r9v12 w1.g) binds: [B:242:0x0305, B:193:0x0273] A[DONT_GENERATE, DONT_INLINE]
      0x0291: PHI (r10v7 int) = (r10v3 int), (r10v8 int) binds: [B:242:0x0305, B:193:0x0273] A[DONT_GENERATE, DONT_INLINE]
      0x0291: PHI (r11v12 q1.h) = (r11v9 q1.h), (r11v14 q1.h) binds: [B:242:0x0305, B:193:0x0273] A[DONT_GENERATE, DONT_INLINE]
      0x0291: PHI (r12v10 java.util.Map<java.lang.String, z.a>) = (r12v6 java.util.Map<java.lang.String, z.a>), (r12v11 java.util.Map<java.lang.String, z.a>) binds: [B:242:0x0305, B:193:0x0273] A[DONT_GENERATE, DONT_INLINE]
      0x0291: PHI (r16v12 q1.m) = (r16v8 q1.m), (r16v13 q1.m) binds: [B:242:0x0305, B:193:0x0273] A[DONT_GENERATE, DONT_INLINE]
      0x0291: PHI (r17v10 cm.l<? super l1.j, sl.e>) = (r17v6 cm.l<? super l1.j, sl.e>), (r17v11 cm.l<? super l1.j, sl.e>) binds: [B:242:0x0305, B:193:0x0273] A[DONT_GENERATE, DONT_INLINE]
      0x0291: PHI (r19v17 androidx.compose.ui.text.font.b) = (r19v13 androidx.compose.ui.text.font.b), (r19v18 androidx.compose.ui.text.font.b) binds: [B:242:0x0305, B:193:0x0273] A[DONT_GENERATE, DONT_INLINE]
      0x0291: PHI (r22v4 long) = (r22v1 long), (r22v5 long) binds: [B:242:0x0305, B:193:0x0273] A[DONT_GENERATE, DONT_INLINE]
      0x0291: PHI (r24v11 long) = (r24v8 long), (r24v12 long) binds: [B:242:0x0305, B:193:0x0273] A[DONT_GENERATE, DONT_INLINE]
      0x0291: PHI (r31v15 long) = (r31v12 long), (r31v16 long) binds: [B:242:0x0305, B:193:0x0273] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:195:0x0295 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:196:0x0297  */
    /* JADX WARN: Code duplicated, block: B:197:0x029a  */
    /* JADX WARN: Code duplicated, block: B:199:0x029e  */
    /* JADX WARN: Code duplicated, block: B:200:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:202:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:203:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:206:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:207:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:209:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:210:0x02b7  */
    /* JADX WARN: Code duplicated, block: B:212:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:213:0x02be  */
    /* JADX WARN: Code duplicated, block: B:215:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:216:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:218:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:219:0x02cb  */
    /* JADX WARN: Code duplicated, block: B:222:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:224:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:225:0x02d7  */
    /* JADX WARN: Code duplicated, block: B:227:0x02db  */
    /* JADX WARN: Code duplicated, block: B:228:0x02de  */
    /* JADX WARN: Code duplicated, block: B:230:0x02e2  */
    /* JADX WARN: Code duplicated, block: B:231:0x02e4  */
    /* JADX WARN: Code duplicated, block: B:233:0x02e8  */
    /* JADX WARN: Code duplicated, block: B:234:0x02ec  */
    /* JADX WARN: Code duplicated, block: B:236:0x02f0  */
    /* JADX WARN: Code duplicated, block: B:237:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:239:0x02fe  */
    /* JADX WARN: Code duplicated, block: B:240:0x0301  */
    /* JADX WARN: Code duplicated, block: B:243:0x0307  */
    /* JADX WARN: Code duplicated, block: B:246:0x0325  */
    /* JADX WARN: Code duplicated, block: B:247:0x0328  */
    /* JADX WARN: Code duplicated, block: B:249:0x032c  */
    /* JADX WARN: Code duplicated, block: B:250:0x0331  */
    /* JADX WARN: Code duplicated, block: B:252:0x033b  */
    /* JADX WARN: Code duplicated, block: B:253:0x033d  */
    /* JADX WARN: Code duplicated, block: B:255:0x0340  */
    /* JADX WARN: Code duplicated, block: B:256:0x0343  */
    /* JADX WARN: Code duplicated, block: B:261:0x03d0  */
    /* JADX WARN: Code duplicated, block: B:263:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x004e  */
    /* JADX WARN: Code duplicated, block: B:27:0x0053  */
    /* JADX WARN: Code duplicated, block: B:29:0x0059  */
    /* JADX WARN: Code duplicated, block: B:31:0x005f  */
    /* JADX WARN: Code duplicated, block: B:32:0x0064  */
    /* JADX WARN: Code duplicated, block: B:36:0x0072  */
    /* JADX WARN: Code duplicated, block: B:37:0x0077  */
    /* JADX WARN: Code duplicated, block: B:39:0x007d  */
    /* JADX WARN: Code duplicated, block: B:41:0x0083  */
    /* JADX WARN: Code duplicated, block: B:42:0x0086  */
    /* JADX WARN: Code duplicated, block: B:46:0x0091  */
    /* JADX WARN: Code duplicated, block: B:47:0x0096  */
    /* JADX WARN: Code duplicated, block: B:49:0x009c  */
    /* JADX WARN: Code duplicated, block: B:51:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:52:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:56:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:57:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:59:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:61:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:62:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:66:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:67:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:69:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:71:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:72:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:76:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:77:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:79:0x0102  */
    /* JADX WARN: Code duplicated, block: B:81:0x0108  */
    /* JADX WARN: Code duplicated, block: B:82:0x010b  */
    /* JADX WARN: Code duplicated, block: B:86:0x0113  */
    /* JADX WARN: Code duplicated, block: B:87:0x011a  */
    /* JADX WARN: Code duplicated, block: B:89:0x0122  */
    /* JADX WARN: Code duplicated, block: B:91:0x0128  */
    /* JADX WARN: Code duplicated, block: B:92:0x012b  */
    /* JADX WARN: Code duplicated, block: B:96:0x0132  */
    /* JADX WARN: Code duplicated, block: B:97:0x0139  */
    /* JADX WARN: Code duplicated, block: B:99:0x0141  */
    /* JADX INFO: renamed from: b */
    public static final void m1575b(final C0689a c0689a, InterfaceC0500b interfaceC0500b, long j10, long j11, C8471h c8471h, C8476m c8476m, AbstractC0696b abstractC0696b, long j12, C9798h c9798h, C9797g c9797g, long j13, int i10, boolean z10, int i11, Map<String, C10422a> map, InterfaceC2052l<? super C7216j, C9072e> interfaceC2052l, C7218l c7218l, InterfaceC0476a interfaceC0476a, final int i12, final int i13, final int i14) throws Throwable {
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        int i32;
        int i33;
        int i34;
        int i35;
        int i36;
        int i37;
        int i38;
        int i39;
        int i40;
        int i41;
        int i42;
        int i43;
        InterfaceC0500b interfaceC0500b2;
        long j14;
        long j15;
        C8471h c8471h2;
        C8476m c8476m2;
        AbstractC0696b abstractC0696b2;
        long j16;
        C9798h c9798h2;
        C9797g c9797g2;
        long j17;
        int i44;
        boolean z11;
        int i45;
        Map<String, C10422a> mapM13459L0;
        InterfaceC2052l<? super C7216j, C9072e> interfaceC2052l2;
        C7218l c7218l2;
        long j18;
        boolean z12;
        long jM14529b;
        boolean z13;
        final InterfaceC0500b interfaceC0500b3;
        final C9797g c9797g3;
        final int i46;
        final C7218l c7218l3;
        final C8476m c8476m3;
        final InterfaceC2052l<? super C7216j, C9072e> interfaceC2052l3;
        final AbstractC0696b abstractC0696b3;
        final long j19;
        final int i47;
        final boolean z14;
        final C8471h c8471h3;
        final Map<String, C10422a> map2;
        final long j20;
        final long j21;
        final long j22;
        final C9798h c9798h3;
        C5332q0 c5332q0M1612T;
        int i48;
        C5207g.m11111f(c0689a, "text");
        ComposerImpl composerImplMo1636j = interfaceC0476a.mo1636j(224529679);
        if ((i14 & 1) != 0) {
            i15 = i12 | 6;
        } else if ((i12 & 14) == 0) {
            i15 = (composerImplMo1636j.mo1665y(c0689a) ? 4 : 2) | i12;
        } else {
            i15 = i12;
        }
        int i49 = i14 & 2;
        if (i49 == 0) {
            if ((i12 & 112) == 0) {
                i15 |= composerImplMo1636j.mo1665y(interfaceC0500b) ? 32 : 16;
            }
            i16 = i14 & 4;
            if (i16 != 0) {
                i15 |= 384;
            } else if ((i12 & 896) == 0) {
                if (composerImplMo1636j.m1596F(j10)) {
                    i17 = 256;
                } else {
                    i17 = BuildConfig.SDK_TRUNCATE_LENGTH;
                }
                i15 |= i17;
            }
            i18 = i14 & 8;
            if (i18 != 0) {
                i15 |= 3072;
            } else if ((i12 & 7168) == 0) {
                if (composerImplMo1636j.m1596F(j11)) {
                    i19 = 2048;
                } else {
                    i19 = 1024;
                }
                i15 |= i19;
            }
            i20 = i14 & 16;
            if (i20 != 0) {
                i15 |= 24576;
            } else if ((i12 & 57344) == 0) {
                if (composerImplMo1636j.mo1665y(c8471h)) {
                    i21 = 16384;
                } else {
                    i21 = 8192;
                }
                i15 |= i21;
            }
            i22 = i14 & 32;
            if (i22 != 0) {
                i15 |= 196608;
            } else if ((i12 & 458752) == 0) {
                if (composerImplMo1636j.mo1665y(c8476m)) {
                    i23 = 131072;
                } else {
                    i23 = 65536;
                }
                i15 |= i23;
            }
            i24 = i14 & 64;
            if (i24 != 0) {
                i15 |= 1572864;
            } else if ((i12 & 3670016) == 0) {
                if (composerImplMo1636j.mo1665y(abstractC0696b)) {
                    i25 = 1048576;
                } else {
                    i25 = 524288;
                }
                i15 |= i25;
            }
            i26 = i14 & BuildConfig.SDK_TRUNCATE_LENGTH;
            if (i26 != 0) {
                i15 |= 12582912;
            } else if ((i12 & 29360128) == 0) {
                if (composerImplMo1636j.m1596F(j12)) {
                    i27 = 8388608;
                } else {
                    i27 = 4194304;
                }
                i15 |= i27;
            }
            i28 = i14 & 256;
            if (i28 != 0) {
                i15 |= 100663296;
            } else if ((i12 & 234881024) == 0) {
                if (composerImplMo1636j.mo1665y(c9798h)) {
                    i29 = 67108864;
                } else {
                    i29 = 33554432;
                }
                i15 |= i29;
            }
            i30 = i14 & 512;
            if (i30 != 0) {
                i15 |= 805306368;
            } else if ((i12 & 1879048192) == 0) {
                if (composerImplMo1636j.mo1665y(c9797g)) {
                    i31 = 536870912;
                } else {
                    i31 = 268435456;
                }
                i15 |= i31;
            }
            i32 = i14 & 1024;
            if (i32 != 0) {
                i33 = i13 | 6;
            } else if ((i13 & 14) == 0) {
                if (composerImplMo1636j.m1596F(j13)) {
                    i34 = 4;
                } else {
                    i34 = 2;
                }
                i33 = i13 | i34;
            } else {
                i33 = i13;
            }
            i35 = i14 & 2048;
            if (i35 != 0) {
                i33 |= 48;
            } else if ((i13 & 112) != 0) {
                if (composerImplMo1636j.m1594E(i10)) {
                    i36 = 32;
                } else {
                    i36 = 16;
                }
                i33 |= i36;
            }
            i37 = i33;
            i38 = i14 & 4096;
            if (i38 != 0) {
                if ((i13 & 896) == 0) {
                    if (composerImplMo1636j.m1598G(z10)) {
                        i39 = 256;
                    } else {
                        i39 = BuildConfig.SDK_TRUNCATE_LENGTH;
                    }
                    i37 |= i39;
                }
                i40 = i14 & 8192;
                if (i40 != 0) {
                    if ((i13 & 7168) == 0) {
                        i37 |= composerImplMo1636j.m1594E(i11) ? 2048 : 1024;
                    }
                    i41 = i14 & 16384;
                    if (i41 != 0) {
                        i37 |= 8192;
                    }
                    i42 = i14 & 32768;
                    if (i42 != 0) {
                        if ((i13 & 458752) == 0) {
                            if (composerImplMo1636j.mo1665y(interfaceC2052l)) {
                                i43 = 131072;
                            } else {
                                i43 = 65536;
                            }
                            i37 |= i43;
                        }
                        if ((i13 & 3670016) != 0) {
                            if ((i14 & 65536) == 0 || !composerImplMo1636j.mo1665y(c7218l)) {
                                i48 = 524288;
                            } else {
                                i48 = 1048576;
                            }
                            i37 |= i48;
                        }
                        if (i41 != 16384 && (1533916891 & i15) == 306783378 && (2995931 & i37) == 599186 && composerImplMo1636j.mo1642m()) {
                            composerImplMo1636j.mo1650q();
                            interfaceC0500b3 = interfaceC0500b;
                            j20 = j10;
                            j22 = j11;
                            c8471h3 = c8471h;
                            c8476m3 = c8476m;
                            abstractC0696b3 = abstractC0696b;
                            j21 = j12;
                            c9798h3 = c9798h;
                            c9797g3 = c9797g;
                            j19 = j13;
                            i47 = i10;
                            z14 = z10;
                            i46 = i11;
                            map2 = map;
                            interfaceC2052l3 = interfaceC2052l;
                            c7218l3 = c7218l;
                        } else {
                            composerImplMo1636j.m1654s0();
                            if ((i12 & 1) != 0 || composerImplMo1636j.m1616X()) {
                                if (i49 != 0) {
                                    interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                                } else {
                                    interfaceC0500b2 = interfaceC0500b;
                                }
                                if (i16 != 0) {
                                    j14 = C9169u.f47703f;
                                } else {
                                    j14 = j10;
                                }
                                if (i18 != 0) {
                                    j15 = C10023k.f50982c;
                                } else {
                                    j15 = j11;
                                }
                                if (i20 != 0) {
                                    c8471h2 = null;
                                } else {
                                    c8471h2 = c8471h;
                                }
                                if (i22 != 0) {
                                    c8476m2 = null;
                                } else {
                                    c8476m2 = c8476m;
                                }
                                if (i24 != 0) {
                                    abstractC0696b2 = null;
                                } else {
                                    abstractC0696b2 = abstractC0696b;
                                }
                                if (i26 != 0) {
                                    j16 = C10023k.f50982c;
                                } else {
                                    j16 = j12;
                                }
                                if (i28 != 0) {
                                    c9798h2 = null;
                                } else {
                                    c9798h2 = c9798h;
                                }
                                c9797g2 = i30 == 0 ? c9797g : null;
                                if (i32 != 0) {
                                    j17 = C10023k.f50982c;
                                } else {
                                    j17 = j13;
                                }
                                if (i35 != 0) {
                                    i44 = 1;
                                } else {
                                    i44 = i10;
                                }
                                if (i38 != 0) {
                                    z11 = true;
                                } else {
                                    z11 = z10;
                                }
                                if (i40 != 0) {
                                    i45 = Integer.MAX_VALUE;
                                } else {
                                    i45 = i11;
                                }
                                if (i41 != 0) {
                                    mapM13459L0 = C6753d.m13459L0();
                                    i37 &= -57345;
                                } else {
                                    mapM13459L0 = map;
                                }
                                if (i42 != 0) {
                                    interfaceC2052l2 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.material3.TextKt$Text$3
                                        @Override // cm.InterfaceC2052l
                                        /* JADX INFO: renamed from: n */
                                        public final C9072e mo528n(C7216j c7216j) {
                                            C5207g.m11111f(c7216j, "it");
                                            return C9072e.f47360a;
                                        }
                                    };
                                } else {
                                    interfaceC2052l2 = interfaceC2052l;
                                }
                                if ((i14 & 65536) != 0) {
                                    c7218l2 = (C7218l) composerImplMo1636j.mo1648p(f2808a);
                                    i37 &= -3670017;
                                }
                                composerImplMo1636j.m1610R();
                                InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q = ComposerKt.f3003a;
                                composerImplMo1636j.mo1622c(79587464);
                                j18 = C9169u.f47703f;
                                if (j14 != j18) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                if (z12) {
                                    jM14529b = j14;
                                } else {
                                    jM14529b = c7218l2.f40600a.m14529b();
                                    if (jM14529b != j18) {
                                        z13 = true;
                                    } else {
                                        z13 = false;
                                    }
                                    if (z13) {
                                        jM14529b = ((C9169u) composerImplMo1636j.mo1648p(ContentColorKt.f2738a)).f47705a;
                                    }
                                }
                                composerImplMo1636j.m1609Q(false);
                                C7218l c7218l4 = c7218l2;
                                int i50 = (i15 & 112) | (i15 & 14) | 16777216 | ((i37 >> 6) & 7168);
                                int i51 = i37 << 9;
                                BasicTextKt.m1530a(c0689a, interfaceC0500b2, c7218l4.m14544b(new C7218l(jM14529b, j15, c8476m2, c8471h2, abstractC0696b2, j16, c9798h2, c9797g2, j17, 175952)), interfaceC2052l2, i44, z11, i45, mapM13459L0, composerImplMo1636j, i50 | (i51 & 57344) | (i51 & 458752) | (i51 & 3670016), 0);
                                interfaceC0500b3 = interfaceC0500b2;
                                c9797g3 = c9797g2;
                                i46 = i45;
                                c7218l3 = c7218l4;
                                c8476m3 = c8476m2;
                                interfaceC2052l3 = interfaceC2052l2;
                                abstractC0696b3 = abstractC0696b2;
                                j19 = j17;
                                i47 = i44;
                                z14 = z11;
                                c8471h3 = c8471h2;
                                map2 = mapM13459L0;
                                j20 = j14;
                                j21 = j16;
                                j22 = j15;
                                c9798h3 = c9798h2;
                            } else {
                                composerImplMo1636j.mo1650q();
                                if (i41 != 0) {
                                    i37 &= -57345;
                                }
                                if ((i14 & 65536) != 0) {
                                    i37 &= -3670017;
                                }
                                interfaceC0500b2 = interfaceC0500b;
                                j14 = j10;
                                j15 = j11;
                                c8471h2 = c8471h;
                                c8476m2 = c8476m;
                                abstractC0696b2 = abstractC0696b;
                                j16 = j12;
                                c9798h2 = c9798h;
                                c9797g2 = c9797g;
                                j17 = j13;
                                i44 = i10;
                                z11 = z10;
                                i45 = i11;
                                mapM13459L0 = map;
                                interfaceC2052l2 = interfaceC2052l;
                            }
                            c7218l2 = c7218l;
                            composerImplMo1636j.m1610R();
                            InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q2 = ComposerKt.f3003a;
                            composerImplMo1636j.mo1622c(79587464);
                            j18 = C9169u.f47703f;
                            if (j14 != j18) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            if (z12) {
                                jM14529b = j14;
                            } else {
                                jM14529b = c7218l2.f40600a.m14529b();
                                if (jM14529b != j18) {
                                    z13 = true;
                                } else {
                                    z13 = false;
                                }
                                if (z13) {
                                    jM14529b = ((C9169u) composerImplMo1636j.mo1648p(ContentColorKt.f2738a)).f47705a;
                                }
                            }
                            composerImplMo1636j.m1609Q(false);
                            C7218l c7218l5 = c7218l2;
                            int i52 = (i15 & 112) | (i15 & 14) | 16777216 | ((i37 >> 6) & 7168);
                            int i53 = i37 << 9;
                            BasicTextKt.m1530a(c0689a, interfaceC0500b2, c7218l5.m14544b(new C7218l(jM14529b, j15, c8476m2, c8471h2, abstractC0696b2, j16, c9798h2, c9797g2, j17, 175952)), interfaceC2052l2, i44, z11, i45, mapM13459L0, composerImplMo1636j, i52 | (i53 & 57344) | (i53 & 458752) | (i53 & 3670016), 0);
                            interfaceC0500b3 = interfaceC0500b2;
                            c9797g3 = c9797g2;
                            i46 = i45;
                            c7218l3 = c7218l5;
                            c8476m3 = c8476m2;
                            interfaceC2052l3 = interfaceC2052l2;
                            abstractC0696b3 = abstractC0696b2;
                            j19 = j17;
                            i47 = i44;
                            z14 = z11;
                            c8471h3 = c8471h2;
                            map2 = mapM13459L0;
                            j20 = j14;
                            j21 = j16;
                            j22 = j15;
                            c9798h3 = c9798h2;
                        }
                        c5332q0M1612T = composerImplMo1636j.m1612T();
                        if (c5332q0M1612T == null) {
                            return;
                        }
                        c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.material3.TextKt$Text$4
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) throws Throwable {
                                num.intValue();
                                TextKt.m1575b(c0689a, interfaceC0500b3, j20, j22, c8471h3, c8476m3, abstractC0696b3, j21, c9798h3, c9797g3, j19, i47, z14, i46, map2, interfaceC2052l3, c7218l3, interfaceC0476a2, i12 | 1, i13, i14);
                                return C9072e.f47360a;
                            }
                        };
                    }
                    i37 |= 196608;
                    if ((i13 & 3670016) != 0) {
                        if ((i14 & 65536) == 0) {
                            i48 = 524288;
                        } else {
                            i48 = 524288;
                        }
                        i37 |= i48;
                    }
                    if (i41 != 16384) {
                        composerImplMo1636j.m1654s0();
                        if ((i12 & 1) != 0) {
                            if (i49 != 0) {
                                interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                            } else {
                                interfaceC0500b2 = interfaceC0500b;
                            }
                            if (i16 != 0) {
                                j14 = C9169u.f47703f;
                            } else {
                                j14 = j10;
                            }
                            if (i18 != 0) {
                                j15 = C10023k.f50982c;
                            } else {
                                j15 = j11;
                            }
                            if (i20 != 0) {
                                c8471h2 = null;
                            } else {
                                c8471h2 = c8471h;
                            }
                            if (i22 != 0) {
                                c8476m2 = null;
                            } else {
                                c8476m2 = c8476m;
                            }
                            if (i24 != 0) {
                                abstractC0696b2 = null;
                            } else {
                                abstractC0696b2 = abstractC0696b;
                            }
                            if (i26 != 0) {
                                j16 = C10023k.f50982c;
                            } else {
                                j16 = j12;
                            }
                            if (i28 != 0) {
                                c9798h2 = null;
                            } else {
                                c9798h2 = c9798h;
                            }
                            if (i30 == 0) {
                            }
                            if (i32 != 0) {
                                j17 = C10023k.f50982c;
                            } else {
                                j17 = j13;
                            }
                            if (i35 != 0) {
                                i44 = 1;
                            } else {
                                i44 = i10;
                            }
                            if (i38 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            if (i40 != 0) {
                                i45 = Integer.MAX_VALUE;
                            } else {
                                i45 = i11;
                            }
                            if (i41 != 0) {
                                mapM13459L0 = C6753d.m13459L0();
                                i37 &= -57345;
                            } else {
                                mapM13459L0 = map;
                            }
                            if (i42 != 0) {
                                interfaceC2052l2 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.material3.TextKt$Text$3
                                    @Override // cm.InterfaceC2052l
                                    /* JADX INFO: renamed from: n */
                                    public final C9072e mo528n(C7216j c7216j) {
                                        C5207g.m11111f(c7216j, "it");
                                        return C9072e.f47360a;
                                    }
                                };
                            } else {
                                interfaceC2052l2 = interfaceC2052l;
                            }
                            if ((i14 & 65536) != 0) {
                                c7218l2 = (C7218l) composerImplMo1636j.mo1648p(f2808a);
                                i37 &= -3670017;
                            } else {
                                c7218l2 = c7218l;
                            }
                        } else {
                            if (i49 != 0) {
                                interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                            } else {
                                interfaceC0500b2 = interfaceC0500b;
                            }
                            if (i16 != 0) {
                                j14 = C9169u.f47703f;
                            } else {
                                j14 = j10;
                            }
                            if (i18 != 0) {
                                j15 = C10023k.f50982c;
                            } else {
                                j15 = j11;
                            }
                            if (i20 != 0) {
                                c8471h2 = null;
                            } else {
                                c8471h2 = c8471h;
                            }
                            if (i22 != 0) {
                                c8476m2 = null;
                            } else {
                                c8476m2 = c8476m;
                            }
                            if (i24 != 0) {
                                abstractC0696b2 = null;
                            } else {
                                abstractC0696b2 = abstractC0696b;
                            }
                            if (i26 != 0) {
                                j16 = C10023k.f50982c;
                            } else {
                                j16 = j12;
                            }
                            if (i28 != 0) {
                                c9798h2 = null;
                            } else {
                                c9798h2 = c9798h;
                            }
                            if (i30 == 0) {
                            }
                            if (i32 != 0) {
                                j17 = C10023k.f50982c;
                            } else {
                                j17 = j13;
                            }
                            if (i35 != 0) {
                                i44 = 1;
                            } else {
                                i44 = i10;
                            }
                            if (i38 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            if (i40 != 0) {
                                i45 = Integer.MAX_VALUE;
                            } else {
                                i45 = i11;
                            }
                            if (i41 != 0) {
                                mapM13459L0 = C6753d.m13459L0();
                                i37 &= -57345;
                            } else {
                                mapM13459L0 = map;
                            }
                            if (i42 != 0) {
                                interfaceC2052l2 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.material3.TextKt$Text$3
                                    @Override // cm.InterfaceC2052l
                                    /* JADX INFO: renamed from: n */
                                    public final C9072e mo528n(C7216j c7216j) {
                                        C5207g.m11111f(c7216j, "it");
                                        return C9072e.f47360a;
                                    }
                                };
                            } else {
                                interfaceC2052l2 = interfaceC2052l;
                            }
                            if ((i14 & 65536) != 0) {
                                c7218l2 = (C7218l) composerImplMo1636j.mo1648p(f2808a);
                                i37 &= -3670017;
                            } else {
                                c7218l2 = c7218l;
                            }
                        }
                        composerImplMo1636j.m1610R();
                        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q3 = ComposerKt.f3003a;
                        composerImplMo1636j.mo1622c(79587464);
                        j18 = C9169u.f47703f;
                        if (j14 != j18) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (z12) {
                            jM14529b = j14;
                        } else {
                            jM14529b = c7218l2.f40600a.m14529b();
                            if (jM14529b != j18) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            if (z13) {
                                jM14529b = ((C9169u) composerImplMo1636j.mo1648p(ContentColorKt.f2738a)).f47705a;
                            }
                        }
                        composerImplMo1636j.m1609Q(false);
                        C7218l c7218l6 = c7218l2;
                        int i54 = (i15 & 112) | (i15 & 14) | 16777216 | ((i37 >> 6) & 7168);
                        int i55 = i37 << 9;
                        BasicTextKt.m1530a(c0689a, interfaceC0500b2, c7218l6.m14544b(new C7218l(jM14529b, j15, c8476m2, c8471h2, abstractC0696b2, j16, c9798h2, c9797g2, j17, 175952)), interfaceC2052l2, i44, z11, i45, mapM13459L0, composerImplMo1636j, i54 | (i55 & 57344) | (i55 & 458752) | (i55 & 3670016), 0);
                        interfaceC0500b3 = interfaceC0500b2;
                        c9797g3 = c9797g2;
                        i46 = i45;
                        c7218l3 = c7218l6;
                        c8476m3 = c8476m2;
                        interfaceC2052l3 = interfaceC2052l2;
                        abstractC0696b3 = abstractC0696b2;
                        j19 = j17;
                        i47 = i44;
                        z14 = z11;
                        c8471h3 = c8471h2;
                        map2 = mapM13459L0;
                        j20 = j14;
                        j21 = j16;
                        j22 = j15;
                        c9798h3 = c9798h2;
                    } else {
                        composerImplMo1636j.m1654s0();
                        if ((i12 & 1) != 0) {
                            if (i49 != 0) {
                                interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                            } else {
                                interfaceC0500b2 = interfaceC0500b;
                            }
                            if (i16 != 0) {
                                j14 = C9169u.f47703f;
                            } else {
                                j14 = j10;
                            }
                            if (i18 != 0) {
                                j15 = C10023k.f50982c;
                            } else {
                                j15 = j11;
                            }
                            if (i20 != 0) {
                                c8471h2 = null;
                            } else {
                                c8471h2 = c8471h;
                            }
                            if (i22 != 0) {
                                c8476m2 = null;
                            } else {
                                c8476m2 = c8476m;
                            }
                            if (i24 != 0) {
                                abstractC0696b2 = null;
                            } else {
                                abstractC0696b2 = abstractC0696b;
                            }
                            if (i26 != 0) {
                                j16 = C10023k.f50982c;
                            } else {
                                j16 = j12;
                            }
                            if (i28 != 0) {
                                c9798h2 = null;
                            } else {
                                c9798h2 = c9798h;
                            }
                            if (i30 == 0) {
                            }
                            if (i32 != 0) {
                                j17 = C10023k.f50982c;
                            } else {
                                j17 = j13;
                            }
                            if (i35 != 0) {
                                i44 = 1;
                            } else {
                                i44 = i10;
                            }
                            if (i38 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            if (i40 != 0) {
                                i45 = Integer.MAX_VALUE;
                            } else {
                                i45 = i11;
                            }
                            if (i41 != 0) {
                                mapM13459L0 = C6753d.m13459L0();
                                i37 &= -57345;
                            } else {
                                mapM13459L0 = map;
                            }
                            if (i42 != 0) {
                                interfaceC2052l2 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.material3.TextKt$Text$3
                                    @Override // cm.InterfaceC2052l
                                    /* JADX INFO: renamed from: n */
                                    public final C9072e mo528n(C7216j c7216j) {
                                        C5207g.m11111f(c7216j, "it");
                                        return C9072e.f47360a;
                                    }
                                };
                            } else {
                                interfaceC2052l2 = interfaceC2052l;
                            }
                            if ((i14 & 65536) != 0) {
                                c7218l2 = (C7218l) composerImplMo1636j.mo1648p(f2808a);
                                i37 &= -3670017;
                            } else {
                                c7218l2 = c7218l;
                            }
                        } else {
                            if (i49 != 0) {
                                interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                            } else {
                                interfaceC0500b2 = interfaceC0500b;
                            }
                            if (i16 != 0) {
                                j14 = C9169u.f47703f;
                            } else {
                                j14 = j10;
                            }
                            if (i18 != 0) {
                                j15 = C10023k.f50982c;
                            } else {
                                j15 = j11;
                            }
                            if (i20 != 0) {
                                c8471h2 = null;
                            } else {
                                c8471h2 = c8471h;
                            }
                            if (i22 != 0) {
                                c8476m2 = null;
                            } else {
                                c8476m2 = c8476m;
                            }
                            if (i24 != 0) {
                                abstractC0696b2 = null;
                            } else {
                                abstractC0696b2 = abstractC0696b;
                            }
                            if (i26 != 0) {
                                j16 = C10023k.f50982c;
                            } else {
                                j16 = j12;
                            }
                            if (i28 != 0) {
                                c9798h2 = null;
                            } else {
                                c9798h2 = c9798h;
                            }
                            if (i30 == 0) {
                            }
                            if (i32 != 0) {
                                j17 = C10023k.f50982c;
                            } else {
                                j17 = j13;
                            }
                            if (i35 != 0) {
                                i44 = 1;
                            } else {
                                i44 = i10;
                            }
                            if (i38 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            if (i40 != 0) {
                                i45 = Integer.MAX_VALUE;
                            } else {
                                i45 = i11;
                            }
                            if (i41 != 0) {
                                mapM13459L0 = C6753d.m13459L0();
                                i37 &= -57345;
                            } else {
                                mapM13459L0 = map;
                            }
                            if (i42 != 0) {
                                interfaceC2052l2 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.material3.TextKt$Text$3
                                    @Override // cm.InterfaceC2052l
                                    /* JADX INFO: renamed from: n */
                                    public final C9072e mo528n(C7216j c7216j) {
                                        C5207g.m11111f(c7216j, "it");
                                        return C9072e.f47360a;
                                    }
                                };
                            } else {
                                interfaceC2052l2 = interfaceC2052l;
                            }
                            if ((i14 & 65536) != 0) {
                                c7218l2 = (C7218l) composerImplMo1636j.mo1648p(f2808a);
                                i37 &= -3670017;
                            } else {
                                c7218l2 = c7218l;
                            }
                        }
                        composerImplMo1636j.m1610R();
                        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q4 = ComposerKt.f3003a;
                        composerImplMo1636j.mo1622c(79587464);
                        j18 = C9169u.f47703f;
                        if (j14 != j18) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (z12) {
                            jM14529b = j14;
                        } else {
                            jM14529b = c7218l2.f40600a.m14529b();
                            if (jM14529b != j18) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            if (z13) {
                                jM14529b = ((C9169u) composerImplMo1636j.mo1648p(ContentColorKt.f2738a)).f47705a;
                            }
                        }
                        composerImplMo1636j.m1609Q(false);
                        C7218l c7218l7 = c7218l2;
                        int i56 = (i15 & 112) | (i15 & 14) | 16777216 | ((i37 >> 6) & 7168);
                        int i57 = i37 << 9;
                        BasicTextKt.m1530a(c0689a, interfaceC0500b2, c7218l7.m14544b(new C7218l(jM14529b, j15, c8476m2, c8471h2, abstractC0696b2, j16, c9798h2, c9797g2, j17, 175952)), interfaceC2052l2, i44, z11, i45, mapM13459L0, composerImplMo1636j, i56 | (i57 & 57344) | (i57 & 458752) | (i57 & 3670016), 0);
                        interfaceC0500b3 = interfaceC0500b2;
                        c9797g3 = c9797g2;
                        i46 = i45;
                        c7218l3 = c7218l7;
                        c8476m3 = c8476m2;
                        interfaceC2052l3 = interfaceC2052l2;
                        abstractC0696b3 = abstractC0696b2;
                        j19 = j17;
                        i47 = i44;
                        z14 = z11;
                        c8471h3 = c8471h2;
                        map2 = mapM13459L0;
                        j20 = j14;
                        j21 = j16;
                        j22 = j15;
                        c9798h3 = c9798h2;
                    }
                    c5332q0M1612T = composerImplMo1636j.m1612T();
                    if (c5332q0M1612T == null) {
                        return;
                    }
                    c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.material3.TextKt$Text$4
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) throws Throwable {
                            num.intValue();
                            TextKt.m1575b(c0689a, interfaceC0500b3, j20, j22, c8471h3, c8476m3, abstractC0696b3, j21, c9798h3, c9797g3, j19, i47, z14, i46, map2, interfaceC2052l3, c7218l3, interfaceC0476a2, i12 | 1, i13, i14);
                            return C9072e.f47360a;
                        }
                    };
                }
                i37 |= 3072;
                i41 = i14 & 16384;
                if (i41 != 0) {
                    i37 |= 8192;
                }
                i42 = i14 & 32768;
                if (i42 != 0) {
                    if ((i13 & 458752) == 0) {
                        if (composerImplMo1636j.mo1665y(interfaceC2052l)) {
                            i43 = 131072;
                        } else {
                            i43 = 65536;
                        }
                        i37 |= i43;
                    }
                    if ((i13 & 3670016) != 0) {
                        if ((i14 & 65536) == 0) {
                            i48 = 524288;
                        } else {
                            i48 = 524288;
                        }
                        i37 |= i48;
                    }
                    if (i41 != 16384) {
                        composerImplMo1636j.m1654s0();
                        if ((i12 & 1) != 0) {
                            if (i49 != 0) {
                                interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                            } else {
                                interfaceC0500b2 = interfaceC0500b;
                            }
                            if (i16 != 0) {
                                j14 = C9169u.f47703f;
                            } else {
                                j14 = j10;
                            }
                            if (i18 != 0) {
                                j15 = C10023k.f50982c;
                            } else {
                                j15 = j11;
                            }
                            if (i20 != 0) {
                                c8471h2 = null;
                            } else {
                                c8471h2 = c8471h;
                            }
                            if (i22 != 0) {
                                c8476m2 = null;
                            } else {
                                c8476m2 = c8476m;
                            }
                            if (i24 != 0) {
                                abstractC0696b2 = null;
                            } else {
                                abstractC0696b2 = abstractC0696b;
                            }
                            if (i26 != 0) {
                                j16 = C10023k.f50982c;
                            } else {
                                j16 = j12;
                            }
                            if (i28 != 0) {
                                c9798h2 = null;
                            } else {
                                c9798h2 = c9798h;
                            }
                            if (i30 == 0) {
                            }
                            if (i32 != 0) {
                                j17 = C10023k.f50982c;
                            } else {
                                j17 = j13;
                            }
                            if (i35 != 0) {
                                i44 = 1;
                            } else {
                                i44 = i10;
                            }
                            if (i38 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            if (i40 != 0) {
                                i45 = Integer.MAX_VALUE;
                            } else {
                                i45 = i11;
                            }
                            if (i41 != 0) {
                                mapM13459L0 = C6753d.m13459L0();
                                i37 &= -57345;
                            } else {
                                mapM13459L0 = map;
                            }
                            if (i42 != 0) {
                                interfaceC2052l2 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.material3.TextKt$Text$3
                                    @Override // cm.InterfaceC2052l
                                    /* JADX INFO: renamed from: n */
                                    public final C9072e mo528n(C7216j c7216j) {
                                        C5207g.m11111f(c7216j, "it");
                                        return C9072e.f47360a;
                                    }
                                };
                            } else {
                                interfaceC2052l2 = interfaceC2052l;
                            }
                            if ((i14 & 65536) != 0) {
                                c7218l2 = (C7218l) composerImplMo1636j.mo1648p(f2808a);
                                i37 &= -3670017;
                            } else {
                                c7218l2 = c7218l;
                            }
                        } else {
                            if (i49 != 0) {
                                interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                            } else {
                                interfaceC0500b2 = interfaceC0500b;
                            }
                            if (i16 != 0) {
                                j14 = C9169u.f47703f;
                            } else {
                                j14 = j10;
                            }
                            if (i18 != 0) {
                                j15 = C10023k.f50982c;
                            } else {
                                j15 = j11;
                            }
                            if (i20 != 0) {
                                c8471h2 = null;
                            } else {
                                c8471h2 = c8471h;
                            }
                            if (i22 != 0) {
                                c8476m2 = null;
                            } else {
                                c8476m2 = c8476m;
                            }
                            if (i24 != 0) {
                                abstractC0696b2 = null;
                            } else {
                                abstractC0696b2 = abstractC0696b;
                            }
                            if (i26 != 0) {
                                j16 = C10023k.f50982c;
                            } else {
                                j16 = j12;
                            }
                            if (i28 != 0) {
                                c9798h2 = null;
                            } else {
                                c9798h2 = c9798h;
                            }
                            if (i30 == 0) {
                            }
                            if (i32 != 0) {
                                j17 = C10023k.f50982c;
                            } else {
                                j17 = j13;
                            }
                            if (i35 != 0) {
                                i44 = 1;
                            } else {
                                i44 = i10;
                            }
                            if (i38 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            if (i40 != 0) {
                                i45 = Integer.MAX_VALUE;
                            } else {
                                i45 = i11;
                            }
                            if (i41 != 0) {
                                mapM13459L0 = C6753d.m13459L0();
                                i37 &= -57345;
                            } else {
                                mapM13459L0 = map;
                            }
                            if (i42 != 0) {
                                interfaceC2052l2 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.material3.TextKt$Text$3
                                    @Override // cm.InterfaceC2052l
                                    /* JADX INFO: renamed from: n */
                                    public final C9072e mo528n(C7216j c7216j) {
                                        C5207g.m11111f(c7216j, "it");
                                        return C9072e.f47360a;
                                    }
                                };
                            } else {
                                interfaceC2052l2 = interfaceC2052l;
                            }
                            if ((i14 & 65536) != 0) {
                                c7218l2 = (C7218l) composerImplMo1636j.mo1648p(f2808a);
                                i37 &= -3670017;
                            } else {
                                c7218l2 = c7218l;
                            }
                        }
                        composerImplMo1636j.m1610R();
                        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q5 = ComposerKt.f3003a;
                        composerImplMo1636j.mo1622c(79587464);
                        j18 = C9169u.f47703f;
                        if (j14 != j18) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (z12) {
                            jM14529b = j14;
                        } else {
                            jM14529b = c7218l2.f40600a.m14529b();
                            if (jM14529b != j18) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            if (z13) {
                                jM14529b = ((C9169u) composerImplMo1636j.mo1648p(ContentColorKt.f2738a)).f47705a;
                            }
                        }
                        composerImplMo1636j.m1609Q(false);
                        C7218l c7218l8 = c7218l2;
                        int i58 = (i15 & 112) | (i15 & 14) | 16777216 | ((i37 >> 6) & 7168);
                        int i59 = i37 << 9;
                        BasicTextKt.m1530a(c0689a, interfaceC0500b2, c7218l8.m14544b(new C7218l(jM14529b, j15, c8476m2, c8471h2, abstractC0696b2, j16, c9798h2, c9797g2, j17, 175952)), interfaceC2052l2, i44, z11, i45, mapM13459L0, composerImplMo1636j, i58 | (i59 & 57344) | (i59 & 458752) | (i59 & 3670016), 0);
                        interfaceC0500b3 = interfaceC0500b2;
                        c9797g3 = c9797g2;
                        i46 = i45;
                        c7218l3 = c7218l8;
                        c8476m3 = c8476m2;
                        interfaceC2052l3 = interfaceC2052l2;
                        abstractC0696b3 = abstractC0696b2;
                        j19 = j17;
                        i47 = i44;
                        z14 = z11;
                        c8471h3 = c8471h2;
                        map2 = mapM13459L0;
                        j20 = j14;
                        j21 = j16;
                        j22 = j15;
                        c9798h3 = c9798h2;
                    } else {
                        composerImplMo1636j.m1654s0();
                        if ((i12 & 1) != 0) {
                            if (i49 != 0) {
                                interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                            } else {
                                interfaceC0500b2 = interfaceC0500b;
                            }
                            if (i16 != 0) {
                                j14 = C9169u.f47703f;
                            } else {
                                j14 = j10;
                            }
                            if (i18 != 0) {
                                j15 = C10023k.f50982c;
                            } else {
                                j15 = j11;
                            }
                            if (i20 != 0) {
                                c8471h2 = null;
                            } else {
                                c8471h2 = c8471h;
                            }
                            if (i22 != 0) {
                                c8476m2 = null;
                            } else {
                                c8476m2 = c8476m;
                            }
                            if (i24 != 0) {
                                abstractC0696b2 = null;
                            } else {
                                abstractC0696b2 = abstractC0696b;
                            }
                            if (i26 != 0) {
                                j16 = C10023k.f50982c;
                            } else {
                                j16 = j12;
                            }
                            if (i28 != 0) {
                                c9798h2 = null;
                            } else {
                                c9798h2 = c9798h;
                            }
                            if (i30 == 0) {
                            }
                            if (i32 != 0) {
                                j17 = C10023k.f50982c;
                            } else {
                                j17 = j13;
                            }
                            if (i35 != 0) {
                                i44 = 1;
                            } else {
                                i44 = i10;
                            }
                            if (i38 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            if (i40 != 0) {
                                i45 = Integer.MAX_VALUE;
                            } else {
                                i45 = i11;
                            }
                            if (i41 != 0) {
                                mapM13459L0 = C6753d.m13459L0();
                                i37 &= -57345;
                            } else {
                                mapM13459L0 = map;
                            }
                            if (i42 != 0) {
                                interfaceC2052l2 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.material3.TextKt$Text$3
                                    @Override // cm.InterfaceC2052l
                                    /* JADX INFO: renamed from: n */
                                    public final C9072e mo528n(C7216j c7216j) {
                                        C5207g.m11111f(c7216j, "it");
                                        return C9072e.f47360a;
                                    }
                                };
                            } else {
                                interfaceC2052l2 = interfaceC2052l;
                            }
                            if ((i14 & 65536) != 0) {
                                c7218l2 = (C7218l) composerImplMo1636j.mo1648p(f2808a);
                                i37 &= -3670017;
                            } else {
                                c7218l2 = c7218l;
                            }
                        } else {
                            if (i49 != 0) {
                                interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                            } else {
                                interfaceC0500b2 = interfaceC0500b;
                            }
                            if (i16 != 0) {
                                j14 = C9169u.f47703f;
                            } else {
                                j14 = j10;
                            }
                            if (i18 != 0) {
                                j15 = C10023k.f50982c;
                            } else {
                                j15 = j11;
                            }
                            if (i20 != 0) {
                                c8471h2 = null;
                            } else {
                                c8471h2 = c8471h;
                            }
                            if (i22 != 0) {
                                c8476m2 = null;
                            } else {
                                c8476m2 = c8476m;
                            }
                            if (i24 != 0) {
                                abstractC0696b2 = null;
                            } else {
                                abstractC0696b2 = abstractC0696b;
                            }
                            if (i26 != 0) {
                                j16 = C10023k.f50982c;
                            } else {
                                j16 = j12;
                            }
                            if (i28 != 0) {
                                c9798h2 = null;
                            } else {
                                c9798h2 = c9798h;
                            }
                            if (i30 == 0) {
                            }
                            if (i32 != 0) {
                                j17 = C10023k.f50982c;
                            } else {
                                j17 = j13;
                            }
                            if (i35 != 0) {
                                i44 = 1;
                            } else {
                                i44 = i10;
                            }
                            if (i38 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            if (i40 != 0) {
                                i45 = Integer.MAX_VALUE;
                            } else {
                                i45 = i11;
                            }
                            if (i41 != 0) {
                                mapM13459L0 = C6753d.m13459L0();
                                i37 &= -57345;
                            } else {
                                mapM13459L0 = map;
                            }
                            if (i42 != 0) {
                                interfaceC2052l2 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.material3.TextKt$Text$3
                                    @Override // cm.InterfaceC2052l
                                    /* JADX INFO: renamed from: n */
                                    public final C9072e mo528n(C7216j c7216j) {
                                        C5207g.m11111f(c7216j, "it");
                                        return C9072e.f47360a;
                                    }
                                };
                            } else {
                                interfaceC2052l2 = interfaceC2052l;
                            }
                            if ((i14 & 65536) != 0) {
                                c7218l2 = (C7218l) composerImplMo1636j.mo1648p(f2808a);
                                i37 &= -3670017;
                            } else {
                                c7218l2 = c7218l;
                            }
                        }
                        composerImplMo1636j.m1610R();
                        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q6 = ComposerKt.f3003a;
                        composerImplMo1636j.mo1622c(79587464);
                        j18 = C9169u.f47703f;
                        if (j14 != j18) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (z12) {
                            jM14529b = j14;
                        } else {
                            jM14529b = c7218l2.f40600a.m14529b();
                            if (jM14529b != j18) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            if (z13) {
                                jM14529b = ((C9169u) composerImplMo1636j.mo1648p(ContentColorKt.f2738a)).f47705a;
                            }
                        }
                        composerImplMo1636j.m1609Q(false);
                        C7218l c7218l9 = c7218l2;
                        int i510 = (i15 & 112) | (i15 & 14) | 16777216 | ((i37 >> 6) & 7168);
                        int i511 = i37 << 9;
                        BasicTextKt.m1530a(c0689a, interfaceC0500b2, c7218l9.m14544b(new C7218l(jM14529b, j15, c8476m2, c8471h2, abstractC0696b2, j16, c9798h2, c9797g2, j17, 175952)), interfaceC2052l2, i44, z11, i45, mapM13459L0, composerImplMo1636j, i510 | (i511 & 57344) | (i511 & 458752) | (i511 & 3670016), 0);
                        interfaceC0500b3 = interfaceC0500b2;
                        c9797g3 = c9797g2;
                        i46 = i45;
                        c7218l3 = c7218l9;
                        c8476m3 = c8476m2;
                        interfaceC2052l3 = interfaceC2052l2;
                        abstractC0696b3 = abstractC0696b2;
                        j19 = j17;
                        i47 = i44;
                        z14 = z11;
                        c8471h3 = c8471h2;
                        map2 = mapM13459L0;
                        j20 = j14;
                        j21 = j16;
                        j22 = j15;
                        c9798h3 = c9798h2;
                    }
                    c5332q0M1612T = composerImplMo1636j.m1612T();
                    if (c5332q0M1612T == null) {
                        return;
                    }
                    c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.material3.TextKt$Text$4
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) throws Throwable {
                            num.intValue();
                            TextKt.m1575b(c0689a, interfaceC0500b3, j20, j22, c8471h3, c8476m3, abstractC0696b3, j21, c9798h3, c9797g3, j19, i47, z14, i46, map2, interfaceC2052l3, c7218l3, interfaceC0476a2, i12 | 1, i13, i14);
                            return C9072e.f47360a;
                        }
                    };
                }
                i37 |= 196608;
                if ((i13 & 3670016) != 0) {
                    if ((i14 & 65536) == 0) {
                        i48 = 524288;
                    } else {
                        i48 = 524288;
                    }
                    i37 |= i48;
                }
                if (i41 != 16384) {
                    composerImplMo1636j.m1654s0();
                    if ((i12 & 1) != 0) {
                        if (i49 != 0) {
                            interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                        } else {
                            interfaceC0500b2 = interfaceC0500b;
                        }
                        if (i16 != 0) {
                            j14 = C9169u.f47703f;
                        } else {
                            j14 = j10;
                        }
                        if (i18 != 0) {
                            j15 = C10023k.f50982c;
                        } else {
                            j15 = j11;
                        }
                        if (i20 != 0) {
                            c8471h2 = null;
                        } else {
                            c8471h2 = c8471h;
                        }
                        if (i22 != 0) {
                            c8476m2 = null;
                        } else {
                            c8476m2 = c8476m;
                        }
                        if (i24 != 0) {
                            abstractC0696b2 = null;
                        } else {
                            abstractC0696b2 = abstractC0696b;
                        }
                        if (i26 != 0) {
                            j16 = C10023k.f50982c;
                        } else {
                            j16 = j12;
                        }
                        if (i28 != 0) {
                            c9798h2 = null;
                        } else {
                            c9798h2 = c9798h;
                        }
                        if (i30 == 0) {
                        }
                        if (i32 != 0) {
                            j17 = C10023k.f50982c;
                        } else {
                            j17 = j13;
                        }
                        if (i35 != 0) {
                            i44 = 1;
                        } else {
                            i44 = i10;
                        }
                        if (i38 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if (i40 != 0) {
                            i45 = Integer.MAX_VALUE;
                        } else {
                            i45 = i11;
                        }
                        if (i41 != 0) {
                            mapM13459L0 = C6753d.m13459L0();
                            i37 &= -57345;
                        } else {
                            mapM13459L0 = map;
                        }
                        if (i42 != 0) {
                            interfaceC2052l2 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.material3.TextKt$Text$3
                                @Override // cm.InterfaceC2052l
                                /* JADX INFO: renamed from: n */
                                public final C9072e mo528n(C7216j c7216j) {
                                    C5207g.m11111f(c7216j, "it");
                                    return C9072e.f47360a;
                                }
                            };
                        } else {
                            interfaceC2052l2 = interfaceC2052l;
                        }
                        if ((i14 & 65536) != 0) {
                            c7218l2 = (C7218l) composerImplMo1636j.mo1648p(f2808a);
                            i37 &= -3670017;
                        } else {
                            c7218l2 = c7218l;
                        }
                    } else {
                        if (i49 != 0) {
                            interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                        } else {
                            interfaceC0500b2 = interfaceC0500b;
                        }
                        if (i16 != 0) {
                            j14 = C9169u.f47703f;
                        } else {
                            j14 = j10;
                        }
                        if (i18 != 0) {
                            j15 = C10023k.f50982c;
                        } else {
                            j15 = j11;
                        }
                        if (i20 != 0) {
                            c8471h2 = null;
                        } else {
                            c8471h2 = c8471h;
                        }
                        if (i22 != 0) {
                            c8476m2 = null;
                        } else {
                            c8476m2 = c8476m;
                        }
                        if (i24 != 0) {
                            abstractC0696b2 = null;
                        } else {
                            abstractC0696b2 = abstractC0696b;
                        }
                        if (i26 != 0) {
                            j16 = C10023k.f50982c;
                        } else {
                            j16 = j12;
                        }
                        if (i28 != 0) {
                            c9798h2 = null;
                        } else {
                            c9798h2 = c9798h;
                        }
                        if (i30 == 0) {
                        }
                        if (i32 != 0) {
                            j17 = C10023k.f50982c;
                        } else {
                            j17 = j13;
                        }
                        if (i35 != 0) {
                            i44 = 1;
                        } else {
                            i44 = i10;
                        }
                        if (i38 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if (i40 != 0) {
                            i45 = Integer.MAX_VALUE;
                        } else {
                            i45 = i11;
                        }
                        if (i41 != 0) {
                            mapM13459L0 = C6753d.m13459L0();
                            i37 &= -57345;
                        } else {
                            mapM13459L0 = map;
                        }
                        if (i42 != 0) {
                            interfaceC2052l2 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.material3.TextKt$Text$3
                                @Override // cm.InterfaceC2052l
                                /* JADX INFO: renamed from: n */
                                public final C9072e mo528n(C7216j c7216j) {
                                    C5207g.m11111f(c7216j, "it");
                                    return C9072e.f47360a;
                                }
                            };
                        } else {
                            interfaceC2052l2 = interfaceC2052l;
                        }
                        if ((i14 & 65536) != 0) {
                            c7218l2 = (C7218l) composerImplMo1636j.mo1648p(f2808a);
                            i37 &= -3670017;
                        } else {
                            c7218l2 = c7218l;
                        }
                    }
                    composerImplMo1636j.m1610R();
                    InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q7 = ComposerKt.f3003a;
                    composerImplMo1636j.mo1622c(79587464);
                    j18 = C9169u.f47703f;
                    if (j14 != j18) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (z12) {
                        jM14529b = j14;
                    } else {
                        jM14529b = c7218l2.f40600a.m14529b();
                        if (jM14529b != j18) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (z13) {
                            jM14529b = ((C9169u) composerImplMo1636j.mo1648p(ContentColorKt.f2738a)).f47705a;
                        }
                    }
                    composerImplMo1636j.m1609Q(false);
                    C7218l c7218l10 = c7218l2;
                    int i512 = (i15 & 112) | (i15 & 14) | 16777216 | ((i37 >> 6) & 7168);
                    int i513 = i37 << 9;
                    BasicTextKt.m1530a(c0689a, interfaceC0500b2, c7218l10.m14544b(new C7218l(jM14529b, j15, c8476m2, c8471h2, abstractC0696b2, j16, c9798h2, c9797g2, j17, 175952)), interfaceC2052l2, i44, z11, i45, mapM13459L0, composerImplMo1636j, i512 | (i513 & 57344) | (i513 & 458752) | (i513 & 3670016), 0);
                    interfaceC0500b3 = interfaceC0500b2;
                    c9797g3 = c9797g2;
                    i46 = i45;
                    c7218l3 = c7218l10;
                    c8476m3 = c8476m2;
                    interfaceC2052l3 = interfaceC2052l2;
                    abstractC0696b3 = abstractC0696b2;
                    j19 = j17;
                    i47 = i44;
                    z14 = z11;
                    c8471h3 = c8471h2;
                    map2 = mapM13459L0;
                    j20 = j14;
                    j21 = j16;
                    j22 = j15;
                    c9798h3 = c9798h2;
                } else {
                    composerImplMo1636j.m1654s0();
                    if ((i12 & 1) != 0) {
                        if (i49 != 0) {
                            interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                        } else {
                            interfaceC0500b2 = interfaceC0500b;
                        }
                        if (i16 != 0) {
                            j14 = C9169u.f47703f;
                        } else {
                            j14 = j10;
                        }
                        if (i18 != 0) {
                            j15 = C10023k.f50982c;
                        } else {
                            j15 = j11;
                        }
                        if (i20 != 0) {
                            c8471h2 = null;
                        } else {
                            c8471h2 = c8471h;
                        }
                        if (i22 != 0) {
                            c8476m2 = null;
                        } else {
                            c8476m2 = c8476m;
                        }
                        if (i24 != 0) {
                            abstractC0696b2 = null;
                        } else {
                            abstractC0696b2 = abstractC0696b;
                        }
                        if (i26 != 0) {
                            j16 = C10023k.f50982c;
                        } else {
                            j16 = j12;
                        }
                        if (i28 != 0) {
                            c9798h2 = null;
                        } else {
                            c9798h2 = c9798h;
                        }
                        if (i30 == 0) {
                        }
                        if (i32 != 0) {
                            j17 = C10023k.f50982c;
                        } else {
                            j17 = j13;
                        }
                        if (i35 != 0) {
                            i44 = 1;
                        } else {
                            i44 = i10;
                        }
                        if (i38 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if (i40 != 0) {
                            i45 = Integer.MAX_VALUE;
                        } else {
                            i45 = i11;
                        }
                        if (i41 != 0) {
                            mapM13459L0 = C6753d.m13459L0();
                            i37 &= -57345;
                        } else {
                            mapM13459L0 = map;
                        }
                        if (i42 != 0) {
                            interfaceC2052l2 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.material3.TextKt$Text$3
                                @Override // cm.InterfaceC2052l
                                /* JADX INFO: renamed from: n */
                                public final C9072e mo528n(C7216j c7216j) {
                                    C5207g.m11111f(c7216j, "it");
                                    return C9072e.f47360a;
                                }
                            };
                        } else {
                            interfaceC2052l2 = interfaceC2052l;
                        }
                        if ((i14 & 65536) != 0) {
                            c7218l2 = (C7218l) composerImplMo1636j.mo1648p(f2808a);
                            i37 &= -3670017;
                        } else {
                            c7218l2 = c7218l;
                        }
                    } else {
                        if (i49 != 0) {
                            interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                        } else {
                            interfaceC0500b2 = interfaceC0500b;
                        }
                        if (i16 != 0) {
                            j14 = C9169u.f47703f;
                        } else {
                            j14 = j10;
                        }
                        if (i18 != 0) {
                            j15 = C10023k.f50982c;
                        } else {
                            j15 = j11;
                        }
                        if (i20 != 0) {
                            c8471h2 = null;
                        } else {
                            c8471h2 = c8471h;
                        }
                        if (i22 != 0) {
                            c8476m2 = null;
                        } else {
                            c8476m2 = c8476m;
                        }
                        if (i24 != 0) {
                            abstractC0696b2 = null;
                        } else {
                            abstractC0696b2 = abstractC0696b;
                        }
                        if (i26 != 0) {
                            j16 = C10023k.f50982c;
                        } else {
                            j16 = j12;
                        }
                        if (i28 != 0) {
                            c9798h2 = null;
                        } else {
                            c9798h2 = c9798h;
                        }
                        if (i30 == 0) {
                        }
                        if (i32 != 0) {
                            j17 = C10023k.f50982c;
                        } else {
                            j17 = j13;
                        }
                        if (i35 != 0) {
                            i44 = 1;
                        } else {
                            i44 = i10;
                        }
                        if (i38 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if (i40 != 0) {
                            i45 = Integer.MAX_VALUE;
                        } else {
                            i45 = i11;
                        }
                        if (i41 != 0) {
                            mapM13459L0 = C6753d.m13459L0();
                            i37 &= -57345;
                        } else {
                            mapM13459L0 = map;
                        }
                        if (i42 != 0) {
                            interfaceC2052l2 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.material3.TextKt$Text$3
                                @Override // cm.InterfaceC2052l
                                /* JADX INFO: renamed from: n */
                                public final C9072e mo528n(C7216j c7216j) {
                                    C5207g.m11111f(c7216j, "it");
                                    return C9072e.f47360a;
                                }
                            };
                        } else {
                            interfaceC2052l2 = interfaceC2052l;
                        }
                        if ((i14 & 65536) != 0) {
                            c7218l2 = (C7218l) composerImplMo1636j.mo1648p(f2808a);
                            i37 &= -3670017;
                        } else {
                            c7218l2 = c7218l;
                        }
                    }
                    composerImplMo1636j.m1610R();
                    InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q8 = ComposerKt.f3003a;
                    composerImplMo1636j.mo1622c(79587464);
                    j18 = C9169u.f47703f;
                    if (j14 != j18) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (z12) {
                        jM14529b = j14;
                    } else {
                        jM14529b = c7218l2.f40600a.m14529b();
                        if (jM14529b != j18) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (z13) {
                            jM14529b = ((C9169u) composerImplMo1636j.mo1648p(ContentColorKt.f2738a)).f47705a;
                        }
                    }
                    composerImplMo1636j.m1609Q(false);
                    C7218l c7218l11 = c7218l2;
                    int i514 = (i15 & 112) | (i15 & 14) | 16777216 | ((i37 >> 6) & 7168);
                    int i515 = i37 << 9;
                    BasicTextKt.m1530a(c0689a, interfaceC0500b2, c7218l11.m14544b(new C7218l(jM14529b, j15, c8476m2, c8471h2, abstractC0696b2, j16, c9798h2, c9797g2, j17, 175952)), interfaceC2052l2, i44, z11, i45, mapM13459L0, composerImplMo1636j, i514 | (i515 & 57344) | (i515 & 458752) | (i515 & 3670016), 0);
                    interfaceC0500b3 = interfaceC0500b2;
                    c9797g3 = c9797g2;
                    i46 = i45;
                    c7218l3 = c7218l11;
                    c8476m3 = c8476m2;
                    interfaceC2052l3 = interfaceC2052l2;
                    abstractC0696b3 = abstractC0696b2;
                    j19 = j17;
                    i47 = i44;
                    z14 = z11;
                    c8471h3 = c8471h2;
                    map2 = mapM13459L0;
                    j20 = j14;
                    j21 = j16;
                    j22 = j15;
                    c9798h3 = c9798h2;
                }
                c5332q0M1612T = composerImplMo1636j.m1612T();
                if (c5332q0M1612T == null) {
                    return;
                }
                c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.material3.TextKt$Text$4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // cm.InterfaceC2056p
                    /* JADX INFO: renamed from: m0 */
                    public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) throws Throwable {
                        num.intValue();
                        TextKt.m1575b(c0689a, interfaceC0500b3, j20, j22, c8471h3, c8476m3, abstractC0696b3, j21, c9798h3, c9797g3, j19, i47, z14, i46, map2, interfaceC2052l3, c7218l3, interfaceC0476a2, i12 | 1, i13, i14);
                        return C9072e.f47360a;
                    }
                };
            }
            i37 |= 384;
            i40 = i14 & 8192;
            if (i40 != 0) {
                if ((i13 & 7168) == 0) {
                    i37 |= composerImplMo1636j.m1594E(i11) ? 2048 : 1024;
                }
                i41 = i14 & 16384;
                if (i41 != 0) {
                    i37 |= 8192;
                }
                i42 = i14 & 32768;
                if (i42 != 0) {
                    if ((i13 & 458752) == 0) {
                        if (composerImplMo1636j.mo1665y(interfaceC2052l)) {
                            i43 = 131072;
                        } else {
                            i43 = 65536;
                        }
                        i37 |= i43;
                    }
                    if ((i13 & 3670016) != 0) {
                        if ((i14 & 65536) == 0) {
                            i48 = 524288;
                        } else {
                            i48 = 524288;
                        }
                        i37 |= i48;
                    }
                    if (i41 != 16384) {
                        composerImplMo1636j.m1654s0();
                        if ((i12 & 1) != 0) {
                            if (i49 != 0) {
                                interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                            } else {
                                interfaceC0500b2 = interfaceC0500b;
                            }
                            if (i16 != 0) {
                                j14 = C9169u.f47703f;
                            } else {
                                j14 = j10;
                            }
                            if (i18 != 0) {
                                j15 = C10023k.f50982c;
                            } else {
                                j15 = j11;
                            }
                            if (i20 != 0) {
                                c8471h2 = null;
                            } else {
                                c8471h2 = c8471h;
                            }
                            if (i22 != 0) {
                                c8476m2 = null;
                            } else {
                                c8476m2 = c8476m;
                            }
                            if (i24 != 0) {
                                abstractC0696b2 = null;
                            } else {
                                abstractC0696b2 = abstractC0696b;
                            }
                            if (i26 != 0) {
                                j16 = C10023k.f50982c;
                            } else {
                                j16 = j12;
                            }
                            if (i28 != 0) {
                                c9798h2 = null;
                            } else {
                                c9798h2 = c9798h;
                            }
                            if (i30 == 0) {
                            }
                            if (i32 != 0) {
                                j17 = C10023k.f50982c;
                            } else {
                                j17 = j13;
                            }
                            if (i35 != 0) {
                                i44 = 1;
                            } else {
                                i44 = i10;
                            }
                            if (i38 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            if (i40 != 0) {
                                i45 = Integer.MAX_VALUE;
                            } else {
                                i45 = i11;
                            }
                            if (i41 != 0) {
                                mapM13459L0 = C6753d.m13459L0();
                                i37 &= -57345;
                            } else {
                                mapM13459L0 = map;
                            }
                            if (i42 != 0) {
                                interfaceC2052l2 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.material3.TextKt$Text$3
                                    @Override // cm.InterfaceC2052l
                                    /* JADX INFO: renamed from: n */
                                    public final C9072e mo528n(C7216j c7216j) {
                                        C5207g.m11111f(c7216j, "it");
                                        return C9072e.f47360a;
                                    }
                                };
                            } else {
                                interfaceC2052l2 = interfaceC2052l;
                            }
                            if ((i14 & 65536) != 0) {
                                c7218l2 = (C7218l) composerImplMo1636j.mo1648p(f2808a);
                                i37 &= -3670017;
                            } else {
                                c7218l2 = c7218l;
                            }
                        } else {
                            if (i49 != 0) {
                                interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                            } else {
                                interfaceC0500b2 = interfaceC0500b;
                            }
                            if (i16 != 0) {
                                j14 = C9169u.f47703f;
                            } else {
                                j14 = j10;
                            }
                            if (i18 != 0) {
                                j15 = C10023k.f50982c;
                            } else {
                                j15 = j11;
                            }
                            if (i20 != 0) {
                                c8471h2 = null;
                            } else {
                                c8471h2 = c8471h;
                            }
                            if (i22 != 0) {
                                c8476m2 = null;
                            } else {
                                c8476m2 = c8476m;
                            }
                            if (i24 != 0) {
                                abstractC0696b2 = null;
                            } else {
                                abstractC0696b2 = abstractC0696b;
                            }
                            if (i26 != 0) {
                                j16 = C10023k.f50982c;
                            } else {
                                j16 = j12;
                            }
                            if (i28 != 0) {
                                c9798h2 = null;
                            } else {
                                c9798h2 = c9798h;
                            }
                            if (i30 == 0) {
                            }
                            if (i32 != 0) {
                                j17 = C10023k.f50982c;
                            } else {
                                j17 = j13;
                            }
                            if (i35 != 0) {
                                i44 = 1;
                            } else {
                                i44 = i10;
                            }
                            if (i38 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            if (i40 != 0) {
                                i45 = Integer.MAX_VALUE;
                            } else {
                                i45 = i11;
                            }
                            if (i41 != 0) {
                                mapM13459L0 = C6753d.m13459L0();
                                i37 &= -57345;
                            } else {
                                mapM13459L0 = map;
                            }
                            if (i42 != 0) {
                                interfaceC2052l2 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.material3.TextKt$Text$3
                                    @Override // cm.InterfaceC2052l
                                    /* JADX INFO: renamed from: n */
                                    public final C9072e mo528n(C7216j c7216j) {
                                        C5207g.m11111f(c7216j, "it");
                                        return C9072e.f47360a;
                                    }
                                };
                            } else {
                                interfaceC2052l2 = interfaceC2052l;
                            }
                            if ((i14 & 65536) != 0) {
                                c7218l2 = (C7218l) composerImplMo1636j.mo1648p(f2808a);
                                i37 &= -3670017;
                            } else {
                                c7218l2 = c7218l;
                            }
                        }
                        composerImplMo1636j.m1610R();
                        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q9 = ComposerKt.f3003a;
                        composerImplMo1636j.mo1622c(79587464);
                        j18 = C9169u.f47703f;
                        if (j14 != j18) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (z12) {
                            jM14529b = j14;
                        } else {
                            jM14529b = c7218l2.f40600a.m14529b();
                            if (jM14529b != j18) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            if (z13) {
                                jM14529b = ((C9169u) composerImplMo1636j.mo1648p(ContentColorKt.f2738a)).f47705a;
                            }
                        }
                        composerImplMo1636j.m1609Q(false);
                        C7218l c7218l12 = c7218l2;
                        int i516 = (i15 & 112) | (i15 & 14) | 16777216 | ((i37 >> 6) & 7168);
                        int i517 = i37 << 9;
                        BasicTextKt.m1530a(c0689a, interfaceC0500b2, c7218l12.m14544b(new C7218l(jM14529b, j15, c8476m2, c8471h2, abstractC0696b2, j16, c9798h2, c9797g2, j17, 175952)), interfaceC2052l2, i44, z11, i45, mapM13459L0, composerImplMo1636j, i516 | (i517 & 57344) | (i517 & 458752) | (i517 & 3670016), 0);
                        interfaceC0500b3 = interfaceC0500b2;
                        c9797g3 = c9797g2;
                        i46 = i45;
                        c7218l3 = c7218l12;
                        c8476m3 = c8476m2;
                        interfaceC2052l3 = interfaceC2052l2;
                        abstractC0696b3 = abstractC0696b2;
                        j19 = j17;
                        i47 = i44;
                        z14 = z11;
                        c8471h3 = c8471h2;
                        map2 = mapM13459L0;
                        j20 = j14;
                        j21 = j16;
                        j22 = j15;
                        c9798h3 = c9798h2;
                    } else {
                        composerImplMo1636j.m1654s0();
                        if ((i12 & 1) != 0) {
                            if (i49 != 0) {
                                interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                            } else {
                                interfaceC0500b2 = interfaceC0500b;
                            }
                            if (i16 != 0) {
                                j14 = C9169u.f47703f;
                            } else {
                                j14 = j10;
                            }
                            if (i18 != 0) {
                                j15 = C10023k.f50982c;
                            } else {
                                j15 = j11;
                            }
                            if (i20 != 0) {
                                c8471h2 = null;
                            } else {
                                c8471h2 = c8471h;
                            }
                            if (i22 != 0) {
                                c8476m2 = null;
                            } else {
                                c8476m2 = c8476m;
                            }
                            if (i24 != 0) {
                                abstractC0696b2 = null;
                            } else {
                                abstractC0696b2 = abstractC0696b;
                            }
                            if (i26 != 0) {
                                j16 = C10023k.f50982c;
                            } else {
                                j16 = j12;
                            }
                            if (i28 != 0) {
                                c9798h2 = null;
                            } else {
                                c9798h2 = c9798h;
                            }
                            if (i30 == 0) {
                            }
                            if (i32 != 0) {
                                j17 = C10023k.f50982c;
                            } else {
                                j17 = j13;
                            }
                            if (i35 != 0) {
                                i44 = 1;
                            } else {
                                i44 = i10;
                            }
                            if (i38 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            if (i40 != 0) {
                                i45 = Integer.MAX_VALUE;
                            } else {
                                i45 = i11;
                            }
                            if (i41 != 0) {
                                mapM13459L0 = C6753d.m13459L0();
                                i37 &= -57345;
                            } else {
                                mapM13459L0 = map;
                            }
                            if (i42 != 0) {
                                interfaceC2052l2 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.material3.TextKt$Text$3
                                    @Override // cm.InterfaceC2052l
                                    /* JADX INFO: renamed from: n */
                                    public final C9072e mo528n(C7216j c7216j) {
                                        C5207g.m11111f(c7216j, "it");
                                        return C9072e.f47360a;
                                    }
                                };
                            } else {
                                interfaceC2052l2 = interfaceC2052l;
                            }
                            if ((i14 & 65536) != 0) {
                                c7218l2 = (C7218l) composerImplMo1636j.mo1648p(f2808a);
                                i37 &= -3670017;
                            } else {
                                c7218l2 = c7218l;
                            }
                        } else {
                            if (i49 != 0) {
                                interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                            } else {
                                interfaceC0500b2 = interfaceC0500b;
                            }
                            if (i16 != 0) {
                                j14 = C9169u.f47703f;
                            } else {
                                j14 = j10;
                            }
                            if (i18 != 0) {
                                j15 = C10023k.f50982c;
                            } else {
                                j15 = j11;
                            }
                            if (i20 != 0) {
                                c8471h2 = null;
                            } else {
                                c8471h2 = c8471h;
                            }
                            if (i22 != 0) {
                                c8476m2 = null;
                            } else {
                                c8476m2 = c8476m;
                            }
                            if (i24 != 0) {
                                abstractC0696b2 = null;
                            } else {
                                abstractC0696b2 = abstractC0696b;
                            }
                            if (i26 != 0) {
                                j16 = C10023k.f50982c;
                            } else {
                                j16 = j12;
                            }
                            if (i28 != 0) {
                                c9798h2 = null;
                            } else {
                                c9798h2 = c9798h;
                            }
                            if (i30 == 0) {
                            }
                            if (i32 != 0) {
                                j17 = C10023k.f50982c;
                            } else {
                                j17 = j13;
                            }
                            if (i35 != 0) {
                                i44 = 1;
                            } else {
                                i44 = i10;
                            }
                            if (i38 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            if (i40 != 0) {
                                i45 = Integer.MAX_VALUE;
                            } else {
                                i45 = i11;
                            }
                            if (i41 != 0) {
                                mapM13459L0 = C6753d.m13459L0();
                                i37 &= -57345;
                            } else {
                                mapM13459L0 = map;
                            }
                            if (i42 != 0) {
                                interfaceC2052l2 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.material3.TextKt$Text$3
                                    @Override // cm.InterfaceC2052l
                                    /* JADX INFO: renamed from: n */
                                    public final C9072e mo528n(C7216j c7216j) {
                                        C5207g.m11111f(c7216j, "it");
                                        return C9072e.f47360a;
                                    }
                                };
                            } else {
                                interfaceC2052l2 = interfaceC2052l;
                            }
                            if ((i14 & 65536) != 0) {
                                c7218l2 = (C7218l) composerImplMo1636j.mo1648p(f2808a);
                                i37 &= -3670017;
                            } else {
                                c7218l2 = c7218l;
                            }
                        }
                        composerImplMo1636j.m1610R();
                        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q10 = ComposerKt.f3003a;
                        composerImplMo1636j.mo1622c(79587464);
                        j18 = C9169u.f47703f;
                        if (j14 != j18) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (z12) {
                            jM14529b = j14;
                        } else {
                            jM14529b = c7218l2.f40600a.m14529b();
                            if (jM14529b != j18) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            if (z13) {
                                jM14529b = ((C9169u) composerImplMo1636j.mo1648p(ContentColorKt.f2738a)).f47705a;
                            }
                        }
                        composerImplMo1636j.m1609Q(false);
                        C7218l c7218l13 = c7218l2;
                        int i518 = (i15 & 112) | (i15 & 14) | 16777216 | ((i37 >> 6) & 7168);
                        int i519 = i37 << 9;
                        BasicTextKt.m1530a(c0689a, interfaceC0500b2, c7218l13.m14544b(new C7218l(jM14529b, j15, c8476m2, c8471h2, abstractC0696b2, j16, c9798h2, c9797g2, j17, 175952)), interfaceC2052l2, i44, z11, i45, mapM13459L0, composerImplMo1636j, i518 | (i519 & 57344) | (i519 & 458752) | (i519 & 3670016), 0);
                        interfaceC0500b3 = interfaceC0500b2;
                        c9797g3 = c9797g2;
                        i46 = i45;
                        c7218l3 = c7218l13;
                        c8476m3 = c8476m2;
                        interfaceC2052l3 = interfaceC2052l2;
                        abstractC0696b3 = abstractC0696b2;
                        j19 = j17;
                        i47 = i44;
                        z14 = z11;
                        c8471h3 = c8471h2;
                        map2 = mapM13459L0;
                        j20 = j14;
                        j21 = j16;
                        j22 = j15;
                        c9798h3 = c9798h2;
                    }
                    c5332q0M1612T = composerImplMo1636j.m1612T();
                    if (c5332q0M1612T == null) {
                        return;
                    }
                    c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.material3.TextKt$Text$4
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) throws Throwable {
                            num.intValue();
                            TextKt.m1575b(c0689a, interfaceC0500b3, j20, j22, c8471h3, c8476m3, abstractC0696b3, j21, c9798h3, c9797g3, j19, i47, z14, i46, map2, interfaceC2052l3, c7218l3, interfaceC0476a2, i12 | 1, i13, i14);
                            return C9072e.f47360a;
                        }
                    };
                }
                i37 |= 196608;
                if ((i13 & 3670016) != 0) {
                    if ((i14 & 65536) == 0) {
                        i48 = 524288;
                    } else {
                        i48 = 524288;
                    }
                    i37 |= i48;
                }
                if (i41 != 16384) {
                    composerImplMo1636j.m1654s0();
                    if ((i12 & 1) != 0) {
                        if (i49 != 0) {
                            interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                        } else {
                            interfaceC0500b2 = interfaceC0500b;
                        }
                        if (i16 != 0) {
                            j14 = C9169u.f47703f;
                        } else {
                            j14 = j10;
                        }
                        if (i18 != 0) {
                            j15 = C10023k.f50982c;
                        } else {
                            j15 = j11;
                        }
                        if (i20 != 0) {
                            c8471h2 = null;
                        } else {
                            c8471h2 = c8471h;
                        }
                        if (i22 != 0) {
                            c8476m2 = null;
                        } else {
                            c8476m2 = c8476m;
                        }
                        if (i24 != 0) {
                            abstractC0696b2 = null;
                        } else {
                            abstractC0696b2 = abstractC0696b;
                        }
                        if (i26 != 0) {
                            j16 = C10023k.f50982c;
                        } else {
                            j16 = j12;
                        }
                        if (i28 != 0) {
                            c9798h2 = null;
                        } else {
                            c9798h2 = c9798h;
                        }
                        if (i30 == 0) {
                        }
                        if (i32 != 0) {
                            j17 = C10023k.f50982c;
                        } else {
                            j17 = j13;
                        }
                        if (i35 != 0) {
                            i44 = 1;
                        } else {
                            i44 = i10;
                        }
                        if (i38 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if (i40 != 0) {
                            i45 = Integer.MAX_VALUE;
                        } else {
                            i45 = i11;
                        }
                        if (i41 != 0) {
                            mapM13459L0 = C6753d.m13459L0();
                            i37 &= -57345;
                        } else {
                            mapM13459L0 = map;
                        }
                        if (i42 != 0) {
                            interfaceC2052l2 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.material3.TextKt$Text$3
                                @Override // cm.InterfaceC2052l
                                /* JADX INFO: renamed from: n */
                                public final C9072e mo528n(C7216j c7216j) {
                                    C5207g.m11111f(c7216j, "it");
                                    return C9072e.f47360a;
                                }
                            };
                        } else {
                            interfaceC2052l2 = interfaceC2052l;
                        }
                        if ((i14 & 65536) != 0) {
                            c7218l2 = (C7218l) composerImplMo1636j.mo1648p(f2808a);
                            i37 &= -3670017;
                        } else {
                            c7218l2 = c7218l;
                        }
                    } else {
                        if (i49 != 0) {
                            interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                        } else {
                            interfaceC0500b2 = interfaceC0500b;
                        }
                        if (i16 != 0) {
                            j14 = C9169u.f47703f;
                        } else {
                            j14 = j10;
                        }
                        if (i18 != 0) {
                            j15 = C10023k.f50982c;
                        } else {
                            j15 = j11;
                        }
                        if (i20 != 0) {
                            c8471h2 = null;
                        } else {
                            c8471h2 = c8471h;
                        }
                        if (i22 != 0) {
                            c8476m2 = null;
                        } else {
                            c8476m2 = c8476m;
                        }
                        if (i24 != 0) {
                            abstractC0696b2 = null;
                        } else {
                            abstractC0696b2 = abstractC0696b;
                        }
                        if (i26 != 0) {
                            j16 = C10023k.f50982c;
                        } else {
                            j16 = j12;
                        }
                        if (i28 != 0) {
                            c9798h2 = null;
                        } else {
                            c9798h2 = c9798h;
                        }
                        if (i30 == 0) {
                        }
                        if (i32 != 0) {
                            j17 = C10023k.f50982c;
                        } else {
                            j17 = j13;
                        }
                        if (i35 != 0) {
                            i44 = 1;
                        } else {
                            i44 = i10;
                        }
                        if (i38 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if (i40 != 0) {
                            i45 = Integer.MAX_VALUE;
                        } else {
                            i45 = i11;
                        }
                        if (i41 != 0) {
                            mapM13459L0 = C6753d.m13459L0();
                            i37 &= -57345;
                        } else {
                            mapM13459L0 = map;
                        }
                        if (i42 != 0) {
                            interfaceC2052l2 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.material3.TextKt$Text$3
                                @Override // cm.InterfaceC2052l
                                /* JADX INFO: renamed from: n */
                                public final C9072e mo528n(C7216j c7216j) {
                                    C5207g.m11111f(c7216j, "it");
                                    return C9072e.f47360a;
                                }
                            };
                        } else {
                            interfaceC2052l2 = interfaceC2052l;
                        }
                        if ((i14 & 65536) != 0) {
                            c7218l2 = (C7218l) composerImplMo1636j.mo1648p(f2808a);
                            i37 &= -3670017;
                        } else {
                            c7218l2 = c7218l;
                        }
                    }
                    composerImplMo1636j.m1610R();
                    InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q11 = ComposerKt.f3003a;
                    composerImplMo1636j.mo1622c(79587464);
                    j18 = C9169u.f47703f;
                    if (j14 != j18) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (z12) {
                        jM14529b = j14;
                    } else {
                        jM14529b = c7218l2.f40600a.m14529b();
                        if (jM14529b != j18) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (z13) {
                            jM14529b = ((C9169u) composerImplMo1636j.mo1648p(ContentColorKt.f2738a)).f47705a;
                        }
                    }
                    composerImplMo1636j.m1609Q(false);
                    C7218l c7218l14 = c7218l2;
                    int i5110 = (i15 & 112) | (i15 & 14) | 16777216 | ((i37 >> 6) & 7168);
                    int i5111 = i37 << 9;
                    BasicTextKt.m1530a(c0689a, interfaceC0500b2, c7218l14.m14544b(new C7218l(jM14529b, j15, c8476m2, c8471h2, abstractC0696b2, j16, c9798h2, c9797g2, j17, 175952)), interfaceC2052l2, i44, z11, i45, mapM13459L0, composerImplMo1636j, i5110 | (i5111 & 57344) | (i5111 & 458752) | (i5111 & 3670016), 0);
                    interfaceC0500b3 = interfaceC0500b2;
                    c9797g3 = c9797g2;
                    i46 = i45;
                    c7218l3 = c7218l14;
                    c8476m3 = c8476m2;
                    interfaceC2052l3 = interfaceC2052l2;
                    abstractC0696b3 = abstractC0696b2;
                    j19 = j17;
                    i47 = i44;
                    z14 = z11;
                    c8471h3 = c8471h2;
                    map2 = mapM13459L0;
                    j20 = j14;
                    j21 = j16;
                    j22 = j15;
                    c9798h3 = c9798h2;
                } else {
                    composerImplMo1636j.m1654s0();
                    if ((i12 & 1) != 0) {
                        if (i49 != 0) {
                            interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                        } else {
                            interfaceC0500b2 = interfaceC0500b;
                        }
                        if (i16 != 0) {
                            j14 = C9169u.f47703f;
                        } else {
                            j14 = j10;
                        }
                        if (i18 != 0) {
                            j15 = C10023k.f50982c;
                        } else {
                            j15 = j11;
                        }
                        if (i20 != 0) {
                            c8471h2 = null;
                        } else {
                            c8471h2 = c8471h;
                        }
                        if (i22 != 0) {
                            c8476m2 = null;
                        } else {
                            c8476m2 = c8476m;
                        }
                        if (i24 != 0) {
                            abstractC0696b2 = null;
                        } else {
                            abstractC0696b2 = abstractC0696b;
                        }
                        if (i26 != 0) {
                            j16 = C10023k.f50982c;
                        } else {
                            j16 = j12;
                        }
                        if (i28 != 0) {
                            c9798h2 = null;
                        } else {
                            c9798h2 = c9798h;
                        }
                        if (i30 == 0) {
                        }
                        if (i32 != 0) {
                            j17 = C10023k.f50982c;
                        } else {
                            j17 = j13;
                        }
                        if (i35 != 0) {
                            i44 = 1;
                        } else {
                            i44 = i10;
                        }
                        if (i38 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if (i40 != 0) {
                            i45 = Integer.MAX_VALUE;
                        } else {
                            i45 = i11;
                        }
                        if (i41 != 0) {
                            mapM13459L0 = C6753d.m13459L0();
                            i37 &= -57345;
                        } else {
                            mapM13459L0 = map;
                        }
                        if (i42 != 0) {
                            interfaceC2052l2 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.material3.TextKt$Text$3
                                @Override // cm.InterfaceC2052l
                                /* JADX INFO: renamed from: n */
                                public final C9072e mo528n(C7216j c7216j) {
                                    C5207g.m11111f(c7216j, "it");
                                    return C9072e.f47360a;
                                }
                            };
                        } else {
                            interfaceC2052l2 = interfaceC2052l;
                        }
                        if ((i14 & 65536) != 0) {
                            c7218l2 = (C7218l) composerImplMo1636j.mo1648p(f2808a);
                            i37 &= -3670017;
                        } else {
                            c7218l2 = c7218l;
                        }
                    } else {
                        if (i49 != 0) {
                            interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                        } else {
                            interfaceC0500b2 = interfaceC0500b;
                        }
                        if (i16 != 0) {
                            j14 = C9169u.f47703f;
                        } else {
                            j14 = j10;
                        }
                        if (i18 != 0) {
                            j15 = C10023k.f50982c;
                        } else {
                            j15 = j11;
                        }
                        if (i20 != 0) {
                            c8471h2 = null;
                        } else {
                            c8471h2 = c8471h;
                        }
                        if (i22 != 0) {
                            c8476m2 = null;
                        } else {
                            c8476m2 = c8476m;
                        }
                        if (i24 != 0) {
                            abstractC0696b2 = null;
                        } else {
                            abstractC0696b2 = abstractC0696b;
                        }
                        if (i26 != 0) {
                            j16 = C10023k.f50982c;
                        } else {
                            j16 = j12;
                        }
                        if (i28 != 0) {
                            c9798h2 = null;
                        } else {
                            c9798h2 = c9798h;
                        }
                        if (i30 == 0) {
                        }
                        if (i32 != 0) {
                            j17 = C10023k.f50982c;
                        } else {
                            j17 = j13;
                        }
                        if (i35 != 0) {
                            i44 = 1;
                        } else {
                            i44 = i10;
                        }
                        if (i38 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if (i40 != 0) {
                            i45 = Integer.MAX_VALUE;
                        } else {
                            i45 = i11;
                        }
                        if (i41 != 0) {
                            mapM13459L0 = C6753d.m13459L0();
                            i37 &= -57345;
                        } else {
                            mapM13459L0 = map;
                        }
                        if (i42 != 0) {
                            interfaceC2052l2 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.material3.TextKt$Text$3
                                @Override // cm.InterfaceC2052l
                                /* JADX INFO: renamed from: n */
                                public final C9072e mo528n(C7216j c7216j) {
                                    C5207g.m11111f(c7216j, "it");
                                    return C9072e.f47360a;
                                }
                            };
                        } else {
                            interfaceC2052l2 = interfaceC2052l;
                        }
                        if ((i14 & 65536) != 0) {
                            c7218l2 = (C7218l) composerImplMo1636j.mo1648p(f2808a);
                            i37 &= -3670017;
                        } else {
                            c7218l2 = c7218l;
                        }
                    }
                    composerImplMo1636j.m1610R();
                    InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q12 = ComposerKt.f3003a;
                    composerImplMo1636j.mo1622c(79587464);
                    j18 = C9169u.f47703f;
                    if (j14 != j18) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (z12) {
                        jM14529b = j14;
                    } else {
                        jM14529b = c7218l2.f40600a.m14529b();
                        if (jM14529b != j18) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (z13) {
                            jM14529b = ((C9169u) composerImplMo1636j.mo1648p(ContentColorKt.f2738a)).f47705a;
                        }
                    }
                    composerImplMo1636j.m1609Q(false);
                    C7218l c7218l15 = c7218l2;
                    int i5112 = (i15 & 112) | (i15 & 14) | 16777216 | ((i37 >> 6) & 7168);
                    int i5113 = i37 << 9;
                    BasicTextKt.m1530a(c0689a, interfaceC0500b2, c7218l15.m14544b(new C7218l(jM14529b, j15, c8476m2, c8471h2, abstractC0696b2, j16, c9798h2, c9797g2, j17, 175952)), interfaceC2052l2, i44, z11, i45, mapM13459L0, composerImplMo1636j, i5112 | (i5113 & 57344) | (i5113 & 458752) | (i5113 & 3670016), 0);
                    interfaceC0500b3 = interfaceC0500b2;
                    c9797g3 = c9797g2;
                    i46 = i45;
                    c7218l3 = c7218l15;
                    c8476m3 = c8476m2;
                    interfaceC2052l3 = interfaceC2052l2;
                    abstractC0696b3 = abstractC0696b2;
                    j19 = j17;
                    i47 = i44;
                    z14 = z11;
                    c8471h3 = c8471h2;
                    map2 = mapM13459L0;
                    j20 = j14;
                    j21 = j16;
                    j22 = j15;
                    c9798h3 = c9798h2;
                }
                c5332q0M1612T = composerImplMo1636j.m1612T();
                if (c5332q0M1612T == null) {
                    return;
                }
                c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.material3.TextKt$Text$4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // cm.InterfaceC2056p
                    /* JADX INFO: renamed from: m0 */
                    public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) throws Throwable {
                        num.intValue();
                        TextKt.m1575b(c0689a, interfaceC0500b3, j20, j22, c8471h3, c8476m3, abstractC0696b3, j21, c9798h3, c9797g3, j19, i47, z14, i46, map2, interfaceC2052l3, c7218l3, interfaceC0476a2, i12 | 1, i13, i14);
                        return C9072e.f47360a;
                    }
                };
            }
            i37 |= 3072;
            i41 = i14 & 16384;
            if (i41 != 0) {
                i37 |= 8192;
            }
            i42 = i14 & 32768;
            if (i42 != 0) {
                if ((i13 & 458752) == 0) {
                    if (composerImplMo1636j.mo1665y(interfaceC2052l)) {
                        i43 = 131072;
                    } else {
                        i43 = 65536;
                    }
                    i37 |= i43;
                }
                if ((i13 & 3670016) != 0) {
                    if ((i14 & 65536) == 0) {
                        i48 = 524288;
                    } else {
                        i48 = 524288;
                    }
                    i37 |= i48;
                }
                if (i41 != 16384) {
                    composerImplMo1636j.m1654s0();
                    if ((i12 & 1) != 0) {
                        if (i49 != 0) {
                            interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                        } else {
                            interfaceC0500b2 = interfaceC0500b;
                        }
                        if (i16 != 0) {
                            j14 = C9169u.f47703f;
                        } else {
                            j14 = j10;
                        }
                        if (i18 != 0) {
                            j15 = C10023k.f50982c;
                        } else {
                            j15 = j11;
                        }
                        if (i20 != 0) {
                            c8471h2 = null;
                        } else {
                            c8471h2 = c8471h;
                        }
                        if (i22 != 0) {
                            c8476m2 = null;
                        } else {
                            c8476m2 = c8476m;
                        }
                        if (i24 != 0) {
                            abstractC0696b2 = null;
                        } else {
                            abstractC0696b2 = abstractC0696b;
                        }
                        if (i26 != 0) {
                            j16 = C10023k.f50982c;
                        } else {
                            j16 = j12;
                        }
                        if (i28 != 0) {
                            c9798h2 = null;
                        } else {
                            c9798h2 = c9798h;
                        }
                        if (i30 == 0) {
                        }
                        if (i32 != 0) {
                            j17 = C10023k.f50982c;
                        } else {
                            j17 = j13;
                        }
                        if (i35 != 0) {
                            i44 = 1;
                        } else {
                            i44 = i10;
                        }
                        if (i38 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if (i40 != 0) {
                            i45 = Integer.MAX_VALUE;
                        } else {
                            i45 = i11;
                        }
                        if (i41 != 0) {
                            mapM13459L0 = C6753d.m13459L0();
                            i37 &= -57345;
                        } else {
                            mapM13459L0 = map;
                        }
                        if (i42 != 0) {
                            interfaceC2052l2 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.material3.TextKt$Text$3
                                @Override // cm.InterfaceC2052l
                                /* JADX INFO: renamed from: n */
                                public final C9072e mo528n(C7216j c7216j) {
                                    C5207g.m11111f(c7216j, "it");
                                    return C9072e.f47360a;
                                }
                            };
                        } else {
                            interfaceC2052l2 = interfaceC2052l;
                        }
                        if ((i14 & 65536) != 0) {
                            c7218l2 = (C7218l) composerImplMo1636j.mo1648p(f2808a);
                            i37 &= -3670017;
                        } else {
                            c7218l2 = c7218l;
                        }
                    } else {
                        if (i49 != 0) {
                            interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                        } else {
                            interfaceC0500b2 = interfaceC0500b;
                        }
                        if (i16 != 0) {
                            j14 = C9169u.f47703f;
                        } else {
                            j14 = j10;
                        }
                        if (i18 != 0) {
                            j15 = C10023k.f50982c;
                        } else {
                            j15 = j11;
                        }
                        if (i20 != 0) {
                            c8471h2 = null;
                        } else {
                            c8471h2 = c8471h;
                        }
                        if (i22 != 0) {
                            c8476m2 = null;
                        } else {
                            c8476m2 = c8476m;
                        }
                        if (i24 != 0) {
                            abstractC0696b2 = null;
                        } else {
                            abstractC0696b2 = abstractC0696b;
                        }
                        if (i26 != 0) {
                            j16 = C10023k.f50982c;
                        } else {
                            j16 = j12;
                        }
                        if (i28 != 0) {
                            c9798h2 = null;
                        } else {
                            c9798h2 = c9798h;
                        }
                        if (i30 == 0) {
                        }
                        if (i32 != 0) {
                            j17 = C10023k.f50982c;
                        } else {
                            j17 = j13;
                        }
                        if (i35 != 0) {
                            i44 = 1;
                        } else {
                            i44 = i10;
                        }
                        if (i38 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if (i40 != 0) {
                            i45 = Integer.MAX_VALUE;
                        } else {
                            i45 = i11;
                        }
                        if (i41 != 0) {
                            mapM13459L0 = C6753d.m13459L0();
                            i37 &= -57345;
                        } else {
                            mapM13459L0 = map;
                        }
                        if (i42 != 0) {
                            interfaceC2052l2 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.material3.TextKt$Text$3
                                @Override // cm.InterfaceC2052l
                                /* JADX INFO: renamed from: n */
                                public final C9072e mo528n(C7216j c7216j) {
                                    C5207g.m11111f(c7216j, "it");
                                    return C9072e.f47360a;
                                }
                            };
                        } else {
                            interfaceC2052l2 = interfaceC2052l;
                        }
                        if ((i14 & 65536) != 0) {
                            c7218l2 = (C7218l) composerImplMo1636j.mo1648p(f2808a);
                            i37 &= -3670017;
                        } else {
                            c7218l2 = c7218l;
                        }
                    }
                    composerImplMo1636j.m1610R();
                    InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q13 = ComposerKt.f3003a;
                    composerImplMo1636j.mo1622c(79587464);
                    j18 = C9169u.f47703f;
                    if (j14 != j18) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (z12) {
                        jM14529b = j14;
                    } else {
                        jM14529b = c7218l2.f40600a.m14529b();
                        if (jM14529b != j18) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (z13) {
                            jM14529b = ((C9169u) composerImplMo1636j.mo1648p(ContentColorKt.f2738a)).f47705a;
                        }
                    }
                    composerImplMo1636j.m1609Q(false);
                    C7218l c7218l16 = c7218l2;
                    int i5114 = (i15 & 112) | (i15 & 14) | 16777216 | ((i37 >> 6) & 7168);
                    int i5115 = i37 << 9;
                    BasicTextKt.m1530a(c0689a, interfaceC0500b2, c7218l16.m14544b(new C7218l(jM14529b, j15, c8476m2, c8471h2, abstractC0696b2, j16, c9798h2, c9797g2, j17, 175952)), interfaceC2052l2, i44, z11, i45, mapM13459L0, composerImplMo1636j, i5114 | (i5115 & 57344) | (i5115 & 458752) | (i5115 & 3670016), 0);
                    interfaceC0500b3 = interfaceC0500b2;
                    c9797g3 = c9797g2;
                    i46 = i45;
                    c7218l3 = c7218l16;
                    c8476m3 = c8476m2;
                    interfaceC2052l3 = interfaceC2052l2;
                    abstractC0696b3 = abstractC0696b2;
                    j19 = j17;
                    i47 = i44;
                    z14 = z11;
                    c8471h3 = c8471h2;
                    map2 = mapM13459L0;
                    j20 = j14;
                    j21 = j16;
                    j22 = j15;
                    c9798h3 = c9798h2;
                } else {
                    composerImplMo1636j.m1654s0();
                    if ((i12 & 1) != 0) {
                        if (i49 != 0) {
                            interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                        } else {
                            interfaceC0500b2 = interfaceC0500b;
                        }
                        if (i16 != 0) {
                            j14 = C9169u.f47703f;
                        } else {
                            j14 = j10;
                        }
                        if (i18 != 0) {
                            j15 = C10023k.f50982c;
                        } else {
                            j15 = j11;
                        }
                        if (i20 != 0) {
                            c8471h2 = null;
                        } else {
                            c8471h2 = c8471h;
                        }
                        if (i22 != 0) {
                            c8476m2 = null;
                        } else {
                            c8476m2 = c8476m;
                        }
                        if (i24 != 0) {
                            abstractC0696b2 = null;
                        } else {
                            abstractC0696b2 = abstractC0696b;
                        }
                        if (i26 != 0) {
                            j16 = C10023k.f50982c;
                        } else {
                            j16 = j12;
                        }
                        if (i28 != 0) {
                            c9798h2 = null;
                        } else {
                            c9798h2 = c9798h;
                        }
                        if (i30 == 0) {
                        }
                        if (i32 != 0) {
                            j17 = C10023k.f50982c;
                        } else {
                            j17 = j13;
                        }
                        if (i35 != 0) {
                            i44 = 1;
                        } else {
                            i44 = i10;
                        }
                        if (i38 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if (i40 != 0) {
                            i45 = Integer.MAX_VALUE;
                        } else {
                            i45 = i11;
                        }
                        if (i41 != 0) {
                            mapM13459L0 = C6753d.m13459L0();
                            i37 &= -57345;
                        } else {
                            mapM13459L0 = map;
                        }
                        if (i42 != 0) {
                            interfaceC2052l2 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.material3.TextKt$Text$3
                                @Override // cm.InterfaceC2052l
                                /* JADX INFO: renamed from: n */
                                public final C9072e mo528n(C7216j c7216j) {
                                    C5207g.m11111f(c7216j, "it");
                                    return C9072e.f47360a;
                                }
                            };
                        } else {
                            interfaceC2052l2 = interfaceC2052l;
                        }
                        if ((i14 & 65536) != 0) {
                            c7218l2 = (C7218l) composerImplMo1636j.mo1648p(f2808a);
                            i37 &= -3670017;
                        } else {
                            c7218l2 = c7218l;
                        }
                    } else {
                        if (i49 != 0) {
                            interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                        } else {
                            interfaceC0500b2 = interfaceC0500b;
                        }
                        if (i16 != 0) {
                            j14 = C9169u.f47703f;
                        } else {
                            j14 = j10;
                        }
                        if (i18 != 0) {
                            j15 = C10023k.f50982c;
                        } else {
                            j15 = j11;
                        }
                        if (i20 != 0) {
                            c8471h2 = null;
                        } else {
                            c8471h2 = c8471h;
                        }
                        if (i22 != 0) {
                            c8476m2 = null;
                        } else {
                            c8476m2 = c8476m;
                        }
                        if (i24 != 0) {
                            abstractC0696b2 = null;
                        } else {
                            abstractC0696b2 = abstractC0696b;
                        }
                        if (i26 != 0) {
                            j16 = C10023k.f50982c;
                        } else {
                            j16 = j12;
                        }
                        if (i28 != 0) {
                            c9798h2 = null;
                        } else {
                            c9798h2 = c9798h;
                        }
                        if (i30 == 0) {
                        }
                        if (i32 != 0) {
                            j17 = C10023k.f50982c;
                        } else {
                            j17 = j13;
                        }
                        if (i35 != 0) {
                            i44 = 1;
                        } else {
                            i44 = i10;
                        }
                        if (i38 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if (i40 != 0) {
                            i45 = Integer.MAX_VALUE;
                        } else {
                            i45 = i11;
                        }
                        if (i41 != 0) {
                            mapM13459L0 = C6753d.m13459L0();
                            i37 &= -57345;
                        } else {
                            mapM13459L0 = map;
                        }
                        if (i42 != 0) {
                            interfaceC2052l2 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.material3.TextKt$Text$3
                                @Override // cm.InterfaceC2052l
                                /* JADX INFO: renamed from: n */
                                public final C9072e mo528n(C7216j c7216j) {
                                    C5207g.m11111f(c7216j, "it");
                                    return C9072e.f47360a;
                                }
                            };
                        } else {
                            interfaceC2052l2 = interfaceC2052l;
                        }
                        if ((i14 & 65536) != 0) {
                            c7218l2 = (C7218l) composerImplMo1636j.mo1648p(f2808a);
                            i37 &= -3670017;
                        } else {
                            c7218l2 = c7218l;
                        }
                    }
                    composerImplMo1636j.m1610R();
                    InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q14 = ComposerKt.f3003a;
                    composerImplMo1636j.mo1622c(79587464);
                    j18 = C9169u.f47703f;
                    if (j14 != j18) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (z12) {
                        jM14529b = j14;
                    } else {
                        jM14529b = c7218l2.f40600a.m14529b();
                        if (jM14529b != j18) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (z13) {
                            jM14529b = ((C9169u) composerImplMo1636j.mo1648p(ContentColorKt.f2738a)).f47705a;
                        }
                    }
                    composerImplMo1636j.m1609Q(false);
                    C7218l c7218l17 = c7218l2;
                    int i5116 = (i15 & 112) | (i15 & 14) | 16777216 | ((i37 >> 6) & 7168);
                    int i5117 = i37 << 9;
                    BasicTextKt.m1530a(c0689a, interfaceC0500b2, c7218l17.m14544b(new C7218l(jM14529b, j15, c8476m2, c8471h2, abstractC0696b2, j16, c9798h2, c9797g2, j17, 175952)), interfaceC2052l2, i44, z11, i45, mapM13459L0, composerImplMo1636j, i5116 | (i5117 & 57344) | (i5117 & 458752) | (i5117 & 3670016), 0);
                    interfaceC0500b3 = interfaceC0500b2;
                    c9797g3 = c9797g2;
                    i46 = i45;
                    c7218l3 = c7218l17;
                    c8476m3 = c8476m2;
                    interfaceC2052l3 = interfaceC2052l2;
                    abstractC0696b3 = abstractC0696b2;
                    j19 = j17;
                    i47 = i44;
                    z14 = z11;
                    c8471h3 = c8471h2;
                    map2 = mapM13459L0;
                    j20 = j14;
                    j21 = j16;
                    j22 = j15;
                    c9798h3 = c9798h2;
                }
                c5332q0M1612T = composerImplMo1636j.m1612T();
                if (c5332q0M1612T == null) {
                    return;
                }
                c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.material3.TextKt$Text$4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // cm.InterfaceC2056p
                    /* JADX INFO: renamed from: m0 */
                    public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) throws Throwable {
                        num.intValue();
                        TextKt.m1575b(c0689a, interfaceC0500b3, j20, j22, c8471h3, c8476m3, abstractC0696b3, j21, c9798h3, c9797g3, j19, i47, z14, i46, map2, interfaceC2052l3, c7218l3, interfaceC0476a2, i12 | 1, i13, i14);
                        return C9072e.f47360a;
                    }
                };
            }
            i37 |= 196608;
            if ((i13 & 3670016) != 0) {
                if ((i14 & 65536) == 0) {
                    i48 = 524288;
                } else {
                    i48 = 524288;
                }
                i37 |= i48;
            }
            if (i41 != 16384) {
                composerImplMo1636j.m1654s0();
                if ((i12 & 1) != 0) {
                    if (i49 != 0) {
                        interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                    } else {
                        interfaceC0500b2 = interfaceC0500b;
                    }
                    if (i16 != 0) {
                        j14 = C9169u.f47703f;
                    } else {
                        j14 = j10;
                    }
                    if (i18 != 0) {
                        j15 = C10023k.f50982c;
                    } else {
                        j15 = j11;
                    }
                    if (i20 != 0) {
                        c8471h2 = null;
                    } else {
                        c8471h2 = c8471h;
                    }
                    if (i22 != 0) {
                        c8476m2 = null;
                    } else {
                        c8476m2 = c8476m;
                    }
                    if (i24 != 0) {
                        abstractC0696b2 = null;
                    } else {
                        abstractC0696b2 = abstractC0696b;
                    }
                    if (i26 != 0) {
                        j16 = C10023k.f50982c;
                    } else {
                        j16 = j12;
                    }
                    if (i28 != 0) {
                        c9798h2 = null;
                    } else {
                        c9798h2 = c9798h;
                    }
                    if (i30 == 0) {
                    }
                    if (i32 != 0) {
                        j17 = C10023k.f50982c;
                    } else {
                        j17 = j13;
                    }
                    if (i35 != 0) {
                        i44 = 1;
                    } else {
                        i44 = i10;
                    }
                    if (i38 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    if (i40 != 0) {
                        i45 = Integer.MAX_VALUE;
                    } else {
                        i45 = i11;
                    }
                    if (i41 != 0) {
                        mapM13459L0 = C6753d.m13459L0();
                        i37 &= -57345;
                    } else {
                        mapM13459L0 = map;
                    }
                    if (i42 != 0) {
                        interfaceC2052l2 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.material3.TextKt$Text$3
                            @Override // cm.InterfaceC2052l
                            /* JADX INFO: renamed from: n */
                            public final C9072e mo528n(C7216j c7216j) {
                                C5207g.m11111f(c7216j, "it");
                                return C9072e.f47360a;
                            }
                        };
                    } else {
                        interfaceC2052l2 = interfaceC2052l;
                    }
                    if ((i14 & 65536) != 0) {
                        c7218l2 = (C7218l) composerImplMo1636j.mo1648p(f2808a);
                        i37 &= -3670017;
                    } else {
                        c7218l2 = c7218l;
                    }
                } else {
                    if (i49 != 0) {
                        interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                    } else {
                        interfaceC0500b2 = interfaceC0500b;
                    }
                    if (i16 != 0) {
                        j14 = C9169u.f47703f;
                    } else {
                        j14 = j10;
                    }
                    if (i18 != 0) {
                        j15 = C10023k.f50982c;
                    } else {
                        j15 = j11;
                    }
                    if (i20 != 0) {
                        c8471h2 = null;
                    } else {
                        c8471h2 = c8471h;
                    }
                    if (i22 != 0) {
                        c8476m2 = null;
                    } else {
                        c8476m2 = c8476m;
                    }
                    if (i24 != 0) {
                        abstractC0696b2 = null;
                    } else {
                        abstractC0696b2 = abstractC0696b;
                    }
                    if (i26 != 0) {
                        j16 = C10023k.f50982c;
                    } else {
                        j16 = j12;
                    }
                    if (i28 != 0) {
                        c9798h2 = null;
                    } else {
                        c9798h2 = c9798h;
                    }
                    if (i30 == 0) {
                    }
                    if (i32 != 0) {
                        j17 = C10023k.f50982c;
                    } else {
                        j17 = j13;
                    }
                    if (i35 != 0) {
                        i44 = 1;
                    } else {
                        i44 = i10;
                    }
                    if (i38 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    if (i40 != 0) {
                        i45 = Integer.MAX_VALUE;
                    } else {
                        i45 = i11;
                    }
                    if (i41 != 0) {
                        mapM13459L0 = C6753d.m13459L0();
                        i37 &= -57345;
                    } else {
                        mapM13459L0 = map;
                    }
                    if (i42 != 0) {
                        interfaceC2052l2 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.material3.TextKt$Text$3
                            @Override // cm.InterfaceC2052l
                            /* JADX INFO: renamed from: n */
                            public final C9072e mo528n(C7216j c7216j) {
                                C5207g.m11111f(c7216j, "it");
                                return C9072e.f47360a;
                            }
                        };
                    } else {
                        interfaceC2052l2 = interfaceC2052l;
                    }
                    if ((i14 & 65536) != 0) {
                        c7218l2 = (C7218l) composerImplMo1636j.mo1648p(f2808a);
                        i37 &= -3670017;
                    } else {
                        c7218l2 = c7218l;
                    }
                }
                composerImplMo1636j.m1610R();
                InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q15 = ComposerKt.f3003a;
                composerImplMo1636j.mo1622c(79587464);
                j18 = C9169u.f47703f;
                if (j14 != j18) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (z12) {
                    jM14529b = j14;
                } else {
                    jM14529b = c7218l2.f40600a.m14529b();
                    if (jM14529b != j18) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (z13) {
                        jM14529b = ((C9169u) composerImplMo1636j.mo1648p(ContentColorKt.f2738a)).f47705a;
                    }
                }
                composerImplMo1636j.m1609Q(false);
                C7218l c7218l18 = c7218l2;
                int i5118 = (i15 & 112) | (i15 & 14) | 16777216 | ((i37 >> 6) & 7168);
                int i5119 = i37 << 9;
                BasicTextKt.m1530a(c0689a, interfaceC0500b2, c7218l18.m14544b(new C7218l(jM14529b, j15, c8476m2, c8471h2, abstractC0696b2, j16, c9798h2, c9797g2, j17, 175952)), interfaceC2052l2, i44, z11, i45, mapM13459L0, composerImplMo1636j, i5118 | (i5119 & 57344) | (i5119 & 458752) | (i5119 & 3670016), 0);
                interfaceC0500b3 = interfaceC0500b2;
                c9797g3 = c9797g2;
                i46 = i45;
                c7218l3 = c7218l18;
                c8476m3 = c8476m2;
                interfaceC2052l3 = interfaceC2052l2;
                abstractC0696b3 = abstractC0696b2;
                j19 = j17;
                i47 = i44;
                z14 = z11;
                c8471h3 = c8471h2;
                map2 = mapM13459L0;
                j20 = j14;
                j21 = j16;
                j22 = j15;
                c9798h3 = c9798h2;
            } else {
                composerImplMo1636j.m1654s0();
                if ((i12 & 1) != 0) {
                    if (i49 != 0) {
                        interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                    } else {
                        interfaceC0500b2 = interfaceC0500b;
                    }
                    if (i16 != 0) {
                        j14 = C9169u.f47703f;
                    } else {
                        j14 = j10;
                    }
                    if (i18 != 0) {
                        j15 = C10023k.f50982c;
                    } else {
                        j15 = j11;
                    }
                    if (i20 != 0) {
                        c8471h2 = null;
                    } else {
                        c8471h2 = c8471h;
                    }
                    if (i22 != 0) {
                        c8476m2 = null;
                    } else {
                        c8476m2 = c8476m;
                    }
                    if (i24 != 0) {
                        abstractC0696b2 = null;
                    } else {
                        abstractC0696b2 = abstractC0696b;
                    }
                    if (i26 != 0) {
                        j16 = C10023k.f50982c;
                    } else {
                        j16 = j12;
                    }
                    if (i28 != 0) {
                        c9798h2 = null;
                    } else {
                        c9798h2 = c9798h;
                    }
                    if (i30 == 0) {
                    }
                    if (i32 != 0) {
                        j17 = C10023k.f50982c;
                    } else {
                        j17 = j13;
                    }
                    if (i35 != 0) {
                        i44 = 1;
                    } else {
                        i44 = i10;
                    }
                    if (i38 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    if (i40 != 0) {
                        i45 = Integer.MAX_VALUE;
                    } else {
                        i45 = i11;
                    }
                    if (i41 != 0) {
                        mapM13459L0 = C6753d.m13459L0();
                        i37 &= -57345;
                    } else {
                        mapM13459L0 = map;
                    }
                    if (i42 != 0) {
                        interfaceC2052l2 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.material3.TextKt$Text$3
                            @Override // cm.InterfaceC2052l
                            /* JADX INFO: renamed from: n */
                            public final C9072e mo528n(C7216j c7216j) {
                                C5207g.m11111f(c7216j, "it");
                                return C9072e.f47360a;
                            }
                        };
                    } else {
                        interfaceC2052l2 = interfaceC2052l;
                    }
                    if ((i14 & 65536) != 0) {
                        c7218l2 = (C7218l) composerImplMo1636j.mo1648p(f2808a);
                        i37 &= -3670017;
                    } else {
                        c7218l2 = c7218l;
                    }
                } else {
                    if (i49 != 0) {
                        interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                    } else {
                        interfaceC0500b2 = interfaceC0500b;
                    }
                    if (i16 != 0) {
                        j14 = C9169u.f47703f;
                    } else {
                        j14 = j10;
                    }
                    if (i18 != 0) {
                        j15 = C10023k.f50982c;
                    } else {
                        j15 = j11;
                    }
                    if (i20 != 0) {
                        c8471h2 = null;
                    } else {
                        c8471h2 = c8471h;
                    }
                    if (i22 != 0) {
                        c8476m2 = null;
                    } else {
                        c8476m2 = c8476m;
                    }
                    if (i24 != 0) {
                        abstractC0696b2 = null;
                    } else {
                        abstractC0696b2 = abstractC0696b;
                    }
                    if (i26 != 0) {
                        j16 = C10023k.f50982c;
                    } else {
                        j16 = j12;
                    }
                    if (i28 != 0) {
                        c9798h2 = null;
                    } else {
                        c9798h2 = c9798h;
                    }
                    if (i30 == 0) {
                    }
                    if (i32 != 0) {
                        j17 = C10023k.f50982c;
                    } else {
                        j17 = j13;
                    }
                    if (i35 != 0) {
                        i44 = 1;
                    } else {
                        i44 = i10;
                    }
                    if (i38 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    if (i40 != 0) {
                        i45 = Integer.MAX_VALUE;
                    } else {
                        i45 = i11;
                    }
                    if (i41 != 0) {
                        mapM13459L0 = C6753d.m13459L0();
                        i37 &= -57345;
                    } else {
                        mapM13459L0 = map;
                    }
                    if (i42 != 0) {
                        interfaceC2052l2 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.material3.TextKt$Text$3
                            @Override // cm.InterfaceC2052l
                            /* JADX INFO: renamed from: n */
                            public final C9072e mo528n(C7216j c7216j) {
                                C5207g.m11111f(c7216j, "it");
                                return C9072e.f47360a;
                            }
                        };
                    } else {
                        interfaceC2052l2 = interfaceC2052l;
                    }
                    if ((i14 & 65536) != 0) {
                        c7218l2 = (C7218l) composerImplMo1636j.mo1648p(f2808a);
                        i37 &= -3670017;
                    } else {
                        c7218l2 = c7218l;
                    }
                }
                composerImplMo1636j.m1610R();
                InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q16 = ComposerKt.f3003a;
                composerImplMo1636j.mo1622c(79587464);
                j18 = C9169u.f47703f;
                if (j14 != j18) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (z12) {
                    jM14529b = j14;
                } else {
                    jM14529b = c7218l2.f40600a.m14529b();
                    if (jM14529b != j18) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (z13) {
                        jM14529b = ((C9169u) composerImplMo1636j.mo1648p(ContentColorKt.f2738a)).f47705a;
                    }
                }
                composerImplMo1636j.m1609Q(false);
                C7218l c7218l19 = c7218l2;
                int i51110 = (i15 & 112) | (i15 & 14) | 16777216 | ((i37 >> 6) & 7168);
                int i51111 = i37 << 9;
                BasicTextKt.m1530a(c0689a, interfaceC0500b2, c7218l19.m14544b(new C7218l(jM14529b, j15, c8476m2, c8471h2, abstractC0696b2, j16, c9798h2, c9797g2, j17, 175952)), interfaceC2052l2, i44, z11, i45, mapM13459L0, composerImplMo1636j, i51110 | (i51111 & 57344) | (i51111 & 458752) | (i51111 & 3670016), 0);
                interfaceC0500b3 = interfaceC0500b2;
                c9797g3 = c9797g2;
                i46 = i45;
                c7218l3 = c7218l19;
                c8476m3 = c8476m2;
                interfaceC2052l3 = interfaceC2052l2;
                abstractC0696b3 = abstractC0696b2;
                j19 = j17;
                i47 = i44;
                z14 = z11;
                c8471h3 = c8471h2;
                map2 = mapM13459L0;
                j20 = j14;
                j21 = j16;
                j22 = j15;
                c9798h3 = c9798h2;
            }
            c5332q0M1612T = composerImplMo1636j.m1612T();
            if (c5332q0M1612T == null) {
                return;
            }
            c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.material3.TextKt$Text$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // cm.InterfaceC2056p
                /* JADX INFO: renamed from: m0 */
                public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) throws Throwable {
                    num.intValue();
                    TextKt.m1575b(c0689a, interfaceC0500b3, j20, j22, c8471h3, c8476m3, abstractC0696b3, j21, c9798h3, c9797g3, j19, i47, z14, i46, map2, interfaceC2052l3, c7218l3, interfaceC0476a2, i12 | 1, i13, i14);
                    return C9072e.f47360a;
                }
            };
        }
        i15 |= 48;
        i16 = i14 & 4;
        if (i16 != 0) {
            i15 |= 384;
        } else if ((i12 & 896) == 0) {
            if (composerImplMo1636j.m1596F(j10)) {
                i17 = 256;
            } else {
                i17 = BuildConfig.SDK_TRUNCATE_LENGTH;
            }
            i15 |= i17;
        }
        i18 = i14 & 8;
        if (i18 != 0) {
            i15 |= 3072;
        } else if ((i12 & 7168) == 0) {
            if (composerImplMo1636j.m1596F(j11)) {
                i19 = 2048;
            } else {
                i19 = 1024;
            }
            i15 |= i19;
        }
        i20 = i14 & 16;
        if (i20 != 0) {
            i15 |= 24576;
        } else if ((i12 & 57344) == 0) {
            if (composerImplMo1636j.mo1665y(c8471h)) {
                i21 = 16384;
            } else {
                i21 = 8192;
            }
            i15 |= i21;
        }
        i22 = i14 & 32;
        if (i22 != 0) {
            i15 |= 196608;
        } else if ((i12 & 458752) == 0) {
            if (composerImplMo1636j.mo1665y(c8476m)) {
                i23 = 131072;
            } else {
                i23 = 65536;
            }
            i15 |= i23;
        }
        i24 = i14 & 64;
        if (i24 != 0) {
            i15 |= 1572864;
        } else if ((i12 & 3670016) == 0) {
            if (composerImplMo1636j.mo1665y(abstractC0696b)) {
                i25 = 1048576;
            } else {
                i25 = 524288;
            }
            i15 |= i25;
        }
        i26 = i14 & BuildConfig.SDK_TRUNCATE_LENGTH;
        if (i26 != 0) {
            i15 |= 12582912;
        } else if ((i12 & 29360128) == 0) {
            if (composerImplMo1636j.m1596F(j12)) {
                i27 = 8388608;
            } else {
                i27 = 4194304;
            }
            i15 |= i27;
        }
        i28 = i14 & 256;
        if (i28 != 0) {
            i15 |= 100663296;
        } else if ((i12 & 234881024) == 0) {
            if (composerImplMo1636j.mo1665y(c9798h)) {
                i29 = 67108864;
            } else {
                i29 = 33554432;
            }
            i15 |= i29;
        }
        i30 = i14 & 512;
        if (i30 != 0) {
            i15 |= 805306368;
        } else if ((i12 & 1879048192) == 0) {
            if (composerImplMo1636j.mo1665y(c9797g)) {
                i31 = 536870912;
            } else {
                i31 = 268435456;
            }
            i15 |= i31;
        }
        i32 = i14 & 1024;
        if (i32 != 0) {
            i33 = i13 | 6;
        } else if ((i13 & 14) == 0) {
            if (composerImplMo1636j.m1596F(j13)) {
                i34 = 4;
            } else {
                i34 = 2;
            }
            i33 = i13 | i34;
        } else {
            i33 = i13;
        }
        i35 = i14 & 2048;
        if (i35 != 0) {
            i33 |= 48;
        } else if ((i13 & 112) != 0) {
            if (composerImplMo1636j.m1594E(i10)) {
                i36 = 32;
            } else {
                i36 = 16;
            }
            i33 |= i36;
        }
        i37 = i33;
        i38 = i14 & 4096;
        if (i38 != 0) {
            if ((i13 & 896) == 0) {
                if (composerImplMo1636j.m1598G(z10)) {
                    i39 = 256;
                } else {
                    i39 = BuildConfig.SDK_TRUNCATE_LENGTH;
                }
                i37 |= i39;
            }
            i40 = i14 & 8192;
            if (i40 != 0) {
                if ((i13 & 7168) == 0) {
                    i37 |= composerImplMo1636j.m1594E(i11) ? 2048 : 1024;
                }
                i41 = i14 & 16384;
                if (i41 != 0) {
                    i37 |= 8192;
                }
                i42 = i14 & 32768;
                if (i42 != 0) {
                    if ((i13 & 458752) == 0) {
                        if (composerImplMo1636j.mo1665y(interfaceC2052l)) {
                            i43 = 131072;
                        } else {
                            i43 = 65536;
                        }
                        i37 |= i43;
                    }
                    if ((i13 & 3670016) != 0) {
                        if ((i14 & 65536) == 0) {
                            i48 = 524288;
                        } else {
                            i48 = 524288;
                        }
                        i37 |= i48;
                    }
                    if (i41 != 16384) {
                        composerImplMo1636j.m1654s0();
                        if ((i12 & 1) != 0) {
                            if (i49 != 0) {
                                interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                            } else {
                                interfaceC0500b2 = interfaceC0500b;
                            }
                            if (i16 != 0) {
                                j14 = C9169u.f47703f;
                            } else {
                                j14 = j10;
                            }
                            if (i18 != 0) {
                                j15 = C10023k.f50982c;
                            } else {
                                j15 = j11;
                            }
                            if (i20 != 0) {
                                c8471h2 = null;
                            } else {
                                c8471h2 = c8471h;
                            }
                            if (i22 != 0) {
                                c8476m2 = null;
                            } else {
                                c8476m2 = c8476m;
                            }
                            if (i24 != 0) {
                                abstractC0696b2 = null;
                            } else {
                                abstractC0696b2 = abstractC0696b;
                            }
                            if (i26 != 0) {
                                j16 = C10023k.f50982c;
                            } else {
                                j16 = j12;
                            }
                            if (i28 != 0) {
                                c9798h2 = null;
                            } else {
                                c9798h2 = c9798h;
                            }
                            if (i30 == 0) {
                            }
                            if (i32 != 0) {
                                j17 = C10023k.f50982c;
                            } else {
                                j17 = j13;
                            }
                            if (i35 != 0) {
                                i44 = 1;
                            } else {
                                i44 = i10;
                            }
                            if (i38 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            if (i40 != 0) {
                                i45 = Integer.MAX_VALUE;
                            } else {
                                i45 = i11;
                            }
                            if (i41 != 0) {
                                mapM13459L0 = C6753d.m13459L0();
                                i37 &= -57345;
                            } else {
                                mapM13459L0 = map;
                            }
                            if (i42 != 0) {
                                interfaceC2052l2 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.material3.TextKt$Text$3
                                    @Override // cm.InterfaceC2052l
                                    /* JADX INFO: renamed from: n */
                                    public final C9072e mo528n(C7216j c7216j) {
                                        C5207g.m11111f(c7216j, "it");
                                        return C9072e.f47360a;
                                    }
                                };
                            } else {
                                interfaceC2052l2 = interfaceC2052l;
                            }
                            if ((i14 & 65536) != 0) {
                                c7218l2 = (C7218l) composerImplMo1636j.mo1648p(f2808a);
                                i37 &= -3670017;
                            } else {
                                c7218l2 = c7218l;
                            }
                        } else {
                            if (i49 != 0) {
                                interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                            } else {
                                interfaceC0500b2 = interfaceC0500b;
                            }
                            if (i16 != 0) {
                                j14 = C9169u.f47703f;
                            } else {
                                j14 = j10;
                            }
                            if (i18 != 0) {
                                j15 = C10023k.f50982c;
                            } else {
                                j15 = j11;
                            }
                            if (i20 != 0) {
                                c8471h2 = null;
                            } else {
                                c8471h2 = c8471h;
                            }
                            if (i22 != 0) {
                                c8476m2 = null;
                            } else {
                                c8476m2 = c8476m;
                            }
                            if (i24 != 0) {
                                abstractC0696b2 = null;
                            } else {
                                abstractC0696b2 = abstractC0696b;
                            }
                            if (i26 != 0) {
                                j16 = C10023k.f50982c;
                            } else {
                                j16 = j12;
                            }
                            if (i28 != 0) {
                                c9798h2 = null;
                            } else {
                                c9798h2 = c9798h;
                            }
                            if (i30 == 0) {
                            }
                            if (i32 != 0) {
                                j17 = C10023k.f50982c;
                            } else {
                                j17 = j13;
                            }
                            if (i35 != 0) {
                                i44 = 1;
                            } else {
                                i44 = i10;
                            }
                            if (i38 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            if (i40 != 0) {
                                i45 = Integer.MAX_VALUE;
                            } else {
                                i45 = i11;
                            }
                            if (i41 != 0) {
                                mapM13459L0 = C6753d.m13459L0();
                                i37 &= -57345;
                            } else {
                                mapM13459L0 = map;
                            }
                            if (i42 != 0) {
                                interfaceC2052l2 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.material3.TextKt$Text$3
                                    @Override // cm.InterfaceC2052l
                                    /* JADX INFO: renamed from: n */
                                    public final C9072e mo528n(C7216j c7216j) {
                                        C5207g.m11111f(c7216j, "it");
                                        return C9072e.f47360a;
                                    }
                                };
                            } else {
                                interfaceC2052l2 = interfaceC2052l;
                            }
                            if ((i14 & 65536) != 0) {
                                c7218l2 = (C7218l) composerImplMo1636j.mo1648p(f2808a);
                                i37 &= -3670017;
                            } else {
                                c7218l2 = c7218l;
                            }
                        }
                        composerImplMo1636j.m1610R();
                        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q17 = ComposerKt.f3003a;
                        composerImplMo1636j.mo1622c(79587464);
                        j18 = C9169u.f47703f;
                        if (j14 != j18) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (z12) {
                            jM14529b = j14;
                        } else {
                            jM14529b = c7218l2.f40600a.m14529b();
                            if (jM14529b != j18) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            if (z13) {
                                jM14529b = ((C9169u) composerImplMo1636j.mo1648p(ContentColorKt.f2738a)).f47705a;
                            }
                        }
                        composerImplMo1636j.m1609Q(false);
                        C7218l c7218l110 = c7218l2;
                        int i51112 = (i15 & 112) | (i15 & 14) | 16777216 | ((i37 >> 6) & 7168);
                        int i51113 = i37 << 9;
                        BasicTextKt.m1530a(c0689a, interfaceC0500b2, c7218l110.m14544b(new C7218l(jM14529b, j15, c8476m2, c8471h2, abstractC0696b2, j16, c9798h2, c9797g2, j17, 175952)), interfaceC2052l2, i44, z11, i45, mapM13459L0, composerImplMo1636j, i51112 | (i51113 & 57344) | (i51113 & 458752) | (i51113 & 3670016), 0);
                        interfaceC0500b3 = interfaceC0500b2;
                        c9797g3 = c9797g2;
                        i46 = i45;
                        c7218l3 = c7218l110;
                        c8476m3 = c8476m2;
                        interfaceC2052l3 = interfaceC2052l2;
                        abstractC0696b3 = abstractC0696b2;
                        j19 = j17;
                        i47 = i44;
                        z14 = z11;
                        c8471h3 = c8471h2;
                        map2 = mapM13459L0;
                        j20 = j14;
                        j21 = j16;
                        j22 = j15;
                        c9798h3 = c9798h2;
                    } else {
                        composerImplMo1636j.m1654s0();
                        if ((i12 & 1) != 0) {
                            if (i49 != 0) {
                                interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                            } else {
                                interfaceC0500b2 = interfaceC0500b;
                            }
                            if (i16 != 0) {
                                j14 = C9169u.f47703f;
                            } else {
                                j14 = j10;
                            }
                            if (i18 != 0) {
                                j15 = C10023k.f50982c;
                            } else {
                                j15 = j11;
                            }
                            if (i20 != 0) {
                                c8471h2 = null;
                            } else {
                                c8471h2 = c8471h;
                            }
                            if (i22 != 0) {
                                c8476m2 = null;
                            } else {
                                c8476m2 = c8476m;
                            }
                            if (i24 != 0) {
                                abstractC0696b2 = null;
                            } else {
                                abstractC0696b2 = abstractC0696b;
                            }
                            if (i26 != 0) {
                                j16 = C10023k.f50982c;
                            } else {
                                j16 = j12;
                            }
                            if (i28 != 0) {
                                c9798h2 = null;
                            } else {
                                c9798h2 = c9798h;
                            }
                            if (i30 == 0) {
                            }
                            if (i32 != 0) {
                                j17 = C10023k.f50982c;
                            } else {
                                j17 = j13;
                            }
                            if (i35 != 0) {
                                i44 = 1;
                            } else {
                                i44 = i10;
                            }
                            if (i38 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            if (i40 != 0) {
                                i45 = Integer.MAX_VALUE;
                            } else {
                                i45 = i11;
                            }
                            if (i41 != 0) {
                                mapM13459L0 = C6753d.m13459L0();
                                i37 &= -57345;
                            } else {
                                mapM13459L0 = map;
                            }
                            if (i42 != 0) {
                                interfaceC2052l2 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.material3.TextKt$Text$3
                                    @Override // cm.InterfaceC2052l
                                    /* JADX INFO: renamed from: n */
                                    public final C9072e mo528n(C7216j c7216j) {
                                        C5207g.m11111f(c7216j, "it");
                                        return C9072e.f47360a;
                                    }
                                };
                            } else {
                                interfaceC2052l2 = interfaceC2052l;
                            }
                            if ((i14 & 65536) != 0) {
                                c7218l2 = (C7218l) composerImplMo1636j.mo1648p(f2808a);
                                i37 &= -3670017;
                            } else {
                                c7218l2 = c7218l;
                            }
                        } else {
                            if (i49 != 0) {
                                interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                            } else {
                                interfaceC0500b2 = interfaceC0500b;
                            }
                            if (i16 != 0) {
                                j14 = C9169u.f47703f;
                            } else {
                                j14 = j10;
                            }
                            if (i18 != 0) {
                                j15 = C10023k.f50982c;
                            } else {
                                j15 = j11;
                            }
                            if (i20 != 0) {
                                c8471h2 = null;
                            } else {
                                c8471h2 = c8471h;
                            }
                            if (i22 != 0) {
                                c8476m2 = null;
                            } else {
                                c8476m2 = c8476m;
                            }
                            if (i24 != 0) {
                                abstractC0696b2 = null;
                            } else {
                                abstractC0696b2 = abstractC0696b;
                            }
                            if (i26 != 0) {
                                j16 = C10023k.f50982c;
                            } else {
                                j16 = j12;
                            }
                            if (i28 != 0) {
                                c9798h2 = null;
                            } else {
                                c9798h2 = c9798h;
                            }
                            if (i30 == 0) {
                            }
                            if (i32 != 0) {
                                j17 = C10023k.f50982c;
                            } else {
                                j17 = j13;
                            }
                            if (i35 != 0) {
                                i44 = 1;
                            } else {
                                i44 = i10;
                            }
                            if (i38 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            if (i40 != 0) {
                                i45 = Integer.MAX_VALUE;
                            } else {
                                i45 = i11;
                            }
                            if (i41 != 0) {
                                mapM13459L0 = C6753d.m13459L0();
                                i37 &= -57345;
                            } else {
                                mapM13459L0 = map;
                            }
                            if (i42 != 0) {
                                interfaceC2052l2 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.material3.TextKt$Text$3
                                    @Override // cm.InterfaceC2052l
                                    /* JADX INFO: renamed from: n */
                                    public final C9072e mo528n(C7216j c7216j) {
                                        C5207g.m11111f(c7216j, "it");
                                        return C9072e.f47360a;
                                    }
                                };
                            } else {
                                interfaceC2052l2 = interfaceC2052l;
                            }
                            if ((i14 & 65536) != 0) {
                                c7218l2 = (C7218l) composerImplMo1636j.mo1648p(f2808a);
                                i37 &= -3670017;
                            } else {
                                c7218l2 = c7218l;
                            }
                        }
                        composerImplMo1636j.m1610R();
                        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q18 = ComposerKt.f3003a;
                        composerImplMo1636j.mo1622c(79587464);
                        j18 = C9169u.f47703f;
                        if (j14 != j18) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (z12) {
                            jM14529b = j14;
                        } else {
                            jM14529b = c7218l2.f40600a.m14529b();
                            if (jM14529b != j18) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            if (z13) {
                                jM14529b = ((C9169u) composerImplMo1636j.mo1648p(ContentColorKt.f2738a)).f47705a;
                            }
                        }
                        composerImplMo1636j.m1609Q(false);
                        C7218l c7218l111 = c7218l2;
                        int i51114 = (i15 & 112) | (i15 & 14) | 16777216 | ((i37 >> 6) & 7168);
                        int i51115 = i37 << 9;
                        BasicTextKt.m1530a(c0689a, interfaceC0500b2, c7218l111.m14544b(new C7218l(jM14529b, j15, c8476m2, c8471h2, abstractC0696b2, j16, c9798h2, c9797g2, j17, 175952)), interfaceC2052l2, i44, z11, i45, mapM13459L0, composerImplMo1636j, i51114 | (i51115 & 57344) | (i51115 & 458752) | (i51115 & 3670016), 0);
                        interfaceC0500b3 = interfaceC0500b2;
                        c9797g3 = c9797g2;
                        i46 = i45;
                        c7218l3 = c7218l111;
                        c8476m3 = c8476m2;
                        interfaceC2052l3 = interfaceC2052l2;
                        abstractC0696b3 = abstractC0696b2;
                        j19 = j17;
                        i47 = i44;
                        z14 = z11;
                        c8471h3 = c8471h2;
                        map2 = mapM13459L0;
                        j20 = j14;
                        j21 = j16;
                        j22 = j15;
                        c9798h3 = c9798h2;
                    }
                    c5332q0M1612T = composerImplMo1636j.m1612T();
                    if (c5332q0M1612T == null) {
                        return;
                    }
                    c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.material3.TextKt$Text$4
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) throws Throwable {
                            num.intValue();
                            TextKt.m1575b(c0689a, interfaceC0500b3, j20, j22, c8471h3, c8476m3, abstractC0696b3, j21, c9798h3, c9797g3, j19, i47, z14, i46, map2, interfaceC2052l3, c7218l3, interfaceC0476a2, i12 | 1, i13, i14);
                            return C9072e.f47360a;
                        }
                    };
                }
                i37 |= 196608;
                if ((i13 & 3670016) != 0) {
                    if ((i14 & 65536) == 0) {
                        i48 = 524288;
                    } else {
                        i48 = 524288;
                    }
                    i37 |= i48;
                }
                if (i41 != 16384) {
                    composerImplMo1636j.m1654s0();
                    if ((i12 & 1) != 0) {
                        if (i49 != 0) {
                            interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                        } else {
                            interfaceC0500b2 = interfaceC0500b;
                        }
                        if (i16 != 0) {
                            j14 = C9169u.f47703f;
                        } else {
                            j14 = j10;
                        }
                        if (i18 != 0) {
                            j15 = C10023k.f50982c;
                        } else {
                            j15 = j11;
                        }
                        if (i20 != 0) {
                            c8471h2 = null;
                        } else {
                            c8471h2 = c8471h;
                        }
                        if (i22 != 0) {
                            c8476m2 = null;
                        } else {
                            c8476m2 = c8476m;
                        }
                        if (i24 != 0) {
                            abstractC0696b2 = null;
                        } else {
                            abstractC0696b2 = abstractC0696b;
                        }
                        if (i26 != 0) {
                            j16 = C10023k.f50982c;
                        } else {
                            j16 = j12;
                        }
                        if (i28 != 0) {
                            c9798h2 = null;
                        } else {
                            c9798h2 = c9798h;
                        }
                        if (i30 == 0) {
                        }
                        if (i32 != 0) {
                            j17 = C10023k.f50982c;
                        } else {
                            j17 = j13;
                        }
                        if (i35 != 0) {
                            i44 = 1;
                        } else {
                            i44 = i10;
                        }
                        if (i38 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if (i40 != 0) {
                            i45 = Integer.MAX_VALUE;
                        } else {
                            i45 = i11;
                        }
                        if (i41 != 0) {
                            mapM13459L0 = C6753d.m13459L0();
                            i37 &= -57345;
                        } else {
                            mapM13459L0 = map;
                        }
                        if (i42 != 0) {
                            interfaceC2052l2 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.material3.TextKt$Text$3
                                @Override // cm.InterfaceC2052l
                                /* JADX INFO: renamed from: n */
                                public final C9072e mo528n(C7216j c7216j) {
                                    C5207g.m11111f(c7216j, "it");
                                    return C9072e.f47360a;
                                }
                            };
                        } else {
                            interfaceC2052l2 = interfaceC2052l;
                        }
                        if ((i14 & 65536) != 0) {
                            c7218l2 = (C7218l) composerImplMo1636j.mo1648p(f2808a);
                            i37 &= -3670017;
                        } else {
                            c7218l2 = c7218l;
                        }
                    } else {
                        if (i49 != 0) {
                            interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                        } else {
                            interfaceC0500b2 = interfaceC0500b;
                        }
                        if (i16 != 0) {
                            j14 = C9169u.f47703f;
                        } else {
                            j14 = j10;
                        }
                        if (i18 != 0) {
                            j15 = C10023k.f50982c;
                        } else {
                            j15 = j11;
                        }
                        if (i20 != 0) {
                            c8471h2 = null;
                        } else {
                            c8471h2 = c8471h;
                        }
                        if (i22 != 0) {
                            c8476m2 = null;
                        } else {
                            c8476m2 = c8476m;
                        }
                        if (i24 != 0) {
                            abstractC0696b2 = null;
                        } else {
                            abstractC0696b2 = abstractC0696b;
                        }
                        if (i26 != 0) {
                            j16 = C10023k.f50982c;
                        } else {
                            j16 = j12;
                        }
                        if (i28 != 0) {
                            c9798h2 = null;
                        } else {
                            c9798h2 = c9798h;
                        }
                        if (i30 == 0) {
                        }
                        if (i32 != 0) {
                            j17 = C10023k.f50982c;
                        } else {
                            j17 = j13;
                        }
                        if (i35 != 0) {
                            i44 = 1;
                        } else {
                            i44 = i10;
                        }
                        if (i38 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if (i40 != 0) {
                            i45 = Integer.MAX_VALUE;
                        } else {
                            i45 = i11;
                        }
                        if (i41 != 0) {
                            mapM13459L0 = C6753d.m13459L0();
                            i37 &= -57345;
                        } else {
                            mapM13459L0 = map;
                        }
                        if (i42 != 0) {
                            interfaceC2052l2 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.material3.TextKt$Text$3
                                @Override // cm.InterfaceC2052l
                                /* JADX INFO: renamed from: n */
                                public final C9072e mo528n(C7216j c7216j) {
                                    C5207g.m11111f(c7216j, "it");
                                    return C9072e.f47360a;
                                }
                            };
                        } else {
                            interfaceC2052l2 = interfaceC2052l;
                        }
                        if ((i14 & 65536) != 0) {
                            c7218l2 = (C7218l) composerImplMo1636j.mo1648p(f2808a);
                            i37 &= -3670017;
                        } else {
                            c7218l2 = c7218l;
                        }
                    }
                    composerImplMo1636j.m1610R();
                    InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q19 = ComposerKt.f3003a;
                    composerImplMo1636j.mo1622c(79587464);
                    j18 = C9169u.f47703f;
                    if (j14 != j18) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (z12) {
                        jM14529b = j14;
                    } else {
                        jM14529b = c7218l2.f40600a.m14529b();
                        if (jM14529b != j18) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (z13) {
                            jM14529b = ((C9169u) composerImplMo1636j.mo1648p(ContentColorKt.f2738a)).f47705a;
                        }
                    }
                    composerImplMo1636j.m1609Q(false);
                    C7218l c7218l112 = c7218l2;
                    int i51116 = (i15 & 112) | (i15 & 14) | 16777216 | ((i37 >> 6) & 7168);
                    int i51117 = i37 << 9;
                    BasicTextKt.m1530a(c0689a, interfaceC0500b2, c7218l112.m14544b(new C7218l(jM14529b, j15, c8476m2, c8471h2, abstractC0696b2, j16, c9798h2, c9797g2, j17, 175952)), interfaceC2052l2, i44, z11, i45, mapM13459L0, composerImplMo1636j, i51116 | (i51117 & 57344) | (i51117 & 458752) | (i51117 & 3670016), 0);
                    interfaceC0500b3 = interfaceC0500b2;
                    c9797g3 = c9797g2;
                    i46 = i45;
                    c7218l3 = c7218l112;
                    c8476m3 = c8476m2;
                    interfaceC2052l3 = interfaceC2052l2;
                    abstractC0696b3 = abstractC0696b2;
                    j19 = j17;
                    i47 = i44;
                    z14 = z11;
                    c8471h3 = c8471h2;
                    map2 = mapM13459L0;
                    j20 = j14;
                    j21 = j16;
                    j22 = j15;
                    c9798h3 = c9798h2;
                } else {
                    composerImplMo1636j.m1654s0();
                    if ((i12 & 1) != 0) {
                        if (i49 != 0) {
                            interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                        } else {
                            interfaceC0500b2 = interfaceC0500b;
                        }
                        if (i16 != 0) {
                            j14 = C9169u.f47703f;
                        } else {
                            j14 = j10;
                        }
                        if (i18 != 0) {
                            j15 = C10023k.f50982c;
                        } else {
                            j15 = j11;
                        }
                        if (i20 != 0) {
                            c8471h2 = null;
                        } else {
                            c8471h2 = c8471h;
                        }
                        if (i22 != 0) {
                            c8476m2 = null;
                        } else {
                            c8476m2 = c8476m;
                        }
                        if (i24 != 0) {
                            abstractC0696b2 = null;
                        } else {
                            abstractC0696b2 = abstractC0696b;
                        }
                        if (i26 != 0) {
                            j16 = C10023k.f50982c;
                        } else {
                            j16 = j12;
                        }
                        if (i28 != 0) {
                            c9798h2 = null;
                        } else {
                            c9798h2 = c9798h;
                        }
                        if (i30 == 0) {
                        }
                        if (i32 != 0) {
                            j17 = C10023k.f50982c;
                        } else {
                            j17 = j13;
                        }
                        if (i35 != 0) {
                            i44 = 1;
                        } else {
                            i44 = i10;
                        }
                        if (i38 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if (i40 != 0) {
                            i45 = Integer.MAX_VALUE;
                        } else {
                            i45 = i11;
                        }
                        if (i41 != 0) {
                            mapM13459L0 = C6753d.m13459L0();
                            i37 &= -57345;
                        } else {
                            mapM13459L0 = map;
                        }
                        if (i42 != 0) {
                            interfaceC2052l2 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.material3.TextKt$Text$3
                                @Override // cm.InterfaceC2052l
                                /* JADX INFO: renamed from: n */
                                public final C9072e mo528n(C7216j c7216j) {
                                    C5207g.m11111f(c7216j, "it");
                                    return C9072e.f47360a;
                                }
                            };
                        } else {
                            interfaceC2052l2 = interfaceC2052l;
                        }
                        if ((i14 & 65536) != 0) {
                            c7218l2 = (C7218l) composerImplMo1636j.mo1648p(f2808a);
                            i37 &= -3670017;
                        } else {
                            c7218l2 = c7218l;
                        }
                    } else {
                        if (i49 != 0) {
                            interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                        } else {
                            interfaceC0500b2 = interfaceC0500b;
                        }
                        if (i16 != 0) {
                            j14 = C9169u.f47703f;
                        } else {
                            j14 = j10;
                        }
                        if (i18 != 0) {
                            j15 = C10023k.f50982c;
                        } else {
                            j15 = j11;
                        }
                        if (i20 != 0) {
                            c8471h2 = null;
                        } else {
                            c8471h2 = c8471h;
                        }
                        if (i22 != 0) {
                            c8476m2 = null;
                        } else {
                            c8476m2 = c8476m;
                        }
                        if (i24 != 0) {
                            abstractC0696b2 = null;
                        } else {
                            abstractC0696b2 = abstractC0696b;
                        }
                        if (i26 != 0) {
                            j16 = C10023k.f50982c;
                        } else {
                            j16 = j12;
                        }
                        if (i28 != 0) {
                            c9798h2 = null;
                        } else {
                            c9798h2 = c9798h;
                        }
                        if (i30 == 0) {
                        }
                        if (i32 != 0) {
                            j17 = C10023k.f50982c;
                        } else {
                            j17 = j13;
                        }
                        if (i35 != 0) {
                            i44 = 1;
                        } else {
                            i44 = i10;
                        }
                        if (i38 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if (i40 != 0) {
                            i45 = Integer.MAX_VALUE;
                        } else {
                            i45 = i11;
                        }
                        if (i41 != 0) {
                            mapM13459L0 = C6753d.m13459L0();
                            i37 &= -57345;
                        } else {
                            mapM13459L0 = map;
                        }
                        if (i42 != 0) {
                            interfaceC2052l2 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.material3.TextKt$Text$3
                                @Override // cm.InterfaceC2052l
                                /* JADX INFO: renamed from: n */
                                public final C9072e mo528n(C7216j c7216j) {
                                    C5207g.m11111f(c7216j, "it");
                                    return C9072e.f47360a;
                                }
                            };
                        } else {
                            interfaceC2052l2 = interfaceC2052l;
                        }
                        if ((i14 & 65536) != 0) {
                            c7218l2 = (C7218l) composerImplMo1636j.mo1648p(f2808a);
                            i37 &= -3670017;
                        } else {
                            c7218l2 = c7218l;
                        }
                    }
                    composerImplMo1636j.m1610R();
                    InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q110 = ComposerKt.f3003a;
                    composerImplMo1636j.mo1622c(79587464);
                    j18 = C9169u.f47703f;
                    if (j14 != j18) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (z12) {
                        jM14529b = j14;
                    } else {
                        jM14529b = c7218l2.f40600a.m14529b();
                        if (jM14529b != j18) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (z13) {
                            jM14529b = ((C9169u) composerImplMo1636j.mo1648p(ContentColorKt.f2738a)).f47705a;
                        }
                    }
                    composerImplMo1636j.m1609Q(false);
                    C7218l c7218l113 = c7218l2;
                    int i51118 = (i15 & 112) | (i15 & 14) | 16777216 | ((i37 >> 6) & 7168);
                    int i51119 = i37 << 9;
                    BasicTextKt.m1530a(c0689a, interfaceC0500b2, c7218l113.m14544b(new C7218l(jM14529b, j15, c8476m2, c8471h2, abstractC0696b2, j16, c9798h2, c9797g2, j17, 175952)), interfaceC2052l2, i44, z11, i45, mapM13459L0, composerImplMo1636j, i51118 | (i51119 & 57344) | (i51119 & 458752) | (i51119 & 3670016), 0);
                    interfaceC0500b3 = interfaceC0500b2;
                    c9797g3 = c9797g2;
                    i46 = i45;
                    c7218l3 = c7218l113;
                    c8476m3 = c8476m2;
                    interfaceC2052l3 = interfaceC2052l2;
                    abstractC0696b3 = abstractC0696b2;
                    j19 = j17;
                    i47 = i44;
                    z14 = z11;
                    c8471h3 = c8471h2;
                    map2 = mapM13459L0;
                    j20 = j14;
                    j21 = j16;
                    j22 = j15;
                    c9798h3 = c9798h2;
                }
                c5332q0M1612T = composerImplMo1636j.m1612T();
                if (c5332q0M1612T == null) {
                    return;
                }
                c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.material3.TextKt$Text$4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // cm.InterfaceC2056p
                    /* JADX INFO: renamed from: m0 */
                    public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) throws Throwable {
                        num.intValue();
                        TextKt.m1575b(c0689a, interfaceC0500b3, j20, j22, c8471h3, c8476m3, abstractC0696b3, j21, c9798h3, c9797g3, j19, i47, z14, i46, map2, interfaceC2052l3, c7218l3, interfaceC0476a2, i12 | 1, i13, i14);
                        return C9072e.f47360a;
                    }
                };
            }
            i37 |= 3072;
            i41 = i14 & 16384;
            if (i41 != 0) {
                i37 |= 8192;
            }
            i42 = i14 & 32768;
            if (i42 != 0) {
                if ((i13 & 458752) == 0) {
                    if (composerImplMo1636j.mo1665y(interfaceC2052l)) {
                        i43 = 131072;
                    } else {
                        i43 = 65536;
                    }
                    i37 |= i43;
                }
                if ((i13 & 3670016) != 0) {
                    if ((i14 & 65536) == 0) {
                        i48 = 524288;
                    } else {
                        i48 = 524288;
                    }
                    i37 |= i48;
                }
                if (i41 != 16384) {
                    composerImplMo1636j.m1654s0();
                    if ((i12 & 1) != 0) {
                        if (i49 != 0) {
                            interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                        } else {
                            interfaceC0500b2 = interfaceC0500b;
                        }
                        if (i16 != 0) {
                            j14 = C9169u.f47703f;
                        } else {
                            j14 = j10;
                        }
                        if (i18 != 0) {
                            j15 = C10023k.f50982c;
                        } else {
                            j15 = j11;
                        }
                        if (i20 != 0) {
                            c8471h2 = null;
                        } else {
                            c8471h2 = c8471h;
                        }
                        if (i22 != 0) {
                            c8476m2 = null;
                        } else {
                            c8476m2 = c8476m;
                        }
                        if (i24 != 0) {
                            abstractC0696b2 = null;
                        } else {
                            abstractC0696b2 = abstractC0696b;
                        }
                        if (i26 != 0) {
                            j16 = C10023k.f50982c;
                        } else {
                            j16 = j12;
                        }
                        if (i28 != 0) {
                            c9798h2 = null;
                        } else {
                            c9798h2 = c9798h;
                        }
                        if (i30 == 0) {
                        }
                        if (i32 != 0) {
                            j17 = C10023k.f50982c;
                        } else {
                            j17 = j13;
                        }
                        if (i35 != 0) {
                            i44 = 1;
                        } else {
                            i44 = i10;
                        }
                        if (i38 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if (i40 != 0) {
                            i45 = Integer.MAX_VALUE;
                        } else {
                            i45 = i11;
                        }
                        if (i41 != 0) {
                            mapM13459L0 = C6753d.m13459L0();
                            i37 &= -57345;
                        } else {
                            mapM13459L0 = map;
                        }
                        if (i42 != 0) {
                            interfaceC2052l2 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.material3.TextKt$Text$3
                                @Override // cm.InterfaceC2052l
                                /* JADX INFO: renamed from: n */
                                public final C9072e mo528n(C7216j c7216j) {
                                    C5207g.m11111f(c7216j, "it");
                                    return C9072e.f47360a;
                                }
                            };
                        } else {
                            interfaceC2052l2 = interfaceC2052l;
                        }
                        if ((i14 & 65536) != 0) {
                            c7218l2 = (C7218l) composerImplMo1636j.mo1648p(f2808a);
                            i37 &= -3670017;
                        } else {
                            c7218l2 = c7218l;
                        }
                    } else {
                        if (i49 != 0) {
                            interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                        } else {
                            interfaceC0500b2 = interfaceC0500b;
                        }
                        if (i16 != 0) {
                            j14 = C9169u.f47703f;
                        } else {
                            j14 = j10;
                        }
                        if (i18 != 0) {
                            j15 = C10023k.f50982c;
                        } else {
                            j15 = j11;
                        }
                        if (i20 != 0) {
                            c8471h2 = null;
                        } else {
                            c8471h2 = c8471h;
                        }
                        if (i22 != 0) {
                            c8476m2 = null;
                        } else {
                            c8476m2 = c8476m;
                        }
                        if (i24 != 0) {
                            abstractC0696b2 = null;
                        } else {
                            abstractC0696b2 = abstractC0696b;
                        }
                        if (i26 != 0) {
                            j16 = C10023k.f50982c;
                        } else {
                            j16 = j12;
                        }
                        if (i28 != 0) {
                            c9798h2 = null;
                        } else {
                            c9798h2 = c9798h;
                        }
                        if (i30 == 0) {
                        }
                        if (i32 != 0) {
                            j17 = C10023k.f50982c;
                        } else {
                            j17 = j13;
                        }
                        if (i35 != 0) {
                            i44 = 1;
                        } else {
                            i44 = i10;
                        }
                        if (i38 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if (i40 != 0) {
                            i45 = Integer.MAX_VALUE;
                        } else {
                            i45 = i11;
                        }
                        if (i41 != 0) {
                            mapM13459L0 = C6753d.m13459L0();
                            i37 &= -57345;
                        } else {
                            mapM13459L0 = map;
                        }
                        if (i42 != 0) {
                            interfaceC2052l2 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.material3.TextKt$Text$3
                                @Override // cm.InterfaceC2052l
                                /* JADX INFO: renamed from: n */
                                public final C9072e mo528n(C7216j c7216j) {
                                    C5207g.m11111f(c7216j, "it");
                                    return C9072e.f47360a;
                                }
                            };
                        } else {
                            interfaceC2052l2 = interfaceC2052l;
                        }
                        if ((i14 & 65536) != 0) {
                            c7218l2 = (C7218l) composerImplMo1636j.mo1648p(f2808a);
                            i37 &= -3670017;
                        } else {
                            c7218l2 = c7218l;
                        }
                    }
                    composerImplMo1636j.m1610R();
                    InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q111 = ComposerKt.f3003a;
                    composerImplMo1636j.mo1622c(79587464);
                    j18 = C9169u.f47703f;
                    if (j14 != j18) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (z12) {
                        jM14529b = j14;
                    } else {
                        jM14529b = c7218l2.f40600a.m14529b();
                        if (jM14529b != j18) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (z13) {
                            jM14529b = ((C9169u) composerImplMo1636j.mo1648p(ContentColorKt.f2738a)).f47705a;
                        }
                    }
                    composerImplMo1636j.m1609Q(false);
                    C7218l c7218l114 = c7218l2;
                    int i511110 = (i15 & 112) | (i15 & 14) | 16777216 | ((i37 >> 6) & 7168);
                    int i511111 = i37 << 9;
                    BasicTextKt.m1530a(c0689a, interfaceC0500b2, c7218l114.m14544b(new C7218l(jM14529b, j15, c8476m2, c8471h2, abstractC0696b2, j16, c9798h2, c9797g2, j17, 175952)), interfaceC2052l2, i44, z11, i45, mapM13459L0, composerImplMo1636j, i511110 | (i511111 & 57344) | (i511111 & 458752) | (i511111 & 3670016), 0);
                    interfaceC0500b3 = interfaceC0500b2;
                    c9797g3 = c9797g2;
                    i46 = i45;
                    c7218l3 = c7218l114;
                    c8476m3 = c8476m2;
                    interfaceC2052l3 = interfaceC2052l2;
                    abstractC0696b3 = abstractC0696b2;
                    j19 = j17;
                    i47 = i44;
                    z14 = z11;
                    c8471h3 = c8471h2;
                    map2 = mapM13459L0;
                    j20 = j14;
                    j21 = j16;
                    j22 = j15;
                    c9798h3 = c9798h2;
                } else {
                    composerImplMo1636j.m1654s0();
                    if ((i12 & 1) != 0) {
                        if (i49 != 0) {
                            interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                        } else {
                            interfaceC0500b2 = interfaceC0500b;
                        }
                        if (i16 != 0) {
                            j14 = C9169u.f47703f;
                        } else {
                            j14 = j10;
                        }
                        if (i18 != 0) {
                            j15 = C10023k.f50982c;
                        } else {
                            j15 = j11;
                        }
                        if (i20 != 0) {
                            c8471h2 = null;
                        } else {
                            c8471h2 = c8471h;
                        }
                        if (i22 != 0) {
                            c8476m2 = null;
                        } else {
                            c8476m2 = c8476m;
                        }
                        if (i24 != 0) {
                            abstractC0696b2 = null;
                        } else {
                            abstractC0696b2 = abstractC0696b;
                        }
                        if (i26 != 0) {
                            j16 = C10023k.f50982c;
                        } else {
                            j16 = j12;
                        }
                        if (i28 != 0) {
                            c9798h2 = null;
                        } else {
                            c9798h2 = c9798h;
                        }
                        if (i30 == 0) {
                        }
                        if (i32 != 0) {
                            j17 = C10023k.f50982c;
                        } else {
                            j17 = j13;
                        }
                        if (i35 != 0) {
                            i44 = 1;
                        } else {
                            i44 = i10;
                        }
                        if (i38 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if (i40 != 0) {
                            i45 = Integer.MAX_VALUE;
                        } else {
                            i45 = i11;
                        }
                        if (i41 != 0) {
                            mapM13459L0 = C6753d.m13459L0();
                            i37 &= -57345;
                        } else {
                            mapM13459L0 = map;
                        }
                        if (i42 != 0) {
                            interfaceC2052l2 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.material3.TextKt$Text$3
                                @Override // cm.InterfaceC2052l
                                /* JADX INFO: renamed from: n */
                                public final C9072e mo528n(C7216j c7216j) {
                                    C5207g.m11111f(c7216j, "it");
                                    return C9072e.f47360a;
                                }
                            };
                        } else {
                            interfaceC2052l2 = interfaceC2052l;
                        }
                        if ((i14 & 65536) != 0) {
                            c7218l2 = (C7218l) composerImplMo1636j.mo1648p(f2808a);
                            i37 &= -3670017;
                        } else {
                            c7218l2 = c7218l;
                        }
                    } else {
                        if (i49 != 0) {
                            interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                        } else {
                            interfaceC0500b2 = interfaceC0500b;
                        }
                        if (i16 != 0) {
                            j14 = C9169u.f47703f;
                        } else {
                            j14 = j10;
                        }
                        if (i18 != 0) {
                            j15 = C10023k.f50982c;
                        } else {
                            j15 = j11;
                        }
                        if (i20 != 0) {
                            c8471h2 = null;
                        } else {
                            c8471h2 = c8471h;
                        }
                        if (i22 != 0) {
                            c8476m2 = null;
                        } else {
                            c8476m2 = c8476m;
                        }
                        if (i24 != 0) {
                            abstractC0696b2 = null;
                        } else {
                            abstractC0696b2 = abstractC0696b;
                        }
                        if (i26 != 0) {
                            j16 = C10023k.f50982c;
                        } else {
                            j16 = j12;
                        }
                        if (i28 != 0) {
                            c9798h2 = null;
                        } else {
                            c9798h2 = c9798h;
                        }
                        if (i30 == 0) {
                        }
                        if (i32 != 0) {
                            j17 = C10023k.f50982c;
                        } else {
                            j17 = j13;
                        }
                        if (i35 != 0) {
                            i44 = 1;
                        } else {
                            i44 = i10;
                        }
                        if (i38 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if (i40 != 0) {
                            i45 = Integer.MAX_VALUE;
                        } else {
                            i45 = i11;
                        }
                        if (i41 != 0) {
                            mapM13459L0 = C6753d.m13459L0();
                            i37 &= -57345;
                        } else {
                            mapM13459L0 = map;
                        }
                        if (i42 != 0) {
                            interfaceC2052l2 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.material3.TextKt$Text$3
                                @Override // cm.InterfaceC2052l
                                /* JADX INFO: renamed from: n */
                                public final C9072e mo528n(C7216j c7216j) {
                                    C5207g.m11111f(c7216j, "it");
                                    return C9072e.f47360a;
                                }
                            };
                        } else {
                            interfaceC2052l2 = interfaceC2052l;
                        }
                        if ((i14 & 65536) != 0) {
                            c7218l2 = (C7218l) composerImplMo1636j.mo1648p(f2808a);
                            i37 &= -3670017;
                        } else {
                            c7218l2 = c7218l;
                        }
                    }
                    composerImplMo1636j.m1610R();
                    InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q112 = ComposerKt.f3003a;
                    composerImplMo1636j.mo1622c(79587464);
                    j18 = C9169u.f47703f;
                    if (j14 != j18) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (z12) {
                        jM14529b = j14;
                    } else {
                        jM14529b = c7218l2.f40600a.m14529b();
                        if (jM14529b != j18) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (z13) {
                            jM14529b = ((C9169u) composerImplMo1636j.mo1648p(ContentColorKt.f2738a)).f47705a;
                        }
                    }
                    composerImplMo1636j.m1609Q(false);
                    C7218l c7218l115 = c7218l2;
                    int i511112 = (i15 & 112) | (i15 & 14) | 16777216 | ((i37 >> 6) & 7168);
                    int i511113 = i37 << 9;
                    BasicTextKt.m1530a(c0689a, interfaceC0500b2, c7218l115.m14544b(new C7218l(jM14529b, j15, c8476m2, c8471h2, abstractC0696b2, j16, c9798h2, c9797g2, j17, 175952)), interfaceC2052l2, i44, z11, i45, mapM13459L0, composerImplMo1636j, i511112 | (i511113 & 57344) | (i511113 & 458752) | (i511113 & 3670016), 0);
                    interfaceC0500b3 = interfaceC0500b2;
                    c9797g3 = c9797g2;
                    i46 = i45;
                    c7218l3 = c7218l115;
                    c8476m3 = c8476m2;
                    interfaceC2052l3 = interfaceC2052l2;
                    abstractC0696b3 = abstractC0696b2;
                    j19 = j17;
                    i47 = i44;
                    z14 = z11;
                    c8471h3 = c8471h2;
                    map2 = mapM13459L0;
                    j20 = j14;
                    j21 = j16;
                    j22 = j15;
                    c9798h3 = c9798h2;
                }
                c5332q0M1612T = composerImplMo1636j.m1612T();
                if (c5332q0M1612T == null) {
                    return;
                }
                c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.material3.TextKt$Text$4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // cm.InterfaceC2056p
                    /* JADX INFO: renamed from: m0 */
                    public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) throws Throwable {
                        num.intValue();
                        TextKt.m1575b(c0689a, interfaceC0500b3, j20, j22, c8471h3, c8476m3, abstractC0696b3, j21, c9798h3, c9797g3, j19, i47, z14, i46, map2, interfaceC2052l3, c7218l3, interfaceC0476a2, i12 | 1, i13, i14);
                        return C9072e.f47360a;
                    }
                };
            }
            i37 |= 196608;
            if ((i13 & 3670016) != 0) {
                if ((i14 & 65536) == 0) {
                    i48 = 524288;
                } else {
                    i48 = 524288;
                }
                i37 |= i48;
            }
            if (i41 != 16384) {
                composerImplMo1636j.m1654s0();
                if ((i12 & 1) != 0) {
                    if (i49 != 0) {
                        interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                    } else {
                        interfaceC0500b2 = interfaceC0500b;
                    }
                    if (i16 != 0) {
                        j14 = C9169u.f47703f;
                    } else {
                        j14 = j10;
                    }
                    if (i18 != 0) {
                        j15 = C10023k.f50982c;
                    } else {
                        j15 = j11;
                    }
                    if (i20 != 0) {
                        c8471h2 = null;
                    } else {
                        c8471h2 = c8471h;
                    }
                    if (i22 != 0) {
                        c8476m2 = null;
                    } else {
                        c8476m2 = c8476m;
                    }
                    if (i24 != 0) {
                        abstractC0696b2 = null;
                    } else {
                        abstractC0696b2 = abstractC0696b;
                    }
                    if (i26 != 0) {
                        j16 = C10023k.f50982c;
                    } else {
                        j16 = j12;
                    }
                    if (i28 != 0) {
                        c9798h2 = null;
                    } else {
                        c9798h2 = c9798h;
                    }
                    if (i30 == 0) {
                    }
                    if (i32 != 0) {
                        j17 = C10023k.f50982c;
                    } else {
                        j17 = j13;
                    }
                    if (i35 != 0) {
                        i44 = 1;
                    } else {
                        i44 = i10;
                    }
                    if (i38 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    if (i40 != 0) {
                        i45 = Integer.MAX_VALUE;
                    } else {
                        i45 = i11;
                    }
                    if (i41 != 0) {
                        mapM13459L0 = C6753d.m13459L0();
                        i37 &= -57345;
                    } else {
                        mapM13459L0 = map;
                    }
                    if (i42 != 0) {
                        interfaceC2052l2 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.material3.TextKt$Text$3
                            @Override // cm.InterfaceC2052l
                            /* JADX INFO: renamed from: n */
                            public final C9072e mo528n(C7216j c7216j) {
                                C5207g.m11111f(c7216j, "it");
                                return C9072e.f47360a;
                            }
                        };
                    } else {
                        interfaceC2052l2 = interfaceC2052l;
                    }
                    if ((i14 & 65536) != 0) {
                        c7218l2 = (C7218l) composerImplMo1636j.mo1648p(f2808a);
                        i37 &= -3670017;
                    } else {
                        c7218l2 = c7218l;
                    }
                } else {
                    if (i49 != 0) {
                        interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                    } else {
                        interfaceC0500b2 = interfaceC0500b;
                    }
                    if (i16 != 0) {
                        j14 = C9169u.f47703f;
                    } else {
                        j14 = j10;
                    }
                    if (i18 != 0) {
                        j15 = C10023k.f50982c;
                    } else {
                        j15 = j11;
                    }
                    if (i20 != 0) {
                        c8471h2 = null;
                    } else {
                        c8471h2 = c8471h;
                    }
                    if (i22 != 0) {
                        c8476m2 = null;
                    } else {
                        c8476m2 = c8476m;
                    }
                    if (i24 != 0) {
                        abstractC0696b2 = null;
                    } else {
                        abstractC0696b2 = abstractC0696b;
                    }
                    if (i26 != 0) {
                        j16 = C10023k.f50982c;
                    } else {
                        j16 = j12;
                    }
                    if (i28 != 0) {
                        c9798h2 = null;
                    } else {
                        c9798h2 = c9798h;
                    }
                    if (i30 == 0) {
                    }
                    if (i32 != 0) {
                        j17 = C10023k.f50982c;
                    } else {
                        j17 = j13;
                    }
                    if (i35 != 0) {
                        i44 = 1;
                    } else {
                        i44 = i10;
                    }
                    if (i38 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    if (i40 != 0) {
                        i45 = Integer.MAX_VALUE;
                    } else {
                        i45 = i11;
                    }
                    if (i41 != 0) {
                        mapM13459L0 = C6753d.m13459L0();
                        i37 &= -57345;
                    } else {
                        mapM13459L0 = map;
                    }
                    if (i42 != 0) {
                        interfaceC2052l2 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.material3.TextKt$Text$3
                            @Override // cm.InterfaceC2052l
                            /* JADX INFO: renamed from: n */
                            public final C9072e mo528n(C7216j c7216j) {
                                C5207g.m11111f(c7216j, "it");
                                return C9072e.f47360a;
                            }
                        };
                    } else {
                        interfaceC2052l2 = interfaceC2052l;
                    }
                    if ((i14 & 65536) != 0) {
                        c7218l2 = (C7218l) composerImplMo1636j.mo1648p(f2808a);
                        i37 &= -3670017;
                    } else {
                        c7218l2 = c7218l;
                    }
                }
                composerImplMo1636j.m1610R();
                InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q113 = ComposerKt.f3003a;
                composerImplMo1636j.mo1622c(79587464);
                j18 = C9169u.f47703f;
                if (j14 != j18) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (z12) {
                    jM14529b = j14;
                } else {
                    jM14529b = c7218l2.f40600a.m14529b();
                    if (jM14529b != j18) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (z13) {
                        jM14529b = ((C9169u) composerImplMo1636j.mo1648p(ContentColorKt.f2738a)).f47705a;
                    }
                }
                composerImplMo1636j.m1609Q(false);
                C7218l c7218l116 = c7218l2;
                int i511114 = (i15 & 112) | (i15 & 14) | 16777216 | ((i37 >> 6) & 7168);
                int i511115 = i37 << 9;
                BasicTextKt.m1530a(c0689a, interfaceC0500b2, c7218l116.m14544b(new C7218l(jM14529b, j15, c8476m2, c8471h2, abstractC0696b2, j16, c9798h2, c9797g2, j17, 175952)), interfaceC2052l2, i44, z11, i45, mapM13459L0, composerImplMo1636j, i511114 | (i511115 & 57344) | (i511115 & 458752) | (i511115 & 3670016), 0);
                interfaceC0500b3 = interfaceC0500b2;
                c9797g3 = c9797g2;
                i46 = i45;
                c7218l3 = c7218l116;
                c8476m3 = c8476m2;
                interfaceC2052l3 = interfaceC2052l2;
                abstractC0696b3 = abstractC0696b2;
                j19 = j17;
                i47 = i44;
                z14 = z11;
                c8471h3 = c8471h2;
                map2 = mapM13459L0;
                j20 = j14;
                j21 = j16;
                j22 = j15;
                c9798h3 = c9798h2;
            } else {
                composerImplMo1636j.m1654s0();
                if ((i12 & 1) != 0) {
                    if (i49 != 0) {
                        interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                    } else {
                        interfaceC0500b2 = interfaceC0500b;
                    }
                    if (i16 != 0) {
                        j14 = C9169u.f47703f;
                    } else {
                        j14 = j10;
                    }
                    if (i18 != 0) {
                        j15 = C10023k.f50982c;
                    } else {
                        j15 = j11;
                    }
                    if (i20 != 0) {
                        c8471h2 = null;
                    } else {
                        c8471h2 = c8471h;
                    }
                    if (i22 != 0) {
                        c8476m2 = null;
                    } else {
                        c8476m2 = c8476m;
                    }
                    if (i24 != 0) {
                        abstractC0696b2 = null;
                    } else {
                        abstractC0696b2 = abstractC0696b;
                    }
                    if (i26 != 0) {
                        j16 = C10023k.f50982c;
                    } else {
                        j16 = j12;
                    }
                    if (i28 != 0) {
                        c9798h2 = null;
                    } else {
                        c9798h2 = c9798h;
                    }
                    if (i30 == 0) {
                    }
                    if (i32 != 0) {
                        j17 = C10023k.f50982c;
                    } else {
                        j17 = j13;
                    }
                    if (i35 != 0) {
                        i44 = 1;
                    } else {
                        i44 = i10;
                    }
                    if (i38 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    if (i40 != 0) {
                        i45 = Integer.MAX_VALUE;
                    } else {
                        i45 = i11;
                    }
                    if (i41 != 0) {
                        mapM13459L0 = C6753d.m13459L0();
                        i37 &= -57345;
                    } else {
                        mapM13459L0 = map;
                    }
                    if (i42 != 0) {
                        interfaceC2052l2 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.material3.TextKt$Text$3
                            @Override // cm.InterfaceC2052l
                            /* JADX INFO: renamed from: n */
                            public final C9072e mo528n(C7216j c7216j) {
                                C5207g.m11111f(c7216j, "it");
                                return C9072e.f47360a;
                            }
                        };
                    } else {
                        interfaceC2052l2 = interfaceC2052l;
                    }
                    if ((i14 & 65536) != 0) {
                        c7218l2 = (C7218l) composerImplMo1636j.mo1648p(f2808a);
                        i37 &= -3670017;
                    } else {
                        c7218l2 = c7218l;
                    }
                } else {
                    if (i49 != 0) {
                        interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                    } else {
                        interfaceC0500b2 = interfaceC0500b;
                    }
                    if (i16 != 0) {
                        j14 = C9169u.f47703f;
                    } else {
                        j14 = j10;
                    }
                    if (i18 != 0) {
                        j15 = C10023k.f50982c;
                    } else {
                        j15 = j11;
                    }
                    if (i20 != 0) {
                        c8471h2 = null;
                    } else {
                        c8471h2 = c8471h;
                    }
                    if (i22 != 0) {
                        c8476m2 = null;
                    } else {
                        c8476m2 = c8476m;
                    }
                    if (i24 != 0) {
                        abstractC0696b2 = null;
                    } else {
                        abstractC0696b2 = abstractC0696b;
                    }
                    if (i26 != 0) {
                        j16 = C10023k.f50982c;
                    } else {
                        j16 = j12;
                    }
                    if (i28 != 0) {
                        c9798h2 = null;
                    } else {
                        c9798h2 = c9798h;
                    }
                    if (i30 == 0) {
                    }
                    if (i32 != 0) {
                        j17 = C10023k.f50982c;
                    } else {
                        j17 = j13;
                    }
                    if (i35 != 0) {
                        i44 = 1;
                    } else {
                        i44 = i10;
                    }
                    if (i38 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    if (i40 != 0) {
                        i45 = Integer.MAX_VALUE;
                    } else {
                        i45 = i11;
                    }
                    if (i41 != 0) {
                        mapM13459L0 = C6753d.m13459L0();
                        i37 &= -57345;
                    } else {
                        mapM13459L0 = map;
                    }
                    if (i42 != 0) {
                        interfaceC2052l2 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.material3.TextKt$Text$3
                            @Override // cm.InterfaceC2052l
                            /* JADX INFO: renamed from: n */
                            public final C9072e mo528n(C7216j c7216j) {
                                C5207g.m11111f(c7216j, "it");
                                return C9072e.f47360a;
                            }
                        };
                    } else {
                        interfaceC2052l2 = interfaceC2052l;
                    }
                    if ((i14 & 65536) != 0) {
                        c7218l2 = (C7218l) composerImplMo1636j.mo1648p(f2808a);
                        i37 &= -3670017;
                    } else {
                        c7218l2 = c7218l;
                    }
                }
                composerImplMo1636j.m1610R();
                InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q114 = ComposerKt.f3003a;
                composerImplMo1636j.mo1622c(79587464);
                j18 = C9169u.f47703f;
                if (j14 != j18) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (z12) {
                    jM14529b = j14;
                } else {
                    jM14529b = c7218l2.f40600a.m14529b();
                    if (jM14529b != j18) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (z13) {
                        jM14529b = ((C9169u) composerImplMo1636j.mo1648p(ContentColorKt.f2738a)).f47705a;
                    }
                }
                composerImplMo1636j.m1609Q(false);
                C7218l c7218l117 = c7218l2;
                int i511116 = (i15 & 112) | (i15 & 14) | 16777216 | ((i37 >> 6) & 7168);
                int i511117 = i37 << 9;
                BasicTextKt.m1530a(c0689a, interfaceC0500b2, c7218l117.m14544b(new C7218l(jM14529b, j15, c8476m2, c8471h2, abstractC0696b2, j16, c9798h2, c9797g2, j17, 175952)), interfaceC2052l2, i44, z11, i45, mapM13459L0, composerImplMo1636j, i511116 | (i511117 & 57344) | (i511117 & 458752) | (i511117 & 3670016), 0);
                interfaceC0500b3 = interfaceC0500b2;
                c9797g3 = c9797g2;
                i46 = i45;
                c7218l3 = c7218l117;
                c8476m3 = c8476m2;
                interfaceC2052l3 = interfaceC2052l2;
                abstractC0696b3 = abstractC0696b2;
                j19 = j17;
                i47 = i44;
                z14 = z11;
                c8471h3 = c8471h2;
                map2 = mapM13459L0;
                j20 = j14;
                j21 = j16;
                j22 = j15;
                c9798h3 = c9798h2;
            }
            c5332q0M1612T = composerImplMo1636j.m1612T();
            if (c5332q0M1612T == null) {
                return;
            }
            c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.material3.TextKt$Text$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // cm.InterfaceC2056p
                /* JADX INFO: renamed from: m0 */
                public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) throws Throwable {
                    num.intValue();
                    TextKt.m1575b(c0689a, interfaceC0500b3, j20, j22, c8471h3, c8476m3, abstractC0696b3, j21, c9798h3, c9797g3, j19, i47, z14, i46, map2, interfaceC2052l3, c7218l3, interfaceC0476a2, i12 | 1, i13, i14);
                    return C9072e.f47360a;
                }
            };
        }
        i37 |= 384;
        i40 = i14 & 8192;
        if (i40 != 0) {
            if ((i13 & 7168) == 0) {
                i37 |= composerImplMo1636j.m1594E(i11) ? 2048 : 1024;
            }
            i41 = i14 & 16384;
            if (i41 != 0) {
                i37 |= 8192;
            }
            i42 = i14 & 32768;
            if (i42 != 0) {
                if ((i13 & 458752) == 0) {
                    if (composerImplMo1636j.mo1665y(interfaceC2052l)) {
                        i43 = 131072;
                    } else {
                        i43 = 65536;
                    }
                    i37 |= i43;
                }
                if ((i13 & 3670016) != 0) {
                    if ((i14 & 65536) == 0) {
                        i48 = 524288;
                    } else {
                        i48 = 524288;
                    }
                    i37 |= i48;
                }
                if (i41 != 16384) {
                    composerImplMo1636j.m1654s0();
                    if ((i12 & 1) != 0) {
                        if (i49 != 0) {
                            interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                        } else {
                            interfaceC0500b2 = interfaceC0500b;
                        }
                        if (i16 != 0) {
                            j14 = C9169u.f47703f;
                        } else {
                            j14 = j10;
                        }
                        if (i18 != 0) {
                            j15 = C10023k.f50982c;
                        } else {
                            j15 = j11;
                        }
                        if (i20 != 0) {
                            c8471h2 = null;
                        } else {
                            c8471h2 = c8471h;
                        }
                        if (i22 != 0) {
                            c8476m2 = null;
                        } else {
                            c8476m2 = c8476m;
                        }
                        if (i24 != 0) {
                            abstractC0696b2 = null;
                        } else {
                            abstractC0696b2 = abstractC0696b;
                        }
                        if (i26 != 0) {
                            j16 = C10023k.f50982c;
                        } else {
                            j16 = j12;
                        }
                        if (i28 != 0) {
                            c9798h2 = null;
                        } else {
                            c9798h2 = c9798h;
                        }
                        if (i30 == 0) {
                        }
                        if (i32 != 0) {
                            j17 = C10023k.f50982c;
                        } else {
                            j17 = j13;
                        }
                        if (i35 != 0) {
                            i44 = 1;
                        } else {
                            i44 = i10;
                        }
                        if (i38 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if (i40 != 0) {
                            i45 = Integer.MAX_VALUE;
                        } else {
                            i45 = i11;
                        }
                        if (i41 != 0) {
                            mapM13459L0 = C6753d.m13459L0();
                            i37 &= -57345;
                        } else {
                            mapM13459L0 = map;
                        }
                        if (i42 != 0) {
                            interfaceC2052l2 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.material3.TextKt$Text$3
                                @Override // cm.InterfaceC2052l
                                /* JADX INFO: renamed from: n */
                                public final C9072e mo528n(C7216j c7216j) {
                                    C5207g.m11111f(c7216j, "it");
                                    return C9072e.f47360a;
                                }
                            };
                        } else {
                            interfaceC2052l2 = interfaceC2052l;
                        }
                        if ((i14 & 65536) != 0) {
                            c7218l2 = (C7218l) composerImplMo1636j.mo1648p(f2808a);
                            i37 &= -3670017;
                        } else {
                            c7218l2 = c7218l;
                        }
                    } else {
                        if (i49 != 0) {
                            interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                        } else {
                            interfaceC0500b2 = interfaceC0500b;
                        }
                        if (i16 != 0) {
                            j14 = C9169u.f47703f;
                        } else {
                            j14 = j10;
                        }
                        if (i18 != 0) {
                            j15 = C10023k.f50982c;
                        } else {
                            j15 = j11;
                        }
                        if (i20 != 0) {
                            c8471h2 = null;
                        } else {
                            c8471h2 = c8471h;
                        }
                        if (i22 != 0) {
                            c8476m2 = null;
                        } else {
                            c8476m2 = c8476m;
                        }
                        if (i24 != 0) {
                            abstractC0696b2 = null;
                        } else {
                            abstractC0696b2 = abstractC0696b;
                        }
                        if (i26 != 0) {
                            j16 = C10023k.f50982c;
                        } else {
                            j16 = j12;
                        }
                        if (i28 != 0) {
                            c9798h2 = null;
                        } else {
                            c9798h2 = c9798h;
                        }
                        if (i30 == 0) {
                        }
                        if (i32 != 0) {
                            j17 = C10023k.f50982c;
                        } else {
                            j17 = j13;
                        }
                        if (i35 != 0) {
                            i44 = 1;
                        } else {
                            i44 = i10;
                        }
                        if (i38 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if (i40 != 0) {
                            i45 = Integer.MAX_VALUE;
                        } else {
                            i45 = i11;
                        }
                        if (i41 != 0) {
                            mapM13459L0 = C6753d.m13459L0();
                            i37 &= -57345;
                        } else {
                            mapM13459L0 = map;
                        }
                        if (i42 != 0) {
                            interfaceC2052l2 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.material3.TextKt$Text$3
                                @Override // cm.InterfaceC2052l
                                /* JADX INFO: renamed from: n */
                                public final C9072e mo528n(C7216j c7216j) {
                                    C5207g.m11111f(c7216j, "it");
                                    return C9072e.f47360a;
                                }
                            };
                        } else {
                            interfaceC2052l2 = interfaceC2052l;
                        }
                        if ((i14 & 65536) != 0) {
                            c7218l2 = (C7218l) composerImplMo1636j.mo1648p(f2808a);
                            i37 &= -3670017;
                        } else {
                            c7218l2 = c7218l;
                        }
                    }
                    composerImplMo1636j.m1610R();
                    InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q115 = ComposerKt.f3003a;
                    composerImplMo1636j.mo1622c(79587464);
                    j18 = C9169u.f47703f;
                    if (j14 != j18) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (z12) {
                        jM14529b = j14;
                    } else {
                        jM14529b = c7218l2.f40600a.m14529b();
                        if (jM14529b != j18) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (z13) {
                            jM14529b = ((C9169u) composerImplMo1636j.mo1648p(ContentColorKt.f2738a)).f47705a;
                        }
                    }
                    composerImplMo1636j.m1609Q(false);
                    C7218l c7218l118 = c7218l2;
                    int i511118 = (i15 & 112) | (i15 & 14) | 16777216 | ((i37 >> 6) & 7168);
                    int i511119 = i37 << 9;
                    BasicTextKt.m1530a(c0689a, interfaceC0500b2, c7218l118.m14544b(new C7218l(jM14529b, j15, c8476m2, c8471h2, abstractC0696b2, j16, c9798h2, c9797g2, j17, 175952)), interfaceC2052l2, i44, z11, i45, mapM13459L0, composerImplMo1636j, i511118 | (i511119 & 57344) | (i511119 & 458752) | (i511119 & 3670016), 0);
                    interfaceC0500b3 = interfaceC0500b2;
                    c9797g3 = c9797g2;
                    i46 = i45;
                    c7218l3 = c7218l118;
                    c8476m3 = c8476m2;
                    interfaceC2052l3 = interfaceC2052l2;
                    abstractC0696b3 = abstractC0696b2;
                    j19 = j17;
                    i47 = i44;
                    z14 = z11;
                    c8471h3 = c8471h2;
                    map2 = mapM13459L0;
                    j20 = j14;
                    j21 = j16;
                    j22 = j15;
                    c9798h3 = c9798h2;
                } else {
                    composerImplMo1636j.m1654s0();
                    if ((i12 & 1) != 0) {
                        if (i49 != 0) {
                            interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                        } else {
                            interfaceC0500b2 = interfaceC0500b;
                        }
                        if (i16 != 0) {
                            j14 = C9169u.f47703f;
                        } else {
                            j14 = j10;
                        }
                        if (i18 != 0) {
                            j15 = C10023k.f50982c;
                        } else {
                            j15 = j11;
                        }
                        if (i20 != 0) {
                            c8471h2 = null;
                        } else {
                            c8471h2 = c8471h;
                        }
                        if (i22 != 0) {
                            c8476m2 = null;
                        } else {
                            c8476m2 = c8476m;
                        }
                        if (i24 != 0) {
                            abstractC0696b2 = null;
                        } else {
                            abstractC0696b2 = abstractC0696b;
                        }
                        if (i26 != 0) {
                            j16 = C10023k.f50982c;
                        } else {
                            j16 = j12;
                        }
                        if (i28 != 0) {
                            c9798h2 = null;
                        } else {
                            c9798h2 = c9798h;
                        }
                        if (i30 == 0) {
                        }
                        if (i32 != 0) {
                            j17 = C10023k.f50982c;
                        } else {
                            j17 = j13;
                        }
                        if (i35 != 0) {
                            i44 = 1;
                        } else {
                            i44 = i10;
                        }
                        if (i38 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if (i40 != 0) {
                            i45 = Integer.MAX_VALUE;
                        } else {
                            i45 = i11;
                        }
                        if (i41 != 0) {
                            mapM13459L0 = C6753d.m13459L0();
                            i37 &= -57345;
                        } else {
                            mapM13459L0 = map;
                        }
                        if (i42 != 0) {
                            interfaceC2052l2 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.material3.TextKt$Text$3
                                @Override // cm.InterfaceC2052l
                                /* JADX INFO: renamed from: n */
                                public final C9072e mo528n(C7216j c7216j) {
                                    C5207g.m11111f(c7216j, "it");
                                    return C9072e.f47360a;
                                }
                            };
                        } else {
                            interfaceC2052l2 = interfaceC2052l;
                        }
                        if ((i14 & 65536) != 0) {
                            c7218l2 = (C7218l) composerImplMo1636j.mo1648p(f2808a);
                            i37 &= -3670017;
                        } else {
                            c7218l2 = c7218l;
                        }
                    } else {
                        if (i49 != 0) {
                            interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                        } else {
                            interfaceC0500b2 = interfaceC0500b;
                        }
                        if (i16 != 0) {
                            j14 = C9169u.f47703f;
                        } else {
                            j14 = j10;
                        }
                        if (i18 != 0) {
                            j15 = C10023k.f50982c;
                        } else {
                            j15 = j11;
                        }
                        if (i20 != 0) {
                            c8471h2 = null;
                        } else {
                            c8471h2 = c8471h;
                        }
                        if (i22 != 0) {
                            c8476m2 = null;
                        } else {
                            c8476m2 = c8476m;
                        }
                        if (i24 != 0) {
                            abstractC0696b2 = null;
                        } else {
                            abstractC0696b2 = abstractC0696b;
                        }
                        if (i26 != 0) {
                            j16 = C10023k.f50982c;
                        } else {
                            j16 = j12;
                        }
                        if (i28 != 0) {
                            c9798h2 = null;
                        } else {
                            c9798h2 = c9798h;
                        }
                        if (i30 == 0) {
                        }
                        if (i32 != 0) {
                            j17 = C10023k.f50982c;
                        } else {
                            j17 = j13;
                        }
                        if (i35 != 0) {
                            i44 = 1;
                        } else {
                            i44 = i10;
                        }
                        if (i38 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if (i40 != 0) {
                            i45 = Integer.MAX_VALUE;
                        } else {
                            i45 = i11;
                        }
                        if (i41 != 0) {
                            mapM13459L0 = C6753d.m13459L0();
                            i37 &= -57345;
                        } else {
                            mapM13459L0 = map;
                        }
                        if (i42 != 0) {
                            interfaceC2052l2 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.material3.TextKt$Text$3
                                @Override // cm.InterfaceC2052l
                                /* JADX INFO: renamed from: n */
                                public final C9072e mo528n(C7216j c7216j) {
                                    C5207g.m11111f(c7216j, "it");
                                    return C9072e.f47360a;
                                }
                            };
                        } else {
                            interfaceC2052l2 = interfaceC2052l;
                        }
                        if ((i14 & 65536) != 0) {
                            c7218l2 = (C7218l) composerImplMo1636j.mo1648p(f2808a);
                            i37 &= -3670017;
                        } else {
                            c7218l2 = c7218l;
                        }
                    }
                    composerImplMo1636j.m1610R();
                    InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q116 = ComposerKt.f3003a;
                    composerImplMo1636j.mo1622c(79587464);
                    j18 = C9169u.f47703f;
                    if (j14 != j18) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (z12) {
                        jM14529b = j14;
                    } else {
                        jM14529b = c7218l2.f40600a.m14529b();
                        if (jM14529b != j18) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (z13) {
                            jM14529b = ((C9169u) composerImplMo1636j.mo1648p(ContentColorKt.f2738a)).f47705a;
                        }
                    }
                    composerImplMo1636j.m1609Q(false);
                    C7218l c7218l119 = c7218l2;
                    int i5111110 = (i15 & 112) | (i15 & 14) | 16777216 | ((i37 >> 6) & 7168);
                    int i5111111 = i37 << 9;
                    BasicTextKt.m1530a(c0689a, interfaceC0500b2, c7218l119.m14544b(new C7218l(jM14529b, j15, c8476m2, c8471h2, abstractC0696b2, j16, c9798h2, c9797g2, j17, 175952)), interfaceC2052l2, i44, z11, i45, mapM13459L0, composerImplMo1636j, i5111110 | (i5111111 & 57344) | (i5111111 & 458752) | (i5111111 & 3670016), 0);
                    interfaceC0500b3 = interfaceC0500b2;
                    c9797g3 = c9797g2;
                    i46 = i45;
                    c7218l3 = c7218l119;
                    c8476m3 = c8476m2;
                    interfaceC2052l3 = interfaceC2052l2;
                    abstractC0696b3 = abstractC0696b2;
                    j19 = j17;
                    i47 = i44;
                    z14 = z11;
                    c8471h3 = c8471h2;
                    map2 = mapM13459L0;
                    j20 = j14;
                    j21 = j16;
                    j22 = j15;
                    c9798h3 = c9798h2;
                }
                c5332q0M1612T = composerImplMo1636j.m1612T();
                if (c5332q0M1612T == null) {
                    return;
                }
                c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.material3.TextKt$Text$4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // cm.InterfaceC2056p
                    /* JADX INFO: renamed from: m0 */
                    public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) throws Throwable {
                        num.intValue();
                        TextKt.m1575b(c0689a, interfaceC0500b3, j20, j22, c8471h3, c8476m3, abstractC0696b3, j21, c9798h3, c9797g3, j19, i47, z14, i46, map2, interfaceC2052l3, c7218l3, interfaceC0476a2, i12 | 1, i13, i14);
                        return C9072e.f47360a;
                    }
                };
            }
            i37 |= 196608;
            if ((i13 & 3670016) != 0) {
                if ((i14 & 65536) == 0) {
                    i48 = 524288;
                } else {
                    i48 = 524288;
                }
                i37 |= i48;
            }
            if (i41 != 16384) {
                composerImplMo1636j.m1654s0();
                if ((i12 & 1) != 0) {
                    if (i49 != 0) {
                        interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                    } else {
                        interfaceC0500b2 = interfaceC0500b;
                    }
                    if (i16 != 0) {
                        j14 = C9169u.f47703f;
                    } else {
                        j14 = j10;
                    }
                    if (i18 != 0) {
                        j15 = C10023k.f50982c;
                    } else {
                        j15 = j11;
                    }
                    if (i20 != 0) {
                        c8471h2 = null;
                    } else {
                        c8471h2 = c8471h;
                    }
                    if (i22 != 0) {
                        c8476m2 = null;
                    } else {
                        c8476m2 = c8476m;
                    }
                    if (i24 != 0) {
                        abstractC0696b2 = null;
                    } else {
                        abstractC0696b2 = abstractC0696b;
                    }
                    if (i26 != 0) {
                        j16 = C10023k.f50982c;
                    } else {
                        j16 = j12;
                    }
                    if (i28 != 0) {
                        c9798h2 = null;
                    } else {
                        c9798h2 = c9798h;
                    }
                    if (i30 == 0) {
                    }
                    if (i32 != 0) {
                        j17 = C10023k.f50982c;
                    } else {
                        j17 = j13;
                    }
                    if (i35 != 0) {
                        i44 = 1;
                    } else {
                        i44 = i10;
                    }
                    if (i38 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    if (i40 != 0) {
                        i45 = Integer.MAX_VALUE;
                    } else {
                        i45 = i11;
                    }
                    if (i41 != 0) {
                        mapM13459L0 = C6753d.m13459L0();
                        i37 &= -57345;
                    } else {
                        mapM13459L0 = map;
                    }
                    if (i42 != 0) {
                        interfaceC2052l2 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.material3.TextKt$Text$3
                            @Override // cm.InterfaceC2052l
                            /* JADX INFO: renamed from: n */
                            public final C9072e mo528n(C7216j c7216j) {
                                C5207g.m11111f(c7216j, "it");
                                return C9072e.f47360a;
                            }
                        };
                    } else {
                        interfaceC2052l2 = interfaceC2052l;
                    }
                    if ((i14 & 65536) != 0) {
                        c7218l2 = (C7218l) composerImplMo1636j.mo1648p(f2808a);
                        i37 &= -3670017;
                    } else {
                        c7218l2 = c7218l;
                    }
                } else {
                    if (i49 != 0) {
                        interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                    } else {
                        interfaceC0500b2 = interfaceC0500b;
                    }
                    if (i16 != 0) {
                        j14 = C9169u.f47703f;
                    } else {
                        j14 = j10;
                    }
                    if (i18 != 0) {
                        j15 = C10023k.f50982c;
                    } else {
                        j15 = j11;
                    }
                    if (i20 != 0) {
                        c8471h2 = null;
                    } else {
                        c8471h2 = c8471h;
                    }
                    if (i22 != 0) {
                        c8476m2 = null;
                    } else {
                        c8476m2 = c8476m;
                    }
                    if (i24 != 0) {
                        abstractC0696b2 = null;
                    } else {
                        abstractC0696b2 = abstractC0696b;
                    }
                    if (i26 != 0) {
                        j16 = C10023k.f50982c;
                    } else {
                        j16 = j12;
                    }
                    if (i28 != 0) {
                        c9798h2 = null;
                    } else {
                        c9798h2 = c9798h;
                    }
                    if (i30 == 0) {
                    }
                    if (i32 != 0) {
                        j17 = C10023k.f50982c;
                    } else {
                        j17 = j13;
                    }
                    if (i35 != 0) {
                        i44 = 1;
                    } else {
                        i44 = i10;
                    }
                    if (i38 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    if (i40 != 0) {
                        i45 = Integer.MAX_VALUE;
                    } else {
                        i45 = i11;
                    }
                    if (i41 != 0) {
                        mapM13459L0 = C6753d.m13459L0();
                        i37 &= -57345;
                    } else {
                        mapM13459L0 = map;
                    }
                    if (i42 != 0) {
                        interfaceC2052l2 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.material3.TextKt$Text$3
                            @Override // cm.InterfaceC2052l
                            /* JADX INFO: renamed from: n */
                            public final C9072e mo528n(C7216j c7216j) {
                                C5207g.m11111f(c7216j, "it");
                                return C9072e.f47360a;
                            }
                        };
                    } else {
                        interfaceC2052l2 = interfaceC2052l;
                    }
                    if ((i14 & 65536) != 0) {
                        c7218l2 = (C7218l) composerImplMo1636j.mo1648p(f2808a);
                        i37 &= -3670017;
                    } else {
                        c7218l2 = c7218l;
                    }
                }
                composerImplMo1636j.m1610R();
                InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q117 = ComposerKt.f3003a;
                composerImplMo1636j.mo1622c(79587464);
                j18 = C9169u.f47703f;
                if (j14 != j18) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (z12) {
                    jM14529b = j14;
                } else {
                    jM14529b = c7218l2.f40600a.m14529b();
                    if (jM14529b != j18) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (z13) {
                        jM14529b = ((C9169u) composerImplMo1636j.mo1648p(ContentColorKt.f2738a)).f47705a;
                    }
                }
                composerImplMo1636j.m1609Q(false);
                C7218l c7218l1110 = c7218l2;
                int i5111112 = (i15 & 112) | (i15 & 14) | 16777216 | ((i37 >> 6) & 7168);
                int i5111113 = i37 << 9;
                BasicTextKt.m1530a(c0689a, interfaceC0500b2, c7218l1110.m14544b(new C7218l(jM14529b, j15, c8476m2, c8471h2, abstractC0696b2, j16, c9798h2, c9797g2, j17, 175952)), interfaceC2052l2, i44, z11, i45, mapM13459L0, composerImplMo1636j, i5111112 | (i5111113 & 57344) | (i5111113 & 458752) | (i5111113 & 3670016), 0);
                interfaceC0500b3 = interfaceC0500b2;
                c9797g3 = c9797g2;
                i46 = i45;
                c7218l3 = c7218l1110;
                c8476m3 = c8476m2;
                interfaceC2052l3 = interfaceC2052l2;
                abstractC0696b3 = abstractC0696b2;
                j19 = j17;
                i47 = i44;
                z14 = z11;
                c8471h3 = c8471h2;
                map2 = mapM13459L0;
                j20 = j14;
                j21 = j16;
                j22 = j15;
                c9798h3 = c9798h2;
            } else {
                composerImplMo1636j.m1654s0();
                if ((i12 & 1) != 0) {
                    if (i49 != 0) {
                        interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                    } else {
                        interfaceC0500b2 = interfaceC0500b;
                    }
                    if (i16 != 0) {
                        j14 = C9169u.f47703f;
                    } else {
                        j14 = j10;
                    }
                    if (i18 != 0) {
                        j15 = C10023k.f50982c;
                    } else {
                        j15 = j11;
                    }
                    if (i20 != 0) {
                        c8471h2 = null;
                    } else {
                        c8471h2 = c8471h;
                    }
                    if (i22 != 0) {
                        c8476m2 = null;
                    } else {
                        c8476m2 = c8476m;
                    }
                    if (i24 != 0) {
                        abstractC0696b2 = null;
                    } else {
                        abstractC0696b2 = abstractC0696b;
                    }
                    if (i26 != 0) {
                        j16 = C10023k.f50982c;
                    } else {
                        j16 = j12;
                    }
                    if (i28 != 0) {
                        c9798h2 = null;
                    } else {
                        c9798h2 = c9798h;
                    }
                    if (i30 == 0) {
                    }
                    if (i32 != 0) {
                        j17 = C10023k.f50982c;
                    } else {
                        j17 = j13;
                    }
                    if (i35 != 0) {
                        i44 = 1;
                    } else {
                        i44 = i10;
                    }
                    if (i38 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    if (i40 != 0) {
                        i45 = Integer.MAX_VALUE;
                    } else {
                        i45 = i11;
                    }
                    if (i41 != 0) {
                        mapM13459L0 = C6753d.m13459L0();
                        i37 &= -57345;
                    } else {
                        mapM13459L0 = map;
                    }
                    if (i42 != 0) {
                        interfaceC2052l2 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.material3.TextKt$Text$3
                            @Override // cm.InterfaceC2052l
                            /* JADX INFO: renamed from: n */
                            public final C9072e mo528n(C7216j c7216j) {
                                C5207g.m11111f(c7216j, "it");
                                return C9072e.f47360a;
                            }
                        };
                    } else {
                        interfaceC2052l2 = interfaceC2052l;
                    }
                    if ((i14 & 65536) != 0) {
                        c7218l2 = (C7218l) composerImplMo1636j.mo1648p(f2808a);
                        i37 &= -3670017;
                    } else {
                        c7218l2 = c7218l;
                    }
                } else {
                    if (i49 != 0) {
                        interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                    } else {
                        interfaceC0500b2 = interfaceC0500b;
                    }
                    if (i16 != 0) {
                        j14 = C9169u.f47703f;
                    } else {
                        j14 = j10;
                    }
                    if (i18 != 0) {
                        j15 = C10023k.f50982c;
                    } else {
                        j15 = j11;
                    }
                    if (i20 != 0) {
                        c8471h2 = null;
                    } else {
                        c8471h2 = c8471h;
                    }
                    if (i22 != 0) {
                        c8476m2 = null;
                    } else {
                        c8476m2 = c8476m;
                    }
                    if (i24 != 0) {
                        abstractC0696b2 = null;
                    } else {
                        abstractC0696b2 = abstractC0696b;
                    }
                    if (i26 != 0) {
                        j16 = C10023k.f50982c;
                    } else {
                        j16 = j12;
                    }
                    if (i28 != 0) {
                        c9798h2 = null;
                    } else {
                        c9798h2 = c9798h;
                    }
                    if (i30 == 0) {
                    }
                    if (i32 != 0) {
                        j17 = C10023k.f50982c;
                    } else {
                        j17 = j13;
                    }
                    if (i35 != 0) {
                        i44 = 1;
                    } else {
                        i44 = i10;
                    }
                    if (i38 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    if (i40 != 0) {
                        i45 = Integer.MAX_VALUE;
                    } else {
                        i45 = i11;
                    }
                    if (i41 != 0) {
                        mapM13459L0 = C6753d.m13459L0();
                        i37 &= -57345;
                    } else {
                        mapM13459L0 = map;
                    }
                    if (i42 != 0) {
                        interfaceC2052l2 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.material3.TextKt$Text$3
                            @Override // cm.InterfaceC2052l
                            /* JADX INFO: renamed from: n */
                            public final C9072e mo528n(C7216j c7216j) {
                                C5207g.m11111f(c7216j, "it");
                                return C9072e.f47360a;
                            }
                        };
                    } else {
                        interfaceC2052l2 = interfaceC2052l;
                    }
                    if ((i14 & 65536) != 0) {
                        c7218l2 = (C7218l) composerImplMo1636j.mo1648p(f2808a);
                        i37 &= -3670017;
                    } else {
                        c7218l2 = c7218l;
                    }
                }
                composerImplMo1636j.m1610R();
                InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q118 = ComposerKt.f3003a;
                composerImplMo1636j.mo1622c(79587464);
                j18 = C9169u.f47703f;
                if (j14 != j18) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (z12) {
                    jM14529b = j14;
                } else {
                    jM14529b = c7218l2.f40600a.m14529b();
                    if (jM14529b != j18) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (z13) {
                        jM14529b = ((C9169u) composerImplMo1636j.mo1648p(ContentColorKt.f2738a)).f47705a;
                    }
                }
                composerImplMo1636j.m1609Q(false);
                C7218l c7218l1111 = c7218l2;
                int i5111114 = (i15 & 112) | (i15 & 14) | 16777216 | ((i37 >> 6) & 7168);
                int i5111115 = i37 << 9;
                BasicTextKt.m1530a(c0689a, interfaceC0500b2, c7218l1111.m14544b(new C7218l(jM14529b, j15, c8476m2, c8471h2, abstractC0696b2, j16, c9798h2, c9797g2, j17, 175952)), interfaceC2052l2, i44, z11, i45, mapM13459L0, composerImplMo1636j, i5111114 | (i5111115 & 57344) | (i5111115 & 458752) | (i5111115 & 3670016), 0);
                interfaceC0500b3 = interfaceC0500b2;
                c9797g3 = c9797g2;
                i46 = i45;
                c7218l3 = c7218l1111;
                c8476m3 = c8476m2;
                interfaceC2052l3 = interfaceC2052l2;
                abstractC0696b3 = abstractC0696b2;
                j19 = j17;
                i47 = i44;
                z14 = z11;
                c8471h3 = c8471h2;
                map2 = mapM13459L0;
                j20 = j14;
                j21 = j16;
                j22 = j15;
                c9798h3 = c9798h2;
            }
            c5332q0M1612T = composerImplMo1636j.m1612T();
            if (c5332q0M1612T == null) {
                return;
            }
            c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.material3.TextKt$Text$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // cm.InterfaceC2056p
                /* JADX INFO: renamed from: m0 */
                public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) throws Throwable {
                    num.intValue();
                    TextKt.m1575b(c0689a, interfaceC0500b3, j20, j22, c8471h3, c8476m3, abstractC0696b3, j21, c9798h3, c9797g3, j19, i47, z14, i46, map2, interfaceC2052l3, c7218l3, interfaceC0476a2, i12 | 1, i13, i14);
                    return C9072e.f47360a;
                }
            };
        }
        i37 |= 3072;
        i41 = i14 & 16384;
        if (i41 != 0) {
            i37 |= 8192;
        }
        i42 = i14 & 32768;
        if (i42 != 0) {
            if ((i13 & 458752) == 0) {
                if (composerImplMo1636j.mo1665y(interfaceC2052l)) {
                    i43 = 131072;
                } else {
                    i43 = 65536;
                }
                i37 |= i43;
            }
            if ((i13 & 3670016) != 0) {
                if ((i14 & 65536) == 0) {
                    i48 = 524288;
                } else {
                    i48 = 524288;
                }
                i37 |= i48;
            }
            if (i41 != 16384) {
                composerImplMo1636j.m1654s0();
                if ((i12 & 1) != 0) {
                    if (i49 != 0) {
                        interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                    } else {
                        interfaceC0500b2 = interfaceC0500b;
                    }
                    if (i16 != 0) {
                        j14 = C9169u.f47703f;
                    } else {
                        j14 = j10;
                    }
                    if (i18 != 0) {
                        j15 = C10023k.f50982c;
                    } else {
                        j15 = j11;
                    }
                    if (i20 != 0) {
                        c8471h2 = null;
                    } else {
                        c8471h2 = c8471h;
                    }
                    if (i22 != 0) {
                        c8476m2 = null;
                    } else {
                        c8476m2 = c8476m;
                    }
                    if (i24 != 0) {
                        abstractC0696b2 = null;
                    } else {
                        abstractC0696b2 = abstractC0696b;
                    }
                    if (i26 != 0) {
                        j16 = C10023k.f50982c;
                    } else {
                        j16 = j12;
                    }
                    if (i28 != 0) {
                        c9798h2 = null;
                    } else {
                        c9798h2 = c9798h;
                    }
                    if (i30 == 0) {
                    }
                    if (i32 != 0) {
                        j17 = C10023k.f50982c;
                    } else {
                        j17 = j13;
                    }
                    if (i35 != 0) {
                        i44 = 1;
                    } else {
                        i44 = i10;
                    }
                    if (i38 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    if (i40 != 0) {
                        i45 = Integer.MAX_VALUE;
                    } else {
                        i45 = i11;
                    }
                    if (i41 != 0) {
                        mapM13459L0 = C6753d.m13459L0();
                        i37 &= -57345;
                    } else {
                        mapM13459L0 = map;
                    }
                    if (i42 != 0) {
                        interfaceC2052l2 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.material3.TextKt$Text$3
                            @Override // cm.InterfaceC2052l
                            /* JADX INFO: renamed from: n */
                            public final C9072e mo528n(C7216j c7216j) {
                                C5207g.m11111f(c7216j, "it");
                                return C9072e.f47360a;
                            }
                        };
                    } else {
                        interfaceC2052l2 = interfaceC2052l;
                    }
                    if ((i14 & 65536) != 0) {
                        c7218l2 = (C7218l) composerImplMo1636j.mo1648p(f2808a);
                        i37 &= -3670017;
                    } else {
                        c7218l2 = c7218l;
                    }
                } else {
                    if (i49 != 0) {
                        interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                    } else {
                        interfaceC0500b2 = interfaceC0500b;
                    }
                    if (i16 != 0) {
                        j14 = C9169u.f47703f;
                    } else {
                        j14 = j10;
                    }
                    if (i18 != 0) {
                        j15 = C10023k.f50982c;
                    } else {
                        j15 = j11;
                    }
                    if (i20 != 0) {
                        c8471h2 = null;
                    } else {
                        c8471h2 = c8471h;
                    }
                    if (i22 != 0) {
                        c8476m2 = null;
                    } else {
                        c8476m2 = c8476m;
                    }
                    if (i24 != 0) {
                        abstractC0696b2 = null;
                    } else {
                        abstractC0696b2 = abstractC0696b;
                    }
                    if (i26 != 0) {
                        j16 = C10023k.f50982c;
                    } else {
                        j16 = j12;
                    }
                    if (i28 != 0) {
                        c9798h2 = null;
                    } else {
                        c9798h2 = c9798h;
                    }
                    if (i30 == 0) {
                    }
                    if (i32 != 0) {
                        j17 = C10023k.f50982c;
                    } else {
                        j17 = j13;
                    }
                    if (i35 != 0) {
                        i44 = 1;
                    } else {
                        i44 = i10;
                    }
                    if (i38 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    if (i40 != 0) {
                        i45 = Integer.MAX_VALUE;
                    } else {
                        i45 = i11;
                    }
                    if (i41 != 0) {
                        mapM13459L0 = C6753d.m13459L0();
                        i37 &= -57345;
                    } else {
                        mapM13459L0 = map;
                    }
                    if (i42 != 0) {
                        interfaceC2052l2 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.material3.TextKt$Text$3
                            @Override // cm.InterfaceC2052l
                            /* JADX INFO: renamed from: n */
                            public final C9072e mo528n(C7216j c7216j) {
                                C5207g.m11111f(c7216j, "it");
                                return C9072e.f47360a;
                            }
                        };
                    } else {
                        interfaceC2052l2 = interfaceC2052l;
                    }
                    if ((i14 & 65536) != 0) {
                        c7218l2 = (C7218l) composerImplMo1636j.mo1648p(f2808a);
                        i37 &= -3670017;
                    } else {
                        c7218l2 = c7218l;
                    }
                }
                composerImplMo1636j.m1610R();
                InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q119 = ComposerKt.f3003a;
                composerImplMo1636j.mo1622c(79587464);
                j18 = C9169u.f47703f;
                if (j14 != j18) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (z12) {
                    jM14529b = j14;
                } else {
                    jM14529b = c7218l2.f40600a.m14529b();
                    if (jM14529b != j18) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (z13) {
                        jM14529b = ((C9169u) composerImplMo1636j.mo1648p(ContentColorKt.f2738a)).f47705a;
                    }
                }
                composerImplMo1636j.m1609Q(false);
                C7218l c7218l1112 = c7218l2;
                int i5111116 = (i15 & 112) | (i15 & 14) | 16777216 | ((i37 >> 6) & 7168);
                int i5111117 = i37 << 9;
                BasicTextKt.m1530a(c0689a, interfaceC0500b2, c7218l1112.m14544b(new C7218l(jM14529b, j15, c8476m2, c8471h2, abstractC0696b2, j16, c9798h2, c9797g2, j17, 175952)), interfaceC2052l2, i44, z11, i45, mapM13459L0, composerImplMo1636j, i5111116 | (i5111117 & 57344) | (i5111117 & 458752) | (i5111117 & 3670016), 0);
                interfaceC0500b3 = interfaceC0500b2;
                c9797g3 = c9797g2;
                i46 = i45;
                c7218l3 = c7218l1112;
                c8476m3 = c8476m2;
                interfaceC2052l3 = interfaceC2052l2;
                abstractC0696b3 = abstractC0696b2;
                j19 = j17;
                i47 = i44;
                z14 = z11;
                c8471h3 = c8471h2;
                map2 = mapM13459L0;
                j20 = j14;
                j21 = j16;
                j22 = j15;
                c9798h3 = c9798h2;
            } else {
                composerImplMo1636j.m1654s0();
                if ((i12 & 1) != 0) {
                    if (i49 != 0) {
                        interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                    } else {
                        interfaceC0500b2 = interfaceC0500b;
                    }
                    if (i16 != 0) {
                        j14 = C9169u.f47703f;
                    } else {
                        j14 = j10;
                    }
                    if (i18 != 0) {
                        j15 = C10023k.f50982c;
                    } else {
                        j15 = j11;
                    }
                    if (i20 != 0) {
                        c8471h2 = null;
                    } else {
                        c8471h2 = c8471h;
                    }
                    if (i22 != 0) {
                        c8476m2 = null;
                    } else {
                        c8476m2 = c8476m;
                    }
                    if (i24 != 0) {
                        abstractC0696b2 = null;
                    } else {
                        abstractC0696b2 = abstractC0696b;
                    }
                    if (i26 != 0) {
                        j16 = C10023k.f50982c;
                    } else {
                        j16 = j12;
                    }
                    if (i28 != 0) {
                        c9798h2 = null;
                    } else {
                        c9798h2 = c9798h;
                    }
                    if (i30 == 0) {
                    }
                    if (i32 != 0) {
                        j17 = C10023k.f50982c;
                    } else {
                        j17 = j13;
                    }
                    if (i35 != 0) {
                        i44 = 1;
                    } else {
                        i44 = i10;
                    }
                    if (i38 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    if (i40 != 0) {
                        i45 = Integer.MAX_VALUE;
                    } else {
                        i45 = i11;
                    }
                    if (i41 != 0) {
                        mapM13459L0 = C6753d.m13459L0();
                        i37 &= -57345;
                    } else {
                        mapM13459L0 = map;
                    }
                    if (i42 != 0) {
                        interfaceC2052l2 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.material3.TextKt$Text$3
                            @Override // cm.InterfaceC2052l
                            /* JADX INFO: renamed from: n */
                            public final C9072e mo528n(C7216j c7216j) {
                                C5207g.m11111f(c7216j, "it");
                                return C9072e.f47360a;
                            }
                        };
                    } else {
                        interfaceC2052l2 = interfaceC2052l;
                    }
                    if ((i14 & 65536) != 0) {
                        c7218l2 = (C7218l) composerImplMo1636j.mo1648p(f2808a);
                        i37 &= -3670017;
                    } else {
                        c7218l2 = c7218l;
                    }
                } else {
                    if (i49 != 0) {
                        interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                    } else {
                        interfaceC0500b2 = interfaceC0500b;
                    }
                    if (i16 != 0) {
                        j14 = C9169u.f47703f;
                    } else {
                        j14 = j10;
                    }
                    if (i18 != 0) {
                        j15 = C10023k.f50982c;
                    } else {
                        j15 = j11;
                    }
                    if (i20 != 0) {
                        c8471h2 = null;
                    } else {
                        c8471h2 = c8471h;
                    }
                    if (i22 != 0) {
                        c8476m2 = null;
                    } else {
                        c8476m2 = c8476m;
                    }
                    if (i24 != 0) {
                        abstractC0696b2 = null;
                    } else {
                        abstractC0696b2 = abstractC0696b;
                    }
                    if (i26 != 0) {
                        j16 = C10023k.f50982c;
                    } else {
                        j16 = j12;
                    }
                    if (i28 != 0) {
                        c9798h2 = null;
                    } else {
                        c9798h2 = c9798h;
                    }
                    if (i30 == 0) {
                    }
                    if (i32 != 0) {
                        j17 = C10023k.f50982c;
                    } else {
                        j17 = j13;
                    }
                    if (i35 != 0) {
                        i44 = 1;
                    } else {
                        i44 = i10;
                    }
                    if (i38 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    if (i40 != 0) {
                        i45 = Integer.MAX_VALUE;
                    } else {
                        i45 = i11;
                    }
                    if (i41 != 0) {
                        mapM13459L0 = C6753d.m13459L0();
                        i37 &= -57345;
                    } else {
                        mapM13459L0 = map;
                    }
                    if (i42 != 0) {
                        interfaceC2052l2 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.material3.TextKt$Text$3
                            @Override // cm.InterfaceC2052l
                            /* JADX INFO: renamed from: n */
                            public final C9072e mo528n(C7216j c7216j) {
                                C5207g.m11111f(c7216j, "it");
                                return C9072e.f47360a;
                            }
                        };
                    } else {
                        interfaceC2052l2 = interfaceC2052l;
                    }
                    if ((i14 & 65536) != 0) {
                        c7218l2 = (C7218l) composerImplMo1636j.mo1648p(f2808a);
                        i37 &= -3670017;
                    } else {
                        c7218l2 = c7218l;
                    }
                }
                composerImplMo1636j.m1610R();
                InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q1110 = ComposerKt.f3003a;
                composerImplMo1636j.mo1622c(79587464);
                j18 = C9169u.f47703f;
                if (j14 != j18) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (z12) {
                    jM14529b = j14;
                } else {
                    jM14529b = c7218l2.f40600a.m14529b();
                    if (jM14529b != j18) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (z13) {
                        jM14529b = ((C9169u) composerImplMo1636j.mo1648p(ContentColorKt.f2738a)).f47705a;
                    }
                }
                composerImplMo1636j.m1609Q(false);
                C7218l c7218l1113 = c7218l2;
                int i5111118 = (i15 & 112) | (i15 & 14) | 16777216 | ((i37 >> 6) & 7168);
                int i5111119 = i37 << 9;
                BasicTextKt.m1530a(c0689a, interfaceC0500b2, c7218l1113.m14544b(new C7218l(jM14529b, j15, c8476m2, c8471h2, abstractC0696b2, j16, c9798h2, c9797g2, j17, 175952)), interfaceC2052l2, i44, z11, i45, mapM13459L0, composerImplMo1636j, i5111118 | (i5111119 & 57344) | (i5111119 & 458752) | (i5111119 & 3670016), 0);
                interfaceC0500b3 = interfaceC0500b2;
                c9797g3 = c9797g2;
                i46 = i45;
                c7218l3 = c7218l1113;
                c8476m3 = c8476m2;
                interfaceC2052l3 = interfaceC2052l2;
                abstractC0696b3 = abstractC0696b2;
                j19 = j17;
                i47 = i44;
                z14 = z11;
                c8471h3 = c8471h2;
                map2 = mapM13459L0;
                j20 = j14;
                j21 = j16;
                j22 = j15;
                c9798h3 = c9798h2;
            }
            c5332q0M1612T = composerImplMo1636j.m1612T();
            if (c5332q0M1612T == null) {
                return;
            }
            c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.material3.TextKt$Text$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // cm.InterfaceC2056p
                /* JADX INFO: renamed from: m0 */
                public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) throws Throwable {
                    num.intValue();
                    TextKt.m1575b(c0689a, interfaceC0500b3, j20, j22, c8471h3, c8476m3, abstractC0696b3, j21, c9798h3, c9797g3, j19, i47, z14, i46, map2, interfaceC2052l3, c7218l3, interfaceC0476a2, i12 | 1, i13, i14);
                    return C9072e.f47360a;
                }
            };
        }
        i37 |= 196608;
        if ((i13 & 3670016) != 0) {
            if ((i14 & 65536) == 0) {
                i48 = 524288;
            } else {
                i48 = 524288;
            }
            i37 |= i48;
        }
        if (i41 != 16384) {
            composerImplMo1636j.m1654s0();
            if ((i12 & 1) != 0) {
                if (i49 != 0) {
                    interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                } else {
                    interfaceC0500b2 = interfaceC0500b;
                }
                if (i16 != 0) {
                    j14 = C9169u.f47703f;
                } else {
                    j14 = j10;
                }
                if (i18 != 0) {
                    j15 = C10023k.f50982c;
                } else {
                    j15 = j11;
                }
                if (i20 != 0) {
                    c8471h2 = null;
                } else {
                    c8471h2 = c8471h;
                }
                if (i22 != 0) {
                    c8476m2 = null;
                } else {
                    c8476m2 = c8476m;
                }
                if (i24 != 0) {
                    abstractC0696b2 = null;
                } else {
                    abstractC0696b2 = abstractC0696b;
                }
                if (i26 != 0) {
                    j16 = C10023k.f50982c;
                } else {
                    j16 = j12;
                }
                if (i28 != 0) {
                    c9798h2 = null;
                } else {
                    c9798h2 = c9798h;
                }
                if (i30 == 0) {
                }
                if (i32 != 0) {
                    j17 = C10023k.f50982c;
                } else {
                    j17 = j13;
                }
                if (i35 != 0) {
                    i44 = 1;
                } else {
                    i44 = i10;
                }
                if (i38 != 0) {
                    z11 = true;
                } else {
                    z11 = z10;
                }
                if (i40 != 0) {
                    i45 = Integer.MAX_VALUE;
                } else {
                    i45 = i11;
                }
                if (i41 != 0) {
                    mapM13459L0 = C6753d.m13459L0();
                    i37 &= -57345;
                } else {
                    mapM13459L0 = map;
                }
                if (i42 != 0) {
                    interfaceC2052l2 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.material3.TextKt$Text$3
                        @Override // cm.InterfaceC2052l
                        /* JADX INFO: renamed from: n */
                        public final C9072e mo528n(C7216j c7216j) {
                            C5207g.m11111f(c7216j, "it");
                            return C9072e.f47360a;
                        }
                    };
                } else {
                    interfaceC2052l2 = interfaceC2052l;
                }
                if ((i14 & 65536) != 0) {
                    c7218l2 = (C7218l) composerImplMo1636j.mo1648p(f2808a);
                    i37 &= -3670017;
                } else {
                    c7218l2 = c7218l;
                }
            } else {
                if (i49 != 0) {
                    interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                } else {
                    interfaceC0500b2 = interfaceC0500b;
                }
                if (i16 != 0) {
                    j14 = C9169u.f47703f;
                } else {
                    j14 = j10;
                }
                if (i18 != 0) {
                    j15 = C10023k.f50982c;
                } else {
                    j15 = j11;
                }
                if (i20 != 0) {
                    c8471h2 = null;
                } else {
                    c8471h2 = c8471h;
                }
                if (i22 != 0) {
                    c8476m2 = null;
                } else {
                    c8476m2 = c8476m;
                }
                if (i24 != 0) {
                    abstractC0696b2 = null;
                } else {
                    abstractC0696b2 = abstractC0696b;
                }
                if (i26 != 0) {
                    j16 = C10023k.f50982c;
                } else {
                    j16 = j12;
                }
                if (i28 != 0) {
                    c9798h2 = null;
                } else {
                    c9798h2 = c9798h;
                }
                if (i30 == 0) {
                }
                if (i32 != 0) {
                    j17 = C10023k.f50982c;
                } else {
                    j17 = j13;
                }
                if (i35 != 0) {
                    i44 = 1;
                } else {
                    i44 = i10;
                }
                if (i38 != 0) {
                    z11 = true;
                } else {
                    z11 = z10;
                }
                if (i40 != 0) {
                    i45 = Integer.MAX_VALUE;
                } else {
                    i45 = i11;
                }
                if (i41 != 0) {
                    mapM13459L0 = C6753d.m13459L0();
                    i37 &= -57345;
                } else {
                    mapM13459L0 = map;
                }
                if (i42 != 0) {
                    interfaceC2052l2 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.material3.TextKt$Text$3
                        @Override // cm.InterfaceC2052l
                        /* JADX INFO: renamed from: n */
                        public final C9072e mo528n(C7216j c7216j) {
                            C5207g.m11111f(c7216j, "it");
                            return C9072e.f47360a;
                        }
                    };
                } else {
                    interfaceC2052l2 = interfaceC2052l;
                }
                if ((i14 & 65536) != 0) {
                    c7218l2 = (C7218l) composerImplMo1636j.mo1648p(f2808a);
                    i37 &= -3670017;
                } else {
                    c7218l2 = c7218l;
                }
            }
            composerImplMo1636j.m1610R();
            InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q1111 = ComposerKt.f3003a;
            composerImplMo1636j.mo1622c(79587464);
            j18 = C9169u.f47703f;
            if (j14 != j18) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12) {
                jM14529b = j14;
            } else {
                jM14529b = c7218l2.f40600a.m14529b();
                if (jM14529b != j18) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (z13) {
                    jM14529b = ((C9169u) composerImplMo1636j.mo1648p(ContentColorKt.f2738a)).f47705a;
                }
            }
            composerImplMo1636j.m1609Q(false);
            C7218l c7218l1114 = c7218l2;
            int i51111110 = (i15 & 112) | (i15 & 14) | 16777216 | ((i37 >> 6) & 7168);
            int i51111111 = i37 << 9;
            BasicTextKt.m1530a(c0689a, interfaceC0500b2, c7218l1114.m14544b(new C7218l(jM14529b, j15, c8476m2, c8471h2, abstractC0696b2, j16, c9798h2, c9797g2, j17, 175952)), interfaceC2052l2, i44, z11, i45, mapM13459L0, composerImplMo1636j, i51111110 | (i51111111 & 57344) | (i51111111 & 458752) | (i51111111 & 3670016), 0);
            interfaceC0500b3 = interfaceC0500b2;
            c9797g3 = c9797g2;
            i46 = i45;
            c7218l3 = c7218l1114;
            c8476m3 = c8476m2;
            interfaceC2052l3 = interfaceC2052l2;
            abstractC0696b3 = abstractC0696b2;
            j19 = j17;
            i47 = i44;
            z14 = z11;
            c8471h3 = c8471h2;
            map2 = mapM13459L0;
            j20 = j14;
            j21 = j16;
            j22 = j15;
            c9798h3 = c9798h2;
        } else {
            composerImplMo1636j.m1654s0();
            if ((i12 & 1) != 0) {
                if (i49 != 0) {
                    interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                } else {
                    interfaceC0500b2 = interfaceC0500b;
                }
                if (i16 != 0) {
                    j14 = C9169u.f47703f;
                } else {
                    j14 = j10;
                }
                if (i18 != 0) {
                    j15 = C10023k.f50982c;
                } else {
                    j15 = j11;
                }
                if (i20 != 0) {
                    c8471h2 = null;
                } else {
                    c8471h2 = c8471h;
                }
                if (i22 != 0) {
                    c8476m2 = null;
                } else {
                    c8476m2 = c8476m;
                }
                if (i24 != 0) {
                    abstractC0696b2 = null;
                } else {
                    abstractC0696b2 = abstractC0696b;
                }
                if (i26 != 0) {
                    j16 = C10023k.f50982c;
                } else {
                    j16 = j12;
                }
                if (i28 != 0) {
                    c9798h2 = null;
                } else {
                    c9798h2 = c9798h;
                }
                if (i30 == 0) {
                }
                if (i32 != 0) {
                    j17 = C10023k.f50982c;
                } else {
                    j17 = j13;
                }
                if (i35 != 0) {
                    i44 = 1;
                } else {
                    i44 = i10;
                }
                if (i38 != 0) {
                    z11 = true;
                } else {
                    z11 = z10;
                }
                if (i40 != 0) {
                    i45 = Integer.MAX_VALUE;
                } else {
                    i45 = i11;
                }
                if (i41 != 0) {
                    mapM13459L0 = C6753d.m13459L0();
                    i37 &= -57345;
                } else {
                    mapM13459L0 = map;
                }
                if (i42 != 0) {
                    interfaceC2052l2 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.material3.TextKt$Text$3
                        @Override // cm.InterfaceC2052l
                        /* JADX INFO: renamed from: n */
                        public final C9072e mo528n(C7216j c7216j) {
                            C5207g.m11111f(c7216j, "it");
                            return C9072e.f47360a;
                        }
                    };
                } else {
                    interfaceC2052l2 = interfaceC2052l;
                }
                if ((i14 & 65536) != 0) {
                    c7218l2 = (C7218l) composerImplMo1636j.mo1648p(f2808a);
                    i37 &= -3670017;
                } else {
                    c7218l2 = c7218l;
                }
            } else {
                if (i49 != 0) {
                    interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                } else {
                    interfaceC0500b2 = interfaceC0500b;
                }
                if (i16 != 0) {
                    j14 = C9169u.f47703f;
                } else {
                    j14 = j10;
                }
                if (i18 != 0) {
                    j15 = C10023k.f50982c;
                } else {
                    j15 = j11;
                }
                if (i20 != 0) {
                    c8471h2 = null;
                } else {
                    c8471h2 = c8471h;
                }
                if (i22 != 0) {
                    c8476m2 = null;
                } else {
                    c8476m2 = c8476m;
                }
                if (i24 != 0) {
                    abstractC0696b2 = null;
                } else {
                    abstractC0696b2 = abstractC0696b;
                }
                if (i26 != 0) {
                    j16 = C10023k.f50982c;
                } else {
                    j16 = j12;
                }
                if (i28 != 0) {
                    c9798h2 = null;
                } else {
                    c9798h2 = c9798h;
                }
                if (i30 == 0) {
                }
                if (i32 != 0) {
                    j17 = C10023k.f50982c;
                } else {
                    j17 = j13;
                }
                if (i35 != 0) {
                    i44 = 1;
                } else {
                    i44 = i10;
                }
                if (i38 != 0) {
                    z11 = true;
                } else {
                    z11 = z10;
                }
                if (i40 != 0) {
                    i45 = Integer.MAX_VALUE;
                } else {
                    i45 = i11;
                }
                if (i41 != 0) {
                    mapM13459L0 = C6753d.m13459L0();
                    i37 &= -57345;
                } else {
                    mapM13459L0 = map;
                }
                if (i42 != 0) {
                    interfaceC2052l2 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.material3.TextKt$Text$3
                        @Override // cm.InterfaceC2052l
                        /* JADX INFO: renamed from: n */
                        public final C9072e mo528n(C7216j c7216j) {
                            C5207g.m11111f(c7216j, "it");
                            return C9072e.f47360a;
                        }
                    };
                } else {
                    interfaceC2052l2 = interfaceC2052l;
                }
                if ((i14 & 65536) != 0) {
                    c7218l2 = (C7218l) composerImplMo1636j.mo1648p(f2808a);
                    i37 &= -3670017;
                } else {
                    c7218l2 = c7218l;
                }
            }
            composerImplMo1636j.m1610R();
            InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q1112 = ComposerKt.f3003a;
            composerImplMo1636j.mo1622c(79587464);
            j18 = C9169u.f47703f;
            if (j14 != j18) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12) {
                jM14529b = j14;
            } else {
                jM14529b = c7218l2.f40600a.m14529b();
                if (jM14529b != j18) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (z13) {
                    jM14529b = ((C9169u) composerImplMo1636j.mo1648p(ContentColorKt.f2738a)).f47705a;
                }
            }
            composerImplMo1636j.m1609Q(false);
            C7218l c7218l1115 = c7218l2;
            int i51111112 = (i15 & 112) | (i15 & 14) | 16777216 | ((i37 >> 6) & 7168);
            int i51111113 = i37 << 9;
            BasicTextKt.m1530a(c0689a, interfaceC0500b2, c7218l1115.m14544b(new C7218l(jM14529b, j15, c8476m2, c8471h2, abstractC0696b2, j16, c9798h2, c9797g2, j17, 175952)), interfaceC2052l2, i44, z11, i45, mapM13459L0, composerImplMo1636j, i51111112 | (i51111113 & 57344) | (i51111113 & 458752) | (i51111113 & 3670016), 0);
            interfaceC0500b3 = interfaceC0500b2;
            c9797g3 = c9797g2;
            i46 = i45;
            c7218l3 = c7218l1115;
            c8476m3 = c8476m2;
            interfaceC2052l3 = interfaceC2052l2;
            abstractC0696b3 = abstractC0696b2;
            j19 = j17;
            i47 = i44;
            z14 = z11;
            c8471h3 = c8471h2;
            map2 = mapM13459L0;
            j20 = j14;
            j21 = j16;
            j22 = j15;
            c9798h3 = c9798h2;
        }
        c5332q0M1612T = composerImplMo1636j.m1612T();
        if (c5332q0M1612T == null) {
            return;
        }
        c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.material3.TextKt$Text$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // cm.InterfaceC2056p
            /* JADX INFO: renamed from: m0 */
            public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) throws Throwable {
                num.intValue();
                TextKt.m1575b(c0689a, interfaceC0500b3, j20, j22, c8471h3, c8476m3, abstractC0696b3, j21, c9798h3, c9797g3, j19, i47, z14, i46, map2, interfaceC2052l3, c7218l3, interfaceC0476a2, i12 | 1, i13, i14);
                return C9072e.f47360a;
            }
        };
    }

    /* JADX WARN: Code duplicated, block: B:101:0x014b  */
    /* JADX WARN: Code duplicated, block: B:102:0x014e  */
    /* JADX WARN: Code duplicated, block: B:106:0x0156  */
    /* JADX WARN: Code duplicated, block: B:107:0x015b  */
    /* JADX WARN: Code duplicated, block: B:109:0x0161  */
    /* JADX WARN: Code duplicated, block: B:111:0x0167  */
    /* JADX WARN: Code duplicated, block: B:112:0x016c  */
    /* JADX WARN: Code duplicated, block: B:114:0x0173  */
    /* JADX WARN: Code duplicated, block: B:117:0x0179  */
    /* JADX WARN: Code duplicated, block: B:118:0x017e  */
    /* JADX WARN: Code duplicated, block: B:120:0x0184  */
    /* JADX WARN: Code duplicated, block: B:122:0x018a  */
    /* JADX WARN: Code duplicated, block: B:123:0x018f  */
    /* JADX WARN: Code duplicated, block: B:127:0x019b  */
    /* JADX WARN: Code duplicated, block: B:128:0x019e  */
    /* JADX WARN: Code duplicated, block: B:130:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:132:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:133:0x01af  */
    /* JADX WARN: Code duplicated, block: B:138:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:139:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:141:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:143:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:148:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:149:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:151:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:153:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:158:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:160:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:163:0x0206  */
    /* JADX WARN: Code duplicated, block: B:165:0x020b  */
    /* JADX WARN: Code duplicated, block: B:168:0x0217  */
    /* JADX WARN: Code duplicated, block: B:174:0x024a  */
    /* JADX WARN: Code duplicated, block: B:176:0x0251  */
    /* JADX WARN: Code duplicated, block: B:183:0x027f A[PHI: r1 r3 r5 r6 r7 r8 r9 r10 r11 r12 r16 r18 r21 r24 r30
      0x027f: PHI (r1v6 w1.h) = (r1v3 w1.h), (r1v8 w1.h) binds: [B:228:0x02e4, B:182:0x0263] A[DONT_GENERATE, DONT_INLINE]
      0x027f: PHI (r3v10 long) = (r3v6 long), (r3v11 long) binds: [B:228:0x02e4, B:182:0x0263] A[DONT_GENERATE, DONT_INLINE]
      0x027f: PHI (r5v6 androidx.compose.ui.b) = (r5v2 androidx.compose.ui.b), (r5v7 androidx.compose.ui.b) binds: [B:228:0x02e4, B:182:0x0263] A[DONT_GENERATE, DONT_INLINE]
      0x027f: PHI (r6v10 boolean) = (r6v6 boolean), (r6v11 boolean) binds: [B:228:0x02e4, B:182:0x0263] A[DONT_GENERATE, DONT_INLINE]
      0x027f: PHI (r7v17 int) = (r7v9 int), (r7v18 int) binds: [B:228:0x02e4, B:182:0x0263] A[DONT_GENERATE, DONT_INLINE]
      0x027f: PHI (r8v9 int) = (r8v5 int), (r8v10 int) binds: [B:228:0x02e4, B:182:0x0263] A[DONT_GENERATE, DONT_INLINE]
      0x027f: PHI (r9v11 w1.g) = (r9v7 w1.g), (r9v12 w1.g) binds: [B:228:0x02e4, B:182:0x0263] A[DONT_GENERATE, DONT_INLINE]
      0x027f: PHI (r10v9 int) = (r10v5 int), (r10v10 int) binds: [B:228:0x02e4, B:182:0x0263] A[DONT_GENERATE, DONT_INLINE]
      0x027f: PHI (r11v12 q1.h) = (r11v9 q1.h), (r11v14 q1.h) binds: [B:228:0x02e4, B:182:0x0263] A[DONT_GENERATE, DONT_INLINE]
      0x027f: PHI (r12v7 cm.l<? super l1.j, sl.e>) = (r12v3 cm.l<? super l1.j, sl.e>), (r12v8 cm.l<? super l1.j, sl.e>) binds: [B:228:0x02e4, B:182:0x0263] A[DONT_GENERATE, DONT_INLINE]
      0x027f: PHI (r16v11 q1.m) = (r16v7 q1.m), (r16v12 q1.m) binds: [B:228:0x02e4, B:182:0x0263] A[DONT_GENERATE, DONT_INLINE]
      0x027f: PHI (r18v10 androidx.compose.ui.text.font.b) = (r18v6 androidx.compose.ui.text.font.b), (r18v11 androidx.compose.ui.text.font.b) binds: [B:228:0x02e4, B:182:0x0263] A[DONT_GENERATE, DONT_INLINE]
      0x027f: PHI (r21v7 long) = (r21v4 long), (r21v8 long) binds: [B:228:0x02e4, B:182:0x0263] A[DONT_GENERATE, DONT_INLINE]
      0x027f: PHI (r24v10 long) = (r24v7 long), (r24v11 long) binds: [B:228:0x02e4, B:182:0x0263] A[DONT_GENERATE, DONT_INLINE]
      0x027f: PHI (r30v5 long) = (r30v2 long), (r30v6 long) binds: [B:228:0x02e4, B:182:0x0263] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:184:0x0283 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:185:0x0285  */
    /* JADX WARN: Code duplicated, block: B:186:0x0288  */
    /* JADX WARN: Code duplicated, block: B:188:0x028c  */
    /* JADX WARN: Code duplicated, block: B:189:0x028f  */
    /* JADX WARN: Code duplicated, block: B:191:0x0293  */
    /* JADX WARN: Code duplicated, block: B:192:0x0296  */
    /* JADX WARN: Code duplicated, block: B:195:0x029b  */
    /* JADX WARN: Code duplicated, block: B:196:0x029d  */
    /* JADX WARN: Code duplicated, block: B:198:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:199:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:201:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:202:0x02ab  */
    /* JADX WARN: Code duplicated, block: B:204:0x02af  */
    /* JADX WARN: Code duplicated, block: B:205:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:207:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:208:0x02b8  */
    /* JADX WARN: Code duplicated, block: B:211:0x02bd  */
    /* JADX WARN: Code duplicated, block: B:213:0x02c1  */
    /* JADX WARN: Code duplicated, block: B:214:0x02c4  */
    /* JADX WARN: Code duplicated, block: B:216:0x02c8  */
    /* JADX WARN: Code duplicated, block: B:217:0x02ca  */
    /* JADX WARN: Code duplicated, block: B:219:0x02ce  */
    /* JADX WARN: Code duplicated, block: B:220:0x02d1  */
    /* JADX WARN: Code duplicated, block: B:222:0x02d5  */
    /* JADX WARN: Code duplicated, block: B:223:0x02d9  */
    /* JADX WARN: Code duplicated, block: B:225:0x02dd  */
    /* JADX WARN: Code duplicated, block: B:226:0x02e0  */
    /* JADX WARN: Code duplicated, block: B:229:0x02e6  */
    /* JADX WARN: Code duplicated, block: B:232:0x0304  */
    /* JADX WARN: Code duplicated, block: B:233:0x0307  */
    /* JADX WARN: Code duplicated, block: B:235:0x030b  */
    /* JADX WARN: Code duplicated, block: B:236:0x0310  */
    /* JADX WARN: Code duplicated, block: B:238:0x031a  */
    /* JADX WARN: Code duplicated, block: B:239:0x031d  */
    /* JADX WARN: Code duplicated, block: B:241:0x0321  */
    /* JADX WARN: Code duplicated, block: B:242:0x0324  */
    /* JADX WARN: Code duplicated, block: B:247:0x03aa  */
    /* JADX WARN: Code duplicated, block: B:249:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0050  */
    /* JADX WARN: Code duplicated, block: B:27:0x0055  */
    /* JADX WARN: Code duplicated, block: B:29:0x005b  */
    /* JADX WARN: Code duplicated, block: B:31:0x0061  */
    /* JADX WARN: Code duplicated, block: B:32:0x0066  */
    /* JADX WARN: Code duplicated, block: B:36:0x0076  */
    /* JADX WARN: Code duplicated, block: B:37:0x007b  */
    /* JADX WARN: Code duplicated, block: B:39:0x0081  */
    /* JADX WARN: Code duplicated, block: B:41:0x0087  */
    /* JADX WARN: Code duplicated, block: B:42:0x008a  */
    /* JADX WARN: Code duplicated, block: B:46:0x009b  */
    /* JADX WARN: Code duplicated, block: B:47:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:49:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:51:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:52:0x00af  */
    /* JADX WARN: Code duplicated, block: B:56:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:57:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:59:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:61:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:62:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:66:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:67:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:69:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:71:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:72:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:76:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:77:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:79:0x0106  */
    /* JADX WARN: Code duplicated, block: B:81:0x010c  */
    /* JADX WARN: Code duplicated, block: B:82:0x010f  */
    /* JADX WARN: Code duplicated, block: B:86:0x0117  */
    /* JADX WARN: Code duplicated, block: B:87:0x011e  */
    /* JADX WARN: Code duplicated, block: B:89:0x0126  */
    /* JADX WARN: Code duplicated, block: B:91:0x012c  */
    /* JADX WARN: Code duplicated, block: B:92:0x012f  */
    /* JADX WARN: Code duplicated, block: B:96:0x0136  */
    /* JADX WARN: Code duplicated, block: B:97:0x013d  */
    /* JADX WARN: Code duplicated, block: B:99:0x0145  */
    /* JADX INFO: renamed from: c */
    public static final void m1576c(final String str, InterfaceC0500b interfaceC0500b, long j10, long j11, C8471h c8471h, C8476m c8476m, AbstractC0696b abstractC0696b, long j12, C9798h c9798h, C9797g c9797g, long j13, int i10, boolean z10, int i11, InterfaceC2052l<? super C7216j, C9072e> interfaceC2052l, C7218l c7218l, InterfaceC0476a interfaceC0476a, final int i12, final int i13, final int i14) {
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        int i32;
        int i33;
        int i34;
        int i35;
        int i36;
        int i37;
        int i38;
        int i39;
        int i40;
        int i41;
        InterfaceC0500b interfaceC0500b2;
        long j14;
        long j15;
        C8471h c8471h2;
        C8476m c8476m2;
        AbstractC0696b abstractC0696b2;
        long j16;
        C9798h c9798h2;
        C9797g c9797g2;
        long j17;
        int i42;
        boolean z11;
        int i43;
        InterfaceC2052l<? super C7216j, C9072e> interfaceC2052l2;
        C7218l c7218l2;
        long j18;
        boolean z12;
        long jM14529b;
        boolean z13;
        final InterfaceC0500b interfaceC0500b3;
        final boolean z14;
        final C9797g c9797g3;
        final C8471h c8471h3;
        final InterfaceC2052l<? super C7216j, C9072e> interfaceC2052l3;
        final C7218l c7218l3;
        final AbstractC0696b abstractC0696b3;
        final long j19;
        final C9798h c9798h3;
        final long j20;
        final int i44;
        final long j21;
        final long j22;
        final int i45;
        final C8476m c8476m3;
        C5332q0 c5332q0M1612T;
        int i46;
        C5207g.m11111f(str, "text");
        ComposerImpl composerImplMo1636j = interfaceC0476a.mo1636j(1968784669);
        if ((i14 & 1) != 0) {
            i15 = i12 | 6;
        } else if ((i12 & 14) == 0) {
            i15 = (composerImplMo1636j.mo1665y(str) ? 4 : 2) | i12;
        } else {
            i15 = i12;
        }
        int i47 = i14 & 2;
        if (i47 == 0) {
            if ((i12 & 112) == 0) {
                i15 |= composerImplMo1636j.mo1665y(interfaceC0500b) ? 32 : 16;
            }
            i16 = i14 & 4;
            if (i16 != 0) {
                i15 |= 384;
            } else if ((i12 & 896) == 0) {
                if (composerImplMo1636j.m1596F(j10)) {
                    i17 = 256;
                } else {
                    i17 = BuildConfig.SDK_TRUNCATE_LENGTH;
                }
                i15 |= i17;
            }
            i18 = i14 & 8;
            if (i18 != 0) {
                i15 |= 3072;
            } else if ((i12 & 7168) == 0) {
                if (composerImplMo1636j.m1596F(j11)) {
                    i19 = 2048;
                } else {
                    i19 = 1024;
                }
                i15 |= i19;
            }
            i20 = i14 & 16;
            if (i20 != 0) {
                i15 |= 24576;
            } else if ((i12 & 57344) == 0) {
                if (composerImplMo1636j.mo1665y(c8471h)) {
                    i21 = 16384;
                } else {
                    i21 = 8192;
                }
                i15 |= i21;
            }
            i22 = i14 & 32;
            if (i22 != 0) {
                i15 |= 196608;
            } else if ((i12 & 458752) == 0) {
                if (composerImplMo1636j.mo1665y(c8476m)) {
                    i23 = 131072;
                } else {
                    i23 = 65536;
                }
                i15 |= i23;
            }
            i24 = i14 & 64;
            if (i24 != 0) {
                i15 |= 1572864;
            } else if ((i12 & 3670016) == 0) {
                if (composerImplMo1636j.mo1665y(abstractC0696b)) {
                    i25 = 1048576;
                } else {
                    i25 = 524288;
                }
                i15 |= i25;
            }
            i26 = i14 & BuildConfig.SDK_TRUNCATE_LENGTH;
            if (i26 != 0) {
                i15 |= 12582912;
            } else if ((i12 & 29360128) == 0) {
                if (composerImplMo1636j.m1596F(j12)) {
                    i27 = 8388608;
                } else {
                    i27 = 4194304;
                }
                i15 |= i27;
            }
            i28 = i14 & 256;
            if (i28 != 0) {
                i15 |= 100663296;
            } else if ((i12 & 234881024) == 0) {
                if (composerImplMo1636j.mo1665y(c9798h)) {
                    i29 = 67108864;
                } else {
                    i29 = 33554432;
                }
                i15 |= i29;
            }
            i30 = i14 & 512;
            if (i30 != 0) {
                i15 |= 805306368;
            } else if ((i12 & 1879048192) == 0) {
                if (composerImplMo1636j.mo1665y(c9797g)) {
                    i31 = 536870912;
                } else {
                    i31 = 268435456;
                }
                i15 |= i31;
            }
            i32 = i14 & 1024;
            if (i32 != 0) {
                i33 = i13 | 6;
            } else if ((i13 & 14) == 0) {
                if (composerImplMo1636j.m1596F(j13)) {
                    i34 = 4;
                } else {
                    i34 = 2;
                }
                i33 = i13 | i34;
            } else {
                i33 = i13;
            }
            i35 = i14 & 2048;
            if (i35 != 0) {
                i33 |= 48;
            } else if ((i13 & 112) == 0) {
                if (composerImplMo1636j.m1594E(i10)) {
                    i36 = 32;
                } else {
                    i36 = 16;
                }
                i33 |= i36;
            }
            i37 = i33;
            i38 = i14 & 4096;
            if (i38 != 0) {
                if ((i13 & 896) == 0) {
                    if (composerImplMo1636j.m1598G(z10)) {
                        i39 = 256;
                    } else {
                        i39 = BuildConfig.SDK_TRUNCATE_LENGTH;
                    }
                    i37 |= i39;
                }
                i40 = i14 & 8192;
                if (i40 != 0) {
                    if ((i13 & 7168) == 0) {
                        i37 |= composerImplMo1636j.m1594E(i11) ? 2048 : 1024;
                    }
                    i41 = i14 & 16384;
                    if (i41 != 0) {
                        if ((i13 & 57344) == 0) {
                            i37 |= composerImplMo1636j.mo1665y(interfaceC2052l) ? 16384 : 8192;
                        }
                        if ((i13 & 458752) != 0) {
                            if ((i14 & 32768) == 0 || !composerImplMo1636j.mo1665y(c7218l)) {
                                i46 = 65536;
                            } else {
                                i46 = 131072;
                            }
                            i37 |= i46;
                        }
                        if ((i15 & 1533916891) != 306783378 && (374491 & i37) == 74898 && composerImplMo1636j.mo1642m()) {
                            composerImplMo1636j.mo1650q();
                            interfaceC0500b3 = interfaceC0500b;
                            j21 = j10;
                            j19 = j11;
                            c8471h3 = c8471h;
                            c8476m3 = c8476m;
                            abstractC0696b3 = abstractC0696b;
                            j22 = j12;
                            c9798h3 = c9798h;
                            c9797g3 = c9797g;
                            j20 = j13;
                            i45 = i10;
                            z14 = z10;
                            i44 = i11;
                            interfaceC2052l3 = interfaceC2052l;
                            c7218l3 = c7218l;
                        } else {
                            composerImplMo1636j.m1654s0();
                            if ((i12 & 1) != 0 || composerImplMo1636j.m1616X()) {
                                if (i47 != 0) {
                                    interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                                } else {
                                    interfaceC0500b2 = interfaceC0500b;
                                }
                                if (i16 != 0) {
                                    j14 = C9169u.f47703f;
                                } else {
                                    j14 = j10;
                                }
                                if (i18 != 0) {
                                    j15 = C10023k.f50982c;
                                } else {
                                    j15 = j11;
                                }
                                if (i20 != 0) {
                                    c8471h2 = null;
                                } else {
                                    c8471h2 = c8471h;
                                }
                                if (i22 != 0) {
                                    c8476m2 = null;
                                } else {
                                    c8476m2 = c8476m;
                                }
                                if (i24 != 0) {
                                    abstractC0696b2 = null;
                                } else {
                                    abstractC0696b2 = abstractC0696b;
                                }
                                if (i26 != 0) {
                                    j16 = C10023k.f50982c;
                                } else {
                                    j16 = j12;
                                }
                                if (i28 != 0) {
                                    c9798h2 = null;
                                } else {
                                    c9798h2 = c9798h;
                                }
                                c9797g2 = i30 == 0 ? c9797g : null;
                                if (i32 != 0) {
                                    j17 = C10023k.f50982c;
                                } else {
                                    j17 = j13;
                                }
                                if (i35 != 0) {
                                    i42 = 1;
                                } else {
                                    i42 = i10;
                                }
                                if (i38 != 0) {
                                    z11 = true;
                                } else {
                                    z11 = z10;
                                }
                                if (i40 != 0) {
                                    i43 = Integer.MAX_VALUE;
                                } else {
                                    i43 = i11;
                                }
                                if (i41 != 0) {
                                    interfaceC2052l2 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.material3.TextKt$Text$1
                                        @Override // cm.InterfaceC2052l
                                        /* JADX INFO: renamed from: n */
                                        public final C9072e mo528n(C7216j c7216j) {
                                            C5207g.m11111f(c7216j, "it");
                                            return C9072e.f47360a;
                                        }
                                    };
                                } else {
                                    interfaceC2052l2 = interfaceC2052l;
                                }
                                if ((i14 & 32768) != 0) {
                                    c7218l2 = (C7218l) composerImplMo1636j.mo1648p(f2808a);
                                    i37 &= -458753;
                                }
                                composerImplMo1636j.m1610R();
                                InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q = ComposerKt.f3003a;
                                composerImplMo1636j.mo1622c(79582607);
                                j18 = C9169u.f47703f;
                                if (j14 != j18) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                if (z12) {
                                    jM14529b = j14;
                                } else {
                                    jM14529b = c7218l2.f40600a.m14529b();
                                    if (jM14529b != j18) {
                                        z13 = true;
                                    } else {
                                        z13 = false;
                                    }
                                    if (z13) {
                                        jM14529b = ((C9169u) composerImplMo1636j.mo1648p(ContentColorKt.f2738a)).f47705a;
                                    }
                                }
                                composerImplMo1636j.m1609Q(false);
                                C7218l c7218l4 = c7218l2;
                                int i48 = (i15 & 112) | (i15 & 14) | ((i37 >> 3) & 7168);
                                int i49 = i37 << 9;
                                BasicTextKt.m1532c(str, interfaceC0500b2, c7218l4.m14544b(new C7218l(jM14529b, j15, c8476m2, c8471h2, abstractC0696b2, j16, c9798h2, c9797g2, j17, 175952)), interfaceC2052l2, i42, z11, i43, composerImplMo1636j, i48 | (i49 & 57344) | (i49 & 458752) | (i49 & 3670016), 0);
                                interfaceC0500b3 = interfaceC0500b2;
                                z14 = z11;
                                c9797g3 = c9797g2;
                                c8471h3 = c8471h2;
                                interfaceC2052l3 = interfaceC2052l2;
                                c7218l3 = c7218l4;
                                abstractC0696b3 = abstractC0696b2;
                                j19 = j15;
                                c9798h3 = c9798h2;
                                j20 = j17;
                                i44 = i43;
                                j21 = j14;
                                j22 = j16;
                                C8476m c8476m4 = c8476m2;
                                i45 = i42;
                                c8476m3 = c8476m4;
                            } else {
                                composerImplMo1636j.mo1650q();
                                if ((i14 & 32768) != 0) {
                                    i37 &= -458753;
                                }
                                interfaceC0500b2 = interfaceC0500b;
                                j14 = j10;
                                j15 = j11;
                                c8471h2 = c8471h;
                                c8476m2 = c8476m;
                                abstractC0696b2 = abstractC0696b;
                                j16 = j12;
                                c9798h2 = c9798h;
                                c9797g2 = c9797g;
                                j17 = j13;
                                i42 = i10;
                                z11 = z10;
                                i43 = i11;
                                interfaceC2052l2 = interfaceC2052l;
                            }
                            c7218l2 = c7218l;
                            composerImplMo1636j.m1610R();
                            InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q2 = ComposerKt.f3003a;
                            composerImplMo1636j.mo1622c(79582607);
                            j18 = C9169u.f47703f;
                            if (j14 != j18) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            if (z12) {
                                jM14529b = j14;
                            } else {
                                jM14529b = c7218l2.f40600a.m14529b();
                                if (jM14529b != j18) {
                                    z13 = true;
                                } else {
                                    z13 = false;
                                }
                                if (z13) {
                                    jM14529b = ((C9169u) composerImplMo1636j.mo1648p(ContentColorKt.f2738a)).f47705a;
                                }
                            }
                            composerImplMo1636j.m1609Q(false);
                            C7218l c7218l5 = c7218l2;
                            int i410 = (i15 & 112) | (i15 & 14) | ((i37 >> 3) & 7168);
                            int i411 = i37 << 9;
                            BasicTextKt.m1532c(str, interfaceC0500b2, c7218l5.m14544b(new C7218l(jM14529b, j15, c8476m2, c8471h2, abstractC0696b2, j16, c9798h2, c9797g2, j17, 175952)), interfaceC2052l2, i42, z11, i43, composerImplMo1636j, i410 | (i411 & 57344) | (i411 & 458752) | (i411 & 3670016), 0);
                            interfaceC0500b3 = interfaceC0500b2;
                            z14 = z11;
                            c9797g3 = c9797g2;
                            c8471h3 = c8471h2;
                            interfaceC2052l3 = interfaceC2052l2;
                            c7218l3 = c7218l5;
                            abstractC0696b3 = abstractC0696b2;
                            j19 = j15;
                            c9798h3 = c9798h2;
                            j20 = j17;
                            i44 = i43;
                            j21 = j14;
                            j22 = j16;
                            C8476m c8476m5 = c8476m2;
                            i45 = i42;
                            c8476m3 = c8476m5;
                        }
                        c5332q0M1612T = composerImplMo1636j.m1612T();
                        if (c5332q0M1612T == null) {
                            return;
                        }
                        c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.material3.TextKt$Text$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                                num.intValue();
                                TextKt.m1576c(str, interfaceC0500b3, j21, j19, c8471h3, c8476m3, abstractC0696b3, j22, c9798h3, c9797g3, j20, i45, z14, i44, interfaceC2052l3, c7218l3, interfaceC0476a2, i12 | 1, i13, i14);
                                return C9072e.f47360a;
                            }
                        };
                    }
                    i37 |= 24576;
                    if ((i13 & 458752) != 0) {
                        if ((i14 & 32768) == 0) {
                            i46 = 65536;
                        } else {
                            i46 = 65536;
                        }
                        i37 |= i46;
                    }
                    if ((i15 & 1533916891) != 306783378) {
                        composerImplMo1636j.m1654s0();
                        if ((i12 & 1) != 0) {
                            if (i47 != 0) {
                                interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                            } else {
                                interfaceC0500b2 = interfaceC0500b;
                            }
                            if (i16 != 0) {
                                j14 = C9169u.f47703f;
                            } else {
                                j14 = j10;
                            }
                            if (i18 != 0) {
                                j15 = C10023k.f50982c;
                            } else {
                                j15 = j11;
                            }
                            if (i20 != 0) {
                                c8471h2 = null;
                            } else {
                                c8471h2 = c8471h;
                            }
                            if (i22 != 0) {
                                c8476m2 = null;
                            } else {
                                c8476m2 = c8476m;
                            }
                            if (i24 != 0) {
                                abstractC0696b2 = null;
                            } else {
                                abstractC0696b2 = abstractC0696b;
                            }
                            if (i26 != 0) {
                                j16 = C10023k.f50982c;
                            } else {
                                j16 = j12;
                            }
                            if (i28 != 0) {
                                c9798h2 = null;
                            } else {
                                c9798h2 = c9798h;
                            }
                            if (i30 == 0) {
                            }
                            if (i32 != 0) {
                                j17 = C10023k.f50982c;
                            } else {
                                j17 = j13;
                            }
                            if (i35 != 0) {
                                i42 = 1;
                            } else {
                                i42 = i10;
                            }
                            if (i38 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            if (i40 != 0) {
                                i43 = Integer.MAX_VALUE;
                            } else {
                                i43 = i11;
                            }
                            if (i41 != 0) {
                                interfaceC2052l2 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.material3.TextKt$Text$1
                                    @Override // cm.InterfaceC2052l
                                    /* JADX INFO: renamed from: n */
                                    public final C9072e mo528n(C7216j c7216j) {
                                        C5207g.m11111f(c7216j, "it");
                                        return C9072e.f47360a;
                                    }
                                };
                            } else {
                                interfaceC2052l2 = interfaceC2052l;
                            }
                            if ((i14 & 32768) != 0) {
                                c7218l2 = (C7218l) composerImplMo1636j.mo1648p(f2808a);
                                i37 &= -458753;
                            } else {
                                c7218l2 = c7218l;
                            }
                        } else {
                            if (i47 != 0) {
                                interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                            } else {
                                interfaceC0500b2 = interfaceC0500b;
                            }
                            if (i16 != 0) {
                                j14 = C9169u.f47703f;
                            } else {
                                j14 = j10;
                            }
                            if (i18 != 0) {
                                j15 = C10023k.f50982c;
                            } else {
                                j15 = j11;
                            }
                            if (i20 != 0) {
                                c8471h2 = null;
                            } else {
                                c8471h2 = c8471h;
                            }
                            if (i22 != 0) {
                                c8476m2 = null;
                            } else {
                                c8476m2 = c8476m;
                            }
                            if (i24 != 0) {
                                abstractC0696b2 = null;
                            } else {
                                abstractC0696b2 = abstractC0696b;
                            }
                            if (i26 != 0) {
                                j16 = C10023k.f50982c;
                            } else {
                                j16 = j12;
                            }
                            if (i28 != 0) {
                                c9798h2 = null;
                            } else {
                                c9798h2 = c9798h;
                            }
                            if (i30 == 0) {
                            }
                            if (i32 != 0) {
                                j17 = C10023k.f50982c;
                            } else {
                                j17 = j13;
                            }
                            if (i35 != 0) {
                                i42 = 1;
                            } else {
                                i42 = i10;
                            }
                            if (i38 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            if (i40 != 0) {
                                i43 = Integer.MAX_VALUE;
                            } else {
                                i43 = i11;
                            }
                            if (i41 != 0) {
                                interfaceC2052l2 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.material3.TextKt$Text$1
                                    @Override // cm.InterfaceC2052l
                                    /* JADX INFO: renamed from: n */
                                    public final C9072e mo528n(C7216j c7216j) {
                                        C5207g.m11111f(c7216j, "it");
                                        return C9072e.f47360a;
                                    }
                                };
                            } else {
                                interfaceC2052l2 = interfaceC2052l;
                            }
                            if ((i14 & 32768) != 0) {
                                c7218l2 = (C7218l) composerImplMo1636j.mo1648p(f2808a);
                                i37 &= -458753;
                            } else {
                                c7218l2 = c7218l;
                            }
                        }
                        composerImplMo1636j.m1610R();
                        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q3 = ComposerKt.f3003a;
                        composerImplMo1636j.mo1622c(79582607);
                        j18 = C9169u.f47703f;
                        if (j14 != j18) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (z12) {
                            jM14529b = j14;
                        } else {
                            jM14529b = c7218l2.f40600a.m14529b();
                            if (jM14529b != j18) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            if (z13) {
                                jM14529b = ((C9169u) composerImplMo1636j.mo1648p(ContentColorKt.f2738a)).f47705a;
                            }
                        }
                        composerImplMo1636j.m1609Q(false);
                        C7218l c7218l6 = c7218l2;
                        int i412 = (i15 & 112) | (i15 & 14) | ((i37 >> 3) & 7168);
                        int i413 = i37 << 9;
                        BasicTextKt.m1532c(str, interfaceC0500b2, c7218l6.m14544b(new C7218l(jM14529b, j15, c8476m2, c8471h2, abstractC0696b2, j16, c9798h2, c9797g2, j17, 175952)), interfaceC2052l2, i42, z11, i43, composerImplMo1636j, i412 | (i413 & 57344) | (i413 & 458752) | (i413 & 3670016), 0);
                        interfaceC0500b3 = interfaceC0500b2;
                        z14 = z11;
                        c9797g3 = c9797g2;
                        c8471h3 = c8471h2;
                        interfaceC2052l3 = interfaceC2052l2;
                        c7218l3 = c7218l6;
                        abstractC0696b3 = abstractC0696b2;
                        j19 = j15;
                        c9798h3 = c9798h2;
                        j20 = j17;
                        i44 = i43;
                        j21 = j14;
                        j22 = j16;
                        C8476m c8476m6 = c8476m2;
                        i45 = i42;
                        c8476m3 = c8476m6;
                    } else {
                        composerImplMo1636j.m1654s0();
                        if ((i12 & 1) != 0) {
                            if (i47 != 0) {
                                interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                            } else {
                                interfaceC0500b2 = interfaceC0500b;
                            }
                            if (i16 != 0) {
                                j14 = C9169u.f47703f;
                            } else {
                                j14 = j10;
                            }
                            if (i18 != 0) {
                                j15 = C10023k.f50982c;
                            } else {
                                j15 = j11;
                            }
                            if (i20 != 0) {
                                c8471h2 = null;
                            } else {
                                c8471h2 = c8471h;
                            }
                            if (i22 != 0) {
                                c8476m2 = null;
                            } else {
                                c8476m2 = c8476m;
                            }
                            if (i24 != 0) {
                                abstractC0696b2 = null;
                            } else {
                                abstractC0696b2 = abstractC0696b;
                            }
                            if (i26 != 0) {
                                j16 = C10023k.f50982c;
                            } else {
                                j16 = j12;
                            }
                            if (i28 != 0) {
                                c9798h2 = null;
                            } else {
                                c9798h2 = c9798h;
                            }
                            if (i30 == 0) {
                            }
                            if (i32 != 0) {
                                j17 = C10023k.f50982c;
                            } else {
                                j17 = j13;
                            }
                            if (i35 != 0) {
                                i42 = 1;
                            } else {
                                i42 = i10;
                            }
                            if (i38 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            if (i40 != 0) {
                                i43 = Integer.MAX_VALUE;
                            } else {
                                i43 = i11;
                            }
                            if (i41 != 0) {
                                interfaceC2052l2 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.material3.TextKt$Text$1
                                    @Override // cm.InterfaceC2052l
                                    /* JADX INFO: renamed from: n */
                                    public final C9072e mo528n(C7216j c7216j) {
                                        C5207g.m11111f(c7216j, "it");
                                        return C9072e.f47360a;
                                    }
                                };
                            } else {
                                interfaceC2052l2 = interfaceC2052l;
                            }
                            if ((i14 & 32768) != 0) {
                                c7218l2 = (C7218l) composerImplMo1636j.mo1648p(f2808a);
                                i37 &= -458753;
                            } else {
                                c7218l2 = c7218l;
                            }
                        } else {
                            if (i47 != 0) {
                                interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                            } else {
                                interfaceC0500b2 = interfaceC0500b;
                            }
                            if (i16 != 0) {
                                j14 = C9169u.f47703f;
                            } else {
                                j14 = j10;
                            }
                            if (i18 != 0) {
                                j15 = C10023k.f50982c;
                            } else {
                                j15 = j11;
                            }
                            if (i20 != 0) {
                                c8471h2 = null;
                            } else {
                                c8471h2 = c8471h;
                            }
                            if (i22 != 0) {
                                c8476m2 = null;
                            } else {
                                c8476m2 = c8476m;
                            }
                            if (i24 != 0) {
                                abstractC0696b2 = null;
                            } else {
                                abstractC0696b2 = abstractC0696b;
                            }
                            if (i26 != 0) {
                                j16 = C10023k.f50982c;
                            } else {
                                j16 = j12;
                            }
                            if (i28 != 0) {
                                c9798h2 = null;
                            } else {
                                c9798h2 = c9798h;
                            }
                            if (i30 == 0) {
                            }
                            if (i32 != 0) {
                                j17 = C10023k.f50982c;
                            } else {
                                j17 = j13;
                            }
                            if (i35 != 0) {
                                i42 = 1;
                            } else {
                                i42 = i10;
                            }
                            if (i38 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            if (i40 != 0) {
                                i43 = Integer.MAX_VALUE;
                            } else {
                                i43 = i11;
                            }
                            if (i41 != 0) {
                                interfaceC2052l2 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.material3.TextKt$Text$1
                                    @Override // cm.InterfaceC2052l
                                    /* JADX INFO: renamed from: n */
                                    public final C9072e mo528n(C7216j c7216j) {
                                        C5207g.m11111f(c7216j, "it");
                                        return C9072e.f47360a;
                                    }
                                };
                            } else {
                                interfaceC2052l2 = interfaceC2052l;
                            }
                            if ((i14 & 32768) != 0) {
                                c7218l2 = (C7218l) composerImplMo1636j.mo1648p(f2808a);
                                i37 &= -458753;
                            } else {
                                c7218l2 = c7218l;
                            }
                        }
                        composerImplMo1636j.m1610R();
                        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q4 = ComposerKt.f3003a;
                        composerImplMo1636j.mo1622c(79582607);
                        j18 = C9169u.f47703f;
                        if (j14 != j18) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (z12) {
                            jM14529b = j14;
                        } else {
                            jM14529b = c7218l2.f40600a.m14529b();
                            if (jM14529b != j18) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            if (z13) {
                                jM14529b = ((C9169u) composerImplMo1636j.mo1648p(ContentColorKt.f2738a)).f47705a;
                            }
                        }
                        composerImplMo1636j.m1609Q(false);
                        C7218l c7218l7 = c7218l2;
                        int i414 = (i15 & 112) | (i15 & 14) | ((i37 >> 3) & 7168);
                        int i415 = i37 << 9;
                        BasicTextKt.m1532c(str, interfaceC0500b2, c7218l7.m14544b(new C7218l(jM14529b, j15, c8476m2, c8471h2, abstractC0696b2, j16, c9798h2, c9797g2, j17, 175952)), interfaceC2052l2, i42, z11, i43, composerImplMo1636j, i414 | (i415 & 57344) | (i415 & 458752) | (i415 & 3670016), 0);
                        interfaceC0500b3 = interfaceC0500b2;
                        z14 = z11;
                        c9797g3 = c9797g2;
                        c8471h3 = c8471h2;
                        interfaceC2052l3 = interfaceC2052l2;
                        c7218l3 = c7218l7;
                        abstractC0696b3 = abstractC0696b2;
                        j19 = j15;
                        c9798h3 = c9798h2;
                        j20 = j17;
                        i44 = i43;
                        j21 = j14;
                        j22 = j16;
                        C8476m c8476m7 = c8476m2;
                        i45 = i42;
                        c8476m3 = c8476m7;
                    }
                    c5332q0M1612T = composerImplMo1636j.m1612T();
                    if (c5332q0M1612T == null) {
                        return;
                    }
                    c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.material3.TextKt$Text$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                            num.intValue();
                            TextKt.m1576c(str, interfaceC0500b3, j21, j19, c8471h3, c8476m3, abstractC0696b3, j22, c9798h3, c9797g3, j20, i45, z14, i44, interfaceC2052l3, c7218l3, interfaceC0476a2, i12 | 1, i13, i14);
                            return C9072e.f47360a;
                        }
                    };
                }
                i37 |= 3072;
                i41 = i14 & 16384;
                if (i41 != 0) {
                    if ((i13 & 57344) == 0) {
                        i37 |= composerImplMo1636j.mo1665y(interfaceC2052l) ? 16384 : 8192;
                    }
                    if ((i13 & 458752) != 0) {
                        if ((i14 & 32768) == 0) {
                            i46 = 65536;
                        } else {
                            i46 = 65536;
                        }
                        i37 |= i46;
                    }
                    if ((i15 & 1533916891) != 306783378) {
                        composerImplMo1636j.m1654s0();
                        if ((i12 & 1) != 0) {
                            if (i47 != 0) {
                                interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                            } else {
                                interfaceC0500b2 = interfaceC0500b;
                            }
                            if (i16 != 0) {
                                j14 = C9169u.f47703f;
                            } else {
                                j14 = j10;
                            }
                            if (i18 != 0) {
                                j15 = C10023k.f50982c;
                            } else {
                                j15 = j11;
                            }
                            if (i20 != 0) {
                                c8471h2 = null;
                            } else {
                                c8471h2 = c8471h;
                            }
                            if (i22 != 0) {
                                c8476m2 = null;
                            } else {
                                c8476m2 = c8476m;
                            }
                            if (i24 != 0) {
                                abstractC0696b2 = null;
                            } else {
                                abstractC0696b2 = abstractC0696b;
                            }
                            if (i26 != 0) {
                                j16 = C10023k.f50982c;
                            } else {
                                j16 = j12;
                            }
                            if (i28 != 0) {
                                c9798h2 = null;
                            } else {
                                c9798h2 = c9798h;
                            }
                            if (i30 == 0) {
                            }
                            if (i32 != 0) {
                                j17 = C10023k.f50982c;
                            } else {
                                j17 = j13;
                            }
                            if (i35 != 0) {
                                i42 = 1;
                            } else {
                                i42 = i10;
                            }
                            if (i38 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            if (i40 != 0) {
                                i43 = Integer.MAX_VALUE;
                            } else {
                                i43 = i11;
                            }
                            if (i41 != 0) {
                                interfaceC2052l2 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.material3.TextKt$Text$1
                                    @Override // cm.InterfaceC2052l
                                    /* JADX INFO: renamed from: n */
                                    public final C9072e mo528n(C7216j c7216j) {
                                        C5207g.m11111f(c7216j, "it");
                                        return C9072e.f47360a;
                                    }
                                };
                            } else {
                                interfaceC2052l2 = interfaceC2052l;
                            }
                            if ((i14 & 32768) != 0) {
                                c7218l2 = (C7218l) composerImplMo1636j.mo1648p(f2808a);
                                i37 &= -458753;
                            } else {
                                c7218l2 = c7218l;
                            }
                        } else {
                            if (i47 != 0) {
                                interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                            } else {
                                interfaceC0500b2 = interfaceC0500b;
                            }
                            if (i16 != 0) {
                                j14 = C9169u.f47703f;
                            } else {
                                j14 = j10;
                            }
                            if (i18 != 0) {
                                j15 = C10023k.f50982c;
                            } else {
                                j15 = j11;
                            }
                            if (i20 != 0) {
                                c8471h2 = null;
                            } else {
                                c8471h2 = c8471h;
                            }
                            if (i22 != 0) {
                                c8476m2 = null;
                            } else {
                                c8476m2 = c8476m;
                            }
                            if (i24 != 0) {
                                abstractC0696b2 = null;
                            } else {
                                abstractC0696b2 = abstractC0696b;
                            }
                            if (i26 != 0) {
                                j16 = C10023k.f50982c;
                            } else {
                                j16 = j12;
                            }
                            if (i28 != 0) {
                                c9798h2 = null;
                            } else {
                                c9798h2 = c9798h;
                            }
                            if (i30 == 0) {
                            }
                            if (i32 != 0) {
                                j17 = C10023k.f50982c;
                            } else {
                                j17 = j13;
                            }
                            if (i35 != 0) {
                                i42 = 1;
                            } else {
                                i42 = i10;
                            }
                            if (i38 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            if (i40 != 0) {
                                i43 = Integer.MAX_VALUE;
                            } else {
                                i43 = i11;
                            }
                            if (i41 != 0) {
                                interfaceC2052l2 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.material3.TextKt$Text$1
                                    @Override // cm.InterfaceC2052l
                                    /* JADX INFO: renamed from: n */
                                    public final C9072e mo528n(C7216j c7216j) {
                                        C5207g.m11111f(c7216j, "it");
                                        return C9072e.f47360a;
                                    }
                                };
                            } else {
                                interfaceC2052l2 = interfaceC2052l;
                            }
                            if ((i14 & 32768) != 0) {
                                c7218l2 = (C7218l) composerImplMo1636j.mo1648p(f2808a);
                                i37 &= -458753;
                            } else {
                                c7218l2 = c7218l;
                            }
                        }
                        composerImplMo1636j.m1610R();
                        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q5 = ComposerKt.f3003a;
                        composerImplMo1636j.mo1622c(79582607);
                        j18 = C9169u.f47703f;
                        if (j14 != j18) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (z12) {
                            jM14529b = j14;
                        } else {
                            jM14529b = c7218l2.f40600a.m14529b();
                            if (jM14529b != j18) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            if (z13) {
                                jM14529b = ((C9169u) composerImplMo1636j.mo1648p(ContentColorKt.f2738a)).f47705a;
                            }
                        }
                        composerImplMo1636j.m1609Q(false);
                        C7218l c7218l8 = c7218l2;
                        int i416 = (i15 & 112) | (i15 & 14) | ((i37 >> 3) & 7168);
                        int i417 = i37 << 9;
                        BasicTextKt.m1532c(str, interfaceC0500b2, c7218l8.m14544b(new C7218l(jM14529b, j15, c8476m2, c8471h2, abstractC0696b2, j16, c9798h2, c9797g2, j17, 175952)), interfaceC2052l2, i42, z11, i43, composerImplMo1636j, i416 | (i417 & 57344) | (i417 & 458752) | (i417 & 3670016), 0);
                        interfaceC0500b3 = interfaceC0500b2;
                        z14 = z11;
                        c9797g3 = c9797g2;
                        c8471h3 = c8471h2;
                        interfaceC2052l3 = interfaceC2052l2;
                        c7218l3 = c7218l8;
                        abstractC0696b3 = abstractC0696b2;
                        j19 = j15;
                        c9798h3 = c9798h2;
                        j20 = j17;
                        i44 = i43;
                        j21 = j14;
                        j22 = j16;
                        C8476m c8476m8 = c8476m2;
                        i45 = i42;
                        c8476m3 = c8476m8;
                    } else {
                        composerImplMo1636j.m1654s0();
                        if ((i12 & 1) != 0) {
                            if (i47 != 0) {
                                interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                            } else {
                                interfaceC0500b2 = interfaceC0500b;
                            }
                            if (i16 != 0) {
                                j14 = C9169u.f47703f;
                            } else {
                                j14 = j10;
                            }
                            if (i18 != 0) {
                                j15 = C10023k.f50982c;
                            } else {
                                j15 = j11;
                            }
                            if (i20 != 0) {
                                c8471h2 = null;
                            } else {
                                c8471h2 = c8471h;
                            }
                            if (i22 != 0) {
                                c8476m2 = null;
                            } else {
                                c8476m2 = c8476m;
                            }
                            if (i24 != 0) {
                                abstractC0696b2 = null;
                            } else {
                                abstractC0696b2 = abstractC0696b;
                            }
                            if (i26 != 0) {
                                j16 = C10023k.f50982c;
                            } else {
                                j16 = j12;
                            }
                            if (i28 != 0) {
                                c9798h2 = null;
                            } else {
                                c9798h2 = c9798h;
                            }
                            if (i30 == 0) {
                            }
                            if (i32 != 0) {
                                j17 = C10023k.f50982c;
                            } else {
                                j17 = j13;
                            }
                            if (i35 != 0) {
                                i42 = 1;
                            } else {
                                i42 = i10;
                            }
                            if (i38 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            if (i40 != 0) {
                                i43 = Integer.MAX_VALUE;
                            } else {
                                i43 = i11;
                            }
                            if (i41 != 0) {
                                interfaceC2052l2 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.material3.TextKt$Text$1
                                    @Override // cm.InterfaceC2052l
                                    /* JADX INFO: renamed from: n */
                                    public final C9072e mo528n(C7216j c7216j) {
                                        C5207g.m11111f(c7216j, "it");
                                        return C9072e.f47360a;
                                    }
                                };
                            } else {
                                interfaceC2052l2 = interfaceC2052l;
                            }
                            if ((i14 & 32768) != 0) {
                                c7218l2 = (C7218l) composerImplMo1636j.mo1648p(f2808a);
                                i37 &= -458753;
                            } else {
                                c7218l2 = c7218l;
                            }
                        } else {
                            if (i47 != 0) {
                                interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                            } else {
                                interfaceC0500b2 = interfaceC0500b;
                            }
                            if (i16 != 0) {
                                j14 = C9169u.f47703f;
                            } else {
                                j14 = j10;
                            }
                            if (i18 != 0) {
                                j15 = C10023k.f50982c;
                            } else {
                                j15 = j11;
                            }
                            if (i20 != 0) {
                                c8471h2 = null;
                            } else {
                                c8471h2 = c8471h;
                            }
                            if (i22 != 0) {
                                c8476m2 = null;
                            } else {
                                c8476m2 = c8476m;
                            }
                            if (i24 != 0) {
                                abstractC0696b2 = null;
                            } else {
                                abstractC0696b2 = abstractC0696b;
                            }
                            if (i26 != 0) {
                                j16 = C10023k.f50982c;
                            } else {
                                j16 = j12;
                            }
                            if (i28 != 0) {
                                c9798h2 = null;
                            } else {
                                c9798h2 = c9798h;
                            }
                            if (i30 == 0) {
                            }
                            if (i32 != 0) {
                                j17 = C10023k.f50982c;
                            } else {
                                j17 = j13;
                            }
                            if (i35 != 0) {
                                i42 = 1;
                            } else {
                                i42 = i10;
                            }
                            if (i38 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            if (i40 != 0) {
                                i43 = Integer.MAX_VALUE;
                            } else {
                                i43 = i11;
                            }
                            if (i41 != 0) {
                                interfaceC2052l2 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.material3.TextKt$Text$1
                                    @Override // cm.InterfaceC2052l
                                    /* JADX INFO: renamed from: n */
                                    public final C9072e mo528n(C7216j c7216j) {
                                        C5207g.m11111f(c7216j, "it");
                                        return C9072e.f47360a;
                                    }
                                };
                            } else {
                                interfaceC2052l2 = interfaceC2052l;
                            }
                            if ((i14 & 32768) != 0) {
                                c7218l2 = (C7218l) composerImplMo1636j.mo1648p(f2808a);
                                i37 &= -458753;
                            } else {
                                c7218l2 = c7218l;
                            }
                        }
                        composerImplMo1636j.m1610R();
                        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q6 = ComposerKt.f3003a;
                        composerImplMo1636j.mo1622c(79582607);
                        j18 = C9169u.f47703f;
                        if (j14 != j18) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (z12) {
                            jM14529b = j14;
                        } else {
                            jM14529b = c7218l2.f40600a.m14529b();
                            if (jM14529b != j18) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            if (z13) {
                                jM14529b = ((C9169u) composerImplMo1636j.mo1648p(ContentColorKt.f2738a)).f47705a;
                            }
                        }
                        composerImplMo1636j.m1609Q(false);
                        C7218l c7218l9 = c7218l2;
                        int i418 = (i15 & 112) | (i15 & 14) | ((i37 >> 3) & 7168);
                        int i419 = i37 << 9;
                        BasicTextKt.m1532c(str, interfaceC0500b2, c7218l9.m14544b(new C7218l(jM14529b, j15, c8476m2, c8471h2, abstractC0696b2, j16, c9798h2, c9797g2, j17, 175952)), interfaceC2052l2, i42, z11, i43, composerImplMo1636j, i418 | (i419 & 57344) | (i419 & 458752) | (i419 & 3670016), 0);
                        interfaceC0500b3 = interfaceC0500b2;
                        z14 = z11;
                        c9797g3 = c9797g2;
                        c8471h3 = c8471h2;
                        interfaceC2052l3 = interfaceC2052l2;
                        c7218l3 = c7218l9;
                        abstractC0696b3 = abstractC0696b2;
                        j19 = j15;
                        c9798h3 = c9798h2;
                        j20 = j17;
                        i44 = i43;
                        j21 = j14;
                        j22 = j16;
                        C8476m c8476m9 = c8476m2;
                        i45 = i42;
                        c8476m3 = c8476m9;
                    }
                    c5332q0M1612T = composerImplMo1636j.m1612T();
                    if (c5332q0M1612T == null) {
                        return;
                    }
                    c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.material3.TextKt$Text$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                            num.intValue();
                            TextKt.m1576c(str, interfaceC0500b3, j21, j19, c8471h3, c8476m3, abstractC0696b3, j22, c9798h3, c9797g3, j20, i45, z14, i44, interfaceC2052l3, c7218l3, interfaceC0476a2, i12 | 1, i13, i14);
                            return C9072e.f47360a;
                        }
                    };
                }
                i37 |= 24576;
                if ((i13 & 458752) != 0) {
                    if ((i14 & 32768) == 0) {
                        i46 = 65536;
                    } else {
                        i46 = 65536;
                    }
                    i37 |= i46;
                }
                if ((i15 & 1533916891) != 306783378) {
                    composerImplMo1636j.m1654s0();
                    if ((i12 & 1) != 0) {
                        if (i47 != 0) {
                            interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                        } else {
                            interfaceC0500b2 = interfaceC0500b;
                        }
                        if (i16 != 0) {
                            j14 = C9169u.f47703f;
                        } else {
                            j14 = j10;
                        }
                        if (i18 != 0) {
                            j15 = C10023k.f50982c;
                        } else {
                            j15 = j11;
                        }
                        if (i20 != 0) {
                            c8471h2 = null;
                        } else {
                            c8471h2 = c8471h;
                        }
                        if (i22 != 0) {
                            c8476m2 = null;
                        } else {
                            c8476m2 = c8476m;
                        }
                        if (i24 != 0) {
                            abstractC0696b2 = null;
                        } else {
                            abstractC0696b2 = abstractC0696b;
                        }
                        if (i26 != 0) {
                            j16 = C10023k.f50982c;
                        } else {
                            j16 = j12;
                        }
                        if (i28 != 0) {
                            c9798h2 = null;
                        } else {
                            c9798h2 = c9798h;
                        }
                        if (i30 == 0) {
                        }
                        if (i32 != 0) {
                            j17 = C10023k.f50982c;
                        } else {
                            j17 = j13;
                        }
                        if (i35 != 0) {
                            i42 = 1;
                        } else {
                            i42 = i10;
                        }
                        if (i38 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if (i40 != 0) {
                            i43 = Integer.MAX_VALUE;
                        } else {
                            i43 = i11;
                        }
                        if (i41 != 0) {
                            interfaceC2052l2 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.material3.TextKt$Text$1
                                @Override // cm.InterfaceC2052l
                                /* JADX INFO: renamed from: n */
                                public final C9072e mo528n(C7216j c7216j) {
                                    C5207g.m11111f(c7216j, "it");
                                    return C9072e.f47360a;
                                }
                            };
                        } else {
                            interfaceC2052l2 = interfaceC2052l;
                        }
                        if ((i14 & 32768) != 0) {
                            c7218l2 = (C7218l) composerImplMo1636j.mo1648p(f2808a);
                            i37 &= -458753;
                        } else {
                            c7218l2 = c7218l;
                        }
                    } else {
                        if (i47 != 0) {
                            interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                        } else {
                            interfaceC0500b2 = interfaceC0500b;
                        }
                        if (i16 != 0) {
                            j14 = C9169u.f47703f;
                        } else {
                            j14 = j10;
                        }
                        if (i18 != 0) {
                            j15 = C10023k.f50982c;
                        } else {
                            j15 = j11;
                        }
                        if (i20 != 0) {
                            c8471h2 = null;
                        } else {
                            c8471h2 = c8471h;
                        }
                        if (i22 != 0) {
                            c8476m2 = null;
                        } else {
                            c8476m2 = c8476m;
                        }
                        if (i24 != 0) {
                            abstractC0696b2 = null;
                        } else {
                            abstractC0696b2 = abstractC0696b;
                        }
                        if (i26 != 0) {
                            j16 = C10023k.f50982c;
                        } else {
                            j16 = j12;
                        }
                        if (i28 != 0) {
                            c9798h2 = null;
                        } else {
                            c9798h2 = c9798h;
                        }
                        if (i30 == 0) {
                        }
                        if (i32 != 0) {
                            j17 = C10023k.f50982c;
                        } else {
                            j17 = j13;
                        }
                        if (i35 != 0) {
                            i42 = 1;
                        } else {
                            i42 = i10;
                        }
                        if (i38 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if (i40 != 0) {
                            i43 = Integer.MAX_VALUE;
                        } else {
                            i43 = i11;
                        }
                        if (i41 != 0) {
                            interfaceC2052l2 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.material3.TextKt$Text$1
                                @Override // cm.InterfaceC2052l
                                /* JADX INFO: renamed from: n */
                                public final C9072e mo528n(C7216j c7216j) {
                                    C5207g.m11111f(c7216j, "it");
                                    return C9072e.f47360a;
                                }
                            };
                        } else {
                            interfaceC2052l2 = interfaceC2052l;
                        }
                        if ((i14 & 32768) != 0) {
                            c7218l2 = (C7218l) composerImplMo1636j.mo1648p(f2808a);
                            i37 &= -458753;
                        } else {
                            c7218l2 = c7218l;
                        }
                    }
                    composerImplMo1636j.m1610R();
                    InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q7 = ComposerKt.f3003a;
                    composerImplMo1636j.mo1622c(79582607);
                    j18 = C9169u.f47703f;
                    if (j14 != j18) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (z12) {
                        jM14529b = j14;
                    } else {
                        jM14529b = c7218l2.f40600a.m14529b();
                        if (jM14529b != j18) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (z13) {
                            jM14529b = ((C9169u) composerImplMo1636j.mo1648p(ContentColorKt.f2738a)).f47705a;
                        }
                    }
                    composerImplMo1636j.m1609Q(false);
                    C7218l c7218l10 = c7218l2;
                    int i4110 = (i15 & 112) | (i15 & 14) | ((i37 >> 3) & 7168);
                    int i4111 = i37 << 9;
                    BasicTextKt.m1532c(str, interfaceC0500b2, c7218l10.m14544b(new C7218l(jM14529b, j15, c8476m2, c8471h2, abstractC0696b2, j16, c9798h2, c9797g2, j17, 175952)), interfaceC2052l2, i42, z11, i43, composerImplMo1636j, i4110 | (i4111 & 57344) | (i4111 & 458752) | (i4111 & 3670016), 0);
                    interfaceC0500b3 = interfaceC0500b2;
                    z14 = z11;
                    c9797g3 = c9797g2;
                    c8471h3 = c8471h2;
                    interfaceC2052l3 = interfaceC2052l2;
                    c7218l3 = c7218l10;
                    abstractC0696b3 = abstractC0696b2;
                    j19 = j15;
                    c9798h3 = c9798h2;
                    j20 = j17;
                    i44 = i43;
                    j21 = j14;
                    j22 = j16;
                    C8476m c8476m10 = c8476m2;
                    i45 = i42;
                    c8476m3 = c8476m10;
                } else {
                    composerImplMo1636j.m1654s0();
                    if ((i12 & 1) != 0) {
                        if (i47 != 0) {
                            interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                        } else {
                            interfaceC0500b2 = interfaceC0500b;
                        }
                        if (i16 != 0) {
                            j14 = C9169u.f47703f;
                        } else {
                            j14 = j10;
                        }
                        if (i18 != 0) {
                            j15 = C10023k.f50982c;
                        } else {
                            j15 = j11;
                        }
                        if (i20 != 0) {
                            c8471h2 = null;
                        } else {
                            c8471h2 = c8471h;
                        }
                        if (i22 != 0) {
                            c8476m2 = null;
                        } else {
                            c8476m2 = c8476m;
                        }
                        if (i24 != 0) {
                            abstractC0696b2 = null;
                        } else {
                            abstractC0696b2 = abstractC0696b;
                        }
                        if (i26 != 0) {
                            j16 = C10023k.f50982c;
                        } else {
                            j16 = j12;
                        }
                        if (i28 != 0) {
                            c9798h2 = null;
                        } else {
                            c9798h2 = c9798h;
                        }
                        if (i30 == 0) {
                        }
                        if (i32 != 0) {
                            j17 = C10023k.f50982c;
                        } else {
                            j17 = j13;
                        }
                        if (i35 != 0) {
                            i42 = 1;
                        } else {
                            i42 = i10;
                        }
                        if (i38 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if (i40 != 0) {
                            i43 = Integer.MAX_VALUE;
                        } else {
                            i43 = i11;
                        }
                        if (i41 != 0) {
                            interfaceC2052l2 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.material3.TextKt$Text$1
                                @Override // cm.InterfaceC2052l
                                /* JADX INFO: renamed from: n */
                                public final C9072e mo528n(C7216j c7216j) {
                                    C5207g.m11111f(c7216j, "it");
                                    return C9072e.f47360a;
                                }
                            };
                        } else {
                            interfaceC2052l2 = interfaceC2052l;
                        }
                        if ((i14 & 32768) != 0) {
                            c7218l2 = (C7218l) composerImplMo1636j.mo1648p(f2808a);
                            i37 &= -458753;
                        } else {
                            c7218l2 = c7218l;
                        }
                    } else {
                        if (i47 != 0) {
                            interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                        } else {
                            interfaceC0500b2 = interfaceC0500b;
                        }
                        if (i16 != 0) {
                            j14 = C9169u.f47703f;
                        } else {
                            j14 = j10;
                        }
                        if (i18 != 0) {
                            j15 = C10023k.f50982c;
                        } else {
                            j15 = j11;
                        }
                        if (i20 != 0) {
                            c8471h2 = null;
                        } else {
                            c8471h2 = c8471h;
                        }
                        if (i22 != 0) {
                            c8476m2 = null;
                        } else {
                            c8476m2 = c8476m;
                        }
                        if (i24 != 0) {
                            abstractC0696b2 = null;
                        } else {
                            abstractC0696b2 = abstractC0696b;
                        }
                        if (i26 != 0) {
                            j16 = C10023k.f50982c;
                        } else {
                            j16 = j12;
                        }
                        if (i28 != 0) {
                            c9798h2 = null;
                        } else {
                            c9798h2 = c9798h;
                        }
                        if (i30 == 0) {
                        }
                        if (i32 != 0) {
                            j17 = C10023k.f50982c;
                        } else {
                            j17 = j13;
                        }
                        if (i35 != 0) {
                            i42 = 1;
                        } else {
                            i42 = i10;
                        }
                        if (i38 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if (i40 != 0) {
                            i43 = Integer.MAX_VALUE;
                        } else {
                            i43 = i11;
                        }
                        if (i41 != 0) {
                            interfaceC2052l2 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.material3.TextKt$Text$1
                                @Override // cm.InterfaceC2052l
                                /* JADX INFO: renamed from: n */
                                public final C9072e mo528n(C7216j c7216j) {
                                    C5207g.m11111f(c7216j, "it");
                                    return C9072e.f47360a;
                                }
                            };
                        } else {
                            interfaceC2052l2 = interfaceC2052l;
                        }
                        if ((i14 & 32768) != 0) {
                            c7218l2 = (C7218l) composerImplMo1636j.mo1648p(f2808a);
                            i37 &= -458753;
                        } else {
                            c7218l2 = c7218l;
                        }
                    }
                    composerImplMo1636j.m1610R();
                    InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q8 = ComposerKt.f3003a;
                    composerImplMo1636j.mo1622c(79582607);
                    j18 = C9169u.f47703f;
                    if (j14 != j18) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (z12) {
                        jM14529b = j14;
                    } else {
                        jM14529b = c7218l2.f40600a.m14529b();
                        if (jM14529b != j18) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (z13) {
                            jM14529b = ((C9169u) composerImplMo1636j.mo1648p(ContentColorKt.f2738a)).f47705a;
                        }
                    }
                    composerImplMo1636j.m1609Q(false);
                    C7218l c7218l11 = c7218l2;
                    int i4112 = (i15 & 112) | (i15 & 14) | ((i37 >> 3) & 7168);
                    int i4113 = i37 << 9;
                    BasicTextKt.m1532c(str, interfaceC0500b2, c7218l11.m14544b(new C7218l(jM14529b, j15, c8476m2, c8471h2, abstractC0696b2, j16, c9798h2, c9797g2, j17, 175952)), interfaceC2052l2, i42, z11, i43, composerImplMo1636j, i4112 | (i4113 & 57344) | (i4113 & 458752) | (i4113 & 3670016), 0);
                    interfaceC0500b3 = interfaceC0500b2;
                    z14 = z11;
                    c9797g3 = c9797g2;
                    c8471h3 = c8471h2;
                    interfaceC2052l3 = interfaceC2052l2;
                    c7218l3 = c7218l11;
                    abstractC0696b3 = abstractC0696b2;
                    j19 = j15;
                    c9798h3 = c9798h2;
                    j20 = j17;
                    i44 = i43;
                    j21 = j14;
                    j22 = j16;
                    C8476m c8476m11 = c8476m2;
                    i45 = i42;
                    c8476m3 = c8476m11;
                }
                c5332q0M1612T = composerImplMo1636j.m1612T();
                if (c5332q0M1612T == null) {
                    return;
                }
                c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.material3.TextKt$Text$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // cm.InterfaceC2056p
                    /* JADX INFO: renamed from: m0 */
                    public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                        num.intValue();
                        TextKt.m1576c(str, interfaceC0500b3, j21, j19, c8471h3, c8476m3, abstractC0696b3, j22, c9798h3, c9797g3, j20, i45, z14, i44, interfaceC2052l3, c7218l3, interfaceC0476a2, i12 | 1, i13, i14);
                        return C9072e.f47360a;
                    }
                };
            }
            i37 |= 384;
            i40 = i14 & 8192;
            if (i40 != 0) {
                if ((i13 & 7168) == 0) {
                    i37 |= composerImplMo1636j.m1594E(i11) ? 2048 : 1024;
                }
                i41 = i14 & 16384;
                if (i41 != 0) {
                    if ((i13 & 57344) == 0) {
                        i37 |= composerImplMo1636j.mo1665y(interfaceC2052l) ? 16384 : 8192;
                    }
                    if ((i13 & 458752) != 0) {
                        if ((i14 & 32768) == 0) {
                            i46 = 65536;
                        } else {
                            i46 = 65536;
                        }
                        i37 |= i46;
                    }
                    if ((i15 & 1533916891) != 306783378) {
                        composerImplMo1636j.m1654s0();
                        if ((i12 & 1) != 0) {
                            if (i47 != 0) {
                                interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                            } else {
                                interfaceC0500b2 = interfaceC0500b;
                            }
                            if (i16 != 0) {
                                j14 = C9169u.f47703f;
                            } else {
                                j14 = j10;
                            }
                            if (i18 != 0) {
                                j15 = C10023k.f50982c;
                            } else {
                                j15 = j11;
                            }
                            if (i20 != 0) {
                                c8471h2 = null;
                            } else {
                                c8471h2 = c8471h;
                            }
                            if (i22 != 0) {
                                c8476m2 = null;
                            } else {
                                c8476m2 = c8476m;
                            }
                            if (i24 != 0) {
                                abstractC0696b2 = null;
                            } else {
                                abstractC0696b2 = abstractC0696b;
                            }
                            if (i26 != 0) {
                                j16 = C10023k.f50982c;
                            } else {
                                j16 = j12;
                            }
                            if (i28 != 0) {
                                c9798h2 = null;
                            } else {
                                c9798h2 = c9798h;
                            }
                            if (i30 == 0) {
                            }
                            if (i32 != 0) {
                                j17 = C10023k.f50982c;
                            } else {
                                j17 = j13;
                            }
                            if (i35 != 0) {
                                i42 = 1;
                            } else {
                                i42 = i10;
                            }
                            if (i38 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            if (i40 != 0) {
                                i43 = Integer.MAX_VALUE;
                            } else {
                                i43 = i11;
                            }
                            if (i41 != 0) {
                                interfaceC2052l2 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.material3.TextKt$Text$1
                                    @Override // cm.InterfaceC2052l
                                    /* JADX INFO: renamed from: n */
                                    public final C9072e mo528n(C7216j c7216j) {
                                        C5207g.m11111f(c7216j, "it");
                                        return C9072e.f47360a;
                                    }
                                };
                            } else {
                                interfaceC2052l2 = interfaceC2052l;
                            }
                            if ((i14 & 32768) != 0) {
                                c7218l2 = (C7218l) composerImplMo1636j.mo1648p(f2808a);
                                i37 &= -458753;
                            } else {
                                c7218l2 = c7218l;
                            }
                        } else {
                            if (i47 != 0) {
                                interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                            } else {
                                interfaceC0500b2 = interfaceC0500b;
                            }
                            if (i16 != 0) {
                                j14 = C9169u.f47703f;
                            } else {
                                j14 = j10;
                            }
                            if (i18 != 0) {
                                j15 = C10023k.f50982c;
                            } else {
                                j15 = j11;
                            }
                            if (i20 != 0) {
                                c8471h2 = null;
                            } else {
                                c8471h2 = c8471h;
                            }
                            if (i22 != 0) {
                                c8476m2 = null;
                            } else {
                                c8476m2 = c8476m;
                            }
                            if (i24 != 0) {
                                abstractC0696b2 = null;
                            } else {
                                abstractC0696b2 = abstractC0696b;
                            }
                            if (i26 != 0) {
                                j16 = C10023k.f50982c;
                            } else {
                                j16 = j12;
                            }
                            if (i28 != 0) {
                                c9798h2 = null;
                            } else {
                                c9798h2 = c9798h;
                            }
                            if (i30 == 0) {
                            }
                            if (i32 != 0) {
                                j17 = C10023k.f50982c;
                            } else {
                                j17 = j13;
                            }
                            if (i35 != 0) {
                                i42 = 1;
                            } else {
                                i42 = i10;
                            }
                            if (i38 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            if (i40 != 0) {
                                i43 = Integer.MAX_VALUE;
                            } else {
                                i43 = i11;
                            }
                            if (i41 != 0) {
                                interfaceC2052l2 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.material3.TextKt$Text$1
                                    @Override // cm.InterfaceC2052l
                                    /* JADX INFO: renamed from: n */
                                    public final C9072e mo528n(C7216j c7216j) {
                                        C5207g.m11111f(c7216j, "it");
                                        return C9072e.f47360a;
                                    }
                                };
                            } else {
                                interfaceC2052l2 = interfaceC2052l;
                            }
                            if ((i14 & 32768) != 0) {
                                c7218l2 = (C7218l) composerImplMo1636j.mo1648p(f2808a);
                                i37 &= -458753;
                            } else {
                                c7218l2 = c7218l;
                            }
                        }
                        composerImplMo1636j.m1610R();
                        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q9 = ComposerKt.f3003a;
                        composerImplMo1636j.mo1622c(79582607);
                        j18 = C9169u.f47703f;
                        if (j14 != j18) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (z12) {
                            jM14529b = j14;
                        } else {
                            jM14529b = c7218l2.f40600a.m14529b();
                            if (jM14529b != j18) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            if (z13) {
                                jM14529b = ((C9169u) composerImplMo1636j.mo1648p(ContentColorKt.f2738a)).f47705a;
                            }
                        }
                        composerImplMo1636j.m1609Q(false);
                        C7218l c7218l12 = c7218l2;
                        int i4114 = (i15 & 112) | (i15 & 14) | ((i37 >> 3) & 7168);
                        int i4115 = i37 << 9;
                        BasicTextKt.m1532c(str, interfaceC0500b2, c7218l12.m14544b(new C7218l(jM14529b, j15, c8476m2, c8471h2, abstractC0696b2, j16, c9798h2, c9797g2, j17, 175952)), interfaceC2052l2, i42, z11, i43, composerImplMo1636j, i4114 | (i4115 & 57344) | (i4115 & 458752) | (i4115 & 3670016), 0);
                        interfaceC0500b3 = interfaceC0500b2;
                        z14 = z11;
                        c9797g3 = c9797g2;
                        c8471h3 = c8471h2;
                        interfaceC2052l3 = interfaceC2052l2;
                        c7218l3 = c7218l12;
                        abstractC0696b3 = abstractC0696b2;
                        j19 = j15;
                        c9798h3 = c9798h2;
                        j20 = j17;
                        i44 = i43;
                        j21 = j14;
                        j22 = j16;
                        C8476m c8476m12 = c8476m2;
                        i45 = i42;
                        c8476m3 = c8476m12;
                    } else {
                        composerImplMo1636j.m1654s0();
                        if ((i12 & 1) != 0) {
                            if (i47 != 0) {
                                interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                            } else {
                                interfaceC0500b2 = interfaceC0500b;
                            }
                            if (i16 != 0) {
                                j14 = C9169u.f47703f;
                            } else {
                                j14 = j10;
                            }
                            if (i18 != 0) {
                                j15 = C10023k.f50982c;
                            } else {
                                j15 = j11;
                            }
                            if (i20 != 0) {
                                c8471h2 = null;
                            } else {
                                c8471h2 = c8471h;
                            }
                            if (i22 != 0) {
                                c8476m2 = null;
                            } else {
                                c8476m2 = c8476m;
                            }
                            if (i24 != 0) {
                                abstractC0696b2 = null;
                            } else {
                                abstractC0696b2 = abstractC0696b;
                            }
                            if (i26 != 0) {
                                j16 = C10023k.f50982c;
                            } else {
                                j16 = j12;
                            }
                            if (i28 != 0) {
                                c9798h2 = null;
                            } else {
                                c9798h2 = c9798h;
                            }
                            if (i30 == 0) {
                            }
                            if (i32 != 0) {
                                j17 = C10023k.f50982c;
                            } else {
                                j17 = j13;
                            }
                            if (i35 != 0) {
                                i42 = 1;
                            } else {
                                i42 = i10;
                            }
                            if (i38 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            if (i40 != 0) {
                                i43 = Integer.MAX_VALUE;
                            } else {
                                i43 = i11;
                            }
                            if (i41 != 0) {
                                interfaceC2052l2 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.material3.TextKt$Text$1
                                    @Override // cm.InterfaceC2052l
                                    /* JADX INFO: renamed from: n */
                                    public final C9072e mo528n(C7216j c7216j) {
                                        C5207g.m11111f(c7216j, "it");
                                        return C9072e.f47360a;
                                    }
                                };
                            } else {
                                interfaceC2052l2 = interfaceC2052l;
                            }
                            if ((i14 & 32768) != 0) {
                                c7218l2 = (C7218l) composerImplMo1636j.mo1648p(f2808a);
                                i37 &= -458753;
                            } else {
                                c7218l2 = c7218l;
                            }
                        } else {
                            if (i47 != 0) {
                                interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                            } else {
                                interfaceC0500b2 = interfaceC0500b;
                            }
                            if (i16 != 0) {
                                j14 = C9169u.f47703f;
                            } else {
                                j14 = j10;
                            }
                            if (i18 != 0) {
                                j15 = C10023k.f50982c;
                            } else {
                                j15 = j11;
                            }
                            if (i20 != 0) {
                                c8471h2 = null;
                            } else {
                                c8471h2 = c8471h;
                            }
                            if (i22 != 0) {
                                c8476m2 = null;
                            } else {
                                c8476m2 = c8476m;
                            }
                            if (i24 != 0) {
                                abstractC0696b2 = null;
                            } else {
                                abstractC0696b2 = abstractC0696b;
                            }
                            if (i26 != 0) {
                                j16 = C10023k.f50982c;
                            } else {
                                j16 = j12;
                            }
                            if (i28 != 0) {
                                c9798h2 = null;
                            } else {
                                c9798h2 = c9798h;
                            }
                            if (i30 == 0) {
                            }
                            if (i32 != 0) {
                                j17 = C10023k.f50982c;
                            } else {
                                j17 = j13;
                            }
                            if (i35 != 0) {
                                i42 = 1;
                            } else {
                                i42 = i10;
                            }
                            if (i38 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            if (i40 != 0) {
                                i43 = Integer.MAX_VALUE;
                            } else {
                                i43 = i11;
                            }
                            if (i41 != 0) {
                                interfaceC2052l2 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.material3.TextKt$Text$1
                                    @Override // cm.InterfaceC2052l
                                    /* JADX INFO: renamed from: n */
                                    public final C9072e mo528n(C7216j c7216j) {
                                        C5207g.m11111f(c7216j, "it");
                                        return C9072e.f47360a;
                                    }
                                };
                            } else {
                                interfaceC2052l2 = interfaceC2052l;
                            }
                            if ((i14 & 32768) != 0) {
                                c7218l2 = (C7218l) composerImplMo1636j.mo1648p(f2808a);
                                i37 &= -458753;
                            } else {
                                c7218l2 = c7218l;
                            }
                        }
                        composerImplMo1636j.m1610R();
                        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q10 = ComposerKt.f3003a;
                        composerImplMo1636j.mo1622c(79582607);
                        j18 = C9169u.f47703f;
                        if (j14 != j18) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (z12) {
                            jM14529b = j14;
                        } else {
                            jM14529b = c7218l2.f40600a.m14529b();
                            if (jM14529b != j18) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            if (z13) {
                                jM14529b = ((C9169u) composerImplMo1636j.mo1648p(ContentColorKt.f2738a)).f47705a;
                            }
                        }
                        composerImplMo1636j.m1609Q(false);
                        C7218l c7218l13 = c7218l2;
                        int i4116 = (i15 & 112) | (i15 & 14) | ((i37 >> 3) & 7168);
                        int i4117 = i37 << 9;
                        BasicTextKt.m1532c(str, interfaceC0500b2, c7218l13.m14544b(new C7218l(jM14529b, j15, c8476m2, c8471h2, abstractC0696b2, j16, c9798h2, c9797g2, j17, 175952)), interfaceC2052l2, i42, z11, i43, composerImplMo1636j, i4116 | (i4117 & 57344) | (i4117 & 458752) | (i4117 & 3670016), 0);
                        interfaceC0500b3 = interfaceC0500b2;
                        z14 = z11;
                        c9797g3 = c9797g2;
                        c8471h3 = c8471h2;
                        interfaceC2052l3 = interfaceC2052l2;
                        c7218l3 = c7218l13;
                        abstractC0696b3 = abstractC0696b2;
                        j19 = j15;
                        c9798h3 = c9798h2;
                        j20 = j17;
                        i44 = i43;
                        j21 = j14;
                        j22 = j16;
                        C8476m c8476m13 = c8476m2;
                        i45 = i42;
                        c8476m3 = c8476m13;
                    }
                    c5332q0M1612T = composerImplMo1636j.m1612T();
                    if (c5332q0M1612T == null) {
                        return;
                    }
                    c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.material3.TextKt$Text$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                            num.intValue();
                            TextKt.m1576c(str, interfaceC0500b3, j21, j19, c8471h3, c8476m3, abstractC0696b3, j22, c9798h3, c9797g3, j20, i45, z14, i44, interfaceC2052l3, c7218l3, interfaceC0476a2, i12 | 1, i13, i14);
                            return C9072e.f47360a;
                        }
                    };
                }
                i37 |= 24576;
                if ((i13 & 458752) != 0) {
                    if ((i14 & 32768) == 0) {
                        i46 = 65536;
                    } else {
                        i46 = 65536;
                    }
                    i37 |= i46;
                }
                if ((i15 & 1533916891) != 306783378) {
                    composerImplMo1636j.m1654s0();
                    if ((i12 & 1) != 0) {
                        if (i47 != 0) {
                            interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                        } else {
                            interfaceC0500b2 = interfaceC0500b;
                        }
                        if (i16 != 0) {
                            j14 = C9169u.f47703f;
                        } else {
                            j14 = j10;
                        }
                        if (i18 != 0) {
                            j15 = C10023k.f50982c;
                        } else {
                            j15 = j11;
                        }
                        if (i20 != 0) {
                            c8471h2 = null;
                        } else {
                            c8471h2 = c8471h;
                        }
                        if (i22 != 0) {
                            c8476m2 = null;
                        } else {
                            c8476m2 = c8476m;
                        }
                        if (i24 != 0) {
                            abstractC0696b2 = null;
                        } else {
                            abstractC0696b2 = abstractC0696b;
                        }
                        if (i26 != 0) {
                            j16 = C10023k.f50982c;
                        } else {
                            j16 = j12;
                        }
                        if (i28 != 0) {
                            c9798h2 = null;
                        } else {
                            c9798h2 = c9798h;
                        }
                        if (i30 == 0) {
                        }
                        if (i32 != 0) {
                            j17 = C10023k.f50982c;
                        } else {
                            j17 = j13;
                        }
                        if (i35 != 0) {
                            i42 = 1;
                        } else {
                            i42 = i10;
                        }
                        if (i38 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if (i40 != 0) {
                            i43 = Integer.MAX_VALUE;
                        } else {
                            i43 = i11;
                        }
                        if (i41 != 0) {
                            interfaceC2052l2 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.material3.TextKt$Text$1
                                @Override // cm.InterfaceC2052l
                                /* JADX INFO: renamed from: n */
                                public final C9072e mo528n(C7216j c7216j) {
                                    C5207g.m11111f(c7216j, "it");
                                    return C9072e.f47360a;
                                }
                            };
                        } else {
                            interfaceC2052l2 = interfaceC2052l;
                        }
                        if ((i14 & 32768) != 0) {
                            c7218l2 = (C7218l) composerImplMo1636j.mo1648p(f2808a);
                            i37 &= -458753;
                        } else {
                            c7218l2 = c7218l;
                        }
                    } else {
                        if (i47 != 0) {
                            interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                        } else {
                            interfaceC0500b2 = interfaceC0500b;
                        }
                        if (i16 != 0) {
                            j14 = C9169u.f47703f;
                        } else {
                            j14 = j10;
                        }
                        if (i18 != 0) {
                            j15 = C10023k.f50982c;
                        } else {
                            j15 = j11;
                        }
                        if (i20 != 0) {
                            c8471h2 = null;
                        } else {
                            c8471h2 = c8471h;
                        }
                        if (i22 != 0) {
                            c8476m2 = null;
                        } else {
                            c8476m2 = c8476m;
                        }
                        if (i24 != 0) {
                            abstractC0696b2 = null;
                        } else {
                            abstractC0696b2 = abstractC0696b;
                        }
                        if (i26 != 0) {
                            j16 = C10023k.f50982c;
                        } else {
                            j16 = j12;
                        }
                        if (i28 != 0) {
                            c9798h2 = null;
                        } else {
                            c9798h2 = c9798h;
                        }
                        if (i30 == 0) {
                        }
                        if (i32 != 0) {
                            j17 = C10023k.f50982c;
                        } else {
                            j17 = j13;
                        }
                        if (i35 != 0) {
                            i42 = 1;
                        } else {
                            i42 = i10;
                        }
                        if (i38 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if (i40 != 0) {
                            i43 = Integer.MAX_VALUE;
                        } else {
                            i43 = i11;
                        }
                        if (i41 != 0) {
                            interfaceC2052l2 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.material3.TextKt$Text$1
                                @Override // cm.InterfaceC2052l
                                /* JADX INFO: renamed from: n */
                                public final C9072e mo528n(C7216j c7216j) {
                                    C5207g.m11111f(c7216j, "it");
                                    return C9072e.f47360a;
                                }
                            };
                        } else {
                            interfaceC2052l2 = interfaceC2052l;
                        }
                        if ((i14 & 32768) != 0) {
                            c7218l2 = (C7218l) composerImplMo1636j.mo1648p(f2808a);
                            i37 &= -458753;
                        } else {
                            c7218l2 = c7218l;
                        }
                    }
                    composerImplMo1636j.m1610R();
                    InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q11 = ComposerKt.f3003a;
                    composerImplMo1636j.mo1622c(79582607);
                    j18 = C9169u.f47703f;
                    if (j14 != j18) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (z12) {
                        jM14529b = j14;
                    } else {
                        jM14529b = c7218l2.f40600a.m14529b();
                        if (jM14529b != j18) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (z13) {
                            jM14529b = ((C9169u) composerImplMo1636j.mo1648p(ContentColorKt.f2738a)).f47705a;
                        }
                    }
                    composerImplMo1636j.m1609Q(false);
                    C7218l c7218l14 = c7218l2;
                    int i4118 = (i15 & 112) | (i15 & 14) | ((i37 >> 3) & 7168);
                    int i4119 = i37 << 9;
                    BasicTextKt.m1532c(str, interfaceC0500b2, c7218l14.m14544b(new C7218l(jM14529b, j15, c8476m2, c8471h2, abstractC0696b2, j16, c9798h2, c9797g2, j17, 175952)), interfaceC2052l2, i42, z11, i43, composerImplMo1636j, i4118 | (i4119 & 57344) | (i4119 & 458752) | (i4119 & 3670016), 0);
                    interfaceC0500b3 = interfaceC0500b2;
                    z14 = z11;
                    c9797g3 = c9797g2;
                    c8471h3 = c8471h2;
                    interfaceC2052l3 = interfaceC2052l2;
                    c7218l3 = c7218l14;
                    abstractC0696b3 = abstractC0696b2;
                    j19 = j15;
                    c9798h3 = c9798h2;
                    j20 = j17;
                    i44 = i43;
                    j21 = j14;
                    j22 = j16;
                    C8476m c8476m14 = c8476m2;
                    i45 = i42;
                    c8476m3 = c8476m14;
                } else {
                    composerImplMo1636j.m1654s0();
                    if ((i12 & 1) != 0) {
                        if (i47 != 0) {
                            interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                        } else {
                            interfaceC0500b2 = interfaceC0500b;
                        }
                        if (i16 != 0) {
                            j14 = C9169u.f47703f;
                        } else {
                            j14 = j10;
                        }
                        if (i18 != 0) {
                            j15 = C10023k.f50982c;
                        } else {
                            j15 = j11;
                        }
                        if (i20 != 0) {
                            c8471h2 = null;
                        } else {
                            c8471h2 = c8471h;
                        }
                        if (i22 != 0) {
                            c8476m2 = null;
                        } else {
                            c8476m2 = c8476m;
                        }
                        if (i24 != 0) {
                            abstractC0696b2 = null;
                        } else {
                            abstractC0696b2 = abstractC0696b;
                        }
                        if (i26 != 0) {
                            j16 = C10023k.f50982c;
                        } else {
                            j16 = j12;
                        }
                        if (i28 != 0) {
                            c9798h2 = null;
                        } else {
                            c9798h2 = c9798h;
                        }
                        if (i30 == 0) {
                        }
                        if (i32 != 0) {
                            j17 = C10023k.f50982c;
                        } else {
                            j17 = j13;
                        }
                        if (i35 != 0) {
                            i42 = 1;
                        } else {
                            i42 = i10;
                        }
                        if (i38 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if (i40 != 0) {
                            i43 = Integer.MAX_VALUE;
                        } else {
                            i43 = i11;
                        }
                        if (i41 != 0) {
                            interfaceC2052l2 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.material3.TextKt$Text$1
                                @Override // cm.InterfaceC2052l
                                /* JADX INFO: renamed from: n */
                                public final C9072e mo528n(C7216j c7216j) {
                                    C5207g.m11111f(c7216j, "it");
                                    return C9072e.f47360a;
                                }
                            };
                        } else {
                            interfaceC2052l2 = interfaceC2052l;
                        }
                        if ((i14 & 32768) != 0) {
                            c7218l2 = (C7218l) composerImplMo1636j.mo1648p(f2808a);
                            i37 &= -458753;
                        } else {
                            c7218l2 = c7218l;
                        }
                    } else {
                        if (i47 != 0) {
                            interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                        } else {
                            interfaceC0500b2 = interfaceC0500b;
                        }
                        if (i16 != 0) {
                            j14 = C9169u.f47703f;
                        } else {
                            j14 = j10;
                        }
                        if (i18 != 0) {
                            j15 = C10023k.f50982c;
                        } else {
                            j15 = j11;
                        }
                        if (i20 != 0) {
                            c8471h2 = null;
                        } else {
                            c8471h2 = c8471h;
                        }
                        if (i22 != 0) {
                            c8476m2 = null;
                        } else {
                            c8476m2 = c8476m;
                        }
                        if (i24 != 0) {
                            abstractC0696b2 = null;
                        } else {
                            abstractC0696b2 = abstractC0696b;
                        }
                        if (i26 != 0) {
                            j16 = C10023k.f50982c;
                        } else {
                            j16 = j12;
                        }
                        if (i28 != 0) {
                            c9798h2 = null;
                        } else {
                            c9798h2 = c9798h;
                        }
                        if (i30 == 0) {
                        }
                        if (i32 != 0) {
                            j17 = C10023k.f50982c;
                        } else {
                            j17 = j13;
                        }
                        if (i35 != 0) {
                            i42 = 1;
                        } else {
                            i42 = i10;
                        }
                        if (i38 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if (i40 != 0) {
                            i43 = Integer.MAX_VALUE;
                        } else {
                            i43 = i11;
                        }
                        if (i41 != 0) {
                            interfaceC2052l2 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.material3.TextKt$Text$1
                                @Override // cm.InterfaceC2052l
                                /* JADX INFO: renamed from: n */
                                public final C9072e mo528n(C7216j c7216j) {
                                    C5207g.m11111f(c7216j, "it");
                                    return C9072e.f47360a;
                                }
                            };
                        } else {
                            interfaceC2052l2 = interfaceC2052l;
                        }
                        if ((i14 & 32768) != 0) {
                            c7218l2 = (C7218l) composerImplMo1636j.mo1648p(f2808a);
                            i37 &= -458753;
                        } else {
                            c7218l2 = c7218l;
                        }
                    }
                    composerImplMo1636j.m1610R();
                    InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q12 = ComposerKt.f3003a;
                    composerImplMo1636j.mo1622c(79582607);
                    j18 = C9169u.f47703f;
                    if (j14 != j18) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (z12) {
                        jM14529b = j14;
                    } else {
                        jM14529b = c7218l2.f40600a.m14529b();
                        if (jM14529b != j18) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (z13) {
                            jM14529b = ((C9169u) composerImplMo1636j.mo1648p(ContentColorKt.f2738a)).f47705a;
                        }
                    }
                    composerImplMo1636j.m1609Q(false);
                    C7218l c7218l15 = c7218l2;
                    int i41110 = (i15 & 112) | (i15 & 14) | ((i37 >> 3) & 7168);
                    int i41111 = i37 << 9;
                    BasicTextKt.m1532c(str, interfaceC0500b2, c7218l15.m14544b(new C7218l(jM14529b, j15, c8476m2, c8471h2, abstractC0696b2, j16, c9798h2, c9797g2, j17, 175952)), interfaceC2052l2, i42, z11, i43, composerImplMo1636j, i41110 | (i41111 & 57344) | (i41111 & 458752) | (i41111 & 3670016), 0);
                    interfaceC0500b3 = interfaceC0500b2;
                    z14 = z11;
                    c9797g3 = c9797g2;
                    c8471h3 = c8471h2;
                    interfaceC2052l3 = interfaceC2052l2;
                    c7218l3 = c7218l15;
                    abstractC0696b3 = abstractC0696b2;
                    j19 = j15;
                    c9798h3 = c9798h2;
                    j20 = j17;
                    i44 = i43;
                    j21 = j14;
                    j22 = j16;
                    C8476m c8476m15 = c8476m2;
                    i45 = i42;
                    c8476m3 = c8476m15;
                }
                c5332q0M1612T = composerImplMo1636j.m1612T();
                if (c5332q0M1612T == null) {
                    return;
                }
                c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.material3.TextKt$Text$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // cm.InterfaceC2056p
                    /* JADX INFO: renamed from: m0 */
                    public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                        num.intValue();
                        TextKt.m1576c(str, interfaceC0500b3, j21, j19, c8471h3, c8476m3, abstractC0696b3, j22, c9798h3, c9797g3, j20, i45, z14, i44, interfaceC2052l3, c7218l3, interfaceC0476a2, i12 | 1, i13, i14);
                        return C9072e.f47360a;
                    }
                };
            }
            i37 |= 3072;
            i41 = i14 & 16384;
            if (i41 != 0) {
                if ((i13 & 57344) == 0) {
                    i37 |= composerImplMo1636j.mo1665y(interfaceC2052l) ? 16384 : 8192;
                }
                if ((i13 & 458752) != 0) {
                    if ((i14 & 32768) == 0) {
                        i46 = 65536;
                    } else {
                        i46 = 65536;
                    }
                    i37 |= i46;
                }
                if ((i15 & 1533916891) != 306783378) {
                    composerImplMo1636j.m1654s0();
                    if ((i12 & 1) != 0) {
                        if (i47 != 0) {
                            interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                        } else {
                            interfaceC0500b2 = interfaceC0500b;
                        }
                        if (i16 != 0) {
                            j14 = C9169u.f47703f;
                        } else {
                            j14 = j10;
                        }
                        if (i18 != 0) {
                            j15 = C10023k.f50982c;
                        } else {
                            j15 = j11;
                        }
                        if (i20 != 0) {
                            c8471h2 = null;
                        } else {
                            c8471h2 = c8471h;
                        }
                        if (i22 != 0) {
                            c8476m2 = null;
                        } else {
                            c8476m2 = c8476m;
                        }
                        if (i24 != 0) {
                            abstractC0696b2 = null;
                        } else {
                            abstractC0696b2 = abstractC0696b;
                        }
                        if (i26 != 0) {
                            j16 = C10023k.f50982c;
                        } else {
                            j16 = j12;
                        }
                        if (i28 != 0) {
                            c9798h2 = null;
                        } else {
                            c9798h2 = c9798h;
                        }
                        if (i30 == 0) {
                        }
                        if (i32 != 0) {
                            j17 = C10023k.f50982c;
                        } else {
                            j17 = j13;
                        }
                        if (i35 != 0) {
                            i42 = 1;
                        } else {
                            i42 = i10;
                        }
                        if (i38 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if (i40 != 0) {
                            i43 = Integer.MAX_VALUE;
                        } else {
                            i43 = i11;
                        }
                        if (i41 != 0) {
                            interfaceC2052l2 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.material3.TextKt$Text$1
                                @Override // cm.InterfaceC2052l
                                /* JADX INFO: renamed from: n */
                                public final C9072e mo528n(C7216j c7216j) {
                                    C5207g.m11111f(c7216j, "it");
                                    return C9072e.f47360a;
                                }
                            };
                        } else {
                            interfaceC2052l2 = interfaceC2052l;
                        }
                        if ((i14 & 32768) != 0) {
                            c7218l2 = (C7218l) composerImplMo1636j.mo1648p(f2808a);
                            i37 &= -458753;
                        } else {
                            c7218l2 = c7218l;
                        }
                    } else {
                        if (i47 != 0) {
                            interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                        } else {
                            interfaceC0500b2 = interfaceC0500b;
                        }
                        if (i16 != 0) {
                            j14 = C9169u.f47703f;
                        } else {
                            j14 = j10;
                        }
                        if (i18 != 0) {
                            j15 = C10023k.f50982c;
                        } else {
                            j15 = j11;
                        }
                        if (i20 != 0) {
                            c8471h2 = null;
                        } else {
                            c8471h2 = c8471h;
                        }
                        if (i22 != 0) {
                            c8476m2 = null;
                        } else {
                            c8476m2 = c8476m;
                        }
                        if (i24 != 0) {
                            abstractC0696b2 = null;
                        } else {
                            abstractC0696b2 = abstractC0696b;
                        }
                        if (i26 != 0) {
                            j16 = C10023k.f50982c;
                        } else {
                            j16 = j12;
                        }
                        if (i28 != 0) {
                            c9798h2 = null;
                        } else {
                            c9798h2 = c9798h;
                        }
                        if (i30 == 0) {
                        }
                        if (i32 != 0) {
                            j17 = C10023k.f50982c;
                        } else {
                            j17 = j13;
                        }
                        if (i35 != 0) {
                            i42 = 1;
                        } else {
                            i42 = i10;
                        }
                        if (i38 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if (i40 != 0) {
                            i43 = Integer.MAX_VALUE;
                        } else {
                            i43 = i11;
                        }
                        if (i41 != 0) {
                            interfaceC2052l2 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.material3.TextKt$Text$1
                                @Override // cm.InterfaceC2052l
                                /* JADX INFO: renamed from: n */
                                public final C9072e mo528n(C7216j c7216j) {
                                    C5207g.m11111f(c7216j, "it");
                                    return C9072e.f47360a;
                                }
                            };
                        } else {
                            interfaceC2052l2 = interfaceC2052l;
                        }
                        if ((i14 & 32768) != 0) {
                            c7218l2 = (C7218l) composerImplMo1636j.mo1648p(f2808a);
                            i37 &= -458753;
                        } else {
                            c7218l2 = c7218l;
                        }
                    }
                    composerImplMo1636j.m1610R();
                    InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q13 = ComposerKt.f3003a;
                    composerImplMo1636j.mo1622c(79582607);
                    j18 = C9169u.f47703f;
                    if (j14 != j18) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (z12) {
                        jM14529b = j14;
                    } else {
                        jM14529b = c7218l2.f40600a.m14529b();
                        if (jM14529b != j18) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (z13) {
                            jM14529b = ((C9169u) composerImplMo1636j.mo1648p(ContentColorKt.f2738a)).f47705a;
                        }
                    }
                    composerImplMo1636j.m1609Q(false);
                    C7218l c7218l16 = c7218l2;
                    int i41112 = (i15 & 112) | (i15 & 14) | ((i37 >> 3) & 7168);
                    int i41113 = i37 << 9;
                    BasicTextKt.m1532c(str, interfaceC0500b2, c7218l16.m14544b(new C7218l(jM14529b, j15, c8476m2, c8471h2, abstractC0696b2, j16, c9798h2, c9797g2, j17, 175952)), interfaceC2052l2, i42, z11, i43, composerImplMo1636j, i41112 | (i41113 & 57344) | (i41113 & 458752) | (i41113 & 3670016), 0);
                    interfaceC0500b3 = interfaceC0500b2;
                    z14 = z11;
                    c9797g3 = c9797g2;
                    c8471h3 = c8471h2;
                    interfaceC2052l3 = interfaceC2052l2;
                    c7218l3 = c7218l16;
                    abstractC0696b3 = abstractC0696b2;
                    j19 = j15;
                    c9798h3 = c9798h2;
                    j20 = j17;
                    i44 = i43;
                    j21 = j14;
                    j22 = j16;
                    C8476m c8476m16 = c8476m2;
                    i45 = i42;
                    c8476m3 = c8476m16;
                } else {
                    composerImplMo1636j.m1654s0();
                    if ((i12 & 1) != 0) {
                        if (i47 != 0) {
                            interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                        } else {
                            interfaceC0500b2 = interfaceC0500b;
                        }
                        if (i16 != 0) {
                            j14 = C9169u.f47703f;
                        } else {
                            j14 = j10;
                        }
                        if (i18 != 0) {
                            j15 = C10023k.f50982c;
                        } else {
                            j15 = j11;
                        }
                        if (i20 != 0) {
                            c8471h2 = null;
                        } else {
                            c8471h2 = c8471h;
                        }
                        if (i22 != 0) {
                            c8476m2 = null;
                        } else {
                            c8476m2 = c8476m;
                        }
                        if (i24 != 0) {
                            abstractC0696b2 = null;
                        } else {
                            abstractC0696b2 = abstractC0696b;
                        }
                        if (i26 != 0) {
                            j16 = C10023k.f50982c;
                        } else {
                            j16 = j12;
                        }
                        if (i28 != 0) {
                            c9798h2 = null;
                        } else {
                            c9798h2 = c9798h;
                        }
                        if (i30 == 0) {
                        }
                        if (i32 != 0) {
                            j17 = C10023k.f50982c;
                        } else {
                            j17 = j13;
                        }
                        if (i35 != 0) {
                            i42 = 1;
                        } else {
                            i42 = i10;
                        }
                        if (i38 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if (i40 != 0) {
                            i43 = Integer.MAX_VALUE;
                        } else {
                            i43 = i11;
                        }
                        if (i41 != 0) {
                            interfaceC2052l2 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.material3.TextKt$Text$1
                                @Override // cm.InterfaceC2052l
                                /* JADX INFO: renamed from: n */
                                public final C9072e mo528n(C7216j c7216j) {
                                    C5207g.m11111f(c7216j, "it");
                                    return C9072e.f47360a;
                                }
                            };
                        } else {
                            interfaceC2052l2 = interfaceC2052l;
                        }
                        if ((i14 & 32768) != 0) {
                            c7218l2 = (C7218l) composerImplMo1636j.mo1648p(f2808a);
                            i37 &= -458753;
                        } else {
                            c7218l2 = c7218l;
                        }
                    } else {
                        if (i47 != 0) {
                            interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                        } else {
                            interfaceC0500b2 = interfaceC0500b;
                        }
                        if (i16 != 0) {
                            j14 = C9169u.f47703f;
                        } else {
                            j14 = j10;
                        }
                        if (i18 != 0) {
                            j15 = C10023k.f50982c;
                        } else {
                            j15 = j11;
                        }
                        if (i20 != 0) {
                            c8471h2 = null;
                        } else {
                            c8471h2 = c8471h;
                        }
                        if (i22 != 0) {
                            c8476m2 = null;
                        } else {
                            c8476m2 = c8476m;
                        }
                        if (i24 != 0) {
                            abstractC0696b2 = null;
                        } else {
                            abstractC0696b2 = abstractC0696b;
                        }
                        if (i26 != 0) {
                            j16 = C10023k.f50982c;
                        } else {
                            j16 = j12;
                        }
                        if (i28 != 0) {
                            c9798h2 = null;
                        } else {
                            c9798h2 = c9798h;
                        }
                        if (i30 == 0) {
                        }
                        if (i32 != 0) {
                            j17 = C10023k.f50982c;
                        } else {
                            j17 = j13;
                        }
                        if (i35 != 0) {
                            i42 = 1;
                        } else {
                            i42 = i10;
                        }
                        if (i38 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if (i40 != 0) {
                            i43 = Integer.MAX_VALUE;
                        } else {
                            i43 = i11;
                        }
                        if (i41 != 0) {
                            interfaceC2052l2 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.material3.TextKt$Text$1
                                @Override // cm.InterfaceC2052l
                                /* JADX INFO: renamed from: n */
                                public final C9072e mo528n(C7216j c7216j) {
                                    C5207g.m11111f(c7216j, "it");
                                    return C9072e.f47360a;
                                }
                            };
                        } else {
                            interfaceC2052l2 = interfaceC2052l;
                        }
                        if ((i14 & 32768) != 0) {
                            c7218l2 = (C7218l) composerImplMo1636j.mo1648p(f2808a);
                            i37 &= -458753;
                        } else {
                            c7218l2 = c7218l;
                        }
                    }
                    composerImplMo1636j.m1610R();
                    InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q14 = ComposerKt.f3003a;
                    composerImplMo1636j.mo1622c(79582607);
                    j18 = C9169u.f47703f;
                    if (j14 != j18) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (z12) {
                        jM14529b = j14;
                    } else {
                        jM14529b = c7218l2.f40600a.m14529b();
                        if (jM14529b != j18) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (z13) {
                            jM14529b = ((C9169u) composerImplMo1636j.mo1648p(ContentColorKt.f2738a)).f47705a;
                        }
                    }
                    composerImplMo1636j.m1609Q(false);
                    C7218l c7218l17 = c7218l2;
                    int i41114 = (i15 & 112) | (i15 & 14) | ((i37 >> 3) & 7168);
                    int i41115 = i37 << 9;
                    BasicTextKt.m1532c(str, interfaceC0500b2, c7218l17.m14544b(new C7218l(jM14529b, j15, c8476m2, c8471h2, abstractC0696b2, j16, c9798h2, c9797g2, j17, 175952)), interfaceC2052l2, i42, z11, i43, composerImplMo1636j, i41114 | (i41115 & 57344) | (i41115 & 458752) | (i41115 & 3670016), 0);
                    interfaceC0500b3 = interfaceC0500b2;
                    z14 = z11;
                    c9797g3 = c9797g2;
                    c8471h3 = c8471h2;
                    interfaceC2052l3 = interfaceC2052l2;
                    c7218l3 = c7218l17;
                    abstractC0696b3 = abstractC0696b2;
                    j19 = j15;
                    c9798h3 = c9798h2;
                    j20 = j17;
                    i44 = i43;
                    j21 = j14;
                    j22 = j16;
                    C8476m c8476m17 = c8476m2;
                    i45 = i42;
                    c8476m3 = c8476m17;
                }
                c5332q0M1612T = composerImplMo1636j.m1612T();
                if (c5332q0M1612T == null) {
                    return;
                }
                c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.material3.TextKt$Text$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // cm.InterfaceC2056p
                    /* JADX INFO: renamed from: m0 */
                    public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                        num.intValue();
                        TextKt.m1576c(str, interfaceC0500b3, j21, j19, c8471h3, c8476m3, abstractC0696b3, j22, c9798h3, c9797g3, j20, i45, z14, i44, interfaceC2052l3, c7218l3, interfaceC0476a2, i12 | 1, i13, i14);
                        return C9072e.f47360a;
                    }
                };
            }
            i37 |= 24576;
            if ((i13 & 458752) != 0) {
                if ((i14 & 32768) == 0) {
                    i46 = 65536;
                } else {
                    i46 = 65536;
                }
                i37 |= i46;
            }
            if ((i15 & 1533916891) != 306783378) {
                composerImplMo1636j.m1654s0();
                if ((i12 & 1) != 0) {
                    if (i47 != 0) {
                        interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                    } else {
                        interfaceC0500b2 = interfaceC0500b;
                    }
                    if (i16 != 0) {
                        j14 = C9169u.f47703f;
                    } else {
                        j14 = j10;
                    }
                    if (i18 != 0) {
                        j15 = C10023k.f50982c;
                    } else {
                        j15 = j11;
                    }
                    if (i20 != 0) {
                        c8471h2 = null;
                    } else {
                        c8471h2 = c8471h;
                    }
                    if (i22 != 0) {
                        c8476m2 = null;
                    } else {
                        c8476m2 = c8476m;
                    }
                    if (i24 != 0) {
                        abstractC0696b2 = null;
                    } else {
                        abstractC0696b2 = abstractC0696b;
                    }
                    if (i26 != 0) {
                        j16 = C10023k.f50982c;
                    } else {
                        j16 = j12;
                    }
                    if (i28 != 0) {
                        c9798h2 = null;
                    } else {
                        c9798h2 = c9798h;
                    }
                    if (i30 == 0) {
                    }
                    if (i32 != 0) {
                        j17 = C10023k.f50982c;
                    } else {
                        j17 = j13;
                    }
                    if (i35 != 0) {
                        i42 = 1;
                    } else {
                        i42 = i10;
                    }
                    if (i38 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    if (i40 != 0) {
                        i43 = Integer.MAX_VALUE;
                    } else {
                        i43 = i11;
                    }
                    if (i41 != 0) {
                        interfaceC2052l2 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.material3.TextKt$Text$1
                            @Override // cm.InterfaceC2052l
                            /* JADX INFO: renamed from: n */
                            public final C9072e mo528n(C7216j c7216j) {
                                C5207g.m11111f(c7216j, "it");
                                return C9072e.f47360a;
                            }
                        };
                    } else {
                        interfaceC2052l2 = interfaceC2052l;
                    }
                    if ((i14 & 32768) != 0) {
                        c7218l2 = (C7218l) composerImplMo1636j.mo1648p(f2808a);
                        i37 &= -458753;
                    } else {
                        c7218l2 = c7218l;
                    }
                } else {
                    if (i47 != 0) {
                        interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                    } else {
                        interfaceC0500b2 = interfaceC0500b;
                    }
                    if (i16 != 0) {
                        j14 = C9169u.f47703f;
                    } else {
                        j14 = j10;
                    }
                    if (i18 != 0) {
                        j15 = C10023k.f50982c;
                    } else {
                        j15 = j11;
                    }
                    if (i20 != 0) {
                        c8471h2 = null;
                    } else {
                        c8471h2 = c8471h;
                    }
                    if (i22 != 0) {
                        c8476m2 = null;
                    } else {
                        c8476m2 = c8476m;
                    }
                    if (i24 != 0) {
                        abstractC0696b2 = null;
                    } else {
                        abstractC0696b2 = abstractC0696b;
                    }
                    if (i26 != 0) {
                        j16 = C10023k.f50982c;
                    } else {
                        j16 = j12;
                    }
                    if (i28 != 0) {
                        c9798h2 = null;
                    } else {
                        c9798h2 = c9798h;
                    }
                    if (i30 == 0) {
                    }
                    if (i32 != 0) {
                        j17 = C10023k.f50982c;
                    } else {
                        j17 = j13;
                    }
                    if (i35 != 0) {
                        i42 = 1;
                    } else {
                        i42 = i10;
                    }
                    if (i38 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    if (i40 != 0) {
                        i43 = Integer.MAX_VALUE;
                    } else {
                        i43 = i11;
                    }
                    if (i41 != 0) {
                        interfaceC2052l2 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.material3.TextKt$Text$1
                            @Override // cm.InterfaceC2052l
                            /* JADX INFO: renamed from: n */
                            public final C9072e mo528n(C7216j c7216j) {
                                C5207g.m11111f(c7216j, "it");
                                return C9072e.f47360a;
                            }
                        };
                    } else {
                        interfaceC2052l2 = interfaceC2052l;
                    }
                    if ((i14 & 32768) != 0) {
                        c7218l2 = (C7218l) composerImplMo1636j.mo1648p(f2808a);
                        i37 &= -458753;
                    } else {
                        c7218l2 = c7218l;
                    }
                }
                composerImplMo1636j.m1610R();
                InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q15 = ComposerKt.f3003a;
                composerImplMo1636j.mo1622c(79582607);
                j18 = C9169u.f47703f;
                if (j14 != j18) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (z12) {
                    jM14529b = j14;
                } else {
                    jM14529b = c7218l2.f40600a.m14529b();
                    if (jM14529b != j18) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (z13) {
                        jM14529b = ((C9169u) composerImplMo1636j.mo1648p(ContentColorKt.f2738a)).f47705a;
                    }
                }
                composerImplMo1636j.m1609Q(false);
                C7218l c7218l18 = c7218l2;
                int i41116 = (i15 & 112) | (i15 & 14) | ((i37 >> 3) & 7168);
                int i41117 = i37 << 9;
                BasicTextKt.m1532c(str, interfaceC0500b2, c7218l18.m14544b(new C7218l(jM14529b, j15, c8476m2, c8471h2, abstractC0696b2, j16, c9798h2, c9797g2, j17, 175952)), interfaceC2052l2, i42, z11, i43, composerImplMo1636j, i41116 | (i41117 & 57344) | (i41117 & 458752) | (i41117 & 3670016), 0);
                interfaceC0500b3 = interfaceC0500b2;
                z14 = z11;
                c9797g3 = c9797g2;
                c8471h3 = c8471h2;
                interfaceC2052l3 = interfaceC2052l2;
                c7218l3 = c7218l18;
                abstractC0696b3 = abstractC0696b2;
                j19 = j15;
                c9798h3 = c9798h2;
                j20 = j17;
                i44 = i43;
                j21 = j14;
                j22 = j16;
                C8476m c8476m18 = c8476m2;
                i45 = i42;
                c8476m3 = c8476m18;
            } else {
                composerImplMo1636j.m1654s0();
                if ((i12 & 1) != 0) {
                    if (i47 != 0) {
                        interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                    } else {
                        interfaceC0500b2 = interfaceC0500b;
                    }
                    if (i16 != 0) {
                        j14 = C9169u.f47703f;
                    } else {
                        j14 = j10;
                    }
                    if (i18 != 0) {
                        j15 = C10023k.f50982c;
                    } else {
                        j15 = j11;
                    }
                    if (i20 != 0) {
                        c8471h2 = null;
                    } else {
                        c8471h2 = c8471h;
                    }
                    if (i22 != 0) {
                        c8476m2 = null;
                    } else {
                        c8476m2 = c8476m;
                    }
                    if (i24 != 0) {
                        abstractC0696b2 = null;
                    } else {
                        abstractC0696b2 = abstractC0696b;
                    }
                    if (i26 != 0) {
                        j16 = C10023k.f50982c;
                    } else {
                        j16 = j12;
                    }
                    if (i28 != 0) {
                        c9798h2 = null;
                    } else {
                        c9798h2 = c9798h;
                    }
                    if (i30 == 0) {
                    }
                    if (i32 != 0) {
                        j17 = C10023k.f50982c;
                    } else {
                        j17 = j13;
                    }
                    if (i35 != 0) {
                        i42 = 1;
                    } else {
                        i42 = i10;
                    }
                    if (i38 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    if (i40 != 0) {
                        i43 = Integer.MAX_VALUE;
                    } else {
                        i43 = i11;
                    }
                    if (i41 != 0) {
                        interfaceC2052l2 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.material3.TextKt$Text$1
                            @Override // cm.InterfaceC2052l
                            /* JADX INFO: renamed from: n */
                            public final C9072e mo528n(C7216j c7216j) {
                                C5207g.m11111f(c7216j, "it");
                                return C9072e.f47360a;
                            }
                        };
                    } else {
                        interfaceC2052l2 = interfaceC2052l;
                    }
                    if ((i14 & 32768) != 0) {
                        c7218l2 = (C7218l) composerImplMo1636j.mo1648p(f2808a);
                        i37 &= -458753;
                    } else {
                        c7218l2 = c7218l;
                    }
                } else {
                    if (i47 != 0) {
                        interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                    } else {
                        interfaceC0500b2 = interfaceC0500b;
                    }
                    if (i16 != 0) {
                        j14 = C9169u.f47703f;
                    } else {
                        j14 = j10;
                    }
                    if (i18 != 0) {
                        j15 = C10023k.f50982c;
                    } else {
                        j15 = j11;
                    }
                    if (i20 != 0) {
                        c8471h2 = null;
                    } else {
                        c8471h2 = c8471h;
                    }
                    if (i22 != 0) {
                        c8476m2 = null;
                    } else {
                        c8476m2 = c8476m;
                    }
                    if (i24 != 0) {
                        abstractC0696b2 = null;
                    } else {
                        abstractC0696b2 = abstractC0696b;
                    }
                    if (i26 != 0) {
                        j16 = C10023k.f50982c;
                    } else {
                        j16 = j12;
                    }
                    if (i28 != 0) {
                        c9798h2 = null;
                    } else {
                        c9798h2 = c9798h;
                    }
                    if (i30 == 0) {
                    }
                    if (i32 != 0) {
                        j17 = C10023k.f50982c;
                    } else {
                        j17 = j13;
                    }
                    if (i35 != 0) {
                        i42 = 1;
                    } else {
                        i42 = i10;
                    }
                    if (i38 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    if (i40 != 0) {
                        i43 = Integer.MAX_VALUE;
                    } else {
                        i43 = i11;
                    }
                    if (i41 != 0) {
                        interfaceC2052l2 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.material3.TextKt$Text$1
                            @Override // cm.InterfaceC2052l
                            /* JADX INFO: renamed from: n */
                            public final C9072e mo528n(C7216j c7216j) {
                                C5207g.m11111f(c7216j, "it");
                                return C9072e.f47360a;
                            }
                        };
                    } else {
                        interfaceC2052l2 = interfaceC2052l;
                    }
                    if ((i14 & 32768) != 0) {
                        c7218l2 = (C7218l) composerImplMo1636j.mo1648p(f2808a);
                        i37 &= -458753;
                    } else {
                        c7218l2 = c7218l;
                    }
                }
                composerImplMo1636j.m1610R();
                InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q16 = ComposerKt.f3003a;
                composerImplMo1636j.mo1622c(79582607);
                j18 = C9169u.f47703f;
                if (j14 != j18) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (z12) {
                    jM14529b = j14;
                } else {
                    jM14529b = c7218l2.f40600a.m14529b();
                    if (jM14529b != j18) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (z13) {
                        jM14529b = ((C9169u) composerImplMo1636j.mo1648p(ContentColorKt.f2738a)).f47705a;
                    }
                }
                composerImplMo1636j.m1609Q(false);
                C7218l c7218l19 = c7218l2;
                int i41118 = (i15 & 112) | (i15 & 14) | ((i37 >> 3) & 7168);
                int i41119 = i37 << 9;
                BasicTextKt.m1532c(str, interfaceC0500b2, c7218l19.m14544b(new C7218l(jM14529b, j15, c8476m2, c8471h2, abstractC0696b2, j16, c9798h2, c9797g2, j17, 175952)), interfaceC2052l2, i42, z11, i43, composerImplMo1636j, i41118 | (i41119 & 57344) | (i41119 & 458752) | (i41119 & 3670016), 0);
                interfaceC0500b3 = interfaceC0500b2;
                z14 = z11;
                c9797g3 = c9797g2;
                c8471h3 = c8471h2;
                interfaceC2052l3 = interfaceC2052l2;
                c7218l3 = c7218l19;
                abstractC0696b3 = abstractC0696b2;
                j19 = j15;
                c9798h3 = c9798h2;
                j20 = j17;
                i44 = i43;
                j21 = j14;
                j22 = j16;
                C8476m c8476m19 = c8476m2;
                i45 = i42;
                c8476m3 = c8476m19;
            }
            c5332q0M1612T = composerImplMo1636j.m1612T();
            if (c5332q0M1612T == null) {
                return;
            }
            c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.material3.TextKt$Text$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // cm.InterfaceC2056p
                /* JADX INFO: renamed from: m0 */
                public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                    num.intValue();
                    TextKt.m1576c(str, interfaceC0500b3, j21, j19, c8471h3, c8476m3, abstractC0696b3, j22, c9798h3, c9797g3, j20, i45, z14, i44, interfaceC2052l3, c7218l3, interfaceC0476a2, i12 | 1, i13, i14);
                    return C9072e.f47360a;
                }
            };
        }
        i15 |= 48;
        i16 = i14 & 4;
        if (i16 != 0) {
            i15 |= 384;
        } else if ((i12 & 896) == 0) {
            if (composerImplMo1636j.m1596F(j10)) {
                i17 = 256;
            } else {
                i17 = BuildConfig.SDK_TRUNCATE_LENGTH;
            }
            i15 |= i17;
        }
        i18 = i14 & 8;
        if (i18 != 0) {
            i15 |= 3072;
        } else if ((i12 & 7168) == 0) {
            if (composerImplMo1636j.m1596F(j11)) {
                i19 = 2048;
            } else {
                i19 = 1024;
            }
            i15 |= i19;
        }
        i20 = i14 & 16;
        if (i20 != 0) {
            i15 |= 24576;
        } else if ((i12 & 57344) == 0) {
            if (composerImplMo1636j.mo1665y(c8471h)) {
                i21 = 16384;
            } else {
                i21 = 8192;
            }
            i15 |= i21;
        }
        i22 = i14 & 32;
        if (i22 != 0) {
            i15 |= 196608;
        } else if ((i12 & 458752) == 0) {
            if (composerImplMo1636j.mo1665y(c8476m)) {
                i23 = 131072;
            } else {
                i23 = 65536;
            }
            i15 |= i23;
        }
        i24 = i14 & 64;
        if (i24 != 0) {
            i15 |= 1572864;
        } else if ((i12 & 3670016) == 0) {
            if (composerImplMo1636j.mo1665y(abstractC0696b)) {
                i25 = 1048576;
            } else {
                i25 = 524288;
            }
            i15 |= i25;
        }
        i26 = i14 & BuildConfig.SDK_TRUNCATE_LENGTH;
        if (i26 != 0) {
            i15 |= 12582912;
        } else if ((i12 & 29360128) == 0) {
            if (composerImplMo1636j.m1596F(j12)) {
                i27 = 8388608;
            } else {
                i27 = 4194304;
            }
            i15 |= i27;
        }
        i28 = i14 & 256;
        if (i28 != 0) {
            i15 |= 100663296;
        } else if ((i12 & 234881024) == 0) {
            if (composerImplMo1636j.mo1665y(c9798h)) {
                i29 = 67108864;
            } else {
                i29 = 33554432;
            }
            i15 |= i29;
        }
        i30 = i14 & 512;
        if (i30 != 0) {
            i15 |= 805306368;
        } else if ((i12 & 1879048192) == 0) {
            if (composerImplMo1636j.mo1665y(c9797g)) {
                i31 = 536870912;
            } else {
                i31 = 268435456;
            }
            i15 |= i31;
        }
        i32 = i14 & 1024;
        if (i32 != 0) {
            i33 = i13 | 6;
        } else if ((i13 & 14) == 0) {
            if (composerImplMo1636j.m1596F(j13)) {
                i34 = 4;
            } else {
                i34 = 2;
            }
            i33 = i13 | i34;
        } else {
            i33 = i13;
        }
        i35 = i14 & 2048;
        if (i35 != 0) {
            i33 |= 48;
        } else if ((i13 & 112) == 0) {
            if (composerImplMo1636j.m1594E(i10)) {
                i36 = 32;
            } else {
                i36 = 16;
            }
            i33 |= i36;
        }
        i37 = i33;
        i38 = i14 & 4096;
        if (i38 != 0) {
            if ((i13 & 896) == 0) {
                if (composerImplMo1636j.m1598G(z10)) {
                    i39 = 256;
                } else {
                    i39 = BuildConfig.SDK_TRUNCATE_LENGTH;
                }
                i37 |= i39;
            }
            i40 = i14 & 8192;
            if (i40 != 0) {
                if ((i13 & 7168) == 0) {
                    i37 |= composerImplMo1636j.m1594E(i11) ? 2048 : 1024;
                }
                i41 = i14 & 16384;
                if (i41 != 0) {
                    if ((i13 & 57344) == 0) {
                        i37 |= composerImplMo1636j.mo1665y(interfaceC2052l) ? 16384 : 8192;
                    }
                    if ((i13 & 458752) != 0) {
                        if ((i14 & 32768) == 0) {
                            i46 = 65536;
                        } else {
                            i46 = 65536;
                        }
                        i37 |= i46;
                    }
                    if ((i15 & 1533916891) != 306783378) {
                        composerImplMo1636j.m1654s0();
                        if ((i12 & 1) != 0) {
                            if (i47 != 0) {
                                interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                            } else {
                                interfaceC0500b2 = interfaceC0500b;
                            }
                            if (i16 != 0) {
                                j14 = C9169u.f47703f;
                            } else {
                                j14 = j10;
                            }
                            if (i18 != 0) {
                                j15 = C10023k.f50982c;
                            } else {
                                j15 = j11;
                            }
                            if (i20 != 0) {
                                c8471h2 = null;
                            } else {
                                c8471h2 = c8471h;
                            }
                            if (i22 != 0) {
                                c8476m2 = null;
                            } else {
                                c8476m2 = c8476m;
                            }
                            if (i24 != 0) {
                                abstractC0696b2 = null;
                            } else {
                                abstractC0696b2 = abstractC0696b;
                            }
                            if (i26 != 0) {
                                j16 = C10023k.f50982c;
                            } else {
                                j16 = j12;
                            }
                            if (i28 != 0) {
                                c9798h2 = null;
                            } else {
                                c9798h2 = c9798h;
                            }
                            if (i30 == 0) {
                            }
                            if (i32 != 0) {
                                j17 = C10023k.f50982c;
                            } else {
                                j17 = j13;
                            }
                            if (i35 != 0) {
                                i42 = 1;
                            } else {
                                i42 = i10;
                            }
                            if (i38 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            if (i40 != 0) {
                                i43 = Integer.MAX_VALUE;
                            } else {
                                i43 = i11;
                            }
                            if (i41 != 0) {
                                interfaceC2052l2 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.material3.TextKt$Text$1
                                    @Override // cm.InterfaceC2052l
                                    /* JADX INFO: renamed from: n */
                                    public final C9072e mo528n(C7216j c7216j) {
                                        C5207g.m11111f(c7216j, "it");
                                        return C9072e.f47360a;
                                    }
                                };
                            } else {
                                interfaceC2052l2 = interfaceC2052l;
                            }
                            if ((i14 & 32768) != 0) {
                                c7218l2 = (C7218l) composerImplMo1636j.mo1648p(f2808a);
                                i37 &= -458753;
                            } else {
                                c7218l2 = c7218l;
                            }
                        } else {
                            if (i47 != 0) {
                                interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                            } else {
                                interfaceC0500b2 = interfaceC0500b;
                            }
                            if (i16 != 0) {
                                j14 = C9169u.f47703f;
                            } else {
                                j14 = j10;
                            }
                            if (i18 != 0) {
                                j15 = C10023k.f50982c;
                            } else {
                                j15 = j11;
                            }
                            if (i20 != 0) {
                                c8471h2 = null;
                            } else {
                                c8471h2 = c8471h;
                            }
                            if (i22 != 0) {
                                c8476m2 = null;
                            } else {
                                c8476m2 = c8476m;
                            }
                            if (i24 != 0) {
                                abstractC0696b2 = null;
                            } else {
                                abstractC0696b2 = abstractC0696b;
                            }
                            if (i26 != 0) {
                                j16 = C10023k.f50982c;
                            } else {
                                j16 = j12;
                            }
                            if (i28 != 0) {
                                c9798h2 = null;
                            } else {
                                c9798h2 = c9798h;
                            }
                            if (i30 == 0) {
                            }
                            if (i32 != 0) {
                                j17 = C10023k.f50982c;
                            } else {
                                j17 = j13;
                            }
                            if (i35 != 0) {
                                i42 = 1;
                            } else {
                                i42 = i10;
                            }
                            if (i38 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            if (i40 != 0) {
                                i43 = Integer.MAX_VALUE;
                            } else {
                                i43 = i11;
                            }
                            if (i41 != 0) {
                                interfaceC2052l2 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.material3.TextKt$Text$1
                                    @Override // cm.InterfaceC2052l
                                    /* JADX INFO: renamed from: n */
                                    public final C9072e mo528n(C7216j c7216j) {
                                        C5207g.m11111f(c7216j, "it");
                                        return C9072e.f47360a;
                                    }
                                };
                            } else {
                                interfaceC2052l2 = interfaceC2052l;
                            }
                            if ((i14 & 32768) != 0) {
                                c7218l2 = (C7218l) composerImplMo1636j.mo1648p(f2808a);
                                i37 &= -458753;
                            } else {
                                c7218l2 = c7218l;
                            }
                        }
                        composerImplMo1636j.m1610R();
                        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q17 = ComposerKt.f3003a;
                        composerImplMo1636j.mo1622c(79582607);
                        j18 = C9169u.f47703f;
                        if (j14 != j18) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (z12) {
                            jM14529b = j14;
                        } else {
                            jM14529b = c7218l2.f40600a.m14529b();
                            if (jM14529b != j18) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            if (z13) {
                                jM14529b = ((C9169u) composerImplMo1636j.mo1648p(ContentColorKt.f2738a)).f47705a;
                            }
                        }
                        composerImplMo1636j.m1609Q(false);
                        C7218l c7218l110 = c7218l2;
                        int i411110 = (i15 & 112) | (i15 & 14) | ((i37 >> 3) & 7168);
                        int i411111 = i37 << 9;
                        BasicTextKt.m1532c(str, interfaceC0500b2, c7218l110.m14544b(new C7218l(jM14529b, j15, c8476m2, c8471h2, abstractC0696b2, j16, c9798h2, c9797g2, j17, 175952)), interfaceC2052l2, i42, z11, i43, composerImplMo1636j, i411110 | (i411111 & 57344) | (i411111 & 458752) | (i411111 & 3670016), 0);
                        interfaceC0500b3 = interfaceC0500b2;
                        z14 = z11;
                        c9797g3 = c9797g2;
                        c8471h3 = c8471h2;
                        interfaceC2052l3 = interfaceC2052l2;
                        c7218l3 = c7218l110;
                        abstractC0696b3 = abstractC0696b2;
                        j19 = j15;
                        c9798h3 = c9798h2;
                        j20 = j17;
                        i44 = i43;
                        j21 = j14;
                        j22 = j16;
                        C8476m c8476m110 = c8476m2;
                        i45 = i42;
                        c8476m3 = c8476m110;
                    } else {
                        composerImplMo1636j.m1654s0();
                        if ((i12 & 1) != 0) {
                            if (i47 != 0) {
                                interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                            } else {
                                interfaceC0500b2 = interfaceC0500b;
                            }
                            if (i16 != 0) {
                                j14 = C9169u.f47703f;
                            } else {
                                j14 = j10;
                            }
                            if (i18 != 0) {
                                j15 = C10023k.f50982c;
                            } else {
                                j15 = j11;
                            }
                            if (i20 != 0) {
                                c8471h2 = null;
                            } else {
                                c8471h2 = c8471h;
                            }
                            if (i22 != 0) {
                                c8476m2 = null;
                            } else {
                                c8476m2 = c8476m;
                            }
                            if (i24 != 0) {
                                abstractC0696b2 = null;
                            } else {
                                abstractC0696b2 = abstractC0696b;
                            }
                            if (i26 != 0) {
                                j16 = C10023k.f50982c;
                            } else {
                                j16 = j12;
                            }
                            if (i28 != 0) {
                                c9798h2 = null;
                            } else {
                                c9798h2 = c9798h;
                            }
                            if (i30 == 0) {
                            }
                            if (i32 != 0) {
                                j17 = C10023k.f50982c;
                            } else {
                                j17 = j13;
                            }
                            if (i35 != 0) {
                                i42 = 1;
                            } else {
                                i42 = i10;
                            }
                            if (i38 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            if (i40 != 0) {
                                i43 = Integer.MAX_VALUE;
                            } else {
                                i43 = i11;
                            }
                            if (i41 != 0) {
                                interfaceC2052l2 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.material3.TextKt$Text$1
                                    @Override // cm.InterfaceC2052l
                                    /* JADX INFO: renamed from: n */
                                    public final C9072e mo528n(C7216j c7216j) {
                                        C5207g.m11111f(c7216j, "it");
                                        return C9072e.f47360a;
                                    }
                                };
                            } else {
                                interfaceC2052l2 = interfaceC2052l;
                            }
                            if ((i14 & 32768) != 0) {
                                c7218l2 = (C7218l) composerImplMo1636j.mo1648p(f2808a);
                                i37 &= -458753;
                            } else {
                                c7218l2 = c7218l;
                            }
                        } else {
                            if (i47 != 0) {
                                interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                            } else {
                                interfaceC0500b2 = interfaceC0500b;
                            }
                            if (i16 != 0) {
                                j14 = C9169u.f47703f;
                            } else {
                                j14 = j10;
                            }
                            if (i18 != 0) {
                                j15 = C10023k.f50982c;
                            } else {
                                j15 = j11;
                            }
                            if (i20 != 0) {
                                c8471h2 = null;
                            } else {
                                c8471h2 = c8471h;
                            }
                            if (i22 != 0) {
                                c8476m2 = null;
                            } else {
                                c8476m2 = c8476m;
                            }
                            if (i24 != 0) {
                                abstractC0696b2 = null;
                            } else {
                                abstractC0696b2 = abstractC0696b;
                            }
                            if (i26 != 0) {
                                j16 = C10023k.f50982c;
                            } else {
                                j16 = j12;
                            }
                            if (i28 != 0) {
                                c9798h2 = null;
                            } else {
                                c9798h2 = c9798h;
                            }
                            if (i30 == 0) {
                            }
                            if (i32 != 0) {
                                j17 = C10023k.f50982c;
                            } else {
                                j17 = j13;
                            }
                            if (i35 != 0) {
                                i42 = 1;
                            } else {
                                i42 = i10;
                            }
                            if (i38 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            if (i40 != 0) {
                                i43 = Integer.MAX_VALUE;
                            } else {
                                i43 = i11;
                            }
                            if (i41 != 0) {
                                interfaceC2052l2 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.material3.TextKt$Text$1
                                    @Override // cm.InterfaceC2052l
                                    /* JADX INFO: renamed from: n */
                                    public final C9072e mo528n(C7216j c7216j) {
                                        C5207g.m11111f(c7216j, "it");
                                        return C9072e.f47360a;
                                    }
                                };
                            } else {
                                interfaceC2052l2 = interfaceC2052l;
                            }
                            if ((i14 & 32768) != 0) {
                                c7218l2 = (C7218l) composerImplMo1636j.mo1648p(f2808a);
                                i37 &= -458753;
                            } else {
                                c7218l2 = c7218l;
                            }
                        }
                        composerImplMo1636j.m1610R();
                        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q18 = ComposerKt.f3003a;
                        composerImplMo1636j.mo1622c(79582607);
                        j18 = C9169u.f47703f;
                        if (j14 != j18) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (z12) {
                            jM14529b = j14;
                        } else {
                            jM14529b = c7218l2.f40600a.m14529b();
                            if (jM14529b != j18) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            if (z13) {
                                jM14529b = ((C9169u) composerImplMo1636j.mo1648p(ContentColorKt.f2738a)).f47705a;
                            }
                        }
                        composerImplMo1636j.m1609Q(false);
                        C7218l c7218l111 = c7218l2;
                        int i411112 = (i15 & 112) | (i15 & 14) | ((i37 >> 3) & 7168);
                        int i411113 = i37 << 9;
                        BasicTextKt.m1532c(str, interfaceC0500b2, c7218l111.m14544b(new C7218l(jM14529b, j15, c8476m2, c8471h2, abstractC0696b2, j16, c9798h2, c9797g2, j17, 175952)), interfaceC2052l2, i42, z11, i43, composerImplMo1636j, i411112 | (i411113 & 57344) | (i411113 & 458752) | (i411113 & 3670016), 0);
                        interfaceC0500b3 = interfaceC0500b2;
                        z14 = z11;
                        c9797g3 = c9797g2;
                        c8471h3 = c8471h2;
                        interfaceC2052l3 = interfaceC2052l2;
                        c7218l3 = c7218l111;
                        abstractC0696b3 = abstractC0696b2;
                        j19 = j15;
                        c9798h3 = c9798h2;
                        j20 = j17;
                        i44 = i43;
                        j21 = j14;
                        j22 = j16;
                        C8476m c8476m111 = c8476m2;
                        i45 = i42;
                        c8476m3 = c8476m111;
                    }
                    c5332q0M1612T = composerImplMo1636j.m1612T();
                    if (c5332q0M1612T == null) {
                        return;
                    }
                    c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.material3.TextKt$Text$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                            num.intValue();
                            TextKt.m1576c(str, interfaceC0500b3, j21, j19, c8471h3, c8476m3, abstractC0696b3, j22, c9798h3, c9797g3, j20, i45, z14, i44, interfaceC2052l3, c7218l3, interfaceC0476a2, i12 | 1, i13, i14);
                            return C9072e.f47360a;
                        }
                    };
                }
                i37 |= 24576;
                if ((i13 & 458752) != 0) {
                    if ((i14 & 32768) == 0) {
                        i46 = 65536;
                    } else {
                        i46 = 65536;
                    }
                    i37 |= i46;
                }
                if ((i15 & 1533916891) != 306783378) {
                    composerImplMo1636j.m1654s0();
                    if ((i12 & 1) != 0) {
                        if (i47 != 0) {
                            interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                        } else {
                            interfaceC0500b2 = interfaceC0500b;
                        }
                        if (i16 != 0) {
                            j14 = C9169u.f47703f;
                        } else {
                            j14 = j10;
                        }
                        if (i18 != 0) {
                            j15 = C10023k.f50982c;
                        } else {
                            j15 = j11;
                        }
                        if (i20 != 0) {
                            c8471h2 = null;
                        } else {
                            c8471h2 = c8471h;
                        }
                        if (i22 != 0) {
                            c8476m2 = null;
                        } else {
                            c8476m2 = c8476m;
                        }
                        if (i24 != 0) {
                            abstractC0696b2 = null;
                        } else {
                            abstractC0696b2 = abstractC0696b;
                        }
                        if (i26 != 0) {
                            j16 = C10023k.f50982c;
                        } else {
                            j16 = j12;
                        }
                        if (i28 != 0) {
                            c9798h2 = null;
                        } else {
                            c9798h2 = c9798h;
                        }
                        if (i30 == 0) {
                        }
                        if (i32 != 0) {
                            j17 = C10023k.f50982c;
                        } else {
                            j17 = j13;
                        }
                        if (i35 != 0) {
                            i42 = 1;
                        } else {
                            i42 = i10;
                        }
                        if (i38 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if (i40 != 0) {
                            i43 = Integer.MAX_VALUE;
                        } else {
                            i43 = i11;
                        }
                        if (i41 != 0) {
                            interfaceC2052l2 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.material3.TextKt$Text$1
                                @Override // cm.InterfaceC2052l
                                /* JADX INFO: renamed from: n */
                                public final C9072e mo528n(C7216j c7216j) {
                                    C5207g.m11111f(c7216j, "it");
                                    return C9072e.f47360a;
                                }
                            };
                        } else {
                            interfaceC2052l2 = interfaceC2052l;
                        }
                        if ((i14 & 32768) != 0) {
                            c7218l2 = (C7218l) composerImplMo1636j.mo1648p(f2808a);
                            i37 &= -458753;
                        } else {
                            c7218l2 = c7218l;
                        }
                    } else {
                        if (i47 != 0) {
                            interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                        } else {
                            interfaceC0500b2 = interfaceC0500b;
                        }
                        if (i16 != 0) {
                            j14 = C9169u.f47703f;
                        } else {
                            j14 = j10;
                        }
                        if (i18 != 0) {
                            j15 = C10023k.f50982c;
                        } else {
                            j15 = j11;
                        }
                        if (i20 != 0) {
                            c8471h2 = null;
                        } else {
                            c8471h2 = c8471h;
                        }
                        if (i22 != 0) {
                            c8476m2 = null;
                        } else {
                            c8476m2 = c8476m;
                        }
                        if (i24 != 0) {
                            abstractC0696b2 = null;
                        } else {
                            abstractC0696b2 = abstractC0696b;
                        }
                        if (i26 != 0) {
                            j16 = C10023k.f50982c;
                        } else {
                            j16 = j12;
                        }
                        if (i28 != 0) {
                            c9798h2 = null;
                        } else {
                            c9798h2 = c9798h;
                        }
                        if (i30 == 0) {
                        }
                        if (i32 != 0) {
                            j17 = C10023k.f50982c;
                        } else {
                            j17 = j13;
                        }
                        if (i35 != 0) {
                            i42 = 1;
                        } else {
                            i42 = i10;
                        }
                        if (i38 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if (i40 != 0) {
                            i43 = Integer.MAX_VALUE;
                        } else {
                            i43 = i11;
                        }
                        if (i41 != 0) {
                            interfaceC2052l2 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.material3.TextKt$Text$1
                                @Override // cm.InterfaceC2052l
                                /* JADX INFO: renamed from: n */
                                public final C9072e mo528n(C7216j c7216j) {
                                    C5207g.m11111f(c7216j, "it");
                                    return C9072e.f47360a;
                                }
                            };
                        } else {
                            interfaceC2052l2 = interfaceC2052l;
                        }
                        if ((i14 & 32768) != 0) {
                            c7218l2 = (C7218l) composerImplMo1636j.mo1648p(f2808a);
                            i37 &= -458753;
                        } else {
                            c7218l2 = c7218l;
                        }
                    }
                    composerImplMo1636j.m1610R();
                    InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q19 = ComposerKt.f3003a;
                    composerImplMo1636j.mo1622c(79582607);
                    j18 = C9169u.f47703f;
                    if (j14 != j18) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (z12) {
                        jM14529b = j14;
                    } else {
                        jM14529b = c7218l2.f40600a.m14529b();
                        if (jM14529b != j18) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (z13) {
                            jM14529b = ((C9169u) composerImplMo1636j.mo1648p(ContentColorKt.f2738a)).f47705a;
                        }
                    }
                    composerImplMo1636j.m1609Q(false);
                    C7218l c7218l112 = c7218l2;
                    int i411114 = (i15 & 112) | (i15 & 14) | ((i37 >> 3) & 7168);
                    int i411115 = i37 << 9;
                    BasicTextKt.m1532c(str, interfaceC0500b2, c7218l112.m14544b(new C7218l(jM14529b, j15, c8476m2, c8471h2, abstractC0696b2, j16, c9798h2, c9797g2, j17, 175952)), interfaceC2052l2, i42, z11, i43, composerImplMo1636j, i411114 | (i411115 & 57344) | (i411115 & 458752) | (i411115 & 3670016), 0);
                    interfaceC0500b3 = interfaceC0500b2;
                    z14 = z11;
                    c9797g3 = c9797g2;
                    c8471h3 = c8471h2;
                    interfaceC2052l3 = interfaceC2052l2;
                    c7218l3 = c7218l112;
                    abstractC0696b3 = abstractC0696b2;
                    j19 = j15;
                    c9798h3 = c9798h2;
                    j20 = j17;
                    i44 = i43;
                    j21 = j14;
                    j22 = j16;
                    C8476m c8476m112 = c8476m2;
                    i45 = i42;
                    c8476m3 = c8476m112;
                } else {
                    composerImplMo1636j.m1654s0();
                    if ((i12 & 1) != 0) {
                        if (i47 != 0) {
                            interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                        } else {
                            interfaceC0500b2 = interfaceC0500b;
                        }
                        if (i16 != 0) {
                            j14 = C9169u.f47703f;
                        } else {
                            j14 = j10;
                        }
                        if (i18 != 0) {
                            j15 = C10023k.f50982c;
                        } else {
                            j15 = j11;
                        }
                        if (i20 != 0) {
                            c8471h2 = null;
                        } else {
                            c8471h2 = c8471h;
                        }
                        if (i22 != 0) {
                            c8476m2 = null;
                        } else {
                            c8476m2 = c8476m;
                        }
                        if (i24 != 0) {
                            abstractC0696b2 = null;
                        } else {
                            abstractC0696b2 = abstractC0696b;
                        }
                        if (i26 != 0) {
                            j16 = C10023k.f50982c;
                        } else {
                            j16 = j12;
                        }
                        if (i28 != 0) {
                            c9798h2 = null;
                        } else {
                            c9798h2 = c9798h;
                        }
                        if (i30 == 0) {
                        }
                        if (i32 != 0) {
                            j17 = C10023k.f50982c;
                        } else {
                            j17 = j13;
                        }
                        if (i35 != 0) {
                            i42 = 1;
                        } else {
                            i42 = i10;
                        }
                        if (i38 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if (i40 != 0) {
                            i43 = Integer.MAX_VALUE;
                        } else {
                            i43 = i11;
                        }
                        if (i41 != 0) {
                            interfaceC2052l2 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.material3.TextKt$Text$1
                                @Override // cm.InterfaceC2052l
                                /* JADX INFO: renamed from: n */
                                public final C9072e mo528n(C7216j c7216j) {
                                    C5207g.m11111f(c7216j, "it");
                                    return C9072e.f47360a;
                                }
                            };
                        } else {
                            interfaceC2052l2 = interfaceC2052l;
                        }
                        if ((i14 & 32768) != 0) {
                            c7218l2 = (C7218l) composerImplMo1636j.mo1648p(f2808a);
                            i37 &= -458753;
                        } else {
                            c7218l2 = c7218l;
                        }
                    } else {
                        if (i47 != 0) {
                            interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                        } else {
                            interfaceC0500b2 = interfaceC0500b;
                        }
                        if (i16 != 0) {
                            j14 = C9169u.f47703f;
                        } else {
                            j14 = j10;
                        }
                        if (i18 != 0) {
                            j15 = C10023k.f50982c;
                        } else {
                            j15 = j11;
                        }
                        if (i20 != 0) {
                            c8471h2 = null;
                        } else {
                            c8471h2 = c8471h;
                        }
                        if (i22 != 0) {
                            c8476m2 = null;
                        } else {
                            c8476m2 = c8476m;
                        }
                        if (i24 != 0) {
                            abstractC0696b2 = null;
                        } else {
                            abstractC0696b2 = abstractC0696b;
                        }
                        if (i26 != 0) {
                            j16 = C10023k.f50982c;
                        } else {
                            j16 = j12;
                        }
                        if (i28 != 0) {
                            c9798h2 = null;
                        } else {
                            c9798h2 = c9798h;
                        }
                        if (i30 == 0) {
                        }
                        if (i32 != 0) {
                            j17 = C10023k.f50982c;
                        } else {
                            j17 = j13;
                        }
                        if (i35 != 0) {
                            i42 = 1;
                        } else {
                            i42 = i10;
                        }
                        if (i38 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if (i40 != 0) {
                            i43 = Integer.MAX_VALUE;
                        } else {
                            i43 = i11;
                        }
                        if (i41 != 0) {
                            interfaceC2052l2 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.material3.TextKt$Text$1
                                @Override // cm.InterfaceC2052l
                                /* JADX INFO: renamed from: n */
                                public final C9072e mo528n(C7216j c7216j) {
                                    C5207g.m11111f(c7216j, "it");
                                    return C9072e.f47360a;
                                }
                            };
                        } else {
                            interfaceC2052l2 = interfaceC2052l;
                        }
                        if ((i14 & 32768) != 0) {
                            c7218l2 = (C7218l) composerImplMo1636j.mo1648p(f2808a);
                            i37 &= -458753;
                        } else {
                            c7218l2 = c7218l;
                        }
                    }
                    composerImplMo1636j.m1610R();
                    InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q110 = ComposerKt.f3003a;
                    composerImplMo1636j.mo1622c(79582607);
                    j18 = C9169u.f47703f;
                    if (j14 != j18) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (z12) {
                        jM14529b = j14;
                    } else {
                        jM14529b = c7218l2.f40600a.m14529b();
                        if (jM14529b != j18) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (z13) {
                            jM14529b = ((C9169u) composerImplMo1636j.mo1648p(ContentColorKt.f2738a)).f47705a;
                        }
                    }
                    composerImplMo1636j.m1609Q(false);
                    C7218l c7218l113 = c7218l2;
                    int i411116 = (i15 & 112) | (i15 & 14) | ((i37 >> 3) & 7168);
                    int i411117 = i37 << 9;
                    BasicTextKt.m1532c(str, interfaceC0500b2, c7218l113.m14544b(new C7218l(jM14529b, j15, c8476m2, c8471h2, abstractC0696b2, j16, c9798h2, c9797g2, j17, 175952)), interfaceC2052l2, i42, z11, i43, composerImplMo1636j, i411116 | (i411117 & 57344) | (i411117 & 458752) | (i411117 & 3670016), 0);
                    interfaceC0500b3 = interfaceC0500b2;
                    z14 = z11;
                    c9797g3 = c9797g2;
                    c8471h3 = c8471h2;
                    interfaceC2052l3 = interfaceC2052l2;
                    c7218l3 = c7218l113;
                    abstractC0696b3 = abstractC0696b2;
                    j19 = j15;
                    c9798h3 = c9798h2;
                    j20 = j17;
                    i44 = i43;
                    j21 = j14;
                    j22 = j16;
                    C8476m c8476m113 = c8476m2;
                    i45 = i42;
                    c8476m3 = c8476m113;
                }
                c5332q0M1612T = composerImplMo1636j.m1612T();
                if (c5332q0M1612T == null) {
                    return;
                }
                c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.material3.TextKt$Text$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // cm.InterfaceC2056p
                    /* JADX INFO: renamed from: m0 */
                    public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                        num.intValue();
                        TextKt.m1576c(str, interfaceC0500b3, j21, j19, c8471h3, c8476m3, abstractC0696b3, j22, c9798h3, c9797g3, j20, i45, z14, i44, interfaceC2052l3, c7218l3, interfaceC0476a2, i12 | 1, i13, i14);
                        return C9072e.f47360a;
                    }
                };
            }
            i37 |= 3072;
            i41 = i14 & 16384;
            if (i41 != 0) {
                if ((i13 & 57344) == 0) {
                    i37 |= composerImplMo1636j.mo1665y(interfaceC2052l) ? 16384 : 8192;
                }
                if ((i13 & 458752) != 0) {
                    if ((i14 & 32768) == 0) {
                        i46 = 65536;
                    } else {
                        i46 = 65536;
                    }
                    i37 |= i46;
                }
                if ((i15 & 1533916891) != 306783378) {
                    composerImplMo1636j.m1654s0();
                    if ((i12 & 1) != 0) {
                        if (i47 != 0) {
                            interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                        } else {
                            interfaceC0500b2 = interfaceC0500b;
                        }
                        if (i16 != 0) {
                            j14 = C9169u.f47703f;
                        } else {
                            j14 = j10;
                        }
                        if (i18 != 0) {
                            j15 = C10023k.f50982c;
                        } else {
                            j15 = j11;
                        }
                        if (i20 != 0) {
                            c8471h2 = null;
                        } else {
                            c8471h2 = c8471h;
                        }
                        if (i22 != 0) {
                            c8476m2 = null;
                        } else {
                            c8476m2 = c8476m;
                        }
                        if (i24 != 0) {
                            abstractC0696b2 = null;
                        } else {
                            abstractC0696b2 = abstractC0696b;
                        }
                        if (i26 != 0) {
                            j16 = C10023k.f50982c;
                        } else {
                            j16 = j12;
                        }
                        if (i28 != 0) {
                            c9798h2 = null;
                        } else {
                            c9798h2 = c9798h;
                        }
                        if (i30 == 0) {
                        }
                        if (i32 != 0) {
                            j17 = C10023k.f50982c;
                        } else {
                            j17 = j13;
                        }
                        if (i35 != 0) {
                            i42 = 1;
                        } else {
                            i42 = i10;
                        }
                        if (i38 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if (i40 != 0) {
                            i43 = Integer.MAX_VALUE;
                        } else {
                            i43 = i11;
                        }
                        if (i41 != 0) {
                            interfaceC2052l2 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.material3.TextKt$Text$1
                                @Override // cm.InterfaceC2052l
                                /* JADX INFO: renamed from: n */
                                public final C9072e mo528n(C7216j c7216j) {
                                    C5207g.m11111f(c7216j, "it");
                                    return C9072e.f47360a;
                                }
                            };
                        } else {
                            interfaceC2052l2 = interfaceC2052l;
                        }
                        if ((i14 & 32768) != 0) {
                            c7218l2 = (C7218l) composerImplMo1636j.mo1648p(f2808a);
                            i37 &= -458753;
                        } else {
                            c7218l2 = c7218l;
                        }
                    } else {
                        if (i47 != 0) {
                            interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                        } else {
                            interfaceC0500b2 = interfaceC0500b;
                        }
                        if (i16 != 0) {
                            j14 = C9169u.f47703f;
                        } else {
                            j14 = j10;
                        }
                        if (i18 != 0) {
                            j15 = C10023k.f50982c;
                        } else {
                            j15 = j11;
                        }
                        if (i20 != 0) {
                            c8471h2 = null;
                        } else {
                            c8471h2 = c8471h;
                        }
                        if (i22 != 0) {
                            c8476m2 = null;
                        } else {
                            c8476m2 = c8476m;
                        }
                        if (i24 != 0) {
                            abstractC0696b2 = null;
                        } else {
                            abstractC0696b2 = abstractC0696b;
                        }
                        if (i26 != 0) {
                            j16 = C10023k.f50982c;
                        } else {
                            j16 = j12;
                        }
                        if (i28 != 0) {
                            c9798h2 = null;
                        } else {
                            c9798h2 = c9798h;
                        }
                        if (i30 == 0) {
                        }
                        if (i32 != 0) {
                            j17 = C10023k.f50982c;
                        } else {
                            j17 = j13;
                        }
                        if (i35 != 0) {
                            i42 = 1;
                        } else {
                            i42 = i10;
                        }
                        if (i38 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if (i40 != 0) {
                            i43 = Integer.MAX_VALUE;
                        } else {
                            i43 = i11;
                        }
                        if (i41 != 0) {
                            interfaceC2052l2 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.material3.TextKt$Text$1
                                @Override // cm.InterfaceC2052l
                                /* JADX INFO: renamed from: n */
                                public final C9072e mo528n(C7216j c7216j) {
                                    C5207g.m11111f(c7216j, "it");
                                    return C9072e.f47360a;
                                }
                            };
                        } else {
                            interfaceC2052l2 = interfaceC2052l;
                        }
                        if ((i14 & 32768) != 0) {
                            c7218l2 = (C7218l) composerImplMo1636j.mo1648p(f2808a);
                            i37 &= -458753;
                        } else {
                            c7218l2 = c7218l;
                        }
                    }
                    composerImplMo1636j.m1610R();
                    InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q111 = ComposerKt.f3003a;
                    composerImplMo1636j.mo1622c(79582607);
                    j18 = C9169u.f47703f;
                    if (j14 != j18) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (z12) {
                        jM14529b = j14;
                    } else {
                        jM14529b = c7218l2.f40600a.m14529b();
                        if (jM14529b != j18) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (z13) {
                            jM14529b = ((C9169u) composerImplMo1636j.mo1648p(ContentColorKt.f2738a)).f47705a;
                        }
                    }
                    composerImplMo1636j.m1609Q(false);
                    C7218l c7218l114 = c7218l2;
                    int i411118 = (i15 & 112) | (i15 & 14) | ((i37 >> 3) & 7168);
                    int i411119 = i37 << 9;
                    BasicTextKt.m1532c(str, interfaceC0500b2, c7218l114.m14544b(new C7218l(jM14529b, j15, c8476m2, c8471h2, abstractC0696b2, j16, c9798h2, c9797g2, j17, 175952)), interfaceC2052l2, i42, z11, i43, composerImplMo1636j, i411118 | (i411119 & 57344) | (i411119 & 458752) | (i411119 & 3670016), 0);
                    interfaceC0500b3 = interfaceC0500b2;
                    z14 = z11;
                    c9797g3 = c9797g2;
                    c8471h3 = c8471h2;
                    interfaceC2052l3 = interfaceC2052l2;
                    c7218l3 = c7218l114;
                    abstractC0696b3 = abstractC0696b2;
                    j19 = j15;
                    c9798h3 = c9798h2;
                    j20 = j17;
                    i44 = i43;
                    j21 = j14;
                    j22 = j16;
                    C8476m c8476m114 = c8476m2;
                    i45 = i42;
                    c8476m3 = c8476m114;
                } else {
                    composerImplMo1636j.m1654s0();
                    if ((i12 & 1) != 0) {
                        if (i47 != 0) {
                            interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                        } else {
                            interfaceC0500b2 = interfaceC0500b;
                        }
                        if (i16 != 0) {
                            j14 = C9169u.f47703f;
                        } else {
                            j14 = j10;
                        }
                        if (i18 != 0) {
                            j15 = C10023k.f50982c;
                        } else {
                            j15 = j11;
                        }
                        if (i20 != 0) {
                            c8471h2 = null;
                        } else {
                            c8471h2 = c8471h;
                        }
                        if (i22 != 0) {
                            c8476m2 = null;
                        } else {
                            c8476m2 = c8476m;
                        }
                        if (i24 != 0) {
                            abstractC0696b2 = null;
                        } else {
                            abstractC0696b2 = abstractC0696b;
                        }
                        if (i26 != 0) {
                            j16 = C10023k.f50982c;
                        } else {
                            j16 = j12;
                        }
                        if (i28 != 0) {
                            c9798h2 = null;
                        } else {
                            c9798h2 = c9798h;
                        }
                        if (i30 == 0) {
                        }
                        if (i32 != 0) {
                            j17 = C10023k.f50982c;
                        } else {
                            j17 = j13;
                        }
                        if (i35 != 0) {
                            i42 = 1;
                        } else {
                            i42 = i10;
                        }
                        if (i38 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if (i40 != 0) {
                            i43 = Integer.MAX_VALUE;
                        } else {
                            i43 = i11;
                        }
                        if (i41 != 0) {
                            interfaceC2052l2 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.material3.TextKt$Text$1
                                @Override // cm.InterfaceC2052l
                                /* JADX INFO: renamed from: n */
                                public final C9072e mo528n(C7216j c7216j) {
                                    C5207g.m11111f(c7216j, "it");
                                    return C9072e.f47360a;
                                }
                            };
                        } else {
                            interfaceC2052l2 = interfaceC2052l;
                        }
                        if ((i14 & 32768) != 0) {
                            c7218l2 = (C7218l) composerImplMo1636j.mo1648p(f2808a);
                            i37 &= -458753;
                        } else {
                            c7218l2 = c7218l;
                        }
                    } else {
                        if (i47 != 0) {
                            interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                        } else {
                            interfaceC0500b2 = interfaceC0500b;
                        }
                        if (i16 != 0) {
                            j14 = C9169u.f47703f;
                        } else {
                            j14 = j10;
                        }
                        if (i18 != 0) {
                            j15 = C10023k.f50982c;
                        } else {
                            j15 = j11;
                        }
                        if (i20 != 0) {
                            c8471h2 = null;
                        } else {
                            c8471h2 = c8471h;
                        }
                        if (i22 != 0) {
                            c8476m2 = null;
                        } else {
                            c8476m2 = c8476m;
                        }
                        if (i24 != 0) {
                            abstractC0696b2 = null;
                        } else {
                            abstractC0696b2 = abstractC0696b;
                        }
                        if (i26 != 0) {
                            j16 = C10023k.f50982c;
                        } else {
                            j16 = j12;
                        }
                        if (i28 != 0) {
                            c9798h2 = null;
                        } else {
                            c9798h2 = c9798h;
                        }
                        if (i30 == 0) {
                        }
                        if (i32 != 0) {
                            j17 = C10023k.f50982c;
                        } else {
                            j17 = j13;
                        }
                        if (i35 != 0) {
                            i42 = 1;
                        } else {
                            i42 = i10;
                        }
                        if (i38 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if (i40 != 0) {
                            i43 = Integer.MAX_VALUE;
                        } else {
                            i43 = i11;
                        }
                        if (i41 != 0) {
                            interfaceC2052l2 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.material3.TextKt$Text$1
                                @Override // cm.InterfaceC2052l
                                /* JADX INFO: renamed from: n */
                                public final C9072e mo528n(C7216j c7216j) {
                                    C5207g.m11111f(c7216j, "it");
                                    return C9072e.f47360a;
                                }
                            };
                        } else {
                            interfaceC2052l2 = interfaceC2052l;
                        }
                        if ((i14 & 32768) != 0) {
                            c7218l2 = (C7218l) composerImplMo1636j.mo1648p(f2808a);
                            i37 &= -458753;
                        } else {
                            c7218l2 = c7218l;
                        }
                    }
                    composerImplMo1636j.m1610R();
                    InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q112 = ComposerKt.f3003a;
                    composerImplMo1636j.mo1622c(79582607);
                    j18 = C9169u.f47703f;
                    if (j14 != j18) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (z12) {
                        jM14529b = j14;
                    } else {
                        jM14529b = c7218l2.f40600a.m14529b();
                        if (jM14529b != j18) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (z13) {
                            jM14529b = ((C9169u) composerImplMo1636j.mo1648p(ContentColorKt.f2738a)).f47705a;
                        }
                    }
                    composerImplMo1636j.m1609Q(false);
                    C7218l c7218l115 = c7218l2;
                    int i4111110 = (i15 & 112) | (i15 & 14) | ((i37 >> 3) & 7168);
                    int i4111111 = i37 << 9;
                    BasicTextKt.m1532c(str, interfaceC0500b2, c7218l115.m14544b(new C7218l(jM14529b, j15, c8476m2, c8471h2, abstractC0696b2, j16, c9798h2, c9797g2, j17, 175952)), interfaceC2052l2, i42, z11, i43, composerImplMo1636j, i4111110 | (i4111111 & 57344) | (i4111111 & 458752) | (i4111111 & 3670016), 0);
                    interfaceC0500b3 = interfaceC0500b2;
                    z14 = z11;
                    c9797g3 = c9797g2;
                    c8471h3 = c8471h2;
                    interfaceC2052l3 = interfaceC2052l2;
                    c7218l3 = c7218l115;
                    abstractC0696b3 = abstractC0696b2;
                    j19 = j15;
                    c9798h3 = c9798h2;
                    j20 = j17;
                    i44 = i43;
                    j21 = j14;
                    j22 = j16;
                    C8476m c8476m115 = c8476m2;
                    i45 = i42;
                    c8476m3 = c8476m115;
                }
                c5332q0M1612T = composerImplMo1636j.m1612T();
                if (c5332q0M1612T == null) {
                    return;
                }
                c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.material3.TextKt$Text$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // cm.InterfaceC2056p
                    /* JADX INFO: renamed from: m0 */
                    public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                        num.intValue();
                        TextKt.m1576c(str, interfaceC0500b3, j21, j19, c8471h3, c8476m3, abstractC0696b3, j22, c9798h3, c9797g3, j20, i45, z14, i44, interfaceC2052l3, c7218l3, interfaceC0476a2, i12 | 1, i13, i14);
                        return C9072e.f47360a;
                    }
                };
            }
            i37 |= 24576;
            if ((i13 & 458752) != 0) {
                if ((i14 & 32768) == 0) {
                    i46 = 65536;
                } else {
                    i46 = 65536;
                }
                i37 |= i46;
            }
            if ((i15 & 1533916891) != 306783378) {
                composerImplMo1636j.m1654s0();
                if ((i12 & 1) != 0) {
                    if (i47 != 0) {
                        interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                    } else {
                        interfaceC0500b2 = interfaceC0500b;
                    }
                    if (i16 != 0) {
                        j14 = C9169u.f47703f;
                    } else {
                        j14 = j10;
                    }
                    if (i18 != 0) {
                        j15 = C10023k.f50982c;
                    } else {
                        j15 = j11;
                    }
                    if (i20 != 0) {
                        c8471h2 = null;
                    } else {
                        c8471h2 = c8471h;
                    }
                    if (i22 != 0) {
                        c8476m2 = null;
                    } else {
                        c8476m2 = c8476m;
                    }
                    if (i24 != 0) {
                        abstractC0696b2 = null;
                    } else {
                        abstractC0696b2 = abstractC0696b;
                    }
                    if (i26 != 0) {
                        j16 = C10023k.f50982c;
                    } else {
                        j16 = j12;
                    }
                    if (i28 != 0) {
                        c9798h2 = null;
                    } else {
                        c9798h2 = c9798h;
                    }
                    if (i30 == 0) {
                    }
                    if (i32 != 0) {
                        j17 = C10023k.f50982c;
                    } else {
                        j17 = j13;
                    }
                    if (i35 != 0) {
                        i42 = 1;
                    } else {
                        i42 = i10;
                    }
                    if (i38 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    if (i40 != 0) {
                        i43 = Integer.MAX_VALUE;
                    } else {
                        i43 = i11;
                    }
                    if (i41 != 0) {
                        interfaceC2052l2 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.material3.TextKt$Text$1
                            @Override // cm.InterfaceC2052l
                            /* JADX INFO: renamed from: n */
                            public final C9072e mo528n(C7216j c7216j) {
                                C5207g.m11111f(c7216j, "it");
                                return C9072e.f47360a;
                            }
                        };
                    } else {
                        interfaceC2052l2 = interfaceC2052l;
                    }
                    if ((i14 & 32768) != 0) {
                        c7218l2 = (C7218l) composerImplMo1636j.mo1648p(f2808a);
                        i37 &= -458753;
                    } else {
                        c7218l2 = c7218l;
                    }
                } else {
                    if (i47 != 0) {
                        interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                    } else {
                        interfaceC0500b2 = interfaceC0500b;
                    }
                    if (i16 != 0) {
                        j14 = C9169u.f47703f;
                    } else {
                        j14 = j10;
                    }
                    if (i18 != 0) {
                        j15 = C10023k.f50982c;
                    } else {
                        j15 = j11;
                    }
                    if (i20 != 0) {
                        c8471h2 = null;
                    } else {
                        c8471h2 = c8471h;
                    }
                    if (i22 != 0) {
                        c8476m2 = null;
                    } else {
                        c8476m2 = c8476m;
                    }
                    if (i24 != 0) {
                        abstractC0696b2 = null;
                    } else {
                        abstractC0696b2 = abstractC0696b;
                    }
                    if (i26 != 0) {
                        j16 = C10023k.f50982c;
                    } else {
                        j16 = j12;
                    }
                    if (i28 != 0) {
                        c9798h2 = null;
                    } else {
                        c9798h2 = c9798h;
                    }
                    if (i30 == 0) {
                    }
                    if (i32 != 0) {
                        j17 = C10023k.f50982c;
                    } else {
                        j17 = j13;
                    }
                    if (i35 != 0) {
                        i42 = 1;
                    } else {
                        i42 = i10;
                    }
                    if (i38 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    if (i40 != 0) {
                        i43 = Integer.MAX_VALUE;
                    } else {
                        i43 = i11;
                    }
                    if (i41 != 0) {
                        interfaceC2052l2 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.material3.TextKt$Text$1
                            @Override // cm.InterfaceC2052l
                            /* JADX INFO: renamed from: n */
                            public final C9072e mo528n(C7216j c7216j) {
                                C5207g.m11111f(c7216j, "it");
                                return C9072e.f47360a;
                            }
                        };
                    } else {
                        interfaceC2052l2 = interfaceC2052l;
                    }
                    if ((i14 & 32768) != 0) {
                        c7218l2 = (C7218l) composerImplMo1636j.mo1648p(f2808a);
                        i37 &= -458753;
                    } else {
                        c7218l2 = c7218l;
                    }
                }
                composerImplMo1636j.m1610R();
                InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q113 = ComposerKt.f3003a;
                composerImplMo1636j.mo1622c(79582607);
                j18 = C9169u.f47703f;
                if (j14 != j18) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (z12) {
                    jM14529b = j14;
                } else {
                    jM14529b = c7218l2.f40600a.m14529b();
                    if (jM14529b != j18) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (z13) {
                        jM14529b = ((C9169u) composerImplMo1636j.mo1648p(ContentColorKt.f2738a)).f47705a;
                    }
                }
                composerImplMo1636j.m1609Q(false);
                C7218l c7218l116 = c7218l2;
                int i4111112 = (i15 & 112) | (i15 & 14) | ((i37 >> 3) & 7168);
                int i4111113 = i37 << 9;
                BasicTextKt.m1532c(str, interfaceC0500b2, c7218l116.m14544b(new C7218l(jM14529b, j15, c8476m2, c8471h2, abstractC0696b2, j16, c9798h2, c9797g2, j17, 175952)), interfaceC2052l2, i42, z11, i43, composerImplMo1636j, i4111112 | (i4111113 & 57344) | (i4111113 & 458752) | (i4111113 & 3670016), 0);
                interfaceC0500b3 = interfaceC0500b2;
                z14 = z11;
                c9797g3 = c9797g2;
                c8471h3 = c8471h2;
                interfaceC2052l3 = interfaceC2052l2;
                c7218l3 = c7218l116;
                abstractC0696b3 = abstractC0696b2;
                j19 = j15;
                c9798h3 = c9798h2;
                j20 = j17;
                i44 = i43;
                j21 = j14;
                j22 = j16;
                C8476m c8476m116 = c8476m2;
                i45 = i42;
                c8476m3 = c8476m116;
            } else {
                composerImplMo1636j.m1654s0();
                if ((i12 & 1) != 0) {
                    if (i47 != 0) {
                        interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                    } else {
                        interfaceC0500b2 = interfaceC0500b;
                    }
                    if (i16 != 0) {
                        j14 = C9169u.f47703f;
                    } else {
                        j14 = j10;
                    }
                    if (i18 != 0) {
                        j15 = C10023k.f50982c;
                    } else {
                        j15 = j11;
                    }
                    if (i20 != 0) {
                        c8471h2 = null;
                    } else {
                        c8471h2 = c8471h;
                    }
                    if (i22 != 0) {
                        c8476m2 = null;
                    } else {
                        c8476m2 = c8476m;
                    }
                    if (i24 != 0) {
                        abstractC0696b2 = null;
                    } else {
                        abstractC0696b2 = abstractC0696b;
                    }
                    if (i26 != 0) {
                        j16 = C10023k.f50982c;
                    } else {
                        j16 = j12;
                    }
                    if (i28 != 0) {
                        c9798h2 = null;
                    } else {
                        c9798h2 = c9798h;
                    }
                    if (i30 == 0) {
                    }
                    if (i32 != 0) {
                        j17 = C10023k.f50982c;
                    } else {
                        j17 = j13;
                    }
                    if (i35 != 0) {
                        i42 = 1;
                    } else {
                        i42 = i10;
                    }
                    if (i38 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    if (i40 != 0) {
                        i43 = Integer.MAX_VALUE;
                    } else {
                        i43 = i11;
                    }
                    if (i41 != 0) {
                        interfaceC2052l2 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.material3.TextKt$Text$1
                            @Override // cm.InterfaceC2052l
                            /* JADX INFO: renamed from: n */
                            public final C9072e mo528n(C7216j c7216j) {
                                C5207g.m11111f(c7216j, "it");
                                return C9072e.f47360a;
                            }
                        };
                    } else {
                        interfaceC2052l2 = interfaceC2052l;
                    }
                    if ((i14 & 32768) != 0) {
                        c7218l2 = (C7218l) composerImplMo1636j.mo1648p(f2808a);
                        i37 &= -458753;
                    } else {
                        c7218l2 = c7218l;
                    }
                } else {
                    if (i47 != 0) {
                        interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                    } else {
                        interfaceC0500b2 = interfaceC0500b;
                    }
                    if (i16 != 0) {
                        j14 = C9169u.f47703f;
                    } else {
                        j14 = j10;
                    }
                    if (i18 != 0) {
                        j15 = C10023k.f50982c;
                    } else {
                        j15 = j11;
                    }
                    if (i20 != 0) {
                        c8471h2 = null;
                    } else {
                        c8471h2 = c8471h;
                    }
                    if (i22 != 0) {
                        c8476m2 = null;
                    } else {
                        c8476m2 = c8476m;
                    }
                    if (i24 != 0) {
                        abstractC0696b2 = null;
                    } else {
                        abstractC0696b2 = abstractC0696b;
                    }
                    if (i26 != 0) {
                        j16 = C10023k.f50982c;
                    } else {
                        j16 = j12;
                    }
                    if (i28 != 0) {
                        c9798h2 = null;
                    } else {
                        c9798h2 = c9798h;
                    }
                    if (i30 == 0) {
                    }
                    if (i32 != 0) {
                        j17 = C10023k.f50982c;
                    } else {
                        j17 = j13;
                    }
                    if (i35 != 0) {
                        i42 = 1;
                    } else {
                        i42 = i10;
                    }
                    if (i38 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    if (i40 != 0) {
                        i43 = Integer.MAX_VALUE;
                    } else {
                        i43 = i11;
                    }
                    if (i41 != 0) {
                        interfaceC2052l2 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.material3.TextKt$Text$1
                            @Override // cm.InterfaceC2052l
                            /* JADX INFO: renamed from: n */
                            public final C9072e mo528n(C7216j c7216j) {
                                C5207g.m11111f(c7216j, "it");
                                return C9072e.f47360a;
                            }
                        };
                    } else {
                        interfaceC2052l2 = interfaceC2052l;
                    }
                    if ((i14 & 32768) != 0) {
                        c7218l2 = (C7218l) composerImplMo1636j.mo1648p(f2808a);
                        i37 &= -458753;
                    } else {
                        c7218l2 = c7218l;
                    }
                }
                composerImplMo1636j.m1610R();
                InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q114 = ComposerKt.f3003a;
                composerImplMo1636j.mo1622c(79582607);
                j18 = C9169u.f47703f;
                if (j14 != j18) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (z12) {
                    jM14529b = j14;
                } else {
                    jM14529b = c7218l2.f40600a.m14529b();
                    if (jM14529b != j18) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (z13) {
                        jM14529b = ((C9169u) composerImplMo1636j.mo1648p(ContentColorKt.f2738a)).f47705a;
                    }
                }
                composerImplMo1636j.m1609Q(false);
                C7218l c7218l117 = c7218l2;
                int i4111114 = (i15 & 112) | (i15 & 14) | ((i37 >> 3) & 7168);
                int i4111115 = i37 << 9;
                BasicTextKt.m1532c(str, interfaceC0500b2, c7218l117.m14544b(new C7218l(jM14529b, j15, c8476m2, c8471h2, abstractC0696b2, j16, c9798h2, c9797g2, j17, 175952)), interfaceC2052l2, i42, z11, i43, composerImplMo1636j, i4111114 | (i4111115 & 57344) | (i4111115 & 458752) | (i4111115 & 3670016), 0);
                interfaceC0500b3 = interfaceC0500b2;
                z14 = z11;
                c9797g3 = c9797g2;
                c8471h3 = c8471h2;
                interfaceC2052l3 = interfaceC2052l2;
                c7218l3 = c7218l117;
                abstractC0696b3 = abstractC0696b2;
                j19 = j15;
                c9798h3 = c9798h2;
                j20 = j17;
                i44 = i43;
                j21 = j14;
                j22 = j16;
                C8476m c8476m117 = c8476m2;
                i45 = i42;
                c8476m3 = c8476m117;
            }
            c5332q0M1612T = composerImplMo1636j.m1612T();
            if (c5332q0M1612T == null) {
                return;
            }
            c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.material3.TextKt$Text$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // cm.InterfaceC2056p
                /* JADX INFO: renamed from: m0 */
                public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                    num.intValue();
                    TextKt.m1576c(str, interfaceC0500b3, j21, j19, c8471h3, c8476m3, abstractC0696b3, j22, c9798h3, c9797g3, j20, i45, z14, i44, interfaceC2052l3, c7218l3, interfaceC0476a2, i12 | 1, i13, i14);
                    return C9072e.f47360a;
                }
            };
        }
        i37 |= 384;
        i40 = i14 & 8192;
        if (i40 != 0) {
            if ((i13 & 7168) == 0) {
                i37 |= composerImplMo1636j.m1594E(i11) ? 2048 : 1024;
            }
            i41 = i14 & 16384;
            if (i41 != 0) {
                if ((i13 & 57344) == 0) {
                    i37 |= composerImplMo1636j.mo1665y(interfaceC2052l) ? 16384 : 8192;
                }
                if ((i13 & 458752) != 0) {
                    if ((i14 & 32768) == 0) {
                        i46 = 65536;
                    } else {
                        i46 = 65536;
                    }
                    i37 |= i46;
                }
                if ((i15 & 1533916891) != 306783378) {
                    composerImplMo1636j.m1654s0();
                    if ((i12 & 1) != 0) {
                        if (i47 != 0) {
                            interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                        } else {
                            interfaceC0500b2 = interfaceC0500b;
                        }
                        if (i16 != 0) {
                            j14 = C9169u.f47703f;
                        } else {
                            j14 = j10;
                        }
                        if (i18 != 0) {
                            j15 = C10023k.f50982c;
                        } else {
                            j15 = j11;
                        }
                        if (i20 != 0) {
                            c8471h2 = null;
                        } else {
                            c8471h2 = c8471h;
                        }
                        if (i22 != 0) {
                            c8476m2 = null;
                        } else {
                            c8476m2 = c8476m;
                        }
                        if (i24 != 0) {
                            abstractC0696b2 = null;
                        } else {
                            abstractC0696b2 = abstractC0696b;
                        }
                        if (i26 != 0) {
                            j16 = C10023k.f50982c;
                        } else {
                            j16 = j12;
                        }
                        if (i28 != 0) {
                            c9798h2 = null;
                        } else {
                            c9798h2 = c9798h;
                        }
                        if (i30 == 0) {
                        }
                        if (i32 != 0) {
                            j17 = C10023k.f50982c;
                        } else {
                            j17 = j13;
                        }
                        if (i35 != 0) {
                            i42 = 1;
                        } else {
                            i42 = i10;
                        }
                        if (i38 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if (i40 != 0) {
                            i43 = Integer.MAX_VALUE;
                        } else {
                            i43 = i11;
                        }
                        if (i41 != 0) {
                            interfaceC2052l2 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.material3.TextKt$Text$1
                                @Override // cm.InterfaceC2052l
                                /* JADX INFO: renamed from: n */
                                public final C9072e mo528n(C7216j c7216j) {
                                    C5207g.m11111f(c7216j, "it");
                                    return C9072e.f47360a;
                                }
                            };
                        } else {
                            interfaceC2052l2 = interfaceC2052l;
                        }
                        if ((i14 & 32768) != 0) {
                            c7218l2 = (C7218l) composerImplMo1636j.mo1648p(f2808a);
                            i37 &= -458753;
                        } else {
                            c7218l2 = c7218l;
                        }
                    } else {
                        if (i47 != 0) {
                            interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                        } else {
                            interfaceC0500b2 = interfaceC0500b;
                        }
                        if (i16 != 0) {
                            j14 = C9169u.f47703f;
                        } else {
                            j14 = j10;
                        }
                        if (i18 != 0) {
                            j15 = C10023k.f50982c;
                        } else {
                            j15 = j11;
                        }
                        if (i20 != 0) {
                            c8471h2 = null;
                        } else {
                            c8471h2 = c8471h;
                        }
                        if (i22 != 0) {
                            c8476m2 = null;
                        } else {
                            c8476m2 = c8476m;
                        }
                        if (i24 != 0) {
                            abstractC0696b2 = null;
                        } else {
                            abstractC0696b2 = abstractC0696b;
                        }
                        if (i26 != 0) {
                            j16 = C10023k.f50982c;
                        } else {
                            j16 = j12;
                        }
                        if (i28 != 0) {
                            c9798h2 = null;
                        } else {
                            c9798h2 = c9798h;
                        }
                        if (i30 == 0) {
                        }
                        if (i32 != 0) {
                            j17 = C10023k.f50982c;
                        } else {
                            j17 = j13;
                        }
                        if (i35 != 0) {
                            i42 = 1;
                        } else {
                            i42 = i10;
                        }
                        if (i38 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if (i40 != 0) {
                            i43 = Integer.MAX_VALUE;
                        } else {
                            i43 = i11;
                        }
                        if (i41 != 0) {
                            interfaceC2052l2 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.material3.TextKt$Text$1
                                @Override // cm.InterfaceC2052l
                                /* JADX INFO: renamed from: n */
                                public final C9072e mo528n(C7216j c7216j) {
                                    C5207g.m11111f(c7216j, "it");
                                    return C9072e.f47360a;
                                }
                            };
                        } else {
                            interfaceC2052l2 = interfaceC2052l;
                        }
                        if ((i14 & 32768) != 0) {
                            c7218l2 = (C7218l) composerImplMo1636j.mo1648p(f2808a);
                            i37 &= -458753;
                        } else {
                            c7218l2 = c7218l;
                        }
                    }
                    composerImplMo1636j.m1610R();
                    InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q115 = ComposerKt.f3003a;
                    composerImplMo1636j.mo1622c(79582607);
                    j18 = C9169u.f47703f;
                    if (j14 != j18) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (z12) {
                        jM14529b = j14;
                    } else {
                        jM14529b = c7218l2.f40600a.m14529b();
                        if (jM14529b != j18) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (z13) {
                            jM14529b = ((C9169u) composerImplMo1636j.mo1648p(ContentColorKt.f2738a)).f47705a;
                        }
                    }
                    composerImplMo1636j.m1609Q(false);
                    C7218l c7218l118 = c7218l2;
                    int i4111116 = (i15 & 112) | (i15 & 14) | ((i37 >> 3) & 7168);
                    int i4111117 = i37 << 9;
                    BasicTextKt.m1532c(str, interfaceC0500b2, c7218l118.m14544b(new C7218l(jM14529b, j15, c8476m2, c8471h2, abstractC0696b2, j16, c9798h2, c9797g2, j17, 175952)), interfaceC2052l2, i42, z11, i43, composerImplMo1636j, i4111116 | (i4111117 & 57344) | (i4111117 & 458752) | (i4111117 & 3670016), 0);
                    interfaceC0500b3 = interfaceC0500b2;
                    z14 = z11;
                    c9797g3 = c9797g2;
                    c8471h3 = c8471h2;
                    interfaceC2052l3 = interfaceC2052l2;
                    c7218l3 = c7218l118;
                    abstractC0696b3 = abstractC0696b2;
                    j19 = j15;
                    c9798h3 = c9798h2;
                    j20 = j17;
                    i44 = i43;
                    j21 = j14;
                    j22 = j16;
                    C8476m c8476m118 = c8476m2;
                    i45 = i42;
                    c8476m3 = c8476m118;
                } else {
                    composerImplMo1636j.m1654s0();
                    if ((i12 & 1) != 0) {
                        if (i47 != 0) {
                            interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                        } else {
                            interfaceC0500b2 = interfaceC0500b;
                        }
                        if (i16 != 0) {
                            j14 = C9169u.f47703f;
                        } else {
                            j14 = j10;
                        }
                        if (i18 != 0) {
                            j15 = C10023k.f50982c;
                        } else {
                            j15 = j11;
                        }
                        if (i20 != 0) {
                            c8471h2 = null;
                        } else {
                            c8471h2 = c8471h;
                        }
                        if (i22 != 0) {
                            c8476m2 = null;
                        } else {
                            c8476m2 = c8476m;
                        }
                        if (i24 != 0) {
                            abstractC0696b2 = null;
                        } else {
                            abstractC0696b2 = abstractC0696b;
                        }
                        if (i26 != 0) {
                            j16 = C10023k.f50982c;
                        } else {
                            j16 = j12;
                        }
                        if (i28 != 0) {
                            c9798h2 = null;
                        } else {
                            c9798h2 = c9798h;
                        }
                        if (i30 == 0) {
                        }
                        if (i32 != 0) {
                            j17 = C10023k.f50982c;
                        } else {
                            j17 = j13;
                        }
                        if (i35 != 0) {
                            i42 = 1;
                        } else {
                            i42 = i10;
                        }
                        if (i38 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if (i40 != 0) {
                            i43 = Integer.MAX_VALUE;
                        } else {
                            i43 = i11;
                        }
                        if (i41 != 0) {
                            interfaceC2052l2 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.material3.TextKt$Text$1
                                @Override // cm.InterfaceC2052l
                                /* JADX INFO: renamed from: n */
                                public final C9072e mo528n(C7216j c7216j) {
                                    C5207g.m11111f(c7216j, "it");
                                    return C9072e.f47360a;
                                }
                            };
                        } else {
                            interfaceC2052l2 = interfaceC2052l;
                        }
                        if ((i14 & 32768) != 0) {
                            c7218l2 = (C7218l) composerImplMo1636j.mo1648p(f2808a);
                            i37 &= -458753;
                        } else {
                            c7218l2 = c7218l;
                        }
                    } else {
                        if (i47 != 0) {
                            interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                        } else {
                            interfaceC0500b2 = interfaceC0500b;
                        }
                        if (i16 != 0) {
                            j14 = C9169u.f47703f;
                        } else {
                            j14 = j10;
                        }
                        if (i18 != 0) {
                            j15 = C10023k.f50982c;
                        } else {
                            j15 = j11;
                        }
                        if (i20 != 0) {
                            c8471h2 = null;
                        } else {
                            c8471h2 = c8471h;
                        }
                        if (i22 != 0) {
                            c8476m2 = null;
                        } else {
                            c8476m2 = c8476m;
                        }
                        if (i24 != 0) {
                            abstractC0696b2 = null;
                        } else {
                            abstractC0696b2 = abstractC0696b;
                        }
                        if (i26 != 0) {
                            j16 = C10023k.f50982c;
                        } else {
                            j16 = j12;
                        }
                        if (i28 != 0) {
                            c9798h2 = null;
                        } else {
                            c9798h2 = c9798h;
                        }
                        if (i30 == 0) {
                        }
                        if (i32 != 0) {
                            j17 = C10023k.f50982c;
                        } else {
                            j17 = j13;
                        }
                        if (i35 != 0) {
                            i42 = 1;
                        } else {
                            i42 = i10;
                        }
                        if (i38 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if (i40 != 0) {
                            i43 = Integer.MAX_VALUE;
                        } else {
                            i43 = i11;
                        }
                        if (i41 != 0) {
                            interfaceC2052l2 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.material3.TextKt$Text$1
                                @Override // cm.InterfaceC2052l
                                /* JADX INFO: renamed from: n */
                                public final C9072e mo528n(C7216j c7216j) {
                                    C5207g.m11111f(c7216j, "it");
                                    return C9072e.f47360a;
                                }
                            };
                        } else {
                            interfaceC2052l2 = interfaceC2052l;
                        }
                        if ((i14 & 32768) != 0) {
                            c7218l2 = (C7218l) composerImplMo1636j.mo1648p(f2808a);
                            i37 &= -458753;
                        } else {
                            c7218l2 = c7218l;
                        }
                    }
                    composerImplMo1636j.m1610R();
                    InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q116 = ComposerKt.f3003a;
                    composerImplMo1636j.mo1622c(79582607);
                    j18 = C9169u.f47703f;
                    if (j14 != j18) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (z12) {
                        jM14529b = j14;
                    } else {
                        jM14529b = c7218l2.f40600a.m14529b();
                        if (jM14529b != j18) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (z13) {
                            jM14529b = ((C9169u) composerImplMo1636j.mo1648p(ContentColorKt.f2738a)).f47705a;
                        }
                    }
                    composerImplMo1636j.m1609Q(false);
                    C7218l c7218l119 = c7218l2;
                    int i4111118 = (i15 & 112) | (i15 & 14) | ((i37 >> 3) & 7168);
                    int i4111119 = i37 << 9;
                    BasicTextKt.m1532c(str, interfaceC0500b2, c7218l119.m14544b(new C7218l(jM14529b, j15, c8476m2, c8471h2, abstractC0696b2, j16, c9798h2, c9797g2, j17, 175952)), interfaceC2052l2, i42, z11, i43, composerImplMo1636j, i4111118 | (i4111119 & 57344) | (i4111119 & 458752) | (i4111119 & 3670016), 0);
                    interfaceC0500b3 = interfaceC0500b2;
                    z14 = z11;
                    c9797g3 = c9797g2;
                    c8471h3 = c8471h2;
                    interfaceC2052l3 = interfaceC2052l2;
                    c7218l3 = c7218l119;
                    abstractC0696b3 = abstractC0696b2;
                    j19 = j15;
                    c9798h3 = c9798h2;
                    j20 = j17;
                    i44 = i43;
                    j21 = j14;
                    j22 = j16;
                    C8476m c8476m119 = c8476m2;
                    i45 = i42;
                    c8476m3 = c8476m119;
                }
                c5332q0M1612T = composerImplMo1636j.m1612T();
                if (c5332q0M1612T == null) {
                    return;
                }
                c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.material3.TextKt$Text$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // cm.InterfaceC2056p
                    /* JADX INFO: renamed from: m0 */
                    public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                        num.intValue();
                        TextKt.m1576c(str, interfaceC0500b3, j21, j19, c8471h3, c8476m3, abstractC0696b3, j22, c9798h3, c9797g3, j20, i45, z14, i44, interfaceC2052l3, c7218l3, interfaceC0476a2, i12 | 1, i13, i14);
                        return C9072e.f47360a;
                    }
                };
            }
            i37 |= 24576;
            if ((i13 & 458752) != 0) {
                if ((i14 & 32768) == 0) {
                    i46 = 65536;
                } else {
                    i46 = 65536;
                }
                i37 |= i46;
            }
            if ((i15 & 1533916891) != 306783378) {
                composerImplMo1636j.m1654s0();
                if ((i12 & 1) != 0) {
                    if (i47 != 0) {
                        interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                    } else {
                        interfaceC0500b2 = interfaceC0500b;
                    }
                    if (i16 != 0) {
                        j14 = C9169u.f47703f;
                    } else {
                        j14 = j10;
                    }
                    if (i18 != 0) {
                        j15 = C10023k.f50982c;
                    } else {
                        j15 = j11;
                    }
                    if (i20 != 0) {
                        c8471h2 = null;
                    } else {
                        c8471h2 = c8471h;
                    }
                    if (i22 != 0) {
                        c8476m2 = null;
                    } else {
                        c8476m2 = c8476m;
                    }
                    if (i24 != 0) {
                        abstractC0696b2 = null;
                    } else {
                        abstractC0696b2 = abstractC0696b;
                    }
                    if (i26 != 0) {
                        j16 = C10023k.f50982c;
                    } else {
                        j16 = j12;
                    }
                    if (i28 != 0) {
                        c9798h2 = null;
                    } else {
                        c9798h2 = c9798h;
                    }
                    if (i30 == 0) {
                    }
                    if (i32 != 0) {
                        j17 = C10023k.f50982c;
                    } else {
                        j17 = j13;
                    }
                    if (i35 != 0) {
                        i42 = 1;
                    } else {
                        i42 = i10;
                    }
                    if (i38 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    if (i40 != 0) {
                        i43 = Integer.MAX_VALUE;
                    } else {
                        i43 = i11;
                    }
                    if (i41 != 0) {
                        interfaceC2052l2 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.material3.TextKt$Text$1
                            @Override // cm.InterfaceC2052l
                            /* JADX INFO: renamed from: n */
                            public final C9072e mo528n(C7216j c7216j) {
                                C5207g.m11111f(c7216j, "it");
                                return C9072e.f47360a;
                            }
                        };
                    } else {
                        interfaceC2052l2 = interfaceC2052l;
                    }
                    if ((i14 & 32768) != 0) {
                        c7218l2 = (C7218l) composerImplMo1636j.mo1648p(f2808a);
                        i37 &= -458753;
                    } else {
                        c7218l2 = c7218l;
                    }
                } else {
                    if (i47 != 0) {
                        interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                    } else {
                        interfaceC0500b2 = interfaceC0500b;
                    }
                    if (i16 != 0) {
                        j14 = C9169u.f47703f;
                    } else {
                        j14 = j10;
                    }
                    if (i18 != 0) {
                        j15 = C10023k.f50982c;
                    } else {
                        j15 = j11;
                    }
                    if (i20 != 0) {
                        c8471h2 = null;
                    } else {
                        c8471h2 = c8471h;
                    }
                    if (i22 != 0) {
                        c8476m2 = null;
                    } else {
                        c8476m2 = c8476m;
                    }
                    if (i24 != 0) {
                        abstractC0696b2 = null;
                    } else {
                        abstractC0696b2 = abstractC0696b;
                    }
                    if (i26 != 0) {
                        j16 = C10023k.f50982c;
                    } else {
                        j16 = j12;
                    }
                    if (i28 != 0) {
                        c9798h2 = null;
                    } else {
                        c9798h2 = c9798h;
                    }
                    if (i30 == 0) {
                    }
                    if (i32 != 0) {
                        j17 = C10023k.f50982c;
                    } else {
                        j17 = j13;
                    }
                    if (i35 != 0) {
                        i42 = 1;
                    } else {
                        i42 = i10;
                    }
                    if (i38 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    if (i40 != 0) {
                        i43 = Integer.MAX_VALUE;
                    } else {
                        i43 = i11;
                    }
                    if (i41 != 0) {
                        interfaceC2052l2 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.material3.TextKt$Text$1
                            @Override // cm.InterfaceC2052l
                            /* JADX INFO: renamed from: n */
                            public final C9072e mo528n(C7216j c7216j) {
                                C5207g.m11111f(c7216j, "it");
                                return C9072e.f47360a;
                            }
                        };
                    } else {
                        interfaceC2052l2 = interfaceC2052l;
                    }
                    if ((i14 & 32768) != 0) {
                        c7218l2 = (C7218l) composerImplMo1636j.mo1648p(f2808a);
                        i37 &= -458753;
                    } else {
                        c7218l2 = c7218l;
                    }
                }
                composerImplMo1636j.m1610R();
                InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q117 = ComposerKt.f3003a;
                composerImplMo1636j.mo1622c(79582607);
                j18 = C9169u.f47703f;
                if (j14 != j18) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (z12) {
                    jM14529b = j14;
                } else {
                    jM14529b = c7218l2.f40600a.m14529b();
                    if (jM14529b != j18) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (z13) {
                        jM14529b = ((C9169u) composerImplMo1636j.mo1648p(ContentColorKt.f2738a)).f47705a;
                    }
                }
                composerImplMo1636j.m1609Q(false);
                C7218l c7218l1110 = c7218l2;
                int i41111110 = (i15 & 112) | (i15 & 14) | ((i37 >> 3) & 7168);
                int i41111111 = i37 << 9;
                BasicTextKt.m1532c(str, interfaceC0500b2, c7218l1110.m14544b(new C7218l(jM14529b, j15, c8476m2, c8471h2, abstractC0696b2, j16, c9798h2, c9797g2, j17, 175952)), interfaceC2052l2, i42, z11, i43, composerImplMo1636j, i41111110 | (i41111111 & 57344) | (i41111111 & 458752) | (i41111111 & 3670016), 0);
                interfaceC0500b3 = interfaceC0500b2;
                z14 = z11;
                c9797g3 = c9797g2;
                c8471h3 = c8471h2;
                interfaceC2052l3 = interfaceC2052l2;
                c7218l3 = c7218l1110;
                abstractC0696b3 = abstractC0696b2;
                j19 = j15;
                c9798h3 = c9798h2;
                j20 = j17;
                i44 = i43;
                j21 = j14;
                j22 = j16;
                C8476m c8476m1110 = c8476m2;
                i45 = i42;
                c8476m3 = c8476m1110;
            } else {
                composerImplMo1636j.m1654s0();
                if ((i12 & 1) != 0) {
                    if (i47 != 0) {
                        interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                    } else {
                        interfaceC0500b2 = interfaceC0500b;
                    }
                    if (i16 != 0) {
                        j14 = C9169u.f47703f;
                    } else {
                        j14 = j10;
                    }
                    if (i18 != 0) {
                        j15 = C10023k.f50982c;
                    } else {
                        j15 = j11;
                    }
                    if (i20 != 0) {
                        c8471h2 = null;
                    } else {
                        c8471h2 = c8471h;
                    }
                    if (i22 != 0) {
                        c8476m2 = null;
                    } else {
                        c8476m2 = c8476m;
                    }
                    if (i24 != 0) {
                        abstractC0696b2 = null;
                    } else {
                        abstractC0696b2 = abstractC0696b;
                    }
                    if (i26 != 0) {
                        j16 = C10023k.f50982c;
                    } else {
                        j16 = j12;
                    }
                    if (i28 != 0) {
                        c9798h2 = null;
                    } else {
                        c9798h2 = c9798h;
                    }
                    if (i30 == 0) {
                    }
                    if (i32 != 0) {
                        j17 = C10023k.f50982c;
                    } else {
                        j17 = j13;
                    }
                    if (i35 != 0) {
                        i42 = 1;
                    } else {
                        i42 = i10;
                    }
                    if (i38 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    if (i40 != 0) {
                        i43 = Integer.MAX_VALUE;
                    } else {
                        i43 = i11;
                    }
                    if (i41 != 0) {
                        interfaceC2052l2 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.material3.TextKt$Text$1
                            @Override // cm.InterfaceC2052l
                            /* JADX INFO: renamed from: n */
                            public final C9072e mo528n(C7216j c7216j) {
                                C5207g.m11111f(c7216j, "it");
                                return C9072e.f47360a;
                            }
                        };
                    } else {
                        interfaceC2052l2 = interfaceC2052l;
                    }
                    if ((i14 & 32768) != 0) {
                        c7218l2 = (C7218l) composerImplMo1636j.mo1648p(f2808a);
                        i37 &= -458753;
                    } else {
                        c7218l2 = c7218l;
                    }
                } else {
                    if (i47 != 0) {
                        interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                    } else {
                        interfaceC0500b2 = interfaceC0500b;
                    }
                    if (i16 != 0) {
                        j14 = C9169u.f47703f;
                    } else {
                        j14 = j10;
                    }
                    if (i18 != 0) {
                        j15 = C10023k.f50982c;
                    } else {
                        j15 = j11;
                    }
                    if (i20 != 0) {
                        c8471h2 = null;
                    } else {
                        c8471h2 = c8471h;
                    }
                    if (i22 != 0) {
                        c8476m2 = null;
                    } else {
                        c8476m2 = c8476m;
                    }
                    if (i24 != 0) {
                        abstractC0696b2 = null;
                    } else {
                        abstractC0696b2 = abstractC0696b;
                    }
                    if (i26 != 0) {
                        j16 = C10023k.f50982c;
                    } else {
                        j16 = j12;
                    }
                    if (i28 != 0) {
                        c9798h2 = null;
                    } else {
                        c9798h2 = c9798h;
                    }
                    if (i30 == 0) {
                    }
                    if (i32 != 0) {
                        j17 = C10023k.f50982c;
                    } else {
                        j17 = j13;
                    }
                    if (i35 != 0) {
                        i42 = 1;
                    } else {
                        i42 = i10;
                    }
                    if (i38 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    if (i40 != 0) {
                        i43 = Integer.MAX_VALUE;
                    } else {
                        i43 = i11;
                    }
                    if (i41 != 0) {
                        interfaceC2052l2 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.material3.TextKt$Text$1
                            @Override // cm.InterfaceC2052l
                            /* JADX INFO: renamed from: n */
                            public final C9072e mo528n(C7216j c7216j) {
                                C5207g.m11111f(c7216j, "it");
                                return C9072e.f47360a;
                            }
                        };
                    } else {
                        interfaceC2052l2 = interfaceC2052l;
                    }
                    if ((i14 & 32768) != 0) {
                        c7218l2 = (C7218l) composerImplMo1636j.mo1648p(f2808a);
                        i37 &= -458753;
                    } else {
                        c7218l2 = c7218l;
                    }
                }
                composerImplMo1636j.m1610R();
                InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q118 = ComposerKt.f3003a;
                composerImplMo1636j.mo1622c(79582607);
                j18 = C9169u.f47703f;
                if (j14 != j18) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (z12) {
                    jM14529b = j14;
                } else {
                    jM14529b = c7218l2.f40600a.m14529b();
                    if (jM14529b != j18) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (z13) {
                        jM14529b = ((C9169u) composerImplMo1636j.mo1648p(ContentColorKt.f2738a)).f47705a;
                    }
                }
                composerImplMo1636j.m1609Q(false);
                C7218l c7218l1111 = c7218l2;
                int i41111112 = (i15 & 112) | (i15 & 14) | ((i37 >> 3) & 7168);
                int i41111113 = i37 << 9;
                BasicTextKt.m1532c(str, interfaceC0500b2, c7218l1111.m14544b(new C7218l(jM14529b, j15, c8476m2, c8471h2, abstractC0696b2, j16, c9798h2, c9797g2, j17, 175952)), interfaceC2052l2, i42, z11, i43, composerImplMo1636j, i41111112 | (i41111113 & 57344) | (i41111113 & 458752) | (i41111113 & 3670016), 0);
                interfaceC0500b3 = interfaceC0500b2;
                z14 = z11;
                c9797g3 = c9797g2;
                c8471h3 = c8471h2;
                interfaceC2052l3 = interfaceC2052l2;
                c7218l3 = c7218l1111;
                abstractC0696b3 = abstractC0696b2;
                j19 = j15;
                c9798h3 = c9798h2;
                j20 = j17;
                i44 = i43;
                j21 = j14;
                j22 = j16;
                C8476m c8476m1111 = c8476m2;
                i45 = i42;
                c8476m3 = c8476m1111;
            }
            c5332q0M1612T = composerImplMo1636j.m1612T();
            if (c5332q0M1612T == null) {
                return;
            }
            c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.material3.TextKt$Text$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // cm.InterfaceC2056p
                /* JADX INFO: renamed from: m0 */
                public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                    num.intValue();
                    TextKt.m1576c(str, interfaceC0500b3, j21, j19, c8471h3, c8476m3, abstractC0696b3, j22, c9798h3, c9797g3, j20, i45, z14, i44, interfaceC2052l3, c7218l3, interfaceC0476a2, i12 | 1, i13, i14);
                    return C9072e.f47360a;
                }
            };
        }
        i37 |= 3072;
        i41 = i14 & 16384;
        if (i41 != 0) {
            if ((i13 & 57344) == 0) {
                i37 |= composerImplMo1636j.mo1665y(interfaceC2052l) ? 16384 : 8192;
            }
            if ((i13 & 458752) != 0) {
                if ((i14 & 32768) == 0) {
                    i46 = 65536;
                } else {
                    i46 = 65536;
                }
                i37 |= i46;
            }
            if ((i15 & 1533916891) != 306783378) {
                composerImplMo1636j.m1654s0();
                if ((i12 & 1) != 0) {
                    if (i47 != 0) {
                        interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                    } else {
                        interfaceC0500b2 = interfaceC0500b;
                    }
                    if (i16 != 0) {
                        j14 = C9169u.f47703f;
                    } else {
                        j14 = j10;
                    }
                    if (i18 != 0) {
                        j15 = C10023k.f50982c;
                    } else {
                        j15 = j11;
                    }
                    if (i20 != 0) {
                        c8471h2 = null;
                    } else {
                        c8471h2 = c8471h;
                    }
                    if (i22 != 0) {
                        c8476m2 = null;
                    } else {
                        c8476m2 = c8476m;
                    }
                    if (i24 != 0) {
                        abstractC0696b2 = null;
                    } else {
                        abstractC0696b2 = abstractC0696b;
                    }
                    if (i26 != 0) {
                        j16 = C10023k.f50982c;
                    } else {
                        j16 = j12;
                    }
                    if (i28 != 0) {
                        c9798h2 = null;
                    } else {
                        c9798h2 = c9798h;
                    }
                    if (i30 == 0) {
                    }
                    if (i32 != 0) {
                        j17 = C10023k.f50982c;
                    } else {
                        j17 = j13;
                    }
                    if (i35 != 0) {
                        i42 = 1;
                    } else {
                        i42 = i10;
                    }
                    if (i38 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    if (i40 != 0) {
                        i43 = Integer.MAX_VALUE;
                    } else {
                        i43 = i11;
                    }
                    if (i41 != 0) {
                        interfaceC2052l2 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.material3.TextKt$Text$1
                            @Override // cm.InterfaceC2052l
                            /* JADX INFO: renamed from: n */
                            public final C9072e mo528n(C7216j c7216j) {
                                C5207g.m11111f(c7216j, "it");
                                return C9072e.f47360a;
                            }
                        };
                    } else {
                        interfaceC2052l2 = interfaceC2052l;
                    }
                    if ((i14 & 32768) != 0) {
                        c7218l2 = (C7218l) composerImplMo1636j.mo1648p(f2808a);
                        i37 &= -458753;
                    } else {
                        c7218l2 = c7218l;
                    }
                } else {
                    if (i47 != 0) {
                        interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                    } else {
                        interfaceC0500b2 = interfaceC0500b;
                    }
                    if (i16 != 0) {
                        j14 = C9169u.f47703f;
                    } else {
                        j14 = j10;
                    }
                    if (i18 != 0) {
                        j15 = C10023k.f50982c;
                    } else {
                        j15 = j11;
                    }
                    if (i20 != 0) {
                        c8471h2 = null;
                    } else {
                        c8471h2 = c8471h;
                    }
                    if (i22 != 0) {
                        c8476m2 = null;
                    } else {
                        c8476m2 = c8476m;
                    }
                    if (i24 != 0) {
                        abstractC0696b2 = null;
                    } else {
                        abstractC0696b2 = abstractC0696b;
                    }
                    if (i26 != 0) {
                        j16 = C10023k.f50982c;
                    } else {
                        j16 = j12;
                    }
                    if (i28 != 0) {
                        c9798h2 = null;
                    } else {
                        c9798h2 = c9798h;
                    }
                    if (i30 == 0) {
                    }
                    if (i32 != 0) {
                        j17 = C10023k.f50982c;
                    } else {
                        j17 = j13;
                    }
                    if (i35 != 0) {
                        i42 = 1;
                    } else {
                        i42 = i10;
                    }
                    if (i38 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    if (i40 != 0) {
                        i43 = Integer.MAX_VALUE;
                    } else {
                        i43 = i11;
                    }
                    if (i41 != 0) {
                        interfaceC2052l2 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.material3.TextKt$Text$1
                            @Override // cm.InterfaceC2052l
                            /* JADX INFO: renamed from: n */
                            public final C9072e mo528n(C7216j c7216j) {
                                C5207g.m11111f(c7216j, "it");
                                return C9072e.f47360a;
                            }
                        };
                    } else {
                        interfaceC2052l2 = interfaceC2052l;
                    }
                    if ((i14 & 32768) != 0) {
                        c7218l2 = (C7218l) composerImplMo1636j.mo1648p(f2808a);
                        i37 &= -458753;
                    } else {
                        c7218l2 = c7218l;
                    }
                }
                composerImplMo1636j.m1610R();
                InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q119 = ComposerKt.f3003a;
                composerImplMo1636j.mo1622c(79582607);
                j18 = C9169u.f47703f;
                if (j14 != j18) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (z12) {
                    jM14529b = j14;
                } else {
                    jM14529b = c7218l2.f40600a.m14529b();
                    if (jM14529b != j18) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (z13) {
                        jM14529b = ((C9169u) composerImplMo1636j.mo1648p(ContentColorKt.f2738a)).f47705a;
                    }
                }
                composerImplMo1636j.m1609Q(false);
                C7218l c7218l1112 = c7218l2;
                int i41111114 = (i15 & 112) | (i15 & 14) | ((i37 >> 3) & 7168);
                int i41111115 = i37 << 9;
                BasicTextKt.m1532c(str, interfaceC0500b2, c7218l1112.m14544b(new C7218l(jM14529b, j15, c8476m2, c8471h2, abstractC0696b2, j16, c9798h2, c9797g2, j17, 175952)), interfaceC2052l2, i42, z11, i43, composerImplMo1636j, i41111114 | (i41111115 & 57344) | (i41111115 & 458752) | (i41111115 & 3670016), 0);
                interfaceC0500b3 = interfaceC0500b2;
                z14 = z11;
                c9797g3 = c9797g2;
                c8471h3 = c8471h2;
                interfaceC2052l3 = interfaceC2052l2;
                c7218l3 = c7218l1112;
                abstractC0696b3 = abstractC0696b2;
                j19 = j15;
                c9798h3 = c9798h2;
                j20 = j17;
                i44 = i43;
                j21 = j14;
                j22 = j16;
                C8476m c8476m1112 = c8476m2;
                i45 = i42;
                c8476m3 = c8476m1112;
            } else {
                composerImplMo1636j.m1654s0();
                if ((i12 & 1) != 0) {
                    if (i47 != 0) {
                        interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                    } else {
                        interfaceC0500b2 = interfaceC0500b;
                    }
                    if (i16 != 0) {
                        j14 = C9169u.f47703f;
                    } else {
                        j14 = j10;
                    }
                    if (i18 != 0) {
                        j15 = C10023k.f50982c;
                    } else {
                        j15 = j11;
                    }
                    if (i20 != 0) {
                        c8471h2 = null;
                    } else {
                        c8471h2 = c8471h;
                    }
                    if (i22 != 0) {
                        c8476m2 = null;
                    } else {
                        c8476m2 = c8476m;
                    }
                    if (i24 != 0) {
                        abstractC0696b2 = null;
                    } else {
                        abstractC0696b2 = abstractC0696b;
                    }
                    if (i26 != 0) {
                        j16 = C10023k.f50982c;
                    } else {
                        j16 = j12;
                    }
                    if (i28 != 0) {
                        c9798h2 = null;
                    } else {
                        c9798h2 = c9798h;
                    }
                    if (i30 == 0) {
                    }
                    if (i32 != 0) {
                        j17 = C10023k.f50982c;
                    } else {
                        j17 = j13;
                    }
                    if (i35 != 0) {
                        i42 = 1;
                    } else {
                        i42 = i10;
                    }
                    if (i38 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    if (i40 != 0) {
                        i43 = Integer.MAX_VALUE;
                    } else {
                        i43 = i11;
                    }
                    if (i41 != 0) {
                        interfaceC2052l2 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.material3.TextKt$Text$1
                            @Override // cm.InterfaceC2052l
                            /* JADX INFO: renamed from: n */
                            public final C9072e mo528n(C7216j c7216j) {
                                C5207g.m11111f(c7216j, "it");
                                return C9072e.f47360a;
                            }
                        };
                    } else {
                        interfaceC2052l2 = interfaceC2052l;
                    }
                    if ((i14 & 32768) != 0) {
                        c7218l2 = (C7218l) composerImplMo1636j.mo1648p(f2808a);
                        i37 &= -458753;
                    } else {
                        c7218l2 = c7218l;
                    }
                } else {
                    if (i47 != 0) {
                        interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                    } else {
                        interfaceC0500b2 = interfaceC0500b;
                    }
                    if (i16 != 0) {
                        j14 = C9169u.f47703f;
                    } else {
                        j14 = j10;
                    }
                    if (i18 != 0) {
                        j15 = C10023k.f50982c;
                    } else {
                        j15 = j11;
                    }
                    if (i20 != 0) {
                        c8471h2 = null;
                    } else {
                        c8471h2 = c8471h;
                    }
                    if (i22 != 0) {
                        c8476m2 = null;
                    } else {
                        c8476m2 = c8476m;
                    }
                    if (i24 != 0) {
                        abstractC0696b2 = null;
                    } else {
                        abstractC0696b2 = abstractC0696b;
                    }
                    if (i26 != 0) {
                        j16 = C10023k.f50982c;
                    } else {
                        j16 = j12;
                    }
                    if (i28 != 0) {
                        c9798h2 = null;
                    } else {
                        c9798h2 = c9798h;
                    }
                    if (i30 == 0) {
                    }
                    if (i32 != 0) {
                        j17 = C10023k.f50982c;
                    } else {
                        j17 = j13;
                    }
                    if (i35 != 0) {
                        i42 = 1;
                    } else {
                        i42 = i10;
                    }
                    if (i38 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    if (i40 != 0) {
                        i43 = Integer.MAX_VALUE;
                    } else {
                        i43 = i11;
                    }
                    if (i41 != 0) {
                        interfaceC2052l2 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.material3.TextKt$Text$1
                            @Override // cm.InterfaceC2052l
                            /* JADX INFO: renamed from: n */
                            public final C9072e mo528n(C7216j c7216j) {
                                C5207g.m11111f(c7216j, "it");
                                return C9072e.f47360a;
                            }
                        };
                    } else {
                        interfaceC2052l2 = interfaceC2052l;
                    }
                    if ((i14 & 32768) != 0) {
                        c7218l2 = (C7218l) composerImplMo1636j.mo1648p(f2808a);
                        i37 &= -458753;
                    } else {
                        c7218l2 = c7218l;
                    }
                }
                composerImplMo1636j.m1610R();
                InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q1110 = ComposerKt.f3003a;
                composerImplMo1636j.mo1622c(79582607);
                j18 = C9169u.f47703f;
                if (j14 != j18) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (z12) {
                    jM14529b = j14;
                } else {
                    jM14529b = c7218l2.f40600a.m14529b();
                    if (jM14529b != j18) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (z13) {
                        jM14529b = ((C9169u) composerImplMo1636j.mo1648p(ContentColorKt.f2738a)).f47705a;
                    }
                }
                composerImplMo1636j.m1609Q(false);
                C7218l c7218l1113 = c7218l2;
                int i41111116 = (i15 & 112) | (i15 & 14) | ((i37 >> 3) & 7168);
                int i41111117 = i37 << 9;
                BasicTextKt.m1532c(str, interfaceC0500b2, c7218l1113.m14544b(new C7218l(jM14529b, j15, c8476m2, c8471h2, abstractC0696b2, j16, c9798h2, c9797g2, j17, 175952)), interfaceC2052l2, i42, z11, i43, composerImplMo1636j, i41111116 | (i41111117 & 57344) | (i41111117 & 458752) | (i41111117 & 3670016), 0);
                interfaceC0500b3 = interfaceC0500b2;
                z14 = z11;
                c9797g3 = c9797g2;
                c8471h3 = c8471h2;
                interfaceC2052l3 = interfaceC2052l2;
                c7218l3 = c7218l1113;
                abstractC0696b3 = abstractC0696b2;
                j19 = j15;
                c9798h3 = c9798h2;
                j20 = j17;
                i44 = i43;
                j21 = j14;
                j22 = j16;
                C8476m c8476m1113 = c8476m2;
                i45 = i42;
                c8476m3 = c8476m1113;
            }
            c5332q0M1612T = composerImplMo1636j.m1612T();
            if (c5332q0M1612T == null) {
                return;
            }
            c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.material3.TextKt$Text$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // cm.InterfaceC2056p
                /* JADX INFO: renamed from: m0 */
                public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                    num.intValue();
                    TextKt.m1576c(str, interfaceC0500b3, j21, j19, c8471h3, c8476m3, abstractC0696b3, j22, c9798h3, c9797g3, j20, i45, z14, i44, interfaceC2052l3, c7218l3, interfaceC0476a2, i12 | 1, i13, i14);
                    return C9072e.f47360a;
                }
            };
        }
        i37 |= 24576;
        if ((i13 & 458752) != 0) {
            if ((i14 & 32768) == 0) {
                i46 = 65536;
            } else {
                i46 = 65536;
            }
            i37 |= i46;
        }
        if ((i15 & 1533916891) != 306783378) {
            composerImplMo1636j.m1654s0();
            if ((i12 & 1) != 0) {
                if (i47 != 0) {
                    interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                } else {
                    interfaceC0500b2 = interfaceC0500b;
                }
                if (i16 != 0) {
                    j14 = C9169u.f47703f;
                } else {
                    j14 = j10;
                }
                if (i18 != 0) {
                    j15 = C10023k.f50982c;
                } else {
                    j15 = j11;
                }
                if (i20 != 0) {
                    c8471h2 = null;
                } else {
                    c8471h2 = c8471h;
                }
                if (i22 != 0) {
                    c8476m2 = null;
                } else {
                    c8476m2 = c8476m;
                }
                if (i24 != 0) {
                    abstractC0696b2 = null;
                } else {
                    abstractC0696b2 = abstractC0696b;
                }
                if (i26 != 0) {
                    j16 = C10023k.f50982c;
                } else {
                    j16 = j12;
                }
                if (i28 != 0) {
                    c9798h2 = null;
                } else {
                    c9798h2 = c9798h;
                }
                if (i30 == 0) {
                }
                if (i32 != 0) {
                    j17 = C10023k.f50982c;
                } else {
                    j17 = j13;
                }
                if (i35 != 0) {
                    i42 = 1;
                } else {
                    i42 = i10;
                }
                if (i38 != 0) {
                    z11 = true;
                } else {
                    z11 = z10;
                }
                if (i40 != 0) {
                    i43 = Integer.MAX_VALUE;
                } else {
                    i43 = i11;
                }
                if (i41 != 0) {
                    interfaceC2052l2 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.material3.TextKt$Text$1
                        @Override // cm.InterfaceC2052l
                        /* JADX INFO: renamed from: n */
                        public final C9072e mo528n(C7216j c7216j) {
                            C5207g.m11111f(c7216j, "it");
                            return C9072e.f47360a;
                        }
                    };
                } else {
                    interfaceC2052l2 = interfaceC2052l;
                }
                if ((i14 & 32768) != 0) {
                    c7218l2 = (C7218l) composerImplMo1636j.mo1648p(f2808a);
                    i37 &= -458753;
                } else {
                    c7218l2 = c7218l;
                }
            } else {
                if (i47 != 0) {
                    interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                } else {
                    interfaceC0500b2 = interfaceC0500b;
                }
                if (i16 != 0) {
                    j14 = C9169u.f47703f;
                } else {
                    j14 = j10;
                }
                if (i18 != 0) {
                    j15 = C10023k.f50982c;
                } else {
                    j15 = j11;
                }
                if (i20 != 0) {
                    c8471h2 = null;
                } else {
                    c8471h2 = c8471h;
                }
                if (i22 != 0) {
                    c8476m2 = null;
                } else {
                    c8476m2 = c8476m;
                }
                if (i24 != 0) {
                    abstractC0696b2 = null;
                } else {
                    abstractC0696b2 = abstractC0696b;
                }
                if (i26 != 0) {
                    j16 = C10023k.f50982c;
                } else {
                    j16 = j12;
                }
                if (i28 != 0) {
                    c9798h2 = null;
                } else {
                    c9798h2 = c9798h;
                }
                if (i30 == 0) {
                }
                if (i32 != 0) {
                    j17 = C10023k.f50982c;
                } else {
                    j17 = j13;
                }
                if (i35 != 0) {
                    i42 = 1;
                } else {
                    i42 = i10;
                }
                if (i38 != 0) {
                    z11 = true;
                } else {
                    z11 = z10;
                }
                if (i40 != 0) {
                    i43 = Integer.MAX_VALUE;
                } else {
                    i43 = i11;
                }
                if (i41 != 0) {
                    interfaceC2052l2 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.material3.TextKt$Text$1
                        @Override // cm.InterfaceC2052l
                        /* JADX INFO: renamed from: n */
                        public final C9072e mo528n(C7216j c7216j) {
                            C5207g.m11111f(c7216j, "it");
                            return C9072e.f47360a;
                        }
                    };
                } else {
                    interfaceC2052l2 = interfaceC2052l;
                }
                if ((i14 & 32768) != 0) {
                    c7218l2 = (C7218l) composerImplMo1636j.mo1648p(f2808a);
                    i37 &= -458753;
                } else {
                    c7218l2 = c7218l;
                }
            }
            composerImplMo1636j.m1610R();
            InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q1111 = ComposerKt.f3003a;
            composerImplMo1636j.mo1622c(79582607);
            j18 = C9169u.f47703f;
            if (j14 != j18) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12) {
                jM14529b = j14;
            } else {
                jM14529b = c7218l2.f40600a.m14529b();
                if (jM14529b != j18) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (z13) {
                    jM14529b = ((C9169u) composerImplMo1636j.mo1648p(ContentColorKt.f2738a)).f47705a;
                }
            }
            composerImplMo1636j.m1609Q(false);
            C7218l c7218l1114 = c7218l2;
            int i41111118 = (i15 & 112) | (i15 & 14) | ((i37 >> 3) & 7168);
            int i41111119 = i37 << 9;
            BasicTextKt.m1532c(str, interfaceC0500b2, c7218l1114.m14544b(new C7218l(jM14529b, j15, c8476m2, c8471h2, abstractC0696b2, j16, c9798h2, c9797g2, j17, 175952)), interfaceC2052l2, i42, z11, i43, composerImplMo1636j, i41111118 | (i41111119 & 57344) | (i41111119 & 458752) | (i41111119 & 3670016), 0);
            interfaceC0500b3 = interfaceC0500b2;
            z14 = z11;
            c9797g3 = c9797g2;
            c8471h3 = c8471h2;
            interfaceC2052l3 = interfaceC2052l2;
            c7218l3 = c7218l1114;
            abstractC0696b3 = abstractC0696b2;
            j19 = j15;
            c9798h3 = c9798h2;
            j20 = j17;
            i44 = i43;
            j21 = j14;
            j22 = j16;
            C8476m c8476m1114 = c8476m2;
            i45 = i42;
            c8476m3 = c8476m1114;
        } else {
            composerImplMo1636j.m1654s0();
            if ((i12 & 1) != 0) {
                if (i47 != 0) {
                    interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                } else {
                    interfaceC0500b2 = interfaceC0500b;
                }
                if (i16 != 0) {
                    j14 = C9169u.f47703f;
                } else {
                    j14 = j10;
                }
                if (i18 != 0) {
                    j15 = C10023k.f50982c;
                } else {
                    j15 = j11;
                }
                if (i20 != 0) {
                    c8471h2 = null;
                } else {
                    c8471h2 = c8471h;
                }
                if (i22 != 0) {
                    c8476m2 = null;
                } else {
                    c8476m2 = c8476m;
                }
                if (i24 != 0) {
                    abstractC0696b2 = null;
                } else {
                    abstractC0696b2 = abstractC0696b;
                }
                if (i26 != 0) {
                    j16 = C10023k.f50982c;
                } else {
                    j16 = j12;
                }
                if (i28 != 0) {
                    c9798h2 = null;
                } else {
                    c9798h2 = c9798h;
                }
                if (i30 == 0) {
                }
                if (i32 != 0) {
                    j17 = C10023k.f50982c;
                } else {
                    j17 = j13;
                }
                if (i35 != 0) {
                    i42 = 1;
                } else {
                    i42 = i10;
                }
                if (i38 != 0) {
                    z11 = true;
                } else {
                    z11 = z10;
                }
                if (i40 != 0) {
                    i43 = Integer.MAX_VALUE;
                } else {
                    i43 = i11;
                }
                if (i41 != 0) {
                    interfaceC2052l2 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.material3.TextKt$Text$1
                        @Override // cm.InterfaceC2052l
                        /* JADX INFO: renamed from: n */
                        public final C9072e mo528n(C7216j c7216j) {
                            C5207g.m11111f(c7216j, "it");
                            return C9072e.f47360a;
                        }
                    };
                } else {
                    interfaceC2052l2 = interfaceC2052l;
                }
                if ((i14 & 32768) != 0) {
                    c7218l2 = (C7218l) composerImplMo1636j.mo1648p(f2808a);
                    i37 &= -458753;
                } else {
                    c7218l2 = c7218l;
                }
            } else {
                if (i47 != 0) {
                    interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                } else {
                    interfaceC0500b2 = interfaceC0500b;
                }
                if (i16 != 0) {
                    j14 = C9169u.f47703f;
                } else {
                    j14 = j10;
                }
                if (i18 != 0) {
                    j15 = C10023k.f50982c;
                } else {
                    j15 = j11;
                }
                if (i20 != 0) {
                    c8471h2 = null;
                } else {
                    c8471h2 = c8471h;
                }
                if (i22 != 0) {
                    c8476m2 = null;
                } else {
                    c8476m2 = c8476m;
                }
                if (i24 != 0) {
                    abstractC0696b2 = null;
                } else {
                    abstractC0696b2 = abstractC0696b;
                }
                if (i26 != 0) {
                    j16 = C10023k.f50982c;
                } else {
                    j16 = j12;
                }
                if (i28 != 0) {
                    c9798h2 = null;
                } else {
                    c9798h2 = c9798h;
                }
                if (i30 == 0) {
                }
                if (i32 != 0) {
                    j17 = C10023k.f50982c;
                } else {
                    j17 = j13;
                }
                if (i35 != 0) {
                    i42 = 1;
                } else {
                    i42 = i10;
                }
                if (i38 != 0) {
                    z11 = true;
                } else {
                    z11 = z10;
                }
                if (i40 != 0) {
                    i43 = Integer.MAX_VALUE;
                } else {
                    i43 = i11;
                }
                if (i41 != 0) {
                    interfaceC2052l2 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.material3.TextKt$Text$1
                        @Override // cm.InterfaceC2052l
                        /* JADX INFO: renamed from: n */
                        public final C9072e mo528n(C7216j c7216j) {
                            C5207g.m11111f(c7216j, "it");
                            return C9072e.f47360a;
                        }
                    };
                } else {
                    interfaceC2052l2 = interfaceC2052l;
                }
                if ((i14 & 32768) != 0) {
                    c7218l2 = (C7218l) composerImplMo1636j.mo1648p(f2808a);
                    i37 &= -458753;
                } else {
                    c7218l2 = c7218l;
                }
            }
            composerImplMo1636j.m1610R();
            InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q1112 = ComposerKt.f3003a;
            composerImplMo1636j.mo1622c(79582607);
            j18 = C9169u.f47703f;
            if (j14 != j18) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12) {
                jM14529b = j14;
            } else {
                jM14529b = c7218l2.f40600a.m14529b();
                if (jM14529b != j18) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (z13) {
                    jM14529b = ((C9169u) composerImplMo1636j.mo1648p(ContentColorKt.f2738a)).f47705a;
                }
            }
            composerImplMo1636j.m1609Q(false);
            C7218l c7218l1115 = c7218l2;
            int i411111110 = (i15 & 112) | (i15 & 14) | ((i37 >> 3) & 7168);
            int i411111111 = i37 << 9;
            BasicTextKt.m1532c(str, interfaceC0500b2, c7218l1115.m14544b(new C7218l(jM14529b, j15, c8476m2, c8471h2, abstractC0696b2, j16, c9798h2, c9797g2, j17, 175952)), interfaceC2052l2, i42, z11, i43, composerImplMo1636j, i411111110 | (i411111111 & 57344) | (i411111111 & 458752) | (i411111111 & 3670016), 0);
            interfaceC0500b3 = interfaceC0500b2;
            z14 = z11;
            c9797g3 = c9797g2;
            c8471h3 = c8471h2;
            interfaceC2052l3 = interfaceC2052l2;
            c7218l3 = c7218l1115;
            abstractC0696b3 = abstractC0696b2;
            j19 = j15;
            c9798h3 = c9798h2;
            j20 = j17;
            i44 = i43;
            j21 = j14;
            j22 = j16;
            C8476m c8476m1115 = c8476m2;
            i45 = i42;
            c8476m3 = c8476m1115;
        }
        c5332q0M1612T = composerImplMo1636j.m1612T();
        if (c5332q0M1612T == null) {
            return;
        }
        c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.material3.TextKt$Text$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // cm.InterfaceC2056p
            /* JADX INFO: renamed from: m0 */
            public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                num.intValue();
                TextKt.m1576c(str, interfaceC0500b3, j21, j19, c8471h3, c8476m3, abstractC0696b3, j22, c9798h3, c9797g3, j20, i45, z14, i44, interfaceC2052l3, c7218l3, interfaceC0476a2, i12 | 1, i13, i14);
                return C9072e.f47360a;
            }
        };
    }
}
