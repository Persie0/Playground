package p000;

import android.content.Context;
import androidx.compose.animation.AbstractC0054a;
import androidx.compose.animation.InterfaceC0067f;
import androidx.compose.foundation.AbstractC0080f;
import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.node.C0352b;
import androidx.compose.p002ui.platform.AbstractC0402n;
import androidx.compose.p002ui.unit.LayoutDirection;
import androidx.compose.runtime.internal.C0282a;
import androidx.datastore.preferences.protobuf.DescriptorProtos;
import com.lingq.core.domain.model.challenge.Challenge;
import com.lingq.core.domain.model.chat.ChatMessage;
import com.lingq.core.domain.model.language.LanguageProgressPeriod;
import com.lingq.core.domain.model.lesson.TokenType;
import com.lingq.core.domain.model.library.FastSearchType;
import com.lingq.core.domain.model.library.LibraryFastSearch;
import com.lingq.core.domain.model.library.LibraryItem;
import com.lingq.core.domain.model.milestones.Badge;
import com.lingq.core.domain.model.milestones.BadgeType;
import com.lingq.core.domain.model.token.TextTokenType;
import com.lingq.core.domain.model.token.TokenTransliteration;
import com.lingq.core.premium.upgrade.AiVoiceSampleState;
import com.lingq.feature.challenges.R$string;
import com.lingq.feature.challenges.cup.AbstractC1976c;
import com.lingq.feature.chat.AbstractC2005i;
import com.lingq.feature.chat.R$drawable;
import com.lingq.feature.dictionary.AbstractC2059d;
import com.lingq.feature.dictionary.C2061e;
import com.lingq.feature.reader.stats.p019ui.words.AbstractC2572b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: kd */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C3180kd implements aj3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f47053a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f47054b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f47055c;

    public /* synthetic */ C3180kd(ui3 ui3Var, ru1 ru1Var) {
        this.f47053a = 11;
        this.f47055c = ui3Var;
        this.f47054b = ru1Var;
    }

    /* JADX INFO: renamed from: d */
    private final Object m15124d(Object obj, Object obj2, Object obj3) {
        vi3 vi3Var = (vi3) this.f47054b;
        vv1 vv1Var = (vv1) this.f47055c;
        ye1 ye1Var = (ye1) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((db1) obj).getClass();
        tj3 tj3Var = (tj3) ye1Var;
        if (tj3Var.m22099R(iIntValue & 1, (iIntValue & 17) != 16)) {
            b16 b16Var = b16.f7762a;
            e16 e16VarM4412e = c99.m4412e(b16Var, 1.0f);
            ht5 ht5VarM19966d = qh0.m19966d(nj0.f52808c, false);
            int iHashCode = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m = tj3Var.m22132m();
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16VarM4412e);
            se1.f60731q.getClass();
            ui3 ui3Var = C0352b.f4299b;
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var);
            } else {
                tj3Var.m22137o0();
            }
            zi3 zi3Var = C0352b.f4303f;
            oha.m18001g(tj3Var, zi3Var, ht5VarM19966d);
            zi3 zi3Var2 = C0352b.f4302e;
            oha.m18001g(tj3Var, zi3Var2, l77VarM22132m);
            Integer numValueOf = Integer.valueOf(iHashCode);
            zi3 zi3Var3 = C0352b.f4304g;
            oha.m18001g(tj3Var, zi3Var3, numValueOf);
            vi3 vi3Var2 = C0352b.f4305h;
            oha.m18000f(tj3Var, vi3Var2);
            zi3 zi3Var4 = C0352b.f4301d;
            oha.m18001g(tj3Var, zi3Var4, e16VarM1322c);
            e16 e16VarM3912B0 = bna.m3912B0(c99.m4412e(b16Var, 1.0f), bna.m3972r0(tj3Var), false, 14);
            zf1 zf1Var = ge9.f40637a;
            e16 e16VarM22066y = thb.m22066y(AbstractC3584sr.m21611X(AbstractC3584sr.m21609V(e16VarM3912B0, ((fe9) tj3Var.m22128k(zf1Var)).f38958g, 0.0f, 2), 0.0f, ((fe9) tj3Var.m22128k(zf1Var)).f38959h, 0.0f, ((fe9) tj3Var.m22128k(zf1Var)).f38958g, 5));
            bb1 bb1VarM230a = ab1.m230a(new C3661uu(((fe9) tj3Var.m22128k(zf1Var)).f38958g, true, new gm5(28)), nj0.f52791J, tj3Var, 0);
            int iHashCode2 = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m2 = tj3Var.m22132m();
            e16 e16VarM1322c2 = AbstractC0287b.m1322c(tj3Var, e16VarM22066y);
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, zi3Var, bb1VarM230a);
            oha.m18001g(tj3Var, zi3Var2, l77VarM22132m2);
            AbstractC3393o1.m17747v(iHashCode2, tj3Var, zi3Var3, tj3Var, vi3Var2);
            oha.m18001g(tj3Var, zi3Var4, e16VarM1322c2);
            v9d.m23203e(vv1Var, tj3Var, 0);
            v9d.m23204f(tj3Var, 0);
            v9d.m23206h(vv1Var, vi3Var, tj3Var, 0);
            if (vv1Var.f65967f) {
                tj3Var.m22111b0(865304746);
                v9d.m23207i(vv1Var, tj3Var, 0);
                tj3Var.m22139q(false);
            } else {
                tj3Var.m22111b0(865370094);
                tj3Var.m22139q(false);
            }
            v9d.m23205g(vv1Var, vi3Var, tj3Var, 0);
            v9d.m23200b(vv1Var, vi3Var, tj3Var, 0);
            tj3Var.m22139q(true);
            e16 e16VarMo3727a = ci0.f10109a.mo3727a(b16Var, nj0.f52810e);
            boolean zM22120g = tj3Var.m22120g(vi3Var);
            Object objM22097O = tj3Var.m22097O();
            if (zM22120g || objM22097O == we1.f66679a) {
                objM22097O = new hv1(vi3Var, 27);
                tj3Var.m22131l0(objM22097O);
            }
            omd.m18141c((ui3) objM22097O, e16VarMo3727a, false, null, null, ipb.f44411a, tj3Var, 1572864, 60);
            tj3Var.m22139q(true);
        } else {
            tj3Var.m22102U();
        }
        return xfa.f68157a;
    }

    /* JADX INFO: renamed from: g */
    private final Object m15125g(Object obj, Object obj2, Object obj3) {
        vv1 vv1Var = (vv1) this.f47054b;
        Context context = (Context) this.f47055c;
        ye1 ye1Var = (ye1) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((db1) obj).getClass();
        tj3 tj3Var = (tj3) ye1Var;
        if (tj3Var.m22099R(iIntValue & 1, (iIntValue & 17) != 16)) {
            bb1 bb1VarM230a = ab1.m230a(new C3661uu(ge9.m12515a(tj3Var).f38956e, true, new gm5(28)), nj0.f52791J, tj3Var, 0);
            int iHashCode = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m = tj3Var.m22132m();
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, b16.f7762a);
            se1.f60731q.getClass();
            ui3 ui3Var = C0352b.f4299b;
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, C0352b.f4303f, bb1VarM230a);
            oha.m18001g(tj3Var, C0352b.f4302e, l77VarM22132m);
            oha.m18001g(tj3Var, C0352b.f4304g, Integer.valueOf(iHashCode));
            oha.m18000f(tj3Var, C0352b.f4305h);
            oha.m18001g(tj3Var, C0352b.f4301d, e16VarM1322c);
            String upperCase = vz1.m23620a0(tj3Var, R$string.cup_signup_label).toUpperCase(Locale.ROOT);
            upperCase.getClass();
            vx9 vx9Var = p58.m18902j(tj3Var).f71410n;
            bc3 bc3Var = bc3.f8324j;
            long jM10017O = d32.m10017O(1.2d);
            long j = xs1.f68608a;
            lw9.m16554b(upperCase, null, j, null, 0L, null, bc3Var, jM10017O, null, null, 0L, 0, false, 0, 0, null, vx9Var, tj3Var, 102236544, 0, 130746);
            tj3Var.m22111b0(-467028295);
            C3341mn c3341mn = new C3341mn();
            c3341mn.m16929d(vz1.m23620a0(tj3Var, R$string.cup_join_title_lead));
            c3341mn.m16929d(" ");
            tj3Var.m22111b0(-467023725);
            int iM16932g = c3341mn.m16932g(new he9(j, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65534));
            try {
                c3341mn.m16929d(vz1.m23620a0(tj3Var, R$string.cup_join_title_accent));
                c3341mn.m16931f(iM16932g);
                tj3Var.m22139q(false);
                C3419on c3419onM16933h = c3341mn.m16933h();
                tj3Var.m22139q(false);
                lw9.m16555c(c3419onM16933h, null, p58.m18900f(tj3Var).f55873q, null, 0L, null, bc3Var, 0L, null, 0L, 0, false, 0, 0, null, null, p58.m18902j(tj3Var).f71399c, tj3Var, 1572864, 0, 262074);
                lw9.m16554b(vz1.m23618Z(R$string.cup_join_subtitle, new Object[]{Integer.valueOf(vv1Var.f65971j), AbstractC3352my.m17093L(context, vv1Var.f65962a)}, tj3Var), null, p58.m18900f(tj3Var).f55875s, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var).f71407k, tj3Var, 0, 0, 131066);
                tj3Var.m22139q(true);
            } catch (Throwable th) {
                c3341mn.m16931f(iM16932g);
                throw th;
            }
        } else {
            tj3Var.m22102U();
        }
        return xfa.f68157a;
    }

    /* JADX INFO: renamed from: j */
    private final Object m15126j(Object obj, Object obj2, Object obj3) {
        t66 t66Var = (t66) this.f47054b;
        C2061e c2061e = (C2061e) this.f47055c;
        t17 t17Var = (t17) obj;
        ye1 ye1Var = (ye1) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        t17Var.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= ((tj3) ye1Var).m22120g(t17Var) ? 4 : 2;
        }
        int i = 0;
        tj3 tj3Var = (tj3) ye1Var;
        if (tj3Var.m22099R(iIntValue & 1, (iIntValue & 19) != 18)) {
            e16 e16VarM21606S = AbstractC3584sr.m21606S(c99.m4411d(b16.f7762a, 1.0f), t17Var);
            C3661uu c3661uu = new C3661uu(((fe9) tj3Var.m22128k(ge9.f40637a)).f38952a, true, new gm5(28));
            boolean zM22120g = tj3Var.m22120g(t66Var) | tj3Var.m22124i(c2061e);
            Object objM22097O = tj3Var.m22097O();
            if (zM22120g || objM22097O == we1.f66679a) {
                objM22097O = new ke2(i, t66Var, c2061e);
                tj3Var.m22131l0(objM22097O);
            }
            fa4.m11642c(e16VarM21606S, null, null, c3661uu, null, null, false, null, (vi3) objM22097O, tj3Var, 0, 494);
        } else {
            tj3Var.m22102U();
        }
        return xfa.f68157a;
    }

    /* JADX INFO: renamed from: k */
    private final Object m15127k(Object obj, Object obj2, Object obj3) {
        LibraryItem libraryItem = ((yz2) this.f47054b).f70666a;
        e04 e04Var = (e04) this.f47055c;
        ye1 ye1Var = (ye1) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((db1) obj).getClass();
        tj3 tj3Var = (tj3) ye1Var;
        if (tj3Var.m22099R(iIntValue & 1, (iIntValue & 17) != 16)) {
            b16 b16Var = b16.f7762a;
            e16 e16VarM21607T = AbstractC3584sr.m21607T(c99.m4412e(b16Var, 1.0f), ge9.m12515a(tj3Var).f38952a);
            sj8 sj8VarM20003a = qj8.m20003a(new C3661uu(ge9.m12515a(tj3Var).f38952a, true, new gm5(28)), nj0.f52817l, tj3Var, 0);
            int iHashCode = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m = tj3Var.m22132m();
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16VarM21607T);
            se1.f60731q.getClass();
            ui3 ui3Var = C0352b.f4299b;
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var);
            } else {
                tj3Var.m22137o0();
            }
            zi3 zi3Var = C0352b.f4303f;
            oha.m18001g(tj3Var, zi3Var, sj8VarM20003a);
            zi3 zi3Var2 = C0352b.f4302e;
            oha.m18001g(tj3Var, zi3Var2, l77VarM22132m);
            Integer numValueOf = Integer.valueOf(iHashCode);
            zi3 zi3Var3 = C0352b.f4304g;
            oha.m18001g(tj3Var, zi3Var3, numValueOf);
            vi3 vi3Var = C0352b.f4305h;
            oha.m18000f(tj3Var, vi3Var);
            zi3 zi3Var4 = C0352b.f4301d;
            oha.m18001g(tj3Var, zi3Var4, e16VarM1322c);
            ss5.m21702b(e04Var, libraryItem.f19433e, pb1.m19045o(c99.m4422o(b16Var, 68.0f), p58.m18901i(tj3Var).f64857c), null, hl1.f42564a, tj3Var, 1572864, 4024);
            as4 as4Var = new as4(1.0f, true);
            bb1 bb1VarM230a = ab1.m230a(eh0.f37238d, nj0.f52791J, tj3Var, 0);
            int iHashCode2 = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m2 = tj3Var.m22132m();
            e16 e16VarM1322c2 = AbstractC0287b.m1322c(tj3Var, as4Var);
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, zi3Var, bb1VarM230a);
            oha.m18001g(tj3Var, zi3Var2, l77VarM22132m2);
            AbstractC3393o1.m17747v(iHashCode2, tj3Var, zi3Var3, tj3Var, vi3Var);
            oha.m18001g(tj3Var, zi3Var4, e16VarM1322c2);
            String str = libraryItem.f19433e;
            if (str == null) {
                str = "";
            }
            lw9.m16554b(str, null, 0L, null, 0L, null, null, 0L, null, null, 0L, 2, false, 2, 0, null, p58.m18902j(tj3Var).f71405i, tj3Var, 0, 24960, 110590);
            lw9.m16554b(vz1.m23620a0(tj3Var, com.lingq.core.p012ui.R$string.lingq_course), null, p58.m18900f(tj3Var).f55875s, null, 0L, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, p58.m18902j(tj3Var).f71408l, tj3Var, 0, 24960, 110586);
            tj3Var.m22139q(true);
            thb.m22044c(tj3Var, c99.m4422o(b16Var, ge9.m12515a(tj3Var).f38955d));
            ty3.m22351a(n7d.m17276b(), null, null, p58.m18900f(tj3Var).f55875s, tj3Var, 48, 4);
            tj3Var.m22139q(true);
        } else {
            tj3Var.m22102U();
        }
        return xfa.f68157a;
    }

    /* JADX INFO: renamed from: l */
    private final Object m15128l(Object obj, Object obj2, Object obj3) {
        String string;
        d03 d03Var = (d03) this.f47054b;
        Context context = (Context) this.f47055c;
        ye1 ye1Var = (ye1) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((db1) obj).getClass();
        tj3 tj3Var = (tj3) ye1Var;
        if (tj3Var.m22099R(iIntValue & 1, (iIntValue & 17) != 16)) {
            e16 e16VarM21607T = AbstractC3584sr.m21607T(c99.m4412e(b16.f7762a, 1.0f), ((fe9) tj3Var.m22128k(ge9.f40637a)).f38952a);
            sj8 sj8VarM20003a = qj8.m20003a(eh0.f37242h, nj0.f52817l, tj3Var, 6);
            int iHashCode = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m = tj3Var.m22132m();
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16VarM21607T);
            se1.f60731q.getClass();
            ui3 ui3Var = C0352b.f4299b;
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, C0352b.f4303f, sj8VarM20003a);
            oha.m18001g(tj3Var, C0352b.f4302e, l77VarM22132m);
            oha.m18001g(tj3Var, C0352b.f4304g, Integer.valueOf(iHashCode));
            oha.m18000f(tj3Var, C0352b.f4305h);
            oha.m18001g(tj3Var, C0352b.f4301d, e16VarM1322c);
            LibraryFastSearch libraryFastSearch = d03Var.f34774a;
            String string2 = libraryFastSearch.f19397d;
            String packageName = context.getPackageName();
            String str = libraryFastSearch.f19396c;
            if (fa4.m11650l(str, FastSearchType.MoreLessons.getValue())) {
                string = context.getString(com.lingq.core.p012ui.R$string.search_all_lessons);
                string.getClass();
            } else if (fa4.m11650l(str, FastSearchType.MoreCourses.getValue())) {
                string = context.getString(com.lingq.core.p012ui.R$string.search_all_courses);
                string.getClass();
            } else if (fa4.m11650l(str, FastSearchType.Accent.getValue())) {
                int identifier = context.getResources().getIdentifier("feed_topics_" + string2, "string", packageName);
                if (identifier != 0) {
                    string = AbstractC3393o1.m17735j(context.getString(com.lingq.core.p012ui.R$string.accent), ": ", context.getString(identifier));
                } else {
                    String string3 = context.getString(com.lingq.core.p012ui.R$string.accent);
                    if (string2.length() > 0) {
                        StringBuilder sb = new StringBuilder();
                        String strValueOf = String.valueOf(string2.charAt(0));
                        strValueOf.getClass();
                        String upperCase = strValueOf.toUpperCase(Locale.ROOT);
                        upperCase.getClass();
                        sb.append((Object) upperCase);
                        sb.append(string2.substring(1));
                        string2 = sb.toString();
                    }
                    string = AbstractC3393o1.m17735j(string3, ": ", string2);
                }
            } else if (fa4.m11650l(str, FastSearchType.Shelf.getValue())) {
                int identifier2 = context.getResources().getIdentifier("feed_topics_" + string2, "string", packageName);
                if (identifier2 != 0) {
                    string = context.getString(com.lingq.core.p012ui.R$string.search_see_all, context.getString(identifier2));
                } else {
                    int i = com.lingq.core.p012ui.R$string.search_see_all;
                    String strM4839V = cl9.m4839V(string2, "_", " ");
                    if (strM4839V.length() > 0) {
                        StringBuilder sb2 = new StringBuilder();
                        String strValueOf2 = String.valueOf(strM4839V.charAt(0));
                        strValueOf2.getClass();
                        String upperCase2 = strValueOf2.toUpperCase(Locale.ROOT);
                        upperCase2.getClass();
                        sb2.append((Object) upperCase2);
                        sb2.append(strM4839V.substring(1));
                        strM4839V = sb2.toString();
                    }
                    string = context.getString(i, strM4839V);
                }
                string.getClass();
            } else {
                string = "";
            }
            String str2 = string;
            vh9 vh9Var = ps5.f56764b;
            lw9.m16554b(str2, null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ms5) tj3Var.m22128k(vh9Var)).f51800b.f71406j, tj3Var, 0, 0, 131070);
            ty3.m22351a(n7d.m17276b(), null, null, ((ms5) tj3Var.m22128k(vh9Var)).f51799a.f55875s, tj3Var, 48, 4);
            tj3Var.m22139q(true);
        } else {
            tj3Var.m22102U();
        }
        return xfa.f68157a;
    }

    /* JADX INFO: renamed from: m */
    private final Object m15129m(Object obj, Object obj2, Object obj3) {
        ns3 ns3Var = (ns3) this.f47054b;
        vi3 vi3Var = (vi3) this.f47055c;
        ye1 ye1Var = (ye1) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((ft4) obj).getClass();
        tj3 tj3Var = (tj3) ye1Var;
        if (tj3Var.m22099R(iIntValue & 1, (iIntValue & 17) != 16)) {
            String strM23620a0 = vz1.m23620a0(tj3Var, ns3Var.f53180a);
            String strM23620a1 = vz1.m23620a0(tj3Var, ns3Var.f53181b);
            boolean zM22120g = tj3Var.m22120g(vi3Var) | tj3Var.m22120g(ns3Var);
            Object objM22097O = tj3Var.m22097O();
            if (zM22120g || objM22097O == we1.f66679a) {
                objM22097O = new C3577sk(24, vi3Var, ns3Var);
                tj3Var.m22131l0(objM22097O);
            }
            ls3.m16523a(0, 1, tj3Var, (ui3) objM22097O, null, strM23620a0, strM23620a1);
        } else {
            tj3Var.m22102U();
        }
        return xfa.f68157a;
    }

    /* JADX INFO: renamed from: n */
    private final Object m15130n(Object obj, Object obj2, Object obj3) {
        ra4 ra4Var = (ra4) this.f47054b;
        vi3 vi3Var = (vi3) this.f47055c;
        ye1 ye1Var = (ye1) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((ft4) obj).getClass();
        tj3 tj3Var = (tj3) ye1Var;
        if (tj3Var.m22099R(iIntValue & 1, (iIntValue & 17) != 16)) {
            String str = ra4Var.f58965d;
            boolean zM22120g = tj3Var.m22120g(vi3Var);
            Object objM22097O = tj3Var.m22097O();
            p84 p84Var = we1.f66679a;
            if (zM22120g || objM22097O == p84Var) {
                objM22097O = new nw1(vi3Var, 24);
                tj3Var.m22131l0(objM22097O);
            }
            ui3 ui3Var = (ui3) objM22097O;
            boolean zM22120g2 = tj3Var.m22120g(vi3Var);
            Object objM22097O2 = tj3Var.m22097O();
            if (zM22120g2 || objM22097O2 == p84Var) {
                objM22097O2 = new nw1(vi3Var, 25);
                tj3Var.m22131l0(objM22097O2);
            }
            igd.m13905d(null, str, ui3Var, (ui3) objM22097O2, tj3Var, 0);
        } else {
            tj3Var.m22102U();
        }
        return xfa.f68157a;
    }

    /* JADX INFO: renamed from: o */
    private final Object m15131o(Object obj, Object obj2, Object obj3) {
        zh9 zh9Var = (zh9) this.f47054b;
        zi3 zi3Var = (zi3) this.f47055c;
        ye1 ye1Var = (ye1) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((ft4) obj).getClass();
        tj3 tj3Var = (tj3) ye1Var;
        if (!tj3Var.m22099R(iIntValue & 1, (iIntValue & 17) != 16)) {
            tj3Var.m22102U();
        } else if (zh9Var instanceof xh9) {
            tj3Var.m22111b0(-229125419);
            yhd.m25146b(null, 1, null, tj3Var, 48, 5);
            tj3Var.m22139q(false);
        } else if (zh9Var instanceof yh9) {
            tj3Var.m22111b0(-228981517);
            String strM23620a0 = vz1.m23620a0(tj3Var, com.lingq.core.p012ui.R$string.stats_coins_earned);
            yh9 yh9Var = (yh9) zh9Var;
            LanguageProgressPeriod languageProgressPeriod = yh9Var.f69852a;
            bh9 bh9Var = yh9Var.f69853b;
            boolean zM22124i = tj3Var.m22124i(zh9Var) | tj3Var.m22120g(zi3Var);
            Object objM22097O = tj3Var.m22097O();
            if (zM22124i || objM22097O == we1.f66679a) {
                objM22097O = new ke2(12, zh9Var, zi3Var);
                tj3Var.m22131l0(objM22097O);
            }
            yhd.m25150f(true, true, strM23620a0, languageProgressPeriod, bh9Var, null, (vi3) objM22097O, tj3Var, 54, 32);
            tj3Var.m22139q(false);
        } else {
            tj3Var.m22111b0(-228296324);
            tj3Var.m22139q(false);
        }
        return xfa.f68157a;
    }

    /* JADX INFO: renamed from: p */
    private final Object m15132p(Object obj, Object obj2, Object obj3) {
        ko4 ko4Var = (ko4) this.f47054b;
        zi3 zi3Var = (zi3) this.f47055c;
        ye1 ye1Var = (ye1) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((ft4) obj).getClass();
        tj3 tj3Var = (tj3) ye1Var;
        if (tj3Var.m22099R(iIntValue & 1, (iIntValue & 17) != 16)) {
            bid.m3748d((jo4) ko4Var, zi3Var, tj3Var, 0);
        } else {
            tj3Var.m22102U();
        }
        return xfa.f68157a;
    }

    /* JADX INFO: renamed from: q */
    private final Object m15133q(Object obj, Object obj2, Object obj3) {
        float f;
        n4b n4bVar = (n4b) this.f47054b;
        rn4 rn4Var = (rn4) this.f47055c;
        ye1 ye1Var = (ye1) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((vv4) obj).getClass();
        tj3 tj3Var = (tj3) ye1Var;
        if (tj3Var.m22099R(iIntValue & 1, (iIntValue & 17) != 16)) {
            e16 e16VarM4412e = c99.m4412e(b16.f7762a, 1.0f);
            if (fy9.m12247b(n4bVar)) {
                tj3Var.m22111b0(-423545329);
                f = ((fe9) tj3Var.m22128k(ge9.f40637a)).f38956e;
                tj3Var.m22139q(false);
            } else {
                tj3Var.m22111b0(-423457754);
                tj3Var.m22139q(false);
                f = 0.0f;
            }
            w4d.m23758a(AbstractC3584sr.m21611X(e16VarM4412e, 0.0f, f, 0.0f, 0.0f, 13), rn4Var.f59579a, tj3Var, 0);
        } else {
            tj3Var.m22102U();
        }
        return xfa.f68157a;
    }

    /* JADX INFO: renamed from: r */
    private final Object m15134r(Object obj, Object obj2, Object obj3) {
        dt0 dt0Var = (dt0) this.f47054b;
        zi3 zi3Var = (zi3) this.f47055c;
        ye1 ye1Var = (ye1) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((db1) obj).getClass();
        tj3 tj3Var = (tj3) ye1Var;
        if (tj3Var.m22099R(iIntValue & 1, (iIntValue & 17) != 16)) {
            b16 b16Var = b16.f7762a;
            e16 e16VarM21609V = AbstractC3584sr.m21609V(c99.m4429v(b16Var), 0.0f, ((fe9) tj3Var.m22128k(ge9.f40637a)).f38952a, 1);
            bb1 bb1VarM230a = ab1.m230a(eh0.f37238d, nj0.f52791J, tj3Var, 0);
            int iHashCode = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m = tj3Var.m22132m();
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16VarM21609V);
            se1.f60731q.getClass();
            ui3 ui3Var = C0352b.f4299b;
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, C0352b.f4303f, bb1VarM230a);
            oha.m18001g(tj3Var, C0352b.f4302e, l77VarM22132m);
            oha.m18001g(tj3Var, C0352b.f4304g, Integer.valueOf(iHashCode));
            oha.m18000f(tj3Var, C0352b.f4305h);
            oha.m18001g(tj3Var, C0352b.f4301d, e16VarM1322c);
            if (dt0Var instanceof ct0) {
                tj3Var.m22111b0(-572945871);
                Iterator it = ((ct0) dt0Var).f34502a.iterator();
                while (it.hasNext()) {
                    r5d.m20417a((Challenge) it.next(), zi3Var, tj3Var, 0);
                    thb.m22044c(tj3Var, c99.m4414g(b16Var, ((fe9) tj3Var.m22128k(ge9.f40637a)).f38952a));
                }
                tj3Var.m22139q(false);
            } else {
                tj3Var.m22111b0(-572600965);
                cid.m4761l(tj3Var, 0);
                tj3Var.m22139q(false);
            }
            tj3Var.m22139q(true);
        } else {
            tj3Var.m22102U();
        }
        return xfa.f68157a;
    }

    /* JADX INFO: renamed from: s */
    private final Object m15135s(Object obj, Object obj2, Object obj3) {
        int i;
        Context context;
        boolean z;
        boolean z2;
        a85 a85Var = (a85) this.f47054b;
        Context context2 = (Context) this.f47055c;
        ye1 ye1Var = (ye1) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((db1) obj).getClass();
        tj3 tj3Var = (tj3) ye1Var;
        if (!tj3Var.m22099R(iIntValue & 1, (iIntValue & 17) != 16)) {
            tj3Var.m22102U();
        } else if (a85Var instanceof z75) {
            tj3Var.m22111b0(-1444821142);
            z75 z75Var = (z75) a85Var;
            wy5 wy5Var = z75Var.f71018a;
            e41 e41Var = eh0.f37240f;
            ec0 ec0Var = nj0.f52792K;
            bb1 bb1VarM230a = ab1.m230a(e41Var, ec0Var, tj3Var, 54);
            int iHashCode = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m = tj3Var.m22132m();
            b16 b16Var = b16.f7762a;
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, b16Var);
            se1.f60731q.getClass();
            ui3 ui3Var = C0352b.f4299b;
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var);
            } else {
                tj3Var.m22137o0();
            }
            zi3 zi3Var = C0352b.f4303f;
            oha.m18001g(tj3Var, zi3Var, bb1VarM230a);
            zi3 zi3Var2 = C0352b.f4302e;
            oha.m18001g(tj3Var, zi3Var2, l77VarM22132m);
            Integer numValueOf = Integer.valueOf(iHashCode);
            zi3 zi3Var3 = C0352b.f4304g;
            oha.m18001g(tj3Var, zi3Var3, numValueOf);
            vi3 vi3Var = C0352b.f4305h;
            oha.m18000f(tj3Var, vi3Var);
            zi3 zi3Var4 = C0352b.f4301d;
            oha.m18001g(tj3Var, zi3Var4, e16VarM1322c);
            e16 e16VarM21609V = AbstractC3584sr.m21609V(c99.m4429v(c99.m4412e(b16Var, 1.0f)), 0.0f, ge9.m12515a(tj3Var).f38956e, 1);
            sj8 sj8VarM20003a = qj8.m20003a(eh0.f37241g, nj0.f52789H, tj3Var, 54);
            int iHashCode2 = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m2 = tj3Var.m22132m();
            e16 e16VarM1322c2 = AbstractC0287b.m1322c(tj3Var, e16VarM21609V);
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, zi3Var, sj8VarM20003a);
            oha.m18001g(tj3Var, zi3Var2, l77VarM22132m2);
            AbstractC3393o1.m17747v(iHashCode2, tj3Var, zi3Var3, tj3Var, vi3Var);
            oha.m18001g(tj3Var, zi3Var4, e16VarM1322c2);
            e16 e16VarM4430w = c99.m4430w(b16Var, null, 3);
            gc0 gc0Var = nj0.f52812g;
            ht5 ht5VarM19966d = qh0.m19966d(gc0Var, false);
            int iHashCode3 = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m3 = tj3Var.m22132m();
            e16 e16VarM1322c3 = AbstractC0287b.m1322c(tj3Var, e16VarM4430w);
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, zi3Var, ht5VarM19966d);
            oha.m18001g(tj3Var, zi3Var2, l77VarM22132m3);
            AbstractC3393o1.m17747v(iHashCode3, tj3Var, zi3Var3, tj3Var, vi3Var);
            oha.m18001g(tj3Var, zi3Var4, e16VarM1322c3);
            boolean zM22124i = tj3Var.m22124i(a85Var);
            Object objM22097O = tj3Var.m22097O();
            if (zM22124i || objM22097O == we1.f66679a) {
                objM22097O = new sk4(a85Var, 1);
                tj3Var.m22131l0(objM22097O);
            }
            dn7.m10493b((ui3) objM22097O, AbstractC3584sr.m21607T(c99.m4414g(c99.m4426s(b16Var, 180.0f), 180.0f), ge9.m12515a(tj3Var).f38956e), ss5.m21716l(wy5Var), 10.0f, 0L, 0, 6.0f, tj3Var, 1575936, 48);
            bb1 bb1VarM230a2 = ab1.m230a(e41Var, ec0Var, tj3Var, 54);
            int iHashCode4 = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m4 = tj3Var.m22132m();
            e16 e16VarM1322c4 = AbstractC0287b.m1322c(tj3Var, b16Var);
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, zi3Var, bb1VarM230a2);
            oha.m18001g(tj3Var, zi3Var2, l77VarM22132m4);
            AbstractC3393o1.m17747v(iHashCode4, tj3Var, zi3Var3, tj3Var, vi3Var);
            oha.m18001g(tj3Var, zi3Var4, e16VarM1322c4);
            lw9.m16554b(String.valueOf(z75Var.f71021d), null, 0L, null, 0L, null, null, 0L, null, new ks9(3), 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var).f71401e, tj3Var, 0, 0, 130046);
            g4d.m12360a(vz1.m23620a0(tj3Var, com.lingq.core.p012ui.R$string.stats_known_words), null, 0L, new ks9(3), 0L, 0, false, 1, null, null, tj3Var, 12582912, 886);
            tj3 tj3Var2 = tj3Var;
            tj3Var2.m22139q(true);
            tj3Var2.m22139q(true);
            if (wy5Var != null) {
                tj3Var2.m22111b0(-14901911);
                bb1 bb1VarM230a3 = ab1.m230a(e41Var, ec0Var, tj3Var2, 54);
                int iHashCode5 = Long.hashCode(tj3Var2.f62385T);
                l77 l77VarM22132m5 = tj3Var2.m22132m();
                e16 e16VarM1322c5 = AbstractC0287b.m1322c(tj3Var2, b16Var);
                tj3Var2.m22119f0();
                if (tj3Var2.f62384S) {
                    tj3Var2.m22130l(ui3Var);
                } else {
                    tj3Var2.m22137o0();
                }
                oha.m18001g(tj3Var2, zi3Var, bb1VarM230a3);
                oha.m18001g(tj3Var2, zi3Var2, l77VarM22132m5);
                AbstractC3393o1.m17747v(iHashCode5, tj3Var2, zi3Var3, tj3Var2, vi3Var);
                oha.m18001g(tj3Var2, zi3Var4, e16VarM1322c5);
                context = context2;
                String upperCase = AbstractC3423or.m18229N(wy5Var, context).toUpperCase(Locale.ROOT);
                upperCase.getClass();
                i = 2;
                lw9.m16554b(upperCase, null, 0L, null, 0L, null, null, 0L, null, new ks9(3), 0L, 0, false, 0, 0, null, vx9.m23584b(p58.m18902j(tj3Var2).f71407k, 0L, 0L, null, null, null, d32.m10032c0(0.1f, 8589934592L), null, null, 0, 0L, null, 16777087), tj3Var2, 0, 0, 130046);
                tj3Var2 = tj3Var2;
                bq1.m4042R(AbstractC3423or.m18236U(ss5.m21679D(context, "ic_level_" + wy5Var.f67522c), tj3Var2, 0), AbstractC3423or.m18229N(wy5Var, context), te1.m21995i(1.0f, c99.m4422o(AbstractC3584sr.m21609V(b16Var, ge9.m12515a(tj3Var2).f38957f, 0.0f, 2), 100.0f), false), gc0Var, hl1.f42565b, 0.0f, null, tj3Var2, 27656, 96);
                z = true;
                tj3Var2.m22139q(true);
                tj3Var2.m22139q(false);
            } else {
                i = 2;
                context = context2;
                z = true;
                tj3Var2.m22111b0(-13306651);
                tj3Var2.m22139q(false);
            }
            tj3Var2.m22139q(z);
            Integer num = z75Var.f71022e;
            if (num != null) {
                tj3Var2.m22111b0(2037409212);
                String strM23618Z = vz1.m23618Z(com.lingq.feature.statistics.R$string.stats_level_next, new Object[]{num, AbstractC3423or.m18229N(z75Var.f71019b, context)}, tj3Var2);
                String strM23371G0 = vk9.m23371G0(vk9.m23368D0(strM23618Z, "**", strM23618Z), "**");
                tj3Var2.m22111b0(342827976);
                StringBuilder sb = new StringBuilder(16);
                new ArrayList();
                ArrayList arrayList = new ArrayList();
                new ArrayList();
                sb.append(cl9.m4839V(strM23618Z, "**", ""));
                arrayList.add(new C3304ln(vx9.m23584b(p58.m18902j(tj3Var2).f71405i, 0L, 0L, bc3.f8321g, null, null, 0L, null, null, 0, 0L, null, 16777211).f66065a, vk9.m23389l0(strM23618Z, strM23371G0, 0, false, 6) - i, (strM23371G0.length() + vk9.m23389l0(strM23618Z, strM23371G0, 0, false, 6)) - i, 8));
                String string = sb.toString();
                ArrayList arrayList2 = new ArrayList(arrayList.size());
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    arrayList2.add(((C3304ln) arrayList.get(i2)).m16392a(sb.length()));
                }
                C3419on c3419on = new C3419on(string, arrayList2);
                tj3Var2.m22139q(false);
                tj3 tj3Var3 = tj3Var2;
                lw9.m16555c(c3419on, AbstractC3584sr.m21611X(AbstractC3584sr.m21611X(b16Var, 0.0f, 0.0f, 0.0f, ge9.m12515a(tj3Var2).f38957f, 7), 0.0f, 0.0f, 0.0f, ge9.m12515a(tj3Var2).f38952a, 7), 0L, null, 0L, null, null, 0L, new ks9(3), 0L, 0, false, 0, 0, null, null, vx9.m23584b(p58.m18902j(tj3Var2).f71405i, 0L, 0L, bc3.f8323i, null, null, 0L, null, null, 0, 0L, null, 16777211), tj3Var3, 0, 0, 261116);
                tj3Var2 = tj3Var3;
                z2 = false;
                tj3Var2.m22139q(false);
            } else {
                z2 = false;
                tj3Var2.m22111b0(2038613345);
                tj3Var2.m22139q(false);
            }
            tj3Var2.m22139q(true);
            tj3Var2.m22139q(z2);
        } else {
            tj3Var.m22111b0(-1439733949);
            cid.m4761l(tj3Var, 0);
            tj3Var.m22139q(false);
        }
        return xfa.f68157a;
    }

    /* JADX INFO: renamed from: t */
    private final Object m15136t(Object obj, Object obj2, Object obj3) {
        b32 b32Var = (b32) this.f47054b;
        vi3 vi3Var = (vi3) this.f47055c;
        t17 t17Var = (t17) obj;
        ye1 ye1Var = (ye1) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        t17Var.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= ((tj3) ye1Var).m22120g(t17Var) ? 4 : 2;
        }
        tj3 tj3Var = (tj3) ye1Var;
        if (tj3Var.m22099R(iIntValue & 1, (iIntValue & 19) != 18)) {
            AbstractC2572b.m9487d(t17Var, b32Var, vi3Var, tj3Var, iIntValue & 14);
        } else {
            tj3Var.m22102U();
        }
        return xfa.f68157a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v59 */
    /* JADX WARN: Type inference failed for: r4v60, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v62 */
    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Integer numValueOf;
        String str;
        Object obj4;
        boolean z;
        ?? r4;
        tj3 tj3Var;
        int i = this.f47053a;
        int i2 = 25;
        p84 p84Var = we1.f66679a;
        b16 b16Var = b16.f7762a;
        xfa xfaVar = xfa.f68157a;
        Object obj5 = this.f47055c;
        Object obj6 = this.f47054b;
        switch (i) {
            case 0:
                AiVoiceSampleState aiVoiceSampleState = (AiVoiceSampleState) obj6;
                ui3 ui3Var = (ui3) obj5;
                ye1 ye1Var = (ye1) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((db1) obj).getClass();
                tj3 tj3Var2 = (tj3) ye1Var;
                if (tj3Var2.m22099R(iIntValue & 1, (iIntValue & 17) != 16)) {
                    AbstractC3607td.m21959c(aiVoiceSampleState, ui3Var, tj3Var2, 0);
                    String strM23620a0 = vz1.m23620a0(tj3Var2, com.lingq.core.premium.R$string.upgrade_prompt_voices_caption);
                    vh9 vh9Var = ps5.f56764b;
                    lw9.m16554b(strM23620a0, AbstractC3584sr.m21611X(c99.m4412e(b16Var, 1.0f), 0.0f, 0.0f, ((fe9) tj3Var2.m22128k(ge9.f40637a)).f38955d, 0.0f, 11), ((ms5) tj3Var2.m22128k(vh9Var)).f51799a.f55875s, null, 0L, null, null, 0L, null, new ks9(6), 0L, 0, false, 0, 0, null, ((ms5) tj3Var2.m22128k(vh9Var)).f51800b.f71408l, tj3Var2, 0, 0, 130040);
                } else {
                    tj3Var2.m22102U();
                }
                return xfaVar;
            case 1:
                LayoutDirection layoutDirection = (LayoutDirection) obj6;
                C0282a c0282a = (C0282a) obj5;
                ye1 ye1Var2 = (ye1) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                tj3 tj3Var3 = (tj3) ye1Var2;
                if (tj3Var3.m22099R(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    pvc.m19507c(AbstractC0402n.f4822n.mo1265a(layoutDirection), c0282a, tj3Var3, 8);
                } else {
                    tj3Var3.m22102U();
                }
                return xfaVar;
            case 2:
                Badge badge = (Badge) obj6;
                Context context = (Context) obj5;
                ye1 ye1Var3 = (ye1) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                gc0 gc0Var = nj0.f52812g;
                ((db1) obj).getClass();
                tj3 tj3Var4 = (tj3) ye1Var3;
                if (tj3Var4.m22099R(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    b16 b16Var2 = b16.f7762a;
                    e16 e16VarM21611X = AbstractC3584sr.m21611X(te1.m21995i(1.0f, b16Var2, false), 0.0f, 0.0f, 0.0f, ge9.m12515a(tj3Var4).f38957f, 7);
                    bb1 bb1VarM230a = ab1.m230a(eh0.f37238d, nj0.f52792K, tj3Var4, 48);
                    int iHashCode = Long.hashCode(tj3Var4.f62385T);
                    l77 l77VarM22132m = tj3Var4.m22132m();
                    e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var4, e16VarM21611X);
                    se1.f60731q.getClass();
                    ui3 ui3Var2 = C0352b.f4299b;
                    tj3Var4.m22119f0();
                    if (tj3Var4.f62384S) {
                        tj3Var4.m22130l(ui3Var2);
                    } else {
                        tj3Var4.m22137o0();
                    }
                    oha.m18001g(tj3Var4, C0352b.f4303f, bb1VarM230a);
                    oha.m18001g(tj3Var4, C0352b.f4302e, l77VarM22132m);
                    oha.m18001g(tj3Var4, C0352b.f4304g, Integer.valueOf(iHashCode));
                    oha.m18000f(tj3Var4, C0352b.f4305h);
                    oha.m18001g(tj3Var4, C0352b.f4301d, e16VarM1322c);
                    e16 e16VarM21995i = te1.m21995i(1.0f, AbstractC3584sr.m21609V(AbstractC3584sr.m21611X(b16Var2, 0.0f, ge9.m12515a(tj3Var4).f38957f, 0.0f, 0.0f, 13), ge9.m12515a(tj3Var4).f38957f, 0.0f, 2).mo3161g(new as4(1.0f, true)), false);
                    String str2 = badge.f19509c;
                    String str3 = badge.f19509c;
                    String str4 = "ic_" + u91.m22589G0(vk9.m23365A0(str2, new String[]{"."}, 0, 6)) + "_" + u91.m22597O0(vk9.m23365A0(str3, new String[]{"."}, 0, 6));
                    if (vk9.m23380c0(str3, BadgeType.STREAK_DAYS.getSlug(), false)) {
                        numValueOf = Integer.valueOf(ss5.m21683H(context, badge.f19511e));
                    } else {
                        context.getClass();
                        int identifier = context.getResources().getIdentifier(str4, "drawable", context.getPackageName());
                        numValueOf = identifier != 0 ? Integer.valueOf(identifier) : null;
                    }
                    if (numValueOf != null || (str = badge.f19513g) == null || str.length() == 0) {
                        tj3Var4.m22111b0(-506777565);
                        bq1.m4042R(AbstractC3423or.m18236U(numValueOf != null ? numValueOf.intValue() : ss5.m21679D(context, str4), tj3Var4, 0), badge.f19510d, e16VarM21995i, gc0Var, hl1.f42565b, 0.0f, null, tj3Var4, 27656, 96);
                        tj3Var4.m22139q(false);
                    } else {
                        tj3Var4.m22111b0(-507252609);
                        ss5.m21700a(badge.f19513g, badge.f19510d, e16VarM21995i, null, AbstractC3423or.m18236U(ss5.m21679D(context, str4), tj3Var4, 0), AbstractC3423or.m18236U(ss5.m21679D(context, str4), tj3Var4, 0), tj3Var4, 805601280, 6, 63944);
                        tj3Var4.m22139q(false);
                    }
                    g4d.m12360a(badge.f19510d, AbstractC3584sr.m21609V(b16Var2, ge9.m12515a(tj3Var4).f38957f, 0.0f, 2), p58.m18900f(tj3Var4).f55873q, new ks9(3), 0L, 0, false, 2, p58.m18902j(tj3Var4).f71410n, null, tj3Var4, 12582912, 624);
                    tj3Var4.m22139q(true);
                } else {
                    tj3Var4.m22102U();
                }
                return xfaVar;
            case 3:
                fr0 fr0Var = (fr0) obj6;
                vi3 vi3Var = (vi3) obj5;
                ye1 ye1Var4 = (ye1) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ((ft4) obj).getClass();
                tj3 tj3Var5 = (tj3) ye1Var4;
                if (tj3Var5.m22099R(1 & iIntValue4, (iIntValue4 & 17) != 16)) {
                    List list = fr0Var.f39509g;
                    Set set = fr0Var.f39510h;
                    boolean zM22120g = tj3Var5.m22120g(vi3Var);
                    Object objM22097O = tj3Var5.m22097O();
                    if (zM22120g || objM22097O == p84Var) {
                        objM22097O = new te0(vi3Var, 5);
                        tj3Var5.m22131l0(objM22097O);
                    }
                    t4d.m21842c(list, set, (vi3) objM22097O, tj3Var5, 0);
                } else {
                    tj3Var5.m22102U();
                }
                return xfaVar;
            case 4:
                tz0 tz0Var = (tz0) obj6;
                jv0 jv0Var = (jv0) obj5;
                t17 t17Var = (t17) obj;
                ye1 ye1Var5 = (ye1) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                t17Var.getClass();
                if ((iIntValue5 & 6) == 0) {
                    iIntValue5 |= ((tj3) ye1Var5).m22120g(t17Var) ? 4 : 2;
                }
                tj3 tj3Var6 = (tj3) ye1Var5;
                if (tj3Var6.m22099R(1 & iIntValue5, (iIntValue5 & 19) != 18)) {
                    AbstractC0054a.m734i(tz0Var.f63115c, null, null, null, ci8.m4703P(759562593, new ik0(tz0Var, t17Var, jv0Var, 5), tj3Var6), tj3Var6, 24576, 14);
                } else {
                    tj3Var6.m22102U();
                }
                return xfaVar;
            case 5:
                tz0 tz0Var2 = (tz0) obj6;
                nz9 nz9Var = (nz9) obj5;
                ye1 ye1Var6 = (ye1) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                ((tj8) obj).getClass();
                tj3 tj3Var7 = (tj3) ye1Var6;
                if (tj3Var7.m22099R(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    AbstractC2005i.m8900a(tz0Var2.f63115c instanceof ux0, ci8.m4703P(223184073, new C3598t4(7, tz0Var2, nz9Var), tj3Var7), tj3Var7, 48);
                } else {
                    tj3Var7.m22102U();
                }
                return xfaVar;
            case 6:
                jv0 jv0Var2 = (jv0) obj6;
                d87 d87Var = (d87) obj;
                TokenType tokenType = (TokenType) obj2;
                e28 e28Var = (e28) obj3;
                d87Var.getClass();
                tokenType.getClass();
                e28Var.getClass();
                xz7 xz7Var = (xz7) u91.m22591I0(d87Var.f35176e);
                jv0Var2.mo8887n(((ChatMessage) obj5).f18920a, new xz7(d87Var.f35173b, d87Var.f35174c, 0, 0, d87Var.f35175d, d87Var.f35172a, xz7Var != null ? xz7Var.f69010g : 0, xz7Var != null ? xz7Var.f69011h : 0, (String) null, (TokenTransliteration) null, TextTokenType.PHRASE, 0, (Map) null, (String) null, (String) null, (String) null, 260876), tokenType, e28Var);
                return xfaVar;
            case 7:
                ChatMessage chatMessage = (ChatMessage) obj6;
                String str5 = (String) obj5;
                ye1 ye1Var7 = (ye1) obj2;
                ((Integer) obj3).getClass();
                ((InterfaceC0067f) obj).getClass();
                bb1 bb1VarM230a2 = ab1.m230a(eh0.f37238d, nj0.f52791J, ye1Var7, 0);
                tj3 tj3Var8 = (tj3) ye1Var7;
                int iHashCode2 = Long.hashCode(tj3Var8.f62385T);
                l77 l77VarM22132m2 = tj3Var8.m22132m();
                e16 e16VarM1322c2 = AbstractC0287b.m1322c(ye1Var7, b16Var);
                se1.f60731q.getClass();
                ui3 ui3Var3 = C0352b.f4299b;
                tj3 tj3Var9 = (tj3) ye1Var7;
                tj3Var9.m22119f0();
                if (tj3Var9.f62384S) {
                    tj3Var9.m22130l(ui3Var3);
                } else {
                    tj3Var9.m22137o0();
                }
                zi3 zi3Var = C0352b.f4303f;
                oha.m18001g(ye1Var7, zi3Var, bb1VarM230a2);
                zi3 zi3Var2 = C0352b.f4302e;
                oha.m18001g(ye1Var7, zi3Var2, l77VarM22132m2);
                Integer numValueOf2 = Integer.valueOf(iHashCode2);
                zi3 zi3Var3 = C0352b.f4304g;
                oha.m18001g(ye1Var7, zi3Var3, numValueOf2);
                vi3 vi3Var2 = C0352b.f4305h;
                oha.m18000f(ye1Var7, vi3Var2);
                zi3 zi3Var4 = C0352b.f4301d;
                oha.m18001g(ye1Var7, zi3Var4, e16VarM1322c2);
                sj8 sj8VarM20003a = qj8.m20003a(eh0.f37236b, nj0.f52789H, ye1Var7, 48);
                int iHashCode3 = Long.hashCode(tj3Var9.f62385T);
                l77 l77VarM22132m3 = tj3Var9.m22132m();
                e16 e16VarM1322c3 = AbstractC0287b.m1322c(ye1Var7, b16Var);
                tj3Var9.m22119f0();
                if (tj3Var9.f62384S) {
                    tj3Var9.m22130l(ui3Var3);
                } else {
                    tj3Var9.m22137o0();
                }
                oha.m18001g(ye1Var7, zi3Var, sj8VarM20003a);
                oha.m18001g(ye1Var7, zi3Var2, l77VarM22132m3);
                oha.m18001g(ye1Var7, zi3Var3, Integer.valueOf(iHashCode3));
                oha.m18000f(ye1Var7, vi3Var2);
                oha.m18001g(ye1Var7, zi3Var4, e16VarM1322c3);
                y27 y27VarM18236U = AbstractC3423or.m18236U(R$drawable.ic_has_translations_s, ye1Var7, 0);
                String strM23620a1 = vz1.m23620a0(ye1Var7, com.lingq.core.p012ui.R$string.settings_translation);
                long j = p58.m18900f(ye1Var7).f55873q;
                ge9.m12515a(ye1Var7).getClass();
                ty3.m22352b(y27VarM18236U, strM23620a1, c99.m4422o(b16Var, 16.0f), j, ye1Var7, 8, 0);
                thb.m22044c(ye1Var7, c99.m4426s(b16Var, ge9.m12515a(ye1Var7).f38955d));
                lw9.m16554b(str5, null, p58.m18900f(ye1Var7).f55873q, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, p58.m18902j(ye1Var7).f71410n, ye1Var7, 0, 0, 131066);
                tj3Var9.m22139q(true);
                thb.m22044c(ye1Var7, c99.m4414g(b16Var, ge9.m12515a(ye1Var7).f38955d));
                lw9.m16555c(n54.m17229b(chatMessage.f18925f), null, p58.m18900f(ye1Var7).f55875s, null, 0L, new wb3(1), null, 0L, null, 0L, 0, false, 0, 0, null, null, p58.m18902j(ye1Var7).f71407k, ye1Var7, 0, 0, 262106);
                thb.m22044c(ye1Var7, c99.m4414g(b16Var, ge9.m12515a(ye1Var7).f38952a));
                tj3Var9.m22139q(true);
                return xfaVar;
            case 8:
                jv0 jv0Var3 = (jv0) obj6;
                d87 d87Var2 = (d87) obj;
                TokenType tokenType2 = (TokenType) obj2;
                e28 e28Var2 = (e28) obj3;
                d87Var2.getClass();
                tokenType2.getClass();
                e28Var2.getClass();
                xz7 xz7Var2 = (xz7) u91.m22591I0(d87Var2.f35176e);
                jv0Var3.mo8887n(((jw0) obj5).f46240a.f18920a, new xz7(d87Var2.f35173b, d87Var2.f35174c, 0, 0, d87Var2.f35175d, d87Var2.f35172a, xz7Var2 != null ? xz7Var2.f69010g : 0, xz7Var2 != null ? xz7Var2.f69011h : 0, (String) null, (TokenTransliteration) null, TextTokenType.PHRASE, 0, (Map) null, (String) null, (String) null, (String) null, 260876), tokenType2, e28Var2);
                return xfaVar;
            case 9:
                vi3 vi3Var3 = (vi3) obj6;
                rl1 rl1Var = (rl1) obj5;
                ye1 ye1Var8 = (ye1) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                tj3 tj3Var10 = (tj3) ye1Var8;
                if (tj3Var10.m22099R(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                    Object objM22097O2 = tj3Var10.m22097O();
                    if (objM22097O2 == p84Var) {
                        objM22097O2 = new sl1();
                        tj3Var10.m22131l0(objM22097O2);
                    }
                    sl1 sl1Var = (sl1) objM22097O2;
                    sl1Var.f60971a.clear();
                    vi3Var3.invoke(sl1Var);
                    sl1Var.m21446a(rl1Var, tj3Var10, 0);
                } else {
                    tj3Var10.m22102U();
                }
                return xfaVar;
            case 10:
                qt1 qt1Var = (qt1) obj6;
                vi3 vi3Var4 = (vi3) obj5;
                t17 t17Var2 = (t17) obj;
                ye1 ye1Var9 = (ye1) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                t17Var2.getClass();
                if ((iIntValue8 & 6) == 0) {
                    iIntValue8 |= ((tj3) ye1Var9).m22120g(t17Var2) ? 4 : 2;
                }
                tj3 tj3Var11 = (tj3) ye1Var9;
                if (tj3Var11.m22099R(iIntValue8 & 1, (iIntValue8 & 19) != 18)) {
                    e16 e16VarM21606S = AbstractC3584sr.m21606S(c99.m4411d(b16Var, 1.0f), t17Var2);
                    ht5 ht5VarM19966d = qh0.m19966d(nj0.f52809d, false);
                    int iHashCode4 = Long.hashCode(tj3Var11.f62385T);
                    l77 l77VarM22132m4 = tj3Var11.m22132m();
                    e16 e16VarM1322c4 = AbstractC0287b.m1322c(tj3Var11, e16VarM21606S);
                    se1.f60731q.getClass();
                    ui3 ui3Var4 = C0352b.f4299b;
                    tj3Var11.m22119f0();
                    if (tj3Var11.f62384S) {
                        tj3Var11.m22130l(ui3Var4);
                    } else {
                        tj3Var11.m22137o0();
                    }
                    zi3 zi3Var5 = C0352b.f4303f;
                    oha.m18001g(tj3Var11, zi3Var5, ht5VarM19966d);
                    zi3 zi3Var6 = C0352b.f4302e;
                    oha.m18001g(tj3Var11, zi3Var6, l77VarM22132m4);
                    Integer numValueOf3 = Integer.valueOf(iHashCode4);
                    zi3 zi3Var7 = C0352b.f4304g;
                    oha.m18001g(tj3Var11, zi3Var7, numValueOf3);
                    vi3 vi3Var5 = C0352b.f4305h;
                    oha.m18000f(tj3Var11, vi3Var5);
                    zi3 zi3Var8 = C0352b.f4301d;
                    oha.m18001g(tj3Var11, zi3Var8, e16VarM1322c4);
                    e16 e16VarM3912B0 = bna.m3912B0(c99.m4412e(ox1.m18559e(b16Var), 1.0f), bna.m3972r0(tj3Var11), false, 14);
                    zf1 zf1Var = ge9.f40637a;
                    e16 e16VarM21607T = AbstractC3584sr.m21607T(e16VarM3912B0, ((fe9) tj3Var11.m22128k(zf1Var)).f38960i);
                    bb1 bb1VarM230a3 = ab1.m230a(new C3661uu(((fe9) tj3Var11.m22128k(zf1Var)).f38957f, true, new gm5(28)), nj0.f52791J, tj3Var11, 0);
                    int iHashCode5 = Long.hashCode(tj3Var11.f62385T);
                    l77 l77VarM22132m5 = tj3Var11.m22132m();
                    e16 e16VarM1322c5 = AbstractC0287b.m1322c(tj3Var11, e16VarM21607T);
                    tj3Var11.m22119f0();
                    if (tj3Var11.f62384S) {
                        tj3Var11.m22130l(ui3Var4);
                    } else {
                        tj3Var11.m22137o0();
                    }
                    oha.m18001g(tj3Var11, zi3Var5, bb1VarM230a3);
                    oha.m18001g(tj3Var11, zi3Var6, l77VarM22132m5);
                    AbstractC3393o1.m17747v(iHashCode5, tj3Var11, zi3Var7, tj3Var11, vi3Var5);
                    oha.m18001g(tj3Var11, zi3Var8, e16VarM1322c5);
                    fz1 fz1Var = qt1Var.f58176b;
                    List list2 = qt1Var.f58178d;
                    if (fz1Var == null) {
                        tj3Var11.m22111b0(1627807416);
                        tj3Var11.m22139q(false);
                    } else {
                        tj3Var11.m22111b0(1627807417);
                        fad.m11681d(null, null, ci8.m4703P(302472960, new se0(fz1Var, 9), tj3Var11), tj3Var11, 384, 3);
                        AbstractC1976c.m8831n(fz1Var, tj3Var11, 0);
                        int i3 = pt1.f56778a[fz1Var.f39949e.ordinal()];
                        if (i3 != 1) {
                            if (i3 == 2) {
                                tj3Var11.m22111b0(-291484904);
                                fad.m11679b(null, tj3Var11, 0);
                                tj3Var11.m22139q(false);
                            } else {
                                if (i3 != 3 && i3 != 4) {
                                    throw ux5.m23001x(tj3Var11, -291491592, false);
                                }
                                tj3Var11.m22111b0(-291481876);
                                tj3Var11.m22139q(false);
                            }
                            z = false;
                        } else {
                            tj3Var11.m22111b0(-291488629);
                            boolean zM22120g2 = tj3Var11.m22120g(vi3Var4);
                            Object objM22097O3 = tj3Var11.m22097O();
                            if (zM22120g2 || objM22097O3 == p84Var) {
                                obj4 = objM22097O3;
                                f91 f91Var = new f91(vi3Var4, 25);
                                tj3Var11.m22131l0(f91Var);
                                obj4 = f91Var;
                            }
                            z = false;
                            fad.m11678a(0, tj3Var11, (ui3) obj4, null);
                            tj3Var11.m22139q(false);
                        }
                        tj3Var11.m22139q(z);
                    }
                    if (qt1Var.f58177c.isEmpty()) {
                        r4 = 0;
                        tj3Var11.m22111b0(1628751677);
                        tj3Var11.m22139q(false);
                        tj3Var = tj3Var11;
                    } else {
                        tj3Var11.m22111b0(1628398029);
                        String upperCase = vz1.m23620a0(tj3Var11, R$string.cup_todays_multipliers).toUpperCase(Locale.ROOT);
                        upperCase.getClass();
                        lw9.m16554b(upperCase, null, xs1.f68608a, null, 0L, null, bc3.f8323i, 0L, null, null, 0L, 0, false, 0, 0, null, ((ms5) tj3Var11.m22128k(ps5.f56764b)).f51800b.f71404h, tj3Var11, 1573248, 0, 131002);
                        q9d.m19829a(qt1Var.f58177c, null, false, tj3Var11, 0, 6);
                        tj3 tj3Var12 = tj3Var11;
                        r4 = 0;
                        tj3Var12.m22139q(false);
                        tj3Var = tj3Var12;
                    }
                    if (list2.isEmpty()) {
                        tj3Var.m22111b0(1628865757);
                        tj3Var.m22139q(r4);
                    } else {
                        tj3Var.m22111b0(1628799448);
                        AbstractC1976c.m8832o(list2, tj3Var, r4);
                        tj3Var.m22139q(r4);
                    }
                    tj3Var.m22139q(true);
                    tj3Var.m22139q(true);
                } else {
                    tj3Var11.m22102U();
                }
                return xfaVar;
            case 11:
                ui3 ui3Var5 = (ui3) obj5;
                ru1 ru1Var = (ru1) obj6;
                ye1 ye1Var10 = (ye1) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                ((db1) obj).getClass();
                tj3 tj3Var13 = (tj3) ye1Var10;
                if (tj3Var13.m22099R(iIntValue9 & 1, (iIntValue9 & 17) != 16)) {
                    e16 e16VarM21608U = AbstractC3584sr.m21608U(AbstractC0080f.m815b(null, false, ui3Var5, c99.m4412e(b16Var, 1.0f), 15), ge9.m12515a(tj3Var13).f38958g, ge9.m12515a(tj3Var13).f38956e);
                    C3661uu c3661uu = new C3661uu(ge9.m12515a(tj3Var13).f38952a, true, new gm5(28));
                    fc0 fc0Var = nj0.f52789H;
                    sj8 sj8VarM20003a2 = qj8.m20003a(c3661uu, fc0Var, tj3Var13, 48);
                    int iHashCode6 = Long.hashCode(tj3Var13.f62385T);
                    l77 l77VarM22132m6 = tj3Var13.m22132m();
                    e16 e16VarM1322c6 = AbstractC0287b.m1322c(tj3Var13, e16VarM21608U);
                    se1.f60731q.getClass();
                    ui3 ui3Var6 = C0352b.f4299b;
                    tj3Var13.m22119f0();
                    if (tj3Var13.f62384S) {
                        tj3Var13.m22130l(ui3Var6);
                    } else {
                        tj3Var13.m22137o0();
                    }
                    zi3 zi3Var9 = C0352b.f4303f;
                    oha.m18001g(tj3Var13, zi3Var9, sj8VarM20003a2);
                    zi3 zi3Var10 = C0352b.f4302e;
                    oha.m18001g(tj3Var13, zi3Var10, l77VarM22132m6);
                    Integer numValueOf4 = Integer.valueOf(iHashCode6);
                    zi3 zi3Var11 = C0352b.f4304g;
                    oha.m18001g(tj3Var13, zi3Var11, numValueOf4);
                    vi3 vi3Var6 = C0352b.f4305h;
                    oha.m18000f(tj3Var13, vi3Var6);
                    zi3 zi3Var12 = C0352b.f4301d;
                    lw9.m16554b(vz1.m23620a0(tj3Var13, R$string.cup_results_top_rankings), e65.m10871c(tj3Var13, e16VarM1322c6, zi3Var12, 1.0f, true), p58.m18900f(tj3Var13).f55873q, null, 0L, null, bc3.f8323i, 0L, null, null, 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var13).f71404h, tj3Var13, 1572864, 0, 131000);
                    sj8 sj8VarM20003a3 = qj8.m20003a(new C3661uu(ge9.m12515a(tj3Var13).f38955d, true, new gm5(28)), fc0Var, tj3Var13, 48);
                    int iHashCode7 = Long.hashCode(tj3Var13.f62385T);
                    l77 l77VarM22132m7 = tj3Var13.m22132m();
                    e16 e16VarM1322c7 = AbstractC0287b.m1322c(tj3Var13, b16Var);
                    tj3Var13.m22119f0();
                    if (tj3Var13.f62384S) {
                        tj3Var13.m22130l(ui3Var6);
                    } else {
                        tj3Var13.m22137o0();
                    }
                    oha.m18001g(tj3Var13, zi3Var9, sj8VarM20003a3);
                    oha.m18001g(tj3Var13, zi3Var10, l77VarM22132m7);
                    AbstractC3393o1.m17747v(iHashCode7, tj3Var13, zi3Var11, tj3Var13, vi3Var6);
                    oha.m18001g(tj3Var13, zi3Var12, e16VarM1322c7);
                    lw9.m16554b(vz1.m23620a0(tj3Var13, R$string.cup_see_all), null, p58.m18900f(tj3Var13).f55875s, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var13).f71406j, tj3Var13, 0, 0, 131066);
                    ty3.m22351a(ihd.m13932a(), null, null, p58.m18900f(tj3Var13).f55875s, tj3Var13, 48, 4);
                    tj3Var13.m22139q(true);
                    tj3Var13.m22139q(true);
                    pb1.m19031a(0.0f, 0, 3, p58.m18900f(tj3Var13).f55817B, tj3Var13, null);
                    x9d.m24422e("", null, true, false, tj3Var13, 390, 10);
                    pb1.m19031a(0.0f, 0, 3, p58.m18900f(tj3Var13).f55817B, tj3Var13, null);
                    List listM22615g1 = u91.m22615g1(ru1Var.f59824m, 5);
                    int i4 = 0;
                    for (Object obj7 : listM22615g1) {
                        int i5 = i4 + 1;
                        if (i4 < 0) {
                            vz1.m23628e0();
                            throw null;
                        }
                        s9d.m21183b((et1) obj7, true, null, tj3Var13, 48);
                        if (i4 != listM22615g1.size() - 1) {
                            tj3Var13.m22111b0(822648991);
                            pb1.m19031a(0.0f, 0, 3, ((ms5) tj3Var13.m22128k(ps5.f56764b)).f51799a.f55817B, tj3Var13, null);
                            tj3Var13.m22139q(false);
                        } else {
                            tj3Var13.m22111b0(822744130);
                            tj3Var13.m22139q(false);
                        }
                        i4 = i5;
                    }
                } else {
                    tj3Var13.m22102U();
                }
                return xfaVar;
            case 12:
                ru1 ru1Var2 = (ru1) obj6;
                String str6 = (String) obj5;
                ye1 ye1Var11 = (ye1) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                ((db1) obj).getClass();
                tj3 tj3Var14 = (tj3) ye1Var11;
                if (tj3Var14.m22099R(iIntValue10 & 1, (iIntValue10 & 17) != 16)) {
                    e16 e16VarM21607T2 = AbstractC3584sr.m21607T(b16Var, ge9.m12515a(tj3Var14).f38958g);
                    sj8 sj8VarM20003a4 = qj8.m20003a(new C3661uu(ge9.m12515a(tj3Var14).f38956e, true, new gm5(28)), nj0.f52789H, tj3Var14, 48);
                    int iHashCode8 = Long.hashCode(tj3Var14.f62385T);
                    l77 l77VarM22132m8 = tj3Var14.m22132m();
                    e16 e16VarM1322c8 = AbstractC0287b.m1322c(tj3Var14, e16VarM21607T2);
                    se1.f60731q.getClass();
                    ui3 ui3Var7 = C0352b.f4299b;
                    tj3Var14.m22119f0();
                    if (tj3Var14.f62384S) {
                        tj3Var14.m22130l(ui3Var7);
                    } else {
                        tj3Var14.m22137o0();
                    }
                    zi3 zi3Var13 = C0352b.f4303f;
                    oha.m18001g(tj3Var14, zi3Var13, sj8VarM20003a4);
                    zi3 zi3Var14 = C0352b.f4302e;
                    oha.m18001g(tj3Var14, zi3Var14, l77VarM22132m8);
                    Integer numValueOf5 = Integer.valueOf(iHashCode8);
                    zi3 zi3Var15 = C0352b.f4304g;
                    oha.m18001g(tj3Var14, zi3Var15, numValueOf5);
                    vi3 vi3Var7 = C0352b.f4305h;
                    oha.m18000f(tj3Var14, vi3Var7);
                    zi3 zi3Var16 = C0352b.f4301d;
                    oha.m18001g(tj3Var14, zi3Var16, e16VarM1322c8);
                    r9d.m20481c(48, tj3Var14, c99.m4422o(b16Var, 40.0f), ru1Var2.f59814c);
                    as4 as4Var = new as4(1.0f, true);
                    bb1 bb1VarM230a4 = ab1.m230a(new C3661uu(ge9.m12515a(tj3Var14).f38954c, true, new gm5(28)), nj0.f52791J, tj3Var14, 0);
                    int iHashCode9 = Long.hashCode(tj3Var14.f62385T);
                    l77 l77VarM22132m9 = tj3Var14.m22132m();
                    e16 e16VarM1322c9 = AbstractC0287b.m1322c(tj3Var14, as4Var);
                    tj3Var14.m22119f0();
                    if (tj3Var14.f62384S) {
                        tj3Var14.m22130l(ui3Var7);
                    } else {
                        tj3Var14.m22137o0();
                    }
                    oha.m18001g(tj3Var14, zi3Var13, bb1VarM230a4);
                    oha.m18001g(tj3Var14, zi3Var14, l77VarM22132m9);
                    AbstractC3393o1.m17747v(iHashCode9, tj3Var14, zi3Var15, tj3Var14, vi3Var7);
                    oha.m18001g(tj3Var14, zi3Var16, e16VarM1322c9);
                    int i6 = R$string.cup_results_team_finished;
                    Integer num = ru1Var2.f59815d;
                    lw9.m16554b(vz1.m23618Z(i6, new Object[]{Integer.valueOf(num != null ? num.intValue() : 0), Integer.valueOf(ru1Var2.f59816e)}, tj3Var14), null, xs1.f68608a, null, 0L, null, bc3.f8323i, 0L, null, null, 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var14).f71404h, tj3Var14, 1573248, 0, 131002);
                    lw9.m16554b(vz1.m23618Z(R$string.cup_results_team, new Object[]{str6}, tj3Var14), null, p58.m18900f(tj3Var14).f55875s, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var14).f71407k, tj3Var14, 0, 0, 131066);
                    tj3Var14.m22139q(true);
                    ty3.m22351a(ihd.m13932a(), null, null, p58.m18900f(tj3Var14).f55875s, tj3Var14, 48, 4);
                    tj3Var14.m22139q(true);
                } else {
                    tj3Var14.m22102U();
                }
                return xfaVar;
            case 13:
                lv1 lv1Var = (lv1) obj6;
                C0282a c0282a2 = (C0282a) obj5;
                db1 db1Var = (db1) obj;
                ye1 ye1Var12 = (ye1) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                db1Var.getClass();
                if ((iIntValue11 & 6) == 0) {
                    iIntValue11 |= ((tj3) ye1Var12).m22120g(db1Var) ? 4 : 2;
                }
                tj3 tj3Var15 = (tj3) ye1Var12;
                if (tj3Var15.m22099R(iIntValue11 & 1, (iIntValue11 & 19) != 18)) {
                    rv1.m20857b(lv1Var.f50172c, lv1Var.f50170a, null, tj3Var15, 0);
                    c0282a2.invoke(db1Var, tj3Var15, Integer.valueOf((iIntValue11 & 14) | 48));
                } else {
                    tj3Var15.m22102U();
                }
                return xfaVar;
            case 14:
                return m15125g(obj, obj2, obj3);
            case 15:
                return m15124d(obj, obj2, obj3);
            case 16:
                fz1 fz1Var2 = (fz1) obj6;
                ui3 ui3Var8 = (ui3) obj5;
                ye1 ye1Var13 = (ye1) obj2;
                int iIntValue12 = ((Integer) obj3).intValue();
                ((db1) obj).getClass();
                tj3 tj3Var16 = (tj3) ye1Var13;
                if (tj3Var16.m22099R(iIntValue12 & 1, (iIntValue12 & 17) != 16)) {
                    fad.m11682e(fz1Var2, false, true, tj3Var16, 384, 2);
                    int i7 = ez1.f38100a[fz1Var2.f39949e.ordinal()];
                    if (i7 == 1) {
                        tj3Var16.m22111b0(-154513680);
                        fad.m11678a(0, tj3Var16, ui3Var8, null);
                        tj3Var16.m22139q(false);
                    } else if (i7 == 2) {
                        tj3Var16.m22111b0(-154511297);
                        fad.m11679b(null, tj3Var16, 0);
                        tj3Var16.m22139q(false);
                    } else {
                        if (i7 != 3 && i7 != 4) {
                            throw ux5.m23001x(tj3Var16, -154515676, false);
                        }
                        tj3Var16.m22111b0(-154508525);
                        tj3Var16.m22139q(false);
                    }
                } else {
                    tj3Var16.m22102U();
                }
                return xfaVar;
            case 17:
                return m15126j(obj, obj2, obj3);
            case 18:
                ef2 ef2Var = (ef2) obj6;
                vi3 vi3Var8 = (vi3) obj5;
                ye1 ye1Var14 = (ye1) obj2;
                int iIntValue13 = ((Integer) obj3).intValue();
                ((ft4) obj).getClass();
                tj3 tj3Var17 = (tj3) ye1Var14;
                if (tj3Var17.m22099R(iIntValue13 & 1, (iIntValue13 & 17) != 16)) {
                    AbstractC2059d.m8975k(null, ef2Var.f37166d, ef2Var.f37165c, vi3Var8, tj3Var17, 0);
                } else {
                    tj3Var17.m22102U();
                }
                return xfaVar;
            case 19:
                return m15127k(obj, obj2, obj3);
            case 20:
                return m15128l(obj, obj2, obj3);
            case 21:
                return m15129m(obj, obj2, obj3);
            case 22:
                return m15130n(obj, obj2, obj3);
            case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                return m15131o(obj, obj2, obj3);
            case 24:
                return m15132p(obj, obj2, obj3);
            case 25:
                return m15133q(obj, obj2, obj3);
            case 26:
                return m15134r(obj, obj2, obj3);
            case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                return m15135s(obj, obj2, obj3);
            case 28:
                return m15136t(obj, obj2, obj3);
            default:
                s65 s65Var = (s65) obj6;
                cy4 cy4Var = (cy4) obj5;
                ye1 ye1Var15 = (ye1) obj2;
                int iIntValue14 = ((Integer) obj3).intValue();
                ((vv4) obj).getClass();
                tj3 tj3Var18 = (tj3) ye1Var15;
                if (tj3Var18.m22099R(1 & iIntValue14, (iIntValue14 & 17) != 16)) {
                    qid.m19982b(AbstractC3584sr.m21611X(c99.m4412e(b16Var, 1.0f), 0.0f, 0.0f, 0.0f, ((fe9) tj3Var18.m22128k(ge9.f40637a)).f38957f, 7), ci8.m4703P(-1967250945, new rw1(i2, s65Var, cy4Var), tj3Var18), tj3Var18, 48, 0);
                } else {
                    tj3Var18.m22102U();
                }
                return xfaVar;
        }
    }

    public /* synthetic */ C3180kd(int i, Object obj, Object obj2) {
        this.f47053a = i;
        this.f47054b = obj;
        this.f47055c = obj2;
    }
}
