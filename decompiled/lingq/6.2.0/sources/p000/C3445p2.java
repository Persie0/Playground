package p000;

import android.app.PendingIntent;
import android.content.Context;
import android.content.IntentSender;
import androidx.activity.result.IntentSenderRequest;
import androidx.compose.foundation.AbstractC0080f;
import androidx.compose.p002ui.focus.InterfaceC0300b;
import androidx.compose.p002ui.graphics.drawscope.InterfaceC0310a;
import androidx.compose.p002ui.platform.ComposeView;
import androidx.compose.runtime.internal.C0282a;
import androidx.lifecycle.Lifecycle$Event;
import androidx.lifecycle.Lifecycle$State;
import com.google.android.gms.auth.api.identity.AuthorizationResult;
import com.lingq.core.analytics.data.LqAnalyticsValues$LikeLocation;
import com.lingq.core.domain.model.challenge.ChallengeProfile;
import com.lingq.core.domain.model.challenge.ChallengeRanking;
import com.lingq.core.domain.model.lesson.LessonCard;
import com.lingq.core.domain.model.lesson.LessonWord;
import com.lingq.core.domain.model.library.LibraryItem;
import com.lingq.core.domain.model.library.LibraryItemCounter;
import com.lingq.core.domain.model.status.TokenStatus;
import com.lingq.core.domain.model.token.TokenMeaning;
import com.lingq.core.p012ui.UpgradeReason;
import com.lingq.core.p012ui.challenges.ChallengeType;
import com.lingq.core.p012ui.library.CourseContextMenuItem;
import com.lingq.core.p012ui.library.LessonContextMenuItem;
import com.lingq.core.player.video.C1821b;
import com.lingq.core.token.C1909e;
import com.lingq.feature.chat.C2009m;
import com.lingq.feature.collections.C2034d;
import com.lingq.feature.collections.R$id;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p000.tbb;
import p000.ub5;

/* JADX INFO: renamed from: p2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C3445p2 implements vi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f55466a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f55467b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f55468c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f55469d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f55470e;

    public /* synthetic */ C3445p2(List list, Context context, String str, vi3 vi3Var) {
        this.f55466a = 9;
        this.f55467b = list;
        this.f55470e = context;
        this.f55469d = str;
        this.f55468c = vi3Var;
    }

    /* JADX WARN: Code duplicated, block: B:167:0x06f3  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v95, types: [com.lingq.core.player.video.c, tb5] */
    @Override // p000.vi3
    public final Object invoke(Object obj) {
        ChallengeProfile challengeProfile;
        int i = this.f55466a;
        final int i2 = 7;
        final int i3 = 6;
        final int i4 = 4;
        final int i5 = 2;
        final int i6 = 3;
        boolean zContains = false;
        z = false;
        boolean z = false;
        zContains = false;
        zContains = false;
        xfa xfaVar = xfa.f68157a;
        Object obj2 = this.f55468c;
        Object obj3 = this.f55470e;
        Object obj4 = this.f55469d;
        Object obj5 = this.f55467b;
        final int i7 = 1;
        switch (i) {
            case 0:
                List list = (List) obj5;
                vu4 vu4Var = (vu4) obj;
                vu4Var.getClass();
                vu4Var.m23547h(list.size(), null, new C3520r2(0, list), new C0282a(802480018, true, new C3558s2(list, (String) obj4, (String) obj3, (vi3) obj2)));
                return xfaVar;
            case 1:
                List list2 = (List) obj5;
                vu4 vu4Var2 = (vu4) obj;
                vu4Var2.getClass();
                vu4Var2.m23547h(list2.size(), null, new C3520r2(1, list2), new C0282a(802480018, true, new C3558s2(list2, (Context) obj4, (vi3) obj2, (ui3) obj3)));
                return xfaVar;
            case 2:
                ComposeView composeView = (ComposeView) obj5;
                ((Context) obj).getClass();
                composeView.setContent(new C0282a(1771194186, true, new C2919d9(composeView, (Context) obj4, (C0282a) obj3, (t66) obj2, 2)));
                return composeView;
            case 3:
                String str = (String) obj4;
                String str2 = (String) obj3;
                String str3 = (String) obj5;
                yp0 yp0Var = (yp0) obj2;
                bk8 bk8Var = (bk8) obj;
                bk8Var.getClass();
                ik8 ik8VarMo2873e0 = bk8Var.mo2873e0("SELECT `rank`, `profile`, `score`, `scoreBehindLeader`, `bookTitle`, `bookLanguage` FROM (SELECT * FROM ChallengeRankingEntity WHERE language = ? AND challengeCode = ? AND metric = ? ORDER BY rank)");
                try {
                    ik8VarMo2873e0.mo2874C(1, str);
                    ik8VarMo2873e0.mo2874C(2, str2);
                    ik8VarMo2873e0.mo2874C(3, str3);
                    ArrayList arrayList = new ArrayList();
                    while (ik8VarMo2873e0.mo2876a0()) {
                        int i8 = (int) ik8VarMo2873e0.getLong(0);
                        String strMo2875L = ik8VarMo2873e0.isNull(1) ? null : ik8VarMo2873e0.mo2875L(1);
                        qn3 qn3Var = yp0Var.f70237O;
                        if (strMo2875L != null) {
                            yf4 yf4Var = (yf4) qn3Var.f57974a;
                            yf4Var.getClass();
                            challengeProfile = (ChallengeProfile) yf4Var.m10321a(strMo2875L, thb.m22059r(ChallengeProfile.Companion.serializer()));
                        } else {
                            qn3Var.getClass();
                            challengeProfile = null;
                        }
                        int i9 = (int) ik8VarMo2873e0.getLong(2);
                        int i10 = (int) ik8VarMo2873e0.getLong(3);
                        String strMo2875L2 = ik8VarMo2873e0.mo2875L(i4);
                        String strMo2875L3 = ik8VarMo2873e0.mo2875L(5);
                        strMo2875L2.getClass();
                        strMo2875L3.getClass();
                        ChallengeRanking challengeRanking = new ChallengeRanking();
                        challengeRanking.f18891a = i8;
                        challengeRanking.f18892b = i9;
                        challengeRanking.f18893c = i10;
                        challengeRanking.f18894d = challengeProfile;
                        challengeRanking.f18895e = strMo2875L2;
                        challengeRanking.f18896f = strMo2875L3;
                        arrayList.add(challengeRanking);
                        i4 = 4;
                        break;
                    }
                    return arrayList;
                } finally {
                    ik8VarMo2873e0.close();
                }
            case 4:
                fr0 fr0Var = (fr0) obj5;
                vi3 vi3Var = (vi3) obj2;
                vi3 vi3Var2 = (vi3) obj4;
                Context context = (Context) obj3;
                vu4 vu4Var3 = (vu4) obj;
                vu4Var3.getClass();
                vu4.m23545g(vu4Var3, null, new C0282a(-583278363, true, new aq0(fr0Var, zContains ? 1 : 0)), 3);
                vu4.m23545g(vu4Var3, null, new C0282a(149136206, true, new bq0(fr0Var, vi3Var, vi3Var2, zContains ? 1 : 0)), 3);
                vu4.m23545g(vu4Var3, null, new C0282a(-738901331, true, new cq0(fr0Var, context, vi3Var)), 3);
                vu4.m23545g(vu4Var3, null, new C0282a(-1626938868, true, new aq0(fr0Var, i7)), 3);
                ChallengeType challengeType = fr0Var.f39503a;
                nr0 nr0Var = fr0Var.f39506d;
                if (challengeType.hasRank()) {
                    if (fr0Var.m12005b()) {
                        vu4.m23545g(vu4Var3, null, new C0282a(-1587957201, true, new C3180kd(i6, fr0Var, vi3Var2)), 3);
                    }
                    vu4.m23545g(vu4Var3, null, new C0282a(-1196776790, true, new cq0(fr0Var, vi3Var2, context)), 3);
                    vu4.m23545g(vu4Var3, null, new C0282a(550843859, true, new aq0(fr0Var, i5)), 3);
                }
                if (fa4.m11650l(nr0Var, kr0.f48354a)) {
                    vu4.m23545g(vu4Var3, null, new C0282a(-260176403, true, new aq0(fr0Var, i6)), 3);
                } else if (fa4.m11650l(nr0Var, lr0.f50025a)) {
                    vu4.m23545g(vu4Var3, null, lnb.f49874c, 3);
                } else {
                    if (!(nr0Var instanceof mr0)) {
                        gm5.m12750e();
                        return null;
                    }
                    List list3 = ((mr0) nr0Var).f51765a;
                    vu4Var3.m23547h(list3.size(), new ue0(i7, new C3013ft(5), list3), new C3520r2(3, list3), new C0282a(802480018, true, new jq0(list3, fr0Var, zContains ? 1 : 0)));
                }
                return xfaVar;
            case 5:
                C2009m c2009m = (C2009m) obj5;
                C1909e c1909e = (C1909e) obj4;
                t66 t66Var = (t66) obj3;
                dh9 dh9Var = (dh9) obj2;
                j3a j3aVar = (j3a) obj;
                j3aVar.getClass();
                if ((j3aVar instanceof n2a) || (j3aVar instanceof p2a)) {
                    c2009m.m8926c3();
                }
                if (j3aVar instanceof d2a) {
                    if (!(((f5a) t66Var.getValue()).f38474f instanceof LessonCard)) {
                        zContains = true;
                    }
                } else if (j3aVar instanceof i3a) {
                    w65 w65Var = ((f5a) t66Var.getValue()).f38474f;
                    if (!(w65Var instanceof LessonCard)) {
                        if (w65Var instanceof LessonWord) {
                            zContains = AbstractC3550rv.m20855w0(new TokenStatus[]{TokenStatus.New, TokenStatus.Recognized, TokenStatus.Familiar, TokenStatus.Learned}).contains(((i3a) j3aVar).f43453a);
                        } else {
                            zContains = true;
                        }
                    }
                }
                if (((Boolean) dh9Var.getValue()).booleanValue() || !zContains) {
                    c1909e.m8760d3(j3aVar);
                } else {
                    c2009m.mo3737M1(UpgradeReason.LIMIT_WORDS);
                }
                return xfaVar;
            case 6:
                final List list4 = (List) obj5;
                final vi3 vi3Var3 = (vi3) obj2;
                final t66 t66Var2 = (t66) obj4;
                final t66 t66Var3 = (t66) obj3;
                vu4 vu4Var4 = (vu4) obj;
                vu4Var4.getClass();
                vu4.m23546i(vu4Var4, list4.size(), new bz0(zContains ? 1 : 0, list4), new C0282a(194048354, true, new bj3() { // from class: cz0
                    @Override // p000.bj3
                    /* JADX INFO: renamed from: e */
                    public final Object mo825e(Object obj6, Object obj7, Object obj8, Object obj9) {
                        int i11;
                        ft4 ft4Var = (ft4) obj6;
                        int iIntValue = ((Integer) obj7).intValue();
                        ye1 ye1Var = (ye1) obj8;
                        int iIntValue2 = ((Integer) obj9).intValue();
                        ft4Var.getClass();
                        if ((iIntValue2 & 6) == 0) {
                            i11 = (((tj3) ye1Var).m22120g(ft4Var) ? 4 : 2) | iIntValue2;
                        } else {
                            i11 = iIntValue2;
                        }
                        if ((iIntValue2 & 48) == 0) {
                            i11 |= ((tj3) ye1Var).m22116e(iIntValue) ? 32 : 16;
                        }
                        tj3 tj3Var = (tj3) ye1Var;
                        if (tj3Var.m22099R(i11 & 1, (i11 & 147) != 146)) {
                            iw0 iw0Var = (iw0) list4.get(iIntValue);
                            boolean z2 = iw0Var instanceof gw0;
                            b16 b16Var = b16.f7762a;
                            if (z2) {
                                tj3Var.m22111b0(-131292831);
                                lw9.m16554b(vz1.m23620a0(tj3Var, ((gw0) iw0Var).f41411a), AbstractC3584sr.m21611X(AbstractC3584sr.m21608U(c99.m4412e(b16Var, 1.0f), ge9.m12515a(tj3Var).f38952a, ge9.m12515a(tj3Var).f38955d), 0.0f, ge9.m12515a(tj3Var).f38952a, 0.0f, 0.0f, 13), 0L, null, 0L, null, bc3.f8324j, 0L, null, null, 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var).f71404h, tj3Var, 1572864, 0, 131004);
                                pb1.m19031a(0.0f, 0, 6, 0L, tj3Var, AbstractC3584sr.m21608U(b16Var, ge9.m12515a(tj3Var).f38952a, ge9.m12515a(tj3Var).f38954c));
                                tj3Var.m22139q(false);
                            } else {
                                if (!(iw0Var instanceof hw0)) {
                                    throw ux5.m23001x(tj3Var, 1796879352, false);
                                }
                                tj3Var.m22111b0(-129991606);
                                Object objM22097O = tj3Var.m22097O();
                                p84 p84Var = we1.f66679a;
                                if (objM22097O == p84Var) {
                                    objM22097O = AbstractC3393o1.m17729d(tj3Var);
                                }
                                v56 v56Var = (v56) objM22097O;
                                rh8 rh8VarM12656a = gh8.m12656a(false, 0.0f, 0L, null, 255);
                                boolean zM22124i = tj3Var.m22124i(iw0Var);
                                Object objM22097O2 = tj3Var.m22097O();
                                if (zM22124i || objM22097O2 == p84Var) {
                                    objM22097O2 = new zg0((hw0) iw0Var, t66Var2, t66Var3, 5);
                                    tj3Var.m22131l0(objM22097O2);
                                }
                                ui3 ui3Var = (ui3) objM22097O2;
                                vi3 vi3Var4 = vi3Var3;
                                boolean zM22120g = tj3Var.m22120g(vi3Var4) | tj3Var.m22124i(iw0Var);
                                Object objM22097O3 = tj3Var.m22097O();
                                if (zM22120g || objM22097O3 == p84Var) {
                                    objM22097O3 = new C3577sk(8, vi3Var4, (hw0) iw0Var);
                                    tj3Var.m22131l0(objM22097O3);
                                }
                                e16 e16VarM12121a = ft4.m12121a(ft4Var, AbstractC3584sr.m21609V(AbstractC0080f.m816c(b16Var, v56Var, rh8VarM12656a, ui3Var, (ui3) objM22097O3, 412), ((fe9) tj3Var.m22128k(ge9.f40637a)).f38952a, 0.0f, 2));
                                int i12 = hf5.f42302a;
                                of5.m17959a(ci8.m4703P(-562386301, new C3368nd((hw0) iw0Var, 7), tj3Var), e16VarM12121a, xnb.f68411e, hf5.m13217a(((ms5) tj3Var.m22128k(ps5.f56764b)).f51799a.f55824I, tj3Var), tj3Var, 24582, 428);
                                tj3Var.m22139q(false);
                            }
                        } else {
                            tj3Var.m22102U();
                        }
                        return xfa.f68157a;
                    }
                }), 4);
                return xfaVar;
            case 7:
                ub5 ub5Var = (ub5) obj5;
                final ud6 ud6Var = (ud6) obj4;
                final C2034d c2034d = (C2034d) obj3;
                final t66 t66Var4 = (t66) obj2;
                ((ai2) obj).getClass();
                rb5 rb5Var = new rb5() { // from class: e91
                    @Override // p000.rb5
                    /* JADX INFO: renamed from: c */
                    public final void mo399c(ub5 ub5Var2, Lifecycle$Event lifecycle$Event) {
                        r86 r86VarM13127f;
                        if (lifecycle$Event == Lifecycle$Event.ON_RESUME && (r86VarM13127f = ud6Var.f63760b.m13127f()) != null && r86VarM13127f.f58881b.f57368b == R$id.fragment_collection) {
                            t66 t66Var5 = t66Var4;
                            boolean z2 = ((q91) t66Var5.getValue()).f57445g;
                            C2034d c2034d2 = c2034d;
                            if (z2) {
                                c2034d2.m8945Z2(x51.f67769a);
                            }
                            if (((q91) t66Var5.getValue()).f57446h) {
                                c2034d2.m8945Z2(w51.f66401a);
                            }
                        }
                    }
                };
                ub5Var.mo256K().mo21323g(rb5Var);
                return new j91(zContains ? 1 : 0, ub5Var, rb5Var);
            case 8:
                do1 do1Var = (do1) obj5;
                final vi3 vi3Var4 = (vi3) obj2;
                final gf5 gf5Var = (gf5) obj3;
                vu4 vu4Var5 = (vu4) obj;
                vu4Var5.getClass();
                vu4.m23545g(vu4Var5, null, new C0282a(1013353843, true, new iq0((String) obj4, i7)), 3);
                vu4.m23545g(vu4Var5, null, new C0282a(-1912231318, true, new aj3() { // from class: ao1
                    @Override // p000.aj3
                    public final Object invoke(Object obj6, Object obj7, Object obj8) {
                        int i11 = i7;
                        xfa xfaVar2 = xfa.f68157a;
                        p84 p84Var = we1.f66679a;
                        b16 b16Var = b16.f7762a;
                        vi3 vi3Var5 = vi3Var4;
                        switch (i11) {
                            case 0:
                                ye1 ye1Var = (ye1) obj7;
                                int iIntValue = ((Integer) obj8).intValue();
                                ((ft4) obj6).getClass();
                                tj3 tj3Var = (tj3) ye1Var;
                                if (!tj3Var.m22099R(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    tj3Var.m22102U();
                                } else {
                                    boolean zM22120g = tj3Var.m22120g(vi3Var5);
                                    Object objM22097O = tj3Var.m22097O();
                                    if (zM22120g || objM22097O == p84Var) {
                                        objM22097O = new f91(vi3Var5, 9);
                                        tj3Var.m22131l0(objM22097O);
                                    }
                                    of5.m17959a(wob.f67143h, AbstractC0080f.m815b(null, false, (ui3) objM22097O, b16Var, 15), wob.f67144i, gf5Var, tj3Var, 24582, 428);
                                }
                                break;
                            case 1:
                                ye1 ye1Var2 = (ye1) obj7;
                                int iIntValue2 = ((Integer) obj8).intValue();
                                ((ft4) obj6).getClass();
                                tj3 tj3Var2 = (tj3) ye1Var2;
                                if (!tj3Var2.m22099R(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                    tj3Var2.m22102U();
                                } else {
                                    boolean zM22120g2 = tj3Var2.m22120g(vi3Var5);
                                    Object objM22097O2 = tj3Var2.m22097O();
                                    if (zM22120g2 || objM22097O2 == p84Var) {
                                        objM22097O2 = new f91(vi3Var5, 12);
                                        tj3Var2.m22131l0(objM22097O2);
                                    }
                                    of5.m17959a(wob.f67136a, AbstractC0080f.m815b(null, false, (ui3) objM22097O2, b16Var, 15), wob.f67137b, gf5Var, tj3Var2, 24582, 428);
                                }
                                break;
                            case 2:
                                ye1 ye1Var3 = (ye1) obj7;
                                int iIntValue3 = ((Integer) obj8).intValue();
                                ((ft4) obj6).getClass();
                                tj3 tj3Var3 = (tj3) ye1Var3;
                                if (!tj3Var3.m22099R(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                    tj3Var3.m22102U();
                                } else {
                                    boolean zM22120g3 = tj3Var3.m22120g(vi3Var5);
                                    Object objM22097O3 = tj3Var3.m22097O();
                                    if (zM22120g3 || objM22097O3 == p84Var) {
                                        objM22097O3 = new f91(vi3Var5, 13);
                                        tj3Var3.m22131l0(objM22097O3);
                                    }
                                    of5.m17959a(wob.f67138c, AbstractC0080f.m815b(null, false, (ui3) objM22097O3, b16Var, 15), wob.f67139d, gf5Var, tj3Var3, 24582, 428);
                                }
                                break;
                            case 3:
                                ye1 ye1Var4 = (ye1) obj7;
                                int iIntValue4 = ((Integer) obj8).intValue();
                                ((ft4) obj6).getClass();
                                tj3 tj3Var4 = (tj3) ye1Var4;
                                if (!tj3Var4.m22099R(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                                    tj3Var4.m22102U();
                                } else {
                                    boolean zM22120g4 = tj3Var4.m22120g(vi3Var5);
                                    Object objM22097O4 = tj3Var4.m22097O();
                                    if (zM22120g4 || objM22097O4 == p84Var) {
                                        objM22097O4 = new f91(vi3Var5, 11);
                                        tj3Var4.m22131l0(objM22097O4);
                                    }
                                    of5.m17959a(wob.f67141f, AbstractC0080f.m815b(null, false, (ui3) objM22097O4, b16Var, 15), wob.f67142g, gf5Var, tj3Var4, 24582, 428);
                                }
                                break;
                            case 4:
                                ye1 ye1Var5 = (ye1) obj7;
                                int iIntValue5 = ((Integer) obj8).intValue();
                                ((ft4) obj6).getClass();
                                tj3 tj3Var5 = (tj3) ye1Var5;
                                if (!tj3Var5.m22099R(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                                    tj3Var5.m22102U();
                                } else {
                                    boolean zM22120g5 = tj3Var5.m22120g(vi3Var5);
                                    Object objM22097O5 = tj3Var5.m22097O();
                                    if (zM22120g5 || objM22097O5 == p84Var) {
                                        objM22097O5 = new fl4(vi3Var5, 22);
                                        tj3Var5.m22131l0(objM22097O5);
                                    }
                                    of5.m17959a(jtb.f46141e, AbstractC0080f.m815b(null, false, (ui3) objM22097O5, b16Var, 15), jtb.f46142f, gf5Var, tj3Var5, 24582, 428);
                                }
                                break;
                            case 5:
                                ye1 ye1Var6 = (ye1) obj7;
                                int iIntValue6 = ((Integer) obj8).intValue();
                                ((ft4) obj6).getClass();
                                tj3 tj3Var6 = (tj3) ye1Var6;
                                if (!tj3Var6.m22099R(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                                    tj3Var6.m22102U();
                                } else {
                                    boolean zM22120g6 = tj3Var6.m22120g(vi3Var5);
                                    Object objM22097O6 = tj3Var6.m22097O();
                                    if (zM22120g6 || objM22097O6 == p84Var) {
                                        objM22097O6 = new fl4(vi3Var5, 20);
                                        tj3Var6.m22131l0(objM22097O6);
                                    }
                                    of5.m17959a(jtb.f46144h, AbstractC0080f.m815b(null, false, (ui3) objM22097O6, b16Var, 15), jtb.f46145i, gf5Var, tj3Var6, 24582, 428);
                                }
                                break;
                            case 6:
                                ye1 ye1Var7 = (ye1) obj7;
                                int iIntValue7 = ((Integer) obj8).intValue();
                                ((ft4) obj6).getClass();
                                tj3 tj3Var7 = (tj3) ye1Var7;
                                if (!tj3Var7.m22099R(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                                    tj3Var7.m22102U();
                                } else {
                                    boolean zM22120g7 = tj3Var7.m22120g(vi3Var5);
                                    Object objM22097O7 = tj3Var7.m22097O();
                                    if (zM22120g7 || objM22097O7 == p84Var) {
                                        objM22097O7 = new fl4(vi3Var5, 18);
                                        tj3Var7.m22131l0(objM22097O7);
                                    }
                                    of5.m17959a(jtb.f46146j, AbstractC0080f.m815b(null, false, (ui3) objM22097O7, b16Var, 15), jtb.f46147k, gf5Var, tj3Var7, 24582, 428);
                                }
                                break;
                            case 7:
                                ye1 ye1Var8 = (ye1) obj7;
                                int iIntValue8 = ((Integer) obj8).intValue();
                                ((ft4) obj6).getClass();
                                tj3 tj3Var8 = (tj3) ye1Var8;
                                if (!tj3Var8.m22099R(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                                    tj3Var8.m22102U();
                                } else {
                                    boolean zM22120g8 = tj3Var8.m22120g(vi3Var5);
                                    Object objM22097O8 = tj3Var8.m22097O();
                                    if (zM22120g8 || objM22097O8 == p84Var) {
                                        objM22097O8 = new fl4(vi3Var5, 17);
                                        tj3Var8.m22131l0(objM22097O8);
                                    }
                                    of5.m17959a(jtb.f46137a, AbstractC0080f.m815b(null, false, (ui3) objM22097O8, b16Var, 15), jtb.f46138b, gf5Var, tj3Var8, 24582, 428);
                                }
                                break;
                            default:
                                ye1 ye1Var9 = (ye1) obj7;
                                int iIntValue9 = ((Integer) obj8).intValue();
                                ((ft4) obj6).getClass();
                                tj3 tj3Var9 = (tj3) ye1Var9;
                                if (!tj3Var9.m22099R(iIntValue9 & 1, (iIntValue9 & 17) != 16)) {
                                    tj3Var9.m22102U();
                                } else {
                                    boolean zM22120g9 = tj3Var9.m22120g(vi3Var5);
                                    Object objM22097O9 = tj3Var9.m22097O();
                                    if (zM22120g9 || objM22097O9 == p84Var) {
                                        objM22097O9 = new fl4(vi3Var5, 15);
                                        tj3Var9.m22131l0(objM22097O9);
                                    }
                                    of5.m17959a(jtb.f46139c, AbstractC0080f.m815b(null, false, (ui3) objM22097O9, b16Var, 15), jtb.f46140d, gf5Var, tj3Var9, 24582, 428);
                                }
                                break;
                        }
                        return xfaVar2;
                    }
                }), 3);
                vu4.m23545g(vu4Var5, null, new C0282a(147691179, true, new co1(do1Var, vi3Var4, gf5Var, zContains ? 1 : 0)), 3);
                vu4.m23545g(vu4Var5, null, new C0282a(-2087353620, true, new aj3() { // from class: ao1
                    @Override // p000.aj3
                    public final Object invoke(Object obj6, Object obj7, Object obj8) {
                        int i11 = i5;
                        xfa xfaVar2 = xfa.f68157a;
                        p84 p84Var = we1.f66679a;
                        b16 b16Var = b16.f7762a;
                        vi3 vi3Var5 = vi3Var4;
                        switch (i11) {
                            case 0:
                                ye1 ye1Var = (ye1) obj7;
                                int iIntValue = ((Integer) obj8).intValue();
                                ((ft4) obj6).getClass();
                                tj3 tj3Var = (tj3) ye1Var;
                                if (!tj3Var.m22099R(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    tj3Var.m22102U();
                                } else {
                                    boolean zM22120g = tj3Var.m22120g(vi3Var5);
                                    Object objM22097O = tj3Var.m22097O();
                                    if (zM22120g || objM22097O == p84Var) {
                                        objM22097O = new f91(vi3Var5, 9);
                                        tj3Var.m22131l0(objM22097O);
                                    }
                                    of5.m17959a(wob.f67143h, AbstractC0080f.m815b(null, false, (ui3) objM22097O, b16Var, 15), wob.f67144i, gf5Var, tj3Var, 24582, 428);
                                }
                                break;
                            case 1:
                                ye1 ye1Var2 = (ye1) obj7;
                                int iIntValue2 = ((Integer) obj8).intValue();
                                ((ft4) obj6).getClass();
                                tj3 tj3Var2 = (tj3) ye1Var2;
                                if (!tj3Var2.m22099R(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                    tj3Var2.m22102U();
                                } else {
                                    boolean zM22120g2 = tj3Var2.m22120g(vi3Var5);
                                    Object objM22097O2 = tj3Var2.m22097O();
                                    if (zM22120g2 || objM22097O2 == p84Var) {
                                        objM22097O2 = new f91(vi3Var5, 12);
                                        tj3Var2.m22131l0(objM22097O2);
                                    }
                                    of5.m17959a(wob.f67136a, AbstractC0080f.m815b(null, false, (ui3) objM22097O2, b16Var, 15), wob.f67137b, gf5Var, tj3Var2, 24582, 428);
                                }
                                break;
                            case 2:
                                ye1 ye1Var3 = (ye1) obj7;
                                int iIntValue3 = ((Integer) obj8).intValue();
                                ((ft4) obj6).getClass();
                                tj3 tj3Var3 = (tj3) ye1Var3;
                                if (!tj3Var3.m22099R(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                    tj3Var3.m22102U();
                                } else {
                                    boolean zM22120g3 = tj3Var3.m22120g(vi3Var5);
                                    Object objM22097O3 = tj3Var3.m22097O();
                                    if (zM22120g3 || objM22097O3 == p84Var) {
                                        objM22097O3 = new f91(vi3Var5, 13);
                                        tj3Var3.m22131l0(objM22097O3);
                                    }
                                    of5.m17959a(wob.f67138c, AbstractC0080f.m815b(null, false, (ui3) objM22097O3, b16Var, 15), wob.f67139d, gf5Var, tj3Var3, 24582, 428);
                                }
                                break;
                            case 3:
                                ye1 ye1Var4 = (ye1) obj7;
                                int iIntValue4 = ((Integer) obj8).intValue();
                                ((ft4) obj6).getClass();
                                tj3 tj3Var4 = (tj3) ye1Var4;
                                if (!tj3Var4.m22099R(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                                    tj3Var4.m22102U();
                                } else {
                                    boolean zM22120g4 = tj3Var4.m22120g(vi3Var5);
                                    Object objM22097O4 = tj3Var4.m22097O();
                                    if (zM22120g4 || objM22097O4 == p84Var) {
                                        objM22097O4 = new f91(vi3Var5, 11);
                                        tj3Var4.m22131l0(objM22097O4);
                                    }
                                    of5.m17959a(wob.f67141f, AbstractC0080f.m815b(null, false, (ui3) objM22097O4, b16Var, 15), wob.f67142g, gf5Var, tj3Var4, 24582, 428);
                                }
                                break;
                            case 4:
                                ye1 ye1Var5 = (ye1) obj7;
                                int iIntValue5 = ((Integer) obj8).intValue();
                                ((ft4) obj6).getClass();
                                tj3 tj3Var5 = (tj3) ye1Var5;
                                if (!tj3Var5.m22099R(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                                    tj3Var5.m22102U();
                                } else {
                                    boolean zM22120g5 = tj3Var5.m22120g(vi3Var5);
                                    Object objM22097O5 = tj3Var5.m22097O();
                                    if (zM22120g5 || objM22097O5 == p84Var) {
                                        objM22097O5 = new fl4(vi3Var5, 22);
                                        tj3Var5.m22131l0(objM22097O5);
                                    }
                                    of5.m17959a(jtb.f46141e, AbstractC0080f.m815b(null, false, (ui3) objM22097O5, b16Var, 15), jtb.f46142f, gf5Var, tj3Var5, 24582, 428);
                                }
                                break;
                            case 5:
                                ye1 ye1Var6 = (ye1) obj7;
                                int iIntValue6 = ((Integer) obj8).intValue();
                                ((ft4) obj6).getClass();
                                tj3 tj3Var6 = (tj3) ye1Var6;
                                if (!tj3Var6.m22099R(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                                    tj3Var6.m22102U();
                                } else {
                                    boolean zM22120g6 = tj3Var6.m22120g(vi3Var5);
                                    Object objM22097O6 = tj3Var6.m22097O();
                                    if (zM22120g6 || objM22097O6 == p84Var) {
                                        objM22097O6 = new fl4(vi3Var5, 20);
                                        tj3Var6.m22131l0(objM22097O6);
                                    }
                                    of5.m17959a(jtb.f46144h, AbstractC0080f.m815b(null, false, (ui3) objM22097O6, b16Var, 15), jtb.f46145i, gf5Var, tj3Var6, 24582, 428);
                                }
                                break;
                            case 6:
                                ye1 ye1Var7 = (ye1) obj7;
                                int iIntValue7 = ((Integer) obj8).intValue();
                                ((ft4) obj6).getClass();
                                tj3 tj3Var7 = (tj3) ye1Var7;
                                if (!tj3Var7.m22099R(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                                    tj3Var7.m22102U();
                                } else {
                                    boolean zM22120g7 = tj3Var7.m22120g(vi3Var5);
                                    Object objM22097O7 = tj3Var7.m22097O();
                                    if (zM22120g7 || objM22097O7 == p84Var) {
                                        objM22097O7 = new fl4(vi3Var5, 18);
                                        tj3Var7.m22131l0(objM22097O7);
                                    }
                                    of5.m17959a(jtb.f46146j, AbstractC0080f.m815b(null, false, (ui3) objM22097O7, b16Var, 15), jtb.f46147k, gf5Var, tj3Var7, 24582, 428);
                                }
                                break;
                            case 7:
                                ye1 ye1Var8 = (ye1) obj7;
                                int iIntValue8 = ((Integer) obj8).intValue();
                                ((ft4) obj6).getClass();
                                tj3 tj3Var8 = (tj3) ye1Var8;
                                if (!tj3Var8.m22099R(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                                    tj3Var8.m22102U();
                                } else {
                                    boolean zM22120g8 = tj3Var8.m22120g(vi3Var5);
                                    Object objM22097O8 = tj3Var8.m22097O();
                                    if (zM22120g8 || objM22097O8 == p84Var) {
                                        objM22097O8 = new fl4(vi3Var5, 17);
                                        tj3Var8.m22131l0(objM22097O8);
                                    }
                                    of5.m17959a(jtb.f46137a, AbstractC0080f.m815b(null, false, (ui3) objM22097O8, b16Var, 15), jtb.f46138b, gf5Var, tj3Var8, 24582, 428);
                                }
                                break;
                            default:
                                ye1 ye1Var9 = (ye1) obj7;
                                int iIntValue9 = ((Integer) obj8).intValue();
                                ((ft4) obj6).getClass();
                                tj3 tj3Var9 = (tj3) ye1Var9;
                                if (!tj3Var9.m22099R(iIntValue9 & 1, (iIntValue9 & 17) != 16)) {
                                    tj3Var9.m22102U();
                                } else {
                                    boolean zM22120g9 = tj3Var9.m22120g(vi3Var5);
                                    Object objM22097O9 = tj3Var9.m22097O();
                                    if (zM22120g9 || objM22097O9 == p84Var) {
                                        objM22097O9 = new fl4(vi3Var5, 15);
                                        tj3Var9.m22131l0(objM22097O9);
                                    }
                                    of5.m17959a(jtb.f46139c, AbstractC0080f.m815b(null, false, (ui3) objM22097O9, b16Var, 15), jtb.f46140d, gf5Var, tj3Var9, 24582, 428);
                                }
                                break;
                        }
                        return xfaVar2;
                    }
                }), 3);
                if (do1Var.f35934f) {
                    vu4.m23545g(vu4Var5, null, new C0282a(-664892018, true, new co1(vi3Var4, gf5Var, do1Var)), 3);
                }
                if (do1Var.f35932d) {
                    vu4.m23545g(vu4Var5, null, new C0282a(201199557, true, new co1(do1Var, vi3Var4, gf5Var, i5)), 3);
                }
                vu4.m23545g(vu4Var5, null, new C0282a(-27431123, true, new aj3() { // from class: ao1
                    @Override // p000.aj3
                    public final Object invoke(Object obj6, Object obj7, Object obj8) {
                        int i11 = i6;
                        xfa xfaVar2 = xfa.f68157a;
                        p84 p84Var = we1.f66679a;
                        b16 b16Var = b16.f7762a;
                        vi3 vi3Var5 = vi3Var4;
                        switch (i11) {
                            case 0:
                                ye1 ye1Var = (ye1) obj7;
                                int iIntValue = ((Integer) obj8).intValue();
                                ((ft4) obj6).getClass();
                                tj3 tj3Var = (tj3) ye1Var;
                                if (!tj3Var.m22099R(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    tj3Var.m22102U();
                                } else {
                                    boolean zM22120g = tj3Var.m22120g(vi3Var5);
                                    Object objM22097O = tj3Var.m22097O();
                                    if (zM22120g || objM22097O == p84Var) {
                                        objM22097O = new f91(vi3Var5, 9);
                                        tj3Var.m22131l0(objM22097O);
                                    }
                                    of5.m17959a(wob.f67143h, AbstractC0080f.m815b(null, false, (ui3) objM22097O, b16Var, 15), wob.f67144i, gf5Var, tj3Var, 24582, 428);
                                }
                                break;
                            case 1:
                                ye1 ye1Var2 = (ye1) obj7;
                                int iIntValue2 = ((Integer) obj8).intValue();
                                ((ft4) obj6).getClass();
                                tj3 tj3Var2 = (tj3) ye1Var2;
                                if (!tj3Var2.m22099R(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                    tj3Var2.m22102U();
                                } else {
                                    boolean zM22120g2 = tj3Var2.m22120g(vi3Var5);
                                    Object objM22097O2 = tj3Var2.m22097O();
                                    if (zM22120g2 || objM22097O2 == p84Var) {
                                        objM22097O2 = new f91(vi3Var5, 12);
                                        tj3Var2.m22131l0(objM22097O2);
                                    }
                                    of5.m17959a(wob.f67136a, AbstractC0080f.m815b(null, false, (ui3) objM22097O2, b16Var, 15), wob.f67137b, gf5Var, tj3Var2, 24582, 428);
                                }
                                break;
                            case 2:
                                ye1 ye1Var3 = (ye1) obj7;
                                int iIntValue3 = ((Integer) obj8).intValue();
                                ((ft4) obj6).getClass();
                                tj3 tj3Var3 = (tj3) ye1Var3;
                                if (!tj3Var3.m22099R(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                    tj3Var3.m22102U();
                                } else {
                                    boolean zM22120g3 = tj3Var3.m22120g(vi3Var5);
                                    Object objM22097O3 = tj3Var3.m22097O();
                                    if (zM22120g3 || objM22097O3 == p84Var) {
                                        objM22097O3 = new f91(vi3Var5, 13);
                                        tj3Var3.m22131l0(objM22097O3);
                                    }
                                    of5.m17959a(wob.f67138c, AbstractC0080f.m815b(null, false, (ui3) objM22097O3, b16Var, 15), wob.f67139d, gf5Var, tj3Var3, 24582, 428);
                                }
                                break;
                            case 3:
                                ye1 ye1Var4 = (ye1) obj7;
                                int iIntValue4 = ((Integer) obj8).intValue();
                                ((ft4) obj6).getClass();
                                tj3 tj3Var4 = (tj3) ye1Var4;
                                if (!tj3Var4.m22099R(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                                    tj3Var4.m22102U();
                                } else {
                                    boolean zM22120g4 = tj3Var4.m22120g(vi3Var5);
                                    Object objM22097O4 = tj3Var4.m22097O();
                                    if (zM22120g4 || objM22097O4 == p84Var) {
                                        objM22097O4 = new f91(vi3Var5, 11);
                                        tj3Var4.m22131l0(objM22097O4);
                                    }
                                    of5.m17959a(wob.f67141f, AbstractC0080f.m815b(null, false, (ui3) objM22097O4, b16Var, 15), wob.f67142g, gf5Var, tj3Var4, 24582, 428);
                                }
                                break;
                            case 4:
                                ye1 ye1Var5 = (ye1) obj7;
                                int iIntValue5 = ((Integer) obj8).intValue();
                                ((ft4) obj6).getClass();
                                tj3 tj3Var5 = (tj3) ye1Var5;
                                if (!tj3Var5.m22099R(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                                    tj3Var5.m22102U();
                                } else {
                                    boolean zM22120g5 = tj3Var5.m22120g(vi3Var5);
                                    Object objM22097O5 = tj3Var5.m22097O();
                                    if (zM22120g5 || objM22097O5 == p84Var) {
                                        objM22097O5 = new fl4(vi3Var5, 22);
                                        tj3Var5.m22131l0(objM22097O5);
                                    }
                                    of5.m17959a(jtb.f46141e, AbstractC0080f.m815b(null, false, (ui3) objM22097O5, b16Var, 15), jtb.f46142f, gf5Var, tj3Var5, 24582, 428);
                                }
                                break;
                            case 5:
                                ye1 ye1Var6 = (ye1) obj7;
                                int iIntValue6 = ((Integer) obj8).intValue();
                                ((ft4) obj6).getClass();
                                tj3 tj3Var6 = (tj3) ye1Var6;
                                if (!tj3Var6.m22099R(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                                    tj3Var6.m22102U();
                                } else {
                                    boolean zM22120g6 = tj3Var6.m22120g(vi3Var5);
                                    Object objM22097O6 = tj3Var6.m22097O();
                                    if (zM22120g6 || objM22097O6 == p84Var) {
                                        objM22097O6 = new fl4(vi3Var5, 20);
                                        tj3Var6.m22131l0(objM22097O6);
                                    }
                                    of5.m17959a(jtb.f46144h, AbstractC0080f.m815b(null, false, (ui3) objM22097O6, b16Var, 15), jtb.f46145i, gf5Var, tj3Var6, 24582, 428);
                                }
                                break;
                            case 6:
                                ye1 ye1Var7 = (ye1) obj7;
                                int iIntValue7 = ((Integer) obj8).intValue();
                                ((ft4) obj6).getClass();
                                tj3 tj3Var7 = (tj3) ye1Var7;
                                if (!tj3Var7.m22099R(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                                    tj3Var7.m22102U();
                                } else {
                                    boolean zM22120g7 = tj3Var7.m22120g(vi3Var5);
                                    Object objM22097O7 = tj3Var7.m22097O();
                                    if (zM22120g7 || objM22097O7 == p84Var) {
                                        objM22097O7 = new fl4(vi3Var5, 18);
                                        tj3Var7.m22131l0(objM22097O7);
                                    }
                                    of5.m17959a(jtb.f46146j, AbstractC0080f.m815b(null, false, (ui3) objM22097O7, b16Var, 15), jtb.f46147k, gf5Var, tj3Var7, 24582, 428);
                                }
                                break;
                            case 7:
                                ye1 ye1Var8 = (ye1) obj7;
                                int iIntValue8 = ((Integer) obj8).intValue();
                                ((ft4) obj6).getClass();
                                tj3 tj3Var8 = (tj3) ye1Var8;
                                if (!tj3Var8.m22099R(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                                    tj3Var8.m22102U();
                                } else {
                                    boolean zM22120g8 = tj3Var8.m22120g(vi3Var5);
                                    Object objM22097O8 = tj3Var8.m22097O();
                                    if (zM22120g8 || objM22097O8 == p84Var) {
                                        objM22097O8 = new fl4(vi3Var5, 17);
                                        tj3Var8.m22131l0(objM22097O8);
                                    }
                                    of5.m17959a(jtb.f46137a, AbstractC0080f.m815b(null, false, (ui3) objM22097O8, b16Var, 15), jtb.f46138b, gf5Var, tj3Var8, 24582, 428);
                                }
                                break;
                            default:
                                ye1 ye1Var9 = (ye1) obj7;
                                int iIntValue9 = ((Integer) obj8).intValue();
                                ((ft4) obj6).getClass();
                                tj3 tj3Var9 = (tj3) ye1Var9;
                                if (!tj3Var9.m22099R(iIntValue9 & 1, (iIntValue9 & 17) != 16)) {
                                    tj3Var9.m22102U();
                                } else {
                                    boolean zM22120g9 = tj3Var9.m22120g(vi3Var5);
                                    Object objM22097O9 = tj3Var9.m22097O();
                                    if (zM22120g9 || objM22097O9 == p84Var) {
                                        objM22097O9 = new fl4(vi3Var5, 15);
                                        tj3Var9.m22131l0(objM22097O9);
                                    }
                                    of5.m17959a(jtb.f46139c, AbstractC0080f.m815b(null, false, (ui3) objM22097O9, b16Var, 15), jtb.f46140d, gf5Var, tj3Var9, 24582, 428);
                                }
                                break;
                        }
                        return xfaVar2;
                    }
                }), 3);
                if (do1Var.f35931c) {
                    final int i11 = zContains ? 1 : 0;
                    vu4.m23545g(vu4Var5, null, new C0282a(-2033845242, true, new aj3() { // from class: ao1
                        @Override // p000.aj3
                        public final Object invoke(Object obj6, Object obj7, Object obj8) {
                            int i12 = i11;
                            xfa xfaVar2 = xfa.f68157a;
                            p84 p84Var = we1.f66679a;
                            b16 b16Var = b16.f7762a;
                            vi3 vi3Var5 = vi3Var4;
                            switch (i12) {
                                case 0:
                                    ye1 ye1Var = (ye1) obj7;
                                    int iIntValue = ((Integer) obj8).intValue();
                                    ((ft4) obj6).getClass();
                                    tj3 tj3Var = (tj3) ye1Var;
                                    if (!tj3Var.m22099R(iIntValue & 1, (iIntValue & 17) != 16)) {
                                        tj3Var.m22102U();
                                    } else {
                                        boolean zM22120g = tj3Var.m22120g(vi3Var5);
                                        Object objM22097O = tj3Var.m22097O();
                                        if (zM22120g || objM22097O == p84Var) {
                                            objM22097O = new f91(vi3Var5, 9);
                                            tj3Var.m22131l0(objM22097O);
                                        }
                                        of5.m17959a(wob.f67143h, AbstractC0080f.m815b(null, false, (ui3) objM22097O, b16Var, 15), wob.f67144i, gf5Var, tj3Var, 24582, 428);
                                    }
                                    break;
                                case 1:
                                    ye1 ye1Var2 = (ye1) obj7;
                                    int iIntValue2 = ((Integer) obj8).intValue();
                                    ((ft4) obj6).getClass();
                                    tj3 tj3Var2 = (tj3) ye1Var2;
                                    if (!tj3Var2.m22099R(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                        tj3Var2.m22102U();
                                    } else {
                                        boolean zM22120g2 = tj3Var2.m22120g(vi3Var5);
                                        Object objM22097O2 = tj3Var2.m22097O();
                                        if (zM22120g2 || objM22097O2 == p84Var) {
                                            objM22097O2 = new f91(vi3Var5, 12);
                                            tj3Var2.m22131l0(objM22097O2);
                                        }
                                        of5.m17959a(wob.f67136a, AbstractC0080f.m815b(null, false, (ui3) objM22097O2, b16Var, 15), wob.f67137b, gf5Var, tj3Var2, 24582, 428);
                                    }
                                    break;
                                case 2:
                                    ye1 ye1Var3 = (ye1) obj7;
                                    int iIntValue3 = ((Integer) obj8).intValue();
                                    ((ft4) obj6).getClass();
                                    tj3 tj3Var3 = (tj3) ye1Var3;
                                    if (!tj3Var3.m22099R(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                        tj3Var3.m22102U();
                                    } else {
                                        boolean zM22120g3 = tj3Var3.m22120g(vi3Var5);
                                        Object objM22097O3 = tj3Var3.m22097O();
                                        if (zM22120g3 || objM22097O3 == p84Var) {
                                            objM22097O3 = new f91(vi3Var5, 13);
                                            tj3Var3.m22131l0(objM22097O3);
                                        }
                                        of5.m17959a(wob.f67138c, AbstractC0080f.m815b(null, false, (ui3) objM22097O3, b16Var, 15), wob.f67139d, gf5Var, tj3Var3, 24582, 428);
                                    }
                                    break;
                                case 3:
                                    ye1 ye1Var4 = (ye1) obj7;
                                    int iIntValue4 = ((Integer) obj8).intValue();
                                    ((ft4) obj6).getClass();
                                    tj3 tj3Var4 = (tj3) ye1Var4;
                                    if (!tj3Var4.m22099R(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                                        tj3Var4.m22102U();
                                    } else {
                                        boolean zM22120g4 = tj3Var4.m22120g(vi3Var5);
                                        Object objM22097O4 = tj3Var4.m22097O();
                                        if (zM22120g4 || objM22097O4 == p84Var) {
                                            objM22097O4 = new f91(vi3Var5, 11);
                                            tj3Var4.m22131l0(objM22097O4);
                                        }
                                        of5.m17959a(wob.f67141f, AbstractC0080f.m815b(null, false, (ui3) objM22097O4, b16Var, 15), wob.f67142g, gf5Var, tj3Var4, 24582, 428);
                                    }
                                    break;
                                case 4:
                                    ye1 ye1Var5 = (ye1) obj7;
                                    int iIntValue5 = ((Integer) obj8).intValue();
                                    ((ft4) obj6).getClass();
                                    tj3 tj3Var5 = (tj3) ye1Var5;
                                    if (!tj3Var5.m22099R(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                                        tj3Var5.m22102U();
                                    } else {
                                        boolean zM22120g5 = tj3Var5.m22120g(vi3Var5);
                                        Object objM22097O5 = tj3Var5.m22097O();
                                        if (zM22120g5 || objM22097O5 == p84Var) {
                                            objM22097O5 = new fl4(vi3Var5, 22);
                                            tj3Var5.m22131l0(objM22097O5);
                                        }
                                        of5.m17959a(jtb.f46141e, AbstractC0080f.m815b(null, false, (ui3) objM22097O5, b16Var, 15), jtb.f46142f, gf5Var, tj3Var5, 24582, 428);
                                    }
                                    break;
                                case 5:
                                    ye1 ye1Var6 = (ye1) obj7;
                                    int iIntValue6 = ((Integer) obj8).intValue();
                                    ((ft4) obj6).getClass();
                                    tj3 tj3Var6 = (tj3) ye1Var6;
                                    if (!tj3Var6.m22099R(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                                        tj3Var6.m22102U();
                                    } else {
                                        boolean zM22120g6 = tj3Var6.m22120g(vi3Var5);
                                        Object objM22097O6 = tj3Var6.m22097O();
                                        if (zM22120g6 || objM22097O6 == p84Var) {
                                            objM22097O6 = new fl4(vi3Var5, 20);
                                            tj3Var6.m22131l0(objM22097O6);
                                        }
                                        of5.m17959a(jtb.f46144h, AbstractC0080f.m815b(null, false, (ui3) objM22097O6, b16Var, 15), jtb.f46145i, gf5Var, tj3Var6, 24582, 428);
                                    }
                                    break;
                                case 6:
                                    ye1 ye1Var7 = (ye1) obj7;
                                    int iIntValue7 = ((Integer) obj8).intValue();
                                    ((ft4) obj6).getClass();
                                    tj3 tj3Var7 = (tj3) ye1Var7;
                                    if (!tj3Var7.m22099R(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                                        tj3Var7.m22102U();
                                    } else {
                                        boolean zM22120g7 = tj3Var7.m22120g(vi3Var5);
                                        Object objM22097O7 = tj3Var7.m22097O();
                                        if (zM22120g7 || objM22097O7 == p84Var) {
                                            objM22097O7 = new fl4(vi3Var5, 18);
                                            tj3Var7.m22131l0(objM22097O7);
                                        }
                                        of5.m17959a(jtb.f46146j, AbstractC0080f.m815b(null, false, (ui3) objM22097O7, b16Var, 15), jtb.f46147k, gf5Var, tj3Var7, 24582, 428);
                                    }
                                    break;
                                case 7:
                                    ye1 ye1Var8 = (ye1) obj7;
                                    int iIntValue8 = ((Integer) obj8).intValue();
                                    ((ft4) obj6).getClass();
                                    tj3 tj3Var8 = (tj3) ye1Var8;
                                    if (!tj3Var8.m22099R(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                                        tj3Var8.m22102U();
                                    } else {
                                        boolean zM22120g8 = tj3Var8.m22120g(vi3Var5);
                                        Object objM22097O8 = tj3Var8.m22097O();
                                        if (zM22120g8 || objM22097O8 == p84Var) {
                                            objM22097O8 = new fl4(vi3Var5, 17);
                                            tj3Var8.m22131l0(objM22097O8);
                                        }
                                        of5.m17959a(jtb.f46137a, AbstractC0080f.m815b(null, false, (ui3) objM22097O8, b16Var, 15), jtb.f46138b, gf5Var, tj3Var8, 24582, 428);
                                    }
                                    break;
                                default:
                                    ye1 ye1Var9 = (ye1) obj7;
                                    int iIntValue9 = ((Integer) obj8).intValue();
                                    ((ft4) obj6).getClass();
                                    tj3 tj3Var9 = (tj3) ye1Var9;
                                    if (!tj3Var9.m22099R(iIntValue9 & 1, (iIntValue9 & 17) != 16)) {
                                        tj3Var9.m22102U();
                                    } else {
                                        boolean zM22120g9 = tj3Var9.m22120g(vi3Var5);
                                        Object objM22097O9 = tj3Var9.m22097O();
                                        if (zM22120g9 || objM22097O9 == p84Var) {
                                            objM22097O9 = new fl4(vi3Var5, 15);
                                            tj3Var9.m22131l0(objM22097O9);
                                        }
                                        of5.m17959a(jtb.f46139c, AbstractC0080f.m815b(null, false, (ui3) objM22097O9, b16Var, 15), jtb.f46140d, gf5Var, tj3Var9, 24582, 428);
                                    }
                                    break;
                            }
                            return xfaVar2;
                        }
                    }), 3);
                }
                return xfaVar;
            case 9:
                List list5 = (List) obj5;
                vu4 vu4Var6 = (vu4) obj;
                vu4Var6.getClass();
                vu4Var6.m23547h(list5.size(), new ue0(i2, new ae1(18), list5), new C3520r2(12, list5), new C0282a(802480018, true, new C3558s2(list5, (Context) obj3, (String) obj4, (vi3) obj2)));
                return xfaVar;
            case 10:
                vi3 vi3Var5 = (vi3) obj2;
                a03 a03Var = (a03) obj5;
                LibraryItem libraryItem = a03Var.f17a;
                vi3 vi3Var6 = (vi3) obj4;
                t66 t66Var5 = (t66) obj3;
                LessonContextMenuItem lessonContextMenuItem = (LessonContextMenuItem) obj;
                lessonContextMenuItem.getClass();
                switch (g03.f40013a[lessonContextMenuItem.ordinal()]) {
                    case 1:
                        vi3Var5.invoke(new v03(libraryItem, true));
                        break;
                    case 2:
                        vi3Var5.invoke(new x03(libraryItem));
                        break;
                    case 3:
                        vi3Var5.invoke(new w03(libraryItem));
                        break;
                    case 4:
                        vi3Var6.invoke(new h03(libraryItem, LqAnalyticsValues$LikeLocation.LessonDropdown));
                        break;
                    case 5:
                        vi3Var5.invoke(new r03(libraryItem));
                        break;
                    case 6:
                    case 9:
                    case 10:
                        break;
                    case 7:
                        vi3Var5.invoke(new y03(libraryItem));
                        break;
                    case 8:
                        int i12 = libraryItem.f19426a;
                        LibraryItemCounter libraryItemCounter = a03Var.f18b;
                        if (libraryItemCounter != null && libraryItemCounter.f19460f) {
                            z = true;
                        }
                        vi3Var6.invoke(new i03(i12, !z));
                        break;
                    default:
                        gm5.m12750e();
                        return null;
                }
                t66Var5.setValue(Boolean.FALSE);
                return xfaVar;
            case 11:
                ui3 ui3Var = (ui3) obj5;
                ud6 ud6Var2 = (ud6) obj4;
                rh3 rh3Var = (rh3) obj3;
                dh9 dh9Var2 = (dh9) obj2;
                uh3 uh3Var = (uh3) obj;
                uh3Var.getClass();
                if (uh3Var.equals(sh3.f60862a)) {
                    ui3Var.mo0a();
                } else {
                    if (!uh3Var.equals(th3.f62274a)) {
                        gm5.m12750e();
                        return null;
                    }
                    gd6 gd6Var = hd6.Companion;
                    String str4 = rh3Var.f59263a;
                    boolean z2 = ((li3) dh9Var2.getValue()).f49707j;
                    String str5 = rh3Var.f59265c;
                    gd6Var.getClass();
                    jfa.m14428k(ud6Var2, new fd6(str4, str5, z2), null);
                }
                return xfaVar;
            case 12:
                final zh9 zh9Var = (zh9) obj5;
                zi3 zi3Var = (zi3) obj3;
                vu4 vu4Var7 = (vu4) obj;
                vu4Var7.getClass();
                vu4.m23545g(vu4Var7, "dropdown_period", new C0282a(-175720803, true, new ik0((t66) obj4, zh9Var, (vi3) obj2, 28)), 2);
                vu4.m23545g(vu4Var7, null, new C0282a(1063245766, true, new C3180kd(23, zh9Var, zi3Var)), 3);
                vu4.m23545g(vu4Var7, null, fsb.f39599b, 3);
                boolean z3 = zh9Var instanceof yh9;
                if (z3) {
                    List list6 = ((yh9) zh9Var).f69854c;
                    vu4.m23546i(vu4Var7, list6.size(), new bz0(i7, list6), new C0282a(-1943975239, true, new dw0(list6, zh9Var, zi3Var, i7)), 4);
                } else {
                    vu4.m23545g(vu4Var7, null, fsb.f39600c, 3);
                }
                vu4.m23545g(vu4Var7, null, fsb.f39601d, 3);
                if (z3) {
                    final List list7 = ((yh9) zh9Var).f69855d;
                    int size = list7.size();
                    bz0 bz0Var = new bz0(i5, list7);
                    final int i13 = zContains ? 1 : 0;
                    vu4.m23546i(vu4Var7, size, bz0Var, new C0282a(-1717185310, true, new bj3() { // from class: jn4
                        @Override // p000.bj3
                        /* JADX INFO: renamed from: e */
                        public final Object mo825e(Object obj6, Object obj7, Object obj8, Object obj9) {
                            int i14 = i13;
                            xfa xfaVar2 = xfa.f68157a;
                            zh9 zh9Var2 = zh9Var;
                            List list8 = list7;
                            switch (i14) {
                                case 0:
                                    int iIntValue = ((Integer) obj7).intValue();
                                    ye1 ye1Var = (ye1) obj8;
                                    int iIntValue2 = ((Integer) obj9).intValue();
                                    ((ft4) obj6).getClass();
                                    if ((iIntValue2 & 48) == 0) {
                                        iIntValue2 |= ((tj3) ye1Var).m22116e(iIntValue) ? 32 : 16;
                                    }
                                    tj3 tj3Var = (tj3) ye1Var;
                                    if (!tj3Var.m22099R(iIntValue2 & 1, (iIntValue2 & 145) != 144)) {
                                        tj3Var.m22102U();
                                    } else {
                                        bh9 bh9Var = (bh9) list8.get(iIntValue);
                                        yhd.m25150f(iIntValue == 0, iIntValue == list8.size() - 1, vz1.m23620a0(tj3Var, bh9Var.f8548b), ((yh9) zh9Var2).f69852a, bh9Var, null, null, tj3Var, 0, 96);
                                    }
                                    break;
                                default:
                                    int iIntValue3 = ((Integer) obj7).intValue();
                                    ye1 ye1Var2 = (ye1) obj8;
                                    int iIntValue4 = ((Integer) obj9).intValue();
                                    ((ft4) obj6).getClass();
                                    if ((iIntValue4 & 48) == 0) {
                                        iIntValue4 |= ((tj3) ye1Var2).m22116e(iIntValue3) ? 32 : 16;
                                    }
                                    tj3 tj3Var2 = (tj3) ye1Var2;
                                    if (!tj3Var2.m22099R(iIntValue4 & 1, (iIntValue4 & 145) != 144)) {
                                        tj3Var2.m22102U();
                                    } else {
                                        bh9 bh9Var2 = (bh9) list8.get(iIntValue3);
                                        yhd.m25150f(iIntValue3 == 0, iIntValue3 == list8.size() - 1, vz1.m23620a0(tj3Var2, bh9Var2.f8548b), ((yh9) zh9Var2).f69852a, bh9Var2, null, null, tj3Var2, 0, 96);
                                    }
                                    break;
                            }
                            return xfaVar2;
                        }
                    }), 4);
                } else {
                    vu4.m23545g(vu4Var7, null, fsb.f39602e, 3);
                }
                vu4.m23545g(vu4Var7, null, fsb.f39603f, 3);
                if (z3) {
                    final List list8 = ((yh9) zh9Var).f69856e;
                    vu4.m23546i(vu4Var7, list8.size(), new bz0(i6, list8), new C0282a(1609821057, true, new bj3() { // from class: jn4
                        @Override // p000.bj3
                        /* JADX INFO: renamed from: e */
                        public final Object mo825e(Object obj6, Object obj7, Object obj8, Object obj9) {
                            int i14 = i7;
                            xfa xfaVar2 = xfa.f68157a;
                            zh9 zh9Var2 = zh9Var;
                            List list9 = list8;
                            switch (i14) {
                                case 0:
                                    int iIntValue = ((Integer) obj7).intValue();
                                    ye1 ye1Var = (ye1) obj8;
                                    int iIntValue2 = ((Integer) obj9).intValue();
                                    ((ft4) obj6).getClass();
                                    if ((iIntValue2 & 48) == 0) {
                                        iIntValue2 |= ((tj3) ye1Var).m22116e(iIntValue) ? 32 : 16;
                                    }
                                    tj3 tj3Var = (tj3) ye1Var;
                                    if (!tj3Var.m22099R(iIntValue2 & 1, (iIntValue2 & 145) != 144)) {
                                        tj3Var.m22102U();
                                    } else {
                                        bh9 bh9Var = (bh9) list9.get(iIntValue);
                                        yhd.m25150f(iIntValue == 0, iIntValue == list9.size() - 1, vz1.m23620a0(tj3Var, bh9Var.f8548b), ((yh9) zh9Var2).f69852a, bh9Var, null, null, tj3Var, 0, 96);
                                    }
                                    break;
                                default:
                                    int iIntValue3 = ((Integer) obj7).intValue();
                                    ye1 ye1Var2 = (ye1) obj8;
                                    int iIntValue4 = ((Integer) obj9).intValue();
                                    ((ft4) obj6).getClass();
                                    if ((iIntValue4 & 48) == 0) {
                                        iIntValue4 |= ((tj3) ye1Var2).m22116e(iIntValue3) ? 32 : 16;
                                    }
                                    tj3 tj3Var2 = (tj3) ye1Var2;
                                    if (!tj3Var2.m22099R(iIntValue4 & 1, (iIntValue4 & 145) != 144)) {
                                        tj3Var2.m22102U();
                                    } else {
                                        bh9 bh9Var2 = (bh9) list9.get(iIntValue3);
                                        yhd.m25150f(iIntValue3 == 0, iIntValue3 == list9.size() - 1, vz1.m23620a0(tj3Var2, bh9Var2.f8548b), ((yh9) zh9Var2).f69852a, bh9Var2, null, null, tj3Var2, 0, 96);
                                    }
                                    break;
                            }
                            return xfaVar2;
                        }
                    }), 4);
                } else {
                    vu4.m23545g(vu4Var7, null, fsb.f39604g, 3);
                }
                vu4.m23545g(vu4Var7, null, fsb.f39605h, 3);
                return xfaVar;
            case 13:
                lp4 lp4Var = (lp4) obj5;
                Context context2 = (Context) obj3;
                vu4 vu4Var8 = (vu4) obj;
                vu4Var8.getClass();
                List list9 = lp4Var.f49976a;
                vu4.m23546i(vu4Var8, list9.size(), new bz0(i3, list9), new C0282a(-893517554, true, new gy0(list9, lp4Var, (vi3) obj2, (fe9) obj4, context2, 1)), 4);
                return xfaVar;
            case 14:
                d05 d05Var = (d05) obj5;
                final vi3 vi3Var7 = (vi3) obj2;
                final gf5 gf5Var2 = (gf5) obj3;
                vu4 vu4Var9 = (vu4) obj;
                vu4Var9.getClass();
                vu4.m23545g(vu4Var9, null, new C0282a(974136560, true, new iq0((String) obj4, i4)), 3);
                vu4.m23545g(vu4Var9, null, new C0282a(-1951448601, true, new b05(vi3Var7, gf5Var2, d05Var, i5)), 3);
                vu4.m23545g(vu4Var9, null, new C0282a(108473896, true, new aj3() { // from class: ao1
                    @Override // p000.aj3
                    public final Object invoke(Object obj6, Object obj7, Object obj8) {
                        int i14 = i2;
                        xfa xfaVar2 = xfa.f68157a;
                        p84 p84Var = we1.f66679a;
                        b16 b16Var = b16.f7762a;
                        vi3 vi3Var8 = vi3Var7;
                        switch (i14) {
                            case 0:
                                ye1 ye1Var = (ye1) obj7;
                                int iIntValue = ((Integer) obj8).intValue();
                                ((ft4) obj6).getClass();
                                tj3 tj3Var = (tj3) ye1Var;
                                if (!tj3Var.m22099R(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    tj3Var.m22102U();
                                } else {
                                    boolean zM22120g = tj3Var.m22120g(vi3Var8);
                                    Object objM22097O = tj3Var.m22097O();
                                    if (zM22120g || objM22097O == p84Var) {
                                        objM22097O = new f91(vi3Var8, 9);
                                        tj3Var.m22131l0(objM22097O);
                                    }
                                    of5.m17959a(wob.f67143h, AbstractC0080f.m815b(null, false, (ui3) objM22097O, b16Var, 15), wob.f67144i, gf5Var2, tj3Var, 24582, 428);
                                }
                                break;
                            case 1:
                                ye1 ye1Var2 = (ye1) obj7;
                                int iIntValue2 = ((Integer) obj8).intValue();
                                ((ft4) obj6).getClass();
                                tj3 tj3Var2 = (tj3) ye1Var2;
                                if (!tj3Var2.m22099R(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                    tj3Var2.m22102U();
                                } else {
                                    boolean zM22120g2 = tj3Var2.m22120g(vi3Var8);
                                    Object objM22097O2 = tj3Var2.m22097O();
                                    if (zM22120g2 || objM22097O2 == p84Var) {
                                        objM22097O2 = new f91(vi3Var8, 12);
                                        tj3Var2.m22131l0(objM22097O2);
                                    }
                                    of5.m17959a(wob.f67136a, AbstractC0080f.m815b(null, false, (ui3) objM22097O2, b16Var, 15), wob.f67137b, gf5Var2, tj3Var2, 24582, 428);
                                }
                                break;
                            case 2:
                                ye1 ye1Var3 = (ye1) obj7;
                                int iIntValue3 = ((Integer) obj8).intValue();
                                ((ft4) obj6).getClass();
                                tj3 tj3Var3 = (tj3) ye1Var3;
                                if (!tj3Var3.m22099R(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                    tj3Var3.m22102U();
                                } else {
                                    boolean zM22120g3 = tj3Var3.m22120g(vi3Var8);
                                    Object objM22097O3 = tj3Var3.m22097O();
                                    if (zM22120g3 || objM22097O3 == p84Var) {
                                        objM22097O3 = new f91(vi3Var8, 13);
                                        tj3Var3.m22131l0(objM22097O3);
                                    }
                                    of5.m17959a(wob.f67138c, AbstractC0080f.m815b(null, false, (ui3) objM22097O3, b16Var, 15), wob.f67139d, gf5Var2, tj3Var3, 24582, 428);
                                }
                                break;
                            case 3:
                                ye1 ye1Var4 = (ye1) obj7;
                                int iIntValue4 = ((Integer) obj8).intValue();
                                ((ft4) obj6).getClass();
                                tj3 tj3Var4 = (tj3) ye1Var4;
                                if (!tj3Var4.m22099R(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                                    tj3Var4.m22102U();
                                } else {
                                    boolean zM22120g4 = tj3Var4.m22120g(vi3Var8);
                                    Object objM22097O4 = tj3Var4.m22097O();
                                    if (zM22120g4 || objM22097O4 == p84Var) {
                                        objM22097O4 = new f91(vi3Var8, 11);
                                        tj3Var4.m22131l0(objM22097O4);
                                    }
                                    of5.m17959a(wob.f67141f, AbstractC0080f.m815b(null, false, (ui3) objM22097O4, b16Var, 15), wob.f67142g, gf5Var2, tj3Var4, 24582, 428);
                                }
                                break;
                            case 4:
                                ye1 ye1Var5 = (ye1) obj7;
                                int iIntValue5 = ((Integer) obj8).intValue();
                                ((ft4) obj6).getClass();
                                tj3 tj3Var5 = (tj3) ye1Var5;
                                if (!tj3Var5.m22099R(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                                    tj3Var5.m22102U();
                                } else {
                                    boolean zM22120g5 = tj3Var5.m22120g(vi3Var8);
                                    Object objM22097O5 = tj3Var5.m22097O();
                                    if (zM22120g5 || objM22097O5 == p84Var) {
                                        objM22097O5 = new fl4(vi3Var8, 22);
                                        tj3Var5.m22131l0(objM22097O5);
                                    }
                                    of5.m17959a(jtb.f46141e, AbstractC0080f.m815b(null, false, (ui3) objM22097O5, b16Var, 15), jtb.f46142f, gf5Var2, tj3Var5, 24582, 428);
                                }
                                break;
                            case 5:
                                ye1 ye1Var6 = (ye1) obj7;
                                int iIntValue6 = ((Integer) obj8).intValue();
                                ((ft4) obj6).getClass();
                                tj3 tj3Var6 = (tj3) ye1Var6;
                                if (!tj3Var6.m22099R(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                                    tj3Var6.m22102U();
                                } else {
                                    boolean zM22120g6 = tj3Var6.m22120g(vi3Var8);
                                    Object objM22097O6 = tj3Var6.m22097O();
                                    if (zM22120g6 || objM22097O6 == p84Var) {
                                        objM22097O6 = new fl4(vi3Var8, 20);
                                        tj3Var6.m22131l0(objM22097O6);
                                    }
                                    of5.m17959a(jtb.f46144h, AbstractC0080f.m815b(null, false, (ui3) objM22097O6, b16Var, 15), jtb.f46145i, gf5Var2, tj3Var6, 24582, 428);
                                }
                                break;
                            case 6:
                                ye1 ye1Var7 = (ye1) obj7;
                                int iIntValue7 = ((Integer) obj8).intValue();
                                ((ft4) obj6).getClass();
                                tj3 tj3Var7 = (tj3) ye1Var7;
                                if (!tj3Var7.m22099R(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                                    tj3Var7.m22102U();
                                } else {
                                    boolean zM22120g7 = tj3Var7.m22120g(vi3Var8);
                                    Object objM22097O7 = tj3Var7.m22097O();
                                    if (zM22120g7 || objM22097O7 == p84Var) {
                                        objM22097O7 = new fl4(vi3Var8, 18);
                                        tj3Var7.m22131l0(objM22097O7);
                                    }
                                    of5.m17959a(jtb.f46146j, AbstractC0080f.m815b(null, false, (ui3) objM22097O7, b16Var, 15), jtb.f46147k, gf5Var2, tj3Var7, 24582, 428);
                                }
                                break;
                            case 7:
                                ye1 ye1Var8 = (ye1) obj7;
                                int iIntValue8 = ((Integer) obj8).intValue();
                                ((ft4) obj6).getClass();
                                tj3 tj3Var8 = (tj3) ye1Var8;
                                if (!tj3Var8.m22099R(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                                    tj3Var8.m22102U();
                                } else {
                                    boolean zM22120g8 = tj3Var8.m22120g(vi3Var8);
                                    Object objM22097O8 = tj3Var8.m22097O();
                                    if (zM22120g8 || objM22097O8 == p84Var) {
                                        objM22097O8 = new fl4(vi3Var8, 17);
                                        tj3Var8.m22131l0(objM22097O8);
                                    }
                                    of5.m17959a(jtb.f46137a, AbstractC0080f.m815b(null, false, (ui3) objM22097O8, b16Var, 15), jtb.f46138b, gf5Var2, tj3Var8, 24582, 428);
                                }
                                break;
                            default:
                                ye1 ye1Var9 = (ye1) obj7;
                                int iIntValue9 = ((Integer) obj8).intValue();
                                ((ft4) obj6).getClass();
                                tj3 tj3Var9 = (tj3) ye1Var9;
                                if (!tj3Var9.m22099R(iIntValue9 & 1, (iIntValue9 & 17) != 16)) {
                                    tj3Var9.m22102U();
                                } else {
                                    boolean zM22120g9 = tj3Var9.m22120g(vi3Var8);
                                    Object objM22097O9 = tj3Var9.m22097O();
                                    if (zM22120g9 || objM22097O9 == p84Var) {
                                        objM22097O9 = new fl4(vi3Var8, 15);
                                        tj3Var9.m22131l0(objM22097O9);
                                    }
                                    of5.m17959a(jtb.f46139c, AbstractC0080f.m815b(null, false, (ui3) objM22097O9, b16Var, 15), jtb.f46140d, gf5Var2, tj3Var9, 24582, 428);
                                }
                                break;
                        }
                        return xfaVar2;
                    }
                }), 3);
                vu4.m23545g(vu4Var9, null, new C0282a(-2126570903, true, new b05(vi3Var7, gf5Var2, d05Var, i6)), 3);
                boolean z4 = d05Var.f34797b;
                if (!z4) {
                    vu4.m23545g(vu4Var9, null, new C0282a(-704109301, true, new b05(d05Var, vi3Var7, gf5Var2, i4)), 3);
                }
                if (!d05Var.f34800e) {
                    final int i14 = 8;
                    vu4.m23545g(vu4Var9, null, new C0282a(161982274, true, new aj3() { // from class: ao1
                        @Override // p000.aj3
                        public final Object invoke(Object obj6, Object obj7, Object obj8) {
                            int i15 = i14;
                            xfa xfaVar2 = xfa.f68157a;
                            p84 p84Var = we1.f66679a;
                            b16 b16Var = b16.f7762a;
                            vi3 vi3Var8 = vi3Var7;
                            switch (i15) {
                                case 0:
                                    ye1 ye1Var = (ye1) obj7;
                                    int iIntValue = ((Integer) obj8).intValue();
                                    ((ft4) obj6).getClass();
                                    tj3 tj3Var = (tj3) ye1Var;
                                    if (!tj3Var.m22099R(iIntValue & 1, (iIntValue & 17) != 16)) {
                                        tj3Var.m22102U();
                                    } else {
                                        boolean zM22120g = tj3Var.m22120g(vi3Var8);
                                        Object objM22097O = tj3Var.m22097O();
                                        if (zM22120g || objM22097O == p84Var) {
                                            objM22097O = new f91(vi3Var8, 9);
                                            tj3Var.m22131l0(objM22097O);
                                        }
                                        of5.m17959a(wob.f67143h, AbstractC0080f.m815b(null, false, (ui3) objM22097O, b16Var, 15), wob.f67144i, gf5Var2, tj3Var, 24582, 428);
                                    }
                                    break;
                                case 1:
                                    ye1 ye1Var2 = (ye1) obj7;
                                    int iIntValue2 = ((Integer) obj8).intValue();
                                    ((ft4) obj6).getClass();
                                    tj3 tj3Var2 = (tj3) ye1Var2;
                                    if (!tj3Var2.m22099R(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                        tj3Var2.m22102U();
                                    } else {
                                        boolean zM22120g2 = tj3Var2.m22120g(vi3Var8);
                                        Object objM22097O2 = tj3Var2.m22097O();
                                        if (zM22120g2 || objM22097O2 == p84Var) {
                                            objM22097O2 = new f91(vi3Var8, 12);
                                            tj3Var2.m22131l0(objM22097O2);
                                        }
                                        of5.m17959a(wob.f67136a, AbstractC0080f.m815b(null, false, (ui3) objM22097O2, b16Var, 15), wob.f67137b, gf5Var2, tj3Var2, 24582, 428);
                                    }
                                    break;
                                case 2:
                                    ye1 ye1Var3 = (ye1) obj7;
                                    int iIntValue3 = ((Integer) obj8).intValue();
                                    ((ft4) obj6).getClass();
                                    tj3 tj3Var3 = (tj3) ye1Var3;
                                    if (!tj3Var3.m22099R(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                        tj3Var3.m22102U();
                                    } else {
                                        boolean zM22120g3 = tj3Var3.m22120g(vi3Var8);
                                        Object objM22097O3 = tj3Var3.m22097O();
                                        if (zM22120g3 || objM22097O3 == p84Var) {
                                            objM22097O3 = new f91(vi3Var8, 13);
                                            tj3Var3.m22131l0(objM22097O3);
                                        }
                                        of5.m17959a(wob.f67138c, AbstractC0080f.m815b(null, false, (ui3) objM22097O3, b16Var, 15), wob.f67139d, gf5Var2, tj3Var3, 24582, 428);
                                    }
                                    break;
                                case 3:
                                    ye1 ye1Var4 = (ye1) obj7;
                                    int iIntValue4 = ((Integer) obj8).intValue();
                                    ((ft4) obj6).getClass();
                                    tj3 tj3Var4 = (tj3) ye1Var4;
                                    if (!tj3Var4.m22099R(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                                        tj3Var4.m22102U();
                                    } else {
                                        boolean zM22120g4 = tj3Var4.m22120g(vi3Var8);
                                        Object objM22097O4 = tj3Var4.m22097O();
                                        if (zM22120g4 || objM22097O4 == p84Var) {
                                            objM22097O4 = new f91(vi3Var8, 11);
                                            tj3Var4.m22131l0(objM22097O4);
                                        }
                                        of5.m17959a(wob.f67141f, AbstractC0080f.m815b(null, false, (ui3) objM22097O4, b16Var, 15), wob.f67142g, gf5Var2, tj3Var4, 24582, 428);
                                    }
                                    break;
                                case 4:
                                    ye1 ye1Var5 = (ye1) obj7;
                                    int iIntValue5 = ((Integer) obj8).intValue();
                                    ((ft4) obj6).getClass();
                                    tj3 tj3Var5 = (tj3) ye1Var5;
                                    if (!tj3Var5.m22099R(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                                        tj3Var5.m22102U();
                                    } else {
                                        boolean zM22120g5 = tj3Var5.m22120g(vi3Var8);
                                        Object objM22097O5 = tj3Var5.m22097O();
                                        if (zM22120g5 || objM22097O5 == p84Var) {
                                            objM22097O5 = new fl4(vi3Var8, 22);
                                            tj3Var5.m22131l0(objM22097O5);
                                        }
                                        of5.m17959a(jtb.f46141e, AbstractC0080f.m815b(null, false, (ui3) objM22097O5, b16Var, 15), jtb.f46142f, gf5Var2, tj3Var5, 24582, 428);
                                    }
                                    break;
                                case 5:
                                    ye1 ye1Var6 = (ye1) obj7;
                                    int iIntValue6 = ((Integer) obj8).intValue();
                                    ((ft4) obj6).getClass();
                                    tj3 tj3Var6 = (tj3) ye1Var6;
                                    if (!tj3Var6.m22099R(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                                        tj3Var6.m22102U();
                                    } else {
                                        boolean zM22120g6 = tj3Var6.m22120g(vi3Var8);
                                        Object objM22097O6 = tj3Var6.m22097O();
                                        if (zM22120g6 || objM22097O6 == p84Var) {
                                            objM22097O6 = new fl4(vi3Var8, 20);
                                            tj3Var6.m22131l0(objM22097O6);
                                        }
                                        of5.m17959a(jtb.f46144h, AbstractC0080f.m815b(null, false, (ui3) objM22097O6, b16Var, 15), jtb.f46145i, gf5Var2, tj3Var6, 24582, 428);
                                    }
                                    break;
                                case 6:
                                    ye1 ye1Var7 = (ye1) obj7;
                                    int iIntValue7 = ((Integer) obj8).intValue();
                                    ((ft4) obj6).getClass();
                                    tj3 tj3Var7 = (tj3) ye1Var7;
                                    if (!tj3Var7.m22099R(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                                        tj3Var7.m22102U();
                                    } else {
                                        boolean zM22120g7 = tj3Var7.m22120g(vi3Var8);
                                        Object objM22097O7 = tj3Var7.m22097O();
                                        if (zM22120g7 || objM22097O7 == p84Var) {
                                            objM22097O7 = new fl4(vi3Var8, 18);
                                            tj3Var7.m22131l0(objM22097O7);
                                        }
                                        of5.m17959a(jtb.f46146j, AbstractC0080f.m815b(null, false, (ui3) objM22097O7, b16Var, 15), jtb.f46147k, gf5Var2, tj3Var7, 24582, 428);
                                    }
                                    break;
                                case 7:
                                    ye1 ye1Var8 = (ye1) obj7;
                                    int iIntValue8 = ((Integer) obj8).intValue();
                                    ((ft4) obj6).getClass();
                                    tj3 tj3Var8 = (tj3) ye1Var8;
                                    if (!tj3Var8.m22099R(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                                        tj3Var8.m22102U();
                                    } else {
                                        boolean zM22120g8 = tj3Var8.m22120g(vi3Var8);
                                        Object objM22097O8 = tj3Var8.m22097O();
                                        if (zM22120g8 || objM22097O8 == p84Var) {
                                            objM22097O8 = new fl4(vi3Var8, 17);
                                            tj3Var8.m22131l0(objM22097O8);
                                        }
                                        of5.m17959a(jtb.f46137a, AbstractC0080f.m815b(null, false, (ui3) objM22097O8, b16Var, 15), jtb.f46138b, gf5Var2, tj3Var8, 24582, 428);
                                    }
                                    break;
                                default:
                                    ye1 ye1Var9 = (ye1) obj7;
                                    int iIntValue9 = ((Integer) obj8).intValue();
                                    ((ft4) obj6).getClass();
                                    tj3 tj3Var9 = (tj3) ye1Var9;
                                    if (!tj3Var9.m22099R(iIntValue9 & 1, (iIntValue9 & 17) != 16)) {
                                        tj3Var9.m22102U();
                                    } else {
                                        boolean zM22120g9 = tj3Var9.m22120g(vi3Var8);
                                        Object objM22097O9 = tj3Var9.m22097O();
                                        if (zM22120g9 || objM22097O9 == p84Var) {
                                            objM22097O9 = new fl4(vi3Var8, 15);
                                            tj3Var9.m22131l0(objM22097O9);
                                        }
                                        of5.m17959a(jtb.f46139c, AbstractC0080f.m815b(null, false, (ui3) objM22097O9, b16Var, 15), jtb.f46140d, gf5Var2, tj3Var9, 24582, 428);
                                    }
                                    break;
                            }
                            return xfaVar2;
                        }
                    }), 3);
                }
                if (!z4) {
                    vu4.m23545g(vu4Var9, null, new C0282a(-2073062525, true, new aj3() { // from class: ao1
                        @Override // p000.aj3
                        public final Object invoke(Object obj6, Object obj7, Object obj8) {
                            int i15 = i4;
                            xfa xfaVar2 = xfa.f68157a;
                            p84 p84Var = we1.f66679a;
                            b16 b16Var = b16.f7762a;
                            vi3 vi3Var8 = vi3Var7;
                            switch (i15) {
                                case 0:
                                    ye1 ye1Var = (ye1) obj7;
                                    int iIntValue = ((Integer) obj8).intValue();
                                    ((ft4) obj6).getClass();
                                    tj3 tj3Var = (tj3) ye1Var;
                                    if (!tj3Var.m22099R(iIntValue & 1, (iIntValue & 17) != 16)) {
                                        tj3Var.m22102U();
                                    } else {
                                        boolean zM22120g = tj3Var.m22120g(vi3Var8);
                                        Object objM22097O = tj3Var.m22097O();
                                        if (zM22120g || objM22097O == p84Var) {
                                            objM22097O = new f91(vi3Var8, 9);
                                            tj3Var.m22131l0(objM22097O);
                                        }
                                        of5.m17959a(wob.f67143h, AbstractC0080f.m815b(null, false, (ui3) objM22097O, b16Var, 15), wob.f67144i, gf5Var2, tj3Var, 24582, 428);
                                    }
                                    break;
                                case 1:
                                    ye1 ye1Var2 = (ye1) obj7;
                                    int iIntValue2 = ((Integer) obj8).intValue();
                                    ((ft4) obj6).getClass();
                                    tj3 tj3Var2 = (tj3) ye1Var2;
                                    if (!tj3Var2.m22099R(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                        tj3Var2.m22102U();
                                    } else {
                                        boolean zM22120g2 = tj3Var2.m22120g(vi3Var8);
                                        Object objM22097O2 = tj3Var2.m22097O();
                                        if (zM22120g2 || objM22097O2 == p84Var) {
                                            objM22097O2 = new f91(vi3Var8, 12);
                                            tj3Var2.m22131l0(objM22097O2);
                                        }
                                        of5.m17959a(wob.f67136a, AbstractC0080f.m815b(null, false, (ui3) objM22097O2, b16Var, 15), wob.f67137b, gf5Var2, tj3Var2, 24582, 428);
                                    }
                                    break;
                                case 2:
                                    ye1 ye1Var3 = (ye1) obj7;
                                    int iIntValue3 = ((Integer) obj8).intValue();
                                    ((ft4) obj6).getClass();
                                    tj3 tj3Var3 = (tj3) ye1Var3;
                                    if (!tj3Var3.m22099R(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                        tj3Var3.m22102U();
                                    } else {
                                        boolean zM22120g3 = tj3Var3.m22120g(vi3Var8);
                                        Object objM22097O3 = tj3Var3.m22097O();
                                        if (zM22120g3 || objM22097O3 == p84Var) {
                                            objM22097O3 = new f91(vi3Var8, 13);
                                            tj3Var3.m22131l0(objM22097O3);
                                        }
                                        of5.m17959a(wob.f67138c, AbstractC0080f.m815b(null, false, (ui3) objM22097O3, b16Var, 15), wob.f67139d, gf5Var2, tj3Var3, 24582, 428);
                                    }
                                    break;
                                case 3:
                                    ye1 ye1Var4 = (ye1) obj7;
                                    int iIntValue4 = ((Integer) obj8).intValue();
                                    ((ft4) obj6).getClass();
                                    tj3 tj3Var4 = (tj3) ye1Var4;
                                    if (!tj3Var4.m22099R(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                                        tj3Var4.m22102U();
                                    } else {
                                        boolean zM22120g4 = tj3Var4.m22120g(vi3Var8);
                                        Object objM22097O4 = tj3Var4.m22097O();
                                        if (zM22120g4 || objM22097O4 == p84Var) {
                                            objM22097O4 = new f91(vi3Var8, 11);
                                            tj3Var4.m22131l0(objM22097O4);
                                        }
                                        of5.m17959a(wob.f67141f, AbstractC0080f.m815b(null, false, (ui3) objM22097O4, b16Var, 15), wob.f67142g, gf5Var2, tj3Var4, 24582, 428);
                                    }
                                    break;
                                case 4:
                                    ye1 ye1Var5 = (ye1) obj7;
                                    int iIntValue5 = ((Integer) obj8).intValue();
                                    ((ft4) obj6).getClass();
                                    tj3 tj3Var5 = (tj3) ye1Var5;
                                    if (!tj3Var5.m22099R(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                                        tj3Var5.m22102U();
                                    } else {
                                        boolean zM22120g5 = tj3Var5.m22120g(vi3Var8);
                                        Object objM22097O5 = tj3Var5.m22097O();
                                        if (zM22120g5 || objM22097O5 == p84Var) {
                                            objM22097O5 = new fl4(vi3Var8, 22);
                                            tj3Var5.m22131l0(objM22097O5);
                                        }
                                        of5.m17959a(jtb.f46141e, AbstractC0080f.m815b(null, false, (ui3) objM22097O5, b16Var, 15), jtb.f46142f, gf5Var2, tj3Var5, 24582, 428);
                                    }
                                    break;
                                case 5:
                                    ye1 ye1Var6 = (ye1) obj7;
                                    int iIntValue6 = ((Integer) obj8).intValue();
                                    ((ft4) obj6).getClass();
                                    tj3 tj3Var6 = (tj3) ye1Var6;
                                    if (!tj3Var6.m22099R(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                                        tj3Var6.m22102U();
                                    } else {
                                        boolean zM22120g6 = tj3Var6.m22120g(vi3Var8);
                                        Object objM22097O6 = tj3Var6.m22097O();
                                        if (zM22120g6 || objM22097O6 == p84Var) {
                                            objM22097O6 = new fl4(vi3Var8, 20);
                                            tj3Var6.m22131l0(objM22097O6);
                                        }
                                        of5.m17959a(jtb.f46144h, AbstractC0080f.m815b(null, false, (ui3) objM22097O6, b16Var, 15), jtb.f46145i, gf5Var2, tj3Var6, 24582, 428);
                                    }
                                    break;
                                case 6:
                                    ye1 ye1Var7 = (ye1) obj7;
                                    int iIntValue7 = ((Integer) obj8).intValue();
                                    ((ft4) obj6).getClass();
                                    tj3 tj3Var7 = (tj3) ye1Var7;
                                    if (!tj3Var7.m22099R(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                                        tj3Var7.m22102U();
                                    } else {
                                        boolean zM22120g7 = tj3Var7.m22120g(vi3Var8);
                                        Object objM22097O7 = tj3Var7.m22097O();
                                        if (zM22120g7 || objM22097O7 == p84Var) {
                                            objM22097O7 = new fl4(vi3Var8, 18);
                                            tj3Var7.m22131l0(objM22097O7);
                                        }
                                        of5.m17959a(jtb.f46146j, AbstractC0080f.m815b(null, false, (ui3) objM22097O7, b16Var, 15), jtb.f46147k, gf5Var2, tj3Var7, 24582, 428);
                                    }
                                    break;
                                case 7:
                                    ye1 ye1Var8 = (ye1) obj7;
                                    int iIntValue8 = ((Integer) obj8).intValue();
                                    ((ft4) obj6).getClass();
                                    tj3 tj3Var8 = (tj3) ye1Var8;
                                    if (!tj3Var8.m22099R(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                                        tj3Var8.m22102U();
                                    } else {
                                        boolean zM22120g8 = tj3Var8.m22120g(vi3Var8);
                                        Object objM22097O8 = tj3Var8.m22097O();
                                        if (zM22120g8 || objM22097O8 == p84Var) {
                                            objM22097O8 = new fl4(vi3Var8, 17);
                                            tj3Var8.m22131l0(objM22097O8);
                                        }
                                        of5.m17959a(jtb.f46137a, AbstractC0080f.m815b(null, false, (ui3) objM22097O8, b16Var, 15), jtb.f46138b, gf5Var2, tj3Var8, 24582, 428);
                                    }
                                    break;
                                default:
                                    ye1 ye1Var9 = (ye1) obj7;
                                    int iIntValue9 = ((Integer) obj8).intValue();
                                    ((ft4) obj6).getClass();
                                    tj3 tj3Var9 = (tj3) ye1Var9;
                                    if (!tj3Var9.m22099R(iIntValue9 & 1, (iIntValue9 & 17) != 16)) {
                                        tj3Var9.m22102U();
                                    } else {
                                        boolean zM22120g9 = tj3Var9.m22120g(vi3Var8);
                                        Object objM22097O9 = tj3Var9.m22097O();
                                        if (zM22120g9 || objM22097O9 == p84Var) {
                                            objM22097O9 = new fl4(vi3Var8, 15);
                                            tj3Var9.m22131l0(objM22097O9);
                                        }
                                        of5.m17959a(jtb.f46139c, AbstractC0080f.m815b(null, false, (ui3) objM22097O9, b16Var, 15), jtb.f46140d, gf5Var2, tj3Var9, 24582, 428);
                                    }
                                    break;
                            }
                            return xfaVar2;
                        }
                    }), 3);
                }
                if (d05Var.f34803h) {
                    vu4.m23545g(vu4Var9, null, new C0282a(-13140028, true, new b05(vi3Var7, gf5Var2, d05Var, zContains ? 1 : 0)), 3);
                }
                if (d05Var.f34801f) {
                    vu4.m23545g(vu4Var9, null, new C0282a(2046782469, true, new b05(d05Var, vi3Var7, gf5Var2, i7)), 3);
                }
                final int i15 = 5;
                vu4.m23545g(vu4Var9, null, new C0282a(-66648406, true, new aj3() { // from class: ao1
                    @Override // p000.aj3
                    public final Object invoke(Object obj6, Object obj7, Object obj8) {
                        int i16 = i15;
                        xfa xfaVar2 = xfa.f68157a;
                        p84 p84Var = we1.f66679a;
                        b16 b16Var = b16.f7762a;
                        vi3 vi3Var8 = vi3Var7;
                        switch (i16) {
                            case 0:
                                ye1 ye1Var = (ye1) obj7;
                                int iIntValue = ((Integer) obj8).intValue();
                                ((ft4) obj6).getClass();
                                tj3 tj3Var = (tj3) ye1Var;
                                if (!tj3Var.m22099R(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    tj3Var.m22102U();
                                } else {
                                    boolean zM22120g = tj3Var.m22120g(vi3Var8);
                                    Object objM22097O = tj3Var.m22097O();
                                    if (zM22120g || objM22097O == p84Var) {
                                        objM22097O = new f91(vi3Var8, 9);
                                        tj3Var.m22131l0(objM22097O);
                                    }
                                    of5.m17959a(wob.f67143h, AbstractC0080f.m815b(null, false, (ui3) objM22097O, b16Var, 15), wob.f67144i, gf5Var2, tj3Var, 24582, 428);
                                }
                                break;
                            case 1:
                                ye1 ye1Var2 = (ye1) obj7;
                                int iIntValue2 = ((Integer) obj8).intValue();
                                ((ft4) obj6).getClass();
                                tj3 tj3Var2 = (tj3) ye1Var2;
                                if (!tj3Var2.m22099R(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                    tj3Var2.m22102U();
                                } else {
                                    boolean zM22120g2 = tj3Var2.m22120g(vi3Var8);
                                    Object objM22097O2 = tj3Var2.m22097O();
                                    if (zM22120g2 || objM22097O2 == p84Var) {
                                        objM22097O2 = new f91(vi3Var8, 12);
                                        tj3Var2.m22131l0(objM22097O2);
                                    }
                                    of5.m17959a(wob.f67136a, AbstractC0080f.m815b(null, false, (ui3) objM22097O2, b16Var, 15), wob.f67137b, gf5Var2, tj3Var2, 24582, 428);
                                }
                                break;
                            case 2:
                                ye1 ye1Var3 = (ye1) obj7;
                                int iIntValue3 = ((Integer) obj8).intValue();
                                ((ft4) obj6).getClass();
                                tj3 tj3Var3 = (tj3) ye1Var3;
                                if (!tj3Var3.m22099R(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                    tj3Var3.m22102U();
                                } else {
                                    boolean zM22120g3 = tj3Var3.m22120g(vi3Var8);
                                    Object objM22097O3 = tj3Var3.m22097O();
                                    if (zM22120g3 || objM22097O3 == p84Var) {
                                        objM22097O3 = new f91(vi3Var8, 13);
                                        tj3Var3.m22131l0(objM22097O3);
                                    }
                                    of5.m17959a(wob.f67138c, AbstractC0080f.m815b(null, false, (ui3) objM22097O3, b16Var, 15), wob.f67139d, gf5Var2, tj3Var3, 24582, 428);
                                }
                                break;
                            case 3:
                                ye1 ye1Var4 = (ye1) obj7;
                                int iIntValue4 = ((Integer) obj8).intValue();
                                ((ft4) obj6).getClass();
                                tj3 tj3Var4 = (tj3) ye1Var4;
                                if (!tj3Var4.m22099R(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                                    tj3Var4.m22102U();
                                } else {
                                    boolean zM22120g4 = tj3Var4.m22120g(vi3Var8);
                                    Object objM22097O4 = tj3Var4.m22097O();
                                    if (zM22120g4 || objM22097O4 == p84Var) {
                                        objM22097O4 = new f91(vi3Var8, 11);
                                        tj3Var4.m22131l0(objM22097O4);
                                    }
                                    of5.m17959a(wob.f67141f, AbstractC0080f.m815b(null, false, (ui3) objM22097O4, b16Var, 15), wob.f67142g, gf5Var2, tj3Var4, 24582, 428);
                                }
                                break;
                            case 4:
                                ye1 ye1Var5 = (ye1) obj7;
                                int iIntValue5 = ((Integer) obj8).intValue();
                                ((ft4) obj6).getClass();
                                tj3 tj3Var5 = (tj3) ye1Var5;
                                if (!tj3Var5.m22099R(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                                    tj3Var5.m22102U();
                                } else {
                                    boolean zM22120g5 = tj3Var5.m22120g(vi3Var8);
                                    Object objM22097O5 = tj3Var5.m22097O();
                                    if (zM22120g5 || objM22097O5 == p84Var) {
                                        objM22097O5 = new fl4(vi3Var8, 22);
                                        tj3Var5.m22131l0(objM22097O5);
                                    }
                                    of5.m17959a(jtb.f46141e, AbstractC0080f.m815b(null, false, (ui3) objM22097O5, b16Var, 15), jtb.f46142f, gf5Var2, tj3Var5, 24582, 428);
                                }
                                break;
                            case 5:
                                ye1 ye1Var6 = (ye1) obj7;
                                int iIntValue6 = ((Integer) obj8).intValue();
                                ((ft4) obj6).getClass();
                                tj3 tj3Var6 = (tj3) ye1Var6;
                                if (!tj3Var6.m22099R(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                                    tj3Var6.m22102U();
                                } else {
                                    boolean zM22120g6 = tj3Var6.m22120g(vi3Var8);
                                    Object objM22097O6 = tj3Var6.m22097O();
                                    if (zM22120g6 || objM22097O6 == p84Var) {
                                        objM22097O6 = new fl4(vi3Var8, 20);
                                        tj3Var6.m22131l0(objM22097O6);
                                    }
                                    of5.m17959a(jtb.f46144h, AbstractC0080f.m815b(null, false, (ui3) objM22097O6, b16Var, 15), jtb.f46145i, gf5Var2, tj3Var6, 24582, 428);
                                }
                                break;
                            case 6:
                                ye1 ye1Var7 = (ye1) obj7;
                                int iIntValue7 = ((Integer) obj8).intValue();
                                ((ft4) obj6).getClass();
                                tj3 tj3Var7 = (tj3) ye1Var7;
                                if (!tj3Var7.m22099R(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                                    tj3Var7.m22102U();
                                } else {
                                    boolean zM22120g7 = tj3Var7.m22120g(vi3Var8);
                                    Object objM22097O7 = tj3Var7.m22097O();
                                    if (zM22120g7 || objM22097O7 == p84Var) {
                                        objM22097O7 = new fl4(vi3Var8, 18);
                                        tj3Var7.m22131l0(objM22097O7);
                                    }
                                    of5.m17959a(jtb.f46146j, AbstractC0080f.m815b(null, false, (ui3) objM22097O7, b16Var, 15), jtb.f46147k, gf5Var2, tj3Var7, 24582, 428);
                                }
                                break;
                            case 7:
                                ye1 ye1Var8 = (ye1) obj7;
                                int iIntValue8 = ((Integer) obj8).intValue();
                                ((ft4) obj6).getClass();
                                tj3 tj3Var8 = (tj3) ye1Var8;
                                if (!tj3Var8.m22099R(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                                    tj3Var8.m22102U();
                                } else {
                                    boolean zM22120g8 = tj3Var8.m22120g(vi3Var8);
                                    Object objM22097O8 = tj3Var8.m22097O();
                                    if (zM22120g8 || objM22097O8 == p84Var) {
                                        objM22097O8 = new fl4(vi3Var8, 17);
                                        tj3Var8.m22131l0(objM22097O8);
                                    }
                                    of5.m17959a(jtb.f46137a, AbstractC0080f.m815b(null, false, (ui3) objM22097O8, b16Var, 15), jtb.f46138b, gf5Var2, tj3Var8, 24582, 428);
                                }
                                break;
                            default:
                                ye1 ye1Var9 = (ye1) obj7;
                                int iIntValue9 = ((Integer) obj8).intValue();
                                ((ft4) obj6).getClass();
                                tj3 tj3Var9 = (tj3) ye1Var9;
                                if (!tj3Var9.m22099R(iIntValue9 & 1, (iIntValue9 & 17) != 16)) {
                                    tj3Var9.m22102U();
                                } else {
                                    boolean zM22120g9 = tj3Var9.m22120g(vi3Var8);
                                    Object objM22097O9 = tj3Var9.m22097O();
                                    if (zM22120g9 || objM22097O9 == p84Var) {
                                        objM22097O9 = new fl4(vi3Var8, 15);
                                        tj3Var9.m22131l0(objM22097O9);
                                    }
                                    of5.m17959a(jtb.f46139c, AbstractC0080f.m815b(null, false, (ui3) objM22097O9, b16Var, 15), jtb.f46140d, gf5Var2, tj3Var9, 24582, 428);
                                }
                                break;
                        }
                        return xfaVar2;
                    }
                }), 3);
                if (d05Var.f34799d) {
                    vu4.m23545g(vu4Var9, null, new C0282a(-188262330, true, new aj3() { // from class: ao1
                        @Override // p000.aj3
                        public final Object invoke(Object obj6, Object obj7, Object obj8) {
                            int i16 = i3;
                            xfa xfaVar2 = xfa.f68157a;
                            p84 p84Var = we1.f66679a;
                            b16 b16Var = b16.f7762a;
                            vi3 vi3Var8 = vi3Var7;
                            switch (i16) {
                                case 0:
                                    ye1 ye1Var = (ye1) obj7;
                                    int iIntValue = ((Integer) obj8).intValue();
                                    ((ft4) obj6).getClass();
                                    tj3 tj3Var = (tj3) ye1Var;
                                    if (!tj3Var.m22099R(iIntValue & 1, (iIntValue & 17) != 16)) {
                                        tj3Var.m22102U();
                                    } else {
                                        boolean zM22120g = tj3Var.m22120g(vi3Var8);
                                        Object objM22097O = tj3Var.m22097O();
                                        if (zM22120g || objM22097O == p84Var) {
                                            objM22097O = new f91(vi3Var8, 9);
                                            tj3Var.m22131l0(objM22097O);
                                        }
                                        of5.m17959a(wob.f67143h, AbstractC0080f.m815b(null, false, (ui3) objM22097O, b16Var, 15), wob.f67144i, gf5Var2, tj3Var, 24582, 428);
                                    }
                                    break;
                                case 1:
                                    ye1 ye1Var2 = (ye1) obj7;
                                    int iIntValue2 = ((Integer) obj8).intValue();
                                    ((ft4) obj6).getClass();
                                    tj3 tj3Var2 = (tj3) ye1Var2;
                                    if (!tj3Var2.m22099R(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                        tj3Var2.m22102U();
                                    } else {
                                        boolean zM22120g2 = tj3Var2.m22120g(vi3Var8);
                                        Object objM22097O2 = tj3Var2.m22097O();
                                        if (zM22120g2 || objM22097O2 == p84Var) {
                                            objM22097O2 = new f91(vi3Var8, 12);
                                            tj3Var2.m22131l0(objM22097O2);
                                        }
                                        of5.m17959a(wob.f67136a, AbstractC0080f.m815b(null, false, (ui3) objM22097O2, b16Var, 15), wob.f67137b, gf5Var2, tj3Var2, 24582, 428);
                                    }
                                    break;
                                case 2:
                                    ye1 ye1Var3 = (ye1) obj7;
                                    int iIntValue3 = ((Integer) obj8).intValue();
                                    ((ft4) obj6).getClass();
                                    tj3 tj3Var3 = (tj3) ye1Var3;
                                    if (!tj3Var3.m22099R(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                        tj3Var3.m22102U();
                                    } else {
                                        boolean zM22120g3 = tj3Var3.m22120g(vi3Var8);
                                        Object objM22097O3 = tj3Var3.m22097O();
                                        if (zM22120g3 || objM22097O3 == p84Var) {
                                            objM22097O3 = new f91(vi3Var8, 13);
                                            tj3Var3.m22131l0(objM22097O3);
                                        }
                                        of5.m17959a(wob.f67138c, AbstractC0080f.m815b(null, false, (ui3) objM22097O3, b16Var, 15), wob.f67139d, gf5Var2, tj3Var3, 24582, 428);
                                    }
                                    break;
                                case 3:
                                    ye1 ye1Var4 = (ye1) obj7;
                                    int iIntValue4 = ((Integer) obj8).intValue();
                                    ((ft4) obj6).getClass();
                                    tj3 tj3Var4 = (tj3) ye1Var4;
                                    if (!tj3Var4.m22099R(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                                        tj3Var4.m22102U();
                                    } else {
                                        boolean zM22120g4 = tj3Var4.m22120g(vi3Var8);
                                        Object objM22097O4 = tj3Var4.m22097O();
                                        if (zM22120g4 || objM22097O4 == p84Var) {
                                            objM22097O4 = new f91(vi3Var8, 11);
                                            tj3Var4.m22131l0(objM22097O4);
                                        }
                                        of5.m17959a(wob.f67141f, AbstractC0080f.m815b(null, false, (ui3) objM22097O4, b16Var, 15), wob.f67142g, gf5Var2, tj3Var4, 24582, 428);
                                    }
                                    break;
                                case 4:
                                    ye1 ye1Var5 = (ye1) obj7;
                                    int iIntValue5 = ((Integer) obj8).intValue();
                                    ((ft4) obj6).getClass();
                                    tj3 tj3Var5 = (tj3) ye1Var5;
                                    if (!tj3Var5.m22099R(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                                        tj3Var5.m22102U();
                                    } else {
                                        boolean zM22120g5 = tj3Var5.m22120g(vi3Var8);
                                        Object objM22097O5 = tj3Var5.m22097O();
                                        if (zM22120g5 || objM22097O5 == p84Var) {
                                            objM22097O5 = new fl4(vi3Var8, 22);
                                            tj3Var5.m22131l0(objM22097O5);
                                        }
                                        of5.m17959a(jtb.f46141e, AbstractC0080f.m815b(null, false, (ui3) objM22097O5, b16Var, 15), jtb.f46142f, gf5Var2, tj3Var5, 24582, 428);
                                    }
                                    break;
                                case 5:
                                    ye1 ye1Var6 = (ye1) obj7;
                                    int iIntValue6 = ((Integer) obj8).intValue();
                                    ((ft4) obj6).getClass();
                                    tj3 tj3Var6 = (tj3) ye1Var6;
                                    if (!tj3Var6.m22099R(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                                        tj3Var6.m22102U();
                                    } else {
                                        boolean zM22120g6 = tj3Var6.m22120g(vi3Var8);
                                        Object objM22097O6 = tj3Var6.m22097O();
                                        if (zM22120g6 || objM22097O6 == p84Var) {
                                            objM22097O6 = new fl4(vi3Var8, 20);
                                            tj3Var6.m22131l0(objM22097O6);
                                        }
                                        of5.m17959a(jtb.f46144h, AbstractC0080f.m815b(null, false, (ui3) objM22097O6, b16Var, 15), jtb.f46145i, gf5Var2, tj3Var6, 24582, 428);
                                    }
                                    break;
                                case 6:
                                    ye1 ye1Var7 = (ye1) obj7;
                                    int iIntValue7 = ((Integer) obj8).intValue();
                                    ((ft4) obj6).getClass();
                                    tj3 tj3Var7 = (tj3) ye1Var7;
                                    if (!tj3Var7.m22099R(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                                        tj3Var7.m22102U();
                                    } else {
                                        boolean zM22120g7 = tj3Var7.m22120g(vi3Var8);
                                        Object objM22097O7 = tj3Var7.m22097O();
                                        if (zM22120g7 || objM22097O7 == p84Var) {
                                            objM22097O7 = new fl4(vi3Var8, 18);
                                            tj3Var7.m22131l0(objM22097O7);
                                        }
                                        of5.m17959a(jtb.f46146j, AbstractC0080f.m815b(null, false, (ui3) objM22097O7, b16Var, 15), jtb.f46147k, gf5Var2, tj3Var7, 24582, 428);
                                    }
                                    break;
                                case 7:
                                    ye1 ye1Var8 = (ye1) obj7;
                                    int iIntValue8 = ((Integer) obj8).intValue();
                                    ((ft4) obj6).getClass();
                                    tj3 tj3Var8 = (tj3) ye1Var8;
                                    if (!tj3Var8.m22099R(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                                        tj3Var8.m22102U();
                                    } else {
                                        boolean zM22120g8 = tj3Var8.m22120g(vi3Var8);
                                        Object objM22097O8 = tj3Var8.m22097O();
                                        if (zM22120g8 || objM22097O8 == p84Var) {
                                            objM22097O8 = new fl4(vi3Var8, 17);
                                            tj3Var8.m22131l0(objM22097O8);
                                        }
                                        of5.m17959a(jtb.f46137a, AbstractC0080f.m815b(null, false, (ui3) objM22097O8, b16Var, 15), jtb.f46138b, gf5Var2, tj3Var8, 24582, 428);
                                    }
                                    break;
                                default:
                                    ye1 ye1Var9 = (ye1) obj7;
                                    int iIntValue9 = ((Integer) obj8).intValue();
                                    ((ft4) obj6).getClass();
                                    tj3 tj3Var9 = (tj3) ye1Var9;
                                    if (!tj3Var9.m22099R(iIntValue9 & 1, (iIntValue9 & 17) != 16)) {
                                        tj3Var9.m22102U();
                                    } else {
                                        boolean zM22120g9 = tj3Var9.m22120g(vi3Var8);
                                        Object objM22097O9 = tj3Var9.m22097O();
                                        if (zM22120g9 || objM22097O9 == p84Var) {
                                            objM22097O9 = new fl4(vi3Var8, 15);
                                            tj3Var9.m22131l0(objM22097O9);
                                        }
                                        of5.m17959a(jtb.f46139c, AbstractC0080f.m815b(null, false, (ui3) objM22097O9, b16Var, 15), jtb.f46140d, gf5Var2, tj3Var9, 24582, 428);
                                    }
                                    break;
                            }
                            return xfaVar2;
                        }
                    }), 3);
                }
                return xfaVar;
            case 15:
                C3633u2 c3633u2 = (C3633u2) obj5;
                fe9 fe9Var = (fe9) obj3;
                vu4 vu4Var10 = (vu4) obj;
                vu4Var10.getClass();
                vu4.m23545g(vu4Var10, null, j2c.f44984d, 3);
                List list10 = c3633u2.f63259a;
                vu4Var10.m23547h(list10.size(), null, new C3520r2(24, list10), new C0282a(802480018, true, new nh4(list10, c3633u2, (String) obj4, (vi3) obj2, fe9Var)));
                return xfaVar;
            case 16:
                String str6 = (String) obj3;
                String str7 = (String) obj5;
                ArrayList arrayList2 = (ArrayList) obj2;
                bk8 bk8Var2 = (bk8) obj;
                bk8Var2.getClass();
                ik8 ik8VarMo2873e1 = bk8Var2.mo2873e0((String) obj4);
                try {
                    ik8VarMo2873e1.mo2874C(1, str6);
                    ik8VarMo2873e1.mo2874C(2, str7);
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        ik8VarMo2873e1.mo2878j(i6, ((Number) it.next()).intValue());
                        i6++;
                    }
                    int iM14108v = AbstractC3122is.m14108v(ik8VarMo2873e1, "nameWithLanguage");
                    int iM14108v2 = AbstractC3122is.m14108v(ik8VarMo2873e1, "language");
                    int iM14108v3 = AbstractC3122is.m14108v(ik8VarMo2873e1, "contentId");
                    int iM14108v4 = AbstractC3122is.m14108v(ik8VarMo2873e1, "order");
                    int iM14108v5 = AbstractC3122is.m14108v(ik8VarMo2873e1, "isCourse");
                    ArrayList arrayList3 = new ArrayList();
                    while (ik8VarMo2873e1.mo2876a0()) {
                        arrayList3.add(new bd7((int) ik8VarMo2873e1.getLong(iM14108v3), ik8VarMo2873e1.isNull(iM14108v4) ? null : Integer.valueOf((int) ik8VarMo2873e1.getLong(iM14108v4)), ik8VarMo2873e1.mo2875L(iM14108v), ik8VarMo2873e1.mo2875L(iM14108v2), ((int) ik8VarMo2873e1.getLong(iM14108v5)) != 0));
                        break;
                    }
                    return arrayList3;
                } finally {
                    ik8VarMo2873e1.close();
                }
            case 17:
                vi3 vi3Var8 = (vi3) obj2;
                pq8 pq8Var = (pq8) obj5;
                vi3 vi3Var9 = (vi3) obj4;
                t66 t66Var6 = (t66) obj3;
                CourseContextMenuItem courseContextMenuItem = (CourseContextMenuItem) obj;
                courseContextMenuItem.getClass();
                switch (kp8.f48296a[courseContextMenuItem.ordinal()]) {
                    case 1:
                        vi3Var8.invoke(new qs8(pq8Var));
                        break;
                    case 2:
                        vi3Var8.invoke(new ms8(pq8Var));
                        break;
                    case 3:
                    case 6:
                        break;
                    case 4:
                        vi3Var8.invoke(new us8(pq8Var));
                        break;
                    case 5:
                        vi3Var9.invoke(new ir8(pq8Var));
                        break;
                    case 7:
                        vi3Var9.invoke(new fr8(pq8Var));
                        break;
                    default:
                        gm5.m12750e();
                        return null;
                }
                t66Var6.setValue(Boolean.FALSE);
                return xfaVar;
            case 18:
                t66 t66Var7 = (t66) obj5;
                vi3 vi3Var10 = (vi3) obj2;
                hp5 hp5Var = (hp5) obj4;
                vi3 vi3Var11 = (vi3) obj3;
                AuthorizationResult authorizationResult = (AuthorizationResult) obj;
                PendingIntent pendingIntent = authorizationResult.f11567f;
                if (pendingIntent != null) {
                    if (((Lifecycle$State) t66Var7.getValue()).isAtLeast(Lifecycle$State.RESUMED)) {
                        try {
                            IntentSender intentSender = pendingIntent.getIntentSender();
                            intentSender.getClass();
                            hp5Var.mo276a(new IntentSenderRequest(intentSender, null, 0, 0));
                        } catch (IllegalStateException e) {
                            r43.m20289a().m20290b(e);
                            vi3Var10.invoke("Google sign-in failed: Please try again");
                        }
                    } else {
                        vi3Var10.invoke("Google sign-in failed: Activity not available");
                    }
                    break;
                } else {
                    String str8 = authorizationResult.f11562a;
                    if (str8 != null) {
                        vi3Var11.invoke(str8);
                    } else {
                        vi3Var10.invoke("Google sign-in failed: No auth code received");
                    }
                }
                return xfaVar;
            case 19:
                f5a f5aVar = (f5a) obj5;
                vi3 vi3Var12 = (vi3) obj2;
                InterfaceC0300b interfaceC0300b = (InterfaceC0300b) obj4;
                t66 t66Var8 = (t66) obj3;
                ((fj4) obj).getClass();
                if (!vk9.m23391n0(((vv9) t66Var8.getValue()).f65990a.f54604b)) {
                    String str9 = ((vv9) t66Var8.getValue()).f65990a.f54604b;
                    String str10 = (String) u91.m22591I0(f5aVar.f38470b);
                    String str11 = str10 == null ? "en" : str10;
                    String str12 = (String) u91.m22591I0(f5aVar.f38470b);
                    vi3Var12.invoke(new d2a(new TokenMeaning(0, str11, str9, 0, false, str12 == null ? "en" : str12, true, 0, 136)));
                    t66Var8.setValue(new vv9("", 6, 0L));
                    InterfaceC0300b.m1355a(interfaceC0300b);
                }
                return xfaVar;
            case 20:
                e28 e28Var = (e28) obj5;
                dh9 dh9Var3 = (dh9) obj3;
                InterfaceC0310a interfaceC0310a = (InterfaceC0310a) obj;
                interfaceC0310a.getClass();
                long jM10803d = e28Var.m10803d();
                float fFloatValue = ((Number) dh9Var3.getValue()).floatValue() * (e28Var.f36622c - e28Var.f36620a);
                float fFloatValue2 = ((Number) dh9Var3.getValue()).floatValue() * (e28Var.f36623d - e28Var.f36621b);
                InterfaceC0310a.m1412G(interfaceC0310a, (i39) obj4, (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (jM10803d >> 32)) - (fFloatValue / 2.0f))) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (jM10803d & 4294967295L)) - (fFloatValue2 / 2.0f))) & 4294967295L), (((long) Float.floatToRawIntBits(fFloatValue)) << 32) | (((long) Float.floatToRawIntBits(fFloatValue2)) & 4294967295L), (((long) Float.floatToRawIntBits(16.0f)) << 32) | (((long) Float.floatToRawIntBits(16.0f)) & 4294967295L), ((Number) ((dh9) obj2).getValue()).floatValue(), new el9(6.0f, 0.0f, 0, 0, 30), null, 192);
                return xfaVar;
            case 21:
                ui3 ui3Var2 = (ui3) obj4;
                c7a c7aVar = (c7a) obj3;
                ui3 ui3Var3 = (ui3) obj2;
                if (((e28) obj5).m10800a(((gq6) obj).f41189a)) {
                    ui3Var2.mo0a();
                } else if (c7aVar.f9667d) {
                    ui3Var3.mo0a();
                }
                return xfaVar;
            case 22:
                vu4 vu4Var11 = (vu4) obj;
                vu4Var11.getClass();
                List list11 = ((yza) obj5).f70717a;
                vu4Var11.m23547h(list11.size(), null, new xf8(12, list11), new C0282a(802480018, true, new C3558s2(list11, (vi3) obj2, (vi3) obj4, (Context) obj3, 5)));
                return xfaVar;
            default:
                ub5 ub5Var2 = (ub5) obj5;
                final vbb vbbVar = (vbb) obj4;
                final C1821b c1821b = (C1821b) obj3;
                t66 t66Var9 = (t66) obj2;
                ((ai2) obj).getClass();
                ?? r0 = new rb5() { // from class: com.lingq.core.player.video.c
                    @Override // p000.rb5
                    /* JADX INFO: renamed from: c */
                    public final void mo399c(ub5 ub5Var3, Lifecycle$Event lifecycle$Event) {
                        int i16 = tbb.f62119a[lifecycle$Event.ordinal()];
                        C1821b c1821b2 = c1821b;
                        if (i16 != 1) {
                            if (i16 != 2) {
                                return;
                            }
                            vbbVar.f65173b = true;
                            c1821b2.m8496a();
                            return;
                        }
                        c1821b2.getClass();
                        c1821b2.f22193a = YoutubePlaybackRateRestoration$State.RESTORE_ON_PLAYBACK;
                        c1821b2.f22194b = false;
                        c1821b2.f22195c = null;
                        c1821b2.f22196d = 0;
                    }
                };
                ub5Var2.mo256K().mo21323g(r0);
                YouTubePlayerView youTubePlayerView = vbbVar.f65172a;
                if (youTubePlayerView != null) {
                    ub5Var2.mo256K().mo21323g(youTubePlayerView);
                }
                return new ubb(ub5Var2, r0, c1821b, vbbVar, t66Var9);
        }
    }

    public /* synthetic */ C3445p2(Object obj, vi3 vi3Var, Object obj2, Object obj3, int i) {
        this.f55466a = i;
        this.f55467b = obj;
        this.f55468c = vi3Var;
        this.f55469d = obj2;
        this.f55470e = obj3;
    }

    public /* synthetic */ C3445p2(Object obj, Object obj2, vi3 vi3Var, Object obj3, int i) {
        this.f55466a = i;
        this.f55467b = obj;
        this.f55469d = obj2;
        this.f55468c = vi3Var;
        this.f55470e = obj3;
    }

    public /* synthetic */ C3445p2(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.f55466a = i;
        this.f55467b = obj;
        this.f55469d = obj2;
        this.f55470e = obj3;
        this.f55468c = obj4;
    }

    public /* synthetic */ C3445p2(String str, String str2, String str3, Object obj, int i) {
        this.f55466a = i;
        this.f55469d = str;
        this.f55470e = str2;
        this.f55467b = str3;
        this.f55468c = obj;
    }

    public /* synthetic */ C3445p2(vi3 vi3Var, Object obj, vi3 vi3Var2, t66 t66Var, int i) {
        this.f55466a = i;
        this.f55468c = vi3Var;
        this.f55467b = obj;
        this.f55469d = vi3Var2;
        this.f55470e = t66Var;
    }
}
