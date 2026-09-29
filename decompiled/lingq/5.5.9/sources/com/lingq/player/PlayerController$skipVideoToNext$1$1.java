package com.lingq.player;

import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C6753d;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.FlowKt__ReduceKt;
import kotlinx.coroutines.flow.InterfaceC7116c;
import no.C7828f;
import no.InterfaceC7882z;
import p076di.InterfaceC5182d;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.player.PlayerController$skipVideoToNext$1$1", m19206f = "PlayerController.kt", m19207l = {691, 693, 695}, m19208m = "invokeSuspend")
public final class PlayerController$skipVideoToNext$1$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f17673e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ PlayerController f17674f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ PlayerContentController.PlayerContentItem f17675g;

    /* JADX INFO: renamed from: com.lingq.player.PlayerController$skipVideoToNext$1$1$1 */
    @Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.player.PlayerController$skipVideoToNext$1$1$1", m19206f = "PlayerController.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C32911 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ PlayerController f17676e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C32911(PlayerController playerController, InterfaceC9968c<? super C32911> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f17676e = playerController;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            return new C32911(this.f17676e, interfaceC9968c);
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C32911) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            this.f17676e.m9392B0();
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayerController$skipVideoToNext$1$1(PlayerController playerController, PlayerContentController.PlayerContentItem playerContentItem, InterfaceC9968c<? super PlayerController$skipVideoToNext$1$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f17674f = playerController;
        this.f17675g = playerContentItem;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new PlayerController$skipVideoToNext$1$1(this.f17674f, this.f17675g, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((PlayerController$skipVideoToNext$1$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0085 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:25:0x0086  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineDispatcher coroutineDispatcher;
        C32911 c32911;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f17673e;
        PlayerController playerController = this.f17674f;
        if (i10 != 0) {
            if (i10 == 1) {
                C7499b.m14977z0(obj);
            } else if (i10 == 2) {
                C7499b.m14977z0(obj);
                coroutineDispatcher = playerController.f17630c;
                c32911 = new C32911(playerController, null);
                this.f17673e = 3;
                if (C7828f.m15574h(this, coroutineDispatcher, c32911) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i10 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7499b.m14977z0(obj);
            }
            return C9072e.f47360a;
        }
        C7499b.m14977z0(obj);
        InterfaceC7116c<Map<Integer, Integer>> interfaceC7116cMo9682f = playerController.f17631d.mo9682f();
        this.f17673e = 1;
        obj = FlowKt__ReduceKt.m14360a(interfaceC7116cMo9682f, this);
        if (obj == coroutineSingletons) {
            return coroutineSingletons;
        }
        LinkedHashMap linkedHashMapM13467T0 = C6753d.m13467T0((Map) obj);
        linkedHashMapM13467T0.put(new Integer(this.f17675g.f17600a), new Integer(0));
        InterfaceC5182d interfaceC5182d = playerController.f17631d;
        this.f17673e = 2;
        if (interfaceC5182d.mo9681e(linkedHashMapM13467T0, this) == coroutineSingletons) {
            return coroutineSingletons;
        }
        coroutineDispatcher = playerController.f17630c;
        c32911 = new C32911(playerController, null);
        this.f17673e = 3;
        if (C7828f.m15574h(this, coroutineDispatcher, c32911) == coroutineSingletons) {
            return coroutineSingletons;
        }
        return C9072e.f47360a;
    }
}
