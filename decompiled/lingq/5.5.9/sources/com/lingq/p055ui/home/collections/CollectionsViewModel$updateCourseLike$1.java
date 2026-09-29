package com.lingq.p055ui.home.collections;

import ci.InterfaceC2010c;
import cm.InterfaceC2052l;
import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.home.collections.CollectionsViewModel$updateCourseLike$1", m19206f = "CollectionsViewModel.kt", m19207l = {706}, m19208m = "invokeSuspend")
final class CollectionsViewModel$updateCourseLike$1 extends SuspendLambda implements InterfaceC2052l<InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f23415e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ CollectionsViewModel f23416f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f23417g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CollectionsViewModel$updateCourseLike$1(CollectionsViewModel collectionsViewModel, int i10, InterfaceC9968c<? super CollectionsViewModel$updateCourseLike$1> interfaceC9968c) {
        super(1, interfaceC9968c);
        this.f23416f = collectionsViewModel;
        this.f23417g = i10;
    }

    @Override // cm.InterfaceC2052l
    /* JADX INFO: renamed from: n */
    public final Object mo528n(InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((CollectionsViewModel$updateCourseLike$1) mo1353s(interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: s */
    public final InterfaceC9968c<C9072e> mo1353s(InterfaceC9968c<?> interfaceC9968c) {
        return new CollectionsViewModel$updateCourseLike$1(this.f23416f, this.f23417g, interfaceC9968c);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f23415e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            CollectionsViewModel collectionsViewModel = this.f23416f;
            InterfaceC2010c interfaceC2010c = collectionsViewModel.f23249e;
            String strMo498E1 = collectionsViewModel.mo498E1();
            this.f23415e = 1;
            if (interfaceC2010c.mo5995d(this.f23417g, strMo498E1, this) == coroutineSingletons) {
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
