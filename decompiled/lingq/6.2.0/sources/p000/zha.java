package p000;

import android.view.View;
import androidx.compose.foundation.AbstractC0080f;
import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.node.C0352b;
import androidx.compose.p002ui.window.AbstractC0454b;
import androidx.lifecycle.runtime.R$id;
import com.lingq.core.analytics.data.LqAnalyticsValues$UpgradePopupSource;
import com.lingq.core.p012ui.UpgradeReason;
import java.util.List;
import java.util.WeakHashMap;
import java.util.logging.Level;
import kotlin.collections.EmptyList;

/* JADX INFO: loaded from: classes.dex */
public abstract class zha {
    /* JADX WARN: Code duplicated, block: B:34:0x006b  */
    /* JADX WARN: Code duplicated, block: B:35:0x0071  */
    /* JADX WARN: Code duplicated, block: B:37:0x0079  */
    /* JADX WARN: Code duplicated, block: B:38:0x007c  */
    /* JADX WARN: Code duplicated, block: B:42:0x0085  */
    /* JADX WARN: Code duplicated, block: B:44:0x0089  */
    /* JADX WARN: Code duplicated, block: B:46:0x008c  */
    /* JADX WARN: Code duplicated, block: B:48:0x0094  */
    /* JADX WARN: Code duplicated, block: B:49:0x0097  */
    /* JADX WARN: Code duplicated, block: B:53:0x009e  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:56:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:57:0x00af  */
    /* JADX WARN: Code duplicated, block: B:61:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:62:0x00be  */
    /* JADX WARN: Code duplicated, block: B:65:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:67:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:68:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:70:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:71:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:76:0x00db  */
    /* JADX WARN: Code duplicated, block: B:77:0x00df  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:83:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:89:0x012c  */
    /* JADX WARN: Code duplicated, block: B:91:0x0139  */
    /* JADX WARN: Code duplicated, block: B:94:0x0149  */
    /* JADX WARN: Code duplicated, block: B:96:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:97:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    public static final void m25658a(final sha shaVar, final ui3 ui3Var, final vi3 vi3Var, e16 e16Var, boolean z, boolean z2, List list, String str, ye1 ye1Var, final int i, final int i2) {
        int i3;
        boolean z3;
        int i4;
        int i5;
        int i6;
        List list2;
        int i7;
        int i8;
        String str2;
        int i9;
        int i10;
        boolean z4;
        final e16 e16Var2;
        final boolean z5;
        final boolean z6;
        final List list3;
        final String str3;
        x18 x18VarM22143u;
        final boolean z7;
        final boolean z8;
        final List list4;
        final String str4;
        rha rhaVar;
        x18 x18VarM22143u2;
        final UpgradeReason upgradeReason;
        shaVar.getClass();
        ui3Var.getClass();
        vi3Var.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-257204794);
        int i11 = (tj3Var.m22120g(shaVar) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i11 |= tj3Var.m22124i(ui3Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i11 |= tj3Var.m22124i(vi3Var) ? 256 : 128;
        }
        int i12 = i11 | 3072;
        int i13 = i2 & 16;
        if (i13 == 0) {
            if ((i & 24576) == 0) {
                i12 |= tj3Var.m22122h(z) ? 16384 : 8192;
            }
            i3 = i2 & 32;
            if (i3 != 0) {
                i5 = i12 | 196608;
                z3 = z2;
            } else {
                z3 = z2;
                if (tj3Var.m22122h(z3)) {
                    i4 = 131072;
                } else {
                    i4 = 65536;
                }
                i5 = i12 | i4;
            }
            i6 = i2 & 64;
            if (i6 != 0) {
                if ((1572864 & i) == 0) {
                    list2 = list;
                    if (tj3Var.m22124i(list2)) {
                        i7 = 1048576;
                    } else {
                        i7 = 524288;
                    }
                    i5 |= i7;
                }
                i8 = i2 & 128;
                if (i8 != 0) {
                    i10 = i5 | 12582912;
                    str2 = str;
                } else {
                    str2 = str;
                    if (tj3Var.m22120g(str2)) {
                        i9 = 8388608;
                    } else {
                        i9 = 4194304;
                    }
                    i10 = i5 | i9;
                }
                if ((4793491 & i10) != 4793490) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (tj3Var.m22099R(i10 & 1, z4)) {
                    if (i13 != 0) {
                        z7 = false;
                    } else {
                        z7 = z;
                    }
                    if (i3 != 0) {
                        z8 = false;
                    } else {
                        z8 = z3;
                    }
                    if (i6 != 0) {
                        list4 = EmptyList.f47638a;
                    } else {
                        list4 = list2;
                    }
                    if (i8 != 0) {
                        str4 = "";
                    } else {
                        str4 = str2;
                    }
                    if (shaVar instanceof rha) {
                        rhaVar = (rha) shaVar;
                    } else {
                        rhaVar = null;
                    }
                    if (rhaVar != null || (upgradeReason = rhaVar.f59324a) == null) {
                        x18VarM22143u2 = tj3Var.m22143u();
                        if (x18VarM22143u2 != null) {
                            final boolean z9 = z7;
                            x18VarM22143u2.f67642d = new zi3() { // from class: vha
                                @Override // p000.zi3
                                public final Object invoke(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    zha.m25658a(shaVar, ui3Var, vi3Var, b16.f7762a, z9, z8, list4, str4, (ye1) obj, pk9.m19383z(i | 1), i2);
                                    return xfa.f68157a;
                                }
                            };
                            return;
                        }
                        return;
                    }
                    final boolean z10 = z8;
                    final List list5 = list4;
                    final String str5 = str4;
                    AbstractC0454b.m1895a(ui3Var, new ge2(true, true, false), ci8.m4703P(516575581, new zi3() { // from class: wha
                        @Override // p000.zi3
                        public final Object invoke(Object obj, Object obj2) {
                            ye1 ye1Var2 = (ye1) obj;
                            int iIntValue = ((Integer) obj2).intValue();
                            tj3 tj3Var2 = (tj3) ye1Var2;
                            if (tj3Var2.m22099R(iIntValue & 1, (iIntValue & 3) != 2)) {
                                b16 b16Var = b16.f7762a;
                                e16 e16VarM10007D = d32.m10007D(c99.m4411d(b16Var, 1.0f), aa1.m198b(0.5f, aa1.f403b), ss5.f61356d);
                                Object objM22097O = tj3Var2.m22097O();
                                p84 p84Var = we1.f66679a;
                                if (objM22097O == p84Var) {
                                    objM22097O = AbstractC3393o1.m17729d(tj3Var2);
                                }
                                v56 v56Var = (v56) objM22097O;
                                ui3 ui3Var2 = ui3Var;
                                e16 e16VarM814a = AbstractC0080f.m814a(e16VarM10007D, v56Var, null, false, null, ui3Var2, 28);
                                ht5 ht5VarM19966d = qh0.m19966d(nj0.f52812g, false);
                                int iHashCode = Long.hashCode(tj3Var2.f62385T);
                                l77 l77VarM22132m = tj3Var2.m22132m();
                                e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var2, e16VarM814a);
                                se1.f60731q.getClass();
                                ui3 ui3Var3 = C0352b.f4299b;
                                tj3Var2.m22119f0();
                                if (tj3Var2.f62384S) {
                                    tj3Var2.m22130l(ui3Var3);
                                } else {
                                    tj3Var2.m22137o0();
                                }
                                oha.m18001g(tj3Var2, C0352b.f4303f, ht5VarM19966d);
                                oha.m18001g(tj3Var2, C0352b.f4302e, l77VarM22132m);
                                oha.m18001g(tj3Var2, C0352b.f4304g, Integer.valueOf(iHashCode));
                                oha.m18000f(tj3Var2, C0352b.f4305h);
                                oha.m18001g(tj3Var2, C0352b.f4301d, e16VarM1322c);
                                e16 e16VarM18559e = ox1.m18559e(b16Var);
                                WeakHashMap weakHashMap = l6b.f49204w;
                                e16 e16VarM21609V = AbstractC3584sr.m21609V(wfb.m23904F(e16VarM18559e, ho5.m13397r(tj3Var2).f49211g), ((fe9) tj3Var2.m22128k(ge9.f40637a)).f38962k, 0.0f, 2);
                                Object objM22097O2 = tj3Var2.m22097O();
                                if (objM22097O2 == p84Var) {
                                    objM22097O2 = AbstractC3393o1.m17729d(tj3Var2);
                                }
                                v56 v56Var2 = (v56) objM22097O2;
                                Object objM22097O3 = tj3Var2.m22097O();
                                if (objM22097O3 == p84Var) {
                                    objM22097O3 = new e5a(6);
                                    tj3Var2.m22131l0(objM22097O3);
                                }
                                r46.m20381f(AbstractC0080f.m814a(e16VarM21609V, v56Var2, null, false, null, (ui3) objM22097O3, 28), null, te1.m22000n(62, 5.0f), te1.m21999m(0, 14, ((ms5) tj3Var2.m22128k(ps5.f56764b)).f51799a.f55825J, 0L, tj3Var2), ci8.m4703P(579152057, new va0(ui3Var2, upgradeReason, z7, z10, list5, str5, vi3Var), tj3Var2), tj3Var2, 24576, 2);
                                tj3Var2.m22139q(true);
                            } else {
                                tj3Var2.m22102U();
                            }
                            return xfa.f68157a;
                        }
                    }, tj3Var), tj3Var, ((i10 >> 3) & 14) | 432, 0);
                    e16Var2 = b16.f7762a;
                    str3 = str4;
                    list3 = list4;
                    z6 = z8;
                    z5 = z7;
                } else {
                    tj3Var.m22102U();
                    e16Var2 = e16Var;
                    z5 = z;
                    z6 = z3;
                    list3 = list2;
                    str3 = str2;
                }
                x18VarM22143u = tj3Var.m22143u();
                if (x18VarM22143u != null) {
                    x18VarM22143u.f67642d = new zi3() { // from class: xha
                        @Override // p000.zi3
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            zha.m25658a(shaVar, ui3Var, vi3Var, e16Var2, z5, z6, list3, str3, (ye1) obj, pk9.m19383z(i | 1), i2);
                            return xfa.f68157a;
                        }
                    };
                }
            }
            i5 |= 1572864;
            list2 = list;
            i8 = i2 & 128;
            if (i8 != 0) {
                i10 = i5 | 12582912;
                str2 = str;
            } else {
                str2 = str;
                if (tj3Var.m22120g(str2)) {
                    i9 = 8388608;
                } else {
                    i9 = 4194304;
                }
                i10 = i5 | i9;
            }
            if ((4793491 & i10) != 4793490) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (tj3Var.m22099R(i10 & 1, z4)) {
                if (i13 != 0) {
                    z7 = false;
                } else {
                    z7 = z;
                }
                if (i3 != 0) {
                    z8 = false;
                } else {
                    z8 = z3;
                }
                if (i6 != 0) {
                    list4 = EmptyList.f47638a;
                } else {
                    list4 = list2;
                }
                if (i8 != 0) {
                    str4 = "";
                } else {
                    str4 = str2;
                }
                if (shaVar instanceof rha) {
                    rhaVar = (rha) shaVar;
                } else {
                    rhaVar = null;
                }
                if (rhaVar != null) {
                }
                x18VarM22143u2 = tj3Var.m22143u();
                if (x18VarM22143u2 != null) {
                    final boolean z11 = z7;
                    x18VarM22143u2.f67642d = new zi3() { // from class: vha
                        @Override // p000.zi3
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            zha.m25658a(shaVar, ui3Var, vi3Var, b16.f7762a, z11, z8, list4, str4, (ye1) obj, pk9.m19383z(i | 1), i2);
                            return xfa.f68157a;
                        }
                    };
                    return;
                }
                return;
            }
            tj3Var.m22102U();
            e16Var2 = e16Var;
            z5 = z;
            z6 = z3;
            list3 = list2;
            str3 = str2;
            x18VarM22143u = tj3Var.m22143u();
            if (x18VarM22143u != null) {
                x18VarM22143u.f67642d = new zi3() { // from class: xha
                    @Override // p000.zi3
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        zha.m25658a(shaVar, ui3Var, vi3Var, e16Var2, z5, z6, list3, str3, (ye1) obj, pk9.m19383z(i | 1), i2);
                        return xfa.f68157a;
                    }
                };
            }
        }
        i12 = i11 | 27648;
        i3 = i2 & 32;
        if (i3 != 0) {
            i5 = i12 | 196608;
            z3 = z2;
        } else {
            z3 = z2;
            if (tj3Var.m22122h(z3)) {
                i4 = 131072;
            } else {
                i4 = 65536;
            }
            i5 = i12 | i4;
        }
        i6 = i2 & 64;
        if (i6 != 0) {
            if ((1572864 & i) == 0) {
                list2 = list;
                if (tj3Var.m22124i(list2)) {
                    i7 = 1048576;
                } else {
                    i7 = 524288;
                }
                i5 |= i7;
            }
            i8 = i2 & 128;
            if (i8 != 0) {
                i10 = i5 | 12582912;
                str2 = str;
            } else {
                str2 = str;
                if (tj3Var.m22120g(str2)) {
                    i9 = 8388608;
                } else {
                    i9 = 4194304;
                }
                i10 = i5 | i9;
            }
            if ((4793491 & i10) != 4793490) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (tj3Var.m22099R(i10 & 1, z4)) {
                if (i13 != 0) {
                    z7 = false;
                } else {
                    z7 = z;
                }
                if (i3 != 0) {
                    z8 = false;
                } else {
                    z8 = z3;
                }
                if (i6 != 0) {
                    list4 = EmptyList.f47638a;
                } else {
                    list4 = list2;
                }
                if (i8 != 0) {
                    str4 = "";
                } else {
                    str4 = str2;
                }
                if (shaVar instanceof rha) {
                    rhaVar = (rha) shaVar;
                } else {
                    rhaVar = null;
                }
                if (rhaVar != null) {
                }
                x18VarM22143u2 = tj3Var.m22143u();
                if (x18VarM22143u2 != null) {
                    final boolean z12 = z7;
                    x18VarM22143u2.f67642d = new zi3() { // from class: vha
                        @Override // p000.zi3
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            zha.m25658a(shaVar, ui3Var, vi3Var, b16.f7762a, z12, z8, list4, str4, (ye1) obj, pk9.m19383z(i | 1), i2);
                            return xfa.f68157a;
                        }
                    };
                    return;
                }
                return;
            }
            tj3Var.m22102U();
            e16Var2 = e16Var;
            z5 = z;
            z6 = z3;
            list3 = list2;
            str3 = str2;
            x18VarM22143u = tj3Var.m22143u();
            if (x18VarM22143u != null) {
                x18VarM22143u.f67642d = new zi3() { // from class: xha
                    @Override // p000.zi3
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        zha.m25658a(shaVar, ui3Var, vi3Var, e16Var2, z5, z6, list3, str3, (ye1) obj, pk9.m19383z(i | 1), i2);
                        return xfa.f68157a;
                    }
                };
            }
        }
        i5 |= 1572864;
        list2 = list;
        i8 = i2 & 128;
        if (i8 != 0) {
            i10 = i5 | 12582912;
            str2 = str;
        } else {
            str2 = str;
            if (tj3Var.m22120g(str2)) {
                i9 = 8388608;
            } else {
                i9 = 4194304;
            }
            i10 = i5 | i9;
        }
        if ((4793491 & i10) != 4793490) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (tj3Var.m22099R(i10 & 1, z4)) {
            if (i13 != 0) {
                z7 = false;
            } else {
                z7 = z;
            }
            if (i3 != 0) {
                z8 = false;
            } else {
                z8 = z3;
            }
            if (i6 != 0) {
                list4 = EmptyList.f47638a;
            } else {
                list4 = list2;
            }
            if (i8 != 0) {
                str4 = "";
            } else {
                str4 = str2;
            }
            if (shaVar instanceof rha) {
                rhaVar = (rha) shaVar;
            } else {
                rhaVar = null;
            }
            if (rhaVar != null) {
            }
            x18VarM22143u2 = tj3Var.m22143u();
            if (x18VarM22143u2 != null) {
                final boolean z13 = z7;
                x18VarM22143u2.f67642d = new zi3() { // from class: vha
                    @Override // p000.zi3
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        zha.m25658a(shaVar, ui3Var, vi3Var, b16.f7762a, z13, z8, list4, str4, (ye1) obj, pk9.m19383z(i | 1), i2);
                        return xfa.f68157a;
                    }
                };
                return;
            }
            return;
        }
        tj3Var.m22102U();
        e16Var2 = e16Var;
        z5 = z;
        z6 = z3;
        list3 = list2;
        str3 = str2;
        x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new zi3() { // from class: xha
                @Override // p000.zi3
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    zha.m25658a(shaVar, ui3Var, vi3Var, e16Var2, z5, z6, list3, str3, (ye1) obj, pk9.m19383z(i | 1), i2);
                    return xfa.f68157a;
                }
            };
        }
    }

    /* JADX INFO: renamed from: b */
    public static final ub5 m25659b(View view) {
        view.getClass();
        while (view != null) {
            Object tag = view.getTag(R$id.view_tree_lifecycle_owner);
            ub5 ub5Var = tag instanceof ub5 ? (ub5) tag : null;
            if (ub5Var != null) {
                return ub5Var;
            }
            Object objM17996b = oha.m17996b(view);
            view = objM17996b instanceof View ? (View) objM17996b : null;
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static final String m25660c(UpgradeReason upgradeReason) {
        upgradeReason.getClass();
        switch (yha.f69857a[upgradeReason.ordinal()]) {
            case 1:
            case 2:
                return LqAnalyticsValues$UpgradePopupSource.ImportAfterLimit.getValue();
            case 3:
                return LqAnalyticsValues$UpgradePopupSource.SentenceTranslation.getValue();
            case 4:
                return LqAnalyticsValues$UpgradePopupSource.BlueWordClick.getValue();
            case 5:
                return LqAnalyticsValues$UpgradePopupSource.ChallengeSignupPopup.getValue();
            case 6:
                return LqAnalyticsValues$UpgradePopupSource.PlaylistCreate.getValue();
            case 7:
                return LqAnalyticsValues$UpgradePopupSource.GenerateTTS.getValue();
            case 8:
                return LqAnalyticsValues$UpgradePopupSource.Transcribe.getValue();
            case 9:
            case 10:
            case 11:
            case 12:
                return LqAnalyticsValues$UpgradePopupSource.ChatMode.getValue();
            case 13:
                return LqAnalyticsValues$UpgradePopupSource.AiVoices.getValue();
            case 14:
                return LqAnalyticsValues$UpgradePopupSource.Simplify.getValue();
            case 15:
                return LqAnalyticsValues$UpgradePopupSource.TranscribePlus.getValue();
            case 16:
                return LqAnalyticsValues$UpgradePopupSource.PremiumVoices.getValue();
            case 17:
                return "";
            default:
                gm5.m12750e();
                return null;
        }
    }

    /* JADX INFO: renamed from: d */
    public static String m25661d(String str) {
        if (str.length() > 23) {
            int i = -1;
            for (int length = str.length() - 1; length >= 0; length--) {
                char cCharAt = str.charAt(length);
                if (cCharAt == '.' || cCharAt == '$') {
                    i = length;
                    break;
                }
            }
            str = str.substring(i + 1);
        }
        String strConcat = "".concat(str);
        return strConcat.substring(0, Math.min(strConcat.length(), 23));
    }

    /* JADX INFO: renamed from: e */
    public static int m25662e(Level level) {
        int iIntValue = level.intValue();
        if (iIntValue >= Level.SEVERE.intValue()) {
            return 6;
        }
        if (iIntValue >= Level.WARNING.intValue()) {
            return 5;
        }
        if (iIntValue >= Level.INFO.intValue()) {
            return 4;
        }
        return iIntValue >= Level.FINE.intValue() ? 3 : 2;
    }
}
