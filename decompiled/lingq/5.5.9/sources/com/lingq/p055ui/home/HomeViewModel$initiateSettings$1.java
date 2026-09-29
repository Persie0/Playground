package com.lingq.p055ui.home;

import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.uimodel.vocabulary.VocabularySearchQuery;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
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

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.home.HomeViewModel$initiateSettings$1", m19206f = "HomeViewModel.kt", m19207l = {187, 188, 190}, m19208m = "invokeSuspend")
final class HomeViewModel$initiateSettings$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f22796e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ HomeViewModel f22797f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeViewModel$initiateSettings$1(HomeViewModel homeViewModel, InterfaceC9968c<? super HomeViewModel$initiateSettings$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f22797f = homeViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new HomeViewModel$initiateSettings$1(this.f22797f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((HomeViewModel$initiateSettings$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0090 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        Object objM14360a;
        Object objM14360a2;
        LinkedHashMap linkedHashMapM13467T0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f22796e;
        HomeViewModel homeViewModel = this.f22797f;
        if (i10 != 0) {
            if (i10 == 1) {
                C7499b.m14977z0(obj);
                objM14360a = obj;
            } else if (i10 == 2) {
                C7499b.m14977z0(obj);
                objM14360a2 = obj;
                linkedHashMapM13467T0 = C6753d.m13467T0((Map) objM14360a2);
                linkedHashMapM13467T0.put(homeViewModel.mo498E1(), new VocabularySearchQuery(0, 0, null, 0, null, null, null, null, null, null, 1023, null));
                this.f22796e = 3;
                if (homeViewModel.f22753j.mo9694r(linkedHashMapM13467T0, this) == coroutineSingletons) {
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
        InterfaceC7116c<Map<String, VocabularySearchQuery>> interfaceC7116cMo9685i = homeViewModel.f22753j.mo9685i();
        this.f22796e = 1;
        objM14360a = FlowKt__ReduceKt.m14360a(interfaceC7116cMo9685i, this);
        if (objM14360a == coroutineSingletons) {
            return coroutineSingletons;
        }
        if (((Map) objM14360a).get(homeViewModel.mo498E1()) == null) {
            InterfaceC7116c<Map<String, VocabularySearchQuery>> interfaceC7116cMo9685i2 = homeViewModel.f22753j.mo9685i();
            this.f22796e = 2;
            objM14360a2 = FlowKt__ReduceKt.m14360a(interfaceC7116cMo9685i2, this);
            if (objM14360a2 == coroutineSingletons) {
                return coroutineSingletons;
            }
            linkedHashMapM13467T0 = C6753d.m13467T0((Map) objM14360a2);
            linkedHashMapM13467T0.put(homeViewModel.mo498E1(), new VocabularySearchQuery(0, 0, null, 0, null, null, null, null, null, null, 1023, null));
            this.f22796e = 3;
            if (homeViewModel.f22753j.mo9694r(linkedHashMapM13467T0, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return C9072e.f47360a;
    }
}
