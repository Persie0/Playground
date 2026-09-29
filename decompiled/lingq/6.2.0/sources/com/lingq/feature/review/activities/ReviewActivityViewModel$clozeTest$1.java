package com.lingq.feature.review.activities;

import androidx.room.util.AbstractC0758a;
import com.lingq.core.data.repository.C1287c;
import com.lingq.core.data.repository.C1308x;
import com.lingq.core.domain.model.lesson.LessonCard;
import com.lingq.core.domain.model.lesson.LessonSentence;
import java.util.ArrayList;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.text.Regex;
import kotlinx.coroutines.flow.C3244l;
import p000.C3386nv;
import p000.ao0;
import p000.c32;
import p000.ek2;
import p000.fa4;
import p000.i41;
import p000.ke2;
import p000.pk9;
import p000.q05;
import p000.sc8;
import p000.u0b;
import p000.um5;
import p000.ux5;
import p000.v91;
import p000.vi3;
import p000.x24;
import p000.xfa;
import p000.xm5;
import p000.ym5;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.review.activities.ReviewActivityViewModel$clozeTest$1", m4291f = "ReviewActivityViewModel.kt", m4292l = {197, 208, 210}, m4293m = "invokeSuspend", m4294v = 2)
final class ReviewActivityViewModel$clozeTest$1 extends SuspendLambda implements vi3 {

    /* JADX INFO: renamed from: a */
    public sc8 f32282a;

    /* JADX INFO: renamed from: b */
    public String f32283b;

    /* JADX INFO: renamed from: c */
    public int f32284c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C2750e f32285d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewActivityViewModel$clozeTest$1(C2750e c2750e, Continuation continuation) {
        super(1, continuation);
        this.f32285d = c2750e;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new ReviewActivityViewModel$clozeTest$1(this.f32285d, continuation);
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        return ((ReviewActivityViewModel$clozeTest$1) create((Continuation) obj)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00db  */
    /* JADX WARN: Code duplicated, block: B:48:0x00df  */
    /* JADX WARN: Code duplicated, block: B:52:0x0102 A[LOOP:0: B:50:0x00fc->B:52:0x0102, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:55:0x0122  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object value;
        String str;
        String str2;
        sc8 sc8Var;
        LessonSentence lessonSentence;
        Object value2;
        String str3;
        ArrayList arrayList;
        String str4;
        C2750e c2750e = this.f32285d;
        C3244l c3244l = c2750e.f32381n;
        C3244l c3244l2 = c2750e.f32385r;
        C3244l c3244l3 = c2750e.f32383p;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f32284c;
        String str5 = "";
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            do {
                value = c3244l2.getValue();
                ((Boolean) value).getClass();
            } while (!c3244l2.m15570h(value, Boolean.TRUE));
            u0b u0bVar = c2750e.f32371d;
            String strMo4589b2 = c2750e.f32369b.mo4589b2();
            LessonCard lessonCard = (LessonCard) c3244l.getValue();
            int i2 = lessonCard != null ? lessonCard.f19186i : 0;
            this.f32284c = 1;
            obj = ((C1308x) u0bVar).m7414h(i2, strMo4589b2, this);
            if (obj != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i != 1) {
            if (i == 2) {
                str2 = this.f32283b;
                sc8Var = this.f32282a;
                AbstractC3193b.m15359b(obj);
                lessonSentence = (LessonSentence) obj;
                if (lessonSentence != null) {
                    str3 = "";
                } else {
                    str3 = "";
                }
                List<String> listM15429h = new Regex("\\s+").m15429h(str3);
                arrayList = new ArrayList(v91.m23189q0(listM15429h, 10));
                for (String str6 : listM15429h) {
                    arrayList.add(new i41(ux5.m22990m(str6, " "), fa4.m11650l(str6, str2)));
                }
                sc8Var.getClass();
                sc8Var.f60684b = arrayList;
                if (lessonSentence != null) {
                    str5 = str4;
                }
                sc8Var.f60683a = str5;
                xm5 xm5Var = new xm5(sc8Var);
                c3244l3.getClass();
                c3244l3.m15572j(null, xm5Var);
                do {
                    value2 = c3244l2.getValue();
                    ((Boolean) value2).getClass();
                } while (!c3244l2.m15570h(value2, Boolean.FALSE));
                return xfa.f68157a;
            }
            if (i != 3) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str2 = this.f32283b;
            sc8Var = this.f32282a;
            AbstractC3193b.m15359b(obj);
            lessonSentence = (LessonSentence) obj;
            if (lessonSentence != null || (str3 = lessonSentence.f19255c) == null) {
                str3 = "";
            }
            List<String> listM15429h2 = new Regex("\\s+").m15429h(str3);
            arrayList = new ArrayList(v91.m23189q0(listM15429h2, 10));
            while (r1.hasNext()) {
                arrayList.add(new i41(ux5.m22990m(str6, " "), fa4.m11650l(str6, str2)));
            }
            sc8Var.getClass();
            sc8Var.f60684b = arrayList;
            if (lessonSentence != null && (str4 = lessonSentence.f19255c) != null) {
                str5 = str4;
            }
            sc8Var.f60683a = str5;
            xm5 xm5Var2 = new xm5(sc8Var);
            c3244l3.getClass();
            c3244l3.m15572j(null, xm5Var2);
            do {
                value2 = c3244l2.getValue();
                ((Boolean) value2).getClass();
            } while (!c3244l2.m15570h(value2, Boolean.FALSE));
            return xfa.f68157a;
        }
        AbstractC3193b.m15359b(obj);
        ym5 ym5Var = (ym5) obj;
        ym5Var.getClass();
        if (ym5Var instanceof xm5) {
            sc8 sc8Var2 = (sc8) pk9.m19381x(ym5Var);
            if (sc8Var2 == null) {
                um5 um5Var = new um5(x24.f67675d);
                c3244l3.getClass();
                c3244l3.m15572j(null, um5Var);
            } else {
                if (sc8Var2.f60684b.isEmpty()) {
                    LessonCard lessonCard2 = (LessonCard) c3244l.getValue();
                    if (lessonCard2 == null || (str = lessonCard2.f19178a) == null) {
                        str = "";
                    }
                    int i3 = c2750e.f32379l;
                    ao0 ao0Var = c2750e.f32370c;
                    if (i3 == -1) {
                        this.f32282a = sc8Var2;
                        this.f32283b = str;
                        this.f32284c = 2;
                        q05 q05Var = (q05) ((C1287c) ao0Var).f16455d;
                        Object objM2861d = AbstractC0758a.m2861d(new ke2(25, str, q05Var), q05Var.f57071K, this, true, false);
                        if (objM2861d != coroutineSingletons) {
                            str2 = str;
                            obj = objM2861d;
                            sc8Var = sc8Var2;
                            lessonSentence = (LessonSentence) obj;
                            if (lessonSentence != null) {
                                str3 = "";
                            } else {
                                str3 = "";
                            }
                            List<String> listM15429h3 = new Regex("\\s+").m15429h(str3);
                            arrayList = new ArrayList(v91.m23189q0(listM15429h3, 10));
                            while (r1.hasNext()) {
                                arrayList.add(new i41(ux5.m22990m(str6, " "), fa4.m11650l(str6, str2)));
                            }
                            sc8Var.getClass();
                            sc8Var.f60684b = arrayList;
                            if (lessonSentence != null) {
                                str5 = str4;
                            }
                            sc8Var.f60683a = str5;
                            xm5 xm5Var3 = new xm5(sc8Var);
                            c3244l3.getClass();
                            c3244l3.m15572j(null, xm5Var3);
                        }
                    } else {
                        this.f32282a = sc8Var2;
                        this.f32283b = str;
                        this.f32284c = 3;
                        q05 q05Var2 = (q05) ((C1287c) ao0Var).f16455d;
                        Object objM2861d2 = AbstractC0758a.m2861d(new ek2(i3, str, q05Var2, 3), q05Var2.f57071K, this, true, false);
                        if (objM2861d2 != coroutineSingletons) {
                            str2 = str;
                            obj = objM2861d2;
                            sc8Var = sc8Var2;
                            lessonSentence = (LessonSentence) obj;
                            if (lessonSentence != null) {
                                str3 = "";
                            } else {
                                str3 = "";
                            }
                            List<String> listM15429h4 = new Regex("\\s+").m15429h(str3);
                            arrayList = new ArrayList(v91.m23189q0(listM15429h4, 10));
                            while (r1.hasNext()) {
                                arrayList.add(new i41(ux5.m22990m(str6, " "), fa4.m11650l(str6, str2)));
                            }
                            sc8Var.getClass();
                            sc8Var.f60684b = arrayList;
                            if (lessonSentence != null) {
                                str5 = str4;
                            }
                            sc8Var.f60683a = str5;
                            xm5 xm5Var4 = new xm5(sc8Var);
                            c3244l3.getClass();
                            c3244l3.m15572j(null, xm5Var4);
                        }
                    }
                    return coroutineSingletons;
                }
                c3244l3.getClass();
                c3244l3.m15572j(null, ym5Var);
            }
            do {
                value2 = c3244l2.getValue();
                ((Boolean) value2).getClass();
            } while (!c3244l2.m15570h(value2, Boolean.FALSE));
        }
        return xfa.f68157a;
    }
}
