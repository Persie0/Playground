package com.lingq.core.token;

import android.app.Activity;
import androidx.compose.p002ui.platform.AbstractC0402n;
import androidx.compose.p002ui.window.AbstractC0454b;
import com.lingq.core.domain.model.language.DictionaryData;
import com.lingq.core.domain.model.lesson.LessonWord;
import com.lingq.core.domain.model.status.WordStatus;
import com.lingq.core.domain.model.token.TokenControllerType;
import com.lingq.core.domain.model.token.TokenMeaning;
import com.lingq.core.domain.model.token.TokenRelatedPhrase;
import com.lingq.core.token.AbstractC1900c;
import com.lingq.feature.dictionary.AbstractC2059d;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.collections.EmptyList;
import p000.AbstractC3584sr;
import p000.br9;
import p000.c99;
import p000.ci0;
import p000.ci8;
import p000.d32;
import p000.e16;
import p000.ex8;
import p000.f5a;
import p000.fb2;
import p000.fe9;
import p000.ge9;
import p000.ho5;
import p000.l6b;
import p000.ms5;
import p000.nj0;
import p000.ox1;
import p000.p84;
import p000.ph5;
import p000.ps5;
import p000.r46;
import p000.r4a;
import p000.te1;
import p000.tj3;
import p000.ui3;
import p000.v4a;
import p000.vh9;
import p000.vi3;
import p000.vs3;
import p000.vz1;
import p000.we1;
import p000.x17;
import p000.x18;
import p000.xh3;
import p000.ye1;
import p000.zf1;
import p000.zf2;
import p000.zi3;
import p000.zz7;

/* JADX INFO: renamed from: com.lingq.core.token.c */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1900c {
    static {
        WordStatus wordStatus = WordStatus.New;
        String value = wordStatus.getValue();
        List listM23604J = vz1.m23604J("noun");
        EmptyList emptyList = EmptyList.f47638a;
        new LessonWord("preview very long word and phrase yes no", false, listM23604J, emptyList, emptyList, 1, value, null, null, null, null, null, null, 32272);
        vz1.m23605K(new br9("common", false), new br9("tricky", true));
        vz1.m23605K(new TokenMeaning(101, "fr", "prévisualisation", 0, false, null, false, 0, 1016), new TokenMeaning(102, "fr", "aperçu", 0, false, null, false, 0, 1016));
        vz1.m23604J(new DictionaryData("Dict FR", 1, "en"));
        TokenPopupAnchor tokenPopupAnchor = TokenPopupAnchor.Collapsed;
        vs3 vs3Var = zz7.f72431f;
        vs3Var.getClass();
        new LessonWord("preview", false, vz1.m23604J("noun"), emptyList, emptyList, 1, wordStatus.getValue(), null, null, null, null, null, null, 32272);
        vz1.m23605K(new br9("common", false), new br9("tricky", true));
        vz1.m23605K(new TokenMeaning(5, "fr", "garde", 0, false, null, false, 0, 1016), new TokenMeaning(6, "fr", "potato", 0, false, null, false, 0, 1016));
        vz1.m23605K(new TokenMeaning(101, "fr", "sauvegardé", 0, false, null, false, 0, 1016), new TokenMeaning(102, "en", "enregistré", 0, false, null, false, 0, 1016));
        vz1.m23605K(new DictionaryData("Dict FR", 1, "en"), new DictionaryData("Google FR", 2, "en"));
        vz1.m23605K(new TokenRelatedPhrase("saved by the bell", "saved by the bell", emptyList), new TokenRelatedPhrase("i don't know", "i don't know", emptyList));
        vs3Var.getClass();
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:104:0x0204  */
    /* JADX WARN: Code duplicated, block: B:105:0x0206  */
    /* JADX WARN: Code duplicated, block: B:109:0x020f  */
    /* JADX WARN: Code duplicated, block: B:111:0x0238  */
    /* JADX WARN: Code duplicated, block: B:114:0x0247  */
    /* JADX WARN: Code duplicated, block: B:116:0x0251  */
    /* JADX WARN: Code duplicated, block: B:117:0x0254  */
    /* JADX WARN: Code duplicated, block: B:121:0x025d  */
    /* JADX WARN: Code duplicated, block: B:123:0x0270  */
    /* JADX WARN: Code duplicated, block: B:126:0x027d  */
    /* JADX WARN: Code duplicated, block: B:127:0x0287  */
    /* JADX WARN: Code duplicated, block: B:129:0x029d  */
    /* JADX WARN: Code duplicated, block: B:130:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:134:0x02a9  */
    /* JADX WARN: Code duplicated, block: B:138:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:139:0x02cf  */
    /* JADX WARN: Code duplicated, block: B:142:0x02e2  */
    /* JADX WARN: Code duplicated, block: B:146:0x02ec  */
    /* JADX WARN: Code duplicated, block: B:149:0x02ff  */
    /* JADX WARN: Code duplicated, block: B:152:0x030b  */
    /* JADX WARN: Code duplicated, block: B:154:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:51:0x0090  */
    /* JADX WARN: Code duplicated, block: B:53:0x0096  */
    /* JADX WARN: Code duplicated, block: B:54:0x0099  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:63:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:67:0x00be  */
    /* JADX WARN: Code duplicated, block: B:68:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:71:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:72:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:75:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:76:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:78:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:80:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:81:0x0106  */
    /* JADX WARN: Code duplicated, block: B:83:0x014a  */
    /* JADX WARN: Code duplicated, block: B:87:0x016b  */
    /* JADX WARN: Code duplicated, block: B:90:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:92:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:93:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:97:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:99:0x01ec  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r14v11, types: [tj3, ye1] */
    /* JADX WARN: Type inference failed for: r14v17 */
    /* JADX WARN: Type inference failed for: r14v18 */
    /* JADX WARN: Type inference failed for: r14v3, types: [tj3] */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r17v3 */
    /* JADX WARN: Type inference failed for: r17v7 */
    /* JADX WARN: Type inference failed for: r8v27 */
    /* JADX WARN: Type inference failed for: r8v28 */
    /* JADX WARN: Type inference failed for: r8v30 */
    /* JADX WARN: Type inference failed for: r8v33 */
    /* JADX WARN: Type inference failed for: r8v34 */
    /* JADX WARN: Type inference failed for: r8v38 */
    /* JADX INFO: renamed from: a */
    public static final void m8705a(final e16 e16Var, final f5a f5aVar, final boolean z, final boolean z2, float f, final vi3 vi3Var, ye1 ye1Var, final int i, final int i2) {
        int i3;
        boolean z3;
        final float f2;
        ?? r14;
        x18 x18VarM22143u;
        float f3;
        e16 e16VarM4429v;
        fb2 fb2Var;
        TokenPopupData tokenPopupData;
        TokenControllerType tokenControllerType;
        float f4;
        x17 x17VarM21622e;
        ?? r15;
        ?? r0;
        boolean z4;
        Triple triple;
        ?? r11;
        Object obj;
        Pair pair;
        ?? r17;
        Object obj2;
        ?? r8;
        Object obj3;
        ?? r9;
        Object obj4;
        Activity activity;
        boolean z5;
        boolean z6;
        Object obj5;
        float fMo905T;
        int i4;
        f5aVar.getClass();
        String str = f5aVar.f38459Q;
        vi3Var.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-984703997);
        int i5 = i & 6;
        ci0 ci0Var = ci0.f10109a;
        if (i5 == 0) {
            i3 = (tj3Var.m22120g(ci0Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= tj3Var.m22120g(e16Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= tj3Var.m22124i(f5aVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= tj3Var.m22122h(z) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= tj3Var.m22122h(z2) ? 16384 : 8192;
        }
        int i6 = i2 & 16;
        if (i6 == 0) {
            if ((196608 & i) == 0) {
                i3 |= tj3Var.m22114d(f) ? 131072 : 65536;
            }
            if ((1572864 & i) == 0) {
                if (tj3Var.m22124i(vi3Var)) {
                    i4 = 1048576;
                } else {
                    i4 = 524288;
                }
                i3 |= i4;
            }
            if ((599187 & i3) != 599186) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (tj3Var.m22099R(i3 & 1, z3)) {
                if (i6 != 0) {
                    f3 = 8.0f;
                } else {
                    f3 = f;
                }
                if (z) {
                    e16VarM4429v = c99.m4411d(ox1.m18559e(ci0Var.mo3727a(e16Var, nj0.f52812g)), 1.0f);
                } else {
                    e16VarM4429v = c99.m4429v(c99.m4428u(e16Var, 0.0f, 300.0f, 1));
                }
                fb2Var = (fb2) tj3Var.m22128k(AbstractC0402n.f4816h);
                tokenPopupData = f5aVar.f38475g;
                if (tokenPopupData != null) {
                    tokenControllerType = tokenPopupData.f23452h;
                } else {
                    tokenControllerType = null;
                }
                if (tokenControllerType == TokenControllerType.Vocabulary) {
                    f4 = 20.0f;
                } else {
                    f4 = 0.0f;
                }
                if (z) {
                    tj3Var.m22111b0(-689470958);
                    if (z2) {
                        tj3Var.m22111b0(-1407712987);
                        tj3Var.m22139q(false);
                        fMo905T = 0.0f;
                    } else {
                        tj3Var.m22111b0(-1407712570);
                        WeakHashMap weakHashMap = l6b.f49204w;
                        fMo905T = fb2Var.mo905T(ho5.m13397r(tj3Var).f49209e.m21441e().f49119d + ho5.m13397r(tj3Var).f49210f.m21441e().f49117b) + f4;
                        tj3Var.m22139q(false);
                    }
                    zf1 zf1Var = ge9.f40637a;
                    x17VarM21622e = AbstractC3584sr.m21626g(((fe9) tj3Var.m22128k(zf1Var)).f38952a, 0.0f, ((fe9) tj3Var.m22128k(zf1Var)).f38952a, fMo905T, 2);
                    tj3Var.m22139q(false);
                } else {
                    tj3Var.m22111b0(-689138080);
                    tj3Var.m22139q(false);
                    x17VarM21622e = AbstractC3584sr.m21622e(0.0f, 0.0f, 3);
                }
                e16 e16VarM21606S = AbstractC3584sr.m21606S(e16VarM4429v, x17VarM21622e);
                vh9 vh9Var = ps5.f56764b;
                r46.m20381f(e16VarM21606S, ((ms5) tj3Var.m22128k(vh9Var)).f51801c.f64858d, te1.m22000n(62, z2 ? 0.0f : f3), te1.m21999m(0, 14, ((ms5) tj3Var.m22128k(vh9Var)).f51799a.f55824I, 0L, tj3Var), ci8.m4703P(-700588711, new xh3(f5aVar, z, vi3Var, 5), tj3Var), tj3Var, 24576, 0);
                r15 = tj3Var;
                p84 p84Var = we1.f66679a;
                if (str != null) {
                    r15.m22111b0(-687668215);
                    activity = (Activity) r15.m22128k(ph5.f56222a);
                    boolean zM22124i = r15.m22124i(activity) | r15.m22124i(f5aVar);
                    if ((i3 & 3670016) == 1048576) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    z6 = zM22124i | z5;
                    Object objM22097O = r15.m22097O();
                    obj5 = objM22097O;
                    if (z6 || objM22097O == p84Var) {
                        TokenPopupKt$TokenPopup$2$1 tokenPopupKt$TokenPopup$2$1 = new TokenPopupKt$TokenPopup$2$1(activity, f5aVar, vi3Var, null);
                        r15.m22131l0(tokenPopupKt$TokenPopup$2$1);
                        obj5 = tokenPopupKt$TokenPopup$2$1;
                    }
                    d32.m10047k(r15, (zi3) obj5, str);
                    r0 = 0;
                    r15.m22139q(false);
                } else {
                    r0 = 0;
                    r15.m22111b0(-687431809);
                    r15.m22139q(false);
                }
                if (f5aVar.f38461S) {
                    r15.m22111b0(-687379357);
                    if ((i3 & 3670016) == 1048576) {
                        r9 = 1;
                    } else {
                        r9 = r0;
                    }
                    Object objM22097O2 = r15.m22097O();
                    obj4 = objM22097O2;
                    if (r9 == 0 || objM22097O2 == p84Var) {
                        ex8 ex8Var = new ex8(vi3Var, 27);
                        r15.m22131l0(ex8Var);
                        obj4 = ex8Var;
                    }
                    z4 = true;
                    AbstractC0454b.m1895a((ui3) obj4, null, ci8.m4703P(690346540, new r4a(f5aVar, vi3Var, 1), r15), r15, 384, 2);
                    r15.m22139q(r0);
                } else {
                    z4 = true;
                    r15.m22111b0(-686860417);
                    r15.m22139q(r0);
                }
                if (f5aVar.f38457O) {
                    r15.m22111b0(-686807438);
                    if ((i3 & 3670016) == 1048576) {
                        r8 = z4 ? 1 : 0;
                    } else {
                        r8 = r0;
                    }
                    Object objM22097O3 = r15.m22097O();
                    obj3 = objM22097O3;
                    if (r8 == 0 || objM22097O3 == p84Var) {
                        ex8 ex8Var2 = new ex8(vi3Var, 28);
                        r15.m22131l0(ex8Var2);
                        obj3 = ex8Var2;
                    }
                    AbstractC2059d.m8969e(r0, r15, (ui3) obj3);
                    r15.m22139q(r0);
                } else {
                    r15.m22111b0(-686641185);
                    r15.m22139q(r0);
                }
                triple = f5aVar.f38458P;
                if (triple == null) {
                    r15.m22111b0(-686589850);
                    r15.m22139q(r0);
                } else {
                    r15.m22111b0(-686589849);
                    String str2 = (String) triple.f47633a;
                    TokenMeaning tokenMeaning = (TokenMeaning) triple.f47634b;
                    String str3 = (String) triple.f47635c;
                    if ((i3 & 3670016) == 1048576) {
                        r11 = z4 ? 1 : 0;
                    } else {
                        r11 = r0;
                    }
                    Object objM22097O4 = r15.m22097O();
                    obj = objM22097O4;
                    if (r11 == 0 || objM22097O4 == p84Var) {
                        ex8 ex8Var3 = new ex8(vi3Var, 29);
                        r15.m22131l0(ex8Var3);
                        obj = ex8Var3;
                    }
                    AbstractC2059d.m8967c(str2, str3, tokenMeaning, (ui3) obj, r15, 0);
                    r15.m22139q(r0);
                }
                pair = f5aVar.f38456N;
                if (pair == null) {
                    r15.m22111b0(-686267202);
                    r15.m22139q(r0);
                } else {
                    r15.m22111b0(-686267201);
                    String str4 = (String) pair.f47623a;
                    zf2 zf2Var = (zf2) pair.f47624b;
                    if ((i3 & 3670016) != 1048576) {
                        r17 = z4;
                        r17 = r0;
                    }
                    r17 = z4;
                    Object objM22097O5 = r15.m22097O();
                    obj2 = objM22097O5;
                    if (r17 == 0 || objM22097O5 == p84Var) {
                        v4a v4aVar = new v4a(vi3Var, r0);
                        r15.m22131l0(v4aVar);
                        obj2 = v4aVar;
                    }
                    AbstractC2059d.m8972h(str4, zf2Var, (vi3) obj2, r15, r0);
                    r15.m22139q(r0);
                }
                f2 = f3;
                r14 = r15;
            } else {
                tj3 tj3Var2 = tj3Var;
                tj3Var2.m22102U();
                f2 = f;
                r14 = tj3Var2;
            }
            x18VarM22143u = r14.m22143u();
            if (x18VarM22143u != null) {
                x18VarM22143u.f67642d = new zi3() { // from class: w4a
                    @Override // p000.zi3
                    public final Object invoke(Object obj6, Object obj7) {
                        ((Integer) obj7).getClass();
                        AbstractC1900c.m8705a(e16Var, f5aVar, z, z2, f2, vi3Var, (ye1) obj6, pk9.m19383z(i | 1), i2);
                        return xfa.f68157a;
                    }
                };
            }
        }
        i3 |= 196608;
        if ((1572864 & i) == 0) {
            if (tj3Var.m22124i(vi3Var)) {
                i4 = 1048576;
            } else {
                i4 = 524288;
            }
            i3 |= i4;
        }
        if ((599187 & i3) != 599186) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (tj3Var.m22099R(i3 & 1, z3)) {
            if (i6 != 0) {
                f3 = 8.0f;
            } else {
                f3 = f;
            }
            if (z) {
                e16VarM4429v = c99.m4411d(ox1.m18559e(ci0Var.mo3727a(e16Var, nj0.f52812g)), 1.0f);
            } else {
                e16VarM4429v = c99.m4429v(c99.m4428u(e16Var, 0.0f, 300.0f, 1));
            }
            fb2Var = (fb2) tj3Var.m22128k(AbstractC0402n.f4816h);
            tokenPopupData = f5aVar.f38475g;
            if (tokenPopupData != null) {
                tokenControllerType = tokenPopupData.f23452h;
            } else {
                tokenControllerType = null;
            }
            if (tokenControllerType == TokenControllerType.Vocabulary) {
                f4 = 20.0f;
            } else {
                f4 = 0.0f;
            }
            if (z) {
                tj3Var.m22111b0(-689470958);
                if (z2) {
                    tj3Var.m22111b0(-1407712987);
                    tj3Var.m22139q(false);
                    fMo905T = 0.0f;
                } else {
                    tj3Var.m22111b0(-1407712570);
                    WeakHashMap weakHashMap2 = l6b.f49204w;
                    fMo905T = fb2Var.mo905T(ho5.m13397r(tj3Var).f49209e.m21441e().f49119d + ho5.m13397r(tj3Var).f49210f.m21441e().f49117b) + f4;
                    tj3Var.m22139q(false);
                }
                zf1 zf1Var2 = ge9.f40637a;
                x17VarM21622e = AbstractC3584sr.m21626g(((fe9) tj3Var.m22128k(zf1Var2)).f38952a, 0.0f, ((fe9) tj3Var.m22128k(zf1Var2)).f38952a, fMo905T, 2);
                tj3Var.m22139q(false);
            } else {
                tj3Var.m22111b0(-689138080);
                tj3Var.m22139q(false);
                x17VarM21622e = AbstractC3584sr.m21622e(0.0f, 0.0f, 3);
            }
            e16 e16VarM21606S2 = AbstractC3584sr.m21606S(e16VarM4429v, x17VarM21622e);
            vh9 vh9Var2 = ps5.f56764b;
            r46.m20381f(e16VarM21606S2, ((ms5) tj3Var.m22128k(vh9Var2)).f51801c.f64858d, te1.m22000n(62, z2 ? 0.0f : f3), te1.m21999m(0, 14, ((ms5) tj3Var.m22128k(vh9Var2)).f51799a.f55824I, 0L, tj3Var), ci8.m4703P(-700588711, new xh3(f5aVar, z, vi3Var, 5), tj3Var), tj3Var, 24576, 0);
            r15 = tj3Var;
            p84 p84Var2 = we1.f66679a;
            if (str != null) {
                r15.m22111b0(-687668215);
                activity = (Activity) r15.m22128k(ph5.f56222a);
                boolean zM22124i2 = r15.m22124i(activity) | r15.m22124i(f5aVar);
                if ((i3 & 3670016) == 1048576) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                z6 = zM22124i2 | z5;
                Object objM22097O6 = r15.m22097O();
                obj5 = objM22097O6;
                if (z6) {
                    TokenPopupKt$TokenPopup$2$1 tokenPopupKt$TokenPopup$2$2 = new TokenPopupKt$TokenPopup$2$1(activity, f5aVar, vi3Var, null);
                    r15.m22131l0(tokenPopupKt$TokenPopup$2$2);
                    obj5 = tokenPopupKt$TokenPopup$2$2;
                } else {
                    TokenPopupKt$TokenPopup$2$1 tokenPopupKt$TokenPopup$2$3 = new TokenPopupKt$TokenPopup$2$1(activity, f5aVar, vi3Var, null);
                    r15.m22131l0(tokenPopupKt$TokenPopup$2$3);
                    obj5 = tokenPopupKt$TokenPopup$2$3;
                }
                d32.m10047k(r15, (zi3) obj5, str);
                r0 = 0;
                r15.m22139q(false);
            } else {
                r0 = 0;
                r15.m22111b0(-687431809);
                r15.m22139q(false);
            }
            if (f5aVar.f38461S) {
                r15.m22111b0(-687379357);
                if ((i3 & 3670016) == 1048576) {
                    r9 = 1;
                } else {
                    r9 = r0;
                }
                Object objM22097O7 = r15.m22097O();
                obj4 = objM22097O7;
                if (r9 == 0) {
                    ex8 ex8Var4 = new ex8(vi3Var, 27);
                    r15.m22131l0(ex8Var4);
                    obj4 = ex8Var4;
                } else {
                    ex8 ex8Var5 = new ex8(vi3Var, 27);
                    r15.m22131l0(ex8Var5);
                    obj4 = ex8Var5;
                }
                z4 = true;
                AbstractC0454b.m1895a((ui3) obj4, null, ci8.m4703P(690346540, new r4a(f5aVar, vi3Var, 1), r15), r15, 384, 2);
                r15.m22139q(r0);
            } else {
                z4 = true;
                r15.m22111b0(-686860417);
                r15.m22139q(r0);
            }
            if (f5aVar.f38457O) {
                r15.m22111b0(-686807438);
                if ((i3 & 3670016) == 1048576) {
                    r8 = z4 ? 1 : 0;
                } else {
                    r8 = r0;
                }
                Object objM22097O8 = r15.m22097O();
                obj3 = objM22097O8;
                if (r8 == 0) {
                    ex8 ex8Var6 = new ex8(vi3Var, 28);
                    r15.m22131l0(ex8Var6);
                    obj3 = ex8Var6;
                } else {
                    ex8 ex8Var7 = new ex8(vi3Var, 28);
                    r15.m22131l0(ex8Var7);
                    obj3 = ex8Var7;
                }
                AbstractC2059d.m8969e(r0, r15, (ui3) obj3);
                r15.m22139q(r0);
            } else {
                r15.m22111b0(-686641185);
                r15.m22139q(r0);
            }
            triple = f5aVar.f38458P;
            if (triple == null) {
                r15.m22111b0(-686589850);
                r15.m22139q(r0);
            } else {
                r15.m22111b0(-686589849);
                String str5 = (String) triple.f47633a;
                TokenMeaning tokenMeaning2 = (TokenMeaning) triple.f47634b;
                String str6 = (String) triple.f47635c;
                if ((i3 & 3670016) == 1048576) {
                    r11 = z4 ? 1 : 0;
                } else {
                    r11 = r0;
                }
                Object objM22097O9 = r15.m22097O();
                obj = objM22097O9;
                if (r11 == 0) {
                    ex8 ex8Var8 = new ex8(vi3Var, 29);
                    r15.m22131l0(ex8Var8);
                    obj = ex8Var8;
                } else {
                    ex8 ex8Var9 = new ex8(vi3Var, 29);
                    r15.m22131l0(ex8Var9);
                    obj = ex8Var9;
                }
                AbstractC2059d.m8967c(str5, str6, tokenMeaning2, (ui3) obj, r15, 0);
                r15.m22139q(r0);
            }
            pair = f5aVar.f38456N;
            if (pair == null) {
                r15.m22111b0(-686267202);
                r15.m22139q(r0);
            } else {
                r15.m22111b0(-686267201);
                String str7 = (String) pair.f47623a;
                zf2 zf2Var2 = (zf2) pair.f47624b;
                if ((i3 & 3670016) != 1048576) {
                    r17 = z4;
                    r17 = r0;
                }
                r17 = z4;
                Object objM22097O10 = r15.m22097O();
                obj2 = objM22097O10;
                if (r17 == 0) {
                    v4a v4aVar2 = new v4a(vi3Var, r0);
                    r15.m22131l0(v4aVar2);
                    obj2 = v4aVar2;
                } else {
                    v4a v4aVar3 = new v4a(vi3Var, r0);
                    r15.m22131l0(v4aVar3);
                    obj2 = v4aVar3;
                }
                AbstractC2059d.m8972h(str7, zf2Var2, (vi3) obj2, r15, r0);
                r15.m22139q(r0);
            }
            f2 = f3;
            r14 = r15;
        } else {
            tj3 tj3Var3 = tj3Var;
            tj3Var3.m22102U();
            f2 = f;
            r14 = tj3Var3;
        }
        x18VarM22143u = r14.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new zi3() { // from class: w4a
                @Override // p000.zi3
                public final Object invoke(Object obj6, Object obj7) {
                    ((Integer) obj7).getClass();
                    AbstractC1900c.m8705a(e16Var, f5aVar, z, z2, f2, vi3Var, (ye1) obj6, pk9.m19383z(i | 1), i2);
                    return xfa.f68157a;
                }
            };
        }
    }
}
