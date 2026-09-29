package p000;

import android.content.Context;
import androidx.compose.p002ui.platform.AbstractC0394f;
import com.lingq.feature.onboarding.R$drawable;
import com.lingq.feature.onboarding.R$string;
import com.lingq.feature.onboarding.p014v2.OnboardingPage;
import com.lingq.feature.onboarding.p014v2.OnboardingSelections;
import com.lingq.feature.onboarding.p014v2.OnboardingYesNoQuestion;
import com.lingq.feature.onboarding.p014v2.PendingMiniLessonLingq;
import com.lingq.feature.onboarding.p014v2.domain.MiniLessonTemplate;
import com.lingq.feature.onboarding.p014v2.pages.p023long.AbstractC2231b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.AbstractC3194a;

/* JADX INFO: loaded from: classes3.dex */
public abstract class yh7 {

    /* JADX INFO: renamed from: a */
    public static final Map f69851a = AbstractC3194a.m15365R(new Pair(OnboardingPage.BEGINNER_FIRST_TIME, new oab(R$string.onboarding_v2_beginner_first_time_title, OnboardingYesNoQuestion.FirstTime, 0, 0, 252)), new Pair(OnboardingPage.BEGINNER_KNOW_A_FEW_WORDS, new oab(R$string.onboarding_v2_beginner_know_a_few_words_title, OnboardingYesNoQuestion.KnowAFewWords, 0, 0, 252)), new Pair(OnboardingPage.BEGINNER_TRIED_READING_LISTENING, new oab(R$string.onboarding_v2_beginner_tried_reading_listening_title, OnboardingYesNoQuestion.TriedReadingListening, 0, 0, 248)), new Pair(OnboardingPage.INTERMEDIATE_SIMPLE_CONVERSATIONS, new oab(R$string.onboarding_v2_intermediate_simple_conversations_title, OnboardingYesNoQuestion.UnderstandSimpleConversations, 0, 0, 252)), new Pair(OnboardingPage.INTERMEDIATE_FAMILIAR_TOPICS, new oab(R$string.onboarding_v2_intermediate_familiar_topics_title, OnboardingYesNoQuestion.ConversationsFamiliarTopics, 0, 0, 248)), new Pair(OnboardingPage.INTERMEDIATE_ARTICLES_MAIN_IDEA, new oab(R$string.onboarding_v2_intermediate_articles_main_idea_title, OnboardingYesNoQuestion.UnderstandArticlesMainIdea, 0, 0, 252)), new Pair(OnboardingPage.ADVANCED_FOLLOW_NATIVE, new oab(R$string.onboarding_v2_advanced_follow_native_title, OnboardingYesNoQuestion.FollowNativeSpeakers, 0, 0, 252)), new Pair(OnboardingPage.ADVANCED_SHOWS_SLANG, new oab(R$string.onboarding_v2_advanced_shows_slang_title, OnboardingYesNoQuestion.ShowsSlangAccentsChallenge, R$string.onboarding_v2_advanced_shows_slang_comfortable, R$string.onboarding_v2_advanced_shows_slang_challenging, 4)), new Pair(OnboardingPage.ADVANCED_COMPLEX_ARTICLES, new oab(R$string.onboarding_v2_advanced_complex_articles_title, OnboardingYesNoQuestion.UnderstandComplexArticles, 0, 0, 252)));

    /* JADX WARN: Code duplicated, block: B:100:0x0286  */
    /* JADX WARN: Code duplicated, block: B:102:0x029d  */
    /* JADX WARN: Code duplicated, block: B:163:0x03e5  */
    /* JADX WARN: Code duplicated, block: B:164:0x03f3  */
    /* JADX WARN: Code duplicated, block: B:175:0x0416  */
    /* JADX WARN: Code duplicated, block: B:178:0x042c  */
    /* JADX WARN: Code duplicated, block: B:179:0x043e  */
    /* JADX WARN: Code duplicated, block: B:190:0x0460  */
    /* JADX WARN: Code duplicated, block: B:192:0x047b  */
    /* JADX WARN: Code duplicated, block: B:205:0x049d  */
    /* JADX WARN: Code duplicated, block: B:207:0x04b4  */
    /* JADX WARN: Code duplicated, block: B:211:0x04cc  */
    /* JADX WARN: Code duplicated, block: B:212:0x04dd  */
    /* JADX WARN: Code duplicated, block: B:223:0x050f  */
    /* JADX WARN: Code duplicated, block: B:226:0x0524  */
    /* JADX WARN: Code duplicated, block: B:227:0x0526  */
    /* JADX WARN: Code duplicated, block: B:228:0x0536  */
    /* JADX WARN: Code duplicated, block: B:229:0x0546  */
    /* JADX WARN: Code duplicated, block: B:230:0x0556  */
    /* JADX WARN: Code duplicated, block: B:233:0x0569  */
    /* JADX WARN: Code duplicated, block: B:235:0x057d  */
    /* JADX WARN: Code duplicated, block: B:236:0x0584  */
    /* JADX WARN: Code duplicated, block: B:246:0x059b  */
    /* JADX WARN: Code duplicated, block: B:249:0x05ba  */
    /* JADX WARN: Code duplicated, block: B:251:0x05e8  */
    /* JADX WARN: Code duplicated, block: B:252:0x05f4  */
    /* JADX WARN: Code duplicated, block: B:254:0x0604  */
    /* JADX WARN: Code duplicated, block: B:255:0x060b  */
    /* JADX WARN: Code duplicated, block: B:265:0x0622  */
    /* JADX WARN: Code duplicated, block: B:270:0x0642  */
    /* JADX WARN: Code duplicated, block: B:271:0x0653  */
    /* JADX WARN: Code duplicated, block: B:273:0x066a  */
    /* JADX WARN: Code duplicated, block: B:274:0x0673  */
    /* JADX WARN: Code duplicated, block: B:285:0x0690  */
    /* JADX WARN: Code duplicated, block: B:289:0x06b4  */
    /* JADX WARN: Code duplicated, block: B:290:0x06c0  */
    /* JADX WARN: Code duplicated, block: B:292:0x06d0  */
    /* JADX WARN: Code duplicated, block: B:293:0x06d7  */
    /* JADX WARN: Code duplicated, block: B:303:0x06ee  */
    /* JADX WARN: Code duplicated, block: B:307:0x0709  */
    /* JADX WARN: Code duplicated, block: B:308:0x0715  */
    /* JADX WARN: Code duplicated, block: B:310:0x072c  */
    /* JADX WARN: Code duplicated, block: B:311:0x0734  */
    /* JADX WARN: Code duplicated, block: B:322:0x0755  */
    /* JADX WARN: Code duplicated, block: B:326:0x077b  */
    /* JADX WARN: Code duplicated, block: B:327:0x0787  */
    /* JADX WARN: Code duplicated, block: B:329:0x07a0  */
    /* JADX WARN: Code duplicated, block: B:330:0x07a8  */
    /* JADX WARN: Code duplicated, block: B:341:0x07c9  */
    /* JADX WARN: Code duplicated, block: B:345:0x07f0  */
    /* JADX WARN: Code duplicated, block: B:346:0x0800  */
    /* JADX WARN: Code duplicated, block: B:348:0x0816  */
    /* JADX WARN: Code duplicated, block: B:351:0x0822  */
    /* JADX WARN: Code duplicated, block: B:352:0x0853  */
    /* JADX WARN: Code duplicated, block: B:356:0x0864  */
    /* JADX WARN: Code duplicated, block: B:358:0x086e  */
    /* JADX WARN: Code duplicated, block: B:361:0x0884  */
    /* JADX WARN: Code duplicated, block: B:372:0x08a8  */
    /* JADX WARN: Code duplicated, block: B:86:0x0250  */
    /* JADX WARN: Code duplicated, block: B:87:0x025b  */
    /* JADX WARN: Code duplicated, block: B:89:0x0269  */
    /* JADX INFO: renamed from: a */
    public static final void m25143a(OnboardingPage onboardingPage, OnboardingSelections onboardingSelections, boolean z, MiniLessonTemplate miniLessonTemplate, vz5 vz5Var, boolean z2, vi3 vi3Var, ye1 ye1Var, int i) {
        int i2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        Object objM22097O;
        ui3 ui3Var;
        boolean z7;
        boolean z8;
        Object objM22097O2;
        boolean z9;
        boolean z10;
        Object objM22097O3;
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z11;
        Object objM22097O4;
        ui3 ui3Var2;
        o44 o44Var;
        int i7;
        boolean z12;
        int i8;
        boolean z13;
        boolean z14;
        Object objM22097O5;
        boolean z15;
        int i9;
        int i10;
        boolean z16;
        Object objM22097O6;
        boolean z17;
        boolean z18;
        boolean z19;
        Object objM22097O7;
        boolean z20;
        int i11;
        boolean z21;
        Object objM22097O8;
        boolean z22;
        int i12;
        boolean z23;
        Object objM22097O9;
        boolean z24;
        int i13;
        String str;
        tj3 tj3Var;
        boolean z25;
        boolean z26;
        boolean z27;
        boolean z28;
        Object objM22097O10;
        boolean z29;
        int i14;
        boolean z30;
        Object objM22097O11;
        boolean z31;
        boolean z32;
        boolean z33;
        boolean z34;
        boolean z35;
        boolean z36;
        Object objM22097O12;
        String strM23620a0;
        boolean z37;
        onboardingPage.getClass();
        onboardingSelections.getClass();
        String str2 = onboardingSelections.f27289a;
        vi3Var.getClass();
        int i15 = i >> 9;
        int i16 = i15 & 7168;
        tj3 tj3Var2 = (tj3) ye1Var;
        tj3Var2.m22111b0(1891395382);
        int i17 = (i15 & 7168) ^ 3072;
        boolean z38 = (i17 > 2048 && tj3Var2.m22120g(vi3Var)) || (i15 & 3072) == 2048;
        Object objM22097O13 = tj3Var2.m22097O();
        p84 p84Var = we1.f66679a;
        if (z38 || objM22097O13 == p84Var) {
            objM22097O13 = new th7(vi3Var, 11);
            tj3Var2.m22131l0(objM22097O13);
        }
        ui3 ui3Var3 = (ui3) objM22097O13;
        vh9 vh9Var = AbstractC0394f.f4761b;
        Context context = (Context) tj3Var2.m22128k(vh9Var);
        boolean zM22120g = tj3Var2.m22120g(context) | tj3Var2.m22120g(str2);
        Object objM22097O14 = tj3Var2.m22097O();
        if (zM22120g || objM22097O14 == p84Var) {
            objM22097O14 = AbstractC3352my.m17093L(context, str2);
            tj3Var2.m22131l0(objM22097O14);
        }
        String str3 = (String) objM22097O14;
        int[] iArr = xh7.f68210a;
        int i18 = iArr[onboardingPage.ordinal()];
        int i19 = 6;
        if (i18 != 1) {
            if (i18 == 2) {
                p84Var = p84Var;
                i2 = 2048;
                tj3Var2.m22111b0(859818505);
                String str4 = onboardingSelections.f27300l;
                boolean z39 = (i17 > 2048 && tj3Var2.m22120g(vi3Var)) || (i15 & 3072) == 2048;
                Object objM22097O15 = tj3Var2.m22097O();
                if (z39 || objM22097O15 == p84Var) {
                    objM22097O15 = new wh7(vi3Var, 2);
                    tj3Var2.m22131l0(objM22097O15);
                }
                pqb.m19458a(str4, (vi3) objM22097O15, z, ui3Var3, null, tj3Var2, 0);
                z31 = false;
                tj3Var2.m22139q(false);
            } else if (i18 == 3) {
                z31 = false;
                p84Var = p84Var;
                i2 = 2048;
                tj3Var2.m22111b0(859826423);
                jsb.m14639a(0, tj3Var2, ui3Var3, null, onboardingSelections.f27300l);
                tj3Var2.m22139q(false);
            } else {
                if (i18 != 4) {
                    if (i18 != 5) {
                        tj3Var2.m22111b0(885546784);
                        tj3Var2.m22139q(false);
                        tj3Var2.m22139q(false);
                        tj3Var2.m22111b0(-1979783885);
                        int i20 = i16 >> 6;
                        tj3Var2.m22111b0(-1338711277);
                        boolean z40 = (((i20 & 112) ^ 48) > 32 && tj3Var2.m22120g(vi3Var)) || (i20 & 48) == 32;
                        Object objM22097O16 = tj3Var2.m22097O();
                        if (z40 || objM22097O16 == p84Var) {
                            objM22097O16 = new th7(vi3Var, 13);
                            tj3Var2.m22131l0(objM22097O16);
                        }
                        ui3 ui3Var4 = (ui3) objM22097O16;
                        int i21 = iArr[onboardingPage.ordinal()];
                        if (i21 == 7) {
                            z32 = false;
                            i2 = 2048;
                            tj3Var2.m22111b0(1988659951);
                            pjd.m19358a(R$string.onboarding_v2_level_intro_beginner_title, R$drawable.im_onboarding_levels_begineer, R$string.onboarding_v2_pre_paywall_long_level_beginner, ui3Var4, null, tj3Var2, 0);
                            tj3Var2.m22139q(false);
                        } else if (i21 != 8) {
                            if (i21 != 9) {
                                tj3Var2.m22111b0(1519881059);
                                tj3Var2.m22139q(false);
                                tj3Var2.m22139q(false);
                                tj3Var2.m22111b0(1935820917);
                                tj3Var2.m22111b0(-1064094667);
                                oab oabVar = (oab) f69851a.get(onboardingPage);
                                if (oabVar == null) {
                                    tj3Var2.m22139q(false);
                                    z37 = false;
                                    z33 = false;
                                    i2 = 2048;
                                } else {
                                    int i22 = oabVar.f54113a;
                                    Context context2 = (Context) tj3Var2.m22128k(vh9Var);
                                    if (oabVar.f54115c) {
                                        tj3Var2.m22111b0(709702544);
                                        strM23620a0 = vz1.m23618Z(i22, new Object[]{AbstractC3352my.m17093L(context2, str2)}, tj3Var2);
                                        tj3Var2.m22139q(false);
                                    } else {
                                        tj3Var2.m22111b0(709799326);
                                        strM23620a0 = vz1.m23620a0(tj3Var2, i22);
                                        tj3Var2.m22139q(false);
                                    }
                                    String str5 = strM23620a0;
                                    OnboardingYesNoQuestion onboardingYesNoQuestion = oabVar.f54114b;
                                    Boolean bool = (Boolean) onboardingSelections.f27303o.get(onboardingYesNoQuestion.getSlug());
                                    boolean z41 = (i17 > 2048 && tj3Var2.m22120g(vi3Var)) || (i15 & 3072) == 2048;
                                    Object objM22097O17 = tj3Var2.m22097O();
                                    if (z41 || objM22097O17 == p84Var) {
                                        objM22097O17 = new ks3(vi3Var, 21);
                                        tj3Var2.m22131l0(objM22097O17);
                                    }
                                    zi3 zi3Var = (zi3) objM22097O17;
                                    boolean z42 = (i17 > 2048 && tj3Var2.m22120g(vi3Var)) || (i15 & 3072) == 2048;
                                    Object objM22097O18 = tj3Var2.m22097O();
                                    if (z42 || objM22097O18 == p84Var) {
                                        objM22097O18 = new th7(vi3Var, 12);
                                        tj3Var2.m22131l0(objM22097O18);
                                    }
                                    i2 = 2048;
                                    gcd.m12481a(str5, onboardingYesNoQuestion, bool, zi3Var, z, (ui3) objM22097O18, null, oabVar.f54116d, oabVar.f54117e, oabVar.f54118f, oabVar.f54119g, oabVar.f54120h, tj3Var2, 0);
                                    tj3Var2 = tj3Var2;
                                    z37 = false;
                                    tj3Var2.m22139q(false);
                                    z33 = true;
                                }
                                tj3Var2.m22139q(z37);
                                z32 = z37;
                            } else {
                                i2 = 2048;
                                tj3Var2.m22111b0(1988681711);
                                z32 = false;
                                pjd.m19358a(R$string.onboarding_v2_level_intro_advanced_title, R$drawable.im_onboarding_levels_advanced, R$string.onboarding_v2_pre_paywall_long_level_advanced, ui3Var4, null, tj3Var2, 0);
                                tj3Var2.m22139q(false);
                            }
                            if (z33) {
                                tj3Var2.m22111b0(-119138614);
                                tj3Var2.m22139q(z32);
                                z35 = true;
                            } else {
                                tj3Var2.m22111b0(-119016463);
                                if (iArr[onboardingPage.ordinal()] == i19) {
                                    tj3Var2.m22111b0(-118963763);
                                    z36 = (i17 <= i2 && tj3Var2.m22120g(vi3Var)) || (i15 & 3072) == i2;
                                    objM22097O12 = tj3Var2.m22097O();
                                    if (z36 || objM22097O12 == p84Var) {
                                        objM22097O12 = new th7(vi3Var, 19);
                                        tj3Var2.m22131l0(objM22097O12);
                                    }
                                    z32 = false;
                                    rjd.m20675a(0, tj3Var2, (ui3) objM22097O12, null);
                                    tj3Var2.m22139q(false);
                                    z34 = true;
                                } else {
                                    z32 = false;
                                    tj3Var2.m22111b0(-118821416);
                                    tj3Var2.m22139q(false);
                                    z34 = false;
                                }
                                tj3Var2.m22139q(z32);
                                z35 = z34;
                            }
                            tj3Var2.m22139q(z32);
                            z5 = z35;
                            z4 = z32;
                            z3 = true;
                        } else {
                            z32 = false;
                            i2 = 2048;
                            tj3Var2.m22111b0(1988670715);
                            pjd.m19358a(R$string.onboarding_v2_level_intro_intermediate_title, R$drawable.im_onboarding_levels_intermediate, R$string.onboarding_v2_pre_paywall_long_level_intermediate, ui3Var4, null, tj3Var2, 0);
                            tj3Var2.m22139q(false);
                        }
                        tj3Var2.m22139q(z32);
                        tj3Var2.m22111b0(-119140877);
                        tj3Var2.m22139q(z32);
                        z33 = true;
                        if (z33) {
                            tj3Var2.m22111b0(-119138614);
                            tj3Var2.m22139q(z32);
                            z35 = true;
                        } else {
                            tj3Var2.m22111b0(-119016463);
                            if (iArr[onboardingPage.ordinal()] == i19) {
                                tj3Var2.m22111b0(-118963763);
                                if (i17 <= i2) {
                                }
                                objM22097O12 = tj3Var2.m22097O();
                                if (z36) {
                                    objM22097O12 = new th7(vi3Var, 19);
                                    tj3Var2.m22131l0(objM22097O12);
                                } else {
                                    objM22097O12 = new th7(vi3Var, 19);
                                    tj3Var2.m22131l0(objM22097O12);
                                }
                                z32 = false;
                                rjd.m20675a(0, tj3Var2, (ui3) objM22097O12, null);
                                tj3Var2.m22139q(false);
                                z34 = true;
                            } else {
                                z32 = false;
                                tj3Var2.m22111b0(-118821416);
                                tj3Var2.m22139q(false);
                                z34 = false;
                            }
                            tj3Var2.m22139q(z32);
                            z35 = z34;
                        }
                        tj3Var2.m22139q(z32);
                        z5 = z35;
                        z4 = z32;
                        z3 = true;
                    } else {
                        p84Var = p84Var;
                        i2 = 2048;
                        tj3Var2.m22111b0(859841123);
                        String str6 = onboardingSelections.f27302n;
                        boolean z43 = (i17 > 2048 && tj3Var2.m22120g(vi3Var)) || (i15 & 3072) == 2048;
                        Object objM22097O19 = tj3Var2.m22097O();
                        if (z43 || objM22097O19 == p84Var) {
                            objM22097O19 = new wh7(vi3Var, 4);
                            tj3Var2.m22131l0(objM22097O19);
                        }
                        h4b.m13047a(0, tj3Var2, ui3Var3, (vi3) objM22097O19, null, str6, str3, z);
                        tj3Var2 = tj3Var2;
                        z31 = false;
                        tj3Var2.m22139q(false);
                    }
                    if (z5) {
                        tj3Var2.m22111b0(-1243819525);
                        tj3Var2.m22139q(z4);
                        z9 = z3;
                        z7 = z4;
                    } else {
                        tj3Var2.m22111b0(-1979781712);
                        tj3Var2.m22111b0(273954932);
                        z6 = ((i17 > i2 || !tj3Var2.m22120g(vi3Var)) && (i15 & 3072) != i2) ? false : z3;
                        objM22097O = tj3Var2.m22097O();
                        if (z6 || objM22097O == p84Var) {
                            objM22097O = new th7(vi3Var, 8);
                            tj3Var2.m22131l0(objM22097O);
                        }
                        ui3Var = (ui3) objM22097O;
                        switch (iArr[onboardingPage.ordinal()]) {
                            case 10:
                                z7 = false;
                                tj3Var2.m22111b0(1277694236);
                                lpb.m16441a(0, tj3Var2, ui3Var, null);
                                tj3Var2.m22139q(false);
                                tj3Var2.m22139q(z7);
                                z9 = z3;
                                break;
                            case 11:
                                tj3Var2.m22111b0(1277696979);
                                String str7 = onboardingSelections.f27304p;
                                z8 = ((i17 > i2 || !tj3Var2.m22120g(vi3Var)) && (i15 & 3072) != i2) ? false : z3;
                                objM22097O2 = tj3Var2.m22097O();
                                if (!z8 || objM22097O2 == p84Var) {
                                    z7 = false;
                                    objM22097O2 = new wh7(vi3Var, 0);
                                    tj3Var2.m22131l0(objM22097O2);
                                } else {
                                    z7 = false;
                                }
                                nz2.m17707a(str7, (vi3) objM22097O2, z, ui3Var, null, tj3Var2, 0);
                                tj3Var2.m22139q(z7);
                                tj3Var2.m22139q(z7);
                                z9 = z3;
                                break;
                            case 12:
                                tj3Var2.m22111b0(1277706321);
                                String str8 = onboardingSelections.f27289a;
                                int i23 = onboardingSelections.f27298j;
                                z10 = ((i17 > i2 || !tj3Var2.m22120g(vi3Var)) && (i15 & 3072) != i2) ? false : z3;
                                objM22097O3 = tj3Var2.m22097O();
                                if (z10 || objM22097O3 == p84Var) {
                                    objM22097O3 = new th7(vi3Var, 9);
                                    tj3Var2.m22131l0(objM22097O3);
                                }
                                tj3 tj3Var3 = tj3Var2;
                                AbstractC2231b.m9188a(i23, 0, tj3Var3, (ui3) objM22097O3, null, str8);
                                tj3Var2 = tj3Var3;
                                tj3Var2.m22139q(false);
                                z7 = false;
                                tj3Var2.m22139q(z7);
                                z9 = z3;
                                break;
                            default:
                                tj3Var2.m22111b0(954419906);
                                tj3Var2.m22139q(false);
                                tj3Var2.m22139q(false);
                                z7 = false;
                                z9 = false;
                                break;
                        }
                        tj3Var2.m22139q(z7);
                    }
                    if (z9) {
                        tj3Var2.m22111b0(-1243817510);
                        tj3Var2.m22139q(z7);
                        z27 = z3;
                        z25 = z27;
                        p84Var = p84Var;
                        tj3Var = tj3Var2;
                        z26 = z7;
                    } else {
                        tj3Var2.m22111b0(-1979779577);
                        i3 = i >> 3;
                        i4 = i3 & 524160;
                        i5 = i4 >> 12;
                        tj3Var2.m22111b0(2143443419);
                        i6 = (i5 & 112) ^ 48;
                        z11 = ((i6 > 32 || !tj3Var2.m22120g(vi3Var)) && (i5 & 48) != 32) ? false : z3;
                        objM22097O4 = tj3Var2.m22097O();
                        if (z11 || objM22097O4 == p84Var) {
                            objM22097O4 = new th7(vi3Var, 16);
                            tj3Var2.m22131l0(objM22097O4);
                        }
                        ui3Var2 = (ui3) objM22097O4;
                        switch (iArr[onboardingPage.ordinal()]) {
                            case 13:
                                o44Var = new o44(R$string.onboarding_v2_section35_1_title, R$string.onboarding_v2_section35_1_subtitle, Integer.valueOf(R$drawable.im_onboarding_method_1));
                                break;
                            case 14:
                                o44Var = new o44(R$string.onboarding_v2_section35_2_title, R$string.onboarding_v2_section35_2_subtitle, Integer.valueOf(R$drawable.im_onboarding_method_2));
                                break;
                            case 15:
                                o44Var = new o44(R$string.onboarding_v2_section35_3_title, R$string.onboarding_v2_section35_3_subtitle, Integer.valueOf(R$drawable.im_onboarding_method_3));
                                break;
                            case 16:
                                o44Var = new o44(R$string.onboarding_v2_section35_4_title, R$string.onboarding_v2_section35_4_subtitle, Integer.valueOf(R$drawable.im_onboarding_method_4));
                                break;
                            default:
                                o44Var = null;
                                break;
                        }
                        if (o44Var == null) {
                            tj3Var2.m22139q(false);
                            tj3Var2.m22111b0(1900546890);
                            tj3Var2.m22111b0(1540914395);
                            if (onboardingPage != OnboardingPage.MINI_LESSON_INTRO) {
                                tj3Var2.m22139q(false);
                                z29 = false;
                                z13 = false;
                            } else {
                                z28 = (i6 <= 32 && tj3Var2.m22120g(vi3Var)) || (i5 & 48) == 32;
                                objM22097O10 = tj3Var2.m22097O();
                                if (z28 || objM22097O10 == p84Var) {
                                    objM22097O10 = new th7(vi3Var, 17);
                                    tj3Var2.m22131l0(objM22097O10);
                                }
                                z29 = false;
                                iz5.m14227c(0, tj3Var2, (ui3) objM22097O10, null);
                                tj3Var2.m22139q(false);
                                z13 = true;
                            }
                            tj3Var2.m22139q(z29);
                            i7 = i6;
                            i8 = 32;
                            z12 = z29;
                        } else {
                            i7 = i6;
                            z12 = false;
                            i8 = 32;
                            q1d.m19600a(o44Var.f53821a, o44Var.f53822b, o44Var.f53823c, ui3Var2, null, tj3Var2, 0);
                            tj3Var2.m22139q(false);
                            tj3Var2.m22111b0(-1212632056);
                            tj3Var2.m22139q(false);
                            z13 = true;
                        }
                        if (z13) {
                            tj3Var2.m22111b0(-1212630568);
                            tj3Var2.m22139q(z12);
                            z15 = true;
                        } else {
                            tj3Var2.m22111b0(1900548430);
                            tj3Var2.m22111b0(2065273409);
                            if (onboardingPage != OnboardingPage.MINI_LESSON_LESSON_INTRO) {
                                tj3Var2.m22139q(z12);
                                z12 = false;
                                z15 = false;
                            } else {
                                z14 = (i7 <= i8 && tj3Var2.m22120g(vi3Var)) || (i5 & 48) == i8;
                                objM22097O5 = tj3Var2.m22097O();
                                if (z14 || objM22097O5 == p84Var) {
                                    objM22097O5 = new th7(vi3Var, 14);
                                    tj3Var2.m22131l0(objM22097O5);
                                }
                                z12 = false;
                                hz5.m13595b(0, tj3Var2, (ui3) objM22097O5, null);
                                tj3Var2.m22139q(false);
                                z15 = true;
                            }
                            tj3Var2.m22139q(z12);
                        }
                        i9 = 16384;
                        if (z15) {
                            tj3Var2.m22111b0(-1212628956);
                            tj3Var2.m22139q(z12);
                            z17 = z12;
                            i9 = 16384;
                            z18 = true;
                        } else {
                            tj3Var2.m22111b0(1900550145);
                            i10 = (i3 & 8064) | ((i4 >> 3) & 57344);
                            tj3Var2.m22111b0(552475109);
                            if (onboardingPage != OnboardingPage.MINI_LESSON_READ_LISTEN) {
                                tj3Var2.m22139q(false);
                                z17 = false;
                                z18 = false;
                            } else {
                                String str9 = onboardingSelections.f27289a;
                                z16 = (((i10 & 57344) ^ 24576) <= 16384 && tj3Var2.m22120g(vi3Var)) || (i10 & 24576) == 16384;
                                objM22097O6 = tj3Var2.m22097O();
                                if (z16 || objM22097O6 == p84Var) {
                                    objM22097O6 = new th7(vi3Var, 15);
                                    tj3Var2.m22131l0(objM22097O6);
                                }
                                sz5.m21792c(miniLessonTemplate, vz5Var, str9, (ui3) objM22097O6, null, tj3Var2, (i10 >> 6) & 126);
                                z17 = false;
                                tj3Var2.m22139q(false);
                                z18 = true;
                            }
                            tj3Var2.m22139q(z17);
                        }
                        if (z18) {
                            tj3Var2.m22111b0(-1212625763);
                            tj3Var2.m22139q(z17);
                            z20 = true;
                        } else {
                            tj3Var2.m22111b0(1900553397);
                            tj3Var2.m22111b0(619859239);
                            if (onboardingPage != OnboardingPage.MINI_LESSON_FIRST_LINGQ) {
                                tj3Var2.m22139q(z17);
                                z17 = false;
                                z20 = false;
                            } else {
                                z19 = (i7 <= i8 && tj3Var2.m22120g(vi3Var)) || (i5 & 48) == i8;
                                objM22097O7 = tj3Var2.m22097O();
                                if (z19 || objM22097O7 == p84Var) {
                                    objM22097O7 = new th7(vi3Var, 18);
                                    tj3Var2.m22131l0(objM22097O7);
                                }
                                z17 = false;
                                a6c.m140a(0, tj3Var2, (ui3) objM22097O7, null);
                                tj3Var2.m22139q(false);
                                z20 = true;
                            }
                            tj3Var2.m22139q(z17);
                        }
                        if (z20) {
                            tj3Var2.m22111b0(-1212623934);
                            tj3Var2.m22139q(z17);
                            z22 = true;
                        } else {
                            tj3Var2.m22111b0(1900555335);
                            i11 = (i3 & 8064) | ((i4 >> 3) & 57344);
                            tj3Var2.m22111b0(-1448698532);
                            if (onboardingPage != OnboardingPage.MINI_LESSON_KEEP_ENCOUNTERING) {
                                tj3Var2.m22139q(false);
                                z17 = false;
                                z22 = false;
                            } else {
                                Set setM25144b = m25144b(onboardingSelections);
                                String str10 = onboardingSelections.f27289a;
                                z21 = (((i11 & 57344) ^ 24576) <= i9 && tj3Var2.m22120g(vi3Var)) || (i11 & 24576) == i9;
                                objM22097O8 = tj3Var2.m22097O();
                                if (z21 || objM22097O8 == p84Var) {
                                    objM22097O8 = new th7(vi3Var, 7);
                                    tj3Var2.m22131l0(objM22097O8);
                                }
                                tj3 tj3Var4 = tj3Var2;
                                rpb.m20742a(miniLessonTemplate, vz5Var, setM25144b, str10, (ui3) objM22097O8, null, tj3Var4, (i11 >> 6) & 126);
                                tj3Var2 = tj3Var4;
                                z17 = false;
                                tj3Var2.m22139q(false);
                                z22 = true;
                            }
                            tj3Var2.m22139q(z17);
                        }
                        if (z22) {
                            tj3Var2.m22111b0(-1212620555);
                            tj3Var2.m22139q(z17);
                            z24 = true;
                        } else {
                            tj3Var2.m22111b0(1900558811);
                            i12 = (i3 & 8064) | ((i4 >> 3) & 57344);
                            tj3Var2.m22111b0(-1361377729);
                            if (onboardingPage != OnboardingPage.MINI_LESSON_LYNX_AI) {
                                tj3Var2.m22139q(false);
                                z17 = false;
                                z24 = false;
                            } else {
                                Set setM25144b2 = m25144b(onboardingSelections);
                                String str11 = onboardingSelections.f27289a;
                                z23 = (((i12 & 57344) ^ 24576) <= i9 && tj3Var2.m22120g(vi3Var)) || (i12 & 24576) == i9;
                                objM22097O9 = tj3Var2.m22097O();
                                if (z23 || objM22097O9 == p84Var) {
                                    objM22097O9 = new th7(vi3Var, 20);
                                    tj3Var2.m22131l0(objM22097O9);
                                }
                                tj3 tj3Var5 = tj3Var2;
                                spb.m21533a(miniLessonTemplate, vz5Var, setM25144b2, str11, (ui3) objM22097O9, null, tj3Var5, (i12 >> 6) & 126);
                                tj3Var2 = tj3Var5;
                                z17 = false;
                                tj3Var2.m22139q(false);
                                z24 = true;
                            }
                            tj3Var2.m22139q(z17);
                        }
                        if (z24) {
                            tj3Var2.m22111b0(-1212617548);
                            tj3Var2.m22139q(z17);
                            p84Var = p84Var;
                            tj3Var = tj3Var2;
                            z27 = true;
                            z25 = true;
                            z26 = z17;
                        } else {
                            tj3Var2.m22111b0(1900561936);
                            i13 = i3 & 524160;
                            tj3Var2.m22111b0(-346749484);
                            str = onboardingSelections.f27290b;
                            if (str.length() == 0) {
                                str = "en";
                            }
                            if (iArr[onboardingPage.ordinal()] == 17) {
                                tj3 tj3Var6 = tj3Var2;
                                z26 = z17;
                                z25 = true;
                                sz5.m21791b(miniLessonTemplate, vz5Var, str, onboardingSelections.f27289a, onboardingSelections.f27305q, R$string.onboarding_v2_mini_lesson_tap_word_title, vi3Var, null, z2, tj3Var6, ((i13 >> 6) & 126) | ((i13 << 3) & 3670016) | ((i13 << 12) & 234881024));
                                tj3Var = tj3Var6;
                                tj3Var.m22139q(z26);
                                z27 = true;
                            } else {
                                tj3Var = tj3Var2;
                                z25 = true;
                                z26 = z17;
                                tj3Var.m22139q(z26);
                                z27 = z26;
                            }
                            tj3Var.m22139q(z26);
                        }
                        tj3Var.m22139q(z26);
                    }
                    if (z27) {
                        tj3Var.m22111b0(-1243813790);
                        tj3Var.m22139q(z26);
                        return;
                    }
                    tj3Var.m22111b0(-1979775796);
                    i14 = i >> 12;
                    tj3Var.m22111b0(-477869775);
                    if (onboardingPage == OnboardingPage.PAYWALL_CONFIDENCE_LONG) {
                        String str12 = onboardingSelections.f27289a;
                        String str13 = onboardingSelections.f27292d;
                        int i24 = onboardingSelections.f27298j;
                        z30 = ((((i14 & 896) ^ 384) > 256 || !tj3Var.m22120g(vi3Var)) && (i14 & 384) != 256) ? z26 : z25;
                        objM22097O11 = tj3Var.m22097O();
                        if (z30 || objM22097O11 == p84Var) {
                            objM22097O11 = new th7(vi3Var, 10);
                            tj3Var.m22131l0(objM22097O11);
                        }
                        AbstractC2231b.m9190c(i24, 0, tj3Var, (ui3) objM22097O11, null, str12, str13);
                    }
                    tj3Var.m22139q(z26);
                    tj3Var.m22139q(z26);
                }
                p84Var = p84Var;
                i2 = 2048;
                tj3Var2.m22111b0(859830932);
                String str14 = onboardingSelections.f27301m;
                boolean z44 = (i17 > 2048 && tj3Var2.m22120g(vi3Var)) || (i15 & 3072) == 2048;
                Object objM22097O20 = tj3Var2.m22097O();
                if (z44 || objM22097O20 == p84Var) {
                    objM22097O20 = new wh7(vi3Var, 3);
                    tj3Var2.m22131l0(objM22097O20);
                }
                hb5.m13184a(0, tj3Var2, ui3Var3, (vi3) objM22097O20, null, str14, str3, z);
                tj3Var2 = tj3Var2;
                z31 = false;
                tj3Var2.m22139q(false);
            }
            z4 = z31;
            z3 = true;
        } else {
            p84Var = p84Var;
            i19 = 6;
            i2 = 2048;
            tj3Var2.m22111b0(859810605);
            String str15 = onboardingSelections.f27299k;
            boolean z45 = (i17 > 2048 && tj3Var2.m22120g(vi3Var)) || (i15 & 3072) == 2048;
            Object objM22097O21 = tj3Var2.m22097O();
            if (z45 || objM22097O21 == p84Var) {
                z3 = true;
                objM22097O21 = new wh7(vi3Var, 1);
                tj3Var2.m22131l0(objM22097O21);
            } else {
                z3 = true;
            }
            AbstractC0015ad.m271a(str15, (vi3) objM22097O21, z, ui3Var3, null, tj3Var2, 0);
            z4 = false;
            tj3Var2.m22139q(false);
        }
        tj3Var2.m22139q(z4);
        tj3Var2.m22111b0(-1243821633);
        tj3Var2.m22139q(z4);
        z5 = z3;
        if (z5) {
            tj3Var2.m22111b0(-1243819525);
            tj3Var2.m22139q(z4);
            z9 = z3;
            z7 = z4;
        } else {
            tj3Var2.m22111b0(-1979781712);
            tj3Var2.m22111b0(273954932);
            if (i17 > i2) {
            }
            objM22097O = tj3Var2.m22097O();
            if (z6) {
                objM22097O = new th7(vi3Var, 8);
                tj3Var2.m22131l0(objM22097O);
            } else {
                objM22097O = new th7(vi3Var, 8);
                tj3Var2.m22131l0(objM22097O);
            }
            ui3Var = (ui3) objM22097O;
            switch (iArr[onboardingPage.ordinal()]) {
                case 10:
                    z7 = false;
                    tj3Var2.m22111b0(1277694236);
                    lpb.m16441a(0, tj3Var2, ui3Var, null);
                    tj3Var2.m22139q(false);
                    tj3Var2.m22139q(z7);
                    z9 = z3;
                    break;
                case 11:
                    tj3Var2.m22111b0(1277696979);
                    String str16 = onboardingSelections.f27304p;
                    if (i17 > i2) {
                    }
                    objM22097O2 = tj3Var2.m22097O();
                    if (z8) {
                        z7 = false;
                        objM22097O2 = new wh7(vi3Var, 0);
                        tj3Var2.m22131l0(objM22097O2);
                    } else {
                        z7 = false;
                        objM22097O2 = new wh7(vi3Var, 0);
                        tj3Var2.m22131l0(objM22097O2);
                    }
                    nz2.m17707a(str16, (vi3) objM22097O2, z, ui3Var, null, tj3Var2, 0);
                    tj3Var2.m22139q(z7);
                    tj3Var2.m22139q(z7);
                    z9 = z3;
                    break;
                case 12:
                    tj3Var2.m22111b0(1277706321);
                    String str17 = onboardingSelections.f27289a;
                    int i25 = onboardingSelections.f27298j;
                    if (i17 > i2) {
                    }
                    objM22097O3 = tj3Var2.m22097O();
                    if (z10) {
                        objM22097O3 = new th7(vi3Var, 9);
                        tj3Var2.m22131l0(objM22097O3);
                    } else {
                        objM22097O3 = new th7(vi3Var, 9);
                        tj3Var2.m22131l0(objM22097O3);
                    }
                    tj3 tj3Var7 = tj3Var2;
                    AbstractC2231b.m9188a(i25, 0, tj3Var7, (ui3) objM22097O3, null, str17);
                    tj3Var2 = tj3Var7;
                    tj3Var2.m22139q(false);
                    z7 = false;
                    tj3Var2.m22139q(z7);
                    z9 = z3;
                    break;
                default:
                    tj3Var2.m22111b0(954419906);
                    tj3Var2.m22139q(false);
                    tj3Var2.m22139q(false);
                    z7 = false;
                    z9 = false;
                    break;
            }
            tj3Var2.m22139q(z7);
        }
        if (z9) {
            tj3Var2.m22111b0(-1243817510);
            tj3Var2.m22139q(z7);
            z27 = z3;
            z25 = z27;
            p84Var = p84Var;
            tj3Var = tj3Var2;
            z26 = z7;
        } else {
            tj3Var2.m22111b0(-1979779577);
            i3 = i >> 3;
            i4 = i3 & 524160;
            i5 = i4 >> 12;
            tj3Var2.m22111b0(2143443419);
            i6 = (i5 & 112) ^ 48;
            if (i6 > 32) {
            }
            objM22097O4 = tj3Var2.m22097O();
            if (z11) {
                objM22097O4 = new th7(vi3Var, 16);
                tj3Var2.m22131l0(objM22097O4);
            } else {
                objM22097O4 = new th7(vi3Var, 16);
                tj3Var2.m22131l0(objM22097O4);
            }
            ui3Var2 = (ui3) objM22097O4;
            switch (iArr[onboardingPage.ordinal()]) {
                case 13:
                    o44Var = new o44(R$string.onboarding_v2_section35_1_title, R$string.onboarding_v2_section35_1_subtitle, Integer.valueOf(R$drawable.im_onboarding_method_1));
                    break;
                case 14:
                    o44Var = new o44(R$string.onboarding_v2_section35_2_title, R$string.onboarding_v2_section35_2_subtitle, Integer.valueOf(R$drawable.im_onboarding_method_2));
                    break;
                case 15:
                    o44Var = new o44(R$string.onboarding_v2_section35_3_title, R$string.onboarding_v2_section35_3_subtitle, Integer.valueOf(R$drawable.im_onboarding_method_3));
                    break;
                case 16:
                    o44Var = new o44(R$string.onboarding_v2_section35_4_title, R$string.onboarding_v2_section35_4_subtitle, Integer.valueOf(R$drawable.im_onboarding_method_4));
                    break;
                default:
                    o44Var = null;
                    break;
            }
            if (o44Var == null) {
                tj3Var2.m22139q(false);
                tj3Var2.m22111b0(1900546890);
                tj3Var2.m22111b0(1540914395);
                if (onboardingPage != OnboardingPage.MINI_LESSON_INTRO) {
                    tj3Var2.m22139q(false);
                    z29 = false;
                    z13 = false;
                } else {
                    if (i6 <= 32) {
                    }
                    objM22097O10 = tj3Var2.m22097O();
                    if (z28) {
                        objM22097O10 = new th7(vi3Var, 17);
                        tj3Var2.m22131l0(objM22097O10);
                    } else {
                        objM22097O10 = new th7(vi3Var, 17);
                        tj3Var2.m22131l0(objM22097O10);
                    }
                    z29 = false;
                    iz5.m14227c(0, tj3Var2, (ui3) objM22097O10, null);
                    tj3Var2.m22139q(false);
                    z13 = true;
                }
                tj3Var2.m22139q(z29);
                i7 = i6;
                i8 = 32;
                z12 = z29;
            } else {
                i7 = i6;
                z12 = false;
                i8 = 32;
                q1d.m19600a(o44Var.f53821a, o44Var.f53822b, o44Var.f53823c, ui3Var2, null, tj3Var2, 0);
                tj3Var2.m22139q(false);
                tj3Var2.m22111b0(-1212632056);
                tj3Var2.m22139q(false);
                z13 = true;
            }
            if (z13) {
                tj3Var2.m22111b0(-1212630568);
                tj3Var2.m22139q(z12);
                z15 = true;
            } else {
                tj3Var2.m22111b0(1900548430);
                tj3Var2.m22111b0(2065273409);
                if (onboardingPage != OnboardingPage.MINI_LESSON_LESSON_INTRO) {
                    tj3Var2.m22139q(z12);
                    z12 = false;
                    z15 = false;
                } else {
                    if (i7 <= i8) {
                    }
                    objM22097O5 = tj3Var2.m22097O();
                    if (z14) {
                        objM22097O5 = new th7(vi3Var, 14);
                        tj3Var2.m22131l0(objM22097O5);
                    } else {
                        objM22097O5 = new th7(vi3Var, 14);
                        tj3Var2.m22131l0(objM22097O5);
                    }
                    z12 = false;
                    hz5.m13595b(0, tj3Var2, (ui3) objM22097O5, null);
                    tj3Var2.m22139q(false);
                    z15 = true;
                }
                tj3Var2.m22139q(z12);
            }
            i9 = 16384;
            if (z15) {
                tj3Var2.m22111b0(-1212628956);
                tj3Var2.m22139q(z12);
                z17 = z12;
                i9 = 16384;
                z18 = true;
            } else {
                tj3Var2.m22111b0(1900550145);
                i10 = (i3 & 8064) | ((i4 >> 3) & 57344);
                tj3Var2.m22111b0(552475109);
                if (onboardingPage != OnboardingPage.MINI_LESSON_READ_LISTEN) {
                    tj3Var2.m22139q(false);
                    z17 = false;
                    z18 = false;
                } else {
                    String str18 = onboardingSelections.f27289a;
                    if (((i10 & 57344) ^ 24576) <= 16384) {
                    }
                    objM22097O6 = tj3Var2.m22097O();
                    if (z16) {
                        objM22097O6 = new th7(vi3Var, 15);
                        tj3Var2.m22131l0(objM22097O6);
                    } else {
                        objM22097O6 = new th7(vi3Var, 15);
                        tj3Var2.m22131l0(objM22097O6);
                    }
                    sz5.m21792c(miniLessonTemplate, vz5Var, str18, (ui3) objM22097O6, null, tj3Var2, (i10 >> 6) & 126);
                    z17 = false;
                    tj3Var2.m22139q(false);
                    z18 = true;
                }
                tj3Var2.m22139q(z17);
            }
            if (z18) {
                tj3Var2.m22111b0(-1212625763);
                tj3Var2.m22139q(z17);
                z20 = true;
            } else {
                tj3Var2.m22111b0(1900553397);
                tj3Var2.m22111b0(619859239);
                if (onboardingPage != OnboardingPage.MINI_LESSON_FIRST_LINGQ) {
                    tj3Var2.m22139q(z17);
                    z17 = false;
                    z20 = false;
                } else {
                    if (i7 <= i8) {
                    }
                    objM22097O7 = tj3Var2.m22097O();
                    if (z19) {
                        objM22097O7 = new th7(vi3Var, 18);
                        tj3Var2.m22131l0(objM22097O7);
                    } else {
                        objM22097O7 = new th7(vi3Var, 18);
                        tj3Var2.m22131l0(objM22097O7);
                    }
                    z17 = false;
                    a6c.m140a(0, tj3Var2, (ui3) objM22097O7, null);
                    tj3Var2.m22139q(false);
                    z20 = true;
                }
                tj3Var2.m22139q(z17);
            }
            if (z20) {
                tj3Var2.m22111b0(-1212623934);
                tj3Var2.m22139q(z17);
                z22 = true;
            } else {
                tj3Var2.m22111b0(1900555335);
                i11 = (i3 & 8064) | ((i4 >> 3) & 57344);
                tj3Var2.m22111b0(-1448698532);
                if (onboardingPage != OnboardingPage.MINI_LESSON_KEEP_ENCOUNTERING) {
                    tj3Var2.m22139q(false);
                    z17 = false;
                    z22 = false;
                } else {
                    Set setM25144b3 = m25144b(onboardingSelections);
                    String str19 = onboardingSelections.f27289a;
                    if (((i11 & 57344) ^ 24576) <= i9) {
                    }
                    objM22097O8 = tj3Var2.m22097O();
                    if (z21) {
                        objM22097O8 = new th7(vi3Var, 7);
                        tj3Var2.m22131l0(objM22097O8);
                    } else {
                        objM22097O8 = new th7(vi3Var, 7);
                        tj3Var2.m22131l0(objM22097O8);
                    }
                    tj3 tj3Var8 = tj3Var2;
                    rpb.m20742a(miniLessonTemplate, vz5Var, setM25144b3, str19, (ui3) objM22097O8, null, tj3Var8, (i11 >> 6) & 126);
                    tj3Var2 = tj3Var8;
                    z17 = false;
                    tj3Var2.m22139q(false);
                    z22 = true;
                }
                tj3Var2.m22139q(z17);
            }
            if (z22) {
                tj3Var2.m22111b0(-1212620555);
                tj3Var2.m22139q(z17);
                z24 = true;
            } else {
                tj3Var2.m22111b0(1900558811);
                i12 = (i3 & 8064) | ((i4 >> 3) & 57344);
                tj3Var2.m22111b0(-1361377729);
                if (onboardingPage != OnboardingPage.MINI_LESSON_LYNX_AI) {
                    tj3Var2.m22139q(false);
                    z17 = false;
                    z24 = false;
                } else {
                    Set setM25144b4 = m25144b(onboardingSelections);
                    String str110 = onboardingSelections.f27289a;
                    if (((i12 & 57344) ^ 24576) <= i9) {
                    }
                    objM22097O9 = tj3Var2.m22097O();
                    if (z23) {
                        objM22097O9 = new th7(vi3Var, 20);
                        tj3Var2.m22131l0(objM22097O9);
                    } else {
                        objM22097O9 = new th7(vi3Var, 20);
                        tj3Var2.m22131l0(objM22097O9);
                    }
                    tj3 tj3Var9 = tj3Var2;
                    spb.m21533a(miniLessonTemplate, vz5Var, setM25144b4, str110, (ui3) objM22097O9, null, tj3Var9, (i12 >> 6) & 126);
                    tj3Var2 = tj3Var9;
                    z17 = false;
                    tj3Var2.m22139q(false);
                    z24 = true;
                }
                tj3Var2.m22139q(z17);
            }
            if (z24) {
                tj3Var2.m22111b0(-1212617548);
                tj3Var2.m22139q(z17);
                p84Var = p84Var;
                tj3Var = tj3Var2;
                z27 = true;
                z25 = true;
                z26 = z17;
            } else {
                tj3Var2.m22111b0(1900561936);
                i13 = i3 & 524160;
                tj3Var2.m22111b0(-346749484);
                str = onboardingSelections.f27290b;
                if (str.length() == 0) {
                    str = "en";
                }
                if (iArr[onboardingPage.ordinal()] == 17) {
                    tj3 tj3Var10 = tj3Var2;
                    z26 = z17;
                    z25 = true;
                    sz5.m21791b(miniLessonTemplate, vz5Var, str, onboardingSelections.f27289a, onboardingSelections.f27305q, R$string.onboarding_v2_mini_lesson_tap_word_title, vi3Var, null, z2, tj3Var10, ((i13 >> 6) & 126) | ((i13 << 3) & 3670016) | ((i13 << 12) & 234881024));
                    tj3Var = tj3Var10;
                    tj3Var.m22139q(z26);
                    z27 = true;
                } else {
                    tj3Var = tj3Var2;
                    z25 = true;
                    z26 = z17;
                    tj3Var.m22139q(z26);
                    z27 = z26;
                }
                tj3Var.m22139q(z26);
            }
            tj3Var.m22139q(z26);
        }
        if (z27) {
            tj3Var.m22111b0(-1243813790);
            tj3Var.m22139q(z26);
            return;
        }
        tj3Var.m22111b0(-1979775796);
        i14 = i >> 12;
        tj3Var.m22111b0(-477869775);
        if (onboardingPage == OnboardingPage.PAYWALL_CONFIDENCE_LONG) {
            String str111 = onboardingSelections.f27289a;
            String str112 = onboardingSelections.f27292d;
            int i26 = onboardingSelections.f27298j;
            if (((i14 & 896) ^ 384) > 256) {
            }
            objM22097O11 = tj3Var.m22097O();
            if (z30) {
                objM22097O11 = new th7(vi3Var, 10);
                tj3Var.m22131l0(objM22097O11);
            } else {
                objM22097O11 = new th7(vi3Var, 10);
                tj3Var.m22131l0(objM22097O11);
            }
            AbstractC2231b.m9190c(i26, 0, tj3Var, (ui3) objM22097O11, null, str111, str112);
        }
        tj3Var.m22139q(z26);
        tj3Var.m22139q(z26);
    }

    /* JADX INFO: renamed from: b */
    public static final Set m25144b(OnboardingSelections onboardingSelections) {
        List list = onboardingSelections.f27305q;
        ArrayList arrayList = new ArrayList(v91.m23189q0(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((PendingMiniLessonLingq) it.next()).f27356a);
        }
        return u91.m22627s1(arrayList);
    }
}
