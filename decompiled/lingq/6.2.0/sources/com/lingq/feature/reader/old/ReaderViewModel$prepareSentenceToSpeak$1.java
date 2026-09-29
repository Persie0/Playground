package com.lingq.feature.reader.old;

import androidx.room.util.AbstractC0758a;
import com.lingq.core.data.repository.C1295k;
import com.lingq.core.database.dao.AbstractC1320h;
import com.lingq.core.domain.model.lesson.Lesson;
import com.lingq.core.domain.model.lesson.LessonTranslationSentence;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C3244l;
import p000.C3386nv;
import p000.c32;
import p000.d65;
import p000.j05;
import p000.kbb;
import p000.q05;
import p000.u91;
import p000.un1;
import p000.vk9;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.old.ReaderViewModel$prepareSentenceToSpeak$1", m4291f = "ReaderViewModel.kt", m4292l = {1947, 1973, 1976}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderViewModel$prepareSentenceToSpeak$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f29015a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2412n f29016b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f29017c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ float f29018d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderViewModel$prepareSentenceToSpeak$1(C2412n c2412n, int i, float f, Continuation continuation) {
        super(2, continuation);
        this.f29016b = c2412n;
        this.f29017c = i;
        this.f29018d = f;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReaderViewModel$prepareSentenceToSpeak$1(this.f29016b, this.f29017c, this.f29018d, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReaderViewModel$prepareSentenceToSpeak$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code duplicated, block: B:64:0x0111 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM2861d;
        Double d;
        C2412n c2412n = this.f29016b;
        C3244l c3244l = c2412n.f29381l0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f29015a;
        xfa xfaVar = xfa.f68157a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            d65 d65Var = c2412n.f29394p;
            int iM9332l3 = c2412n.m9332l3();
            Lesson lesson = (Lesson) c3244l.getValue();
            String str = lesson != null ? lesson.f19147f : null;
            if (str != null) {
                vk9.m23391n0(str);
            }
            this.f29015a = 1;
            AbstractC1320h abstractC1320h = ((C1295k) d65Var).f16498b;
            int i2 = this.f29017c;
            q05 q05Var = (q05) abstractC1320h;
            objM2861d = AbstractC0758a.m2861d(new j05(iM9332l3, i2 + 1, i2 + 2, q05Var, 0), q05Var.f57071K, this, true, false);
            if (objM2861d != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i != 1) {
            if (i == 2) {
                AbstractC3193b.m15359b(obj);
                return xfaVar;
            }
            if (i == 3) {
                AbstractC3193b.m15359b(obj);
                return xfaVar;
            }
            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC3193b.m15359b(obj);
        objM2861d = obj;
        List list = (List) objM2861d;
        List list2 = list;
        if (list2 != null && !list2.isEmpty()) {
            Double d2 = ((LessonTranslationSentence) u91.m22589G0(list)).f19294c;
            Double d3 = ((LessonTranslationSentence) u91.m22589G0(list)).f19295d;
            if (d3 != null) {
                d = d3;
            } else if (list.size() > 1) {
                d3 = ((LessonTranslationSentence) list.get(1)).f19294c;
                d = d3;
            } else {
                d = null;
            }
            float f = this.f29018d;
            if (d2 == null || d == null || ((int) d.doubleValue()) == 0) {
                this.f29015a = 3;
                C2412n.m9317Z2(c2412n, f);
                if (xfaVar == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                Lesson lesson2 = (Lesson) c3244l.getValue();
                String str2 = lesson2 != null ? lesson2.f19147f : null;
                if (str2 != null && !vk9.m23391n0(str2)) {
                    c2412n.f29286J.mo8483U0(c2412n.m9332l3(), d2.doubleValue(), d, this.f29018d, ((LessonTranslationSentence) u91.m22589G0(list)).f19296e);
                    return xfaVar;
                }
                Lesson lesson3 = (Lesson) c3244l.getValue();
                String str3 = lesson3 != null ? lesson3.f19162u : null;
                if (str3 != null && !vk9.m23391n0(str3)) {
                    double dDoubleValue = d2.doubleValue();
                    double dDoubleValue2 = d.doubleValue();
                    c2412n.m9342v3(true);
                    c2412n.f29398q0.mo4677k(new kbb(dDoubleValue, dDoubleValue2));
                    return xfaVar;
                }
                this.f29015a = 2;
                C2412n.m9317Z2(c2412n, f);
                if (xfaVar == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        }
        return xfaVar;
    }
}
