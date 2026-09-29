package com.lingq.feature.reader.old;

import com.lingq.core.datastore.C1369b;
import com.lingq.core.domain.model.lesson.Lesson;
import com.lingq.core.domain.model.user.Profile;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3244l;
import p000.C3386nv;
import p000.c32;
import p000.qm7;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.old.ReaderViewModel$showBuyPremiumLesson$1", m4291f = "ReaderViewModel.kt", m4292l = {2540}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderViewModel$showBuyPremiumLesson$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f29056a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2412n f29057b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f29058c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderViewModel$showBuyPremiumLesson$1(C2412n c2412n, int i, Continuation continuation) {
        super(2, continuation);
        this.f29057b = c2412n;
        this.f29058c = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReaderViewModel$showBuyPremiumLesson$1(this.f29057b, this.f29058c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReaderViewModel$showBuyPremiumLesson$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f29056a;
        C2412n c2412n = this.f29057b;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            qm7 qm7Var = ((C1369b) c2412n.f29274F).f18480m;
            this.f29056a = 1;
            obj = AbstractC3224d.m15541t(qm7Var, this);
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
        int i2 = ((Profile) obj).f19671t;
        Lesson lesson = (Lesson) ((C3244l) c2412n.f29385m0.f9311a).getValue();
        c2412n.mo9320G1(c2412n.f29340b.mo4589b2(), lesson != null ? lesson.f19131A : 0, c2412n.f29340b.mo4580K1(), i2, this.f29058c);
        return xfa.f68157a;
    }
}
