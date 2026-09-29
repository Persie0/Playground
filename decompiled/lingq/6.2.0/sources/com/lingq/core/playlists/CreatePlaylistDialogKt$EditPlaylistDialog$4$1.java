package com.lingq.core.playlists;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.c32;
import p000.ui3;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.playlists.CreatePlaylistDialogKt$EditPlaylistDialog$4$1", m4291f = "CreatePlaylistDialog.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class CreatePlaylistDialogKt$EditPlaylistDialog$4$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f22214a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ui3 f22215b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreatePlaylistDialogKt$EditPlaylistDialog$4$1(String str, ui3 ui3Var, Continuation continuation) {
        super(2, continuation);
        this.f22214a = str;
        this.f22215b = ui3Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CreatePlaylistDialogKt$EditPlaylistDialog$4$1(this.f22214a, this.f22215b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        CreatePlaylistDialogKt$EditPlaylistDialog$4$1 createPlaylistDialogKt$EditPlaylistDialog$4$1 = (CreatePlaylistDialogKt$EditPlaylistDialog$4$1) create((un1) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        createPlaylistDialogKt$EditPlaylistDialog$4$1.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        if (this.f22214a != null) {
            this.f22215b.mo0a();
        }
        return xfa.f68157a;
    }
}
