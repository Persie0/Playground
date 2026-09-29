package com.lingq.feature.playlist;

import java.util.Iterator;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.lda;
import p000.pg9;
import p000.tb7;
import p000.vi3;
import p000.vk9;
import p000.wfb;
import p000.xfa;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.playlist.CollectionPlaylistViewModel$resetAndSetupTracks$1", m4291f = "CollectionPlaylistViewModel.kt", m4292l = {214}, m4293m = "invokeSuspend", m4294v = 2)
final class CollectionPlaylistViewModel$resetAndSetupTracks$1 extends SuspendLambda implements vi3 {

    /* JADX INFO: renamed from: a */
    public C2251a f27563a;

    /* JADX INFO: renamed from: b */
    public Iterator f27564b;

    /* JADX INFO: renamed from: c */
    public int f27565c;

    /* JADX INFO: renamed from: d */
    public int f27566d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ List f27567e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C2251a f27568f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CollectionPlaylistViewModel$resetAndSetupTracks$1(List list, C2251a c2251a, Continuation continuation) {
        super(1, continuation);
        this.f27567e = list;
        this.f27568f = c2251a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new CollectionPlaylistViewModel$resetAndSetupTracks$1(this.f27567e, this.f27568f, continuation);
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        return ((CollectionPlaylistViewModel$resetAndSetupTracks$1) create((Continuation) obj)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i;
        C2251a c2251a;
        Iterator it;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.f27566d;
        if (i2 == 0) {
            AbstractC3193b.m15359b(obj);
            Iterator it2 = this.f27567e.iterator();
            i = 0;
            c2251a = this.f27568f;
            it = it2;
        } else {
            if (i2 != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = this.f27565c;
            it = this.f27564b;
            c2251a = this.f27563a;
            AbstractC3193b.m15359b(obj);
        }
        while (it.hasNext()) {
            tb7 tb7Var = (tb7) it.next();
            if (!vk9.m23391n0(tb7Var.f62102b) && !c2251a.m9207Z2(tb7Var.f62101a)) {
                pg9 pg9VarM23926u = wfb.m23926u(lda.m16103C(c2251a), null, null, new CollectionPlaylistViewModel$resetAndSetupTracks$1$1$1(c2251a, tb7Var, null), 3);
                this.f27563a = c2251a;
                this.f27564b = it;
                this.f27565c = i;
                this.f27566d = 1;
                if (pg9VarM23926u.mo4539q(this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        }
        return xfa.f68157a;
    }
}
