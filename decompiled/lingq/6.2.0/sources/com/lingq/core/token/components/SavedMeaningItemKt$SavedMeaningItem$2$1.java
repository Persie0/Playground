package com.lingq.core.token.components;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.c32;
import p000.eh0;
import p000.t66;
import p000.ui3;
import p000.un1;
import p000.vv9;
import p000.xfa;
import p000.z93;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.token.components.SavedMeaningItemKt$SavedMeaningItem$2$1", m4291f = "SavedMeaningItem.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class SavedMeaningItemKt$SavedMeaningItem$2$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ boolean f23729a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ z93 f23730b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ui3 f23731c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ t66 f23732d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SavedMeaningItemKt$SavedMeaningItem$2$1(boolean z, z93 z93Var, ui3 ui3Var, t66 t66Var, Continuation continuation) {
        super(2, continuation);
        this.f23729a = z;
        this.f23730b = z93Var;
        this.f23731c = ui3Var;
        this.f23732d = t66Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SavedMeaningItemKt$SavedMeaningItem$2$1(this.f23729a, this.f23730b, this.f23731c, this.f23732d, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        SavedMeaningItemKt$SavedMeaningItem$2$1 savedMeaningItemKt$SavedMeaningItem$2$1 = (SavedMeaningItemKt$SavedMeaningItem$2$1) create((un1) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        savedMeaningItemKt$SavedMeaningItem$2$1.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        if (this.f23729a) {
            z93.m25512a(this.f23730b);
            t66 t66Var = this.f23732d;
            String str = ((vv9) t66Var.getValue()).f65990a.f54604b;
            vv9 vv9Var = (vv9) t66Var.getValue();
            int length = str.length();
            t66Var.setValue(vv9.m23560a(vv9Var, null, eh0.m11127g(length, length), 5));
            this.f23731c.mo0a();
        }
        return xfa.f68157a;
    }
}
