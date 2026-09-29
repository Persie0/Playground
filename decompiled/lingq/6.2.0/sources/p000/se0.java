package p000;

import androidx.compose.animation.InterfaceC0067f;
import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.node.C0352b;
import androidx.datastore.preferences.protobuf.DescriptorProtos;
import com.lingq.core.domain.model.CoursePlaylistSort;
import com.lingq.core.domain.model.chat.ChatStats;
import com.lingq.core.domain.model.lesson.Lesson;
import com.lingq.core.domain.model.lesson.TokenType;
import com.lingq.core.domain.model.library.LibraryItem;
import com.lingq.core.domain.model.user.Referral;
import com.lingq.core.domain.stats.ActivityScore;
import com.lingq.core.p012ui.ImageSize;
import com.lingq.core.p012ui.R$drawable;
import com.lingq.core.p012ui.challenges.ChallengeType;
import com.lingq.feature.lessoninfo.PlaylistButtonState;
import com.lingq.feature.reader.R$plurals;
import com.lingq.feature.reader.stats.p019ui.components.AbstractC2558b;
import com.lingq.feature.statistics.R$string;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.builders.ListBuilder;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class se0 implements aj3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f60729a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f60730b;

    public /* synthetic */ se0(Object obj, int i) {
        this.f60729a = i;
        this.f60730b = obj;
    }

    /* JADX INFO: renamed from: d */
    private final Object m21292d(Object obj, Object obj2, Object obj3) {
        long jM4213f;
        long jM4213f2;
        ActivityScore activityScore = (ActivityScore) this.f60730b;
        ye1 ye1Var = (ye1) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((tj8) obj).getClass();
        tj3 tj3Var = (tj3) ye1Var;
        if (tj3Var.m22099R(iIntValue & 1, (iIntValue & 17) != 16)) {
            String strM23620a0 = vz1.m23620a0(tj3Var, AbstractC3423or.m18228M(activityScore));
            vx9 vx9Var = p58.m18902j(tj3Var).f71406j;
            int[] iArr = hp4.f42734a;
            int i = iArr[activityScore.ordinal()];
            if (i == 1) {
                tj3Var.m22111b0(-683527304);
                jM4213f = cx2.m9917a(tj3Var).m4213f();
                tj3Var.m22139q(false);
            } else if (i == 2) {
                tj3Var.m22111b0(-683524456);
                jM4213f = cx2.m9917a(tj3Var).m4218k();
                tj3Var.m22139q(false);
            } else if (i == 3) {
                tj3Var.m22111b0(-683521480);
                jM4213f = cx2.m9917a(tj3Var).m4218k();
                tj3Var.m22139q(false);
            } else {
                if (i != 4) {
                    throw ux5.m23001x(tj3Var, -683530229, false);
                }
                tj3Var.m22111b0(-683518537);
                jM4213f = cx2.m9917a(tj3Var).m4212e();
                tj3Var.m22139q(false);
            }
            lw9.m16554b(strM23620a0, null, jM4213f, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, vx9Var, tj3Var, 0, 0, 131066);
            p04 p04VarM17276b = n7d.m17276b();
            String strM23620a1 = vz1.m23620a0(tj3Var, R$string.stats_view_more);
            int i2 = iArr[activityScore.ordinal()];
            if (i2 == 1) {
                tj3Var.m22111b0(-683506728);
                jM4213f2 = cx2.m9917a(tj3Var).m4213f();
                tj3Var.m22139q(false);
            } else if (i2 == 2) {
                tj3Var.m22111b0(-683503880);
                jM4213f2 = cx2.m9917a(tj3Var).m4218k();
                tj3Var.m22139q(false);
            } else if (i2 == 3) {
                tj3Var.m22111b0(-683500904);
                jM4213f2 = cx2.m9917a(tj3Var).m4218k();
                tj3Var.m22139q(false);
            } else {
                if (i2 != 4) {
                    throw ux5.m23001x(tj3Var, -683509653, false);
                }
                tj3Var.m22111b0(-683497961);
                jM4213f2 = cx2.m9917a(tj3Var).m4212e();
                tj3Var.m22139q(false);
            }
            ty3.m22351a(p04VarM17276b, strM23620a1, null, jM4213f2, tj3Var, 0, 4);
        } else {
            tj3Var.m22102U();
        }
        return xfa.f68157a;
    }

    /* JADX INFO: renamed from: g */
    private final Object m21293g(Object obj, Object obj2, Object obj3) {
        z41 z41Var = (z41) this.f60730b;
        ye1 ye1Var = (ye1) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        gc0 gc0Var = nj0.f52813h;
        ((db1) obj).getClass();
        tj3 tj3Var = (tj3) ye1Var;
        if (tj3Var.m22099R(iIntValue & 1, (iIntValue & 17) != 16)) {
            b16 b16Var = b16.f7762a;
            e16 e16VarM21608U = AbstractC3584sr.m21608U(c99.m4412e(b16Var, 1.0f), ge9.m12515a(tj3Var).f38957f, ge9.m12515a(tj3Var).f38956e);
            ht5 ht5VarM19966d = qh0.m19966d(nj0.f52808c, false);
            int iHashCode = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m = tj3Var.m22132m();
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16VarM21608U);
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
            vi3 vi3Var = C0352b.f4305h;
            oha.m18000f(tj3Var, vi3Var);
            zi3 zi3Var4 = C0352b.f4301d;
            oha.m18001g(tj3Var, zi3Var4, e16VarM1322c);
            gc0 gc0Var2 = nj0.f52811f;
            ci0 ci0Var = ci0.f10109a;
            e16 e16VarMo3727a = ci0Var.mo3727a(b16Var, gc0Var2);
            sj8 sj8VarM20003a = qj8.m20003a(eh0.f37236b, nj0.f52789H, tj3Var, 48);
            int iHashCode2 = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m2 = tj3Var.m22132m();
            e16 e16VarM1322c2 = AbstractC0287b.m1322c(tj3Var, e16VarMo3727a);
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
            bq1.m4042R(AbstractC3423or.m18236U(R$drawable.ic_coin_s, tj3Var, 0), null, wq1.m24108d(tj3Var, b16Var, 16.0f), null, null, 0.0f, null, tj3Var, 56, 120);
            lw9.m16554b(vz1.m23620a0(tj3Var, R$string.stats_coins_balance), AbstractC3584sr.m21611X(b16Var, ge9.m12515a(tj3Var).f38952a, 0.0f, 0.0f, 0.0f, 14), 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var, 0, 0, 262140);
            tj3 tj3Var2 = tj3Var;
            tj3Var2.m22139q(true);
            if (z41Var instanceof x41) {
                tj3Var2.m22111b0(-22756187);
                qh0.m19963a(x74.m24341H(d32.m10007D(pb1.m19045o(c99.m4426s(c99.m4414g(ci0Var.mo3727a(b16Var, gc0Var), 24.0f), 64.0f), p58.m18901i(tj3Var2).f64858d), cx2.m9917a(tj3Var2).m4211d(), ss5.f61356d)), tj3Var2, 0);
                tj3Var2.m22139q(false);
            } else {
                if (!(z41Var instanceof y41)) {
                    throw ux5.m23001x(tj3Var2, -416378187, false);
                }
                tj3Var2.m22111b0(-22273610);
                lw9.m16554b(String.valueOf(((y41) z41Var).f69268a), ci0Var.mo3727a(b16Var, gc0Var), 0L, null, 0L, null, bc3.f8322h, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var2, 1572864, 0, 262076);
                tj3Var2 = tj3Var2;
                tj3Var2.m22139q(false);
            }
            tj3Var2.m22139q(true);
        } else {
            tj3Var.m22102U();
        }
        return xfa.f68157a;
    }

    /* JADX INFO: renamed from: j */
    private final Object m21294j(Object obj, Object obj2, Object obj3) {
        List list = ((b32) this.f60730b).f7836a;
        ye1 ye1Var = (ye1) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((tj8) obj).getClass();
        tj3 tj3Var = (tj3) ye1Var;
        if (tj3Var.m22099R(iIntValue & 1, (iIntValue & 17) != 16)) {
            lw9.m16554b(vz1.m23612R(R$plurals.paging_move_known_action_button, list.size(), new Object[]{Integer.valueOf(list.size())}, tj3Var), null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var, 0, 0, 262142);
        } else {
            tj3Var.m22102U();
        }
        return xfa.f68157a;
    }

    /* JADX INFO: renamed from: k */
    private final Object m21295k(Object obj, Object obj2, Object obj3) {
        x08 x08Var = (x08) this.f60730b;
        ye1 ye1Var = (ye1) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((vv4) obj).getClass();
        tj3 tj3Var = (tj3) ye1Var;
        if (tj3Var.m22099R(iIntValue & 1, (iIntValue & 17) != 16)) {
            blc.m3872a(AbstractC3584sr.m21611X(c99.m4412e(b16.f7762a, 1.0f), 0.0f, 0.0f, 0.0f, ((fe9) tj3Var.m22128k(ge9.f40637a)).f38957f, 7), x08Var.f67593a, x08Var.f67594b, x08Var.f67595c, tj3Var, 0);
        } else {
            tj3Var.m22102U();
        }
        return xfa.f68157a;
    }

    /* JADX INFO: renamed from: l */
    private final Object m21296l(Object obj, Object obj2, Object obj3) {
        e1b e1bVar = (e1b) this.f60730b;
        ye1 ye1Var = (ye1) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((ft4) obj).getClass();
        tj3 tj3Var = (tj3) ye1Var;
        if (tj3Var.m22099R(iIntValue & 1, (iIntValue & 17) != 16)) {
            b16 b16Var = b16.f7762a;
            e16 e16VarM4412e = c99.m4412e(b16Var, 1.0f);
            bb1 bb1VarM230a = ab1.m230a(eh0.f37238d, nj0.f52791J, tj3Var, 0);
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
            oha.m18001g(tj3Var, C0352b.f4303f, bb1VarM230a);
            oha.m18001g(tj3Var, C0352b.f4302e, l77VarM22132m);
            oha.m18001g(tj3Var, C0352b.f4304g, Integer.valueOf(iHashCode));
            oha.m18000f(tj3Var, C0352b.f4305h);
            oha.m18001g(tj3Var, C0352b.f4301d, e16VarM1322c);
            String strM23618Z = vz1.m23618Z(com.lingq.feature.reader.R$string.lesson_complete_vocabulary_lingqs_created, new Object[]{Integer.valueOf(e1bVar.f36582a.size())}, tj3Var);
            vx9 vx9Var = p58.m18902j(tj3Var).f71401e;
            lw9.m16554b(strM23618Z, AbstractC3584sr.m21611X(b16Var, 0.0f, 0.0f, 0.0f, ge9.m12515a(tj3Var).f38952a, 7), p58.m18900f(tj3Var).f55873q, null, 0L, null, bc3.f8324j, 0L, null, null, 0L, 0, false, 0, 0, null, vx9Var, tj3Var, 1572864, 0, 131000);
            lw9.m16554b(vz1.m23620a0(tj3Var, com.lingq.feature.reader.R$string.lesson_complete_vocabulary_message), AbstractC3584sr.m21611X(b16Var, 0.0f, 0.0f, 0.0f, ge9.m12515a(tj3Var).f38957f, 7), p58.m18900f(tj3Var).f55875s, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var).f71406j, tj3Var, 0, 0, 131064);
            tj3Var.m22139q(true);
        } else {
            tj3Var.m22102U();
        }
        return xfa.f68157a;
    }

    /* JADX INFO: renamed from: m */
    private final Object m21297m(Object obj, Object obj2, Object obj3) {
        String strM23620a0;
        PlaylistButtonState playlistButtonState = (PlaylistButtonState) this.f60730b;
        ye1 ye1Var = (ye1) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((tj8) obj).getClass();
        tj3 tj3Var = (tj3) ye1Var;
        if (tj3Var.m22099R(iIntValue & 1, (iIntValue & 17) != 16)) {
            y27 y27VarM18236U = AbstractC3423or.m18236U(R$drawable.ic_headphones, tj3Var, 0);
            zf1 zf1Var = ge9.f40637a;
            ((fe9) tj3Var.m22128k(zf1Var)).getClass();
            b16 b16Var = b16.f7762a;
            ty3.m22352b(y27VarM18236U, null, c99.m4422o(b16Var, 16.0f), 0L, tj3Var, 56, 8);
            thb.m22044c(tj3Var, c99.m4426s(b16Var, ((fe9) tj3Var.m22128k(zf1Var)).f38955d));
            int i = t25.f61765a[playlistButtonState.ordinal()];
            if (i == 1) {
                tj3Var.m22111b0(-573715132);
                strM23620a0 = vz1.m23620a0(tj3Var, com.lingq.core.p012ui.R$string.lesson_add_to_playlist);
                tj3Var.m22139q(false);
            } else {
                if (i != 2) {
                    throw ux5.m23001x(tj3Var, -573717365, false);
                }
                tj3Var.m22111b0(-573711927);
                strM23620a0 = vz1.m23620a0(tj3Var, com.lingq.core.p012ui.R$string.lesson_remove_from_playlist);
                tj3Var.m22139q(false);
            }
            lw9.m16554b(strM23620a0, null, 0L, null, 0L, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, null, tj3Var, 0, 24960, 241662);
        } else {
            tj3Var.m22102U();
        }
        return xfa.f68157a;
    }

    /* JADX INFO: renamed from: n */
    private final Object m21298n(Object obj, Object obj2, Object obj3) {
        String strM23620a0;
        v35 v35Var = (v35) this.f60730b;
        ye1 ye1Var = (ye1) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((tj8) obj).getClass();
        tj3 tj3Var = (tj3) ye1Var;
        if (tj3Var.m22099R(iIntValue & 1, (iIntValue & 17) != 16)) {
            int i = d45.f34992b[gjd.m12716a(v35Var).ordinal()];
            if (i == 1) {
                tj3Var.m22111b0(-464171333);
                strM23620a0 = vz1.m23620a0(tj3Var, com.lingq.core.p012ui.R$string.lingq_open_lesson);
                tj3Var.m22139q(false);
            } else if (i == 2) {
                tj3Var.m22111b0(-464168099);
                strM23620a0 = vz1.m23620a0(tj3Var, com.lingq.core.p012ui.R$string.lingq_import_lesson);
                tj3Var.m22139q(false);
            } else {
                if (i != 3) {
                    throw ux5.m23001x(tj3Var, -464173924, false);
                }
                tj3Var.m22111b0(-464164894);
                strM23620a0 = vz1.m23620a0(tj3Var, com.lingq.feature.lessoninfo.R$string.lingq_buy_lesson);
                tj3Var.m22139q(false);
            }
            lw9.m16554b(strM23620a0, null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var, 0, 0, 262142);
        } else {
            tj3Var.m22102U();
        }
        return xfa.f68157a;
    }

    /* JADX INFO: renamed from: o */
    private final Object m21299o(Object obj, Object obj2, Object obj3) {
        mn5 mn5Var = (mn5) this.f60730b;
        ye1 ye1Var = (ye1) obj2;
        ((Integer) obj3).getClass();
        ((InterfaceC0067f) obj).getClass();
        String str = mn5Var.f51565g;
        if (str == null || str.length() <= 0 || !mn5Var.f51566h) {
            str = null;
        }
        if (str == null) {
            tj3 tj3Var = (tj3) ye1Var;
            tj3Var.m22111b0(-1841908982);
            tj3Var.m22139q(false);
        } else {
            tj3 tj3Var2 = (tj3) ye1Var;
            tj3Var2.m22111b0(-1841908981);
            bb1 bb1VarM230a = ab1.m230a(eh0.f37238d, nj0.f52791J, tj3Var2, 0);
            int iHashCode = Long.hashCode(tj3Var2.f62385T);
            l77 l77VarM22132m = tj3Var2.m22132m();
            b16 b16Var = b16.f7762a;
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var2, b16Var);
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
            thb.m22044c(tj3Var2, c99.m4414g(b16Var, ((fe9) tj3Var2.m22128k(ge9.f40637a)).f38952a));
            AbstractC2558b.m9476i(mn5Var, n54.m17229b(str), true, tj3Var2, 384, 0);
            tj3Var2.m22139q(true);
            tj3Var2.m22139q(false);
        }
        return xfa.f68157a;
    }

    /* JADX INFO: renamed from: p */
    private final Object m21300p(Object obj, Object obj2, Object obj3) {
        aj3 aj3Var = (aj3) this.f60730b;
        d87 d87Var = (d87) obj;
        TokenType tokenType = (TokenType) obj2;
        e28 e28Var = (e28) obj3;
        d87Var.getClass();
        tokenType.getClass();
        e28Var.getClass();
        aj3Var.invoke(d87Var, tokenType, e28Var);
        return xfa.f68157a;
    }

    /* JADX INFO: renamed from: q */
    private final Object m21301q(Object obj, Object obj2, Object obj3) {
        el6 el6Var = (el6) this.f60730b;
        ye1 ye1Var = (ye1) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((db1) obj).getClass();
        tj3 tj3Var = (tj3) ye1Var;
        if (tj3Var.m22099R(iIntValue & 1, (iIntValue & 17) != 16)) {
            zf1 zf1Var = ge9.f40637a;
            float f = ((fe9) tj3Var.m22128k(zf1Var)).f38952a;
            b16 b16Var = b16.f7762a;
            e16 e16VarM21607T = AbstractC3584sr.m21607T(b16Var, f);
            sj8 sj8VarM20003a = qj8.m20003a(eh0.f37236b, nj0.f52789H, tj3Var, 48);
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
            String str = el6Var.f37437b;
            String str2 = el6Var.f37436a;
            e16 e16VarM4422o = c99.m4422o(b16Var, 56.0f);
            vh9 vh9Var = ps5.f56764b;
            ss5.m21702b(str, str2, pb1.m19045o(e16VarM4422o, ((ms5) tj3Var.m22128k(vh9Var)).f51801c.f64856b), null, hl1.f42564a, tj3Var, 1572864, 4024);
            thb.m22044c(tj3Var, c99.m4426s(b16Var, ((fe9) tj3Var.m22128k(zf1Var)).f38952a));
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
            lw9.m16554b(vz1.m23618Z(com.lingq.feature.reader.R$string.stats_complete_up_next, new Object[]{el6Var.f37436a}, tj3Var), null, 0L, null, 0L, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, ((ms5) tj3Var.m22128k(vh9Var)).f51800b.f71407k, tj3Var, 0, 24960, 110590);
            lw9.m16554b(vz1.m23620a0(tj3Var, com.lingq.feature.reader.R$string.complete_start_lesson), null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ms5) tj3Var.m22128k(vh9Var)).f51800b.f71404h, tj3Var, 0, 0, 131070);
            tj3Var.m22139q(true);
            ty3.m22351a(ihd.m13932a(), null, c99.m4422o(b16Var, 32.0f), 0L, tj3Var, 432, 8);
            tj3Var.m22139q(true);
        } else {
            tj3Var.m22102U();
        }
        return xfa.f68157a;
    }

    /* JADX INFO: renamed from: r */
    private final Object m21302r(Object obj, Object obj2, Object obj3) {
        fl6 fl6Var = (fl6) this.f60730b;
        ye1 ye1Var = (ye1) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((db1) obj).getClass();
        tj3 tj3Var = (tj3) ye1Var;
        if (tj3Var.m22099R(iIntValue & 1, (iIntValue & 17) != 16)) {
            b16 b16Var = b16.f7762a;
            e16 e16VarM10007D = d32.m10007D(c99.m4411d(b16Var, 1.0f), p58.m18900f(tj3Var).f55874r, ss5.f61356d);
            ht5 ht5VarM19966d = qh0.m19966d(nj0.f52808c, false);
            int iHashCode = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m = tj3Var.m22132m();
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16VarM10007D);
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
            vi3 vi3Var = C0352b.f4305h;
            oha.m18000f(tj3Var, vi3Var);
            zi3 zi3Var4 = C0352b.f4301d;
            oha.m18001g(tj3Var, zi3Var4, e16VarM1322c);
            ss5.m21702b(fl6Var.f39251a, fl6Var.f39256f, c99.m4411d(b16Var, 1.0f), null, hl1.f42564a, tj3Var, 1573248, 4024);
            e16 e16VarM4411d = c99.m4411d(b16Var, 1.0f);
            ui0 ui0Var = vi0.Companion;
            long j = aa1.f403b;
            qh0.m19963a(d32.m10006C(e16VarM4411d, ui0.m22749e(ui0Var, vz1.m23605K(new aa1(aa1.m198b(0.4f, j)), new aa1(aa1.f411j), new aa1(aa1.m198b(0.6f, j))), 0.0f, Float.POSITIVE_INFINITY, 8)), tj3Var, 6);
            gc0 gc0Var = nj0.f52814i;
            ci0 ci0Var = ci0.f10109a;
            e16 e16VarM21607T = AbstractC3584sr.m21607T(ci0Var.mo3727a(b16Var, gc0Var), ge9.m12515a(tj3Var).f38956e);
            bb1 bb1VarM230a = ab1.m230a(new C3661uu(ge9.m12515a(tj3Var).f38955d, true, new gm5(28)), nj0.f52791J, tj3Var, 0);
            int iHashCode2 = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m2 = tj3Var.m22132m();
            e16 e16VarM1322c2 = AbstractC0287b.m1322c(tj3Var, e16VarM21607T);
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
            gsb.m12859b(fl6Var.f39252b, 0, cx2.m9917a(tj3Var).m4209b(), tj3Var, vz1.m23620a0(tj3Var, com.lingq.core.p012ui.R$string.feed_words_new));
            gsb.m12859b(fl6Var.f39253c, 0, cx2.m9917a(tj3Var).m4212e(), tj3Var, vz1.m23620a0(tj3Var, com.lingq.core.p012ui.R$string.lingq_lingqs));
            gsb.m12859b(fl6Var.f39254d, 0, p58.m18900f(tj3Var).f55816A, tj3Var, vz1.m23620a0(tj3Var, com.lingq.core.p012ui.R$string.stats_known_words));
            tj3Var.m22139q(true);
            e16 e16VarM21607T2 = AbstractC3584sr.m21607T(ci0Var.mo3727a(b16Var, nj0.f52816k), ge9.m12515a(tj3Var).f38956e);
            sj8 sj8VarM20003a = qj8.m20003a(eh0.f37236b, nj0.f52789H, tj3Var, 48);
            int iHashCode3 = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m3 = tj3Var.m22132m();
            e16 e16VarM1322c3 = AbstractC0287b.m1322c(tj3Var, e16VarM21607T2);
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, zi3Var, sj8VarM20003a);
            oha.m18001g(tj3Var, zi3Var2, l77VarM22132m3);
            AbstractC3393o1.m17747v(iHashCode3, tj3Var, zi3Var3, tj3Var, vi3Var);
            oha.m18001g(tj3Var, zi3Var4, e16VarM1322c3);
            y27 y27VarM18236U = AbstractC3423or.m18236U(R$drawable.ic_headphones_s, tj3Var, 0);
            String strM23620a0 = vz1.m23620a0(tj3Var, com.lingq.core.p012ui.R$string.ui_audio_duration);
            e16 e16VarM24108d = wq1.m24108d(tj3Var, b16Var, 16.0f);
            long j2 = aa1.f406e;
            ty3.m22352b(y27VarM18236U, strM23620a0, e16VarM24108d, j2, tj3Var, 3080, 0);
            thb.m22044c(tj3Var, c99.m4426s(b16Var, ge9.m12515a(tj3Var).f38955d));
            lw9.m16554b(fl6Var.f39255e, null, j2, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var).f71407k, tj3Var, 384, 0, 131066);
            tj3Var.m22139q(true);
            tj3Var.m22139q(true);
        } else {
            tj3Var.m22102U();
        }
        return xfa.f68157a;
    }

    /* JADX INFO: renamed from: s */
    private final Object m21303s(Object obj, Object obj2, Object obj3) {
        g4b g4bVar = (g4b) this.f60730b;
        ye1 ye1Var = (ye1) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((db1) obj).getClass();
        tj3 tj3Var = (tj3) ye1Var;
        if (tj3Var.m22099R(iIntValue & 1, (iIntValue & 17) != 16)) {
            e16 e16VarM21608U = AbstractC3584sr.m21608U(c99.m4412e(b16.f7762a, 1.0f), ge9.m12515a(tj3Var).f38955d, ge9.m12515a(tj3Var).f38956e);
            bb1 bb1VarM230a = ab1.m230a(new C3661uu(ge9.m12515a(tj3Var).f38955d, true, new gm5(28)), nj0.f52792K, tj3Var, 48);
            int iHashCode = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m = tj3Var.m22132m();
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16VarM21608U);
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
            lw9.m16554b(g4bVar.f40214a, null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var).f71401e, tj3Var, 0, 0, 131070);
            lw9.m16554b(vz1.m23620a0(tj3Var, g4bVar.f40215b), null, p58.m18900f(tj3Var).f55873q, null, 0L, null, null, 0L, null, new ks9(3), 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var).f71407k, tj3Var, 0, 0, 130042);
            tj3Var.m22139q(true);
        } else {
            tj3Var.m22102U();
        }
        return xfa.f68157a;
    }

    /* JADX INFO: renamed from: t */
    private final Object m21304t(Object obj, Object obj2, Object obj3) {
        tn7 tn7Var = (tn7) this.f60730b;
        ye1 ye1Var = (ye1) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((tj8) obj).getClass();
        tj3 tj3Var = (tj3) ye1Var;
        if (tj3Var.m22099R(iIntValue & 1, (iIntValue & 17) != 16)) {
            String str = tn7Var.f62573c.f19238a;
            if (str == null) {
                str = "";
            }
            lw9.m16554b(str, null, ((ms5) tj3Var.m22128k(ps5.f56764b)).f51799a.f55873q, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var, 0, 0, 262138);
        } else {
            tj3Var.m22102U();
        }
        return xfa.f68157a;
    }

    /* JADX INFO: renamed from: u */
    private final Object m21305u(Object obj, Object obj2, Object obj3) {
        yz4 yz4Var = (yz4) this.f60730b;
        ye1 ye1Var = (ye1) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((tj8) obj).getClass();
        tj3 tj3Var = (tj3) ye1Var;
        if (tj3Var.m22099R(iIntValue & 1, (iIntValue & 17) != 16)) {
            Lesson lesson = yz4Var.f70667a;
            lw9.m16554b(vz1.m23620a0(tj3Var, (lesson == null || !lesson.f19154m) ? com.lingq.feature.reader.R$string.lesson_finish_lesson : com.lingq.feature.reader.R$string.lesson_view_lesson_stats), null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ms5) tj3Var.m22128k(ps5.f56764b)).f51800b.f71409m, tj3Var, 0, 0, 131070);
        } else {
            tj3Var.m22102U();
        }
        return xfa.f68157a;
    }

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i;
        int i2;
        String strM23618Z;
        int i3;
        int i4 = this.f60729a;
        b16 b16Var = b16.f7762a;
        xfa xfaVar = xfa.f68157a;
        Object obj4 = this.f60730b;
        switch (i4) {
            case 0:
                df0 df0Var = (df0) obj4;
                ye1 ye1Var = (ye1) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((tj8) obj).getClass();
                tj3 tj3Var = (tj3) ye1Var;
                if (tj3Var.m22099R(iIntValue & 1, (iIntValue & 17) != 16)) {
                    lw9.m16554b(vz1.m23620a0(tj3Var, df0Var.f35545j ? com.lingq.feature.challenges.R$string.challenge_change_book : df0Var.f35544i ? com.lingq.feature.challenges.R$string.challenge_add_new_book : com.lingq.feature.challenges.R$string.challenge_join_the_book_challenge), null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var, 0, 0, 262142);
                } else {
                    tj3Var.m22102U();
                }
                return xfaVar;
            case 1:
                ChallengeType challengeType = (ChallengeType) obj4;
                ye1 ye1Var2 = (ye1) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((db1) obj).getClass();
                tj3 tj3Var2 = (tj3) ye1Var2;
                if (tj3Var2.m22099R(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    e16 e16VarM4412e = c99.m4412e(b16Var, 1.0f);
                    zf1 zf1Var = ge9.f40637a;
                    sj8 sj8VarM20003a = qj8.m20003a(new C3661uu(((fe9) tj3Var2.m22128k(zf1Var)).f38956e, true, new gm5(28)), nj0.f52789H, tj3Var2, 48);
                    int iHashCode = Long.hashCode(tj3Var2.f62385T);
                    l77 l77VarM22132m = tj3Var2.m22132m();
                    e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var2, e16VarM4412e);
                    se1.f60731q.getClass();
                    ui3 ui3Var = C0352b.f4299b;
                    tj3Var2.m22119f0();
                    if (tj3Var2.f62384S) {
                        tj3Var2.m22130l(ui3Var);
                    } else {
                        tj3Var2.m22137o0();
                    }
                    zi3 zi3Var = C0352b.f4303f;
                    oha.m18001g(tj3Var2, zi3Var, sj8VarM20003a);
                    zi3 zi3Var2 = C0352b.f4302e;
                    oha.m18001g(tj3Var2, zi3Var2, l77VarM22132m);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    zi3 zi3Var3 = C0352b.f4304g;
                    oha.m18001g(tj3Var2, zi3Var3, numValueOf);
                    vi3 vi3Var = C0352b.f4305h;
                    oha.m18000f(tj3Var2, vi3Var);
                    zi3 zi3Var4 = C0352b.f4301d;
                    oha.m18001g(tj3Var2, zi3Var4, e16VarM1322c);
                    if (challengeType == ChallengeType.BookChallenge) {
                        tj3Var2.m22111b0(1578836552);
                        i = 0;
                        qh0.m19963a(x74.m24341H(pb1.m19045o(c99.m4422o(AbstractC3584sr.m21611X(AbstractC3584sr.m21607T(b16Var, ((fe9) tj3Var2.m22128k(zf1Var)).f38952a), ((fe9) tj3Var2.m22128k(zf1Var)).f38955d, 0.0f, 0.0f, 0.0f, 14), 44.0f), ui8.f63972a)), tj3Var2, 0);
                        tj3Var2.m22139q(false);
                    } else {
                        i = 0;
                        tj3Var2.m22111b0(1579171941);
                        tj3Var2.m22139q(false);
                    }
                    e16 e16VarM4412e2 = c99.m4412e(b16Var, 1.0f);
                    bb1 bb1VarM230a = ab1.m230a(new C3661uu(((fe9) tj3Var2.m22128k(zf1Var)).f38952a, true, new gm5(28)), nj0.f52791J, tj3Var2, i);
                    int iHashCode2 = Long.hashCode(tj3Var2.f62385T);
                    l77 l77VarM22132m2 = tj3Var2.m22132m();
                    e16 e16VarM1322c2 = AbstractC0287b.m1322c(tj3Var2, e16VarM4412e2);
                    tj3Var2.m22119f0();
                    if (tj3Var2.f62384S) {
                        tj3Var2.m22130l(ui3Var);
                    } else {
                        tj3Var2.m22137o0();
                    }
                    oha.m18001g(tj3Var2, zi3Var, bb1VarM230a);
                    oha.m18001g(tj3Var2, zi3Var2, l77VarM22132m2);
                    AbstractC3393o1.m17747v(iHashCode2, tj3Var2, zi3Var3, tj3Var2, vi3Var);
                    oha.m18001g(tj3Var2, zi3Var4, e16VarM1322c2);
                    qh0.m19963a(x74.m24341H(pb1.m19045o(c99.m4414g(c99.m4412e(b16Var, 0.5f), 12.0f), ui8.m22752a(50))), tj3Var2, 0);
                    qh0.m19963a(x74.m24341H(pb1.m19045o(c99.m4414g(c99.m4412e(b16Var, 0.3f), 8.0f), ui8.m22752a(50))), tj3Var2, 0);
                    tj3Var2.m22139q(true);
                    tj3Var2.m22139q(true);
                } else {
                    tj3Var2.m22102U();
                }
                return xfaVar;
            case 2:
                ChatStats chatStats = (ChatStats) obj4;
                ye1 ye1Var3 = (ye1) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((g93) obj).getClass();
                tj3 tj3Var3 = (tj3) ye1Var3;
                if (!tj3Var3.m22099R(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    tj3Var3.m22102U();
                    return xfaVar;
                }
                fc0 fc0Var = nj0.f52789H;
                C3549ru c3549ru = eh0.f37236b;
                sj8 sj8VarM20003a2 = qj8.m20003a(c3549ru, fc0Var, tj3Var3, 48);
                int iHashCode3 = Long.hashCode(tj3Var3.f62385T);
                l77 l77VarM22132m3 = tj3Var3.m22132m();
                e16 e16VarM1322c3 = AbstractC0287b.m1322c(tj3Var3, b16Var);
                se1.f60731q.getClass();
                ui3 ui3Var2 = C0352b.f4299b;
                tj3Var3.m22119f0();
                if (tj3Var3.f62384S) {
                    tj3Var3.m22130l(ui3Var2);
                } else {
                    tj3Var3.m22137o0();
                }
                zi3 zi3Var5 = C0352b.f4303f;
                oha.m18001g(tj3Var3, zi3Var5, sj8VarM20003a2);
                zi3 zi3Var6 = C0352b.f4302e;
                oha.m18001g(tj3Var3, zi3Var6, l77VarM22132m3);
                Integer numValueOf2 = Integer.valueOf(iHashCode3);
                zi3 zi3Var7 = C0352b.f4304g;
                oha.m18001g(tj3Var3, zi3Var7, numValueOf2);
                vi3 vi3Var2 = C0352b.f4305h;
                oha.m18000f(tj3Var3, vi3Var2);
                zi3 zi3Var8 = C0352b.f4301d;
                oha.m18001g(tj3Var3, zi3Var8, e16VarM1322c3);
                String strValueOf = String.valueOf(chatStats.f18958c);
                vx9 vx9Var = p58.m18902j(tj3Var3).f71404h;
                bc3 bc3Var = bc3.f8324j;
                lw9.m16554b(strValueOf, null, p58.m18900f(tj3Var3).f55873q, null, 0L, null, bc3Var, 0L, null, null, 0L, 0, false, 0, 0, null, vx9Var, tj3Var3, 1572864, 0, 131002);
                thb.m22044c(tj3Var3, c99.m4426s(b16Var, ge9.m12515a(tj3Var3).f38954c));
                lw9.m16554b(vz1.m23620a0(tj3Var3, com.lingq.core.p012ui.R$string.stats_words), null, p58.m18900f(tj3Var3).f55875s, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var3).f71406j, tj3Var3, 0, 0, 131066);
                thb.m22044c(tj3Var3, c99.m4426s(b16Var, ge9.m12515a(tj3Var3).f38956e));
                tj3Var3.m22139q(true);
                sj8 sj8VarM20003a3 = qj8.m20003a(c3549ru, fc0Var, tj3Var3, 48);
                int iHashCode4 = Long.hashCode(tj3Var3.f62385T);
                l77 l77VarM22132m4 = tj3Var3.m22132m();
                e16 e16VarM1322c4 = AbstractC0287b.m1322c(tj3Var3, b16Var);
                tj3Var3.m22119f0();
                if (tj3Var3.f62384S) {
                    tj3Var3.m22130l(ui3Var2);
                } else {
                    tj3Var3.m22137o0();
                }
                oha.m18001g(tj3Var3, zi3Var5, sj8VarM20003a3);
                oha.m18001g(tj3Var3, zi3Var6, l77VarM22132m4);
                AbstractC3393o1.m17747v(iHashCode4, tj3Var3, zi3Var7, tj3Var3, vi3Var2);
                oha.m18001g(tj3Var3, zi3Var8, e16VarM1322c4);
                lw9.m16554b(String.valueOf(chatStats.f18960e), null, p58.m18900f(tj3Var3).f55873q, null, 0L, null, bc3Var, 0L, null, null, 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var3).f71404h, tj3Var3, 1572864, 0, 131002);
                thb.m22044c(tj3Var3, c99.m4426s(b16Var, ge9.m12515a(tj3Var3).f38954c));
                lw9.m16554b(vz1.m23620a0(tj3Var3, com.lingq.feature.chat.R$string.chat_lingqs_used), null, p58.m18900f(tj3Var3).f55875s, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var3).f71406j, tj3Var3, 0, 0, 131066);
                thb.m22044c(tj3Var3, c99.m4426s(b16Var, ge9.m12515a(tj3Var3).f38956e));
                tj3Var3.m22139q(true);
                sj8 sj8VarM20003a4 = qj8.m20003a(c3549ru, fc0Var, tj3Var3, 48);
                int iHashCode5 = Long.hashCode(tj3Var3.f62385T);
                l77 l77VarM22132m5 = tj3Var3.m22132m();
                e16 e16VarM1322c5 = AbstractC0287b.m1322c(tj3Var3, b16Var);
                tj3Var3.m22119f0();
                if (tj3Var3.f62384S) {
                    tj3Var3.m22130l(ui3Var2);
                } else {
                    tj3Var3.m22137o0();
                }
                oha.m18001g(tj3Var3, zi3Var5, sj8VarM20003a4);
                oha.m18001g(tj3Var3, zi3Var6, l77VarM22132m5);
                AbstractC3393o1.m17747v(iHashCode5, tj3Var3, zi3Var7, tj3Var3, vi3Var2);
                oha.m18001g(tj3Var3, zi3Var8, e16VarM1322c5);
                lw9.m16554b(String.valueOf((int) chatStats.f18961f), null, p58.m18900f(tj3Var3).f55873q, null, 0L, null, bc3Var, 0L, null, null, 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var3).f71404h, tj3Var3, 1572864, 0, 131002);
                thb.m22044c(tj3Var3, c99.m4426s(b16Var, ge9.m12515a(tj3Var3).f38954c));
                lw9.m16554b(vz1.m23620a0(tj3Var3, com.lingq.core.p012ui.R$string.stats_coins_earned), null, p58.m18900f(tj3Var3).f55875s, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var3).f71406j, tj3Var3, 0, 0, 131066);
                thb.m22044c(tj3Var3, c99.m4426s(b16Var, ge9.m12515a(tj3Var3).f38955d));
                tj3Var3.m22139q(true);
                return xfaVar;
            case 3:
                d71 d71Var = (d71) obj4;
                ye1 ye1Var4 = (ye1) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ((db1) obj).getClass();
                tj3 tj3Var4 = (tj3) ye1Var4;
                if (tj3Var4.m22099R(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    e16 e16VarM4412e3 = c99.m4412e(b16Var, 1.0f);
                    gc0 gc0Var = nj0.f52808c;
                    ht5 ht5VarM19966d = qh0.m19966d(gc0Var, false);
                    int iHashCode6 = Long.hashCode(tj3Var4.f62385T);
                    l77 l77VarM22132m6 = tj3Var4.m22132m();
                    e16 e16VarM1322c6 = AbstractC0287b.m1322c(tj3Var4, e16VarM4412e3);
                    se1.f60731q.getClass();
                    ui3 ui3Var3 = C0352b.f4299b;
                    tj3Var4.m22119f0();
                    if (tj3Var4.f62384S) {
                        tj3Var4.m22130l(ui3Var3);
                    } else {
                        tj3Var4.m22137o0();
                    }
                    zi3 zi3Var9 = C0352b.f4303f;
                    oha.m18001g(tj3Var4, zi3Var9, ht5VarM19966d);
                    zi3 zi3Var10 = C0352b.f4302e;
                    oha.m18001g(tj3Var4, zi3Var10, l77VarM22132m6);
                    Integer numValueOf3 = Integer.valueOf(iHashCode6);
                    zi3 zi3Var11 = C0352b.f4304g;
                    oha.m18001g(tj3Var4, zi3Var11, numValueOf3);
                    vi3 vi3Var3 = C0352b.f4305h;
                    oha.m18000f(tj3Var4, vi3Var3);
                    zi3 zi3Var12 = C0352b.f4301d;
                    oha.m18001g(tj3Var4, zi3Var12, e16VarM1322c6);
                    LibraryItem libraryItem = d71Var.f35073a;
                    ss5.m21702b(jfa.m14422e(libraryItem.f19409J, libraryItem.f19436h, ImageSize.Large), libraryItem.f19433e, c99.m4414g(c99.m4412e(b16Var, 1.0f), 200.0f), null, hl1.f42564a, tj3Var4, 1573248, 4024);
                    e16 e16VarMo3727a = ci0.f10109a.mo3727a(c99.m4412e(b16Var, 1.0f), nj0.f52815j);
                    ui0 ui0Var = vi0.Companion;
                    aa1 aa1Var = new aa1(aa1.f411j);
                    vh9 vh9Var = ps5.f56764b;
                    e16 e16VarM21607T = AbstractC3584sr.m21607T(d32.m10006C(e16VarMo3727a, ui0.m22749e(ui0Var, vz1.m23605K(aa1Var, new aa1(aa1.m198b(0.7f, ((ms5) tj3Var4.m22128k(vh9Var)).f51799a.f55818C))), 0.0f, 0.0f, 14)), ((fe9) tj3Var4.m22128k(ge9.f40637a)).f38952a);
                    ht5 ht5VarM19966d2 = qh0.m19966d(gc0Var, false);
                    int iHashCode7 = Long.hashCode(tj3Var4.f62385T);
                    l77 l77VarM22132m7 = tj3Var4.m22132m();
                    e16 e16VarM1322c7 = AbstractC0287b.m1322c(tj3Var4, e16VarM21607T);
                    tj3Var4.m22119f0();
                    if (tj3Var4.f62384S) {
                        tj3Var4.m22130l(ui3Var3);
                    } else {
                        tj3Var4.m22137o0();
                    }
                    oha.m18001g(tj3Var4, zi3Var9, ht5VarM19966d2);
                    oha.m18001g(tj3Var4, zi3Var10, l77VarM22132m7);
                    AbstractC3393o1.m17747v(iHashCode7, tj3Var4, zi3Var11, tj3Var4, vi3Var3);
                    oha.m18001g(tj3Var4, zi3Var12, e16VarM1322c7);
                    String str = libraryItem.f19433e;
                    if (str == null) {
                        str = "";
                    }
                    lw9.m16554b(str, null, aa1.f406e, null, 0L, null, null, 0L, null, null, 0L, 2, false, 2, 0, null, ((ms5) tj3Var4.m22128k(vh9Var)).f51800b.f71404h, tj3Var4, 384, 24960, 110586);
                    tj3Var4.m22139q(true);
                    tj3Var4.m22139q(true);
                } else {
                    tj3Var4.m22102U();
                }
                return xfaVar;
            case 4:
                f71 f71Var = (f71) obj4;
                ye1 ye1Var5 = (ye1) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                ((tj8) obj).getClass();
                tj3 tj3Var5 = (tj3) ye1Var5;
                if (tj3Var5.m22099R(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    lw9.m16554b(vz1.m23620a0(tj3Var5, f71Var.f38541b.f19460f ? com.lingq.feature.collections.R$string.course_continue_course : com.lingq.feature.collections.R$string.course_start_course), null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var5, 0, 0, 262142);
                } else {
                    tj3Var5.m22102U();
                }
                return xfaVar;
            case 5:
                t61 t61Var = (t61) obj4;
                ye1 ye1Var6 = (ye1) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                ((ft4) obj).getClass();
                tj3 tj3Var6 = (tj3) ye1Var6;
                if (tj3Var6.m22099R(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    String str2 = t61Var.f61898a;
                    vx9 vx9Var2 = ((ms5) tj3Var6.m22128k(ps5.f56764b)).f51800b.f71405i;
                    zf1 zf1Var2 = ge9.f40637a;
                    lw9.m16554b(str2, AbstractC3584sr.m21610W(b16Var, ((fe9) tj3Var6.m22128k(zf1Var2)).f38956e, ((fe9) tj3Var6.m22128k(zf1Var2)).f38955d, ((fe9) tj3Var6.m22128k(zf1Var2)).f38956e, ((fe9) tj3Var6.m22128k(zf1Var2)).f38952a), 0L, null, 0L, null, null, 0L, null, null, 0L, 2, false, 2, 0, null, vx9Var2, tj3Var6, 0, 24960, 110588);
                } else {
                    tj3Var6.m22102U();
                }
                return xfaVar;
            case 6:
                CoursePlaylistSort coursePlaylistSort = (CoursePlaylistSort) obj4;
                ye1 ye1Var7 = (ye1) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                ((tj8) obj).getClass();
                tj3 tj3Var7 = (tj3) ye1Var7;
                if (tj3Var7.m22099R(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                    lw9.m16554b(vz1.m23620a0(tj3Var7, AbstractC3423or.m18222G(coursePlaylistSort)), c99.m4430w(b16Var, null, 3), 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var7, 48, 0, 262140);
                    ty3.m22351a(pvc.m19521q(), null, null, 0L, tj3Var7, 48, 12);
                } else {
                    tj3Var7.m22102U();
                }
                return xfaVar;
            case 7:
                qs1 qs1Var = (qs1) obj4;
                ye1 ye1Var8 = (ye1) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                ((db1) obj).getClass();
                tj3 tj3Var8 = (tj3) ye1Var8;
                if (tj3Var8.m22099R(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                    e16 e16VarM21607T2 = AbstractC3584sr.m21607T(c99.m4412e(b16Var, 1.0f), ge9.m12515a(tj3Var8).f38952a);
                    ec0 ec0Var = nj0.f52792K;
                    bb1 bb1VarM230a2 = ab1.m230a(new C3661uu(ge9.m12515a(tj3Var8).f38952a, true, new gm5(28)), ec0Var, tj3Var8, 48);
                    int iHashCode8 = Long.hashCode(tj3Var8.f62385T);
                    l77 l77VarM22132m8 = tj3Var8.m22132m();
                    e16 e16VarM1322c8 = AbstractC0287b.m1322c(tj3Var8, e16VarM21607T2);
                    se1.f60731q.getClass();
                    ui3 ui3Var4 = C0352b.f4299b;
                    tj3Var8.m22119f0();
                    if (tj3Var8.f62384S) {
                        tj3Var8.m22130l(ui3Var4);
                    } else {
                        tj3Var8.m22137o0();
                    }
                    zi3 zi3Var13 = C0352b.f4303f;
                    oha.m18001g(tj3Var8, zi3Var13, bb1VarM230a2);
                    zi3 zi3Var14 = C0352b.f4302e;
                    oha.m18001g(tj3Var8, zi3Var14, l77VarM22132m8);
                    Integer numValueOf4 = Integer.valueOf(iHashCode8);
                    zi3 zi3Var15 = C0352b.f4304g;
                    oha.m18001g(tj3Var8, zi3Var15, numValueOf4);
                    vi3 vi3Var4 = C0352b.f4305h;
                    oha.m18000f(tj3Var8, vi3Var4);
                    zi3 zi3Var16 = C0352b.f4301d;
                    oha.m18001g(tj3Var8, zi3Var16, e16VarM1322c8);
                    us1.m22891d(qs1Var, tj3Var8, 0);
                    bb1 bb1VarM230a3 = ab1.m230a(new C3661uu(ge9.m12515a(tj3Var8).f38955d, true, new gm5(28)), ec0Var, tj3Var8, 48);
                    int iHashCode9 = Long.hashCode(tj3Var8.f62385T);
                    l77 l77VarM22132m9 = tj3Var8.m22132m();
                    e16 e16VarM1322c9 = AbstractC0287b.m1322c(tj3Var8, b16Var);
                    tj3Var8.m22119f0();
                    if (tj3Var8.f62384S) {
                        tj3Var8.m22130l(ui3Var4);
                    } else {
                        tj3Var8.m22137o0();
                    }
                    oha.m18001g(tj3Var8, zi3Var13, bb1VarM230a3);
                    oha.m18001g(tj3Var8, zi3Var14, l77VarM22132m9);
                    AbstractC3393o1.m17747v(iHashCode9, tj3Var8, zi3Var15, tj3Var8, vi3Var4);
                    oha.m18001g(tj3Var8, zi3Var16, e16VarM1322c9);
                    lw9.m16554b(qs1Var.f58120a, null, p58.m18900f(tj3Var8).f55873q, null, 0L, null, bc3.f8323i, 0L, null, new ks9(3), 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var8).f71404h, tj3Var8, 1572864, 0, 129978);
                    lw9.m16554b(qs1Var.f58121b, null, p58.m18900f(tj3Var8).f55875s, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var8).f71407k, tj3Var8, 0, 0, 131066);
                    tj3Var8.m22139q(true);
                    ux5.m23003z(b16Var, ge9.m12515a(tj3Var8).f38952a, tj3Var8, true);
                } else {
                    tj3Var8.m22102U();
                }
                return xfaVar;
            case 8:
                vs1 vs1Var = (vs1) obj4;
                t17 t17Var = (t17) obj;
                ye1 ye1Var9 = (ye1) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                t17Var.getClass();
                if ((iIntValue9 & 6) == 0) {
                    iIntValue9 |= ((tj3) ye1Var9).m22120g(t17Var) ? 4 : 2;
                }
                tj3 tj3Var9 = (tj3) ye1Var9;
                if (tj3Var9.m22099R(iIntValue9 & 1, (iIntValue9 & 19) != 18)) {
                    e16 e16VarM3912B0 = bna.m3912B0(AbstractC3584sr.m21606S(c99.m4411d(b16Var, 1.0f), t17Var), bna.m3972r0(tj3Var9), false, 14);
                    ec0 ec0Var2 = nj0.f52792K;
                    bb1 bb1VarM230a4 = ab1.m230a(eh0.f37238d, ec0Var2, tj3Var9, 48);
                    int iHashCode10 = Long.hashCode(tj3Var9.f62385T);
                    l77 l77VarM22132m10 = tj3Var9.m22132m();
                    e16 e16VarM1322c10 = AbstractC0287b.m1322c(tj3Var9, e16VarM3912B0);
                    se1.f60731q.getClass();
                    ui3 ui3Var5 = C0352b.f4299b;
                    tj3Var9.m22119f0();
                    if (tj3Var9.f62384S) {
                        tj3Var9.m22130l(ui3Var5);
                    } else {
                        tj3Var9.m22137o0();
                    }
                    zi3 zi3Var17 = C0352b.f4303f;
                    oha.m18001g(tj3Var9, zi3Var17, bb1VarM230a4);
                    zi3 zi3Var18 = C0352b.f4302e;
                    oha.m18001g(tj3Var9, zi3Var18, l77VarM22132m10);
                    Integer numValueOf5 = Integer.valueOf(iHashCode10);
                    zi3 zi3Var19 = C0352b.f4304g;
                    oha.m18001g(tj3Var9, zi3Var19, numValueOf5);
                    vi3 vi3Var5 = C0352b.f4305h;
                    oha.m18000f(tj3Var9, vi3Var5);
                    zi3 zi3Var20 = C0352b.f4301d;
                    oha.m18001g(tj3Var9, zi3Var20, e16VarM1322c10);
                    e16 e16VarM4412e4 = c99.m4412e(ox1.m18559e(b16Var), 1.0f);
                    zf1 zf1Var3 = ge9.f40637a;
                    e16 e16VarM21607T3 = AbstractC3584sr.m21607T(e16VarM4412e4, ((fe9) tj3Var9.m22128k(zf1Var3)).f38960i);
                    bb1 bb1VarM230a5 = ab1.m230a(new C3661uu(((fe9) tj3Var9.m22128k(zf1Var3)).f38959h, true, new gm5(28)), ec0Var2, tj3Var9, 48);
                    int iHashCode11 = Long.hashCode(tj3Var9.f62385T);
                    l77 l77VarM22132m11 = tj3Var9.m22132m();
                    e16 e16VarM1322c11 = AbstractC0287b.m1322c(tj3Var9, e16VarM21607T3);
                    tj3Var9.m22119f0();
                    if (tj3Var9.f62384S) {
                        tj3Var9.m22130l(ui3Var5);
                    } else {
                        tj3Var9.m22137o0();
                    }
                    oha.m18001g(tj3Var9, zi3Var17, bb1VarM230a5);
                    oha.m18001g(tj3Var9, zi3Var18, l77VarM22132m11);
                    AbstractC3393o1.m17747v(iHashCode11, tj3Var9, zi3Var19, tj3Var9, vi3Var5);
                    oha.m18001g(tj3Var9, zi3Var20, e16VarM1322c11);
                    us1.m22894g(vs1Var, tj3Var9, 0);
                    us1.m22893f(vs1Var.f65835c, vs1Var.f65836d, null, tj3Var9, 0);
                    us1.m22888a(0, tj3Var9, null, vs1Var.f65839g);
                    tj3Var9.m22111b0(-1080288107);
                    ListBuilder listBuilderM23650t = vz1.m23650t();
                    tj3Var9.m22111b0(-1080287198);
                    for (is1 is1Var : vs1Var.f65842j) {
                        int i5 = is1Var.f44479a;
                        int i6 = is1Var.f44480b;
                        if (i5 == 1) {
                            i2 = com.lingq.feature.challenges.R$string.cup_badge_joined;
                        } else if (i5 == 2) {
                            i2 = com.lingq.feature.challenges.R$string.cup_badge_regular;
                        } else if (i5 != 3) {
                            i2 = i5 != 4 ? com.lingq.feature.challenges.R$string.cup_badge_mvp : com.lingq.feature.challenges.R$string.cup_badge_relentless;
                        } else {
                            i2 = com.lingq.feature.challenges.R$string.cup_badge_devoted;
                        }
                        String strM23620a0 = vz1.m23620a0(tj3Var9, i2);
                        if (i5 == 1) {
                            tj3Var9.m22111b0(-621614211);
                            strM23618Z = vz1.m23618Z(com.lingq.feature.challenges.R$string.cup_badge_level, new Object[]{Integer.valueOf(i6)}, tj3Var9);
                            tj3Var9.m22139q(false);
                        } else {
                            tj3Var9.m22111b0(-621509090);
                            strM23618Z = vz1.m23618Z(com.lingq.feature.challenges.R$string.cup_badge_days, new Object[]{Integer.valueOf(i6)}, tj3Var9);
                            tj3Var9.m22139q(false);
                        }
                        boolean z = is1Var.f44481c;
                        if (i5 == 1) {
                            i3 = com.lingq.feature.challenges.R$drawable.im_cup_joined;
                        } else if (i5 == 2) {
                            i3 = com.lingq.feature.challenges.R$drawable.im_cup_regular;
                        } else if (i5 != 3) {
                            i3 = i5 != 4 ? com.lingq.feature.challenges.R$drawable.im_cup_mvp : com.lingq.feature.challenges.R$drawable.im_cup_relentless;
                        } else {
                            i3 = com.lingq.feature.challenges.R$drawable.im_cup_devoted;
                        }
                        listBuilderM23650t.add(new qs1(strM23620a0, i3, strM23618Z, z));
                    }
                    tj3Var9.m22139q(false);
                    listBuilderM23650t.add(new qs1(vz1.m23620a0(tj3Var9, com.lingq.feature.challenges.R$string.cup_badge_champion), com.lingq.feature.challenges.R$drawable.im_cup_champion, vz1.m23620a0(tj3Var9, com.lingq.feature.challenges.R$string.cup_badge_team_wins), vs1Var.f65840h));
                    ListBuilder listBuilderM23635i = vz1.m23635i(listBuilderM23650t);
                    tj3Var9.m22139q(false);
                    us1.m22890c(0, tj3Var9, null, listBuilderM23635i);
                    tj3Var9.m22139q(true);
                    tj3Var9.m22139q(true);
                } else {
                    tj3Var9.m22102U();
                }
                return xfaVar;
            case 9:
                fz1 fz1Var = (fz1) obj4;
                ye1 ye1Var10 = (ye1) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                ((db1) obj).getClass();
                boolean z2 = (iIntValue10 & 17) != 16;
                int i7 = iIntValue10 & 1;
                tj3 tj3Var10 = (tj3) ye1Var10;
                if (tj3Var10.m22099R(i7, z2)) {
                    fad.m11682e(fz1Var, false, false, tj3Var10, 48, 4);
                } else {
                    tj3Var10.m22102U();
                }
                return xfaVar;
            case 10:
                ru1 ru1Var = (ru1) obj4;
                ye1 ye1Var11 = (ye1) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                ((db1) obj).getClass();
                tj3 tj3Var11 = (tj3) ye1Var11;
                if (tj3Var11.m22099R(iIntValue11 & 1, (iIntValue11 & 17) != 16)) {
                    qu1.m20170g("🪙", xs1.f68618k, vz1.m23620a0(tj3Var11, com.lingq.feature.challenges.R$string.cup_results_total_coins), String.format("%,d", Arrays.copyOf(new Object[]{Integer.valueOf(ru1Var.f59812a)}, 1)), tj3Var11, 54);
                    pb1.m19031a(0.0f, 0, 3, ((ms5) tj3Var11.m22128k(ps5.f56764b)).f51799a.f55817B, tj3Var11, null);
                    qu1.m20170g("🔥", xs1.f68620m, vz1.m23620a0(tj3Var11, com.lingq.feature.challenges.R$string.cup_stat_days_active), String.valueOf(ru1Var.f59813b), tj3Var11, 54);
                } else {
                    tj3Var11.m22102U();
                }
                return xfaVar;
            case 11:
                lv1 lv1Var = (lv1) obj4;
                ye1 ye1Var12 = (ye1) obj2;
                int iIntValue12 = ((Integer) obj3).intValue();
                ((vv4) obj).getClass();
                tj3 tj3Var12 = (tj3) ye1Var12;
                if (tj3Var12.m22099R(iIntValue12 & 1, (iIntValue12 & 17) != 16)) {
                    rv1.m20857b(lv1Var.f50172c, lv1Var.f50170a, null, tj3Var12, 0);
                } else {
                    tj3Var12.m22102U();
                }
                return xfaVar;
            case 12:
                ra4 ra4Var = (ra4) obj4;
                ye1 ye1Var13 = (ye1) obj2;
                int iIntValue13 = ((Integer) obj3).intValue();
                ((ft4) obj).getClass();
                tj3 tj3Var13 = (tj3) ye1Var13;
                if (tj3Var13.m22099R(iIntValue13 & 1, (iIntValue13 & 17) != 16)) {
                    List list = ra4Var.f58964c;
                    ArrayList arrayList = new ArrayList(v91.m23189q0(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((Referral) it.next()).f19832a);
                    }
                    igd.m13904c(null, arrayList, ra4Var.f58962a, ra4Var.f58963b, tj3Var13, 0);
                } else {
                    tj3Var13.m22102U();
                }
                return xfaVar;
            case 13:
                zh9 zh9Var = (zh9) obj4;
                ye1 ye1Var14 = (ye1) obj2;
                int iIntValue14 = ((Integer) obj3).intValue();
                ((tj8) obj).getClass();
                tj3 tj3Var14 = (tj3) ye1Var14;
                if (tj3Var14.m22099R(iIntValue14 & 1, (iIntValue14 & 17) != 16)) {
                    lw9.m16554b(vz1.m23620a0(tj3Var14, AbstractC3423or.m18224I(zh9Var.mo24520a())), c99.m4430w(b16Var, null, 3), 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var14, 48, 0, 262140);
                    ty3.m22351a(pvc.m19521q(), null, null, 0L, tj3Var14, 48, 12);
                } else {
                    tj3Var14.m22102U();
                }
                return xfaVar;
            case 14:
                return m21292d(obj, obj2, obj3);
            case 15:
                return m21293g(obj, obj2, obj3);
            case 16:
                uw4 uw4Var = (uw4) obj4;
                ye1 ye1Var15 = (ye1) obj2;
                int iIntValue15 = ((Integer) obj3).intValue();
                ((tj8) obj).getClass();
                tj3 tj3Var15 = (tj3) ye1Var15;
                if (tj3Var15.m22099R(iIntValue15 & 1, (iIntValue15 & 17) != 16)) {
                    lw9.m16554b(uw4Var.f64466c, null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var15, 0, 0, 262142);
                } else {
                    tj3Var15.m22102U();
                }
                return xfaVar;
            case 17:
                return m21294j(obj, obj2, obj3);
            case 18:
                return m21295k(obj, obj2, obj3);
            case 19:
                return m21296l(obj, obj2, obj3);
            case 20:
                return m21297m(obj, obj2, obj3);
            case 21:
                return m21298n(obj, obj2, obj3);
            case 22:
                return m21299o(obj, obj2, obj3);
            case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                return m21300p(obj, obj2, obj3);
            case 24:
                return m21301q(obj, obj2, obj3);
            case 25:
                return m21302r(obj, obj2, obj3);
            case 26:
                return m21303s(obj, obj2, obj3);
            case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                return m21304t(obj, obj2, obj3);
            case 28:
                return m21305u(obj, obj2, obj3);
            default:
                ze8 ze8Var = (ze8) obj4;
                ye1 ye1Var16 = (ye1) obj2;
                int iIntValue16 = ((Integer) obj3).intValue();
                ((db1) obj).getClass();
                tj3 tj3Var16 = (tj3) ye1Var16;
                if (tj3Var16.m22099R(iIntValue16 & 1, (iIntValue16 & 17) != 16)) {
                    e16 e16VarM21608U = AbstractC3584sr.m21608U(c99.m4412e(b16Var, 1.0f), ge9.m12515a(tj3Var16).f38956e, ge9.m12515a(tj3Var16).f38957f);
                    bb1 bb1VarM230a6 = ab1.m230a(new C3661uu(ge9.m12515a(tj3Var16).f38956e, true, new gm5(28)), nj0.f52792K, tj3Var16, 48);
                    int iHashCode12 = Long.hashCode(tj3Var16.f62385T);
                    l77 l77VarM22132m12 = tj3Var16.m22132m();
                    e16 e16VarM1322c12 = AbstractC0287b.m1322c(tj3Var16, e16VarM21608U);
                    se1.f60731q.getClass();
                    ui3 ui3Var6 = C0352b.f4299b;
                    tj3Var16.m22119f0();
                    if (tj3Var16.f62384S) {
                        tj3Var16.m22130l(ui3Var6);
                    } else {
                        tj3Var16.m22137o0();
                    }
                    oha.m18001g(tj3Var16, C0352b.f4303f, bb1VarM230a6);
                    oha.m18001g(tj3Var16, C0352b.f4302e, l77VarM22132m12);
                    oha.m18001g(tj3Var16, C0352b.f4304g, Integer.valueOf(iHashCode12));
                    oha.m18000f(tj3Var16, C0352b.f4305h);
                    oha.m18001g(tj3Var16, C0352b.f4301d, e16VarM1322c12);
                    lw9.m16554b(vz1.m23620a0(tj3Var16, com.lingq.feature.review.R$string.review_complete_keep_up_good_work), null, cx2.m9917a(tj3Var16).m4212e(), null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var16).f71404h, tj3Var16, 0, 0, 131066);
                    lw9.m16554b(ze8Var.f71461a + "/" + ze8Var.f71462b, null, cx2.m9917a(tj3Var16).m4212e(), null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var16).f71399c, tj3Var16, 0, 0, 131066);
                    tj3Var16.m22139q(true);
                } else {
                    tj3Var16.m22102U();
                }
                return xfaVar;
        }
    }
}
