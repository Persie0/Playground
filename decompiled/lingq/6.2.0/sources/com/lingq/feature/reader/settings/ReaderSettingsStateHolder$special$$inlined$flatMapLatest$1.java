package com.lingq.feature.reader.settings;

import com.lingq.core.settings.theme.C1882b;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3386nv;
import p000.aj3;
import p000.c32;
import p000.e83;
import p000.n83;
import p000.xfa;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.settings.ReaderSettingsStateHolder$special$$inlined$flatMapLatest$1", m4291f = "ReaderSettingsStateHolder.kt", m4292l = {189}, m4293m = "invokeSuspend", m4294v = 2)
public final class ReaderSettingsStateHolder$special$$inlined$flatMapLatest$1 extends SuspendLambda implements aj3 {

    /* JADX INFO: renamed from: a */
    public int f30373a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ e83 f30374b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f30375c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C2507a f30376d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderSettingsStateHolder$special$$inlined$flatMapLatest$1(C2507a c2507a, Continuation continuation) {
        super(3, continuation);
        this.f30376d = c2507a;
    }

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ReaderSettingsStateHolder$special$$inlined$flatMapLatest$1 readerSettingsStateHolder$special$$inlined$flatMapLatest$1 = new ReaderSettingsStateHolder$special$$inlined$flatMapLatest$1(this.f30376d, (Continuation) obj3);
        readerSettingsStateHolder$special$$inlined$flatMapLatest$1.f30374b = (e83) obj;
        readerSettingsStateHolder$special$$inlined$flatMapLatest$1.f30375c = obj2;
        return readerSettingsStateHolder$special$$inlined$flatMapLatest$1.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        e83 e83Var = this.f30374b;
        Object obj2 = this.f30375c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f30373a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            String str = (String) obj2;
            C1882b c1882b = this.f30376d.f30377a;
            str.getClass();
            n83 n83VarM8683a = c1882b.m8683a(str, false);
            this.f30374b = null;
            this.f30375c = null;
            this.f30373a = 1;
            if (AbstractC3224d.m15537p(e83Var, n83VarM8683a, this) == coroutineSingletons) {
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
