package com.lingq.feature.playlist;

import com.lingq.core.data.repository.C1296l;
import java.util.ArrayList;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.un1;
import p000.xfa;
import p000.y95;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.playlist.CollectionPlaylistViewModel$fetchLessonCounters$1", m4291f = "CollectionPlaylistViewModel.kt", m4292l = {238}, m4293m = "invokeSuspend", m4294v = 2)
final class CollectionPlaylistViewModel$fetchLessonCounters$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f27550a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2251a f27551b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ArrayList f27552c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CollectionPlaylistViewModel$fetchLessonCounters$1(C2251a c2251a, ArrayList arrayList, Continuation continuation) {
        super(2, continuation);
        this.f27551b = c2251a;
        this.f27552c = arrayList;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CollectionPlaylistViewModel$fetchLessonCounters$1(this.f27551b, this.f27552c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((CollectionPlaylistViewModel$fetchLessonCounters$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f27550a;
        try {
            if (i == 0) {
                AbstractC3193b.m15359b(obj);
                C2251a c2251a = this.f27551b;
                y95 y95Var = c2251a.f27779h;
                String strMo4589b2 = c2251a.f27773b.mo4589b2();
                ArrayList arrayList = this.f27552c;
                this.f27550a = 1;
                if (((C1296l) y95Var).m7311f(strMo4589b2, arrayList, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj);
            }
        } catch (Exception unused) {
        }
        return xfa.f68157a;
    }
}
