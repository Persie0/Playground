package com.lingq.core.data.repository;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.aj3;
import p000.c32;
import p000.se7;
import p000.xfa;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.repository.PlaylistRepositoryImpl$fetchPlaylistLessons$lessons$1", m4291f = "PlaylistRepositoryImpl.kt", m4292l = {404}, m4293m = "invokeSuspend", m4294v = 2)
final class PlaylistRepositoryImpl$fetchPlaylistLessons$lessons$1 extends SuspendLambda implements aj3 {

    /* JADX INFO: renamed from: a */
    public int f15974a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ int f15975b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ int f15976c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C1302r f15977d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ String f15978e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ int f15979f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaylistRepositoryImpl$fetchPlaylistLessons$lessons$1(C1302r c1302r, String str, int i, Continuation continuation) {
        super(3, continuation);
        this.f15977d = c1302r;
        this.f15978e = str;
        this.f15979f = i;
    }

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int iIntValue = ((Number) obj).intValue();
        int iIntValue2 = ((Number) obj2).intValue();
        String str = this.f15978e;
        int i = this.f15979f;
        PlaylistRepositoryImpl$fetchPlaylistLessons$lessons$1 playlistRepositoryImpl$fetchPlaylistLessons$lessons$1 = new PlaylistRepositoryImpl$fetchPlaylistLessons$lessons$1(this.f15977d, str, i, (Continuation) obj3);
        playlistRepositoryImpl$fetchPlaylistLessons$lessons$1.f15975b = iIntValue;
        playlistRepositoryImpl$fetchPlaylistLessons$lessons$1.f15976c = iIntValue2;
        return playlistRepositoryImpl$fetchPlaylistLessons$lessons$1.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.f15975b;
        int i2 = this.f15976c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = this.f15974a;
        if (i3 != 0) {
            if (i3 == 1) {
                AbstractC3193b.m15359b(obj);
                return obj;
            }
            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC3193b.m15359b(obj);
        se7 se7Var = this.f15977d.f16537f;
        String strValueOf = String.valueOf(this.f15979f);
        Integer num = new Integer(i);
        Integer num2 = new Integer(i2);
        this.f15975b = i;
        this.f15976c = i2;
        this.f15974a = 1;
        Object objM21315f = se7Var.m21315f(this.f15978e, strValueOf, num, num2, this);
        return objM21315f == coroutineSingletons ? coroutineSingletons : objM21315f;
    }
}
