package com.lingq.feature.reader.old;

import com.lingq.core.data.repository.C1287c;
import com.lingq.core.domain.model.lesson.LessonCard;
import com.lingq.core.domain.model.status.CardStatus;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.ao0;
import p000.c32;
import p000.cma;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.old.ReaderPageViewModel$onCardUpdateStatus$1", m4291f = "ReaderPageViewModel.kt", m4292l = {1458, 1461, 1463}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderPageViewModel$onCardUpdateStatus$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f28668a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2411m f28669b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f28670c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f28671d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderPageViewModel$onCardUpdateStatus$1(int i, C2411m c2411m, String str, Continuation continuation) {
        super(2, continuation);
        this.f28669b = c2411m;
        this.f28670c = str;
        this.f28671d = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReaderPageViewModel$onCardUpdateStatus$1(this.f28671d, this.f28669b, this.f28670c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReaderPageViewModel$onCardUpdateStatus$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0056, code lost:
    
        if (((com.lingq.core.data.repository.C1287c) r1).m7113b(r7, r0, r11, r10) == r3) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0073, code lost:
    
        if (((com.lingq.core.data.repository.C1287c) r1).m7133w(r2, r6, r10.f28671d, r8, r10) == r3) goto L24;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        C2411m c2411m = this.f28669b;
        ao0 ao0Var = c2411m.f29229e;
        cma cmaVar = c2411m.f29223b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f28668a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            String strMo4589b2 = cmaVar.mo4589b2();
            this.f28668a = 1;
            obj = ((C1287c) ao0Var).m7116f(strMo4589b2, this.f28670c, this);
            if (obj != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i == 1) {
            AbstractC3193b.m15359b(obj);
        } else {
            if (i != 2 && i != 3) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        return xfa.f68157a;
        LessonCard lessonCard = (LessonCard) obj;
        if (lessonCard != null) {
            int value = CardStatus.Ignored.getValue();
            int i2 = this.f28671d;
            if (i2 == value) {
                String strMo4589b3 = cmaVar.mo4589b2();
                String str = lessonCard.f19178a;
                this.f28668a = 2;
            } else {
                String strMo4589b4 = cmaVar.mo4589b2();
                String str2 = lessonCard.f19178a;
                Integer num = new Integer(c2411m.f29248p);
                this.f28668a = 3;
            }
        }
        return xfa.f68157a;
    }
}
