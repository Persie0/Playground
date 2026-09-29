package com.lingq.feature.playlist;

import com.lingq.core.domain.lesson.C1381c;
import com.lingq.core.domain.model.audio.DownloadItem;
import com.lingq.core.p012ui.UpgradeReason;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.cma;
import p000.vi3;
import p000.xfa;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.playlist.PlaylistViewModel$generateLessonAudio$1", m4291f = "PlaylistViewModel.kt", m4292l = {851, 853}, m4293m = "invokeSuspend", m4294v = 2)
final class PlaylistViewModel$generateLessonAudio$1 extends SuspendLambda implements vi3 {

    /* JADX INFO: renamed from: a */
    public int f27686a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2255e f27687b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f27688c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaylistViewModel$generateLessonAudio$1(C2255e c2255e, int i, Continuation continuation) {
        super(1, continuation);
        this.f27687b = c2255e;
        this.f27688c = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new PlaylistViewModel$generateLessonAudio$1(this.f27687b, this.f27688c, continuation);
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        return ((PlaylistViewModel$generateLessonAudio$1) create((Continuation) obj)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0044  */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0057, code lost:
    
        if (r5.f27827d.mo8234r(r1, r6) == r0) goto L19;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        String str;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f27686a;
        int i2 = this.f27688c;
        C2255e c2255e = this.f27687b;
        if (i != 0) {
            if (i == 1) {
                AbstractC3193b.m15359b(obj);
                str = (String) obj;
                if (str.length() > 0) {
                    DownloadItem downloadItem = new DownloadItem(c2255e.f27825b.mo4589b2(), i2, str);
                    this.f27686a = 2;
                }
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
        c2255e.m9241c3();
        cma cmaVar = c2255e.f27825b;
        if (cmaVar.mo4598w2()) {
            C1381c c1381c = c2255e.f27835l;
            String strMo4589b2 = cmaVar.mo4589b2();
            this.f27686a = 1;
            obj = c1381c.m7991b(i2, strMo4589b2, this);
            if (obj != coroutineSingletons) {
                str = (String) obj;
                if (str.length() > 0) {
                    DownloadItem downloadItem2 = new DownloadItem(c2255e.f27825b.mo4589b2(), i2, str);
                    this.f27686a = 2;
                }
            }
            return coroutineSingletons;
        }
        c2255e.mo3737M1(UpgradeReason.GENERATE_TTS);
        return xfa.f68157a;
    }
}
