package com.lingq.commons.controllers;

import ae.C0062b;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import jm.C6526i;
import kotlin.Metadata;
import kotlin.collections.C6752c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$5;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import no.C7828f;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.commons.controllers.TtsControllerImpl$startTimer$2", m19206f = "TtsController.kt", m19207l = {475}, m19208m = "invokeSuspend")
final class TtsControllerImpl$startTimer$2 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f16669e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ TtsControllerImpl f16670f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ String f16671g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ String f16672h;

    /* JADX INFO: renamed from: com.lingq.commons.controllers.TtsControllerImpl$startTimer$2$1 */
    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.commons.controllers.TtsControllerImpl$startTimer$2$1", m19206f = "TtsController.kt", m19207l = {474}, m19208m = "invokeSuspend")
    public static final class C32711 extends SuspendLambda implements InterfaceC2056p<Integer, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public int f16673e;

        public C32711(InterfaceC9968c<? super C32711> interfaceC9968c) {
            super(2, interfaceC9968c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            return new C32711(interfaceC9968c);
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(Integer num, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            num.intValue();
            return new C32711(interfaceC9968c).mo1338x(C9072e.f47360a);
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f16673e;
            if (i10 == 0) {
                C7499b.m14977z0(obj);
                this.f16673e = 1;
                if (C7828f.m15567a(1000L, this) == coroutineSingletons) {
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

    /* JADX INFO: renamed from: com.lingq.commons.controllers.TtsControllerImpl$startTimer$2$2 */
    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"", "seconds", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.commons.controllers.TtsControllerImpl$startTimer$2$2", m19206f = "TtsController.kt", m19207l = {477}, m19208m = "invokeSuspend")
    public static final class C32722 extends SuspendLambda implements InterfaceC2056p<Integer, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public int f16674e;

        /* JADX INFO: renamed from: f */
        public /* synthetic */ int f16675f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ TtsControllerImpl f16676g;

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ String f16677h;

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ String f16678i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C32722(TtsControllerImpl ttsControllerImpl, String str, String str2, InterfaceC9968c<? super C32722> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f16676g = ttsControllerImpl;
            this.f16677h = str;
            this.f16678i = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C32722 c32722 = new C32722(this.f16676g, this.f16677h, this.f16678i, interfaceC9968c);
            c32722.f16675f = ((Number) obj).intValue();
            return c32722;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(Integer num, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C32722) mo1336a(Integer.valueOf(num.intValue()), interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f16674e;
            if (i10 == 0) {
                C7499b.m14977z0(obj);
                if (this.f16675f == 2) {
                    this.f16674e = 1;
                    if (this.f16676g.m9341g(this.f16677h, this.f16678i, 1.0f, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
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
    public TtsControllerImpl$startTimer$2(TtsControllerImpl ttsControllerImpl, String str, String str2, InterfaceC9968c<? super TtsControllerImpl$startTimer$2> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f16670f = ttsControllerImpl;
        this.f16671g = str;
        this.f16672h = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new TtsControllerImpl$startTimer$2(this.f16670f, this.f16671g, this.f16672h, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((TtsControllerImpl$startTimer$2) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f16669e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 flowKt__TransformKt$onEach$$inlined$unsafeTransform$1 = new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new C32711(null), new FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$5(C6752c.m13413G(new C6526i(0, 2))));
            C32722 c32722 = new C32722(this.f16670f, this.f16671g, this.f16672h, null);
            this.f16669e = 1;
            if (C0062b.m369m0(flowKt__TransformKt$onEach$$inlined$unsafeTransform$1, c32722, this) == coroutineSingletons) {
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
