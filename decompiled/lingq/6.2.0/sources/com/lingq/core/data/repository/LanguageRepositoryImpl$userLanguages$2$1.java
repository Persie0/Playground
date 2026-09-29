package com.lingq.core.data.repository;

import com.lingq.core.database.entity.LanguageContextEntity;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.ul4;
import p000.v91;
import p000.vi3;
import p000.xfa;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.lingq.core.data.repository.LanguageRepositoryImpl$userLanguages$2$1", m4291f = "LanguageRepositoryImpl.kt", m4292l = {70, 71}, m4293m = "invokeSuspend", m4294v = 2)
final class LanguageRepositoryImpl$userLanguages$2$1 extends SuspendLambda implements vi3 {

    /* JADX INFO: renamed from: a */
    public int f15268a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1293i f15269b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ArrayList f15270c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LanguageRepositoryImpl$userLanguages$2$1(C1293i c1293i, ArrayList arrayList, Continuation continuation) {
        super(1, continuation);
        this.f15269b = c1293i;
        this.f15270c = arrayList;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new LanguageRepositoryImpl$userLanguages$2$1(this.f15269b, this.f15270c, continuation);
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        return ((LanguageRepositoryImpl$userLanguages$2$1) create((Continuation) obj)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0054, code lost:
    
        if (r0.m22790y0(r7, r6) == r1) goto L19;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        ul4 ul4Var = this.f15269b.f16489b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f15268a;
        ArrayList arrayList = this.f15270c;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            this.f15268a = 1;
            if (ul4Var.mo4096w0(arrayList, this) != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i == 1) {
            AbstractC3193b.m15359b(obj);
        } else {
            if (i != 2) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        return xfa.f68157a;
        ArrayList arrayList2 = new ArrayList(v91.m23189q0(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((LanguageContextEntity) it.next()).f17149a);
        }
        this.f15268a = 2;
    }
}
