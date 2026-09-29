package p000;

import android.content.res.Configuration;
import androidx.compose.animation.core.C0059a;
import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.graphics.AbstractC0309d;
import androidx.compose.p002ui.node.C0352b;
import androidx.compose.p002ui.platform.AbstractC0394f;
import androidx.compose.p002ui.platform.AbstractC0402n;
import androidx.compose.p002ui.window.AbstractC0456d;
import androidx.compose.runtime.AbstractC0278f;
import com.lingq.core.domain.model.lesson.TokenType;
import com.lingq.core.domain.model.status.CardStatus;
import com.lingq.core.domain.model.status.WordStatus;
import com.lingq.core.domain.model.token.TextTokenType;
import com.lingq.core.domain.model.token.TokenTransliteration;
import com.lingq.core.p012ui.highlightedtext.AbstractC1932c;
import com.lingq.feature.onboarding.R$string;
import com.lingq.feature.onboarding.p014v2.PendingMiniLessonLingq;
import com.lingq.feature.onboarding.p014v2.domain.MiniLessonTemplate;
import com.lingq.feature.onboarding.p014v2.domain.MiniLessonWord;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.text.Regex;
import p000.AbstractC3393o1;
import p000.AbstractC3489q9;
import p000.AbstractC3584sr;
import p000.ab1;
import p000.b16;
import p000.bb1;
import p000.bc3;
import p000.c99;
import p000.ci0;
import p000.d32;
import p000.e16;
import p000.e28;
import p000.eh0;
import p000.gc0;
import p000.ge9;
import p000.ht5;
import p000.l77;
import p000.lw9;
import p000.nj0;
import p000.oha;
import p000.p58;
import p000.p84;
import p000.pb1;
import p000.pvc;
import p000.qh0;
import p000.se1;
import p000.sz5;
import p000.tj3;
import p000.ui3;
import p000.ui8;
import p000.vi3;
import p000.vi6;
import p000.vk9;
import p000.vz1;
import p000.we1;
import p000.xfa;
import p000.ye1;
import p000.z4a;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
public abstract class sz5 {

    /* JADX INFO: renamed from: a */
    public static final Regex f61658a = new Regex("[\\p{L}\\p{M}'’]+");

    /* JADX INFO: renamed from: a */
    public static final void m21790a(final MiniLessonTemplate miniLessonTemplate, final vz5 vz5Var, final List list, final String str, final String str2, final Set set, final vi3 vi3Var, final zi3 zi3Var, final ui3 ui3Var, ye1 ye1Var, final int i) {
        int i2;
        final String str3;
        vi3 vi3Var2;
        tj3 tj3Var;
        int i3;
        tj3 tj3Var2 = (tj3) ye1Var;
        tj3Var2.m22115d0(676825164);
        if ((i & 6) == 0) {
            i2 = (tj3Var2.m22124i(miniLessonTemplate) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= tj3Var2.m22124i(vz5Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= tj3Var2.m22124i(list) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= tj3Var2.m22120g(str) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            str3 = str2;
            i2 |= tj3Var2.m22120g(str3) ? 16384 : 8192;
        } else {
            str3 = str2;
        }
        if ((196608 & i) == 0) {
            i2 |= tj3Var2.m22124i(set) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            vi3Var2 = vi3Var;
            i2 |= tj3Var2.m22124i(vi3Var2) ? 1048576 : 524288;
        } else {
            vi3Var2 = vi3Var;
        }
        if ((12582912 & i) == 0) {
            i2 |= tj3Var2.m22124i(zi3Var) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i2 |= tj3Var2.m22124i(ui3Var) ? 67108864 : 33554432;
        }
        if (tj3Var2.m22099R(i2 & 1, (i2 & 38347923) != 38347922)) {
            int i4 = i2 & 7168;
            jt3 jt3VarM21799j = m21799j(((i2 >> 3) & 112) | ((i2 << 3) & 896) | i4, tj3Var2, vz5Var, miniLessonTemplate.f27418c, str, list);
            vx9 vx9Var = ((ms5) tj3Var2.m22128k(ps5.f56764b)).f51800b.f71406j;
            boolean zM22124i = ((29360128 & i2) == 8388608) | tj3Var2.m22124i(miniLessonTemplate) | ((57344 & i2) == 16384) | tj3Var2.m22124i(set) | ((3670016 & i2) == 1048576) | (i4 == 2048);
            Object objM22097O = tj3Var2.m22097O();
            p84 p84Var = we1.f66679a;
            if (zM22124i || objM22097O == p84Var) {
                final vi3 vi3Var3 = vi3Var2;
                i3 = i2;
                bj3 bj3Var = new bj3() { // from class: rz5
                    @Override // p000.bj3
                    /* JADX INFO: renamed from: e */
                    public final Object mo825e(Object obj, Object obj2, Object obj3, Object obj4) {
                        Object next;
                        xz7 xz7Var = (xz7) obj;
                        ((Boolean) obj3).getClass();
                        e28 e28Var = (e28) obj4;
                        xz7Var.getClass();
                        String str4 = xz7Var.f69008e;
                        ((TokenType) obj2).getClass();
                        e28Var.getClass();
                        MiniLessonTemplate miniLessonTemplate2 = miniLessonTemplate;
                        Iterator it = miniLessonTemplate2.f27419d.iterator();
                        do {
                            if (!it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                        } while (((MiniLessonWord) next).f27424b != xz7Var.f69011h);
                        MiniLessonWord miniLessonWord = (MiniLessonWord) next;
                        String str5 = "";
                        if (miniLessonWord != null) {
                            Map map = miniLessonWord.f27425c;
                            String str6 = (String) map.get(str3);
                            if (str6 == null) {
                                String str7 = (String) map.get("en");
                                if (str7 != null) {
                                    str5 = str7;
                                }
                            } else {
                                str5 = str6;
                            }
                        }
                        boolean zContains = set.contains(str4);
                        zi3Var.invoke(new z4a(str4, str5, e28Var), Boolean.valueOf(zContains));
                        if (!zContains) {
                            vi3Var3.invoke(new PendingMiniLessonLingq(str4, str5, str, miniLessonTemplate2.f27418c));
                        }
                        return xfa.f68157a;
                    }
                };
                tj3Var2.m22131l0(bj3Var);
                objM22097O = bj3Var;
            } else {
                i3 = i2;
            }
            bj3 bj3Var2 = (bj3) objM22097O;
            Object objM22097O2 = tj3Var2.m22097O();
            if (objM22097O2 == p84Var) {
                objM22097O2 = new ie1(8);
                tj3Var2.m22131l0(objM22097O2);
            }
            aj3 aj3Var = (aj3) objM22097O2;
            Object objM22097O3 = tj3Var2.m22097O();
            if (objM22097O3 == p84Var) {
                objM22097O3 = new lz5(1);
                tj3Var2.m22131l0(objM22097O3);
            }
            vi3 vi3Var4 = (vi3) objM22097O3;
            Object objM22097O4 = tj3Var2.m22097O();
            if (objM22097O4 == p84Var) {
                objM22097O4 = new lz5(2);
                tj3Var2.m22131l0(objM22097O4);
            }
            vi3 vi3Var5 = (vi3) objM22097O4;
            Object objM22097O5 = tj3Var2.m22097O();
            if (objM22097O5 == p84Var) {
                objM22097O5 = new tx5(1);
                tj3Var2.m22131l0(objM22097O5);
            }
            tj3Var = tj3Var2;
            AbstractC1932c.m8799a(jt3VarM21799j, vx9Var, null, bj3Var2, aj3Var, ui3Var, vi3Var4, vi3Var5, (ui3) objM22097O5, null, tj3Var, 114843656 | ((i3 >> 9) & 458752), 516);
        } else {
            tj3Var = tj3Var2;
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new zi3() { // from class: jz5
                @Override // p000.zi3
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    sz5.m21790a(miniLessonTemplate, vz5Var, list, str, str2, set, vi3Var, zi3Var, ui3Var, (ye1) obj, pk9.m19383z(i | 1));
                    return xfa.f68157a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v37 */
    /* JADX WARN: Type inference failed for: r1v38, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v43 */
    /* JADX INFO: renamed from: b */
    public static final void m21791b(MiniLessonTemplate miniLessonTemplate, vz5 vz5Var, String str, String str2, List list, int i, vi3 vi3Var, e16 e16Var, boolean z, ye1 ye1Var, int i2) {
        int i3;
        String str3;
        e16 e16Var2;
        tj3 tj3Var;
        boolean z2;
        Object obj;
        ?? r1;
        str2.getClass();
        list.getClass();
        vi3Var.getClass();
        tj3 tj3Var2 = (tj3) ye1Var;
        tj3Var2.m22115d0(1188475291);
        if ((i2 & 6) == 0) {
            i3 = (tj3Var2.m22124i(miniLessonTemplate) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= tj3Var2.m22124i(vz5Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= tj3Var2.m22120g(str) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            str3 = str2;
            i3 |= tj3Var2.m22120g(str3) ? 2048 : 1024;
        } else {
            str3 = str2;
        }
        if ((i2 & 24576) == 0) {
            i3 |= tj3Var2.m22124i(list) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= tj3Var2.m22116e(i) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= tj3Var2.m22124i(vi3Var) ? 1048576 : 524288;
        }
        int i4 = i3 | 12582912;
        if ((100663296 & i2) == 0) {
            i4 |= tj3Var2.m22122h(z) ? 67108864 : 33554432;
        }
        if (tj3Var2.m22099R(i4 & 1, (38347923 & i4) != 38347922)) {
            Object obj2 = we1.f66679a;
            if (miniLessonTemplate == null || vz5Var == null) {
                tj3Var2.m22111b0(-1842585647);
                int i5 = R$string.onboarding_v2_mini_lesson_template_unavailable;
                boolean z3 = (i4 & 3670016) == 1048576;
                Object objM22097O = tj3Var2.m22097O();
                if (z3 || objM22097O == obj2) {
                    objM22097O = new q65(vi3Var, 3);
                    tj3Var2.m22131l0(objM22097O);
                }
                ppb.m19441a(i, i5, (ui3) objM22097O, tj3Var2, ((i4 >> 12) & 7168) | ((i4 >> 15) & 14));
                tj3Var2.m22139q(false);
                x18 x18VarM22143u = tj3Var2.m22143u();
                if (x18VarM22143u != null) {
                    x18VarM22143u.f67642d = new pz5(miniLessonTemplate, vz5Var, str, str2, list, i, vi3Var, z, i2);
                    return;
                }
                return;
            }
            tj3Var2.m22111b0(-1842318489);
            tj3Var2.m22139q(false);
            List list2 = list;
            ArrayList arrayList = new ArrayList(v91.m23189q0(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((PendingMiniLessonLingq) it.next()).f27356a);
            }
            Set setM22627s1 = u91.m22627s1(arrayList);
            boolean zM22120g = tj3Var2.m22120g(miniLessonTemplate) | tj3Var2.m22120g(setM22627s1);
            Object objM22097O2 = tj3Var2.m22097O();
            if (zM22120g || objM22097O2 == obj2) {
                objM22097O2 = m21798i(miniLessonTemplate, setM22627s1);
                tj3Var2.m22131l0(objM22097O2);
            }
            List list3 = (List) objM22097O2;
            boolean zM22120g2 = tj3Var2.m22120g(miniLessonTemplate);
            Object objM22097O3 = tj3Var2.m22097O();
            if (zM22120g2 || objM22097O3 == obj2) {
                objM22097O3 = AbstractC0278f.m1260j(null);
                tj3Var2.m22131l0(objM22097O3);
            }
            t66 t66Var = (t66) objM22097O3;
            boolean zIsEmpty = list.isEmpty();
            boolean zM22120g3 = tj3Var2.m22120g(miniLessonTemplate) | ((i4 & 458752) == 131072);
            Object objM22097O4 = tj3Var2.m22097O();
            if (zM22120g3 || objM22097O4 == obj2) {
                objM22097O4 = AbstractC0278f.m1260j(Boolean.FALSE);
                tj3Var2.m22131l0(objM22097O4);
            }
            t66 t66Var2 = (t66) objM22097O4;
            boolean z4 = ((Boolean) t66Var2.getValue()).booleanValue() || !zIsEmpty;
            t66 t66VarM1263m = AbstractC0278f.m1263m(Boolean.valueOf(z4), tj3Var2);
            b16 b16Var = b16.f7762a;
            boolean z5 = z4;
            e16 e16VarM21609V = AbstractC3584sr.m21609V(c99.m4411d(b16Var, 1.0f), ge9.m12515a(tj3Var2).f38957f, 0.0f, 2);
            bb1 bb1VarM230a = ab1.m230a(eh0.f37238d, nj0.f52792K, tj3Var2, 48);
            int iHashCode = Long.hashCode(tj3Var2.f62385T);
            l77 l77VarM22132m = tj3Var2.m22132m();
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var2, e16VarM21609V);
            se1.f60731q.getClass();
            ui3 ui3Var = C0352b.f4299b;
            tj3Var2.m22119f0();
            if (tj3Var2.f62384S) {
                tj3Var2.m22130l(ui3Var);
            } else {
                tj3Var2.m22137o0();
            }
            oha.m18001g(tj3Var2, C0352b.f4303f, bb1VarM230a);
            oha.m18001g(tj3Var2, C0352b.f4302e, l77VarM22132m);
            oha.m18001g(tj3Var2, C0352b.f4304g, Integer.valueOf(iHashCode));
            oha.m18000f(tj3Var2, C0352b.f4305h);
            oha.m18001g(tj3Var2, C0352b.f4301d, e16VarM1322c);
            thb.m22044c(tj3Var2, c99.m4414g(b16Var, ge9.m12515a(tj3Var2).f38957f));
            lw9.m16554b(vz1.m23620a0(tj3Var2, i), null, p58.m18900f(tj3Var2).f55870o, null, 0L, null, null, 0L, null, new ks9(3), 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var2).f71400d, tj3Var2, 0, 0, 130042);
            thb.m22044c(tj3Var2, c99.m4414g(b16Var, ge9.m12515a(tj3Var2).f38957f));
            int i6 = i4 & 3670016;
            boolean zM22120g4 = tj3Var2.m22120g(t66VarM1263m) | (i6 == 1048576) | tj3Var2.m22120g(t66Var2);
            Object objM22097O5 = tj3Var2.m22097O();
            if (zM22120g4 || objM22097O5 == obj2) {
                objM22097O5 = new qz5(t66VarM1263m, vi3Var, t66Var2);
                tj3Var2.m22131l0(objM22097O5);
            }
            vi3 vi3Var2 = (vi3) objM22097O5;
            boolean zM22120g5 = tj3Var2.m22120g(t66VarM1263m) | tj3Var2.m22120g(t66Var);
            Object objM22097O6 = tj3Var2.m22097O();
            if (zM22120g5 || objM22097O6 == obj2) {
                objM22097O6 = new px0(t66VarM1263m, t66Var, 1);
                tj3Var2.m22131l0(objM22097O6);
            }
            zi3 zi3Var = (zi3) objM22097O6;
            boolean zM22120g6 = tj3Var2.m22120g(t66VarM1263m) | tj3Var2.m22120g(t66Var);
            Object objM22097O7 = tj3Var2.m22097O();
            if (zM22120g6 || objM22097O7 == obj2) {
                z2 = true;
                objM22097O7 = new zy0(t66VarM1263m, t66Var, 1);
                tj3Var2.m22131l0(objM22097O7);
            } else {
                z2 = true;
            }
            boolean z6 = z2;
            m21790a(miniLessonTemplate, vz5Var, list3, str3, str, setM22627s1, vi3Var2, zi3Var, (ui3) objM22097O7, tj3Var2, ((i4 << 6) & 57344) | (i4 & 7294));
            tj3 tj3Var3 = tj3Var2;
            thb.m22044c(tj3Var3, new as4(1.0f, z6));
            if (z5) {
                tj3Var3.m22111b0(-785783472);
                e16 e16VarM21611X = AbstractC3584sr.m21611X(c99.m4412e(b16Var, 1.0f), 0.0f, 0.0f, 0.0f, ge9.m12515a(tj3Var3).f38957f, 7);
                boolean z7 = i6 == 1048576 ? z6 : false;
                Object objM22097O8 = tj3Var3.m22097O();
                if (z7) {
                    obj = obj2;
                } else {
                    obj = obj2;
                    if (objM22097O8 == obj) {
                    }
                    ss5.m21710f(e16VarM21611X, null, null, false, (ui3) objM22097O8, b0c.f7741a, tj3Var3, 196608, 14);
                    r1 = 0;
                    tj3Var3.m22139q(false);
                }
                objM22097O8 = new q65(vi3Var, 4);
                tj3Var3.m22131l0(objM22097O8);
                ss5.m21710f(e16VarM21611X, null, null, false, (ui3) objM22097O8, b0c.f7741a, tj3Var3, 196608, 14);
                r1 = 0;
                tj3Var3.m22139q(false);
            } else {
                obj = obj2;
                r1 = 0;
                tj3Var3.m22111b0(-785432707);
                tj3Var3.m22139q(false);
            }
            tj3Var3.m22139q(z6);
            if (z) {
                tj3Var3.m22111b0(-336407610);
                z4a z4aVar = (z4a) t66Var.getValue();
                if (z4aVar == null) {
                    tj3Var3.m22111b0(-1838701317);
                    tj3Var3.m22139q(r1);
                } else {
                    tj3Var3.m22111b0(-1838701316);
                    boolean zM22122h = tj3Var3.m22122h(z5) | tj3Var3.m22120g(t66Var);
                    Object objM22097O9 = tj3Var3.m22097O();
                    if (zM22122h || objM22097O9 == obj) {
                        objM22097O9 = new ji1(z5, t66Var, 2);
                        tj3Var3.m22131l0(objM22097O9);
                    }
                    m21794e(z4aVar, (ui3) objM22097O9, tj3Var3, r1);
                    tj3Var3.m22139q(r1);
                }
                tj3Var3.m22139q(r1);
            } else {
                tj3Var3.m22111b0(-1838531033);
                tj3Var3.m22139q(r1);
            }
            e16Var2 = b16Var;
            tj3Var = tj3Var3;
        } else {
            tj3Var2.m22102U();
            e16Var2 = e16Var;
            tj3Var = tj3Var2;
        }
        x18 x18VarM22143u2 = tj3Var.m22143u();
        if (x18VarM22143u2 != null) {
            x18VarM22143u2.f67642d = new C2966ej(miniLessonTemplate, vz5Var, str, str2, list, i, vi3Var, e16Var2, z, i2);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m21792c(MiniLessonTemplate miniLessonTemplate, vz5 vz5Var, String str, ui3 ui3Var, e16 e16Var, ye1 ye1Var, int i) {
        int i2;
        tj3 tj3Var;
        e16 e16Var2;
        str.getClass();
        ui3Var.getClass();
        tj3 tj3Var2 = (tj3) ye1Var;
        tj3Var2.m22115d0(-1063810725);
        if ((i & 6) == 0) {
            i2 = (tj3Var2.m22124i(miniLessonTemplate) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= tj3Var2.m22124i(vz5Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= tj3Var2.m22120g(str) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= tj3Var2.m22124i(ui3Var) ? 2048 : 1024;
        }
        int i3 = i2 | 24576;
        if (!tj3Var2.m22099R(i3 & 1, (i3 & 9363) != 9362)) {
            tj3Var = tj3Var2;
            tj3Var.m22102U();
            e16Var2 = e16Var;
        } else {
            if (miniLessonTemplate == null || vz5Var == null) {
                tj3Var2.m22111b0(578626662);
                ppb.m19441a(R$string.onboarding_v2_mini_lesson_read_listen_title, R$string.onboarding_v2_mini_lesson_template_unavailable, ui3Var, tj3Var2, (i3 >> 3) & 8064);
                tj3Var2.m22139q(false);
                x18 x18VarM22143u = tj3Var2.m22143u();
                if (x18VarM22143u != null) {
                    x18VarM22143u.f67642d = new C3522r4(miniLessonTemplate, vz5Var, str, ui3Var, i);
                    return;
                }
                return;
            }
            tj3Var2.m22111b0(578904391);
            tj3Var2.m22139q(false);
            boolean zM22120g = tj3Var2.m22120g(miniLessonTemplate);
            Object objM22097O = tj3Var2.m22097O();
            if (zM22120g || objM22097O == we1.f66679a) {
                objM22097O = m21797h(miniLessonTemplate);
                tj3Var2.m22131l0(objM22097O);
            }
            List list = (List) objM22097O;
            b16 b16Var = b16.f7762a;
            e16 e16VarM21609V = AbstractC3584sr.m21609V(c99.m4411d(b16Var, 1.0f), ge9.m12515a(tj3Var2).f38957f, 0.0f, 2);
            bb1 bb1VarM230a = ab1.m230a(eh0.f37238d, nj0.f52792K, tj3Var2, 48);
            int iHashCode = Long.hashCode(tj3Var2.f62385T);
            l77 l77VarM22132m = tj3Var2.m22132m();
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var2, e16VarM21609V);
            se1.f60731q.getClass();
            ui3 ui3Var2 = C0352b.f4299b;
            tj3Var2.m22119f0();
            if (tj3Var2.f62384S) {
                tj3Var2.m22130l(ui3Var2);
            } else {
                tj3Var2.m22137o0();
            }
            oha.m18001g(tj3Var2, C0352b.f4303f, bb1VarM230a);
            oha.m18001g(tj3Var2, C0352b.f4302e, l77VarM22132m);
            oha.m18001g(tj3Var2, C0352b.f4304g, Integer.valueOf(iHashCode));
            oha.m18000f(tj3Var2, C0352b.f4305h);
            oha.m18001g(tj3Var2, C0352b.f4301d, e16VarM1322c);
            thb.m22044c(tj3Var2, c99.m4414g(b16Var, ge9.m12515a(tj3Var2).f38957f));
            lw9.m16554b(vz1.m23620a0(tj3Var2, R$string.onboarding_v2_mini_lesson_read_listen_title), null, p58.m18900f(tj3Var2).f55870o, null, 0L, null, null, 0L, null, new ks9(3), 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var2).f71400d, tj3Var2, 0, 0, 130042);
            tj3Var = tj3Var2;
            thb.m22044c(tj3Var, c99.m4414g(b16Var, ge9.m12515a(tj3Var).f38957f));
            tpb.m22264a(null, ci8.m4703P(770883073, new oz5(miniLessonTemplate, vz5Var, list, str, 0), tj3Var), tj3Var, 48);
            thb.m22044c(tj3Var, new as4(1.0f, true));
            ss5.m21710f(AbstractC3584sr.m21611X(c99.m4412e(b16Var, 1.0f), 0.0f, 0.0f, 0.0f, ge9.m12515a(tj3Var).f38957f, 7), null, null, false, ui3Var, b0c.f7742b, tj3Var, (57344 & (i3 << 3)) | 196608, 14);
            tj3Var.m22139q(true);
            e16Var2 = b16Var;
        }
        x18 x18VarM22143u2 = tj3Var.m22143u();
        if (x18VarM22143u2 != null) {
            x18VarM22143u2.f67642d = new rb0(miniLessonTemplate, vz5Var, str, ui3Var, e16Var2, i, 3);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m21793d(int i, ye1 ye1Var, vz5 vz5Var, String str, String str2, List list) {
        int i2;
        vz5 vz5Var2;
        str.getClass();
        vz5Var.getClass();
        list.getClass();
        str2.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(2131355031);
        if ((i & 6) == 0) {
            i2 = (tj3Var.m22120g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            vz5Var2 = vz5Var;
            i2 |= tj3Var.m22124i(vz5Var2) ? 32 : 16;
        } else {
            vz5Var2 = vz5Var;
        }
        if ((i & 384) == 0) {
            i2 |= tj3Var.m22124i(list) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= tj3Var.m22120g(str2) ? 2048 : 1024;
        }
        if (tj3Var.m22099R(i2 & 1, (i2 & 1171) != 1170)) {
            jt3 jt3VarM21799j = m21799j((i2 & 14) | ((i2 >> 3) & 112) | ((i2 << 3) & 896) | (i2 & 7168), tj3Var, vz5Var2, str, str2, list);
            vx9 vx9Var = ((ms5) tj3Var.m22128k(ps5.f56764b)).f51800b.f71406j;
            Object objM22097O = tj3Var.m22097O();
            p84 p84Var = we1.f66679a;
            if (objM22097O == p84Var) {
                objM22097O = new vd1(4);
                tj3Var.m22131l0(objM22097O);
            }
            bj3 bj3Var = (bj3) objM22097O;
            Object objM22097O2 = tj3Var.m22097O();
            if (objM22097O2 == p84Var) {
                objM22097O2 = new ie1(7);
                tj3Var.m22131l0(objM22097O2);
            }
            aj3 aj3Var = (aj3) objM22097O2;
            Object objM22097O3 = tj3Var.m22097O();
            if (objM22097O3 == p84Var) {
                objM22097O3 = new tx5(1);
                tj3Var.m22131l0(objM22097O3);
            }
            ui3 ui3Var = (ui3) objM22097O3;
            Object objM22097O4 = tj3Var.m22097O();
            if (objM22097O4 == p84Var) {
                objM22097O4 = new ry4(29);
                tj3Var.m22131l0(objM22097O4);
            }
            vi3 vi3Var = (vi3) objM22097O4;
            Object objM22097O5 = tj3Var.m22097O();
            if (objM22097O5 == p84Var) {
                objM22097O5 = new lz5(0);
                tj3Var.m22131l0(objM22097O5);
            }
            vi3 vi3Var2 = (vi3) objM22097O5;
            Object objM22097O6 = tj3Var.m22097O();
            if (objM22097O6 == p84Var) {
                objM22097O6 = new tx5(1);
                tj3Var.m22131l0(objM22097O6);
            }
            AbstractC1932c.m8799a(jt3VarM21799j, vx9Var, null, bj3Var, aj3Var, ui3Var, vi3Var, vi3Var2, (ui3) objM22097O6, null, tj3Var, 115043336, 516);
            tj3Var = tj3Var;
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new C3522r4(str, vz5Var, list, str2, i, 19);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m21794e(final z4a z4aVar, ui3 ui3Var, ye1 ye1Var, int i) {
        ui3 ui3Var2;
        tj3 tj3Var;
        tj3 tj3Var2 = (tj3) ye1Var;
        tj3Var2.m22115d0(1308768897);
        int i2 = (tj3Var2.m22120g(z4aVar) ? 4 : 2) | i | (tj3Var2.m22124i(ui3Var) ? 32 : 16);
        if (tj3Var2.m22099R(i2 & 1, (i2 & 19) != 18)) {
            fb2 fb2Var = (fb2) tj3Var2.m22128k(AbstractC0402n.f4816h);
            Configuration configuration = (Configuration) tj3Var2.m22128k(AbstractC0394f.f4760a);
            e28 e28Var = z4aVar.f70902c;
            float fMo912g0 = fb2Var.mo912g0(8.0f);
            float fMo912g1 = fb2Var.mo912g0(16.0f);
            final float fMo912g2 = fb2Var.mo912g0(12.0f);
            final float f = configuration.screenWidthDp - 32.0f;
            float fMo912g3 = fb2Var.mo912g0(f);
            boolean z = Float.intBitsToFloat((int) (e28Var.m10803d() & 4294967295L)) < fb2Var.mo912g0((float) configuration.screenHeightDp) / 2.0f;
            float f2 = fMo912g3 - fMo912g1;
            final float fM15944g = l70.m15944g(Float.intBitsToFloat((int) (e28Var.m10803d() >> 32)) - fMo912g1, fMo912g1, f2 < fMo912g1 ? fMo912g1 : f2);
            boolean zM22120g = tj3Var2.m22120g(e28Var) | tj3Var2.m22114d(fMo912g0) | tj3Var2.m22114d(fMo912g1) | tj3Var2.m22122h(z);
            Object objM22097O = tj3Var2.m22097O();
            if (zM22120g || objM22097O == we1.f66679a) {
                objM22097O = new y4a(e28Var, fMo912g0, fMo912g1, z);
                tj3Var2.m22131l0(objM22097O);
            }
            final boolean z2 = z;
            ui3Var2 = ui3Var;
            tj3Var = tj3Var2;
            AbstractC0456d.m1897a((y4a) objM22097O, ui3Var2, new qh7(30, false), ci8.m4703P(797730467, new zi3() { // from class: com.lingq.feature.onboarding.v2.pages.long.c
                @Override // p000.zi3
                public final Object invoke(Object obj, Object obj2) {
                    z4a z4aVar2 = z4aVar;
                    String str = z4aVar2.f70900a;
                    ye1 ye1Var2 = (ye1) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    tj3 tj3Var3 = (tj3) ye1Var2;
                    if (tj3Var3.m22099R(iIntValue & 1, (iIntValue & 3) != 2)) {
                        Object objM22097O2 = tj3Var3.m22097O();
                        p84 p84Var = we1.f66679a;
                        if (objM22097O2 == p84Var) {
                            objM22097O2 = AbstractC3489q9.m19771a(0.0f);
                            tj3Var3.m22131l0(objM22097O2);
                        }
                        C0059a c0059a = (C0059a) objM22097O2;
                        e28 e28Var2 = z4aVar2.f70902c;
                        boolean zM22124i = tj3Var3.m22124i(c0059a);
                        Object objM22097O3 = tj3Var3.m22097O();
                        if (zM22124i || objM22097O3 == p84Var) {
                            objM22097O3 = new MiniLessonInteractiveKt$SimplifiedTokenPopup$1$1$1(c0059a, null);
                            tj3Var3.m22131l0(objM22097O3);
                        }
                        d32.m10049l(str, e28Var2, (zi3) objM22097O3, tj3Var3);
                        boolean zM22124i2 = tj3Var3.m22124i(c0059a);
                        final float f3 = fM15944g;
                        boolean zM22114d = zM22124i2 | tj3Var3.m22114d(f3);
                        boolean z3 = z2;
                        boolean zM22122h = zM22114d | tj3Var3.m22122h(z3);
                        Object objM22097O4 = tj3Var3.m22097O();
                        if (zM22122h || objM22097O4 == p84Var) {
                            objM22097O4 = new vi6(c0059a, f3, z3, 2);
                            tj3Var3.m22131l0(objM22097O4);
                        }
                        b16 b16Var = b16.f7762a;
                        e16 e16VarM1406a = AbstractC0309d.m1406a(b16Var, (vi3) objM22097O4);
                        gc0 gc0Var = nj0.f52808c;
                        ht5 ht5VarM19966d = qh0.m19966d(gc0Var, false);
                        int iHashCode = Long.hashCode(tj3Var3.f62385T);
                        l77 l77VarM22132m = tj3Var3.m22132m();
                        e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var3, e16VarM1406a);
                        se1.f60731q.getClass();
                        ui3 ui3Var3 = C0352b.f4299b;
                        tj3Var3.m22119f0();
                        if (tj3Var3.f62384S) {
                            tj3Var3.m22130l(ui3Var3);
                        } else {
                            tj3Var3.m22137o0();
                        }
                        zi3 zi3Var = C0352b.f4303f;
                        oha.m18001g(tj3Var3, zi3Var, ht5VarM19966d);
                        zi3 zi3Var2 = C0352b.f4302e;
                        oha.m18001g(tj3Var3, zi3Var2, l77VarM22132m);
                        Integer numValueOf = Integer.valueOf(iHashCode);
                        zi3 zi3Var3 = C0352b.f4304g;
                        oha.m18001g(tj3Var3, zi3Var3, numValueOf);
                        vi3 vi3Var = C0352b.f4305h;
                        oha.m18000f(tj3Var3, vi3Var);
                        zi3 zi3Var4 = C0352b.f4301d;
                        oha.m18001g(tj3Var3, zi3Var4, e16VarM1322c);
                        e16 e16VarM21608U = AbstractC3584sr.m21608U(d32.m10007D(vz1.m23616X(AbstractC3584sr.m21611X(c99.m4426s(b16Var, f), 0.0f, z3 ? 12.0f : 0.0f, 0.0f, z3 ? 0.0f : 12.0f, 5), 8.0f, ui8.m22753b(24.0f), 0L, 0L, 28), p58.m18900f(tj3Var3).f55872p, ui8.m22753b(24.0f)), ge9.m12515a(tj3Var3).f38958g, ge9.m12515a(tj3Var3).f38956e);
                        bb1 bb1VarM230a = ab1.m230a(eh0.f37238d, nj0.f52791J, tj3Var3, 48);
                        int iHashCode2 = Long.hashCode(tj3Var3.f62385T);
                        l77 l77VarM22132m2 = tj3Var3.m22132m();
                        e16 e16VarM1322c2 = AbstractC0287b.m1322c(tj3Var3, e16VarM21608U);
                        tj3Var3.m22119f0();
                        if (tj3Var3.f62384S) {
                            tj3Var3.m22130l(ui3Var3);
                        } else {
                            tj3Var3.m22137o0();
                        }
                        oha.m18001g(tj3Var3, zi3Var, bb1VarM230a);
                        oha.m18001g(tj3Var3, zi3Var2, l77VarM22132m2);
                        AbstractC3393o1.m17747v(iHashCode2, tj3Var3, zi3Var3, tj3Var3, vi3Var);
                        oha.m18001g(tj3Var3, zi3Var4, e16VarM1322c2);
                        String str2 = z4aVar2.f70901b;
                        String str3 = vk9.m23391n0(str2) ? str : str2;
                        lw9.m16554b(str3, null, p58.m18900f(tj3Var3).f55873q, null, 0L, null, bc3.f8323i, 0L, null, null, 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var3).f71404h, tj3Var3, 1572864, 0, 131002);
                        pb1.m19031a(0.0f, 0, 2, p58.m18900f(tj3Var3).f55817B, tj3Var3, AbstractC3584sr.m21609V(b16Var, 0.0f, ge9.m12515a(tj3Var3).f38952a, 1));
                        lw9.m16554b(vz1.m23620a0(tj3Var3, R$string.onboarding_v2_mini_lesson_popup_hint), null, p58.m18900f(tj3Var3).f55875s, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var3).f71407k, tj3Var3, 0, 0, 131066);
                        tj3Var3.m22139q(true);
                        long j = p58.m18900f(tj3Var3).f55872p;
                        e16 e16VarMo3727a = ci0.f10109a.mo3727a(b16Var, z3 ? gc0Var : nj0.f52814i);
                        boolean zM22114d2 = tj3Var3.m22114d(f3);
                        final float f4 = fMo912g2;
                        boolean zM22114d3 = zM22114d2 | tj3Var3.m22114d(f4);
                        Object objM22097O5 = tj3Var3.m22097O();
                        if (zM22114d3 || objM22097O5 == p84Var) {
                            objM22097O5 = new vi3() { // from class: kz5
                                @Override // p000.vi3
                                public final Object invoke(Object obj3) {
                                    ((fb2) obj3).getClass();
                                    return new f84(((long) ((int) (f3 - (f4 / 2.0f)))) << 32);
                                }
                            };
                            tj3Var3.m22131l0(objM22097O5);
                        }
                        sz5.m21795f(j, z3, c99.m4422o(pvc.m19527w(e16VarMo3727a, (vi3) objM22097O5), 12.0f), tj3Var3, 0);
                        tj3Var3.m22139q(true);
                    } else {
                        tj3Var3.m22102U();
                    }
                    return xfa.f68157a;
                }
            }, tj3Var2), tj3Var, (i2 & 112) | 3456, 0);
        } else {
            ui3Var2 = ui3Var;
            tj3Var = tj3Var2;
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new wa5(z4aVar, i, 2, ui3Var2);
        }
    }

    /* JADX INFO: renamed from: f */
    public static final void m21795f(final long j, final boolean z, final e16 e16Var, ye1 ye1Var, final int i) {
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(1168906096);
        int i2 = (tj3Var.m22118f(j) ? 4 : 2) | i | (tj3Var.m22122h(z) ? 32 : 16) | (tj3Var.m22120g(e16Var) ? 256 : 128);
        if (tj3Var.m22099R(i2 & 1, (i2 & 147) != 146)) {
            boolean z2 = ((i2 & 112) == 32) | ((i2 & 14) == 4);
            Object objM22097O = tj3Var.m22097O();
            if (z2 || objM22097O == we1.f66679a) {
                objM22097O = new mz5(j, z);
                tj3Var.m22131l0(objM22097O);
            }
            eh0.m11124d(e16Var, (vi3) objM22097O, tj3Var, (i2 >> 6) & 14);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new zi3(j, z, e16Var, i) { // from class: nz5

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ long f53446a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ boolean f53447b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ e16 f53448c;

                @Override // p000.zi3
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM19383z = pk9.m19383z(1);
                    sz5.m21795f(this.f53446a, this.f53447b, this.f53448c, (ye1) obj, iM19383z);
                    return xfa.f68157a;
                }
            };
        }
    }

    /* JADX INFO: renamed from: g */
    public static final ArrayList m21796g(String str, Set set) {
        str.getClass();
        Set set2 = set;
        ArrayList arrayList = new ArrayList(v91.m23189q0(set2, 10));
        Iterator it = set2.iterator();
        while (it.hasNext()) {
            String lowerCase = ((String) it.next()).toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            arrayList.add(lowerCase);
        }
        Set setM22627s1 = u91.m22627s1(arrayList);
        ArrayList arrayList2 = new ArrayList();
        al3 al3Var = new al3(Regex.m15422c(f61658a, str));
        int i = 0;
        while (al3Var.hasNext()) {
            dr5 dr5Var = (dr5) al3Var.next();
            String strM10612c = dr5Var.m10612c();
            q7b q7bVar = new q7b(new xz7(dr5Var.m10611b().f40379a, dr5Var.m10611b().f40380b + 1, 0, 0, strM10612c, i, 0, i, (String) null, (TokenTransliteration) null, TextTokenType.WORD, 0, (Map) null, (String) null, (String) null, (String) null, 260876), false, true, 0, (Integer) null, WordStatus.New.getValue(), false, false, 474);
            String lowerCase2 = strM10612c.toLowerCase(Locale.ROOT);
            lowerCase2.getClass();
            if (setM22627s1.contains(lowerCase2)) {
                q7bVar = q7b.m19709a(q7bVar, CardStatus.New.getValue(), WordStatus.Known.getValue());
            }
            arrayList2.add(q7bVar);
            i++;
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: h */
    public static final ArrayList m21797h(MiniLessonTemplate miniLessonTemplate) {
        String str = miniLessonTemplate.f27418c;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        int i2 = 0;
        for (Object obj : miniLessonTemplate.f27419d) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                vz1.m23628e0();
                throw null;
            }
            MiniLessonWord miniLessonWord = (MiniLessonWord) obj;
            int iM23389l0 = vk9.m23389l0(str, miniLessonWord.f27423a, i, false, 4);
            if (iM23389l0 >= 0) {
                int length = miniLessonWord.f27423a.length() + iM23389l0;
                arrayList.add(new q7b(new xz7(iM23389l0, length, 0, 0, miniLessonWord.f27423a, i2, 0, miniLessonWord.f27424b, (String) null, (TokenTransliteration) null, TextTokenType.WORD, 0, (Map) null, (String) null, (String) null, (String) null, 260876), false, true, 0, (Integer) null, WordStatus.New.getValue(), false, false, 474));
                i = length;
            }
            i2 = i3;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: i */
    public static final ArrayList m21798i(MiniLessonTemplate miniLessonTemplate, Set set) {
        miniLessonTemplate.getClass();
        ArrayList<q7b> arrayListM21797h = m21797h(miniLessonTemplate);
        ArrayList arrayList = new ArrayList(v91.m23189q0(arrayListM21797h, 10));
        for (q7b q7bVarM19709a : arrayListM21797h) {
            if (set.contains(q7bVarM19709a.f57357a.f69008e)) {
                q7bVarM19709a = q7b.m19709a(q7bVarM19709a, CardStatus.New.getValue(), WordStatus.Known.getValue());
            }
            arrayList.add(q7bVarM19709a);
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0020 A[PHI: r8
      0x0020: PHI (r8v3 java.lang.String) = (r8v1 java.lang.String), (r8v4 java.lang.String) binds: [B:9:0x001e, B:5:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:14:0x003b  */
    /* JADX WARN: Code duplicated, block: B:17:0x0044  */
    /* JADX WARN: Code duplicated, block: B:20:0x004a A[PHI: r6
      0x004a: PHI (r6v8 java.lang.String) = (r6v5 java.lang.String), (r6v9 java.lang.String) binds: [B:19:0x0048, B:15:0x0041] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:23:0x0053  */
    /* JADX WARN: Code duplicated, block: B:25:0x0057  */
    /* JADX INFO: renamed from: j */
    public static final jt3 m21799j(int i, ye1 ye1Var, vz5 vz5Var, String str, String str2, List list) {
        String str3;
        boolean z;
        tj3 tj3Var;
        String str4;
        boolean z2;
        Object objM22097O;
        if (((i & 14) ^ 6) > 4) {
            str3 = str;
            if (((tj3) ye1Var).m22120g(str3)) {
                z = true;
            }
            tj3Var = (tj3) ye1Var;
            boolean zM22120g = z | tj3Var.m22120g(list) | tj3Var.m22120g(vz5Var);
            if (((i & 7168) ^ 3072) > 2048) {
                str4 = str2;
                if (!tj3Var.m22120g(str4)) {
                }
                z2 = zM22120g | z;
                objM22097O = tj3Var.m22097O();
                if (z2 || objM22097O == we1.f66679a) {
                    jt3 jt3Var = new jt3(str3.hashCode(), str3, list, null, null, false, null, vz5Var.f66140d, null, null, false, vz5Var.f66138b, vz5Var.f66139c, vz5Var.f66137a, str2, AbstractC3184kh.m15194A(str4), false, null, false, null, null, null, 0.0f, 16712568);
                    tj3Var.m22131l0(jt3Var);
                    objM22097O = jt3Var;
                }
                return (jt3) objM22097O;
            }
            str4 = str2;
            boolean z3 = (i & 3072) == 2048;
            z2 = zM22120g | z3;
            objM22097O = tj3Var.m22097O();
            if (z2) {
                jt3 jt3Var2 = new jt3(str3.hashCode(), str3, list, null, null, false, null, vz5Var.f66140d, null, null, false, vz5Var.f66138b, vz5Var.f66139c, vz5Var.f66137a, str2, AbstractC3184kh.m15194A(str4), false, null, false, null, null, null, 0.0f, 16712568);
                tj3Var.m22131l0(jt3Var2);
                objM22097O = jt3Var2;
            } else {
                jt3 jt3Var3 = new jt3(str3.hashCode(), str3, list, null, null, false, null, vz5Var.f66140d, null, null, false, vz5Var.f66138b, vz5Var.f66139c, vz5Var.f66137a, str2, AbstractC3184kh.m15194A(str4), false, null, false, null, null, null, 0.0f, 16712568);
                tj3Var.m22131l0(jt3Var3);
                objM22097O = jt3Var3;
            }
            return (jt3) objM22097O;
        }
        str3 = str;
        if ((i & 6) == 4) {
            z = true;
        } else {
            z = false;
        }
        tj3Var = (tj3) ye1Var;
        boolean zM22120g2 = z | tj3Var.m22120g(list) | tj3Var.m22120g(vz5Var);
        if (((i & 7168) ^ 3072) > 2048) {
            str4 = str2;
            if (!tj3Var.m22120g(str4)) {
            }
            z2 = zM22120g2 | z3;
            objM22097O = tj3Var.m22097O();
            if (z2) {
                jt3 jt3Var4 = new jt3(str3.hashCode(), str3, list, null, null, false, null, vz5Var.f66140d, null, null, false, vz5Var.f66138b, vz5Var.f66139c, vz5Var.f66137a, str2, AbstractC3184kh.m15194A(str4), false, null, false, null, null, null, 0.0f, 16712568);
                tj3Var.m22131l0(jt3Var4);
                objM22097O = jt3Var4;
            } else {
                jt3 jt3Var5 = new jt3(str3.hashCode(), str3, list, null, null, false, null, vz5Var.f66140d, null, null, false, vz5Var.f66138b, vz5Var.f66139c, vz5Var.f66137a, str2, AbstractC3184kh.m15194A(str4), false, null, false, null, null, null, 0.0f, 16712568);
                tj3Var.m22131l0(jt3Var5);
                objM22097O = jt3Var5;
            }
            return (jt3) objM22097O;
        }
        str4 = str2;
        if ((i & 3072) == 2048) {
        }
        z2 = zM22120g2 | z3;
        objM22097O = tj3Var.m22097O();
        if (z2) {
            jt3 jt3Var6 = new jt3(str3.hashCode(), str3, list, null, null, false, null, vz5Var.f66140d, null, null, false, vz5Var.f66138b, vz5Var.f66139c, vz5Var.f66137a, str2, AbstractC3184kh.m15194A(str4), false, null, false, null, null, null, 0.0f, 16712568);
            tj3Var.m22131l0(jt3Var6);
            objM22097O = jt3Var6;
        } else {
            jt3 jt3Var7 = new jt3(str3.hashCode(), str3, list, null, null, false, null, vz5Var.f66140d, null, null, false, vz5Var.f66138b, vz5Var.f66139c, vz5Var.f66137a, str2, AbstractC3184kh.m15194A(str4), false, null, false, null, null, null, 0.0f, 16712568);
            tj3Var.m22131l0(jt3Var7);
            objM22097O = jt3Var7;
        }
        return (jt3) objM22097O;
    }
}
