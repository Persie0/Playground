package com.lingq.feature.lessoninfo;

import com.lingq.core.domain.model.library.LessonInfo;
import com.lingq.core.domain.user.C1539a;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C3244l;
import p000.C3386nv;
import p000.c32;
import p000.cma;
import p000.f35;
import p000.gm6;
import p000.lk0;
import p000.un1;
import p000.wkd;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.lessoninfo.LessonInfoViewModel$showBuyPremiumDialog$1", m4291f = "LessonInfoViewModel.kt", m4292l = {480}, m4293m = "invokeSuspend", m4294v = 2)
final class LessonInfoViewModel$showBuyPremiumDialog$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f26389a;

    /* JADX INFO: renamed from: b */
    public int f26390b;

    /* JADX INFO: renamed from: c */
    public int f26391c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C2132c f26392d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonInfoViewModel$showBuyPremiumDialog$1(C2132c c2132c, Continuation continuation) {
        super(2, continuation);
        this.f26392d = c2132c;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LessonInfoViewModel$showBuyPremiumDialog$1(this.f26392d, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((LessonInfoViewModel$showBuyPremiumDialog$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i;
        int i2;
        Object value;
        Object value2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = this.f26391c;
        C2132c c2132c = this.f26392d;
        if (i3 == 0) {
            AbstractC3193b.m15359b(obj);
            LessonInfo lessonInfo = (LessonInfo) c2132c.f26430u.getValue();
            int i4 = lessonInfo != null ? lessonInfo.f19358N : 0;
            LessonInfo lessonInfo2 = (LessonInfo) c2132c.f26430u.getValue();
            int i5 = lessonInfo2 != null ? lessonInfo2.f19365a : 0;
            C1539a c1539a = c2132c.f26425p;
            this.f26389a = i4;
            this.f26390b = i5;
            this.f26391c = 1;
            Object objM8225a = c1539a.m8225a(this);
            if (objM8225a == coroutineSingletons) {
                return coroutineSingletons;
            }
            int i6 = i4;
            obj = objM8225a;
            i = i6;
            i2 = i5;
        } else {
            if (i3 != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i2 = this.f26390b;
            i = this.f26389a;
            AbstractC3193b.m15359b(obj);
        }
        int iIntValue = ((Number) obj).intValue();
        wkd wkdVar = c2132c.f26426q;
        cma cmaVar = c2132c.f26411b;
        String strMo4580K1 = cmaVar.mo4580K1();
        String strMo4589b2 = cmaVar.mo4589b2();
        wkdVar.getClass();
        String strM24040b = wkd.m24040b(strMo4580K1, strMo4589b2);
        C3244l c3244l = c2132c.f26408B;
        if (iIntValue < i) {
            do {
                value2 = c3244l.getValue();
            } while (!c3244l.m15570h(value2, f35.m11518a((f35) value2, null, new gm6(i, iIntValue, strM24040b, true), null, 5)));
        } else {
            do {
                value = c3244l.getValue();
            } while (!c3244l.m15570h(value, f35.m11518a((f35) value, new lk0(i, iIntValue, i2, true), null, null, 6)));
        }
        return xfa.f68157a;
    }
}
