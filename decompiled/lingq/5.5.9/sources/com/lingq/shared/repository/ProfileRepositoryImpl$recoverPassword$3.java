package com.lingq.shared.repository;

import cm.InterfaceC2057q;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.domain.Resource;
import dm.C5207g;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC7117d;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0006\u001a\u00020\u0005*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u008a@"}, m13365d2 = {"Lkotlinx/coroutines/flow/d;", "Lcom/lingq/shared/domain/Resource;", "", "", "e", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.shared.repository.ProfileRepositoryImpl$recoverPassword$3", m19206f = "ProfileRepository.kt", m19207l = {287}, m19208m = "invokeSuspend")
final class ProfileRepositoryImpl$recoverPassword$3 extends SuspendLambda implements InterfaceC2057q<InterfaceC7117d<? super Resource<? extends Integer>>, Throwable, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f20403e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ InterfaceC7117d f20404f;

    /* JADX INFO: renamed from: g */
    public /* synthetic */ Throwable f20405g;

    public ProfileRepositoryImpl$recoverPassword$3(InterfaceC9968c<? super ProfileRepositoryImpl$recoverPassword$3> interfaceC9968c) {
        super(3, interfaceC9968c);
    }

    @Override // cm.InterfaceC2057q
    /* JADX INFO: renamed from: M */
    public final Object mo1343M(InterfaceC7117d<? super Resource<? extends Integer>> interfaceC7117d, Throwable th2, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        ProfileRepositoryImpl$recoverPassword$3 profileRepositoryImpl$recoverPassword$3 = new ProfileRepositoryImpl$recoverPassword$3(interfaceC9968c);
        profileRepositoryImpl$recoverPassword$3.f20404f = interfaceC7117d;
        profileRepositoryImpl$recoverPassword$3.f20405g = th2;
        return profileRepositoryImpl$recoverPassword$3.mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f20403e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC7117d interfaceC7117d = this.f20404f;
            Throwable th2 = this.f20405g;
            Resource.C3303a c3303a = Resource.f17861d;
            C5207g.m11109d(th2, "null cannot be cast to non-null type java.lang.Exception{ kotlin.TypeAliasesKt.Exception }");
            Resource resourceM9436b = Resource.C3303a.m9436b(c3303a, (Exception) th2);
            this.f20404f = null;
            this.f20403e = 1;
            if (interfaceC7117d.mo1339r(resourceM9436b, this) == coroutineSingletons) {
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
