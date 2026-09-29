package com.lingq.feature.review.state;

import androidx.compose.runtime.AbstractC0278f;
import androidx.room.util.AbstractC0758a;
import com.lingq.core.data.repository.C1287c;
import com.lingq.core.data.repository.C1308x;
import com.lingq.core.datastore.C1370c;
import com.lingq.core.domain.model.LanguageLearn;
import com.lingq.core.domain.model.lesson.LessonCard;
import com.lingq.core.domain.model.lesson.LessonSentence;
import com.lingq.core.domain.model.lesson.LessonTransliteration;
import com.lingq.core.domain.model.status.CardStatus;
import com.lingq.core.domain.model.token.TokenMeaning;
import com.lingq.core.domain.model.user.ProfileAccount;
import com.lingq.core.domain.theme.C1530a;
import com.lingq.core.settings.ViewKeys;
import com.lingq.feature.review.R$string;
import com.lingq.feature.review.data.ReviewActivityResult;
import com.lingq.feature.review.data.ReviewCardLayoutStyle;
import com.lingq.feature.review.domain.C2755a;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.AbstractC3193b;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.random.Random$Default;
import kotlin.text.Regex;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.AbstractC3184kh;
import p000.AbstractC3352my;
import p000.AbstractC3393o1;
import p000.C3386nv;
import p000.aa8;
import p000.ad8;
import p000.ao0;
import p000.ba8;
import p000.bd8;
import p000.c83;
import p000.cd8;
import p000.ck6;
import p000.cl9;
import p000.cma;
import p000.db8;
import p000.eb8;
import p000.eg8;
import p000.eh9;
import p000.ek2;
import p000.fa4;
import p000.fa8;
import p000.fb8;
import p000.ga8;
import p000.gb8;
import p000.gm5;
import p000.ha8;
import p000.hb8;
import p000.i19;
import p000.i41;
import p000.ib8;
import p000.ie8;
import p000.ig8;
import p000.jb8;
import p000.jq7;
import p000.kb8;
import p000.kc8;
import p000.ke2;
import p000.lb8;
import p000.mb8;
import p000.nb8;
import p000.nn1;
import p000.pk9;
import p000.q05;
import p000.qc8;
import p000.ql3;
import p000.qv7;
import p000.rc8;
import p000.sc8;
import p000.t66;
import p000.t7d;
import p000.tc8;
import p000.u13;
import p000.u63;
import p000.u91;
import p000.uc8;
import p000.un1;
import p000.ux5;
import p000.v91;
import p000.va2;
import p000.vk9;
import p000.vs3;
import p000.wa8;
import p000.wfb;
import p000.xa2;
import p000.xc9;
import p000.xfa;
import p000.xm5;
import p000.ym5;
import p000.zz7;

/* JADX INFO: renamed from: com.lingq.feature.review.state.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C2761a implements cma {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ cma f32704a;

    /* JADX INFO: renamed from: b */
    public final C2755a f32705b;

    /* JADX INFO: renamed from: c */
    public final ck6 f32706c;

    /* JADX INFO: renamed from: d */
    public final u13 f32707d;

    /* JADX INFO: renamed from: e */
    public final ql3 f32708e;

    /* JADX INFO: renamed from: f */
    public final C2755a f32709f;

    /* JADX INFO: renamed from: g */
    public final ql3 f32710g;

    /* JADX INFO: renamed from: h */
    public final xa2 f32711h;

    /* JADX INFO: renamed from: i */
    public final va2 f32712i;

    /* JADX INFO: renamed from: j */
    public final C1530a f32713j;

    /* JADX INFO: renamed from: k */
    public final nn1 f32714k;

    /* JADX INFO: renamed from: l */
    public final un1 f32715l;

    /* JADX INFO: renamed from: m */
    public final t66 f32716m;

    /* JADX INFO: renamed from: n */
    public final t66 f32717n;

    /* JADX INFO: renamed from: o */
    public final t66 f32718o;

    /* JADX INFO: renamed from: p */
    public final t66 f32719p;

    /* JADX INFO: renamed from: q */
    public final t66 f32720q;

    /* JADX INFO: renamed from: r */
    public final t66 f32721r;

    /* JADX INFO: renamed from: s */
    public final t66 f32722s;

    /* JADX INFO: renamed from: t */
    public int f32723t;

    public C2761a(C2755a c2755a, ck6 ck6Var, u13 u13Var, ql3 ql3Var, C2755a c2755a2, ql3 ql3Var2, xa2 xa2Var, va2 va2Var, C1530a c1530a, nn1 nn1Var, un1 un1Var, cma cmaVar) {
        un1Var.getClass();
        cmaVar.getClass();
        this.f32704a = cmaVar;
        this.f32705b = c2755a;
        this.f32706c = ck6Var;
        this.f32707d = u13Var;
        this.f32708e = ql3Var;
        this.f32709f = c2755a2;
        this.f32710g = ql3Var2;
        this.f32711h = xa2Var;
        this.f32712i = va2Var;
        this.f32713j = c1530a;
        this.f32714k = nn1Var;
        this.f32715l = un1Var;
        this.f32716m = AbstractC0278f.m1260j(null);
        this.f32717n = AbstractC0278f.m1260j(null);
        this.f32718o = AbstractC0278f.m1260j(ReviewActivityResult.None);
        this.f32719p = AbstractC0278f.m1260j("");
        Boolean bool = Boolean.FALSE;
        this.f32720q = AbstractC0278f.m1260j(bool);
        this.f32721r = AbstractC0278f.m1260j(bool);
        this.f32722s = AbstractC0278f.m1260j(zz7.f72431f);
        this.f32723t = -1;
        wfb.m23926u(un1Var, null, null, new ReviewCardContentStateHolder$1(this, null), 3);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: A */
    public final c83 mo4571A() {
        return this.f32704a.mo4571A();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: B0 */
    public final eh9 mo4572B0() {
        return this.f32704a.mo4572B0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: B1 */
    public final eh9 mo4573B1() {
        return this.f32704a.mo4573B1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: C1 */
    public final c83 mo4574C1() {
        return this.f32704a.mo4574C1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: D0 */
    public final Object mo4575D0(Continuation continuation) {
        return this.f32704a.mo4575D0(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: F1 */
    public final Object mo4576F1(String str, Continuation continuation) {
        return this.f32704a.mo4576F1(str, continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: H */
    public final eh9 mo4577H() {
        return this.f32704a.mo4577H();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: J */
    public final Object mo4578J(Continuation continuation) {
        return this.f32704a.mo4578J(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: K */
    public final Object mo4579K(Continuation continuation) {
        return this.f32704a.mo4579K(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: K1 */
    public final String mo4580K1() {
        return this.f32704a.mo4580K1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: L0 */
    public final boolean mo4581L0() {
        return this.f32704a.mo4581L0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: N */
    public final c83 mo4582N() {
        return this.f32704a.mo4582N();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: O1 */
    public final c83 mo4583O1() {
        return this.f32704a.mo4583O1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: Q0 */
    public final int mo4584Q0() {
        return this.f32704a.mo4584Q0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: R */
    public final eh9 mo4585R() {
        return this.f32704a.mo4585R();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: T0 */
    public final boolean mo4586T0() {
        return this.f32704a.mo4586T0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: X */
    public final void mo4587X() {
        this.f32704a.mo4587X();
    }

    /* JADX WARN: Code duplicated, block: B:100:0x032a  */
    /* JADX WARN: Code duplicated, block: B:30:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:33:0x00c9 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:34:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:36:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:39:0x00e1 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:40:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:42:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:45:0x0119 A[LOOP:0: B:43:0x0113->B:45:0x0119, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:48:0x014f  */
    /* JADX WARN: Code duplicated, block: B:50:0x0155  */
    /* JADX WARN: Code duplicated, block: B:56:0x0172  */
    /* JADX WARN: Code duplicated, block: B:57:0x0175  */
    /* JADX WARN: Code duplicated, block: B:61:0x018e A[LOOP:1: B:59:0x0188->B:61:0x018e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:64:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:66:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:69:0x01e9 A[LOOP:2: B:67:0x01e3->B:69:0x01e9, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:72:0x0223  */
    /* JADX WARN: Code duplicated, block: B:74:0x0227  */
    /* JADX WARN: Code duplicated, block: B:77:0x0247 A[LOOP:3: B:75:0x0241->B:77:0x0247, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:80:0x0281  */
    /* JADX WARN: Code duplicated, block: B:82:0x0285  */
    /* JADX WARN: Code duplicated, block: B:84:0x0290  */
    /* JADX WARN: Code duplicated, block: B:87:0x029d  */
    /* JADX WARN: Code duplicated, block: B:90:0x02b7  */
    /* JADX WARN: Code duplicated, block: B:92:0x02dc  */
    /* JADX WARN: Code duplicated, block: B:93:0x02df  */
    /* JADX WARN: Code duplicated, block: B:97:0x02f4 A[LOOP:4: B:95:0x02ee->B:97:0x02f4, LOOP_END] */
    /* JADX INFO: renamed from: a */
    public final Object m9617a(nb8 nb8Var, LessonCard lessonCard, sc8 sc8Var, boolean z, ContinuationImpl continuationImpl) throws Throwable {
        ReviewCardContentStateHolder$buildCardQuestionState$1 reviewCardContentStateHolder$buildCardQuestionState$1;
        LessonCard lessonCard2;
        boolean z2;
        nb8 nb8Var2;
        sc8 sc8Var2;
        List list;
        sc8 sc8Var3;
        Map map;
        String str;
        ArrayList<String> arrayList;
        String str2;
        ArrayList arrayList2;
        fb8 fb8Var;
        ArrayList arrayList3;
        eb8 eb8Var;
        ArrayList arrayList4;
        TokenMeaning tokenMeaning;
        String str3;
        kb8 kb8Var;
        ArrayList arrayList5;
        String str4;
        jb8 jb8Var;
        ArrayList arrayList6;
        Object objM9621e;
        Object objM9619c;
        if (continuationImpl instanceof ReviewCardContentStateHolder$buildCardQuestionState$1) {
            reviewCardContentStateHolder$buildCardQuestionState$1 = (ReviewCardContentStateHolder$buildCardQuestionState$1) continuationImpl;
            int i = reviewCardContentStateHolder$buildCardQuestionState$1.f32542h;
            if ((i & Integer.MIN_VALUE) != 0) {
                reviewCardContentStateHolder$buildCardQuestionState$1.f32542h = i - Integer.MIN_VALUE;
            } else {
                reviewCardContentStateHolder$buildCardQuestionState$1 = new ReviewCardContentStateHolder$buildCardQuestionState$1(this, continuationImpl);
            }
        } else {
            reviewCardContentStateHolder$buildCardQuestionState$1 = new ReviewCardContentStateHolder$buildCardQuestionState$1(this, continuationImpl);
        }
        Object objM9599f = reviewCardContentStateHolder$buildCardQuestionState$1.f32540f;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = reviewCardContentStateHolder$buildCardQuestionState$1.f32542h;
        String strM17124i = null;
        if (i2 == 0) {
            AbstractC3193b.m15359b(objM9599f);
            String str5 = lessonCard.f19178a;
            reviewCardContentStateHolder$buildCardQuestionState$1.f32535a = nb8Var;
            reviewCardContentStateHolder$buildCardQuestionState$1.f32536b = lessonCard;
            reviewCardContentStateHolder$buildCardQuestionState$1.f32537c = sc8Var;
            reviewCardContentStateHolder$buildCardQuestionState$1.f32539e = z;
            reviewCardContentStateHolder$buildCardQuestionState$1.f32542h = 1;
            objM9599f = this.f32709f.m9599f(this.f32704a.mo4589b2(), str5, reviewCardContentStateHolder$buildCardQuestionState$1);
            if (objM9599f != obj) {
                lessonCard2 = lessonCard;
                z2 = z;
                nb8Var2 = nb8Var;
                sc8Var2 = sc8Var;
            }
            return obj;
        }
        if (i2 == 1) {
            z2 = reviewCardContentStateHolder$buildCardQuestionState$1.f32539e;
            sc8Var2 = reviewCardContentStateHolder$buildCardQuestionState$1.f32537c;
            lessonCard2 = reviewCardContentStateHolder$buildCardQuestionState$1.f32536b;
            nb8Var2 = reviewCardContentStateHolder$buildCardQuestionState$1.f32535a;
            AbstractC3193b.m15359b(objM9599f);
        } else {
            if (i2 != 2) {
                if (i2 != 3 && i2 != 4) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                List list2 = reviewCardContentStateHolder$buildCardQuestionState$1.f32538d;
                AbstractC3193b.m15359b(objM9599f);
                return objM9599f;
            }
            z2 = reviewCardContentStateHolder$buildCardQuestionState$1.f32539e;
            list = reviewCardContentStateHolder$buildCardQuestionState$1.f32538d;
            sc8Var3 = reviewCardContentStateHolder$buildCardQuestionState$1.f32537c;
            lessonCard2 = reviewCardContentStateHolder$buildCardQuestionState$1.f32536b;
            nb8Var2 = reviewCardContentStateHolder$buildCardQuestionState$1.f32535a;
            AbstractC3193b.m15359b(objM9599f);
        }
        map = (Map) objM9599f;
        if (nb8Var2 instanceof gb8) {
            reviewCardContentStateHolder$buildCardQuestionState$1.f32535a = null;
            reviewCardContentStateHolder$buildCardQuestionState$1.f32536b = null;
            reviewCardContentStateHolder$buildCardQuestionState$1.f32537c = null;
            reviewCardContentStateHolder$buildCardQuestionState$1.f32538d = null;
            reviewCardContentStateHolder$buildCardQuestionState$1.f32539e = z2;
            reviewCardContentStateHolder$buildCardQuestionState$1.f32542h = 3;
            objM9619c = m9619c(lessonCard2, map, list, reviewCardContentStateHolder$buildCardQuestionState$1);
            if (objM9619c == obj) {
                return objM9619c;
            }
        } else {
            if (nb8Var2 instanceof hb8) {
                if (nb8Var2 instanceof jb8) {
                    jb8Var = (jb8) nb8Var2;
                    ReviewCardLayoutStyle reviewCardLayoutStyle = ReviewCardLayoutStyle.QuizQuestion;
                    Integer numValueOf = Integer.valueOf(R$string.activities_select_meaning);
                    String strM17124i2 = AbstractC3352my.m17124i(lessonCard2.f19178a);
                    String strM9632p = m9632p((String) map.get("MultipleChoiceFrontTransliteration"), lessonCard2);
                    ArrayList<String> arrayList7 = jb8Var.f45383c;
                    arrayList6 = new ArrayList(v91.m23189q0(arrayList7, 10));
                    for (String str6 : arrayList7) {
                        arrayList6.add(new rc8(str6, fa4.m11650l(str6, jb8Var.f45382b)));
                    }
                    return new qc8(reviewCardLayoutStyle, numValueOf, strM17124i2, strM9632p, null, null, null, null, arrayList6, true, false, null, null, null, 0, null, 261360);
                }
                if (nb8Var2 instanceof kb8) {
                    ReviewCardLayoutStyle reviewCardLayoutStyle2 = ReviewCardLayoutStyle.QuizQuestion;
                    Integer num = new Integer(R$string.activities_select_meaning_match);
                    tokenMeaning = (TokenMeaning) u91.m22591I0(lessonCard2.f19183f);
                    if (tokenMeaning != null && (str4 = tokenMeaning.f19596c) != null) {
                        strM17124i = AbstractC3352my.m17124i(str4);
                    }
                    if (strM17124i == null) {
                        str3 = "";
                    } else {
                        str3 = strM17124i;
                    }
                    kb8Var = (kb8) nb8Var2;
                    ArrayList<String> arrayList8 = kb8Var.f46980c;
                    arrayList5 = new ArrayList(v91.m23189q0(arrayList8, 10));
                    for (String str7 : arrayList8) {
                        arrayList5.add(new rc8(str7, fa4.m11650l(str7, kb8Var.f46979b)));
                    }
                    return new qc8(reviewCardLayoutStyle2, num, str3, null, null, null, null, null, arrayList5, false, false, null, null, null, 0, null, 261880);
                }
                if (nb8Var2 instanceof eb8) {
                    eb8Var = (eb8) nb8Var2;
                    ReviewCardLayoutStyle reviewCardLayoutStyle3 = ReviewCardLayoutStyle.QuizQuestion;
                    Integer numValueOf2 = Integer.valueOf(R$string.activities_select_word_hear);
                    ArrayList<String> arrayList9 = eb8Var.f36983c;
                    arrayList4 = new ArrayList(v91.m23189q0(arrayList9, 10));
                    for (String str8 : arrayList9) {
                        arrayList4.add(new rc8(str8, fa4.m11650l(str8, eb8Var.f36982b)));
                    }
                    return new qc8(reviewCardLayoutStyle3, numValueOf2, "", null, null, null, null, null, arrayList4, true, false, null, null, null, 0, null, 261368);
                }
                if (nb8Var2 instanceof fb8) {
                    ReviewCardLayoutStyle reviewCardLayoutStyle4 = ReviewCardLayoutStyle.QuizQuestion;
                    Integer num2 = new Integer(R$string.activities_select_word_meaning_hear);
                    fb8Var = (fb8) nb8Var2;
                    ArrayList<String> arrayList10 = fb8Var.f38799c;
                    arrayList3 = new ArrayList(v91.m23189q0(arrayList10, 10));
                    for (String str9 : arrayList10) {
                        arrayList3.add(new rc8(str9, fa4.m11650l(str9, fb8Var.f38798b)));
                    }
                    return new qc8(reviewCardLayoutStyle4, num2, "", null, null, null, null, null, arrayList3, true, false, null, null, null, 0, null, 261368);
                }
                if (nb8Var2 instanceof db8) {
                    return new qc8(ReviewCardLayoutStyle.QuizQuestion, null, lessonCard2.f19178a, null, null, null, null, null, null, false, false, null, null, null, 0, null, 262138);
                }
                str = ((db8) nb8Var2).f35361b;
                arrayList = new ArrayList();
                if (sc8Var3 != null) {
                    arrayList.addAll(sc8Var3.f60685c);
                }
                if (!arrayList.isEmpty()) {
                    Random$Default random$Default = jq7.f46010a;
                    arrayList.add(jq7.f46011b.m14247e(arrayList.size() + 1), str);
                }
                ReviewCardLayoutStyle reviewCardLayoutStyle5 = ReviewCardLayoutStyle.QuizQuestion;
                Integer numValueOf3 = Integer.valueOf(R$string.activities_select_missing_word);
                strM17124i = sc8Var3 != null ? AbstractC3352my.m17124i(u91.m22596N0(sc8Var3.f60684b, "", null, null, new qv7(10), 30)) : null;
                if (strM17124i == null) {
                    str2 = "";
                } else {
                    str2 = strM17124i;
                }
                arrayList2 = new ArrayList(v91.m23189q0(arrayList, 10));
                for (String str10 : arrayList) {
                    arrayList2.add(new rc8(str10, fa4.m11650l(str10, str)));
                }
                return new qc8(reviewCardLayoutStyle5, numValueOf3, str2, null, null, null, null, null, arrayList2, z2, false, null, null, null, 0, null, 261368);
            }
            reviewCardContentStateHolder$buildCardQuestionState$1.f32535a = null;
            reviewCardContentStateHolder$buildCardQuestionState$1.f32536b = null;
            reviewCardContentStateHolder$buildCardQuestionState$1.f32537c = null;
            reviewCardContentStateHolder$buildCardQuestionState$1.f32538d = null;
            reviewCardContentStateHolder$buildCardQuestionState$1.f32539e = z2;
            reviewCardContentStateHolder$buildCardQuestionState$1.f32542h = 4;
            objM9621e = m9621e(lessonCard2, map, list, reviewCardContentStateHolder$buildCardQuestionState$1);
            if (objM9621e == obj) {
                return objM9621e;
            }
        }
        return obj;
        List list3 = (List) objM9599f;
        reviewCardContentStateHolder$buildCardQuestionState$1.f32535a = nb8Var2;
        reviewCardContentStateHolder$buildCardQuestionState$1.f32536b = lessonCard2;
        reviewCardContentStateHolder$buildCardQuestionState$1.f32537c = sc8Var2;
        reviewCardContentStateHolder$buildCardQuestionState$1.f32538d = list3;
        reviewCardContentStateHolder$buildCardQuestionState$1.f32539e = z2;
        reviewCardContentStateHolder$buildCardQuestionState$1.f32542h = 2;
        Object objM15541t = AbstractC3224d.m15541t(((C1370c) ((ig8) this.f32705b.f32467a)).f18513Y, reviewCardContentStateHolder$buildCardQuestionState$1);
        if (objM15541t != obj) {
            sc8 sc8Var4 = sc8Var2;
            list = list3;
            objM9599f = objM15541t;
            sc8Var3 = sc8Var4;
            map = (Map) objM9599f;
            if (nb8Var2 instanceof gb8) {
                reviewCardContentStateHolder$buildCardQuestionState$1.f32535a = null;
                reviewCardContentStateHolder$buildCardQuestionState$1.f32536b = null;
                reviewCardContentStateHolder$buildCardQuestionState$1.f32537c = null;
                reviewCardContentStateHolder$buildCardQuestionState$1.f32538d = null;
                reviewCardContentStateHolder$buildCardQuestionState$1.f32539e = z2;
                reviewCardContentStateHolder$buildCardQuestionState$1.f32542h = 3;
                objM9619c = m9619c(lessonCard2, map, list, reviewCardContentStateHolder$buildCardQuestionState$1);
                if (objM9619c == obj) {
                    return objM9619c;
                }
            } else {
                if (nb8Var2 instanceof hb8) {
                    if (nb8Var2 instanceof jb8) {
                        jb8Var = (jb8) nb8Var2;
                        ReviewCardLayoutStyle reviewCardLayoutStyle6 = ReviewCardLayoutStyle.QuizQuestion;
                        Integer numValueOf4 = Integer.valueOf(R$string.activities_select_meaning);
                        String strM17124i3 = AbstractC3352my.m17124i(lessonCard2.f19178a);
                        String strM9632p2 = m9632p((String) map.get("MultipleChoiceFrontTransliteration"), lessonCard2);
                        ArrayList<String> arrayList11 = jb8Var.f45383c;
                        arrayList6 = new ArrayList(v91.m23189q0(arrayList11, 10));
                        while (r0.hasNext()) {
                            arrayList6.add(new rc8(str6, fa4.m11650l(str6, jb8Var.f45382b)));
                        }
                        return new qc8(reviewCardLayoutStyle6, numValueOf4, strM17124i3, strM9632p2, null, null, null, null, arrayList6, true, false, null, null, null, 0, null, 261360);
                    }
                    if (nb8Var2 instanceof kb8) {
                        ReviewCardLayoutStyle reviewCardLayoutStyle7 = ReviewCardLayoutStyle.QuizQuestion;
                        Integer num3 = new Integer(R$string.activities_select_meaning_match);
                        tokenMeaning = (TokenMeaning) u91.m22591I0(lessonCard2.f19183f);
                        if (tokenMeaning != null) {
                            strM17124i = AbstractC3352my.m17124i(str4);
                        }
                        if (strM17124i == null) {
                            str3 = "";
                        } else {
                            str3 = strM17124i;
                        }
                        kb8Var = (kb8) nb8Var2;
                        ArrayList<String> arrayList12 = kb8Var.f46980c;
                        arrayList5 = new ArrayList(v91.m23189q0(arrayList12, 10));
                        while (r0.hasNext()) {
                            arrayList5.add(new rc8(str7, fa4.m11650l(str7, kb8Var.f46979b)));
                        }
                        return new qc8(reviewCardLayoutStyle7, num3, str3, null, null, null, null, null, arrayList5, false, false, null, null, null, 0, null, 261880);
                    }
                    if (nb8Var2 instanceof eb8) {
                        eb8Var = (eb8) nb8Var2;
                        ReviewCardLayoutStyle reviewCardLayoutStyle8 = ReviewCardLayoutStyle.QuizQuestion;
                        Integer numValueOf5 = Integer.valueOf(R$string.activities_select_word_hear);
                        ArrayList<String> arrayList13 = eb8Var.f36983c;
                        arrayList4 = new ArrayList(v91.m23189q0(arrayList13, 10));
                        while (r0.hasNext()) {
                            arrayList4.add(new rc8(str8, fa4.m11650l(str8, eb8Var.f36982b)));
                        }
                        return new qc8(reviewCardLayoutStyle8, numValueOf5, "", null, null, null, null, null, arrayList4, true, false, null, null, null, 0, null, 261368);
                    }
                    if (nb8Var2 instanceof fb8) {
                        ReviewCardLayoutStyle reviewCardLayoutStyle9 = ReviewCardLayoutStyle.QuizQuestion;
                        Integer num4 = new Integer(R$string.activities_select_word_meaning_hear);
                        fb8Var = (fb8) nb8Var2;
                        ArrayList<String> arrayList14 = fb8Var.f38799c;
                        arrayList3 = new ArrayList(v91.m23189q0(arrayList14, 10));
                        while (r0.hasNext()) {
                            arrayList3.add(new rc8(str9, fa4.m11650l(str9, fb8Var.f38798b)));
                        }
                        return new qc8(reviewCardLayoutStyle9, num4, "", null, null, null, null, null, arrayList3, true, false, null, null, null, 0, null, 261368);
                    }
                    if (nb8Var2 instanceof db8) {
                        return new qc8(ReviewCardLayoutStyle.QuizQuestion, null, lessonCard2.f19178a, null, null, null, null, null, null, false, false, null, null, null, 0, null, 262138);
                    }
                    str = ((db8) nb8Var2).f35361b;
                    arrayList = new ArrayList();
                    if (sc8Var3 != null) {
                        arrayList.addAll(sc8Var3.f60685c);
                    }
                    if (!arrayList.isEmpty()) {
                        Random$Default random$Default2 = jq7.f46010a;
                        arrayList.add(jq7.f46011b.m14247e(arrayList.size() + 1), str);
                    }
                    ReviewCardLayoutStyle reviewCardLayoutStyle10 = ReviewCardLayoutStyle.QuizQuestion;
                    Integer numValueOf6 = Integer.valueOf(R$string.activities_select_missing_word);
                    if (sc8Var3 != null) {
                    }
                    if (strM17124i == null) {
                        str2 = "";
                    } else {
                        str2 = strM17124i;
                    }
                    arrayList2 = new ArrayList(v91.m23189q0(arrayList, 10));
                    while (r3.hasNext()) {
                        arrayList2.add(new rc8(str10, fa4.m11650l(str10, str)));
                    }
                    return new qc8(reviewCardLayoutStyle10, numValueOf6, str2, null, null, null, null, null, arrayList2, z2, false, null, null, null, 0, null, 261368);
                }
                reviewCardContentStateHolder$buildCardQuestionState$1.f32535a = null;
                reviewCardContentStateHolder$buildCardQuestionState$1.f32536b = null;
                reviewCardContentStateHolder$buildCardQuestionState$1.f32537c = null;
                reviewCardContentStateHolder$buildCardQuestionState$1.f32538d = null;
                reviewCardContentStateHolder$buildCardQuestionState$1.f32539e = z2;
                reviewCardContentStateHolder$buildCardQuestionState$1.f32542h = 4;
                objM9621e = m9621e(lessonCard2, map, list, reviewCardContentStateHolder$buildCardQuestionState$1);
                if (objM9621e == obj) {
                    return objM9621e;
                }
            }
        }
        return obj;
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: a0 */
    public final boolean mo4588a0() {
        return this.f32704a.mo4588a0();
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:38:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:41:0x00ce A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:42:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:44:0x00da  */
    /* JADX WARN: Code duplicated, block: B:47:0x00ec A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:48:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:51:0x0102 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: b */
    public final Object m9618b(nb8 nb8Var, LessonCard lessonCard, boolean z, ContinuationImpl continuationImpl) throws Throwable {
        ReviewCardContentStateHolder$buildCardResultState$1 reviewCardContentStateHolder$buildCardResultState$1;
        boolean z2;
        List list;
        nb8 nb8Var2;
        LessonCard lessonCard2;
        Map map;
        String str;
        String strM17734i;
        List list2;
        String str2;
        nb8 nb8Var3;
        LessonCard lessonCard3;
        Object objM9623g;
        Object objM9622f;
        Object objM9620d;
        if (continuationImpl instanceof ReviewCardContentStateHolder$buildCardResultState$1) {
            reviewCardContentStateHolder$buildCardResultState$1 = (ReviewCardContentStateHolder$buildCardResultState$1) continuationImpl;
            int i = reviewCardContentStateHolder$buildCardResultState$1.f32549g;
            if ((i & Integer.MIN_VALUE) != 0) {
                reviewCardContentStateHolder$buildCardResultState$1.f32549g = i - Integer.MIN_VALUE;
            } else {
                reviewCardContentStateHolder$buildCardResultState$1 = new ReviewCardContentStateHolder$buildCardResultState$1(this, continuationImpl);
            }
        } else {
            reviewCardContentStateHolder$buildCardResultState$1 = new ReviewCardContentStateHolder$buildCardResultState$1(this, continuationImpl);
        }
        ReviewCardContentStateHolder$buildCardResultState$1 reviewCardContentStateHolder$buildCardResultState$2 = reviewCardContentStateHolder$buildCardResultState$1;
        Object objM9599f = reviewCardContentStateHolder$buildCardResultState$2.f32547e;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = reviewCardContentStateHolder$buildCardResultState$2.f32549g;
        if (i2 == 0) {
            AbstractC3193b.m15359b(objM9599f);
            String str3 = lessonCard.f19178a;
            reviewCardContentStateHolder$buildCardResultState$2.f32543a = nb8Var;
            reviewCardContentStateHolder$buildCardResultState$2.f32544b = lessonCard;
            reviewCardContentStateHolder$buildCardResultState$2.f32546d = z;
            reviewCardContentStateHolder$buildCardResultState$2.f32549g = 1;
            objM9599f = this.f32709f.m9599f(this.f32704a.mo4589b2(), str3, reviewCardContentStateHolder$buildCardResultState$2);
            if (objM9599f != obj) {
            }
            return obj;
        }
        if (i2 == 1) {
            z = reviewCardContentStateHolder$buildCardResultState$2.f32546d;
            lessonCard = reviewCardContentStateHolder$buildCardResultState$2.f32544b;
            nb8Var = reviewCardContentStateHolder$buildCardResultState$2.f32543a;
            AbstractC3193b.m15359b(objM9599f);
        } else {
            if (i2 != 2) {
                if (i2 != 3 && i2 != 4 && i2 != 5) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                List list3 = reviewCardContentStateHolder$buildCardResultState$2.f32545c;
                AbstractC3193b.m15359b(objM9599f);
                return objM9599f;
            }
            boolean z3 = reviewCardContentStateHolder$buildCardResultState$2.f32546d;
            List list4 = reviewCardContentStateHolder$buildCardResultState$2.f32545c;
            lessonCard2 = reviewCardContentStateHolder$buildCardResultState$2.f32544b;
            nb8Var2 = reviewCardContentStateHolder$buildCardResultState$2.f32543a;
            AbstractC3193b.m15359b(objM9599f);
            z2 = z3;
            list = list4;
        }
        map = (Map) objM9599f;
        str = lessonCard2.f19192o;
        if (str != null || vk9.m23391n0(str)) {
            strM17734i = null;
        } else {
            strM17734i = AbstractC3393o1.m17734i("Notes: ", lessonCard2.f19192o);
        }
        if (nb8Var2 instanceof gb8) {
            reviewCardContentStateHolder$buildCardResultState$2.f32543a = null;
            reviewCardContentStateHolder$buildCardResultState$2.f32544b = null;
            reviewCardContentStateHolder$buildCardResultState$2.f32545c = null;
            reviewCardContentStateHolder$buildCardResultState$2.f32546d = z2;
            reviewCardContentStateHolder$buildCardResultState$2.f32549g = 3;
            objM9620d = m9620d(lessonCard2, map, list, strM17734i, reviewCardContentStateHolder$buildCardResultState$2);
            if (objM9620d == obj) {
                return objM9620d;
            }
        } else {
            list2 = list;
            str2 = strM17734i;
            nb8Var3 = nb8Var2;
            lessonCard3 = lessonCard2;
            if (nb8Var3 instanceof hb8) {
                reviewCardContentStateHolder$buildCardResultState$2.f32543a = null;
                reviewCardContentStateHolder$buildCardResultState$2.f32544b = null;
                reviewCardContentStateHolder$buildCardResultState$2.f32545c = null;
                reviewCardContentStateHolder$buildCardResultState$2.f32546d = z2;
                reviewCardContentStateHolder$buildCardResultState$2.f32549g = 4;
                objM9622f = m9622f(lessonCard3, map, list2, str2, reviewCardContentStateHolder$buildCardResultState$2);
                if (objM9622f == obj) {
                    return objM9622f;
                }
            } else {
                reviewCardContentStateHolder$buildCardResultState$2.f32543a = null;
                reviewCardContentStateHolder$buildCardResultState$2.f32544b = null;
                reviewCardContentStateHolder$buildCardResultState$2.f32545c = null;
                reviewCardContentStateHolder$buildCardResultState$2.f32546d = z2;
                reviewCardContentStateHolder$buildCardResultState$2.f32549g = 5;
                objM9623g = m9623g(lessonCard3, nb8Var3, map, list2, str2, z2, reviewCardContentStateHolder$buildCardResultState$2);
                if (objM9623g == obj) {
                    return objM9623g;
                }
            }
        }
        return obj;
        List list5 = (List) objM9599f;
        reviewCardContentStateHolder$buildCardResultState$2.f32543a = nb8Var;
        reviewCardContentStateHolder$buildCardResultState$2.f32544b = lessonCard;
        reviewCardContentStateHolder$buildCardResultState$2.f32545c = list5;
        reviewCardContentStateHolder$buildCardResultState$2.f32546d = z;
        reviewCardContentStateHolder$buildCardResultState$2.f32549g = 2;
        Object objM15541t = AbstractC3224d.m15541t(((C1370c) ((ig8) this.f32705b.f32467a)).f18513Y, reviewCardContentStateHolder$buildCardResultState$2);
        if (objM15541t != obj) {
            z2 = z;
            list = list5;
            objM9599f = objM15541t;
            nb8Var2 = nb8Var;
            lessonCard2 = lessonCard;
            map = (Map) objM9599f;
            str = lessonCard2.f19192o;
            if (str != null) {
                strM17734i = null;
            } else {
                strM17734i = null;
            }
            if (nb8Var2 instanceof gb8) {
                reviewCardContentStateHolder$buildCardResultState$2.f32543a = null;
                reviewCardContentStateHolder$buildCardResultState$2.f32544b = null;
                reviewCardContentStateHolder$buildCardResultState$2.f32545c = null;
                reviewCardContentStateHolder$buildCardResultState$2.f32546d = z2;
                reviewCardContentStateHolder$buildCardResultState$2.f32549g = 3;
                objM9620d = m9620d(lessonCard2, map, list, strM17734i, reviewCardContentStateHolder$buildCardResultState$2);
                if (objM9620d == obj) {
                    return objM9620d;
                }
            } else {
                list2 = list;
                str2 = strM17734i;
                nb8Var3 = nb8Var2;
                lessonCard3 = lessonCard2;
                if (nb8Var3 instanceof hb8) {
                    reviewCardContentStateHolder$buildCardResultState$2.f32543a = null;
                    reviewCardContentStateHolder$buildCardResultState$2.f32544b = null;
                    reviewCardContentStateHolder$buildCardResultState$2.f32545c = null;
                    reviewCardContentStateHolder$buildCardResultState$2.f32546d = z2;
                    reviewCardContentStateHolder$buildCardResultState$2.f32549g = 4;
                    objM9622f = m9622f(lessonCard3, map, list2, str2, reviewCardContentStateHolder$buildCardResultState$2);
                    if (objM9622f == obj) {
                        return objM9622f;
                    }
                } else {
                    reviewCardContentStateHolder$buildCardResultState$2.f32543a = null;
                    reviewCardContentStateHolder$buildCardResultState$2.f32544b = null;
                    reviewCardContentStateHolder$buildCardResultState$2.f32545c = null;
                    reviewCardContentStateHolder$buildCardResultState$2.f32546d = z2;
                    reviewCardContentStateHolder$buildCardResultState$2.f32549g = 5;
                    objM9623g = m9623g(lessonCard3, nb8Var3, map, list2, str2, z2, reviewCardContentStateHolder$buildCardResultState$2);
                    if (objM9623g == obj) {
                        return objM9623g;
                    }
                }
            }
        }
        return obj;
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: b2 */
    public final String mo4589b2() {
        return this.f32704a.mo4589b2();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX INFO: renamed from: c */
    public final Object m9619c(LessonCard lessonCard, Map map, List list, ContinuationImpl continuationImpl) throws Throwable {
        ReviewCardContentStateHolder$buildFlashcardQuestionState$1 reviewCardContentStateHolder$buildFlashcardQuestionState$1;
        LessonCard lessonCard2;
        Map map2;
        Object objM9596c;
        List list2;
        String strM21897b;
        if (continuationImpl instanceof ReviewCardContentStateHolder$buildFlashcardQuestionState$1) {
            reviewCardContentStateHolder$buildFlashcardQuestionState$1 = (ReviewCardContentStateHolder$buildFlashcardQuestionState$1) continuationImpl;
            int i = reviewCardContentStateHolder$buildFlashcardQuestionState$1.f32555f;
            if ((i & Integer.MIN_VALUE) != 0) {
                reviewCardContentStateHolder$buildFlashcardQuestionState$1.f32555f = i - Integer.MIN_VALUE;
            } else {
                reviewCardContentStateHolder$buildFlashcardQuestionState$1 = new ReviewCardContentStateHolder$buildFlashcardQuestionState$1(this, continuationImpl);
            }
        } else {
            reviewCardContentStateHolder$buildFlashcardQuestionState$1 = new ReviewCardContentStateHolder$buildFlashcardQuestionState$1(this, continuationImpl);
        }
        Object obj = reviewCardContentStateHolder$buildFlashcardQuestionState$1.f32553d;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = reviewCardContentStateHolder$buildFlashcardQuestionState$1.f32555f;
        if (i2 == 0) {
            AbstractC3193b.m15359b(obj);
            lessonCard2 = lessonCard;
            reviewCardContentStateHolder$buildFlashcardQuestionState$1.f32550a = lessonCard2;
            map2 = map;
            reviewCardContentStateHolder$buildFlashcardQuestionState$1.f32551b = map2;
            reviewCardContentStateHolder$buildFlashcardQuestionState$1.f32552c = list;
            reviewCardContentStateHolder$buildFlashcardQuestionState$1.f32555f = 1;
            objM9596c = this.f32705b.m9596c(reviewCardContentStateHolder$buildFlashcardQuestionState$1);
            if (objM9596c == coroutineSingletons) {
                return coroutineSingletons;
            }
            list2 = list;
        } else {
            if (i2 != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            list2 = reviewCardContentStateHolder$buildFlashcardQuestionState$1.f32552c;
            map2 = reviewCardContentStateHolder$buildFlashcardQuestionState$1.f32551b;
            LessonCard lessonCard3 = reviewCardContentStateHolder$buildFlashcardQuestionState$1.f32550a;
            AbstractC3193b.m15359b(obj);
            objM9596c = obj;
            lessonCard2 = lessonCard3;
        }
        u63 u63Var = (u63) objM9596c;
        ReviewCardLayoutStyle reviewCardLayoutStyle = ReviewCardLayoutStyle.FlashcardFront;
        if (u63Var.f63480a) {
            String str = lessonCard2.f19181d;
            String strM17124i = AbstractC3352my.m17124i(lessonCard2.f19178a);
            List list3 = lessonCard2.f19180c;
            if (list3.isEmpty()) {
                list3 = lessonCard2.f19179b;
            }
            strM21897b = AbstractC3352my.m17122h(str, strM17124i, list3);
        } else {
            strM21897b = t7d.m21897b(lessonCard2.f19183f);
        }
        String str2 = strM21897b;
        String strM9632p = m9632p((String) map2.get("FlashcardsFrontTransliteration"), lessonCard2);
        String strM21897b2 = u63Var.f63481b ? t7d.m21897b(lessonCard2.f19183f) : null;
        String str3 = u63Var.f63482c ? lessonCard2.f19185h : null;
        if (!u63Var.f63484e) {
            list2 = EmptyList.f47638a;
        }
        return new qc8(reviewCardLayoutStyle, null, str2, strM9632p, strM21897b2, str3, null, list2, null, u63Var.f63480a, u63Var.f63483d, null, null, m9626j(), lessonCard2.f19188k, lessonCard2.f19189l, 31042);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX INFO: renamed from: d */
    public final Object m9620d(LessonCard lessonCard, Map map, List list, String str, ContinuationImpl continuationImpl) throws Throwable {
        ReviewCardContentStateHolder$buildFlashcardResultState$1 reviewCardContentStateHolder$buildFlashcardResultState$1;
        LessonCard lessonCard2;
        Map map2;
        Object obj;
        String str2;
        List list2;
        if (continuationImpl instanceof ReviewCardContentStateHolder$buildFlashcardResultState$1) {
            reviewCardContentStateHolder$buildFlashcardResultState$1 = (ReviewCardContentStateHolder$buildFlashcardResultState$1) continuationImpl;
            int i = reviewCardContentStateHolder$buildFlashcardResultState$1.f32562g;
            if ((i & Integer.MIN_VALUE) != 0) {
                reviewCardContentStateHolder$buildFlashcardResultState$1.f32562g = i - Integer.MIN_VALUE;
            } else {
                reviewCardContentStateHolder$buildFlashcardResultState$1 = new ReviewCardContentStateHolder$buildFlashcardResultState$1(this, continuationImpl);
            }
        } else {
            reviewCardContentStateHolder$buildFlashcardResultState$1 = new ReviewCardContentStateHolder$buildFlashcardResultState$1(this, continuationImpl);
        }
        Object obj2 = reviewCardContentStateHolder$buildFlashcardResultState$1.f32560e;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = reviewCardContentStateHolder$buildFlashcardResultState$1.f32562g;
        if (i2 == 0) {
            AbstractC3193b.m15359b(obj2);
            lessonCard2 = lessonCard;
            reviewCardContentStateHolder$buildFlashcardResultState$1.f32556a = lessonCard2;
            map2 = map;
            reviewCardContentStateHolder$buildFlashcardResultState$1.f32557b = map2;
            reviewCardContentStateHolder$buildFlashcardResultState$1.f32558c = list;
            reviewCardContentStateHolder$buildFlashcardResultState$1.f32559d = str;
            reviewCardContentStateHolder$buildFlashcardResultState$1.f32562g = 1;
            Object objM9595b = this.f32705b.m9595b(reviewCardContentStateHolder$buildFlashcardResultState$1);
            if (objM9595b == coroutineSingletons) {
                return coroutineSingletons;
            }
            obj = objM9595b;
            str2 = str;
            list2 = list;
        } else {
            if (i2 != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str2 = reviewCardContentStateHolder$buildFlashcardResultState$1.f32559d;
            List list3 = reviewCardContentStateHolder$buildFlashcardResultState$1.f32558c;
            Map map3 = reviewCardContentStateHolder$buildFlashcardResultState$1.f32557b;
            LessonCard lessonCard3 = reviewCardContentStateHolder$buildFlashcardResultState$1.f32556a;
            AbstractC3193b.m15359b(obj2);
            obj = obj2;
            lessonCard2 = lessonCard3;
            list2 = list3;
            map2 = map3;
        }
        u63 u63Var = (u63) obj;
        ReviewCardLayoutStyle reviewCardLayoutStyle = ReviewCardLayoutStyle.FlashcardBack;
        String strM17122h = AbstractC3352my.m17122h(lessonCard2.f19181d, AbstractC3352my.m17124i(lessonCard2.f19178a), lessonCard2.f19180c);
        String strM9632p = m9632p((String) map2.get("FlashcardsBackTransliteration"), lessonCard2);
        String strM21897b = u63Var.f63481b ? t7d.m21897b(lessonCard2.f19183f) : null;
        String str3 = u63Var.f63482c ? lessonCard2.f19185h : null;
        String str4 = u63Var.f63485f ? str2 : null;
        if (!u63Var.f63484e) {
            list2 = EmptyList.f47638a;
        }
        return new qc8(reviewCardLayoutStyle, null, strM17122h, strM9632p, strM21897b, str3, str4, list2, null, u63Var.f63480a, u63Var.f63483d, null, null, m9626j(), lessonCard2.f19188k, lessonCard2.f19189l, 28930);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: d0 */
    public final boolean mo4590d0() {
        return this.f32704a.mo4590d0();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX INFO: renamed from: e */
    public final Object m9621e(LessonCard lessonCard, Map map, List list, ContinuationImpl continuationImpl) throws Throwable {
        C2760x2cf6c320 c2760x2cf6c320;
        LessonCard lessonCard2;
        Map map2;
        Object objM9598e;
        List list2;
        if (continuationImpl instanceof C2760x2cf6c320) {
            c2760x2cf6c320 = (C2760x2cf6c320) continuationImpl;
            int i = c2760x2cf6c320.f32568f;
            if ((i & Integer.MIN_VALUE) != 0) {
                c2760x2cf6c320.f32568f = i - Integer.MIN_VALUE;
            } else {
                c2760x2cf6c320 = new C2760x2cf6c320(this, continuationImpl);
            }
        } else {
            c2760x2cf6c320 = new C2760x2cf6c320(this, continuationImpl);
        }
        Object obj = c2760x2cf6c320.f32566d;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = c2760x2cf6c320.f32568f;
        if (i2 == 0) {
            AbstractC3193b.m15359b(obj);
            lessonCard2 = lessonCard;
            c2760x2cf6c320.f32563a = lessonCard2;
            map2 = map;
            c2760x2cf6c320.f32564b = map2;
            c2760x2cf6c320.f32565c = list;
            c2760x2cf6c320.f32568f = 1;
            objM9598e = this.f32705b.m9598e(c2760x2cf6c320);
            if (objM9598e == coroutineSingletons) {
                return coroutineSingletons;
            }
            list2 = list;
        } else {
            if (i2 != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            list2 = c2760x2cf6c320.f32565c;
            map2 = c2760x2cf6c320.f32564b;
            LessonCard lessonCard3 = c2760x2cf6c320.f32563a;
            AbstractC3193b.m15359b(obj);
            objM9598e = obj;
            lessonCard2 = lessonCard3;
        }
        u63 u63Var = (u63) objM9598e;
        ReviewCardLayoutStyle reviewCardLayoutStyle = ReviewCardLayoutStyle.FlashcardFront;
        String strM21897b = u63Var.f63481b ? t7d.m21897b(lessonCard2.f19183f) : AbstractC3352my.m17124i(lessonCard2.f19178a);
        String strM9632p = m9632p((String) map2.get("ReverseFlashcardsFrontTransliteration"), lessonCard2);
        String strM17124i = u63Var.f63480a ? AbstractC3352my.m17124i(lessonCard2.f19178a) : null;
        String str = u63Var.f63482c ? lessonCard2.f19185h : null;
        if (!u63Var.f63484e) {
            list2 = EmptyList.f47638a;
        }
        return new qc8(reviewCardLayoutStyle, null, strM21897b, strM9632p, strM17124i, str, null, list2, null, u63Var.f63480a, u63Var.f63483d, null, null, m9626j(), lessonCard2.f19188k, lessonCard2.f19189l, 31042);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX INFO: renamed from: f */
    public final Object m9622f(LessonCard lessonCard, Map map, List list, String str, ContinuationImpl continuationImpl) throws Throwable {
        ReviewCardContentStateHolder$buildFlashcardReverseResultState$1 reviewCardContentStateHolder$buildFlashcardReverseResultState$1;
        LessonCard lessonCard2;
        Map map2;
        Object obj;
        String str2;
        List list2;
        if (continuationImpl instanceof ReviewCardContentStateHolder$buildFlashcardReverseResultState$1) {
            reviewCardContentStateHolder$buildFlashcardReverseResultState$1 = (ReviewCardContentStateHolder$buildFlashcardReverseResultState$1) continuationImpl;
            int i = reviewCardContentStateHolder$buildFlashcardReverseResultState$1.f32575g;
            if ((i & Integer.MIN_VALUE) != 0) {
                reviewCardContentStateHolder$buildFlashcardReverseResultState$1.f32575g = i - Integer.MIN_VALUE;
            } else {
                reviewCardContentStateHolder$buildFlashcardReverseResultState$1 = new ReviewCardContentStateHolder$buildFlashcardReverseResultState$1(this, continuationImpl);
            }
        } else {
            reviewCardContentStateHolder$buildFlashcardReverseResultState$1 = new ReviewCardContentStateHolder$buildFlashcardReverseResultState$1(this, continuationImpl);
        }
        Object obj2 = reviewCardContentStateHolder$buildFlashcardReverseResultState$1.f32573e;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = reviewCardContentStateHolder$buildFlashcardReverseResultState$1.f32575g;
        if (i2 == 0) {
            AbstractC3193b.m15359b(obj2);
            lessonCard2 = lessonCard;
            reviewCardContentStateHolder$buildFlashcardReverseResultState$1.f32569a = lessonCard2;
            map2 = map;
            reviewCardContentStateHolder$buildFlashcardReverseResultState$1.f32570b = map2;
            reviewCardContentStateHolder$buildFlashcardReverseResultState$1.f32571c = list;
            reviewCardContentStateHolder$buildFlashcardReverseResultState$1.f32572d = str;
            reviewCardContentStateHolder$buildFlashcardReverseResultState$1.f32575g = 1;
            Object objM9597d = this.f32705b.m9597d(reviewCardContentStateHolder$buildFlashcardReverseResultState$1);
            if (objM9597d == coroutineSingletons) {
                return coroutineSingletons;
            }
            obj = objM9597d;
            str2 = str;
            list2 = list;
        } else {
            if (i2 != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str2 = reviewCardContentStateHolder$buildFlashcardReverseResultState$1.f32572d;
            List list3 = reviewCardContentStateHolder$buildFlashcardReverseResultState$1.f32571c;
            Map map3 = reviewCardContentStateHolder$buildFlashcardReverseResultState$1.f32570b;
            LessonCard lessonCard3 = reviewCardContentStateHolder$buildFlashcardReverseResultState$1.f32569a;
            AbstractC3193b.m15359b(obj2);
            obj = obj2;
            lessonCard2 = lessonCard3;
            list2 = list3;
            map2 = map3;
        }
        u63 u63Var = (u63) obj;
        ReviewCardLayoutStyle reviewCardLayoutStyle = ReviewCardLayoutStyle.FlashcardBack;
        String strM17122h = AbstractC3352my.m17122h(lessonCard2.f19181d, AbstractC3352my.m17124i(lessonCard2.f19178a), lessonCard2.f19180c);
        String strM9632p = m9632p((String) map2.get("ReverseFlashcardsBackTransliteration"), lessonCard2);
        String strM21897b = u63Var.f63481b ? t7d.m21897b(lessonCard2.f19183f) : null;
        String str3 = u63Var.f63482c ? lessonCard2.f19185h : null;
        String str4 = u63Var.f63485f ? str2 : null;
        if (!u63Var.f63484e) {
            list2 = EmptyList.f47638a;
        }
        return new qc8(reviewCardLayoutStyle, null, strM17122h, strM9632p, strM21897b, str3, str4, list2, null, u63Var.f63480a, u63Var.f63483d, null, null, m9626j(), lessonCard2.f19188k, lessonCard2.f19189l, 28930);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX INFO: renamed from: g */
    public final Object m9623g(LessonCard lessonCard, nb8 nb8Var, Map map, List list, String str, boolean z, ContinuationImpl continuationImpl) throws Throwable {
        ReviewCardContentStateHolder$buildQuizResultState$1 reviewCardContentStateHolder$buildQuizResultState$1;
        LessonCard lessonCard2;
        Map map2;
        Object objM15541t;
        List list2;
        String str2;
        boolean z2;
        nb8 nb8Var2;
        String strM9632p;
        String strName;
        if (continuationImpl instanceof ReviewCardContentStateHolder$buildQuizResultState$1) {
            reviewCardContentStateHolder$buildQuizResultState$1 = (ReviewCardContentStateHolder$buildQuizResultState$1) continuationImpl;
            int i = reviewCardContentStateHolder$buildQuizResultState$1.f32584i;
            if ((i & Integer.MIN_VALUE) != 0) {
                reviewCardContentStateHolder$buildQuizResultState$1.f32584i = i - Integer.MIN_VALUE;
            } else {
                reviewCardContentStateHolder$buildQuizResultState$1 = new ReviewCardContentStateHolder$buildQuizResultState$1(this, continuationImpl);
            }
        } else {
            reviewCardContentStateHolder$buildQuizResultState$1 = new ReviewCardContentStateHolder$buildQuizResultState$1(this, continuationImpl);
        }
        Object obj = reviewCardContentStateHolder$buildQuizResultState$1.f32582g;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = reviewCardContentStateHolder$buildQuizResultState$1.f32584i;
        if (i2 == 0) {
            AbstractC3193b.m15359b(obj);
            lessonCard2 = lessonCard;
            reviewCardContentStateHolder$buildQuizResultState$1.f32576a = lessonCard2;
            reviewCardContentStateHolder$buildQuizResultState$1.f32577b = nb8Var;
            map2 = map;
            reviewCardContentStateHolder$buildQuizResultState$1.f32578c = map2;
            reviewCardContentStateHolder$buildQuizResultState$1.f32579d = list;
            reviewCardContentStateHolder$buildQuizResultState$1.f32580e = str;
            reviewCardContentStateHolder$buildQuizResultState$1.f32581f = z;
            reviewCardContentStateHolder$buildQuizResultState$1.f32584i = 1;
            objM15541t = AbstractC3224d.m15541t(((C1370c) ((ig8) this.f32705b.f32467a)).f18554t0, reviewCardContentStateHolder$buildQuizResultState$1);
            if (objM15541t == coroutineSingletons) {
                return coroutineSingletons;
            }
            list2 = list;
            str2 = str;
            z2 = z;
            nb8Var2 = nb8Var;
        } else {
            if (i2 != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            boolean z3 = reviewCardContentStateHolder$buildQuizResultState$1.f32581f;
            String str3 = reviewCardContentStateHolder$buildQuizResultState$1.f32580e;
            List list3 = reviewCardContentStateHolder$buildQuizResultState$1.f32579d;
            Map map3 = reviewCardContentStateHolder$buildQuizResultState$1.f32578c;
            nb8Var2 = reviewCardContentStateHolder$buildQuizResultState$1.f32577b;
            LessonCard lessonCard3 = reviewCardContentStateHolder$buildQuizResultState$1.f32576a;
            AbstractC3193b.m15359b(obj);
            objM15541t = obj;
            lessonCard2 = lessonCard3;
            z2 = z3;
            str2 = str3;
            list2 = list3;
            map2 = map3;
        }
        Map map4 = (Map) objM15541t;
        ReviewCardLayoutStyle reviewCardLayoutStyle = ReviewCardLayoutStyle.QuizResult;
        String strM17122h = AbstractC3352my.m17122h(lessonCard2.f19181d, AbstractC3352my.m17124i(lessonCard2.f19178a), lessonCard2.f19180c);
        boolean z4 = nb8Var2 instanceof db8;
        if (z4) {
            strM9632p = m9632p((String) map2.get("ClozeBackTransliteration"), lessonCard2);
        } else {
            strM9632p = ((nb8Var2 instanceof eb8) || (nb8Var2 instanceof fb8)) ? m9632p((String) map2.get("DictationChoiceBackTransliteration"), lessonCard2) : m9632p((String) map2.get("MultipleChoiceBackTransliteration"), lessonCard2);
        }
        String str4 = strM9632p;
        String strM21897b = t7d.m21897b(lessonCard2.f19183f);
        String str5 = lessonCard2.f19185h;
        if (z4) {
            strName = i19.m13627a(ViewKeys.Cloze).name();
        } else {
            strName = ((nb8Var2 instanceof eb8) || (nb8Var2 instanceof fb8)) ? i19.m13627a(ViewKeys.Dictation).name() : i19.m13627a(ViewKeys.MultipleChoice).name();
        }
        return new qc8(reviewCardLayoutStyle, null, strM17122h, str4, strM21897b, str5, str2, list2, null, z2, !fa4.m11650l(map4.get(strName), Boolean.FALSE), (ReviewActivityResult) ((xc9) this.f32718o).getValue(), (String) ((xc9) this.f32719p).getValue(), m9626j(), lessonCard2.f19188k, lessonCard2.f19189l, 258);
    }

    /* JADX INFO: renamed from: h */
    public final LessonCard m9624h() {
        return (LessonCard) ((xc9) this.f32716m).getValue();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: h0 */
    public final Object mo4591h0(ProfileAccount profileAccount, Continuation continuation) {
        return this.f32704a.mo4591h0(profileAccount, continuation);
    }

    /* JADX INFO: renamed from: i */
    public final void m9625i(eg8 eg8Var) {
        eg8Var.getClass();
        t66 t66Var = this.f32721r;
        if (((Boolean) ((xc9) t66Var).getValue()).booleanValue()) {
            return;
        }
        ((xc9) t66Var).setValue(Boolean.TRUE);
        wfb.m23926u(this.f32715l, this.f32714k, null, new ReviewCardContentStateHolder$ensureCardReviewed$1(this, eg8Var, null), 2);
    }

    /* JADX INFO: renamed from: j */
    public final vs3 m9626j() {
        return (vs3) ((xc9) this.f32722s).getValue();
    }

    /* JADX INFO: renamed from: k */
    public final boolean m9627k() {
        return ((Boolean) ((xc9) this.f32720q).getValue()).booleanValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: l */
    public final Object m9628l(String str, ContinuationImpl continuationImpl) throws Throwable {
        ReviewCardContentStateHolder$increaseCardStatusIfEligible$1 reviewCardContentStateHolder$increaseCardStatusIfEligible$1;
        int i;
        if (continuationImpl instanceof ReviewCardContentStateHolder$increaseCardStatusIfEligible$1) {
            reviewCardContentStateHolder$increaseCardStatusIfEligible$1 = (ReviewCardContentStateHolder$increaseCardStatusIfEligible$1) continuationImpl;
            int i2 = reviewCardContentStateHolder$increaseCardStatusIfEligible$1.f32591d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                reviewCardContentStateHolder$increaseCardStatusIfEligible$1.f32591d = i2 - Integer.MIN_VALUE;
            } else {
                reviewCardContentStateHolder$increaseCardStatusIfEligible$1 = new ReviewCardContentStateHolder$increaseCardStatusIfEligible$1(this, continuationImpl);
            }
        } else {
            reviewCardContentStateHolder$increaseCardStatusIfEligible$1 = new ReviewCardContentStateHolder$increaseCardStatusIfEligible$1(this, continuationImpl);
        }
        Object objM15541t = reviewCardContentStateHolder$increaseCardStatusIfEligible$1.f32589b;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = reviewCardContentStateHolder$increaseCardStatusIfEligible$1.f32591d;
        xfa xfaVar = xfa.f68157a;
        if (i3 == 0) {
            AbstractC3193b.m15359b(objM15541t);
            String strMo4589b2 = this.f32704a.mo4589b2();
            strMo4589b2.getClass();
            str.getClass();
            c83 c83VarM7121k = ((C1287c) ((ao0) this.f32706c.f10194b)).m7121k(strMo4589b2, str);
            reviewCardContentStateHolder$increaseCardStatusIfEligible$1.f32588a = str;
            reviewCardContentStateHolder$increaseCardStatusIfEligible$1.f32591d = 1;
            objM15541t = AbstractC3224d.m15541t(c83VarM7121k, reviewCardContentStateHolder$increaseCardStatusIfEligible$1);
            if (objM15541t != obj) {
            }
            return obj;
        }
        if (i3 != 1) {
            if (i3 == 2) {
                AbstractC3193b.m15359b(objM15541t);
                return xfaVar;
            }
            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        str = reviewCardContentStateHolder$increaseCardStatusIfEligible$1.f32588a;
        AbstractC3193b.m15359b(objM15541t);
        LessonCard lessonCard = (LessonCard) objM15541t;
        if (lessonCard != null && (i = lessonCard.f19188k) < CardStatus.Known.getValue()) {
            Integer num = new Integer(this.f32723t);
            reviewCardContentStateHolder$increaseCardStatusIfEligible$1.f32588a = null;
            reviewCardContentStateHolder$increaseCardStatusIfEligible$1.f32591d = 2;
            if (m9633q(str, i + 1, num, reviewCardContentStateHolder$increaseCardStatusIfEligible$1) == obj) {
                return obj;
            }
        }
        return xfaVar;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:43:0x00e8 A[LOOP:0: B:41:0x00e2->B:43:0x00e8, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: m */
    public final Object m9629m(LessonCard lessonCard, db8 db8Var, ContinuationImpl continuationImpl) throws Throwable {
        ReviewCardContentStateHolder$loadClozeTest$1 reviewCardContentStateHolder$loadClozeTest$1;
        sc8 sc8Var;
        Object objM2861d;
        sc8 sc8Var2;
        db8 db8Var2;
        LessonSentence lessonSentence;
        String str;
        String str2;
        ArrayList arrayList;
        String str3;
        if (continuationImpl instanceof ReviewCardContentStateHolder$loadClozeTest$1) {
            reviewCardContentStateHolder$loadClozeTest$1 = (ReviewCardContentStateHolder$loadClozeTest$1) continuationImpl;
            int i = reviewCardContentStateHolder$loadClozeTest$1.f32597f;
            if ((i & Integer.MIN_VALUE) != 0) {
                reviewCardContentStateHolder$loadClozeTest$1.f32597f = i - Integer.MIN_VALUE;
            } else {
                reviewCardContentStateHolder$loadClozeTest$1 = new ReviewCardContentStateHolder$loadClozeTest$1(this, continuationImpl);
            }
        } else {
            reviewCardContentStateHolder$loadClozeTest$1 = new ReviewCardContentStateHolder$loadClozeTest$1(this, continuationImpl);
        }
        Object objM7414h = reviewCardContentStateHolder$loadClozeTest$1.f32595d;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = reviewCardContentStateHolder$loadClozeTest$1.f32597f;
        if (i2 == 0) {
            AbstractC3193b.m15359b(objM7414h);
            String strMo4589b2 = this.f32704a.mo4589b2();
            int i3 = lessonCard.f19186i;
            reviewCardContentStateHolder$loadClozeTest$1.f32592a = lessonCard;
            reviewCardContentStateHolder$loadClozeTest$1.f32593b = db8Var;
            reviewCardContentStateHolder$loadClozeTest$1.f32597f = 1;
            objM7414h = ((C1308x) this.f32707d.f63241a).m7414h(i3, strMo4589b2, reviewCardContentStateHolder$loadClozeTest$1);
            if (objM7414h != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            db8Var = reviewCardContentStateHolder$loadClozeTest$1.f32593b;
            lessonCard = reviewCardContentStateHolder$loadClozeTest$1.f32592a;
            AbstractC3193b.m15359b(objM7414h);
        } else {
            if (i2 != 2) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            sc8Var2 = reviewCardContentStateHolder$loadClozeTest$1.f32594c;
            db8Var2 = reviewCardContentStateHolder$loadClozeTest$1.f32593b;
            AbstractC3193b.m15359b(objM7414h);
        }
        lessonSentence = (LessonSentence) objM7414h;
        str = "";
        if (lessonSentence != null || (str2 = lessonSentence.f19255c) == null) {
            str2 = "";
        }
        List<String> listM15429h = new Regex("\\s+").m15429h(str2);
        arrayList = new ArrayList(v91.m23189q0(listM15429h, 10));
        for (String str4 : listM15429h) {
            arrayList.add(new i41(ux5.m22990m(str4, " "), fa4.m11650l(str4, db8Var2.f35361b)));
        }
        sc8Var2.getClass();
        sc8Var2.f60684b = arrayList;
        if (lessonSentence != null && (str3 = lessonSentence.f19255c) != null) {
            str = str3;
        }
        sc8Var2.f60683a = str;
        return sc8Var2;
        ym5 ym5Var = (ym5) objM7414h;
        ym5Var.getClass();
        if (!(ym5Var instanceof xm5) || (sc8Var = (sc8) pk9.m19381x(ym5Var)) == null) {
            return null;
        }
        if (!sc8Var.f60684b.isEmpty()) {
            return sc8Var;
        }
        String str5 = lessonCard.f19178a;
        int i4 = this.f32723t;
        reviewCardContentStateHolder$loadClozeTest$1.f32592a = null;
        reviewCardContentStateHolder$loadClozeTest$1.f32593b = db8Var;
        reviewCardContentStateHolder$loadClozeTest$1.f32594c = sc8Var;
        reviewCardContentStateHolder$loadClozeTest$1.f32597f = 2;
        ao0 ao0Var = this.f32708e.f57897a;
        if (i4 == -1) {
            q05 q05Var = (q05) ((C1287c) ao0Var).f16455d;
            objM2861d = AbstractC0758a.m2861d(new ke2(25, str5, q05Var), q05Var.f57071K, reviewCardContentStateHolder$loadClozeTest$1, true, false);
        } else {
            q05 q05Var2 = (q05) ((C1287c) ao0Var).f16455d;
            objM2861d = AbstractC0758a.m2861d(new ek2(i4, str5, q05Var2, 3), q05Var2.f57071K, reviewCardContentStateHolder$loadClozeTest$1, true, false);
        }
        if (objM2861d != coroutineSingletons) {
            objM7414h = objM2861d;
            sc8Var2 = sc8Var;
            db8Var2 = db8Var;
            lessonSentence = (LessonSentence) objM7414h;
            str = "";
            if (lessonSentence != null) {
                str2 = "";
            } else {
                str2 = "";
            }
            List<String> listM15429h2 = new Regex("\\s+").m15429h(str2);
            arrayList = new ArrayList(v91.m23189q0(listM15429h2, 10));
            while (r0.hasNext()) {
                arrayList.add(new i41(ux5.m22990m(str4, " "), fa4.m11650l(str4, db8Var2.f35361b)));
            }
            sc8Var2.getClass();
            sc8Var2.f60684b = arrayList;
            if (lessonSentence != null) {
                str = str3;
            }
            sc8Var2.f60683a = str;
            return sc8Var2;
        }
        return coroutineSingletons;
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: m0 */
    public final boolean mo4592m0() {
        return this.f32704a.mo4592m0();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: n */
    public final Object m9630n(nb8 nb8Var, LessonCard lessonCard, ContinuationImpl continuationImpl) {
        ReviewCardContentStateHolder$maybeAutoPlay$1 reviewCardContentStateHolder$maybeAutoPlay$1;
        boolean zM11650l;
        if (continuationImpl instanceof ReviewCardContentStateHolder$maybeAutoPlay$1) {
            reviewCardContentStateHolder$maybeAutoPlay$1 = (ReviewCardContentStateHolder$maybeAutoPlay$1) continuationImpl;
            int i = reviewCardContentStateHolder$maybeAutoPlay$1.f32602e;
            if ((i & Integer.MIN_VALUE) != 0) {
                reviewCardContentStateHolder$maybeAutoPlay$1.f32602e = i - Integer.MIN_VALUE;
            } else {
                reviewCardContentStateHolder$maybeAutoPlay$1 = new ReviewCardContentStateHolder$maybeAutoPlay$1(this, continuationImpl);
            }
        } else {
            reviewCardContentStateHolder$maybeAutoPlay$1 = new ReviewCardContentStateHolder$maybeAutoPlay$1(this, continuationImpl);
        }
        Object objM15541t = reviewCardContentStateHolder$maybeAutoPlay$1.f32600c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = reviewCardContentStateHolder$maybeAutoPlay$1.f32602e;
        boolean zM9627k = true;
        if (i2 == 0) {
            AbstractC3193b.m15359b(objM15541t);
            reviewCardContentStateHolder$maybeAutoPlay$1.f32598a = nb8Var;
            reviewCardContentStateHolder$maybeAutoPlay$1.f32599b = lessonCard;
            reviewCardContentStateHolder$maybeAutoPlay$1.f32602e = 1;
            objM15541t = AbstractC3224d.m15541t(((C1370c) ((ig8) this.f32705b.f32467a)).f18552s0, reviewCardContentStateHolder$maybeAutoPlay$1);
            if (objM15541t == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            lessonCard = reviewCardContentStateHolder$maybeAutoPlay$1.f32599b;
            nb8Var = reviewCardContentStateHolder$maybeAutoPlay$1.f32598a;
            AbstractC3193b.m15359b(objM15541t);
        }
        Map map = (Map) objM15541t;
        boolean z = nb8Var instanceof gb8;
        if (z) {
            zM11650l = fa4.m11650l(map.get("Flashcards"), Boolean.TRUE);
        } else if (nb8Var instanceof hb8) {
            zM11650l = fa4.m11650l(map.get("ReverseFlashcards"), Boolean.TRUE);
        } else if ((nb8Var instanceof jb8) || (nb8Var instanceof kb8)) {
            zM11650l = fa4.m11650l(map.get("MultipleChoice"), Boolean.TRUE);
        } else if ((nb8Var instanceof eb8) || (nb8Var instanceof fb8)) {
            zM11650l = fa4.m11650l(map.get("Dictation"), Boolean.TRUE);
        } else {
            zM11650l = nb8Var instanceof db8 ? fa4.m11650l(map.get("Cloze"), Boolean.TRUE) : false;
        }
        if (zM11650l) {
            if (z) {
                if (m9627k()) {
                    zM9627k = false;
                }
            } else if (nb8Var instanceof hb8) {
                zM9627k = m9627k();
            } else {
                if ((nb8Var instanceof jb8) || (nb8Var instanceof eb8) || (nb8Var instanceof fb8)) {
                    if (m9627k()) {
                    }
                } else if (!(nb8Var instanceof db8)) {
                    boolean z2 = nb8Var instanceof kb8;
                }
                zM9627k = false;
            }
            if (zM9627k) {
                return AbstractC3352my.m17124i(lessonCard.f19178a);
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:50:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:53:0x0111  */
    /* JADX WARN: Code duplicated, block: B:57:0x0125  */
    /* JADX WARN: Code duplicated, block: B:88:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code duplicated, block: B:90:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:91:0x01c2  */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00e7, code lost:
    
        if (r12 == r0) goto L52;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [nb8] */
    /* JADX WARN: Type inference failed for: r10v1, types: [nb8] */
    /* JADX WARN: Type inference failed for: r10v19 */
    /* JADX WARN: Type inference failed for: r10v24 */
    /* JADX WARN: Type inference failed for: r10v25 */
    /* JADX WARN: Type inference failed for: r10v26 */
    /* JADX WARN: Type inference failed for: r10v27 */
    /* JADX WARN: Type inference failed for: r10v28 */
    /* JADX WARN: Type inference failed for: r10v29 */
    /* JADX WARN: Type inference failed for: r10v3, types: [nb8] */
    /* JADX WARN: Type inference failed for: r10v30 */
    /* JADX WARN: Type inference failed for: r10v31 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4, types: [com.lingq.feature.review.state.a] */
    /* JADX WARN: Type inference failed for: r12v17 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v6, types: [com.lingq.feature.review.state.a] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9, types: [com.lingq.feature.review.state.a] */
    /* JADX WARN: Type inference failed for: r2v1, types: [nb8] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r9v0, types: [com.lingq.feature.review.state.a] */
    /* JADX INFO: renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m9631o(nb8 nb8Var, boolean z, ContinuationImpl continuationImpl) {
        ReviewCardContentStateHolder$renderActivity$1 reviewCardContentStateHolder$renderActivity$1;
        ?? r10;
        LessonCard lessonCard;
        boolean z2;
        sc8 sc8Var;
        ?? r11;
        ?? r3;
        boolean z3;
        ?? r12;
        ?? r13;
        LessonCard lessonCard2;
        ?? r1;
        ?? r2;
        ?? r14;
        ?? r15;
        ad8 uc8Var;
        ?? r4;
        ?? r16;
        cd8 cd8Var;
        ?? r5;
        if (continuationImpl instanceof ReviewCardContentStateHolder$renderActivity$1) {
            reviewCardContentStateHolder$renderActivity$1 = (ReviewCardContentStateHolder$renderActivity$1) continuationImpl;
            int i = reviewCardContentStateHolder$renderActivity$1.f32609g;
            if ((i & Integer.MIN_VALUE) != 0) {
                reviewCardContentStateHolder$renderActivity$1.f32609g = i - Integer.MIN_VALUE;
            } else {
                reviewCardContentStateHolder$renderActivity$1 = new ReviewCardContentStateHolder$renderActivity$1(this, continuationImpl);
            }
        } else {
            reviewCardContentStateHolder$renderActivity$1 = new ReviewCardContentStateHolder$renderActivity$1(this, continuationImpl);
        }
        ReviewCardContentStateHolder$renderActivity$1 reviewCardContentStateHolder$renderActivity$2 = reviewCardContentStateHolder$renderActivity$1;
        Object objM15541t = reviewCardContentStateHolder$renderActivity$2.f32607e;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = reviewCardContentStateHolder$renderActivity$2.f32609g;
        if (i2 == 0) {
            AbstractC3193b.m15359b(objM15541t);
            eg8 eg8Var = nb8Var instanceof eg8 ? (eg8) nb8Var : null;
            if (eg8Var != null) {
                String strMo4589b2 = this.f32704a.mo4589b2();
                String str = eg8Var.mo10270a().f64672b;
                strMo4589b2.getClass();
                str.getClass();
                c83 c83VarM7121k = ((C1287c) ((ao0) this.f32706c.f10194b)).m7121k(strMo4589b2, str);
                reviewCardContentStateHolder$renderActivity$2.f32603a = nb8Var;
                reviewCardContentStateHolder$renderActivity$2.f32606d = z;
                reviewCardContentStateHolder$renderActivity$2.f32609g = 1;
                objM15541t = AbstractC3224d.m15541t(c83VarM7121k, reviewCardContentStateHolder$renderActivity$2);
                if (objM15541t != coroutineSingletons) {
                }
                r10 = nb8Var;
                r15 = r13;
                return coroutineSingletons;
            }
            return null;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                z3 = reviewCardContentStateHolder$renderActivity$2.f32606d;
                C2761a c2761a = reviewCardContentStateHolder$renderActivity$2.f32605c;
                lessonCard = reviewCardContentStateHolder$renderActivity$2.f32604b;
                nb8 nb8Var2 = reviewCardContentStateHolder$renderActivity$2.f32603a;
                AbstractC3193b.m15359b(objM15541t);
                r3 = nb8Var2;
                r12 = c2761a;
                sc8Var = (sc8) objM15541t;
                z2 = z3;
                r13 = r3;
                r11 = r12;
                lessonCard2 = lessonCard;
                ((xc9) r11.f32717n).setValue(sc8Var);
                if (m9627k()) {
                    reviewCardContentStateHolder$renderActivity$2.f32603a = r13;
                    reviewCardContentStateHolder$renderActivity$2.f32604b = null;
                    reviewCardContentStateHolder$renderActivity$2.f32605c = null;
                    reviewCardContentStateHolder$renderActivity$2.f32606d = z2;
                    reviewCardContentStateHolder$renderActivity$2.f32609g = 3;
                    objM15541t = m9618b(r13, lessonCard2, z2, reviewCardContentStateHolder$renderActivity$2);
                } else {
                    sc8 sc8Var2 = (sc8) ((xc9) this.f32717n).getValue();
                    reviewCardContentStateHolder$renderActivity$2.f32603a = r13;
                    reviewCardContentStateHolder$renderActivity$2.f32604b = null;
                    reviewCardContentStateHolder$renderActivity$2.f32605c = null;
                    reviewCardContentStateHolder$renderActivity$2.f32606d = z2;
                    reviewCardContentStateHolder$renderActivity$2.f32609g = 4;
                    r1 = this;
                    r2 = r13;
                    objM15541t = r1.m9617a(r2, lessonCard2, sc8Var2, z2, reviewCardContentStateHolder$renderActivity$2);
                    if (objM15541t != coroutineSingletons) {
                        r14 = r2;
                        r5 = r1;
                        uc8Var = new tc8((qc8) objM15541t);
                        r4 = r5;
                        r16 = r14;
                        if (!(r16 instanceof gb8)) {
                            if (r4.m9627k()) {
                                cd8Var = new cd8(new bd8(R$string.activities_incorrect, ha8.f42095a, 12), new bd8(R$string.activities_correct, ba8.f8229a, 4), (ie8) null, 10);
                            } else {
                                cd8Var = new cd8((bd8) null, new bd8(R$string.activities_flip_card, ga8.f40464a, 4), (ie8) null, 11);
                            }
                        } else if (r4.m9627k()) {
                            cd8Var = new cd8(new bd8(R$string.activities_incorrect, ha8.f42095a, 12), new bd8(R$string.activities_correct, ba8.f8229a, 4), (ie8) null, 10);
                        } else {
                            cd8Var = new cd8((bd8) null, new bd8(R$string.activities_flip_card, ga8.f40464a, 4), (ie8) null, 11);
                        }
                        return new kc8(uc8Var, cd8Var);
                    }
                }
                r10 = nb8Var;
                r15 = r13;
                return coroutineSingletons;
            }
            if (i2 == 3) {
                nb8 nb8Var3 = reviewCardContentStateHolder$renderActivity$2.f32603a;
                AbstractC3193b.m15359b(objM15541t);
                r15 = nb8Var3;
                r15 = r13;
                uc8Var = new uc8((qc8) objM15541t);
                r4 = this;
                r16 = r15;
                if (!(r16 instanceof gb8)) {
                    if (r4.m9627k()) {
                        cd8Var = new cd8(new bd8(R$string.activities_incorrect, ha8.f42095a, 12), new bd8(R$string.activities_correct, ba8.f8229a, 4), (ie8) null, 10);
                    } else {
                        cd8Var = new cd8((bd8) null, new bd8(R$string.activities_flip_card, ga8.f40464a, 4), (ie8) null, 11);
                    }
                } else if (r4.m9627k()) {
                    cd8Var = new cd8(new bd8(R$string.activities_incorrect, ha8.f42095a, 12), new bd8(R$string.activities_correct, ba8.f8229a, 4), (ie8) null, 10);
                } else {
                    cd8Var = new cd8((bd8) null, new bd8(R$string.activities_flip_card, ga8.f40464a, 4), (ie8) null, 11);
                }
                return new kc8(uc8Var, cd8Var);
            }
            if (i2 != 4) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            nb8 nb8Var4 = reviewCardContentStateHolder$renderActivity$2.f32603a;
            AbstractC3193b.m15359b(objM15541t);
            r5 = this;
            r14 = nb8Var4;
            uc8Var = new tc8((qc8) objM15541t);
            r4 = r5;
            r16 = r14;
            if (!(r16 instanceof gb8) && !(r16 instanceof hb8)) {
                boolean z4 = r16 instanceof db8;
                fa8 fa8Var = fa8.f38724a;
                if (z4 || (r16 instanceof jb8) || (r16 instanceof kb8) || (r16 instanceof eb8) || (r16 instanceof fb8)) {
                    cd8Var = r4.m9627k() ? new cd8((bd8) null, new bd8(com.lingq.core.p012ui.R$string.ui_continue, aa8.f426a, 4), (ie8) null, 11) : new cd8(new bd8(R$string.activities_skip_activity, fa8Var, 12), (bd8) null, (ie8) null, 14);
                } else if ((r16 instanceof ib8) || (r16 instanceof lb8)) {
                    cd8Var = new cd8(new bd8(R$string.activities_skip_activity, fa8Var, 12), (bd8) null, (ie8) null, 14);
                } else if (r16 instanceof mb8) {
                    cd8Var = new cd8(new bd8(R$string.activities_skip_activity, fa8Var, 12), new bd8(R$string.activities_submit_answer, wa8.f66566a, 4), (ie8) null, 10);
                } else {
                    if (r16 != 0) {
                        gm5.m12750e();
                        return null;
                    }
                    cd8Var = new cd8((bd8) null, (bd8) null, (ie8) null, 15);
                }
            } else if (r4.m9627k()) {
                cd8Var = new cd8(new bd8(R$string.activities_incorrect, ha8.f42095a, 12), new bd8(R$string.activities_correct, ba8.f8229a, 4), (ie8) null, 10);
            } else {
                cd8Var = new cd8((bd8) null, new bd8(R$string.activities_flip_card, ga8.f40464a, 4), (ie8) null, 11);
            }
            return new kc8(uc8Var, cd8Var);
        }
        z = reviewCardContentStateHolder$renderActivity$2.f32606d;
        nb8 nb8Var5 = reviewCardContentStateHolder$renderActivity$2.f32603a;
        AbstractC3193b.m15359b(objM15541t);
        r10 = nb8Var5;
        r10 = nb8Var;
        lessonCard = (LessonCard) objM15541t;
        if (lessonCard != null) {
            ((xc9) this.f32716m).setValue(lessonCard);
            if (!(r10 instanceof db8) || m9627k()) {
                z2 = z;
                sc8Var = null;
                r11 = this;
                r13 = r10;
                lessonCard2 = lessonCard;
                ((xc9) r11.f32717n).setValue(sc8Var);
                if (m9627k()) {
                    reviewCardContentStateHolder$renderActivity$2.f32603a = r13;
                    reviewCardContentStateHolder$renderActivity$2.f32604b = null;
                    reviewCardContentStateHolder$renderActivity$2.f32605c = null;
                    reviewCardContentStateHolder$renderActivity$2.f32606d = z2;
                    reviewCardContentStateHolder$renderActivity$2.f32609g = 3;
                    objM15541t = m9618b(r13, lessonCard2, z2, reviewCardContentStateHolder$renderActivity$2);
                } else {
                    sc8 sc8Var3 = (sc8) ((xc9) this.f32717n).getValue();
                    reviewCardContentStateHolder$renderActivity$2.f32603a = r13;
                    reviewCardContentStateHolder$renderActivity$2.f32604b = null;
                    reviewCardContentStateHolder$renderActivity$2.f32605c = null;
                    reviewCardContentStateHolder$renderActivity$2.f32606d = z2;
                    reviewCardContentStateHolder$renderActivity$2.f32609g = 4;
                    r1 = this;
                    r2 = r13;
                    objM15541t = r1.m9617a(r2, lessonCard2, sc8Var3, z2, reviewCardContentStateHolder$renderActivity$2);
                    if (objM15541t != coroutineSingletons) {
                        r14 = r2;
                        r5 = r1;
                        uc8Var = new tc8((qc8) objM15541t);
                        r4 = r5;
                        r16 = r14;
                        if (!(r16 instanceof gb8)) {
                            if (r4.m9627k()) {
                                cd8Var = new cd8(new bd8(R$string.activities_incorrect, ha8.f42095a, 12), new bd8(R$string.activities_correct, ba8.f8229a, 4), (ie8) null, 10);
                            } else {
                                cd8Var = new cd8((bd8) null, new bd8(R$string.activities_flip_card, ga8.f40464a, 4), (ie8) null, 11);
                            }
                        } else if (r4.m9627k()) {
                            cd8Var = new cd8(new bd8(R$string.activities_incorrect, ha8.f42095a, 12), new bd8(R$string.activities_correct, ba8.f8229a, 4), (ie8) null, 10);
                        } else {
                            cd8Var = new cd8((bd8) null, new bd8(R$string.activities_flip_card, ga8.f40464a, 4), (ie8) null, 11);
                        }
                        return new kc8(uc8Var, cd8Var);
                    }
                }
            } else {
                reviewCardContentStateHolder$renderActivity$2.f32603a = r10;
                reviewCardContentStateHolder$renderActivity$2.f32604b = lessonCard;
                reviewCardContentStateHolder$renderActivity$2.f32605c = this;
                reviewCardContentStateHolder$renderActivity$2.f32606d = z;
                reviewCardContentStateHolder$renderActivity$2.f32609g = 2;
                objM15541t = m9629m(lessonCard, (db8) r10, reviewCardContentStateHolder$renderActivity$2);
                if (objM15541t != coroutineSingletons) {
                    r3 = r10;
                    z3 = z;
                    r12 = this;
                    sc8Var = (sc8) objM15541t;
                    z2 = z3;
                    r13 = r3;
                    r11 = r12;
                    lessonCard2 = lessonCard;
                    ((xc9) r11.f32717n).setValue(sc8Var);
                    if (m9627k()) {
                        reviewCardContentStateHolder$renderActivity$2.f32603a = r13;
                        reviewCardContentStateHolder$renderActivity$2.f32604b = null;
                        reviewCardContentStateHolder$renderActivity$2.f32605c = null;
                        reviewCardContentStateHolder$renderActivity$2.f32606d = z2;
                        reviewCardContentStateHolder$renderActivity$2.f32609g = 3;
                        objM15541t = m9618b(r13, lessonCard2, z2, reviewCardContentStateHolder$renderActivity$2);
                    } else {
                        sc8 sc8Var4 = (sc8) ((xc9) this.f32717n).getValue();
                        reviewCardContentStateHolder$renderActivity$2.f32603a = r13;
                        reviewCardContentStateHolder$renderActivity$2.f32604b = null;
                        reviewCardContentStateHolder$renderActivity$2.f32605c = null;
                        reviewCardContentStateHolder$renderActivity$2.f32606d = z2;
                        reviewCardContentStateHolder$renderActivity$2.f32609g = 4;
                        r1 = this;
                        r2 = r13;
                        objM15541t = r1.m9617a(r2, lessonCard2, sc8Var4, z2, reviewCardContentStateHolder$renderActivity$2);
                        if (objM15541t != coroutineSingletons) {
                            r14 = r2;
                            r5 = r1;
                            uc8Var = new tc8((qc8) objM15541t);
                            r4 = r5;
                            r16 = r14;
                            if (!(r16 instanceof gb8)) {
                                if (r4.m9627k()) {
                                    cd8Var = new cd8(new bd8(R$string.activities_incorrect, ha8.f42095a, 12), new bd8(R$string.activities_correct, ba8.f8229a, 4), (ie8) null, 10);
                                } else {
                                    cd8Var = new cd8((bd8) null, new bd8(R$string.activities_flip_card, ga8.f40464a, 4), (ie8) null, 11);
                                }
                            } else if (r4.m9627k()) {
                                cd8Var = new cd8(new bd8(R$string.activities_incorrect, ha8.f42095a, 12), new bd8(R$string.activities_correct, ba8.f8229a, 4), (ie8) null, 10);
                            } else {
                                cd8Var = new cd8((bd8) null, new bd8(R$string.activities_flip_card, ga8.f40464a, 4), (ie8) null, 11);
                            }
                            return new kc8(uc8Var, cd8Var);
                        }
                    }
                }
            }
            r10 = nb8Var;
            r15 = r13;
            return coroutineSingletons;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0034  */
    /* JADX WARN: Code duplicated, block: B:57:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:59:0x00df  */
    /* JADX INFO: renamed from: p */
    public final String m9632p(String str, LessonCard lessonCard) {
        String lowerCase;
        String lowerCase2;
        LessonTransliteration lessonTransliterationM8041i;
        String lowerCase3;
        String lowerCase4;
        cma cmaVar = this.f32704a;
        String strMo4589b2 = cmaVar.mo4589b2();
        String str2 = "";
        if (fa4.m11650l(strMo4589b2, LanguageLearn.Mandarin.getCode())) {
            if (str != null) {
                lowerCase4 = str.toLowerCase(Locale.ROOT);
                lowerCase4.getClass();
            } else {
                lowerCase4 = null;
            }
            if (fa4.m11650l(lowerCase4, "pinyin")) {
                LessonTransliteration lessonTransliterationM8041i2 = lessonCard.m8041i();
                if (lessonTransliterationM8041i2 != null) {
                    str2 = lessonTransliterationM8041i2.f19301c;
                } else {
                    str2 = null;
                }
            } else if (fa4.m11650l(lowerCase4, "traditional")) {
                LessonTransliteration lessonTransliterationM8041i3 = lessonCard.m8041i();
                if (lessonTransliterationM8041i3 != null) {
                    str2 = lessonTransliterationM8041i3.f19302d;
                } else {
                    str2 = null;
                }
            }
        } else if (fa4.m11650l(strMo4589b2, LanguageLearn.ChineseTraditional.getCode())) {
            if (str != null) {
                lowerCase3 = str.toLowerCase(Locale.ROOT);
                lowerCase3.getClass();
            } else {
                lowerCase3 = null;
            }
            if (fa4.m11650l(lowerCase3, "pinyin")) {
                LessonTransliteration lessonTransliterationM8041i4 = lessonCard.m8041i();
                if (lessonTransliterationM8041i4 != null) {
                    str2 = lessonTransliterationM8041i4.f19301c;
                } else {
                    str2 = null;
                }
            } else if (fa4.m11650l(lowerCase3, "simplified")) {
                LessonTransliteration lessonTransliterationM8041i5 = lessonCard.m8041i();
                if (lessonTransliterationM8041i5 != null) {
                    str2 = lessonTransliterationM8041i5.f19303e;
                } else {
                    str2 = null;
                }
            }
        } else if (fa4.m11650l(strMo4589b2, LanguageLearn.Japanese.getCode())) {
            if (str != null) {
                lowerCase2 = str.toLowerCase(Locale.ROOT);
                lowerCase2.getClass();
            } else {
                lowerCase2 = null;
            }
            if (lowerCase2 != null) {
                int iHashCode = lowerCase2.hashCode();
                if (iHashCode != -1376242947) {
                    if (iHashCode != -925389424) {
                        if (iHashCode == 1500601427 && lowerCase2.equals("furigana")) {
                            lessonTransliterationM8041i = lessonCard.m8041i();
                            if (lessonTransliterationM8041i != null) {
                                str2 = lessonTransliterationM8041i.f19299a;
                            } else {
                                str2 = null;
                            }
                        }
                    } else if (lowerCase2.equals("romaji")) {
                        LessonTransliteration lessonTransliterationM8041i6 = lessonCard.m8041i();
                        if (lessonTransliterationM8041i6 != null) {
                            str2 = lessonTransliterationM8041i6.f19300b;
                        } else {
                            str2 = null;
                        }
                    }
                } else if (lowerCase2.equals("hiragana")) {
                    lessonTransliterationM8041i = lessonCard.m8041i();
                    if (lessonTransliterationM8041i != null) {
                        str2 = lessonTransliterationM8041i.f19299a;
                    } else {
                        str2 = null;
                    }
                }
            }
        } else if (fa4.m11650l(strMo4589b2, LanguageLearn.Cantonese.getCode())) {
            if (str != null) {
                lowerCase = str.toLowerCase(Locale.ROOT);
                lowerCase.getClass();
            } else {
                lowerCase = null;
            }
            if (fa4.m11650l(lowerCase, "jyutping")) {
                LessonTransliteration lessonTransliterationM8041i7 = lessonCard.m8041i();
                if (lessonTransliterationM8041i7 != null) {
                    str2 = lessonTransliterationM8041i7.f19304f;
                } else {
                    str2 = null;
                }
            } else if (fa4.m11650l(lowerCase, "simplified")) {
                LessonTransliteration lessonTransliterationM8041i8 = lessonCard.m8041i();
                if (lessonTransliterationM8041i8 != null) {
                    str2 = lessonTransliterationM8041i8.f19303e;
                } else {
                    str2 = null;
                }
            }
        } else if (AbstractC3184kh.m15230y(cmaVar.mo4589b2()) && !cl9.m4834Q(str, "off", true)) {
            LessonTransliteration lessonTransliterationM8041i9 = lessonCard.m8041i();
            if (lessonTransliterationM8041i9 != null) {
                str2 = lessonTransliterationM8041i9.f19306h;
            } else {
                str2 = null;
            }
        }
        if (str2 == null || vk9.m23391n0(str2)) {
            return null;
        }
        return str2;
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: p0 */
    public final boolean mo4593p0() {
        return this.f32704a.mo4593p0();
    }

    /* JADX INFO: renamed from: q */
    public final Object m9633q(String str, int i, Integer num, ContinuationImpl continuationImpl) throws Throwable {
        Object objM23905G = wfb.m23905G(new ReviewCardContentStateHolder$updateCardStatus$2(i, this, str, num, null), this.f32714k, continuationImpl);
        return objM23905G == CoroutineSingletons.COROUTINE_SUSPENDED ? objM23905G : xfa.f68157a;
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: r1 */
    public final eh9 mo4594r1() {
        return this.f32704a.mo4594r1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: s1 */
    public final boolean mo4595s1() {
        return this.f32704a.mo4595s1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: t */
    public final c83 mo4596t() {
        return this.f32704a.mo4596t();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: w0 */
    public final Object mo4597w0(Continuation continuation) {
        return this.f32704a.mo4597w0(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: w2 */
    public final boolean mo4598w2() {
        return this.f32704a.mo4598w2();
    }
}
