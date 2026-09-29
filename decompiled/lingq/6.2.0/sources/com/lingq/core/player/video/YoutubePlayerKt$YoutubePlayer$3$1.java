package com.lingq.core.player.video;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.bbb;
import p000.c32;
import p000.gbb;
import p000.gm5;
import p000.hbb;
import p000.ibb;
import p000.jbb;
import p000.lbb;
import p000.mbb;
import p000.pbb;
import p000.t66;
import p000.ui3;
import p000.un1;
import p000.vab;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.player.video.YoutubePlayerKt$YoutubePlayer$3$1", m4291f = "YoutubePlayer.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class YoutubePlayerKt$YoutubePlayer$3$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ pbb f22185a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ui3 f22186b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ t66 f22187c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ t66 f22188d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ t66 f22189e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ t66 f22190f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public YoutubePlayerKt$YoutubePlayer$3$1(pbb pbbVar, ui3 ui3Var, t66 t66Var, t66 t66Var2, t66 t66Var3, t66 t66Var4, Continuation continuation) {
        super(2, continuation);
        this.f22185a = pbbVar;
        this.f22186b = ui3Var;
        this.f22187c = t66Var;
        this.f22188d = t66Var2;
        this.f22189e = t66Var3;
        this.f22190f = t66Var4;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new YoutubePlayerKt$YoutubePlayer$3$1(this.f22185a, this.f22186b, this.f22187c, this.f22188d, this.f22189e, this.f22190f, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        YoutubePlayerKt$YoutubePlayer$3$1 youtubePlayerKt$YoutubePlayer$3$1 = (YoutubePlayerKt$YoutubePlayer$3$1) create((un1) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        youtubePlayerKt$YoutubePlayer$3$1.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        pbb pbbVar = this.f22185a;
        if (pbbVar != null) {
            vab vabVar = (vab) this.f22187c.getValue();
            if (vabVar != null) {
                boolean zBooleanValue = ((Boolean) this.f22188d.getValue()).booleanValue();
                float fFloatValue = ((Number) this.f22189e.getValue()).floatValue();
                if (pbbVar instanceof ibb) {
                    ((bbb) vabVar).m3596g(((ibb) pbbVar).f43910a / 1000.0f);
                } else if (pbbVar instanceof gbb) {
                    ((bbb) vabVar).m3596g(((gbb) pbbVar).f40509a / 1000.0f);
                } else if (pbbVar instanceof mbb) {
                    ((bbb) vabVar).m3596g(((mbb) pbbVar).f50901a / 1000.0f);
                } else if (pbbVar instanceof hbb) {
                    if (zBooleanValue) {
                        ((bbb) vabVar).m3593d(((hbb) pbbVar).f42144a, fFloatValue);
                    } else {
                        ((bbb) vabVar).m3591b(((hbb) pbbVar).f42144a, fFloatValue);
                    }
                } else if (pbbVar.equals(lbb.f49418a)) {
                    bbb bbbVar = (bbb) vabVar;
                    bbbVar.m3592c(bbbVar.f8302a, "playVideo", new Object[0]);
                } else {
                    if (!pbbVar.equals(jbb.f45386a)) {
                        gm5.m12750e();
                        return null;
                    }
                    ((bbb) vabVar).m3594e();
                }
            } else {
                this.f22190f.setValue(pbbVar);
            }
            this.f22186b.mo0a();
        }
        return xfa.f68157a;
    }
}
