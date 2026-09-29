package com.lingq.p055ui.imports.userImport;

import ae.C0062b;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
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
@InterfaceC10224c(m19205c = "com.lingq.ui.imports.userImport.UserImportParentFragment$onViewCreated$3$4", m19206f = "UserImportParentFragment.kt", m19207l = {111}, m19208m = "invokeSuspend")
public final class UserImportParentFragment$onViewCreated$3$4 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f26663e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ UserImportParentFragment f26664f;

    /* JADX INFO: renamed from: com.lingq.ui.imports.userImport.UserImportParentFragment$onViewCreated$3$4$1 */
    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.imports.userImport.UserImportParentFragment$onViewCreated$3$4$1", m19206f = "UserImportParentFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C41001 extends SuspendLambda implements InterfaceC2056p<Boolean, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ boolean f26665e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ UserImportParentFragment f26666f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C41001(UserImportParentFragment userImportParentFragment, InterfaceC9968c<? super C41001> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f26666f = userImportParentFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C41001 c41001 = new C41001(this.f26666f, interfaceC9968c);
            c41001.f26665e = ((Boolean) obj).booleanValue();
            return c41001;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(Boolean bool, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C41001) mo1336a(Boolean.valueOf(bool.booleanValue()), interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            if (this.f26665e) {
                this.f26666f.mo3766m0();
            }
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserImportParentFragment$onViewCreated$3$4(UserImportParentFragment userImportParentFragment, InterfaceC9968c<? super UserImportParentFragment$onViewCreated$3$4> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f26664f = userImportParentFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new UserImportParentFragment$onViewCreated$3$4(this.f26664f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((UserImportParentFragment$onViewCreated$3$4) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f26663e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            UserImportParentFragment userImportParentFragment = this.f26664f;
            InterfaceC7137r<Boolean> interfaceC7137rMo10082c2 = UserImportParentFragment.m10091u0(userImportParentFragment).mo10082c2();
            C41001 c41001 = new C41001(userImportParentFragment, null);
            this.f26663e = 1;
            if (C0062b.m369m0(interfaceC7137rMo10082c2, c41001, this) == coroutineSingletons) {
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
