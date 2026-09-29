package com.lingq.core.data.repository;

import androidx.room.util.AbstractC0758a;
import com.lingq.core.database.dao.C1322j;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.bd7;
import p000.c32;
import p000.ld0;
import p000.rv0;
import p000.vi3;
import p000.xfa;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.repository.PlaylistRepositoryImpl$removePlaylistLesson$2$1", m4291f = "PlaylistRepositoryImpl.kt", m4292l = {622, 623, 624, 627}, m4293m = "invokeSuspend", m4294v = 2)
final class PlaylistRepositoryImpl$removePlaylistLesson$2$1 extends SuspendLambda implements vi3 {

    /* JADX INFO: renamed from: a */
    public bd7 f16020a;

    /* JADX INFO: renamed from: b */
    public int f16021b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C1302r f16022c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f16023d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ String f16024e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Integer f16025f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaylistRepositoryImpl$removePlaylistLesson$2$1(C1302r c1302r, int i, String str, Integer num, Continuation continuation) {
        super(1, continuation);
        this.f16022c = c1302r;
        this.f16023d = i;
        this.f16024e = str;
        this.f16025f = num;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new PlaylistRepositoryImpl$removePlaylistLesson$2$1(this.f16022c, this.f16023d, this.f16024e, this.f16025f, continuation);
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        return ((PlaylistRepositoryImpl$removePlaylistLesson$2$1) create((Continuation) obj)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0080  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        bd7 bd7Var;
        Object objM2861d;
        Integer num;
        C1322j c1322j = this.f16022c.f16534c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f16021b;
        int i2 = 3;
        xfa xfaVar = xfa.f68157a;
        String str = this.f16024e;
        int i3 = this.f16023d;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            this.f16021b = 1;
            obj = AbstractC0758a.m2861d(new ld0(i3, str, 23), c1322j.f17045K, this, true, true);
            if (obj != coroutineSingletons) {
            }
        }
        if (i == 1) {
            AbstractC3193b.m15359b(obj);
        } else {
            if (i == 2) {
                bd7Var = this.f16020a;
                AbstractC3193b.m15359b(obj);
                int iIntValue = this.f16025f.intValue();
                this.f16020a = bd7Var;
                this.f16021b = 3;
                objM2861d = AbstractC0758a.m2861d(new rv0(iIntValue, i3, i2), c1322j.f17045K, this, false, true);
                if (objM2861d != coroutineSingletons) {
                    objM2861d = xfaVar;
                }
                if (objM2861d != coroutineSingletons) {
                }
            }
            if (i != 3) {
                if (i == 4) {
                    AbstractC3193b.m15359b(obj);
                    return xfaVar;
                }
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            bd7Var = this.f16020a;
            AbstractC3193b.m15359b(obj);
        }
        if (bd7Var != null || (num = bd7Var.f8386d) == null) {
            return null;
        }
        int iIntValue2 = num.intValue();
        this.f16020a = null;
        this.f16021b = 4;
        Object objM2861d2 = AbstractC0758a.m2861d(new ld0(iIntValue2, str, 28), c1322j.f17045K, this, false, true);
        if (objM2861d2 != coroutineSingletons) {
            objM2861d2 = xfaVar;
        }
        return objM2861d2 == coroutineSingletons ? coroutineSingletons : xfaVar;
        bd7 bd7Var2 = (bd7) obj;
        this.f16020a = bd7Var2;
        this.f16021b = 2;
        Object objM2861d3 = AbstractC0758a.m2861d(new ld0(str, i3, 25), c1322j.f17045K, this, false, true);
        if (objM2861d3 != coroutineSingletons) {
            objM2861d3 = xfaVar;
        }
        if (objM2861d3 != coroutineSingletons) {
            bd7Var = bd7Var2;
            int iIntValue3 = this.f16025f.intValue();
            this.f16020a = bd7Var;
            this.f16021b = 3;
            objM2861d = AbstractC0758a.m2861d(new rv0(iIntValue3, i3, i2), c1322j.f17045K, this, false, true);
            if (objM2861d != coroutineSingletons) {
                objM2861d = xfaVar;
            }
            if (objM2861d != coroutineSingletons) {
                if (bd7Var != null) {
                }
                return null;
            }
        }
    }
}
