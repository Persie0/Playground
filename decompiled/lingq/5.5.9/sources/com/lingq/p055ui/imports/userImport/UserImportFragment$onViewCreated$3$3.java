package com.lingq.p055ui.imports.userImport;

import ae.C0062b;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.lingq.shared.domain.Resource;
import com.lingq.util.C4924a;
import dm.C5207g;
import km.InterfaceC6727j;
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
@InterfaceC10224c(m19205c = "com.lingq.ui.imports.userImport.UserImportFragment$onViewCreated$3$3", m19206f = "UserImportFragment.kt", m19207l = {116}, m19208m = "invokeSuspend")
public final class UserImportFragment$onViewCreated$3$3 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f26602e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ UserImportFragment f26603f;

    /* JADX INFO: renamed from: com.lingq.ui.imports.userImport.UserImportFragment$onViewCreated$3$3$1 */
    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"Lcom/lingq/shared/domain/Resource$Status;", "status", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.imports.userImport.UserImportFragment$onViewCreated$3$3$1", m19206f = "UserImportFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C40901 extends SuspendLambda implements InterfaceC2056p<Resource.Status, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f26604e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ UserImportFragment f26605f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C40901(UserImportFragment userImportFragment, InterfaceC9968c<? super C40901> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f26605f = userImportFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C40901 c40901 = new C40901(this.f26605f, interfaceC9968c);
            c40901.f26604e = obj;
            return c40901;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(Resource.Status status, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C40901) mo1336a(status, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            Resource.Status status = (Resource.Status) this.f26604e;
            Resource.Status status2 = Resource.Status.LOADING;
            UserImportFragment userImportFragment = this.f26605f;
            if (status == status2) {
                InterfaceC6727j<Object>[] interfaceC6727jArr = UserImportFragment.f26580E0;
                userImportFragment.m10089p0().f44722c.m4935d();
                MaterialButton materialButton = userImportFragment.m10089p0().f44720a;
                C5207g.m11110e(materialButton, "binding.btnImport");
                C4924a.m10442U(materialButton);
            } else {
                InterfaceC6727j<Object>[] interfaceC6727jArr2 = UserImportFragment.f26580E0;
                CircularProgressIndicator circularProgressIndicator = userImportFragment.m10089p0().f44722c;
                C5207g.m11110e(circularProgressIndicator, "binding.viewProgress");
                C4924a.m10442U(circularProgressIndicator);
                MaterialButton materialButton2 = userImportFragment.m10089p0().f44720a;
                C5207g.m11110e(materialButton2, "binding.btnImport");
                C4924a.m10457e0(materialButton2);
            }
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserImportFragment$onViewCreated$3$3(UserImportFragment userImportFragment, InterfaceC9968c<? super UserImportFragment$onViewCreated$3$3> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f26603f = userImportFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new UserImportFragment$onViewCreated$3$3(this.f26603f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((UserImportFragment$onViewCreated$3$3) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f26602e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC6727j<Object>[] interfaceC6727jArr = UserImportFragment.f26580E0;
            UserImportFragment userImportFragment = this.f26603f;
            UserImportViewModel userImportViewModelM10090q0 = userImportFragment.m10090q0();
            C40901 c40901 = new C40901(userImportFragment, null);
            this.f26602e = 1;
            if (C0062b.m369m0(userImportViewModelM10090q0.f26796J, c40901, this) == coroutineSingletons) {
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
