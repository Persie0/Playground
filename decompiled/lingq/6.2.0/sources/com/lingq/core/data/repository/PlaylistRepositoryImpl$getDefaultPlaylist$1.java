package com.lingq.core.data.repository;

import androidx.room.util.AbstractC0758a;
import com.lingq.core.database.dao.C1322j;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.e83;
import p000.ql4;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.repository.PlaylistRepositoryImpl$getDefaultPlaylist$1", m4291f = "PlaylistRepositoryImpl.kt", m4292l = {316, 316}, m4293m = "invokeSuspend", m4294v = 2)
final class PlaylistRepositoryImpl$getDefaultPlaylist$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public e83 f15992a;

    /* JADX INFO: renamed from: b */
    public int f15993b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f15994c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C1302r f15995d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ String f15996e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaylistRepositoryImpl$getDefaultPlaylist$1(C1302r c1302r, String str, Continuation continuation) {
        super(2, continuation);
        this.f15995d = c1302r;
        this.f15996e = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        PlaylistRepositoryImpl$getDefaultPlaylist$1 playlistRepositoryImpl$getDefaultPlaylist$1 = new PlaylistRepositoryImpl$getDefaultPlaylist$1(this.f15995d, this.f15996e, continuation);
        playlistRepositoryImpl$getDefaultPlaylist$1.f15994c = obj;
        return playlistRepositoryImpl$getDefaultPlaylist$1;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((PlaylistRepositoryImpl$getDefaultPlaylist$1) create((e83) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004b, code lost:
    
        if (r0.emit(r9, r8) == r1) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        e83 e83Var = (e83) this.f15994c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f15993b;
        if (i != 0) {
            if (i == 1) {
                e83Var = this.f15992a;
                AbstractC3193b.m15359b(obj);
            } else {
                if (i != 2) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj);
            }
            return xfa.f68157a;
        }
        AbstractC3193b.m15359b(obj);
        C1322j c1322j = this.f15995d.f16534c;
        this.f15994c = null;
        this.f15992a = e83Var;
        this.f15993b = 1;
        obj = AbstractC0758a.m2861d(new ql4(this.f15996e, 16), c1322j.f17045K, this, true, false);
        if (obj != coroutineSingletons) {
        }
        return coroutineSingletons;
        this.f15994c = null;
        this.f15992a = null;
        this.f15993b = 2;
    }
}
