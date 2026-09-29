package p000;

import com.lingq.core.database.entity.CardEntity;
import com.lingq.core.database.entity.ChallengeRankingEntity;
import com.lingq.core.database.entity.WordEntity;
import com.lingq.core.domain.model.challenge.ChallengeProfile;
import com.lingq.core.domain.model.offer.OfferBanner;
import com.lingq.core.domain.model.token.TextToSpeechAppVoice;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class sn0 extends r46 {

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ bq1 f61044A;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ int f61045z;

    public /* synthetic */ sn0(bq1 bq1Var, int i) {
        this.f61045z = i;
        this.f61044A = bq1Var;
    }

    @Override // p000.r46
    /* JADX INFO: renamed from: l */
    public final void mo17164l(ik8 ik8Var, Object obj) {
        String strM10322b;
        int i = this.f61045z;
        bq1 bq1Var = this.f61044A;
        switch (i) {
            case 0:
                CardEntity cardEntity = (CardEntity) obj;
                un0 un0Var = (un0) bq1Var;
                ik8Var.getClass();
                cardEntity.getClass();
                ik8Var.mo2874C(1, cardEntity.m7544y());
                ik8Var.mo2874C(2, cardEntity.m7545z());
                ik8Var.mo2878j(3, cardEntity.m7531l());
                String strM7518A = cardEntity.m7518A();
                if (strM7518A == null) {
                    ik8Var.mo2880m(4);
                } else {
                    ik8Var.mo2874C(4, strM7518A);
                }
                String strM7524e = cardEntity.m7524e();
                if (strM7524e == null) {
                    ik8Var.mo2880m(5);
                } else {
                    ik8Var.mo2874C(5, strM7524e);
                }
                ik8Var.mo2878j(6, cardEntity.m7542w());
                Integer numM7523d = cardEntity.m7523d();
                if (numM7523d == null) {
                    ik8Var.mo2880m(7);
                } else {
                    ik8Var.mo2878j(7, numM7523d.intValue());
                }
                String strM7534o = cardEntity.m7534o();
                if (strM7534o == null) {
                    ik8Var.mo2880m(8);
                } else {
                    ik8Var.mo2874C(8, strM7534o);
                }
                String strM7541v = cardEntity.m7541v();
                if (strM7541v == null) {
                    ik8Var.mo2880m(9);
                } else {
                    ik8Var.mo2874C(9, strM7541v);
                }
                String strM7538s = cardEntity.m7538s();
                if (strM7538s == null) {
                    ik8Var.mo2880m(10);
                } else {
                    ik8Var.mo2874C(10, strM7538s);
                }
                String strM7521b = cardEntity.m7521b();
                if (strM7521b == null) {
                    ik8Var.mo2880m(11);
                } else {
                    ik8Var.mo2874C(11, strM7521b);
                }
                ik8Var.mo2878j(12, cardEntity.m7532m());
                qn3 qn3Var = un0Var.f64104N;
                ik8Var.mo2874C(13, qn3Var.m20080z(cardEntity.m7537r()));
                ik8Var.mo2874C(14, cardEntity.m7536q());
                String strM20079y = qn3Var.m20079y(cardEntity.m7543x());
                if (strM20079y == null) {
                    ik8Var.mo2880m(15);
                } else {
                    ik8Var.mo2874C(15, strM20079y);
                }
                String strM20079y2 = qn3Var.m20079y(cardEntity.m7527h());
                if (strM20079y2 == null) {
                    ik8Var.mo2880m(16);
                } else {
                    ik8Var.mo2874C(16, strM20079y2);
                }
                String strM20079y3 = qn3Var.m20079y(cardEntity.m7519B());
                if (strM20079y3 == null) {
                    ik8Var.mo2880m(17);
                } else {
                    ik8Var.mo2874C(17, strM20079y3);
                }
                String strM7530k = cardEntity.m7530k();
                if (strM7530k == null) {
                    ik8Var.mo2880m(18);
                } else {
                    ik8Var.mo2874C(18, strM7530k);
                }
                String strM7540u = cardEntity.m7540u();
                if (strM7540u == null) {
                    ik8Var.mo2880m(19);
                } else {
                    ik8Var.mo2874C(19, strM7540u);
                }
                String strM7539t = cardEntity.m7539t();
                if (strM7539t == null) {
                    ik8Var.mo2880m(20);
                } else {
                    ik8Var.mo2874C(20, strM7539t);
                }
                String strM7529j = cardEntity.m7529j();
                if (strM7529j == null) {
                    ik8Var.mo2880m(21);
                } else {
                    ik8Var.mo2874C(21, strM7529j);
                }
                String strM7528i = cardEntity.m7528i();
                if (strM7528i == null) {
                    ik8Var.mo2880m(22);
                } else {
                    ik8Var.mo2874C(22, strM7528i);
                }
                String strM7533n = cardEntity.m7533n();
                if (strM7533n == null) {
                    ik8Var.mo2880m(23);
                } else {
                    ik8Var.mo2874C(23, strM7533n);
                }
                String strM7525f = cardEntity.m7525f();
                if (strM7525f == null) {
                    ik8Var.mo2880m(24);
                } else {
                    ik8Var.mo2874C(24, strM7525f);
                }
                String strM7526g = cardEntity.m7526g();
                if (strM7526g == null) {
                    ik8Var.mo2880m(25);
                } else {
                    ik8Var.mo2874C(25, strM7526g);
                }
                String strM7535p = cardEntity.m7535p();
                if (strM7535p == null) {
                    ik8Var.mo2880m(26);
                } else {
                    ik8Var.mo2874C(26, strM7535p);
                }
                ik8Var.mo2878j(27, cardEntity.m7520C() ? 1L : 0L);
                String strM7522c = cardEntity.m7522c();
                if (strM7522c != null) {
                    ik8Var.mo2874C(28, strM7522c);
                } else {
                    ik8Var.mo2880m(28);
                }
                break;
            case 1:
                ChallengeRankingEntity challengeRankingEntity = (ChallengeRankingEntity) obj;
                ik8Var.getClass();
                challengeRankingEntity.getClass();
                ik8Var.mo2874C(1, challengeRankingEntity.m7550c());
                ik8Var.mo2874C(2, challengeRankingEntity.m7552e());
                ik8Var.mo2878j(3, challengeRankingEntity.m7554g());
                ik8Var.mo2874C(4, challengeRankingEntity.m7551d());
                ChallengeProfile challengeProfileM7553f = challengeRankingEntity.m7553f();
                qn3 qn3Var2 = ((yp0) bq1Var).f70237O;
                if (challengeProfileM7553f != null) {
                    yf4 yf4Var = (yf4) qn3Var2.f57974a;
                    yf4Var.getClass();
                    strM10322b = yf4Var.m10322b(ChallengeProfile.Companion.serializer(), challengeProfileM7553f);
                } else {
                    qn3Var2.getClass();
                    strM10322b = null;
                }
                if (strM10322b == null) {
                    ik8Var.mo2880m(5);
                } else {
                    ik8Var.mo2874C(5, strM10322b);
                }
                ik8Var.mo2878j(6, challengeRankingEntity.m7555h());
                ik8Var.mo2878j(7, challengeRankingEntity.m7556i());
                ik8Var.mo2878j(8, challengeRankingEntity.m7557j() ? 1L : 0L);
                ik8Var.mo2874C(9, challengeRankingEntity.m7549b());
                ik8Var.mo2874C(10, challengeRankingEntity.m7548a());
                break;
            case 2:
                u85 u85Var = (u85) obj;
                qn3 qn3Var3 = ((io1) bq1Var).f44345M;
                ik8Var.getClass();
                u85Var.getClass();
                ik8Var.mo2878j(1, u85Var.f63562a);
                ik8Var.mo2874C(2, u85Var.f63563b);
                String str = u85Var.f63564c;
                if (str == null) {
                    ik8Var.mo2880m(3);
                } else {
                    ik8Var.mo2874C(3, str);
                }
                String str2 = u85Var.f63565d;
                if (str2 == null) {
                    ik8Var.mo2880m(4);
                } else {
                    ik8Var.mo2874C(4, str2);
                }
                ik8Var.mo2878j(5, u85Var.f63566e);
                String str3 = u85Var.f63567f;
                if (str3 == null) {
                    ik8Var.mo2880m(6);
                } else {
                    ik8Var.mo2874C(6, str3);
                }
                String str4 = u85Var.f63568g;
                if (str4 == null) {
                    ik8Var.mo2880m(7);
                } else {
                    ik8Var.mo2874C(7, str4);
                }
                String str5 = u85Var.f63569h;
                if (str5 == null) {
                    ik8Var.mo2880m(8);
                } else {
                    ik8Var.mo2874C(8, str5);
                }
                String str6 = u85Var.f63570i;
                if (str6 == null) {
                    ik8Var.mo2880m(9);
                } else {
                    ik8Var.mo2874C(9, str6);
                }
                String str7 = u85Var.f63571j;
                if (str7 == null) {
                    ik8Var.mo2880m(10);
                } else {
                    ik8Var.mo2874C(10, str7);
                }
                Integer num = u85Var.f63572k;
                if (num == null) {
                    ik8Var.mo2880m(11);
                } else {
                    ik8Var.mo2878j(11, num.intValue());
                }
                String str8 = u85Var.f63573l;
                if (str8 == null) {
                    ik8Var.mo2880m(12);
                } else {
                    ik8Var.mo2874C(12, str8);
                }
                String str9 = u85Var.f63574m;
                if (str9 == null) {
                    ik8Var.mo2880m(13);
                } else {
                    ik8Var.mo2874C(13, str9);
                }
                String str10 = u85Var.f63575n;
                if (str10 == null) {
                    ik8Var.mo2880m(14);
                } else {
                    ik8Var.mo2874C(14, str10);
                }
                String str11 = u85Var.f63576o;
                if (str11 == null) {
                    ik8Var.mo2880m(15);
                } else {
                    ik8Var.mo2874C(15, str11);
                }
                String str12 = u85Var.f63577p;
                if (str12 == null) {
                    ik8Var.mo2880m(16);
                } else {
                    ik8Var.mo2874C(16, str12);
                }
                String str13 = u85Var.f63578q;
                if (str13 == null) {
                    ik8Var.mo2880m(17);
                } else {
                    ik8Var.mo2874C(17, str13);
                }
                String str14 = u85Var.f63579r;
                if (str14 == null) {
                    ik8Var.mo2880m(18);
                } else {
                    ik8Var.mo2874C(18, str14);
                }
                String str15 = u85Var.f63580s;
                if (str15 == null) {
                    ik8Var.mo2880m(19);
                } else {
                    ik8Var.mo2874C(19, str15);
                }
                String str16 = u85Var.f63581t;
                if (str16 == null) {
                    ik8Var.mo2880m(20);
                } else {
                    ik8Var.mo2874C(20, str16);
                }
                ik8Var.mo2878j(21, u85Var.f63582u);
                ik8Var.mo2878j(22, u85Var.f63583v);
                String str17 = u85Var.f63584w;
                if (str17 == null) {
                    ik8Var.mo2880m(23);
                } else {
                    ik8Var.mo2874C(23, str17);
                }
                ik8Var.mo2878j(24, u85Var.f63585x);
                ik8Var.mo2878j(25, u85Var.f63586y);
                ik8Var.mo2878j(26, u85Var.f63587z);
                Integer num2 = u85Var.f63539A;
                if (num2 == null) {
                    ik8Var.mo2880m(27);
                } else {
                    ik8Var.mo2878j(27, num2.intValue());
                }
                Integer num3 = u85Var.f63540B;
                if (num3 == null) {
                    ik8Var.mo2880m(28);
                } else {
                    ik8Var.mo2878j(28, num3.intValue());
                }
                String str18 = u85Var.f63541C;
                if (str18 == null) {
                    ik8Var.mo2880m(29);
                } else {
                    ik8Var.mo2874C(29, str18);
                }
                ik8Var.mo2877g(30, u85Var.f63542D);
                ik8Var.mo2878j(31, u85Var.f63543E ? 1L : 0L);
                String strM20079y4 = qn3Var3.m20079y(u85Var.f63544F);
                if (strM20079y4 == null) {
                    ik8Var.mo2880m(32);
                } else {
                    ik8Var.mo2874C(32, strM20079y4);
                }
                String str19 = u85Var.f63545G;
                if (str19 == null) {
                    ik8Var.mo2880m(33);
                } else {
                    ik8Var.mo2874C(33, str19);
                }
                String strM20079y5 = qn3Var3.m20079y(u85Var.f63546H);
                if (strM20079y5 == null) {
                    ik8Var.mo2880m(34);
                } else {
                    ik8Var.mo2874C(34, strM20079y5);
                }
                Float f = u85Var.f63547I;
                if (f == null) {
                    ik8Var.mo2880m(35);
                } else {
                    ik8Var.mo2877g(35, f.floatValue());
                }
                Boolean bool = u85Var.f63548J;
                Integer numValueOf = bool != null ? Integer.valueOf(bool.booleanValue() ? 1 : 0) : null;
                if (numValueOf == null) {
                    ik8Var.mo2880m(36);
                } else {
                    ik8Var.mo2878j(36, numValueOf.intValue());
                }
                ik8Var.mo2874C(37, u85Var.f63549K);
                String str20 = u85Var.f63550L;
                if (str20 == null) {
                    ik8Var.mo2880m(38);
                } else {
                    ik8Var.mo2874C(38, str20);
                }
                String str21 = u85Var.f63551M;
                if (str21 == null) {
                    ik8Var.mo2880m(39);
                } else {
                    ik8Var.mo2874C(39, str21);
                }
                ik8Var.mo2877g(40, u85Var.f63552N);
                ik8Var.mo2877g(41, u85Var.f63553O);
                ik8Var.mo2878j(42, u85Var.f63554P ? 1L : 0L);
                ik8Var.mo2878j(43, u85Var.f63555Q ? 1L : 0L);
                String str22 = u85Var.f63556R;
                if (str22 == null) {
                    ik8Var.mo2880m(44);
                } else {
                    ik8Var.mo2874C(44, str22);
                }
                String str23 = u85Var.f63557S;
                if (str23 == null) {
                    ik8Var.mo2880m(45);
                } else {
                    ik8Var.mo2874C(45, str23);
                }
                String str24 = u85Var.f63558T;
                if (str24 == null) {
                    ik8Var.mo2880m(46);
                } else {
                    ik8Var.mo2874C(46, str24);
                }
                Boolean bool2 = u85Var.f63559U;
                Integer numValueOf2 = bool2 != null ? Integer.valueOf(bool2.booleanValue() ? 1 : 0) : null;
                if (numValueOf2 == null) {
                    ik8Var.mo2880m(47);
                } else {
                    ik8Var.mo2878j(47, numValueOf2.intValue());
                }
                String str25 = u85Var.f63560V;
                if (str25 == null) {
                    ik8Var.mo2880m(48);
                } else {
                    ik8Var.mo2874C(48, str25);
                }
                ik8Var.mo2878j(49, u85Var.f63561W ? 1L : 0L);
                break;
            case 3:
                yp6 yp6Var = (yp6) obj;
                ik8Var.getClass();
                yp6Var.getClass();
                ik8Var.mo2878j(1, yp6Var.m25255m());
                ik8Var.mo2874C(2, yp6Var.m25257o());
                ik8Var.mo2874C(3, yp6Var.m25247e());
                ik8Var.mo2874C(4, yp6Var.m25259q());
                ik8Var.mo2874C(5, yp6Var.m25260r());
                ik8Var.mo2874C(6, yp6Var.m25253k());
                ik8Var.mo2874C(7, yp6Var.m25252j());
                String strM25251i = yp6Var.m25251i();
                if (strM25251i == null) {
                    ik8Var.mo2880m(8);
                } else {
                    ik8Var.mo2874C(8, strM25251i);
                }
                ik8Var.mo2878j(9, yp6Var.m25248f() ? 1L : 0L);
                ik8Var.mo2878j(10, yp6Var.m25249g() ? 1L : 0L);
                ik8Var.mo2878j(11, yp6Var.m25261s() ? 1L : 0L);
                Integer numM25256n = yp6Var.m25256n();
                if (numM25256n == null) {
                    ik8Var.mo2880m(12);
                } else {
                    ik8Var.mo2878j(12, numM25256n.intValue());
                }
                String strM25250h = yp6Var.m25250h();
                if (strM25250h == null) {
                    ik8Var.mo2880m(13);
                } else {
                    ik8Var.mo2874C(13, strM25250h);
                }
                String strM25245c = yp6Var.m25245c();
                if (strM25245c == null) {
                    ik8Var.mo2880m(14);
                } else {
                    ik8Var.mo2874C(14, strM25245c);
                }
                ik8Var.mo2874C(15, yp6Var.m25254l());
                ik8Var.mo2874C(16, yp6Var.m25244b());
                ik8Var.mo2874C(17, yp6Var.m25243a());
                ik8Var.mo2874C(18, yp6Var.m25258p());
                qn3 qn3Var4 = ((xp6) bq1Var).f68495M;
                List listM25246d = yp6Var.m25246d();
                qn3Var4.getClass();
                listM25246d.getClass();
                yf4 yf4Var2 = (yf4) qn3Var4.f57974a;
                yf4Var2.getClass();
                ik8Var.mo2874C(19, yf4Var2.m10322b(new C2978ev(OfferBanner.Companion.serializer()), listM25246d));
                break;
            case 4:
                dda ddaVar = (dda) obj;
                ik8Var.getClass();
                ddaVar.getClass();
                ik8Var.mo2874C(1, ddaVar.f35467a);
                ik8Var.mo2874C(2, ddaVar.f35468b);
                qn3 qn3Var5 = ((zca) bq1Var).f71371M;
                List list = ddaVar.f35469c;
                qn3Var5.getClass();
                list.getClass();
                yf4 yf4Var3 = (yf4) qn3Var5.f57974a;
                yf4Var3.getClass();
                ik8Var.mo2874C(3, yf4Var3.m10322b(new C2978ev(TextToSpeechAppVoice.Companion.serializer()), list));
                Boolean bool3 = ddaVar.f35470d;
                Integer numValueOf3 = bool3 != null ? Integer.valueOf(bool3.booleanValue() ? 1 : 0) : null;
                if (numValueOf3 == null) {
                    ik8Var.mo2880m(4);
                } else {
                    ik8Var.mo2878j(4, numValueOf3.intValue());
                }
                ik8Var.mo2878j(5, ddaVar.f35471e ? 1L : 0L);
                ik8Var.mo2878j(6, ddaVar.f35472f ? 1L : 0L);
                String strM20079y6 = qn3Var5.m20079y(ddaVar.f35473g);
                if (strM20079y6 == null) {
                    ik8Var.mo2880m(7);
                } else {
                    ik8Var.mo2874C(7, strM20079y6);
                }
                String str26 = ddaVar.f35474h;
                if (str26 == null) {
                    ik8Var.mo2880m(8);
                } else {
                    ik8Var.mo2874C(8, str26);
                }
                ik8Var.mo2878j(9, ddaVar.f35475i ? 1L : 0L);
                String strM20079y7 = qn3Var5.m20079y(ddaVar.f35476j);
                if (strM20079y7 != null) {
                    ik8Var.mo2874C(10, strM20079y7);
                } else {
                    ik8Var.mo2880m(10);
                }
                break;
            case 5:
                CardEntity cardEntity2 = (CardEntity) obj;
                rxa rxaVar = (rxa) bq1Var;
                ik8Var.getClass();
                cardEntity2.getClass();
                ik8Var.mo2874C(1, cardEntity2.m7544y());
                ik8Var.mo2874C(2, cardEntity2.m7545z());
                ik8Var.mo2878j(3, cardEntity2.m7531l());
                String strM7518A2 = cardEntity2.m7518A();
                if (strM7518A2 == null) {
                    ik8Var.mo2880m(4);
                } else {
                    ik8Var.mo2874C(4, strM7518A2);
                }
                String strM7524e2 = cardEntity2.m7524e();
                if (strM7524e2 == null) {
                    ik8Var.mo2880m(5);
                } else {
                    ik8Var.mo2874C(5, strM7524e2);
                }
                ik8Var.mo2878j(6, cardEntity2.m7542w());
                Integer numM7523d2 = cardEntity2.m7523d();
                if (numM7523d2 == null) {
                    ik8Var.mo2880m(7);
                } else {
                    ik8Var.mo2878j(7, numM7523d2.intValue());
                }
                String strM7534o2 = cardEntity2.m7534o();
                if (strM7534o2 == null) {
                    ik8Var.mo2880m(8);
                } else {
                    ik8Var.mo2874C(8, strM7534o2);
                }
                String strM7541v2 = cardEntity2.m7541v();
                if (strM7541v2 == null) {
                    ik8Var.mo2880m(9);
                } else {
                    ik8Var.mo2874C(9, strM7541v2);
                }
                String strM7538s2 = cardEntity2.m7538s();
                if (strM7538s2 == null) {
                    ik8Var.mo2880m(10);
                } else {
                    ik8Var.mo2874C(10, strM7538s2);
                }
                String strM7521b2 = cardEntity2.m7521b();
                if (strM7521b2 == null) {
                    ik8Var.mo2880m(11);
                } else {
                    ik8Var.mo2874C(11, strM7521b2);
                }
                ik8Var.mo2878j(12, cardEntity2.m7532m());
                qn3 qn3Var6 = rxaVar.f60014L;
                ik8Var.mo2874C(13, qn3Var6.m20080z(cardEntity2.m7537r()));
                ik8Var.mo2874C(14, cardEntity2.m7536q());
                String strM20079y8 = qn3Var6.m20079y(cardEntity2.m7543x());
                if (strM20079y8 == null) {
                    ik8Var.mo2880m(15);
                } else {
                    ik8Var.mo2874C(15, strM20079y8);
                }
                String strM20079y9 = qn3Var6.m20079y(cardEntity2.m7527h());
                if (strM20079y9 == null) {
                    ik8Var.mo2880m(16);
                } else {
                    ik8Var.mo2874C(16, strM20079y9);
                }
                String strM20079y10 = qn3Var6.m20079y(cardEntity2.m7519B());
                if (strM20079y10 == null) {
                    ik8Var.mo2880m(17);
                } else {
                    ik8Var.mo2874C(17, strM20079y10);
                }
                String strM7530k2 = cardEntity2.m7530k();
                if (strM7530k2 == null) {
                    ik8Var.mo2880m(18);
                } else {
                    ik8Var.mo2874C(18, strM7530k2);
                }
                String strM7540u2 = cardEntity2.m7540u();
                if (strM7540u2 == null) {
                    ik8Var.mo2880m(19);
                } else {
                    ik8Var.mo2874C(19, strM7540u2);
                }
                String strM7539t2 = cardEntity2.m7539t();
                if (strM7539t2 == null) {
                    ik8Var.mo2880m(20);
                } else {
                    ik8Var.mo2874C(20, strM7539t2);
                }
                String strM7529j2 = cardEntity2.m7529j();
                if (strM7529j2 == null) {
                    ik8Var.mo2880m(21);
                } else {
                    ik8Var.mo2874C(21, strM7529j2);
                }
                String strM7528i2 = cardEntity2.m7528i();
                if (strM7528i2 == null) {
                    ik8Var.mo2880m(22);
                } else {
                    ik8Var.mo2874C(22, strM7528i2);
                }
                String strM7533n2 = cardEntity2.m7533n();
                if (strM7533n2 == null) {
                    ik8Var.mo2880m(23);
                } else {
                    ik8Var.mo2874C(23, strM7533n2);
                }
                String strM7525f2 = cardEntity2.m7525f();
                if (strM7525f2 == null) {
                    ik8Var.mo2880m(24);
                } else {
                    ik8Var.mo2874C(24, strM7525f2);
                }
                String strM7526g2 = cardEntity2.m7526g();
                if (strM7526g2 == null) {
                    ik8Var.mo2880m(25);
                } else {
                    ik8Var.mo2874C(25, strM7526g2);
                }
                String strM7535p2 = cardEntity2.m7535p();
                if (strM7535p2 == null) {
                    ik8Var.mo2880m(26);
                } else {
                    ik8Var.mo2874C(26, strM7535p2);
                }
                ik8Var.mo2878j(27, cardEntity2.m7520C() ? 1L : 0L);
                String strM7522c2 = cardEntity2.m7522c();
                if (strM7522c2 != null) {
                    ik8Var.mo2874C(28, strM7522c2);
                } else {
                    ik8Var.mo2880m(28);
                }
                break;
            default:
                WordEntity wordEntity = (WordEntity) obj;
                o7b o7bVar = (o7b) bq1Var;
                ik8Var.getClass();
                wordEntity.getClass();
                ik8Var.mo2874C(1, wordEntity.m7839o());
                ik8Var.mo2874C(2, wordEntity.m7838n());
                ik8Var.mo2878j(3, wordEntity.m7830f());
                String strM7836l = wordEntity.m7836l();
                if (strM7836l == null) {
                    ik8Var.mo2880m(4);
                } else {
                    ik8Var.mo2874C(4, strM7836l);
                }
                ik8Var.mo2878j(5, wordEntity.m7831g());
                ik8Var.mo2878j(6, wordEntity.m7840p() ? 1L : 0L);
                qn3 qn3Var7 = o7bVar.f53959M;
                ik8Var.mo2874C(7, qn3Var7.m20080z(wordEntity.m7833i()));
                String strM20079y11 = qn3Var7.m20079y(wordEntity.m7837m());
                if (strM20079y11 == null) {
                    ik8Var.mo2880m(8);
                } else {
                    ik8Var.mo2874C(8, strM20079y11);
                }
                String strM20079y12 = qn3Var7.m20079y(wordEntity.m7826b());
                if (strM20079y12 == null) {
                    ik8Var.mo2880m(9);
                } else {
                    ik8Var.mo2874C(9, strM20079y12);
                }
                String strM20079y13 = qn3Var7.m20079y(wordEntity.m7835k());
                if (strM20079y13 == null) {
                    ik8Var.mo2880m(10);
                } else {
                    ik8Var.mo2874C(10, strM20079y13);
                }
                String strM20079y14 = qn3Var7.m20079y(wordEntity.m7829e());
                if (strM20079y14 == null) {
                    ik8Var.mo2880m(11);
                } else {
                    ik8Var.mo2874C(11, strM20079y14);
                }
                String strM20079y15 = qn3Var7.m20079y(wordEntity.m7834j());
                if (strM20079y15 == null) {
                    ik8Var.mo2880m(12);
                } else {
                    ik8Var.mo2874C(12, strM20079y15);
                }
                String strM20079y16 = qn3Var7.m20079y(wordEntity.m7828d());
                if (strM20079y16 == null) {
                    ik8Var.mo2880m(13);
                } else {
                    ik8Var.mo2874C(13, strM20079y16);
                }
                String strM20079y17 = qn3Var7.m20079y(wordEntity.m7827c());
                if (strM20079y17 == null) {
                    ik8Var.mo2880m(14);
                } else {
                    ik8Var.mo2874C(14, strM20079y17);
                }
                String strM20079y18 = qn3Var7.m20079y(wordEntity.m7832h());
                if (strM20079y18 == null) {
                    ik8Var.mo2880m(15);
                } else {
                    ik8Var.mo2874C(15, strM20079y18);
                }
                ik8Var.mo2878j(16, wordEntity.m7825a());
                break;
        }
    }

    @Override // p000.r46
    /* JADX INFO: renamed from: s */
    public final String mo17165s() {
        switch (this.f61045z) {
            case 0:
                return "INSERT INTO `CardEntity` (`term`,`termWithLanguage`,`id`,`url`,`fragment`,`status`,`extendedStatus`,`lastReviewedCorrect`,`srsDueDate`,`notes`,`audio`,`importance`,`meanings`,`meaningTerms`,`tags`,`gTags`,`words`,`hiragana`,`romaji`,`pinyin`,`hant`,`hans`,`jyutping`,`chunk`,`furigana`,`latin`,`isPhrase`,`creationDate`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            case 1:
                return "INSERT INTO `ChallengeRankingEntity` (`challengeCode`,`metric`,`rank`,`language`,`profile`,`score`,`scoreBehindLeader`,`isCompleted`,`bookTitle`,`bookLanguage`) VALUES (?,?,?,?,?,?,?,?,?,?)";
            case 2:
                return "INSERT INTO `LibraryDataEntity` (`id`,`type`,`title`,`description`,`pos`,`url`,`sourceType`,`sourceName`,`sourceUrl`,`imageUrl`,`providerId`,`providerName`,`providerDescription`,`originalImageUrl`,`providerImageUrl`,`sharedById`,`sharedByName`,`sharedByImageUrl`,`sharedByRole`,`level`,`newWordsCount`,`lessonsCount`,`owner`,`price`,`cardsCount`,`rosesCount`,`duration`,`collectionId`,`collectionTitle`,`difficulty`,`isAvailable`,`tags`,`status`,`folders`,`progress`,`isTaken`,`lessonPreview`,`accent`,`audioUrl`,`listenTimes`,`readTimes`,`isCompleted`,`isFavorite`,`videoUrl`,`isLocked`,`lessonsSortBy`,`isSubscribed`,`originalUrl`,`isArchived`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            case 3:
                return "INSERT INTO `OfferEntity` (`id`,`title`,`code`,`type`,`visibility`,`dateStart`,`dateEnd`,`dateCountdown`,`countdownEnabled`,`countdownEnded`,`isActive`,`tier`,`ctaText`,`androidCoupon`,`discount`,`accentColorLight`,`accentColorDark`,`trialHeader`,`banners`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            case 4:
                return "INSERT INTO `TtsVoiceEntity` (`name`,`title`,`voicesByApp`,`alternative`,`isPremium`,`freeTrial`,`priority`,`accentCode`,`isSelectable`,`tags`) VALUES (?,?,?,?,?,?,?,?,?,?)";
            case 5:
                return "INSERT INTO `CardEntity` (`term`,`termWithLanguage`,`id`,`url`,`fragment`,`status`,`extendedStatus`,`lastReviewedCorrect`,`srsDueDate`,`notes`,`audio`,`importance`,`meanings`,`meaningTerms`,`tags`,`gTags`,`words`,`hiragana`,`romaji`,`pinyin`,`hant`,`hans`,`jyutping`,`chunk`,`furigana`,`latin`,`isPhrase`,`creationDate`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            default:
                return "INSERT INTO `WordEntity` (`termWithLanguage`,`term`,`id`,`status`,`importance`,`isPhrase`,`meanings`,`tags`,`gTags`,`romaji`,`hiragana`,`pinyin`,`hant`,`hans`,`jyutping`,`cardId`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }
    }
}
