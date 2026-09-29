package com.lingq.player;

import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Triple;
import kotlin.collections.C6753d;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowKt__ReduceKt;
import kotlinx.coroutines.flow.InterfaceC7116c;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.player.PlayerController$updateTrack$3", m19206f = "PlayerController.kt", m19207l = {761}, m19208m = "invokeSuspend")
public final class PlayerController$updateTrack$3 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f17683e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ PlayerController f17684f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ PlayerContentController.PlayerContentItem f17685g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ boolean f17686h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayerController$updateTrack$3(PlayerController playerController, PlayerContentController.PlayerContentItem playerContentItem, boolean z10, InterfaceC9968c<? super PlayerController$updateTrack$3> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f17684f = playerController;
        this.f17685g = playerContentItem;
        this.f17686h = z10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new PlayerController$updateTrack$3(this.f17684f, this.f17685g, this.f17686h, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((PlayerController$updateTrack$3) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f17683e;
        PlayerController playerController = this.f17684f;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC7116c<Map<Integer, Integer>> interfaceC7116cMo9682f = playerController.f17631d.mo9682f();
            this.f17683e = 1;
            obj = FlowKt__ReduceKt.m14360a(interfaceC7116cMo9682f, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7499b.m14977z0(obj);
        }
        LinkedHashMap linkedHashMapM13467T0 = C6753d.m13467T0((Map) obj);
        PlayerContentController.PlayerContentItem playerContentItem = this.f17685g;
        Integer num = (Integer) linkedHashMapM13467T0.get(new Integer(playerContentItem.f17600a));
        playerController.mo9425z0().setValue(new Triple<>(playerContentItem, Boolean.valueOf(this.f17686h), new Integer(num != null ? num.intValue() : 0)));
        return C9072e.f47360a;
    }
}
