package com.lingq.feature.reader.milestones;

import com.lingq.feature.reader.milestones.domain.C2271c;
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
@c32(m4290c = "com.lingq.feature.reader.milestones.ReaderMilestonesManager$updateStreakChallenge$1", m4291f = "ReaderMilestonesManager.kt", m4292l = {68}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderMilestonesManager$updateStreakChallenge$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f28162a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2268b f28163b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f28164c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderMilestonesManager$updateStreakChallenge$1(C2268b c2268b, int i, Continuation continuation) {
        super(2, continuation);
        this.f28163b = c2268b;
        this.f28164c = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReaderMilestonesManager$updateStreakChallenge$1(this.f28163b, this.f28164c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReaderMilestonesManager$updateStreakChallenge$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f28162a;
        C2268b c2268b = this.f28163b;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C2271c c2271c = c2268b.f28170c;
            this.f28162a = 1;
            if (c2271c.m9282a(this.f28164c, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        C3244l c3244l = c2268b.f28174g;
        Boolean bool = Boolean.FALSE;
        c3244l.getClass();
        c3244l.m15572j(null, bool);
        return xfa.f68157a;
    }
}
