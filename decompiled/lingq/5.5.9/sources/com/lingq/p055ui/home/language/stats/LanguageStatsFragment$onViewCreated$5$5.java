package com.lingq.p055ui.home.language.stats;

import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.player.PlayerController;
import com.lingq.player.PlayingFrom;
import dm.C5207g;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.home.language.stats.LanguageStatsFragment$onViewCreated$5$5", m19206f = "LanguageStatsFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
public final class LanguageStatsFragment$onViewCreated$5$5 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ LanguageStatsFragment f24274e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LanguageStatsFragment$onViewCreated$5$5(LanguageStatsFragment languageStatsFragment, InterfaceC9968c<? super LanguageStatsFragment$onViewCreated$5$5> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f24274e = languageStatsFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new LanguageStatsFragment$onViewCreated$5$5(this.f24274e, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((LanguageStatsFragment$onViewCreated$5$5) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        C7499b.m14977z0(obj);
        LanguageStatsFragment languageStatsFragment = this.f24274e;
        PlayerController playerController = languageStatsFragment.f24244E0;
        if (playerController == null) {
            C5207g.m11117l("playerController");
            throw null;
        }
        if (playerController.m9414o0() == PlayingFrom.Lesson) {
            PlayerController playerController2 = languageStatsFragment.f24244E0;
            if (playerController2 == null) {
                C5207g.m11117l("playerController");
                throw null;
            }
            playerController2.pause();
        }
        return C9072e.f47360a;
    }
}
