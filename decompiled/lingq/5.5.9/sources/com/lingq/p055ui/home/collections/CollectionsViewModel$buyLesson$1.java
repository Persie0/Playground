package com.lingq.p055ui.home.collections;

import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.domain.Profile;
import com.lingq.shared.repository.InterfaceC3324a;
import com.lingq.shared.storage.ProfileStoreImpl$special$$inlined$map$1;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowKt__ReduceKt;
import no.InterfaceC7882z;
import p076di.InterfaceC5180b;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.home.collections.CollectionsViewModel$buyLesson$1", m19206f = "CollectionsViewModel.kt", m19207l = {736, 737, 739}, m19208m = "invokeSuspend")
final class CollectionsViewModel$buyLesson$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f23308e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ CollectionsViewModel f23309f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f23310g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f23311h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CollectionsViewModel$buyLesson$1(CollectionsViewModel collectionsViewModel, int i10, int i11, InterfaceC9968c<? super CollectionsViewModel$buyLesson$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f23309f = collectionsViewModel;
        this.f23310g = i10;
        this.f23311h = i11;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new CollectionsViewModel$buyLesson$1(this.f23309f, this.f23310g, this.f23311h, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((CollectionsViewModel$buyLesson$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x006d  */
    /* JADX WARN: Code duplicated, block: B:26:0x006f  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f23308e;
        CollectionsViewModel collectionsViewModel = this.f23309f;
        if (i10 != 0) {
            if (i10 == 1) {
                C7499b.m14977z0(obj);
            } else if (i10 == 2) {
                C7499b.m14977z0(obj);
                Profile profile = (Profile) obj;
                profile.f17800t -= this.f23311h;
                InterfaceC5180b interfaceC5180b = collectionsViewModel.f23259j;
                this.f23308e = 3;
                if (interfaceC5180b.mo9620i(profile, this) == coroutineSingletons) {
                }
            } else {
                if (i10 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7499b.m14977z0(obj);
            }
        }
        C7499b.m14977z0(obj);
        InterfaceC3324a interfaceC3324a = collectionsViewModel.f23247d;
        this.f23308e = 1;
        if (interfaceC3324a.mo9484F(this.f23310g, true, this) == coroutineSingletons) {
            return coroutineSingletons;
        }
        ProfileStoreImpl$special$$inlined$map$1 profileStoreImpl$special$$inlined$map$1Mo9619h = collectionsViewModel.f23259j.mo9619h();
        this.f23308e = 2;
        obj = FlowKt__ReduceKt.m14360a(profileStoreImpl$special$$inlined$map$1Mo9619h, this);
        if (obj == coroutineSingletons) {
            return coroutineSingletons;
        }
        Profile profile2 = (Profile) obj;
        profile2.f17800t -= this.f23311h;
        InterfaceC5180b interfaceC5180b2 = collectionsViewModel.f23259j;
        this.f23308e = 3;
        return interfaceC5180b2.mo9620i(profile2, this) == coroutineSingletons ? coroutineSingletons : C9072e.f47360a;
    }
}
