package com.lingq.feature.widget.layout.network;

import android.net.Uri;
import androidx.datastore.preferences.core.MutablePreferences;
import androidx.datastore.preferences.core.Preferences;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.c32;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.widget.layout.network.PlaylistLessonImageWorker$doWork$3$1", m4291f = "PlaylistLessonImageWorker.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class PlaylistLessonImageWorker$doWork$3$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f33856a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Preferences.Key f33857b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Uri f33858c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaylistLessonImageWorker$doWork$3$1(Preferences.Key key, Uri uri, Continuation continuation) {
        super(2, continuation);
        this.f33857b = key;
        this.f33858c = uri;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        PlaylistLessonImageWorker$doWork$3$1 playlistLessonImageWorker$doWork$3$1 = new PlaylistLessonImageWorker$doWork$3$1(this.f33857b, this.f33858c, continuation);
        playlistLessonImageWorker$doWork$3$1.f33856a = obj;
        return playlistLessonImageWorker$doWork$3$1;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        PlaylistLessonImageWorker$doWork$3$1 playlistLessonImageWorker$doWork$3$1 = (PlaylistLessonImageWorker$doWork$3$1) create((MutablePreferences) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        playlistLessonImageWorker$doWork$3$1.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        MutablePreferences mutablePreferences = (MutablePreferences) this.f33856a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        mutablePreferences.set(this.f33857b, this.f33858c.toString());
        return xfa.f68157a;
    }
}
