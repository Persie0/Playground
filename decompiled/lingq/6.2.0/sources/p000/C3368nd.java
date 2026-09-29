package p000;

import androidx.compose.material3.C0269z;
import androidx.compose.material3.SheetValue;
import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.node.C0352b;
import androidx.compose.runtime.internal.C0282a;
import androidx.datastore.preferences.protobuf.DescriptorProtos;
import androidx.lifecycle.compose.AbstractC0711a;
import com.lingq.core.analytics.data.LqAnalyticsValues$LessonPath;
import com.lingq.core.domain.model.chat.ChatStats;
import com.lingq.core.domain.model.language.Language;
import com.lingq.core.domain.model.library.LibraryItem;
import com.lingq.core.domain.model.milestones.DailyGoalMet;
import com.lingq.core.p012ui.R$string;
import com.lingq.core.premium.upgrade.AiVoiceSampleState;
import com.lingq.feature.challenges.C1986f;
import com.lingq.feature.challenges.ChallengesFragment;
import com.lingq.feature.challenges.cup.AbstractC1976c;
import com.lingq.feature.challenges.cup.C1978e;
import com.lingq.feature.challenges.cup.CupBadgesFragment;
import com.lingq.feature.challenges.cup.CupContributorsFragment;
import com.lingq.feature.challenges.cup.CupDailyPrizeFragment;
import com.lingq.feature.challenges.cup.CupFragment;
import com.lingq.feature.challenges.cup.CupTeamLeaderboardFragment;
import com.lingq.feature.chat.AbstractC2005i;
import com.lingq.feature.chat.AbstractC2008l;
import com.lingq.feature.chat.ChatFragment;
import com.lingq.feature.collections.AbstractC2030a;
import com.lingq.feature.collections.CollectionFragment;
import com.lingq.feature.onboarding.auth.login.magiclink.AbstractC2185b;
import com.lingq.feature.onboarding.auth.login.magiclink.EmailLoginFragment;
import com.lingq.feature.playlist.AbstractC2253c;
import com.lingq.feature.playlist.C2251a;
import com.lingq.feature.playlist.CollectionPlaylistFragment;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.Pair;
import kotlin.jvm.internal.FunctionReference;
import kotlinx.coroutines.flow.C3244l;
import p000.C3577sk;
import p000.C3741x;
import p000.bh4;
import p000.et0;
import p000.p84;
import p000.t66;
import p000.tj3;
import p000.ui3;
import p000.v9d;
import p000.vi3;
import p000.vv1;
import p000.we1;
import p000.xfa;
import p000.ye1;

/* JADX INFO: renamed from: nd */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C3368nd implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f52613a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f52614b;

    public /* synthetic */ C3368nd(Object obj, int i) {
        this.f52613a = i;
        this.f52614b = obj;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        SheetValue sheetValue;
        int i = this.f52613a;
        b16 b16Var = b16.f7762a;
        p84 p84Var = we1.f66679a;
        xfa xfaVar = xfa.f68157a;
        Object obj3 = this.f52614b;
        switch (i) {
            case 0:
                AiVoiceSampleState aiVoiceSampleState = (AiVoiceSampleState) obj3;
                ye1 ye1Var = (ye1) obj;
                int iIntValue = ((Integer) obj2).intValue();
                tj3 tj3Var = (tj3) ye1Var;
                if (tj3Var.m22099R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    e16 e16VarM21607T = AbstractC3584sr.m21607T(b16Var, ((fe9) tj3Var.m22128k(ge9.f40637a)).f38952a);
                    ht5 ht5VarM19966d = qh0.m19966d(nj0.f52812g, false);
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
                    oha.m18001g(tj3Var, C0352b.f4303f, ht5VarM19966d);
                    oha.m18001g(tj3Var, C0352b.f4302e, l77VarM22132m);
                    oha.m18001g(tj3Var, C0352b.f4304g, Integer.valueOf(iHashCode));
                    oha.m18000f(tj3Var, C0352b.f4305h);
                    oha.m18001g(tj3Var, C0352b.f4301d, e16VarM1322c);
                    int i2 = AbstractC3570sd.f60702a[aiVoiceSampleState.ordinal()];
                    if (i2 == 1) {
                        tj3Var.m22111b0(-532384668);
                        dn7.m10492a(c99.m4422o(b16Var, 20.0f), ((bx2) tj3Var.m22128k(cx2.f34676a)).m4217j(), 2.0f, 0L, 0, 0.0f, tj3Var, 390, 56);
                        tj3Var.m22139q(false);
                    } else if (i2 == 2) {
                        tj3Var.m22111b0(-532375274);
                        p04 p04VarM17721b = q4d.f57274a;
                        if (p04VarM17721b == null) {
                            o04 o04Var = new o04("Rounded.Stop", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                            int i3 = soa.f61116a;
                            pd9 pd9Var = new pd9(aa1.f403b);
                            f57 f57Var = new f57();
                            f57Var.m11553h(8.0f, 6.0f);
                            f57Var.m11550e(8.0f);
                            f57Var.m11548c(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f);
                            f57Var.m11557l(8.0f);
                            f57Var.m11548c(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f);
                            f57Var.m11549d(8.0f);
                            f57Var.m11548c(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
                            f57Var.m11556k(8.0f);
                            f57Var.m11548c(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
                            f57Var.m11546a();
                            o04.m17720a(o04Var, f57Var.f38440a, pd9Var);
                            p04VarM17721b = o04Var.m17721b();
                            q4d.f57274a = p04VarM17721b;
                        }
                        ty3.m22351a(p04VarM17721b, null, null, ((bx2) tj3Var.m22128k(cx2.f34676a)).m4217j(), tj3Var, 48, 4);
                        tj3Var.m22139q(false);
                    } else {
                        if (i2 != 3) {
                            throw ux5.m23001x(tj3Var, -532386223, false);
                        }
                        tj3Var.m22111b0(-532366405);
                        ty3.m22351a(z1c.m25402a(), null, null, ((bx2) tj3Var.m22128k(cx2.f34676a)).m4217j(), tj3Var, 48, 4);
                        tj3Var.m22139q(false);
                    }
                    tj3Var.m22139q(true);
                } else {
                    tj3Var.m22102U();
                }
                return xfaVar;
            case 1:
                Language language = (Language) obj3;
                ye1 ye1Var2 = (ye1) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                tj3 tj3Var2 = (tj3) ye1Var2;
                if (tj3Var2.m22099R(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    String str = language.f19029f;
                    if (vk9.m23391n0(str)) {
                        str = language.f19024a;
                    }
                    lw9.m16554b(str, null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var2, 0, 0, 262142);
                } else {
                    tj3Var2.m22102U();
                }
                return xfaVar;
            case 2:
                C0269z c0269z = (C0269z) obj3;
                n84 n84Var = (n84) obj;
                float fM3800h = bk1.m3800h(((bk1) obj2).f8631a);
                bl2 bl2Var = new bl2(0);
                bl2Var.m3857n(SheetValue.Hidden, fM3800h);
                float f = fM3800h / 2.0f;
                if (((int) (n84Var.f52482a & 4294967295L)) > f && !c0269z.f3647a) {
                    bl2Var.m3857n(SheetValue.PartiallyExpanded, f);
                }
                int i4 = (int) (n84Var.f52482a & 4294967295L);
                if (i4 != 0) {
                    bl2Var.m3857n(SheetValue.Expanded, Math.max(0.0f, fM3800h - i4));
                }
                ArrayList arrayList = (ArrayList) bl2Var.f8655a;
                float[] fArr = (float[]) bl2Var.f8656b;
                int size = arrayList.size();
                fArr.getClass();
                AbstractC3184kh.m15215i(size, fArr.length);
                float[] fArrCopyOfRange = Arrays.copyOfRange(fArr, 0, size);
                fArrCopyOfRange.getClass();
                a62 a62Var = new a62(arrayList, fArrCopyOfRange);
                int i5 = ch0.f10061a[((SheetValue) c0269z.f3650d.getValue()).ordinal()];
                if (i5 == 1) {
                    sheetValue = SheetValue.Hidden;
                } else if (i5 == 2) {
                    sheetValue = SheetValue.PartiallyExpanded;
                    if (!a62Var.m130c(sheetValue)) {
                        sheetValue = SheetValue.Expanded;
                        if (!a62Var.m130c(sheetValue)) {
                            sheetValue = SheetValue.Hidden;
                        }
                    }
                } else {
                    if (i5 != 3) {
                        gm5.m12750e();
                        return null;
                    }
                    sheetValue = SheetValue.Expanded;
                    if (!a62Var.m130c(sheetValue)) {
                        sheetValue = SheetValue.Hidden;
                    }
                }
                return new Pair(a62Var, sheetValue);
            case 3:
                final ChallengesFragment challengesFragment = (ChallengesFragment) obj3;
                ye1 ye1Var3 = (ye1) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                bh4[] bh4VarArr = ChallengesFragment.f24437G0;
                tj3 tj3Var3 = (tj3) ye1Var3;
                if (tj3Var3.m22099R(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    fy9.m12246a(false, null, ci8.m4703P(1178200422, new zi3() { // from class: com.lingq.feature.challenges.d
                        @Override // p000.zi3
                        public final Object invoke(Object obj4, Object obj5) {
                            ye1 ye1Var4 = (ye1) obj4;
                            int iIntValue4 = ((Integer) obj5).intValue();
                            bh4[] bh4VarArr2 = ChallengesFragment.f24437G0;
                            final int i6 = 1;
                            final int i7 = 0;
                            final int i8 = 2;
                            tj3 tj3Var4 = (tj3) ye1Var4;
                            if (tj3Var4.m22099R(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                                final ChallengesFragment challengesFragment2 = challengesFragment;
                                t66 t66VarM2513c = AbstractC0711a.m2513c(((C1986f) challengesFragment2.f24439D0.getValue()).f24772m, tj3Var4);
                                t66 t66VarM2513c2 = AbstractC0711a.m2513c(challengesFragment2.m8807R0().f24697h, tj3Var4);
                                et0 et0Var = (et0) t66VarM2513c.getValue();
                                boolean zM22124i = tj3Var4.m22124i(challengesFragment2);
                                Object objM22097O = tj3Var4.m22097O();
                                p84 p84Var2 = we1.f66679a;
                                if (zM22124i || objM22097O == p84Var2) {
                                    objM22097O = new C3741x(challengesFragment2, 8);
                                    tj3Var4.m22131l0(objM22097O);
                                }
                                vi3 vi3Var = (vi3) objM22097O;
                                boolean zM22124i2 = tj3Var4.m22124i(challengesFragment2);
                                Object objM22097O2 = tj3Var4.m22097O();
                                if (zM22124i2 || objM22097O2 == p84Var2) {
                                    objM22097O2 = new C1961a(i6, challengesFragment2);
                                    tj3Var4.m22131l0(objM22097O2);
                                }
                                vi3 vi3Var2 = (vi3) objM22097O2;
                                boolean zM22124i3 = tj3Var4.m22124i(challengesFragment2);
                                Object objM22097O3 = tj3Var4.m22097O();
                                if (zM22124i3 || objM22097O3 == p84Var2) {
                                    objM22097O3 = new ui3() { // from class: ss0
                                        @Override // p000.ui3
                                        /* JADX INFO: renamed from: a */
                                        public final Object mo0a() {
                                            Object value;
                                            int i9 = i7;
                                            xfa xfaVar2 = xfa.f68157a;
                                            ChallengesFragment challengesFragment3 = challengesFragment2;
                                            switch (i9) {
                                                case 0:
                                                    bh4[] bh4VarArr3 = ChallengesFragment.f24437G0;
                                                    ((C1986f) challengesFragment3.f24439D0.getValue()).m8853V2(true);
                                                    break;
                                                case 1:
                                                    bh4[] bh4VarArr4 = ChallengesFragment.f24437G0;
                                                    C3244l c3244l = ((C1986f) challengesFragment3.f24439D0.getValue()).f24768i;
                                                    do {
                                                        value = c3244l.getValue();
                                                        ((Boolean) value).getClass();
                                                    } while (!c3244l.m15570h(value, Boolean.FALSE));
                                                    break;
                                                case 2:
                                                    bh4[] bh4VarArr5 = ChallengesFragment.f24437G0;
                                                    challengesFragment3.m8807R0().m8841V2(uu1.f64360a);
                                                    break;
                                                default:
                                                    bh4[] bh4VarArr6 = ChallengesFragment.f24437G0;
                                                    b34.m3244j(challengesFragment3).m22689f();
                                                    break;
                                            }
                                            return xfaVar2;
                                        }
                                    };
                                    tj3Var4.m22131l0(objM22097O3);
                                }
                                ui3 ui3Var2 = (ui3) objM22097O3;
                                boolean zM22124i4 = tj3Var4.m22124i(challengesFragment2);
                                Object objM22097O4 = tj3Var4.m22097O();
                                if (zM22124i4 || objM22097O4 == p84Var2) {
                                    objM22097O4 = new ui3() { // from class: ss0
                                        @Override // p000.ui3
                                        /* JADX INFO: renamed from: a */
                                        public final Object mo0a() {
                                            Object value;
                                            int i9 = i6;
                                            xfa xfaVar2 = xfa.f68157a;
                                            ChallengesFragment challengesFragment3 = challengesFragment2;
                                            switch (i9) {
                                                case 0:
                                                    bh4[] bh4VarArr3 = ChallengesFragment.f24437G0;
                                                    ((C1986f) challengesFragment3.f24439D0.getValue()).m8853V2(true);
                                                    break;
                                                case 1:
                                                    bh4[] bh4VarArr4 = ChallengesFragment.f24437G0;
                                                    C3244l c3244l = ((C1986f) challengesFragment3.f24439D0.getValue()).f24768i;
                                                    do {
                                                        value = c3244l.getValue();
                                                        ((Boolean) value).getClass();
                                                    } while (!c3244l.m15570h(value, Boolean.FALSE));
                                                    break;
                                                case 2:
                                                    bh4[] bh4VarArr5 = ChallengesFragment.f24437G0;
                                                    challengesFragment3.m8807R0().m8841V2(uu1.f64360a);
                                                    break;
                                                default:
                                                    bh4[] bh4VarArr6 = ChallengesFragment.f24437G0;
                                                    b34.m3244j(challengesFragment3).m22689f();
                                                    break;
                                            }
                                            return xfaVar2;
                                        }
                                    };
                                    tj3Var4.m22131l0(objM22097O4);
                                }
                                ui3 ui3Var3 = (ui3) objM22097O4;
                                boolean zM22120g = tj3Var4.m22120g(t66VarM2513c) | tj3Var4.m22124i(challengesFragment2);
                                Object objM22097O5 = tj3Var4.m22097O();
                                if (zM22120g || objM22097O5 == p84Var2) {
                                    objM22097O5 = new C3577sk(6, challengesFragment2, t66VarM2513c);
                                    tj3Var4.m22131l0(objM22097O5);
                                }
                                ui3 ui3Var4 = (ui3) objM22097O5;
                                boolean zM22124i5 = tj3Var4.m22124i(challengesFragment2);
                                Object objM22097O6 = tj3Var4.m22097O();
                                if (zM22124i5 || objM22097O6 == p84Var2) {
                                    objM22097O6 = new ui3() { // from class: ss0
                                        @Override // p000.ui3
                                        /* JADX INFO: renamed from: a */
                                        public final Object mo0a() {
                                            Object value;
                                            int i9 = i8;
                                            xfa xfaVar2 = xfa.f68157a;
                                            ChallengesFragment challengesFragment3 = challengesFragment2;
                                            switch (i9) {
                                                case 0:
                                                    bh4[] bh4VarArr3 = ChallengesFragment.f24437G0;
                                                    ((C1986f) challengesFragment3.f24439D0.getValue()).m8853V2(true);
                                                    break;
                                                case 1:
                                                    bh4[] bh4VarArr4 = ChallengesFragment.f24437G0;
                                                    C3244l c3244l = ((C1986f) challengesFragment3.f24439D0.getValue()).f24768i;
                                                    do {
                                                        value = c3244l.getValue();
                                                        ((Boolean) value).getClass();
                                                    } while (!c3244l.m15570h(value, Boolean.FALSE));
                                                    break;
                                                case 2:
                                                    bh4[] bh4VarArr5 = ChallengesFragment.f24437G0;
                                                    challengesFragment3.m8807R0().m8841V2(uu1.f64360a);
                                                    break;
                                                default:
                                                    bh4[] bh4VarArr6 = ChallengesFragment.f24437G0;
                                                    b34.m3244j(challengesFragment3).m22689f();
                                                    break;
                                            }
                                            return xfaVar2;
                                        }
                                    };
                                    tj3Var4.m22131l0(objM22097O6);
                                }
                                ui3 ui3Var5 = (ui3) objM22097O6;
                                boolean zM22124i6 = tj3Var4.m22124i(challengesFragment2);
                                Object objM22097O7 = tj3Var4.m22097O();
                                if (zM22124i6 || objM22097O7 == p84Var2) {
                                    final int i9 = 3;
                                    objM22097O7 = new ui3() { // from class: ss0
                                        @Override // p000.ui3
                                        /* JADX INFO: renamed from: a */
                                        public final Object mo0a() {
                                            Object value;
                                            int i10 = i9;
                                            xfa xfaVar2 = xfa.f68157a;
                                            ChallengesFragment challengesFragment3 = challengesFragment2;
                                            switch (i10) {
                                                case 0:
                                                    bh4[] bh4VarArr3 = ChallengesFragment.f24437G0;
                                                    ((C1986f) challengesFragment3.f24439D0.getValue()).m8853V2(true);
                                                    break;
                                                case 1:
                                                    bh4[] bh4VarArr4 = ChallengesFragment.f24437G0;
                                                    C3244l c3244l = ((C1986f) challengesFragment3.f24439D0.getValue()).f24768i;
                                                    do {
                                                        value = c3244l.getValue();
                                                        ((Boolean) value).getClass();
                                                    } while (!c3244l.m15570h(value, Boolean.FALSE));
                                                    break;
                                                case 2:
                                                    bh4[] bh4VarArr5 = ChallengesFragment.f24437G0;
                                                    challengesFragment3.m8807R0().m8841V2(uu1.f64360a);
                                                    break;
                                                default:
                                                    bh4[] bh4VarArr6 = ChallengesFragment.f24437G0;
                                                    b34.m3244j(challengesFragment3).m22689f();
                                                    break;
                                            }
                                            return xfaVar2;
                                        }
                                    };
                                    tj3Var4.m22131l0(objM22097O7);
                                }
                                AbstractC1985e.m8849a(et0Var, vi3Var, vi3Var2, ui3Var2, ui3Var3, ui3Var4, ui3Var5, (ui3) objM22097O7, tj3Var4, 0);
                                vv1 vv1Var = (vv1) t66VarM2513c2.getValue();
                                if (vv1Var == null) {
                                    tj3Var4.m22111b0(1298900235);
                                    tj3Var4.m22139q(false);
                                } else {
                                    tj3Var4.m22111b0(1298900236);
                                    C1978e c1978eM8807R0 = challengesFragment2.m8807R0();
                                    boolean zM22124i7 = tj3Var4.m22124i(c1978eM8807R0);
                                    Object objM22097O8 = tj3Var4.m22097O();
                                    if (zM22124i7 || objM22097O8 == p84Var2) {
                                        ChallengesFragment$onViewCreated$2$1$1$1$8$1$1 challengesFragment$onViewCreated$2$1$1$1$8$1$1 = new ChallengesFragment$onViewCreated$2$1$1$1$8$1$1(1, c1978eM8807R0, C1978e.class, "handleAction", "handleAction(Lcom/lingq/feature/challenges/cup/data/CupScreenAction;)V", 0);
                                        tj3Var4.m22131l0(challengesFragment$onViewCreated$2$1$1$1$8$1$1);
                                        objM22097O8 = challengesFragment$onViewCreated$2$1$1$1$8$1$1;
                                    }
                                    v9d.m23199a(vv1Var, (vi3) ((FunctionReference) objM22097O8), tj3Var4, 0);
                                    tj3Var4.m22139q(false);
                                }
                            } else {
                                tj3Var4.m22102U();
                            }
                            return xfa.f68157a;
                        }
                    }, tj3Var3), tj3Var3, 384);
                } else {
                    tj3Var3.m22102U();
                }
                return xfaVar;
            case 4:
                ChatFragment chatFragment = (ChatFragment) obj3;
                ye1 ye1Var4 = (ye1) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                tj3 tj3Var4 = (tj3) ye1Var4;
                if (tj3Var4.m22099R(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    ud6 ud6VarM3244j = b34.m3244j(chatFragment);
                    w41 w41Var = chatFragment.f24774B0;
                    if (w41Var == null) {
                        fa4.m11636J("navGraphController");
                        throw null;
                    }
                    r32 r32Var = chatFragment.f24775C0;
                    if (r32Var == null) {
                        fa4.m11636J("deepLinkController");
                        throw null;
                    }
                    AbstractC2005i.m8904e(null, null, null, null, ud6VarM3244j, w41Var, r32Var, tj3Var4, 0);
                } else {
                    tj3Var4.m22102U();
                }
                return xfaVar;
            case 5:
                ((Integer) obj2).getClass();
                AbstractC2005i.m8902c((t17) obj3, (ye1) obj, pk9.m19383z(1));
                return xfaVar;
            case 6:
                ((Integer) obj2).getClass();
                AbstractC2008l.m8913d((ChatStats) obj3, (ye1) obj, pk9.m19383z(1));
                return xfaVar;
            case 7:
                hw0 hw0Var = (hw0) obj3;
                ye1 ye1Var5 = (ye1) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                tj3 tj3Var5 = (tj3) ye1Var5;
                if (tj3Var5.m22099R(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    lw9.m16554b(hw0Var.f43029b, null, 0L, null, 0L, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, null, tj3Var5, 0, 24960, 241662);
                } else {
                    tj3Var5.m22102U();
                }
                return xfaVar;
            case 8:
                ((Integer) obj2).getClass();
                v7d.m23159a((d71) obj3, (ye1) obj, pk9.m19383z(1));
                return xfaVar;
            case 9:
                CollectionFragment collectionFragment = (CollectionFragment) obj3;
                ye1 ye1Var6 = (ye1) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                tj3 tj3Var6 = (tj3) ye1Var6;
                if (tj3Var6.m22099R(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    LqAnalyticsValues$LessonPath lqAnalyticsValues$LessonPath = ((b71) collectionFragment.f25328B0.getValue()).f8037b;
                    ud6 ud6VarM3244j2 = b34.m3244j(collectionFragment);
                    w41 w41Var2 = collectionFragment.f25329C0;
                    if (w41Var2 == null) {
                        fa4.m11636J("navGraphController");
                        throw null;
                    }
                    bia biaVar = collectionFragment.f25330D0;
                    if (biaVar == null) {
                        fa4.m11636J("upgradePopupDelegate");
                        throw null;
                    }
                    AbstractC2030a.m8935b(lqAnalyticsValues$LessonPath, ud6VarM3244j2, w41Var2, biaVar, null, tj3Var6, 0);
                } else {
                    tj3Var6.m22102U();
                }
                return xfaVar;
            case 10:
                LibraryItem libraryItem = (LibraryItem) obj3;
                ye1 ye1Var7 = (ye1) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                tj3 tj3Var7 = (tj3) ye1Var7;
                if (tj3Var7.m22099R(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    zf1 zf1Var = ge9.f40637a;
                    lw9.m16554b(vz1.m23618Z(R$string.ui_points, new Object[]{Integer.valueOf(libraryItem.f19423X)}, tj3Var7), AbstractC3584sr.m21608U(b16Var, ((fe9) tj3Var7.m22128k(zf1Var)).f38955d, ((fe9) tj3Var7.m22128k(zf1Var)).f38954c), 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ms5) tj3Var7.m22128k(ps5.f56764b)).f51800b.f71411o, tj3Var7, 0, 0, 131068);
                } else {
                    tj3Var7.m22102U();
                }
                return xfaVar;
            case 11:
                CollectionPlaylistFragment collectionPlaylistFragment = (CollectionPlaylistFragment) obj3;
                ye1 ye1Var8 = (ye1) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                tj3 tj3Var8 = (tj3) ye1Var8;
                if (tj3Var8.m22099R(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    C2251a c2251a = (C2251a) collectionPlaylistFragment.f27526C0.getValue();
                    boolean zM22124i = tj3Var8.m22124i(collectionPlaylistFragment);
                    Object objM22097O = tj3Var8.m22097O();
                    if (zM22124i || objM22097O == p84Var) {
                        objM22097O = new C3741x(collectionPlaylistFragment, 9);
                        tj3Var8.m22131l0(objM22097O);
                    }
                    AbstractC2253c.m9217c(c2251a, (vi3) objM22097O, tj3Var8, 0);
                } else {
                    tj3Var8.m22102U();
                }
                return xfaVar;
            case 12:
                q91 q91Var = (q91) obj3;
                ye1 ye1Var9 = (ye1) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                tj3 tj3Var9 = (tj3) ye1Var9;
                if (tj3Var9.m22099R(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    tj3Var9.m22111b0(-786972574);
                    String strM23620a0 = q91Var.f57439a;
                    if (strM23620a0.length() == 0) {
                        strM23620a0 = vz1.m23620a0(tj3Var9, com.lingq.feature.collections.R$string.course_overview);
                    }
                    tj3Var9.m22139q(false);
                    lw9.m16554b(strM23620a0, null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var9, 0, 0, 262142);
                } else {
                    tj3Var9.m22102U();
                }
                return xfaVar;
            case 13:
                p91 p91Var = (p91) obj3;
                ye1 ye1Var10 = (ye1) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                tj3 tj3Var10 = (tj3) ye1Var10;
                if (tj3Var10.m22099R(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    zf1 zf1Var2 = ge9.f40637a;
                    ((fe9) tj3Var10.m22128k(zf1Var2)).getClass();
                    e16 e16VarM21608U = AbstractC3584sr.m21608U(c99.m4416i(b16Var, 48.0f, 0.0f, 2), ((fe9) tj3Var10.m22128k(zf1Var2)).f38952a, ((fe9) tj3Var10.m22128k(zf1Var2)).f38955d);
                    sj8 sj8VarM20003a = qj8.m20003a(new C3661uu(((fe9) tj3Var10.m22128k(zf1Var2)).f38955d, true, new gm5(28)), nj0.f52789H, tj3Var10, 48);
                    int iHashCode2 = Long.hashCode(tj3Var10.f62385T);
                    l77 l77VarM22132m2 = tj3Var10.m22132m();
                    e16 e16VarM1322c2 = AbstractC0287b.m1322c(tj3Var10, e16VarM21608U);
                    se1.f60731q.getClass();
                    ui3 ui3Var2 = C0352b.f4299b;
                    tj3Var10.m22119f0();
                    if (tj3Var10.f62384S) {
                        tj3Var10.m22130l(ui3Var2);
                    } else {
                        tj3Var10.m22137o0();
                    }
                    oha.m18001g(tj3Var10, C0352b.f4303f, sj8VarM20003a);
                    oha.m18001g(tj3Var10, C0352b.f4302e, l77VarM22132m2);
                    oha.m18001g(tj3Var10, C0352b.f4304g, Integer.valueOf(iHashCode2));
                    oha.m18000f(tj3Var10, C0352b.f4305h);
                    oha.m18001g(tj3Var10, C0352b.f4301d, e16VarM1322c2);
                    lw9.m16554b(vz1.m23620a0(tj3Var10, AbstractC3423or.m18255g0(p91Var.f55799a)), null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ms5) tj3Var10.m22128k(ps5.f56764b)).f51800b.f71407k, tj3Var10, 0, 0, 131070);
                    ty3.m22351a(pvc.m19521q(), null, null, 0L, tj3Var10, 48, 12);
                    tj3Var10.m22139q(true);
                } else {
                    tj3Var10.m22102U();
                }
                return xfaVar;
            case 14:
                CupBadgesFragment cupBadgesFragment = (CupBadgesFragment) obj3;
                ye1 ye1Var11 = (ye1) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                tj3 tj3Var11 = (tj3) ye1Var11;
                if (tj3Var11.m22099R(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    boolean zM22124i2 = tj3Var11.m22124i(cupBadgesFragment);
                    Object objM22097O2 = tj3Var11.m22097O();
                    if (zM22124i2 || objM22097O2 == p84Var) {
                        objM22097O2 = new C3741x(cupBadgesFragment, 11);
                        tj3Var11.m22131l0(objM22097O2);
                    }
                    us1.m22895h(null, (vi3) objM22097O2, tj3Var11, 0);
                } else {
                    tj3Var11.m22102U();
                }
                return xfaVar;
            case 15:
                ((Integer) obj2).getClass();
                us1.m22891d((qs1) obj3, (ye1) obj, pk9.m19383z(1));
                return xfaVar;
            case 16:
                ((Integer) obj2).getClass();
                us1.m22894g((vs1) obj3, (ye1) obj, pk9.m19383z(1));
                return xfaVar;
            case 17:
                CupContributorsFragment cupContributorsFragment = (CupContributorsFragment) obj3;
                ye1 ye1Var12 = (ye1) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                tj3 tj3Var12 = (tj3) ye1Var12;
                if (tj3Var12.m22099R(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    boolean zM22124i3 = tj3Var12.m22124i(cupContributorsFragment);
                    Object objM22097O3 = tj3Var12.m22097O();
                    if (zM22124i3 || objM22097O3 == p84Var) {
                        objM22097O3 = new C3741x(cupContributorsFragment, 12);
                        tj3Var12.m22131l0(objM22097O3);
                    }
                    u9d.m22639c(null, (vi3) objM22097O3, tj3Var12, 0);
                } else {
                    tj3Var12.m22102U();
                }
                return xfaVar;
            case 18:
                CupDailyPrizeFragment cupDailyPrizeFragment = (CupDailyPrizeFragment) obj3;
                ye1 ye1Var13 = (ye1) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                tj3 tj3Var13 = (tj3) ye1Var13;
                if (tj3Var13.m22099R(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    boolean zM22124i4 = tj3Var13.m22124i(cupDailyPrizeFragment);
                    Object objM22097O4 = tj3Var13.m22097O();
                    if (zM22124i4 || objM22097O4 == p84Var) {
                        objM22097O4 = new C3741x(cupDailyPrizeFragment, 14);
                        tj3Var13.m22131l0(objM22097O4);
                    }
                    AbstractC1976c.m8820c(null, (vi3) objM22097O4, tj3Var13, 0);
                } else {
                    tj3Var13.m22102U();
                }
                return xfaVar;
            case 19:
                ((Integer) obj2).getClass();
                AbstractC1976c.m8831n((fz1) obj3, (ye1) obj, pk9.m19383z(1));
                return xfaVar;
            case 20:
                ((Integer) obj2).getClass();
                AbstractC1976c.m8829l((ju1) obj3, (ye1) obj, pk9.m19383z(1));
                return xfaVar;
            case 21:
                CupFragment cupFragment = (CupFragment) obj3;
                ye1 ye1Var14 = (ye1) obj;
                int iIntValue14 = ((Integer) obj2).intValue();
                tj3 tj3Var14 = (tj3) ye1Var14;
                if (tj3Var14.m22099R(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    boolean zM22124i5 = tj3Var14.m22124i(cupFragment);
                    Object objM22097O5 = tj3Var14.m22097O();
                    if (zM22124i5 || objM22097O5 == p84Var) {
                        objM22097O5 = new C3741x(cupFragment, 16);
                        tj3Var14.m22131l0(objM22097O5);
                    }
                    AbstractC1976c.m8824g(null, (vi3) objM22097O5, tj3Var14, 0);
                } else {
                    tj3Var14.m22102U();
                }
                return xfaVar;
            case 22:
                wv1 wv1Var = (wv1) obj3;
                ye1 ye1Var15 = (ye1) obj;
                int iIntValue15 = ((Integer) obj2).intValue();
                tj3 tj3Var15 = (tj3) ye1Var15;
                if (tj3Var15.m22099R(iIntValue15 & 1, (iIntValue15 & 3) != 2)) {
                    String str2 = wv1Var.f67329a;
                    ((fe9) tj3Var15.m22128k(ge9.f40637a)).getClass();
                    r9d.m20481c(0, tj3Var15, c99.m4422o(b16Var, 24.0f), str2);
                } else {
                    tj3Var15.m22102U();
                }
                return xfaVar;
            case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                CupTeamLeaderboardFragment cupTeamLeaderboardFragment = (CupTeamLeaderboardFragment) obj3;
                ye1 ye1Var16 = (ye1) obj;
                int iIntValue16 = ((Integer) obj2).intValue();
                tj3 tj3Var16 = (tj3) ye1Var16;
                if (tj3Var16.m22099R(iIntValue16 & 1, (iIntValue16 & 3) != 2)) {
                    boolean zM22124i6 = tj3Var16.m22124i(cupTeamLeaderboardFragment);
                    Object objM22097O6 = tj3Var16.m22097O();
                    if (zM22124i6 || objM22097O6 == p84Var) {
                        objM22097O6 = new C3741x(cupTeamLeaderboardFragment, 17);
                        tj3Var16.m22131l0(objM22097O6);
                    }
                    AbstractC1976c.m8826i(null, (vi3) objM22097O6, tj3Var16, 0);
                } else {
                    tj3Var16.m22102U();
                }
                return xfaVar;
            case 24:
                ty1 ty1Var = (ty1) obj3;
                ye1 ye1Var17 = (ye1) obj;
                int iIntValue17 = ((Integer) obj2).intValue();
                tj3 tj3Var17 = (tj3) ye1Var17;
                if (tj3Var17.m22099R(iIntValue17 & 1, (iIntValue17 & 3) != 2)) {
                    e16 e16VarM4422o = c99.m4422o(b16Var, 48.0f);
                    DailyGoalMet dailyGoalMet = ty1Var.f63087a;
                    m1d.m16596a(e16VarM4422o, dailyGoalMet.f19515b, dailyGoalMet.f19516c, dailyGoalMet.f19517d, true, false, tj3Var17, 24582, 32);
                } else {
                    tj3Var17.m22102U();
                }
                return xfaVar;
            case 25:
                C3329mb c3329mb = (C3329mb) obj3;
                ye1 ye1Var18 = (ye1) obj;
                int iIntValue18 = ((Integer) obj2).intValue();
                tj3 tj3Var18 = (tj3) ye1Var18;
                if (tj3Var18.m22099R(iIntValue18 & 1, (iIntValue18 & 3) != 2)) {
                    String strM11661w = fa4.m11661w(tj3Var18, androidx.compose.material3.R$string.m3c_dialog);
                    e16 e16Var = (e16) c3329mb.f50861c;
                    x17 x17Var = AbstractC3369ne.f52629a;
                    e16 e16VarM4425r = c99.m4425r(e16Var, 280.0f, 0.0f, 560.0f, 10);
                    boolean zM22120g = tj3Var18.m22120g(strM11661w);
                    Object objM22097O7 = tj3Var18.m22097O();
                    if (zM22120g || objM22097O7 == p84Var) {
                        objM22097O7 = new t70(strM11661w, 19);
                        tj3Var18.m22131l0(objM22097O7);
                    }
                    e16 e16VarMo3161g = e16VarM4425r.mo3161g(nv8.m17643c(b16Var, false, (vi3) objM22097O7));
                    ht5 ht5VarM19966d2 = qh0.m19966d(nj0.f52808c, true);
                    int iHashCode3 = Long.hashCode(tj3Var18.f62385T);
                    l77 l77VarM22132m3 = tj3Var18.m22132m();
                    e16 e16VarM1322c3 = AbstractC0287b.m1322c(tj3Var18, e16VarMo3161g);
                    se1.f60731q.getClass();
                    ui3 ui3Var3 = C0352b.f4299b;
                    tj3Var18.m22119f0();
                    if (tj3Var18.f62384S) {
                        tj3Var18.m22130l(ui3Var3);
                    } else {
                        tj3Var18.m22137o0();
                    }
                    oha.m18001g(tj3Var18, C0352b.f4303f, ht5VarM19966d2);
                    oha.m18001g(tj3Var18, C0352b.f4302e, l77VarM22132m3);
                    oha.m18001g(tj3Var18, C0352b.f4304g, Integer.valueOf(iHashCode3));
                    oha.m18000f(tj3Var18, C0352b.f4305h);
                    oha.m18001g(tj3Var18, C0352b.f4301d, e16VarM1322c3);
                    wq1.m24128x(0, (C0282a) c3329mb.f50863e, tj3Var18, true);
                } else {
                    tj3Var18.m22102U();
                }
                return xfaVar;
            case 26:
                ((Integer) obj2).getClass();
                tj3 tj3Var19 = (tj3) ((ye1) obj);
                tj3Var19.m22111b0(666084174);
                String str3 = ((jt9) obj3).f46133b;
                tj3Var19.m22139q(false);
                return str3;
            case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                cd4 cd4Var = (cd4) obj2;
                if (cd4Var == ((un1) obj3).mo1309x().get(nj0.f52795N)) {
                    return null;
                }
                return cd4Var;
            case 28:
                EmailLoginFragment emailLoginFragment = (EmailLoginFragment) obj3;
                ye1 ye1Var19 = (ye1) obj;
                int iIntValue19 = ((Integer) obj2).intValue();
                tj3 tj3Var20 = (tj3) ye1Var19;
                if (tj3Var20.m22099R(iIntValue19 & 1, (iIntValue19 & 3) != 2)) {
                    boolean zM22124i7 = tj3Var20.m22124i(emailLoginFragment);
                    Object objM22097O8 = tj3Var20.m22097O();
                    if (zM22124i7 || objM22097O8 == p84Var) {
                        objM22097O8 = new C3741x(emailLoginFragment, 18);
                        tj3Var20.m22131l0(objM22097O8);
                    }
                    AbstractC2185b.m9115a(null, (vi3) objM22097O8, tj3Var20, 0);
                } else {
                    tj3Var20.m22102U();
                }
                return xfaVar;
            default:
                ((Integer) obj2).getClass();
                xcd.m24458a((zz2) obj3, (ye1) obj, pk9.m19383z(1));
                return xfaVar;
        }
    }

    public /* synthetic */ C3368nd(Object obj, int i, int i2) {
        this.f52613a = i2;
        this.f52614b = obj;
    }
}
