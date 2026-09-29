package com.lingq.core.playlists;

import com.lingq.core.domain.model.language.Language;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3386nv;
import p000.aj3;
import p000.c32;
import p000.c83;
import p000.e83;
import p000.xfa;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.playlists.PlaylistsSelectorViewModel$special$$inlined$flatMapLatest$1", m4291f = "PlaylistsSelectorViewModel.kt", m4292l = {189}, m4293m = "invokeSuspend", m4294v = 2)
public final class PlaylistsSelectorViewModel$special$$inlined$flatMapLatest$1 extends SuspendLambda implements aj3 {

    /* JADX INFO: renamed from: a */
    public int f22235a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ e83 f22236b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f22237c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C1832h f22238d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaylistsSelectorViewModel$special$$inlined$flatMapLatest$1(C1832h c1832h, Continuation continuation) {
        super(3, continuation);
        this.f22238d = c1832h;
    }

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        PlaylistsSelectorViewModel$special$$inlined$flatMapLatest$1 playlistsSelectorViewModel$special$$inlined$flatMapLatest$1 = new PlaylistsSelectorViewModel$special$$inlined$flatMapLatest$1(this.f22238d, (Continuation) obj3);
        playlistsSelectorViewModel$special$$inlined$flatMapLatest$1.f22236b = (e83) obj;
        playlistsSelectorViewModel$special$$inlined$flatMapLatest$1.f22237c = obj2;
        return playlistsSelectorViewModel$special$$inlined$flatMapLatest$1.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f22235a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            e83 e83Var = this.f22236b;
            c83 c83VarM8200b = this.f22238d.f22292b.m8200b(((Language) this.f22237c).f19024a);
            this.f22236b = null;
            this.f22237c = null;
            this.f22235a = 1;
            if (AbstractC3224d.m15537p(e83Var, c83VarM8200b, this) == coroutineSingletons) {
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
