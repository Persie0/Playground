package com.lingq.feature.reader.stats;

import com.lingq.core.domain.library.C1390e;
import com.lingq.core.domain.model.library.LibraryShelf;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C3244l;
import p000.C3386nv;
import p000.c32;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.stats.LessonCompleteViewModel$1", m4291f = "LessonCompleteViewModel.kt", m4292l = {495}, m4293m = "invokeSuspend", m4294v = 2)
final class LessonCompleteViewModel$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f30533a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2535j f30534b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonCompleteViewModel$1(C2535j c2535j, Continuation continuation) {
        super(2, continuation);
        this.f30534b = c2535j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LessonCompleteViewModel$1(this.f30534b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((LessonCompleteViewModel$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object value;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f30533a;
        C2535j c2535j = this.f30534b;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C1390e c1390e = c2535j.f30852s;
            String strMo4589b2 = c2535j.f30818b.mo4589b2();
            this.f30533a = 1;
            obj = c1390e.m8009a(strMo4589b2, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        LibraryShelf libraryShelf = (LibraryShelf) obj;
        C3244l c3244l = c2535j.f30809S;
        do {
            value = c3244l.getValue();
        } while (!c3244l.m15570h(value, libraryShelf));
        return xfa.f68157a;
    }
}
