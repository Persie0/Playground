package com.lingq.p020ui;

import com.lingq.core.domain.vocabulary.GetSampleLingqsUseCase$invoke$$inlined$flatMapLatest$1;
import com.lingq.core.p012ui.UpgradeReason;
import kotlin.AbstractC3193b;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3386nv;
import p000.C3540rl;
import p000.aj3;
import p000.c32;
import p000.c83;
import p000.e83;
import p000.i83;
import p000.rha;
import p000.sha;
import p000.wm3;
import p000.xfa;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.lingq.ui.MainViewModel$special$$inlined$flatMapLatest$1", m4291f = "MainViewModel.kt", m4292l = {189}, m4293m = "invokeSuspend", m4294v = 2)
public final class MainViewModel$special$$inlined$flatMapLatest$1 extends SuspendLambda implements aj3 {

    /* JADX INFO: renamed from: a */
    public int f34151a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ e83 f34152b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f34153c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C2889e f34154d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainViewModel$special$$inlined$flatMapLatest$1(C2889e c2889e, Continuation continuation) {
        super(3, continuation);
        this.f34154d = c2889e;
    }

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        MainViewModel$special$$inlined$flatMapLatest$1 mainViewModel$special$$inlined$flatMapLatest$1 = new MainViewModel$special$$inlined$flatMapLatest$1(this.f34154d, (Continuation) obj3);
        mainViewModel$special$$inlined$flatMapLatest$1.f34152b = (e83) obj;
        mainViewModel$special$$inlined$flatMapLatest$1.f34153c = obj2;
        return mainViewModel$special$$inlined$flatMapLatest$1.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        c83 i83Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f34151a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            e83 e83Var = this.f34152b;
            sha shaVar = (sha) this.f34153c;
            if ((shaVar instanceof rha) && ((rha) shaVar).f59324a == UpgradeReason.LIMIT_WORDS) {
                wm3 wm3Var = this.f34154d.f34216r;
                i83Var = AbstractC3224d.m15521C(new C3540rl(wm3Var.f67052b.mo4572B0(), 5), new GetSampleLingqsUseCase$invoke$$inlined$flatMapLatest$1(null, wm3Var));
            } else {
                i83Var = new i83(EmptyList.f47638a, 1);
            }
            this.f34152b = null;
            this.f34153c = null;
            this.f34151a = 1;
            if (AbstractC3224d.m15537p(e83Var, i83Var, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        return xfa.f68157a;
    }
}
