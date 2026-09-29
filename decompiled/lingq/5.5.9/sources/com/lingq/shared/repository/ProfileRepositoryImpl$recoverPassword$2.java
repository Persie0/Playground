package com.lingq.shared.repository;

import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.domain.Resource;
import jp.C6553u;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC7117d;
import p260m8.C7499b;
import p460wh.InterfaceC9944l;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\u008a@"}, m13365d2 = {"Lkotlinx/coroutines/flow/d;", "Lcom/lingq/shared/domain/Resource;", "", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.shared.repository.ProfileRepositoryImpl$recoverPassword$2", m19206f = "ProfileRepository.kt", m19207l = {283, 284, 285}, m19208m = "invokeSuspend")
final class ProfileRepositoryImpl$recoverPassword$2 extends SuspendLambda implements InterfaceC2056p<InterfaceC7117d<? super Resource<? extends Integer>>, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f20399e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ Object f20400f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ ProfileRepositoryImpl f20401g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ String f20402h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfileRepositoryImpl$recoverPassword$2(ProfileRepositoryImpl profileRepositoryImpl, String str, InterfaceC9968c<? super ProfileRepositoryImpl$recoverPassword$2> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f20401g = profileRepositoryImpl;
        this.f20402h = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        ProfileRepositoryImpl$recoverPassword$2 profileRepositoryImpl$recoverPassword$2 = new ProfileRepositoryImpl$recoverPassword$2(this.f20401g, this.f20402h, interfaceC9968c);
        profileRepositoryImpl$recoverPassword$2.f20400f = obj;
        return profileRepositoryImpl$recoverPassword$2;
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7117d<? super Resource<? extends Integer>> interfaceC7117d, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((ProfileRepositoryImpl$recoverPassword$2) mo1336a(interfaceC7117d, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0093  */
    /* JADX WARN: Code duplicated, block: B:27:0x0095  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        InterfaceC7117d interfaceC7117d;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f20399e;
        if (i10 != 0) {
            if (i10 == 1) {
                interfaceC7117d = (InterfaceC7117d) this.f20400f;
                C7499b.m14977z0(obj);
            } else if (i10 == 2) {
                interfaceC7117d = (InterfaceC7117d) this.f20400f;
                C7499b.m14977z0(obj);
                Resource.C3303a c3303a = Resource.f17861d;
                Integer num = new Integer(((C6553u) obj).f37338a.f47566d);
                c3303a.getClass();
                Resource resourceM9437c = Resource.C3303a.m9437c(num);
                this.f20400f = null;
                this.f20399e = 3;
                if (interfaceC7117d.mo1339r(resourceM9437c, this) == coroutineSingletons) {
                }
            } else {
                if (i10 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7499b.m14977z0(obj);
            }
        }
        C7499b.m14977z0(obj);
        InterfaceC7117d interfaceC7117d2 = (InterfaceC7117d) this.f20400f;
        Resource.f17861d.getClass();
        Resource resource = new Resource(Resource.Status.LOADING, null, null);
        this.f20400f = interfaceC7117d2;
        this.f20399e = 1;
        if (interfaceC7117d2.mo1339r(resource, this) == coroutineSingletons) {
            return coroutineSingletons;
        }
        interfaceC7117d = interfaceC7117d2;
        InterfaceC9944l interfaceC9944l = this.f20401g.f20371a;
        this.f20400f = interfaceC7117d;
        this.f20399e = 2;
        obj = interfaceC9944l.m18516o(this.f20402h, this);
        if (obj == coroutineSingletons) {
            return coroutineSingletons;
        }
        Resource.C3303a c3303a2 = Resource.f17861d;
        Integer num2 = new Integer(((C6553u) obj).f37338a.f47566d);
        c3303a2.getClass();
        Resource resourceM9437c2 = Resource.C3303a.m9437c(num2);
        this.f20400f = null;
        this.f20399e = 3;
        return interfaceC7117d.mo1339r(resourceM9437c2, this) == coroutineSingletons ? coroutineSingletons : C9072e.f47360a;
    }
}
