package com.lingq.p055ui.imports.userImport;

import ae.C0062b;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.commons.p053ui.UserImportDetailType;
import com.lingq.util.C4924a;
import dm.C5207g;
import fj.C5551l;
import km.InterfaceC6727j;
import kotlin.Metadata;
import kotlin.Triple;
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
@InterfaceC10224c(m19205c = "com.lingq.ui.imports.userImport.UserImportParentFragment$onViewCreated$3$2", m19206f = "UserImportParentFragment.kt", m19207l = {83}, m19208m = "invokeSuspend")
public final class UserImportParentFragment$onViewCreated$3$2 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f26655e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ UserImportParentFragment f26656f;

    /* JADX INFO: renamed from: com.lingq.ui.imports.userImport.UserImportParentFragment$onViewCreated$3$2$1 */
    @Metadata(m13364d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0006\u001a\u00020\u00052\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0000H\u008a@"}, m13365d2 = {"Lkotlin/Triple;", "Lcom/lingq/commons/ui/UserImportDetailType;", "", "", "<name for destructuring parameter 0>", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.imports.userImport.UserImportParentFragment$onViewCreated$3$2$1", m19206f = "UserImportParentFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C40981 extends SuspendLambda implements InterfaceC2056p<Triple<? extends UserImportDetailType, ? extends String, ? extends Boolean>, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f26657e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ UserImportParentFragment f26658f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C40981(UserImportParentFragment userImportParentFragment, InterfaceC9968c<? super C40981> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f26658f = userImportParentFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C40981 c40981 = new C40981(this.f26658f, interfaceC9968c);
            c40981.f26657e = obj;
            return c40981;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(Triple<? extends UserImportDetailType, ? extends String, ? extends Boolean> triple, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C40981) mo1336a(triple, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            Triple triple = (Triple) this.f26657e;
            UserImportDetailType userImportDetailType = (UserImportDetailType) triple.f38021a;
            String str = (String) triple.f38022b;
            boolean zBooleanValue = ((Boolean) triple.f38023c).booleanValue();
            C5207g.m11111f(str, "title");
            C5207g.m11111f(userImportDetailType, "userImportDetailType");
            C5551l c5551l = new C5551l(str, zBooleanValue, userImportDetailType);
            InterfaceC6727j<Object>[] interfaceC6727jArr = UserImportParentFragment.f26640T0;
            C4924a.m10447Z(this.f26658f.m10092v0(), c5551l);
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserImportParentFragment$onViewCreated$3$2(UserImportParentFragment userImportParentFragment, InterfaceC9968c<? super UserImportParentFragment$onViewCreated$3$2> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f26656f = userImportParentFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new UserImportParentFragment$onViewCreated$3$2(this.f26656f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((UserImportParentFragment$onViewCreated$3$2) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f26655e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            UserImportParentFragment userImportParentFragment = this.f26656f;
            InterfaceC7137r<Triple<UserImportDetailType, String, Boolean>> interfaceC7137rMo10084o1 = UserImportParentFragment.m10091u0(userImportParentFragment).mo10084o1();
            C40981 c40981 = new C40981(userImportParentFragment, null);
            this.f26655e = 1;
            if (C0062b.m369m0(interfaceC7137rMo10084o1, c40981, this) == coroutineSingletons) {
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
