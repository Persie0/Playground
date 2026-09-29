package com.lingq.feature.review;

import com.lingq.core.common.AbstractC1261a;
import com.lingq.core.data.repository.C1287c;
import com.lingq.core.data.repository.C1307w;
import com.lingq.core.datastore.C1370c;
import com.lingq.core.domain.model.language.AppUsageType;
import com.lingq.core.domain.model.lesson.LessonCard;
import com.lingq.core.domain.model.review.ReviewType;
import com.lingq.core.domain.model.token.TokenMeaning;
import com.lingq.core.domain.model.token.TokenRelatedPhrase;
import com.lingq.core.domain.model.user.ProfileAccount;
import com.lingq.core.token.TokenPopupData;
import com.lingq.feature.review.data.ReviewActivityType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import kotlin.AbstractC3193b;
import kotlin.collections.AbstractC3194a;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.random.Random$Default;
import kotlinx.coroutines.channels.C3211a;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3228h;
import kotlinx.coroutines.flow.C3243k;
import kotlinx.coroutines.flow.C3244l;
import p000.AbstractC3352my;
import p000.AbstractC3489q9;
import p000.C3386nv;
import p000.C3540rl;
import p000.InterfaceC3733ws;
import p000.ao0;
import p000.c18;
import p000.c83;
import p000.cma;
import p000.du0;
import p000.eg8;
import p000.eh9;
import p000.fa4;
import p000.g41;
import p000.gm5;
import p000.h98;
import p000.hd8;
import p000.hm5;
import p000.ib8;
import p000.id8;
import p000.ig8;
import p000.jc8;
import p000.jq7;
import p000.l3a;
import p000.lda;
import p000.nb8;
import p000.nl8;
import p000.nn1;
import p000.og8;
import p000.p08;
import p000.qg8;
import p000.r88;
import p000.s7b;
import p000.sd8;
import p000.si7;
import p000.u0b;
import p000.u91;
import p000.v0b;
import p000.wfb;
import p000.wta;
import p000.xb8;
import p000.xfa;
import p000.xi9;

/* JADX INFO: renamed from: com.lingq.feature.review.f */
/* JADX INFO: loaded from: classes3.dex */
public final class C2758f extends wta implements cma, l3a, InterfaceC3733ws {

    /* JADX INFO: renamed from: A */
    public final C3244l f32482A;

    /* JADX INFO: renamed from: B */
    public final C3211a f32483B;

    /* JADX INFO: renamed from: C */
    public final C3211a f32484C;

    /* JADX INFO: renamed from: D */
    public final C3211a f32485D;

    /* JADX INFO: renamed from: E */
    public final C3211a f32486E;

    /* JADX INFO: renamed from: F */
    public final C3211a f32487F;

    /* JADX INFO: renamed from: G */
    public final C3211a f32488G;

    /* JADX INFO: renamed from: H */
    public final C3211a f32489H;

    /* JADX INFO: renamed from: I */
    public final C3244l f32490I;

    /* JADX INFO: renamed from: J */
    public final c18 f32491J;

    /* JADX INFO: renamed from: K */
    public final c18 f32492K;

    /* JADX INFO: renamed from: L */
    public final c18 f32493L;

    /* JADX INFO: renamed from: M */
    public final c18 f32494M;

    /* JADX INFO: renamed from: N */
    public final c18 f32495N;

    /* JADX INFO: renamed from: O */
    public final c18 f32496O;

    /* JADX INFO: renamed from: P */
    public final c18 f32497P;

    /* JADX INFO: renamed from: Q */
    public final c18 f32498Q;

    /* JADX INFO: renamed from: R */
    public final c18 f32499R;

    /* JADX INFO: renamed from: S */
    public final c18 f32500S;

    /* JADX INFO: renamed from: T */
    public final c18 f32501T;

    /* JADX INFO: renamed from: U */
    public final du0 f32502U;

    /* JADX INFO: renamed from: V */
    public final C3244l f32503V;

    /* JADX INFO: renamed from: W */
    public final C3244l f32504W;

    /* JADX INFO: renamed from: X */
    public final du0 f32505X;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ cma f32506b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ l3a f32507c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ InterfaceC3733ws f32508d;

    /* JADX INFO: renamed from: e */
    public final u0b f32509e;

    /* JADX INFO: renamed from: f */
    public final ao0 f32510f;

    /* JADX INFO: renamed from: g */
    public final C1307w f32511g;

    /* JADX INFO: renamed from: h */
    public final s7b f32512h;

    /* JADX INFO: renamed from: i */
    public final nn1 f32513i;

    /* JADX INFO: renamed from: j */
    public final og8 f32514j;

    /* JADX INFO: renamed from: k */
    public final hm5 f32515k;

    /* JADX INFO: renamed from: l */
    public final id8 f32516l;

    /* JADX INFO: renamed from: m */
    public final String f32517m;

    /* JADX INFO: renamed from: n */
    public final Locale f32518n;

    /* JADX INFO: renamed from: o */
    public final C3244l f32519o;

    /* JADX INFO: renamed from: p */
    public final c18 f32520p;

    /* JADX INFO: renamed from: q */
    public final C3244l f32521q;

    /* JADX INFO: renamed from: r */
    public final C3244l f32522r;

    /* JADX INFO: renamed from: s */
    public final c18 f32523s;

    /* JADX INFO: renamed from: t */
    public final c18 f32524t;

    /* JADX INFO: renamed from: u */
    public final c18 f32525u;

    /* JADX INFO: renamed from: v */
    public final C3244l f32526v;

    /* JADX INFO: renamed from: w */
    public final C3244l f32527w;

    /* JADX INFO: renamed from: x */
    public final C3244l f32528x;

    /* JADX INFO: renamed from: y */
    public final C3211a f32529y;

    /* JADX INFO: renamed from: z */
    public final C3211a f32530z;

    public C2758f(u0b u0bVar, ao0 ao0Var, C1307w c1307w, s7b s7bVar, nn1 nn1Var, si7 si7Var, ig8 ig8Var, og8 og8Var, hm5 hm5Var, cma cmaVar, l3a l3aVar, InterfaceC3733ws interfaceC3733ws, nl8 nl8Var) {
        String str;
        u0bVar.getClass();
        ao0Var.getClass();
        c1307w.getClass();
        s7bVar.getClass();
        si7Var.getClass();
        ig8Var.getClass();
        og8Var.getClass();
        hm5Var.getClass();
        cmaVar.getClass();
        l3aVar.getClass();
        interfaceC3733ws.getClass();
        nl8Var.getClass();
        this.f32506b = cmaVar;
        this.f32507c = l3aVar;
        this.f32508d = interfaceC3733ws;
        this.f32509e = u0bVar;
        this.f32510f = ao0Var;
        this.f32511g = c1307w;
        this.f32512h = s7bVar;
        this.f32513i = nn1Var;
        this.f32514j = og8Var;
        this.f32515k = hm5Var;
        id8.Companion.getClass();
        id8 id8VarM13206a = hd8.m13206a(nl8Var);
        this.f32516l = id8VarM13206a;
        String str2 = id8VarM13206a.f43986i;
        if (str2.length() == 0) {
            ReviewType reviewType = id8VarM13206a.f43979b;
            reviewType.getClass();
            switch (qg8.f57765a[reviewType.ordinal()]) {
                case 1:
                case 2:
                case 3:
                    str = "Reader_Review icon";
                    break;
                case 4:
                case 5:
                case 6:
                    str = "Vocabulary";
                    break;
                case 7:
                case 8:
                    str = "Reader_Review Sentence";
                    break;
                default:
                    gm5.m12750e();
                    throw null;
            }
            str2 = str;
        }
        this.f32517m = str2;
        this.f32518n = Locale.forLanguageTag(cmaVar.mo4589b2());
        EmptyList emptyList = EmptyList.f47638a;
        C3244l c3244lM17114d = AbstractC3352my.m17114d(emptyList);
        this.f32519o = c3244lM17114d;
        g41 g41VarM16103C = lda.m16103C(this);
        C3243k c3243k = xi9.f68262a;
        this.f32520p = AbstractC3224d.m15520B(c3244lM17114d, g41VarM16103C, c3243k, emptyList);
        C3244l c3244lM17114d2 = AbstractC3352my.m17114d(emptyList);
        this.f32521q = c3244lM17114d2;
        AbstractC3224d.m15520B(c3244lM17114d2, lda.m16103C(this), c3243k, emptyList);
        C3244l c3244lM17114d3 = AbstractC3352my.m17114d(0);
        this.f32522r = c3244lM17114d3;
        this.f32523s = AbstractC3224d.m15520B(c3244lM17114d3, lda.m16103C(this), c3243k, 0);
        this.f32524t = AbstractC3224d.m15520B(AbstractC3352my.m17114d(AbstractC3194a.m15360M()), lda.m16103C(this), c3243k, AbstractC3194a.m15360M());
        this.f32525u = AbstractC3224d.m15520B(AbstractC3352my.m17114d(AbstractC3194a.m15360M()), lda.m16103C(this), c3243k, AbstractC3194a.m15360M());
        C3244l c3244lM17114d4 = AbstractC3352my.m17114d(emptyList);
        this.f32526v = c3244lM17114d4;
        C3244l c3244lM17114d5 = AbstractC3352my.m17114d(-1);
        this.f32527w = c3244lM17114d5;
        AbstractC3224d.m15520B(c3244lM17114d5, lda.m16103C(this), c3243k, -1);
        Boolean bool = Boolean.FALSE;
        C3244l c3244lM17114d6 = AbstractC3352my.m17114d(bool);
        this.f32528x = c3244lM17114d6;
        AbstractC3224d.m15520B(c3244lM17114d6, lda.m16103C(this), c3243k, bool);
        AbstractC3224d.m15519A(AbstractC1261a.m7042a());
        AbstractC3224d.m15519A(AbstractC1261a.m7042a());
        C3211a c3211aM7042a = AbstractC1261a.m7042a();
        this.f32529y = c3211aM7042a;
        AbstractC3224d.m15519A(c3211aM7042a);
        C3211a c3211aM7042a2 = AbstractC1261a.m7042a();
        this.f32530z = c3211aM7042a2;
        AbstractC3224d.m15519A(c3211aM7042a2);
        C3244l c3244lM17114d7 = AbstractC3352my.m17114d(null);
        this.f32482A = c3244lM17114d7;
        AbstractC3224d.m15520B(c3244lM17114d7, lda.m16103C(this), c3243k, null);
        C3211a c3211aM7042a3 = AbstractC1261a.m7042a();
        this.f32483B = c3211aM7042a3;
        AbstractC3224d.m15519A(c3211aM7042a3);
        C3211a c3211aM7042a4 = AbstractC1261a.m7042a();
        this.f32484C = c3211aM7042a4;
        AbstractC3224d.m15519A(c3211aM7042a4);
        C3211a c3211aM7042a5 = AbstractC1261a.m7042a();
        this.f32485D = c3211aM7042a5;
        AbstractC3224d.m15519A(c3211aM7042a5);
        C3211a c3211aM7042a6 = AbstractC1261a.m7042a();
        this.f32486E = c3211aM7042a6;
        AbstractC3224d.m15519A(c3211aM7042a6);
        C3211a c3211aM7042a7 = AbstractC1261a.m7042a();
        this.f32487F = c3211aM7042a7;
        AbstractC3224d.m15519A(c3211aM7042a7);
        C3211a c3211aM7042a8 = AbstractC1261a.m7042a();
        this.f32488G = c3211aM7042a8;
        AbstractC3224d.m15519A(c3211aM7042a8);
        C3211a c3211aM7042a9 = AbstractC1261a.m7042a();
        this.f32489H = c3211aM7042a9;
        AbstractC3224d.m15519A(c3211aM7042a9);
        C3244l c3244lM17114d8 = AbstractC3352my.m17114d(null);
        this.f32490I = c3244lM17114d8;
        C1370c c1370c = (C1370c) ig8Var;
        this.f32491J = AbstractC3224d.m15520B(AbstractC3224d.m15536o(c1370c.f18501M), lda.m16103C(this), c3243k, 10);
        this.f32492K = AbstractC3224d.m15520B(AbstractC3224d.m15536o(c1370c.f18502N), lda.m16103C(this), c3243k, bool);
        this.f32493L = AbstractC3224d.m15520B(AbstractC3224d.m15536o(c1370c.f18503O), lda.m16103C(this), c3243k, bool);
        this.f32494M = AbstractC3224d.m15520B(AbstractC3224d.m15536o(c1370c.f18504P), lda.m16103C(this), c3243k, bool);
        this.f32495N = AbstractC3224d.m15520B(AbstractC3224d.m15536o(c1370c.f18505Q), lda.m16103C(this), c3243k, bool);
        this.f32496O = AbstractC3224d.m15520B(AbstractC3224d.m15536o(c1370c.f18506R), lda.m16103C(this), c3243k, bool);
        this.f32497P = AbstractC3224d.m15520B(AbstractC3224d.m15536o(c1370c.f18546p0), lda.m16103C(this), c3243k, bool);
        this.f32498Q = AbstractC3224d.m15520B(AbstractC3224d.m15536o(c1370c.f18550r0), lda.m16103C(this), c3243k, bool);
        this.f32499R = AbstractC3224d.m15520B(AbstractC3224d.m15536o(c1370c.f18548q0), lda.m16103C(this), c3243k, bool);
        this.f32500S = AbstractC3224d.m15520B(new p08(AbstractC3224d.m15536o(c1370c.f18500L), 11), lda.m16103C(this), c3243k, bool);
        this.f32501T = AbstractC3224d.m15520B(AbstractC3224d.m15546y(new C3228h(c3244lM17114d4, new C3540rl(c3244lM17114d8, 5), new ReviewViewModel$cardsForAnswers$1(3, null)), new ReviewViewModel$cardsForAnswers$2(2, null)), lda.m16103C(this), c3243k, emptyList);
        this.f32502U = AbstractC3224d.m15519A(AbstractC1261a.m7042a());
        C3244l c3244lM17114d9 = AbstractC3352my.m17114d(new r88());
        this.f32503V = c3244lM17114d9;
        AbstractC3224d.m15520B(c3244lM17114d9, lda.m16103C(this), c3243k, new r88());
        C3244l c3244lM17114d10 = AbstractC3352my.m17114d(new h98());
        this.f32504W = c3244lM17114d10;
        AbstractC3224d.m15520B(c3244lM17114d10, lda.m16103C(this), c3243k, new h98());
        this.f32505X = AbstractC3224d.m15519A(AbstractC1261a.m7042a());
        wfb.m23926u(lda.m16103C(this), null, null, new ReviewViewModel$1(this, null), 3);
        wfb.m23926u(lda.m16103C(this), null, null, new ReviewViewModel$2(this, null), 3);
        wfb.m23926u(lda.m16103C(this), null, null, new ReviewViewModel$3(this, null), 3);
        wfb.m23926u(lda.m16103C(this), null, null, new ReviewViewModel$4(this, null), 3);
        wfb.m23926u(lda.m16103C(this), null, null, new ReviewViewModel$5(this, null), 3);
        wfb.m23926u(lda.m16103C(this), null, null, new ReviewViewModel$6(this, null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: V2 */
    public static final Object m9602V2(C2758f c2758f, nb8 nb8Var, ContinuationImpl continuationImpl) throws Throwable {
        ReviewViewModel$checkActivityValidAndShow$1 reviewViewModel$checkActivityValidAndShow$1;
        Object obj;
        C3244l c3244l = c2758f.f32521q;
        C3211a c3211a = c2758f.f32485D;
        if (continuationImpl instanceof ReviewViewModel$checkActivityValidAndShow$1) {
            reviewViewModel$checkActivityValidAndShow$1 = (ReviewViewModel$checkActivityValidAndShow$1) continuationImpl;
            int i = reviewViewModel$checkActivityValidAndShow$1.f31876d;
            if ((i & Integer.MIN_VALUE) != 0) {
                reviewViewModel$checkActivityValidAndShow$1.f31876d = i - Integer.MIN_VALUE;
            } else {
                reviewViewModel$checkActivityValidAndShow$1 = new ReviewViewModel$checkActivityValidAndShow$1(c2758f, continuationImpl);
            }
        } else {
            reviewViewModel$checkActivityValidAndShow$1 = new ReviewViewModel$checkActivityValidAndShow$1(c2758f, continuationImpl);
        }
        Object objM7116f = reviewViewModel$checkActivityValidAndShow$1.f31874b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = reviewViewModel$checkActivityValidAndShow$1.f31876d;
        if (i2 == 0) {
            AbstractC3193b.m15359b(objM7116f);
            if (nb8Var instanceof sd8) {
                c3211a.mo4677k(nb8Var);
            } else if (nb8Var instanceof eg8) {
                ao0 ao0Var = c2758f.f32510f;
                String strMo4589b2 = c2758f.f32506b.mo4589b2();
                String str = ((eg8) nb8Var).mo10270a().f64672b;
                reviewViewModel$checkActivityValidAndShow$1.f31873a = nb8Var;
                reviewViewModel$checkActivityValidAndShow$1.f31876d = 1;
                objM7116f = ((C1287c) ao0Var).m7116f(strMo4589b2, str, reviewViewModel$checkActivityValidAndShow$1);
                if (objM7116f == coroutineSingletons) {
                    obj = nb8Var;
                    return coroutineSingletons;
                }
            }
            return xfa.f68157a;
        }
        if (i2 != 1) {
            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        Object obj2 = reviewViewModel$checkActivityValidAndShow$1.f31873a;
        AbstractC3193b.m15359b(objM7116f);
        obj = obj2;
        obj = nb8Var;
        if (((LessonCard) objM7116f) != null) {
            c3211a.mo4677k(obj);
        } else {
            ArrayList arrayListM22624p1 = u91.m22624p1((Collection) c3244l.getValue());
            arrayListM22624p1.remove(obj);
            C3244l c3244l2 = c2758f.f32527w;
            c3244l2.m15572j(null, new Integer(((Number) c3244l2.getValue()).intValue() - 1));
            c3244l.m15572j(null, arrayListM22624p1);
            c2758f.m9613g3();
        }
        return xfa.f68157a;
    }

    /* JADX INFO: renamed from: W2 */
    public static final void m9603W2(C2758f c2758f, Set set, ArrayList arrayList, List list) {
        Set setM22626r1 = u91.m22626r1(set);
        if (AbstractC3489q9.m19764A(setM22626r1, arrayList).size() >= 3) {
            while (setM22626r1.size() < 3) {
                Random$Default random$Default = jq7.f46010a;
                setM22626r1.add((String) u91.m22605W0(arrayList));
            }
            List listM22625q1 = u91.m22625q1(setM22626r1);
            Collections.shuffle(listM22625q1);
            list.add(new ib8(u91.m22615g1(listM22625q1, 3)));
        }
    }

    /* JADX INFO: renamed from: X2 */
    public static final int m9604X2(C2758f c2758f, List list, boolean z, boolean z2) {
        C3244l c3244l = c2758f.f32519o;
        C3211a c3211a = c2758f.f32489H;
        id8 id8Var = c2758f.f32516l;
        int size = id8Var.f43979b == ReviewType.Page ? list.size() : ((Number) ((C3244l) c2758f.f32491J.f9311a).getValue()).intValue();
        if (size > list.size()) {
            size = list.size();
        }
        ArrayList arrayList = new ArrayList();
        Random random = new Random();
        ArrayList arrayList2 = new ArrayList();
        int size2 = list.size();
        for (int i = 0; i < size2; i++) {
            arrayList2.add(Integer.valueOf(i));
        }
        int i2 = 0;
        while (i2 < size) {
            int iNextInt = random.nextInt(arrayList2.size());
            int iIntValue = ((Number) arrayList2.get(iNextInt)).intValue();
            if (!arrayList.contains(Integer.valueOf(iIntValue)) && !((v0b) list.get(iIntValue)).f64675e.isEmpty()) {
                arrayList.add(Integer.valueOf(iIntValue));
                i2++;
            }
            arrayList2.remove(iNextInt);
            if (arrayList2.isEmpty()) {
                break;
            }
        }
        if (z2) {
            Collections.shuffle(arrayList);
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList3.add(list.get(((Number) it.next()).intValue()));
        }
        boolean zIsEmpty = arrayList3.isEmpty();
        xfa xfaVar = xfa.f68157a;
        if (zIsEmpty) {
            c2758f.f32488G.mo4677k(xfaVar);
        } else if (id8Var.f43979b == ReviewType.Integrated) {
            List listM22622n1 = u91.m22622n1(arrayList3);
            c3244l.getClass();
            c3244l.m15572j(null, listM22622n1);
        } else {
            if (c2758f.m9607a3(z) == 0) {
                c3211a.mo4677k(xfaVar);
                return 0;
            }
            if (z) {
                Object[] array = ReviewActivityType.getEntries().toArray(new ReviewActivityType[0]);
                int length = array.length;
                int i3 = 0;
                while (true) {
                    if (i3 >= length) {
                        c3211a.mo4677k(xfaVar);
                        return 0;
                    }
                    if (c2758f.m9612f3(((ReviewActivityType) array[i3]).ordinal(), z)) {
                        break;
                    }
                    i3++;
                }
            }
            List listM22622n2 = u91.m22622n1(arrayList3);
            c3244l.getClass();
            c3244l.m15572j(null, listM22622n2);
        }
        return arrayList3.size();
    }

    /* JADX INFO: renamed from: Y2 */
    public static final void m9605Y2(C2758f c2758f, Set set, boolean z, boolean z2) {
        wfb.m23926u(lda.m16103C(c2758f), c2758f.f32513i, null, new ReviewViewModel$termsToStudy$1(set, c2758f, z, z2, null), 2);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: A */
    public final c83 mo4571A() {
        return this.f32506b.mo4571A();
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: A2 */
    public final c83 mo8734A2() {
        return this.f32507c.mo8734A2();
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: B */
    public final void mo8735B() {
        this.f32507c.mo8735B();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: B0 */
    public final eh9 mo4572B0() {
        return this.f32506b.mo4572B0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: B1 */
    public final eh9 mo4573B1() {
        return this.f32506b.mo4573B1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: C1 */
    public final c83 mo4574C1() {
        return this.f32506b.mo4574C1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: D0 */
    public final Object mo4575D0(Continuation continuation) {
        return this.f32506b.mo4575D0(continuation);
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: E */
    public final void mo8737E(String str) {
        str.getClass();
        this.f32507c.mo8737E(str);
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: E1 */
    public final void mo8738E1(TokenPopupData tokenPopupData) {
        tokenPopupData.getClass();
        this.f32507c.mo8738E1(tokenPopupData);
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: F */
    public final c83 mo8739F() {
        return this.f32507c.mo8739F();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: F1 */
    public final Object mo4576F1(String str, Continuation continuation) {
        return this.f32506b.mo4576F1(str, continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: H */
    public final eh9 mo4577H() {
        return this.f32506b.mo4577H();
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: I2 */
    public final c83 mo8741I2() {
        return this.f32507c.mo8741I2();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: J */
    public final Object mo4578J(Continuation continuation) {
        return this.f32506b.mo4578J(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: K */
    public final Object mo4579K(Continuation continuation) {
        return this.f32506b.mo4579K(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: K1 */
    public final String mo4580K1() {
        return this.f32506b.mo4580K1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: L0 */
    public final boolean mo4581L0() {
        return this.f32506b.mo4581L0();
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: L2 */
    public final c83 mo8743L2() {
        return this.f32507c.mo8743L2();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: N */
    public final c83 mo4582N() {
        return this.f32506b.mo4582N();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: O1 */
    public final c83 mo4583O1() {
        return this.f32506b.mo4583O1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: Q0 */
    public final int mo4584Q0() {
        return this.f32506b.mo4584Q0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: R */
    public final eh9 mo4585R() {
        return this.f32506b.mo4585R();
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: T */
    public final c83 mo8746T() {
        return this.f32507c.mo8746T();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: T0 */
    public final boolean mo4586T0() {
        return this.f32506b.mo4586T0();
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: U1 */
    public final void mo8747U1() {
        this.f32507c.mo8747U1();
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: W */
    public final c83 mo8748W() {
        return this.f32507c.mo8748W();
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: W0 */
    public final void mo8749W0(TokenRelatedPhrase tokenRelatedPhrase, int i, int i2, int i3, int i4, int i5) {
        tokenRelatedPhrase.getClass();
        this.f32507c.mo8749W0(tokenRelatedPhrase, i, i2, i3, i4, i5);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: X */
    public final void mo4587X() {
        this.f32506b.mo4587X();
    }

    /* JADX INFO: renamed from: Z2 */
    public final void m9606Z2(jc8 jc8Var) {
        C3244l c3244l = this.f32482A;
        c3244l.getClass();
        c3244l.m15572j(null, jc8Var);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: a0 */
    public final boolean mo4588a0() {
        return this.f32506b.mo4588a0();
    }

    /* JADX INFO: renamed from: a3 */
    public final int m9607a3(boolean z) {
        int i = 0;
        for (ReviewActivityType reviewActivityType : ReviewActivityType.getEntries()) {
            boolean zM9612f3 = m9612f3(reviewActivityType.ordinal(), z);
            if (zM9612f3 && (reviewActivityType == ReviewActivityType.DictationActivity || reviewActivityType == ReviewActivityType.DictationReverseActivity || reviewActivityType == ReviewActivityType.MultiChoiceActivity || reviewActivityType == ReviewActivityType.MultiChoiceReverseActivity)) {
                i += 2;
            } else if (zM9612f3) {
                i++;
            }
        }
        return i;
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: b0 */
    public final c83 mo8756b0() {
        return this.f32507c.mo8756b0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: b2 */
    public final String mo4589b2() {
        return this.f32506b.mo4589b2();
    }

    /* JADX INFO: renamed from: b3 */
    public final void m9608b3() {
        C3244l c3244l;
        Object value;
        boolean z;
        String str;
        do {
            c3244l = this.f32503V;
            value = c3244l.getValue();
            r88 r88Var = (r88) value;
            z = r88Var.f58890a;
            str = r88Var.f58891b;
            str.getClass();
        } while (!c3244l.m15570h(value, new r88(str, z, false)));
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: c */
    public final void mo8758c() {
        this.f32507c.mo8758c();
    }

    /* JADX INFO: renamed from: c3 */
    public final nb8 m9609c3() {
        return (nb8) u91.m22592J0(((Number) this.f32527w.getValue()).intValue(), (List) this.f32521q.getValue());
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: d0 */
    public final boolean mo4590d0() {
        return this.f32506b.mo4590d0();
    }

    /* JADX INFO: renamed from: d3 */
    public final ArrayList m9610d3(String str) {
        ArrayList arrayList = new ArrayList();
        List list = (List) this.f32526v.getValue();
        Random random = new Random();
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        while (hashSet.size() < 3) {
            int iNextInt = random.nextInt(list.size());
            if (!arrayList2.contains(Integer.valueOf(iNextInt))) {
                arrayList2.add(Integer.valueOf(iNextInt));
                List list2 = ((v0b) list.get(iNextInt)).f64675e;
                if (!list2.isEmpty() && !fa4.m11650l(((TokenMeaning) list2.get(0)).f19596c, str)) {
                    hashSet.add(Integer.valueOf(iNextInt));
                }
            }
            if (hashSet.size() == list.size() || arrayList2.size() == list.size()) {
                break;
            }
        }
        Iterator it = hashSet.iterator();
        it.getClass();
        while (it.hasNext()) {
            Object next = it.next();
            next.getClass();
            String str2 = ((TokenMeaning) ((v0b) list.get(((Number) next).intValue())).f64675e.get(0)).f19596c;
            if (str2 == null) {
                str2 = "";
            }
            arrayList.add(str2);
        }
        int iNextInt2 = random.nextInt(arrayList.size() + 1);
        if (str != null) {
            arrayList.add(iNextInt2, str);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: e3 */
    public final ArrayList m9611e3(String str) {
        ArrayList arrayList = new ArrayList();
        List list = (List) this.f32526v.getValue();
        Random random = new Random();
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        while (hashSet.size() < 3) {
            int iNextInt = random.nextInt(list.size());
            if (!arrayList2.contains(Integer.valueOf(iNextInt))) {
                arrayList2.add(Integer.valueOf(iNextInt));
                if (!fa4.m11650l(((v0b) list.get(iNextInt)).f64672b, str)) {
                    hashSet.add(Integer.valueOf(iNextInt));
                }
            }
            if (hashSet.size() == list.size() || arrayList2.size() == list.size()) {
                break;
            }
        }
        Iterator it = hashSet.iterator();
        it.getClass();
        while (it.hasNext()) {
            Object next = it.next();
            next.getClass();
            arrayList.add(((v0b) list.get(((Number) next).intValue())).f64672b);
        }
        arrayList.add(random.nextInt(arrayList.size() + 1), str);
        return arrayList;
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: f */
    public final void mo8761f() {
        this.f32507c.mo8761f();
    }

    /* JADX INFO: renamed from: f3 */
    public final boolean m9612f3(int i, boolean z) {
        if (i == ReviewActivityType.FlashcardActivity.ordinal()) {
            return ((Boolean) ((C3244l) this.f32492K.f9311a).getValue()).booleanValue() && z;
        }
        if (i == ReviewActivityType.FlashcardReverseActivity.ordinal()) {
            return ((Boolean) ((C3244l) this.f32493L.f9311a).getValue()).booleanValue() && z;
        }
        int iOrdinal = ReviewActivityType.DictationActivity.ordinal();
        c18 c18Var = this.f32496O;
        if (i == iOrdinal) {
            return ((Boolean) ((C3244l) c18Var.f9311a).getValue()).booleanValue() && z;
        }
        if (i == ReviewActivityType.DictationReverseActivity.ordinal()) {
            return ((Boolean) ((C3244l) c18Var.f9311a).getValue()).booleanValue() && z;
        }
        int iOrdinal2 = ReviewActivityType.MultiChoiceActivity.ordinal();
        c18 c18Var2 = this.f32495N;
        if (i == iOrdinal2) {
            return ((Boolean) ((C3244l) c18Var2.f9311a).getValue()).booleanValue() && z;
        }
        if (i == ReviewActivityType.MultiChoiceReverseActivity.ordinal()) {
            return ((Boolean) ((C3244l) c18Var2.f9311a).getValue()).booleanValue();
        }
        if (i == ReviewActivityType.ClozeActivity.ordinal()) {
            return ((Boolean) ((C3244l) this.f32494M.f9311a).getValue()).booleanValue();
        }
        return false;
    }

    /* JADX INFO: renamed from: g3 */
    public final void m9613g3() {
        wfb.m23926u(lda.m16103C(this), null, null, new ReviewViewModel$nextActivity$1(this, null), 3);
    }

    @Override // p000.InterfaceC3733ws
    /* JADX INFO: renamed from: h */
    public final Map mo9032h() {
        return this.f32508d.mo9032h();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: h0 */
    public final Object mo4591h0(ProfileAccount profileAccount, Continuation continuation) {
        return this.f32506b.mo4591h0(profileAccount, continuation);
    }

    /* JADX INFO: renamed from: h3 */
    public final void m9614h3() {
        List list = xb8.f68031a;
        Random$Default random$Default = jq7.f46010a;
        r88 r88Var = new r88((String) u91.m22605W0(list), true, true);
        C3244l c3244l = this.f32503V;
        c3244l.getClass();
        c3244l.m15572j(null, r88Var);
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: i */
    public final c83 mo8765i() {
        return this.f32507c.mo8765i();
    }

    /* JADX INFO: renamed from: i3 */
    public final void m9615i3() {
        wfb.m23926u(lda.m16103C(this), this.f32513i, null, new ReviewViewModel$reviewCard$1(this, null), 2);
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: j */
    public final c83 mo8767j() {
        return this.f32507c.mo8767j();
    }

    /* JADX INFO: renamed from: j3 */
    public final void m9616j3() {
        C3244l c3244l = this.f32522r;
        c3244l.m15572j(null, Integer.valueOf(((Number) c3244l.getValue()).intValue() + 1));
        for (v0b v0bVar : (Iterable) this.f32519o.getValue()) {
        }
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: m0 */
    public final boolean mo4592m0() {
        return this.f32506b.mo4592m0();
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: n0 */
    public final void mo8769n0() {
        this.f32507c.mo8769n0();
    }

    @Override // p000.InterfaceC3733ws
    /* JADX INFO: renamed from: o1 */
    public final void mo9033o1(AppUsageType appUsageType, Integer num) {
        appUsageType.getClass();
        this.f32508d.mo9033o1(appUsageType, num);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: p0 */
    public final boolean mo4593p0() {
        return this.f32506b.mo4593p0();
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: p1 */
    public final c83 mo8770p1() {
        return this.f32507c.mo8770p1();
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: q1 */
    public final void mo8772q1(String str) {
        str.getClass();
        this.f32507c.mo8772q1(str);
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: q2 */
    public final c83 mo8773q2() {
        return this.f32507c.mo8773q2();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: r1 */
    public final eh9 mo4594r1() {
        return this.f32506b.mo4594r1();
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: r2 */
    public final void mo8774r2(int i) {
        this.f32507c.mo8774r2(i);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: s1 */
    public final boolean mo4595s1() {
        return this.f32506b.mo4595s1();
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: s2 */
    public final void mo8776s2(boolean z, boolean z2) {
        this.f32507c.mo8776s2(z, z2);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: t */
    public final c83 mo4596t() {
        return this.f32506b.mo4596t();
    }

    @Override // p000.InterfaceC3733ws
    /* JADX INFO: renamed from: v0 */
    public final void mo9034v0(AppUsageType appUsageType) {
        appUsageType.getClass();
        this.f32508d.mo9034v0(appUsageType);
    }

    @Override // p000.l3a
    /* JADX INFO: renamed from: v2 */
    public final c83 mo8779v2() {
        return this.f32507c.mo8779v2();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: w0 */
    public final Object mo4597w0(Continuation continuation) {
        return this.f32506b.mo4597w0(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: w2 */
    public final boolean mo4598w2() {
        return this.f32506b.mo4598w2();
    }
}
