package com.lingq.feature.karaoke;

import com.lingq.core.domain.model.audio.DownloadItem;
import kotlin.AbstractC3193b;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3386nv;
import p000.C3540rl;
import p000.InterfaceC3812yx;
import p000.c32;
import p000.c83;
import p000.ph4;
import p000.un1;
import p000.vk9;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.karaoke.KaraokeViewModel$3", m4291f = "KaraokeViewModel.kt", m4292l = {238}, m4293m = "invokeSuspend", m4294v = 2)
final class KaraokeViewModel$3 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f26229a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2118c f26230b;

    /* JADX INFO: renamed from: com.lingq.feature.karaoke.KaraokeViewModel$3$2 */
    @c32(m4290c = "com.lingq.feature.karaoke.KaraokeViewModel$3$2", m4291f = "KaraokeViewModel.kt", m4292l = {240}, m4293m = "invokeSuspend", m4294v = 2)
    final class C21132 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public int f26231a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ Object f26232b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ C2118c f26233c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C21132(C2118c c2118c, Continuation continuation) {
            super(2, continuation);
            this.f26233c = c2118c;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C21132 c21132 = new C21132(this.f26233c, continuation);
            c21132.f26232b = obj;
            return c21132;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) {
            return ((C21132) create((Pair) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C2118c c2118c = this.f26233c;
            InterfaceC3812yx interfaceC3812yx = c2118c.f26296j;
            Pair pair = (Pair) this.f26232b;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.f26231a;
            if (i == 0) {
                AbstractC3193b.m15359b(obj);
                int iIntValue = ((Number) pair.f47623a).intValue();
                String str = (String) pair.f47624b;
                if (str != null && !vk9.m23391n0(str) && !interfaceC3812yx.mo8231E0(iIntValue)) {
                    DownloadItem downloadItem = new DownloadItem(c2118c.f26288b.mo4589b2(), iIntValue, str);
                    this.f26232b = null;
                    this.f26231a = 1;
                    if (interfaceC3812yx.mo8234r(downloadItem, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
            } else {
                if (i != 1) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj);
            }
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KaraokeViewModel$3(C2118c c2118c, Continuation continuation) {
        super(2, continuation);
        this.f26230b = c2118c;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new KaraokeViewModel$3(this.f26230b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((KaraokeViewModel$3) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f26229a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C2118c c2118c = this.f26230b;
            c83 c83VarM15536o = AbstractC3224d.m15536o(new ph4(new C3540rl(c2118c.f26302p, 5), 0));
            C21132 c21132 = new C21132(c2118c, null);
            this.f26229a = 1;
            if (AbstractC3224d.m15529h(c83VarM15536o, c21132, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        return xfa.f68157a;
    }
}
