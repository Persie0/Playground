package com.lingq.commons.controllers;

import ae.C0062b;
import cm.InterfaceC2056p;
import cm.InterfaceC2057q;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.exoplayer2.C2413j;
import com.google.android.exoplayer2.C2466p;
import com.google.android.exoplayer2.C2505u;
import com.google.android.exoplayer2.source.C2497n;
import com.google.android.exoplayer2.source.ClippingMediaSource;
import com.lingq.util.C4924a;
import dm.C5207g;
import jm.C6526i;
import kotlin.Metadata;
import kotlin.collections.C6752c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.channels.AbstractChannel;
import kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$5;
import kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import kotlinx.coroutines.flow.InterfaceC7117d;
import no.C7828f;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.commons.controllers.TtsControllerImpl$playClipped$2", m19206f = "TtsController.kt", m19207l = {}, m19208m = "invokeSuspend")
final class TtsControllerImpl$playClipped$2 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ TtsControllerImpl f16627e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C2497n f16628f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ double f16629g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ long f16630h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ float f16631i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ C2466p f16632j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Double f16633k;

    /* JADX INFO: renamed from: com.lingq.commons.controllers.TtsControllerImpl$playClipped$2$1 */
    @Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.commons.controllers.TtsControllerImpl$playClipped$2$1", m19206f = "TtsController.kt", m19207l = {437}, m19208m = "invokeSuspend")
    public static final class C32701 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public int f16634e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ double f16635f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ TtsControllerImpl f16636g;

        /* JADX INFO: renamed from: com.lingq.commons.controllers.TtsControllerImpl$playClipped$2$1$1, reason: invalid class name */
        @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
        @InterfaceC10224c(m19205c = "com.lingq.commons.controllers.TtsControllerImpl$playClipped$2$1$1", m19206f = "TtsController.kt", m19207l = {431}, m19208m = "invokeSuspend")
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC2056p<Integer, InterfaceC9968c<? super C9072e>, Object> {

            /* JADX INFO: renamed from: e */
            public int f16637e;

            public AnonymousClass1(InterfaceC9968c<? super AnonymousClass1> interfaceC9968c) {
                super(2, interfaceC9968c);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: a */
            public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
                return new AnonymousClass1(interfaceC9968c);
            }

            @Override // cm.InterfaceC2056p
            /* JADX INFO: renamed from: m0 */
            public final Object mo1337m0(Integer num, InterfaceC9968c<? super C9072e> interfaceC9968c) {
                num.intValue();
                return new AnonymousClass1(interfaceC9968c).mo1338x(C9072e.f47360a);
            }

            /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: x */
            public final Object mo1338x(Object obj) throws Throwable {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i10 = this.f16637e;
                if (i10 == 0) {
                    C7499b.m14977z0(obj);
                    this.f16637e = 1;
                    if (C7828f.m15567a(100L, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C7499b.m14977z0(obj);
                }
                return C9072e.f47360a;
            }
        }

        /* JADX INFO: renamed from: com.lingq.commons.controllers.TtsControllerImpl$playClipped$2$1$2, reason: invalid class name */
        @Metadata(m13364d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u008a@"}, m13365d2 = {"Lkotlinx/coroutines/flow/d;", "", "", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
        @InterfaceC10224c(m19205c = "com.lingq.commons.controllers.TtsControllerImpl$playClipped$2$1$2", m19206f = "TtsController.kt", m19207l = {434}, m19208m = "invokeSuspend")
        public static final class AnonymousClass2 extends SuspendLambda implements InterfaceC2057q<InterfaceC7117d<? super Integer>, Throwable, InterfaceC9968c<? super C9072e>, Object> {

            /* JADX INFO: renamed from: e */
            public int f16638e;

            /* JADX INFO: renamed from: f */
            public final /* synthetic */ TtsControllerImpl f16639f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(TtsControllerImpl ttsControllerImpl, InterfaceC9968c<? super AnonymousClass2> interfaceC9968c) {
                super(3, interfaceC9968c);
                this.f16639f = ttsControllerImpl;
            }

            @Override // cm.InterfaceC2057q
            /* JADX INFO: renamed from: M */
            public final Object mo1343M(InterfaceC7117d<? super Integer> interfaceC7117d, Throwable th2, InterfaceC9968c<? super C9072e> interfaceC9968c) {
                return new AnonymousClass2(this.f16639f, interfaceC9968c).mo1338x(C9072e.f47360a);
            }

            /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: x */
            public final Object mo1338x(Object obj) throws Throwable {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i10 = this.f16638e;
                if (i10 == 0) {
                    C7499b.m14977z0(obj);
                    this.f16638e = 1;
                    if (C7828f.m15567a(500L, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C7499b.m14977z0(obj);
                }
                this.f16639f.f16580k.mo16479j(new Long(0L));
                return C9072e.f47360a;
            }
        }

        /* JADX INFO: renamed from: com.lingq.commons.controllers.TtsControllerImpl$playClipped$2$1$3, reason: invalid class name */
        @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"", "centiseconds", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
        @InterfaceC10224c(m19205c = "com.lingq.commons.controllers.TtsControllerImpl$playClipped$2$1$3", m19206f = "TtsController.kt", m19207l = {438}, m19208m = "invokeSuspend")
        public static final class AnonymousClass3 extends SuspendLambda implements InterfaceC2056p<Integer, InterfaceC9968c<? super C9072e>, Object> {

            /* JADX INFO: renamed from: e */
            public int f16640e;

            /* JADX INFO: renamed from: f */
            public /* synthetic */ int f16641f;

            /* JADX INFO: renamed from: g */
            public final /* synthetic */ TtsControllerImpl f16642g;

            /* JADX INFO: renamed from: com.lingq.commons.controllers.TtsControllerImpl$playClipped$2$1$3$1, reason: invalid class name */
            @Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
            @InterfaceC10224c(m19205c = "com.lingq.commons.controllers.TtsControllerImpl$playClipped$2$1$3$1", m19206f = "TtsController.kt", m19207l = {}, m19208m = "invokeSuspend")
            public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ TtsControllerImpl f16643e;

                /* JADX INFO: renamed from: f */
                public final /* synthetic */ int f16644f;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(TtsControllerImpl ttsControllerImpl, int i10, InterfaceC9968c<? super AnonymousClass1> interfaceC9968c) {
                    super(2, interfaceC9968c);
                    this.f16643e = ttsControllerImpl;
                    this.f16644f = i10;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                /* JADX INFO: renamed from: a */
                public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
                    return new AnonymousClass1(this.f16643e, this.f16644f, interfaceC9968c);
                }

                @Override // cm.InterfaceC2056p
                /* JADX INFO: renamed from: m0 */
                public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
                    return ((AnonymousClass1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                /* JADX INFO: renamed from: x */
                public final Object mo1338x(Object obj) throws Throwable {
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    C7499b.m14977z0(obj);
                    this.f16643e.f16580k.mo16479j(new Long(((long) this.f16644f) * ((long) 100)));
                    return C9072e.f47360a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass3(TtsControllerImpl ttsControllerImpl, InterfaceC9968c<? super AnonymousClass3> interfaceC9968c) {
                super(2, interfaceC9968c);
                this.f16642g = ttsControllerImpl;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: a */
            public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.f16642g, interfaceC9968c);
                anonymousClass3.f16641f = ((Number) obj).intValue();
                return anonymousClass3;
            }

            @Override // cm.InterfaceC2056p
            /* JADX INFO: renamed from: m0 */
            public final Object mo1337m0(Integer num, InterfaceC9968c<? super C9072e> interfaceC9968c) {
                return ((AnonymousClass3) mo1336a(Integer.valueOf(num.intValue()), interfaceC9968c)).mo1338x(C9072e.f47360a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: x */
            public final Object mo1338x(Object obj) throws Throwable {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i10 = this.f16640e;
                if (i10 == 0) {
                    C7499b.m14977z0(obj);
                    int i11 = this.f16641f;
                    TtsControllerImpl ttsControllerImpl = this.f16642g;
                    CoroutineDispatcher coroutineDispatcher = ttsControllerImpl.f16572c;
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(ttsControllerImpl, i11, null);
                    this.f16640e = 1;
                    if (C7828f.m15574h(this, coroutineDispatcher, anonymousClass1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C7499b.m14977z0(obj);
                }
                return C9072e.f47360a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C32701(double d10, TtsControllerImpl ttsControllerImpl, InterfaceC9968c<? super C32701> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f16635f = d10;
            this.f16636g = ttsControllerImpl;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            return new C32701(this.f16635f, this.f16636g, interfaceC9968c);
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C32701) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f16634e;
            if (i10 == 0) {
                C7499b.m14977z0(obj);
                FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 flowKt__TransformKt$onEach$$inlined$unsafeTransform$1 = new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new AnonymousClass1(null), new FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$5(C6752c.m13413G(new C6526i(0, (int) this.f16635f))));
                TtsControllerImpl ttsControllerImpl = this.f16636g;
                FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1 flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1 = new FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1(flowKt__TransformKt$onEach$$inlined$unsafeTransform$1, new AnonymousClass2(ttsControllerImpl, null));
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(ttsControllerImpl, null);
                this.f16634e = 1;
                if (C0062b.m369m0(flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1, anonymousClass3, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7499b.m14977z0(obj);
            }
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TtsControllerImpl$playClipped$2(TtsControllerImpl ttsControllerImpl, C2497n c2497n, double d10, long j10, float f3, C2466p c2466p, Double d11, InterfaceC9968c<? super TtsControllerImpl$playClipped$2> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f16627e = ttsControllerImpl;
        this.f16628f = c2497n;
        this.f16629g = d10;
        this.f16630h = j10;
        this.f16631i = f3;
        this.f16632j = c2466p;
        this.f16633k = d11;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new TtsControllerImpl$playClipped$2(this.f16627e, this.f16628f, this.f16629g, this.f16630h, this.f16631i, this.f16632j, this.f16633k, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((TtsControllerImpl$playClipped$2) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        C7499b.m14977z0(obj);
        TtsControllerImpl ttsControllerImpl = this.f16627e;
        C4924a.m10450b(ttsControllerImpl.f16566I);
        C2497n c2497n = this.f16628f;
        double d10 = this.f16629g;
        ClippingMediaSource clippingMediaSource = new ClippingMediaSource(c2497n, (long) (((double) 1000000) * d10), this.f16630h, true, false, false);
        C2505u c2505u = new C2505u(this.f16631i, 1.0f);
        C2413j c2413j = ttsControllerImpl.f16576g;
        c2413j.setPlaybackParameters(c2505u);
        boolean zM11106a = C5207g.m11106a(c2413j.getCurrentMediaItem(), this.f16632j);
        AbstractChannel abstractChannel = ttsControllerImpl.f16578i;
        if (zM11106a && c2413j.isPlaying()) {
            abstractChannel.mo16479j(Boolean.FALSE);
            c2413j.stop();
            c2413j.clearMediaItems();
            c2413j.prepare();
        } else {
            c2413j.stop();
            c2413j.clearMediaItems();
            c2413j.setMediaSource(clippingMediaSource);
            c2413j.prepare();
            c2413j.setPlayWhenReady(true);
            abstractChannel.mo16479j(Boolean.TRUE);
            Double d11 = this.f16633k;
            ttsControllerImpl.f16566I = C7828f.m15570d(ttsControllerImpl.f16571b, null, null, new C32701((d11 != null ? d11.doubleValue() - d10 : 0.0d) * ((double) 10), ttsControllerImpl, null), 3);
        }
        return C9072e.f47360a;
    }
}
