package com.lingq.core.database.dao;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.vi3;
import p000.xfa;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.database.dao.PlaylistDao_Impl$updatePlaylistName$2", m4291f = "PlaylistDao_Impl.kt", m4292l = {263}, m4293m = "invokeSuspend", m4294v = 2)
final class PlaylistDao_Impl$updatePlaylistName$2 extends SuspendLambda implements vi3 {

    /* JADX INFO: renamed from: a */
    public int f16987a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1322j f16988b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f16989c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ String f16990d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ String f16991e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaylistDao_Impl$updatePlaylistName$2(C1322j c1322j, String str, String str2, String str3, Continuation continuation) {
        super(1, continuation);
        this.f16988b = c1322j;
        this.f16989c = str;
        this.f16990d = str2;
        this.f16991e = str3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new PlaylistDao_Impl$updatePlaylistName$2(this.f16988b, this.f16989c, this.f16990d, this.f16991e, continuation);
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        return ((PlaylistDao_Impl$updatePlaylistName$2) create((Continuation) obj)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f16987a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            this.f16987a = 1;
            if (C1322j.m7513A0(this.f16988b, this.f16989c, this.f16990d, this.f16991e, this) == coroutineSingletons) {
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
