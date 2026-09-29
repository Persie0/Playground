package androidx.compose.foundation.text;

import androidx.compose.foundation.text.selection.SelectionRegistrarKt;
import androidx.compose.foundation.text.selection.TextSelectionColorsKt;
import androidx.compose.p017ui.ComposedModifierKt;
import androidx.compose.p017ui.InterfaceC0500b;
import androidx.compose.p017ui.layout.C0520a;
import androidx.compose.p017ui.node.ComposeUiNode;
import androidx.compose.p017ui.platform.CompositionLocalsKt;
import androidx.compose.p017ui.platform.InterfaceC0647n1;
import androidx.compose.p017ui.text.C0689a;
import androidx.compose.p017ui.text.C0691b;
import androidx.compose.p017ui.text.font.AbstractC0696b;
import androidx.compose.p017ui.unit.LayoutDirection;
import androidx.compose.runtime.C0480e;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.InterfaceC0476a;
import androidx.compose.runtime.saveable.C0487a;
import androidx.compose.runtime.saveable.SaverKt;
import cm.InterfaceC2041a;
import cm.InterfaceC2052l;
import cm.InterfaceC2056p;
import cm.InterfaceC2057q;
import com.kochava.tracker.BuildConfig;
import dm.C5207g;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.C6753d;
import kotlin.collections.EmptyList;
import p001a0.C0005d;
import p001a0.InterfaceC0004c;
import p081e0.C5304d1;
import p081e0.C5332q0;
import p081e0.C5340u0;
import p081e0.InterfaceC5299c;
import p081e0.InterfaceC5336s0;
import p230l0.C7204a;
import p231l1.C7213g;
import p231l1.C7216j;
import p231l1.C7218l;
import p338qd.C8573r0;
import p338qd.C8584v;
import p470x1.InterfaceC10015c;
import p519z.C10422a;
import p519z.C10423b;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
public final class BasicTextKt {
    /* JADX WARN: Code duplicated, block: B:100:0x0132  */
    /* JADX WARN: Code duplicated, block: B:102:0x0136  */
    /* JADX WARN: Code duplicated, block: B:103:0x0139  */
    /* JADX WARN: Code duplicated, block: B:105:0x013d  */
    /* JADX WARN: Code duplicated, block: B:106:0x0143  */
    /* JADX WARN: Code duplicated, block: B:108:0x0147  */
    /* JADX WARN: Code duplicated, block: B:109:0x014e  */
    /* JADX WARN: Code duplicated, block: B:114:0x0196  */
    /* JADX WARN: Code duplicated, block: B:116:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x004d  */
    /* JADX WARN: Code duplicated, block: B:27:0x0050  */
    /* JADX WARN: Code duplicated, block: B:29:0x0054  */
    /* JADX WARN: Code duplicated, block: B:31:0x005c  */
    /* JADX WARN: Code duplicated, block: B:32:0x005f  */
    /* JADX WARN: Code duplicated, block: B:37:0x006b  */
    /* JADX WARN: Code duplicated, block: B:38:0x006e  */
    /* JADX WARN: Code duplicated, block: B:40:0x0072  */
    /* JADX WARN: Code duplicated, block: B:42:0x007a  */
    /* JADX WARN: Code duplicated, block: B:43:0x007d  */
    /* JADX WARN: Code duplicated, block: B:48:0x008c  */
    /* JADX WARN: Code duplicated, block: B:49:0x008f  */
    /* JADX WARN: Code duplicated, block: B:51:0x0093  */
    /* JADX WARN: Code duplicated, block: B:53:0x009b  */
    /* JADX WARN: Code duplicated, block: B:54:0x009e  */
    /* JADX WARN: Code duplicated, block: B:59:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:60:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:64:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:65:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:69:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:70:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:74:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:75:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:82:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:88:0x0110 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:89:0x0112  */
    /* JADX WARN: Code duplicated, block: B:90:0x0117  */
    /* JADX WARN: Code duplicated, block: B:92:0x011b  */
    /* JADX WARN: Code duplicated, block: B:93:0x0120  */
    /* JADX WARN: Code duplicated, block: B:95:0x0124  */
    /* JADX WARN: Code duplicated, block: B:96:0x0129  */
    /* JADX WARN: Code duplicated, block: B:99:0x012f  */
    /* JADX INFO: renamed from: a */
    public static final void m1530a(final C0689a c0689a, InterfaceC0500b interfaceC0500b, C7218l c7218l, InterfaceC2052l interfaceC2052l, int i10, boolean z10, int i11, Map map, InterfaceC0476a interfaceC0476a, final int i12, final int i13) throws Throwable {
        int i14;
        int i15;
        int i16;
        int i17;
        InterfaceC2052l interfaceC2052l2;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        boolean z11;
        int i23;
        int i24;
        int i25;
        int i26;
        InterfaceC0500b interfaceC0500b2;
        C7218l c7218l2;
        InterfaceC2052l interfaceC2052l3;
        int i27;
        boolean z12;
        int i28;
        Map mapM13459L0;
        final Map map2;
        final int i29;
        final InterfaceC0500b interfaceC0500b3;
        final C7218l c7218l3;
        final InterfaceC2052l interfaceC2052l4;
        final int i30;
        final boolean z13;
        C5332q0 c5332q0M1612T;
        C5207g.m11111f(c0689a, "text");
        ComposerImpl composerImplMo1636j = interfaceC0476a.mo1636j(-648605928);
        if ((i13 & 1) != 0) {
            i14 = i12 | 6;
        } else if ((i12 & 14) == 0) {
            i14 = (composerImplMo1636j.mo1665y(c0689a) ? 4 : 2) | i12;
        } else {
            i14 = i12;
        }
        int i31 = i13 & 2;
        if (i31 == 0) {
            if ((i12 & 112) == 0) {
                i14 |= composerImplMo1636j.mo1665y(interfaceC0500b) ? 32 : 16;
            }
            i15 = i13 & 4;
            if (i15 != 0) {
                if ((i12 & 896) == 0) {
                    if (composerImplMo1636j.mo1665y(c7218l)) {
                        i16 = 256;
                    } else {
                        i16 = BuildConfig.SDK_TRUNCATE_LENGTH;
                    }
                    i14 |= i16;
                }
                i17 = i13 & 8;
                if (i17 != 0) {
                    if ((i12 & 7168) == 0) {
                        interfaceC2052l2 = interfaceC2052l;
                        if (composerImplMo1636j.m1600H(interfaceC2052l2)) {
                            i18 = 2048;
                        } else {
                            i18 = 1024;
                        }
                        i14 |= i18;
                    }
                    i19 = i13 & 16;
                    if (i19 != 0) {
                        if ((i12 & 57344) == 0) {
                            i20 = i10;
                            if (composerImplMo1636j.m1594E(i20)) {
                                i21 = 16384;
                            } else {
                                i21 = 8192;
                            }
                            i14 |= i21;
                        }
                        i22 = i13 & 32;
                        if (i22 != 0) {
                            i14 |= 196608;
                            z11 = z10;
                        } else {
                            z11 = z10;
                            if ((i12 & 458752) == 0) {
                                if (composerImplMo1636j.m1598G(z11)) {
                                    i23 = 131072;
                                } else {
                                    i23 = 65536;
                                }
                                i14 |= i23;
                            }
                        }
                        i24 = i13 & 64;
                        if (i24 != 0) {
                            i14 |= 1572864;
                        } else if ((i12 & 3670016) == 0) {
                            if (composerImplMo1636j.m1594E(i11)) {
                                i25 = 1048576;
                            } else {
                                i25 = 524288;
                            }
                            i14 |= i25;
                        }
                        i26 = i13 & BuildConfig.SDK_TRUNCATE_LENGTH;
                        if (i26 != 0) {
                            i14 |= 4194304;
                        }
                        if (i26 != 128 && (23967451 & i14) == 4793490 && composerImplMo1636j.mo1642m()) {
                            composerImplMo1636j.mo1650q();
                            interfaceC0500b3 = interfaceC0500b;
                            c7218l3 = c7218l;
                            map2 = map;
                            interfaceC2052l4 = interfaceC2052l2;
                            z13 = z11;
                            i30 = i20;
                            i29 = i11;
                        } else {
                            if (i31 != 0) {
                                interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                            } else {
                                interfaceC0500b2 = interfaceC0500b;
                            }
                            if (i15 != 0) {
                                c7218l2 = C7218l.f40599c;
                            } else {
                                c7218l2 = c7218l;
                            }
                            if (i17 != 0) {
                                interfaceC2052l3 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$8
                                    @Override // cm.InterfaceC2052l
                                    /* JADX INFO: renamed from: n */
                                    public final C9072e mo528n(C7216j c7216j) {
                                        C5207g.m11111f(c7216j, "it");
                                        return C9072e.f47360a;
                                    }
                                };
                            } else {
                                interfaceC2052l3 = interfaceC2052l2;
                            }
                            if (i19 != 0) {
                                i27 = 1;
                            } else {
                                i27 = i20;
                            }
                            if (i22 != 0) {
                                z12 = true;
                            } else {
                                z12 = z11;
                            }
                            if (i24 != 0) {
                                i28 = Integer.MAX_VALUE;
                            } else {
                                i28 = i11;
                            }
                            if (i26 != 0) {
                                mapM13459L0 = C6753d.m13459L0();
                            } else {
                                mapM13459L0 = map;
                            }
                            InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q = ComposerKt.f3003a;
                            map2 = mapM13459L0;
                            m1533d(c0689a, interfaceC0500b2, c7218l2, interfaceC2052l3, i27, z12, i28, 1, map2, composerImplMo1636j, 146800640 | (i14 & 14) | (i14 & 112) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (i14 & 458752) | (i14 & 3670016), 0);
                            i29 = i28;
                            interfaceC0500b3 = interfaceC0500b2;
                            c7218l3 = c7218l2;
                            interfaceC2052l4 = interfaceC2052l3;
                            i30 = i27;
                            z13 = z12;
                        }
                        c5332q0M1612T = composerImplMo1636j.m1612T();
                        if (c5332q0M1612T == null) {
                            return;
                        }
                        c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$9
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) throws Throwable {
                                num.intValue();
                                BasicTextKt.m1530a(c0689a, interfaceC0500b3, c7218l3, interfaceC2052l4, i30, z13, i29, map2, interfaceC0476a2, C8573r0.m16737l1(i12 | 1), i13);
                                return C9072e.f47360a;
                            }
                        };
                    }
                    i14 |= 24576;
                    i20 = i10;
                    i22 = i13 & 32;
                    if (i22 != 0) {
                        i14 |= 196608;
                        z11 = z10;
                    } else {
                        z11 = z10;
                        if ((i12 & 458752) == 0) {
                            if (composerImplMo1636j.m1598G(z11)) {
                                i23 = 131072;
                            } else {
                                i23 = 65536;
                            }
                            i14 |= i23;
                        }
                    }
                    i24 = i13 & 64;
                    if (i24 != 0) {
                        i14 |= 1572864;
                    } else if ((i12 & 3670016) == 0) {
                        if (composerImplMo1636j.m1594E(i11)) {
                            i25 = 1048576;
                        } else {
                            i25 = 524288;
                        }
                        i14 |= i25;
                    }
                    i26 = i13 & BuildConfig.SDK_TRUNCATE_LENGTH;
                    if (i26 != 0) {
                        i14 |= 4194304;
                    }
                    if (i26 != 128) {
                        if (i31 != 0) {
                            interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                        } else {
                            interfaceC0500b2 = interfaceC0500b;
                        }
                        if (i15 != 0) {
                            c7218l2 = C7218l.f40599c;
                        } else {
                            c7218l2 = c7218l;
                        }
                        if (i17 != 0) {
                            interfaceC2052l3 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$8
                                @Override // cm.InterfaceC2052l
                                /* JADX INFO: renamed from: n */
                                public final C9072e mo528n(C7216j c7216j) {
                                    C5207g.m11111f(c7216j, "it");
                                    return C9072e.f47360a;
                                }
                            };
                        } else {
                            interfaceC2052l3 = interfaceC2052l2;
                        }
                        if (i19 != 0) {
                            i27 = 1;
                        } else {
                            i27 = i20;
                        }
                        if (i22 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
                        }
                        if (i24 != 0) {
                            i28 = Integer.MAX_VALUE;
                        } else {
                            i28 = i11;
                        }
                        if (i26 != 0) {
                            mapM13459L0 = C6753d.m13459L0();
                        } else {
                            mapM13459L0 = map;
                        }
                        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q2 = ComposerKt.f3003a;
                        map2 = mapM13459L0;
                        m1533d(c0689a, interfaceC0500b2, c7218l2, interfaceC2052l3, i27, z12, i28, 1, map2, composerImplMo1636j, 146800640 | (i14 & 14) | (i14 & 112) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (i14 & 458752) | (i14 & 3670016), 0);
                        i29 = i28;
                        interfaceC0500b3 = interfaceC0500b2;
                        c7218l3 = c7218l2;
                        interfaceC2052l4 = interfaceC2052l3;
                        i30 = i27;
                        z13 = z12;
                    } else {
                        if (i31 != 0) {
                            interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                        } else {
                            interfaceC0500b2 = interfaceC0500b;
                        }
                        if (i15 != 0) {
                            c7218l2 = C7218l.f40599c;
                        } else {
                            c7218l2 = c7218l;
                        }
                        if (i17 != 0) {
                            interfaceC2052l3 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$8
                                @Override // cm.InterfaceC2052l
                                /* JADX INFO: renamed from: n */
                                public final C9072e mo528n(C7216j c7216j) {
                                    C5207g.m11111f(c7216j, "it");
                                    return C9072e.f47360a;
                                }
                            };
                        } else {
                            interfaceC2052l3 = interfaceC2052l2;
                        }
                        if (i19 != 0) {
                            i27 = 1;
                        } else {
                            i27 = i20;
                        }
                        if (i22 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
                        }
                        if (i24 != 0) {
                            i28 = Integer.MAX_VALUE;
                        } else {
                            i28 = i11;
                        }
                        if (i26 != 0) {
                            mapM13459L0 = C6753d.m13459L0();
                        } else {
                            mapM13459L0 = map;
                        }
                        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q3 = ComposerKt.f3003a;
                        map2 = mapM13459L0;
                        m1533d(c0689a, interfaceC0500b2, c7218l2, interfaceC2052l3, i27, z12, i28, 1, map2, composerImplMo1636j, 146800640 | (i14 & 14) | (i14 & 112) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (i14 & 458752) | (i14 & 3670016), 0);
                        i29 = i28;
                        interfaceC0500b3 = interfaceC0500b2;
                        c7218l3 = c7218l2;
                        interfaceC2052l4 = interfaceC2052l3;
                        i30 = i27;
                        z13 = z12;
                    }
                    c5332q0M1612T = composerImplMo1636j.m1612T();
                    if (c5332q0M1612T == null) {
                        return;
                    }
                    c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$9
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) throws Throwable {
                            num.intValue();
                            BasicTextKt.m1530a(c0689a, interfaceC0500b3, c7218l3, interfaceC2052l4, i30, z13, i29, map2, interfaceC0476a2, C8573r0.m16737l1(i12 | 1), i13);
                            return C9072e.f47360a;
                        }
                    };
                }
                i14 |= 3072;
                interfaceC2052l2 = interfaceC2052l;
                i19 = i13 & 16;
                if (i19 != 0) {
                    if ((i12 & 57344) == 0) {
                        i20 = i10;
                        if (composerImplMo1636j.m1594E(i20)) {
                            i21 = 16384;
                        } else {
                            i21 = 8192;
                        }
                        i14 |= i21;
                    }
                    i22 = i13 & 32;
                    if (i22 != 0) {
                        i14 |= 196608;
                        z11 = z10;
                    } else {
                        z11 = z10;
                        if ((i12 & 458752) == 0) {
                            if (composerImplMo1636j.m1598G(z11)) {
                                i23 = 131072;
                            } else {
                                i23 = 65536;
                            }
                            i14 |= i23;
                        }
                    }
                    i24 = i13 & 64;
                    if (i24 != 0) {
                        i14 |= 1572864;
                    } else if ((i12 & 3670016) == 0) {
                        if (composerImplMo1636j.m1594E(i11)) {
                            i25 = 1048576;
                        } else {
                            i25 = 524288;
                        }
                        i14 |= i25;
                    }
                    i26 = i13 & BuildConfig.SDK_TRUNCATE_LENGTH;
                    if (i26 != 0) {
                        i14 |= 4194304;
                    }
                    if (i26 != 128) {
                        if (i31 != 0) {
                            interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                        } else {
                            interfaceC0500b2 = interfaceC0500b;
                        }
                        if (i15 != 0) {
                            c7218l2 = C7218l.f40599c;
                        } else {
                            c7218l2 = c7218l;
                        }
                        if (i17 != 0) {
                            interfaceC2052l3 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$8
                                @Override // cm.InterfaceC2052l
                                /* JADX INFO: renamed from: n */
                                public final C9072e mo528n(C7216j c7216j) {
                                    C5207g.m11111f(c7216j, "it");
                                    return C9072e.f47360a;
                                }
                            };
                        } else {
                            interfaceC2052l3 = interfaceC2052l2;
                        }
                        if (i19 != 0) {
                            i27 = 1;
                        } else {
                            i27 = i20;
                        }
                        if (i22 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
                        }
                        if (i24 != 0) {
                            i28 = Integer.MAX_VALUE;
                        } else {
                            i28 = i11;
                        }
                        if (i26 != 0) {
                            mapM13459L0 = C6753d.m13459L0();
                        } else {
                            mapM13459L0 = map;
                        }
                        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q4 = ComposerKt.f3003a;
                        map2 = mapM13459L0;
                        m1533d(c0689a, interfaceC0500b2, c7218l2, interfaceC2052l3, i27, z12, i28, 1, map2, composerImplMo1636j, 146800640 | (i14 & 14) | (i14 & 112) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (i14 & 458752) | (i14 & 3670016), 0);
                        i29 = i28;
                        interfaceC0500b3 = interfaceC0500b2;
                        c7218l3 = c7218l2;
                        interfaceC2052l4 = interfaceC2052l3;
                        i30 = i27;
                        z13 = z12;
                    } else {
                        if (i31 != 0) {
                            interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                        } else {
                            interfaceC0500b2 = interfaceC0500b;
                        }
                        if (i15 != 0) {
                            c7218l2 = C7218l.f40599c;
                        } else {
                            c7218l2 = c7218l;
                        }
                        if (i17 != 0) {
                            interfaceC2052l3 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$8
                                @Override // cm.InterfaceC2052l
                                /* JADX INFO: renamed from: n */
                                public final C9072e mo528n(C7216j c7216j) {
                                    C5207g.m11111f(c7216j, "it");
                                    return C9072e.f47360a;
                                }
                            };
                        } else {
                            interfaceC2052l3 = interfaceC2052l2;
                        }
                        if (i19 != 0) {
                            i27 = 1;
                        } else {
                            i27 = i20;
                        }
                        if (i22 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
                        }
                        if (i24 != 0) {
                            i28 = Integer.MAX_VALUE;
                        } else {
                            i28 = i11;
                        }
                        if (i26 != 0) {
                            mapM13459L0 = C6753d.m13459L0();
                        } else {
                            mapM13459L0 = map;
                        }
                        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q5 = ComposerKt.f3003a;
                        map2 = mapM13459L0;
                        m1533d(c0689a, interfaceC0500b2, c7218l2, interfaceC2052l3, i27, z12, i28, 1, map2, composerImplMo1636j, 146800640 | (i14 & 14) | (i14 & 112) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (i14 & 458752) | (i14 & 3670016), 0);
                        i29 = i28;
                        interfaceC0500b3 = interfaceC0500b2;
                        c7218l3 = c7218l2;
                        interfaceC2052l4 = interfaceC2052l3;
                        i30 = i27;
                        z13 = z12;
                    }
                    c5332q0M1612T = composerImplMo1636j.m1612T();
                    if (c5332q0M1612T == null) {
                        return;
                    }
                    c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$9
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) throws Throwable {
                            num.intValue();
                            BasicTextKt.m1530a(c0689a, interfaceC0500b3, c7218l3, interfaceC2052l4, i30, z13, i29, map2, interfaceC0476a2, C8573r0.m16737l1(i12 | 1), i13);
                            return C9072e.f47360a;
                        }
                    };
                }
                i14 |= 24576;
                i20 = i10;
                i22 = i13 & 32;
                if (i22 != 0) {
                    i14 |= 196608;
                    z11 = z10;
                } else {
                    z11 = z10;
                    if ((i12 & 458752) == 0) {
                        if (composerImplMo1636j.m1598G(z11)) {
                            i23 = 131072;
                        } else {
                            i23 = 65536;
                        }
                        i14 |= i23;
                    }
                }
                i24 = i13 & 64;
                if (i24 != 0) {
                    i14 |= 1572864;
                } else if ((i12 & 3670016) == 0) {
                    if (composerImplMo1636j.m1594E(i11)) {
                        i25 = 1048576;
                    } else {
                        i25 = 524288;
                    }
                    i14 |= i25;
                }
                i26 = i13 & BuildConfig.SDK_TRUNCATE_LENGTH;
                if (i26 != 0) {
                    i14 |= 4194304;
                }
                if (i26 != 128) {
                    if (i31 != 0) {
                        interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                    } else {
                        interfaceC0500b2 = interfaceC0500b;
                    }
                    if (i15 != 0) {
                        c7218l2 = C7218l.f40599c;
                    } else {
                        c7218l2 = c7218l;
                    }
                    if (i17 != 0) {
                        interfaceC2052l3 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$8
                            @Override // cm.InterfaceC2052l
                            /* JADX INFO: renamed from: n */
                            public final C9072e mo528n(C7216j c7216j) {
                                C5207g.m11111f(c7216j, "it");
                                return C9072e.f47360a;
                            }
                        };
                    } else {
                        interfaceC2052l3 = interfaceC2052l2;
                    }
                    if (i19 != 0) {
                        i27 = 1;
                    } else {
                        i27 = i20;
                    }
                    if (i22 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if (i24 != 0) {
                        i28 = Integer.MAX_VALUE;
                    } else {
                        i28 = i11;
                    }
                    if (i26 != 0) {
                        mapM13459L0 = C6753d.m13459L0();
                    } else {
                        mapM13459L0 = map;
                    }
                    InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q6 = ComposerKt.f3003a;
                    map2 = mapM13459L0;
                    m1533d(c0689a, interfaceC0500b2, c7218l2, interfaceC2052l3, i27, z12, i28, 1, map2, composerImplMo1636j, 146800640 | (i14 & 14) | (i14 & 112) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (i14 & 458752) | (i14 & 3670016), 0);
                    i29 = i28;
                    interfaceC0500b3 = interfaceC0500b2;
                    c7218l3 = c7218l2;
                    interfaceC2052l4 = interfaceC2052l3;
                    i30 = i27;
                    z13 = z12;
                } else {
                    if (i31 != 0) {
                        interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                    } else {
                        interfaceC0500b2 = interfaceC0500b;
                    }
                    if (i15 != 0) {
                        c7218l2 = C7218l.f40599c;
                    } else {
                        c7218l2 = c7218l;
                    }
                    if (i17 != 0) {
                        interfaceC2052l3 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$8
                            @Override // cm.InterfaceC2052l
                            /* JADX INFO: renamed from: n */
                            public final C9072e mo528n(C7216j c7216j) {
                                C5207g.m11111f(c7216j, "it");
                                return C9072e.f47360a;
                            }
                        };
                    } else {
                        interfaceC2052l3 = interfaceC2052l2;
                    }
                    if (i19 != 0) {
                        i27 = 1;
                    } else {
                        i27 = i20;
                    }
                    if (i22 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if (i24 != 0) {
                        i28 = Integer.MAX_VALUE;
                    } else {
                        i28 = i11;
                    }
                    if (i26 != 0) {
                        mapM13459L0 = C6753d.m13459L0();
                    } else {
                        mapM13459L0 = map;
                    }
                    InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q7 = ComposerKt.f3003a;
                    map2 = mapM13459L0;
                    m1533d(c0689a, interfaceC0500b2, c7218l2, interfaceC2052l3, i27, z12, i28, 1, map2, composerImplMo1636j, 146800640 | (i14 & 14) | (i14 & 112) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (i14 & 458752) | (i14 & 3670016), 0);
                    i29 = i28;
                    interfaceC0500b3 = interfaceC0500b2;
                    c7218l3 = c7218l2;
                    interfaceC2052l4 = interfaceC2052l3;
                    i30 = i27;
                    z13 = z12;
                }
                c5332q0M1612T = composerImplMo1636j.m1612T();
                if (c5332q0M1612T == null) {
                    return;
                }
                c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$9
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // cm.InterfaceC2056p
                    /* JADX INFO: renamed from: m0 */
                    public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) throws Throwable {
                        num.intValue();
                        BasicTextKt.m1530a(c0689a, interfaceC0500b3, c7218l3, interfaceC2052l4, i30, z13, i29, map2, interfaceC0476a2, C8573r0.m16737l1(i12 | 1), i13);
                        return C9072e.f47360a;
                    }
                };
            }
            i14 |= 384;
            i17 = i13 & 8;
            if (i17 != 0) {
                if ((i12 & 7168) == 0) {
                    interfaceC2052l2 = interfaceC2052l;
                    if (composerImplMo1636j.m1600H(interfaceC2052l2)) {
                        i18 = 2048;
                    } else {
                        i18 = 1024;
                    }
                    i14 |= i18;
                }
                i19 = i13 & 16;
                if (i19 != 0) {
                    if ((i12 & 57344) == 0) {
                        i20 = i10;
                        if (composerImplMo1636j.m1594E(i20)) {
                            i21 = 16384;
                        } else {
                            i21 = 8192;
                        }
                        i14 |= i21;
                    }
                    i22 = i13 & 32;
                    if (i22 != 0) {
                        i14 |= 196608;
                        z11 = z10;
                    } else {
                        z11 = z10;
                        if ((i12 & 458752) == 0) {
                            if (composerImplMo1636j.m1598G(z11)) {
                                i23 = 131072;
                            } else {
                                i23 = 65536;
                            }
                            i14 |= i23;
                        }
                    }
                    i24 = i13 & 64;
                    if (i24 != 0) {
                        i14 |= 1572864;
                    } else if ((i12 & 3670016) == 0) {
                        if (composerImplMo1636j.m1594E(i11)) {
                            i25 = 1048576;
                        } else {
                            i25 = 524288;
                        }
                        i14 |= i25;
                    }
                    i26 = i13 & BuildConfig.SDK_TRUNCATE_LENGTH;
                    if (i26 != 0) {
                        i14 |= 4194304;
                    }
                    if (i26 != 128) {
                        if (i31 != 0) {
                            interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                        } else {
                            interfaceC0500b2 = interfaceC0500b;
                        }
                        if (i15 != 0) {
                            c7218l2 = C7218l.f40599c;
                        } else {
                            c7218l2 = c7218l;
                        }
                        if (i17 != 0) {
                            interfaceC2052l3 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$8
                                @Override // cm.InterfaceC2052l
                                /* JADX INFO: renamed from: n */
                                public final C9072e mo528n(C7216j c7216j) {
                                    C5207g.m11111f(c7216j, "it");
                                    return C9072e.f47360a;
                                }
                            };
                        } else {
                            interfaceC2052l3 = interfaceC2052l2;
                        }
                        if (i19 != 0) {
                            i27 = 1;
                        } else {
                            i27 = i20;
                        }
                        if (i22 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
                        }
                        if (i24 != 0) {
                            i28 = Integer.MAX_VALUE;
                        } else {
                            i28 = i11;
                        }
                        if (i26 != 0) {
                            mapM13459L0 = C6753d.m13459L0();
                        } else {
                            mapM13459L0 = map;
                        }
                        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q8 = ComposerKt.f3003a;
                        map2 = mapM13459L0;
                        m1533d(c0689a, interfaceC0500b2, c7218l2, interfaceC2052l3, i27, z12, i28, 1, map2, composerImplMo1636j, 146800640 | (i14 & 14) | (i14 & 112) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (i14 & 458752) | (i14 & 3670016), 0);
                        i29 = i28;
                        interfaceC0500b3 = interfaceC0500b2;
                        c7218l3 = c7218l2;
                        interfaceC2052l4 = interfaceC2052l3;
                        i30 = i27;
                        z13 = z12;
                    } else {
                        if (i31 != 0) {
                            interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                        } else {
                            interfaceC0500b2 = interfaceC0500b;
                        }
                        if (i15 != 0) {
                            c7218l2 = C7218l.f40599c;
                        } else {
                            c7218l2 = c7218l;
                        }
                        if (i17 != 0) {
                            interfaceC2052l3 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$8
                                @Override // cm.InterfaceC2052l
                                /* JADX INFO: renamed from: n */
                                public final C9072e mo528n(C7216j c7216j) {
                                    C5207g.m11111f(c7216j, "it");
                                    return C9072e.f47360a;
                                }
                            };
                        } else {
                            interfaceC2052l3 = interfaceC2052l2;
                        }
                        if (i19 != 0) {
                            i27 = 1;
                        } else {
                            i27 = i20;
                        }
                        if (i22 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
                        }
                        if (i24 != 0) {
                            i28 = Integer.MAX_VALUE;
                        } else {
                            i28 = i11;
                        }
                        if (i26 != 0) {
                            mapM13459L0 = C6753d.m13459L0();
                        } else {
                            mapM13459L0 = map;
                        }
                        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q9 = ComposerKt.f3003a;
                        map2 = mapM13459L0;
                        m1533d(c0689a, interfaceC0500b2, c7218l2, interfaceC2052l3, i27, z12, i28, 1, map2, composerImplMo1636j, 146800640 | (i14 & 14) | (i14 & 112) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (i14 & 458752) | (i14 & 3670016), 0);
                        i29 = i28;
                        interfaceC0500b3 = interfaceC0500b2;
                        c7218l3 = c7218l2;
                        interfaceC2052l4 = interfaceC2052l3;
                        i30 = i27;
                        z13 = z12;
                    }
                    c5332q0M1612T = composerImplMo1636j.m1612T();
                    if (c5332q0M1612T == null) {
                        return;
                    }
                    c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$9
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) throws Throwable {
                            num.intValue();
                            BasicTextKt.m1530a(c0689a, interfaceC0500b3, c7218l3, interfaceC2052l4, i30, z13, i29, map2, interfaceC0476a2, C8573r0.m16737l1(i12 | 1), i13);
                            return C9072e.f47360a;
                        }
                    };
                }
                i14 |= 24576;
                i20 = i10;
                i22 = i13 & 32;
                if (i22 != 0) {
                    i14 |= 196608;
                    z11 = z10;
                } else {
                    z11 = z10;
                    if ((i12 & 458752) == 0) {
                        if (composerImplMo1636j.m1598G(z11)) {
                            i23 = 131072;
                        } else {
                            i23 = 65536;
                        }
                        i14 |= i23;
                    }
                }
                i24 = i13 & 64;
                if (i24 != 0) {
                    i14 |= 1572864;
                } else if ((i12 & 3670016) == 0) {
                    if (composerImplMo1636j.m1594E(i11)) {
                        i25 = 1048576;
                    } else {
                        i25 = 524288;
                    }
                    i14 |= i25;
                }
                i26 = i13 & BuildConfig.SDK_TRUNCATE_LENGTH;
                if (i26 != 0) {
                    i14 |= 4194304;
                }
                if (i26 != 128) {
                    if (i31 != 0) {
                        interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                    } else {
                        interfaceC0500b2 = interfaceC0500b;
                    }
                    if (i15 != 0) {
                        c7218l2 = C7218l.f40599c;
                    } else {
                        c7218l2 = c7218l;
                    }
                    if (i17 != 0) {
                        interfaceC2052l3 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$8
                            @Override // cm.InterfaceC2052l
                            /* JADX INFO: renamed from: n */
                            public final C9072e mo528n(C7216j c7216j) {
                                C5207g.m11111f(c7216j, "it");
                                return C9072e.f47360a;
                            }
                        };
                    } else {
                        interfaceC2052l3 = interfaceC2052l2;
                    }
                    if (i19 != 0) {
                        i27 = 1;
                    } else {
                        i27 = i20;
                    }
                    if (i22 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if (i24 != 0) {
                        i28 = Integer.MAX_VALUE;
                    } else {
                        i28 = i11;
                    }
                    if (i26 != 0) {
                        mapM13459L0 = C6753d.m13459L0();
                    } else {
                        mapM13459L0 = map;
                    }
                    InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q10 = ComposerKt.f3003a;
                    map2 = mapM13459L0;
                    m1533d(c0689a, interfaceC0500b2, c7218l2, interfaceC2052l3, i27, z12, i28, 1, map2, composerImplMo1636j, 146800640 | (i14 & 14) | (i14 & 112) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (i14 & 458752) | (i14 & 3670016), 0);
                    i29 = i28;
                    interfaceC0500b3 = interfaceC0500b2;
                    c7218l3 = c7218l2;
                    interfaceC2052l4 = interfaceC2052l3;
                    i30 = i27;
                    z13 = z12;
                } else {
                    if (i31 != 0) {
                        interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                    } else {
                        interfaceC0500b2 = interfaceC0500b;
                    }
                    if (i15 != 0) {
                        c7218l2 = C7218l.f40599c;
                    } else {
                        c7218l2 = c7218l;
                    }
                    if (i17 != 0) {
                        interfaceC2052l3 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$8
                            @Override // cm.InterfaceC2052l
                            /* JADX INFO: renamed from: n */
                            public final C9072e mo528n(C7216j c7216j) {
                                C5207g.m11111f(c7216j, "it");
                                return C9072e.f47360a;
                            }
                        };
                    } else {
                        interfaceC2052l3 = interfaceC2052l2;
                    }
                    if (i19 != 0) {
                        i27 = 1;
                    } else {
                        i27 = i20;
                    }
                    if (i22 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if (i24 != 0) {
                        i28 = Integer.MAX_VALUE;
                    } else {
                        i28 = i11;
                    }
                    if (i26 != 0) {
                        mapM13459L0 = C6753d.m13459L0();
                    } else {
                        mapM13459L0 = map;
                    }
                    InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q11 = ComposerKt.f3003a;
                    map2 = mapM13459L0;
                    m1533d(c0689a, interfaceC0500b2, c7218l2, interfaceC2052l3, i27, z12, i28, 1, map2, composerImplMo1636j, 146800640 | (i14 & 14) | (i14 & 112) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (i14 & 458752) | (i14 & 3670016), 0);
                    i29 = i28;
                    interfaceC0500b3 = interfaceC0500b2;
                    c7218l3 = c7218l2;
                    interfaceC2052l4 = interfaceC2052l3;
                    i30 = i27;
                    z13 = z12;
                }
                c5332q0M1612T = composerImplMo1636j.m1612T();
                if (c5332q0M1612T == null) {
                    return;
                }
                c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$9
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // cm.InterfaceC2056p
                    /* JADX INFO: renamed from: m0 */
                    public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) throws Throwable {
                        num.intValue();
                        BasicTextKt.m1530a(c0689a, interfaceC0500b3, c7218l3, interfaceC2052l4, i30, z13, i29, map2, interfaceC0476a2, C8573r0.m16737l1(i12 | 1), i13);
                        return C9072e.f47360a;
                    }
                };
            }
            i14 |= 3072;
            interfaceC2052l2 = interfaceC2052l;
            i19 = i13 & 16;
            if (i19 != 0) {
                if ((i12 & 57344) == 0) {
                    i20 = i10;
                    if (composerImplMo1636j.m1594E(i20)) {
                        i21 = 16384;
                    } else {
                        i21 = 8192;
                    }
                    i14 |= i21;
                }
                i22 = i13 & 32;
                if (i22 != 0) {
                    i14 |= 196608;
                    z11 = z10;
                } else {
                    z11 = z10;
                    if ((i12 & 458752) == 0) {
                        if (composerImplMo1636j.m1598G(z11)) {
                            i23 = 131072;
                        } else {
                            i23 = 65536;
                        }
                        i14 |= i23;
                    }
                }
                i24 = i13 & 64;
                if (i24 != 0) {
                    i14 |= 1572864;
                } else if ((i12 & 3670016) == 0) {
                    if (composerImplMo1636j.m1594E(i11)) {
                        i25 = 1048576;
                    } else {
                        i25 = 524288;
                    }
                    i14 |= i25;
                }
                i26 = i13 & BuildConfig.SDK_TRUNCATE_LENGTH;
                if (i26 != 0) {
                    i14 |= 4194304;
                }
                if (i26 != 128) {
                    if (i31 != 0) {
                        interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                    } else {
                        interfaceC0500b2 = interfaceC0500b;
                    }
                    if (i15 != 0) {
                        c7218l2 = C7218l.f40599c;
                    } else {
                        c7218l2 = c7218l;
                    }
                    if (i17 != 0) {
                        interfaceC2052l3 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$8
                            @Override // cm.InterfaceC2052l
                            /* JADX INFO: renamed from: n */
                            public final C9072e mo528n(C7216j c7216j) {
                                C5207g.m11111f(c7216j, "it");
                                return C9072e.f47360a;
                            }
                        };
                    } else {
                        interfaceC2052l3 = interfaceC2052l2;
                    }
                    if (i19 != 0) {
                        i27 = 1;
                    } else {
                        i27 = i20;
                    }
                    if (i22 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if (i24 != 0) {
                        i28 = Integer.MAX_VALUE;
                    } else {
                        i28 = i11;
                    }
                    if (i26 != 0) {
                        mapM13459L0 = C6753d.m13459L0();
                    } else {
                        mapM13459L0 = map;
                    }
                    InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q12 = ComposerKt.f3003a;
                    map2 = mapM13459L0;
                    m1533d(c0689a, interfaceC0500b2, c7218l2, interfaceC2052l3, i27, z12, i28, 1, map2, composerImplMo1636j, 146800640 | (i14 & 14) | (i14 & 112) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (i14 & 458752) | (i14 & 3670016), 0);
                    i29 = i28;
                    interfaceC0500b3 = interfaceC0500b2;
                    c7218l3 = c7218l2;
                    interfaceC2052l4 = interfaceC2052l3;
                    i30 = i27;
                    z13 = z12;
                } else {
                    if (i31 != 0) {
                        interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                    } else {
                        interfaceC0500b2 = interfaceC0500b;
                    }
                    if (i15 != 0) {
                        c7218l2 = C7218l.f40599c;
                    } else {
                        c7218l2 = c7218l;
                    }
                    if (i17 != 0) {
                        interfaceC2052l3 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$8
                            @Override // cm.InterfaceC2052l
                            /* JADX INFO: renamed from: n */
                            public final C9072e mo528n(C7216j c7216j) {
                                C5207g.m11111f(c7216j, "it");
                                return C9072e.f47360a;
                            }
                        };
                    } else {
                        interfaceC2052l3 = interfaceC2052l2;
                    }
                    if (i19 != 0) {
                        i27 = 1;
                    } else {
                        i27 = i20;
                    }
                    if (i22 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if (i24 != 0) {
                        i28 = Integer.MAX_VALUE;
                    } else {
                        i28 = i11;
                    }
                    if (i26 != 0) {
                        mapM13459L0 = C6753d.m13459L0();
                    } else {
                        mapM13459L0 = map;
                    }
                    InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q13 = ComposerKt.f3003a;
                    map2 = mapM13459L0;
                    m1533d(c0689a, interfaceC0500b2, c7218l2, interfaceC2052l3, i27, z12, i28, 1, map2, composerImplMo1636j, 146800640 | (i14 & 14) | (i14 & 112) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (i14 & 458752) | (i14 & 3670016), 0);
                    i29 = i28;
                    interfaceC0500b3 = interfaceC0500b2;
                    c7218l3 = c7218l2;
                    interfaceC2052l4 = interfaceC2052l3;
                    i30 = i27;
                    z13 = z12;
                }
                c5332q0M1612T = composerImplMo1636j.m1612T();
                if (c5332q0M1612T == null) {
                    return;
                }
                c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$9
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // cm.InterfaceC2056p
                    /* JADX INFO: renamed from: m0 */
                    public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) throws Throwable {
                        num.intValue();
                        BasicTextKt.m1530a(c0689a, interfaceC0500b3, c7218l3, interfaceC2052l4, i30, z13, i29, map2, interfaceC0476a2, C8573r0.m16737l1(i12 | 1), i13);
                        return C9072e.f47360a;
                    }
                };
            }
            i14 |= 24576;
            i20 = i10;
            i22 = i13 & 32;
            if (i22 != 0) {
                i14 |= 196608;
                z11 = z10;
            } else {
                z11 = z10;
                if ((i12 & 458752) == 0) {
                    if (composerImplMo1636j.m1598G(z11)) {
                        i23 = 131072;
                    } else {
                        i23 = 65536;
                    }
                    i14 |= i23;
                }
            }
            i24 = i13 & 64;
            if (i24 != 0) {
                i14 |= 1572864;
            } else if ((i12 & 3670016) == 0) {
                if (composerImplMo1636j.m1594E(i11)) {
                    i25 = 1048576;
                } else {
                    i25 = 524288;
                }
                i14 |= i25;
            }
            i26 = i13 & BuildConfig.SDK_TRUNCATE_LENGTH;
            if (i26 != 0) {
                i14 |= 4194304;
            }
            if (i26 != 128) {
                if (i31 != 0) {
                    interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                } else {
                    interfaceC0500b2 = interfaceC0500b;
                }
                if (i15 != 0) {
                    c7218l2 = C7218l.f40599c;
                } else {
                    c7218l2 = c7218l;
                }
                if (i17 != 0) {
                    interfaceC2052l3 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$8
                        @Override // cm.InterfaceC2052l
                        /* JADX INFO: renamed from: n */
                        public final C9072e mo528n(C7216j c7216j) {
                            C5207g.m11111f(c7216j, "it");
                            return C9072e.f47360a;
                        }
                    };
                } else {
                    interfaceC2052l3 = interfaceC2052l2;
                }
                if (i19 != 0) {
                    i27 = 1;
                } else {
                    i27 = i20;
                }
                if (i22 != 0) {
                    z12 = true;
                } else {
                    z12 = z11;
                }
                if (i24 != 0) {
                    i28 = Integer.MAX_VALUE;
                } else {
                    i28 = i11;
                }
                if (i26 != 0) {
                    mapM13459L0 = C6753d.m13459L0();
                } else {
                    mapM13459L0 = map;
                }
                InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q14 = ComposerKt.f3003a;
                map2 = mapM13459L0;
                m1533d(c0689a, interfaceC0500b2, c7218l2, interfaceC2052l3, i27, z12, i28, 1, map2, composerImplMo1636j, 146800640 | (i14 & 14) | (i14 & 112) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (i14 & 458752) | (i14 & 3670016), 0);
                i29 = i28;
                interfaceC0500b3 = interfaceC0500b2;
                c7218l3 = c7218l2;
                interfaceC2052l4 = interfaceC2052l3;
                i30 = i27;
                z13 = z12;
            } else {
                if (i31 != 0) {
                    interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                } else {
                    interfaceC0500b2 = interfaceC0500b;
                }
                if (i15 != 0) {
                    c7218l2 = C7218l.f40599c;
                } else {
                    c7218l2 = c7218l;
                }
                if (i17 != 0) {
                    interfaceC2052l3 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$8
                        @Override // cm.InterfaceC2052l
                        /* JADX INFO: renamed from: n */
                        public final C9072e mo528n(C7216j c7216j) {
                            C5207g.m11111f(c7216j, "it");
                            return C9072e.f47360a;
                        }
                    };
                } else {
                    interfaceC2052l3 = interfaceC2052l2;
                }
                if (i19 != 0) {
                    i27 = 1;
                } else {
                    i27 = i20;
                }
                if (i22 != 0) {
                    z12 = true;
                } else {
                    z12 = z11;
                }
                if (i24 != 0) {
                    i28 = Integer.MAX_VALUE;
                } else {
                    i28 = i11;
                }
                if (i26 != 0) {
                    mapM13459L0 = C6753d.m13459L0();
                } else {
                    mapM13459L0 = map;
                }
                InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q15 = ComposerKt.f3003a;
                map2 = mapM13459L0;
                m1533d(c0689a, interfaceC0500b2, c7218l2, interfaceC2052l3, i27, z12, i28, 1, map2, composerImplMo1636j, 146800640 | (i14 & 14) | (i14 & 112) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (i14 & 458752) | (i14 & 3670016), 0);
                i29 = i28;
                interfaceC0500b3 = interfaceC0500b2;
                c7218l3 = c7218l2;
                interfaceC2052l4 = interfaceC2052l3;
                i30 = i27;
                z13 = z12;
            }
            c5332q0M1612T = composerImplMo1636j.m1612T();
            if (c5332q0M1612T == null) {
                return;
            }
            c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$9
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // cm.InterfaceC2056p
                /* JADX INFO: renamed from: m0 */
                public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) throws Throwable {
                    num.intValue();
                    BasicTextKt.m1530a(c0689a, interfaceC0500b3, c7218l3, interfaceC2052l4, i30, z13, i29, map2, interfaceC0476a2, C8573r0.m16737l1(i12 | 1), i13);
                    return C9072e.f47360a;
                }
            };
        }
        i14 |= 48;
        i15 = i13 & 4;
        if (i15 != 0) {
            if ((i12 & 896) == 0) {
                if (composerImplMo1636j.mo1665y(c7218l)) {
                    i16 = 256;
                } else {
                    i16 = BuildConfig.SDK_TRUNCATE_LENGTH;
                }
                i14 |= i16;
            }
            i17 = i13 & 8;
            if (i17 != 0) {
                if ((i12 & 7168) == 0) {
                    interfaceC2052l2 = interfaceC2052l;
                    if (composerImplMo1636j.m1600H(interfaceC2052l2)) {
                        i18 = 2048;
                    } else {
                        i18 = 1024;
                    }
                    i14 |= i18;
                }
                i19 = i13 & 16;
                if (i19 != 0) {
                    if ((i12 & 57344) == 0) {
                        i20 = i10;
                        if (composerImplMo1636j.m1594E(i20)) {
                            i21 = 16384;
                        } else {
                            i21 = 8192;
                        }
                        i14 |= i21;
                    }
                    i22 = i13 & 32;
                    if (i22 != 0) {
                        i14 |= 196608;
                        z11 = z10;
                    } else {
                        z11 = z10;
                        if ((i12 & 458752) == 0) {
                            if (composerImplMo1636j.m1598G(z11)) {
                                i23 = 131072;
                            } else {
                                i23 = 65536;
                            }
                            i14 |= i23;
                        }
                    }
                    i24 = i13 & 64;
                    if (i24 != 0) {
                        i14 |= 1572864;
                    } else if ((i12 & 3670016) == 0) {
                        if (composerImplMo1636j.m1594E(i11)) {
                            i25 = 1048576;
                        } else {
                            i25 = 524288;
                        }
                        i14 |= i25;
                    }
                    i26 = i13 & BuildConfig.SDK_TRUNCATE_LENGTH;
                    if (i26 != 0) {
                        i14 |= 4194304;
                    }
                    if (i26 != 128) {
                        if (i31 != 0) {
                            interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                        } else {
                            interfaceC0500b2 = interfaceC0500b;
                        }
                        if (i15 != 0) {
                            c7218l2 = C7218l.f40599c;
                        } else {
                            c7218l2 = c7218l;
                        }
                        if (i17 != 0) {
                            interfaceC2052l3 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$8
                                @Override // cm.InterfaceC2052l
                                /* JADX INFO: renamed from: n */
                                public final C9072e mo528n(C7216j c7216j) {
                                    C5207g.m11111f(c7216j, "it");
                                    return C9072e.f47360a;
                                }
                            };
                        } else {
                            interfaceC2052l3 = interfaceC2052l2;
                        }
                        if (i19 != 0) {
                            i27 = 1;
                        } else {
                            i27 = i20;
                        }
                        if (i22 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
                        }
                        if (i24 != 0) {
                            i28 = Integer.MAX_VALUE;
                        } else {
                            i28 = i11;
                        }
                        if (i26 != 0) {
                            mapM13459L0 = C6753d.m13459L0();
                        } else {
                            mapM13459L0 = map;
                        }
                        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q16 = ComposerKt.f3003a;
                        map2 = mapM13459L0;
                        m1533d(c0689a, interfaceC0500b2, c7218l2, interfaceC2052l3, i27, z12, i28, 1, map2, composerImplMo1636j, 146800640 | (i14 & 14) | (i14 & 112) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (i14 & 458752) | (i14 & 3670016), 0);
                        i29 = i28;
                        interfaceC0500b3 = interfaceC0500b2;
                        c7218l3 = c7218l2;
                        interfaceC2052l4 = interfaceC2052l3;
                        i30 = i27;
                        z13 = z12;
                    } else {
                        if (i31 != 0) {
                            interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                        } else {
                            interfaceC0500b2 = interfaceC0500b;
                        }
                        if (i15 != 0) {
                            c7218l2 = C7218l.f40599c;
                        } else {
                            c7218l2 = c7218l;
                        }
                        if (i17 != 0) {
                            interfaceC2052l3 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$8
                                @Override // cm.InterfaceC2052l
                                /* JADX INFO: renamed from: n */
                                public final C9072e mo528n(C7216j c7216j) {
                                    C5207g.m11111f(c7216j, "it");
                                    return C9072e.f47360a;
                                }
                            };
                        } else {
                            interfaceC2052l3 = interfaceC2052l2;
                        }
                        if (i19 != 0) {
                            i27 = 1;
                        } else {
                            i27 = i20;
                        }
                        if (i22 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
                        }
                        if (i24 != 0) {
                            i28 = Integer.MAX_VALUE;
                        } else {
                            i28 = i11;
                        }
                        if (i26 != 0) {
                            mapM13459L0 = C6753d.m13459L0();
                        } else {
                            mapM13459L0 = map;
                        }
                        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q17 = ComposerKt.f3003a;
                        map2 = mapM13459L0;
                        m1533d(c0689a, interfaceC0500b2, c7218l2, interfaceC2052l3, i27, z12, i28, 1, map2, composerImplMo1636j, 146800640 | (i14 & 14) | (i14 & 112) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (i14 & 458752) | (i14 & 3670016), 0);
                        i29 = i28;
                        interfaceC0500b3 = interfaceC0500b2;
                        c7218l3 = c7218l2;
                        interfaceC2052l4 = interfaceC2052l3;
                        i30 = i27;
                        z13 = z12;
                    }
                    c5332q0M1612T = composerImplMo1636j.m1612T();
                    if (c5332q0M1612T == null) {
                        return;
                    }
                    c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$9
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) throws Throwable {
                            num.intValue();
                            BasicTextKt.m1530a(c0689a, interfaceC0500b3, c7218l3, interfaceC2052l4, i30, z13, i29, map2, interfaceC0476a2, C8573r0.m16737l1(i12 | 1), i13);
                            return C9072e.f47360a;
                        }
                    };
                }
                i14 |= 24576;
                i20 = i10;
                i22 = i13 & 32;
                if (i22 != 0) {
                    i14 |= 196608;
                    z11 = z10;
                } else {
                    z11 = z10;
                    if ((i12 & 458752) == 0) {
                        if (composerImplMo1636j.m1598G(z11)) {
                            i23 = 131072;
                        } else {
                            i23 = 65536;
                        }
                        i14 |= i23;
                    }
                }
                i24 = i13 & 64;
                if (i24 != 0) {
                    i14 |= 1572864;
                } else if ((i12 & 3670016) == 0) {
                    if (composerImplMo1636j.m1594E(i11)) {
                        i25 = 1048576;
                    } else {
                        i25 = 524288;
                    }
                    i14 |= i25;
                }
                i26 = i13 & BuildConfig.SDK_TRUNCATE_LENGTH;
                if (i26 != 0) {
                    i14 |= 4194304;
                }
                if (i26 != 128) {
                    if (i31 != 0) {
                        interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                    } else {
                        interfaceC0500b2 = interfaceC0500b;
                    }
                    if (i15 != 0) {
                        c7218l2 = C7218l.f40599c;
                    } else {
                        c7218l2 = c7218l;
                    }
                    if (i17 != 0) {
                        interfaceC2052l3 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$8
                            @Override // cm.InterfaceC2052l
                            /* JADX INFO: renamed from: n */
                            public final C9072e mo528n(C7216j c7216j) {
                                C5207g.m11111f(c7216j, "it");
                                return C9072e.f47360a;
                            }
                        };
                    } else {
                        interfaceC2052l3 = interfaceC2052l2;
                    }
                    if (i19 != 0) {
                        i27 = 1;
                    } else {
                        i27 = i20;
                    }
                    if (i22 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if (i24 != 0) {
                        i28 = Integer.MAX_VALUE;
                    } else {
                        i28 = i11;
                    }
                    if (i26 != 0) {
                        mapM13459L0 = C6753d.m13459L0();
                    } else {
                        mapM13459L0 = map;
                    }
                    InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q18 = ComposerKt.f3003a;
                    map2 = mapM13459L0;
                    m1533d(c0689a, interfaceC0500b2, c7218l2, interfaceC2052l3, i27, z12, i28, 1, map2, composerImplMo1636j, 146800640 | (i14 & 14) | (i14 & 112) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (i14 & 458752) | (i14 & 3670016), 0);
                    i29 = i28;
                    interfaceC0500b3 = interfaceC0500b2;
                    c7218l3 = c7218l2;
                    interfaceC2052l4 = interfaceC2052l3;
                    i30 = i27;
                    z13 = z12;
                } else {
                    if (i31 != 0) {
                        interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                    } else {
                        interfaceC0500b2 = interfaceC0500b;
                    }
                    if (i15 != 0) {
                        c7218l2 = C7218l.f40599c;
                    } else {
                        c7218l2 = c7218l;
                    }
                    if (i17 != 0) {
                        interfaceC2052l3 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$8
                            @Override // cm.InterfaceC2052l
                            /* JADX INFO: renamed from: n */
                            public final C9072e mo528n(C7216j c7216j) {
                                C5207g.m11111f(c7216j, "it");
                                return C9072e.f47360a;
                            }
                        };
                    } else {
                        interfaceC2052l3 = interfaceC2052l2;
                    }
                    if (i19 != 0) {
                        i27 = 1;
                    } else {
                        i27 = i20;
                    }
                    if (i22 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if (i24 != 0) {
                        i28 = Integer.MAX_VALUE;
                    } else {
                        i28 = i11;
                    }
                    if (i26 != 0) {
                        mapM13459L0 = C6753d.m13459L0();
                    } else {
                        mapM13459L0 = map;
                    }
                    InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q19 = ComposerKt.f3003a;
                    map2 = mapM13459L0;
                    m1533d(c0689a, interfaceC0500b2, c7218l2, interfaceC2052l3, i27, z12, i28, 1, map2, composerImplMo1636j, 146800640 | (i14 & 14) | (i14 & 112) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (i14 & 458752) | (i14 & 3670016), 0);
                    i29 = i28;
                    interfaceC0500b3 = interfaceC0500b2;
                    c7218l3 = c7218l2;
                    interfaceC2052l4 = interfaceC2052l3;
                    i30 = i27;
                    z13 = z12;
                }
                c5332q0M1612T = composerImplMo1636j.m1612T();
                if (c5332q0M1612T == null) {
                    return;
                }
                c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$9
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // cm.InterfaceC2056p
                    /* JADX INFO: renamed from: m0 */
                    public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) throws Throwable {
                        num.intValue();
                        BasicTextKt.m1530a(c0689a, interfaceC0500b3, c7218l3, interfaceC2052l4, i30, z13, i29, map2, interfaceC0476a2, C8573r0.m16737l1(i12 | 1), i13);
                        return C9072e.f47360a;
                    }
                };
            }
            i14 |= 3072;
            interfaceC2052l2 = interfaceC2052l;
            i19 = i13 & 16;
            if (i19 != 0) {
                if ((i12 & 57344) == 0) {
                    i20 = i10;
                    if (composerImplMo1636j.m1594E(i20)) {
                        i21 = 16384;
                    } else {
                        i21 = 8192;
                    }
                    i14 |= i21;
                }
                i22 = i13 & 32;
                if (i22 != 0) {
                    i14 |= 196608;
                    z11 = z10;
                } else {
                    z11 = z10;
                    if ((i12 & 458752) == 0) {
                        if (composerImplMo1636j.m1598G(z11)) {
                            i23 = 131072;
                        } else {
                            i23 = 65536;
                        }
                        i14 |= i23;
                    }
                }
                i24 = i13 & 64;
                if (i24 != 0) {
                    i14 |= 1572864;
                } else if ((i12 & 3670016) == 0) {
                    if (composerImplMo1636j.m1594E(i11)) {
                        i25 = 1048576;
                    } else {
                        i25 = 524288;
                    }
                    i14 |= i25;
                }
                i26 = i13 & BuildConfig.SDK_TRUNCATE_LENGTH;
                if (i26 != 0) {
                    i14 |= 4194304;
                }
                if (i26 != 128) {
                    if (i31 != 0) {
                        interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                    } else {
                        interfaceC0500b2 = interfaceC0500b;
                    }
                    if (i15 != 0) {
                        c7218l2 = C7218l.f40599c;
                    } else {
                        c7218l2 = c7218l;
                    }
                    if (i17 != 0) {
                        interfaceC2052l3 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$8
                            @Override // cm.InterfaceC2052l
                            /* JADX INFO: renamed from: n */
                            public final C9072e mo528n(C7216j c7216j) {
                                C5207g.m11111f(c7216j, "it");
                                return C9072e.f47360a;
                            }
                        };
                    } else {
                        interfaceC2052l3 = interfaceC2052l2;
                    }
                    if (i19 != 0) {
                        i27 = 1;
                    } else {
                        i27 = i20;
                    }
                    if (i22 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if (i24 != 0) {
                        i28 = Integer.MAX_VALUE;
                    } else {
                        i28 = i11;
                    }
                    if (i26 != 0) {
                        mapM13459L0 = C6753d.m13459L0();
                    } else {
                        mapM13459L0 = map;
                    }
                    InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q110 = ComposerKt.f3003a;
                    map2 = mapM13459L0;
                    m1533d(c0689a, interfaceC0500b2, c7218l2, interfaceC2052l3, i27, z12, i28, 1, map2, composerImplMo1636j, 146800640 | (i14 & 14) | (i14 & 112) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (i14 & 458752) | (i14 & 3670016), 0);
                    i29 = i28;
                    interfaceC0500b3 = interfaceC0500b2;
                    c7218l3 = c7218l2;
                    interfaceC2052l4 = interfaceC2052l3;
                    i30 = i27;
                    z13 = z12;
                } else {
                    if (i31 != 0) {
                        interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                    } else {
                        interfaceC0500b2 = interfaceC0500b;
                    }
                    if (i15 != 0) {
                        c7218l2 = C7218l.f40599c;
                    } else {
                        c7218l2 = c7218l;
                    }
                    if (i17 != 0) {
                        interfaceC2052l3 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$8
                            @Override // cm.InterfaceC2052l
                            /* JADX INFO: renamed from: n */
                            public final C9072e mo528n(C7216j c7216j) {
                                C5207g.m11111f(c7216j, "it");
                                return C9072e.f47360a;
                            }
                        };
                    } else {
                        interfaceC2052l3 = interfaceC2052l2;
                    }
                    if (i19 != 0) {
                        i27 = 1;
                    } else {
                        i27 = i20;
                    }
                    if (i22 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if (i24 != 0) {
                        i28 = Integer.MAX_VALUE;
                    } else {
                        i28 = i11;
                    }
                    if (i26 != 0) {
                        mapM13459L0 = C6753d.m13459L0();
                    } else {
                        mapM13459L0 = map;
                    }
                    InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q111 = ComposerKt.f3003a;
                    map2 = mapM13459L0;
                    m1533d(c0689a, interfaceC0500b2, c7218l2, interfaceC2052l3, i27, z12, i28, 1, map2, composerImplMo1636j, 146800640 | (i14 & 14) | (i14 & 112) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (i14 & 458752) | (i14 & 3670016), 0);
                    i29 = i28;
                    interfaceC0500b3 = interfaceC0500b2;
                    c7218l3 = c7218l2;
                    interfaceC2052l4 = interfaceC2052l3;
                    i30 = i27;
                    z13 = z12;
                }
                c5332q0M1612T = composerImplMo1636j.m1612T();
                if (c5332q0M1612T == null) {
                    return;
                }
                c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$9
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // cm.InterfaceC2056p
                    /* JADX INFO: renamed from: m0 */
                    public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) throws Throwable {
                        num.intValue();
                        BasicTextKt.m1530a(c0689a, interfaceC0500b3, c7218l3, interfaceC2052l4, i30, z13, i29, map2, interfaceC0476a2, C8573r0.m16737l1(i12 | 1), i13);
                        return C9072e.f47360a;
                    }
                };
            }
            i14 |= 24576;
            i20 = i10;
            i22 = i13 & 32;
            if (i22 != 0) {
                i14 |= 196608;
                z11 = z10;
            } else {
                z11 = z10;
                if ((i12 & 458752) == 0) {
                    if (composerImplMo1636j.m1598G(z11)) {
                        i23 = 131072;
                    } else {
                        i23 = 65536;
                    }
                    i14 |= i23;
                }
            }
            i24 = i13 & 64;
            if (i24 != 0) {
                i14 |= 1572864;
            } else if ((i12 & 3670016) == 0) {
                if (composerImplMo1636j.m1594E(i11)) {
                    i25 = 1048576;
                } else {
                    i25 = 524288;
                }
                i14 |= i25;
            }
            i26 = i13 & BuildConfig.SDK_TRUNCATE_LENGTH;
            if (i26 != 0) {
                i14 |= 4194304;
            }
            if (i26 != 128) {
                if (i31 != 0) {
                    interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                } else {
                    interfaceC0500b2 = interfaceC0500b;
                }
                if (i15 != 0) {
                    c7218l2 = C7218l.f40599c;
                } else {
                    c7218l2 = c7218l;
                }
                if (i17 != 0) {
                    interfaceC2052l3 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$8
                        @Override // cm.InterfaceC2052l
                        /* JADX INFO: renamed from: n */
                        public final C9072e mo528n(C7216j c7216j) {
                            C5207g.m11111f(c7216j, "it");
                            return C9072e.f47360a;
                        }
                    };
                } else {
                    interfaceC2052l3 = interfaceC2052l2;
                }
                if (i19 != 0) {
                    i27 = 1;
                } else {
                    i27 = i20;
                }
                if (i22 != 0) {
                    z12 = true;
                } else {
                    z12 = z11;
                }
                if (i24 != 0) {
                    i28 = Integer.MAX_VALUE;
                } else {
                    i28 = i11;
                }
                if (i26 != 0) {
                    mapM13459L0 = C6753d.m13459L0();
                } else {
                    mapM13459L0 = map;
                }
                InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q112 = ComposerKt.f3003a;
                map2 = mapM13459L0;
                m1533d(c0689a, interfaceC0500b2, c7218l2, interfaceC2052l3, i27, z12, i28, 1, map2, composerImplMo1636j, 146800640 | (i14 & 14) | (i14 & 112) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (i14 & 458752) | (i14 & 3670016), 0);
                i29 = i28;
                interfaceC0500b3 = interfaceC0500b2;
                c7218l3 = c7218l2;
                interfaceC2052l4 = interfaceC2052l3;
                i30 = i27;
                z13 = z12;
            } else {
                if (i31 != 0) {
                    interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                } else {
                    interfaceC0500b2 = interfaceC0500b;
                }
                if (i15 != 0) {
                    c7218l2 = C7218l.f40599c;
                } else {
                    c7218l2 = c7218l;
                }
                if (i17 != 0) {
                    interfaceC2052l3 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$8
                        @Override // cm.InterfaceC2052l
                        /* JADX INFO: renamed from: n */
                        public final C9072e mo528n(C7216j c7216j) {
                            C5207g.m11111f(c7216j, "it");
                            return C9072e.f47360a;
                        }
                    };
                } else {
                    interfaceC2052l3 = interfaceC2052l2;
                }
                if (i19 != 0) {
                    i27 = 1;
                } else {
                    i27 = i20;
                }
                if (i22 != 0) {
                    z12 = true;
                } else {
                    z12 = z11;
                }
                if (i24 != 0) {
                    i28 = Integer.MAX_VALUE;
                } else {
                    i28 = i11;
                }
                if (i26 != 0) {
                    mapM13459L0 = C6753d.m13459L0();
                } else {
                    mapM13459L0 = map;
                }
                InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q113 = ComposerKt.f3003a;
                map2 = mapM13459L0;
                m1533d(c0689a, interfaceC0500b2, c7218l2, interfaceC2052l3, i27, z12, i28, 1, map2, composerImplMo1636j, 146800640 | (i14 & 14) | (i14 & 112) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (i14 & 458752) | (i14 & 3670016), 0);
                i29 = i28;
                interfaceC0500b3 = interfaceC0500b2;
                c7218l3 = c7218l2;
                interfaceC2052l4 = interfaceC2052l3;
                i30 = i27;
                z13 = z12;
            }
            c5332q0M1612T = composerImplMo1636j.m1612T();
            if (c5332q0M1612T == null) {
                return;
            }
            c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$9
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // cm.InterfaceC2056p
                /* JADX INFO: renamed from: m0 */
                public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) throws Throwable {
                    num.intValue();
                    BasicTextKt.m1530a(c0689a, interfaceC0500b3, c7218l3, interfaceC2052l4, i30, z13, i29, map2, interfaceC0476a2, C8573r0.m16737l1(i12 | 1), i13);
                    return C9072e.f47360a;
                }
            };
        }
        i14 |= 384;
        i17 = i13 & 8;
        if (i17 != 0) {
            if ((i12 & 7168) == 0) {
                interfaceC2052l2 = interfaceC2052l;
                if (composerImplMo1636j.m1600H(interfaceC2052l2)) {
                    i18 = 2048;
                } else {
                    i18 = 1024;
                }
                i14 |= i18;
            }
            i19 = i13 & 16;
            if (i19 != 0) {
                if ((i12 & 57344) == 0) {
                    i20 = i10;
                    if (composerImplMo1636j.m1594E(i20)) {
                        i21 = 16384;
                    } else {
                        i21 = 8192;
                    }
                    i14 |= i21;
                }
                i22 = i13 & 32;
                if (i22 != 0) {
                    i14 |= 196608;
                    z11 = z10;
                } else {
                    z11 = z10;
                    if ((i12 & 458752) == 0) {
                        if (composerImplMo1636j.m1598G(z11)) {
                            i23 = 131072;
                        } else {
                            i23 = 65536;
                        }
                        i14 |= i23;
                    }
                }
                i24 = i13 & 64;
                if (i24 != 0) {
                    i14 |= 1572864;
                } else if ((i12 & 3670016) == 0) {
                    if (composerImplMo1636j.m1594E(i11)) {
                        i25 = 1048576;
                    } else {
                        i25 = 524288;
                    }
                    i14 |= i25;
                }
                i26 = i13 & BuildConfig.SDK_TRUNCATE_LENGTH;
                if (i26 != 0) {
                    i14 |= 4194304;
                }
                if (i26 != 128) {
                    if (i31 != 0) {
                        interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                    } else {
                        interfaceC0500b2 = interfaceC0500b;
                    }
                    if (i15 != 0) {
                        c7218l2 = C7218l.f40599c;
                    } else {
                        c7218l2 = c7218l;
                    }
                    if (i17 != 0) {
                        interfaceC2052l3 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$8
                            @Override // cm.InterfaceC2052l
                            /* JADX INFO: renamed from: n */
                            public final C9072e mo528n(C7216j c7216j) {
                                C5207g.m11111f(c7216j, "it");
                                return C9072e.f47360a;
                            }
                        };
                    } else {
                        interfaceC2052l3 = interfaceC2052l2;
                    }
                    if (i19 != 0) {
                        i27 = 1;
                    } else {
                        i27 = i20;
                    }
                    if (i22 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if (i24 != 0) {
                        i28 = Integer.MAX_VALUE;
                    } else {
                        i28 = i11;
                    }
                    if (i26 != 0) {
                        mapM13459L0 = C6753d.m13459L0();
                    } else {
                        mapM13459L0 = map;
                    }
                    InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q114 = ComposerKt.f3003a;
                    map2 = mapM13459L0;
                    m1533d(c0689a, interfaceC0500b2, c7218l2, interfaceC2052l3, i27, z12, i28, 1, map2, composerImplMo1636j, 146800640 | (i14 & 14) | (i14 & 112) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (i14 & 458752) | (i14 & 3670016), 0);
                    i29 = i28;
                    interfaceC0500b3 = interfaceC0500b2;
                    c7218l3 = c7218l2;
                    interfaceC2052l4 = interfaceC2052l3;
                    i30 = i27;
                    z13 = z12;
                } else {
                    if (i31 != 0) {
                        interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                    } else {
                        interfaceC0500b2 = interfaceC0500b;
                    }
                    if (i15 != 0) {
                        c7218l2 = C7218l.f40599c;
                    } else {
                        c7218l2 = c7218l;
                    }
                    if (i17 != 0) {
                        interfaceC2052l3 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$8
                            @Override // cm.InterfaceC2052l
                            /* JADX INFO: renamed from: n */
                            public final C9072e mo528n(C7216j c7216j) {
                                C5207g.m11111f(c7216j, "it");
                                return C9072e.f47360a;
                            }
                        };
                    } else {
                        interfaceC2052l3 = interfaceC2052l2;
                    }
                    if (i19 != 0) {
                        i27 = 1;
                    } else {
                        i27 = i20;
                    }
                    if (i22 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if (i24 != 0) {
                        i28 = Integer.MAX_VALUE;
                    } else {
                        i28 = i11;
                    }
                    if (i26 != 0) {
                        mapM13459L0 = C6753d.m13459L0();
                    } else {
                        mapM13459L0 = map;
                    }
                    InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q115 = ComposerKt.f3003a;
                    map2 = mapM13459L0;
                    m1533d(c0689a, interfaceC0500b2, c7218l2, interfaceC2052l3, i27, z12, i28, 1, map2, composerImplMo1636j, 146800640 | (i14 & 14) | (i14 & 112) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (i14 & 458752) | (i14 & 3670016), 0);
                    i29 = i28;
                    interfaceC0500b3 = interfaceC0500b2;
                    c7218l3 = c7218l2;
                    interfaceC2052l4 = interfaceC2052l3;
                    i30 = i27;
                    z13 = z12;
                }
                c5332q0M1612T = composerImplMo1636j.m1612T();
                if (c5332q0M1612T == null) {
                    return;
                }
                c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$9
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // cm.InterfaceC2056p
                    /* JADX INFO: renamed from: m0 */
                    public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) throws Throwable {
                        num.intValue();
                        BasicTextKt.m1530a(c0689a, interfaceC0500b3, c7218l3, interfaceC2052l4, i30, z13, i29, map2, interfaceC0476a2, C8573r0.m16737l1(i12 | 1), i13);
                        return C9072e.f47360a;
                    }
                };
            }
            i14 |= 24576;
            i20 = i10;
            i22 = i13 & 32;
            if (i22 != 0) {
                i14 |= 196608;
                z11 = z10;
            } else {
                z11 = z10;
                if ((i12 & 458752) == 0) {
                    if (composerImplMo1636j.m1598G(z11)) {
                        i23 = 131072;
                    } else {
                        i23 = 65536;
                    }
                    i14 |= i23;
                }
            }
            i24 = i13 & 64;
            if (i24 != 0) {
                i14 |= 1572864;
            } else if ((i12 & 3670016) == 0) {
                if (composerImplMo1636j.m1594E(i11)) {
                    i25 = 1048576;
                } else {
                    i25 = 524288;
                }
                i14 |= i25;
            }
            i26 = i13 & BuildConfig.SDK_TRUNCATE_LENGTH;
            if (i26 != 0) {
                i14 |= 4194304;
            }
            if (i26 != 128) {
                if (i31 != 0) {
                    interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                } else {
                    interfaceC0500b2 = interfaceC0500b;
                }
                if (i15 != 0) {
                    c7218l2 = C7218l.f40599c;
                } else {
                    c7218l2 = c7218l;
                }
                if (i17 != 0) {
                    interfaceC2052l3 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$8
                        @Override // cm.InterfaceC2052l
                        /* JADX INFO: renamed from: n */
                        public final C9072e mo528n(C7216j c7216j) {
                            C5207g.m11111f(c7216j, "it");
                            return C9072e.f47360a;
                        }
                    };
                } else {
                    interfaceC2052l3 = interfaceC2052l2;
                }
                if (i19 != 0) {
                    i27 = 1;
                } else {
                    i27 = i20;
                }
                if (i22 != 0) {
                    z12 = true;
                } else {
                    z12 = z11;
                }
                if (i24 != 0) {
                    i28 = Integer.MAX_VALUE;
                } else {
                    i28 = i11;
                }
                if (i26 != 0) {
                    mapM13459L0 = C6753d.m13459L0();
                } else {
                    mapM13459L0 = map;
                }
                InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q116 = ComposerKt.f3003a;
                map2 = mapM13459L0;
                m1533d(c0689a, interfaceC0500b2, c7218l2, interfaceC2052l3, i27, z12, i28, 1, map2, composerImplMo1636j, 146800640 | (i14 & 14) | (i14 & 112) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (i14 & 458752) | (i14 & 3670016), 0);
                i29 = i28;
                interfaceC0500b3 = interfaceC0500b2;
                c7218l3 = c7218l2;
                interfaceC2052l4 = interfaceC2052l3;
                i30 = i27;
                z13 = z12;
            } else {
                if (i31 != 0) {
                    interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                } else {
                    interfaceC0500b2 = interfaceC0500b;
                }
                if (i15 != 0) {
                    c7218l2 = C7218l.f40599c;
                } else {
                    c7218l2 = c7218l;
                }
                if (i17 != 0) {
                    interfaceC2052l3 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$8
                        @Override // cm.InterfaceC2052l
                        /* JADX INFO: renamed from: n */
                        public final C9072e mo528n(C7216j c7216j) {
                            C5207g.m11111f(c7216j, "it");
                            return C9072e.f47360a;
                        }
                    };
                } else {
                    interfaceC2052l3 = interfaceC2052l2;
                }
                if (i19 != 0) {
                    i27 = 1;
                } else {
                    i27 = i20;
                }
                if (i22 != 0) {
                    z12 = true;
                } else {
                    z12 = z11;
                }
                if (i24 != 0) {
                    i28 = Integer.MAX_VALUE;
                } else {
                    i28 = i11;
                }
                if (i26 != 0) {
                    mapM13459L0 = C6753d.m13459L0();
                } else {
                    mapM13459L0 = map;
                }
                InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q117 = ComposerKt.f3003a;
                map2 = mapM13459L0;
                m1533d(c0689a, interfaceC0500b2, c7218l2, interfaceC2052l3, i27, z12, i28, 1, map2, composerImplMo1636j, 146800640 | (i14 & 14) | (i14 & 112) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (i14 & 458752) | (i14 & 3670016), 0);
                i29 = i28;
                interfaceC0500b3 = interfaceC0500b2;
                c7218l3 = c7218l2;
                interfaceC2052l4 = interfaceC2052l3;
                i30 = i27;
                z13 = z12;
            }
            c5332q0M1612T = composerImplMo1636j.m1612T();
            if (c5332q0M1612T == null) {
                return;
            }
            c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$9
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // cm.InterfaceC2056p
                /* JADX INFO: renamed from: m0 */
                public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) throws Throwable {
                    num.intValue();
                    BasicTextKt.m1530a(c0689a, interfaceC0500b3, c7218l3, interfaceC2052l4, i30, z13, i29, map2, interfaceC0476a2, C8573r0.m16737l1(i12 | 1), i13);
                    return C9072e.f47360a;
                }
            };
        }
        i14 |= 3072;
        interfaceC2052l2 = interfaceC2052l;
        i19 = i13 & 16;
        if (i19 != 0) {
            if ((i12 & 57344) == 0) {
                i20 = i10;
                if (composerImplMo1636j.m1594E(i20)) {
                    i21 = 16384;
                } else {
                    i21 = 8192;
                }
                i14 |= i21;
            }
            i22 = i13 & 32;
            if (i22 != 0) {
                i14 |= 196608;
                z11 = z10;
            } else {
                z11 = z10;
                if ((i12 & 458752) == 0) {
                    if (composerImplMo1636j.m1598G(z11)) {
                        i23 = 131072;
                    } else {
                        i23 = 65536;
                    }
                    i14 |= i23;
                }
            }
            i24 = i13 & 64;
            if (i24 != 0) {
                i14 |= 1572864;
            } else if ((i12 & 3670016) == 0) {
                if (composerImplMo1636j.m1594E(i11)) {
                    i25 = 1048576;
                } else {
                    i25 = 524288;
                }
                i14 |= i25;
            }
            i26 = i13 & BuildConfig.SDK_TRUNCATE_LENGTH;
            if (i26 != 0) {
                i14 |= 4194304;
            }
            if (i26 != 128) {
                if (i31 != 0) {
                    interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                } else {
                    interfaceC0500b2 = interfaceC0500b;
                }
                if (i15 != 0) {
                    c7218l2 = C7218l.f40599c;
                } else {
                    c7218l2 = c7218l;
                }
                if (i17 != 0) {
                    interfaceC2052l3 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$8
                        @Override // cm.InterfaceC2052l
                        /* JADX INFO: renamed from: n */
                        public final C9072e mo528n(C7216j c7216j) {
                            C5207g.m11111f(c7216j, "it");
                            return C9072e.f47360a;
                        }
                    };
                } else {
                    interfaceC2052l3 = interfaceC2052l2;
                }
                if (i19 != 0) {
                    i27 = 1;
                } else {
                    i27 = i20;
                }
                if (i22 != 0) {
                    z12 = true;
                } else {
                    z12 = z11;
                }
                if (i24 != 0) {
                    i28 = Integer.MAX_VALUE;
                } else {
                    i28 = i11;
                }
                if (i26 != 0) {
                    mapM13459L0 = C6753d.m13459L0();
                } else {
                    mapM13459L0 = map;
                }
                InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q118 = ComposerKt.f3003a;
                map2 = mapM13459L0;
                m1533d(c0689a, interfaceC0500b2, c7218l2, interfaceC2052l3, i27, z12, i28, 1, map2, composerImplMo1636j, 146800640 | (i14 & 14) | (i14 & 112) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (i14 & 458752) | (i14 & 3670016), 0);
                i29 = i28;
                interfaceC0500b3 = interfaceC0500b2;
                c7218l3 = c7218l2;
                interfaceC2052l4 = interfaceC2052l3;
                i30 = i27;
                z13 = z12;
            } else {
                if (i31 != 0) {
                    interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                } else {
                    interfaceC0500b2 = interfaceC0500b;
                }
                if (i15 != 0) {
                    c7218l2 = C7218l.f40599c;
                } else {
                    c7218l2 = c7218l;
                }
                if (i17 != 0) {
                    interfaceC2052l3 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$8
                        @Override // cm.InterfaceC2052l
                        /* JADX INFO: renamed from: n */
                        public final C9072e mo528n(C7216j c7216j) {
                            C5207g.m11111f(c7216j, "it");
                            return C9072e.f47360a;
                        }
                    };
                } else {
                    interfaceC2052l3 = interfaceC2052l2;
                }
                if (i19 != 0) {
                    i27 = 1;
                } else {
                    i27 = i20;
                }
                if (i22 != 0) {
                    z12 = true;
                } else {
                    z12 = z11;
                }
                if (i24 != 0) {
                    i28 = Integer.MAX_VALUE;
                } else {
                    i28 = i11;
                }
                if (i26 != 0) {
                    mapM13459L0 = C6753d.m13459L0();
                } else {
                    mapM13459L0 = map;
                }
                InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q119 = ComposerKt.f3003a;
                map2 = mapM13459L0;
                m1533d(c0689a, interfaceC0500b2, c7218l2, interfaceC2052l3, i27, z12, i28, 1, map2, composerImplMo1636j, 146800640 | (i14 & 14) | (i14 & 112) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (i14 & 458752) | (i14 & 3670016), 0);
                i29 = i28;
                interfaceC0500b3 = interfaceC0500b2;
                c7218l3 = c7218l2;
                interfaceC2052l4 = interfaceC2052l3;
                i30 = i27;
                z13 = z12;
            }
            c5332q0M1612T = composerImplMo1636j.m1612T();
            if (c5332q0M1612T == null) {
                return;
            }
            c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$9
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // cm.InterfaceC2056p
                /* JADX INFO: renamed from: m0 */
                public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) throws Throwable {
                    num.intValue();
                    BasicTextKt.m1530a(c0689a, interfaceC0500b3, c7218l3, interfaceC2052l4, i30, z13, i29, map2, interfaceC0476a2, C8573r0.m16737l1(i12 | 1), i13);
                    return C9072e.f47360a;
                }
            };
        }
        i14 |= 24576;
        i20 = i10;
        i22 = i13 & 32;
        if (i22 != 0) {
            i14 |= 196608;
            z11 = z10;
        } else {
            z11 = z10;
            if ((i12 & 458752) == 0) {
                if (composerImplMo1636j.m1598G(z11)) {
                    i23 = 131072;
                } else {
                    i23 = 65536;
                }
                i14 |= i23;
            }
        }
        i24 = i13 & 64;
        if (i24 != 0) {
            i14 |= 1572864;
        } else if ((i12 & 3670016) == 0) {
            if (composerImplMo1636j.m1594E(i11)) {
                i25 = 1048576;
            } else {
                i25 = 524288;
            }
            i14 |= i25;
        }
        i26 = i13 & BuildConfig.SDK_TRUNCATE_LENGTH;
        if (i26 != 0) {
            i14 |= 4194304;
        }
        if (i26 != 128) {
            if (i31 != 0) {
                interfaceC0500b2 = InterfaceC0500b.a.f3325a;
            } else {
                interfaceC0500b2 = interfaceC0500b;
            }
            if (i15 != 0) {
                c7218l2 = C7218l.f40599c;
            } else {
                c7218l2 = c7218l;
            }
            if (i17 != 0) {
                interfaceC2052l3 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$8
                    @Override // cm.InterfaceC2052l
                    /* JADX INFO: renamed from: n */
                    public final C9072e mo528n(C7216j c7216j) {
                        C5207g.m11111f(c7216j, "it");
                        return C9072e.f47360a;
                    }
                };
            } else {
                interfaceC2052l3 = interfaceC2052l2;
            }
            if (i19 != 0) {
                i27 = 1;
            } else {
                i27 = i20;
            }
            if (i22 != 0) {
                z12 = true;
            } else {
                z12 = z11;
            }
            if (i24 != 0) {
                i28 = Integer.MAX_VALUE;
            } else {
                i28 = i11;
            }
            if (i26 != 0) {
                mapM13459L0 = C6753d.m13459L0();
            } else {
                mapM13459L0 = map;
            }
            InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q1110 = ComposerKt.f3003a;
            map2 = mapM13459L0;
            m1533d(c0689a, interfaceC0500b2, c7218l2, interfaceC2052l3, i27, z12, i28, 1, map2, composerImplMo1636j, 146800640 | (i14 & 14) | (i14 & 112) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (i14 & 458752) | (i14 & 3670016), 0);
            i29 = i28;
            interfaceC0500b3 = interfaceC0500b2;
            c7218l3 = c7218l2;
            interfaceC2052l4 = interfaceC2052l3;
            i30 = i27;
            z13 = z12;
        } else {
            if (i31 != 0) {
                interfaceC0500b2 = InterfaceC0500b.a.f3325a;
            } else {
                interfaceC0500b2 = interfaceC0500b;
            }
            if (i15 != 0) {
                c7218l2 = C7218l.f40599c;
            } else {
                c7218l2 = c7218l;
            }
            if (i17 != 0) {
                interfaceC2052l3 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$8
                    @Override // cm.InterfaceC2052l
                    /* JADX INFO: renamed from: n */
                    public final C9072e mo528n(C7216j c7216j) {
                        C5207g.m11111f(c7216j, "it");
                        return C9072e.f47360a;
                    }
                };
            } else {
                interfaceC2052l3 = interfaceC2052l2;
            }
            if (i19 != 0) {
                i27 = 1;
            } else {
                i27 = i20;
            }
            if (i22 != 0) {
                z12 = true;
            } else {
                z12 = z11;
            }
            if (i24 != 0) {
                i28 = Integer.MAX_VALUE;
            } else {
                i28 = i11;
            }
            if (i26 != 0) {
                mapM13459L0 = C6753d.m13459L0();
            } else {
                mapM13459L0 = map;
            }
            InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q1111 = ComposerKt.f3003a;
            map2 = mapM13459L0;
            m1533d(c0689a, interfaceC0500b2, c7218l2, interfaceC2052l3, i27, z12, i28, 1, map2, composerImplMo1636j, 146800640 | (i14 & 14) | (i14 & 112) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (i14 & 458752) | (i14 & 3670016), 0);
            i29 = i28;
            interfaceC0500b3 = interfaceC0500b2;
            c7218l3 = c7218l2;
            interfaceC2052l4 = interfaceC2052l3;
            i30 = i27;
            z13 = z12;
        }
        c5332q0M1612T = composerImplMo1636j.m1612T();
        if (c5332q0M1612T == null) {
            return;
        }
        c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$9
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // cm.InterfaceC2056p
            /* JADX INFO: renamed from: m0 */
            public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) throws Throwable {
                num.intValue();
                BasicTextKt.m1530a(c0689a, interfaceC0500b3, c7218l3, interfaceC2052l4, i30, z13, i29, map2, interfaceC0476a2, C8573r0.m16737l1(i12 | 1), i13);
                return C9072e.f47360a;
            }
        };
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0137  */
    /* JADX WARN: Code duplicated, block: B:102:0x013a  */
    /* JADX WARN: Code duplicated, block: B:103:0x013c  */
    /* JADX WARN: Code duplicated, block: B:105:0x0140  */
    /* JADX WARN: Code duplicated, block: B:106:0x0144  */
    /* JADX WARN: Code duplicated, block: B:108:0x0148  */
    /* JADX WARN: Code duplicated, block: B:109:0x014b  */
    /* JADX WARN: Code duplicated, block: B:112:0x0174  */
    /* JADX WARN: Code duplicated, block: B:113:0x0179  */
    /* JADX WARN: Code duplicated, block: B:116:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:117:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:120:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:122:0x0217  */
    /* JADX WARN: Code duplicated, block: B:139:0x0242  */
    /* JADX WARN: Code duplicated, block: B:143:0x0279  */
    /* JADX WARN: Code duplicated, block: B:146:0x02c7  */
    /* JADX WARN: Code duplicated, block: B:148:0x02ce  */
    /* JADX WARN: Code duplicated, block: B:149:0x02d7  */
    /* JADX WARN: Code duplicated, block: B:154:0x0313  */
    /* JADX WARN: Code duplicated, block: B:156:0x0322  */
    /* JADX WARN: Code duplicated, block: B:158:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x004e  */
    /* JADX WARN: Code duplicated, block: B:27:0x0051  */
    /* JADX WARN: Code duplicated, block: B:29:0x0055  */
    /* JADX WARN: Code duplicated, block: B:31:0x005d  */
    /* JADX WARN: Code duplicated, block: B:32:0x0062  */
    /* JADX WARN: Code duplicated, block: B:37:0x006c  */
    /* JADX WARN: Code duplicated, block: B:38:0x006f  */
    /* JADX WARN: Code duplicated, block: B:40:0x0073  */
    /* JADX WARN: Code duplicated, block: B:42:0x007b  */
    /* JADX WARN: Code duplicated, block: B:43:0x007e  */
    /* JADX WARN: Code duplicated, block: B:48:0x0088  */
    /* JADX WARN: Code duplicated, block: B:49:0x008b  */
    /* JADX WARN: Code duplicated, block: B:51:0x0091  */
    /* JADX WARN: Code duplicated, block: B:53:0x0099  */
    /* JADX WARN: Code duplicated, block: B:54:0x009e  */
    /* JADX WARN: Code duplicated, block: B:59:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:60:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:64:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:65:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:69:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:70:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:74:0x00df  */
    /* JADX WARN: Code duplicated, block: B:75:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:79:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:80:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:82:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:84:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:85:0x0102  */
    /* JADX WARN: Code duplicated, block: B:89:0x0110  */
    /* JADX WARN: Code duplicated, block: B:93:0x0126 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:94:0x0128  */
    /* JADX WARN: Code duplicated, block: B:96:0x012d  */
    /* JADX WARN: Code duplicated, block: B:98:0x0132  */
    /* JADX INFO: renamed from: b */
    public static final void m1531b(final String str, InterfaceC0500b interfaceC0500b, C7218l c7218l, InterfaceC2052l<? super C7216j, C9072e> interfaceC2052l, int i10, boolean z10, int i11, int i12, InterfaceC0476a interfaceC0476a, final int i13, final int i14) {
        int i15;
        InterfaceC0500b interfaceC0500b2;
        int i16;
        C7218l c7218l2;
        int i17;
        int i18;
        InterfaceC2052l<? super C7216j, C9072e> interfaceC2052l2;
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
        boolean z11;
        int i29;
        int i30;
        final InterfaceC0004c interfaceC0004c;
        InterfaceC10015c interfaceC10015c;
        AbstractC0696b.a aVar;
        long jLongValue;
        long j10;
        Object objM1619a0;
        TextController textController;
        TextState textState;
        InterfaceC0500b interfaceC0500b3;
        InterfaceC10015c interfaceC10015c2;
        LayoutDirection layoutDirection;
        InterfaceC0647n1 interfaceC0647n1;
        InterfaceC0500b interfaceC0500bM1928b;
        final InterfaceC2041a<ComposeUiNode> interfaceC2041a;
        final boolean z12;
        final InterfaceC0500b interfaceC0500b4;
        final InterfaceC2052l<? super C7216j, C9072e> interfaceC2052l3;
        final int i31;
        final int i32;
        final int i33;
        final C7218l c7218l3;
        C10423b c10423b;
        C5332q0 c5332q0M1612T;
        C5207g.m11111f(str, "text");
        ComposerImpl composerImplMo1636j = interfaceC0476a.mo1636j(1542716361);
        if ((i14 & 1) != 0) {
            i15 = i13 | 6;
        } else if ((i13 & 14) == 0) {
            i15 = (composerImplMo1636j.mo1665y(str) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i34 = i14 & 2;
        if (i34 == 0) {
            if ((i13 & 112) == 0) {
                interfaceC0500b2 = interfaceC0500b;
                i15 |= composerImplMo1636j.mo1665y(interfaceC0500b2) ? 32 : 16;
            }
            i16 = i14 & 4;
            if (i16 != 0) {
                if ((i13 & 896) == 0) {
                    c7218l2 = c7218l;
                    if (composerImplMo1636j.mo1665y(c7218l2)) {
                        i17 = 256;
                    } else {
                        i17 = BuildConfig.SDK_TRUNCATE_LENGTH;
                    }
                    i15 |= i17;
                }
                i18 = i14 & 8;
                if (i18 != 0) {
                    if ((i13 & 7168) == 0) {
                        interfaceC2052l2 = interfaceC2052l;
                        if (composerImplMo1636j.m1600H(interfaceC2052l2)) {
                            i19 = 2048;
                        } else {
                            i19 = 1024;
                        }
                        i15 |= i19;
                    }
                    i20 = i14 & 16;
                    if (i20 != 0) {
                        if ((57344 & i13) == 0) {
                            i21 = i10;
                            if (composerImplMo1636j.m1594E(i21)) {
                                i22 = 16384;
                            } else {
                                i22 = 8192;
                            }
                            i15 |= i22;
                        }
                        i23 = i14 & 32;
                        if (i23 != 0) {
                            i15 |= 196608;
                        } else if ((i13 & 458752) == 0) {
                            if (composerImplMo1636j.m1598G(z10)) {
                                i24 = 131072;
                            } else {
                                i24 = 65536;
                            }
                            i15 |= i24;
                        }
                        i25 = i14 & 64;
                        if (i25 != 0) {
                            i15 |= 1572864;
                        } else if ((i13 & 3670016) == 0) {
                            if (composerImplMo1636j.m1594E(i11)) {
                                i26 = 1048576;
                            } else {
                                i26 = 524288;
                            }
                            i15 |= i26;
                        }
                        i27 = i14 & BuildConfig.SDK_TRUNCATE_LENGTH;
                        if (i27 != 0) {
                            i15 |= 12582912;
                        } else if ((i13 & 29360128) == 0) {
                            if (composerImplMo1636j.m1594E(i12)) {
                                i28 = 8388608;
                            } else {
                                i28 = 4194304;
                            }
                            i15 |= i28;
                        }
                        if ((i15 & 23967451) == 4793490 || !composerImplMo1636j.mo1642m()) {
                            if (i34 != 0) {
                                interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                            }
                            if (i16 != 0) {
                                c7218l2 = C7218l.f40599c;
                            }
                            if (i18 != 0) {
                                interfaceC2052l2 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$1
                                    @Override // cm.InterfaceC2052l
                                    /* JADX INFO: renamed from: n */
                                    public final C9072e mo528n(C7216j c7216j) {
                                        C5207g.m11111f(c7216j, "it");
                                        return C9072e.f47360a;
                                    }
                                };
                            }
                            if (i20 != 0) {
                                i21 = 1;
                            }
                            if (i23 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            if (i25 != 0) {
                                i29 = Integer.MAX_VALUE;
                            } else {
                                i29 = i11;
                            }
                            if (i27 != 0) {
                                i30 = 1;
                            } else {
                                i30 = i12;
                            }
                            InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q = ComposerKt.f3003a;
                            C8584v.m16781D(i30, i29);
                            interfaceC0004c = (InterfaceC0004c) composerImplMo1636j.mo1648p(SelectionRegistrarKt.f2569a);
                            C5304d1 c5304d1 = CompositionLocalsKt.f4137e;
                            interfaceC10015c = (InterfaceC10015c) composerImplMo1636j.mo1648p(c5304d1);
                            aVar = (AbstractC0696b.a) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4140h);
                            composerImplMo1636j.mo1622c(959238681);
                            if (interfaceC0004c == null) {
                                jLongValue = 0;
                            } else {
                                jLongValue = ((Number) C0487a.m1860a(new Object[]{str, interfaceC0004c}, SaverKt.m1859a(new BasicTextKt$selectionIdSaver$1(interfaceC0004c), BasicTextKt$selectionIdSaver$2.f2523b), new InterfaceC2041a<Long>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$selectableId$1
                                    {
                                        super(0);
                                    }

                                    @Override // cm.InterfaceC2041a
                                    /* JADX INFO: renamed from: E */
                                    public final Long mo807E() {
                                        return Long.valueOf(interfaceC0004c.m6b());
                                    }
                                }, composerImplMo1636j, 4)).longValue();
                            }
                            j10 = jLongValue;
                            composerImplMo1636j.m1609Q(false);
                            composerImplMo1636j.mo1622c(-492369756);
                            objM1619a0 = composerImplMo1636j.m1619a0();
                            if (objM1619a0 == InterfaceC0476a.a.f3122a) {
                                objM1619a0 = new TextController(new TextState(new C10423b(new C0689a(str), c7218l2, i29, i30, z11, i21, interfaceC10015c, aVar), j10));
                                composerImplMo1636j.m1597F0(objM1619a0);
                            }
                            composerImplMo1636j.m1609Q(false);
                            textController = (TextController) objM1619a0;
                            textState = textController.f2539a;
                            if (!composerImplMo1636j.f2897L) {
                                c10423b = textState.f2563d;
                                Pair<List<C0689a.b<C7213g>>, List<C0689a.b<InterfaceC2057q<String, InterfaceC0476a, Integer, C9072e>>>> pair = CoreTextKt.f2526a;
                                C5207g.m11111f(c10423b, "current");
                                C5207g.m11111f(c7218l2, "style");
                                C5207g.m11111f(interfaceC10015c, "density");
                                C5207g.m11111f(aVar, "fontFamilyResolver");
                                if (!C5207g.m11106a(c10423b.f52258a.f4523a, str) && C5207g.m11106a(c10423b.f52259b, c7218l2) && c10423b.f52262e == z11) {
                                    if (!(c10423b.f52263f == i21) || c10423b.f52260c != i29 || c10423b.f52261d != i30 || !C5207g.m11106a(c10423b.f52264g, interfaceC10015c) || c10423b.f52265h != aVar) {
                                        c10423b = new C10423b(new C0689a(str), c7218l2, i29, i30, z11, i21, interfaceC10015c, aVar);
                                    }
                                } else {
                                    c10423b = new C10423b(new C0689a(str), c7218l2, i29, i30, z11, i21, interfaceC10015c, aVar);
                                }
                                textController.m1540f(c10423b);
                            }
                            textState.getClass();
                            C5207g.m11111f(interfaceC2052l2, "<set-?>");
                            textState.f2561b = interfaceC2052l2;
                            textController.m1541g(interfaceC0004c);
                            composerImplMo1636j.mo1622c(959240076);
                            if (interfaceC0004c != null) {
                                long j11 = ((C0005d) composerImplMo1636j.mo1648p(TextSelectionColorsKt.f2571a)).f3b;
                            }
                            composerImplMo1636j.m1609Q(false);
                            interfaceC0500b3 = interfaceC0500b2;
                            InterfaceC0500b interfaceC0500bMo1929K = interfaceC0500b3.mo1929K(textController.m1539e());
                            composerImplMo1636j.mo1622c(544976794);
                            interfaceC10015c2 = (InterfaceC10015c) composerImplMo1636j.mo1648p(c5304d1);
                            layoutDirection = (LayoutDirection) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4143k);
                            interfaceC0647n1 = (InterfaceC0647n1) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4148p);
                            interfaceC0500bM1928b = ComposedModifierKt.m1928b(composerImplMo1636j, interfaceC0500bMo1929K);
                            ComposeUiNode.f3726n.getClass();
                            interfaceC2041a = ComposeUiNode.Companion.f3728b;
                            composerImplMo1636j.mo1622c(1405779621);
                            if (!(composerImplMo1636j.f2910a instanceof InterfaceC5299c)) {
                                C8573r0.m16771y0();
                                throw null;
                            }
                            composerImplMo1636j.mo1640l();
                            if (composerImplMo1636j.f2897L) {
                                composerImplMo1636j.mo1634i(new InterfaceC2041a<ComposeUiNode>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText-4YKlhWE$$inlined$Layout$1
                                    {
                                        super(0);
                                    }

                                    /* JADX WARN: Type inference failed for: r3v1, types: [androidx.compose.ui.node.ComposeUiNode, java.lang.Object] */
                                    @Override // cm.InterfaceC2041a
                                    /* JADX INFO: renamed from: E */
                                    public final ComposeUiNode mo807E() {
                                        return interfaceC2041a.mo807E();
                                    }
                                });
                            } else {
                                composerImplMo1636j.mo1653s();
                            }
                            C8573r0.m16714a1(composerImplMo1636j, textController.f2542d, ComposeUiNode.Companion.f3731e);
                            C8573r0.m16714a1(composerImplMo1636j, interfaceC10015c2, ComposeUiNode.Companion.f3730d);
                            C8573r0.m16714a1(composerImplMo1636j, layoutDirection, ComposeUiNode.Companion.f3732f);
                            C8573r0.m16714a1(composerImplMo1636j, interfaceC0647n1, ComposeUiNode.Companion.f3733g);
                            C8573r0.m16714a1(composerImplMo1636j, interfaceC0500bM1928b, ComposeUiNode.Companion.f3729c);
                            composerImplMo1636j.m1609Q(true);
                            composerImplMo1636j.m1609Q(false);
                            composerImplMo1636j.m1609Q(false);
                            z12 = z11;
                            interfaceC0500b4 = interfaceC0500b3;
                            interfaceC2052l3 = interfaceC2052l2;
                            i31 = i29;
                            i32 = i21;
                            C7218l c7218l4 = c7218l2;
                            i33 = i30;
                            c7218l3 = c7218l4;
                        } else {
                            composerImplMo1636j.mo1650q();
                            i31 = i11;
                            interfaceC0500b4 = interfaceC0500b2;
                            c7218l3 = c7218l2;
                            interfaceC2052l3 = interfaceC2052l2;
                            i32 = i21;
                            z12 = z10;
                            i33 = i12;
                        }
                        c5332q0M1612T = composerImplMo1636j.m1612T();
                        if (c5332q0M1612T == null) {
                            return;
                        }
                        c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                                num.intValue();
                                BasicTextKt.m1531b(str, interfaceC0500b4, c7218l3, interfaceC2052l3, i32, z12, i31, i33, interfaceC0476a2, C8573r0.m16737l1(i13 | 1), i14);
                                return C9072e.f47360a;
                            }
                        };
                    }
                    i15 |= 24576;
                    i21 = i10;
                    i23 = i14 & 32;
                    if (i23 != 0) {
                        i15 |= 196608;
                    } else if ((i13 & 458752) == 0) {
                        if (composerImplMo1636j.m1598G(z10)) {
                            i24 = 131072;
                        } else {
                            i24 = 65536;
                        }
                        i15 |= i24;
                    }
                    i25 = i14 & 64;
                    if (i25 != 0) {
                        i15 |= 1572864;
                    } else if ((i13 & 3670016) == 0) {
                        if (composerImplMo1636j.m1594E(i11)) {
                            i26 = 1048576;
                        } else {
                            i26 = 524288;
                        }
                        i15 |= i26;
                    }
                    i27 = i14 & BuildConfig.SDK_TRUNCATE_LENGTH;
                    if (i27 != 0) {
                        i15 |= 12582912;
                    } else if ((i13 & 29360128) == 0) {
                        if (composerImplMo1636j.m1594E(i12)) {
                            i28 = 8388608;
                        } else {
                            i28 = 4194304;
                        }
                        i15 |= i28;
                    }
                    if ((i15 & 23967451) == 4793490) {
                        if (i34 != 0) {
                            interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                        }
                        if (i16 != 0) {
                            c7218l2 = C7218l.f40599c;
                        }
                        if (i18 != 0) {
                            interfaceC2052l2 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$1
                                @Override // cm.InterfaceC2052l
                                /* JADX INFO: renamed from: n */
                                public final C9072e mo528n(C7216j c7216j) {
                                    C5207g.m11111f(c7216j, "it");
                                    return C9072e.f47360a;
                                }
                            };
                        }
                        if (i20 != 0) {
                            i21 = 1;
                        }
                        if (i23 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if (i25 != 0) {
                            i29 = Integer.MAX_VALUE;
                        } else {
                            i29 = i11;
                        }
                        if (i27 != 0) {
                            i30 = 1;
                        } else {
                            i30 = i12;
                        }
                        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q2 = ComposerKt.f3003a;
                        C8584v.m16781D(i30, i29);
                        interfaceC0004c = (InterfaceC0004c) composerImplMo1636j.mo1648p(SelectionRegistrarKt.f2569a);
                        C5304d1 c5304d2 = CompositionLocalsKt.f4137e;
                        interfaceC10015c = (InterfaceC10015c) composerImplMo1636j.mo1648p(c5304d2);
                        aVar = (AbstractC0696b.a) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4140h);
                        composerImplMo1636j.mo1622c(959238681);
                        if (interfaceC0004c == null) {
                            jLongValue = 0;
                        } else {
                            jLongValue = ((Number) C0487a.m1860a(new Object[]{str, interfaceC0004c}, SaverKt.m1859a(new BasicTextKt$selectionIdSaver$1(interfaceC0004c), BasicTextKt$selectionIdSaver$2.f2523b), new InterfaceC2041a<Long>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$selectableId$1
                                {
                                    super(0);
                                }

                                @Override // cm.InterfaceC2041a
                                /* JADX INFO: renamed from: E */
                                public final Long mo807E() {
                                    return Long.valueOf(interfaceC0004c.m6b());
                                }
                            }, composerImplMo1636j, 4)).longValue();
                        }
                        j10 = jLongValue;
                        composerImplMo1636j.m1609Q(false);
                        composerImplMo1636j.mo1622c(-492369756);
                        objM1619a0 = composerImplMo1636j.m1619a0();
                        if (objM1619a0 == InterfaceC0476a.a.f3122a) {
                            objM1619a0 = new TextController(new TextState(new C10423b(new C0689a(str), c7218l2, i29, i30, z11, i21, interfaceC10015c, aVar), j10));
                            composerImplMo1636j.m1597F0(objM1619a0);
                        }
                        composerImplMo1636j.m1609Q(false);
                        textController = (TextController) objM1619a0;
                        textState = textController.f2539a;
                        if (!composerImplMo1636j.f2897L) {
                            c10423b = textState.f2563d;
                            Pair<List<C0689a.b<C7213g>>, List<C0689a.b<InterfaceC2057q<String, InterfaceC0476a, Integer, C9072e>>>> pair2 = CoreTextKt.f2526a;
                            C5207g.m11111f(c10423b, "current");
                            C5207g.m11111f(c7218l2, "style");
                            C5207g.m11111f(interfaceC10015c, "density");
                            C5207g.m11111f(aVar, "fontFamilyResolver");
                            if (!C5207g.m11106a(c10423b.f52258a.f4523a, str)) {
                                c10423b = new C10423b(new C0689a(str), c7218l2, i29, i30, z11, i21, interfaceC10015c, aVar);
                            } else {
                                c10423b = new C10423b(new C0689a(str), c7218l2, i29, i30, z11, i21, interfaceC10015c, aVar);
                            }
                            textController.m1540f(c10423b);
                        }
                        textState.getClass();
                        C5207g.m11111f(interfaceC2052l2, "<set-?>");
                        textState.f2561b = interfaceC2052l2;
                        textController.m1541g(interfaceC0004c);
                        composerImplMo1636j.mo1622c(959240076);
                        if (interfaceC0004c != null) {
                            long j12 = ((C0005d) composerImplMo1636j.mo1648p(TextSelectionColorsKt.f2571a)).f3b;
                        }
                        composerImplMo1636j.m1609Q(false);
                        interfaceC0500b3 = interfaceC0500b2;
                        InterfaceC0500b interfaceC0500bMo1929K2 = interfaceC0500b3.mo1929K(textController.m1539e());
                        composerImplMo1636j.mo1622c(544976794);
                        interfaceC10015c2 = (InterfaceC10015c) composerImplMo1636j.mo1648p(c5304d2);
                        layoutDirection = (LayoutDirection) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4143k);
                        interfaceC0647n1 = (InterfaceC0647n1) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4148p);
                        interfaceC0500bM1928b = ComposedModifierKt.m1928b(composerImplMo1636j, interfaceC0500bMo1929K2);
                        ComposeUiNode.f3726n.getClass();
                        interfaceC2041a = ComposeUiNode.Companion.f3728b;
                        composerImplMo1636j.mo1622c(1405779621);
                        if (!(composerImplMo1636j.f2910a instanceof InterfaceC5299c)) {
                            C8573r0.m16771y0();
                            throw null;
                        }
                        composerImplMo1636j.mo1640l();
                        if (composerImplMo1636j.f2897L) {
                            composerImplMo1636j.mo1634i(new InterfaceC2041a<ComposeUiNode>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText-4YKlhWE$$inlined$Layout$1
                                {
                                    super(0);
                                }

                                /* JADX WARN: Type inference failed for: r3v1, types: [androidx.compose.ui.node.ComposeUiNode, java.lang.Object] */
                                @Override // cm.InterfaceC2041a
                                /* JADX INFO: renamed from: E */
                                public final ComposeUiNode mo807E() {
                                    return interfaceC2041a.mo807E();
                                }
                            });
                        } else {
                            composerImplMo1636j.mo1653s();
                        }
                        C8573r0.m16714a1(composerImplMo1636j, textController.f2542d, ComposeUiNode.Companion.f3731e);
                        C8573r0.m16714a1(composerImplMo1636j, interfaceC10015c2, ComposeUiNode.Companion.f3730d);
                        C8573r0.m16714a1(composerImplMo1636j, layoutDirection, ComposeUiNode.Companion.f3732f);
                        C8573r0.m16714a1(composerImplMo1636j, interfaceC0647n1, ComposeUiNode.Companion.f3733g);
                        C8573r0.m16714a1(composerImplMo1636j, interfaceC0500bM1928b, ComposeUiNode.Companion.f3729c);
                        composerImplMo1636j.m1609Q(true);
                        composerImplMo1636j.m1609Q(false);
                        composerImplMo1636j.m1609Q(false);
                        z12 = z11;
                        interfaceC0500b4 = interfaceC0500b3;
                        interfaceC2052l3 = interfaceC2052l2;
                        i31 = i29;
                        i32 = i21;
                        C7218l c7218l5 = c7218l2;
                        i33 = i30;
                        c7218l3 = c7218l5;
                    } else {
                        if (i34 != 0) {
                            interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                        }
                        if (i16 != 0) {
                            c7218l2 = C7218l.f40599c;
                        }
                        if (i18 != 0) {
                            interfaceC2052l2 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$1
                                @Override // cm.InterfaceC2052l
                                /* JADX INFO: renamed from: n */
                                public final C9072e mo528n(C7216j c7216j) {
                                    C5207g.m11111f(c7216j, "it");
                                    return C9072e.f47360a;
                                }
                            };
                        }
                        if (i20 != 0) {
                            i21 = 1;
                        }
                        if (i23 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if (i25 != 0) {
                            i29 = Integer.MAX_VALUE;
                        } else {
                            i29 = i11;
                        }
                        if (i27 != 0) {
                            i30 = 1;
                        } else {
                            i30 = i12;
                        }
                        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q3 = ComposerKt.f3003a;
                        C8584v.m16781D(i30, i29);
                        interfaceC0004c = (InterfaceC0004c) composerImplMo1636j.mo1648p(SelectionRegistrarKt.f2569a);
                        C5304d1 c5304d3 = CompositionLocalsKt.f4137e;
                        interfaceC10015c = (InterfaceC10015c) composerImplMo1636j.mo1648p(c5304d3);
                        aVar = (AbstractC0696b.a) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4140h);
                        composerImplMo1636j.mo1622c(959238681);
                        if (interfaceC0004c == null) {
                            jLongValue = 0;
                        } else {
                            jLongValue = ((Number) C0487a.m1860a(new Object[]{str, interfaceC0004c}, SaverKt.m1859a(new BasicTextKt$selectionIdSaver$1(interfaceC0004c), BasicTextKt$selectionIdSaver$2.f2523b), new InterfaceC2041a<Long>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$selectableId$1
                                {
                                    super(0);
                                }

                                @Override // cm.InterfaceC2041a
                                /* JADX INFO: renamed from: E */
                                public final Long mo807E() {
                                    return Long.valueOf(interfaceC0004c.m6b());
                                }
                            }, composerImplMo1636j, 4)).longValue();
                        }
                        j10 = jLongValue;
                        composerImplMo1636j.m1609Q(false);
                        composerImplMo1636j.mo1622c(-492369756);
                        objM1619a0 = composerImplMo1636j.m1619a0();
                        if (objM1619a0 == InterfaceC0476a.a.f3122a) {
                            objM1619a0 = new TextController(new TextState(new C10423b(new C0689a(str), c7218l2, i29, i30, z11, i21, interfaceC10015c, aVar), j10));
                            composerImplMo1636j.m1597F0(objM1619a0);
                        }
                        composerImplMo1636j.m1609Q(false);
                        textController = (TextController) objM1619a0;
                        textState = textController.f2539a;
                        if (!composerImplMo1636j.f2897L) {
                            c10423b = textState.f2563d;
                            Pair<List<C0689a.b<C7213g>>, List<C0689a.b<InterfaceC2057q<String, InterfaceC0476a, Integer, C9072e>>>> pair3 = CoreTextKt.f2526a;
                            C5207g.m11111f(c10423b, "current");
                            C5207g.m11111f(c7218l2, "style");
                            C5207g.m11111f(interfaceC10015c, "density");
                            C5207g.m11111f(aVar, "fontFamilyResolver");
                            if (!C5207g.m11106a(c10423b.f52258a.f4523a, str)) {
                                c10423b = new C10423b(new C0689a(str), c7218l2, i29, i30, z11, i21, interfaceC10015c, aVar);
                            } else {
                                c10423b = new C10423b(new C0689a(str), c7218l2, i29, i30, z11, i21, interfaceC10015c, aVar);
                            }
                            textController.m1540f(c10423b);
                        }
                        textState.getClass();
                        C5207g.m11111f(interfaceC2052l2, "<set-?>");
                        textState.f2561b = interfaceC2052l2;
                        textController.m1541g(interfaceC0004c);
                        composerImplMo1636j.mo1622c(959240076);
                        if (interfaceC0004c != null) {
                            long j13 = ((C0005d) composerImplMo1636j.mo1648p(TextSelectionColorsKt.f2571a)).f3b;
                        }
                        composerImplMo1636j.m1609Q(false);
                        interfaceC0500b3 = interfaceC0500b2;
                        InterfaceC0500b interfaceC0500bMo1929K3 = interfaceC0500b3.mo1929K(textController.m1539e());
                        composerImplMo1636j.mo1622c(544976794);
                        interfaceC10015c2 = (InterfaceC10015c) composerImplMo1636j.mo1648p(c5304d3);
                        layoutDirection = (LayoutDirection) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4143k);
                        interfaceC0647n1 = (InterfaceC0647n1) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4148p);
                        interfaceC0500bM1928b = ComposedModifierKt.m1928b(composerImplMo1636j, interfaceC0500bMo1929K3);
                        ComposeUiNode.f3726n.getClass();
                        interfaceC2041a = ComposeUiNode.Companion.f3728b;
                        composerImplMo1636j.mo1622c(1405779621);
                        if (!(composerImplMo1636j.f2910a instanceof InterfaceC5299c)) {
                            C8573r0.m16771y0();
                            throw null;
                        }
                        composerImplMo1636j.mo1640l();
                        if (composerImplMo1636j.f2897L) {
                            composerImplMo1636j.mo1634i(new InterfaceC2041a<ComposeUiNode>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText-4YKlhWE$$inlined$Layout$1
                                {
                                    super(0);
                                }

                                /* JADX WARN: Type inference failed for: r3v1, types: [androidx.compose.ui.node.ComposeUiNode, java.lang.Object] */
                                @Override // cm.InterfaceC2041a
                                /* JADX INFO: renamed from: E */
                                public final ComposeUiNode mo807E() {
                                    return interfaceC2041a.mo807E();
                                }
                            });
                        } else {
                            composerImplMo1636j.mo1653s();
                        }
                        C8573r0.m16714a1(composerImplMo1636j, textController.f2542d, ComposeUiNode.Companion.f3731e);
                        C8573r0.m16714a1(composerImplMo1636j, interfaceC10015c2, ComposeUiNode.Companion.f3730d);
                        C8573r0.m16714a1(composerImplMo1636j, layoutDirection, ComposeUiNode.Companion.f3732f);
                        C8573r0.m16714a1(composerImplMo1636j, interfaceC0647n1, ComposeUiNode.Companion.f3733g);
                        C8573r0.m16714a1(composerImplMo1636j, interfaceC0500bM1928b, ComposeUiNode.Companion.f3729c);
                        composerImplMo1636j.m1609Q(true);
                        composerImplMo1636j.m1609Q(false);
                        composerImplMo1636j.m1609Q(false);
                        z12 = z11;
                        interfaceC0500b4 = interfaceC0500b3;
                        interfaceC2052l3 = interfaceC2052l2;
                        i31 = i29;
                        i32 = i21;
                        C7218l c7218l6 = c7218l2;
                        i33 = i30;
                        c7218l3 = c7218l6;
                    }
                    c5332q0M1612T = composerImplMo1636j.m1612T();
                    if (c5332q0M1612T == null) {
                        return;
                    }
                    c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                            num.intValue();
                            BasicTextKt.m1531b(str, interfaceC0500b4, c7218l3, interfaceC2052l3, i32, z12, i31, i33, interfaceC0476a2, C8573r0.m16737l1(i13 | 1), i14);
                            return C9072e.f47360a;
                        }
                    };
                }
                i15 |= 3072;
                interfaceC2052l2 = interfaceC2052l;
                i20 = i14 & 16;
                if (i20 != 0) {
                    if ((57344 & i13) == 0) {
                        i21 = i10;
                        if (composerImplMo1636j.m1594E(i21)) {
                            i22 = 16384;
                        } else {
                            i22 = 8192;
                        }
                        i15 |= i22;
                    }
                    i23 = i14 & 32;
                    if (i23 != 0) {
                        i15 |= 196608;
                    } else if ((i13 & 458752) == 0) {
                        if (composerImplMo1636j.m1598G(z10)) {
                            i24 = 131072;
                        } else {
                            i24 = 65536;
                        }
                        i15 |= i24;
                    }
                    i25 = i14 & 64;
                    if (i25 != 0) {
                        i15 |= 1572864;
                    } else if ((i13 & 3670016) == 0) {
                        if (composerImplMo1636j.m1594E(i11)) {
                            i26 = 1048576;
                        } else {
                            i26 = 524288;
                        }
                        i15 |= i26;
                    }
                    i27 = i14 & BuildConfig.SDK_TRUNCATE_LENGTH;
                    if (i27 != 0) {
                        i15 |= 12582912;
                    } else if ((i13 & 29360128) == 0) {
                        if (composerImplMo1636j.m1594E(i12)) {
                            i28 = 8388608;
                        } else {
                            i28 = 4194304;
                        }
                        i15 |= i28;
                    }
                    if ((i15 & 23967451) == 4793490) {
                        if (i34 != 0) {
                            interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                        }
                        if (i16 != 0) {
                            c7218l2 = C7218l.f40599c;
                        }
                        if (i18 != 0) {
                            interfaceC2052l2 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$1
                                @Override // cm.InterfaceC2052l
                                /* JADX INFO: renamed from: n */
                                public final C9072e mo528n(C7216j c7216j) {
                                    C5207g.m11111f(c7216j, "it");
                                    return C9072e.f47360a;
                                }
                            };
                        }
                        if (i20 != 0) {
                            i21 = 1;
                        }
                        if (i23 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if (i25 != 0) {
                            i29 = Integer.MAX_VALUE;
                        } else {
                            i29 = i11;
                        }
                        if (i27 != 0) {
                            i30 = 1;
                        } else {
                            i30 = i12;
                        }
                        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q4 = ComposerKt.f3003a;
                        C8584v.m16781D(i30, i29);
                        interfaceC0004c = (InterfaceC0004c) composerImplMo1636j.mo1648p(SelectionRegistrarKt.f2569a);
                        C5304d1 c5304d4 = CompositionLocalsKt.f4137e;
                        interfaceC10015c = (InterfaceC10015c) composerImplMo1636j.mo1648p(c5304d4);
                        aVar = (AbstractC0696b.a) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4140h);
                        composerImplMo1636j.mo1622c(959238681);
                        if (interfaceC0004c == null) {
                            jLongValue = 0;
                        } else {
                            jLongValue = ((Number) C0487a.m1860a(new Object[]{str, interfaceC0004c}, SaverKt.m1859a(new BasicTextKt$selectionIdSaver$1(interfaceC0004c), BasicTextKt$selectionIdSaver$2.f2523b), new InterfaceC2041a<Long>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$selectableId$1
                                {
                                    super(0);
                                }

                                @Override // cm.InterfaceC2041a
                                /* JADX INFO: renamed from: E */
                                public final Long mo807E() {
                                    return Long.valueOf(interfaceC0004c.m6b());
                                }
                            }, composerImplMo1636j, 4)).longValue();
                        }
                        j10 = jLongValue;
                        composerImplMo1636j.m1609Q(false);
                        composerImplMo1636j.mo1622c(-492369756);
                        objM1619a0 = composerImplMo1636j.m1619a0();
                        if (objM1619a0 == InterfaceC0476a.a.f3122a) {
                            objM1619a0 = new TextController(new TextState(new C10423b(new C0689a(str), c7218l2, i29, i30, z11, i21, interfaceC10015c, aVar), j10));
                            composerImplMo1636j.m1597F0(objM1619a0);
                        }
                        composerImplMo1636j.m1609Q(false);
                        textController = (TextController) objM1619a0;
                        textState = textController.f2539a;
                        if (!composerImplMo1636j.f2897L) {
                            c10423b = textState.f2563d;
                            Pair<List<C0689a.b<C7213g>>, List<C0689a.b<InterfaceC2057q<String, InterfaceC0476a, Integer, C9072e>>>> pair4 = CoreTextKt.f2526a;
                            C5207g.m11111f(c10423b, "current");
                            C5207g.m11111f(c7218l2, "style");
                            C5207g.m11111f(interfaceC10015c, "density");
                            C5207g.m11111f(aVar, "fontFamilyResolver");
                            if (!C5207g.m11106a(c10423b.f52258a.f4523a, str)) {
                                c10423b = new C10423b(new C0689a(str), c7218l2, i29, i30, z11, i21, interfaceC10015c, aVar);
                            } else {
                                c10423b = new C10423b(new C0689a(str), c7218l2, i29, i30, z11, i21, interfaceC10015c, aVar);
                            }
                            textController.m1540f(c10423b);
                        }
                        textState.getClass();
                        C5207g.m11111f(interfaceC2052l2, "<set-?>");
                        textState.f2561b = interfaceC2052l2;
                        textController.m1541g(interfaceC0004c);
                        composerImplMo1636j.mo1622c(959240076);
                        if (interfaceC0004c != null) {
                            long j14 = ((C0005d) composerImplMo1636j.mo1648p(TextSelectionColorsKt.f2571a)).f3b;
                        }
                        composerImplMo1636j.m1609Q(false);
                        interfaceC0500b3 = interfaceC0500b2;
                        InterfaceC0500b interfaceC0500bMo1929K4 = interfaceC0500b3.mo1929K(textController.m1539e());
                        composerImplMo1636j.mo1622c(544976794);
                        interfaceC10015c2 = (InterfaceC10015c) composerImplMo1636j.mo1648p(c5304d4);
                        layoutDirection = (LayoutDirection) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4143k);
                        interfaceC0647n1 = (InterfaceC0647n1) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4148p);
                        interfaceC0500bM1928b = ComposedModifierKt.m1928b(composerImplMo1636j, interfaceC0500bMo1929K4);
                        ComposeUiNode.f3726n.getClass();
                        interfaceC2041a = ComposeUiNode.Companion.f3728b;
                        composerImplMo1636j.mo1622c(1405779621);
                        if (!(composerImplMo1636j.f2910a instanceof InterfaceC5299c)) {
                            C8573r0.m16771y0();
                            throw null;
                        }
                        composerImplMo1636j.mo1640l();
                        if (composerImplMo1636j.f2897L) {
                            composerImplMo1636j.mo1634i(new InterfaceC2041a<ComposeUiNode>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText-4YKlhWE$$inlined$Layout$1
                                {
                                    super(0);
                                }

                                /* JADX WARN: Type inference failed for: r3v1, types: [androidx.compose.ui.node.ComposeUiNode, java.lang.Object] */
                                @Override // cm.InterfaceC2041a
                                /* JADX INFO: renamed from: E */
                                public final ComposeUiNode mo807E() {
                                    return interfaceC2041a.mo807E();
                                }
                            });
                        } else {
                            composerImplMo1636j.mo1653s();
                        }
                        C8573r0.m16714a1(composerImplMo1636j, textController.f2542d, ComposeUiNode.Companion.f3731e);
                        C8573r0.m16714a1(composerImplMo1636j, interfaceC10015c2, ComposeUiNode.Companion.f3730d);
                        C8573r0.m16714a1(composerImplMo1636j, layoutDirection, ComposeUiNode.Companion.f3732f);
                        C8573r0.m16714a1(composerImplMo1636j, interfaceC0647n1, ComposeUiNode.Companion.f3733g);
                        C8573r0.m16714a1(composerImplMo1636j, interfaceC0500bM1928b, ComposeUiNode.Companion.f3729c);
                        composerImplMo1636j.m1609Q(true);
                        composerImplMo1636j.m1609Q(false);
                        composerImplMo1636j.m1609Q(false);
                        z12 = z11;
                        interfaceC0500b4 = interfaceC0500b3;
                        interfaceC2052l3 = interfaceC2052l2;
                        i31 = i29;
                        i32 = i21;
                        C7218l c7218l7 = c7218l2;
                        i33 = i30;
                        c7218l3 = c7218l7;
                    } else {
                        if (i34 != 0) {
                            interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                        }
                        if (i16 != 0) {
                            c7218l2 = C7218l.f40599c;
                        }
                        if (i18 != 0) {
                            interfaceC2052l2 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$1
                                @Override // cm.InterfaceC2052l
                                /* JADX INFO: renamed from: n */
                                public final C9072e mo528n(C7216j c7216j) {
                                    C5207g.m11111f(c7216j, "it");
                                    return C9072e.f47360a;
                                }
                            };
                        }
                        if (i20 != 0) {
                            i21 = 1;
                        }
                        if (i23 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if (i25 != 0) {
                            i29 = Integer.MAX_VALUE;
                        } else {
                            i29 = i11;
                        }
                        if (i27 != 0) {
                            i30 = 1;
                        } else {
                            i30 = i12;
                        }
                        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q5 = ComposerKt.f3003a;
                        C8584v.m16781D(i30, i29);
                        interfaceC0004c = (InterfaceC0004c) composerImplMo1636j.mo1648p(SelectionRegistrarKt.f2569a);
                        C5304d1 c5304d5 = CompositionLocalsKt.f4137e;
                        interfaceC10015c = (InterfaceC10015c) composerImplMo1636j.mo1648p(c5304d5);
                        aVar = (AbstractC0696b.a) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4140h);
                        composerImplMo1636j.mo1622c(959238681);
                        if (interfaceC0004c == null) {
                            jLongValue = 0;
                        } else {
                            jLongValue = ((Number) C0487a.m1860a(new Object[]{str, interfaceC0004c}, SaverKt.m1859a(new BasicTextKt$selectionIdSaver$1(interfaceC0004c), BasicTextKt$selectionIdSaver$2.f2523b), new InterfaceC2041a<Long>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$selectableId$1
                                {
                                    super(0);
                                }

                                @Override // cm.InterfaceC2041a
                                /* JADX INFO: renamed from: E */
                                public final Long mo807E() {
                                    return Long.valueOf(interfaceC0004c.m6b());
                                }
                            }, composerImplMo1636j, 4)).longValue();
                        }
                        j10 = jLongValue;
                        composerImplMo1636j.m1609Q(false);
                        composerImplMo1636j.mo1622c(-492369756);
                        objM1619a0 = composerImplMo1636j.m1619a0();
                        if (objM1619a0 == InterfaceC0476a.a.f3122a) {
                            objM1619a0 = new TextController(new TextState(new C10423b(new C0689a(str), c7218l2, i29, i30, z11, i21, interfaceC10015c, aVar), j10));
                            composerImplMo1636j.m1597F0(objM1619a0);
                        }
                        composerImplMo1636j.m1609Q(false);
                        textController = (TextController) objM1619a0;
                        textState = textController.f2539a;
                        if (!composerImplMo1636j.f2897L) {
                            c10423b = textState.f2563d;
                            Pair<List<C0689a.b<C7213g>>, List<C0689a.b<InterfaceC2057q<String, InterfaceC0476a, Integer, C9072e>>>> pair5 = CoreTextKt.f2526a;
                            C5207g.m11111f(c10423b, "current");
                            C5207g.m11111f(c7218l2, "style");
                            C5207g.m11111f(interfaceC10015c, "density");
                            C5207g.m11111f(aVar, "fontFamilyResolver");
                            if (!C5207g.m11106a(c10423b.f52258a.f4523a, str)) {
                                c10423b = new C10423b(new C0689a(str), c7218l2, i29, i30, z11, i21, interfaceC10015c, aVar);
                            } else {
                                c10423b = new C10423b(new C0689a(str), c7218l2, i29, i30, z11, i21, interfaceC10015c, aVar);
                            }
                            textController.m1540f(c10423b);
                        }
                        textState.getClass();
                        C5207g.m11111f(interfaceC2052l2, "<set-?>");
                        textState.f2561b = interfaceC2052l2;
                        textController.m1541g(interfaceC0004c);
                        composerImplMo1636j.mo1622c(959240076);
                        if (interfaceC0004c != null) {
                            long j15 = ((C0005d) composerImplMo1636j.mo1648p(TextSelectionColorsKt.f2571a)).f3b;
                        }
                        composerImplMo1636j.m1609Q(false);
                        interfaceC0500b3 = interfaceC0500b2;
                        InterfaceC0500b interfaceC0500bMo1929K5 = interfaceC0500b3.mo1929K(textController.m1539e());
                        composerImplMo1636j.mo1622c(544976794);
                        interfaceC10015c2 = (InterfaceC10015c) composerImplMo1636j.mo1648p(c5304d5);
                        layoutDirection = (LayoutDirection) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4143k);
                        interfaceC0647n1 = (InterfaceC0647n1) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4148p);
                        interfaceC0500bM1928b = ComposedModifierKt.m1928b(composerImplMo1636j, interfaceC0500bMo1929K5);
                        ComposeUiNode.f3726n.getClass();
                        interfaceC2041a = ComposeUiNode.Companion.f3728b;
                        composerImplMo1636j.mo1622c(1405779621);
                        if (!(composerImplMo1636j.f2910a instanceof InterfaceC5299c)) {
                            C8573r0.m16771y0();
                            throw null;
                        }
                        composerImplMo1636j.mo1640l();
                        if (composerImplMo1636j.f2897L) {
                            composerImplMo1636j.mo1634i(new InterfaceC2041a<ComposeUiNode>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText-4YKlhWE$$inlined$Layout$1
                                {
                                    super(0);
                                }

                                /* JADX WARN: Type inference failed for: r3v1, types: [androidx.compose.ui.node.ComposeUiNode, java.lang.Object] */
                                @Override // cm.InterfaceC2041a
                                /* JADX INFO: renamed from: E */
                                public final ComposeUiNode mo807E() {
                                    return interfaceC2041a.mo807E();
                                }
                            });
                        } else {
                            composerImplMo1636j.mo1653s();
                        }
                        C8573r0.m16714a1(composerImplMo1636j, textController.f2542d, ComposeUiNode.Companion.f3731e);
                        C8573r0.m16714a1(composerImplMo1636j, interfaceC10015c2, ComposeUiNode.Companion.f3730d);
                        C8573r0.m16714a1(composerImplMo1636j, layoutDirection, ComposeUiNode.Companion.f3732f);
                        C8573r0.m16714a1(composerImplMo1636j, interfaceC0647n1, ComposeUiNode.Companion.f3733g);
                        C8573r0.m16714a1(composerImplMo1636j, interfaceC0500bM1928b, ComposeUiNode.Companion.f3729c);
                        composerImplMo1636j.m1609Q(true);
                        composerImplMo1636j.m1609Q(false);
                        composerImplMo1636j.m1609Q(false);
                        z12 = z11;
                        interfaceC0500b4 = interfaceC0500b3;
                        interfaceC2052l3 = interfaceC2052l2;
                        i31 = i29;
                        i32 = i21;
                        C7218l c7218l8 = c7218l2;
                        i33 = i30;
                        c7218l3 = c7218l8;
                    }
                    c5332q0M1612T = composerImplMo1636j.m1612T();
                    if (c5332q0M1612T == null) {
                        return;
                    }
                    c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                            num.intValue();
                            BasicTextKt.m1531b(str, interfaceC0500b4, c7218l3, interfaceC2052l3, i32, z12, i31, i33, interfaceC0476a2, C8573r0.m16737l1(i13 | 1), i14);
                            return C9072e.f47360a;
                        }
                    };
                }
                i15 |= 24576;
                i21 = i10;
                i23 = i14 & 32;
                if (i23 != 0) {
                    i15 |= 196608;
                } else if ((i13 & 458752) == 0) {
                    if (composerImplMo1636j.m1598G(z10)) {
                        i24 = 131072;
                    } else {
                        i24 = 65536;
                    }
                    i15 |= i24;
                }
                i25 = i14 & 64;
                if (i25 != 0) {
                    i15 |= 1572864;
                } else if ((i13 & 3670016) == 0) {
                    if (composerImplMo1636j.m1594E(i11)) {
                        i26 = 1048576;
                    } else {
                        i26 = 524288;
                    }
                    i15 |= i26;
                }
                i27 = i14 & BuildConfig.SDK_TRUNCATE_LENGTH;
                if (i27 != 0) {
                    i15 |= 12582912;
                } else if ((i13 & 29360128) == 0) {
                    if (composerImplMo1636j.m1594E(i12)) {
                        i28 = 8388608;
                    } else {
                        i28 = 4194304;
                    }
                    i15 |= i28;
                }
                if ((i15 & 23967451) == 4793490) {
                    if (i34 != 0) {
                        interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                    }
                    if (i16 != 0) {
                        c7218l2 = C7218l.f40599c;
                    }
                    if (i18 != 0) {
                        interfaceC2052l2 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$1
                            @Override // cm.InterfaceC2052l
                            /* JADX INFO: renamed from: n */
                            public final C9072e mo528n(C7216j c7216j) {
                                C5207g.m11111f(c7216j, "it");
                                return C9072e.f47360a;
                            }
                        };
                    }
                    if (i20 != 0) {
                        i21 = 1;
                    }
                    if (i23 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    if (i25 != 0) {
                        i29 = Integer.MAX_VALUE;
                    } else {
                        i29 = i11;
                    }
                    if (i27 != 0) {
                        i30 = 1;
                    } else {
                        i30 = i12;
                    }
                    InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q6 = ComposerKt.f3003a;
                    C8584v.m16781D(i30, i29);
                    interfaceC0004c = (InterfaceC0004c) composerImplMo1636j.mo1648p(SelectionRegistrarKt.f2569a);
                    C5304d1 c5304d6 = CompositionLocalsKt.f4137e;
                    interfaceC10015c = (InterfaceC10015c) composerImplMo1636j.mo1648p(c5304d6);
                    aVar = (AbstractC0696b.a) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4140h);
                    composerImplMo1636j.mo1622c(959238681);
                    if (interfaceC0004c == null) {
                        jLongValue = 0;
                    } else {
                        jLongValue = ((Number) C0487a.m1860a(new Object[]{str, interfaceC0004c}, SaverKt.m1859a(new BasicTextKt$selectionIdSaver$1(interfaceC0004c), BasicTextKt$selectionIdSaver$2.f2523b), new InterfaceC2041a<Long>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$selectableId$1
                            {
                                super(0);
                            }

                            @Override // cm.InterfaceC2041a
                            /* JADX INFO: renamed from: E */
                            public final Long mo807E() {
                                return Long.valueOf(interfaceC0004c.m6b());
                            }
                        }, composerImplMo1636j, 4)).longValue();
                    }
                    j10 = jLongValue;
                    composerImplMo1636j.m1609Q(false);
                    composerImplMo1636j.mo1622c(-492369756);
                    objM1619a0 = composerImplMo1636j.m1619a0();
                    if (objM1619a0 == InterfaceC0476a.a.f3122a) {
                        objM1619a0 = new TextController(new TextState(new C10423b(new C0689a(str), c7218l2, i29, i30, z11, i21, interfaceC10015c, aVar), j10));
                        composerImplMo1636j.m1597F0(objM1619a0);
                    }
                    composerImplMo1636j.m1609Q(false);
                    textController = (TextController) objM1619a0;
                    textState = textController.f2539a;
                    if (!composerImplMo1636j.f2897L) {
                        c10423b = textState.f2563d;
                        Pair<List<C0689a.b<C7213g>>, List<C0689a.b<InterfaceC2057q<String, InterfaceC0476a, Integer, C9072e>>>> pair6 = CoreTextKt.f2526a;
                        C5207g.m11111f(c10423b, "current");
                        C5207g.m11111f(c7218l2, "style");
                        C5207g.m11111f(interfaceC10015c, "density");
                        C5207g.m11111f(aVar, "fontFamilyResolver");
                        if (!C5207g.m11106a(c10423b.f52258a.f4523a, str)) {
                            c10423b = new C10423b(new C0689a(str), c7218l2, i29, i30, z11, i21, interfaceC10015c, aVar);
                        } else {
                            c10423b = new C10423b(new C0689a(str), c7218l2, i29, i30, z11, i21, interfaceC10015c, aVar);
                        }
                        textController.m1540f(c10423b);
                    }
                    textState.getClass();
                    C5207g.m11111f(interfaceC2052l2, "<set-?>");
                    textState.f2561b = interfaceC2052l2;
                    textController.m1541g(interfaceC0004c);
                    composerImplMo1636j.mo1622c(959240076);
                    if (interfaceC0004c != null) {
                        long j16 = ((C0005d) composerImplMo1636j.mo1648p(TextSelectionColorsKt.f2571a)).f3b;
                    }
                    composerImplMo1636j.m1609Q(false);
                    interfaceC0500b3 = interfaceC0500b2;
                    InterfaceC0500b interfaceC0500bMo1929K6 = interfaceC0500b3.mo1929K(textController.m1539e());
                    composerImplMo1636j.mo1622c(544976794);
                    interfaceC10015c2 = (InterfaceC10015c) composerImplMo1636j.mo1648p(c5304d6);
                    layoutDirection = (LayoutDirection) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4143k);
                    interfaceC0647n1 = (InterfaceC0647n1) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4148p);
                    interfaceC0500bM1928b = ComposedModifierKt.m1928b(composerImplMo1636j, interfaceC0500bMo1929K6);
                    ComposeUiNode.f3726n.getClass();
                    interfaceC2041a = ComposeUiNode.Companion.f3728b;
                    composerImplMo1636j.mo1622c(1405779621);
                    if (!(composerImplMo1636j.f2910a instanceof InterfaceC5299c)) {
                        C8573r0.m16771y0();
                        throw null;
                    }
                    composerImplMo1636j.mo1640l();
                    if (composerImplMo1636j.f2897L) {
                        composerImplMo1636j.mo1634i(new InterfaceC2041a<ComposeUiNode>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText-4YKlhWE$$inlined$Layout$1
                            {
                                super(0);
                            }

                            /* JADX WARN: Type inference failed for: r3v1, types: [androidx.compose.ui.node.ComposeUiNode, java.lang.Object] */
                            @Override // cm.InterfaceC2041a
                            /* JADX INFO: renamed from: E */
                            public final ComposeUiNode mo807E() {
                                return interfaceC2041a.mo807E();
                            }
                        });
                    } else {
                        composerImplMo1636j.mo1653s();
                    }
                    C8573r0.m16714a1(composerImplMo1636j, textController.f2542d, ComposeUiNode.Companion.f3731e);
                    C8573r0.m16714a1(composerImplMo1636j, interfaceC10015c2, ComposeUiNode.Companion.f3730d);
                    C8573r0.m16714a1(composerImplMo1636j, layoutDirection, ComposeUiNode.Companion.f3732f);
                    C8573r0.m16714a1(composerImplMo1636j, interfaceC0647n1, ComposeUiNode.Companion.f3733g);
                    C8573r0.m16714a1(composerImplMo1636j, interfaceC0500bM1928b, ComposeUiNode.Companion.f3729c);
                    composerImplMo1636j.m1609Q(true);
                    composerImplMo1636j.m1609Q(false);
                    composerImplMo1636j.m1609Q(false);
                    z12 = z11;
                    interfaceC0500b4 = interfaceC0500b3;
                    interfaceC2052l3 = interfaceC2052l2;
                    i31 = i29;
                    i32 = i21;
                    C7218l c7218l9 = c7218l2;
                    i33 = i30;
                    c7218l3 = c7218l9;
                } else {
                    if (i34 != 0) {
                        interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                    }
                    if (i16 != 0) {
                        c7218l2 = C7218l.f40599c;
                    }
                    if (i18 != 0) {
                        interfaceC2052l2 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$1
                            @Override // cm.InterfaceC2052l
                            /* JADX INFO: renamed from: n */
                            public final C9072e mo528n(C7216j c7216j) {
                                C5207g.m11111f(c7216j, "it");
                                return C9072e.f47360a;
                            }
                        };
                    }
                    if (i20 != 0) {
                        i21 = 1;
                    }
                    if (i23 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    if (i25 != 0) {
                        i29 = Integer.MAX_VALUE;
                    } else {
                        i29 = i11;
                    }
                    if (i27 != 0) {
                        i30 = 1;
                    } else {
                        i30 = i12;
                    }
                    InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q7 = ComposerKt.f3003a;
                    C8584v.m16781D(i30, i29);
                    interfaceC0004c = (InterfaceC0004c) composerImplMo1636j.mo1648p(SelectionRegistrarKt.f2569a);
                    C5304d1 c5304d7 = CompositionLocalsKt.f4137e;
                    interfaceC10015c = (InterfaceC10015c) composerImplMo1636j.mo1648p(c5304d7);
                    aVar = (AbstractC0696b.a) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4140h);
                    composerImplMo1636j.mo1622c(959238681);
                    if (interfaceC0004c == null) {
                        jLongValue = 0;
                    } else {
                        jLongValue = ((Number) C0487a.m1860a(new Object[]{str, interfaceC0004c}, SaverKt.m1859a(new BasicTextKt$selectionIdSaver$1(interfaceC0004c), BasicTextKt$selectionIdSaver$2.f2523b), new InterfaceC2041a<Long>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$selectableId$1
                            {
                                super(0);
                            }

                            @Override // cm.InterfaceC2041a
                            /* JADX INFO: renamed from: E */
                            public final Long mo807E() {
                                return Long.valueOf(interfaceC0004c.m6b());
                            }
                        }, composerImplMo1636j, 4)).longValue();
                    }
                    j10 = jLongValue;
                    composerImplMo1636j.m1609Q(false);
                    composerImplMo1636j.mo1622c(-492369756);
                    objM1619a0 = composerImplMo1636j.m1619a0();
                    if (objM1619a0 == InterfaceC0476a.a.f3122a) {
                        objM1619a0 = new TextController(new TextState(new C10423b(new C0689a(str), c7218l2, i29, i30, z11, i21, interfaceC10015c, aVar), j10));
                        composerImplMo1636j.m1597F0(objM1619a0);
                    }
                    composerImplMo1636j.m1609Q(false);
                    textController = (TextController) objM1619a0;
                    textState = textController.f2539a;
                    if (!composerImplMo1636j.f2897L) {
                        c10423b = textState.f2563d;
                        Pair<List<C0689a.b<C7213g>>, List<C0689a.b<InterfaceC2057q<String, InterfaceC0476a, Integer, C9072e>>>> pair7 = CoreTextKt.f2526a;
                        C5207g.m11111f(c10423b, "current");
                        C5207g.m11111f(c7218l2, "style");
                        C5207g.m11111f(interfaceC10015c, "density");
                        C5207g.m11111f(aVar, "fontFamilyResolver");
                        if (!C5207g.m11106a(c10423b.f52258a.f4523a, str)) {
                            c10423b = new C10423b(new C0689a(str), c7218l2, i29, i30, z11, i21, interfaceC10015c, aVar);
                        } else {
                            c10423b = new C10423b(new C0689a(str), c7218l2, i29, i30, z11, i21, interfaceC10015c, aVar);
                        }
                        textController.m1540f(c10423b);
                    }
                    textState.getClass();
                    C5207g.m11111f(interfaceC2052l2, "<set-?>");
                    textState.f2561b = interfaceC2052l2;
                    textController.m1541g(interfaceC0004c);
                    composerImplMo1636j.mo1622c(959240076);
                    if (interfaceC0004c != null) {
                        long j17 = ((C0005d) composerImplMo1636j.mo1648p(TextSelectionColorsKt.f2571a)).f3b;
                    }
                    composerImplMo1636j.m1609Q(false);
                    interfaceC0500b3 = interfaceC0500b2;
                    InterfaceC0500b interfaceC0500bMo1929K7 = interfaceC0500b3.mo1929K(textController.m1539e());
                    composerImplMo1636j.mo1622c(544976794);
                    interfaceC10015c2 = (InterfaceC10015c) composerImplMo1636j.mo1648p(c5304d7);
                    layoutDirection = (LayoutDirection) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4143k);
                    interfaceC0647n1 = (InterfaceC0647n1) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4148p);
                    interfaceC0500bM1928b = ComposedModifierKt.m1928b(composerImplMo1636j, interfaceC0500bMo1929K7);
                    ComposeUiNode.f3726n.getClass();
                    interfaceC2041a = ComposeUiNode.Companion.f3728b;
                    composerImplMo1636j.mo1622c(1405779621);
                    if (!(composerImplMo1636j.f2910a instanceof InterfaceC5299c)) {
                        C8573r0.m16771y0();
                        throw null;
                    }
                    composerImplMo1636j.mo1640l();
                    if (composerImplMo1636j.f2897L) {
                        composerImplMo1636j.mo1634i(new InterfaceC2041a<ComposeUiNode>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText-4YKlhWE$$inlined$Layout$1
                            {
                                super(0);
                            }

                            /* JADX WARN: Type inference failed for: r3v1, types: [androidx.compose.ui.node.ComposeUiNode, java.lang.Object] */
                            @Override // cm.InterfaceC2041a
                            /* JADX INFO: renamed from: E */
                            public final ComposeUiNode mo807E() {
                                return interfaceC2041a.mo807E();
                            }
                        });
                    } else {
                        composerImplMo1636j.mo1653s();
                    }
                    C8573r0.m16714a1(composerImplMo1636j, textController.f2542d, ComposeUiNode.Companion.f3731e);
                    C8573r0.m16714a1(composerImplMo1636j, interfaceC10015c2, ComposeUiNode.Companion.f3730d);
                    C8573r0.m16714a1(composerImplMo1636j, layoutDirection, ComposeUiNode.Companion.f3732f);
                    C8573r0.m16714a1(composerImplMo1636j, interfaceC0647n1, ComposeUiNode.Companion.f3733g);
                    C8573r0.m16714a1(composerImplMo1636j, interfaceC0500bM1928b, ComposeUiNode.Companion.f3729c);
                    composerImplMo1636j.m1609Q(true);
                    composerImplMo1636j.m1609Q(false);
                    composerImplMo1636j.m1609Q(false);
                    z12 = z11;
                    interfaceC0500b4 = interfaceC0500b3;
                    interfaceC2052l3 = interfaceC2052l2;
                    i31 = i29;
                    i32 = i21;
                    C7218l c7218l10 = c7218l2;
                    i33 = i30;
                    c7218l3 = c7218l10;
                }
                c5332q0M1612T = composerImplMo1636j.m1612T();
                if (c5332q0M1612T == null) {
                    return;
                }
                c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // cm.InterfaceC2056p
                    /* JADX INFO: renamed from: m0 */
                    public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                        num.intValue();
                        BasicTextKt.m1531b(str, interfaceC0500b4, c7218l3, interfaceC2052l3, i32, z12, i31, i33, interfaceC0476a2, C8573r0.m16737l1(i13 | 1), i14);
                        return C9072e.f47360a;
                    }
                };
            }
            i15 |= 384;
            c7218l2 = c7218l;
            i18 = i14 & 8;
            if (i18 != 0) {
                if ((i13 & 7168) == 0) {
                    interfaceC2052l2 = interfaceC2052l;
                    if (composerImplMo1636j.m1600H(interfaceC2052l2)) {
                        i19 = 2048;
                    } else {
                        i19 = 1024;
                    }
                    i15 |= i19;
                }
                i20 = i14 & 16;
                if (i20 != 0) {
                    if ((57344 & i13) == 0) {
                        i21 = i10;
                        if (composerImplMo1636j.m1594E(i21)) {
                            i22 = 16384;
                        } else {
                            i22 = 8192;
                        }
                        i15 |= i22;
                    }
                    i23 = i14 & 32;
                    if (i23 != 0) {
                        i15 |= 196608;
                    } else if ((i13 & 458752) == 0) {
                        if (composerImplMo1636j.m1598G(z10)) {
                            i24 = 131072;
                        } else {
                            i24 = 65536;
                        }
                        i15 |= i24;
                    }
                    i25 = i14 & 64;
                    if (i25 != 0) {
                        i15 |= 1572864;
                    } else if ((i13 & 3670016) == 0) {
                        if (composerImplMo1636j.m1594E(i11)) {
                            i26 = 1048576;
                        } else {
                            i26 = 524288;
                        }
                        i15 |= i26;
                    }
                    i27 = i14 & BuildConfig.SDK_TRUNCATE_LENGTH;
                    if (i27 != 0) {
                        i15 |= 12582912;
                    } else if ((i13 & 29360128) == 0) {
                        if (composerImplMo1636j.m1594E(i12)) {
                            i28 = 8388608;
                        } else {
                            i28 = 4194304;
                        }
                        i15 |= i28;
                    }
                    if ((i15 & 23967451) == 4793490) {
                        if (i34 != 0) {
                            interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                        }
                        if (i16 != 0) {
                            c7218l2 = C7218l.f40599c;
                        }
                        if (i18 != 0) {
                            interfaceC2052l2 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$1
                                @Override // cm.InterfaceC2052l
                                /* JADX INFO: renamed from: n */
                                public final C9072e mo528n(C7216j c7216j) {
                                    C5207g.m11111f(c7216j, "it");
                                    return C9072e.f47360a;
                                }
                            };
                        }
                        if (i20 != 0) {
                            i21 = 1;
                        }
                        if (i23 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if (i25 != 0) {
                            i29 = Integer.MAX_VALUE;
                        } else {
                            i29 = i11;
                        }
                        if (i27 != 0) {
                            i30 = 1;
                        } else {
                            i30 = i12;
                        }
                        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q8 = ComposerKt.f3003a;
                        C8584v.m16781D(i30, i29);
                        interfaceC0004c = (InterfaceC0004c) composerImplMo1636j.mo1648p(SelectionRegistrarKt.f2569a);
                        C5304d1 c5304d8 = CompositionLocalsKt.f4137e;
                        interfaceC10015c = (InterfaceC10015c) composerImplMo1636j.mo1648p(c5304d8);
                        aVar = (AbstractC0696b.a) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4140h);
                        composerImplMo1636j.mo1622c(959238681);
                        if (interfaceC0004c == null) {
                            jLongValue = 0;
                        } else {
                            jLongValue = ((Number) C0487a.m1860a(new Object[]{str, interfaceC0004c}, SaverKt.m1859a(new BasicTextKt$selectionIdSaver$1(interfaceC0004c), BasicTextKt$selectionIdSaver$2.f2523b), new InterfaceC2041a<Long>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$selectableId$1
                                {
                                    super(0);
                                }

                                @Override // cm.InterfaceC2041a
                                /* JADX INFO: renamed from: E */
                                public final Long mo807E() {
                                    return Long.valueOf(interfaceC0004c.m6b());
                                }
                            }, composerImplMo1636j, 4)).longValue();
                        }
                        j10 = jLongValue;
                        composerImplMo1636j.m1609Q(false);
                        composerImplMo1636j.mo1622c(-492369756);
                        objM1619a0 = composerImplMo1636j.m1619a0();
                        if (objM1619a0 == InterfaceC0476a.a.f3122a) {
                            objM1619a0 = new TextController(new TextState(new C10423b(new C0689a(str), c7218l2, i29, i30, z11, i21, interfaceC10015c, aVar), j10));
                            composerImplMo1636j.m1597F0(objM1619a0);
                        }
                        composerImplMo1636j.m1609Q(false);
                        textController = (TextController) objM1619a0;
                        textState = textController.f2539a;
                        if (!composerImplMo1636j.f2897L) {
                            c10423b = textState.f2563d;
                            Pair<List<C0689a.b<C7213g>>, List<C0689a.b<InterfaceC2057q<String, InterfaceC0476a, Integer, C9072e>>>> pair8 = CoreTextKt.f2526a;
                            C5207g.m11111f(c10423b, "current");
                            C5207g.m11111f(c7218l2, "style");
                            C5207g.m11111f(interfaceC10015c, "density");
                            C5207g.m11111f(aVar, "fontFamilyResolver");
                            if (!C5207g.m11106a(c10423b.f52258a.f4523a, str)) {
                                c10423b = new C10423b(new C0689a(str), c7218l2, i29, i30, z11, i21, interfaceC10015c, aVar);
                            } else {
                                c10423b = new C10423b(new C0689a(str), c7218l2, i29, i30, z11, i21, interfaceC10015c, aVar);
                            }
                            textController.m1540f(c10423b);
                        }
                        textState.getClass();
                        C5207g.m11111f(interfaceC2052l2, "<set-?>");
                        textState.f2561b = interfaceC2052l2;
                        textController.m1541g(interfaceC0004c);
                        composerImplMo1636j.mo1622c(959240076);
                        if (interfaceC0004c != null) {
                            long j18 = ((C0005d) composerImplMo1636j.mo1648p(TextSelectionColorsKt.f2571a)).f3b;
                        }
                        composerImplMo1636j.m1609Q(false);
                        interfaceC0500b3 = interfaceC0500b2;
                        InterfaceC0500b interfaceC0500bMo1929K8 = interfaceC0500b3.mo1929K(textController.m1539e());
                        composerImplMo1636j.mo1622c(544976794);
                        interfaceC10015c2 = (InterfaceC10015c) composerImplMo1636j.mo1648p(c5304d8);
                        layoutDirection = (LayoutDirection) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4143k);
                        interfaceC0647n1 = (InterfaceC0647n1) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4148p);
                        interfaceC0500bM1928b = ComposedModifierKt.m1928b(composerImplMo1636j, interfaceC0500bMo1929K8);
                        ComposeUiNode.f3726n.getClass();
                        interfaceC2041a = ComposeUiNode.Companion.f3728b;
                        composerImplMo1636j.mo1622c(1405779621);
                        if (!(composerImplMo1636j.f2910a instanceof InterfaceC5299c)) {
                            C8573r0.m16771y0();
                            throw null;
                        }
                        composerImplMo1636j.mo1640l();
                        if (composerImplMo1636j.f2897L) {
                            composerImplMo1636j.mo1634i(new InterfaceC2041a<ComposeUiNode>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText-4YKlhWE$$inlined$Layout$1
                                {
                                    super(0);
                                }

                                /* JADX WARN: Type inference failed for: r3v1, types: [androidx.compose.ui.node.ComposeUiNode, java.lang.Object] */
                                @Override // cm.InterfaceC2041a
                                /* JADX INFO: renamed from: E */
                                public final ComposeUiNode mo807E() {
                                    return interfaceC2041a.mo807E();
                                }
                            });
                        } else {
                            composerImplMo1636j.mo1653s();
                        }
                        C8573r0.m16714a1(composerImplMo1636j, textController.f2542d, ComposeUiNode.Companion.f3731e);
                        C8573r0.m16714a1(composerImplMo1636j, interfaceC10015c2, ComposeUiNode.Companion.f3730d);
                        C8573r0.m16714a1(composerImplMo1636j, layoutDirection, ComposeUiNode.Companion.f3732f);
                        C8573r0.m16714a1(composerImplMo1636j, interfaceC0647n1, ComposeUiNode.Companion.f3733g);
                        C8573r0.m16714a1(composerImplMo1636j, interfaceC0500bM1928b, ComposeUiNode.Companion.f3729c);
                        composerImplMo1636j.m1609Q(true);
                        composerImplMo1636j.m1609Q(false);
                        composerImplMo1636j.m1609Q(false);
                        z12 = z11;
                        interfaceC0500b4 = interfaceC0500b3;
                        interfaceC2052l3 = interfaceC2052l2;
                        i31 = i29;
                        i32 = i21;
                        C7218l c7218l11 = c7218l2;
                        i33 = i30;
                        c7218l3 = c7218l11;
                    } else {
                        if (i34 != 0) {
                            interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                        }
                        if (i16 != 0) {
                            c7218l2 = C7218l.f40599c;
                        }
                        if (i18 != 0) {
                            interfaceC2052l2 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$1
                                @Override // cm.InterfaceC2052l
                                /* JADX INFO: renamed from: n */
                                public final C9072e mo528n(C7216j c7216j) {
                                    C5207g.m11111f(c7216j, "it");
                                    return C9072e.f47360a;
                                }
                            };
                        }
                        if (i20 != 0) {
                            i21 = 1;
                        }
                        if (i23 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if (i25 != 0) {
                            i29 = Integer.MAX_VALUE;
                        } else {
                            i29 = i11;
                        }
                        if (i27 != 0) {
                            i30 = 1;
                        } else {
                            i30 = i12;
                        }
                        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q9 = ComposerKt.f3003a;
                        C8584v.m16781D(i30, i29);
                        interfaceC0004c = (InterfaceC0004c) composerImplMo1636j.mo1648p(SelectionRegistrarKt.f2569a);
                        C5304d1 c5304d9 = CompositionLocalsKt.f4137e;
                        interfaceC10015c = (InterfaceC10015c) composerImplMo1636j.mo1648p(c5304d9);
                        aVar = (AbstractC0696b.a) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4140h);
                        composerImplMo1636j.mo1622c(959238681);
                        if (interfaceC0004c == null) {
                            jLongValue = 0;
                        } else {
                            jLongValue = ((Number) C0487a.m1860a(new Object[]{str, interfaceC0004c}, SaverKt.m1859a(new BasicTextKt$selectionIdSaver$1(interfaceC0004c), BasicTextKt$selectionIdSaver$2.f2523b), new InterfaceC2041a<Long>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$selectableId$1
                                {
                                    super(0);
                                }

                                @Override // cm.InterfaceC2041a
                                /* JADX INFO: renamed from: E */
                                public final Long mo807E() {
                                    return Long.valueOf(interfaceC0004c.m6b());
                                }
                            }, composerImplMo1636j, 4)).longValue();
                        }
                        j10 = jLongValue;
                        composerImplMo1636j.m1609Q(false);
                        composerImplMo1636j.mo1622c(-492369756);
                        objM1619a0 = composerImplMo1636j.m1619a0();
                        if (objM1619a0 == InterfaceC0476a.a.f3122a) {
                            objM1619a0 = new TextController(new TextState(new C10423b(new C0689a(str), c7218l2, i29, i30, z11, i21, interfaceC10015c, aVar), j10));
                            composerImplMo1636j.m1597F0(objM1619a0);
                        }
                        composerImplMo1636j.m1609Q(false);
                        textController = (TextController) objM1619a0;
                        textState = textController.f2539a;
                        if (!composerImplMo1636j.f2897L) {
                            c10423b = textState.f2563d;
                            Pair<List<C0689a.b<C7213g>>, List<C0689a.b<InterfaceC2057q<String, InterfaceC0476a, Integer, C9072e>>>> pair9 = CoreTextKt.f2526a;
                            C5207g.m11111f(c10423b, "current");
                            C5207g.m11111f(c7218l2, "style");
                            C5207g.m11111f(interfaceC10015c, "density");
                            C5207g.m11111f(aVar, "fontFamilyResolver");
                            if (!C5207g.m11106a(c10423b.f52258a.f4523a, str)) {
                                c10423b = new C10423b(new C0689a(str), c7218l2, i29, i30, z11, i21, interfaceC10015c, aVar);
                            } else {
                                c10423b = new C10423b(new C0689a(str), c7218l2, i29, i30, z11, i21, interfaceC10015c, aVar);
                            }
                            textController.m1540f(c10423b);
                        }
                        textState.getClass();
                        C5207g.m11111f(interfaceC2052l2, "<set-?>");
                        textState.f2561b = interfaceC2052l2;
                        textController.m1541g(interfaceC0004c);
                        composerImplMo1636j.mo1622c(959240076);
                        if (interfaceC0004c != null) {
                            long j19 = ((C0005d) composerImplMo1636j.mo1648p(TextSelectionColorsKt.f2571a)).f3b;
                        }
                        composerImplMo1636j.m1609Q(false);
                        interfaceC0500b3 = interfaceC0500b2;
                        InterfaceC0500b interfaceC0500bMo1929K9 = interfaceC0500b3.mo1929K(textController.m1539e());
                        composerImplMo1636j.mo1622c(544976794);
                        interfaceC10015c2 = (InterfaceC10015c) composerImplMo1636j.mo1648p(c5304d9);
                        layoutDirection = (LayoutDirection) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4143k);
                        interfaceC0647n1 = (InterfaceC0647n1) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4148p);
                        interfaceC0500bM1928b = ComposedModifierKt.m1928b(composerImplMo1636j, interfaceC0500bMo1929K9);
                        ComposeUiNode.f3726n.getClass();
                        interfaceC2041a = ComposeUiNode.Companion.f3728b;
                        composerImplMo1636j.mo1622c(1405779621);
                        if (!(composerImplMo1636j.f2910a instanceof InterfaceC5299c)) {
                            C8573r0.m16771y0();
                            throw null;
                        }
                        composerImplMo1636j.mo1640l();
                        if (composerImplMo1636j.f2897L) {
                            composerImplMo1636j.mo1634i(new InterfaceC2041a<ComposeUiNode>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText-4YKlhWE$$inlined$Layout$1
                                {
                                    super(0);
                                }

                                /* JADX WARN: Type inference failed for: r3v1, types: [androidx.compose.ui.node.ComposeUiNode, java.lang.Object] */
                                @Override // cm.InterfaceC2041a
                                /* JADX INFO: renamed from: E */
                                public final ComposeUiNode mo807E() {
                                    return interfaceC2041a.mo807E();
                                }
                            });
                        } else {
                            composerImplMo1636j.mo1653s();
                        }
                        C8573r0.m16714a1(composerImplMo1636j, textController.f2542d, ComposeUiNode.Companion.f3731e);
                        C8573r0.m16714a1(composerImplMo1636j, interfaceC10015c2, ComposeUiNode.Companion.f3730d);
                        C8573r0.m16714a1(composerImplMo1636j, layoutDirection, ComposeUiNode.Companion.f3732f);
                        C8573r0.m16714a1(composerImplMo1636j, interfaceC0647n1, ComposeUiNode.Companion.f3733g);
                        C8573r0.m16714a1(composerImplMo1636j, interfaceC0500bM1928b, ComposeUiNode.Companion.f3729c);
                        composerImplMo1636j.m1609Q(true);
                        composerImplMo1636j.m1609Q(false);
                        composerImplMo1636j.m1609Q(false);
                        z12 = z11;
                        interfaceC0500b4 = interfaceC0500b3;
                        interfaceC2052l3 = interfaceC2052l2;
                        i31 = i29;
                        i32 = i21;
                        C7218l c7218l12 = c7218l2;
                        i33 = i30;
                        c7218l3 = c7218l12;
                    }
                    c5332q0M1612T = composerImplMo1636j.m1612T();
                    if (c5332q0M1612T == null) {
                        return;
                    }
                    c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                            num.intValue();
                            BasicTextKt.m1531b(str, interfaceC0500b4, c7218l3, interfaceC2052l3, i32, z12, i31, i33, interfaceC0476a2, C8573r0.m16737l1(i13 | 1), i14);
                            return C9072e.f47360a;
                        }
                    };
                }
                i15 |= 24576;
                i21 = i10;
                i23 = i14 & 32;
                if (i23 != 0) {
                    i15 |= 196608;
                } else if ((i13 & 458752) == 0) {
                    if (composerImplMo1636j.m1598G(z10)) {
                        i24 = 131072;
                    } else {
                        i24 = 65536;
                    }
                    i15 |= i24;
                }
                i25 = i14 & 64;
                if (i25 != 0) {
                    i15 |= 1572864;
                } else if ((i13 & 3670016) == 0) {
                    if (composerImplMo1636j.m1594E(i11)) {
                        i26 = 1048576;
                    } else {
                        i26 = 524288;
                    }
                    i15 |= i26;
                }
                i27 = i14 & BuildConfig.SDK_TRUNCATE_LENGTH;
                if (i27 != 0) {
                    i15 |= 12582912;
                } else if ((i13 & 29360128) == 0) {
                    if (composerImplMo1636j.m1594E(i12)) {
                        i28 = 8388608;
                    } else {
                        i28 = 4194304;
                    }
                    i15 |= i28;
                }
                if ((i15 & 23967451) == 4793490) {
                    if (i34 != 0) {
                        interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                    }
                    if (i16 != 0) {
                        c7218l2 = C7218l.f40599c;
                    }
                    if (i18 != 0) {
                        interfaceC2052l2 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$1
                            @Override // cm.InterfaceC2052l
                            /* JADX INFO: renamed from: n */
                            public final C9072e mo528n(C7216j c7216j) {
                                C5207g.m11111f(c7216j, "it");
                                return C9072e.f47360a;
                            }
                        };
                    }
                    if (i20 != 0) {
                        i21 = 1;
                    }
                    if (i23 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    if (i25 != 0) {
                        i29 = Integer.MAX_VALUE;
                    } else {
                        i29 = i11;
                    }
                    if (i27 != 0) {
                        i30 = 1;
                    } else {
                        i30 = i12;
                    }
                    InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q10 = ComposerKt.f3003a;
                    C8584v.m16781D(i30, i29);
                    interfaceC0004c = (InterfaceC0004c) composerImplMo1636j.mo1648p(SelectionRegistrarKt.f2569a);
                    C5304d1 c5304d10 = CompositionLocalsKt.f4137e;
                    interfaceC10015c = (InterfaceC10015c) composerImplMo1636j.mo1648p(c5304d10);
                    aVar = (AbstractC0696b.a) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4140h);
                    composerImplMo1636j.mo1622c(959238681);
                    if (interfaceC0004c == null) {
                        jLongValue = 0;
                    } else {
                        jLongValue = ((Number) C0487a.m1860a(new Object[]{str, interfaceC0004c}, SaverKt.m1859a(new BasicTextKt$selectionIdSaver$1(interfaceC0004c), BasicTextKt$selectionIdSaver$2.f2523b), new InterfaceC2041a<Long>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$selectableId$1
                            {
                                super(0);
                            }

                            @Override // cm.InterfaceC2041a
                            /* JADX INFO: renamed from: E */
                            public final Long mo807E() {
                                return Long.valueOf(interfaceC0004c.m6b());
                            }
                        }, composerImplMo1636j, 4)).longValue();
                    }
                    j10 = jLongValue;
                    composerImplMo1636j.m1609Q(false);
                    composerImplMo1636j.mo1622c(-492369756);
                    objM1619a0 = composerImplMo1636j.m1619a0();
                    if (objM1619a0 == InterfaceC0476a.a.f3122a) {
                        objM1619a0 = new TextController(new TextState(new C10423b(new C0689a(str), c7218l2, i29, i30, z11, i21, interfaceC10015c, aVar), j10));
                        composerImplMo1636j.m1597F0(objM1619a0);
                    }
                    composerImplMo1636j.m1609Q(false);
                    textController = (TextController) objM1619a0;
                    textState = textController.f2539a;
                    if (!composerImplMo1636j.f2897L) {
                        c10423b = textState.f2563d;
                        Pair<List<C0689a.b<C7213g>>, List<C0689a.b<InterfaceC2057q<String, InterfaceC0476a, Integer, C9072e>>>> pair10 = CoreTextKt.f2526a;
                        C5207g.m11111f(c10423b, "current");
                        C5207g.m11111f(c7218l2, "style");
                        C5207g.m11111f(interfaceC10015c, "density");
                        C5207g.m11111f(aVar, "fontFamilyResolver");
                        if (!C5207g.m11106a(c10423b.f52258a.f4523a, str)) {
                            c10423b = new C10423b(new C0689a(str), c7218l2, i29, i30, z11, i21, interfaceC10015c, aVar);
                        } else {
                            c10423b = new C10423b(new C0689a(str), c7218l2, i29, i30, z11, i21, interfaceC10015c, aVar);
                        }
                        textController.m1540f(c10423b);
                    }
                    textState.getClass();
                    C5207g.m11111f(interfaceC2052l2, "<set-?>");
                    textState.f2561b = interfaceC2052l2;
                    textController.m1541g(interfaceC0004c);
                    composerImplMo1636j.mo1622c(959240076);
                    if (interfaceC0004c != null) {
                        long j110 = ((C0005d) composerImplMo1636j.mo1648p(TextSelectionColorsKt.f2571a)).f3b;
                    }
                    composerImplMo1636j.m1609Q(false);
                    interfaceC0500b3 = interfaceC0500b2;
                    InterfaceC0500b interfaceC0500bMo1929K10 = interfaceC0500b3.mo1929K(textController.m1539e());
                    composerImplMo1636j.mo1622c(544976794);
                    interfaceC10015c2 = (InterfaceC10015c) composerImplMo1636j.mo1648p(c5304d10);
                    layoutDirection = (LayoutDirection) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4143k);
                    interfaceC0647n1 = (InterfaceC0647n1) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4148p);
                    interfaceC0500bM1928b = ComposedModifierKt.m1928b(composerImplMo1636j, interfaceC0500bMo1929K10);
                    ComposeUiNode.f3726n.getClass();
                    interfaceC2041a = ComposeUiNode.Companion.f3728b;
                    composerImplMo1636j.mo1622c(1405779621);
                    if (!(composerImplMo1636j.f2910a instanceof InterfaceC5299c)) {
                        C8573r0.m16771y0();
                        throw null;
                    }
                    composerImplMo1636j.mo1640l();
                    if (composerImplMo1636j.f2897L) {
                        composerImplMo1636j.mo1634i(new InterfaceC2041a<ComposeUiNode>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText-4YKlhWE$$inlined$Layout$1
                            {
                                super(0);
                            }

                            /* JADX WARN: Type inference failed for: r3v1, types: [androidx.compose.ui.node.ComposeUiNode, java.lang.Object] */
                            @Override // cm.InterfaceC2041a
                            /* JADX INFO: renamed from: E */
                            public final ComposeUiNode mo807E() {
                                return interfaceC2041a.mo807E();
                            }
                        });
                    } else {
                        composerImplMo1636j.mo1653s();
                    }
                    C8573r0.m16714a1(composerImplMo1636j, textController.f2542d, ComposeUiNode.Companion.f3731e);
                    C8573r0.m16714a1(composerImplMo1636j, interfaceC10015c2, ComposeUiNode.Companion.f3730d);
                    C8573r0.m16714a1(composerImplMo1636j, layoutDirection, ComposeUiNode.Companion.f3732f);
                    C8573r0.m16714a1(composerImplMo1636j, interfaceC0647n1, ComposeUiNode.Companion.f3733g);
                    C8573r0.m16714a1(composerImplMo1636j, interfaceC0500bM1928b, ComposeUiNode.Companion.f3729c);
                    composerImplMo1636j.m1609Q(true);
                    composerImplMo1636j.m1609Q(false);
                    composerImplMo1636j.m1609Q(false);
                    z12 = z11;
                    interfaceC0500b4 = interfaceC0500b3;
                    interfaceC2052l3 = interfaceC2052l2;
                    i31 = i29;
                    i32 = i21;
                    C7218l c7218l13 = c7218l2;
                    i33 = i30;
                    c7218l3 = c7218l13;
                } else {
                    if (i34 != 0) {
                        interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                    }
                    if (i16 != 0) {
                        c7218l2 = C7218l.f40599c;
                    }
                    if (i18 != 0) {
                        interfaceC2052l2 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$1
                            @Override // cm.InterfaceC2052l
                            /* JADX INFO: renamed from: n */
                            public final C9072e mo528n(C7216j c7216j) {
                                C5207g.m11111f(c7216j, "it");
                                return C9072e.f47360a;
                            }
                        };
                    }
                    if (i20 != 0) {
                        i21 = 1;
                    }
                    if (i23 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    if (i25 != 0) {
                        i29 = Integer.MAX_VALUE;
                    } else {
                        i29 = i11;
                    }
                    if (i27 != 0) {
                        i30 = 1;
                    } else {
                        i30 = i12;
                    }
                    InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q11 = ComposerKt.f3003a;
                    C8584v.m16781D(i30, i29);
                    interfaceC0004c = (InterfaceC0004c) composerImplMo1636j.mo1648p(SelectionRegistrarKt.f2569a);
                    C5304d1 c5304d11 = CompositionLocalsKt.f4137e;
                    interfaceC10015c = (InterfaceC10015c) composerImplMo1636j.mo1648p(c5304d11);
                    aVar = (AbstractC0696b.a) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4140h);
                    composerImplMo1636j.mo1622c(959238681);
                    if (interfaceC0004c == null) {
                        jLongValue = 0;
                    } else {
                        jLongValue = ((Number) C0487a.m1860a(new Object[]{str, interfaceC0004c}, SaverKt.m1859a(new BasicTextKt$selectionIdSaver$1(interfaceC0004c), BasicTextKt$selectionIdSaver$2.f2523b), new InterfaceC2041a<Long>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$selectableId$1
                            {
                                super(0);
                            }

                            @Override // cm.InterfaceC2041a
                            /* JADX INFO: renamed from: E */
                            public final Long mo807E() {
                                return Long.valueOf(interfaceC0004c.m6b());
                            }
                        }, composerImplMo1636j, 4)).longValue();
                    }
                    j10 = jLongValue;
                    composerImplMo1636j.m1609Q(false);
                    composerImplMo1636j.mo1622c(-492369756);
                    objM1619a0 = composerImplMo1636j.m1619a0();
                    if (objM1619a0 == InterfaceC0476a.a.f3122a) {
                        objM1619a0 = new TextController(new TextState(new C10423b(new C0689a(str), c7218l2, i29, i30, z11, i21, interfaceC10015c, aVar), j10));
                        composerImplMo1636j.m1597F0(objM1619a0);
                    }
                    composerImplMo1636j.m1609Q(false);
                    textController = (TextController) objM1619a0;
                    textState = textController.f2539a;
                    if (!composerImplMo1636j.f2897L) {
                        c10423b = textState.f2563d;
                        Pair<List<C0689a.b<C7213g>>, List<C0689a.b<InterfaceC2057q<String, InterfaceC0476a, Integer, C9072e>>>> pair11 = CoreTextKt.f2526a;
                        C5207g.m11111f(c10423b, "current");
                        C5207g.m11111f(c7218l2, "style");
                        C5207g.m11111f(interfaceC10015c, "density");
                        C5207g.m11111f(aVar, "fontFamilyResolver");
                        if (!C5207g.m11106a(c10423b.f52258a.f4523a, str)) {
                            c10423b = new C10423b(new C0689a(str), c7218l2, i29, i30, z11, i21, interfaceC10015c, aVar);
                        } else {
                            c10423b = new C10423b(new C0689a(str), c7218l2, i29, i30, z11, i21, interfaceC10015c, aVar);
                        }
                        textController.m1540f(c10423b);
                    }
                    textState.getClass();
                    C5207g.m11111f(interfaceC2052l2, "<set-?>");
                    textState.f2561b = interfaceC2052l2;
                    textController.m1541g(interfaceC0004c);
                    composerImplMo1636j.mo1622c(959240076);
                    if (interfaceC0004c != null) {
                        long j111 = ((C0005d) composerImplMo1636j.mo1648p(TextSelectionColorsKt.f2571a)).f3b;
                    }
                    composerImplMo1636j.m1609Q(false);
                    interfaceC0500b3 = interfaceC0500b2;
                    InterfaceC0500b interfaceC0500bMo1929K11 = interfaceC0500b3.mo1929K(textController.m1539e());
                    composerImplMo1636j.mo1622c(544976794);
                    interfaceC10015c2 = (InterfaceC10015c) composerImplMo1636j.mo1648p(c5304d11);
                    layoutDirection = (LayoutDirection) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4143k);
                    interfaceC0647n1 = (InterfaceC0647n1) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4148p);
                    interfaceC0500bM1928b = ComposedModifierKt.m1928b(composerImplMo1636j, interfaceC0500bMo1929K11);
                    ComposeUiNode.f3726n.getClass();
                    interfaceC2041a = ComposeUiNode.Companion.f3728b;
                    composerImplMo1636j.mo1622c(1405779621);
                    if (!(composerImplMo1636j.f2910a instanceof InterfaceC5299c)) {
                        C8573r0.m16771y0();
                        throw null;
                    }
                    composerImplMo1636j.mo1640l();
                    if (composerImplMo1636j.f2897L) {
                        composerImplMo1636j.mo1634i(new InterfaceC2041a<ComposeUiNode>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText-4YKlhWE$$inlined$Layout$1
                            {
                                super(0);
                            }

                            /* JADX WARN: Type inference failed for: r3v1, types: [androidx.compose.ui.node.ComposeUiNode, java.lang.Object] */
                            @Override // cm.InterfaceC2041a
                            /* JADX INFO: renamed from: E */
                            public final ComposeUiNode mo807E() {
                                return interfaceC2041a.mo807E();
                            }
                        });
                    } else {
                        composerImplMo1636j.mo1653s();
                    }
                    C8573r0.m16714a1(composerImplMo1636j, textController.f2542d, ComposeUiNode.Companion.f3731e);
                    C8573r0.m16714a1(composerImplMo1636j, interfaceC10015c2, ComposeUiNode.Companion.f3730d);
                    C8573r0.m16714a1(composerImplMo1636j, layoutDirection, ComposeUiNode.Companion.f3732f);
                    C8573r0.m16714a1(composerImplMo1636j, interfaceC0647n1, ComposeUiNode.Companion.f3733g);
                    C8573r0.m16714a1(composerImplMo1636j, interfaceC0500bM1928b, ComposeUiNode.Companion.f3729c);
                    composerImplMo1636j.m1609Q(true);
                    composerImplMo1636j.m1609Q(false);
                    composerImplMo1636j.m1609Q(false);
                    z12 = z11;
                    interfaceC0500b4 = interfaceC0500b3;
                    interfaceC2052l3 = interfaceC2052l2;
                    i31 = i29;
                    i32 = i21;
                    C7218l c7218l14 = c7218l2;
                    i33 = i30;
                    c7218l3 = c7218l14;
                }
                c5332q0M1612T = composerImplMo1636j.m1612T();
                if (c5332q0M1612T == null) {
                    return;
                }
                c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // cm.InterfaceC2056p
                    /* JADX INFO: renamed from: m0 */
                    public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                        num.intValue();
                        BasicTextKt.m1531b(str, interfaceC0500b4, c7218l3, interfaceC2052l3, i32, z12, i31, i33, interfaceC0476a2, C8573r0.m16737l1(i13 | 1), i14);
                        return C9072e.f47360a;
                    }
                };
            }
            i15 |= 3072;
            interfaceC2052l2 = interfaceC2052l;
            i20 = i14 & 16;
            if (i20 != 0) {
                if ((57344 & i13) == 0) {
                    i21 = i10;
                    if (composerImplMo1636j.m1594E(i21)) {
                        i22 = 16384;
                    } else {
                        i22 = 8192;
                    }
                    i15 |= i22;
                }
                i23 = i14 & 32;
                if (i23 != 0) {
                    i15 |= 196608;
                } else if ((i13 & 458752) == 0) {
                    if (composerImplMo1636j.m1598G(z10)) {
                        i24 = 131072;
                    } else {
                        i24 = 65536;
                    }
                    i15 |= i24;
                }
                i25 = i14 & 64;
                if (i25 != 0) {
                    i15 |= 1572864;
                } else if ((i13 & 3670016) == 0) {
                    if (composerImplMo1636j.m1594E(i11)) {
                        i26 = 1048576;
                    } else {
                        i26 = 524288;
                    }
                    i15 |= i26;
                }
                i27 = i14 & BuildConfig.SDK_TRUNCATE_LENGTH;
                if (i27 != 0) {
                    i15 |= 12582912;
                } else if ((i13 & 29360128) == 0) {
                    if (composerImplMo1636j.m1594E(i12)) {
                        i28 = 8388608;
                    } else {
                        i28 = 4194304;
                    }
                    i15 |= i28;
                }
                if ((i15 & 23967451) == 4793490) {
                    if (i34 != 0) {
                        interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                    }
                    if (i16 != 0) {
                        c7218l2 = C7218l.f40599c;
                    }
                    if (i18 != 0) {
                        interfaceC2052l2 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$1
                            @Override // cm.InterfaceC2052l
                            /* JADX INFO: renamed from: n */
                            public final C9072e mo528n(C7216j c7216j) {
                                C5207g.m11111f(c7216j, "it");
                                return C9072e.f47360a;
                            }
                        };
                    }
                    if (i20 != 0) {
                        i21 = 1;
                    }
                    if (i23 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    if (i25 != 0) {
                        i29 = Integer.MAX_VALUE;
                    } else {
                        i29 = i11;
                    }
                    if (i27 != 0) {
                        i30 = 1;
                    } else {
                        i30 = i12;
                    }
                    InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q12 = ComposerKt.f3003a;
                    C8584v.m16781D(i30, i29);
                    interfaceC0004c = (InterfaceC0004c) composerImplMo1636j.mo1648p(SelectionRegistrarKt.f2569a);
                    C5304d1 c5304d12 = CompositionLocalsKt.f4137e;
                    interfaceC10015c = (InterfaceC10015c) composerImplMo1636j.mo1648p(c5304d12);
                    aVar = (AbstractC0696b.a) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4140h);
                    composerImplMo1636j.mo1622c(959238681);
                    if (interfaceC0004c == null) {
                        jLongValue = 0;
                    } else {
                        jLongValue = ((Number) C0487a.m1860a(new Object[]{str, interfaceC0004c}, SaverKt.m1859a(new BasicTextKt$selectionIdSaver$1(interfaceC0004c), BasicTextKt$selectionIdSaver$2.f2523b), new InterfaceC2041a<Long>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$selectableId$1
                            {
                                super(0);
                            }

                            @Override // cm.InterfaceC2041a
                            /* JADX INFO: renamed from: E */
                            public final Long mo807E() {
                                return Long.valueOf(interfaceC0004c.m6b());
                            }
                        }, composerImplMo1636j, 4)).longValue();
                    }
                    j10 = jLongValue;
                    composerImplMo1636j.m1609Q(false);
                    composerImplMo1636j.mo1622c(-492369756);
                    objM1619a0 = composerImplMo1636j.m1619a0();
                    if (objM1619a0 == InterfaceC0476a.a.f3122a) {
                        objM1619a0 = new TextController(new TextState(new C10423b(new C0689a(str), c7218l2, i29, i30, z11, i21, interfaceC10015c, aVar), j10));
                        composerImplMo1636j.m1597F0(objM1619a0);
                    }
                    composerImplMo1636j.m1609Q(false);
                    textController = (TextController) objM1619a0;
                    textState = textController.f2539a;
                    if (!composerImplMo1636j.f2897L) {
                        c10423b = textState.f2563d;
                        Pair<List<C0689a.b<C7213g>>, List<C0689a.b<InterfaceC2057q<String, InterfaceC0476a, Integer, C9072e>>>> pair12 = CoreTextKt.f2526a;
                        C5207g.m11111f(c10423b, "current");
                        C5207g.m11111f(c7218l2, "style");
                        C5207g.m11111f(interfaceC10015c, "density");
                        C5207g.m11111f(aVar, "fontFamilyResolver");
                        if (!C5207g.m11106a(c10423b.f52258a.f4523a, str)) {
                            c10423b = new C10423b(new C0689a(str), c7218l2, i29, i30, z11, i21, interfaceC10015c, aVar);
                        } else {
                            c10423b = new C10423b(new C0689a(str), c7218l2, i29, i30, z11, i21, interfaceC10015c, aVar);
                        }
                        textController.m1540f(c10423b);
                    }
                    textState.getClass();
                    C5207g.m11111f(interfaceC2052l2, "<set-?>");
                    textState.f2561b = interfaceC2052l2;
                    textController.m1541g(interfaceC0004c);
                    composerImplMo1636j.mo1622c(959240076);
                    if (interfaceC0004c != null) {
                        long j112 = ((C0005d) composerImplMo1636j.mo1648p(TextSelectionColorsKt.f2571a)).f3b;
                    }
                    composerImplMo1636j.m1609Q(false);
                    interfaceC0500b3 = interfaceC0500b2;
                    InterfaceC0500b interfaceC0500bMo1929K12 = interfaceC0500b3.mo1929K(textController.m1539e());
                    composerImplMo1636j.mo1622c(544976794);
                    interfaceC10015c2 = (InterfaceC10015c) composerImplMo1636j.mo1648p(c5304d12);
                    layoutDirection = (LayoutDirection) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4143k);
                    interfaceC0647n1 = (InterfaceC0647n1) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4148p);
                    interfaceC0500bM1928b = ComposedModifierKt.m1928b(composerImplMo1636j, interfaceC0500bMo1929K12);
                    ComposeUiNode.f3726n.getClass();
                    interfaceC2041a = ComposeUiNode.Companion.f3728b;
                    composerImplMo1636j.mo1622c(1405779621);
                    if (!(composerImplMo1636j.f2910a instanceof InterfaceC5299c)) {
                        C8573r0.m16771y0();
                        throw null;
                    }
                    composerImplMo1636j.mo1640l();
                    if (composerImplMo1636j.f2897L) {
                        composerImplMo1636j.mo1634i(new InterfaceC2041a<ComposeUiNode>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText-4YKlhWE$$inlined$Layout$1
                            {
                                super(0);
                            }

                            /* JADX WARN: Type inference failed for: r3v1, types: [androidx.compose.ui.node.ComposeUiNode, java.lang.Object] */
                            @Override // cm.InterfaceC2041a
                            /* JADX INFO: renamed from: E */
                            public final ComposeUiNode mo807E() {
                                return interfaceC2041a.mo807E();
                            }
                        });
                    } else {
                        composerImplMo1636j.mo1653s();
                    }
                    C8573r0.m16714a1(composerImplMo1636j, textController.f2542d, ComposeUiNode.Companion.f3731e);
                    C8573r0.m16714a1(composerImplMo1636j, interfaceC10015c2, ComposeUiNode.Companion.f3730d);
                    C8573r0.m16714a1(composerImplMo1636j, layoutDirection, ComposeUiNode.Companion.f3732f);
                    C8573r0.m16714a1(composerImplMo1636j, interfaceC0647n1, ComposeUiNode.Companion.f3733g);
                    C8573r0.m16714a1(composerImplMo1636j, interfaceC0500bM1928b, ComposeUiNode.Companion.f3729c);
                    composerImplMo1636j.m1609Q(true);
                    composerImplMo1636j.m1609Q(false);
                    composerImplMo1636j.m1609Q(false);
                    z12 = z11;
                    interfaceC0500b4 = interfaceC0500b3;
                    interfaceC2052l3 = interfaceC2052l2;
                    i31 = i29;
                    i32 = i21;
                    C7218l c7218l15 = c7218l2;
                    i33 = i30;
                    c7218l3 = c7218l15;
                } else {
                    if (i34 != 0) {
                        interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                    }
                    if (i16 != 0) {
                        c7218l2 = C7218l.f40599c;
                    }
                    if (i18 != 0) {
                        interfaceC2052l2 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$1
                            @Override // cm.InterfaceC2052l
                            /* JADX INFO: renamed from: n */
                            public final C9072e mo528n(C7216j c7216j) {
                                C5207g.m11111f(c7216j, "it");
                                return C9072e.f47360a;
                            }
                        };
                    }
                    if (i20 != 0) {
                        i21 = 1;
                    }
                    if (i23 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    if (i25 != 0) {
                        i29 = Integer.MAX_VALUE;
                    } else {
                        i29 = i11;
                    }
                    if (i27 != 0) {
                        i30 = 1;
                    } else {
                        i30 = i12;
                    }
                    InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q13 = ComposerKt.f3003a;
                    C8584v.m16781D(i30, i29);
                    interfaceC0004c = (InterfaceC0004c) composerImplMo1636j.mo1648p(SelectionRegistrarKt.f2569a);
                    C5304d1 c5304d13 = CompositionLocalsKt.f4137e;
                    interfaceC10015c = (InterfaceC10015c) composerImplMo1636j.mo1648p(c5304d13);
                    aVar = (AbstractC0696b.a) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4140h);
                    composerImplMo1636j.mo1622c(959238681);
                    if (interfaceC0004c == null) {
                        jLongValue = 0;
                    } else {
                        jLongValue = ((Number) C0487a.m1860a(new Object[]{str, interfaceC0004c}, SaverKt.m1859a(new BasicTextKt$selectionIdSaver$1(interfaceC0004c), BasicTextKt$selectionIdSaver$2.f2523b), new InterfaceC2041a<Long>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$selectableId$1
                            {
                                super(0);
                            }

                            @Override // cm.InterfaceC2041a
                            /* JADX INFO: renamed from: E */
                            public final Long mo807E() {
                                return Long.valueOf(interfaceC0004c.m6b());
                            }
                        }, composerImplMo1636j, 4)).longValue();
                    }
                    j10 = jLongValue;
                    composerImplMo1636j.m1609Q(false);
                    composerImplMo1636j.mo1622c(-492369756);
                    objM1619a0 = composerImplMo1636j.m1619a0();
                    if (objM1619a0 == InterfaceC0476a.a.f3122a) {
                        objM1619a0 = new TextController(new TextState(new C10423b(new C0689a(str), c7218l2, i29, i30, z11, i21, interfaceC10015c, aVar), j10));
                        composerImplMo1636j.m1597F0(objM1619a0);
                    }
                    composerImplMo1636j.m1609Q(false);
                    textController = (TextController) objM1619a0;
                    textState = textController.f2539a;
                    if (!composerImplMo1636j.f2897L) {
                        c10423b = textState.f2563d;
                        Pair<List<C0689a.b<C7213g>>, List<C0689a.b<InterfaceC2057q<String, InterfaceC0476a, Integer, C9072e>>>> pair13 = CoreTextKt.f2526a;
                        C5207g.m11111f(c10423b, "current");
                        C5207g.m11111f(c7218l2, "style");
                        C5207g.m11111f(interfaceC10015c, "density");
                        C5207g.m11111f(aVar, "fontFamilyResolver");
                        if (!C5207g.m11106a(c10423b.f52258a.f4523a, str)) {
                            c10423b = new C10423b(new C0689a(str), c7218l2, i29, i30, z11, i21, interfaceC10015c, aVar);
                        } else {
                            c10423b = new C10423b(new C0689a(str), c7218l2, i29, i30, z11, i21, interfaceC10015c, aVar);
                        }
                        textController.m1540f(c10423b);
                    }
                    textState.getClass();
                    C5207g.m11111f(interfaceC2052l2, "<set-?>");
                    textState.f2561b = interfaceC2052l2;
                    textController.m1541g(interfaceC0004c);
                    composerImplMo1636j.mo1622c(959240076);
                    if (interfaceC0004c != null) {
                        long j113 = ((C0005d) composerImplMo1636j.mo1648p(TextSelectionColorsKt.f2571a)).f3b;
                    }
                    composerImplMo1636j.m1609Q(false);
                    interfaceC0500b3 = interfaceC0500b2;
                    InterfaceC0500b interfaceC0500bMo1929K13 = interfaceC0500b3.mo1929K(textController.m1539e());
                    composerImplMo1636j.mo1622c(544976794);
                    interfaceC10015c2 = (InterfaceC10015c) composerImplMo1636j.mo1648p(c5304d13);
                    layoutDirection = (LayoutDirection) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4143k);
                    interfaceC0647n1 = (InterfaceC0647n1) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4148p);
                    interfaceC0500bM1928b = ComposedModifierKt.m1928b(composerImplMo1636j, interfaceC0500bMo1929K13);
                    ComposeUiNode.f3726n.getClass();
                    interfaceC2041a = ComposeUiNode.Companion.f3728b;
                    composerImplMo1636j.mo1622c(1405779621);
                    if (!(composerImplMo1636j.f2910a instanceof InterfaceC5299c)) {
                        C8573r0.m16771y0();
                        throw null;
                    }
                    composerImplMo1636j.mo1640l();
                    if (composerImplMo1636j.f2897L) {
                        composerImplMo1636j.mo1634i(new InterfaceC2041a<ComposeUiNode>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText-4YKlhWE$$inlined$Layout$1
                            {
                                super(0);
                            }

                            /* JADX WARN: Type inference failed for: r3v1, types: [androidx.compose.ui.node.ComposeUiNode, java.lang.Object] */
                            @Override // cm.InterfaceC2041a
                            /* JADX INFO: renamed from: E */
                            public final ComposeUiNode mo807E() {
                                return interfaceC2041a.mo807E();
                            }
                        });
                    } else {
                        composerImplMo1636j.mo1653s();
                    }
                    C8573r0.m16714a1(composerImplMo1636j, textController.f2542d, ComposeUiNode.Companion.f3731e);
                    C8573r0.m16714a1(composerImplMo1636j, interfaceC10015c2, ComposeUiNode.Companion.f3730d);
                    C8573r0.m16714a1(composerImplMo1636j, layoutDirection, ComposeUiNode.Companion.f3732f);
                    C8573r0.m16714a1(composerImplMo1636j, interfaceC0647n1, ComposeUiNode.Companion.f3733g);
                    C8573r0.m16714a1(composerImplMo1636j, interfaceC0500bM1928b, ComposeUiNode.Companion.f3729c);
                    composerImplMo1636j.m1609Q(true);
                    composerImplMo1636j.m1609Q(false);
                    composerImplMo1636j.m1609Q(false);
                    z12 = z11;
                    interfaceC0500b4 = interfaceC0500b3;
                    interfaceC2052l3 = interfaceC2052l2;
                    i31 = i29;
                    i32 = i21;
                    C7218l c7218l16 = c7218l2;
                    i33 = i30;
                    c7218l3 = c7218l16;
                }
                c5332q0M1612T = composerImplMo1636j.m1612T();
                if (c5332q0M1612T == null) {
                    return;
                }
                c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // cm.InterfaceC2056p
                    /* JADX INFO: renamed from: m0 */
                    public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                        num.intValue();
                        BasicTextKt.m1531b(str, interfaceC0500b4, c7218l3, interfaceC2052l3, i32, z12, i31, i33, interfaceC0476a2, C8573r0.m16737l1(i13 | 1), i14);
                        return C9072e.f47360a;
                    }
                };
            }
            i15 |= 24576;
            i21 = i10;
            i23 = i14 & 32;
            if (i23 != 0) {
                i15 |= 196608;
            } else if ((i13 & 458752) == 0) {
                if (composerImplMo1636j.m1598G(z10)) {
                    i24 = 131072;
                } else {
                    i24 = 65536;
                }
                i15 |= i24;
            }
            i25 = i14 & 64;
            if (i25 != 0) {
                i15 |= 1572864;
            } else if ((i13 & 3670016) == 0) {
                if (composerImplMo1636j.m1594E(i11)) {
                    i26 = 1048576;
                } else {
                    i26 = 524288;
                }
                i15 |= i26;
            }
            i27 = i14 & BuildConfig.SDK_TRUNCATE_LENGTH;
            if (i27 != 0) {
                i15 |= 12582912;
            } else if ((i13 & 29360128) == 0) {
                if (composerImplMo1636j.m1594E(i12)) {
                    i28 = 8388608;
                } else {
                    i28 = 4194304;
                }
                i15 |= i28;
            }
            if ((i15 & 23967451) == 4793490) {
                if (i34 != 0) {
                    interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                }
                if (i16 != 0) {
                    c7218l2 = C7218l.f40599c;
                }
                if (i18 != 0) {
                    interfaceC2052l2 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$1
                        @Override // cm.InterfaceC2052l
                        /* JADX INFO: renamed from: n */
                        public final C9072e mo528n(C7216j c7216j) {
                            C5207g.m11111f(c7216j, "it");
                            return C9072e.f47360a;
                        }
                    };
                }
                if (i20 != 0) {
                    i21 = 1;
                }
                if (i23 != 0) {
                    z11 = true;
                } else {
                    z11 = z10;
                }
                if (i25 != 0) {
                    i29 = Integer.MAX_VALUE;
                } else {
                    i29 = i11;
                }
                if (i27 != 0) {
                    i30 = 1;
                } else {
                    i30 = i12;
                }
                InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q14 = ComposerKt.f3003a;
                C8584v.m16781D(i30, i29);
                interfaceC0004c = (InterfaceC0004c) composerImplMo1636j.mo1648p(SelectionRegistrarKt.f2569a);
                C5304d1 c5304d14 = CompositionLocalsKt.f4137e;
                interfaceC10015c = (InterfaceC10015c) composerImplMo1636j.mo1648p(c5304d14);
                aVar = (AbstractC0696b.a) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4140h);
                composerImplMo1636j.mo1622c(959238681);
                if (interfaceC0004c == null) {
                    jLongValue = 0;
                } else {
                    jLongValue = ((Number) C0487a.m1860a(new Object[]{str, interfaceC0004c}, SaverKt.m1859a(new BasicTextKt$selectionIdSaver$1(interfaceC0004c), BasicTextKt$selectionIdSaver$2.f2523b), new InterfaceC2041a<Long>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$selectableId$1
                        {
                            super(0);
                        }

                        @Override // cm.InterfaceC2041a
                        /* JADX INFO: renamed from: E */
                        public final Long mo807E() {
                            return Long.valueOf(interfaceC0004c.m6b());
                        }
                    }, composerImplMo1636j, 4)).longValue();
                }
                j10 = jLongValue;
                composerImplMo1636j.m1609Q(false);
                composerImplMo1636j.mo1622c(-492369756);
                objM1619a0 = composerImplMo1636j.m1619a0();
                if (objM1619a0 == InterfaceC0476a.a.f3122a) {
                    objM1619a0 = new TextController(new TextState(new C10423b(new C0689a(str), c7218l2, i29, i30, z11, i21, interfaceC10015c, aVar), j10));
                    composerImplMo1636j.m1597F0(objM1619a0);
                }
                composerImplMo1636j.m1609Q(false);
                textController = (TextController) objM1619a0;
                textState = textController.f2539a;
                if (!composerImplMo1636j.f2897L) {
                    c10423b = textState.f2563d;
                    Pair<List<C0689a.b<C7213g>>, List<C0689a.b<InterfaceC2057q<String, InterfaceC0476a, Integer, C9072e>>>> pair14 = CoreTextKt.f2526a;
                    C5207g.m11111f(c10423b, "current");
                    C5207g.m11111f(c7218l2, "style");
                    C5207g.m11111f(interfaceC10015c, "density");
                    C5207g.m11111f(aVar, "fontFamilyResolver");
                    if (!C5207g.m11106a(c10423b.f52258a.f4523a, str)) {
                        c10423b = new C10423b(new C0689a(str), c7218l2, i29, i30, z11, i21, interfaceC10015c, aVar);
                    } else {
                        c10423b = new C10423b(new C0689a(str), c7218l2, i29, i30, z11, i21, interfaceC10015c, aVar);
                    }
                    textController.m1540f(c10423b);
                }
                textState.getClass();
                C5207g.m11111f(interfaceC2052l2, "<set-?>");
                textState.f2561b = interfaceC2052l2;
                textController.m1541g(interfaceC0004c);
                composerImplMo1636j.mo1622c(959240076);
                if (interfaceC0004c != null) {
                    long j114 = ((C0005d) composerImplMo1636j.mo1648p(TextSelectionColorsKt.f2571a)).f3b;
                }
                composerImplMo1636j.m1609Q(false);
                interfaceC0500b3 = interfaceC0500b2;
                InterfaceC0500b interfaceC0500bMo1929K14 = interfaceC0500b3.mo1929K(textController.m1539e());
                composerImplMo1636j.mo1622c(544976794);
                interfaceC10015c2 = (InterfaceC10015c) composerImplMo1636j.mo1648p(c5304d14);
                layoutDirection = (LayoutDirection) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4143k);
                interfaceC0647n1 = (InterfaceC0647n1) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4148p);
                interfaceC0500bM1928b = ComposedModifierKt.m1928b(composerImplMo1636j, interfaceC0500bMo1929K14);
                ComposeUiNode.f3726n.getClass();
                interfaceC2041a = ComposeUiNode.Companion.f3728b;
                composerImplMo1636j.mo1622c(1405779621);
                if (!(composerImplMo1636j.f2910a instanceof InterfaceC5299c)) {
                    C8573r0.m16771y0();
                    throw null;
                }
                composerImplMo1636j.mo1640l();
                if (composerImplMo1636j.f2897L) {
                    composerImplMo1636j.mo1634i(new InterfaceC2041a<ComposeUiNode>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText-4YKlhWE$$inlined$Layout$1
                        {
                            super(0);
                        }

                        /* JADX WARN: Type inference failed for: r3v1, types: [androidx.compose.ui.node.ComposeUiNode, java.lang.Object] */
                        @Override // cm.InterfaceC2041a
                        /* JADX INFO: renamed from: E */
                        public final ComposeUiNode mo807E() {
                            return interfaceC2041a.mo807E();
                        }
                    });
                } else {
                    composerImplMo1636j.mo1653s();
                }
                C8573r0.m16714a1(composerImplMo1636j, textController.f2542d, ComposeUiNode.Companion.f3731e);
                C8573r0.m16714a1(composerImplMo1636j, interfaceC10015c2, ComposeUiNode.Companion.f3730d);
                C8573r0.m16714a1(composerImplMo1636j, layoutDirection, ComposeUiNode.Companion.f3732f);
                C8573r0.m16714a1(composerImplMo1636j, interfaceC0647n1, ComposeUiNode.Companion.f3733g);
                C8573r0.m16714a1(composerImplMo1636j, interfaceC0500bM1928b, ComposeUiNode.Companion.f3729c);
                composerImplMo1636j.m1609Q(true);
                composerImplMo1636j.m1609Q(false);
                composerImplMo1636j.m1609Q(false);
                z12 = z11;
                interfaceC0500b4 = interfaceC0500b3;
                interfaceC2052l3 = interfaceC2052l2;
                i31 = i29;
                i32 = i21;
                C7218l c7218l17 = c7218l2;
                i33 = i30;
                c7218l3 = c7218l17;
            } else {
                if (i34 != 0) {
                    interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                }
                if (i16 != 0) {
                    c7218l2 = C7218l.f40599c;
                }
                if (i18 != 0) {
                    interfaceC2052l2 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$1
                        @Override // cm.InterfaceC2052l
                        /* JADX INFO: renamed from: n */
                        public final C9072e mo528n(C7216j c7216j) {
                            C5207g.m11111f(c7216j, "it");
                            return C9072e.f47360a;
                        }
                    };
                }
                if (i20 != 0) {
                    i21 = 1;
                }
                if (i23 != 0) {
                    z11 = true;
                } else {
                    z11 = z10;
                }
                if (i25 != 0) {
                    i29 = Integer.MAX_VALUE;
                } else {
                    i29 = i11;
                }
                if (i27 != 0) {
                    i30 = 1;
                } else {
                    i30 = i12;
                }
                InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q15 = ComposerKt.f3003a;
                C8584v.m16781D(i30, i29);
                interfaceC0004c = (InterfaceC0004c) composerImplMo1636j.mo1648p(SelectionRegistrarKt.f2569a);
                C5304d1 c5304d15 = CompositionLocalsKt.f4137e;
                interfaceC10015c = (InterfaceC10015c) composerImplMo1636j.mo1648p(c5304d15);
                aVar = (AbstractC0696b.a) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4140h);
                composerImplMo1636j.mo1622c(959238681);
                if (interfaceC0004c == null) {
                    jLongValue = 0;
                } else {
                    jLongValue = ((Number) C0487a.m1860a(new Object[]{str, interfaceC0004c}, SaverKt.m1859a(new BasicTextKt$selectionIdSaver$1(interfaceC0004c), BasicTextKt$selectionIdSaver$2.f2523b), new InterfaceC2041a<Long>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$selectableId$1
                        {
                            super(0);
                        }

                        @Override // cm.InterfaceC2041a
                        /* JADX INFO: renamed from: E */
                        public final Long mo807E() {
                            return Long.valueOf(interfaceC0004c.m6b());
                        }
                    }, composerImplMo1636j, 4)).longValue();
                }
                j10 = jLongValue;
                composerImplMo1636j.m1609Q(false);
                composerImplMo1636j.mo1622c(-492369756);
                objM1619a0 = composerImplMo1636j.m1619a0();
                if (objM1619a0 == InterfaceC0476a.a.f3122a) {
                    objM1619a0 = new TextController(new TextState(new C10423b(new C0689a(str), c7218l2, i29, i30, z11, i21, interfaceC10015c, aVar), j10));
                    composerImplMo1636j.m1597F0(objM1619a0);
                }
                composerImplMo1636j.m1609Q(false);
                textController = (TextController) objM1619a0;
                textState = textController.f2539a;
                if (!composerImplMo1636j.f2897L) {
                    c10423b = textState.f2563d;
                    Pair<List<C0689a.b<C7213g>>, List<C0689a.b<InterfaceC2057q<String, InterfaceC0476a, Integer, C9072e>>>> pair15 = CoreTextKt.f2526a;
                    C5207g.m11111f(c10423b, "current");
                    C5207g.m11111f(c7218l2, "style");
                    C5207g.m11111f(interfaceC10015c, "density");
                    C5207g.m11111f(aVar, "fontFamilyResolver");
                    if (!C5207g.m11106a(c10423b.f52258a.f4523a, str)) {
                        c10423b = new C10423b(new C0689a(str), c7218l2, i29, i30, z11, i21, interfaceC10015c, aVar);
                    } else {
                        c10423b = new C10423b(new C0689a(str), c7218l2, i29, i30, z11, i21, interfaceC10015c, aVar);
                    }
                    textController.m1540f(c10423b);
                }
                textState.getClass();
                C5207g.m11111f(interfaceC2052l2, "<set-?>");
                textState.f2561b = interfaceC2052l2;
                textController.m1541g(interfaceC0004c);
                composerImplMo1636j.mo1622c(959240076);
                if (interfaceC0004c != null) {
                    long j115 = ((C0005d) composerImplMo1636j.mo1648p(TextSelectionColorsKt.f2571a)).f3b;
                }
                composerImplMo1636j.m1609Q(false);
                interfaceC0500b3 = interfaceC0500b2;
                InterfaceC0500b interfaceC0500bMo1929K15 = interfaceC0500b3.mo1929K(textController.m1539e());
                composerImplMo1636j.mo1622c(544976794);
                interfaceC10015c2 = (InterfaceC10015c) composerImplMo1636j.mo1648p(c5304d15);
                layoutDirection = (LayoutDirection) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4143k);
                interfaceC0647n1 = (InterfaceC0647n1) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4148p);
                interfaceC0500bM1928b = ComposedModifierKt.m1928b(composerImplMo1636j, interfaceC0500bMo1929K15);
                ComposeUiNode.f3726n.getClass();
                interfaceC2041a = ComposeUiNode.Companion.f3728b;
                composerImplMo1636j.mo1622c(1405779621);
                if (!(composerImplMo1636j.f2910a instanceof InterfaceC5299c)) {
                    C8573r0.m16771y0();
                    throw null;
                }
                composerImplMo1636j.mo1640l();
                if (composerImplMo1636j.f2897L) {
                    composerImplMo1636j.mo1634i(new InterfaceC2041a<ComposeUiNode>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText-4YKlhWE$$inlined$Layout$1
                        {
                            super(0);
                        }

                        /* JADX WARN: Type inference failed for: r3v1, types: [androidx.compose.ui.node.ComposeUiNode, java.lang.Object] */
                        @Override // cm.InterfaceC2041a
                        /* JADX INFO: renamed from: E */
                        public final ComposeUiNode mo807E() {
                            return interfaceC2041a.mo807E();
                        }
                    });
                } else {
                    composerImplMo1636j.mo1653s();
                }
                C8573r0.m16714a1(composerImplMo1636j, textController.f2542d, ComposeUiNode.Companion.f3731e);
                C8573r0.m16714a1(composerImplMo1636j, interfaceC10015c2, ComposeUiNode.Companion.f3730d);
                C8573r0.m16714a1(composerImplMo1636j, layoutDirection, ComposeUiNode.Companion.f3732f);
                C8573r0.m16714a1(composerImplMo1636j, interfaceC0647n1, ComposeUiNode.Companion.f3733g);
                C8573r0.m16714a1(composerImplMo1636j, interfaceC0500bM1928b, ComposeUiNode.Companion.f3729c);
                composerImplMo1636j.m1609Q(true);
                composerImplMo1636j.m1609Q(false);
                composerImplMo1636j.m1609Q(false);
                z12 = z11;
                interfaceC0500b4 = interfaceC0500b3;
                interfaceC2052l3 = interfaceC2052l2;
                i31 = i29;
                i32 = i21;
                C7218l c7218l18 = c7218l2;
                i33 = i30;
                c7218l3 = c7218l18;
            }
            c5332q0M1612T = composerImplMo1636j.m1612T();
            if (c5332q0M1612T == null) {
                return;
            }
            c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // cm.InterfaceC2056p
                /* JADX INFO: renamed from: m0 */
                public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                    num.intValue();
                    BasicTextKt.m1531b(str, interfaceC0500b4, c7218l3, interfaceC2052l3, i32, z12, i31, i33, interfaceC0476a2, C8573r0.m16737l1(i13 | 1), i14);
                    return C9072e.f47360a;
                }
            };
        }
        i15 |= 48;
        interfaceC0500b2 = interfaceC0500b;
        i16 = i14 & 4;
        if (i16 != 0) {
            if ((i13 & 896) == 0) {
                c7218l2 = c7218l;
                if (composerImplMo1636j.mo1665y(c7218l2)) {
                    i17 = 256;
                } else {
                    i17 = BuildConfig.SDK_TRUNCATE_LENGTH;
                }
                i15 |= i17;
            }
            i18 = i14 & 8;
            if (i18 != 0) {
                if ((i13 & 7168) == 0) {
                    interfaceC2052l2 = interfaceC2052l;
                    if (composerImplMo1636j.m1600H(interfaceC2052l2)) {
                        i19 = 2048;
                    } else {
                        i19 = 1024;
                    }
                    i15 |= i19;
                }
                i20 = i14 & 16;
                if (i20 != 0) {
                    if ((57344 & i13) == 0) {
                        i21 = i10;
                        if (composerImplMo1636j.m1594E(i21)) {
                            i22 = 16384;
                        } else {
                            i22 = 8192;
                        }
                        i15 |= i22;
                    }
                    i23 = i14 & 32;
                    if (i23 != 0) {
                        i15 |= 196608;
                    } else if ((i13 & 458752) == 0) {
                        if (composerImplMo1636j.m1598G(z10)) {
                            i24 = 131072;
                        } else {
                            i24 = 65536;
                        }
                        i15 |= i24;
                    }
                    i25 = i14 & 64;
                    if (i25 != 0) {
                        i15 |= 1572864;
                    } else if ((i13 & 3670016) == 0) {
                        if (composerImplMo1636j.m1594E(i11)) {
                            i26 = 1048576;
                        } else {
                            i26 = 524288;
                        }
                        i15 |= i26;
                    }
                    i27 = i14 & BuildConfig.SDK_TRUNCATE_LENGTH;
                    if (i27 != 0) {
                        i15 |= 12582912;
                    } else if ((i13 & 29360128) == 0) {
                        if (composerImplMo1636j.m1594E(i12)) {
                            i28 = 8388608;
                        } else {
                            i28 = 4194304;
                        }
                        i15 |= i28;
                    }
                    if ((i15 & 23967451) == 4793490) {
                        if (i34 != 0) {
                            interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                        }
                        if (i16 != 0) {
                            c7218l2 = C7218l.f40599c;
                        }
                        if (i18 != 0) {
                            interfaceC2052l2 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$1
                                @Override // cm.InterfaceC2052l
                                /* JADX INFO: renamed from: n */
                                public final C9072e mo528n(C7216j c7216j) {
                                    C5207g.m11111f(c7216j, "it");
                                    return C9072e.f47360a;
                                }
                            };
                        }
                        if (i20 != 0) {
                            i21 = 1;
                        }
                        if (i23 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if (i25 != 0) {
                            i29 = Integer.MAX_VALUE;
                        } else {
                            i29 = i11;
                        }
                        if (i27 != 0) {
                            i30 = 1;
                        } else {
                            i30 = i12;
                        }
                        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q16 = ComposerKt.f3003a;
                        C8584v.m16781D(i30, i29);
                        interfaceC0004c = (InterfaceC0004c) composerImplMo1636j.mo1648p(SelectionRegistrarKt.f2569a);
                        C5304d1 c5304d16 = CompositionLocalsKt.f4137e;
                        interfaceC10015c = (InterfaceC10015c) composerImplMo1636j.mo1648p(c5304d16);
                        aVar = (AbstractC0696b.a) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4140h);
                        composerImplMo1636j.mo1622c(959238681);
                        if (interfaceC0004c == null) {
                            jLongValue = 0;
                        } else {
                            jLongValue = ((Number) C0487a.m1860a(new Object[]{str, interfaceC0004c}, SaverKt.m1859a(new BasicTextKt$selectionIdSaver$1(interfaceC0004c), BasicTextKt$selectionIdSaver$2.f2523b), new InterfaceC2041a<Long>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$selectableId$1
                                {
                                    super(0);
                                }

                                @Override // cm.InterfaceC2041a
                                /* JADX INFO: renamed from: E */
                                public final Long mo807E() {
                                    return Long.valueOf(interfaceC0004c.m6b());
                                }
                            }, composerImplMo1636j, 4)).longValue();
                        }
                        j10 = jLongValue;
                        composerImplMo1636j.m1609Q(false);
                        composerImplMo1636j.mo1622c(-492369756);
                        objM1619a0 = composerImplMo1636j.m1619a0();
                        if (objM1619a0 == InterfaceC0476a.a.f3122a) {
                            objM1619a0 = new TextController(new TextState(new C10423b(new C0689a(str), c7218l2, i29, i30, z11, i21, interfaceC10015c, aVar), j10));
                            composerImplMo1636j.m1597F0(objM1619a0);
                        }
                        composerImplMo1636j.m1609Q(false);
                        textController = (TextController) objM1619a0;
                        textState = textController.f2539a;
                        if (!composerImplMo1636j.f2897L) {
                            c10423b = textState.f2563d;
                            Pair<List<C0689a.b<C7213g>>, List<C0689a.b<InterfaceC2057q<String, InterfaceC0476a, Integer, C9072e>>>> pair16 = CoreTextKt.f2526a;
                            C5207g.m11111f(c10423b, "current");
                            C5207g.m11111f(c7218l2, "style");
                            C5207g.m11111f(interfaceC10015c, "density");
                            C5207g.m11111f(aVar, "fontFamilyResolver");
                            if (!C5207g.m11106a(c10423b.f52258a.f4523a, str)) {
                                c10423b = new C10423b(new C0689a(str), c7218l2, i29, i30, z11, i21, interfaceC10015c, aVar);
                            } else {
                                c10423b = new C10423b(new C0689a(str), c7218l2, i29, i30, z11, i21, interfaceC10015c, aVar);
                            }
                            textController.m1540f(c10423b);
                        }
                        textState.getClass();
                        C5207g.m11111f(interfaceC2052l2, "<set-?>");
                        textState.f2561b = interfaceC2052l2;
                        textController.m1541g(interfaceC0004c);
                        composerImplMo1636j.mo1622c(959240076);
                        if (interfaceC0004c != null) {
                            long j116 = ((C0005d) composerImplMo1636j.mo1648p(TextSelectionColorsKt.f2571a)).f3b;
                        }
                        composerImplMo1636j.m1609Q(false);
                        interfaceC0500b3 = interfaceC0500b2;
                        InterfaceC0500b interfaceC0500bMo1929K16 = interfaceC0500b3.mo1929K(textController.m1539e());
                        composerImplMo1636j.mo1622c(544976794);
                        interfaceC10015c2 = (InterfaceC10015c) composerImplMo1636j.mo1648p(c5304d16);
                        layoutDirection = (LayoutDirection) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4143k);
                        interfaceC0647n1 = (InterfaceC0647n1) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4148p);
                        interfaceC0500bM1928b = ComposedModifierKt.m1928b(composerImplMo1636j, interfaceC0500bMo1929K16);
                        ComposeUiNode.f3726n.getClass();
                        interfaceC2041a = ComposeUiNode.Companion.f3728b;
                        composerImplMo1636j.mo1622c(1405779621);
                        if (!(composerImplMo1636j.f2910a instanceof InterfaceC5299c)) {
                            C8573r0.m16771y0();
                            throw null;
                        }
                        composerImplMo1636j.mo1640l();
                        if (composerImplMo1636j.f2897L) {
                            composerImplMo1636j.mo1634i(new InterfaceC2041a<ComposeUiNode>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText-4YKlhWE$$inlined$Layout$1
                                {
                                    super(0);
                                }

                                /* JADX WARN: Type inference failed for: r3v1, types: [androidx.compose.ui.node.ComposeUiNode, java.lang.Object] */
                                @Override // cm.InterfaceC2041a
                                /* JADX INFO: renamed from: E */
                                public final ComposeUiNode mo807E() {
                                    return interfaceC2041a.mo807E();
                                }
                            });
                        } else {
                            composerImplMo1636j.mo1653s();
                        }
                        C8573r0.m16714a1(composerImplMo1636j, textController.f2542d, ComposeUiNode.Companion.f3731e);
                        C8573r0.m16714a1(composerImplMo1636j, interfaceC10015c2, ComposeUiNode.Companion.f3730d);
                        C8573r0.m16714a1(composerImplMo1636j, layoutDirection, ComposeUiNode.Companion.f3732f);
                        C8573r0.m16714a1(composerImplMo1636j, interfaceC0647n1, ComposeUiNode.Companion.f3733g);
                        C8573r0.m16714a1(composerImplMo1636j, interfaceC0500bM1928b, ComposeUiNode.Companion.f3729c);
                        composerImplMo1636j.m1609Q(true);
                        composerImplMo1636j.m1609Q(false);
                        composerImplMo1636j.m1609Q(false);
                        z12 = z11;
                        interfaceC0500b4 = interfaceC0500b3;
                        interfaceC2052l3 = interfaceC2052l2;
                        i31 = i29;
                        i32 = i21;
                        C7218l c7218l19 = c7218l2;
                        i33 = i30;
                        c7218l3 = c7218l19;
                    } else {
                        if (i34 != 0) {
                            interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                        }
                        if (i16 != 0) {
                            c7218l2 = C7218l.f40599c;
                        }
                        if (i18 != 0) {
                            interfaceC2052l2 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$1
                                @Override // cm.InterfaceC2052l
                                /* JADX INFO: renamed from: n */
                                public final C9072e mo528n(C7216j c7216j) {
                                    C5207g.m11111f(c7216j, "it");
                                    return C9072e.f47360a;
                                }
                            };
                        }
                        if (i20 != 0) {
                            i21 = 1;
                        }
                        if (i23 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if (i25 != 0) {
                            i29 = Integer.MAX_VALUE;
                        } else {
                            i29 = i11;
                        }
                        if (i27 != 0) {
                            i30 = 1;
                        } else {
                            i30 = i12;
                        }
                        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q17 = ComposerKt.f3003a;
                        C8584v.m16781D(i30, i29);
                        interfaceC0004c = (InterfaceC0004c) composerImplMo1636j.mo1648p(SelectionRegistrarKt.f2569a);
                        C5304d1 c5304d17 = CompositionLocalsKt.f4137e;
                        interfaceC10015c = (InterfaceC10015c) composerImplMo1636j.mo1648p(c5304d17);
                        aVar = (AbstractC0696b.a) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4140h);
                        composerImplMo1636j.mo1622c(959238681);
                        if (interfaceC0004c == null) {
                            jLongValue = 0;
                        } else {
                            jLongValue = ((Number) C0487a.m1860a(new Object[]{str, interfaceC0004c}, SaverKt.m1859a(new BasicTextKt$selectionIdSaver$1(interfaceC0004c), BasicTextKt$selectionIdSaver$2.f2523b), new InterfaceC2041a<Long>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$selectableId$1
                                {
                                    super(0);
                                }

                                @Override // cm.InterfaceC2041a
                                /* JADX INFO: renamed from: E */
                                public final Long mo807E() {
                                    return Long.valueOf(interfaceC0004c.m6b());
                                }
                            }, composerImplMo1636j, 4)).longValue();
                        }
                        j10 = jLongValue;
                        composerImplMo1636j.m1609Q(false);
                        composerImplMo1636j.mo1622c(-492369756);
                        objM1619a0 = composerImplMo1636j.m1619a0();
                        if (objM1619a0 == InterfaceC0476a.a.f3122a) {
                            objM1619a0 = new TextController(new TextState(new C10423b(new C0689a(str), c7218l2, i29, i30, z11, i21, interfaceC10015c, aVar), j10));
                            composerImplMo1636j.m1597F0(objM1619a0);
                        }
                        composerImplMo1636j.m1609Q(false);
                        textController = (TextController) objM1619a0;
                        textState = textController.f2539a;
                        if (!composerImplMo1636j.f2897L) {
                            c10423b = textState.f2563d;
                            Pair<List<C0689a.b<C7213g>>, List<C0689a.b<InterfaceC2057q<String, InterfaceC0476a, Integer, C9072e>>>> pair17 = CoreTextKt.f2526a;
                            C5207g.m11111f(c10423b, "current");
                            C5207g.m11111f(c7218l2, "style");
                            C5207g.m11111f(interfaceC10015c, "density");
                            C5207g.m11111f(aVar, "fontFamilyResolver");
                            if (!C5207g.m11106a(c10423b.f52258a.f4523a, str)) {
                                c10423b = new C10423b(new C0689a(str), c7218l2, i29, i30, z11, i21, interfaceC10015c, aVar);
                            } else {
                                c10423b = new C10423b(new C0689a(str), c7218l2, i29, i30, z11, i21, interfaceC10015c, aVar);
                            }
                            textController.m1540f(c10423b);
                        }
                        textState.getClass();
                        C5207g.m11111f(interfaceC2052l2, "<set-?>");
                        textState.f2561b = interfaceC2052l2;
                        textController.m1541g(interfaceC0004c);
                        composerImplMo1636j.mo1622c(959240076);
                        if (interfaceC0004c != null) {
                            long j117 = ((C0005d) composerImplMo1636j.mo1648p(TextSelectionColorsKt.f2571a)).f3b;
                        }
                        composerImplMo1636j.m1609Q(false);
                        interfaceC0500b3 = interfaceC0500b2;
                        InterfaceC0500b interfaceC0500bMo1929K17 = interfaceC0500b3.mo1929K(textController.m1539e());
                        composerImplMo1636j.mo1622c(544976794);
                        interfaceC10015c2 = (InterfaceC10015c) composerImplMo1636j.mo1648p(c5304d17);
                        layoutDirection = (LayoutDirection) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4143k);
                        interfaceC0647n1 = (InterfaceC0647n1) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4148p);
                        interfaceC0500bM1928b = ComposedModifierKt.m1928b(composerImplMo1636j, interfaceC0500bMo1929K17);
                        ComposeUiNode.f3726n.getClass();
                        interfaceC2041a = ComposeUiNode.Companion.f3728b;
                        composerImplMo1636j.mo1622c(1405779621);
                        if (!(composerImplMo1636j.f2910a instanceof InterfaceC5299c)) {
                            C8573r0.m16771y0();
                            throw null;
                        }
                        composerImplMo1636j.mo1640l();
                        if (composerImplMo1636j.f2897L) {
                            composerImplMo1636j.mo1634i(new InterfaceC2041a<ComposeUiNode>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText-4YKlhWE$$inlined$Layout$1
                                {
                                    super(0);
                                }

                                /* JADX WARN: Type inference failed for: r3v1, types: [androidx.compose.ui.node.ComposeUiNode, java.lang.Object] */
                                @Override // cm.InterfaceC2041a
                                /* JADX INFO: renamed from: E */
                                public final ComposeUiNode mo807E() {
                                    return interfaceC2041a.mo807E();
                                }
                            });
                        } else {
                            composerImplMo1636j.mo1653s();
                        }
                        C8573r0.m16714a1(composerImplMo1636j, textController.f2542d, ComposeUiNode.Companion.f3731e);
                        C8573r0.m16714a1(composerImplMo1636j, interfaceC10015c2, ComposeUiNode.Companion.f3730d);
                        C8573r0.m16714a1(composerImplMo1636j, layoutDirection, ComposeUiNode.Companion.f3732f);
                        C8573r0.m16714a1(composerImplMo1636j, interfaceC0647n1, ComposeUiNode.Companion.f3733g);
                        C8573r0.m16714a1(composerImplMo1636j, interfaceC0500bM1928b, ComposeUiNode.Companion.f3729c);
                        composerImplMo1636j.m1609Q(true);
                        composerImplMo1636j.m1609Q(false);
                        composerImplMo1636j.m1609Q(false);
                        z12 = z11;
                        interfaceC0500b4 = interfaceC0500b3;
                        interfaceC2052l3 = interfaceC2052l2;
                        i31 = i29;
                        i32 = i21;
                        C7218l c7218l110 = c7218l2;
                        i33 = i30;
                        c7218l3 = c7218l110;
                    }
                    c5332q0M1612T = composerImplMo1636j.m1612T();
                    if (c5332q0M1612T == null) {
                        return;
                    }
                    c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                            num.intValue();
                            BasicTextKt.m1531b(str, interfaceC0500b4, c7218l3, interfaceC2052l3, i32, z12, i31, i33, interfaceC0476a2, C8573r0.m16737l1(i13 | 1), i14);
                            return C9072e.f47360a;
                        }
                    };
                }
                i15 |= 24576;
                i21 = i10;
                i23 = i14 & 32;
                if (i23 != 0) {
                    i15 |= 196608;
                } else if ((i13 & 458752) == 0) {
                    if (composerImplMo1636j.m1598G(z10)) {
                        i24 = 131072;
                    } else {
                        i24 = 65536;
                    }
                    i15 |= i24;
                }
                i25 = i14 & 64;
                if (i25 != 0) {
                    i15 |= 1572864;
                } else if ((i13 & 3670016) == 0) {
                    if (composerImplMo1636j.m1594E(i11)) {
                        i26 = 1048576;
                    } else {
                        i26 = 524288;
                    }
                    i15 |= i26;
                }
                i27 = i14 & BuildConfig.SDK_TRUNCATE_LENGTH;
                if (i27 != 0) {
                    i15 |= 12582912;
                } else if ((i13 & 29360128) == 0) {
                    if (composerImplMo1636j.m1594E(i12)) {
                        i28 = 8388608;
                    } else {
                        i28 = 4194304;
                    }
                    i15 |= i28;
                }
                if ((i15 & 23967451) == 4793490) {
                    if (i34 != 0) {
                        interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                    }
                    if (i16 != 0) {
                        c7218l2 = C7218l.f40599c;
                    }
                    if (i18 != 0) {
                        interfaceC2052l2 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$1
                            @Override // cm.InterfaceC2052l
                            /* JADX INFO: renamed from: n */
                            public final C9072e mo528n(C7216j c7216j) {
                                C5207g.m11111f(c7216j, "it");
                                return C9072e.f47360a;
                            }
                        };
                    }
                    if (i20 != 0) {
                        i21 = 1;
                    }
                    if (i23 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    if (i25 != 0) {
                        i29 = Integer.MAX_VALUE;
                    } else {
                        i29 = i11;
                    }
                    if (i27 != 0) {
                        i30 = 1;
                    } else {
                        i30 = i12;
                    }
                    InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q18 = ComposerKt.f3003a;
                    C8584v.m16781D(i30, i29);
                    interfaceC0004c = (InterfaceC0004c) composerImplMo1636j.mo1648p(SelectionRegistrarKt.f2569a);
                    C5304d1 c5304d18 = CompositionLocalsKt.f4137e;
                    interfaceC10015c = (InterfaceC10015c) composerImplMo1636j.mo1648p(c5304d18);
                    aVar = (AbstractC0696b.a) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4140h);
                    composerImplMo1636j.mo1622c(959238681);
                    if (interfaceC0004c == null) {
                        jLongValue = 0;
                    } else {
                        jLongValue = ((Number) C0487a.m1860a(new Object[]{str, interfaceC0004c}, SaverKt.m1859a(new BasicTextKt$selectionIdSaver$1(interfaceC0004c), BasicTextKt$selectionIdSaver$2.f2523b), new InterfaceC2041a<Long>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$selectableId$1
                            {
                                super(0);
                            }

                            @Override // cm.InterfaceC2041a
                            /* JADX INFO: renamed from: E */
                            public final Long mo807E() {
                                return Long.valueOf(interfaceC0004c.m6b());
                            }
                        }, composerImplMo1636j, 4)).longValue();
                    }
                    j10 = jLongValue;
                    composerImplMo1636j.m1609Q(false);
                    composerImplMo1636j.mo1622c(-492369756);
                    objM1619a0 = composerImplMo1636j.m1619a0();
                    if (objM1619a0 == InterfaceC0476a.a.f3122a) {
                        objM1619a0 = new TextController(new TextState(new C10423b(new C0689a(str), c7218l2, i29, i30, z11, i21, interfaceC10015c, aVar), j10));
                        composerImplMo1636j.m1597F0(objM1619a0);
                    }
                    composerImplMo1636j.m1609Q(false);
                    textController = (TextController) objM1619a0;
                    textState = textController.f2539a;
                    if (!composerImplMo1636j.f2897L) {
                        c10423b = textState.f2563d;
                        Pair<List<C0689a.b<C7213g>>, List<C0689a.b<InterfaceC2057q<String, InterfaceC0476a, Integer, C9072e>>>> pair18 = CoreTextKt.f2526a;
                        C5207g.m11111f(c10423b, "current");
                        C5207g.m11111f(c7218l2, "style");
                        C5207g.m11111f(interfaceC10015c, "density");
                        C5207g.m11111f(aVar, "fontFamilyResolver");
                        if (!C5207g.m11106a(c10423b.f52258a.f4523a, str)) {
                            c10423b = new C10423b(new C0689a(str), c7218l2, i29, i30, z11, i21, interfaceC10015c, aVar);
                        } else {
                            c10423b = new C10423b(new C0689a(str), c7218l2, i29, i30, z11, i21, interfaceC10015c, aVar);
                        }
                        textController.m1540f(c10423b);
                    }
                    textState.getClass();
                    C5207g.m11111f(interfaceC2052l2, "<set-?>");
                    textState.f2561b = interfaceC2052l2;
                    textController.m1541g(interfaceC0004c);
                    composerImplMo1636j.mo1622c(959240076);
                    if (interfaceC0004c != null) {
                        long j118 = ((C0005d) composerImplMo1636j.mo1648p(TextSelectionColorsKt.f2571a)).f3b;
                    }
                    composerImplMo1636j.m1609Q(false);
                    interfaceC0500b3 = interfaceC0500b2;
                    InterfaceC0500b interfaceC0500bMo1929K18 = interfaceC0500b3.mo1929K(textController.m1539e());
                    composerImplMo1636j.mo1622c(544976794);
                    interfaceC10015c2 = (InterfaceC10015c) composerImplMo1636j.mo1648p(c5304d18);
                    layoutDirection = (LayoutDirection) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4143k);
                    interfaceC0647n1 = (InterfaceC0647n1) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4148p);
                    interfaceC0500bM1928b = ComposedModifierKt.m1928b(composerImplMo1636j, interfaceC0500bMo1929K18);
                    ComposeUiNode.f3726n.getClass();
                    interfaceC2041a = ComposeUiNode.Companion.f3728b;
                    composerImplMo1636j.mo1622c(1405779621);
                    if (!(composerImplMo1636j.f2910a instanceof InterfaceC5299c)) {
                        C8573r0.m16771y0();
                        throw null;
                    }
                    composerImplMo1636j.mo1640l();
                    if (composerImplMo1636j.f2897L) {
                        composerImplMo1636j.mo1634i(new InterfaceC2041a<ComposeUiNode>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText-4YKlhWE$$inlined$Layout$1
                            {
                                super(0);
                            }

                            /* JADX WARN: Type inference failed for: r3v1, types: [androidx.compose.ui.node.ComposeUiNode, java.lang.Object] */
                            @Override // cm.InterfaceC2041a
                            /* JADX INFO: renamed from: E */
                            public final ComposeUiNode mo807E() {
                                return interfaceC2041a.mo807E();
                            }
                        });
                    } else {
                        composerImplMo1636j.mo1653s();
                    }
                    C8573r0.m16714a1(composerImplMo1636j, textController.f2542d, ComposeUiNode.Companion.f3731e);
                    C8573r0.m16714a1(composerImplMo1636j, interfaceC10015c2, ComposeUiNode.Companion.f3730d);
                    C8573r0.m16714a1(composerImplMo1636j, layoutDirection, ComposeUiNode.Companion.f3732f);
                    C8573r0.m16714a1(composerImplMo1636j, interfaceC0647n1, ComposeUiNode.Companion.f3733g);
                    C8573r0.m16714a1(composerImplMo1636j, interfaceC0500bM1928b, ComposeUiNode.Companion.f3729c);
                    composerImplMo1636j.m1609Q(true);
                    composerImplMo1636j.m1609Q(false);
                    composerImplMo1636j.m1609Q(false);
                    z12 = z11;
                    interfaceC0500b4 = interfaceC0500b3;
                    interfaceC2052l3 = interfaceC2052l2;
                    i31 = i29;
                    i32 = i21;
                    C7218l c7218l111 = c7218l2;
                    i33 = i30;
                    c7218l3 = c7218l111;
                } else {
                    if (i34 != 0) {
                        interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                    }
                    if (i16 != 0) {
                        c7218l2 = C7218l.f40599c;
                    }
                    if (i18 != 0) {
                        interfaceC2052l2 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$1
                            @Override // cm.InterfaceC2052l
                            /* JADX INFO: renamed from: n */
                            public final C9072e mo528n(C7216j c7216j) {
                                C5207g.m11111f(c7216j, "it");
                                return C9072e.f47360a;
                            }
                        };
                    }
                    if (i20 != 0) {
                        i21 = 1;
                    }
                    if (i23 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    if (i25 != 0) {
                        i29 = Integer.MAX_VALUE;
                    } else {
                        i29 = i11;
                    }
                    if (i27 != 0) {
                        i30 = 1;
                    } else {
                        i30 = i12;
                    }
                    InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q19 = ComposerKt.f3003a;
                    C8584v.m16781D(i30, i29);
                    interfaceC0004c = (InterfaceC0004c) composerImplMo1636j.mo1648p(SelectionRegistrarKt.f2569a);
                    C5304d1 c5304d19 = CompositionLocalsKt.f4137e;
                    interfaceC10015c = (InterfaceC10015c) composerImplMo1636j.mo1648p(c5304d19);
                    aVar = (AbstractC0696b.a) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4140h);
                    composerImplMo1636j.mo1622c(959238681);
                    if (interfaceC0004c == null) {
                        jLongValue = 0;
                    } else {
                        jLongValue = ((Number) C0487a.m1860a(new Object[]{str, interfaceC0004c}, SaverKt.m1859a(new BasicTextKt$selectionIdSaver$1(interfaceC0004c), BasicTextKt$selectionIdSaver$2.f2523b), new InterfaceC2041a<Long>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$selectableId$1
                            {
                                super(0);
                            }

                            @Override // cm.InterfaceC2041a
                            /* JADX INFO: renamed from: E */
                            public final Long mo807E() {
                                return Long.valueOf(interfaceC0004c.m6b());
                            }
                        }, composerImplMo1636j, 4)).longValue();
                    }
                    j10 = jLongValue;
                    composerImplMo1636j.m1609Q(false);
                    composerImplMo1636j.mo1622c(-492369756);
                    objM1619a0 = composerImplMo1636j.m1619a0();
                    if (objM1619a0 == InterfaceC0476a.a.f3122a) {
                        objM1619a0 = new TextController(new TextState(new C10423b(new C0689a(str), c7218l2, i29, i30, z11, i21, interfaceC10015c, aVar), j10));
                        composerImplMo1636j.m1597F0(objM1619a0);
                    }
                    composerImplMo1636j.m1609Q(false);
                    textController = (TextController) objM1619a0;
                    textState = textController.f2539a;
                    if (!composerImplMo1636j.f2897L) {
                        c10423b = textState.f2563d;
                        Pair<List<C0689a.b<C7213g>>, List<C0689a.b<InterfaceC2057q<String, InterfaceC0476a, Integer, C9072e>>>> pair19 = CoreTextKt.f2526a;
                        C5207g.m11111f(c10423b, "current");
                        C5207g.m11111f(c7218l2, "style");
                        C5207g.m11111f(interfaceC10015c, "density");
                        C5207g.m11111f(aVar, "fontFamilyResolver");
                        if (!C5207g.m11106a(c10423b.f52258a.f4523a, str)) {
                            c10423b = new C10423b(new C0689a(str), c7218l2, i29, i30, z11, i21, interfaceC10015c, aVar);
                        } else {
                            c10423b = new C10423b(new C0689a(str), c7218l2, i29, i30, z11, i21, interfaceC10015c, aVar);
                        }
                        textController.m1540f(c10423b);
                    }
                    textState.getClass();
                    C5207g.m11111f(interfaceC2052l2, "<set-?>");
                    textState.f2561b = interfaceC2052l2;
                    textController.m1541g(interfaceC0004c);
                    composerImplMo1636j.mo1622c(959240076);
                    if (interfaceC0004c != null) {
                        long j119 = ((C0005d) composerImplMo1636j.mo1648p(TextSelectionColorsKt.f2571a)).f3b;
                    }
                    composerImplMo1636j.m1609Q(false);
                    interfaceC0500b3 = interfaceC0500b2;
                    InterfaceC0500b interfaceC0500bMo1929K19 = interfaceC0500b3.mo1929K(textController.m1539e());
                    composerImplMo1636j.mo1622c(544976794);
                    interfaceC10015c2 = (InterfaceC10015c) composerImplMo1636j.mo1648p(c5304d19);
                    layoutDirection = (LayoutDirection) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4143k);
                    interfaceC0647n1 = (InterfaceC0647n1) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4148p);
                    interfaceC0500bM1928b = ComposedModifierKt.m1928b(composerImplMo1636j, interfaceC0500bMo1929K19);
                    ComposeUiNode.f3726n.getClass();
                    interfaceC2041a = ComposeUiNode.Companion.f3728b;
                    composerImplMo1636j.mo1622c(1405779621);
                    if (!(composerImplMo1636j.f2910a instanceof InterfaceC5299c)) {
                        C8573r0.m16771y0();
                        throw null;
                    }
                    composerImplMo1636j.mo1640l();
                    if (composerImplMo1636j.f2897L) {
                        composerImplMo1636j.mo1634i(new InterfaceC2041a<ComposeUiNode>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText-4YKlhWE$$inlined$Layout$1
                            {
                                super(0);
                            }

                            /* JADX WARN: Type inference failed for: r3v1, types: [androidx.compose.ui.node.ComposeUiNode, java.lang.Object] */
                            @Override // cm.InterfaceC2041a
                            /* JADX INFO: renamed from: E */
                            public final ComposeUiNode mo807E() {
                                return interfaceC2041a.mo807E();
                            }
                        });
                    } else {
                        composerImplMo1636j.mo1653s();
                    }
                    C8573r0.m16714a1(composerImplMo1636j, textController.f2542d, ComposeUiNode.Companion.f3731e);
                    C8573r0.m16714a1(composerImplMo1636j, interfaceC10015c2, ComposeUiNode.Companion.f3730d);
                    C8573r0.m16714a1(composerImplMo1636j, layoutDirection, ComposeUiNode.Companion.f3732f);
                    C8573r0.m16714a1(composerImplMo1636j, interfaceC0647n1, ComposeUiNode.Companion.f3733g);
                    C8573r0.m16714a1(composerImplMo1636j, interfaceC0500bM1928b, ComposeUiNode.Companion.f3729c);
                    composerImplMo1636j.m1609Q(true);
                    composerImplMo1636j.m1609Q(false);
                    composerImplMo1636j.m1609Q(false);
                    z12 = z11;
                    interfaceC0500b4 = interfaceC0500b3;
                    interfaceC2052l3 = interfaceC2052l2;
                    i31 = i29;
                    i32 = i21;
                    C7218l c7218l112 = c7218l2;
                    i33 = i30;
                    c7218l3 = c7218l112;
                }
                c5332q0M1612T = composerImplMo1636j.m1612T();
                if (c5332q0M1612T == null) {
                    return;
                }
                c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // cm.InterfaceC2056p
                    /* JADX INFO: renamed from: m0 */
                    public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                        num.intValue();
                        BasicTextKt.m1531b(str, interfaceC0500b4, c7218l3, interfaceC2052l3, i32, z12, i31, i33, interfaceC0476a2, C8573r0.m16737l1(i13 | 1), i14);
                        return C9072e.f47360a;
                    }
                };
            }
            i15 |= 3072;
            interfaceC2052l2 = interfaceC2052l;
            i20 = i14 & 16;
            if (i20 != 0) {
                if ((57344 & i13) == 0) {
                    i21 = i10;
                    if (composerImplMo1636j.m1594E(i21)) {
                        i22 = 16384;
                    } else {
                        i22 = 8192;
                    }
                    i15 |= i22;
                }
                i23 = i14 & 32;
                if (i23 != 0) {
                    i15 |= 196608;
                } else if ((i13 & 458752) == 0) {
                    if (composerImplMo1636j.m1598G(z10)) {
                        i24 = 131072;
                    } else {
                        i24 = 65536;
                    }
                    i15 |= i24;
                }
                i25 = i14 & 64;
                if (i25 != 0) {
                    i15 |= 1572864;
                } else if ((i13 & 3670016) == 0) {
                    if (composerImplMo1636j.m1594E(i11)) {
                        i26 = 1048576;
                    } else {
                        i26 = 524288;
                    }
                    i15 |= i26;
                }
                i27 = i14 & BuildConfig.SDK_TRUNCATE_LENGTH;
                if (i27 != 0) {
                    i15 |= 12582912;
                } else if ((i13 & 29360128) == 0) {
                    if (composerImplMo1636j.m1594E(i12)) {
                        i28 = 8388608;
                    } else {
                        i28 = 4194304;
                    }
                    i15 |= i28;
                }
                if ((i15 & 23967451) == 4793490) {
                    if (i34 != 0) {
                        interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                    }
                    if (i16 != 0) {
                        c7218l2 = C7218l.f40599c;
                    }
                    if (i18 != 0) {
                        interfaceC2052l2 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$1
                            @Override // cm.InterfaceC2052l
                            /* JADX INFO: renamed from: n */
                            public final C9072e mo528n(C7216j c7216j) {
                                C5207g.m11111f(c7216j, "it");
                                return C9072e.f47360a;
                            }
                        };
                    }
                    if (i20 != 0) {
                        i21 = 1;
                    }
                    if (i23 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    if (i25 != 0) {
                        i29 = Integer.MAX_VALUE;
                    } else {
                        i29 = i11;
                    }
                    if (i27 != 0) {
                        i30 = 1;
                    } else {
                        i30 = i12;
                    }
                    InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q110 = ComposerKt.f3003a;
                    C8584v.m16781D(i30, i29);
                    interfaceC0004c = (InterfaceC0004c) composerImplMo1636j.mo1648p(SelectionRegistrarKt.f2569a);
                    C5304d1 c5304d110 = CompositionLocalsKt.f4137e;
                    interfaceC10015c = (InterfaceC10015c) composerImplMo1636j.mo1648p(c5304d110);
                    aVar = (AbstractC0696b.a) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4140h);
                    composerImplMo1636j.mo1622c(959238681);
                    if (interfaceC0004c == null) {
                        jLongValue = 0;
                    } else {
                        jLongValue = ((Number) C0487a.m1860a(new Object[]{str, interfaceC0004c}, SaverKt.m1859a(new BasicTextKt$selectionIdSaver$1(interfaceC0004c), BasicTextKt$selectionIdSaver$2.f2523b), new InterfaceC2041a<Long>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$selectableId$1
                            {
                                super(0);
                            }

                            @Override // cm.InterfaceC2041a
                            /* JADX INFO: renamed from: E */
                            public final Long mo807E() {
                                return Long.valueOf(interfaceC0004c.m6b());
                            }
                        }, composerImplMo1636j, 4)).longValue();
                    }
                    j10 = jLongValue;
                    composerImplMo1636j.m1609Q(false);
                    composerImplMo1636j.mo1622c(-492369756);
                    objM1619a0 = composerImplMo1636j.m1619a0();
                    if (objM1619a0 == InterfaceC0476a.a.f3122a) {
                        objM1619a0 = new TextController(new TextState(new C10423b(new C0689a(str), c7218l2, i29, i30, z11, i21, interfaceC10015c, aVar), j10));
                        composerImplMo1636j.m1597F0(objM1619a0);
                    }
                    composerImplMo1636j.m1609Q(false);
                    textController = (TextController) objM1619a0;
                    textState = textController.f2539a;
                    if (!composerImplMo1636j.f2897L) {
                        c10423b = textState.f2563d;
                        Pair<List<C0689a.b<C7213g>>, List<C0689a.b<InterfaceC2057q<String, InterfaceC0476a, Integer, C9072e>>>> pair110 = CoreTextKt.f2526a;
                        C5207g.m11111f(c10423b, "current");
                        C5207g.m11111f(c7218l2, "style");
                        C5207g.m11111f(interfaceC10015c, "density");
                        C5207g.m11111f(aVar, "fontFamilyResolver");
                        if (!C5207g.m11106a(c10423b.f52258a.f4523a, str)) {
                            c10423b = new C10423b(new C0689a(str), c7218l2, i29, i30, z11, i21, interfaceC10015c, aVar);
                        } else {
                            c10423b = new C10423b(new C0689a(str), c7218l2, i29, i30, z11, i21, interfaceC10015c, aVar);
                        }
                        textController.m1540f(c10423b);
                    }
                    textState.getClass();
                    C5207g.m11111f(interfaceC2052l2, "<set-?>");
                    textState.f2561b = interfaceC2052l2;
                    textController.m1541g(interfaceC0004c);
                    composerImplMo1636j.mo1622c(959240076);
                    if (interfaceC0004c != null) {
                        long j1110 = ((C0005d) composerImplMo1636j.mo1648p(TextSelectionColorsKt.f2571a)).f3b;
                    }
                    composerImplMo1636j.m1609Q(false);
                    interfaceC0500b3 = interfaceC0500b2;
                    InterfaceC0500b interfaceC0500bMo1929K110 = interfaceC0500b3.mo1929K(textController.m1539e());
                    composerImplMo1636j.mo1622c(544976794);
                    interfaceC10015c2 = (InterfaceC10015c) composerImplMo1636j.mo1648p(c5304d110);
                    layoutDirection = (LayoutDirection) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4143k);
                    interfaceC0647n1 = (InterfaceC0647n1) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4148p);
                    interfaceC0500bM1928b = ComposedModifierKt.m1928b(composerImplMo1636j, interfaceC0500bMo1929K110);
                    ComposeUiNode.f3726n.getClass();
                    interfaceC2041a = ComposeUiNode.Companion.f3728b;
                    composerImplMo1636j.mo1622c(1405779621);
                    if (!(composerImplMo1636j.f2910a instanceof InterfaceC5299c)) {
                        C8573r0.m16771y0();
                        throw null;
                    }
                    composerImplMo1636j.mo1640l();
                    if (composerImplMo1636j.f2897L) {
                        composerImplMo1636j.mo1634i(new InterfaceC2041a<ComposeUiNode>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText-4YKlhWE$$inlined$Layout$1
                            {
                                super(0);
                            }

                            /* JADX WARN: Type inference failed for: r3v1, types: [androidx.compose.ui.node.ComposeUiNode, java.lang.Object] */
                            @Override // cm.InterfaceC2041a
                            /* JADX INFO: renamed from: E */
                            public final ComposeUiNode mo807E() {
                                return interfaceC2041a.mo807E();
                            }
                        });
                    } else {
                        composerImplMo1636j.mo1653s();
                    }
                    C8573r0.m16714a1(composerImplMo1636j, textController.f2542d, ComposeUiNode.Companion.f3731e);
                    C8573r0.m16714a1(composerImplMo1636j, interfaceC10015c2, ComposeUiNode.Companion.f3730d);
                    C8573r0.m16714a1(composerImplMo1636j, layoutDirection, ComposeUiNode.Companion.f3732f);
                    C8573r0.m16714a1(composerImplMo1636j, interfaceC0647n1, ComposeUiNode.Companion.f3733g);
                    C8573r0.m16714a1(composerImplMo1636j, interfaceC0500bM1928b, ComposeUiNode.Companion.f3729c);
                    composerImplMo1636j.m1609Q(true);
                    composerImplMo1636j.m1609Q(false);
                    composerImplMo1636j.m1609Q(false);
                    z12 = z11;
                    interfaceC0500b4 = interfaceC0500b3;
                    interfaceC2052l3 = interfaceC2052l2;
                    i31 = i29;
                    i32 = i21;
                    C7218l c7218l113 = c7218l2;
                    i33 = i30;
                    c7218l3 = c7218l113;
                } else {
                    if (i34 != 0) {
                        interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                    }
                    if (i16 != 0) {
                        c7218l2 = C7218l.f40599c;
                    }
                    if (i18 != 0) {
                        interfaceC2052l2 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$1
                            @Override // cm.InterfaceC2052l
                            /* JADX INFO: renamed from: n */
                            public final C9072e mo528n(C7216j c7216j) {
                                C5207g.m11111f(c7216j, "it");
                                return C9072e.f47360a;
                            }
                        };
                    }
                    if (i20 != 0) {
                        i21 = 1;
                    }
                    if (i23 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    if (i25 != 0) {
                        i29 = Integer.MAX_VALUE;
                    } else {
                        i29 = i11;
                    }
                    if (i27 != 0) {
                        i30 = 1;
                    } else {
                        i30 = i12;
                    }
                    InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q111 = ComposerKt.f3003a;
                    C8584v.m16781D(i30, i29);
                    interfaceC0004c = (InterfaceC0004c) composerImplMo1636j.mo1648p(SelectionRegistrarKt.f2569a);
                    C5304d1 c5304d111 = CompositionLocalsKt.f4137e;
                    interfaceC10015c = (InterfaceC10015c) composerImplMo1636j.mo1648p(c5304d111);
                    aVar = (AbstractC0696b.a) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4140h);
                    composerImplMo1636j.mo1622c(959238681);
                    if (interfaceC0004c == null) {
                        jLongValue = 0;
                    } else {
                        jLongValue = ((Number) C0487a.m1860a(new Object[]{str, interfaceC0004c}, SaverKt.m1859a(new BasicTextKt$selectionIdSaver$1(interfaceC0004c), BasicTextKt$selectionIdSaver$2.f2523b), new InterfaceC2041a<Long>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$selectableId$1
                            {
                                super(0);
                            }

                            @Override // cm.InterfaceC2041a
                            /* JADX INFO: renamed from: E */
                            public final Long mo807E() {
                                return Long.valueOf(interfaceC0004c.m6b());
                            }
                        }, composerImplMo1636j, 4)).longValue();
                    }
                    j10 = jLongValue;
                    composerImplMo1636j.m1609Q(false);
                    composerImplMo1636j.mo1622c(-492369756);
                    objM1619a0 = composerImplMo1636j.m1619a0();
                    if (objM1619a0 == InterfaceC0476a.a.f3122a) {
                        objM1619a0 = new TextController(new TextState(new C10423b(new C0689a(str), c7218l2, i29, i30, z11, i21, interfaceC10015c, aVar), j10));
                        composerImplMo1636j.m1597F0(objM1619a0);
                    }
                    composerImplMo1636j.m1609Q(false);
                    textController = (TextController) objM1619a0;
                    textState = textController.f2539a;
                    if (!composerImplMo1636j.f2897L) {
                        c10423b = textState.f2563d;
                        Pair<List<C0689a.b<C7213g>>, List<C0689a.b<InterfaceC2057q<String, InterfaceC0476a, Integer, C9072e>>>> pair111 = CoreTextKt.f2526a;
                        C5207g.m11111f(c10423b, "current");
                        C5207g.m11111f(c7218l2, "style");
                        C5207g.m11111f(interfaceC10015c, "density");
                        C5207g.m11111f(aVar, "fontFamilyResolver");
                        if (!C5207g.m11106a(c10423b.f52258a.f4523a, str)) {
                            c10423b = new C10423b(new C0689a(str), c7218l2, i29, i30, z11, i21, interfaceC10015c, aVar);
                        } else {
                            c10423b = new C10423b(new C0689a(str), c7218l2, i29, i30, z11, i21, interfaceC10015c, aVar);
                        }
                        textController.m1540f(c10423b);
                    }
                    textState.getClass();
                    C5207g.m11111f(interfaceC2052l2, "<set-?>");
                    textState.f2561b = interfaceC2052l2;
                    textController.m1541g(interfaceC0004c);
                    composerImplMo1636j.mo1622c(959240076);
                    if (interfaceC0004c != null) {
                        long j1111 = ((C0005d) composerImplMo1636j.mo1648p(TextSelectionColorsKt.f2571a)).f3b;
                    }
                    composerImplMo1636j.m1609Q(false);
                    interfaceC0500b3 = interfaceC0500b2;
                    InterfaceC0500b interfaceC0500bMo1929K111 = interfaceC0500b3.mo1929K(textController.m1539e());
                    composerImplMo1636j.mo1622c(544976794);
                    interfaceC10015c2 = (InterfaceC10015c) composerImplMo1636j.mo1648p(c5304d111);
                    layoutDirection = (LayoutDirection) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4143k);
                    interfaceC0647n1 = (InterfaceC0647n1) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4148p);
                    interfaceC0500bM1928b = ComposedModifierKt.m1928b(composerImplMo1636j, interfaceC0500bMo1929K111);
                    ComposeUiNode.f3726n.getClass();
                    interfaceC2041a = ComposeUiNode.Companion.f3728b;
                    composerImplMo1636j.mo1622c(1405779621);
                    if (!(composerImplMo1636j.f2910a instanceof InterfaceC5299c)) {
                        C8573r0.m16771y0();
                        throw null;
                    }
                    composerImplMo1636j.mo1640l();
                    if (composerImplMo1636j.f2897L) {
                        composerImplMo1636j.mo1634i(new InterfaceC2041a<ComposeUiNode>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText-4YKlhWE$$inlined$Layout$1
                            {
                                super(0);
                            }

                            /* JADX WARN: Type inference failed for: r3v1, types: [androidx.compose.ui.node.ComposeUiNode, java.lang.Object] */
                            @Override // cm.InterfaceC2041a
                            /* JADX INFO: renamed from: E */
                            public final ComposeUiNode mo807E() {
                                return interfaceC2041a.mo807E();
                            }
                        });
                    } else {
                        composerImplMo1636j.mo1653s();
                    }
                    C8573r0.m16714a1(composerImplMo1636j, textController.f2542d, ComposeUiNode.Companion.f3731e);
                    C8573r0.m16714a1(composerImplMo1636j, interfaceC10015c2, ComposeUiNode.Companion.f3730d);
                    C8573r0.m16714a1(composerImplMo1636j, layoutDirection, ComposeUiNode.Companion.f3732f);
                    C8573r0.m16714a1(composerImplMo1636j, interfaceC0647n1, ComposeUiNode.Companion.f3733g);
                    C8573r0.m16714a1(composerImplMo1636j, interfaceC0500bM1928b, ComposeUiNode.Companion.f3729c);
                    composerImplMo1636j.m1609Q(true);
                    composerImplMo1636j.m1609Q(false);
                    composerImplMo1636j.m1609Q(false);
                    z12 = z11;
                    interfaceC0500b4 = interfaceC0500b3;
                    interfaceC2052l3 = interfaceC2052l2;
                    i31 = i29;
                    i32 = i21;
                    C7218l c7218l114 = c7218l2;
                    i33 = i30;
                    c7218l3 = c7218l114;
                }
                c5332q0M1612T = composerImplMo1636j.m1612T();
                if (c5332q0M1612T == null) {
                    return;
                }
                c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // cm.InterfaceC2056p
                    /* JADX INFO: renamed from: m0 */
                    public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                        num.intValue();
                        BasicTextKt.m1531b(str, interfaceC0500b4, c7218l3, interfaceC2052l3, i32, z12, i31, i33, interfaceC0476a2, C8573r0.m16737l1(i13 | 1), i14);
                        return C9072e.f47360a;
                    }
                };
            }
            i15 |= 24576;
            i21 = i10;
            i23 = i14 & 32;
            if (i23 != 0) {
                i15 |= 196608;
            } else if ((i13 & 458752) == 0) {
                if (composerImplMo1636j.m1598G(z10)) {
                    i24 = 131072;
                } else {
                    i24 = 65536;
                }
                i15 |= i24;
            }
            i25 = i14 & 64;
            if (i25 != 0) {
                i15 |= 1572864;
            } else if ((i13 & 3670016) == 0) {
                if (composerImplMo1636j.m1594E(i11)) {
                    i26 = 1048576;
                } else {
                    i26 = 524288;
                }
                i15 |= i26;
            }
            i27 = i14 & BuildConfig.SDK_TRUNCATE_LENGTH;
            if (i27 != 0) {
                i15 |= 12582912;
            } else if ((i13 & 29360128) == 0) {
                if (composerImplMo1636j.m1594E(i12)) {
                    i28 = 8388608;
                } else {
                    i28 = 4194304;
                }
                i15 |= i28;
            }
            if ((i15 & 23967451) == 4793490) {
                if (i34 != 0) {
                    interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                }
                if (i16 != 0) {
                    c7218l2 = C7218l.f40599c;
                }
                if (i18 != 0) {
                    interfaceC2052l2 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$1
                        @Override // cm.InterfaceC2052l
                        /* JADX INFO: renamed from: n */
                        public final C9072e mo528n(C7216j c7216j) {
                            C5207g.m11111f(c7216j, "it");
                            return C9072e.f47360a;
                        }
                    };
                }
                if (i20 != 0) {
                    i21 = 1;
                }
                if (i23 != 0) {
                    z11 = true;
                } else {
                    z11 = z10;
                }
                if (i25 != 0) {
                    i29 = Integer.MAX_VALUE;
                } else {
                    i29 = i11;
                }
                if (i27 != 0) {
                    i30 = 1;
                } else {
                    i30 = i12;
                }
                InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q112 = ComposerKt.f3003a;
                C8584v.m16781D(i30, i29);
                interfaceC0004c = (InterfaceC0004c) composerImplMo1636j.mo1648p(SelectionRegistrarKt.f2569a);
                C5304d1 c5304d112 = CompositionLocalsKt.f4137e;
                interfaceC10015c = (InterfaceC10015c) composerImplMo1636j.mo1648p(c5304d112);
                aVar = (AbstractC0696b.a) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4140h);
                composerImplMo1636j.mo1622c(959238681);
                if (interfaceC0004c == null) {
                    jLongValue = 0;
                } else {
                    jLongValue = ((Number) C0487a.m1860a(new Object[]{str, interfaceC0004c}, SaverKt.m1859a(new BasicTextKt$selectionIdSaver$1(interfaceC0004c), BasicTextKt$selectionIdSaver$2.f2523b), new InterfaceC2041a<Long>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$selectableId$1
                        {
                            super(0);
                        }

                        @Override // cm.InterfaceC2041a
                        /* JADX INFO: renamed from: E */
                        public final Long mo807E() {
                            return Long.valueOf(interfaceC0004c.m6b());
                        }
                    }, composerImplMo1636j, 4)).longValue();
                }
                j10 = jLongValue;
                composerImplMo1636j.m1609Q(false);
                composerImplMo1636j.mo1622c(-492369756);
                objM1619a0 = composerImplMo1636j.m1619a0();
                if (objM1619a0 == InterfaceC0476a.a.f3122a) {
                    objM1619a0 = new TextController(new TextState(new C10423b(new C0689a(str), c7218l2, i29, i30, z11, i21, interfaceC10015c, aVar), j10));
                    composerImplMo1636j.m1597F0(objM1619a0);
                }
                composerImplMo1636j.m1609Q(false);
                textController = (TextController) objM1619a0;
                textState = textController.f2539a;
                if (!composerImplMo1636j.f2897L) {
                    c10423b = textState.f2563d;
                    Pair<List<C0689a.b<C7213g>>, List<C0689a.b<InterfaceC2057q<String, InterfaceC0476a, Integer, C9072e>>>> pair112 = CoreTextKt.f2526a;
                    C5207g.m11111f(c10423b, "current");
                    C5207g.m11111f(c7218l2, "style");
                    C5207g.m11111f(interfaceC10015c, "density");
                    C5207g.m11111f(aVar, "fontFamilyResolver");
                    if (!C5207g.m11106a(c10423b.f52258a.f4523a, str)) {
                        c10423b = new C10423b(new C0689a(str), c7218l2, i29, i30, z11, i21, interfaceC10015c, aVar);
                    } else {
                        c10423b = new C10423b(new C0689a(str), c7218l2, i29, i30, z11, i21, interfaceC10015c, aVar);
                    }
                    textController.m1540f(c10423b);
                }
                textState.getClass();
                C5207g.m11111f(interfaceC2052l2, "<set-?>");
                textState.f2561b = interfaceC2052l2;
                textController.m1541g(interfaceC0004c);
                composerImplMo1636j.mo1622c(959240076);
                if (interfaceC0004c != null) {
                    long j1112 = ((C0005d) composerImplMo1636j.mo1648p(TextSelectionColorsKt.f2571a)).f3b;
                }
                composerImplMo1636j.m1609Q(false);
                interfaceC0500b3 = interfaceC0500b2;
                InterfaceC0500b interfaceC0500bMo1929K112 = interfaceC0500b3.mo1929K(textController.m1539e());
                composerImplMo1636j.mo1622c(544976794);
                interfaceC10015c2 = (InterfaceC10015c) composerImplMo1636j.mo1648p(c5304d112);
                layoutDirection = (LayoutDirection) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4143k);
                interfaceC0647n1 = (InterfaceC0647n1) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4148p);
                interfaceC0500bM1928b = ComposedModifierKt.m1928b(composerImplMo1636j, interfaceC0500bMo1929K112);
                ComposeUiNode.f3726n.getClass();
                interfaceC2041a = ComposeUiNode.Companion.f3728b;
                composerImplMo1636j.mo1622c(1405779621);
                if (!(composerImplMo1636j.f2910a instanceof InterfaceC5299c)) {
                    C8573r0.m16771y0();
                    throw null;
                }
                composerImplMo1636j.mo1640l();
                if (composerImplMo1636j.f2897L) {
                    composerImplMo1636j.mo1634i(new InterfaceC2041a<ComposeUiNode>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText-4YKlhWE$$inlined$Layout$1
                        {
                            super(0);
                        }

                        /* JADX WARN: Type inference failed for: r3v1, types: [androidx.compose.ui.node.ComposeUiNode, java.lang.Object] */
                        @Override // cm.InterfaceC2041a
                        /* JADX INFO: renamed from: E */
                        public final ComposeUiNode mo807E() {
                            return interfaceC2041a.mo807E();
                        }
                    });
                } else {
                    composerImplMo1636j.mo1653s();
                }
                C8573r0.m16714a1(composerImplMo1636j, textController.f2542d, ComposeUiNode.Companion.f3731e);
                C8573r0.m16714a1(composerImplMo1636j, interfaceC10015c2, ComposeUiNode.Companion.f3730d);
                C8573r0.m16714a1(composerImplMo1636j, layoutDirection, ComposeUiNode.Companion.f3732f);
                C8573r0.m16714a1(composerImplMo1636j, interfaceC0647n1, ComposeUiNode.Companion.f3733g);
                C8573r0.m16714a1(composerImplMo1636j, interfaceC0500bM1928b, ComposeUiNode.Companion.f3729c);
                composerImplMo1636j.m1609Q(true);
                composerImplMo1636j.m1609Q(false);
                composerImplMo1636j.m1609Q(false);
                z12 = z11;
                interfaceC0500b4 = interfaceC0500b3;
                interfaceC2052l3 = interfaceC2052l2;
                i31 = i29;
                i32 = i21;
                C7218l c7218l115 = c7218l2;
                i33 = i30;
                c7218l3 = c7218l115;
            } else {
                if (i34 != 0) {
                    interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                }
                if (i16 != 0) {
                    c7218l2 = C7218l.f40599c;
                }
                if (i18 != 0) {
                    interfaceC2052l2 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$1
                        @Override // cm.InterfaceC2052l
                        /* JADX INFO: renamed from: n */
                        public final C9072e mo528n(C7216j c7216j) {
                            C5207g.m11111f(c7216j, "it");
                            return C9072e.f47360a;
                        }
                    };
                }
                if (i20 != 0) {
                    i21 = 1;
                }
                if (i23 != 0) {
                    z11 = true;
                } else {
                    z11 = z10;
                }
                if (i25 != 0) {
                    i29 = Integer.MAX_VALUE;
                } else {
                    i29 = i11;
                }
                if (i27 != 0) {
                    i30 = 1;
                } else {
                    i30 = i12;
                }
                InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q113 = ComposerKt.f3003a;
                C8584v.m16781D(i30, i29);
                interfaceC0004c = (InterfaceC0004c) composerImplMo1636j.mo1648p(SelectionRegistrarKt.f2569a);
                C5304d1 c5304d113 = CompositionLocalsKt.f4137e;
                interfaceC10015c = (InterfaceC10015c) composerImplMo1636j.mo1648p(c5304d113);
                aVar = (AbstractC0696b.a) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4140h);
                composerImplMo1636j.mo1622c(959238681);
                if (interfaceC0004c == null) {
                    jLongValue = 0;
                } else {
                    jLongValue = ((Number) C0487a.m1860a(new Object[]{str, interfaceC0004c}, SaverKt.m1859a(new BasicTextKt$selectionIdSaver$1(interfaceC0004c), BasicTextKt$selectionIdSaver$2.f2523b), new InterfaceC2041a<Long>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$selectableId$1
                        {
                            super(0);
                        }

                        @Override // cm.InterfaceC2041a
                        /* JADX INFO: renamed from: E */
                        public final Long mo807E() {
                            return Long.valueOf(interfaceC0004c.m6b());
                        }
                    }, composerImplMo1636j, 4)).longValue();
                }
                j10 = jLongValue;
                composerImplMo1636j.m1609Q(false);
                composerImplMo1636j.mo1622c(-492369756);
                objM1619a0 = composerImplMo1636j.m1619a0();
                if (objM1619a0 == InterfaceC0476a.a.f3122a) {
                    objM1619a0 = new TextController(new TextState(new C10423b(new C0689a(str), c7218l2, i29, i30, z11, i21, interfaceC10015c, aVar), j10));
                    composerImplMo1636j.m1597F0(objM1619a0);
                }
                composerImplMo1636j.m1609Q(false);
                textController = (TextController) objM1619a0;
                textState = textController.f2539a;
                if (!composerImplMo1636j.f2897L) {
                    c10423b = textState.f2563d;
                    Pair<List<C0689a.b<C7213g>>, List<C0689a.b<InterfaceC2057q<String, InterfaceC0476a, Integer, C9072e>>>> pair113 = CoreTextKt.f2526a;
                    C5207g.m11111f(c10423b, "current");
                    C5207g.m11111f(c7218l2, "style");
                    C5207g.m11111f(interfaceC10015c, "density");
                    C5207g.m11111f(aVar, "fontFamilyResolver");
                    if (!C5207g.m11106a(c10423b.f52258a.f4523a, str)) {
                        c10423b = new C10423b(new C0689a(str), c7218l2, i29, i30, z11, i21, interfaceC10015c, aVar);
                    } else {
                        c10423b = new C10423b(new C0689a(str), c7218l2, i29, i30, z11, i21, interfaceC10015c, aVar);
                    }
                    textController.m1540f(c10423b);
                }
                textState.getClass();
                C5207g.m11111f(interfaceC2052l2, "<set-?>");
                textState.f2561b = interfaceC2052l2;
                textController.m1541g(interfaceC0004c);
                composerImplMo1636j.mo1622c(959240076);
                if (interfaceC0004c != null) {
                    long j1113 = ((C0005d) composerImplMo1636j.mo1648p(TextSelectionColorsKt.f2571a)).f3b;
                }
                composerImplMo1636j.m1609Q(false);
                interfaceC0500b3 = interfaceC0500b2;
                InterfaceC0500b interfaceC0500bMo1929K113 = interfaceC0500b3.mo1929K(textController.m1539e());
                composerImplMo1636j.mo1622c(544976794);
                interfaceC10015c2 = (InterfaceC10015c) composerImplMo1636j.mo1648p(c5304d113);
                layoutDirection = (LayoutDirection) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4143k);
                interfaceC0647n1 = (InterfaceC0647n1) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4148p);
                interfaceC0500bM1928b = ComposedModifierKt.m1928b(composerImplMo1636j, interfaceC0500bMo1929K113);
                ComposeUiNode.f3726n.getClass();
                interfaceC2041a = ComposeUiNode.Companion.f3728b;
                composerImplMo1636j.mo1622c(1405779621);
                if (!(composerImplMo1636j.f2910a instanceof InterfaceC5299c)) {
                    C8573r0.m16771y0();
                    throw null;
                }
                composerImplMo1636j.mo1640l();
                if (composerImplMo1636j.f2897L) {
                    composerImplMo1636j.mo1634i(new InterfaceC2041a<ComposeUiNode>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText-4YKlhWE$$inlined$Layout$1
                        {
                            super(0);
                        }

                        /* JADX WARN: Type inference failed for: r3v1, types: [androidx.compose.ui.node.ComposeUiNode, java.lang.Object] */
                        @Override // cm.InterfaceC2041a
                        /* JADX INFO: renamed from: E */
                        public final ComposeUiNode mo807E() {
                            return interfaceC2041a.mo807E();
                        }
                    });
                } else {
                    composerImplMo1636j.mo1653s();
                }
                C8573r0.m16714a1(composerImplMo1636j, textController.f2542d, ComposeUiNode.Companion.f3731e);
                C8573r0.m16714a1(composerImplMo1636j, interfaceC10015c2, ComposeUiNode.Companion.f3730d);
                C8573r0.m16714a1(composerImplMo1636j, layoutDirection, ComposeUiNode.Companion.f3732f);
                C8573r0.m16714a1(composerImplMo1636j, interfaceC0647n1, ComposeUiNode.Companion.f3733g);
                C8573r0.m16714a1(composerImplMo1636j, interfaceC0500bM1928b, ComposeUiNode.Companion.f3729c);
                composerImplMo1636j.m1609Q(true);
                composerImplMo1636j.m1609Q(false);
                composerImplMo1636j.m1609Q(false);
                z12 = z11;
                interfaceC0500b4 = interfaceC0500b3;
                interfaceC2052l3 = interfaceC2052l2;
                i31 = i29;
                i32 = i21;
                C7218l c7218l116 = c7218l2;
                i33 = i30;
                c7218l3 = c7218l116;
            }
            c5332q0M1612T = composerImplMo1636j.m1612T();
            if (c5332q0M1612T == null) {
                return;
            }
            c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // cm.InterfaceC2056p
                /* JADX INFO: renamed from: m0 */
                public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                    num.intValue();
                    BasicTextKt.m1531b(str, interfaceC0500b4, c7218l3, interfaceC2052l3, i32, z12, i31, i33, interfaceC0476a2, C8573r0.m16737l1(i13 | 1), i14);
                    return C9072e.f47360a;
                }
            };
        }
        i15 |= 384;
        c7218l2 = c7218l;
        i18 = i14 & 8;
        if (i18 != 0) {
            if ((i13 & 7168) == 0) {
                interfaceC2052l2 = interfaceC2052l;
                if (composerImplMo1636j.m1600H(interfaceC2052l2)) {
                    i19 = 2048;
                } else {
                    i19 = 1024;
                }
                i15 |= i19;
            }
            i20 = i14 & 16;
            if (i20 != 0) {
                if ((57344 & i13) == 0) {
                    i21 = i10;
                    if (composerImplMo1636j.m1594E(i21)) {
                        i22 = 16384;
                    } else {
                        i22 = 8192;
                    }
                    i15 |= i22;
                }
                i23 = i14 & 32;
                if (i23 != 0) {
                    i15 |= 196608;
                } else if ((i13 & 458752) == 0) {
                    if (composerImplMo1636j.m1598G(z10)) {
                        i24 = 131072;
                    } else {
                        i24 = 65536;
                    }
                    i15 |= i24;
                }
                i25 = i14 & 64;
                if (i25 != 0) {
                    i15 |= 1572864;
                } else if ((i13 & 3670016) == 0) {
                    if (composerImplMo1636j.m1594E(i11)) {
                        i26 = 1048576;
                    } else {
                        i26 = 524288;
                    }
                    i15 |= i26;
                }
                i27 = i14 & BuildConfig.SDK_TRUNCATE_LENGTH;
                if (i27 != 0) {
                    i15 |= 12582912;
                } else if ((i13 & 29360128) == 0) {
                    if (composerImplMo1636j.m1594E(i12)) {
                        i28 = 8388608;
                    } else {
                        i28 = 4194304;
                    }
                    i15 |= i28;
                }
                if ((i15 & 23967451) == 4793490) {
                    if (i34 != 0) {
                        interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                    }
                    if (i16 != 0) {
                        c7218l2 = C7218l.f40599c;
                    }
                    if (i18 != 0) {
                        interfaceC2052l2 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$1
                            @Override // cm.InterfaceC2052l
                            /* JADX INFO: renamed from: n */
                            public final C9072e mo528n(C7216j c7216j) {
                                C5207g.m11111f(c7216j, "it");
                                return C9072e.f47360a;
                            }
                        };
                    }
                    if (i20 != 0) {
                        i21 = 1;
                    }
                    if (i23 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    if (i25 != 0) {
                        i29 = Integer.MAX_VALUE;
                    } else {
                        i29 = i11;
                    }
                    if (i27 != 0) {
                        i30 = 1;
                    } else {
                        i30 = i12;
                    }
                    InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q114 = ComposerKt.f3003a;
                    C8584v.m16781D(i30, i29);
                    interfaceC0004c = (InterfaceC0004c) composerImplMo1636j.mo1648p(SelectionRegistrarKt.f2569a);
                    C5304d1 c5304d114 = CompositionLocalsKt.f4137e;
                    interfaceC10015c = (InterfaceC10015c) composerImplMo1636j.mo1648p(c5304d114);
                    aVar = (AbstractC0696b.a) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4140h);
                    composerImplMo1636j.mo1622c(959238681);
                    if (interfaceC0004c == null) {
                        jLongValue = 0;
                    } else {
                        jLongValue = ((Number) C0487a.m1860a(new Object[]{str, interfaceC0004c}, SaverKt.m1859a(new BasicTextKt$selectionIdSaver$1(interfaceC0004c), BasicTextKt$selectionIdSaver$2.f2523b), new InterfaceC2041a<Long>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$selectableId$1
                            {
                                super(0);
                            }

                            @Override // cm.InterfaceC2041a
                            /* JADX INFO: renamed from: E */
                            public final Long mo807E() {
                                return Long.valueOf(interfaceC0004c.m6b());
                            }
                        }, composerImplMo1636j, 4)).longValue();
                    }
                    j10 = jLongValue;
                    composerImplMo1636j.m1609Q(false);
                    composerImplMo1636j.mo1622c(-492369756);
                    objM1619a0 = composerImplMo1636j.m1619a0();
                    if (objM1619a0 == InterfaceC0476a.a.f3122a) {
                        objM1619a0 = new TextController(new TextState(new C10423b(new C0689a(str), c7218l2, i29, i30, z11, i21, interfaceC10015c, aVar), j10));
                        composerImplMo1636j.m1597F0(objM1619a0);
                    }
                    composerImplMo1636j.m1609Q(false);
                    textController = (TextController) objM1619a0;
                    textState = textController.f2539a;
                    if (!composerImplMo1636j.f2897L) {
                        c10423b = textState.f2563d;
                        Pair<List<C0689a.b<C7213g>>, List<C0689a.b<InterfaceC2057q<String, InterfaceC0476a, Integer, C9072e>>>> pair114 = CoreTextKt.f2526a;
                        C5207g.m11111f(c10423b, "current");
                        C5207g.m11111f(c7218l2, "style");
                        C5207g.m11111f(interfaceC10015c, "density");
                        C5207g.m11111f(aVar, "fontFamilyResolver");
                        if (!C5207g.m11106a(c10423b.f52258a.f4523a, str)) {
                            c10423b = new C10423b(new C0689a(str), c7218l2, i29, i30, z11, i21, interfaceC10015c, aVar);
                        } else {
                            c10423b = new C10423b(new C0689a(str), c7218l2, i29, i30, z11, i21, interfaceC10015c, aVar);
                        }
                        textController.m1540f(c10423b);
                    }
                    textState.getClass();
                    C5207g.m11111f(interfaceC2052l2, "<set-?>");
                    textState.f2561b = interfaceC2052l2;
                    textController.m1541g(interfaceC0004c);
                    composerImplMo1636j.mo1622c(959240076);
                    if (interfaceC0004c != null) {
                        long j1114 = ((C0005d) composerImplMo1636j.mo1648p(TextSelectionColorsKt.f2571a)).f3b;
                    }
                    composerImplMo1636j.m1609Q(false);
                    interfaceC0500b3 = interfaceC0500b2;
                    InterfaceC0500b interfaceC0500bMo1929K114 = interfaceC0500b3.mo1929K(textController.m1539e());
                    composerImplMo1636j.mo1622c(544976794);
                    interfaceC10015c2 = (InterfaceC10015c) composerImplMo1636j.mo1648p(c5304d114);
                    layoutDirection = (LayoutDirection) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4143k);
                    interfaceC0647n1 = (InterfaceC0647n1) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4148p);
                    interfaceC0500bM1928b = ComposedModifierKt.m1928b(composerImplMo1636j, interfaceC0500bMo1929K114);
                    ComposeUiNode.f3726n.getClass();
                    interfaceC2041a = ComposeUiNode.Companion.f3728b;
                    composerImplMo1636j.mo1622c(1405779621);
                    if (!(composerImplMo1636j.f2910a instanceof InterfaceC5299c)) {
                        C8573r0.m16771y0();
                        throw null;
                    }
                    composerImplMo1636j.mo1640l();
                    if (composerImplMo1636j.f2897L) {
                        composerImplMo1636j.mo1634i(new InterfaceC2041a<ComposeUiNode>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText-4YKlhWE$$inlined$Layout$1
                            {
                                super(0);
                            }

                            /* JADX WARN: Type inference failed for: r3v1, types: [androidx.compose.ui.node.ComposeUiNode, java.lang.Object] */
                            @Override // cm.InterfaceC2041a
                            /* JADX INFO: renamed from: E */
                            public final ComposeUiNode mo807E() {
                                return interfaceC2041a.mo807E();
                            }
                        });
                    } else {
                        composerImplMo1636j.mo1653s();
                    }
                    C8573r0.m16714a1(composerImplMo1636j, textController.f2542d, ComposeUiNode.Companion.f3731e);
                    C8573r0.m16714a1(composerImplMo1636j, interfaceC10015c2, ComposeUiNode.Companion.f3730d);
                    C8573r0.m16714a1(composerImplMo1636j, layoutDirection, ComposeUiNode.Companion.f3732f);
                    C8573r0.m16714a1(composerImplMo1636j, interfaceC0647n1, ComposeUiNode.Companion.f3733g);
                    C8573r0.m16714a1(composerImplMo1636j, interfaceC0500bM1928b, ComposeUiNode.Companion.f3729c);
                    composerImplMo1636j.m1609Q(true);
                    composerImplMo1636j.m1609Q(false);
                    composerImplMo1636j.m1609Q(false);
                    z12 = z11;
                    interfaceC0500b4 = interfaceC0500b3;
                    interfaceC2052l3 = interfaceC2052l2;
                    i31 = i29;
                    i32 = i21;
                    C7218l c7218l117 = c7218l2;
                    i33 = i30;
                    c7218l3 = c7218l117;
                } else {
                    if (i34 != 0) {
                        interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                    }
                    if (i16 != 0) {
                        c7218l2 = C7218l.f40599c;
                    }
                    if (i18 != 0) {
                        interfaceC2052l2 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$1
                            @Override // cm.InterfaceC2052l
                            /* JADX INFO: renamed from: n */
                            public final C9072e mo528n(C7216j c7216j) {
                                C5207g.m11111f(c7216j, "it");
                                return C9072e.f47360a;
                            }
                        };
                    }
                    if (i20 != 0) {
                        i21 = 1;
                    }
                    if (i23 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    if (i25 != 0) {
                        i29 = Integer.MAX_VALUE;
                    } else {
                        i29 = i11;
                    }
                    if (i27 != 0) {
                        i30 = 1;
                    } else {
                        i30 = i12;
                    }
                    InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q115 = ComposerKt.f3003a;
                    C8584v.m16781D(i30, i29);
                    interfaceC0004c = (InterfaceC0004c) composerImplMo1636j.mo1648p(SelectionRegistrarKt.f2569a);
                    C5304d1 c5304d115 = CompositionLocalsKt.f4137e;
                    interfaceC10015c = (InterfaceC10015c) composerImplMo1636j.mo1648p(c5304d115);
                    aVar = (AbstractC0696b.a) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4140h);
                    composerImplMo1636j.mo1622c(959238681);
                    if (interfaceC0004c == null) {
                        jLongValue = 0;
                    } else {
                        jLongValue = ((Number) C0487a.m1860a(new Object[]{str, interfaceC0004c}, SaverKt.m1859a(new BasicTextKt$selectionIdSaver$1(interfaceC0004c), BasicTextKt$selectionIdSaver$2.f2523b), new InterfaceC2041a<Long>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$selectableId$1
                            {
                                super(0);
                            }

                            @Override // cm.InterfaceC2041a
                            /* JADX INFO: renamed from: E */
                            public final Long mo807E() {
                                return Long.valueOf(interfaceC0004c.m6b());
                            }
                        }, composerImplMo1636j, 4)).longValue();
                    }
                    j10 = jLongValue;
                    composerImplMo1636j.m1609Q(false);
                    composerImplMo1636j.mo1622c(-492369756);
                    objM1619a0 = composerImplMo1636j.m1619a0();
                    if (objM1619a0 == InterfaceC0476a.a.f3122a) {
                        objM1619a0 = new TextController(new TextState(new C10423b(new C0689a(str), c7218l2, i29, i30, z11, i21, interfaceC10015c, aVar), j10));
                        composerImplMo1636j.m1597F0(objM1619a0);
                    }
                    composerImplMo1636j.m1609Q(false);
                    textController = (TextController) objM1619a0;
                    textState = textController.f2539a;
                    if (!composerImplMo1636j.f2897L) {
                        c10423b = textState.f2563d;
                        Pair<List<C0689a.b<C7213g>>, List<C0689a.b<InterfaceC2057q<String, InterfaceC0476a, Integer, C9072e>>>> pair115 = CoreTextKt.f2526a;
                        C5207g.m11111f(c10423b, "current");
                        C5207g.m11111f(c7218l2, "style");
                        C5207g.m11111f(interfaceC10015c, "density");
                        C5207g.m11111f(aVar, "fontFamilyResolver");
                        if (!C5207g.m11106a(c10423b.f52258a.f4523a, str)) {
                            c10423b = new C10423b(new C0689a(str), c7218l2, i29, i30, z11, i21, interfaceC10015c, aVar);
                        } else {
                            c10423b = new C10423b(new C0689a(str), c7218l2, i29, i30, z11, i21, interfaceC10015c, aVar);
                        }
                        textController.m1540f(c10423b);
                    }
                    textState.getClass();
                    C5207g.m11111f(interfaceC2052l2, "<set-?>");
                    textState.f2561b = interfaceC2052l2;
                    textController.m1541g(interfaceC0004c);
                    composerImplMo1636j.mo1622c(959240076);
                    if (interfaceC0004c != null) {
                        long j1115 = ((C0005d) composerImplMo1636j.mo1648p(TextSelectionColorsKt.f2571a)).f3b;
                    }
                    composerImplMo1636j.m1609Q(false);
                    interfaceC0500b3 = interfaceC0500b2;
                    InterfaceC0500b interfaceC0500bMo1929K115 = interfaceC0500b3.mo1929K(textController.m1539e());
                    composerImplMo1636j.mo1622c(544976794);
                    interfaceC10015c2 = (InterfaceC10015c) composerImplMo1636j.mo1648p(c5304d115);
                    layoutDirection = (LayoutDirection) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4143k);
                    interfaceC0647n1 = (InterfaceC0647n1) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4148p);
                    interfaceC0500bM1928b = ComposedModifierKt.m1928b(composerImplMo1636j, interfaceC0500bMo1929K115);
                    ComposeUiNode.f3726n.getClass();
                    interfaceC2041a = ComposeUiNode.Companion.f3728b;
                    composerImplMo1636j.mo1622c(1405779621);
                    if (!(composerImplMo1636j.f2910a instanceof InterfaceC5299c)) {
                        C8573r0.m16771y0();
                        throw null;
                    }
                    composerImplMo1636j.mo1640l();
                    if (composerImplMo1636j.f2897L) {
                        composerImplMo1636j.mo1634i(new InterfaceC2041a<ComposeUiNode>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText-4YKlhWE$$inlined$Layout$1
                            {
                                super(0);
                            }

                            /* JADX WARN: Type inference failed for: r3v1, types: [androidx.compose.ui.node.ComposeUiNode, java.lang.Object] */
                            @Override // cm.InterfaceC2041a
                            /* JADX INFO: renamed from: E */
                            public final ComposeUiNode mo807E() {
                                return interfaceC2041a.mo807E();
                            }
                        });
                    } else {
                        composerImplMo1636j.mo1653s();
                    }
                    C8573r0.m16714a1(composerImplMo1636j, textController.f2542d, ComposeUiNode.Companion.f3731e);
                    C8573r0.m16714a1(composerImplMo1636j, interfaceC10015c2, ComposeUiNode.Companion.f3730d);
                    C8573r0.m16714a1(composerImplMo1636j, layoutDirection, ComposeUiNode.Companion.f3732f);
                    C8573r0.m16714a1(composerImplMo1636j, interfaceC0647n1, ComposeUiNode.Companion.f3733g);
                    C8573r0.m16714a1(composerImplMo1636j, interfaceC0500bM1928b, ComposeUiNode.Companion.f3729c);
                    composerImplMo1636j.m1609Q(true);
                    composerImplMo1636j.m1609Q(false);
                    composerImplMo1636j.m1609Q(false);
                    z12 = z11;
                    interfaceC0500b4 = interfaceC0500b3;
                    interfaceC2052l3 = interfaceC2052l2;
                    i31 = i29;
                    i32 = i21;
                    C7218l c7218l118 = c7218l2;
                    i33 = i30;
                    c7218l3 = c7218l118;
                }
                c5332q0M1612T = composerImplMo1636j.m1612T();
                if (c5332q0M1612T == null) {
                    return;
                }
                c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // cm.InterfaceC2056p
                    /* JADX INFO: renamed from: m0 */
                    public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                        num.intValue();
                        BasicTextKt.m1531b(str, interfaceC0500b4, c7218l3, interfaceC2052l3, i32, z12, i31, i33, interfaceC0476a2, C8573r0.m16737l1(i13 | 1), i14);
                        return C9072e.f47360a;
                    }
                };
            }
            i15 |= 24576;
            i21 = i10;
            i23 = i14 & 32;
            if (i23 != 0) {
                i15 |= 196608;
            } else if ((i13 & 458752) == 0) {
                if (composerImplMo1636j.m1598G(z10)) {
                    i24 = 131072;
                } else {
                    i24 = 65536;
                }
                i15 |= i24;
            }
            i25 = i14 & 64;
            if (i25 != 0) {
                i15 |= 1572864;
            } else if ((i13 & 3670016) == 0) {
                if (composerImplMo1636j.m1594E(i11)) {
                    i26 = 1048576;
                } else {
                    i26 = 524288;
                }
                i15 |= i26;
            }
            i27 = i14 & BuildConfig.SDK_TRUNCATE_LENGTH;
            if (i27 != 0) {
                i15 |= 12582912;
            } else if ((i13 & 29360128) == 0) {
                if (composerImplMo1636j.m1594E(i12)) {
                    i28 = 8388608;
                } else {
                    i28 = 4194304;
                }
                i15 |= i28;
            }
            if ((i15 & 23967451) == 4793490) {
                if (i34 != 0) {
                    interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                }
                if (i16 != 0) {
                    c7218l2 = C7218l.f40599c;
                }
                if (i18 != 0) {
                    interfaceC2052l2 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$1
                        @Override // cm.InterfaceC2052l
                        /* JADX INFO: renamed from: n */
                        public final C9072e mo528n(C7216j c7216j) {
                            C5207g.m11111f(c7216j, "it");
                            return C9072e.f47360a;
                        }
                    };
                }
                if (i20 != 0) {
                    i21 = 1;
                }
                if (i23 != 0) {
                    z11 = true;
                } else {
                    z11 = z10;
                }
                if (i25 != 0) {
                    i29 = Integer.MAX_VALUE;
                } else {
                    i29 = i11;
                }
                if (i27 != 0) {
                    i30 = 1;
                } else {
                    i30 = i12;
                }
                InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q116 = ComposerKt.f3003a;
                C8584v.m16781D(i30, i29);
                interfaceC0004c = (InterfaceC0004c) composerImplMo1636j.mo1648p(SelectionRegistrarKt.f2569a);
                C5304d1 c5304d116 = CompositionLocalsKt.f4137e;
                interfaceC10015c = (InterfaceC10015c) composerImplMo1636j.mo1648p(c5304d116);
                aVar = (AbstractC0696b.a) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4140h);
                composerImplMo1636j.mo1622c(959238681);
                if (interfaceC0004c == null) {
                    jLongValue = 0;
                } else {
                    jLongValue = ((Number) C0487a.m1860a(new Object[]{str, interfaceC0004c}, SaverKt.m1859a(new BasicTextKt$selectionIdSaver$1(interfaceC0004c), BasicTextKt$selectionIdSaver$2.f2523b), new InterfaceC2041a<Long>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$selectableId$1
                        {
                            super(0);
                        }

                        @Override // cm.InterfaceC2041a
                        /* JADX INFO: renamed from: E */
                        public final Long mo807E() {
                            return Long.valueOf(interfaceC0004c.m6b());
                        }
                    }, composerImplMo1636j, 4)).longValue();
                }
                j10 = jLongValue;
                composerImplMo1636j.m1609Q(false);
                composerImplMo1636j.mo1622c(-492369756);
                objM1619a0 = composerImplMo1636j.m1619a0();
                if (objM1619a0 == InterfaceC0476a.a.f3122a) {
                    objM1619a0 = new TextController(new TextState(new C10423b(new C0689a(str), c7218l2, i29, i30, z11, i21, interfaceC10015c, aVar), j10));
                    composerImplMo1636j.m1597F0(objM1619a0);
                }
                composerImplMo1636j.m1609Q(false);
                textController = (TextController) objM1619a0;
                textState = textController.f2539a;
                if (!composerImplMo1636j.f2897L) {
                    c10423b = textState.f2563d;
                    Pair<List<C0689a.b<C7213g>>, List<C0689a.b<InterfaceC2057q<String, InterfaceC0476a, Integer, C9072e>>>> pair116 = CoreTextKt.f2526a;
                    C5207g.m11111f(c10423b, "current");
                    C5207g.m11111f(c7218l2, "style");
                    C5207g.m11111f(interfaceC10015c, "density");
                    C5207g.m11111f(aVar, "fontFamilyResolver");
                    if (!C5207g.m11106a(c10423b.f52258a.f4523a, str)) {
                        c10423b = new C10423b(new C0689a(str), c7218l2, i29, i30, z11, i21, interfaceC10015c, aVar);
                    } else {
                        c10423b = new C10423b(new C0689a(str), c7218l2, i29, i30, z11, i21, interfaceC10015c, aVar);
                    }
                    textController.m1540f(c10423b);
                }
                textState.getClass();
                C5207g.m11111f(interfaceC2052l2, "<set-?>");
                textState.f2561b = interfaceC2052l2;
                textController.m1541g(interfaceC0004c);
                composerImplMo1636j.mo1622c(959240076);
                if (interfaceC0004c != null) {
                    long j1116 = ((C0005d) composerImplMo1636j.mo1648p(TextSelectionColorsKt.f2571a)).f3b;
                }
                composerImplMo1636j.m1609Q(false);
                interfaceC0500b3 = interfaceC0500b2;
                InterfaceC0500b interfaceC0500bMo1929K116 = interfaceC0500b3.mo1929K(textController.m1539e());
                composerImplMo1636j.mo1622c(544976794);
                interfaceC10015c2 = (InterfaceC10015c) composerImplMo1636j.mo1648p(c5304d116);
                layoutDirection = (LayoutDirection) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4143k);
                interfaceC0647n1 = (InterfaceC0647n1) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4148p);
                interfaceC0500bM1928b = ComposedModifierKt.m1928b(composerImplMo1636j, interfaceC0500bMo1929K116);
                ComposeUiNode.f3726n.getClass();
                interfaceC2041a = ComposeUiNode.Companion.f3728b;
                composerImplMo1636j.mo1622c(1405779621);
                if (!(composerImplMo1636j.f2910a instanceof InterfaceC5299c)) {
                    C8573r0.m16771y0();
                    throw null;
                }
                composerImplMo1636j.mo1640l();
                if (composerImplMo1636j.f2897L) {
                    composerImplMo1636j.mo1634i(new InterfaceC2041a<ComposeUiNode>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText-4YKlhWE$$inlined$Layout$1
                        {
                            super(0);
                        }

                        /* JADX WARN: Type inference failed for: r3v1, types: [androidx.compose.ui.node.ComposeUiNode, java.lang.Object] */
                        @Override // cm.InterfaceC2041a
                        /* JADX INFO: renamed from: E */
                        public final ComposeUiNode mo807E() {
                            return interfaceC2041a.mo807E();
                        }
                    });
                } else {
                    composerImplMo1636j.mo1653s();
                }
                C8573r0.m16714a1(composerImplMo1636j, textController.f2542d, ComposeUiNode.Companion.f3731e);
                C8573r0.m16714a1(composerImplMo1636j, interfaceC10015c2, ComposeUiNode.Companion.f3730d);
                C8573r0.m16714a1(composerImplMo1636j, layoutDirection, ComposeUiNode.Companion.f3732f);
                C8573r0.m16714a1(composerImplMo1636j, interfaceC0647n1, ComposeUiNode.Companion.f3733g);
                C8573r0.m16714a1(composerImplMo1636j, interfaceC0500bM1928b, ComposeUiNode.Companion.f3729c);
                composerImplMo1636j.m1609Q(true);
                composerImplMo1636j.m1609Q(false);
                composerImplMo1636j.m1609Q(false);
                z12 = z11;
                interfaceC0500b4 = interfaceC0500b3;
                interfaceC2052l3 = interfaceC2052l2;
                i31 = i29;
                i32 = i21;
                C7218l c7218l119 = c7218l2;
                i33 = i30;
                c7218l3 = c7218l119;
            } else {
                if (i34 != 0) {
                    interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                }
                if (i16 != 0) {
                    c7218l2 = C7218l.f40599c;
                }
                if (i18 != 0) {
                    interfaceC2052l2 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$1
                        @Override // cm.InterfaceC2052l
                        /* JADX INFO: renamed from: n */
                        public final C9072e mo528n(C7216j c7216j) {
                            C5207g.m11111f(c7216j, "it");
                            return C9072e.f47360a;
                        }
                    };
                }
                if (i20 != 0) {
                    i21 = 1;
                }
                if (i23 != 0) {
                    z11 = true;
                } else {
                    z11 = z10;
                }
                if (i25 != 0) {
                    i29 = Integer.MAX_VALUE;
                } else {
                    i29 = i11;
                }
                if (i27 != 0) {
                    i30 = 1;
                } else {
                    i30 = i12;
                }
                InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q117 = ComposerKt.f3003a;
                C8584v.m16781D(i30, i29);
                interfaceC0004c = (InterfaceC0004c) composerImplMo1636j.mo1648p(SelectionRegistrarKt.f2569a);
                C5304d1 c5304d117 = CompositionLocalsKt.f4137e;
                interfaceC10015c = (InterfaceC10015c) composerImplMo1636j.mo1648p(c5304d117);
                aVar = (AbstractC0696b.a) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4140h);
                composerImplMo1636j.mo1622c(959238681);
                if (interfaceC0004c == null) {
                    jLongValue = 0;
                } else {
                    jLongValue = ((Number) C0487a.m1860a(new Object[]{str, interfaceC0004c}, SaverKt.m1859a(new BasicTextKt$selectionIdSaver$1(interfaceC0004c), BasicTextKt$selectionIdSaver$2.f2523b), new InterfaceC2041a<Long>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$selectableId$1
                        {
                            super(0);
                        }

                        @Override // cm.InterfaceC2041a
                        /* JADX INFO: renamed from: E */
                        public final Long mo807E() {
                            return Long.valueOf(interfaceC0004c.m6b());
                        }
                    }, composerImplMo1636j, 4)).longValue();
                }
                j10 = jLongValue;
                composerImplMo1636j.m1609Q(false);
                composerImplMo1636j.mo1622c(-492369756);
                objM1619a0 = composerImplMo1636j.m1619a0();
                if (objM1619a0 == InterfaceC0476a.a.f3122a) {
                    objM1619a0 = new TextController(new TextState(new C10423b(new C0689a(str), c7218l2, i29, i30, z11, i21, interfaceC10015c, aVar), j10));
                    composerImplMo1636j.m1597F0(objM1619a0);
                }
                composerImplMo1636j.m1609Q(false);
                textController = (TextController) objM1619a0;
                textState = textController.f2539a;
                if (!composerImplMo1636j.f2897L) {
                    c10423b = textState.f2563d;
                    Pair<List<C0689a.b<C7213g>>, List<C0689a.b<InterfaceC2057q<String, InterfaceC0476a, Integer, C9072e>>>> pair117 = CoreTextKt.f2526a;
                    C5207g.m11111f(c10423b, "current");
                    C5207g.m11111f(c7218l2, "style");
                    C5207g.m11111f(interfaceC10015c, "density");
                    C5207g.m11111f(aVar, "fontFamilyResolver");
                    if (!C5207g.m11106a(c10423b.f52258a.f4523a, str)) {
                        c10423b = new C10423b(new C0689a(str), c7218l2, i29, i30, z11, i21, interfaceC10015c, aVar);
                    } else {
                        c10423b = new C10423b(new C0689a(str), c7218l2, i29, i30, z11, i21, interfaceC10015c, aVar);
                    }
                    textController.m1540f(c10423b);
                }
                textState.getClass();
                C5207g.m11111f(interfaceC2052l2, "<set-?>");
                textState.f2561b = interfaceC2052l2;
                textController.m1541g(interfaceC0004c);
                composerImplMo1636j.mo1622c(959240076);
                if (interfaceC0004c != null) {
                    long j1117 = ((C0005d) composerImplMo1636j.mo1648p(TextSelectionColorsKt.f2571a)).f3b;
                }
                composerImplMo1636j.m1609Q(false);
                interfaceC0500b3 = interfaceC0500b2;
                InterfaceC0500b interfaceC0500bMo1929K117 = interfaceC0500b3.mo1929K(textController.m1539e());
                composerImplMo1636j.mo1622c(544976794);
                interfaceC10015c2 = (InterfaceC10015c) composerImplMo1636j.mo1648p(c5304d117);
                layoutDirection = (LayoutDirection) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4143k);
                interfaceC0647n1 = (InterfaceC0647n1) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4148p);
                interfaceC0500bM1928b = ComposedModifierKt.m1928b(composerImplMo1636j, interfaceC0500bMo1929K117);
                ComposeUiNode.f3726n.getClass();
                interfaceC2041a = ComposeUiNode.Companion.f3728b;
                composerImplMo1636j.mo1622c(1405779621);
                if (!(composerImplMo1636j.f2910a instanceof InterfaceC5299c)) {
                    C8573r0.m16771y0();
                    throw null;
                }
                composerImplMo1636j.mo1640l();
                if (composerImplMo1636j.f2897L) {
                    composerImplMo1636j.mo1634i(new InterfaceC2041a<ComposeUiNode>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText-4YKlhWE$$inlined$Layout$1
                        {
                            super(0);
                        }

                        /* JADX WARN: Type inference failed for: r3v1, types: [androidx.compose.ui.node.ComposeUiNode, java.lang.Object] */
                        @Override // cm.InterfaceC2041a
                        /* JADX INFO: renamed from: E */
                        public final ComposeUiNode mo807E() {
                            return interfaceC2041a.mo807E();
                        }
                    });
                } else {
                    composerImplMo1636j.mo1653s();
                }
                C8573r0.m16714a1(composerImplMo1636j, textController.f2542d, ComposeUiNode.Companion.f3731e);
                C8573r0.m16714a1(composerImplMo1636j, interfaceC10015c2, ComposeUiNode.Companion.f3730d);
                C8573r0.m16714a1(composerImplMo1636j, layoutDirection, ComposeUiNode.Companion.f3732f);
                C8573r0.m16714a1(composerImplMo1636j, interfaceC0647n1, ComposeUiNode.Companion.f3733g);
                C8573r0.m16714a1(composerImplMo1636j, interfaceC0500bM1928b, ComposeUiNode.Companion.f3729c);
                composerImplMo1636j.m1609Q(true);
                composerImplMo1636j.m1609Q(false);
                composerImplMo1636j.m1609Q(false);
                z12 = z11;
                interfaceC0500b4 = interfaceC0500b3;
                interfaceC2052l3 = interfaceC2052l2;
                i31 = i29;
                i32 = i21;
                C7218l c7218l1110 = c7218l2;
                i33 = i30;
                c7218l3 = c7218l1110;
            }
            c5332q0M1612T = composerImplMo1636j.m1612T();
            if (c5332q0M1612T == null) {
                return;
            }
            c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // cm.InterfaceC2056p
                /* JADX INFO: renamed from: m0 */
                public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                    num.intValue();
                    BasicTextKt.m1531b(str, interfaceC0500b4, c7218l3, interfaceC2052l3, i32, z12, i31, i33, interfaceC0476a2, C8573r0.m16737l1(i13 | 1), i14);
                    return C9072e.f47360a;
                }
            };
        }
        i15 |= 3072;
        interfaceC2052l2 = interfaceC2052l;
        i20 = i14 & 16;
        if (i20 != 0) {
            if ((57344 & i13) == 0) {
                i21 = i10;
                if (composerImplMo1636j.m1594E(i21)) {
                    i22 = 16384;
                } else {
                    i22 = 8192;
                }
                i15 |= i22;
            }
            i23 = i14 & 32;
            if (i23 != 0) {
                i15 |= 196608;
            } else if ((i13 & 458752) == 0) {
                if (composerImplMo1636j.m1598G(z10)) {
                    i24 = 131072;
                } else {
                    i24 = 65536;
                }
                i15 |= i24;
            }
            i25 = i14 & 64;
            if (i25 != 0) {
                i15 |= 1572864;
            } else if ((i13 & 3670016) == 0) {
                if (composerImplMo1636j.m1594E(i11)) {
                    i26 = 1048576;
                } else {
                    i26 = 524288;
                }
                i15 |= i26;
            }
            i27 = i14 & BuildConfig.SDK_TRUNCATE_LENGTH;
            if (i27 != 0) {
                i15 |= 12582912;
            } else if ((i13 & 29360128) == 0) {
                if (composerImplMo1636j.m1594E(i12)) {
                    i28 = 8388608;
                } else {
                    i28 = 4194304;
                }
                i15 |= i28;
            }
            if ((i15 & 23967451) == 4793490) {
                if (i34 != 0) {
                    interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                }
                if (i16 != 0) {
                    c7218l2 = C7218l.f40599c;
                }
                if (i18 != 0) {
                    interfaceC2052l2 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$1
                        @Override // cm.InterfaceC2052l
                        /* JADX INFO: renamed from: n */
                        public final C9072e mo528n(C7216j c7216j) {
                            C5207g.m11111f(c7216j, "it");
                            return C9072e.f47360a;
                        }
                    };
                }
                if (i20 != 0) {
                    i21 = 1;
                }
                if (i23 != 0) {
                    z11 = true;
                } else {
                    z11 = z10;
                }
                if (i25 != 0) {
                    i29 = Integer.MAX_VALUE;
                } else {
                    i29 = i11;
                }
                if (i27 != 0) {
                    i30 = 1;
                } else {
                    i30 = i12;
                }
                InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q118 = ComposerKt.f3003a;
                C8584v.m16781D(i30, i29);
                interfaceC0004c = (InterfaceC0004c) composerImplMo1636j.mo1648p(SelectionRegistrarKt.f2569a);
                C5304d1 c5304d118 = CompositionLocalsKt.f4137e;
                interfaceC10015c = (InterfaceC10015c) composerImplMo1636j.mo1648p(c5304d118);
                aVar = (AbstractC0696b.a) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4140h);
                composerImplMo1636j.mo1622c(959238681);
                if (interfaceC0004c == null) {
                    jLongValue = 0;
                } else {
                    jLongValue = ((Number) C0487a.m1860a(new Object[]{str, interfaceC0004c}, SaverKt.m1859a(new BasicTextKt$selectionIdSaver$1(interfaceC0004c), BasicTextKt$selectionIdSaver$2.f2523b), new InterfaceC2041a<Long>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$selectableId$1
                        {
                            super(0);
                        }

                        @Override // cm.InterfaceC2041a
                        /* JADX INFO: renamed from: E */
                        public final Long mo807E() {
                            return Long.valueOf(interfaceC0004c.m6b());
                        }
                    }, composerImplMo1636j, 4)).longValue();
                }
                j10 = jLongValue;
                composerImplMo1636j.m1609Q(false);
                composerImplMo1636j.mo1622c(-492369756);
                objM1619a0 = composerImplMo1636j.m1619a0();
                if (objM1619a0 == InterfaceC0476a.a.f3122a) {
                    objM1619a0 = new TextController(new TextState(new C10423b(new C0689a(str), c7218l2, i29, i30, z11, i21, interfaceC10015c, aVar), j10));
                    composerImplMo1636j.m1597F0(objM1619a0);
                }
                composerImplMo1636j.m1609Q(false);
                textController = (TextController) objM1619a0;
                textState = textController.f2539a;
                if (!composerImplMo1636j.f2897L) {
                    c10423b = textState.f2563d;
                    Pair<List<C0689a.b<C7213g>>, List<C0689a.b<InterfaceC2057q<String, InterfaceC0476a, Integer, C9072e>>>> pair118 = CoreTextKt.f2526a;
                    C5207g.m11111f(c10423b, "current");
                    C5207g.m11111f(c7218l2, "style");
                    C5207g.m11111f(interfaceC10015c, "density");
                    C5207g.m11111f(aVar, "fontFamilyResolver");
                    if (!C5207g.m11106a(c10423b.f52258a.f4523a, str)) {
                        c10423b = new C10423b(new C0689a(str), c7218l2, i29, i30, z11, i21, interfaceC10015c, aVar);
                    } else {
                        c10423b = new C10423b(new C0689a(str), c7218l2, i29, i30, z11, i21, interfaceC10015c, aVar);
                    }
                    textController.m1540f(c10423b);
                }
                textState.getClass();
                C5207g.m11111f(interfaceC2052l2, "<set-?>");
                textState.f2561b = interfaceC2052l2;
                textController.m1541g(interfaceC0004c);
                composerImplMo1636j.mo1622c(959240076);
                if (interfaceC0004c != null) {
                    long j1118 = ((C0005d) composerImplMo1636j.mo1648p(TextSelectionColorsKt.f2571a)).f3b;
                }
                composerImplMo1636j.m1609Q(false);
                interfaceC0500b3 = interfaceC0500b2;
                InterfaceC0500b interfaceC0500bMo1929K118 = interfaceC0500b3.mo1929K(textController.m1539e());
                composerImplMo1636j.mo1622c(544976794);
                interfaceC10015c2 = (InterfaceC10015c) composerImplMo1636j.mo1648p(c5304d118);
                layoutDirection = (LayoutDirection) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4143k);
                interfaceC0647n1 = (InterfaceC0647n1) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4148p);
                interfaceC0500bM1928b = ComposedModifierKt.m1928b(composerImplMo1636j, interfaceC0500bMo1929K118);
                ComposeUiNode.f3726n.getClass();
                interfaceC2041a = ComposeUiNode.Companion.f3728b;
                composerImplMo1636j.mo1622c(1405779621);
                if (!(composerImplMo1636j.f2910a instanceof InterfaceC5299c)) {
                    C8573r0.m16771y0();
                    throw null;
                }
                composerImplMo1636j.mo1640l();
                if (composerImplMo1636j.f2897L) {
                    composerImplMo1636j.mo1634i(new InterfaceC2041a<ComposeUiNode>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText-4YKlhWE$$inlined$Layout$1
                        {
                            super(0);
                        }

                        /* JADX WARN: Type inference failed for: r3v1, types: [androidx.compose.ui.node.ComposeUiNode, java.lang.Object] */
                        @Override // cm.InterfaceC2041a
                        /* JADX INFO: renamed from: E */
                        public final ComposeUiNode mo807E() {
                            return interfaceC2041a.mo807E();
                        }
                    });
                } else {
                    composerImplMo1636j.mo1653s();
                }
                C8573r0.m16714a1(composerImplMo1636j, textController.f2542d, ComposeUiNode.Companion.f3731e);
                C8573r0.m16714a1(composerImplMo1636j, interfaceC10015c2, ComposeUiNode.Companion.f3730d);
                C8573r0.m16714a1(composerImplMo1636j, layoutDirection, ComposeUiNode.Companion.f3732f);
                C8573r0.m16714a1(composerImplMo1636j, interfaceC0647n1, ComposeUiNode.Companion.f3733g);
                C8573r0.m16714a1(composerImplMo1636j, interfaceC0500bM1928b, ComposeUiNode.Companion.f3729c);
                composerImplMo1636j.m1609Q(true);
                composerImplMo1636j.m1609Q(false);
                composerImplMo1636j.m1609Q(false);
                z12 = z11;
                interfaceC0500b4 = interfaceC0500b3;
                interfaceC2052l3 = interfaceC2052l2;
                i31 = i29;
                i32 = i21;
                C7218l c7218l1111 = c7218l2;
                i33 = i30;
                c7218l3 = c7218l1111;
            } else {
                if (i34 != 0) {
                    interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                }
                if (i16 != 0) {
                    c7218l2 = C7218l.f40599c;
                }
                if (i18 != 0) {
                    interfaceC2052l2 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$1
                        @Override // cm.InterfaceC2052l
                        /* JADX INFO: renamed from: n */
                        public final C9072e mo528n(C7216j c7216j) {
                            C5207g.m11111f(c7216j, "it");
                            return C9072e.f47360a;
                        }
                    };
                }
                if (i20 != 0) {
                    i21 = 1;
                }
                if (i23 != 0) {
                    z11 = true;
                } else {
                    z11 = z10;
                }
                if (i25 != 0) {
                    i29 = Integer.MAX_VALUE;
                } else {
                    i29 = i11;
                }
                if (i27 != 0) {
                    i30 = 1;
                } else {
                    i30 = i12;
                }
                InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q119 = ComposerKt.f3003a;
                C8584v.m16781D(i30, i29);
                interfaceC0004c = (InterfaceC0004c) composerImplMo1636j.mo1648p(SelectionRegistrarKt.f2569a);
                C5304d1 c5304d119 = CompositionLocalsKt.f4137e;
                interfaceC10015c = (InterfaceC10015c) composerImplMo1636j.mo1648p(c5304d119);
                aVar = (AbstractC0696b.a) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4140h);
                composerImplMo1636j.mo1622c(959238681);
                if (interfaceC0004c == null) {
                    jLongValue = 0;
                } else {
                    jLongValue = ((Number) C0487a.m1860a(new Object[]{str, interfaceC0004c}, SaverKt.m1859a(new BasicTextKt$selectionIdSaver$1(interfaceC0004c), BasicTextKt$selectionIdSaver$2.f2523b), new InterfaceC2041a<Long>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$selectableId$1
                        {
                            super(0);
                        }

                        @Override // cm.InterfaceC2041a
                        /* JADX INFO: renamed from: E */
                        public final Long mo807E() {
                            return Long.valueOf(interfaceC0004c.m6b());
                        }
                    }, composerImplMo1636j, 4)).longValue();
                }
                j10 = jLongValue;
                composerImplMo1636j.m1609Q(false);
                composerImplMo1636j.mo1622c(-492369756);
                objM1619a0 = composerImplMo1636j.m1619a0();
                if (objM1619a0 == InterfaceC0476a.a.f3122a) {
                    objM1619a0 = new TextController(new TextState(new C10423b(new C0689a(str), c7218l2, i29, i30, z11, i21, interfaceC10015c, aVar), j10));
                    composerImplMo1636j.m1597F0(objM1619a0);
                }
                composerImplMo1636j.m1609Q(false);
                textController = (TextController) objM1619a0;
                textState = textController.f2539a;
                if (!composerImplMo1636j.f2897L) {
                    c10423b = textState.f2563d;
                    Pair<List<C0689a.b<C7213g>>, List<C0689a.b<InterfaceC2057q<String, InterfaceC0476a, Integer, C9072e>>>> pair119 = CoreTextKt.f2526a;
                    C5207g.m11111f(c10423b, "current");
                    C5207g.m11111f(c7218l2, "style");
                    C5207g.m11111f(interfaceC10015c, "density");
                    C5207g.m11111f(aVar, "fontFamilyResolver");
                    if (!C5207g.m11106a(c10423b.f52258a.f4523a, str)) {
                        c10423b = new C10423b(new C0689a(str), c7218l2, i29, i30, z11, i21, interfaceC10015c, aVar);
                    } else {
                        c10423b = new C10423b(new C0689a(str), c7218l2, i29, i30, z11, i21, interfaceC10015c, aVar);
                    }
                    textController.m1540f(c10423b);
                }
                textState.getClass();
                C5207g.m11111f(interfaceC2052l2, "<set-?>");
                textState.f2561b = interfaceC2052l2;
                textController.m1541g(interfaceC0004c);
                composerImplMo1636j.mo1622c(959240076);
                if (interfaceC0004c != null) {
                    long j1119 = ((C0005d) composerImplMo1636j.mo1648p(TextSelectionColorsKt.f2571a)).f3b;
                }
                composerImplMo1636j.m1609Q(false);
                interfaceC0500b3 = interfaceC0500b2;
                InterfaceC0500b interfaceC0500bMo1929K119 = interfaceC0500b3.mo1929K(textController.m1539e());
                composerImplMo1636j.mo1622c(544976794);
                interfaceC10015c2 = (InterfaceC10015c) composerImplMo1636j.mo1648p(c5304d119);
                layoutDirection = (LayoutDirection) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4143k);
                interfaceC0647n1 = (InterfaceC0647n1) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4148p);
                interfaceC0500bM1928b = ComposedModifierKt.m1928b(composerImplMo1636j, interfaceC0500bMo1929K119);
                ComposeUiNode.f3726n.getClass();
                interfaceC2041a = ComposeUiNode.Companion.f3728b;
                composerImplMo1636j.mo1622c(1405779621);
                if (!(composerImplMo1636j.f2910a instanceof InterfaceC5299c)) {
                    C8573r0.m16771y0();
                    throw null;
                }
                composerImplMo1636j.mo1640l();
                if (composerImplMo1636j.f2897L) {
                    composerImplMo1636j.mo1634i(new InterfaceC2041a<ComposeUiNode>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText-4YKlhWE$$inlined$Layout$1
                        {
                            super(0);
                        }

                        /* JADX WARN: Type inference failed for: r3v1, types: [androidx.compose.ui.node.ComposeUiNode, java.lang.Object] */
                        @Override // cm.InterfaceC2041a
                        /* JADX INFO: renamed from: E */
                        public final ComposeUiNode mo807E() {
                            return interfaceC2041a.mo807E();
                        }
                    });
                } else {
                    composerImplMo1636j.mo1653s();
                }
                C8573r0.m16714a1(composerImplMo1636j, textController.f2542d, ComposeUiNode.Companion.f3731e);
                C8573r0.m16714a1(composerImplMo1636j, interfaceC10015c2, ComposeUiNode.Companion.f3730d);
                C8573r0.m16714a1(composerImplMo1636j, layoutDirection, ComposeUiNode.Companion.f3732f);
                C8573r0.m16714a1(composerImplMo1636j, interfaceC0647n1, ComposeUiNode.Companion.f3733g);
                C8573r0.m16714a1(composerImplMo1636j, interfaceC0500bM1928b, ComposeUiNode.Companion.f3729c);
                composerImplMo1636j.m1609Q(true);
                composerImplMo1636j.m1609Q(false);
                composerImplMo1636j.m1609Q(false);
                z12 = z11;
                interfaceC0500b4 = interfaceC0500b3;
                interfaceC2052l3 = interfaceC2052l2;
                i31 = i29;
                i32 = i21;
                C7218l c7218l1112 = c7218l2;
                i33 = i30;
                c7218l3 = c7218l1112;
            }
            c5332q0M1612T = composerImplMo1636j.m1612T();
            if (c5332q0M1612T == null) {
                return;
            }
            c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // cm.InterfaceC2056p
                /* JADX INFO: renamed from: m0 */
                public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                    num.intValue();
                    BasicTextKt.m1531b(str, interfaceC0500b4, c7218l3, interfaceC2052l3, i32, z12, i31, i33, interfaceC0476a2, C8573r0.m16737l1(i13 | 1), i14);
                    return C9072e.f47360a;
                }
            };
        }
        i15 |= 24576;
        i21 = i10;
        i23 = i14 & 32;
        if (i23 != 0) {
            i15 |= 196608;
        } else if ((i13 & 458752) == 0) {
            if (composerImplMo1636j.m1598G(z10)) {
                i24 = 131072;
            } else {
                i24 = 65536;
            }
            i15 |= i24;
        }
        i25 = i14 & 64;
        if (i25 != 0) {
            i15 |= 1572864;
        } else if ((i13 & 3670016) == 0) {
            if (composerImplMo1636j.m1594E(i11)) {
                i26 = 1048576;
            } else {
                i26 = 524288;
            }
            i15 |= i26;
        }
        i27 = i14 & BuildConfig.SDK_TRUNCATE_LENGTH;
        if (i27 != 0) {
            i15 |= 12582912;
        } else if ((i13 & 29360128) == 0) {
            if (composerImplMo1636j.m1594E(i12)) {
                i28 = 8388608;
            } else {
                i28 = 4194304;
            }
            i15 |= i28;
        }
        if ((i15 & 23967451) == 4793490) {
            if (i34 != 0) {
                interfaceC0500b2 = InterfaceC0500b.a.f3325a;
            }
            if (i16 != 0) {
                c7218l2 = C7218l.f40599c;
            }
            if (i18 != 0) {
                interfaceC2052l2 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$1
                    @Override // cm.InterfaceC2052l
                    /* JADX INFO: renamed from: n */
                    public final C9072e mo528n(C7216j c7216j) {
                        C5207g.m11111f(c7216j, "it");
                        return C9072e.f47360a;
                    }
                };
            }
            if (i20 != 0) {
                i21 = 1;
            }
            if (i23 != 0) {
                z11 = true;
            } else {
                z11 = z10;
            }
            if (i25 != 0) {
                i29 = Integer.MAX_VALUE;
            } else {
                i29 = i11;
            }
            if (i27 != 0) {
                i30 = 1;
            } else {
                i30 = i12;
            }
            InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q1110 = ComposerKt.f3003a;
            C8584v.m16781D(i30, i29);
            interfaceC0004c = (InterfaceC0004c) composerImplMo1636j.mo1648p(SelectionRegistrarKt.f2569a);
            C5304d1 c5304d1110 = CompositionLocalsKt.f4137e;
            interfaceC10015c = (InterfaceC10015c) composerImplMo1636j.mo1648p(c5304d1110);
            aVar = (AbstractC0696b.a) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4140h);
            composerImplMo1636j.mo1622c(959238681);
            if (interfaceC0004c == null) {
                jLongValue = 0;
            } else {
                jLongValue = ((Number) C0487a.m1860a(new Object[]{str, interfaceC0004c}, SaverKt.m1859a(new BasicTextKt$selectionIdSaver$1(interfaceC0004c), BasicTextKt$selectionIdSaver$2.f2523b), new InterfaceC2041a<Long>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$selectableId$1
                    {
                        super(0);
                    }

                    @Override // cm.InterfaceC2041a
                    /* JADX INFO: renamed from: E */
                    public final Long mo807E() {
                        return Long.valueOf(interfaceC0004c.m6b());
                    }
                }, composerImplMo1636j, 4)).longValue();
            }
            j10 = jLongValue;
            composerImplMo1636j.m1609Q(false);
            composerImplMo1636j.mo1622c(-492369756);
            objM1619a0 = composerImplMo1636j.m1619a0();
            if (objM1619a0 == InterfaceC0476a.a.f3122a) {
                objM1619a0 = new TextController(new TextState(new C10423b(new C0689a(str), c7218l2, i29, i30, z11, i21, interfaceC10015c, aVar), j10));
                composerImplMo1636j.m1597F0(objM1619a0);
            }
            composerImplMo1636j.m1609Q(false);
            textController = (TextController) objM1619a0;
            textState = textController.f2539a;
            if (!composerImplMo1636j.f2897L) {
                c10423b = textState.f2563d;
                Pair<List<C0689a.b<C7213g>>, List<C0689a.b<InterfaceC2057q<String, InterfaceC0476a, Integer, C9072e>>>> pair1110 = CoreTextKt.f2526a;
                C5207g.m11111f(c10423b, "current");
                C5207g.m11111f(c7218l2, "style");
                C5207g.m11111f(interfaceC10015c, "density");
                C5207g.m11111f(aVar, "fontFamilyResolver");
                if (!C5207g.m11106a(c10423b.f52258a.f4523a, str)) {
                    c10423b = new C10423b(new C0689a(str), c7218l2, i29, i30, z11, i21, interfaceC10015c, aVar);
                } else {
                    c10423b = new C10423b(new C0689a(str), c7218l2, i29, i30, z11, i21, interfaceC10015c, aVar);
                }
                textController.m1540f(c10423b);
            }
            textState.getClass();
            C5207g.m11111f(interfaceC2052l2, "<set-?>");
            textState.f2561b = interfaceC2052l2;
            textController.m1541g(interfaceC0004c);
            composerImplMo1636j.mo1622c(959240076);
            if (interfaceC0004c != null) {
                long j11110 = ((C0005d) composerImplMo1636j.mo1648p(TextSelectionColorsKt.f2571a)).f3b;
            }
            composerImplMo1636j.m1609Q(false);
            interfaceC0500b3 = interfaceC0500b2;
            InterfaceC0500b interfaceC0500bMo1929K1110 = interfaceC0500b3.mo1929K(textController.m1539e());
            composerImplMo1636j.mo1622c(544976794);
            interfaceC10015c2 = (InterfaceC10015c) composerImplMo1636j.mo1648p(c5304d1110);
            layoutDirection = (LayoutDirection) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4143k);
            interfaceC0647n1 = (InterfaceC0647n1) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4148p);
            interfaceC0500bM1928b = ComposedModifierKt.m1928b(composerImplMo1636j, interfaceC0500bMo1929K1110);
            ComposeUiNode.f3726n.getClass();
            interfaceC2041a = ComposeUiNode.Companion.f3728b;
            composerImplMo1636j.mo1622c(1405779621);
            if (!(composerImplMo1636j.f2910a instanceof InterfaceC5299c)) {
                C8573r0.m16771y0();
                throw null;
            }
            composerImplMo1636j.mo1640l();
            if (composerImplMo1636j.f2897L) {
                composerImplMo1636j.mo1634i(new InterfaceC2041a<ComposeUiNode>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText-4YKlhWE$$inlined$Layout$1
                    {
                        super(0);
                    }

                    /* JADX WARN: Type inference failed for: r3v1, types: [androidx.compose.ui.node.ComposeUiNode, java.lang.Object] */
                    @Override // cm.InterfaceC2041a
                    /* JADX INFO: renamed from: E */
                    public final ComposeUiNode mo807E() {
                        return interfaceC2041a.mo807E();
                    }
                });
            } else {
                composerImplMo1636j.mo1653s();
            }
            C8573r0.m16714a1(composerImplMo1636j, textController.f2542d, ComposeUiNode.Companion.f3731e);
            C8573r0.m16714a1(composerImplMo1636j, interfaceC10015c2, ComposeUiNode.Companion.f3730d);
            C8573r0.m16714a1(composerImplMo1636j, layoutDirection, ComposeUiNode.Companion.f3732f);
            C8573r0.m16714a1(composerImplMo1636j, interfaceC0647n1, ComposeUiNode.Companion.f3733g);
            C8573r0.m16714a1(composerImplMo1636j, interfaceC0500bM1928b, ComposeUiNode.Companion.f3729c);
            composerImplMo1636j.m1609Q(true);
            composerImplMo1636j.m1609Q(false);
            composerImplMo1636j.m1609Q(false);
            z12 = z11;
            interfaceC0500b4 = interfaceC0500b3;
            interfaceC2052l3 = interfaceC2052l2;
            i31 = i29;
            i32 = i21;
            C7218l c7218l1113 = c7218l2;
            i33 = i30;
            c7218l3 = c7218l1113;
        } else {
            if (i34 != 0) {
                interfaceC0500b2 = InterfaceC0500b.a.f3325a;
            }
            if (i16 != 0) {
                c7218l2 = C7218l.f40599c;
            }
            if (i18 != 0) {
                interfaceC2052l2 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$1
                    @Override // cm.InterfaceC2052l
                    /* JADX INFO: renamed from: n */
                    public final C9072e mo528n(C7216j c7216j) {
                        C5207g.m11111f(c7216j, "it");
                        return C9072e.f47360a;
                    }
                };
            }
            if (i20 != 0) {
                i21 = 1;
            }
            if (i23 != 0) {
                z11 = true;
            } else {
                z11 = z10;
            }
            if (i25 != 0) {
                i29 = Integer.MAX_VALUE;
            } else {
                i29 = i11;
            }
            if (i27 != 0) {
                i30 = 1;
            } else {
                i30 = i12;
            }
            InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q1111 = ComposerKt.f3003a;
            C8584v.m16781D(i30, i29);
            interfaceC0004c = (InterfaceC0004c) composerImplMo1636j.mo1648p(SelectionRegistrarKt.f2569a);
            C5304d1 c5304d1111 = CompositionLocalsKt.f4137e;
            interfaceC10015c = (InterfaceC10015c) composerImplMo1636j.mo1648p(c5304d1111);
            aVar = (AbstractC0696b.a) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4140h);
            composerImplMo1636j.mo1622c(959238681);
            if (interfaceC0004c == null) {
                jLongValue = 0;
            } else {
                jLongValue = ((Number) C0487a.m1860a(new Object[]{str, interfaceC0004c}, SaverKt.m1859a(new BasicTextKt$selectionIdSaver$1(interfaceC0004c), BasicTextKt$selectionIdSaver$2.f2523b), new InterfaceC2041a<Long>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$selectableId$1
                    {
                        super(0);
                    }

                    @Override // cm.InterfaceC2041a
                    /* JADX INFO: renamed from: E */
                    public final Long mo807E() {
                        return Long.valueOf(interfaceC0004c.m6b());
                    }
                }, composerImplMo1636j, 4)).longValue();
            }
            j10 = jLongValue;
            composerImplMo1636j.m1609Q(false);
            composerImplMo1636j.mo1622c(-492369756);
            objM1619a0 = composerImplMo1636j.m1619a0();
            if (objM1619a0 == InterfaceC0476a.a.f3122a) {
                objM1619a0 = new TextController(new TextState(new C10423b(new C0689a(str), c7218l2, i29, i30, z11, i21, interfaceC10015c, aVar), j10));
                composerImplMo1636j.m1597F0(objM1619a0);
            }
            composerImplMo1636j.m1609Q(false);
            textController = (TextController) objM1619a0;
            textState = textController.f2539a;
            if (!composerImplMo1636j.f2897L) {
                c10423b = textState.f2563d;
                Pair<List<C0689a.b<C7213g>>, List<C0689a.b<InterfaceC2057q<String, InterfaceC0476a, Integer, C9072e>>>> pair1111 = CoreTextKt.f2526a;
                C5207g.m11111f(c10423b, "current");
                C5207g.m11111f(c7218l2, "style");
                C5207g.m11111f(interfaceC10015c, "density");
                C5207g.m11111f(aVar, "fontFamilyResolver");
                if (!C5207g.m11106a(c10423b.f52258a.f4523a, str)) {
                    c10423b = new C10423b(new C0689a(str), c7218l2, i29, i30, z11, i21, interfaceC10015c, aVar);
                } else {
                    c10423b = new C10423b(new C0689a(str), c7218l2, i29, i30, z11, i21, interfaceC10015c, aVar);
                }
                textController.m1540f(c10423b);
            }
            textState.getClass();
            C5207g.m11111f(interfaceC2052l2, "<set-?>");
            textState.f2561b = interfaceC2052l2;
            textController.m1541g(interfaceC0004c);
            composerImplMo1636j.mo1622c(959240076);
            if (interfaceC0004c != null) {
                long j11111 = ((C0005d) composerImplMo1636j.mo1648p(TextSelectionColorsKt.f2571a)).f3b;
            }
            composerImplMo1636j.m1609Q(false);
            interfaceC0500b3 = interfaceC0500b2;
            InterfaceC0500b interfaceC0500bMo1929K1111 = interfaceC0500b3.mo1929K(textController.m1539e());
            composerImplMo1636j.mo1622c(544976794);
            interfaceC10015c2 = (InterfaceC10015c) composerImplMo1636j.mo1648p(c5304d1111);
            layoutDirection = (LayoutDirection) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4143k);
            interfaceC0647n1 = (InterfaceC0647n1) composerImplMo1636j.mo1648p(CompositionLocalsKt.f4148p);
            interfaceC0500bM1928b = ComposedModifierKt.m1928b(composerImplMo1636j, interfaceC0500bMo1929K1111);
            ComposeUiNode.f3726n.getClass();
            interfaceC2041a = ComposeUiNode.Companion.f3728b;
            composerImplMo1636j.mo1622c(1405779621);
            if (!(composerImplMo1636j.f2910a instanceof InterfaceC5299c)) {
                C8573r0.m16771y0();
                throw null;
            }
            composerImplMo1636j.mo1640l();
            if (composerImplMo1636j.f2897L) {
                composerImplMo1636j.mo1634i(new InterfaceC2041a<ComposeUiNode>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText-4YKlhWE$$inlined$Layout$1
                    {
                        super(0);
                    }

                    /* JADX WARN: Type inference failed for: r3v1, types: [androidx.compose.ui.node.ComposeUiNode, java.lang.Object] */
                    @Override // cm.InterfaceC2041a
                    /* JADX INFO: renamed from: E */
                    public final ComposeUiNode mo807E() {
                        return interfaceC2041a.mo807E();
                    }
                });
            } else {
                composerImplMo1636j.mo1653s();
            }
            C8573r0.m16714a1(composerImplMo1636j, textController.f2542d, ComposeUiNode.Companion.f3731e);
            C8573r0.m16714a1(composerImplMo1636j, interfaceC10015c2, ComposeUiNode.Companion.f3730d);
            C8573r0.m16714a1(composerImplMo1636j, layoutDirection, ComposeUiNode.Companion.f3732f);
            C8573r0.m16714a1(composerImplMo1636j, interfaceC0647n1, ComposeUiNode.Companion.f3733g);
            C8573r0.m16714a1(composerImplMo1636j, interfaceC0500bM1928b, ComposeUiNode.Companion.f3729c);
            composerImplMo1636j.m1609Q(true);
            composerImplMo1636j.m1609Q(false);
            composerImplMo1636j.m1609Q(false);
            z12 = z11;
            interfaceC0500b4 = interfaceC0500b3;
            interfaceC2052l3 = interfaceC2052l2;
            i31 = i29;
            i32 = i21;
            C7218l c7218l1114 = c7218l2;
            i33 = i30;
            c7218l3 = c7218l1114;
        }
        c5332q0M1612T = composerImplMo1636j.m1612T();
        if (c5332q0M1612T == null) {
            return;
        }
        c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // cm.InterfaceC2056p
            /* JADX INFO: renamed from: m0 */
            public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                num.intValue();
                BasicTextKt.m1531b(str, interfaceC0500b4, c7218l3, interfaceC2052l3, i32, z12, i31, i33, interfaceC0476a2, C8573r0.m16737l1(i13 | 1), i14);
                return C9072e.f47360a;
            }
        };
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0126  */
    /* JADX WARN: Code duplicated, block: B:105:0x016b  */
    /* JADX WARN: Code duplicated, block: B:107:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x004a  */
    /* JADX WARN: Code duplicated, block: B:27:0x004d  */
    /* JADX WARN: Code duplicated, block: B:29:0x0051  */
    /* JADX WARN: Code duplicated, block: B:31:0x0059  */
    /* JADX WARN: Code duplicated, block: B:32:0x005c  */
    /* JADX WARN: Code duplicated, block: B:37:0x0066  */
    /* JADX WARN: Code duplicated, block: B:38:0x0069  */
    /* JADX WARN: Code duplicated, block: B:40:0x006d  */
    /* JADX WARN: Code duplicated, block: B:42:0x0075  */
    /* JADX WARN: Code duplicated, block: B:43:0x0078  */
    /* JADX WARN: Code duplicated, block: B:48:0x0085  */
    /* JADX WARN: Code duplicated, block: B:49:0x0088  */
    /* JADX WARN: Code duplicated, block: B:51:0x008c  */
    /* JADX WARN: Code duplicated, block: B:53:0x0094  */
    /* JADX WARN: Code duplicated, block: B:54:0x0099  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:62:0x00af  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:71:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:75:0x00da  */
    /* JADX WARN: Code duplicated, block: B:76:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:80:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:84:0x00fe A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:85:0x0100  */
    /* JADX WARN: Code duplicated, block: B:86:0x0105  */
    /* JADX WARN: Code duplicated, block: B:88:0x0109  */
    /* JADX WARN: Code duplicated, block: B:89:0x010e  */
    /* JADX WARN: Code duplicated, block: B:91:0x0112  */
    /* JADX WARN: Code duplicated, block: B:92:0x0117  */
    /* JADX WARN: Code duplicated, block: B:95:0x011c  */
    /* JADX WARN: Code duplicated, block: B:96:0x011f  */
    /* JADX WARN: Code duplicated, block: B:98:0x0123  */
    /* JADX INFO: renamed from: c */
    public static final void m1532c(final String str, InterfaceC0500b interfaceC0500b, C7218l c7218l, InterfaceC2052l interfaceC2052l, int i10, boolean z10, int i11, InterfaceC0476a interfaceC0476a, final int i12, final int i13) {
        int i14;
        int i15;
        C7218l c7218l2;
        int i16;
        int i17;
        InterfaceC2052l interfaceC2052l2;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        boolean z11;
        int i23;
        int i24;
        int i25;
        int i26;
        InterfaceC0500b interfaceC0500b2;
        C7218l c7218l3;
        InterfaceC2052l interfaceC2052l3;
        int i27;
        final int i28;
        final boolean z12;
        final InterfaceC0500b interfaceC0500b3;
        final C7218l c7218l4;
        final InterfaceC2052l interfaceC2052l4;
        final int i29;
        C5332q0 c5332q0M1612T;
        C5207g.m11111f(str, "text");
        ComposerImpl composerImplMo1636j = interfaceC0476a.mo1636j(1022429478);
        if ((i13 & 1) != 0) {
            i14 = i12 | 6;
        } else if ((i12 & 14) == 0) {
            i14 = (composerImplMo1636j.mo1665y(str) ? 4 : 2) | i12;
        } else {
            i14 = i12;
        }
        int i30 = i13 & 2;
        if (i30 == 0) {
            if ((i12 & 112) == 0) {
                i14 |= composerImplMo1636j.mo1665y(interfaceC0500b) ? 32 : 16;
            }
            i15 = i13 & 4;
            if (i15 != 0) {
                if ((i12 & 896) == 0) {
                    c7218l2 = c7218l;
                    if (composerImplMo1636j.mo1665y(c7218l2)) {
                        i16 = 256;
                    } else {
                        i16 = BuildConfig.SDK_TRUNCATE_LENGTH;
                    }
                    i14 |= i16;
                }
                i17 = i13 & 8;
                if (i17 != 0) {
                    if ((i12 & 7168) == 0) {
                        interfaceC2052l2 = interfaceC2052l;
                        if (composerImplMo1636j.m1600H(interfaceC2052l2)) {
                            i18 = 2048;
                        } else {
                            i18 = 1024;
                        }
                        i14 |= i18;
                    }
                    i19 = i13 & 16;
                    if (i19 != 0) {
                        if ((i12 & 57344) == 0) {
                            i20 = i10;
                            if (composerImplMo1636j.m1594E(i20)) {
                                i21 = 16384;
                            } else {
                                i21 = 8192;
                            }
                            i14 |= i21;
                        }
                        i22 = i13 & 32;
                        if (i22 != 0) {
                            if ((i12 & 458752) == 0) {
                                z11 = z10;
                                if (composerImplMo1636j.m1598G(z11)) {
                                    i23 = 131072;
                                } else {
                                    i23 = 65536;
                                }
                                i14 |= i23;
                            }
                            i24 = i13 & 64;
                            if (i24 != 0) {
                                i14 |= 1572864;
                                i25 = i11;
                            } else {
                                i25 = i11;
                                if ((i12 & 3670016) == 0) {
                                    if (composerImplMo1636j.m1594E(i25)) {
                                        i26 = 1048576;
                                    } else {
                                        i26 = 524288;
                                    }
                                    i14 |= i26;
                                }
                            }
                            if ((i14 & 2995931) == 599186 || !composerImplMo1636j.mo1642m()) {
                                if (i30 != 0) {
                                    interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                                } else {
                                    interfaceC0500b2 = interfaceC0500b;
                                }
                                if (i15 != 0) {
                                    c7218l3 = C7218l.f40599c;
                                } else {
                                    c7218l3 = c7218l2;
                                }
                                if (i17 != 0) {
                                    interfaceC2052l3 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$6
                                        @Override // cm.InterfaceC2052l
                                        /* JADX INFO: renamed from: n */
                                        public final C9072e mo528n(C7216j c7216j) {
                                            C5207g.m11111f(c7216j, "it");
                                            return C9072e.f47360a;
                                        }
                                    };
                                } else {
                                    interfaceC2052l3 = interfaceC2052l2;
                                }
                                if (i19 != 0) {
                                    i27 = 1;
                                } else {
                                    i27 = i20;
                                }
                                if (i22 != 0) {
                                    z11 = true;
                                }
                                if (i24 != 0) {
                                    i25 = Integer.MAX_VALUE;
                                }
                                InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q = ComposerKt.f3003a;
                                m1531b(str, interfaceC0500b2, c7218l3, interfaceC2052l3, i27, z11, i25, 1, composerImplMo1636j, 12582912 | (i14 & 14) | (i14 & 112) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (458752 & i14) | (i14 & 3670016), 0);
                                i28 = i25;
                                z12 = z11;
                                interfaceC0500b3 = interfaceC0500b2;
                                c7218l4 = c7218l3;
                                interfaceC2052l4 = interfaceC2052l3;
                                i29 = i27;
                            } else {
                                composerImplMo1636j.mo1650q();
                                interfaceC0500b3 = interfaceC0500b;
                                c7218l4 = c7218l2;
                                interfaceC2052l4 = interfaceC2052l2;
                                i29 = i20;
                                i28 = i25;
                                z12 = z11;
                            }
                            c5332q0M1612T = composerImplMo1636j.m1612T();
                            if (c5332q0M1612T == null) {
                                return;
                            }
                            c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$7
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // cm.InterfaceC2056p
                                /* JADX INFO: renamed from: m0 */
                                public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                                    num.intValue();
                                    BasicTextKt.m1532c(str, interfaceC0500b3, c7218l4, interfaceC2052l4, i29, z12, i28, interfaceC0476a2, C8573r0.m16737l1(i12 | 1), i13);
                                    return C9072e.f47360a;
                                }
                            };
                        }
                        i14 |= 196608;
                        z11 = z10;
                        i24 = i13 & 64;
                        if (i24 != 0) {
                            i14 |= 1572864;
                            i25 = i11;
                        } else {
                            i25 = i11;
                            if ((i12 & 3670016) == 0) {
                                if (composerImplMo1636j.m1594E(i25)) {
                                    i26 = 1048576;
                                } else {
                                    i26 = 524288;
                                }
                                i14 |= i26;
                            }
                        }
                        if ((i14 & 2995931) == 599186) {
                            if (i30 != 0) {
                                interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                            } else {
                                interfaceC0500b2 = interfaceC0500b;
                            }
                            if (i15 != 0) {
                                c7218l3 = C7218l.f40599c;
                            } else {
                                c7218l3 = c7218l2;
                            }
                            if (i17 != 0) {
                                interfaceC2052l3 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$6
                                    @Override // cm.InterfaceC2052l
                                    /* JADX INFO: renamed from: n */
                                    public final C9072e mo528n(C7216j c7216j) {
                                        C5207g.m11111f(c7216j, "it");
                                        return C9072e.f47360a;
                                    }
                                };
                            } else {
                                interfaceC2052l3 = interfaceC2052l2;
                            }
                            if (i19 != 0) {
                                i27 = 1;
                            } else {
                                i27 = i20;
                            }
                            if (i22 != 0) {
                                z11 = true;
                            }
                            if (i24 != 0) {
                                i25 = Integer.MAX_VALUE;
                            }
                            InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q2 = ComposerKt.f3003a;
                            m1531b(str, interfaceC0500b2, c7218l3, interfaceC2052l3, i27, z11, i25, 1, composerImplMo1636j, 12582912 | (i14 & 14) | (i14 & 112) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (458752 & i14) | (i14 & 3670016), 0);
                            i28 = i25;
                            z12 = z11;
                            interfaceC0500b3 = interfaceC0500b2;
                            c7218l4 = c7218l3;
                            interfaceC2052l4 = interfaceC2052l3;
                            i29 = i27;
                        } else {
                            if (i30 != 0) {
                                interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                            } else {
                                interfaceC0500b2 = interfaceC0500b;
                            }
                            if (i15 != 0) {
                                c7218l3 = C7218l.f40599c;
                            } else {
                                c7218l3 = c7218l2;
                            }
                            if (i17 != 0) {
                                interfaceC2052l3 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$6
                                    @Override // cm.InterfaceC2052l
                                    /* JADX INFO: renamed from: n */
                                    public final C9072e mo528n(C7216j c7216j) {
                                        C5207g.m11111f(c7216j, "it");
                                        return C9072e.f47360a;
                                    }
                                };
                            } else {
                                interfaceC2052l3 = interfaceC2052l2;
                            }
                            if (i19 != 0) {
                                i27 = 1;
                            } else {
                                i27 = i20;
                            }
                            if (i22 != 0) {
                                z11 = true;
                            }
                            if (i24 != 0) {
                                i25 = Integer.MAX_VALUE;
                            }
                            InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q3 = ComposerKt.f3003a;
                            m1531b(str, interfaceC0500b2, c7218l3, interfaceC2052l3, i27, z11, i25, 1, composerImplMo1636j, 12582912 | (i14 & 14) | (i14 & 112) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (458752 & i14) | (i14 & 3670016), 0);
                            i28 = i25;
                            z12 = z11;
                            interfaceC0500b3 = interfaceC0500b2;
                            c7218l4 = c7218l3;
                            interfaceC2052l4 = interfaceC2052l3;
                            i29 = i27;
                        }
                        c5332q0M1612T = composerImplMo1636j.m1612T();
                        if (c5332q0M1612T == null) {
                            return;
                        }
                        c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$7
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                                num.intValue();
                                BasicTextKt.m1532c(str, interfaceC0500b3, c7218l4, interfaceC2052l4, i29, z12, i28, interfaceC0476a2, C8573r0.m16737l1(i12 | 1), i13);
                                return C9072e.f47360a;
                            }
                        };
                    }
                    i14 |= 24576;
                    i20 = i10;
                    i22 = i13 & 32;
                    if (i22 != 0) {
                        if ((i12 & 458752) == 0) {
                            z11 = z10;
                            if (composerImplMo1636j.m1598G(z11)) {
                                i23 = 131072;
                            } else {
                                i23 = 65536;
                            }
                            i14 |= i23;
                        }
                        i24 = i13 & 64;
                        if (i24 != 0) {
                            i14 |= 1572864;
                            i25 = i11;
                        } else {
                            i25 = i11;
                            if ((i12 & 3670016) == 0) {
                                if (composerImplMo1636j.m1594E(i25)) {
                                    i26 = 1048576;
                                } else {
                                    i26 = 524288;
                                }
                                i14 |= i26;
                            }
                        }
                        if ((i14 & 2995931) == 599186) {
                            if (i30 != 0) {
                                interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                            } else {
                                interfaceC0500b2 = interfaceC0500b;
                            }
                            if (i15 != 0) {
                                c7218l3 = C7218l.f40599c;
                            } else {
                                c7218l3 = c7218l2;
                            }
                            if (i17 != 0) {
                                interfaceC2052l3 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$6
                                    @Override // cm.InterfaceC2052l
                                    /* JADX INFO: renamed from: n */
                                    public final C9072e mo528n(C7216j c7216j) {
                                        C5207g.m11111f(c7216j, "it");
                                        return C9072e.f47360a;
                                    }
                                };
                            } else {
                                interfaceC2052l3 = interfaceC2052l2;
                            }
                            if (i19 != 0) {
                                i27 = 1;
                            } else {
                                i27 = i20;
                            }
                            if (i22 != 0) {
                                z11 = true;
                            }
                            if (i24 != 0) {
                                i25 = Integer.MAX_VALUE;
                            }
                            InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q4 = ComposerKt.f3003a;
                            m1531b(str, interfaceC0500b2, c7218l3, interfaceC2052l3, i27, z11, i25, 1, composerImplMo1636j, 12582912 | (i14 & 14) | (i14 & 112) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (458752 & i14) | (i14 & 3670016), 0);
                            i28 = i25;
                            z12 = z11;
                            interfaceC0500b3 = interfaceC0500b2;
                            c7218l4 = c7218l3;
                            interfaceC2052l4 = interfaceC2052l3;
                            i29 = i27;
                        } else {
                            if (i30 != 0) {
                                interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                            } else {
                                interfaceC0500b2 = interfaceC0500b;
                            }
                            if (i15 != 0) {
                                c7218l3 = C7218l.f40599c;
                            } else {
                                c7218l3 = c7218l2;
                            }
                            if (i17 != 0) {
                                interfaceC2052l3 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$6
                                    @Override // cm.InterfaceC2052l
                                    /* JADX INFO: renamed from: n */
                                    public final C9072e mo528n(C7216j c7216j) {
                                        C5207g.m11111f(c7216j, "it");
                                        return C9072e.f47360a;
                                    }
                                };
                            } else {
                                interfaceC2052l3 = interfaceC2052l2;
                            }
                            if (i19 != 0) {
                                i27 = 1;
                            } else {
                                i27 = i20;
                            }
                            if (i22 != 0) {
                                z11 = true;
                            }
                            if (i24 != 0) {
                                i25 = Integer.MAX_VALUE;
                            }
                            InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q5 = ComposerKt.f3003a;
                            m1531b(str, interfaceC0500b2, c7218l3, interfaceC2052l3, i27, z11, i25, 1, composerImplMo1636j, 12582912 | (i14 & 14) | (i14 & 112) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (458752 & i14) | (i14 & 3670016), 0);
                            i28 = i25;
                            z12 = z11;
                            interfaceC0500b3 = interfaceC0500b2;
                            c7218l4 = c7218l3;
                            interfaceC2052l4 = interfaceC2052l3;
                            i29 = i27;
                        }
                        c5332q0M1612T = composerImplMo1636j.m1612T();
                        if (c5332q0M1612T == null) {
                            return;
                        }
                        c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$7
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                                num.intValue();
                                BasicTextKt.m1532c(str, interfaceC0500b3, c7218l4, interfaceC2052l4, i29, z12, i28, interfaceC0476a2, C8573r0.m16737l1(i12 | 1), i13);
                                return C9072e.f47360a;
                            }
                        };
                    }
                    i14 |= 196608;
                    z11 = z10;
                    i24 = i13 & 64;
                    if (i24 != 0) {
                        i14 |= 1572864;
                        i25 = i11;
                    } else {
                        i25 = i11;
                        if ((i12 & 3670016) == 0) {
                            if (composerImplMo1636j.m1594E(i25)) {
                                i26 = 1048576;
                            } else {
                                i26 = 524288;
                            }
                            i14 |= i26;
                        }
                    }
                    if ((i14 & 2995931) == 599186) {
                        if (i30 != 0) {
                            interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                        } else {
                            interfaceC0500b2 = interfaceC0500b;
                        }
                        if (i15 != 0) {
                            c7218l3 = C7218l.f40599c;
                        } else {
                            c7218l3 = c7218l2;
                        }
                        if (i17 != 0) {
                            interfaceC2052l3 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$6
                                @Override // cm.InterfaceC2052l
                                /* JADX INFO: renamed from: n */
                                public final C9072e mo528n(C7216j c7216j) {
                                    C5207g.m11111f(c7216j, "it");
                                    return C9072e.f47360a;
                                }
                            };
                        } else {
                            interfaceC2052l3 = interfaceC2052l2;
                        }
                        if (i19 != 0) {
                            i27 = 1;
                        } else {
                            i27 = i20;
                        }
                        if (i22 != 0) {
                            z11 = true;
                        }
                        if (i24 != 0) {
                            i25 = Integer.MAX_VALUE;
                        }
                        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q6 = ComposerKt.f3003a;
                        m1531b(str, interfaceC0500b2, c7218l3, interfaceC2052l3, i27, z11, i25, 1, composerImplMo1636j, 12582912 | (i14 & 14) | (i14 & 112) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (458752 & i14) | (i14 & 3670016), 0);
                        i28 = i25;
                        z12 = z11;
                        interfaceC0500b3 = interfaceC0500b2;
                        c7218l4 = c7218l3;
                        interfaceC2052l4 = interfaceC2052l3;
                        i29 = i27;
                    } else {
                        if (i30 != 0) {
                            interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                        } else {
                            interfaceC0500b2 = interfaceC0500b;
                        }
                        if (i15 != 0) {
                            c7218l3 = C7218l.f40599c;
                        } else {
                            c7218l3 = c7218l2;
                        }
                        if (i17 != 0) {
                            interfaceC2052l3 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$6
                                @Override // cm.InterfaceC2052l
                                /* JADX INFO: renamed from: n */
                                public final C9072e mo528n(C7216j c7216j) {
                                    C5207g.m11111f(c7216j, "it");
                                    return C9072e.f47360a;
                                }
                            };
                        } else {
                            interfaceC2052l3 = interfaceC2052l2;
                        }
                        if (i19 != 0) {
                            i27 = 1;
                        } else {
                            i27 = i20;
                        }
                        if (i22 != 0) {
                            z11 = true;
                        }
                        if (i24 != 0) {
                            i25 = Integer.MAX_VALUE;
                        }
                        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q7 = ComposerKt.f3003a;
                        m1531b(str, interfaceC0500b2, c7218l3, interfaceC2052l3, i27, z11, i25, 1, composerImplMo1636j, 12582912 | (i14 & 14) | (i14 & 112) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (458752 & i14) | (i14 & 3670016), 0);
                        i28 = i25;
                        z12 = z11;
                        interfaceC0500b3 = interfaceC0500b2;
                        c7218l4 = c7218l3;
                        interfaceC2052l4 = interfaceC2052l3;
                        i29 = i27;
                    }
                    c5332q0M1612T = composerImplMo1636j.m1612T();
                    if (c5332q0M1612T == null) {
                        return;
                    }
                    c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$7
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                            num.intValue();
                            BasicTextKt.m1532c(str, interfaceC0500b3, c7218l4, interfaceC2052l4, i29, z12, i28, interfaceC0476a2, C8573r0.m16737l1(i12 | 1), i13);
                            return C9072e.f47360a;
                        }
                    };
                }
                i14 |= 3072;
                interfaceC2052l2 = interfaceC2052l;
                i19 = i13 & 16;
                if (i19 != 0) {
                    if ((i12 & 57344) == 0) {
                        i20 = i10;
                        if (composerImplMo1636j.m1594E(i20)) {
                            i21 = 16384;
                        } else {
                            i21 = 8192;
                        }
                        i14 |= i21;
                    }
                    i22 = i13 & 32;
                    if (i22 != 0) {
                        if ((i12 & 458752) == 0) {
                            z11 = z10;
                            if (composerImplMo1636j.m1598G(z11)) {
                                i23 = 131072;
                            } else {
                                i23 = 65536;
                            }
                            i14 |= i23;
                        }
                        i24 = i13 & 64;
                        if (i24 != 0) {
                            i14 |= 1572864;
                            i25 = i11;
                        } else {
                            i25 = i11;
                            if ((i12 & 3670016) == 0) {
                                if (composerImplMo1636j.m1594E(i25)) {
                                    i26 = 1048576;
                                } else {
                                    i26 = 524288;
                                }
                                i14 |= i26;
                            }
                        }
                        if ((i14 & 2995931) == 599186) {
                            if (i30 != 0) {
                                interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                            } else {
                                interfaceC0500b2 = interfaceC0500b;
                            }
                            if (i15 != 0) {
                                c7218l3 = C7218l.f40599c;
                            } else {
                                c7218l3 = c7218l2;
                            }
                            if (i17 != 0) {
                                interfaceC2052l3 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$6
                                    @Override // cm.InterfaceC2052l
                                    /* JADX INFO: renamed from: n */
                                    public final C9072e mo528n(C7216j c7216j) {
                                        C5207g.m11111f(c7216j, "it");
                                        return C9072e.f47360a;
                                    }
                                };
                            } else {
                                interfaceC2052l3 = interfaceC2052l2;
                            }
                            if (i19 != 0) {
                                i27 = 1;
                            } else {
                                i27 = i20;
                            }
                            if (i22 != 0) {
                                z11 = true;
                            }
                            if (i24 != 0) {
                                i25 = Integer.MAX_VALUE;
                            }
                            InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q8 = ComposerKt.f3003a;
                            m1531b(str, interfaceC0500b2, c7218l3, interfaceC2052l3, i27, z11, i25, 1, composerImplMo1636j, 12582912 | (i14 & 14) | (i14 & 112) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (458752 & i14) | (i14 & 3670016), 0);
                            i28 = i25;
                            z12 = z11;
                            interfaceC0500b3 = interfaceC0500b2;
                            c7218l4 = c7218l3;
                            interfaceC2052l4 = interfaceC2052l3;
                            i29 = i27;
                        } else {
                            if (i30 != 0) {
                                interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                            } else {
                                interfaceC0500b2 = interfaceC0500b;
                            }
                            if (i15 != 0) {
                                c7218l3 = C7218l.f40599c;
                            } else {
                                c7218l3 = c7218l2;
                            }
                            if (i17 != 0) {
                                interfaceC2052l3 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$6
                                    @Override // cm.InterfaceC2052l
                                    /* JADX INFO: renamed from: n */
                                    public final C9072e mo528n(C7216j c7216j) {
                                        C5207g.m11111f(c7216j, "it");
                                        return C9072e.f47360a;
                                    }
                                };
                            } else {
                                interfaceC2052l3 = interfaceC2052l2;
                            }
                            if (i19 != 0) {
                                i27 = 1;
                            } else {
                                i27 = i20;
                            }
                            if (i22 != 0) {
                                z11 = true;
                            }
                            if (i24 != 0) {
                                i25 = Integer.MAX_VALUE;
                            }
                            InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q9 = ComposerKt.f3003a;
                            m1531b(str, interfaceC0500b2, c7218l3, interfaceC2052l3, i27, z11, i25, 1, composerImplMo1636j, 12582912 | (i14 & 14) | (i14 & 112) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (458752 & i14) | (i14 & 3670016), 0);
                            i28 = i25;
                            z12 = z11;
                            interfaceC0500b3 = interfaceC0500b2;
                            c7218l4 = c7218l3;
                            interfaceC2052l4 = interfaceC2052l3;
                            i29 = i27;
                        }
                        c5332q0M1612T = composerImplMo1636j.m1612T();
                        if (c5332q0M1612T == null) {
                            return;
                        }
                        c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$7
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                                num.intValue();
                                BasicTextKt.m1532c(str, interfaceC0500b3, c7218l4, interfaceC2052l4, i29, z12, i28, interfaceC0476a2, C8573r0.m16737l1(i12 | 1), i13);
                                return C9072e.f47360a;
                            }
                        };
                    }
                    i14 |= 196608;
                    z11 = z10;
                    i24 = i13 & 64;
                    if (i24 != 0) {
                        i14 |= 1572864;
                        i25 = i11;
                    } else {
                        i25 = i11;
                        if ((i12 & 3670016) == 0) {
                            if (composerImplMo1636j.m1594E(i25)) {
                                i26 = 1048576;
                            } else {
                                i26 = 524288;
                            }
                            i14 |= i26;
                        }
                    }
                    if ((i14 & 2995931) == 599186) {
                        if (i30 != 0) {
                            interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                        } else {
                            interfaceC0500b2 = interfaceC0500b;
                        }
                        if (i15 != 0) {
                            c7218l3 = C7218l.f40599c;
                        } else {
                            c7218l3 = c7218l2;
                        }
                        if (i17 != 0) {
                            interfaceC2052l3 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$6
                                @Override // cm.InterfaceC2052l
                                /* JADX INFO: renamed from: n */
                                public final C9072e mo528n(C7216j c7216j) {
                                    C5207g.m11111f(c7216j, "it");
                                    return C9072e.f47360a;
                                }
                            };
                        } else {
                            interfaceC2052l3 = interfaceC2052l2;
                        }
                        if (i19 != 0) {
                            i27 = 1;
                        } else {
                            i27 = i20;
                        }
                        if (i22 != 0) {
                            z11 = true;
                        }
                        if (i24 != 0) {
                            i25 = Integer.MAX_VALUE;
                        }
                        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q10 = ComposerKt.f3003a;
                        m1531b(str, interfaceC0500b2, c7218l3, interfaceC2052l3, i27, z11, i25, 1, composerImplMo1636j, 12582912 | (i14 & 14) | (i14 & 112) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (458752 & i14) | (i14 & 3670016), 0);
                        i28 = i25;
                        z12 = z11;
                        interfaceC0500b3 = interfaceC0500b2;
                        c7218l4 = c7218l3;
                        interfaceC2052l4 = interfaceC2052l3;
                        i29 = i27;
                    } else {
                        if (i30 != 0) {
                            interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                        } else {
                            interfaceC0500b2 = interfaceC0500b;
                        }
                        if (i15 != 0) {
                            c7218l3 = C7218l.f40599c;
                        } else {
                            c7218l3 = c7218l2;
                        }
                        if (i17 != 0) {
                            interfaceC2052l3 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$6
                                @Override // cm.InterfaceC2052l
                                /* JADX INFO: renamed from: n */
                                public final C9072e mo528n(C7216j c7216j) {
                                    C5207g.m11111f(c7216j, "it");
                                    return C9072e.f47360a;
                                }
                            };
                        } else {
                            interfaceC2052l3 = interfaceC2052l2;
                        }
                        if (i19 != 0) {
                            i27 = 1;
                        } else {
                            i27 = i20;
                        }
                        if (i22 != 0) {
                            z11 = true;
                        }
                        if (i24 != 0) {
                            i25 = Integer.MAX_VALUE;
                        }
                        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q11 = ComposerKt.f3003a;
                        m1531b(str, interfaceC0500b2, c7218l3, interfaceC2052l3, i27, z11, i25, 1, composerImplMo1636j, 12582912 | (i14 & 14) | (i14 & 112) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (458752 & i14) | (i14 & 3670016), 0);
                        i28 = i25;
                        z12 = z11;
                        interfaceC0500b3 = interfaceC0500b2;
                        c7218l4 = c7218l3;
                        interfaceC2052l4 = interfaceC2052l3;
                        i29 = i27;
                    }
                    c5332q0M1612T = composerImplMo1636j.m1612T();
                    if (c5332q0M1612T == null) {
                        return;
                    }
                    c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$7
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                            num.intValue();
                            BasicTextKt.m1532c(str, interfaceC0500b3, c7218l4, interfaceC2052l4, i29, z12, i28, interfaceC0476a2, C8573r0.m16737l1(i12 | 1), i13);
                            return C9072e.f47360a;
                        }
                    };
                }
                i14 |= 24576;
                i20 = i10;
                i22 = i13 & 32;
                if (i22 != 0) {
                    if ((i12 & 458752) == 0) {
                        z11 = z10;
                        if (composerImplMo1636j.m1598G(z11)) {
                            i23 = 131072;
                        } else {
                            i23 = 65536;
                        }
                        i14 |= i23;
                    }
                    i24 = i13 & 64;
                    if (i24 != 0) {
                        i14 |= 1572864;
                        i25 = i11;
                    } else {
                        i25 = i11;
                        if ((i12 & 3670016) == 0) {
                            if (composerImplMo1636j.m1594E(i25)) {
                                i26 = 1048576;
                            } else {
                                i26 = 524288;
                            }
                            i14 |= i26;
                        }
                    }
                    if ((i14 & 2995931) == 599186) {
                        if (i30 != 0) {
                            interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                        } else {
                            interfaceC0500b2 = interfaceC0500b;
                        }
                        if (i15 != 0) {
                            c7218l3 = C7218l.f40599c;
                        } else {
                            c7218l3 = c7218l2;
                        }
                        if (i17 != 0) {
                            interfaceC2052l3 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$6
                                @Override // cm.InterfaceC2052l
                                /* JADX INFO: renamed from: n */
                                public final C9072e mo528n(C7216j c7216j) {
                                    C5207g.m11111f(c7216j, "it");
                                    return C9072e.f47360a;
                                }
                            };
                        } else {
                            interfaceC2052l3 = interfaceC2052l2;
                        }
                        if (i19 != 0) {
                            i27 = 1;
                        } else {
                            i27 = i20;
                        }
                        if (i22 != 0) {
                            z11 = true;
                        }
                        if (i24 != 0) {
                            i25 = Integer.MAX_VALUE;
                        }
                        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q12 = ComposerKt.f3003a;
                        m1531b(str, interfaceC0500b2, c7218l3, interfaceC2052l3, i27, z11, i25, 1, composerImplMo1636j, 12582912 | (i14 & 14) | (i14 & 112) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (458752 & i14) | (i14 & 3670016), 0);
                        i28 = i25;
                        z12 = z11;
                        interfaceC0500b3 = interfaceC0500b2;
                        c7218l4 = c7218l3;
                        interfaceC2052l4 = interfaceC2052l3;
                        i29 = i27;
                    } else {
                        if (i30 != 0) {
                            interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                        } else {
                            interfaceC0500b2 = interfaceC0500b;
                        }
                        if (i15 != 0) {
                            c7218l3 = C7218l.f40599c;
                        } else {
                            c7218l3 = c7218l2;
                        }
                        if (i17 != 0) {
                            interfaceC2052l3 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$6
                                @Override // cm.InterfaceC2052l
                                /* JADX INFO: renamed from: n */
                                public final C9072e mo528n(C7216j c7216j) {
                                    C5207g.m11111f(c7216j, "it");
                                    return C9072e.f47360a;
                                }
                            };
                        } else {
                            interfaceC2052l3 = interfaceC2052l2;
                        }
                        if (i19 != 0) {
                            i27 = 1;
                        } else {
                            i27 = i20;
                        }
                        if (i22 != 0) {
                            z11 = true;
                        }
                        if (i24 != 0) {
                            i25 = Integer.MAX_VALUE;
                        }
                        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q13 = ComposerKt.f3003a;
                        m1531b(str, interfaceC0500b2, c7218l3, interfaceC2052l3, i27, z11, i25, 1, composerImplMo1636j, 12582912 | (i14 & 14) | (i14 & 112) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (458752 & i14) | (i14 & 3670016), 0);
                        i28 = i25;
                        z12 = z11;
                        interfaceC0500b3 = interfaceC0500b2;
                        c7218l4 = c7218l3;
                        interfaceC2052l4 = interfaceC2052l3;
                        i29 = i27;
                    }
                    c5332q0M1612T = composerImplMo1636j.m1612T();
                    if (c5332q0M1612T == null) {
                        return;
                    }
                    c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$7
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                            num.intValue();
                            BasicTextKt.m1532c(str, interfaceC0500b3, c7218l4, interfaceC2052l4, i29, z12, i28, interfaceC0476a2, C8573r0.m16737l1(i12 | 1), i13);
                            return C9072e.f47360a;
                        }
                    };
                }
                i14 |= 196608;
                z11 = z10;
                i24 = i13 & 64;
                if (i24 != 0) {
                    i14 |= 1572864;
                    i25 = i11;
                } else {
                    i25 = i11;
                    if ((i12 & 3670016) == 0) {
                        if (composerImplMo1636j.m1594E(i25)) {
                            i26 = 1048576;
                        } else {
                            i26 = 524288;
                        }
                        i14 |= i26;
                    }
                }
                if ((i14 & 2995931) == 599186) {
                    if (i30 != 0) {
                        interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                    } else {
                        interfaceC0500b2 = interfaceC0500b;
                    }
                    if (i15 != 0) {
                        c7218l3 = C7218l.f40599c;
                    } else {
                        c7218l3 = c7218l2;
                    }
                    if (i17 != 0) {
                        interfaceC2052l3 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$6
                            @Override // cm.InterfaceC2052l
                            /* JADX INFO: renamed from: n */
                            public final C9072e mo528n(C7216j c7216j) {
                                C5207g.m11111f(c7216j, "it");
                                return C9072e.f47360a;
                            }
                        };
                    } else {
                        interfaceC2052l3 = interfaceC2052l2;
                    }
                    if (i19 != 0) {
                        i27 = 1;
                    } else {
                        i27 = i20;
                    }
                    if (i22 != 0) {
                        z11 = true;
                    }
                    if (i24 != 0) {
                        i25 = Integer.MAX_VALUE;
                    }
                    InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q14 = ComposerKt.f3003a;
                    m1531b(str, interfaceC0500b2, c7218l3, interfaceC2052l3, i27, z11, i25, 1, composerImplMo1636j, 12582912 | (i14 & 14) | (i14 & 112) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (458752 & i14) | (i14 & 3670016), 0);
                    i28 = i25;
                    z12 = z11;
                    interfaceC0500b3 = interfaceC0500b2;
                    c7218l4 = c7218l3;
                    interfaceC2052l4 = interfaceC2052l3;
                    i29 = i27;
                } else {
                    if (i30 != 0) {
                        interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                    } else {
                        interfaceC0500b2 = interfaceC0500b;
                    }
                    if (i15 != 0) {
                        c7218l3 = C7218l.f40599c;
                    } else {
                        c7218l3 = c7218l2;
                    }
                    if (i17 != 0) {
                        interfaceC2052l3 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$6
                            @Override // cm.InterfaceC2052l
                            /* JADX INFO: renamed from: n */
                            public final C9072e mo528n(C7216j c7216j) {
                                C5207g.m11111f(c7216j, "it");
                                return C9072e.f47360a;
                            }
                        };
                    } else {
                        interfaceC2052l3 = interfaceC2052l2;
                    }
                    if (i19 != 0) {
                        i27 = 1;
                    } else {
                        i27 = i20;
                    }
                    if (i22 != 0) {
                        z11 = true;
                    }
                    if (i24 != 0) {
                        i25 = Integer.MAX_VALUE;
                    }
                    InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q15 = ComposerKt.f3003a;
                    m1531b(str, interfaceC0500b2, c7218l3, interfaceC2052l3, i27, z11, i25, 1, composerImplMo1636j, 12582912 | (i14 & 14) | (i14 & 112) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (458752 & i14) | (i14 & 3670016), 0);
                    i28 = i25;
                    z12 = z11;
                    interfaceC0500b3 = interfaceC0500b2;
                    c7218l4 = c7218l3;
                    interfaceC2052l4 = interfaceC2052l3;
                    i29 = i27;
                }
                c5332q0M1612T = composerImplMo1636j.m1612T();
                if (c5332q0M1612T == null) {
                    return;
                }
                c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$7
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // cm.InterfaceC2056p
                    /* JADX INFO: renamed from: m0 */
                    public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                        num.intValue();
                        BasicTextKt.m1532c(str, interfaceC0500b3, c7218l4, interfaceC2052l4, i29, z12, i28, interfaceC0476a2, C8573r0.m16737l1(i12 | 1), i13);
                        return C9072e.f47360a;
                    }
                };
            }
            i14 |= 384;
            c7218l2 = c7218l;
            i17 = i13 & 8;
            if (i17 != 0) {
                if ((i12 & 7168) == 0) {
                    interfaceC2052l2 = interfaceC2052l;
                    if (composerImplMo1636j.m1600H(interfaceC2052l2)) {
                        i18 = 2048;
                    } else {
                        i18 = 1024;
                    }
                    i14 |= i18;
                }
                i19 = i13 & 16;
                if (i19 != 0) {
                    if ((i12 & 57344) == 0) {
                        i20 = i10;
                        if (composerImplMo1636j.m1594E(i20)) {
                            i21 = 16384;
                        } else {
                            i21 = 8192;
                        }
                        i14 |= i21;
                    }
                    i22 = i13 & 32;
                    if (i22 != 0) {
                        if ((i12 & 458752) == 0) {
                            z11 = z10;
                            if (composerImplMo1636j.m1598G(z11)) {
                                i23 = 131072;
                            } else {
                                i23 = 65536;
                            }
                            i14 |= i23;
                        }
                        i24 = i13 & 64;
                        if (i24 != 0) {
                            i14 |= 1572864;
                            i25 = i11;
                        } else {
                            i25 = i11;
                            if ((i12 & 3670016) == 0) {
                                if (composerImplMo1636j.m1594E(i25)) {
                                    i26 = 1048576;
                                } else {
                                    i26 = 524288;
                                }
                                i14 |= i26;
                            }
                        }
                        if ((i14 & 2995931) == 599186) {
                            if (i30 != 0) {
                                interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                            } else {
                                interfaceC0500b2 = interfaceC0500b;
                            }
                            if (i15 != 0) {
                                c7218l3 = C7218l.f40599c;
                            } else {
                                c7218l3 = c7218l2;
                            }
                            if (i17 != 0) {
                                interfaceC2052l3 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$6
                                    @Override // cm.InterfaceC2052l
                                    /* JADX INFO: renamed from: n */
                                    public final C9072e mo528n(C7216j c7216j) {
                                        C5207g.m11111f(c7216j, "it");
                                        return C9072e.f47360a;
                                    }
                                };
                            } else {
                                interfaceC2052l3 = interfaceC2052l2;
                            }
                            if (i19 != 0) {
                                i27 = 1;
                            } else {
                                i27 = i20;
                            }
                            if (i22 != 0) {
                                z11 = true;
                            }
                            if (i24 != 0) {
                                i25 = Integer.MAX_VALUE;
                            }
                            InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q16 = ComposerKt.f3003a;
                            m1531b(str, interfaceC0500b2, c7218l3, interfaceC2052l3, i27, z11, i25, 1, composerImplMo1636j, 12582912 | (i14 & 14) | (i14 & 112) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (458752 & i14) | (i14 & 3670016), 0);
                            i28 = i25;
                            z12 = z11;
                            interfaceC0500b3 = interfaceC0500b2;
                            c7218l4 = c7218l3;
                            interfaceC2052l4 = interfaceC2052l3;
                            i29 = i27;
                        } else {
                            if (i30 != 0) {
                                interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                            } else {
                                interfaceC0500b2 = interfaceC0500b;
                            }
                            if (i15 != 0) {
                                c7218l3 = C7218l.f40599c;
                            } else {
                                c7218l3 = c7218l2;
                            }
                            if (i17 != 0) {
                                interfaceC2052l3 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$6
                                    @Override // cm.InterfaceC2052l
                                    /* JADX INFO: renamed from: n */
                                    public final C9072e mo528n(C7216j c7216j) {
                                        C5207g.m11111f(c7216j, "it");
                                        return C9072e.f47360a;
                                    }
                                };
                            } else {
                                interfaceC2052l3 = interfaceC2052l2;
                            }
                            if (i19 != 0) {
                                i27 = 1;
                            } else {
                                i27 = i20;
                            }
                            if (i22 != 0) {
                                z11 = true;
                            }
                            if (i24 != 0) {
                                i25 = Integer.MAX_VALUE;
                            }
                            InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q17 = ComposerKt.f3003a;
                            m1531b(str, interfaceC0500b2, c7218l3, interfaceC2052l3, i27, z11, i25, 1, composerImplMo1636j, 12582912 | (i14 & 14) | (i14 & 112) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (458752 & i14) | (i14 & 3670016), 0);
                            i28 = i25;
                            z12 = z11;
                            interfaceC0500b3 = interfaceC0500b2;
                            c7218l4 = c7218l3;
                            interfaceC2052l4 = interfaceC2052l3;
                            i29 = i27;
                        }
                        c5332q0M1612T = composerImplMo1636j.m1612T();
                        if (c5332q0M1612T == null) {
                            return;
                        }
                        c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$7
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                                num.intValue();
                                BasicTextKt.m1532c(str, interfaceC0500b3, c7218l4, interfaceC2052l4, i29, z12, i28, interfaceC0476a2, C8573r0.m16737l1(i12 | 1), i13);
                                return C9072e.f47360a;
                            }
                        };
                    }
                    i14 |= 196608;
                    z11 = z10;
                    i24 = i13 & 64;
                    if (i24 != 0) {
                        i14 |= 1572864;
                        i25 = i11;
                    } else {
                        i25 = i11;
                        if ((i12 & 3670016) == 0) {
                            if (composerImplMo1636j.m1594E(i25)) {
                                i26 = 1048576;
                            } else {
                                i26 = 524288;
                            }
                            i14 |= i26;
                        }
                    }
                    if ((i14 & 2995931) == 599186) {
                        if (i30 != 0) {
                            interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                        } else {
                            interfaceC0500b2 = interfaceC0500b;
                        }
                        if (i15 != 0) {
                            c7218l3 = C7218l.f40599c;
                        } else {
                            c7218l3 = c7218l2;
                        }
                        if (i17 != 0) {
                            interfaceC2052l3 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$6
                                @Override // cm.InterfaceC2052l
                                /* JADX INFO: renamed from: n */
                                public final C9072e mo528n(C7216j c7216j) {
                                    C5207g.m11111f(c7216j, "it");
                                    return C9072e.f47360a;
                                }
                            };
                        } else {
                            interfaceC2052l3 = interfaceC2052l2;
                        }
                        if (i19 != 0) {
                            i27 = 1;
                        } else {
                            i27 = i20;
                        }
                        if (i22 != 0) {
                            z11 = true;
                        }
                        if (i24 != 0) {
                            i25 = Integer.MAX_VALUE;
                        }
                        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q18 = ComposerKt.f3003a;
                        m1531b(str, interfaceC0500b2, c7218l3, interfaceC2052l3, i27, z11, i25, 1, composerImplMo1636j, 12582912 | (i14 & 14) | (i14 & 112) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (458752 & i14) | (i14 & 3670016), 0);
                        i28 = i25;
                        z12 = z11;
                        interfaceC0500b3 = interfaceC0500b2;
                        c7218l4 = c7218l3;
                        interfaceC2052l4 = interfaceC2052l3;
                        i29 = i27;
                    } else {
                        if (i30 != 0) {
                            interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                        } else {
                            interfaceC0500b2 = interfaceC0500b;
                        }
                        if (i15 != 0) {
                            c7218l3 = C7218l.f40599c;
                        } else {
                            c7218l3 = c7218l2;
                        }
                        if (i17 != 0) {
                            interfaceC2052l3 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$6
                                @Override // cm.InterfaceC2052l
                                /* JADX INFO: renamed from: n */
                                public final C9072e mo528n(C7216j c7216j) {
                                    C5207g.m11111f(c7216j, "it");
                                    return C9072e.f47360a;
                                }
                            };
                        } else {
                            interfaceC2052l3 = interfaceC2052l2;
                        }
                        if (i19 != 0) {
                            i27 = 1;
                        } else {
                            i27 = i20;
                        }
                        if (i22 != 0) {
                            z11 = true;
                        }
                        if (i24 != 0) {
                            i25 = Integer.MAX_VALUE;
                        }
                        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q19 = ComposerKt.f3003a;
                        m1531b(str, interfaceC0500b2, c7218l3, interfaceC2052l3, i27, z11, i25, 1, composerImplMo1636j, 12582912 | (i14 & 14) | (i14 & 112) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (458752 & i14) | (i14 & 3670016), 0);
                        i28 = i25;
                        z12 = z11;
                        interfaceC0500b3 = interfaceC0500b2;
                        c7218l4 = c7218l3;
                        interfaceC2052l4 = interfaceC2052l3;
                        i29 = i27;
                    }
                    c5332q0M1612T = composerImplMo1636j.m1612T();
                    if (c5332q0M1612T == null) {
                        return;
                    }
                    c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$7
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                            num.intValue();
                            BasicTextKt.m1532c(str, interfaceC0500b3, c7218l4, interfaceC2052l4, i29, z12, i28, interfaceC0476a2, C8573r0.m16737l1(i12 | 1), i13);
                            return C9072e.f47360a;
                        }
                    };
                }
                i14 |= 24576;
                i20 = i10;
                i22 = i13 & 32;
                if (i22 != 0) {
                    if ((i12 & 458752) == 0) {
                        z11 = z10;
                        if (composerImplMo1636j.m1598G(z11)) {
                            i23 = 131072;
                        } else {
                            i23 = 65536;
                        }
                        i14 |= i23;
                    }
                    i24 = i13 & 64;
                    if (i24 != 0) {
                        i14 |= 1572864;
                        i25 = i11;
                    } else {
                        i25 = i11;
                        if ((i12 & 3670016) == 0) {
                            if (composerImplMo1636j.m1594E(i25)) {
                                i26 = 1048576;
                            } else {
                                i26 = 524288;
                            }
                            i14 |= i26;
                        }
                    }
                    if ((i14 & 2995931) == 599186) {
                        if (i30 != 0) {
                            interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                        } else {
                            interfaceC0500b2 = interfaceC0500b;
                        }
                        if (i15 != 0) {
                            c7218l3 = C7218l.f40599c;
                        } else {
                            c7218l3 = c7218l2;
                        }
                        if (i17 != 0) {
                            interfaceC2052l3 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$6
                                @Override // cm.InterfaceC2052l
                                /* JADX INFO: renamed from: n */
                                public final C9072e mo528n(C7216j c7216j) {
                                    C5207g.m11111f(c7216j, "it");
                                    return C9072e.f47360a;
                                }
                            };
                        } else {
                            interfaceC2052l3 = interfaceC2052l2;
                        }
                        if (i19 != 0) {
                            i27 = 1;
                        } else {
                            i27 = i20;
                        }
                        if (i22 != 0) {
                            z11 = true;
                        }
                        if (i24 != 0) {
                            i25 = Integer.MAX_VALUE;
                        }
                        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q110 = ComposerKt.f3003a;
                        m1531b(str, interfaceC0500b2, c7218l3, interfaceC2052l3, i27, z11, i25, 1, composerImplMo1636j, 12582912 | (i14 & 14) | (i14 & 112) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (458752 & i14) | (i14 & 3670016), 0);
                        i28 = i25;
                        z12 = z11;
                        interfaceC0500b3 = interfaceC0500b2;
                        c7218l4 = c7218l3;
                        interfaceC2052l4 = interfaceC2052l3;
                        i29 = i27;
                    } else {
                        if (i30 != 0) {
                            interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                        } else {
                            interfaceC0500b2 = interfaceC0500b;
                        }
                        if (i15 != 0) {
                            c7218l3 = C7218l.f40599c;
                        } else {
                            c7218l3 = c7218l2;
                        }
                        if (i17 != 0) {
                            interfaceC2052l3 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$6
                                @Override // cm.InterfaceC2052l
                                /* JADX INFO: renamed from: n */
                                public final C9072e mo528n(C7216j c7216j) {
                                    C5207g.m11111f(c7216j, "it");
                                    return C9072e.f47360a;
                                }
                            };
                        } else {
                            interfaceC2052l3 = interfaceC2052l2;
                        }
                        if (i19 != 0) {
                            i27 = 1;
                        } else {
                            i27 = i20;
                        }
                        if (i22 != 0) {
                            z11 = true;
                        }
                        if (i24 != 0) {
                            i25 = Integer.MAX_VALUE;
                        }
                        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q111 = ComposerKt.f3003a;
                        m1531b(str, interfaceC0500b2, c7218l3, interfaceC2052l3, i27, z11, i25, 1, composerImplMo1636j, 12582912 | (i14 & 14) | (i14 & 112) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (458752 & i14) | (i14 & 3670016), 0);
                        i28 = i25;
                        z12 = z11;
                        interfaceC0500b3 = interfaceC0500b2;
                        c7218l4 = c7218l3;
                        interfaceC2052l4 = interfaceC2052l3;
                        i29 = i27;
                    }
                    c5332q0M1612T = composerImplMo1636j.m1612T();
                    if (c5332q0M1612T == null) {
                        return;
                    }
                    c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$7
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                            num.intValue();
                            BasicTextKt.m1532c(str, interfaceC0500b3, c7218l4, interfaceC2052l4, i29, z12, i28, interfaceC0476a2, C8573r0.m16737l1(i12 | 1), i13);
                            return C9072e.f47360a;
                        }
                    };
                }
                i14 |= 196608;
                z11 = z10;
                i24 = i13 & 64;
                if (i24 != 0) {
                    i14 |= 1572864;
                    i25 = i11;
                } else {
                    i25 = i11;
                    if ((i12 & 3670016) == 0) {
                        if (composerImplMo1636j.m1594E(i25)) {
                            i26 = 1048576;
                        } else {
                            i26 = 524288;
                        }
                        i14 |= i26;
                    }
                }
                if ((i14 & 2995931) == 599186) {
                    if (i30 != 0) {
                        interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                    } else {
                        interfaceC0500b2 = interfaceC0500b;
                    }
                    if (i15 != 0) {
                        c7218l3 = C7218l.f40599c;
                    } else {
                        c7218l3 = c7218l2;
                    }
                    if (i17 != 0) {
                        interfaceC2052l3 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$6
                            @Override // cm.InterfaceC2052l
                            /* JADX INFO: renamed from: n */
                            public final C9072e mo528n(C7216j c7216j) {
                                C5207g.m11111f(c7216j, "it");
                                return C9072e.f47360a;
                            }
                        };
                    } else {
                        interfaceC2052l3 = interfaceC2052l2;
                    }
                    if (i19 != 0) {
                        i27 = 1;
                    } else {
                        i27 = i20;
                    }
                    if (i22 != 0) {
                        z11 = true;
                    }
                    if (i24 != 0) {
                        i25 = Integer.MAX_VALUE;
                    }
                    InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q112 = ComposerKt.f3003a;
                    m1531b(str, interfaceC0500b2, c7218l3, interfaceC2052l3, i27, z11, i25, 1, composerImplMo1636j, 12582912 | (i14 & 14) | (i14 & 112) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (458752 & i14) | (i14 & 3670016), 0);
                    i28 = i25;
                    z12 = z11;
                    interfaceC0500b3 = interfaceC0500b2;
                    c7218l4 = c7218l3;
                    interfaceC2052l4 = interfaceC2052l3;
                    i29 = i27;
                } else {
                    if (i30 != 0) {
                        interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                    } else {
                        interfaceC0500b2 = interfaceC0500b;
                    }
                    if (i15 != 0) {
                        c7218l3 = C7218l.f40599c;
                    } else {
                        c7218l3 = c7218l2;
                    }
                    if (i17 != 0) {
                        interfaceC2052l3 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$6
                            @Override // cm.InterfaceC2052l
                            /* JADX INFO: renamed from: n */
                            public final C9072e mo528n(C7216j c7216j) {
                                C5207g.m11111f(c7216j, "it");
                                return C9072e.f47360a;
                            }
                        };
                    } else {
                        interfaceC2052l3 = interfaceC2052l2;
                    }
                    if (i19 != 0) {
                        i27 = 1;
                    } else {
                        i27 = i20;
                    }
                    if (i22 != 0) {
                        z11 = true;
                    }
                    if (i24 != 0) {
                        i25 = Integer.MAX_VALUE;
                    }
                    InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q113 = ComposerKt.f3003a;
                    m1531b(str, interfaceC0500b2, c7218l3, interfaceC2052l3, i27, z11, i25, 1, composerImplMo1636j, 12582912 | (i14 & 14) | (i14 & 112) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (458752 & i14) | (i14 & 3670016), 0);
                    i28 = i25;
                    z12 = z11;
                    interfaceC0500b3 = interfaceC0500b2;
                    c7218l4 = c7218l3;
                    interfaceC2052l4 = interfaceC2052l3;
                    i29 = i27;
                }
                c5332q0M1612T = composerImplMo1636j.m1612T();
                if (c5332q0M1612T == null) {
                    return;
                }
                c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$7
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // cm.InterfaceC2056p
                    /* JADX INFO: renamed from: m0 */
                    public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                        num.intValue();
                        BasicTextKt.m1532c(str, interfaceC0500b3, c7218l4, interfaceC2052l4, i29, z12, i28, interfaceC0476a2, C8573r0.m16737l1(i12 | 1), i13);
                        return C9072e.f47360a;
                    }
                };
            }
            i14 |= 3072;
            interfaceC2052l2 = interfaceC2052l;
            i19 = i13 & 16;
            if (i19 != 0) {
                if ((i12 & 57344) == 0) {
                    i20 = i10;
                    if (composerImplMo1636j.m1594E(i20)) {
                        i21 = 16384;
                    } else {
                        i21 = 8192;
                    }
                    i14 |= i21;
                }
                i22 = i13 & 32;
                if (i22 != 0) {
                    if ((i12 & 458752) == 0) {
                        z11 = z10;
                        if (composerImplMo1636j.m1598G(z11)) {
                            i23 = 131072;
                        } else {
                            i23 = 65536;
                        }
                        i14 |= i23;
                    }
                    i24 = i13 & 64;
                    if (i24 != 0) {
                        i14 |= 1572864;
                        i25 = i11;
                    } else {
                        i25 = i11;
                        if ((i12 & 3670016) == 0) {
                            if (composerImplMo1636j.m1594E(i25)) {
                                i26 = 1048576;
                            } else {
                                i26 = 524288;
                            }
                            i14 |= i26;
                        }
                    }
                    if ((i14 & 2995931) == 599186) {
                        if (i30 != 0) {
                            interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                        } else {
                            interfaceC0500b2 = interfaceC0500b;
                        }
                        if (i15 != 0) {
                            c7218l3 = C7218l.f40599c;
                        } else {
                            c7218l3 = c7218l2;
                        }
                        if (i17 != 0) {
                            interfaceC2052l3 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$6
                                @Override // cm.InterfaceC2052l
                                /* JADX INFO: renamed from: n */
                                public final C9072e mo528n(C7216j c7216j) {
                                    C5207g.m11111f(c7216j, "it");
                                    return C9072e.f47360a;
                                }
                            };
                        } else {
                            interfaceC2052l3 = interfaceC2052l2;
                        }
                        if (i19 != 0) {
                            i27 = 1;
                        } else {
                            i27 = i20;
                        }
                        if (i22 != 0) {
                            z11 = true;
                        }
                        if (i24 != 0) {
                            i25 = Integer.MAX_VALUE;
                        }
                        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q114 = ComposerKt.f3003a;
                        m1531b(str, interfaceC0500b2, c7218l3, interfaceC2052l3, i27, z11, i25, 1, composerImplMo1636j, 12582912 | (i14 & 14) | (i14 & 112) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (458752 & i14) | (i14 & 3670016), 0);
                        i28 = i25;
                        z12 = z11;
                        interfaceC0500b3 = interfaceC0500b2;
                        c7218l4 = c7218l3;
                        interfaceC2052l4 = interfaceC2052l3;
                        i29 = i27;
                    } else {
                        if (i30 != 0) {
                            interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                        } else {
                            interfaceC0500b2 = interfaceC0500b;
                        }
                        if (i15 != 0) {
                            c7218l3 = C7218l.f40599c;
                        } else {
                            c7218l3 = c7218l2;
                        }
                        if (i17 != 0) {
                            interfaceC2052l3 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$6
                                @Override // cm.InterfaceC2052l
                                /* JADX INFO: renamed from: n */
                                public final C9072e mo528n(C7216j c7216j) {
                                    C5207g.m11111f(c7216j, "it");
                                    return C9072e.f47360a;
                                }
                            };
                        } else {
                            interfaceC2052l3 = interfaceC2052l2;
                        }
                        if (i19 != 0) {
                            i27 = 1;
                        } else {
                            i27 = i20;
                        }
                        if (i22 != 0) {
                            z11 = true;
                        }
                        if (i24 != 0) {
                            i25 = Integer.MAX_VALUE;
                        }
                        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q115 = ComposerKt.f3003a;
                        m1531b(str, interfaceC0500b2, c7218l3, interfaceC2052l3, i27, z11, i25, 1, composerImplMo1636j, 12582912 | (i14 & 14) | (i14 & 112) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (458752 & i14) | (i14 & 3670016), 0);
                        i28 = i25;
                        z12 = z11;
                        interfaceC0500b3 = interfaceC0500b2;
                        c7218l4 = c7218l3;
                        interfaceC2052l4 = interfaceC2052l3;
                        i29 = i27;
                    }
                    c5332q0M1612T = composerImplMo1636j.m1612T();
                    if (c5332q0M1612T == null) {
                        return;
                    }
                    c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$7
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                            num.intValue();
                            BasicTextKt.m1532c(str, interfaceC0500b3, c7218l4, interfaceC2052l4, i29, z12, i28, interfaceC0476a2, C8573r0.m16737l1(i12 | 1), i13);
                            return C9072e.f47360a;
                        }
                    };
                }
                i14 |= 196608;
                z11 = z10;
                i24 = i13 & 64;
                if (i24 != 0) {
                    i14 |= 1572864;
                    i25 = i11;
                } else {
                    i25 = i11;
                    if ((i12 & 3670016) == 0) {
                        if (composerImplMo1636j.m1594E(i25)) {
                            i26 = 1048576;
                        } else {
                            i26 = 524288;
                        }
                        i14 |= i26;
                    }
                }
                if ((i14 & 2995931) == 599186) {
                    if (i30 != 0) {
                        interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                    } else {
                        interfaceC0500b2 = interfaceC0500b;
                    }
                    if (i15 != 0) {
                        c7218l3 = C7218l.f40599c;
                    } else {
                        c7218l3 = c7218l2;
                    }
                    if (i17 != 0) {
                        interfaceC2052l3 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$6
                            @Override // cm.InterfaceC2052l
                            /* JADX INFO: renamed from: n */
                            public final C9072e mo528n(C7216j c7216j) {
                                C5207g.m11111f(c7216j, "it");
                                return C9072e.f47360a;
                            }
                        };
                    } else {
                        interfaceC2052l3 = interfaceC2052l2;
                    }
                    if (i19 != 0) {
                        i27 = 1;
                    } else {
                        i27 = i20;
                    }
                    if (i22 != 0) {
                        z11 = true;
                    }
                    if (i24 != 0) {
                        i25 = Integer.MAX_VALUE;
                    }
                    InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q116 = ComposerKt.f3003a;
                    m1531b(str, interfaceC0500b2, c7218l3, interfaceC2052l3, i27, z11, i25, 1, composerImplMo1636j, 12582912 | (i14 & 14) | (i14 & 112) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (458752 & i14) | (i14 & 3670016), 0);
                    i28 = i25;
                    z12 = z11;
                    interfaceC0500b3 = interfaceC0500b2;
                    c7218l4 = c7218l3;
                    interfaceC2052l4 = interfaceC2052l3;
                    i29 = i27;
                } else {
                    if (i30 != 0) {
                        interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                    } else {
                        interfaceC0500b2 = interfaceC0500b;
                    }
                    if (i15 != 0) {
                        c7218l3 = C7218l.f40599c;
                    } else {
                        c7218l3 = c7218l2;
                    }
                    if (i17 != 0) {
                        interfaceC2052l3 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$6
                            @Override // cm.InterfaceC2052l
                            /* JADX INFO: renamed from: n */
                            public final C9072e mo528n(C7216j c7216j) {
                                C5207g.m11111f(c7216j, "it");
                                return C9072e.f47360a;
                            }
                        };
                    } else {
                        interfaceC2052l3 = interfaceC2052l2;
                    }
                    if (i19 != 0) {
                        i27 = 1;
                    } else {
                        i27 = i20;
                    }
                    if (i22 != 0) {
                        z11 = true;
                    }
                    if (i24 != 0) {
                        i25 = Integer.MAX_VALUE;
                    }
                    InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q117 = ComposerKt.f3003a;
                    m1531b(str, interfaceC0500b2, c7218l3, interfaceC2052l3, i27, z11, i25, 1, composerImplMo1636j, 12582912 | (i14 & 14) | (i14 & 112) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (458752 & i14) | (i14 & 3670016), 0);
                    i28 = i25;
                    z12 = z11;
                    interfaceC0500b3 = interfaceC0500b2;
                    c7218l4 = c7218l3;
                    interfaceC2052l4 = interfaceC2052l3;
                    i29 = i27;
                }
                c5332q0M1612T = composerImplMo1636j.m1612T();
                if (c5332q0M1612T == null) {
                    return;
                }
                c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$7
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // cm.InterfaceC2056p
                    /* JADX INFO: renamed from: m0 */
                    public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                        num.intValue();
                        BasicTextKt.m1532c(str, interfaceC0500b3, c7218l4, interfaceC2052l4, i29, z12, i28, interfaceC0476a2, C8573r0.m16737l1(i12 | 1), i13);
                        return C9072e.f47360a;
                    }
                };
            }
            i14 |= 24576;
            i20 = i10;
            i22 = i13 & 32;
            if (i22 != 0) {
                if ((i12 & 458752) == 0) {
                    z11 = z10;
                    if (composerImplMo1636j.m1598G(z11)) {
                        i23 = 131072;
                    } else {
                        i23 = 65536;
                    }
                    i14 |= i23;
                }
                i24 = i13 & 64;
                if (i24 != 0) {
                    i14 |= 1572864;
                    i25 = i11;
                } else {
                    i25 = i11;
                    if ((i12 & 3670016) == 0) {
                        if (composerImplMo1636j.m1594E(i25)) {
                            i26 = 1048576;
                        } else {
                            i26 = 524288;
                        }
                        i14 |= i26;
                    }
                }
                if ((i14 & 2995931) == 599186) {
                    if (i30 != 0) {
                        interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                    } else {
                        interfaceC0500b2 = interfaceC0500b;
                    }
                    if (i15 != 0) {
                        c7218l3 = C7218l.f40599c;
                    } else {
                        c7218l3 = c7218l2;
                    }
                    if (i17 != 0) {
                        interfaceC2052l3 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$6
                            @Override // cm.InterfaceC2052l
                            /* JADX INFO: renamed from: n */
                            public final C9072e mo528n(C7216j c7216j) {
                                C5207g.m11111f(c7216j, "it");
                                return C9072e.f47360a;
                            }
                        };
                    } else {
                        interfaceC2052l3 = interfaceC2052l2;
                    }
                    if (i19 != 0) {
                        i27 = 1;
                    } else {
                        i27 = i20;
                    }
                    if (i22 != 0) {
                        z11 = true;
                    }
                    if (i24 != 0) {
                        i25 = Integer.MAX_VALUE;
                    }
                    InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q118 = ComposerKt.f3003a;
                    m1531b(str, interfaceC0500b2, c7218l3, interfaceC2052l3, i27, z11, i25, 1, composerImplMo1636j, 12582912 | (i14 & 14) | (i14 & 112) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (458752 & i14) | (i14 & 3670016), 0);
                    i28 = i25;
                    z12 = z11;
                    interfaceC0500b3 = interfaceC0500b2;
                    c7218l4 = c7218l3;
                    interfaceC2052l4 = interfaceC2052l3;
                    i29 = i27;
                } else {
                    if (i30 != 0) {
                        interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                    } else {
                        interfaceC0500b2 = interfaceC0500b;
                    }
                    if (i15 != 0) {
                        c7218l3 = C7218l.f40599c;
                    } else {
                        c7218l3 = c7218l2;
                    }
                    if (i17 != 0) {
                        interfaceC2052l3 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$6
                            @Override // cm.InterfaceC2052l
                            /* JADX INFO: renamed from: n */
                            public final C9072e mo528n(C7216j c7216j) {
                                C5207g.m11111f(c7216j, "it");
                                return C9072e.f47360a;
                            }
                        };
                    } else {
                        interfaceC2052l3 = interfaceC2052l2;
                    }
                    if (i19 != 0) {
                        i27 = 1;
                    } else {
                        i27 = i20;
                    }
                    if (i22 != 0) {
                        z11 = true;
                    }
                    if (i24 != 0) {
                        i25 = Integer.MAX_VALUE;
                    }
                    InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q119 = ComposerKt.f3003a;
                    m1531b(str, interfaceC0500b2, c7218l3, interfaceC2052l3, i27, z11, i25, 1, composerImplMo1636j, 12582912 | (i14 & 14) | (i14 & 112) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (458752 & i14) | (i14 & 3670016), 0);
                    i28 = i25;
                    z12 = z11;
                    interfaceC0500b3 = interfaceC0500b2;
                    c7218l4 = c7218l3;
                    interfaceC2052l4 = interfaceC2052l3;
                    i29 = i27;
                }
                c5332q0M1612T = composerImplMo1636j.m1612T();
                if (c5332q0M1612T == null) {
                    return;
                }
                c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$7
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // cm.InterfaceC2056p
                    /* JADX INFO: renamed from: m0 */
                    public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                        num.intValue();
                        BasicTextKt.m1532c(str, interfaceC0500b3, c7218l4, interfaceC2052l4, i29, z12, i28, interfaceC0476a2, C8573r0.m16737l1(i12 | 1), i13);
                        return C9072e.f47360a;
                    }
                };
            }
            i14 |= 196608;
            z11 = z10;
            i24 = i13 & 64;
            if (i24 != 0) {
                i14 |= 1572864;
                i25 = i11;
            } else {
                i25 = i11;
                if ((i12 & 3670016) == 0) {
                    if (composerImplMo1636j.m1594E(i25)) {
                        i26 = 1048576;
                    } else {
                        i26 = 524288;
                    }
                    i14 |= i26;
                }
            }
            if ((i14 & 2995931) == 599186) {
                if (i30 != 0) {
                    interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                } else {
                    interfaceC0500b2 = interfaceC0500b;
                }
                if (i15 != 0) {
                    c7218l3 = C7218l.f40599c;
                } else {
                    c7218l3 = c7218l2;
                }
                if (i17 != 0) {
                    interfaceC2052l3 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$6
                        @Override // cm.InterfaceC2052l
                        /* JADX INFO: renamed from: n */
                        public final C9072e mo528n(C7216j c7216j) {
                            C5207g.m11111f(c7216j, "it");
                            return C9072e.f47360a;
                        }
                    };
                } else {
                    interfaceC2052l3 = interfaceC2052l2;
                }
                if (i19 != 0) {
                    i27 = 1;
                } else {
                    i27 = i20;
                }
                if (i22 != 0) {
                    z11 = true;
                }
                if (i24 != 0) {
                    i25 = Integer.MAX_VALUE;
                }
                InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q1110 = ComposerKt.f3003a;
                m1531b(str, interfaceC0500b2, c7218l3, interfaceC2052l3, i27, z11, i25, 1, composerImplMo1636j, 12582912 | (i14 & 14) | (i14 & 112) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (458752 & i14) | (i14 & 3670016), 0);
                i28 = i25;
                z12 = z11;
                interfaceC0500b3 = interfaceC0500b2;
                c7218l4 = c7218l3;
                interfaceC2052l4 = interfaceC2052l3;
                i29 = i27;
            } else {
                if (i30 != 0) {
                    interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                } else {
                    interfaceC0500b2 = interfaceC0500b;
                }
                if (i15 != 0) {
                    c7218l3 = C7218l.f40599c;
                } else {
                    c7218l3 = c7218l2;
                }
                if (i17 != 0) {
                    interfaceC2052l3 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$6
                        @Override // cm.InterfaceC2052l
                        /* JADX INFO: renamed from: n */
                        public final C9072e mo528n(C7216j c7216j) {
                            C5207g.m11111f(c7216j, "it");
                            return C9072e.f47360a;
                        }
                    };
                } else {
                    interfaceC2052l3 = interfaceC2052l2;
                }
                if (i19 != 0) {
                    i27 = 1;
                } else {
                    i27 = i20;
                }
                if (i22 != 0) {
                    z11 = true;
                }
                if (i24 != 0) {
                    i25 = Integer.MAX_VALUE;
                }
                InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q1111 = ComposerKt.f3003a;
                m1531b(str, interfaceC0500b2, c7218l3, interfaceC2052l3, i27, z11, i25, 1, composerImplMo1636j, 12582912 | (i14 & 14) | (i14 & 112) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (458752 & i14) | (i14 & 3670016), 0);
                i28 = i25;
                z12 = z11;
                interfaceC0500b3 = interfaceC0500b2;
                c7218l4 = c7218l3;
                interfaceC2052l4 = interfaceC2052l3;
                i29 = i27;
            }
            c5332q0M1612T = composerImplMo1636j.m1612T();
            if (c5332q0M1612T == null) {
                return;
            }
            c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$7
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // cm.InterfaceC2056p
                /* JADX INFO: renamed from: m0 */
                public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                    num.intValue();
                    BasicTextKt.m1532c(str, interfaceC0500b3, c7218l4, interfaceC2052l4, i29, z12, i28, interfaceC0476a2, C8573r0.m16737l1(i12 | 1), i13);
                    return C9072e.f47360a;
                }
            };
        }
        i14 |= 48;
        i15 = i13 & 4;
        if (i15 != 0) {
            if ((i12 & 896) == 0) {
                c7218l2 = c7218l;
                if (composerImplMo1636j.mo1665y(c7218l2)) {
                    i16 = 256;
                } else {
                    i16 = BuildConfig.SDK_TRUNCATE_LENGTH;
                }
                i14 |= i16;
            }
            i17 = i13 & 8;
            if (i17 != 0) {
                if ((i12 & 7168) == 0) {
                    interfaceC2052l2 = interfaceC2052l;
                    if (composerImplMo1636j.m1600H(interfaceC2052l2)) {
                        i18 = 2048;
                    } else {
                        i18 = 1024;
                    }
                    i14 |= i18;
                }
                i19 = i13 & 16;
                if (i19 != 0) {
                    if ((i12 & 57344) == 0) {
                        i20 = i10;
                        if (composerImplMo1636j.m1594E(i20)) {
                            i21 = 16384;
                        } else {
                            i21 = 8192;
                        }
                        i14 |= i21;
                    }
                    i22 = i13 & 32;
                    if (i22 != 0) {
                        if ((i12 & 458752) == 0) {
                            z11 = z10;
                            if (composerImplMo1636j.m1598G(z11)) {
                                i23 = 131072;
                            } else {
                                i23 = 65536;
                            }
                            i14 |= i23;
                        }
                        i24 = i13 & 64;
                        if (i24 != 0) {
                            i14 |= 1572864;
                            i25 = i11;
                        } else {
                            i25 = i11;
                            if ((i12 & 3670016) == 0) {
                                if (composerImplMo1636j.m1594E(i25)) {
                                    i26 = 1048576;
                                } else {
                                    i26 = 524288;
                                }
                                i14 |= i26;
                            }
                        }
                        if ((i14 & 2995931) == 599186) {
                            if (i30 != 0) {
                                interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                            } else {
                                interfaceC0500b2 = interfaceC0500b;
                            }
                            if (i15 != 0) {
                                c7218l3 = C7218l.f40599c;
                            } else {
                                c7218l3 = c7218l2;
                            }
                            if (i17 != 0) {
                                interfaceC2052l3 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$6
                                    @Override // cm.InterfaceC2052l
                                    /* JADX INFO: renamed from: n */
                                    public final C9072e mo528n(C7216j c7216j) {
                                        C5207g.m11111f(c7216j, "it");
                                        return C9072e.f47360a;
                                    }
                                };
                            } else {
                                interfaceC2052l3 = interfaceC2052l2;
                            }
                            if (i19 != 0) {
                                i27 = 1;
                            } else {
                                i27 = i20;
                            }
                            if (i22 != 0) {
                                z11 = true;
                            }
                            if (i24 != 0) {
                                i25 = Integer.MAX_VALUE;
                            }
                            InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q1112 = ComposerKt.f3003a;
                            m1531b(str, interfaceC0500b2, c7218l3, interfaceC2052l3, i27, z11, i25, 1, composerImplMo1636j, 12582912 | (i14 & 14) | (i14 & 112) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (458752 & i14) | (i14 & 3670016), 0);
                            i28 = i25;
                            z12 = z11;
                            interfaceC0500b3 = interfaceC0500b2;
                            c7218l4 = c7218l3;
                            interfaceC2052l4 = interfaceC2052l3;
                            i29 = i27;
                        } else {
                            if (i30 != 0) {
                                interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                            } else {
                                interfaceC0500b2 = interfaceC0500b;
                            }
                            if (i15 != 0) {
                                c7218l3 = C7218l.f40599c;
                            } else {
                                c7218l3 = c7218l2;
                            }
                            if (i17 != 0) {
                                interfaceC2052l3 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$6
                                    @Override // cm.InterfaceC2052l
                                    /* JADX INFO: renamed from: n */
                                    public final C9072e mo528n(C7216j c7216j) {
                                        C5207g.m11111f(c7216j, "it");
                                        return C9072e.f47360a;
                                    }
                                };
                            } else {
                                interfaceC2052l3 = interfaceC2052l2;
                            }
                            if (i19 != 0) {
                                i27 = 1;
                            } else {
                                i27 = i20;
                            }
                            if (i22 != 0) {
                                z11 = true;
                            }
                            if (i24 != 0) {
                                i25 = Integer.MAX_VALUE;
                            }
                            InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q1113 = ComposerKt.f3003a;
                            m1531b(str, interfaceC0500b2, c7218l3, interfaceC2052l3, i27, z11, i25, 1, composerImplMo1636j, 12582912 | (i14 & 14) | (i14 & 112) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (458752 & i14) | (i14 & 3670016), 0);
                            i28 = i25;
                            z12 = z11;
                            interfaceC0500b3 = interfaceC0500b2;
                            c7218l4 = c7218l3;
                            interfaceC2052l4 = interfaceC2052l3;
                            i29 = i27;
                        }
                        c5332q0M1612T = composerImplMo1636j.m1612T();
                        if (c5332q0M1612T == null) {
                            return;
                        }
                        c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$7
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                                num.intValue();
                                BasicTextKt.m1532c(str, interfaceC0500b3, c7218l4, interfaceC2052l4, i29, z12, i28, interfaceC0476a2, C8573r0.m16737l1(i12 | 1), i13);
                                return C9072e.f47360a;
                            }
                        };
                    }
                    i14 |= 196608;
                    z11 = z10;
                    i24 = i13 & 64;
                    if (i24 != 0) {
                        i14 |= 1572864;
                        i25 = i11;
                    } else {
                        i25 = i11;
                        if ((i12 & 3670016) == 0) {
                            if (composerImplMo1636j.m1594E(i25)) {
                                i26 = 1048576;
                            } else {
                                i26 = 524288;
                            }
                            i14 |= i26;
                        }
                    }
                    if ((i14 & 2995931) == 599186) {
                        if (i30 != 0) {
                            interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                        } else {
                            interfaceC0500b2 = interfaceC0500b;
                        }
                        if (i15 != 0) {
                            c7218l3 = C7218l.f40599c;
                        } else {
                            c7218l3 = c7218l2;
                        }
                        if (i17 != 0) {
                            interfaceC2052l3 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$6
                                @Override // cm.InterfaceC2052l
                                /* JADX INFO: renamed from: n */
                                public final C9072e mo528n(C7216j c7216j) {
                                    C5207g.m11111f(c7216j, "it");
                                    return C9072e.f47360a;
                                }
                            };
                        } else {
                            interfaceC2052l3 = interfaceC2052l2;
                        }
                        if (i19 != 0) {
                            i27 = 1;
                        } else {
                            i27 = i20;
                        }
                        if (i22 != 0) {
                            z11 = true;
                        }
                        if (i24 != 0) {
                            i25 = Integer.MAX_VALUE;
                        }
                        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q1114 = ComposerKt.f3003a;
                        m1531b(str, interfaceC0500b2, c7218l3, interfaceC2052l3, i27, z11, i25, 1, composerImplMo1636j, 12582912 | (i14 & 14) | (i14 & 112) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (458752 & i14) | (i14 & 3670016), 0);
                        i28 = i25;
                        z12 = z11;
                        interfaceC0500b3 = interfaceC0500b2;
                        c7218l4 = c7218l3;
                        interfaceC2052l4 = interfaceC2052l3;
                        i29 = i27;
                    } else {
                        if (i30 != 0) {
                            interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                        } else {
                            interfaceC0500b2 = interfaceC0500b;
                        }
                        if (i15 != 0) {
                            c7218l3 = C7218l.f40599c;
                        } else {
                            c7218l3 = c7218l2;
                        }
                        if (i17 != 0) {
                            interfaceC2052l3 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$6
                                @Override // cm.InterfaceC2052l
                                /* JADX INFO: renamed from: n */
                                public final C9072e mo528n(C7216j c7216j) {
                                    C5207g.m11111f(c7216j, "it");
                                    return C9072e.f47360a;
                                }
                            };
                        } else {
                            interfaceC2052l3 = interfaceC2052l2;
                        }
                        if (i19 != 0) {
                            i27 = 1;
                        } else {
                            i27 = i20;
                        }
                        if (i22 != 0) {
                            z11 = true;
                        }
                        if (i24 != 0) {
                            i25 = Integer.MAX_VALUE;
                        }
                        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q1115 = ComposerKt.f3003a;
                        m1531b(str, interfaceC0500b2, c7218l3, interfaceC2052l3, i27, z11, i25, 1, composerImplMo1636j, 12582912 | (i14 & 14) | (i14 & 112) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (458752 & i14) | (i14 & 3670016), 0);
                        i28 = i25;
                        z12 = z11;
                        interfaceC0500b3 = interfaceC0500b2;
                        c7218l4 = c7218l3;
                        interfaceC2052l4 = interfaceC2052l3;
                        i29 = i27;
                    }
                    c5332q0M1612T = composerImplMo1636j.m1612T();
                    if (c5332q0M1612T == null) {
                        return;
                    }
                    c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$7
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                            num.intValue();
                            BasicTextKt.m1532c(str, interfaceC0500b3, c7218l4, interfaceC2052l4, i29, z12, i28, interfaceC0476a2, C8573r0.m16737l1(i12 | 1), i13);
                            return C9072e.f47360a;
                        }
                    };
                }
                i14 |= 24576;
                i20 = i10;
                i22 = i13 & 32;
                if (i22 != 0) {
                    if ((i12 & 458752) == 0) {
                        z11 = z10;
                        if (composerImplMo1636j.m1598G(z11)) {
                            i23 = 131072;
                        } else {
                            i23 = 65536;
                        }
                        i14 |= i23;
                    }
                    i24 = i13 & 64;
                    if (i24 != 0) {
                        i14 |= 1572864;
                        i25 = i11;
                    } else {
                        i25 = i11;
                        if ((i12 & 3670016) == 0) {
                            if (composerImplMo1636j.m1594E(i25)) {
                                i26 = 1048576;
                            } else {
                                i26 = 524288;
                            }
                            i14 |= i26;
                        }
                    }
                    if ((i14 & 2995931) == 599186) {
                        if (i30 != 0) {
                            interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                        } else {
                            interfaceC0500b2 = interfaceC0500b;
                        }
                        if (i15 != 0) {
                            c7218l3 = C7218l.f40599c;
                        } else {
                            c7218l3 = c7218l2;
                        }
                        if (i17 != 0) {
                            interfaceC2052l3 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$6
                                @Override // cm.InterfaceC2052l
                                /* JADX INFO: renamed from: n */
                                public final C9072e mo528n(C7216j c7216j) {
                                    C5207g.m11111f(c7216j, "it");
                                    return C9072e.f47360a;
                                }
                            };
                        } else {
                            interfaceC2052l3 = interfaceC2052l2;
                        }
                        if (i19 != 0) {
                            i27 = 1;
                        } else {
                            i27 = i20;
                        }
                        if (i22 != 0) {
                            z11 = true;
                        }
                        if (i24 != 0) {
                            i25 = Integer.MAX_VALUE;
                        }
                        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q1116 = ComposerKt.f3003a;
                        m1531b(str, interfaceC0500b2, c7218l3, interfaceC2052l3, i27, z11, i25, 1, composerImplMo1636j, 12582912 | (i14 & 14) | (i14 & 112) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (458752 & i14) | (i14 & 3670016), 0);
                        i28 = i25;
                        z12 = z11;
                        interfaceC0500b3 = interfaceC0500b2;
                        c7218l4 = c7218l3;
                        interfaceC2052l4 = interfaceC2052l3;
                        i29 = i27;
                    } else {
                        if (i30 != 0) {
                            interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                        } else {
                            interfaceC0500b2 = interfaceC0500b;
                        }
                        if (i15 != 0) {
                            c7218l3 = C7218l.f40599c;
                        } else {
                            c7218l3 = c7218l2;
                        }
                        if (i17 != 0) {
                            interfaceC2052l3 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$6
                                @Override // cm.InterfaceC2052l
                                /* JADX INFO: renamed from: n */
                                public final C9072e mo528n(C7216j c7216j) {
                                    C5207g.m11111f(c7216j, "it");
                                    return C9072e.f47360a;
                                }
                            };
                        } else {
                            interfaceC2052l3 = interfaceC2052l2;
                        }
                        if (i19 != 0) {
                            i27 = 1;
                        } else {
                            i27 = i20;
                        }
                        if (i22 != 0) {
                            z11 = true;
                        }
                        if (i24 != 0) {
                            i25 = Integer.MAX_VALUE;
                        }
                        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q1117 = ComposerKt.f3003a;
                        m1531b(str, interfaceC0500b2, c7218l3, interfaceC2052l3, i27, z11, i25, 1, composerImplMo1636j, 12582912 | (i14 & 14) | (i14 & 112) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (458752 & i14) | (i14 & 3670016), 0);
                        i28 = i25;
                        z12 = z11;
                        interfaceC0500b3 = interfaceC0500b2;
                        c7218l4 = c7218l3;
                        interfaceC2052l4 = interfaceC2052l3;
                        i29 = i27;
                    }
                    c5332q0M1612T = composerImplMo1636j.m1612T();
                    if (c5332q0M1612T == null) {
                        return;
                    }
                    c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$7
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                            num.intValue();
                            BasicTextKt.m1532c(str, interfaceC0500b3, c7218l4, interfaceC2052l4, i29, z12, i28, interfaceC0476a2, C8573r0.m16737l1(i12 | 1), i13);
                            return C9072e.f47360a;
                        }
                    };
                }
                i14 |= 196608;
                z11 = z10;
                i24 = i13 & 64;
                if (i24 != 0) {
                    i14 |= 1572864;
                    i25 = i11;
                } else {
                    i25 = i11;
                    if ((i12 & 3670016) == 0) {
                        if (composerImplMo1636j.m1594E(i25)) {
                            i26 = 1048576;
                        } else {
                            i26 = 524288;
                        }
                        i14 |= i26;
                    }
                }
                if ((i14 & 2995931) == 599186) {
                    if (i30 != 0) {
                        interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                    } else {
                        interfaceC0500b2 = interfaceC0500b;
                    }
                    if (i15 != 0) {
                        c7218l3 = C7218l.f40599c;
                    } else {
                        c7218l3 = c7218l2;
                    }
                    if (i17 != 0) {
                        interfaceC2052l3 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$6
                            @Override // cm.InterfaceC2052l
                            /* JADX INFO: renamed from: n */
                            public final C9072e mo528n(C7216j c7216j) {
                                C5207g.m11111f(c7216j, "it");
                                return C9072e.f47360a;
                            }
                        };
                    } else {
                        interfaceC2052l3 = interfaceC2052l2;
                    }
                    if (i19 != 0) {
                        i27 = 1;
                    } else {
                        i27 = i20;
                    }
                    if (i22 != 0) {
                        z11 = true;
                    }
                    if (i24 != 0) {
                        i25 = Integer.MAX_VALUE;
                    }
                    InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q1118 = ComposerKt.f3003a;
                    m1531b(str, interfaceC0500b2, c7218l3, interfaceC2052l3, i27, z11, i25, 1, composerImplMo1636j, 12582912 | (i14 & 14) | (i14 & 112) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (458752 & i14) | (i14 & 3670016), 0);
                    i28 = i25;
                    z12 = z11;
                    interfaceC0500b3 = interfaceC0500b2;
                    c7218l4 = c7218l3;
                    interfaceC2052l4 = interfaceC2052l3;
                    i29 = i27;
                } else {
                    if (i30 != 0) {
                        interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                    } else {
                        interfaceC0500b2 = interfaceC0500b;
                    }
                    if (i15 != 0) {
                        c7218l3 = C7218l.f40599c;
                    } else {
                        c7218l3 = c7218l2;
                    }
                    if (i17 != 0) {
                        interfaceC2052l3 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$6
                            @Override // cm.InterfaceC2052l
                            /* JADX INFO: renamed from: n */
                            public final C9072e mo528n(C7216j c7216j) {
                                C5207g.m11111f(c7216j, "it");
                                return C9072e.f47360a;
                            }
                        };
                    } else {
                        interfaceC2052l3 = interfaceC2052l2;
                    }
                    if (i19 != 0) {
                        i27 = 1;
                    } else {
                        i27 = i20;
                    }
                    if (i22 != 0) {
                        z11 = true;
                    }
                    if (i24 != 0) {
                        i25 = Integer.MAX_VALUE;
                    }
                    InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q1119 = ComposerKt.f3003a;
                    m1531b(str, interfaceC0500b2, c7218l3, interfaceC2052l3, i27, z11, i25, 1, composerImplMo1636j, 12582912 | (i14 & 14) | (i14 & 112) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (458752 & i14) | (i14 & 3670016), 0);
                    i28 = i25;
                    z12 = z11;
                    interfaceC0500b3 = interfaceC0500b2;
                    c7218l4 = c7218l3;
                    interfaceC2052l4 = interfaceC2052l3;
                    i29 = i27;
                }
                c5332q0M1612T = composerImplMo1636j.m1612T();
                if (c5332q0M1612T == null) {
                    return;
                }
                c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$7
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // cm.InterfaceC2056p
                    /* JADX INFO: renamed from: m0 */
                    public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                        num.intValue();
                        BasicTextKt.m1532c(str, interfaceC0500b3, c7218l4, interfaceC2052l4, i29, z12, i28, interfaceC0476a2, C8573r0.m16737l1(i12 | 1), i13);
                        return C9072e.f47360a;
                    }
                };
            }
            i14 |= 3072;
            interfaceC2052l2 = interfaceC2052l;
            i19 = i13 & 16;
            if (i19 != 0) {
                if ((i12 & 57344) == 0) {
                    i20 = i10;
                    if (composerImplMo1636j.m1594E(i20)) {
                        i21 = 16384;
                    } else {
                        i21 = 8192;
                    }
                    i14 |= i21;
                }
                i22 = i13 & 32;
                if (i22 != 0) {
                    if ((i12 & 458752) == 0) {
                        z11 = z10;
                        if (composerImplMo1636j.m1598G(z11)) {
                            i23 = 131072;
                        } else {
                            i23 = 65536;
                        }
                        i14 |= i23;
                    }
                    i24 = i13 & 64;
                    if (i24 != 0) {
                        i14 |= 1572864;
                        i25 = i11;
                    } else {
                        i25 = i11;
                        if ((i12 & 3670016) == 0) {
                            if (composerImplMo1636j.m1594E(i25)) {
                                i26 = 1048576;
                            } else {
                                i26 = 524288;
                            }
                            i14 |= i26;
                        }
                    }
                    if ((i14 & 2995931) == 599186) {
                        if (i30 != 0) {
                            interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                        } else {
                            interfaceC0500b2 = interfaceC0500b;
                        }
                        if (i15 != 0) {
                            c7218l3 = C7218l.f40599c;
                        } else {
                            c7218l3 = c7218l2;
                        }
                        if (i17 != 0) {
                            interfaceC2052l3 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$6
                                @Override // cm.InterfaceC2052l
                                /* JADX INFO: renamed from: n */
                                public final C9072e mo528n(C7216j c7216j) {
                                    C5207g.m11111f(c7216j, "it");
                                    return C9072e.f47360a;
                                }
                            };
                        } else {
                            interfaceC2052l3 = interfaceC2052l2;
                        }
                        if (i19 != 0) {
                            i27 = 1;
                        } else {
                            i27 = i20;
                        }
                        if (i22 != 0) {
                            z11 = true;
                        }
                        if (i24 != 0) {
                            i25 = Integer.MAX_VALUE;
                        }
                        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q11110 = ComposerKt.f3003a;
                        m1531b(str, interfaceC0500b2, c7218l3, interfaceC2052l3, i27, z11, i25, 1, composerImplMo1636j, 12582912 | (i14 & 14) | (i14 & 112) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (458752 & i14) | (i14 & 3670016), 0);
                        i28 = i25;
                        z12 = z11;
                        interfaceC0500b3 = interfaceC0500b2;
                        c7218l4 = c7218l3;
                        interfaceC2052l4 = interfaceC2052l3;
                        i29 = i27;
                    } else {
                        if (i30 != 0) {
                            interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                        } else {
                            interfaceC0500b2 = interfaceC0500b;
                        }
                        if (i15 != 0) {
                            c7218l3 = C7218l.f40599c;
                        } else {
                            c7218l3 = c7218l2;
                        }
                        if (i17 != 0) {
                            interfaceC2052l3 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$6
                                @Override // cm.InterfaceC2052l
                                /* JADX INFO: renamed from: n */
                                public final C9072e mo528n(C7216j c7216j) {
                                    C5207g.m11111f(c7216j, "it");
                                    return C9072e.f47360a;
                                }
                            };
                        } else {
                            interfaceC2052l3 = interfaceC2052l2;
                        }
                        if (i19 != 0) {
                            i27 = 1;
                        } else {
                            i27 = i20;
                        }
                        if (i22 != 0) {
                            z11 = true;
                        }
                        if (i24 != 0) {
                            i25 = Integer.MAX_VALUE;
                        }
                        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q11111 = ComposerKt.f3003a;
                        m1531b(str, interfaceC0500b2, c7218l3, interfaceC2052l3, i27, z11, i25, 1, composerImplMo1636j, 12582912 | (i14 & 14) | (i14 & 112) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (458752 & i14) | (i14 & 3670016), 0);
                        i28 = i25;
                        z12 = z11;
                        interfaceC0500b3 = interfaceC0500b2;
                        c7218l4 = c7218l3;
                        interfaceC2052l4 = interfaceC2052l3;
                        i29 = i27;
                    }
                    c5332q0M1612T = composerImplMo1636j.m1612T();
                    if (c5332q0M1612T == null) {
                        return;
                    }
                    c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$7
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                            num.intValue();
                            BasicTextKt.m1532c(str, interfaceC0500b3, c7218l4, interfaceC2052l4, i29, z12, i28, interfaceC0476a2, C8573r0.m16737l1(i12 | 1), i13);
                            return C9072e.f47360a;
                        }
                    };
                }
                i14 |= 196608;
                z11 = z10;
                i24 = i13 & 64;
                if (i24 != 0) {
                    i14 |= 1572864;
                    i25 = i11;
                } else {
                    i25 = i11;
                    if ((i12 & 3670016) == 0) {
                        if (composerImplMo1636j.m1594E(i25)) {
                            i26 = 1048576;
                        } else {
                            i26 = 524288;
                        }
                        i14 |= i26;
                    }
                }
                if ((i14 & 2995931) == 599186) {
                    if (i30 != 0) {
                        interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                    } else {
                        interfaceC0500b2 = interfaceC0500b;
                    }
                    if (i15 != 0) {
                        c7218l3 = C7218l.f40599c;
                    } else {
                        c7218l3 = c7218l2;
                    }
                    if (i17 != 0) {
                        interfaceC2052l3 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$6
                            @Override // cm.InterfaceC2052l
                            /* JADX INFO: renamed from: n */
                            public final C9072e mo528n(C7216j c7216j) {
                                C5207g.m11111f(c7216j, "it");
                                return C9072e.f47360a;
                            }
                        };
                    } else {
                        interfaceC2052l3 = interfaceC2052l2;
                    }
                    if (i19 != 0) {
                        i27 = 1;
                    } else {
                        i27 = i20;
                    }
                    if (i22 != 0) {
                        z11 = true;
                    }
                    if (i24 != 0) {
                        i25 = Integer.MAX_VALUE;
                    }
                    InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q11112 = ComposerKt.f3003a;
                    m1531b(str, interfaceC0500b2, c7218l3, interfaceC2052l3, i27, z11, i25, 1, composerImplMo1636j, 12582912 | (i14 & 14) | (i14 & 112) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (458752 & i14) | (i14 & 3670016), 0);
                    i28 = i25;
                    z12 = z11;
                    interfaceC0500b3 = interfaceC0500b2;
                    c7218l4 = c7218l3;
                    interfaceC2052l4 = interfaceC2052l3;
                    i29 = i27;
                } else {
                    if (i30 != 0) {
                        interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                    } else {
                        interfaceC0500b2 = interfaceC0500b;
                    }
                    if (i15 != 0) {
                        c7218l3 = C7218l.f40599c;
                    } else {
                        c7218l3 = c7218l2;
                    }
                    if (i17 != 0) {
                        interfaceC2052l3 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$6
                            @Override // cm.InterfaceC2052l
                            /* JADX INFO: renamed from: n */
                            public final C9072e mo528n(C7216j c7216j) {
                                C5207g.m11111f(c7216j, "it");
                                return C9072e.f47360a;
                            }
                        };
                    } else {
                        interfaceC2052l3 = interfaceC2052l2;
                    }
                    if (i19 != 0) {
                        i27 = 1;
                    } else {
                        i27 = i20;
                    }
                    if (i22 != 0) {
                        z11 = true;
                    }
                    if (i24 != 0) {
                        i25 = Integer.MAX_VALUE;
                    }
                    InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q11113 = ComposerKt.f3003a;
                    m1531b(str, interfaceC0500b2, c7218l3, interfaceC2052l3, i27, z11, i25, 1, composerImplMo1636j, 12582912 | (i14 & 14) | (i14 & 112) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (458752 & i14) | (i14 & 3670016), 0);
                    i28 = i25;
                    z12 = z11;
                    interfaceC0500b3 = interfaceC0500b2;
                    c7218l4 = c7218l3;
                    interfaceC2052l4 = interfaceC2052l3;
                    i29 = i27;
                }
                c5332q0M1612T = composerImplMo1636j.m1612T();
                if (c5332q0M1612T == null) {
                    return;
                }
                c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$7
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // cm.InterfaceC2056p
                    /* JADX INFO: renamed from: m0 */
                    public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                        num.intValue();
                        BasicTextKt.m1532c(str, interfaceC0500b3, c7218l4, interfaceC2052l4, i29, z12, i28, interfaceC0476a2, C8573r0.m16737l1(i12 | 1), i13);
                        return C9072e.f47360a;
                    }
                };
            }
            i14 |= 24576;
            i20 = i10;
            i22 = i13 & 32;
            if (i22 != 0) {
                if ((i12 & 458752) == 0) {
                    z11 = z10;
                    if (composerImplMo1636j.m1598G(z11)) {
                        i23 = 131072;
                    } else {
                        i23 = 65536;
                    }
                    i14 |= i23;
                }
                i24 = i13 & 64;
                if (i24 != 0) {
                    i14 |= 1572864;
                    i25 = i11;
                } else {
                    i25 = i11;
                    if ((i12 & 3670016) == 0) {
                        if (composerImplMo1636j.m1594E(i25)) {
                            i26 = 1048576;
                        } else {
                            i26 = 524288;
                        }
                        i14 |= i26;
                    }
                }
                if ((i14 & 2995931) == 599186) {
                    if (i30 != 0) {
                        interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                    } else {
                        interfaceC0500b2 = interfaceC0500b;
                    }
                    if (i15 != 0) {
                        c7218l3 = C7218l.f40599c;
                    } else {
                        c7218l3 = c7218l2;
                    }
                    if (i17 != 0) {
                        interfaceC2052l3 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$6
                            @Override // cm.InterfaceC2052l
                            /* JADX INFO: renamed from: n */
                            public final C9072e mo528n(C7216j c7216j) {
                                C5207g.m11111f(c7216j, "it");
                                return C9072e.f47360a;
                            }
                        };
                    } else {
                        interfaceC2052l3 = interfaceC2052l2;
                    }
                    if (i19 != 0) {
                        i27 = 1;
                    } else {
                        i27 = i20;
                    }
                    if (i22 != 0) {
                        z11 = true;
                    }
                    if (i24 != 0) {
                        i25 = Integer.MAX_VALUE;
                    }
                    InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q11114 = ComposerKt.f3003a;
                    m1531b(str, interfaceC0500b2, c7218l3, interfaceC2052l3, i27, z11, i25, 1, composerImplMo1636j, 12582912 | (i14 & 14) | (i14 & 112) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (458752 & i14) | (i14 & 3670016), 0);
                    i28 = i25;
                    z12 = z11;
                    interfaceC0500b3 = interfaceC0500b2;
                    c7218l4 = c7218l3;
                    interfaceC2052l4 = interfaceC2052l3;
                    i29 = i27;
                } else {
                    if (i30 != 0) {
                        interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                    } else {
                        interfaceC0500b2 = interfaceC0500b;
                    }
                    if (i15 != 0) {
                        c7218l3 = C7218l.f40599c;
                    } else {
                        c7218l3 = c7218l2;
                    }
                    if (i17 != 0) {
                        interfaceC2052l3 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$6
                            @Override // cm.InterfaceC2052l
                            /* JADX INFO: renamed from: n */
                            public final C9072e mo528n(C7216j c7216j) {
                                C5207g.m11111f(c7216j, "it");
                                return C9072e.f47360a;
                            }
                        };
                    } else {
                        interfaceC2052l3 = interfaceC2052l2;
                    }
                    if (i19 != 0) {
                        i27 = 1;
                    } else {
                        i27 = i20;
                    }
                    if (i22 != 0) {
                        z11 = true;
                    }
                    if (i24 != 0) {
                        i25 = Integer.MAX_VALUE;
                    }
                    InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q11115 = ComposerKt.f3003a;
                    m1531b(str, interfaceC0500b2, c7218l3, interfaceC2052l3, i27, z11, i25, 1, composerImplMo1636j, 12582912 | (i14 & 14) | (i14 & 112) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (458752 & i14) | (i14 & 3670016), 0);
                    i28 = i25;
                    z12 = z11;
                    interfaceC0500b3 = interfaceC0500b2;
                    c7218l4 = c7218l3;
                    interfaceC2052l4 = interfaceC2052l3;
                    i29 = i27;
                }
                c5332q0M1612T = composerImplMo1636j.m1612T();
                if (c5332q0M1612T == null) {
                    return;
                }
                c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$7
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // cm.InterfaceC2056p
                    /* JADX INFO: renamed from: m0 */
                    public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                        num.intValue();
                        BasicTextKt.m1532c(str, interfaceC0500b3, c7218l4, interfaceC2052l4, i29, z12, i28, interfaceC0476a2, C8573r0.m16737l1(i12 | 1), i13);
                        return C9072e.f47360a;
                    }
                };
            }
            i14 |= 196608;
            z11 = z10;
            i24 = i13 & 64;
            if (i24 != 0) {
                i14 |= 1572864;
                i25 = i11;
            } else {
                i25 = i11;
                if ((i12 & 3670016) == 0) {
                    if (composerImplMo1636j.m1594E(i25)) {
                        i26 = 1048576;
                    } else {
                        i26 = 524288;
                    }
                    i14 |= i26;
                }
            }
            if ((i14 & 2995931) == 599186) {
                if (i30 != 0) {
                    interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                } else {
                    interfaceC0500b2 = interfaceC0500b;
                }
                if (i15 != 0) {
                    c7218l3 = C7218l.f40599c;
                } else {
                    c7218l3 = c7218l2;
                }
                if (i17 != 0) {
                    interfaceC2052l3 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$6
                        @Override // cm.InterfaceC2052l
                        /* JADX INFO: renamed from: n */
                        public final C9072e mo528n(C7216j c7216j) {
                            C5207g.m11111f(c7216j, "it");
                            return C9072e.f47360a;
                        }
                    };
                } else {
                    interfaceC2052l3 = interfaceC2052l2;
                }
                if (i19 != 0) {
                    i27 = 1;
                } else {
                    i27 = i20;
                }
                if (i22 != 0) {
                    z11 = true;
                }
                if (i24 != 0) {
                    i25 = Integer.MAX_VALUE;
                }
                InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q11116 = ComposerKt.f3003a;
                m1531b(str, interfaceC0500b2, c7218l3, interfaceC2052l3, i27, z11, i25, 1, composerImplMo1636j, 12582912 | (i14 & 14) | (i14 & 112) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (458752 & i14) | (i14 & 3670016), 0);
                i28 = i25;
                z12 = z11;
                interfaceC0500b3 = interfaceC0500b2;
                c7218l4 = c7218l3;
                interfaceC2052l4 = interfaceC2052l3;
                i29 = i27;
            } else {
                if (i30 != 0) {
                    interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                } else {
                    interfaceC0500b2 = interfaceC0500b;
                }
                if (i15 != 0) {
                    c7218l3 = C7218l.f40599c;
                } else {
                    c7218l3 = c7218l2;
                }
                if (i17 != 0) {
                    interfaceC2052l3 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$6
                        @Override // cm.InterfaceC2052l
                        /* JADX INFO: renamed from: n */
                        public final C9072e mo528n(C7216j c7216j) {
                            C5207g.m11111f(c7216j, "it");
                            return C9072e.f47360a;
                        }
                    };
                } else {
                    interfaceC2052l3 = interfaceC2052l2;
                }
                if (i19 != 0) {
                    i27 = 1;
                } else {
                    i27 = i20;
                }
                if (i22 != 0) {
                    z11 = true;
                }
                if (i24 != 0) {
                    i25 = Integer.MAX_VALUE;
                }
                InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q11117 = ComposerKt.f3003a;
                m1531b(str, interfaceC0500b2, c7218l3, interfaceC2052l3, i27, z11, i25, 1, composerImplMo1636j, 12582912 | (i14 & 14) | (i14 & 112) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (458752 & i14) | (i14 & 3670016), 0);
                i28 = i25;
                z12 = z11;
                interfaceC0500b3 = interfaceC0500b2;
                c7218l4 = c7218l3;
                interfaceC2052l4 = interfaceC2052l3;
                i29 = i27;
            }
            c5332q0M1612T = composerImplMo1636j.m1612T();
            if (c5332q0M1612T == null) {
                return;
            }
            c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$7
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // cm.InterfaceC2056p
                /* JADX INFO: renamed from: m0 */
                public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                    num.intValue();
                    BasicTextKt.m1532c(str, interfaceC0500b3, c7218l4, interfaceC2052l4, i29, z12, i28, interfaceC0476a2, C8573r0.m16737l1(i12 | 1), i13);
                    return C9072e.f47360a;
                }
            };
        }
        i14 |= 384;
        c7218l2 = c7218l;
        i17 = i13 & 8;
        if (i17 != 0) {
            if ((i12 & 7168) == 0) {
                interfaceC2052l2 = interfaceC2052l;
                if (composerImplMo1636j.m1600H(interfaceC2052l2)) {
                    i18 = 2048;
                } else {
                    i18 = 1024;
                }
                i14 |= i18;
            }
            i19 = i13 & 16;
            if (i19 != 0) {
                if ((i12 & 57344) == 0) {
                    i20 = i10;
                    if (composerImplMo1636j.m1594E(i20)) {
                        i21 = 16384;
                    } else {
                        i21 = 8192;
                    }
                    i14 |= i21;
                }
                i22 = i13 & 32;
                if (i22 != 0) {
                    if ((i12 & 458752) == 0) {
                        z11 = z10;
                        if (composerImplMo1636j.m1598G(z11)) {
                            i23 = 131072;
                        } else {
                            i23 = 65536;
                        }
                        i14 |= i23;
                    }
                    i24 = i13 & 64;
                    if (i24 != 0) {
                        i14 |= 1572864;
                        i25 = i11;
                    } else {
                        i25 = i11;
                        if ((i12 & 3670016) == 0) {
                            if (composerImplMo1636j.m1594E(i25)) {
                                i26 = 1048576;
                            } else {
                                i26 = 524288;
                            }
                            i14 |= i26;
                        }
                    }
                    if ((i14 & 2995931) == 599186) {
                        if (i30 != 0) {
                            interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                        } else {
                            interfaceC0500b2 = interfaceC0500b;
                        }
                        if (i15 != 0) {
                            c7218l3 = C7218l.f40599c;
                        } else {
                            c7218l3 = c7218l2;
                        }
                        if (i17 != 0) {
                            interfaceC2052l3 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$6
                                @Override // cm.InterfaceC2052l
                                /* JADX INFO: renamed from: n */
                                public final C9072e mo528n(C7216j c7216j) {
                                    C5207g.m11111f(c7216j, "it");
                                    return C9072e.f47360a;
                                }
                            };
                        } else {
                            interfaceC2052l3 = interfaceC2052l2;
                        }
                        if (i19 != 0) {
                            i27 = 1;
                        } else {
                            i27 = i20;
                        }
                        if (i22 != 0) {
                            z11 = true;
                        }
                        if (i24 != 0) {
                            i25 = Integer.MAX_VALUE;
                        }
                        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q11118 = ComposerKt.f3003a;
                        m1531b(str, interfaceC0500b2, c7218l3, interfaceC2052l3, i27, z11, i25, 1, composerImplMo1636j, 12582912 | (i14 & 14) | (i14 & 112) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (458752 & i14) | (i14 & 3670016), 0);
                        i28 = i25;
                        z12 = z11;
                        interfaceC0500b3 = interfaceC0500b2;
                        c7218l4 = c7218l3;
                        interfaceC2052l4 = interfaceC2052l3;
                        i29 = i27;
                    } else {
                        if (i30 != 0) {
                            interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                        } else {
                            interfaceC0500b2 = interfaceC0500b;
                        }
                        if (i15 != 0) {
                            c7218l3 = C7218l.f40599c;
                        } else {
                            c7218l3 = c7218l2;
                        }
                        if (i17 != 0) {
                            interfaceC2052l3 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$6
                                @Override // cm.InterfaceC2052l
                                /* JADX INFO: renamed from: n */
                                public final C9072e mo528n(C7216j c7216j) {
                                    C5207g.m11111f(c7216j, "it");
                                    return C9072e.f47360a;
                                }
                            };
                        } else {
                            interfaceC2052l3 = interfaceC2052l2;
                        }
                        if (i19 != 0) {
                            i27 = 1;
                        } else {
                            i27 = i20;
                        }
                        if (i22 != 0) {
                            z11 = true;
                        }
                        if (i24 != 0) {
                            i25 = Integer.MAX_VALUE;
                        }
                        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q11119 = ComposerKt.f3003a;
                        m1531b(str, interfaceC0500b2, c7218l3, interfaceC2052l3, i27, z11, i25, 1, composerImplMo1636j, 12582912 | (i14 & 14) | (i14 & 112) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (458752 & i14) | (i14 & 3670016), 0);
                        i28 = i25;
                        z12 = z11;
                        interfaceC0500b3 = interfaceC0500b2;
                        c7218l4 = c7218l3;
                        interfaceC2052l4 = interfaceC2052l3;
                        i29 = i27;
                    }
                    c5332q0M1612T = composerImplMo1636j.m1612T();
                    if (c5332q0M1612T == null) {
                        return;
                    }
                    c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$7
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                            num.intValue();
                            BasicTextKt.m1532c(str, interfaceC0500b3, c7218l4, interfaceC2052l4, i29, z12, i28, interfaceC0476a2, C8573r0.m16737l1(i12 | 1), i13);
                            return C9072e.f47360a;
                        }
                    };
                }
                i14 |= 196608;
                z11 = z10;
                i24 = i13 & 64;
                if (i24 != 0) {
                    i14 |= 1572864;
                    i25 = i11;
                } else {
                    i25 = i11;
                    if ((i12 & 3670016) == 0) {
                        if (composerImplMo1636j.m1594E(i25)) {
                            i26 = 1048576;
                        } else {
                            i26 = 524288;
                        }
                        i14 |= i26;
                    }
                }
                if ((i14 & 2995931) == 599186) {
                    if (i30 != 0) {
                        interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                    } else {
                        interfaceC0500b2 = interfaceC0500b;
                    }
                    if (i15 != 0) {
                        c7218l3 = C7218l.f40599c;
                    } else {
                        c7218l3 = c7218l2;
                    }
                    if (i17 != 0) {
                        interfaceC2052l3 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$6
                            @Override // cm.InterfaceC2052l
                            /* JADX INFO: renamed from: n */
                            public final C9072e mo528n(C7216j c7216j) {
                                C5207g.m11111f(c7216j, "it");
                                return C9072e.f47360a;
                            }
                        };
                    } else {
                        interfaceC2052l3 = interfaceC2052l2;
                    }
                    if (i19 != 0) {
                        i27 = 1;
                    } else {
                        i27 = i20;
                    }
                    if (i22 != 0) {
                        z11 = true;
                    }
                    if (i24 != 0) {
                        i25 = Integer.MAX_VALUE;
                    }
                    InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q111110 = ComposerKt.f3003a;
                    m1531b(str, interfaceC0500b2, c7218l3, interfaceC2052l3, i27, z11, i25, 1, composerImplMo1636j, 12582912 | (i14 & 14) | (i14 & 112) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (458752 & i14) | (i14 & 3670016), 0);
                    i28 = i25;
                    z12 = z11;
                    interfaceC0500b3 = interfaceC0500b2;
                    c7218l4 = c7218l3;
                    interfaceC2052l4 = interfaceC2052l3;
                    i29 = i27;
                } else {
                    if (i30 != 0) {
                        interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                    } else {
                        interfaceC0500b2 = interfaceC0500b;
                    }
                    if (i15 != 0) {
                        c7218l3 = C7218l.f40599c;
                    } else {
                        c7218l3 = c7218l2;
                    }
                    if (i17 != 0) {
                        interfaceC2052l3 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$6
                            @Override // cm.InterfaceC2052l
                            /* JADX INFO: renamed from: n */
                            public final C9072e mo528n(C7216j c7216j) {
                                C5207g.m11111f(c7216j, "it");
                                return C9072e.f47360a;
                            }
                        };
                    } else {
                        interfaceC2052l3 = interfaceC2052l2;
                    }
                    if (i19 != 0) {
                        i27 = 1;
                    } else {
                        i27 = i20;
                    }
                    if (i22 != 0) {
                        z11 = true;
                    }
                    if (i24 != 0) {
                        i25 = Integer.MAX_VALUE;
                    }
                    InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q111111 = ComposerKt.f3003a;
                    m1531b(str, interfaceC0500b2, c7218l3, interfaceC2052l3, i27, z11, i25, 1, composerImplMo1636j, 12582912 | (i14 & 14) | (i14 & 112) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (458752 & i14) | (i14 & 3670016), 0);
                    i28 = i25;
                    z12 = z11;
                    interfaceC0500b3 = interfaceC0500b2;
                    c7218l4 = c7218l3;
                    interfaceC2052l4 = interfaceC2052l3;
                    i29 = i27;
                }
                c5332q0M1612T = composerImplMo1636j.m1612T();
                if (c5332q0M1612T == null) {
                    return;
                }
                c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$7
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // cm.InterfaceC2056p
                    /* JADX INFO: renamed from: m0 */
                    public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                        num.intValue();
                        BasicTextKt.m1532c(str, interfaceC0500b3, c7218l4, interfaceC2052l4, i29, z12, i28, interfaceC0476a2, C8573r0.m16737l1(i12 | 1), i13);
                        return C9072e.f47360a;
                    }
                };
            }
            i14 |= 24576;
            i20 = i10;
            i22 = i13 & 32;
            if (i22 != 0) {
                if ((i12 & 458752) == 0) {
                    z11 = z10;
                    if (composerImplMo1636j.m1598G(z11)) {
                        i23 = 131072;
                    } else {
                        i23 = 65536;
                    }
                    i14 |= i23;
                }
                i24 = i13 & 64;
                if (i24 != 0) {
                    i14 |= 1572864;
                    i25 = i11;
                } else {
                    i25 = i11;
                    if ((i12 & 3670016) == 0) {
                        if (composerImplMo1636j.m1594E(i25)) {
                            i26 = 1048576;
                        } else {
                            i26 = 524288;
                        }
                        i14 |= i26;
                    }
                }
                if ((i14 & 2995931) == 599186) {
                    if (i30 != 0) {
                        interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                    } else {
                        interfaceC0500b2 = interfaceC0500b;
                    }
                    if (i15 != 0) {
                        c7218l3 = C7218l.f40599c;
                    } else {
                        c7218l3 = c7218l2;
                    }
                    if (i17 != 0) {
                        interfaceC2052l3 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$6
                            @Override // cm.InterfaceC2052l
                            /* JADX INFO: renamed from: n */
                            public final C9072e mo528n(C7216j c7216j) {
                                C5207g.m11111f(c7216j, "it");
                                return C9072e.f47360a;
                            }
                        };
                    } else {
                        interfaceC2052l3 = interfaceC2052l2;
                    }
                    if (i19 != 0) {
                        i27 = 1;
                    } else {
                        i27 = i20;
                    }
                    if (i22 != 0) {
                        z11 = true;
                    }
                    if (i24 != 0) {
                        i25 = Integer.MAX_VALUE;
                    }
                    InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q111112 = ComposerKt.f3003a;
                    m1531b(str, interfaceC0500b2, c7218l3, interfaceC2052l3, i27, z11, i25, 1, composerImplMo1636j, 12582912 | (i14 & 14) | (i14 & 112) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (458752 & i14) | (i14 & 3670016), 0);
                    i28 = i25;
                    z12 = z11;
                    interfaceC0500b3 = interfaceC0500b2;
                    c7218l4 = c7218l3;
                    interfaceC2052l4 = interfaceC2052l3;
                    i29 = i27;
                } else {
                    if (i30 != 0) {
                        interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                    } else {
                        interfaceC0500b2 = interfaceC0500b;
                    }
                    if (i15 != 0) {
                        c7218l3 = C7218l.f40599c;
                    } else {
                        c7218l3 = c7218l2;
                    }
                    if (i17 != 0) {
                        interfaceC2052l3 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$6
                            @Override // cm.InterfaceC2052l
                            /* JADX INFO: renamed from: n */
                            public final C9072e mo528n(C7216j c7216j) {
                                C5207g.m11111f(c7216j, "it");
                                return C9072e.f47360a;
                            }
                        };
                    } else {
                        interfaceC2052l3 = interfaceC2052l2;
                    }
                    if (i19 != 0) {
                        i27 = 1;
                    } else {
                        i27 = i20;
                    }
                    if (i22 != 0) {
                        z11 = true;
                    }
                    if (i24 != 0) {
                        i25 = Integer.MAX_VALUE;
                    }
                    InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q111113 = ComposerKt.f3003a;
                    m1531b(str, interfaceC0500b2, c7218l3, interfaceC2052l3, i27, z11, i25, 1, composerImplMo1636j, 12582912 | (i14 & 14) | (i14 & 112) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (458752 & i14) | (i14 & 3670016), 0);
                    i28 = i25;
                    z12 = z11;
                    interfaceC0500b3 = interfaceC0500b2;
                    c7218l4 = c7218l3;
                    interfaceC2052l4 = interfaceC2052l3;
                    i29 = i27;
                }
                c5332q0M1612T = composerImplMo1636j.m1612T();
                if (c5332q0M1612T == null) {
                    return;
                }
                c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$7
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // cm.InterfaceC2056p
                    /* JADX INFO: renamed from: m0 */
                    public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                        num.intValue();
                        BasicTextKt.m1532c(str, interfaceC0500b3, c7218l4, interfaceC2052l4, i29, z12, i28, interfaceC0476a2, C8573r0.m16737l1(i12 | 1), i13);
                        return C9072e.f47360a;
                    }
                };
            }
            i14 |= 196608;
            z11 = z10;
            i24 = i13 & 64;
            if (i24 != 0) {
                i14 |= 1572864;
                i25 = i11;
            } else {
                i25 = i11;
                if ((i12 & 3670016) == 0) {
                    if (composerImplMo1636j.m1594E(i25)) {
                        i26 = 1048576;
                    } else {
                        i26 = 524288;
                    }
                    i14 |= i26;
                }
            }
            if ((i14 & 2995931) == 599186) {
                if (i30 != 0) {
                    interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                } else {
                    interfaceC0500b2 = interfaceC0500b;
                }
                if (i15 != 0) {
                    c7218l3 = C7218l.f40599c;
                } else {
                    c7218l3 = c7218l2;
                }
                if (i17 != 0) {
                    interfaceC2052l3 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$6
                        @Override // cm.InterfaceC2052l
                        /* JADX INFO: renamed from: n */
                        public final C9072e mo528n(C7216j c7216j) {
                            C5207g.m11111f(c7216j, "it");
                            return C9072e.f47360a;
                        }
                    };
                } else {
                    interfaceC2052l3 = interfaceC2052l2;
                }
                if (i19 != 0) {
                    i27 = 1;
                } else {
                    i27 = i20;
                }
                if (i22 != 0) {
                    z11 = true;
                }
                if (i24 != 0) {
                    i25 = Integer.MAX_VALUE;
                }
                InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q111114 = ComposerKt.f3003a;
                m1531b(str, interfaceC0500b2, c7218l3, interfaceC2052l3, i27, z11, i25, 1, composerImplMo1636j, 12582912 | (i14 & 14) | (i14 & 112) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (458752 & i14) | (i14 & 3670016), 0);
                i28 = i25;
                z12 = z11;
                interfaceC0500b3 = interfaceC0500b2;
                c7218l4 = c7218l3;
                interfaceC2052l4 = interfaceC2052l3;
                i29 = i27;
            } else {
                if (i30 != 0) {
                    interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                } else {
                    interfaceC0500b2 = interfaceC0500b;
                }
                if (i15 != 0) {
                    c7218l3 = C7218l.f40599c;
                } else {
                    c7218l3 = c7218l2;
                }
                if (i17 != 0) {
                    interfaceC2052l3 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$6
                        @Override // cm.InterfaceC2052l
                        /* JADX INFO: renamed from: n */
                        public final C9072e mo528n(C7216j c7216j) {
                            C5207g.m11111f(c7216j, "it");
                            return C9072e.f47360a;
                        }
                    };
                } else {
                    interfaceC2052l3 = interfaceC2052l2;
                }
                if (i19 != 0) {
                    i27 = 1;
                } else {
                    i27 = i20;
                }
                if (i22 != 0) {
                    z11 = true;
                }
                if (i24 != 0) {
                    i25 = Integer.MAX_VALUE;
                }
                InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q111115 = ComposerKt.f3003a;
                m1531b(str, interfaceC0500b2, c7218l3, interfaceC2052l3, i27, z11, i25, 1, composerImplMo1636j, 12582912 | (i14 & 14) | (i14 & 112) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (458752 & i14) | (i14 & 3670016), 0);
                i28 = i25;
                z12 = z11;
                interfaceC0500b3 = interfaceC0500b2;
                c7218l4 = c7218l3;
                interfaceC2052l4 = interfaceC2052l3;
                i29 = i27;
            }
            c5332q0M1612T = composerImplMo1636j.m1612T();
            if (c5332q0M1612T == null) {
                return;
            }
            c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$7
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // cm.InterfaceC2056p
                /* JADX INFO: renamed from: m0 */
                public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                    num.intValue();
                    BasicTextKt.m1532c(str, interfaceC0500b3, c7218l4, interfaceC2052l4, i29, z12, i28, interfaceC0476a2, C8573r0.m16737l1(i12 | 1), i13);
                    return C9072e.f47360a;
                }
            };
        }
        i14 |= 3072;
        interfaceC2052l2 = interfaceC2052l;
        i19 = i13 & 16;
        if (i19 != 0) {
            if ((i12 & 57344) == 0) {
                i20 = i10;
                if (composerImplMo1636j.m1594E(i20)) {
                    i21 = 16384;
                } else {
                    i21 = 8192;
                }
                i14 |= i21;
            }
            i22 = i13 & 32;
            if (i22 != 0) {
                if ((i12 & 458752) == 0) {
                    z11 = z10;
                    if (composerImplMo1636j.m1598G(z11)) {
                        i23 = 131072;
                    } else {
                        i23 = 65536;
                    }
                    i14 |= i23;
                }
                i24 = i13 & 64;
                if (i24 != 0) {
                    i14 |= 1572864;
                    i25 = i11;
                } else {
                    i25 = i11;
                    if ((i12 & 3670016) == 0) {
                        if (composerImplMo1636j.m1594E(i25)) {
                            i26 = 1048576;
                        } else {
                            i26 = 524288;
                        }
                        i14 |= i26;
                    }
                }
                if ((i14 & 2995931) == 599186) {
                    if (i30 != 0) {
                        interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                    } else {
                        interfaceC0500b2 = interfaceC0500b;
                    }
                    if (i15 != 0) {
                        c7218l3 = C7218l.f40599c;
                    } else {
                        c7218l3 = c7218l2;
                    }
                    if (i17 != 0) {
                        interfaceC2052l3 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$6
                            @Override // cm.InterfaceC2052l
                            /* JADX INFO: renamed from: n */
                            public final C9072e mo528n(C7216j c7216j) {
                                C5207g.m11111f(c7216j, "it");
                                return C9072e.f47360a;
                            }
                        };
                    } else {
                        interfaceC2052l3 = interfaceC2052l2;
                    }
                    if (i19 != 0) {
                        i27 = 1;
                    } else {
                        i27 = i20;
                    }
                    if (i22 != 0) {
                        z11 = true;
                    }
                    if (i24 != 0) {
                        i25 = Integer.MAX_VALUE;
                    }
                    InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q111116 = ComposerKt.f3003a;
                    m1531b(str, interfaceC0500b2, c7218l3, interfaceC2052l3, i27, z11, i25, 1, composerImplMo1636j, 12582912 | (i14 & 14) | (i14 & 112) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (458752 & i14) | (i14 & 3670016), 0);
                    i28 = i25;
                    z12 = z11;
                    interfaceC0500b3 = interfaceC0500b2;
                    c7218l4 = c7218l3;
                    interfaceC2052l4 = interfaceC2052l3;
                    i29 = i27;
                } else {
                    if (i30 != 0) {
                        interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                    } else {
                        interfaceC0500b2 = interfaceC0500b;
                    }
                    if (i15 != 0) {
                        c7218l3 = C7218l.f40599c;
                    } else {
                        c7218l3 = c7218l2;
                    }
                    if (i17 != 0) {
                        interfaceC2052l3 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$6
                            @Override // cm.InterfaceC2052l
                            /* JADX INFO: renamed from: n */
                            public final C9072e mo528n(C7216j c7216j) {
                                C5207g.m11111f(c7216j, "it");
                                return C9072e.f47360a;
                            }
                        };
                    } else {
                        interfaceC2052l3 = interfaceC2052l2;
                    }
                    if (i19 != 0) {
                        i27 = 1;
                    } else {
                        i27 = i20;
                    }
                    if (i22 != 0) {
                        z11 = true;
                    }
                    if (i24 != 0) {
                        i25 = Integer.MAX_VALUE;
                    }
                    InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q111117 = ComposerKt.f3003a;
                    m1531b(str, interfaceC0500b2, c7218l3, interfaceC2052l3, i27, z11, i25, 1, composerImplMo1636j, 12582912 | (i14 & 14) | (i14 & 112) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (458752 & i14) | (i14 & 3670016), 0);
                    i28 = i25;
                    z12 = z11;
                    interfaceC0500b3 = interfaceC0500b2;
                    c7218l4 = c7218l3;
                    interfaceC2052l4 = interfaceC2052l3;
                    i29 = i27;
                }
                c5332q0M1612T = composerImplMo1636j.m1612T();
                if (c5332q0M1612T == null) {
                    return;
                }
                c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$7
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // cm.InterfaceC2056p
                    /* JADX INFO: renamed from: m0 */
                    public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                        num.intValue();
                        BasicTextKt.m1532c(str, interfaceC0500b3, c7218l4, interfaceC2052l4, i29, z12, i28, interfaceC0476a2, C8573r0.m16737l1(i12 | 1), i13);
                        return C9072e.f47360a;
                    }
                };
            }
            i14 |= 196608;
            z11 = z10;
            i24 = i13 & 64;
            if (i24 != 0) {
                i14 |= 1572864;
                i25 = i11;
            } else {
                i25 = i11;
                if ((i12 & 3670016) == 0) {
                    if (composerImplMo1636j.m1594E(i25)) {
                        i26 = 1048576;
                    } else {
                        i26 = 524288;
                    }
                    i14 |= i26;
                }
            }
            if ((i14 & 2995931) == 599186) {
                if (i30 != 0) {
                    interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                } else {
                    interfaceC0500b2 = interfaceC0500b;
                }
                if (i15 != 0) {
                    c7218l3 = C7218l.f40599c;
                } else {
                    c7218l3 = c7218l2;
                }
                if (i17 != 0) {
                    interfaceC2052l3 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$6
                        @Override // cm.InterfaceC2052l
                        /* JADX INFO: renamed from: n */
                        public final C9072e mo528n(C7216j c7216j) {
                            C5207g.m11111f(c7216j, "it");
                            return C9072e.f47360a;
                        }
                    };
                } else {
                    interfaceC2052l3 = interfaceC2052l2;
                }
                if (i19 != 0) {
                    i27 = 1;
                } else {
                    i27 = i20;
                }
                if (i22 != 0) {
                    z11 = true;
                }
                if (i24 != 0) {
                    i25 = Integer.MAX_VALUE;
                }
                InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q111118 = ComposerKt.f3003a;
                m1531b(str, interfaceC0500b2, c7218l3, interfaceC2052l3, i27, z11, i25, 1, composerImplMo1636j, 12582912 | (i14 & 14) | (i14 & 112) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (458752 & i14) | (i14 & 3670016), 0);
                i28 = i25;
                z12 = z11;
                interfaceC0500b3 = interfaceC0500b2;
                c7218l4 = c7218l3;
                interfaceC2052l4 = interfaceC2052l3;
                i29 = i27;
            } else {
                if (i30 != 0) {
                    interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                } else {
                    interfaceC0500b2 = interfaceC0500b;
                }
                if (i15 != 0) {
                    c7218l3 = C7218l.f40599c;
                } else {
                    c7218l3 = c7218l2;
                }
                if (i17 != 0) {
                    interfaceC2052l3 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$6
                        @Override // cm.InterfaceC2052l
                        /* JADX INFO: renamed from: n */
                        public final C9072e mo528n(C7216j c7216j) {
                            C5207g.m11111f(c7216j, "it");
                            return C9072e.f47360a;
                        }
                    };
                } else {
                    interfaceC2052l3 = interfaceC2052l2;
                }
                if (i19 != 0) {
                    i27 = 1;
                } else {
                    i27 = i20;
                }
                if (i22 != 0) {
                    z11 = true;
                }
                if (i24 != 0) {
                    i25 = Integer.MAX_VALUE;
                }
                InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q111119 = ComposerKt.f3003a;
                m1531b(str, interfaceC0500b2, c7218l3, interfaceC2052l3, i27, z11, i25, 1, composerImplMo1636j, 12582912 | (i14 & 14) | (i14 & 112) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (458752 & i14) | (i14 & 3670016), 0);
                i28 = i25;
                z12 = z11;
                interfaceC0500b3 = interfaceC0500b2;
                c7218l4 = c7218l3;
                interfaceC2052l4 = interfaceC2052l3;
                i29 = i27;
            }
            c5332q0M1612T = composerImplMo1636j.m1612T();
            if (c5332q0M1612T == null) {
                return;
            }
            c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$7
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // cm.InterfaceC2056p
                /* JADX INFO: renamed from: m0 */
                public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                    num.intValue();
                    BasicTextKt.m1532c(str, interfaceC0500b3, c7218l4, interfaceC2052l4, i29, z12, i28, interfaceC0476a2, C8573r0.m16737l1(i12 | 1), i13);
                    return C9072e.f47360a;
                }
            };
        }
        i14 |= 24576;
        i20 = i10;
        i22 = i13 & 32;
        if (i22 != 0) {
            if ((i12 & 458752) == 0) {
                z11 = z10;
                if (composerImplMo1636j.m1598G(z11)) {
                    i23 = 131072;
                } else {
                    i23 = 65536;
                }
                i14 |= i23;
            }
            i24 = i13 & 64;
            if (i24 != 0) {
                i14 |= 1572864;
                i25 = i11;
            } else {
                i25 = i11;
                if ((i12 & 3670016) == 0) {
                    if (composerImplMo1636j.m1594E(i25)) {
                        i26 = 1048576;
                    } else {
                        i26 = 524288;
                    }
                    i14 |= i26;
                }
            }
            if ((i14 & 2995931) == 599186) {
                if (i30 != 0) {
                    interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                } else {
                    interfaceC0500b2 = interfaceC0500b;
                }
                if (i15 != 0) {
                    c7218l3 = C7218l.f40599c;
                } else {
                    c7218l3 = c7218l2;
                }
                if (i17 != 0) {
                    interfaceC2052l3 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$6
                        @Override // cm.InterfaceC2052l
                        /* JADX INFO: renamed from: n */
                        public final C9072e mo528n(C7216j c7216j) {
                            C5207g.m11111f(c7216j, "it");
                            return C9072e.f47360a;
                        }
                    };
                } else {
                    interfaceC2052l3 = interfaceC2052l2;
                }
                if (i19 != 0) {
                    i27 = 1;
                } else {
                    i27 = i20;
                }
                if (i22 != 0) {
                    z11 = true;
                }
                if (i24 != 0) {
                    i25 = Integer.MAX_VALUE;
                }
                InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q1111110 = ComposerKt.f3003a;
                m1531b(str, interfaceC0500b2, c7218l3, interfaceC2052l3, i27, z11, i25, 1, composerImplMo1636j, 12582912 | (i14 & 14) | (i14 & 112) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (458752 & i14) | (i14 & 3670016), 0);
                i28 = i25;
                z12 = z11;
                interfaceC0500b3 = interfaceC0500b2;
                c7218l4 = c7218l3;
                interfaceC2052l4 = interfaceC2052l3;
                i29 = i27;
            } else {
                if (i30 != 0) {
                    interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                } else {
                    interfaceC0500b2 = interfaceC0500b;
                }
                if (i15 != 0) {
                    c7218l3 = C7218l.f40599c;
                } else {
                    c7218l3 = c7218l2;
                }
                if (i17 != 0) {
                    interfaceC2052l3 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$6
                        @Override // cm.InterfaceC2052l
                        /* JADX INFO: renamed from: n */
                        public final C9072e mo528n(C7216j c7216j) {
                            C5207g.m11111f(c7216j, "it");
                            return C9072e.f47360a;
                        }
                    };
                } else {
                    interfaceC2052l3 = interfaceC2052l2;
                }
                if (i19 != 0) {
                    i27 = 1;
                } else {
                    i27 = i20;
                }
                if (i22 != 0) {
                    z11 = true;
                }
                if (i24 != 0) {
                    i25 = Integer.MAX_VALUE;
                }
                InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q1111111 = ComposerKt.f3003a;
                m1531b(str, interfaceC0500b2, c7218l3, interfaceC2052l3, i27, z11, i25, 1, composerImplMo1636j, 12582912 | (i14 & 14) | (i14 & 112) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (458752 & i14) | (i14 & 3670016), 0);
                i28 = i25;
                z12 = z11;
                interfaceC0500b3 = interfaceC0500b2;
                c7218l4 = c7218l3;
                interfaceC2052l4 = interfaceC2052l3;
                i29 = i27;
            }
            c5332q0M1612T = composerImplMo1636j.m1612T();
            if (c5332q0M1612T == null) {
                return;
            }
            c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$7
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // cm.InterfaceC2056p
                /* JADX INFO: renamed from: m0 */
                public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                    num.intValue();
                    BasicTextKt.m1532c(str, interfaceC0500b3, c7218l4, interfaceC2052l4, i29, z12, i28, interfaceC0476a2, C8573r0.m16737l1(i12 | 1), i13);
                    return C9072e.f47360a;
                }
            };
        }
        i14 |= 196608;
        z11 = z10;
        i24 = i13 & 64;
        if (i24 != 0) {
            i14 |= 1572864;
            i25 = i11;
        } else {
            i25 = i11;
            if ((i12 & 3670016) == 0) {
                if (composerImplMo1636j.m1594E(i25)) {
                    i26 = 1048576;
                } else {
                    i26 = 524288;
                }
                i14 |= i26;
            }
        }
        if ((i14 & 2995931) == 599186) {
            if (i30 != 0) {
                interfaceC0500b2 = InterfaceC0500b.a.f3325a;
            } else {
                interfaceC0500b2 = interfaceC0500b;
            }
            if (i15 != 0) {
                c7218l3 = C7218l.f40599c;
            } else {
                c7218l3 = c7218l2;
            }
            if (i17 != 0) {
                interfaceC2052l3 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$6
                    @Override // cm.InterfaceC2052l
                    /* JADX INFO: renamed from: n */
                    public final C9072e mo528n(C7216j c7216j) {
                        C5207g.m11111f(c7216j, "it");
                        return C9072e.f47360a;
                    }
                };
            } else {
                interfaceC2052l3 = interfaceC2052l2;
            }
            if (i19 != 0) {
                i27 = 1;
            } else {
                i27 = i20;
            }
            if (i22 != 0) {
                z11 = true;
            }
            if (i24 != 0) {
                i25 = Integer.MAX_VALUE;
            }
            InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q1111112 = ComposerKt.f3003a;
            m1531b(str, interfaceC0500b2, c7218l3, interfaceC2052l3, i27, z11, i25, 1, composerImplMo1636j, 12582912 | (i14 & 14) | (i14 & 112) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (458752 & i14) | (i14 & 3670016), 0);
            i28 = i25;
            z12 = z11;
            interfaceC0500b3 = interfaceC0500b2;
            c7218l4 = c7218l3;
            interfaceC2052l4 = interfaceC2052l3;
            i29 = i27;
        } else {
            if (i30 != 0) {
                interfaceC0500b2 = InterfaceC0500b.a.f3325a;
            } else {
                interfaceC0500b2 = interfaceC0500b;
            }
            if (i15 != 0) {
                c7218l3 = C7218l.f40599c;
            } else {
                c7218l3 = c7218l2;
            }
            if (i17 != 0) {
                interfaceC2052l3 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$6
                    @Override // cm.InterfaceC2052l
                    /* JADX INFO: renamed from: n */
                    public final C9072e mo528n(C7216j c7216j) {
                        C5207g.m11111f(c7216j, "it");
                        return C9072e.f47360a;
                    }
                };
            } else {
                interfaceC2052l3 = interfaceC2052l2;
            }
            if (i19 != 0) {
                i27 = 1;
            } else {
                i27 = i20;
            }
            if (i22 != 0) {
                z11 = true;
            }
            if (i24 != 0) {
                i25 = Integer.MAX_VALUE;
            }
            InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q1111113 = ComposerKt.f3003a;
            m1531b(str, interfaceC0500b2, c7218l3, interfaceC2052l3, i27, z11, i25, 1, composerImplMo1636j, 12582912 | (i14 & 14) | (i14 & 112) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (458752 & i14) | (i14 & 3670016), 0);
            i28 = i25;
            z12 = z11;
            interfaceC0500b3 = interfaceC0500b2;
            c7218l4 = c7218l3;
            interfaceC2052l4 = interfaceC2052l3;
            i29 = i27;
        }
        c5332q0M1612T = composerImplMo1636j.m1612T();
        if (c5332q0M1612T == null) {
            return;
        }
        c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$7
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // cm.InterfaceC2056p
            /* JADX INFO: renamed from: m0 */
            public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                num.intValue();
                BasicTextKt.m1532c(str, interfaceC0500b3, c7218l4, interfaceC2052l4, i29, z12, i28, interfaceC0476a2, C8573r0.m16737l1(i12 | 1), i13);
                return C9072e.f47360a;
            }
        };
    }

    /* JADX WARN: Code duplicated, block: B:100:0x013d  */
    /* JADX WARN: Code duplicated, block: B:102:0x0142  */
    /* JADX WARN: Code duplicated, block: B:104:0x0147  */
    /* JADX WARN: Code duplicated, block: B:106:0x014c  */
    /* JADX WARN: Code duplicated, block: B:108:0x0150  */
    /* JADX WARN: Code duplicated, block: B:109:0x0153  */
    /* JADX WARN: Code duplicated, block: B:111:0x0157  */
    /* JADX WARN: Code duplicated, block: B:112:0x015c  */
    /* JADX WARN: Code duplicated, block: B:114:0x0160  */
    /* JADX WARN: Code duplicated, block: B:115:0x0163  */
    /* JADX WARN: Code duplicated, block: B:117:0x0167  */
    /* JADX WARN: Code duplicated, block: B:118:0x016d  */
    /* JADX WARN: Code duplicated, block: B:121:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:122:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:124:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:126:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:128:0x01df  */
    /* JADX WARN: Code duplicated, block: B:133:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:135:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:137:0x0209  */
    /* JADX WARN: Code duplicated, block: B:140:0x0225  */
    /* JADX WARN: Code duplicated, block: B:142:0x0235  */
    /* JADX WARN: Code duplicated, block: B:143:0x024f  */
    /* JADX WARN: Code duplicated, block: B:148:0x0275  */
    /* JADX WARN: Code duplicated, block: B:149:0x027a  */
    /* JADX WARN: Code duplicated, block: B:152:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:153:0x02f3  */
    /* JADX WARN: Code duplicated, block: B:156:0x0319  */
    /* JADX WARN: Code duplicated, block: B:158:0x0343  */
    /* JADX WARN: Code duplicated, block: B:181:0x038e  */
    /* JADX WARN: Code duplicated, block: B:185:0x03b4  */
    /* JADX WARN: Code duplicated, block: B:188:0x03d7  */
    /* JADX WARN: Code duplicated, block: B:189:0x03da  */
    /* JADX WARN: Code duplicated, block: B:192:0x0423  */
    /* JADX WARN: Code duplicated, block: B:194:0x042a  */
    /* JADX WARN: Code duplicated, block: B:195:0x042e  */
    /* JADX WARN: Code duplicated, block: B:200:0x0483  */
    /* JADX WARN: Code duplicated, block: B:202:0x0492  */
    /* JADX WARN: Code duplicated, block: B:206:0x01fe A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:210:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x004e  */
    /* JADX WARN: Code duplicated, block: B:27:0x0051  */
    /* JADX WARN: Code duplicated, block: B:29:0x0055  */
    /* JADX WARN: Code duplicated, block: B:31:0x005d  */
    /* JADX WARN: Code duplicated, block: B:32:0x0062  */
    /* JADX WARN: Code duplicated, block: B:37:0x006e  */
    /* JADX WARN: Code duplicated, block: B:38:0x0071  */
    /* JADX WARN: Code duplicated, block: B:40:0x0075  */
    /* JADX WARN: Code duplicated, block: B:42:0x007d  */
    /* JADX WARN: Code duplicated, block: B:43:0x0080  */
    /* JADX WARN: Code duplicated, block: B:48:0x008c  */
    /* JADX WARN: Code duplicated, block: B:49:0x008f  */
    /* JADX WARN: Code duplicated, block: B:51:0x0095  */
    /* JADX WARN: Code duplicated, block: B:53:0x009d  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:59:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:60:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:62:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:64:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:65:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:69:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:70:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:72:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:74:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:75:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:79:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:80:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:82:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:84:0x0102  */
    /* JADX WARN: Code duplicated, block: B:85:0x0105  */
    /* JADX WARN: Code duplicated, block: B:89:0x010d  */
    /* JADX WARN: Code duplicated, block: B:92:0x0115  */
    /* JADX WARN: Code duplicated, block: B:94:0x0120  */
    /* JADX WARN: Code duplicated, block: B:98:0x0139  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v105 */
    /* JADX WARN: Type inference failed for: r0v106 */
    /* JADX WARN: Type inference failed for: r0v57, types: [androidx.compose.foundation.text.BasicTextKt$BasicText$4, kotlin.jvm.internal.Lambda] */
    /* JADX WARN: Type inference failed for: r0v59, types: [androidx.compose.runtime.internal.ComposableLambdaImpl] */
    /* JADX WARN: Type inference failed for: r0v60, types: [boolean] */
    /* JADX WARN: Type inference failed for: r13v0, types: [androidx.compose.runtime.ComposerImpl, androidx.compose.runtime.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v22, types: [androidx.compose.runtime.internal.ComposableLambdaImpl] */
    /* JADX WARN: Type inference failed for: r1v32 */
    /* JADX WARN: Type inference failed for: r1v6, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.util.List] */
    /* JADX INFO: renamed from: d */
    public static final void m1533d(final C0689a c0689a, InterfaceC0500b interfaceC0500b, C7218l c7218l, InterfaceC2052l<? super C7216j, C9072e> interfaceC2052l, int i10, boolean z10, int i11, int i12, Map<String, C10422a> map, InterfaceC0476a interfaceC0476a, final int i13, final int i14) throws Throwable {
        int i15;
        InterfaceC0500b interfaceC0500b2;
        int i16;
        C7218l c7218l2;
        int i17;
        int i18;
        InterfaceC2052l<? super C7216j, C9072e> interfaceC2052l2;
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
        boolean z11;
        int i31;
        int i32;
        Map<String, C10422a> mapM13459L0;
        final InterfaceC0004c interfaceC0004c;
        InterfaceC10015c interfaceC10015c;
        AbstractC0696b.a aVar;
        List<C0689a.b<? extends Object>> list;
        ?? arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        int size;
        int i33;
        ?? r10;
        Pair<List<C0689a.b<C7213g>>, List<C0689a.b<InterfaceC2057q<String, InterfaceC0476a, Integer, C9072e>>>> pair;
        C0689a.b bVar;
        int size2;
        int i34;
        C0689a.b<? extends Object> bVar2;
        C0689a.b<? extends Object> bVar3;
        boolean z12;
        List<C0689a.b<C7213g>> list2;
        final List<C0689a.b<InterfaceC2057q<String, InterfaceC0476a, Integer, C9072e>>> list3;
        long jLongValue;
        Object objM1619a0;
        int i35;
        Throwable th2;
        TextController textController;
        TextState textState;
        final C0689a c0689a2;
        boolean z13;
        int i36;
        int i37;
        int i38;
        int i39;
        InterfaceC2052l<? super C7216j, C9072e> interfaceC2052l3;
        ?? M14522b;
        InterfaceC0500b interfaceC0500b3;
        InterfaceC10015c interfaceC10015c2;
        LayoutDirection layoutDirection;
        InterfaceC0647n1 interfaceC0647n1;
        InterfaceC2041a<ComposeUiNode> interfaceC2041a;
        ?? M2036a;
        final InterfaceC0500b interfaceC0500b4;
        final InterfaceC2052l<? super C7216j, C9072e> interfaceC2052l4;
        final C7218l c7218l3;
        final Map<String, C10422a> map2;
        final int i40;
        final int i41;
        final int i42;
        final boolean z14;
        C10423b c10423b;
        boolean z15;
        int i43;
        int i44;
        int i45;
        C5332q0 c5332q0M1612T;
        C5207g.m11111f(c0689a, "text");
        ?? Mo1636j = interfaceC0476a.mo1636j(851408699);
        if ((i14 & 1) != 0) {
            i15 = i13 | 6;
        } else if ((i13 & 14) == 0) {
            i15 = (Mo1636j.mo1665y(c0689a) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i46 = i14 & 2;
        if (i46 == 0) {
            if ((i13 & 112) == 0) {
                interfaceC0500b2 = interfaceC0500b;
                i15 |= Mo1636j.mo1665y(interfaceC0500b2) ? 32 : 16;
            }
            i16 = i14 & 4;
            if (i16 != 0) {
                if ((i13 & 896) == 0) {
                    c7218l2 = c7218l;
                    if (Mo1636j.mo1665y(c7218l2)) {
                        i17 = 256;
                    } else {
                        i17 = BuildConfig.SDK_TRUNCATE_LENGTH;
                    }
                    i15 |= i17;
                }
                i18 = i14 & 8;
                if (i18 != 0) {
                    if ((i13 & 7168) == 0) {
                        interfaceC2052l2 = interfaceC2052l;
                        if (Mo1636j.m1600H(interfaceC2052l2)) {
                            i19 = 2048;
                        } else {
                            i19 = 1024;
                        }
                        i15 |= i19;
                    }
                    i20 = i14 & 16;
                    if (i20 != 0) {
                        if ((57344 & i13) == 0) {
                            i21 = i10;
                            if (Mo1636j.m1594E(i21)) {
                                i22 = 16384;
                            } else {
                                i22 = 8192;
                            }
                            i15 |= i22;
                        }
                        i23 = i14 & 32;
                        if (i23 != 0) {
                            i15 |= 196608;
                        } else if ((i13 & 458752) == 0) {
                            if (Mo1636j.m1598G(z10)) {
                                i24 = 131072;
                            } else {
                                i24 = 65536;
                            }
                            i15 |= i24;
                        }
                        i25 = i14 & 64;
                        if (i25 != 0) {
                            i15 |= 1572864;
                        } else if ((i13 & 3670016) == 0) {
                            if (Mo1636j.m1594E(i11)) {
                                i26 = 1048576;
                            } else {
                                i26 = 524288;
                            }
                            i15 |= i26;
                        }
                        i27 = i14 & BuildConfig.SDK_TRUNCATE_LENGTH;
                        if (i27 != 0) {
                            i15 |= 12582912;
                        } else if ((i13 & 29360128) == 0) {
                            if (Mo1636j.m1594E(i12)) {
                                i28 = 8388608;
                            } else {
                                i28 = 4194304;
                            }
                            i15 |= i28;
                        }
                        i29 = i14 & 256;
                        if (i29 != 0) {
                            i15 |= 33554432;
                        }
                        if (i29 == 256) {
                            i30 = i15;
                            if ((191739611 & i15) != 38347922 && Mo1636j.mo1642m()) {
                                Mo1636j.mo1650q();
                                z14 = z10;
                                i40 = i12;
                                interfaceC0500b4 = interfaceC0500b2;
                                c7218l3 = c7218l2;
                                interfaceC2052l4 = interfaceC2052l2;
                                i42 = i21;
                                i41 = i11;
                                map2 = map;
                            }
                            c5332q0M1612T = Mo1636j.m1612T();
                            if (c5332q0M1612T == null) {
                                return;
                            }
                            c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$5
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // cm.InterfaceC2056p
                                /* JADX INFO: renamed from: m0 */
                                public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) throws Throwable {
                                    num.intValue();
                                    BasicTextKt.m1533d(c0689a, interfaceC0500b4, c7218l3, interfaceC2052l4, i42, z14, i41, i40, map2, interfaceC0476a2, C8573r0.m16737l1(i13 | 1), i14);
                                    return C9072e.f47360a;
                                }
                            };
                        }
                        i30 = i15;
                        if (i46 != 0) {
                            interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                        }
                        if (i16 != 0) {
                            c7218l2 = C7218l.f40599c;
                        }
                        if (i18 != 0) {
                            interfaceC2052l2 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$3
                                @Override // cm.InterfaceC2052l
                                /* JADX INFO: renamed from: n */
                                public final C9072e mo528n(C7216j c7216j) {
                                    C5207g.m11111f(c7216j, "it");
                                    return C9072e.f47360a;
                                }
                            };
                        }
                        if (i20 != 0) {
                            i21 = 1;
                        }
                        if (i23 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if (i25 != 0) {
                            i31 = Integer.MAX_VALUE;
                        } else {
                            i31 = i11;
                        }
                        if (i27 != 0) {
                            i32 = 1;
                        } else {
                            i32 = i12;
                        }
                        if (i29 != 0) {
                            mapM13459L0 = C6753d.m13459L0();
                        } else {
                            mapM13459L0 = map;
                        }
                        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q = ComposerKt.f3003a;
                        C8584v.m16781D(i32, i31);
                        interfaceC0004c = (InterfaceC0004c) Mo1636j.mo1648p(SelectionRegistrarKt.f2569a);
                        interfaceC10015c = (InterfaceC10015c) Mo1636j.mo1648p(CompositionLocalsKt.f4137e);
                        aVar = (AbstractC0696b.a) Mo1636j.mo1648p(CompositionLocalsKt.f4140h);
                        long j10 = ((C0005d) Mo1636j.mo1648p(TextSelectionColorsKt.f2571a)).f3b;
                        Pair<List<C0689a.b<C7213g>>, List<C0689a.b<InterfaceC2057q<String, InterfaceC0476a, Integer, C9072e>>>> pair2 = CoreTextKt.f2526a;
                        C5207g.m11111f(mapM13459L0, "inlineContent");
                        if (mapM13459L0.isEmpty()) {
                            pair = CoreTextKt.f2526a;
                            interfaceC0500b2 = interfaceC0500b2;
                            interfaceC2052l2 = interfaceC2052l2;
                        } else {
                            int length = c0689a.length();
                            list = c0689a.f4526d;
                            if (list != null) {
                                arrayList = new ArrayList(list.size());
                                size2 = list.size();
                                i34 = 0;
                                while (i34 < size2) {
                                    int i47 = size2;
                                    bVar2 = list.get(i34);
                                    List<C0689a.b<? extends Object>> list4 = list;
                                    bVar3 = bVar2;
                                    if (!(bVar3.f4536a instanceof String) && C5207g.m11106a("androidx.compose.foundation.text.inlineContent", bVar3.f4539d) && C0691b.m2583c(0, length, bVar3.f4537b, bVar3.f4538c)) {
                                        z12 = true;
                                    } else {
                                        z12 = false;
                                    }
                                    if (z12) {
                                        arrayList.add(bVar2);
                                    }
                                    i34++;
                                    size2 = i47;
                                    list = list4;
                                }
                            } else {
                                arrayList = EmptyList.f38032a;
                            }
                            C5207g.m11109d(arrayList, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString.Range<kotlin.String>>");
                            arrayList2 = new ArrayList();
                            arrayList3 = new ArrayList();
                            size = arrayList.size();
                            i33 = 0;
                            r10 = arrayList;
                            while (i33 < size) {
                                bVar = (C0689a.b) r10.get(i33);
                                if (mapM13459L0.get(bVar.f4536a) != null) {
                                    int i48 = bVar.f4537b;
                                    int i49 = bVar.f4538c;
                                    arrayList2.add(new C0689a.b(i48, i49, null));
                                    arrayList3.add(new C0689a.b(i48, i49, null));
                                }
                                i33++;
                                size = size;
                                r10 = r10;
                            }
                            pair = new Pair<>(arrayList2, arrayList3);
                        }
                        list2 = pair.f38012a;
                        list3 = pair.f38013b;
                        Mo1636j.mo1622c(959243860);
                        if (interfaceC0004c == null) {
                            jLongValue = 0;
                        } else {
                            jLongValue = ((Number) C0487a.m1860a(new Object[]{c0689a, interfaceC0004c}, SaverKt.m1859a(new BasicTextKt$selectionIdSaver$1(interfaceC0004c), BasicTextKt$selectionIdSaver$2.f2523b), new InterfaceC2041a<Long>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$selectableId$2
                                {
                                    super(0);
                                }

                                @Override // cm.InterfaceC2041a
                                /* JADX INFO: renamed from: E */
                                public final Long mo807E() {
                                    return Long.valueOf(interfaceC0004c.m6b());
                                }
                            }, Mo1636j, 4)).longValue();
                        }
                        Mo1636j.m1609Q(false);
                        Mo1636j.mo1622c(-492369756);
                        objM1619a0 = Mo1636j.m1619a0();
                        if (objM1619a0 == InterfaceC0476a.a.f3122a) {
                            i35 = i30;
                            th2 = null;
                            TextController textController2 = new TextController(new TextState(new C10423b(c0689a, c7218l2, i31, i32, z11, i21, interfaceC10015c, aVar, list2), jLongValue));
                            Mo1636j.m1597F0(textController2);
                            objM1619a0 = textController2;
                        } else {
                            i35 = i30;
                            th2 = null;
                        }
                        Mo1636j.m1609Q(false);
                        textController = (TextController) objM1619a0;
                        textState = textController.f2539a;
                        if (Mo1636j.f2897L) {
                            c0689a2 = c0689a;
                            z13 = z11;
                            i36 = i21;
                            i37 = 0;
                            i38 = i31;
                            i39 = i32;
                        } else {
                            c10423b = textState.f2563d;
                            C5207g.m11111f(c10423b, "current");
                            C5207g.m11111f(c7218l2, "style");
                            C5207g.m11111f(interfaceC10015c, "density");
                            C5207g.m11111f(aVar, "fontFamilyResolver");
                            C5207g.m11111f(list2, "placeholders");
                            c0689a2 = c0689a;
                            i37 = 0;
                            if (C5207g.m11106a(c10423b.f52258a, c0689a2) || !C5207g.m11106a(c10423b.f52259b, c7218l2)) {
                                z15 = z11;
                            } else {
                                z15 = z11;
                                if (c10423b.f52262e == z15) {
                                    i43 = i21;
                                    if (c10423b.f52263f == i43) {
                                        i44 = i31;
                                        if (c10423b.f52260c == i44) {
                                            i45 = i32;
                                            if (c10423b.f52261d == i45 && C5207g.m11106a(c10423b.f52264g, interfaceC10015c) && C5207g.m11106a(c10423b.f52266i, list2) && c10423b.f52265h == aVar) {
                                                i39 = i45;
                                                i38 = i44;
                                                i36 = i43;
                                                z13 = z15;
                                            }
                                            textController.m1540f(c10423b);
                                        }
                                        i39 = i45;
                                        i38 = i44;
                                        i36 = i43;
                                        z13 = z15;
                                        c10423b = new C10423b(c0689a, c7218l2, i44, i39, z15, i36, interfaceC10015c, aVar, list2);
                                        textController.m1540f(c10423b);
                                    }
                                    i45 = i32;
                                    i39 = i45;
                                    i38 = i44;
                                    i36 = i43;
                                    z13 = z15;
                                    c10423b = new C10423b(c0689a, c7218l2, i44, i39, z15, i36, interfaceC10015c, aVar, list2);
                                    textController.m1540f(c10423b);
                                }
                                i44 = i31;
                                i45 = i32;
                                i39 = i45;
                                i38 = i44;
                                i36 = i43;
                                z13 = z15;
                                c10423b = new C10423b(c0689a, c7218l2, i44, i39, z15, i36, interfaceC10015c, aVar, list2);
                                textController.m1540f(c10423b);
                            }
                            i43 = i21;
                            i44 = i31;
                            i45 = i32;
                            i39 = i45;
                            i38 = i44;
                            i36 = i43;
                            z13 = z15;
                            c10423b = new C10423b(c0689a, c7218l2, i44, i39, z15, i36, interfaceC10015c, aVar, list2);
                            textController.m1540f(c10423b);
                        }
                        textState.getClass();
                        interfaceC2052l3 = interfaceC2052l2;
                        C5207g.m11111f(interfaceC2052l3, "<set-?>");
                        textState.f2561b = interfaceC2052l3;
                        textController.m1541g(interfaceC0004c);
                        if (list3.isEmpty()) {
                            M14522b = ComposableSingletons$BasicTextKt.f2524a;
                        } else {
                            final int i50 = i35;
                            M14522b = C7204a.m14522b(Mo1636j, 1749415830, new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$4
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // cm.InterfaceC2056p
                                /* JADX INFO: renamed from: m0 */
                                public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                                    InterfaceC0476a interfaceC0476a3 = interfaceC0476a2;
                                    if ((num.intValue() & 11) == 2 && interfaceC0476a3.mo1642m()) {
                                        interfaceC0476a3.mo1650q();
                                    } else {
                                        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q2 = ComposerKt.f3003a;
                                        CoreTextKt.m1534a(c0689a2, list3, interfaceC0476a3, (i50 & 14) | 64);
                                    }
                                    return C9072e.f47360a;
                                }
                            });
                        }
                        interfaceC0500b3 = interfaceC0500b2;
                        InterfaceC0500b interfaceC0500bMo1929K = interfaceC0500b3.mo1929K(textController.m1539e());
                        Mo1636j.mo1622c(-1323940314);
                        interfaceC10015c2 = (InterfaceC10015c) Mo1636j.mo1648p(CompositionLocalsKt.f4137e);
                        layoutDirection = (LayoutDirection) Mo1636j.mo1648p(CompositionLocalsKt.f4143k);
                        interfaceC0647n1 = (InterfaceC0647n1) Mo1636j.mo1648p(CompositionLocalsKt.f4148p);
                        ComposeUiNode.f3726n.getClass();
                        interfaceC2041a = ComposeUiNode.Companion.f3728b;
                        M2036a = C0520a.m2036a(interfaceC0500bMo1929K);
                        if (Mo1636j.f2910a instanceof InterfaceC5299c) {
                            C8573r0.m16771y0();
                            throw th2;
                        }
                        Mo1636j.mo1640l();
                        if (Mo1636j.f2897L) {
                            Mo1636j.mo1634i(interfaceC2041a);
                        } else {
                            Mo1636j.mo1653s();
                        }
                        C8573r0.m16714a1(Mo1636j, textController.f2542d, ComposeUiNode.Companion.f3731e);
                        C8573r0.m16714a1(Mo1636j, interfaceC10015c2, ComposeUiNode.Companion.f3730d);
                        C8573r0.m16714a1(Mo1636j, layoutDirection, ComposeUiNode.Companion.f3732f);
                        C8573r0.m16714a1(Mo1636j, interfaceC0647n1, ComposeUiNode.Companion.f3733g);
                        M2036a.mo1343M(new C5340u0(Mo1636j), Mo1636j, Integer.valueOf(i37));
                        Mo1636j.mo1622c(2058660585);
                        M14522b.mo1337m0(Mo1636j, Integer.valueOf(i37));
                        ?? r11 = i37;
                        Mo1636j.m1609Q(r11);
                        Mo1636j.m1609Q(true);
                        Mo1636j.m1609Q(r11);
                        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q2 = ComposerKt.f3003a;
                        interfaceC0500b4 = interfaceC0500b3;
                        interfaceC2052l4 = interfaceC2052l3;
                        c7218l3 = c7218l2;
                        map2 = mapM13459L0;
                        i40 = i39;
                        i41 = i38;
                        i42 = i36;
                        z14 = z13;
                        c5332q0M1612T = Mo1636j.m1612T();
                        if (c5332q0M1612T == null) {
                            return;
                        }
                        c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$5
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) throws Throwable {
                                num.intValue();
                                BasicTextKt.m1533d(c0689a, interfaceC0500b4, c7218l3, interfaceC2052l4, i42, z14, i41, i40, map2, interfaceC0476a2, C8573r0.m16737l1(i13 | 1), i14);
                                return C9072e.f47360a;
                            }
                        };
                    }
                    i15 |= 24576;
                    i21 = i10;
                    i23 = i14 & 32;
                    if (i23 != 0) {
                        i15 |= 196608;
                    } else if ((i13 & 458752) == 0) {
                        if (Mo1636j.m1598G(z10)) {
                            i24 = 131072;
                        } else {
                            i24 = 65536;
                        }
                        i15 |= i24;
                    }
                    i25 = i14 & 64;
                    if (i25 != 0) {
                        i15 |= 1572864;
                    } else if ((i13 & 3670016) == 0) {
                        if (Mo1636j.m1594E(i11)) {
                            i26 = 1048576;
                        } else {
                            i26 = 524288;
                        }
                        i15 |= i26;
                    }
                    i27 = i14 & BuildConfig.SDK_TRUNCATE_LENGTH;
                    if (i27 != 0) {
                        i15 |= 12582912;
                    } else if ((i13 & 29360128) == 0) {
                        if (Mo1636j.m1594E(i12)) {
                            i28 = 8388608;
                        } else {
                            i28 = 4194304;
                        }
                        i15 |= i28;
                    }
                    i29 = i14 & 256;
                    if (i29 != 0) {
                        i15 |= 33554432;
                    }
                    if (i29 == 256) {
                        i30 = i15;
                        if ((191739611 & i15) != 38347922) {
                        }
                        c5332q0M1612T = Mo1636j.m1612T();
                        if (c5332q0M1612T == null) {
                            return;
                        }
                        c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$5
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) throws Throwable {
                                num.intValue();
                                BasicTextKt.m1533d(c0689a, interfaceC0500b4, c7218l3, interfaceC2052l4, i42, z14, i41, i40, map2, interfaceC0476a2, C8573r0.m16737l1(i13 | 1), i14);
                                return C9072e.f47360a;
                            }
                        };
                    }
                    i30 = i15;
                    if (i46 != 0) {
                        interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                    }
                    if (i16 != 0) {
                        c7218l2 = C7218l.f40599c;
                    }
                    if (i18 != 0) {
                        interfaceC2052l2 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$3
                            @Override // cm.InterfaceC2052l
                            /* JADX INFO: renamed from: n */
                            public final C9072e mo528n(C7216j c7216j) {
                                C5207g.m11111f(c7216j, "it");
                                return C9072e.f47360a;
                            }
                        };
                    }
                    if (i20 != 0) {
                        i21 = 1;
                    }
                    if (i23 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    if (i25 != 0) {
                        i31 = Integer.MAX_VALUE;
                    } else {
                        i31 = i11;
                    }
                    if (i27 != 0) {
                        i32 = 1;
                    } else {
                        i32 = i12;
                    }
                    if (i29 != 0) {
                        mapM13459L0 = C6753d.m13459L0();
                    } else {
                        mapM13459L0 = map;
                    }
                    InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q3 = ComposerKt.f3003a;
                    C8584v.m16781D(i32, i31);
                    interfaceC0004c = (InterfaceC0004c) Mo1636j.mo1648p(SelectionRegistrarKt.f2569a);
                    interfaceC10015c = (InterfaceC10015c) Mo1636j.mo1648p(CompositionLocalsKt.f4137e);
                    aVar = (AbstractC0696b.a) Mo1636j.mo1648p(CompositionLocalsKt.f4140h);
                    long j11 = ((C0005d) Mo1636j.mo1648p(TextSelectionColorsKt.f2571a)).f3b;
                    Pair<List<C0689a.b<C7213g>>, List<C0689a.b<InterfaceC2057q<String, InterfaceC0476a, Integer, C9072e>>>> pair3 = CoreTextKt.f2526a;
                    C5207g.m11111f(mapM13459L0, "inlineContent");
                    if (mapM13459L0.isEmpty()) {
                        pair = CoreTextKt.f2526a;
                        interfaceC0500b2 = interfaceC0500b2;
                        interfaceC2052l2 = interfaceC2052l2;
                    } else {
                        int length2 = c0689a.length();
                        list = c0689a.f4526d;
                        if (list != null) {
                            arrayList = new ArrayList(list.size());
                            size2 = list.size();
                            i34 = 0;
                            while (i34 < size2) {
                                int i410 = size2;
                                bVar2 = list.get(i34);
                                List<C0689a.b<? extends Object>> list5 = list;
                                bVar3 = bVar2;
                                if (!(bVar3.f4536a instanceof String)) {
                                    z12 = false;
                                } else {
                                    z12 = false;
                                }
                                if (z12) {
                                    arrayList.add(bVar2);
                                }
                                i34++;
                                size2 = i410;
                                list = list5;
                            }
                        } else {
                            arrayList = EmptyList.f38032a;
                        }
                        C5207g.m11109d(arrayList, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString.Range<kotlin.String>>");
                        arrayList2 = new ArrayList();
                        arrayList3 = new ArrayList();
                        size = arrayList.size();
                        i33 = 0;
                        r10 = arrayList;
                        while (i33 < size) {
                            bVar = (C0689a.b) r10.get(i33);
                            if (mapM13459L0.get(bVar.f4536a) != null) {
                                int i411 = bVar.f4537b;
                                int i412 = bVar.f4538c;
                                arrayList2.add(new C0689a.b(i411, i412, null));
                                arrayList3.add(new C0689a.b(i411, i412, null));
                            }
                            i33++;
                            size = size;
                            r10 = r10;
                        }
                        pair = new Pair<>(arrayList2, arrayList3);
                    }
                    list2 = pair.f38012a;
                    list3 = pair.f38013b;
                    Mo1636j.mo1622c(959243860);
                    if (interfaceC0004c == null) {
                        jLongValue = 0;
                    } else {
                        jLongValue = ((Number) C0487a.m1860a(new Object[]{c0689a, interfaceC0004c}, SaverKt.m1859a(new BasicTextKt$selectionIdSaver$1(interfaceC0004c), BasicTextKt$selectionIdSaver$2.f2523b), new InterfaceC2041a<Long>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$selectableId$2
                            {
                                super(0);
                            }

                            @Override // cm.InterfaceC2041a
                            /* JADX INFO: renamed from: E */
                            public final Long mo807E() {
                                return Long.valueOf(interfaceC0004c.m6b());
                            }
                        }, Mo1636j, 4)).longValue();
                    }
                    Mo1636j.m1609Q(false);
                    Mo1636j.mo1622c(-492369756);
                    objM1619a0 = Mo1636j.m1619a0();
                    if (objM1619a0 == InterfaceC0476a.a.f3122a) {
                        i35 = i30;
                        th2 = null;
                        TextController textController3 = new TextController(new TextState(new C10423b(c0689a, c7218l2, i31, i32, z11, i21, interfaceC10015c, aVar, list2), jLongValue));
                        Mo1636j.m1597F0(textController3);
                        objM1619a0 = textController3;
                    } else {
                        i35 = i30;
                        th2 = null;
                    }
                    Mo1636j.m1609Q(false);
                    textController = (TextController) objM1619a0;
                    textState = textController.f2539a;
                    if (Mo1636j.f2897L) {
                        c10423b = textState.f2563d;
                        C5207g.m11111f(c10423b, "current");
                        C5207g.m11111f(c7218l2, "style");
                        C5207g.m11111f(interfaceC10015c, "density");
                        C5207g.m11111f(aVar, "fontFamilyResolver");
                        C5207g.m11111f(list2, "placeholders");
                        c0689a2 = c0689a;
                        i37 = 0;
                        if (C5207g.m11106a(c10423b.f52258a, c0689a2)) {
                            z15 = z11;
                            i43 = i21;
                            i44 = i31;
                            i45 = i32;
                            i39 = i45;
                            i38 = i44;
                            i36 = i43;
                            z13 = z15;
                            c10423b = new C10423b(c0689a, c7218l2, i44, i39, z15, i36, interfaceC10015c, aVar, list2);
                        } else {
                            z15 = z11;
                            i43 = i21;
                            i44 = i31;
                            i45 = i32;
                            i39 = i45;
                            i38 = i44;
                            i36 = i43;
                            z13 = z15;
                            c10423b = new C10423b(c0689a, c7218l2, i44, i39, z15, i36, interfaceC10015c, aVar, list2);
                        }
                        textController.m1540f(c10423b);
                    } else {
                        c0689a2 = c0689a;
                        z13 = z11;
                        i36 = i21;
                        i37 = 0;
                        i38 = i31;
                        i39 = i32;
                    }
                    textState.getClass();
                    interfaceC2052l3 = interfaceC2052l2;
                    C5207g.m11111f(interfaceC2052l3, "<set-?>");
                    textState.f2561b = interfaceC2052l3;
                    textController.m1541g(interfaceC0004c);
                    if (list3.isEmpty()) {
                        M14522b = ComposableSingletons$BasicTextKt.f2524a;
                    } else {
                        final int i51 = i35;
                        M14522b = C7204a.m14522b(Mo1636j, 1749415830, new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$4
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                                InterfaceC0476a interfaceC0476a3 = interfaceC0476a2;
                                if ((num.intValue() & 11) == 2 && interfaceC0476a3.mo1642m()) {
                                    interfaceC0476a3.mo1650q();
                                } else {
                                    InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q4 = ComposerKt.f3003a;
                                    CoreTextKt.m1534a(c0689a2, list3, interfaceC0476a3, (i51 & 14) | 64);
                                }
                                return C9072e.f47360a;
                            }
                        });
                    }
                    interfaceC0500b3 = interfaceC0500b2;
                    InterfaceC0500b interfaceC0500bMo1929K2 = interfaceC0500b3.mo1929K(textController.m1539e());
                    Mo1636j.mo1622c(-1323940314);
                    interfaceC10015c2 = (InterfaceC10015c) Mo1636j.mo1648p(CompositionLocalsKt.f4137e);
                    layoutDirection = (LayoutDirection) Mo1636j.mo1648p(CompositionLocalsKt.f4143k);
                    interfaceC0647n1 = (InterfaceC0647n1) Mo1636j.mo1648p(CompositionLocalsKt.f4148p);
                    ComposeUiNode.f3726n.getClass();
                    interfaceC2041a = ComposeUiNode.Companion.f3728b;
                    M2036a = C0520a.m2036a(interfaceC0500bMo1929K2);
                    if (Mo1636j.f2910a instanceof InterfaceC5299c) {
                        C8573r0.m16771y0();
                        throw th2;
                    }
                    Mo1636j.mo1640l();
                    if (Mo1636j.f2897L) {
                        Mo1636j.mo1634i(interfaceC2041a);
                    } else {
                        Mo1636j.mo1653s();
                    }
                    C8573r0.m16714a1(Mo1636j, textController.f2542d, ComposeUiNode.Companion.f3731e);
                    C8573r0.m16714a1(Mo1636j, interfaceC10015c2, ComposeUiNode.Companion.f3730d);
                    C8573r0.m16714a1(Mo1636j, layoutDirection, ComposeUiNode.Companion.f3732f);
                    C8573r0.m16714a1(Mo1636j, interfaceC0647n1, ComposeUiNode.Companion.f3733g);
                    M2036a.mo1343M(new C5340u0(Mo1636j), Mo1636j, Integer.valueOf(i37));
                    Mo1636j.mo1622c(2058660585);
                    M14522b.mo1337m0(Mo1636j, Integer.valueOf(i37));
                    ?? r12 = i37;
                    Mo1636j.m1609Q(r12);
                    Mo1636j.m1609Q(true);
                    Mo1636j.m1609Q(r12);
                    InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q4 = ComposerKt.f3003a;
                    interfaceC0500b4 = interfaceC0500b3;
                    interfaceC2052l4 = interfaceC2052l3;
                    c7218l3 = c7218l2;
                    map2 = mapM13459L0;
                    i40 = i39;
                    i41 = i38;
                    i42 = i36;
                    z14 = z13;
                    c5332q0M1612T = Mo1636j.m1612T();
                    if (c5332q0M1612T == null) {
                        return;
                    }
                    c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$5
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) throws Throwable {
                            num.intValue();
                            BasicTextKt.m1533d(c0689a, interfaceC0500b4, c7218l3, interfaceC2052l4, i42, z14, i41, i40, map2, interfaceC0476a2, C8573r0.m16737l1(i13 | 1), i14);
                            return C9072e.f47360a;
                        }
                    };
                }
                i15 |= 3072;
                interfaceC2052l2 = interfaceC2052l;
                i20 = i14 & 16;
                if (i20 != 0) {
                    if ((57344 & i13) == 0) {
                        i21 = i10;
                        if (Mo1636j.m1594E(i21)) {
                            i22 = 16384;
                        } else {
                            i22 = 8192;
                        }
                        i15 |= i22;
                    }
                    i23 = i14 & 32;
                    if (i23 != 0) {
                        i15 |= 196608;
                    } else if ((i13 & 458752) == 0) {
                        if (Mo1636j.m1598G(z10)) {
                            i24 = 131072;
                        } else {
                            i24 = 65536;
                        }
                        i15 |= i24;
                    }
                    i25 = i14 & 64;
                    if (i25 != 0) {
                        i15 |= 1572864;
                    } else if ((i13 & 3670016) == 0) {
                        if (Mo1636j.m1594E(i11)) {
                            i26 = 1048576;
                        } else {
                            i26 = 524288;
                        }
                        i15 |= i26;
                    }
                    i27 = i14 & BuildConfig.SDK_TRUNCATE_LENGTH;
                    if (i27 != 0) {
                        i15 |= 12582912;
                    } else if ((i13 & 29360128) == 0) {
                        if (Mo1636j.m1594E(i12)) {
                            i28 = 8388608;
                        } else {
                            i28 = 4194304;
                        }
                        i15 |= i28;
                    }
                    i29 = i14 & 256;
                    if (i29 != 0) {
                        i15 |= 33554432;
                    }
                    if (i29 == 256) {
                        i30 = i15;
                        if ((191739611 & i15) != 38347922) {
                        }
                        c5332q0M1612T = Mo1636j.m1612T();
                        if (c5332q0M1612T == null) {
                            return;
                        }
                        c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$5
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) throws Throwable {
                                num.intValue();
                                BasicTextKt.m1533d(c0689a, interfaceC0500b4, c7218l3, interfaceC2052l4, i42, z14, i41, i40, map2, interfaceC0476a2, C8573r0.m16737l1(i13 | 1), i14);
                                return C9072e.f47360a;
                            }
                        };
                    }
                    i30 = i15;
                    if (i46 != 0) {
                        interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                    }
                    if (i16 != 0) {
                        c7218l2 = C7218l.f40599c;
                    }
                    if (i18 != 0) {
                        interfaceC2052l2 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$3
                            @Override // cm.InterfaceC2052l
                            /* JADX INFO: renamed from: n */
                            public final C9072e mo528n(C7216j c7216j) {
                                C5207g.m11111f(c7216j, "it");
                                return C9072e.f47360a;
                            }
                        };
                    }
                    if (i20 != 0) {
                        i21 = 1;
                    }
                    if (i23 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    if (i25 != 0) {
                        i31 = Integer.MAX_VALUE;
                    } else {
                        i31 = i11;
                    }
                    if (i27 != 0) {
                        i32 = 1;
                    } else {
                        i32 = i12;
                    }
                    if (i29 != 0) {
                        mapM13459L0 = C6753d.m13459L0();
                    } else {
                        mapM13459L0 = map;
                    }
                    InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q5 = ComposerKt.f3003a;
                    C8584v.m16781D(i32, i31);
                    interfaceC0004c = (InterfaceC0004c) Mo1636j.mo1648p(SelectionRegistrarKt.f2569a);
                    interfaceC10015c = (InterfaceC10015c) Mo1636j.mo1648p(CompositionLocalsKt.f4137e);
                    aVar = (AbstractC0696b.a) Mo1636j.mo1648p(CompositionLocalsKt.f4140h);
                    long j12 = ((C0005d) Mo1636j.mo1648p(TextSelectionColorsKt.f2571a)).f3b;
                    Pair<List<C0689a.b<C7213g>>, List<C0689a.b<InterfaceC2057q<String, InterfaceC0476a, Integer, C9072e>>>> pair4 = CoreTextKt.f2526a;
                    C5207g.m11111f(mapM13459L0, "inlineContent");
                    if (mapM13459L0.isEmpty()) {
                        pair = CoreTextKt.f2526a;
                        interfaceC0500b2 = interfaceC0500b2;
                        interfaceC2052l2 = interfaceC2052l2;
                    } else {
                        int length3 = c0689a.length();
                        list = c0689a.f4526d;
                        if (list != null) {
                            arrayList = new ArrayList(list.size());
                            size2 = list.size();
                            i34 = 0;
                            while (i34 < size2) {
                                int i413 = size2;
                                bVar2 = list.get(i34);
                                List<C0689a.b<? extends Object>> list6 = list;
                                bVar3 = bVar2;
                                if (!(bVar3.f4536a instanceof String)) {
                                    z12 = false;
                                } else {
                                    z12 = false;
                                }
                                if (z12) {
                                    arrayList.add(bVar2);
                                }
                                i34++;
                                size2 = i413;
                                list = list6;
                            }
                        } else {
                            arrayList = EmptyList.f38032a;
                        }
                        C5207g.m11109d(arrayList, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString.Range<kotlin.String>>");
                        arrayList2 = new ArrayList();
                        arrayList3 = new ArrayList();
                        size = arrayList.size();
                        i33 = 0;
                        r10 = arrayList;
                        while (i33 < size) {
                            bVar = (C0689a.b) r10.get(i33);
                            if (mapM13459L0.get(bVar.f4536a) != null) {
                                int i414 = bVar.f4537b;
                                int i415 = bVar.f4538c;
                                arrayList2.add(new C0689a.b(i414, i415, null));
                                arrayList3.add(new C0689a.b(i414, i415, null));
                            }
                            i33++;
                            size = size;
                            r10 = r10;
                        }
                        pair = new Pair<>(arrayList2, arrayList3);
                    }
                    list2 = pair.f38012a;
                    list3 = pair.f38013b;
                    Mo1636j.mo1622c(959243860);
                    if (interfaceC0004c == null) {
                        jLongValue = 0;
                    } else {
                        jLongValue = ((Number) C0487a.m1860a(new Object[]{c0689a, interfaceC0004c}, SaverKt.m1859a(new BasicTextKt$selectionIdSaver$1(interfaceC0004c), BasicTextKt$selectionIdSaver$2.f2523b), new InterfaceC2041a<Long>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$selectableId$2
                            {
                                super(0);
                            }

                            @Override // cm.InterfaceC2041a
                            /* JADX INFO: renamed from: E */
                            public final Long mo807E() {
                                return Long.valueOf(interfaceC0004c.m6b());
                            }
                        }, Mo1636j, 4)).longValue();
                    }
                    Mo1636j.m1609Q(false);
                    Mo1636j.mo1622c(-492369756);
                    objM1619a0 = Mo1636j.m1619a0();
                    if (objM1619a0 == InterfaceC0476a.a.f3122a) {
                        i35 = i30;
                        th2 = null;
                        TextController textController4 = new TextController(new TextState(new C10423b(c0689a, c7218l2, i31, i32, z11, i21, interfaceC10015c, aVar, list2), jLongValue));
                        Mo1636j.m1597F0(textController4);
                        objM1619a0 = textController4;
                    } else {
                        i35 = i30;
                        th2 = null;
                    }
                    Mo1636j.m1609Q(false);
                    textController = (TextController) objM1619a0;
                    textState = textController.f2539a;
                    if (Mo1636j.f2897L) {
                        c10423b = textState.f2563d;
                        C5207g.m11111f(c10423b, "current");
                        C5207g.m11111f(c7218l2, "style");
                        C5207g.m11111f(interfaceC10015c, "density");
                        C5207g.m11111f(aVar, "fontFamilyResolver");
                        C5207g.m11111f(list2, "placeholders");
                        c0689a2 = c0689a;
                        i37 = 0;
                        if (C5207g.m11106a(c10423b.f52258a, c0689a2)) {
                            z15 = z11;
                            i43 = i21;
                            i44 = i31;
                            i45 = i32;
                            i39 = i45;
                            i38 = i44;
                            i36 = i43;
                            z13 = z15;
                            c10423b = new C10423b(c0689a, c7218l2, i44, i39, z15, i36, interfaceC10015c, aVar, list2);
                        } else {
                            z15 = z11;
                            i43 = i21;
                            i44 = i31;
                            i45 = i32;
                            i39 = i45;
                            i38 = i44;
                            i36 = i43;
                            z13 = z15;
                            c10423b = new C10423b(c0689a, c7218l2, i44, i39, z15, i36, interfaceC10015c, aVar, list2);
                        }
                        textController.m1540f(c10423b);
                    } else {
                        c0689a2 = c0689a;
                        z13 = z11;
                        i36 = i21;
                        i37 = 0;
                        i38 = i31;
                        i39 = i32;
                    }
                    textState.getClass();
                    interfaceC2052l3 = interfaceC2052l2;
                    C5207g.m11111f(interfaceC2052l3, "<set-?>");
                    textState.f2561b = interfaceC2052l3;
                    textController.m1541g(interfaceC0004c);
                    if (list3.isEmpty()) {
                        M14522b = ComposableSingletons$BasicTextKt.f2524a;
                    } else {
                        final int i52 = i35;
                        M14522b = C7204a.m14522b(Mo1636j, 1749415830, new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$4
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                                InterfaceC0476a interfaceC0476a3 = interfaceC0476a2;
                                if ((num.intValue() & 11) == 2 && interfaceC0476a3.mo1642m()) {
                                    interfaceC0476a3.mo1650q();
                                } else {
                                    InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q6 = ComposerKt.f3003a;
                                    CoreTextKt.m1534a(c0689a2, list3, interfaceC0476a3, (i52 & 14) | 64);
                                }
                                return C9072e.f47360a;
                            }
                        });
                    }
                    interfaceC0500b3 = interfaceC0500b2;
                    InterfaceC0500b interfaceC0500bMo1929K3 = interfaceC0500b3.mo1929K(textController.m1539e());
                    Mo1636j.mo1622c(-1323940314);
                    interfaceC10015c2 = (InterfaceC10015c) Mo1636j.mo1648p(CompositionLocalsKt.f4137e);
                    layoutDirection = (LayoutDirection) Mo1636j.mo1648p(CompositionLocalsKt.f4143k);
                    interfaceC0647n1 = (InterfaceC0647n1) Mo1636j.mo1648p(CompositionLocalsKt.f4148p);
                    ComposeUiNode.f3726n.getClass();
                    interfaceC2041a = ComposeUiNode.Companion.f3728b;
                    M2036a = C0520a.m2036a(interfaceC0500bMo1929K3);
                    if (Mo1636j.f2910a instanceof InterfaceC5299c) {
                        C8573r0.m16771y0();
                        throw th2;
                    }
                    Mo1636j.mo1640l();
                    if (Mo1636j.f2897L) {
                        Mo1636j.mo1634i(interfaceC2041a);
                    } else {
                        Mo1636j.mo1653s();
                    }
                    C8573r0.m16714a1(Mo1636j, textController.f2542d, ComposeUiNode.Companion.f3731e);
                    C8573r0.m16714a1(Mo1636j, interfaceC10015c2, ComposeUiNode.Companion.f3730d);
                    C8573r0.m16714a1(Mo1636j, layoutDirection, ComposeUiNode.Companion.f3732f);
                    C8573r0.m16714a1(Mo1636j, interfaceC0647n1, ComposeUiNode.Companion.f3733g);
                    M2036a.mo1343M(new C5340u0(Mo1636j), Mo1636j, Integer.valueOf(i37));
                    Mo1636j.mo1622c(2058660585);
                    M14522b.mo1337m0(Mo1636j, Integer.valueOf(i37));
                    ?? r13 = i37;
                    Mo1636j.m1609Q(r13);
                    Mo1636j.m1609Q(true);
                    Mo1636j.m1609Q(r13);
                    InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q6 = ComposerKt.f3003a;
                    interfaceC0500b4 = interfaceC0500b3;
                    interfaceC2052l4 = interfaceC2052l3;
                    c7218l3 = c7218l2;
                    map2 = mapM13459L0;
                    i40 = i39;
                    i41 = i38;
                    i42 = i36;
                    z14 = z13;
                    c5332q0M1612T = Mo1636j.m1612T();
                    if (c5332q0M1612T == null) {
                        return;
                    }
                    c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$5
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) throws Throwable {
                            num.intValue();
                            BasicTextKt.m1533d(c0689a, interfaceC0500b4, c7218l3, interfaceC2052l4, i42, z14, i41, i40, map2, interfaceC0476a2, C8573r0.m16737l1(i13 | 1), i14);
                            return C9072e.f47360a;
                        }
                    };
                }
                i15 |= 24576;
                i21 = i10;
                i23 = i14 & 32;
                if (i23 != 0) {
                    i15 |= 196608;
                } else if ((i13 & 458752) == 0) {
                    if (Mo1636j.m1598G(z10)) {
                        i24 = 131072;
                    } else {
                        i24 = 65536;
                    }
                    i15 |= i24;
                }
                i25 = i14 & 64;
                if (i25 != 0) {
                    i15 |= 1572864;
                } else if ((i13 & 3670016) == 0) {
                    if (Mo1636j.m1594E(i11)) {
                        i26 = 1048576;
                    } else {
                        i26 = 524288;
                    }
                    i15 |= i26;
                }
                i27 = i14 & BuildConfig.SDK_TRUNCATE_LENGTH;
                if (i27 != 0) {
                    i15 |= 12582912;
                } else if ((i13 & 29360128) == 0) {
                    if (Mo1636j.m1594E(i12)) {
                        i28 = 8388608;
                    } else {
                        i28 = 4194304;
                    }
                    i15 |= i28;
                }
                i29 = i14 & 256;
                if (i29 != 0) {
                    i15 |= 33554432;
                }
                if (i29 == 256) {
                    i30 = i15;
                    if ((191739611 & i15) != 38347922) {
                    }
                    c5332q0M1612T = Mo1636j.m1612T();
                    if (c5332q0M1612T == null) {
                        return;
                    }
                    c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$5
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) throws Throwable {
                            num.intValue();
                            BasicTextKt.m1533d(c0689a, interfaceC0500b4, c7218l3, interfaceC2052l4, i42, z14, i41, i40, map2, interfaceC0476a2, C8573r0.m16737l1(i13 | 1), i14);
                            return C9072e.f47360a;
                        }
                    };
                }
                i30 = i15;
                if (i46 != 0) {
                    interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                }
                if (i16 != 0) {
                    c7218l2 = C7218l.f40599c;
                }
                if (i18 != 0) {
                    interfaceC2052l2 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$3
                        @Override // cm.InterfaceC2052l
                        /* JADX INFO: renamed from: n */
                        public final C9072e mo528n(C7216j c7216j) {
                            C5207g.m11111f(c7216j, "it");
                            return C9072e.f47360a;
                        }
                    };
                }
                if (i20 != 0) {
                    i21 = 1;
                }
                if (i23 != 0) {
                    z11 = true;
                } else {
                    z11 = z10;
                }
                if (i25 != 0) {
                    i31 = Integer.MAX_VALUE;
                } else {
                    i31 = i11;
                }
                if (i27 != 0) {
                    i32 = 1;
                } else {
                    i32 = i12;
                }
                if (i29 != 0) {
                    mapM13459L0 = C6753d.m13459L0();
                } else {
                    mapM13459L0 = map;
                }
                InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q7 = ComposerKt.f3003a;
                C8584v.m16781D(i32, i31);
                interfaceC0004c = (InterfaceC0004c) Mo1636j.mo1648p(SelectionRegistrarKt.f2569a);
                interfaceC10015c = (InterfaceC10015c) Mo1636j.mo1648p(CompositionLocalsKt.f4137e);
                aVar = (AbstractC0696b.a) Mo1636j.mo1648p(CompositionLocalsKt.f4140h);
                long j13 = ((C0005d) Mo1636j.mo1648p(TextSelectionColorsKt.f2571a)).f3b;
                Pair<List<C0689a.b<C7213g>>, List<C0689a.b<InterfaceC2057q<String, InterfaceC0476a, Integer, C9072e>>>> pair5 = CoreTextKt.f2526a;
                C5207g.m11111f(mapM13459L0, "inlineContent");
                if (mapM13459L0.isEmpty()) {
                    pair = CoreTextKt.f2526a;
                    interfaceC0500b2 = interfaceC0500b2;
                    interfaceC2052l2 = interfaceC2052l2;
                } else {
                    int length4 = c0689a.length();
                    list = c0689a.f4526d;
                    if (list != null) {
                        arrayList = new ArrayList(list.size());
                        size2 = list.size();
                        i34 = 0;
                        while (i34 < size2) {
                            int i416 = size2;
                            bVar2 = list.get(i34);
                            List<C0689a.b<? extends Object>> list7 = list;
                            bVar3 = bVar2;
                            if (!(bVar3.f4536a instanceof String)) {
                                z12 = false;
                            } else {
                                z12 = false;
                            }
                            if (z12) {
                                arrayList.add(bVar2);
                            }
                            i34++;
                            size2 = i416;
                            list = list7;
                        }
                    } else {
                        arrayList = EmptyList.f38032a;
                    }
                    C5207g.m11109d(arrayList, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString.Range<kotlin.String>>");
                    arrayList2 = new ArrayList();
                    arrayList3 = new ArrayList();
                    size = arrayList.size();
                    i33 = 0;
                    r10 = arrayList;
                    while (i33 < size) {
                        bVar = (C0689a.b) r10.get(i33);
                        if (mapM13459L0.get(bVar.f4536a) != null) {
                            int i417 = bVar.f4537b;
                            int i418 = bVar.f4538c;
                            arrayList2.add(new C0689a.b(i417, i418, null));
                            arrayList3.add(new C0689a.b(i417, i418, null));
                        }
                        i33++;
                        size = size;
                        r10 = r10;
                    }
                    pair = new Pair<>(arrayList2, arrayList3);
                }
                list2 = pair.f38012a;
                list3 = pair.f38013b;
                Mo1636j.mo1622c(959243860);
                if (interfaceC0004c == null) {
                    jLongValue = 0;
                } else {
                    jLongValue = ((Number) C0487a.m1860a(new Object[]{c0689a, interfaceC0004c}, SaverKt.m1859a(new BasicTextKt$selectionIdSaver$1(interfaceC0004c), BasicTextKt$selectionIdSaver$2.f2523b), new InterfaceC2041a<Long>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$selectableId$2
                        {
                            super(0);
                        }

                        @Override // cm.InterfaceC2041a
                        /* JADX INFO: renamed from: E */
                        public final Long mo807E() {
                            return Long.valueOf(interfaceC0004c.m6b());
                        }
                    }, Mo1636j, 4)).longValue();
                }
                Mo1636j.m1609Q(false);
                Mo1636j.mo1622c(-492369756);
                objM1619a0 = Mo1636j.m1619a0();
                if (objM1619a0 == InterfaceC0476a.a.f3122a) {
                    i35 = i30;
                    th2 = null;
                    TextController textController5 = new TextController(new TextState(new C10423b(c0689a, c7218l2, i31, i32, z11, i21, interfaceC10015c, aVar, list2), jLongValue));
                    Mo1636j.m1597F0(textController5);
                    objM1619a0 = textController5;
                } else {
                    i35 = i30;
                    th2 = null;
                }
                Mo1636j.m1609Q(false);
                textController = (TextController) objM1619a0;
                textState = textController.f2539a;
                if (Mo1636j.f2897L) {
                    c10423b = textState.f2563d;
                    C5207g.m11111f(c10423b, "current");
                    C5207g.m11111f(c7218l2, "style");
                    C5207g.m11111f(interfaceC10015c, "density");
                    C5207g.m11111f(aVar, "fontFamilyResolver");
                    C5207g.m11111f(list2, "placeholders");
                    c0689a2 = c0689a;
                    i37 = 0;
                    if (C5207g.m11106a(c10423b.f52258a, c0689a2)) {
                        z15 = z11;
                        i43 = i21;
                        i44 = i31;
                        i45 = i32;
                        i39 = i45;
                        i38 = i44;
                        i36 = i43;
                        z13 = z15;
                        c10423b = new C10423b(c0689a, c7218l2, i44, i39, z15, i36, interfaceC10015c, aVar, list2);
                    } else {
                        z15 = z11;
                        i43 = i21;
                        i44 = i31;
                        i45 = i32;
                        i39 = i45;
                        i38 = i44;
                        i36 = i43;
                        z13 = z15;
                        c10423b = new C10423b(c0689a, c7218l2, i44, i39, z15, i36, interfaceC10015c, aVar, list2);
                    }
                    textController.m1540f(c10423b);
                } else {
                    c0689a2 = c0689a;
                    z13 = z11;
                    i36 = i21;
                    i37 = 0;
                    i38 = i31;
                    i39 = i32;
                }
                textState.getClass();
                interfaceC2052l3 = interfaceC2052l2;
                C5207g.m11111f(interfaceC2052l3, "<set-?>");
                textState.f2561b = interfaceC2052l3;
                textController.m1541g(interfaceC0004c);
                if (list3.isEmpty()) {
                    M14522b = ComposableSingletons$BasicTextKt.f2524a;
                } else {
                    final int i53 = i35;
                    M14522b = C7204a.m14522b(Mo1636j, 1749415830, new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$4
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                            InterfaceC0476a interfaceC0476a3 = interfaceC0476a2;
                            if ((num.intValue() & 11) == 2 && interfaceC0476a3.mo1642m()) {
                                interfaceC0476a3.mo1650q();
                            } else {
                                InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q8 = ComposerKt.f3003a;
                                CoreTextKt.m1534a(c0689a2, list3, interfaceC0476a3, (i53 & 14) | 64);
                            }
                            return C9072e.f47360a;
                        }
                    });
                }
                interfaceC0500b3 = interfaceC0500b2;
                InterfaceC0500b interfaceC0500bMo1929K4 = interfaceC0500b3.mo1929K(textController.m1539e());
                Mo1636j.mo1622c(-1323940314);
                interfaceC10015c2 = (InterfaceC10015c) Mo1636j.mo1648p(CompositionLocalsKt.f4137e);
                layoutDirection = (LayoutDirection) Mo1636j.mo1648p(CompositionLocalsKt.f4143k);
                interfaceC0647n1 = (InterfaceC0647n1) Mo1636j.mo1648p(CompositionLocalsKt.f4148p);
                ComposeUiNode.f3726n.getClass();
                interfaceC2041a = ComposeUiNode.Companion.f3728b;
                M2036a = C0520a.m2036a(interfaceC0500bMo1929K4);
                if (Mo1636j.f2910a instanceof InterfaceC5299c) {
                    C8573r0.m16771y0();
                    throw th2;
                }
                Mo1636j.mo1640l();
                if (Mo1636j.f2897L) {
                    Mo1636j.mo1634i(interfaceC2041a);
                } else {
                    Mo1636j.mo1653s();
                }
                C8573r0.m16714a1(Mo1636j, textController.f2542d, ComposeUiNode.Companion.f3731e);
                C8573r0.m16714a1(Mo1636j, interfaceC10015c2, ComposeUiNode.Companion.f3730d);
                C8573r0.m16714a1(Mo1636j, layoutDirection, ComposeUiNode.Companion.f3732f);
                C8573r0.m16714a1(Mo1636j, interfaceC0647n1, ComposeUiNode.Companion.f3733g);
                M2036a.mo1343M(new C5340u0(Mo1636j), Mo1636j, Integer.valueOf(i37));
                Mo1636j.mo1622c(2058660585);
                M14522b.mo1337m0(Mo1636j, Integer.valueOf(i37));
                ?? r14 = i37;
                Mo1636j.m1609Q(r14);
                Mo1636j.m1609Q(true);
                Mo1636j.m1609Q(r14);
                InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q8 = ComposerKt.f3003a;
                interfaceC0500b4 = interfaceC0500b3;
                interfaceC2052l4 = interfaceC2052l3;
                c7218l3 = c7218l2;
                map2 = mapM13459L0;
                i40 = i39;
                i41 = i38;
                i42 = i36;
                z14 = z13;
                c5332q0M1612T = Mo1636j.m1612T();
                if (c5332q0M1612T == null) {
                    return;
                }
                c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$5
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // cm.InterfaceC2056p
                    /* JADX INFO: renamed from: m0 */
                    public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) throws Throwable {
                        num.intValue();
                        BasicTextKt.m1533d(c0689a, interfaceC0500b4, c7218l3, interfaceC2052l4, i42, z14, i41, i40, map2, interfaceC0476a2, C8573r0.m16737l1(i13 | 1), i14);
                        return C9072e.f47360a;
                    }
                };
            }
            i15 |= 384;
            c7218l2 = c7218l;
            i18 = i14 & 8;
            if (i18 != 0) {
                if ((i13 & 7168) == 0) {
                    interfaceC2052l2 = interfaceC2052l;
                    if (Mo1636j.m1600H(interfaceC2052l2)) {
                        i19 = 2048;
                    } else {
                        i19 = 1024;
                    }
                    i15 |= i19;
                }
                i20 = i14 & 16;
                if (i20 != 0) {
                    if ((57344 & i13) == 0) {
                        i21 = i10;
                        if (Mo1636j.m1594E(i21)) {
                            i22 = 16384;
                        } else {
                            i22 = 8192;
                        }
                        i15 |= i22;
                    }
                    i23 = i14 & 32;
                    if (i23 != 0) {
                        i15 |= 196608;
                    } else if ((i13 & 458752) == 0) {
                        if (Mo1636j.m1598G(z10)) {
                            i24 = 131072;
                        } else {
                            i24 = 65536;
                        }
                        i15 |= i24;
                    }
                    i25 = i14 & 64;
                    if (i25 != 0) {
                        i15 |= 1572864;
                    } else if ((i13 & 3670016) == 0) {
                        if (Mo1636j.m1594E(i11)) {
                            i26 = 1048576;
                        } else {
                            i26 = 524288;
                        }
                        i15 |= i26;
                    }
                    i27 = i14 & BuildConfig.SDK_TRUNCATE_LENGTH;
                    if (i27 != 0) {
                        i15 |= 12582912;
                    } else if ((i13 & 29360128) == 0) {
                        if (Mo1636j.m1594E(i12)) {
                            i28 = 8388608;
                        } else {
                            i28 = 4194304;
                        }
                        i15 |= i28;
                    }
                    i29 = i14 & 256;
                    if (i29 != 0) {
                        i15 |= 33554432;
                    }
                    if (i29 == 256) {
                        i30 = i15;
                        if ((191739611 & i15) != 38347922) {
                        }
                        c5332q0M1612T = Mo1636j.m1612T();
                        if (c5332q0M1612T == null) {
                            return;
                        }
                        c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$5
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) throws Throwable {
                                num.intValue();
                                BasicTextKt.m1533d(c0689a, interfaceC0500b4, c7218l3, interfaceC2052l4, i42, z14, i41, i40, map2, interfaceC0476a2, C8573r0.m16737l1(i13 | 1), i14);
                                return C9072e.f47360a;
                            }
                        };
                    }
                    i30 = i15;
                    if (i46 != 0) {
                        interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                    }
                    if (i16 != 0) {
                        c7218l2 = C7218l.f40599c;
                    }
                    if (i18 != 0) {
                        interfaceC2052l2 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$3
                            @Override // cm.InterfaceC2052l
                            /* JADX INFO: renamed from: n */
                            public final C9072e mo528n(C7216j c7216j) {
                                C5207g.m11111f(c7216j, "it");
                                return C9072e.f47360a;
                            }
                        };
                    }
                    if (i20 != 0) {
                        i21 = 1;
                    }
                    if (i23 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    if (i25 != 0) {
                        i31 = Integer.MAX_VALUE;
                    } else {
                        i31 = i11;
                    }
                    if (i27 != 0) {
                        i32 = 1;
                    } else {
                        i32 = i12;
                    }
                    if (i29 != 0) {
                        mapM13459L0 = C6753d.m13459L0();
                    } else {
                        mapM13459L0 = map;
                    }
                    InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q9 = ComposerKt.f3003a;
                    C8584v.m16781D(i32, i31);
                    interfaceC0004c = (InterfaceC0004c) Mo1636j.mo1648p(SelectionRegistrarKt.f2569a);
                    interfaceC10015c = (InterfaceC10015c) Mo1636j.mo1648p(CompositionLocalsKt.f4137e);
                    aVar = (AbstractC0696b.a) Mo1636j.mo1648p(CompositionLocalsKt.f4140h);
                    long j14 = ((C0005d) Mo1636j.mo1648p(TextSelectionColorsKt.f2571a)).f3b;
                    Pair<List<C0689a.b<C7213g>>, List<C0689a.b<InterfaceC2057q<String, InterfaceC0476a, Integer, C9072e>>>> pair6 = CoreTextKt.f2526a;
                    C5207g.m11111f(mapM13459L0, "inlineContent");
                    if (mapM13459L0.isEmpty()) {
                        pair = CoreTextKt.f2526a;
                        interfaceC0500b2 = interfaceC0500b2;
                        interfaceC2052l2 = interfaceC2052l2;
                    } else {
                        int length5 = c0689a.length();
                        list = c0689a.f4526d;
                        if (list != null) {
                            arrayList = new ArrayList(list.size());
                            size2 = list.size();
                            i34 = 0;
                            while (i34 < size2) {
                                int i419 = size2;
                                bVar2 = list.get(i34);
                                List<C0689a.b<? extends Object>> list8 = list;
                                bVar3 = bVar2;
                                if (!(bVar3.f4536a instanceof String)) {
                                    z12 = false;
                                } else {
                                    z12 = false;
                                }
                                if (z12) {
                                    arrayList.add(bVar2);
                                }
                                i34++;
                                size2 = i419;
                                list = list8;
                            }
                        } else {
                            arrayList = EmptyList.f38032a;
                        }
                        C5207g.m11109d(arrayList, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString.Range<kotlin.String>>");
                        arrayList2 = new ArrayList();
                        arrayList3 = new ArrayList();
                        size = arrayList.size();
                        i33 = 0;
                        r10 = arrayList;
                        while (i33 < size) {
                            bVar = (C0689a.b) r10.get(i33);
                            if (mapM13459L0.get(bVar.f4536a) != null) {
                                int i4110 = bVar.f4537b;
                                int i4111 = bVar.f4538c;
                                arrayList2.add(new C0689a.b(i4110, i4111, null));
                                arrayList3.add(new C0689a.b(i4110, i4111, null));
                            }
                            i33++;
                            size = size;
                            r10 = r10;
                        }
                        pair = new Pair<>(arrayList2, arrayList3);
                    }
                    list2 = pair.f38012a;
                    list3 = pair.f38013b;
                    Mo1636j.mo1622c(959243860);
                    if (interfaceC0004c == null) {
                        jLongValue = 0;
                    } else {
                        jLongValue = ((Number) C0487a.m1860a(new Object[]{c0689a, interfaceC0004c}, SaverKt.m1859a(new BasicTextKt$selectionIdSaver$1(interfaceC0004c), BasicTextKt$selectionIdSaver$2.f2523b), new InterfaceC2041a<Long>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$selectableId$2
                            {
                                super(0);
                            }

                            @Override // cm.InterfaceC2041a
                            /* JADX INFO: renamed from: E */
                            public final Long mo807E() {
                                return Long.valueOf(interfaceC0004c.m6b());
                            }
                        }, Mo1636j, 4)).longValue();
                    }
                    Mo1636j.m1609Q(false);
                    Mo1636j.mo1622c(-492369756);
                    objM1619a0 = Mo1636j.m1619a0();
                    if (objM1619a0 == InterfaceC0476a.a.f3122a) {
                        i35 = i30;
                        th2 = null;
                        TextController textController6 = new TextController(new TextState(new C10423b(c0689a, c7218l2, i31, i32, z11, i21, interfaceC10015c, aVar, list2), jLongValue));
                        Mo1636j.m1597F0(textController6);
                        objM1619a0 = textController6;
                    } else {
                        i35 = i30;
                        th2 = null;
                    }
                    Mo1636j.m1609Q(false);
                    textController = (TextController) objM1619a0;
                    textState = textController.f2539a;
                    if (Mo1636j.f2897L) {
                        c10423b = textState.f2563d;
                        C5207g.m11111f(c10423b, "current");
                        C5207g.m11111f(c7218l2, "style");
                        C5207g.m11111f(interfaceC10015c, "density");
                        C5207g.m11111f(aVar, "fontFamilyResolver");
                        C5207g.m11111f(list2, "placeholders");
                        c0689a2 = c0689a;
                        i37 = 0;
                        if (C5207g.m11106a(c10423b.f52258a, c0689a2)) {
                            z15 = z11;
                            i43 = i21;
                            i44 = i31;
                            i45 = i32;
                            i39 = i45;
                            i38 = i44;
                            i36 = i43;
                            z13 = z15;
                            c10423b = new C10423b(c0689a, c7218l2, i44, i39, z15, i36, interfaceC10015c, aVar, list2);
                        } else {
                            z15 = z11;
                            i43 = i21;
                            i44 = i31;
                            i45 = i32;
                            i39 = i45;
                            i38 = i44;
                            i36 = i43;
                            z13 = z15;
                            c10423b = new C10423b(c0689a, c7218l2, i44, i39, z15, i36, interfaceC10015c, aVar, list2);
                        }
                        textController.m1540f(c10423b);
                    } else {
                        c0689a2 = c0689a;
                        z13 = z11;
                        i36 = i21;
                        i37 = 0;
                        i38 = i31;
                        i39 = i32;
                    }
                    textState.getClass();
                    interfaceC2052l3 = interfaceC2052l2;
                    C5207g.m11111f(interfaceC2052l3, "<set-?>");
                    textState.f2561b = interfaceC2052l3;
                    textController.m1541g(interfaceC0004c);
                    if (list3.isEmpty()) {
                        M14522b = ComposableSingletons$BasicTextKt.f2524a;
                    } else {
                        final int i54 = i35;
                        M14522b = C7204a.m14522b(Mo1636j, 1749415830, new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$4
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                                InterfaceC0476a interfaceC0476a3 = interfaceC0476a2;
                                if ((num.intValue() & 11) == 2 && interfaceC0476a3.mo1642m()) {
                                    interfaceC0476a3.mo1650q();
                                } else {
                                    InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q10 = ComposerKt.f3003a;
                                    CoreTextKt.m1534a(c0689a2, list3, interfaceC0476a3, (i54 & 14) | 64);
                                }
                                return C9072e.f47360a;
                            }
                        });
                    }
                    interfaceC0500b3 = interfaceC0500b2;
                    InterfaceC0500b interfaceC0500bMo1929K5 = interfaceC0500b3.mo1929K(textController.m1539e());
                    Mo1636j.mo1622c(-1323940314);
                    interfaceC10015c2 = (InterfaceC10015c) Mo1636j.mo1648p(CompositionLocalsKt.f4137e);
                    layoutDirection = (LayoutDirection) Mo1636j.mo1648p(CompositionLocalsKt.f4143k);
                    interfaceC0647n1 = (InterfaceC0647n1) Mo1636j.mo1648p(CompositionLocalsKt.f4148p);
                    ComposeUiNode.f3726n.getClass();
                    interfaceC2041a = ComposeUiNode.Companion.f3728b;
                    M2036a = C0520a.m2036a(interfaceC0500bMo1929K5);
                    if (Mo1636j.f2910a instanceof InterfaceC5299c) {
                        C8573r0.m16771y0();
                        throw th2;
                    }
                    Mo1636j.mo1640l();
                    if (Mo1636j.f2897L) {
                        Mo1636j.mo1634i(interfaceC2041a);
                    } else {
                        Mo1636j.mo1653s();
                    }
                    C8573r0.m16714a1(Mo1636j, textController.f2542d, ComposeUiNode.Companion.f3731e);
                    C8573r0.m16714a1(Mo1636j, interfaceC10015c2, ComposeUiNode.Companion.f3730d);
                    C8573r0.m16714a1(Mo1636j, layoutDirection, ComposeUiNode.Companion.f3732f);
                    C8573r0.m16714a1(Mo1636j, interfaceC0647n1, ComposeUiNode.Companion.f3733g);
                    M2036a.mo1343M(new C5340u0(Mo1636j), Mo1636j, Integer.valueOf(i37));
                    Mo1636j.mo1622c(2058660585);
                    M14522b.mo1337m0(Mo1636j, Integer.valueOf(i37));
                    ?? r15 = i37;
                    Mo1636j.m1609Q(r15);
                    Mo1636j.m1609Q(true);
                    Mo1636j.m1609Q(r15);
                    InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q10 = ComposerKt.f3003a;
                    interfaceC0500b4 = interfaceC0500b3;
                    interfaceC2052l4 = interfaceC2052l3;
                    c7218l3 = c7218l2;
                    map2 = mapM13459L0;
                    i40 = i39;
                    i41 = i38;
                    i42 = i36;
                    z14 = z13;
                    c5332q0M1612T = Mo1636j.m1612T();
                    if (c5332q0M1612T == null) {
                        return;
                    }
                    c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$5
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) throws Throwable {
                            num.intValue();
                            BasicTextKt.m1533d(c0689a, interfaceC0500b4, c7218l3, interfaceC2052l4, i42, z14, i41, i40, map2, interfaceC0476a2, C8573r0.m16737l1(i13 | 1), i14);
                            return C9072e.f47360a;
                        }
                    };
                }
                i15 |= 24576;
                i21 = i10;
                i23 = i14 & 32;
                if (i23 != 0) {
                    i15 |= 196608;
                } else if ((i13 & 458752) == 0) {
                    if (Mo1636j.m1598G(z10)) {
                        i24 = 131072;
                    } else {
                        i24 = 65536;
                    }
                    i15 |= i24;
                }
                i25 = i14 & 64;
                if (i25 != 0) {
                    i15 |= 1572864;
                } else if ((i13 & 3670016) == 0) {
                    if (Mo1636j.m1594E(i11)) {
                        i26 = 1048576;
                    } else {
                        i26 = 524288;
                    }
                    i15 |= i26;
                }
                i27 = i14 & BuildConfig.SDK_TRUNCATE_LENGTH;
                if (i27 != 0) {
                    i15 |= 12582912;
                } else if ((i13 & 29360128) == 0) {
                    if (Mo1636j.m1594E(i12)) {
                        i28 = 8388608;
                    } else {
                        i28 = 4194304;
                    }
                    i15 |= i28;
                }
                i29 = i14 & 256;
                if (i29 != 0) {
                    i15 |= 33554432;
                }
                if (i29 == 256) {
                    i30 = i15;
                    if ((191739611 & i15) != 38347922) {
                    }
                    c5332q0M1612T = Mo1636j.m1612T();
                    if (c5332q0M1612T == null) {
                        return;
                    }
                    c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$5
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) throws Throwable {
                            num.intValue();
                            BasicTextKt.m1533d(c0689a, interfaceC0500b4, c7218l3, interfaceC2052l4, i42, z14, i41, i40, map2, interfaceC0476a2, C8573r0.m16737l1(i13 | 1), i14);
                            return C9072e.f47360a;
                        }
                    };
                }
                i30 = i15;
                if (i46 != 0) {
                    interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                }
                if (i16 != 0) {
                    c7218l2 = C7218l.f40599c;
                }
                if (i18 != 0) {
                    interfaceC2052l2 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$3
                        @Override // cm.InterfaceC2052l
                        /* JADX INFO: renamed from: n */
                        public final C9072e mo528n(C7216j c7216j) {
                            C5207g.m11111f(c7216j, "it");
                            return C9072e.f47360a;
                        }
                    };
                }
                if (i20 != 0) {
                    i21 = 1;
                }
                if (i23 != 0) {
                    z11 = true;
                } else {
                    z11 = z10;
                }
                if (i25 != 0) {
                    i31 = Integer.MAX_VALUE;
                } else {
                    i31 = i11;
                }
                if (i27 != 0) {
                    i32 = 1;
                } else {
                    i32 = i12;
                }
                if (i29 != 0) {
                    mapM13459L0 = C6753d.m13459L0();
                } else {
                    mapM13459L0 = map;
                }
                InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q11 = ComposerKt.f3003a;
                C8584v.m16781D(i32, i31);
                interfaceC0004c = (InterfaceC0004c) Mo1636j.mo1648p(SelectionRegistrarKt.f2569a);
                interfaceC10015c = (InterfaceC10015c) Mo1636j.mo1648p(CompositionLocalsKt.f4137e);
                aVar = (AbstractC0696b.a) Mo1636j.mo1648p(CompositionLocalsKt.f4140h);
                long j15 = ((C0005d) Mo1636j.mo1648p(TextSelectionColorsKt.f2571a)).f3b;
                Pair<List<C0689a.b<C7213g>>, List<C0689a.b<InterfaceC2057q<String, InterfaceC0476a, Integer, C9072e>>>> pair7 = CoreTextKt.f2526a;
                C5207g.m11111f(mapM13459L0, "inlineContent");
                if (mapM13459L0.isEmpty()) {
                    pair = CoreTextKt.f2526a;
                    interfaceC0500b2 = interfaceC0500b2;
                    interfaceC2052l2 = interfaceC2052l2;
                } else {
                    int length6 = c0689a.length();
                    list = c0689a.f4526d;
                    if (list != null) {
                        arrayList = new ArrayList(list.size());
                        size2 = list.size();
                        i34 = 0;
                        while (i34 < size2) {
                            int i4112 = size2;
                            bVar2 = list.get(i34);
                            List<C0689a.b<? extends Object>> list9 = list;
                            bVar3 = bVar2;
                            if (!(bVar3.f4536a instanceof String)) {
                                z12 = false;
                            } else {
                                z12 = false;
                            }
                            if (z12) {
                                arrayList.add(bVar2);
                            }
                            i34++;
                            size2 = i4112;
                            list = list9;
                        }
                    } else {
                        arrayList = EmptyList.f38032a;
                    }
                    C5207g.m11109d(arrayList, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString.Range<kotlin.String>>");
                    arrayList2 = new ArrayList();
                    arrayList3 = new ArrayList();
                    size = arrayList.size();
                    i33 = 0;
                    r10 = arrayList;
                    while (i33 < size) {
                        bVar = (C0689a.b) r10.get(i33);
                        if (mapM13459L0.get(bVar.f4536a) != null) {
                            int i4113 = bVar.f4537b;
                            int i4114 = bVar.f4538c;
                            arrayList2.add(new C0689a.b(i4113, i4114, null));
                            arrayList3.add(new C0689a.b(i4113, i4114, null));
                        }
                        i33++;
                        size = size;
                        r10 = r10;
                    }
                    pair = new Pair<>(arrayList2, arrayList3);
                }
                list2 = pair.f38012a;
                list3 = pair.f38013b;
                Mo1636j.mo1622c(959243860);
                if (interfaceC0004c == null) {
                    jLongValue = 0;
                } else {
                    jLongValue = ((Number) C0487a.m1860a(new Object[]{c0689a, interfaceC0004c}, SaverKt.m1859a(new BasicTextKt$selectionIdSaver$1(interfaceC0004c), BasicTextKt$selectionIdSaver$2.f2523b), new InterfaceC2041a<Long>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$selectableId$2
                        {
                            super(0);
                        }

                        @Override // cm.InterfaceC2041a
                        /* JADX INFO: renamed from: E */
                        public final Long mo807E() {
                            return Long.valueOf(interfaceC0004c.m6b());
                        }
                    }, Mo1636j, 4)).longValue();
                }
                Mo1636j.m1609Q(false);
                Mo1636j.mo1622c(-492369756);
                objM1619a0 = Mo1636j.m1619a0();
                if (objM1619a0 == InterfaceC0476a.a.f3122a) {
                    i35 = i30;
                    th2 = null;
                    TextController textController7 = new TextController(new TextState(new C10423b(c0689a, c7218l2, i31, i32, z11, i21, interfaceC10015c, aVar, list2), jLongValue));
                    Mo1636j.m1597F0(textController7);
                    objM1619a0 = textController7;
                } else {
                    i35 = i30;
                    th2 = null;
                }
                Mo1636j.m1609Q(false);
                textController = (TextController) objM1619a0;
                textState = textController.f2539a;
                if (Mo1636j.f2897L) {
                    c10423b = textState.f2563d;
                    C5207g.m11111f(c10423b, "current");
                    C5207g.m11111f(c7218l2, "style");
                    C5207g.m11111f(interfaceC10015c, "density");
                    C5207g.m11111f(aVar, "fontFamilyResolver");
                    C5207g.m11111f(list2, "placeholders");
                    c0689a2 = c0689a;
                    i37 = 0;
                    if (C5207g.m11106a(c10423b.f52258a, c0689a2)) {
                        z15 = z11;
                        i43 = i21;
                        i44 = i31;
                        i45 = i32;
                        i39 = i45;
                        i38 = i44;
                        i36 = i43;
                        z13 = z15;
                        c10423b = new C10423b(c0689a, c7218l2, i44, i39, z15, i36, interfaceC10015c, aVar, list2);
                    } else {
                        z15 = z11;
                        i43 = i21;
                        i44 = i31;
                        i45 = i32;
                        i39 = i45;
                        i38 = i44;
                        i36 = i43;
                        z13 = z15;
                        c10423b = new C10423b(c0689a, c7218l2, i44, i39, z15, i36, interfaceC10015c, aVar, list2);
                    }
                    textController.m1540f(c10423b);
                } else {
                    c0689a2 = c0689a;
                    z13 = z11;
                    i36 = i21;
                    i37 = 0;
                    i38 = i31;
                    i39 = i32;
                }
                textState.getClass();
                interfaceC2052l3 = interfaceC2052l2;
                C5207g.m11111f(interfaceC2052l3, "<set-?>");
                textState.f2561b = interfaceC2052l3;
                textController.m1541g(interfaceC0004c);
                if (list3.isEmpty()) {
                    M14522b = ComposableSingletons$BasicTextKt.f2524a;
                } else {
                    final int i55 = i35;
                    M14522b = C7204a.m14522b(Mo1636j, 1749415830, new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$4
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                            InterfaceC0476a interfaceC0476a3 = interfaceC0476a2;
                            if ((num.intValue() & 11) == 2 && interfaceC0476a3.mo1642m()) {
                                interfaceC0476a3.mo1650q();
                            } else {
                                InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q12 = ComposerKt.f3003a;
                                CoreTextKt.m1534a(c0689a2, list3, interfaceC0476a3, (i55 & 14) | 64);
                            }
                            return C9072e.f47360a;
                        }
                    });
                }
                interfaceC0500b3 = interfaceC0500b2;
                InterfaceC0500b interfaceC0500bMo1929K6 = interfaceC0500b3.mo1929K(textController.m1539e());
                Mo1636j.mo1622c(-1323940314);
                interfaceC10015c2 = (InterfaceC10015c) Mo1636j.mo1648p(CompositionLocalsKt.f4137e);
                layoutDirection = (LayoutDirection) Mo1636j.mo1648p(CompositionLocalsKt.f4143k);
                interfaceC0647n1 = (InterfaceC0647n1) Mo1636j.mo1648p(CompositionLocalsKt.f4148p);
                ComposeUiNode.f3726n.getClass();
                interfaceC2041a = ComposeUiNode.Companion.f3728b;
                M2036a = C0520a.m2036a(interfaceC0500bMo1929K6);
                if (Mo1636j.f2910a instanceof InterfaceC5299c) {
                    C8573r0.m16771y0();
                    throw th2;
                }
                Mo1636j.mo1640l();
                if (Mo1636j.f2897L) {
                    Mo1636j.mo1634i(interfaceC2041a);
                } else {
                    Mo1636j.mo1653s();
                }
                C8573r0.m16714a1(Mo1636j, textController.f2542d, ComposeUiNode.Companion.f3731e);
                C8573r0.m16714a1(Mo1636j, interfaceC10015c2, ComposeUiNode.Companion.f3730d);
                C8573r0.m16714a1(Mo1636j, layoutDirection, ComposeUiNode.Companion.f3732f);
                C8573r0.m16714a1(Mo1636j, interfaceC0647n1, ComposeUiNode.Companion.f3733g);
                M2036a.mo1343M(new C5340u0(Mo1636j), Mo1636j, Integer.valueOf(i37));
                Mo1636j.mo1622c(2058660585);
                M14522b.mo1337m0(Mo1636j, Integer.valueOf(i37));
                ?? r16 = i37;
                Mo1636j.m1609Q(r16);
                Mo1636j.m1609Q(true);
                Mo1636j.m1609Q(r16);
                InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q12 = ComposerKt.f3003a;
                interfaceC0500b4 = interfaceC0500b3;
                interfaceC2052l4 = interfaceC2052l3;
                c7218l3 = c7218l2;
                map2 = mapM13459L0;
                i40 = i39;
                i41 = i38;
                i42 = i36;
                z14 = z13;
                c5332q0M1612T = Mo1636j.m1612T();
                if (c5332q0M1612T == null) {
                    return;
                }
                c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$5
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // cm.InterfaceC2056p
                    /* JADX INFO: renamed from: m0 */
                    public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) throws Throwable {
                        num.intValue();
                        BasicTextKt.m1533d(c0689a, interfaceC0500b4, c7218l3, interfaceC2052l4, i42, z14, i41, i40, map2, interfaceC0476a2, C8573r0.m16737l1(i13 | 1), i14);
                        return C9072e.f47360a;
                    }
                };
            }
            i15 |= 3072;
            interfaceC2052l2 = interfaceC2052l;
            i20 = i14 & 16;
            if (i20 != 0) {
                if ((57344 & i13) == 0) {
                    i21 = i10;
                    if (Mo1636j.m1594E(i21)) {
                        i22 = 16384;
                    } else {
                        i22 = 8192;
                    }
                    i15 |= i22;
                }
                i23 = i14 & 32;
                if (i23 != 0) {
                    i15 |= 196608;
                } else if ((i13 & 458752) == 0) {
                    if (Mo1636j.m1598G(z10)) {
                        i24 = 131072;
                    } else {
                        i24 = 65536;
                    }
                    i15 |= i24;
                }
                i25 = i14 & 64;
                if (i25 != 0) {
                    i15 |= 1572864;
                } else if ((i13 & 3670016) == 0) {
                    if (Mo1636j.m1594E(i11)) {
                        i26 = 1048576;
                    } else {
                        i26 = 524288;
                    }
                    i15 |= i26;
                }
                i27 = i14 & BuildConfig.SDK_TRUNCATE_LENGTH;
                if (i27 != 0) {
                    i15 |= 12582912;
                } else if ((i13 & 29360128) == 0) {
                    if (Mo1636j.m1594E(i12)) {
                        i28 = 8388608;
                    } else {
                        i28 = 4194304;
                    }
                    i15 |= i28;
                }
                i29 = i14 & 256;
                if (i29 != 0) {
                    i15 |= 33554432;
                }
                if (i29 == 256) {
                    i30 = i15;
                    if ((191739611 & i15) != 38347922) {
                    }
                    c5332q0M1612T = Mo1636j.m1612T();
                    if (c5332q0M1612T == null) {
                        return;
                    }
                    c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$5
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) throws Throwable {
                            num.intValue();
                            BasicTextKt.m1533d(c0689a, interfaceC0500b4, c7218l3, interfaceC2052l4, i42, z14, i41, i40, map2, interfaceC0476a2, C8573r0.m16737l1(i13 | 1), i14);
                            return C9072e.f47360a;
                        }
                    };
                }
                i30 = i15;
                if (i46 != 0) {
                    interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                }
                if (i16 != 0) {
                    c7218l2 = C7218l.f40599c;
                }
                if (i18 != 0) {
                    interfaceC2052l2 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$3
                        @Override // cm.InterfaceC2052l
                        /* JADX INFO: renamed from: n */
                        public final C9072e mo528n(C7216j c7216j) {
                            C5207g.m11111f(c7216j, "it");
                            return C9072e.f47360a;
                        }
                    };
                }
                if (i20 != 0) {
                    i21 = 1;
                }
                if (i23 != 0) {
                    z11 = true;
                } else {
                    z11 = z10;
                }
                if (i25 != 0) {
                    i31 = Integer.MAX_VALUE;
                } else {
                    i31 = i11;
                }
                if (i27 != 0) {
                    i32 = 1;
                } else {
                    i32 = i12;
                }
                if (i29 != 0) {
                    mapM13459L0 = C6753d.m13459L0();
                } else {
                    mapM13459L0 = map;
                }
                InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q13 = ComposerKt.f3003a;
                C8584v.m16781D(i32, i31);
                interfaceC0004c = (InterfaceC0004c) Mo1636j.mo1648p(SelectionRegistrarKt.f2569a);
                interfaceC10015c = (InterfaceC10015c) Mo1636j.mo1648p(CompositionLocalsKt.f4137e);
                aVar = (AbstractC0696b.a) Mo1636j.mo1648p(CompositionLocalsKt.f4140h);
                long j16 = ((C0005d) Mo1636j.mo1648p(TextSelectionColorsKt.f2571a)).f3b;
                Pair<List<C0689a.b<C7213g>>, List<C0689a.b<InterfaceC2057q<String, InterfaceC0476a, Integer, C9072e>>>> pair8 = CoreTextKt.f2526a;
                C5207g.m11111f(mapM13459L0, "inlineContent");
                if (mapM13459L0.isEmpty()) {
                    pair = CoreTextKt.f2526a;
                    interfaceC0500b2 = interfaceC0500b2;
                    interfaceC2052l2 = interfaceC2052l2;
                } else {
                    int length7 = c0689a.length();
                    list = c0689a.f4526d;
                    if (list != null) {
                        arrayList = new ArrayList(list.size());
                        size2 = list.size();
                        i34 = 0;
                        while (i34 < size2) {
                            int i4115 = size2;
                            bVar2 = list.get(i34);
                            List<C0689a.b<? extends Object>> list10 = list;
                            bVar3 = bVar2;
                            if (!(bVar3.f4536a instanceof String)) {
                                z12 = false;
                            } else {
                                z12 = false;
                            }
                            if (z12) {
                                arrayList.add(bVar2);
                            }
                            i34++;
                            size2 = i4115;
                            list = list10;
                        }
                    } else {
                        arrayList = EmptyList.f38032a;
                    }
                    C5207g.m11109d(arrayList, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString.Range<kotlin.String>>");
                    arrayList2 = new ArrayList();
                    arrayList3 = new ArrayList();
                    size = arrayList.size();
                    i33 = 0;
                    r10 = arrayList;
                    while (i33 < size) {
                        bVar = (C0689a.b) r10.get(i33);
                        if (mapM13459L0.get(bVar.f4536a) != null) {
                            int i4116 = bVar.f4537b;
                            int i4117 = bVar.f4538c;
                            arrayList2.add(new C0689a.b(i4116, i4117, null));
                            arrayList3.add(new C0689a.b(i4116, i4117, null));
                        }
                        i33++;
                        size = size;
                        r10 = r10;
                    }
                    pair = new Pair<>(arrayList2, arrayList3);
                }
                list2 = pair.f38012a;
                list3 = pair.f38013b;
                Mo1636j.mo1622c(959243860);
                if (interfaceC0004c == null) {
                    jLongValue = 0;
                } else {
                    jLongValue = ((Number) C0487a.m1860a(new Object[]{c0689a, interfaceC0004c}, SaverKt.m1859a(new BasicTextKt$selectionIdSaver$1(interfaceC0004c), BasicTextKt$selectionIdSaver$2.f2523b), new InterfaceC2041a<Long>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$selectableId$2
                        {
                            super(0);
                        }

                        @Override // cm.InterfaceC2041a
                        /* JADX INFO: renamed from: E */
                        public final Long mo807E() {
                            return Long.valueOf(interfaceC0004c.m6b());
                        }
                    }, Mo1636j, 4)).longValue();
                }
                Mo1636j.m1609Q(false);
                Mo1636j.mo1622c(-492369756);
                objM1619a0 = Mo1636j.m1619a0();
                if (objM1619a0 == InterfaceC0476a.a.f3122a) {
                    i35 = i30;
                    th2 = null;
                    TextController textController8 = new TextController(new TextState(new C10423b(c0689a, c7218l2, i31, i32, z11, i21, interfaceC10015c, aVar, list2), jLongValue));
                    Mo1636j.m1597F0(textController8);
                    objM1619a0 = textController8;
                } else {
                    i35 = i30;
                    th2 = null;
                }
                Mo1636j.m1609Q(false);
                textController = (TextController) objM1619a0;
                textState = textController.f2539a;
                if (Mo1636j.f2897L) {
                    c10423b = textState.f2563d;
                    C5207g.m11111f(c10423b, "current");
                    C5207g.m11111f(c7218l2, "style");
                    C5207g.m11111f(interfaceC10015c, "density");
                    C5207g.m11111f(aVar, "fontFamilyResolver");
                    C5207g.m11111f(list2, "placeholders");
                    c0689a2 = c0689a;
                    i37 = 0;
                    if (C5207g.m11106a(c10423b.f52258a, c0689a2)) {
                        z15 = z11;
                        i43 = i21;
                        i44 = i31;
                        i45 = i32;
                        i39 = i45;
                        i38 = i44;
                        i36 = i43;
                        z13 = z15;
                        c10423b = new C10423b(c0689a, c7218l2, i44, i39, z15, i36, interfaceC10015c, aVar, list2);
                    } else {
                        z15 = z11;
                        i43 = i21;
                        i44 = i31;
                        i45 = i32;
                        i39 = i45;
                        i38 = i44;
                        i36 = i43;
                        z13 = z15;
                        c10423b = new C10423b(c0689a, c7218l2, i44, i39, z15, i36, interfaceC10015c, aVar, list2);
                    }
                    textController.m1540f(c10423b);
                } else {
                    c0689a2 = c0689a;
                    z13 = z11;
                    i36 = i21;
                    i37 = 0;
                    i38 = i31;
                    i39 = i32;
                }
                textState.getClass();
                interfaceC2052l3 = interfaceC2052l2;
                C5207g.m11111f(interfaceC2052l3, "<set-?>");
                textState.f2561b = interfaceC2052l3;
                textController.m1541g(interfaceC0004c);
                if (list3.isEmpty()) {
                    M14522b = ComposableSingletons$BasicTextKt.f2524a;
                } else {
                    final int i56 = i35;
                    M14522b = C7204a.m14522b(Mo1636j, 1749415830, new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$4
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                            InterfaceC0476a interfaceC0476a3 = interfaceC0476a2;
                            if ((num.intValue() & 11) == 2 && interfaceC0476a3.mo1642m()) {
                                interfaceC0476a3.mo1650q();
                            } else {
                                InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q14 = ComposerKt.f3003a;
                                CoreTextKt.m1534a(c0689a2, list3, interfaceC0476a3, (i56 & 14) | 64);
                            }
                            return C9072e.f47360a;
                        }
                    });
                }
                interfaceC0500b3 = interfaceC0500b2;
                InterfaceC0500b interfaceC0500bMo1929K7 = interfaceC0500b3.mo1929K(textController.m1539e());
                Mo1636j.mo1622c(-1323940314);
                interfaceC10015c2 = (InterfaceC10015c) Mo1636j.mo1648p(CompositionLocalsKt.f4137e);
                layoutDirection = (LayoutDirection) Mo1636j.mo1648p(CompositionLocalsKt.f4143k);
                interfaceC0647n1 = (InterfaceC0647n1) Mo1636j.mo1648p(CompositionLocalsKt.f4148p);
                ComposeUiNode.f3726n.getClass();
                interfaceC2041a = ComposeUiNode.Companion.f3728b;
                M2036a = C0520a.m2036a(interfaceC0500bMo1929K7);
                if (Mo1636j.f2910a instanceof InterfaceC5299c) {
                    C8573r0.m16771y0();
                    throw th2;
                }
                Mo1636j.mo1640l();
                if (Mo1636j.f2897L) {
                    Mo1636j.mo1634i(interfaceC2041a);
                } else {
                    Mo1636j.mo1653s();
                }
                C8573r0.m16714a1(Mo1636j, textController.f2542d, ComposeUiNode.Companion.f3731e);
                C8573r0.m16714a1(Mo1636j, interfaceC10015c2, ComposeUiNode.Companion.f3730d);
                C8573r0.m16714a1(Mo1636j, layoutDirection, ComposeUiNode.Companion.f3732f);
                C8573r0.m16714a1(Mo1636j, interfaceC0647n1, ComposeUiNode.Companion.f3733g);
                M2036a.mo1343M(new C5340u0(Mo1636j), Mo1636j, Integer.valueOf(i37));
                Mo1636j.mo1622c(2058660585);
                M14522b.mo1337m0(Mo1636j, Integer.valueOf(i37));
                ?? r17 = i37;
                Mo1636j.m1609Q(r17);
                Mo1636j.m1609Q(true);
                Mo1636j.m1609Q(r17);
                InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q14 = ComposerKt.f3003a;
                interfaceC0500b4 = interfaceC0500b3;
                interfaceC2052l4 = interfaceC2052l3;
                c7218l3 = c7218l2;
                map2 = mapM13459L0;
                i40 = i39;
                i41 = i38;
                i42 = i36;
                z14 = z13;
                c5332q0M1612T = Mo1636j.m1612T();
                if (c5332q0M1612T == null) {
                    return;
                }
                c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$5
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // cm.InterfaceC2056p
                    /* JADX INFO: renamed from: m0 */
                    public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) throws Throwable {
                        num.intValue();
                        BasicTextKt.m1533d(c0689a, interfaceC0500b4, c7218l3, interfaceC2052l4, i42, z14, i41, i40, map2, interfaceC0476a2, C8573r0.m16737l1(i13 | 1), i14);
                        return C9072e.f47360a;
                    }
                };
            }
            i15 |= 24576;
            i21 = i10;
            i23 = i14 & 32;
            if (i23 != 0) {
                i15 |= 196608;
            } else if ((i13 & 458752) == 0) {
                if (Mo1636j.m1598G(z10)) {
                    i24 = 131072;
                } else {
                    i24 = 65536;
                }
                i15 |= i24;
            }
            i25 = i14 & 64;
            if (i25 != 0) {
                i15 |= 1572864;
            } else if ((i13 & 3670016) == 0) {
                if (Mo1636j.m1594E(i11)) {
                    i26 = 1048576;
                } else {
                    i26 = 524288;
                }
                i15 |= i26;
            }
            i27 = i14 & BuildConfig.SDK_TRUNCATE_LENGTH;
            if (i27 != 0) {
                i15 |= 12582912;
            } else if ((i13 & 29360128) == 0) {
                if (Mo1636j.m1594E(i12)) {
                    i28 = 8388608;
                } else {
                    i28 = 4194304;
                }
                i15 |= i28;
            }
            i29 = i14 & 256;
            if (i29 != 0) {
                i15 |= 33554432;
            }
            if (i29 == 256) {
                i30 = i15;
                if ((191739611 & i15) != 38347922) {
                }
                c5332q0M1612T = Mo1636j.m1612T();
                if (c5332q0M1612T == null) {
                    return;
                }
                c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$5
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // cm.InterfaceC2056p
                    /* JADX INFO: renamed from: m0 */
                    public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) throws Throwable {
                        num.intValue();
                        BasicTextKt.m1533d(c0689a, interfaceC0500b4, c7218l3, interfaceC2052l4, i42, z14, i41, i40, map2, interfaceC0476a2, C8573r0.m16737l1(i13 | 1), i14);
                        return C9072e.f47360a;
                    }
                };
            }
            i30 = i15;
            if (i46 != 0) {
                interfaceC0500b2 = InterfaceC0500b.a.f3325a;
            }
            if (i16 != 0) {
                c7218l2 = C7218l.f40599c;
            }
            if (i18 != 0) {
                interfaceC2052l2 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$3
                    @Override // cm.InterfaceC2052l
                    /* JADX INFO: renamed from: n */
                    public final C9072e mo528n(C7216j c7216j) {
                        C5207g.m11111f(c7216j, "it");
                        return C9072e.f47360a;
                    }
                };
            }
            if (i20 != 0) {
                i21 = 1;
            }
            if (i23 != 0) {
                z11 = true;
            } else {
                z11 = z10;
            }
            if (i25 != 0) {
                i31 = Integer.MAX_VALUE;
            } else {
                i31 = i11;
            }
            if (i27 != 0) {
                i32 = 1;
            } else {
                i32 = i12;
            }
            if (i29 != 0) {
                mapM13459L0 = C6753d.m13459L0();
            } else {
                mapM13459L0 = map;
            }
            InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q15 = ComposerKt.f3003a;
            C8584v.m16781D(i32, i31);
            interfaceC0004c = (InterfaceC0004c) Mo1636j.mo1648p(SelectionRegistrarKt.f2569a);
            interfaceC10015c = (InterfaceC10015c) Mo1636j.mo1648p(CompositionLocalsKt.f4137e);
            aVar = (AbstractC0696b.a) Mo1636j.mo1648p(CompositionLocalsKt.f4140h);
            long j17 = ((C0005d) Mo1636j.mo1648p(TextSelectionColorsKt.f2571a)).f3b;
            Pair<List<C0689a.b<C7213g>>, List<C0689a.b<InterfaceC2057q<String, InterfaceC0476a, Integer, C9072e>>>> pair9 = CoreTextKt.f2526a;
            C5207g.m11111f(mapM13459L0, "inlineContent");
            if (mapM13459L0.isEmpty()) {
                pair = CoreTextKt.f2526a;
                interfaceC0500b2 = interfaceC0500b2;
                interfaceC2052l2 = interfaceC2052l2;
            } else {
                int length8 = c0689a.length();
                list = c0689a.f4526d;
                if (list != null) {
                    arrayList = new ArrayList(list.size());
                    size2 = list.size();
                    i34 = 0;
                    while (i34 < size2) {
                        int i4118 = size2;
                        bVar2 = list.get(i34);
                        List<C0689a.b<? extends Object>> list11 = list;
                        bVar3 = bVar2;
                        if (!(bVar3.f4536a instanceof String)) {
                            z12 = false;
                        } else {
                            z12 = false;
                        }
                        if (z12) {
                            arrayList.add(bVar2);
                        }
                        i34++;
                        size2 = i4118;
                        list = list11;
                    }
                } else {
                    arrayList = EmptyList.f38032a;
                }
                C5207g.m11109d(arrayList, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString.Range<kotlin.String>>");
                arrayList2 = new ArrayList();
                arrayList3 = new ArrayList();
                size = arrayList.size();
                i33 = 0;
                r10 = arrayList;
                while (i33 < size) {
                    bVar = (C0689a.b) r10.get(i33);
                    if (mapM13459L0.get(bVar.f4536a) != null) {
                        int i4119 = bVar.f4537b;
                        int i41110 = bVar.f4538c;
                        arrayList2.add(new C0689a.b(i4119, i41110, null));
                        arrayList3.add(new C0689a.b(i4119, i41110, null));
                    }
                    i33++;
                    size = size;
                    r10 = r10;
                }
                pair = new Pair<>(arrayList2, arrayList3);
            }
            list2 = pair.f38012a;
            list3 = pair.f38013b;
            Mo1636j.mo1622c(959243860);
            if (interfaceC0004c == null) {
                jLongValue = 0;
            } else {
                jLongValue = ((Number) C0487a.m1860a(new Object[]{c0689a, interfaceC0004c}, SaverKt.m1859a(new BasicTextKt$selectionIdSaver$1(interfaceC0004c), BasicTextKt$selectionIdSaver$2.f2523b), new InterfaceC2041a<Long>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$selectableId$2
                    {
                        super(0);
                    }

                    @Override // cm.InterfaceC2041a
                    /* JADX INFO: renamed from: E */
                    public final Long mo807E() {
                        return Long.valueOf(interfaceC0004c.m6b());
                    }
                }, Mo1636j, 4)).longValue();
            }
            Mo1636j.m1609Q(false);
            Mo1636j.mo1622c(-492369756);
            objM1619a0 = Mo1636j.m1619a0();
            if (objM1619a0 == InterfaceC0476a.a.f3122a) {
                i35 = i30;
                th2 = null;
                TextController textController9 = new TextController(new TextState(new C10423b(c0689a, c7218l2, i31, i32, z11, i21, interfaceC10015c, aVar, list2), jLongValue));
                Mo1636j.m1597F0(textController9);
                objM1619a0 = textController9;
            } else {
                i35 = i30;
                th2 = null;
            }
            Mo1636j.m1609Q(false);
            textController = (TextController) objM1619a0;
            textState = textController.f2539a;
            if (Mo1636j.f2897L) {
                c10423b = textState.f2563d;
                C5207g.m11111f(c10423b, "current");
                C5207g.m11111f(c7218l2, "style");
                C5207g.m11111f(interfaceC10015c, "density");
                C5207g.m11111f(aVar, "fontFamilyResolver");
                C5207g.m11111f(list2, "placeholders");
                c0689a2 = c0689a;
                i37 = 0;
                if (C5207g.m11106a(c10423b.f52258a, c0689a2)) {
                    z15 = z11;
                    i43 = i21;
                    i44 = i31;
                    i45 = i32;
                    i39 = i45;
                    i38 = i44;
                    i36 = i43;
                    z13 = z15;
                    c10423b = new C10423b(c0689a, c7218l2, i44, i39, z15, i36, interfaceC10015c, aVar, list2);
                } else {
                    z15 = z11;
                    i43 = i21;
                    i44 = i31;
                    i45 = i32;
                    i39 = i45;
                    i38 = i44;
                    i36 = i43;
                    z13 = z15;
                    c10423b = new C10423b(c0689a, c7218l2, i44, i39, z15, i36, interfaceC10015c, aVar, list2);
                }
                textController.m1540f(c10423b);
            } else {
                c0689a2 = c0689a;
                z13 = z11;
                i36 = i21;
                i37 = 0;
                i38 = i31;
                i39 = i32;
            }
            textState.getClass();
            interfaceC2052l3 = interfaceC2052l2;
            C5207g.m11111f(interfaceC2052l3, "<set-?>");
            textState.f2561b = interfaceC2052l3;
            textController.m1541g(interfaceC0004c);
            if (list3.isEmpty()) {
                M14522b = ComposableSingletons$BasicTextKt.f2524a;
            } else {
                final int i57 = i35;
                M14522b = C7204a.m14522b(Mo1636j, 1749415830, new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // cm.InterfaceC2056p
                    /* JADX INFO: renamed from: m0 */
                    public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                        InterfaceC0476a interfaceC0476a3 = interfaceC0476a2;
                        if ((num.intValue() & 11) == 2 && interfaceC0476a3.mo1642m()) {
                            interfaceC0476a3.mo1650q();
                        } else {
                            InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q16 = ComposerKt.f3003a;
                            CoreTextKt.m1534a(c0689a2, list3, interfaceC0476a3, (i57 & 14) | 64);
                        }
                        return C9072e.f47360a;
                    }
                });
            }
            interfaceC0500b3 = interfaceC0500b2;
            InterfaceC0500b interfaceC0500bMo1929K8 = interfaceC0500b3.mo1929K(textController.m1539e());
            Mo1636j.mo1622c(-1323940314);
            interfaceC10015c2 = (InterfaceC10015c) Mo1636j.mo1648p(CompositionLocalsKt.f4137e);
            layoutDirection = (LayoutDirection) Mo1636j.mo1648p(CompositionLocalsKt.f4143k);
            interfaceC0647n1 = (InterfaceC0647n1) Mo1636j.mo1648p(CompositionLocalsKt.f4148p);
            ComposeUiNode.f3726n.getClass();
            interfaceC2041a = ComposeUiNode.Companion.f3728b;
            M2036a = C0520a.m2036a(interfaceC0500bMo1929K8);
            if (Mo1636j.f2910a instanceof InterfaceC5299c) {
                C8573r0.m16771y0();
                throw th2;
            }
            Mo1636j.mo1640l();
            if (Mo1636j.f2897L) {
                Mo1636j.mo1634i(interfaceC2041a);
            } else {
                Mo1636j.mo1653s();
            }
            C8573r0.m16714a1(Mo1636j, textController.f2542d, ComposeUiNode.Companion.f3731e);
            C8573r0.m16714a1(Mo1636j, interfaceC10015c2, ComposeUiNode.Companion.f3730d);
            C8573r0.m16714a1(Mo1636j, layoutDirection, ComposeUiNode.Companion.f3732f);
            C8573r0.m16714a1(Mo1636j, interfaceC0647n1, ComposeUiNode.Companion.f3733g);
            M2036a.mo1343M(new C5340u0(Mo1636j), Mo1636j, Integer.valueOf(i37));
            Mo1636j.mo1622c(2058660585);
            M14522b.mo1337m0(Mo1636j, Integer.valueOf(i37));
            ?? r18 = i37;
            Mo1636j.m1609Q(r18);
            Mo1636j.m1609Q(true);
            Mo1636j.m1609Q(r18);
            InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q16 = ComposerKt.f3003a;
            interfaceC0500b4 = interfaceC0500b3;
            interfaceC2052l4 = interfaceC2052l3;
            c7218l3 = c7218l2;
            map2 = mapM13459L0;
            i40 = i39;
            i41 = i38;
            i42 = i36;
            z14 = z13;
            c5332q0M1612T = Mo1636j.m1612T();
            if (c5332q0M1612T == null) {
                return;
            }
            c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$5
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // cm.InterfaceC2056p
                /* JADX INFO: renamed from: m0 */
                public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) throws Throwable {
                    num.intValue();
                    BasicTextKt.m1533d(c0689a, interfaceC0500b4, c7218l3, interfaceC2052l4, i42, z14, i41, i40, map2, interfaceC0476a2, C8573r0.m16737l1(i13 | 1), i14);
                    return C9072e.f47360a;
                }
            };
        }
        i15 |= 48;
        interfaceC0500b2 = interfaceC0500b;
        i16 = i14 & 4;
        if (i16 != 0) {
            if ((i13 & 896) == 0) {
                c7218l2 = c7218l;
                if (Mo1636j.mo1665y(c7218l2)) {
                    i17 = 256;
                } else {
                    i17 = BuildConfig.SDK_TRUNCATE_LENGTH;
                }
                i15 |= i17;
            }
            i18 = i14 & 8;
            if (i18 != 0) {
                if ((i13 & 7168) == 0) {
                    interfaceC2052l2 = interfaceC2052l;
                    if (Mo1636j.m1600H(interfaceC2052l2)) {
                        i19 = 2048;
                    } else {
                        i19 = 1024;
                    }
                    i15 |= i19;
                }
                i20 = i14 & 16;
                if (i20 != 0) {
                    if ((57344 & i13) == 0) {
                        i21 = i10;
                        if (Mo1636j.m1594E(i21)) {
                            i22 = 16384;
                        } else {
                            i22 = 8192;
                        }
                        i15 |= i22;
                    }
                    i23 = i14 & 32;
                    if (i23 != 0) {
                        i15 |= 196608;
                    } else if ((i13 & 458752) == 0) {
                        if (Mo1636j.m1598G(z10)) {
                            i24 = 131072;
                        } else {
                            i24 = 65536;
                        }
                        i15 |= i24;
                    }
                    i25 = i14 & 64;
                    if (i25 != 0) {
                        i15 |= 1572864;
                    } else if ((i13 & 3670016) == 0) {
                        if (Mo1636j.m1594E(i11)) {
                            i26 = 1048576;
                        } else {
                            i26 = 524288;
                        }
                        i15 |= i26;
                    }
                    i27 = i14 & BuildConfig.SDK_TRUNCATE_LENGTH;
                    if (i27 != 0) {
                        i15 |= 12582912;
                    } else if ((i13 & 29360128) == 0) {
                        if (Mo1636j.m1594E(i12)) {
                            i28 = 8388608;
                        } else {
                            i28 = 4194304;
                        }
                        i15 |= i28;
                    }
                    i29 = i14 & 256;
                    if (i29 != 0) {
                        i15 |= 33554432;
                    }
                    if (i29 == 256) {
                        i30 = i15;
                        if ((191739611 & i15) != 38347922) {
                        }
                        c5332q0M1612T = Mo1636j.m1612T();
                        if (c5332q0M1612T == null) {
                            return;
                        }
                        c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$5
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) throws Throwable {
                                num.intValue();
                                BasicTextKt.m1533d(c0689a, interfaceC0500b4, c7218l3, interfaceC2052l4, i42, z14, i41, i40, map2, interfaceC0476a2, C8573r0.m16737l1(i13 | 1), i14);
                                return C9072e.f47360a;
                            }
                        };
                    }
                    i30 = i15;
                    if (i46 != 0) {
                        interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                    }
                    if (i16 != 0) {
                        c7218l2 = C7218l.f40599c;
                    }
                    if (i18 != 0) {
                        interfaceC2052l2 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$3
                            @Override // cm.InterfaceC2052l
                            /* JADX INFO: renamed from: n */
                            public final C9072e mo528n(C7216j c7216j) {
                                C5207g.m11111f(c7216j, "it");
                                return C9072e.f47360a;
                            }
                        };
                    }
                    if (i20 != 0) {
                        i21 = 1;
                    }
                    if (i23 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    if (i25 != 0) {
                        i31 = Integer.MAX_VALUE;
                    } else {
                        i31 = i11;
                    }
                    if (i27 != 0) {
                        i32 = 1;
                    } else {
                        i32 = i12;
                    }
                    if (i29 != 0) {
                        mapM13459L0 = C6753d.m13459L0();
                    } else {
                        mapM13459L0 = map;
                    }
                    InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q17 = ComposerKt.f3003a;
                    C8584v.m16781D(i32, i31);
                    interfaceC0004c = (InterfaceC0004c) Mo1636j.mo1648p(SelectionRegistrarKt.f2569a);
                    interfaceC10015c = (InterfaceC10015c) Mo1636j.mo1648p(CompositionLocalsKt.f4137e);
                    aVar = (AbstractC0696b.a) Mo1636j.mo1648p(CompositionLocalsKt.f4140h);
                    long j18 = ((C0005d) Mo1636j.mo1648p(TextSelectionColorsKt.f2571a)).f3b;
                    Pair<List<C0689a.b<C7213g>>, List<C0689a.b<InterfaceC2057q<String, InterfaceC0476a, Integer, C9072e>>>> pair10 = CoreTextKt.f2526a;
                    C5207g.m11111f(mapM13459L0, "inlineContent");
                    if (mapM13459L0.isEmpty()) {
                        pair = CoreTextKt.f2526a;
                        interfaceC0500b2 = interfaceC0500b2;
                        interfaceC2052l2 = interfaceC2052l2;
                    } else {
                        int length9 = c0689a.length();
                        list = c0689a.f4526d;
                        if (list != null) {
                            arrayList = new ArrayList(list.size());
                            size2 = list.size();
                            i34 = 0;
                            while (i34 < size2) {
                                int i41111 = size2;
                                bVar2 = list.get(i34);
                                List<C0689a.b<? extends Object>> list12 = list;
                                bVar3 = bVar2;
                                if (!(bVar3.f4536a instanceof String)) {
                                    z12 = false;
                                } else {
                                    z12 = false;
                                }
                                if (z12) {
                                    arrayList.add(bVar2);
                                }
                                i34++;
                                size2 = i41111;
                                list = list12;
                            }
                        } else {
                            arrayList = EmptyList.f38032a;
                        }
                        C5207g.m11109d(arrayList, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString.Range<kotlin.String>>");
                        arrayList2 = new ArrayList();
                        arrayList3 = new ArrayList();
                        size = arrayList.size();
                        i33 = 0;
                        r10 = arrayList;
                        while (i33 < size) {
                            bVar = (C0689a.b) r10.get(i33);
                            if (mapM13459L0.get(bVar.f4536a) != null) {
                                int i41112 = bVar.f4537b;
                                int i41113 = bVar.f4538c;
                                arrayList2.add(new C0689a.b(i41112, i41113, null));
                                arrayList3.add(new C0689a.b(i41112, i41113, null));
                            }
                            i33++;
                            size = size;
                            r10 = r10;
                        }
                        pair = new Pair<>(arrayList2, arrayList3);
                    }
                    list2 = pair.f38012a;
                    list3 = pair.f38013b;
                    Mo1636j.mo1622c(959243860);
                    if (interfaceC0004c == null) {
                        jLongValue = 0;
                    } else {
                        jLongValue = ((Number) C0487a.m1860a(new Object[]{c0689a, interfaceC0004c}, SaverKt.m1859a(new BasicTextKt$selectionIdSaver$1(interfaceC0004c), BasicTextKt$selectionIdSaver$2.f2523b), new InterfaceC2041a<Long>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$selectableId$2
                            {
                                super(0);
                            }

                            @Override // cm.InterfaceC2041a
                            /* JADX INFO: renamed from: E */
                            public final Long mo807E() {
                                return Long.valueOf(interfaceC0004c.m6b());
                            }
                        }, Mo1636j, 4)).longValue();
                    }
                    Mo1636j.m1609Q(false);
                    Mo1636j.mo1622c(-492369756);
                    objM1619a0 = Mo1636j.m1619a0();
                    if (objM1619a0 == InterfaceC0476a.a.f3122a) {
                        i35 = i30;
                        th2 = null;
                        TextController textController10 = new TextController(new TextState(new C10423b(c0689a, c7218l2, i31, i32, z11, i21, interfaceC10015c, aVar, list2), jLongValue));
                        Mo1636j.m1597F0(textController10);
                        objM1619a0 = textController10;
                    } else {
                        i35 = i30;
                        th2 = null;
                    }
                    Mo1636j.m1609Q(false);
                    textController = (TextController) objM1619a0;
                    textState = textController.f2539a;
                    if (Mo1636j.f2897L) {
                        c10423b = textState.f2563d;
                        C5207g.m11111f(c10423b, "current");
                        C5207g.m11111f(c7218l2, "style");
                        C5207g.m11111f(interfaceC10015c, "density");
                        C5207g.m11111f(aVar, "fontFamilyResolver");
                        C5207g.m11111f(list2, "placeholders");
                        c0689a2 = c0689a;
                        i37 = 0;
                        if (C5207g.m11106a(c10423b.f52258a, c0689a2)) {
                            z15 = z11;
                            i43 = i21;
                            i44 = i31;
                            i45 = i32;
                            i39 = i45;
                            i38 = i44;
                            i36 = i43;
                            z13 = z15;
                            c10423b = new C10423b(c0689a, c7218l2, i44, i39, z15, i36, interfaceC10015c, aVar, list2);
                        } else {
                            z15 = z11;
                            i43 = i21;
                            i44 = i31;
                            i45 = i32;
                            i39 = i45;
                            i38 = i44;
                            i36 = i43;
                            z13 = z15;
                            c10423b = new C10423b(c0689a, c7218l2, i44, i39, z15, i36, interfaceC10015c, aVar, list2);
                        }
                        textController.m1540f(c10423b);
                    } else {
                        c0689a2 = c0689a;
                        z13 = z11;
                        i36 = i21;
                        i37 = 0;
                        i38 = i31;
                        i39 = i32;
                    }
                    textState.getClass();
                    interfaceC2052l3 = interfaceC2052l2;
                    C5207g.m11111f(interfaceC2052l3, "<set-?>");
                    textState.f2561b = interfaceC2052l3;
                    textController.m1541g(interfaceC0004c);
                    if (list3.isEmpty()) {
                        M14522b = ComposableSingletons$BasicTextKt.f2524a;
                    } else {
                        final int i58 = i35;
                        M14522b = C7204a.m14522b(Mo1636j, 1749415830, new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$4
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                                InterfaceC0476a interfaceC0476a3 = interfaceC0476a2;
                                if ((num.intValue() & 11) == 2 && interfaceC0476a3.mo1642m()) {
                                    interfaceC0476a3.mo1650q();
                                } else {
                                    InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q18 = ComposerKt.f3003a;
                                    CoreTextKt.m1534a(c0689a2, list3, interfaceC0476a3, (i58 & 14) | 64);
                                }
                                return C9072e.f47360a;
                            }
                        });
                    }
                    interfaceC0500b3 = interfaceC0500b2;
                    InterfaceC0500b interfaceC0500bMo1929K9 = interfaceC0500b3.mo1929K(textController.m1539e());
                    Mo1636j.mo1622c(-1323940314);
                    interfaceC10015c2 = (InterfaceC10015c) Mo1636j.mo1648p(CompositionLocalsKt.f4137e);
                    layoutDirection = (LayoutDirection) Mo1636j.mo1648p(CompositionLocalsKt.f4143k);
                    interfaceC0647n1 = (InterfaceC0647n1) Mo1636j.mo1648p(CompositionLocalsKt.f4148p);
                    ComposeUiNode.f3726n.getClass();
                    interfaceC2041a = ComposeUiNode.Companion.f3728b;
                    M2036a = C0520a.m2036a(interfaceC0500bMo1929K9);
                    if (Mo1636j.f2910a instanceof InterfaceC5299c) {
                        C8573r0.m16771y0();
                        throw th2;
                    }
                    Mo1636j.mo1640l();
                    if (Mo1636j.f2897L) {
                        Mo1636j.mo1634i(interfaceC2041a);
                    } else {
                        Mo1636j.mo1653s();
                    }
                    C8573r0.m16714a1(Mo1636j, textController.f2542d, ComposeUiNode.Companion.f3731e);
                    C8573r0.m16714a1(Mo1636j, interfaceC10015c2, ComposeUiNode.Companion.f3730d);
                    C8573r0.m16714a1(Mo1636j, layoutDirection, ComposeUiNode.Companion.f3732f);
                    C8573r0.m16714a1(Mo1636j, interfaceC0647n1, ComposeUiNode.Companion.f3733g);
                    M2036a.mo1343M(new C5340u0(Mo1636j), Mo1636j, Integer.valueOf(i37));
                    Mo1636j.mo1622c(2058660585);
                    M14522b.mo1337m0(Mo1636j, Integer.valueOf(i37));
                    ?? r19 = i37;
                    Mo1636j.m1609Q(r19);
                    Mo1636j.m1609Q(true);
                    Mo1636j.m1609Q(r19);
                    InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q18 = ComposerKt.f3003a;
                    interfaceC0500b4 = interfaceC0500b3;
                    interfaceC2052l4 = interfaceC2052l3;
                    c7218l3 = c7218l2;
                    map2 = mapM13459L0;
                    i40 = i39;
                    i41 = i38;
                    i42 = i36;
                    z14 = z13;
                    c5332q0M1612T = Mo1636j.m1612T();
                    if (c5332q0M1612T == null) {
                        return;
                    }
                    c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$5
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) throws Throwable {
                            num.intValue();
                            BasicTextKt.m1533d(c0689a, interfaceC0500b4, c7218l3, interfaceC2052l4, i42, z14, i41, i40, map2, interfaceC0476a2, C8573r0.m16737l1(i13 | 1), i14);
                            return C9072e.f47360a;
                        }
                    };
                }
                i15 |= 24576;
                i21 = i10;
                i23 = i14 & 32;
                if (i23 != 0) {
                    i15 |= 196608;
                } else if ((i13 & 458752) == 0) {
                    if (Mo1636j.m1598G(z10)) {
                        i24 = 131072;
                    } else {
                        i24 = 65536;
                    }
                    i15 |= i24;
                }
                i25 = i14 & 64;
                if (i25 != 0) {
                    i15 |= 1572864;
                } else if ((i13 & 3670016) == 0) {
                    if (Mo1636j.m1594E(i11)) {
                        i26 = 1048576;
                    } else {
                        i26 = 524288;
                    }
                    i15 |= i26;
                }
                i27 = i14 & BuildConfig.SDK_TRUNCATE_LENGTH;
                if (i27 != 0) {
                    i15 |= 12582912;
                } else if ((i13 & 29360128) == 0) {
                    if (Mo1636j.m1594E(i12)) {
                        i28 = 8388608;
                    } else {
                        i28 = 4194304;
                    }
                    i15 |= i28;
                }
                i29 = i14 & 256;
                if (i29 != 0) {
                    i15 |= 33554432;
                }
                if (i29 == 256) {
                    i30 = i15;
                    if ((191739611 & i15) != 38347922) {
                    }
                    c5332q0M1612T = Mo1636j.m1612T();
                    if (c5332q0M1612T == null) {
                        return;
                    }
                    c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$5
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) throws Throwable {
                            num.intValue();
                            BasicTextKt.m1533d(c0689a, interfaceC0500b4, c7218l3, interfaceC2052l4, i42, z14, i41, i40, map2, interfaceC0476a2, C8573r0.m16737l1(i13 | 1), i14);
                            return C9072e.f47360a;
                        }
                    };
                }
                i30 = i15;
                if (i46 != 0) {
                    interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                }
                if (i16 != 0) {
                    c7218l2 = C7218l.f40599c;
                }
                if (i18 != 0) {
                    interfaceC2052l2 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$3
                        @Override // cm.InterfaceC2052l
                        /* JADX INFO: renamed from: n */
                        public final C9072e mo528n(C7216j c7216j) {
                            C5207g.m11111f(c7216j, "it");
                            return C9072e.f47360a;
                        }
                    };
                }
                if (i20 != 0) {
                    i21 = 1;
                }
                if (i23 != 0) {
                    z11 = true;
                } else {
                    z11 = z10;
                }
                if (i25 != 0) {
                    i31 = Integer.MAX_VALUE;
                } else {
                    i31 = i11;
                }
                if (i27 != 0) {
                    i32 = 1;
                } else {
                    i32 = i12;
                }
                if (i29 != 0) {
                    mapM13459L0 = C6753d.m13459L0();
                } else {
                    mapM13459L0 = map;
                }
                InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q19 = ComposerKt.f3003a;
                C8584v.m16781D(i32, i31);
                interfaceC0004c = (InterfaceC0004c) Mo1636j.mo1648p(SelectionRegistrarKt.f2569a);
                interfaceC10015c = (InterfaceC10015c) Mo1636j.mo1648p(CompositionLocalsKt.f4137e);
                aVar = (AbstractC0696b.a) Mo1636j.mo1648p(CompositionLocalsKt.f4140h);
                long j19 = ((C0005d) Mo1636j.mo1648p(TextSelectionColorsKt.f2571a)).f3b;
                Pair<List<C0689a.b<C7213g>>, List<C0689a.b<InterfaceC2057q<String, InterfaceC0476a, Integer, C9072e>>>> pair11 = CoreTextKt.f2526a;
                C5207g.m11111f(mapM13459L0, "inlineContent");
                if (mapM13459L0.isEmpty()) {
                    pair = CoreTextKt.f2526a;
                    interfaceC0500b2 = interfaceC0500b2;
                    interfaceC2052l2 = interfaceC2052l2;
                } else {
                    int length10 = c0689a.length();
                    list = c0689a.f4526d;
                    if (list != null) {
                        arrayList = new ArrayList(list.size());
                        size2 = list.size();
                        i34 = 0;
                        while (i34 < size2) {
                            int i41114 = size2;
                            bVar2 = list.get(i34);
                            List<C0689a.b<? extends Object>> list13 = list;
                            bVar3 = bVar2;
                            if (!(bVar3.f4536a instanceof String)) {
                                z12 = false;
                            } else {
                                z12 = false;
                            }
                            if (z12) {
                                arrayList.add(bVar2);
                            }
                            i34++;
                            size2 = i41114;
                            list = list13;
                        }
                    } else {
                        arrayList = EmptyList.f38032a;
                    }
                    C5207g.m11109d(arrayList, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString.Range<kotlin.String>>");
                    arrayList2 = new ArrayList();
                    arrayList3 = new ArrayList();
                    size = arrayList.size();
                    i33 = 0;
                    r10 = arrayList;
                    while (i33 < size) {
                        bVar = (C0689a.b) r10.get(i33);
                        if (mapM13459L0.get(bVar.f4536a) != null) {
                            int i41115 = bVar.f4537b;
                            int i41116 = bVar.f4538c;
                            arrayList2.add(new C0689a.b(i41115, i41116, null));
                            arrayList3.add(new C0689a.b(i41115, i41116, null));
                        }
                        i33++;
                        size = size;
                        r10 = r10;
                    }
                    pair = new Pair<>(arrayList2, arrayList3);
                }
                list2 = pair.f38012a;
                list3 = pair.f38013b;
                Mo1636j.mo1622c(959243860);
                if (interfaceC0004c == null) {
                    jLongValue = 0;
                } else {
                    jLongValue = ((Number) C0487a.m1860a(new Object[]{c0689a, interfaceC0004c}, SaverKt.m1859a(new BasicTextKt$selectionIdSaver$1(interfaceC0004c), BasicTextKt$selectionIdSaver$2.f2523b), new InterfaceC2041a<Long>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$selectableId$2
                        {
                            super(0);
                        }

                        @Override // cm.InterfaceC2041a
                        /* JADX INFO: renamed from: E */
                        public final Long mo807E() {
                            return Long.valueOf(interfaceC0004c.m6b());
                        }
                    }, Mo1636j, 4)).longValue();
                }
                Mo1636j.m1609Q(false);
                Mo1636j.mo1622c(-492369756);
                objM1619a0 = Mo1636j.m1619a0();
                if (objM1619a0 == InterfaceC0476a.a.f3122a) {
                    i35 = i30;
                    th2 = null;
                    TextController textController11 = new TextController(new TextState(new C10423b(c0689a, c7218l2, i31, i32, z11, i21, interfaceC10015c, aVar, list2), jLongValue));
                    Mo1636j.m1597F0(textController11);
                    objM1619a0 = textController11;
                } else {
                    i35 = i30;
                    th2 = null;
                }
                Mo1636j.m1609Q(false);
                textController = (TextController) objM1619a0;
                textState = textController.f2539a;
                if (Mo1636j.f2897L) {
                    c10423b = textState.f2563d;
                    C5207g.m11111f(c10423b, "current");
                    C5207g.m11111f(c7218l2, "style");
                    C5207g.m11111f(interfaceC10015c, "density");
                    C5207g.m11111f(aVar, "fontFamilyResolver");
                    C5207g.m11111f(list2, "placeholders");
                    c0689a2 = c0689a;
                    i37 = 0;
                    if (C5207g.m11106a(c10423b.f52258a, c0689a2)) {
                        z15 = z11;
                        i43 = i21;
                        i44 = i31;
                        i45 = i32;
                        i39 = i45;
                        i38 = i44;
                        i36 = i43;
                        z13 = z15;
                        c10423b = new C10423b(c0689a, c7218l2, i44, i39, z15, i36, interfaceC10015c, aVar, list2);
                    } else {
                        z15 = z11;
                        i43 = i21;
                        i44 = i31;
                        i45 = i32;
                        i39 = i45;
                        i38 = i44;
                        i36 = i43;
                        z13 = z15;
                        c10423b = new C10423b(c0689a, c7218l2, i44, i39, z15, i36, interfaceC10015c, aVar, list2);
                    }
                    textController.m1540f(c10423b);
                } else {
                    c0689a2 = c0689a;
                    z13 = z11;
                    i36 = i21;
                    i37 = 0;
                    i38 = i31;
                    i39 = i32;
                }
                textState.getClass();
                interfaceC2052l3 = interfaceC2052l2;
                C5207g.m11111f(interfaceC2052l3, "<set-?>");
                textState.f2561b = interfaceC2052l3;
                textController.m1541g(interfaceC0004c);
                if (list3.isEmpty()) {
                    M14522b = ComposableSingletons$BasicTextKt.f2524a;
                } else {
                    final int i59 = i35;
                    M14522b = C7204a.m14522b(Mo1636j, 1749415830, new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$4
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                            InterfaceC0476a interfaceC0476a3 = interfaceC0476a2;
                            if ((num.intValue() & 11) == 2 && interfaceC0476a3.mo1642m()) {
                                interfaceC0476a3.mo1650q();
                            } else {
                                InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q110 = ComposerKt.f3003a;
                                CoreTextKt.m1534a(c0689a2, list3, interfaceC0476a3, (i59 & 14) | 64);
                            }
                            return C9072e.f47360a;
                        }
                    });
                }
                interfaceC0500b3 = interfaceC0500b2;
                InterfaceC0500b interfaceC0500bMo1929K10 = interfaceC0500b3.mo1929K(textController.m1539e());
                Mo1636j.mo1622c(-1323940314);
                interfaceC10015c2 = (InterfaceC10015c) Mo1636j.mo1648p(CompositionLocalsKt.f4137e);
                layoutDirection = (LayoutDirection) Mo1636j.mo1648p(CompositionLocalsKt.f4143k);
                interfaceC0647n1 = (InterfaceC0647n1) Mo1636j.mo1648p(CompositionLocalsKt.f4148p);
                ComposeUiNode.f3726n.getClass();
                interfaceC2041a = ComposeUiNode.Companion.f3728b;
                M2036a = C0520a.m2036a(interfaceC0500bMo1929K10);
                if (Mo1636j.f2910a instanceof InterfaceC5299c) {
                    C8573r0.m16771y0();
                    throw th2;
                }
                Mo1636j.mo1640l();
                if (Mo1636j.f2897L) {
                    Mo1636j.mo1634i(interfaceC2041a);
                } else {
                    Mo1636j.mo1653s();
                }
                C8573r0.m16714a1(Mo1636j, textController.f2542d, ComposeUiNode.Companion.f3731e);
                C8573r0.m16714a1(Mo1636j, interfaceC10015c2, ComposeUiNode.Companion.f3730d);
                C8573r0.m16714a1(Mo1636j, layoutDirection, ComposeUiNode.Companion.f3732f);
                C8573r0.m16714a1(Mo1636j, interfaceC0647n1, ComposeUiNode.Companion.f3733g);
                M2036a.mo1343M(new C5340u0(Mo1636j), Mo1636j, Integer.valueOf(i37));
                Mo1636j.mo1622c(2058660585);
                M14522b.mo1337m0(Mo1636j, Integer.valueOf(i37));
                ?? r110 = i37;
                Mo1636j.m1609Q(r110);
                Mo1636j.m1609Q(true);
                Mo1636j.m1609Q(r110);
                InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q110 = ComposerKt.f3003a;
                interfaceC0500b4 = interfaceC0500b3;
                interfaceC2052l4 = interfaceC2052l3;
                c7218l3 = c7218l2;
                map2 = mapM13459L0;
                i40 = i39;
                i41 = i38;
                i42 = i36;
                z14 = z13;
                c5332q0M1612T = Mo1636j.m1612T();
                if (c5332q0M1612T == null) {
                    return;
                }
                c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$5
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // cm.InterfaceC2056p
                    /* JADX INFO: renamed from: m0 */
                    public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) throws Throwable {
                        num.intValue();
                        BasicTextKt.m1533d(c0689a, interfaceC0500b4, c7218l3, interfaceC2052l4, i42, z14, i41, i40, map2, interfaceC0476a2, C8573r0.m16737l1(i13 | 1), i14);
                        return C9072e.f47360a;
                    }
                };
            }
            i15 |= 3072;
            interfaceC2052l2 = interfaceC2052l;
            i20 = i14 & 16;
            if (i20 != 0) {
                if ((57344 & i13) == 0) {
                    i21 = i10;
                    if (Mo1636j.m1594E(i21)) {
                        i22 = 16384;
                    } else {
                        i22 = 8192;
                    }
                    i15 |= i22;
                }
                i23 = i14 & 32;
                if (i23 != 0) {
                    i15 |= 196608;
                } else if ((i13 & 458752) == 0) {
                    if (Mo1636j.m1598G(z10)) {
                        i24 = 131072;
                    } else {
                        i24 = 65536;
                    }
                    i15 |= i24;
                }
                i25 = i14 & 64;
                if (i25 != 0) {
                    i15 |= 1572864;
                } else if ((i13 & 3670016) == 0) {
                    if (Mo1636j.m1594E(i11)) {
                        i26 = 1048576;
                    } else {
                        i26 = 524288;
                    }
                    i15 |= i26;
                }
                i27 = i14 & BuildConfig.SDK_TRUNCATE_LENGTH;
                if (i27 != 0) {
                    i15 |= 12582912;
                } else if ((i13 & 29360128) == 0) {
                    if (Mo1636j.m1594E(i12)) {
                        i28 = 8388608;
                    } else {
                        i28 = 4194304;
                    }
                    i15 |= i28;
                }
                i29 = i14 & 256;
                if (i29 != 0) {
                    i15 |= 33554432;
                }
                if (i29 == 256) {
                    i30 = i15;
                    if ((191739611 & i15) != 38347922) {
                    }
                    c5332q0M1612T = Mo1636j.m1612T();
                    if (c5332q0M1612T == null) {
                        return;
                    }
                    c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$5
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) throws Throwable {
                            num.intValue();
                            BasicTextKt.m1533d(c0689a, interfaceC0500b4, c7218l3, interfaceC2052l4, i42, z14, i41, i40, map2, interfaceC0476a2, C8573r0.m16737l1(i13 | 1), i14);
                            return C9072e.f47360a;
                        }
                    };
                }
                i30 = i15;
                if (i46 != 0) {
                    interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                }
                if (i16 != 0) {
                    c7218l2 = C7218l.f40599c;
                }
                if (i18 != 0) {
                    interfaceC2052l2 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$3
                        @Override // cm.InterfaceC2052l
                        /* JADX INFO: renamed from: n */
                        public final C9072e mo528n(C7216j c7216j) {
                            C5207g.m11111f(c7216j, "it");
                            return C9072e.f47360a;
                        }
                    };
                }
                if (i20 != 0) {
                    i21 = 1;
                }
                if (i23 != 0) {
                    z11 = true;
                } else {
                    z11 = z10;
                }
                if (i25 != 0) {
                    i31 = Integer.MAX_VALUE;
                } else {
                    i31 = i11;
                }
                if (i27 != 0) {
                    i32 = 1;
                } else {
                    i32 = i12;
                }
                if (i29 != 0) {
                    mapM13459L0 = C6753d.m13459L0();
                } else {
                    mapM13459L0 = map;
                }
                InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q111 = ComposerKt.f3003a;
                C8584v.m16781D(i32, i31);
                interfaceC0004c = (InterfaceC0004c) Mo1636j.mo1648p(SelectionRegistrarKt.f2569a);
                interfaceC10015c = (InterfaceC10015c) Mo1636j.mo1648p(CompositionLocalsKt.f4137e);
                aVar = (AbstractC0696b.a) Mo1636j.mo1648p(CompositionLocalsKt.f4140h);
                long j110 = ((C0005d) Mo1636j.mo1648p(TextSelectionColorsKt.f2571a)).f3b;
                Pair<List<C0689a.b<C7213g>>, List<C0689a.b<InterfaceC2057q<String, InterfaceC0476a, Integer, C9072e>>>> pair12 = CoreTextKt.f2526a;
                C5207g.m11111f(mapM13459L0, "inlineContent");
                if (mapM13459L0.isEmpty()) {
                    pair = CoreTextKt.f2526a;
                    interfaceC0500b2 = interfaceC0500b2;
                    interfaceC2052l2 = interfaceC2052l2;
                } else {
                    int length11 = c0689a.length();
                    list = c0689a.f4526d;
                    if (list != null) {
                        arrayList = new ArrayList(list.size());
                        size2 = list.size();
                        i34 = 0;
                        while (i34 < size2) {
                            int i41117 = size2;
                            bVar2 = list.get(i34);
                            List<C0689a.b<? extends Object>> list14 = list;
                            bVar3 = bVar2;
                            if (!(bVar3.f4536a instanceof String)) {
                                z12 = false;
                            } else {
                                z12 = false;
                            }
                            if (z12) {
                                arrayList.add(bVar2);
                            }
                            i34++;
                            size2 = i41117;
                            list = list14;
                        }
                    } else {
                        arrayList = EmptyList.f38032a;
                    }
                    C5207g.m11109d(arrayList, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString.Range<kotlin.String>>");
                    arrayList2 = new ArrayList();
                    arrayList3 = new ArrayList();
                    size = arrayList.size();
                    i33 = 0;
                    r10 = arrayList;
                    while (i33 < size) {
                        bVar = (C0689a.b) r10.get(i33);
                        if (mapM13459L0.get(bVar.f4536a) != null) {
                            int i41118 = bVar.f4537b;
                            int i41119 = bVar.f4538c;
                            arrayList2.add(new C0689a.b(i41118, i41119, null));
                            arrayList3.add(new C0689a.b(i41118, i41119, null));
                        }
                        i33++;
                        size = size;
                        r10 = r10;
                    }
                    pair = new Pair<>(arrayList2, arrayList3);
                }
                list2 = pair.f38012a;
                list3 = pair.f38013b;
                Mo1636j.mo1622c(959243860);
                if (interfaceC0004c == null) {
                    jLongValue = 0;
                } else {
                    jLongValue = ((Number) C0487a.m1860a(new Object[]{c0689a, interfaceC0004c}, SaverKt.m1859a(new BasicTextKt$selectionIdSaver$1(interfaceC0004c), BasicTextKt$selectionIdSaver$2.f2523b), new InterfaceC2041a<Long>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$selectableId$2
                        {
                            super(0);
                        }

                        @Override // cm.InterfaceC2041a
                        /* JADX INFO: renamed from: E */
                        public final Long mo807E() {
                            return Long.valueOf(interfaceC0004c.m6b());
                        }
                    }, Mo1636j, 4)).longValue();
                }
                Mo1636j.m1609Q(false);
                Mo1636j.mo1622c(-492369756);
                objM1619a0 = Mo1636j.m1619a0();
                if (objM1619a0 == InterfaceC0476a.a.f3122a) {
                    i35 = i30;
                    th2 = null;
                    TextController textController12 = new TextController(new TextState(new C10423b(c0689a, c7218l2, i31, i32, z11, i21, interfaceC10015c, aVar, list2), jLongValue));
                    Mo1636j.m1597F0(textController12);
                    objM1619a0 = textController12;
                } else {
                    i35 = i30;
                    th2 = null;
                }
                Mo1636j.m1609Q(false);
                textController = (TextController) objM1619a0;
                textState = textController.f2539a;
                if (Mo1636j.f2897L) {
                    c10423b = textState.f2563d;
                    C5207g.m11111f(c10423b, "current");
                    C5207g.m11111f(c7218l2, "style");
                    C5207g.m11111f(interfaceC10015c, "density");
                    C5207g.m11111f(aVar, "fontFamilyResolver");
                    C5207g.m11111f(list2, "placeholders");
                    c0689a2 = c0689a;
                    i37 = 0;
                    if (C5207g.m11106a(c10423b.f52258a, c0689a2)) {
                        z15 = z11;
                        i43 = i21;
                        i44 = i31;
                        i45 = i32;
                        i39 = i45;
                        i38 = i44;
                        i36 = i43;
                        z13 = z15;
                        c10423b = new C10423b(c0689a, c7218l2, i44, i39, z15, i36, interfaceC10015c, aVar, list2);
                    } else {
                        z15 = z11;
                        i43 = i21;
                        i44 = i31;
                        i45 = i32;
                        i39 = i45;
                        i38 = i44;
                        i36 = i43;
                        z13 = z15;
                        c10423b = new C10423b(c0689a, c7218l2, i44, i39, z15, i36, interfaceC10015c, aVar, list2);
                    }
                    textController.m1540f(c10423b);
                } else {
                    c0689a2 = c0689a;
                    z13 = z11;
                    i36 = i21;
                    i37 = 0;
                    i38 = i31;
                    i39 = i32;
                }
                textState.getClass();
                interfaceC2052l3 = interfaceC2052l2;
                C5207g.m11111f(interfaceC2052l3, "<set-?>");
                textState.f2561b = interfaceC2052l3;
                textController.m1541g(interfaceC0004c);
                if (list3.isEmpty()) {
                    M14522b = ComposableSingletons$BasicTextKt.f2524a;
                } else {
                    final int i510 = i35;
                    M14522b = C7204a.m14522b(Mo1636j, 1749415830, new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$4
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                            InterfaceC0476a interfaceC0476a3 = interfaceC0476a2;
                            if ((num.intValue() & 11) == 2 && interfaceC0476a3.mo1642m()) {
                                interfaceC0476a3.mo1650q();
                            } else {
                                InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q112 = ComposerKt.f3003a;
                                CoreTextKt.m1534a(c0689a2, list3, interfaceC0476a3, (i510 & 14) | 64);
                            }
                            return C9072e.f47360a;
                        }
                    });
                }
                interfaceC0500b3 = interfaceC0500b2;
                InterfaceC0500b interfaceC0500bMo1929K11 = interfaceC0500b3.mo1929K(textController.m1539e());
                Mo1636j.mo1622c(-1323940314);
                interfaceC10015c2 = (InterfaceC10015c) Mo1636j.mo1648p(CompositionLocalsKt.f4137e);
                layoutDirection = (LayoutDirection) Mo1636j.mo1648p(CompositionLocalsKt.f4143k);
                interfaceC0647n1 = (InterfaceC0647n1) Mo1636j.mo1648p(CompositionLocalsKt.f4148p);
                ComposeUiNode.f3726n.getClass();
                interfaceC2041a = ComposeUiNode.Companion.f3728b;
                M2036a = C0520a.m2036a(interfaceC0500bMo1929K11);
                if (Mo1636j.f2910a instanceof InterfaceC5299c) {
                    C8573r0.m16771y0();
                    throw th2;
                }
                Mo1636j.mo1640l();
                if (Mo1636j.f2897L) {
                    Mo1636j.mo1634i(interfaceC2041a);
                } else {
                    Mo1636j.mo1653s();
                }
                C8573r0.m16714a1(Mo1636j, textController.f2542d, ComposeUiNode.Companion.f3731e);
                C8573r0.m16714a1(Mo1636j, interfaceC10015c2, ComposeUiNode.Companion.f3730d);
                C8573r0.m16714a1(Mo1636j, layoutDirection, ComposeUiNode.Companion.f3732f);
                C8573r0.m16714a1(Mo1636j, interfaceC0647n1, ComposeUiNode.Companion.f3733g);
                M2036a.mo1343M(new C5340u0(Mo1636j), Mo1636j, Integer.valueOf(i37));
                Mo1636j.mo1622c(2058660585);
                M14522b.mo1337m0(Mo1636j, Integer.valueOf(i37));
                ?? r111 = i37;
                Mo1636j.m1609Q(r111);
                Mo1636j.m1609Q(true);
                Mo1636j.m1609Q(r111);
                InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q112 = ComposerKt.f3003a;
                interfaceC0500b4 = interfaceC0500b3;
                interfaceC2052l4 = interfaceC2052l3;
                c7218l3 = c7218l2;
                map2 = mapM13459L0;
                i40 = i39;
                i41 = i38;
                i42 = i36;
                z14 = z13;
                c5332q0M1612T = Mo1636j.m1612T();
                if (c5332q0M1612T == null) {
                    return;
                }
                c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$5
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // cm.InterfaceC2056p
                    /* JADX INFO: renamed from: m0 */
                    public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) throws Throwable {
                        num.intValue();
                        BasicTextKt.m1533d(c0689a, interfaceC0500b4, c7218l3, interfaceC2052l4, i42, z14, i41, i40, map2, interfaceC0476a2, C8573r0.m16737l1(i13 | 1), i14);
                        return C9072e.f47360a;
                    }
                };
            }
            i15 |= 24576;
            i21 = i10;
            i23 = i14 & 32;
            if (i23 != 0) {
                i15 |= 196608;
            } else if ((i13 & 458752) == 0) {
                if (Mo1636j.m1598G(z10)) {
                    i24 = 131072;
                } else {
                    i24 = 65536;
                }
                i15 |= i24;
            }
            i25 = i14 & 64;
            if (i25 != 0) {
                i15 |= 1572864;
            } else if ((i13 & 3670016) == 0) {
                if (Mo1636j.m1594E(i11)) {
                    i26 = 1048576;
                } else {
                    i26 = 524288;
                }
                i15 |= i26;
            }
            i27 = i14 & BuildConfig.SDK_TRUNCATE_LENGTH;
            if (i27 != 0) {
                i15 |= 12582912;
            } else if ((i13 & 29360128) == 0) {
                if (Mo1636j.m1594E(i12)) {
                    i28 = 8388608;
                } else {
                    i28 = 4194304;
                }
                i15 |= i28;
            }
            i29 = i14 & 256;
            if (i29 != 0) {
                i15 |= 33554432;
            }
            if (i29 == 256) {
                i30 = i15;
                if ((191739611 & i15) != 38347922) {
                }
                c5332q0M1612T = Mo1636j.m1612T();
                if (c5332q0M1612T == null) {
                    return;
                }
                c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$5
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // cm.InterfaceC2056p
                    /* JADX INFO: renamed from: m0 */
                    public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) throws Throwable {
                        num.intValue();
                        BasicTextKt.m1533d(c0689a, interfaceC0500b4, c7218l3, interfaceC2052l4, i42, z14, i41, i40, map2, interfaceC0476a2, C8573r0.m16737l1(i13 | 1), i14);
                        return C9072e.f47360a;
                    }
                };
            }
            i30 = i15;
            if (i46 != 0) {
                interfaceC0500b2 = InterfaceC0500b.a.f3325a;
            }
            if (i16 != 0) {
                c7218l2 = C7218l.f40599c;
            }
            if (i18 != 0) {
                interfaceC2052l2 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$3
                    @Override // cm.InterfaceC2052l
                    /* JADX INFO: renamed from: n */
                    public final C9072e mo528n(C7216j c7216j) {
                        C5207g.m11111f(c7216j, "it");
                        return C9072e.f47360a;
                    }
                };
            }
            if (i20 != 0) {
                i21 = 1;
            }
            if (i23 != 0) {
                z11 = true;
            } else {
                z11 = z10;
            }
            if (i25 != 0) {
                i31 = Integer.MAX_VALUE;
            } else {
                i31 = i11;
            }
            if (i27 != 0) {
                i32 = 1;
            } else {
                i32 = i12;
            }
            if (i29 != 0) {
                mapM13459L0 = C6753d.m13459L0();
            } else {
                mapM13459L0 = map;
            }
            InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q113 = ComposerKt.f3003a;
            C8584v.m16781D(i32, i31);
            interfaceC0004c = (InterfaceC0004c) Mo1636j.mo1648p(SelectionRegistrarKt.f2569a);
            interfaceC10015c = (InterfaceC10015c) Mo1636j.mo1648p(CompositionLocalsKt.f4137e);
            aVar = (AbstractC0696b.a) Mo1636j.mo1648p(CompositionLocalsKt.f4140h);
            long j111 = ((C0005d) Mo1636j.mo1648p(TextSelectionColorsKt.f2571a)).f3b;
            Pair<List<C0689a.b<C7213g>>, List<C0689a.b<InterfaceC2057q<String, InterfaceC0476a, Integer, C9072e>>>> pair13 = CoreTextKt.f2526a;
            C5207g.m11111f(mapM13459L0, "inlineContent");
            if (mapM13459L0.isEmpty()) {
                pair = CoreTextKt.f2526a;
                interfaceC0500b2 = interfaceC0500b2;
                interfaceC2052l2 = interfaceC2052l2;
            } else {
                int length12 = c0689a.length();
                list = c0689a.f4526d;
                if (list != null) {
                    arrayList = new ArrayList(list.size());
                    size2 = list.size();
                    i34 = 0;
                    while (i34 < size2) {
                        int i411110 = size2;
                        bVar2 = list.get(i34);
                        List<C0689a.b<? extends Object>> list15 = list;
                        bVar3 = bVar2;
                        if (!(bVar3.f4536a instanceof String)) {
                            z12 = false;
                        } else {
                            z12 = false;
                        }
                        if (z12) {
                            arrayList.add(bVar2);
                        }
                        i34++;
                        size2 = i411110;
                        list = list15;
                    }
                } else {
                    arrayList = EmptyList.f38032a;
                }
                C5207g.m11109d(arrayList, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString.Range<kotlin.String>>");
                arrayList2 = new ArrayList();
                arrayList3 = new ArrayList();
                size = arrayList.size();
                i33 = 0;
                r10 = arrayList;
                while (i33 < size) {
                    bVar = (C0689a.b) r10.get(i33);
                    if (mapM13459L0.get(bVar.f4536a) != null) {
                        int i411111 = bVar.f4537b;
                        int i411112 = bVar.f4538c;
                        arrayList2.add(new C0689a.b(i411111, i411112, null));
                        arrayList3.add(new C0689a.b(i411111, i411112, null));
                    }
                    i33++;
                    size = size;
                    r10 = r10;
                }
                pair = new Pair<>(arrayList2, arrayList3);
            }
            list2 = pair.f38012a;
            list3 = pair.f38013b;
            Mo1636j.mo1622c(959243860);
            if (interfaceC0004c == null) {
                jLongValue = 0;
            } else {
                jLongValue = ((Number) C0487a.m1860a(new Object[]{c0689a, interfaceC0004c}, SaverKt.m1859a(new BasicTextKt$selectionIdSaver$1(interfaceC0004c), BasicTextKt$selectionIdSaver$2.f2523b), new InterfaceC2041a<Long>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$selectableId$2
                    {
                        super(0);
                    }

                    @Override // cm.InterfaceC2041a
                    /* JADX INFO: renamed from: E */
                    public final Long mo807E() {
                        return Long.valueOf(interfaceC0004c.m6b());
                    }
                }, Mo1636j, 4)).longValue();
            }
            Mo1636j.m1609Q(false);
            Mo1636j.mo1622c(-492369756);
            objM1619a0 = Mo1636j.m1619a0();
            if (objM1619a0 == InterfaceC0476a.a.f3122a) {
                i35 = i30;
                th2 = null;
                TextController textController13 = new TextController(new TextState(new C10423b(c0689a, c7218l2, i31, i32, z11, i21, interfaceC10015c, aVar, list2), jLongValue));
                Mo1636j.m1597F0(textController13);
                objM1619a0 = textController13;
            } else {
                i35 = i30;
                th2 = null;
            }
            Mo1636j.m1609Q(false);
            textController = (TextController) objM1619a0;
            textState = textController.f2539a;
            if (Mo1636j.f2897L) {
                c10423b = textState.f2563d;
                C5207g.m11111f(c10423b, "current");
                C5207g.m11111f(c7218l2, "style");
                C5207g.m11111f(interfaceC10015c, "density");
                C5207g.m11111f(aVar, "fontFamilyResolver");
                C5207g.m11111f(list2, "placeholders");
                c0689a2 = c0689a;
                i37 = 0;
                if (C5207g.m11106a(c10423b.f52258a, c0689a2)) {
                    z15 = z11;
                    i43 = i21;
                    i44 = i31;
                    i45 = i32;
                    i39 = i45;
                    i38 = i44;
                    i36 = i43;
                    z13 = z15;
                    c10423b = new C10423b(c0689a, c7218l2, i44, i39, z15, i36, interfaceC10015c, aVar, list2);
                } else {
                    z15 = z11;
                    i43 = i21;
                    i44 = i31;
                    i45 = i32;
                    i39 = i45;
                    i38 = i44;
                    i36 = i43;
                    z13 = z15;
                    c10423b = new C10423b(c0689a, c7218l2, i44, i39, z15, i36, interfaceC10015c, aVar, list2);
                }
                textController.m1540f(c10423b);
            } else {
                c0689a2 = c0689a;
                z13 = z11;
                i36 = i21;
                i37 = 0;
                i38 = i31;
                i39 = i32;
            }
            textState.getClass();
            interfaceC2052l3 = interfaceC2052l2;
            C5207g.m11111f(interfaceC2052l3, "<set-?>");
            textState.f2561b = interfaceC2052l3;
            textController.m1541g(interfaceC0004c);
            if (list3.isEmpty()) {
                M14522b = ComposableSingletons$BasicTextKt.f2524a;
            } else {
                final int i511 = i35;
                M14522b = C7204a.m14522b(Mo1636j, 1749415830, new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // cm.InterfaceC2056p
                    /* JADX INFO: renamed from: m0 */
                    public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                        InterfaceC0476a interfaceC0476a3 = interfaceC0476a2;
                        if ((num.intValue() & 11) == 2 && interfaceC0476a3.mo1642m()) {
                            interfaceC0476a3.mo1650q();
                        } else {
                            InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q114 = ComposerKt.f3003a;
                            CoreTextKt.m1534a(c0689a2, list3, interfaceC0476a3, (i511 & 14) | 64);
                        }
                        return C9072e.f47360a;
                    }
                });
            }
            interfaceC0500b3 = interfaceC0500b2;
            InterfaceC0500b interfaceC0500bMo1929K12 = interfaceC0500b3.mo1929K(textController.m1539e());
            Mo1636j.mo1622c(-1323940314);
            interfaceC10015c2 = (InterfaceC10015c) Mo1636j.mo1648p(CompositionLocalsKt.f4137e);
            layoutDirection = (LayoutDirection) Mo1636j.mo1648p(CompositionLocalsKt.f4143k);
            interfaceC0647n1 = (InterfaceC0647n1) Mo1636j.mo1648p(CompositionLocalsKt.f4148p);
            ComposeUiNode.f3726n.getClass();
            interfaceC2041a = ComposeUiNode.Companion.f3728b;
            M2036a = C0520a.m2036a(interfaceC0500bMo1929K12);
            if (Mo1636j.f2910a instanceof InterfaceC5299c) {
                C8573r0.m16771y0();
                throw th2;
            }
            Mo1636j.mo1640l();
            if (Mo1636j.f2897L) {
                Mo1636j.mo1634i(interfaceC2041a);
            } else {
                Mo1636j.mo1653s();
            }
            C8573r0.m16714a1(Mo1636j, textController.f2542d, ComposeUiNode.Companion.f3731e);
            C8573r0.m16714a1(Mo1636j, interfaceC10015c2, ComposeUiNode.Companion.f3730d);
            C8573r0.m16714a1(Mo1636j, layoutDirection, ComposeUiNode.Companion.f3732f);
            C8573r0.m16714a1(Mo1636j, interfaceC0647n1, ComposeUiNode.Companion.f3733g);
            M2036a.mo1343M(new C5340u0(Mo1636j), Mo1636j, Integer.valueOf(i37));
            Mo1636j.mo1622c(2058660585);
            M14522b.mo1337m0(Mo1636j, Integer.valueOf(i37));
            ?? r112 = i37;
            Mo1636j.m1609Q(r112);
            Mo1636j.m1609Q(true);
            Mo1636j.m1609Q(r112);
            InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q114 = ComposerKt.f3003a;
            interfaceC0500b4 = interfaceC0500b3;
            interfaceC2052l4 = interfaceC2052l3;
            c7218l3 = c7218l2;
            map2 = mapM13459L0;
            i40 = i39;
            i41 = i38;
            i42 = i36;
            z14 = z13;
            c5332q0M1612T = Mo1636j.m1612T();
            if (c5332q0M1612T == null) {
                return;
            }
            c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$5
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // cm.InterfaceC2056p
                /* JADX INFO: renamed from: m0 */
                public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) throws Throwable {
                    num.intValue();
                    BasicTextKt.m1533d(c0689a, interfaceC0500b4, c7218l3, interfaceC2052l4, i42, z14, i41, i40, map2, interfaceC0476a2, C8573r0.m16737l1(i13 | 1), i14);
                    return C9072e.f47360a;
                }
            };
        }
        i15 |= 384;
        c7218l2 = c7218l;
        i18 = i14 & 8;
        if (i18 != 0) {
            if ((i13 & 7168) == 0) {
                interfaceC2052l2 = interfaceC2052l;
                if (Mo1636j.m1600H(interfaceC2052l2)) {
                    i19 = 2048;
                } else {
                    i19 = 1024;
                }
                i15 |= i19;
            }
            i20 = i14 & 16;
            if (i20 != 0) {
                if ((57344 & i13) == 0) {
                    i21 = i10;
                    if (Mo1636j.m1594E(i21)) {
                        i22 = 16384;
                    } else {
                        i22 = 8192;
                    }
                    i15 |= i22;
                }
                i23 = i14 & 32;
                if (i23 != 0) {
                    i15 |= 196608;
                } else if ((i13 & 458752) == 0) {
                    if (Mo1636j.m1598G(z10)) {
                        i24 = 131072;
                    } else {
                        i24 = 65536;
                    }
                    i15 |= i24;
                }
                i25 = i14 & 64;
                if (i25 != 0) {
                    i15 |= 1572864;
                } else if ((i13 & 3670016) == 0) {
                    if (Mo1636j.m1594E(i11)) {
                        i26 = 1048576;
                    } else {
                        i26 = 524288;
                    }
                    i15 |= i26;
                }
                i27 = i14 & BuildConfig.SDK_TRUNCATE_LENGTH;
                if (i27 != 0) {
                    i15 |= 12582912;
                } else if ((i13 & 29360128) == 0) {
                    if (Mo1636j.m1594E(i12)) {
                        i28 = 8388608;
                    } else {
                        i28 = 4194304;
                    }
                    i15 |= i28;
                }
                i29 = i14 & 256;
                if (i29 != 0) {
                    i15 |= 33554432;
                }
                if (i29 == 256) {
                    i30 = i15;
                    if ((191739611 & i15) != 38347922) {
                    }
                    c5332q0M1612T = Mo1636j.m1612T();
                    if (c5332q0M1612T == null) {
                        return;
                    }
                    c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$5
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) throws Throwable {
                            num.intValue();
                            BasicTextKt.m1533d(c0689a, interfaceC0500b4, c7218l3, interfaceC2052l4, i42, z14, i41, i40, map2, interfaceC0476a2, C8573r0.m16737l1(i13 | 1), i14);
                            return C9072e.f47360a;
                        }
                    };
                }
                i30 = i15;
                if (i46 != 0) {
                    interfaceC0500b2 = InterfaceC0500b.a.f3325a;
                }
                if (i16 != 0) {
                    c7218l2 = C7218l.f40599c;
                }
                if (i18 != 0) {
                    interfaceC2052l2 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$3
                        @Override // cm.InterfaceC2052l
                        /* JADX INFO: renamed from: n */
                        public final C9072e mo528n(C7216j c7216j) {
                            C5207g.m11111f(c7216j, "it");
                            return C9072e.f47360a;
                        }
                    };
                }
                if (i20 != 0) {
                    i21 = 1;
                }
                if (i23 != 0) {
                    z11 = true;
                } else {
                    z11 = z10;
                }
                if (i25 != 0) {
                    i31 = Integer.MAX_VALUE;
                } else {
                    i31 = i11;
                }
                if (i27 != 0) {
                    i32 = 1;
                } else {
                    i32 = i12;
                }
                if (i29 != 0) {
                    mapM13459L0 = C6753d.m13459L0();
                } else {
                    mapM13459L0 = map;
                }
                InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q115 = ComposerKt.f3003a;
                C8584v.m16781D(i32, i31);
                interfaceC0004c = (InterfaceC0004c) Mo1636j.mo1648p(SelectionRegistrarKt.f2569a);
                interfaceC10015c = (InterfaceC10015c) Mo1636j.mo1648p(CompositionLocalsKt.f4137e);
                aVar = (AbstractC0696b.a) Mo1636j.mo1648p(CompositionLocalsKt.f4140h);
                long j112 = ((C0005d) Mo1636j.mo1648p(TextSelectionColorsKt.f2571a)).f3b;
                Pair<List<C0689a.b<C7213g>>, List<C0689a.b<InterfaceC2057q<String, InterfaceC0476a, Integer, C9072e>>>> pair14 = CoreTextKt.f2526a;
                C5207g.m11111f(mapM13459L0, "inlineContent");
                if (mapM13459L0.isEmpty()) {
                    pair = CoreTextKt.f2526a;
                    interfaceC0500b2 = interfaceC0500b2;
                    interfaceC2052l2 = interfaceC2052l2;
                } else {
                    int length13 = c0689a.length();
                    list = c0689a.f4526d;
                    if (list != null) {
                        arrayList = new ArrayList(list.size());
                        size2 = list.size();
                        i34 = 0;
                        while (i34 < size2) {
                            int i411113 = size2;
                            bVar2 = list.get(i34);
                            List<C0689a.b<? extends Object>> list16 = list;
                            bVar3 = bVar2;
                            if (!(bVar3.f4536a instanceof String)) {
                                z12 = false;
                            } else {
                                z12 = false;
                            }
                            if (z12) {
                                arrayList.add(bVar2);
                            }
                            i34++;
                            size2 = i411113;
                            list = list16;
                        }
                    } else {
                        arrayList = EmptyList.f38032a;
                    }
                    C5207g.m11109d(arrayList, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString.Range<kotlin.String>>");
                    arrayList2 = new ArrayList();
                    arrayList3 = new ArrayList();
                    size = arrayList.size();
                    i33 = 0;
                    r10 = arrayList;
                    while (i33 < size) {
                        bVar = (C0689a.b) r10.get(i33);
                        if (mapM13459L0.get(bVar.f4536a) != null) {
                            int i411114 = bVar.f4537b;
                            int i411115 = bVar.f4538c;
                            arrayList2.add(new C0689a.b(i411114, i411115, null));
                            arrayList3.add(new C0689a.b(i411114, i411115, null));
                        }
                        i33++;
                        size = size;
                        r10 = r10;
                    }
                    pair = new Pair<>(arrayList2, arrayList3);
                }
                list2 = pair.f38012a;
                list3 = pair.f38013b;
                Mo1636j.mo1622c(959243860);
                if (interfaceC0004c == null) {
                    jLongValue = 0;
                } else {
                    jLongValue = ((Number) C0487a.m1860a(new Object[]{c0689a, interfaceC0004c}, SaverKt.m1859a(new BasicTextKt$selectionIdSaver$1(interfaceC0004c), BasicTextKt$selectionIdSaver$2.f2523b), new InterfaceC2041a<Long>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$selectableId$2
                        {
                            super(0);
                        }

                        @Override // cm.InterfaceC2041a
                        /* JADX INFO: renamed from: E */
                        public final Long mo807E() {
                            return Long.valueOf(interfaceC0004c.m6b());
                        }
                    }, Mo1636j, 4)).longValue();
                }
                Mo1636j.m1609Q(false);
                Mo1636j.mo1622c(-492369756);
                objM1619a0 = Mo1636j.m1619a0();
                if (objM1619a0 == InterfaceC0476a.a.f3122a) {
                    i35 = i30;
                    th2 = null;
                    TextController textController14 = new TextController(new TextState(new C10423b(c0689a, c7218l2, i31, i32, z11, i21, interfaceC10015c, aVar, list2), jLongValue));
                    Mo1636j.m1597F0(textController14);
                    objM1619a0 = textController14;
                } else {
                    i35 = i30;
                    th2 = null;
                }
                Mo1636j.m1609Q(false);
                textController = (TextController) objM1619a0;
                textState = textController.f2539a;
                if (Mo1636j.f2897L) {
                    c10423b = textState.f2563d;
                    C5207g.m11111f(c10423b, "current");
                    C5207g.m11111f(c7218l2, "style");
                    C5207g.m11111f(interfaceC10015c, "density");
                    C5207g.m11111f(aVar, "fontFamilyResolver");
                    C5207g.m11111f(list2, "placeholders");
                    c0689a2 = c0689a;
                    i37 = 0;
                    if (C5207g.m11106a(c10423b.f52258a, c0689a2)) {
                        z15 = z11;
                        i43 = i21;
                        i44 = i31;
                        i45 = i32;
                        i39 = i45;
                        i38 = i44;
                        i36 = i43;
                        z13 = z15;
                        c10423b = new C10423b(c0689a, c7218l2, i44, i39, z15, i36, interfaceC10015c, aVar, list2);
                    } else {
                        z15 = z11;
                        i43 = i21;
                        i44 = i31;
                        i45 = i32;
                        i39 = i45;
                        i38 = i44;
                        i36 = i43;
                        z13 = z15;
                        c10423b = new C10423b(c0689a, c7218l2, i44, i39, z15, i36, interfaceC10015c, aVar, list2);
                    }
                    textController.m1540f(c10423b);
                } else {
                    c0689a2 = c0689a;
                    z13 = z11;
                    i36 = i21;
                    i37 = 0;
                    i38 = i31;
                    i39 = i32;
                }
                textState.getClass();
                interfaceC2052l3 = interfaceC2052l2;
                C5207g.m11111f(interfaceC2052l3, "<set-?>");
                textState.f2561b = interfaceC2052l3;
                textController.m1541g(interfaceC0004c);
                if (list3.isEmpty()) {
                    M14522b = ComposableSingletons$BasicTextKt.f2524a;
                } else {
                    final int i512 = i35;
                    M14522b = C7204a.m14522b(Mo1636j, 1749415830, new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$4
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                            InterfaceC0476a interfaceC0476a3 = interfaceC0476a2;
                            if ((num.intValue() & 11) == 2 && interfaceC0476a3.mo1642m()) {
                                interfaceC0476a3.mo1650q();
                            } else {
                                InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q116 = ComposerKt.f3003a;
                                CoreTextKt.m1534a(c0689a2, list3, interfaceC0476a3, (i512 & 14) | 64);
                            }
                            return C9072e.f47360a;
                        }
                    });
                }
                interfaceC0500b3 = interfaceC0500b2;
                InterfaceC0500b interfaceC0500bMo1929K13 = interfaceC0500b3.mo1929K(textController.m1539e());
                Mo1636j.mo1622c(-1323940314);
                interfaceC10015c2 = (InterfaceC10015c) Mo1636j.mo1648p(CompositionLocalsKt.f4137e);
                layoutDirection = (LayoutDirection) Mo1636j.mo1648p(CompositionLocalsKt.f4143k);
                interfaceC0647n1 = (InterfaceC0647n1) Mo1636j.mo1648p(CompositionLocalsKt.f4148p);
                ComposeUiNode.f3726n.getClass();
                interfaceC2041a = ComposeUiNode.Companion.f3728b;
                M2036a = C0520a.m2036a(interfaceC0500bMo1929K13);
                if (Mo1636j.f2910a instanceof InterfaceC5299c) {
                    C8573r0.m16771y0();
                    throw th2;
                }
                Mo1636j.mo1640l();
                if (Mo1636j.f2897L) {
                    Mo1636j.mo1634i(interfaceC2041a);
                } else {
                    Mo1636j.mo1653s();
                }
                C8573r0.m16714a1(Mo1636j, textController.f2542d, ComposeUiNode.Companion.f3731e);
                C8573r0.m16714a1(Mo1636j, interfaceC10015c2, ComposeUiNode.Companion.f3730d);
                C8573r0.m16714a1(Mo1636j, layoutDirection, ComposeUiNode.Companion.f3732f);
                C8573r0.m16714a1(Mo1636j, interfaceC0647n1, ComposeUiNode.Companion.f3733g);
                M2036a.mo1343M(new C5340u0(Mo1636j), Mo1636j, Integer.valueOf(i37));
                Mo1636j.mo1622c(2058660585);
                M14522b.mo1337m0(Mo1636j, Integer.valueOf(i37));
                ?? r113 = i37;
                Mo1636j.m1609Q(r113);
                Mo1636j.m1609Q(true);
                Mo1636j.m1609Q(r113);
                InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q116 = ComposerKt.f3003a;
                interfaceC0500b4 = interfaceC0500b3;
                interfaceC2052l4 = interfaceC2052l3;
                c7218l3 = c7218l2;
                map2 = mapM13459L0;
                i40 = i39;
                i41 = i38;
                i42 = i36;
                z14 = z13;
                c5332q0M1612T = Mo1636j.m1612T();
                if (c5332q0M1612T == null) {
                    return;
                }
                c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$5
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // cm.InterfaceC2056p
                    /* JADX INFO: renamed from: m0 */
                    public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) throws Throwable {
                        num.intValue();
                        BasicTextKt.m1533d(c0689a, interfaceC0500b4, c7218l3, interfaceC2052l4, i42, z14, i41, i40, map2, interfaceC0476a2, C8573r0.m16737l1(i13 | 1), i14);
                        return C9072e.f47360a;
                    }
                };
            }
            i15 |= 24576;
            i21 = i10;
            i23 = i14 & 32;
            if (i23 != 0) {
                i15 |= 196608;
            } else if ((i13 & 458752) == 0) {
                if (Mo1636j.m1598G(z10)) {
                    i24 = 131072;
                } else {
                    i24 = 65536;
                }
                i15 |= i24;
            }
            i25 = i14 & 64;
            if (i25 != 0) {
                i15 |= 1572864;
            } else if ((i13 & 3670016) == 0) {
                if (Mo1636j.m1594E(i11)) {
                    i26 = 1048576;
                } else {
                    i26 = 524288;
                }
                i15 |= i26;
            }
            i27 = i14 & BuildConfig.SDK_TRUNCATE_LENGTH;
            if (i27 != 0) {
                i15 |= 12582912;
            } else if ((i13 & 29360128) == 0) {
                if (Mo1636j.m1594E(i12)) {
                    i28 = 8388608;
                } else {
                    i28 = 4194304;
                }
                i15 |= i28;
            }
            i29 = i14 & 256;
            if (i29 != 0) {
                i15 |= 33554432;
            }
            if (i29 == 256) {
                i30 = i15;
                if ((191739611 & i15) != 38347922) {
                }
                c5332q0M1612T = Mo1636j.m1612T();
                if (c5332q0M1612T == null) {
                    return;
                }
                c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$5
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // cm.InterfaceC2056p
                    /* JADX INFO: renamed from: m0 */
                    public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) throws Throwable {
                        num.intValue();
                        BasicTextKt.m1533d(c0689a, interfaceC0500b4, c7218l3, interfaceC2052l4, i42, z14, i41, i40, map2, interfaceC0476a2, C8573r0.m16737l1(i13 | 1), i14);
                        return C9072e.f47360a;
                    }
                };
            }
            i30 = i15;
            if (i46 != 0) {
                interfaceC0500b2 = InterfaceC0500b.a.f3325a;
            }
            if (i16 != 0) {
                c7218l2 = C7218l.f40599c;
            }
            if (i18 != 0) {
                interfaceC2052l2 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$3
                    @Override // cm.InterfaceC2052l
                    /* JADX INFO: renamed from: n */
                    public final C9072e mo528n(C7216j c7216j) {
                        C5207g.m11111f(c7216j, "it");
                        return C9072e.f47360a;
                    }
                };
            }
            if (i20 != 0) {
                i21 = 1;
            }
            if (i23 != 0) {
                z11 = true;
            } else {
                z11 = z10;
            }
            if (i25 != 0) {
                i31 = Integer.MAX_VALUE;
            } else {
                i31 = i11;
            }
            if (i27 != 0) {
                i32 = 1;
            } else {
                i32 = i12;
            }
            if (i29 != 0) {
                mapM13459L0 = C6753d.m13459L0();
            } else {
                mapM13459L0 = map;
            }
            InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q117 = ComposerKt.f3003a;
            C8584v.m16781D(i32, i31);
            interfaceC0004c = (InterfaceC0004c) Mo1636j.mo1648p(SelectionRegistrarKt.f2569a);
            interfaceC10015c = (InterfaceC10015c) Mo1636j.mo1648p(CompositionLocalsKt.f4137e);
            aVar = (AbstractC0696b.a) Mo1636j.mo1648p(CompositionLocalsKt.f4140h);
            long j113 = ((C0005d) Mo1636j.mo1648p(TextSelectionColorsKt.f2571a)).f3b;
            Pair<List<C0689a.b<C7213g>>, List<C0689a.b<InterfaceC2057q<String, InterfaceC0476a, Integer, C9072e>>>> pair15 = CoreTextKt.f2526a;
            C5207g.m11111f(mapM13459L0, "inlineContent");
            if (mapM13459L0.isEmpty()) {
                pair = CoreTextKt.f2526a;
                interfaceC0500b2 = interfaceC0500b2;
                interfaceC2052l2 = interfaceC2052l2;
            } else {
                int length14 = c0689a.length();
                list = c0689a.f4526d;
                if (list != null) {
                    arrayList = new ArrayList(list.size());
                    size2 = list.size();
                    i34 = 0;
                    while (i34 < size2) {
                        int i411116 = size2;
                        bVar2 = list.get(i34);
                        List<C0689a.b<? extends Object>> list17 = list;
                        bVar3 = bVar2;
                        if (!(bVar3.f4536a instanceof String)) {
                            z12 = false;
                        } else {
                            z12 = false;
                        }
                        if (z12) {
                            arrayList.add(bVar2);
                        }
                        i34++;
                        size2 = i411116;
                        list = list17;
                    }
                } else {
                    arrayList = EmptyList.f38032a;
                }
                C5207g.m11109d(arrayList, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString.Range<kotlin.String>>");
                arrayList2 = new ArrayList();
                arrayList3 = new ArrayList();
                size = arrayList.size();
                i33 = 0;
                r10 = arrayList;
                while (i33 < size) {
                    bVar = (C0689a.b) r10.get(i33);
                    if (mapM13459L0.get(bVar.f4536a) != null) {
                        int i411117 = bVar.f4537b;
                        int i411118 = bVar.f4538c;
                        arrayList2.add(new C0689a.b(i411117, i411118, null));
                        arrayList3.add(new C0689a.b(i411117, i411118, null));
                    }
                    i33++;
                    size = size;
                    r10 = r10;
                }
                pair = new Pair<>(arrayList2, arrayList3);
            }
            list2 = pair.f38012a;
            list3 = pair.f38013b;
            Mo1636j.mo1622c(959243860);
            if (interfaceC0004c == null) {
                jLongValue = 0;
            } else {
                jLongValue = ((Number) C0487a.m1860a(new Object[]{c0689a, interfaceC0004c}, SaverKt.m1859a(new BasicTextKt$selectionIdSaver$1(interfaceC0004c), BasicTextKt$selectionIdSaver$2.f2523b), new InterfaceC2041a<Long>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$selectableId$2
                    {
                        super(0);
                    }

                    @Override // cm.InterfaceC2041a
                    /* JADX INFO: renamed from: E */
                    public final Long mo807E() {
                        return Long.valueOf(interfaceC0004c.m6b());
                    }
                }, Mo1636j, 4)).longValue();
            }
            Mo1636j.m1609Q(false);
            Mo1636j.mo1622c(-492369756);
            objM1619a0 = Mo1636j.m1619a0();
            if (objM1619a0 == InterfaceC0476a.a.f3122a) {
                i35 = i30;
                th2 = null;
                TextController textController15 = new TextController(new TextState(new C10423b(c0689a, c7218l2, i31, i32, z11, i21, interfaceC10015c, aVar, list2), jLongValue));
                Mo1636j.m1597F0(textController15);
                objM1619a0 = textController15;
            } else {
                i35 = i30;
                th2 = null;
            }
            Mo1636j.m1609Q(false);
            textController = (TextController) objM1619a0;
            textState = textController.f2539a;
            if (Mo1636j.f2897L) {
                c10423b = textState.f2563d;
                C5207g.m11111f(c10423b, "current");
                C5207g.m11111f(c7218l2, "style");
                C5207g.m11111f(interfaceC10015c, "density");
                C5207g.m11111f(aVar, "fontFamilyResolver");
                C5207g.m11111f(list2, "placeholders");
                c0689a2 = c0689a;
                i37 = 0;
                if (C5207g.m11106a(c10423b.f52258a, c0689a2)) {
                    z15 = z11;
                    i43 = i21;
                    i44 = i31;
                    i45 = i32;
                    i39 = i45;
                    i38 = i44;
                    i36 = i43;
                    z13 = z15;
                    c10423b = new C10423b(c0689a, c7218l2, i44, i39, z15, i36, interfaceC10015c, aVar, list2);
                } else {
                    z15 = z11;
                    i43 = i21;
                    i44 = i31;
                    i45 = i32;
                    i39 = i45;
                    i38 = i44;
                    i36 = i43;
                    z13 = z15;
                    c10423b = new C10423b(c0689a, c7218l2, i44, i39, z15, i36, interfaceC10015c, aVar, list2);
                }
                textController.m1540f(c10423b);
            } else {
                c0689a2 = c0689a;
                z13 = z11;
                i36 = i21;
                i37 = 0;
                i38 = i31;
                i39 = i32;
            }
            textState.getClass();
            interfaceC2052l3 = interfaceC2052l2;
            C5207g.m11111f(interfaceC2052l3, "<set-?>");
            textState.f2561b = interfaceC2052l3;
            textController.m1541g(interfaceC0004c);
            if (list3.isEmpty()) {
                M14522b = ComposableSingletons$BasicTextKt.f2524a;
            } else {
                final int i513 = i35;
                M14522b = C7204a.m14522b(Mo1636j, 1749415830, new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // cm.InterfaceC2056p
                    /* JADX INFO: renamed from: m0 */
                    public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                        InterfaceC0476a interfaceC0476a3 = interfaceC0476a2;
                        if ((num.intValue() & 11) == 2 && interfaceC0476a3.mo1642m()) {
                            interfaceC0476a3.mo1650q();
                        } else {
                            InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q118 = ComposerKt.f3003a;
                            CoreTextKt.m1534a(c0689a2, list3, interfaceC0476a3, (i513 & 14) | 64);
                        }
                        return C9072e.f47360a;
                    }
                });
            }
            interfaceC0500b3 = interfaceC0500b2;
            InterfaceC0500b interfaceC0500bMo1929K14 = interfaceC0500b3.mo1929K(textController.m1539e());
            Mo1636j.mo1622c(-1323940314);
            interfaceC10015c2 = (InterfaceC10015c) Mo1636j.mo1648p(CompositionLocalsKt.f4137e);
            layoutDirection = (LayoutDirection) Mo1636j.mo1648p(CompositionLocalsKt.f4143k);
            interfaceC0647n1 = (InterfaceC0647n1) Mo1636j.mo1648p(CompositionLocalsKt.f4148p);
            ComposeUiNode.f3726n.getClass();
            interfaceC2041a = ComposeUiNode.Companion.f3728b;
            M2036a = C0520a.m2036a(interfaceC0500bMo1929K14);
            if (Mo1636j.f2910a instanceof InterfaceC5299c) {
                C8573r0.m16771y0();
                throw th2;
            }
            Mo1636j.mo1640l();
            if (Mo1636j.f2897L) {
                Mo1636j.mo1634i(interfaceC2041a);
            } else {
                Mo1636j.mo1653s();
            }
            C8573r0.m16714a1(Mo1636j, textController.f2542d, ComposeUiNode.Companion.f3731e);
            C8573r0.m16714a1(Mo1636j, interfaceC10015c2, ComposeUiNode.Companion.f3730d);
            C8573r0.m16714a1(Mo1636j, layoutDirection, ComposeUiNode.Companion.f3732f);
            C8573r0.m16714a1(Mo1636j, interfaceC0647n1, ComposeUiNode.Companion.f3733g);
            M2036a.mo1343M(new C5340u0(Mo1636j), Mo1636j, Integer.valueOf(i37));
            Mo1636j.mo1622c(2058660585);
            M14522b.mo1337m0(Mo1636j, Integer.valueOf(i37));
            ?? r114 = i37;
            Mo1636j.m1609Q(r114);
            Mo1636j.m1609Q(true);
            Mo1636j.m1609Q(r114);
            InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q118 = ComposerKt.f3003a;
            interfaceC0500b4 = interfaceC0500b3;
            interfaceC2052l4 = interfaceC2052l3;
            c7218l3 = c7218l2;
            map2 = mapM13459L0;
            i40 = i39;
            i41 = i38;
            i42 = i36;
            z14 = z13;
            c5332q0M1612T = Mo1636j.m1612T();
            if (c5332q0M1612T == null) {
                return;
            }
            c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$5
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // cm.InterfaceC2056p
                /* JADX INFO: renamed from: m0 */
                public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) throws Throwable {
                    num.intValue();
                    BasicTextKt.m1533d(c0689a, interfaceC0500b4, c7218l3, interfaceC2052l4, i42, z14, i41, i40, map2, interfaceC0476a2, C8573r0.m16737l1(i13 | 1), i14);
                    return C9072e.f47360a;
                }
            };
        }
        i15 |= 3072;
        interfaceC2052l2 = interfaceC2052l;
        i20 = i14 & 16;
        if (i20 != 0) {
            if ((57344 & i13) == 0) {
                i21 = i10;
                if (Mo1636j.m1594E(i21)) {
                    i22 = 16384;
                } else {
                    i22 = 8192;
                }
                i15 |= i22;
            }
            i23 = i14 & 32;
            if (i23 != 0) {
                i15 |= 196608;
            } else if ((i13 & 458752) == 0) {
                if (Mo1636j.m1598G(z10)) {
                    i24 = 131072;
                } else {
                    i24 = 65536;
                }
                i15 |= i24;
            }
            i25 = i14 & 64;
            if (i25 != 0) {
                i15 |= 1572864;
            } else if ((i13 & 3670016) == 0) {
                if (Mo1636j.m1594E(i11)) {
                    i26 = 1048576;
                } else {
                    i26 = 524288;
                }
                i15 |= i26;
            }
            i27 = i14 & BuildConfig.SDK_TRUNCATE_LENGTH;
            if (i27 != 0) {
                i15 |= 12582912;
            } else if ((i13 & 29360128) == 0) {
                if (Mo1636j.m1594E(i12)) {
                    i28 = 8388608;
                } else {
                    i28 = 4194304;
                }
                i15 |= i28;
            }
            i29 = i14 & 256;
            if (i29 != 0) {
                i15 |= 33554432;
            }
            if (i29 == 256) {
                i30 = i15;
                if ((191739611 & i15) != 38347922) {
                }
                c5332q0M1612T = Mo1636j.m1612T();
                if (c5332q0M1612T == null) {
                    return;
                }
                c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$5
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // cm.InterfaceC2056p
                    /* JADX INFO: renamed from: m0 */
                    public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) throws Throwable {
                        num.intValue();
                        BasicTextKt.m1533d(c0689a, interfaceC0500b4, c7218l3, interfaceC2052l4, i42, z14, i41, i40, map2, interfaceC0476a2, C8573r0.m16737l1(i13 | 1), i14);
                        return C9072e.f47360a;
                    }
                };
            }
            i30 = i15;
            if (i46 != 0) {
                interfaceC0500b2 = InterfaceC0500b.a.f3325a;
            }
            if (i16 != 0) {
                c7218l2 = C7218l.f40599c;
            }
            if (i18 != 0) {
                interfaceC2052l2 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$3
                    @Override // cm.InterfaceC2052l
                    /* JADX INFO: renamed from: n */
                    public final C9072e mo528n(C7216j c7216j) {
                        C5207g.m11111f(c7216j, "it");
                        return C9072e.f47360a;
                    }
                };
            }
            if (i20 != 0) {
                i21 = 1;
            }
            if (i23 != 0) {
                z11 = true;
            } else {
                z11 = z10;
            }
            if (i25 != 0) {
                i31 = Integer.MAX_VALUE;
            } else {
                i31 = i11;
            }
            if (i27 != 0) {
                i32 = 1;
            } else {
                i32 = i12;
            }
            if (i29 != 0) {
                mapM13459L0 = C6753d.m13459L0();
            } else {
                mapM13459L0 = map;
            }
            InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q119 = ComposerKt.f3003a;
            C8584v.m16781D(i32, i31);
            interfaceC0004c = (InterfaceC0004c) Mo1636j.mo1648p(SelectionRegistrarKt.f2569a);
            interfaceC10015c = (InterfaceC10015c) Mo1636j.mo1648p(CompositionLocalsKt.f4137e);
            aVar = (AbstractC0696b.a) Mo1636j.mo1648p(CompositionLocalsKt.f4140h);
            long j114 = ((C0005d) Mo1636j.mo1648p(TextSelectionColorsKt.f2571a)).f3b;
            Pair<List<C0689a.b<C7213g>>, List<C0689a.b<InterfaceC2057q<String, InterfaceC0476a, Integer, C9072e>>>> pair16 = CoreTextKt.f2526a;
            C5207g.m11111f(mapM13459L0, "inlineContent");
            if (mapM13459L0.isEmpty()) {
                pair = CoreTextKt.f2526a;
                interfaceC0500b2 = interfaceC0500b2;
                interfaceC2052l2 = interfaceC2052l2;
            } else {
                int length15 = c0689a.length();
                list = c0689a.f4526d;
                if (list != null) {
                    arrayList = new ArrayList(list.size());
                    size2 = list.size();
                    i34 = 0;
                    while (i34 < size2) {
                        int i411119 = size2;
                        bVar2 = list.get(i34);
                        List<C0689a.b<? extends Object>> list18 = list;
                        bVar3 = bVar2;
                        if (!(bVar3.f4536a instanceof String)) {
                            z12 = false;
                        } else {
                            z12 = false;
                        }
                        if (z12) {
                            arrayList.add(bVar2);
                        }
                        i34++;
                        size2 = i411119;
                        list = list18;
                    }
                } else {
                    arrayList = EmptyList.f38032a;
                }
                C5207g.m11109d(arrayList, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString.Range<kotlin.String>>");
                arrayList2 = new ArrayList();
                arrayList3 = new ArrayList();
                size = arrayList.size();
                i33 = 0;
                r10 = arrayList;
                while (i33 < size) {
                    bVar = (C0689a.b) r10.get(i33);
                    if (mapM13459L0.get(bVar.f4536a) != null) {
                        int i4111110 = bVar.f4537b;
                        int i4111111 = bVar.f4538c;
                        arrayList2.add(new C0689a.b(i4111110, i4111111, null));
                        arrayList3.add(new C0689a.b(i4111110, i4111111, null));
                    }
                    i33++;
                    size = size;
                    r10 = r10;
                }
                pair = new Pair<>(arrayList2, arrayList3);
            }
            list2 = pair.f38012a;
            list3 = pair.f38013b;
            Mo1636j.mo1622c(959243860);
            if (interfaceC0004c == null) {
                jLongValue = 0;
            } else {
                jLongValue = ((Number) C0487a.m1860a(new Object[]{c0689a, interfaceC0004c}, SaverKt.m1859a(new BasicTextKt$selectionIdSaver$1(interfaceC0004c), BasicTextKt$selectionIdSaver$2.f2523b), new InterfaceC2041a<Long>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$selectableId$2
                    {
                        super(0);
                    }

                    @Override // cm.InterfaceC2041a
                    /* JADX INFO: renamed from: E */
                    public final Long mo807E() {
                        return Long.valueOf(interfaceC0004c.m6b());
                    }
                }, Mo1636j, 4)).longValue();
            }
            Mo1636j.m1609Q(false);
            Mo1636j.mo1622c(-492369756);
            objM1619a0 = Mo1636j.m1619a0();
            if (objM1619a0 == InterfaceC0476a.a.f3122a) {
                i35 = i30;
                th2 = null;
                TextController textController16 = new TextController(new TextState(new C10423b(c0689a, c7218l2, i31, i32, z11, i21, interfaceC10015c, aVar, list2), jLongValue));
                Mo1636j.m1597F0(textController16);
                objM1619a0 = textController16;
            } else {
                i35 = i30;
                th2 = null;
            }
            Mo1636j.m1609Q(false);
            textController = (TextController) objM1619a0;
            textState = textController.f2539a;
            if (Mo1636j.f2897L) {
                c10423b = textState.f2563d;
                C5207g.m11111f(c10423b, "current");
                C5207g.m11111f(c7218l2, "style");
                C5207g.m11111f(interfaceC10015c, "density");
                C5207g.m11111f(aVar, "fontFamilyResolver");
                C5207g.m11111f(list2, "placeholders");
                c0689a2 = c0689a;
                i37 = 0;
                if (C5207g.m11106a(c10423b.f52258a, c0689a2)) {
                    z15 = z11;
                    i43 = i21;
                    i44 = i31;
                    i45 = i32;
                    i39 = i45;
                    i38 = i44;
                    i36 = i43;
                    z13 = z15;
                    c10423b = new C10423b(c0689a, c7218l2, i44, i39, z15, i36, interfaceC10015c, aVar, list2);
                } else {
                    z15 = z11;
                    i43 = i21;
                    i44 = i31;
                    i45 = i32;
                    i39 = i45;
                    i38 = i44;
                    i36 = i43;
                    z13 = z15;
                    c10423b = new C10423b(c0689a, c7218l2, i44, i39, z15, i36, interfaceC10015c, aVar, list2);
                }
                textController.m1540f(c10423b);
            } else {
                c0689a2 = c0689a;
                z13 = z11;
                i36 = i21;
                i37 = 0;
                i38 = i31;
                i39 = i32;
            }
            textState.getClass();
            interfaceC2052l3 = interfaceC2052l2;
            C5207g.m11111f(interfaceC2052l3, "<set-?>");
            textState.f2561b = interfaceC2052l3;
            textController.m1541g(interfaceC0004c);
            if (list3.isEmpty()) {
                M14522b = ComposableSingletons$BasicTextKt.f2524a;
            } else {
                final int i514 = i35;
                M14522b = C7204a.m14522b(Mo1636j, 1749415830, new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // cm.InterfaceC2056p
                    /* JADX INFO: renamed from: m0 */
                    public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                        InterfaceC0476a interfaceC0476a3 = interfaceC0476a2;
                        if ((num.intValue() & 11) == 2 && interfaceC0476a3.mo1642m()) {
                            interfaceC0476a3.mo1650q();
                        } else {
                            InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q1110 = ComposerKt.f3003a;
                            CoreTextKt.m1534a(c0689a2, list3, interfaceC0476a3, (i514 & 14) | 64);
                        }
                        return C9072e.f47360a;
                    }
                });
            }
            interfaceC0500b3 = interfaceC0500b2;
            InterfaceC0500b interfaceC0500bMo1929K15 = interfaceC0500b3.mo1929K(textController.m1539e());
            Mo1636j.mo1622c(-1323940314);
            interfaceC10015c2 = (InterfaceC10015c) Mo1636j.mo1648p(CompositionLocalsKt.f4137e);
            layoutDirection = (LayoutDirection) Mo1636j.mo1648p(CompositionLocalsKt.f4143k);
            interfaceC0647n1 = (InterfaceC0647n1) Mo1636j.mo1648p(CompositionLocalsKt.f4148p);
            ComposeUiNode.f3726n.getClass();
            interfaceC2041a = ComposeUiNode.Companion.f3728b;
            M2036a = C0520a.m2036a(interfaceC0500bMo1929K15);
            if (Mo1636j.f2910a instanceof InterfaceC5299c) {
                C8573r0.m16771y0();
                throw th2;
            }
            Mo1636j.mo1640l();
            if (Mo1636j.f2897L) {
                Mo1636j.mo1634i(interfaceC2041a);
            } else {
                Mo1636j.mo1653s();
            }
            C8573r0.m16714a1(Mo1636j, textController.f2542d, ComposeUiNode.Companion.f3731e);
            C8573r0.m16714a1(Mo1636j, interfaceC10015c2, ComposeUiNode.Companion.f3730d);
            C8573r0.m16714a1(Mo1636j, layoutDirection, ComposeUiNode.Companion.f3732f);
            C8573r0.m16714a1(Mo1636j, interfaceC0647n1, ComposeUiNode.Companion.f3733g);
            M2036a.mo1343M(new C5340u0(Mo1636j), Mo1636j, Integer.valueOf(i37));
            Mo1636j.mo1622c(2058660585);
            M14522b.mo1337m0(Mo1636j, Integer.valueOf(i37));
            ?? r115 = i37;
            Mo1636j.m1609Q(r115);
            Mo1636j.m1609Q(true);
            Mo1636j.m1609Q(r115);
            InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q1110 = ComposerKt.f3003a;
            interfaceC0500b4 = interfaceC0500b3;
            interfaceC2052l4 = interfaceC2052l3;
            c7218l3 = c7218l2;
            map2 = mapM13459L0;
            i40 = i39;
            i41 = i38;
            i42 = i36;
            z14 = z13;
            c5332q0M1612T = Mo1636j.m1612T();
            if (c5332q0M1612T == null) {
                return;
            }
            c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$5
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // cm.InterfaceC2056p
                /* JADX INFO: renamed from: m0 */
                public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) throws Throwable {
                    num.intValue();
                    BasicTextKt.m1533d(c0689a, interfaceC0500b4, c7218l3, interfaceC2052l4, i42, z14, i41, i40, map2, interfaceC0476a2, C8573r0.m16737l1(i13 | 1), i14);
                    return C9072e.f47360a;
                }
            };
        }
        i15 |= 24576;
        i21 = i10;
        i23 = i14 & 32;
        if (i23 != 0) {
            i15 |= 196608;
        } else if ((i13 & 458752) == 0) {
            if (Mo1636j.m1598G(z10)) {
                i24 = 131072;
            } else {
                i24 = 65536;
            }
            i15 |= i24;
        }
        i25 = i14 & 64;
        if (i25 != 0) {
            i15 |= 1572864;
        } else if ((i13 & 3670016) == 0) {
            if (Mo1636j.m1594E(i11)) {
                i26 = 1048576;
            } else {
                i26 = 524288;
            }
            i15 |= i26;
        }
        i27 = i14 & BuildConfig.SDK_TRUNCATE_LENGTH;
        if (i27 != 0) {
            i15 |= 12582912;
        } else if ((i13 & 29360128) == 0) {
            if (Mo1636j.m1594E(i12)) {
                i28 = 8388608;
            } else {
                i28 = 4194304;
            }
            i15 |= i28;
        }
        i29 = i14 & 256;
        if (i29 != 0) {
            i15 |= 33554432;
        }
        if (i29 == 256) {
            i30 = i15;
            if ((191739611 & i15) != 38347922) {
            }
            c5332q0M1612T = Mo1636j.m1612T();
            if (c5332q0M1612T == null) {
                return;
            }
            c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$5
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // cm.InterfaceC2056p
                /* JADX INFO: renamed from: m0 */
                public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) throws Throwable {
                    num.intValue();
                    BasicTextKt.m1533d(c0689a, interfaceC0500b4, c7218l3, interfaceC2052l4, i42, z14, i41, i40, map2, interfaceC0476a2, C8573r0.m16737l1(i13 | 1), i14);
                    return C9072e.f47360a;
                }
            };
        }
        i30 = i15;
        if (i46 != 0) {
            interfaceC0500b2 = InterfaceC0500b.a.f3325a;
        }
        if (i16 != 0) {
            c7218l2 = C7218l.f40599c;
        }
        if (i18 != 0) {
            interfaceC2052l2 = new InterfaceC2052l<C7216j, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$3
                @Override // cm.InterfaceC2052l
                /* JADX INFO: renamed from: n */
                public final C9072e mo528n(C7216j c7216j) {
                    C5207g.m11111f(c7216j, "it");
                    return C9072e.f47360a;
                }
            };
        }
        if (i20 != 0) {
            i21 = 1;
        }
        if (i23 != 0) {
            z11 = true;
        } else {
            z11 = z10;
        }
        if (i25 != 0) {
            i31 = Integer.MAX_VALUE;
        } else {
            i31 = i11;
        }
        if (i27 != 0) {
            i32 = 1;
        } else {
            i32 = i12;
        }
        if (i29 != 0) {
            mapM13459L0 = C6753d.m13459L0();
        } else {
            mapM13459L0 = map;
        }
        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q1111 = ComposerKt.f3003a;
        C8584v.m16781D(i32, i31);
        interfaceC0004c = (InterfaceC0004c) Mo1636j.mo1648p(SelectionRegistrarKt.f2569a);
        interfaceC10015c = (InterfaceC10015c) Mo1636j.mo1648p(CompositionLocalsKt.f4137e);
        aVar = (AbstractC0696b.a) Mo1636j.mo1648p(CompositionLocalsKt.f4140h);
        long j115 = ((C0005d) Mo1636j.mo1648p(TextSelectionColorsKt.f2571a)).f3b;
        Pair<List<C0689a.b<C7213g>>, List<C0689a.b<InterfaceC2057q<String, InterfaceC0476a, Integer, C9072e>>>> pair17 = CoreTextKt.f2526a;
        C5207g.m11111f(mapM13459L0, "inlineContent");
        if (mapM13459L0.isEmpty()) {
            pair = CoreTextKt.f2526a;
            interfaceC0500b2 = interfaceC0500b2;
            interfaceC2052l2 = interfaceC2052l2;
        } else {
            int length16 = c0689a.length();
            list = c0689a.f4526d;
            if (list != null) {
                arrayList = new ArrayList(list.size());
                size2 = list.size();
                i34 = 0;
                while (i34 < size2) {
                    int i4111112 = size2;
                    bVar2 = list.get(i34);
                    List<C0689a.b<? extends Object>> list19 = list;
                    bVar3 = bVar2;
                    if (!(bVar3.f4536a instanceof String)) {
                        z12 = false;
                    } else {
                        z12 = false;
                    }
                    if (z12) {
                        arrayList.add(bVar2);
                    }
                    i34++;
                    size2 = i4111112;
                    list = list19;
                }
            } else {
                arrayList = EmptyList.f38032a;
            }
            C5207g.m11109d(arrayList, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString.Range<kotlin.String>>");
            arrayList2 = new ArrayList();
            arrayList3 = new ArrayList();
            size = arrayList.size();
            i33 = 0;
            r10 = arrayList;
            while (i33 < size) {
                bVar = (C0689a.b) r10.get(i33);
                if (mapM13459L0.get(bVar.f4536a) != null) {
                    int i4111113 = bVar.f4537b;
                    int i4111114 = bVar.f4538c;
                    arrayList2.add(new C0689a.b(i4111113, i4111114, null));
                    arrayList3.add(new C0689a.b(i4111113, i4111114, null));
                }
                i33++;
                size = size;
                r10 = r10;
            }
            pair = new Pair<>(arrayList2, arrayList3);
        }
        list2 = pair.f38012a;
        list3 = pair.f38013b;
        Mo1636j.mo1622c(959243860);
        if (interfaceC0004c == null) {
            jLongValue = 0;
        } else {
            jLongValue = ((Number) C0487a.m1860a(new Object[]{c0689a, interfaceC0004c}, SaverKt.m1859a(new BasicTextKt$selectionIdSaver$1(interfaceC0004c), BasicTextKt$selectionIdSaver$2.f2523b), new InterfaceC2041a<Long>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$selectableId$2
                {
                    super(0);
                }

                @Override // cm.InterfaceC2041a
                /* JADX INFO: renamed from: E */
                public final Long mo807E() {
                    return Long.valueOf(interfaceC0004c.m6b());
                }
            }, Mo1636j, 4)).longValue();
        }
        Mo1636j.m1609Q(false);
        Mo1636j.mo1622c(-492369756);
        objM1619a0 = Mo1636j.m1619a0();
        if (objM1619a0 == InterfaceC0476a.a.f3122a) {
            i35 = i30;
            th2 = null;
            TextController textController17 = new TextController(new TextState(new C10423b(c0689a, c7218l2, i31, i32, z11, i21, interfaceC10015c, aVar, list2), jLongValue));
            Mo1636j.m1597F0(textController17);
            objM1619a0 = textController17;
        } else {
            i35 = i30;
            th2 = null;
        }
        Mo1636j.m1609Q(false);
        textController = (TextController) objM1619a0;
        textState = textController.f2539a;
        if (Mo1636j.f2897L) {
            c10423b = textState.f2563d;
            C5207g.m11111f(c10423b, "current");
            C5207g.m11111f(c7218l2, "style");
            C5207g.m11111f(interfaceC10015c, "density");
            C5207g.m11111f(aVar, "fontFamilyResolver");
            C5207g.m11111f(list2, "placeholders");
            c0689a2 = c0689a;
            i37 = 0;
            if (C5207g.m11106a(c10423b.f52258a, c0689a2)) {
                z15 = z11;
                i43 = i21;
                i44 = i31;
                i45 = i32;
                i39 = i45;
                i38 = i44;
                i36 = i43;
                z13 = z15;
                c10423b = new C10423b(c0689a, c7218l2, i44, i39, z15, i36, interfaceC10015c, aVar, list2);
            } else {
                z15 = z11;
                i43 = i21;
                i44 = i31;
                i45 = i32;
                i39 = i45;
                i38 = i44;
                i36 = i43;
                z13 = z15;
                c10423b = new C10423b(c0689a, c7218l2, i44, i39, z15, i36, interfaceC10015c, aVar, list2);
            }
            textController.m1540f(c10423b);
        } else {
            c0689a2 = c0689a;
            z13 = z11;
            i36 = i21;
            i37 = 0;
            i38 = i31;
            i39 = i32;
        }
        textState.getClass();
        interfaceC2052l3 = interfaceC2052l2;
        C5207g.m11111f(interfaceC2052l3, "<set-?>");
        textState.f2561b = interfaceC2052l3;
        textController.m1541g(interfaceC0004c);
        if (list3.isEmpty()) {
            M14522b = ComposableSingletons$BasicTextKt.f2524a;
        } else {
            final int i515 = i35;
            M14522b = C7204a.m14522b(Mo1636j, 1749415830, new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // cm.InterfaceC2056p
                /* JADX INFO: renamed from: m0 */
                public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                    InterfaceC0476a interfaceC0476a3 = interfaceC0476a2;
                    if ((num.intValue() & 11) == 2 && interfaceC0476a3.mo1642m()) {
                        interfaceC0476a3.mo1650q();
                    } else {
                        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q1112 = ComposerKt.f3003a;
                        CoreTextKt.m1534a(c0689a2, list3, interfaceC0476a3, (i515 & 14) | 64);
                    }
                    return C9072e.f47360a;
                }
            });
        }
        interfaceC0500b3 = interfaceC0500b2;
        InterfaceC0500b interfaceC0500bMo1929K16 = interfaceC0500b3.mo1929K(textController.m1539e());
        Mo1636j.mo1622c(-1323940314);
        interfaceC10015c2 = (InterfaceC10015c) Mo1636j.mo1648p(CompositionLocalsKt.f4137e);
        layoutDirection = (LayoutDirection) Mo1636j.mo1648p(CompositionLocalsKt.f4143k);
        interfaceC0647n1 = (InterfaceC0647n1) Mo1636j.mo1648p(CompositionLocalsKt.f4148p);
        ComposeUiNode.f3726n.getClass();
        interfaceC2041a = ComposeUiNode.Companion.f3728b;
        M2036a = C0520a.m2036a(interfaceC0500bMo1929K16);
        if (Mo1636j.f2910a instanceof InterfaceC5299c) {
            C8573r0.m16771y0();
            throw th2;
        }
        Mo1636j.mo1640l();
        if (Mo1636j.f2897L) {
            Mo1636j.mo1634i(interfaceC2041a);
        } else {
            Mo1636j.mo1653s();
        }
        C8573r0.m16714a1(Mo1636j, textController.f2542d, ComposeUiNode.Companion.f3731e);
        C8573r0.m16714a1(Mo1636j, interfaceC10015c2, ComposeUiNode.Companion.f3730d);
        C8573r0.m16714a1(Mo1636j, layoutDirection, ComposeUiNode.Companion.f3732f);
        C8573r0.m16714a1(Mo1636j, interfaceC0647n1, ComposeUiNode.Companion.f3733g);
        M2036a.mo1343M(new C5340u0(Mo1636j), Mo1636j, Integer.valueOf(i37));
        Mo1636j.mo1622c(2058660585);
        M14522b.mo1337m0(Mo1636j, Integer.valueOf(i37));
        ?? r116 = i37;
        Mo1636j.m1609Q(r116);
        Mo1636j.m1609Q(true);
        Mo1636j.m1609Q(r116);
        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q1112 = ComposerKt.f3003a;
        interfaceC0500b4 = interfaceC0500b3;
        interfaceC2052l4 = interfaceC2052l3;
        c7218l3 = c7218l2;
        map2 = mapM13459L0;
        i40 = i39;
        i41 = i38;
        i42 = i36;
        z14 = z13;
        c5332q0M1612T = Mo1636j.m1612T();
        if (c5332q0M1612T == null) {
            return;
        }
        c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // cm.InterfaceC2056p
            /* JADX INFO: renamed from: m0 */
            public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) throws Throwable {
                num.intValue();
                BasicTextKt.m1533d(c0689a, interfaceC0500b4, c7218l3, interfaceC2052l4, i42, z14, i41, i40, map2, interfaceC0476a2, C8573r0.m16737l1(i13 | 1), i14);
                return C9072e.f47360a;
            }
        };
    }
}
