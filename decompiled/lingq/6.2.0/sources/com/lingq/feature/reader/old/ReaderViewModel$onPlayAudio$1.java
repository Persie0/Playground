package com.lingq.feature.reader.old;

import com.lingq.core.common.util.AbstractC1263a;
import com.lingq.core.domain.model.lesson.Lesson;
import com.lingq.core.p012ui.UpgradeReason;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.lda;
import p000.un1;
import p000.ux5;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.old.ReaderViewModel$onPlayAudio$1", m4291f = "ReaderViewModel.kt", m4292l = {1588}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderViewModel$onPlayAudio$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f29004a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2412n f29005b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f29006c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderViewModel$onPlayAudio$1(C2412n c2412n, int i, Continuation continuation) {
        super(2, continuation);
        this.f29005b = c2412n;
        this.f29006c = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReaderViewModel$onPlayAudio$1(this.f29005b, this.f29006c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReaderViewModel$onPlayAudio$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f29004a;
        int i2 = this.f29006c;
        C2412n c2412n = this.f29005b;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            this.f29004a = 1;
            obj = C2412n.m9315X2(c2412n, i2, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        xfa xfaVar = xfa.f68157a;
        if (zBooleanValue) {
            c2412n.f29338a1 = false;
            c2412n.f29332Y0.mo4677k(new Integer(i2));
            return xfaVar;
        }
        Lesson lesson = (Lesson) c2412n.f29381l0.getValue();
        if (lesson != null) {
            String str = lesson.f19147f;
            if (str == null || str.length() <= 0) {
                str = "";
            }
            if (str.equals("")) {
                if (c2412n.f29340b.mo4593p0()) {
                    c2412n.f29276F1.mo4677k(xfaVar);
                    return xfaVar;
                }
                c2412n.mo3737M1(UpgradeReason.GENERATE_TTS);
                return xfaVar;
            }
            c2412n.f29338a1 = true;
            AbstractC1263a.m7048c(lda.m16103C(c2412n), ux5.m22988k(lesson.f19142a, "download "), new ReaderViewModel$downloadTrack$1(c2412n, str, null));
        }
        return xfaVar;
    }
}
