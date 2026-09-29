package com.lingq.core.settings.reader;

import kotlin.AbstractC3193b;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3386nv;
import p000.aj3;
import p000.c32;
import p000.e83;
import p000.kk8;
import p000.rz7;
import p000.xfa;

/* JADX INFO: renamed from: com.lingq.core.settings.reader.ReaderSettingsProvider$observeTtsPreferences$$inlined$flatMapLatest$1 */
/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.settings.reader.ReaderSettingsProvider$observeTtsPreferences$$inlined$flatMapLatest$1", m4291f = "ReaderSettingsProvider.kt", m4292l = {189}, m4293m = "invokeSuspend", m4294v = 2)
public final class C1878x1e185a4a extends SuspendLambda implements aj3 {

    /* JADX INFO: renamed from: a */
    public int f23045a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ e83 f23046b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f23047c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C1879a f23048d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1878x1e185a4a(Continuation continuation, C1879a c1879a) {
        super(3, continuation);
        this.f23048d = c1879a;
    }

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        C1878x1e185a4a c1878x1e185a4a = new C1878x1e185a4a((Continuation) obj3, this.f23048d);
        c1878x1e185a4a.f23046b = (e83) obj;
        c1878x1e185a4a.f23047c = obj2;
        return c1878x1e185a4a.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        e83 e83Var = this.f23046b;
        Object obj2 = this.f23047c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f23045a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            Pair pair = (Pair) obj2;
            kk8 kk8Var = new kk8(new ReaderSettingsProvider$observeTtsPreferences$2$1((rz7) pair.f47623a, (String) pair.f47624b, this.f23048d, null));
            this.f23046b = null;
            this.f23047c = null;
            this.f23045a = 1;
            if (AbstractC3224d.m15537p(e83Var, kk8Var, this) == coroutineSingletons) {
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
