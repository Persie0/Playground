package com.lingq.p055ui.commons.status;

import androidx.compose.material3.ColorSchemeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p017ui.InterfaceC0500b;
import androidx.compose.p017ui.text.C0689a;
import androidx.compose.p017ui.text.font.AbstractC0696b;
import androidx.compose.runtime.C0480e;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.InterfaceC0476a;
import cm.InterfaceC2056p;
import cm.InterfaceC2057q;
import com.kochava.tracker.BuildConfig;
import com.lingq.p055ui.theme.CustomColorSchemeKt;
import dm.C5207g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.text.C7076b;
import mo.C7661i;
import p036c0.C1648d;
import p081e0.C5332q0;
import p081e0.InterfaceC5299c;
import p081e0.InterfaceC5336s0;
import p231l1.C7214h;
import p231l1.C7218l;
import p328q1.C8471h;
import p328q1.C8472i;
import p328q1.C8476m;
import p338qd.C8573r0;
import p376s1.C8948d;
import p385sf.C9000b;
import p387t0.C9152j0;
import p387t0.C9169u;
import p445w1.C9791a;
import p445w1.C9797g;
import p445w1.C9798h;
import p445w1.C9800j;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
public final class MatchingTextKt {
    /* JADX WARN: Code duplicated, block: B:100:0x0126  */
    /* JADX WARN: Code duplicated, block: B:101:0x0129  */
    /* JADX WARN: Code duplicated, block: B:104:0x012e  */
    /* JADX WARN: Code duplicated, block: B:106:0x013b  */
    /* JADX WARN: Code duplicated, block: B:109:0x0141  */
    /* JADX WARN: Code duplicated, block: B:112:0x0156  */
    /* JADX WARN: Code duplicated, block: B:116:0x018d  */
    /* JADX WARN: Code duplicated, block: B:118:0x019b  */
    /* JADX WARN: Code duplicated, block: B:123:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:125:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:130:0x01db  */
    /* JADX WARN: Code duplicated, block: B:132:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:134:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:135:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:137:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:140:0x023b A[Catch: all -> 0x0244, TryCatch #0 {all -> 0x0244, blocks: (B:138:0x0232, B:140:0x023b, B:141:0x023e), top: B:164:0x0232 }] */
    /* JADX WARN: Code duplicated, block: B:146:0x0249  */
    /* JADX WARN: Code duplicated, block: B:149:0x028d A[Catch: all -> 0x029d, TryCatch #1 {all -> 0x029d, blocks: (B:147:0x0284, B:149:0x028d, B:150:0x0290), top: B:166:0x0284 }] */
    /* JADX WARN: Code duplicated, block: B:162:0x02f8  */
    /* JADX WARN: Code duplicated, block: B:170:0x019e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:173:0x01cd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:175:0x02a2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:178:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x0078  */
    /* JADX WARN: Code duplicated, block: B:39:0x007c  */
    /* JADX WARN: Code duplicated, block: B:41:0x0084  */
    /* JADX WARN: Code duplicated, block: B:42:0x0089  */
    /* JADX WARN: Code duplicated, block: B:45:0x008f  */
    /* JADX WARN: Code duplicated, block: B:48:0x0097  */
    /* JADX WARN: Code duplicated, block: B:50:0x009b  */
    /* JADX WARN: Code duplicated, block: B:52:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:53:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:56:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:59:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:60:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:64:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:65:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:69:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:70:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:75:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:83:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:85:0x0105  */
    /* JADX WARN: Code duplicated, block: B:99:0x0124 A[DONT_INVERT] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static final void m9749a(InterfaceC0500b interfaceC0500b, C7218l c7218l, C9797g c9797g, long j10, long j11, final String str, final String str2, InterfaceC0476a interfaceC0476a, final int i10, final int i11) throws Throwable {
        InterfaceC0500b interfaceC0500b2;
        int i12;
        C7218l c7218l2;
        C9797g c9797g2;
        long jM5355n;
        long j12;
        int i13;
        int i14;
        final InterfaceC0500b interfaceC0500b3;
        long j13;
        C0689a.a aVar;
        ArrayList arrayList;
        ArrayList arrayList2;
        Iterator it;
        int i15;
        final C7218l c7218l3;
        final C9797g c9797g3;
        final long j14;
        final long j15;
        Object next;
        int i16;
        String str3;
        boolean zM15249O2;
        int iM2570d;
        int iM2570d2;
        C5332q0 c5332q0M1612T;
        C5207g.m11111f(str, "originalText");
        C5207g.m11111f(str2, "matchingText");
        ComposerImpl composerImplMo1636j = interfaceC0476a.mo1636j(1112219829);
        int i17 = i11 & 1;
        if (i17 != 0) {
            i12 = i10 | 6;
            interfaceC0500b2 = interfaceC0500b;
        } else if ((i10 & 14) == 0) {
            interfaceC0500b2 = interfaceC0500b;
            i12 = (composerImplMo1636j.mo1665y(interfaceC0500b2) ? 4 : 2) | i10;
        } else {
            interfaceC0500b2 = interfaceC0500b;
            i12 = i10;
        }
        if ((i10 & 112) == 0) {
            if ((i11 & 2) == 0) {
                c7218l2 = c7218l;
                int i18 = composerImplMo1636j.mo1665y(c7218l2) ? 32 : 16;
                i12 |= i18;
            } else {
                c7218l2 = c7218l;
            }
            i12 |= i18;
        } else {
            c7218l2 = c7218l;
        }
        int i19 = i11 & 4;
        if (i19 == 0) {
            if ((i10 & 896) == 0) {
                c9797g2 = c9797g;
                i12 |= composerImplMo1636j.mo1665y(c9797g2) ? 256 : BuildConfig.SDK_TRUNCATE_LENGTH;
            }
            if ((i10 & 7168) == 0) {
                if ((i11 & 8) == 0) {
                    jM5355n = j10;
                    int i20 = composerImplMo1636j.m1596F(jM5355n) ? 2048 : 1024;
                    i12 |= i20;
                } else {
                    jM5355n = j10;
                }
                i12 |= i20;
            } else {
                jM5355n = j10;
            }
            if ((57344 & i10) == 0) {
                if ((i11 & 16) == 0) {
                    j12 = j11;
                    int i21 = composerImplMo1636j.m1596F(j12) ? 16384 : 8192;
                    i12 |= i21;
                } else {
                    j12 = j11;
                }
                i12 |= i21;
            } else {
                j12 = j11;
            }
            if ((i11 & 32) != 0) {
                if ((458752 & i10) == 0) {
                    if (composerImplMo1636j.mo1665y(str)) {
                        i13 = 131072;
                    } else {
                        i13 = 65536;
                    }
                }
                if ((i11 & 64) != 0) {
                    if ((i10 & 3670016) == 0) {
                        if (composerImplMo1636j.mo1665y(str2)) {
                            i14 = 1048576;
                        } else {
                            i14 = 524288;
                        }
                    }
                    if ((2995931 & i12) == 599186 || !composerImplMo1636j.mo1642m()) {
                        composerImplMo1636j.m1654s0();
                        if ((i10 & 1) != 0 || composerImplMo1636j.m1616X()) {
                            if (i17 != 0) {
                                interfaceC0500b3 = InterfaceC0500b.a.f3325a;
                            } else {
                                interfaceC0500b3 = interfaceC0500b2;
                            }
                            if ((i11 & 2) != 0) {
                                i12 &= -113;
                                c7218l2 = (C7218l) composerImplMo1636j.mo1648p(TextKt.f2808a);
                            }
                            if (i19 != 0) {
                                c9797g2 = null;
                            }
                            if ((i11 & 8) != 0) {
                                InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q = ComposerKt.f3003a;
                                jM5355n = ((C1648d) composerImplMo1636j.mo1648p(ColorSchemeKt.f2735a)).m5355n();
                                i12 &= -7169;
                            }
                            if ((i11 & 16) != 0) {
                                j12 = ((C9169u) CustomColorSchemeKt.m10359a(composerImplMo1636j).f33945g.getValue()).f47705a;
                                i12 &= -57345;
                            }
                        } else {
                            composerImplMo1636j.mo1650q();
                            if ((i11 & 2) != 0) {
                                i12 &= -113;
                            }
                            if ((i11 & 8) != 0) {
                                i12 &= -7169;
                            }
                            if ((i11 & 16) != 0) {
                                i12 &= -57345;
                            }
                            interfaceC0500b3 = interfaceC0500b2;
                        }
                        int i22 = i12;
                        j13 = j12;
                        composerImplMo1636j.m1610R();
                        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q2 = ComposerKt.f3003a;
                        aVar = new C0689a.a();
                        List listM14299s3 = C7076b.m14299s3(str, new String[]{" "}, 0, 6);
                        arrayList = new ArrayList();
                        for (Object obj : listM14299s3) {
                            if (!C7661i.m15250P2((String) obj)) {
                                arrayList.add(obj);
                            }
                        }
                        List listM14299s4 = C7076b.m14299s3(str2, new String[]{" "}, 0, 6);
                        arrayList2 = new ArrayList();
                        for (Object obj2 : listM14299s4) {
                            if (!C7661i.m15250P2((String) obj2)) {
                                arrayList2.add(obj2);
                            }
                        }
                        it = arrayList.iterator();
                        i15 = 0;
                        while (it.hasNext()) {
                            next = it.next();
                            i16 = i15 + 1;
                            if (i15 < 0) {
                                C9000b.m17257w();
                                throw null;
                            }
                            Iterator it2 = it;
                            str3 = (String) next;
                            if (i15 <= C9000b.m17249o(arrayList2)) {
                                zM15249O2 = C7661i.m15249O2(str3, (String) arrayList2.get(i15));
                            } else {
                                zM15249O2 = false;
                            }
                            if (zM15249O2) {
                                iM2570d2 = aVar.m2570d(new C7214h(jM5355n, 0L, (C8476m) null, (C8471h) null, (C8472i) null, (AbstractC0696b) null, (String) null, 0L, (C9791a) null, (C9800j) null, (C8948d) null, 0L, (C9798h) null, (C9152j0) null, 16382));
                                try {
                                    aVar.m2568b(str3);
                                    if (i15 != C9000b.m17249o(arrayList)) {
                                        aVar.m2568b(" ");
                                    }
                                    C9072e c9072e = C9072e.f47360a;
                                    aVar.m2569c(iM2570d2);
                                } catch (Throwable th2) {
                                    aVar.m2569c(iM2570d2);
                                    throw th2;
                                }
                            } else {
                                iM2570d = aVar.m2570d(new C7214h(j13, 0L, (C8476m) null, (C8471h) null, (C8472i) null, (AbstractC0696b) null, (String) null, 0L, (C9791a) null, (C9800j) null, (C8948d) null, 0L, (C9798h) null, (C9152j0) null, 16382));
                                try {
                                    aVar.m2568b(str3);
                                    if (i15 != C9000b.m17249o(arrayList)) {
                                        aVar.m2568b(" ");
                                    }
                                    C9072e c9072e2 = C9072e.f47360a;
                                    aVar.m2569c(iM2570d);
                                } catch (Throwable th3) {
                                    aVar.m2569c(iM2570d);
                                    throw th3;
                                }
                            }
                            it = it2;
                            i15 = i16;
                        }
                        TextKt.m1575b(aVar.m2571e(), interfaceC0500b3, 0L, 0L, null, null, null, 0L, null, c9797g2, 0L, 0, false, 0, null, null, c7218l2, composerImplMo1636j, ((i22 << 3) & 112) | ((i22 << 21) & 1879048192), (i22 << 15) & 3670016, 65020);
                        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q3 = ComposerKt.f3003a;
                        c7218l3 = c7218l2;
                        c9797g3 = c9797g2;
                        j14 = jM5355n;
                        j15 = j13;
                    } else {
                        composerImplMo1636j.mo1650q();
                        interfaceC0500b3 = interfaceC0500b2;
                        c7218l3 = c7218l2;
                        c9797g3 = c9797g2;
                        j14 = jM5355n;
                        j15 = j12;
                    }
                    c5332q0M1612T = composerImplMo1636j.m1612T();
                    if (c5332q0M1612T == null) {
                        return;
                    }
                    c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: com.lingq.ui.commons.status.MatchingTextKt$MatchingText$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) throws Throwable {
                            num.intValue();
                            MatchingTextKt.m9749a(interfaceC0500b3, c7218l3, c9797g3, j14, j15, str, str2, interfaceC0476a2, C8573r0.m16737l1(i10 | 1), i11);
                            return C9072e.f47360a;
                        }
                    };
                }
                i14 = 1572864;
                i12 |= i14;
                if ((2995931 & i12) == 599186) {
                    composerImplMo1636j.m1654s0();
                    if ((i10 & 1) != 0) {
                        if (i17 != 0) {
                            interfaceC0500b3 = InterfaceC0500b.a.f3325a;
                        } else {
                            interfaceC0500b3 = interfaceC0500b2;
                        }
                        if ((i11 & 2) != 0) {
                            i12 &= -113;
                            c7218l2 = (C7218l) composerImplMo1636j.mo1648p(TextKt.f2808a);
                        }
                        if (i19 != 0) {
                            c9797g2 = null;
                        }
                        if ((i11 & 8) != 0) {
                            InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q4 = ComposerKt.f3003a;
                            jM5355n = ((C1648d) composerImplMo1636j.mo1648p(ColorSchemeKt.f2735a)).m5355n();
                            i12 &= -7169;
                        }
                        if ((i11 & 16) != 0) {
                            j12 = ((C9169u) CustomColorSchemeKt.m10359a(composerImplMo1636j).f33945g.getValue()).f47705a;
                            i12 &= -57345;
                        }
                    } else {
                        if (i17 != 0) {
                            interfaceC0500b3 = InterfaceC0500b.a.f3325a;
                        } else {
                            interfaceC0500b3 = interfaceC0500b2;
                        }
                        if ((i11 & 2) != 0) {
                            i12 &= -113;
                            c7218l2 = (C7218l) composerImplMo1636j.mo1648p(TextKt.f2808a);
                        }
                        if (i19 != 0) {
                            c9797g2 = null;
                        }
                        if ((i11 & 8) != 0) {
                            InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q5 = ComposerKt.f3003a;
                            jM5355n = ((C1648d) composerImplMo1636j.mo1648p(ColorSchemeKt.f2735a)).m5355n();
                            i12 &= -7169;
                        }
                        if ((i11 & 16) != 0) {
                            j12 = ((C9169u) CustomColorSchemeKt.m10359a(composerImplMo1636j).f33945g.getValue()).f47705a;
                            i12 &= -57345;
                        }
                    }
                    int i23 = i12;
                    j13 = j12;
                    composerImplMo1636j.m1610R();
                    InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q6 = ComposerKt.f3003a;
                    aVar = new C0689a.a();
                    List listM14299s5 = C7076b.m14299s3(str, new String[]{" "}, 0, 6);
                    arrayList = new ArrayList();
                    while (r14.hasNext()) {
                        if (!C7661i.m15250P2((String) obj)) {
                            arrayList.add(obj);
                        }
                    }
                    List listM14299s6 = C7076b.m14299s3(str2, new String[]{" "}, 0, 6);
                    arrayList2 = new ArrayList();
                    while (r14.hasNext()) {
                        if (!C7661i.m15250P2((String) obj2)) {
                            arrayList2.add(obj2);
                        }
                    }
                    it = arrayList.iterator();
                    i15 = 0;
                    while (it.hasNext()) {
                        next = it.next();
                        i16 = i15 + 1;
                        if (i15 < 0) {
                            C9000b.m17257w();
                            throw null;
                        }
                        Iterator it3 = it;
                        str3 = (String) next;
                        if (i15 <= C9000b.m17249o(arrayList2)) {
                            zM15249O2 = C7661i.m15249O2(str3, (String) arrayList2.get(i15));
                        } else {
                            zM15249O2 = false;
                        }
                        if (zM15249O2) {
                            iM2570d2 = aVar.m2570d(new C7214h(jM5355n, 0L, (C8476m) null, (C8471h) null, (C8472i) null, (AbstractC0696b) null, (String) null, 0L, (C9791a) null, (C9800j) null, (C8948d) null, 0L, (C9798h) null, (C9152j0) null, 16382));
                            aVar.m2568b(str3);
                            if (i15 != C9000b.m17249o(arrayList)) {
                                aVar.m2568b(" ");
                            }
                            C9072e c9072e3 = C9072e.f47360a;
                            aVar.m2569c(iM2570d2);
                        } else {
                            iM2570d = aVar.m2570d(new C7214h(j13, 0L, (C8476m) null, (C8471h) null, (C8472i) null, (AbstractC0696b) null, (String) null, 0L, (C9791a) null, (C9800j) null, (C8948d) null, 0L, (C9798h) null, (C9152j0) null, 16382));
                            aVar.m2568b(str3);
                            if (i15 != C9000b.m17249o(arrayList)) {
                                aVar.m2568b(" ");
                            }
                            C9072e c9072e4 = C9072e.f47360a;
                            aVar.m2569c(iM2570d);
                        }
                        it = it3;
                        i15 = i16;
                    }
                    TextKt.m1575b(aVar.m2571e(), interfaceC0500b3, 0L, 0L, null, null, null, 0L, null, c9797g2, 0L, 0, false, 0, null, null, c7218l2, composerImplMo1636j, ((i23 << 3) & 112) | ((i23 << 21) & 1879048192), (i23 << 15) & 3670016, 65020);
                    InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q7 = ComposerKt.f3003a;
                    c7218l3 = c7218l2;
                    c9797g3 = c9797g2;
                    j14 = jM5355n;
                    j15 = j13;
                } else {
                    composerImplMo1636j.m1654s0();
                    if ((i10 & 1) != 0) {
                        if (i17 != 0) {
                            interfaceC0500b3 = InterfaceC0500b.a.f3325a;
                        } else {
                            interfaceC0500b3 = interfaceC0500b2;
                        }
                        if ((i11 & 2) != 0) {
                            i12 &= -113;
                            c7218l2 = (C7218l) composerImplMo1636j.mo1648p(TextKt.f2808a);
                        }
                        if (i19 != 0) {
                            c9797g2 = null;
                        }
                        if ((i11 & 8) != 0) {
                            InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q8 = ComposerKt.f3003a;
                            jM5355n = ((C1648d) composerImplMo1636j.mo1648p(ColorSchemeKt.f2735a)).m5355n();
                            i12 &= -7169;
                        }
                        if ((i11 & 16) != 0) {
                            j12 = ((C9169u) CustomColorSchemeKt.m10359a(composerImplMo1636j).f33945g.getValue()).f47705a;
                            i12 &= -57345;
                        }
                    } else {
                        if (i17 != 0) {
                            interfaceC0500b3 = InterfaceC0500b.a.f3325a;
                        } else {
                            interfaceC0500b3 = interfaceC0500b2;
                        }
                        if ((i11 & 2) != 0) {
                            i12 &= -113;
                            c7218l2 = (C7218l) composerImplMo1636j.mo1648p(TextKt.f2808a);
                        }
                        if (i19 != 0) {
                            c9797g2 = null;
                        }
                        if ((i11 & 8) != 0) {
                            InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q9 = ComposerKt.f3003a;
                            jM5355n = ((C1648d) composerImplMo1636j.mo1648p(ColorSchemeKt.f2735a)).m5355n();
                            i12 &= -7169;
                        }
                        if ((i11 & 16) != 0) {
                            j12 = ((C9169u) CustomColorSchemeKt.m10359a(composerImplMo1636j).f33945g.getValue()).f47705a;
                            i12 &= -57345;
                        }
                    }
                    int i24 = i12;
                    j13 = j12;
                    composerImplMo1636j.m1610R();
                    InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q10 = ComposerKt.f3003a;
                    aVar = new C0689a.a();
                    List listM14299s7 = C7076b.m14299s3(str, new String[]{" "}, 0, 6);
                    arrayList = new ArrayList();
                    while (r14.hasNext()) {
                        if (!C7661i.m15250P2((String) obj)) {
                            arrayList.add(obj);
                        }
                    }
                    List listM14299s8 = C7076b.m14299s3(str2, new String[]{" "}, 0, 6);
                    arrayList2 = new ArrayList();
                    while (r14.hasNext()) {
                        if (!C7661i.m15250P2((String) obj2)) {
                            arrayList2.add(obj2);
                        }
                    }
                    it = arrayList.iterator();
                    i15 = 0;
                    while (it.hasNext()) {
                        next = it.next();
                        i16 = i15 + 1;
                        if (i15 < 0) {
                            C9000b.m17257w();
                            throw null;
                        }
                        Iterator it4 = it;
                        str3 = (String) next;
                        if (i15 <= C9000b.m17249o(arrayList2)) {
                            zM15249O2 = C7661i.m15249O2(str3, (String) arrayList2.get(i15));
                        } else {
                            zM15249O2 = false;
                        }
                        if (zM15249O2) {
                            iM2570d2 = aVar.m2570d(new C7214h(jM5355n, 0L, (C8476m) null, (C8471h) null, (C8472i) null, (AbstractC0696b) null, (String) null, 0L, (C9791a) null, (C9800j) null, (C8948d) null, 0L, (C9798h) null, (C9152j0) null, 16382));
                            aVar.m2568b(str3);
                            if (i15 != C9000b.m17249o(arrayList)) {
                                aVar.m2568b(" ");
                            }
                            C9072e c9072e5 = C9072e.f47360a;
                            aVar.m2569c(iM2570d2);
                        } else {
                            iM2570d = aVar.m2570d(new C7214h(j13, 0L, (C8476m) null, (C8471h) null, (C8472i) null, (AbstractC0696b) null, (String) null, 0L, (C9791a) null, (C9800j) null, (C8948d) null, 0L, (C9798h) null, (C9152j0) null, 16382));
                            aVar.m2568b(str3);
                            if (i15 != C9000b.m17249o(arrayList)) {
                                aVar.m2568b(" ");
                            }
                            C9072e c9072e6 = C9072e.f47360a;
                            aVar.m2569c(iM2570d);
                        }
                        it = it4;
                        i15 = i16;
                    }
                    TextKt.m1575b(aVar.m2571e(), interfaceC0500b3, 0L, 0L, null, null, null, 0L, null, c9797g2, 0L, 0, false, 0, null, null, c7218l2, composerImplMo1636j, ((i24 << 3) & 112) | ((i24 << 21) & 1879048192), (i24 << 15) & 3670016, 65020);
                    InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q11 = ComposerKt.f3003a;
                    c7218l3 = c7218l2;
                    c9797g3 = c9797g2;
                    j14 = jM5355n;
                    j15 = j13;
                }
                c5332q0M1612T = composerImplMo1636j.m1612T();
                if (c5332q0M1612T == null) {
                    return;
                }
                c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: com.lingq.ui.commons.status.MatchingTextKt$MatchingText$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // cm.InterfaceC2056p
                    /* JADX INFO: renamed from: m0 */
                    public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) throws Throwable {
                        num.intValue();
                        MatchingTextKt.m9749a(interfaceC0500b3, c7218l3, c9797g3, j14, j15, str, str2, interfaceC0476a2, C8573r0.m16737l1(i10 | 1), i11);
                        return C9072e.f47360a;
                    }
                };
            }
            i13 = 196608;
            i12 |= i13;
            if ((i11 & 64) != 0) {
                if ((i10 & 3670016) == 0) {
                    if (composerImplMo1636j.mo1665y(str2)) {
                        i14 = 1048576;
                    } else {
                        i14 = 524288;
                    }
                }
                if ((2995931 & i12) == 599186) {
                    composerImplMo1636j.m1654s0();
                    if ((i10 & 1) != 0) {
                        if (i17 != 0) {
                            interfaceC0500b3 = InterfaceC0500b.a.f3325a;
                        } else {
                            interfaceC0500b3 = interfaceC0500b2;
                        }
                        if ((i11 & 2) != 0) {
                            i12 &= -113;
                            c7218l2 = (C7218l) composerImplMo1636j.mo1648p(TextKt.f2808a);
                        }
                        if (i19 != 0) {
                            c9797g2 = null;
                        }
                        if ((i11 & 8) != 0) {
                            InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q12 = ComposerKt.f3003a;
                            jM5355n = ((C1648d) composerImplMo1636j.mo1648p(ColorSchemeKt.f2735a)).m5355n();
                            i12 &= -7169;
                        }
                        if ((i11 & 16) != 0) {
                            j12 = ((C9169u) CustomColorSchemeKt.m10359a(composerImplMo1636j).f33945g.getValue()).f47705a;
                            i12 &= -57345;
                        }
                    } else {
                        if (i17 != 0) {
                            interfaceC0500b3 = InterfaceC0500b.a.f3325a;
                        } else {
                            interfaceC0500b3 = interfaceC0500b2;
                        }
                        if ((i11 & 2) != 0) {
                            i12 &= -113;
                            c7218l2 = (C7218l) composerImplMo1636j.mo1648p(TextKt.f2808a);
                        }
                        if (i19 != 0) {
                            c9797g2 = null;
                        }
                        if ((i11 & 8) != 0) {
                            InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q13 = ComposerKt.f3003a;
                            jM5355n = ((C1648d) composerImplMo1636j.mo1648p(ColorSchemeKt.f2735a)).m5355n();
                            i12 &= -7169;
                        }
                        if ((i11 & 16) != 0) {
                            j12 = ((C9169u) CustomColorSchemeKt.m10359a(composerImplMo1636j).f33945g.getValue()).f47705a;
                            i12 &= -57345;
                        }
                    }
                    int i25 = i12;
                    j13 = j12;
                    composerImplMo1636j.m1610R();
                    InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q14 = ComposerKt.f3003a;
                    aVar = new C0689a.a();
                    List listM14299s9 = C7076b.m14299s3(str, new String[]{" "}, 0, 6);
                    arrayList = new ArrayList();
                    while (r14.hasNext()) {
                        if (!C7661i.m15250P2((String) obj)) {
                            arrayList.add(obj);
                        }
                    }
                    List listM14299s10 = C7076b.m14299s3(str2, new String[]{" "}, 0, 6);
                    arrayList2 = new ArrayList();
                    while (r14.hasNext()) {
                        if (!C7661i.m15250P2((String) obj2)) {
                            arrayList2.add(obj2);
                        }
                    }
                    it = arrayList.iterator();
                    i15 = 0;
                    while (it.hasNext()) {
                        next = it.next();
                        i16 = i15 + 1;
                        if (i15 < 0) {
                            C9000b.m17257w();
                            throw null;
                        }
                        Iterator it5 = it;
                        str3 = (String) next;
                        if (i15 <= C9000b.m17249o(arrayList2)) {
                            zM15249O2 = C7661i.m15249O2(str3, (String) arrayList2.get(i15));
                        } else {
                            zM15249O2 = false;
                        }
                        if (zM15249O2) {
                            iM2570d2 = aVar.m2570d(new C7214h(jM5355n, 0L, (C8476m) null, (C8471h) null, (C8472i) null, (AbstractC0696b) null, (String) null, 0L, (C9791a) null, (C9800j) null, (C8948d) null, 0L, (C9798h) null, (C9152j0) null, 16382));
                            aVar.m2568b(str3);
                            if (i15 != C9000b.m17249o(arrayList)) {
                                aVar.m2568b(" ");
                            }
                            C9072e c9072e7 = C9072e.f47360a;
                            aVar.m2569c(iM2570d2);
                        } else {
                            iM2570d = aVar.m2570d(new C7214h(j13, 0L, (C8476m) null, (C8471h) null, (C8472i) null, (AbstractC0696b) null, (String) null, 0L, (C9791a) null, (C9800j) null, (C8948d) null, 0L, (C9798h) null, (C9152j0) null, 16382));
                            aVar.m2568b(str3);
                            if (i15 != C9000b.m17249o(arrayList)) {
                                aVar.m2568b(" ");
                            }
                            C9072e c9072e8 = C9072e.f47360a;
                            aVar.m2569c(iM2570d);
                        }
                        it = it5;
                        i15 = i16;
                    }
                    TextKt.m1575b(aVar.m2571e(), interfaceC0500b3, 0L, 0L, null, null, null, 0L, null, c9797g2, 0L, 0, false, 0, null, null, c7218l2, composerImplMo1636j, ((i25 << 3) & 112) | ((i25 << 21) & 1879048192), (i25 << 15) & 3670016, 65020);
                    InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q15 = ComposerKt.f3003a;
                    c7218l3 = c7218l2;
                    c9797g3 = c9797g2;
                    j14 = jM5355n;
                    j15 = j13;
                } else {
                    composerImplMo1636j.m1654s0();
                    if ((i10 & 1) != 0) {
                        if (i17 != 0) {
                            interfaceC0500b3 = InterfaceC0500b.a.f3325a;
                        } else {
                            interfaceC0500b3 = interfaceC0500b2;
                        }
                        if ((i11 & 2) != 0) {
                            i12 &= -113;
                            c7218l2 = (C7218l) composerImplMo1636j.mo1648p(TextKt.f2808a);
                        }
                        if (i19 != 0) {
                            c9797g2 = null;
                        }
                        if ((i11 & 8) != 0) {
                            InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q16 = ComposerKt.f3003a;
                            jM5355n = ((C1648d) composerImplMo1636j.mo1648p(ColorSchemeKt.f2735a)).m5355n();
                            i12 &= -7169;
                        }
                        if ((i11 & 16) != 0) {
                            j12 = ((C9169u) CustomColorSchemeKt.m10359a(composerImplMo1636j).f33945g.getValue()).f47705a;
                            i12 &= -57345;
                        }
                    } else {
                        if (i17 != 0) {
                            interfaceC0500b3 = InterfaceC0500b.a.f3325a;
                        } else {
                            interfaceC0500b3 = interfaceC0500b2;
                        }
                        if ((i11 & 2) != 0) {
                            i12 &= -113;
                            c7218l2 = (C7218l) composerImplMo1636j.mo1648p(TextKt.f2808a);
                        }
                        if (i19 != 0) {
                            c9797g2 = null;
                        }
                        if ((i11 & 8) != 0) {
                            InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q17 = ComposerKt.f3003a;
                            jM5355n = ((C1648d) composerImplMo1636j.mo1648p(ColorSchemeKt.f2735a)).m5355n();
                            i12 &= -7169;
                        }
                        if ((i11 & 16) != 0) {
                            j12 = ((C9169u) CustomColorSchemeKt.m10359a(composerImplMo1636j).f33945g.getValue()).f47705a;
                            i12 &= -57345;
                        }
                    }
                    int i26 = i12;
                    j13 = j12;
                    composerImplMo1636j.m1610R();
                    InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q18 = ComposerKt.f3003a;
                    aVar = new C0689a.a();
                    List listM14299s11 = C7076b.m14299s3(str, new String[]{" "}, 0, 6);
                    arrayList = new ArrayList();
                    while (r14.hasNext()) {
                        if (!C7661i.m15250P2((String) obj)) {
                            arrayList.add(obj);
                        }
                    }
                    List listM14299s12 = C7076b.m14299s3(str2, new String[]{" "}, 0, 6);
                    arrayList2 = new ArrayList();
                    while (r14.hasNext()) {
                        if (!C7661i.m15250P2((String) obj2)) {
                            arrayList2.add(obj2);
                        }
                    }
                    it = arrayList.iterator();
                    i15 = 0;
                    while (it.hasNext()) {
                        next = it.next();
                        i16 = i15 + 1;
                        if (i15 < 0) {
                            C9000b.m17257w();
                            throw null;
                        }
                        Iterator it6 = it;
                        str3 = (String) next;
                        if (i15 <= C9000b.m17249o(arrayList2)) {
                            zM15249O2 = C7661i.m15249O2(str3, (String) arrayList2.get(i15));
                        } else {
                            zM15249O2 = false;
                        }
                        if (zM15249O2) {
                            iM2570d2 = aVar.m2570d(new C7214h(jM5355n, 0L, (C8476m) null, (C8471h) null, (C8472i) null, (AbstractC0696b) null, (String) null, 0L, (C9791a) null, (C9800j) null, (C8948d) null, 0L, (C9798h) null, (C9152j0) null, 16382));
                            aVar.m2568b(str3);
                            if (i15 != C9000b.m17249o(arrayList)) {
                                aVar.m2568b(" ");
                            }
                            C9072e c9072e9 = C9072e.f47360a;
                            aVar.m2569c(iM2570d2);
                        } else {
                            iM2570d = aVar.m2570d(new C7214h(j13, 0L, (C8476m) null, (C8471h) null, (C8472i) null, (AbstractC0696b) null, (String) null, 0L, (C9791a) null, (C9800j) null, (C8948d) null, 0L, (C9798h) null, (C9152j0) null, 16382));
                            aVar.m2568b(str3);
                            if (i15 != C9000b.m17249o(arrayList)) {
                                aVar.m2568b(" ");
                            }
                            C9072e c9072e10 = C9072e.f47360a;
                            aVar.m2569c(iM2570d);
                        }
                        it = it6;
                        i15 = i16;
                    }
                    TextKt.m1575b(aVar.m2571e(), interfaceC0500b3, 0L, 0L, null, null, null, 0L, null, c9797g2, 0L, 0, false, 0, null, null, c7218l2, composerImplMo1636j, ((i26 << 3) & 112) | ((i26 << 21) & 1879048192), (i26 << 15) & 3670016, 65020);
                    InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q19 = ComposerKt.f3003a;
                    c7218l3 = c7218l2;
                    c9797g3 = c9797g2;
                    j14 = jM5355n;
                    j15 = j13;
                }
                c5332q0M1612T = composerImplMo1636j.m1612T();
                if (c5332q0M1612T == null) {
                    return;
                }
                c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: com.lingq.ui.commons.status.MatchingTextKt$MatchingText$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // cm.InterfaceC2056p
                    /* JADX INFO: renamed from: m0 */
                    public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) throws Throwable {
                        num.intValue();
                        MatchingTextKt.m9749a(interfaceC0500b3, c7218l3, c9797g3, j14, j15, str, str2, interfaceC0476a2, C8573r0.m16737l1(i10 | 1), i11);
                        return C9072e.f47360a;
                    }
                };
            }
            i14 = 1572864;
            i12 |= i14;
            if ((2995931 & i12) == 599186) {
                composerImplMo1636j.m1654s0();
                if ((i10 & 1) != 0) {
                    if (i17 != 0) {
                        interfaceC0500b3 = InterfaceC0500b.a.f3325a;
                    } else {
                        interfaceC0500b3 = interfaceC0500b2;
                    }
                    if ((i11 & 2) != 0) {
                        i12 &= -113;
                        c7218l2 = (C7218l) composerImplMo1636j.mo1648p(TextKt.f2808a);
                    }
                    if (i19 != 0) {
                        c9797g2 = null;
                    }
                    if ((i11 & 8) != 0) {
                        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q110 = ComposerKt.f3003a;
                        jM5355n = ((C1648d) composerImplMo1636j.mo1648p(ColorSchemeKt.f2735a)).m5355n();
                        i12 &= -7169;
                    }
                    if ((i11 & 16) != 0) {
                        j12 = ((C9169u) CustomColorSchemeKt.m10359a(composerImplMo1636j).f33945g.getValue()).f47705a;
                        i12 &= -57345;
                    }
                } else {
                    if (i17 != 0) {
                        interfaceC0500b3 = InterfaceC0500b.a.f3325a;
                    } else {
                        interfaceC0500b3 = interfaceC0500b2;
                    }
                    if ((i11 & 2) != 0) {
                        i12 &= -113;
                        c7218l2 = (C7218l) composerImplMo1636j.mo1648p(TextKt.f2808a);
                    }
                    if (i19 != 0) {
                        c9797g2 = null;
                    }
                    if ((i11 & 8) != 0) {
                        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q111 = ComposerKt.f3003a;
                        jM5355n = ((C1648d) composerImplMo1636j.mo1648p(ColorSchemeKt.f2735a)).m5355n();
                        i12 &= -7169;
                    }
                    if ((i11 & 16) != 0) {
                        j12 = ((C9169u) CustomColorSchemeKt.m10359a(composerImplMo1636j).f33945g.getValue()).f47705a;
                        i12 &= -57345;
                    }
                }
                int i27 = i12;
                j13 = j12;
                composerImplMo1636j.m1610R();
                InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q112 = ComposerKt.f3003a;
                aVar = new C0689a.a();
                List listM14299s13 = C7076b.m14299s3(str, new String[]{" "}, 0, 6);
                arrayList = new ArrayList();
                while (r14.hasNext()) {
                    if (!C7661i.m15250P2((String) obj)) {
                        arrayList.add(obj);
                    }
                }
                List listM14299s14 = C7076b.m14299s3(str2, new String[]{" "}, 0, 6);
                arrayList2 = new ArrayList();
                while (r14.hasNext()) {
                    if (!C7661i.m15250P2((String) obj2)) {
                        arrayList2.add(obj2);
                    }
                }
                it = arrayList.iterator();
                i15 = 0;
                while (it.hasNext()) {
                    next = it.next();
                    i16 = i15 + 1;
                    if (i15 < 0) {
                        C9000b.m17257w();
                        throw null;
                    }
                    Iterator it7 = it;
                    str3 = (String) next;
                    if (i15 <= C9000b.m17249o(arrayList2)) {
                        zM15249O2 = C7661i.m15249O2(str3, (String) arrayList2.get(i15));
                    } else {
                        zM15249O2 = false;
                    }
                    if (zM15249O2) {
                        iM2570d2 = aVar.m2570d(new C7214h(jM5355n, 0L, (C8476m) null, (C8471h) null, (C8472i) null, (AbstractC0696b) null, (String) null, 0L, (C9791a) null, (C9800j) null, (C8948d) null, 0L, (C9798h) null, (C9152j0) null, 16382));
                        aVar.m2568b(str3);
                        if (i15 != C9000b.m17249o(arrayList)) {
                            aVar.m2568b(" ");
                        }
                        C9072e c9072e11 = C9072e.f47360a;
                        aVar.m2569c(iM2570d2);
                    } else {
                        iM2570d = aVar.m2570d(new C7214h(j13, 0L, (C8476m) null, (C8471h) null, (C8472i) null, (AbstractC0696b) null, (String) null, 0L, (C9791a) null, (C9800j) null, (C8948d) null, 0L, (C9798h) null, (C9152j0) null, 16382));
                        aVar.m2568b(str3);
                        if (i15 != C9000b.m17249o(arrayList)) {
                            aVar.m2568b(" ");
                        }
                        C9072e c9072e12 = C9072e.f47360a;
                        aVar.m2569c(iM2570d);
                    }
                    it = it7;
                    i15 = i16;
                }
                TextKt.m1575b(aVar.m2571e(), interfaceC0500b3, 0L, 0L, null, null, null, 0L, null, c9797g2, 0L, 0, false, 0, null, null, c7218l2, composerImplMo1636j, ((i27 << 3) & 112) | ((i27 << 21) & 1879048192), (i27 << 15) & 3670016, 65020);
                InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q113 = ComposerKt.f3003a;
                c7218l3 = c7218l2;
                c9797g3 = c9797g2;
                j14 = jM5355n;
                j15 = j13;
            } else {
                composerImplMo1636j.m1654s0();
                if ((i10 & 1) != 0) {
                    if (i17 != 0) {
                        interfaceC0500b3 = InterfaceC0500b.a.f3325a;
                    } else {
                        interfaceC0500b3 = interfaceC0500b2;
                    }
                    if ((i11 & 2) != 0) {
                        i12 &= -113;
                        c7218l2 = (C7218l) composerImplMo1636j.mo1648p(TextKt.f2808a);
                    }
                    if (i19 != 0) {
                        c9797g2 = null;
                    }
                    if ((i11 & 8) != 0) {
                        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q114 = ComposerKt.f3003a;
                        jM5355n = ((C1648d) composerImplMo1636j.mo1648p(ColorSchemeKt.f2735a)).m5355n();
                        i12 &= -7169;
                    }
                    if ((i11 & 16) != 0) {
                        j12 = ((C9169u) CustomColorSchemeKt.m10359a(composerImplMo1636j).f33945g.getValue()).f47705a;
                        i12 &= -57345;
                    }
                } else {
                    if (i17 != 0) {
                        interfaceC0500b3 = InterfaceC0500b.a.f3325a;
                    } else {
                        interfaceC0500b3 = interfaceC0500b2;
                    }
                    if ((i11 & 2) != 0) {
                        i12 &= -113;
                        c7218l2 = (C7218l) composerImplMo1636j.mo1648p(TextKt.f2808a);
                    }
                    if (i19 != 0) {
                        c9797g2 = null;
                    }
                    if ((i11 & 8) != 0) {
                        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q115 = ComposerKt.f3003a;
                        jM5355n = ((C1648d) composerImplMo1636j.mo1648p(ColorSchemeKt.f2735a)).m5355n();
                        i12 &= -7169;
                    }
                    if ((i11 & 16) != 0) {
                        j12 = ((C9169u) CustomColorSchemeKt.m10359a(composerImplMo1636j).f33945g.getValue()).f47705a;
                        i12 &= -57345;
                    }
                }
                int i28 = i12;
                j13 = j12;
                composerImplMo1636j.m1610R();
                InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q116 = ComposerKt.f3003a;
                aVar = new C0689a.a();
                List listM14299s15 = C7076b.m14299s3(str, new String[]{" "}, 0, 6);
                arrayList = new ArrayList();
                while (r14.hasNext()) {
                    if (!C7661i.m15250P2((String) obj)) {
                        arrayList.add(obj);
                    }
                }
                List listM14299s16 = C7076b.m14299s3(str2, new String[]{" "}, 0, 6);
                arrayList2 = new ArrayList();
                while (r14.hasNext()) {
                    if (!C7661i.m15250P2((String) obj2)) {
                        arrayList2.add(obj2);
                    }
                }
                it = arrayList.iterator();
                i15 = 0;
                while (it.hasNext()) {
                    next = it.next();
                    i16 = i15 + 1;
                    if (i15 < 0) {
                        C9000b.m17257w();
                        throw null;
                    }
                    Iterator it8 = it;
                    str3 = (String) next;
                    if (i15 <= C9000b.m17249o(arrayList2)) {
                        zM15249O2 = C7661i.m15249O2(str3, (String) arrayList2.get(i15));
                    } else {
                        zM15249O2 = false;
                    }
                    if (zM15249O2) {
                        iM2570d2 = aVar.m2570d(new C7214h(jM5355n, 0L, (C8476m) null, (C8471h) null, (C8472i) null, (AbstractC0696b) null, (String) null, 0L, (C9791a) null, (C9800j) null, (C8948d) null, 0L, (C9798h) null, (C9152j0) null, 16382));
                        aVar.m2568b(str3);
                        if (i15 != C9000b.m17249o(arrayList)) {
                            aVar.m2568b(" ");
                        }
                        C9072e c9072e13 = C9072e.f47360a;
                        aVar.m2569c(iM2570d2);
                    } else {
                        iM2570d = aVar.m2570d(new C7214h(j13, 0L, (C8476m) null, (C8471h) null, (C8472i) null, (AbstractC0696b) null, (String) null, 0L, (C9791a) null, (C9800j) null, (C8948d) null, 0L, (C9798h) null, (C9152j0) null, 16382));
                        aVar.m2568b(str3);
                        if (i15 != C9000b.m17249o(arrayList)) {
                            aVar.m2568b(" ");
                        }
                        C9072e c9072e14 = C9072e.f47360a;
                        aVar.m2569c(iM2570d);
                    }
                    it = it8;
                    i15 = i16;
                }
                TextKt.m1575b(aVar.m2571e(), interfaceC0500b3, 0L, 0L, null, null, null, 0L, null, c9797g2, 0L, 0, false, 0, null, null, c7218l2, composerImplMo1636j, ((i28 << 3) & 112) | ((i28 << 21) & 1879048192), (i28 << 15) & 3670016, 65020);
                InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q117 = ComposerKt.f3003a;
                c7218l3 = c7218l2;
                c9797g3 = c9797g2;
                j14 = jM5355n;
                j15 = j13;
            }
            c5332q0M1612T = composerImplMo1636j.m1612T();
            if (c5332q0M1612T == null) {
                return;
            }
            c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: com.lingq.ui.commons.status.MatchingTextKt$MatchingText$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // cm.InterfaceC2056p
                /* JADX INFO: renamed from: m0 */
                public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) throws Throwable {
                    num.intValue();
                    MatchingTextKt.m9749a(interfaceC0500b3, c7218l3, c9797g3, j14, j15, str, str2, interfaceC0476a2, C8573r0.m16737l1(i10 | 1), i11);
                    return C9072e.f47360a;
                }
            };
        }
        i12 |= 384;
        c9797g2 = c9797g;
        if ((i10 & 7168) == 0) {
            if ((i11 & 8) == 0) {
                jM5355n = j10;
                if (composerImplMo1636j.m1596F(jM5355n)) {
                }
                i12 |= i20;
            } else {
                jM5355n = j10;
            }
            i12 |= i20;
        } else {
            jM5355n = j10;
        }
        if ((57344 & i10) == 0) {
            if ((i11 & 16) == 0) {
                j12 = j11;
                if (composerImplMo1636j.m1596F(j12)) {
                }
                i12 |= i21;
            } else {
                j12 = j11;
            }
            i12 |= i21;
        } else {
            j12 = j11;
        }
        if ((i11 & 32) != 0) {
            if ((458752 & i10) == 0) {
                if (composerImplMo1636j.mo1665y(str)) {
                    i13 = 131072;
                } else {
                    i13 = 65536;
                }
            }
            if ((i11 & 64) != 0) {
                if ((i10 & 3670016) == 0) {
                    if (composerImplMo1636j.mo1665y(str2)) {
                        i14 = 1048576;
                    } else {
                        i14 = 524288;
                    }
                }
                if ((2995931 & i12) == 599186) {
                    composerImplMo1636j.m1654s0();
                    if ((i10 & 1) != 0) {
                        if (i17 != 0) {
                            interfaceC0500b3 = InterfaceC0500b.a.f3325a;
                        } else {
                            interfaceC0500b3 = interfaceC0500b2;
                        }
                        if ((i11 & 2) != 0) {
                            i12 &= -113;
                            c7218l2 = (C7218l) composerImplMo1636j.mo1648p(TextKt.f2808a);
                        }
                        if (i19 != 0) {
                            c9797g2 = null;
                        }
                        if ((i11 & 8) != 0) {
                            InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q118 = ComposerKt.f3003a;
                            jM5355n = ((C1648d) composerImplMo1636j.mo1648p(ColorSchemeKt.f2735a)).m5355n();
                            i12 &= -7169;
                        }
                        if ((i11 & 16) != 0) {
                            j12 = ((C9169u) CustomColorSchemeKt.m10359a(composerImplMo1636j).f33945g.getValue()).f47705a;
                            i12 &= -57345;
                        }
                    } else {
                        if (i17 != 0) {
                            interfaceC0500b3 = InterfaceC0500b.a.f3325a;
                        } else {
                            interfaceC0500b3 = interfaceC0500b2;
                        }
                        if ((i11 & 2) != 0) {
                            i12 &= -113;
                            c7218l2 = (C7218l) composerImplMo1636j.mo1648p(TextKt.f2808a);
                        }
                        if (i19 != 0) {
                            c9797g2 = null;
                        }
                        if ((i11 & 8) != 0) {
                            InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q119 = ComposerKt.f3003a;
                            jM5355n = ((C1648d) composerImplMo1636j.mo1648p(ColorSchemeKt.f2735a)).m5355n();
                            i12 &= -7169;
                        }
                        if ((i11 & 16) != 0) {
                            j12 = ((C9169u) CustomColorSchemeKt.m10359a(composerImplMo1636j).f33945g.getValue()).f47705a;
                            i12 &= -57345;
                        }
                    }
                    int i29 = i12;
                    j13 = j12;
                    composerImplMo1636j.m1610R();
                    InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q1110 = ComposerKt.f3003a;
                    aVar = new C0689a.a();
                    List listM14299s17 = C7076b.m14299s3(str, new String[]{" "}, 0, 6);
                    arrayList = new ArrayList();
                    while (r14.hasNext()) {
                        if (!C7661i.m15250P2((String) obj)) {
                            arrayList.add(obj);
                        }
                    }
                    List listM14299s18 = C7076b.m14299s3(str2, new String[]{" "}, 0, 6);
                    arrayList2 = new ArrayList();
                    while (r14.hasNext()) {
                        if (!C7661i.m15250P2((String) obj2)) {
                            arrayList2.add(obj2);
                        }
                    }
                    it = arrayList.iterator();
                    i15 = 0;
                    while (it.hasNext()) {
                        next = it.next();
                        i16 = i15 + 1;
                        if (i15 < 0) {
                            C9000b.m17257w();
                            throw null;
                        }
                        Iterator it9 = it;
                        str3 = (String) next;
                        if (i15 <= C9000b.m17249o(arrayList2)) {
                            zM15249O2 = C7661i.m15249O2(str3, (String) arrayList2.get(i15));
                        } else {
                            zM15249O2 = false;
                        }
                        if (zM15249O2) {
                            iM2570d2 = aVar.m2570d(new C7214h(jM5355n, 0L, (C8476m) null, (C8471h) null, (C8472i) null, (AbstractC0696b) null, (String) null, 0L, (C9791a) null, (C9800j) null, (C8948d) null, 0L, (C9798h) null, (C9152j0) null, 16382));
                            aVar.m2568b(str3);
                            if (i15 != C9000b.m17249o(arrayList)) {
                                aVar.m2568b(" ");
                            }
                            C9072e c9072e15 = C9072e.f47360a;
                            aVar.m2569c(iM2570d2);
                        } else {
                            iM2570d = aVar.m2570d(new C7214h(j13, 0L, (C8476m) null, (C8471h) null, (C8472i) null, (AbstractC0696b) null, (String) null, 0L, (C9791a) null, (C9800j) null, (C8948d) null, 0L, (C9798h) null, (C9152j0) null, 16382));
                            aVar.m2568b(str3);
                            if (i15 != C9000b.m17249o(arrayList)) {
                                aVar.m2568b(" ");
                            }
                            C9072e c9072e16 = C9072e.f47360a;
                            aVar.m2569c(iM2570d);
                        }
                        it = it9;
                        i15 = i16;
                    }
                    TextKt.m1575b(aVar.m2571e(), interfaceC0500b3, 0L, 0L, null, null, null, 0L, null, c9797g2, 0L, 0, false, 0, null, null, c7218l2, composerImplMo1636j, ((i29 << 3) & 112) | ((i29 << 21) & 1879048192), (i29 << 15) & 3670016, 65020);
                    InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q1111 = ComposerKt.f3003a;
                    c7218l3 = c7218l2;
                    c9797g3 = c9797g2;
                    j14 = jM5355n;
                    j15 = j13;
                } else {
                    composerImplMo1636j.m1654s0();
                    if ((i10 & 1) != 0) {
                        if (i17 != 0) {
                            interfaceC0500b3 = InterfaceC0500b.a.f3325a;
                        } else {
                            interfaceC0500b3 = interfaceC0500b2;
                        }
                        if ((i11 & 2) != 0) {
                            i12 &= -113;
                            c7218l2 = (C7218l) composerImplMo1636j.mo1648p(TextKt.f2808a);
                        }
                        if (i19 != 0) {
                            c9797g2 = null;
                        }
                        if ((i11 & 8) != 0) {
                            InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q1112 = ComposerKt.f3003a;
                            jM5355n = ((C1648d) composerImplMo1636j.mo1648p(ColorSchemeKt.f2735a)).m5355n();
                            i12 &= -7169;
                        }
                        if ((i11 & 16) != 0) {
                            j12 = ((C9169u) CustomColorSchemeKt.m10359a(composerImplMo1636j).f33945g.getValue()).f47705a;
                            i12 &= -57345;
                        }
                    } else {
                        if (i17 != 0) {
                            interfaceC0500b3 = InterfaceC0500b.a.f3325a;
                        } else {
                            interfaceC0500b3 = interfaceC0500b2;
                        }
                        if ((i11 & 2) != 0) {
                            i12 &= -113;
                            c7218l2 = (C7218l) composerImplMo1636j.mo1648p(TextKt.f2808a);
                        }
                        if (i19 != 0) {
                            c9797g2 = null;
                        }
                        if ((i11 & 8) != 0) {
                            InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q1113 = ComposerKt.f3003a;
                            jM5355n = ((C1648d) composerImplMo1636j.mo1648p(ColorSchemeKt.f2735a)).m5355n();
                            i12 &= -7169;
                        }
                        if ((i11 & 16) != 0) {
                            j12 = ((C9169u) CustomColorSchemeKt.m10359a(composerImplMo1636j).f33945g.getValue()).f47705a;
                            i12 &= -57345;
                        }
                    }
                    int i210 = i12;
                    j13 = j12;
                    composerImplMo1636j.m1610R();
                    InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q1114 = ComposerKt.f3003a;
                    aVar = new C0689a.a();
                    List listM14299s19 = C7076b.m14299s3(str, new String[]{" "}, 0, 6);
                    arrayList = new ArrayList();
                    while (r14.hasNext()) {
                        if (!C7661i.m15250P2((String) obj)) {
                            arrayList.add(obj);
                        }
                    }
                    List listM14299s110 = C7076b.m14299s3(str2, new String[]{" "}, 0, 6);
                    arrayList2 = new ArrayList();
                    while (r14.hasNext()) {
                        if (!C7661i.m15250P2((String) obj2)) {
                            arrayList2.add(obj2);
                        }
                    }
                    it = arrayList.iterator();
                    i15 = 0;
                    while (it.hasNext()) {
                        next = it.next();
                        i16 = i15 + 1;
                        if (i15 < 0) {
                            C9000b.m17257w();
                            throw null;
                        }
                        Iterator it10 = it;
                        str3 = (String) next;
                        if (i15 <= C9000b.m17249o(arrayList2)) {
                            zM15249O2 = C7661i.m15249O2(str3, (String) arrayList2.get(i15));
                        } else {
                            zM15249O2 = false;
                        }
                        if (zM15249O2) {
                            iM2570d2 = aVar.m2570d(new C7214h(jM5355n, 0L, (C8476m) null, (C8471h) null, (C8472i) null, (AbstractC0696b) null, (String) null, 0L, (C9791a) null, (C9800j) null, (C8948d) null, 0L, (C9798h) null, (C9152j0) null, 16382));
                            aVar.m2568b(str3);
                            if (i15 != C9000b.m17249o(arrayList)) {
                                aVar.m2568b(" ");
                            }
                            C9072e c9072e17 = C9072e.f47360a;
                            aVar.m2569c(iM2570d2);
                        } else {
                            iM2570d = aVar.m2570d(new C7214h(j13, 0L, (C8476m) null, (C8471h) null, (C8472i) null, (AbstractC0696b) null, (String) null, 0L, (C9791a) null, (C9800j) null, (C8948d) null, 0L, (C9798h) null, (C9152j0) null, 16382));
                            aVar.m2568b(str3);
                            if (i15 != C9000b.m17249o(arrayList)) {
                                aVar.m2568b(" ");
                            }
                            C9072e c9072e18 = C9072e.f47360a;
                            aVar.m2569c(iM2570d);
                        }
                        it = it10;
                        i15 = i16;
                    }
                    TextKt.m1575b(aVar.m2571e(), interfaceC0500b3, 0L, 0L, null, null, null, 0L, null, c9797g2, 0L, 0, false, 0, null, null, c7218l2, composerImplMo1636j, ((i210 << 3) & 112) | ((i210 << 21) & 1879048192), (i210 << 15) & 3670016, 65020);
                    InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q1115 = ComposerKt.f3003a;
                    c7218l3 = c7218l2;
                    c9797g3 = c9797g2;
                    j14 = jM5355n;
                    j15 = j13;
                }
                c5332q0M1612T = composerImplMo1636j.m1612T();
                if (c5332q0M1612T == null) {
                    return;
                }
                c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: com.lingq.ui.commons.status.MatchingTextKt$MatchingText$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // cm.InterfaceC2056p
                    /* JADX INFO: renamed from: m0 */
                    public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) throws Throwable {
                        num.intValue();
                        MatchingTextKt.m9749a(interfaceC0500b3, c7218l3, c9797g3, j14, j15, str, str2, interfaceC0476a2, C8573r0.m16737l1(i10 | 1), i11);
                        return C9072e.f47360a;
                    }
                };
            }
            i14 = 1572864;
            i12 |= i14;
            if ((2995931 & i12) == 599186) {
                composerImplMo1636j.m1654s0();
                if ((i10 & 1) != 0) {
                    if (i17 != 0) {
                        interfaceC0500b3 = InterfaceC0500b.a.f3325a;
                    } else {
                        interfaceC0500b3 = interfaceC0500b2;
                    }
                    if ((i11 & 2) != 0) {
                        i12 &= -113;
                        c7218l2 = (C7218l) composerImplMo1636j.mo1648p(TextKt.f2808a);
                    }
                    if (i19 != 0) {
                        c9797g2 = null;
                    }
                    if ((i11 & 8) != 0) {
                        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q1116 = ComposerKt.f3003a;
                        jM5355n = ((C1648d) composerImplMo1636j.mo1648p(ColorSchemeKt.f2735a)).m5355n();
                        i12 &= -7169;
                    }
                    if ((i11 & 16) != 0) {
                        j12 = ((C9169u) CustomColorSchemeKt.m10359a(composerImplMo1636j).f33945g.getValue()).f47705a;
                        i12 &= -57345;
                    }
                } else {
                    if (i17 != 0) {
                        interfaceC0500b3 = InterfaceC0500b.a.f3325a;
                    } else {
                        interfaceC0500b3 = interfaceC0500b2;
                    }
                    if ((i11 & 2) != 0) {
                        i12 &= -113;
                        c7218l2 = (C7218l) composerImplMo1636j.mo1648p(TextKt.f2808a);
                    }
                    if (i19 != 0) {
                        c9797g2 = null;
                    }
                    if ((i11 & 8) != 0) {
                        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q1117 = ComposerKt.f3003a;
                        jM5355n = ((C1648d) composerImplMo1636j.mo1648p(ColorSchemeKt.f2735a)).m5355n();
                        i12 &= -7169;
                    }
                    if ((i11 & 16) != 0) {
                        j12 = ((C9169u) CustomColorSchemeKt.m10359a(composerImplMo1636j).f33945g.getValue()).f47705a;
                        i12 &= -57345;
                    }
                }
                int i211 = i12;
                j13 = j12;
                composerImplMo1636j.m1610R();
                InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q1118 = ComposerKt.f3003a;
                aVar = new C0689a.a();
                List listM14299s111 = C7076b.m14299s3(str, new String[]{" "}, 0, 6);
                arrayList = new ArrayList();
                while (r14.hasNext()) {
                    if (!C7661i.m15250P2((String) obj)) {
                        arrayList.add(obj);
                    }
                }
                List listM14299s112 = C7076b.m14299s3(str2, new String[]{" "}, 0, 6);
                arrayList2 = new ArrayList();
                while (r14.hasNext()) {
                    if (!C7661i.m15250P2((String) obj2)) {
                        arrayList2.add(obj2);
                    }
                }
                it = arrayList.iterator();
                i15 = 0;
                while (it.hasNext()) {
                    next = it.next();
                    i16 = i15 + 1;
                    if (i15 < 0) {
                        C9000b.m17257w();
                        throw null;
                    }
                    Iterator it11 = it;
                    str3 = (String) next;
                    if (i15 <= C9000b.m17249o(arrayList2)) {
                        zM15249O2 = C7661i.m15249O2(str3, (String) arrayList2.get(i15));
                    } else {
                        zM15249O2 = false;
                    }
                    if (zM15249O2) {
                        iM2570d2 = aVar.m2570d(new C7214h(jM5355n, 0L, (C8476m) null, (C8471h) null, (C8472i) null, (AbstractC0696b) null, (String) null, 0L, (C9791a) null, (C9800j) null, (C8948d) null, 0L, (C9798h) null, (C9152j0) null, 16382));
                        aVar.m2568b(str3);
                        if (i15 != C9000b.m17249o(arrayList)) {
                            aVar.m2568b(" ");
                        }
                        C9072e c9072e19 = C9072e.f47360a;
                        aVar.m2569c(iM2570d2);
                    } else {
                        iM2570d = aVar.m2570d(new C7214h(j13, 0L, (C8476m) null, (C8471h) null, (C8472i) null, (AbstractC0696b) null, (String) null, 0L, (C9791a) null, (C9800j) null, (C8948d) null, 0L, (C9798h) null, (C9152j0) null, 16382));
                        aVar.m2568b(str3);
                        if (i15 != C9000b.m17249o(arrayList)) {
                            aVar.m2568b(" ");
                        }
                        C9072e c9072e110 = C9072e.f47360a;
                        aVar.m2569c(iM2570d);
                    }
                    it = it11;
                    i15 = i16;
                }
                TextKt.m1575b(aVar.m2571e(), interfaceC0500b3, 0L, 0L, null, null, null, 0L, null, c9797g2, 0L, 0, false, 0, null, null, c7218l2, composerImplMo1636j, ((i211 << 3) & 112) | ((i211 << 21) & 1879048192), (i211 << 15) & 3670016, 65020);
                InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q1119 = ComposerKt.f3003a;
                c7218l3 = c7218l2;
                c9797g3 = c9797g2;
                j14 = jM5355n;
                j15 = j13;
            } else {
                composerImplMo1636j.m1654s0();
                if ((i10 & 1) != 0) {
                    if (i17 != 0) {
                        interfaceC0500b3 = InterfaceC0500b.a.f3325a;
                    } else {
                        interfaceC0500b3 = interfaceC0500b2;
                    }
                    if ((i11 & 2) != 0) {
                        i12 &= -113;
                        c7218l2 = (C7218l) composerImplMo1636j.mo1648p(TextKt.f2808a);
                    }
                    if (i19 != 0) {
                        c9797g2 = null;
                    }
                    if ((i11 & 8) != 0) {
                        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q11110 = ComposerKt.f3003a;
                        jM5355n = ((C1648d) composerImplMo1636j.mo1648p(ColorSchemeKt.f2735a)).m5355n();
                        i12 &= -7169;
                    }
                    if ((i11 & 16) != 0) {
                        j12 = ((C9169u) CustomColorSchemeKt.m10359a(composerImplMo1636j).f33945g.getValue()).f47705a;
                        i12 &= -57345;
                    }
                } else {
                    if (i17 != 0) {
                        interfaceC0500b3 = InterfaceC0500b.a.f3325a;
                    } else {
                        interfaceC0500b3 = interfaceC0500b2;
                    }
                    if ((i11 & 2) != 0) {
                        i12 &= -113;
                        c7218l2 = (C7218l) composerImplMo1636j.mo1648p(TextKt.f2808a);
                    }
                    if (i19 != 0) {
                        c9797g2 = null;
                    }
                    if ((i11 & 8) != 0) {
                        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q11111 = ComposerKt.f3003a;
                        jM5355n = ((C1648d) composerImplMo1636j.mo1648p(ColorSchemeKt.f2735a)).m5355n();
                        i12 &= -7169;
                    }
                    if ((i11 & 16) != 0) {
                        j12 = ((C9169u) CustomColorSchemeKt.m10359a(composerImplMo1636j).f33945g.getValue()).f47705a;
                        i12 &= -57345;
                    }
                }
                int i212 = i12;
                j13 = j12;
                composerImplMo1636j.m1610R();
                InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q11112 = ComposerKt.f3003a;
                aVar = new C0689a.a();
                List listM14299s113 = C7076b.m14299s3(str, new String[]{" "}, 0, 6);
                arrayList = new ArrayList();
                while (r14.hasNext()) {
                    if (!C7661i.m15250P2((String) obj)) {
                        arrayList.add(obj);
                    }
                }
                List listM14299s114 = C7076b.m14299s3(str2, new String[]{" "}, 0, 6);
                arrayList2 = new ArrayList();
                while (r14.hasNext()) {
                    if (!C7661i.m15250P2((String) obj2)) {
                        arrayList2.add(obj2);
                    }
                }
                it = arrayList.iterator();
                i15 = 0;
                while (it.hasNext()) {
                    next = it.next();
                    i16 = i15 + 1;
                    if (i15 < 0) {
                        C9000b.m17257w();
                        throw null;
                    }
                    Iterator it12 = it;
                    str3 = (String) next;
                    if (i15 <= C9000b.m17249o(arrayList2)) {
                        zM15249O2 = C7661i.m15249O2(str3, (String) arrayList2.get(i15));
                    } else {
                        zM15249O2 = false;
                    }
                    if (zM15249O2) {
                        iM2570d2 = aVar.m2570d(new C7214h(jM5355n, 0L, (C8476m) null, (C8471h) null, (C8472i) null, (AbstractC0696b) null, (String) null, 0L, (C9791a) null, (C9800j) null, (C8948d) null, 0L, (C9798h) null, (C9152j0) null, 16382));
                        aVar.m2568b(str3);
                        if (i15 != C9000b.m17249o(arrayList)) {
                            aVar.m2568b(" ");
                        }
                        C9072e c9072e111 = C9072e.f47360a;
                        aVar.m2569c(iM2570d2);
                    } else {
                        iM2570d = aVar.m2570d(new C7214h(j13, 0L, (C8476m) null, (C8471h) null, (C8472i) null, (AbstractC0696b) null, (String) null, 0L, (C9791a) null, (C9800j) null, (C8948d) null, 0L, (C9798h) null, (C9152j0) null, 16382));
                        aVar.m2568b(str3);
                        if (i15 != C9000b.m17249o(arrayList)) {
                            aVar.m2568b(" ");
                        }
                        C9072e c9072e112 = C9072e.f47360a;
                        aVar.m2569c(iM2570d);
                    }
                    it = it12;
                    i15 = i16;
                }
                TextKt.m1575b(aVar.m2571e(), interfaceC0500b3, 0L, 0L, null, null, null, 0L, null, c9797g2, 0L, 0, false, 0, null, null, c7218l2, composerImplMo1636j, ((i212 << 3) & 112) | ((i212 << 21) & 1879048192), (i212 << 15) & 3670016, 65020);
                InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q11113 = ComposerKt.f3003a;
                c7218l3 = c7218l2;
                c9797g3 = c9797g2;
                j14 = jM5355n;
                j15 = j13;
            }
            c5332q0M1612T = composerImplMo1636j.m1612T();
            if (c5332q0M1612T == null) {
                return;
            }
            c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: com.lingq.ui.commons.status.MatchingTextKt$MatchingText$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // cm.InterfaceC2056p
                /* JADX INFO: renamed from: m0 */
                public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) throws Throwable {
                    num.intValue();
                    MatchingTextKt.m9749a(interfaceC0500b3, c7218l3, c9797g3, j14, j15, str, str2, interfaceC0476a2, C8573r0.m16737l1(i10 | 1), i11);
                    return C9072e.f47360a;
                }
            };
        }
        i13 = 196608;
        i12 |= i13;
        if ((i11 & 64) != 0) {
            if ((i10 & 3670016) == 0) {
                if (composerImplMo1636j.mo1665y(str2)) {
                    i14 = 1048576;
                } else {
                    i14 = 524288;
                }
            }
            if ((2995931 & i12) == 599186) {
                composerImplMo1636j.m1654s0();
                if ((i10 & 1) != 0) {
                    if (i17 != 0) {
                        interfaceC0500b3 = InterfaceC0500b.a.f3325a;
                    } else {
                        interfaceC0500b3 = interfaceC0500b2;
                    }
                    if ((i11 & 2) != 0) {
                        i12 &= -113;
                        c7218l2 = (C7218l) composerImplMo1636j.mo1648p(TextKt.f2808a);
                    }
                    if (i19 != 0) {
                        c9797g2 = null;
                    }
                    if ((i11 & 8) != 0) {
                        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q11114 = ComposerKt.f3003a;
                        jM5355n = ((C1648d) composerImplMo1636j.mo1648p(ColorSchemeKt.f2735a)).m5355n();
                        i12 &= -7169;
                    }
                    if ((i11 & 16) != 0) {
                        j12 = ((C9169u) CustomColorSchemeKt.m10359a(composerImplMo1636j).f33945g.getValue()).f47705a;
                        i12 &= -57345;
                    }
                } else {
                    if (i17 != 0) {
                        interfaceC0500b3 = InterfaceC0500b.a.f3325a;
                    } else {
                        interfaceC0500b3 = interfaceC0500b2;
                    }
                    if ((i11 & 2) != 0) {
                        i12 &= -113;
                        c7218l2 = (C7218l) composerImplMo1636j.mo1648p(TextKt.f2808a);
                    }
                    if (i19 != 0) {
                        c9797g2 = null;
                    }
                    if ((i11 & 8) != 0) {
                        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q11115 = ComposerKt.f3003a;
                        jM5355n = ((C1648d) composerImplMo1636j.mo1648p(ColorSchemeKt.f2735a)).m5355n();
                        i12 &= -7169;
                    }
                    if ((i11 & 16) != 0) {
                        j12 = ((C9169u) CustomColorSchemeKt.m10359a(composerImplMo1636j).f33945g.getValue()).f47705a;
                        i12 &= -57345;
                    }
                }
                int i213 = i12;
                j13 = j12;
                composerImplMo1636j.m1610R();
                InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q11116 = ComposerKt.f3003a;
                aVar = new C0689a.a();
                List listM14299s115 = C7076b.m14299s3(str, new String[]{" "}, 0, 6);
                arrayList = new ArrayList();
                while (r14.hasNext()) {
                    if (!C7661i.m15250P2((String) obj)) {
                        arrayList.add(obj);
                    }
                }
                List listM14299s116 = C7076b.m14299s3(str2, new String[]{" "}, 0, 6);
                arrayList2 = new ArrayList();
                while (r14.hasNext()) {
                    if (!C7661i.m15250P2((String) obj2)) {
                        arrayList2.add(obj2);
                    }
                }
                it = arrayList.iterator();
                i15 = 0;
                while (it.hasNext()) {
                    next = it.next();
                    i16 = i15 + 1;
                    if (i15 < 0) {
                        C9000b.m17257w();
                        throw null;
                    }
                    Iterator it13 = it;
                    str3 = (String) next;
                    if (i15 <= C9000b.m17249o(arrayList2)) {
                        zM15249O2 = C7661i.m15249O2(str3, (String) arrayList2.get(i15));
                    } else {
                        zM15249O2 = false;
                    }
                    if (zM15249O2) {
                        iM2570d2 = aVar.m2570d(new C7214h(jM5355n, 0L, (C8476m) null, (C8471h) null, (C8472i) null, (AbstractC0696b) null, (String) null, 0L, (C9791a) null, (C9800j) null, (C8948d) null, 0L, (C9798h) null, (C9152j0) null, 16382));
                        aVar.m2568b(str3);
                        if (i15 != C9000b.m17249o(arrayList)) {
                            aVar.m2568b(" ");
                        }
                        C9072e c9072e113 = C9072e.f47360a;
                        aVar.m2569c(iM2570d2);
                    } else {
                        iM2570d = aVar.m2570d(new C7214h(j13, 0L, (C8476m) null, (C8471h) null, (C8472i) null, (AbstractC0696b) null, (String) null, 0L, (C9791a) null, (C9800j) null, (C8948d) null, 0L, (C9798h) null, (C9152j0) null, 16382));
                        aVar.m2568b(str3);
                        if (i15 != C9000b.m17249o(arrayList)) {
                            aVar.m2568b(" ");
                        }
                        C9072e c9072e114 = C9072e.f47360a;
                        aVar.m2569c(iM2570d);
                    }
                    it = it13;
                    i15 = i16;
                }
                TextKt.m1575b(aVar.m2571e(), interfaceC0500b3, 0L, 0L, null, null, null, 0L, null, c9797g2, 0L, 0, false, 0, null, null, c7218l2, composerImplMo1636j, ((i213 << 3) & 112) | ((i213 << 21) & 1879048192), (i213 << 15) & 3670016, 65020);
                InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q11117 = ComposerKt.f3003a;
                c7218l3 = c7218l2;
                c9797g3 = c9797g2;
                j14 = jM5355n;
                j15 = j13;
            } else {
                composerImplMo1636j.m1654s0();
                if ((i10 & 1) != 0) {
                    if (i17 != 0) {
                        interfaceC0500b3 = InterfaceC0500b.a.f3325a;
                    } else {
                        interfaceC0500b3 = interfaceC0500b2;
                    }
                    if ((i11 & 2) != 0) {
                        i12 &= -113;
                        c7218l2 = (C7218l) composerImplMo1636j.mo1648p(TextKt.f2808a);
                    }
                    if (i19 != 0) {
                        c9797g2 = null;
                    }
                    if ((i11 & 8) != 0) {
                        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q11118 = ComposerKt.f3003a;
                        jM5355n = ((C1648d) composerImplMo1636j.mo1648p(ColorSchemeKt.f2735a)).m5355n();
                        i12 &= -7169;
                    }
                    if ((i11 & 16) != 0) {
                        j12 = ((C9169u) CustomColorSchemeKt.m10359a(composerImplMo1636j).f33945g.getValue()).f47705a;
                        i12 &= -57345;
                    }
                } else {
                    if (i17 != 0) {
                        interfaceC0500b3 = InterfaceC0500b.a.f3325a;
                    } else {
                        interfaceC0500b3 = interfaceC0500b2;
                    }
                    if ((i11 & 2) != 0) {
                        i12 &= -113;
                        c7218l2 = (C7218l) composerImplMo1636j.mo1648p(TextKt.f2808a);
                    }
                    if (i19 != 0) {
                        c9797g2 = null;
                    }
                    if ((i11 & 8) != 0) {
                        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q11119 = ComposerKt.f3003a;
                        jM5355n = ((C1648d) composerImplMo1636j.mo1648p(ColorSchemeKt.f2735a)).m5355n();
                        i12 &= -7169;
                    }
                    if ((i11 & 16) != 0) {
                        j12 = ((C9169u) CustomColorSchemeKt.m10359a(composerImplMo1636j).f33945g.getValue()).f47705a;
                        i12 &= -57345;
                    }
                }
                int i214 = i12;
                j13 = j12;
                composerImplMo1636j.m1610R();
                InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q111110 = ComposerKt.f3003a;
                aVar = new C0689a.a();
                List listM14299s117 = C7076b.m14299s3(str, new String[]{" "}, 0, 6);
                arrayList = new ArrayList();
                while (r14.hasNext()) {
                    if (!C7661i.m15250P2((String) obj)) {
                        arrayList.add(obj);
                    }
                }
                List listM14299s118 = C7076b.m14299s3(str2, new String[]{" "}, 0, 6);
                arrayList2 = new ArrayList();
                while (r14.hasNext()) {
                    if (!C7661i.m15250P2((String) obj2)) {
                        arrayList2.add(obj2);
                    }
                }
                it = arrayList.iterator();
                i15 = 0;
                while (it.hasNext()) {
                    next = it.next();
                    i16 = i15 + 1;
                    if (i15 < 0) {
                        C9000b.m17257w();
                        throw null;
                    }
                    Iterator it14 = it;
                    str3 = (String) next;
                    if (i15 <= C9000b.m17249o(arrayList2)) {
                        zM15249O2 = C7661i.m15249O2(str3, (String) arrayList2.get(i15));
                    } else {
                        zM15249O2 = false;
                    }
                    if (zM15249O2) {
                        iM2570d2 = aVar.m2570d(new C7214h(jM5355n, 0L, (C8476m) null, (C8471h) null, (C8472i) null, (AbstractC0696b) null, (String) null, 0L, (C9791a) null, (C9800j) null, (C8948d) null, 0L, (C9798h) null, (C9152j0) null, 16382));
                        aVar.m2568b(str3);
                        if (i15 != C9000b.m17249o(arrayList)) {
                            aVar.m2568b(" ");
                        }
                        C9072e c9072e115 = C9072e.f47360a;
                        aVar.m2569c(iM2570d2);
                    } else {
                        iM2570d = aVar.m2570d(new C7214h(j13, 0L, (C8476m) null, (C8471h) null, (C8472i) null, (AbstractC0696b) null, (String) null, 0L, (C9791a) null, (C9800j) null, (C8948d) null, 0L, (C9798h) null, (C9152j0) null, 16382));
                        aVar.m2568b(str3);
                        if (i15 != C9000b.m17249o(arrayList)) {
                            aVar.m2568b(" ");
                        }
                        C9072e c9072e116 = C9072e.f47360a;
                        aVar.m2569c(iM2570d);
                    }
                    it = it14;
                    i15 = i16;
                }
                TextKt.m1575b(aVar.m2571e(), interfaceC0500b3, 0L, 0L, null, null, null, 0L, null, c9797g2, 0L, 0, false, 0, null, null, c7218l2, composerImplMo1636j, ((i214 << 3) & 112) | ((i214 << 21) & 1879048192), (i214 << 15) & 3670016, 65020);
                InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q111111 = ComposerKt.f3003a;
                c7218l3 = c7218l2;
                c9797g3 = c9797g2;
                j14 = jM5355n;
                j15 = j13;
            }
            c5332q0M1612T = composerImplMo1636j.m1612T();
            if (c5332q0M1612T == null) {
                return;
            }
            c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: com.lingq.ui.commons.status.MatchingTextKt$MatchingText$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // cm.InterfaceC2056p
                /* JADX INFO: renamed from: m0 */
                public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) throws Throwable {
                    num.intValue();
                    MatchingTextKt.m9749a(interfaceC0500b3, c7218l3, c9797g3, j14, j15, str, str2, interfaceC0476a2, C8573r0.m16737l1(i10 | 1), i11);
                    return C9072e.f47360a;
                }
            };
        }
        i14 = 1572864;
        i12 |= i14;
        if ((2995931 & i12) == 599186) {
            composerImplMo1636j.m1654s0();
            if ((i10 & 1) != 0) {
                if (i17 != 0) {
                    interfaceC0500b3 = InterfaceC0500b.a.f3325a;
                } else {
                    interfaceC0500b3 = interfaceC0500b2;
                }
                if ((i11 & 2) != 0) {
                    i12 &= -113;
                    c7218l2 = (C7218l) composerImplMo1636j.mo1648p(TextKt.f2808a);
                }
                if (i19 != 0) {
                    c9797g2 = null;
                }
                if ((i11 & 8) != 0) {
                    InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q111112 = ComposerKt.f3003a;
                    jM5355n = ((C1648d) composerImplMo1636j.mo1648p(ColorSchemeKt.f2735a)).m5355n();
                    i12 &= -7169;
                }
                if ((i11 & 16) != 0) {
                    j12 = ((C9169u) CustomColorSchemeKt.m10359a(composerImplMo1636j).f33945g.getValue()).f47705a;
                    i12 &= -57345;
                }
            } else {
                if (i17 != 0) {
                    interfaceC0500b3 = InterfaceC0500b.a.f3325a;
                } else {
                    interfaceC0500b3 = interfaceC0500b2;
                }
                if ((i11 & 2) != 0) {
                    i12 &= -113;
                    c7218l2 = (C7218l) composerImplMo1636j.mo1648p(TextKt.f2808a);
                }
                if (i19 != 0) {
                    c9797g2 = null;
                }
                if ((i11 & 8) != 0) {
                    InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q111113 = ComposerKt.f3003a;
                    jM5355n = ((C1648d) composerImplMo1636j.mo1648p(ColorSchemeKt.f2735a)).m5355n();
                    i12 &= -7169;
                }
                if ((i11 & 16) != 0) {
                    j12 = ((C9169u) CustomColorSchemeKt.m10359a(composerImplMo1636j).f33945g.getValue()).f47705a;
                    i12 &= -57345;
                }
            }
            int i215 = i12;
            j13 = j12;
            composerImplMo1636j.m1610R();
            InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q111114 = ComposerKt.f3003a;
            aVar = new C0689a.a();
            List listM14299s119 = C7076b.m14299s3(str, new String[]{" "}, 0, 6);
            arrayList = new ArrayList();
            while (r14.hasNext()) {
                if (!C7661i.m15250P2((String) obj)) {
                    arrayList.add(obj);
                }
            }
            List listM14299s1110 = C7076b.m14299s3(str2, new String[]{" "}, 0, 6);
            arrayList2 = new ArrayList();
            while (r14.hasNext()) {
                if (!C7661i.m15250P2((String) obj2)) {
                    arrayList2.add(obj2);
                }
            }
            it = arrayList.iterator();
            i15 = 0;
            while (it.hasNext()) {
                next = it.next();
                i16 = i15 + 1;
                if (i15 < 0) {
                    C9000b.m17257w();
                    throw null;
                }
                Iterator it15 = it;
                str3 = (String) next;
                if (i15 <= C9000b.m17249o(arrayList2)) {
                    zM15249O2 = C7661i.m15249O2(str3, (String) arrayList2.get(i15));
                } else {
                    zM15249O2 = false;
                }
                if (zM15249O2) {
                    iM2570d2 = aVar.m2570d(new C7214h(jM5355n, 0L, (C8476m) null, (C8471h) null, (C8472i) null, (AbstractC0696b) null, (String) null, 0L, (C9791a) null, (C9800j) null, (C8948d) null, 0L, (C9798h) null, (C9152j0) null, 16382));
                    aVar.m2568b(str3);
                    if (i15 != C9000b.m17249o(arrayList)) {
                        aVar.m2568b(" ");
                    }
                    C9072e c9072e117 = C9072e.f47360a;
                    aVar.m2569c(iM2570d2);
                } else {
                    iM2570d = aVar.m2570d(new C7214h(j13, 0L, (C8476m) null, (C8471h) null, (C8472i) null, (AbstractC0696b) null, (String) null, 0L, (C9791a) null, (C9800j) null, (C8948d) null, 0L, (C9798h) null, (C9152j0) null, 16382));
                    aVar.m2568b(str3);
                    if (i15 != C9000b.m17249o(arrayList)) {
                        aVar.m2568b(" ");
                    }
                    C9072e c9072e118 = C9072e.f47360a;
                    aVar.m2569c(iM2570d);
                }
                it = it15;
                i15 = i16;
            }
            TextKt.m1575b(aVar.m2571e(), interfaceC0500b3, 0L, 0L, null, null, null, 0L, null, c9797g2, 0L, 0, false, 0, null, null, c7218l2, composerImplMo1636j, ((i215 << 3) & 112) | ((i215 << 21) & 1879048192), (i215 << 15) & 3670016, 65020);
            InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q111115 = ComposerKt.f3003a;
            c7218l3 = c7218l2;
            c9797g3 = c9797g2;
            j14 = jM5355n;
            j15 = j13;
        } else {
            composerImplMo1636j.m1654s0();
            if ((i10 & 1) != 0) {
                if (i17 != 0) {
                    interfaceC0500b3 = InterfaceC0500b.a.f3325a;
                } else {
                    interfaceC0500b3 = interfaceC0500b2;
                }
                if ((i11 & 2) != 0) {
                    i12 &= -113;
                    c7218l2 = (C7218l) composerImplMo1636j.mo1648p(TextKt.f2808a);
                }
                if (i19 != 0) {
                    c9797g2 = null;
                }
                if ((i11 & 8) != 0) {
                    InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q111116 = ComposerKt.f3003a;
                    jM5355n = ((C1648d) composerImplMo1636j.mo1648p(ColorSchemeKt.f2735a)).m5355n();
                    i12 &= -7169;
                }
                if ((i11 & 16) != 0) {
                    j12 = ((C9169u) CustomColorSchemeKt.m10359a(composerImplMo1636j).f33945g.getValue()).f47705a;
                    i12 &= -57345;
                }
            } else {
                if (i17 != 0) {
                    interfaceC0500b3 = InterfaceC0500b.a.f3325a;
                } else {
                    interfaceC0500b3 = interfaceC0500b2;
                }
                if ((i11 & 2) != 0) {
                    i12 &= -113;
                    c7218l2 = (C7218l) composerImplMo1636j.mo1648p(TextKt.f2808a);
                }
                if (i19 != 0) {
                    c9797g2 = null;
                }
                if ((i11 & 8) != 0) {
                    InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q111117 = ComposerKt.f3003a;
                    jM5355n = ((C1648d) composerImplMo1636j.mo1648p(ColorSchemeKt.f2735a)).m5355n();
                    i12 &= -7169;
                }
                if ((i11 & 16) != 0) {
                    j12 = ((C9169u) CustomColorSchemeKt.m10359a(composerImplMo1636j).f33945g.getValue()).f47705a;
                    i12 &= -57345;
                }
            }
            int i216 = i12;
            j13 = j12;
            composerImplMo1636j.m1610R();
            InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q111118 = ComposerKt.f3003a;
            aVar = new C0689a.a();
            List listM14299s1111 = C7076b.m14299s3(str, new String[]{" "}, 0, 6);
            arrayList = new ArrayList();
            while (r14.hasNext()) {
                if (!C7661i.m15250P2((String) obj)) {
                    arrayList.add(obj);
                }
            }
            List listM14299s1112 = C7076b.m14299s3(str2, new String[]{" "}, 0, 6);
            arrayList2 = new ArrayList();
            while (r14.hasNext()) {
                if (!C7661i.m15250P2((String) obj2)) {
                    arrayList2.add(obj2);
                }
            }
            it = arrayList.iterator();
            i15 = 0;
            while (it.hasNext()) {
                next = it.next();
                i16 = i15 + 1;
                if (i15 < 0) {
                    C9000b.m17257w();
                    throw null;
                }
                Iterator it16 = it;
                str3 = (String) next;
                if (i15 <= C9000b.m17249o(arrayList2)) {
                    zM15249O2 = C7661i.m15249O2(str3, (String) arrayList2.get(i15));
                } else {
                    zM15249O2 = false;
                }
                if (zM15249O2) {
                    iM2570d2 = aVar.m2570d(new C7214h(jM5355n, 0L, (C8476m) null, (C8471h) null, (C8472i) null, (AbstractC0696b) null, (String) null, 0L, (C9791a) null, (C9800j) null, (C8948d) null, 0L, (C9798h) null, (C9152j0) null, 16382));
                    aVar.m2568b(str3);
                    if (i15 != C9000b.m17249o(arrayList)) {
                        aVar.m2568b(" ");
                    }
                    C9072e c9072e119 = C9072e.f47360a;
                    aVar.m2569c(iM2570d2);
                } else {
                    iM2570d = aVar.m2570d(new C7214h(j13, 0L, (C8476m) null, (C8471h) null, (C8472i) null, (AbstractC0696b) null, (String) null, 0L, (C9791a) null, (C9800j) null, (C8948d) null, 0L, (C9798h) null, (C9152j0) null, 16382));
                    aVar.m2568b(str3);
                    if (i15 != C9000b.m17249o(arrayList)) {
                        aVar.m2568b(" ");
                    }
                    C9072e c9072e1110 = C9072e.f47360a;
                    aVar.m2569c(iM2570d);
                }
                it = it16;
                i15 = i16;
            }
            TextKt.m1575b(aVar.m2571e(), interfaceC0500b3, 0L, 0L, null, null, null, 0L, null, c9797g2, 0L, 0, false, 0, null, null, c7218l2, composerImplMo1636j, ((i216 << 3) & 112) | ((i216 << 21) & 1879048192), (i216 << 15) & 3670016, 65020);
            InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q111119 = ComposerKt.f3003a;
            c7218l3 = c7218l2;
            c9797g3 = c9797g2;
            j14 = jM5355n;
            j15 = j13;
        }
        c5332q0M1612T = composerImplMo1636j.m1612T();
        if (c5332q0M1612T == null) {
            return;
        }
        c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: com.lingq.ui.commons.status.MatchingTextKt$MatchingText$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // cm.InterfaceC2056p
            /* JADX INFO: renamed from: m0 */
            public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) throws Throwable {
                num.intValue();
                MatchingTextKt.m9749a(interfaceC0500b3, c7218l3, c9797g3, j14, j15, str, str2, interfaceC0476a2, C8573r0.m16737l1(i10 | 1), i11);
                return C9072e.f47360a;
            }
        };
    }
}
