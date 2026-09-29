package com.lingq.feature.reader.reader;

import com.lingq.core.p012ui.UpgradeReason;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C3244l;
import p000.c32;
import p000.jy7;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.reader.ReaderComposeViewModel$observePlayerUpgradePopup$2", m4291f = "ReaderComposeViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderComposeViewModel$observePlayerUpgradePopup$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ boolean f30038a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2493a f30039b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderComposeViewModel$observePlayerUpgradePopup$2(C2493a c2493a, Continuation continuation) {
        super(2, continuation);
        this.f30039b = c2493a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ReaderComposeViewModel$observePlayerUpgradePopup$2 readerComposeViewModel$observePlayerUpgradePopup$2 = new ReaderComposeViewModel$observePlayerUpgradePopup$2(this.f30039b, continuation);
        readerComposeViewModel$observePlayerUpgradePopup$2.f30038a = ((Boolean) obj).booleanValue();
        return readerComposeViewModel$observePlayerUpgradePopup$2;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        ReaderComposeViewModel$observePlayerUpgradePopup$2 readerComposeViewModel$observePlayerUpgradePopup$2 = (ReaderComposeViewModel$observePlayerUpgradePopup$2) create(bool, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        readerComposeViewModel$observePlayerUpgradePopup$2.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object value;
        boolean z = this.f30038a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        if (z) {
            UpgradeReason upgradeReason = UpgradeReason.GENERATE_TTS;
            C2493a c2493a = this.f30039b;
            c2493a.mo3737M1(upgradeReason);
            C3244l c3244l = c2493a.f30218h.f29782p;
            do {
                value = c3244l.getValue();
            } while (!c3244l.m15570h(value, jy7.m14750a((jy7) value, false, false, 0L, 0L, 0.0f, null, false, false, false, false, false, null, false, false, null, null, 57343)));
        }
        return xfa.f68157a;
    }
}
