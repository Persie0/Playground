package com.lingq.player;

import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.repository.InterfaceC3324a;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.player.PlayerStatusViewModelDelegateImpl$updateListenStat$1", m19206f = "PlayerStatusViewModelDelegate.kt", m19207l = {65}, m19208m = "invokeSuspend")
public final class PlayerStatusViewModelDelegateImpl$updateListenStat$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f17734e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ PlayerStatusViewModelDelegateImpl f17735f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ String f17736g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f17737h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ double f17738i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayerStatusViewModelDelegateImpl$updateListenStat$1(PlayerStatusViewModelDelegateImpl playerStatusViewModelDelegateImpl, String str, int i10, double d10, InterfaceC9968c<? super PlayerStatusViewModelDelegateImpl$updateListenStat$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f17735f = playerStatusViewModelDelegateImpl;
        this.f17736g = str;
        this.f17737h = i10;
        this.f17738i = d10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new PlayerStatusViewModelDelegateImpl$updateListenStat$1(this.f17735f, this.f17736g, this.f17737h, this.f17738i, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((PlayerStatusViewModelDelegateImpl$updateListenStat$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f17734e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC3324a interfaceC3324a = this.f17735f.f17726c;
            String str = this.f17736g;
            int i11 = this.f17737h;
            double d10 = this.f17738i;
            this.f17734e = 1;
            if (interfaceC3324a.mo9530r((8 & 4) != 0 ? 0.0d : d10, (8 & 8) != 0 ? 0.0d : 0.0d, i11, str, this, true) == coroutineSingletons) {
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
