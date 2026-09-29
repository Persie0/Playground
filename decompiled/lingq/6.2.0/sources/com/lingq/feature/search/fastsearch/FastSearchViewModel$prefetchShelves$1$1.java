package com.lingq.feature.search.fastsearch;

import com.lingq.core.data.repository.C1296l;
import com.lingq.core.domain.model.library.LibraryShelf;
import kotlin.AbstractC3193b;
import kotlin.Pair;
import kotlin.collections.AbstractC3194a;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C3244l;
import p000.C3386nv;
import p000.c32;
import p000.r23;
import p000.un1;
import p000.vz2;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.search.fastsearch.FastSearchViewModel$prefetchShelves$1$1", m4291f = "FastSearchViewModel.kt", m4292l = {274}, m4293m = "invokeSuspend", m4294v = 2)
final class FastSearchViewModel$prefetchShelves$1$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f32865a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2768b f32866b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f32867c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FastSearchViewModel$prefetchShelves$1$1(C2768b c2768b, String str, Continuation continuation) {
        super(2, continuation);
        this.f32866b = c2768b;
        this.f32867c = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new FastSearchViewModel$prefetchShelves$1$1(this.f32866b, this.f32867c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((FastSearchViewModel$prefetchShelves$1$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object value;
        vz2 vz2Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f32865a;
        String str = this.f32867c;
        C2768b c2768b = this.f32866b;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            r23 r23Var = c2768b.f32887k;
            String strMo4589b2 = c2768b.f32878b.mo4589b2();
            this.f32865a = 1;
            obj = ((C1296l) r23Var.f58517a).f16514d.m7507E0(strMo4589b2, str, this);
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
        LibraryShelf libraryShelf = (LibraryShelf) obj;
        if (libraryShelf != null) {
            C3244l c3244l = c2768b.f32892p;
            do {
                value = c3244l.getValue();
                vz2Var = (vz2) value;
            } while (!c3244l.m15570h(value, vz2.m23657a(vz2Var, null, false, false, null, null, null, null, AbstractC3194a.m15368U(vz2Var.f66125h, new Pair(str, libraryShelf)), null, 383)));
        }
        return xfa.f68157a;
    }
}
