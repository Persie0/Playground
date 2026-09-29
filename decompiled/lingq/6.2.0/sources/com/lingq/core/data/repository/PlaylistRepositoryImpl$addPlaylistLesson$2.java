package com.lingq.core.data.repository;

import androidx.room.util.AbstractC0758a;
import com.lingq.core.database.dao.AbstractC1320h;
import com.lingq.core.database.dao.C1322j;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.bd7;
import p000.c32;
import p000.h85;
import p000.n75;
import p000.vi3;
import p000.vz1;
import p000.xfa;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.repository.PlaylistRepositoryImpl$addPlaylistLesson$2", m4291f = "PlaylistRepositoryImpl.kt", m4292l = {124, 125}, m4293m = "invokeSuspend", m4294v = 2)
final class PlaylistRepositoryImpl$addPlaylistLesson$2 extends SuspendLambda implements vi3 {

    /* JADX INFO: renamed from: a */
    public int f15894a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1302r f15895b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ bd7 f15896c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f15897d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f15898e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ String f15899f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaylistRepositoryImpl$addPlaylistLesson$2(C1302r c1302r, bd7 bd7Var, int i, int i2, String str, Continuation continuation) {
        super(1, continuation);
        this.f15895b = c1302r;
        this.f15896c = bd7Var;
        this.f15897d = i;
        this.f15898e = i2;
        this.f15899f = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new PlaylistRepositoryImpl$addPlaylistLesson$2(this.f15895b, this.f15896c, this.f15897d, this.f15898e, this.f15899f, continuation);
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        return ((PlaylistRepositoryImpl$addPlaylistLesson$2) create((Continuation) obj)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f15894a;
        xfa xfaVar = xfa.f68157a;
        C1302r c1302r = this.f15895b;
        if (i != 0) {
            if (i == 1) {
                AbstractC3193b.m15359b(obj);
            } else {
                if (i != 2) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj);
            }
        }
        AbstractC3193b.m15359b(obj);
        C1322j c1322j = c1302r.f16534c;
        this.f15894a = 1;
        Object objM2861d = AbstractC0758a.m2861d(new h85(25, c1322j, this.f15896c), c1322j.f17045K, this, false, true);
        if (objM2861d != coroutineSingletons) {
            objM2861d = xfaVar;
        }
        if (objM2861d != coroutineSingletons) {
        }
        AbstractC1320h abstractC1320h = c1302r.f16533b;
        List listM23604J = vz1.m23604J(new n75(this.f15897d, this.f15899f, this.f15898e));
        this.f15894a = 2;
        return abstractC1320h.mo7493J0(listM23604J, this) == coroutineSingletons ? coroutineSingletons : xfaVar;
    }
}
