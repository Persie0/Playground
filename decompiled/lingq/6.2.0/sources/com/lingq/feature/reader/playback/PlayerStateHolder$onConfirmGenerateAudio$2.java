package com.lingq.feature.reader.playback;

import com.lingq.core.domain.lesson.C1381c;
import com.lingq.core.domain.model.audio.DownloadItem;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C3244l;
import p000.C3386nv;
import p000.InterfaceC3812yx;
import p000.c32;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.playback.PlayerStateHolder$onConfirmGenerateAudio$2", m4291f = "PlayerStateHolder.kt", m4292l = {447, 450}, m4293m = "invokeSuspend", m4294v = 2)
final class PlayerStateHolder$onConfirmGenerateAudio$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f29730a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2465a f29731b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayerStateHolder$onConfirmGenerateAudio$2(C2465a c2465a, Continuation continuation) {
        super(2, continuation);
        this.f29731b = c2465a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PlayerStateHolder$onConfirmGenerateAudio$2(this.f29731b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((PlayerStateHolder$onConfirmGenerateAudio$2) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0052, code lost:
    
        if (r1.mo8234r(r2, r7) == r0) goto L17;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f29730a;
        C2465a c2465a = this.f29731b;
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
            return xfa.f68157a;
        }
        AbstractC3193b.m15359b(obj);
        C1381c c1381c = c2465a.f29776j;
        String str = c2465a.f29787u;
        int i2 = c2465a.f29786t;
        this.f29730a = 1;
        obj = c1381c.m7991b(i2, str, this);
        if (obj != coroutineSingletons) {
        }
        return coroutineSingletons;
        String str2 = (String) obj;
        if (str2.length() > 0) {
            C3244l c3244l = c2465a.f29789w;
            Boolean bool = Boolean.TRUE;
            c3244l.getClass();
            c3244l.m15572j(null, bool);
            InterfaceC3812yx interfaceC3812yx = c2465a.f29769c;
            DownloadItem downloadItem = new DownloadItem(c2465a.f29787u, c2465a.f29786t, str2);
            this.f29730a = 2;
        }
        return xfa.f68157a;
    }
}
