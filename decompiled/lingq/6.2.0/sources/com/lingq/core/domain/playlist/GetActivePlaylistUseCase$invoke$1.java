package com.lingq.core.domain.playlist;

import com.lingq.core.domain.model.playlist.Playlist;
import java.util.List;
import java.util.Map;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.aj3;
import p000.c32;
import p000.fa4;
import p000.u91;
import p000.xfa;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.domain.playlist.GetActivePlaylistUseCase$invoke$1", m4291f = "GetActivePlaylistUseCase.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class GetActivePlaylistUseCase$invoke$1 extends SuspendLambda implements aj3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ List f19906a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Map f19907b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f19908c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetActivePlaylistUseCase$invoke$1(String str, Continuation continuation) {
        super(3, continuation);
        this.f19908c = str;
    }

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        GetActivePlaylistUseCase$invoke$1 getActivePlaylistUseCase$invoke$1 = new GetActivePlaylistUseCase$invoke$1(this.f19908c, (Continuation) obj3);
        getActivePlaylistUseCase$invoke$1.f19906a = (List) obj;
        getActivePlaylistUseCase$invoke$1.f19907b = (Map) obj2;
        return getActivePlaylistUseCase$invoke$1.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        List list = this.f19906a;
        Map map = this.f19907b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        Object obj2 = null;
        if (list.isEmpty()) {
            return null;
        }
        String str = (String) map.get(this.f19908c);
        for (Object obj3 : list) {
            if (fa4.m11650l(((Playlist) obj3).f19553a, str)) {
                obj2 = obj3;
                break;
            }
        }
        Playlist playlist = (Playlist) obj2;
        return playlist == null ? (Playlist) u91.m22589G0(list) : playlist;
    }
}
