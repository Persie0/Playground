package com.lingq.feature.review.state;

import com.lingq.core.data.repository.C1287c;
import com.lingq.core.data.repository.C1308x;
import com.lingq.core.datastore.C1370c;
import com.lingq.core.domain.model.lesson.LessonCard;
import com.lingq.core.domain.model.review.ReviewType;
import com.lingq.core.domain.model.token.TokenMeaning;
import com.lingq.core.domain.model.user.ProfileAccount;
import com.lingq.feature.review.data.ReviewActivityType;
import com.lingq.feature.review.domain.C2755a;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.AbstractC3193b;
import kotlin.Triple;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.random.Random$Default;
import kotlinx.coroutines.flow.AbstractC3224d;
import org.joda.time.DateTime;
import p000.AbstractC3184kh;
import p000.AbstractC3393o1;
import p000.AbstractC3489q9;
import p000.C3386nv;
import p000.af8;
import p000.c83;
import p000.cma;
import p000.db8;
import p000.eb8;
import p000.ec8;
import p000.ed8;
import p000.eh9;
import p000.fa4;
import p000.fb8;
import p000.fd8;
import p000.gb8;
import p000.gxc;
import p000.hb8;
import p000.hi8;
import p000.hy3;
import p000.i84;
import p000.ib8;
import p000.ig8;
import p000.jb8;
import p000.jq7;
import p000.kb8;
import p000.lb8;
import p000.mb8;
import p000.mxa;
import p000.nb8;
import p000.ob8;
import p000.og8;
import p000.ql3;
import p000.u0b;
import p000.u13;
import p000.u91;
import p000.v0b;
import p000.v13;
import p000.v91;
import p000.vk9;
import p000.vqb;
import p000.vz1;
import p000.web;
import p000.xa2;

/* JADX INFO: renamed from: com.lingq.feature.review.state.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C2764d implements cma {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ cma f32742a;

    /* JADX INFO: renamed from: b */
    public final C2755a f32743b;

    /* JADX INFO: renamed from: c */
    public final u13 f32744c;

    /* JADX INFO: renamed from: d */
    public final v13 f32745d;

    /* JADX INFO: renamed from: e */
    public final v13 f32746e;

    /* JADX INFO: renamed from: f */
    public final web f32747f;

    /* JADX INFO: renamed from: g */
    public final u13 f32748g;

    /* JADX INFO: renamed from: h */
    public final ql3 f32749h;

    /* JADX INFO: renamed from: i */
    public final vqb f32750i;

    /* JADX INFO: renamed from: j */
    public final xa2 f32751j;

    /* JADX INFO: renamed from: k */
    public final hi8 f32752k;

    /* JADX INFO: renamed from: l */
    public final og8 f32753l;

    /* JADX INFO: renamed from: m */
    public List f32754m;

    /* JADX INFO: renamed from: n */
    public List f32755n;

    /* JADX INFO: renamed from: o */
    public List f32756o;

    /* JADX INFO: renamed from: p */
    public int f32757p;

    /* JADX INFO: renamed from: q */
    public int f32758q;

    /* JADX INFO: renamed from: r */
    public final LinkedHashMap f32759r;

    /* JADX INFO: renamed from: s */
    public final LinkedHashMap f32760s;

    /* JADX INFO: renamed from: t */
    public boolean f32761t;

    /* JADX INFO: renamed from: u */
    public Set f32762u;

    public C2764d(C2755a c2755a, u13 u13Var, v13 v13Var, v13 v13Var2, web webVar, u13 u13Var2, ql3 ql3Var, vqb vqbVar, xa2 xa2Var, hi8 hi8Var, og8 og8Var, cma cmaVar) {
        og8Var.getClass();
        cmaVar.getClass();
        this.f32742a = cmaVar;
        this.f32743b = c2755a;
        this.f32744c = u13Var;
        this.f32745d = v13Var;
        this.f32746e = v13Var2;
        this.f32747f = webVar;
        this.f32748g = u13Var2;
        this.f32749h = ql3Var;
        this.f32750i = vqbVar;
        this.f32751j = xa2Var;
        this.f32752k = hi8Var;
        this.f32753l = og8Var;
        EmptyList emptyList = EmptyList.f47638a;
        this.f32754m = emptyList;
        this.f32755n = emptyList;
        this.f32756o = emptyList;
        this.f32757p = -1;
        this.f32759r = new LinkedHashMap();
        this.f32760s = new LinkedHashMap();
        this.f32762u = EmptySet.f47640a;
    }

    /* JADX INFO: renamed from: h */
    public static boolean m9642h(int i, af8 af8Var) {
        boolean z = af8Var.f588c;
        if (i == ReviewActivityType.FlashcardActivity.ordinal()) {
            return af8Var.f586a;
        }
        if (i == ReviewActivityType.FlashcardReverseActivity.ordinal()) {
            return af8Var.f587b;
        }
        if (i == ReviewActivityType.DictationActivity.ordinal() || i == ReviewActivityType.DictationReverseActivity.ordinal()) {
            return z;
        }
        if (i == ReviewActivityType.MultiChoiceActivity.ordinal()) {
            return af8Var.f589d;
        }
        if (i == ReviewActivityType.MultiChoiceReverseActivity.ordinal()) {
            return af8Var.f590e;
        }
        if (i == ReviewActivityType.ClozeActivity.ordinal()) {
            return af8Var.f591f;
        }
        return false;
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: A */
    public final c83 mo4571A() {
        return this.f32742a.mo4571A();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: B0 */
    public final eh9 mo4572B0() {
        return this.f32742a.mo4572B0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: B1 */
    public final eh9 mo4573B1() {
        return this.f32742a.mo4573B1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: C1 */
    public final c83 mo4574C1() {
        return this.f32742a.mo4574C1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: D0 */
    public final Object mo4575D0(Continuation continuation) {
        return this.f32742a.mo4575D0(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: F1 */
    public final Object mo4576F1(String str, Continuation continuation) {
        return this.f32742a.mo4576F1(str, continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: H */
    public final eh9 mo4577H() {
        return this.f32742a.mo4577H();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: J */
    public final Object mo4578J(Continuation continuation) {
        return this.f32742a.mo4578J(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: K */
    public final Object mo4579K(Continuation continuation) {
        return this.f32742a.mo4579K(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: K1 */
    public final String mo4580K1() {
        return this.f32742a.mo4580K1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: L0 */
    public final boolean mo4581L0() {
        return this.f32742a.mo4581L0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: N */
    public final c83 mo4582N() {
        return this.f32742a.mo4582N();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: O1 */
    public final c83 mo4583O1() {
        return this.f32742a.mo4583O1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: Q0 */
    public final int mo4584Q0() {
        return this.f32742a.mo4584Q0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: R */
    public final eh9 mo4585R() {
        return this.f32742a.mo4585R();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: T0 */
    public final boolean mo4586T0() {
        return this.f32742a.mo4586T0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: X */
    public final void mo4587X() {
        this.f32742a.mo4587X();
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0178  */
    /* JADX WARN: Code duplicated, block: B:38:0x018f  */
    /* JADX WARN: Code duplicated, block: B:44:0x01af  */
    /* JADX WARN: Code duplicated, block: B:46:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:47:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:50:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:54:0x0208  */
    /* JADX WARN: Code duplicated, block: B:60:0x0232 A[LOOP:1: B:58:0x022c->B:60:0x0232, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:64:0x025d  */
    /* JADX WARN: Code duplicated, block: B:68:0x027f A[LOOP:3: B:66:0x0279->B:68:0x027f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:73:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:76:0x02bc A[LOOP:4: B:74:0x02b6->B:76:0x02bc, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:78:0x02cd  */
    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    /* JADX WARN: Code duplicated, block: B:80:0x02d9  */
    /* JADX WARN: Code duplicated, block: B:87:0x0219 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:89:0x0202 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:92:0x0279 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:95:0x0257 A[SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    public final Object m9643a(List list, ec8 ec8Var, ContinuationImpl continuationImpl) throws Throwable {
        ReviewSessionStateHolder$buildMultiWordActivities$1 reviewSessionStateHolder$buildMultiWordActivities$1;
        int size;
        List list2;
        List list3;
        ec8 ec8Var2;
        int i;
        List list4;
        boolean z;
        List list5;
        ec8 ec8Var3;
        List list6;
        List list7;
        int i2;
        int i3;
        boolean zBooleanValue;
        Object objM15541t;
        boolean z2;
        int i4;
        List list8;
        int i5;
        ec8 ec8Var4;
        List list9;
        boolean zBooleanValue2;
        Set setM22627s1;
        Object objM7117g;
        boolean z3;
        Set set;
        boolean z4;
        List list10;
        Iterator it;
        ArrayList arrayList;
        ArrayList arrayList2;
        Iterator it2;
        Iterator it3;
        Set setM22626r1;
        ig8 ig8Var = (ig8) this.f32743b.f32467a;
        if (continuationImpl instanceof ReviewSessionStateHolder$buildMultiWordActivities$1) {
            reviewSessionStateHolder$buildMultiWordActivities$1 = (ReviewSessionStateHolder$buildMultiWordActivities$1) continuationImpl;
            int i6 = reviewSessionStateHolder$buildMultiWordActivities$1.f32647H;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                reviewSessionStateHolder$buildMultiWordActivities$1.f32647H = i6 - Integer.MIN_VALUE;
            } else {
                reviewSessionStateHolder$buildMultiWordActivities$1 = new ReviewSessionStateHolder$buildMultiWordActivities$1(this, continuationImpl);
            }
        } else {
            reviewSessionStateHolder$buildMultiWordActivities$1 = new ReviewSessionStateHolder$buildMultiWordActivities$1(this, continuationImpl);
        }
        Object obj = reviewSessionStateHolder$buildMultiWordActivities$1.f32658k;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i7 = reviewSessionStateHolder$buildMultiWordActivities$1.f32647H;
        cma cmaVar = this.f32742a;
        if (i7 == 0) {
            AbstractC3193b.m15359b(obj);
            ArrayList arrayList3 = new ArrayList();
            List list11 = list;
            ArrayList arrayList4 = new ArrayList(v91.m23189q0(list11, 10));
            Iterator it4 = list11.iterator();
            while (it4.hasNext()) {
                arrayList4.add(((v0b) it4.next()).f64672b);
            }
            size = (arrayList4.size() + 2) / 3;
            reviewSessionStateHolder$buildMultiWordActivities$1.f32648a = list;
            reviewSessionStateHolder$buildMultiWordActivities$1.f32649b = ec8Var;
            reviewSessionStateHolder$buildMultiWordActivities$1.f32650c = arrayList3;
            reviewSessionStateHolder$buildMultiWordActivities$1.f32651d = arrayList4;
            reviewSessionStateHolder$buildMultiWordActivities$1.f32653f = 3;
            reviewSessionStateHolder$buildMultiWordActivities$1.f32654g = size;
            reviewSessionStateHolder$buildMultiWordActivities$1.f32647H = 1;
            Object objM15541t2 = AbstractC3224d.m15541t(((C1370c) ig8Var).f18550r0, reviewSessionStateHolder$buildMultiWordActivities$1);
            if (objM15541t2 != coroutineSingletons) {
                list2 = arrayList3;
                obj = objM15541t2;
                list3 = list;
                ec8Var2 = ec8Var;
                i = 3;
                list4 = arrayList4;
            }
            return coroutineSingletons;
        }
        if (i7 == 1) {
            size = reviewSessionStateHolder$buildMultiWordActivities$1.f32654g;
            i = reviewSessionStateHolder$buildMultiWordActivities$1.f32653f;
            List list12 = reviewSessionStateHolder$buildMultiWordActivities$1.f32651d;
            list2 = reviewSessionStateHolder$buildMultiWordActivities$1.f32650c;
            ec8Var2 = reviewSessionStateHolder$buildMultiWordActivities$1.f32649b;
            list3 = reviewSessionStateHolder$buildMultiWordActivities$1.f32648a;
            AbstractC3193b.m15359b(obj);
            list4 = list12;
        } else {
            if (i7 == 2) {
                z = reviewSessionStateHolder$buildMultiWordActivities$1.f32655h;
                i3 = reviewSessionStateHolder$buildMultiWordActivities$1.f32654g;
                i2 = reviewSessionStateHolder$buildMultiWordActivities$1.f32653f;
                List list13 = reviewSessionStateHolder$buildMultiWordActivities$1.f32651d;
                list6 = reviewSessionStateHolder$buildMultiWordActivities$1.f32650c;
                ec8Var3 = reviewSessionStateHolder$buildMultiWordActivities$1.f32649b;
                list5 = reviewSessionStateHolder$buildMultiWordActivities$1.f32648a;
                AbstractC3193b.m15359b(obj);
                list7 = list13;
                zBooleanValue = ((Boolean) obj).booleanValue();
                reviewSessionStateHolder$buildMultiWordActivities$1.f32648a = list5;
                reviewSessionStateHolder$buildMultiWordActivities$1.f32649b = ec8Var3;
                reviewSessionStateHolder$buildMultiWordActivities$1.f32650c = list6;
                reviewSessionStateHolder$buildMultiWordActivities$1.f32651d = list7;
                reviewSessionStateHolder$buildMultiWordActivities$1.f32653f = i2;
                reviewSessionStateHolder$buildMultiWordActivities$1.f32654g = i3;
                reviewSessionStateHolder$buildMultiWordActivities$1.f32655h = z;
                reviewSessionStateHolder$buildMultiWordActivities$1.f32656i = zBooleanValue;
                reviewSessionStateHolder$buildMultiWordActivities$1.f32647H = 3;
                objM15541t = AbstractC3224d.m15541t(((C1370c) ig8Var).f18546p0, reviewSessionStateHolder$buildMultiWordActivities$1);
                if (objM15541t != coroutineSingletons) {
                    z2 = zBooleanValue;
                    obj = objM15541t;
                    List list14 = list6;
                    i4 = i3;
                    list8 = list14;
                    ec8 ec8Var5 = ec8Var3;
                    i5 = i2;
                    ec8Var4 = ec8Var5;
                    list9 = list7;
                    zBooleanValue2 = ((Boolean) obj).booleanValue();
                    if (z) {
                        List listM22625q1 = u91.m22625q1(list9);
                        Collections.shuffle(listM22625q1);
                        setM22627s1 = u91.m22627s1(listM22625q1);
                        if (setM22627s1.size() >= 3) {
                            if (i4 != 1) {
                                list8.add(new ib8(u91.m22615g1(setM22627s1, 3)));
                            } else {
                                int i8 = ec8Var4.f37005c;
                                reviewSessionStateHolder$buildMultiWordActivities$1.f32648a = list5;
                                reviewSessionStateHolder$buildMultiWordActivities$1.f32649b = ec8Var4;
                                reviewSessionStateHolder$buildMultiWordActivities$1.f32650c = list8;
                                reviewSessionStateHolder$buildMultiWordActivities$1.f32651d = null;
                                reviewSessionStateHolder$buildMultiWordActivities$1.f32652e = setM22627s1;
                                reviewSessionStateHolder$buildMultiWordActivities$1.f32653f = i5;
                                reviewSessionStateHolder$buildMultiWordActivities$1.f32654g = i4;
                                reviewSessionStateHolder$buildMultiWordActivities$1.f32655h = z;
                                reviewSessionStateHolder$buildMultiWordActivities$1.f32656i = z2;
                                reviewSessionStateHolder$buildMultiWordActivities$1.f32657j = zBooleanValue2;
                                reviewSessionStateHolder$buildMultiWordActivities$1.f32647H = 4;
                                objM7117g = ((C1287c) this.f32749h.f57897a).m7117g(i8, reviewSessionStateHolder$buildMultiWordActivities$1);
                                if (objM7117g != coroutineSingletons) {
                                    z3 = z2;
                                    set = setM22627s1;
                                    z4 = zBooleanValue2;
                                    obj = objM7117g;
                                    list10 = list5;
                                }
                            }
                        }
                    }
                    if (list8.isEmpty()) {
                        List list15 = list5;
                        list15.getClass();
                        List listM22625q2 = u91.m22625q1(list15);
                        Collections.shuffle(listM22625q2);
                        it = listM22625q2.iterator();
                        while (it.hasNext()) {
                            list8.add(new gb8((v0b) it.next()));
                        }
                    }
                    if (zBooleanValue2) {
                        list8.add(new mb8(ec8Var4.f37007e));
                    }
                    if (z2) {
                        list8.add(new lb8(ec8Var4.f37007e));
                    }
                    return list8;
                }
                return coroutineSingletons;
            }
            if (i7 == 3) {
                z2 = reviewSessionStateHolder$buildMultiWordActivities$1.f32656i;
                z = reviewSessionStateHolder$buildMultiWordActivities$1.f32655h;
                i4 = reviewSessionStateHolder$buildMultiWordActivities$1.f32654g;
                i5 = reviewSessionStateHolder$buildMultiWordActivities$1.f32653f;
                List list16 = reviewSessionStateHolder$buildMultiWordActivities$1.f32651d;
                List list17 = reviewSessionStateHolder$buildMultiWordActivities$1.f32650c;
                ec8 ec8Var6 = reviewSessionStateHolder$buildMultiWordActivities$1.f32649b;
                List list18 = reviewSessionStateHolder$buildMultiWordActivities$1.f32648a;
                AbstractC3193b.m15359b(obj);
                ec8Var4 = ec8Var6;
                list8 = list17;
                list5 = list18;
                list9 = list16;
                zBooleanValue2 = ((Boolean) obj).booleanValue();
                if (z && ec8Var4.f37003a != ReviewType.IntegratedWord && list9.size() > 2) {
                    List listM22625q3 = u91.m22625q1(list9);
                    Collections.shuffle(listM22625q3);
                    setM22627s1 = u91.m22627s1(listM22625q3);
                    if (setM22627s1.size() >= 3) {
                        if (i4 != 1) {
                            int i9 = ec8Var4.f37005c;
                            reviewSessionStateHolder$buildMultiWordActivities$1.f32648a = list5;
                            reviewSessionStateHolder$buildMultiWordActivities$1.f32649b = ec8Var4;
                            reviewSessionStateHolder$buildMultiWordActivities$1.f32650c = list8;
                            reviewSessionStateHolder$buildMultiWordActivities$1.f32651d = null;
                            reviewSessionStateHolder$buildMultiWordActivities$1.f32652e = setM22627s1;
                            reviewSessionStateHolder$buildMultiWordActivities$1.f32653f = i5;
                            reviewSessionStateHolder$buildMultiWordActivities$1.f32654g = i4;
                            reviewSessionStateHolder$buildMultiWordActivities$1.f32655h = z;
                            reviewSessionStateHolder$buildMultiWordActivities$1.f32656i = z2;
                            reviewSessionStateHolder$buildMultiWordActivities$1.f32657j = zBooleanValue2;
                            reviewSessionStateHolder$buildMultiWordActivities$1.f32647H = 4;
                            objM7117g = ((C1287c) this.f32749h.f57897a).m7117g(i9, reviewSessionStateHolder$buildMultiWordActivities$1);
                            if (objM7117g != coroutineSingletons) {
                                z3 = z2;
                                set = setM22627s1;
                                z4 = zBooleanValue2;
                                obj = objM7117g;
                                list10 = list5;
                            }
                            return coroutineSingletons;
                        }
                        list8.add(new ib8(u91.m22615g1(setM22627s1, 3)));
                    }
                }
                if (list8.isEmpty()) {
                    List list19 = list5;
                    list19.getClass();
                    List listM22625q4 = u91.m22625q1(list19);
                    Collections.shuffle(listM22625q4);
                    it = listM22625q4.iterator();
                    while (it.hasNext()) {
                        list8.add(new gb8((v0b) it.next()));
                    }
                }
                if (zBooleanValue2) {
                    list8.add(new mb8(ec8Var4.f37007e));
                }
                if (z2 && this.f32761t && !vk9.m23391n0(AbstractC3184kh.m15226t(cmaVar.mo4589b2()))) {
                    list8.add(new lb8(ec8Var4.f37007e));
                }
                return list8;
            }
            if (i7 != 4) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z4 = reviewSessionStateHolder$buildMultiWordActivities$1.f32657j;
            z3 = reviewSessionStateHolder$buildMultiWordActivities$1.f32656i;
            set = reviewSessionStateHolder$buildMultiWordActivities$1.f32652e;
            List list20 = reviewSessionStateHolder$buildMultiWordActivities$1.f32651d;
            list8 = reviewSessionStateHolder$buildMultiWordActivities$1.f32650c;
            ec8Var4 = reviewSessionStateHolder$buildMultiWordActivities$1.f32649b;
            list10 = reviewSessionStateHolder$buildMultiWordActivities$1.f32648a;
            AbstractC3193b.m15359b(obj);
        }
        arrayList = new ArrayList();
        for (Object obj2 : (Iterable) obj) {
            if (!((LessonCard) obj2).f19183f.isEmpty()) {
                arrayList.add(obj2);
            }
        }
        arrayList2 = new ArrayList(v91.m23189q0(arrayList, 10));
        it2 = arrayList.iterator();
        while (it2.hasNext()) {
            String str = ((LessonCard) it2.next()).f19178a;
            Locale localeForLanguageTag = Locale.forLanguageTag(cmaVar.mo4589b2());
            localeForLanguageTag.getClass();
            arrayList2.add(vz1.m23610P(str, localeForLanguageTag));
        }
        it3 = u91.m22632y0(set, 3).iterator();
        while (it3.hasNext()) {
            setM22626r1 = u91.m22626r1(u91.m22627s1((List) it3.next()));
            if (AbstractC3489q9.m19764A(setM22626r1, arrayList2).size() >= 3) {
                while (setM22626r1.size() < 3) {
                    Random$Default random$Default = jq7.f46010a;
                    setM22626r1.add(u91.m22605W0(arrayList2));
                }
                List listM22625q5 = u91.m22625q1(setM22626r1);
                Collections.shuffle(listM22625q5);
                list8.add(new ib8(u91.m22615g1(listM22625q5, 3)));
            }
        }
        zBooleanValue2 = z4;
        list5 = list10;
        z2 = z3;
        if (list8.isEmpty()) {
            List list110 = list5;
            list110.getClass();
            List listM22625q6 = u91.m22625q1(list110);
            Collections.shuffle(listM22625q6);
            it = listM22625q6.iterator();
            while (it.hasNext()) {
                list8.add(new gb8((v0b) it.next()));
            }
        }
        if (zBooleanValue2) {
            list8.add(new mb8(ec8Var4.f37007e));
        }
        if (z2) {
            list8.add(new lb8(ec8Var4.f37007e));
        }
        return list8;
        boolean zBooleanValue3 = ((Boolean) obj).booleanValue();
        reviewSessionStateHolder$buildMultiWordActivities$1.f32648a = list3;
        reviewSessionStateHolder$buildMultiWordActivities$1.f32649b = ec8Var2;
        reviewSessionStateHolder$buildMultiWordActivities$1.f32650c = list2;
        reviewSessionStateHolder$buildMultiWordActivities$1.f32651d = list4;
        reviewSessionStateHolder$buildMultiWordActivities$1.f32653f = i;
        reviewSessionStateHolder$buildMultiWordActivities$1.f32654g = size;
        reviewSessionStateHolder$buildMultiWordActivities$1.f32655h = zBooleanValue3;
        reviewSessionStateHolder$buildMultiWordActivities$1.f32647H = 2;
        Object objM15541t3 = AbstractC3224d.m15541t(((C1370c) ig8Var).f18548q0, reviewSessionStateHolder$buildMultiWordActivities$1);
        if (objM15541t3 != coroutineSingletons) {
            int i10 = size;
            z = zBooleanValue3;
            obj = objM15541t3;
            list5 = list3;
            ec8Var3 = ec8Var2;
            list6 = list2;
            list7 = list4;
            i2 = i;
            i3 = i10;
            zBooleanValue = ((Boolean) obj).booleanValue();
            reviewSessionStateHolder$buildMultiWordActivities$1.f32648a = list5;
            reviewSessionStateHolder$buildMultiWordActivities$1.f32649b = ec8Var3;
            reviewSessionStateHolder$buildMultiWordActivities$1.f32650c = list6;
            reviewSessionStateHolder$buildMultiWordActivities$1.f32651d = list7;
            reviewSessionStateHolder$buildMultiWordActivities$1.f32653f = i2;
            reviewSessionStateHolder$buildMultiWordActivities$1.f32654g = i3;
            reviewSessionStateHolder$buildMultiWordActivities$1.f32655h = z;
            reviewSessionStateHolder$buildMultiWordActivities$1.f32656i = zBooleanValue;
            reviewSessionStateHolder$buildMultiWordActivities$1.f32647H = 3;
            objM15541t = AbstractC3224d.m15541t(((C1370c) ig8Var).f18546p0, reviewSessionStateHolder$buildMultiWordActivities$1);
            if (objM15541t != coroutineSingletons) {
                z2 = zBooleanValue;
                obj = objM15541t;
                List list111 = list6;
                i4 = i3;
                list8 = list111;
                ec8 ec8Var7 = ec8Var3;
                i5 = i2;
                ec8Var4 = ec8Var7;
                list9 = list7;
                zBooleanValue2 = ((Boolean) obj).booleanValue();
                if (z) {
                    List listM22625q7 = u91.m22625q1(list9);
                    Collections.shuffle(listM22625q7);
                    setM22627s1 = u91.m22627s1(listM22625q7);
                    if (setM22627s1.size() >= 3) {
                        if (i4 != 1) {
                            list8.add(new ib8(u91.m22615g1(setM22627s1, 3)));
                        } else {
                            int i11 = ec8Var4.f37005c;
                            reviewSessionStateHolder$buildMultiWordActivities$1.f32648a = list5;
                            reviewSessionStateHolder$buildMultiWordActivities$1.f32649b = ec8Var4;
                            reviewSessionStateHolder$buildMultiWordActivities$1.f32650c = list8;
                            reviewSessionStateHolder$buildMultiWordActivities$1.f32651d = null;
                            reviewSessionStateHolder$buildMultiWordActivities$1.f32652e = setM22627s1;
                            reviewSessionStateHolder$buildMultiWordActivities$1.f32653f = i5;
                            reviewSessionStateHolder$buildMultiWordActivities$1.f32654g = i4;
                            reviewSessionStateHolder$buildMultiWordActivities$1.f32655h = z;
                            reviewSessionStateHolder$buildMultiWordActivities$1.f32656i = z2;
                            reviewSessionStateHolder$buildMultiWordActivities$1.f32657j = zBooleanValue2;
                            reviewSessionStateHolder$buildMultiWordActivities$1.f32647H = 4;
                            objM7117g = ((C1287c) this.f32749h.f57897a).m7117g(i11, reviewSessionStateHolder$buildMultiWordActivities$1);
                            if (objM7117g != coroutineSingletons) {
                                z3 = z2;
                                set = setM22627s1;
                                z4 = zBooleanValue2;
                                obj = objM7117g;
                                list10 = list5;
                                arrayList = new ArrayList();
                                while (r1.hasNext()) {
                                    if (!((LessonCard) obj2).f19183f.isEmpty()) {
                                        arrayList.add(obj2);
                                    }
                                }
                                arrayList2 = new ArrayList(v91.m23189q0(arrayList, 10));
                                it2 = arrayList.iterator();
                                while (it2.hasNext()) {
                                    String str2 = ((LessonCard) it2.next()).f19178a;
                                    Locale localeForLanguageTag2 = Locale.forLanguageTag(cmaVar.mo4589b2());
                                    localeForLanguageTag2.getClass();
                                    arrayList2.add(vz1.m23610P(str2, localeForLanguageTag2));
                                }
                                it3 = u91.m22632y0(set, 3).iterator();
                                while (it3.hasNext()) {
                                    setM22626r1 = u91.m22626r1(u91.m22627s1((List) it3.next()));
                                    if (AbstractC3489q9.m19764A(setM22626r1, arrayList2).size() >= 3) {
                                        while (setM22626r1.size() < 3) {
                                            Random$Default random$Default2 = jq7.f46010a;
                                            setM22626r1.add(u91.m22605W0(arrayList2));
                                        }
                                        List listM22625q8 = u91.m22625q1(setM22626r1);
                                        Collections.shuffle(listM22625q8);
                                        list8.add(new ib8(u91.m22615g1(listM22625q8, 3)));
                                    }
                                }
                                zBooleanValue2 = z4;
                                list5 = list10;
                                z2 = z3;
                            }
                        }
                    }
                }
                if (list8.isEmpty()) {
                    List list112 = list5;
                    list112.getClass();
                    List listM22625q9 = u91.m22625q1(list112);
                    Collections.shuffle(listM22625q9);
                    it = listM22625q9.iterator();
                    while (it.hasNext()) {
                        list8.add(new gb8((v0b) it.next()));
                    }
                }
                if (zBooleanValue2) {
                    list8.add(new mb8(ec8Var4.f37007e));
                }
                if (z2) {
                    list8.add(new lb8(ec8Var4.f37007e));
                }
                return list8;
            }
        }
        return coroutineSingletons;
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: a0 */
    public final boolean mo4588a0() {
        return this.f32742a.mo4588a0();
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:102:0x0214  */
    /* JADX WARN: Code duplicated, block: B:103:0x0216  */
    /* JADX WARN: Code duplicated, block: B:106:0x0227  */
    /* JADX WARN: Code duplicated, block: B:111:0x0240  */
    /* JADX WARN: Code duplicated, block: B:112:0x0247  */
    /* JADX WARN: Code duplicated, block: B:114:0x024f  */
    /* JADX WARN: Code duplicated, block: B:115:0x0256  */
    /* JADX WARN: Code duplicated, block: B:117:0x025e  */
    /* JADX WARN: Code duplicated, block: B:118:0x026b  */
    /* JADX WARN: Code duplicated, block: B:120:0x0275  */
    /* JADX WARN: Code duplicated, block: B:122:0x0281  */
    /* JADX WARN: Code duplicated, block: B:123:0x0284  */
    /* JADX WARN: Code duplicated, block: B:126:0x0288  */
    /* JADX WARN: Code duplicated, block: B:129:0x0293  */
    /* JADX WARN: Code duplicated, block: B:130:0x0296  */
    /* JADX WARN: Code duplicated, block: B:132:0x029f  */
    /* JADX WARN: Code duplicated, block: B:134:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:136:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:137:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:140:0x02c3  */
    /* JADX WARN: Code duplicated, block: B:141:0x02c6  */
    /* JADX WARN: Code duplicated, block: B:144:0x02ca  */
    /* JADX WARN: Code duplicated, block: B:146:0x02d2  */
    /* JADX WARN: Code duplicated, block: B:148:0x02da  */
    /* JADX WARN: Code duplicated, block: B:149:0x02e9  */
    /* JADX WARN: Code duplicated, block: B:151:0x02f1  */
    /* JADX WARN: Code duplicated, block: B:152:0x02f9  */
    /* JADX WARN: Code duplicated, block: B:162:0x00e4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:165:0x00b9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:182:0x018f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:184:0x017d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:193:0x01db A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:195:0x01a5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:200:0x022e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:201:0x02fc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:203:0x01f8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:204:0x01f8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:27:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:42:0x00eb A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:43:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:45:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:46:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:50:0x0109  */
    /* JADX WARN: Code duplicated, block: B:52:0x0124  */
    /* JADX WARN: Code duplicated, block: B:53:0x0126  */
    /* JADX WARN: Code duplicated, block: B:55:0x0129  */
    /* JADX WARN: Code duplicated, block: B:60:0x014b  */
    /* JADX WARN: Code duplicated, block: B:74:0x017c  */
    /* JADX WARN: Code duplicated, block: B:76:0x017f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:82:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:84:0x01a7  */
    /* JADX WARN: Instruction removed from duplicated block: B:118:0x026b, please report this as an issue */
    /* JADX INFO: renamed from: b */
    public final Serializable m9644b(List list, ec8 ec8Var, ContinuationImpl continuationImpl) throws Throwable {
        ReviewSessionStateHolder$buildSingleWordActivities$1 reviewSessionStateHolder$buildSingleWordActivities$1;
        ec8 ec8Var2;
        List list2;
        boolean z;
        boolean z2;
        boolean z3;
        ob8 ob8Var;
        boolean z4;
        List<v0b> list3;
        af8 af8Var;
        int i;
        int i2;
        EmptyList emptyList;
        boolean z5;
        LinkedHashMap linkedHashMap;
        int size;
        ArrayList arrayList;
        int i3;
        ArrayList arrayList2;
        int i4;
        boolean z6;
        LinkedHashMap linkedHashMap2;
        ArrayList arrayList3;
        Iterator it;
        v0b v0bVar;
        int i5;
        List list4;
        int iIntValue;
        nb8 db8Var;
        TokenMeaning tokenMeaning;
        String str;
        TokenMeaning tokenMeaning2;
        String str2;
        TokenMeaning tokenMeaning3;
        String str3;
        TokenMeaning tokenMeaning4;
        String str4;
        boolean z7;
        int iM14247e;
        boolean z8;
        int iM14247e2;
        int i6;
        int iM14247e3;
        List list5;
        boolean z9;
        boolean zM9642h;
        if (continuationImpl instanceof ReviewSessionStateHolder$buildSingleWordActivities$1) {
            reviewSessionStateHolder$buildSingleWordActivities$1 = (ReviewSessionStateHolder$buildSingleWordActivities$1) continuationImpl;
            int i7 = reviewSessionStateHolder$buildSingleWordActivities$1.f32669j;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                reviewSessionStateHolder$buildSingleWordActivities$1.f32669j = i7 - Integer.MIN_VALUE;
            } else {
                reviewSessionStateHolder$buildSingleWordActivities$1 = new ReviewSessionStateHolder$buildSingleWordActivities$1(this, continuationImpl);
            }
        } else {
            reviewSessionStateHolder$buildSingleWordActivities$1 = new ReviewSessionStateHolder$buildSingleWordActivities$1(this, continuationImpl);
        }
        Object objM9594a = reviewSessionStateHolder$buildSingleWordActivities$1.f32667h;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i8 = reviewSessionStateHolder$buildSingleWordActivities$1.f32669j;
        C2755a c2755a = this.f32743b;
        if (i8 == 0) {
            AbstractC3193b.m15359b(objM9594a);
            boolean z10 = this.f32761t;
            reviewSessionStateHolder$buildSingleWordActivities$1.f32660a = list;
            ec8Var2 = ec8Var;
            reviewSessionStateHolder$buildSingleWordActivities$1.f32661b = ec8Var2;
            reviewSessionStateHolder$buildSingleWordActivities$1.f32669j = 1;
            objM9594a = c2755a.m9594a(z10, reviewSessionStateHolder$buildSingleWordActivities$1);
            if (objM9594a != coroutineSingletons) {
                list2 = list;
            }
            return coroutineSingletons;
        }
        if (i8 == 1) {
            ec8Var2 = reviewSessionStateHolder$buildSingleWordActivities$1.f32661b;
            list2 = reviewSessionStateHolder$buildSingleWordActivities$1.f32660a;
            AbstractC3193b.m15359b(objM9594a);
        } else {
            if (i8 != 2) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            boolean z11 = reviewSessionStateHolder$buildSingleWordActivities$1.f32666g;
            boolean z12 = reviewSessionStateHolder$buildSingleWordActivities$1.f32665f;
            boolean z13 = reviewSessionStateHolder$buildSingleWordActivities$1.f32664e;
            boolean z14 = reviewSessionStateHolder$buildSingleWordActivities$1.f32663d;
            ob8 ob8Var2 = reviewSessionStateHolder$buildSingleWordActivities$1.f32662c;
            ec8 ec8Var3 = reviewSessionStateHolder$buildSingleWordActivities$1.f32661b;
            list3 = reviewSessionStateHolder$buildSingleWordActivities$1.f32660a;
            AbstractC3193b.m15359b(objM9594a);
            z3 = z11;
            z2 = z12;
            ob8Var = ob8Var2;
            ec8Var2 = ec8Var3;
            z = z13;
            z4 = z14;
        }
        af8Var = new af8(z4, z, z2, z3, ((Boolean) objM9594a).booleanValue(), ob8Var.f54137e);
        i = 0;
        i2 = 0;
        for (ReviewActivityType reviewActivityType : ReviewActivityType.getEntries()) {
            zM9642h = m9642h(reviewActivityType.ordinal(), af8Var);
            if (!zM9642h && (reviewActivityType == ReviewActivityType.DictationActivity || reviewActivityType == ReviewActivityType.DictationReverseActivity || reviewActivityType == ReviewActivityType.MultiChoiceActivity || reviewActivityType == ReviewActivityType.MultiChoiceReverseActivity)) {
                i2 += 2;
            } else if (zM9642h) {
                i2++;
            }
        }
        emptyList = EmptyList.f47638a;
        if (i2 == 0) {
            return emptyList;
        }
        if (ec8Var2.f37003a == ReviewType.Page) {
            z5 = true;
        } else {
            z5 = false;
        }
        Random$Default random$Default = jq7.f46010a;
        linkedHashMap = new LinkedHashMap();
        for (v0b v0bVar2 : list3) {
            linkedHashMap.put(v0bVar2, new ArrayList());
            this.f32759r.put(v0bVar2.f64672b, Integer.valueOf(i));
            if (z5) {
                i6 = 1;
            } else {
                i6 = 2;
            }
            while (i6 >= 1) {
                iM14247e3 = jq7.f46011b.m14247e(ReviewActivityType.getEntries().size());
                list5 = (List) linkedHashMap.get(v0bVar2);
                if (list5 == null && list5.contains(Integer.valueOf(iM14247e3))) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (!m9642h(iM14247e3, af8Var) && (!z9 || i2 == 1)) {
                    List list6 = (List) linkedHashMap.get(v0bVar2);
                    if (list6 != null) {
                        list6.add(Integer.valueOf(iM14247e3));
                    }
                    i6--;
                    if (i2 < 1) {
                        i = 0;
                        i6 = 0;
                    }
                }
                i = 0;
            }
        }
        size = list3.size();
        Random$Default random$Default2 = jq7.f46010a;
        arrayList = new ArrayList();
        for (i3 = 0; i3 < size; i3++) {
            z8 = false;
            while (!z8) {
                iM14247e2 = jq7.f46011b.m14247e(size);
                if (!arrayList.contains(Integer.valueOf(iM14247e2))) {
                    arrayList.add(Integer.valueOf(iM14247e2));
                    z8 = true;
                }
            }
        }
        arrayList2 = new ArrayList();
        z6 = false;
        for (i4 = 0; i4 < size; i4++) {
            z7 = false;
            while (!z7) {
                iM14247e = jq7.f46011b.m14247e(size);
                if (size > 1 || z6) {
                    if (!arrayList2.contains(Integer.valueOf(iM14247e))) {
                        arrayList2.add(Integer.valueOf(iM14247e));
                        z6 = true;
                        z7 = true;
                    }
                } else if (((Number) AbstractC3393o1.m17731f(1, arrayList)).intValue() != iM14247e && !arrayList2.contains(Integer.valueOf(iM14247e))) {
                    arrayList2.add(Integer.valueOf(iM14247e));
                    z6 = true;
                    z7 = true;
                }
            }
        }
        ArrayList arrayListM22603U0 = u91.m22603U0(arrayList2, arrayList);
        linkedHashMap2 = new LinkedHashMap();
        arrayList3 = new ArrayList();
        it = arrayListM22603U0.iterator();
        while (it.hasNext()) {
            v0bVar = (v0b) list3.get(((Number) it.next()).intValue());
            if (linkedHashMap2.get(v0bVar) == null) {
                i5 = 0;
            } else {
                i5 = 1;
            }
            linkedHashMap2.put(v0bVar, new Integer(i5));
            list4 = (List) linkedHashMap.get(v0bVar);
            if (list4 == null) {
                list4 = emptyList;
            }
            if (i5 >= list4.size()) {
                iIntValue = ((Number) list4.get(i5)).intValue();
                if (iIntValue == ReviewActivityType.FlashcardActivity.ordinal()) {
                    db8Var = new gb8(v0bVar);
                } else if (iIntValue == ReviewActivityType.FlashcardReverseActivity.ordinal()) {
                    db8Var = new hb8(v0bVar);
                } else if (iIntValue == ReviewActivityType.DictationActivity.ordinal()) {
                    String str5 = v0bVar.f64672b;
                    db8Var = new eb8(v0bVar, str5, m9649g(str5));
                } else if (iIntValue == ReviewActivityType.DictationReverseActivity.ordinal()) {
                    tokenMeaning3 = (TokenMeaning) u91.m22591I0(v0bVar.f64675e);
                    if (tokenMeaning3 != null) {
                        str3 = tokenMeaning3.f19596c;
                    } else {
                        str3 = null;
                    }
                    String str6 = str3 != null ? str3 : "";
                    tokenMeaning4 = (TokenMeaning) u91.m22591I0(v0bVar.f64675e);
                    if (tokenMeaning4 != null) {
                        str4 = tokenMeaning4.f19596c;
                    } else {
                        str4 = null;
                    }
                    db8Var = new fb8(v0bVar, str6, m9648f(str4));
                } else if (iIntValue == ReviewActivityType.MultiChoiceActivity.ordinal()) {
                    tokenMeaning = (TokenMeaning) u91.m22591I0(v0bVar.f64675e);
                    if (tokenMeaning != null) {
                        str = tokenMeaning.f19596c;
                    } else {
                        str = null;
                    }
                    ArrayList arrayListM9648f = m9648f(str);
                    tokenMeaning2 = (TokenMeaning) u91.m22591I0(v0bVar.f64675e);
                    if (tokenMeaning2 != null) {
                        str2 = tokenMeaning2.f19596c;
                    } else {
                        str2 = null;
                    }
                    db8Var = new jb8(v0bVar, str2 != null ? str2 : "", arrayListM9648f);
                } else if (iIntValue == ReviewActivityType.MultiChoiceReverseActivity.ordinal()) {
                    db8Var = new kb8(v0bVar, v0bVar.f64672b, m9649g(v0bVar.f64672b));
                } else if (iIntValue == ReviewActivityType.ClozeActivity.ordinal()) {
                    db8Var = new db8(v0bVar, v0bVar.f64672b);
                } else {
                    db8Var = null;
                }
                if (db8Var != null) {
                    arrayList3.add(db8Var);
                }
            }
        }
        return arrayList3;
        ob8 ob8Var3 = (ob8) objM9594a;
        boolean z15 = ob8Var3.f54133a;
        z = ob8Var3.f54134b;
        z2 = ob8Var3.f54135c;
        z3 = ob8Var3.f54136d;
        reviewSessionStateHolder$buildSingleWordActivities$1.f32660a = list2;
        reviewSessionStateHolder$buildSingleWordActivities$1.f32661b = ec8Var2;
        reviewSessionStateHolder$buildSingleWordActivities$1.f32662c = ob8Var3;
        reviewSessionStateHolder$buildSingleWordActivities$1.f32663d = z15;
        reviewSessionStateHolder$buildSingleWordActivities$1.f32664e = z;
        reviewSessionStateHolder$buildSingleWordActivities$1.f32665f = z2;
        reviewSessionStateHolder$buildSingleWordActivities$1.f32666g = z3;
        reviewSessionStateHolder$buildSingleWordActivities$1.f32669j = 2;
        Object objM15541t = AbstractC3224d.m15541t(((C1370c) ((ig8) c2755a.f32467a)).f18505Q, reviewSessionStateHolder$buildSingleWordActivities$1);
        if (objM15541t != coroutineSingletons) {
            ob8Var = ob8Var3;
            z4 = z15;
            objM9594a = objM15541t;
            list3 = list2;
            af8Var = new af8(z4, z, z2, z3, ((Boolean) objM9594a).booleanValue(), ob8Var.f54137e);
            i = 0;
            i2 = 0;
            while (r1.hasNext()) {
                zM9642h = m9642h(reviewActivityType.ordinal(), af8Var);
                if (!zM9642h) {
                }
                if (zM9642h) {
                    i2++;
                }
            }
            emptyList = EmptyList.f47638a;
            if (i2 == 0) {
                return emptyList;
            }
            if (ec8Var2.f37003a == ReviewType.Page) {
                z5 = true;
            } else {
                z5 = false;
            }
            Random$Default random$Default3 = jq7.f46010a;
            linkedHashMap = new LinkedHashMap();
            while (r11.hasNext()) {
                linkedHashMap.put(v0bVar2, new ArrayList());
                this.f32759r.put(v0bVar2.f64672b, Integer.valueOf(i));
                if (z5) {
                    i6 = 1;
                } else {
                    i6 = 2;
                }
                while (i6 >= 1) {
                    iM14247e3 = jq7.f46011b.m14247e(ReviewActivityType.getEntries().size());
                    list5 = (List) linkedHashMap.get(v0bVar2);
                    if (list5 == null) {
                        z9 = false;
                    } else {
                        z9 = false;
                    }
                    if (!m9642h(iM14247e3, af8Var)) {
                    }
                    i = 0;
                }
            }
            size = list3.size();
            Random$Default random$Default4 = jq7.f46010a;
            arrayList = new ArrayList();
            while (i3 < size) {
                z8 = false;
                while (!z8) {
                    iM14247e2 = jq7.f46011b.m14247e(size);
                    if (!arrayList.contains(Integer.valueOf(iM14247e2))) {
                        arrayList.add(Integer.valueOf(iM14247e2));
                        z8 = true;
                    }
                }
            }
            arrayList2 = new ArrayList();
            z6 = false;
            while (i4 < size) {
                z7 = false;
                while (!z7) {
                    iM14247e = jq7.f46011b.m14247e(size);
                    if (size > 1) {
                    }
                    if (!arrayList2.contains(Integer.valueOf(iM14247e))) {
                        arrayList2.add(Integer.valueOf(iM14247e));
                        z6 = true;
                        z7 = true;
                    }
                }
            }
            ArrayList arrayListM22603U1 = u91.m22603U0(arrayList2, arrayList);
            linkedHashMap2 = new LinkedHashMap();
            arrayList3 = new ArrayList();
            it = arrayListM22603U1.iterator();
            while (it.hasNext()) {
                v0bVar = (v0b) list3.get(((Number) it.next()).intValue());
                if (linkedHashMap2.get(v0bVar) == null) {
                    i5 = 0;
                } else {
                    i5 = 1;
                }
                linkedHashMap2.put(v0bVar, new Integer(i5));
                list4 = (List) linkedHashMap.get(v0bVar);
                if (list4 == null) {
                    list4 = emptyList;
                }
                if (i5 >= list4.size()) {
                    iIntValue = ((Number) list4.get(i5)).intValue();
                    if (iIntValue == ReviewActivityType.FlashcardActivity.ordinal()) {
                        db8Var = new gb8(v0bVar);
                    } else if (iIntValue == ReviewActivityType.FlashcardReverseActivity.ordinal()) {
                        db8Var = new hb8(v0bVar);
                    } else if (iIntValue == ReviewActivityType.DictationActivity.ordinal()) {
                        String str7 = v0bVar.f64672b;
                        db8Var = new eb8(v0bVar, str7, m9649g(str7));
                    } else if (iIntValue == ReviewActivityType.DictationReverseActivity.ordinal()) {
                        tokenMeaning3 = (TokenMeaning) u91.m22591I0(v0bVar.f64675e);
                        if (tokenMeaning3 != null) {
                            str3 = tokenMeaning3.f19596c;
                        } else {
                            str3 = null;
                        }
                        if (str3 != null) {
                        }
                        tokenMeaning4 = (TokenMeaning) u91.m22591I0(v0bVar.f64675e);
                        if (tokenMeaning4 != null) {
                            str4 = tokenMeaning4.f19596c;
                        } else {
                            str4 = null;
                        }
                        db8Var = new fb8(v0bVar, str6, m9648f(str4));
                    } else if (iIntValue == ReviewActivityType.MultiChoiceActivity.ordinal()) {
                        tokenMeaning = (TokenMeaning) u91.m22591I0(v0bVar.f64675e);
                        if (tokenMeaning != null) {
                            str = tokenMeaning.f19596c;
                        } else {
                            str = null;
                        }
                        ArrayList arrayListM9648f2 = m9648f(str);
                        tokenMeaning2 = (TokenMeaning) u91.m22591I0(v0bVar.f64675e);
                        if (tokenMeaning2 != null) {
                            str2 = tokenMeaning2.f19596c;
                        } else {
                            str2 = null;
                        }
                        db8Var = new jb8(v0bVar, str2 != null ? str2 : "", arrayListM9648f2);
                    } else if (iIntValue == ReviewActivityType.MultiChoiceReverseActivity.ordinal()) {
                        db8Var = new kb8(v0bVar, v0bVar.f64672b, m9649g(v0bVar.f64672b));
                    } else if (iIntValue == ReviewActivityType.ClozeActivity.ordinal()) {
                        db8Var = new db8(v0bVar, v0bVar.f64672b);
                    } else {
                        db8Var = null;
                    }
                    if (db8Var != null) {
                        arrayList3.add(db8Var);
                    }
                }
            }
            return arrayList3;
        }
        return coroutineSingletons;
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: b2 */
    public final String mo4589b2() {
        return this.f32742a.mo4589b2();
    }

    /* JADX INFO: renamed from: c */
    public final nb8 m9645c() {
        return (nb8) u91.m22592J0(this.f32757p, this.f32756o);
    }

    /* JADX WARN: Code duplicated, block: B:41:0x010c A[LOOP:0: B:39:0x0106->B:41:0x010c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:45:0x012d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX INFO: renamed from: d */
    public final Object m9646d(boolean z, ec8 ec8Var, ContinuationImpl continuationImpl) throws Throwable {
        ReviewSessionStateHolder$fetchCards$1 reviewSessionStateHolder$fetchCards$1;
        ec8 ec8Var2;
        Object obj;
        boolean z2;
        boolean z3;
        int i;
        ec8 ec8Var3;
        int i2;
        ArrayList arrayList;
        Iterator it;
        Object objM9653l;
        if (continuationImpl instanceof ReviewSessionStateHolder$fetchCards$1) {
            reviewSessionStateHolder$fetchCards$1 = (ReviewSessionStateHolder$fetchCards$1) continuationImpl;
            int i3 = reviewSessionStateHolder$fetchCards$1.f32676g;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                reviewSessionStateHolder$fetchCards$1.f32676g = i3 - Integer.MIN_VALUE;
            } else {
                reviewSessionStateHolder$fetchCards$1 = new ReviewSessionStateHolder$fetchCards$1(this, continuationImpl);
            }
        } else {
            reviewSessionStateHolder$fetchCards$1 = new ReviewSessionStateHolder$fetchCards$1(this, continuationImpl);
        }
        ReviewSessionStateHolder$fetchCards$1 reviewSessionStateHolder$fetchCards$2 = reviewSessionStateHolder$fetchCards$1;
        Object objM15541t = reviewSessionStateHolder$fetchCards$2.f32674e;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i4 = reviewSessionStateHolder$fetchCards$2.f32676g;
        cma cmaVar = this.f32742a;
        if (i4 == 0) {
            AbstractC3193b.m15359b(objM15541t);
            String strMo4589b2 = cmaVar.mo4589b2();
            reviewSessionStateHolder$fetchCards$2.f32671b = ec8Var;
            reviewSessionStateHolder$fetchCards$2.f32670a = z;
            reviewSessionStateHolder$fetchCards$2.f32676g = 1;
            Object objM22378a = u0b.m22378a(this.f32746e.f64692a, strMo4589b2, 1, null, false, false, null, reviewSessionStateHolder$fetchCards$2, 28);
            if (objM22378a != obj2) {
                ec8Var2 = ec8Var;
                obj = objM22378a;
                z2 = z;
            }
            return obj2;
        }
        if (i4 == 1) {
            z2 = reviewSessionStateHolder$fetchCards$2.f32670a;
            ec8 ec8Var4 = reviewSessionStateHolder$fetchCards$2.f32671b;
            AbstractC3193b.m15359b(objM15541t);
            obj = objM15541t;
            ec8Var2 = ec8Var4;
        } else {
            if (i4 == 2) {
                i2 = reviewSessionStateHolder$fetchCards$2.f32673d;
                i = reviewSessionStateHolder$fetchCards$2.f32672c;
                z3 = reviewSessionStateHolder$fetchCards$2.f32670a;
                ec8Var3 = reviewSessionStateHolder$fetchCards$2.f32671b;
                AbstractC3193b.m15359b(objM15541t);
                reviewSessionStateHolder$fetchCards$2.f32671b = ec8Var3;
                reviewSessionStateHolder$fetchCards$2.f32670a = z3;
                reviewSessionStateHolder$fetchCards$2.f32672c = i;
                reviewSessionStateHolder$fetchCards$2.f32673d = i2;
                reviewSessionStateHolder$fetchCards$2.f32676g = 3;
                objM15541t = AbstractC3224d.m15541t((c83) objM15541t, reviewSessionStateHolder$fetchCards$2);
                if (objM15541t != obj2) {
                }
                return obj2;
            }
            if (i4 != 3) {
                if (i4 == 4) {
                    AbstractC3193b.m15359b(objM15541t);
                    return objM15541t;
                }
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i2 = reviewSessionStateHolder$fetchCards$2.f32673d;
            i = reviewSessionStateHolder$fetchCards$2.f32672c;
            z3 = reviewSessionStateHolder$fetchCards$2.f32670a;
            ec8Var3 = reviewSessionStateHolder$fetchCards$2.f32671b;
            AbstractC3193b.m15359b(objM15541t);
        }
        List list = (List) objM15541t;
        arrayList = new ArrayList(v91.m23189q0(list, 10));
        it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((mxa) it.next()).f52004b);
        }
        Set setM22627s1 = u91.m22627s1(arrayList);
        reviewSessionStateHolder$fetchCards$2.f32671b = null;
        reviewSessionStateHolder$fetchCards$2.f32670a = z3;
        reviewSessionStateHolder$fetchCards$2.f32672c = i;
        reviewSessionStateHolder$fetchCards$2.f32673d = i2;
        reviewSessionStateHolder$fetchCards$2.f32676g = 4;
        objM9653l = m9653l(setM22627s1, z3, ec8Var3, reviewSessionStateHolder$fetchCards$2);
        if (objM9653l != obj2) {
            return obj2;
        }
        return objM9653l;
        Triple triple = (Triple) obj;
        int iIntValue = ((Number) triple.f47633a).intValue();
        int iIntValue2 = ((Number) triple.f47634b).intValue();
        if (iIntValue == 0 && iIntValue2 == 0) {
            return EmptyList.f47638a;
        }
        String strMo4589b3 = cmaVar.mo4589b2();
        reviewSessionStateHolder$fetchCards$2.f32671b = ec8Var2;
        reviewSessionStateHolder$fetchCards$2.f32670a = z2;
        reviewSessionStateHolder$fetchCards$2.f32672c = iIntValue;
        reviewSessionStateHolder$fetchCards$2.f32673d = iIntValue2;
        reviewSessionStateHolder$fetchCards$2.f32676g = 2;
        ec8 ec8Var5 = ec8Var2;
        boolean z4 = z2;
        Object objM22379b = u0b.m22379b((u0b) this.f32747f.f66742a, strMo4589b3, 1, null, false, false, null, reviewSessionStateHolder$fetchCards$2, 60);
        if (objM22379b != obj2) {
            z3 = z4;
            objM15541t = objM22379b;
            i = iIntValue;
            ec8Var3 = ec8Var5;
            i2 = iIntValue2;
            reviewSessionStateHolder$fetchCards$2.f32671b = ec8Var3;
            reviewSessionStateHolder$fetchCards$2.f32670a = z3;
            reviewSessionStateHolder$fetchCards$2.f32672c = i;
            reviewSessionStateHolder$fetchCards$2.f32673d = i2;
            reviewSessionStateHolder$fetchCards$2.f32676g = 3;
            objM15541t = AbstractC3224d.m15541t((c83) objM15541t, reviewSessionStateHolder$fetchCards$2);
            if (objM15541t != obj2) {
                List list2 = (List) objM15541t;
                arrayList = new ArrayList(v91.m23189q0(list2, 10));
                it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(((mxa) it.next()).f52004b);
                }
                Set setM22627s2 = u91.m22627s1(arrayList);
                reviewSessionStateHolder$fetchCards$2.f32671b = null;
                reviewSessionStateHolder$fetchCards$2.f32670a = z3;
                reviewSessionStateHolder$fetchCards$2.f32672c = i;
                reviewSessionStateHolder$fetchCards$2.f32673d = i2;
                reviewSessionStateHolder$fetchCards$2.f32676g = 4;
                objM9653l = m9653l(setM22627s2, z3, ec8Var3, reviewSessionStateHolder$fetchCards$2);
                if (objM9653l != obj2) {
                    return objM9653l;
                }
            }
        }
        return obj2;
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: d0 */
    public final boolean mo4590d0() {
        return this.f32742a.mo4590d0();
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: e */
    public final Object m9647e(boolean z, ec8 ec8Var, ContinuationImpl continuationImpl) throws Throwable {
        ReviewSessionStateHolder$fetchLotdCards$1 reviewSessionStateHolder$fetchLotdCards$1;
        if (continuationImpl instanceof ReviewSessionStateHolder$fetchLotdCards$1) {
            reviewSessionStateHolder$fetchLotdCards$1 = (ReviewSessionStateHolder$fetchLotdCards$1) continuationImpl;
            int i = reviewSessionStateHolder$fetchLotdCards$1.f32681e;
            if ((i & Integer.MIN_VALUE) != 0) {
                reviewSessionStateHolder$fetchLotdCards$1.f32681e = i - Integer.MIN_VALUE;
            } else {
                reviewSessionStateHolder$fetchLotdCards$1 = new ReviewSessionStateHolder$fetchLotdCards$1(this, continuationImpl);
            }
        } else {
            reviewSessionStateHolder$fetchLotdCards$1 = new ReviewSessionStateHolder$fetchLotdCards$1(this, continuationImpl);
        }
        ReviewSessionStateHolder$fetchLotdCards$1 reviewSessionStateHolder$fetchLotdCards$2 = reviewSessionStateHolder$fetchLotdCards$1;
        Object objM22378a = reviewSessionStateHolder$fetchLotdCards$2.f32679c;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = reviewSessionStateHolder$fetchLotdCards$2.f32681e;
        if (i2 == 0) {
            AbstractC3193b.m15359b(objM22378a);
            String strMo4589b2 = this.f32742a.mo4589b2();
            String str = ec8Var.f37008f;
            reviewSessionStateHolder$fetchLotdCards$2.f32678b = ec8Var;
            reviewSessionStateHolder$fetchLotdCards$2.f32677a = z;
            reviewSessionStateHolder$fetchLotdCards$2.f32681e = 1;
            objM22378a = u0b.m22378a(this.f32746e.f64692a, strMo4589b2, 1, null, false, false, str, reviewSessionStateHolder$fetchLotdCards$2, 28);
            if (objM22378a != obj) {
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                AbstractC3193b.m15359b(objM22378a);
                return objM22378a;
            }
            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        z = reviewSessionStateHolder$fetchLotdCards$2.f32677a;
        ec8Var = reviewSessionStateHolder$fetchLotdCards$2.f32678b;
        AbstractC3193b.m15359b(objM22378a);
        List list = (List) ((Triple) objM22378a).f47635c;
        if (list.isEmpty()) {
            return EmptyList.f47638a;
        }
        Set setM22627s1 = u91.m22627s1(list);
        reviewSessionStateHolder$fetchLotdCards$2.f32678b = null;
        reviewSessionStateHolder$fetchLotdCards$2.f32677a = z;
        reviewSessionStateHolder$fetchLotdCards$2.f32681e = 2;
        Object objM9653l = m9653l(setM22627s1, z, ec8Var, reviewSessionStateHolder$fetchLotdCards$2);
        return objM9653l == obj ? obj : objM9653l;
    }

    /* JADX INFO: renamed from: f */
    public final ArrayList m9648f(String str) {
        ArrayList arrayList = new ArrayList();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        while (true) {
            if (linkedHashSet.size() >= 3 || linkedHashSet2.size() >= this.f32755n.size()) {
                break;
            }
            Random$Default random$Default = jq7.f46010a;
            int iM14247e = jq7.f46011b.m14247e(this.f32755n.size());
            linkedHashSet2.add(Integer.valueOf(iM14247e));
            TokenMeaning tokenMeaning = (TokenMeaning) u91.m22591I0(((v0b) this.f32755n.get(iM14247e)).f64675e);
            String str2 = tokenMeaning != null ? tokenMeaning.f19596c : null;
            if (str2 != null && !vk9.m23391n0(str2) && !str2.equals(str)) {
                linkedHashSet.add(Integer.valueOf(iM14247e));
            }
        }
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            TokenMeaning tokenMeaning2 = (TokenMeaning) u91.m22591I0(((v0b) this.f32755n.get(((Number) it.next()).intValue())).f64675e);
            String str3 = tokenMeaning2 != null ? tokenMeaning2.f19596c : null;
            if (str3 == null) {
                str3 = "";
            }
            arrayList.add(str3);
        }
        if (str != null) {
            Random$Default random$Default2 = jq7.f46010a;
            arrayList.add(jq7.f46011b.m14247e(arrayList.size() + 1), str);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: g */
    public final ArrayList m9649g(String str) {
        ArrayList arrayList = new ArrayList();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        while (linkedHashSet.size() < 3 && linkedHashSet2.size() < this.f32755n.size()) {
            Random$Default random$Default = jq7.f46010a;
            int iM14247e = jq7.f46011b.m14247e(this.f32755n.size());
            linkedHashSet2.add(Integer.valueOf(iM14247e));
            if (!fa4.m11650l(((v0b) this.f32755n.get(iM14247e)).f64672b, str)) {
                linkedHashSet.add(Integer.valueOf(iM14247e));
            }
        }
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            arrayList.add(((v0b) this.f32755n.get(((Number) it.next()).intValue())).f64672b);
        }
        Random$Default random$Default2 = jq7.f46010a;
        arrayList.add(jq7.f46011b.m14247e(arrayList.size() + 1), str);
        return arrayList;
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: h0 */
    public final Object mo4591h0(ProfileAccount profileAccount, Continuation continuation) {
        return this.f32742a.mo4591h0(profileAccount, continuation);
    }

    /* JADX WARN: Code duplicated, block: B:102:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:106:0x02c3  */
    /* JADX WARN: Code duplicated, block: B:108:0x02c6 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:111:0x01a9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:29:0x0123 A[PHI: r1 r2 r12
      0x0123: PHI (r1v4 java.util.Set) = (r1v1 java.util.Set), (r1v18 java.util.Set) binds: [B:27:0x011f, B:20:0x00ab] A[DONT_GENERATE, DONT_INLINE]
      0x0123: PHI (r2v15 java.lang.Object) = (r2v13 java.lang.Object), (r2v1 java.lang.Object) binds: [B:27:0x011f, B:20:0x00ab] A[DONT_GENERATE, DONT_INLINE]
      0x0123: PHI (r12v6 ec8) = (r12v4 ec8), (r12v7 ec8) binds: [B:27:0x011f, B:20:0x00ab] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:31:0x0132  */
    /* JADX WARN: Code duplicated, block: B:34:0x0145  */
    /* JADX WARN: Code duplicated, block: B:36:0x014e  */
    /* JADX WARN: Code duplicated, block: B:38:0x0152  */
    /* JADX WARN: Code duplicated, block: B:41:0x016b  */
    /* JADX WARN: Code duplicated, block: B:44:0x0177  */
    /* JADX WARN: Code duplicated, block: B:47:0x0188  */
    /* JADX WARN: Code duplicated, block: B:49:0x0193  */
    /* JADX WARN: Code duplicated, block: B:50:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:52:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:57:0x01be A[LOOP:1: B:55:0x01b8->B:57:0x01be, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:58:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:61:0x01df A[LOOP:2: B:59:0x01d9->B:61:0x01df, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:66:0x0205  */
    /* JADX WARN: Code duplicated, block: B:68:0x0209  */
    /* JADX WARN: Code duplicated, block: B:70:0x020d  */
    /* JADX WARN: Code duplicated, block: B:73:0x0220  */
    /* JADX WARN: Code duplicated, block: B:75:0x0228  */
    /* JADX WARN: Code duplicated, block: B:78:0x023b  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:82:0x024c  */
    /* JADX WARN: Code duplicated, block: B:84:0x024f  */
    /* JADX WARN: Code duplicated, block: B:86:0x0257  */
    /* JADX WARN: Code duplicated, block: B:89:0x0276  */
    /* JADX WARN: Code duplicated, block: B:91:0x027d  */
    /* JADX WARN: Code duplicated, block: B:94:0x028a  */
    /* JADX WARN: Code duplicated, block: B:97:0x029f  */
    /* JADX WARN: Code duplicated, block: B:99:0x02a3  */
    /* JADX INFO: renamed from: i */
    public final Object m9650i(ec8 ec8Var, Set set, ContinuationImpl continuationImpl) throws Throwable {
        ReviewSessionStateHolder$loadSession$1 reviewSessionStateHolder$loadSession$1;
        ec8 ec8Var2;
        Object obj;
        C2764d c2764d;
        boolean zBooleanValue;
        int i;
        Object objM9646d;
        boolean z;
        C2764d c2764d2;
        ec8 ec8Var3;
        Object objM9647e;
        Object objM7117g;
        Object objM9653l;
        List list;
        List list2;
        ArrayList arrayList;
        Iterator it;
        ArrayList arrayList2;
        ArrayList arrayList3;
        Iterator it2;
        String str;
        int iCompareTo;
        C2764d c2764d3;
        ec8 ec8Var4;
        boolean zM12970b;
        List list3;
        C2764d c2764d4;
        List list4;
        Set set2 = set;
        if (continuationImpl instanceof ReviewSessionStateHolder$loadSession$1) {
            reviewSessionStateHolder$loadSession$1 = (ReviewSessionStateHolder$loadSession$1) continuationImpl;
            int i2 = reviewSessionStateHolder$loadSession$1.f32689h;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                reviewSessionStateHolder$loadSession$1.f32689h = i2 - Integer.MIN_VALUE;
            } else {
                reviewSessionStateHolder$loadSession$1 = new ReviewSessionStateHolder$loadSession$1(this, continuationImpl);
            }
        } else {
            reviewSessionStateHolder$loadSession$1 = new ReviewSessionStateHolder$loadSession$1(this, continuationImpl);
        }
        Object objM9600g = reviewSessionStateHolder$loadSession$1.f32687f;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = reviewSessionStateHolder$loadSession$1.f32689h;
        cma cmaVar = this.f32742a;
        List list5 = EmptyList.f47638a;
        switch (i3) {
            case 0:
                AbstractC3193b.m15359b(objM9600g);
                this.f32762u = set2;
                this.f32757p = -1;
                this.f32758q = 0;
                this.f32759r.clear();
                this.f32760s.clear();
                this.f32754m = list5;
                this.f32755n = list5;
                this.f32756o = list5;
                c83 c83VarM13285v = this.f32752k.m13285v(cmaVar.mo4589b2());
                reviewSessionStateHolder$loadSession$1.f32682a = ec8Var;
                reviewSessionStateHolder$loadSession$1.f32683b = set2;
                reviewSessionStateHolder$loadSession$1.f32684c = this;
                reviewSessionStateHolder$loadSession$1.f32689h = 1;
                Object objM15541t = AbstractC3224d.m15541t(c83VarM13285v, reviewSessionStateHolder$loadSession$1);
                if (objM15541t != coroutineSingletons) {
                    ec8Var2 = ec8Var;
                    obj = objM15541t;
                    c2764d = this;
                    c2764d.f32761t = ((Boolean) obj).booleanValue();
                    reviewSessionStateHolder$loadSession$1.f32682a = ec8Var2;
                    reviewSessionStateHolder$loadSession$1.f32683b = set2;
                    reviewSessionStateHolder$loadSession$1.f32684c = null;
                    reviewSessionStateHolder$loadSession$1.f32689h = 2;
                    objM9600g = this.f32743b.m9600g(reviewSessionStateHolder$loadSession$1);
                    if (objM9600g != coroutineSingletons) {
                        zBooleanValue = ((Boolean) objM9600g).booleanValue();
                        if (set2.isEmpty()) {
                            i = ec8Var2.f37005c;
                            if (i != -1) {
                                reviewSessionStateHolder$loadSession$1.f32682a = ec8Var2;
                                reviewSessionStateHolder$loadSession$1.f32683b = null;
                                reviewSessionStateHolder$loadSession$1.f32684c = this;
                                reviewSessionStateHolder$loadSession$1.f32686e = zBooleanValue;
                                reviewSessionStateHolder$loadSession$1.f32689h = 4;
                                objM7117g = ((C1287c) this.f32749h.f57897a).m7117g(i, reviewSessionStateHolder$loadSession$1);
                                if (objM7117g != coroutineSingletons) {
                                    objM9600g = objM7117g;
                                    z = zBooleanValue;
                                    c2764d2 = this;
                                    list2 = (List) objM9600g;
                                    if (ec8Var2.f37003a == ReviewType.SrsDue) {
                                        arrayList3 = new ArrayList();
                                        for (Object obj2 : list2) {
                                            str = ((LessonCard) obj2).f19191n;
                                            if (str != null) {
                                                iCompareTo = str.compareTo(hy3.f43148E.m14766a(new DateTime()));
                                            } else {
                                                iCompareTo = 0;
                                            }
                                            if (iCompareTo < 0) {
                                                arrayList3.add(obj2);
                                            }
                                        }
                                        arrayList2 = new ArrayList(v91.m23189q0(arrayList3, 10));
                                        it2 = arrayList3.iterator();
                                        while (it2.hasNext()) {
                                            arrayList2.add(((LessonCard) it2.next()).f19178a);
                                        }
                                    } else {
                                        List list6 = list2;
                                        arrayList = new ArrayList(v91.m23189q0(list6, 10));
                                        it = list6.iterator();
                                        while (it.hasNext()) {
                                            arrayList.add(((LessonCard) it.next()).f19178a);
                                        }
                                        arrayList2 = arrayList;
                                    }
                                    Set setM22627s1 = u91.m22627s1(arrayList2);
                                    reviewSessionStateHolder$loadSession$1.f32682a = ec8Var2;
                                    reviewSessionStateHolder$loadSession$1.f32683b = null;
                                    reviewSessionStateHolder$loadSession$1.f32684c = null;
                                    reviewSessionStateHolder$loadSession$1.f32685d = c2764d2;
                                    reviewSessionStateHolder$loadSession$1.f32686e = z;
                                    reviewSessionStateHolder$loadSession$1.f32689h = 5;
                                    objM9600g = m9653l(setM22627s1, z, ec8Var2, reviewSessionStateHolder$loadSession$1);
                                    if (objM9600g != coroutineSingletons) {
                                        ec8Var3 = ec8Var2;
                                        list = (List) objM9600g;
                                        c2764d2.f32754m = list;
                                        if (this.f32754m.isEmpty()) {
                                            return fd8.f38913a;
                                        }
                                        if (gxc.m12970b(ec8Var3.f37003a)) {
                                            c2764d3 = this;
                                            c2764d3.f32755n = list5;
                                            zM12970b = gxc.m12970b(ec8Var3.f37003a);
                                            list3 = this.f32754m;
                                            if (zM12970b) {
                                                reviewSessionStateHolder$loadSession$1.f32682a = null;
                                                reviewSessionStateHolder$loadSession$1.f32683b = null;
                                                reviewSessionStateHolder$loadSession$1.f32684c = this;
                                                reviewSessionStateHolder$loadSession$1.f32685d = null;
                                                reviewSessionStateHolder$loadSession$1.f32686e = z;
                                                reviewSessionStateHolder$loadSession$1.f32689h = 9;
                                                objM9600g = m9643a(list3, ec8Var3, reviewSessionStateHolder$loadSession$1);
                                                if (objM9600g != coroutineSingletons) {
                                                    c2764d4 = this;
                                                    list4 = (List) objM9600g;
                                                    c2764d4.f32756o = list4;
                                                    if (this.f32756o.isEmpty()) {
                                                        return ed8.f37069a;
                                                    }
                                                    return null;
                                                }
                                            } else {
                                                reviewSessionStateHolder$loadSession$1.f32682a = null;
                                                reviewSessionStateHolder$loadSession$1.f32683b = null;
                                                reviewSessionStateHolder$loadSession$1.f32684c = this;
                                                reviewSessionStateHolder$loadSession$1.f32685d = null;
                                                reviewSessionStateHolder$loadSession$1.f32686e = z;
                                                reviewSessionStateHolder$loadSession$1.f32689h = 10;
                                                objM9600g = m9644b(list3, ec8Var3, reviewSessionStateHolder$loadSession$1);
                                                if (objM9600g != coroutineSingletons) {
                                                    c2764d4 = this;
                                                    list4 = (List) objM9600g;
                                                    c2764d4.f32756o = list4;
                                                    if (this.f32756o.isEmpty()) {
                                                        return ed8.f37069a;
                                                    }
                                                    return null;
                                                }
                                            }
                                        } else {
                                            String strMo4589b2 = cmaVar.mo4589b2();
                                            reviewSessionStateHolder$loadSession$1.f32682a = ec8Var3;
                                            reviewSessionStateHolder$loadSession$1.f32683b = null;
                                            reviewSessionStateHolder$loadSession$1.f32684c = this;
                                            reviewSessionStateHolder$loadSession$1.f32685d = null;
                                            reviewSessionStateHolder$loadSession$1.f32686e = z;
                                            reviewSessionStateHolder$loadSession$1.f32689h = 8;
                                            objM9600g = ((C1308x) this.f32748g.f63241a).m7416j(strMo4589b2, reviewSessionStateHolder$loadSession$1);
                                            if (objM9600g != coroutineSingletons) {
                                                c2764d3 = this;
                                                ec8Var4 = ec8Var3;
                                                list5 = (List) objM9600g;
                                                ec8Var3 = ec8Var4;
                                                c2764d3.f32755n = list5;
                                                zM12970b = gxc.m12970b(ec8Var3.f37003a);
                                                list3 = this.f32754m;
                                                if (zM12970b) {
                                                    reviewSessionStateHolder$loadSession$1.f32682a = null;
                                                    reviewSessionStateHolder$loadSession$1.f32683b = null;
                                                    reviewSessionStateHolder$loadSession$1.f32684c = this;
                                                    reviewSessionStateHolder$loadSession$1.f32685d = null;
                                                    reviewSessionStateHolder$loadSession$1.f32686e = z;
                                                    reviewSessionStateHolder$loadSession$1.f32689h = 9;
                                                    objM9600g = m9643a(list3, ec8Var3, reviewSessionStateHolder$loadSession$1);
                                                    if (objM9600g != coroutineSingletons) {
                                                        c2764d4 = this;
                                                        list4 = (List) objM9600g;
                                                        c2764d4.f32756o = list4;
                                                        if (this.f32756o.isEmpty()) {
                                                            return ed8.f37069a;
                                                        }
                                                        return null;
                                                    }
                                                } else {
                                                    reviewSessionStateHolder$loadSession$1.f32682a = null;
                                                    reviewSessionStateHolder$loadSession$1.f32683b = null;
                                                    reviewSessionStateHolder$loadSession$1.f32684c = this;
                                                    reviewSessionStateHolder$loadSession$1.f32685d = null;
                                                    reviewSessionStateHolder$loadSession$1.f32686e = z;
                                                    reviewSessionStateHolder$loadSession$1.f32689h = 10;
                                                    objM9600g = m9644b(list3, ec8Var3, reviewSessionStateHolder$loadSession$1);
                                                    if (objM9600g != coroutineSingletons) {
                                                        c2764d4 = this;
                                                        list4 = (List) objM9600g;
                                                        c2764d4.f32756o = list4;
                                                        if (this.f32756o.isEmpty()) {
                                                            return ed8.f37069a;
                                                        }
                                                        return null;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } else if (ec8Var2.f37008f != null) {
                                reviewSessionStateHolder$loadSession$1.f32682a = ec8Var2;
                                reviewSessionStateHolder$loadSession$1.f32683b = null;
                                reviewSessionStateHolder$loadSession$1.f32684c = this;
                                reviewSessionStateHolder$loadSession$1.f32686e = zBooleanValue;
                                reviewSessionStateHolder$loadSession$1.f32689h = 6;
                                objM9647e = m9647e(zBooleanValue, ec8Var2, reviewSessionStateHolder$loadSession$1);
                                if (objM9647e != coroutineSingletons) {
                                    objM9600g = objM9647e;
                                    z = zBooleanValue;
                                    c2764d2 = this;
                                    ec8Var3 = ec8Var2;
                                    list = (List) objM9600g;
                                    c2764d2.f32754m = list;
                                    if (this.f32754m.isEmpty()) {
                                        return fd8.f38913a;
                                    }
                                    if (gxc.m12970b(ec8Var3.f37003a)) {
                                        String strMo4589b3 = cmaVar.mo4589b2();
                                        reviewSessionStateHolder$loadSession$1.f32682a = ec8Var3;
                                        reviewSessionStateHolder$loadSession$1.f32683b = null;
                                        reviewSessionStateHolder$loadSession$1.f32684c = this;
                                        reviewSessionStateHolder$loadSession$1.f32685d = null;
                                        reviewSessionStateHolder$loadSession$1.f32686e = z;
                                        reviewSessionStateHolder$loadSession$1.f32689h = 8;
                                        objM9600g = ((C1308x) this.f32748g.f63241a).m7416j(strMo4589b3, reviewSessionStateHolder$loadSession$1);
                                        if (objM9600g != coroutineSingletons) {
                                            c2764d3 = this;
                                            ec8Var4 = ec8Var3;
                                            list5 = (List) objM9600g;
                                            ec8Var3 = ec8Var4;
                                            c2764d3.f32755n = list5;
                                            zM12970b = gxc.m12970b(ec8Var3.f37003a);
                                            list3 = this.f32754m;
                                            if (zM12970b) {
                                                reviewSessionStateHolder$loadSession$1.f32682a = null;
                                                reviewSessionStateHolder$loadSession$1.f32683b = null;
                                                reviewSessionStateHolder$loadSession$1.f32684c = this;
                                                reviewSessionStateHolder$loadSession$1.f32685d = null;
                                                reviewSessionStateHolder$loadSession$1.f32686e = z;
                                                reviewSessionStateHolder$loadSession$1.f32689h = 9;
                                                objM9600g = m9643a(list3, ec8Var3, reviewSessionStateHolder$loadSession$1);
                                                if (objM9600g != coroutineSingletons) {
                                                    c2764d4 = this;
                                                    list4 = (List) objM9600g;
                                                    c2764d4.f32756o = list4;
                                                    if (this.f32756o.isEmpty()) {
                                                        return ed8.f37069a;
                                                    }
                                                    return null;
                                                }
                                            } else {
                                                reviewSessionStateHolder$loadSession$1.f32682a = null;
                                                reviewSessionStateHolder$loadSession$1.f32683b = null;
                                                reviewSessionStateHolder$loadSession$1.f32684c = this;
                                                reviewSessionStateHolder$loadSession$1.f32685d = null;
                                                reviewSessionStateHolder$loadSession$1.f32686e = z;
                                                reviewSessionStateHolder$loadSession$1.f32689h = 10;
                                                objM9600g = m9644b(list3, ec8Var3, reviewSessionStateHolder$loadSession$1);
                                                if (objM9600g != coroutineSingletons) {
                                                    c2764d4 = this;
                                                    list4 = (List) objM9600g;
                                                    c2764d4.f32756o = list4;
                                                    if (this.f32756o.isEmpty()) {
                                                        return ed8.f37069a;
                                                    }
                                                    return null;
                                                }
                                            }
                                        }
                                    } else {
                                        c2764d3 = this;
                                        c2764d3.f32755n = list5;
                                        zM12970b = gxc.m12970b(ec8Var3.f37003a);
                                        list3 = this.f32754m;
                                        if (zM12970b) {
                                            reviewSessionStateHolder$loadSession$1.f32682a = null;
                                            reviewSessionStateHolder$loadSession$1.f32683b = null;
                                            reviewSessionStateHolder$loadSession$1.f32684c = this;
                                            reviewSessionStateHolder$loadSession$1.f32685d = null;
                                            reviewSessionStateHolder$loadSession$1.f32686e = z;
                                            reviewSessionStateHolder$loadSession$1.f32689h = 9;
                                            objM9600g = m9643a(list3, ec8Var3, reviewSessionStateHolder$loadSession$1);
                                            if (objM9600g != coroutineSingletons) {
                                                c2764d4 = this;
                                                list4 = (List) objM9600g;
                                                c2764d4.f32756o = list4;
                                                if (this.f32756o.isEmpty()) {
                                                    return ed8.f37069a;
                                                }
                                                return null;
                                            }
                                        } else {
                                            reviewSessionStateHolder$loadSession$1.f32682a = null;
                                            reviewSessionStateHolder$loadSession$1.f32683b = null;
                                            reviewSessionStateHolder$loadSession$1.f32684c = this;
                                            reviewSessionStateHolder$loadSession$1.f32685d = null;
                                            reviewSessionStateHolder$loadSession$1.f32686e = z;
                                            reviewSessionStateHolder$loadSession$1.f32689h = 10;
                                            objM9600g = m9644b(list3, ec8Var3, reviewSessionStateHolder$loadSession$1);
                                            if (objM9600g != coroutineSingletons) {
                                                c2764d4 = this;
                                                list4 = (List) objM9600g;
                                                c2764d4.f32756o = list4;
                                                if (this.f32756o.isEmpty()) {
                                                    return ed8.f37069a;
                                                }
                                                return null;
                                            }
                                        }
                                    }
                                }
                            } else {
                                reviewSessionStateHolder$loadSession$1.f32682a = ec8Var2;
                                reviewSessionStateHolder$loadSession$1.f32683b = null;
                                reviewSessionStateHolder$loadSession$1.f32684c = this;
                                reviewSessionStateHolder$loadSession$1.f32686e = zBooleanValue;
                                reviewSessionStateHolder$loadSession$1.f32689h = 7;
                                objM9646d = m9646d(zBooleanValue, ec8Var2, reviewSessionStateHolder$loadSession$1);
                                if (objM9646d != coroutineSingletons) {
                                    objM9600g = objM9646d;
                                    z = zBooleanValue;
                                    c2764d2 = this;
                                    ec8Var3 = ec8Var2;
                                    list = (List) objM9600g;
                                    c2764d2.f32754m = list;
                                    if (this.f32754m.isEmpty()) {
                                        return fd8.f38913a;
                                    }
                                    if (gxc.m12970b(ec8Var3.f37003a)) {
                                        String strMo4589b4 = cmaVar.mo4589b2();
                                        reviewSessionStateHolder$loadSession$1.f32682a = ec8Var3;
                                        reviewSessionStateHolder$loadSession$1.f32683b = null;
                                        reviewSessionStateHolder$loadSession$1.f32684c = this;
                                        reviewSessionStateHolder$loadSession$1.f32685d = null;
                                        reviewSessionStateHolder$loadSession$1.f32686e = z;
                                        reviewSessionStateHolder$loadSession$1.f32689h = 8;
                                        objM9600g = ((C1308x) this.f32748g.f63241a).m7416j(strMo4589b4, reviewSessionStateHolder$loadSession$1);
                                        if (objM9600g != coroutineSingletons) {
                                            c2764d3 = this;
                                            ec8Var4 = ec8Var3;
                                            list5 = (List) objM9600g;
                                            ec8Var3 = ec8Var4;
                                            c2764d3.f32755n = list5;
                                            zM12970b = gxc.m12970b(ec8Var3.f37003a);
                                            list3 = this.f32754m;
                                            if (zM12970b) {
                                                reviewSessionStateHolder$loadSession$1.f32682a = null;
                                                reviewSessionStateHolder$loadSession$1.f32683b = null;
                                                reviewSessionStateHolder$loadSession$1.f32684c = this;
                                                reviewSessionStateHolder$loadSession$1.f32685d = null;
                                                reviewSessionStateHolder$loadSession$1.f32686e = z;
                                                reviewSessionStateHolder$loadSession$1.f32689h = 9;
                                                objM9600g = m9643a(list3, ec8Var3, reviewSessionStateHolder$loadSession$1);
                                                if (objM9600g != coroutineSingletons) {
                                                    c2764d4 = this;
                                                    list4 = (List) objM9600g;
                                                    c2764d4.f32756o = list4;
                                                    if (this.f32756o.isEmpty()) {
                                                        return ed8.f37069a;
                                                    }
                                                    return null;
                                                }
                                            } else {
                                                reviewSessionStateHolder$loadSession$1.f32682a = null;
                                                reviewSessionStateHolder$loadSession$1.f32683b = null;
                                                reviewSessionStateHolder$loadSession$1.f32684c = this;
                                                reviewSessionStateHolder$loadSession$1.f32685d = null;
                                                reviewSessionStateHolder$loadSession$1.f32686e = z;
                                                reviewSessionStateHolder$loadSession$1.f32689h = 10;
                                                objM9600g = m9644b(list3, ec8Var3, reviewSessionStateHolder$loadSession$1);
                                                if (objM9600g != coroutineSingletons) {
                                                    c2764d4 = this;
                                                    list4 = (List) objM9600g;
                                                    c2764d4.f32756o = list4;
                                                    if (this.f32756o.isEmpty()) {
                                                        return ed8.f37069a;
                                                    }
                                                    return null;
                                                }
                                            }
                                        }
                                    } else {
                                        c2764d3 = this;
                                        c2764d3.f32755n = list5;
                                        zM12970b = gxc.m12970b(ec8Var3.f37003a);
                                        list3 = this.f32754m;
                                        if (zM12970b) {
                                            reviewSessionStateHolder$loadSession$1.f32682a = null;
                                            reviewSessionStateHolder$loadSession$1.f32683b = null;
                                            reviewSessionStateHolder$loadSession$1.f32684c = this;
                                            reviewSessionStateHolder$loadSession$1.f32685d = null;
                                            reviewSessionStateHolder$loadSession$1.f32686e = z;
                                            reviewSessionStateHolder$loadSession$1.f32689h = 9;
                                            objM9600g = m9643a(list3, ec8Var3, reviewSessionStateHolder$loadSession$1);
                                            if (objM9600g != coroutineSingletons) {
                                                c2764d4 = this;
                                                list4 = (List) objM9600g;
                                                c2764d4.f32756o = list4;
                                                if (this.f32756o.isEmpty()) {
                                                    return ed8.f37069a;
                                                }
                                                return null;
                                            }
                                        } else {
                                            reviewSessionStateHolder$loadSession$1.f32682a = null;
                                            reviewSessionStateHolder$loadSession$1.f32683b = null;
                                            reviewSessionStateHolder$loadSession$1.f32684c = this;
                                            reviewSessionStateHolder$loadSession$1.f32685d = null;
                                            reviewSessionStateHolder$loadSession$1.f32686e = z;
                                            reviewSessionStateHolder$loadSession$1.f32689h = 10;
                                            objM9600g = m9644b(list3, ec8Var3, reviewSessionStateHolder$loadSession$1);
                                            if (objM9600g != coroutineSingletons) {
                                                c2764d4 = this;
                                                list4 = (List) objM9600g;
                                                c2764d4.f32756o = list4;
                                                if (this.f32756o.isEmpty()) {
                                                    return ed8.f37069a;
                                                }
                                                return null;
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            reviewSessionStateHolder$loadSession$1.f32682a = ec8Var2;
                            reviewSessionStateHolder$loadSession$1.f32683b = null;
                            reviewSessionStateHolder$loadSession$1.f32684c = this;
                            reviewSessionStateHolder$loadSession$1.f32686e = zBooleanValue;
                            reviewSessionStateHolder$loadSession$1.f32689h = 3;
                            objM9653l = m9653l(set2, zBooleanValue, ec8Var2, reviewSessionStateHolder$loadSession$1);
                            if (objM9653l != coroutineSingletons) {
                                objM9600g = objM9653l;
                                z = zBooleanValue;
                                c2764d2 = this;
                                ec8Var3 = ec8Var2;
                                list = (List) objM9600g;
                                c2764d2.f32754m = list;
                                if (this.f32754m.isEmpty()) {
                                    return fd8.f38913a;
                                }
                                if (gxc.m12970b(ec8Var3.f37003a)) {
                                    String strMo4589b5 = cmaVar.mo4589b2();
                                    reviewSessionStateHolder$loadSession$1.f32682a = ec8Var3;
                                    reviewSessionStateHolder$loadSession$1.f32683b = null;
                                    reviewSessionStateHolder$loadSession$1.f32684c = this;
                                    reviewSessionStateHolder$loadSession$1.f32685d = null;
                                    reviewSessionStateHolder$loadSession$1.f32686e = z;
                                    reviewSessionStateHolder$loadSession$1.f32689h = 8;
                                    objM9600g = ((C1308x) this.f32748g.f63241a).m7416j(strMo4589b5, reviewSessionStateHolder$loadSession$1);
                                    if (objM9600g != coroutineSingletons) {
                                        c2764d3 = this;
                                        ec8Var4 = ec8Var3;
                                        list5 = (List) objM9600g;
                                        ec8Var3 = ec8Var4;
                                        c2764d3.f32755n = list5;
                                        zM12970b = gxc.m12970b(ec8Var3.f37003a);
                                        list3 = this.f32754m;
                                        if (zM12970b) {
                                            reviewSessionStateHolder$loadSession$1.f32682a = null;
                                            reviewSessionStateHolder$loadSession$1.f32683b = null;
                                            reviewSessionStateHolder$loadSession$1.f32684c = this;
                                            reviewSessionStateHolder$loadSession$1.f32685d = null;
                                            reviewSessionStateHolder$loadSession$1.f32686e = z;
                                            reviewSessionStateHolder$loadSession$1.f32689h = 9;
                                            objM9600g = m9643a(list3, ec8Var3, reviewSessionStateHolder$loadSession$1);
                                            if (objM9600g != coroutineSingletons) {
                                                c2764d4 = this;
                                                list4 = (List) objM9600g;
                                                c2764d4.f32756o = list4;
                                                if (this.f32756o.isEmpty()) {
                                                    return ed8.f37069a;
                                                }
                                                return null;
                                            }
                                        } else {
                                            reviewSessionStateHolder$loadSession$1.f32682a = null;
                                            reviewSessionStateHolder$loadSession$1.f32683b = null;
                                            reviewSessionStateHolder$loadSession$1.f32684c = this;
                                            reviewSessionStateHolder$loadSession$1.f32685d = null;
                                            reviewSessionStateHolder$loadSession$1.f32686e = z;
                                            reviewSessionStateHolder$loadSession$1.f32689h = 10;
                                            objM9600g = m9644b(list3, ec8Var3, reviewSessionStateHolder$loadSession$1);
                                            if (objM9600g != coroutineSingletons) {
                                                c2764d4 = this;
                                                list4 = (List) objM9600g;
                                                c2764d4.f32756o = list4;
                                                if (this.f32756o.isEmpty()) {
                                                    return ed8.f37069a;
                                                }
                                                return null;
                                            }
                                        }
                                    }
                                } else {
                                    c2764d3 = this;
                                    c2764d3.f32755n = list5;
                                    zM12970b = gxc.m12970b(ec8Var3.f37003a);
                                    list3 = this.f32754m;
                                    if (zM12970b) {
                                        reviewSessionStateHolder$loadSession$1.f32682a = null;
                                        reviewSessionStateHolder$loadSession$1.f32683b = null;
                                        reviewSessionStateHolder$loadSession$1.f32684c = this;
                                        reviewSessionStateHolder$loadSession$1.f32685d = null;
                                        reviewSessionStateHolder$loadSession$1.f32686e = z;
                                        reviewSessionStateHolder$loadSession$1.f32689h = 9;
                                        objM9600g = m9643a(list3, ec8Var3, reviewSessionStateHolder$loadSession$1);
                                        if (objM9600g != coroutineSingletons) {
                                            c2764d4 = this;
                                            list4 = (List) objM9600g;
                                            c2764d4.f32756o = list4;
                                            if (this.f32756o.isEmpty()) {
                                                return ed8.f37069a;
                                            }
                                            return null;
                                        }
                                    } else {
                                        reviewSessionStateHolder$loadSession$1.f32682a = null;
                                        reviewSessionStateHolder$loadSession$1.f32683b = null;
                                        reviewSessionStateHolder$loadSession$1.f32684c = this;
                                        reviewSessionStateHolder$loadSession$1.f32685d = null;
                                        reviewSessionStateHolder$loadSession$1.f32686e = z;
                                        reviewSessionStateHolder$loadSession$1.f32689h = 10;
                                        objM9600g = m9644b(list3, ec8Var3, reviewSessionStateHolder$loadSession$1);
                                        if (objM9600g != coroutineSingletons) {
                                            c2764d4 = this;
                                            list4 = (List) objM9600g;
                                            c2764d4.f32756o = list4;
                                            if (this.f32756o.isEmpty()) {
                                                return ed8.f37069a;
                                            }
                                            return null;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return coroutineSingletons;
            case 1:
                C2764d c2764d5 = reviewSessionStateHolder$loadSession$1.f32684c;
                Set set3 = reviewSessionStateHolder$loadSession$1.f32683b;
                ec8Var2 = reviewSessionStateHolder$loadSession$1.f32682a;
                AbstractC3193b.m15359b(objM9600g);
                c2764d = c2764d5;
                set2 = set3;
                obj = objM9600g;
                c2764d.f32761t = ((Boolean) obj).booleanValue();
                reviewSessionStateHolder$loadSession$1.f32682a = ec8Var2;
                reviewSessionStateHolder$loadSession$1.f32683b = set2;
                reviewSessionStateHolder$loadSession$1.f32684c = null;
                reviewSessionStateHolder$loadSession$1.f32689h = 2;
                objM9600g = this.f32743b.m9600g(reviewSessionStateHolder$loadSession$1);
                if (objM9600g != coroutineSingletons) {
                    zBooleanValue = ((Boolean) objM9600g).booleanValue();
                    if (set2.isEmpty()) {
                        reviewSessionStateHolder$loadSession$1.f32682a = ec8Var2;
                        reviewSessionStateHolder$loadSession$1.f32683b = null;
                        reviewSessionStateHolder$loadSession$1.f32684c = this;
                        reviewSessionStateHolder$loadSession$1.f32686e = zBooleanValue;
                        reviewSessionStateHolder$loadSession$1.f32689h = 3;
                        objM9653l = m9653l(set2, zBooleanValue, ec8Var2, reviewSessionStateHolder$loadSession$1);
                        if (objM9653l != coroutineSingletons) {
                            objM9600g = objM9653l;
                            z = zBooleanValue;
                            c2764d2 = this;
                            ec8Var3 = ec8Var2;
                            list = (List) objM9600g;
                            c2764d2.f32754m = list;
                            if (this.f32754m.isEmpty()) {
                                return fd8.f38913a;
                            }
                            if (gxc.m12970b(ec8Var3.f37003a)) {
                                String strMo4589b6 = cmaVar.mo4589b2();
                                reviewSessionStateHolder$loadSession$1.f32682a = ec8Var3;
                                reviewSessionStateHolder$loadSession$1.f32683b = null;
                                reviewSessionStateHolder$loadSession$1.f32684c = this;
                                reviewSessionStateHolder$loadSession$1.f32685d = null;
                                reviewSessionStateHolder$loadSession$1.f32686e = z;
                                reviewSessionStateHolder$loadSession$1.f32689h = 8;
                                objM9600g = ((C1308x) this.f32748g.f63241a).m7416j(strMo4589b6, reviewSessionStateHolder$loadSession$1);
                                if (objM9600g != coroutineSingletons) {
                                    c2764d3 = this;
                                    ec8Var4 = ec8Var3;
                                    list5 = (List) objM9600g;
                                    ec8Var3 = ec8Var4;
                                    c2764d3.f32755n = list5;
                                    zM12970b = gxc.m12970b(ec8Var3.f37003a);
                                    list3 = this.f32754m;
                                    if (zM12970b) {
                                        reviewSessionStateHolder$loadSession$1.f32682a = null;
                                        reviewSessionStateHolder$loadSession$1.f32683b = null;
                                        reviewSessionStateHolder$loadSession$1.f32684c = this;
                                        reviewSessionStateHolder$loadSession$1.f32685d = null;
                                        reviewSessionStateHolder$loadSession$1.f32686e = z;
                                        reviewSessionStateHolder$loadSession$1.f32689h = 9;
                                        objM9600g = m9643a(list3, ec8Var3, reviewSessionStateHolder$loadSession$1);
                                        if (objM9600g != coroutineSingletons) {
                                            c2764d4 = this;
                                            list4 = (List) objM9600g;
                                            c2764d4.f32756o = list4;
                                            if (this.f32756o.isEmpty()) {
                                                return ed8.f37069a;
                                            }
                                            return null;
                                        }
                                    } else {
                                        reviewSessionStateHolder$loadSession$1.f32682a = null;
                                        reviewSessionStateHolder$loadSession$1.f32683b = null;
                                        reviewSessionStateHolder$loadSession$1.f32684c = this;
                                        reviewSessionStateHolder$loadSession$1.f32685d = null;
                                        reviewSessionStateHolder$loadSession$1.f32686e = z;
                                        reviewSessionStateHolder$loadSession$1.f32689h = 10;
                                        objM9600g = m9644b(list3, ec8Var3, reviewSessionStateHolder$loadSession$1);
                                        if (objM9600g != coroutineSingletons) {
                                            c2764d4 = this;
                                            list4 = (List) objM9600g;
                                            c2764d4.f32756o = list4;
                                            if (this.f32756o.isEmpty()) {
                                                return ed8.f37069a;
                                            }
                                            return null;
                                        }
                                    }
                                }
                            } else {
                                c2764d3 = this;
                                c2764d3.f32755n = list5;
                                zM12970b = gxc.m12970b(ec8Var3.f37003a);
                                list3 = this.f32754m;
                                if (zM12970b) {
                                    reviewSessionStateHolder$loadSession$1.f32682a = null;
                                    reviewSessionStateHolder$loadSession$1.f32683b = null;
                                    reviewSessionStateHolder$loadSession$1.f32684c = this;
                                    reviewSessionStateHolder$loadSession$1.f32685d = null;
                                    reviewSessionStateHolder$loadSession$1.f32686e = z;
                                    reviewSessionStateHolder$loadSession$1.f32689h = 9;
                                    objM9600g = m9643a(list3, ec8Var3, reviewSessionStateHolder$loadSession$1);
                                    if (objM9600g != coroutineSingletons) {
                                        c2764d4 = this;
                                        list4 = (List) objM9600g;
                                        c2764d4.f32756o = list4;
                                        if (this.f32756o.isEmpty()) {
                                            return ed8.f37069a;
                                        }
                                        return null;
                                    }
                                } else {
                                    reviewSessionStateHolder$loadSession$1.f32682a = null;
                                    reviewSessionStateHolder$loadSession$1.f32683b = null;
                                    reviewSessionStateHolder$loadSession$1.f32684c = this;
                                    reviewSessionStateHolder$loadSession$1.f32685d = null;
                                    reviewSessionStateHolder$loadSession$1.f32686e = z;
                                    reviewSessionStateHolder$loadSession$1.f32689h = 10;
                                    objM9600g = m9644b(list3, ec8Var3, reviewSessionStateHolder$loadSession$1);
                                    if (objM9600g != coroutineSingletons) {
                                        c2764d4 = this;
                                        list4 = (List) objM9600g;
                                        c2764d4.f32756o = list4;
                                        if (this.f32756o.isEmpty()) {
                                            return ed8.f37069a;
                                        }
                                        return null;
                                    }
                                }
                            }
                        }
                    } else {
                        i = ec8Var2.f37005c;
                        if (i != -1) {
                            reviewSessionStateHolder$loadSession$1.f32682a = ec8Var2;
                            reviewSessionStateHolder$loadSession$1.f32683b = null;
                            reviewSessionStateHolder$loadSession$1.f32684c = this;
                            reviewSessionStateHolder$loadSession$1.f32686e = zBooleanValue;
                            reviewSessionStateHolder$loadSession$1.f32689h = 4;
                            objM7117g = ((C1287c) this.f32749h.f57897a).m7117g(i, reviewSessionStateHolder$loadSession$1);
                            if (objM7117g != coroutineSingletons) {
                                objM9600g = objM7117g;
                                z = zBooleanValue;
                                c2764d2 = this;
                                list2 = (List) objM9600g;
                                if (ec8Var2.f37003a == ReviewType.SrsDue) {
                                    arrayList3 = new ArrayList();
                                    while (r2.hasNext()) {
                                        str = ((LessonCard) obj2).f19191n;
                                        if (str != null) {
                                            iCompareTo = str.compareTo(hy3.f43148E.m14766a(new DateTime()));
                                        } else {
                                            iCompareTo = 0;
                                        }
                                        if (iCompareTo < 0) {
                                            arrayList3.add(obj2);
                                        }
                                    }
                                    arrayList2 = new ArrayList(v91.m23189q0(arrayList3, 10));
                                    it2 = arrayList3.iterator();
                                    while (it2.hasNext()) {
                                        arrayList2.add(((LessonCard) it2.next()).f19178a);
                                    }
                                } else {
                                    List list7 = list2;
                                    arrayList = new ArrayList(v91.m23189q0(list7, 10));
                                    it = list7.iterator();
                                    while (it.hasNext()) {
                                        arrayList.add(((LessonCard) it.next()).f19178a);
                                    }
                                    arrayList2 = arrayList;
                                }
                                Set setM22627s2 = u91.m22627s1(arrayList2);
                                reviewSessionStateHolder$loadSession$1.f32682a = ec8Var2;
                                reviewSessionStateHolder$loadSession$1.f32683b = null;
                                reviewSessionStateHolder$loadSession$1.f32684c = null;
                                reviewSessionStateHolder$loadSession$1.f32685d = c2764d2;
                                reviewSessionStateHolder$loadSession$1.f32686e = z;
                                reviewSessionStateHolder$loadSession$1.f32689h = 5;
                                objM9600g = m9653l(setM22627s2, z, ec8Var2, reviewSessionStateHolder$loadSession$1);
                                if (objM9600g != coroutineSingletons) {
                                    ec8Var3 = ec8Var2;
                                    list = (List) objM9600g;
                                    c2764d2.f32754m = list;
                                    if (this.f32754m.isEmpty()) {
                                        return fd8.f38913a;
                                    }
                                    if (gxc.m12970b(ec8Var3.f37003a)) {
                                        String strMo4589b7 = cmaVar.mo4589b2();
                                        reviewSessionStateHolder$loadSession$1.f32682a = ec8Var3;
                                        reviewSessionStateHolder$loadSession$1.f32683b = null;
                                        reviewSessionStateHolder$loadSession$1.f32684c = this;
                                        reviewSessionStateHolder$loadSession$1.f32685d = null;
                                        reviewSessionStateHolder$loadSession$1.f32686e = z;
                                        reviewSessionStateHolder$loadSession$1.f32689h = 8;
                                        objM9600g = ((C1308x) this.f32748g.f63241a).m7416j(strMo4589b7, reviewSessionStateHolder$loadSession$1);
                                        if (objM9600g != coroutineSingletons) {
                                            c2764d3 = this;
                                            ec8Var4 = ec8Var3;
                                            list5 = (List) objM9600g;
                                            ec8Var3 = ec8Var4;
                                            c2764d3.f32755n = list5;
                                            zM12970b = gxc.m12970b(ec8Var3.f37003a);
                                            list3 = this.f32754m;
                                            if (zM12970b) {
                                                reviewSessionStateHolder$loadSession$1.f32682a = null;
                                                reviewSessionStateHolder$loadSession$1.f32683b = null;
                                                reviewSessionStateHolder$loadSession$1.f32684c = this;
                                                reviewSessionStateHolder$loadSession$1.f32685d = null;
                                                reviewSessionStateHolder$loadSession$1.f32686e = z;
                                                reviewSessionStateHolder$loadSession$1.f32689h = 9;
                                                objM9600g = m9643a(list3, ec8Var3, reviewSessionStateHolder$loadSession$1);
                                                if (objM9600g != coroutineSingletons) {
                                                    c2764d4 = this;
                                                    list4 = (List) objM9600g;
                                                    c2764d4.f32756o = list4;
                                                    if (this.f32756o.isEmpty()) {
                                                        return ed8.f37069a;
                                                    }
                                                    return null;
                                                }
                                            } else {
                                                reviewSessionStateHolder$loadSession$1.f32682a = null;
                                                reviewSessionStateHolder$loadSession$1.f32683b = null;
                                                reviewSessionStateHolder$loadSession$1.f32684c = this;
                                                reviewSessionStateHolder$loadSession$1.f32685d = null;
                                                reviewSessionStateHolder$loadSession$1.f32686e = z;
                                                reviewSessionStateHolder$loadSession$1.f32689h = 10;
                                                objM9600g = m9644b(list3, ec8Var3, reviewSessionStateHolder$loadSession$1);
                                                if (objM9600g != coroutineSingletons) {
                                                    c2764d4 = this;
                                                    list4 = (List) objM9600g;
                                                    c2764d4.f32756o = list4;
                                                    if (this.f32756o.isEmpty()) {
                                                        return ed8.f37069a;
                                                    }
                                                    return null;
                                                }
                                            }
                                        }
                                    } else {
                                        c2764d3 = this;
                                        c2764d3.f32755n = list5;
                                        zM12970b = gxc.m12970b(ec8Var3.f37003a);
                                        list3 = this.f32754m;
                                        if (zM12970b) {
                                            reviewSessionStateHolder$loadSession$1.f32682a = null;
                                            reviewSessionStateHolder$loadSession$1.f32683b = null;
                                            reviewSessionStateHolder$loadSession$1.f32684c = this;
                                            reviewSessionStateHolder$loadSession$1.f32685d = null;
                                            reviewSessionStateHolder$loadSession$1.f32686e = z;
                                            reviewSessionStateHolder$loadSession$1.f32689h = 9;
                                            objM9600g = m9643a(list3, ec8Var3, reviewSessionStateHolder$loadSession$1);
                                            if (objM9600g != coroutineSingletons) {
                                                c2764d4 = this;
                                                list4 = (List) objM9600g;
                                                c2764d4.f32756o = list4;
                                                if (this.f32756o.isEmpty()) {
                                                    return ed8.f37069a;
                                                }
                                                return null;
                                            }
                                        } else {
                                            reviewSessionStateHolder$loadSession$1.f32682a = null;
                                            reviewSessionStateHolder$loadSession$1.f32683b = null;
                                            reviewSessionStateHolder$loadSession$1.f32684c = this;
                                            reviewSessionStateHolder$loadSession$1.f32685d = null;
                                            reviewSessionStateHolder$loadSession$1.f32686e = z;
                                            reviewSessionStateHolder$loadSession$1.f32689h = 10;
                                            objM9600g = m9644b(list3, ec8Var3, reviewSessionStateHolder$loadSession$1);
                                            if (objM9600g != coroutineSingletons) {
                                                c2764d4 = this;
                                                list4 = (List) objM9600g;
                                                c2764d4.f32756o = list4;
                                                if (this.f32756o.isEmpty()) {
                                                    return ed8.f37069a;
                                                }
                                                return null;
                                            }
                                        }
                                    }
                                }
                            }
                        } else if (ec8Var2.f37008f != null) {
                            reviewSessionStateHolder$loadSession$1.f32682a = ec8Var2;
                            reviewSessionStateHolder$loadSession$1.f32683b = null;
                            reviewSessionStateHolder$loadSession$1.f32684c = this;
                            reviewSessionStateHolder$loadSession$1.f32686e = zBooleanValue;
                            reviewSessionStateHolder$loadSession$1.f32689h = 6;
                            objM9647e = m9647e(zBooleanValue, ec8Var2, reviewSessionStateHolder$loadSession$1);
                            if (objM9647e != coroutineSingletons) {
                                objM9600g = objM9647e;
                                z = zBooleanValue;
                                c2764d2 = this;
                                ec8Var3 = ec8Var2;
                                list = (List) objM9600g;
                                c2764d2.f32754m = list;
                                if (this.f32754m.isEmpty()) {
                                    return fd8.f38913a;
                                }
                                if (gxc.m12970b(ec8Var3.f37003a)) {
                                    String strMo4589b8 = cmaVar.mo4589b2();
                                    reviewSessionStateHolder$loadSession$1.f32682a = ec8Var3;
                                    reviewSessionStateHolder$loadSession$1.f32683b = null;
                                    reviewSessionStateHolder$loadSession$1.f32684c = this;
                                    reviewSessionStateHolder$loadSession$1.f32685d = null;
                                    reviewSessionStateHolder$loadSession$1.f32686e = z;
                                    reviewSessionStateHolder$loadSession$1.f32689h = 8;
                                    objM9600g = ((C1308x) this.f32748g.f63241a).m7416j(strMo4589b8, reviewSessionStateHolder$loadSession$1);
                                    if (objM9600g != coroutineSingletons) {
                                        c2764d3 = this;
                                        ec8Var4 = ec8Var3;
                                        list5 = (List) objM9600g;
                                        ec8Var3 = ec8Var4;
                                        c2764d3.f32755n = list5;
                                        zM12970b = gxc.m12970b(ec8Var3.f37003a);
                                        list3 = this.f32754m;
                                        if (zM12970b) {
                                            reviewSessionStateHolder$loadSession$1.f32682a = null;
                                            reviewSessionStateHolder$loadSession$1.f32683b = null;
                                            reviewSessionStateHolder$loadSession$1.f32684c = this;
                                            reviewSessionStateHolder$loadSession$1.f32685d = null;
                                            reviewSessionStateHolder$loadSession$1.f32686e = z;
                                            reviewSessionStateHolder$loadSession$1.f32689h = 9;
                                            objM9600g = m9643a(list3, ec8Var3, reviewSessionStateHolder$loadSession$1);
                                            if (objM9600g != coroutineSingletons) {
                                                c2764d4 = this;
                                                list4 = (List) objM9600g;
                                                c2764d4.f32756o = list4;
                                                if (this.f32756o.isEmpty()) {
                                                    return ed8.f37069a;
                                                }
                                                return null;
                                            }
                                        } else {
                                            reviewSessionStateHolder$loadSession$1.f32682a = null;
                                            reviewSessionStateHolder$loadSession$1.f32683b = null;
                                            reviewSessionStateHolder$loadSession$1.f32684c = this;
                                            reviewSessionStateHolder$loadSession$1.f32685d = null;
                                            reviewSessionStateHolder$loadSession$1.f32686e = z;
                                            reviewSessionStateHolder$loadSession$1.f32689h = 10;
                                            objM9600g = m9644b(list3, ec8Var3, reviewSessionStateHolder$loadSession$1);
                                            if (objM9600g != coroutineSingletons) {
                                                c2764d4 = this;
                                                list4 = (List) objM9600g;
                                                c2764d4.f32756o = list4;
                                                if (this.f32756o.isEmpty()) {
                                                    return ed8.f37069a;
                                                }
                                                return null;
                                            }
                                        }
                                    }
                                } else {
                                    c2764d3 = this;
                                    c2764d3.f32755n = list5;
                                    zM12970b = gxc.m12970b(ec8Var3.f37003a);
                                    list3 = this.f32754m;
                                    if (zM12970b) {
                                        reviewSessionStateHolder$loadSession$1.f32682a = null;
                                        reviewSessionStateHolder$loadSession$1.f32683b = null;
                                        reviewSessionStateHolder$loadSession$1.f32684c = this;
                                        reviewSessionStateHolder$loadSession$1.f32685d = null;
                                        reviewSessionStateHolder$loadSession$1.f32686e = z;
                                        reviewSessionStateHolder$loadSession$1.f32689h = 9;
                                        objM9600g = m9643a(list3, ec8Var3, reviewSessionStateHolder$loadSession$1);
                                        if (objM9600g != coroutineSingletons) {
                                            c2764d4 = this;
                                            list4 = (List) objM9600g;
                                            c2764d4.f32756o = list4;
                                            if (this.f32756o.isEmpty()) {
                                                return ed8.f37069a;
                                            }
                                            return null;
                                        }
                                    } else {
                                        reviewSessionStateHolder$loadSession$1.f32682a = null;
                                        reviewSessionStateHolder$loadSession$1.f32683b = null;
                                        reviewSessionStateHolder$loadSession$1.f32684c = this;
                                        reviewSessionStateHolder$loadSession$1.f32685d = null;
                                        reviewSessionStateHolder$loadSession$1.f32686e = z;
                                        reviewSessionStateHolder$loadSession$1.f32689h = 10;
                                        objM9600g = m9644b(list3, ec8Var3, reviewSessionStateHolder$loadSession$1);
                                        if (objM9600g != coroutineSingletons) {
                                            c2764d4 = this;
                                            list4 = (List) objM9600g;
                                            c2764d4.f32756o = list4;
                                            if (this.f32756o.isEmpty()) {
                                                return ed8.f37069a;
                                            }
                                            return null;
                                        }
                                    }
                                }
                            }
                        } else {
                            reviewSessionStateHolder$loadSession$1.f32682a = ec8Var2;
                            reviewSessionStateHolder$loadSession$1.f32683b = null;
                            reviewSessionStateHolder$loadSession$1.f32684c = this;
                            reviewSessionStateHolder$loadSession$1.f32686e = zBooleanValue;
                            reviewSessionStateHolder$loadSession$1.f32689h = 7;
                            objM9646d = m9646d(zBooleanValue, ec8Var2, reviewSessionStateHolder$loadSession$1);
                            if (objM9646d != coroutineSingletons) {
                                objM9600g = objM9646d;
                                z = zBooleanValue;
                                c2764d2 = this;
                                ec8Var3 = ec8Var2;
                                list = (List) objM9600g;
                                c2764d2.f32754m = list;
                                if (this.f32754m.isEmpty()) {
                                    return fd8.f38913a;
                                }
                                if (gxc.m12970b(ec8Var3.f37003a)) {
                                    String strMo4589b9 = cmaVar.mo4589b2();
                                    reviewSessionStateHolder$loadSession$1.f32682a = ec8Var3;
                                    reviewSessionStateHolder$loadSession$1.f32683b = null;
                                    reviewSessionStateHolder$loadSession$1.f32684c = this;
                                    reviewSessionStateHolder$loadSession$1.f32685d = null;
                                    reviewSessionStateHolder$loadSession$1.f32686e = z;
                                    reviewSessionStateHolder$loadSession$1.f32689h = 8;
                                    objM9600g = ((C1308x) this.f32748g.f63241a).m7416j(strMo4589b9, reviewSessionStateHolder$loadSession$1);
                                    if (objM9600g != coroutineSingletons) {
                                        c2764d3 = this;
                                        ec8Var4 = ec8Var3;
                                        list5 = (List) objM9600g;
                                        ec8Var3 = ec8Var4;
                                        c2764d3.f32755n = list5;
                                        zM12970b = gxc.m12970b(ec8Var3.f37003a);
                                        list3 = this.f32754m;
                                        if (zM12970b) {
                                            reviewSessionStateHolder$loadSession$1.f32682a = null;
                                            reviewSessionStateHolder$loadSession$1.f32683b = null;
                                            reviewSessionStateHolder$loadSession$1.f32684c = this;
                                            reviewSessionStateHolder$loadSession$1.f32685d = null;
                                            reviewSessionStateHolder$loadSession$1.f32686e = z;
                                            reviewSessionStateHolder$loadSession$1.f32689h = 9;
                                            objM9600g = m9643a(list3, ec8Var3, reviewSessionStateHolder$loadSession$1);
                                            if (objM9600g != coroutineSingletons) {
                                                c2764d4 = this;
                                                list4 = (List) objM9600g;
                                                c2764d4.f32756o = list4;
                                                if (this.f32756o.isEmpty()) {
                                                    return ed8.f37069a;
                                                }
                                                return null;
                                            }
                                        } else {
                                            reviewSessionStateHolder$loadSession$1.f32682a = null;
                                            reviewSessionStateHolder$loadSession$1.f32683b = null;
                                            reviewSessionStateHolder$loadSession$1.f32684c = this;
                                            reviewSessionStateHolder$loadSession$1.f32685d = null;
                                            reviewSessionStateHolder$loadSession$1.f32686e = z;
                                            reviewSessionStateHolder$loadSession$1.f32689h = 10;
                                            objM9600g = m9644b(list3, ec8Var3, reviewSessionStateHolder$loadSession$1);
                                            if (objM9600g != coroutineSingletons) {
                                                c2764d4 = this;
                                                list4 = (List) objM9600g;
                                                c2764d4.f32756o = list4;
                                                if (this.f32756o.isEmpty()) {
                                                    return ed8.f37069a;
                                                }
                                                return null;
                                            }
                                        }
                                    }
                                } else {
                                    c2764d3 = this;
                                    c2764d3.f32755n = list5;
                                    zM12970b = gxc.m12970b(ec8Var3.f37003a);
                                    list3 = this.f32754m;
                                    if (zM12970b) {
                                        reviewSessionStateHolder$loadSession$1.f32682a = null;
                                        reviewSessionStateHolder$loadSession$1.f32683b = null;
                                        reviewSessionStateHolder$loadSession$1.f32684c = this;
                                        reviewSessionStateHolder$loadSession$1.f32685d = null;
                                        reviewSessionStateHolder$loadSession$1.f32686e = z;
                                        reviewSessionStateHolder$loadSession$1.f32689h = 9;
                                        objM9600g = m9643a(list3, ec8Var3, reviewSessionStateHolder$loadSession$1);
                                        if (objM9600g != coroutineSingletons) {
                                            c2764d4 = this;
                                            list4 = (List) objM9600g;
                                            c2764d4.f32756o = list4;
                                            if (this.f32756o.isEmpty()) {
                                                return ed8.f37069a;
                                            }
                                            return null;
                                        }
                                    } else {
                                        reviewSessionStateHolder$loadSession$1.f32682a = null;
                                        reviewSessionStateHolder$loadSession$1.f32683b = null;
                                        reviewSessionStateHolder$loadSession$1.f32684c = this;
                                        reviewSessionStateHolder$loadSession$1.f32685d = null;
                                        reviewSessionStateHolder$loadSession$1.f32686e = z;
                                        reviewSessionStateHolder$loadSession$1.f32689h = 10;
                                        objM9600g = m9644b(list3, ec8Var3, reviewSessionStateHolder$loadSession$1);
                                        if (objM9600g != coroutineSingletons) {
                                            c2764d4 = this;
                                            list4 = (List) objM9600g;
                                            c2764d4.f32756o = list4;
                                            if (this.f32756o.isEmpty()) {
                                                return ed8.f37069a;
                                            }
                                            return null;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return coroutineSingletons;
            case 2:
                set2 = reviewSessionStateHolder$loadSession$1.f32683b;
                ec8 ec8Var5 = reviewSessionStateHolder$loadSession$1.f32682a;
                AbstractC3193b.m15359b(objM9600g);
                ec8Var2 = ec8Var5;
                zBooleanValue = ((Boolean) objM9600g).booleanValue();
                if (set2.isEmpty()) {
                    reviewSessionStateHolder$loadSession$1.f32682a = ec8Var2;
                    reviewSessionStateHolder$loadSession$1.f32683b = null;
                    reviewSessionStateHolder$loadSession$1.f32684c = this;
                    reviewSessionStateHolder$loadSession$1.f32686e = zBooleanValue;
                    reviewSessionStateHolder$loadSession$1.f32689h = 3;
                    objM9653l = m9653l(set2, zBooleanValue, ec8Var2, reviewSessionStateHolder$loadSession$1);
                    if (objM9653l != coroutineSingletons) {
                        objM9600g = objM9653l;
                        z = zBooleanValue;
                        c2764d2 = this;
                        ec8Var3 = ec8Var2;
                        list = (List) objM9600g;
                        c2764d2.f32754m = list;
                        if (this.f32754m.isEmpty()) {
                            return fd8.f38913a;
                        }
                        if (gxc.m12970b(ec8Var3.f37003a)) {
                            String strMo4589b10 = cmaVar.mo4589b2();
                            reviewSessionStateHolder$loadSession$1.f32682a = ec8Var3;
                            reviewSessionStateHolder$loadSession$1.f32683b = null;
                            reviewSessionStateHolder$loadSession$1.f32684c = this;
                            reviewSessionStateHolder$loadSession$1.f32685d = null;
                            reviewSessionStateHolder$loadSession$1.f32686e = z;
                            reviewSessionStateHolder$loadSession$1.f32689h = 8;
                            objM9600g = ((C1308x) this.f32748g.f63241a).m7416j(strMo4589b10, reviewSessionStateHolder$loadSession$1);
                            if (objM9600g != coroutineSingletons) {
                                c2764d3 = this;
                                ec8Var4 = ec8Var3;
                                list5 = (List) objM9600g;
                                ec8Var3 = ec8Var4;
                                c2764d3.f32755n = list5;
                                zM12970b = gxc.m12970b(ec8Var3.f37003a);
                                list3 = this.f32754m;
                                if (zM12970b) {
                                    reviewSessionStateHolder$loadSession$1.f32682a = null;
                                    reviewSessionStateHolder$loadSession$1.f32683b = null;
                                    reviewSessionStateHolder$loadSession$1.f32684c = this;
                                    reviewSessionStateHolder$loadSession$1.f32685d = null;
                                    reviewSessionStateHolder$loadSession$1.f32686e = z;
                                    reviewSessionStateHolder$loadSession$1.f32689h = 9;
                                    objM9600g = m9643a(list3, ec8Var3, reviewSessionStateHolder$loadSession$1);
                                    if (objM9600g != coroutineSingletons) {
                                        c2764d4 = this;
                                        list4 = (List) objM9600g;
                                        c2764d4.f32756o = list4;
                                        if (this.f32756o.isEmpty()) {
                                            return ed8.f37069a;
                                        }
                                        return null;
                                    }
                                } else {
                                    reviewSessionStateHolder$loadSession$1.f32682a = null;
                                    reviewSessionStateHolder$loadSession$1.f32683b = null;
                                    reviewSessionStateHolder$loadSession$1.f32684c = this;
                                    reviewSessionStateHolder$loadSession$1.f32685d = null;
                                    reviewSessionStateHolder$loadSession$1.f32686e = z;
                                    reviewSessionStateHolder$loadSession$1.f32689h = 10;
                                    objM9600g = m9644b(list3, ec8Var3, reviewSessionStateHolder$loadSession$1);
                                    if (objM9600g != coroutineSingletons) {
                                        c2764d4 = this;
                                        list4 = (List) objM9600g;
                                        c2764d4.f32756o = list4;
                                        if (this.f32756o.isEmpty()) {
                                            return ed8.f37069a;
                                        }
                                        return null;
                                    }
                                }
                            }
                        } else {
                            c2764d3 = this;
                            c2764d3.f32755n = list5;
                            zM12970b = gxc.m12970b(ec8Var3.f37003a);
                            list3 = this.f32754m;
                            if (zM12970b) {
                                reviewSessionStateHolder$loadSession$1.f32682a = null;
                                reviewSessionStateHolder$loadSession$1.f32683b = null;
                                reviewSessionStateHolder$loadSession$1.f32684c = this;
                                reviewSessionStateHolder$loadSession$1.f32685d = null;
                                reviewSessionStateHolder$loadSession$1.f32686e = z;
                                reviewSessionStateHolder$loadSession$1.f32689h = 9;
                                objM9600g = m9643a(list3, ec8Var3, reviewSessionStateHolder$loadSession$1);
                                if (objM9600g != coroutineSingletons) {
                                    c2764d4 = this;
                                    list4 = (List) objM9600g;
                                    c2764d4.f32756o = list4;
                                    if (this.f32756o.isEmpty()) {
                                        return ed8.f37069a;
                                    }
                                    return null;
                                }
                            } else {
                                reviewSessionStateHolder$loadSession$1.f32682a = null;
                                reviewSessionStateHolder$loadSession$1.f32683b = null;
                                reviewSessionStateHolder$loadSession$1.f32684c = this;
                                reviewSessionStateHolder$loadSession$1.f32685d = null;
                                reviewSessionStateHolder$loadSession$1.f32686e = z;
                                reviewSessionStateHolder$loadSession$1.f32689h = 10;
                                objM9600g = m9644b(list3, ec8Var3, reviewSessionStateHolder$loadSession$1);
                                if (objM9600g != coroutineSingletons) {
                                    c2764d4 = this;
                                    list4 = (List) objM9600g;
                                    c2764d4.f32756o = list4;
                                    if (this.f32756o.isEmpty()) {
                                        return ed8.f37069a;
                                    }
                                    return null;
                                }
                            }
                        }
                    }
                } else {
                    i = ec8Var2.f37005c;
                    if (i != -1) {
                        reviewSessionStateHolder$loadSession$1.f32682a = ec8Var2;
                        reviewSessionStateHolder$loadSession$1.f32683b = null;
                        reviewSessionStateHolder$loadSession$1.f32684c = this;
                        reviewSessionStateHolder$loadSession$1.f32686e = zBooleanValue;
                        reviewSessionStateHolder$loadSession$1.f32689h = 4;
                        objM7117g = ((C1287c) this.f32749h.f57897a).m7117g(i, reviewSessionStateHolder$loadSession$1);
                        if (objM7117g != coroutineSingletons) {
                            objM9600g = objM7117g;
                            z = zBooleanValue;
                            c2764d2 = this;
                            list2 = (List) objM9600g;
                            if (ec8Var2.f37003a == ReviewType.SrsDue) {
                                arrayList3 = new ArrayList();
                                while (r2.hasNext()) {
                                    str = ((LessonCard) obj2).f19191n;
                                    if (str != null) {
                                        iCompareTo = str.compareTo(hy3.f43148E.m14766a(new DateTime()));
                                    } else {
                                        iCompareTo = 0;
                                    }
                                    if (iCompareTo < 0) {
                                        arrayList3.add(obj2);
                                    }
                                }
                                arrayList2 = new ArrayList(v91.m23189q0(arrayList3, 10));
                                it2 = arrayList3.iterator();
                                while (it2.hasNext()) {
                                    arrayList2.add(((LessonCard) it2.next()).f19178a);
                                }
                            } else {
                                List list8 = list2;
                                arrayList = new ArrayList(v91.m23189q0(list8, 10));
                                it = list8.iterator();
                                while (it.hasNext()) {
                                    arrayList.add(((LessonCard) it.next()).f19178a);
                                }
                                arrayList2 = arrayList;
                            }
                            Set setM22627s3 = u91.m22627s1(arrayList2);
                            reviewSessionStateHolder$loadSession$1.f32682a = ec8Var2;
                            reviewSessionStateHolder$loadSession$1.f32683b = null;
                            reviewSessionStateHolder$loadSession$1.f32684c = null;
                            reviewSessionStateHolder$loadSession$1.f32685d = c2764d2;
                            reviewSessionStateHolder$loadSession$1.f32686e = z;
                            reviewSessionStateHolder$loadSession$1.f32689h = 5;
                            objM9600g = m9653l(setM22627s3, z, ec8Var2, reviewSessionStateHolder$loadSession$1);
                            if (objM9600g != coroutineSingletons) {
                                ec8Var3 = ec8Var2;
                                list = (List) objM9600g;
                                c2764d2.f32754m = list;
                                if (this.f32754m.isEmpty()) {
                                    return fd8.f38913a;
                                }
                                if (gxc.m12970b(ec8Var3.f37003a)) {
                                    String strMo4589b11 = cmaVar.mo4589b2();
                                    reviewSessionStateHolder$loadSession$1.f32682a = ec8Var3;
                                    reviewSessionStateHolder$loadSession$1.f32683b = null;
                                    reviewSessionStateHolder$loadSession$1.f32684c = this;
                                    reviewSessionStateHolder$loadSession$1.f32685d = null;
                                    reviewSessionStateHolder$loadSession$1.f32686e = z;
                                    reviewSessionStateHolder$loadSession$1.f32689h = 8;
                                    objM9600g = ((C1308x) this.f32748g.f63241a).m7416j(strMo4589b11, reviewSessionStateHolder$loadSession$1);
                                    if (objM9600g != coroutineSingletons) {
                                        c2764d3 = this;
                                        ec8Var4 = ec8Var3;
                                        list5 = (List) objM9600g;
                                        ec8Var3 = ec8Var4;
                                        c2764d3.f32755n = list5;
                                        zM12970b = gxc.m12970b(ec8Var3.f37003a);
                                        list3 = this.f32754m;
                                        if (zM12970b) {
                                            reviewSessionStateHolder$loadSession$1.f32682a = null;
                                            reviewSessionStateHolder$loadSession$1.f32683b = null;
                                            reviewSessionStateHolder$loadSession$1.f32684c = this;
                                            reviewSessionStateHolder$loadSession$1.f32685d = null;
                                            reviewSessionStateHolder$loadSession$1.f32686e = z;
                                            reviewSessionStateHolder$loadSession$1.f32689h = 9;
                                            objM9600g = m9643a(list3, ec8Var3, reviewSessionStateHolder$loadSession$1);
                                            if (objM9600g != coroutineSingletons) {
                                                c2764d4 = this;
                                                list4 = (List) objM9600g;
                                                c2764d4.f32756o = list4;
                                                if (this.f32756o.isEmpty()) {
                                                    return ed8.f37069a;
                                                }
                                                return null;
                                            }
                                        } else {
                                            reviewSessionStateHolder$loadSession$1.f32682a = null;
                                            reviewSessionStateHolder$loadSession$1.f32683b = null;
                                            reviewSessionStateHolder$loadSession$1.f32684c = this;
                                            reviewSessionStateHolder$loadSession$1.f32685d = null;
                                            reviewSessionStateHolder$loadSession$1.f32686e = z;
                                            reviewSessionStateHolder$loadSession$1.f32689h = 10;
                                            objM9600g = m9644b(list3, ec8Var3, reviewSessionStateHolder$loadSession$1);
                                            if (objM9600g != coroutineSingletons) {
                                                c2764d4 = this;
                                                list4 = (List) objM9600g;
                                                c2764d4.f32756o = list4;
                                                if (this.f32756o.isEmpty()) {
                                                    return ed8.f37069a;
                                                }
                                                return null;
                                            }
                                        }
                                    }
                                } else {
                                    c2764d3 = this;
                                    c2764d3.f32755n = list5;
                                    zM12970b = gxc.m12970b(ec8Var3.f37003a);
                                    list3 = this.f32754m;
                                    if (zM12970b) {
                                        reviewSessionStateHolder$loadSession$1.f32682a = null;
                                        reviewSessionStateHolder$loadSession$1.f32683b = null;
                                        reviewSessionStateHolder$loadSession$1.f32684c = this;
                                        reviewSessionStateHolder$loadSession$1.f32685d = null;
                                        reviewSessionStateHolder$loadSession$1.f32686e = z;
                                        reviewSessionStateHolder$loadSession$1.f32689h = 9;
                                        objM9600g = m9643a(list3, ec8Var3, reviewSessionStateHolder$loadSession$1);
                                        if (objM9600g != coroutineSingletons) {
                                            c2764d4 = this;
                                            list4 = (List) objM9600g;
                                            c2764d4.f32756o = list4;
                                            if (this.f32756o.isEmpty()) {
                                                return ed8.f37069a;
                                            }
                                            return null;
                                        }
                                    } else {
                                        reviewSessionStateHolder$loadSession$1.f32682a = null;
                                        reviewSessionStateHolder$loadSession$1.f32683b = null;
                                        reviewSessionStateHolder$loadSession$1.f32684c = this;
                                        reviewSessionStateHolder$loadSession$1.f32685d = null;
                                        reviewSessionStateHolder$loadSession$1.f32686e = z;
                                        reviewSessionStateHolder$loadSession$1.f32689h = 10;
                                        objM9600g = m9644b(list3, ec8Var3, reviewSessionStateHolder$loadSession$1);
                                        if (objM9600g != coroutineSingletons) {
                                            c2764d4 = this;
                                            list4 = (List) objM9600g;
                                            c2764d4.f32756o = list4;
                                            if (this.f32756o.isEmpty()) {
                                                return ed8.f37069a;
                                            }
                                            return null;
                                        }
                                    }
                                }
                            }
                        }
                    } else if (ec8Var2.f37008f != null) {
                        reviewSessionStateHolder$loadSession$1.f32682a = ec8Var2;
                        reviewSessionStateHolder$loadSession$1.f32683b = null;
                        reviewSessionStateHolder$loadSession$1.f32684c = this;
                        reviewSessionStateHolder$loadSession$1.f32686e = zBooleanValue;
                        reviewSessionStateHolder$loadSession$1.f32689h = 6;
                        objM9647e = m9647e(zBooleanValue, ec8Var2, reviewSessionStateHolder$loadSession$1);
                        if (objM9647e != coroutineSingletons) {
                            objM9600g = objM9647e;
                            z = zBooleanValue;
                            c2764d2 = this;
                            ec8Var3 = ec8Var2;
                            list = (List) objM9600g;
                            c2764d2.f32754m = list;
                            if (this.f32754m.isEmpty()) {
                                return fd8.f38913a;
                            }
                            if (gxc.m12970b(ec8Var3.f37003a)) {
                                String strMo4589b12 = cmaVar.mo4589b2();
                                reviewSessionStateHolder$loadSession$1.f32682a = ec8Var3;
                                reviewSessionStateHolder$loadSession$1.f32683b = null;
                                reviewSessionStateHolder$loadSession$1.f32684c = this;
                                reviewSessionStateHolder$loadSession$1.f32685d = null;
                                reviewSessionStateHolder$loadSession$1.f32686e = z;
                                reviewSessionStateHolder$loadSession$1.f32689h = 8;
                                objM9600g = ((C1308x) this.f32748g.f63241a).m7416j(strMo4589b12, reviewSessionStateHolder$loadSession$1);
                                if (objM9600g != coroutineSingletons) {
                                    c2764d3 = this;
                                    ec8Var4 = ec8Var3;
                                    list5 = (List) objM9600g;
                                    ec8Var3 = ec8Var4;
                                    c2764d3.f32755n = list5;
                                    zM12970b = gxc.m12970b(ec8Var3.f37003a);
                                    list3 = this.f32754m;
                                    if (zM12970b) {
                                        reviewSessionStateHolder$loadSession$1.f32682a = null;
                                        reviewSessionStateHolder$loadSession$1.f32683b = null;
                                        reviewSessionStateHolder$loadSession$1.f32684c = this;
                                        reviewSessionStateHolder$loadSession$1.f32685d = null;
                                        reviewSessionStateHolder$loadSession$1.f32686e = z;
                                        reviewSessionStateHolder$loadSession$1.f32689h = 9;
                                        objM9600g = m9643a(list3, ec8Var3, reviewSessionStateHolder$loadSession$1);
                                        if (objM9600g != coroutineSingletons) {
                                            c2764d4 = this;
                                            list4 = (List) objM9600g;
                                            c2764d4.f32756o = list4;
                                            if (this.f32756o.isEmpty()) {
                                                return ed8.f37069a;
                                            }
                                            return null;
                                        }
                                    } else {
                                        reviewSessionStateHolder$loadSession$1.f32682a = null;
                                        reviewSessionStateHolder$loadSession$1.f32683b = null;
                                        reviewSessionStateHolder$loadSession$1.f32684c = this;
                                        reviewSessionStateHolder$loadSession$1.f32685d = null;
                                        reviewSessionStateHolder$loadSession$1.f32686e = z;
                                        reviewSessionStateHolder$loadSession$1.f32689h = 10;
                                        objM9600g = m9644b(list3, ec8Var3, reviewSessionStateHolder$loadSession$1);
                                        if (objM9600g != coroutineSingletons) {
                                            c2764d4 = this;
                                            list4 = (List) objM9600g;
                                            c2764d4.f32756o = list4;
                                            if (this.f32756o.isEmpty()) {
                                                return ed8.f37069a;
                                            }
                                            return null;
                                        }
                                    }
                                }
                            } else {
                                c2764d3 = this;
                                c2764d3.f32755n = list5;
                                zM12970b = gxc.m12970b(ec8Var3.f37003a);
                                list3 = this.f32754m;
                                if (zM12970b) {
                                    reviewSessionStateHolder$loadSession$1.f32682a = null;
                                    reviewSessionStateHolder$loadSession$1.f32683b = null;
                                    reviewSessionStateHolder$loadSession$1.f32684c = this;
                                    reviewSessionStateHolder$loadSession$1.f32685d = null;
                                    reviewSessionStateHolder$loadSession$1.f32686e = z;
                                    reviewSessionStateHolder$loadSession$1.f32689h = 9;
                                    objM9600g = m9643a(list3, ec8Var3, reviewSessionStateHolder$loadSession$1);
                                    if (objM9600g != coroutineSingletons) {
                                        c2764d4 = this;
                                        list4 = (List) objM9600g;
                                        c2764d4.f32756o = list4;
                                        if (this.f32756o.isEmpty()) {
                                            return ed8.f37069a;
                                        }
                                        return null;
                                    }
                                } else {
                                    reviewSessionStateHolder$loadSession$1.f32682a = null;
                                    reviewSessionStateHolder$loadSession$1.f32683b = null;
                                    reviewSessionStateHolder$loadSession$1.f32684c = this;
                                    reviewSessionStateHolder$loadSession$1.f32685d = null;
                                    reviewSessionStateHolder$loadSession$1.f32686e = z;
                                    reviewSessionStateHolder$loadSession$1.f32689h = 10;
                                    objM9600g = m9644b(list3, ec8Var3, reviewSessionStateHolder$loadSession$1);
                                    if (objM9600g != coroutineSingletons) {
                                        c2764d4 = this;
                                        list4 = (List) objM9600g;
                                        c2764d4.f32756o = list4;
                                        if (this.f32756o.isEmpty()) {
                                            return ed8.f37069a;
                                        }
                                        return null;
                                    }
                                }
                            }
                        }
                    } else {
                        reviewSessionStateHolder$loadSession$1.f32682a = ec8Var2;
                        reviewSessionStateHolder$loadSession$1.f32683b = null;
                        reviewSessionStateHolder$loadSession$1.f32684c = this;
                        reviewSessionStateHolder$loadSession$1.f32686e = zBooleanValue;
                        reviewSessionStateHolder$loadSession$1.f32689h = 7;
                        objM9646d = m9646d(zBooleanValue, ec8Var2, reviewSessionStateHolder$loadSession$1);
                        if (objM9646d != coroutineSingletons) {
                            objM9600g = objM9646d;
                            z = zBooleanValue;
                            c2764d2 = this;
                            ec8Var3 = ec8Var2;
                            list = (List) objM9600g;
                            c2764d2.f32754m = list;
                            if (this.f32754m.isEmpty()) {
                                return fd8.f38913a;
                            }
                            if (gxc.m12970b(ec8Var3.f37003a)) {
                                String strMo4589b13 = cmaVar.mo4589b2();
                                reviewSessionStateHolder$loadSession$1.f32682a = ec8Var3;
                                reviewSessionStateHolder$loadSession$1.f32683b = null;
                                reviewSessionStateHolder$loadSession$1.f32684c = this;
                                reviewSessionStateHolder$loadSession$1.f32685d = null;
                                reviewSessionStateHolder$loadSession$1.f32686e = z;
                                reviewSessionStateHolder$loadSession$1.f32689h = 8;
                                objM9600g = ((C1308x) this.f32748g.f63241a).m7416j(strMo4589b13, reviewSessionStateHolder$loadSession$1);
                                if (objM9600g != coroutineSingletons) {
                                    c2764d3 = this;
                                    ec8Var4 = ec8Var3;
                                    list5 = (List) objM9600g;
                                    ec8Var3 = ec8Var4;
                                    c2764d3.f32755n = list5;
                                    zM12970b = gxc.m12970b(ec8Var3.f37003a);
                                    list3 = this.f32754m;
                                    if (zM12970b) {
                                        reviewSessionStateHolder$loadSession$1.f32682a = null;
                                        reviewSessionStateHolder$loadSession$1.f32683b = null;
                                        reviewSessionStateHolder$loadSession$1.f32684c = this;
                                        reviewSessionStateHolder$loadSession$1.f32685d = null;
                                        reviewSessionStateHolder$loadSession$1.f32686e = z;
                                        reviewSessionStateHolder$loadSession$1.f32689h = 9;
                                        objM9600g = m9643a(list3, ec8Var3, reviewSessionStateHolder$loadSession$1);
                                        if (objM9600g != coroutineSingletons) {
                                            c2764d4 = this;
                                            list4 = (List) objM9600g;
                                            c2764d4.f32756o = list4;
                                            if (this.f32756o.isEmpty()) {
                                                return ed8.f37069a;
                                            }
                                            return null;
                                        }
                                    } else {
                                        reviewSessionStateHolder$loadSession$1.f32682a = null;
                                        reviewSessionStateHolder$loadSession$1.f32683b = null;
                                        reviewSessionStateHolder$loadSession$1.f32684c = this;
                                        reviewSessionStateHolder$loadSession$1.f32685d = null;
                                        reviewSessionStateHolder$loadSession$1.f32686e = z;
                                        reviewSessionStateHolder$loadSession$1.f32689h = 10;
                                        objM9600g = m9644b(list3, ec8Var3, reviewSessionStateHolder$loadSession$1);
                                        if (objM9600g != coroutineSingletons) {
                                            c2764d4 = this;
                                            list4 = (List) objM9600g;
                                            c2764d4.f32756o = list4;
                                            if (this.f32756o.isEmpty()) {
                                                return ed8.f37069a;
                                            }
                                            return null;
                                        }
                                    }
                                }
                            } else {
                                c2764d3 = this;
                                c2764d3.f32755n = list5;
                                zM12970b = gxc.m12970b(ec8Var3.f37003a);
                                list3 = this.f32754m;
                                if (zM12970b) {
                                    reviewSessionStateHolder$loadSession$1.f32682a = null;
                                    reviewSessionStateHolder$loadSession$1.f32683b = null;
                                    reviewSessionStateHolder$loadSession$1.f32684c = this;
                                    reviewSessionStateHolder$loadSession$1.f32685d = null;
                                    reviewSessionStateHolder$loadSession$1.f32686e = z;
                                    reviewSessionStateHolder$loadSession$1.f32689h = 9;
                                    objM9600g = m9643a(list3, ec8Var3, reviewSessionStateHolder$loadSession$1);
                                    if (objM9600g != coroutineSingletons) {
                                        c2764d4 = this;
                                        list4 = (List) objM9600g;
                                        c2764d4.f32756o = list4;
                                        if (this.f32756o.isEmpty()) {
                                            return ed8.f37069a;
                                        }
                                        return null;
                                    }
                                } else {
                                    reviewSessionStateHolder$loadSession$1.f32682a = null;
                                    reviewSessionStateHolder$loadSession$1.f32683b = null;
                                    reviewSessionStateHolder$loadSession$1.f32684c = this;
                                    reviewSessionStateHolder$loadSession$1.f32685d = null;
                                    reviewSessionStateHolder$loadSession$1.f32686e = z;
                                    reviewSessionStateHolder$loadSession$1.f32689h = 10;
                                    objM9600g = m9644b(list3, ec8Var3, reviewSessionStateHolder$loadSession$1);
                                    if (objM9600g != coroutineSingletons) {
                                        c2764d4 = this;
                                        list4 = (List) objM9600g;
                                        c2764d4.f32756o = list4;
                                        if (this.f32756o.isEmpty()) {
                                            return ed8.f37069a;
                                        }
                                        return null;
                                    }
                                }
                            }
                        }
                    }
                }
                return coroutineSingletons;
            case 3:
                z = reviewSessionStateHolder$loadSession$1.f32686e;
                c2764d2 = reviewSessionStateHolder$loadSession$1.f32684c;
                Set set4 = reviewSessionStateHolder$loadSession$1.f32683b;
                ec8Var3 = reviewSessionStateHolder$loadSession$1.f32682a;
                AbstractC3193b.m15359b(objM9600g);
                list = (List) objM9600g;
                c2764d2.f32754m = list;
                if (this.f32754m.isEmpty()) {
                    return fd8.f38913a;
                }
                if (gxc.m12970b(ec8Var3.f37003a)) {
                    String strMo4589b14 = cmaVar.mo4589b2();
                    reviewSessionStateHolder$loadSession$1.f32682a = ec8Var3;
                    reviewSessionStateHolder$loadSession$1.f32683b = null;
                    reviewSessionStateHolder$loadSession$1.f32684c = this;
                    reviewSessionStateHolder$loadSession$1.f32685d = null;
                    reviewSessionStateHolder$loadSession$1.f32686e = z;
                    reviewSessionStateHolder$loadSession$1.f32689h = 8;
                    objM9600g = ((C1308x) this.f32748g.f63241a).m7416j(strMo4589b14, reviewSessionStateHolder$loadSession$1);
                    if (objM9600g != coroutineSingletons) {
                        c2764d3 = this;
                        ec8Var4 = ec8Var3;
                        list5 = (List) objM9600g;
                        ec8Var3 = ec8Var4;
                        c2764d3.f32755n = list5;
                        zM12970b = gxc.m12970b(ec8Var3.f37003a);
                        list3 = this.f32754m;
                        if (zM12970b) {
                            reviewSessionStateHolder$loadSession$1.f32682a = null;
                            reviewSessionStateHolder$loadSession$1.f32683b = null;
                            reviewSessionStateHolder$loadSession$1.f32684c = this;
                            reviewSessionStateHolder$loadSession$1.f32685d = null;
                            reviewSessionStateHolder$loadSession$1.f32686e = z;
                            reviewSessionStateHolder$loadSession$1.f32689h = 9;
                            objM9600g = m9643a(list3, ec8Var3, reviewSessionStateHolder$loadSession$1);
                            if (objM9600g != coroutineSingletons) {
                                c2764d4 = this;
                                list4 = (List) objM9600g;
                                c2764d4.f32756o = list4;
                                if (this.f32756o.isEmpty()) {
                                    return ed8.f37069a;
                                }
                                return null;
                            }
                        } else {
                            reviewSessionStateHolder$loadSession$1.f32682a = null;
                            reviewSessionStateHolder$loadSession$1.f32683b = null;
                            reviewSessionStateHolder$loadSession$1.f32684c = this;
                            reviewSessionStateHolder$loadSession$1.f32685d = null;
                            reviewSessionStateHolder$loadSession$1.f32686e = z;
                            reviewSessionStateHolder$loadSession$1.f32689h = 10;
                            objM9600g = m9644b(list3, ec8Var3, reviewSessionStateHolder$loadSession$1);
                            if (objM9600g != coroutineSingletons) {
                                c2764d4 = this;
                                list4 = (List) objM9600g;
                                c2764d4.f32756o = list4;
                                if (this.f32756o.isEmpty()) {
                                    return ed8.f37069a;
                                }
                                return null;
                            }
                        }
                    }
                } else {
                    c2764d3 = this;
                    c2764d3.f32755n = list5;
                    zM12970b = gxc.m12970b(ec8Var3.f37003a);
                    list3 = this.f32754m;
                    if (zM12970b) {
                        reviewSessionStateHolder$loadSession$1.f32682a = null;
                        reviewSessionStateHolder$loadSession$1.f32683b = null;
                        reviewSessionStateHolder$loadSession$1.f32684c = this;
                        reviewSessionStateHolder$loadSession$1.f32685d = null;
                        reviewSessionStateHolder$loadSession$1.f32686e = z;
                        reviewSessionStateHolder$loadSession$1.f32689h = 9;
                        objM9600g = m9643a(list3, ec8Var3, reviewSessionStateHolder$loadSession$1);
                        if (objM9600g != coroutineSingletons) {
                            c2764d4 = this;
                            list4 = (List) objM9600g;
                            c2764d4.f32756o = list4;
                            if (this.f32756o.isEmpty()) {
                                return ed8.f37069a;
                            }
                            return null;
                        }
                    } else {
                        reviewSessionStateHolder$loadSession$1.f32682a = null;
                        reviewSessionStateHolder$loadSession$1.f32683b = null;
                        reviewSessionStateHolder$loadSession$1.f32684c = this;
                        reviewSessionStateHolder$loadSession$1.f32685d = null;
                        reviewSessionStateHolder$loadSession$1.f32686e = z;
                        reviewSessionStateHolder$loadSession$1.f32689h = 10;
                        objM9600g = m9644b(list3, ec8Var3, reviewSessionStateHolder$loadSession$1);
                        if (objM9600g != coroutineSingletons) {
                            c2764d4 = this;
                            list4 = (List) objM9600g;
                            c2764d4.f32756o = list4;
                            if (this.f32756o.isEmpty()) {
                                return ed8.f37069a;
                            }
                            return null;
                        }
                    }
                }
                return coroutineSingletons;
            case 4:
                z = reviewSessionStateHolder$loadSession$1.f32686e;
                c2764d2 = reviewSessionStateHolder$loadSession$1.f32684c;
                Set set5 = reviewSessionStateHolder$loadSession$1.f32683b;
                ec8 ec8Var6 = reviewSessionStateHolder$loadSession$1.f32682a;
                AbstractC3193b.m15359b(objM9600g);
                ec8Var2 = ec8Var6;
                list2 = (List) objM9600g;
                if (ec8Var2.f37003a == ReviewType.SrsDue) {
                    arrayList3 = new ArrayList();
                    while (r2.hasNext()) {
                        str = ((LessonCard) obj2).f19191n;
                        if (str != null) {
                            iCompareTo = str.compareTo(hy3.f43148E.m14766a(new DateTime()));
                        } else {
                            iCompareTo = 0;
                        }
                        if (iCompareTo < 0) {
                            arrayList3.add(obj2);
                        }
                    }
                    arrayList2 = new ArrayList(v91.m23189q0(arrayList3, 10));
                    it2 = arrayList3.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(((LessonCard) it2.next()).f19178a);
                    }
                } else {
                    List list9 = list2;
                    arrayList = new ArrayList(v91.m23189q0(list9, 10));
                    it = list9.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((LessonCard) it.next()).f19178a);
                    }
                    arrayList2 = arrayList;
                }
                Set setM22627s4 = u91.m22627s1(arrayList2);
                reviewSessionStateHolder$loadSession$1.f32682a = ec8Var2;
                reviewSessionStateHolder$loadSession$1.f32683b = null;
                reviewSessionStateHolder$loadSession$1.f32684c = null;
                reviewSessionStateHolder$loadSession$1.f32685d = c2764d2;
                reviewSessionStateHolder$loadSession$1.f32686e = z;
                reviewSessionStateHolder$loadSession$1.f32689h = 5;
                objM9600g = m9653l(setM22627s4, z, ec8Var2, reviewSessionStateHolder$loadSession$1);
                if (objM9600g != coroutineSingletons) {
                    ec8Var3 = ec8Var2;
                    list = (List) objM9600g;
                    c2764d2.f32754m = list;
                    if (this.f32754m.isEmpty()) {
                        return fd8.f38913a;
                    }
                    if (gxc.m12970b(ec8Var3.f37003a)) {
                        String strMo4589b15 = cmaVar.mo4589b2();
                        reviewSessionStateHolder$loadSession$1.f32682a = ec8Var3;
                        reviewSessionStateHolder$loadSession$1.f32683b = null;
                        reviewSessionStateHolder$loadSession$1.f32684c = this;
                        reviewSessionStateHolder$loadSession$1.f32685d = null;
                        reviewSessionStateHolder$loadSession$1.f32686e = z;
                        reviewSessionStateHolder$loadSession$1.f32689h = 8;
                        objM9600g = ((C1308x) this.f32748g.f63241a).m7416j(strMo4589b15, reviewSessionStateHolder$loadSession$1);
                        if (objM9600g != coroutineSingletons) {
                            c2764d3 = this;
                            ec8Var4 = ec8Var3;
                            list5 = (List) objM9600g;
                            ec8Var3 = ec8Var4;
                            c2764d3.f32755n = list5;
                            zM12970b = gxc.m12970b(ec8Var3.f37003a);
                            list3 = this.f32754m;
                            if (zM12970b) {
                                reviewSessionStateHolder$loadSession$1.f32682a = null;
                                reviewSessionStateHolder$loadSession$1.f32683b = null;
                                reviewSessionStateHolder$loadSession$1.f32684c = this;
                                reviewSessionStateHolder$loadSession$1.f32685d = null;
                                reviewSessionStateHolder$loadSession$1.f32686e = z;
                                reviewSessionStateHolder$loadSession$1.f32689h = 9;
                                objM9600g = m9643a(list3, ec8Var3, reviewSessionStateHolder$loadSession$1);
                                if (objM9600g != coroutineSingletons) {
                                    c2764d4 = this;
                                    list4 = (List) objM9600g;
                                    c2764d4.f32756o = list4;
                                    if (this.f32756o.isEmpty()) {
                                        return ed8.f37069a;
                                    }
                                    return null;
                                }
                            } else {
                                reviewSessionStateHolder$loadSession$1.f32682a = null;
                                reviewSessionStateHolder$loadSession$1.f32683b = null;
                                reviewSessionStateHolder$loadSession$1.f32684c = this;
                                reviewSessionStateHolder$loadSession$1.f32685d = null;
                                reviewSessionStateHolder$loadSession$1.f32686e = z;
                                reviewSessionStateHolder$loadSession$1.f32689h = 10;
                                objM9600g = m9644b(list3, ec8Var3, reviewSessionStateHolder$loadSession$1);
                                if (objM9600g != coroutineSingletons) {
                                    c2764d4 = this;
                                    list4 = (List) objM9600g;
                                    c2764d4.f32756o = list4;
                                    if (this.f32756o.isEmpty()) {
                                        return ed8.f37069a;
                                    }
                                    return null;
                                }
                            }
                        }
                    } else {
                        c2764d3 = this;
                        c2764d3.f32755n = list5;
                        zM12970b = gxc.m12970b(ec8Var3.f37003a);
                        list3 = this.f32754m;
                        if (zM12970b) {
                            reviewSessionStateHolder$loadSession$1.f32682a = null;
                            reviewSessionStateHolder$loadSession$1.f32683b = null;
                            reviewSessionStateHolder$loadSession$1.f32684c = this;
                            reviewSessionStateHolder$loadSession$1.f32685d = null;
                            reviewSessionStateHolder$loadSession$1.f32686e = z;
                            reviewSessionStateHolder$loadSession$1.f32689h = 9;
                            objM9600g = m9643a(list3, ec8Var3, reviewSessionStateHolder$loadSession$1);
                            if (objM9600g != coroutineSingletons) {
                                c2764d4 = this;
                                list4 = (List) objM9600g;
                                c2764d4.f32756o = list4;
                                if (this.f32756o.isEmpty()) {
                                    return ed8.f37069a;
                                }
                                return null;
                            }
                        } else {
                            reviewSessionStateHolder$loadSession$1.f32682a = null;
                            reviewSessionStateHolder$loadSession$1.f32683b = null;
                            reviewSessionStateHolder$loadSession$1.f32684c = this;
                            reviewSessionStateHolder$loadSession$1.f32685d = null;
                            reviewSessionStateHolder$loadSession$1.f32686e = z;
                            reviewSessionStateHolder$loadSession$1.f32689h = 10;
                            objM9600g = m9644b(list3, ec8Var3, reviewSessionStateHolder$loadSession$1);
                            if (objM9600g != coroutineSingletons) {
                                c2764d4 = this;
                                list4 = (List) objM9600g;
                                c2764d4.f32756o = list4;
                                if (this.f32756o.isEmpty()) {
                                    return ed8.f37069a;
                                }
                                return null;
                            }
                        }
                    }
                }
                return coroutineSingletons;
            case 5:
                z = reviewSessionStateHolder$loadSession$1.f32686e;
                c2764d2 = reviewSessionStateHolder$loadSession$1.f32685d;
                Set set6 = reviewSessionStateHolder$loadSession$1.f32683b;
                ec8Var3 = reviewSessionStateHolder$loadSession$1.f32682a;
                AbstractC3193b.m15359b(objM9600g);
                list = (List) objM9600g;
                c2764d2.f32754m = list;
                if (this.f32754m.isEmpty()) {
                    return fd8.f38913a;
                }
                if (gxc.m12970b(ec8Var3.f37003a)) {
                    String strMo4589b16 = cmaVar.mo4589b2();
                    reviewSessionStateHolder$loadSession$1.f32682a = ec8Var3;
                    reviewSessionStateHolder$loadSession$1.f32683b = null;
                    reviewSessionStateHolder$loadSession$1.f32684c = this;
                    reviewSessionStateHolder$loadSession$1.f32685d = null;
                    reviewSessionStateHolder$loadSession$1.f32686e = z;
                    reviewSessionStateHolder$loadSession$1.f32689h = 8;
                    objM9600g = ((C1308x) this.f32748g.f63241a).m7416j(strMo4589b16, reviewSessionStateHolder$loadSession$1);
                    if (objM9600g != coroutineSingletons) {
                        c2764d3 = this;
                        ec8Var4 = ec8Var3;
                        list5 = (List) objM9600g;
                        ec8Var3 = ec8Var4;
                        c2764d3.f32755n = list5;
                        zM12970b = gxc.m12970b(ec8Var3.f37003a);
                        list3 = this.f32754m;
                        if (zM12970b) {
                            reviewSessionStateHolder$loadSession$1.f32682a = null;
                            reviewSessionStateHolder$loadSession$1.f32683b = null;
                            reviewSessionStateHolder$loadSession$1.f32684c = this;
                            reviewSessionStateHolder$loadSession$1.f32685d = null;
                            reviewSessionStateHolder$loadSession$1.f32686e = z;
                            reviewSessionStateHolder$loadSession$1.f32689h = 9;
                            objM9600g = m9643a(list3, ec8Var3, reviewSessionStateHolder$loadSession$1);
                            if (objM9600g != coroutineSingletons) {
                                c2764d4 = this;
                                list4 = (List) objM9600g;
                                c2764d4.f32756o = list4;
                                if (this.f32756o.isEmpty()) {
                                    return ed8.f37069a;
                                }
                                return null;
                            }
                        } else {
                            reviewSessionStateHolder$loadSession$1.f32682a = null;
                            reviewSessionStateHolder$loadSession$1.f32683b = null;
                            reviewSessionStateHolder$loadSession$1.f32684c = this;
                            reviewSessionStateHolder$loadSession$1.f32685d = null;
                            reviewSessionStateHolder$loadSession$1.f32686e = z;
                            reviewSessionStateHolder$loadSession$1.f32689h = 10;
                            objM9600g = m9644b(list3, ec8Var3, reviewSessionStateHolder$loadSession$1);
                            if (objM9600g != coroutineSingletons) {
                                c2764d4 = this;
                                list4 = (List) objM9600g;
                                c2764d4.f32756o = list4;
                                if (this.f32756o.isEmpty()) {
                                    return ed8.f37069a;
                                }
                                return null;
                            }
                        }
                    }
                } else {
                    c2764d3 = this;
                    c2764d3.f32755n = list5;
                    zM12970b = gxc.m12970b(ec8Var3.f37003a);
                    list3 = this.f32754m;
                    if (zM12970b) {
                        reviewSessionStateHolder$loadSession$1.f32682a = null;
                        reviewSessionStateHolder$loadSession$1.f32683b = null;
                        reviewSessionStateHolder$loadSession$1.f32684c = this;
                        reviewSessionStateHolder$loadSession$1.f32685d = null;
                        reviewSessionStateHolder$loadSession$1.f32686e = z;
                        reviewSessionStateHolder$loadSession$1.f32689h = 9;
                        objM9600g = m9643a(list3, ec8Var3, reviewSessionStateHolder$loadSession$1);
                        if (objM9600g != coroutineSingletons) {
                            c2764d4 = this;
                            list4 = (List) objM9600g;
                            c2764d4.f32756o = list4;
                            if (this.f32756o.isEmpty()) {
                                return ed8.f37069a;
                            }
                            return null;
                        }
                    } else {
                        reviewSessionStateHolder$loadSession$1.f32682a = null;
                        reviewSessionStateHolder$loadSession$1.f32683b = null;
                        reviewSessionStateHolder$loadSession$1.f32684c = this;
                        reviewSessionStateHolder$loadSession$1.f32685d = null;
                        reviewSessionStateHolder$loadSession$1.f32686e = z;
                        reviewSessionStateHolder$loadSession$1.f32689h = 10;
                        objM9600g = m9644b(list3, ec8Var3, reviewSessionStateHolder$loadSession$1);
                        if (objM9600g != coroutineSingletons) {
                            c2764d4 = this;
                            list4 = (List) objM9600g;
                            c2764d4.f32756o = list4;
                            if (this.f32756o.isEmpty()) {
                                return ed8.f37069a;
                            }
                            return null;
                        }
                    }
                }
                return coroutineSingletons;
            case 6:
                z = reviewSessionStateHolder$loadSession$1.f32686e;
                c2764d2 = reviewSessionStateHolder$loadSession$1.f32684c;
                Set set7 = reviewSessionStateHolder$loadSession$1.f32683b;
                ec8Var3 = reviewSessionStateHolder$loadSession$1.f32682a;
                AbstractC3193b.m15359b(objM9600g);
                list = (List) objM9600g;
                c2764d2.f32754m = list;
                if (this.f32754m.isEmpty()) {
                    return fd8.f38913a;
                }
                if (gxc.m12970b(ec8Var3.f37003a)) {
                    String strMo4589b17 = cmaVar.mo4589b2();
                    reviewSessionStateHolder$loadSession$1.f32682a = ec8Var3;
                    reviewSessionStateHolder$loadSession$1.f32683b = null;
                    reviewSessionStateHolder$loadSession$1.f32684c = this;
                    reviewSessionStateHolder$loadSession$1.f32685d = null;
                    reviewSessionStateHolder$loadSession$1.f32686e = z;
                    reviewSessionStateHolder$loadSession$1.f32689h = 8;
                    objM9600g = ((C1308x) this.f32748g.f63241a).m7416j(strMo4589b17, reviewSessionStateHolder$loadSession$1);
                    if (objM9600g != coroutineSingletons) {
                        c2764d3 = this;
                        ec8Var4 = ec8Var3;
                        list5 = (List) objM9600g;
                        ec8Var3 = ec8Var4;
                        c2764d3.f32755n = list5;
                        zM12970b = gxc.m12970b(ec8Var3.f37003a);
                        list3 = this.f32754m;
                        if (zM12970b) {
                            reviewSessionStateHolder$loadSession$1.f32682a = null;
                            reviewSessionStateHolder$loadSession$1.f32683b = null;
                            reviewSessionStateHolder$loadSession$1.f32684c = this;
                            reviewSessionStateHolder$loadSession$1.f32685d = null;
                            reviewSessionStateHolder$loadSession$1.f32686e = z;
                            reviewSessionStateHolder$loadSession$1.f32689h = 9;
                            objM9600g = m9643a(list3, ec8Var3, reviewSessionStateHolder$loadSession$1);
                            if (objM9600g != coroutineSingletons) {
                                c2764d4 = this;
                                list4 = (List) objM9600g;
                                c2764d4.f32756o = list4;
                                if (this.f32756o.isEmpty()) {
                                    return ed8.f37069a;
                                }
                                return null;
                            }
                        } else {
                            reviewSessionStateHolder$loadSession$1.f32682a = null;
                            reviewSessionStateHolder$loadSession$1.f32683b = null;
                            reviewSessionStateHolder$loadSession$1.f32684c = this;
                            reviewSessionStateHolder$loadSession$1.f32685d = null;
                            reviewSessionStateHolder$loadSession$1.f32686e = z;
                            reviewSessionStateHolder$loadSession$1.f32689h = 10;
                            objM9600g = m9644b(list3, ec8Var3, reviewSessionStateHolder$loadSession$1);
                            if (objM9600g != coroutineSingletons) {
                                c2764d4 = this;
                                list4 = (List) objM9600g;
                                c2764d4.f32756o = list4;
                                if (this.f32756o.isEmpty()) {
                                    return ed8.f37069a;
                                }
                                return null;
                            }
                        }
                    }
                } else {
                    c2764d3 = this;
                    c2764d3.f32755n = list5;
                    zM12970b = gxc.m12970b(ec8Var3.f37003a);
                    list3 = this.f32754m;
                    if (zM12970b) {
                        reviewSessionStateHolder$loadSession$1.f32682a = null;
                        reviewSessionStateHolder$loadSession$1.f32683b = null;
                        reviewSessionStateHolder$loadSession$1.f32684c = this;
                        reviewSessionStateHolder$loadSession$1.f32685d = null;
                        reviewSessionStateHolder$loadSession$1.f32686e = z;
                        reviewSessionStateHolder$loadSession$1.f32689h = 9;
                        objM9600g = m9643a(list3, ec8Var3, reviewSessionStateHolder$loadSession$1);
                        if (objM9600g != coroutineSingletons) {
                            c2764d4 = this;
                            list4 = (List) objM9600g;
                            c2764d4.f32756o = list4;
                            if (this.f32756o.isEmpty()) {
                                return ed8.f37069a;
                            }
                            return null;
                        }
                    } else {
                        reviewSessionStateHolder$loadSession$1.f32682a = null;
                        reviewSessionStateHolder$loadSession$1.f32683b = null;
                        reviewSessionStateHolder$loadSession$1.f32684c = this;
                        reviewSessionStateHolder$loadSession$1.f32685d = null;
                        reviewSessionStateHolder$loadSession$1.f32686e = z;
                        reviewSessionStateHolder$loadSession$1.f32689h = 10;
                        objM9600g = m9644b(list3, ec8Var3, reviewSessionStateHolder$loadSession$1);
                        if (objM9600g != coroutineSingletons) {
                            c2764d4 = this;
                            list4 = (List) objM9600g;
                            c2764d4.f32756o = list4;
                            if (this.f32756o.isEmpty()) {
                                return ed8.f37069a;
                            }
                            return null;
                        }
                    }
                }
                return coroutineSingletons;
            case 7:
                z = reviewSessionStateHolder$loadSession$1.f32686e;
                c2764d2 = reviewSessionStateHolder$loadSession$1.f32684c;
                Set set8 = reviewSessionStateHolder$loadSession$1.f32683b;
                ec8Var3 = reviewSessionStateHolder$loadSession$1.f32682a;
                AbstractC3193b.m15359b(objM9600g);
                list = (List) objM9600g;
                c2764d2.f32754m = list;
                if (this.f32754m.isEmpty()) {
                    return fd8.f38913a;
                }
                if (gxc.m12970b(ec8Var3.f37003a)) {
                    String strMo4589b18 = cmaVar.mo4589b2();
                    reviewSessionStateHolder$loadSession$1.f32682a = ec8Var3;
                    reviewSessionStateHolder$loadSession$1.f32683b = null;
                    reviewSessionStateHolder$loadSession$1.f32684c = this;
                    reviewSessionStateHolder$loadSession$1.f32685d = null;
                    reviewSessionStateHolder$loadSession$1.f32686e = z;
                    reviewSessionStateHolder$loadSession$1.f32689h = 8;
                    objM9600g = ((C1308x) this.f32748g.f63241a).m7416j(strMo4589b18, reviewSessionStateHolder$loadSession$1);
                    if (objM9600g != coroutineSingletons) {
                        c2764d3 = this;
                        ec8Var4 = ec8Var3;
                        list5 = (List) objM9600g;
                        ec8Var3 = ec8Var4;
                        c2764d3.f32755n = list5;
                        zM12970b = gxc.m12970b(ec8Var3.f37003a);
                        list3 = this.f32754m;
                        if (zM12970b) {
                            reviewSessionStateHolder$loadSession$1.f32682a = null;
                            reviewSessionStateHolder$loadSession$1.f32683b = null;
                            reviewSessionStateHolder$loadSession$1.f32684c = this;
                            reviewSessionStateHolder$loadSession$1.f32685d = null;
                            reviewSessionStateHolder$loadSession$1.f32686e = z;
                            reviewSessionStateHolder$loadSession$1.f32689h = 9;
                            objM9600g = m9643a(list3, ec8Var3, reviewSessionStateHolder$loadSession$1);
                            if (objM9600g != coroutineSingletons) {
                                c2764d4 = this;
                                list4 = (List) objM9600g;
                                c2764d4.f32756o = list4;
                                if (this.f32756o.isEmpty()) {
                                    return ed8.f37069a;
                                }
                                return null;
                            }
                        } else {
                            reviewSessionStateHolder$loadSession$1.f32682a = null;
                            reviewSessionStateHolder$loadSession$1.f32683b = null;
                            reviewSessionStateHolder$loadSession$1.f32684c = this;
                            reviewSessionStateHolder$loadSession$1.f32685d = null;
                            reviewSessionStateHolder$loadSession$1.f32686e = z;
                            reviewSessionStateHolder$loadSession$1.f32689h = 10;
                            objM9600g = m9644b(list3, ec8Var3, reviewSessionStateHolder$loadSession$1);
                            if (objM9600g != coroutineSingletons) {
                                c2764d4 = this;
                                list4 = (List) objM9600g;
                                c2764d4.f32756o = list4;
                                if (this.f32756o.isEmpty()) {
                                    return ed8.f37069a;
                                }
                                return null;
                            }
                        }
                    }
                } else {
                    c2764d3 = this;
                    c2764d3.f32755n = list5;
                    zM12970b = gxc.m12970b(ec8Var3.f37003a);
                    list3 = this.f32754m;
                    if (zM12970b) {
                        reviewSessionStateHolder$loadSession$1.f32682a = null;
                        reviewSessionStateHolder$loadSession$1.f32683b = null;
                        reviewSessionStateHolder$loadSession$1.f32684c = this;
                        reviewSessionStateHolder$loadSession$1.f32685d = null;
                        reviewSessionStateHolder$loadSession$1.f32686e = z;
                        reviewSessionStateHolder$loadSession$1.f32689h = 9;
                        objM9600g = m9643a(list3, ec8Var3, reviewSessionStateHolder$loadSession$1);
                        if (objM9600g != coroutineSingletons) {
                            c2764d4 = this;
                            list4 = (List) objM9600g;
                            c2764d4.f32756o = list4;
                            if (this.f32756o.isEmpty()) {
                                return ed8.f37069a;
                            }
                            return null;
                        }
                    } else {
                        reviewSessionStateHolder$loadSession$1.f32682a = null;
                        reviewSessionStateHolder$loadSession$1.f32683b = null;
                        reviewSessionStateHolder$loadSession$1.f32684c = this;
                        reviewSessionStateHolder$loadSession$1.f32685d = null;
                        reviewSessionStateHolder$loadSession$1.f32686e = z;
                        reviewSessionStateHolder$loadSession$1.f32689h = 10;
                        objM9600g = m9644b(list3, ec8Var3, reviewSessionStateHolder$loadSession$1);
                        if (objM9600g != coroutineSingletons) {
                            c2764d4 = this;
                            list4 = (List) objM9600g;
                            c2764d4.f32756o = list4;
                            if (this.f32756o.isEmpty()) {
                                return ed8.f37069a;
                            }
                            return null;
                        }
                    }
                }
                return coroutineSingletons;
            case 8:
                z = reviewSessionStateHolder$loadSession$1.f32686e;
                c2764d3 = reviewSessionStateHolder$loadSession$1.f32684c;
                Set set9 = reviewSessionStateHolder$loadSession$1.f32683b;
                ec8Var4 = reviewSessionStateHolder$loadSession$1.f32682a;
                AbstractC3193b.m15359b(objM9600g);
                list5 = (List) objM9600g;
                ec8Var3 = ec8Var4;
                c2764d3.f32755n = list5;
                zM12970b = gxc.m12970b(ec8Var3.f37003a);
                list3 = this.f32754m;
                if (zM12970b) {
                    reviewSessionStateHolder$loadSession$1.f32682a = null;
                    reviewSessionStateHolder$loadSession$1.f32683b = null;
                    reviewSessionStateHolder$loadSession$1.f32684c = this;
                    reviewSessionStateHolder$loadSession$1.f32685d = null;
                    reviewSessionStateHolder$loadSession$1.f32686e = z;
                    reviewSessionStateHolder$loadSession$1.f32689h = 9;
                    objM9600g = m9643a(list3, ec8Var3, reviewSessionStateHolder$loadSession$1);
                    if (objM9600g != coroutineSingletons) {
                        c2764d4 = this;
                        list4 = (List) objM9600g;
                        c2764d4.f32756o = list4;
                        if (this.f32756o.isEmpty()) {
                            return ed8.f37069a;
                        }
                        return null;
                    }
                } else {
                    reviewSessionStateHolder$loadSession$1.f32682a = null;
                    reviewSessionStateHolder$loadSession$1.f32683b = null;
                    reviewSessionStateHolder$loadSession$1.f32684c = this;
                    reviewSessionStateHolder$loadSession$1.f32685d = null;
                    reviewSessionStateHolder$loadSession$1.f32686e = z;
                    reviewSessionStateHolder$loadSession$1.f32689h = 10;
                    objM9600g = m9644b(list3, ec8Var3, reviewSessionStateHolder$loadSession$1);
                    if (objM9600g != coroutineSingletons) {
                        c2764d4 = this;
                        list4 = (List) objM9600g;
                        c2764d4.f32756o = list4;
                        if (this.f32756o.isEmpty()) {
                            return ed8.f37069a;
                        }
                        return null;
                    }
                }
                return coroutineSingletons;
            case 9:
                c2764d4 = reviewSessionStateHolder$loadSession$1.f32684c;
                Set set10 = reviewSessionStateHolder$loadSession$1.f32683b;
                AbstractC3193b.m15359b(objM9600g);
                list4 = (List) objM9600g;
                c2764d4.f32756o = list4;
                if (this.f32756o.isEmpty()) {
                    return ed8.f37069a;
                }
                return null;
            case 10:
                c2764d4 = reviewSessionStateHolder$loadSession$1.f32684c;
                Set set11 = reviewSessionStateHolder$loadSession$1.f32683b;
                AbstractC3193b.m15359b(objM9600g);
                list4 = (List) objM9600g;
                c2764d4.f32756o = list4;
                if (this.f32756o.isEmpty()) {
                    return ed8.f37069a;
                }
                return null;
            default:
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0069  */
    /* JADX WARN: Code duplicated, block: B:26:0x0084 A[LOOP:0: B:25:0x0082->B:26:0x0084, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:36:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:40:0x00e9 A[LOOP:2: B:38:0x00e3->B:40:0x00e9, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:43:0x00cb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:0x00a4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: j */
    public final Serializable m9651j(List list, boolean z, ec8 ec8Var, ContinuationImpl continuationImpl) throws Throwable {
        ReviewSessionStateHolder$readySessionCards$1 reviewSessionStateHolder$readySessionCards$1;
        int size;
        ArrayList arrayList;
        int size2;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        Iterator it;
        int iIntValue;
        if (continuationImpl instanceof ReviewSessionStateHolder$readySessionCards$1) {
            reviewSessionStateHolder$readySessionCards$1 = (ReviewSessionStateHolder$readySessionCards$1) continuationImpl;
            int i = reviewSessionStateHolder$readySessionCards$1.f32694e;
            if ((i & Integer.MIN_VALUE) != 0) {
                reviewSessionStateHolder$readySessionCards$1.f32694e = i - Integer.MIN_VALUE;
            } else {
                reviewSessionStateHolder$readySessionCards$1 = new ReviewSessionStateHolder$readySessionCards$1(this, continuationImpl);
            }
        } else {
            reviewSessionStateHolder$readySessionCards$1 = new ReviewSessionStateHolder$readySessionCards$1(this, continuationImpl);
        }
        Object objM15541t = reviewSessionStateHolder$readySessionCards$1.f32692c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = reviewSessionStateHolder$readySessionCards$1.f32694e;
        if (i2 == 0) {
            AbstractC3193b.m15359b(objM15541t);
            if (ec8Var.f37003a == ReviewType.Page) {
                size = list.size();
            } else {
                reviewSessionStateHolder$readySessionCards$1.f32690a = list;
                reviewSessionStateHolder$readySessionCards$1.f32691b = z;
                reviewSessionStateHolder$readySessionCards$1.f32694e = 1;
                objM15541t = AbstractC3224d.m15541t(((C1370c) ((ig8) this.f32743b.f32467a)).f18501M, reviewSessionStateHolder$readySessionCards$1);
                if (objM15541t == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            if (size > list.size()) {
                size = list.size();
            }
            i84 i84VarM23601G = vz1.m23601G(list);
            Random$Default random$Default = jq7.f46010a;
            List listM22625q1 = u91.m22625q1(i84VarM23601G);
            arrayList = (ArrayList) listM22625q1;
            for (size2 = arrayList.size() - 1; size2 > 0; size2--) {
                int iM14247e = jq7.f46011b.m14247e(size2 + 1);
                arrayList.set(iM14247e, arrayList.set(size2, arrayList.get(iM14247e)));
            }
            arrayList2 = new ArrayList(listM22625q1);
            arrayList3 = new ArrayList();
            while (arrayList3.size() < size && !arrayList2.isEmpty()) {
                iIntValue = ((Number) arrayList2.remove(0)).intValue();
                if (!((v0b) list.get(iIntValue)).f64675e.isEmpty()) {
                    AbstractC3393o1.m17749x(iIntValue, arrayList3);
                }
            }
            if (z) {
                Collections.shuffle(arrayList3);
            }
            arrayList4 = new ArrayList(v91.m23189q0(arrayList3, 10));
            it = arrayList3.iterator();
            while (it.hasNext()) {
                arrayList4.add((v0b) list.get(((Number) it.next()).intValue()));
            }
            return arrayList4;
        }
        if (i2 != 1) {
            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        z = reviewSessionStateHolder$readySessionCards$1.f32691b;
        list = reviewSessionStateHolder$readySessionCards$1.f32690a;
        AbstractC3193b.m15359b(objM15541t);
        size = ((Number) objM15541t).intValue();
        if (size > list.size()) {
            size = list.size();
        }
        i84 i84VarM23601G2 = vz1.m23601G(list);
        Random$Default random$Default2 = jq7.f46010a;
        List listM22625q2 = u91.m22625q1(i84VarM23601G2);
        arrayList = (ArrayList) listM22625q2;
        while (size2 > 0) {
            int iM14247e2 = jq7.f46011b.m14247e(size2 + 1);
            arrayList.set(iM14247e2, arrayList.set(size2, arrayList.get(iM14247e2)));
        }
        arrayList2 = new ArrayList(listM22625q2);
        arrayList3 = new ArrayList();
        while (arrayList3.size() < size) {
            iIntValue = ((Number) arrayList2.remove(0)).intValue();
            if (!((v0b) list.get(iIntValue)).f64675e.isEmpty()) {
                AbstractC3393o1.m17749x(iIntValue, arrayList3);
            }
        }
        if (z) {
            Collections.shuffle(arrayList3);
        }
        arrayList4 = new ArrayList(v91.m23189q0(arrayList3, 10));
        it = arrayList3.iterator();
        while (it.hasNext()) {
            arrayList4.add((v0b) list.get(((Number) it.next()).intValue()));
        }
        return arrayList4;
    }

    /* JADX INFO: renamed from: k */
    public final void m9652k(String str) {
        str.getClass();
        Locale localeForLanguageTag = Locale.forLanguageTag(this.f32742a.mo4589b2());
        localeForLanguageTag.getClass();
        String strM23610P = vz1.m23610P(str, localeForLanguageTag);
        LinkedHashMap linkedHashMap = this.f32760s;
        Integer num = (Integer) linkedHashMap.get(strM23610P);
        linkedHashMap.put(strM23610P, Integer.valueOf((num != null ? num.intValue() : 0) + 1));
    }

    /* JADX WARN: Code duplicated, block: B:38:0x013d  */
    /* JADX WARN: Code duplicated, block: B:40:0x014c  */
    /* JADX WARN: Code duplicated, block: B:43:0x016f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0114 -> B:34:0x011c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x019f -> B:49:0x01a9). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: l */
    public final java.lang.Object m9653l(java.util.Set r18, boolean r19, p000.ec8 r20, kotlin.coroutines.jvm.internal.ContinuationImpl r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 456
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lingq.feature.review.state.C2764d.m9653l(java.util.Set, boolean, ec8, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: m0 */
    public final boolean mo4592m0() {
        return this.f32742a.mo4592m0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: p0 */
    public final boolean mo4593p0() {
        return this.f32742a.mo4593p0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: r1 */
    public final eh9 mo4594r1() {
        return this.f32742a.mo4594r1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: s1 */
    public final boolean mo4595s1() {
        return this.f32742a.mo4595s1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: t */
    public final c83 mo4596t() {
        return this.f32742a.mo4596t();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: w0 */
    public final Object mo4597w0(Continuation continuation) {
        return this.f32742a.mo4597w0(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: w2 */
    public final boolean mo4598w2() {
        return this.f32742a.mo4598w2();
    }
}
