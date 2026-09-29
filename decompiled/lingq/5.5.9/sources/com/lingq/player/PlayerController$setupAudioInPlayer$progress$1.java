package com.lingq.player;

import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.Map;
import kotlin.Metadata;
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
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.player.PlayerController$setupAudioInPlayer$progress$1", m19206f = "PlayerController.kt", m19207l = {268}, m19208m = "invokeSuspend")
final class PlayerController$setupAudioInPlayer$progress$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super Integer>, Object> {

    /* JADX INFO: renamed from: e */
    public int f17670e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ PlayerController f17671f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f17672g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayerController$setupAudioInPlayer$progress$1(PlayerController playerController, int i10, InterfaceC9968c<? super PlayerController$setupAudioInPlayer$progress$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f17671f = playerController;
        this.f17672g = i10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new PlayerController$setupAudioInPlayer$progress$1(this.f17671f, this.f17672g, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super Integer> interfaceC9968c) {
        return ((PlayerController$setupAudioInPlayer$progress$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f17670e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC7116c<Map<Integer, Integer>> interfaceC7116cMo9682f = this.f17671f.f17631d.mo9682f();
            this.f17670e = 1;
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
        return ((Map) obj).get(new Integer(this.f17672g));
    }
}
