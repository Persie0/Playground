package com.lingq.p020ui;

import com.lingq.core.datastore.C1371d;
import com.lingq.core.domain.model.vocabulary.VocabularySearchQuery;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.AbstractC3193b;
import kotlin.collections.AbstractC3194a;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3386nv;
import p000.c32;
import p000.c83;
import p000.cma;
import p000.un1;
import p000.vma;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.lingq.ui.HomeViewModel$initiateSettings$1", m4291f = "HomeViewModel.kt", m4292l = {195, 196, 198}, m4293m = "invokeSuspend", m4294v = 2)
final class HomeViewModel$initiateSettings$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f33960a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2888d f33961b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeViewModel$initiateSettings$1(C2888d c2888d, Continuation continuation) {
        super(2, continuation);
        this.f33961b = c2888d;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new HomeViewModel$initiateSettings$1(this.f33961b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((HomeViewModel$initiateSettings$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x006d, code lost:
    
        if (((com.lingq.core.datastore.C1371d) r0).m7974n(r8, r7) == r2) goto L22;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        C2888d c2888d = this.f33961b;
        cma cmaVar = c2888d.f34167b;
        vma vmaVar = c2888d.f34177l;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f33960a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            c83 c83Var = ((C1371d) vmaVar).f18580q;
            this.f33960a = 1;
            obj = AbstractC3224d.m15541t(c83Var, this);
            if (obj != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i == 1) {
            AbstractC3193b.m15359b(obj);
        } else if (i == 2) {
            AbstractC3193b.m15359b(obj);
            LinkedHashMap linkedHashMapM15372Y = AbstractC3194a.m15372Y((Map) obj);
            linkedHashMapM15372Y.put(cmaVar.mo4589b2(), new VocabularySearchQuery());
            this.f33960a = 3;
        } else {
            if (i != 3) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        return xfa.f68157a;
        if (((Map) obj).get(cmaVar.mo4589b2()) == null) {
            c83 c83Var2 = ((C1371d) vmaVar).f18580q;
            this.f33960a = 2;
            obj = AbstractC3224d.m15541t(c83Var2, this);
            if (obj != coroutineSingletons) {
                LinkedHashMap linkedHashMapM15372Y2 = AbstractC3194a.m15372Y((Map) obj);
                linkedHashMapM15372Y2.put(cmaVar.mo4589b2(), new VocabularySearchQuery());
                this.f33960a = 3;
            }
            return coroutineSingletons;
        }
        return xfa.f68157a;
    }
}
