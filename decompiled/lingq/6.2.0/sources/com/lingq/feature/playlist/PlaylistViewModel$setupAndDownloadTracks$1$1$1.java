package com.lingq.feature.playlist;

import com.lingq.core.domain.model.audio.DownloadItem;
import com.lingq.core.domain.playlist.C1519b;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.tb7;
import p000.un1;
import p000.vk9;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.playlist.PlaylistViewModel$setupAndDownloadTracks$1$1$1", m4291f = "PlaylistViewModel.kt", m4292l = {408, 409}, m4293m = "invokeSuspend", m4294v = 2)
final class PlaylistViewModel$setupAndDownloadTracks$1$1$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f27754a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ tb7 f27755b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C2255e f27756c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaylistViewModel$setupAndDownloadTracks$1$1$1(tb7 tb7Var, C2255e c2255e, Continuation continuation) {
        super(2, continuation);
        this.f27755b = tb7Var;
        this.f27756c = c2255e;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PlaylistViewModel$setupAndDownloadTracks$1$1$1(this.f27755b, this.f27756c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((PlaylistViewModel$setupAndDownloadTracks$1$1$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0053  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0066, code lost:
    
        if (r5.f27827d.mo8234r(r7, r6) == r0) goto L23;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f27754a;
        tb7 tb7Var = this.f27755b;
        C2255e c2255e = this.f27756c;
        if (i != 0) {
            if (i == 1) {
                AbstractC3193b.m15359b(obj);
                if (((Boolean) obj).booleanValue()) {
                    DownloadItem downloadItem = new DownloadItem(tb7Var.f62110j, tb7Var.f62101a, tb7Var.f62102b);
                    this.f27754a = 2;
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
        if (!vk9.m23391n0(tb7Var.f62102b) && !c2255e.m9242d3(tb7Var.f62101a) && ((Boolean) c2255e.f27816K.getValue()).booleanValue()) {
            C1519b c1519b = c2255e.f27834k;
            this.f27754a = 1;
            obj = c1519b.m8195a(this);
            if (obj != coroutineSingletons) {
                if (((Boolean) obj).booleanValue()) {
                    DownloadItem downloadItem2 = new DownloadItem(tb7Var.f62110j, tb7Var.f62101a, tb7Var.f62102b);
                    this.f27754a = 2;
                }
            }
            return coroutineSingletons;
        }
        return xfa.f68157a;
    }
}
