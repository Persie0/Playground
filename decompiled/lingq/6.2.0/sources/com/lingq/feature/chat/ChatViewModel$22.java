package com.lingq.feature.chat;

import com.lingq.core.premium.UpgradeUserType;
import com.lingq.core.premium.delegate.UpgradeTier;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.c32;
import p000.vz0;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.chat.ChatViewModel$22", m4291f = "ChatViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class ChatViewModel$22 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f24869a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2009m f24870b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatViewModel$22(C2009m c2009m, Continuation continuation) {
        super(2, continuation);
        this.f24870b = c2009m;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ChatViewModel$22 chatViewModel$22 = new ChatViewModel$22(this.f24870b, continuation);
        chatViewModel$22.f24869a = obj;
        return chatViewModel$22;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ChatViewModel$22) create((UpgradeTier) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        UpgradeTier upgradeTier = (UpgradeTier) this.f24869a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        switch (vz0.f66106a[upgradeTier.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                return UpgradeUserType.Premium;
            case 5:
            case 6:
                return UpgradeUserType.Downgrade;
            default:
                return this.f24870b.mo8550F2(null) ? UpgradeUserType.FreeTrial : UpgradeUserType.Free;
        }
    }
}
