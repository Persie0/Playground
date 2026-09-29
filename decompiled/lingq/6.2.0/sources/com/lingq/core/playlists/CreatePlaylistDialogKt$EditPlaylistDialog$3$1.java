package com.lingq.core.playlists;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.c32;
import p000.un1;
import p000.xfa;
import p000.z93;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.playlists.CreatePlaylistDialogKt$EditPlaylistDialog$3$1", m4291f = "CreatePlaylistDialog.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class CreatePlaylistDialogKt$EditPlaylistDialog$3$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ z93 f22213a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreatePlaylistDialogKt$EditPlaylistDialog$3$1(z93 z93Var, Continuation continuation) {
        super(2, continuation);
        this.f22213a = z93Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CreatePlaylistDialogKt$EditPlaylistDialog$3$1(this.f22213a, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        CreatePlaylistDialogKt$EditPlaylistDialog$3$1 createPlaylistDialogKt$EditPlaylistDialog$3$1 = (CreatePlaylistDialogKt$EditPlaylistDialog$3$1) create((un1) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        createPlaylistDialogKt$EditPlaylistDialog$3$1.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        z93.m25512a(this.f22213a);
        return xfa.f68157a;
    }
}
