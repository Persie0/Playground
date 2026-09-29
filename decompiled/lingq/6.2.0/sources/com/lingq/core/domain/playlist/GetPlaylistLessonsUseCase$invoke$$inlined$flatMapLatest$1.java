package com.lingq.core.domain.playlist;

import com.lingq.core.data.repository.C1302r;
import java.util.LinkedHashSet;
import kotlin.AbstractC3193b;
import kotlin.collections.AbstractC3194a;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3228h;
import p000.AbstractC3352my;
import p000.C3386nv;
import p000.aj3;
import p000.c32;
import p000.e83;
import p000.kj2;
import p000.lj2;
import p000.m58;
import p000.te7;
import p000.wz0;
import p000.xfa;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.domain.playlist.GetPlaylistLessonsUseCase$invoke$$inlined$flatMapLatest$1", m4291f = "GetPlaylistLessonsUseCase.kt", m4292l = {189}, m4293m = "invokeSuspend", m4294v = 2)
public final class GetPlaylistLessonsUseCase$invoke$$inlined$flatMapLatest$1 extends SuspendLambda implements aj3 {

    /* JADX INFO: renamed from: a */
    public int f19916a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ e83 f19917b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f19918c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C1524g f19919d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ String f19920e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetPlaylistLessonsUseCase$invoke$$inlined$flatMapLatest$1(Continuation continuation, C1524g c1524g, String str) {
        super(3, continuation);
        this.f19919d = c1524g;
        this.f19920e = str;
    }

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        GetPlaylistLessonsUseCase$invoke$$inlined$flatMapLatest$1 getPlaylistLessonsUseCase$invoke$$inlined$flatMapLatest$1 = new GetPlaylistLessonsUseCase$invoke$$inlined$flatMapLatest$1((Continuation) obj3, this.f19919d, this.f19920e);
        getPlaylistLessonsUseCase$invoke$$inlined$flatMapLatest$1.f19917b = (e83) obj;
        getPlaylistLessonsUseCase$invoke$$inlined$flatMapLatest$1.f19918c = obj2;
        return getPlaylistLessonsUseCase$invoke$$inlined$flatMapLatest$1.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        e83 e83Var = this.f19917b;
        Object obj2 = this.f19918c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f19916a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            te7 te7Var = (te7) obj2;
            C1524g c1524g = this.f19919d;
            m58 m58Var = c1524g.f19951d;
            LinkedHashSet linkedHashSet = te7Var.f62196b;
            lj2 lj2Var = (lj2) m58Var.f50618b;
            lj2Var.getClass();
            C3228h c3228h = new C3228h(linkedHashSet.isEmpty() ? AbstractC3352my.m17114d(AbstractC3194a.m15360M()) : AbstractC3224d.m15536o(new kj2(lj2Var.f49736a, lj2Var, linkedHashSet, 0)), AbstractC3224d.m15536o(new wz0(9, ((C1302r) c1524g.f19949b).m7357q(this.f19920e), te7Var)), new GetPlaylistLessonsUseCase$invoke$1$2(te7Var, null));
            this.f19917b = null;
            this.f19918c = null;
            this.f19916a = 1;
            if (AbstractC3224d.m15537p(e83Var, c3228h, this) == coroutineSingletons) {
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
