package com.lingq.p055ui.imports.userImport;

import ae.C0062b;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.commons.p053ui.UserImportDetailType;
import com.lingq.util.C4924a;
import dm.C5207g;
import fj.C5550k;
import km.InterfaceC6727j;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC7137r;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.imports.userImport.UserImportParentFragment$onViewCreated$3$1", m19206f = "UserImportParentFragment.kt", m19207l = {76}, m19208m = "invokeSuspend")
public final class UserImportParentFragment$onViewCreated$3$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f26651e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ UserImportParentFragment f26652f;

    /* JADX INFO: renamed from: com.lingq.ui.imports.userImport.UserImportParentFragment$onViewCreated$3$1$1 */
    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"Lcom/lingq/commons/ui/UserImportDetailType;", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.imports.userImport.UserImportParentFragment$onViewCreated$3$1$1", m19206f = "UserImportParentFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C40971 extends SuspendLambda implements InterfaceC2056p<UserImportDetailType, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f26653e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ UserImportParentFragment f26654f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C40971(UserImportParentFragment userImportParentFragment, InterfaceC9968c<? super C40971> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f26654f = userImportParentFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C40971 c40971 = new C40971(this.f26654f, interfaceC9968c);
            c40971.f26653e = obj;
            return c40971;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(UserImportDetailType userImportDetailType, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C40971) mo1336a(userImportDetailType, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            UserImportDetailType userImportDetailType = (UserImportDetailType) this.f26653e;
            C5207g.m11111f(userImportDetailType, "userImportDetailType");
            C5550k c5550k = new C5550k(userImportDetailType);
            InterfaceC6727j<Object>[] interfaceC6727jArr = UserImportParentFragment.f26640T0;
            C4924a.m10447Z(this.f26654f.m10092v0(), c5550k);
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserImportParentFragment$onViewCreated$3$1(UserImportParentFragment userImportParentFragment, InterfaceC9968c<? super UserImportParentFragment$onViewCreated$3$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f26652f = userImportParentFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new UserImportParentFragment$onViewCreated$3$1(this.f26652f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((UserImportParentFragment$onViewCreated$3$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f26651e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            UserImportParentFragment userImportParentFragment = this.f26652f;
            InterfaceC7137r<UserImportDetailType> interfaceC7137rMo10075C = UserImportParentFragment.m10091u0(userImportParentFragment).mo10075C();
            C40971 c40971 = new C40971(userImportParentFragment, null);
            this.f26651e = 1;
            if (C0062b.m369m0(interfaceC7137rMo10075C, c40971, this) == coroutineSingletons) {
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
