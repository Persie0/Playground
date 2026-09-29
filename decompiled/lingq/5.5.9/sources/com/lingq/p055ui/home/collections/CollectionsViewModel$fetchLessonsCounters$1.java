package com.lingq.p055ui.home.collections;

import ci.InterfaceC2014g;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.List;
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
@InterfaceC10224c(m19205c = "com.lingq.ui.home.collections.CollectionsViewModel$fetchLessonsCounters$1", m19206f = "CollectionsViewModel.kt", m19207l = {342}, m19208m = "invokeSuspend")
final class CollectionsViewModel$fetchLessonsCounters$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f23332e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ CollectionsViewModel f23333f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ List<Integer> f23334g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CollectionsViewModel$fetchLessonsCounters$1(CollectionsViewModel collectionsViewModel, List<Integer> list, InterfaceC9968c<? super CollectionsViewModel$fetchLessonsCounters$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f23333f = collectionsViewModel;
        this.f23334g = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new CollectionsViewModel$fetchLessonsCounters$1(this.f23333f, this.f23334g, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((CollectionsViewModel$fetchLessonsCounters$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f23332e;
        try {
            if (i10 == 0) {
                C7499b.m14977z0(obj);
                CollectionsViewModel collectionsViewModel = this.f23333f;
                InterfaceC2014g interfaceC2014g = collectionsViewModel.f23251f;
                String strMo498E1 = collectionsViewModel.mo498E1();
                List<Integer> list = this.f23334g;
                this.f23332e = 1;
                if (interfaceC2014g.mo6061g(strMo498E1, list, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7499b.m14977z0(obj);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        return C9072e.f47360a;
    }
}
