package com.lingq.core.download;

import androidx.room.util.AbstractC0758a;
import com.lingq.core.data.repository.C1302r;
import com.lingq.core.database.dao.C1322j;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.h85;
import p000.sx4;
import p000.un1;
import p000.vd7;
import p000.xd7;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.download.AudioDownloadManagerImpl$cancelAllDownloadsFor$2$1", m4291f = "AudioDownloadManager.kt", m4292l = {125, 128, 134}, m4293m = "invokeSuspend", m4294v = 2)
final class AudioDownloadManagerImpl$cancelAllDownloadsFor$2$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f20180a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1547b f20181b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f20182c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f20183d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AudioDownloadManagerImpl$cancelAllDownloadsFor$2$1(C1547b c1547b, String str, int i, Continuation continuation) {
        super(2, continuation);
        this.f20181b = c1547b;
        this.f20182c = str;
        this.f20183d = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AudioDownloadManagerImpl$cancelAllDownloadsFor$2$1(this.f20181b, this.f20182c, this.f20183d, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((AudioDownloadManagerImpl$cancelAllDownloadsFor$2$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7356p;
        xd7 xd7Var = this.f20181b.f20218b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f20180a;
        xfa xfaVar = xfa.f68157a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            this.f20180a = 1;
            objM7356p = ((C1302r) xd7Var).m7356p(this.f20183d, this.f20182c, this);
            if (objM7356p != coroutineSingletons) {
            }
        }
        if (i == 1) {
            AbstractC3193b.m15359b(obj);
            objM7356p = obj;
        } else {
            if (i != 2) {
                if (i == 3) {
                    AbstractC3193b.m15359b(obj);
                    return xfaVar;
                }
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        this.f20180a = 3;
        return ((C1302r) xd7Var).m7340A(this.f20183d, 0, this.f20182c, "idle", null, this) == coroutineSingletons ? coroutineSingletons : xfaVar;
        vd7 vd7Var = (vd7) objM7356p;
        if (vd7Var != null && !vd7Var.f65237b && vd7Var.f65238c < 100) {
            this.f20180a = 2;
            C1322j c1322j = ((C1302r) xd7Var).f16534c;
            Object objM2861d = AbstractC0758a.m2861d(new h85(23, c1322j, new sx4(this.f20183d, this.f20182c, false, 0, "idle", null, 0L)), c1322j.f17045K, this, false, true);
            if (objM2861d != coroutineSingletons) {
                objM2861d = xfaVar;
            }
            if (objM2861d != coroutineSingletons) {
                objM2861d = xfaVar;
            }
            if (objM2861d != coroutineSingletons) {
                this.f20180a = 3;
                if (((C1302r) xd7Var).m7340A(this.f20183d, 0, this.f20182c, "idle", null, this) == coroutineSingletons) {
                }
            }
        }
    }
}
